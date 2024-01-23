import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Lclient!pk;")
	public static Class132 aClass132_88;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Z")
	public static boolean aBoolean400;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lclient!le;")
	public static Class8_Sub2_Sub1 aClass8_Sub2_Sub1_5 = new Class8_Sub2_Sub1(5000);

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Z")
	public static boolean aBoolean399 = false;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "[I")
	public static int[] anIntArray376 = new int[5];

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString174 = "Close";

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
	public static int anInt4970 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!bk;I)V")
	public static void method3754(@OriginalArg(0) Class17 arg0) {
		@Pc(7) Class35 local7 = null;
		try {
			@Pc(12) Class163 local12 = arg0.method438("runescape");
			while (local12.anInt5259 == 0) {
				Static162.method2645(1L);
			}
			if (local12.anInt5259 == 1) {
				local7 = (Class35) local12.anObject7;
				@Pc(34) Class8_Sub2 local34 = Static15.method288();
				local7.method782(0, local34.anInt2955, local34.aByteArray24);
			}
		} catch (@Pc(44) Exception local44) {
		}
		try {
			if (local7 != null) {
				local7.method779();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BILclient!tk;I)V")
	public static void method3755(@OriginalArg(1) int arg0, @OriginalArg(2) Class159 arg1, @OriginalArg(3) int arg2) {
		if (Static201.aClass159_15 != null || Static147.aBoolean246 || (arg1 == null || Static249.method3695(arg1) == null)) {
			return;
		}
		Static201.aClass159_15 = arg1;
		Static153.aClass159_12 = Static249.method3695(arg1);
		Static246.aBoolean393 = false;
		Static136.anInt2738 = 0;
		Static16.anInt3521 = arg0;
		Static204.anInt4224 = arg2;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)V")
	public static void method3756(@OriginalArg(1) boolean arg0) {
		Static81.method1345(Static248.anInt4917, Static13.anInt356, Static250.anInt4959, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!pk;I)[Lclient!wd;")
	public static Class8_Sub1_Sub7[] method3757(@OriginalArg(1) int arg0, @OriginalArg(2) Class132 arg1) {
		return Static247.method4168(arg1, 0, arg0) ? Static150.method3481() : null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIII[[[Lclient!sg;I)Z")
	public static boolean method3758(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8_Sub27[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte local10 = arg0 ? 1 : (byte) (Static207.anInt4304 & 0xFF);
		if (local10 == Static123.aByteArrayArrayArray5[Static34.anInt770][arg4][arg2]) {
			return false;
		} else if ((Static170.aByteArrayArrayArray9[Static34.anInt770][arg4][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(45) byte local45 = 0;
			Static177.anIntArray122[0] = arg4;
			@Pc(51) int local51 = 0;
			@Pc(54) int local54 = local45 + 1;
			Static242.anIntArray366[0] = arg2;
			Static123.aByteArrayArrayArray5[Static34.anInt770][arg4][arg2] = local10;
			while (local51 != local54) {
				@Pc(78) int local78 = Static177.anIntArray122[local51] & 0xFFFF;
				@Pc(84) int local84 = Static242.anIntArray366[local51] & 0xFFFF;
				@Pc(92) int local92 = Static242.anIntArray366[local51] >> 16 & 0xFF;
				@Pc(100) int local100 = Static177.anIntArray122[local51] >> 16 & 0xFF;
				@Pc(108) int local108 = Static177.anIntArray122[local51] >> 24 & 0xFF;
				@Pc(110) boolean local110 = false;
				@Pc(112) boolean local112 = false;
				if ((Static170.aByteArrayArrayArray9[Static34.anInt770][local78][local84] & 0x4) == 0) {
					local110 = true;
				}
				@Pc(130) int local130;
				@Pc(173) int local173;
				label234: for (local130 = Static34.anInt770 + 1; local130 <= 3; local130++) {
					if ((Static170.aByteArrayArrayArray9[local130][local78][local84] & 0x8) == 0) {
						@Pc(204) int local204;
						@Pc(339) int local339;
						if (local110 && arg3[local130][local78][local84] != null) {
							if (arg3[local130][local78][local84].aClass134_1 != null) {
								local173 = Static128.method2078(local100);
								if (local173 == arg3[local130][local78][local84].aClass134_1.anInt4308 || local173 == arg3[local130][local78][local84].aClass134_1.anInt4314) {
									continue;
								}
								if (local108 != 0) {
									local204 = Static128.method2078(local108);
									if (arg3[local130][local78][local84].aClass134_1.anInt4308 == local204 || arg3[local130][local78][local84].aClass134_1.anInt4314 == local204) {
										continue;
									}
								}
								if (local92 != 0) {
									local204 = Static128.method2078(local92);
									if (local204 == arg3[local130][local78][local84].aClass134_1.anInt4308 || arg3[local130][local78][local84].aClass134_1.anInt4314 == local204) {
										continue;
									}
								}
							}
							if (arg3[local130][local78][local84].aClass170Array3 != null) {
								for (local173 = 0; local173 < arg3[local130][local78][local84].anInt4857; local173++) {
									local204 = (int) (arg3[local130][local78][local84].aClass170Array3[local173].aLong196 >> 14 & 0x3FL);
									if (local204 == 21) {
										local204 = 19;
									}
									@Pc(333) int local333 = (int) (arg3[local130][local78][local84].aClass170Array3[local173].aLong196 >> 20 & 0x3L);
									local339 = local204 | local333 << 6;
									if (local100 == local339 || local108 != 0 && local339 == local108 || local92 != 0 && local339 == local92) {
										continue label234;
									}
								}
							}
						}
						@Pc(364) Class8_Sub27 local364 = arg3[local130][local78][local84];
						if (local364 != null && local364.anInt4857 > 0) {
							for (local204 = 0; local204 < local364.anInt4857; local204++) {
								@Pc(388) Class170 local388 = local364.aClass170Array3[local204];
								if (local388.anInt5463 != local388.anInt5455 || local388.anInt5458 != local388.anInt5460) {
									for (local339 = local388.anInt5463; local339 <= local388.anInt5455; local339++) {
										for (@Pc(416) int local416 = local388.anInt5460; local416 <= local388.anInt5458; local416++) {
											Static123.aByteArrayArrayArray5[local130][local339][local416] = local10;
										}
									}
								}
							}
						}
						local112 = true;
						Static123.aByteArrayArrayArray5[local130][local78][local84] = local10;
					}
				}
				local51 = local51 + 1 & 0xFFF;
				if (local112) {
					if (Static144.anIntArray233[arg1] < Static195.anIntArrayArrayArray7[Static34.anInt770 + 1][local78][local84]) {
						Static144.anIntArray233[arg1] = Static195.anIntArrayArrayArray7[Static34.anInt770 + 1][local78][local84];
					}
					local130 = local78 << 7;
					if (Static119.anIntArray194[arg1] > local130) {
						Static119.anIntArray194[arg1] = local130;
					} else if (local130 > Static255.anIntArray391[arg1]) {
						Static255.anIntArray391[arg1] = local130;
					}
					local173 = local84 << 7;
					if (Static172.anIntArray260[arg1] > local173) {
						Static172.anIntArray260[arg1] = local173;
					} else if (Static41.anIntArray62[arg1] < local173) {
						Static41.anIntArray62[arg1] = local173;
					}
				}
				if (!local110) {
					if (local78 >= 1 && local10 != Static123.aByteArrayArrayArray5[Static34.anInt770][local78 - 1][local84]) {
						Static177.anIntArray122[local54] = local78 - 1 | 0x120000 | 0xD3000000;
						Static242.anIntArray366[local54] = local84 | 0x130000;
						local54 = local54 + 1 & 0xFFF;
						Static123.aByteArrayArrayArray5[Static34.anInt770][local78 - 1][local84] = local10;
					}
					local84++;
					if (local84 < 104) {
						if (local78 - 1 >= 0 && Static123.aByteArrayArrayArray5[Static34.anInt770][local78 - 1][local84] != local10 && (Static170.aByteArrayArrayArray9[Static34.anInt770][local78][local84] & 0x4) == 0 && (Static170.aByteArrayArrayArray9[Static34.anInt770][local78 - 1][local84 - 1] & 0x4) == 0) {
							Static177.anIntArray122[local54] = 0x52000000 | 0x120000 | local78 - 1;
							Static242.anIntArray366[local54] = local84 | 0x130000;
							Static123.aByteArrayArrayArray5[Static34.anInt770][local78 - 1][local84] = local10;
							local54 = local54 + 1 & 0xFFF;
						}
						if (local10 != Static123.aByteArrayArrayArray5[Static34.anInt770][local78][local84]) {
							Static177.anIntArray122[local54] = 0x13000000 | 0x520000 | local78;
							Static242.anIntArray366[local54] = local84 | 0x530000;
							Static123.aByteArrayArrayArray5[Static34.anInt770][local78][local84] = local10;
							local54 = local54 + 1 & 0xFFF;
						}
						if (local78 + 1 < 104 && Static123.aByteArrayArrayArray5[Static34.anInt770][local78 + 1][local84] != local10 && (Static170.aByteArrayArrayArray9[Static34.anInt770][local78][local84] & 0x4) == 0 && (Static170.aByteArrayArrayArray9[Static34.anInt770][local78 + 1][local84 - 1] & 0x4) == 0) {
							Static177.anIntArray122[local54] = local78 + 1 | 0x520000 | 0x92000000;
							Static242.anIntArray366[local54] = local84 | 0x530000;
							local54 = local54 + 1 & 0xFFF;
							Static123.aByteArrayArrayArray5[Static34.anInt770][local78 + 1][local84] = local10;
						}
					}
					local84--;
					if (local78 + 1 < 104 && local10 != Static123.aByteArrayArrayArray5[Static34.anInt770][local78 + 1][local84]) {
						Static177.anIntArray122[local54] = local78 + 1 | 0x53000000 | 0x920000;
						Static242.anIntArray366[local54] = local84 | 0x930000;
						local54 = local54 + 1 & 0xFFF;
						Static123.aByteArrayArrayArray5[Static34.anInt770][local78 + 1][local84] = local10;
					}
					local84--;
					if (local84 >= 0) {
						if (local78 - 1 >= 0 && Static123.aByteArrayArrayArray5[Static34.anInt770][local78 - 1][local84] != local10 && (Static170.aByteArrayArrayArray9[Static34.anInt770][local78][local84] & 0x4) == 0 && (Static170.aByteArrayArrayArray9[Static34.anInt770][local78 - 1][local84 + 1] & 0x4) == 0) {
							Static177.anIntArray122[local54] = local78 - 1 | 0xD20000 | 0x12000000;
							Static242.anIntArray366[local54] = local84 | 0xD30000;
							Static123.aByteArrayArrayArray5[Static34.anInt770][local78 - 1][local84] = local10;
							local54 = local54 + 1 & 0xFFF;
						}
						if (Static123.aByteArrayArrayArray5[Static34.anInt770][local78][local84] != local10) {
							Static177.anIntArray122[local54] = local78 | 0xD20000 | 0x93000000;
							Static242.anIntArray366[local54] = local84 | 0xD30000;
							local54 = local54 + 1 & 0xFFF;
							Static123.aByteArrayArrayArray5[Static34.anInt770][local78][local84] = local10;
						}
						if (local78 + 1 < 104 && Static123.aByteArrayArrayArray5[Static34.anInt770][local78 + 1][local84] != local10 && (Static170.aByteArrayArrayArray9[Static34.anInt770][local78][local84] & 0x4) == 0 && (Static170.aByteArrayArrayArray9[Static34.anInt770][local78 + 1][local84 + 1] & 0x4) == 0) {
							Static177.anIntArray122[local54] = local78 + 1 | 0xD2000000 | 0x920000;
							Static242.anIntArray366[local54] = local84 | 0x930000;
							local54 = local54 + 1 & 0xFFF;
							Static123.aByteArrayArrayArray5[Static34.anInt770][local78 + 1][local84] = local10;
						}
					}
				}
			}
			if (Static144.anIntArray233[arg1] != -1000000) {
				Static144.anIntArray233[arg1] += 10;
				Static119.anIntArray194[arg1] -= 50;
				Static255.anIntArray391[arg1] += 50;
				Static41.anIntArray62[arg1] += 50;
				Static172.anIntArray260[arg1] -= 50;
			}
			return true;
		}
	}
}
