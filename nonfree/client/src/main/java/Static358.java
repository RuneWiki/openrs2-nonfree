import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
	public static int anInt6226 = -50;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z")
	public static boolean method5266(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 4;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)I")
	public static int method5267(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(39) int local39 = (arg0 & 0x7F) * 96 >> 7;
			if (local39 < 2) {
				local39 = 2;
			} else if (local39 > 126) {
				local39 = 126;
			}
			return (arg0 & 0xFF80) + local39;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IFIIFIFI)[F")
	public static float[] method5268(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[0] = local17;
		local6[4] = 1.0F;
		local6[3] = 0.0F;
		local6[2] = local25;
		local6[7] = 0.0F;
		local6[8] = local17;
		local6[1] = 0.0F;
		local6[6] = -local25;
		local6[5] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(79) float local79 = (float) arg2 / 32767.0F;
		@Pc(90) float local90 = -((float) Math.sqrt((double) (1.0F - local79 * local79)));
		@Pc(95) float local95 = 1.0F - local79;
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg4 * arg4 + arg0 * arg0));
		if (local106 == 0.0F && local79 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local74 = (float) arg4 / local106;
				local72 = (float) -arg0 / local106;
			}
			local70[1] = local74 * local90;
			local70[7] = -local72 * local90;
			local70[6] = local72 * local74 * local95;
			local70[3] = -local74 * local90;
			local70[4] = local79;
			local70[0] = local79 + local72 * local72 * local95;
			local70[5] = local72 * local90;
			local70[8] = local95 * local74 * local74 + local79;
			local70[2] = local95 * local74 * local72;
			local9[0] = local70[0] * local6[0] + local6[1] * local70[3] + local6[2] * local70[6];
			local9[1] = local6[1] * local70[4] + local6[0] * local70[1] + local70[7] * local6[2];
			local9[2] = local6[0] * local70[2] + local6[1] * local70[5] + local6[2] * local70[8];
			local9[3] = local70[6] * local6[5] + local70[0] * local6[3] + local70[3] * local6[4];
			local9[4] = local6[4] * local70[4] + local6[3] * local70[1] + local70[7] * local6[5];
			local9[5] = local6[4] * local70[5] + local6[3] * local70[2] + local6[5] * local70[8];
			local9[6] = local6[7] * local70[3] + local70[0] * local6[6] + local6[8] * local70[6];
			local9[7] = local70[7] * local6[8] + local70[4] * local6[7] + local70[1] * local6[6];
			local9[8] = local6[7] * local70[5] + local6[6] * local70[2] + local6[8] * local70[8];
		}
		local9[3] *= arg1;
		local9[8] *= arg3;
		local9[5] *= arg1;
		local9[6] *= arg3;
		local9[4] *= arg1;
		local9[2] *= arg5;
		local9[0] *= arg5;
		local9[7] *= arg3;
		local9[1] *= arg5;
		return local9;
	}
}
