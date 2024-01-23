import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "Lclient!tn;")
	public static Class105 aClass105_1;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString21 = "Allocated memory";

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString22 = "glow1:";

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(II)V")
	public static void method499(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = Static230.anInt4492;
		@Pc(7) int local7 = Static224.anInt6075;
		@Pc(9) int local9 = Static173.anInt3251;
		@Pc(11) int local11 = Static79.anInt1912;
		@Pc(13) int local13 = Static113.anInt2103;
		@Pc(20) int local20 = (int) Static84.aFloat21 + Static221.anInt4331 & 0x7FF;
		@Pc(23) int local23 = (int) Static179.aFloat48;
		if (Static152.anInt2874 / 256 > local23) {
			local23 = Static152.anInt2874 / 256;
		}
		if (Static312.aBooleanArray136[4] && Static111.anIntArray215[4] + 128 > local23) {
			local23 = Static111.anIntArray215[4] + 128;
		}
		Static273.method4495(Static308.anInt6040, local23 * 3 + 600, local23, Static2.anInt22, Static122.method2036(Static136.aClass10_Sub5_Sub1_1.anInt5016, Static136.aClass10_Sub5_Sub1_1.anInt5073, Static99.anInt1826) - 50, local20, arg0);
		if (local5 == Static230.anInt4492 && Static224.anInt6075 == local7 && local9 == Static173.anInt3251 && local11 == Static79.anInt1912 && local13 == Static113.anInt2103) {
			Static25.anInt467 = 1;
			return;
		}
		Static125.anInt2417 = 10;
		Static31.anInt571 = 10;
		Static6.anInt138 = 10;
		if (local11 < Static79.anInt1912) {
			local11 += (Static79.anInt1912 - local11) * Static31.anInt571 / 1000 + Static6.anInt138;
			if (local11 < Static79.anInt1912) {
				Static79.anInt1912 = local11;
			}
		}
		if (local11 > Static79.anInt1912) {
			local11 -= Static31.anInt571 * (local11 - Static79.anInt1912) / 1000 + Static6.anInt138;
			if (Static79.anInt1912 < local11) {
				Static79.anInt1912 = local11;
			}
		}
		@Pc(170) int local170 = Static113.anInt2103 - local13;
		if (local170 > 1024) {
			local170 -= 2048;
		}
		Static179.anInt3343 = 10;
		if (Static230.anInt4492 > local5) {
			local5 += Static179.anInt3343 + (Static230.anInt4492 - local5) * Static125.anInt2417 / 1000;
			if (local5 < Static230.anInt4492) {
				Static230.anInt4492 = local5;
			}
		}
		if (local5 > Static230.anInt4492) {
			local5 -= Static125.anInt2417 * (local5 - Static230.anInt4492) / 1000 + Static179.anInt3343;
			if (Static230.anInt4492 < local5) {
				Static230.anInt4492 = local5;
			}
		}
		if (local7 < Static224.anInt6075) {
			local7 += Static179.anInt3343 + Static125.anInt2417 * (Static224.anInt6075 - local7) / 1000;
			if (Static224.anInt6075 > local7) {
				Static224.anInt6075 = local7;
			}
		}
		if (local7 > Static224.anInt6075) {
			local7 -= Static179.anInt3343 + Static125.anInt2417 * (local7 - Static224.anInt6075) / 1000;
			if (Static224.anInt6075 < local7) {
				Static224.anInt6075 = local7;
			}
		}
		if (local9 < Static173.anInt3251) {
			local9 += Static179.anInt3343 + (Static173.anInt3251 - local9) * Static125.anInt2417 / 1000;
			if (local9 < Static173.anInt3251) {
				Static173.anInt3251 = local9;
			}
		}
		if (local170 < -1024) {
			local170 += 2048;
		}
		if (local170 > 0) {
			local13 += Static6.anInt138 + Static31.anInt571 * local170 / 1000;
			local13 &= 0x7FF;
		}
		if (Static173.anInt3251 < local9) {
			local9 -= Static179.anInt3343 + Static125.anInt2417 * (local9 - Static173.anInt3251) / 1000;
			if (local9 > Static173.anInt3251) {
				Static173.anInt3251 = local9;
			}
		}
		if (local170 < 0) {
			local13 -= -local170 * Static31.anInt571 / 1000 + Static6.anInt138;
			local13 &= 0x7FF;
		}
		@Pc(391) int local391 = Static113.anInt2103 - local13;
		if (local391 > 1024) {
			local391 -= 2048;
		}
		if (local391 < -1024) {
			local391 += 2048;
		}
		if (local391 >= 0 || local170 <= 0 || local391 > 0 && local170 < 0) {
			Static113.anInt2103 = local13;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
	public static void method501(@OriginalArg(1) boolean arg0) {
		Static12.anIntArray20 = new int[104];
		Static131.anIntArray295 = new int[104];
		Static83.anIntArray154 = new int[104];
		Static22.anIntArray33 = new int[5];
		Static144.anIntArray527 = new int[104];
		Static170.anInt3194 = 99;
		@Pc(24) byte local24;
		if (arg0) {
			local24 = 1;
		} else {
			local24 = 4;
		}
		Static152.anIntArray331 = new int[104];
		Static310.aByteArrayArrayArray20 = new byte[local24][104][104];
		Static188.aByteArrayArrayArray17 = new byte[local24][105][105];
		Static5.aByteArrayArrayArray1 = new byte[local24][104][104];
		Static220.aByteArrayArrayArray19 = new byte[local24][104][104];
		Static86.aByteArrayArrayArray14 = new byte[local24][104][104];
		Static104.anIntArrayArrayArray6 = new int[local24][105][105];
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!rn;Lclient!rn;I)V")
	public static void method502(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1) {
		Static224.aClass155_119 = arg0;
		Static230.aClass155_94 = arg1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IJ)V")
	public static void method503(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static50.anInt961 + Static136.aClass10_Sub5_Sub1_1.anInt5073;
		if (!Static247.aBoolean348) {
			Static84.aFloat21 += Static199.aFloat53 * (float) arg0 / 40.0F;
			Static179.aFloat48 += (float) arg0 * Static258.aFloat65 / 40.0F;
		}
		@Pc(36) int local36 = Static136.aClass10_Sub5_Sub1_1.anInt5016 + Static26.anInt482;
		if (Static308.anInt6040 - local10 < -500 || Static308.anInt6040 - local10 > 500 || Static2.anInt22 - local36 < -500 || Static2.anInt22 - local36 > 500) {
			Static2.anInt22 = local36;
			Static308.anInt6040 = local10;
		}
		@Pc(75) int local75;
		@Pc(83) int local83;
		if (Static308.anInt6040 != local10) {
			local75 = local10 - Static308.anInt6040;
			local83 = (int) ((long) local75 * arg0 / 320L);
			if (local75 > 0) {
				if (local83 == 0) {
					local83 = 1;
				} else if (local83 > local75) {
					local83 = local75;
				}
			} else if (local83 == 0) {
				local83 = -1;
			} else if (local83 < local75) {
				local83 = local75;
			}
			Static308.anInt6040 += local83;
		}
		if (Static2.anInt22 != local36) {
			local75 = local36 - Static2.anInt22;
			local83 = (int) (arg0 * (long) local75 / 320L);
			if (local75 <= 0) {
				if (local83 == 0) {
					local83 = -1;
				} else if (local75 > local83) {
					local83 = local75;
				}
			} else if (local83 == 0) {
				local83 = 1;
			} else if (local75 < local83) {
				local83 = local75;
			}
			Static2.anInt22 += local83;
		}
		Static197.method4292();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!qf;IIIII)V")
	public static void method504(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static158.anInt2948) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static295.anInt4973) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static307.anInt6023 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class3_Sub25 local71 = Static146.aClass3_Sub25ArrayArrayArray7[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static256.anIntArrayArrayArray14[local17][local28][local39] + Static256.anIntArrayArrayArray14[local17][local28 + 1][local39] + Static256.anIntArrayArrayArray14[local17][local28][local39 + 1] + Static256.anIntArrayArrayArray14[local17][local28 + 1][local39 + 1]) / 4 - (Static256.anIntArrayArrayArray14[arg1][arg2][arg3] + Static256.anIntArrayArrayArray14[arg1][arg2 + 1][arg3] + Static256.anIntArrayArrayArray14[arg1][arg2][arg3 + 1] + Static256.anIntArrayArrayArray14[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class19 local161 = local71.aClass19_1;
									if (local161 != null) {
										if (local161.aClass10_3.method4976()) {
											arg0.method4983(local161.aClass10_3, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass10_2 != null && local161.aClass10_2.method4976()) {
											arg0.method4983(local161.aClass10_2, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt4483; local232++) {
										@Pc(241) Class85 local241 = local71.aClass85Array3[local232];
										if (local241 != null && local241.aClass10_7.method4976() && (local28 == local241.anInt2482 || local28 == local3) && (local39 == local241.anInt2480 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt2474 + 1 - local241.anInt2482;
											@Pc(278) int local278 = local241.anInt2478 + 1 - local241.anInt2480;
											arg0.method4983(local241.aClass10_7, (local241.anInt2482 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt2480 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
