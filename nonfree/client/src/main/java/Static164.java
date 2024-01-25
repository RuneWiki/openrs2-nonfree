import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_156 = new Class12(8, 6);

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
	public static int anInt2905 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg0 && arg8 == arg4 && arg2 == arg1 && arg5 == arg6) {
			Static228.method3282(arg0, arg6, arg4, arg3, arg1);
			return;
		}
		@Pc(27) int local27 = arg0;
		@Pc(29) int local29 = arg4;
		@Pc(33) int local33 = arg0 * 3;
		@Pc(37) int local37 = arg4 * 3;
		@Pc(41) int local41 = arg7 * 3;
		@Pc(45) int local45 = arg8 * 3;
		@Pc(49) int local49 = arg2 * 3;
		@Pc(53) int local53 = arg5 * 3;
		@Pc(63) int local63 = local41 + arg1 - arg0 - local49;
		@Pc(73) int local73 = local45 + arg6 - arg4 - local53;
		@Pc(83) int local83 = local33 + local49 - local41 - local41;
		@Pc(92) int local92 = local37 + local53 - local45 - local45;
		@Pc(96) int local96 = local41 - local33;
		@Pc(101) int local101 = local45 - local37;
		for (@Pc(103) int local103 = 128; local103 <= 4096; local103 += 128) {
			@Pc(111) int local111 = local103 * local103 >> 12;
			@Pc(117) int local117 = local103 * local111 >> 12;
			@Pc(121) int local121 = local117 * local63;
			@Pc(125) int local125 = local73 * local117;
			@Pc(129) int local129 = local111 * local83;
			@Pc(133) int local133 = local111 * local92;
			@Pc(137) int local137 = local96 * local103;
			@Pc(141) int local141 = local101 * local103;
			@Pc(152) int local152 = (local137 + local121 + local129 >> 12) + arg0;
			@Pc(162) int local162 = (local133 + local125 + local141 >> 12) + arg4;
			Static228.method3282(local27, local162, local29, arg3, local152);
			local29 = local162;
			local27 = local152;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ICB)C")
	public static char method2554(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Lclient!cp;")
	public static Class48_Sub1 method2555() {
		Static117.anInt2222 = 0;
		return Static64.method971();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(JI)V")
	public static void method2556(@OriginalArg(0) long arg0) {
		if (Static131.aClass137ArrayArrayArray2 != null) {
			if (Static57.anInt883 == 1 || Static57.anInt883 == 5) {
				Static236.method3449(arg0);
			} else if (Static57.anInt883 == 4) {
				Static118.method1836(arg0);
			}
		}
		Static344.method4954(Static447.aClass121_11, (long) Static123.anInt2333);
		if (Static246.anInt4292 != -1) {
			Static3.method38(Static246.anInt4292);
		}
		for (@Pc(40) int local40 = 0; local40 < Static346.anInt6355; local40++) {
			if (Static204.aBooleanArray15[local40]) {
				Static41.aBooleanArray2[local40] = true;
			}
			Static105.aBooleanArray7[local40] = Static204.aBooleanArray15[local40];
			Static204.aBooleanArray15[local40] = false;
		}
		Static260.anInt5254 = Static123.anInt2333;
		if (Static447.aClass121_11.method4605()) {
			Static81.aBoolean127 = true;
		}
		if (Static246.anInt4292 != -1) {
			Static346.anInt6355 = 0;
			Static262.method3693();
		}
		Static447.aClass121_11.va();
		Static91.method4792(Static447.aClass121_11);
		@Pc(94) int local94 = Static267.method3732();
		if (local94 == -1) {
			local94 = Static139.anInt2525;
		}
		if (local94 == -1) {
			local94 = Static321.anInt5593;
		}
		Static153.method3789(local94);
		Static3.method40(Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060, Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066, Static384.anInt6843, Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97);
		Static384.anInt6843 = 0;
	}
}
