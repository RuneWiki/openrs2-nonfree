import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!ta;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!th;")
	public static Class82 aClass82_17 = new Class82();

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1415 = Static161.method2971("<col=80ff00>");

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1416 = Static161.method2971("Ausw-=hlen");

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1418 = Static161.method2971("wave:");

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1417 = aClass13_1418;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1419 = Static161.method2971("<col=ff9040>");

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1420 = aClass13_1418;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method2995() {
		if (!Static46.aBoolean108) {
			return;
		}
		Static3.aClass1_Sub2_Sub1_Sub3_1 = null;
		Static68.anIntArray208 = null;
		Static138.aClass1_Sub2_Sub1_Sub3_7 = null;
		Static131.aClass1_Sub2_Sub1_Sub4Array12 = null;
		Static182.aClass1_Sub2_Sub1_Sub4Array6 = null;
		Static30.aClass1_Sub2_Sub1_Sub4_1 = null;
		Static89.aClass1_Sub2_Sub1_Sub4Array10 = null;
		Static73.anIntArray224 = null;
		Static19.anIntArray102 = null;
		Static183.aClass1_Sub2_Sub1_Sub4_4 = null;
		Static120.aClass1_Sub2_Sub1_Sub4Array11 = null;
		Static65.anIntArray200 = null;
		Static8.anIntArray34 = null;
		Static98.anIntArray392 = null;
		Static35.anIntArray128 = null;
		Static167.aClass1_Sub2_Sub1_Sub3_8 = null;
		Static63.aClass1_Sub2_Sub1_Sub3Array8 = null;
		Static38.aClass1_Sub2_Sub1_Sub3_3 = null;
		Static87.aClass1_Sub2_Sub1_Sub4Array9 = null;
		Static49.aClass1_Sub2_Sub1_Sub4_2 = null;
		Static80.aClass1_Sub2_Sub1_Sub4_3 = null;
		Static10.anIntArray47 = null;
		Static148.method2592();
		Static138.method2477(true);
		Static46.aBoolean108 = false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)I")
	public static int method2997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(14) int local14 = arg1;
			arg1 = arg4;
			arg4 = local14;
		}
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg5;
		} else if (local7 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return 7 + 1 - arg5 - arg4;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method2998() {
		aClass68_1 = null;
		aClass13_1415 = null;
		aClass13_1420 = null;
		aClass13_1418 = null;
		aClass13_1419 = null;
		aClass13_1417 = null;
		aClass13_1416 = null;
		aClass82_17 = null;
	}
}
