import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "Lclient!de;")
	public static Class20 aClass20_3;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "Lclient!lb;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!ae;")
	private static Class5 aClass5_464 = Static56.method972("Remove");

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Lclient!ae;")
	private static Class5 aClass5_469 = Static56.method972("Too many connections from your address)3");

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Lclient!ae;")
	public static Class5 aClass5_465 = aClass5_469;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	public static int anInt1005 = 0;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "Lclient!ae;")
	private static Class5 aClass5_468 = Static56.method972("Please contact customer support)3");

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!ae;")
	public static Class5 aClass5_466 = aClass5_468;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!e;")
	public static Class21 aClass21_6 = new Class21(4096);

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!ae;")
	public static Class5 aClass5_467 = aClass5_464;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Lclient!re;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_470 = Static56.method972(": ");

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "Lclient!ae;")
	private static Class5 aClass5_471 = Static56.method972("Enter your username (V password)3");

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Lclient!ae;")
	public static Class5 aClass5_472 = Static56.method972(" weitere Optionen");

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "Lclient!ae;")
	public static Class5 aClass5_473 = aClass5_471;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
	public static int anInt1011 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZ)V")
	public static void method684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class3_Sub1_Sub17 local4 = Static67.method1171(arg2, arg1);
		if (local4 != null && local4.anObjectArray17 != null) {
			Static68.method997(0, local4.anObjectArray17, null, 0, local4, 0);
		}
		Static100.aBoolean124 = true;
		Static47.anInt1309 = arg1;
		Static62.anInt1672 = arg0;
		Static62.anInt1671 = arg2;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBI[B)I")
	public static int method685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg0; local14++) {
			local12 = Class3_Sub7.anIntArray203[(local12 ^ arg2[local14]) & 0xFF] ^ local12 >>> 8;
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static18.method406(arg5)) {
			Static45.method854(0, arg6, 0, arg3, -1, arg2, arg4, arg0, Static31.aClass3_Sub1_Sub17ArrayArray3[arg5], arg1, arg7);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
	public static void method687(@OriginalArg(1) boolean arg0) {
		Static105.aBoolean144 = arg0;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(151) int local151;
		if (!Static105.aBoolean144) {
			local18 = Static75.aClass3_Sub6_Sub1_2.method1604();
			local22 = Static75.aClass3_Sub6_Sub1_2.method1604();
			local26 = Static75.aClass3_Sub6_Sub1_2.method1636();
			local30 = Static75.aClass3_Sub6_Sub1_2.method1591();
			local38 = (Static61.anInt1652 - Static75.aClass3_Sub6_Sub1_2.anInt2416) / 16;
			Static15.anIntArrayArray4 = new int[local38][4];
			for (local44 = 0; local44 < local38; local44++) {
				for (local48 = 0; local48 < 4; local48++) {
					Static15.anIntArrayArray4[local44][local48] = Static75.aClass3_Sub6_Sub1_2.method1632();
				}
			}
			local48 = Static75.aClass3_Sub6_Sub1_2.method1621();
			Static109.anIntArray371 = new int[local38];
			Static93.anIntArray270 = new int[local38];
			Static9.aByteArrayArray2 = new byte[local38][];
			Static101.aByteArrayArray9 = new byte[local38][];
			@Pc(88) boolean local88 = false;
			Static19.anIntArray74 = new int[local38];
			local38 = 0;
			if ((local18 / 8 == 48 || local18 / 8 == 49) && (local48 / 8) == 48) {
				local88 = true;
			}
			if (local18 / 8 == 48 && local48 / 8 == 148) {
				local88 = true;
			}
			for (local134 = (local18 - 6) / 8; local134 <= (local18 + 6) / 8; local134++) {
				for (local142 = (local48 - 6) / 8; local142 <= (local48 + 6) / 8; local142++) {
					local151 = (local134 << 8) + local142;
					if (!local88 || local142 != 49 && local142 != 149 && local142 != 147 && local134 != 50 && (local134 != 49 || local142 != 47)) {
						Static109.anIntArray371[local38] = local151;
						Static19.anIntArray74[local38] = Static18.aClass11_Sub1_20.method1880(Static75.method1261(new Class5[] { Static94.aClass5_263, Static96.method1319(local134), Static48.aClass5_638, Static96.method1319(local142) }));
						Static93.anIntArray270[local38] = Static18.aClass11_Sub1_20.method1880(Static75.method1261(new Class5[] { Static90.aClass5_1061, Static96.method1319(local134), Static48.aClass5_638, Static96.method1319(local142) }));
						local38++;
					}
				}
			}
			Static30.method605(local30, local48, local26, local22, local18);
			return;
		}
		Static75.aClass3_Sub6_Sub1_2.method1639();
		for (local18 = 0; local18 < 4; local18++) {
			for (local22 = 0; local22 < 13; local22++) {
				for (local26 = 0; local26 < 13; local26++) {
					local30 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
					if (local30 == 1) {
						Static44.anIntArrayArrayArray1[local18][local22][local26] = Static75.aClass3_Sub6_Sub1_2.method1646(26);
					} else {
						Static44.anIntArrayArrayArray1[local18][local22][local26] = -1;
					}
				}
			}
		}
		Static75.aClass3_Sub6_Sub1_2.method1641();
		local22 = (Static61.anInt1652 - Static75.aClass3_Sub6_Sub1_2.anInt2416) / 16;
		Static15.anIntArrayArray4 = new int[local22][4];
		for (local26 = 0; local26 < local22; local26++) {
			for (local30 = 0; local30 < 4; local30++) {
				Static15.anIntArrayArray4[local26][local30] = Static75.aClass3_Sub6_Sub1_2.method1614();
			}
		}
		local30 = Static75.aClass3_Sub6_Sub1_2.method1636();
		local38 = Static75.aClass3_Sub6_Sub1_2.method1604();
		local44 = Static75.aClass3_Sub6_Sub1_2.method1636();
		local48 = Static75.aClass3_Sub6_Sub1_2.method1604();
		@Pc(405) int local405 = Static75.aClass3_Sub6_Sub1_2.method1618();
		Static19.anIntArray74 = new int[local22];
		Static109.anIntArray371 = new int[local22];
		Static9.aByteArrayArray2 = new byte[local22][];
		Static93.anIntArray270 = new int[local22];
		Static101.aByteArrayArray9 = new byte[local22][];
		local22 = 0;
		for (local134 = 0; local134 < 4; local134++) {
			for (local142 = 0; local142 < 13; local142++) {
				for (local151 = 0; local151 < 13; local151++) {
					@Pc(442) int local442 = Static44.anIntArrayArrayArray1[local134][local142][local151];
					if (local442 != -1) {
						@Pc(451) int local451 = local442 >> 3 & 0x7FF;
						@Pc(457) int local457 = local442 >> 14 & 0x3FF;
						@Pc(467) int local467 = local451 / 8 + (local457 / 8 << 8);
						for (@Pc(469) int local469 = 0; local469 < local22; local469++) {
							if (Static109.anIntArray371[local469] == local467) {
								local467 = -1;
								break;
							}
						}
						if (local467 != -1) {
							Static109.anIntArray371[local22] = local467;
							@Pc(497) int local497 = local467 >> 8 & 0xFF;
							@Pc(501) int local501 = local467 & 0xFF;
							Static19.anIntArray74[local22] = Static18.aClass11_Sub1_20.method1880(Static75.method1261(new Class5[] { Static94.aClass5_263, Static96.method1319(local497), Static48.aClass5_638, Static96.method1319(local501) }));
							Static93.anIntArray270[local22] = Static18.aClass11_Sub1_20.method1880(Static75.method1261(new Class5[] { Static90.aClass5_1061, Static96.method1319(local497), Static48.aClass5_638, Static96.method1319(local501) }));
							local22++;
						}
					}
				}
			}
		}
		Static30.method605(local405, local48, local44, local30, local38);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method688() {
		try {
			if (Static65.anInt2401 == 0) {
				if (Static58.aClass18_1 != null) {
					Static58.aClass18_1.method405();
					Static58.aClass18_1 = null;
				}
				Static65.anInt2401 = 1;
				Static90.aClass58_7 = null;
				Static102.aBoolean139 = false;
				Static17.anInt615 = 0;
			}
			if (Static65.anInt2401 == 1) {
				if (Static90.aClass58_7 == null) {
					Static90.aClass58_7 = Static56.aClass23_3.method523(Static23.anInt730);
				}
				if (Static90.aClass58_7.anInt2474 == 2) {
					throw new IOException();
				}
				if (Static90.aClass58_7.anInt2474 == 1) {
					Static58.aClass18_1 = new Class18((Socket) Static90.aClass58_7.anObject4, Static56.aClass23_3);
					Static65.anInt2401 = 2;
					Static90.aClass58_7 = null;
				}
			}
			if (Static65.anInt2401 == 2) {
				@Pc(75) long local75 = Static16.aLong15 = Static88.aClass5_1015.method146();
				Static95.aClass3_Sub6_Sub1_3.anInt2416 = 0;
				Static95.aClass3_Sub6_Sub1_3.method1608(14);
				@Pc(89) int local89 = (int) (local75 >> 16 & 0x1FL);
				Static95.aClass3_Sub6_Sub1_3.method1608(local89);
				Static58.aClass18_1.method409(Static95.aClass3_Sub6_Sub1_3.aByteArray17, 2);
				Static75.aClass3_Sub6_Sub1_2.anInt2416 = 0;
				Static65.anInt2401 = 3;
			}
			@Pc(114) int local114;
			if (Static65.anInt2401 == 3) {
				local114 = Static58.aClass18_1.method407();
				if (local114 != 0) {
					Static11.method319(local114);
					return;
				}
				Static65.anInt2401 = 4;
				Static75.aClass3_Sub6_Sub1_2.anInt2416 = 0;
			}
			if (Static65.anInt2401 == 4) {
				if (Static75.aClass3_Sub6_Sub1_2.anInt2416 < 8) {
					local114 = Static58.aClass18_1.method408();
					if (8 - Static75.aClass3_Sub6_Sub1_2.anInt2416 < local114) {
						local114 = 8 - Static75.aClass3_Sub6_Sub1_2.anInt2416;
					}
					if (local114 > 0) {
						Static58.aClass18_1.method404(local114, Static75.aClass3_Sub6_Sub1_2.aByteArray17, Static75.aClass3_Sub6_Sub1_2.anInt2416);
						Static75.aClass3_Sub6_Sub1_2.anInt2416 += local114;
					}
				}
				if (Static75.aClass3_Sub6_Sub1_2.anInt2416 == 8) {
					Static75.aClass3_Sub6_Sub1_2.anInt2416 = 0;
					Static52.aLong47 = Static75.aClass3_Sub6_Sub1_2.method1598();
					Static65.anInt2401 = 5;
				}
			}
			if (Static65.anInt2401 == 5) {
				Static95.aClass3_Sub6_Sub1_3.anInt2416 = 0;
				@Pc(202) int[] local202 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static52.aLong47 >> 32), (int) Static52.aLong47 };
				Static95.aClass3_Sub6_Sub1_3.method1608(10);
				Static95.aClass3_Sub6_Sub1_3.method1611(local202[0]);
				Static95.aClass3_Sub6_Sub1_3.method1611(local202[1]);
				Static95.aClass3_Sub6_Sub1_3.method1611(local202[2]);
				Static95.aClass3_Sub6_Sub1_3.method1611(local202[3]);
				Static95.aClass3_Sub6_Sub1_3.method1611(Static56.aClass23_3.anInt788);
				Static95.aClass3_Sub6_Sub1_3.method1606(Static88.aClass5_1015.method146());
				Static95.aClass3_Sub6_Sub1_3.method1637(Static88.aClass5_1019);
				Static95.aClass3_Sub6_Sub1_3.method1631(Static3.aBigInteger1, Static18.aBigInteger2);
				Static4.aClass3_Sub6_Sub1_1.anInt2416 = 0;
				if (Static47.anInt1308 == 40) {
					Static4.aClass3_Sub6_Sub1_1.method1608(18);
				} else {
					Static4.aClass3_Sub6_Sub1_1.method1608(16);
				}
				Static4.aClass3_Sub6_Sub1_1.method1608(Static95.aClass3_Sub6_Sub1_3.anInt2416 + 61);
				Static4.aClass3_Sub6_Sub1_1.method1611(443);
				Static4.aClass3_Sub6_Sub1_1.method1608(Static74.aBoolean91 ? 1 : 0);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static65.aClass11_Sub1_92.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static17.aClass11_Sub1_19.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static111.aClass11_Sub1_107.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static60.aClass11_Sub1_113.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static60.aClass11_Sub1_112.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static18.aClass11_Sub1_20.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static34.aClass11_Sub1_34.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static74.aClass11_Sub1_67.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static38.aClass11_Sub1_37.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static102.aClass11_Sub1_97.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static110.aClass11_Sub1_106.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static54.aClass11_Sub1_53.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static49.aClass11_Sub1_50.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1611(Static93.aClass11_Sub1_89.anInt2831);
				Static4.aClass3_Sub6_Sub1_1.method1593(Static95.aClass3_Sub6_Sub1_3.aByteArray17, Static95.aClass3_Sub6_Sub1_3.anInt2416);
				Static58.aClass18_1.method409(Static4.aClass3_Sub6_Sub1_1.aByteArray17, Static4.aClass3_Sub6_Sub1_1.anInt2416);
				Static95.aClass3_Sub6_Sub1_3.method1640(local202);
				for (@Pc(403) int local403 = 0; local403 < 4; local403++) {
					local202[local403] += 50;
				}
				Static75.aClass3_Sub6_Sub1_2.method1640(local202);
				Static65.anInt2401 = 6;
			}
			if (Static65.anInt2401 == 6 && Static58.aClass18_1.method408() > 0) {
				local114 = Static58.aClass18_1.method407();
				if (local114 == 21 && Static47.anInt1308 == 20) {
					Static65.anInt2401 = 7;
				} else if (local114 == 2) {
					Static65.anInt2401 = 9;
				} else if (local114 == 15 && Static47.anInt1308 == 40) {
					Static83.method1329();
					return;
				} else if (local114 == 23 && Static78.anInt1961 < 1) {
					Static78.anInt1961++;
					Static65.anInt2401 = 0;
				} else {
					Static11.method319(local114);
					return;
				}
			}
			if (Static65.anInt2401 == 7 && Static58.aClass18_1.method408() > 0) {
				Static55.anInt1442 = Static58.aClass18_1.method407() * 60 + 180;
				Static65.anInt2401 = 8;
			}
			if (Static65.anInt2401 == 8) {
				Static17.anInt615 = 0;
				Static58.method1005(Static91.aClass5_1076, Static75.method1261(new Class5[] { Static96.method1319(Static55.anInt1442 / 60), Static38.aClass5_482 }), Static23.aClass5_317);
				if (--Static55.anInt1442 <= 0) {
					Static65.anInt2401 = 0;
				}
			} else {
				if (Static65.anInt2401 == 9 && Static58.aClass18_1.method408() >= 8) {
					Static7.anInt363 = Static58.aClass18_1.method407();
					Static61.aBoolean77 = Static58.aClass18_1.method407() == 1;
					Static114.anInt2962 = Static58.aClass18_1.method407();
					Static114.anInt2962 <<= 0x8;
					Static114.anInt2962 += Static58.aClass18_1.method407();
					Static105.anInt2692 = Static58.aClass18_1.method407();
					Static58.aClass18_1.method404(1, Static75.aClass3_Sub6_Sub1_2.aByteArray17, 0);
					Static75.aClass3_Sub6_Sub1_2.anInt2416 = 0;
					Static5.anInt353 = Static75.aClass3_Sub6_Sub1_2.method1647();
					Static58.aClass18_1.method404(2, Static75.aClass3_Sub6_Sub1_2.aByteArray17, 0);
					Static75.aClass3_Sub6_Sub1_2.anInt2416 = 0;
					Static61.anInt1652 = Static75.aClass3_Sub6_Sub1_2.method1603();
					Static65.anInt2401 = 10;
				}
				if (Static65.anInt2401 != 10) {
					Static17.anInt615++;
					if (Static17.anInt615 > 2000) {
						if (Static78.anInt1961 < 1) {
							Static65.anInt2401 = 0;
							if (Static36.anInt2765 == Static23.anInt730) {
								Static23.anInt730 = Static99.anInt2503;
							} else {
								Static23.anInt730 = Static36.anInt2765;
							}
							Static78.anInt1961++;
						} else {
							Static11.method319(-3);
						}
					}
				} else if (Static58.aClass18_1.method408() >= Static61.anInt1652) {
					Static75.aClass3_Sub6_Sub1_2.anInt2416 = 0;
					Static58.aClass18_1.method404(Static61.anInt1652, Static75.aClass3_Sub6_Sub1_2.aByteArray17, 0);
					Static68.method994();
					Static67.anInt1780 = -1;
					method687(false);
					Static5.anInt353 = -1;
				}
			}
		} catch (@Pc(696) IOException local696) {
			if (Static78.anInt1961 < 1) {
				Static78.anInt1961++;
				Static65.anInt2401 = 0;
				if (Static36.anInt2765 == Static23.anInt730) {
					Static23.anInt730 = Static99.anInt2503;
				} else {
					Static23.anInt730 = Static36.anInt2765;
				}
			} else {
				Static11.method319(-2);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public static void method689() {
		aClass5_466 = null;
		aClass5_469 = null;
		aClass5_473 = null;
		aClass5_467 = null;
		aClass43_1 = null;
		aClass20_3 = null;
		aClass5_471 = null;
		aClass21_6 = null;
		aClass5_464 = null;
		aClass5_472 = null;
		aClass5_465 = null;
		aClass5_470 = null;
		aClass5_468 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)Lclient!kb;")
	public static Class3_Sub1_Sub9 method690(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub1_Sub9 local15 = (Class3_Sub1_Sub9) Static102.aClass9_25.method282((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static92.aClass11_58.method1882(14, arg0);
		local15 = new Class3_Sub1_Sub9();
		if (local25 != null) {
			local15.method948(new Class3_Sub6(local25));
		}
		Static102.aClass9_25.method284(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method691() {
		Static53.aClass2_12.method1318();
		Static74.aClass3_Sub1_Sub2_Sub4_7.method1857(0, 0);
		Static102.anIntArray303 = Static25.method507(Static102.anIntArray303);
	}
}
