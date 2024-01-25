import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static207 {

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
	public static int[] anIntArray357;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	public static int anInt4120 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3793(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg4) {
			Static192.method3651(arg6, arg3, arg0, arg1, arg5, arg4);
		} else if (arg5 - arg4 >= Static6.anInt136 && Static275.anInt5244 >= arg4 + arg5 && Static32.anInt750 <= arg0 - arg2 && arg2 + arg0 <= Static112.anInt2485) {
			Static258.method4428(arg3, arg1, arg4, arg2, arg0, arg6, arg5);
		} else {
			Static296.method5067(arg2, arg3, arg6, arg1, arg0, arg4, arg5);
		}
	}
}
