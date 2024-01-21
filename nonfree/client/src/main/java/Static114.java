import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "[Lclient!he;")
	public static Class26[] aClass26Array25 = new Class26[8];

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "Lclient!he;")
	public static Class26 aClass26_1624 = Static6.method100("null");

	@OriginalMember(owner = "client!tf", name = "U", descriptor = "Lclient!he;")
	public static Class26 aClass26_1625 = Static6.method100("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!tf", name = "Y", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!tf", name = "Z", descriptor = "Lclient!we;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!tf", name = "bb", descriptor = "Lclient!he;")
	public static Class26 aClass26_1626 = Static6.method100(" ");

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
	public static int method2076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static93.method1685(4, arg1 + 45365, arg0 + 91923) + (Static93.method1685(2, arg1 - -10294, arg0 + 37821) - 128 >> 1) + (Static93.method1685(1, arg1, arg0) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
	public static void method2077() {
		if (!Static79.aBoolean117) {
			return;
		}
		Static106.anIntArray344 = null;
		Static118.anIntArray376 = null;
		Static19.aClass3_Sub1_Sub4_Sub3Array5 = null;
		Static52.aClass3_Sub1_Sub4_Sub1_7 = null;
		Static49.aClass3_Sub1_Sub4_Sub1Array6 = null;
		Static109.aClass3_Sub1_Sub4_Sub3_5 = null;
		Static98.aClass3_Sub1_Sub4_Sub1Array10 = null;
		Static31.aClass3_Sub1_Sub4_Sub1_9 = null;
		Static87.anIntArray292 = null;
		Static133.aClass3_Sub1_Sub4_Sub1Array5 = null;
		Static131.aClass3_Sub1_Sub4_Sub1Array11 = null;
		Static18.aClass3_Sub1_Sub4_Sub1Array3 = null;
		Static106.anIntArray340 = null;
		Static124.anIntArray384 = null;
		Static119.anIntArray380 = null;
		Static130.anIntArray407 = null;
		Static39.aClass3_Sub1_Sub4_Sub1_6 = null;
		Static31.aClass3_Sub1_Sub4_Sub1_8 = null;
		Static2.anIntArray3 = null;
		Static55.aClass3_Sub1_Sub4_Sub3_2 = null;
		Static53.method1089();
		Static58.method1182(true);
		Static79.aBoolean117 = false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLclient!m;)Lclient!he;")
	public static Class26 method2078(@OriginalArg(1) Class3_Sub11 arg0) {
		return Static21.method480(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V")
	public static void method2079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class3_Sub2 local12 = (Class3_Sub2) Static52.aClass17_8.method599((long) arg3);
		if (local12 == null) {
			local12 = new Class3_Sub2();
			Static52.aClass17_8.method594(local12, (long) arg3);
		}
		if (local12.anIntArray17.length <= arg2) {
			@Pc(42) int[] local42 = new int[arg2 + 1];
			@Pc(47) int[] local47 = new int[arg2 + 1];
			for (@Pc(49) int local49 = 0; local49 < local12.anIntArray17.length; local49++) {
				local42[local49] = local12.anIntArray17[local49];
				local47[local49] = local12.anIntArray15[local49];
			}
			for (@Pc(75) int local75 = local12.anIntArray17.length; local75 < arg2; local75++) {
				local42[local75] = -1;
				local47[local75] = 0;
			}
			local12.anIntArray17 = local42;
			local12.anIntArray15 = local47;
		}
		local12.anIntArray17[arg2] = arg1;
		local12.anIntArray15[arg2] = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(Z)V")
	public static void method2080() {
		aClass26_1625 = null;
		aClass26_1626 = null;
		aClass26_1624 = null;
		aClass26Array25 = null;
	}
}
