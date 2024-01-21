import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "Lclient!rb;")
	public static Class55 aClass55_17;

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "Lclient!we;")
	public static Class68 aClass68_2;

	@OriginalMember(owner = "client!gd", name = "X", descriptor = "Lclient!gd;")
	private static Class23 aClass23_533 = Static15.method178("Malformed login packet)3");

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!gd;")
	public static Class23 aClass23_530 = aClass23_533;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!gd;")
	public static Class23 aClass23_531 = Static15.method178("Hierhin gehen");

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "Lclient!gd;")
	public static Class23 aClass23_532 = Static15.method178("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "Lclient!ba;")
	public static Class5 aClass5_27 = new Class5(64);

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
	public static int anInt1007 = 0;

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_534 = Static15.method178("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method513() {
		if (Static94.aClass68_4 != null) {
			Static94.aClass68_4.method1935();
			Static94.aClass68_4 = null;
		}
		Static19.method276();
		Static19.aClass65_1.method1722();
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static45.aClass50Array1[local16].method1359();
		}
		System.gc();
		Static77.method1342();
		Static77.anInt2108 = 0;
		Static115.anInt2966 = -1;
		Static58.method1854();
		Static89.method1524(10);
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	public static void method521() {
		aClass23_531 = null;
		aClass55_17 = null;
		aClass23_534 = null;
		aClass23_530 = null;
		aClass68_2 = null;
		aClass23_533 = null;
		aClass5_27 = null;
		aClass23_532 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!rb;Lclient!rb;BLclient!rb;)V")
	public static void method536(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(3) Class55 arg2) {
		Static69.aClass55_30 = arg2;
		Static20.aClass55_12 = arg0;
		Static9.aClass55_2 = arg1;
	}
}
