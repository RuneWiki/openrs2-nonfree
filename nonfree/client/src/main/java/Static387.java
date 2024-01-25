import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
	public static int anInt5983 = 0;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IFBI[FIII[FII)V")
	public static void method5219(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg5 - arg4;
		@Pc(17) int local17 = arg0 - arg9;
		@Pc(21) int local21 = arg6 - arg8;
		@Pc(46) float local46 = arg3[1] * (float) local21 + arg3[0] * (float) local5 + arg3[2] * (float) local17;
		@Pc(67) float local67 = arg3[4] * (float) local21 + (float) local5 * arg3[3] + arg3[5] * (float) local17;
		@Pc(88) float local88 = (float) local5 * arg3[6] + arg3[7] * (float) local21 + arg3[8] * (float) local17;
		@Pc(103) float local103 = (float) Math.sqrt((double) (local88 * local88 + local46 * local46 + local67 * local67));
		@Pc(114) float local114 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		@Pc(127) float local127 = (float) Math.asin((double) (local67 / local103)) / 3.1415927F + arg1 + 0.5F;
		@Pc(132) float local132;
		if (arg2 == 1) {
			local132 = local114;
			local114 = -local127;
			local127 = local132;
		} else if (arg2 == 2) {
			local127 = -local127;
			local114 = -local114;
		} else if (arg2 == 3) {
			local132 = local114;
			local114 = local127;
			local127 = -local132;
		}
		arg7[1] = local127;
		arg7[0] = local114;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)V")
	public static void method5220() {
		Static164.aClass307_40.method6995(5);
	}
}
