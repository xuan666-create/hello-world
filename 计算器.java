import java.util.Scanner;

public class 计算器 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int i=scanner.nextInt();
        scanner.nextInt();
        System.out.print("请选择操作：");
        System.out.print("1:加2:减3：乘4：平方5:除");
        int j = scanner.nextInt();
        System.out.print("请输入第二个数字：");
        int z = scanner.nextInt();
        while (j == 4 && z == 0) {
            System.out.print("除数不能为0，请重新输入第二个数字；");
            z = scanner.nextInt();
        }
        int result = 0;
        int r = 0;
        switch (j) {
            case 1:
                result = i + z;
                break;
            case 2:
                result = i - z;
                break;
            case 3:
                result = i * z;
                break;
            case 4:
                result = i * i;
                break;
            case 5:
                result = i / z;
                r = i % z;
                break;
            default:
                break;
        }if (r > 0) {
            System.out.println("计算结果是：“+ result+, 余数为:" + r);
        } else {
            System.out.println("计算结果是：" + result);

            scanner.close();


        }
    }

}



