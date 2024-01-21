import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
	public static int anInt2315;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "[Lclient!fd;")
	public static Class20[] aClass20Array2;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "Lclient!ag;")
	public static Class4 aClass4_54;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_768 = Static161.method2971(" x ");

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_769 = Static161.method2971("sch-Utteln:");

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Lclient!dd;")
	public static Class13 aClass13_770 = Static161.method2971("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "Lclient!dd;")
	private static Class13 aClass13_774 = Static161.method2971("Loading fonts )2 ");

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Lclient!dd;")
	public static Class13 aClass13_771 = aClass13_774;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
	public static int anInt2319 = -1;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "Lclient!dd;")
	public static Class13 aClass13_773 = Static161.method2971("cookiehost");

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!dd;I)I")
	public static int method1706(@OriginalArg(0) Class13 arg0) {
		return arg0.method904() + 1;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	public static void method1707() {
		aClass4_54 = null;
		aClass13_770 = null;
		aClass13_773 = null;
		aClass20Array2 = null;
		aClass13_771 = null;
		aClass13_769 = null;
		aClass13_768 = null;
		aClass13_774 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!fd;I)V")
	public static void method1709(@OriginalArg(0) Class20 arg0) {
		@Pc(6) int local6 = arg0.anInt1586;
		if (local6 == 324) {
			if (Static156.anInt3695 == -1) {
				Static156.anInt3695 = arg0.anInt1571;
				Static155.anInt4156 = arg0.anInt1551;
			}
			if (Static35.aClass6_1.aBoolean50) {
				arg0.anInt1571 = Static156.anInt3695;
			} else {
				arg0.anInt1571 = Static155.anInt4156;
			}
		} else if (local6 == 325) {
			if (Static156.anInt3695 == -1) {
				Static155.anInt4156 = arg0.anInt1551;
				Static156.anInt3695 = arg0.anInt1571;
			}
			if (Static35.aClass6_1.aBoolean50) {
				arg0.anInt1571 = Static155.anInt4156;
			} else {
				arg0.anInt1571 = Static156.anInt3695;
			}
		} else if (local6 == 327) {
			arg0.anInt1589 = 150;
			arg0.anInt1600 = (int) (Math.sin((double) Static78.anInt2168 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1595 = 5;
			arg0.anInt1556 = -1;
		} else if (local6 == 328) {
			if (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass13_847 == null) {
				arg0.anInt1556 = 0;
			} else {
				arg0.anInt1589 = 150;
				arg0.anInt1600 = (int) (Math.sin((double) Static78.anInt2168 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt1595 = 5;
				arg0.anInt1556 = ((int) Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.aClass13_847.method878() << 11) + 2047;
				arg0.anInt1553 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2549;
				arg0.anInt1588 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2593;
			}
		}
	}
}
