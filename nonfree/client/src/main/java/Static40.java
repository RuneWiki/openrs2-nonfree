import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bga", name = "f", descriptor = "Lclient!faa;")
	public static Class99 aClass99_1;

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "[I")
	public static final int[] anIntArray31 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "Lclient!mf;")
	public static final Class214 aClass214_2 = new Class214();

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "I")
	public static int anInt1244 = 0;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(BIIII)I")
	public static int method1068(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class262.anIntArray421[arg3 * 8192 / arg1] >> 1;
		return (arg0 * (65536 - local24) >> 16) + (arg2 * local24 >> 16);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "([FIFIIIFIIII)V")
	public static void method1069(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg1 - arg4;
		@Pc(13) int local13 = arg7 - arg9;
		@Pc(17) int local17 = arg3 - arg8;
		@Pc(38) float local38 = (float) local9 * arg0[2] + arg0[0] * (float) local17 + arg0[1] * (float) local13;
		@Pc(59) float local59 = arg0[3] * (float) local17 + (float) local13 * arg0[4] + arg0[5] * (float) local9;
		@Pc(80) float local80 = (float) local17 * arg0[6] + arg0[7] * (float) local13 + arg0[8] * (float) local9;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local91 *= arg6;
		}
		@Pc(105) float local105 = arg2 + local59 + 0.5F;
		@Pc(112) float local112;
		if (arg5 == 1) {
			local112 = local91;
			local91 = -local105;
			local105 = local112;
		} else if (arg5 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg5 == 3) {
			local112 = local91;
			local91 = local105;
			local105 = -local112;
		}
		Static448.aFloat198 = local105;
		Static284.aFloat149 = local91;
	}
}
