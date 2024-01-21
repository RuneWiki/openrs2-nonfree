import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString5;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!bc;")
	public static Class8 aClass8_29 = new Class8(64);

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean44 = true;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_470 = Static119.method1462("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!pe;")
	private static Class65 aClass65_472 = Static119.method1462("Please contact customer support)3");

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!pe;")
	public static Class65 aClass65_471 = aClass65_472;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "[Lclient!be;")
	public static Class2_Sub4[] aClass2_Sub4Array1 = new Class2_Sub4[2048];

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "Lclient!pe;")
	private static Class65 aClass65_473 = Static119.method1462("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!pe;")
	public static Class65 aClass65_474 = Static119.method1462("Texturen geladen)3");

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!pe;")
	public static Class65 aClass65_475 = Static119.method1462("(U5");

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "J")
	public static long aLong33 = 0L;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Lclient!pe;")
	public static Class65 aClass65_476 = Static119.method1462("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Lclient!pe;")
	private static Class65 aClass65_478 = Static119.method1462("Loading config )2 ");

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_477 = aClass65_478;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_479 = aClass65_473;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	public static void method740() {
		aClass65_479 = null;
		aClass65_478 = null;
		aClass2_Sub4Array1 = null;
		aClass8_29 = null;
		aClass65_477 = null;
		aByteArrayArray4 = null;
		Class35.anIntArray120 = null;
		aClass65_473 = null;
		aClass65_472 = null;
		aClass65_471 = null;
		aClass65_470 = null;
		aClass65_475 = null;
		aClass65_474 = null;
		aString5 = null;
		aClass65_476 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Z")
	public static boolean method741(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	public static void method742(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static100.aBoolean92) {
			Static36.method650();
		} else if (arg0 != -1 && arg0 != Static105.anInt2364 && Static39.anInt840 != 0 && !Static100.aBoolean92) {
			Static108.method1745(0, Static39.anInt840, arg0, Static88.aClass56_Sub1_19);
		}
		Static105.anInt2364 = arg0;
	}
}
