import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!qc", name = "kb", descriptor = "I")
	public static int anInt5333;

	@OriginalMember(owner = "client!qc", name = "Xb", descriptor = "I")
	public static int anInt5366;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
	public static int anInt5298 = 0;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString182 = "wave:";

	@OriginalMember(owner = "client!qc", name = "Jb", descriptor = "Ljava/lang/String;")
	public static String aString183 = "Connection lost.";

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!an;ZB)V")
	public static void method4281(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.anInt274;
		@Pc(12) int local12 = (int) arg0.aLong214;
		arg0.method4743();
		if (arg1) {
			Static91.method1627(local8);
		}
		Static269.method4263(local8);
		@Pc(27) Class56 local27 = Static38.method715(local12);
		if (local27 != null) {
			Static287.method4466(local27);
		}
		@Pc(34) int local34 = Static68.anInt1741;
		@Pc(44) int local44;
		for (local44 = 0; local44 < local34; local44++) {
			if (Static120.method2001(Static290.aShortArray85[local44])) {
				Static211.method3516(local44);
			}
		}
		if (Static68.anInt1741 == 1) {
			Static196.aBoolean281 = false;
			Static253.method3981(Static275.anInt5450, Static39.anInt982, Static68.anInt1739, Static274.anInt5436);
		} else {
			Static253.method3981(Static275.anInt5450, Static39.anInt982, Static68.anInt1739, Static274.anInt5436);
			local44 = Static237.aClass2_Sub8_Sub5_5.method1237(Static204.aString145);
			for (@Pc(87) int local87 = 0; local87 < Static68.anInt1741; local87++) {
				@Pc(100) int local100 = Static237.aClass2_Sub8_Sub5_5.method1237(Static143.method2543(local87));
				if (local100 > local44) {
					local44 = local100;
				}
			}
			Static274.anInt5436 = local44 + 8;
			Static275.anInt5450 = Static68.anInt1741 * 15 + (Static54.aBoolean90 ? 26 : 22);
		}
		if (Static303.anInt5868 != -1) {
			Static73.method1398(1, Static303.anInt5868);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[[[Lclient!ee;IZZI)Z")
	public static boolean method4283(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static80.anInt1910 & 0xFF);
		if (Static242.aByteArrayArrayArray19[Static32.anInt876][arg2][arg4] == local14) {
			return false;
		} else if ((Static13.aByteArrayArrayArray2[Static32.anInt876][arg2][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(43) int local43 = 0;
			@Pc(45) byte local45 = 0;
			Static260.anIntArray493[0] = arg2;
			@Pc(57) int local57 = local45 + 1;
			Static130.anIntArray293[0] = arg4;
			Static242.aByteArrayArrayArray19[Static32.anInt876][arg2][arg4] = local14;
			while (local57 != local43) {
				@Pc(76) int local76 = Static260.anIntArray493[local43] & 0xFFFF;
				@Pc(84) int local84 = Static260.anIntArray493[local43] >> 24 & 0xFF;
				@Pc(90) int local90 = Static130.anIntArray293[local43] & 0xFFFF;
				@Pc(98) int local98 = Static260.anIntArray493[local43] >> 16 & 0xFF;
				@Pc(106) int local106 = Static130.anIntArray293[local43] >> 16 & 0xFF;
				@Pc(108) boolean local108 = false;
				@Pc(110) boolean local110 = false;
				local43 = local43 + 1 & 0xFFF;
				if ((Static13.aByteArrayArrayArray2[Static32.anInt876][local76][local90] & 0x4) == 0) {
					local110 = true;
				}
				@Pc(133) int local133;
				@Pc(176) int local176;
				label240: for (local133 = Static32.anInt876 + 1; local133 <= 3; local133++) {
					if ((Static13.aByteArrayArrayArray2[local133][local76][local90] & 0x8) == 0) {
						@Pc(209) int local209;
						@Pc(353) int local353;
						if (local110 && arg1[local133][local76][local90] != null) {
							if (arg1[local133][local76][local90].aClass122_1 != null) {
								local176 = Static238.method4689(local98);
								if (local176 == arg1[local133][local76][local90].aClass122_1.anInt4022 || local176 == arg1[local133][local76][local90].aClass122_1.anInt4019) {
									continue;
								}
								if (local84 != 0) {
									local209 = Static238.method4689(local84);
									if (arg1[local133][local76][local90].aClass122_1.anInt4022 == local209 || local209 == arg1[local133][local76][local90].aClass122_1.anInt4019) {
										continue;
									}
								}
								if (local106 != 0) {
									local209 = Static238.method4689(local106);
									if (local209 == arg1[local133][local76][local90].aClass122_1.anInt4022 || local209 == arg1[local133][local76][local90].aClass122_1.anInt4019) {
										continue;
									}
								}
							}
							if (arg1[local133][local76][local90].aClass170Array1 != null) {
								for (local176 = 0; local176 < arg1[local133][local76][local90].anInt1544; local176++) {
									@Pc(323) int local323 = (int) (arg1[local133][local76][local90].aClass170Array1[local176].aLong195 >> 20 & 0x3L);
									local209 = (int) (arg1[local133][local76][local90].aClass170Array1[local176].aLong195 >> 14 & 0x3FL);
									if (local209 == 21) {
										local209 = 19;
									}
									local353 = local323 << 6 | local209;
									if (local353 == local98 || local84 != 0 && local353 == local84 || local106 != 0 && local106 == local353) {
										continue label240;
									}
								}
							}
						}
						@Pc(397) Class2_Sub13 local397 = arg1[local133][local76][local90];
						local108 = true;
						if (local397 != null && local397.anInt1544 > 0) {
							for (local209 = 0; local209 < local397.anInt1544; local209++) {
								@Pc(416) Class170 local416 = local397.aClass170Array1[local209];
								if (local416.anInt5433 != local416.anInt5435 || local416.anInt5437 != local416.anInt5448) {
									for (local353 = local416.anInt5433; local353 <= local416.anInt5435; local353++) {
										for (@Pc(448) int local448 = local416.anInt5437; local448 <= local416.anInt5448; local448++) {
											Static242.aByteArrayArrayArray19[local133][local353][local448] = local14;
										}
									}
								}
							}
						}
						Static242.aByteArrayArrayArray19[local133][local76][local90] = local14;
					}
				}
				if (local108) {
					if (Static9.anIntArrayArrayArray7[Static32.anInt876 + 1][local76][local90] > Static9.anIntArray301[arg0]) {
						Static9.anIntArray301[arg0] = Static9.anIntArrayArrayArray7[Static32.anInt876 + 1][local76][local90];
					}
					local133 = local76 << 7;
					if (Static173.anIntArray374[arg0] > local133) {
						Static173.anIntArray374[arg0] = local133;
					} else if (Static108.anIntArray215[arg0] < local133) {
						Static108.anIntArray215[arg0] = local133;
					}
					local176 = local90 << 7;
					if (local176 < Static232.anIntArray459[arg0]) {
						Static232.anIntArray459[arg0] = local176;
					} else if (local176 > Static154.anIntArray350[arg0]) {
						Static154.anIntArray350[arg0] = local176;
					}
				}
				if (!local110) {
					if (local76 >= 1 && local14 != Static242.aByteArrayArrayArray19[Static32.anInt876][local76 - 1][local90]) {
						Static260.anIntArray493[local57] = local76 - 1 | 0x120000 | 0xD3000000;
						Static130.anIntArray293[local57] = local90 | 0x130000;
						local57 = local57 + 1 & 0xFFF;
						Static242.aByteArrayArrayArray19[Static32.anInt876][local76 - 1][local90] = local14;
					}
					local90++;
					if (local90 < 104) {
						if (local76 - 1 >= 0 && Static242.aByteArrayArrayArray19[Static32.anInt876][local76 - 1][local90] != local14 && (Static13.aByteArrayArrayArray2[Static32.anInt876][local76][local90] & 0x4) == 0 && (Static13.aByteArrayArrayArray2[Static32.anInt876][local76 - 1][local90 - 1] & 0x4) == 0) {
							Static260.anIntArray493[local57] = local76 - 1 | 0x120000 | 0x52000000;
							Static130.anIntArray293[local57] = local90 | 0x130000;
							Static242.aByteArrayArrayArray19[Static32.anInt876][local76 - 1][local90] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static242.aByteArrayArrayArray19[Static32.anInt876][local76][local90] != local14) {
							Static260.anIntArray493[local57] = 0x13000000 | 0x520000 | local76;
							Static130.anIntArray293[local57] = local90 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static242.aByteArrayArrayArray19[Static32.anInt876][local76][local90] = local14;
						}
						if (local76 + 1 < 104 && local14 != Static242.aByteArrayArrayArray19[Static32.anInt876][local76 + 1][local90] && (Static13.aByteArrayArrayArray2[Static32.anInt876][local76][local90] & 0x4) == 0 && (Static13.aByteArrayArrayArray2[Static32.anInt876][local76 + 1][local90 - 1] & 0x4) == 0) {
							Static260.anIntArray493[local57] = local76 + 1 | 0x520000 | 0x92000000;
							Static130.anIntArray293[local57] = local90 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static242.aByteArrayArrayArray19[Static32.anInt876][local76 + 1][local90] = local14;
						}
					}
					local90--;
					if (local76 + 1 < 104 && Static242.aByteArrayArrayArray19[Static32.anInt876][local76 + 1][local90] != local14) {
						Static260.anIntArray493[local57] = local76 + 1 | 0x920000 | 0x53000000;
						Static130.anIntArray293[local57] = local90 | 0x930000;
						Static242.aByteArrayArrayArray19[Static32.anInt876][local76 + 1][local90] = local14;
						local57 = local57 + 1 & 0xFFF;
					}
					local90--;
					if (local90 >= 0) {
						if (local76 - 1 >= 0 && local14 != Static242.aByteArrayArrayArray19[Static32.anInt876][local76 - 1][local90] && (Static13.aByteArrayArrayArray2[Static32.anInt876][local76][local90] & 0x4) == 0 && (Static13.aByteArrayArrayArray2[Static32.anInt876][local76 - 1][local90 + 1] & 0x4) == 0) {
							Static260.anIntArray493[local57] = local76 - 1 | 0xD20000 | 0x12000000;
							Static130.anIntArray293[local57] = local90 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static242.aByteArrayArrayArray19[Static32.anInt876][local76 - 1][local90] = local14;
						}
						if (local14 != Static242.aByteArrayArrayArray19[Static32.anInt876][local76][local90]) {
							Static260.anIntArray493[local57] = local76 | 0x93000000 | 0xD20000;
							Static130.anIntArray293[local57] = local90 | 0xD30000;
							Static242.aByteArrayArrayArray19[Static32.anInt876][local76][local90] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
						if (local76 + 1 < 104 && local14 != Static242.aByteArrayArrayArray19[Static32.anInt876][local76 + 1][local90] && (Static13.aByteArrayArrayArray2[Static32.anInt876][local76][local90] & 0x4) == 0 && (Static13.aByteArrayArrayArray2[Static32.anInt876][local76 + 1][local90 + 1] & 0x4) == 0) {
							Static260.anIntArray493[local57] = local76 + 1 | 0x920000 | 0xD2000000;
							Static130.anIntArray293[local57] = local90 | 0x930000;
							Static242.aByteArrayArrayArray19[Static32.anInt876][local76 + 1][local90] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static9.anIntArray301[arg0] != -1000000) {
				Static9.anIntArray301[arg0] += 10;
				Static173.anIntArray374[arg0] -= 50;
				Static108.anIntArray215[arg0] += 50;
				Static154.anIntArray350[arg0] += 50;
				Static232.anIntArray459[arg0] -= 50;
			}
			return true;
		}
	}
}
