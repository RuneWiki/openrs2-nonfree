import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "[I")
	public static int[] anIntArray47;

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "[I")
	public static int[] anIntArray48;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString31 = "flash2:";

	@OriginalMember(owner = "client!bj", name = "R", descriptor = "Z")
	public static boolean aBoolean32 = true;

	@OriginalMember(owner = "client!bj", name = "T", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([Lclient!kn;ILclient!km;)V")
	public static void method406(@OriginalArg(0) Class1_Sub2_Sub11_Sub2[] arg0, @OriginalArg(2) Class91 arg1) {
		Static249.aClass91_179 = arg1;
		Static177.aClass1_Sub2_Sub11_Sub2Array2 = arg0;
		Static287.aBooleanArray55 = new boolean[Static177.aClass1_Sub2_Sub11_Sub2Array2.length];
		Static241.aClass70_16.method2082();
		@Pc(21) int local21 = Static249.aClass91_179.method2504("details");
		@Pc(26) int[] local26 = Static249.aClass91_179.method2494(local21);
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			Static241.aClass70_16.method2084((long) local26[local28], Static91.method1593(new Class1_Sub11(Static249.aClass91_179.method2495(local21, local26[local28])), local26[local28]));
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(IIIII)V")
	public static void method409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static127.anInt2837 == 1) {
			Static108.aClass1_Sub2_Sub11Array1[Static216.anInt4283 / 100].method3781(Static225.anInt4483 - 8, Static170.anInt3632 + -8);
		}
		if (Static127.anInt2837 == 2) {
			Static108.aClass1_Sub2_Sub11Array1[Static216.anInt4283 / 100 + 4].method3781(Static225.anInt4483 - 8, Static170.anInt3632 - 8);
		}
		Static240.method3694();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class110 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class110(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static74.aClass1_Sub26ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static74.aClass1_Sub26ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub26(local14, arg1, arg2);
				}
			}
			Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2].aClass110_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class110(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static74.aClass1_Sub26ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static74.aClass1_Sub26ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub26(local14, arg1, arg2);
				}
			}
			Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2].aClass110_1 = local12;
		} else {
			@Pc(134) Class172 local134 = new Class172(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static74.aClass1_Sub26ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static74.aClass1_Sub26ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub26(local14, arg1, arg2);
				}
			}
			Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2].aClass172_1 = local134;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method412(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(17) int local17 = Static88.aClass1_Sub2_Sub1_2.method466(arg1, 250);
		@Pc(29) int local29 = Static88.aClass1_Sub2_Sub1_2.method470(arg1, 250) * 13;
		if (Static277.aBoolean412) {
			Static41.method832(6, 6, local17 + 4 + 4, local29 - -4 - -4, 0);
			Static41.method844(6, 6, local17 + 4 + 4, local29 - -4 - -4, 16777215);
		} else {
			Static50.method954(6, 6, local17 + 4 + 4, local29 + 4 + 4, 0);
			Static50.method946(6, 6, local17 + 4 + 4, local29 + 8, 16777215);
		}
		Static88.aClass1_Sub2_Sub1_2.method449(arg1, 10, 10, local17, local29, 16777215, -1, 1, 1, 0);
		Static75.method1309(local17 + 4 + 4, local29 + 4 + 4, 6, 6);
		if (!arg0) {
			Static282.method4247(10, local29, 10, local17);
		} else if (Static277.aBoolean412) {
			Static277.method4223();
		} else {
			try {
				@Pc(190) Graphics local190 = Static156.aCanvas2.getGraphics();
				Static72.aClass99_1.method3514(local190);
			} catch (@Pc(198) Exception local198) {
				Static156.aCanvas2.repaint();
			}
		}
	}
}
