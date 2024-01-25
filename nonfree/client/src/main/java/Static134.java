import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!el", name = "g", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "[I")
	public static final int[] anIntArray163 = new int[8];

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public static int anInt2258 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI[[[Lclient!ch;III)Z")
	public static boolean method1840(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static482.anInt7692 & 0xFF);
		if (Static148.aByteArrayArrayArray4[Static91.anInt1705][arg3][arg4] == local14) {
			return false;
		} else if ((Static27.aByteArrayArrayArray1[Static91.anInt1705][arg3][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(39) byte local39 = 0;
			@Pc(46) int local46 = 0;
			Static101.anIntArray134[0] = arg3;
			@Pc(53) int local53 = local39 + 1;
			Static50.anIntArray85[0] = arg4;
			Static148.aByteArrayArrayArray4[Static91.anInt1705][arg3][arg4] = local14;
			while (local53 != local46) {
				@Pc(71) int local71 = Static101.anIntArray134[local46] & 0xFFFF;
				@Pc(79) int local79 = Static101.anIntArray134[local46] >> 16 & 0xFF;
				@Pc(87) int local87 = Static101.anIntArray134[local46] >> 24 & 0xFF;
				@Pc(93) int local93 = Static50.anIntArray85[local46] & 0xFFFF;
				@Pc(101) int local101 = Static50.anIntArray85[local46] >> 16 & 0xFF;
				local46 = local46 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static27.aByteArrayArrayArray1[Static91.anInt1705][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(126) boolean local126 = false;
				@Pc(168) int local168;
				@Pc(215) int local215;
				label231: for (@Pc(130) int local130 = Static91.anInt1705 + 1; local130 <= 3; local130++) {
					if ((Static27.aByteArrayArrayArray1[local130][local71][local93] & 0x8) == 0) {
						@Pc(314) Class13_Sub1_Sub1 local314;
						@Pc(326) int local326;
						@Pc(303) Class53 local303;
						@Pc(309) Class325 local309;
						if (local109 && arg2[local130][local71][local93] != null) {
							if (arg2[local130][local71][local93].aClass13_Sub1_Sub4_1 != null) {
								local168 = Static206.method2917(local79);
								if (local168 == arg2[local130][local71][local93].aClass13_Sub1_Sub4_1.aShort122 || arg2[local130][local71][local93].aClass13_Sub1_Sub4_2 != null && local168 == arg2[local130][local71][local93].aClass13_Sub1_Sub4_2.aShort122) {
									continue;
								}
								if (local87 != 0) {
									local215 = Static206.method2917(local87);
									if (local215 == arg2[local130][local71][local93].aClass13_Sub1_Sub4_1.aShort122 || arg2[local130][local71][local93].aClass13_Sub1_Sub4_2 != null && local215 == arg2[local130][local71][local93].aClass13_Sub1_Sub4_2.aShort122) {
										continue;
									}
								}
								if (local101 != 0) {
									local215 = Static206.method2917(local101);
									if (arg2[local130][local71][local93].aClass13_Sub1_Sub4_1.aShort122 == local215 || arg2[local130][local71][local93].aClass13_Sub1_Sub4_2 != null && local215 == arg2[local130][local71][local93].aClass13_Sub1_Sub4_2.aShort122) {
										continue;
									}
								}
							}
							local303 = arg2[local130][local71][local93];
							if (local303.aClass325_1 != null) {
								for (local309 = local303.aClass325_1; local309 != null; local309 = local309.aClass325_3) {
									local314 = local309.aClass13_Sub1_Sub1_1;
									if (local314 instanceof Interface25) {
										@Pc(320) Interface25 local320 = (Interface25) local314;
										local326 = local320.method8421();
										if (local326 == 21) {
											local326 = 19;
										}
										@Pc(335) int local335 = local320.method8420();
										@Pc(341) int local341 = local335 << 6 | local326;
										if (local79 == local341 || local87 != 0 && local341 == local87 || local101 != 0 && local341 == local101) {
											continue label231;
										}
									}
								}
							}
						}
						local303 = arg2[local130][local71][local93];
						if (local303 != null && local303.aClass325_1 != null) {
							for (local309 = local303.aClass325_1; local309 != null; local309 = local309.aClass325_3) {
								local314 = local309.aClass13_Sub1_Sub1_1;
								if (local314.aShort117 != local314.aShort120 || local314.aShort118 != local314.aShort119) {
									for (@Pc(407) int local407 = local314.aShort117; local407 <= local314.aShort120; local407++) {
										for (local326 = local314.aShort119; local326 <= local314.aShort118; local326++) {
											Static148.aByteArrayArrayArray4[local130][local407][local326] = local14;
										}
									}
								}
							}
						}
						Static148.aByteArrayArrayArray4[local130][local71][local93] = local14;
						local126 = true;
					}
				}
				if (local126) {
					local168 = Static314.aClass76Array2[Static91.anInt1705 + 1].method7396(local93, local71);
					if (local168 > Static410.anIntArray471[arg1]) {
						Static410.anIntArray471[arg1] = local168;
					}
					local215 = local71 << 9;
					if (local215 < Static100.anIntArray132[arg1]) {
						Static100.anIntArray132[arg1] = local215;
					} else if (Static179.anIntArray228[arg1] < local215) {
						Static179.anIntArray228[arg1] = local215;
					}
					@Pc(516) int local516 = local93 << 9;
					if (local516 < Static560.anIntArray627[arg1]) {
						Static560.anIntArray627[arg1] = local516;
					} else if (local516 > Static236.anIntArray267[arg1]) {
						Static236.anIntArray267[arg1] = local516;
					}
				}
				if (!local109) {
					if (local71 >= 1 && local14 != Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 - 1][local93]) {
						Static101.anIntArray134[local53] = local71 - 1 | 0x120000 | 0xD3000000;
						Static50.anIntArray85[local53] = local93 | 0x130000;
						local53 = local53 + 1 & 0xFFF;
						Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 - 1][local93] = local14;
					}
					@Pc(591) int local591 = ~Static162.anInt2911;
					local93++;
					if (local591 < ~local93) {
						if (local71 - 1 >= 0 && local14 != Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 - 1][local93] && (Static27.aByteArrayArrayArray1[Static91.anInt1705][local71][local93] & 0x4) == 0 && (Static27.aByteArrayArrayArray1[Static91.anInt1705][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static101.anIntArray134[local53] = local71 - 1 | 0x120000 | 0x52000000;
							Static50.anIntArray85[local53] = local93 | 0x130000;
							local53 = local53 + 1 & 0xFFF;
							Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 - 1][local93] = local14;
						}
						if (local14 != Static148.aByteArrayArrayArray4[Static91.anInt1705][local71][local93]) {
							Static101.anIntArray134[local53] = local71 | 0x520000 | 0x13000000;
							Static50.anIntArray85[local53] = local93 | 0x530000;
							Static148.aByteArrayArrayArray4[Static91.anInt1705][local71][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (Static228.anInt3704 > local71 + 1 && local14 != Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 + 1][local93] && (Static27.aByteArrayArrayArray1[Static91.anInt1705][local71][local93] & 0x4) == 0 && (Static27.aByteArrayArrayArray1[Static91.anInt1705][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static101.anIntArray134[local53] = 0x92000000 | 0x520000 | local71 + 1;
							Static50.anIntArray85[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 + 1][local93] = local14;
						}
					}
					local93--;
					if (Static228.anInt3704 > local71 + 1 && Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 + 1][local93] != local14) {
						Static101.anIntArray134[local53] = 0x53000000 | 0x920000 | local71 + 1;
						Static50.anIntArray85[local53] = local93 | 0x930000;
						Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 + 1][local93] = local14;
						local53 = local53 + 1 & 0xFFF;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && local14 != Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 - 1][local93] && (Static27.aByteArrayArrayArray1[Static91.anInt1705][local71][local93] & 0x4) == 0 && (Static27.aByteArrayArrayArray1[Static91.anInt1705][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static101.anIntArray134[local53] = 0x12000000 | 0xD20000 | local71 - 1;
							Static50.anIntArray85[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 - 1][local93] = local14;
						}
						if (Static148.aByteArrayArrayArray4[Static91.anInt1705][local71][local93] != local14) {
							Static101.anIntArray134[local53] = local71 | 0x93000000 | 0xD20000;
							Static50.anIntArray85[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static148.aByteArrayArrayArray4[Static91.anInt1705][local71][local93] = local14;
						}
						if (Static228.anInt3704 > local71 + 1 && local14 != Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 + 1][local93] && (Static27.aByteArrayArrayArray1[Static91.anInt1705][local71][local93] & 0x4) == 0 && (Static27.aByteArrayArrayArray1[Static91.anInt1705][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static101.anIntArray134[local53] = local71 + 1 | 0x920000 | 0xD2000000;
							Static50.anIntArray85[local53] = local93 | 0x930000;
							Static148.aByteArrayArrayArray4[Static91.anInt1705][local71 + 1][local93] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static410.anIntArray471[arg1] != -1000000) {
				Static410.anIntArray471[arg1] += 40;
				Static100.anIntArray132[arg1] -= 512;
				Static179.anIntArray228[arg1] += 512;
				Static236.anIntArray267[arg1] += 512;
				Static560.anIntArray627[arg1] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([IIBII)V")
	public static void method1841(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(12) int local12 = arg2 - 1;
		@Pc(16) int local16 = local12 - 7;
		while (local16 > arg1) {
			@Pc(20) int local20 = arg1 + 1;
			arg0[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg3;
			@Pc(50) int local50 = local45 + 1;
			arg0[local50] = arg3;
			arg1 = local50 + 1;
			arg0[arg1] = arg3;
		}
		while (arg1 < local12) {
			arg1++;
			arg0[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)Z")
	public static boolean method1848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
