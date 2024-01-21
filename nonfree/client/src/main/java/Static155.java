import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "[Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1[] aClass1_Sub1_Sub12_Sub1Array8;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1458 = Static169.method2903("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1459 = Static169.method2903("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1461 = Static169.method2903("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
	public static int anInt3808 = 20;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public static void method2629() {
		aClass1_Sub1_Sub12_Sub1Array8 = null;
		aClass23_1458 = null;
		aClass23_1461 = null;
		aClass23_1459 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public static int method2630(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local19 >> 12) + 40960;
		return local13 * local32 >> 12;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
	public static void method2631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class60 local8 = Static120.method2104(arg2, arg1);
		if (local8 != null && local8.anObjectArray12 != null) {
			@Pc(17) Class1_Sub13 local17 = new Class1_Sub13();
			local17.anObjectArray3 = local8.anObjectArray12;
			local17.aClass60_6 = local8;
			Static178.method3065(local17);
		}
		Static52.anInt1969 = arg2;
		Static178.anInt4245 = arg1;
		Static156.aBoolean195 = true;
		Static23.anInt701 = arg0;
		Static39.method659(local8);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ga;ILjava/awt/Component;Lclient!ga;)V")
	public static void method2632(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class30 arg2) {
		if (Static170.aBoolean42) {
			return;
		}
		Static150.method3032();
		@Pc(15) byte[] local15 = arg0.method1289(Static61.aClass23_605, Static15.aClass23_183);
		Static169.aClass1_Sub1_Sub12_Sub1_7 = new Class1_Sub1_Sub12_Sub1(local15, arg1);
		Static161.aClass1_Sub1_Sub12_Sub1_6 = Static169.aClass1_Sub1_Sub12_Sub1_7.method1936();
		Static25.aClass1_Sub1_Sub12_Sub4_2 = Static170.method477(arg2, Static61.aClass23_605, Static80.aClass23_794);
		Static32.aClass1_Sub1_Sub12_Sub4_3 = Static170.method477(arg2, Static61.aClass23_605, Static92.aClass23_915);
		Static54.aClass1_Sub1_Sub12_Sub4_4 = Static170.method477(arg2, Static61.aClass23_605, Static108.aClass23_679);
		Static53.aClass1_Sub1_Sub12_Sub4Array4 = Static76.method1367(arg2, Static96.aClass23_956, Static61.aClass23_605);
		Static138.aClass1_Sub1_Sub12_Sub4Array9 = Static76.method1367(arg2, Static126.aClass23_1237, Static61.aClass23_605);
		Static68.anIntArray242 = new int[256];
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			Static68.anIntArray242[local61] = local61 * 262144;
		}
		for (@Pc(77) int local77 = 0; local77 < 64; local77++) {
			Static68.anIntArray242[local77 + 64] = local77 * 1024 + 16711680;
		}
		for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
			Static68.anIntArray242[local95 + 128] = local95 * 4 + 16776960;
		}
		for (@Pc(113) int local113 = 0; local113 < 64; local113++) {
			Static68.anIntArray242[local113 + 192] = 16777215;
		}
		Static57.anIntArray224 = new int[256];
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			Static57.anIntArray224[local132] = local132 * 1024;
		}
		for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
			Static57.anIntArray224[local146 + 64] = local146 * 4 + 65280;
		}
		for (@Pc(165) int local165 = 0; local165 < 64; local165++) {
			Static57.anIntArray224[local165 + 128] = local165 * 262144 + 65535;
		}
		for (@Pc(184) int local184 = 0; local184 < 64; local184++) {
			Static57.anIntArray224[local184 + 192] = 16777215;
		}
		Static127.anIntArray442 = new int[256];
		for (@Pc(203) int local203 = 0; local203 < 64; local203++) {
			Static127.anIntArray442[local203] = local203 * 4;
		}
		for (@Pc(217) int local217 = 0; local217 < 64; local217++) {
			Static127.anIntArray442[local217 + 64] = local217 * 262144 + 255;
		}
		for (@Pc(235) int local235 = 0; local235 < 64; local235++) {
			Static127.anIntArray442[local235 + 128] = local235 * 1024 + 16711935;
		}
		for (@Pc(255) int local255 = 0; local255 < 64; local255++) {
			Static127.anIntArray442[local255 + 192] = 16777215;
		}
		Static156.anIntArray514 = new int[32768];
		Static25.anIntArray105 = new int[256];
		Static75.anIntArray269 = new int[32768];
		Static115.method2047(null);
		Static61.aClass23_612 = Static61.aClass23_605;
		Static14.anIntArray64 = new int[32768];
		Static156.anIntArray516 = new int[32768];
		if (Static38.anInt1035 == 0) {
			Static142.aBoolean183 = true;
		} else {
			Static142.aBoolean183 = false;
		}
		Static5.aBoolean218 = false;
		Static177.anInt4203 = 0;
		Static61.aClass23_608 = Static61.aClass23_605;
		if (Static142.aBoolean183) {
			Static180.method3098();
		} else {
			Static72.method1307(Static61.aClass23_605, Static156.aClass23_1466, Static167.aClass30_Sub1_18);
		}
		Static66.method1177(false);
		Static170.aBoolean42 = true;
		Static169.aClass1_Sub1_Sub12_Sub1_7.method1941(0, 0);
		Static161.aClass1_Sub1_Sub12_Sub1_6.method1941(382, 0);
		Static25.aClass1_Sub1_Sub12_Sub4_2.method2746(382 - Static25.aClass1_Sub1_Sub12_Sub4_2.anInt3905 / 2, 18);
		Static44.aClass1_Sub1_Sub12_Sub1_3 = new Class1_Sub1_Sub12_Sub1(128, 254);
		Static93.aClass1_Sub1_Sub12_Sub1_4 = new Class1_Sub1_Sub12_Sub1(128, 254);
	}
}
