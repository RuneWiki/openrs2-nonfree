import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_50 = new Class269(32, 4);

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "[I")
	public static final int[] anIntArray348 = new int[16];

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
	public static void method4230() {
		if (Static160.anInt3633 == -1 || Static144.anInt3307 == -1) {
			return;
		}
		@Pc(21) int local21 = Static515.anInt8630 + ((Static414.anInt7572 - Static515.anInt8630) * Static217.anInt4525 >> 16);
		Static217.anInt4525 += local21;
		if (Static217.anInt4525 < 65535) {
			Static118.aBoolean251 = false;
			Static405.aBoolean562 = false;
		} else {
			if (Static118.aBoolean251) {
				Static405.aBoolean562 = false;
			} else {
				Static405.aBoolean562 = true;
			}
			Static217.anInt4525 = 65535;
			Static118.aBoolean251 = true;
		}
		@Pc(49) float local49 = (float) Static217.anInt4525 / 65535.0F;
		@Pc(52) float[] local52 = new float[3];
		@Pc(56) int local56 = Static495.anInt8417 * 2;
		@Pc(81) int local81;
		@Pc(113) int local113;
		@Pc(121) int local121;
		@Pc(126) int local126;
		@Pc(135) int local135;
		@Pc(153) int local153;
		for (@Pc(58) int local58 = 0; local58 < 3; local58++) {
			@Pc(69) int local69 = Static630.anIntArrayArrayArray20[Static160.anInt3633][local56][local58] * 3;
			local81 = Static630.anIntArrayArrayArray20[Static160.anInt3633][local56 + 1][local58] * 3;
			local113 = (Static630.anIntArrayArrayArray20[Static160.anInt3633][local56 + 2][local58] + Static630.anIntArrayArrayArray20[Static160.anInt3633][local56 + 2][local58] - Static630.anIntArrayArrayArray20[Static160.anInt3633][local56 + 3][local58]) * 3;
			local121 = Static630.anIntArrayArrayArray20[Static160.anInt3633][local56][local58];
			local126 = local81 - local69;
			local135 = local69 + local113 - local81 * 2;
			local153 = local81 + Static630.anIntArrayArrayArray20[Static160.anInt3633][local56 + 2][local58] - local113 - local121;
			local52[local58] = (float) local121 + local49 * ((float) local126 + ((float) local135 + (float) local153 * local49) * local49);
		}
		Static53.anInt1153 = (int) local52[0] - Static451.anInt7933 * 512;
		Static64.anInt1371 = (int) local52[1] * -1;
		Static395.anInt3530 = (int) local52[2] - Static470.anInt8063 * 512;
		@Pc(207) float[] local207 = new float[3];
		local81 = Static456.anInt7967 * 2;
		for (local113 = 0; local113 < 3; local113++) {
			local121 = Static630.anIntArrayArrayArray20[Static144.anInt3307][local81][local113] * 3;
			local126 = Static630.anIntArrayArrayArray20[Static144.anInt3307][local81 + 1][local113] * 3;
			local135 = (Static630.anIntArrayArrayArray20[Static144.anInt3307][local81 + 2][local113] + Static630.anIntArrayArrayArray20[Static144.anInt3307][local81 + 2][local113] - Static630.anIntArrayArrayArray20[Static144.anInt3307][local81 + 3][local113]) * 3;
			local153 = Static630.anIntArrayArrayArray20[Static144.anInt3307][local81][local113];
			@Pc(281) int local281 = local126 - local121;
			@Pc(290) int local290 = local135 + local121 - local126 * 2;
			@Pc(308) int local308 = Static630.anIntArrayArrayArray20[Static144.anInt3307][local81 + 2][local113] + local126 - local153 - local135;
			local207[local113] = ((float) local281 + ((float) local290 + local49 * (float) local308) * local49) * local49 + (float) local153;
		}
		@Pc(340) float local340 = local207[0] - local52[0];
		@Pc(351) float local351 = (local207[1] - local52[1]) * -1.0F;
		@Pc(364) float local364 = local207[2] - local52[2];
		@Pc(374) double local374 = Math.sqrt((double) (local340 * local340 + local364 * local364));
		Static512.anInt8589 = (int) (Math.atan2((double) local351, local374) * 2607.5945876176133D) & 0x3FFF;
		Static105.anInt2114 = (int) (-Math.atan2((double) local340, (double) local364) * 2607.5945876176133D) & 0x3FFF;
		Static103.anInt2093 = (Static217.anInt4525 * (Static630.anIntArrayArrayArray20[Static160.anInt3633][local56 + 2][3] - Static630.anIntArrayArrayArray20[Static160.anInt3633][local56][3]) >> 16) + Static630.anIntArrayArrayArray20[Static160.anInt3633][local56][3];
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
	public static void method4231() {
		@Pc(7) int local7 = Static313.aClass2_Sub34_Sub2_1.method6884();
		@Pc(21) boolean local21 = Static313.aClass2_Sub34_Sub2_1.method6867() == 1;
		@Pc(25) int local25 = Static313.aClass2_Sub34_Sub2_1.method6911();
		Static462.anInt8018 = Static313.aClass2_Sub34_Sub2_1.method6904();
		@Pc(33) int local33 = Static313.aClass2_Sub34_Sub2_1.method6867();
		Static259.method4235();
		Static586.method8086(local33);
		Static313.aClass2_Sub34_Sub2_1.method6927();
		@Pc(46) int local46;
		@Pc(49) int local49;
		@Pc(55) int local55;
		for (@Pc(43) int local43 = 0; local43 < 4; local43++) {
			for (local46 = 0; local46 < Static3.anInt46 >> 3; local46++) {
				for (local49 = 0; local49 < Static270.anInt5194 >> 3; local49++) {
					local55 = Static313.aClass2_Sub34_Sub2_1.method6925(1);
					if (local55 == 1) {
						Static447.anIntArrayArrayArray10[local43][local46][local49] = Static313.aClass2_Sub34_Sub2_1.method6925(26);
					} else {
						Static447.anIntArrayArrayArray10[local43][local46][local49] = -1;
					}
				}
			}
		}
		Static313.aClass2_Sub34_Sub2_1.method6923();
		local46 = (Static44.anInt971 - Static313.aClass2_Sub34_Sub2_1.anInt8188) / 16;
		Static564.anIntArrayArray73 = new int[local46][4];
		for (local49 = 0; local49 < local46; local49++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static564.anIntArrayArray73[local49][local55] = Static313.aClass2_Sub34_Sub2_1.method6865();
			}
		}
		Static516.anIntArray595 = new int[local46];
		Static237.aByteArrayArray12 = null;
		Static440.anIntArray533 = new int[local46];
		Static350.anIntArray421 = null;
		Static349.anIntArray395 = new int[local46];
		Static501.aByteArrayArray20 = new byte[local46][];
		Static478.aByteArrayArray18 = new byte[local46][];
		Static502.anIntArray283 = new int[local46];
		Static501.aByteArrayArray19 = new byte[local46][];
		Static19.aByteArrayArray10 = new byte[local46][];
		Static633.anIntArray729 = new int[local46];
		local46 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(177) int local177 = 0; local177 < Static3.anInt46 >> 3; local177++) {
				for (@Pc(180) int local180 = 0; local180 < Static270.anInt5194 >> 3; local180++) {
					@Pc(189) int local189 = Static447.anIntArrayArrayArray10[local55][local177][local180];
					if (local189 != -1) {
						@Pc(199) int local199 = local189 >> 14 & 0x3FF;
						@Pc(205) int local205 = local189 >> 3 & 0x7FF;
						@Pc(215) int local215 = local205 / 8 + (local199 / 8 << 8);
						for (@Pc(217) int local217 = 0; local217 < local46; local217++) {
							if (local215 == Static349.anIntArray395[local217]) {
								local215 = -1;
								break;
							}
						}
						if (local215 != -1) {
							Static349.anIntArray395[local46] = local215;
							@Pc(247) int local247 = local215 >> 8 & 0xFF;
							@Pc(251) int local251 = local215 & 0xFF;
							Static633.anIntArray729[local46] = Static48.aClass97_6.method2574("m" + local247 + "_" + local251);
							Static516.anIntArray595[local46] = Static48.aClass97_6.method2574("l" + local247 + "_" + local251);
							Static440.anIntArray533[local46] = Static48.aClass97_6.method2574("um" + local247 + "_" + local251);
							Static502.anIntArray283[local46] = Static48.aClass97_6.method2574("ul" + local247 + "_" + local251);
							local46++;
						}
					}
				}
			}
		}
		Static516.method7251(local21, local25, 11, local7);
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)I")
	public static int method4233() {
		return Static244.anInt4841 == 1 ? Static134.anInt3047 : 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Z")
	public static boolean method4234(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
