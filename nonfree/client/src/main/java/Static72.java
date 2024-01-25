import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ck", name = "B", descriptor = "F")
	public static float aFloat17 = 0.25F;

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "Lclient!dia;")
	public static Class4_Sub14 aClass4_Sub14_1 = null;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
	public static void method1545() {
		if (Static181.aClass60_3 != Static238.aClass60_5) {
			try {
				Static684.method6376("tbrefresh", Static205.aClient1);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILclient!wj;IIIIIIII)Z")
	public static boolean method1547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class389 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg5 - 64;
		Static410.anIntArrayArray38[64][64] = 99;
		@Pc(29) int local29 = arg0 - 64;
		Static32.anIntArrayArray2[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static219.anIntArray249[0] = arg5;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static555.anIntArray598[0] = arg0;
		@Pc(56) int[][] local56 = arg2.anIntArrayArray64;
		while (local46 != local43) {
			local7 = Static219.anIntArray249[local43];
			local9 = Static555.anIntArray598[local43];
			@Pc(70) int local70 = local9 - local29;
			local43 = local43 + 1 & 0xFFF;
			@Pc(81) int local81 = local7 - local18;
			@Pc(87) int local87 = local7 - arg2.anInt10446;
			@Pc(92) int local92 = local9 - arg2.anInt10431;
			if (arg9 == -4) {
				if (arg7 == local7 && local9 == arg3) {
					Static54.anInt1253 = local7;
					Static437.anInt10168 = local9;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static65.method1433(local9, 2, arg6, arg7, 2, arg4, arg3, local7)) {
					Static54.anInt1253 = local7;
					Static437.anInt10168 = local9;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg2.method8812(arg6, arg4, 2, 2, local9, arg3, local7, arg1, arg7)) {
					Static54.anInt1253 = local7;
					Static437.anInt10168 = local9;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg2.method8808(arg6, 2, arg3, arg7, local7, arg4, local9, arg1)) {
					Static437.anInt10168 = local9;
					Static54.anInt1253 = local7;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg2.method8809(arg3, arg9, local9, arg7, local7, arg8, 2)) {
					Static437.anInt10168 = local9;
					Static54.anInt1253 = local7;
					return true;
				}
			} else if (arg2.method8804(arg7, local9, arg3, arg9, arg8, local7, 2)) {
				Static54.anInt1253 = local7;
				Static437.anInt10168 = local9;
				return true;
			}
			@Pc(240) int local240 = Static32.anIntArrayArray2[local81][local70] + 1;
			if (local81 > 0 && Static410.anIntArrayArray38[local81 - 1][local70] == 0 && (local56[local87 - 1][local92] & 0x43A40000) == 0 && (local56[local87 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static219.anIntArray249[local46] = local7 - 1;
				Static555.anIntArray598[local46] = local9;
				Static410.anIntArrayArray38[local81 - 1][local70] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static32.anIntArrayArray2[local81 - 1][local70] = local240;
			}
			if (local81 < 126 && Static410.anIntArrayArray38[local81 + 1][local70] == 0 && (local56[local87 + 2][local92] & 0x60E40000) == 0 && (local56[local87 + 2][local92 + 1] & 0x78240000) == 0) {
				Static219.anIntArray249[local46] = local7 + 1;
				Static555.anIntArray598[local46] = local9;
				Static410.anIntArrayArray38[local81 + 1][local70] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static32.anIntArrayArray2[local81 + 1][local70] = local240;
			}
			if (local70 > 0 && Static410.anIntArrayArray38[local81][local70 - 1] == 0 && (local56[local87][local92 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static219.anIntArray249[local46] = local7;
				Static555.anIntArray598[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static410.anIntArrayArray38[local81][local70 - 1] = 1;
				Static32.anIntArrayArray2[local81][local70 - 1] = local240;
			}
			if (local70 < 126 && Static410.anIntArrayArray38[local81][local70 + 1] == 0 && (local56[local87][local92 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local92 + 2] & 0x78240000) == 0) {
				Static219.anIntArray249[local46] = local7;
				Static555.anIntArray598[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static410.anIntArrayArray38[local81][local70 + 1] = 4;
				Static32.anIntArrayArray2[local81][local70 + 1] = local240;
			}
			if (local81 > 0 && local70 > 0 && Static410.anIntArrayArray38[local81 - 1][local70 - 1] == 0 && (local56[local87 - 1][local92] & 0x4FA40000) == 0 && (local56[local87 - 1][local92 - 1] & 0x43A40000) == 0 && (local56[local87][local92 - 1] & 0x63E40000) == 0) {
				Static219.anIntArray249[local46] = local7 - 1;
				Static555.anIntArray598[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static410.anIntArrayArray38[local81 - 1][local70 - 1] = 3;
				Static32.anIntArrayArray2[local81 - 1][local70 - 1] = local240;
			}
			if (local81 < 126 && local70 > 0 && Static410.anIntArrayArray38[local81 + 1][local70 - 1] == 0 && (local56[local87 + 1][local92 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local92 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local92] & 0x78E40000) == 0) {
				Static219.anIntArray249[local46] = local7 + 1;
				Static555.anIntArray598[local46] = local9 - 1;
				Static410.anIntArrayArray38[local81 + 1][local70 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static32.anIntArrayArray2[local81 + 1][local70 - 1] = local240;
			}
			if (local81 > 0 && local70 < 126 && Static410.anIntArrayArray38[local81 - 1][local70 + 1] == 0 && (local56[local87 - 1][local92 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local92 + 2] & 0x4E240000) == 0 && (local56[local87][local92 + 2] & 0x7E240000) == 0) {
				Static219.anIntArray249[local46] = local7 - 1;
				Static555.anIntArray598[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static410.anIntArrayArray38[local81 - 1][local70 + 1] = 6;
				Static32.anIntArrayArray2[local81 - 1][local70 + 1] = local240;
			}
			if (local81 < 126 && local70 < 126 && Static410.anIntArrayArray38[local81 + 1][local70 + 1] == 0 && (local56[local87 + 1][local92 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local92 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static219.anIntArray249[local46] = local7 + 1;
				Static555.anIntArray598[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static410.anIntArrayArray38[local81 + 1][local70 + 1] = 12;
				Static32.anIntArrayArray2[local81 + 1][local70 + 1] = local240;
			}
		}
		Static54.anInt1253 = local7;
		Static437.anInt10168 = local9;
		return false;
	}
}
