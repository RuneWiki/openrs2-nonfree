import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "Lclient!lc;")
	public static Class40 aClass40_76;

	@OriginalMember(owner = "client!rf", name = "K", descriptor = "Lclient!q;")
	public static Class4_Sub17 aClass4_Sub17_13;

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
	public static int anInt2500;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "Lclient!mf;")
	public static Class48 aClass48_58 = new Class48(260);

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1007 = Static121.method2047("FULL");

	@OriginalMember(owner = "client!rf", name = "I", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1006 = aClass60_1007;

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "[Lclient!qc;")
	public static Class60[] aClass60Array23 = new Class60[100];

	@OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
	public static int anInt2501 = 0;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1008 = Static121.method2047("leuchten2:");

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIZ)I")
	public static int method1821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 31;
		return (local3 + arg1) / arg0 - local3;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)V")
	public static void method1822(@OriginalArg(1) boolean arg0) {
		Static126.aBoolean124 = arg0;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(150) int local150;
		if (!Static126.aBoolean124) {
			local18 = Static105.aClass4_Sub13_Sub1_3.method1244();
			local22 = Static105.aClass4_Sub13_Sub1_3.method1223();
			local30 = (Static78.anInt1911 - Static105.aClass4_Sub13_Sub1_3.anInt1643) / 16;
			Static120.anIntArrayArray17 = new int[local30][4];
			for (local36 = 0; local36 < local30; local36++) {
				for (local40 = 0; local40 < 4; local40++) {
					Static120.anIntArrayArray17[local36][local40] = Static105.aClass4_Sub13_Sub1_3.method1253();
				}
			}
			local40 = Static105.aClass4_Sub13_Sub1_3.method1232();
			local66 = Static105.aClass4_Sub13_Sub1_3.method1210();
			local70 = Static105.aClass4_Sub13_Sub1_3.method1236();
			Static71.anIntArray186 = new int[local30];
			Static72.anIntArray187 = new int[local30];
			Static112.aByteArrayArray9 = new byte[local30][];
			Static11.aByteArrayArray2 = new byte[local30][];
			@Pc(84) boolean local84 = false;
			Static6.anIntArray8 = new int[local30];
			local30 = 0;
			if ((local40 / 8 == 48 || local40 / 8 == 49) && (local70 / 8) == 48) {
				local84 = true;
			}
			if (local40 / 8 == 48 && local70 / 8 == 148) {
				local84 = true;
			}
			for (local134 = (local40 - 6) / 8; local134 <= (local40 + 6) / 8; local134++) {
				for (local142 = (local70 - 6) / 8; local142 <= (local70 + 6) / 8; local142++) {
					local150 = (local134 << 8) + local142;
					if (!local84 || local142 != 49 && local142 != 149 && local142 != 147 && local134 != 50 && (local134 != 49 || local142 != 47)) {
						Static6.anIntArray8[local30] = local150;
						Static71.anIntArray186[local30] = Static119.aClass40_Sub1_20.method1107(Static125.method2072(new Class60[] { Static27.aClass60_310, Static120.method1450(local134), Static128.aClass60_1064, Static120.method1450(local142) }));
						Static72.anIntArray187[local30] = Static119.aClass40_Sub1_20.method1107(Static125.method2072(new Class60[] { Static35.aClass60_382, Static120.method1450(local134), Static128.aClass60_1064, Static120.method1450(local142) }));
						local30++;
					}
				}
			}
			Static90.method1544(local18, local70, local40, local66, local22);
			return;
		}
		local18 = Static105.aClass4_Sub13_Sub1_3.method1236();
		local22 = Static105.aClass4_Sub13_Sub1_3.method1244();
		local30 = Static105.aClass4_Sub13_Sub1_3.method1223();
		local36 = Static105.aClass4_Sub13_Sub1_3.method1236();
		Static105.aClass4_Sub13_Sub1_3.method1263();
		@Pc(315) int local315;
		for (local40 = 0; local40 < 4; local40++) {
			for (local66 = 0; local66 < 13; local66++) {
				for (local70 = 0; local70 < 13; local70++) {
					local315 = Static105.aClass4_Sub13_Sub1_3.method1260(1);
					if (local315 == 1) {
						Static61.anIntArrayArrayArray6[local40][local66][local70] = Static105.aClass4_Sub13_Sub1_3.method1260(26);
					} else {
						Static61.anIntArrayArrayArray6[local40][local66][local70] = -1;
					}
				}
			}
		}
		Static105.aClass4_Sub13_Sub1_3.method1258();
		local66 = (Static78.anInt1911 - Static105.aClass4_Sub13_Sub1_3.anInt1643) / 16;
		Static120.anIntArrayArray17 = new int[local66][4];
		for (local70 = 0; local70 < local66; local70++) {
			for (local315 = 0; local315 < 4; local315++) {
				Static120.anIntArrayArray17[local70][local315] = Static105.aClass4_Sub13_Sub1_3.method1234();
			}
		}
		local315 = Static105.aClass4_Sub13_Sub1_3.method1244();
		Static72.anIntArray187 = new int[local66];
		Static71.anIntArray186 = new int[local66];
		Static6.anIntArray8 = new int[local66];
		Static112.aByteArrayArray9 = new byte[local66][];
		Static11.aByteArrayArray2 = new byte[local66][];
		local66 = 0;
		for (local134 = 0; local134 < 4; local134++) {
			for (local142 = 0; local142 < 13; local142++) {
				for (local150 = 0; local150 < 13; local150++) {
					@Pc(441) int local441 = Static61.anIntArrayArrayArray6[local134][local142][local150];
					if (local441 != -1) {
						@Pc(451) int local451 = local441 >> 14 & 0x3FF;
						@Pc(457) int local457 = local441 >> 3 & 0x7FF;
						@Pc(468) int local468 = (local451 / 8 << 8) + (local457 / 8);
						for (@Pc(470) int local470 = 0; local470 < local66; local470++) {
							if (Static6.anIntArray8[local470] == local468) {
								local468 = -1;
								break;
							}
						}
						if (local468 != -1) {
							Static6.anIntArray8[local66] = local468;
							@Pc(502) int local502 = local468 >> 8 & 0xFF;
							@Pc(506) int local506 = local468 & 0xFF;
							Static71.anIntArray186[local66] = Static119.aClass40_Sub1_20.method1107(Static125.method2072(new Class60[] { Static27.aClass60_310, Static120.method1450(local502), Static128.aClass60_1064, Static120.method1450(local506) }));
							Static72.anIntArray187[local66] = Static119.aClass40_Sub1_20.method1107(Static125.method2072(new Class60[] { Static35.aClass60_382, Static120.method1450(local502), Static128.aClass60_1064, Static120.method1450(local506) }));
							local66++;
						}
					}
				}
			}
		}
		Static90.method1544(local36, local315, local22, local18, local30);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public static void method1823() {
		aClass60_1007 = null;
		aClass60_1008 = null;
		aClass40_76 = null;
		aClass60Array23 = null;
		aClass60_1006 = null;
		aClass48_58 = null;
		aClass4_Sub17_13 = null;
	}
}
