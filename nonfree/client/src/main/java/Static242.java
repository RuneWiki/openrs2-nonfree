import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
	public static int anInt4631;

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_146 = new Class189("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!bu;Lclient!bu;Lclient!bu;ZLclient!bu;)V")
	public static void method3659(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(4) Class32 arg3) {
		Static8.aClass32_77 = arg0;
		Static369.aClass32_79 = arg2;
		Static30.aClass32_9 = arg3;
		Static195.aClass32_47 = arg1;
		Static178.aClass156ArrayArray2 = new Class156[Static369.aClass32_79.method809()][];
		Static414.aBooleanArray22 = new boolean[Static369.aClass32_79.method809()];
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!gr;I)V")
	public static void method3660(@OriginalArg(0) Class95 arg0) {
		@Pc(10) int local10;
		@Pc(20) int local20;
		@Pc(28) int local28;
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(155) int local155;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(86) int local86;
		@Pc(46) int local46;
		@Pc(52) int local52;
		@Pc(39) boolean local39;
		@Pc(74) int local74;
		if (Static444.aClass95_16 == arg0) {
			local10 = Static237.aClass3_Sub7_Sub1_1.method2582();
			local20 = Static59.anInt3263 * 2 + (local10 >> 4 & 0xF);
			local28 = Static440.anInt7425 * 2 + (local10 & 0xF);
			local39 = Static237.aClass3_Sub7_Sub1_1.method2582() != 0;
			local46 = local20 + Static237.aClass3_Sub7_Sub1_1.method2612();
			local52 = local28 + Static237.aClass3_Sub7_Sub1_1.method2612();
			local56 = Static237.aClass3_Sub7_Sub1_1.method2641();
			local60 = Static237.aClass3_Sub7_Sub1_1.method2641();
			local64 = Static237.aClass3_Sub7_Sub1_1.method2588();
			@Pc(68) byte local68 = Static237.aClass3_Sub7_Sub1_1.method2612();
			local74 = Static237.aClass3_Sub7_Sub1_1.method2582() * 4;
			local78 = Static237.aClass3_Sub7_Sub1_1.method2588();
			local82 = Static237.aClass3_Sub7_Sub1_1.method2588();
			local86 = Static237.aClass3_Sub7_Sub1_1.method2582();
			@Pc(90) int local90 = Static237.aClass3_Sub7_Sub1_1.method2582();
			if (local86 == 255) {
				local86 = -1;
			}
			if (local20 >= 0 && local28 >= 0 && local20 < Static40.anInt1089 * 2 && Static40.anInt1089 * 2 > local28 && local46 >= 0 && local52 >= 0 && Static44.anInt7276 * 2 > local46 && Static44.anInt7276 * 2 > local52 && local64 != 65535) {
				local28 *= 64;
				local74 <<= 0x0;
				local155 = local68 << 0;
				local46 = local46 * 64;
				local52 *= 64;
				local20 *= 64;
				if (local56 != 0) {
					@Pc(184) int local184;
					@Pc(192) Class7_Sub2_Sub3 local192;
					@Pc(178) int local178;
					@Pc(188) int local188;
					if (local56 >= 0) {
						local178 = local56 - 1;
						local184 = local178 >> 11 & 0xF;
						local188 = local178 & 0x7FF;
						local192 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local188];
					} else {
						local178 = -local56 - 1;
						local188 = local178 & 0x7FF;
						local184 = local178 >> 11 & 0xF;
						if (Static319.anInt1936 == local188) {
							local192 = Static379.aClass7_Sub2_Sub3_Sub2_2;
						} else {
							local192 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local188];
						}
					}
					if (local192 != null) {
						@Pc(228) Class1 local228 = local192.method3514();
						if (local228.anIntArrayArray1 != null && local228.anIntArrayArray1[local184] != null) {
							local188 = local228.anIntArrayArray1[local184][0];
							@Pc(250) int local250 = local228.anIntArrayArray1[local184][2];
							@Pc(257) int local257 = local192.aClass91_7.method2048();
							@Pc(261) int local261 = Class3_Sub2_Sub17.anIntArray289[local257];
							@Pc(265) int local265 = Class3_Sub2_Sub17.anIntArray290[local257];
							@Pc(275) int local275 = local188 * local265 + local261 * local250 >> 15;
							@Pc(286) int local286 = local265 * local250 - local188 * local261 >> 15;
							local155 -= local228.anIntArrayArray1[local184][1];
							local28 += local286;
							local20 += local275;
						}
					}
				}
				@Pc(325) Class7_Sub2_Sub6 local325 = new Class7_Sub2_Sub6(local64, Static65.anInt1686, local20, local28, local155, Static253.anInt4787 + local78, Static253.anInt4787 + local82, local86, local90, local60, local74, local39);
				local325.method3008(Static231.method3482(Static65.anInt1686, local46, local52) - local74, local52, local78 + Static253.anInt4787, local46);
				Static92.aClass243_14.method5198(new Class3_Sub4_Sub9(local325));
			}
		} else if (arg0 == Static43.aClass95_3) {
			@Pc(358) byte local358 = Static237.aClass3_Sub7_Sub1_1.method2619();
			@Pc(362) byte local362 = Static237.aClass3_Sub7_Sub1_1.method2630();
			local28 = Static237.aClass3_Sub7_Sub1_1.method2598();
			@Pc(370) byte local370 = Static237.aClass3_Sub7_Sub1_1.method2630();
			local46 = Static237.aClass3_Sub7_Sub1_1.method2639();
			local52 = Static59.anInt3263 + (local46 >> 4 & 0x7);
			local56 = (local46 & 0x7) + Static440.anInt7425;
			@Pc(393) byte local393 = Static237.aClass3_Sub7_Sub1_1.method2612();
			local64 = Static237.aClass3_Sub7_Sub1_1.method2588();
			local155 = Static237.aClass3_Sub7_Sub1_1.method2586();
			local74 = Static237.aClass3_Sub7_Sub1_1.method2582();
			local78 = local74 >> 2;
			local82 = local74 & 0x3;
			local86 = Static237.aClass3_Sub7_Sub1_1.method2635();
			if (!Static121.aClass172_3.method5483()) {
				Static68.method1327(local362, local358, local393, local82, local56, local52, local64, local78, local28, Static65.anInt1686, local155, local86, local370);
			}
		} else {
			@Pc(462) int local462;
			if (Static141.aClass95_7 == arg0) {
				local10 = Static237.aClass3_Sub7_Sub1_1.method2635();
				local20 = Static237.aClass3_Sub7_Sub1_1.method2598();
				local28 = Static237.aClass3_Sub7_Sub1_1.method2582();
				local462 = Static59.anInt3263 + (local28 >> 4 & 0x7);
				local46 = Static440.anInt7425 + (local28 & 0x7);
				local52 = Static237.aClass3_Sub7_Sub1_1.method2635();
				if (local462 >= 0 && local46 >= 0 && Static40.anInt1089 > local462 && Static44.anInt7276 > local46 && Static319.anInt1936 != local52) {
					Static300.method4231(local46, Static65.anInt1686, local462, new Class3_Sub22(local10, local20));
					Static80.method1553(local46, Static65.anInt1686, local462);
				}
			} else if (arg0 == Static19.aClass95_1) {
				local10 = Static237.aClass3_Sub7_Sub1_1.method2584();
				local20 = (local10 >> 4 & 0x7) + Static59.anInt3263;
				local28 = (local10 & 0x7) + Static440.anInt7425;
				local462 = Static237.aClass3_Sub7_Sub1_1.method2639();
				local46 = local462 >> 2;
				local52 = local462 & 0x3;
				local56 = Static196.anIntArray249[local46];
				if (Static353.method4698(Static166.anInt3385) || local20 >= 0 && local28 >= 0 && Static40.anInt1089 > local20 && Static44.anInt7276 > local28) {
					Static187.method2989(local56, -1, local46, local52, local20, local28, Static65.anInt1686);
				}
			} else if (arg0 == Static314.aClass95_12) {
				local10 = Static237.aClass3_Sub7_Sub1_1.method2582();
				local20 = Static59.anInt3263 + (local10 >> 4 & 0x7);
				local28 = (local10 & 0x7) + Static440.anInt7425;
				local462 = Static237.aClass3_Sub7_Sub1_1.method2588();
				local46 = Static237.aClass3_Sub7_Sub1_1.method2588();
				local52 = Static237.aClass3_Sub7_Sub1_1.method2588();
				if (Static441.aClass11_43 != null && local20 >= 0 && local28 >= 0 && local20 < Static40.anInt1089 && Static44.anInt7276 > local28) {
					@Pc(647) Class3_Sub39 local647 = (Class3_Sub39) Static441.aClass11_43.method324((long) (Static65.anInt1686 << 28 | local28 << 14 | local20));
					if (local647 != null) {
						for (@Pc(657) Class3_Sub22 local657 = (Class3_Sub22) local647.aClass243_40.method5208(); local657 != null; local657 = (Class3_Sub22) local647.aClass243_40.method5203()) {
							if ((local462 & 0x7FFF) == local657.anInt3744 && local657.anInt3745 == local46) {
								local657.method5977();
								local657.anInt3745 = local52;
								Static300.method4231(local28, Static65.anInt1686, local20, local657);
								break;
							}
						}
						Static80.method1553(local28, Static65.anInt1686, local20);
					}
				}
			} else {
				@Pc(887) Class7_Sub2_Sub6 local887;
				if (arg0 == Static396.aClass95_14) {
					local10 = Static237.aClass3_Sub7_Sub1_1.method2582();
					@Pc(719) boolean local719 = (local10 & 0x80) != 0;
					local28 = Static59.anInt3263 + (local10 >> 3 & 0x7);
					local462 = Static440.anInt7425 + (local10 & 0x7);
					local46 = Static237.aClass3_Sub7_Sub1_1.method2612() + local28;
					local52 = local462 + Static237.aClass3_Sub7_Sub1_1.method2612();
					local56 = Static237.aClass3_Sub7_Sub1_1.method2641();
					local60 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local64 = Static237.aClass3_Sub7_Sub1_1.method2582() * 4;
					local155 = Static237.aClass3_Sub7_Sub1_1.method2582() * 4;
					local74 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local78 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local82 = Static237.aClass3_Sub7_Sub1_1.method2582();
					if (local82 == 255) {
						local82 = -1;
					}
					local86 = Static237.aClass3_Sub7_Sub1_1.method2582();
					if (local28 >= 0 && local462 >= 0 && local28 < Static40.anInt1089 && Static44.anInt7276 > local462 && local46 >= 0 && local52 >= 0 && local46 < Static40.anInt1089 && local52 < Static44.anInt7276 && local60 != 65535) {
						local462 = local462 * 128 + 64;
						local28 = local28 * 128 + 64;
						local64 <<= 0x0;
						local46 = local46 * 128 + 64;
						local155 <<= 0x0;
						local52 = local52 * 128 + 64;
						local887 = new Class7_Sub2_Sub6(local60, Static65.anInt1686, local28, local462, local64, local74 + Static253.anInt4787, Static253.anInt4787 + local78, local82, local86, local56, local155, local719);
						local887.method3008(Static231.method3482(Static65.anInt1686, local46, local52) - local155, local52, Static253.anInt4787 + local74, local46);
						Static92.aClass243_14.method5198(new Class3_Sub4_Sub9(local887));
					}
				} else if (Static68.aClass95_4 == arg0) {
					local10 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local20 = (local10 >> 4 & 0xF) + Static59.anInt3263 * 2;
					local28 = Static440.anInt7425 * 2 + (local10 & 0xF);
					local39 = Static237.aClass3_Sub7_Sub1_1.method2582() != 0;
					local46 = local20 + Static237.aClass3_Sub7_Sub1_1.method2612();
					local52 = Static237.aClass3_Sub7_Sub1_1.method2612() + local28;
					local56 = Static237.aClass3_Sub7_Sub1_1.method2641();
					local60 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local64 = Static237.aClass3_Sub7_Sub1_1.method2582() * 4;
					local155 = Static237.aClass3_Sub7_Sub1_1.method2582() * 4;
					local74 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local78 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local82 = Static237.aClass3_Sub7_Sub1_1.method2582();
					if (local82 == 255) {
						local82 = -1;
					}
					local86 = Static237.aClass3_Sub7_Sub1_1.method2582();
					if (local20 >= 0 && local28 >= 0 && local20 < Static40.anInt1089 * 2 && local28 < Static40.anInt1089 * 2 && local46 >= 0 && local52 >= 0 && local46 < Static44.anInt7276 * 2 && Static44.anInt7276 * 2 > local52 && local60 != 65535) {
						local52 *= 64;
						local64 <<= 0x0;
						local20 = local20 * 64;
						local28 = local28 * 64;
						local46 *= 64;
						local155 <<= 0x0;
						local887 = new Class7_Sub2_Sub6(local60, Static65.anInt1686, local20, local28, local64, Static253.anInt4787 + local74, Static253.anInt4787 + local78, local82, local86, local56, local155, local39);
						local887.method3008(Static231.method3482(Static65.anInt1686, local46, local52) - local155, local52, local74 + Static253.anInt4787, local46);
						Static92.aClass243_14.method5198(new Class3_Sub4_Sub9(local887));
					}
				} else if (arg0 == Static156.aClass95_8) {
					local10 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local20 = (local10 >> 4 & 0x7) + Static59.anInt3263;
					local28 = (local10 & 0x7) + Static440.anInt7425;
					local462 = Static237.aClass3_Sub7_Sub1_1.method2593();
					local46 = Static237.aClass3_Sub7_Sub1_1.method2598();
					if (local20 >= 0 && local28 >= 0 && local20 < Static40.anInt1089 && local28 < Static44.anInt7276) {
						Static300.method4231(local28, Static65.anInt1686, local20, new Class3_Sub22(local46, local462));
						Static80.method1553(local28, Static65.anInt1686, local20);
					}
				} else if (arg0 == Static416.aClass95_15) {
					local10 = Static237.aClass3_Sub7_Sub1_1.method2639();
					local20 = (local10 >> 4 & 0x7) + Static59.anInt3263;
					local28 = Static440.anInt7425 + (local10 & 0x7);
					local462 = Static237.aClass3_Sub7_Sub1_1.method2635();
					if (local462 == 65535) {
						local462 = -1;
					}
					local46 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local52 = local46 >> 2;
					local56 = local46 & 0x3;
					local60 = Static196.anIntArray249[local52];
					Static153.method2478(local20, Static65.anInt1686, local60, local28, local462, local52, local56);
				} else if (Static305.aClass95_11 == arg0) {
					Static237.aClass3_Sub7_Sub1_1.method2582();
					local10 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local20 = (local10 >> 4 & 0x7) + Static59.anInt3263;
					local28 = Static440.anInt7425 + (local10 & 0x7);
					local462 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local46 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local52 = Static237.aClass3_Sub7_Sub1_1.method2604();
					@Pc(1273) String local1273 = Static237.aClass3_Sub7_Sub1_1.method2620();
					Static37.method727(local1273, local46, local28, local52, Static65.anInt1686, local462, local20);
				} else if (Static117.aClass95_6 == arg0) {
					local10 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local20 = Static59.anInt3263 + (local10 >> 4 & 0x7);
					local28 = Static440.anInt7425 + (local10 & 0x7);
					local462 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local46 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local52 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local56 = Static237.aClass3_Sub7_Sub1_1.method2582();
					if (local20 >= 0 && local28 >= 0 && local20 < Static40.anInt1089 && Static44.anInt7276 > local28) {
						local60 = local20 * 128 + 64;
						local64 = local28 * 128 + 64;
						local155 = Static65.anInt1686;
						if (local155 < 3 && Static309.method4307(local20, local28)) {
							local155++;
						}
						@Pc(1391) Class7_Sub2_Sub5 local1391 = new Class7_Sub2_Sub5(local462, local52, Static253.anInt4787, Static65.anInt1686, local155, local60, Static231.method3482(Static65.anInt1686, local60, local64) - local46, local64, local20, local20, local28, local28, local56);
						Static365.aClass243_38.method5198(new Class3_Sub4_Sub11(local1391));
					}
				} else if (arg0 == Static353.aClass95_13) {
					local10 = Static237.aClass3_Sub7_Sub1_1.method2584();
					local20 = local10 >> 2;
					local28 = local10 & 0x3;
					local462 = Static196.anIntArray249[local20];
					local46 = Static237.aClass3_Sub7_Sub1_1.method2637();
					local52 = Static59.anInt3263 + (local46 >> 4 & 0x7);
					local56 = Static440.anInt7425 + (local46 & 0x7);
					local60 = Static237.aClass3_Sub7_Sub1_1.method2593();
					if (Static353.method4698(Static166.anInt3385) || local52 >= 0 && local56 >= 0 && Static40.anInt1089 > local52 && Static44.anInt7276 > local56) {
						Static187.method2989(local462, local60, local20, local28, local52, local56, Static65.anInt1686);
					}
				} else if (arg0 == Static27.aClass95_5) {
					local10 = Static237.aClass3_Sub7_Sub1_1.method2584();
					local20 = Static59.anInt3263 + (local10 >> 4 & 0x7);
					local28 = (local10 & 0x7) + Static440.anInt7425;
					local462 = Static237.aClass3_Sub7_Sub1_1.method2598();
					if (local20 >= 0 && local28 >= 0 && Static40.anInt1089 > local20 && Static44.anInt7276 > local28) {
						@Pc(1535) Class3_Sub39 local1535 = (Class3_Sub39) Static441.aClass11_43.method324((long) (local20 | local28 << 14 | Static65.anInt1686 << 28));
						if (local1535 != null) {
							for (@Pc(1543) Class3_Sub22 local1543 = (Class3_Sub22) local1535.aClass243_40.method5208(); local1543 != null; local1543 = (Class3_Sub22) local1535.aClass243_40.method5203()) {
								if (local1543.anInt3744 == (local462 & 0x7FFF)) {
									local1543.method5977();
									break;
								}
							}
							if (local1535.aClass243_40.method5211()) {
								local1535.method5977();
							}
							Static80.method1553(local28, Static65.anInt1686, local20);
						}
					}
				} else if (arg0 == Static229.aClass95_9) {
					local10 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local20 = (local10 >> 4 & 0x7) + Static59.anInt3263;
					local28 = (local10 & 0x7) + Static440.anInt7425;
					local462 = Static237.aClass3_Sub7_Sub1_1.method2588();
					if (local462 == 65535) {
						local462 = -1;
					}
					local46 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local52 = local46 >> 4 & 0xF;
					local56 = local46 & 0x7;
					local60 = Static237.aClass3_Sub7_Sub1_1.method2582();
					local64 = Static237.aClass3_Sub7_Sub1_1.method2582();
					if (local20 >= 0 && local28 >= 0 && Static40.anInt1089 > local20 && Static44.anInt7276 > local28) {
						local155 = local52 + 1;
						if (Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray287[0] >= local20 - local155 && local20 + local155 >= Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray287[0] && Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray288[0] >= local28 - local155 && local155 + local28 >= Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray288[0]) {
							Static434.method5678(local60, local56, local52 + (Static65.anInt1686 << 24) + (local20 << 16) + (local28 << 8), local462, local64);
						}
					}
				} else if (arg0 == Static270.aClass95_10) {
					local10 = Static237.aClass3_Sub7_Sub1_1.method2588();
					local20 = Static237.aClass3_Sub7_Sub1_1.method2582();
					Static435.aClass30_4.method769(local10).method2064(local20);
				} else {
					Static324.method5974(null, "T3 - " + arg0);
					Static24.method583();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)I")
	public static int method3661(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)V")
	public static void method3663() {
		@Pc(9) int local9 = (int) ((double) Static40.anInt1089 * 34.46D);
		local9 <<= 0x0;
		if (Static121.aClass172_3.method5516()) {
			local9 += 128;
		}
		Static121.aClass172_3.JA(50, local9);
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)Lclient!kb;")
	public static Class44 method3664() {
		try {
			return new Class44_Sub3();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class44) Class.forName("Class44_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class44_Sub1();
			}
		}
	}
}
