import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "Z")
	public static boolean aBoolean216 = false;

	@OriginalMember(owner = "client!kk", name = "R", descriptor = "Z")
	public static boolean aBoolean217 = false;

	@OriginalMember(owner = "client!kk", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString204 = "Loaded update list";

	@OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
	public static int anInt3326 = 0;

	@OriginalMember(owner = "client!kk", name = "W", descriptor = "I")
	public static int anInt3328 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIZIIIIIIIII)V")
	public static void method2405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) int arg9) {
		@Pc(3) int local3;
		@Pc(8) int local8;
		for (local3 = 0; local3 < 104; local3++) {
			for (local8 = 0; local8 < 104; local8++) {
				Static145.anIntArrayArray77[local3][local8] = 0;
				Static133.anIntArrayArray36[local3][local8] = 99999999;
			}
		}
		Static145.anIntArrayArray77[arg4][arg8] = 99;
		Static133.anIntArrayArray36[arg4][arg8] = 0;
		@Pc(49) int local49 = 0;
		local3 = arg4;
		local8 = arg8;
		@Pc(55) byte local55 = 0;
		Static78.anIntArray189[0] = arg4;
		@Pc(61) boolean local61 = false;
		@Pc(72) int local72 = local55 + 1;
		Static134.anIntArray290[0] = arg8;
		@Pc(79) int[][] local79 = Static82.aClass75Array1[Static185.anInt4085].anIntArrayArray30;
		@Pc(201) int local201;
		@Pc(248) int local248;
		label333: while (local72 != local49) {
			local3 = Static78.anIntArray189[local49];
			local8 = Static134.anIntArray290[local49];
			local49 = local49 + 1 & 0xFFF;
			if (arg2 == local3 && arg7 == local8) {
				local61 = true;
				break;
			}
			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && Static82.aClass75Array1[Static185.anInt4085].method1826(arg7, arg9 - 1, arg3, arg2, arg6, local8, local3)) {
					local61 = true;
					break;
				}
				if (arg9 < 10 && Static82.aClass75Array1[Static185.anInt4085].method1825(arg2, arg7, arg9 - 1, local3, local8, arg6, arg3)) {
					local61 = true;
					break;
				}
			}
			if (arg5 != 0 && arg0 != 0 && Static82.aClass75Array1[Static185.anInt4085].method1824(arg0, arg2, local3, arg7, arg5, arg3, arg1, local8)) {
				local61 = true;
				break;
			}
			local201 = Static133.anIntArrayArray36[local3][local8] + 1;
			if (local3 > 0 && Static145.anIntArrayArray77[local3 - 1][local8] == 0 && (local79[local3 - 1][local8] & 0x2C010E) == 0 && (local79[local3 - 1][arg3 + local8 - 1] & 0x2C0138) == 0) {
				local248 = 1;
				while (true) {
					if (arg3 - 1 <= local248) {
						Static78.anIntArray189[local72] = local3 - 1;
						Static134.anIntArray290[local72] = local8;
						local72 = local72 + 1 & 0xFFF;
						Static145.anIntArrayArray77[local3 - 1][local8] = 2;
						Static133.anIntArrayArray36[local3 - 1][local8] = local201;
						break;
					}
					if ((local79[local3 - 1][local248 + local8] & 0x2C013E) != 0) {
						break;
					}
					local248++;
				}
			}
			if (local3 < 102 && Static145.anIntArrayArray77[local3 + 1][local8] == 0 && (local79[local3 + arg3][local8] & 0x2C0183) == 0 && (local79[arg3 + local3][arg3 + local8 - 1] & 0x2C01E0) == 0) {
				local248 = 1;
				while (true) {
					if (local248 >= arg3 - 1) {
						Static78.anIntArray189[local72] = local3 + 1;
						Static134.anIntArray290[local72] = local8;
						Static145.anIntArrayArray77[local3 + 1][local8] = 8;
						Static133.anIntArrayArray36[local3 + 1][local8] = local201;
						local72 = local72 + 1 & 0xFFF;
						break;
					}
					if ((local79[local3 + arg3][local8 + local248] & 0x2C01E3) != 0) {
						break;
					}
					local248++;
				}
			}
			if (local8 > 0 && Static145.anIntArrayArray77[local3][local8 - 1] == 0 && (local79[local3][local8 - 1] & 0x2C010E) == 0 && (local79[local3 + arg3 - 1][local8 - 1] & 0x2C0183) == 0) {
				local248 = 1;
				while (true) {
					if (arg3 - 1 <= local248) {
						Static78.anIntArray189[local72] = local3;
						Static134.anIntArray290[local72] = local8 - 1;
						local72 = local72 + 1 & 0xFFF;
						Static145.anIntArrayArray77[local3][local8 - 1] = 1;
						Static133.anIntArrayArray36[local3][local8 - 1] = local201;
						break;
					}
					if ((local79[local3 + local248][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local248++;
				}
			}
			if (local8 < 102 && Static145.anIntArrayArray77[local3][local8 + 1] == 0 && (local79[local3][local8 + arg3] & 0x2C0138) == 0 && (local79[local3 + arg3 - 1][arg3 + local8] & 0x2C01E0) == 0) {
				local248 = 1;
				while (true) {
					if (arg3 - 1 <= local248) {
						Static78.anIntArray189[local72] = local3;
						Static134.anIntArray290[local72] = local8 + 1;
						Static145.anIntArrayArray77[local3][local8 + 1] = 4;
						local72 = local72 + 1 & 0xFFF;
						Static133.anIntArrayArray36[local3][local8 + 1] = local201;
						break;
					}
					if ((local79[local248 + local3][arg3 + local8] & 0x2C01F8) != 0) {
						break;
					}
					local248++;
				}
			}
			if (local3 > 0 && local8 > 0 && Static145.anIntArrayArray77[local3 - 1][local8 - 1] == 0 && (local79[local3 - 1][local8 - 1] & 0x2C010E) == 0) {
				local248 = 1;
				while (true) {
					if (local248 >= arg3) {
						Static78.anIntArray189[local72] = local3 - 1;
						Static134.anIntArray290[local72] = local8 - 1;
						Static145.anIntArrayArray77[local3 - 1][local8 - 1] = 3;
						Static133.anIntArrayArray36[local3 - 1][local8 - 1] = local201;
						local72 = local72 + 1 & 0xFFF;
						break;
					}
					if ((local79[local3 - 1][local8 + local248 - 1] & 0x2C013E) != 0 || (local79[local248 + local3 - 1][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local248++;
				}
			}
			if (local3 < 102 && local8 > 0 && Static145.anIntArrayArray77[local3 + 1][local8 - 1] == 0 && (local79[arg3 + local3][local8 - 1] & 0x2C0183) == 0) {
				local248 = 1;
				while (true) {
					if (arg3 <= local248) {
						Static78.anIntArray189[local72] = local3 + 1;
						Static134.anIntArray290[local72] = local8 - 1;
						local72 = local72 + 1 & 0xFFF;
						Static145.anIntArrayArray77[local3 + 1][local8 - 1] = 9;
						Static133.anIntArrayArray36[local3 + 1][local8 - 1] = local201;
						break;
					}
					if ((local79[arg3 + local3][local8 + local248 - 1] & 0x2C01E3) != 0 || (local79[local248 + local3][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local248++;
				}
			}
			if (local3 > 0 && local8 < 102 && Static145.anIntArrayArray77[local3 - 1][local8 + 1] == 0 && (local79[local3 - 1][local8 + arg3] & 0x2C0138) == 0) {
				local248 = 1;
				while (true) {
					if (local248 >= arg3) {
						Static78.anIntArray189[local72] = local3 - 1;
						Static134.anIntArray290[local72] = local8 + 1;
						local72 = local72 + 1 & 0xFFF;
						Static145.anIntArrayArray77[local3 - 1][local8 + 1] = 6;
						Static133.anIntArrayArray36[local3 - 1][local8 + 1] = local201;
						break;
					}
					if ((local79[local3 - 1][local248 + local8] & 0x2C013E) != 0 || (local79[local248 + local3 - 1][arg3 + local8] & 0x2C01F8) != 0) {
						break;
					}
					local248++;
				}
			}
			if (local3 < 102 && local8 < 102 && Static145.anIntArrayArray77[local3 + 1][local8 + 1] == 0 && (local79[local3 + arg3][arg3 + local8] & 0x2C01E0) == 0) {
				for (local248 = 1; local248 < arg3; local248++) {
					if ((local79[local248 + local3][arg3 + local8] & 0x2C01F8) != 0 || (local79[arg3 + local3][local8 + local248] & 0x2C01E3) != 0) {
						continue label333;
					}
				}
				Static78.anIntArray189[local72] = local3 + 1;
				Static134.anIntArray290[local72] = local8 + 1;
				Static145.anIntArrayArray77[local3 + 1][local8 + 1] = 12;
				local72 = local72 + 1 & 0xFFF;
				Static133.anIntArrayArray36[local3 + 1][local8 + 1] = local201;
			}
		}
		if (!local61) {
			local201 = 1000;
			local248 = 100;
			for (@Pc(1111) int local1111 = arg2 - 10; local1111 <= arg2 + 10; local1111++) {
				for (@Pc(1125) int local1125 = arg7 - 10; local1125 <= arg7 + 10; local1125++) {
					if (local1111 >= 0 && local1125 >= 0 && local1111 < 104 && local1125 < 104 && Static133.anIntArrayArray36[local1111][local1125] < 100) {
						@Pc(1162) int local1162 = 0;
						if (arg2 > local1111) {
							local1162 = arg2 - local1111;
						} else if (local1111 > arg5 + arg2 - 1) {
							local1162 = local1111 + 1 - arg2 - arg5;
						}
						@Pc(1195) int local1195 = 0;
						if (arg7 > local1125) {
							local1195 = arg7 - local1125;
						} else if (local1125 > arg0 + arg7 - 1) {
							local1195 = local1125 + 1 - arg7 - arg0;
						}
						@Pc(1233) int local1233 = local1195 * local1195 + local1162 * local1162;
						if (local1233 < local201 || local201 == local1233 && local248 > Static133.anIntArrayArray36[local1111][local1125]) {
							local201 = local1233;
							local248 = Static133.anIntArrayArray36[local1111][local1125];
							local8 = local1125;
							local3 = local1111;
						}
					}
				}
			}
			if (local201 == 1000) {
				return;
			}
			if (arg4 == local3 && arg8 == local8) {
				return;
			}
		}
		Static259.anInt5240 = local8;
		Static240.aBoolean314 = false;
		Static280.anInt5624 = local3;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(IB)Lclient!bm;")
	public static Class1_Sub3_Sub3 method2406(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub3_Sub3 local6 = (Class1_Sub3_Sub3) Static24.aClass162_2.method4003((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = Static7.aClass168_10.method4058(arg0, 0);
		} else {
			local25 = Static198.aClass168_146.method4058(arg0 & 0x7FFF, 0);
		}
		local6 = new Class1_Sub3_Sub3();
		if (local25 != null) {
			local6.method478(new Class1_Sub14(local25));
		}
		if (arg0 >= 32768) {
			local6.method473();
		}
		Static24.aClass162_2.method4005(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(II)Lclient!gf;")
	public static Class62 method2407(@OriginalArg(1) int arg0) {
		@Pc(6) Class62 local6 = (Class62) Static187.aClass89_27.method2268((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static143.aClass168_109.method4058(arg0, 4);
		local6 = new Class62();
		if (local20 != null) {
			local6.method1468(new Class1_Sub14(local20), arg0);
		}
		Static187.aClass89_27.method2272((long) arg0, local6);
		return local6;
	}
}
