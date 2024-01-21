import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "Lclient!lh;")
	public static Class2_Sub8_Sub3 aClass2_Sub8_Sub3_1;

	@OriginalMember(owner = "client!ng", name = "J", descriptor = "[Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4[] aClass2_Sub4_Sub3_Sub4Array9;

	@OriginalMember(owner = "client!ng", name = "M", descriptor = "Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4 aClass2_Sub4_Sub3_Sub4_6;

	@OriginalMember(owner = "client!ng", name = "W", descriptor = "I")
	public static int anInt2749;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1597 = Static107.method1838("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
	public static int anInt2734 = 0;

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1598 = Static107.method1838("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1599 = Static107.method1838("Free world");

	@OriginalMember(owner = "client!ng", name = "Z", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1603 = Static107.method1838("Malformed login packet)3");

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1600 = aClass28_1603;

	@OriginalMember(owner = "client!ng", name = "P", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1601 = aClass28_1599;

	@OriginalMember(owner = "client!ng", name = "T", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1602 = Static107.method1838("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ng", name = "Y", descriptor = "I")
	public static int anInt2751 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
	public static void method1896() {
		aClass28_1602 = null;
		aClass28_1599 = null;
		aClass28_1601 = null;
		aClass2_Sub8_Sub3_1 = null;
		aClass28_1598 = null;
		aClass2_Sub4_Sub3_Sub4_6 = null;
		aClass2_Sub4_Sub3_Sub4Array9 = null;
		aClass28_1603 = null;
		aClass28_1597 = null;
		aClass28_1600 = null;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	public static void method1897() {
		Static84.anInt2126 = 0;
		Static83.anInt2114 = 0;
		Static4.method132();
		Static29.method605();
		Static9.method304();
		Static96.method1718();
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static84.anInt2126; local24++) {
			local30 = Static115.anIntArray262[local24];
			if (Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local30].anInt1650 != Static156.anInt3491) {
				Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local30] = null;
			}
		}
		if (Static103.anInt2571 != Static151.aClass2_Sub2_Sub1_3.anInt2385) {
			throw new RuntimeException("gpp1 pos:" + Static151.aClass2_Sub2_Sub1_3.anInt2385 + " psize:" + Static103.anInt2571);
		}
		for (local30 = 0; local30 < Static35.anInt973; local30++) {
			if (Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[Static160.anIntArray327[local30]] == null) {
				throw new RuntimeException("gpp2 pos:" + local30 + " size:" + Static35.anInt973);
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZII[I)I")
	public static int method1898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		return arg0 * arg2[0] + arg1 * arg2[1];
	}
}
