import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!vq", name = "I", descriptor = "Lclient!ph;")
	public static Class187 aClass187_126;

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "[Lclient!mv;")
	public static Class56_Sub1[] aClass56_Sub1Array2;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(II)V")
	public static void method5771(@OriginalArg(0) int arg0) {
		@Pc(13) Class10_Sub1_Sub17 local13 = Static154.method2630(7, arg0);
		local13.method5346();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[[[Lclient!ak;ZIZI)Z")
	public static boolean method5772(@OriginalArg(0) int arg0, @OriginalArg(1) Class11[][][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) byte local19 = arg2 ? 1 : (byte) (Static186.anInt3747 & 0xFF);
		if (Static255.aByteArrayArrayArray16[Static96.anInt1983][arg4][arg0] == local19) {
			return false;
		} else if ((Static181.aByteArrayArrayArray15[Static96.anInt1983][arg4][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			Static19.anIntArray27[0] = arg4;
			@Pc(53) int local53 = local44 + 1;
			Static2.anIntArray1[0] = arg0;
			Static255.aByteArrayArrayArray16[Static96.anInt1983][arg4][arg0] = local19;
			while (local53 != local46) {
				@Pc(71) int local71 = Static19.anIntArray27[local46] & 0xFFFF;
				@Pc(79) int local79 = Static19.anIntArray27[local46] >> 16 & 0xFF;
				@Pc(87) int local87 = Static19.anIntArray27[local46] >> 24 & 0xFF;
				@Pc(93) int local93 = Static2.anIntArray1[local46] & 0xFFFF;
				@Pc(101) int local101 = Static2.anIntArray1[local46] >> 16 & 0xFF;
				local46 = local46 + 1 & 0xFFF;
				@Pc(109) boolean local109 = false;
				if ((Static181.aByteArrayArrayArray15[Static96.anInt1983][local71][local93] & 0x4) == 0) {
					local109 = true;
				}
				@Pc(123) boolean local123 = false;
				@Pc(165) int local165;
				@Pc(211) int local211;
				label231: for (@Pc(127) int local127 = Static96.anInt1983 + 1; local127 <= 3; local127++) {
					if ((Static181.aByteArrayArrayArray15[local127][local71][local93] & 0x8) == 0) {
						@Pc(309) Class24_Sub3 local309;
						@Pc(319) int local319;
						@Pc(298) Class11 local298;
						@Pc(304) Class1 local304;
						if (local109 && arg1[local127][local71][local93] != null) {
							if (arg1[local127][local71][local93].aClass24_Sub5_1 != null) {
								local165 = Static236.method3462(local79);
								if (local165 == arg1[local127][local71][local93].aClass24_Sub5_1.anInt7223 || arg1[local127][local71][local93].aClass24_Sub5_2 != null && local165 == arg1[local127][local71][local93].aClass24_Sub5_2.anInt7223) {
									continue;
								}
								if (local87 != 0) {
									local211 = Static236.method3462(local87);
									if (arg1[local127][local71][local93].aClass24_Sub5_1.anInt7223 == local211 || arg1[local127][local71][local93].aClass24_Sub5_2 != null && arg1[local127][local71][local93].aClass24_Sub5_2.anInt7223 == local211) {
										continue;
									}
								}
								if (local101 != 0) {
									local211 = Static236.method3462(local101);
									if (local211 == arg1[local127][local71][local93].aClass24_Sub5_1.anInt7223 || arg1[local127][local71][local93].aClass24_Sub5_2 != null && arg1[local127][local71][local93].aClass24_Sub5_2.anInt7223 == local211) {
										continue;
									}
								}
							}
							local298 = arg1[local127][local71][local93];
							if (local298.aClass1_3 != null) {
								for (local304 = local298.aClass1_3; local304 != null; local304 = local304.aClass1_1) {
									local309 = local304.aClass24_Sub3_1;
									if (local309 instanceof Interface10) {
										@Pc(315) Interface10 local315 = (Interface10) local309;
										local319 = local315.method5702();
										@Pc(323) int local323 = local315.method5705();
										if (local319 == 21) {
											local319 = 19;
										}
										@Pc(334) int local334 = local323 << 6 | local319;
										if (local334 == local79 || local87 != 0 && local334 == local87 || local101 != 0 && local101 == local334) {
											continue label231;
										}
									}
								}
							}
						}
						local298 = arg1[local127][local71][local93];
						if (local298 != null && local298.aClass1_3 != null) {
							for (local304 = local298.aClass1_3; local304 != null; local304 = local304.aClass1_1) {
								local309 = local304.aClass24_Sub3_1;
								if (local309.aShort107 != local309.aShort106 || local309.aShort104 != local309.aShort105) {
									for (@Pc(396) int local396 = local309.aShort107; local396 <= local309.aShort106; local396++) {
										for (local319 = local309.aShort105; local319 <= local309.aShort104; local319++) {
											Static255.aByteArrayArrayArray16[local127][local396][local319] = local19;
										}
									}
								}
							}
						}
						Static255.aByteArrayArrayArray16[local127][local71][local93] = local19;
						local123 = true;
					}
				}
				if (local123) {
					local165 = Static332.aClass154Array3[Static96.anInt1983 + 1].ua(local71, local93);
					if (Static328.anIntArray701[arg3] < local165) {
						Static328.anIntArray701[arg3] = local165;
					}
					local211 = local71 << 7;
					@Pc(480) int local480 = local93 << 7;
					if (Static372.anIntArray624[arg3] > local211) {
						Static372.anIntArray624[arg3] = local211;
					} else if (local211 > Static64.anIntArray96[arg3]) {
						Static64.anIntArray96[arg3] = local211;
					}
					if (Static370.anIntArray619[arg3] > local480) {
						Static370.anIntArray619[arg3] = local480;
					} else if (local480 > Static314.anIntArray517[arg3]) {
						Static314.anIntArray517[arg3] = local480;
					}
				}
				if (!local109) {
					if (local71 >= 1 && local19 != Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 - 1][local93]) {
						Static19.anIntArray27[local53] = local71 - 1 | 0x120000 | 0xD3000000;
						Static2.anIntArray1[local53] = local93 | 0x130000;
						Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 - 1][local93] = local19;
						local53 = local53 + 1 & 0xFFF;
					}
					local93++;
					if (local93 < Static17.anInt315) {
						if (local71 - 1 >= 0 && Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 - 1][local93] != local19 && (Static181.aByteArrayArrayArray15[Static96.anInt1983][local71][local93] & 0x4) == 0 && (Static181.aByteArrayArrayArray15[Static96.anInt1983][local71 - 1][local93 - 1] & 0x4) == 0) {
							Static19.anIntArray27[local53] = local71 - 1 | 0x52000000 | 0x120000;
							Static2.anIntArray1[local53] = local93 | 0x130000;
							local53 = local53 + 1 & 0xFFF;
							Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 - 1][local93] = local19;
						}
						if (local19 != Static255.aByteArrayArrayArray16[Static96.anInt1983][local71][local93]) {
							Static19.anIntArray27[local53] = local71 | 0x520000 | 0x13000000;
							Static2.anIntArray1[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static255.aByteArrayArrayArray16[Static96.anInt1983][local71][local93] = local19;
						}
						if (local71 + 1 < Static2.anInt7 && local19 != Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 + 1][local93] && (Static181.aByteArrayArrayArray15[Static96.anInt1983][local71][local93] & 0x4) == 0 && (Static181.aByteArrayArrayArray15[Static96.anInt1983][local71 + 1][local93 - 1] & 0x4) == 0) {
							Static19.anIntArray27[local53] = 0x92000000 | 0x520000 | local71 + 1;
							Static2.anIntArray1[local53] = local93 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 + 1][local93] = local19;
						}
					}
					local93--;
					if (local71 + 1 < Static2.anInt7 && local19 != Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 + 1][local93]) {
						Static19.anIntArray27[local53] = local71 + 1 | 0x920000 | 0x53000000;
						Static2.anIntArray1[local53] = local93 | 0x930000;
						local53 = local53 + 1 & 0xFFF;
						Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 + 1][local93] = local19;
					}
					local93--;
					if (local93 >= 0) {
						if (local71 - 1 >= 0 && local19 != Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 - 1][local93] && (Static181.aByteArrayArrayArray15[Static96.anInt1983][local71][local93] & 0x4) == 0 && (Static181.aByteArrayArrayArray15[Static96.anInt1983][local71 - 1][local93 + 1] & 0x4) == 0) {
							Static19.anIntArray27[local53] = local71 - 1 | 0xD20000 | 0x12000000;
							Static2.anIntArray1[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 - 1][local93] = local19;
						}
						if (local19 != Static255.aByteArrayArrayArray16[Static96.anInt1983][local71][local93]) {
							Static19.anIntArray27[local53] = local71 | 0x93000000 | 0xD20000;
							Static2.anIntArray1[local53] = local93 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static255.aByteArrayArrayArray16[Static96.anInt1983][local71][local93] = local19;
						}
						if (Static2.anInt7 > local71 + 1 && Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 + 1][local93] != local19 && (Static181.aByteArrayArrayArray15[Static96.anInt1983][local71][local93] & 0x4) == 0 && (Static181.aByteArrayArrayArray15[Static96.anInt1983][local71 + 1][local93 + 1] & 0x4) == 0) {
							Static19.anIntArray27[local53] = local71 + 1 | 0xD2000000 | 0x920000;
							Static2.anIntArray1[local53] = local93 | 0x930000;
							Static255.aByteArrayArrayArray16[Static96.anInt1983][local71 + 1][local93] = local19;
							local53 = local53 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static328.anIntArray701[arg3] != -1000000) {
				Static328.anIntArray701[arg3] += 10;
				Static372.anIntArray624[arg3] -= 50;
				Static64.anIntArray96[arg3] += 50;
				Static314.anIntArray517[arg3] += 50;
				Static370.anIntArray619[arg3] -= 50;
			}
			return true;
		}
	}
}
