import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "Lclient!rs;")
	public static Class207 aClass207_8;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "[I")
	public static int[] anIntArray255;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "[Lclient!qp;")
	public static final Class191[] aClass191Array1 = new Class191[14];

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!ea;IIILclient!ss;Lclient!f;ZI)V")
	public static void method2368(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class219 arg4, @OriginalArg(5) Class80 arg5, @OriginalArg(7) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static310.anInt5540 == 4) {
			local16 = (int) Static274.aFloat78 & 0x3FFF;
		} else {
			local16 = (int) Static274.aFloat78 + Static182.anInt7140 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg4.anInt6398 / 2, arg4.anInt6363 / 2) + 10;
		@Pc(45) int local45 = arg2 * arg2 + arg3 * arg3;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(59) int local59 = Class4.anIntArray7[local16];
		@Pc(68) int local68 = Class4.anIntArray6[local16];
		if (Static310.anInt5540 != 4) {
			local68 = local68 * 256 / (Static427.anInt7386 + 256);
			local59 = local59 * 256 / (Static427.anInt7386 + 256);
		}
		@Pc(97) int local97 = local59 * arg3 + local68 * arg2 >> 15;
		@Pc(108) int local108 = arg3 * local68 - local59 * arg2 >> 15;
		arg5.method6096(arg6 + arg4.anInt6398 / 2 + local97 - arg5.ja() / 2, -local108 + arg4.anInt6363 / 2 + arg1 + -(arg5.JA() / 2), arg0, arg6, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIZILclient!id;IIIIII)Z")
	public static boolean method2370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class112 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg0 - 64;
		Static45.anIntArrayArray23[64][64] = 99;
		@Pc(29) int local29 = arg8 - 64;
		Static378.anIntArrayArray183[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static221.anIntArray325[0] = arg0;
		@Pc(46) int local46 = local37 + 1;
		Static179.anIntArray273[0] = arg8;
		@Pc(51) int[][] local51 = arg3.anIntArrayArray90;
		while (local39 != local46) {
			local7 = Static221.anIntArray325[local39];
			local9 = Static179.anIntArray273[local39];
			local39 = local39 + 1 & 0xFFF;
			@Pc(72) int local72 = local7 - local18;
			@Pc(76) int local76 = local9 - local29;
			@Pc(81) int local81 = local7 - arg3.anInt3133;
			@Pc(87) int local87 = local9 - arg3.anInt3142;
			if (arg7 == -4) {
				if (local7 == arg4 && local9 == arg2) {
					Static247.anInt3930 = local7;
					Static66.anInt1364 = local9;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static44.method729(local7, 2, arg2, arg5, local9, arg4, arg6, 2)) {
					Static247.anInt3930 = local7;
					Static66.anInt1364 = local9;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg3.method2695(arg5, 2, local9, arg1, local7, 2, arg2, arg4, arg6)) {
					Static66.anInt1364 = local9;
					Static247.anInt3930 = local7;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg3.method2690(arg2, arg5, arg4, local7, arg6, local9, 2, arg1)) {
					Static247.anInt3930 = local7;
					Static66.anInt1364 = local9;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg3.method2682(arg2, arg9, local7, arg7, local9, 2, arg4)) {
					Static247.anInt3930 = local7;
					Static66.anInt1364 = local9;
					return true;
				}
			} else if (arg3.method2687(2, local9, arg9, arg4, arg2, arg7, local7)) {
				Static247.anInt3930 = local7;
				Static66.anInt1364 = local9;
				return true;
			}
			@Pc(239) int local239 = Static378.anIntArrayArray183[local72][local76] + 1;
			if (local72 > 0 && Static45.anIntArrayArray23[local72 - 1][local76] == 0 && (local51[local81 - 1][local87] & 0x43A40000) == 0 && (local51[local81 - 1][local87 + 1] & 0x4E240000) == 0) {
				Static221.anIntArray325[local46] = local7 - 1;
				Static179.anIntArray273[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static45.anIntArrayArray23[local72 - 1][local76] = 2;
				Static378.anIntArrayArray183[local72 - 1][local76] = local239;
			}
			if (local72 < 126 && Static45.anIntArrayArray23[local72 + 1][local76] == 0 && (local51[local81 + 2][local87] & 0x60E40000) == 0 && (local51[local81 + 2][local87 + 1] & 0x78240000) == 0) {
				Static221.anIntArray325[local46] = local7 + 1;
				Static179.anIntArray273[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static45.anIntArrayArray23[local72 + 1][local76] = 8;
				Static378.anIntArrayArray183[local72 + 1][local76] = local239;
			}
			if (local76 > 0 && Static45.anIntArrayArray23[local72][local76 - 1] == 0 && (local51[local81][local87 - 1] & 0x43A40000) == 0 && (local51[local81 + 1][local87 - 1] & 0x60E40000) == 0) {
				Static221.anIntArray325[local46] = local7;
				Static179.anIntArray273[local46] = local9 - 1;
				Static45.anIntArrayArray23[local72][local76 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static378.anIntArrayArray183[local72][local76 - 1] = local239;
			}
			if (local76 < 126 && Static45.anIntArrayArray23[local72][local76 + 1] == 0 && (local51[local81][local87 + 2] & 0x4E240000) == 0 && (local51[local81 + 1][local87 + 2] & 0x78240000) == 0) {
				Static221.anIntArray325[local46] = local7;
				Static179.anIntArray273[local46] = local9 + 1;
				Static45.anIntArrayArray23[local72][local76 + 1] = 4;
				local46 = local46 + 1 & 0xFFF;
				Static378.anIntArrayArray183[local72][local76 + 1] = local239;
			}
			if (local72 > 0 && local76 > 0 && Static45.anIntArrayArray23[local72 - 1][local76 - 1] == 0 && (local51[local81 - 1][local87] & 0x4FA40000) == 0 && (local51[local81 - 1][local87 - 1] & 0x43A40000) == 0 && (local51[local81][local87 - 1] & 0x63E40000) == 0) {
				Static221.anIntArray325[local46] = local7 - 1;
				Static179.anIntArray273[local46] = local9 - 1;
				Static45.anIntArrayArray23[local72 - 1][local76 - 1] = 3;
				local46 = local46 + 1 & 0xFFF;
				Static378.anIntArrayArray183[local72 - 1][local76 - 1] = local239;
			}
			if (local72 < 126 && local76 > 0 && Static45.anIntArrayArray23[local72 + 1][local76 - 1] == 0 && (local51[local81 + 1][local87 - 1] & 0x63E40000) == 0 && (local51[local81 + 2][local87 - 1] & 0x60E40000) == 0 && (local51[local81 + 2][local87] & 0x78E40000) == 0) {
				Static221.anIntArray325[local46] = local7 + 1;
				Static179.anIntArray273[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static45.anIntArrayArray23[local72 + 1][local76 - 1] = 9;
				Static378.anIntArrayArray183[local72 + 1][local76 - 1] = local239;
			}
			if (local72 > 0 && local76 < 126 && Static45.anIntArrayArray23[local72 - 1][local76 + 1] == 0 && (local51[local81 - 1][local87 + 1] & 0x4FA40000) == 0 && (local51[local81 - 1][local87 + 2] & 0x4E240000) == 0 && (local51[local81][local87 + 2] & 0x7E240000) == 0) {
				Static221.anIntArray325[local46] = local7 - 1;
				Static179.anIntArray273[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static45.anIntArrayArray23[local72 - 1][local76 + 1] = 6;
				Static378.anIntArrayArray183[local72 - 1][local76 + 1] = local239;
			}
			if (local72 < 126 && local76 < 126 && Static45.anIntArrayArray23[local72 + 1][local76 + 1] == 0 && (local51[local81 + 1][local87 + 2] & 0x7E240000) == 0 && (local51[local81 + 2][local87 + 2] & 0x78240000) == 0 && (local51[local81 + 2][local87 + 1] & 0x78E40000) == 0) {
				Static221.anIntArray325[local46] = local7 + 1;
				Static179.anIntArray273[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static45.anIntArrayArray23[local72 + 1][local76 + 1] = 12;
				Static378.anIntArrayArray183[local72 + 1][local76 + 1] = local239;
			}
		}
		Static66.anInt1364 = local9;
		Static247.anInt3930 = local7;
		return false;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
	public static void method2371() {
		Static239.method3549();
		Static373.method5118(Static389.aClass128_Sub1_1.aBoolean235);
		Static239.aClass110_2 = Static430.method5757(Static119.aClass138_7, Static299.aCanvas5, 0, 22050);
		Static239.aClass110_2.method4782(Static88.aClass1_Sub7_Sub3_1);
		Static220.aClass110_1 = Static430.method5757(Static119.aClass138_7, Static299.aCanvas5, 1, 2048);
		Static220.aClass110_1.method4782(Static38.aClass1_Sub7_Sub1_1);
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(ZI)V")
	public static void method2372(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static7.aClass1_Sub2_Sub12_2 != null) {
			Static230.anInt4125 = Static7.aClass1_Sub2_Sub12_2.anInt3520;
		} else {
			Static230.anInt4125 = -1;
		}
		Static411.anInt7188 = 0;
		Static7.aClass1_Sub2_Sub12_2 = null;
		Static139.aClass219_9 = null;
		Static67.aClass266_12 = null;
		Static7.method2285();
		Static7.aClass266_18.method6004();
		Static190.aClass207_10 = null;
		Static212.aClass207_2 = null;
		Static7.aClass222_2 = null;
		Static261.aClass207_21 = null;
		Static55.anInt1147 = -1;
		aClass207_8 = null;
		Static323.aClass207_17 = null;
		Static22.aClass207_13 = null;
		Static244.aClass207_15 = null;
		Static41.aClass207_20 = null;
		Static21.anInt465 = -1;
		Static55.aClass80_3 = null;
		Static7.aClass224_3.method5307();
		Static7.aClass126_2.method2910(64, 64);
		Static7.aClass224_3.method5304(64, 128);
		Static7.aClass105_3.method2341(64);
		Static111.aClass170_1.method3949(64);
	}
}
