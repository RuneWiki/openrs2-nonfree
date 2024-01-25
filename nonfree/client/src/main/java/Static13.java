import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ai", name = "bb", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_5 = new Class252(79, 3);

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(I)V")
	public static void method510() {
		for (@Pc(10) Class1_Sub2_Sub15 local10 = (Class1_Sub2_Sub15) Static8.aClass295_3.method7543(); local10 != null; local10 = (Class1_Sub2_Sub15) Static8.aClass295_3.method7540()) {
			@Pc(20) Class20_Sub1_Sub5 local20 = local10.aClass20_Sub1_Sub5_1;
			if (local20.anInt7135 < Static445.anInt7791) {
				local10.method8239();
				local20.method6436();
			} else if (local20.anInt7139 <= Static445.anInt7791) {
				if (local20.anInt7150 > 0) {
					@Pc(56) Class1_Sub41 local56 = (Class1_Sub41) Static362.aClass230_46.method6144((long) (local20.anInt7150 - 1));
					if (local56 != null) {
						@Pc(61) Class20_Sub1_Sub1_Sub2 local61 = local56.aClass20_Sub1_Sub1_Sub2_2;
						if (local61.anInt8954 >= 0 && Static237.anInt4563 * 128 > local61.anInt8954 && local61.anInt8949 >= 0 && Static373.anInt6694 * 128 > local61.anInt8949) {
							local20.method6439(local61.anInt8949, Static508.method7754(local61.anInt8949, local61.anInt8954, local20.aByte108) - local20.anInt7126, local61.anInt8954, Static445.anInt7791);
						}
					}
				}
				if (local20.anInt7150 < 0) {
					@Pc(116) int local116 = -local20.anInt7150 - 1;
					@Pc(121) Class20_Sub1_Sub1_Sub1 local121;
					if (Static16.anInt9513 == local116) {
						local121 = Static107.aClass20_Sub1_Sub1_Sub1_1;
					} else {
						local121 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local116];
					}
					if (local121 != null && local121.anInt8954 >= 0 && local121.anInt8954 < Static237.anInt4563 * 128 && local121.anInt8949 >= 0 && local121.anInt8949 < Static373.anInt6694 * 128) {
						local20.method6439(local121.anInt8949, Static508.method7754(local121.anInt8949, local121.anInt8954, local20.aByte108) - local20.anInt7126, local121.anInt8954, Static445.anInt7791);
					}
				}
				local20.method6441(Static242.anInt4651);
				Static391.method6237(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIBIFFF)[F")
	public static float[] method511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local6[1] = 0.0F;
		local6[2] = local25;
		local6[6] = -local25;
		local6[5] = 0.0F;
		local6[8] = local17;
		local6[3] = 0.0F;
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[4] = 1.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg3 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(94) float local94 = 1.0F - local77;
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg1 * arg1 + arg2 * arg2));
		if (local105 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local79 = (float) arg2 / local105;
				local72 = (float) -arg1 / local105;
			}
			local70[4] = local77;
			local70[5] = local72 * local89;
			local70[7] = -local72 * local89;
			local70[3] = local89 * -local79;
			local70[8] = local79 * local79 * local94 + local77;
			local70[0] = local77 + local94 * local72 * local72;
			local70[1] = local79 * local89;
			local70[2] = local94 * local79 * local72;
			local70[6] = local72 * local79 * local94;
			local9[0] = local70[6] * local6[2] + local6[1] * local70[3] + local70[0] * local6[0];
			local9[1] = local70[4] * local6[1] + local70[1] * local6[0] + local6[2] * local70[7];
			local9[2] = local6[2] * local70[8] + local6[0] * local70[2] + local6[1] * local70[5];
			local9[3] = local70[3] * local6[4] + local6[3] * local70[0] + local6[5] * local70[6];
			local9[4] = local70[7] * local6[5] + local6[4] * local70[4] + local6[3] * local70[1];
			local9[6] = local70[3] * local6[7] + local6[6] * local70[0] + local6[8] * local70[6];
			local9[5] = local6[5] * local70[8] + local6[3] * local70[2] + local70[5] * local6[4];
			local9[7] = local70[1] * local6[6] + local70[4] * local6[7] + local6[8] * local70[7];
			local9[8] = local6[6] * local70[2] + local70[5] * local6[7] + local70[8] * local6[8];
		}
		local9[6] *= arg4;
		local9[4] *= arg6;
		local9[2] *= arg5;
		local9[1] *= arg5;
		local9[8] *= arg4;
		local9[0] *= arg5;
		local9[7] *= arg4;
		local9[5] *= arg6;
		local9[3] *= arg6;
		return local9;
	}
}
