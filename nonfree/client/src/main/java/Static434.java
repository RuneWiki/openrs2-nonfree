import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "Lclient!mv;")
	public static Class166 aClass166_1;

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "Lclient!ci;")
	public static Class38 aClass38_89;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[B[BBIIII)V")
	public static void method5970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg6 >> 2);
		@Pc(20) int local20 = -(arg6 & 0x3);
		for (@Pc(23) int local23 = -arg7; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg1++;
				arg2[local31] = (byte) (arg2[local31] - arg3[arg4++]);
				@Pc(44) int local44 = arg1++;
				arg2[local44] = (byte) (arg2[local44] - arg3[arg4++]);
				@Pc(57) int local57 = arg1++;
				arg2[local57] = (byte) (arg2[local57] - arg3[arg4++]);
				@Pc(70) int local70 = arg1++;
				arg2[local70] = (byte) (arg2[local70] - arg3[arg4++]);
			}
			for (@Pc(86) int local86 = local20; local86 < 0; local86++) {
				local31 = arg1++;
				arg2[local31] = (byte) (arg2[local31] - arg3[arg4++]);
			}
			arg1 += arg0;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)Z")
	public static boolean method5971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static112.method2196(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static391.anInt6797;
		@Pc(14) int local14 = arg2 << Static391.anInt6797;
		@Pc(23) int local23 = Static389.aClass14Array3[arg0].oa(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static391.anInt6797 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static391.anInt6797 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static391.anInt6797 - 7);
		if (arg3 == 1) {
			if (local10 > Static203.anInt4178) {
				if (!Static254.method4160(local10, local23, local14)) {
					return false;
				}
				if (!Static254.method4160(local10, local23, local14 + Static423.anInt7318)) {
					return false;
				}
				if (!Static254.method4160(local10, local23, local14 + Static223.anInt4452)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static254.method4160(local10, local31, local14)) {
					return false;
				}
				if (!Static254.method4160(local10, local31, local14 + Static423.anInt7318)) {
					return false;
				}
				if (!Static254.method4160(local10, local31, local14 + Static223.anInt4452)) {
					return false;
				}
			}
			if (!Static254.method4160(local10, local39, local14)) {
				return false;
			} else if (Static254.method4160(local10, local39, local14 + Static423.anInt7318)) {
				return Static254.method4160(local10, local39, local14 + Static223.anInt4452);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static332.anInt5918) {
				if (!Static254.method4160(local10, local23, local14 + Static223.anInt4452)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static423.anInt7318, local23, local14 + Static223.anInt4452)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static223.anInt4452, local23, local14 + Static223.anInt4452)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static254.method4160(local10, local31, local14 + Static223.anInt4452)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static423.anInt7318, local31, local14 + Static223.anInt4452)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static223.anInt4452, local31, local14 + Static223.anInt4452)) {
					return false;
				}
			}
			if (!Static254.method4160(local10, local39, local14 + Static223.anInt4452)) {
				return false;
			} else if (Static254.method4160(local10 + Static423.anInt7318, local39, local14 + Static223.anInt4452)) {
				return Static254.method4160(local10 + Static223.anInt4452, local39, local14 + Static223.anInt4452);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static203.anInt4178) {
				if (!Static254.method4160(local10 + Static223.anInt4452, local23, local14)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static223.anInt4452, local23, local14 + Static423.anInt7318)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static223.anInt4452, local23, local14 + Static223.anInt4452)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static254.method4160(local10 + Static223.anInt4452, local31, local14)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static223.anInt4452, local31, local14 + Static423.anInt7318)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static223.anInt4452, local31, local14 + Static223.anInt4452)) {
					return false;
				}
			}
			if (!Static254.method4160(local10 + Static223.anInt4452, local39, local14)) {
				return false;
			} else if (Static254.method4160(local10 + Static223.anInt4452, local39, local14 + Static423.anInt7318)) {
				return Static254.method4160(local10 + Static223.anInt4452, local39, local14 + Static223.anInt4452);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static332.anInt5918) {
				if (!Static254.method4160(local10, local23, local14)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static423.anInt7318, local23, local14)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static223.anInt4452, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static254.method4160(local10, local31, local14)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static423.anInt7318, local31, local14)) {
					return false;
				}
				if (!Static254.method4160(local10 + Static223.anInt4452, local31, local14)) {
					return false;
				}
			}
			if (!Static254.method4160(local10, local39, local14)) {
				return false;
			} else if (Static254.method4160(local10 + Static423.anInt7318, local39, local14)) {
				return Static254.method4160(local10 + Static223.anInt4452, local39, local14);
			} else {
				return false;
			}
		} else if (!Static254.method4160(local10 + Static423.anInt7318, local47, local14 + Static423.anInt7318)) {
			return false;
		} else if (arg3 == 16) {
			return Static254.method4160(local10, local39, local14 + Static223.anInt4452);
		} else if (arg3 == 32) {
			return Static254.method4160(local10 + Static223.anInt4452, local39, local14 + Static223.anInt4452);
		} else if (arg3 == 64) {
			return Static254.method4160(local10 + Static223.anInt4452, local39, local14);
		} else if (arg3 == 128) {
			return Static254.method4160(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method5972(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static401.anInt7085 >= 100) {
			Static200.method3529(Static97.aClass21_25.method362(Static168.anInt3290));
			return;
		}
		@Pc(22) String local22 = Static315.method4358(arg1);
		if (local22 == null) {
			return;
		}
		@Pc(65) String local65;
		for (@Pc(27) int local27 = 0; local27 < Static401.anInt7085; local27++) {
			@Pc(35) String local35 = Static315.method4358(Static225.aStringArray20[local27]);
			if (local35 != null && local35.equals(local22)) {
				Static200.method3529(arg1 + Static279.aClass21_80.method362(Static168.anInt3290));
				return;
			}
			if (Static244.aStringArray22[local27] != null) {
				local65 = Static315.method4358(Static244.aStringArray22[local27]);
				if (local65 != null && local65.equals(local22)) {
					Static200.method3529(arg1 + Static279.aClass21_80.method362(Static168.anInt3290));
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static65.anInt1626; local95++) {
			local65 = Static315.method4358(Static75.aStringArray9[local95]);
			if (local65 != null && local65.equals(local22)) {
				Static200.method3529(Static445.aClass21_118.method362(Static168.anInt3290) + arg1 + Static111.aClass21_32.method362(Static168.anInt3290));
				return;
			}
			if (Static108.aStringArray10[local95] != null) {
				@Pc(138) String local138 = Static315.method4358(Static108.aStringArray10[local95]);
				if (local138 != null && local138.equals(local22)) {
					Static200.method3529(Static445.aClass21_118.method362(Static168.anInt3290) + arg1 + Static111.aClass21_32.method362(Static168.anInt3290));
					return;
				}
			}
		}
		if (Static315.method4358(Static52.aClass11_Sub5_Sub2_Sub1_2.aString31).equals(local22)) {
			Static200.method3529(Static228.aClass21_60.method362(Static168.anInt3290));
		} else {
			Static448.method6134(Static465.aClass212_103);
			Static457.aClass4_Sub20_Sub1_5.method4590(Static316.method4760(arg1) + 1);
			Static457.aClass4_Sub20_Sub1_5.method4599(arg1);
			Static457.aClass4_Sub20_Sub1_5.method4590(arg0 ? 1 : 0);
		}
	}
}
