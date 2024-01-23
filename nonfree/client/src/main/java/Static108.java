import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!kb", name = "yb", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!kb", name = "Zb", descriptor = "I")
	public static int anInt2401;

	@OriginalMember(owner = "client!kb", name = "Z", descriptor = "S")
	public static short aShort18 = 320;

	@OriginalMember(owner = "client!kb", name = "hb", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!kb", name = "tb", descriptor = "Lclient!ui;")
	public static Class103 aClass103_13 = new Class103(512);

	@OriginalMember(owner = "client!kb", name = "zb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_512 = Static199.method3560("p12_full");

	@OriginalMember(owner = "client!kb", name = "Yb", descriptor = "Lclient!qe;")
	private static Class78 aClass78_513 = Static199.method3560("Checking for updates )2 ");

	@OriginalMember(owner = "client!kb", name = "bc", descriptor = "Lclient!qe;")
	public static Class78 aClass78_514 = aClass78_513;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIIIIIIIIIII)Z")
	public static boolean method1876(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		@Pc(8) int local8;
		for (@Pc(5) int local5 = 0; local5 < 104; local5++) {
			for (local8 = 0; local8 < 104; local8++) {
				Static3.anIntArrayArray1[local5][local8] = 0;
				Static122.anIntArrayArray20[local5][local8] = 99999999;
			}
		}
		Static3.anIntArrayArray1[arg9][arg4] = 99;
		@Pc(41) int local41 = arg4;
		@Pc(43) byte local43 = 0;
		Static122.anIntArrayArray20[arg9][arg4] = 0;
		@Pc(56) int local56 = 0;
		local8 = arg9;
		Static86.anIntArray341[0] = arg9;
		@Pc(65) int local65 = local43 + 1;
		Static110.anIntArray419[0] = arg4;
		@Pc(69) boolean local69 = false;
		@Pc(74) int[][] local74 = Static202.aClass90Array1[Static137.anInt3136].anIntArrayArray41;
		@Pc(192) int local192;
		@Pc(235) int local235;
		label367: while (local65 != local56) {
			local8 = Static86.anIntArray341[local56];
			local41 = Static110.anIntArray419[local56];
			local56 = local56 + 1 & 0xFFF;
			if (local8 == arg6 && local41 == arg11) {
				local69 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static202.aClass90Array1[Static137.anInt3136].method3512(local8, arg11, arg1 - 1, local41, arg8, arg6, arg3)) {
					local69 = true;
					break;
				}
				if (arg1 < 10 && Static202.aClass90Array1[Static137.anInt3136].method3519(local8, arg3, arg6, arg11, arg8, arg1 - 1, local41)) {
					local69 = true;
					break;
				}
			}
			if (arg10 != 0 && arg7 != 0 && Static202.aClass90Array1[Static137.anInt3136].method3526(arg7, local41, arg11, arg10, local8, arg6, arg5, arg3)) {
				local69 = true;
				break;
			}
			local192 = Static122.anIntArrayArray20[local8][local41] + 1;
			if (local8 > 0 && Static3.anIntArrayArray1[local8 - 1][local41] == 0 && (local74[local8 - 1][local41] & 0x12C010E) == 0 && (local74[local8 - 1][local41 + arg3 - 1] & 0x12C0138) == 0) {
				local235 = 1;
				while (true) {
					if (local235 >= arg3 - 1) {
						Static86.anIntArray341[local65] = local8 - 1;
						Static110.anIntArray419[local65] = local41;
						local65 = local65 + 1 & 0xFFF;
						Static3.anIntArrayArray1[local8 - 1][local41] = 2;
						Static122.anIntArrayArray20[local8 - 1][local41] = local192;
						break;
					}
					if ((local74[local8 - 1][local41 + local235] & 0x12C013E) != 0) {
						break;
					}
					local235++;
				}
			}
			if (local8 < 102 && Static3.anIntArrayArray1[local8 + 1][local41] == 0 && (local74[local8 + arg3][local41] & 0x12C0183) == 0 && (local74[local8 + arg3][arg3 + local41 - 1] & 0x12C01E0) == 0) {
				local235 = 1;
				while (true) {
					if (arg3 - 1 <= local235) {
						Static86.anIntArray341[local65] = local8 + 1;
						Static110.anIntArray419[local65] = local41;
						Static3.anIntArrayArray1[local8 + 1][local41] = 8;
						local65 = local65 + 1 & 0xFFF;
						Static122.anIntArrayArray20[local8 + 1][local41] = local192;
						break;
					}
					if ((local74[local8 + arg3][local41 + local235] & 0x12C01E3) != 0) {
						break;
					}
					local235++;
				}
			}
			if (local41 > 0 && Static3.anIntArrayArray1[local8][local41 - 1] == 0 && (local74[local8][local41 - 1] & 0x12C010E) == 0 && (local74[arg3 + local8 - 1][local41 - 1] & 0x12C0183) == 0) {
				local235 = 1;
				while (true) {
					if (arg3 - 1 <= local235) {
						Static86.anIntArray341[local65] = local8;
						Static110.anIntArray419[local65] = local41 - 1;
						local65 = local65 + 1 & 0xFFF;
						Static3.anIntArrayArray1[local8][local41 - 1] = 1;
						Static122.anIntArrayArray20[local8][local41 - 1] = local192;
						break;
					}
					if ((local74[local235 + local8][local41 - 1] & 0x12C018F) != 0) {
						break;
					}
					local235++;
				}
			}
			if (local41 < 102 && Static3.anIntArrayArray1[local8][local41 + 1] == 0 && (local74[local8][arg3 + local41] & 0x12C0138) == 0 && (local74[local8 + arg3 - 1][arg3 + local41] & 0x12C01E0) == 0) {
				local235 = 1;
				while (true) {
					if (arg3 - 1 <= local235) {
						Static86.anIntArray341[local65] = local8;
						Static110.anIntArray419[local65] = local41 + 1;
						local65 = local65 + 1 & 0xFFF;
						Static3.anIntArrayArray1[local8][local41 + 1] = 4;
						Static122.anIntArrayArray20[local8][local41 + 1] = local192;
						break;
					}
					if ((local74[local8 + local235][local41 + arg3] & 0x12C01F8) != 0) {
						break;
					}
					local235++;
				}
			}
			if (local8 > 0 && local41 > 0 && Static3.anIntArrayArray1[local8 - 1][local41 - 1] == 0 && (local74[local8 - 1][arg3 + local41 - 2] & 0x12C0138) == 0 && (local74[local8 - 1][local41 - 1] & 0x12C010E) == 0 && (local74[local8 + arg3 - 1 - 1][local41 - 1] & 0x12C0183) == 0) {
				local235 = 1;
				while (true) {
					if (local235 >= arg3 - 1) {
						Static86.anIntArray341[local65] = local8 - 1;
						Static110.anIntArray419[local65] = local41 - 1;
						Static3.anIntArrayArray1[local8 - 1][local41 - 1] = 3;
						Static122.anIntArrayArray20[local8 - 1][local41 - 1] = local192;
						local65 = local65 + 1 & 0xFFF;
						break;
					}
					if ((local74[local8 - 1][local41 + local235 - 1] & 0x12C013E) != 0 || (local74[local235 + local8 - 1][local41 - 1] & 0x12C018F) != 0) {
						break;
					}
					local235++;
				}
			}
			if (local8 < 102 && local41 > 0 && Static3.anIntArrayArray1[local8 + 1][local41 - 1] == 0 && (local74[local8 + 1][local41 - 1] & 0x12C010E) == 0 && (local74[arg3 + local8][local41 - 1] & 0x12C0183) == 0 && (local74[local8 + arg3][arg3 + local41 - 1 - 1] & 0x12C01E0) == 0) {
				local235 = 1;
				while (true) {
					if (arg3 - 1 <= local235) {
						Static86.anIntArray341[local65] = local8 + 1;
						Static110.anIntArray419[local65] = local41 - 1;
						local65 = local65 + 1 & 0xFFF;
						Static3.anIntArrayArray1[local8 + 1][local41 - 1] = 9;
						Static122.anIntArrayArray20[local8 + 1][local41 - 1] = local192;
						break;
					}
					if ((local74[local8 + arg3][local235 + local41 - 1] & 0x12C01E3) != 0 || (local74[local8 + local235 + 1][local41 - 1] & 0x12C018F) != 0) {
						break;
					}
					local235++;
				}
			}
			if (local8 > 0 && local41 < 102 && Static3.anIntArrayArray1[local8 - 1][local41 + 1] == 0 && (local74[local8 - 1][local41 + 1] & 0x12C010E) == 0 && (local74[local8 - 1][local41 + arg3] & 0x12C0138) == 0 && (local74[local8][arg3 + local41] & 0x12C01E0) == 0) {
				local235 = 1;
				while (true) {
					if (arg3 - 1 <= local235) {
						Static86.anIntArray341[local65] = local8 - 1;
						Static110.anIntArray419[local65] = local41 + 1;
						local65 = local65 + 1 & 0xFFF;
						Static3.anIntArrayArray1[local8 - 1][local41 + 1] = 6;
						Static122.anIntArrayArray20[local8 - 1][local41 + 1] = local192;
						break;
					}
					if ((local74[local8 - 1][local41 + local235 + 1] & 0x12C013E) != 0 || (local74[local235 + local8 - 1][arg3 + local41] & 0x12C01F8) != 0) {
						break;
					}
					local235++;
				}
			}
			if (local8 < 102 && local41 < 102 && Static3.anIntArrayArray1[local8 + 1][local41 + 1] == 0 && (local74[local8 + 1][arg3 + local41] & 0x12C0138) == 0 && (local74[local8 + arg3][arg3 + local41] & 0x12C01E0) == 0 && (local74[local8 + arg3][local41 + 1] & 0x12C0183) == 0) {
				for (local235 = 1; local235 < arg3 - 1; local235++) {
					if ((local74[local235 + local8 + 1][arg3 + local41] & 0x12C01F8) != 0 || (local74[local8 + arg3][local235 + local41 + 1] & 0x12C01E3) != 0) {
						continue label367;
					}
				}
				Static86.anIntArray341[local65] = local8 + 1;
				Static110.anIntArray419[local65] = local41 + 1;
				local65 = local65 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local8 + 1][local41 + 1] = 12;
				Static122.anIntArrayArray20[local8 + 1][local41 + 1] = local192;
			}
		}
		Static194.anInt4453 = 0;
		if (!local69) {
			if (!arg0) {
				return false;
			}
			local192 = 1000;
			local235 = 100;
			for (@Pc(1195) int local1195 = arg6 - 10; local1195 <= arg6 + 10; local1195++) {
				for (@Pc(1201) int local1201 = arg11 - 10; local1201 <= arg11 + 10; local1201++) {
					if (local1195 >= 0 && local1201 >= 0 && local1195 < 104 && local1201 < 104 && Static122.anIntArrayArray20[local1195][local1201] < 100) {
						@Pc(1225) int local1225 = 0;
						@Pc(1227) int local1227 = 0;
						if (arg11 > local1201) {
							local1225 = arg11 - local1201;
						} else if (local1201 > arg11 + arg7 - 1) {
							local1225 = local1201 + 1 - arg11 - arg7;
						}
						if (arg6 > local1195) {
							local1227 = arg6 - local1195;
						} else if (local1195 > arg6 + arg10 - 1) {
							local1227 = local1195 + 1 - arg10 - arg6;
						}
						@Pc(1294) int local1294 = local1225 * local1225 + local1227 * local1227;
						if (local192 > local1294 || local192 == local1294 && Static122.anIntArrayArray20[local1195][local1201] < local235) {
							local8 = local1195;
							local235 = Static122.anIntArrayArray20[local1195][local1201];
							local41 = local1201;
							local192 = local1294;
						}
					}
				}
			}
			if (local192 == 1000) {
				return false;
			}
			if (arg9 == local8 && arg4 == local41) {
				return false;
			}
			Static194.anInt4453 = 1;
		}
		@Pc(1373) byte local1373 = 0;
		Static86.anIntArray341[0] = local8;
		local56 = local1373 + 1;
		Static110.anIntArray419[0] = local41;
		local192 = local235 = Static3.anIntArrayArray1[local8][local41];
		while (local8 != arg9 || local41 != arg4) {
			if (local235 != local192) {
				Static86.anIntArray341[local56] = local8;
				Static110.anIntArray419[local56++] = local41;
				local235 = local192;
			}
			if ((local192 & 0x1) != 0) {
				local41++;
			} else if ((local192 & 0x4) != 0) {
				local41--;
			}
			if ((local192 & 0x2) != 0) {
				local8++;
			} else if ((local192 & 0x8) != 0) {
				local8--;
			}
			local192 = Static3.anIntArrayArray1[local8][local41];
		}
		if (local56 > 0) {
			Static128.method2312(arg2, local56);
			return true;
		} else if (arg2 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
