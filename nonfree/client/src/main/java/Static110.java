import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!o", name = "Z", descriptor = "[Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3[] aClass3_Sub2_Sub2_Sub3Array7;

	@OriginalMember(owner = "client!o", name = "eb", descriptor = "Lclient!ah;")
	public static Class7 aClass7_48;

	@OriginalMember(owner = "client!o", name = "ob", descriptor = "Lclient!dd;")
	public static Class19 aClass19_3;

	@OriginalMember(owner = "client!o", name = "cb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_915 = Static170.method3101("Examine");

	@OriginalMember(owner = "client!o", name = "db", descriptor = "Lclient!pa;")
	public static Class63 aClass63_19 = new Class63(64);

	@OriginalMember(owner = "client!o", name = "mb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_916 = aClass28_915;

	@OriginalMember(owner = "client!o", name = "nb", descriptor = "Lclient!ea;")
	public static Class23 aClass23_12 = new Class23();

	@OriginalMember(owner = "client!o", name = "qb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_918 = Static170.method3101("Type");

	@OriginalMember(owner = "client!o", name = "pb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_917 = aClass28_918;

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[104][104];

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public static void method2233() {
		if (Static45.aClass30_1 != null) {
			Static45.aClass30_1.method2685();
		}
		if (Static166.aClass30_2 != null) {
			Static166.aClass30_2.method2685();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public static void method2234(@OriginalArg(0) int arg0) {
		Static75.method1728();
		Static100.method2106();
		@Pc(12) int local12 = Static120.method2408(arg0).anInt2530;
		if (local12 == 0) {
			return;
		}
		@Pc(26) int local26 = Static72.anIntArray354[arg0];
		if (local12 == 1) {
			Static90.anInt2571 = local26;
			if (Static90.anInt2571 == 1) {
				Static13.method523(0.9F);
			}
			if (Static90.anInt2571 == 2) {
				Static13.method523(0.8F);
			}
			if (Static90.anInt2571 == 3) {
				Static13.method523(0.7F);
			}
			if (Static90.anInt2571 == 4) {
				Static13.method523(0.6F);
			}
			Static47.method1122();
		}
		if (local12 == 3) {
			@Pc(64) short local64 = 0;
			if (local26 == 0) {
				local64 = 255;
			}
			if (local26 == 1) {
				local64 = 192;
			}
			if (local26 == 2) {
				local64 = 128;
			}
			if (local26 == 3) {
				local64 = 64;
			}
			if (local26 == 4) {
				local64 = 0;
			}
			if (Static126.anInt3243 != local64) {
				if (Static126.anInt3243 == 0 && Static93.anInt2608 != -1) {
					Static68.method1631(Static93.anInt2608, 0, Static164.aClass7_Sub1_17, local64);
					Static61.aBoolean101 = false;
				} else if (local64 == 0) {
					Static166.method3062();
					Static61.aBoolean101 = false;
				} else {
					Static57.method1257(local64);
				}
				Static126.anInt3243 = local64;
			}
		}
		if (local12 == 4) {
			if (local26 == 0) {
				Static51.anInt1448 = 127;
			}
			if (local26 == 1) {
				Static51.anInt1448 = 96;
			}
			if (local26 == 2) {
				Static51.anInt1448 = 64;
			}
			if (local26 == 3) {
				Static51.anInt1448 = 32;
			}
			if (local26 == 4) {
				Static51.anInt1448 = 0;
			}
		}
		if (local12 == 6) {
			Static74.anInt2220 = local26;
		}
		if (local12 == 5) {
			Static5.anInt131 = local26;
		}
		if (local12 == 9) {
			Static7.anInt223 = local26;
		}
		if (local12 != 10) {
			return;
		}
		if (local26 == 0) {
			Static138.anInt3540 = 127;
		}
		if (local26 == 1) {
			Static138.anInt3540 = 96;
		}
		if (local26 == 2) {
			Static138.anInt3540 = 64;
		}
		if (local26 == 3) {
			Static138.anInt3540 = 32;
		}
		if (local26 == 4) {
			Static138.anInt3540 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
	public static void method2236() {
		aClass3_Sub2_Sub2_Sub3Array7 = null;
		aClass23_12 = null;
		aClass19_3 = null;
		aClass7_48 = null;
		aClass28_918 = null;
		aClass63_19 = null;
		aClass28_917 = null;
		anIntArrayArray23 = null;
		aClass28_916 = null;
		aClass28_915 = null;
	}
}
