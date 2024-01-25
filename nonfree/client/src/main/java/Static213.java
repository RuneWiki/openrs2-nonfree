import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!gj", name = "V", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_35 = new Class286(62, -1);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII[FFIII[FI)V")
	public static void method3322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg0 - arg5;
		@Pc(13) int local13 = arg7 - arg6;
		@Pc(17) int local17 = arg9 - arg2;
		@Pc(38) float local38 = arg8[1] * (float) local17 + (float) local9 * arg8[0] + arg8[2] * (float) local13;
		@Pc(59) float local59 = (float) local9 * arg8[3] + arg8[4] * (float) local17 + (float) local13 * arg8[5];
		@Pc(80) float local80 = (float) local17 * arg8[7] + arg8[6] * (float) local9 + arg8[8] * (float) local13;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(126) float local126 = arg4 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(145) float local145;
		if (arg1 == 1) {
			local145 = local106;
			local106 = -local126;
			local126 = local145;
		} else if (arg1 == 2) {
			local106 = -local106;
			local126 = -local126;
		} else if (arg1 == 3) {
			local145 = local106;
			local106 = local126;
			local126 = -local145;
		}
		arg3[0] = local106;
		arg3[1] = local126;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
