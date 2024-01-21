import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "[I")
	public static int[] anIntArray103 = new int[100];

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "Lclient!rc;")
	public static Class61 aClass61_7 = new Class61();

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "Lclient!sc;")
	public static Class66 aClass66_445 = null;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "Lclient!sc;")
	public static Class66 aClass66_446 = Static106.method1849("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "Lclient!sc;")
	public static Class66 aClass66_447 = Static106.method1849("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "Lclient!sc;")
	public static Class66 aClass66_448 = Static106.method1849("Lade)3)3)3");

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "Lclient!sc;")
	public static Class66 aClass66_449 = Static106.method1849("::clientdrop");

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "Lclient!sc;")
	private static Class66 aClass66_450 = Static106.method1849("Please wait)3)3)3");

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lclient!sc;")
	private static Class66 aClass66_451 = Static106.method1849("flash3:");

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
	public static int anInt728 = 0;

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
	public static int anInt729 = 0;

	@OriginalMember(owner = "client!ef", name = "T", descriptor = "Lclient!sc;")
	public static Class66 aClass66_452 = aClass66_451;

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
	public static int anInt730 = 0;

	@OriginalMember(owner = "client!ef", name = "V", descriptor = "Lclient!sc;")
	private static Class66 aClass66_453 = Static106.method1849("Connection lost)3");

	@OriginalMember(owner = "client!ef", name = "W", descriptor = "Lclient!sc;")
	public static Class66 aClass66_454 = aClass66_451;

	@OriginalMember(owner = "client!ef", name = "X", descriptor = "Lclient!sc;")
	public static Class66 aClass66_455 = aClass66_453;

	@OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lclient!sc;")
	public static Class66 aClass66_456 = aClass66_450;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BILclient!nd;III)V")
	public static void method544(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub9 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub13 local7 = new Class1_Sub13();
		local7.anIntArray294 = arg1.anIntArray339;
		local7.anInt1930 = arg1.anInt2086 * 128;
		local7.anInt1932 = arg0 * 128;
		local7.anInt1919 = arg1.anInt2094;
		@Pc(33) int local33 = arg1.anInt2083;
		local7.anInt1924 = arg1.anInt2060;
		@Pc(40) int local40 = arg1.anInt2065;
		local7.anInt1929 = arg4 * 128;
		local7.anInt1931 = arg2;
		local7.anInt1923 = arg1.anInt2056;
		if (arg3 == 1 || arg3 == 3) {
			local33 = arg1.anInt2065;
			local40 = arg1.anInt2083;
		}
		local7.anInt1925 = (arg0 + local33) * 128;
		local7.anInt1928 = (local40 + arg4) * 128;
		if (arg1.anIntArray338 != null) {
			local7.aClass1_Sub1_Sub9_1 = arg1;
			local7.method1355();
		}
		Static1.aClass61_1.method1754(local7);
		if (local7.anIntArray294 != null) {
			local7.anInt1926 = (int) ((double) (local7.anInt1924 - local7.anInt1919) * Math.random()) + local7.anInt1919;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method545() {
		aClass61_7 = null;
		aClass66_449 = null;
		aClass66_456 = null;
		aClass66_445 = null;
		aClass66_450 = null;
		aClass66_453 = null;
		aClass66_454 = null;
		aClass66_446 = null;
		aClass66_455 = null;
		aClass66_447 = null;
		aClass66_452 = null;
		anIntArray104 = null;
		anIntArray103 = null;
		aClass66_451 = null;
		aClass66_448 = null;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public static void method546() {
		Static109.aClass60_80.method1747();
		Static102.aClass60_79.method1747();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public static void method547() {
		Static38.aClass1_Sub9_Sub1_33.method848();
		Static20.anInt622 = 1;
		Static15.aClass5_93 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Z")
	public static boolean method548(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static127.aClass1_Sub12_Sub1_2.method1227(25);
		Static127.aClass1_Sub12_Sub1_2.method1196(arg0);
		Static127.aClass1_Sub12_Sub1_2.method1204(arg1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V")
	public static void method550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static94.anInt2420; local3++) {
			if (arg3 < anIntArray103[local3] + Static2.anIntArray16[local3] && anIntArray103[local3] < arg3 + arg0 && Static13.anIntArray76[local3] + Static99.anIntArray180[local3] > arg1 && Static99.anIntArray180[local3] < arg1 + arg2) {
				Static5.aBooleanArray2[local3] = true;
			}
		}
	}
}
