import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
	public static int anInt3699;

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
	public static int anInt3701;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	public static void method3217() {
		Static531.aFont1 = null;
		Static522.anImage3 = null;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIFI[FIIII)V")
	public static void method3218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg1 - arg7;
		@Pc(13) int local13 = arg0 - arg2;
		@Pc(17) int local17 = arg6 - arg4;
		@Pc(38) float local38 = arg5[2] * (float) local13 + (float) local9 * arg5[1] + arg5[0] * (float) local17;
		@Pc(59) float local59 = arg5[5] * (float) local13 + arg5[4] * (float) local9 + (float) local17 * arg5[3];
		@Pc(80) float local80 = arg5[8] * (float) local13 + arg5[6] * (float) local17 + (float) local9 * arg5[7];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg3 + 0.5F;
		@Pc(138) float local138;
		if (arg8 == 1) {
			local138 = local106;
			local106 = -local119;
			local119 = local138;
		} else if (arg8 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg8 == 3) {
			local138 = local106;
			local106 = local119;
			local119 = -local138;
		}
		Static169.aFloat161 = local119;
		Static499.aFloat349 = local106;
	}
}
