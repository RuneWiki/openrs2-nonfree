import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!oe;")
	public static Class2_Sub1_Sub2_Sub3_Sub1 aClass2_Sub1_Sub2_Sub3_Sub1_5;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "J")
	public static long aLong75;

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "Lclient!je;")
	private static Class40 aClass40_1452 = Static69.method1231("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!je;")
	public static Class40 aClass40_1447 = aClass40_1452;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "[I")
	public static int[] anIntArray303 = new int[5];

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	public static int anInt2663 = 0;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "Lclient!je;")
	public static Class40 aClass40_1448 = Static69.method1231("Fertigkeit)2");

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
	public static int anInt2670 = 128;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "Lclient!je;")
	public static Class40 aClass40_1449 = Static69.method1231("l");

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "Lclient!je;")
	public static Class40 aClass40_1450 = Static69.method1231("nav");

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "Lclient!je;")
	public static Class40 aClass40_1451 = Static69.method1231("swe");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLclient!fd;Lclient!fd;)V")
	public static void method1910(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class24 arg1) {
		Static35.aClass24_9 = arg0;
		Static38.aClass24_11 = arg1;
		Static61.anInt1680 = Static35.aClass24_9.method1927(3);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public static void method1923() {
		Static7.aClass2_Sub9_Sub1_1.method672();
		@Pc(13) int local13 = Static7.aClass2_Sub9_Sub1_1.method671(8);
		@Pc(18) int local18;
		if (Static102.anInt2484 > local13) {
			for (local18 = local13; local18 < Static102.anInt2484; local18++) {
				Static104.anIntArray286[Static114.anInt2625++] = Static37.anIntArray97[local18];
			}
		}
		if (local13 > Static102.anInt2484) {
			throw new RuntimeException("gnpov1");
		}
		Static102.anInt2484 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(60) int local60 = Static37.anIntArray97[local18];
			@Pc(64) Class2_Sub1_Sub1_Sub3_Sub1 local64 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local60];
			@Pc(69) int local69 = Static7.aClass2_Sub9_Sub1_1.method671(1);
			if (local69 == 0) {
				Static37.anIntArray97[Static102.anInt2484++] = local60;
				local64.anInt1808 = Static28.anInt704;
			} else {
				@Pc(92) int local92 = Static7.aClass2_Sub9_Sub1_1.method671(2);
				if (local92 == 0) {
					Static37.anIntArray97[Static102.anInt2484++] = local60;
					local64.anInt1808 = Static28.anInt704;
					Static73.anIntArray202[Static58.anInt1521++] = local60;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local92 == 1) {
						Static37.anIntArray97[Static102.anInt2484++] = local60;
						local64.anInt1808 = Static28.anInt704;
						local134 = Static7.aClass2_Sub9_Sub1_1.method671(3);
						local64.method1172(false, local134);
						local144 = Static7.aClass2_Sub9_Sub1_1.method671(1);
						if (local144 == 1) {
							Static73.anIntArray202[Static58.anInt1521++] = local60;
						}
					} else if (local92 == 2) {
						Static37.anIntArray97[Static102.anInt2484++] = local60;
						local64.anInt1808 = Static28.anInt704;
						local134 = Static7.aClass2_Sub9_Sub1_1.method671(3);
						local64.method1172(true, local134);
						local144 = Static7.aClass2_Sub9_Sub1_1.method671(3);
						local64.method1172(true, local144);
						@Pc(198) int local198 = Static7.aClass2_Sub9_Sub1_1.method671(1);
						if (local198 == 1) {
							Static73.anIntArray202[Static58.anInt1521++] = local60;
						}
					} else if (local92 == 3) {
						Static104.anIntArray286[Static114.anInt2625++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method1930() {
		Static116.aBoolean223 = true;
		Static25.aLong17 = 0L;
		Static104.aBoolean203 = true;
		Static114.aClass61_1.anInt2402 = 0;
		Static69.anInt1926 = 0;
		Static56.method994();
		Static57.anInt1500 = 0;
		Static57.aClass2_Sub9_Sub1_2.anInt976 = 0;
		Static8.aBoolean21 = false;
		Static30.anInt730 = 0;
		Static39.anInt1057 = -1;
		Static35.anInt825 = -1;
		Static1.anInt9 = 0;
		Static116.anInt2705 = -1;
		Static15.anInt297 = -1;
		Static10.anInt2975 = 0;
		Static7.aClass2_Sub9_Sub1_1.anInt976 = 0;
		Static58.anInt1520 = 0;
		Static13.method212(0);
		for (@Pc(1941) int local1941 = 0; local1941 < 100; local1941++) {
			Static127.aClass40Array24[local1941] = null;
		}
		Static70.anInt1888 = 0;
		Static111.anInt2597 = 0;
		Static27.anInt680 = 0;
		Static46.anInt1215 = -1;
		Static56.anInt1475 = 0;
		Static31.aBoolean53 = false;
		Static19.anInt616 = (int) (Math.random() * 120.0D) - 60;
		Static66.anInt1743 = 0;
		Static123.anInt2870 = (int) (Math.random() * 80.0D) - 40;
		Static94.anInt2403 = (int) (Math.random() * 30.0D) - 20;
		Static130.anInt3007 = 0;
		Static127.anInt2941 = (int) (Math.random() * 100.0D) - 50;
		Static102.anInt2484 = 0;
		Static65.anInt1733 = (int) (Math.random() * 110.0D) - 55;
		Static58.anInt1517 = 0;
		Static39.anInt1035 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		for (@Pc(2025) int local2025 = 0; local2025 < 2048; local2025++) {
			Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local2025] = null;
			Static3.aClass2_Sub9Array1[local2025] = null;
		}
		for (@Pc(2043) int local2043 = 0; local2043 < 32768; local2043++) {
			Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local2043] = null;
		}
		Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[2047] = new Class2_Sub1_Sub1_Sub3_Sub2();
		Static120.aClass3_16.method81();
		Static79.aClass3_12.method81();
		@Pc(2073) int local2073;
		@Pc(2077) int local2077;
		for (@Pc(2069) int local2069 = 0; local2069 < 4; local2069++) {
			for (local2073 = 0; local2073 < 104; local2073++) {
				for (local2077 = 0; local2077 < 104; local2077++) {
					Static81.aClass3ArrayArrayArray1[local2069][local2073][local2077] = null;
				}
			}
		}
		Static19.aClass3_4 = new Class3();
		Static114.anInt2621 = 0;
		Static103.anInt2510 = 0;
		for (local2073 = 0; local2073 < Static74.anInt951; local2073++) {
			@Pc(2119) Class2_Sub1_Sub8 local2119 = Static83.method1493(local2073);
			if (local2119 != null && local2119.anInt2025 == 0) {
				Static63.anIntArray56[local2073] = 0;
				Static35.anIntArray96[local2073] = 0;
			}
		}
		for (local2077 = 0; local2077 < Static85.anIntArray249.length; local2077++) {
			Static85.anIntArray249[local2077] = -1;
		}
		if (Static92.anInt2332 != -1) {
			Static87.method898(Static92.anInt2332);
		}
		for (@Pc(2172) Class2_Sub11 local2172 = (Class2_Sub11) Static61.aClass77_6.method2031(); local2172 != null; local2172 = (Class2_Sub11) Static61.aClass77_6.method2039()) {
			Static50.method891(true, local2172);
		}
		Static92.anInt2332 = -1;
		Static61.aClass77_6 = new Class77(8);
		Static57.anInt1500 = 0;
		Static56.aClass2_Sub13_7 = null;
		Static8.aBoolean21 = false;
		Static127.aClass41_2.method1006(-1, null, new int[5], false);
		for (@Pc(2210) int local2210 = 0; local2210 < 8; local2210++) {
			Static120.aClass40Array20[local2210] = null;
			Static84.aBooleanArray22[local2210] = false;
		}
		Static28.method437();
		Static83.aBoolean166 = true;
		for (@Pc(2230) int local2230 = 0; local2230 < 100; local2230++) {
			Static64.aBooleanArray17[local2230] = true;
		}
		Static87.anInt1327 = 0;
		Static115.aClass2_Sub16Array1 = null;
		Static59.aClass40_774 = null;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public static void method1932() {
		anIntArray303 = null;
		aByteArrayArrayArray11 = null;
		aClass2_Sub1_Sub2_Sub3_Sub1_5 = null;
		aClass40_1452 = null;
		aClass40_1451 = null;
		aClass40_1450 = null;
		aClass40_1449 = null;
		aClass40_1448 = null;
		aClass40_1447 = null;
	}
}
