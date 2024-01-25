import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "[[[Lclient!ak;")
	public static Class8[][][] aClass8ArrayArrayArray3;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
	public static final int[] anIntArray343 = new int[14];

	@OriginalMember(owner = "client!of", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[200];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZIIII)V")
	public static void method3969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static265.anInt6826 = arg3;
		Static289.anInt5821 = arg2;
		Static337.anInt6720 = arg4;
		Static149.anInt3053 = arg0;
		Static277.anInt5649 = arg1;
		if (Static265.anInt6826 >= 100) {
			@Pc(27) int local27 = Static337.anInt6720 * 128 + 64;
			@Pc(33) int local33 = Static149.anInt3053 * 128 + 64;
			@Pc(41) int local41 = Static138.method2745(Static182.anInt3603, local27, local33) - Static289.anInt5821;
			@Pc(46) int local46 = local27 - Static287.anInt5819;
			@Pc(51) int local51 = local41 - Static163.anInt1495;
			@Pc(55) int local55 = local33 - Static290.anInt5837;
			@Pc(66) int local66 = (int) Math.sqrt((double) (local46 * local46 + local55 * local55));
			Static283.anInt5723 = (int) (Math.atan2((double) local51, (double) local66) * 2607.5945876176133D) & 0x3FFF;
			Static291.anInt5883 = (int) (-2607.5945876176133D * Math.atan2((double) local46, (double) local55)) & 0x3FFF;
			Static344.anInt6885 = 0;
			if (Static283.anInt5723 < 1024) {
				Static283.anInt5723 = 1024;
			}
			if (Static283.anInt5723 > 3072) {
				Static283.anInt5723 = 3072;
			}
		}
		Static182.anInt3602 = 2;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!tq;B)V")
	public static void method3971(@OriginalArg(0) Class191 arg0) {
		Static229.aClass191_77 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII[[BLclient!da;[[BILclient!or;I[[BLclient!ae;[Z)V")
	public static void method3972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) Class39 arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class150 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) Class4 arg11, @OriginalArg(13) boolean[] arg12) {
		@Pc(48) int local48;
		if (arg8 != null && arg5 != null || arg5 != null && arg1 == 12 || arg8 != null && arg1 == 0) {
			@Pc(29) boolean[] local29 = arg8 != null && arg8.aBoolean415 ? Static203.aBooleanArrayArray15[arg1] : Static129.aBooleanArrayArray9[arg1];
			@Pc(56) Class150 local56;
			@Pc(73) byte local73;
			@Pc(89) int local89;
			@Pc(94) int local94;
			if (arg3 > 0) {
				if (arg7 > 0) {
					local48 = arg6[arg7 - 1][arg3 - 1] & 0xFF;
					if (local48 > 0) {
						local56 = Static19.method676(local48 - 1);
						if (local56.anInt4535 != -1 && local56.aBoolean415) {
							local73 = arg10[arg7 - 1][arg3 - 1];
							local89 = arg4[arg7 - 1][arg3 - 1] * 2 + 4 & 0x7;
							local94 = Static77.method1765(arg11, local56);
							if (Static60.aBooleanArrayArray1[local73][local89]) {
								Static180.anIntArray294[0] = local56.anInt4535;
								Static157.anIntArray267[0] = local94;
								Static208.anIntArray323[0] = arg11.method4297() ? local56.anInt4545 : local56.anInt4534;
								Static39.anIntArray77[0] = local56.anInt4536;
								Static179.anIntArray293[0] = local56.anInt4543;
								Static31.anIntArray38[0] = 256;
							}
						}
					}
				}
				if (arg2 - 1 > arg7) {
					local48 = arg6[arg7 + 1][arg3 - 1] & 0xFF;
					if (local48 > 0) {
						local56 = Static19.method676(local48 - 1);
						if (local56.anInt4535 != -1 && local56.aBoolean415) {
							local73 = arg10[arg7 + 1][arg3 - 1];
							local89 = arg4[arg7 + 1][arg3 - 1] * 2 + 6 & 0x7;
							local94 = Static77.method1765(arg11, local56);
							if (Static60.aBooleanArrayArray1[local73][local89]) {
								Static180.anIntArray294[2] = local56.anInt4535;
								Static157.anIntArray267[2] = local94;
								Static208.anIntArray323[2] = arg11.method4297() ? local56.anInt4545 : local56.anInt4534;
								Static39.anIntArray77[2] = local56.anInt4536;
								Static179.anIntArray293[2] = local56.anInt4543;
								Static31.anIntArray38[2] = 512;
							}
						}
					}
				}
			}
			if (arg3 < arg0 - 1) {
				if (arg7 > 0) {
					local48 = arg6[arg7 - 1][arg3 + 1] & 0xFF;
					if (local48 > 0) {
						local56 = Static19.method676(local48 - 1);
						if (local56.anInt4535 != -1 && local56.aBoolean415) {
							local73 = arg10[arg7 - 1][arg3 + 1];
							local89 = arg4[arg7 - 1][arg3 + 1] * 2 + 2 & 0x7;
							local94 = Static77.method1765(arg11, local56);
							if (Static60.aBooleanArrayArray1[local73][local89]) {
								Static180.anIntArray294[6] = local56.anInt4535;
								Static157.anIntArray267[6] = local94;
								Static208.anIntArray323[6] = arg11.method4297() ? local56.anInt4545 : local56.anInt4534;
								Static39.anIntArray77[6] = local56.anInt4536;
								Static179.anIntArray293[6] = local56.anInt4543;
								Static31.anIntArray38[6] = 64;
							}
						}
					}
				}
				if (arg7 < arg2 - 1) {
					local48 = arg6[arg7 + 1][arg3 + 1] & 0xFF;
					if (local48 > 0) {
						local56 = Static19.method676(local48 - 1);
						if (local56.anInt4535 != -1 && local56.aBoolean415) {
							local73 = arg10[arg7 + 1][arg3 + 1];
							local89 = arg4[arg7 + 1][arg3 + 1] * 2 & 0x7;
							local94 = Static77.method1765(arg11, local56);
							if (Static60.aBooleanArrayArray1[local73][local89]) {
								Static180.anIntArray294[4] = local56.anInt4535;
								Static157.anIntArray267[4] = local94;
								Static208.anIntArray323[4] = arg11.method4297() ? local56.anInt4545 : local56.anInt4534;
								Static39.anIntArray77[4] = local56.anInt4536;
								Static179.anIntArray293[4] = local56.anInt4543;
								Static31.anIntArray38[4] = 128;
							}
						}
					}
				}
			}
			@Pc(517) int local517;
			@Pc(522) int local522;
			@Pc(524) int local524;
			@Pc(506) byte local506;
			if (arg3 > 0) {
				local48 = arg6[arg7][arg3 - 1] & 0xFF;
				if (local48 > 0) {
					local56 = Static19.method676(local48 - 1);
					if (local56.anInt4535 != -1) {
						local73 = arg10[arg7][arg3 - 1];
						local506 = arg4[arg7][arg3 - 1];
						if (local56.aBoolean415) {
							local94 = 2;
							local517 = local506 * 2 + 4;
							local522 = Static77.method1765(arg11, local56);
							for (local524 = 0; local524 < 3; local524++) {
								local517 &= 0x7;
								local94 &= 0x7;
								if (Static60.aBooleanArrayArray1[local73][local517] && Static179.anIntArray293[local94] <= local56.anInt4543) {
									Static180.anIntArray294[local94] = local56.anInt4535;
									Static157.anIntArray267[local94] = local522;
									Static208.anIntArray323[local94] = arg11.method4297() ? local56.anInt4545 : local56.anInt4534;
									Static39.anIntArray77[local94] = local56.anInt4536;
									if (Static179.anIntArray293[local94] == local56.anInt4543) {
										Static31.anIntArray38[local94] |= 0x20;
									} else {
										Static31.anIntArray38[local94] = 32;
									}
									Static179.anIntArray293[local94] = local56.anInt4543;
								}
								local517++;
								local94--;
							}
							if (!local29[arg9 & 0x3]) {
								arg12[0] = Static203.aBooleanArrayArray15[local73][local506 + 2 & 0x3];
							}
						} else if (!local29[--arg9 & 0x3]) {
							arg12[0] = Static129.aBooleanArrayArray9[local73][local506 + 2 & 0x3];
						}
					}
				}
			}
			if (arg3 < arg0 - 1) {
				local48 = arg6[arg7][arg3 + 1] & 0xFF;
				if (local48 > 0) {
					local56 = Static19.method676(local48 - 1);
					if (local56.anInt4535 != -1) {
						local73 = arg10[arg7][arg3 + 1];
						local506 = arg4[arg7][arg3 + 1];
						if (local56.aBoolean415) {
							local94 = 4;
							local517 = local506 * 2 + 2;
							local522 = Static77.method1765(arg11, local56);
							for (local524 = 0; local524 < 3; local524++) {
								local94 &= 0x7;
								local517 &= 0x7;
								if (Static60.aBooleanArrayArray1[local73][local517] && Static179.anIntArray293[local94] <= local56.anInt4543) {
									Static180.anIntArray294[local94] = local56.anInt4535;
									Static157.anIntArray267[local94] = local522;
									Static208.anIntArray323[local94] = arg11.method4297() ? local56.anInt4545 : local56.anInt4534;
									Static39.anIntArray77[local94] = local56.anInt4536;
									if (local56.anInt4543 == Static179.anIntArray293[local94]) {
										Static31.anIntArray38[local94] |= 0x10;
									} else {
										Static31.anIntArray38[local94] = 16;
									}
									Static179.anIntArray293[local94] = local56.anInt4543;
								}
								local517--;
								local94++;
							}
							if (!local29[arg9 + 2 & 0x3]) {
								arg12[2] = Static203.aBooleanArrayArray15[local73][local506 & 0x3];
							}
						} else if (!local29[arg9 + 2 & 0x3]) {
							arg12[2] = Static129.aBooleanArrayArray9[local73][local506 & 0x3];
						}
					}
				}
			}
			if (arg7 > 0) {
				local48 = arg6[arg7 - 1][arg3] & 0xFF;
				if (local48 > 0) {
					local56 = Static19.method676(local48 - 1);
					if (local56.anInt4535 != -1) {
						local73 = arg10[arg7 - 1][arg3];
						local506 = arg4[arg7 - 1][arg3];
						if (local56.aBoolean415) {
							local94 = 6;
							local517 = local506 * 2 + 4;
							local522 = Static77.method1765(arg11, local56);
							for (local524 = 0; local524 < 3; local524++) {
								local94 &= 0x7;
								local517 &= 0x7;
								if (Static60.aBooleanArrayArray1[local73][local517] && local56.anInt4543 >= Static179.anIntArray293[local94]) {
									Static180.anIntArray294[local94] = local56.anInt4535;
									Static157.anIntArray267[local94] = local522;
									Static208.anIntArray323[local94] = arg11.method4297() ? local56.anInt4545 : local56.anInt4534;
									Static39.anIntArray77[local94] = local56.anInt4536;
									if (local56.anInt4543 == Static179.anIntArray293[local94]) {
										Static31.anIntArray38[local94] |= 0x8;
									} else {
										Static31.anIntArray38[local94] = 8;
									}
									Static179.anIntArray293[local94] = local56.anInt4543;
								}
								local517--;
								local94++;
							}
							if (!local29[arg9 + 3 & 0x3]) {
								arg12[3] = Static203.aBooleanArrayArray15[local73][local506 + 1 & 0x3];
							}
						} else if (!local29[arg9 + 3 & 0x3]) {
							arg12[3] = Static129.aBooleanArrayArray9[local73][local506 + 1 & 0x3];
						}
					}
				}
			}
			if (arg7 < arg2 - 1) {
				local48 = arg6[arg7 + 1][arg3] & 0xFF;
				if (local48 > 0) {
					local56 = Static19.method676(local48 - 1);
					if (local56.anInt4535 != -1) {
						local73 = arg10[arg7 + 1][arg3];
						local506 = arg4[arg7 + 1][arg3];
						if (local56.aBoolean415) {
							local94 = 4;
							local517 = local506 * 2 + 6;
							local522 = Static77.method1765(arg11, local56);
							for (local524 = 0; local524 < 3; local524++) {
								local517 &= 0x7;
								local94 &= 0x7;
								if (Static60.aBooleanArrayArray1[local73][local517] && local56.anInt4543 >= Static179.anIntArray293[local94]) {
									Static180.anIntArray294[local94] = local56.anInt4535;
									Static157.anIntArray267[local94] = local522;
									Static208.anIntArray323[local94] = arg11.method4297() ? local56.anInt4545 : local56.anInt4534;
									Static39.anIntArray77[local94] = local56.anInt4536;
									if (local56.anInt4543 == Static179.anIntArray293[local94]) {
										Static31.anIntArray38[local94] |= 0x4;
									} else {
										Static31.anIntArray38[local94] = 4;
									}
									Static179.anIntArray293[local94] = local56.anInt4543;
								}
								local94--;
								local517++;
							}
							if (!local29[arg9 + 1 & 0x3]) {
								arg12[1] = Static203.aBooleanArrayArray15[local73][local506 + 3 & 0x3];
							}
						} else if (!local29[arg9 + 1 & 0x3]) {
							arg12[1] = Static129.aBooleanArrayArray9[local73][local506 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local48 = Static77.method1765(arg11, arg8);
		if (!arg8.aBoolean415) {
			return;
		}
		for (@Pc(1235) int local1235 = 0; local1235 < 8; local1235++) {
			@Pc(1245) int local1245 = local1235 - arg9 * 2 & 0x7;
			if (Static60.aBooleanArrayArray1[arg1][local1235] && arg8.anInt4543 >= Static179.anIntArray293[local1245]) {
				Static180.anIntArray294[local1245] = arg8.anInt4535;
				Static157.anIntArray267[local1245] = local48;
				Static208.anIntArray323[local1245] = arg11.method4297() ? arg8.anInt4545 : arg8.anInt4534;
				Static39.anIntArray77[local1245] = arg8.anInt4536;
				if (Static179.anIntArray293[local1245] == arg8.anInt4543) {
					Static31.anIntArray38[local1245] |= 0x2;
				} else {
					Static31.anIntArray38[local1245] = 2;
				}
				Static179.anIntArray293[local1245] = arg8.anInt4543;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!wl;)Lclient!rp;")
	public static Class172 method3973(@OriginalArg(1) int arg0, @OriginalArg(2) Class62_Sub1 arg1) {
		@Pc(12) Class172 local12;
		if (Static92.aClass172_3 == null) {
			local12 = new Class172();
		} else {
			local12 = Static92.aClass172_3;
			Static92.aClass172_3 = Static92.aClass172_3.aClass172_4;
			Static103.anInt2334--;
			local12.aClass172_4 = null;
		}
		local12.aClass62_Sub1_1 = arg1;
		local12.anInt5621 = arg0;
		return local12;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!ae;Lclient!on;B)V")
	public static void method3974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) Class146 arg3) {
		@Pc(10) Class77 local10 = arg3.method4042(arg2);
		if (local10 == null) {
			return;
		}
		arg2.method4252(arg0, arg1, arg3.anInt4468 + arg0, arg3.anInt4414 + arg1);
		if (Static260.anInt5271 == 2 || Static260.anInt5271 == 5 || Static75.aClass31_42 == null) {
			arg2.method4269(local10, arg0, arg1);
			return;
		}
		@Pc(53) int local53;
		@Pc(51) int local51;
		@Pc(49) int local49;
		@Pc(43) int local43;
		if (Static182.anInt3602 == 4) {
			local43 = 4096;
			local49 = (int) -Static92.aFloat28 & 0x3FFF;
			local51 = Static347.anInt4215;
			local53 = Static24.anInt501;
		} else {
			local43 = 4096 - Static331.anInt3201 * 16;
			local53 = Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289;
			local49 = (int) -Static92.aFloat28 + Static256.anInt5068 & 0x3FFF;
			local51 = Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280;
		}
		@Pc(90) int local90 = local53 / 32 + 48 + 208 - Static95.anInt6381 * 2;
		@Pc(108) int local108 = Static237.anInt4532 * 4 + 208 + 48 - Static237.anInt4532 * 2 - local51 / 32;
		Static75.aClass31_42.method4388((float) arg3.anInt4468 / 2.0F + (float) arg0, (float) arg1 + (float) arg3.anInt4414 / 2.0F, (float) local90, (float) local108, local43, local49 << 2, local10, arg0, arg1);
		@Pc(159) int local159;
		@Pc(169) int local169;
		@Pc(179) int local179;
		@Pc(190) int local190;
		for (@Pc(142) Class2_Sub42 local142 = (Class2_Sub42) Class62_Sub1_Sub3.lb.method5992(); local142 != null; local142 = (Class2_Sub42) Class62_Sub1_Sub3.lb.method6000()) {
			@Pc(147) int local147 = local142.anInt6670;
			local159 = (Static136.aClass142_3.anIntArray334[local147] >> 14 & 0x3FFF) - Static138.anInt2879;
			local169 = (Static136.aClass142_3.anIntArray334[local147] & 0x3FFF) - Static342.anInt6864;
			local179 = local159 * 4 + 2 - local53 / 32;
			local190 = local169 * 4 + 2 - local51 / 32;
			Static42.method992(arg1, local190, arg2, arg0, Static136.aClass142_3.anIntArray335[local147], local10, arg3, local179);
		}
		for (local159 = 0; local159 < Static311.anInt6289; local159++) {
			local169 = Static286.anIntArray421[local159] * 4 + 2 - local53 / 32;
			local179 = Static219.anIntArray333[local159] * 4 + 2 - local51 / 32;
			@Pc(245) Class96 local245 = Static234.method4051(Static141.anIntArray242[local159]);
			if (local245.anIntArray259 != null) {
				local245 = local245.method2944();
				if (local245 == null || local245.anInt3127 == -1) {
					continue;
				}
			}
			Static42.method992(arg1, local179, arg2, arg0, local245.anInt3127, local10, arg3, local169);
		}
		for (@Pc(284) Class2_Sub1 local284 = (Class2_Sub1) Static136.aClass199_12.method5747(); local284 != null; local284 = (Class2_Sub1) Static136.aClass199_12.method5753()) {
			local179 = (int) (local284.aLong213 >> 28 & 0x3L);
			if (Static113.anInt2542 == local179) {
				local190 = (int) (local284.aLong213 & 0x3FFFL) * 4 + 2 - local53 / 32;
				@Pc(332) int local332 = (int) (local284.aLong213 >> 14 & 0x3FFFL) * 4 + 2 - local51 / 32;
				Static29.method766(local332, Static148.aClass31Array10[0], arg3, arg0, local10, local190, arg1);
			}
		}
		@Pc(396) int local396;
		@Pc(405) int local405;
		for (local179 = 0; local179 < Static169.anInt3463; local179++) {
			@Pc(360) Class62_Sub1_Sub2_Sub1 local360 = Static37.aClass62_Sub1_Sub2_Sub1Array1[Static98.anIntArray215[local179]];
			if (local360 != null && local360.method4720()) {
				@Pc(369) Class186 local369 = local360.aClass186_1;
				if (local369 != null && local369.anIntArray432 != null) {
					local369 = local369.method5206();
				}
				if (local369 != null && local369.aBoolean526 && local369.aBoolean529) {
					local396 = local360.anInt5289 / 32 - local53 / 32;
					local405 = local360.anInt5280 / 32 - local51 / 32;
					if (local369.anInt5945 == -1) {
						Static29.method766(local405, Static148.aClass31Array10[1], arg3, arg0, local10, local396, arg1);
					} else {
						Static42.method992(arg1, local405, arg2, arg0, local369.anInt5945, local10, arg3, local396);
					}
				}
			}
		}
		@Pc(480) int local480;
		for (local190 = 0; local190 < Static214.anInt4133; local190++) {
			@Pc(451) Class62_Sub1_Sub2_Sub2 local451 = Static129.aClass62_Sub1_Sub2_Sub2Array1[Static103.anIntArray218[local190]];
			if (local451 != null && local451.method4790()) {
				local396 = local451.anInt5289 / 32 - local53 / 32;
				local405 = local451.anInt5280 / 32 - local51 / 32;
				@Pc(478) boolean local478 = false;
				for (local480 = 0; local480 < Static296.anInt6002; local480++) {
					if (local451.aString48.equals(Static287.aStringArray53[local480]) && Static226.anIntArray275[local480] != 0) {
						local478 = true;
						break;
					}
				}
				@Pc(510) boolean local510 = false;
				for (@Pc(512) int local512 = 0; local512 < Static151.anInt3097; local512++) {
					if (local451.aString48.equals(Static88.aClass11Array1[local512].aString3)) {
						local510 = true;
						break;
					}
				}
				@Pc(536) boolean local536 = false;
				if (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5381 != 0 && local451.anInt5381 != 0 && Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5381 == local451.anInt5381) {
					local536 = true;
				}
				if (local478) {
					Static29.method766(local405, Static148.aClass31Array10[3], arg3, arg0, local10, local396, arg1);
				} else if (local510) {
					Static29.method766(local405, Static148.aClass31Array10[5], arg3, arg0, local10, local396, arg1);
				} else if (local536) {
					Static29.method766(local405, Static148.aClass31Array10[4], arg3, arg0, local10, local396, arg1);
				} else {
					Static29.method766(local405, Static148.aClass31Array10[2], arg3, arg0, local10, local396, arg1);
				}
			}
		}
		@Pc(618) Class189[] local618 = Static264.aClass189Array1;
		@Pc(710) int local710;
		for (local396 = 0; local396 < local618.length; local396++) {
			@Pc(626) Class189 local626 = local618[local396];
			if (local626 != null && local626.anInt6225 != 0 && Static212.anInt4090 % 20 < 10) {
				@Pc(681) int local681;
				if (local626.anInt6225 == 1 && local626.anInt6219 >= 0 && local626.anInt6219 < Static37.aClass62_Sub1_Sub2_Sub1Array1.length) {
					@Pc(660) Class62_Sub1_Sub2_Sub1 local660 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local626.anInt6219];
					if (local660 != null) {
						local480 = local660.anInt5289 / 32 - local53 / 32;
						local681 = local660.anInt5280 / 32 - local51 / 32;
						Static57.method1343(arg0, 360000, arg3, arg1, local10, local480, local626.anInt6215, local681);
					}
				}
				if (local626.anInt6225 == 2) {
					local710 = (local626.anInt6222 - Static138.anInt2879) * 4 + 2 - local53 / 32;
					local480 = (local626.anInt6227 - Static342.anInt6864) * 4 + 2 - local51 / 32;
					local681 = local626.anInt6220 * 4;
					local681 *= local681;
					Static57.method1343(arg0, local681, arg3, arg1, local10, local710, local626.anInt6215, local480);
				}
				if (local626.anInt6225 == 10 && local626.anInt6219 >= 0 && Static129.aClass62_Sub1_Sub2_Sub2Array1.length > local626.anInt6219) {
					@Pc(763) Class62_Sub1_Sub2_Sub2 local763 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local626.anInt6219];
					if (local763 != null) {
						local480 = local763.anInt5289 / 32 - local53 / 32;
						local681 = local763.anInt5280 / 32 - local51 / 32;
						Static57.method1343(arg0, 360000, arg3, arg1, local10, local480, local626.anInt6215, local681);
					}
				}
			}
		}
		if (Static182.anInt3602 == 4) {
			return;
		}
		if (Static201.anInt3909 != 0) {
			local405 = Static201.anInt3909 * 4 + (Static41.aClass62_Sub1_Sub2_Sub2_2.method4777() - 1) * 2 + 2 - local53 / 32;
			local710 = Static116.anInt2576 * 4 + Static41.aClass62_Sub1_Sub2_Sub2_2.method4777() * 2 + 2 - local51 / 32 - 2;
			Static29.method766(local710, Static38.aClass31Array2[Static264.aBoolean487 ? 1 : 0], arg3, arg0, local10, local405, arg1);
		}
		arg2.method4261(arg1 + arg3.anInt4414 / 2 - 1, arg3.anInt4468 / 2 + arg0 - 1, 3, 3, -1);
		return;
	}
}
