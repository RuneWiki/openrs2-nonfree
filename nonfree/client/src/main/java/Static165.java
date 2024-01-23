import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!mg", name = "Y", descriptor = "Z")
	public static boolean aBoolean228 = false;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBZI[[[Lclient!kb;I)Z")
	public static boolean method2521(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub19[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static152.anInt2841 & 0xFF);
		if (local14 == Static119.aByteArrayArrayArray21[Static159.anInt2978][arg0][arg2]) {
			return false;
		} else if ((Static242.aByteArrayArrayArray23[Static159.anInt2978][arg0][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(50) byte local50 = 0;
			Static129.anIntArray454[0] = arg0;
			@Pc(56) int local56 = 0;
			@Pc(59) int local59 = local50 + 1;
			Static283.anIntArray661[0] = arg2;
			Static119.aByteArrayArrayArray21[Static159.anInt2978][arg0][arg2] = local14;
			while (local59 != local56) {
				@Pc(82) int local82 = Static129.anIntArray454[local56] & 0xFFFF;
				@Pc(90) int local90 = Static129.anIntArray454[local56] >> 16 & 0xFF;
				@Pc(98) int local98 = Static129.anIntArray454[local56] >> 24 & 0xFF;
				@Pc(106) int local106 = Static283.anIntArray661[local56] >> 16 & 0xFF;
				@Pc(108) boolean local108 = false;
				@Pc(114) int local114 = Static283.anIntArray661[local56] & 0xFFFF;
				local56 = local56 + 1 & 0xFFF;
				@Pc(122) boolean local122 = false;
				if ((Static242.aByteArrayArrayArray23[Static159.anInt2978][local82][local114] & 0x4) == 0) {
					local108 = true;
				}
				@Pc(140) int local140;
				@Pc(182) int local182;
				label243: for (local140 = Static159.anInt2978 + 1; local140 <= 3; local140++) {
					if ((Static242.aByteArrayArrayArray23[local140][local82][local114] & 0x8) == 0) {
						@Pc(218) int local218;
						@Pc(358) int local358;
						if (local108 && arg3[local140][local82][local114] != null) {
							if (arg3[local140][local82][local114].aClass125_1 != null) {
								local182 = Static174.method2634(local90);
								if (local182 == arg3[local140][local82][local114].aClass125_1.anInt3531 || local182 == arg3[local140][local82][local114].aClass125_1.anInt3535) {
									continue;
								}
								if (local98 != 0) {
									local218 = Static174.method2634(local98);
									if (arg3[local140][local82][local114].aClass125_1.anInt3531 == local218 || arg3[local140][local82][local114].aClass125_1.anInt3535 == local218) {
										continue;
									}
								}
								if (local106 != 0) {
									local218 = Static174.method2634(local106);
									if (arg3[local140][local82][local114].aClass125_1.anInt3531 == local218 || arg3[local140][local82][local114].aClass125_1.anInt3535 == local218) {
										continue;
									}
								}
							}
							if (arg3[local140][local82][local114].aClass124Array2 != null) {
								for (local182 = 0; local182 < arg3[local140][local82][local114].anInt2570; local182++) {
									local218 = (int) (arg3[local140][local82][local114].aClass124Array2[local182].aLong114 >> 14 & 0x3FL);
									if (local218 == 21) {
										local218 = 19;
									}
									@Pc(352) int local352 = (int) (arg3[local140][local82][local114].aClass124Array2[local182].aLong114 >> 20 & 0x3L);
									local358 = local352 << 6 | local218;
									if (local358 == local90 || local98 != 0 && local98 == local358 || local106 != 0 && local106 == local358) {
										continue label243;
									}
								}
							}
						}
						local122 = true;
						@Pc(400) Class1_Sub19 local400 = arg3[local140][local82][local114];
						if (local400 != null && local400.anInt2570 > 0) {
							for (local218 = 0; local218 < local400.anInt2570; local218++) {
								@Pc(418) Class124 local418 = local400.aClass124Array2[local218];
								if (local418.anInt3416 != local418.anInt3401 || local418.anInt3406 != local418.anInt3411) {
									for (local358 = local418.anInt3416; local358 <= local418.anInt3401; local358++) {
										for (@Pc(446) int local446 = local418.anInt3411; local446 <= local418.anInt3406; local446++) {
											Static119.aByteArrayArrayArray21[local140][local358][local446] = local14;
										}
									}
								}
							}
						}
						Static119.aByteArrayArrayArray21[local140][local82][local114] = local14;
					}
				}
				if (local122) {
					local140 = local82 << 7;
					local182 = local114 << 7;
					if (Static163.anIntArrayArrayArray16[Static159.anInt2978 + 1][local82][local114] > Static98.anIntArray251[arg4]) {
						Static98.anIntArray251[arg4] = Static163.anIntArrayArrayArray16[Static159.anInt2978 + 1][local82][local114];
					}
					if (local140 < Static140.anIntArray316[arg4]) {
						Static140.anIntArray316[arg4] = local140;
					} else if (Static275.anIntArray650[arg4] < local140) {
						Static275.anIntArray650[arg4] = local140;
					}
					if (local182 < Static265.anIntArray618[arg4]) {
						Static265.anIntArray618[arg4] = local182;
					} else if (Static107.anIntArray265[arg4] < local182) {
						Static107.anIntArray265[arg4] = local182;
					}
				}
				if (!local108) {
					if (local82 >= 1 && Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 - 1][local114] != local14) {
						Static129.anIntArray454[local59] = 0xD3000000 | 0x120000 | local82 - 1;
						Static283.anIntArray661[local59] = local114 | 0x130000;
						local59 = local59 + 1 & 0xFFF;
						Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 - 1][local114] = local14;
					}
					local114++;
					if (local114 < 104) {
						if (local82 - 1 >= 0 && Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 - 1][local114] != local14 && (Static242.aByteArrayArrayArray23[Static159.anInt2978][local82][local114] & 0x4) == 0 && (Static242.aByteArrayArrayArray23[Static159.anInt2978][local82 - 1][local114 - 1] & 0x4) == 0) {
							Static129.anIntArray454[local59] = local82 - 1 | 0x120000 | 0x52000000;
							Static283.anIntArray661[local59] = local114 | 0x130000;
							Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 - 1][local114] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
						if (Static119.aByteArrayArrayArray21[Static159.anInt2978][local82][local114] != local14) {
							Static129.anIntArray454[local59] = local82 | 0x13000000 | 0x520000;
							Static283.anIntArray661[local59] = local114 | 0x530000;
							Static119.aByteArrayArrayArray21[Static159.anInt2978][local82][local114] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
						if (local82 + 1 < 104 && local14 != Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 + 1][local114] && (Static242.aByteArrayArrayArray23[Static159.anInt2978][local82][local114] & 0x4) == 0 && (Static242.aByteArrayArrayArray23[Static159.anInt2978][local82 + 1][local114 - 1] & 0x4) == 0) {
							Static129.anIntArray454[local59] = local82 + 1 | 0x520000 | 0x92000000;
							Static283.anIntArray661[local59] = local114 | 0x530000;
							Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 + 1][local114] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
					}
					local114--;
					if (local82 + 1 < 104 && local14 != Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 + 1][local114]) {
						Static129.anIntArray454[local59] = local82 + 1 | 0x920000 | 0x53000000;
						Static283.anIntArray661[local59] = local114 | 0x930000;
						Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 + 1][local114] = local14;
						local59 = local59 + 1 & 0xFFF;
					}
					local114--;
					if (local114 >= 0) {
						if (local82 - 1 >= 0 && local14 != Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 - 1][local114] && (Static242.aByteArrayArrayArray23[Static159.anInt2978][local82][local114] & 0x4) == 0 && (Static242.aByteArrayArrayArray23[Static159.anInt2978][local82 - 1][local114 + 1] & 0x4) == 0) {
							Static129.anIntArray454[local59] = local82 - 1 | 0x12000000 | 0xD20000;
							Static283.anIntArray661[local59] = local114 | 0xD30000;
							Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 - 1][local114] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
						if (Static119.aByteArrayArrayArray21[Static159.anInt2978][local82][local114] != local14) {
							Static129.anIntArray454[local59] = local82 | 0xD20000 | 0x93000000;
							Static283.anIntArray661[local59] = local114 | 0xD30000;
							Static119.aByteArrayArrayArray21[Static159.anInt2978][local82][local114] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
						if (local82 + 1 < 104 && local14 != Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 + 1][local114] && (Static242.aByteArrayArrayArray23[Static159.anInt2978][local82][local114] & 0x4) == 0 && (Static242.aByteArrayArrayArray23[Static159.anInt2978][local82 + 1][local114 + 1] & 0x4) == 0) {
							Static129.anIntArray454[local59] = 0xD2000000 | 0x920000 | local82 + 1;
							Static283.anIntArray661[local59] = local114 | 0x930000;
							Static119.aByteArrayArrayArray21[Static159.anInt2978][local82 + 1][local114] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static98.anIntArray251[arg4] != -1000000) {
				Static98.anIntArray251[arg4] += 10;
				Static140.anIntArray316[arg4] -= 50;
				Static275.anIntArray650[arg4] += 50;
				Static107.anIntArray265[arg4] += 50;
				Static265.anIntArray618[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!qi;)V")
	public static void method2523(@OriginalArg(1) Class6_Sub6_Sub1 arg0) {
		for (@Pc(16) Class1_Sub6 local16 = (Class1_Sub6) Static196.aClass69_22.method1636(); local16 != null; local16 = (Class1_Sub6) Static196.aClass69_22.method1631()) {
			if (local16.aClass6_Sub6_Sub1_1 == arg0) {
				if (local16.aClass1_Sub8_Sub1_1 != null) {
					Static28.aClass1_Sub8_Sub3_1.method2409(local16.aClass1_Sub8_Sub1_1);
					local16.aClass1_Sub8_Sub1_1 = null;
				}
				local16.method4534();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)Z")
	public static boolean method2524(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8;
	}

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "(I)V")
	public static void method2526() {
		Static133.aClass31_21.method850();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)I")
	public static int method2527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(24) int local24 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local24;
		}
		return arg1;
	}
}
