import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!ge;")
	public static Class7 aClass7_37;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_11;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public static int anInt1848 = 128;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!rd;")
	private static Class63 aClass63_995 = Static80.method1463("Cancel");

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Lclient!rd;")
	public static Class63 aClass63_996 = Static80.method1463("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	public static int anInt1854 = 0;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_997 = aClass63_995;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!wa;II)I")
	public static int method1210(@OriginalArg(0) Class6_Sub3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray38 == null || arg0.anIntArrayArray38.length <= arg1) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg0.anIntArrayArray38[arg1];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			while (true) {
				@Pc(33) int local33 = 0;
				@Pc(38) int local38 = local20[local22++];
				@Pc(40) byte local40 = 0;
				if (local38 == 0) {
					return local24;
				}
				if (local38 == 15) {
					local40 = 1;
				}
				if (local38 == 16) {
					local40 = 2;
				}
				if (local38 == 17) {
					local40 = 3;
				}
				if (local38 == 1) {
					local33 = Static76.anIntArray240[local20[local22++]];
				}
				if (local38 == 2) {
					local33 = Static74.anIntArray234[local20[local22++]];
				}
				if (local38 == 3) {
					local33 = Static38.anIntArray142[local20[local22++]];
				}
				@Pc(99) int local99;
				@Pc(110) Class6_Sub3_Sub17 local110;
				@Pc(115) int local115;
				@Pc(127) int local127;
				if (local38 == 4) {
					local99 = local20[local22++] << 16;
					@Pc(106) int local106 = local99 + local20[local22++];
					local110 = Static12.method339(local106);
					local115 = local20[local22++];
					if (local115 != -1 && (!Static91.method1664(local115).aBoolean65 || Static30.aBoolean49)) {
						for (local127 = 0; local127 < local110.anIntArray362.length; local127++) {
							if (local115 + 1 == local110.anIntArray362[local127]) {
								local33 += local110.anIntArray363[local127];
							}
						}
					}
				}
				if (local38 == 5) {
					local33 = Static89.anIntArray283[local20[local22++]];
				}
				if (local38 == 6) {
					local33 = Class6_Sub3_Sub1_Sub2.anIntArray272[Static74.anIntArray234[local20[local22++]] - 1];
				}
				if (local38 == 7) {
					local33 = Static89.anIntArray283[local20[local22++]] * 100 / 46875;
				}
				if (local38 == 8) {
					local33 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2375;
				}
				if (local38 == 9) {
					for (local99 = 0; local99 < 25; local99++) {
						if (Static118.aBooleanArray14[local99]) {
							local33 += Static74.anIntArray234[local99];
						}
					}
				}
				if (local38 == 10) {
					local99 = local20[local22++] << 16;
					local99 += local20[local22++];
					local110 = Static12.method339(local99);
					local115 = local20[local22++];
					if (local115 != -1 && (!Static91.method1664(local115).aBoolean65 || Static30.aBoolean49)) {
						for (local127 = 0; local127 < local110.anIntArray362.length; local127++) {
							if (local110.anIntArray362[local127] == local115 + 1) {
								local33 = 999999999;
								break;
							}
						}
					}
				}
				if (local38 == 11) {
					local33 = Static66.anInt3198;
				}
				if (local38 == 12) {
					local33 = Static37.anInt1218;
				}
				if (local38 == 13) {
					local99 = Static89.anIntArray283[local20[local22++]];
					@Pc(329) int local329 = local20[local22++];
					local33 = (local99 & 0x1 << local329) == 0 ? 0 : 1;
				}
				if (local38 == 14) {
					local99 = local20[local22++];
					local33 = Static89.method1599(local99);
				}
				if (local38 == 18) {
					local33 = Static80.anInt2169 + (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319 >> 7);
				}
				if (local38 == 19) {
					local33 = (Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347 >> 7) + Static91.anInt2560;
				}
				if (local38 == 20) {
					local33 = local20[local22++];
				}
				if (local40 == 0) {
					if (local26 == 0) {
						local24 += local33;
					}
					if (local26 == 1) {
						local24 -= local33;
					}
					if (local26 == 2 && local33 != 0) {
						local24 /= local33;
					}
					if (local26 == 3) {
						local24 *= local33;
					}
					local26 = 0;
				} else {
					local26 = local40;
				}
			}
		} catch (@Pc(428) Exception local428) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method1211() {
		aClass7_37 = null;
		aClass7_Sub1_11 = null;
		aClass63_996 = null;
		aClass63_997 = null;
		aClass63_995 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIILclient!j;I)V")
	public static void method1212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub3_Sub10 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class6_Sub17 local7 = new Class6_Sub17();
		local7.anInt2816 = arg3.anInt1675;
		local7.anIntArray297 = arg3.anIntArray182;
		@Pc(18) int local18 = arg3.anInt1683;
		local7.anInt2818 = arg0 * 128;
		local7.anInt2813 = arg3.anInt1700;
		local7.anInt2809 = arg3.anInt1694;
		@Pc(34) int local34 = arg3.anInt1672;
		local7.anInt2808 = arg3.anInt1701 * 128;
		local7.anInt2820 = arg4;
		local7.anInt2811 = arg2 * 128;
		if (arg1 == 1 || arg1 == 3) {
			local18 = arg3.anInt1672;
			local34 = arg3.anInt1683;
		}
		local7.anInt2815 = (local18 + arg0) * 128;
		local7.anInt2819 = (arg2 + local34) * 128;
		if (arg3.anIntArray185 != null) {
			local7.aClass6_Sub3_Sub10_1 = arg3;
			local7.method1850();
		}
		Static81.aClass1_4.method10(local7);
		if (local7.anIntArray297 != null) {
			local7.anInt2812 = local7.anInt2813 + (int) ((double) (local7.anInt2809 - local7.anInt2813) * Math.random());
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public static void method1215() {
		Static87.method1567(false);
		@Pc(10) boolean local10 = true;
		Static1.anInt7 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static60.aByteArrayArray5.length; local14++) {
			if (Static41.anIntArray145[local14] != -1 && Static60.aByteArrayArray5[local14] == null) {
				Static60.aByteArrayArray5[local14] = aClass7_Sub1_11.method110(Static41.anIntArray145[local14], 0);
				if (Static60.aByteArrayArray5[local14] == null) {
					local10 = false;
					Static1.anInt7++;
				}
			}
			if (Static25.anIntArray76[local14] != -1 && Static98.aByteArrayArray8[local14] == null) {
				Static98.aByteArrayArray8[local14] = aClass7_Sub1_11.method106(0, Static25.anIntArray76[local14], Static97.anIntArrayArray35[local14]);
				if (Static98.aByteArrayArray8[local14] == null) {
					Static1.anInt7++;
					local10 = false;
				}
			}
		}
		if (!local10) {
			Static118.anInt3163 = 1;
			return;
		}
		local10 = true;
		Static52.anInt1583 = 0;
		@Pc(116) int local116;
		@Pc(126) int local126;
		for (@Pc(97) int local97 = 0; local97 < Static60.aByteArrayArray5.length; local97++) {
			@Pc(103) byte[] local103 = Static98.aByteArrayArray8[local97];
			if (local103 != null) {
				local116 = (Static6.anIntArray15[local97] >> 8) * 64 - Static80.anInt2169;
				local126 = (Static6.anIntArray15[local97] & 0xFF) * 64 - Static91.anInt2560;
				if (Static69.aBoolean105) {
					local116 = 10;
					local126 = 10;
				}
				local10 &= Static37.method876(local126, local116, local103);
			}
		}
		if (!local10) {
			Static118.anInt3163 = 2;
			return;
		}
		if (Static118.anInt3163 != 0) {
			Static93.method1703(true, Static96.aClass63_1480, Static110.aClass63_1649);
		}
		Static44.method959();
		Static94.method1707();
		Static44.method959();
		Static76.aClass19_1.method683();
		Static44.method959();
		System.gc();
		for (@Pc(187) int local187 = 0; local187 < 4; local187++) {
			Static15.aClass30Array1[local187].method995();
		}
		@Pc(210) int local210;
		for (local116 = 0; local116 < 4; local116++) {
			for (local126 = 0; local126 < 104; local126++) {
				for (local210 = 0; local210 < 104; local210++) {
					Static103.aByteArrayArrayArray92[local116][local126][local210] = 0;
				}
			}
		}
		Static44.method959();
		Static5.method39();
		local126 = Static60.aByteArrayArray5.length;
		Static30.method724();
		Static87.method1567(true);
		@Pc(264) int local264;
		@Pc(275) int local275;
		@Pc(385) int local385;
		@Pc(318) int local318;
		@Pc(374) int local374;
		if (!Static69.aBoolean105) {
			@Pc(279) byte[] local279;
			for (local210 = 0; local210 < local126; local210++) {
				local264 = (Static6.anIntArray15[local210] >> 8) * 64 - Static80.anInt2169;
				local275 = (Static6.anIntArray15[local210] & 0xFF) * 64 - Static91.anInt2560;
				local279 = Static60.aByteArrayArray5[local210];
				if (local279 != null) {
					Static44.method959();
					Static32.method838((Static5.anInt49 - 6) * 8, local264, Static15.aClass30Array1, local275, Static2.anInt35 * 8 - 48, local279);
				}
			}
			for (local264 = 0; local264 < local126; local264++) {
				local318 = (Static6.anIntArray15[local264] & 0xFF) * 64 - Static91.anInt2560;
				local275 = (Static6.anIntArray15[local264] >> 8) * 64 - Static80.anInt2169;
				@Pc(333) byte[] local333 = Static60.aByteArrayArray5[local264];
				if (local333 == null && Static5.anInt49 < 800) {
					Static44.method959();
					Static10.method270(64, 64, local275, local318);
				}
			}
			Static87.method1567(true);
			for (local275 = 0; local275 < local126; local275++) {
				local279 = Static98.aByteArrayArray8[local275];
				if (local279 != null) {
					local374 = (Static6.anIntArray15[local275] >> 8) * 64 - Static80.anInt2169;
					local385 = (Static6.anIntArray15[local275] & 0xFF) * 64 - Static91.anInt2560;
					Static44.method959();
					Static58.method1143(Static15.aClass30Array1, Static76.aClass19_1, local279, local374, local385);
				}
			}
		}
		@Pc(434) int local434;
		@Pc(440) int local440;
		if (Static69.aBoolean105) {
			@Pc(446) int local446;
			@Pc(462) int local462;
			@Pc(464) int local464;
			for (local210 = 0; local210 < 4; local210++) {
				Static44.method959();
				for (local264 = 0; local264 < 13; local264++) {
					for (local275 = 0; local275 < 13; local275++) {
						@Pc(416) boolean local416 = false;
						local374 = Static17.anIntArrayArrayArray10[local210][local264][local275];
						if (local374 != -1) {
							local434 = local374 >> 1 & 0x3;
							local440 = local374 >> 14 & 0x3FF;
							local446 = local374 >> 3 & 0x7FF;
							local385 = local374 >> 24 & 0x3;
							local462 = local446 / 8 + (local440 / 8 << 8);
							for (local464 = 0; local464 < Static6.anIntArray15.length; local464++) {
								if (local462 == Static6.anIntArray15[local464] && Static60.aByteArrayArray5[local464] != null) {
									local416 = true;
									Static105.method1902(local385, local210, local275 * 8, (local446 & 0x7) * 8, (local440 & 0x7) * 8, local264 * 8, Static15.aClass30Array1, Static60.aByteArrayArray5[local464], local434);
									break;
								}
							}
						}
						if (!local416) {
							Static110.method2037(local264 * 8, local275 * 8, local210);
						}
					}
				}
			}
			for (local264 = 0; local264 < 13; local264++) {
				for (local275 = 0; local275 < 13; local275++) {
					local318 = Static17.anIntArrayArrayArray10[0][local264][local275];
					if (local318 == -1) {
						Static10.method270(8, 8, local264 * 8, local275 * 8);
					}
				}
			}
			Static87.method1567(true);
			for (local275 = 0; local275 < 4; local275++) {
				Static44.method959();
				for (local318 = 0; local318 < 13; local318++) {
					for (local374 = 0; local374 < 13; local374++) {
						local385 = Static17.anIntArrayArrayArray10[local275][local318][local374];
						if (local385 != -1) {
							local434 = local385 >> 24 & 0x3;
							local462 = local385 >> 3 & 0x7FF;
							local446 = local385 >> 14 & 0x3FF;
							local440 = local385 >> 1 & 0x3;
							local464 = (local446 / 8 << 8) + local462 / 8;
							for (@Pc(649) int local649 = 0; local649 < Static6.anIntArray15.length; local649++) {
								if (local464 == Static6.anIntArray15[local649] && Static98.aByteArrayArray8[local649] != null) {
									Static76.method1432(local318 * 8, local275, Static76.aClass19_1, local374 * 8, Static15.aClass30Array1, local440, local434, (local446 & 0x7) * 8, (local462 & 0x7) * 8, Static98.aByteArrayArray8[local649]);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static87.method1567(true);
		Static94.method1707();
		Static44.method959();
		Static37.method873(Static15.aClass30Array1, Static76.aClass19_1);
		Static87.method1567(true);
		local210 = Static31.anInt1021;
		if (Static101.anInt2810 < local210) {
			local210 = Static101.anInt2810;
		}
		if (local210 < Static101.anInt2810 - 1) {
		}
		if (Static61.aBoolean98) {
			Static76.aClass19_1.method661(Static31.anInt1021);
		} else {
			Static76.aClass19_1.method661(0);
		}
		for (local264 = 0; local264 < 104; local264++) {
			for (local275 = 0; local275 < 104; local275++) {
				Static73.method1390(local275, local264);
			}
		}
		Static44.method959();
		Static60.method1175();
		Static58.aClass49_18.method1389();
		if (Static24.aFrame1 != null) {
			Static23.aClass6_Sub4_Sub1_4.method1347(247);
			Static23.aClass6_Sub4_Sub1_4.method1292(1057001181);
		}
		if (!Static69.aBoolean105) {
			local275 = (Static2.anInt35 - 6) / 8;
			local318 = (Static2.anInt35 + 6) / 8;
			local385 = (Static5.anInt49 + 6) / 8;
			local374 = (Static5.anInt49 - 6) / 8;
			for (local434 = local275 - 1; local434 <= local318 + 1; local434++) {
				for (local440 = local374 - 1; local440 <= local385 + 1; local440++) {
					if (local434 < local275 || local434 > local318 || local440 < local374 || local385 < local440) {
						aClass7_Sub1_11.method105(Static15.method374(new Class63[] { Static115.aClass63_1711, Static118.method2114(local434), Static52.aClass63_844, Static118.method2114(local440) }));
						aClass7_Sub1_11.method105(Static15.method374(new Class63[] { Static12.aClass63_278, Static118.method2114(local434), Static52.aClass63_844, Static118.method2114(local440) }));
					}
				}
			}
		}
		if (Static14.anInt480 == -1) {
			Static73.method1392(30);
		} else {
			Static73.method1392(35);
		}
		Static44.method959();
		Static109.method2030();
		Static23.aClass6_Sub4_Sub1_4.method1347(168);
		Static68.method1342();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method1216(@OriginalArg(0) Component arg0) {
		@Pc(13) Method local13 = Static8.aMethod2;
		if (local13 != null) {
			try {
				local13.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(27) Throwable local27) {
			}
		}
		arg0.addKeyListener(Static65.aClass65_1);
		arg0.addFocusListener(Static65.aClass65_1);
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	public static void method1217() {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (Static77.anInt2144 == 95) {
			local12 = Static88.aClass6_Sub4_Sub1_5.method1312();
			local20 = (local12 >> 4 & 0x7) + Static31.anInt1026;
			local26 = (local12 & 0x7) + Static36.anInt1213;
			local30 = Static88.aClass6_Sub4_Sub1_5.method1324();
			local34 = local30 >> 2;
			local38 = local30 & 0x3;
			local42 = Static105.anIntArray319[local34];
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				Static39.method884(Static101.anInt2810, local42, local26, -1, local20, 0, local38, local34, -1);
			}
			return;
		}
		@Pc(110) int local110;
		if (Static77.anInt2144 == 41) {
			local12 = Static88.aClass6_Sub4_Sub1_5.method1306();
			local20 = Static88.aClass6_Sub4_Sub1_5.method1321();
			local30 = Static36.anInt1213 + (local20 & 0x7);
			local26 = (local20 >> 4 & 0x7) + Static31.anInt1026;
			local34 = Static88.aClass6_Sub4_Sub1_5.method1312();
			local42 = local34 & 0x3;
			local38 = local34 >> 2;
			local110 = Static105.anIntArray319[local38];
			if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104) {
				Static39.method884(Static101.anInt2810, local110, local30, -1, local26, 0, local42, local38, local12);
			}
			return;
		}
		@Pc(196) int local196;
		if (Static77.anInt2144 == 52) {
			local12 = Static88.aClass6_Sub4_Sub1_5.method1321();
			local20 = Static31.anInt1026 + (local12 >> 4 & 0x7);
			local26 = Static36.anInt1213 + (local12 & 0x7);
			local30 = Static88.aClass6_Sub4_Sub1_5.method1306();
			local34 = Static88.aClass6_Sub4_Sub1_5.method1321();
			local42 = local34 & 0x7;
			local110 = Static88.aClass6_Sub4_Sub1_5.method1321();
			local38 = local34 >> 4 & 0xF;
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				local196 = local38 + 1;
				if (local20 - local196 <= Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0] && Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray273[0] <= local20 + local196 && Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0] >= local26 - local196 && Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anIntArray271[0] <= local26 + local196 && Static56.anInt1713 != 0 && local42 > 0 && Static25.anInt845 < 50) {
					Static11.anIntArray222[Static25.anInt845] = local30;
					Static96.anIntArray292[Static25.anInt845] = local42;
					Static68.anIntArray223[Static25.anInt845] = local110;
					Static15.aClass62Array1[Static25.anInt845] = null;
					Static85.anIntArray306[Static25.anInt845] = local38 + (local26 << 8) + (local20 << 16);
					Static25.anInt845++;
				}
			}
		}
		if (Static77.anInt2144 == 241) {
			local12 = Static88.aClass6_Sub4_Sub1_5.method1295();
			local20 = Static88.aClass6_Sub4_Sub1_5.method1336();
			local26 = Static31.anInt1026 + (local20 >> 4 & 0x7);
			local30 = Static36.anInt1213 + (local20 & 0x7);
			local34 = Static88.aClass6_Sub4_Sub1_5.method1335();
			if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104) {
				@Pc(330) Class6_Sub3_Sub1_Sub7 local330 = new Class6_Sub3_Sub1_Sub7();
				local330.anInt3086 = local12;
				local330.anInt3087 = local34;
				if (Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local26][local30] == null) {
					Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local26][local30] = new Class1();
				}
				Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local26][local30].method10(local330);
				Static73.method1390(local30, local26);
			}
		} else if (Static77.anInt2144 == 123) {
			local12 = Static88.aClass6_Sub4_Sub1_5.method1321();
			local26 = Static36.anInt1213 + (local12 & 0x7);
			local20 = Static31.anInt1026 + (local12 >> 4 & 0x7);
			local30 = Static88.aClass6_Sub4_Sub1_5.method1306();
			local34 = Static88.aClass6_Sub4_Sub1_5.method1321();
			local38 = Static88.aClass6_Sub4_Sub1_5.method1306();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				local20 = local20 * 128 + 64;
				local26 = local26 * 128 + 64;
				@Pc(445) Class6_Sub3_Sub1_Sub6 local445 = new Class6_Sub3_Sub1_Sub6(local30, Static101.anInt2810, local20, local26, Static110.method2038(Static101.anInt2810, local26, local20) - local34, local38, Static73.anInt2064);
				Static20.aClass1_1.method10(local445);
			}
		} else {
			@Pc(501) int local501;
			@Pc(505) int local505;
			@Pc(509) int local509;
			@Pc(517) int local517;
			if (Static77.anInt2144 == 171) {
				local12 = Static88.aClass6_Sub4_Sub1_5.method1300();
				@Pc(463) byte local463 = Static88.aClass6_Sub4_Sub1_5.method1333();
				local26 = Static88.aClass6_Sub4_Sub1_5.method1324();
				local34 = (local26 & 0x7) + Static36.anInt1213;
				local30 = Static31.anInt1026 + (local26 >> 4 & 0x7);
				@Pc(485) byte local485 = Static88.aClass6_Sub4_Sub1_5.method1302();
				local42 = Static88.aClass6_Sub4_Sub1_5.method1306();
				local110 = Static88.aClass6_Sub4_Sub1_5.method1300();
				local196 = Static88.aClass6_Sub4_Sub1_5.method1324();
				local501 = local196 >> 2;
				local505 = local196 & 0x3;
				local509 = Static105.anIntArray319[local501];
				@Pc(513) byte local513 = Static88.aClass6_Sub4_Sub1_5.method1302();
				local517 = Static88.aClass6_Sub4_Sub1_5.method1295();
				@Pc(521) byte local521 = Static88.aClass6_Sub4_Sub1_5.method1302();
				@Pc(526) Class6_Sub3_Sub1_Sub2_Sub2 local526;
				if (Static88.anInt2466 == local12) {
					local526 = Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1;
				} else {
					local526 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local12];
				}
				if (local526 != null) {
					@Pc(538) Class6_Sub3_Sub10 local538 = Static123.method2172(local517);
					@Pc(546) int local546 = Static11.anIntArrayArrayArray6[Static101.anInt2810][local30][local34];
					@Pc(556) int local556 = Static11.anIntArrayArrayArray6[Static101.anInt2810][local30][local34 + 1];
					@Pc(566) int local566 = Static11.anIntArrayArrayArray6[Static101.anInt2810][local30 + 1][local34];
					@Pc(578) int local578 = Static11.anIntArrayArrayArray6[Static101.anInt2810][local30 + 1][local34 + 1];
					@Pc(588) Class6_Sub3_Sub1_Sub3 local588 = local538.method1113(local566, local578, local546, local556, local501, local505);
					if (local588 != null) {
						Static39.method884(Static101.anInt2810, local509, local34, local110 + 1, local30, local42 + 1, 0, 0, -1);
						local526.anInt2371 = local110 + Static73.anInt2064;
						local526.aClass6_Sub3_Sub1_Sub3_3 = local588;
						@Pc(622) byte local622;
						if (local463 > local485) {
							local622 = local463;
							local463 = local485;
							local485 = local622;
						}
						if (local521 > local513) {
							local622 = local521;
							local521 = local513;
							local513 = local622;
						}
						local526.anInt2368 = local42 + Static73.anInt2064;
						@Pc(648) int local648 = local538.anInt1672;
						@Pc(651) int local651 = local538.anInt1683;
						if (local505 == 1 || local505 == 3) {
							local651 = local538.anInt1672;
							local648 = local538.anInt1683;
						}
						local526.anInt2373 = local648 * 64 + local30 * 128;
						local526.anInt2365 = local34 * 128 + local651 * 64;
						local526.anInt2357 = Static110.method2038(Static101.anInt2810, local526.anInt2365, local526.anInt2373);
						local526.anInt2355 = local34 + local513;
						local526.anInt2370 = local485 + local30;
						local526.anInt2374 = local30 + local463;
						local526.anInt2362 = local521 + local34;
					}
				}
			}
			if (Static77.anInt2144 == 249) {
				local12 = Static88.aClass6_Sub4_Sub1_5.method1321();
				local20 = Static31.anInt1026 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static36.anInt1213;
				local30 = Static88.aClass6_Sub4_Sub1_5.method1306();
				local34 = Static88.aClass6_Sub4_Sub1_5.method1306();
				local38 = Static88.aClass6_Sub4_Sub1_5.method1306();
				if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
					@Pc(768) Class1 local768 = Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local20][local26];
					if (local768 != null) {
						for (@Pc(775) Class6_Sub3_Sub1_Sub7 local775 = (Class6_Sub3_Sub1_Sub7) local768.method3(); local775 != null; local775 = (Class6_Sub3_Sub1_Sub7) local768.method14()) {
							if ((local30 & 0x7FFF) == local775.anInt3087 && local34 == local775.anInt3086) {
								local775.anInt3086 = local38;
								break;
							}
						}
						Static73.method1390(local26, local20);
					}
				}
			} else {
				@Pc(861) Class6_Sub3_Sub1_Sub7 local861;
				if (Static77.anInt2144 == 203) {
					local12 = Static88.aClass6_Sub4_Sub1_5.method1295();
					local20 = Static88.aClass6_Sub4_Sub1_5.method1295();
					local26 = Static88.aClass6_Sub4_Sub1_5.method1300();
					local30 = Static88.aClass6_Sub4_Sub1_5.method1336();
					local34 = (local30 >> 4 & 0x7) + Static31.anInt1026;
					local38 = Static36.anInt1213 + (local30 & 0x7);
					if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && Static88.anInt2466 != local20) {
						local861 = new Class6_Sub3_Sub1_Sub7();
						local861.anInt3087 = local26;
						local861.anInt3086 = local12;
						if (Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local34][local38] == null) {
							Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local34][local38] = new Class1();
						}
						Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local34][local38].method10(local861);
						Static73.method1390(local38, local34);
					}
				} else {
					@Pc(974) int local974;
					if (Static77.anInt2144 == 59) {
						local20 = Static88.aClass6_Sub4_Sub1_5.method1321();
						local26 = (local20 >> 4 & 0x7) + Static31.anInt1026;
						local30 = Static36.anInt1213 + (local20 & 0x7);
						local34 = Static88.aClass6_Sub4_Sub1_5.method1297() + local26;
						local38 = local30 + Static88.aClass6_Sub4_Sub1_5.method1297();
						local42 = Static88.aClass6_Sub4_Sub1_5.method1323();
						local110 = Static88.aClass6_Sub4_Sub1_5.method1306();
						local196 = Static88.aClass6_Sub4_Sub1_5.method1321() * 4;
						local501 = Static88.aClass6_Sub4_Sub1_5.method1321() * 4;
						local505 = Static88.aClass6_Sub4_Sub1_5.method1306();
						local509 = Static88.aClass6_Sub4_Sub1_5.method1306();
						local974 = Static88.aClass6_Sub4_Sub1_5.method1321();
						local517 = Static88.aClass6_Sub4_Sub1_5.method1321();
						if (local26 >= 0 && local30 >= 0 && local26 < 104 && local30 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local110 != 65535) {
							local30 = local30 * 128 + 64;
							local34 = local34 * 128 + 64;
							local38 = local38 * 128 + 64;
							local26 = local26 * 128 + 64;
							@Pc(1066) Class6_Sub3_Sub1_Sub4 local1066 = new Class6_Sub3_Sub1_Sub4(local110, Static101.anInt2810, local26, local30, Static110.method2038(Static101.anInt2810, local30, local26) - local196, local505 + Static73.anInt2064, Static73.anInt2064 + local509, local974, local517, local42, local501);
							local1066.method1026(local505 + Static73.anInt2064, local34, Static110.method2038(Static101.anInt2810, local38, local34) - local501, local38);
							Static88.aClass1_5.method10(local1066);
						}
					} else if (Static77.anInt2144 == 207) {
						local20 = Static88.aClass6_Sub4_Sub1_5.method1295();
						local26 = Static88.aClass6_Sub4_Sub1_5.method1312();
						local30 = Static31.anInt1026 + (local26 >> 4 & 0x7);
						local34 = Static36.anInt1213 + (local26 & 0x7);
						if (local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104) {
							@Pc(1139) Class1 local1139 = Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local30][local34];
							if (local1139 != null) {
								for (local861 = (Class6_Sub3_Sub1_Sub7) local1139.method3(); local861 != null; local861 = (Class6_Sub3_Sub1_Sub7) local1139.method14()) {
									if (local861.anInt3087 == (local20 & 0x7FFF)) {
										local861.method2123();
										break;
									}
								}
								if (local1139.method3() == null) {
									Static89.aClass1ArrayArrayArray1[Static101.anInt2810][local30][local34] = null;
								}
								Static73.method1390(local34, local30);
							}
						}
					} else if (Static77.anInt2144 == 63) {
						local20 = Static88.aClass6_Sub4_Sub1_5.method1300();
						local26 = Static88.aClass6_Sub4_Sub1_5.method1321();
						local30 = local26 >> 2;
						local34 = local26 & 0x3;
						local38 = Static105.anIntArray319[local30];
						local42 = Static88.aClass6_Sub4_Sub1_5.method1324();
						local110 = Static31.anInt1026 + (local42 >> 4 & 0x7);
						local196 = Static36.anInt1213 + (local42 & 0x7);
						if (local110 >= 0 && local196 >= 0 && local110 < 103 && local196 < 103) {
							local501 = Static11.anIntArrayArrayArray6[Static101.anInt2810][local110][local196];
							local505 = Static11.anIntArrayArrayArray6[Static101.anInt2810][local110 + 1][local196];
							local509 = Static11.anIntArrayArrayArray6[Static101.anInt2810][local110 + 1][local196 + 1];
							local974 = Static11.anIntArrayArrayArray6[Static101.anInt2810][local110][local196 + 1];
							if (local38 == 0) {
								@Pc(1294) Class22 local1294 = Static76.aClass19_1.method699(Static101.anInt2810, local110, local196);
								if (local1294 != null) {
									@Pc(1303) int local1303 = local1294.anInt961 >> 14 & 0x7FFF;
									if (local30 == 2) {
										local1294.aClass6_Sub3_Sub1_5 = new Class6_Sub3_Sub1_Sub5(local1303, 2, local34 + 4, local501, local505, local509, local974, local20, false, local1294.aClass6_Sub3_Sub1_5);
										local1294.aClass6_Sub3_Sub1_4 = new Class6_Sub3_Sub1_Sub5(local1303, 2, local34 + 1 & 0x3, local501, local505, local509, local974, local20, false, local1294.aClass6_Sub3_Sub1_4);
									} else {
										local1294.aClass6_Sub3_Sub1_5 = new Class6_Sub3_Sub1_Sub5(local1303, local30, local34, local501, local505, local509, local974, local20, false, local1294.aClass6_Sub3_Sub1_5);
									}
								}
							}
							if (local38 == 1) {
								@Pc(1373) Class34 local1373 = Static76.aClass19_1.method686(Static101.anInt2810, local110, local196);
								if (local1373 != null) {
									local1373.aClass6_Sub3_Sub1_8 = new Class6_Sub3_Sub1_Sub5(local1373.anInt1517 >> 14 & 0x7FFF, 4, 0, local501, local505, local509, local974, local20, false, local1373.aClass6_Sub3_Sub1_8);
								}
							}
							if (local38 == 2) {
								if (local30 == 11) {
									local30 = 10;
								}
								@Pc(1412) Class25 local1412 = Static76.aClass19_1.method672(Static101.anInt2810, local110, local196);
								if (local1412 != null) {
									local1412.aClass6_Sub3_Sub1_7 = new Class6_Sub3_Sub1_Sub5(local1412.anInt1164 >> 14 & 0x7FFF, local30, local34, local501, local505, local509, local974, local20, false, local1412.aClass6_Sub3_Sub1_7);
								}
							}
							if (local38 == 3) {
								@Pc(1446) Class24 local1446 = Static76.aClass19_1.method677(Static101.anInt2810, local110, local196);
								if (local1446 != null) {
									local1446.aClass6_Sub3_Sub1_6 = new Class6_Sub3_Sub1_Sub5(local1446.anInt1144 >> 14 & 0x7FFF, 22, local34, local501, local505, local509, local974, local20, false, local1446.aClass6_Sub3_Sub1_6);
								}
							}
						}
					}
				}
			}
		}
	}
}
