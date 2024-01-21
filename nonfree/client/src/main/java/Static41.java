import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Lclient!ce;")
	public static Class13 aClass13_3;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Lclient!ac;")
	public static Class3 aClass3_3;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!wb;")
	private static Class65 aClass65_568 = Static24.method441("Your account has been disabled)3");

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!wb;")
	public static Class65 aClass65_569 = Static24.method441("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!he", name = "r", descriptor = "Lclient!wb;")
	private static Class65 aClass65_576 = Static24.method441("Loaded wordpack");

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!wb;")
	public static Class65 aClass65_570 = aClass65_576;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	public static int anInt1300 = 1;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!wb;")
	public static Class65 aClass65_571 = Static24.method441("@red@");

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!wb;")
	public static Class65 aClass65_572 = Static24.method441("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_573 = Static24.method441("@gr2@");

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Lclient!wb;")
	public static Class65 aClass65_574 = aClass65_568;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "I")
	public static int anInt1302 = 0;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "B")
	public static byte aByte2 = 0;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "[I")
	public static int[] anIntArray171 = new int[500];

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Lclient!wb;")
	public static Class65 aClass65_575 = Static24.method441("Konfig geladen)3");

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method787() {
		anIntArray171 = null;
		aClass65_571 = null;
		aClass65_570 = null;
		aClass13_3 = null;
		aClass65_576 = null;
		aClass65_572 = null;
		aClass65_574 = null;
		aClass65_568 = null;
		aClass65_575 = null;
		aClass3_3 = null;
		anIntArray170 = null;
		aClass65_573 = null;
		aClass65_569 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	public static void method788() {
		for (@Pc(10) Class2_Sub1_Sub1_Sub5 local10 = (Class2_Sub1_Sub1_Sub5) Static36.aClass52_6.method1587(); local10 != null; local10 = (Class2_Sub1_Sub1_Sub5) Static36.aClass52_6.method1588()) {
			if (local10.anInt2174 != Static62.anInt1879 || local10.aBoolean113) {
				local10.method1794();
			} else if (Static108.anInt2902 >= local10.anInt2177) {
				local10.method1290(Static28.anInt794);
				if (local10.aBoolean113) {
					local10.method1794();
				} else {
					Static67.aClass18_1.method576(local10.anInt2174, local10.anInt2172, local10.anInt2164, local10.anInt2170, 60, local10, 0, -1, false);
				}
			}
		}
	}
}
