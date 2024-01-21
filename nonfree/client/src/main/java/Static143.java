import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!rg", name = "A", descriptor = "Lclient!nb;")
	public static Class57 aClass57_23 = new Class57(64);

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
	public static int anInt3278 = 0;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
	public static int anInt3279 = 0;

	@OriginalMember(owner = "client!rg", name = "D", descriptor = "[Lclient!kb;")
	public static Class46[] aClass46Array19 = new Class46[100];

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "[I")
	public static int[] anIntArray376 = new int[128];

	@OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
	public static int anInt3282 = 0;

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1138 = Static65.method1172("Choose Option");

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1139 = Static65.method1172(" has logged in)3");

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1140 = aClass46_1138;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1141 = aClass46_1139;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
	public static void method2384() {
		@Pc(3) int local3 = Static56.anInt1516;
		@Pc(5) int local5 = Static163.anInt3620;
		@Pc(11) int local11 = Static39.anInt3979;
		@Pc(13) int local13 = Static33.anInt924;
		Static103.method2210(local5, local3, local11, local13, 6116423);
		Static103.method2210(local5 + 1, local3 + 1, local11 - 2, 16, 0);
		Static103.method2228(local5 + 1, local3 + 18, local11 - 2, local13 - 19, 0);
		Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method821(aClass46_1140, local5 + 3, local3 + 14, 6116423, -1);
		@Pc(65) int local65 = Static149.anInt3582;
		@Pc(67) int local67 = Static85.anInt676;
		for (@Pc(69) int local69 = 0; local69 < Static87.anInt2129; local69++) {
			@Pc(84) int local84 = local3 + (Static87.anInt2129 - local69 - 1) * 15 + 31;
			@Pc(86) int local86 = 16777215;
			if (local67 > local5 && local67 < local11 + local5 && local84 - 13 < local65 && local65 < local84 + 3) {
				local86 = 16776960;
			}
			Static58.aClass3_Sub2_Sub3_Sub1_Sub1_4.method821(Static178.method2859(local69), local5 + 3, local84, local86, 0);
		}
		Static126.method2150(Static56.anInt1516, Static39.anInt3979, Static163.anInt3620, Static33.anInt924);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public static void method2385() {
		aClass46_1140 = null;
		aClass46_1139 = null;
		aClass46_1138 = null;
		aClass46_1141 = null;
		aClass46Array19 = null;
		anIntArray376 = null;
		aClass57_23 = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)Z")
	public static boolean method2386(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
