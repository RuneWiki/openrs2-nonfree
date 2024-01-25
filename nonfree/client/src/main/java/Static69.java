import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!ub;")
	public static final Class240 aClass240_7 = new Class240(16);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(FIFIIIIIIFZI[F)V")
	public static void method1274(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11) {
		@Pc(5) int local5 = arg10 - arg3;
		@Pc(26) int local26 = arg8 - arg1;
		@Pc(30) int local30 = arg5 - arg4;
		@Pc(55) float local55 = (float) local26 * arg11[0] + arg11[1] * (float) local5 + arg11[2] * (float) local30;
		@Pc(76) float local76 = arg11[5] * (float) local30 + arg11[4] * (float) local5 + arg11[3] * (float) local26;
		@Pc(97) float local97 = (float) local5 * arg11[7] + arg11[6] * (float) local26 + arg11[8] * (float) local30;
		@Pc(115) float local115;
		@Pc(109) float local109;
		if (arg7 == 0) {
			local109 = arg9 + 0.5F - local97;
			local115 = local55 + arg2 + 0.5F;
		} else if (arg7 == 1) {
			local109 = local97 + arg9 + 0.5F;
			local115 = local55 + arg2 + 0.5F;
		} else if (arg7 == 2) {
			local109 = arg0 + 0.5F - local76;
			local115 = arg2 + 0.5F - local55;
		} else if (arg7 == 3) {
			local115 = local55 + arg2 + 0.5F;
			local109 = arg0 + 0.5F - local76;
		} else if (arg7 == 4) {
			local109 = arg0 + 0.5F - local76;
			local115 = local97 + arg9 + 0.5F;
		} else {
			local109 = arg0 + 0.5F - local76;
			local115 = arg9 + 0.5F - local97;
		}
		@Pc(212) float local212;
		if (arg6 == 1) {
			local212 = local115;
			local115 = -local109;
			local109 = local212;
		} else if (arg6 == 2) {
			local109 = -local109;
			local115 = -local115;
		} else if (arg6 == 3) {
			local212 = local115;
			local115 = local109;
			local109 = -local212;
		}
		Static451.aFloat59 = local109;
		Static318.aFloat172 = local115;
	}
}
