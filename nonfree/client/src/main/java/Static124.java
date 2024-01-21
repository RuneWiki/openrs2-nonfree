import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!vc", name = "mb", descriptor = "I")
	public static int anInt2863;

	@OriginalMember(owner = "client!vc", name = "nb", descriptor = "I")
	public static int anInt2864;

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
	public static int anInt2853 = 0;

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1678 = Static106.method1849("Loading wordpack )2 ");

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
	public static int anInt2858 = 0;

	@OriginalMember(owner = "client!vc", name = "db", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1679 = aClass66_1678;

	@OriginalMember(owner = "client!vc", name = "hb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1680 = Static106.method1849("Welt");

	@OriginalMember(owner = "client!vc", name = "ib", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[250][];

	@OriginalMember(owner = "client!vc", name = "jb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1681 = Static106.method1849("null");

	@OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
	public static int anInt2862 = 255;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	public static void method2007() {
		aClass66_1681 = null;
		aClass66_1679 = null;
		Class1_Sub1_Sub17.anIntArray492 = null;
		aByteArrayArray10 = null;
		aClass66_1678 = null;
		aClass66_1680 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!sf;Lclient!sc;Lclient!sc;)Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3 method2009(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) Class66 arg2) {
		@Pc(8) int local8 = arg0.method122(arg2);
		@Pc(19) int local19 = arg0.method116(local8, arg1);
		return Static90.method1289(local19, local8, arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
	public static void method2010(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static115.method1659(arg0, arg2, arg3 + arg0, arg2 - -arg1);
		Static91.method1689();
		Static45.anInt1444++;
		Static8.method299(true);
		Static34.method73(true);
		Static8.method299(false);
		Static34.method73(false);
		Static94.method1712();
		Static43.method950();
		@Pc(44) int local44;
		if (!Static109.aBoolean111) {
			local44 = Static86.anInt2293 + Static75.anInt2076 & 0x7FF;
			@Pc(46) int local46 = Static65.anInt1950;
			if (local46 < Static2.anInt89 / 256) {
				local46 = Static2.anInt89 / 256;
			}
			if (Static63.aBooleanArray12[4] && local46 < Static22.anIntArray94[4] + 128) {
				local46 = Static22.anIntArray94[4] + 128;
			}
			Static13.method397(Static77.method1476(Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271, Static22.anInt635, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261) - 50, local46 * 3 + 600, local44, local46, Static90.anInt1840, Static65.anInt1954);
		}
		if (Static109.aBoolean111) {
			local44 = Static50.method1077();
		} else {
			local44 = Static114.method1926();
		}
		@Pc(116) int local116 = Static51.anInt1580;
		@Pc(118) int local118 = Static1.anInt70;
		@Pc(120) int local120 = Static122.anInt2830;
		@Pc(122) int local122 = Static1.anInt76;
		@Pc(124) int local124 = Static131.anInt2696;
		@Pc(167) int local167;
		for (@Pc(126) int local126 = 0; local126 < 5; local126++) {
			if (Static63.aBooleanArray12[local126]) {
				local167 = (int) ((double) (Static74.anIntArray331[local126] * 2 + 1) * Math.random() - (double) Static74.anIntArray331[local126] + Math.sin((double) Static18.anIntArray82[local126] * ((double) Static134.anIntArray503[local126] / 100.0D)) * (double) Static22.anIntArray94[local126]);
				if (local126 == 0) {
					Static122.anInt2830 += local167;
				}
				if (local126 == 3) {
					Static1.anInt76 = local167 + Static1.anInt76 & 0x7FF;
				}
				if (local126 == 1) {
					Static51.anInt1580 += local167;
				}
				if (local126 == 2) {
					Static1.anInt70 += local167;
				}
				if (local126 == 4) {
					Static131.anInt2696 += local167;
					if (Static131.anInt2696 < 128) {
						Static131.anInt2696 = 128;
					}
					if (Static131.anInt2696 > 383) {
						Static131.anInt2696 = 383;
					}
				}
			}
		}
		local167 = Static50.anInt1542;
		@Pc(226) int local226 = Static13.anInt462;
		if (arg0 <= local167 && local167 < arg3 + arg0 && arg2 <= local226 && arg1 + arg2 > local226) {
			Static62.aBoolean76 = true;
			Static62.anInt1911 = Static13.anInt462 - arg2;
			Static62.anInt1912 = 0;
			Static62.anInt1910 = Static50.anInt1542 - arg0;
		} else {
			Static62.anInt1912 = 0;
			Static62.aBoolean76 = false;
		}
		Static5.method159();
		Static115.method1670(arg0, arg2, arg3, arg1, 0);
		Static5.method159();
		Static129.aClass9_1.method322(Static122.anInt2830, Static51.anInt1580, Static1.anInt70, Static131.anInt2696, Static1.anInt76, local44);
		Static5.method159();
		Static129.aClass9_1.method347();
		Static44.method967(arg1, arg0, arg3, arg2);
		Static125.method2017(arg0, arg2);
		((Class57) Static91.anInterface2_1).method1703(Static130.anInt2924);
		Static13.method396(arg0, arg3, arg2, arg1);
		Static131.anInt2696 = local124;
		Static122.anInt2830 = local120;
		Static51.anInt1580 = local116;
		Static1.anInt76 = local122;
		Static1.anInt70 = local118;
		if (Static74.aBoolean80 && Static14.method405() == 0) {
			Static74.aBoolean80 = false;
		}
		if (Static74.aBoolean80) {
			Static115.method1670(arg0, arg2, arg3, arg1, 0);
			Static49.method1060(false, Static20.aClass66_371);
		}
		if (!Static74.aBoolean80 && !Static112.aBoolean113 && arg0 <= local167 && arg3 + arg0 > local167 && arg2 <= local226 && local226 < arg1 + arg2) {
			Static63.method1354(arg2, arg0, local167, local226);
		}
	}
}
