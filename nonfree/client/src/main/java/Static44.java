import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
	public static int anInt740 = 0;

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "Lclient!dl;")
	public static final Class90 aClass90_1 = new Class90(128);

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
	public static void method711() {
		Static535.method7896(false);
		Static148.anInt2388 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static319.aByteArrayArray13.length; local14++) {
			if (Static13.anIntArray18[local14] != -1 && Static319.aByteArrayArray13[local14] == null) {
				Static319.aByteArrayArray13[local14] = Static609.aClass208_137.method4991(Static13.anIntArray18[local14], 0, 126);
				if (Static319.aByteArrayArray13[local14] == null) {
					Static148.anInt2388++;
					local12 = false;
				}
			}
			if (Static617.anIntArray562[local14] != -1 && Static445.aByteArrayArray24[local14] == null) {
				Static445.aByteArrayArray24[local14] = Static609.aClass208_137.method5002(Static617.anIntArray562[local14], Static261.anIntArrayArray30[local14], 0);
				if (Static445.aByteArrayArray24[local14] == null) {
					local12 = false;
					Static148.anInt2388++;
				}
			}
			if (Static401.anIntArray398[local14] != -1 && Static444.aByteArrayArray23[local14] == null) {
				Static444.aByteArrayArray23[local14] = Static609.aClass208_137.method4991(Static401.anIntArray398[local14], 0, 24);
				if (Static444.aByteArrayArray23[local14] == null) {
					Static148.anInt2388++;
					local12 = false;
				}
			}
			if (Static379.anIntArray374[local14] != -1 && Static411.aByteArrayArray21[local14] == null) {
				Static411.aByteArrayArray21[local14] = Static609.aClass208_137.method4991(Static379.anIntArray374[local14], 0, -118);
				if (Static411.aByteArrayArray21[local14] == null) {
					local12 = false;
					Static148.anInt2388++;
				}
			}
			if (Static293.anIntArray287 != null && Static494.aByteArrayArray27[local14] == null && Static293.anIntArray287[local14] != -1) {
				Static494.aByteArrayArray27[local14] = Static609.aClass208_137.method5002(Static293.anIntArray287[local14], Static261.anIntArrayArray30[local14], 0);
				if (Static494.aByteArrayArray27[local14] == null) {
					Static148.anInt2388++;
					local12 = false;
				}
			}
		}
		if (Static557.aClass197_1 == null) {
			if (Static341.aClass5_Sub5_Sub12_1 == null || !Static529.aClass208_117.method5000(Static341.aClass5_Sub5_Sub12_1.aString64 + "_staticelements")) {
				Static557.aClass197_1 = new Class197(0);
			} else if (Static529.aClass208_117.method5006(Static341.aClass5_Sub5_Sub12_1.aString64 + "_staticelements")) {
				Static557.aClass197_1 = Static217.method3114(Static529.aClass208_117, Static475.aBoolean605, Static341.aClass5_Sub5_Sub12_1.aString64 + "_staticelements");
			} else {
				Static148.anInt2388++;
				local12 = false;
			}
		}
		if (!local12) {
			Static73.anInt1183 = 1;
			return;
		}
		Static68.anInt1101 = 0;
		local12 = true;
		@Pc(316) int local316;
		@Pc(327) int local327;
		for (@Pc(297) int local297 = 0; local297 < Static319.aByteArrayArray13.length; local297++) {
			@Pc(303) byte[] local303 = Static445.aByteArrayArray24[local297];
			if (local303 != null) {
				local316 = (Static672.anIntArray621[local297] >> 8) * 64 - Static622.anInt10188;
				local327 = (Static672.anIntArray621[local297] & 0xFF) * 64 - Static668.anInt10683;
				if (Static452.anInt7483 != 0) {
					local327 = 10;
					local316 = 10;
				}
				local12 &= Static231.method3349(local327, local316, local303, Static282.anInt4887, Static544.anInt9261);
			}
			local303 = Static411.aByteArrayArray21[local297];
			if (local303 != null) {
				local316 = (Static672.anIntArray621[local297] >> 8) * 64 - Static622.anInt10188;
				local327 = (Static672.anIntArray621[local297] & 0xFF) * 64 - Static668.anInt10683;
				if (Static452.anInt7483 != 0) {
					local316 = 10;
					local327 = 10;
				}
				local12 &= Static231.method3349(local327, local316, local303, Static282.anInt4887, Static544.anInt9261);
			}
		}
		if (!local12) {
			Static73.anInt1183 = 2;
			return;
		}
		if (Static73.anInt1183 != 0) {
			Static299.method1114(true, Static582.aClass335_13.method8349(Static323.anInt5795) + "<br>(100%)", Static582.aClass80_12, Static570.aClass224_11, Static457.aClass57_11);
		}
		Static62.method873();
		Static234.method3394(-6177);
		Static471.method6860();
		@Pc(449) boolean local449 = false;
		if (Static457.aClass57_11.method7664() && Static637.aClass5_Sub20_31.aClass24_Sub28_1.method8607() == 2) {
			for (local316 = 0; local316 < Static319.aByteArrayArray13.length; local316++) {
				if (Static411.aByteArrayArray21[local316] != null || Static444.aByteArrayArray23[local316] != null) {
					local449 = true;
					break;
				}
			}
		}
		if (Static637.aClass5_Sub20_31.aClass24_Sub22_1.method6758() == 1) {
			local316 = Static512.anIntArray498[Static462.anInt7862];
		} else {
			local316 = Static92.anIntArray76[Static462.anInt7862];
		}
		if (Static457.aClass57_11.method7719()) {
			local316++;
		}
		Static57.method822(Static457.aClass57_11, Static453.anInt7760, Static544.anInt9261, Static282.anInt4887, local316, local449, Static457.aClass57_11.method7721() > 0);
		Static209.method3025(Static669.anInt10710);
		if (Static669.anInt10710 == 0) {
			Static427.method9311((Class80) null);
		} else {
			Static427.method9311(Static41.aClass80_2);
		}
		for (local327 = 0; local327 < 4; local327++) {
			Static670.aClass88Array1[local327].method1595();
		}
		Static478.method6968(28123);
		Static296.method9089(false, (byte) -119);
		Static272.method4038();
		Static420.aBoolean562 = false;
		Static86.aClass311_1 = null;
		Static62.method873();
		System.gc();
		Static535.method7896(true);
		Static197.method8875();
		Static361.anInt6292 = Static637.aClass5_Sub20_31.aClass24_Sub4_1.method1674();
		Static554.aBoolean713 = Static329.anInt5875 >= 96;
		Static441.aBoolean587 = Static637.aClass5_Sub20_31.aClass24_Sub28_1.method8607() == 2;
		Static122.aBoolean174 = Static637.aClass5_Sub20_31.aClass24_Sub5_1.method2086() == 1;
		Static49.anInt6791 = Static637.aClass5_Sub20_31.aClass24_Sub25_2.method7146() == 1 ? -1 : Static559.anInt9430;
		Static42.aBoolean166 = Static637.aClass5_Sub20_31.aClass24_Sub21_1.method6654() == 1;
		Static448.aBoolean589 = Static637.aClass5_Sub20_31.aClass24_Sub3_1.method1558() == 1;
		Static38.aClass153_Sub1_1 = new Class153_Sub1(4, Static544.anInt9261, Static282.anInt4887, false);
		if (Static452.anInt7483 == 0) {
			Static457.method6721(Static38.aClass153_Sub1_1, Static319.aByteArrayArray13);
		} else {
			Static589.method8458(Static38.aClass153_Sub1_1, Static319.aByteArrayArray13);
		}
		Static189.method2754(Static544.anInt9261 >> 4, Static282.anInt4887 >> 4);
		Static102.method8912();
		if (local449) {
			Static494.method7117(true);
			Static217.aClass153_Sub1_2 = new Class153_Sub1(1, Static544.anInt9261, Static282.anInt4887, true);
			if (Static452.anInt7483 == 0) {
				Static457.method6721(Static217.aClass153_Sub1_2, Static444.aByteArrayArray23);
				Static535.method7896(true);
			} else {
				Static589.method8458(Static217.aClass153_Sub1_2, Static444.aByteArrayArray23);
				Static535.method7896(true);
			}
			Static217.aClass153_Sub1_2.method3022(Static38.aClass153_Sub1_1.anIntArrayArrayArray9[0]);
			Static217.aClass153_Sub1_2.method3017(Static457.aClass57_11, (Class88[]) null, (int[][][]) null);
			Static494.method7117(false);
		}
		Static38.aClass153_Sub1_1.method3017(Static457.aClass57_11, Static670.aClass88Array1, local449 ? Static217.aClass153_Sub1_2.anIntArrayArrayArray9 : null);
		if (Static452.anInt7483 == 0) {
			Static535.method7896(true);
			Static18.method296(Static445.aByteArrayArray24, Static38.aClass153_Sub1_1);
			if (Static494.aByteArrayArray27 != null) {
				Static378.method5532();
			}
		} else {
			Static535.method7896(true);
			Static610.method8692(Static38.aClass153_Sub1_1, Static445.aByteArrayArray24);
		}
		Static234.method3394(-6177);
		if (Static329.anInt5875 < 96) {
			Static484.method7008();
		}
		Static535.method7896(true);
		Static38.aClass153_Sub1_1.method3012(Static457.aClass57_11, local449 ? Static134.aClass22Array1[0] : null, (Class22) null);
		Static38.aClass153_Sub1_1.method3031(Static457.aClass57_11, false);
		Static535.method7896(true);
		if (local449) {
			Static494.method7117(true);
			Static535.method7896(true);
			if (Static452.anInt7483 == 0) {
				Static18.method296(Static411.aByteArrayArray21, Static217.aClass153_Sub1_2);
			} else {
				Static610.method8692(Static217.aClass153_Sub1_2, Static411.aByteArrayArray21);
			}
			Static234.method3394(-6177);
			Static535.method7896(true);
			Static217.aClass153_Sub1_2.method3012(Static457.aClass57_11, (Class22) null, Static220.aClass22Array2[0]);
			Static217.aClass153_Sub1_2.method3031(Static457.aClass57_11, true);
			Static535.method7896(true);
			Static494.method7117(false);
		}
		Static405.method5940();
		@Pc(891) int local891 = Static38.aClass153_Sub1_1.anInt3431;
		if (local891 > Static240.anInt3974) {
			local891 = Static240.anInt3974;
		}
		if (Static240.anInt3974 - 1 > local891) {
			local891 = Static240.anInt3974 - 1;
		}
		if (Static637.aClass5_Sub20_31.aClass24_Sub25_2.method7146() == 0) {
			Static2.method24(local891);
		} else {
			Static2.method24(0);
		}
		@Pc(932) int local932;
		@Pc(936) int local936;
		for (@Pc(926) int local926 = 0; local926 < 4; local926++) {
			for (local932 = 0; local932 < Static544.anInt9261; local932++) {
				for (local936 = 0; local936 < Static282.anInt4887; local936++) {
					Static619.method3009(local936, local932, local926);
				}
			}
		}
		Static251.method3706();
		Static62.method873();
		Static71.method1135();
		Static234.method3394(-6177);
		Static534.method550();
		@Pc(1001) Class5_Sub50 local1001;
		if (Static675.aFrame3 != null && Static492.aClass295_1 != null && Static107.anInt1746 == 11) {
			local1001 = Static457.method6722(Static148.aClass387_29, Static80.aClass313_1);
			local1001.aClass5_Sub23_Sub2_2.method8486(1057001181);
			Static494.method7120(local1001);
		}
		if (Static452.anInt7483 == 0) {
			local932 = (Static128.anInt6986 - (Static544.anInt9261 >> 4)) / 8;
			local936 = ((Static544.anInt9261 >> 4) + Static128.anInt6986) / 8;
			@Pc(1035) int local1035 = (Static353.anInt6205 - (Static282.anInt4887 >> 4)) / 8;
			@Pc(1043) int local1043 = ((Static282.anInt4887 >> 4) + Static353.anInt6205) / 8;
			for (@Pc(1047) int local1047 = local932 - 1; local1047 <= local936 + 1; local1047++) {
				for (@Pc(1053) int local1053 = local1035 - 1; local1053 <= local1043 + 1; local1053++) {
					if (local1047 < local932 || local1047 > local936 || local1053 < local1035 || local1053 > local1043) {
						Static609.aClass208_137.method4990("m" + local1047 + "_" + local1053);
						Static609.aClass208_137.method4990("l" + local1047 + "_" + local1053);
					}
				}
			}
		}
		if (Static107.anInt1746 == 4) {
			Static21.method316(3);
		} else if (Static107.anInt1746 == 8) {
			Static21.method316(7);
		} else {
			Static21.method316(10);
			if (Static492.aClass295_1 != null) {
				local1001 = Static457.method6722(Static156.aClass387_31, Static80.aClass313_1);
				Static494.method7120(local1001);
			}
		}
		Static229.method3248();
		Static62.method873();
		Static442.method6547(125);
		Static554.aBoolean714 = true;
		if (Static240.aBoolean312) {
			Static619.method3013("Took: " + (Static515.method7499(100) - Static212.aLong104) + "ms");
			Static240.aBoolean312 = false;
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IFFF)F")
	public static float method712(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg0 * (arg1 - arg2) + arg2;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIIZII)V")
	public static void method713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static260.aClass174ArrayArrayArray2 == null) {
			Static457.aClass57_11.method7731(-16777216, arg4, arg0, arg3, arg1);
		} else if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 >= 0 && Static544.anInt9261 * 512 > Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 >= 0 && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 < Static282.anInt4887 * 512) {
			Static287.anInt5060++;
			if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 != null && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 - (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method5993() - 1) * 256 >> 9 == Static86.anInt1451 && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 + 256 - Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method5993() * 256 >> 9 == Static669.anInt10711) {
				Static86.anInt1451 = -1;
				Static669.anInt10711 = -1;
				Static522.method7559();
			}
			Static668.method9188();
			if (!arg2) {
				Static110.method1589();
			}
			Static509.method7451();
			Static521.method7549(arg3, arg1, true, arg0, arg4);
			@Pc(123) int local123 = Static212.anInt3463;
			Static243.anInt4189 = Static243.anInt4191;
			@Pc(127) int local127 = Static234.anInt3903;
			@Pc(134) int local134 = Static443.anInt7613;
			@Pc(136) int local136 = Static69.anInt1123;
			@Pc(151) int local151;
			@Pc(192) int local192;
			if (Static79.anInt1216 == 1) {
				local151 = (int) Static138.aFloat18;
				if (Static322.anInt5769 >> 8 > local151) {
					local151 = Static322.anInt5769 >> 8;
				}
				if (Static261.aBooleanArray7[4] && local151 < Static24.anIntArray29[4] + 128) {
					local151 = Static24.anIntArray29[4] + 128;
				}
				local192 = Static6.anInt81 + (int) Static429.aFloat132 & 0x3FFF;
				Static258.method3802(local151, Static380.method5559(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355, Static240.anInt3974, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363, 0) - 200, Static425.anInt7328, local123, local192, Static349.anInt6137, (local151 >> 3) * 3 + 600 << 2);
			} else if (Static79.anInt1216 == 4) {
				local151 = (int) Static138.aFloat18;
				if (Static322.anInt5769 >> 8 > local151) {
					local151 = Static322.anInt5769 >> 8;
				}
				if (Static261.aBooleanArray7[4] && Static24.anIntArray29[4] + 128 > local151) {
					local151 = Static24.anIntArray29[4] + 128;
				}
				local192 = (int) Static429.aFloat132 & 0x3FFF;
				Static258.method3802(local151, Static380.method5559(Static497.anInt10511, Static240.anInt3974, Static291.anInt5066, 0) - 200, Static425.anInt7328, local123, local192, Static349.anInt6137, (local151 >> 3) * 3 + 600 << 2);
			} else if (Static79.anInt1216 == 5) {
				Static670.method9242(local123);
			}
			local151 = Static532.anInt9189;
			local192 = Static132.anInt2186;
			@Pc(304) int local304 = Static489.anInt8202;
			@Pc(306) int local306 = Static649.anInt5976;
			@Pc(308) int local308 = Static159.anInt2475;
			@Pc(353) int local353;
			for (@Pc(310) int local310 = 0; local310 < 5; local310++) {
				if (Static261.aBooleanArray7[local310]) {
					local353 = (int) ((double) (Static311.anIntArray306[local310] * 2 + 1) * Math.random() - (double) Static311.anIntArray306[local310] + Math.sin((double) Static166.anIntArray148[local310] / 100.0D * (double) Static547.anIntArray521[local310]) * (double) Static24.anIntArray29[local310]);
					if (local310 == 3) {
						Static159.anInt2475 = Static159.anInt2475 + local353 & 0x3FFF;
					}
					if (local310 == 1) {
						Static132.anInt2186 += local353 << 2;
					}
					if (local310 == 2) {
						Static489.anInt8202 += local353 << 2;
					}
					if (local310 == 0) {
						Static532.anInt9189 += local353 << 2;
					}
					if (local310 == 4) {
						Static649.anInt5976 += local353;
						if (Static649.anInt5976 < 1024) {
							Static649.anInt5976 = 1024;
						} else if (Static649.anInt5976 > 3072) {
							Static649.anInt5976 = 3072;
						}
					}
				}
			}
			if (Static532.anInt9189 < 0) {
				Static532.anInt9189 = 0;
			}
			if (Static532.anInt9189 > (Static328.anInt5870 << 9) - 1) {
				Static532.anInt9189 = (Static328.anInt5870 << 9) - 1;
			}
			if (Static489.anInt8202 < 0) {
				Static489.anInt8202 = 0;
			}
			if (Static489.anInt8202 > (Static526.anInt8863 << 9) - 1) {
				Static489.anInt8202 = (Static526.anInt8863 << 9) - 1;
			}
			Static673.method9271();
			Static102.method8912();
			Static457.aClass57_11.KA(local136, local134, local136 + local127, local134 - -local123);
			Static281.method4144(true);
			if (Static40.aBoolean61) {
				Static425.method6318(3650, Static141.anInt4797);
				if (Static243.anInt4189 != Static633.anInt10297) {
					Static554.aBoolean714 = true;
				}
				Static633.anInt10297 = Static243.anInt4189;
			} else {
				Static457.aClass57_11.ya();
				local353 = Static141.anInt4797;
				if (Static86.aClass311_1 == null) {
					Static457.aClass57_11.GA(local353);
				} else {
					Static86.aClass311_1.method7507(Static649.anInt5976, local136, Static457.aClass57_11, local134, Static581.anInt9735 << 3, Static159.anInt2475, local353, local127, local123);
				}
			}
			Static62.method873();
			Static158.aClass203_4.method8327(Static532.anInt9189, Static132.anInt2186, Static489.anInt8202, -Static649.anInt5976 & 0x3FFF, -Static159.anInt2475 & 0x3FFF, -Static313.anInt5549 & 0x3FFF);
			Static457.aClass57_11.method7657(Static158.aClass203_4);
			Static457.aClass57_11.DA(local136 + local127 / 2, local123 / 2 + local134, Static382.anInt9819 << 1, Static382.anInt9819 << 1);
			Static230.method3288(local123 / 2 + local134, Static382.anInt9819 << 1, Static382.anInt9819 << 1, local127 / 2 + local136);
			Static564.method8145(Static489.anInt8202, -Static159.anInt2475 & 0x3FFF, Static132.anInt2186, -Static313.anInt5549 & 0x3FFF, Static532.anInt9189, -Static649.anInt5976 & 0x3FFF);
			@Pc(654) byte local654 = Static637.aClass5_Sub20_31.aClass24_Sub17_2.method6235() == 2 ? (byte) Static287.anInt5060 : 1;
			if (Static40.aBoolean61) {
				Static580.method8320(-Static313.anInt5549 & 0x3FFF, -Static159.anInt2475 & 0x3FFF, -Static649.anInt5976 & 0x3FFF);
				Static151.method2112(Static75.anIntArray55, Static132.anInt2186, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 >> 9, Static637.aClass5_Sub20_31.aClass24_Sub16_1.method5771() == 0, Static596.anIntArray553, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 + 1, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 >> 9, Static243.anInt4189, Static489.anInt8202, anInt740, Static163.anIntArray143, Static203.anIntArray193, Static532.anInt9189, local654, Static246.anIntArray241, Static240.aByteArrayArrayArray15);
			} else {
				Static563.method8131(anInt740, Static532.anInt9189, Static132.anInt2186, Static489.anInt8202, Static240.aByteArrayArrayArray15, Static163.anIntArray143, Static596.anIntArray553, Static75.anIntArray55, Static246.anIntArray241, Static203.anIntArray193, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 + 1, local654, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 >> 9, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 >> 9, Static637.aClass5_Sub20_31.aClass24_Sub16_1.method5771() == 0, Static565.aBoolean768 ? Static243.anInt4189 : -1, 0, false);
			}
			Static62.method873();
			if (Static107.anInt1746 == 10) {
				Static209.method3024(local123, local136, local134, local127);
				Static194.method2802(local136, local123, local127, local134);
				Static557.method8059(local127, local136, local123, local134);
				Static436.method6476(local127, local136, local123, local134);
			}
			Static514.method7492();
			Static489.anInt8202 = local304;
			Static132.anInt2186 = local192;
			Static649.anInt5976 = local306;
			Static159.anInt2475 = local308;
			Static532.anInt9189 = local151;
			if (Static343.aBoolean452 && Static410.aClass65_1.method1131() == 0) {
				Static343.aBoolean452 = false;
			}
			if (Static343.aBoolean452) {
				Static457.aClass57_11.method7731(-16777216, local136, local123, local127, local134);
				Static299.method1114(false, Static582.aClass335_13.method8349(Static323.anInt5795), Static582.aClass80_12, Static570.aClass224_11, Static457.aClass57_11);
			}
			Static281.method4144(false);
		} else {
			Static457.aClass57_11.method7731(-16777216, arg4, arg0, arg3, arg1);
		}
	}
}
