public class whileloop {
    public static void main(String[] args) {
        int[] numbers = {34, 12, 657, 335, 778, 24, 300, 900, 450, 100};

        int x = 0;
        while (x < numbers.length - 1) {
            int diff = numbers[x + 1] - numbers[x];
            if (diff < 0) {
                diff = -diff;
            }

            System.out.println("Difference between " + numbers[x] + " and " + numbers[x + 1] + " = " + diff);

            if (diff > 500) {
                System.out.println("Stopping: difference > 500");
                break;
            }
            x++;
        }
    }
}