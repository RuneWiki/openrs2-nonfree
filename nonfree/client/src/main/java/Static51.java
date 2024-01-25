import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method731() {
		if (Static21.aFloat10 < 1024.0F) {
			Static21.aFloat10 = 1024.0F;
		}
		if (Static21.aFloat10 > 3072.0F) {
			Static21.aFloat10 = 3072.0F;
		}
		while (Static246.aFloat51 >= 16384.0F) {
			Static246.aFloat51 -= 16384.0F;
		}
		while (Static246.aFloat51 < 0.0F) {
			Static246.aFloat51 += 16384.0F;
		}
		@Pc(41) int local41 = Static114.anInt2169 >> 7;
		@Pc(45) int local45 = Static169.anInt6309 >> 7;
		@Pc(51) int local51 = Static168.method2721(Static114.anInt2169, Static322.anInt6250, Static169.anInt6309);
		@Pc(58) int local58 = 0;
		@Pc(80) int local80;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local80 = local41 - 4; local80 <= local41 + 4; local80++) {
				for (@Pc(86) int local86 = local45 - 4; local86 <= local45 + 4; local86++) {
					@Pc(90) int local90 = Static322.anInt6250;
					if (local90 < 3 && Static223.method3983(local86, local80)) {
						local90++;
					}
					@Pc(103) int local103 = 0;
					if (Static128.aByteArrayArrayArray4 != null && Static128.aByteArrayArrayArray4[local90] != null) {
						local103 = (Static128.aByteArrayArrayArray4[local90][local80][local86] & 0xFF) * 8;
					}
					@Pc(133) int local133 = local51 + local103 - Static108.aClass77Array2[local90].method4122(local80, local86);
					if (local133 > local58) {
						local58 = local133;
					}
				}
			}
		}
		local80 = local58 * 1536;
		if (local80 > 786432) {
			local80 = 786432;
		}
		if (local80 < 262144) {
			local80 = 262144;
		}
		if (Static79.anInt5248 < local80) {
			Static79.anInt5248 += (local80 - Static79.anInt5248) / 24;
		} else if (Static79.anInt5248 > local80) {
			Static79.anInt5248 += (local80 - Static79.anInt5248) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!ij;I[Lclient!hh;BLclient!uo;)V")
	public static void method732(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class92[] arg3, @OriginalArg(5) Class129 arg4) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(34) int local34;
		if (!arg0) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local13 = 0; local13 < Static24.anInt454; local13++) {
					for (local17 = 0; local17 < Static240.anInt4832; local17++) {
						if ((Static1.aByteArrayArrayArray1[local9][local13][local17] & 0x1) != 0) {
							local34 = local9;
							if ((Static1.aByteArrayArrayArray1[1][local13][local17] & 0x2) != 0) {
								local34 = local9 - 1;
							}
							if (local34 >= 0) {
								arg3[local34].method1761(local17, local13);
							}
						}
					}
				}
			}
		}
		@Pc(73) int[][] local73 = new int[Static24.anInt454][Static240.anInt4832];
		for (local13 = 0; local13 < arg2; local13++) {
			for (local17 = 0; local17 < Static240.anInt4832; local17++) {
				Static184.anIntArray281[local17] = 0;
				Static166.anIntArray217[local17] = 0;
				Static237.anIntArray377[local17] = 0;
				Static258.anIntArray400[local17] = 0;
				Static7.anIntArray10[local17] = 0;
			}
			for (local34 = -5; local34 < Static24.anInt454; local34++) {
				@Pc(121) int local121;
				@Pc(134) int local134;
				@Pc(200) int local200;
				for (@Pc(115) int local115 = 0; local115 < Static240.anInt4832; local115++) {
					local121 = local34 + 5;
					@Pc(181) int local181;
					if (Static24.anInt454 > local121) {
						local134 = Static39.aByteArrayArrayArray2[local13][local121][local115] & 0xFF;
						if (local134 > 0) {
							@Pc(145) Class167 local145 = Static8.method76(local134 - 1);
							Static184.anIntArray281[local115] += local145.anInt5186;
							Static166.anIntArray217[local115] += local145.anInt5187;
							Static237.anIntArray377[local115] += local145.anInt5190;
							Static258.anIntArray400[local115] += local145.anInt5194;
							local181 = Static7.anIntArray10[local115]++;
						}
					}
					local134 = local34 - 5;
					if (local134 >= 0) {
						local200 = Static39.aByteArrayArrayArray2[local13][local134][local115] & 0xFF;
						if (local200 > 0) {
							@Pc(208) Class167 local208 = Static8.method76(local200 - 1);
							Static184.anIntArray281[local115] -= local208.anInt5186;
							Static166.anIntArray217[local115] -= local208.anInt5187;
							Static237.anIntArray377[local115] -= local208.anInt5190;
							Static258.anIntArray400[local115] -= local208.anInt5194;
							local181 = Static7.anIntArray10[local115]--;
						}
					}
				}
				if (local34 >= 0) {
					local121 = 0;
					local134 = 0;
					local200 = 0;
					@Pc(261) int local261 = 0;
					@Pc(263) int local263 = 0;
					for (@Pc(265) int local265 = -5; local265 < Static240.anInt4832; local265++) {
						@Pc(271) int local271 = local265 + 5;
						if (Static240.anInt4832 > local271) {
							local121 += Static184.anIntArray281[local271];
							local261 += Static258.anIntArray400[local271];
							local134 += Static166.anIntArray217[local271];
							local200 += Static237.anIntArray377[local271];
							local263 += Static7.anIntArray10[local271];
						}
						@Pc(312) int local312 = local265 - 5;
						if (local312 >= 0) {
							local200 -= Static237.anIntArray377[local312];
							local263 -= Static7.anIntArray10[local312];
							local134 -= Static166.anIntArray217[local312];
							local121 -= Static184.anIntArray281[local312];
							local261 -= Static258.anIntArray400[local312];
						}
						if (local265 >= 0 && local261 > 0 && local263 > 0) {
							local73[local34][local265] = Static352.method5664(local134 / local263, local121 * 256 / local261, local200 / local263);
						}
					}
				}
			}
			Static126.method3658(arg1, local73, local13, arg0, Static56.aByteArrayArrayArray3[local13], Static24.anInt454, Static240.aByteArrayArrayArray8[local13], Static39.aByteArrayArrayArray2[local13], Static240.anInt4832, Static108.aClass77Array2[local13], Static155.aByteArrayArrayArray5[local13], arg4);
			Static39.aByteArrayArrayArray2[local13] = null;
			Static155.aByteArrayArrayArray5[local13] = null;
			Static240.aByteArrayArrayArray8[local13] = null;
			Static56.aByteArrayArrayArray3[local13] = null;
		}
		if (!arg0) {
			if (Static52.aBoolean313) {
				Static321.method5325();
			}
			if (Static103.anInt1883 != 0) {
				Static274.method4646();
			}
		}
		for (local17 = 0; local17 < arg2; local17++) {
			Static108.aClass77Array2[local17].method4124();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method733(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static20.anInt374; local11++) {
			if (arg0.equalsIgnoreCase(Static193.aStringArray30[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static156.aClass67_Sub3_Sub3_Sub2_2.aString50);
	}
}
