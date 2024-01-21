import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!we", name = "A", descriptor = "[I")
	public static int[] anIntArray382;

	@OriginalMember(owner = "client!we", name = "E", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1363 = Static56.method972("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!we", name = "z", descriptor = "I")
	public static int anInt2991 = 0;

	@OriginalMember(owner = "client!we", name = "B", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1364 = Static56.method972("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!we", name = "D", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1366 = Static56.method972("To");

	@OriginalMember(owner = "client!we", name = "C", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1365 = aClass5_1366;

	@OriginalMember(owner = "client!we", name = "H", descriptor = "I")
	public static final int anInt2994 = 0;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1367 = Static56.method972("Invalid username or password)3");

	@OriginalMember(owner = "client!we", name = "K", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array19 = new Class5[5];

	@OriginalMember(owner = "client!we", name = "L", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!we", name = "M", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1368 = aClass5_1367;

	@OriginalMember(owner = "client!we", name = "N", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1369 = Static56.method972(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!we", name = "jb", descriptor = "[I")
	public static int[] anIntArray384 = new int[25];

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
	public static void method1968() {
		Static83.anInt2051 = 0;
		Static61.anInt1651 = 0;
		Static91.method1534();
		Static67.method1165();
		Static102.method1722();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static61.anInt1651; local17++) {
			local23 = Static37.anIntArray123[local17];
			if (Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local23].anInt1556 != Static3.anInt289) {
				Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local23].aClass3_Sub1_Sub13_1 = null;
				Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local23] = null;
			}
		}
		if (Static75.aClass3_Sub6_Sub1_2.anInt2416 != Static61.anInt1652) {
			throw new RuntimeException("gnp1 pos:" + Static75.aClass3_Sub6_Sub1_2.anInt2416 + " psize:" + Static61.anInt1652);
		}
		for (local23 = 0; local23 < Static115.anInt2977; local23++) {
			if (Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[Static36.anIntArray320[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static115.anInt2977);
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)Lclient!bb;")
	public static Class3_Sub1_Sub2_Sub1 method1969() {
		@Pc(20) Class3_Sub1_Sub2_Sub1 local20 = new Class3_Sub1_Sub2_Sub1(Static63.anIntArray375, Static56.anIntArray170, anIntArray382, Static89.anIntArray256, Static38.aByteArrayArray6);
		Static21.method436();
		return local20;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)I")
	public static int method1970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static84.method1339(arg0 - 1, arg1 + -1) + Static84.method1339(arg0 - 1, arg1 + 1) + Static84.method1339(arg0 + 1, arg1 + -1) + Static84.method1339(arg0 + 1, arg1 + 1);
		@Pc(76) int local76 = Static84.method1339(arg0, arg1 - 1) + Static84.method1339(arg0, arg1 + 1) + Static84.method1339(arg0 - 1, arg1) + Static84.method1339(arg0 + 1, arg1);
		@Pc(81) int local81 = Static84.method1339(arg0, arg1);
		return local81 / 4 + local43 / 16 + local76 / 8;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)V")
	public static void method1971(@OriginalArg(1) int arg0) {
		if (arg0 == Static47.anInt1308) {
			return;
		}
		if (Static47.anInt1308 == 0) {
			Static67.method1170();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static65.anInt2401 = 0;
			Static17.anInt615 = 0;
			Static78.anInt1961 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static90.aClass18_3 != null) {
			Static90.aClass18_3.method405();
			Static90.aClass18_3 = null;
		}
		if (Static47.anInt1308 == 25 || Static47.anInt1308 == 40) {
			Static27.method544();
			Static66.method1850();
		}
		if (Static47.anInt1308 == 25) {
			Static110.anInt2892 = 1;
			Static55.anInt1454 = 0;
			Static21.anInt704 = 0;
			Static75.anInt1936 = 1;
			Static1.anInt7 = 0;
		}
		if (arg0 == 35) {
			Static19.method427();
			Static38.method701();
			if (Static51.aClass2_19 == null) {
				Static51.aClass2_19 = Static92.method1544(Static62.aCanvas1, 765, 503);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static51.aClass2_19 = null;
			Static19.method427();
			Static36.method1793(Static62.aCanvas1, Static38.aClass11_Sub1_37, Static110.aClass11_Sub1_106);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static51.aClass2_19 = null;
			Static38.method701();
			Static81.method1299(Static62.aCanvas1, Static38.aClass11_Sub1_37);
		}
		Static27.aBoolean42 = true;
		Static47.anInt1308 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
	public static void method1972() {
		anIntArray384 = null;
		aClass5_1363 = null;
		aClass5_1367 = null;
		aClass5_1369 = null;
		aClass5_1365 = null;
		aClass5Array19 = null;
		aClass5_1364 = null;
		anIntArray382 = null;
		aClass5_1366 = null;
		aClass5_1368 = null;
		aByteArrayArrayArray9 = null;
	}
}
