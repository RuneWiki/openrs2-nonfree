import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "Lclient!st;")
	public static final Class314 aClass314_10 = new Class314(37, 7);

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "Lclient!wn;")
	public static final Class379 aClass379_2 = new Class379("", 10);

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIFIFF)[F")
	public static float[] method748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[0] = local17;
		local6[4] = 1.0F;
		local6[6] = -local25;
		local6[1] = 0.0F;
		local6[5] = 0.0F;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		local6[2] = local25;
		local6[8] = local17;
		@Pc(78) float[] local78 = new float[9];
		@Pc(80) float local80 = 1.0F;
		@Pc(82) float local82 = 0.0F;
		@Pc(87) float local87 = (float) arg0 / 32767.0F;
		@Pc(97) float local97 = -((float) Math.sqrt((double) (1.0F - local87 * local87)));
		@Pc(102) float local102 = 1.0F - local87;
		@Pc(113) float local113 = (float) Math.sqrt((double) (arg4 * arg4 + arg1 * arg1));
		if (local113 == 0.0F && local87 == 0.0F) {
			local9 = local6;
		} else {
			if (local113 != 0.0F) {
				local82 = (float) arg4 / local113;
				local80 = (float) -arg1 / local113;
			}
			local78[0] = local102 * local80 * local80 + local87;
			local78[4] = local87;
			local78[5] = local97 * local80;
			local78[7] = -local80 * local97;
			local78[8] = local82 * local82 * local102 + local87;
			local78[2] = local102 * local80 * local82;
			local78[3] = -local82 * local97;
			local78[6] = local80 * local82 * local102;
			local78[1] = local97 * local82;
			local9[0] = local78[6] * local6[2] + local6[0] * local78[0] + local6[1] * local78[3];
			local9[1] = local78[1] * local6[0] + local78[4] * local6[1] + local78[7] * local6[2];
			local9[2] = local78[5] * local6[1] + local6[0] * local78[2] + local78[8] * local6[2];
			local9[3] = local78[3] * local6[4] + local78[0] * local6[3] + local78[6] * local6[5];
			local9[4] = local78[7] * local6[5] + local6[4] * local78[4] + local6[3] * local78[1];
			local9[5] = local78[2] * local6[3] + local78[5] * local6[4] + local6[5] * local78[8];
			local9[6] = local78[6] * local6[8] + local78[0] * local6[6] + local6[7] * local78[3];
			local9[7] = local6[8] * local78[7] + local6[6] * local78[1] + local78[4] * local6[7];
			local9[8] = local78[8] * local6[8] + local78[2] * local6[6] + local78[5] * local6[7];
		}
		local9[8] *= arg3;
		local9[5] *= arg5;
		local9[3] *= arg5;
		local9[2] *= arg6;
		local9[4] *= arg5;
		local9[6] *= arg3;
		local9[1] *= arg6;
		local9[0] *= arg6;
		local9[7] *= arg3;
		return local9;
	}
}
