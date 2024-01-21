import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
	public static int anInt2315;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array6;

	@OriginalMember(owner = "client!fe", name = "lb", descriptor = "I")
	public static int anInt2338;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1051 = Static24.method441("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1052 = Static24.method441("Select");

	@OriginalMember(owner = "client!fe", name = "N", descriptor = "Lclient!ge;")
	public static Class21 aClass21_31 = new Class21(50);

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1053 = Static24.method441("redstone2");

	@OriginalMember(owner = "client!fe", name = "Db", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1057 = Static24.method441("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!fe", name = "kb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1054 = aClass65_1057;

	@OriginalMember(owner = "client!fe", name = "tb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1055 = aClass65_1051;

	@OriginalMember(owner = "client!fe", name = "Bb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1056 = aClass65_1052;

	@OriginalMember(owner = "client!fe", name = "Kb", descriptor = "I")
	public static int anInt2359 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZ)V")
	public static void method1369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
			if (Static34.aClass65Array5[local13] != null) {
				@Pc(23) int local23 = Static61.anIntArray249[local13];
				@Pc(33) int local33 = Static95.anInt1974 + 4 + 70 - local7 * 14;
				if (local33 < -20) {
					break;
				}
				@Pc(40) Class65 local40 = Static78.aClass65Array4[local13];
				if (local23 == 0) {
					local7++;
				}
				if (local40 != null && local40.method1783(Static69.aClass65_954)) {
					local40 = local40.method1779(5);
				}
				if (local40 != null && local40.method1783(Static6.aClass65_117)) {
					local40 = local40.method1779(5);
				}
				if ((local23 == 1 || local23 == 2) && (local23 == 1 || Static103.anInt2811 == 0 || Static103.anInt2811 == 1 && Static4.method102(local40))) {
					local7++;
					if (local33 - 14 < arg0 && arg0 <= local33 && !local40.method1781(Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.aClass65_726)) {
						if (Static20.anInt629 >= 1) {
							Static47.method820(0, 0, Static52.aClass65_724, Static13.method282(new Class65[] { Static68.aClass65_948, local40 }), 35, 0);
						}
						Static47.method820(0, 0, Static95.aClass65_901, Static13.method282(new Class65[] { Static68.aClass65_948, local40 }), 36, 0);
						Static47.method820(0, 0, Static1.aClass65_7, Static13.method282(new Class65[] { Static68.aClass65_948, local40 }), 51, 0);
					}
				}
				if ((local23 == 3 || local23 == 7) && Static47.anInt1390 == 0 && (local23 == 7 || Static42.anInt1350 == 0 || Static42.anInt1350 == 1 && Static4.method102(local40))) {
					if (local33 - 14 < arg0 && local33 >= arg0) {
						if (Static20.anInt629 >= 1) {
							Static47.method820(0, 0, Static52.aClass65_724, Static13.method282(new Class65[] { Static68.aClass65_948, local40 }), 35, 0);
						}
						Static47.method820(0, 0, Static95.aClass65_901, Static13.method282(new Class65[] { Static68.aClass65_948, local40 }), 36, 0);
						Static47.method820(0, 0, Static1.aClass65_7, Static13.method282(new Class65[] { Static68.aClass65_948, local40 }), 51, 0);
					}
					local7++;
				}
				if (local23 == 4 && (Static85.anInt2454 == 0 || Static85.anInt2454 == 1 && Static4.method102(local40))) {
					if (arg0 > local33 - 14 && local33 >= arg0) {
						Static47.method820(0, 0, Static3.aClass65_90, Static13.method282(new Class65[] { Static68.aClass65_948, local40 }), 52, 0);
					}
					local7++;
				}
				if ((local23 == 5 || local23 == 6) && Static47.anInt1390 == 0 && Static42.anInt1350 < 2) {
					local7++;
				}
				if (local23 == 8 && (Static85.anInt2454 == 0 || Static85.anInt2454 == 1 && Static4.method102(local40))) {
					local7++;
					if (arg0 > local33 - 14 && arg0 <= local33) {
						Static47.method820(0, 0, Static81.aClass65_1345, Static13.method282(new Class65[] { Static68.aClass65_948, local40 }), 48, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V")
	public static void method1383() {
		aClass65_1052 = null;
		aClass65_1054 = null;
		aClass2_Sub1_Sub4_Sub3Array6 = null;
		aClass65_1057 = null;
		aClass65_1056 = null;
		aClass65_1051 = null;
		aClass65_1055 = null;
		aClass65_1053 = null;
		aClass21_31 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!kd;B)V")
	public static void method1408(@OriginalArg(0) Class2_Sub12 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt1708 == 0) {
			local5 = Static67.aClass18_1.method581(arg0.anInt1702, arg0.anInt1709, arg0.anInt1698);
		}
		if (arg0.anInt1708 == 1) {
			local5 = Static67.aClass18_1.method591(arg0.anInt1702, arg0.anInt1709, arg0.anInt1698);
		}
		@Pc(37) int local37 = -1;
		@Pc(39) int local39 = 0;
		if (arg0.anInt1708 == 2) {
			local5 = Static67.aClass18_1.method592(arg0.anInt1702, arg0.anInt1709, arg0.anInt1698);
		}
		@Pc(56) int local56 = 0;
		if (arg0.anInt1708 == 3) {
			local5 = Static67.aClass18_1.method608(arg0.anInt1702, arg0.anInt1709, arg0.anInt1698);
		}
		if (local5 != 0) {
			@Pc(84) int local84 = Static67.aClass18_1.method620(arg0.anInt1702, arg0.anInt1709, arg0.anInt1698, local5);
			local39 = local84 >> 6 & 0x3;
			local37 = local5 >> 14 & 0x7FFF;
			local56 = local84 & 0x1F;
		}
		arg0.anInt1706 = local39;
		arg0.anInt1696 = local37;
		arg0.anInt1699 = local56;
	}

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "(I)V")
	public static void method1413() {
		@Pc(11) int local11 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 + Static104.anInt2823;
		@Pc(16) int local16 = Static17.anInt588 + Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562;
		@Pc(18) int local18 = 0;
		if (Static13.anInt461 - local11 < -500 || Static13.anInt461 - local11 > 500 || Static106.anInt2834 - local16 < -500 || Static106.anInt2834 - local16 > 500) {
			Static13.anInt461 = local11;
			Static106.anInt2834 = local16;
		}
		if (local11 != Static13.anInt461) {
			Static13.anInt461 += (local11 - Static13.anInt461) / 16;
		}
		if (Static106.anInt2834 != local16) {
			Static106.anInt2834 += (local16 - Static106.anInt2834) / 16;
		}
		@Pc(88) int local88 = Static13.anInt461 >> 7;
		if (Static68.aBooleanArray19[96]) {
			Static76.anInt2211 += (-Static76.anInt2211 - 24) / 2;
		} else if (Static68.aBooleanArray19[97]) {
			Static76.anInt2211 += (24 - Static76.anInt2211) / 2;
		} else {
			Static76.anInt2211 /= 2;
		}
		if (Static68.aBooleanArray19[98]) {
			Static80.anInt2292 += (12 - Static80.anInt2292) / 2;
		} else if (Static68.aBooleanArray19[99]) {
			Static80.anInt2292 += (-Static80.anInt2292 - 12) / 2;
		} else {
			Static80.anInt2292 /= 2;
		}
		@Pc(160) int local160 = Static106.anInt2834 >> 7;
		Static3.anInt160 = Static76.anInt2211 / 2 + Static3.anInt160 & 0x7FF;
		Static63.anInt1905 += Static80.anInt2292 / 2;
		if (Static63.anInt1905 < 128) {
			Static63.anInt1905 = 128;
		}
		if (Static63.anInt1905 > 383) {
			Static63.anInt1905 = 383;
		}
		@Pc(194) int local194 = Static25.method447(Static62.anInt1879, Static106.anInt2834, Static13.anInt461);
		@Pc(216) int local216;
		if (local88 > 3 && local160 > 3 && local88 < 100 && local160 < 100) {
			for (local216 = local88 - 4; local216 <= local88 + 4; local216++) {
				for (@Pc(222) int local222 = local160 - 4; local222 <= local160 + 4; local222++) {
					@Pc(226) int local226 = Static62.anInt1879;
					if (local226 < 3 && (Static50.aByteArrayArrayArray6[1][local216][local222] & 0x2) == 2) {
						local226++;
					}
					@Pc(255) int local255 = local194 - Static61.anIntArrayArrayArray6[local226][local216][local222];
					if (local18 < local255) {
						local18 = local255;
					}
				}
			}
		}
		local216 = local18 * 192;
		if (local216 > 98048) {
			local216 = 98048;
		}
		if (local216 < 32768) {
			local216 = 32768;
		}
		if (Static7.anInt288 < local216) {
			Static7.anInt288 += (local216 - Static7.anInt288) / 24;
		} else if (local216 < Static7.anInt288) {
			Static7.anInt288 += (local216 - Static7.anInt288) / 80;
		}
	}

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "(B)V")
	public static void method1414() {
		if (Static50.aClass26_1 != null) {
			@Pc(3) Class26 local3 = Static50.aClass26_1;
			synchronized (Static50.aClass26_1) {
				Static50.aClass26_1 = null;
			}
		}
	}
}
