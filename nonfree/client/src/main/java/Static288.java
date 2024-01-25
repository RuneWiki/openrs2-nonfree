import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "Lclient!sq;")
	public static final Class273 aClass273_6 = new Class273();

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	public static void method4837() {
		if (Static422.anInt7461 != -1) {
			Static272.method4490(-1, -1, false, Static422.anInt7461);
			Static422.anInt7461 = -1;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([FIIIIIFFIII)V")
	public static void method4838(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg7 - arg8;
		@Pc(9) int local9 = arg2 - arg3;
		@Pc(17) int local17 = arg1 - arg9;
		@Pc(38) float local38 = arg0[1] * (float) local5 + (float) local17 * arg0[0] + arg0[2] * (float) local9;
		@Pc(59) float local59 = (float) local5 * arg0[4] + (float) local17 * arg0[3] + (float) local9 * arg0[5];
		@Pc(80) float local80 = (float) local5 * arg0[7] + (float) local17 * arg0[6] + (float) local9 * arg0[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local91 *= arg5;
		}
		@Pc(110) float local110 = local59 + arg6 + 0.5F;
		@Pc(133) float local133;
		if (arg4 == 1) {
			local133 = local91;
			local91 = -local110;
			local110 = local133;
		} else if (arg4 == 2) {
			local91 = -local91;
			local110 = -local110;
		} else if (arg4 == 3) {
			local133 = local91;
			local91 = local110;
			local110 = -local133;
		}
		Static211.aFloat174 = local91;
		Static254.aFloat366 = local110;
	}
}
