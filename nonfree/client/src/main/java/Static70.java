import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "[I")
	public static int[] anIntArray375 = new int[14];

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	public static int anInt4107 = -1;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Z")
	public static boolean aBoolean273 = false;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method3352(@OriginalArg(2) int arg0) {
		return arg0 >= 0 ? Static106.method1730(arg0) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIZIIZII[[FI[[FLclient!gj;[[I[[II[Z[[F[IBZII)V")
	public static void method3354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float[][] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) Class4_Sub14 arg10, @OriginalArg(12) int[][] arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) boolean[] arg14, @OriginalArg(16) float[][] arg15, @OriginalArg(17) int[] arg16, @OriginalArg(18) byte arg17, @OriginalArg(19) boolean arg18, @OriginalArg(20) int arg19, @OriginalArg(21) int arg20) {
		@Pc(15) int local15 = (arg7 << 8) + (arg18 ? 255 : 0);
		@Pc(25) int local25 = (arg6 << 8) + (arg0 ? 255 : 0);
		@Pc(36) int local36 = (arg20 << 8) + (arg5 ? 255 : 0);
		@Pc(46) int local46 = (arg2 ? 255 : 0) + (arg4 << 8);
		@Pc(52) int[] local52 = new int[arg16.length / 2];
		for (@Pc(54) int local54 = 0; local54 < local52.length; local54++) {
			@Pc(64) int local64 = arg16[local54 + local54];
			@Pc(77) int[][] local77 = arg12 == null || arg14 == null || !arg14[local54] ? arg11 : arg12;
			@Pc(85) int local85 = arg16[local54 + local54 + 1];
			local52[local54] = Static255.method3848(local25, arg15, local36, arg1, arg10, local64, arg13, local77, local46, arg8, false, (float) arg3, arg9, local15, arg12, local85, arg17);
		}
		arg10.method1451(arg19, arg1, arg13, local52, null, false);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V")
	public static void method3358() {
		Static65.aClass33_10.method838(50);
		Static269.aClass33_39.method838(50);
		Static102.aClass33_16.method838(50);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public static void method3360() {
		anIntArray375 = null;
	}
}
