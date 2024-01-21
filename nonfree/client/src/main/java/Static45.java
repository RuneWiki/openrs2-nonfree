import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static45 {

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_7;

	@OriginalMember(owner = "client!hb", name = "nb", descriptor = "B")
	public static byte aByte3;

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
	public static int anInt1202 = 0;

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
	public static int anInt1203 = 0;

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "Lclient!r;")
	private static Class61 aClass61_362 = Static129.method2060("wave:");

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "Lclient!r;")
	public static Class61 aClass61_360 = aClass61_362;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "[Lclient!nf;")
	public static Class53[] aClass53Array1 = new Class53[50];

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "Lclient!r;")
	public static Class61 aClass61_361 = Static129.method2060("(Y<)4col>");

	@OriginalMember(owner = "client!hb", name = "Y", descriptor = "Lclient!r;")
	public static Class61 aClass61_363 = Static129.method2060("Texturen geladen)3");

	@OriginalMember(owner = "client!hb", name = "db", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[104][104];

	@OriginalMember(owner = "client!hb", name = "jb", descriptor = "Lclient!r;")
	public static Class61 aClass61_364 = Static129.method2060("headicons_hint");

	@OriginalMember(owner = "client!hb", name = "mb", descriptor = "Lclient!r;")
	public static Class61 aClass61_365 = aClass61_362;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
	public static void method852() {
		aClass61_363 = null;
		aClass26_Sub1_7 = null;
		aClass61_365 = null;
		aClass53Array1 = null;
		aClass61_364 = null;
		aClass61_360 = null;
		aClass61_361 = null;
		aClass61_362 = null;
		anIntArrayArray11 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB)V")
	public static void method853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static52.anInt1345 != 0 && arg0 != -1) {
			Static89.method1571(0, Static52.anInt1345, Static19.aClass26_Sub1_3, arg0);
			Static78.aBoolean75 = true;
		}
	}
}
