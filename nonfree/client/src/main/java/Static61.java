import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_9;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
	public static int anInt1297 = 0;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_594 = Static193.method3027("blaugr-Un:");

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_595 = Static193.method3027("(U");

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_596 = Static193.method3027("");

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!b;IIZ)V")
	public static void method940(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static211.anInt4256 != 0 && Static211.anInt4256 != 3) {
			return;
		}
		@Pc(21) int local21 = arg1 - arg0.anInt244 / 2;
		@Pc(28) int local28 = arg2 - arg0.anInt217 / 2;
		@Pc(34) int local34 = Static62.anInt1310 + Static179.anInt1329 & 0x7FF;
		@Pc(38) int local38 = Class3_Sub3_Sub2_Sub5.anIntArray303[local34];
		@Pc(46) int local46 = (Static212.anInt4284 + 256) * local38 >> 8;
		@Pc(50) int local50 = Class3_Sub3_Sub2_Sub5.anIntArray300[local34];
		@Pc(63) int local63 = (Static212.anInt4284 + 256) * local50 >> 8;
		@Pc(74) int local74 = local46 * local28 - local21 * local63 >> 11;
		@Pc(82) int local82 = Static144.aClass26_Sub2_Sub1_1.anInt2611 - local74 >> 7;
		@Pc(92) int local92 = local21 * local46 + local28 * local63 >> 11;
		@Pc(99) int local99 = Static144.aClass26_Sub2_Sub1_1.anInt2593 + local92 >> 7;
		@Pc(119) boolean local119 = Static103.method1467(true, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0], 0, 0, 0, local82, local99, 1, 0, Static144.aClass26_Sub2_Sub1_1.anIntArray185[0]);
		if (!local119) {
			return;
		}
		Static93.aClass3_Sub4_Sub1_18.method1239(local21);
		Static93.aClass3_Sub4_Sub1_18.method1239(local28);
		Static93.aClass3_Sub4_Sub1_18.method1252(Static179.anInt1329);
		Static93.aClass3_Sub4_Sub1_18.method1239(57);
		Static93.aClass3_Sub4_Sub1_18.method1239(Static62.anInt1310);
		Static93.aClass3_Sub4_Sub1_18.method1239(Static212.anInt4284);
		Static93.aClass3_Sub4_Sub1_18.method1239(89);
		Static93.aClass3_Sub4_Sub1_18.method1252(Static144.aClass26_Sub2_Sub1_1.anInt2593);
		Static93.aClass3_Sub4_Sub1_18.method1252(Static144.aClass26_Sub2_Sub1_1.anInt2611);
		Static93.aClass3_Sub4_Sub1_18.method1239(Static44.anInt933);
		Static93.aClass3_Sub4_Sub1_18.method1239(63);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!we;I)V")
	public static void method941(@OriginalArg(0) Class26_Sub2 arg0) {
		if (Static184.anInt3760 == arg0.anInt2640 || arg0.anInt2599 == -1 || arg0.anInt2610 != 0 || arg0.anInt2606 + 1 > Static11.method254(arg0.anInt2599).anIntArray193[arg0.anInt2621]) {
			@Pc(34) int local34 = Static184.anInt3760 - arg0.anInt2624;
			@Pc(41) int local41 = arg0.anInt2640 - arg0.anInt2624;
			@Pc(51) int local51 = arg0.anInt2604 * 64 + arg0.anInt2619 * 128;
			@Pc(61) int local61 = arg0.anInt2604 * 64 + arg0.anInt2639 * 128;
			@Pc(71) int local71 = arg0.anInt2629 * 128 + arg0.anInt2604 * 64;
			@Pc(81) int local81 = arg0.anInt2604 * 64 + arg0.anInt2588 * 128;
			arg0.anInt2593 = (local51 * (local41 - local34) + local34 * local61) / local41;
			arg0.anInt2611 = ((local41 - local34) * local81 + local34 * local71) / local41;
		}
		if (arg0.anInt2607 == 0) {
			arg0.anInt2644 = 1024;
		}
		arg0.anInt2586 = 0;
		if (arg0.anInt2607 == 1) {
			arg0.anInt2644 = 1536;
		}
		if (arg0.anInt2607 == 2) {
			arg0.anInt2644 = 0;
		}
		if (arg0.anInt2607 == 3) {
			arg0.anInt2644 = 512;
		}
		arg0.anInt2605 = arg0.anInt2644;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class45 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class45(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static118.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static118.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub6(local14, arg1, arg2);
				}
			}
			Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass45_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class45(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static118.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static118.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub6(local14, arg1, arg2);
				}
			}
			Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass45_1 = local12;
		} else {
			@Pc(134) Class60 local134 = new Class60(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static118.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static118.aClass3_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub6(local14, arg1, arg2);
				}
			}
			Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass60_1 = local134;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIZ)V")
	public static void method943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(6) int local6 = arg2; local6 <= arg3; local6++) {
			Static16.method302(arg4, arg1, arg0, Static157.anIntArrayArray24[local6]);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "()V")
	public static void method944() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static76.anInt1501; local1++) {
			for (local4 = 0; local4 < Static89.anInt659; local4++) {
				for (local7 = 0; local7 < Static126.anInt2489; local7++) {
					Static118.aClass3_Sub6ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static103.anInt2097; local4++) {
			for (local7 = 0; local7 < Static103.anIntArray117[local4]; local7++) {
				Static103.aClass87ArrayArray1[local4][local7] = null;
			}
			Static103.anIntArray117[local4] = 0;
		}
		for (local7 = 0; local7 < Static191.anInt3884; local7++) {
			Static109.aClass99Array2[local7] = null;
		}
		Static191.anInt3884 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static119.aClass99Array3.length; local69++) {
			Static119.aClass99Array3[local69] = null;
		}
	}
}
