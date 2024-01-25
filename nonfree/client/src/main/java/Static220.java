import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hfa", name = "q", descriptor = "I")
	public static int anInt4183;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(FIIIIIFF)[F")
	public static float[] method3811(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[3] = 0.0F;
		local6[6] = -local25;
		local6[2] = local25;
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[1] = 0.0F;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[0] = local17;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(79) float local79 = (float) arg2 / 32767.0F;
		@Pc(84) float local84 = 1.0F - local79;
		@Pc(95) float local95 = -((float) Math.sqrt((double) (1.0F - local79 * local79)));
		@Pc(107) float local107 = (float) Math.sqrt((double) (arg1 * arg1 + arg4 * arg4));
		if (local107 == 0.0F && local79 == 0.0F) {
			local9 = local6;
		} else {
			if (local107 != 0.0F) {
				local74 = (float) arg1 / local107;
				local72 = (float) -arg4 / local107;
			}
			local70[5] = local95 * local72;
			local70[6] = local84 * local74 * local72;
			local70[3] = -local74 * local95;
			local70[4] = local79;
			local70[0] = local79 + local72 * local72 * local84;
			local70[7] = -local72 * local95;
			local70[1] = local74 * local95;
			local70[8] = local84 * local74 * local74 + local79;
			local70[2] = local84 * local72 * local74;
			local9[0] = local70[6] * local6[2] + local70[3] * local6[1] + local70[0] * local6[0];
			local9[1] = local70[1] * local6[0] + local6[1] * local70[4] + local6[2] * local70[7];
			local9[3] = local70[6] * local6[5] + local70[3] * local6[4] + local6[3] * local70[0];
			local9[2] = local70[8] * local6[2] + local70[5] * local6[1] + local6[0] * local70[2];
			local9[4] = local6[5] * local70[7] + local6[3] * local70[1] + local70[4] * local6[4];
			local9[5] = local70[8] * local6[5] + local70[2] * local6[3] + local70[5] * local6[4];
			local9[6] = local6[6] * local70[0] + local6[7] * local70[3] + local70[6] * local6[8];
			local9[7] = local6[6] * local70[1] + local70[4] * local6[7] + local70[7] * local6[8];
			local9[8] = local6[7] * local70[5] + local70[2] * local6[6] + local6[8] * local70[8];
		}
		local9[1] *= arg5;
		local9[8] *= arg6;
		local9[7] *= arg6;
		local9[3] *= arg0;
		local9[5] *= arg0;
		local9[0] *= arg5;
		local9[4] *= arg0;
		local9[2] *= arg5;
		local9[6] *= arg6;
		return local9;
	}
}
