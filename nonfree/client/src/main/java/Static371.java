import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "[S")
	public static final short[] aShortArray84 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_10 = new Class146(12, 6);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IBI)V")
	public static void method5093(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub2_Sub1 local16 = Static258.method5559(arg1, 7);
		local16.method202();
		local16.anInt214 = arg0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZII[[[Lclient!sd;I)Z")
	public static boolean method5095(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class211[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static243.anInt4342 & 0xFF);
		if (local14 == Static443.aByteArrayArrayArray17[Static152.anInt2600][arg4][arg0]) {
			return false;
		} else if ((Static184.aByteArrayArrayArray3[Static152.anInt2600][arg4][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			@Pc(48) int local48 = 0;
			Static322.anIntArray445[0] = arg4;
			@Pc(55) int local55 = local46 + 1;
			Static70.anIntArray97[0] = arg0;
			Static443.aByteArrayArrayArray17[Static152.anInt2600][arg4][arg0] = local14;
			while (local55 != local48) {
				@Pc(73) int local73 = Static322.anIntArray445[local48] & 0xFFFF;
				@Pc(81) int local81 = Static322.anIntArray445[local48] >> 16 & 0xFF;
				@Pc(89) int local89 = Static322.anIntArray445[local48] >> 24 & 0xFF;
				@Pc(95) int local95 = Static70.anIntArray97[local48] & 0xFFFF;
				@Pc(103) int local103 = Static70.anIntArray97[local48] >> 16 & 0xFF;
				local48 = local48 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static184.aByteArrayArrayArray3[Static152.anInt2600][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(125) boolean local125 = false;
				@Pc(167) int local167;
				@Pc(214) int local214;
				label231: for (@Pc(129) int local129 = Static152.anInt2600 + 1; local129 <= 3; local129++) {
					if ((Static184.aByteArrayArrayArray3[local129][local73][local95] & 0x8) == 0) {
						@Pc(309) Class26_Sub2 local309;
						@Pc(319) int local319;
						@Pc(298) Class211 local298;
						@Pc(304) Class125 local304;
						if (local111 && arg3[local129][local73][local95] != null) {
							if (arg3[local129][local73][local95].aClass26_Sub1_2 != null) {
								local167 = Static381.method4266(local81);
								if (local167 == arg3[local129][local73][local95].aClass26_Sub1_2.anInt3958 || arg3[local129][local73][local95].aClass26_Sub1_3 != null && local167 == arg3[local129][local73][local95].aClass26_Sub1_3.anInt3958) {
									continue;
								}
								if (local89 != 0) {
									local214 = Static381.method4266(local89);
									if (arg3[local129][local73][local95].aClass26_Sub1_2.anInt3958 == local214 || arg3[local129][local73][local95].aClass26_Sub1_3 != null && arg3[local129][local73][local95].aClass26_Sub1_3.anInt3958 == local214) {
										continue;
									}
								}
								if (local103 != 0) {
									local214 = Static381.method4266(local103);
									if (arg3[local129][local73][local95].aClass26_Sub1_2.anInt3958 == local214 || arg3[local129][local73][local95].aClass26_Sub1_3 != null && local214 == arg3[local129][local73][local95].aClass26_Sub1_3.anInt3958) {
										continue;
									}
								}
							}
							local298 = arg3[local129][local73][local95];
							if (local298.aClass125_3 != null) {
								for (local304 = local298.aClass125_3; local304 != null; local304 = local304.aClass125_1) {
									local309 = local304.aClass26_Sub2_1;
									if (local309 instanceof Interface6) {
										@Pc(315) Interface6 local315 = (Interface6) local309;
										local319 = local315.method4666();
										if (local319 == 21) {
											local319 = 19;
										}
										@Pc(330) int local330 = local315.method4670();
										@Pc(336) int local336 = local319 | local330 << 6;
										if (local81 == local336 || local89 != 0 && local89 == local336 || local103 != 0 && local103 == local336) {
											continue label231;
										}
									}
								}
							}
						}
						local298 = arg3[local129][local73][local95];
						if (local298 != null && local298.aClass125_3 != null) {
							for (local304 = local298.aClass125_3; local304 != null; local304 = local304.aClass125_1) {
								local309 = local304.aClass26_Sub2_1;
								if (local309.aShort93 != local309.aShort92 || local309.aShort94 != local309.aShort95) {
									for (@Pc(398) int local398 = local309.aShort93; local398 <= local309.aShort92; local398++) {
										for (local319 = local309.aShort94; local319 <= local309.aShort95; local319++) {
											Static443.aByteArrayArrayArray17[local129][local398][local319] = local14;
										}
									}
								}
							}
						}
						local125 = true;
						Static443.aByteArrayArrayArray17[local129][local73][local95] = local14;
					}
				}
				if (local125) {
					local167 = Static92.aClass136Array1[Static152.anInt2600 + 1].I(local73, local95);
					if (local167 > Static21.anIntArray29[arg2]) {
						Static21.anIntArray29[arg2] = local167;
					}
					local214 = local73 << 7;
					if (Static264.anIntArray383[arg2] > local214) {
						Static264.anIntArray383[arg2] = local214;
					} else if (Static199.anIntArray300[arg2] < local214) {
						Static199.anIntArray300[arg2] = local214;
					}
					@Pc(504) int local504 = local95 << 7;
					if (Static174.anIntArray267[arg2] > local504) {
						Static174.anIntArray267[arg2] = local504;
					} else if (Static335.anIntArray80[arg2] < local504) {
						Static335.anIntArray80[arg2] = local504;
					}
				}
				if (!local111) {
					if (local73 >= 1 && Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 - 1][local95] != local14) {
						Static322.anIntArray445[local55] = 0xD3000000 | 0x120000 | local73 - 1;
						Static70.anIntArray97[local55] = local95 | 0x130000;
						local55 = local55 + 1 & 0xFFF;
						Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 - 1][local95] = local14;
					}
					local95++;
					if (local95 < Static352.anInt6022) {
						if (local73 - 1 >= 0 && local14 != Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 - 1][local95] && (Static184.aByteArrayArrayArray3[Static152.anInt2600][local73][local95] & 0x4) == 0 && (Static184.aByteArrayArrayArray3[Static152.anInt2600][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static322.anIntArray445[local55] = 0x52000000 | 0x120000 | local73 - 1;
							Static70.anIntArray97[local55] = local95 | 0x130000;
							Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static443.aByteArrayArrayArray17[Static152.anInt2600][local73][local95] != local14) {
							Static322.anIntArray445[local55] = 0x13000000 | 0x520000 | local73;
							Static70.anIntArray97[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static443.aByteArrayArrayArray17[Static152.anInt2600][local73][local95] = local14;
						}
						if (local73 + 1 < Static135.anInt2314 && Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 + 1][local95] != local14 && (Static184.aByteArrayArrayArray3[Static152.anInt2600][local73][local95] & 0x4) == 0 && (Static184.aByteArrayArrayArray3[Static152.anInt2600][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static322.anIntArray445[local55] = local73 + 1 | 0x520000 | 0x92000000;
							Static70.anIntArray97[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 + 1][local95] = local14;
						}
					}
					local95--;
					if (local73 + 1 < Static135.anInt2314 && local14 != Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 + 1][local95]) {
						Static322.anIntArray445[local55] = local73 + 1 | 0x920000 | 0x53000000;
						Static70.anIntArray97[local55] = local95 | 0x930000;
						local55 = local55 + 1 & 0xFFF;
						Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 + 1][local95] = local14;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 - 1][local95] != local14 && (Static184.aByteArrayArrayArray3[Static152.anInt2600][local73][local95] & 0x4) == 0 && (Static184.aByteArrayArrayArray3[Static152.anInt2600][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static322.anIntArray445[local55] = 0x12000000 | 0xD20000 | local73 - 1;
							Static70.anIntArray97[local55] = local95 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 - 1][local95] = local14;
						}
						if (Static443.aByteArrayArrayArray17[Static152.anInt2600][local73][local95] != local14) {
							Static322.anIntArray445[local55] = local73 | 0x93000000 | 0xD20000;
							Static70.anIntArray97[local55] = local95 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static443.aByteArrayArrayArray17[Static152.anInt2600][local73][local95] = local14;
						}
						if (local73 + 1 < Static135.anInt2314 && Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 + 1][local95] != local14 && (Static184.aByteArrayArrayArray3[Static152.anInt2600][local73][local95] & 0x4) == 0 && (Static184.aByteArrayArrayArray3[Static152.anInt2600][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static322.anIntArray445[local55] = local73 + 1 | 0xD2000000 | 0x920000;
							Static70.anIntArray97[local55] = local95 | 0x930000;
							Static443.aByteArrayArrayArray17[Static152.anInt2600][local73 + 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static21.anIntArray29[arg2] != -1000000) {
				Static21.anIntArray29[arg2] += 10;
				Static264.anIntArray383[arg2] -= 50;
				Static199.anIntArray300[arg2] += 50;
				Static335.anIntArray80[arg2] += 50;
				Static174.anIntArray267[arg2] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!tf;B)V")
	public static void method5096(@OriginalArg(0) Class26_Sub2_Sub2_Sub1 arg0) {
		@Pc(15) Class1_Sub29 local15 = (Class1_Sub29) Static51.aClass27_9.method553((long) arg0.anInt7097);
		if (local15 == null) {
			Static409.method5547(0, arg0.aByte95, arg0, arg0.anIntArray590[0], arg0.anIntArray589[0], null, null);
		} else {
			local15.method3604();
		}
	}
}
