import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!db", name = "k", descriptor = "[Lclient!cb;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!o;")
	public static Class40 aClass40_121 = Static13.method257("To cancel this request:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WCancel recovery questions(W)3");

	@OriginalMember(owner = "client!db", name = "g", descriptor = "[Lclient!o;")
	public static Class40[] aClass40Array8 = new Class40[500];

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public static int anInt432 = 0;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public static int anInt434 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method356() {
		aClass40_121 = null;
		Class15.anIntArray85 = null;
		aClass40Array8 = null;
		aClass11Array1 = null;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	public static void method357() {
		@Pc(10) int local10 = Static98.anInt2371 + Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284;
		@Pc(15) int local15 = Static104.anInt2518 + Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275;
		if (Static66.anInt1653 - local15 < -500 || Static66.anInt1653 - local15 > 500 || Static23.anInt577 - local10 < -500 || Static23.anInt577 - local10 > 500) {
			Static66.anInt1653 = local15;
			Static23.anInt577 = local10;
		}
		if (local15 != Static66.anInt1653) {
			Static66.anInt1653 += (local15 - Static66.anInt1653) / 16;
		}
		@Pc(67) int local67 = Static66.anInt1653 >> 7;
		if (local10 != Static23.anInt577) {
			Static23.anInt577 += (local10 - Static23.anInt577) / 16;
		}
		if (Static100.aBooleanArray37[96]) {
			Static35.anInt816 += (-Static35.anInt816 - 24) / 2;
		} else if (Static100.aBooleanArray37[97]) {
			Static35.anInt816 += (24 - Static35.anInt816) / 2;
		} else {
			Static35.anInt816 /= 2;
		}
		@Pc(119) int local119 = Static23.anInt577 >> 7;
		if (Static100.aBooleanArray37[98]) {
			Static79.anInt1868 += (12 - Static79.anInt1868) / 2;
		} else if (Static100.aBooleanArray37[99]) {
			Static79.anInt1868 += (-Static79.anInt1868 - 12) / 2;
		} else {
			Static79.anInt1868 /= 2;
		}
		Static93.anInt2177 += Static79.anInt1868 / 2;
		Static67.anInt1669 = Static35.anInt816 / 2 + Static67.anInt1669 & 0x7FF;
		if (Static93.anInt2177 < 128) {
			Static93.anInt2177 = 128;
		}
		@Pc(184) int local184 = 0;
		if (Static93.anInt2177 > 383) {
			Static93.anInt2177 = 383;
		}
		@Pc(197) int local197 = Static86.method1383(Static1.anInt8, Static66.anInt1653, Static23.anInt577);
		@Pc(213) int local213;
		if (local67 > 3 && local119 > 3 && local67 < 100 && local119 < 100) {
			for (local213 = local67 - 4; local213 <= local67 + 4; local213++) {
				for (@Pc(219) int local219 = local119 - 4; local219 <= local119 + 4; local219++) {
					@Pc(223) int local223 = Static1.anInt8;
					if (local223 < 3 && (Static61.aByteArrayArrayArray7[1][local213][local219] & 0x2) == 2) {
						local223++;
					}
					@Pc(249) int local249 = local197 - Static91.anIntArrayArrayArray8[local223][local213][local219];
					if (local184 < local249) {
						local184 = local249;
					}
				}
			}
		}
		local213 = local184 * 192;
		if (local213 > 98048) {
			local213 = 98048;
		}
		if (local213 < 32768) {
			local213 = 32768;
		}
		if (Static13.anInt308 < local213) {
			Static13.anInt308 += (local213 - Static13.anInt308) / 24;
		} else if (local213 < Static13.anInt308) {
			Static13.anInt308 += (local213 - Static13.anInt308) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ud;B)I")
	public static int method358(@OriginalArg(0) Class5 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method73(Static16.aClass40_110, Static30.aClass40_223)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static79.aClass40_544)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static25.aClass40_191)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static22.aClass40_734)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static10.aClass40_64)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static30.aClass40_220)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static105.aClass40_725)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static107.aClass40_718)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static46.aClass40_707)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static4.aClass40_29)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static42.aClass40_319)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static94.aClass40_632)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static67.aClass40_487)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static37.aClass40_288)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static36.aClass40_256)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static1.aClass40_3)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static107.aClass40_720)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static21.aClass40_136)) {
			local5++;
		}
		if (arg0.method73(Static16.aClass40_110, Static12.aClass40_78)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
	public static void method359() {
		Static7.method186();
		if (Static45.anInt1096 == 1) {
			Static54.aClass2_Sub2_Sub2_Sub4Array7[Static101.anInt2410 / 100].method1624(Static62.anInt1554 - 8 - 4, Static102.anInt2465 - 8 + -4);
		}
		if (Static45.anInt1096 == 2) {
			Static54.aClass2_Sub2_Sub2_Sub4Array7[Static101.anInt2410 / 100 + 4].method1624(Static62.anInt1554 - 8 - 4, Static102.anInt2465 + -8 + -4);
		}
		if (Static3.anInt51 != -1) {
			Static27.method533(Static3.anInt51);
			Static21.method403(0, -1, Static3.anInt51, 4, 0, 334, 0, 512);
		}
		if (Static22.anInt2585 != -1) {
			Static27.method533(Static22.anInt2585);
			Static21.method403(0, -1, Static22.anInt2585, 0, 0, 334, 0, 512);
		}
		Static43.method1239();
		if (!Static97.aBoolean175) {
			Static20.method389();
			Static5.method115();
		} else if (Static1.anInt16 == 0) {
			Static23.method480();
		}
		if (Static107.anInt2505 == 1) {
			Static43.aClass2_Sub2_Sub2_Sub4_7.method1624(472, 296);
		}
		@Pc(158) int local158;
		if (Static96.aBoolean173) {
			@Pc(118) byte local118 = 20;
			@Pc(120) int local120 = 16776960;
			if (Static70.anInt1695 < 30 && Static1.aBoolean2) {
				local120 = 16711680;
			}
			if (Static70.anInt1695 < 20 && !Static1.aBoolean2) {
				local120 = 16711680;
			}
			Static103.aClass2_Sub2_Sub2_Sub2_5.method572(Static80.method1334(new Class40[] { Static98.aClass40_676, Static53.method859(Static70.anInt1695) }), 20, local120);
			local120 = 16776960;
			local158 = local118 + 15;
			@Pc(160) Runtime local160 = Runtime.getRuntime();
			@Pc(170) int local170 = (int) ((local160.totalMemory() - local160.freeMemory()) / 1024L);
			if (local170 > 32768 && Static1.aBoolean2) {
				local120 = 16711680;
			}
			if (local170 > 65536 && !Static1.aBoolean2) {
				local120 = 16711680;
			}
			Static103.aClass2_Sub2_Sub2_Sub2_5.method572(Static80.method1334(new Class40[] { Static5.aClass40_44, Static53.method859(local170), Static97.aClass40_668 }), 35, local120);
			local158 += 15;
			if (Static5.aBoolean13) {
				Static103.aClass2_Sub2_Sub2_Sub2_5.method572(Static22.aClass40_735, 50, 16711680);
				local158 += 15;
				Static5.aBoolean13 = false;
			}
			if (Static7.aBoolean23) {
				Static103.aClass2_Sub2_Sub2_Sub2_5.method572(Static66.aClass40_481, local158, 16711680);
				Static7.aBoolean23 = false;
				local158 += 15;
			}
			if (Static92.aBoolean165) {
				Static103.aClass2_Sub2_Sub2_Sub2_5.method572(Static60.aClass40_435, local158, 16711680);
				local158 += 15;
				Static92.aBoolean165 = false;
			}
		}
		if (Static84.anInt1973 == 0) {
			return;
		}
		@Pc(254) int local254 = Static84.anInt1973 / 50;
		local158 = local254 / 60;
		@Pc(262) int local262 = local254 % 60;
		if (local262 >= 10) {
			Static103.aClass2_Sub2_Sub2_Sub2_5.method575(Static80.method1334(new Class40[] { Static92.aClass40_618, Static53.method859(local158), Static97.aClass40_673, Static53.method859(local262) }), 4, 329, 16776960);
		} else {
			Static103.aClass2_Sub2_Sub2_Sub2_5.method575(Static80.method1334(new Class40[] { Static92.aClass40_618, Static53.method859(local158), Static20.aClass40_135, Static53.method859(local262) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!eb;I)Lclient!o;")
	public static Class40 method360(@OriginalArg(1) Class2_Sub3 arg0) {
		try {
			@Pc(12) Class40 local12 = new Class40();
			local12.anInt1783 = arg0.method1698();
			if (local12.anInt1783 > 32767) {
				local12.anInt1783 = 32767;
			}
			local12.aByteArray14 = new byte[local12.anInt1783];
			arg0.anInt2546 += Static97.aClass42_1.method1212(0, local12.anInt1783, arg0.anInt2546, arg0.aByteArray24, local12.aByteArray14);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return Static85.aClass40_574;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
	public static int method361() {
		@Pc(5) int local5 = Static86.method1383(Static1.anInt8, Static48.anInt1114, Static15.anInt1863);
		return local5 - Static81.anInt1935 >= 800 || (Static61.aByteArrayArrayArray7[Static1.anInt8][Static48.anInt1114 >> 7][Static15.anInt1863 >> 7] & 0x4) == 0 ? 3 : Static1.anInt8;
	}
}
