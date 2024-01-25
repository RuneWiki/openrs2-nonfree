import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_265 = new Class123(34, 15);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[FFIIIII)V")
	public static void method4202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg7 - arg0;
		@Pc(9) int local9 = arg5 - arg1;
		@Pc(17) int local17 = arg6 - arg8;
		@Pc(46) float local46 = (float) local9 * arg3[2] + (float) local5 * arg3[0] + (float) local17 * arg3[1];
		@Pc(67) float local67 = (float) local9 * arg3[5] + arg3[4] * (float) local17 + arg3[3] * (float) local5;
		@Pc(88) float local88 = arg3[7] * (float) local17 + arg3[6] * (float) local5 + (float) local9 * arg3[8];
		@Pc(103) float local103 = (float) Math.sqrt((double) (local88 * local88 + local46 * local46 + local67 * local67));
		@Pc(114) float local114 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		@Pc(127) float local127 = (float) Math.asin((double) (local67 / local103)) / 3.1415927F + arg4 + 0.5F;
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
		Static71.aFloat15 = local114;
		Static321.aFloat60 = local127;
	}
}
