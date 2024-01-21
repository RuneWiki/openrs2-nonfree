import java.awt.Image;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!pf", name = "V", descriptor = "[Lclient!vg;")
	public static Class85[] aClass85Array1;

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "[Lclient!df;")
	public static Class2_Sub2_Sub2_Sub2[] aClass2_Sub2_Sub2_Sub2Array8;

	@OriginalMember(owner = "client!pf", name = "gb", descriptor = "I")
	public static int anInt2805;

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1268 = Static32.method683("");

	@OriginalMember(owner = "client!pf", name = "Q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1264 = aClass49_1268;

	@OriginalMember(owner = "client!pf", name = "qb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1279 = Static32.method683("Members only world");

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1265 = aClass49_1279;

	@OriginalMember(owner = "client!pf", name = "cb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1271 = Static32.method683("The server is being updated)3");

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1266 = aClass49_1271;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1267 = aClass49_1268;

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1269 = Static32.method683("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1270 = aClass49_1268;

	@OriginalMember(owner = "client!pf", name = "eb", descriptor = "I")
	public static int anInt2804 = 0;

	@OriginalMember(owner = "client!pf", name = "fb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1272 = Static32.method683("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!pf", name = "hb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1273 = Static32.method683("Fps:");

	@OriginalMember(owner = "client!pf", name = "ib", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1274 = aClass49_1268;

	@OriginalMember(owner = "client!pf", name = "jb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1275 = aClass49_1268;

	@OriginalMember(owner = "client!pf", name = "kb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1276 = aClass49_1268;

	@OriginalMember(owner = "client!pf", name = "lb", descriptor = "I")
	public static int anInt2806 = 0;

	@OriginalMember(owner = "client!pf", name = "nb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1278 = Static32.method683("FULL");

	@OriginalMember(owner = "client!pf", name = "mb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1277 = aClass49_1278;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
	public static void method2182() {
		Static176.aClass2_Sub13_Sub1_14.method2976(122);
		for (@Pc(19) Class2_Sub8 local19 = (Class2_Sub8) Static100.aClass25_7.method837(); local19 != null; local19 = (Class2_Sub8) Static100.aClass25_7.method834()) {
			if (local19.anInt1204 == 0) {
				Static139.method2311(true, local19);
			}
		}
		if (Static141.aClass85_12 != null) {
			Static102.method1756(Static141.aClass85_12);
			Static141.aClass85_12 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V")
	public static void method2183() {
		aClass85Array1 = null;
		aClass49_1276 = null;
		aClass49_1274 = null;
		aClass49_1278 = null;
		anImage4 = null;
		aClass49_1273 = null;
		aClass49_1279 = null;
		aClass49_1264 = null;
		aClass49_1272 = null;
		aClass49_1270 = null;
		aClass49_1267 = null;
		aClass49_1265 = null;
		aClass49_1275 = null;
		aClass49_1266 = null;
		aClass49_1271 = null;
		aClass49_1268 = null;
		aClass2_Sub2_Sub2_Sub2Array8 = null;
		aClass49_1269 = null;
		aClass49_1277 = null;
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)Lclient!uf;")
	public static Class54 method2184() {
		try {
			return (Class54) Class.forName("Class54_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class54_Sub1();
		}
	}
}
