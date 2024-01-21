import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fb", name = "wb", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!fb", name = "db", descriptor = "Lclient!u;")
	private static Class74 aClass74_602 = Static72.method1077("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!fb", name = "Z", descriptor = "Lclient!u;")
	public static Class74 aClass74_600 = aClass74_602;

	@OriginalMember(owner = "client!fb", name = "ab", descriptor = "Lclient!u;")
	private static Class74 aClass74_601 = Static72.method1077(" from your ignore list first");

	@OriginalMember(owner = "client!fb", name = "bb", descriptor = "J")
	public static long aLong34 = 0L;

	@OriginalMember(owner = "client!fb", name = "eb", descriptor = "Lclient!u;")
	public static Class74 aClass74_603 = Static72.method1077("::fpsoff");

	@OriginalMember(owner = "client!fb", name = "fb", descriptor = "Lclient!u;")
	public static Class74 aClass74_604 = Static72.method1077("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!fb", name = "jb", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!fb", name = "nb", descriptor = "Lclient!u;")
	public static Class74 aClass74_605 = aClass74_601;

	@OriginalMember(owner = "client!fb", name = "pb", descriptor = "I")
	public static int anInt817 = 2;

	@OriginalMember(owner = "client!fb", name = "qb", descriptor = "Lclient!u;")
	public static Class74 aClass74_606 = Static72.method1077("@gr2@");

	@OriginalMember(owner = "client!fb", name = "xb", descriptor = "[I")
	public static int[] anIntArray97 = new int[50];

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
	public static void method586() {
		for (@Pc(10) Class2_Sub2_Sub2_Sub4 local10 = (Class2_Sub2_Sub2_Sub4) Static113.aClass13_58.method415(); local10 != null; local10 = (Class2_Sub2_Sub2_Sub4) Static113.aClass13_58.method414()) {
			if (local10.anInt1315 != Static117.anInt2529 || local10.aBoolean49) {
				local10.method1930();
			} else if (local10.anInt1324 <= Static107.anInt2338) {
				local10.method915(Static15.anInt429);
				if (local10.aBoolean49) {
					local10.method1930();
				} else {
					Static84.aClass69_1.method1637(local10.anInt1315, local10.anInt1320, local10.anInt1317, local10.anInt1330, 60, local10, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
	public static void method587() {
		Static107.anInt2342 = 0;
		Static17.anInt548 = 0;
		Static71.method1070();
		Static124.method1870();
		Static14.method338();
		Static104.method1902();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static17.anInt548; local19++) {
			local25 = Static85.anIntArray257[local19];
			if (Static107.anInt2338 != Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local25].anInt2681) {
				Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local25] = null;
			}
		}
		if (Static16.anInt463 != Static19.aClass2_Sub10_Sub1_1.anInt2187) {
			throw new RuntimeException("gpp1 pos:" + Static19.aClass2_Sub10_Sub1_1.anInt2187 + " psize:" + Static16.anInt463);
		}
		for (local25 = 0; local25 < Static10.anInt320; local25++) {
			if (Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[Static92.anIntArray267[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static10.anInt320);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public static void method588() {
		anIntArray97 = null;
		aClass74_601 = null;
		aClass74_605 = null;
		aClass74_602 = null;
		aClass74_600 = null;
		aClass74_604 = null;
		anIntArray96 = null;
		aClass74_606 = null;
		aClass74_603 = null;
	}
}
