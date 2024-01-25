import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!lt;")
	public static Class158 aClass158_84;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!ig;")
	public static Class12 aClass12_18;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "Lclient!wc;")
	public static Class259 aClass259_1;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "F")
	public static float aFloat99 = 0.0F;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
	public static int anInt6565 = -1;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
	public static int anInt6568 = -1;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([FFIFIBIIIIIIF)V")
	public static void method5428(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(5) int local5 = arg6 - arg2;
		@Pc(30) int local30 = arg5 - arg4;
		@Pc(34) int local34 = arg7 - arg10;
		@Pc(55) float local55 = arg0[2] * (float) local34 + arg0[1] * (float) local5 + (float) local30 * arg0[0];
		@Pc(76) float local76 = (float) local5 * arg0[4] + (float) local30 * arg0[3] + (float) local34 * arg0[5];
		@Pc(97) float local97 = arg0[6] * (float) local30 + arg0[7] * (float) local5 + arg0[8] * (float) local34;
		@Pc(112) float local112;
		@Pc(106) float local106;
		if (arg8 == 0) {
			local106 = arg3 + 0.5F - local97;
			local112 = local55 + arg1 + 0.5F;
		} else if (arg8 == 1) {
			local106 = arg3 + local97 + 0.5F;
			local112 = local55 + arg1 + 0.5F;
		} else if (arg8 == 2) {
			local112 = arg1 + 0.5F - local55;
			local106 = arg11 + 0.5F - local76;
		} else if (arg8 == 3) {
			local106 = arg11 + 0.5F - local76;
			local112 = local55 + arg1 + 0.5F;
		} else if (arg8 == 4) {
			local106 = arg11 + 0.5F - local76;
			local112 = local97 + arg3 + 0.5F;
		} else {
			local106 = arg11 + 0.5F - local76;
			local112 = arg3 + 0.5F - local97;
		}
		@Pc(209) float local209;
		if (arg9 == 1) {
			local209 = local112;
			local112 = -local106;
			local106 = local209;
		} else if (arg9 == 2) {
			local106 = -local106;
			local112 = -local112;
		} else if (arg9 == 3) {
			local209 = local112;
			local112 = local106;
			local106 = -local209;
		}
		Static82.aFloat38 = local112;
		Static112.aFloat97 = local106;
	}
}
