import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2 aClass2_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "I")
	public static int anInt1413;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_29;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Lclient!g;")
	public static Class26 aClass26_12;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!u;")
	private static Class74 aClass74_986 = Static72.method1077("wave:");

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_987 = Static72.method1077("::noclip");

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!u;")
	private static Class74 aClass74_988 = Static72.method1077("Classic");

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!jc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_989 = Static72.method1077("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_990 = Static72.method1077("mapdots");

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_991 = aClass74_988;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "I")
	public static int anInt1414 = 0;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[5];

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_992 = aClass74_986;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Lclient!u;")
	public static Class74 aClass74_993 = aClass74_986;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Lclient!u;")
	public static Class74 aClass74_994 = Static72.method1077("Menge eingeben:");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method995() {
		aClass74_994 = null;
		aClass74_990 = null;
		aClass2_Sub2_Sub1_Sub2_2 = null;
		aClass74_993 = null;
		aClass74_992 = null;
		aClass2_Sub2_Sub1_Sub1_29 = null;
		aClass74_989 = null;
		aBooleanArray2 = null;
		aClass74_988 = null;
		aClass26_12 = null;
		aClass74_987 = null;
		aClass74_991 = null;
		aClass74_986 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Z")
	public static boolean method996() {
		try {
			if (Static9.anInt300 == 2) {
				if (Static33.aClass2_Sub18_1 == null) {
					Static33.aClass2_Sub18_1 = Static135.method1578(aClass26_12, Static107.anInt2339, Static84.anInt1827);
					if (Static33.aClass2_Sub18_1 == null) {
						return false;
					}
				}
				if (Static110.aClass35_1 == null) {
					Static110.aClass35_1 = new Class35(Static81.aClass26_19, Static34.aClass26_5);
				}
				if (Static12.aClass2_Sub16_Sub2_1.method1809(Static110.aClass35_1, Static52.aClass26_11, Static33.aClass2_Sub18_1)) {
					Static12.aClass2_Sub16_Sub2_1.method1817();
					Static12.aClass2_Sub16_Sub2_1.method1808(Static121.anInt2594);
					Static12.aClass2_Sub16_Sub2_1.method1815(Static77.aBoolean68, Static33.aClass2_Sub18_1);
					Static33.aClass2_Sub18_1 = null;
					aClass26_12 = null;
					Static9.anInt300 = 0;
					Static110.aClass35_1 = null;
					return true;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static12.aClass2_Sub16_Sub2_1.method1798();
			Static33.aClass2_Sub18_1 = null;
			Static110.aClass35_1 = null;
			Static9.anInt300 = 0;
			aClass26_12 = null;
		}
		return false;
	}
}
