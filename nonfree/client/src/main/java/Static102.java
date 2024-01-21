import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!mc", name = "ib", descriptor = "[Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3[] aClass2_Sub4_Sub3_Sub3Array4;

	@OriginalMember(owner = "client!mc", name = "jb", descriptor = "Lclient!mc;")
	public static Class40_Sub1 aClass40_Sub1_74;

	@OriginalMember(owner = "client!mc", name = "mb", descriptor = "[Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4[] aClass2_Sub4_Sub3_Sub4Array8;

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1466 = Static107.method1838("(Udns");

	@OriginalMember(owner = "client!mc", name = "lb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1467 = Static107.method1838(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!mc", name = "pb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1468 = Static107.method1838("null");

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(Z)V")
	public static void method1794() {
		@Pc(7) int local7 = Static40.anInt1059;
		@Pc(9) int local9 = Static136.anInt3117;
		@Pc(11) int local11 = Static100.anInt2501;
		@Pc(15) int local15 = Static158.anInt3508;
		Static161.method2809(local7, local9, local11, local15, 6116423);
		Static161.method2809(local7 + 1, local9 - -1, local11 - 2, 16, 0);
		Static161.method2804(local7 + 1, local9 - -18, local11 - 2, local15 + -19, 0);
		Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2454(Static122.aClass28_1714, local7 + 3, local9 - -14, 6116423, -1);
		@Pc(64) int local64 = Static93.anInt2353;
		@Pc(66) int local66 = Static169.anInt3798;
		for (@Pc(68) int local68 = 0; local68 < Static150.anInt3365; local68++) {
			@Pc(72) int local72 = 16777215;
			@Pc(85) int local85 = (Static150.anInt3365 - local68 - 1) * 15 + local9 + 31;
			if (local64 > local7 && local7 + local11 > local64 && local85 - 13 < local66 && local66 < local85 + 3) {
				local72 = 16776960;
			}
			Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2454(Static136.method2141(local68), local7 + 3, local85, local72, 0);
		}
		Static45.method874(Static100.anInt2501, Static40.anInt1059, Static136.anInt3117, Static158.anInt3508);
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(Z)V")
	public static void method1798() {
		aClass2_Sub4_Sub3_Sub3Array4 = null;
		aClass2_Sub4_Sub3_Sub4Array8 = null;
		aClass40_Sub1_74 = null;
		aClass28_1467 = null;
		aClass28_1466 = null;
		aClass28_1468 = null;
	}
}
