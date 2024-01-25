import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_24 = new Class245(200);

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!vd;")
	public static final Class328 aClass328_1 = new Class328();

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_51 = new Class254(104, 8);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)[Lclient!lc;")
	public static Class192[] method2290() {
		return new Class192[] { Static520.aClass192_4, Static250.aClass192_2, Static486.aClass192_3 };
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(FIIIFFBI)[F")
	public static float[] method2293(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[8] = local17;
		local6[0] = local17;
		local6[6] = -local25;
		local6[5] = 0.0F;
		local6[1] = 0.0F;
		local6[3] = 0.0F;
		local6[4] = 1.0F;
		local6[2] = local25;
		local6[7] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(79) float local79 = (float) arg6 / 32767.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local79 * local79)));
		@Pc(93) float local93 = 1.0F - local79;
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg1 * arg1 + arg3 * arg3));
		if (local104 == 0.0F && local79 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local72 = (float) -arg1 / local104;
				local74 = (float) arg3 / local104;
			}
			local70[3] = local89 * -local74;
			local70[7] = -local72 * local89;
			local70[5] = local89 * local72;
			local70[8] = local79 + local74 * local74 * local93;
			local70[6] = local93 * local74 * local72;
			local70[0] = local79 + local93 * local72 * local72;
			local70[4] = local79;
			local70[1] = local89 * local74;
			local70[2] = local93 * local74 * local72;
			local9[0] = local70[3] * local6[1] + local70[0] * local6[0] + local6[2] * local70[6];
			local9[1] = local70[4] * local6[1] + local70[1] * local6[0] + local70[7] * local6[2];
			local9[3] = local6[4] * local70[3] + local6[3] * local70[0] + local70[6] * local6[5];
			local9[2] = local70[5] * local6[1] + local6[0] * local70[2] + local70[8] * local6[2];
			local9[4] = local70[7] * local6[5] + local6[4] * local70[4] + local70[1] * local6[3];
			local9[6] = local6[8] * local70[6] + local70[3] * local6[7] + local70[0] * local6[6];
			local9[5] = local6[3] * local70[2] + local70[5] * local6[4] + local6[5] * local70[8];
			local9[7] = local6[8] * local70[7] + local6[7] * local70[4] + local6[6] * local70[1];
			local9[8] = local70[8] * local6[8] + local70[2] * local6[6] + local70[5] * local6[7];
		}
		local9[5] *= arg4;
		local9[7] *= arg5;
		local9[0] *= arg0;
		local9[2] *= arg0;
		local9[3] *= arg4;
		local9[4] *= arg4;
		local9[8] *= arg5;
		local9[1] *= arg0;
		local9[6] *= arg5;
		return local9;
	}
}
