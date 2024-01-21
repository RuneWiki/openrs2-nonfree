import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!gb;")
	public static Class31 aClass31_35;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_102;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray42 = new int[4][105][105];

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public static void method3175() {
		Static182.anInt4082 = 0;
		Static82.anInt2114 = 0;
		Static160.method2720();
		Static35.method615();
		Static123.method2210();
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < Static82.anInt2114; local41++) {
			local47 = Static130.anIntArray291[local41];
			if (Static142.anInt3325 != Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local47].anInt2830) {
				Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local47].aClass4_Sub1_Sub11_1 = null;
				Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local47] = null;
			}
		}
		if (Static132.anInt3166 != Static162.aClass4_Sub11_Sub1_3.anInt1597) {
			throw new RuntimeException("gnp1 pos:" + Static162.aClass4_Sub11_Sub1_3.anInt1597 + " psize:" + Static132.anInt3166);
		}
		for (local47 = 0; local47 < Static87.anInt2219; local47++) {
			if (Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[Static35.anIntArray82[local47]] == null) {
				throw new RuntimeException("gnp2 pos:" + local47 + " size:" + Static87.anInt2219);
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!nh;Ljava/awt/Component;ILclient!nh;)V")
	public static void method3177(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) Class62 arg2) {
		if (Static123.aBoolean126) {
			return;
		}
		Static145.method2939();
		@Pc(15) byte[] local15 = arg2.method2878(Static43.anInt1086, 0);
		Static18.aClass4_Sub1_Sub7_Sub2_1 = new Class4_Sub1_Sub7_Sub2(local15, arg1);
		Static116.aClass4_Sub1_Sub7_Sub2_3 = Static18.aClass4_Sub1_Sub7_Sub2_1.method2527();
		Static85.aClass4_Sub1_Sub7_Sub3_3 = Static101.method1951(Static183.anInt1803, arg0);
		Static81.aClass4_Sub1_Sub7_Sub3_2 = Static101.method1951(Static73.anInt1868, arg0);
		Static23.aClass4_Sub1_Sub7_Sub3_1 = Static101.method1951(Static182.anInt4080, arg0);
		Static39.aClass4_Sub1_Sub7_Sub3Array3 = Static156.method2680(Static97.anInt2492, arg0);
		Static62.aClass4_Sub1_Sub7_Sub3Array8 = Static156.method2680(Static72.anInt1865, arg0);
		Static67.anIntArray169 = new int[256];
		for (@Pc(54) int local54 = 0; local54 < 64; local54++) {
			Static67.anIntArray169[local54] = local54 * 262144;
		}
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			Static67.anIntArray169[local70 + 64] = local70 * 1024 + 16711680;
		}
		for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
			Static67.anIntArray169[local88 + 128] = local88 * 4 + 16776960;
		}
		for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
			Static67.anIntArray169[local108 + 192] = 16777215;
		}
		Static155.anIntArray330 = new int[256];
		for (@Pc(125) int local125 = 0; local125 < 64; local125++) {
			Static155.anIntArray330[local125] = local125 * 1024;
		}
		for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
			Static155.anIntArray330[local139 + 64] = local139 * 4 + 65280;
		}
		for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
			Static155.anIntArray330[local157 + 128] = local157 * 262144 + 65535;
		}
		for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
			Static155.anIntArray330[local177 + 192] = 16777215;
		}
		Static87.anIntArray209 = new int[256];
		for (@Pc(196) int local196 = 0; local196 < 64; local196++) {
			Static87.anIntArray209[local196] = local196 * 4;
		}
		for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
			Static87.anIntArray209[local212 + 64] = local212 * 262144 + 255;
		}
		for (@Pc(232) int local232 = 0; local232 < 64; local232++) {
			Static87.anIntArray209[local232 + 128] = local232 * 1024 + 16711935;
		}
		for (@Pc(250) int local250 = 0; local250 < 64; local250++) {
			Static87.anIntArray209[local250 + 192] = 16777215;
		}
		Static30.anIntArray66 = new int[256];
		Static85.anIntArray208 = new int[32768];
		Static84.anIntArray440 = new int[32768];
		Static149.method2554(null);
		Static99.anInt2519 = 0;
		Static53.aBoolean64 = false;
		Static3.aClass46_38 = Static3.aClass46_33;
		if (Static135.anInt3218 == 0) {
			Static154.aBoolean168 = true;
		} else {
			Static154.aBoolean168 = false;
		}
		Static3.aClass46_31 = Static3.aClass46_33;
		Static124.anIntArray281 = new int[32768];
		Static164.anIntArray351 = new int[32768];
		if (Static154.aBoolean168) {
			Static10.method213();
		} else {
			Static90.method1800(Static73.aClass62_Sub1_47, Static65.anInt1715, 255);
		}
		Static43.method728(false);
		Static123.aBoolean126 = true;
		Static18.aClass4_Sub1_Sub7_Sub2_1.method2533(0, 0);
		Static116.aClass4_Sub1_Sub7_Sub2_3.method2533(382, 0);
		Static85.aClass4_Sub1_Sub7_Sub3_3.method2642(382 - Static85.aClass4_Sub1_Sub7_Sub3_3.anInt3484 / 2, 18);
		Static136.aClass4_Sub1_Sub7_Sub2_5 = new Class4_Sub1_Sub7_Sub2(128, 254);
		Static158.aClass4_Sub1_Sub7_Sub2_6 = new Class4_Sub1_Sub7_Sub2(128, 254);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method3178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class29 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class29(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static28.aClass4_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static28.aClass4_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub7(local14, arg1, arg2);
				}
			}
			Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass29_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class29(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static28.aClass4_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static28.aClass4_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub7(local14, arg1, arg2);
				}
			}
			Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass29_1 = local12;
		} else {
			@Pc(134) Class40 local134 = new Class40(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static28.aClass4_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static28.aClass4_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub7(local14, arg1, arg2);
				}
			}
			Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass40_1 = local134;
		}
	}
}
