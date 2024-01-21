import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
	public static int anInt1866;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "[Lclient!ee;")
	public static Class22[] aClass22Array1;

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "Lclient!dd;")
	public static Class16 aClass16_8;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "Lclient!od;")
	private static Class60 aClass60_776 = Static41.method597("Click to switch");

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "Lclient!od;")
	private static Class60 aClass60_779 = Static41.method597("Error connecting to server)3");

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "Lclient!od;")
	public static Class60 aClass60_777 = aClass60_779;

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "Lclient!od;")
	public static Class60 aClass60_778 = aClass60_776;

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "[Lclient!od;")
	public static Class60[] aClass60Array12 = new Class60[100];

	@OriginalMember(owner = "client!ne", name = "hb", descriptor = "[[S")
	public static short[][] aShortArrayArray21 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ne", name = "jb", descriptor = "[I")
	public static int[] anIntArray217 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ne", name = "kb", descriptor = "I")
	public static int anInt1877 = 0;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	public static void method1263() {
		anIntArray217 = null;
		anIntArray212 = null;
		aClass60_777 = null;
		aClass60_776 = null;
		aClass22Array1 = null;
		aClass16_8 = null;
		aClass60_779 = null;
		aClass60_778 = null;
		aClass60Array12 = null;
		aShortArrayArray21 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIILclient!db;I)V")
	public static void method1264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub3_Sub3 arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class4_Sub24 local12 = new Class4_Sub24();
		local12.anInt2940 = arg3.anInt731 * 128;
		local12.anInt2937 = arg0 * 128;
		local12.anInt2941 = arg3.anInt762;
		local12.anInt2943 = arg2;
		local12.anInt2946 = arg3.anInt739;
		local12.anIntArray346 = arg3.anIntArray82;
		local12.anInt2938 = arg1 * 128;
		local12.anInt2949 = arg3.anInt733;
		@Pc(50) int local50 = arg3.anInt760;
		@Pc(53) int local53 = arg3.anInt750;
		if (arg4 == 1 || arg4 == 3) {
			local53 = arg3.anInt760;
			local50 = arg3.anInt750;
		}
		local12.anInt2945 = (arg0 + local50) * 128;
		local12.anInt2947 = (local53 + arg1) * 128;
		if (arg3.anIntArray81 != null) {
			local12.aClass4_Sub3_Sub3_1 = arg3;
			local12.method1986();
		}
		Static16.aClass45_2.method988(local12);
		if (local12.anIntArray346 != null) {
			local12.anInt2939 = local12.anInt2941 + (int) ((double) (local12.anInt2949 - local12.anInt2941) * Math.random());
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!c;Lclient!c;ILjava/awt/Component;)V")
	public static void method1267(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(3) Component arg2) {
		if (Static66.aBoolean58) {
			return;
		}
		Static34.method1659();
		@Pc(15) byte[] local15 = arg1.method1769(Static85.aClass60_836, Static68.aClass60_674);
		Static97.aClass4_Sub3_Sub6_Sub3_4 = new Class4_Sub3_Sub6_Sub3(local15, arg2);
		Static131.aClass4_Sub3_Sub6_Sub3_6 = Static97.aClass4_Sub3_Sub6_Sub3_4.method1627();
		Static109.aClass4_Sub3_Sub6_Sub2_5 = Static122.method1921(arg0, Static60.aClass60_1146, Static68.aClass60_674);
		Static4.aClass4_Sub3_Sub6_Sub2_1 = Static122.method1921(arg0, Static14.aClass60_161, Static68.aClass60_674);
		Static86.aClass4_Sub3_Sub6_Sub2_3 = Static122.method1921(arg0, Static42.aClass60_413, Static68.aClass60_674);
		Static9.aClass4_Sub3_Sub6_Sub2Array1 = Static82.method1299(Static66.aClass60_635, arg0, Static68.aClass60_674);
		Static71.aClass4_Sub3_Sub6_Sub2Array7 = Static82.method1299(Static31.aClass60_316, arg0, Static68.aClass60_674);
		Static49.anIntArray123 = new int[256];
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			Static49.anIntArray123[local59] = local59 * 262144;
		}
		for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
			Static49.anIntArray123[local75 + 64] = local75 * 1024 + 16711680;
		}
		for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
			Static49.anIntArray123[local93 + 128] = local93 * 4 + 16776960;
		}
		for (@Pc(113) int local113 = 0; local113 < 64; local113++) {
			Static49.anIntArray123[local113 + 192] = 16777215;
		}
		Static84.anIntArray229 = new int[256];
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			Static84.anIntArray229[local132] = local132 * 1024;
		}
		for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
			Static84.anIntArray229[local146 + 64] = local146 * 4 + 65280;
		}
		for (@Pc(165) int local165 = 0; local165 < 64; local165++) {
			Static84.anIntArray229[local165 + 128] = local165 * 262144 + 65535;
		}
		for (@Pc(184) int local184 = 0; local184 < 64; local184++) {
			Static84.anIntArray229[local184 + 192] = 16777215;
		}
		Static75.anIntArray127 = new int[256];
		for (@Pc(201) int local201 = 0; local201 < 64; local201++) {
			Static75.anIntArray127[local201] = local201 * 4;
		}
		for (@Pc(215) int local215 = 0; local215 < 64; local215++) {
			Static75.anIntArray127[local215 + 64] = local215 * 262144 + 255;
		}
		for (@Pc(236) int local236 = 0; local236 < 64; local236++) {
			Static75.anIntArray127[local236 + 128] = local236 * 1024 + 16711935;
		}
		for (@Pc(254) int local254 = 0; local254 < 64; local254++) {
			Static75.anIntArray127[local254 + 192] = 16777215;
		}
		Static110.anIntArray331 = new int[32768];
		anIntArray212 = new int[32768];
		Static12.anIntArray328 = new int[256];
		Static24.method442(null);
		Static53.anIntArray146 = new int[32768];
		if (Static63.anInt1593 == 0) {
			Static41.aBoolean41 = true;
		} else {
			Static41.aBoolean41 = false;
		}
		Static68.aClass60_670 = Static68.aClass60_674;
		Static80.anIntArray222 = new int[32768];
		Static115.anInt2694 = 0;
		Static47.aBoolean42 = false;
		Static68.aClass60_665 = Static68.aClass60_674;
		if (Static41.aBoolean41) {
			Static30.method480();
		} else {
			Static75.method689(Static85.aClass60_837, Static68.aClass60_674, Static10.aClass10_Sub1_3);
		}
		Static14.method285(false);
		Static66.aBoolean58 = true;
		Static97.aClass4_Sub3_Sub6_Sub3_4.method1629(0, 0);
		Static131.aClass4_Sub3_Sub6_Sub3_6.method1629(382, 0);
		Static109.aClass4_Sub3_Sub6_Sub2_5.method1558(382 - Static109.aClass4_Sub3_Sub6_Sub2_5.anInt2255 / 2, 18);
	}
}
