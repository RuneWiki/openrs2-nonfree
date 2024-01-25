import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "[Lclient!l;")
	public static Class95[] aClass95Array14;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "[Lclient!fh;")
	public static final Class4_Sub9[] aClass4_Sub9Array1 = new Class4_Sub9[2048];

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Z")
	public static boolean aBoolean431 = false;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([[[Lclient!ev;ZIIII)Z")
	public static boolean method5092(@OriginalArg(0) Class75[][][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static129.anInt2333 & 0xFF);
		if (Static267.aByteArrayArrayArray14[Static68.anInt1387][arg2][arg3] == local14) {
			return false;
		} else if ((Static4.aByteArrayArrayArray1[Static68.anInt1387][arg2][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(56) byte local56 = 0;
			Static194.anIntArray544[0] = arg2;
			@Pc(62) int local62 = 0;
			@Pc(65) int local65 = local56 + 1;
			Static236.anIntArray323[0] = arg3;
			Static267.aByteArrayArrayArray14[Static68.anInt1387][arg2][arg3] = local14;
			while (local65 != local62) {
				@Pc(83) int local83 = Static194.anIntArray544[local62] & 0xFFFF;
				@Pc(91) int local91 = Static194.anIntArray544[local62] >> 16 & 0xFF;
				@Pc(99) int local99 = Static194.anIntArray544[local62] >> 24 & 0xFF;
				@Pc(105) int local105 = Static236.anIntArray323[local62] & 0xFFFF;
				@Pc(113) int local113 = Static236.anIntArray323[local62] >> 16 & 0xFF;
				local62 = local62 + 1 & 0xFFF;
				@Pc(121) boolean local121 = false;
				if ((Static4.aByteArrayArrayArray1[Static68.anInt1387][local83][local105] & 0x4) == 0) {
					local121 = true;
				}
				@Pc(138) boolean local138 = false;
				@Pc(180) int local180;
				@Pc(226) int local226;
				label231: for (@Pc(142) int local142 = Static68.anInt1387 + 1; local142 <= 3; local142++) {
					if ((Static4.aByteArrayArrayArray1[local142][local83][local105] & 0x8) == 0) {
						@Pc(333) Class8_Sub3 local333;
						@Pc(343) int local343;
						@Pc(322) Class75 local322;
						@Pc(328) Class251 local328;
						if (local121 && arg0[local142][local83][local105] != null) {
							if (arg0[local142][local83][local105].aClass8_Sub2_1 != null) {
								local180 = Static4.method68(local91);
								if (arg0[local142][local83][local105].aClass8_Sub2_1.anInt5215 == local180 || arg0[local142][local83][local105].aClass8_Sub2_2 != null && arg0[local142][local83][local105].aClass8_Sub2_2.anInt5215 == local180) {
									continue;
								}
								if (local99 != 0) {
									local226 = Static4.method68(local99);
									if (arg0[local142][local83][local105].aClass8_Sub2_1.anInt5215 == local226 || arg0[local142][local83][local105].aClass8_Sub2_2 != null && arg0[local142][local83][local105].aClass8_Sub2_2.anInt5215 == local226) {
										continue;
									}
								}
								if (local113 != 0) {
									local226 = Static4.method68(local113);
									if (local226 == arg0[local142][local83][local105].aClass8_Sub2_1.anInt5215 || arg0[local142][local83][local105].aClass8_Sub2_2 != null && arg0[local142][local83][local105].aClass8_Sub2_2.anInt5215 == local226) {
										continue;
									}
								}
							}
							local322 = arg0[local142][local83][local105];
							if (local322.aClass251_2 != null) {
								for (local328 = local322.aClass251_2; local328 != null; local328 = local328.aClass251_3) {
									local333 = local328.aClass8_Sub3_2;
									if (local333 instanceof Interface4) {
										@Pc(339) Interface4 local339 = (Interface4) local333;
										local343 = local339.method5606();
										@Pc(347) int local347 = local339.method5600();
										if (local343 == 21) {
											local343 = 19;
										}
										@Pc(358) int local358 = local347 << 6 | local343;
										if (local358 == local91 || local99 != 0 && local358 == local99 || local113 != 0 && local358 == local113) {
											continue label231;
										}
									}
								}
							}
						}
						local322 = arg0[local142][local83][local105];
						if (local322 != null && local322.aClass251_2 != null) {
							for (local328 = local322.aClass251_2; local328 != null; local328 = local328.aClass251_3) {
								local333 = local328.aClass8_Sub3_2;
								if (local333.aShort101 != local333.aShort100 || local333.aShort99 != local333.aShort98) {
									for (@Pc(426) int local426 = local333.aShort100; local426 <= local333.aShort101; local426++) {
										for (local343 = local333.aShort99; local343 <= local333.aShort98; local343++) {
											Static267.aByteArrayArrayArray14[local142][local426][local343] = local14;
										}
									}
								}
							}
						}
						local138 = true;
						Static267.aByteArrayArrayArray14[local142][local83][local105] = local14;
					}
				}
				if (local138) {
					local180 = Static278.aClass41Array3[Static68.anInt1387 + 1].l(local83, local105);
					if (local180 > Static54.anIntArray93[arg4]) {
						Static54.anIntArray93[arg4] = local180;
					}
					local226 = local83 << 7;
					if (local226 < Static356.anIntArray466[arg4]) {
						Static356.anIntArray466[arg4] = local226;
					} else if (Static221.anIntArray278[arg4] < local226) {
						Static221.anIntArray278[arg4] = local226;
					}
					@Pc(524) int local524 = local105 << 7;
					if (local524 < Static184.anIntArray259[arg4]) {
						Static184.anIntArray259[arg4] = local524;
					} else if (local524 > Static249.anIntArray573[arg4]) {
						Static249.anIntArray573[arg4] = local524;
					}
				}
				if (!local121) {
					if (local83 >= 1 && local14 != Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 - 1][local105]) {
						Static194.anIntArray544[local65] = local83 - 1 | 0x120000 | 0xD3000000;
						Static236.anIntArray323[local65] = local105 | 0x130000;
						local65 = local65 + 1 & 0xFFF;
						Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 - 1][local105] = local14;
					}
					local105++;
					if (local105 < Static282.anInt4644) {
						if (local83 - 1 >= 0 && Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 - 1][local105] != local14 && (Static4.aByteArrayArrayArray1[Static68.anInt1387][local83][local105] & 0x4) == 0 && (Static4.aByteArrayArrayArray1[Static68.anInt1387][local83 - 1][local105 - 1] & 0x4) == 0) {
							Static194.anIntArray544[local65] = local83 - 1 | 0x52000000 | 0x120000;
							Static236.anIntArray323[local65] = local105 | 0x130000;
							Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 - 1][local105] = local14;
							local65 = local65 + 1 & 0xFFF;
						}
						if (local14 != Static267.aByteArrayArrayArray14[Static68.anInt1387][local83][local105]) {
							Static194.anIntArray544[local65] = local83 | 0x520000 | 0x13000000;
							Static236.anIntArray323[local65] = local105 | 0x530000;
							local65 = local65 + 1 & 0xFFF;
							Static267.aByteArrayArrayArray14[Static68.anInt1387][local83][local105] = local14;
						}
						if (Static337.anInt5497 > local83 + 1 && local14 != Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 + 1][local105] && (Static4.aByteArrayArrayArray1[Static68.anInt1387][local83][local105] & 0x4) == 0 && (Static4.aByteArrayArrayArray1[Static68.anInt1387][local83 + 1][local105 - 1] & 0x4) == 0) {
							Static194.anIntArray544[local65] = 0x92000000 | 0x520000 | local83 + 1;
							Static236.anIntArray323[local65] = local105 | 0x530000;
							Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 + 1][local105] = local14;
							local65 = local65 + 1 & 0xFFF;
						}
					}
					local105--;
					if (local83 + 1 < Static337.anInt5497 && local14 != Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 + 1][local105]) {
						Static194.anIntArray544[local65] = local83 + 1 | 0x920000 | 0x53000000;
						Static236.anIntArray323[local65] = local105 | 0x930000;
						Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 + 1][local105] = local14;
						local65 = local65 + 1 & 0xFFF;
					}
					local105--;
					if (local105 >= 0) {
						if (local83 - 1 >= 0 && Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 - 1][local105] != local14 && (Static4.aByteArrayArrayArray1[Static68.anInt1387][local83][local105] & 0x4) == 0 && (Static4.aByteArrayArrayArray1[Static68.anInt1387][local83 - 1][local105 + 1] & 0x4) == 0) {
							Static194.anIntArray544[local65] = 0x12000000 | 0xD20000 | local83 - 1;
							Static236.anIntArray323[local65] = local105 | 0xD30000;
							Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 - 1][local105] = local14;
							local65 = local65 + 1 & 0xFFF;
						}
						if (Static267.aByteArrayArrayArray14[Static68.anInt1387][local83][local105] != local14) {
							Static194.anIntArray544[local65] = local83 | 0xD20000 | 0x93000000;
							Static236.anIntArray323[local65] = local105 | 0xD30000;
							Static267.aByteArrayArrayArray14[Static68.anInt1387][local83][local105] = local14;
							local65 = local65 + 1 & 0xFFF;
						}
						if (local83 + 1 < Static337.anInt5497 && Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 + 1][local105] != local14 && (Static4.aByteArrayArrayArray1[Static68.anInt1387][local83][local105] & 0x4) == 0 && (Static4.aByteArrayArrayArray1[Static68.anInt1387][local83 + 1][local105 + 1] & 0x4) == 0) {
							Static194.anIntArray544[local65] = local83 + 1 | 0x920000 | 0xD2000000;
							Static236.anIntArray323[local65] = local105 | 0x930000;
							local65 = local65 + 1 & 0xFFF;
							Static267.aByteArrayArrayArray14[Static68.anInt1387][local83 + 1][local105] = local14;
						}
					}
				}
			}
			if (Static54.anIntArray93[arg4] != -1000000) {
				Static54.anIntArray93[arg4] += 10;
				Static356.anIntArray466[arg4] -= 50;
				Static221.anIntArray278[arg4] += 50;
				Static249.anIntArray573[arg4] += 50;
				Static184.anIntArray259[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZZBII)Lclient!qn;")
	public static Class211 method5094(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(16) Class117 local16 = null;
		if (Static23.aClass142_7 != null) {
			local16 = new Class117(arg2, Static23.aClass142_7, Static309.aClass142Array1[arg2], 1000000);
		}
		Static339.aClass124_Sub1Array2[arg2] = Static75.aClass109_1.method2044(arg2, local16, Static140.aClass117_2);
		if (arg0) {
			Static339.aClass124_Sub1Array2[arg2].method5848();
		}
		return new Class211(Static339.aClass124_Sub1Array2[arg2], arg1, 1);
	}
}
