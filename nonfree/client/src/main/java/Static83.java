import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
	public static int anInt2006;

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
	public static int anInt2007;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIII[I)V")
	public static void method1856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg1 > 0 && !Static78.method1703(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static78.method1703(arg4)) {
			@Pc(45) int local45 = 0;
			@Pc(61) int local61 = arg4 <= arg1 ? arg4 : arg1;
			@Pc(65) int local65 = arg1 >> 1;
			@Pc(69) int local69 = arg4 >> 1;
			@Pc(71) int[] local71 = arg5;
			@Pc(76) int[] local76 = new int[local65 * local69];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local45, arg2, arg1, arg4, 0, 32993, arg0, local71, 0);
				if (local61 <= 1) {
					return;
				}
				@Pc(93) int local93 = 0;
				@Pc(95) int local95 = 0;
				@Pc(100) int local100 = arg1;
				@Pc(102) int[] local102 = local76;
				for (@Pc(104) int local104 = 0; local104 < local69; local104++) {
					for (@Pc(108) int local108 = 0; local108 < local65; local108++) {
						@Pc(115) int local115 = local71[local95++];
						@Pc(120) int local120 = local71[local100++];
						@Pc(125) int local125 = local71[local95++];
						@Pc(131) int local131 = local115 >> 16 & 0xFF;
						@Pc(137) int local137 = local115 >> 24 & 0xFF;
						@Pc(143) int local143 = local115 >> 8 & 0xFF;
						@Pc(147) int local147 = local115 & 0xFF;
						@Pc(152) int local152 = local71[local100++];
						@Pc(160) int local160 = local143 + (local125 >> 8 & 0xFF);
						@Pc(166) int local166 = local147 + (local125 & 0xFF);
						@Pc(174) int local174 = local137 + (local125 >> 24 & 0xFF);
						@Pc(182) int local182 = local131 + (local125 >> 16 & 0xFF);
						@Pc(190) int local190 = local182 + (local120 >> 16 & 0xFF);
						@Pc(198) int local198 = local174 + (local120 >> 24 & 0xFF);
						@Pc(206) int local206 = local160 + (local120 >> 8 & 0xFF);
						@Pc(212) int local212 = local166 + (local120 & 0xFF);
						@Pc(218) int local218 = local212 + (local152 & 0xFF);
						@Pc(226) int local226 = local190 + (local152 >> 16 & 0xFF);
						@Pc(234) int local234 = local198 + (local152 >> 24 & 0xFF);
						@Pc(242) int local242 = local206 + (local152 >> 8 & 0xFF);
						local76[local93++] = (local242 & 0x3FC) << 6 | (local234 & 0x3FC) << 22 | (local226 & 0x3FC) << 14 | local218 >> 2 & 0xFF;
					}
					local100 += arg1;
					local95 += arg1;
				}
				local76 = local71;
				arg4 = local69;
				arg1 = local65;
				local71 = local102;
				local65 >>= 0x1;
				local69 >>= 0x1;
				local61 >>= 0x1;
				local45++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public static void method1857() {
		if (Static96.anInt2243 == 6) {
			Static10.method291(false);
		} else {
			Static121.aClass277_1 = Static491.aClass277_2;
			Static491.aClass277_2 = null;
			Static9.method278(12);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method1858(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local69 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(116) int local116;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local116 = 0; local116 < arg0; local116++) {
				if (local116 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(163) int local163;
		for (local116 = arg0 - 1; local116 >= 0; local116--) {
			for (local163 = 0; local163 < arg0; local163++) {
				if (local163 >= local116) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(205) int local205;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local205 = 0; local205 < arg0; local205++) {
				if (local205 <= local163 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(247) int local247;
		for (local205 = 0; local205 < arg0; local205++) {
			for (local247 = 0; local247 < arg0; local247++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local205 << 1 <= local247) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(309) int local309;
		for (local247 = 0; local247 < arg0; local247++) {
			for (local309 = arg0 - 1; local309 >= 0; local309--) {
				if (local309 <= local247 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(358) int local358;
		for (local309 = arg0 - 1; local309 >= 0; local309--) {
			for (local358 = arg0 - 1; local358 >= 0; local358--) {
				if (local309 << 1 <= local358) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(402) int local402;
		for (local358 = arg0 - 1; local358 >= 0; local358--) {
			for (local402 = arg0 - 1; local402 >= 0; local402--) {
				if (local358 >> 1 >= local402) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(451) int local451;
		for (local402 = arg0 - 1; local402 >= 0; local402--) {
			for (local451 = 0; local451 < arg0; local451++) {
				if (local402 << 1 <= local451) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(493) int local493;
		for (local451 = 0; local451 < arg0; local451++) {
			for (local493 = 0; local493 < arg0; local493++) {
				if (local451 >> 1 >= local493) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(542) int local542;
		for (local493 = 0; local493 < arg0; local493++) {
			for (local542 = arg0 - 1; local542 >= 0; local542--) {
				if (local542 >= local493 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(589) int local589;
		for (local542 = arg0 - 1; local542 >= 0; local542--) {
			for (local589 = 0; local589 < arg0; local589++) {
				if (local542 >> 1 <= local589) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(627) int local627;
		for (local589 = 0; local589 < arg0; local589++) {
			for (local627 = 0; local627 < arg0; local627++) {
				if (local589 << 1 >= local627) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(676) int local676;
		for (local627 = 0; local627 < arg0; local627++) {
			for (local676 = arg0 - 1; local676 >= 0; local676--) {
				if (local627 >> 1 <= local676) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(721) int local721;
		for (local676 = arg0 - 1; local676 >= 0; local676--) {
			for (local721 = arg0 - 1; local721 >= 0; local721--) {
				if (local721 <= local676 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(766) int local766;
		for (local721 = arg0 - 1; local721 >= 0; local721--) {
			for (local766 = arg0 - 1; local766 >= 0; local766--) {
				if (local721 >> 1 <= local766) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(811) int local811;
		for (local766 = arg0 - 1; local766 >= 0; local766--) {
			for (local811 = 0; local811 < arg0; local811++) {
				if (local766 << 1 >= local811) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(853) int local853;
		for (local811 = 0; local811 < arg0; local811++) {
			for (local853 = 0; local853 < arg0; local853++) {
				if (local853 >= local811 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(894) int local894;
		for (local853 = 0; local853 < arg0; local853++) {
			for (local894 = arg0 - 1; local894 >= 0; local894--) {
				if (local853 << 1 >= local894) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(939) int local939;
		for (local894 = 0; local894 < arg0; local894++) {
			for (local939 = 0; local939 < arg0; local939++) {
				if (arg0 / 2 >= local939) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(986) int local986;
		for (local939 = 0; local939 < arg0; local939++) {
			for (local986 = 0; local986 < arg0; local986++) {
				if (arg0 / 2 >= local939) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1033) int local1033;
		for (local986 = 0; local986 < arg0; local986++) {
			for (local1033 = 0; local1033 < arg0; local1033++) {
				if (arg0 / 2 <= local1033) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1084) int local1084;
		for (local1033 = 0; local1033 < arg0; local1033++) {
			for (local1084 = 0; local1084 < arg0; local1084++) {
				if (arg0 / 2 <= local1033) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1123) int local1123;
		for (local1084 = 0; local1084 < arg0; local1084++) {
			for (local1123 = 0; local1123 < arg0; local1123++) {
				if (local1123 <= local1084 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1167) int local1167;
		for (local1123 = arg0 - 1; local1123 >= 0; local1123--) {
			for (local1167 = 0; local1167 < arg0; local1167++) {
				if (local1123 - arg0 / 2 >= local1167) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1215) int local1215;
		for (local1167 = arg0 - 1; local1167 >= 0; local1167--) {
			for (local1215 = arg0 - 1; local1215 >= 0; local1215--) {
				if (local1215 <= local1167 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1260) int local1260;
		for (local1215 = 0; local1215 < arg0; local1215++) {
			for (local1260 = arg0 - 1; local1260 >= 0; local1260--) {
				if (local1260 <= local1215 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1308) int local1308;
		for (local1260 = 0; local1260 < arg0; local1260++) {
			for (local1308 = 0; local1308 < arg0; local1308++) {
				if (local1308 >= local1260 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1360) int local1360;
		for (local1308 = arg0 - 1; local1308 >= 0; local1308--) {
			for (local1360 = 0; local1360 < arg0; local1360++) {
				if (local1360 >= local1308 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1412) int local1412;
		for (local1360 = arg0 - 1; local1360 >= 0; local1360--) {
			for (local1412 = arg0 - 1; local1412 >= 0; local1412--) {
				if (local1360 - arg0 / 2 <= local1412) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1412 = 0; local1412 < arg0; local1412++) {
			for (@Pc(1457) int local1457 = arg0 - 1; local1457 >= 0; local1457--) {
				if (local1457 >= local1412 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(I)V")
	public static void method1859() {
		if (Static376.anInt9581 == -1 || Static166.anInt3847 == -1) {
			return;
		}
		@Pc(24) int local24 = Static406.anInt7657 + (Static402.anInt7565 * (Static79.anInt1880 - Static406.anInt7657) >> 16);
		Static402.anInt7565 += local24;
		if (Static402.anInt7565 >= 65535) {
			if (Static336.aBoolean473) {
				Static161.aBoolean373 = false;
			} else {
				Static161.aBoolean373 = true;
			}
			Static402.anInt7565 = 65535;
			Static336.aBoolean473 = true;
		} else {
			Static336.aBoolean473 = false;
			Static161.aBoolean373 = false;
		}
		@Pc(56) float local56 = (float) Static402.anInt7565 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static507.anInt9126 * 2;
		@Pc(89) int local89;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(143) int local143;
		@Pc(160) int local160;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static431.anIntArrayArrayArray14[Static376.anInt9581][local63][local65] * 3;
			local89 = Static431.anIntArrayArrayArray14[Static376.anInt9581][local63 + 1][local65] * 3;
			local121 = (Static431.anIntArrayArrayArray14[Static376.anInt9581][local63 + 2][local65] + Static431.anIntArrayArrayArray14[Static376.anInt9581][local63 + 2][local65] - Static431.anIntArrayArrayArray14[Static376.anInt9581][local63 + 3][local65]) * 3;
			local129 = Static431.anIntArrayArrayArray14[Static376.anInt9581][local63][local65];
			local134 = local89 - local77;
			local143 = local121 + local77 - local89 * 2;
			local160 = local89 + Static431.anIntArrayArrayArray14[Static376.anInt9581][local63 + 2][local65] - local121 - local129;
			local59[local65] = local56 * (((float) local143 + (float) local160 * local56) * local56 + (float) local134) + (float) local129;
		}
		Static368.anInt6832 = (int) local59[0] - Static61.anInt1459 * 128;
		Static6.anInt93 = (int) local59[2] - Static203.anInt4534 * 128;
		Static62.anInt1472 = (int) local59[1] * -1;
		@Pc(214) float[] local214 = new float[3];
		local89 = Static248.anInt5100 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static431.anIntArrayArrayArray14[Static166.anInt3847][local89][local121] * 3;
			local134 = Static431.anIntArrayArrayArray14[Static166.anInt3847][local89 + 1][local121] * 3;
			local143 = (Static431.anIntArrayArrayArray14[Static166.anInt3847][local89 + 2][local121] + Static431.anIntArrayArrayArray14[Static166.anInt3847][local89 + 2][local121] - Static431.anIntArrayArrayArray14[Static166.anInt3847][local89 - -3][local121]) * 3;
			local160 = Static431.anIntArrayArrayArray14[Static166.anInt3847][local89][local121];
			@Pc(289) int local289 = local134 - local129;
			@Pc(298) int local298 = local129 + local143 - local134 * 2;
			@Pc(316) int local316 = local134 + Static431.anIntArrayArrayArray14[Static166.anInt3847][local89 + 2][local121] - local160 - local143;
			local214[local121] = (float) local160 + local56 * (local56 * (local56 * (float) local316 + (float) local298) + (float) local289);
		}
		@Pc(357) float local357 = local214[0] - local59[0];
		@Pc(368) float local368 = (local214[1] - local59[1]) * -1.0F;
		@Pc(376) float local376 = local214[2] - local59[2];
		@Pc(386) double local386 = Math.sqrt((double) (local376 * local376 + local357 * local357));
		Static519.anInt9341 = (int) (Math.atan2((double) local368, local386) * 2607.5945876176133D) & 0x3FFF;
		Static248.anInt5104 = (int) (-Math.atan2((double) local357, (double) local376) * 2607.5945876176133D) & 0x3FFF;
		Static507.anInt9125 = (Static402.anInt7565 * (Static431.anIntArrayArrayArray14[Static376.anInt9581][local63 + 2][3] - Static431.anIntArrayArrayArray14[Static376.anInt9581][local63][3]) >> 16) + Static431.anIntArrayArrayArray14[Static376.anInt9581][local63][3];
	}
}
