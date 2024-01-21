import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	public static int anInt871;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	public static int anInt877;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	public static int anInt870 = 127;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!qf;")
	public static Class60 aClass60_331 = Static59.method1195("Weiter");

	@OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
	public static int[] anIntArray87 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public static int anInt872 = 0;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "I")
	public static int anInt874 = 0;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	public static int anInt876 = 0;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_332 = Static59.method1195("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!de", name = "p", descriptor = "I")
	public static int anInt881 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
	public static void method566(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub13 local10 = (Class3_Sub13) Static16.aClass82_1.method2305((long) arg0);
		if (local10 != null) {
			local10.method2264();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method567() {
		Static41.method938();
		if (Static49.anInt1594 == 1) {
			Static103.aClass3_Sub1_Sub2_Sub3Array7[Static11.anInt354 / 100].method1439(Static103.anInt2993 - 8 - 4, Static3.anInt127 + -4 - 8);
		}
		if (Static49.anInt1594 == 2) {
			Static103.aClass3_Sub1_Sub2_Sub3Array7[Static11.anInt354 / 100 + 4].method1439(Static103.anInt2993 - 8 - 4, Static3.anInt127 + -12);
		}
		if (Static46.anInt1446 != -1) {
			Static108.method2036(Static46.anInt1446);
			Static13.method354(4, Static46.anInt1446, 512, 334);
		}
		if (Static79.anInt2467 != -1) {
			Static108.method2036(Static79.anInt2467);
			Static13.method354(0, Static79.anInt2467, 512, 334);
		}
		Static97.method1818();
		if (!Static67.aBoolean69) {
			Static114.method2112();
			Static56.method1159();
		} else if (Static19.anInt3405 == 0) {
			Static48.method1026();
		}
		if (Static3.anInt124 == 1) {
			Static97.aClass3_Sub1_Sub2_Sub3_5.method1439(472, 296);
		}
		@Pc(137) int local137;
		if (Static2.aBoolean2) {
			@Pc(114) byte local114 = 20;
			Static20.aClass3_Sub1_Sub2_Sub2_2.method832(Static60.method1211(new Class60[] { Static53.aClass60_769, Static65.method1341(Static10.anInt331) }), 507, 20, 16776960, -1);
			local137 = local114 + 15;
			@Pc(139) Runtime local139 = Runtime.getRuntime();
			@Pc(149) int local149 = (int) ((local139.totalMemory() - local139.freeMemory()) / 1024L);
			@Pc(151) int local151 = 16776960;
			if (local149 > 32768 && Static14.aBoolean15) {
				local151 = 16711680;
			}
			if (local149 > 65536 && !Static14.aBoolean15) {
				local151 = 16711680;
			}
			Static20.aClass3_Sub1_Sub2_Sub2_2.method832(Static60.method1211(new Class60[] { Static54.aClass60_776, Static65.method1341(local149), Static26.aClass60_376 }), 507, 35, local151, -1);
			local137 += 15;
			if (Static113.aBoolean112) {
				Static20.aClass3_Sub1_Sub2_Sub2_2.method832(Static59.aClass60_821, 507, 50, 16711680, -1);
				Static113.aBoolean112 = false;
				local137 += 15;
			}
			if (Static3.aBoolean3) {
				Static20.aClass3_Sub1_Sub2_Sub2_2.method832(Static60.aClass60_822, 507, local137, 16711680, -1);
				Static3.aBoolean3 = false;
				local137 += 15;
			}
			if (Static104.aBoolean104) {
				Static20.aClass3_Sub1_Sub2_Sub2_2.method832(Static86.aClass60_721, 507, local137, 16711680, -1);
				local137 += 15;
				Static104.aBoolean104 = false;
			}
		}
		if (Static11.anInt345 == 0) {
			return;
		}
		@Pc(242) int local242 = Static11.anInt345 / 50;
		local137 = local242 / 60;
		@Pc(250) int local250 = local242 % 60;
		if (local250 >= 10) {
			Static20.aClass3_Sub1_Sub2_Sub2_2.method847(Static60.method1211(new Class60[] { Static73.aClass60_994, Static65.method1341(local137), Static29.aClass60_389, Static65.method1341(local250) }), 4, 329, 16776960, -1);
		} else {
			Static20.aClass3_Sub1_Sub2_Sub2_2.method847(Static60.method1211(new Class60[] { Static73.aClass60_994, Static65.method1341(local137), Static129.aClass60_1439, Static65.method1341(local250) }), 4, 329, 16776960, -1);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)Lclient!kc;")
	public static Class3_Sub1_Sub11 method568(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub11 local6 = (Class3_Sub1_Sub11) Static77.aClass17_39.method643((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static35.aClass25_6.method931(arg0, 10);
		local6 = new Class3_Sub1_Sub11();
		local6.anInt1844 = arg0;
		if (local20 != null) {
			local6.method1190(new Class3_Sub12(local20));
		}
		local6.method1199();
		if (local6.anInt1848 != -1) {
			local6.method1187(method568(local6.anInt1848), method568(local6.anInt1845));
		}
		if (!Static60.aBoolean58 && local6.aBoolean57) {
			local6.aClass60Array9 = null;
			local6.aClass60_816 = Static36.aClass60_479;
			local6.aClass60Array8 = null;
			local6.anInt1853 = 0;
		}
		Static77.aClass17_39.method644((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public static void method569() {
		anIntArray87 = null;
		aClass60_332 = null;
		aClass60_331 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!mf;)Z")
	public static boolean method570(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(6) int local6 = arg0.anInt2293;
		if (Static51.anInt1366 == 2) {
			if (local6 == 201) {
				Static120.aClass60_1379 = Static120.aClass60_1369;
				Static103.anInt2994 = 0;
				Static120.aClass60_1372 = Static126.aClass60_1419;
				Static71.aBoolean49 = true;
				Static65.anInt2069 = 1;
				Static56.aBoolean56 = true;
			}
			if (local6 == 202) {
				Static71.aBoolean49 = true;
				Static120.aClass60_1372 = Static8.aClass60_129;
				Static103.anInt2994 = 0;
				Static65.anInt2069 = 2;
				Static120.aClass60_1379 = Static120.aClass60_1369;
				Static56.aBoolean56 = true;
			}
		}
		if (local6 == 205) {
			Static32.anInt1114 = 250;
			return true;
		}
		if (local6 == 501) {
			Static56.aBoolean56 = true;
			Static65.anInt2069 = 4;
			Static103.anInt2994 = 0;
			Static120.aClass60_1372 = Static2.aClass60_65;
			Static120.aClass60_1379 = Static120.aClass60_1369;
			Static71.aBoolean49 = true;
		}
		if (local6 == 502) {
			Static56.aBoolean56 = true;
			Static71.aBoolean49 = true;
			Static120.aClass60_1379 = Static120.aClass60_1369;
			Static120.aClass60_1372 = Static109.aClass60_1304;
			Static65.anInt2069 = 5;
			Static103.anInt2994 = 0;
		}
		@Pc(99) int local99;
		@Pc(103) int local103;
		if (local6 >= 300 && local6 <= 313) {
			local99 = (local6 - 300) / 2;
			local103 = local6 & 0x1;
			Static65.aClass50_2.method1631(local103 == 1, local99);
		}
		if (local6 >= 314 && local6 <= 323) {
			local99 = (local6 - 314) / 2;
			local103 = local6 & 0x1;
			Static65.aClass50_2.method1633(local99, local103 == 1);
		}
		if (local6 == 324) {
			Static65.aClass50_2.method1634(false);
		}
		if (local6 == 325) {
			Static65.aClass50_2.method1634(true);
		}
		if (local6 == 326) {
			Static81.aClass3_Sub12_Sub1_2.method1980(168);
			Static65.aClass50_2.method1632(Static81.aClass3_Sub12_Sub1_2);
			return true;
		}
		if (local6 == 620) {
			Static3.aBoolean4 = !Static3.aBoolean4;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static76.method1561();
			if (Static120.aClass60_1373.method1836() > 0) {
				Static81.aClass3_Sub12_Sub1_2.method1980(84);
				Static81.aClass3_Sub12_Sub1_2.method1972(Static120.aClass60_1373.method1863());
				Static81.aClass3_Sub12_Sub1_2.method1937(local6 - 601);
				Static81.aClass3_Sub12_Sub1_2.method1937(Static3.aBoolean4 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	public static void method571() {
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(45) int local45;
		@Pc(53) int local53;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (Static21.anInt867 == 227) {
			@Pc(13) byte local13 = Static79.aClass3_Sub12_Sub1_1.method1954();
			@Pc(17) byte local17 = Static79.aClass3_Sub12_Sub1_1.method1921();
			local21 = Static79.aClass3_Sub12_Sub1_1.method1953();
			local25 = Static79.aClass3_Sub12_Sub1_1.method1925();
			local29 = local25 >> 2;
			local33 = local25 & 0x3;
			local37 = Static83.anIntArray267[local29];
			@Pc(41) byte local41 = Static79.aClass3_Sub12_Sub1_1.method1921();
			local45 = Static79.aClass3_Sub12_Sub1_1.method1962();
			local53 = (local45 >> 4 & 0x7) + Static14.anInt430;
			local59 = (local45 & 0x7) + Static102.anInt2967;
			local63 = Static79.aClass3_Sub12_Sub1_1.method1963();
			local67 = Static79.aClass3_Sub12_Sub1_1.method1953();
			local71 = Static79.aClass3_Sub12_Sub1_1.method1940();
			@Pc(75) byte local75 = Static79.aClass3_Sub12_Sub1_1.method1958();
			@Pc(82) Class3_Sub1_Sub1_Sub3_Sub1 local82;
			if (local71 == Static34.anInt1184) {
				local82 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1;
			} else {
				local82 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local71];
			}
			if (local82 != null) {
				@Pc(92) Class3_Sub1_Sub17 local92 = Static18.method517(local67);
				@Pc(100) int local100 = Static51.anIntArrayArrayArray3[Static119.anInt3243][local53][local59];
				@Pc(110) int local110 = Static51.anIntArrayArrayArray3[Static119.anInt3243][local53 + 1][local59];
				@Pc(122) int local122 = Static51.anIntArrayArrayArray3[Static119.anInt3243][local53 + 1][local59 + 1];
				@Pc(132) int local132 = Static51.anIntArrayArrayArray3[Static119.anInt3243][local53][local59 + 1];
				@Pc(142) Class3_Sub1_Sub1_Sub4 local142 = local92.method2280(local122, local33, local100, local132, local29, local110);
				if (local142 != null) {
					Static101.method1990(0, local21 + 1, local63 + 1, -1, local37, local59, Static119.anInt3243, local53, 0);
					local82.aClass3_Sub1_Sub1_Sub4_1 = local142;
					@Pc(171) byte local171;
					if (local13 < local41) {
						local171 = local41;
						local41 = local13;
						local13 = local171;
					}
					@Pc(178) int local178 = local92.anInt3449;
					local82.anInt626 = local63 + Static34.anInt1183;
					if (local17 > local75) {
						local171 = local17;
						local17 = local75;
						local75 = local171;
					}
					local82.anInt624 = Static34.anInt1183 + local21;
					@Pc(205) int local205 = local92.anInt3441;
					if (local33 == 1 || local33 == 3) {
						local205 = local92.anInt3449;
						local178 = local92.anInt3441;
					}
					local82.anInt632 = local53 * 128 + local178 * 64;
					local82.anInt625 = local59 * 128 + local205 * 64;
					local82.anInt629 = Static66.method1353(local82.anInt632, Static119.anInt3243, local82.anInt625);
					local82.anInt630 = local41 + local53;
					local82.anInt621 = local75 + local59;
					local82.anInt638 = local13 + local53;
					local82.anInt642 = local59 + local17;
				}
			}
		}
		@Pc(281) int local281;
		@Pc(290) int local290;
		@Pc(333) Class3_Sub1_Sub1_Sub1 local333;
		if (Static21.anInt867 == 48) {
			local281 = Static79.aClass3_Sub12_Sub1_1.method1936();
			local290 = Static14.anInt430 + (local281 >> 4 & 0x7);
			local21 = (local281 & 0x7) + Static102.anInt2967;
			local25 = Static79.aClass3_Sub12_Sub1_1.method1953();
			if (local290 >= 0 && local21 >= 0 && local290 < 104 && local21 < 104) {
				@Pc(326) Class5 local326 = Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local290][local21];
				if (local326 != null) {
					for (local333 = (Class3_Sub1_Sub1_Sub1) local326.method92(); local333 != null; local333 = (Class3_Sub1_Sub1_Sub1) local326.method90()) {
						if ((local25 & 0x7FFF) == local333.anInt122) {
							local333.method2264();
							break;
						}
					}
					if (local326.method92() == null) {
						Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local290][local21] = null;
					}
					Static54.method1139(local21, local290);
				}
			}
		} else if (Static21.anInt867 == 119) {
			local281 = Static79.aClass3_Sub12_Sub1_1.method1936();
			local21 = Static102.anInt2967 + (local281 & 0x7);
			local290 = (local281 >> 4 & 0x7) + Static14.anInt430;
			local25 = Static79.aClass3_Sub12_Sub1_1.method1963();
			local29 = Static79.aClass3_Sub12_Sub1_1.method1936();
			local33 = Static79.aClass3_Sub12_Sub1_1.method1963();
			if (local290 >= 0 && local21 >= 0 && local290 < 104 && local21 < 104) {
				local21 = local21 * 128 + 64;
				local290 = local290 * 128 + 64;
				@Pc(448) Class3_Sub1_Sub1_Sub5 local448 = new Class3_Sub1_Sub1_Sub5(local25, Static119.anInt3243, local290, local21, Static66.method1353(local290, Static119.anInt3243, local21) - local29, local33, Static34.anInt1183);
				Static108.aClass5_20.method87(local448);
			}
		} else {
			@Pc(500) int local500;
			if (Static21.anInt867 == 39) {
				local281 = Static79.aClass3_Sub12_Sub1_1.method1936();
				local21 = (local281 & 0x7) + Static102.anInt2967;
				local290 = Static14.anInt430 + (local281 >> 4 & 0x7);
				local25 = Static79.aClass3_Sub12_Sub1_1.method1958() + local290;
				local29 = Static79.aClass3_Sub12_Sub1_1.method1958() + local21;
				local33 = Static79.aClass3_Sub12_Sub1_1.method1969();
				local37 = Static79.aClass3_Sub12_Sub1_1.method1963();
				local500 = Static79.aClass3_Sub12_Sub1_1.method1936() * 4;
				local45 = Static79.aClass3_Sub12_Sub1_1.method1936() * 4;
				local53 = Static79.aClass3_Sub12_Sub1_1.method1963();
				local59 = Static79.aClass3_Sub12_Sub1_1.method1963();
				local63 = Static79.aClass3_Sub12_Sub1_1.method1936();
				local67 = Static79.aClass3_Sub12_Sub1_1.method1936();
				if (local290 >= 0 && local21 >= 0 && local290 < 104 && local21 < 104 && local25 >= 0 && local29 >= 0 && local25 < 104 && local29 < 104 && local37 != 65535) {
					local21 = local21 * 128 + 64;
					local29 = local29 * 128 + 64;
					local25 = local25 * 128 + 64;
					local290 = local290 * 128 + 64;
					@Pc(608) Class3_Sub1_Sub1_Sub6 local608 = new Class3_Sub1_Sub1_Sub6(local37, Static119.anInt3243, local290, local21, Static66.method1353(local290, Static119.anInt3243, local21) - local500, local53 + Static34.anInt1183, local59 + Static34.anInt1183, local63, local67, local33, local45);
					local608.method1523(Static66.method1353(local25, Static119.anInt3243, local29) - local45, local29, local53 + Static34.anInt1183, local25);
					Static112.aClass5_21.method87(local608);
				}
			} else if (Static21.anInt867 == 111) {
				local281 = Static79.aClass3_Sub12_Sub1_1.method1955();
				local290 = Static79.aClass3_Sub12_Sub1_1.method1940();
				local21 = Static79.aClass3_Sub12_Sub1_1.method1953();
				local25 = Static79.aClass3_Sub12_Sub1_1.method1925();
				local29 = (local25 >> 4 & 0x7) + Static14.anInt430;
				local33 = (local25 & 0x7) + Static102.anInt2967;
				if (local29 >= 0 && local33 >= 0 && local29 < 104 && local33 < 104 && local290 != Static34.anInt1184) {
					@Pc(685) Class3_Sub1_Sub1_Sub1 local685 = new Class3_Sub1_Sub1_Sub1();
					local685.anInt122 = local281;
					local685.anInt123 = local21;
					if (Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local29][local33] == null) {
						Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local29][local33] = new Class5();
					}
					Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local29][local33].method87(local685);
					Static54.method1139(local33, local29);
				}
			} else {
				if (Static21.anInt867 == 87) {
					local281 = Static79.aClass3_Sub12_Sub1_1.method1936();
					local290 = Static14.anInt430 + (local281 >> 4 & 0x7);
					local21 = (local281 & 0x7) + Static102.anInt2967;
					local25 = Static79.aClass3_Sub12_Sub1_1.method1963();
					local29 = Static79.aClass3_Sub12_Sub1_1.method1936();
					local33 = local29 >> 4 & 0xF;
					local500 = Static79.aClass3_Sub12_Sub1_1.method1936();
					local37 = local29 & 0x7;
					if (local290 >= 0 && local21 >= 0 && local290 < 104 && local21 < 104) {
						local45 = local33 + 1;
						if (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0] >= local290 - local45 && Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0] <= local45 + local290 && local21 - local45 <= Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0] && local45 + local21 >= Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0] && anInt870 != 0 && local37 > 0 && Static58.anInt1802 < 50) {
							Static32.anIntArray135[Static58.anInt1802] = local25;
							Static128.anIntArray389[Static58.anInt1802] = local37;
							Static78.anIntArray241[Static58.anInt1802] = local500;
							Static96.aClass63Array1[Static58.anInt1802] = null;
							Static103.anIntArray311[Static58.anInt1802] = local33 + (local290 << 16) + (local21 << 8);
							Static58.anInt1802++;
						}
					}
				}
				if (Static21.anInt867 == 209) {
					local281 = Static79.aClass3_Sub12_Sub1_1.method1963();
					local290 = Static79.aClass3_Sub12_Sub1_1.method1936();
					local21 = Static14.anInt430 + (local290 >> 4 & 0x7);
					local25 = Static102.anInt2967 + (local290 & 0x7);
					local29 = Static79.aClass3_Sub12_Sub1_1.method1962();
					local33 = local29 >> 2;
					local37 = local29 & 0x3;
					local500 = Static83.anIntArray267[local33];
					if (local21 >= 0 && local25 >= 0 && local21 < 103 && local25 < 103) {
						local53 = Static51.anIntArrayArrayArray3[Static119.anInt3243][local21 + 1][local25];
						local45 = Static51.anIntArrayArrayArray3[Static119.anInt3243][local21][local25];
						local59 = Static51.anIntArrayArrayArray3[Static119.anInt3243][local21 + 1][local25 + 1];
						local63 = Static51.anIntArrayArrayArray3[Static119.anInt3243][local21][local25 + 1];
						if (local500 == 0) {
							@Pc(976) Class68 local976 = Static13.aClass58_1.method1778(Static119.anInt3243, local21, local25);
							if (local976 != null) {
								local71 = local976.anInt3048 >> 14 & 0x7FFF;
								if (local33 == 2) {
									local976.aClass3_Sub1_Sub1_8 = new Class3_Sub1_Sub1_Sub2(local71, 2, local37 + 4, local45, local53, local59, local63, local281, false, local976.aClass3_Sub1_Sub1_8);
									local976.aClass3_Sub1_Sub1_7 = new Class3_Sub1_Sub1_Sub2(local71, 2, local37 + 1 & 0x3, local45, local53, local59, local63, local281, false, local976.aClass3_Sub1_Sub1_7);
								} else {
									local976.aClass3_Sub1_Sub1_8 = new Class3_Sub1_Sub1_Sub2(local71, local33, local37, local45, local53, local59, local63, local281, false, local976.aClass3_Sub1_Sub1_8);
								}
							}
						}
						if (local500 == 1) {
							@Pc(1056) Class24 local1056 = Static13.aClass58_1.method1752(Static119.anInt3243, local21, local25);
							if (local1056 != null) {
								local1056.aClass3_Sub1_Sub1_1 = new Class3_Sub1_Sub1_Sub2(local1056.anInt1302 >> 14 & 0x7FFF, 4, 0, local45, local53, local59, local63, local281, false, local1056.aClass3_Sub1_Sub1_1);
							}
						}
						if (local500 == 2) {
							@Pc(1088) Class64 local1088 = Static13.aClass58_1.method1758(Static119.anInt3243, local21, local25);
							if (local33 == 11) {
								local33 = 10;
							}
							if (local1088 != null) {
								local1088.aClass3_Sub1_Sub1_6 = new Class3_Sub1_Sub1_Sub2(local1088.anInt3019 >> 14 & 0x7FFF, local33, local37, local45, local53, local59, local63, local281, false, local1088.aClass3_Sub1_Sub1_6);
							}
						}
						if (local500 == 3) {
							@Pc(1127) Class52 local1127 = Static13.aClass58_1.method1753(Static119.anInt3243, local21, local25);
							if (local1127 != null) {
								local1127.aClass3_Sub1_Sub1_2 = new Class3_Sub1_Sub1_Sub2(local1127.anInt2572 >> 14 & 0x7FFF, 22, local37, local45, local53, local59, local63, local281, false, local1127.aClass3_Sub1_Sub1_2);
							}
						}
					}
				} else if (Static21.anInt867 == 236) {
					local281 = Static79.aClass3_Sub12_Sub1_1.method1953();
					local290 = Static79.aClass3_Sub12_Sub1_1.method1917();
					local21 = Static14.anInt430 + (local290 >> 4 & 0x7);
					local25 = Static102.anInt2967 + (local290 & 0x7);
					local29 = Static79.aClass3_Sub12_Sub1_1.method1962();
					local33 = local29 >> 2;
					local37 = local29 & 0x3;
					local500 = Static83.anIntArray267[local33];
					if (local21 >= 0 && local25 >= 0 && local21 < 104 && local25 < 104) {
						Static101.method1990(local33, 0, -1, local281, local500, local25, Static119.anInt3243, local21, local37);
					}
				} else if (Static21.anInt867 == 64) {
					local281 = Static79.aClass3_Sub12_Sub1_1.method1917();
					local290 = local281 >> 2;
					local21 = local281 & 0x3;
					local25 = Static83.anIntArray267[local290];
					local29 = Static79.aClass3_Sub12_Sub1_1.method1936();
					local33 = Static14.anInt430 + (local29 >> 4 & 0x7);
					local37 = (local29 & 0x7) + Static102.anInt2967;
					if (local33 >= 0 && local37 >= 0 && local33 < 104 && local37 < 104) {
						Static101.method1990(local290, 0, -1, -1, local25, local37, Static119.anInt3243, local33, local21);
					}
				} else if (Static21.anInt867 == 33) {
					local281 = Static79.aClass3_Sub12_Sub1_1.method1953();
					local290 = Static79.aClass3_Sub12_Sub1_1.method1953();
					local21 = Static79.aClass3_Sub12_Sub1_1.method1936();
					local29 = Static102.anInt2967 + (local21 & 0x7);
					local25 = (local21 >> 4 & 0x7) + Static14.anInt430;
					if (local25 >= 0 && local29 >= 0 && local25 < 104 && local29 < 104) {
						local333 = new Class3_Sub1_Sub1_Sub1();
						local333.anInt122 = local290;
						local333.anInt123 = local281;
						if (Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local25][local29] == null) {
							Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local25][local29] = new Class5();
						}
						Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local25][local29].method87(local333);
						Static54.method1139(local29, local25);
					}
				} else if (Static21.anInt867 == 241) {
					local281 = Static79.aClass3_Sub12_Sub1_1.method1936();
					local290 = Static14.anInt430 + (local281 >> 4 & 0x7);
					local21 = (local281 & 0x7) + Static102.anInt2967;
					local25 = Static79.aClass3_Sub12_Sub1_1.method1963();
					local29 = Static79.aClass3_Sub12_Sub1_1.method1963();
					local33 = Static79.aClass3_Sub12_Sub1_1.method1963();
					if (local290 >= 0 && local21 >= 0 && local290 < 104 && local21 < 104) {
						@Pc(1440) Class5 local1440 = Static34.aClass5ArrayArrayArray1[Static119.anInt3243][local290][local21];
						if (local1440 != null) {
							for (@Pc(1447) Class3_Sub1_Sub1_Sub1 local1447 = (Class3_Sub1_Sub1_Sub1) local1440.method92(); local1447 != null; local1447 = (Class3_Sub1_Sub1_Sub1) local1440.method90()) {
								if ((local25 & 0x7FFF) == local1447.anInt122 && local29 == local1447.anInt123) {
									local1447.anInt123 = local33;
									break;
								}
							}
							Static54.method1139(local21, local290);
						}
					}
				}
			}
		}
	}
}
