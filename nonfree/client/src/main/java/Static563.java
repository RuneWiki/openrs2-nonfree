import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static563 {

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "[I")
	public static final int[] anIntArray598 = new int[5];

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "[I")
	public static final int[] anIntArray599 = new int[8];

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIZIIII)V")
	public static void method7367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == arg5) {
			Static187.method7142(arg3, arg5, arg0, arg1, arg2, arg6);
		} else if (Static130.anInt2131 <= arg1 - arg5 && arg1 + arg5 <= Static89.anInt1576 && Static275.anInt4756 <= arg6 - arg4 && arg4 + arg6 <= Static48.anInt898) {
			Static498.method6449(arg3, arg0, arg6, arg2, arg4, arg1, arg5);
		} else {
			Static241.method3442(arg0, arg5, arg2, arg3, arg1, arg6, arg4);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Z")
	public static boolean method7369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
