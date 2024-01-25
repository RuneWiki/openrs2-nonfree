import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static670 {

	@OriginalMember(owner = "client!vda", name = "H", descriptor = "I")
	public static int anInt10425;

	@OriginalMember(owner = "client!vda", name = "I", descriptor = "I")
	public static int anInt10429 = 0;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIZIFIIII[F[F)V")
	public static void method9140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) float[] arg9) {
		@Pc(5) int local5 = arg0 - arg5;
		@Pc(13) int local13 = arg2 - arg1;
		@Pc(17) int local17 = arg7 - arg4;
		@Pc(38) float local38 = arg8[2] * (float) local13 + (float) local5 * arg8[1] + (float) local17 * arg8[0];
		@Pc(59) float local59 = arg8[5] * (float) local13 + (float) local5 * arg8[4] + arg8[3] * (float) local17;
		@Pc(80) float local80 = (float) local17 * arg8[6] + (float) local5 * arg8[7] + arg8[8] * (float) local13;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg3 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(144) float local144;
		if (arg6 == 1) {
			local144 = local106;
			local106 = -local119;
			local119 = local144;
		} else if (arg6 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg6 == 3) {
			local144 = local106;
			local106 = local119;
			local119 = -local144;
		}
		arg9[0] = local106;
		arg9[1] = local119;
	}
}
