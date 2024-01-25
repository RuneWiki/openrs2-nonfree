import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "F")
	public static float aFloat132;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(FFI[FIBIIIII)V")
	public static void method4830(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg7 - arg2;
		@Pc(13) int local13 = arg8 - arg6;
		@Pc(17) int local17 = arg4 - arg5;
		@Pc(38) float local38 = (float) local9 * arg3[1] + (float) local17 * arg3[0] + arg3[2] * (float) local13;
		@Pc(74) float local74 = (float) local13 * arg3[5] + arg3[4] * (float) local9 + arg3[3] * (float) local17;
		@Pc(95) float local95 = (float) local13 * arg3[8] + (float) local17 * arg3[6] + (float) local9 * arg3[7];
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local95) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local106 *= arg0;
		}
		@Pc(120) float local120 = arg1 + local74 + 0.5F;
		@Pc(127) float local127;
		if (arg9 == 1) {
			local127 = local106;
			local106 = -local120;
			local120 = local127;
		} else if (arg9 == 2) {
			local106 = -local106;
			local120 = -local120;
		} else if (arg9 == 3) {
			local127 = local106;
			local106 = local120;
			local120 = -local127;
		}
		Static595.aFloat212 = local120;
		Static9.aFloat2 = local106;
	}
}
