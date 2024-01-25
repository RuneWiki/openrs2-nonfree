import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	public static int anInt1129;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_60 = new Class296(41, 8);

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString7 = "";

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "[I")
	public static final int[] anIntArray143 = new int[8];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)Lclient!cm;")
	public static Class50 method1108(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static313.aClass50Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIFIII[F)V")
	public static void method1109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8) {
		@Pc(5) int local5 = arg1 - arg5;
		@Pc(9) int local9 = arg7 - arg0;
		@Pc(17) int local17 = arg6 - arg2;
		@Pc(38) float local38 = (float) local9 * arg8[2] + arg8[0] * (float) local5 + arg8[1] * (float) local17;
		@Pc(59) float local59 = arg8[5] * (float) local9 + arg8[3] * (float) local5 + (float) local17 * arg8[4];
		@Pc(80) float local80 = (float) local5 * arg8[6] + arg8[7] * (float) local17 + arg8[8] * (float) local9;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg4 + 0.5F;
		@Pc(136) float local136;
		if (arg3 == 1) {
			local136 = local106;
			local106 = -local119;
			local119 = local136;
		} else if (arg3 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg3 == 3) {
			local136 = local106;
			local106 = local119;
			local119 = -local136;
		}
		Static474.aFloat153 = local119;
		Static242.aFloat101 = local106;
	}
}
