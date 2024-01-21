import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public static int anInt1256;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "B")
	public static byte aByte2;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_628 = Static32.method683("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!lf;")
	private static Class49 aClass49_629 = Static32.method683(")4l");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ua;I)V")
	public static void method988(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static63.anInt1351 != 1) {
			return;
		}
		if (Static114.anInt2394 >= 280 && Static114.anInt2394 <= 294 && Static61.anInt1320 >= 4 && Static61.anInt1320 <= 18) {
			Static84.method1434(0, 0);
			return;
		}
		if (Static114.anInt2394 >= 295 && Static114.anInt2394 <= 360 && Static61.anInt1320 >= 4 && Static61.anInt1320 <= 18) {
			Static84.method1434(1, 0);
			return;
		}
		if (Static114.anInt2394 >= 390 && Static114.anInt2394 <= 404 && Static61.anInt1320 >= 4 && Static61.anInt1320 <= 18) {
			Static84.method1434(0, 1);
			return;
		}
		if (Static114.anInt2394 >= 405 && Static114.anInt2394 <= 470 && Static61.anInt1320 >= 4 && Static61.anInt1320 <= 18) {
			Static84.method1434(1, 1);
			return;
		}
		if (Static114.anInt2394 >= 500 && Static114.anInt2394 <= 514 && Static61.anInt1320 >= 4 && Static61.anInt1320 <= 18) {
			Static84.method1434(0, 2);
			return;
		}
		if (Static114.anInt2394 >= 515 && Static114.anInt2394 <= 580 && Static61.anInt1320 >= 4 && Static61.anInt1320 <= 18) {
			Static84.method1434(1, 2);
			return;
		}
		if (Static114.anInt2394 >= 610 && Static114.anInt2394 <= 624 && Static61.anInt1320 >= 4 && Static61.anInt1320 <= 18) {
			Static84.method1434(0, 3);
			return;
		}
		if (Static114.anInt2394 >= 625 && Static114.anInt2394 <= 690 && Static61.anInt1320 >= 4 && Static61.anInt1320 <= 18) {
			Static84.method1434(1, 3);
			return;
		}
		if (Static114.anInt2394 >= 708 && Static61.anInt1320 >= 4 && Static114.anInt2394 <= 758 && Static61.anInt1320 <= 20) {
			Static118.aBoolean110 = false;
			Static88.aClass2_Sub2_Sub2_Sub3_4.method1544(0, 0);
			Static47.aClass2_Sub2_Sub2_Sub3_2.method1544(382, 0);
			Static140.aClass2_Sub2_Sub2_Sub2_3.method722(382 - Static140.aClass2_Sub2_Sub2_Sub2_3.anInt878 / 2, 18);
			return;
		}
		if (Static174.anInt3780 == -1) {
			return;
		}
		@Pc(268) Class28 local268 = Static148.aClass28Array1[Static174.anInt3780];
		if (Static62.aBoolean56 == local268.aBoolean43) {
			@Pc(294) byte[] local294 = Static33.method692(new Class49[] { local268.aClass49_585, Static130.aClass49_1697 }).method1674();
			Static167.aString7 = new String(local294, 0, local294.length);
			Static67.anInt1405 = local268.anInt1163;
			if (Static27.anInt594 != 0) {
				Static27.anInt594 = 0;
				Static58.anInt1235 = 443;
				Static114.anInt2376 = 43594;
				Static182.anInt4063 = 43594;
			}
			Static118.aBoolean110 = false;
			Static88.aClass2_Sub2_Sub2_Sub3_4.method1544(0, 0);
			Static47.aClass2_Sub2_Sub2_Sub3_2.method1544(382, 0);
			Static140.aClass2_Sub2_Sub2_Sub2_3.method722(382 - Static140.aClass2_Sub2_Sub2_Sub2_3.anInt878 / 2, 18);
			return;
		}
		@Pc(394) Class49 local394 = Static33.method692(new Class49[] { Static161.aClass49_1581, local268.aClass49_585, Static130.aClass49_1697, Static154.aClass49_1490, aClass49_629, Static48.method882(Static159.aBoolean148 ? 1 : 0), Static80.aClass49_1727, Static48.method882(Static177.anInt3895), Static93.aClass49_954, Static48.method882(Static123.anInt2730) });
		try {
			arg0.getAppletContext().showDocument(local394.method1656(), "_self");
			return;
		} catch (@Pc(403) Exception local403) {
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIIIII)V")
	public static void method989(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == Static94.anInt1979 && arg0 == Static155.anInt3385 && (arg4 == Static147.anInt3141 || !Static159.aBoolean148)) {
			return;
		}
		Static155.anInt3385 = arg0;
		Static147.anInt3141 = arg4;
		Static94.anInt1979 = arg1;
		if (!Static159.aBoolean148) {
			Static147.anInt3141 = 0;
		}
		Static33.method691(25);
		Static91.method1580(Static104.aClass49_1038, true);
		@Pc(42) int local42 = Static38.anInt944;
		Static38.anInt944 = arg0 * 8 - 48;
		@Pc(50) int local50 = Static49.anInt1133;
		@Pc(55) int local55 = Static38.anInt944 - local42;
		Static49.anInt1133 = (arg1 - 6) * 8;
		@Pc(68) int local68 = Static49.anInt1133 - local50;
		for (@Pc(72) int local72 = 0; local72 < 32768; local72++) {
			@Pc(78) Class2_Sub2_Sub3_Sub7_Sub1 local78 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local72];
			if (local78 != null) {
				for (@Pc(82) int local82 = 0; local82 < 10; local82++) {
					local78.anIntArray316[local82] -= local68;
					local78.anIntArray318[local82] -= local55;
				}
				local78.anInt3529 -= local68 * 128;
				local78.anInt3578 -= local55 * 128;
			}
		}
		for (@Pc(128) int local128 = 0; local128 < 2048; local128++) {
			@Pc(134) Class2_Sub2_Sub3_Sub7_Sub2 local134 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local128];
			if (local134 != null) {
				for (@Pc(138) int local138 = 0; local138 < 10; local138++) {
					local134.anIntArray316[local138] -= local68;
					local134.anIntArray318[local138] -= local55;
				}
				local134.anInt3578 -= local55 * 128;
				local134.anInt3529 -= local68 * 128;
			}
		}
		Static66.anInt1396 = arg4;
		@Pc(188) byte local188 = 0;
		@Pc(190) byte local190 = 104;
		Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.method2735(arg3, false, arg2);
		@Pc(203) byte local203 = 104;
		@Pc(205) byte local205 = 1;
		@Pc(207) byte local207 = 0;
		if (local68 < 0) {
			local190 = -1;
			local188 = 103;
			local205 = -1;
		}
		@Pc(220) byte local220 = 1;
		if (local55 < 0) {
			local207 = 103;
			local220 = -1;
			local203 = -1;
		}
		for (@Pc(230) int local230 = local188; local230 != local190; local230 += local205) {
			for (@Pc(234) int local234 = local207; local234 != local203; local234 += local220) {
				@Pc(240) int local240 = local230 + local68;
				@Pc(244) int local244 = local55 + local234;
				for (@Pc(246) int local246 = 0; local246 < 4; local246++) {
					if (local240 >= 0 && local244 >= 0 && local240 < 104 && local244 < 104) {
						Static177.aClass81ArrayArrayArray1[local246][local230][local234] = Static177.aClass81ArrayArrayArray1[local246][local240][local244];
					} else {
						Static177.aClass81ArrayArrayArray1[local246][local230][local234] = null;
					}
				}
			}
		}
		for (@Pc(316) Class2_Sub11 local316 = (Class2_Sub11) Static43.aClass81_3.method2682(); local316 != null; local316 = (Class2_Sub11) Static43.aClass81_3.method2686()) {
			local316.anInt1540 -= local55;
			local316.anInt1544 -= local68;
			if (local316.anInt1544 < 0 || local316.anInt1540 < 0 || local316.anInt1544 >= 104 || local316.anInt1540 >= 104) {
				local316.method3007();
			}
		}
		if (Static37.anInt934 != 0) {
			Static86.anInt3522 -= local55;
			Static37.anInt934 -= local68;
		}
		Static185.anInt4077 = -1;
		Static96.aBoolean84 = false;
		Static84.anInt1796 = 0;
		Static12.aClass81_1.method2689();
		Static21.aClass81_2.method2689();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
	public static void method990(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static70.anInt1438 == 2) {
			Static40.method791((Static124.anInt2747 - Static49.anInt1133 << 7) + Static7.anInt137, (Static171.anInt3745 + -Static38.anInt944 << 7) + Static72.anInt1484, Static175.anInt3805 * 2);
			if (Static161.anInt3503 > -1 && Static127.anInt2757 % 20 < 10) {
				Static121.aClass2_Sub2_Sub2_Sub3Array6[0].method1518(Static161.anInt3503 + arg1 - 12, Static165.anInt3574 + -28 + arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method991() {
		aClass49_629 = null;
		aClass49_628 = null;
	}
}
