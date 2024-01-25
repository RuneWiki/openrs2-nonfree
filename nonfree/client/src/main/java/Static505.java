import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IFI[FIIIIII)V")
	public static void method6969(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg0 - arg4;
		@Pc(9) int local9 = arg8 - arg2;
		@Pc(17) int local17 = arg5 - arg7;
		@Pc(38) float local38 = (float) local5 * arg3[2] + (float) local9 * arg3[0] + arg3[1] * (float) local17;
		@Pc(59) float local59 = arg3[4] * (float) local17 + arg3[3] * (float) local9 + arg3[5] * (float) local5;
		@Pc(80) float local80 = (float) local9 * arg3[6] + arg3[7] * (float) local17 + (float) local5 * arg3[8];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg1 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(140) float local140;
		if (arg6 == 1) {
			local140 = local106;
			local106 = -local119;
			local119 = local140;
		} else if (arg6 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg6 == 3) {
			local140 = local106;
			local106 = local119;
			local119 = -local140;
		}
		Static385.aFloat161 = local119;
		Static111.aFloat30 = local106;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!iv;B)I")
	public static int method6971(@OriginalArg(0) Class150 arg0) {
		if (Static393.aClass150_6 == arg0) {
			return 5890;
		} else if (Static412.aClass150_8 == arg0) {
			return 34167;
		} else if (Static422.aClass150_7 == arg0) {
			return 34168;
		} else if (Static20.aClass150_1 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
