import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Lclient!vw;")
	public static Class348 aClass348_2;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_75 = new Class73(90, 3);

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
	public static int anInt3371 = 0;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IFFIIFBI)[F")
	public static float[] method2961(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[4] = 1.0F;
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[8] = local17;
		local6[6] = -local25;
		local6[1] = 0.0F;
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[3] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(82) float local82 = (float) arg3 / 32767.0F;
		@Pc(84) float local84 = 0.0F;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local82 * local82)));
		@Pc(98) float local98 = 1.0F - local82;
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg6 * arg6 + arg0 * arg0));
		if (local109 == 0.0F && local82 == 0.0F) {
			local9 = local6;
		} else {
			if (local109 != 0.0F) {
				local72 = (float) -arg6 / local109;
				local84 = (float) arg0 / local109;
			}
			local70[1] = local84 * local94;
			local70[5] = local94 * local72;
			local70[4] = local82;
			local70[7] = local94 * -local72;
			local70[3] = -local84 * local94;
			local70[0] = local82 + local72 * local72 * local98;
			local70[2] = local84 * local72 * local98;
			local70[6] = local98 * local84 * local72;
			local70[8] = local98 * local84 * local84 + local82;
			local9[0] = local6[0] * local70[0] + local70[3] * local6[1] + local6[2] * local70[6];
			local9[1] = local70[1] * local6[0] + local70[4] * local6[1] + local6[2] * local70[7];
			local9[2] = local6[1] * local70[5] + local6[0] * local70[2] + local70[8] * local6[2];
			local9[3] = local6[3] * local70[0] + local6[4] * local70[3] + local6[5] * local70[6];
			local9[4] = local6[5] * local70[7] + local6[3] * local70[1] + local70[4] * local6[4];
			local9[5] = local70[2] * local6[3] + local70[5] * local6[4] + local6[5] * local70[8];
			local9[6] = local70[3] * local6[7] + local6[6] * local70[0] + local6[8] * local70[6];
			local9[7] = local6[8] * local70[7] + local6[7] * local70[4] + local6[6] * local70[1];
			local9[8] = local6[8] * local70[8] + local70[5] * local6[7] + local6[6] * local70[2];
		}
		local9[5] *= arg5;
		local9[3] *= arg5;
		local9[1] *= arg2;
		local9[7] *= arg1;
		local9[8] *= arg1;
		local9[4] *= arg5;
		local9[2] *= arg2;
		local9[6] *= arg1;
		local9[0] *= arg2;
		return local9;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lclient!ou;")
	public static Class4_Sub5 method2962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub5_2;
	}
}
