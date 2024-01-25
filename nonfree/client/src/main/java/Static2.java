import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!fo;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Lclient!gb;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_1 = new Class102(64);

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "[I")
	public static final int[] anIntArray2 = new int[4096];

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "[I")
	public static final int[] anIntArray3 = new int[14];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZFIIFFIIII[FII)V")
	public static void method37(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg11 - arg8;
		@Pc(18) int local18 = arg1 - arg7;
		@Pc(22) int local22 = arg5 - arg2;
		@Pc(43) float local43 = (float) local18 * arg9[0] + (float) local22 * arg9[1] + arg9[2] * (float) local5;
		@Pc(64) float local64 = (float) local5 * arg9[5] + (float) local18 * arg9[3] + arg9[4] * (float) local22;
		@Pc(85) float local85 = arg9[8] * (float) local5 + (float) local22 * arg9[7] + arg9[6] * (float) local18;
		@Pc(103) float local103;
		@Pc(97) float local97;
		if (arg10 == 0) {
			local97 = arg4 + 0.5F - local85;
			local103 = local43 + arg3 + 0.5F;
		} else if (arg10 == 1) {
			local103 = local43 + arg3 + 0.5F;
			local97 = arg4 + local85 + 0.5F;
		} else if (arg10 == 2) {
			local97 = arg0 + 0.5F - local64;
			local103 = arg3 + 0.5F - local43;
		} else if (arg10 == 3) {
			local103 = arg3 + local43 + 0.5F;
			local97 = arg0 + 0.5F - local64;
		} else if (arg10 == 4) {
			local103 = local85 + arg4 + 0.5F;
			local97 = arg0 + 0.5F - local64;
		} else {
			local103 = arg4 + 0.5F - local85;
			local97 = arg0 + 0.5F - local64;
		}
		@Pc(196) float local196;
		if (arg6 == 1) {
			local196 = local103;
			local103 = -local97;
			local97 = local196;
		} else if (arg6 == 2) {
			local103 = -local103;
			local97 = -local97;
		} else if (arg6 == 3) {
			local196 = local103;
			local103 = local97;
			local97 = -local196;
		}
		Static194.aFloat106 = local103;
		Static11.aFloat5 = local97;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[II)V")
	public static void method38(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(12) int local12 = arg0 - 1;
		@Pc(16) int local16 = local12 - 7;
		while (local16 > arg3) {
			@Pc(20) int local20 = arg3 + 1;
			arg2[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg1;
			@Pc(50) int local50 = local45 + 1;
			arg2[local50] = arg1;
			arg3 = local50 + 1;
			arg2[arg3] = arg1;
		}
		while (arg3 < local12) {
			arg3++;
			arg2[arg3] = arg1;
		}
	}
}
