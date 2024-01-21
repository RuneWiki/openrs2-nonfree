import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
	public static int anInt3748;

	@OriginalMember(owner = "client!tg", name = "db", descriptor = "Lclient!c;")
	public static Class10 aClass10_129;

	@OriginalMember(owner = "client!tg", name = "gb", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!tg", name = "R", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1114 = Static38.method685("Hier wechseln");

	@OriginalMember(owner = "client!tg", name = "rb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1120 = Static38.method685("M");

	@OriginalMember(owner = "client!tg", name = "S", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1115 = aClass6_1120;

	@OriginalMember(owner = "client!tg", name = "ib", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1116 = Static38.method685("Click to switch");

	@OriginalMember(owner = "client!tg", name = "lb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1117 = Static38.method685("<img=0>");

	@OriginalMember(owner = "client!tg", name = "pb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1118 = aClass6_1120;

	@OriginalMember(owner = "client!tg", name = "qb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1119 = aClass6_1116;

	@OriginalMember(owner = "client!tg", name = "sb", descriptor = "I")
	public static int anInt3757 = 0;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
	public static void method2552() {
		for (@Pc(11) Class2_Sub3_Sub5_Sub5 local11 = (Class2_Sub3_Sub5_Sub5) Static112.aClass84_7.method2694(); local11 != null; local11 = (Class2_Sub3_Sub5_Sub5) Static112.aClass84_7.method2697()) {
			if (Static36.anInt1020 != local11.anInt3216 || Static107.anInt2559 > local11.anInt3221) {
				local11.method2808();
			} else if (local11.anInt3220 <= Static107.anInt2559) {
				if (local11.anInt3215 > 0) {
					@Pc(52) Class2_Sub3_Sub5_Sub1_Sub2 local52 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local11.anInt3215 - 1];
					if (local52 != null && local52.anInt2674 >= 0 && local52.anInt2674 < 13312 && local52.anInt2672 >= 0 && local52.anInt2672 < 13312) {
						local11.method2139(Static107.anInt2559, local52.anInt2674, local52.anInt2672, Static131.method2041(local52.anInt2674, local52.anInt2672, local11.anInt3216) - local11.anInt3225);
					}
				}
				if (local11.anInt3215 < 0) {
					@Pc(108) int local108 = -local11.anInt3215 - 1;
					@Pc(115) Class2_Sub3_Sub5_Sub1_Sub1 local115;
					if (Static68.anInt1727 == local108) {
						local115 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1;
					} else {
						local115 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local108];
					}
					if (local115 != null && local115.anInt2674 >= 0 && local115.anInt2674 < 13312 && local115.anInt2672 >= 0 && local115.anInt2672 < 13312) {
						local11.method2139(Static107.anInt2559, local115.anInt2674, local115.anInt2672, Static131.method2041(local115.anInt2674, local115.anInt2672, local11.anInt3216) - local11.anInt3225);
					}
				}
				local11.method2140(Static131.anInt3038);
				Static30.aClass44_1.method1267(Static36.anInt1020, (int) local11.aDouble4, (int) local11.aDouble3, (int) local11.aDouble8, 60, local11, local11.anInt3214, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V")
	public static void method2553() {
		anIntArray376 = null;
		aClass6_1117 = null;
		aClass6_1120 = null;
		aClass6_1116 = null;
		aClass6_1119 = null;
		aClass6_1114 = null;
		aClass10_129 = null;
		aClass6_1115 = null;
		aClass6_1118 = null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIB)I")
	public static int method2554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (arg1 + local7) / arg0 - local7;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)Lclient!ud;")
	public static Class2_Sub3_Sub16 method2555(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub3_Sub16 local10 = (Class2_Sub3_Sub16) Static144.aClass17_23.method505((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static165.method2626(aClass10_129, Static42.aClass10_49, arg0);
		if (local10 != null) {
			Static144.aClass17_23.method508((long) arg0, local10);
		}
		return local10;
	}
}
