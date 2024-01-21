import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!tb", name = "db", descriptor = "Lclient!sf;")
	public static Class5 aClass5_82;

	@OriginalMember(owner = "client!tb", name = "Ab", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1520 = Static106.method1849("Please reload this page)3");

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1515 = aClass66_1520;

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
	public static int anInt2653 = 0;

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1516 = Static106.method1849(")3runescape)3com");

	@OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
	public static int anInt2655 = 0;

	@OriginalMember(owner = "client!tb", name = "nb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1517 = Static106.method1849("p12_full");

	@OriginalMember(owner = "client!tb", name = "qb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1518 = Static106.method1849(" <col=00ff80>");

	@OriginalMember(owner = "client!tb", name = "vb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1519 = Static106.method1849("");

	@OriginalMember(owner = "client!tb", name = "Bb", descriptor = "I")
	public static int anInt2665 = 1;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)I")
	public static int method1871() {
		return 6;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
	public static void method1873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static104.anInt2558 = -1;
			Static13.anInt454 = -1;
			return;
		}
		@Pc(31) int local31 = Static77.method1476(arg2, Static22.anInt635, arg0) - arg1;
		@Pc(35) int local35 = local31 - Static51.anInt1580;
		@Pc(39) int local39 = arg2 - Static1.anInt70;
		@Pc(43) int local43 = Class1_Sub1_Sub2_Sub4.anIntArray399[Static131.anInt2696];
		@Pc(47) int local47 = Class1_Sub1_Sub2_Sub4.anIntArray399[Static1.anInt76];
		@Pc(51) int local51 = arg0 - Static122.anInt2830;
		@Pc(55) int local55 = Class1_Sub1_Sub2_Sub4.anIntArray397[Static131.anInt2696];
		@Pc(59) int local59 = Class1_Sub1_Sub2_Sub4.anIntArray397[Static1.anInt76];
		@Pc(77) int local77 = local51 * local59 + local39 * local47 >> 16;
		@Pc(88) int local88 = local39 * local59 - local51 * local47 >> 16;
		@Pc(90) int local90 = local77;
		@Pc(101) int local101 = local55 * local35 - local88 * local43 >> 16;
		@Pc(111) int local111 = local43 * local35 + local88 * local55 >> 16;
		if (local111 < 50) {
			Static104.anInt2558 = -1;
			Static13.anInt454 = -1;
		} else {
			Static13.anInt454 = (local90 << 9) / local111 + 256;
			Static104.anInt2558 = (local101 << 9) / local111 + 167;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method1877() {
		aClass66_1520 = null;
		aClass66_1515 = null;
		aClass66_1516 = null;
		aClass66_1519 = null;
		aClass66_1517 = null;
		aClass66_1518 = null;
		aClass5_82 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)Z")
	public static boolean method1878(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static98.anIntArray419[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1004;
	}
}
