import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!eu", name = "E", descriptor = "Lclient!uu;")
	public static Class250 aClass250_34;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!nj;I)Lclient!tu;")
	public static Class155_Sub4 method1700(@OriginalArg(0) Class3_Sub25 arg0) {
		return new Class155_Sub4(arg0.method4065(), arg0.method4065(), arg0.method4065(), arg0.method4065(), arg0.method4099(), arg0.method4096());
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIFI[FIIFIII)V")
	public static void method1701(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg7 - arg5;
		@Pc(13) int local13 = arg4 - arg2;
		@Pc(17) int local17 = arg0 - arg9;
		@Pc(38) float local38 = (float) local13 * arg3[1] + (float) local17 * arg3[0] + arg3[2] * (float) local5;
		@Pc(59) float local59 = arg3[3] * (float) local17 + (float) local13 * arg3[4] + arg3[5] * (float) local5;
		@Pc(80) float local80 = (float) local17 * arg3[6] + arg3[7] * (float) local13 + arg3[8] * (float) local5;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local91 *= arg6;
		}
		@Pc(105) float local105 = arg1 + local59 + 0.5F;
		@Pc(110) float local110;
		if (arg8 == 1) {
			local110 = local91;
			local91 = -local105;
			local105 = local110;
		} else if (arg8 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg8 == 3) {
			local110 = local91;
			local91 = local105;
			local105 = -local110;
		}
		Static18.aFloat5 = local91;
		Static38.aFloat10 = local105;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)Z")
	public static boolean method1702(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
