import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static217 {

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	public static int anInt6837 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method5716(@OriginalArg(1) int arg0) {
		Static13.anInt346 = 3;
		Static276.anInt5510 = arg0;
		Static277.anInt5533 = 100;
		Static309.anInt6134 = -1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V")
	public static void method5719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg2) {
			Static119.method2093(arg0, arg3, arg4, arg1);
		} else if (Static19.anInt533 <= arg1 - arg4 && Static4.anInt75 >= arg1 + arg4 && Static236.anInt4721 <= arg3 - arg2 && Static73.anInt1425 >= arg2 + arg3) {
			Static224.method3903(arg3, arg4, arg0, arg1, arg2);
		} else {
			Static196.method3452(arg1, arg4, arg2, arg0, arg3);
		}
	}
}
