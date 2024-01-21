import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!nc", name = "jb", descriptor = "I")
	public static int anInt1683;

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_873 = Static75.method1216("Mitteilung");

	@OriginalMember(owner = "client!nc", name = "rb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_882 = Static75.method1216("K");

	@OriginalMember(owner = "client!nc", name = "eb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_874 = aClass4_882;

	@OriginalMember(owner = "client!nc", name = "fb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_875 = aClass4_882;

	@OriginalMember(owner = "client!nc", name = "gb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_876 = Static75.method1216("backright2");

	@OriginalMember(owner = "client!nc", name = "hb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_877 = Static75.method1216("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!nc", name = "yb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_886 = Static75.method1216("Loading game screen )2 ");

	@OriginalMember(owner = "client!nc", name = "ib", descriptor = "Lclient!ad;")
	public static Class4 aClass4_878 = aClass4_886;

	@OriginalMember(owner = "client!nc", name = "mb", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!nc", name = "nb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_879 = Static75.method1216("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!nc", name = "ob", descriptor = "Lclient!ad;")
	public static Class4 aClass4_880 = Static75.method1216("Verbindung mit Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!nc", name = "pb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_881 = Static75.method1216("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!nc", name = "qb", descriptor = "I")
	public static int anInt1686 = 3;

	@OriginalMember(owner = "client!nc", name = "sb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_883 = aClass4_881;

	@OriginalMember(owner = "client!nc", name = "tb", descriptor = "I")
	public static int anInt1687 = 1;

	@OriginalMember(owner = "client!nc", name = "ub", descriptor = "Lclient!ad;")
	public static Class4 aClass4_884 = Static75.method1216("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!nc", name = "wb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_885 = Static75.method1216("gr-Un:");

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
	public static void method1136() {
		aClass4_875 = null;
		aClass4_881 = null;
		anIntArray232 = null;
		aClass4_882 = null;
		aClass4_877 = null;
		aClass4_879 = null;
		aClass4_883 = null;
		aClass4_880 = null;
		aClass4_878 = null;
		aClass4_886 = null;
		aClass4_874 = null;
		aClass4_876 = null;
		aClass4_885 = null;
		aClass4_873 = null;
		aClass4_884 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)V")
	public static void method1137(@OriginalArg(1) boolean arg0) {
		if (Static54.aClass31_4 == null) {
			return;
		}
		try {
			@Pc(11) Class3_Sub4 local11 = new Class3_Sub4(4);
			local11.method423(arg0 ? 2 : 3);
			local11.method441(0);
			Static54.aClass31_4.method716(4, local11.aByteArray4);
		} catch (@Pc(36) IOException local36) {
			try {
				Static54.aClass31_4.method717();
			} catch (@Pc(41) Exception local41) {
			}
			Static31.anInt958++;
			Static54.aClass31_4 = null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V")
	public static void method1138() {
		Static84.aBoolean149 = false;
		Static36.aBoolean70 = false;
	}
}
