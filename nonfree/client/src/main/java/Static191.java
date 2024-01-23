import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "Z")
	public static boolean aBoolean276 = true;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
	public static int anInt4008 = 0;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "[I")
	public static int[] anIntArray400 = new int[128];

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([BIIB)Z")
	public static boolean method3291(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub16 local6 = new Class2_Sub16(arg0);
		@Pc(8) boolean local8 = true;
		@Pc(14) int local14 = -1;
		label59: while (true) {
			@Pc(18) int local18 = local6.method2157();
			if (local18 == 0) {
				return local8;
			}
			local14 += local18;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local6.method2161();
					if (local39 == 0) {
						continue label59;
					}
					local31 += local39 - 1;
					@Pc(67) int local67 = local31 & 0x3F;
					@Pc(73) int local73 = local31 >> 6 & 0x3F;
					@Pc(79) int local79 = local6.method2146() >> 2;
					@Pc(83) int local83 = arg1 + local73;
					@Pc(87) int local87 = arg2 + local67;
					if (local83 > 0 && local87 > 0 && local83 < 103 && local87 < 103) {
						@Pc(106) Class146 local106 = Static10.method158(local14);
						if (local79 != 22 || Static185.aBoolean365 || local106.anInt4747 != 0 || local106.anInt4746 == 1 || local106.aBoolean313) {
							if (!local106.method3816()) {
								local8 = false;
								Static287.anInt5650++;
							}
							local33 = true;
						}
					}
				}
				local39 = local6.method2161();
				if (local39 == 0) {
					break;
				}
				local6.method2146();
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)I")
	public static int method3295(@OriginalArg(1) int arg0) {
		@Pc(7) Class144 local7 = Static220.method3665(arg0);
		@Pc(10) int local10 = local7.anInt4650;
		@Pc(13) int local13 = local7.anInt4655;
		@Pc(21) int local21 = local7.anInt4657;
		@Pc(28) int local28 = Class146.anIntArray470[local21 - local13];
		return Static64.anIntArray134[local10] >> local13 & local28;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Lclient!wa;")
	public static Class191 method3296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass191_1 == null ? null : local7.aClass191_1;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZIIIIIIIZII)V")
	public static void method3297(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(11) int local11;
		@Pc(18) int local18;
		for (local11 = 0; local11 < 104; local11++) {
			for (local18 = 0; local18 < 104; local18++) {
				Static302.anIntArrayArray42[local11][local18] = 0;
				Static305.anIntArrayArray45[local11][local18] = 99999999;
			}
		}
		Static302.anIntArrayArray42[arg1][arg8] = 99;
		Static305.anIntArrayArray45[arg1][arg8] = 0;
		local11 = arg1;
		@Pc(61) byte local61 = 0;
		local18 = arg8;
		@Pc(65) int local65 = 0;
		@Pc(67) boolean local67 = false;
		Static260.anIntArray493[0] = arg1;
		@Pc(74) int local74 = local61 + 1;
		Static130.anIntArray293[0] = arg8;
		@Pc(81) int[][] local81 = Static89.aClass154Array1[Static32.anInt876].anIntArrayArray32;
		@Pc(206) int local206;
		@Pc(256) int local256;
		label329: while (local65 != local74) {
			local18 = Static130.anIntArray293[local65];
			local11 = Static260.anIntArray493[local65];
			local65 = local65 + 1 & 0xFFF;
			if (local11 == arg2 && local18 == arg5) {
				local67 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && Static89.aClass154Array1[Static32.anInt876].method3907(arg5, arg6, arg2, local18, local11, arg7 - 1, arg9)) {
					local67 = true;
					break;
				}
				if (arg7 < 10 && Static89.aClass154Array1[Static32.anInt876].method3925(arg2, arg6, local18, arg7 - 1, arg5, local11, arg9)) {
					local67 = true;
					break;
				}
			}
			if (arg0 != 0 && arg4 != 0 && Static89.aClass154Array1[Static32.anInt876].method3911(local11, arg0, local18, arg3, arg5, arg9, arg4, arg2)) {
				local67 = true;
				break;
			}
			local206 = Static305.anIntArrayArray45[local11][local18] + 1;
			if (local11 > 0 && Static302.anIntArrayArray42[local11 - 1][local18] == 0 && (local81[local11 - 1][local18] & 0x2C010E) == 0 && (local81[local11 - 1][arg9 + local18 - 1] & 0x2C0138) == 0) {
				local256 = 1;
				while (true) {
					if (local256 >= arg9 - 1) {
						Static260.anIntArray493[local74] = local11 - 1;
						Static130.anIntArray293[local74] = local18;
						Static302.anIntArrayArray42[local11 - 1][local18] = 2;
						local74 = local74 + 1 & 0xFFF;
						Static305.anIntArrayArray45[local11 - 1][local18] = local206;
						break;
					}
					if ((local81[local11 - 1][local18 + local256] & 0x2C013E) != 0) {
						break;
					}
					local256++;
				}
			}
			if (local11 < 102 && Static302.anIntArrayArray42[local11 + 1][local18] == 0 && (local81[arg9 + local11][local18] & 0x2C0183) == 0 && (local81[arg9 + local11][local18 + arg9 - 1] & 0x2C01E0) == 0) {
				local256 = 1;
				while (true) {
					if (local256 >= arg9 - 1) {
						Static260.anIntArray493[local74] = local11 + 1;
						Static130.anIntArray293[local74] = local18;
						local74 = local74 + 1 & 0xFFF;
						Static302.anIntArrayArray42[local11 + 1][local18] = 8;
						Static305.anIntArrayArray45[local11 + 1][local18] = local206;
						break;
					}
					if ((local81[arg9 + local11][local256 + local18] & 0x2C01E3) != 0) {
						break;
					}
					local256++;
				}
			}
			if (local18 > 0 && Static302.anIntArrayArray42[local11][local18 - 1] == 0 && (local81[local11][local18 - 1] & 0x2C010E) == 0 && (local81[local11 + arg9 - 1][local18 - 1] & 0x2C0183) == 0) {
				local256 = 1;
				while (true) {
					if (arg9 - 1 <= local256) {
						Static260.anIntArray493[local74] = local11;
						Static130.anIntArray293[local74] = local18 - 1;
						Static302.anIntArrayArray42[local11][local18 - 1] = 1;
						Static305.anIntArrayArray45[local11][local18 - 1] = local206;
						local74 = local74 + 1 & 0xFFF;
						break;
					}
					if ((local81[local256 + local11][local18 - 1] & 0x2C018F) != 0) {
						break;
					}
					local256++;
				}
			}
			if (local18 < 102 && Static302.anIntArrayArray42[local11][local18 + 1] == 0 && (local81[local11][arg9 + local18] & 0x2C0138) == 0 && (local81[arg9 + local11 - 1][arg9 + local18] & 0x2C01E0) == 0) {
				local256 = 1;
				while (true) {
					if (local256 >= arg9 - 1) {
						Static260.anIntArray493[local74] = local11;
						Static130.anIntArray293[local74] = local18 + 1;
						local74 = local74 + 1 & 0xFFF;
						Static302.anIntArrayArray42[local11][local18 + 1] = 4;
						Static305.anIntArrayArray45[local11][local18 + 1] = local206;
						break;
					}
					if ((local81[local11 + local256][local18 + arg9] & 0x2C01F8) != 0) {
						break;
					}
					local256++;
				}
			}
			if (local11 > 0 && local18 > 0 && Static302.anIntArrayArray42[local11 - 1][local18 - 1] == 0 && (local81[local11 - 1][local18 - 1] & 0x2C010E) == 0) {
				local256 = 1;
				while (true) {
					if (arg9 <= local256) {
						Static260.anIntArray493[local74] = local11 - 1;
						Static130.anIntArray293[local74] = local18 - 1;
						Static302.anIntArrayArray42[local11 - 1][local18 - 1] = 3;
						local74 = local74 + 1 & 0xFFF;
						Static305.anIntArrayArray45[local11 - 1][local18 - 1] = local206;
						break;
					}
					if ((local81[local11 - 1][local18 + local256 - 1] & 0x2C013E) != 0 || (local81[local11 + local256 - 1][local18 - 1] & 0x2C018F) != 0) {
						break;
					}
					local256++;
				}
			}
			if (local11 < 102 && local18 > 0 && Static302.anIntArrayArray42[local11 + 1][local18 - 1] == 0 && (local81[local11 + arg9][local18 - 1] & 0x2C0183) == 0) {
				local256 = 1;
				while (true) {
					if (arg9 <= local256) {
						Static260.anIntArray493[local74] = local11 + 1;
						Static130.anIntArray293[local74] = local18 - 1;
						Static302.anIntArrayArray42[local11 + 1][local18 - 1] = 9;
						Static305.anIntArrayArray45[local11 + 1][local18 - 1] = local206;
						local74 = local74 + 1 & 0xFFF;
						break;
					}
					if ((local81[arg9 + local11][local256 + local18 - 1] & 0x2C01E3) != 0 || (local81[local11 + local256][local18 - 1] & 0x2C018F) != 0) {
						break;
					}
					local256++;
				}
			}
			if (local11 > 0 && local18 < 102 && Static302.anIntArrayArray42[local11 - 1][local18 + 1] == 0 && (local81[local11 - 1][local18 + arg9] & 0x2C0138) == 0) {
				local256 = 1;
				while (true) {
					if (arg9 <= local256) {
						Static260.anIntArray493[local74] = local11 - 1;
						Static130.anIntArray293[local74] = local18 + 1;
						local74 = local74 + 1 & 0xFFF;
						Static302.anIntArrayArray42[local11 - 1][local18 + 1] = 6;
						Static305.anIntArrayArray45[local11 - 1][local18 + 1] = local206;
						break;
					}
					if ((local81[local11 - 1][local18 + local256] & 0x2C013E) != 0 || (local81[local256 + local11 - 1][local18 + arg9] & 0x2C01F8) != 0) {
						break;
					}
					local256++;
				}
			}
			if (local11 < 102 && local18 < 102 && Static302.anIntArrayArray42[local11 + 1][local18 + 1] == 0 && (local81[local11 + arg9][arg9 + local18] & 0x2C01E0) == 0) {
				for (local256 = 1; local256 < arg9; local256++) {
					if ((local81[local256 + local11][arg9 + local18] & 0x2C01F8) != 0 || (local81[local11 + arg9][local18 + local256] & 0x2C01E3) != 0) {
						continue label329;
					}
				}
				Static260.anIntArray493[local74] = local11 + 1;
				Static130.anIntArray293[local74] = local18 + 1;
				local74 = local74 + 1 & 0xFFF;
				Static302.anIntArrayArray42[local11 + 1][local18 + 1] = 12;
				Static305.anIntArrayArray45[local11 + 1][local18 + 1] = local206;
			}
		}
		if (!local67) {
			local206 = 1000;
			local256 = 100;
			for (@Pc(1117) int local1117 = arg2 - 10; local1117 <= arg2 + 10; local1117++) {
				for (@Pc(1127) int local1127 = arg5 - 10; local1127 <= arg5 + 10; local1127++) {
					if (local1117 >= 0 && local1127 >= 0 && local1117 < 104 && local1127 < 104 && Static305.anIntArrayArray45[local1117][local1127] < 100) {
						@Pc(1165) int local1165 = 0;
						if (arg2 > local1117) {
							local1165 = arg2 - local1117;
						} else if (arg2 + arg0 - 1 < local1117) {
							local1165 = local1117 + 1 - arg2 - arg0;
						}
						@Pc(1198) int local1198 = 0;
						if (local1127 < arg5) {
							local1198 = arg5 - local1127;
						} else if (local1127 > arg5 + arg4 - 1) {
							local1198 = local1127 + 1 - arg5 - arg4;
						}
						@Pc(1242) int local1242 = local1165 * local1165 + local1198 * local1198;
						if (local1242 < local206 || local1242 == local206 && Static305.anIntArrayArray45[local1117][local1127] < local256) {
							local256 = Static305.anIntArrayArray45[local1117][local1127];
							local11 = local1117;
							local18 = local1127;
							local206 = local1242;
						}
					}
				}
			}
			if (local206 == 1000) {
				return;
			}
			if (local11 == arg1 && arg8 == local18) {
				return;
			}
		}
		Static269.anInt5272 = local18;
		Static302.anInt5847 = local11;
		Static34.aBoolean52 = false;
	}
}
