import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!he", name = "f", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "J")
	public static volatile long aLong64 = 0L;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Lclient!oc;")
	public static Class1_Sub16 aClass1_Sub16_1 = new Class1_Sub16(0, 0);

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!dd;")
	private static Class13 aClass13_677 = Static161.method2971("Error loading your profile)3");

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_675 = aClass13_677;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_676 = Static161.method2971("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!dd;)V")
	public static void method1455(@OriginalArg(1) Class13 arg0) {
		if (Static23.anInt1009 >= 2) {
			if (arg0.method894(Static138.aClass13_1178)) {
				System.gc();
			}
			if (arg0.method894(Static64.aClass13_655)) {
				Static49.method1238();
			}
			if (arg0.method894(Static160.aClass13_1300)) {
				Static162.aBoolean293 = true;
			}
			if (arg0.method894(Static50.aClass13_558)) {
				Static162.aBoolean293 = false;
			}
			arg0.method894(Static35.aClass13_415);
			arg0.method894(Static89.aClass13_832);
			if (arg0.method894(Static38.aClass13_432)) {
				for (@Pc(57) int local57 = 0; local57 < 4; local57++) {
					for (@Pc(61) int local61 = 1; local61 < 103; local61++) {
						for (@Pc(65) int local65 = 1; local65 < 103; local65++) {
							Static149.aClass12Array1[local57].anIntArrayArray7[local61][local65] = 0;
						}
					}
				}
			}
			if (arg0.method892(Static77.aClass13_733) && Static21.anInt787 != 0) {
				Static119.method2232(arg0.method901(6).method887());
			}
			if (arg0.method894(Static53.aClass13_587) && Static21.anInt787 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method892(Static33.aClass13_397)) {
				Static139.anInt3458 = arg0.method901(12).method897().method887();
				Static169.method2887(null, Static57.method1349(new Class13[] { Static147.aClass13_1233, Static3.method75(Static139.anInt3458) }), 0);
			}
			if (arg0.method894(Static50.aClass13_551)) {
				Static184.aBoolean317 = true;
			}
		}
		Static1.aClass1_Sub8_Sub1_1.method1654(180);
		Static1.aClass1_Sub8_Sub1_1.method1643(arg0.method904() - 1);
		Static1.aClass1_Sub8_Sub1_1.method1639(arg0.method901(2));
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method1456() {
		aClass13_675 = null;
		anIntArray208 = null;
		aClass13_676 = null;
		aClass1_Sub16_1 = null;
		aClass13_677 = null;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method1457() {
		if (Static45.anIntArray153 != null && Static3.anIntArray6 != null) {
			return;
		}
		Static3.anIntArray6 = new int[256];
		Static45.anIntArray153 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(27) double local27 = (double) local18 / 255.0D * 6.283185307179586D;
			Static45.anIntArray153[local18] = (int) (Math.sin(local27) * 4096.0D);
			Static3.anIntArray6[local18] = (int) (Math.cos(local27) * 4096.0D);
		}
	}
}
