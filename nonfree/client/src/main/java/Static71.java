import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!oc", name = "tb", descriptor = "I")
	public static int anInt1825;

	@OriginalMember(owner = "client!oc", name = "ob", descriptor = "Lclient!mc;")
	public static Class42 aClass42_946 = Static23.method501("Mio");

	@OriginalMember(owner = "client!oc", name = "vb", descriptor = "J")
	public static long aLong60 = 0L;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
	public static void method1284() {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(44) int local44;
		@Pc(35) int local35;
		if (Static88.anInt2328 == 27) {
			local12 = Static80.aClass1_Sub8_Sub1_2.method1186();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static38.anIntArray131[local16];
			local28 = Static80.aClass1_Sub8_Sub1_2.method1211();
			local35 = Static54.anInt1407 + (local28 & 0x7);
			local44 = Static6.anInt161 + (local28 >> 4 & 0x7);
			if (local44 >= 0 && local35 >= 0 && local44 < 104 && local35 < 104) {
				Static30.method569(local44, local20, local24, local35, -1, Static82.anInt2165, 0, -1, local16);
			}
			return;
		}
		@Pc(118) Class1_Sub1_Sub8_Sub2 local118;
		if (Static88.anInt2328 == 77) {
			local12 = Static80.aClass1_Sub8_Sub1_2.method1186();
			local20 = (local12 & 0x7) + Static54.anInt1407;
			local16 = Static6.anInt161 + (local12 >> 4 & 0x7);
			local24 = Static80.aClass1_Sub8_Sub1_2.method1216();
			local28 = Static80.aClass1_Sub8_Sub1_2.method1206();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				local118 = new Class1_Sub1_Sub8_Sub2();
				local118.anInt1824 = local28;
				local118.anInt1827 = local24;
				if (Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local16][local20] == null) {
					Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local16][local20] = new Class22();
				}
				Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local16][local20].method512(local118);
				Static90.method1658(local20, local16);
			}
		} else if (Static88.anInt2328 == 160) {
			local12 = Static80.aClass1_Sub8_Sub1_2.method1216();
			local16 = Static80.aClass1_Sub8_Sub1_2.method1186();
			local20 = (local16 >> 4 & 0x7) + Static6.anInt161;
			local24 = Static54.anInt1407 + (local16 & 0x7);
			local28 = Static80.aClass1_Sub8_Sub1_2.method1199();
			local44 = Static80.aClass1_Sub8_Sub1_2.method1216();
			if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104 && local44 != Static75.anInt1420) {
				@Pc(215) Class1_Sub1_Sub8_Sub2 local215 = new Class1_Sub1_Sub8_Sub2();
				local215.anInt1824 = local28;
				local215.anInt1827 = local12;
				if (Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local20][local24] == null) {
					Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local20][local24] = new Class22();
				}
				Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local20][local24].method512(local215);
				Static90.method1658(local24, local20);
			}
		} else {
			@Pc(298) int local298;
			@Pc(320) int local320;
			if (Static88.anInt2328 == 54) {
				local12 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local16 = Static6.anInt161 + (local12 >> 4 & 0x7);
				local20 = (local12 & 0x7) + Static54.anInt1407;
				local24 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local28 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local35 = local28 & 0x7;
				local44 = local28 >> 4 & 0xF;
				local298 = Static80.aClass1_Sub8_Sub1_2.method1186();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					local320 = local44 + 1;
					if (local16 - local320 <= Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0] && Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0] <= local320 + local16 && local20 - local320 <= Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0] && Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0] <= local20 + local320 && Static62.anInt1488 != 0 && local35 > 0 && Static65.anInt1577 < 50) {
						Static81.anIntArray324[Static65.anInt1577] = local24;
						Static60.anIntArray218[Static65.anInt1577] = local35;
						Static29.anIntArray97[Static65.anInt1577] = local298;
						Static90.aClass3Array1[Static65.anInt1577] = null;
						Static48.anIntArray185[Static65.anInt1577] = local44 + (local16 << 16) + (local20 << 8);
						Static65.anInt1577++;
					}
				}
			}
			@Pc(455) int local455;
			@Pc(463) int local463;
			@Pc(467) int local467;
			@Pc(459) int local459;
			if (Static88.anInt2328 == 102) {
				local12 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local20 = (local12 & 0x7) + Static54.anInt1407;
				local16 = Static6.anInt161 + (local12 >> 4 & 0x7);
				local24 = Static80.aClass1_Sub8_Sub1_2.method1209() + local16;
				local28 = Static80.aClass1_Sub8_Sub1_2.method1209() + local20;
				local44 = Static80.aClass1_Sub8_Sub1_2.method1226();
				local35 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local298 = Static80.aClass1_Sub8_Sub1_2.method1186() * 4;
				local320 = Static80.aClass1_Sub8_Sub1_2.method1186() * 4;
				local455 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local459 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local463 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local467 = Static80.aClass1_Sub8_Sub1_2.method1186();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104 && local24 >= 0 && local28 >= 0 && local24 < 104 && local28 < 104 && local35 != 65535) {
					local16 = local16 * 128 + 64;
					local24 = local24 * 128 + 64;
					local20 = local20 * 128 + 64;
					local28 = local28 * 128 + 64;
					@Pc(551) Class1_Sub1_Sub8_Sub5 local551 = new Class1_Sub1_Sub8_Sub5(local35, Static82.anInt2165, local16, local20, Static104.method1821(local20, Static82.anInt2165, local16) - local298, Static27.anInt768 + local455, Static27.anInt768 + local459, local463, local467, local44, local320);
					local551.method1648(Static27.anInt768 + local455, local28, local24, Static104.method1821(local28, Static82.anInt2165, local24) - local320);
					Static43.aClass22_8.method512(local551);
				}
			} else if (Static88.anInt2328 == 59) {
				local12 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local16 = Static6.anInt161 + (local12 >> 4 & 0x7);
				local20 = (local12 & 0x7) + Static54.anInt1407;
				local24 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local28 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local44 = Static80.aClass1_Sub8_Sub1_2.method1199();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					@Pc(629) Class22 local629 = Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local16][local20];
					if (local629 != null) {
						for (@Pc(636) Class1_Sub1_Sub8_Sub2 local636 = (Class1_Sub1_Sub8_Sub2) local629.method515(); local636 != null; local636 = (Class1_Sub1_Sub8_Sub2) local629.method519()) {
							if ((local24 & 0x7FFF) == local636.anInt1827 && local636.anInt1824 == local28) {
								local636.anInt1824 = local44;
								break;
							}
						}
						Static90.method1658(local20, local16);
					}
				}
			} else if (Static88.anInt2328 == 203) {
				local12 = Static80.aClass1_Sub8_Sub1_2.method1211();
				local16 = local12 >> 2;
				local24 = Static38.anIntArray131[local16];
				local20 = local12 & 0x3;
				local28 = Static80.aClass1_Sub8_Sub1_2.method1220();
				local35 = Static54.anInt1407 + (local28 & 0x7);
				local44 = Static6.anInt161 + (local28 >> 4 & 0x7);
				local298 = Static80.aClass1_Sub8_Sub1_2.method1216();
				if (local44 >= 0 && local35 >= 0 && local44 < 104 && local35 < 104) {
					Static30.method569(local44, local20, local24, local35, local298, Static82.anInt2165, 0, -1, local16);
				}
			} else if (Static88.anInt2328 == 165) {
				local12 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local16 = (local12 >> 4 & 0x7) + Static6.anInt161;
				local20 = Static54.anInt1407 + (local12 & 0x7);
				local24 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local28 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local44 = Static80.aClass1_Sub8_Sub1_2.method1199();
				if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
					local20 = local20 * 128 + 64;
					local16 = local16 * 128 + 64;
					@Pc(827) Class1_Sub1_Sub8_Sub4 local827 = new Class1_Sub1_Sub8_Sub4(local24, Static82.anInt2165, local16, local20, Static104.method1821(local20, Static82.anInt2165, local16) - local28, local44, Static27.anInt768);
					Static24.aClass22_6.method512(local827);
				}
			} else {
				@Pc(920) int local920;
				if (Static88.anInt2328 == 216) {
					@Pc(841) byte local841 = Static80.aClass1_Sub8_Sub1_2.method1219();
					local16 = Static80.aClass1_Sub8_Sub1_2.method1206();
					local20 = Static80.aClass1_Sub8_Sub1_2.method1216();
					@Pc(853) byte local853 = Static80.aClass1_Sub8_Sub1_2.method1227();
					@Pc(857) byte local857 = Static80.aClass1_Sub8_Sub1_2.method1227();
					local44 = Static80.aClass1_Sub8_Sub1_2.method1220();
					local35 = local44 >> 2;
					local298 = local44 & 0x3;
					local320 = Static38.anIntArray131[local35];
					local455 = Static80.aClass1_Sub8_Sub1_2.method1208();
					@Pc(881) byte local881 = Static80.aClass1_Sub8_Sub1_2.method1227();
					local463 = Static80.aClass1_Sub8_Sub1_2.method1208();
					local467 = Static80.aClass1_Sub8_Sub1_2.method1220();
					@Pc(896) int local896 = Static54.anInt1407 + (local467 & 0x7);
					@Pc(905) Class1_Sub1_Sub8_Sub1_Sub2 local905;
					if (Static75.anInt1420 == local16) {
						local905 = Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1;
					} else {
						local905 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local16];
					}
					local920 = Static6.anInt161 + (local467 >> 4 & 0x7);
					if (local905 != null) {
						@Pc(926) Class1_Sub1_Sub9 local926 = Static42.method1755(local20);
						@Pc(936) int local936 = Static10.anIntArrayArrayArray1[Static82.anInt2165][local920][local896 + 1];
						@Pc(944) int local944 = Static10.anIntArrayArrayArray1[Static82.anInt2165][local920][local896];
						@Pc(954) int local954 = Static10.anIntArrayArrayArray1[Static82.anInt2165][local920 + 1][local896];
						@Pc(966) int local966 = Static10.anIntArrayArrayArray1[Static82.anInt2165][local920 + 1][local896 + 1];
						@Pc(976) Class1_Sub1_Sub8_Sub3 local976 = local926.method881(local936, local954, local966, local944, local298, local35);
						if (local976 != null) {
							Static30.method569(local920, 0, local320, local896, -1, Static82.anInt2165, local463 + 1, local455 + 1, 0);
							local905.aClass1_Sub1_Sub8_Sub3_3 = local976;
							local905.anInt2638 = local463 + Static27.anInt768;
							@Pc(1010) byte local1010;
							if (local857 > local881) {
								local1010 = local857;
								local857 = local881;
								local881 = local1010;
							}
							local905.anInt2634 = local455 + Static27.anInt768;
							@Pc(1023) int local1023 = local926.anInt1276;
							if (local853 < local841) {
								local1010 = local841;
								local841 = local853;
								local853 = local1010;
							}
							@Pc(1035) int local1035 = local926.anInt1279;
							if (local298 == 1 || local298 == 3) {
								local1035 = local926.anInt1276;
								local1023 = local926.anInt1279;
							}
							local905.anInt2619 = local1023 * 64 + local896 * 128;
							local905.anInt2613 = local920 * 128 + local1035 * 64;
							local905.anInt2624 = Static104.method1821(local905.anInt2619, Static82.anInt2165, local905.anInt2613);
							local905.anInt2627 = local857 + local920;
							local905.anInt2611 = local896 + local841;
							local905.anInt2640 = local920 + local881;
							local905.anInt2626 = local896 + local853;
						}
					}
				}
				if (Static88.anInt2328 == 92) {
					local12 = Static80.aClass1_Sub8_Sub1_2.method1199();
					local16 = Static80.aClass1_Sub8_Sub1_2.method1211();
					local20 = (local16 >> 4 & 0x7) + Static6.anInt161;
					local24 = Static54.anInt1407 + (local16 & 0x7);
					if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
						@Pc(1151) Class22 local1151 = Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local20][local24];
						if (local1151 != null) {
							for (local118 = (Class1_Sub1_Sub8_Sub2) local1151.method515(); local118 != null; local118 = (Class1_Sub1_Sub8_Sub2) local1151.method519()) {
								if ((local12 & 0x7FFF) == local118.anInt1827) {
									local118.method1825();
									break;
								}
							}
							if (local1151.method515() == null) {
								Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local20][local24] = null;
							}
							Static90.method1658(local24, local20);
						}
					}
				} else if (Static88.anInt2328 == 106) {
					local12 = Static80.aClass1_Sub8_Sub1_2.method1199();
					local16 = Static80.aClass1_Sub8_Sub1_2.method1207();
					local24 = (local16 & 0x7) + Static54.anInt1407;
					local20 = Static6.anInt161 + (local16 >> 4 & 0x7);
					local28 = Static80.aClass1_Sub8_Sub1_2.method1211();
					local35 = local28 & 0x3;
					local44 = local28 >> 2;
					local298 = Static38.anIntArray131[local44];
					if (local20 >= 0 && local24 >= 0 && local20 < 103 && local24 < 103) {
						local320 = Static10.anIntArrayArrayArray1[Static82.anInt2165][local20][local24];
						local459 = Static10.anIntArrayArrayArray1[Static82.anInt2165][local20 + 1][local24 + 1];
						local455 = Static10.anIntArrayArrayArray1[Static82.anInt2165][local20 + 1][local24];
						local463 = Static10.anIntArrayArrayArray1[Static82.anInt2165][local20][local24 + 1];
						if (local298 == 0) {
							@Pc(1300) Class2 local1300 = Static88.aClass20_1.method498(Static82.anInt2165, local20, local24);
							if (local1300 != null) {
								local920 = local1300.anInt97 >> 14 & 0x7FFF;
								if (local44 == 2) {
									local1300.aClass1_Sub1_Sub8_1 = new Class1_Sub1_Sub8_Sub6(local920, 2, local35 + 4, local320, local455, local459, local463, local12, false);
									local1300.aClass1_Sub1_Sub8_2 = new Class1_Sub1_Sub8_Sub6(local920, 2, local35 + 1 & 0x3, local320, local455, local459, local463, local12, false);
								} else {
									local1300.aClass1_Sub1_Sub8_1 = new Class1_Sub1_Sub8_Sub6(local920, local44, local35, local320, local455, local459, local463, local12, false);
								}
							}
						}
						if (local298 == 1) {
							@Pc(1373) Class65 local1373 = Static88.aClass20_1.method487(Static82.anInt2165, local20, local24);
							if (local1373 != null) {
								local1373.aClass1_Sub1_Sub8_8 = new Class1_Sub1_Sub8_Sub6(local1373.anInt2763 >> 14 & 0x7FFF, 4, 0, local320, local455, local459, local463, local12, false);
							}
						}
						if (local298 == 2) {
							if (local44 == 11) {
								local44 = 10;
							}
							@Pc(1410) Class61 local1410 = Static88.aClass20_1.method450(Static82.anInt2165, local20, local24);
							if (local1410 != null) {
								local1410.aClass1_Sub1_Sub8_7 = new Class1_Sub1_Sub8_Sub6(local1410.anInt2677 >> 14 & 0x7FFF, local44, local35, local320, local455, local459, local463, local12, false);
							}
						}
						if (local298 == 3) {
							@Pc(1442) Class43 local1442 = Static88.aClass20_1.method483(Static82.anInt2165, local20, local24);
							if (local1442 != null) {
								local1442.aClass1_Sub1_Sub8_3 = new Class1_Sub1_Sub8_Sub6(local1442.anInt1560 >> 14 & 0x7FFF, 22, local35, local320, local455, local459, local463, local12, false);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V")
	public static void method1285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (!Static75.aBoolean85) {
			arg1 = 0;
		}
		if (Static2.anInt98 == arg0 && Static89.anInt2380 == arg4 && Static21.anInt663 == arg1) {
			return;
		}
		Static21.anInt663 = arg1;
		Static89.anInt2380 = arg4;
		Static2.anInt98 = arg0;
		Static12.method278(25);
		Static19.method440(false, null, Static5.aClass42_92);
		@Pc(35) int local35 = Static45.anInt1843;
		@Pc(37) int local37 = Static51.anInt1373;
		Static51.anInt1373 = (arg0 - 6) * 8;
		Static45.anInt1843 = (arg4 - 6) * 8;
		@Pc(54) int local54 = Static51.anInt1373 - local37;
		@Pc(59) int local59 = Static45.anInt1843 - local35;
		for (@Pc(65) int local65 = 0; local65 < 32768; local65++) {
			@Pc(71) Class1_Sub1_Sub8_Sub1_Sub1 local71 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local65];
			if (local71 != null) {
				for (@Pc(75) int local75 = 0; local75 < 10; local75++) {
					local71.anIntArray395[local75] -= local54;
					local71.anIntArray393[local75] -= local59;
				}
				local71.anInt2583 -= local59 * 128;
				local71.anInt2576 -= local54 * 128;
			}
		}
		for (@Pc(121) int local121 = 0; local121 < 2048; local121++) {
			@Pc(127) Class1_Sub1_Sub8_Sub1_Sub2 local127 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local121];
			if (local127 != null) {
				for (@Pc(131) int local131 = 0; local131 < 10; local131++) {
					local127.anIntArray395[local131] -= local54;
					local127.anIntArray393[local131] -= local59;
				}
				local127.anInt2583 -= local59 * 128;
				local127.anInt2576 -= local54 * 128;
			}
		}
		Static82.anInt2165 = arg1;
		Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.method1762(arg2, false, arg3);
		@Pc(185) byte local185 = 0;
		@Pc(187) byte local187 = 104;
		@Pc(189) byte local189 = 0;
		@Pc(191) byte local191 = 104;
		@Pc(193) byte local193 = 1;
		if (local59 < 0) {
			local193 = -1;
			local191 = -1;
			local189 = 103;
		}
		@Pc(206) byte local206 = 1;
		if (local54 < 0) {
			local187 = -1;
			local185 = 103;
			local206 = -1;
		}
		for (@Pc(216) int local216 = local185; local216 != local187; local216 += local206) {
			for (@Pc(220) int local220 = local189; local220 != local191; local220 += local193) {
				@Pc(226) int local226 = local54 + local216;
				@Pc(230) int local230 = local59 + local220;
				for (@Pc(232) int local232 = 0; local232 < 4; local232++) {
					if (local226 >= 0 && local230 >= 0 && local226 < 104 && local230 < 104) {
						Static93.aClass22ArrayArrayArray1[local232][local216][local220] = Static93.aClass22ArrayArrayArray1[local232][local226][local230];
					} else {
						Static93.aClass22ArrayArrayArray1[local232][local216][local220] = null;
					}
				}
			}
		}
		for (@Pc(308) Class1_Sub3 local308 = (Class1_Sub3) Static33.aClass22_7.method515(); local308 != null; local308 = (Class1_Sub3) Static33.aClass22_7.method519()) {
			local308.anInt596 -= local54;
			local308.anInt583 -= local59;
			if (local308.anInt596 < 0 || local308.anInt583 < 0 || local308.anInt596 >= 104 || local308.anInt583 >= 104) {
				local308.method1825();
			}
		}
		Static65.anInt1577 = 0;
		if (Static61.anInt1459 != 0) {
			Static30.anInt833 -= local59;
			Static61.anInt1459 -= local54;
		}
		Static107.aBoolean147 = false;
		Static72.anInt2003 = -1;
		Static24.aClass22_6.method523();
		Static43.aClass22_8.method523();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ed;IIIIILclient!ba;ZII)V")
	public static void method1286(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static10.anIntArrayArrayArray1[arg3][arg5][arg2];
		@Pc(23) int local23 = Static10.anIntArrayArrayArray1[arg3][arg5 + 1][arg2];
		@Pc(35) int local35 = Static10.anIntArrayArrayArray1[arg3][arg5 + 1][arg2 + 1];
		@Pc(45) int local45 = Static10.anIntArrayArrayArray1[arg3][arg5][arg2 + 1];
		@Pc(62) int local62 = local45 + local13 + local23 + local35 >> 2;
		@Pc(74) int local74 = (arg1 << 14) + arg5 + (arg2 << 7) + 1073741824;
		@Pc(78) Class1_Sub1_Sub9 local78 = Static42.method1755(arg1);
		if (local78.anInt1272 == 0) {
			local74 += Integer.MIN_VALUE;
		}
		@Pc(91) int local91 = arg7 + (arg8 << 6);
		if (local78.anInt1250 == 1) {
			local91 += 256;
		}
		@Pc(123) Class1_Sub1_Sub8 local123;
		if (arg7 == 22) {
			if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
				local123 = local78.method881(local45, local23, local35, local13, arg8, 22);
			} else {
				local123 = new Class1_Sub1_Sub8_Sub6(arg1, 22, arg8, local13, local23, local35, local45, local78.anInt1252, true);
			}
			arg0.method496(arg4, arg5, arg2, local62, local123, local74, local91);
			if (local78.aBoolean75 && local78.anInt1272 == 1) {
				arg6.method117(arg2, arg5);
			}
			return;
		}
		@Pc(216) int local216;
		if (arg7 == 10 || arg7 == 11) {
			if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
				local123 = local78.method881(local45, local23, local35, local13, arg8, 10);
			} else {
				local123 = new Class1_Sub1_Sub8_Sub6(arg1, 10, arg8, local13, local23, local35, local45, local78.anInt1252, true);
			}
			if (local123 != null) {
				@Pc(213) int local213;
				if (arg8 == 1 || arg8 == 3) {
					local216 = local78.anInt1276;
					local213 = local78.anInt1279;
				} else {
					local213 = local78.anInt1276;
					local216 = local78.anInt1279;
				}
				@Pc(226) int local226 = 0;
				if (arg7 == 11) {
					local226 += 256;
				}
				arg0.method472(arg4, arg5, arg2, local62, local216, local213, local123, local226, local74, local91);
			}
			if (local78.aBoolean75) {
				arg6.method112(arg2, arg5, local78.anInt1279, local78.aBoolean71, arg8, local78.anInt1276);
			}
		} else if (arg7 >= 12) {
			if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
				local123 = local78.method881(local45, local23, local35, local13, arg8, arg7);
			} else {
				local123 = new Class1_Sub1_Sub8_Sub6(arg1, arg7, arg8, local13, local23, local35, local45, local78.anInt1252, true);
			}
			arg0.method472(arg4, arg5, arg2, local62, 1, 1, local123, 0, local74, local91);
			if (local78.aBoolean75) {
				arg6.method112(arg2, arg5, local78.anInt1279, local78.aBoolean71, arg8, local78.anInt1276);
			}
		} else if (arg7 == 0) {
			if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
				local123 = local78.method881(local45, local23, local35, local13, arg8, 0);
			} else {
				local123 = new Class1_Sub1_Sub8_Sub6(arg1, 0, arg8, local13, local23, local35, local45, local78.anInt1252, true);
			}
			arg0.method497(arg4, arg5, arg2, local62, local123, null, Static3.anIntArray16[arg8], 0, local74, local91);
			if (local78.aBoolean75) {
				arg6.method124(arg8, arg7, arg5, local78.aBoolean71, arg2);
			}
		} else if (arg7 == 1) {
			if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
				local123 = local78.method881(local45, local23, local35, local13, arg8, 1);
			} else {
				local123 = new Class1_Sub1_Sub8_Sub6(arg1, 1, arg8, local13, local23, local35, local45, local78.anInt1252, true);
			}
			arg0.method497(arg4, arg5, arg2, local62, local123, null, Static28.anIntArray94[arg8], 0, local74, local91);
			if (local78.aBoolean75) {
				arg6.method124(arg8, arg7, arg5, local78.aBoolean71, arg2);
			}
		} else {
			@Pc(459) int local459;
			@Pc(489) Class1_Sub1_Sub8 local489;
			if (arg7 == 2) {
				local459 = arg8 + 1 & 0x3;
				@Pc(479) Class1_Sub1_Sub8 local479;
				if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
					local479 = local78.method881(local45, local23, local35, local13, arg8 + 4, 2);
					local489 = local78.method881(local45, local23, local35, local13, local459, 2);
				} else {
					local479 = new Class1_Sub1_Sub8_Sub6(arg1, 2, arg8 + 4, local13, local23, local35, local45, local78.anInt1252, true);
					local489 = new Class1_Sub1_Sub8_Sub6(arg1, 2, local459, local13, local23, local35, local45, local78.anInt1252, true);
				}
				arg0.method497(arg4, arg5, arg2, local62, local479, local489, Static3.anIntArray16[arg8], Static3.anIntArray16[local459], local74, local91);
				if (local78.aBoolean75) {
					arg6.method124(arg8, arg7, arg5, local78.aBoolean71, arg2);
				}
			} else if (arg7 == 3) {
				if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
					local123 = local78.method881(local45, local23, local35, local13, arg8, 3);
				} else {
					local123 = new Class1_Sub1_Sub8_Sub6(arg1, 3, arg8, local13, local23, local35, local45, local78.anInt1252, true);
				}
				arg0.method497(arg4, arg5, arg2, local62, local123, null, Static28.anIntArray94[arg8], 0, local74, local91);
				if (local78.aBoolean75) {
					arg6.method124(arg8, arg7, arg5, local78.aBoolean71, arg2);
				}
			} else if (arg7 == 9) {
				if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
					local123 = local78.method881(local45, local23, local35, local13, arg8, arg7);
				} else {
					local123 = new Class1_Sub1_Sub8_Sub6(arg1, arg7, arg8, local13, local23, local35, local45, local78.anInt1252, true);
				}
				arg0.method472(arg4, arg5, arg2, local62, 1, 1, local123, 0, local74, local91);
				if (local78.aBoolean75) {
					arg6.method112(arg2, arg5, local78.anInt1279, local78.aBoolean71, arg8, local78.anInt1276);
				}
			} else {
				if (local78.aBoolean73) {
					if (arg8 == 1) {
						local459 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local13;
						local13 = local459;
					} else if (arg8 == 2) {
						local459 = local45;
						local45 = local23;
						local23 = local459;
						local459 = local35;
						local35 = local13;
						local13 = local459;
					} else if (arg8 == 3) {
						local459 = local45;
						local45 = local13;
						local13 = local23;
						local23 = local35;
						local35 = local459;
					}
				}
				if (arg7 == 4) {
					if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
						local123 = local78.method881(local45, local23, local35, local13, 0, 4);
					} else {
						local123 = new Class1_Sub1_Sub8_Sub6(arg1, 4, 0, local13, local23, local35, local45, local78.anInt1252, true);
					}
					arg0.method482(arg4, arg5, arg2, local62, local123, Static3.anIntArray16[arg8], arg8 * 512, 0, 0, local74, local91);
				} else if (arg7 == 5) {
					local459 = 16;
					local216 = arg0.method474(arg4, arg5, arg2);
					if (local216 > 0) {
						local459 = Static42.method1755(local216 >> 14 & 0x7FFF).anInt1264;
					}
					if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
						local489 = local78.method881(local45, local23, local35, local13, 0, 4);
					} else {
						local489 = new Class1_Sub1_Sub8_Sub6(arg1, 4, 0, local13, local23, local35, local45, local78.anInt1252, true);
					}
					arg0.method482(arg4, arg5, arg2, local62, local489, Static3.anIntArray16[arg8], arg8 * 512, Static52.anIntArray208[arg8] * local459, local459 * Static97.anIntArray373[arg8], local74, local91);
				} else if (arg7 == 6) {
					if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
						local123 = local78.method881(local45, local23, local35, local13, 0, 4);
					} else {
						local123 = new Class1_Sub1_Sub8_Sub6(arg1, 4, 0, local13, local23, local35, local45, local78.anInt1252, true);
					}
					arg0.method482(arg4, arg5, arg2, local62, local123, 256, arg8, 0, 0, local74, local91);
				} else if (arg7 == 7) {
					if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
						local123 = local78.method881(local45, local23, local35, local13, 0, 4);
					} else {
						local123 = new Class1_Sub1_Sub8_Sub6(arg1, 4, 0, local13, local23, local35, local45, local78.anInt1252, true);
					}
					arg0.method482(arg4, arg5, arg2, local62, local123, 512, arg8, 0, 0, local74, local91);
				} else if (arg7 == 8) {
					if (local78.anInt1252 == -1 && local78.anIntArray190 == null) {
						local123 = local78.method881(local45, local23, local35, local13, 0, 4);
					} else {
						local123 = new Class1_Sub1_Sub8_Sub6(arg1, 4, 0, local13, local23, local35, local45, local78.anInt1252, true);
					}
					arg0.method482(arg4, arg5, arg2, local62, local123, 768, arg8, 0, 0, local74, local91);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!mc;B)Z")
	public static boolean method1287(@OriginalArg(0) Class42 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static8.anInt239; local11++) {
			if (arg0.method1040(Static8.aClass42Array3[local11])) {
				return true;
			}
		}
		return arg0.method1040(Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.aClass42_1396);
	}

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V")
	public static void method1288() {
		aClass42_946 = null;
	}
}
