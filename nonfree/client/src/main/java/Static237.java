import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!jba", name = "I", descriptor = "Lclient!oh;")
	public static final Class252 aClass252_8 = new Class252(4, 1);

	@OriginalMember(owner = "client!jba", name = "jb", descriptor = "Lclient!or;")
	public static final Class259 aClass259_7 = new Class259();

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)Lclient!sr;")
	public static Class248_Sub1 method3499() {
		return Static524.anInt1396 < Static332.aClass248_Sub1Array1.length ? Static332.aClass248_Sub1Array1[Static524.anInt1396++] : null;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIFIFFI)[F")
	public static float[] method3501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local6[6] = -local25;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[2] = local25;
		local6[3] = 0.0F;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[4] = 1.0F;
		local6[8] = local17;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg2 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(84) float local84 = 1.0F - local77;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg6 * arg6 + arg1 * arg1));
		if (local105 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local79 = (float) arg6 / local105;
				local72 = (float) -arg1 / local105;
			}
			local70[8] = local77 + local79 * local79 * local84;
			local70[5] = local94 * local72;
			local70[7] = local94 * -local72;
			local70[0] = local84 * local72 * local72 + local77;
			local70[4] = local77;
			local70[6] = local84 * local72 * local79;
			local70[2] = local84 * local72 * local79;
			local70[3] = local94 * -local79;
			local70[1] = local79 * local94;
			local9[0] = local6[0] * local70[0] + local70[3] * local6[1] + local70[6] * local6[2];
			local9[1] = local70[7] * local6[2] + local70[1] * local6[0] + local6[1] * local70[4];
			local9[2] = local70[5] * local6[1] + local70[2] * local6[0] + local70[8] * local6[2];
			local9[3] = local70[6] * local6[5] + local6[4] * local70[3] + local70[0] * local6[3];
			local9[4] = local70[1] * local6[3] + local70[4] * local6[4] + local6[5] * local70[7];
			local9[6] = local70[0] * local6[6] + local70[3] * local6[7] + local6[8] * local70[6];
			local9[5] = local6[3] * local70[2] + local70[5] * local6[4] + local70[8] * local6[5];
			local9[7] = local70[4] * local6[7] + local6[6] * local70[1] + local70[7] * local6[8];
			local9[8] = local70[8] * local6[8] + local6[7] * local70[5] + local70[2] * local6[6];
		}
		local9[8] *= arg5;
		local9[5] *= arg3;
		local9[7] *= arg5;
		local9[4] *= arg3;
		local9[1] *= arg4;
		local9[3] *= arg3;
		local9[2] *= arg4;
		local9[6] *= arg5;
		local9[0] *= arg4;
		return local9;
	}
}
