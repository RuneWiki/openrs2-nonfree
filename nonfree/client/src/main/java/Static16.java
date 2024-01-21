import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
	public static int anInt444;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "Z")
	public static volatile boolean aBoolean12 = true;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "Lclient!fc;")
	public static Class25 aClass25_227 = Static78.method1313("hitmarks");

	@OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
	public static final int anInt441 = 3353893;

	@OriginalMember(owner = "client!cc", name = "Z", descriptor = "Lclient!fc;")
	public static Class25 aClass25_228 = Static78.method1313("ams");

	@OriginalMember(owner = "client!cc", name = "ab", descriptor = "Lclient!fc;")
	public static Class25 aClass25_229 = Static78.method1313("<col=ffff00>*V");

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZI)Lclient!fc;")
	public static Class25 method376(@OriginalArg(0) int arg0) {
		return Static88.method1457(arg0, true);
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
	public static void method378() {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(58) int local58;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(44) int local44;
		@Pc(74) int local74;
		if (Static38.anInt1078 == 180) {
			local14 = Static35.aClass1_Sub5_Sub1_1.method672();
			local20 = Static95.anInt2170 + (local14 & 0x7);
			local28 = (local14 >> 4 & 0x7) + Static122.anInt2923;
			local36 = Static35.aClass1_Sub5_Sub1_1.method643() + local28;
			local44 = local20 + Static35.aClass1_Sub5_Sub1_1.method643();
			local48 = Static35.aClass1_Sub5_Sub1_1.method668();
			local52 = Static35.aClass1_Sub5_Sub1_1.method651();
			local58 = Static35.aClass1_Sub5_Sub1_1.method672() * 4;
			local64 = Static35.aClass1_Sub5_Sub1_1.method672() * 4;
			local68 = Static35.aClass1_Sub5_Sub1_1.method651();
			local74 = Static35.aClass1_Sub5_Sub1_1.method651();
			local78 = Static35.aClass1_Sub5_Sub1_1.method672();
			local82 = Static35.aClass1_Sub5_Sub1_1.method672();
			if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104 && local36 >= 0 && local44 >= 0 && local36 < 104 && local44 < 104 && local52 != 65535) {
				local36 = local36 * 128 + 64;
				local28 = local28 * 128 + 64;
				local20 = local20 * 128 + 64;
				@Pc(163) Class1_Sub2_Sub3_Sub6 local163 = new Class1_Sub2_Sub3_Sub6(local52, Static21.anInt596, local28, local20, Static129.method2048(local20, Static21.anInt596, local28) - local58, Static60.anInt1366 + local68, Static60.anInt1366 + local74, local78, local82, local48, local64);
				local44 = local44 * 128 + 64;
				local163.method1771(local44, Static129.method2048(local44, Static21.anInt596, local36) - local64, local36, local68 + Static60.anInt1366);
				Static119.aClass2_11.method33(local163);
			}
			return;
		}
		@Pc(241) Class1_Sub2_Sub3_Sub3 local241;
		if (Static38.anInt1078 == 113) {
			local14 = Static35.aClass1_Sub5_Sub1_1.method677();
			local28 = Static35.aClass1_Sub5_Sub1_1.method670();
			local20 = Static35.aClass1_Sub5_Sub1_1.method671();
			local44 = Static95.anInt2170 + (local20 & 0x7);
			local36 = (local20 >> 4 & 0x7) + Static122.anInt2923;
			if (local36 >= 0 && local44 >= 0 && local36 < 104 && local44 < 104) {
				local241 = new Class1_Sub2_Sub3_Sub3();
				local241.anInt1448 = local28;
				local241.anInt1443 = local14;
				if (Static7.aClass2ArrayArrayArray1[Static21.anInt596][local36][local44] == null) {
					Static7.aClass2ArrayArrayArray1[Static21.anInt596][local36][local44] = new Class2();
				}
				Static7.aClass2ArrayArrayArray1[Static21.anInt596][local36][local44].method33(local241);
				Static8.method232(local44, local36);
			}
		} else if (Static38.anInt1078 == 223) {
			local14 = Static35.aClass1_Sub5_Sub1_1.method672();
			local20 = Static95.anInt2170 + (local14 & 0x7);
			local28 = (local14 >> 4 & 0x7) + Static122.anInt2923;
			local36 = Static35.aClass1_Sub5_Sub1_1.method651();
			local44 = Static35.aClass1_Sub5_Sub1_1.method651();
			local48 = Static35.aClass1_Sub5_Sub1_1.method651();
			if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104) {
				@Pc(340) Class2 local340 = Static7.aClass2ArrayArrayArray1[Static21.anInt596][local28][local20];
				if (local340 != null) {
					for (@Pc(347) Class1_Sub2_Sub3_Sub3 local347 = (Class1_Sub2_Sub3_Sub3) local340.method22(); local347 != null; local347 = (Class1_Sub2_Sub3_Sub3) local340.method23()) {
						if (local347.anInt1448 == (local36 & 0x7FFF) && local44 == local347.anInt1443) {
							local347.anInt1443 = local48;
							break;
						}
					}
					Static8.method232(local20, local28);
				}
			}
		} else if (Static38.anInt1078 == 243) {
			local14 = Static35.aClass1_Sub5_Sub1_1.method630();
			local28 = Static122.anInt2923 + (local14 >> 4 & 0x7);
			local20 = Static95.anInt2170 + (local14 & 0x7);
			local36 = Static35.aClass1_Sub5_Sub1_1.method651();
			if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104) {
				@Pc(437) Class2 local437 = Static7.aClass2ArrayArrayArray1[Static21.anInt596][local28][local20];
				if (local437 != null) {
					for (local241 = (Class1_Sub2_Sub3_Sub3) local437.method22(); local241 != null; local241 = (Class1_Sub2_Sub3_Sub3) local437.method23()) {
						if ((local36 & 0x7FFF) == local241.anInt1448) {
							local241.method2024();
							break;
						}
					}
					if (local437.method22() == null) {
						Static7.aClass2ArrayArrayArray1[Static21.anInt596][local28][local20] = null;
					}
					Static8.method232(local20, local28);
				}
			}
		} else {
			@Pc(553) int local553;
			if (Static38.anInt1078 == 20) {
				local14 = Static35.aClass1_Sub5_Sub1_1.method677();
				@Pc(502) byte local502 = Static35.aClass1_Sub5_Sub1_1.method643();
				local20 = Static35.aClass1_Sub5_Sub1_1.method677();
				@Pc(510) byte local510 = Static35.aClass1_Sub5_Sub1_1.method643();
				@Pc(514) byte local514 = Static35.aClass1_Sub5_Sub1_1.method634();
				local48 = Static35.aClass1_Sub5_Sub1_1.method648();
				local52 = Static122.anInt2923 + (local48 >> 4 & 0x7);
				local58 = Static95.anInt2170 + (local48 & 0x7);
				local64 = Static35.aClass1_Sub5_Sub1_1.method651();
				local68 = Static35.aClass1_Sub5_Sub1_1.method642();
				@Pc(545) byte local545 = Static35.aClass1_Sub5_Sub1_1.method639();
				local78 = Static35.aClass1_Sub5_Sub1_1.method648();
				local553 = local78 & 0x3;
				@Pc(560) Class1_Sub2_Sub3_Sub4_Sub2 local560;
				if (local20 == Static45.anInt1178) {
					local560 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1;
				} else {
					local560 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local20];
				}
				local82 = local78 >> 2;
				@Pc(572) int local572 = Static63.anIntArray273[local82];
				if (local560 != null) {
					@Pc(578) Class1_Sub2_Sub6 local578 = Static78.method1315(local68);
					@Pc(588) int local588 = Static7.anIntArrayArrayArray3[Static21.anInt596][local52 + 1][local58];
					@Pc(600) int local600 = Static7.anIntArrayArrayArray3[Static21.anInt596][local52 + 1][local58 + 1];
					@Pc(608) int local608 = Static7.anIntArrayArrayArray3[Static21.anInt596][local52][local58];
					@Pc(618) int local618 = Static7.anIntArrayArrayArray3[Static21.anInt596][local52][local58 + 1];
					@Pc(630) Class1_Sub2_Sub3_Sub2 local630 = local578.method710(local618, local82, local608, local553, local588, local600);
					if (local630 != null) {
						Static45.method962(local58, 0, local14 + 1, local572, Static21.anInt596, local52, -1, 0, local64 + 1);
						local560.aClass1_Sub2_Sub3_Sub2_3 = local630;
						local560.anInt2857 = Static60.anInt1366 + local14;
						local560.anInt2849 = Static60.anInt1366 + local64;
						@Pc(663) int local663 = local578.anInt845;
						@Pc(666) int local666 = local578.anInt857;
						if (local553 == 1 || local553 == 3) {
							local663 = local578.anInt857;
							local666 = local578.anInt845;
						}
						local560.anInt2860 = local663 * 64 + local52 * 128;
						local560.anInt2861 = local666 * 64 + local58 * 128;
						@Pc(703) byte local703;
						if (local510 < local514) {
							local703 = local514;
							local514 = local510;
							local510 = local703;
						}
						local560.anInt2853 = Static129.method2048(local560.anInt2861, Static21.anInt596, local560.anInt2860);
						if (local545 > local502) {
							local703 = local545;
							local545 = local502;
							local502 = local703;
						}
						local560.anInt2847 = local502 + local58;
						local560.anInt2851 = local545 + local58;
						local560.anInt2841 = local510 + local52;
						local560.anInt2844 = local52 + local514;
					}
				}
			}
			if (Static38.anInt1078 == 122) {
				local14 = Static35.aClass1_Sub5_Sub1_1.method672();
				local20 = Static95.anInt2170 + (local14 & 0x7);
				local28 = Static122.anInt2923 + (local14 >> 4 & 0x7);
				local36 = Static35.aClass1_Sub5_Sub1_1.method651();
				local44 = Static35.aClass1_Sub5_Sub1_1.method672();
				local48 = Static35.aClass1_Sub5_Sub1_1.method651();
				if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104) {
					local20 = local20 * 128 + 64;
					local28 = local28 * 128 + 64;
					@Pc(834) Class1_Sub2_Sub3_Sub1 local834 = new Class1_Sub2_Sub3_Sub1(local36, Static21.anInt596, local28, local20, Static129.method2048(local20, Static21.anInt596, local28) - local44, local48, Static60.anInt1366);
					Static100.aClass2_10.method33(local834);
				}
			} else if (Static38.anInt1078 == 27) {
				local14 = Static35.aClass1_Sub5_Sub1_1.method651();
				local28 = Static35.aClass1_Sub5_Sub1_1.method630();
				local20 = local28 >> 2;
				local44 = Static63.anIntArray273[local20];
				local36 = local28 & 0x3;
				local48 = Static35.aClass1_Sub5_Sub1_1.method630();
				local58 = Static95.anInt2170 + (local48 & 0x7);
				local52 = Static122.anInt2923 + (local48 >> 4 & 0x7);
				if (local52 >= 0 && local58 >= 0 && local52 < 103 && local58 < 103) {
					local64 = Static7.anIntArrayArrayArray3[Static21.anInt596][local52][local58];
					local74 = Static7.anIntArrayArrayArray3[Static21.anInt596][local52 + 1][local58 + 1];
					local68 = Static7.anIntArrayArrayArray3[Static21.anInt596][local52 + 1][local58];
					local78 = Static7.anIntArrayArrayArray3[Static21.anInt596][local52][local58 + 1];
					if (local44 == 0) {
						@Pc(944) Class53 local944 = Static118.aClass4_1.method52(Static21.anInt596, local52, local58);
						if (local944 != null) {
							local553 = local944.anInt1548 >> 14 & 0x7FFF;
							if (local20 == 2) {
								local944.aClass1_Sub2_Sub3_8 = new Class1_Sub2_Sub3_Sub5(local553, 2, local36 + 4, local64, local68, local74, local78, local14, false, local944.aClass1_Sub2_Sub3_8);
								local944.aClass1_Sub2_Sub3_7 = new Class1_Sub2_Sub3_Sub5(local553, 2, local36 + 1 & 0x3, local64, local68, local74, local78, local14, false, local944.aClass1_Sub2_Sub3_7);
							} else {
								local944.aClass1_Sub2_Sub3_8 = new Class1_Sub2_Sub3_Sub5(local553, local20, local36, local64, local68, local74, local78, local14, false, local944.aClass1_Sub2_Sub3_8);
							}
						}
					}
					if (local44 == 1) {
						@Pc(1021) Class10 local1021 = Static118.aClass4_1.method91(Static21.anInt596, local52, local58);
						if (local1021 != null) {
							local1021.aClass1_Sub2_Sub3_4 = new Class1_Sub2_Sub3_Sub5(local1021.anInt260 >> 14 & 0x7FFF, 4, 0, local64, local68, local74, local78, local14, false, local1021.aClass1_Sub2_Sub3_4);
						}
					}
					if (local44 == 2) {
						if (local20 == 11) {
							local20 = 10;
						}
						@Pc(1060) Class38 local1060 = Static118.aClass4_1.method78(Static21.anInt596, local52, local58);
						if (local1060 != null) {
							local1060.aClass1_Sub2_Sub3_6 = new Class1_Sub2_Sub3_Sub5(local1060.anInt1290 >> 14 & 0x7FFF, local20, local36, local64, local68, local74, local78, local14, false, local1060.aClass1_Sub2_Sub3_6);
						}
					}
					if (local44 == 3) {
						@Pc(1094) Class31 local1094 = Static118.aClass4_1.method93(Static21.anInt596, local52, local58);
						if (local1094 != null) {
							local1094.aClass1_Sub2_Sub3_5 = new Class1_Sub2_Sub3_Sub5(local1094.anInt1193 >> 14 & 0x7FFF, 22, local36, local64, local68, local74, local78, local14, false, local1094.aClass1_Sub2_Sub3_5);
						}
					}
				}
			} else if (Static38.anInt1078 == 202) {
				local14 = Static35.aClass1_Sub5_Sub1_1.method672();
				local28 = (local14 >> 4 & 0x7) + Static122.anInt2923;
				local20 = Static95.anInt2170 + (local14 & 0x7);
				local36 = Static35.aClass1_Sub5_Sub1_1.method642();
				local44 = Static35.aClass1_Sub5_Sub1_1.method642();
				local48 = Static35.aClass1_Sub5_Sub1_1.method651();
				if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104 && Static45.anInt1178 != local44) {
					@Pc(1181) Class1_Sub2_Sub3_Sub3 local1181 = new Class1_Sub2_Sub3_Sub3();
					local1181.anInt1448 = local36;
					local1181.anInt1443 = local48;
					if (Static7.aClass2ArrayArrayArray1[Static21.anInt596][local28][local20] == null) {
						Static7.aClass2ArrayArrayArray1[Static21.anInt596][local28][local20] = new Class2();
					}
					Static7.aClass2ArrayArrayArray1[Static21.anInt596][local28][local20].method33(local1181);
					Static8.method232(local20, local28);
				}
			} else if (Static38.anInt1078 == 124) {
				local14 = Static35.aClass1_Sub5_Sub1_1.method642();
				local28 = Static35.aClass1_Sub5_Sub1_1.method671();
				local20 = Static122.anInt2923 + (local28 >> 4 & 0x7);
				local36 = Static95.anInt2170 + (local28 & 0x7);
				local44 = Static35.aClass1_Sub5_Sub1_1.method630();
				local48 = local44 >> 2;
				local58 = Static63.anIntArray273[local48];
				local52 = local44 & 0x3;
				if (local20 >= 0 && local36 >= 0 && local20 < 104 && local36 < 104) {
					Static45.method962(local36, local52, 0, local58, Static21.anInt596, local20, local14, local48, -1);
				}
			} else if (Static38.anInt1078 == 22) {
				local14 = Static35.aClass1_Sub5_Sub1_1.method671();
				local20 = (local14 & 0x7) + Static95.anInt2170;
				local28 = (local14 >> 4 & 0x7) + Static122.anInt2923;
				local36 = Static35.aClass1_Sub5_Sub1_1.method630();
				local48 = local36 & 0x3;
				local44 = local36 >> 2;
				local52 = Static63.anIntArray273[local44];
				if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104) {
					Static45.method962(local20, local48, 0, local52, Static21.anInt596, local28, -1, local44, -1);
				}
			} else if (Static38.anInt1078 == 255) {
				local14 = Static35.aClass1_Sub5_Sub1_1.method672();
				local28 = Static122.anInt2923 + (local14 >> 4 & 0x7);
				local20 = (local14 & 0x7) + Static95.anInt2170;
				local36 = Static35.aClass1_Sub5_Sub1_1.method651();
				local44 = Static35.aClass1_Sub5_Sub1_1.method672();
				local52 = local44 & 0x7;
				local48 = local44 >> 4 & 0xF;
				local58 = Static35.aClass1_Sub5_Sub1_1.method672();
				if (local28 >= 0 && local20 >= 0 && local28 < 104 && local20 < 104) {
					local64 = local48 + 1;
					if (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0] >= local28 - local64 && local28 + local64 >= Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0] && local20 - local64 <= Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0] && local64 + local20 >= Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0] && Static21.anInt601 != 0 && local52 > 0 && Static122.anInt2922 < 50) {
						Static78.anIntArray312[Static122.anInt2922] = local36;
						Static122.anIntArray496[Static122.anInt2922] = local52;
						Static1.anIntArray7[Static122.anInt2922] = local58;
						Static22.aClass16Array2[Static122.anInt2922] = null;
						Static42.anIntArray217[Static122.anInt2922] = (local20 << 8) + (local28 << 16) + local48;
						Static122.anInt2922++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!oc;ZIIIII)V")
	public static void method379(@OriginalArg(0) Class56 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		Static53.aClass56_78 = arg0;
		Static126.anInt2930 = arg1;
		Static120.anInt2848 = arg2;
		Static1.anInt19 = 2;
		Static118.aBoolean123 = false;
		Static64.anInt1442 = arg3;
		Static88.anInt1984 = 1;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	public static void method380() {
		aCRC32_1 = null;
		aClass25_228 = null;
		aClass25_227 = null;
		aClass25_229 = null;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
	public static void method382() {
		@Pc(9) int local9 = Static76.anInt1594 * 128 + 64;
		@Pc(15) int local15 = Static47.anInt1204 * 128 + 64;
		@Pc(24) int local24 = Static129.method2048(local9, Static21.anInt596, local15) - Static26.anInt734;
		if (Static67.anInt1471 < local9) {
			Static67.anInt1471 += Static74.anInt1536 + Static6.anInt121 * (local9 - Static67.anInt1471) / 1000;
			if (Static67.anInt1471 > local9) {
				Static67.anInt1471 = local9;
			}
		}
		if (local15 > Static75.anInt1566) {
			Static75.anInt1566 += Static74.anInt1536 + (local15 - Static75.anInt1566) * Static6.anInt121 / 1000;
			if (Static75.anInt1566 > local15) {
				Static75.anInt1566 = local15;
			}
		}
		if (local9 < Static67.anInt1471) {
			Static67.anInt1471 -= Static74.anInt1536 + Static6.anInt121 * (Static67.anInt1471 - local9) / 1000;
			if (Static67.anInt1471 < local9) {
				Static67.anInt1471 = local9;
			}
		}
		if (local24 > Static90.anInt2026) {
			Static90.anInt2026 += (local24 - Static90.anInt2026) * Static6.anInt121 / 1000 + Static74.anInt1536;
			if (local24 < Static90.anInt2026) {
				Static90.anInt2026 = local24;
			}
		}
		if (local15 < Static75.anInt1566) {
			Static75.anInt1566 -= Static74.anInt1536 + Static6.anInt121 * (Static75.anInt1566 - local15) / 1000;
			if (Static75.anInt1566 < local15) {
				Static75.anInt1566 = local15;
			}
		}
		if (Static90.anInt2026 > local24) {
			Static90.anInt2026 -= Static74.anInt1536 + (Static90.anInt2026 - local24) * Static6.anInt121 / 1000;
			if (local24 > Static90.anInt2026) {
				Static90.anInt2026 = local24;
			}
		}
		local9 = Static37.anInt1049 * 128 + 64;
		local15 = Static101.anInt2350 * 128 + 64;
		local24 = Static129.method2048(local9, Static21.anInt596, local15) - Static106.anInt2480;
		@Pc(212) int local212 = local9 - Static67.anInt1471;
		@Pc(217) int local217 = local24 - Static90.anInt2026;
		@Pc(222) int local222 = local15 - Static75.anInt1566;
		@Pc(233) int local233 = (int) Math.sqrt((double) (local222 * local222 + local212 * local212));
		@Pc(244) int local244 = (int) (Math.atan2((double) local217, (double) local233) * 325.949D) & 0x7FF;
		if (local244 < 128) {
			local244 = 128;
		}
		if (local244 > 383) {
			local244 = 383;
		}
		@Pc(269) int local269 = (int) (Math.atan2((double) local222, (double) local212) * -325.949D) & 0x7FF;
		if (local244 > Static35.anInt1003) {
			Static35.anInt1003 += Static47.anInt1205 + Static64.anInt1445 * (local244 - Static35.anInt1003) / 1000;
			if (Static35.anInt1003 > local244) {
				Static35.anInt1003 = local244;
			}
		}
		@Pc(295) int local295 = local269 - Static106.anInt2477;
		if (local295 > 1024) {
			local295 -= 2048;
		}
		if (local295 < -1024) {
			local295 += 2048;
		}
		if (local295 > 0) {
			Static106.anInt2477 += Static64.anInt1445 * local295 / 1000 + Static47.anInt1205;
			Static106.anInt2477 &= 0x7FF;
		}
		if (local295 < 0) {
			Static106.anInt2477 -= Static64.anInt1445 * -local295 / 1000 + Static47.anInt1205;
			Static106.anInt2477 &= 0x7FF;
		}
		if (local244 < Static35.anInt1003) {
			Static35.anInt1003 -= Static47.anInt1205 + Static64.anInt1445 * (Static35.anInt1003 - local244) / 1000;
			if (Static35.anInt1003 < local244) {
				Static35.anInt1003 = local244;
			}
		}
		@Pc(374) int local374 = local269 - Static106.anInt2477;
		if (local374 > 1024) {
			local374 -= 2048;
		}
		if (local374 < -1024) {
			local374 += 2048;
		}
		if (local374 < 0 && local295 > 0 || local374 > 0 && local295 < 0) {
			Static106.anInt2477 = local269;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
	public static int method383(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local10 += 8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return local10 + arg0;
	}
}
