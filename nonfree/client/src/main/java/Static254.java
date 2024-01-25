import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_172 = new Class184(54, 8);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIBI[FIIIFI)V")
	public static void method3872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg0 - arg8;
		@Pc(11) int local11 = arg6 - arg5;
		@Pc(15) int local15 = arg1 - arg4;
		@Pc(36) float local36 = arg3[2] * (float) local3 + (float) local11 * arg3[1] + arg3[0] * (float) local15;
		@Pc(57) float local57 = (float) local3 * arg3[5] + (float) local15 * arg3[3] + arg3[4] * (float) local11;
		@Pc(86) float local86 = (float) local3 * arg3[8] + arg3[6] * (float) local15 + (float) local11 * arg3[7];
		@Pc(101) float local101 = (float) Math.sqrt((double) (local86 * local86 + local36 * local36 + local57 * local57));
		@Pc(112) float local112 = (float) Math.atan2((double) local36, (double) local86) / 6.2831855F + 0.5F;
		@Pc(125) float local125 = (float) Math.asin((double) (local57 / local101)) / 3.1415927F + arg7 + 0.5F;
		@Pc(145) float local145;
		if (arg2 == 1) {
			local145 = local112;
			local112 = -local125;
			local125 = local145;
		} else if (arg2 == 2) {
			local125 = -local125;
			local112 = -local112;
		} else if (arg2 == 3) {
			local145 = local112;
			local112 = local125;
			local125 = -local145;
		}
		Static314.aFloat70 = local112;
		Static442.aFloat99 = local125;
	}
}
