import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "[Lclient!cf;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "Z")
	public static boolean aBoolean10;

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "[S")
	public static short[] aShortArray2 = new short[500];

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "[Lclient!wf;")
	public static Class15_Sub5_Sub2[] aClass15_Sub5_Sub2Array1 = new Class15_Sub5_Sub2[2048];

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
	public static void method243() {
		if (Static21.anIntArray21 != null && Static107.anIntArray193 != null) {
			return;
		}
		Static107.anIntArray193 = new int[256];
		Static21.anIntArray21 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(28) double local28 = (double) local18 / 255.0D * 6.283185307179586D;
			Static21.anIntArray21[local18] = (int) (Math.sin(local28) * 4096.0D);
			Static107.anIntArray193[local18] = (int) (Math.cos(local28) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!hi;ILclient!pa;II)V")
	public static void method244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub1 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(15) int local15 = (int) Static49.aFloat32 + Static189.anInt3613 & 0x7FF;
		@Pc(24) int local24 = arg5 * arg5 + arg3 * arg3;
		@Pc(36) int local36 = Math.max(arg2.anInt2204 / 2, arg2.anInt2207 / 2) + 10;
		if (local36 * local36 < local24) {
			return;
		}
		@Pc(47) int local47 = Class135.anIntArray335[local15];
		@Pc(55) int local55 = local47 * 256 / (Static309.anInt5618 + 256);
		@Pc(59) int local59 = Class135.anIntArray338[local15];
		@Pc(75) int local75 = local59 * 256 / (Static309.anInt5618 + 256);
		@Pc(86) int local86 = local75 * arg3 - arg5 * local55 >> 16;
		@Pc(96) int local96 = arg5 * local75 + arg3 * local55 >> 16;
		if (Static156.aBoolean211) {
			((Class1_Sub2_Sub1_Sub1) arg4).method2604(local96 + arg1 + arg2.anInt2204 / 2 - arg4.anInt4447 / 2, -(arg4.anInt4446 / 2) + arg2.anInt2207 / 2 + (arg0 - local86), (Class1_Sub2_Sub1_Sub1) arg2.method1920(false));
		} else {
			((Class1_Sub2_Sub1_Sub2) arg4).method3862(arg1 + arg2.anInt2204 / 2 + local96 - arg4.anInt4447 / 2, -(arg4.anInt4446 / 2) + -local86 + arg2.anInt2207 / 2 + arg0, arg2.anIntArray198, arg2.anIntArray190);
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
	public static void method246() {
		@Pc(7) int local7 = Static207.anInt3960;
		@Pc(9) int local9 = Static36.anInt685;
		@Pc(11) int local11 = Static93.anInt1898;
		@Pc(17) int local17 = Static83.anInt1650;
		if (Static156.aBoolean211) {
			Static119.method2129(local7, local9, local11, local17, 6116423);
			Static119.method2129(local7 + 1, local9 + 1, local11 - 2, 16, 0);
			Static119.method2135(local7 + 1, local9 + 18, local11 - 2, local17 - 19, 0);
		} else {
			Static25.method385(local7, local9, local11, local17, 6116423);
			Static25.method385(local7 + 1, local9 + 1, local11 - 2, 16, 0);
			Static25.method402(local7 + 1, local9 + 18, local11 - 2, local17 + -19, 0);
		}
		Static307.aClass1_Sub2_Sub6_4.method4016(Static244.aString255, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(100) int local100 = Static222.anInt4105;
		@Pc(102) int local102 = Static247.anInt4467;
		for (@Pc(104) int local104 = 0; local104 < Static110.anInt2281; local104++) {
			@Pc(125) int local125 = local9 + (Static110.anInt2281 - local104 - 1) * 15 + 31;
			@Pc(127) int local127 = 16777215;
			if (local7 < local102 && local102 < local11 + local7 && local125 - 13 < local100 && local100 < local125 + 3) {
				local127 = 16776960;
			}
			Static307.aClass1_Sub2_Sub6_4.method4016(Static213.method3842(local104), local7 + 3, local125, local127, 0);
		}
		Static62.method1135(Static36.anInt685, Static93.anInt1898, Static207.anInt3960, Static83.anInt1650);
	}
}
