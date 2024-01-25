import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFIFBIII)[F")
	public static float[] method2984(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[2] = local25;
		local6[8] = local17;
		local6[0] = local17;
		local6[7] = 0.0F;
		local6[1] = 0.0F;
		local6[6] = -local25;
		local6[3] = 0.0F;
		local6[5] = 0.0F;
		local6[4] = 1.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg4 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(94) float local94 = 1.0F - local76;
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg6 * arg6 + arg5 * arg5));
		if (local106 == 0.0F && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local71 = (float) -arg5 / local106;
				local78 = (float) arg6 / local106;
			}
			local69[2] = local78 * local71 * local94;
			local69[4] = local76;
			local69[8] = local78 * local78 * local94 + local76;
			local69[1] = local78 * local89;
			local69[3] = -local78 * local89;
			local69[6] = local94 * local71 * local78;
			local69[5] = local71 * local89;
			local69[0] = local94 * local71 * local71 + local76;
			local69[7] = -local71 * local89;
			local9[0] = local69[6] * local6[2] + local6[0] * local69[0] + local6[1] * local69[3];
			local9[1] = local69[4] * local6[1] + local6[0] * local69[1] + local6[2] * local69[7];
			local9[3] = local6[3] * local69[0] + local6[4] * local69[3] + local6[5] * local69[6];
			local9[2] = local6[1] * local69[5] + local69[2] * local6[0] + local6[2] * local69[8];
			local9[4] = local69[4] * local6[4] + local69[1] * local6[3] + local69[7] * local6[5];
			local9[5] = local6[5] * local69[8] + local69[2] * local6[3] + local6[4] * local69[5];
			local9[6] = local6[6] * local69[0] + local6[7] * local69[3] + local69[6] * local6[8];
			local9[7] = local6[6] * local69[1] + local69[4] * local6[7] + local69[7] * local6[8];
			local9[8] = local69[2] * local6[6] + local6[7] * local69[5] + local69[8] * local6[8];
		}
		local9[5] *= arg0;
		local9[1] *= arg3;
		local9[0] *= arg3;
		local9[8] *= arg1;
		local9[4] *= arg0;
		local9[7] *= arg1;
		local9[2] *= arg3;
		local9[6] *= arg1;
		local9[3] *= arg0;
		return local9;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[SI)[S")
	public static short[] method2985(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static598.method1136(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)V")
	public static void method2986(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(15, 0);
		local8.method6098();
		local8.anInt7258 = arg0;
		local8.anInt7256 = arg1;
	}
}
