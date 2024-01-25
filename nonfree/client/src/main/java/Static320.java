import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
	public static int anInt4358;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Lclient!ct;")
	public static Class30 aClass30_66;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
	public static int anInt4362;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
	public static int anInt4363;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array12;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_150 = new Class106("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	public static int anInt4361 = 0;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "[I")
	public static final int[] anIntArray351 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIBIII)V")
	public static void method4035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static38.anInt945 || Static131.anInt2843 > arg3) {
			return;
		}
		@Pc(27) boolean local27;
		if (Static93.anInt5014 > arg0) {
			arg0 = Static93.anInt5014;
			local27 = false;
		} else if (Static122.anInt1360 < arg0) {
			local27 = false;
			arg0 = Static122.anInt1360;
		} else {
			local27 = true;
		}
		@Pc(44) boolean local44;
		if (Static93.anInt5014 > arg2) {
			local44 = false;
			arg2 = Static93.anInt5014;
		} else if (Static122.anInt1360 >= arg2) {
			local44 = true;
		} else {
			local44 = false;
			arg2 = Static122.anInt1360;
		}
		if (arg4 < Static131.anInt2843) {
			arg4 = Static131.anInt2843;
		} else {
			Static367.method6081(arg1, arg0, Static43.anIntArrayArray57[arg4++], arg2);
		}
		if (Static38.anInt945 < arg3) {
			arg3 = Static38.anInt945;
		} else {
			Static367.method6081(arg1, arg0, Static43.anIntArrayArray57[arg3--], arg2);
		}
		@Pc(109) int local109;
		if (local27 && local44) {
			for (local109 = arg4; local109 <= arg3; local109++) {
				@Pc(115) int[] local115 = Static43.anIntArrayArray57[local109];
				local115[arg0] = local115[arg2] = arg1;
			}
			return;
		}
		if (local27) {
			for (local109 = arg4; local109 <= arg3; local109++) {
				Static43.anIntArrayArray57[local109][arg0] = arg1;
			}
			return;
		}
		if (local44) {
			for (local109 = arg4; local109 <= arg3; local109++) {
				Static43.anIntArrayArray57[local109][arg2] = arg1;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!va;IIZ)V")
	public static void method4036(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub2_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class67 local9 = arg1.method5898();
		@Pc(24) int local24 = arg1.anInt6773 - arg1.aClass223_7.anInt7017 & 0x3FFF;
		if (arg3 == -1) {
			if (local24 != 0 || arg1.anInt6785 > 25) {
				arg1.aBoolean499 = false;
				if (arg2 < 0 && local9.anInt2112 != -1) {
					arg1.anInt6733 = local9.anInt2112;
				} else if (arg2 <= 0 || local9.anInt2134 == -1) {
					arg1.anInt6733 = local9.anInt2129;
				} else {
					arg1.anInt6733 = local9.anInt2134;
				}
			} else if (!arg1.aBoolean499 || !local9.method2064(arg1.anInt6733)) {
				arg1.anInt6733 = local9.method2068();
				arg1.aBoolean499 = arg1.anInt6733 != -1;
			}
		} else if (arg1.anInt6736 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(217) int local217 = Static43.anIntArray412[arg0] - arg1.aClass223_7.anInt7017 & 0x3FFF;
			if (arg3 == 2 && local9.anInt2097 != -1) {
				if (local217 > 2048 && local217 <= 6144 && local9.anInt2110 != -1) {
					arg1.anInt6733 = local9.anInt2110;
				} else if (local217 >= 10240 && local217 < 14336 && local9.anInt2143 != -1) {
					arg1.anInt6733 = local9.anInt2143;
				} else if (local217 <= 6144 || local217 >= 10240 || local9.anInt2099 == -1) {
					arg1.anInt6733 = local9.anInt2097;
				} else {
					arg1.anInt6733 = local9.anInt2099;
				}
			} else if (arg3 == 0 && local9.anInt2114 != -1) {
				if (local217 > 2048 && local217 <= 6144 && local9.anInt2113 != -1) {
					arg1.anInt6733 = local9.anInt2113;
				} else if (local217 >= 10240 && local217 < 14336 && local9.anInt2115 != -1) {
					arg1.anInt6733 = local9.anInt2115;
				} else if (local217 <= 6144 || local217 >= 10240 || local9.anInt2109 == -1) {
					arg1.anInt6733 = local9.anInt2114;
				} else {
					arg1.anInt6733 = local9.anInt2109;
				}
			} else if (local217 > 2048 && local217 <= 6144 && local9.anInt2137 != -1) {
				arg1.anInt6733 = local9.anInt2137;
			} else if (local217 >= 10240 && local217 < 14336 && local9.anInt2098 != -1) {
				arg1.anInt6733 = local9.anInt2098;
			} else if (local217 <= 6144 || local217 >= 10240 || local9.anInt2120 == -1) {
				arg1.anInt6733 = local9.anInt2129;
			} else {
				arg1.anInt6733 = local9.anInt2120;
			}
			arg1.aBoolean499 = false;
		} else if (local24 == 0 && arg1.anInt6785 <= 25) {
			if (arg3 == 2 && local9.anInt2097 != -1) {
				arg1.anInt6733 = local9.anInt2097;
			} else if (arg3 == 0 && local9.anInt2114 != -1) {
				arg1.anInt6733 = local9.anInt2114;
			} else {
				arg1.anInt6733 = local9.anInt2129;
			}
			arg1.aBoolean499 = false;
		} else {
			if (arg3 == 2 && local9.anInt2097 != -1) {
				if (arg2 < 0 && local9.anInt2101 != -1) {
					arg1.anInt6733 = local9.anInt2101;
				} else if (arg2 <= 0 || local9.anInt2124 == -1) {
					arg1.anInt6733 = local9.anInt2097;
				} else {
					arg1.anInt6733 = local9.anInt2124;
				}
			} else if (arg3 == 0 && local9.anInt2114 != -1) {
				if (arg2 < 0 && local9.anInt2104 != -1) {
					arg1.anInt6733 = local9.anInt2104;
				} else if (arg2 <= 0 || local9.anInt2135 == -1) {
					arg1.anInt6733 = local9.anInt2114;
				} else {
					arg1.anInt6733 = local9.anInt2135;
				}
			} else if (arg2 < 0 && local9.anInt2122 != -1) {
				arg1.anInt6733 = local9.anInt2122;
			} else if (arg2 <= 0 || local9.anInt2133 == -1) {
				arg1.anInt6733 = local9.anInt2129;
			} else {
				arg1.anInt6733 = local9.anInt2133;
			}
			arg1.aBoolean499 = false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)I")
	public static int method4038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZI)Z")
	public static boolean method4042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static264.aByteArrayArrayArray7[0][arg0][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static264.aByteArrayArrayArray7[arg2][arg0][arg1] & 0x10) == 0) {
			return arg3 == Static30.method719(arg0, arg2, arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZ)V")
	public static void method4043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static264.aByteArrayArrayArray7 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!th;IIIIIBIII)Z")
	public static boolean method4044(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg7;
		@Pc(23) int local23 = arg2 - 64;
		Static243.anIntArrayArray52[64][64] = 99;
		@Pc(34) int local34 = arg7 - 64;
		Static226.anIntArrayArray42[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static181.anIntArray282[0] = arg2;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static77.anIntArray138[0] = arg7;
		@Pc(56) int[][] local56 = arg1.anIntArrayArray66;
		while (local48 != local51) {
			local9 = Static77.anIntArray138[local48];
			local7 = Static181.anIntArray282[local48];
			local48 = local48 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - arg1.anInt5923;
			@Pc(82) int local82 = local9 - local34;
			@Pc(87) int local87 = local7 - local23;
			@Pc(92) int local92 = local9 - arg1.anInt5905;
			if (arg0 == -4) {
				if (local7 == arg8 && arg6 == local9) {
					Static5.anInt194 = local7;
					Static225.anInt4529 = local9;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static66.method1504(local9, arg6, local7, arg9, arg3, 1, 1, arg8)) {
					Static5.anInt194 = local7;
					Static225.anInt4529 = local9;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg1.method5320(arg3, local7, arg9, local9, 1, arg6, arg8, 1, arg5)) {
					Static5.anInt194 = local7;
					Static225.anInt4529 = local9;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg1.method5309(local7, arg5, arg3, arg6, local9, 1, arg9, arg8)) {
					Static5.anInt194 = local7;
					Static225.anInt4529 = local9;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg1.method5313(arg0, arg4, local7, 1, arg6, local9, arg8)) {
					Static5.anInt194 = local7;
					Static225.anInt4529 = local9;
					return true;
				}
			} else if (arg1.method5310(arg4, 1, local9, arg8, local7, arg0, arg6)) {
				Static5.anInt194 = local7;
				Static225.anInt4529 = local9;
				return true;
			}
			@Pc(246) int local246 = Static226.anIntArrayArray42[local87][local82] + 1;
			if (local87 > 0 && Static243.anIntArrayArray52[local87 - 1][local82] == 0 && (local56[local77 - 1][local92] & 0x42240000) == 0) {
				Static181.anIntArray282[local51] = local7 - 1;
				Static77.anIntArray138[local51] = local9;
				Static243.anIntArrayArray52[local87 - 1][local82] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static226.anIntArrayArray42[local87 - 1][local82] = local246;
			}
			if (local87 < 127 && Static243.anIntArrayArray52[local87 + 1][local82] == 0 && (local56[local77 + 1][local92] & 0x60240000) == 0) {
				Static181.anIntArray282[local51] = local7 + 1;
				Static77.anIntArray138[local51] = local9;
				Static243.anIntArrayArray52[local87 + 1][local82] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static226.anIntArrayArray42[local87 + 1][local82] = local246;
			}
			if (local82 > 0 && Static243.anIntArrayArray52[local87][local82 - 1] == 0 && (local56[local77][local92 - 1] & 0x40A40000) == 0) {
				Static181.anIntArray282[local51] = local7;
				Static77.anIntArray138[local51] = local9 - 1;
				Static243.anIntArrayArray52[local87][local82 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static226.anIntArrayArray42[local87][local82 - 1] = local246;
			}
			if (local82 < 127 && Static243.anIntArrayArray52[local87][local82 + 1] == 0 && (local56[local77][local92 + 1] & 0x48240000) == 0) {
				Static181.anIntArray282[local51] = local7;
				Static77.anIntArray138[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static243.anIntArrayArray52[local87][local82 + 1] = 4;
				Static226.anIntArrayArray42[local87][local82 + 1] = local246;
			}
			if (local87 > 0 && local82 > 0 && Static243.anIntArrayArray52[local87 - 1][local82 - 1] == 0 && (local56[local77 - 1][local92 - 1] & 0x43A40000) == 0 && (local56[local77 - 1][local92] & 0x42240000) == 0 && (local56[local77][local92 - 1] & 0x40A40000) == 0) {
				Static181.anIntArray282[local51] = local7 - 1;
				Static77.anIntArray138[local51] = local9 - 1;
				Static243.anIntArrayArray52[local87 - 1][local82 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static226.anIntArrayArray42[local87 - 1][local82 - 1] = local246;
			}
			if (local87 < 127 && local82 > 0 && Static243.anIntArrayArray52[local87 + 1][local82 - 1] == 0 && (local56[local77 + 1][local92 - 1] & 0x60E40000) == 0 && (local56[local77 + 1][local92] & 0x60240000) == 0 && (local56[local77][local92 - 1] & 0x40A40000) == 0) {
				Static181.anIntArray282[local51] = local7 + 1;
				Static77.anIntArray138[local51] = local9 - 1;
				Static243.anIntArrayArray52[local87 + 1][local82 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static226.anIntArrayArray42[local87 + 1][local82 - 1] = local246;
			}
			if (local87 > 0 && local82 < 127 && Static243.anIntArrayArray52[local87 - 1][local82 + 1] == 0 && (local56[local77 - 1][local92 + 1] & 0x4E240000) == 0 && (local56[local77 - 1][local92] & 0x42240000) == 0 && (local56[local77][local92 + 1] & 0x48240000) == 0) {
				Static181.anIntArray282[local51] = local7 - 1;
				Static77.anIntArray138[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static243.anIntArrayArray52[local87 - 1][local82 + 1] = 6;
				Static226.anIntArrayArray42[local87 - 1][local82 + 1] = local246;
			}
			if (local87 < 127 && local82 < 127 && Static243.anIntArrayArray52[local87 + 1][local82 + 1] == 0 && (local56[local77 + 1][local92 + 1] & 0x78240000) == 0 && (local56[local77 + 1][local92] & 0x60240000) == 0 && (local56[local77][local92 + 1] & 0x48240000) == 0) {
				Static181.anIntArray282[local51] = local7 + 1;
				Static77.anIntArray138[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static243.anIntArrayArray52[local87 + 1][local82 + 1] = 12;
				Static226.anIntArrayArray42[local87 + 1][local82 + 1] = local246;
			}
		}
		Static225.anInt4529 = local9;
		Static5.anInt194 = local7;
		return false;
	}
}
