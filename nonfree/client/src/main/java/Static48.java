import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Lclient!kc;")
	public static Class22 aClass22_10;

	@OriginalMember(owner = "client!he", name = "F", descriptor = "I")
	public static int anInt1506;

	@OriginalMember(owner = "client!he", name = "u", descriptor = "I")
	public static int anInt1498 = 0;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "Lclient!wd;")
	public static Class80 aClass80_533 = Static2.method59("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!he", name = "x", descriptor = "Lclient!wd;")
	public static Class80 aClass80_534 = Static2.method59("Untersuchen");

	@OriginalMember(owner = "client!he", name = "y", descriptor = "Lclient!wd;")
	public static Class80 aClass80_535 = Static2.method59(")2");

	@OriginalMember(owner = "client!he", name = "M", descriptor = "Lclient!wd;")
	private static Class80 aClass80_536 = Static2.method59("Sorry invited players only)3");

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Lclient!wd;")
	public static Class80 aClass80_537 = aClass80_536;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
	public static void method873() {
		aClass22_10 = null;
		aClass80_534 = null;
		aClass80_535 = null;
		aClass80_536 = null;
		aClass80_537 = null;
		aClass80_533 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(JB)V")
	public static void method874(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static45.anInt2090 >= 100 && Static6.anInt170 != 1 || Static45.anInt2090 >= 200) {
			Static3.method65(0, Static96.aClass80_967, Static40.aClass80_446);
			return;
		}
		@Pc(33) Class80 local33 = Static102.method1658(arg0).method2000();
		for (@Pc(35) int local35 = 0; local35 < Static45.anInt2090; local35++) {
			if (Static3.aLongArray1[local35] == arg0) {
				Static3.method65(0, Static93.method1444(new Class80[] { local33, Static76.aClass80_759 }), Static40.aClass80_446);
				return;
			}
		}
		for (@Pc(78) int local78 = 0; local78 < Static64.anInt1824; local78++) {
			if (arg0 == Static64.aLongArray5[local78]) {
				Static3.method65(0, Static93.method1444(new Class80[] { Static62.aClass80_661, local33, Static1.aClass80_1 }), Static40.aClass80_446);
				return;
			}
		}
		if (local33.method2017(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.aClass80_924)) {
			return;
		}
		Static123.aClass80Array20[Static45.anInt2090] = local33;
		Static3.aLongArray1[Static45.anInt2090] = arg0;
		Static29.anIntArray125[Static45.anInt2090] = 0;
		Static118.anIntArray401[Static45.anInt2090] = 0;
		Static70.aBoolean131 = true;
		Static106.anInt2836 = Static10.anInt300 + 1;
		Static45.anInt2090++;
		Static120.aClass2_Sub17_Sub1_3.method1799(100);
		Static120.aClass2_Sub17_Sub1_3.method1772(arg0);
	}
}
