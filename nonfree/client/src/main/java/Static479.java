import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!of;")
	public static final Class236 aClass236_80 = new Class236(4);

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!ei;")
	public static Class8_Sub5_Sub6 aClass8_Sub5_Sub6_1 = null;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method7071() {
		Static137.method2951();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(FIF[FIIIIIIIFI[F)V")
	public static void method7073(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float[] arg12) {
		@Pc(5) int local5 = arg7 - arg11;
		@Pc(9) int local9 = arg1 - arg9;
		@Pc(17) int local17 = arg5 - arg4;
		@Pc(38) float local38 = arg12[2] * (float) local9 + arg12[1] * (float) local5 + arg12[0] * (float) local17;
		@Pc(59) float local59 = arg12[4] * (float) local5 + arg12[3] * (float) local17 + arg12[5] * (float) local9;
		@Pc(80) float local80 = arg12[8] * (float) local9 + (float) local17 * arg12[6] + (float) local5 * arg12[7];
		@Pc(105) float local105;
		@Pc(112) float local112;
		if (arg6 == 0) {
			local105 = arg10 + local38 + 0.5F;
			local112 = arg0 + 0.5F - local80;
		} else if (arg6 == 1) {
			local112 = arg0 + local80 + 0.5F;
			local105 = arg10 + local38 + 0.5F;
		} else if (arg6 == 2) {
			local105 = arg10 + 0.5F - local38;
			local112 = arg2 + 0.5F - local59;
		} else if (arg6 == 3) {
			local105 = arg10 + local38 + 0.5F;
			local112 = arg2 + 0.5F - local59;
		} else if (arg6 == 4) {
			local105 = local80 + arg0 + 0.5F;
			local112 = arg2 + 0.5F - local59;
		} else {
			local105 = arg0 + 0.5F - local80;
			local112 = arg2 + 0.5F - local59;
		}
		@Pc(210) float local210;
		if (arg8 == 1) {
			local210 = local105;
			local105 = -local112;
			local112 = local210;
		} else if (arg8 == 2) {
			local105 = -local105;
			local112 = -local112;
		} else if (arg8 == 3) {
			local210 = local105;
			local105 = local112;
			local112 = -local210;
		}
		arg3[0] = local105;
		arg3[1] = local112;
	}
}
