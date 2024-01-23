import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
	public static int anInt2293;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "Lclient!vd;")
	public static Class185 aClass185_3;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
	public static int anInt2298;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
	public static int anInt2294 = 0;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
	public static int anInt2296 = 0;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ICB)C")
	public static char method1983(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
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

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIZZ)V")
	public static void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		Static188.anInt3597++;
		Static108.method1950();
		@Pc(30) int local30;
		if (arg4) {
			Static126.method1643(0, false, false);
		} else {
			Static233.method3604(0);
			Static126.method1643(0, false, true);
			if (Static227.anInt4179 == 0) {
				for (local30 = 1; local30 <= 5; local30++) {
					Static126.method1643(local30, false, false);
					Static126.method1643(local30, true, false);
					Static233.method3604(local30);
				}
			} else {
				for (local30 = 1; local30 <= 5; local30++) {
					Static233.method3604(local30);
					Static126.method1643(local30, false, false);
					Static126.method1643(local30, true, false);
				}
			}
		}
		if (!arg4) {
			Static105.method1208();
		}
		Static97.method1798();
		if (Static156.aBoolean211) {
			Static56.method989(arg2, arg0, arg1, true, arg3);
			arg1 = Static57.anInt1086;
			arg0 = Static41.anInt848;
			arg2 = Static207.anInt3955;
			arg3 = Static206.anInt3930;
		}
		Static158.anInt3112 = arg2;
		Static158.anInt3113 = arg3;
		@Pc(132) int local132;
		if (Static167.anInt3292 == 1) {
			local30 = (int) Static278.aFloat154;
			if (Static277.anInt4986 / 256 > local30) {
				local30 = Static277.anInt4986 / 256;
			}
			local132 = Static23.anInt403 + (int) Static49.aFloat32 & 0x7FF;
			if (Static197.aBooleanArray15[4] && local30 < Static100.anIntArray174[4] + 128) {
				local30 = Static100.anIntArray174[4] + 128;
			}
			Static75.method1473(local30 * 3 + 600, Static69.method4275(Static90.aClass15_Sub5_Sub2_2.anInt5557, Static65.anInt1300, Static90.aClass15_Sub5_Sub2_2.anInt5559) + -50, local30, local132, Static31.anInt551, Static183.anInt3495, arg0);
		} else if (Static167.anInt3292 == 5) {
			Static162.method2780(arg0);
		}
		local132 = Static306.anInt5420;
		local30 = Static94.anInt3434;
		@Pc(192) int local192 = Static233.anInt4252;
		@Pc(194) int local194 = Static277.anInt4987;
		@Pc(196) int local196 = Static93.anInt1895;
		@Pc(198) int local198;
		@Pc(240) int local240;
		for (local198 = 0; local198 < 5; local198++) {
			if (Static197.aBooleanArray15[local198]) {
				local240 = (int) (Math.random() * (double) (Static194.anIntArray304[local198] * 2 + 1) - (double) Static194.anIntArray304[local198] + Math.sin((double) Static233.anIntArray364[local198] / 100.0D * (double) Static244.anIntArray388[local198]) * (double) Static100.anIntArray174[local198]);
				if (local198 == 0) {
					Static94.anInt3434 += local240;
				}
				if (local198 == 3) {
					Static93.anInt1895 = Static93.anInt1895 + local240 & 0x7FF;
				}
				if (local198 == 2) {
					Static233.anInt4252 += local240;
				}
				if (local198 == 1) {
					Static306.anInt5420 += local240;
				}
				if (local198 == 4) {
					Static277.anInt4987 += local240;
					if (Static277.anInt4987 < 128) {
						Static277.anInt4987 = 128;
					}
					if (Static277.anInt4987 > 383) {
						Static277.anInt4987 = 383;
					}
				}
			}
		}
		Static289.method4411();
		@Pc(366) int local366;
		if (Static156.aBoolean211) {
			Static119.method2138(arg3, arg2, arg1 + arg3, arg2 + arg0);
			@Pc(321) float local321 = (float) Static277.anInt4987 * 0.17578125F;
			@Pc(326) float local326 = (float) Static93.anInt1895 * 0.17578125F;
			if (Static167.anInt3292 == 3) {
				local326 = Static93.aFloat60 * 360.0F / 6.2831855F;
				local321 = Static5.aFloat3 * 360.0F / 6.2831855F;
			}
			if (Static37.anInt773 == 10) {
				local366 = Static257.method4081(Static184.anInt3503, Static94.anInt3434 >> 10, Static81.anInt1635, Static233.anInt4252 >> 10);
			} else {
				local366 = Static257.method4081(Static184.anInt3503, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0] >> 3, Static81.anInt1635, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0] >> 3);
			}
			if (Static269.anInt2494 >= 0) {
				Static156.method2661();
				@Pc(392) Class136 local392 = Static125.method2191(Static269.anInt2494, Static45.anInt932, Static175.anInt3404, Static309.anInt5628);
				local392.method3388(Static134.anInt5655, arg3, arg2, arg1, arg0, Static277.anInt4987, Static93.anInt1895, local366);
			} else {
				Static156.method2696(local366);
			}
			Static156.method2659(arg3, arg2, arg1, arg0, arg3 + arg1 / 2, arg0 / 2 + arg2, local321, local326, Static188.anInt3592, Static188.anInt3592);
			Static249.method3933(false);
			Static156.method2672();
			Static156.method2668(true);
			Static156.method2674(true);
		} else {
			Static25.method401(arg3, arg2, arg3 + arg1, arg0 + arg2);
			Static215.method3375();
			if (Static269.anInt2494 >= 0) {
				@Pc(455) Class136 local455 = Static125.method2191(Static269.anInt2494, Static45.anInt932, Static175.anInt3404, Static309.anInt5628);
				local455.method3385(Static134.anInt5655, arg3, arg2, arg1, arg0, Static277.anInt4987, Static93.anInt1895);
			} else {
				Static25.method385(arg3, arg2, arg1, arg0, 0);
			}
		}
		if (Static249.aBoolean307 || arg3 > Static11.anInt163 || Static11.anInt163 >= arg1 + arg3 || Static49.anInt962 < arg2 || Static49.anInt962 >= arg2 + arg0) {
			Static70.anInt1489 = 0;
			Static97.aBoolean108 = false;
		} else {
			Static70.anInt1489 = 0;
			Static97.aBoolean108 = true;
			local198 = Static280.anInt5070;
			local366 = Static126.anInt1742;
			local240 = Static130.anInt2601;
			@Pc(510) int local510 = Static187.anInt3579;
			Static221.anInt4091 = local366 + (local510 - local366) * (Static49.anInt962 + -arg2) / arg0;
			Static133.anInt2674 = (Static11.anInt163 - arg3) * (local240 - local198) / arg1 + local198;
		}
		Static115.method2067();
		@Pc(554) byte local554 = Static300.method4552() == 2 ? (byte) Static188.anInt3597 : 1;
		if (Static156.aBoolean211) {
			Static101.method1833(Static313.anInt2966, !Static94.aBoolean232);
			Static113.method2023(Static306.anInt5420, Static94.anInt3434, Static277.anInt4987, Static233.anInt4252, Static93.anInt1895);
			Static156.anInt3082 = Static313.anInt2966;
			Static92.method4696(Static94.anInt3434, Static306.anInt5420, Static233.anInt4252, Static277.anInt4987, Static93.anInt1895, Static257.aByteArrayArrayArray20, Static72.anIntArray471, Static272.anIntArray506, Static179.anIntArray292, Static236.anIntArray367, Static7.anIntArray6, Static65.anInt1300 + 1, local554, Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7, Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7);
			Static282.aBoolean348 = true;
			Static101.method1824();
			Static113.method2023(0, 0, 0, 0, 0);
			Static115.method2067();
			Static193.method3141(arg1, Static188.anInt3592, arg3, arg0, arg2, Static188.anInt3592);
			Static206.method3290(Static188.anInt3592, arg1, arg0, arg2, arg3, Static188.anInt3592);
			Static54.method971();
		} else {
			Static92.method4696(Static94.anInt3434, Static306.anInt5420, Static233.anInt4252, Static277.anInt4987, Static93.anInt1895, Static257.aByteArrayArrayArray20, Static72.anIntArray471, Static272.anIntArray506, Static179.anIntArray292, Static236.anIntArray367, Static7.anIntArray6, Static65.anInt1300 + 1, local554, Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7, Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7);
			Static115.method2067();
			Static54.method971();
			Static193.method3141(arg1, 256, arg3, arg0, arg2, 256);
			Static206.method3290(256, arg1, arg0, arg2, arg3, 256);
		}
		((Class30_Sub1) Static215.anInterface5_1).method793(Static81.anInt1635);
		Static263.method4153(arg2, arg0, arg1, arg3);
		Static277.anInt4987 = local194;
		Static94.anInt3434 = local30;
		Static306.anInt5420 = local132;
		Static233.anInt4252 = local192;
		Static93.anInt1895 = local196;
		if (Static163.aBoolean222 && Static66.aClass22_5.method530() == 0) {
			Static163.aBoolean222 = false;
		}
		if (Static163.aBoolean222) {
			if (Static156.aBoolean211) {
				Static119.method2129(arg3, arg2, arg1, arg0, 0);
			} else {
				Static25.method385(arg3, arg2, arg1, arg0, 0);
			}
			Static1.method14(false, Static180.aString200);
		}
		if (!arg4 && !Static163.aBoolean222 && !Static249.aBoolean307 && arg3 <= Static11.anInt163 && arg3 + arg1 > Static11.anInt163 && arg2 <= Static49.anInt962 && Static49.anInt962 < arg0 + arg2) {
			Static1.method10(arg0, arg1, Static11.anInt163, arg3, arg2, Static49.anInt962);
		}
	}
}
