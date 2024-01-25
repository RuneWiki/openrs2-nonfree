import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static156 {

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)V")
	public static void method2873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 - arg4 >= Static325.anInt6148 && arg3 + arg4 <= Static119.anInt2469 && arg5 - arg4 >= Static94.anInt2057 && arg4 + arg5 <= Static187.anInt3872) {
			Static200.method3759(arg5, arg1, arg0, arg2, arg4, arg3);
		} else {
			Static66.method1651(arg5, arg2, arg1, arg4, arg0, arg3);
		}
	}
}
