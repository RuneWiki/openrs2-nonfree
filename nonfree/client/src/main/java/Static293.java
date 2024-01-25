import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "Lclient!cj;")
	public static Class3_Sub4 aClass3_Sub4_2;

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
	public static int anInt5077 = 0;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "Lclient!us;")
	public static final Class234 aClass234_103 = new Class234(1, 3);

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)V")
	public static void method4553(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static188.aBooleanArray82[arg0]) {
			Static131.aClass20_37.method234(arg0);
			Static375.aClass62ArrayArray2[arg0] = null;
			Static181.aClass62ArrayArray1[arg0] = null;
			Static188.aBooleanArray82[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ef;I)V")
	public static void method4554(@OriginalArg(0) Class68 arg0) {
		@Pc(12) int local12;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(33) int local33;
		if (arg0 == Static391.aClass68_9) {
			local12 = Static26.aClass3_Sub5_Sub1_2.method2735();
			local21 = Static48.anInt1065 + (local12 >> 4 & 0x7);
			local27 = (local12 & 0x7) + Static289.anInt5033;
			local33 = Static26.aClass3_Sub5_Sub1_2.method2747();
			if (local21 >= 0 && local27 >= 0 && local21 < Static12.anInt161 && Static44.anInt787 > local27) {
				@Pc(65) Class3_Sub16 local65 = (Class3_Sub16) Static384.aClass44_39.method942((long) (local27 << 14 | Static98.anInt1965 << 28 | local21));
				if (local65 != null) {
					for (@Pc(75) Class3_Sub40 local75 = (Class3_Sub40) local65.aClass138_15.method3051(); local75 != null; local75 = (Class3_Sub40) local65.aClass138_15.method3050()) {
						if ((local33 & 0x7FFF) == local75.anInt6017) {
							local75.method5700();
							break;
						}
					}
					if (local65.aClass138_15.method3059()) {
						local65.method5700();
					}
					Static192.method3056(local21, Static98.anInt1965, local27);
				}
			}
			return;
		}
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(150) int local150;
		if (Static50.aClass68_4 == arg0) {
			local12 = Static26.aClass3_Sub5_Sub1_2.method2773();
			local21 = local12 >> 2;
			local27 = local12 & 0x3;
			local33 = Static138.anIntArray275[local21];
			local135 = Static26.aClass3_Sub5_Sub1_2.method2784();
			local143 = (local135 >> 4 & 0x7) + Static48.anInt1065;
			local150 = Static289.anInt5033 + (local135 & 0x7);
			if (local143 >= 0 && local150 >= 0 && local143 < Static12.anInt161 && local150 < Static44.anInt787) {
				Static303.method4695(local143, -1, Static98.anInt1965, local150, local27, local33, local21);
			}
		} else if (arg0 == Static48.aClass68_3) {
			local12 = Static26.aClass3_Sub5_Sub1_2.method2778();
			local21 = Static26.aClass3_Sub5_Sub1_2.method2747();
			local27 = Static26.aClass3_Sub5_Sub1_2.method2773();
			local33 = Static48.anInt1065 + (local27 >> 4 & 0x7);
			local135 = (local27 & 0x7) + Static289.anInt5033;
			if (local33 >= 0 && local135 >= 0 && Static12.anInt161 > local33 && Static44.anInt787 > local135) {
				Static152.method2388(local33, new Class3_Sub40(local12, local21), Static98.anInt1965, local135);
				Static192.method3056(local33, Static98.anInt1965, local135);
			}
		} else {
			@Pc(300) int local300;
			@Pc(304) int local304;
			@Pc(310) int local310;
			@Pc(316) int local316;
			@Pc(290) int local290;
			@Pc(296) int local296;
			@Pc(405) Class28_Sub1_Sub5 local405;
			if (arg0 == Static41.aClass68_2) {
				local12 = Static26.aClass3_Sub5_Sub1_2.method2739();
				local21 = (local12 >> 4 & 0xF) + Static48.anInt1065 * 2;
				local27 = Static289.anInt5033 * 2 + (local12 & 0xF);
				local33 = local21 + Static26.aClass3_Sub5_Sub1_2.method2753();
				local135 = local27 + Static26.aClass3_Sub5_Sub1_2.method2753();
				local143 = Static26.aClass3_Sub5_Sub1_2.method2740();
				local150 = Static26.aClass3_Sub5_Sub1_2.method2767();
				local290 = Static26.aClass3_Sub5_Sub1_2.method2739() * 4;
				local296 = Static26.aClass3_Sub5_Sub1_2.method2739() * 4;
				local300 = Static26.aClass3_Sub5_Sub1_2.method2767();
				local304 = Static26.aClass3_Sub5_Sub1_2.method2767();
				local310 = Static26.aClass3_Sub5_Sub1_2.method2739();
				local316 = Static26.aClass3_Sub5_Sub1_2.method2739();
				if (local310 == 255) {
					local310 = -1;
				}
				if (local21 >= 0 && local27 >= 0 && Static12.anInt161 * 2 > local21 && Static12.anInt161 * 2 > local27 && local33 >= 0 && local135 >= 0 && Static44.anInt787 * 2 > local33 && Static44.anInt787 * 2 > local135 && local150 != 65535) {
					local21 *= 64;
					local135 *= 64;
					local27 = local27 * 64;
					local33 = local33 * 64;
					local405 = new Class28_Sub1_Sub5(local150, Static98.anInt1965, local21, local27, Static55.method1005(local27, Static98.anInt1965, local21) - local290, Static76.anInt1617 + local300, Static76.anInt1617 + local304, local310, local316, local143, local296);
					local405.method5074(local33, local135, Static76.anInt1617 + local300, -local296 + Static55.method1005(local135, Static98.anInt1965, local33));
					Static182.aClass138_22.method3053(new Class3_Sub7_Sub17(local405));
				}
			} else if (arg0 == Static387.aClass68_16) {
				local12 = Static26.aClass3_Sub5_Sub1_2.method2739();
				local21 = (local12 >> 4 & 0x7) + Static48.anInt1065;
				local27 = Static289.anInt5033 + (local12 & 0x7);
				local33 = local21 + Static26.aClass3_Sub5_Sub1_2.method2753();
				local135 = Static26.aClass3_Sub5_Sub1_2.method2753() + local27;
				local143 = Static26.aClass3_Sub5_Sub1_2.method2740();
				local150 = Static26.aClass3_Sub5_Sub1_2.method2767();
				local290 = Static26.aClass3_Sub5_Sub1_2.method2739() * 4;
				local296 = Static26.aClass3_Sub5_Sub1_2.method2739() * 4;
				local300 = Static26.aClass3_Sub5_Sub1_2.method2767();
				local304 = Static26.aClass3_Sub5_Sub1_2.method2767();
				local310 = Static26.aClass3_Sub5_Sub1_2.method2739();
				local316 = Static26.aClass3_Sub5_Sub1_2.method2739();
				if (local310 == 255) {
					local310 = -1;
				}
				if (local21 >= 0 && local27 >= 0 && local21 < Static12.anInt161 && local27 < Static44.anInt787 && local33 >= 0 && local135 >= 0 && local33 < Static12.anInt161 && Static44.anInt787 > local135 && local150 != 65535) {
					local135 = local135 * 128 + 64;
					local21 = local21 * 128 + 64;
					local27 = local27 * 128 + 64;
					local33 = local33 * 128 + 64;
					local405 = new Class28_Sub1_Sub5(local150, Static98.anInt1965, local21, local27, Static55.method1005(local27, Static98.anInt1965, local21) - local290, local300 - -Static76.anInt1617, local304 + Static76.anInt1617, local310, local316, local143, local296);
					local405.method5074(local33, local135, local300 + Static76.anInt1617, Static55.method1005(local135, Static98.anInt1965, local33) + -local296);
					Static182.aClass138_22.method3053(new Class3_Sub7_Sub17(local405));
				}
			} else {
				@Pc(695) int local695;
				if (arg0 == Static365.aClass68_15) {
					local12 = Static26.aClass3_Sub5_Sub1_2.method2778();
					@Pc(637) byte local637 = Static26.aClass3_Sub5_Sub1_2.method2776();
					local27 = Static26.aClass3_Sub5_Sub1_2.method2767();
					@Pc(645) byte local645 = Static26.aClass3_Sub5_Sub1_2.method2734();
					@Pc(649) byte local649 = Static26.aClass3_Sub5_Sub1_2.method2753();
					local143 = Static26.aClass3_Sub5_Sub1_2.method2785();
					local150 = Static26.aClass3_Sub5_Sub1_2.method2739();
					local290 = local150 >> 2;
					local296 = local150 & 0x3;
					local300 = Static26.aClass3_Sub5_Sub1_2.method2767();
					@Pc(675) byte local675 = Static26.aClass3_Sub5_Sub1_2.method2738();
					local310 = Static26.aClass3_Sub5_Sub1_2.method2773();
					local316 = Static48.anInt1065 + (local310 >> 4 & 0x7);
					local695 = Static289.anInt5033 + (local310 & 0x7);
					if (!Static347.aClass155_9.method4882()) {
						Static336.method1971(local296, local637, local649, local316, local12, local645, local143, local300, Static98.anInt1965, local675, local695, local290, local27);
					}
				} else if (arg0 == Static156.aClass68_10) {
					local12 = Static26.aClass3_Sub5_Sub1_2.method2735();
					local21 = local12 >> 2;
					local27 = local12 & 0x3;
					local33 = Static138.anIntArray275[local21];
					local135 = Static26.aClass3_Sub5_Sub1_2.method2735();
					local143 = Static48.anInt1065 + (local135 >> 4 & 0x7);
					local150 = Static289.anInt5033 + (local135 & 0x7);
					local290 = Static26.aClass3_Sub5_Sub1_2.method2767();
					if (local143 >= 0 && local150 >= 0 && Static12.anInt161 > local143 && local150 < Static44.anInt787) {
						Static303.method4695(local143, local290, Static98.anInt1965, local150, local27, local33, local21);
					}
				} else if (Static256.aClass68_11 == arg0) {
					local12 = Static26.aClass3_Sub5_Sub1_2.method2739();
					local21 = Static48.anInt1065 + (local12 >> 4 & 0x7);
					local27 = (local12 & 0x7) + Static289.anInt5033;
					local33 = Static26.aClass3_Sub5_Sub1_2.method2787();
					if (local33 == 65535) {
						local33 = -1;
					}
					local135 = Static26.aClass3_Sub5_Sub1_2.method2735();
					local143 = local135 >> 2;
					local150 = local135 & 0x3;
					local290 = Static138.anIntArray275[local143];
					Static363.method5518(local33, Static98.anInt1965, local150, local290, local21, local143, local27);
				} else if (Static350.aClass68_14 == arg0) {
					local12 = Static26.aClass3_Sub5_Sub1_2.method2767();
					local21 = Static26.aClass3_Sub5_Sub1_2.method2739();
					Static97.aClass217_4.method5007(local12).method1192(local21);
				} else if (Static81.aClass68_6 == arg0) {
					local12 = Static26.aClass3_Sub5_Sub1_2.method2739();
					local21 = (local12 >> 4 & 0x7) + Static48.anInt1065;
					local27 = (local12 & 0x7) + Static289.anInt5033;
					local33 = Static26.aClass3_Sub5_Sub1_2.method2767();
					if (local33 == 65535) {
						local33 = -1;
					}
					local135 = Static26.aClass3_Sub5_Sub1_2.method2739();
					local143 = local135 >> 4 & 0xF;
					local150 = local135 & 0x7;
					local290 = Static26.aClass3_Sub5_Sub1_2.method2739();
					local296 = Static26.aClass3_Sub5_Sub1_2.method2739();
					if (local21 >= 0 && local27 >= 0 && local21 < Static12.anInt161 && local27 < Static44.anInt787) {
						local300 = local143 + 1;
						if (Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray491[0] >= local21 - local300 && local21 + local300 >= Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray491[0] && local27 - local300 <= Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray490[0] && local300 + local27 >= Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray490[0] && Static164.aClass154_Sub1_1.anInt6055 != 0 && local150 > 0 && Static117.anInt2227 < 50 && local33 != -1) {
							Static127.anIntArray245[Static117.anInt2227] = local33;
							Static138.anIntArray276[Static117.anInt2227] = local150;
							Static336.anIntArray236[Static117.anInt2227] = local290;
							Static205.aClass71Array2[Static117.anInt2227] = null;
							Static250.anIntArray578[Static117.anInt2227] = (Static98.anInt1965 << 24) + (local21 << 16) + (local27 << 8) + local143;
							Static289.anIntArray561[Static117.anInt2227] = local296;
							Static117.anInt2227++;
						}
					}
				} else if (arg0 == Static37.aClass68_1) {
					Static26.aClass3_Sub5_Sub1_2.method2739();
					local12 = Static26.aClass3_Sub5_Sub1_2.method2739();
					local21 = (local12 >> 4 & 0x7) + Static48.anInt1065;
					local27 = (local12 & 0x7) + Static289.anInt5033;
					local33 = Static26.aClass3_Sub5_Sub1_2.method2767();
					local135 = Static26.aClass3_Sub5_Sub1_2.method2739();
					local143 = Static26.aClass3_Sub5_Sub1_2.method2786();
					@Pc(1105) String local1105 = Static26.aClass3_Sub5_Sub1_2.method2788();
					Static118.method1897(local143, local1105, Static98.anInt1965, local135, local27, local21, local33);
				} else if (Static76.aClass68_5 == arg0) {
					local12 = Static26.aClass3_Sub5_Sub1_2.method2739();
					local21 = (local12 >> 4 & 0x7) + Static48.anInt1065;
					local27 = (local12 & 0x7) + Static289.anInt5033;
					local33 = Static26.aClass3_Sub5_Sub1_2.method2767();
					local135 = Static26.aClass3_Sub5_Sub1_2.method2767();
					local143 = Static26.aClass3_Sub5_Sub1_2.method2767();
					if (Static384.aClass44_39 != null && local21 >= 0 && local27 >= 0 && local21 < Static12.anInt161 && Static44.anInt787 > local27) {
						@Pc(1189) Class3_Sub16 local1189 = (Class3_Sub16) Static384.aClass44_39.method942((long) (local27 << 14 | Static98.anInt1965 << 28 | local21));
						if (local1189 != null) {
							for (@Pc(1199) Class3_Sub40 local1199 = (Class3_Sub40) local1189.aClass138_15.method3051(); local1199 != null; local1199 = (Class3_Sub40) local1189.aClass138_15.method3050()) {
								if (local1199.anInt6017 == (local33 & 0x7FFF) && local1199.anInt6018 == local135) {
									local1199.method5700();
									local1199.anInt6018 = local143;
									Static152.method2388(local21, local1199, Static98.anInt1965, local27);
									break;
								}
							}
							Static192.method3056(local21, Static98.anInt1965, local27);
						}
					}
				} else if (Static273.aClass68_12 == arg0) {
					local12 = Static26.aClass3_Sub5_Sub1_2.method2739();
					local21 = (local12 >> 4 & 0xF) + Static48.anInt1065 * 2;
					local27 = Static289.anInt5033 * 2 + (local12 & 0xF);
					local33 = Static26.aClass3_Sub5_Sub1_2.method2753() + local21;
					local135 = local27 + Static26.aClass3_Sub5_Sub1_2.method2753();
					local143 = Static26.aClass3_Sub5_Sub1_2.method2740();
					local150 = Static26.aClass3_Sub5_Sub1_2.method2740();
					local290 = Static26.aClass3_Sub5_Sub1_2.method2767();
					local296 = Static26.aClass3_Sub5_Sub1_2.method2753();
					local300 = Static26.aClass3_Sub5_Sub1_2.method2739() * 4;
					local304 = Static26.aClass3_Sub5_Sub1_2.method2767();
					local310 = Static26.aClass3_Sub5_Sub1_2.method2767();
					local316 = Static26.aClass3_Sub5_Sub1_2.method2739();
					if (local316 == 255) {
						local316 = -1;
					}
					local695 = Static26.aClass3_Sub5_Sub1_2.method2739();
					if (local21 >= 0 && local27 >= 0 && Static12.anInt161 * 2 > local21 && Static12.anInt161 * 2 > local27 && local33 >= 0 && local135 >= 0 && local33 < Static44.anInt787 * 2 && local135 < Static44.anInt787 * 2 && local290 != 65535) {
						local135 *= 64;
						local27 = local27 * 64;
						local21 = local21 * 64;
						local33 = local33 * 64;
						if (local143 != 0) {
							@Pc(1424) int local1424;
							@Pc(1428) Class28_Sub1_Sub1 local1428;
							@Pc(1414) int local1414;
							@Pc(1418) int local1418;
							if (local143 >= 0) {
								local1414 = local143 - 1;
								local1418 = local1414 & 0x7FF;
								local1424 = local1414 >> 11 & 0xF;
								local1428 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local1418];
							} else {
								local1414 = -local143 - 1;
								local1424 = local1414 >> 11 & 0xF;
								local1418 = local1414 & 0x7FF;
								if (local1418 == Static376.anInt6265) {
									local1428 = Static226.aClass28_Sub1_Sub1_Sub2_2;
								} else {
									local1428 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local1418];
								}
							}
							if (local1428 != null) {
								@Pc(1462) Class36 local1462 = local1428.method4014();
								if (local1462.anIntArrayArray6 != null && local1462.anIntArrayArray6[local1424] != null) {
									local1418 = local1462.anIntArrayArray6[local1424][0];
									@Pc(1484) int local1484 = local1462.anIntArrayArray6[local1424][2];
									@Pc(1489) int local1489 = local1428.aClass251_7.method5710();
									@Pc(1493) int local1493 = Class226.anIntArray614[local1489];
									@Pc(1497) int local1497 = Class226.anIntArray613[local1489];
									@Pc(1508) int local1508 = local1493 * local1484 + local1418 * local1497 >> 15;
									@Pc(1519) int local1519 = local1497 * local1484 - local1493 * local1418 >> 15;
									local296 -= local1462.anIntArrayArray6[local1424][1];
									local21 += local1508;
									local27 += local1519;
								}
							}
						}
						@Pc(1565) Class28_Sub1_Sub5 local1565 = new Class28_Sub1_Sub5(local290, Static98.anInt1965, local21, local27, Static55.method1005(local27, Static98.anInt1965, local21) - local296, local304 - -Static76.anInt1617, Static76.anInt1617 + local310, local316, local695, local150, local300);
						local1565.method5074(local33, local135, local304 + Static76.anInt1617, -local300 + Static55.method1005(local135, Static98.anInt1965, local33));
						Static182.aClass138_22.method3053(new Class3_Sub7_Sub17(local1565));
					}
				} else if (Static291.aClass68_13 == arg0) {
					local12 = Static26.aClass3_Sub5_Sub1_2.method2739();
					local21 = Static48.anInt1065 + (local12 >> 4 & 0x7);
					local27 = Static289.anInt5033 + (local12 & 0x7);
					local33 = Static26.aClass3_Sub5_Sub1_2.method2767();
					local135 = Static26.aClass3_Sub5_Sub1_2.method2739();
					local143 = Static26.aClass3_Sub5_Sub1_2.method2767();
					if (local21 >= 0 && local27 >= 0 && local21 < Static12.anInt161 && local27 < Static44.anInt787) {
						local150 = local21 * 128 + 64;
						local290 = local27 * 128 + 64;
						@Pc(1675) Class28_Sub1_Sub4 local1675 = new Class28_Sub1_Sub4(local33, local143, Static76.anInt1617, Static98.anInt1965, local150, Static55.method1005(local290, Static98.anInt1965, local150) - local135, local290, local21, local21, local27, local27);
						Static93.aClass138_10.method3053(new Class3_Sub7_Sub13(local1675));
					}
				} else if (arg0 == Static109.aClass68_7) {
					local12 = Static26.aClass3_Sub5_Sub1_2.method2747();
					local21 = Static26.aClass3_Sub5_Sub1_2.method2767();
					local27 = Static26.aClass3_Sub5_Sub1_2.method2784();
					local33 = Static48.anInt1065 + (local27 >> 4 & 0x7);
					local135 = Static289.anInt5033 + (local27 & 0x7);
					local143 = Static26.aClass3_Sub5_Sub1_2.method2767();
					if (local33 >= 0 && local135 >= 0 && local33 < Static12.anInt161 && Static44.anInt787 > local135 && Static376.anInt6265 != local12) {
						Static152.method2388(local33, new Class3_Sub40(local143, local21), Static98.anInt1965, local135);
						Static192.method3056(local33, Static98.anInt1965, local135);
					}
				} else {
					Static355.method5328("T3 - " + arg0, null);
					Static53.method988();
				}
			}
		}
	}
}
