import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!nd", name = "E", descriptor = "[Lclient!kk;")
	public static Class178[] aClass178Array1;

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "Lclient!iu;")
	public static Class149 aClass149_1;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "[I")
	public static final int[] anIntArray442 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
	public static int anInt6046 = 0;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "J")
	public static long aLong169 = 0L;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(B)Z")
	public static boolean method5191() {
		try {
			return Static153.method2906();
		} catch (@Pc(29) IOException local29) {
			Static97.method1750();
			return true;
		} catch (@Pc(34) Exception local34) {
			@Pc(92) String local92 = "T2 - " + (Static385.aClass73_128 == null ? -1 : Static385.aClass73_128.method1751()) + "," + (Static462.aClass73_148 == null ? -1 : Static462.aClass73_148.method1751()) + "," + (Static108.aClass73_41 == null ? -1 : Static108.aClass73_41.method1751()) + " - " + Static177.anInt3710 + "," + (Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray521[0] + Static39.anInt4952) + "," + (Static138.anInt3088 + Static328.aClass4_Sub1_Sub1_Sub2_2.anIntArray522[0]) + " - ";
			for (@Pc(94) int local94 = 0; local94 < Static177.anInt3710 && local94 < 50; local94++) {
				local92 = local92 + Static282.aClass6_Sub21_Sub2_1.aByteArray93[local94] + ",";
			}
			Static256.method4328(local92, local34);
			Static40.method1024(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IB)I")
	public static int method5192(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local32 * local18 >> 12;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	public static void method5193() {
		if (!Static403.method5918()) {
			return;
		}
		if (Static272.aStringArray17 == null) {
			Static438.method6240();
		}
		Static276.aBoolean373 = true;
		Static61.anInt1278 = 0;
		try {
			Static249.aClipboard1 = Static111.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(28) Exception local28) {
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)I")
	public static int method5194() {
		return 46;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZILclient!ld;IIIIIII[IIII[I)I")
	public static int method5196(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static85.anIntArrayArray13[local3][local7] = 0;
				Static39.anIntArrayArray40[local3][local7] = 99999999;
			}
		}
		@Pc(54) boolean local54;
		if (arg9 == 1) {
			local54 = Static296.method4746(arg6, arg1, arg3, arg8, arg5, arg12, arg11, arg7, arg2, arg4);
		} else if (arg9 == 2) {
			local54 = Static515.method7131(arg12, arg4, arg8, arg2, arg1, arg5, arg3, arg6, arg7, arg11);
		} else {
			local54 = Static526.method7215(arg9, arg5, arg6, arg11, arg2, arg7, arg4, arg3, arg8, arg12, arg1);
		}
		@Pc(89) int local89 = arg6 - 64;
		@Pc(93) int local93 = arg1 - 64;
		@Pc(95) int local95 = Static362.anInt6349;
		@Pc(97) int local97 = Static524.anInt8784;
		@Pc(103) int local103;
		@Pc(105) int local105;
		@Pc(111) int local111;
		if (!local54) {
			if (!arg0) {
				return -1;
			}
			local103 = Integer.MAX_VALUE;
			local105 = Integer.MAX_VALUE;
			for (local111 = arg8 - 10; local111 <= arg8 + 10; local111++) {
				for (@Pc(118) int local118 = arg7 - 10; local118 <= arg7 + 10; local118++) {
					@Pc(125) int local125 = local111 - local89;
					@Pc(130) int local130 = local118 - local93;
					if (local125 >= 0 && local130 >= 0 && local125 < 128 && local130 < 128 && Static39.anIntArrayArray40[local125][local130] < 100) {
						@Pc(154) int local154 = 0;
						if (local111 < arg8) {
							local154 = arg8 - local111;
						} else if (local111 > arg12 + arg8 - 1) {
							local154 = local111 + 1 - arg8 - arg12;
						}
						@Pc(187) int local187 = 0;
						if (arg7 > local118) {
							local187 = arg7 - local118;
						} else if (local118 > arg5 + arg7 - 1) {
							local187 = local118 + 1 - arg5 - arg7;
						}
						@Pc(229) int local229 = local154 * local154 + local187 * local187;
						if (local229 < local103 || local103 == local229 && local105 > Static39.anIntArrayArray40[local125][local130]) {
							local95 = local111;
							local105 = Static39.anIntArrayArray40[local125][local130];
							local103 = local229;
							local97 = local118;
						}
					}
				}
			}
			if (~local103 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local95 == arg6 && local97 == arg1) {
			return 0;
		}
		@Pc(303) byte local303 = 0;
		Static292.anIntArray406[0] = local95;
		local103 = local303 + 1;
		Static127.anIntArray174[0] = local97;
		@Pc(328) int local328;
		local105 = local328 = Static85.anIntArrayArray13[local95 - local89][local97 - local93];
		while (local95 != arg6 || local97 != arg1) {
			if (local105 != local328) {
				Static292.anIntArray406[local103] = local95;
				local328 = local105;
				Static127.anIntArray174[local103++] = local97;
			}
			if ((local105 & 0x1) != 0) {
				local97++;
			} else if ((local105 & 0x4) != 0) {
				local97--;
			}
			if ((local105 & 0x2) != 0) {
				local95++;
			} else if ((local105 & 0x8) != 0) {
				local95--;
			}
			local105 = Static85.anIntArrayArray13[local95 - local89][local97 - local93];
		}
		local111 = 0;
		while (local103-- > 0) {
			arg10[local111] = Static292.anIntArray406[local103];
			arg13[local111++] = Static127.anIntArray174[local103];
			if (local111 >= arg10.length) {
				break;
			}
		}
		return local111;
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)I")
	public static int method5197() {
		return Static225.anInt4647;
	}
}
