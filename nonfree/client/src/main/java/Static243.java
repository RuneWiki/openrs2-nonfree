import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "Z")
	public static boolean aBoolean301;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "Z")
	public static boolean aBoolean302 = false;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)I")
	public static int method3464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(III)Z")
	public static boolean method3465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static582.method7551(arg0, arg1) & Static343.method5006(arg1, arg0);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIII)V")
	public static void method3466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= Static130.anInt2131 && arg2 <= Static89.anInt1576 && Static275.anInt4756 <= arg0 && Static48.anInt898 >= arg1) {
			Static40.method688(arg1, arg2, arg0, arg3, arg4);
		} else {
			Static81.method7181(arg0, arg1, arg4, arg2, arg3);
		}
	}
}
