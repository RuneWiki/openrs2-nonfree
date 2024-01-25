import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "[Lclient!sh;")
	public static final Class292[] aClass292Array1 = new Class292[100];

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "[I")
	public static final int[] anIntArray431 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLclient!pq;)V")
	public static void method3512(@OriginalArg(1) Class251 arg0) {
		Static425.anInt9464 = arg0.method5863("p11_full");
		Static563.anInt9403 = arg0.method5863("p12_full");
		Static422.anInt7470 = arg0.method5863("b12_full");
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLclient!qe;)V")
	public static void method3513(@OriginalArg(1) Class6_Sub14_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method6045();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static199.anInt3448; local12++) {
			local18 = Static272.anIntArray443[local12];
			if ((Static365.aByteArray80[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static365.aByteArray80[local18] = (byte) (Static365.aByteArray80[local18] | 0x2);
				} else {
					local46 = arg0.method6052(1);
					if (local46 == 0) {
						local7 = Static455.method6532(arg0);
						Static365.aByteArray80[local18] = (byte) (Static365.aByteArray80[local18] | 0x2);
					} else {
						Static6.method1745(arg0, local18);
					}
				}
			}
		}
		arg0.method6051();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method6045();
		@Pc(120) int local120;
		for (local18 = 0; local18 < Static199.anInt3448; local18++) {
			local46 = Static272.anIntArray443[local18];
			if ((Static365.aByteArray80[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static365.aByteArray80[local46] = (byte) (Static365.aByteArray80[local46] | 0x2);
					local7--;
				} else {
					local120 = arg0.method6052(1);
					if (local120 == 0) {
						local7 = Static455.method6532(arg0);
						Static365.aByteArray80[local46] = (byte) (Static365.aByteArray80[local46] | 0x2);
					} else {
						Static6.method1745(arg0, local46);
					}
				}
			}
		}
		arg0.method6051();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method6045();
		@Pc(200) int local200;
		for (local46 = 0; local46 < Static176.anInt3143; local46++) {
			local120 = Static409.anIntArray255[local46];
			if ((Static365.aByteArray80[local120] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static365.aByteArray80[local120] = (byte) (Static365.aByteArray80[local120] | 0x2);
				} else {
					local200 = arg0.method6052(1);
					if (local200 == 0) {
						local7 = Static455.method6532(arg0);
						Static365.aByteArray80[local120] = (byte) (Static365.aByteArray80[local120] | 0x2);
					} else if (Static525.method7355(local120, arg0)) {
						Static365.aByteArray80[local120] = (byte) (Static365.aByteArray80[local120] | 0x2);
					}
				}
			}
		}
		arg0.method6051();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method6045();
		for (local120 = 0; local120 < Static176.anInt3143; local120++) {
			local200 = Static409.anIntArray255[local120];
			if ((Static365.aByteArray80[local200] & 0x1) == 0) {
				if (local7 > 0) {
					Static365.aByteArray80[local200] = (byte) (Static365.aByteArray80[local200] | 0x2);
					local7--;
				} else {
					@Pc(291) int local291 = arg0.method6052(1);
					if (local291 == 0) {
						local7 = Static455.method6532(arg0);
						Static365.aByteArray80[local200] = (byte) (Static365.aByteArray80[local200] | 0x2);
					} else if (Static525.method7355(local200, arg0)) {
						Static365.aByteArray80[local200] = (byte) (Static365.aByteArray80[local200] | 0x2);
					}
				}
			}
		}
		arg0.method6051();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static176.anInt3143 = 0;
		Static199.anInt3448 = 0;
		for (local200 = 1; local200 < 2048; local200++) {
			Static365.aByteArray80[local200] = (byte) (Static365.aByteArray80[local200] >> 1);
			@Pc(371) Class29_Sub2_Sub1_Sub2 local371 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local200];
			if (local371 == null) {
				Static409.anIntArray255[Static176.anInt3143++] = local200;
			} else {
				Static272.anIntArray443[Static199.anInt3448++] = local200;
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZIIII)V")
	public static void method3514(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && arg3 == Static274.anInt3319 && Static374.anInt6445 == arg1 && (Static282.anInt4677 == Static356.anInt6242 || Static480.aClass6_Sub37_Sub1_1.method5165(Static567.anInt9503))) {
			return;
		}
		Static274.anInt3319 = arg3;
		Static356.anInt6242 = Static282.anInt4677;
		Static374.anInt6445 = arg1;
		if (Static480.aClass6_Sub37_Sub1_1.method5165(Static567.anInt9503)) {
			Static356.anInt6242 = 0;
		}
		Static99.method1593(arg2);
		Static87.method1420(Static141.aClass104_11.method2145(Static470.anInt7957), Static85.aClass56_2, true);
		@Pc(56) int local56 = Static218.anInt3718;
		Static218.anInt3718 = (Static274.anInt3319 - (Static301.anInt4912 >> 4)) * 8;
		@Pc(66) int local66 = Static167.anInt3048;
		Static167.anInt3048 = (Static374.anInt6445 - (Static473.anInt7969 >> 4)) * 8;
		Static60.aClass6_Sub1_Sub9_1 = Static349.method6175(Static274.anInt3319 * 8, Static374.anInt6445 * 8);
		Static517.aClass252_6 = null;
		@Pc(98) int local98 = Static218.anInt3718 - local56;
		@Pc(103) int local103 = Static167.anInt3048 - local66;
		@Pc(110) int local110;
		@Pc(123) int local123;
		@Pc(241) int local241;
		@Pc(187) int local187;
		if (arg2 == 11) {
			for (local110 = 0; local110 < Static505.anInt8419; local110++) {
				@Pc(116) Class6_Sub28 local116 = Static354.aClass6_Sub28Array1[local110];
				if (local116 != null) {
					@Pc(121) Class29_Sub2_Sub1_Sub1 local121 = local116.aClass29_Sub2_Sub1_Sub1_2;
					for (local123 = 0; local123 < 10; local123++) {
						local121.anIntArray661[local123] -= local98;
						local121.anIntArray660[local123] -= local103;
					}
					local121.anInt9218 -= local103 * 512;
					local121.anInt9222 -= local98 * 512;
				}
			}
		} else {
			@Pc(173) boolean local173 = false;
			Static516.anInt8936 = 0;
			@Pc(181) int local181 = (Static301.anInt4912 - 1) * 512;
			local187 = Static473.anInt7969 * 512 - 512;
			for (local123 = 0; local123 < Static505.anInt8419; local123++) {
				@Pc(195) Class6_Sub28 local195 = Static354.aClass6_Sub28Array1[local123];
				if (local195 != null) {
					@Pc(200) Class29_Sub2_Sub1_Sub1 local200 = local195.aClass29_Sub2_Sub1_Sub1_2;
					local200.anInt9222 -= local98 * 512;
					local200.anInt9218 -= local103 * 512;
					if (local200.anInt9222 >= 0 && local181 >= local200.anInt9222 && local200.anInt9218 >= 0 && local187 >= local200.anInt9218) {
						@Pc(239) boolean local239 = true;
						for (local241 = 0; local241 < 10; local241++) {
							local200.anIntArray661[local241] -= local98;
							local200.anIntArray660[local241] -= local103;
							if (local200.anIntArray661[local241] < 0 || local200.anIntArray661[local241] >= Static301.anInt4912 || local200.anIntArray660[local241] < 0 || local200.anIntArray660[local241] >= Static473.anInt7969) {
								local239 = false;
							}
						}
						if (local239) {
							Static274.anIntArray385[Static516.anInt8936++] = local200.anInt8541;
						} else {
							local200.method1594(null);
							local173 = true;
							local195.method7849();
						}
					} else {
						local200.method1594(null);
						local195.method7849();
						local173 = true;
					}
				}
			}
			if (local173) {
				Static505.anInt8419 = Static31.aClass212_1.method5105();
				Static31.aClass212_1.method5100(Static354.aClass6_Sub28Array1);
			}
		}
		for (local110 = 0; local110 < 2048; local110++) {
			@Pc(353) Class29_Sub2_Sub1_Sub2 local353 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local110];
			if (local353 != null) {
				for (local187 = 0; local187 < 10; local187++) {
					local353.anIntArray661[local187] -= local98;
					local353.anIntArray660[local187] -= local103;
				}
				local353.anInt9218 -= local103 * 512;
				local353.anInt9222 -= local98 * 512;
			}
		}
		@Pc(405) Class129[] local405 = Static34.aClass129Array4;
		for (local187 = 0; local187 < local405.length; local187++) {
			@Pc(413) Class129 local413 = local405[local187];
			if (local413 != null) {
				local413.anInt3169 -= local98 * 512;
				local413.anInt3176 -= local103 * 512;
			}
		}
		for (@Pc(445) Class6_Sub51 local445 = (Class6_Sub51) Static419.aClass275_193.method6366(); local445 != null; local445 = (Class6_Sub51) Static419.aClass275_193.method6364()) {
			local445.anInt9513 -= local103;
			local445.anInt9518 -= local98;
			if (Static228.anInt3904 != 4 && (local445.anInt9518 < 0 || local445.anInt9513 < 0 || local445.anInt9518 >= Static301.anInt4912 || local445.anInt9513 >= Static473.anInt7969)) {
				local445.method7849();
			}
		}
		if (Static228.anInt3904 != 4) {
			for (@Pc(501) Class6_Sub32 local501 = (Class6_Sub32) Static303.aClass212_22.method5099(); local501 != null; local501 = (Class6_Sub32) Static303.aClass212_22.method5103()) {
				@Pc(509) int local509 = (int) (local501.aLong249 & 0x3FFFL);
				@Pc(514) int local514 = local509 - Static218.anInt3718;
				local241 = (int) (local501.aLong249 >> 14 & 0x3FFFL);
				@Pc(526) int local526 = local241 - Static167.anInt3048;
				if (local514 < 0 || local526 < 0 || Static301.anInt4912 <= local514 || Static473.anInt7969 <= local526) {
					local501.method7849();
				}
			}
		}
		if (Static334.anInt5975 != 0) {
			Static334.anInt5975 -= local98;
			Static16.anInt311 -= local103;
		}
		Static56.method745();
		if (arg2 != 11) {
			Static388.anInt6921 -= local98 * 512;
			Static71.anInt1189 -= local98;
			Static190.anInt4029 -= local103;
			Static220.anInt3753 -= local103 * 512;
			Static152.anInt2703 -= local103;
			Static159.anInt2791 -= local98;
			if (Math.abs(local98) > Static301.anInt4912 || Math.abs(local103) > Static473.anInt7969) {
				Static528.method7588();
			}
		} else if (Static354.anInt6233 == 4) {
			Static135.anInt2370 -= local98 * 512;
			Static224.anInt3801 -= local103 * 512;
			Static285.anInt4695 -= local103 * 512;
			Static141.anInt2539 -= local98 * 512;
		} else {
			Static354.anInt6233 = 1;
		}
		Static322.method4982();
		Static260.method3646();
		Static463.aClass275_203.method6357();
		Static475.aClass275_170.method6357();
		Static206.aClass249_3.method5818();
		Static171.method2653();
	}
}
