import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!h", name = "i", descriptor = "Lclient!g;")
	public static Class26 aClass26_7;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_20;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "[I")
	public static int[] anIntArray113;

	@OriginalMember(owner = "client!h", name = "w", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_21;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Lclient!r;")
	public static Class2_Sub10_Sub1 aClass2_Sub10_Sub1_2 = new Class2_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!u;")
	private static Class74 aClass74_700 = Static72.method1077("Unable to connect)3");

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Lclient!u;")
	private static Class74 aClass74_703 = Static72.method1077("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!u;")
	public static Class74 aClass74_701 = aClass74_703;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_702 = Static72.method1077("@whi@");

	@OriginalMember(owner = "client!h", name = "l", descriptor = "I")
	public static int anInt979 = 0;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "I")
	public static int anInt980 = 3;

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Lclient!u;")
	public static Class74 aClass74_704 = aClass74_700;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!u;")
	public static Class74 aClass74_705 = aClass74_700;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "I")
	public static int anInt982 = -1;

	@OriginalMember(owner = "client!h", name = "x", descriptor = "Lclient!u;")
	public static Class74 aClass74_706 = Static72.method1077("null");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(JB)V")
	public static void method675(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static101.anInt2247 >= 100) {
			Static67.method1024(0, Static97.aClass74_1736, Static37.aClass74_1322);
			return;
		}
		@Pc(27) Class74 local27 = Static112.method1686(arg0).method1720();
		for (@Pc(29) int local29 = 0; local29 < Static101.anInt2247; local29++) {
			if (arg0 == Static10.aLongArray6[local29]) {
				Static67.method1024(0, Static97.aClass74_1736, Static91.method1340(new Class74[] { local27, Static29.aClass74_534 }));
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static65.anInt1450; local66++) {
			if (arg0 == Static6.aLongArray2[local66]) {
				Static67.method1024(0, Static97.aClass74_1736, Static91.method1340(new Class74[] { Static19.aClass74_446, local27, Static79.aClass74_1211 }));
				return;
			}
		}
		if (!local27.method1733(Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass74_1661)) {
			Static10.aLongArray6[Static101.anInt2247++] = arg0;
			Static116.aBoolean107 = true;
			Static128.aClass2_Sub10_Sub1_3.method1533(107);
			Static128.aClass2_Sub10_Sub1_3.method1495(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method676() {
		aClass74_704 = null;
		anIntArray113 = null;
		aClass26_7 = null;
		aClass2_Sub2_Sub1_Sub1_20 = null;
		aClass2_Sub10_Sub1_2 = null;
		aClass74_706 = null;
		aClass74_701 = null;
		aClass74_702 = null;
		aClass74_705 = null;
		aClass74_700 = null;
		aClass2_Sub2_Sub1_Sub1_21 = null;
		aClass74_703 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ba;Z)V")
	public static void method677(@OriginalArg(0) Class2_Sub2_Sub2_Sub1 arg0) {
		if (arg0.anInt2680 == 0) {
			arg0.anInt2705 = 1024;
		}
		arg0.anInt2709 = 0;
		@Pc(23) int local23 = arg0.anInt2701 - Static107.anInt2338;
		if (arg0.anInt2680 == 1) {
			arg0.anInt2705 = 1536;
		}
		@Pc(42) int local42 = arg0.anInt2703 * 64 + arg0.anInt2702 * 128;
		@Pc(52) int local52 = arg0.anInt2703 * 64 + arg0.anInt2686 * 128;
		if (arg0.anInt2680 == 2) {
			arg0.anInt2705 = 0;
		}
		arg0.anInt2672 += (local52 - arg0.anInt2672) / local23;
		arg0.anInt2673 += (local42 - arg0.anInt2673) / local23;
		if (arg0.anInt2680 == 3) {
			arg0.anInt2705 = 512;
		}
	}
}
