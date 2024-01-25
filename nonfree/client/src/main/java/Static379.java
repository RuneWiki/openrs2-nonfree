import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "Z")
	public static boolean aBoolean444 = false;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIIIIIBLclient!eq;I)Z")
	public static boolean method5352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class110 arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg1;
		@Pc(14) int local14 = arg0;
		@Pc(23) int local23 = arg1 - 64;
		@Pc(28) int local28 = arg0 - 64;
		Static624.anIntArrayArray56[64][64] = 99;
		Static107.anIntArrayArray9[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static114.anIntArray117[0] = arg1;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static459.anIntArray400[0] = arg0;
		@Pc(56) int[][] local56 = arg8.anIntArrayArray14;
		while (local51 != local48) {
			local12 = Static114.anIntArray117[local48];
			local14 = Static459.anIntArray400[local48];
			@Pc(70) int local70 = local14 - local28;
			@Pc(75) int local75 = local12 - local23;
			local48 = local48 + 1 & 0xFFF;
			@Pc(87) int local87 = local12 - arg8.anInt2712;
			@Pc(92) int local92 = local14 - arg8.anInt2726;
			if (arg7 == -4) {
				if (arg3 == local12 && arg4 == local14) {
					Static168.anInt3083 = local14;
					Static246.anInt4348 = local12;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static364.method5247(arg3, local12, 2, arg4, arg2, 2, arg9, local14)) {
					Static246.anInt4348 = local12;
					Static168.anInt3083 = local14;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg8.method2375(arg2, arg9, 2, arg5, 2, arg4, arg3, local14, local12)) {
					Static246.anInt4348 = local12;
					Static168.anInt3083 = local14;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg8.method2374(arg2, 2, arg3, arg9, arg5, arg4, local14, local12)) {
					Static168.anInt3083 = local14;
					Static246.anInt4348 = local12;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg8.method2370(arg7, arg3, 2, arg4, arg6, local12, local14)) {
					Static168.anInt3083 = local14;
					Static246.anInt4348 = local12;
					return true;
				}
			} else if (arg8.method2363(local14, local12, 2, arg3, arg4, arg7, arg6)) {
				Static246.anInt4348 = local12;
				Static168.anInt3083 = local14;
				return true;
			}
			@Pc(247) int local247 = Static107.anIntArrayArray9[local75][local70] + 1;
			if (local75 > 0 && Static624.anIntArrayArray56[local75 - 1][local70] == 0 && (local56[local87 - 1][local92] & 0x43A40000) == 0 && (local56[local87 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static114.anIntArray117[local51] = local12 - 1;
				Static459.anIntArray400[local51] = local14;
				Static624.anIntArrayArray56[local75 - 1][local70] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray9[local75 - 1][local70] = local247;
			}
			if (local75 < 126 && Static624.anIntArrayArray56[local75 + 1][local70] == 0 && (local56[local87 + 2][local92] & 0x60E40000) == 0 && (local56[local87 + 2][local92 + 1] & 0x78240000) == 0) {
				Static114.anIntArray117[local51] = local12 + 1;
				Static459.anIntArray400[local51] = local14;
				Static624.anIntArrayArray56[local75 + 1][local70] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray9[local75 + 1][local70] = local247;
			}
			if (local70 > 0 && Static624.anIntArrayArray56[local75][local70 - 1] == 0 && (local56[local87][local92 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static114.anIntArray117[local51] = local12;
				Static459.anIntArray400[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static624.anIntArrayArray56[local75][local70 - 1] = 1;
				Static107.anIntArrayArray9[local75][local70 - 1] = local247;
			}
			if (local70 < 126 && Static624.anIntArrayArray56[local75][local70 + 1] == 0 && (local56[local87][local92 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local92 + 2] & 0x78240000) == 0) {
				Static114.anIntArray117[local51] = local12;
				Static459.anIntArray400[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static624.anIntArrayArray56[local75][local70 + 1] = 4;
				Static107.anIntArrayArray9[local75][local70 + 1] = local247;
			}
			if (local75 > 0 && local70 > 0 && Static624.anIntArrayArray56[local75 - 1][local70 - 1] == 0 && (local56[local87 - 1][local92] & 0x4FA40000) == 0 && (local56[local87 - 1][local92 - 1] & 0x43A40000) == 0 && (local56[local87][local92 - 1] & 0x63E40000) == 0) {
				Static114.anIntArray117[local51] = local12 - 1;
				Static459.anIntArray400[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static624.anIntArrayArray56[local75 - 1][local70 - 1] = 3;
				Static107.anIntArrayArray9[local75 - 1][local70 - 1] = local247;
			}
			if (local75 < 126 && local70 > 0 && Static624.anIntArrayArray56[local75 + 1][local70 - 1] == 0 && (local56[local87 + 1][local92 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local92 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local92] & 0x78E40000) == 0) {
				Static114.anIntArray117[local51] = local12 + 1;
				Static459.anIntArray400[local51] = local14 - 1;
				Static624.anIntArrayArray56[local75 + 1][local70 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray9[local75 + 1][local70 - 1] = local247;
			}
			if (local75 > 0 && local70 < 126 && Static624.anIntArrayArray56[local75 - 1][local70 + 1] == 0 && (local56[local87 - 1][local92 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local92 + 2] & 0x4E240000) == 0 && (local56[local87][local92 + 2] & 0x7E240000) == 0) {
				Static114.anIntArray117[local51] = local12 - 1;
				Static459.anIntArray400[local51] = local14 + 1;
				Static624.anIntArrayArray56[local75 - 1][local70 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray9[local75 - 1][local70 + 1] = local247;
			}
			if (local75 < 126 && local70 < 126 && Static624.anIntArrayArray56[local75 + 1][local70 + 1] == 0 && (local56[local87 + 1][local92 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local92 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static114.anIntArray117[local51] = local12 + 1;
				Static459.anIntArray400[local51] = local14 + 1;
				Static624.anIntArrayArray56[local75 + 1][local70 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static107.anIntArrayArray9[local75 + 1][local70 + 1] = local247;
			}
		}
		Static168.anInt3083 = local14;
		Static246.anInt4348 = local12;
		return false;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIB)Z")
	public static boolean method5353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | Static306.method4425(arg0, arg1) || Static559.method7378(arg0, arg1);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!ha;ZII)Lclient!da;")
	public static Class67 method5354(@OriginalArg(0) Class95 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class221 local9 = Static256.method3849(arg2, arg0, arg1);
		return local9 == null ? null : local9.aClass67_7;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
	public static void method5355() {
		Static267.aClass37_3.method1028();
		Static543.aClass59_3.method1323();
		Static538.aClass114_2.method2610();
		Static466.aClass340_6.method7664();
		Static267.aClass196_1.method4471();
		Static117.aClass197_2.method4525();
		Static13.aClass213_1.method5004();
		Static366.aClass182_2.method4101();
		Static400.aClass36_1.method1018();
		Static530.aClass237_1.method5373();
		Static286.aClass319_1.method6992();
		Static461.aClass223_42.method5175();
		Static33.aClass208_11.method4946();
		Static61.aClass378_1.method8703();
		Static256.aClass303_1.method6666();
		Static389.aClass335_2.method7509();
		Static73.aClass64_3.method1498();
		Static300.aClass332_1.method7477();
		Static148.aClass320_1.method6998();
		Static598.aClass175_2.method4028();
		Static88.aClass273_1.method6044();
		Static32.aClass65_1.method1508();
		Static358.method5170();
		Static280.method4094();
		Static32.method677();
		Static123.method1844();
		Static127.method1920();
		Static319.aClass295_29.method6474();
		Static513.aClass295_52.method6474();
		Static359.aClass295_37.method6474();
		Static675.aClass295_73.method6474();
		Static250.aClass295_17.method6474();
	}
}
