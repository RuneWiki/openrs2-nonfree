import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static152 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!ga;")
	public static Class30 aClass30_53;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	public static int anInt3545;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1330 = Static169.method2903("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1327 = aClass23_1330;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1328 = Static169.method2903("Existing User");

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1329 = aClass23_1328;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
	public static final int anInt3546 = 3353893;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	public static int anInt3549 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lclient!ed;")
	public static Class23 method2436(@OriginalArg(1) int arg0) {
		return Static104.aClass23Array12[arg0].method642() > 0 ? Static149.method2571(new Class23[] { Static102.aClass23Array11[arg0], Static88.aClass23_872, Static104.aClass23Array12[arg0] }) : Static102.aClass23Array11[arg0];
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public static void method2439() {
		aClass30_53 = null;
		aClass23_1329 = null;
		aClass23_1330 = null;
		aClass23_1328 = null;
		aClass23_1327 = null;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!ed;)V")
	public static void method2440(@OriginalArg(0) int arg0, @OriginalArg(2) Class23 arg1) {
		Static25.aClass1_Sub8_Sub1_1.method919(135);
		Static25.aClass1_Sub8_Sub1_1.method903(arg0);
		Static25.aClass1_Sub8_Sub1_1.method882(arg1.method643());
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!na;)V")
	public static void method2441(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg1) {
		if (Static26.anInt845 < arg1.anInt1854) {
			Static103.method1770(arg1);
		} else if (arg1.anInt1828 >= Static26.anInt845) {
			Static120.method2101(arg1);
		} else {
			Static98.method1673(arg1);
		}
		if (arg1.anInt1838 < 128 || arg1.anInt1825 < 128 || arg1.anInt1838 >= 13184 || arg1.anInt1825 >= 13184) {
			arg1.anInt1842 = -1;
			arg1.anInt1828 = 0;
			arg1.anInt1825 = arg1.anInt1824 * 64 + arg1.anIntArray248[0] * 128;
			arg1.anInt1854 = 0;
			arg1.anInt1853 = -1;
			arg1.anInt1838 = arg1.anInt1824 * 64 + arg1.anIntArray250[0] * 128;
			arg1.method1219();
		}
		if (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103 == arg1 && (arg1.anInt1838 < 1536 || arg1.anInt1825 < 1536 || arg1.anInt1838 >= 11776 || arg1.anInt1825 >= 11776)) {
			arg1.anInt1825 = arg1.anInt1824 * 64 + arg1.anIntArray248[0] * 128;
			arg1.anInt1842 = -1;
			arg1.anInt1828 = 0;
			arg1.anInt1854 = 0;
			arg1.anInt1838 = arg1.anInt1824 * 64 + arg1.anIntArray250[0] * 128;
			arg1.anInt1853 = -1;
			arg1.method1219();
		}
		Static91.method1596(arg1);
		Static47.method767(arg1);
	}
}
