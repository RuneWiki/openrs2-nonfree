import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	public static int anInt1257;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public static int anInt1242 = -1;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public static int anInt1243 = 0;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public static int anInt1244 = 0;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!kc;")
	public static Class36 aClass36_625 = Static14.method2017("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!kc;")
	public static Class36 aClass36_626 = Static14.method2017("Verbindung mit");

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "Lclient!kc;")
	private static Class36 aClass36_628 = Static14.method2017("Hide");

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Lclient!kc;")
	public static Class36 aClass36_627 = aClass36_628;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Lclient!vc;")
	public static Class67 aClass67_1 = new Class67();

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "[I")
	public static int[] anIntArray168 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_629 = Static14.method2017("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "[I")
	public static int[] anIntArray169 = new int[1000];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ac;II)Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 method913(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
		return Static79.method1489(arg0, arg1) ? Static49.method959() : null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method914() {
		aClass36_625 = null;
		aClass36_628 = null;
		aClass36_626 = null;
		anIntArray169 = null;
		aClass36_629 = null;
		anIntArray168 = null;
		aClass67_1 = null;
		aClass36_627 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)Z")
	public static boolean method915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = arg2 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static85.aClass61_1.method1699(Static92.anInt2412, arg1, arg0, arg2);
		if (local18 == -1) {
			return false;
		}
		@Pc(29) int local29 = local18 >> 6 & 0x3;
		@Pc(33) int local33 = local18 & 0x1F;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(72) Class2_Sub1_Sub13 local72 = Static2.method2072(local11);
			@Pc(86) int local86;
			@Pc(83) int local83;
			if (local29 == 0 || local29 == 2) {
				local83 = local72.anInt2288;
				local86 = local72.anInt2326;
			} else {
				local86 = local72.anInt2288;
				local83 = local72.anInt2326;
			}
			@Pc(97) int local97 = local72.anInt2304;
			if (local29 != 0) {
				local97 = (local97 >> 4 - local29) + (local97 << local29 & 0xF);
			}
			Static29.method623(local83, 0, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], local86, arg1, 2, arg0, 0, true, local97, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
		} else {
			Static29.method623(0, local33 + 1, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 0, arg1, 2, arg0, local29, true, 0, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
		}
		Static40.anInt2190 = Static59.anInt1578;
		Static7.anInt193 = 2;
		Static15.anInt313 = Static90.anInt2349;
		Static92.anInt2411 = 0;
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method916() {
		@Pc(5) Class32 local5 = Static52.aClass32_1;
		synchronized (Static52.aClass32_1) {
			Static73.anInt1843 = Static95.anInt2531;
			Static115.anInt1789 = Static100.anInt2620;
			Static64.anInt1640 = Static105.anInt2732;
			Static95.anInt2522 = Static71.anInt1811;
			Static59.anInt1578 = Static6.anInt162;
			Static90.anInt2349 = Static117.anInt1917;
			Static83.aLong66 = Static94.aLong74;
			Static71.anInt1811 = 0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V")
	public static void method917(@OriginalArg(1) boolean arg0) {
		Static108.aBoolean130 = arg0;
		@Pc(17) int local17;
		@Pc(23) int local23;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(159) int local159;
		@Pc(163) int local163;
		@Pc(167) int local167;
		if (!Static108.aBoolean130) {
			local17 = Static92.aClass2_Sub12_Sub1_3.method1413();
			local23 = Static92.aClass2_Sub12_Sub1_3.method1366();
			local27 = Static92.aClass2_Sub12_Sub1_3.method1378();
			local31 = Static92.aClass2_Sub12_Sub1_3.method1378();
			local36 = (Static111.anInt2876 - Static92.aClass2_Sub12_Sub1_3.anInt1939) / 16;
			Static83.anIntArrayArray25 = new int[local36][4];
			for (local40 = 0; local40 < local36; local40++) {
				for (local44 = 0; local44 < 4; local44++) {
					Static83.anIntArrayArray25[local40][local44] = Static92.aClass2_Sub12_Sub1_3.method1367();
				}
			}
			local44 = Static92.aClass2_Sub12_Sub1_3.method1391();
			Static36.anIntArray131 = new int[local36];
			Static15.aByteArrayArray7 = new byte[local36][];
			@Pc(390) boolean local390 = false;
			Static20.anIntArray32 = new int[local36];
			Static26.anIntArray58 = new int[local36];
			Static33.aByteArrayArray9 = new byte[local36][];
			local36 = 0;
			if ((local27 / 8 == 48 || local27 / 8 == 49) && (local31 / 8) == 48) {
				local390 = true;
			}
			if (local27 / 8 == 48 && local31 / 8 == 148) {
				local390 = true;
			}
			for (local159 = (local27 - 6) / 8; local159 <= (local27 + 6) / 8; local159++) {
				for (local163 = (local31 - 6) / 8; local163 <= (local31 + 6) / 8; local163++) {
					local167 = (local159 << 8) + local163;
					if (!local390 || local163 != 49 && local163 != 149 && local163 != 147 && local159 != 50 && (local159 != 49 || local163 != 47)) {
						Static20.anIntArray32[local36] = local167;
						Static26.anIntArray58[local36] = Static110.aClass3_Sub1_13.method932(Static49.method949(new Class36[] { Static106.aClass36_1336, Static57.method1055(local159), Static113.aClass36_1448, Static57.method1055(local163) }));
						Static36.anIntArray131[local36] = Static110.aClass3_Sub1_13.method932(Static49.method949(new Class36[] { Static56.aClass36_708, Static57.method1055(local159), Static113.aClass36_1448, Static57.method1055(local163) }));
						local36++;
					}
				}
			}
			Static16.method293(local17, local23, local27, local31, local44);
			return;
		}
		local17 = Static92.aClass2_Sub12_Sub1_3.method1378();
		local23 = Static92.aClass2_Sub12_Sub1_3.method1378();
		local27 = Static92.aClass2_Sub12_Sub1_3.method1391();
		local31 = Static92.aClass2_Sub12_Sub1_3.method1366();
		Static92.aClass2_Sub12_Sub1_3.method1427();
		@Pc(51) int local51;
		for (local36 = 0; local36 < 4; local36++) {
			for (local40 = 0; local40 < 13; local40++) {
				for (local44 = 0; local44 < 13; local44++) {
					local51 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
					if (local51 == 1) {
						Static51.anIntArrayArrayArray9[local36][local40][local44] = Static92.aClass2_Sub12_Sub1_3.method1418(26);
					} else {
						Static51.anIntArrayArrayArray9[local36][local40][local44] = -1;
					}
				}
			}
		}
		Static92.aClass2_Sub12_Sub1_3.method1425();
		local40 = (Static111.anInt2876 - Static92.aClass2_Sub12_Sub1_3.anInt1939) / 16;
		Static83.anIntArrayArray25 = new int[local40][4];
		for (local44 = 0; local44 < local40; local44++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static83.anIntArrayArray25[local44][local51] = Static92.aClass2_Sub12_Sub1_3.method1372();
			}
		}
		local51 = Static92.aClass2_Sub12_Sub1_3.method1378();
		Static36.anIntArray131 = new int[local40];
		Static20.anIntArray32 = new int[local40];
		Static26.anIntArray58 = new int[local40];
		Static33.aByteArrayArray9 = new byte[local40][];
		Static15.aByteArrayArray7 = new byte[local40][];
		local40 = 0;
		for (local159 = 0; local159 < 4; local159++) {
			for (local163 = 0; local163 < 13; local163++) {
				for (local167 = 0; local167 < 13; local167++) {
					@Pc(177) int local177 = Static51.anIntArrayArrayArray9[local159][local163][local167];
					if (local177 != -1) {
						@Pc(186) int local186 = local177 >> 14 & 0x3FF;
						@Pc(192) int local192 = local177 >> 3 & 0x7FF;
						@Pc(203) int local203 = (local186 / 8 << 8) + (local192 / 8);
						for (@Pc(205) int local205 = 0; local205 < local40; local205++) {
							if (Static20.anIntArray32[local205] == local203) {
								local203 = -1;
								break;
							}
						}
						if (local203 != -1) {
							Static20.anIntArray32[local40] = local203;
							@Pc(233) int local233 = local203 >> 8 & 0xFF;
							@Pc(237) int local237 = local203 & 0xFF;
							Static26.anIntArray58[local40] = Static110.aClass3_Sub1_13.method932(Static49.method949(new Class36[] { Static106.aClass36_1336, Static57.method1055(local233), Static113.aClass36_1448, Static57.method1055(local237) }));
							Static36.anIntArray131[local40] = Static110.aClass3_Sub1_13.method932(Static49.method949(new Class36[] { Static56.aClass36_708, Static57.method1055(local233), Static113.aClass36_1448, Static57.method1055(local237) }));
							local40++;
						}
					}
				}
			}
		}
		Static16.method293(local23, local17, local51, local31, local27);
	}
}
