import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
	public static int anInt1699;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "[I")
	public static int[] anIntArray210;

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
	public static int anInt1703;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_839 = Static38.method736("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public static int anInt1697 = 0;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!vc;")
	public static Class71 aClass71_840 = Static38.method736("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	public static int anInt1698 = 0;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
	public static int anInt1701 = -1;

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "Lclient!vc;")
	private static Class71 aClass71_843 = Static38.method736(" more options");

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!vc;")
	public static Class71 aClass71_841 = aClass71_843;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Lclient!vc;")
	public static Class71 aClass71_842 = Static38.method736("@gr1@");

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
	public static int anInt1704 = 1;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "I")
	public static final int anInt1705 = 50;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!nb;Lclient!nb;)V")
	public static void method1161(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class24 arg1) {
		Static28.aClass24_8 = arg0;
		Static28.aClass24_9 = arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
	public static int method1162(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public static void method1163() {
		aClass71_841 = null;
		aClass71_842 = null;
		anIntArray209 = null;
		aClass71_843 = null;
		aClass71_840 = null;
		anIntArray210 = null;
		aClass71_839 = null;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public static void method1164() {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(28) int local28;
		@Pc(35) int local35;
		@Pc(20) int local20;
		@Pc(54) Class5_Sub1_Sub1_Sub5 local54;
		if (Static8.anInt283 == 132) {
			local12 = Static86.aClass5_Sub11_Sub1_12.method1539();
			local16 = Static86.aClass5_Sub11_Sub1_12.method1539();
			local20 = Static86.aClass5_Sub11_Sub1_12.method1502();
			local28 = Static100.anInt2361 + (local20 >> 4 & 0x7);
			local35 = Static93.anInt2254 + (local20 & 0x7);
			if (local28 >= 0 && local35 >= 0 && local28 < 104 && local35 < 104) {
				local54 = new Class5_Sub1_Sub1_Sub5();
				local54.anInt1915 = local16;
				local54.anInt1918 = local12;
				if (Static34.aClass52ArrayArrayArray1[Static23.anInt728][local28][local35] == null) {
					Static34.aClass52ArrayArrayArray1[Static23.anInt728][local28][local35] = new Class52();
				}
				Static34.aClass52ArrayArrayArray1[Static23.anInt728][local28][local35].method1362(local54);
				Static112.method1748(local35, local28);
			}
			return;
		}
		@Pc(135) int local135;
		@Pc(139) int local139;
		@Pc(143) int local143;
		if (Static8.anInt283 == 124) {
			local12 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local16 = Static100.anInt2361 + (local12 >> 4 & 0x7);
			local20 = Static93.anInt2254 + (local12 & 0x7);
			local28 = Static86.aClass5_Sub11_Sub1_12.method1529();
			local35 = Static86.aClass5_Sub11_Sub1_12.method1502();
			local135 = local35 >> 2;
			local139 = local35 & 0x3;
			local143 = Static88.anIntArray254[local135];
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				Static82.method1347(local135, local16, local139, local143, local20, -1, local28, Static23.anInt728, 0);
			}
			return;
		}
		@Pc(223) int local223;
		@Pc(227) int local227;
		@Pc(239) int local239;
		@Pc(231) int local231;
		if (Static8.anInt283 == 98) {
			local12 = Static86.aClass5_Sub11_Sub1_12.method1549();
			local16 = Static86.aClass5_Sub11_Sub1_12.method1529();
			@Pc(189) byte local189 = Static86.aClass5_Sub11_Sub1_12.method1512();
			local28 = Static86.aClass5_Sub11_Sub1_12.method1549();
			local35 = Static86.aClass5_Sub11_Sub1_12.method1539();
			local135 = Static86.aClass5_Sub11_Sub1_12.method1533();
			local139 = (local135 >> 4 & 0x7) + Static100.anInt2361;
			local143 = (local135 & 0x7) + Static93.anInt2254;
			@Pc(219) byte local219 = Static86.aClass5_Sub11_Sub1_12.method1520();
			local223 = Static86.aClass5_Sub11_Sub1_12.method1516();
			local227 = local223 >> 2;
			local231 = Static88.anIntArray254[local227];
			@Pc(235) byte local235 = Static86.aClass5_Sub11_Sub1_12.method1524();
			local239 = local223 & 0x3;
			@Pc(243) byte local243 = Static86.aClass5_Sub11_Sub1_12.method1521();
			@Pc(250) Class5_Sub1_Sub1_Sub3_Sub2 local250;
			if (Static6.anInt222 == local16) {
				local250 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1;
			} else {
				local250 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local16];
			}
			if (local250 != null) {
				@Pc(260) Class5_Sub1_Sub15 local260 = Static97.method1606(local12);
				@Pc(272) int local272 = Static51.anIntArrayArrayArray3[Static23.anInt728][local139 + 1][local143 + 1];
				@Pc(280) int local280 = Static51.anIntArrayArrayArray3[Static23.anInt728][local139][local143];
				@Pc(290) int local290 = Static51.anIntArrayArrayArray3[Static23.anInt728][local139 + 1][local143];
				@Pc(300) int local300 = Static51.anIntArrayArrayArray3[Static23.anInt728][local139][local143 + 1];
				@Pc(310) Class5_Sub1_Sub1_Sub2 local310 = local260.method1710(local227, local280, local300, local290, local239, local272);
				if (local310 != null) {
					Static82.method1347(0, local139, 0, local231, local143, local28 + 1, -1, Static23.anInt728, local35 + 1);
					local250.anInt2497 = Static95.anInt2285 + local35;
					@Pc(335) int local335 = local260.anInt2559;
					@Pc(344) byte local344;
					if (local243 > local189) {
						local344 = local243;
						local243 = local189;
						local189 = local344;
					}
					@Pc(351) int local351 = local260.anInt2572;
					local250.aClass5_Sub1_Sub1_Sub2_3 = local310;
					if (local219 > local235) {
						local344 = local219;
						local219 = local235;
						local235 = local344;
					}
					if (local239 == 1 || local239 == 3) {
						local335 = local260.anInt2572;
						local351 = local260.anInt2559;
					}
					local250.anInt2502 = local351 * 64 + local143 * 128;
					local250.anInt2516 = Static95.anInt2285 + local28;
					local250.anInt2515 = local335 * 64 + local139 * 128;
					local250.anInt2511 = Static26.method989(local250.anInt2515, Static23.anInt728, local250.anInt2502);
					local250.anInt2499 = local143 + local235;
					local250.anInt2501 = local243 + local139;
					local250.anInt2519 = local143 + local219;
					local250.anInt2512 = local189 + local139;
				}
			}
		}
		if (Static8.anInt283 == 196) {
			local12 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local16 = Static100.anInt2361 + (local12 >> 4 & 0x7);
			local20 = Static93.anInt2254 + (local12 & 0x7);
			local28 = Static86.aClass5_Sub11_Sub1_12.method1529();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				@Pc(481) Class52 local481 = Static34.aClass52ArrayArrayArray1[Static23.anInt728][local16][local20];
				if (local481 != null) {
					for (local54 = (Class5_Sub1_Sub1_Sub5) local481.method1358(); local54 != null; local54 = (Class5_Sub1_Sub1_Sub5) local481.method1363()) {
						if (local54.anInt1918 == (local28 & 0x7FFF)) {
							local54.method2002();
							break;
						}
					}
					if (local481.method1358() == null) {
						Static34.aClass52ArrayArrayArray1[Static23.anInt728][local16][local20] = null;
					}
					Static112.method1748(local20, local16);
				}
			}
			return;
		}
		@Pc(593) int local593;
		if (Static8.anInt283 == 55) {
			local12 = Static86.aClass5_Sub11_Sub1_12.method1533();
			local20 = local12 & 0x3;
			local16 = local12 >> 2;
			local28 = Static88.anIntArray254[local16];
			local35 = Static86.aClass5_Sub11_Sub1_12.method1549();
			local135 = Static86.aClass5_Sub11_Sub1_12.method1502();
			local139 = Static100.anInt2361 + (local135 >> 4 & 0x7);
			local143 = Static93.anInt2254 + (local135 & 0x7);
			if (local139 >= 0 && local143 >= 0 && local139 < 103 && local143 < 103) {
				local593 = Static51.anIntArrayArrayArray3[Static23.anInt728][local139][local143];
				local223 = Static51.anIntArrayArrayArray3[Static23.anInt728][local139 + 1][local143];
				local227 = Static51.anIntArrayArrayArray3[Static23.anInt728][local139 + 1][local143 + 1];
				local239 = Static51.anIntArrayArrayArray3[Static23.anInt728][local139][local143 + 1];
				if (local28 == 0) {
					@Pc(636) Class22 local636 = Static7.aClass43_1.method1091(Static23.anInt728, local139, local143);
					if (local636 != null) {
						@Pc(645) int local645 = local636.anInt783 >> 14 & 0x7FFF;
						if (local16 == 2) {
							local636.aClass5_Sub1_Sub1_5 = new Class5_Sub1_Sub1_Sub1(local645, 2, local20 + 4, local593, local223, local227, local239, local35, false, local636.aClass5_Sub1_Sub1_5);
							local636.aClass5_Sub1_Sub1_4 = new Class5_Sub1_Sub1_Sub1(local645, 2, local20 + 1 & 0x3, local593, local223, local227, local239, local35, false, local636.aClass5_Sub1_Sub1_4);
						} else {
							local636.aClass5_Sub1_Sub1_5 = new Class5_Sub1_Sub1_Sub1(local645, local16, local20, local593, local223, local227, local239, local35, false, local636.aClass5_Sub1_Sub1_5);
						}
					}
				}
				if (local28 == 1) {
					@Pc(713) Class28 local713 = Static7.aClass43_1.method1089(Static23.anInt728, local139, local143);
					if (local713 != null) {
						local713.aClass5_Sub1_Sub1_6 = new Class5_Sub1_Sub1_Sub1(local713.anInt1078 >> 14 & 0x7FFF, 4, 0, local593, local223, local227, local239, local35, false, local713.aClass5_Sub1_Sub1_6);
					}
				}
				if (local28 == 2) {
					if (local16 == 11) {
						local16 = 10;
					}
					@Pc(750) Class69 local750 = Static7.aClass43_1.method1065(Static23.anInt728, local139, local143);
					if (local750 != null) {
						local750.aClass5_Sub1_Sub1_8 = new Class5_Sub1_Sub1_Sub1(local750.anInt2665 >> 14 & 0x7FFF, local16, local20, local593, local223, local227, local239, local35, false, local750.aClass5_Sub1_Sub1_8);
					}
				}
				if (local28 == 3) {
					@Pc(782) Class41 local782 = Static7.aClass43_1.method1103(Static23.anInt728, local139, local143);
					if (local782 != null) {
						local782.aClass5_Sub1_Sub1_7 = new Class5_Sub1_Sub1_Sub1(local782.anInt1541 >> 14 & 0x7FFF, 22, local20, local593, local223, local227, local239, local35, false, local782.aClass5_Sub1_Sub1_7);
					}
				}
			}
			return;
		}
		if (Static8.anInt283 == 69) {
			local12 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local16 = (local12 >> 4 & 0x7) + Static100.anInt2361;
			local20 = (local12 & 0x7) + Static93.anInt2254;
			local28 = Static86.aClass5_Sub11_Sub1_12.method1543();
			local35 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local139 = local35 & 0x7;
			local143 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local135 = local35 >> 4 & 0xF;
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				local593 = local135 + 1;
				if (local16 - local593 <= Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0] && Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0] <= local593 + local16 && Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0] >= local20 - local593 && local593 + local20 >= Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0] && Static36.anInt991 != 0 && local139 > 0 && Static57.anInt1480 < 50) {
					Static30.anIntArray100[Static57.anInt1480] = local28;
					Static107.anIntArray270[Static57.anInt1480] = local139;
					Static32.anIntArray105[Static57.anInt1480] = local143;
					Static86.aClass50Array10[Static57.anInt1480] = null;
					Static70.anIntArray215[Static57.anInt1480] = (local16 << 16) - (-(local20 << 8) - local135);
					Static57.anInt1480++;
				}
			}
		}
		if (Static8.anInt283 == 225) {
			local12 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local16 = (local12 >> 4 & 0x7) + Static100.anInt2361;
			local20 = (local12 & 0x7) + Static93.anInt2254;
			local28 = Static86.aClass5_Sub11_Sub1_12.method1543();
			local35 = Static86.aClass5_Sub11_Sub1_12.method1543();
			local135 = Static86.aClass5_Sub11_Sub1_12.method1543();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				@Pc(1031) Class52 local1031 = Static34.aClass52ArrayArrayArray1[Static23.anInt728][local16][local20];
				if (local1031 != null) {
					for (@Pc(1038) Class5_Sub1_Sub1_Sub5 local1038 = (Class5_Sub1_Sub1_Sub5) local1031.method1358(); local1038 != null; local1038 = (Class5_Sub1_Sub1_Sub5) local1031.method1363()) {
						if (local1038.anInt1918 == (local28 & 0x7FFF) && local1038.anInt1915 == local35) {
							local1038.anInt1915 = local135;
							break;
						}
					}
					Static112.method1748(local20, local16);
				}
			}
		} else if (Static8.anInt283 == 227) {
			local12 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local16 = (local12 >> 4 & 0x7) + Static100.anInt2361;
			local20 = Static93.anInt2254 + (local12 & 0x7);
			local28 = Static86.aClass5_Sub11_Sub1_12.method1543();
			local35 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local135 = Static86.aClass5_Sub11_Sub1_12.method1543();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				local20 = local20 * 128 + 64;
				local16 = local16 * 128 + 64;
				@Pc(1158) Class5_Sub1_Sub1_Sub6 local1158 = new Class5_Sub1_Sub1_Sub6(local28, Static23.anInt728, local16, local20, Static26.method989(local16, Static23.anInt728, local20) - local35, local135, Static95.anInt2285);
				Static109.aClass52_12.method1362(local1158);
			}
		} else if (Static8.anInt283 == 12) {
			local12 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local20 = Static93.anInt2254 + (local12 & 0x7);
			local16 = Static100.anInt2361 + (local12 >> 4 & 0x7);
			local28 = Static86.aClass5_Sub11_Sub1_12.method1524() + local16;
			local35 = Static86.aClass5_Sub11_Sub1_12.method1524() + local20;
			local135 = Static86.aClass5_Sub11_Sub1_12.method1544();
			local139 = Static86.aClass5_Sub11_Sub1_12.method1543();
			local143 = Static86.aClass5_Sub11_Sub1_12.method1546() * 4;
			local593 = Static86.aClass5_Sub11_Sub1_12.method1546() * 4;
			local223 = Static86.aClass5_Sub11_Sub1_12.method1543();
			local227 = Static86.aClass5_Sub11_Sub1_12.method1543();
			local239 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local231 = Static86.aClass5_Sub11_Sub1_12.method1546();
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104 && local28 >= 0 && local35 >= 0 && local28 < 104 && local35 < 104 && local139 != 65535) {
				local35 = local35 * 128 + 64;
				local20 = local20 * 128 + 64;
				local28 = local28 * 128 + 64;
				local16 = local16 * 128 + 64;
				@Pc(1329) Class5_Sub1_Sub1_Sub4 local1329 = new Class5_Sub1_Sub1_Sub4(local139, Static23.anInt728, local16, local20, Static26.method989(local16, Static23.anInt728, local20) - local143, Static95.anInt2285 + local223, Static95.anInt2285 + local227, local239, local231, local135, local593);
				local1329.method1019(local223 + Static95.anInt2285, local28, local35, Static26.method989(local28, Static23.anInt728, local35) - local593);
				Static62.aClass52_6.method1362(local1329);
			}
		} else if (Static8.anInt283 == 160) {
			local12 = Static86.aClass5_Sub11_Sub1_12.method1529();
			local16 = Static86.aClass5_Sub11_Sub1_12.method1539();
			local20 = Static86.aClass5_Sub11_Sub1_12.method1516();
			local28 = Static100.anInt2361 + (local20 >> 4 & 0x7);
			local35 = (local20 & 0x7) + Static93.anInt2254;
			local135 = Static86.aClass5_Sub11_Sub1_12.method1549();
			if (local28 >= 0 && local35 >= 0 && local28 < 104 && local35 < 104 && local135 != Static6.anInt222) {
				@Pc(1403) Class5_Sub1_Sub1_Sub5 local1403 = new Class5_Sub1_Sub1_Sub5();
				local1403.anInt1918 = local16;
				local1403.anInt1915 = local12;
				if (Static34.aClass52ArrayArrayArray1[Static23.anInt728][local28][local35] == null) {
					Static34.aClass52ArrayArrayArray1[Static23.anInt728][local28][local35] = new Class52();
				}
				Static34.aClass52ArrayArrayArray1[Static23.anInt728][local28][local35].method1362(local1403);
				Static112.method1748(local35, local28);
			}
		} else if (Static8.anInt283 == 241) {
			local12 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local16 = (local12 >> 4 & 0x7) + Static100.anInt2361;
			local20 = (local12 & 0x7) + Static93.anInt2254;
			local28 = Static86.aClass5_Sub11_Sub1_12.method1546();
			local135 = local28 & 0x3;
			local35 = local28 >> 2;
			local139 = Static88.anIntArray254[local35];
			if (local16 >= 0 && local20 >= 0 && local16 < 104 && local20 < 104) {
				Static82.method1347(local35, local16, local135, local139, local20, -1, -1, Static23.anInt728, 0);
			}
		}
	}
}
