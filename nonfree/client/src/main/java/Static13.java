import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!cb", name = "Ab", descriptor = "I")
	public static int anInt461;

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "Lclient!s;")
	public static Class52 aClass52_3 = new Class52();

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
	public static int anInt446 = 0;

	@OriginalMember(owner = "client!cb", name = "ub", descriptor = "Lclient!bc;")
	public static Class7 aClass7_1 = new Class7(4096);

	@OriginalMember(owner = "client!cb", name = "vb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_238 = Static24.method441("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!cb", name = "wb", descriptor = "Lclient!ge;")
	public static Class21 aClass21_5 = new Class21(10);

	@OriginalMember(owner = "client!cb", name = "xb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_239 = Static24.method441(":");

	@OriginalMember(owner = "client!cb", name = "yb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_240 = Static24.method441("Fehler beim Laden Ihres Charakter)2Profils");

	@OriginalMember(owner = "client!cb", name = "zb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_241 = Static24.method441("null");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)Z")
	public static boolean method278(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
	public static void method279() {
		aClass65_240 = null;
		aClass65_238 = null;
		aClass65_241 = null;
		aClass21_5 = null;
		aClass65_239 = null;
		aClass52_3 = null;
		aClass7_1 = null;
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V")
	public static void method280() {
		Static107.method1753(0, null, false);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lclient!wb;I)Lclient!wb;")
	public static Class65 method282(@OriginalArg(0) Class65[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static23.method420(arg0.length, arg0);
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
	public static void method284() {
		Static24.anIntArray98 = null;
		Static17.anIntArray79 = null;
		Static98.anIntArray404 = null;
		Static28.anIntArray110 = null;
		Static101.aByteArrayArray9 = null;
		Static28.anIntArray109 = null;
	}
}
