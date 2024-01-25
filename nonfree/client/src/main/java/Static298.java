import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Lclient!dh;")
	public static Class1_Sub11 aClass1_Sub11_5 = new Class1_Sub11(1);

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_152 = new Class151("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "Lclient!vg;")
	public static Class250 aClass250_7 = null;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_180 = new Class214(74, -2);

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_190 = new Class137(39, 3);

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II[III)V")
	public static void method3891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg1--;
		@Pc(17) int local17 = arg0 - 1;
		@Pc(20) int local20 = local17 - 7;
		while (arg1 < local20) {
			@Pc(24) int local24 = arg1 + 1;
			arg2[local24] = arg3;
			@Pc(29) int local29 = local24 + 1;
			arg2[local29] = arg3;
			@Pc(34) int local34 = local29 + 1;
			arg2[local34] = arg3;
			@Pc(39) int local39 = local34 + 1;
			arg2[local39] = arg3;
			@Pc(44) int local44 = local39 + 1;
			arg2[local44] = arg3;
			@Pc(49) int local49 = local44 + 1;
			arg2[local49] = arg3;
			@Pc(54) int local54 = local49 + 1;
			arg2[local54] = arg3;
			arg1 = local54 + 1;
			arg2[arg1] = arg3;
		}
		while (arg1 < local17) {
			arg1++;
			arg2[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)Z")
	public static boolean method3895(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IBIIIIILclient!vb;III)Z")
	public static boolean method3896(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class247 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg4 - 64;
		@Pc(23) int local23 = arg2 - 64;
		Static411.anIntArrayArray171[64][64] = 99;
		Static397.anIntArrayArray162[64][64] = 0;
		@Pc(46) byte local46 = 0;
		Static40.anIntArray253[0] = arg4;
		@Pc(52) int local52 = 0;
		@Pc(55) int local55 = local46 + 1;
		Static145.anIntArray117[0] = arg2;
		@Pc(60) int[][] local60 = arg6.anIntArrayArray179;
		while (local55 != local52) {
			local9 = Static145.anIntArray117[local52];
			local7 = Static40.anIntArray253[local52];
			@Pc(74) int local74 = local9 - local23;
			local52 = local52 + 1 & 0xFFF;
			@Pc(85) int local85 = local7 - local18;
			@Pc(91) int local91 = local7 - arg6.anInt6878;
			@Pc(97) int local97 = local9 - arg6.anInt6866;
			if (arg9 == -4) {
				if (local7 == arg0 && arg1 == local9) {
					Static341.anInt5564 = local9;
					Static410.anInt6682 = local7;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static177.method2368(arg1, local7, 2, arg3, local9, arg7, 2, arg0)) {
					Static341.anInt5564 = local9;
					Static410.anInt6682 = local7;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg6.method5266(local9, arg7, arg1, 2, 2, arg3, arg5, arg0, local7)) {
					Static410.anInt6682 = local7;
					Static341.anInt5564 = local9;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg6.method5264(arg3, arg1, arg5, arg0, local7, 2, arg7, local9)) {
					Static410.anInt6682 = local7;
					Static341.anInt5564 = local9;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg6.method5260(local9, arg9, 2, arg0, arg1, local7, arg8)) {
					Static410.anInt6682 = local7;
					Static341.anInt5564 = local9;
					return true;
				}
			} else if (arg6.method5272(2, local9, arg0, arg9, local7, arg1, arg8)) {
				Static410.anInt6682 = local7;
				Static341.anInt5564 = local9;
				return true;
			}
			@Pc(251) int local251 = Static397.anIntArrayArray162[local85][local74] + 1;
			if (local85 > 0 && Static411.anIntArrayArray171[local85 - 1][local74] == 0 && (local60[local91 - 1][local97] & 0x43A40000) == 0 && (local60[local91 - 1][local97 + 1] & 0x4E240000) == 0) {
				Static40.anIntArray253[local55] = local7 - 1;
				Static145.anIntArray117[local55] = local9;
				local55 = local55 + 1 & 0xFFF;
				Static411.anIntArrayArray171[local85 - 1][local74] = 2;
				Static397.anIntArrayArray162[local85 - 1][local74] = local251;
			}
			if (local85 < 126 && Static411.anIntArrayArray171[local85 + 1][local74] == 0 && (local60[local91 + 2][local97] & 0x60E40000) == 0 && (local60[local91 + 2][local97 + 1] & 0x78240000) == 0) {
				Static40.anIntArray253[local55] = local7 + 1;
				Static145.anIntArray117[local55] = local9;
				Static411.anIntArrayArray171[local85 + 1][local74] = 8;
				local55 = local55 + 1 & 0xFFF;
				Static397.anIntArrayArray162[local85 + 1][local74] = local251;
			}
			if (local74 > 0 && Static411.anIntArrayArray171[local85][local74 - 1] == 0 && (local60[local91][local97 - 1] & 0x43A40000) == 0 && (local60[local91 + 1][local97 - 1] & 0x60E40000) == 0) {
				Static40.anIntArray253[local55] = local7;
				Static145.anIntArray117[local55] = local9 - 1;
				Static411.anIntArrayArray171[local85][local74 - 1] = 1;
				local55 = local55 + 1 & 0xFFF;
				Static397.anIntArrayArray162[local85][local74 - 1] = local251;
			}
			if (local74 < 126 && Static411.anIntArrayArray171[local85][local74 + 1] == 0 && (local60[local91][local97 + 2] & 0x4E240000) == 0 && (local60[local91 + 1][local97 + 2] & 0x78240000) == 0) {
				Static40.anIntArray253[local55] = local7;
				Static145.anIntArray117[local55] = local9 + 1;
				Static411.anIntArrayArray171[local85][local74 + 1] = 4;
				local55 = local55 + 1 & 0xFFF;
				Static397.anIntArrayArray162[local85][local74 + 1] = local251;
			}
			if (local85 > 0 && local74 > 0 && Static411.anIntArrayArray171[local85 - 1][local74 - 1] == 0 && (local60[local91 - 1][local97] & 0x4FA40000) == 0 && (local60[local91 - 1][local97 - 1] & 0x43A40000) == 0 && (local60[local91][local97 - 1] & 0x63E40000) == 0) {
				Static40.anIntArray253[local55] = local7 - 1;
				Static145.anIntArray117[local55] = local9 - 1;
				local55 = local55 + 1 & 0xFFF;
				Static411.anIntArrayArray171[local85 - 1][local74 - 1] = 3;
				Static397.anIntArrayArray162[local85 - 1][local74 - 1] = local251;
			}
			if (local85 < 126 && local74 > 0 && Static411.anIntArrayArray171[local85 + 1][local74 - 1] == 0 && (local60[local91 + 1][local97 - 1] & 0x63E40000) == 0 && (local60[local91 + 2][local97 - 1] & 0x60E40000) == 0 && (local60[local91 + 2][local97] & 0x78E40000) == 0) {
				Static40.anIntArray253[local55] = local7 + 1;
				Static145.anIntArray117[local55] = local9 - 1;
				local55 = local55 + 1 & 0xFFF;
				Static411.anIntArrayArray171[local85 + 1][local74 - 1] = 9;
				Static397.anIntArrayArray162[local85 + 1][local74 - 1] = local251;
			}
			if (local85 > 0 && local74 < 126 && Static411.anIntArrayArray171[local85 - 1][local74 + 1] == 0 && (local60[local91 - 1][local97 + 1] & 0x4FA40000) == 0 && (local60[local91 - 1][local97 + 2] & 0x4E240000) == 0 && (local60[local91][local97 + 2] & 0x7E240000) == 0) {
				Static40.anIntArray253[local55] = local7 - 1;
				Static145.anIntArray117[local55] = local9 + 1;
				Static411.anIntArrayArray171[local85 - 1][local74 + 1] = 6;
				local55 = local55 + 1 & 0xFFF;
				Static397.anIntArrayArray162[local85 - 1][local74 + 1] = local251;
			}
			if (local85 < 126 && local74 < 126 && Static411.anIntArrayArray171[local85 + 1][local74 + 1] == 0 && (local60[local91 + 1][local97 + 2] & 0x7E240000) == 0 && (local60[local91 + 2][local97 + 2] & 0x78240000) == 0 && (local60[local91 + 2][local97 + 1] & 0x78E40000) == 0) {
				Static40.anIntArray253[local55] = local7 + 1;
				Static145.anIntArray117[local55] = local9 + 1;
				Static411.anIntArrayArray171[local85 + 1][local74 + 1] = 12;
				local55 = local55 + 1 & 0xFFF;
				Static397.anIntArrayArray162[local85 + 1][local74 + 1] = local251;
			}
		}
		Static341.anInt5564 = local9;
		Static410.anInt6682 = local7;
		return false;
	}
}
