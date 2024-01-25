import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!mf", name = "G", descriptor = "[Lclient!kd;")
	public static Class162[] aClass162Array1;

	@OriginalMember(owner = "client!mf", name = "J", descriptor = "Z")
	public static boolean aBoolean404;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4736(@OriginalArg(0) String arg0) {
		if (Static151.aString31.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Static151.aString31.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Static151.aString31.startsWith("mac")) {
			return "lib" + arg0 + ".jnilib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!kr;Lclient!kr;Lclient!kr;Lclient!kr;)V")
	public static void method4737(@OriginalArg(1) Class171 arg0, @OriginalArg(2) Class171 arg1, @OriginalArg(3) Class171 arg2, @OriginalArg(4) Class171 arg3) {
		Static358.aClass171_149 = arg3;
		Static153.aClass171_58 = arg0;
		Static461.aClass171_144 = arg1;
		Static186.aClass171_71 = arg2;
		Static396.aClass156ArrayArray1 = new Class156[Static186.aClass171_71.method4331()][];
		Static373.aBooleanArray10 = new boolean[Static186.aClass171_71.method4331()];
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IFIIIII[FII)V")
	public static void method4738(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg5 - arg3;
		@Pc(13) int local13 = arg2 - arg0;
		@Pc(17) int local17 = arg4 - arg7;
		@Pc(38) float local38 = arg6[0] * (float) local5 + arg6[1] * (float) local17 + arg6[2] * (float) local13;
		@Pc(59) float local59 = arg6[5] * (float) local13 + (float) local17 * arg6[4] + (float) local5 * arg6[3];
		@Pc(80) float local80 = (float) local13 * arg6[8] + (float) local17 * arg6[7] + (float) local5 * arg6[6];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg1 + 0.5F;
		@Pc(142) float local142;
		if (arg8 == 1) {
			local142 = local106;
			local106 = -local119;
			local119 = local142;
		} else if (arg8 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg8 == 3) {
			local142 = local106;
			local106 = local119;
			local119 = -local142;
		}
		Static234.aFloat98 = local106;
		Static16.aFloat5 = local119;
	}
}
