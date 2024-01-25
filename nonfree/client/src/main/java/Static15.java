import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aja", name = "j", descriptor = "Lclient!paa;")
	public static Class49_Sub1 aClass49_Sub1_1;

	@OriginalMember(owner = "client!aja", name = "k", descriptor = "Lclient!pc;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!aja", name = "v", descriptor = "[Lclient!rfa;")
	public static final Class14_Sub18[] aClass14_Sub18Array1 = new Class14_Sub18[8];

	@OriginalMember(owner = "client!aja", name = "n", descriptor = "I")
	public static int anInt213 = 0;

	@OriginalMember(owner = "client!aja", name = "q", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_9 = new Class251(68, 8);

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method269(@OriginalArg(1) String arg0) {
		@Pc(13) Class14_Sub54 local13 = Static594.method8426();
		local13.aClass14_Sub21_Sub2_2.method7747(Static307.aClass358_11.anInt9944);
		local13.aClass14_Sub21_Sub2_2.method7751(0);
		@Pc(30) int local30 = local13.aClass14_Sub21_Sub2_2.anInt8936;
		local13.aClass14_Sub21_Sub2_2.method7751(661);
		@Pc(39) int[] local39 = Static299.method4899(local13);
		@Pc(43) int local43 = local13.aClass14_Sub21_Sub2_2.anInt8936;
		local13.aClass14_Sub21_Sub2_2.method7690(arg0);
		local13.aClass14_Sub21_Sub2_2.method7747(Static26.anInt352);
		local13.aClass14_Sub21_Sub2_2.anInt8936 += 7;
		local13.aClass14_Sub21_Sub2_2.method7710(local39, local13.aClass14_Sub21_Sub2_2.anInt8936, local43);
		local13.aClass14_Sub21_Sub2_2.method7716(local13.aClass14_Sub21_Sub2_2.anInt8936 - local30);
		Static277.aClass347_1.method8308(local13);
		Static649.anInt10662 = 0;
		Static465.anInt7807 = 1;
		Static689.anInt11198 = -3;
		Static535.anInt9160 = 0;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lclient!on;)V")
	public static void method270(@OriginalArg(0) Class275 arg0) {
		if (Static306.anInt6132 >= 65535) {
			return;
		}
		@Pc(7) Class14_Sub18 local7 = arg0.aClass14_Sub18_2;
		Static351.aClass275Array5[Static306.anInt6132] = arg0;
		Static178.aBooleanArray5[Static306.anInt6132] = false;
		Static306.anInt6132++;
		@Pc(22) int local22 = arg0.anInt7473;
		if (arg0.aBoolean529) {
			local22 = 0;
		}
		@Pc(30) int local30 = arg0.anInt7473;
		if (arg0.aBoolean528) {
			local30 = Static59.anInt987 - 1;
		}
		for (@Pc(39) int local39 = local22; local39 <= local30; local39++) {
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = local7.method8341() + Static193.anInt9749 - local7.method8343() >> Static110.anInt1858;
			if (local54 < 0) {
				local42 = -local54;
				local54 = 0;
			}
			@Pc(74) int local74 = local7.method8341() + local7.method8343() - Static193.anInt9749 >> Static110.anInt1858;
			if (local74 >= Static180.anInt2928) {
				local74 = Static180.anInt2928 - 1;
			}
			for (@Pc(83) int local83 = local54; local83 <= local74; local83++) {
				@Pc(90) short local90 = arg0.aShortArray93[local42++];
				@Pc(106) int local106 = (local7.method8342() + Static193.anInt9749 - local7.method8343() >> Static110.anInt1858) + (local90 >>> 8);
				@Pc(114) int local114 = local106 + (local90 & 0xFF) - 1;
				if (local106 < 0) {
					local106 = 0;
				}
				if (local114 >= Static654.anInt10715) {
					local114 = Static654.anInt10715 - 1;
				}
				for (@Pc(127) int local127 = local106; local127 <= local114; local127++) {
					@Pc(136) long local136 = Static378.aLongArrayArrayArray1[local39][local127][local83];
					if ((local136 & 0xFFFFL) == 0L) {
						Static378.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static306.anInt6132;
					} else if ((local136 & 0xFFFF0000L) == 0L) {
						Static378.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static306.anInt6132 << 16;
					} else if ((local136 & 0xFFFF00000000L) == 0L) {
						Static378.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static306.anInt6132 << 32;
					} else if ((local136 & 0xFFFF000000000000L) == 0L) {
						Static378.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static306.anInt6132 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "([[[Lclient!dv;ZZIII)Z")
	public static boolean method271(@OriginalArg(0) Class89[][][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(20) byte local20 = arg1 ? 1 : (byte) (Static688.anInt11168 & 0xFF);
		if (local20 == Static436.aByteArrayArrayArray11[Static391.anInt6811][arg3][arg2]) {
			return false;
		} else if ((Static446.aByteArrayArrayArray12[Static391.anInt6811][arg3][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(47) byte local47 = 0;
			Static129.anIntArray132[0] = arg3;
			@Pc(53) int local53 = 0;
			@Pc(56) int local56 = local47 + 1;
			Static82.anIntArray77[0] = arg2;
			Static436.aByteArrayArrayArray11[Static391.anInt6811][arg3][arg2] = local20;
			while (local56 != local53) {
				@Pc(73) int local73 = Static129.anIntArray132[local53] & 0xFFFF;
				@Pc(81) int local81 = Static129.anIntArray132[local53] >> 16 & 0xFF;
				@Pc(89) int local89 = Static129.anIntArray132[local53] >> 24 & 0xFF;
				@Pc(95) int local95 = Static82.anIntArray77[local53] & 0xFFFF;
				@Pc(103) int local103 = Static82.anIntArray77[local53] >> 16 & 0xFF;
				local53 = local53 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static446.aByteArrayArrayArray12[Static391.anInt6811][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(125) boolean local125 = false;
				@Pc(131) int local131;
				@Pc(180) int local180;
				@Pc(227) int local227;
				if (arg0 != null) {
					label237: for (local131 = Static391.anInt6811 + 1; local131 <= 3; local131++) {
						if (arg0[local131] != null && (Static446.aByteArrayArrayArray12[local131][local73][local95] & 0x8) == 0) {
							@Pc(337) Class4_Sub3_Sub3 local337;
							@Pc(347) int local347;
							@Pc(327) Class89 local327;
							@Pc(333) Class58 local333;
							if (local111 && arg0[local131][local73][local95] != null) {
								if (arg0[local131][local73][local95].aClass4_Sub3_Sub1_1 != null) {
									local180 = Static451.method6678(local81);
									if (local180 == arg0[local131][local73][local95].aClass4_Sub3_Sub1_1.aShort90 || arg0[local131][local73][local95].aClass4_Sub3_Sub1_2 != null && arg0[local131][local73][local95].aClass4_Sub3_Sub1_2.aShort90 == local180) {
										continue;
									}
									if (local89 != 0) {
										local227 = Static451.method6678(local89);
										if (arg0[local131][local73][local95].aClass4_Sub3_Sub1_1.aShort90 == local227 || arg0[local131][local73][local95].aClass4_Sub3_Sub1_2 != null && arg0[local131][local73][local95].aClass4_Sub3_Sub1_2.aShort90 == local227) {
											continue;
										}
									}
									if (local103 != 0) {
										local227 = Static451.method6678(local103);
										if (arg0[local131][local73][local95].aClass4_Sub3_Sub1_1.aShort90 == local227 || arg0[local131][local73][local95].aClass4_Sub3_Sub1_2 != null && arg0[local131][local73][local95].aClass4_Sub3_Sub1_2.aShort90 == local227) {
											continue;
										}
									}
								}
								local327 = arg0[local131][local73][local95];
								if (local327.aClass58_2 != null) {
									for (local333 = local327.aClass58_2; local333 != null; local333 = local333.aClass58_1) {
										local337 = local333.aClass4_Sub3_Sub3_1;
										if (local337 instanceof Interface16) {
											@Pc(343) Interface16 local343 = (Interface16) local337;
											local347 = local343.method9498();
											if (local347 == 21) {
												local347 = 19;
											}
											@Pc(358) int local358 = local343.method9502();
											@Pc(364) int local364 = local347 | local358 << 6;
											if (local81 == local364 || local89 != 0 && local364 == local89 || local103 != 0 && local103 == local364) {
												continue label237;
											}
										}
									}
								}
							}
							local327 = arg0[local131][local73][local95];
							if (local327 != null && local327.aClass58_2 != null) {
								for (local333 = local327.aClass58_2; local333 != null; local333 = local333.aClass58_1) {
									local337 = local333.aClass4_Sub3_Sub3_1;
									if (local337.aShort108 != local337.aShort107 || local337.aShort110 != local337.aShort109) {
										for (@Pc(444) int local444 = local337.aShort108; local444 <= local337.aShort107; local444++) {
											for (local347 = local337.aShort109; local347 <= local337.aShort110; local347++) {
												Static436.aByteArrayArrayArray11[local131][local444][local347] = local20;
											}
										}
									}
								}
							}
							Static436.aByteArrayArrayArray11[local131][local73][local95] = local20;
							local125 = true;
						}
					}
				}
				if (local125) {
					local131 = Static258.aClass159Array1[Static391.anInt6811 + 1].method8207(local95, local73);
					if (local131 > Static275.anIntArray283[arg4]) {
						Static275.anIntArray283[arg4] = local131;
					}
					local180 = local73 << 9;
					if (Static503.anIntArray454[arg4] > local180) {
						Static503.anIntArray454[arg4] = local180;
					} else if (Static384.anIntArray349[arg4] < local180) {
						Static384.anIntArray349[arg4] = local180;
					}
					local227 = local95 << 9;
					if (local227 < Static143.anIntArray144[arg4]) {
						Static143.anIntArray144[arg4] = local227;
					} else if (Static547.anIntArray230[arg4] < local227) {
						Static547.anIntArray230[arg4] = local227;
					}
				}
				if (!local111) {
					if (local73 >= 1 && local20 != Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 - 1][local95]) {
						Static129.anIntArray132[local56] = 0xD3000000 | 0x120000 | local73 - 1;
						Static82.anIntArray77[local56] = local95 | 0x130000;
						local56 = local56 + 1 & 0xFFF;
						Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 - 1][local95] = local20;
					}
					local95++;
					if (local95 < Static542.anInt9214) {
						if (local73 - 1 >= 0 && Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 - 1][local95] != local20 && (Static446.aByteArrayArrayArray12[Static391.anInt6811][local73][local95] & 0x4) == 0 && (Static446.aByteArrayArrayArray12[Static391.anInt6811][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static129.anIntArray132[local56] = 0x52000000 | 0x120000 | local73 - 1;
							Static82.anIntArray77[local56] = local95 | 0x130000;
							Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 - 1][local95] = local20;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local20 != Static436.aByteArrayArrayArray11[Static391.anInt6811][local73][local95]) {
							Static129.anIntArray132[local56] = local73 | 0x520000 | 0x13000000;
							Static82.anIntArray77[local56] = local95 | 0x530000;
							Static436.aByteArrayArrayArray11[Static391.anInt6811][local73][local95] = local20;
							local56 = local56 + 1 & 0xFFF;
						}
						if (Static380.anInt6689 > local73 + 1 && local20 != Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 + 1][local95] && (Static446.aByteArrayArrayArray12[Static391.anInt6811][local73][local95] & 0x4) == 0 && (Static446.aByteArrayArrayArray12[Static391.anInt6811][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static129.anIntArray132[local56] = local73 + 1 | 0x520000 | 0x92000000;
							Static82.anIntArray77[local56] = local95 | 0x530000;
							Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 + 1][local95] = local20;
							local56 = local56 + 1 & 0xFFF;
						}
					}
					local95--;
					if (local73 + 1 < Static380.anInt6689 && local20 != Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 + 1][local95]) {
						Static129.anIntArray132[local56] = 0x53000000 | 0x920000 | local73 + 1;
						Static82.anIntArray77[local56] = local95 | 0x930000;
						local56 = local56 + 1 & 0xFFF;
						Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 + 1][local95] = local20;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && local20 != Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 - 1][local95] && (Static446.aByteArrayArrayArray12[Static391.anInt6811][local73][local95] & 0x4) == 0 && (Static446.aByteArrayArrayArray12[Static391.anInt6811][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static129.anIntArray132[local56] = local73 - 1 | 0xD20000 | 0x12000000;
							Static82.anIntArray77[local56] = local95 | 0xD30000;
							local56 = local56 + 1 & 0xFFF;
							Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 - 1][local95] = local20;
						}
						if (Static436.aByteArrayArrayArray11[Static391.anInt6811][local73][local95] != local20) {
							Static129.anIntArray132[local56] = local73 | 0xD20000 | 0x93000000;
							Static82.anIntArray77[local56] = local95 | 0xD30000;
							local56 = local56 + 1 & 0xFFF;
							Static436.aByteArrayArrayArray11[Static391.anInt6811][local73][local95] = local20;
						}
						if (local73 + 1 < Static380.anInt6689 && local20 != Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 + 1][local95] && (Static446.aByteArrayArrayArray12[Static391.anInt6811][local73][local95] & 0x4) == 0 && (Static446.aByteArrayArrayArray12[Static391.anInt6811][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static129.anIntArray132[local56] = local73 + 1 | 0xD2000000 | 0x920000;
							Static82.anIntArray77[local56] = local95 | 0x930000;
							local56 = local56 + 1 & 0xFFF;
							Static436.aByteArrayArrayArray11[Static391.anInt6811][local73 + 1][local95] = local20;
						}
					}
				}
			}
			if (Static275.anIntArray283[arg4] != -1000000) {
				Static275.anIntArray283[arg4] += 40;
				Static503.anIntArray454[arg4] -= 512;
				Static384.anIntArray349[arg4] += 512;
				Static547.anIntArray230[arg4] += 512;
				Static143.anIntArray144[arg4] -= 512;
			}
			return true;
		}
	}
}
