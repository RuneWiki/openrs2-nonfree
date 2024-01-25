import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(III)I")
	public static int method2619(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static124.anIntArray180[arg1 & 0x3] : Static534.anIntArray628[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method2620(@OriginalArg(1) Class90 arg0) {
		if (Static384.anInt7048 < 2 && !Static540.aBoolean580 || Static165.aClass97_8 != null) {
			return;
		}
		@Pc(43) String local43;
		if (Static540.aBoolean580 && Static384.anInt7048 < 2) {
			local43 = Static195.aString36 + Static146.aClass103_79.method2355(Static188.anInt28) + Static185.aString34 + " ->";
		} else if (Static9.aBoolean9 && Static184.aClass262_1.method6381(81) && Static384.anInt7048 > 2) {
			local43 = Static378.method5557((Class6_Sub26) Static408.aClass298_154.aClass6_246.aClass6_283.aClass6_283);
		} else {
			@Pc(39) Class6_Sub26 local39 = (Class6_Sub26) Static408.aClass298_154.aClass6_246.aClass6_283;
			local43 = Static378.method5557(local39);
			@Pc(45) int[] local45 = null;
			if (Static452.method6341(local39.anInt5472)) {
				local45 = Static119.aClass244_4.method5726((int) local39.aLong126).anIntArray482;
			} else if (local39.anInt5470 != -1) {
				local45 = Static119.aClass244_4.method5726(local39.anInt5470).anIntArray482;
			} else if (Static543.method7377(local39.anInt5472)) {
				@Pc(121) Class6_Sub49 local121 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local39.aLong126);
				if (local121 != null) {
					@Pc(126) Class15_Sub2_Sub4_Sub1 local126 = local121.aClass15_Sub2_Sub4_Sub1_2;
					@Pc(129) Class88 local129 = local126.aClass88_1;
					if (local129.anIntArray182 != null) {
						local129 = local129.method1940(Static65.aClass51_1);
					}
					if (local129 != null) {
						local45 = local129.anIntArray184;
					}
				}
			} else if (Static252.method3929(local39.anInt5472)) {
				@Pc(86) Class192 local86;
				if (local39.anInt5472 == 1007) {
					local86 = Static85.aClass27_1.method516((int) local39.aLong126);
				} else {
					local86 = Static85.aClass27_1.method516((int) (local39.aLong126 >>> 32 & 0x7FFFFFFFL));
				}
				if (local86.lb != null) {
					local86 = local86.method4585(Static65.aClass51_1);
				}
				if (local86 != null) {
					local45 = local86.anIntArray426;
				}
			}
			if (local45 != null) {
				local43 = local43 + Static96.method6297(local45);
			}
		}
		if (Static384.anInt7048 > 2) {
			local43 = local43 + "<col=ffffff> / " + (Static384.anInt7048 - 2) + Static146.aClass103_72.method2355(Static188.anInt28);
		}
		if (Static495.aClass97_25 != null) {
			@Pc(259) Class82 local259 = Static495.aClass97_25.method2297(arg0);
			if (local259 == null) {
				local259 = Static264.aClass82_3;
			}
			local259.method7876(Static495.aClass97_25.anInt2670, Static495.aClass97_25.anInt2690, Static344.anInt6510, Static51.anInt909, Static28.aRandom1, Static154.anIntArray283, Static495.aClass97_25.anInt2606, Static495.aClass97_25.anInt2647, local43, Static495.aClass97_25.anInt2684, Static175.anInt3179, Static495.aClass97_25.anInt2617, Static241.aClass71Array29, Static236.anIntArray356);
			Static368.method5431(Static236.anIntArray356[3], Static236.anIntArray356[0], Static236.anIntArray356[2], Static236.anIntArray356[1]);
		} else if (Static452.aClass97_19 != null && Static172.aClass68_4 == Static126.aClass68_3) {
			@Pc(239) int local239 = Static264.aClass82_3.method7874(Static241.aClass71Array29, Static331.anInt6263 + 4, Static551.anInt9629 + 16, Static28.aRandom1, Static154.anIntArray283, local43, Static344.anInt6510);
			Static368.method5431(16, Static331.anInt6263 + 4, Static479.aClass202_13.method4970(local43) - -local239, Static551.anInt9629);
			return;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	public static void method2621() {
		if (Static375.anInt9162 == 7) {
			Static342.method5247(false);
		} else {
			Static481.aClass1_2 = Static354.aClass1_1;
			Static354.aClass1_1 = null;
			Static436.method6188(13);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Lclient!hd;")
	public static Class6_Sub5_Sub8 method2622() {
		@Pc(13) Class6_Sub5_Sub8 local13 = (Class6_Sub5_Sub8) Static444.aClass256_9.method5902();
		if (local13 != null) {
			local13.method7948();
			local13.method7814();
			return local13;
		}
		do {
			local13 = (Class6_Sub5_Sub8) Static418.aClass256_8.method5902();
			if (local13 == null) {
				return null;
			}
			if (local13.method3258() > Static416.method5922()) {
				return null;
			}
			local13.method7948();
			local13.method7814();
		} while ((Long.MIN_VALUE & local13.aLong242) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIILclient!iaa;I)Z")
	public static boolean method2624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class138 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg0;
		@Pc(24) int local24 = arg7 - 64;
		@Pc(29) int local29 = arg0 - 64;
		Static318.anIntArrayArray48[64][64] = 99;
		Static567.anIntArrayArray82[64][64] = 0;
		@Pc(43) byte local43 = 0;
		@Pc(45) int local45 = 0;
		Static191.anIntArray315[0] = arg7;
		@Pc(52) int local52 = local43 + 1;
		Static313.anIntArray436[0] = arg0;
		@Pc(57) int[][] local57 = arg8.anIntArrayArray35;
		while (local45 != local52) {
			local9 = Static313.anIntArray436[local45];
			local7 = Static191.anIntArray315[local45];
			local45 = local45 + 1 & 0xFFF;
			@Pc(78) int local78 = local9 - local29;
			@Pc(83) int local83 = local7 - local24;
			@Pc(89) int local89 = local7 - arg8.anInt4008;
			@Pc(95) int local95 = local9 - arg8.anInt3999;
			if (arg1 == -4) {
				if (arg6 == local7 && local9 == arg2) {
					Static447.anInt7902 = local7;
					Static410.anInt7383 = local9;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static114.method1796(arg5, arg4, arg2, 2, 2, local7, arg6, local9)) {
					Static410.anInt7383 = local9;
					Static447.anInt7902 = local7;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg8.method3442(local7, arg5, arg6, 2, local9, arg4, 2, arg3, arg2)) {
					Static410.anInt7383 = local9;
					Static447.anInt7902 = local7;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg8.method3440(arg4, local9, arg5, arg3, arg2, local7, arg6, 2)) {
					Static410.anInt7383 = local9;
					Static447.anInt7902 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg8.method3444(arg9, arg1, local9, local7, arg2, 2, arg6)) {
					Static410.anInt7383 = local9;
					Static447.anInt7902 = local7;
					return true;
				}
			} else if (arg8.method3454(arg6, arg1, local9, 2, arg2, local7, arg9)) {
				Static447.anInt7902 = local7;
				Static410.anInt7383 = local9;
				return true;
			}
			@Pc(248) int local248 = Static567.anIntArrayArray82[local83][local78] + 1;
			if (local83 > 0 && Static318.anIntArrayArray48[local83 - 1][local78] == 0 && (local57[local89 - 1][local95] & 0x43A40000) == 0 && (local57[local89 - 1][local95 + 1] & 0x4E240000) == 0) {
				Static191.anIntArray315[local52] = local7 - 1;
				Static313.anIntArray436[local52] = local9;
				Static318.anIntArrayArray48[local83 - 1][local78] = 2;
				local52 = local52 + 1 & 0xFFF;
				Static567.anIntArrayArray82[local83 - 1][local78] = local248;
			}
			if (local83 < 126 && Static318.anIntArrayArray48[local83 + 1][local78] == 0 && (local57[local89 + 2][local95] & 0x60E40000) == 0 && (local57[local89 + 2][local95 + 1] & 0x78240000) == 0) {
				Static191.anIntArray315[local52] = local7 + 1;
				Static313.anIntArray436[local52] = local9;
				local52 = local52 + 1 & 0xFFF;
				Static318.anIntArrayArray48[local83 + 1][local78] = 8;
				Static567.anIntArrayArray82[local83 + 1][local78] = local248;
			}
			if (local78 > 0 && Static318.anIntArrayArray48[local83][local78 - 1] == 0 && (local57[local89][local95 - 1] & 0x43A40000) == 0 && (local57[local89 + 1][local95 - 1] & 0x60E40000) == 0) {
				Static191.anIntArray315[local52] = local7;
				Static313.anIntArray436[local52] = local9 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static318.anIntArrayArray48[local83][local78 - 1] = 1;
				Static567.anIntArrayArray82[local83][local78 - 1] = local248;
			}
			if (local78 < 126 && Static318.anIntArrayArray48[local83][local78 + 1] == 0 && (local57[local89][local95 + 2] & 0x4E240000) == 0 && (local57[local89 + 1][local95 + 2] & 0x78240000) == 0) {
				Static191.anIntArray315[local52] = local7;
				Static313.anIntArray436[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static318.anIntArrayArray48[local83][local78 + 1] = 4;
				Static567.anIntArrayArray82[local83][local78 + 1] = local248;
			}
			if (local83 > 0 && local78 > 0 && Static318.anIntArrayArray48[local83 - 1][local78 - 1] == 0 && (local57[local89 - 1][local95] & 0x4FA40000) == 0 && (local57[local89 - 1][local95 - 1] & 0x43A40000) == 0 && (local57[local89][local95 - 1] & 0x63E40000) == 0) {
				Static191.anIntArray315[local52] = local7 - 1;
				Static313.anIntArray436[local52] = local9 - 1;
				Static318.anIntArrayArray48[local83 - 1][local78 - 1] = 3;
				local52 = local52 + 1 & 0xFFF;
				Static567.anIntArrayArray82[local83 - 1][local78 - 1] = local248;
			}
			if (local83 < 126 && local78 > 0 && Static318.anIntArrayArray48[local83 + 1][local78 - 1] == 0 && (local57[local89 + 1][local95 - 1] & 0x63E40000) == 0 && (local57[local89 + 2][local95 - 1] & 0x60E40000) == 0 && (local57[local89 + 2][local95] & 0x78E40000) == 0) {
				Static191.anIntArray315[local52] = local7 + 1;
				Static313.anIntArray436[local52] = local9 - 1;
				Static318.anIntArrayArray48[local83 + 1][local78 - 1] = 9;
				local52 = local52 + 1 & 0xFFF;
				Static567.anIntArrayArray82[local83 + 1][local78 - 1] = local248;
			}
			if (local83 > 0 && local78 < 126 && Static318.anIntArrayArray48[local83 - 1][local78 + 1] == 0 && (local57[local89 - 1][local95 + 1] & 0x4FA40000) == 0 && (local57[local89 - 1][local95 + 2] & 0x4E240000) == 0 && (local57[local89][local95 + 2] & 0x7E240000) == 0) {
				Static191.anIntArray315[local52] = local7 - 1;
				Static313.anIntArray436[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static318.anIntArrayArray48[local83 - 1][local78 + 1] = 6;
				Static567.anIntArrayArray82[local83 - 1][local78 + 1] = local248;
			}
			if (local83 < 126 && local78 < 126 && Static318.anIntArrayArray48[local83 + 1][local78 + 1] == 0 && (local57[local89 + 1][local95 + 2] & 0x7E240000) == 0 && (local57[local89 + 2][local95 + 2] & 0x78240000) == 0 && (local57[local89 + 2][local95 + 1] & 0x78E40000) == 0) {
				Static191.anIntArray315[local52] = local7 + 1;
				Static313.anIntArray436[local52] = local9 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static318.anIntArrayArray48[local83 + 1][local78 + 1] = 12;
				Static567.anIntArrayArray82[local83 + 1][local78 + 1] = local248;
			}
		}
		Static410.anInt7383 = local9;
		Static447.anInt7902 = local7;
		return false;
	}
}
