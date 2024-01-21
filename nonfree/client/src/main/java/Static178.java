import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
	public static int anInt4248;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1627 = Static169.method2903(")1p");

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1628 = Static169.method2903("Fallen lassen");

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "[I")
	public static int[] anIntArray592 = new int[500];

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
	public static int anInt4245 = -1;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	public static int anInt4247 = -1;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!mf;I)V")
	public static void method3065(@OriginalArg(0) Class1_Sub13 arg0) {
		Static124.method2202(200000, arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method3066() {
		aClass23_1627 = null;
		aClass23_1628 = null;
		anIntArray592 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
	public static void method3067(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static38.method622();
		Static150.method3022(arg1, arg0, Static127.aClass1_Sub1_Sub12_Sub4_5.anInt3905 + arg1, arg0 - -Static127.aClass1_Sub1_Sub12_Sub4_5.anInt3907);
		if (Static107.anInt2752 == 2 || Static107.anInt2752 == 5) {
			Static150.method3034(arg1 + 25, arg0 + 5, Static166.anIntArray554, Static82.anIntArray283);
		} else {
			@Pc(36) int local36 = Static179.anInt4264 + Static127.anInt3355 & 0x7FF;
			@Pc(44) int local44 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 / 32 + 48;
			@Pc(52) int local52 = 464 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 / 32;
			Static8.aClass1_Sub1_Sub12_Sub1_1.method1945(arg1 + 25, arg0 + 5, 146, 151, local44, local52, local36, Static49.anInt1423 + 256, Static166.anIntArray554, Static82.anIntArray283);
			@Pc(89) int local89;
			@Pc(103) int local103;
			for (@Pc(73) int local73 = 0; local73 < Static35.anInt969; local73++) {
				local89 = Static127.anIntArray441[local73] * 4 + 2 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 / 32;
				local103 = Static129.anIntArray445[local73] * 4 + 2 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 / 32;
				Static156.method2640(local103, Static98.aClass1_Sub1_Sub12_Sub1Array5[local73], arg1, arg0, local89);
			}
			@Pc(150) int local150;
			@Pc(162) int local162;
			for (local89 = 0; local89 < 104; local89++) {
				for (local103 = 0; local103 < 104; local103++) {
					@Pc(136) Class56 local136 = Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local89][local103];
					if (local136 != null) {
						local150 = local89 * 4 + 2 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 / 32;
						local162 = local103 * 4 + 2 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 / 32;
						Static156.method2640(local162, Static164.aClass1_Sub1_Sub12_Sub1Array10[0], arg1, arg0, local150);
					}
				}
			}
			@Pc(239) int local239;
			for (local103 = 0; local103 < Static86.anInt2307; local103++) {
				@Pc(189) Class1_Sub1_Sub1_Sub1_Sub2 local189 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static141.anIntArray476[local103]];
				if (local189 != null && local189.method1222()) {
					@Pc(200) Class1_Sub1_Sub9 local200 = local189.aClass1_Sub1_Sub9_1;
					if (local200 != null && local200.anIntArray174 != null) {
						local200 = local200.method986();
					}
					if (local200 != null && local200.aBoolean68 && local200.aBoolean66) {
						local162 = local189.anInt1838 / 32 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 / 32;
						local239 = local189.anInt1825 / 32 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 / 32;
						Static156.method2640(local239, Static164.aClass1_Sub1_Sub12_Sub1Array10[1], arg1, arg0, local162);
					}
				}
			}
			@Pc(262) Class1_Sub1_Sub1_Sub1_Sub1 local262;
			for (@Pc(254) int local254 = 0; local254 < Static152.anInt3549; local254++) {
				local262 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static112.anIntArray382[local254]];
				if (local262 != null && local262.method1222()) {
					local162 = local262.anInt1838 / 32 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 / 32;
					@Pc(283) boolean local283 = false;
					local239 = local262.anInt1825 / 32 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 / 32;
					@Pc(301) long local301 = local262.aClass23_68.method643();
					for (@Pc(303) int local303 = 0; local303 < Static37.anInt996; local303++) {
						if (Static106.aLongArray5[local303] == local301 && Static72.anIntArray264[local303] != 0) {
							local283 = true;
							break;
						}
					}
					@Pc(325) boolean local325 = false;
					if (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt206 != 0 && local262.anInt206 != 0 && Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt206 == local262.anInt206) {
						local325 = true;
					}
					if (local283) {
						Static156.method2640(local239, Static164.aClass1_Sub1_Sub12_Sub1Array10[3], arg1, arg0, local162);
					} else if (local325) {
						Static156.method2640(local239, Static164.aClass1_Sub1_Sub12_Sub1Array10[4], arg1, arg0, local162);
					} else {
						Static156.method2640(local239, Static164.aClass1_Sub1_Sub12_Sub1Array10[2], arg1, arg0, local162);
					}
				}
			}
			if (Static7.anInt328 != 0 && Static26.anInt845 % 20 < 10) {
				if (Static7.anInt328 == 1 && Static153.anInt3783 >= 0 && Static153.anInt3783 < Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(413) Class1_Sub1_Sub1_Sub1_Sub2 local413 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[Static153.anInt3783];
					if (local413 != null) {
						local162 = local413.anInt1838 / 32 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 / 32;
						local239 = local413.anInt1825 / 32 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 / 32;
						Static107.method1846(arg1, local162, arg0, Static123.aClass1_Sub1_Sub12_Sub1Array7[1], local239);
					}
				}
				if (Static7.anInt328 == 2) {
					local150 = (Static105.anInt2702 - Static152.anInt3545) * 4 + 2 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 / 32;
					local162 = (-Static75.anInt2039 + Static127.anInt3360) * 4 + 2 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 / 32;
					Static107.method1846(arg1, local150, arg0, Static123.aClass1_Sub1_Sub12_Sub1Array7[1], local162);
				}
				if (Static7.anInt328 == 10 && Static147.anInt3708 >= 0 && Static147.anInt3708 < Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length) {
					local262 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static147.anInt3708];
					if (local262 != null) {
						local162 = local262.anInt1838 / 32 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 / 32;
						local239 = local262.anInt1825 / 32 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 / 32;
						Static107.method1846(arg1, local162, arg0, Static123.aClass1_Sub1_Sub12_Sub1Array7[1], local239);
					}
				}
			}
			if (Static111.anInt2840 != 0) {
				local150 = Static111.anInt2840 * 4 + 2 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838 / 32;
				local162 = Static32.anInt934 * 4 + 2 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825 / 32;
				Static156.method2640(local162, Static123.aClass1_Sub1_Sub12_Sub1Array7[0], arg1, arg0, local150);
			}
			Static150.method3024(arg1 + 97, arg0 + -4 - -82, 3, 3, 16777215);
		}
		if (Static107.anInt2752 >= 3) {
			Static150.method3034(arg1, arg0, Static75.anIntArray268, Static153.anIntArray508);
		} else {
			Static98.aClass1_Sub1_Sub12_Sub1_5.method1945(arg1, arg0, 33, 33, 25, 25, Static127.anInt3355, 256, Static75.anIntArray268, Static153.anIntArray508);
		}
		if (Static8.aBooleanArray3[arg2]) {
			Static127.aClass1_Sub1_Sub12_Sub4_5.method2746(arg1, arg0);
		}
		Static18.aBooleanArray5[arg2] = true;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public static void method3068() {
		if (Static93.aClass51_1 != null) {
			@Pc(11) Class51 local11 = Static93.aClass51_1;
			synchronized (Static93.aClass51_1) {
				Static93.aClass51_1 = null;
			}
		}
	}
}
