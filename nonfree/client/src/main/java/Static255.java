import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Z")
	public static boolean aBoolean311 = false;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "[I")
	public static int[] anIntArray433 = new int[5];

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString166 = "wishes to trade with you.";

	@OriginalMember(owner = "client!te", name = "p", descriptor = "Z")
	public static boolean aBoolean312 = false;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "[I")
	public static int[] anIntArray434 = new int[2];

	@OriginalMember(owner = "client!te", name = "v", descriptor = "Z")
	public static volatile boolean aBoolean313 = true;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIIII)V")
	public static void method3838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		@Pc(22) int local22;
		for (local11 = arg1; local11 <= arg0 + arg1; local11++) {
			for (local22 = arg2; local22 <= arg2 + arg3; local22++) {
				if (local22 >= 0 && local22 < 104 && local11 >= 0 && local11 < 104) {
					Static227.aByteArrayArrayArray14[arg4][local22][local11] = 127;
				}
			}
		}
		for (local11 = arg1; local11 < arg1 + arg0; local11++) {
			for (local22 = arg2; local22 < arg2 + arg3; local22++) {
				if (local22 >= 0 && local22 < 104 && local11 >= 0 && local11 < 104) {
					Static250.anIntArrayArrayArray13[arg4][local22][local11] = arg4 > 0 ? Static250.anIntArrayArrayArray13[arg4 - 1][local22][local11] : 0;
				}
			}
		}
		if (arg2 > 0 && arg2 < 104) {
			for (local11 = arg1 + 1; local11 < arg1 + arg0; local11++) {
				if (local11 >= 0 && local11 < 104) {
					Static250.anIntArrayArrayArray13[arg4][arg2][local11] = Static250.anIntArrayArrayArray13[arg4][arg2 - 1][local11];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local11 = arg2 + 1; local11 < arg2 + arg3; local11++) {
				if (local11 >= 0 && local11 < 104) {
					Static250.anIntArrayArrayArray13[arg4][local11][arg1] = Static250.anIntArrayArrayArray13[arg4][local11][arg1 - 1];
				}
			}
		}
		if (arg2 < 0 || arg1 < 0 || arg2 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 > 0 && Static250.anIntArrayArrayArray13[arg4][arg2 - 1][arg1] != 0) {
				Static250.anIntArrayArrayArray13[arg4][arg2][arg1] = Static250.anIntArrayArrayArray13[arg4][arg2 - 1][arg1];
			} else if (arg1 > 0 && Static250.anIntArrayArrayArray13[arg4][arg2][arg1 - 1] != 0) {
				Static250.anIntArrayArrayArray13[arg4][arg2][arg1] = Static250.anIntArrayArrayArray13[arg4][arg2][arg1 - 1];
			} else if (arg2 > 0 && arg1 > 0 && Static250.anIntArrayArrayArray13[arg4][arg2 - 1][arg1 - 1] != 0) {
				Static250.anIntArrayArrayArray13[arg4][arg2][arg1] = Static250.anIntArrayArrayArray13[arg4][arg2 - 1][arg1 - 1];
			}
		} else if (arg2 > 0 && Static250.anIntArrayArrayArray13[arg4 - 1][arg2 - 1][arg1] != Static250.anIntArrayArrayArray13[arg4][arg2 - 1][arg1]) {
			Static250.anIntArrayArrayArray13[arg4][arg2][arg1] = Static250.anIntArrayArrayArray13[arg4][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static250.anIntArrayArrayArray13[arg4][arg2][arg1 - 1] != Static250.anIntArrayArrayArray13[arg4 - 1][arg2][arg1 - 1]) {
			Static250.anIntArrayArrayArray13[arg4][arg2][arg1] = Static250.anIntArrayArrayArray13[arg4][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static250.anIntArrayArrayArray13[arg4 - 1][arg2 - 1][arg1 - 1] != Static250.anIntArrayArrayArray13[arg4][arg2 - 1][arg1 - 1]) {
			Static250.anIntArrayArrayArray13[arg4][arg2][arg1] = Static250.anIntArrayArrayArray13[arg4][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3839(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)V")
	public static void method3843() {
		Static18.aClass33_3.method838(5);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZI)V")
	public static void method3845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static142.aClass4_Sub17_Sub1_3.method1905(29);
		Static142.aClass4_Sub17_Sub1_3.method1855(arg1);
		Static142.aClass4_Sub17_Sub1_3.method1893(arg0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIBIIII)V")
	public static void method3846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg6) {
			method3850(arg4, arg0, arg1, arg3, arg6, arg2);
		} else if (arg1 - arg6 >= Static211.anInt4200 && arg6 + arg1 <= Static154.anInt3126 && arg0 - arg5 >= Static171.anInt3392 && arg5 + arg0 <= Static141.anInt2889) {
			Static3.method45(arg1, arg0, arg5, arg2, arg4, arg3, arg6);
		} else {
			Static259.method3912(arg5, arg4, arg6, arg2, arg0, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	public static void method3847() {
		Static32.method479(0, 0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I[[FIIBLclient!gj;II[[II[[FZF[[FI[[III)I")
	public static int method3848(@OriginalArg(0) int arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class4_Sub14 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) float arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int[][] arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16) {
		@Pc(12) int local12;
		if (arg16 == 1) {
			local12 = arg5;
			arg5 = arg15;
			arg15 = 128 - local12;
		} else if (arg16 == 2) {
			arg5 = 128 - arg5;
			arg15 = 128 - arg15;
		} else if (arg16 == 3) {
			local12 = arg5;
			arg5 = 128 - arg15;
			arg15 = local12;
		}
		@Pc(71) float local71;
		@Pc(79) float local79;
		@Pc(73) int local73;
		@Pc(65) float local65;
		if (arg5 == 0 && arg15 == 0) {
			local65 = arg1[arg3][arg6];
			local71 = arg12[arg3][arg6];
			local73 = arg0;
			local79 = arg9[arg3][arg6];
		} else if (arg5 == 128 && arg15 == 0) {
			local65 = arg1[arg3 + 1][arg6];
			local73 = arg13;
			local79 = arg9[arg3 + 1][arg6];
			local71 = arg12[arg3 + 1][arg6];
		} else if (arg5 == 128 && arg15 == 128) {
			local73 = arg2;
			local79 = arg9[arg3 + 1][arg6 + 1];
			local71 = arg12[arg3 + 1][arg6 + 1];
			local65 = arg1[arg3 + 1][arg6 + 1];
		} else if (arg5 == 0 && arg15 == 128) {
			local73 = arg8;
			local79 = arg9[arg3][arg6 + 1];
			local65 = arg1[arg3][arg6 + 1];
			local71 = arg12[arg3][arg6 + 1];
		} else {
			local79 = arg9[arg3][arg6];
			local71 = arg12[arg3][arg6];
			@Pc(186) float local186 = (float) arg5 / 128.0F;
			@Pc(191) float local191 = (float) arg15 / 128.0F;
			local65 = arg1[arg3][arg6];
			@Pc(205) float local205 = arg12[arg3][arg6 + 1];
			@Pc(219) float local219 = local79 + local186 * (arg9[arg3 + 1][arg6] - local79);
			@Pc(236) float local236 = local205 + (arg12[arg3 + 1][arg6 + 1] - local205) * local186;
			@Pc(251) float local251 = local71 + (arg12[arg3 + 1][arg6] - local71) * local186;
			@Pc(259) float local259 = arg9[arg3][arg6 + 1];
			@Pc(276) float local276 = local259 + (arg9[arg3 + 1][arg6 + 1] - local259) * local186;
			@Pc(290) float local290 = local65 + local186 * (arg1[arg3 + 1][arg6] - local65);
			local71 = local251 + local191 * (local236 - local251);
			local79 = local219 + (local276 - local219) * local191;
			@Pc(315) float local315 = arg1[arg3][arg6 + 1];
			@Pc(332) float local332 = local315 + local186 * (arg1[arg3 + 1][arg6 + 1] - local315);
			@Pc(338) int local338 = Static274.method4073(arg13, arg0, arg5);
			@Pc(344) int local344 = Static274.method4073(arg2, arg8, arg5);
			local65 = local290 + (local332 - local290) * local191;
			local73 = Static274.method4073(local344, local338, arg15);
		}
		@Pc(392) int local392 = (arg6 << 7) + arg15;
		@Pc(398) int local398 = arg5 + (arg3 << 7);
		@Pc(406) int local406 = Static52.method863(arg3, arg5, arg6, arg7, arg15);
		return arg4.method1457(local398, local406, local392, local65, local71, local79, arg10 ? local73 & 0xFFFFFF00 : local73, arg14 == null ? 0.0F : (float) (local406 - Static52.method863(arg3, arg5, arg6, arg14, arg15)) / arg11);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public static void method3849() {
		aString166 = null;
		anIntArray434 = null;
		anIntArray433 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)V")
	private static void method3850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 - arg4 >= Static211.anInt4200 && arg2 + arg4 <= Static154.anInt3126 && Static171.anInt3392 <= arg1 - arg4 && Static141.anInt2889 >= arg1 + arg4) {
			Static119.method2041(arg0, arg2, arg3, arg5, arg1, arg4);
		} else {
			Static88.method1417(arg1, arg5, arg4, arg0, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z")
	public static boolean method3851(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static142.aBoolean192) {
			return false;
		}
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static148.aClass22ArrayArray1[local14] == null || Static148.aClass22ArrayArray1[local14][local18] == null) {
			return false;
		}
		@Pc(37) Class22 local37 = Static148.aClass22ArrayArray1[local14][local18];
		@Pc(48) int local48;
		if (arg1 == -1 && local37.anInt542 == 0) {
			for (local48 = 0; local48 < Static60.anInt1152; local48++) {
				if (Static299.aShortArray93[local48] == 50 || Static299.aShortArray93[local48] == 1002 || Static299.aShortArray93[local48] == 18 || Static299.aShortArray93[local48] == 49 || Static299.aShortArray93[local48] == 6) {
					for (@Pc(86) Class22 local86 = Static21.method3453(Static136.anIntArray251[local48]); local86 != null; local86 = Static74.method1125(local86)) {
						if (local37.anInt596 == local86.anInt596) {
							return true;
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < Static60.anInt1152; local48++) {
				if (Static66.anIntArray136[local48] == arg1 && local37.anInt596 == Static136.anIntArray251[local48] && (Static299.aShortArray93[local48] == 50 || Static299.aShortArray93[local48] == 1002 || Static299.aShortArray93[local48] == 18 || Static299.aShortArray93[local48] == 49 || Static299.aShortArray93[local48] == 6)) {
					return true;
				}
			}
		}
		return false;
	}
}
