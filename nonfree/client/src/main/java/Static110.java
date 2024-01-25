import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!eca", name = "fb", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!eca", name = "L", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_71 = new Class272(12, 6);

	@OriginalMember(owner = "client!eca", name = "cb", descriptor = "I")
	public static int anInt2597 = 0;

	@OriginalMember(owner = "client!eca", name = "eb", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray6 = new int[2][][];

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(FIIFIIFI)[F")
	public static float[] method2344(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[3] = 0.0F;
		local6[2] = local25;
		local6[6] = -local25;
		local6[0] = local17;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[1] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(78) float local78 = (float) arg2 / 32767.0F;
		@Pc(88) float local88 = -((float) Math.sqrt((double) (1.0F - local78 * local78)));
		@Pc(93) float local93 = 1.0F - local78;
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg5 * arg5 + arg1 * arg1));
		if (local104 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local71 = (float) -arg5 / local104;
				local73 = (float) arg1 / local104;
			}
			local69[6] = local71 * local73 * local93;
			local69[0] = local93 * local71 * local71 + local78;
			local69[3] = local88 * -local73;
			local69[5] = local88 * local71;
			local69[1] = local88 * local73;
			local69[8] = local78 + local73 * local73 * local93;
			local69[2] = local73 * local71 * local93;
			local69[4] = local78;
			local69[7] = local88 * -local71;
			local9[0] = local6[1] * local69[3] + local69[0] * local6[0] + local6[2] * local69[6];
			local9[1] = local6[2] * local69[7] + local6[1] * local69[4] + local69[1] * local6[0];
			local9[3] = local69[6] * local6[5] + local69[3] * local6[4] + local6[3] * local69[0];
			local9[2] = local6[1] * local69[5] + local69[2] * local6[0] + local69[8] * local6[2];
			local9[4] = local6[5] * local69[7] + local6[3] * local69[1] + local6[4] * local69[4];
			local9[5] = local69[8] * local6[5] + local6[4] * local69[5] + local69[2] * local6[3];
			local9[6] = local6[8] * local69[6] + local69[3] * local6[7] + local6[6] * local69[0];
			local9[7] = local6[7] * local69[4] + local6[6] * local69[1] + local69[7] * local6[8];
			local9[8] = local6[6] * local69[2] + local6[7] * local69[5] + local69[8] * local6[8];
		}
		local9[8] *= arg0;
		local9[5] *= arg3;
		local9[2] *= arg6;
		local9[4] *= arg3;
		local9[7] *= arg0;
		local9[0] *= arg6;
		local9[1] *= arg6;
		local9[6] *= arg0;
		local9[3] *= arg3;
		return local9;
	}
}
