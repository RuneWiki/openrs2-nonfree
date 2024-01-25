import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bk", name = "eb", descriptor = "Lclient!we;")
	public static Class259 aClass259_1;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)V")
	public static void method783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static139.method2522(9, arg2);
		local13.method1570();
		local13.anInt1933 = arg0;
		local13.anInt1930 = arg1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI[[[Lclient!tg;IZI)Z")
	public static boolean method785(@OriginalArg(1) int arg0, @OriginalArg(2) Class217[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(17) byte local17 = arg3 ? 1 : (byte) (Static164.anInt3507 & 0xFF);
		if (local17 == Static344.aByteArrayArrayArray16[Static124.anInt2688][arg0][arg2]) {
			return false;
		} else if ((Static325.aByteArrayArrayArray15[Static124.anInt2688][arg0][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			Static375.anIntArray473[0] = arg0;
			@Pc(58) int local58 = local49 + 1;
			Static16.anIntArray40[0] = arg2;
			Static344.aByteArrayArrayArray16[Static124.anInt2688][arg0][arg2] = local17;
			while (local58 != local51) {
				@Pc(75) int local75 = Static375.anIntArray473[local51] & 0xFFFF;
				@Pc(83) int local83 = Static375.anIntArray473[local51] >> 16 & 0xFF;
				@Pc(91) int local91 = Static375.anIntArray473[local51] >> 24 & 0xFF;
				@Pc(97) int local97 = Static16.anIntArray40[local51] & 0xFFFF;
				@Pc(105) int local105 = Static16.anIntArray40[local51] >> 16 & 0xFF;
				local51 = local51 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static325.aByteArrayArrayArray15[Static124.anInt2688][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(171) int local171;
				@Pc(216) int local216;
				label231: for (@Pc(134) int local134 = Static124.anInt2688 + 1; local134 <= 3; local134++) {
					if ((Static325.aByteArrayArrayArray15[local134][local75][local97] & 0x8) == 0) {
						@Pc(315) Class1_Sub3 local315;
						@Pc(325) int local325;
						@Pc(305) Class217 local305;
						@Pc(311) Class182 local311;
						if (local113 && arg1[local134][local75][local97] != null) {
							if (arg1[local134][local75][local97].aClass1_Sub5_2 != null) {
								local171 = Static97.method1718(local83);
								if (arg1[local134][local75][local97].aClass1_Sub5_2.anInt6407 == local171 || arg1[local134][local75][local97].aClass1_Sub5_3 != null && local171 == arg1[local134][local75][local97].aClass1_Sub5_3.anInt6407) {
									continue;
								}
								if (local91 != 0) {
									local216 = Static97.method1718(local91);
									if (local216 == arg1[local134][local75][local97].aClass1_Sub5_2.anInt6407 || arg1[local134][local75][local97].aClass1_Sub5_3 != null && local216 == arg1[local134][local75][local97].aClass1_Sub5_3.anInt6407) {
										continue;
									}
								}
								if (local105 != 0) {
									local216 = Static97.method1718(local105);
									if (local216 == arg1[local134][local75][local97].aClass1_Sub5_2.anInt6407 || arg1[local134][local75][local97].aClass1_Sub5_3 != null && arg1[local134][local75][local97].aClass1_Sub5_3.anInt6407 == local216) {
										continue;
									}
								}
							}
							local305 = arg1[local134][local75][local97];
							if (local305.aClass182_3 != null) {
								for (local311 = local305.aClass182_3; local311 != null; local311 = local311.aClass182_2) {
									local315 = local311.aClass1_Sub3_2;
									if (local315 instanceof Interface12) {
										@Pc(321) Interface12 local321 = (Interface12) local315;
										local325 = local321.method5848();
										@Pc(329) int local329 = local321.method5851();
										if (local325 == 21) {
											local325 = 19;
										}
										@Pc(340) int local340 = local325 | local329 << 6;
										if (local83 == local340 || local91 != 0 && local340 == local91 || local105 != 0 && local340 == local105) {
											continue label231;
										}
									}
								}
							}
						}
						local305 = arg1[local134][local75][local97];
						if (local305 != null && local305.aClass182_3 != null) {
							for (local311 = local305.aClass182_3; local311 != null; local311 = local311.aClass182_2) {
								local315 = local311.aClass1_Sub3_2;
								if (local315.aShort180 != local315.aShort181 || local315.aShort178 != local315.aShort179) {
									for (@Pc(403) int local403 = local315.aShort181; local403 <= local315.aShort180; local403++) {
										for (local325 = local315.aShort179; local325 <= local315.aShort178; local325++) {
											Static344.aByteArrayArrayArray16[local134][local403][local325] = local17;
										}
									}
								}
							}
						}
						local130 = true;
						Static344.aByteArrayArrayArray16[local134][local75][local97] = local17;
					}
				}
				if (local130) {
					local171 = Static120.aClass64Array1[Static124.anInt2688 + 1].I(local75, local97);
					if (Static116.anIntArray477[arg4] < local171) {
						Static116.anIntArray477[arg4] = local171;
					}
					local216 = local75 << 7;
					if (local216 < Static158.anIntArray257[arg4]) {
						Static158.anIntArray257[arg4] = local216;
					} else if (Static348.anIntArray563[arg4] < local216) {
						Static348.anIntArray563[arg4] = local216;
					}
					@Pc(500) int local500 = local97 << 7;
					if (local500 < Static83.anIntArray161[arg4]) {
						Static83.anIntArray161[arg4] = local500;
					} else if (Static430.anIntArray518[arg4] < local500) {
						Static430.anIntArray518[arg4] = local500;
					}
				}
				if (!local113) {
					if (local75 >= 1 && local17 != Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 - 1][local97]) {
						Static375.anIntArray473[local58] = local75 - 1 | 0x120000 | 0xD3000000;
						Static16.anIntArray40[local58] = local97 | 0x130000;
						Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 - 1][local97] = local17;
						local58 = local58 + 1 & 0xFFF;
					}
					@Pc(578) int local578 = ~Static127.anInt2696;
					local97++;
					if (local578 < ~local97) {
						if (local75 - 1 >= 0 && local17 != Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 - 1][local97] && (Static325.aByteArrayArrayArray15[Static124.anInt2688][local75][local97] & 0x4) == 0 && (Static325.aByteArrayArrayArray15[Static124.anInt2688][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static375.anIntArray473[local58] = local75 - 1 | 0x120000 | 0x52000000;
							Static16.anIntArray40[local58] = local97 | 0x130000;
							Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 - 1][local97] = local17;
							local58 = local58 + 1 & 0xFFF;
						}
						if (Static344.aByteArrayArrayArray16[Static124.anInt2688][local75][local97] != local17) {
							Static375.anIntArray473[local58] = 0x13000000 | 0x520000 | local75;
							Static16.anIntArray40[local58] = local97 | 0x530000;
							local58 = local58 + 1 & 0xFFF;
							Static344.aByteArrayArrayArray16[Static124.anInt2688][local75][local97] = local17;
						}
						if (Static399.anInt6923 > local75 + 1 && Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 + 1][local97] != local17 && (Static325.aByteArrayArrayArray15[Static124.anInt2688][local75][local97] & 0x4) == 0 && (Static325.aByteArrayArrayArray15[Static124.anInt2688][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static375.anIntArray473[local58] = local75 + 1 | 0x520000 | 0x92000000;
							Static16.anIntArray40[local58] = local97 | 0x530000;
							Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 + 1][local97] = local17;
							local58 = local58 + 1 & 0xFFF;
						}
					}
					local97--;
					if (local75 + 1 < Static399.anInt6923 && local17 != Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 + 1][local97]) {
						Static375.anIntArray473[local58] = 0x53000000 | 0x920000 | local75 + 1;
						Static16.anIntArray40[local58] = local97 | 0x930000;
						local58 = local58 + 1 & 0xFFF;
						Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 + 1][local97] = local17;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && local17 != Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 - 1][local97] && (Static325.aByteArrayArrayArray15[Static124.anInt2688][local75][local97] & 0x4) == 0 && (Static325.aByteArrayArrayArray15[Static124.anInt2688][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static375.anIntArray473[local58] = local75 - 1 | 0xD20000 | 0x12000000;
							Static16.anIntArray40[local58] = local97 | 0xD30000;
							local58 = local58 + 1 & 0xFFF;
							Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 - 1][local97] = local17;
						}
						if (Static344.aByteArrayArrayArray16[Static124.anInt2688][local75][local97] != local17) {
							Static375.anIntArray473[local58] = 0x93000000 | 0xD20000 | local75;
							Static16.anIntArray40[local58] = local97 | 0xD30000;
							Static344.aByteArrayArrayArray16[Static124.anInt2688][local75][local97] = local17;
							local58 = local58 + 1 & 0xFFF;
						}
						if (local75 + 1 < Static399.anInt6923 && Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 + 1][local97] != local17 && (Static325.aByteArrayArrayArray15[Static124.anInt2688][local75][local97] & 0x4) == 0 && (Static325.aByteArrayArrayArray15[Static124.anInt2688][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static375.anIntArray473[local58] = local75 + 1 | 0x920000 | 0xD2000000;
							Static16.anIntArray40[local58] = local97 | 0x930000;
							Static344.aByteArrayArrayArray16[Static124.anInt2688][local75 + 1][local97] = local17;
							local58 = local58 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static116.anIntArray477[arg4] != -1000000) {
				Static116.anIntArray477[arg4] += 10;
				Static158.anIntArray257[arg4] -= 50;
				Static348.anIntArray563[arg4] += 50;
				Static430.anIntArray518[arg4] += 50;
				Static83.anIntArray161[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method786(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static137.method2515("\n", arg0, "%0a"));
	}
}
