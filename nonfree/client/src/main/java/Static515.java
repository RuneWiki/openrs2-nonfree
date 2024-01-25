import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_136 = new Class47(67, 15);

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(Z)I")
	public static int method7128() {
		if ((double) Static217.aFloat72 == 3.0D) {
			return 37;
		} else if ((double) Static217.aFloat72 == 4.0D) {
			return 50;
		} else if ((double) Static217.aFloat72 == 6.0D) {
			return 75;
		} else if ((double) Static217.aFloat72 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!pfa;B)V")
	public static void method7129(@OriginalArg(0) Class251 arg0) {
		Static536.anInt8903 = 0;
		Static388.anInt6812 = 0;
		Static439.aClass40_6 = new Class40();
		Static322.aClass98_Sub1_Sub1_Sub1Array2 = new Class98_Sub1_Sub1_Sub1[1024];
		Static181.aClass98_Sub3Array1 = new Class98_Sub3[Static545.anIntArray691[Static92.anInt1780] + 1];
		Static178.anInt3720 = 0;
		Static521.anInt8749 = 0;
		Static314.method4917(arg0);
		Static334.method5199(arg0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Z")
	public static boolean method7130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static99.method1793(arg0, arg1)) {
			return (arg1 & 0x9000) != 0 | Static273.method4514(arg1, arg0) | Static185.method3397(arg0, arg1) ? true : (Static294.method4725(arg1, arg0) | (arg1 & 0x2000) != 0 | Static534.method7247(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIILclient!ld;IIIIIII)Z")
	public static boolean method7131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class189 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg7 - 64;
		@Pc(23) int local23 = arg4 - 64;
		Static85.anIntArrayArray13[64][64] = 99;
		Static39.anIntArrayArray40[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static292.anIntArray406[0] = arg7;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static127.anIntArray174[0] = arg4;
		@Pc(51) int[][] local51 = arg3.anIntArrayArray43;
		while (local46 != local43) {
			local9 = Static127.anIntArray174[local43];
			local7 = Static292.anIntArray406[local43];
			local43 = local43 + 1 & 0xFFF;
			@Pc(72) int local72 = local9 - local23;
			@Pc(77) int local77 = local7 - local18;
			@Pc(83) int local83 = local7 - arg3.anInt5301;
			@Pc(89) int local89 = local9 - arg3.anInt5293;
			if (arg6 == -4) {
				if (local7 == arg2 && local9 == arg8) {
					Static524.anInt8784 = local9;
					Static362.anInt6349 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static395.method5805(arg0, arg2, arg5, local9, 2, 2, local7, arg8)) {
					Static524.anInt8784 = local9;
					Static362.anInt6349 = local7;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg3.method4596(2, arg9, 2, arg8, arg0, arg2, local7, arg5, local9)) {
					Static362.anInt6349 = local7;
					Static524.anInt8784 = local9;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg3.method4590(local7, arg9, arg0, arg8, arg2, arg5, 2, local9)) {
					Static362.anInt6349 = local7;
					Static524.anInt8784 = local9;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg3.method4591(local9, arg8, 2, arg1, local7, arg2, arg6)) {
					Static362.anInt6349 = local7;
					Static524.anInt8784 = local9;
					return true;
				}
			} else if (arg3.method4592(local9, arg1, 2, arg6, arg2, arg8, local7)) {
				Static362.anInt6349 = local7;
				Static524.anInt8784 = local9;
				return true;
			}
			@Pc(240) int local240 = Static39.anIntArrayArray40[local77][local72] + 1;
			if (local77 > 0 && Static85.anIntArrayArray13[local77 - 1][local72] == 0 && (local51[local83 - 1][local89] & 0x43A40000) == 0 && (local51[local83 - 1][local89 + 1] & 0x4E240000) == 0) {
				Static292.anIntArray406[local46] = local7 - 1;
				Static127.anIntArray174[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static85.anIntArrayArray13[local77 - 1][local72] = 2;
				Static39.anIntArrayArray40[local77 - 1][local72] = local240;
			}
			if (local77 < 126 && Static85.anIntArrayArray13[local77 + 1][local72] == 0 && (local51[local83 + 2][local89] & 0x60E40000) == 0 && (local51[local83 + 2][local89 + 1] & 0x78240000) == 0) {
				Static292.anIntArray406[local46] = local7 + 1;
				Static127.anIntArray174[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static85.anIntArrayArray13[local77 + 1][local72] = 8;
				Static39.anIntArrayArray40[local77 + 1][local72] = local240;
			}
			if (local72 > 0 && Static85.anIntArrayArray13[local77][local72 - 1] == 0 && (local51[local83][local89 - 1] & 0x43A40000) == 0 && (local51[local83 + 1][local89 - 1] & 0x60E40000) == 0) {
				Static292.anIntArray406[local46] = local7;
				Static127.anIntArray174[local46] = local9 - 1;
				Static85.anIntArrayArray13[local77][local72 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static39.anIntArrayArray40[local77][local72 - 1] = local240;
			}
			if (local72 < 126 && Static85.anIntArrayArray13[local77][local72 + 1] == 0 && (local51[local83][local89 + 2] & 0x4E240000) == 0 && (local51[local83 + 1][local89 + 2] & 0x78240000) == 0) {
				Static292.anIntArray406[local46] = local7;
				Static127.anIntArray174[local46] = local9 + 1;
				Static85.anIntArrayArray13[local77][local72 + 1] = 4;
				local46 = local46 + 1 & 0xFFF;
				Static39.anIntArrayArray40[local77][local72 + 1] = local240;
			}
			if (local77 > 0 && local72 > 0 && Static85.anIntArrayArray13[local77 - 1][local72 - 1] == 0 && (local51[local83 - 1][local89] & 0x4FA40000) == 0 && (local51[local83 - 1][local89 - 1] & 0x43A40000) == 0 && (local51[local83][local89 - 1] & 0x63E40000) == 0) {
				Static292.anIntArray406[local46] = local7 - 1;
				Static127.anIntArray174[local46] = local9 - 1;
				Static85.anIntArrayArray13[local77 - 1][local72 - 1] = 3;
				local46 = local46 + 1 & 0xFFF;
				Static39.anIntArrayArray40[local77 - 1][local72 - 1] = local240;
			}
			if (local77 < 126 && local72 > 0 && Static85.anIntArrayArray13[local77 + 1][local72 - 1] == 0 && (local51[local83 + 1][local89 - 1] & 0x63E40000) == 0 && (local51[local83 + 2][local89 - 1] & 0x60E40000) == 0 && (local51[local83 + 2][local89] & 0x78E40000) == 0) {
				Static292.anIntArray406[local46] = local7 + 1;
				Static127.anIntArray174[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static85.anIntArrayArray13[local77 + 1][local72 - 1] = 9;
				Static39.anIntArrayArray40[local77 + 1][local72 - 1] = local240;
			}
			if (local77 > 0 && local72 < 126 && Static85.anIntArrayArray13[local77 - 1][local72 + 1] == 0 && (local51[local83 - 1][local89 + 1] & 0x4FA40000) == 0 && (local51[local83 - 1][local89 + 2] & 0x4E240000) == 0 && (local51[local83][local89 + 2] & 0x7E240000) == 0) {
				Static292.anIntArray406[local46] = local7 - 1;
				Static127.anIntArray174[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static85.anIntArrayArray13[local77 - 1][local72 + 1] = 6;
				Static39.anIntArrayArray40[local77 - 1][local72 + 1] = local240;
			}
			if (local77 < 126 && local72 < 126 && Static85.anIntArrayArray13[local77 + 1][local72 + 1] == 0 && (local51[local83 + 1][local89 + 2] & 0x7E240000) == 0 && (local51[local83 + 2][local89 + 2] & 0x78240000) == 0 && (local51[local83 + 2][local89 + 1] & 0x78E40000) == 0) {
				Static292.anIntArray406[local46] = local7 + 1;
				Static127.anIntArray174[local46] = local9 + 1;
				Static85.anIntArrayArray13[local77 + 1][local72 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static39.anIntArrayArray40[local77 + 1][local72 + 1] = local240;
			}
		}
		Static362.anInt6349 = local7;
		Static524.anInt8784 = local9;
		return false;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIZZLclient!saa;Lclient!saa;B)I")
	public static int method7132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class299_Sub1 arg4, @OriginalArg(5) Class299_Sub1 arg5) {
		@Pc(15) int local15 = Static80.method1620(arg2, arg4, arg5, arg0);
		if (local15 != 0) {
			return arg2 ? -local15 : local15;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static80.method1620(arg3, arg4, arg5, arg1);
			return arg3 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!pv;IIII)V")
	public static void method7133(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static395.method5807(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static401.anInt7022) {
			Static395.method5807(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static395.method5807(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static555.anInt9182) {
			Static395.method5807(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static555.anInt9182) {
			Static395.method5807(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static401.anInt7022 && arg4 <= Static555.anInt9182) {
			Static395.method5807(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static395.method5807(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static401.anInt7022 && arg4 > 0) {
			Static395.method5807(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
