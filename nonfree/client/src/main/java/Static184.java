import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "[S")
	public static short[] aShortArray48;

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "Lclient!oa;")
	public static Class90 aClass90_6;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "Lclient!qda;")
	public static Class262 aClass262_1;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_43 = new Class98(88, 8);

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "J")
	public static long aLong78 = 0L;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(FIFIFIII)[F")
	public static float[] method3084(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[2] = local25;
		local6[4] = 1.0F;
		local6[1] = 0.0F;
		local6[8] = local17;
		local6[3] = 0.0F;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[6] = -local25;
		local6[0] = local17;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(79) float local79 = (float) arg6 / 32767.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local79 * local79)));
		@Pc(93) float local93 = 1.0F - local79;
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg5 * arg5 + arg4 * arg4));
		if (local104 == 0.0F && local79 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local72 = (float) -arg4 / local104;
				local74 = (float) arg5 / local104;
			}
			local70[0] = local79 + local93 * local72 * local72;
			local70[4] = local79;
			local70[6] = local74 * local72 * local93;
			local70[3] = local89 * -local74;
			local70[1] = local74 * local89;
			local70[8] = local79 + local93 * local74 * local74;
			local70[5] = local89 * local72;
			local70[2] = local72 * local74 * local93;
			local70[7] = local89 * -local72;
			local9[0] = local70[3] * local6[1] + local70[0] * local6[0] + local6[2] * local70[6];
			local9[1] = local70[7] * local6[2] + local70[1] * local6[0] + local70[4] * local6[1];
			local9[3] = local6[4] * local70[3] + local6[3] * local70[0] + local70[6] * local6[5];
			local9[2] = local70[8] * local6[2] + local70[5] * local6[1] + local6[0] * local70[2];
			local9[4] = local6[5] * local70[7] + local6[4] * local70[4] + local70[1] * local6[3];
			local9[6] = local70[6] * local6[8] + local6[6] * local70[0] + local6[7] * local70[3];
			local9[5] = local70[2] * local6[3] + local6[4] * local70[5] + local6[5] * local70[8];
			local9[7] = local70[7] * local6[8] + local6[7] * local70[4] + local6[6] * local70[1];
			local9[8] = local6[6] * local70[2] + local70[5] * local6[7] + local70[8] * local6[8];
		}
		local9[2] *= arg0;
		local9[3] *= arg3;
		local9[0] *= arg0;
		local9[7] *= arg2;
		local9[6] *= arg2;
		local9[5] *= arg3;
		local9[4] *= arg3;
		local9[8] *= arg2;
		local9[1] *= arg0;
		return local9;
	}
}
