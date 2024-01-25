import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
	public static int anInt3816 = -1;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(FIZIIFFI)[F")
	public static float[] method3261(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[8] = local17;
		local6[2] = local25;
		local6[6] = -local25;
		local6[3] = 0.0F;
		local6[0] = local17;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[1] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(82) float local82 = (float) arg1 / 32767.0F;
		@Pc(84) float local84 = 0.0F;
		@Pc(95) float local95 = -((float) Math.sqrt((double) (1.0F - local82 * local82)));
		@Pc(99) float local99 = 1.0F - local82;
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3));
		if (local110 == 0.0F && local82 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local84 = (float) arg2 / local110;
				local72 = (float) -arg3 / local110;
			}
			local70[6] = local72 * local84 * local99;
			local70[3] = -local84 * local95;
			local70[2] = local72 * local84 * local99;
			local70[0] = local72 * local72 * local99 + local82;
			local70[5] = local72 * local95;
			local70[1] = local95 * local84;
			local70[8] = local99 * local84 * local84 + local82;
			local70[4] = local82;
			local70[7] = -local72 * local95;
			local9[0] = local6[2] * local70[6] + local6[1] * local70[3] + local6[0] * local70[0];
			local9[1] = local6[2] * local70[7] + local6[1] * local70[4] + local70[1] * local6[0];
			local9[3] = local6[5] * local70[6] + local70[3] * local6[4] + local6[3] * local70[0];
			local9[2] = local6[0] * local70[2] + local6[1] * local70[5] + local6[2] * local70[8];
			local9[4] = local70[7] * local6[5] + local70[4] * local6[4] + local70[1] * local6[3];
			local9[5] = local6[5] * local70[8] + local6[3] * local70[2] + local6[4] * local70[5];
			local9[6] = local6[8] * local70[6] + local6[6] * local70[0] + local6[7] * local70[3];
			local9[7] = local6[8] * local70[7] + local6[6] * local70[1] + local6[7] * local70[4];
			local9[8] = local70[2] * local6[6] + local70[5] * local6[7] + local6[8] * local70[8];
		}
		local9[0] *= arg0;
		local9[7] *= arg5;
		local9[5] *= arg4;
		local9[1] *= arg0;
		local9[3] *= arg4;
		local9[8] *= arg5;
		local9[4] *= arg4;
		local9[2] *= arg0;
		local9[6] *= arg5;
		return local9;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIB[B)Z")
	public static boolean method3262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(28) int local28 = -((arg0 + 8 - 1) / 8);
		@Pc(46) int local46 = -((arg1 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local28; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg4[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local13;
			if (arg4[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!cn;)V")
	public static void method3263(@OriginalArg(0) Class23_Sub2 arg0) {
		Static486.aClass16_8.H(arg0.anInt10108, arg0.anInt10114 + (arg0.method8601() >> 1), arg0.anInt10109, Static42.anIntArray45);
		arg0.anInt10105 = Static42.anIntArray45[0];
		arg0.anInt10107 = Static42.anIntArray45[1];
		arg0.anInt10106 = Static42.anIntArray45[2];
	}
}
