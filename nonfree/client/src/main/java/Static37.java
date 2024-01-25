import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bh", name = "qb", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_1 = new Class101(15, 0, 1, 0);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIFBI[F)V")
	public static void method515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8) {
		@Pc(9) int local9 = arg4 - arg7;
		@Pc(13) int local13 = arg5 - arg3;
		@Pc(17) int local17 = arg0 - arg1;
		@Pc(38) float local38 = (float) local13 * arg8[0] + arg8[1] * (float) local9 + (float) local17 * arg8[2];
		@Pc(59) float local59 = arg8[3] * (float) local13 + (float) local9 * arg8[4] + arg8[5] * (float) local17;
		@Pc(80) float local80 = arg8[7] * (float) local9 + arg8[6] * (float) local13 + arg8[8] * (float) local17;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg6 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(126) float local126;
		if (arg2 == 1) {
			local126 = local106;
			local106 = -local119;
			local119 = local126;
		} else if (arg2 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg2 == 3) {
			local126 = local106;
			local106 = local119;
			local119 = -local126;
		}
		Static111.aFloat30 = local106;
		Static88.aFloat18 = local119;
	}
}
