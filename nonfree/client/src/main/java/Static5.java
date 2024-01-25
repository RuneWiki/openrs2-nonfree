import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "ub", descriptor = "I")
	public static int anInt146;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIBIIII)V")
	public static void method367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg3) {
			Static156.method2873(arg2, arg4, arg5, arg6, arg1, arg0);
		} else if (arg6 - arg1 >= Static325.anInt6148 && arg1 + arg6 <= Static119.anInt2469 && Static94.anInt2057 <= arg0 - arg3 && Static187.anInt3872 >= arg3 + arg0) {
			Static309.method5383(arg0, arg2, arg1, arg3, arg4, arg6, arg5);
		} else {
			Static527.method8054(arg4, arg2, arg0, arg6, arg5, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "(I)V")
	public static void method368() {
		Static216.method3997(Static454.aClass252_120);
		Static259.aClass1_Sub17_Sub2_1.method4473(Static418.anInt6721);
	}
}
