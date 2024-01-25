import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bja", name = "p", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!bja", name = "x", descriptor = "[S")
	public static final short[] aShortArray22 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!bja", name = "z", descriptor = "[S")
	private static final short[] aShortArray23 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bja", name = "q", descriptor = "[S")
	private static final short[] aShortArray21 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bja", name = "n", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray22, aShortArray23, aShortArray21 };

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(IFIIFIF[FI[FIIII)V")
	public static void method1556(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(5) int local5 = arg10 - arg9;
		@Pc(9) int local9 = arg0 - arg3;
		@Pc(13) int local13 = arg12 - arg11;
		@Pc(38) float local38 = (float) local5 * arg6[2] + (float) local13 * arg6[0] + (float) local9 * arg6[1];
		@Pc(64) float local64 = (float) local13 * arg6[3] + arg6[4] * (float) local9 + (float) local5 * arg6[5];
		@Pc(85) float local85 = arg6[8] * (float) local5 + (float) local9 * arg6[7] + (float) local13 * arg6[6];
		@Pc(106) float local106;
		@Pc(113) float local113;
		if (arg7 == 0) {
			local113 = arg1 + 0.5F - local85;
			local106 = local38 + arg4 + 0.5F;
		} else if (arg7 == 1) {
			local106 = local38 + arg4 + 0.5F;
			local113 = local85 + arg1 + 0.5F;
		} else if (arg7 == 2) {
			local113 = arg5 + 0.5F - local64;
			local106 = arg4 + 0.5F - local38;
		} else if (arg7 == 3) {
			local106 = local38 + arg4 + 0.5F;
			local113 = arg5 + 0.5F - local64;
		} else if (arg7 == 4) {
			local113 = arg5 + 0.5F - local64;
			local106 = local85 + arg1 + 0.5F;
		} else {
			local106 = arg1 + 0.5F - local85;
			local113 = arg5 + 0.5F - local64;
		}
		@Pc(217) float local217;
		if (arg2 == 1) {
			local217 = local106;
			local106 = -local113;
			local113 = local217;
		} else if (arg2 == 2) {
			local106 = -local106;
			local113 = -local113;
		} else if (arg2 == 3) {
			local217 = local106;
			local106 = local113;
			local113 = -local217;
		}
		arg8[0] = local106;
		arg8[1] = local113;
	}

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "(II)Z")
	public static boolean method1557(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1558(@OriginalArg(1) String arg0) {
		return Static236.aHashtable6.containsKey(arg0);
	}
}
