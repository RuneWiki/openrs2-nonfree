import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static669 {

	@OriginalMember(owner = "client!wn", name = "z", descriptor = "[I")
	public static final int[] anIntArray823 = new int[4096];

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIBIIIII)V")
	public static void method9259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg1) {
			Static313.method7480(arg6, arg5, arg2, arg3, arg4, arg0);
		} else if (Static313.anInt9045 <= arg2 - arg6 && arg6 + arg2 <= Static575.anInt9879 && Static468.anInt355 <= arg4 - arg1 && Static370.anInt10475 >= arg1 + arg4) {
			Static53.method1114(arg1, arg6, arg5, arg3, arg2, arg0, arg4);
		} else {
			Static382.method5683(arg6, arg2, arg1, arg0, arg4, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V")
	public static void method9260() {
		Static26.method487(255, -1);
	}
}
