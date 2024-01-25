import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "J")
	public static long aLong101;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
	public static int anInt3266 = 0;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
	public static int anInt3267 = 0;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	public static int anInt3268 = -1;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "Z")
	public static boolean aBoolean213 = false;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
	public static int anInt3269 = 0;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "[I")
	public static final int[] anIntArray288 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBI)V")
	public static void method3022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static184.aBoolean241) {
			return;
		}
		Static164.aClass14_Sub4_Sub2_3.method2557(137);
		Static164.aClass14_Sub4_Sub2_3.method2541(arg0);
		Static164.aClass14_Sub4_Sub2_3.method2512(Static88.anInt2109);
		Static164.aClass14_Sub4_Sub2_3.method2535(arg1);
		Static164.aClass14_Sub4_Sub2_3.method2535(Static188.anInt3867);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZZ[[[Lclient!we;III)Z")
	public static boolean method3024(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class213[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(25) byte local25 = arg0 ? 1 : (byte) (Static295.anInt5671 & 0xFF);
		if (local25 == Static124.aByteArrayArrayArray6[Static219.anInt4400][arg2][arg3]) {
			return false;
		} else if ((Static108.aByteArrayArrayArray5[Static219.anInt4400][arg2][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(57) byte local57 = 0;
			@Pc(59) int local59 = 0;
			Static326.anIntArray603[0] = arg2;
			@Pc(66) int local66 = local57 + 1;
			Static133.anIntArray420[0] = arg3;
			Static124.aByteArrayArrayArray6[Static219.anInt4400][arg2][arg3] = local25;
			while (local66 != local59) {
				@Pc(84) int local84 = Static326.anIntArray603[local59] & 0xFFFF;
				@Pc(92) int local92 = Static326.anIntArray603[local59] >> 16 & 0xFF;
				@Pc(100) int local100 = Static326.anIntArray603[local59] >> 24 & 0xFF;
				@Pc(106) int local106 = Static133.anIntArray420[local59] & 0xFFFF;
				@Pc(114) int local114 = Static133.anIntArray420[local59] >> 16 & 0xFF;
				local59 = local59 + 1 & 0xFFF;
				@Pc(122) boolean local122 = false;
				if ((Static108.aByteArrayArrayArray5[Static219.anInt4400][local84][local106] & 0x4) == 0) {
					local122 = true;
				}
				@Pc(139) boolean local139 = false;
				@Pc(178) int local178;
				@Pc(220) int local220;
				label231: for (@Pc(143) int local143 = Static219.anInt4400 + 1; local143 <= 3; local143++) {
					if ((Static108.aByteArrayArrayArray5[local143][local84][local106] & 0x8) == 0) {
						@Pc(322) Class10_Sub3 local322;
						@Pc(332) int local332;
						@Pc(311) Class213 local311;
						@Pc(317) Class81 local317;
						if (local122 && arg1[local143][local84][local106] != null) {
							if (arg1[local143][local84][local106].aClass10_Sub2_2 != null) {
								local178 = Static330.method5663(local92);
								if (local178 == arg1[local143][local84][local106].aClass10_Sub2_2.anInt2445 || arg1[local143][local84][local106].aClass10_Sub2_1 != null && local178 == arg1[local143][local84][local106].aClass10_Sub2_1.anInt2445) {
									continue;
								}
								if (local100 != 0) {
									local220 = Static330.method5663(local100);
									if (arg1[local143][local84][local106].aClass10_Sub2_2.anInt2445 == local220 || arg1[local143][local84][local106].aClass10_Sub2_1 != null && arg1[local143][local84][local106].aClass10_Sub2_1.anInt2445 == local220) {
										continue;
									}
								}
								if (local114 != 0) {
									local220 = Static330.method5663(local114);
									if (local220 == arg1[local143][local84][local106].aClass10_Sub2_2.anInt2445 || arg1[local143][local84][local106].aClass10_Sub2_1 != null && arg1[local143][local84][local106].aClass10_Sub2_1.anInt2445 == local220) {
										continue;
									}
								}
							}
							local311 = arg1[local143][local84][local106];
							if (local311.aClass81_4 != null) {
								for (local317 = local311.aClass81_4; local317 != null; local317 = local317.aClass81_3) {
									local322 = local317.aClass10_Sub3_1;
									if (local322 instanceof Interface7) {
										@Pc(328) Interface7 local328 = (Interface7) local322;
										local332 = local328.method4066();
										@Pc(336) int local336 = local328.method4067();
										if (local332 == 21) {
											local332 = 19;
										}
										@Pc(349) int local349 = local332 | local336 << 6;
										if (local92 == local349 || local100 != 0 && local349 == local100 || local114 != 0 && local349 == local114) {
											continue label231;
										}
									}
								}
							}
						}
						local311 = arg1[local143][local84][local106];
						if (local311 != null && local311.aClass81_4 != null) {
							for (local317 = local311.aClass81_4; local317 != null; local317 = local317.aClass81_3) {
								local322 = local317.aClass10_Sub3_1;
								if (local322.aShort80 != local322.aShort83 || local322.aShort81 != local322.aShort82) {
									for (@Pc(421) int local421 = local322.aShort83; local421 <= local322.aShort80; local421++) {
										for (local332 = local322.aShort82; local332 <= local322.aShort81; local332++) {
											Static124.aByteArrayArrayArray6[local143][local421][local332] = local25;
										}
									}
								}
							}
						}
						local139 = true;
						Static124.aByteArrayArrayArray6[local143][local84][local106] = local25;
					}
				}
				if (local139) {
					local178 = Static158.aClass114Array2[Static219.anInt4400 + 1].method3610(local84, local106);
					if (local178 > Static118.anIntArray230[arg4]) {
						Static118.anIntArray230[arg4] = local178;
					}
					local220 = local84 << 7;
					@Pc(497) int local497 = local106 << 7;
					if (Static63.anIntArray110[arg4] > local220) {
						Static63.anIntArray110[arg4] = local220;
					} else if (local220 > Static167.anIntArray487[arg4]) {
						Static167.anIntArray487[arg4] = local220;
					}
					if (Static9.anIntArray12[arg4] > local497) {
						Static9.anIntArray12[arg4] = local497;
					} else if (local497 > Static353.anIntArray644[arg4]) {
						Static353.anIntArray644[arg4] = local497;
					}
				}
				if (!local122) {
					if (local84 >= 1 && Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 - 1][local106] != local25) {
						Static326.anIntArray603[local66] = 0xD3000000 | 0x120000 | local84 - 1;
						Static133.anIntArray420[local66] = local106 | 0x130000;
						local66 = local66 + 1 & 0xFFF;
						Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 - 1][local106] = local25;
					}
					local106++;
					if (local106 < Static298.anInt5716) {
						if (local84 - 1 >= 0 && local25 != Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 - 1][local106] && (Static108.aByteArrayArrayArray5[Static219.anInt4400][local84][local106] & 0x4) == 0 && (Static108.aByteArrayArrayArray5[Static219.anInt4400][local84 - 1][local106 - 1] & 0x4) == 0) {
							Static326.anIntArray603[local66] = local84 - 1 | 0x120000 | 0x52000000;
							Static133.anIntArray420[local66] = local106 | 0x130000;
							Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 - 1][local106] = local25;
							local66 = local66 + 1 & 0xFFF;
						}
						if (Static124.aByteArrayArrayArray6[Static219.anInt4400][local84][local106] != local25) {
							Static326.anIntArray603[local66] = 0x13000000 | 0x520000 | local84;
							Static133.anIntArray420[local66] = local106 | 0x530000;
							local66 = local66 + 1 & 0xFFF;
							Static124.aByteArrayArrayArray6[Static219.anInt4400][local84][local106] = local25;
						}
						if (local84 + 1 < Static195.anInt3965 && Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 + 1][local106] != local25 && (Static108.aByteArrayArrayArray5[Static219.anInt4400][local84][local106] & 0x4) == 0 && (Static108.aByteArrayArrayArray5[Static219.anInt4400][local84 + 1][local106 - 1] & 0x4) == 0) {
							Static326.anIntArray603[local66] = 0x92000000 | 0x520000 | local84 + 1;
							Static133.anIntArray420[local66] = local106 | 0x530000;
							local66 = local66 + 1 & 0xFFF;
							Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 + 1][local106] = local25;
						}
					}
					local106--;
					if (Static195.anInt3965 > local84 + 1 && local25 != Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 + 1][local106]) {
						Static326.anIntArray603[local66] = local84 + 1 | 0x53000000 | 0x920000;
						Static133.anIntArray420[local66] = local106 | 0x930000;
						Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 + 1][local106] = local25;
						local66 = local66 + 1 & 0xFFF;
					}
					local106--;
					if (local106 >= 0) {
						if (local84 - 1 >= 0 && local25 != Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 - 1][local106] && (Static108.aByteArrayArrayArray5[Static219.anInt4400][local84][local106] & 0x4) == 0 && (Static108.aByteArrayArrayArray5[Static219.anInt4400][local84 - 1][local106 + 1] & 0x4) == 0) {
							Static326.anIntArray603[local66] = 0x12000000 | 0xD20000 | local84 - 1;
							Static133.anIntArray420[local66] = local106 | 0xD30000;
							Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 - 1][local106] = local25;
							local66 = local66 + 1 & 0xFFF;
						}
						if (local25 != Static124.aByteArrayArrayArray6[Static219.anInt4400][local84][local106]) {
							Static326.anIntArray603[local66] = local84 | 0xD20000 | 0x93000000;
							Static133.anIntArray420[local66] = local106 | 0xD30000;
							Static124.aByteArrayArrayArray6[Static219.anInt4400][local84][local106] = local25;
							local66 = local66 + 1 & 0xFFF;
						}
						if (Static195.anInt3965 > local84 + 1 && Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 + 1][local106] != local25 && (Static108.aByteArrayArrayArray5[Static219.anInt4400][local84][local106] & 0x4) == 0 && (Static108.aByteArrayArrayArray5[Static219.anInt4400][local84 + 1][local106 + 1] & 0x4) == 0) {
							Static326.anIntArray603[local66] = 0xD2000000 | 0x920000 | local84 + 1;
							Static133.anIntArray420[local66] = local106 | 0x930000;
							local66 = local66 + 1 & 0xFFF;
							Static124.aByteArrayArrayArray6[Static219.anInt4400][local84 + 1][local106] = local25;
						}
					}
				}
			}
			if (Static118.anIntArray230[arg4] != -1000000) {
				Static118.anIntArray230[arg4] += 10;
				Static63.anIntArray110[arg4] -= 50;
				Static167.anIntArray487[arg4] += 50;
				Static353.anIntArray644[arg4] += 50;
				Static9.anIntArray12[arg4] -= 50;
			}
			return true;
		}
	}
}
