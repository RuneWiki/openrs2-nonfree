import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!q;")
	public static Class62 aClass62_6;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!bc;")
	public static Class6 aClass6_7;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	public static int anInt837 = 0;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!kd;")
	public static Class39 aClass39_411 = Static108.method1915("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_412 = Static108.method1915("gleiten:");

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!jb;")
	public static Class33 aClass33_10 = new Class33(64);

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Lclient!kd;")
	private static Class39 aClass39_413 = Static108.method1915("Members only world");

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_414 = aClass39_413;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	public static int anInt844 = 0;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!kd;")
	public static Class39 aClass39_415 = Static108.method1915("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method458() {
		if (!Static46.aBoolean222) {
			return;
		}
		@Pc(16) Class1_Sub1_Sub1 local16 = Static32.method393(Static123.anInt2998, Static76.anInt1918);
		if (local16 != null && local16.anObjectArray17 != null) {
			Static52.method962(local16.anObjectArray17, 0, null, 0, local16, 0);
		}
		Static46.aBoolean222 = false;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method459() {
		aClass62_6 = null;
		aString1 = null;
		aClass39_415 = null;
		aClass39_411 = null;
		aClass39_413 = null;
		aClass6_7 = null;
		aClass39_414 = null;
		aClass39_412 = null;
		aClass33_10 = null;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method460() {
		if (Static29.aClass74_1 != null) {
			Static29.aClass74_1.method2047();
			Static29.aClass74_1 = null;
		}
		Static38.method687();
		Static32.aClass5_2.method139();
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			Static62.aClass23Array2[local26].method768();
		}
		System.gc();
		Static98.method1720();
		Static95.anInt2869 = -1;
		Static10.aBoolean46 = false;
		Static71.method1245();
		Static41.method2108(10);
	}
}
