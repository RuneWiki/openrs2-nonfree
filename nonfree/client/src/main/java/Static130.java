import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_20;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "[Lclient!lg;")
	public static Class2_Sub2_Sub17_Sub1[] aClass2_Sub2_Sub17_Sub1Array1;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "[Lclient!nb;")
	public static Class2_Sub2_Sub17[] aClass2_Sub2_Sub17Array7;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_837 = Static181.method2795("Welcome to RuneScape");

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "Lclient!qe;")
	public static Class83 aClass83_835 = aClass83_837;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public static int anInt2830 = 0;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_836 = Static181.method2795("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
	public static int anInt2835 = 0;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_838 = Static181.method2795(" <col=00ff80>");

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public static void method2181() {
		if (!Static69.aBoolean85) {
			return;
		}
		Static93.aClass2_Sub2_Sub17_Sub1_3 = null;
		Static166.anIntArray322 = null;
		Static44.anIntArray91 = null;
		Static116.aClass29Array5 = null;
		Static52.anIntArray105 = null;
		Static192.aClass29_4 = null;
		Static106.anIntArray239 = null;
		Static111.anIntArray254 = null;
		Static184.aClass29_3 = null;
		Static69.aClass29_1 = null;
		Static174.aClass2_Sub2_Sub17_Sub1_4 = null;
		Static142.aClass29_Sub1Array2 = null;
		Static197.anIntArray377 = null;
		Static90.anIntArray200 = null;
		Static188.aClass2_Sub2_Sub17_Sub1_5 = null;
		Static27.aClass2_Sub2_Sub17_Sub1_2 = null;
		Static18.aClass2_Sub2_Sub17Array6 = null;
		Static95.aClass29_2 = null;
		Static6.aClass29Array1 = null;
		Static26.anIntArray45 = null;
		Static204.aClass29Array9 = null;
		Static149.aClass29Array6 = null;
		Static123.method2103();
		Static46.method855(true);
		Static69.aBoolean85 = false;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!eh;I)Lclient!fc;")
	public static Class29 method2182(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1) {
		return Static161.method222(arg1, arg0) ? Static74.method1403() : null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lclient!pd;")
	public static Class78 method2183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3554; local13++) {
			@Pc(19) Class78 local19 = local7.aClass78Array3[local13];
			if ((local19.aLong107 >> 29 & 0x3L) == 2L && local19.anInt3028 == arg1 && local19.anInt3036 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	public static void method2185() {
		if (Static69.aClass83_514 == null) {
			return;
		}
		if (Static83.anInt1856 < 10) {
			if (!Static97.aClass28_Sub1_14.method856(Static69.aClass83_514)) {
				Static83.anInt1856 = Static97.aClass28_Sub1_14.method857(Static69.aClass83_514) / 10;
				return;
			}
			Static83.anInt1856 = 10;
		}
		if (Static83.anInt1856 == 10) {
			@Pc(40) Class2_Sub3 local40 = new Class2_Sub3(Static97.aClass28_Sub1_14.method860(Static69.aClass83_514, Static105.aClass83_700));
			@Pc(44) int local44 = local40.method269();
			@Pc(48) int local48 = local40.method269();
			@Pc(52) int local52 = local40.method269();
			@Pc(56) int local56 = local40.method269();
			@Pc(60) int local60 = local40.method269();
			@Pc(64) int local64 = local40.method269();
			Static127.anInt2810 = (local52 + 1 - local44) * 64;
			Static135.anIntArray289 = new int[Static17.anInt497 + 1];
			Static131.aDouble11 = 8.0D;
			Static49.aDouble10 = 8.0D;
			Static154.anInt3114 = local44 * 64;
			Static57.anInt1431 = local48 * 64;
			@Pc(100) int local100 = (Static54.aClass24_Sub4_Sub1_1.anInt3316 >> 7) + Static2.anInt57 - Static154.anInt3114;
			@Pc(104) int local104 = Static127.anInt2810 >> 6;
			Static177.anInt3615 = (local56 + 1 - local48) * 64;
			@Pc(122) int local122 = local100 + (int) (Math.random() * 10.0D) - 5;
			@Pc(132) int local132 = Static123.anInt2755 + (Static54.aClass24_Sub4_Sub1_1.anInt3349 >> 7) - Static57.anInt1431;
			@Pc(141) int local141 = local132 + (int) (Math.random() * 10.0D) - 5;
			if (local122 >= 0 && Static127.anInt2810 > local122 && local141 >= 0 && Static177.anInt3615 > local141) {
				Static62.anInt1512 = Static177.anInt3615 - local141;
				Static143.anInt3007 = local122;
			} else {
				Static143.anInt3007 = local60 * 64 - Static154.anInt3114;
				Static62.anInt1512 = Static57.anInt1431 + Static177.anInt3615 - local64 * 64;
			}
			@Pc(190) int local190 = Static177.anInt3615 >> 6;
			Static89.aByteArrayArrayArray95 = new byte[local104][local190][];
			Static29.anIntArrayArrayArray2 = new int[local104][local190][];
			Static89.aByteArrayArrayArray94 = new byte[local104][local190][];
			Static176.aByteArrayArrayArray68 = new byte[local104][local190][];
			Static110.aByteArrayArrayArray45 = new byte[local104][local190][];
			Static164.aByteArrayArrayArray57 = new byte[local104][local190][];
			Static77.aByteArrayArrayArray33 = new byte[local104][local190][];
			Static211.anIntArrayArrayArray11 = new int[local104][local190][];
			@Pc(228) int local228 = Static19.anInt545 >> 2 << 10;
			@Pc(232) int local232 = Static3.anInt66 >> 1;
			for (@Pc(234) int local234 = 0; local234 < Static17.anInt497; local234++) {
				@Pc(240) Class2_Sub2_Sub14 local240 = Static176.method2703(local234);
				if (local240 != null) {
					@Pc(245) int local245 = local240.anInt1850;
					if (local245 >= 0 && !Static24.anInterface3_1.method1290(local245)) {
						local245 = -1;
					}
					@Pc(275) int local275;
					@Pc(289) int local289;
					@Pc(296) int local296;
					@Pc(323) int local323;
					if (local240.anInt1855 >= 0) {
						local289 = local240.anInt1855;
						local296 = (local289 & 0x7F) + local232;
						if (local296 < 0) {
							local296 = 0;
						} else if (local296 > 127) {
							local296 = 127;
						}
						local323 = local296 + (local228 + local289 & 0xFC00) + (local289 & 0x380);
						local275 = Static24.anIntArray40[Static127.method2160(local323, 96)];
					} else if (local245 >= 0) {
						local275 = Static24.anIntArray40[Static127.method2160(Static24.anInterface3_1.method1292(local245), 96)];
					} else if (local240.anInt1851 == -1) {
						local275 = -1;
					} else {
						local289 = local240.anInt1851;
						local296 = (local289 & 0x7F) + local232;
						if (local296 < 0) {
							local296 = 0;
						} else if (local296 > 127) {
							local296 = 127;
						}
						local323 = (local289 & 0x380) + (local289 + local228 & 0xFC00) + local296;
						local275 = Static24.anIntArray40[Static127.method2160(local323, 96)];
					}
					Static135.anIntArray289[local234 + 1] = local275;
				}
			}
			Static83.anInt1856 = 20;
		} else if (Static83.anInt1856 == 20) {
			Static14.method1778(Static97.aClass28_Sub1_14.method860(Static69.aClass83_514, Static2.aClass83_9));
			Static83.anInt1856 = 30;
			Static114.method2017();
		} else if (Static83.anInt1856 == 30) {
			Static215.method3247(Static97.aClass28_Sub1_14.method860(Static69.aClass83_514, Static182.aClass83_1068));
			Static83.anInt1856 = 50;
			Static114.method2017();
		} else if (Static83.anInt1856 == 50) {
			Static50.method995(Static97.aClass28_Sub1_14.method860(Static69.aClass83_514, Static152.aClass83_921));
			Static83.anInt1856 = 70;
			Static114.method2017();
		} else if (Static83.anInt1856 == 70) {
			Static91.method1591(Static97.aClass28_Sub1_14.method860(Static69.aClass83_514, Static10.aClass83_67));
			Static83.anInt1856 = 90;
			Static114.method2017();
		} else {
			Static138.method2246(Static97.aClass28_Sub1_14.method860(Static69.aClass83_514, Static209.aClass83_1191));
			if (Static83.anInt1856 == 90) {
				Static76.aClass77_110 = new Class77(11, true, Static69.aCanvas1);
				Static109.aClass77_63 = new Class77(12, true, Static69.aCanvas1);
				Static113.aClass77_67 = new Class77(14, true, Static69.aCanvas1);
				Static115.aClass77_70 = new Class77(17, true, Static69.aCanvas1);
				Static105.aClass77_57 = new Class77(19, true, Static69.aCanvas1);
				Static196.aClass77_98 = new Class77(22, true, Static69.aCanvas1);
				Static36.aClass77_25 = new Class77(26, true, Static69.aCanvas1);
				Static128.aClass77_75 = new Class77(30, true, Static69.aCanvas1);
				Static83.anInt1856 = 100;
			}
			Static121.anInt2748 = -1;
			Static83.anInt1856 = 100;
			Static113.anInt2598 = -1;
			Static114.method2017();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)Z")
	public static boolean method2186(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}
}
