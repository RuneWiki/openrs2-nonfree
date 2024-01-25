import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "Lclient!qk;")
	public static Class3_Sub16_Sub3 aClass3_Sub16_Sub3_3;

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "[I")
	public static int[] anIntArray536;

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "Lclient!rs;")
	public static Class291 aClass291_3;

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "([FIIIIIFIIFI)V")
	public static void method7299(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4 - arg7;
		@Pc(9) int local9 = arg9 - arg2;
		@Pc(13) int local13 = arg1 - arg3;
		@Pc(38) float local38 = (float) local5 * arg0[2] + arg0[1] * (float) local9 + (float) local13 * arg0[0];
		@Pc(59) float local59 = arg0[5] * (float) local5 + (float) local9 * arg0[4] + arg0[3] * (float) local13;
		@Pc(80) float local80 = (float) local5 * arg0[8] + (float) local9 * arg0[7] + (float) local13 * arg0[6];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local91 *= arg6;
		}
		@Pc(105) float local105 = local59 + arg8 + 0.5F;
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
		Static571.aFloat227 = local91;
		Static484.aFloat181 = local105;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7300(@OriginalArg(1) String arg0) {
		@Pc(12) String local12 = null;
		@Pc(16) int local16 = arg0.indexOf("--> ");
		if (local16 >= 0) {
			local12 = arg0.substring(0, local16 + 4);
			arg0 = arg0.substring(local16 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(44) int local44 = arg0.indexOf(" ", "directlogin ".length());
			if (local44 >= 0) {
				@Pc(49) int local49 = arg0.length();
				arg0 = arg0.substring(0, local44) + " ";
				for (@Pc(65) int local65 = local44 + 1; local65 < local49; local65++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local12 == null ? arg0 : local12 + arg0;
	}
}
