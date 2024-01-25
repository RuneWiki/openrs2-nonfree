import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fq", name = "B", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public static void method2182() {
		if (Static446.aClass161Array1 == null) {
			Static446.aClass161Array1 = Static236.method3452();
			Static28.aClass161_1 = Static446.aClass161Array1[0];
		}
		@Pc(21) Class161 local21 = Static28.aClass161_1;
		@Pc(24) int local24 = Static411.method5973();
		if (Static28.aClass161_1 == local21) {
			Static351.aString76 = Static28.aClass161_1.aClass104_110.method2145(Static470.anInt7957);
			if (Static28.aClass161_1.aBoolean255) {
				Static351.aString76 = Static351.aString76 + local24 + "%";
			}
			Static309.anInt5563 = Static28.aClass161_1.anInt3991;
		} else if (Static236.aClass161_32 == Static28.aClass161_1) {
			Static99.method1593(3);
		} else {
			Static351.aString76 = local21.aClass104_109.method2145(Static470.anInt7957);
			Static309.anInt5563 = local21.anInt3993;
		}
		if (Static454.anInterface14Array1 == null) {
			return;
		}
		for (@Pc(75) int local75 = Static106.anInt2001 + 1; local75 < Static454.anInterface14Array1.length; local75++) {
			if (Static454.anInterface14Array1[local75].method5122() >= 100 && Static106.anInt2001 == local75 - 1 && Static146.anInt2581 >= 1 && Static454.anInterface14Array1[local75].method5121()) {
				Static454.anInterface14Array1[local75].method5118();
				Static556.method7616(Static454.anInterface14Array1[local75]);
				Static106.anInt2001++;
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIILclient!sl;IIIIIII)Z")
	public static boolean method2186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class295 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg5;
		@Pc(18) int local18 = arg7 - 64;
		Static88.anIntArrayArray26[64][64] = 99;
		@Pc(33) int local33 = arg5 - 64;
		Static102.anIntArrayArray29[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static160.anIntArray325[0] = arg7;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static502.anIntArray649[0] = arg5;
		@Pc(55) int[][] local55 = arg2.anIntArrayArray80;
		while (local47 != local50) {
			local9 = Static502.anIntArray649[local47];
			local7 = Static160.anIntArray325[local47];
			@Pc(69) int local69 = local7 - local18;
			local47 = local47 + 1 & 0xFFF;
			@Pc(80) int local80 = local9 - local33;
			@Pc(86) int local86 = local7 - arg2.anInt7938;
			@Pc(92) int local92 = local9 - arg2.anInt7934;
			if (arg6 == -4) {
				if (local7 == arg9 && arg1 == local9) {
					Static119.anInt7676 = local7;
					Static97.anInt1600 = local9;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static134.method1997(2, arg9, arg3, local9, arg1, local7, arg4, 2)) {
					Static119.anInt7676 = local7;
					Static97.anInt1600 = local9;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg2.method6561(2, local7, arg1, arg3, arg4, arg9, 2, arg8, local9)) {
					Static119.anInt7676 = local7;
					Static97.anInt1600 = local9;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg2.method6547(arg1, 2, arg4, local7, arg9, local9, arg3, arg8)) {
					Static97.anInt1600 = local9;
					Static119.anInt7676 = local7;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg2.method6545(arg1, 2, arg0, arg9, arg6, local9, local7)) {
					Static97.anInt1600 = local9;
					Static119.anInt7676 = local7;
					return true;
				}
			} else if (arg2.method6559(arg0, arg1, 2, arg9, arg6, local7, local9)) {
				Static97.anInt1600 = local9;
				Static119.anInt7676 = local7;
				return true;
			}
			@Pc(242) int local242 = Static102.anIntArrayArray29[local69][local80] + 1;
			if (local69 > 0 && Static88.anIntArrayArray26[local69 - 1][local80] == 0 && (local55[local86 - 1][local92] & 0x43A40000) == 0 && (local55[local86 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static160.anIntArray325[local50] = local7 - 1;
				Static502.anIntArray649[local50] = local9;
				Static88.anIntArrayArray26[local69 - 1][local80] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static102.anIntArrayArray29[local69 - 1][local80] = local242;
			}
			if (local69 < 126 && Static88.anIntArrayArray26[local69 + 1][local80] == 0 && (local55[local86 + 2][local92] & 0x60E40000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78240000) == 0) {
				Static160.anIntArray325[local50] = local7 + 1;
				Static502.anIntArray649[local50] = local9;
				Static88.anIntArrayArray26[local69 + 1][local80] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static102.anIntArrayArray29[local69 + 1][local80] = local242;
			}
			if (local80 > 0 && Static88.anIntArrayArray26[local69][local80 - 1] == 0 && (local55[local86][local92 - 1] & 0x43A40000) == 0 && (local55[local86 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static160.anIntArray325[local50] = local7;
				Static502.anIntArray649[local50] = local9 - 1;
				Static88.anIntArrayArray26[local69][local80 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static102.anIntArrayArray29[local69][local80 - 1] = local242;
			}
			if (local80 < 126 && Static88.anIntArrayArray26[local69][local80 + 1] == 0 && (local55[local86][local92 + 2] & 0x4E240000) == 0 && (local55[local86 + 1][local92 + 2] & 0x78240000) == 0) {
				Static160.anIntArray325[local50] = local7;
				Static502.anIntArray649[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static88.anIntArrayArray26[local69][local80 + 1] = 4;
				Static102.anIntArrayArray29[local69][local80 + 1] = local242;
			}
			if (local69 > 0 && local80 > 0 && Static88.anIntArrayArray26[local69 - 1][local80 - 1] == 0 && (local55[local86 - 1][local92] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 - 1] & 0x43A40000) == 0 && (local55[local86][local92 - 1] & 0x63E40000) == 0) {
				Static160.anIntArray325[local50] = local7 - 1;
				Static502.anIntArray649[local50] = local9 - 1;
				Static88.anIntArrayArray26[local69 - 1][local80 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static102.anIntArrayArray29[local69 - 1][local80 - 1] = local242;
			}
			if (local69 < 126 && local80 > 0 && Static88.anIntArrayArray26[local69 + 1][local80 - 1] == 0 && (local55[local86 + 1][local92 - 1] & 0x63E40000) == 0 && (local55[local86 + 2][local92 - 1] & 0x60E40000) == 0 && (local55[local86 + 2][local92] & 0x78E40000) == 0) {
				Static160.anIntArray325[local50] = local7 + 1;
				Static502.anIntArray649[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static88.anIntArrayArray26[local69 + 1][local80 - 1] = 9;
				Static102.anIntArrayArray29[local69 + 1][local80 - 1] = local242;
			}
			if (local69 > 0 && local80 < 126 && Static88.anIntArrayArray26[local69 - 1][local80 + 1] == 0 && (local55[local86 - 1][local92 + 1] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 + 2] & 0x4E240000) == 0 && (local55[local86][local92 + 2] & 0x7E240000) == 0) {
				Static160.anIntArray325[local50] = local7 - 1;
				Static502.anIntArray649[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static88.anIntArrayArray26[local69 - 1][local80 + 1] = 6;
				Static102.anIntArrayArray29[local69 - 1][local80 + 1] = local242;
			}
			if (local69 < 126 && local80 < 126 && Static88.anIntArrayArray26[local69 + 1][local80 + 1] == 0 && (local55[local86 + 1][local92 + 2] & 0x7E240000) == 0 && (local55[local86 + 2][local92 + 2] & 0x78240000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static160.anIntArray325[local50] = local7 + 1;
				Static502.anIntArray649[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static88.anIntArrayArray26[local69 + 1][local80 + 1] = 12;
				Static102.anIntArrayArray29[local69 + 1][local80 + 1] = local242;
			}
		}
		Static97.anInt1600 = local9;
		Static119.anInt7676 = local7;
		return false;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIBIII)V")
	public static void method2191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg3 < 0 || arg1 >= Static301.anInt4912 - 1 || arg3 >= Static473.anInt7969 - 1) {
			return;
		}
		if (Static208.aClass9ArrayArrayArray3 == null) {
			return;
		}
		@Pc(37) Interface6 local37;
		if (arg5 == 0) {
			local37 = (Interface6) Static120.method1814(arg4, arg1, arg3);
			@Pc(43) Interface6 local43 = (Interface6) Static527.method7362(arg4, arg1, arg3);
			if (local37 != null && arg6 != 2) {
				if (local37 instanceof Class29_Sub5_Sub1) {
					((Class29_Sub5_Sub1) local37).aClass169_2.method3587(arg0);
				} else {
					Static408.method5961(arg1, arg5, arg0, arg3, local37.method7555(), arg6, arg2, arg4);
				}
			}
			if (local43 != null) {
				if (local43 instanceof Class29_Sub5_Sub1) {
					((Class29_Sub5_Sub1) local43).aClass169_2.method3587(arg0);
				} else {
					Static408.method5961(arg1, arg5, arg0, arg3, local43.method7555(), arg6, arg2, arg4);
				}
			}
		} else if (arg5 == 1) {
			local37 = (Interface6) Static178.method5953(arg4, arg1, arg3);
			if (local37 != null) {
				if (local37 instanceof Class29_Sub1_Sub2) {
					((Class29_Sub1_Sub2) local37).aClass169_3.method3587(arg0);
				} else {
					@Pc(217) int local217 = local37.method7555();
					if (arg6 == 4 || arg6 == 5) {
						Static408.method5961(arg1, arg5, arg0, arg3, local217, 4, arg2, arg4);
					} else if (arg6 == 6) {
						Static408.method5961(arg1, arg5, arg0, arg3, local217, 4, arg2 + 4, arg4);
					} else if (arg6 == 7) {
						Static408.method5961(arg1, arg5, arg0, arg3, local217, 4, (arg2 + 2 & 0x3) + 4, arg4);
					} else if (arg6 == 8) {
						Static408.method5961(arg1, arg5, arg0, arg3, local217, 4, arg2 + 4, arg4);
						Static408.method5961(arg1, arg5, arg0, arg3, local217, 4, (arg2 + 2 & 0x3) + 4, arg4);
					}
				}
			}
		} else if (arg5 == 2) {
			local37 = (Interface6) Static134.method1995(arg4, arg1, arg3, dda.class);
			if (local37 != null) {
				if (arg6 == 11) {
					arg6 = 10;
				}
				if (local37 instanceof Class29_Sub2_Sub6) {
					((Class29_Sub2_Sub6) local37).aClass169_4.method3587(arg0);
				} else {
					Static408.method5961(arg1, arg5, arg0, arg3, local37.method7555(), arg6, arg2, arg4);
				}
			}
		} else if (arg5 == 3) {
			local37 = (Interface6) Static315.method4904(arg4, arg1, arg3);
			if (local37 != null) {
				if (local37 instanceof Class29_Sub3_Sub2) {
					((Class29_Sub3_Sub2) local37).aClass169_1.method3587(arg0);
				} else {
					Static408.method5961(arg1, arg5, arg0, arg3, local37.method7555(), arg6, arg2, arg4);
				}
			}
		}
	}
}
