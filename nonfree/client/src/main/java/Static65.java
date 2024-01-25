import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static65 {

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
	public static final int[] anIntArray91 = new int[8];

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
	public static final int[] anIntArray92 = new int[14];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!ha;II)V")
	public static void method1432(@OriginalArg(1) Class33 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static258.aClass113ArrayArray1 = new Class113[arg2][arg1];
		Static449.aClass33_11 = arg0;
		if (Static340.anIntArray412 != null) {
			Static198.aClass68_2 = Static101.method2026(Static340.anIntArray412[0], Static340.anIntArray412[3], Static340.anIntArray412[5], Static340.anIntArray412[2], Static340.anIntArray412[1], Static340.anIntArray412[4]);
		}
		Static521.aClass113_1 = new Class113();
		Static208.method3121();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIBI)Z")
	public static boolean method1433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 + arg3 > arg7 && arg1 + arg7 > arg3) {
			return arg0 < arg6 + arg2 && arg4 + arg0 > arg6;
		} else {
			return false;
		}
	}
}
