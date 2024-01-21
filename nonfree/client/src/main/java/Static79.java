import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!pc", name = "S", descriptor = "Lclient!kb;")
	public static Class9 aClass9_40;

	@OriginalMember(owner = "client!pc", name = "ub", descriptor = "Lclient!rd;")
	public static Class42_Sub1 aClass42_Sub1_46;

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "Lclient!v;")
	public static Class62 aClass62_929 = Static45.method753("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!pc", name = "W", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][105][105];

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "Lclient!v;")
	private static Class62 aClass62_930 = Static45.method753("Your account has been disabled)3");

	@OriginalMember(owner = "client!pc", name = "mb", descriptor = "Lclient!v;")
	private static Class62 aClass62_933 = Static45.method753("Public chat");

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "Lclient!v;")
	public static Class62 aClass62_931 = aClass62_933;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lclient!v;")
	public static Class62 aClass62_932 = aClass62_930;

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
	public static int anInt2106 = 0;

	@OriginalMember(owner = "client!pc", name = "eb", descriptor = "Lclient!jb;")
	public static Class34 aClass34_26 = new Class34(50);

	@OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
	public static int anInt2109 = 0;

	@OriginalMember(owner = "client!pc", name = "ob", descriptor = "Lclient!v;")
	public static Class62 aClass62_934 = Static45.method753("mapmarker");

	@OriginalMember(owner = "client!pc", name = "vb", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!pc", name = "wb", descriptor = "Lclient!v;")
	public static Class62 aClass62_935 = Static45.method753("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZ[BZ)V")
	public static void method1279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[] arg3) {
		if (Static55.aClass38_1 == null) {
			return;
		}
		if (Static30.anInt974 >= 0) {
			arg1 -= 20;
			if (arg1 < 1) {
				arg1 = 1;
			}
			Static22.anInt745 = arg1;
			if (Static30.anInt974 == 0) {
				Static78.anInt2074 = 0;
			} else {
				@Pc(51) int local51 = Static53.method830(Static30.anInt974);
				@Pc(55) int local55 = local51 - Static68.anInt1892;
				Static78.anInt2074 = (local55 + Static78.anInt2074 + 3600 - 1) / Static78.anInt2074;
			}
			Static10.aByteArray20 = arg3;
			Static44.aBoolean71 = arg2;
			Static59.anInt1620 = arg0;
		} else if (Static22.anInt745 == 0) {
			Static51.method1436(arg0, arg2, arg3);
		} else {
			Static10.aByteArray20 = arg3;
			Static44.aBoolean71 = arg2;
			Static59.anInt1620 = arg0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[BI[Lclient!cc;IBI)V")
	private static void method1283(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (local11 + arg5 > 0 && arg5 + local11 < 103 && local15 + arg2 > 0 && local15 + arg2 < 103) {
						arg3[local7].anIntArrayArray3[arg5 + local11][local15 + arg2] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(89) Class3_Sub8 local89 = new Class3_Sub8(arg1);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
				for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
					Static54.method1783(local89, local95 + arg5, 0, local15, arg4, arg0, arg2 + local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
	public static void method1285() {
		Static86.method1416(false);
		Static15.anInt566 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static26.aByteArrayArray2.length; local14++) {
			if (Static41.anIntArray84[local14] != -1 && Static26.aByteArrayArray2[local14] == null) {
				Static26.aByteArrayArray2[local14] = Static49.aClass42_Sub1_28.method1504(Static41.anIntArray84[local14], 0);
				if (Static26.aByteArrayArray2[local14] == null) {
					local12 = false;
					Static15.anInt566++;
				}
			}
			if (Static106.anIntArray312[local14] != -1 && Static29.aByteArrayArray3[local14] == null) {
				Static29.aByteArrayArray3[local14] = Static49.aClass42_Sub1_28.method1513(Static106.anIntArray312[local14], 0, Static85.anIntArrayArray23[local14]);
				if (Static29.aByteArrayArray3[local14] == null) {
					Static15.anInt566++;
					local12 = false;
				}
			}
		}
		if (!local12) {
			Static14.anInt553 = 1;
			return;
		}
		Static6.anInt210 = 0;
		local12 = true;
		@Pc(127) int local127;
		@Pc(116) int local116;
		for (@Pc(98) int local98 = 0; local98 < Static26.aByteArrayArray2.length; local98++) {
			@Pc(104) byte[] local104 = Static29.aByteArrayArray3[local98];
			if (local104 != null) {
				local116 = (Static18.anIntArray53[local98] & 0xFF) * 64 - Static41.anInt1196;
				local127 = (Static18.anIntArray53[local98] >> 8) * 64 - Static2.anInt56;
				if (Static35.aBoolean63) {
					local116 = 10;
					local127 = 10;
				}
				local12 &= Static2.method67(local116, local104, local127);
			}
		}
		if (!local12) {
			Static14.anInt553 = 2;
			return;
		}
		if (Static14.anInt553 != 0) {
			Static74.method1203(Static64.aClass62_775, Static93.aClass62_1129, true);
		}
		Static95.method1621();
		Static76.aClass1_1.method37();
		System.gc();
		for (local127 = 0; local127 < 4; local127++) {
			Static32.aClass11Array1[local127].method297();
		}
		@Pc(193) int local193;
		@Pc(197) int local197;
		for (local116 = 0; local116 < 4; local116++) {
			for (local193 = 0; local193 < 104; local193++) {
				for (local197 = 0; local197 < 104; local197++) {
					Static44.aByteArrayArrayArray6[local116][local193][local197] = 0;
				}
			}
		}
		Static100.method1582();
		local193 = Static26.aByteArrayArray2.length;
		Static32.method625();
		Static86.method1416(true);
		@Pc(249) int local249;
		@Pc(260) int local260;
		@Pc(367) int local367;
		@Pc(314) int local314;
		@Pc(357) int local357;
		if (!Static35.aBoolean63) {
			@Pc(264) byte[] local264;
			for (local197 = 0; local197 < local193; local197++) {
				local249 = (Static18.anIntArray53[local197] >> 8) * 64 - Static2.anInt56;
				local260 = (Static18.anIntArray53[local197] & 0xFF) * 64 - Static41.anInt1196;
				local264 = Static26.aByteArrayArray2[local197];
				if (local264 != null) {
					method1283((Static41.anInt1203 - 6) * 8, local264, local260, Static32.aClass11Array1, (Static76.anInt2059 - 6) * 8, local249);
				}
			}
			for (local249 = 0; local249 < local193; local249++) {
				local260 = (Static18.anIntArray53[local249] >> 8) * 64 - Static2.anInt56;
				@Pc(304) byte[] local304 = Static26.aByteArrayArray2[local249];
				local314 = (Static18.anIntArray53[local249] & 0xFF) * 64 - Static41.anInt1196;
				if (local304 == null && Static76.anInt2059 < 800) {
					Static46.method760(64, 64, local260, local314);
				}
			}
			Static86.method1416(true);
			for (local260 = 0; local260 < local193; local260++) {
				local264 = Static29.aByteArrayArray3[local260];
				if (local264 != null) {
					local357 = (Static18.anIntArray53[local260] >> 8) * 64 - Static2.anInt56;
					local367 = (Static18.anIntArray53[local260] & 0xFF) * 64 - Static41.anInt1196;
					Static18.method463(local367, local357, Static32.aClass11Array1, local264, Static76.aClass1_1);
				}
			}
		}
		@Pc(428) int local428;
		@Pc(422) int local422;
		if (Static35.aBoolean63) {
			@Pc(434) int local434;
			@Pc(444) int local444;
			@Pc(446) int local446;
			for (local197 = 0; local197 < 4; local197++) {
				for (local249 = 0; local249 < 13; local249++) {
					for (local260 = 0; local260 < 13; local260++) {
						local357 = Static102.anIntArrayArrayArray7[local197][local249][local260];
						@Pc(406) boolean local406 = false;
						if (local357 != -1) {
							local367 = local357 >> 24 & 0x3;
							local422 = local357 >> 14 & 0x3FF;
							local428 = local357 >> 1 & 0x3;
							local434 = local357 >> 3 & 0x7FF;
							local444 = (local422 / 8 << 8) + local434 / 8;
							for (local446 = 0; local446 < Static18.anIntArray53.length; local446++) {
								if (local444 == Static18.anIntArray53[local446] && Static26.aByteArrayArray2[local446] != null) {
									Static19.method1856((local434 & 0x7) * 8, (local422 & 0x7) * 8, local197, local249 * 8, local260 * 8, Static26.aByteArrayArray2[local446], local428, Static32.aClass11Array1, local367);
									local406 = true;
									break;
								}
							}
						}
						if (!local406) {
							Static109.method1875(local260 * 8, local249 * 8, local197);
						}
					}
				}
			}
			for (local249 = 0; local249 < 13; local249++) {
				for (local260 = 0; local260 < 13; local260++) {
					local314 = Static102.anIntArrayArrayArray7[0][local249][local260];
					if (local314 == -1) {
						Static46.method760(8, 8, local249 * 8, local260 * 8);
					}
				}
			}
			Static86.method1416(true);
			for (local260 = 0; local260 < 4; local260++) {
				for (local314 = 0; local314 < 13; local314++) {
					for (local357 = 0; local357 < 13; local357++) {
						local367 = Static102.anIntArrayArrayArray7[local260][local314][local357];
						if (local367 != -1) {
							local428 = local367 >> 24 & 0x3;
							local422 = local367 >> 1 & 0x3;
							local434 = local367 >> 14 & 0x3FF;
							local444 = local367 >> 3 & 0x7FF;
							local446 = local444 / 8 + (local434 / 8 << 8);
							for (@Pc(621) int local621 = 0; local621 < Static18.anIntArray53.length; local621++) {
								if (local446 == Static18.anIntArray53[local621] && Static29.aByteArrayArray3[local621] != null) {
									Static76.method1248(local422, Static76.aClass1_1, (local434 & 0x7) * 8, local357 * 8, (local444 & 0x7) * 8, local428, Static32.aClass11Array1, local260, local314 * 8, Static29.aByteArrayArray3[local621]);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static86.method1416(true);
		Static95.method1621();
		Static80.method1307(Static32.aClass11Array1, Static76.aClass1_1);
		Static86.method1416(true);
		local197 = Static78.anInt2069;
		if (Static27.anInt818 < local197) {
			local197 = Static27.anInt818;
		}
		if (local197 < Static27.anInt818 - 1) {
		}
		if (Static92.aBoolean151) {
			Static76.aClass1_1.method27(Static78.anInt2069);
		} else {
			Static76.aClass1_1.method27(0);
		}
		for (local249 = 0; local249 < 104; local249++) {
			for (local260 = 0; local260 < 104; local260++) {
				Static92.method1553(local260, local249);
			}
		}
		Static96.method1634();
		Static9.aClass34_24.method762();
		if (Static23.aFrame1 != null) {
			Static63.aClass3_Sub8_Sub1_6.method1824(172);
			Static63.aClass3_Sub8_Sub1_6.method1792(1057001181);
		}
		if (!Static35.aBoolean63) {
			local314 = (Static41.anInt1203 + 6) / 8;
			local260 = (Static41.anInt1203 - 6) / 8;
			local357 = (Static76.anInt2059 - 6) / 8;
			local367 = (Static76.anInt2059 + 6) / 8;
			for (local428 = local260 - 1; local428 <= local314 + 1; local428++) {
				for (local422 = local357 - 1; local422 <= local367 + 1; local422++) {
					if (local428 < local260 || local314 < local428 || local357 > local422 || local422 > local367) {
						Static49.aClass42_Sub1_28.method1508(Static49.method782(new Class62[] { Static14.aClass62_214, Static99.method1662(local428), Static36.aClass62_474, Static99.method1662(local422) }));
						Static49.aClass42_Sub1_28.method1508(Static49.method782(new Class62[] { Static9.aClass62_812, Static99.method1662(local428), Static36.aClass62_474, Static99.method1662(local422) }));
					}
				}
			}
		}
		if (Static91.anInt2434 == -1) {
			Static65.method1089(30);
		} else {
			Static65.method1089(35);
		}
		Static42.method715();
		Static63.aClass3_Sub8_Sub1_6.method1824(29);
		Static64.method1083();
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
	public static void method1286() {
		try {
			@Pc(2) Graphics local2 = Static44.aCanvas1.getGraphics();
			Static29.aClass9_16.method686(local2, 4, 4);
		} catch (@Pc(18) Exception local18) {
			Static44.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V")
	public static void method1287() {
		aClass9_40 = null;
		aClass62_930 = null;
		aClass62_934 = null;
		aClass62_933 = null;
		aClass34_26 = null;
		aClass62_932 = null;
		anIntArrayArrayArray4 = null;
		aClass42_Sub1_46 = null;
		aClass62_931 = null;
		aClass62_935 = null;
		aClass62_929 = null;
	}
}
