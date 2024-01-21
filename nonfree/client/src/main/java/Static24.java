import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "[Lclient!h;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!me;")
	public static Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3 aClass3_Sub2_Sub3_Sub3_5;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "Lclient!ef;")
	public static Class3_Sub2_Sub3_Sub1_Sub1 aClass3_Sub2_Sub3_Sub1_Sub1_2;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!kb;")
	public static Class46 aClass46_152 = Static65.method1172("(Z");

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
	public static int[] anIntArray40 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
	public static final int anInt555 = 2301979;

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
	public static int anInt561 = -1;

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "Lclient!kb;")
	private static Class46 aClass46_153 = Static65.method1172("Loaded sprites");

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "Lclient!kb;")
	public static Class46 aClass46_154 = aClass46_153;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method415() {
		aClass44_Sub1_1 = null;
		aClass33Array1 = null;
		aClass46_153 = null;
		aClass46_152 = null;
		aClass46_154 = null;
		aClass3_Sub2_Sub3_Sub1_Sub1_2 = null;
		aClass3_Sub2_Sub3_Sub3_5 = null;
		anIntArray40 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method416() {
		if (!Static90.aBoolean94) {
			return;
		}
		@Pc(16) Class33 local16 = Static98.method1607(Static167.anInt740, Static130.anInt3069);
		if (local16 != null && local16.anObjectArray18 != null) {
			@Pc(25) Class3_Sub14 local25 = new Class3_Sub14();
			local25.anObjectArray28 = local16.anObjectArray18;
			local25.aClass33_10 = local16;
			Static71.method1217(local25);
		}
		Static90.aBoolean94 = false;
		Static142.method2373(local16);
	}
}
