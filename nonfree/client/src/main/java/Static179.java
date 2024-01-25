import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "[Lclient!cw;")
	public static Class61[] aClass61Array8;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	public static int anInt3513;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
	public static int[] anIntArray228 = new int[2];

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[I")
	public static final int[] anIntArray229 = new int[13];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(FIIIIFFI)[F")
	public static float[] method2932(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[1] = 0.0F;
		local6[2] = local25;
		local6[4] = 1.0F;
		local6[8] = local17;
		local6[6] = -local25;
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg3 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(82) float local82 = 1.0F - local76;
		@Pc(92) float local92 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(103) float local103 = (float) Math.sqrt((double) (arg1 * arg1 + arg2 * arg2));
		if ((float) 0 == local103 && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local103 != 0.0F) {
				local71 = (float) -arg1 / local103;
				local78 = (float) arg2 / local103;
			}
			local69[1] = local92 * local78;
			local69[2] = local78 * local71 * local82;
			local69[3] = -local78 * local92;
			local69[7] = -local71 * local92;
			local69[0] = local71 * local71 * local82 + local76;
			local69[6] = local82 * local78 * local71;
			local69[4] = local76;
			local69[5] = local92 * local71;
			local69[8] = local76 + local78 * local78 * local82;
			local9[0] = local69[0] * local6[0] + local69[3] * local6[1] + local69[6] * local6[2];
			local9[1] = local69[7] * local6[2] + local69[4] * local6[1] + local69[1] * local6[0];
			local9[2] = local6[1] * local69[5] + local6[0] * local69[2] + local6[2] * local69[8];
			local9[3] = local6[4] * local69[3] + local69[0] * local6[3] + local69[6] * local6[5];
			local9[4] = local6[5] * local69[7] + local69[1] * local6[3] + local6[4] * local69[4];
			local9[6] = local69[6] * local6[8] + local69[0] * local6[6] + local6[7] * local69[3];
			local9[5] = local69[8] * local6[5] + local6[4] * local69[5] + local6[3] * local69[2];
			local9[7] = local69[1] * local6[6] + local6[7] * local69[4] + local69[7] * local6[8];
			local9[8] = local6[8] * local69[8] + local69[2] * local6[6] + local69[5] * local6[7];
		}
		local9[7] *= arg0;
		local9[5] *= arg4;
		local9[4] *= arg4;
		local9[1] *= arg5;
		local9[6] *= arg0;
		local9[8] *= arg0;
		local9[2] *= arg5;
		local9[0] *= arg5;
		local9[3] *= arg4;
		return local9;
	}
}
