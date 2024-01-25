import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Lclient!rca;")
	public static Class283 aClass283_5;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
	public static int anInt9459 = 0;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZI)I")
	public static int method7714(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IFFIIIIIIFI[FI)V")
	public static void method7716(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[] arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg6 - arg4;
		@Pc(13) int local13 = arg9 - arg3;
		@Pc(17) int local17 = arg11 - arg0;
		@Pc(38) float local38 = (float) local13 * arg10[2] + (float) local17 * arg10[1] + arg10[0] * (float) local5;
		@Pc(59) float local59 = (float) local17 * arg10[4] + arg10[3] * (float) local5 + (float) local13 * arg10[5];
		@Pc(80) float local80 = (float) local5 * arg10[6] + arg10[7] * (float) local17 + arg10[8] * (float) local13;
		@Pc(95) float local95;
		@Pc(89) float local89;
		if (arg5 == 0) {
			local89 = arg2 + 0.5F - local80;
			local95 = local38 + arg8 + 0.5F;
		} else if (arg5 == 1) {
			local89 = local80 + arg2 + 0.5F;
			local95 = arg8 + local38 + 0.5F;
		} else if (arg5 == 2) {
			local89 = arg1 + 0.5F - local59;
			local95 = arg8 + 0.5F - local38;
		} else if (arg5 == 3) {
			local95 = arg8 + local38 + 0.5F;
			local89 = arg1 + 0.5F - local59;
		} else if (arg5 == 4) {
			local89 = arg1 + 0.5F - local59;
			local95 = local80 + arg2 + 0.5F;
		} else {
			local89 = arg1 + 0.5F - local59;
			local95 = arg2 + 0.5F - local80;
		}
		@Pc(188) float local188;
		if (arg7 == 1) {
			local188 = local95;
			local95 = -local89;
			local89 = local188;
		} else if (arg7 == 2) {
			local89 = -local89;
			local95 = -local95;
		} else if (arg7 == 3) {
			local188 = local95;
			local95 = local89;
			local89 = -local188;
		}
		Static319.aFloat123 = local89;
		Static341.aFloat61 = local95;
	}
}
