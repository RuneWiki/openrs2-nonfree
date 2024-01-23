import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	public static int anInt5302;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "[I")
	public static int[] anIntArray618 = new int[2];

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Z")
	public static boolean aBoolean407 = true;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "[Lclient!bk;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array3 = new Class1_Sub2_Sub4[14];

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "J")
	public static long aLong169 = 0L;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBIII)V")
	public static void method4065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3;
		@Pc(15) int local15;
		for (local3 = arg0; local3 <= arg0 + arg1; local3++) {
			for (local15 = arg4; local15 <= arg4 + arg3; local15++) {
				if (local15 >= 0 && local15 < 104 && local3 >= 0 && local3 < 104) {
					Static38.aByteArrayArrayArray5[arg2][local15][local3] = 127;
				}
			}
		}
		for (local3 = arg0; local3 < arg0 + arg1; local3++) {
			for (local15 = arg4; local15 < arg3 + arg4; local15++) {
				if (local15 >= 0 && local15 < 104 && local3 >= 0 && local3 < 104) {
					Static163.anIntArrayArrayArray16[arg2][local15][local3] = arg2 > 0 ? Static163.anIntArrayArrayArray16[arg2 - 1][local15][local3] : 0;
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (local3 = arg0 + 1; local3 < arg0 + arg1; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static163.anIntArrayArrayArray16[arg2][arg4][local3] = Static163.anIntArrayArrayArray16[arg2][arg4 - 1][local3];
				}
			}
		}
		if (arg0 > 0 && arg0 < 104) {
			for (local3 = arg4 + 1; local3 < arg3 + arg4; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static163.anIntArrayArrayArray16[arg2][local3][arg0] = Static163.anIntArrayArrayArray16[arg2][local3][arg0 - 1];
				}
			}
		}
		if (arg4 < 0 || arg0 < 0 || arg4 >= 104 || arg0 >= 104) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 > 0 && Static163.anIntArrayArrayArray16[arg2][arg4 - 1][arg0] != 0) {
				Static163.anIntArrayArrayArray16[arg2][arg4][arg0] = Static163.anIntArrayArrayArray16[arg2][arg4 - 1][arg0];
			} else if (arg0 > 0 && Static163.anIntArrayArrayArray16[arg2][arg4][arg0 - 1] != 0) {
				Static163.anIntArrayArrayArray16[arg2][arg4][arg0] = Static163.anIntArrayArrayArray16[arg2][arg4][arg0 - 1];
			} else if (arg4 > 0 && arg0 > 0 && Static163.anIntArrayArrayArray16[arg2][arg4 - 1][arg0 - 1] != 0) {
				Static163.anIntArrayArrayArray16[arg2][arg4][arg0] = Static163.anIntArrayArrayArray16[arg2][arg4 - 1][arg0 - 1];
			}
		} else if (arg4 > 0 && Static163.anIntArrayArrayArray16[arg2 - 1][arg4 - 1][arg0] != Static163.anIntArrayArrayArray16[arg2][arg4 - 1][arg0]) {
			Static163.anIntArrayArrayArray16[arg2][arg4][arg0] = Static163.anIntArrayArrayArray16[arg2][arg4 - 1][arg0];
		} else if (arg0 > 0 && Static163.anIntArrayArrayArray16[arg2 - 1][arg4][arg0 - 1] != Static163.anIntArrayArrayArray16[arg2][arg4][arg0 - 1]) {
			Static163.anIntArrayArrayArray16[arg2][arg4][arg0] = Static163.anIntArrayArrayArray16[arg2][arg4][arg0 - 1];
		} else if (arg4 > 0 && arg0 > 0 && Static163.anIntArrayArrayArray16[arg2 - 1][arg4 - 1][arg0 - 1] != Static163.anIntArrayArrayArray16[arg2][arg4 - 1][arg0 - 1]) {
			Static163.anIntArrayArrayArray16[arg2][arg4][arg0] = Static163.anIntArrayArrayArray16[arg2][arg4 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4066(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg1); local5 != -1; local5 = arg2.indexOf(arg1, arg0.length() + local5)) {
			arg2 = arg2.substring(0, local5) + arg0 + arg2.substring(arg1.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public static void method4067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class1_Sub19 local30 = Static130.aClass1_Sub19ArrayArrayArray1[local9][arg0][arg1] = Static130.aClass1_Sub19ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt2564--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt2570; local40++) {
					@Pc(49) Class124 local49 = local30.aClass124Array2[local40];
					if ((local49.aLong114 >> 29 & 0x3L) == 2L && local49.anInt3416 == arg0 && local49.anInt3411 == arg1) {
						local49.anInt3412--;
					}
				}
			}
		}
		if (Static130.aClass1_Sub19ArrayArrayArray1[0][arg0][arg1] == null) {
			Static130.aClass1_Sub19ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub19(0, arg0, arg1);
		}
		Static130.aClass1_Sub19ArrayArrayArray1[0][arg0][arg1].aClass1_Sub19_1 = local7;
		Static130.aClass1_Sub19ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method4068() {
		Static134.aClass31_22.method855();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)Z")
	public static boolean method4069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static266.method4099(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static163.anIntArrayArrayArray16[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static3.anInt142) {
					if (!Static191.method2911(local10, local24, local14)) {
						return false;
					}
					if (!Static191.method2911(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static191.method2911(local10, local28, local14)) {
						return false;
					}
					if (!Static191.method2911(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static191.method2911(local10, local32, local14)) {
					return false;
				}
				if (!Static191.method2911(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static12.anInt356) {
					if (!Static191.method2911(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static191.method2911(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static191.method2911(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static191.method2911(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static191.method2911(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static191.method2911(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static3.anInt142) {
					if (!Static191.method2911(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static191.method2911(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static191.method2911(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static191.method2911(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static191.method2911(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static191.method2911(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static12.anInt356) {
					if (!Static191.method2911(local10, local24, local14)) {
						return false;
					}
					if (!Static191.method2911(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static191.method2911(local10, local28, local14)) {
						return false;
					}
					if (!Static191.method2911(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static191.method2911(local10, local32, local14)) {
					return false;
				}
				if (!Static191.method2911(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static191.method2911(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static191.method2911(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static191.method2911(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static191.method2911(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static191.method2911(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
	public static void method4071(@OriginalArg(0) int arg0) {
		if (!Static228.method3502(arg0)) {
			return;
		}
		@Pc(14) Class127[] local14 = Static86.aClass127ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			@Pc(32) Class127 local32 = local14[local20];
			if (local32 != null) {
				local32.anInt3624 = 1;
				local32.anInt3569 = 0;
				local32.anInt3581 = 0;
			}
		}
	}
}
