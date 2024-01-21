import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
	public static int anInt1261;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "J")
	public static long aLong36;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "[Lclient!m;")
	public static Class3_Sub11[] aClass3_Sub11Array1 = new Class3_Sub11[2048];

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!he;")
	private static Class26 aClass26_646 = Static6.method100(" is already on your friend list");

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "Lclient!he;")
	public static Class26 aClass26_647 = aClass26_646;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
	public static int anInt1264 = 0;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!he;")
	private static Class26 aClass26_649 = Static6.method100("Select");

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Lclient!he;")
	public static Class26 aClass26_648 = aClass26_649;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "[I")
	public static int[] anIntArray135 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "Lclient!sf;")
	public static Class66 aClass66_12 = new Class66(50);

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "[I")
	public static int[] anIntArray136 = new int[50];

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!he;")
	public static Class26 aClass26_650 = Static6.method100("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "Lclient!he;")
	public static Class26 aClass26_651 = Static6.method100("Angreifen");

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "Lclient!he;")
	public static Class26 aClass26_652 = Static6.method100("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method780() {
		for (@Pc(15) Class3_Sub1_Sub5_Sub3 local15 = (Class3_Sub1_Sub5_Sub3) Static81.aClass65_56.method1958(); local15 != null; local15 = (Class3_Sub1_Sub5_Sub3) Static81.aClass65_56.method1962()) {
			if (Static132.anInt3270 != local15.anInt1189 || local15.aBoolean65) {
				local15.method2201();
			} else if (local15.anInt1187 <= Static4.anInt136) {
				local15.method731(Static42.anInt1304);
				if (local15.aBoolean65) {
					local15.method2201();
				} else {
					Static62.aClass69_1.method2048(local15.anInt1189, local15.anInt1188, local15.anInt1192, local15.anInt1193, 60, local15, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method781() {
		aClass66_12 = null;
		anIntArray136 = null;
		aClass26_647 = null;
		aClass26_648 = null;
		aClass26_651 = null;
		aClass26_649 = null;
		aClass26_650 = null;
		aClass26_652 = null;
		aClass3_Sub11Array1 = null;
		aClass26_646 = null;
		anIntArray135 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)Z")
	public static boolean method782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = Static62.aClass69_1.method2062(Static132.anInt3270, arg2, arg1, arg0);
		@Pc(18) int local18 = arg0 >> 14 & 0x7FFF;
		if (local12 == -1) {
			return false;
		}
		@Pc(28) int local28 = local12 & 0x1F;
		@Pc(34) int local34 = local12 >> 6 & 0x3;
		if (local28 == 10 || local28 == 11 || local28 == 22) {
			@Pc(51) Class3_Sub1_Sub1 local51 = Static4.method68(local18);
			@Pc(54) int local54 = local51.anInt108;
			@Pc(68) int local68;
			@Pc(65) int local65;
			if (local34 == 0 || local34 == 2) {
				local68 = local51.anInt86;
				local65 = local51.anInt96;
			} else {
				local65 = local51.anInt86;
				local68 = local51.anInt96;
			}
			if (local34 != 0) {
				local54 = (local54 << local34 & 0xF) + (local54 >> 4 - local34);
			}
			Static100.method2209(local65, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], arg1, arg2, local68, 0, true, 2, 0, local54, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
		} else {
			Static100.method2209(0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray325[0], arg1, arg2, 0, local28 + 1, true, 2, local34, 0, Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anIntArray326[0]);
		}
		Static49.anInt1587 = 2;
		Static17.anInt428 = 0;
		Static2.anInt18 = Static19.anInt514;
		Static93.anInt2538 = Static59.anInt1803;
		return true;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(JI)V")
	public static void method783(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % (long) 10 == 0L) {
			Static32.method633(arg0 - 1L);
			Static32.method633(1L);
		} else {
			Static32.method633(arg0);
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public static void method784() {
		Static52.aClass53_1.anInt2452 = 0;
		Static4.aBoolean12 = true;
		Static71.aLong63 = 0L;
		Static98.aBoolean150 = true;
		Static98.anInt2630 = 0;
		Static132.method2265();
		Static107.aClass3_Sub11_Sub1_3.anInt1562 = 0;
		Static93.anInt2522 = 0;
		Static56.anInt1695 = 0;
		Static33.aClass3_Sub11_Sub1_2.anInt1562 = 0;
		Static85.anInt2341 = -1;
		Static93.anInt2529 = 0;
		Static67.anInt2794 = -1;
		Static65.anInt1955 = -1;
		Static113.anInt3001 = 0;
		Static109.aBoolean162 = false;
		Static126.anInt3213 = 0;
		Static72.anInt2056 = -1;
		Static46.method886(0);
		for (@Pc(1935) int local1935 = 0; local1935 < 100; local1935++) {
			Static13.aClass26Array6[local1935] = null;
		}
		Static33.anInt1081 = (int) (Math.random() * 30.0D) - 20;
		Static8.anInt195 = 0;
		Static130.anInt3259 = 0;
		Static78.anInt2107 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static117.aBoolean169 = false;
		Static52.anInt1614 = (int) (Math.random() * 120.0D) - 60;
		Static117.anInt3069 = (int) (Math.random() * 100.0D) - 50;
		Static36.anInt1196 = (int) (Math.random() * 110.0D) - 55;
		Static29.anInt1010 = -1;
		Static3.anInt89 = 0;
		Static94.anInt2554 = (int) (Math.random() * 80.0D) - 40;
		Static63.anInt1934 = 0;
		Static62.anInt1885 = 0;
		Static133.anInt560 = 0;
		Static110.anInt2946 = 0;
		Static1.anInt8 = 0;
		for (@Pc(2017) int local2017 = 0; local2017 < 2048; local2017++) {
			Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local2017] = null;
			aClass3_Sub11Array1[local2017] = null;
		}
		for (@Pc(2035) int local2035 = 0; local2035 < 32768; local2035++) {
			Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local2035] = null;
		}
		Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[2047] = new Class3_Sub1_Sub5_Sub1_Sub1();
		Static72.aClass65_51.method1957();
		Static81.aClass65_56.method1957();
		@Pc(2067) int local2067;
		@Pc(2071) int local2071;
		for (@Pc(2063) int local2063 = 0; local2063 < 4; local2063++) {
			for (local2067 = 0; local2067 < 104; local2067++) {
				for (local2071 = 0; local2071 < 104; local2071++) {
					Static64.aClass65ArrayArrayArray1[local2063][local2067][local2071] = null;
				}
			}
		}
		Static99.aClass65_70 = new Class65();
		Static133.anInt568 = 0;
		Static17.anInt424 = 0;
		for (local2067 = 0; local2067 < Static132.anInt3271; local2067++) {
			@Pc(2113) Class3_Sub1_Sub15 local2113 = Static60.method1198(local2067);
			if (local2113 != null && local2113.anInt2835 == 0) {
				Static30.anIntArray97[local2067] = 0;
				Static52.anIntArray159[local2067] = 0;
			}
		}
		for (local2071 = 0; local2071 < Static5.anIntArray388.length; local2071++) {
			Static5.anIntArray388[local2071] = -1;
		}
		if (Static32.anInt1048 != -1) {
			Static87.method1626(Static32.anInt1048);
		}
		for (@Pc(2162) Class3_Sub17 local2162 = (Class3_Sub17) Static52.aClass17_9.method598(); local2162 != null; local2162 = (Class3_Sub17) Static52.aClass17_9.method597()) {
			Static36.method730(true, local2162);
		}
		Static32.anInt1048 = -1;
		Static52.aClass17_9 = new Class17(8);
		Static109.aBoolean162 = false;
		Static79.aClass3_Sub14_8 = null;
		Static56.anInt1695 = 0;
		Static119.aClass35_2.method1142(new int[5], null, -1, false);
		for (@Pc(2198) int local2198 = 0; local2198 < 8; local2198++) {
			Static114.aClass26Array25[local2198] = null;
			Static43.aBooleanArray25[local2198] = false;
		}
		Static46.method889();
		Static55.aBoolean88 = true;
		for (@Pc(2220) int local2220 = 0; local2220 < 100; local2220++) {
			Static72.aBooleanArray19[local2220] = true;
		}
		Static80.aClass26_1123 = null;
		Static60.anInt1823 = 0;
		Static46.aClass3_Sub9Array1 = null;
	}
}
