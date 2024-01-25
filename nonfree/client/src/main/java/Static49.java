import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "[Lclient!ot;")
	public static Class243[] aClass243Array1;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(CBI)C")
	public static char method1396(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public static void method1398() {
		while (true) {
			if (Static442.aClass8_Sub8_Sub2_2.method8585(Static635.anInt10565) >= 15) {
				@Pc(23) int local23 = Static442.aClass8_Sub8_Sub2_2.method8586(15);
				if (local23 != 32767) {
					@Pc(30) boolean local30 = false;
					@Pc(37) Class8_Sub50 local37 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local23);
					@Pc(43) Class15_Sub1_Sub2_Sub2_Sub2 local43;
					if (local37 == null) {
						local43 = new Class15_Sub1_Sub2_Sub2_Sub2();
						local43.anInt8075 = local23;
						local37 = new Class8_Sub50(local43);
						Static278.aClass253_20.method6591(local37, (long) local23);
						local30 = true;
						Static537.aClass8_Sub50Array1[Static438.anInt8226++] = local37;
					}
					local43 = local37.aClass15_Sub1_Sub2_Sub2_Sub2_2;
					Static620.anIntArray609[Static59.anInt1906++] = local23;
					local43.anInt8089 = Static226.anInt5177;
					if (local43.aClass300_1 != null && local43.aClass300_1.method7314()) {
						Static218.method4118(local43);
					}
					@Pc(97) int local97 = Static442.aClass8_Sub8_Sub2_2.method8586(5);
					if (local97 > 15) {
						local97 -= 32;
					}
					@Pc(106) int local106 = Static442.aClass8_Sub8_Sub2_2.method8586(1);
					@Pc(113) int local113 = Static442.aClass8_Sub8_Sub2_2.method8586(5);
					if (local113 > 15) {
						local113 -= 32;
					}
					@Pc(124) int local124 = Static442.aClass8_Sub8_Sub2_2.method8586(2);
					local43.method6702(Static297.aClass338_1.method7851(Static442.aClass8_Sub8_Sub2_2.method8586(14)));
					@Pc(145) int local145 = (Static442.aClass8_Sub8_Sub2_2.method8586(3) + 4 & 0x8F200007) << 11;
					@Pc(150) int local150 = Static442.aClass8_Sub8_Sub2_2.method8586(1);
					if (local150 == 1) {
						Static151.anIntArray192[Static91.anInt2547++] = local23;
					}
					local43.method6691(local43.aClass300_1.anInt8912);
					local43.anInt8097 = local43.aClass300_1.anInt8900 << 3;
					if (local30) {
						local43.method6683(local145, true);
					}
					local43.method6704(local43.method6692(), local124, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray435[0] + local113, local106 == 1, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray436[0] + local97);
					if (local43.aClass300_1.method7314()) {
						Static586.method8144(local43, local43.anIntArray436[0], 0, null, local43.aByte124, null, local43.anIntArray435[0]);
					}
					continue;
				}
			}
			Static442.aClass8_Sub8_Sub2_2.method8590();
			return;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIBIIIILclient!caa;III)Z")
	public static boolean method1404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class48 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg4 - 64;
		Static342.anIntArrayArray37[64][64] = 99;
		@Pc(28) int local28 = arg3 - 64;
		Static84.anIntArrayArray5[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static452.anIntArray445[0] = arg4;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static579.anIntArray580[0] = arg3;
		@Pc(50) int[][] local50 = arg6.anIntArrayArray3;
		while (local42 != local45) {
			local9 = Static579.anIntArray580[local42];
			local7 = Static452.anIntArray445[local42];
			@Pc(82) int local82 = local9 - arg6.anInt1886;
			local42 = local42 + 1 & 0xFFF;
			@Pc(93) int local93 = local7 - local18;
			@Pc(98) int local98 = local9 - local28;
			@Pc(104) int local104 = local7 - arg6.anInt1884;
			if (arg5 == -4) {
				if (arg1 == local7 && arg7 == local9) {
					Static249.anInt5513 = local7;
					Static277.anInt5778 = local9;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static318.method3985(local9, 1, 1, arg9, arg1, arg7, local7, arg2)) {
					Static249.anInt5513 = local7;
					Static277.anInt5778 = local9;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg6.method1634(arg7, local7, arg9, local9, arg1, arg2, arg0, 1, 1)) {
					Static249.anInt5513 = local7;
					Static277.anInt5778 = local9;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg6.method1632(arg7, local7, arg2, arg1, local9, 1, arg9, arg0)) {
					Static277.anInt5778 = local9;
					Static249.anInt5513 = local7;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg6.method1646(local9, arg1, arg7, local7, arg8, arg5, 1)) {
					Static249.anInt5513 = local7;
					Static277.anInt5778 = local9;
					return true;
				}
			} else if (arg6.method1644(arg5, local9, 1, arg8, local7, arg7, arg1)) {
				Static249.anInt5513 = local7;
				Static277.anInt5778 = local9;
				return true;
			}
			@Pc(257) int local257 = Static84.anIntArrayArray5[local93][local98] + 1;
			if (local93 > 0 && Static342.anIntArrayArray37[local93 - 1][local98] == 0 && (local50[local104 - 1][local82] & 0x42240000) == 0) {
				Static452.anIntArray445[local45] = local7 - 1;
				Static579.anIntArray580[local45] = local9;
				Static342.anIntArrayArray37[local93 - 1][local98] = 2;
				local45 = local45 + 1 & 0xFFF;
				Static84.anIntArrayArray5[local93 - 1][local98] = local257;
			}
			if (local93 < 127 && Static342.anIntArrayArray37[local93 + 1][local98] == 0 && (local50[local104 + 1][local82] & 0x60240000) == 0) {
				Static452.anIntArray445[local45] = local7 + 1;
				Static579.anIntArray580[local45] = local9;
				Static342.anIntArrayArray37[local93 + 1][local98] = 8;
				local45 = local45 + 1 & 0xFFF;
				Static84.anIntArrayArray5[local93 + 1][local98] = local257;
			}
			if (local98 > 0 && Static342.anIntArrayArray37[local93][local98 - 1] == 0 && (local50[local104][local82 - 1] & 0x40A40000) == 0) {
				Static452.anIntArray445[local45] = local7;
				Static579.anIntArray580[local45] = local9 - 1;
				Static342.anIntArrayArray37[local93][local98 - 1] = 1;
				local45 = local45 + 1 & 0xFFF;
				Static84.anIntArrayArray5[local93][local98 - 1] = local257;
			}
			if (local98 < 127 && Static342.anIntArrayArray37[local93][local98 + 1] == 0 && (local50[local104][local82 + 1] & 0x48240000) == 0) {
				Static452.anIntArray445[local45] = local7;
				Static579.anIntArray580[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static342.anIntArrayArray37[local93][local98 + 1] = 4;
				Static84.anIntArrayArray5[local93][local98 + 1] = local257;
			}
			if (local93 > 0 && local98 > 0 && Static342.anIntArrayArray37[local93 - 1][local98 - 1] == 0 && (local50[local104 - 1][local82 - 1] & 0x43A40000) == 0 && (local50[local104 - 1][local82] & 0x42240000) == 0 && (local50[local104][local82 - 1] & 0x40A40000) == 0) {
				Static452.anIntArray445[local45] = local7 - 1;
				Static579.anIntArray580[local45] = local9 - 1;
				Static342.anIntArrayArray37[local93 - 1][local98 - 1] = 3;
				local45 = local45 + 1 & 0xFFF;
				Static84.anIntArrayArray5[local93 - 1][local98 - 1] = local257;
			}
			if (local93 < 127 && local98 > 0 && Static342.anIntArrayArray37[local93 + 1][local98 - 1] == 0 && (local50[local104 + 1][local82 - 1] & 0x60E40000) == 0 && (local50[local104 + 1][local82] & 0x60240000) == 0 && (local50[local104][local82 - 1] & 0x40A40000) == 0) {
				Static452.anIntArray445[local45] = local7 + 1;
				Static579.anIntArray580[local45] = local9 - 1;
				Static342.anIntArrayArray37[local93 + 1][local98 - 1] = 9;
				local45 = local45 + 1 & 0xFFF;
				Static84.anIntArrayArray5[local93 + 1][local98 - 1] = local257;
			}
			if (local93 > 0 && local98 < 127 && Static342.anIntArrayArray37[local93 - 1][local98 + 1] == 0 && (local50[local104 - 1][local82 + 1] & 0x4E240000) == 0 && (local50[local104 - 1][local82] & 0x42240000) == 0 && (local50[local104][local82 + 1] & 0x48240000) == 0) {
				Static452.anIntArray445[local45] = local7 - 1;
				Static579.anIntArray580[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static342.anIntArrayArray37[local93 - 1][local98 + 1] = 6;
				Static84.anIntArrayArray5[local93 - 1][local98 + 1] = local257;
			}
			if (local93 < 127 && local98 < 127 && Static342.anIntArrayArray37[local93 + 1][local98 + 1] == 0 && (local50[local104 + 1][local82 + 1] & 0x78240000) == 0 && (local50[local104 + 1][local82] & 0x60240000) == 0 && (local50[local104][local82 + 1] & 0x48240000) == 0) {
				Static452.anIntArray445[local45] = local7 + 1;
				Static579.anIntArray580[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static342.anIntArrayArray37[local93 + 1][local98 + 1] = 12;
				Static84.anIntArrayArray5[local93 + 1][local98 + 1] = local257;
			}
		}
		Static249.anInt5513 = local7;
		Static277.anInt5778 = local9;
		return false;
	}
}
