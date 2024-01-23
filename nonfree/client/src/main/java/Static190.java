import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!no", name = "xc", descriptor = "Lclient!qe;")
	public static Class145 aClass145_1;

	@OriginalMember(owner = "client!no", name = "rc", descriptor = "Ljava/lang/String;")
	public static String aString131 = "Select";

	@OriginalMember(owner = "client!no", name = "sc", descriptor = "I")
	public static int anInt3885 = 0;

	@OriginalMember(owner = "client!no", name = "Ic", descriptor = "I")
	public static volatile int anInt3899 = 0;

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method3114(@OriginalArg(0) int arg0) {
		return Static54.aStringArray7[arg0].length() > 0 ? Static213.aStringArray35[arg0] + Static88.aString57 + Static54.aStringArray7[arg0] : Static213.aStringArray35[arg0];
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(B)Lclient!uo;")
	public static Class182_Sub1 method3115() {
		Static303.anInt5733 = 0;
		return Static34.method581();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIIIZIIII)V")
	public static void method3117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3;
		@Pc(8) int local8;
		for (local3 = 0; local3 < 104; local3++) {
			for (local8 = 0; local8 < 104; local8++) {
				Static173.anIntArrayArray23[local3][local8] = 0;
				Static254.anIntArrayArray38[local3][local8] = 99999999;
			}
		}
		local3 = arg4;
		local8 = arg2;
		@Pc(47) byte local47 = 0;
		Static173.anIntArrayArray23[arg4][arg2] = 99;
		Static254.anIntArrayArray38[arg4][arg2] = 0;
		Static229.anIntArray419[0] = arg4;
		@Pc(66) int local66 = local47 + 1;
		Static81.anIntArray123[0] = arg2;
		@Pc(70) int local70 = 0;
		@Pc(72) boolean local72 = false;
		@Pc(77) int[][] local77 = Static56.aClass122Array1[Static295.anInt5586].anIntArrayArray28;
		@Pc(190) int local190;
		@Pc(236) int local236;
		label325: while (local70 != local66) {
			local8 = Static81.anIntArray123[local70];
			local3 = Static229.anIntArray419[local70];
			local70 = local70 + 1 & 0xFFF;
			if (local3 == arg7 && arg6 == local8) {
				local72 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static56.aClass122Array1[Static295.anInt5586].method3135(arg7, local8, arg1 - 1, local3, arg3, arg9, arg6)) {
					local72 = true;
					break;
				}
				if (arg1 < 10 && Static56.aClass122Array1[Static295.anInt5586].method3127(arg9, arg1 - 1, arg3, local3, arg7, local8, arg6)) {
					local72 = true;
					break;
				}
			}
			if (arg5 != 0 && arg0 != 0 && Static56.aClass122Array1[Static295.anInt5586].method3140(local8, arg5, arg8, arg7, arg0, arg6, arg9, local3)) {
				local72 = true;
				break;
			}
			local190 = Static254.anIntArrayArray38[local3][local8] + 1;
			if (local3 > 0 && Static173.anIntArrayArray23[local3 - 1][local8] == 0 && (local77[local3 - 1][local8] & 0x2C010E) == 0 && (local77[local3 - 1][arg9 + local8 - 1] & 0x2C0138) == 0) {
				local236 = 1;
				while (true) {
					if (local236 >= arg9 - 1) {
						Static229.anIntArray419[local66] = local3 - 1;
						Static81.anIntArray123[local66] = local8;
						Static173.anIntArrayArray23[local3 - 1][local8] = 2;
						Static254.anIntArrayArray38[local3 - 1][local8] = local190;
						local66 = local66 + 1 & 0xFFF;
						break;
					}
					if ((local77[local3 - 1][local8 + local236] & 0x2C013E) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local3 < 102 && Static173.anIntArrayArray23[local3 + 1][local8] == 0 && (local77[arg9 + local3][local8] & 0x2C0183) == 0 && (local77[arg9 + local3][local8 + arg9 - 1] & 0x2C01E0) == 0) {
				local236 = 1;
				while (true) {
					if (local236 >= arg9 - 1) {
						Static229.anIntArray419[local66] = local3 + 1;
						Static81.anIntArray123[local66] = local8;
						Static173.anIntArrayArray23[local3 + 1][local8] = 8;
						Static254.anIntArrayArray38[local3 + 1][local8] = local190;
						local66 = local66 + 1 & 0xFFF;
						break;
					}
					if ((local77[local3 + arg9][local236 + local8] & 0x2C01E3) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local8 > 0 && Static173.anIntArrayArray23[local3][local8 - 1] == 0 && (local77[local3][local8 - 1] & 0x2C010E) == 0 && (local77[local3 + arg9 - 1][local8 - 1] & 0x2C0183) == 0) {
				local236 = 1;
				while (true) {
					if (arg9 - 1 <= local236) {
						Static229.anIntArray419[local66] = local3;
						Static81.anIntArray123[local66] = local8 - 1;
						local66 = local66 + 1 & 0xFFF;
						Static173.anIntArrayArray23[local3][local8 - 1] = 1;
						Static254.anIntArrayArray38[local3][local8 - 1] = local190;
						break;
					}
					if ((local77[local3 + local236][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local8 < 102 && Static173.anIntArrayArray23[local3][local8 + 1] == 0 && (local77[local3][local8 + arg9] & 0x2C0138) == 0 && (local77[local3 + arg9 - 1][local8 + arg9] & 0x2C01E0) == 0) {
				local236 = 1;
				while (true) {
					if (local236 >= arg9 - 1) {
						Static229.anIntArray419[local66] = local3;
						Static81.anIntArray123[local66] = local8 + 1;
						Static173.anIntArrayArray23[local3][local8 + 1] = 4;
						Static254.anIntArrayArray38[local3][local8 + 1] = local190;
						local66 = local66 + 1 & 0xFFF;
						break;
					}
					if ((local77[local3 + local236][local8 + arg9] & 0x2C01F8) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local3 > 0 && local8 > 0 && Static173.anIntArrayArray23[local3 - 1][local8 - 1] == 0 && (local77[local3 - 1][local8 - 1] & 0x2C010E) == 0) {
				local236 = 1;
				while (true) {
					if (arg9 <= local236) {
						Static229.anIntArray419[local66] = local3 - 1;
						Static81.anIntArray123[local66] = local8 - 1;
						local66 = local66 + 1 & 0xFFF;
						Static173.anIntArrayArray23[local3 - 1][local8 - 1] = 3;
						Static254.anIntArrayArray38[local3 - 1][local8 - 1] = local190;
						break;
					}
					if ((local77[local3 - 1][local236 + local8 - 1] & 0x2C013E) != 0 || (local77[local3 + local236 - 1][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local3 < 102 && local8 > 0 && Static173.anIntArrayArray23[local3 + 1][local8 - 1] == 0 && (local77[arg9 + local3][local8 - 1] & 0x2C0183) == 0) {
				local236 = 1;
				while (true) {
					if (arg9 <= local236) {
						Static229.anIntArray419[local66] = local3 + 1;
						Static81.anIntArray123[local66] = local8 - 1;
						local66 = local66 + 1 & 0xFFF;
						Static173.anIntArrayArray23[local3 + 1][local8 - 1] = 9;
						Static254.anIntArrayArray38[local3 + 1][local8 - 1] = local190;
						break;
					}
					if ((local77[local3 + arg9][local8 + local236 - 1] & 0x2C01E3) != 0 || (local77[local3 + local236][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local3 > 0 && local8 < 102 && Static173.anIntArrayArray23[local3 - 1][local8 + 1] == 0 && (local77[local3 - 1][local8 + arg9] & 0x2C0138) == 0) {
				local236 = 1;
				while (true) {
					if (arg9 <= local236) {
						Static229.anIntArray419[local66] = local3 - 1;
						Static81.anIntArray123[local66] = local8 + 1;
						Static173.anIntArrayArray23[local3 - 1][local8 + 1] = 6;
						local66 = local66 + 1 & 0xFFF;
						Static254.anIntArrayArray38[local3 - 1][local8 + 1] = local190;
						break;
					}
					if ((local77[local3 - 1][local8 + local236] & 0x2C013E) != 0 || (local77[local3 + local236 - 1][arg9 + local8] & 0x2C01F8) != 0) {
						break;
					}
					local236++;
				}
			}
			if (local3 < 102 && local8 < 102 && Static173.anIntArrayArray23[local3 + 1][local8 + 1] == 0 && (local77[arg9 + local3][arg9 + local8] & 0x2C01E0) == 0) {
				for (local236 = 1; local236 < arg9; local236++) {
					if ((local77[local236 + local3][local8 + arg9] & 0x2C01F8) != 0 || (local77[local3 + arg9][local8 + local236] & 0x2C01E3) != 0) {
						continue label325;
					}
				}
				Static229.anIntArray419[local66] = local3 + 1;
				Static81.anIntArray123[local66] = local8 + 1;
				local66 = local66 + 1 & 0xFFF;
				Static173.anIntArrayArray23[local3 + 1][local8 + 1] = 12;
				Static254.anIntArrayArray38[local3 + 1][local8 + 1] = local190;
			}
		}
		if (!local72) {
			local190 = 1000;
			local236 = 100;
			for (@Pc(1097) int local1097 = arg7 - 10; local1097 <= arg7 + 10; local1097++) {
				for (@Pc(1111) int local1111 = arg6 - 10; local1111 <= arg6 + 10; local1111++) {
					if (local1097 >= 0 && local1111 >= 0 && local1097 < 104 && local1111 < 104 && Static254.anIntArrayArray38[local1097][local1111] < 100) {
						@Pc(1143) int local1143 = 0;
						if (local1097 < arg7) {
							local1143 = arg7 - local1097;
						} else if (arg5 + arg7 - 1 < local1097) {
							local1143 = local1097 + 1 - arg5 - arg7;
						}
						@Pc(1176) int local1176 = 0;
						if (arg6 > local1111) {
							local1176 = arg6 - local1111;
						} else if (local1111 > arg0 + arg6 - 1) {
							local1176 = local1111 + 1 - arg0 - arg6;
						}
						@Pc(1216) int local1216 = local1176 * local1176 + local1143 * local1143;
						if (local190 > local1216 || local190 == local1216 && local236 > Static254.anIntArrayArray38[local1097][local1111]) {
							local8 = local1111;
							local236 = Static254.anIntArrayArray38[local1097][local1111];
							local190 = local1216;
							local3 = local1097;
						}
					}
				}
			}
			if (local190 == 1000) {
				return;
			}
			if (arg4 == local3 && local8 == arg2) {
				return;
			}
		}
		Static127.anInt2540 = local8;
		Static263.aBoolean357 = false;
		Static62.anInt1244 = local3;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3119(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}
