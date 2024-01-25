import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	public static int anInt3647;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_184 = new Class123(41, 3);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IFFIIIFI)[F")
	public static float[] method3013(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[4] = 1.0F;
		local6[6] = -local25;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		local6[5] = 0.0F;
		local6[2] = local25;
		local6[8] = local17;
		@Pc(77) float[] local77 = new float[9];
		@Pc(79) float local79 = 1.0F;
		@Pc(81) float local81 = 0.0F;
		@Pc(86) float local86 = (float) arg4 / 32767.0F;
		@Pc(96) float local96 = -((float) Math.sqrt((double) (1.0F - local86 * local86)));
		@Pc(101) float local101 = 1.0F - local86;
		@Pc(112) float local112 = (float) Math.sqrt((double) (arg0 * arg0 + arg6 * arg6));
		if (local112 == 0.0F && local86 == 0.0F) {
			local9 = local6;
		} else {
			if (local112 != 0.0F) {
				local79 = (float) -arg0 / local112;
				local81 = (float) arg6 / local112;
			}
			local77[1] = local96 * local81;
			local77[6] = local81 * local79 * local101;
			local77[5] = local79 * local96;
			local77[0] = local79 * local79 * local101 + local86;
			local77[2] = local79 * local81 * local101;
			local77[8] = local86 + local101 * local81 * local81;
			local77[4] = local86;
			local77[7] = local96 * -local79;
			local77[3] = -local81 * local96;
			local9[0] = local6[2] * local77[6] + local6[1] * local77[3] + local6[0] * local77[0];
			local9[1] = local77[7] * local6[2] + local6[0] * local77[1] + local6[1] * local77[4];
			local9[2] = local6[1] * local77[5] + local6[0] * local77[2] + local77[8] * local6[2];
			local9[3] = local6[5] * local77[6] + local6[4] * local77[3] + local6[3] * local77[0];
			local9[4] = local77[7] * local6[5] + local6[4] * local77[4] + local77[1] * local6[3];
			local9[5] = local6[3] * local77[2] + local77[5] * local6[4] + local6[5] * local77[8];
			local9[6] = local6[8] * local77[6] + local77[0] * local6[6] + local6[7] * local77[3];
			local9[7] = local77[7] * local6[8] + local6[6] * local77[1] + local6[7] * local77[4];
			local9[8] = local77[5] * local6[7] + local6[6] * local77[2] + local6[8] * local77[8];
		}
		local9[6] *= arg1;
		local9[3] *= arg2;
		local9[0] *= arg5;
		local9[4] *= arg2;
		local9[7] *= arg1;
		local9[5] *= arg2;
		local9[2] *= arg5;
		local9[1] *= arg5;
		local9[8] *= arg1;
		return local9;
	}
}
