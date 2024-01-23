import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "Lclient!si;")
	public static Class157 aClass157_11;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!nm;ILclient!nm;II)Lclient!uj;")
	public static Class1_Sub5_Sub9 method2332(@OriginalArg(0) Class119 arg0, @OriginalArg(2) Class119 arg1, @OriginalArg(4) int arg2) {
		return Static114.method2083(arg2, arg0, 0) ? Static178.method3134(arg1.method3235(0, arg2)) : null;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public static void method2334() {
		if (Static92.anInt1936 != -1) {
			Static219.method3544(-1, false, -1, Static92.anInt1936);
			Static92.anInt1936 = -1;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[[[Lclient!jj;ZIII)Z")
	public static boolean method2335(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub16[][][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) byte local10 = arg2 ? 1 : (byte) (Static121.anInt2463 & 0xFF);
		if (local10 == Static35.aByteArrayArrayArray2[Static132.anInt2608][arg3][arg0]) {
			return false;
		} else if ((Static17.aByteArrayArrayArray1[Static132.anInt2608][arg3][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			Static150.anIntArray261[0] = arg3;
			@Pc(59) int local59 = local44 + 1;
			Static254.anIntArray530[0] = arg0;
			@Pc(63) int local63 = 0;
			Static35.aByteArrayArrayArray2[Static132.anInt2608][arg3][arg0] = local10;
			while (local63 != local59) {
				@Pc(80) int local80 = Static150.anIntArray261[local63] & 0xFFFF;
				@Pc(88) int local88 = Static150.anIntArray261[local63] >> 24 & 0xFF;
				@Pc(94) int local94 = Static254.anIntArray530[local63] & 0xFFFF;
				@Pc(102) int local102 = Static150.anIntArray261[local63] >> 16 & 0xFF;
				@Pc(110) int local110 = Static254.anIntArray530[local63] >> 16 & 0xFF;
				local63 = local63 + 1 & 0xFFF;
				@Pc(118) boolean local118 = false;
				@Pc(120) boolean local120 = false;
				if ((Static17.aByteArrayArrayArray1[Static132.anInt2608][local80][local94] & 0x4) == 0) {
					local120 = true;
				}
				@Pc(140) int local140;
				@Pc(183) int local183;
				label245: for (local140 = Static132.anInt2608 + 1; local140 <= 3; local140++) {
					if ((Static17.aByteArrayArrayArray1[local140][local80][local94] & 0x8) == 0) {
						@Pc(218) int local218;
						@Pc(351) int local351;
						if (local120 && arg1[local140][local80][local94] != null) {
							if (arg1[local140][local80][local94].aClass39_1 != null) {
								local183 = Static128.method2265(local102);
								if (arg1[local140][local80][local94].aClass39_1.anInt1260 == local183 || local183 == arg1[local140][local80][local94].aClass39_1.anInt1253) {
									continue;
								}
								if (local88 != 0) {
									local218 = Static128.method2265(local88);
									if (local218 == arg1[local140][local80][local94].aClass39_1.anInt1260 || arg1[local140][local80][local94].aClass39_1.anInt1253 == local218) {
										continue;
									}
								}
								if (local110 != 0) {
									local218 = Static128.method2265(local110);
									if (local218 == arg1[local140][local80][local94].aClass39_1.anInt1260 || local218 == arg1[local140][local80][local94].aClass39_1.anInt1253) {
										continue;
									}
								}
							}
							if (arg1[local140][local80][local94].aClass45Array2 != null) {
								for (local183 = 0; local183 < arg1[local140][local80][local94].anInt2573; local183++) {
									local218 = (int) (arg1[local140][local80][local94].aClass45Array2[local183].aLong56 >> 14 & 0x3FL);
									if (local218 == 21) {
										local218 = 19;
									}
									@Pc(345) int local345 = (int) (arg1[local140][local80][local94].aClass45Array2[local183].aLong56 >> 20 & 0x3L);
									local351 = local345 << 6 | local218;
									if (local102 == local351 || local88 != 0 && local88 == local351 || local110 != 0 && local351 == local110) {
										continue label245;
									}
								}
							}
						}
						local118 = true;
						@Pc(392) Class1_Sub16 local392 = arg1[local140][local80][local94];
						if (local392 != null && local392.anInt2573 > 0) {
							for (local218 = 0; local218 < local392.anInt2573; local218++) {
								@Pc(416) Class45 local416 = local392.aClass45Array2[local218];
								if (local416.anInt1360 != local416.anInt1362 || local416.anInt1359 != local416.anInt1355) {
									for (local351 = local416.anInt1360; local351 <= local416.anInt1362; local351++) {
										for (@Pc(444) int local444 = local416.anInt1359; local444 <= local416.anInt1355; local444++) {
											Static35.aByteArrayArrayArray2[local140][local351][local444] = local10;
										}
									}
								}
							}
						}
						Static35.aByteArrayArrayArray2[local140][local80][local94] = local10;
					}
				}
				if (local118) {
					local183 = local94 << 7;
					local140 = local80 << 7;
					if (Static283.anIntArray564[arg4] < Static280.anIntArrayArrayArray13[Static132.anInt2608 + 1][local80][local94]) {
						Static283.anIntArray564[arg4] = Static280.anIntArrayArrayArray13[Static132.anInt2608 + 1][local80][local94];
					}
					if (Static117.anIntArray171[arg4] > local140) {
						Static117.anIntArray171[arg4] = local140;
					} else if (Static192.anIntArray397[arg4] < local140) {
						Static192.anIntArray397[arg4] = local140;
					}
					if (Static26.anIntArray59[arg4] > local183) {
						Static26.anIntArray59[arg4] = local183;
					} else if (Static174.anIntArray612[arg4] < local183) {
						Static174.anIntArray612[arg4] = local183;
					}
				}
				if (!local120) {
					if (local80 >= 1 && Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 - 1][local94] != local10) {
						Static150.anIntArray261[local59] = local80 - 1 | 0x120000 | 0xD3000000;
						Static254.anIntArray530[local59] = local94 | 0x130000;
						local59 = local59 + 1 & 0xFFF;
						Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 - 1][local94] = local10;
					}
					local94++;
					if (local94 < 104) {
						if (local80 - 1 >= 0 && local10 != Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 - 1][local94] && (Static17.aByteArrayArrayArray1[Static132.anInt2608][local80][local94] & 0x4) == 0 && (Static17.aByteArrayArrayArray1[Static132.anInt2608][local80 - 1][local94 - 1] & 0x4) == 0) {
							Static150.anIntArray261[local59] = local80 - 1 | 0x120000 | 0x52000000;
							Static254.anIntArray530[local59] = local94 | 0x130000;
							local59 = local59 + 1 & 0xFFF;
							Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 - 1][local94] = local10;
						}
						if (Static35.aByteArrayArrayArray2[Static132.anInt2608][local80][local94] != local10) {
							Static150.anIntArray261[local59] = local80 | 0x520000 | 0x13000000;
							Static254.anIntArray530[local59] = local94 | 0x530000;
							Static35.aByteArrayArrayArray2[Static132.anInt2608][local80][local94] = local10;
							local59 = local59 + 1 & 0xFFF;
						}
						if (local80 + 1 < 104 && Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 + 1][local94] != local10 && (Static17.aByteArrayArrayArray1[Static132.anInt2608][local80][local94] & 0x4) == 0 && (Static17.aByteArrayArrayArray1[Static132.anInt2608][local80 + 1][local94 - 1] & 0x4) == 0) {
							Static150.anIntArray261[local59] = 0x92000000 | 0x520000 | local80 + 1;
							Static254.anIntArray530[local59] = local94 | 0x530000;
							local59 = local59 + 1 & 0xFFF;
							Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 + 1][local94] = local10;
						}
					}
					local94--;
					if (local80 + 1 < 104 && local10 != Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 + 1][local94]) {
						Static150.anIntArray261[local59] = 0x53000000 | 0x920000 | local80 + 1;
						Static254.anIntArray530[local59] = local94 | 0x930000;
						Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 + 1][local94] = local10;
						local59 = local59 + 1 & 0xFFF;
					}
					local94--;
					if (local94 >= 0) {
						if (local80 - 1 >= 0 && Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 - 1][local94] != local10 && (Static17.aByteArrayArrayArray1[Static132.anInt2608][local80][local94] & 0x4) == 0 && (Static17.aByteArrayArrayArray1[Static132.anInt2608][local80 - 1][local94 + 1] & 0x4) == 0) {
							Static150.anIntArray261[local59] = local80 - 1 | 0x12000000 | 0xD20000;
							Static254.anIntArray530[local59] = local94 | 0xD30000;
							local59 = local59 + 1 & 0xFFF;
							Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 - 1][local94] = local10;
						}
						if (Static35.aByteArrayArrayArray2[Static132.anInt2608][local80][local94] != local10) {
							Static150.anIntArray261[local59] = 0x93000000 | 0xD20000 | local80;
							Static254.anIntArray530[local59] = local94 | 0xD30000;
							local59 = local59 + 1 & 0xFFF;
							Static35.aByteArrayArrayArray2[Static132.anInt2608][local80][local94] = local10;
						}
						if (local80 + 1 < 104 && local10 != Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 + 1][local94] && (Static17.aByteArrayArrayArray1[Static132.anInt2608][local80][local94] & 0x4) == 0 && (Static17.aByteArrayArrayArray1[Static132.anInt2608][local80 + 1][local94 + 1] & 0x4) == 0) {
							Static150.anIntArray261[local59] = local80 + 1 | 0x920000 | 0xD2000000;
							Static254.anIntArray530[local59] = local94 | 0x930000;
							Static35.aByteArrayArrayArray2[Static132.anInt2608][local80 + 1][local94] = local10;
							local59 = local59 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static283.anIntArray564[arg4] != -1000000) {
				Static283.anIntArray564[arg4] += 10;
				Static117.anIntArray171[arg4] -= 50;
				Static192.anIntArray397[arg4] += 50;
				Static174.anIntArray612[arg4] += 50;
				Static26.anIntArray59[arg4] -= 50;
			}
			return true;
		}
	}
}
