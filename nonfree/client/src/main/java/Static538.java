import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!sh", name = "B", descriptor = "Lclient!cb;")
	public static Class50 aClass50_156;

	@OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
	public static int anInt8846 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(FIIII[FIFII[FI)V")
	public static void method7457(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg2 - arg4;
		@Pc(9) int local9 = arg6 - arg8;
		@Pc(17) int local17 = arg3 - arg10;
		@Pc(38) float local38 = arg5[2] * (float) local17 + arg5[1] * (float) local5 + arg5[0] * (float) local9;
		@Pc(59) float local59 = (float) local17 * arg5[5] + (float) local5 * arg5[4] + (float) local9 * arg5[3];
		@Pc(80) float local80 = (float) local17 * arg5[8] + (float) local5 * arg5[7] + arg5[6] * (float) local9;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local91 *= arg0;
		}
		@Pc(105) float local105 = local59 + arg7 + 0.5F;
		@Pc(110) float local110;
		if (arg1 == 1) {
			local110 = local91;
			local91 = -local105;
			local105 = local110;
		} else if (arg1 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg1 == 3) {
			local110 = local91;
			local91 = local105;
			local105 = -local110;
		}
		arg9[0] = local91;
		arg9[1] = local105;
	}
}
