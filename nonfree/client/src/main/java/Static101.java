import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!ka;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
	public static int anInt2517;

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
	public static int[] anIntArray280 = new int[128];

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!c;")
	public static Class12 aClass12_68 = new Class12(64);

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1301 = Static28.method504("glow3:");

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1299 = aClass39_1301;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1300 = aClass39_1301;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1302 = Static28.method504("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1303 = Static28.method504("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!he;")
	public static Class4_Sub5 aClass4_Sub5_55 = null;

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1304 = Static28.method504("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1305 = Static28.method504(" ");

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	public static int anInt2516 = -1;

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1306 = Static28.method504("Sprites geladen)3");

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
	public static int anInt2518 = -1;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1307 = Static28.method504("mod_icons");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!md;I)V")
	public static void method1815(@OriginalArg(0) Class4_Sub1 arg0) {
		arg0.aBoolean107 = false;
		if (arg0.aClass4_Sub6_5 != null) {
			arg0.aClass4_Sub6_5.anInt1654 = 0;
		}
		for (@Pc(22) Class4_Sub1 local22 = arg0.method1532(); local22 != null; local22 = arg0.method1536()) {
			method1815(local22);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public static void method1816() {
		Static30.anInt785 = 0;
		Static113.anInt2837 = 0;
		Static8.method186();
		Static98.method683();
		Static122.method2091();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static113.anInt2837; local17++) {
			local23 = Static38.anIntArray103[local17];
			if (Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local23].anInt2681 != Static71.anInt1738) {
				Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local23].aClass4_Sub2_Sub16_1 = null;
				Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[local23] = null;
			}
		}
		if (Static97.anInt2446 != Static35.aClass4_Sub16_Sub1_1.anInt2019) {
			throw new RuntimeException("gnp1 pos:" + Static35.aClass4_Sub16_Sub1_1.anInt2019 + " psize:" + Static97.anInt2446);
		}
		for (local23 = 0; local23 < Static72.anInt799; local23++) {
			if (Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[Static33.anIntArray94[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static72.anInt799);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1817() {
		Static123.aBoolean150 = false;
		Static61.aBoolean91 = false;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public static void method1818() {
		aClass39_1299 = null;
		aClass39_1300 = null;
		aClass39_1305 = null;
		aClass39_1301 = null;
		aClass39_1304 = null;
		aClass4_Sub5_55 = null;
		aClass39_1303 = null;
		aClass12_68 = null;
		aClass39_1302 = null;
		aClass39_1306 = null;
		anIntArray280 = null;
		aClass43_1 = null;
		anIntArray281 = null;
		aClass39_1307 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Lclient!wb;")
	public static Class4_Sub2_Sub17 method1819(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2_Sub17 local10 = (Class4_Sub2_Sub17) Static120.aClass12_82.method235((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static35.aClass20_21.method474(14, arg0);
		local10 = new Class4_Sub2_Sub17();
		if (local25 != null) {
			local10.method2203(new Class4_Sub16(local25));
		}
		Static120.aClass12_82.method234(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method1820() {
		Static14.aByteArrayArrayArray1 = new byte[4][105][105];
		Static128.anIntArray362 = new int[104];
		Static69.anIntArrayArray13 = new int[105][105];
		anIntArray281 = new int[104];
		Static72.anIntArrayArrayArray4 = new int[4][105][105];
		Static23.anIntArray66 = new int[104];
		Static122.anIntArray324 = new int[104];
		Static69.aByteArrayArrayArray5 = new byte[4][104][104];
		Static30.aByteArrayArrayArray2 = new byte[4][104][104];
		Static73.anInt1760 = 99;
		Static65.aByteArrayArrayArray4 = new byte[4][104][104];
		Static35.anIntArray100 = new int[104];
		Static47.aByteArrayArrayArray3 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)Lclient!da;")
	public static Class4_Sub2_Sub4 method1821(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub2_Sub4 local10 = (Class4_Sub2_Sub4) Static85.aClass12_58.method235((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static14.method239(arg0, Static24.aClass20_13, Static2.aClass20_1);
		if (local10 != null) {
			Static85.aClass12_58.method234(local10, (long) arg0);
		}
		return local10;
	}
}
