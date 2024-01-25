import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mu", name = "V", descriptor = "Lclient!bfa;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!mu", name = "X", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_65 = new Class303(79, -1);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIFI[FFIIIII)V")
	public static void method5072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(5) int local5 = arg1 - arg0;
		@Pc(9) int local9 = arg3 - arg9;
		@Pc(17) int local17 = arg7 - arg8;
		@Pc(38) float local38 = (float) local17 * arg4[1] + (float) local5 * arg4[0] + (float) local9 * arg4[2];
		@Pc(59) float local59 = (float) local9 * arg4[5] + (float) local17 * arg4[4] + arg4[3] * (float) local5;
		@Pc(84) float local84 = (float) local5 * arg4[6] + arg4[7] * (float) local17 + (float) local9 * arg4[8];
		@Pc(95) float local95 = (float) Math.atan2((double) local38, (double) local84) / 6.2831855F + 0.5F;
		if (arg2 != 1.0F) {
			local95 *= arg2;
		}
		@Pc(109) float local109 = arg5 + local59 + 0.5F;
		@Pc(116) float local116;
		if (arg6 == 1) {
			local116 = local95;
			local95 = -local109;
			local109 = local116;
		} else if (arg6 == 2) {
			local109 = -local109;
			local95 = -local95;
		} else if (arg6 == 3) {
			local116 = local95;
			local95 = local109;
			local109 = -local116;
		}
		Static346.aFloat137 = local109;
		Static497.aFloat152 = local95;
	}
}
