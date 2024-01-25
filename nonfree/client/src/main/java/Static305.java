import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Z")
	public static boolean aBoolean394;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "[I")
	public static final int[] anIntArray300 = new int[3];

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "[I")
	public static final int[] anIntArray301 = new int[4096];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZII)I")
	public static int method4614(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class3_Sub45 local13 = Static162.method826(arg2, arg1);
		if (local13 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local13.anIntArray511.length) {
			return local13.anIntArray511[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(FIFFIIII)[F")
	public static float[] method4615(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[8] = local17;
		local6[7] = 0.0F;
		local6[6] = -local25;
		local6[0] = local17;
		local6[4] = 1.0F;
		local6[1] = 0.0F;
		local6[3] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg4 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(90) float local90 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(94) float local94 = 1.0F - local77;
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg6 * arg6 + arg1 * arg1));
		if (local105 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local79 = (float) arg1 / local105;
				local72 = (float) -arg6 / local105;
			}
			local70[2] = local94 * local79 * local72;
			local70[8] = local79 * local79 * local94 + local77;
			local70[5] = local90 * local72;
			local70[3] = -local79 * local90;
			local70[4] = local77;
			local70[6] = local72 * local79 * local94;
			local70[0] = local72 * local72 * local94 + local77;
			local70[7] = local90 * -local72;
			local70[1] = local79 * local90;
			local9[0] = local70[0] * local6[0] + local6[1] * local70[3] + local70[6] * local6[2];
			local9[1] = local6[2] * local70[7] + local6[0] * local70[1] + local6[1] * local70[4];
			local9[3] = local70[6] * local6[5] + local70[0] * local6[3] + local6[4] * local70[3];
			local9[2] = local70[5] * local6[1] + local6[0] * local70[2] + local6[2] * local70[8];
			local9[4] = local70[4] * local6[4] + local6[3] * local70[1] + local6[5] * local70[7];
			local9[6] = local70[3] * local6[7] + local6[6] * local70[0] + local70[6] * local6[8];
			local9[5] = local70[8] * local6[5] + local6[3] * local70[2] + local70[5] * local6[4];
			local9[7] = local70[7] * local6[8] + local70[1] * local6[6] + local70[4] * local6[7];
			local9[8] = local6[8] * local70[8] + local6[6] * local70[2] + local6[7] * local70[5];
		}
		local9[2] *= arg0;
		local9[8] *= arg3;
		local9[1] *= arg0;
		local9[3] *= arg2;
		local9[4] *= arg2;
		local9[5] *= arg2;
		local9[7] *= arg3;
		local9[0] *= arg0;
		local9[6] *= arg3;
		return local9;
	}
}
