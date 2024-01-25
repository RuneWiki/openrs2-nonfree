import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static319 {

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "F")
	public static float aFloat173;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_141 = new Class81(43, -2);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Z")
	public static boolean method4563(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 == arg4) {
			Static453.method6085(arg5, arg1, arg4, arg0, arg6, arg3);
		} else if (arg5 - arg4 >= Static331.anInt5894 && Static351.anInt6176 >= arg4 + arg5 && arg3 - arg2 >= Static75.anInt1858 && Static175.anInt3399 >= arg2 + arg3) {
			Static166.method2610(arg1, arg5, arg6, arg2, arg3, arg0, arg4);
		} else {
			Static300.method4358(arg5, arg3, arg2, arg6, arg1, arg4, arg0);
		}
	}
}
