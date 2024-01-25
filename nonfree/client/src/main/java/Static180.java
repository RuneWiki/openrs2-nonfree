import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "[S")
	public static short[] aShortArray63;

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
	public static int anInt3240;

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
	public static int anInt3242 = 0;

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
	public static int anInt3243 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)I")
	public static int method2622(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static256.anIntArray368[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZFIFFIII)[F")
	public static float[] method2623(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[5] = 0.0F;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[8] = local17;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		local6[4] = 1.0F;
		local6[6] = -local25;
		local6[2] = local25;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(78) float local78 = (float) arg5 / 32767.0F;
		@Pc(87) float local87 = 1.0F - local78;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local78 * local78)));
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg6 * arg6 + arg4 * arg4));
		if (local109 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local109 != 0.0F) {
				local71 = (float) -arg6 / local109;
				local73 = (float) arg4 / local109;
			}
			local69[0] = local87 * local71 * local71 + local78;
			local69[5] = local98 * local71;
			local69[4] = local78;
			local69[3] = -local73 * local98;
			local69[2] = local87 * local73 * local71;
			local69[1] = local98 * local73;
			local69[7] = local98 * -local71;
			local69[6] = local87 * local73 * local71;
			local69[8] = local87 * local73 * local73 + local78;
			local9[0] = local6[2] * local69[6] + local69[0] * local6[0] + local69[3] * local6[1];
			local9[1] = local69[7] * local6[2] + local69[4] * local6[1] + local69[1] * local6[0];
			local9[2] = local69[5] * local6[1] + local6[0] * local69[2] + local6[2] * local69[8];
			local9[3] = local69[0] * local6[3] + local69[3] * local6[4] + local69[6] * local6[5];
			local9[4] = local69[7] * local6[5] + local69[4] * local6[4] + local6[3] * local69[1];
			local9[6] = local6[8] * local69[6] + local6[7] * local69[3] + local6[6] * local69[0];
			local9[5] = local69[2] * local6[3] + local69[5] * local6[4] + local69[8] * local6[5];
			local9[7] = local69[7] * local6[8] + local69[4] * local6[7] + local6[6] * local69[1];
			local9[8] = local6[6] * local69[2] + local69[5] * local6[7] + local6[8] * local69[8];
		}
		local9[3] *= arg0;
		local9[4] *= arg0;
		local9[8] *= arg2;
		local9[2] *= arg3;
		local9[5] *= arg0;
		local9[7] *= arg2;
		local9[1] *= arg3;
		local9[6] *= arg2;
		local9[0] *= arg3;
		return local9;
	}
}
