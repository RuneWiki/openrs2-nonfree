import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_607 = Static161.method2971("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Lclient!dd;")
	private static Class13 aClass13_610 = Static161.method2971("Use");

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_608 = aClass13_610;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!dd;")
	private static Class13 aClass13_611 = Static161.method2971("wishes to trade with you)3");

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_609 = aClass13_611;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	public static volatile int anInt1802 = -1;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "[I")
	public static int[] anIntArray188 = new int[128];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method1343() {
		if (Static30.aBoolean72 && Static136.anInt3397 != Static156.anInt3696) {
			Static66.method1446(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], Static156.anInt3696, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], Static26.anInt960, Static82.anInt2315);
		} else if (Static156.anInt3696 != Static87.anInt2472) {
			Static87.anInt2472 = Static156.anInt3696;
			Static6.method271(Static156.anInt3696);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ag;Lclient!ag;BLclient!ag;)V")
	public static void method1344(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) Class4 arg2) {
		Static56.anInt1796 = arg0.method2241(Static49.aClass13_546);
		Static95.anInt2769 = arg2.method2241(Static85.aClass13_806);
		Static182.anInt937 = arg2.method2241(Static77.aClass13_732);
		Static118.anInt3125 = arg2.method2241(Static103.aClass13_949);
		Static143.anInt3527 = arg2.method2241(Static70.aClass13_684);
		Static159.anInt3768 = arg2.method2241(Static18.aClass13_266);
		Static121.anInt3152 = arg2.method2241(Static98.aClass13_1288);
		Static96.anInt2774 = arg2.method2241(Static111.aClass13_1002);
		Static157.anInt3726 = arg2.method2241(Static110.aClass13_998);
		Static187.anInt4124 = arg2.method2241(Static126.aClass13_1083);
		Static98.anInt3737 = arg2.method2241(Static106.aClass13_956);
		Static51.anInt1674 = arg1.method2241(Static83.aClass13_778);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZ)I")
	public static int method1346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method1347() {
		aClass13_608 = null;
		aClass13_610 = null;
		aClass13_609 = null;
		anIntArray188 = null;
		aClass13_611 = null;
		aClass13_607 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([Lclient!dd;B)Lclient!dd;")
	public static Class13 method1349(@OriginalArg(0) Class13[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static70.method1464(arg0, arg0.length, 0);
	}
}
