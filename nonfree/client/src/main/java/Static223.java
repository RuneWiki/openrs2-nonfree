import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static223 {

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_61 = new Class218(20, 8);

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "[J")
	public static final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_62 = new Class218(69, 3);

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "[I")
	public static final int[] anIntArray290 = new int[14];

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
	public static int anInt5090 = 0;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z")
	public static boolean method4291(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIBIIIIIIII)V")
	public static void method4293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static263.method4883(arg0)) {
			return;
		}
		if (Static42.aClass108ArrayArray1[arg0] == null) {
			Static71.method1833(Static85.aClass108ArrayArray2[arg0], -1, arg1, arg3, arg10, arg6, arg9, arg8, arg5, arg4, arg2, arg7);
		} else {
			Static71.method1833(Static42.aClass108ArrayArray1[arg0], -1, arg1, arg3, arg10, arg6, arg9, arg8, arg5, arg4, arg2, arg7);
		}
	}
}
