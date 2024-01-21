import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!jc", name = "cc", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_50;

	@OriginalMember(owner = "client!jc", name = "ec", descriptor = "I")
	public static int anInt1340;

	@OriginalMember(owner = "client!jc", name = "kb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_641 = Static87.method1648("Too many connections from your address)3");

	@OriginalMember(owner = "client!jc", name = "Gb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_643 = aClass27_641;

	@OriginalMember(owner = "client!jc", name = "Rb", descriptor = "Lclient!ob;")
	public static Class3_Sub11_Sub1 aClass3_Sub11_Sub1_2 = new Class3_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!jc", name = "dc", descriptor = "Lclient!kd;")
	public static Class35 aClass35_1 = new Class35();

	@OriginalMember(owner = "client!jc", name = "fc", descriptor = "I")
	public static int anInt1341 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!hb;Z)Z")
	public static boolean method971(@OriginalArg(0) Class27 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static43.anInt1241; local16++) {
			if (arg0.method763(Static46.aClass27Array5[local16])) {
				return true;
			}
		}
		return arg0.method763(Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.aClass27_1150);
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
	public static void method972() {
		aClass3_Sub3_Sub2_Sub4_50 = null;
		aClass27_643 = null;
		aClass35_1 = null;
		aClass3_Sub11_Sub1_2 = null;
		aClass27_641 = null;
	}

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "(I)V")
	public static void method973() {
		for (@Pc(11) int local11 = 0; local11 < Static70.anInt1829; local11++) {
			@Pc(17) int local17 = Static82.anIntArray335[local11];
			@Pc(21) Class3_Sub3_Sub1_Sub4_Sub2 local21 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local17];
			@Pc(25) int local25 = Static47.aClass3_Sub11_Sub1_1.method1421();
			if ((local25 & 0x20) != 0) {
				local25 += Static47.aClass3_Sub11_Sub1_1.method1421() << 8;
			}
			Static73.method1346(local25, local21, local17);
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)V")
	public static void method975() {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(37) int local37;
		@Pc(41) int local41;
		if (Static34.anInt829 == 37) {
			local14 = Static47.aClass3_Sub11_Sub1_1.method1419();
			local18 = Static47.aClass3_Sub11_Sub1_1.method1441();
			local22 = Static47.aClass3_Sub11_Sub1_1.method1470();
			local30 = (local22 >> 4 & 0x7) + Static62.anInt1619;
			local37 = Static66.anInt1712 + (local22 & 0x7);
			local41 = Static47.aClass3_Sub11_Sub1_1.method1457();
			if (local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104 && Static53.anInt1423 != local14) {
				@Pc(63) Class3_Sub3_Sub1_Sub5 local63 = new Class3_Sub3_Sub1_Sub5();
				local63.anInt1505 = local41;
				local63.anInt1496 = local18;
				if (Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local30][local37] == null) {
					Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local30][local37] = new Class28();
				}
				Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local30][local37].method889(local63);
				Static33.method669(local37, local30);
			}
			return;
		}
		@Pc(151) Class3_Sub3_Sub1_Sub5 local151;
		if (Static34.anInt829 == 163) {
			local14 = Static47.aClass3_Sub11_Sub1_1.method1457();
			local18 = Static47.aClass3_Sub11_Sub1_1.method1445();
			local22 = Static62.anInt1619 + (local18 >> 4 & 0x7);
			local30 = Static66.anInt1712 + (local18 & 0x7);
			local37 = Static47.aClass3_Sub11_Sub1_1.method1441();
			if (local22 >= 0 && local30 >= 0 && local22 < 104 && local30 < 104) {
				local151 = new Class3_Sub3_Sub1_Sub5();
				local151.anInt1496 = local37;
				local151.anInt1505 = local14;
				if (Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local22][local30] == null) {
					Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local22][local30] = new Class28();
				}
				Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local22][local30].method889(local151);
				Static33.method669(local30, local22);
			}
			return;
		}
		@Pc(237) int local237;
		@Pc(245) int local245;
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(257) int local257;
		@Pc(261) int local261;
		if (Static34.anInt829 == 230) {
			local14 = Static47.aClass3_Sub11_Sub1_1.method1422();
			local22 = Static66.anInt1712 + (local14 & 0x7);
			local18 = (local14 >> 4 & 0x7) + Static62.anInt1619;
			local30 = Static47.aClass3_Sub11_Sub1_1.method1419();
			@Pc(225) byte local225 = Static47.aClass3_Sub11_Sub1_1.method1455();
			@Pc(229) byte local229 = Static47.aClass3_Sub11_Sub1_1.method1472();
			@Pc(233) byte local233 = Static47.aClass3_Sub11_Sub1_1.method1432();
			local237 = Static47.aClass3_Sub11_Sub1_1.method1422();
			local241 = local237 & 0x3;
			local245 = local237 >> 2;
			local249 = Static8.anIntArray43[local245];
			@Pc(253) byte local253 = Static47.aClass3_Sub11_Sub1_1.method1432();
			local257 = Static47.aClass3_Sub11_Sub1_1.method1451();
			local261 = Static47.aClass3_Sub11_Sub1_1.method1451();
			@Pc(265) int local265 = Static47.aClass3_Sub11_Sub1_1.method1451();
			@Pc(276) Class3_Sub3_Sub1_Sub4_Sub2 local276;
			if (Static53.anInt1423 == local265) {
				local276 = Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1;
			} else {
				local276 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local265];
			}
			if (local276 != null) {
				@Pc(286) Class3_Sub3_Sub4 local286 = Static108.method1902(local30);
				@Pc(298) int local298 = Static55.anIntArrayArrayArray4[Static68.anInt1747][local18 + 1][local22 + 1];
				@Pc(308) int local308 = Static55.anIntArrayArrayArray4[Static68.anInt1747][local18 + 1][local22];
				@Pc(318) int local318 = Static55.anIntArrayArrayArray4[Static68.anInt1747][local18][local22 + 1];
				@Pc(326) int local326 = Static55.anIntArrayArrayArray4[Static68.anInt1747][local18][local22];
				@Pc(338) Class3_Sub3_Sub1_Sub1 local338 = local286.method977(local318, local326, local308, local245, local241, local298);
				if (local338 != null) {
					Static47.method941(local257 + 1, local18, 0, 0, Static68.anInt1747, -1, local22, local261 + 1, local249);
					local276.anInt2444 = Static2.anInt38 + local257;
					local276.anInt2457 = local261 + Static2.anInt38;
					local276.aClass3_Sub3_Sub1_Sub1_3 = local338;
					@Pc(372) int local372 = local286.anInt1334;
					@Pc(377) byte local377;
					if (local233 < local253) {
						local377 = local253;
						local253 = local233;
						local233 = local377;
					}
					if (local225 < local229) {
						local377 = local229;
						local229 = local225;
						local225 = local377;
					}
					@Pc(393) int local393 = local286.anInt1309;
					if (local241 == 1 || local241 == 3) {
						local372 = local286.anInt1309;
						local393 = local286.anInt1334;
					}
					local276.anInt2451 = local372 * 64 + local18 * 128;
					local276.anInt2446 = local393 * 64 + local22 * 128;
					local276.anInt2445 = Static48.method1675(local276.anInt2446, Static68.anInt1747, local276.anInt2451);
					local276.anInt2449 = local18 + local233;
					local276.anInt2453 = local225 + local22;
					local276.anInt2440 = local253 + local18;
					local276.anInt2450 = local22 + local229;
				}
			}
		}
		@Pc(501) int local501;
		@Pc(536) int local536;
		if (Static34.anInt829 == 209) {
			local14 = Static47.aClass3_Sub11_Sub1_1.method1451();
			local18 = Static47.aClass3_Sub11_Sub1_1.method1445();
			local22 = (local18 >> 4 & 0x7) + Static62.anInt1619;
			local30 = (local18 & 0x7) + Static66.anInt1712;
			local37 = Static47.aClass3_Sub11_Sub1_1.method1422();
			local41 = local37 >> 2;
			local237 = Static8.anIntArray43[local41];
			local501 = local37 & 0x3;
			if (local22 >= 0 && local30 >= 0 && local22 < 103 && local30 < 103) {
				local245 = Static55.anIntArrayArrayArray4[Static68.anInt1747][local22][local30];
				local536 = Static55.anIntArrayArrayArray4[Static68.anInt1747][local22][local30 + 1];
				local249 = Static55.anIntArrayArrayArray4[Static68.anInt1747][local22 + 1][local30 + 1];
				local241 = Static55.anIntArrayArrayArray4[Static68.anInt1747][local22 + 1][local30];
				if (local237 == 0) {
					@Pc(566) Class43 local566 = Static76.aClass18_1.method504(Static68.anInt1747, local22, local30);
					if (local566 != null) {
						local261 = local566.anInt1814 >> 14 & 0x7FFF;
						if (local41 == 2) {
							local566.aClass3_Sub3_Sub1_4 = new Class3_Sub3_Sub1_Sub2(local261, 2, local501 + 4, local245, local241, local249, local536, local14, false);
							local566.aClass3_Sub3_Sub1_3 = new Class3_Sub3_Sub1_Sub2(local261, 2, local501 + 1 & 0x3, local245, local241, local249, local536, local14, false);
						} else {
							local566.aClass3_Sub3_Sub1_4 = new Class3_Sub3_Sub1_Sub2(local261, local41, local501, local245, local241, local249, local536, local14, false);
						}
					}
				}
				if (local237 == 1) {
					@Pc(637) Class34 local637 = Static76.aClass18_1.method541(Static68.anInt1747, local22, local30);
					if (local637 != null) {
						local637.aClass3_Sub3_Sub1_2 = new Class3_Sub3_Sub1_Sub2(local637.anInt1434 >> 14 & 0x7FFF, 4, 0, local245, local241, local249, local536, local14, false);
					}
				}
				if (local237 == 2) {
					@Pc(667) Class10 local667 = Static76.aClass18_1.method495(Static68.anInt1747, local22, local30);
					if (local41 == 11) {
						local41 = 10;
					}
					if (local667 != null) {
						local667.aClass3_Sub3_Sub1_1 = new Class3_Sub3_Sub1_Sub2(local667.anInt246 >> 14 & 0x7FFF, local41, local501, local245, local241, local249, local536, local14, false);
					}
				}
				if (local237 == 3) {
					@Pc(706) Class50 local706 = Static76.aClass18_1.method514(Static68.anInt1747, local22, local30);
					if (local706 != null) {
						local706.aClass3_Sub3_Sub1_5 = new Class3_Sub3_Sub1_Sub2(local706.anInt2184 >> 14 & 0x7FFF, 22, local501, local245, local241, local249, local536, local14, false);
					}
				}
			}
		} else if (Static34.anInt829 == 116) {
			local14 = Static47.aClass3_Sub11_Sub1_1.method1421();
			local18 = Static62.anInt1619 + (local14 >> 4 & 0x7);
			local22 = (local14 & 0x7) + Static66.anInt1712;
			local30 = Static47.aClass3_Sub11_Sub1_1.method1419();
			local37 = Static47.aClass3_Sub11_Sub1_1.method1470();
			local41 = local37 >> 2;
			local501 = local37 & 0x3;
			local237 = Static8.anIntArray43[local41];
			if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
				Static47.method941(0, local18, local41, local501, Static68.anInt1747, local30, local22, -1, local237);
			}
		} else if (Static34.anInt829 == 79) {
			local14 = Static47.aClass3_Sub11_Sub1_1.method1445();
			local18 = local14 >> 2;
			local22 = local14 & 0x3;
			local30 = Static8.anIntArray43[local18];
			local37 = Static47.aClass3_Sub11_Sub1_1.method1445();
			local41 = (local37 >> 4 & 0x7) + Static62.anInt1619;
			local501 = Static66.anInt1712 + (local37 & 0x7);
			if (local41 >= 0 && local501 >= 0 && local41 < 104 && local501 < 104) {
				Static47.method941(0, local41, local18, local22, Static68.anInt1747, -1, local501, -1, local30);
			}
		} else if (Static34.anInt829 == 33) {
			local14 = Static47.aClass3_Sub11_Sub1_1.method1421();
			local18 = (local14 >> 4 & 0x7) + Static62.anInt1619;
			local22 = (local14 & 0x7) + Static66.anInt1712;
			local30 = Static47.aClass3_Sub11_Sub1_1.method1451();
			local37 = Static47.aClass3_Sub11_Sub1_1.method1451();
			local41 = Static47.aClass3_Sub11_Sub1_1.method1451();
			if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
				@Pc(933) Class28 local933 = Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local18][local22];
				if (local933 != null) {
					for (@Pc(940) Class3_Sub3_Sub1_Sub5 local940 = (Class3_Sub3_Sub1_Sub5) local933.method884(); local940 != null; local940 = (Class3_Sub3_Sub1_Sub5) local933.method875()) {
						if (local940.anInt1496 == (local30 & 0x7FFF) && local37 == local940.anInt1505) {
							local940.anInt1505 = local41;
							break;
						}
					}
					Static33.method669(local22, local18);
				}
			}
		} else if (Static34.anInt829 == 66) {
			local14 = Static47.aClass3_Sub11_Sub1_1.method1421();
			local18 = Static62.anInt1619 + (local14 >> 4 & 0x7);
			local22 = Static66.anInt1712 + (local14 & 0x7);
			local30 = local18 + Static47.aClass3_Sub11_Sub1_1.method1432();
			local37 = Static47.aClass3_Sub11_Sub1_1.method1432() + local22;
			local41 = Static47.aClass3_Sub11_Sub1_1.method1428();
			local501 = Static47.aClass3_Sub11_Sub1_1.method1451();
			local237 = Static47.aClass3_Sub11_Sub1_1.method1421() * 4;
			local245 = Static47.aClass3_Sub11_Sub1_1.method1421() * 4;
			local241 = Static47.aClass3_Sub11_Sub1_1.method1451();
			local249 = Static47.aClass3_Sub11_Sub1_1.method1451();
			local536 = Static47.aClass3_Sub11_Sub1_1.method1421();
			local257 = Static47.aClass3_Sub11_Sub1_1.method1421();
			if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104 && local30 >= 0 && local37 >= 0 && local30 < 104 && local37 < 104 && local501 != 65535) {
				local18 = local18 * 128 + 64;
				local22 = local22 * 128 + 64;
				@Pc(1115) Class3_Sub3_Sub1_Sub3 local1115 = new Class3_Sub3_Sub1_Sub3(local501, Static68.anInt1747, local18, local22, Static48.method1675(local22, Static68.anInt1747, local18) - local237, Static2.anInt38 + local241, Static2.anInt38 + local249, local536, local257, local41, local245);
				local37 = local37 * 128 + 64;
				local30 = local30 * 128 + 64;
				local1115.method481(local37, Static2.anInt38 + local241, Static48.method1675(local37, Static68.anInt1747, local30) - local245, local30);
				Static39.aClass28_8.method889(local1115);
			}
		} else if (Static34.anInt829 == 158) {
			local14 = Static47.aClass3_Sub11_Sub1_1.method1421();
			local18 = Static62.anInt1619 + (local14 >> 4 & 0x7);
			local22 = (local14 & 0x7) + Static66.anInt1712;
			local30 = Static47.aClass3_Sub11_Sub1_1.method1451();
			local37 = Static47.aClass3_Sub11_Sub1_1.method1421();
			local41 = Static47.aClass3_Sub11_Sub1_1.method1451();
			if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
				local22 = local22 * 128 + 64;
				local18 = local18 * 128 + 64;
				@Pc(1227) Class3_Sub3_Sub1_Sub6 local1227 = new Class3_Sub3_Sub1_Sub6(local30, Static68.anInt1747, local18, local22, Static48.method1675(local22, Static68.anInt1747, local18) - local37, local41, Static2.anInt38);
				Static19.aClass28_5.method889(local1227);
			}
		} else {
			if (Static34.anInt829 == 71) {
				local14 = Static47.aClass3_Sub11_Sub1_1.method1421();
				local22 = (local14 & 0x7) + Static66.anInt1712;
				local18 = (local14 >> 4 & 0x7) + Static62.anInt1619;
				local30 = Static47.aClass3_Sub11_Sub1_1.method1451();
				local37 = Static47.aClass3_Sub11_Sub1_1.method1421();
				local501 = local37 & 0x7;
				local237 = Static47.aClass3_Sub11_Sub1_1.method1421();
				local41 = local37 >> 4 & 0xF;
				if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
					local245 = local41 + 1;
					if (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0] >= local18 - local245 && Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0] <= local18 + local245 && Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0] >= local22 - local245 && Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0] <= local22 + local245 && Static41.anInt1224 != 0 && local501 > 0 && Static37.anInt887 < 50) {
						Static36.anIntArray159[Static37.anInt887] = local30;
						Static57.anIntArray245[Static37.anInt887] = local501;
						Static12.anIntArray53[Static37.anInt887] = local237;
						Static92.aClass36Array1[Static37.anInt887] = null;
						Static8.anIntArray41[Static37.anInt887] = (local22 << 8) + ((local18 << 16) + local41);
						Static37.anInt887++;
					}
				}
			}
			if (Static34.anInt829 == 89) {
				local14 = Static47.aClass3_Sub11_Sub1_1.method1422();
				local18 = Static62.anInt1619 + (local14 >> 4 & 0x7);
				local22 = Static66.anInt1712 + (local14 & 0x7);
				local30 = Static47.aClass3_Sub11_Sub1_1.method1419();
				if (local18 >= 0 && local22 >= 0 && local18 < 104 && local22 < 104) {
					@Pc(1437) Class28 local1437 = Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local18][local22];
					if (local1437 != null) {
						for (local151 = (Class3_Sub3_Sub1_Sub5) local1437.method884(); local151 != null; local151 = (Class3_Sub3_Sub1_Sub5) local1437.method875()) {
							if ((local30 & 0x7FFF) == local151.anInt1496) {
								local151.method1883();
								break;
							}
						}
						if (local1437.method884() == null) {
							Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local18][local22] = null;
						}
						Static33.method669(local22, local18);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(I)V")
	public static void method978() {
		Static90.aClass12_71.method674();
		Static83.anIntArray353 = Static51.method1015(Static83.anIntArray353);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIII)Z")
	public static boolean method982(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static76.aClass18_1.method535(Static68.anInt1747, arg2, arg1, arg0);
		@Pc(18) int local18 = arg0 >> 14 & 0x7FFF;
		if (local12 == -1) {
			return false;
		}
		@Pc(29) int local29 = local12 >> 6 & 0x3;
		@Pc(33) int local33 = local12 & 0x1F;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(50) Class3_Sub3_Sub4 local50 = Static108.method1902(local18);
			@Pc(61) int local61;
			@Pc(64) int local64;
			if (local29 == 0 || local29 == 2) {
				local61 = local50.anInt1334;
				local64 = local50.anInt1309;
			} else {
				local64 = local50.anInt1334;
				local61 = local50.anInt1309;
			}
			@Pc(75) int local75 = local50.anInt1299;
			if (local29 != 0) {
				local75 = (local75 << local29 & 0xF) + (local75 >> 4 - local29);
			}
			Static15.method251(true, local61, 2, arg1, local64, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], arg2, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], 0, local75);
		} else {
			Static15.method251(true, 0, 2, arg1, 0, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], arg2, local33 + 1, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0], local29, 0);
		}
		Static52.anInt1416 = Static35.anInt850;
		Static61.anInt1552 = 2;
		Static94.anInt2554 = 0;
		Static30.anInt779 = anInt1341;
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(I)V")
	public static void method984() {
		Static38.method726();
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (Static42.anInt1232 == 2) {
			@Pc(13) byte[] local13 = Static101.aClass3_Sub3_Sub2_Sub4_103.aByteArray15;
			@Pc(15) int[] local15 = Static95.anIntArray314;
			local18 = local13.length;
			for (local20 = 0; local20 < local18; local20++) {
				if (local13[local20] == 0) {
					local15[local20] = 0;
				}
			}
			Static33.aClass3_Sub3_Sub2_Sub2_3.method799(0, 0, 33, 33, 25, 25, Static73.anInt1924, 256, Static91.anIntArray371, Static35.anIntArray157);
			Static82.method1556();
			return;
		}
		@Pc(61) int local61 = Static73.anInt1924 + Static46.anInt1251 & 0x7FF;
		@Pc(68) int local68 = Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 / 32 + 48;
		local18 = 464 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 / 32;
		Static3.aClass3_Sub3_Sub2_Sub2_1.method799(25, 5, 146, 151, local68, local18, local61, Static3.anInt91 + 256, Static34.anIntArray155, Static72.anIntArray319);
		for (local20 = 0; local20 < Static72.anInt1912; local20++) {
			local18 = Static4.anIntArray399[local20] * 4 + 2 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 / 32;
			local68 = Static20.anIntArray65[local20] * 4 + 2 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 / 32;
			Static2.method16(local18, Static2.aClass3_Sub3_Sub2_Sub2Array2[local20], local68);
		}
		@Pc(143) int local143;
		for (@Pc(139) int local139 = 0; local139 < 104; local139++) {
			for (local143 = 0; local143 < 104; local143++) {
				@Pc(153) Class28 local153 = Static71.aClass28ArrayArrayArray1[Static68.anInt1747][local139][local143];
				if (local153 != null) {
					local68 = local139 * 4 + 2 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 / 32;
					local18 = local143 * 4 + 2 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 / 32;
					Static2.method16(local18, Static20.aClass3_Sub3_Sub2_Sub2Array7[0], local68);
				}
			}
		}
		for (local143 = 0; local143 < Static104.anInt2724; local143++) {
			@Pc(205) Class3_Sub3_Sub1_Sub4_Sub1 local205 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[Static85.anIntArray349[local143]];
			if (local205 != null && local205.method1679()) {
				@Pc(214) Class3_Sub3_Sub3 local214 = local205.aClass3_Sub3_Sub3_1;
				if (local214.anIntArray166 != null) {
					local214 = local214.method720();
				}
				if (local214 != null && local214.aBoolean48 && local214.aBoolean49) {
					local68 = local205.anInt2408 / 32 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 / 32;
					local18 = local205.anInt2399 / 32 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 / 32;
					Static2.method16(local18, Static20.aClass3_Sub3_Sub2_Sub2Array7[1], local68);
				}
			}
		}
		@Pc(272) Class3_Sub3_Sub1_Sub4_Sub2 local272;
		for (@Pc(264) int local264 = 0; local264 < Static104.anInt2718; local264++) {
			local272 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[Static99.anIntArray387[local264]];
			if (local272 != null && local272.method1679()) {
				local18 = local272.anInt2399 / 32 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 / 32;
				local68 = local272.anInt2408 / 32 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 / 32;
				@Pc(301) boolean local301 = false;
				@Pc(306) long local306 = local272.aClass27_1150.method758();
				for (@Pc(308) int local308 = 0; local308 < Static43.anInt1241; local308++) {
					if (Static53.aLongArray8[local308] == local306 && Static22.anIntArray116[local308] != 0) {
						local301 = true;
						break;
					}
				}
				@Pc(334) boolean local334 = false;
				if (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2448 != 0 && local272.anInt2448 != 0 && Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2448 == local272.anInt2448) {
					local334 = true;
				}
				if (local301) {
					Static2.method16(local18, Static20.aClass3_Sub3_Sub2_Sub2Array7[3], local68);
				} else if (local334) {
					Static2.method16(local18, Static20.aClass3_Sub3_Sub2_Sub2Array7[4], local68);
				} else {
					Static2.method16(local18, Static20.aClass3_Sub3_Sub2_Sub2Array7[2], local68);
				}
			}
		}
		if (Static74.anInt2080 != 0 && Static2.anInt38 % 20 < 10) {
			if (Static74.anInt2080 == 1 && Static42.anInt1229 >= 0 && Static42.anInt1229 < Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2.length) {
				@Pc(420) Class3_Sub3_Sub1_Sub4_Sub1 local420 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[Static42.anInt1229];
				if (local420 != null) {
					local68 = local420.anInt2408 / 32 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 / 32;
					local18 = local420.anInt2399 / 32 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 / 32;
					Static13.method641(local18, Static1.aClass3_Sub3_Sub2_Sub2Array1[1], local68);
				}
			}
			if (Static74.anInt2080 == 2) {
				local18 = (Static38.anInt926 - Static101.anInt2631) * 4 + 2 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 / 32;
				local68 = (Static80.anInt2185 - Static89.anInt2464) * 4 + 2 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 / 32;
				Static13.method641(local18, Static1.aClass3_Sub3_Sub2_Sub2Array1[1], local68);
			}
			if (Static74.anInt2080 == 10 && Static41.anInt1222 >= 0 && Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1.length > Static41.anInt1222) {
				local272 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[Static41.anInt1222];
				if (local272 != null) {
					local18 = local272.anInt2399 / 32 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 / 32;
					local68 = local272.anInt2408 / 32 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 / 32;
					Static13.method641(local18, Static1.aClass3_Sub3_Sub2_Sub2Array1[1], local68);
				}
			}
		}
		if (Static77.anInt2150 != 0) {
			local18 = Static97.anInt2290 * 4 + 2 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 / 32;
			local68 = Static77.anInt2150 * 4 + 2 - Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 / 32;
			Static2.method16(local18, Static1.aClass3_Sub3_Sub2_Sub2Array1[0], local68);
		}
		Static95.method1322(97, 78, 3, 3, 16777215);
		Static33.aClass3_Sub3_Sub2_Sub2_3.method799(0, 0, 33, 33, 25, 25, Static73.anInt1924, 256, Static91.anIntArray371, Static35.anIntArray157);
		Static82.method1556();
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(I)V")
	public static void method985() {
		try {
			@Pc(15) Graphics local15 = Static19.aCanvas1.getGraphics();
			Static28.aClass12_22.method671(17, local15, 357);
		} catch (@Pc(23) Exception local23) {
			Static19.aCanvas1.repaint();
		}
	}
}
