import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!va", name = "q", descriptor = "[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] aClass2_Sub3_Sub2_Sub1Array9;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "I")
	public static final int anInt3978 = 7759444;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "I")
	public static int anInt3981 = 1;

	@OriginalMember(owner = "client!va", name = "w", descriptor = "[S")
	public static short[] aShortArray37 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method2686() {
		aShortArray37 = null;
		aClass2_Sub3_Sub2_Sub1Array9 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IJ)V")
	public static void method2687(@OriginalArg(1) long arg0) {
		if ((long) 0 == arg0) {
			return;
		}
		if (Static111.anInt2637 >= 100 && Static97.anInt2398 != 1 || Static111.anInt2637 >= 200) {
			Static6.method932(0, Static167.aClass6_1171, Static9.aClass6_71);
			return;
		}
		@Pc(34) Class6 local34 = Static49.method884(arg0).method106();
		for (@Pc(36) int local36 = 0; local36 < Static111.anInt2637; local36++) {
			if (arg0 == Static102.aLongArray3[local36]) {
				Static6.method932(0, Static58.method956(new Class6[] { local34, Static62.aClass6_446 }), Static9.aClass6_71);
				return;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static68.anInt1729; local71++) {
			if (Static138.aLongArray6[local71] == arg0) {
				Static6.method932(0, Static58.method956(new Class6[] { Static4.aClass6_35, local34, Static117.aClass6_806 }), Static9.aClass6_71);
				return;
			}
		}
		if (local34.method131(Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass6_244)) {
			Static6.method932(0, Static151.aClass6_1031, Static9.aClass6_71);
			return;
		}
		Static118.aClass6Array16[Static111.anInt2637] = local34;
		Static102.aLongArray3[Static111.anInt2637] = arg0;
		Static41.anIntArray62[Static111.anInt2637] = 0;
		Static67.anIntArray110[Static111.anInt2637] = 0;
		Static86.anInt2209 = Static7.anInt124;
		Static111.anInt2637++;
		Static66.aClass2_Sub13_Sub1_2.method1455(214);
		Static66.aClass2_Sub13_Sub1_2.method1418(arg0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([Lclient!l;IIIII[B)V")
	public static void method2688(@OriginalArg(0) Class48[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg4 + local7 > 0 && arg4 + local7 < 103 && arg3 + local11 > 0 && arg3 + local11 < 103) {
						arg0[local3].anIntArrayArray35[arg4 + local7][arg3 + local11] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(90) Class2_Sub13 local90 = new Class2_Sub13(arg5);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
				for (@Pc(111) int local111 = 0; local111 < 64; local111++) {
					Static58.method953(arg1, local11, 0, arg2, local107 + arg4, local90, local111 + arg3);
				}
			}
		}
	}
}
