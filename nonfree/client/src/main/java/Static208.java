import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
	public static int anInt3938;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!so;I)Lclient!em;")
	public static Class86_Sub2 method3267(@OriginalArg(0) Class14_Sub29 arg0) {
		return new Class86_Sub2(arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5890(), arg0.method5862(), arg0.method5866());
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(FIIIIFIF)[F")
	public static float[] method3268(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local6[2] = local25;
		local6[6] = -local25;
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[3] = 0.0F;
		local6[1] = 0.0F;
		local6[8] = local17;
		local6[5] = 0.0F;
		local6[4] = 1.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg3 / 32767.0F;
		@Pc(80) float local80 = (float) 0;
		@Pc(91) float local91 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(96) float local96 = 1.0F - local77;
		@Pc(108) float local108 = (float) Math.sqrt((double) (arg2 * arg2 + arg1 * arg1));
		if (local108 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local108 != 0.0F) {
				local72 = (float) -arg1 / local108;
				local80 = (float) arg2 / local108;
			}
			local70[1] = local80 * local91;
			local70[4] = local77;
			local70[8] = local77 + local96 * local80 * local80;
			local70[0] = local96 * local72 * local72 + local77;
			local70[7] = local91 * -local72;
			local70[6] = local80 * local72 * local96;
			local70[3] = local91 * -local80;
			local70[5] = local72 * local91;
			local70[2] = local72 * local80 * local96;
			local9[0] = local6[1] * local70[3] + local6[0] * local70[0] + local70[6] * local6[2];
			local9[1] = local70[7] * local6[2] + local70[1] * local6[0] + local6[1] * local70[4];
			local9[3] = local6[5] * local70[6] + local70[3] * local6[4] + local6[3] * local70[0];
			local9[2] = local6[0] * local70[2] + local70[5] * local6[1] + local70[8] * local6[2];
			local9[4] = local70[1] * local6[3] + local6[4] * local70[4] + local70[7] * local6[5];
			local9[6] = local6[8] * local70[6] + local6[6] * local70[0] + local70[3] * local6[7];
			local9[5] = local6[5] * local70[8] + local70[5] * local6[4] + local70[2] * local6[3];
			local9[7] = local70[7] * local6[8] + local70[4] * local6[7] + local6[6] * local70[1];
			local9[8] = local70[8] * local6[8] + local70[2] * local6[6] + local6[7] * local70[5];
		}
		local9[2] *= arg0;
		local9[0] *= arg0;
		local9[5] *= arg6;
		local9[7] *= arg4;
		local9[6] *= arg4;
		local9[4] *= arg6;
		local9[1] *= arg0;
		local9[8] *= arg4;
		local9[3] *= arg6;
		return local9;
	}
}
