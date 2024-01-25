import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
	public static int anInt4509 = -1;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString38 = null;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "(I)V")
	public static void method4041() {
		if (Static245.anIntArray376 != null) {
			return;
		}
		Static245.anIntArray376 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(34) double local34 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(45) double local45 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(52) double local52 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(54) double local54 = local52;
			@Pc(56) double local56 = local52;
			@Pc(58) double local58 = local52;
			if (local45 != 0.0D) {
				@Pc(72) double local72;
				if (local52 < 0.5D) {
					local72 = (local45 + 1.0D) * local52;
				} else {
					local72 = local52 + local45 - local52 * local45;
				}
				@Pc(89) double local89 = local52 * 2.0D - local72;
				@Pc(93) double local93 = local34 + 0.3333333333333333D;
				if (local93 > 1.0D) {
					local93--;
				}
				@Pc(107) double local107 = local34 - 0.3333333333333333D;
				if (local93 * 6.0D < 1.0D) {
					local54 = local93 * (local72 - local89) * 6.0D + local89;
				} else if (local93 * 2.0D < 1.0D) {
					local54 = local72;
				} else if (local93 * 3.0D < 2.0D) {
					local54 = local89 + (0.6666666666666666D - local93) * 6.0D * (local72 - local89);
				} else {
					local54 = local89;
				}
				if (local34 * 6.0D < 1.0D) {
					local56 = (local72 - local89) * 6.0D * local34 + local89;
				} else if (local34 * 2.0D < 1.0D) {
					local56 = local72;
				} else if (local34 * 3.0D < 2.0D) {
					local56 = local89 + (local72 - local89) * 6.0D * (0.6666666666666666D - local34);
				} else {
					local56 = local89;
				}
				if (local107 < 0.0D) {
					local107++;
				}
				if (local107 * 6.0D < 1.0D) {
					local58 = local89 + (local72 - local89) * 6.0D * local107;
				} else if (local107 * 2.0D < 1.0D) {
					local58 = local72;
				} else if (local107 * 3.0D < 2.0D) {
					local58 = local89 + (local72 - local89) * (0.6666666666666666D - local107) * 6.0D;
				} else {
					local58 = local89;
				}
			}
			local54 = Math.pow(local54, local19);
			local56 = Math.pow(local56, local19);
			local58 = Math.pow(local58, local19);
			@Pc(287) int local287 = (int) (local54 * 256.0D);
			@Pc(292) int local292 = (int) (local56 * 256.0D);
			@Pc(297) int local297 = (int) (local58 * 256.0D);
			@Pc(307) int local307 = (local292 << 8) + (local287 << 16) + local297;
			Static245.anIntArray376[local21] = local307;
		}
	}

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "(I)V")
	public static void method4044() {
		@Pc(5) byte local5 = 0;
		if (Static8.aClass173_Sub1_1.aBoolean317) {
			local5 = 55;
		}
		Static419.method5690(local5);
		Static113.aClass127_2.method2817(local5);
		Static354.aClass170_2.method3866(local5);
		Static336.aClass59_2.method1472(local5);
		Static93.aClass70_1.method1596(local5);
		Static58.method1093(local5);
		Static449.method5974(local5);
		Static176.method2771(local5);
		Static24.method338(local5);
		if (Static54.anInt1123 == 10) {
			Static260.method4007(28);
		} else if (Static54.anInt1123 == 30) {
			Static260.method4007(25);
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIFFIF)[F")
	public static float[] method4045(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[5] = 0.0F;
		local6[0] = local17;
		local6[2] = local25;
		local6[8] = local17;
		local6[7] = 0.0F;
		local6[4] = 1.0F;
		local6[6] = -local25;
		local6[1] = 0.0F;
		local6[3] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg5 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(83) float local83 = 1.0F - local77;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg2 * arg2 + arg0 * arg0));
		if (local105 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local79 = (float) arg0 / local105;
				local72 = (float) -arg2 / local105;
			}
			local70[6] = local72 * local79 * local83;
			local70[0] = local72 * local72 * local83 + local77;
			local70[4] = local77;
			local70[1] = local79 * local94;
			local70[3] = -local79 * local94;
			local70[5] = local94 * local72;
			local70[2] = local72 * local79 * local83;
			local70[8] = local83 * local79 * local79 + local77;
			local70[7] = -local72 * local94;
			local9[0] = local6[0] * local70[0] + local6[1] * local70[3] + local6[2] * local70[6];
			local9[1] = local70[7] * local6[2] + local6[1] * local70[4] + local70[1] * local6[0];
			local9[2] = local6[0] * local70[2] + local70[5] * local6[1] + local6[2] * local70[8];
			local9[3] = local70[3] * local6[4] + local6[3] * local70[0] + local6[5] * local70[6];
			local9[4] = local6[3] * local70[1] + local70[4] * local6[4] + local6[5] * local70[7];
			local9[5] = local70[8] * local6[5] + local6[4] * local70[5] + local6[3] * local70[2];
			local9[6] = local70[6] * local6[8] + local6[7] * local70[3] + local6[6] * local70[0];
			local9[7] = local70[7] * local6[8] + local6[7] * local70[4] + local70[1] * local6[6];
			local9[8] = local70[5] * local6[7] + local6[6] * local70[2] + local6[8] * local70[8];
		}
		local9[3] *= arg4;
		local9[6] *= arg3;
		local9[7] *= arg3;
		local9[2] *= arg6;
		local9[1] *= arg6;
		local9[8] *= arg3;
		local9[0] *= arg6;
		local9[4] *= arg4;
		local9[5] *= arg4;
		return local9;
	}
}
