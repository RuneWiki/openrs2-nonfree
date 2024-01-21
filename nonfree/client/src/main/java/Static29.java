import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Lclient!rh;")
	public static Class77 aClass77_4;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "I")
	public static int anInt753 = 0;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_253 = Static120.method2057("Neuer Benutzer");

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!tg;")
	public static Class81 aClass81_254 = Static120.method2057("<col=ffffff>");

	@OriginalMember(owner = "client!da", name = "f", descriptor = "I")
	public static int anInt755 = 0;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Lclient!tg;")
	public static Class81 aClass81_255 = Static120.method2057("::autoshadow on");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method616() {
		aClass81_254 = null;
		aClass77_4 = null;
		aClass81_255 = null;
		aClass81_253 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)I")
	public static int method617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static66.method1196(arg1 + 45365, arg0 + 91923, 4) + (Static66.method1196(arg1 + 10294, arg0 - -37821, 2) - 128 >> 1) + (Static66.method1196(arg1, arg0, 1) + -128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!vb;Ljava/awt/Component;Lclient!vb;B)V")
	public static void method618(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class82 arg2) {
		if (Static100.aBoolean92) {
			return;
		}
		Static4.method2562();
		@Pc(15) byte[] local15 = arg2.method2942(0, Static63.anInt1550);
		Static59.aClass1_Sub2_Sub2_Sub3_3 = new Class1_Sub2_Sub2_Sub3(local15, arg1);
		Static140.aClass1_Sub2_Sub2_Sub3_9 = Static59.aClass1_Sub2_Sub2_Sub3_3.method2131();
		Static9.aClass1_Sub2_Sub2_Sub4_1 = Static43.method816(Static14.anInt291, arg0);
		Static40.aClass1_Sub2_Sub2_Sub4_2 = Static43.method816(Static107.anInt2357, arg0);
		Static118.aClass1_Sub2_Sub2_Sub4_3 = Static43.method816(Static19.anInt490, arg0);
		Static5.aClass1_Sub2_Sub2_Sub4Array1 = Static15.method232(Static31.anInt839, arg0);
		Static162.aClass1_Sub2_Sub2_Sub4Array10 = Static15.method232(Static122.anInt2745, arg0);
		Static37.anIntArray78 = new int[256];
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			Static37.anIntArray78[local59] = local59 * 262144;
		}
		for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
			Static37.anIntArray78[local73 + 64] = local73 * 1024 + 16711680;
		}
		for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
			Static37.anIntArray78[local93 + 128] = local93 * 4 + 16776960;
		}
		for (@Pc(113) int local113 = 0; local113 < 64; local113++) {
			Static37.anIntArray78[local113 + 192] = 16777215;
		}
		Static116.anIntArray277 = new int[256];
		for (@Pc(130) int local130 = 0; local130 < 64; local130++) {
			Static116.anIntArray277[local130] = local130 * 1024;
		}
		for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
			Static116.anIntArray277[local146 + 64] = local146 * 4 + 65280;
		}
		for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
			Static116.anIntArray277[local164 + 128] = local164 * 262144 + 65535;
		}
		for (@Pc(184) int local184 = 0; local184 < 64; local184++) {
			Static116.anIntArray277[local184 + 192] = 16777215;
		}
		Static165.anIntArray392 = new int[256];
		for (@Pc(201) int local201 = 0; local201 < 64; local201++) {
			Static165.anIntArray392[local201] = local201 * 4;
		}
		for (@Pc(215) int local215 = 0; local215 < 64; local215++) {
			Static165.anIntArray392[local215 + 64] = local215 * 262144 + 255;
		}
		for (@Pc(234) int local234 = 0; local234 < 64; local234++) {
			Static165.anIntArray392[local234 + 128] = local234 * 1024 + 16711935;
		}
		for (@Pc(253) int local253 = 0; local253 < 64; local253++) {
			Static165.anIntArray392[local253 + 192] = 16777215;
		}
		Static71.anIntArray150 = new int[32768];
		Static6.anIntArray7 = new int[32768];
		Static150.anIntArray358 = new int[256];
		Static154.method2677(null);
		Static140.anIntArray329 = new int[32768];
		Static30.anIntArray61 = new int[32768];
		if (Static121.anInt2708 == 0) {
			Static62.aBoolean61 = true;
		} else {
			Static62.aBoolean61 = false;
		}
		Static165.aClass81_1344 = Static165.aClass81_1343;
		Static45.aBoolean43 = false;
		Static165.aClass81_1340 = Static165.aClass81_1343;
		Static2.anInt46 = 0;
		if (Static62.aBoolean61) {
			Static107.method1775();
		} else {
			Static184.method3132(Static158.aClass82_Sub1_17, 255, Static21.anInt525);
		}
		Static147.method2503(false);
		Static100.aBoolean92 = true;
		Static59.aClass1_Sub2_Sub2_Sub3_3.method2119(0, 0);
		Static140.aClass1_Sub2_Sub2_Sub3_9.method2119(382, 0);
		Static9.aClass1_Sub2_Sub2_Sub4_1.method2581(382 - Static9.aClass1_Sub2_Sub2_Sub4_1.anInt3358 / 2, 18);
		Static15.aClass1_Sub2_Sub2_Sub3_1 = new Class1_Sub2_Sub2_Sub3(128, 254);
		Static184.aClass1_Sub2_Sub2_Sub3_11 = new Class1_Sub2_Sub2_Sub3(128, 254);
	}
}
