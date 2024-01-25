import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static591 {

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	public static int anInt6375;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!l;")
	public static Class184 aClass184_4;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Z")
	public static boolean aBoolean480 = false;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg6) {
			Static149.method3399(arg2, arg6, arg4, arg5, arg3, arg1);
		} else if (Static161.anInt7734 <= arg1 - arg6 && arg6 + arg1 <= Static38.anInt823 && arg5 - arg0 >= Static380.anInt7421 && arg0 + arg5 <= Static237.anInt5159) {
			Static428.method5143(arg0, arg3, arg6, arg2, arg1, arg5, arg4);
		} else {
			Static538.method9149(arg6, arg1, arg5, arg0, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
	public static void method5435() {
		Static295.method5277();
	}
}
