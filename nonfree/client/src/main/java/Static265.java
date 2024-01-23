import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public static int anInt5507;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString201 = "Connecting to update server";

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString202 = null;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)I")
	public static int method4456() {
		return Static141.anInt2718;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZII[[[Lclient!qo;II)Z")
	public static boolean method4457(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub25[][][] arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static289.anInt5783 & 0xFF);
		if (Static126.aByteArrayArrayArray15[Static99.anInt1826][arg2][arg4] == local14) {
			return false;
		} else if ((Static41.aByteArrayArrayArray2[Static99.anInt1826][arg2][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(49) byte local49 = 0;
			Static76.anIntArray141[0] = arg2;
			@Pc(56) int local56 = local49 + 1;
			Static35.anIntArray55[0] = arg4;
			@Pc(60) int local60 = 0;
			Static126.aByteArrayArrayArray15[Static99.anInt1826][arg2][arg4] = local14;
			while (local60 != local56) {
				@Pc(77) int local77 = Static76.anIntArray141[local60] & 0xFFFF;
				@Pc(85) int local85 = Static76.anIntArray141[local60] >> 24 & 0xFF;
				@Pc(93) int local93 = Static76.anIntArray141[local60] >> 16 & 0xFF;
				@Pc(99) int local99 = Static35.anIntArray55[local60] & 0xFFFF;
				@Pc(101) boolean local101 = false;
				@Pc(109) int local109 = Static35.anIntArray55[local60] >> 16 & 0xFF;
				local60 = local60 + 1 & 0xFFF;
				@Pc(117) boolean local117 = false;
				if ((Static41.aByteArrayArrayArray2[Static99.anInt1826][local77][local99] & 0x4) == 0) {
					local117 = true;
				}
				@Pc(134) int local134;
				@Pc(175) int local175;
				label236: for (local134 = Static99.anInt1826 + 1; local134 <= 3; local134++) {
					if ((Static41.aByteArrayArrayArray2[local134][local77][local99] & 0x8) == 0) {
						@Pc(209) int local209;
						@Pc(345) int local345;
						if (local117 && arg3[local134][local77][local99] != null) {
							if (arg3[local134][local77][local99].aClass19_1 != null) {
								local175 = Static178.method2934(local93);
								if (local175 == arg3[local134][local77][local99].aClass19_1.anInt472 || arg3[local134][local77][local99].aClass19_1.anInt480 == local175) {
									continue;
								}
								if (local85 != 0) {
									local209 = Static178.method2934(local85);
									if (local209 == arg3[local134][local77][local99].aClass19_1.anInt472 || local209 == arg3[local134][local77][local99].aClass19_1.anInt480) {
										continue;
									}
								}
								if (local109 != 0) {
									local209 = Static178.method2934(local109);
									if (local209 == arg3[local134][local77][local99].aClass19_1.anInt472 || local209 == arg3[local134][local77][local99].aClass19_1.anInt480) {
										continue;
									}
								}
							}
							if (arg3[local134][local77][local99].aClass85Array3 != null) {
								for (local175 = 0; local175 < arg3[local134][local77][local99].anInt4483; local175++) {
									local209 = (int) (arg3[local134][local77][local99].aClass85Array3[local175].aLong107 >> 14 & 0x3FL);
									if (local209 == 21) {
										local209 = 19;
									}
									@Pc(339) int local339 = (int) (arg3[local134][local77][local99].aClass85Array3[local175].aLong107 >> 20 & 0x3L);
									local345 = local209 | local339 << 6;
									if (local345 == local93 || local85 != 0 && local345 == local85 || local109 != 0 && local109 == local345) {
										continue label236;
									}
								}
							}
						}
						local101 = true;
						@Pc(379) Class3_Sub25 local379 = arg3[local134][local77][local99];
						if (local379 != null && local379.anInt4483 > 0) {
							for (local209 = 0; local209 < local379.anInt4483; local209++) {
								@Pc(396) Class85 local396 = local379.aClass85Array3[local209];
								if (local396.anInt2474 != local396.anInt2482 || local396.anInt2480 != local396.anInt2478) {
									for (local345 = local396.anInt2482; local345 <= local396.anInt2474; local345++) {
										for (@Pc(428) int local428 = local396.anInt2480; local428 <= local396.anInt2478; local428++) {
											Static126.aByteArrayArrayArray15[local134][local345][local428] = local14;
										}
									}
								}
							}
						}
						Static126.aByteArrayArrayArray15[local134][local77][local99] = local14;
					}
				}
				if (local101) {
					if (Static256.anIntArrayArrayArray14[Static99.anInt1826 + 1][local77][local99] > Static174.anIntArray398[arg1]) {
						Static174.anIntArray398[arg1] = Static256.anIntArrayArrayArray14[Static99.anInt1826 + 1][local77][local99];
					}
					local134 = local77 << 7;
					local175 = local99 << 7;
					if (local134 < Static100.anIntArray184[arg1]) {
						Static100.anIntArray184[arg1] = local134;
					} else if (Static286.anIntArray569[arg1] < local134) {
						Static286.anIntArray569[arg1] = local134;
					}
					if (Static11.anIntArray541[arg1] > local175) {
						Static11.anIntArray541[arg1] = local175;
					} else if (Static64.anIntArray110[arg1] < local175) {
						Static64.anIntArray110[arg1] = local175;
					}
				}
				if (!local117) {
					if (local77 >= 1 && Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 - 1][local99] != local14) {
						Static76.anIntArray141[local56] = local77 - 1 | 0xD3000000 | 0x120000;
						Static35.anIntArray55[local56] = local99 | 0x130000;
						Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 - 1][local99] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					local99++;
					if (local99 < 104) {
						if (local77 - 1 >= 0 && local14 != Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 - 1][local99] && (Static41.aByteArrayArrayArray2[Static99.anInt1826][local77][local99] & 0x4) == 0 && (Static41.aByteArrayArrayArray2[Static99.anInt1826][local77 - 1][local99 - 1] & 0x4) == 0) {
							Static76.anIntArray141[local56] = local77 - 1 | 0x52000000 | 0x120000;
							Static35.anIntArray55[local56] = local99 | 0x130000;
							local56 = local56 + 1 & 0xFFF;
							Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 - 1][local99] = local14;
						}
						if (local14 != Static126.aByteArrayArrayArray15[Static99.anInt1826][local77][local99]) {
							Static76.anIntArray141[local56] = local77 | 0x520000 | 0x13000000;
							Static35.anIntArray55[local56] = local99 | 0x530000;
							local56 = local56 + 1 & 0xFFF;
							Static126.aByteArrayArrayArray15[Static99.anInt1826][local77][local99] = local14;
						}
						if (local77 + 1 < 104 && Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 + 1][local99] != local14 && (Static41.aByteArrayArrayArray2[Static99.anInt1826][local77][local99] & 0x4) == 0 && (Static41.aByteArrayArrayArray2[Static99.anInt1826][local77 + 1][local99 - 1] & 0x4) == 0) {
							Static76.anIntArray141[local56] = local77 + 1 | 0x520000 | 0x92000000;
							Static35.anIntArray55[local56] = local99 | 0x530000;
							Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 + 1][local99] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
					}
					local99--;
					if (local77 + 1 < 104 && Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 + 1][local99] != local14) {
						Static76.anIntArray141[local56] = local77 + 1 | 0x920000 | 0x53000000;
						Static35.anIntArray55[local56] = local99 | 0x930000;
						Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 + 1][local99] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					local99--;
					if (local99 >= 0) {
						if (local77 - 1 >= 0 && local14 != Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 - 1][local99] && (Static41.aByteArrayArrayArray2[Static99.anInt1826][local77][local99] & 0x4) == 0 && (Static41.aByteArrayArrayArray2[Static99.anInt1826][local77 - 1][local99 + 1] & 0x4) == 0) {
							Static76.anIntArray141[local56] = local77 - 1 | 0xD20000 | 0x12000000;
							Static35.anIntArray55[local56] = local99 | 0xD30000;
							Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 - 1][local99] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local14 != Static126.aByteArrayArrayArray15[Static99.anInt1826][local77][local99]) {
							Static76.anIntArray141[local56] = local77 | 0xD20000 | 0x93000000;
							Static35.anIntArray55[local56] = local99 | 0xD30000;
							Static126.aByteArrayArrayArray15[Static99.anInt1826][local77][local99] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local77 + 1 < 104 && local14 != Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 + 1][local99] && (Static41.aByteArrayArrayArray2[Static99.anInt1826][local77][local99] & 0x4) == 0 && (Static41.aByteArrayArrayArray2[Static99.anInt1826][local77 + 1][local99 + 1] & 0x4) == 0) {
							Static76.anIntArray141[local56] = local77 + 1 | 0x920000 | 0xD2000000;
							Static35.anIntArray55[local56] = local99 | 0x930000;
							Static126.aByteArrayArrayArray15[Static99.anInt1826][local77 + 1][local99] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static174.anIntArray398[arg1] != -1000000) {
				Static174.anIntArray398[arg1] += 10;
				Static100.anIntArray184[arg1] -= 50;
				Static286.anIntArray569[arg1] += 50;
				Static64.anIntArray110[arg1] += 50;
				Static11.anIntArray541[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIBI)V")
	public static void method4459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class151 local8 = Static114.method5019(arg0, arg3);
		if (local8 != null && local8.anObjectArray16 != null) {
			@Pc(19) Class3_Sub24 local19 = new Class3_Sub24();
			local19.aClass151_13 = local8;
			local19.anObjectArray1 = local8.anObjectArray16;
			Static161.method2653(local19);
		}
		Static39.aBoolean56 = true;
		Static296.anInt5869 = arg0;
		Static144.anInt4821 = arg4;
		Static269.anInt5498 = arg1;
		Static63.anInt1200 = arg3;
		Static78.anInt1479 = arg5;
		Static75.anInt1408 = arg2;
		Static134.method3639(local8);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!rn;)V")
	public static void method4460(@OriginalArg(1) Class155 arg0) {
		Static277.aClass155_115 = arg0;
	}
}
