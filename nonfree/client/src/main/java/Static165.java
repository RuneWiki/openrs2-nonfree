import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "Lclient!ea;")
	public static Class73 aClass73_55 = null;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)V")
	public static void method3159(@OriginalArg(0) int arg0) {
		Static181.anInt3980 = -1;
		Static468.anInt8336 = arg0;
		Static315.anInt6316 = -1;
		Static226.method4129();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIZI)V")
	public static void method3160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static26.aClass186ArrayArrayArray1 == null) {
			Static467.aClass5_13.method6123(arg4, arg2, arg1, -16777216, arg0);
		} else if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 >= 0 && Static306.anInt6176 * 512 > Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 >= 0 && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 < Static108.anInt2930 * 512) {
			Static322.anInt6388++;
			if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 != null && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 - (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3620() - 1) * 256 >> 9 == Static473.anInt8390 && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 + 256 - Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3620() * 256 >> 9 == Static445.anInt8080) {
				Static445.anInt8080 = -1;
				Static473.anInt8390 = -1;
				Static269.method8233();
			}
			Static540.method7633();
			if (!arg3) {
				Static373.method5925();
			}
			Static33.method794();
			Static138.method2755(arg1, true, arg4, arg2, arg0);
			@Pc(118) int local118 = Static436.anInt7948;
			@Pc(120) int local120 = Static606.anInt10282;
			Static32.anInt849 = Static32.anInt850;
			@Pc(124) int local124 = Static384.anInt7232;
			@Pc(126) int local126 = Static266.anInt5712;
			@Pc(132) int local132;
			@Pc(169) int local169;
			if (Static554.anInt9497 == 1) {
				local132 = (int) Static532.aFloat179;
				if (Static86.anInt10555 >> 8 > local132) {
					local132 = Static86.anInt10555 >> 8;
				}
				if (Static388.aBooleanArray18[4] && local132 < Static203.anIntArray199[4] + 128) {
					local132 = Static203.anIntArray199[4] + 128;
				}
				local169 = Static141.anInt3352 + (int) Static595.aFloat184 & 0x3FFF;
				Static189.method3493(local169, (local132 >> 3) * 3 + 600 << 2, Static387.anInt7286, local118, Static369.anInt7056, local132, Static150.method2982(Static86.anInt10575, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360) - 200);
			} else if (Static554.anInt9497 == 4) {
				local132 = (int) Static532.aFloat179;
				if (local132 < Static86.anInt10555 >> 8) {
					local132 = Static86.anInt10555 >> 8;
				}
				if (Static388.aBooleanArray18[4] && Static203.anIntArray199[4] + 128 > local132) {
					local132 = Static203.anIntArray199[4] + 128;
				}
				local169 = (int) Static595.aFloat184 & 0x3FFF;
				Static189.method3493(local169, (local132 >> 3) * 3 + 600 << 2, Static387.anInt7286, local118, Static369.anInt7056, local132, Static150.method2982(Static86.anInt10575, Static260.anInt5570, Static150.anInt3512) - 200);
			} else if (Static554.anInt9497 == 5) {
				Static103.method2428(local118);
			}
			local132 = Static184.anInt4048;
			local169 = Static149.anInt3489;
			@Pc(281) int local281 = Static259.anInt6990;
			@Pc(283) int local283 = Static404.anInt4286;
			@Pc(285) int local285 = Static349.anInt6848;
			@Pc(328) int local328;
			for (@Pc(287) int local287 = 0; local287 < 5; local287++) {
				if (Static388.aBooleanArray18[local287]) {
					local328 = (int) (Math.random() * (double) (Static366.anIntArray334[local287] * 2 + 1) - (double) Static366.anIntArray334[local287] + Math.sin((double) Static382.anIntArray344[local287] * ((double) Static367.anIntArray496[local287] / 100.0D)) * (double) Static203.anIntArray199[local287]);
					if (local287 == 3) {
						Static349.anInt6848 = Static349.anInt6848 + local328 & 0x3FFF;
					}
					if (local287 == 0) {
						Static184.anInt4048 += local328 << 2;
					}
					if (local287 == 2) {
						Static259.anInt6990 += local328 << 2;
					}
					if (local287 == 4) {
						Static404.anInt4286 += local328;
						if (Static404.anInt4286 < 1024) {
							Static404.anInt4286 = 1024;
						} else if (Static404.anInt4286 > 3072) {
							Static404.anInt4286 = 3072;
						}
					}
					if (local287 == 1) {
						Static149.anInt3489 += local328 << 2;
					}
				}
			}
			if (Static184.anInt4048 < 0) {
				Static184.anInt4048 = 0;
			}
			if ((Static623.anInt10485 << 9) - 1 < Static184.anInt4048) {
				Static184.anInt4048 = (Static623.anInt10485 << 9) - 1;
			}
			if (Static259.anInt6990 < 0) {
				Static259.anInt6990 = 0;
			}
			if (Static259.anInt6990 > (Static142.anInt3372 << 9) - 1) {
				Static259.anInt6990 = (Static142.anInt3372 << 9) - 1;
			}
			Static339.method5644();
			Static564.method7935();
			Static467.aClass5_13.KA(local120, local126, local124 + local120, local118 + local126);
			Static369.method5892(true);
			if (Static238.aBoolean425) {
				Static517.method7397(Static539.anInt9345);
				if (Static32.anInt849 != Static126.anInt3127) {
					Static610.aBoolean810 = true;
				}
				Static126.anInt3127 = Static32.anInt849;
			} else {
				Static467.aClass5_13.ya();
				local328 = Static539.anInt9345;
				if (Static406.aClass350_1 == null) {
					Static467.aClass5_13.GA(local328);
				} else {
					Static406.aClass350_1.method8120(Static475.anInt8407 << 3, Static404.anInt4286, Static349.anInt6848, local126, local120, Static467.aClass5_13, local118, local124, local328);
				}
			}
			Static245.method4396();
			Static469.aClass115_8.method6283(Static184.anInt4048, Static149.anInt3489, Static259.anInt6990, -Static404.anInt4286 & 0x3FFF, -Static349.anInt6848 & 0x3FFF, -Static535.anInt9282 & 0x3FFF);
			Static467.aClass5_13.method6122(Static469.aClass115_8);
			Static467.aClass5_13.DA(local120 + local124 / 2, local118 / 2 + local126, Static209.anInt4534 << 1, Static209.anInt4534 << 1);
			Static461.method6936(Static209.anInt4534 << 1, Static209.anInt4534 << 1, local126 + local118 / 2, local120 + local124 / 2);
			Static99.method2382(-Static349.anInt6848 & 0x3FFF, Static149.anInt3489, -Static404.anInt4286 & 0x3FFF, -Static535.anInt9282 & 0x3FFF, Static259.anInt6990, Static184.anInt4048);
			@Pc(595) byte local595 = Static87.aClass6_Sub33_6.aClass14_Sub15_2.method5352() == 2 ? (byte) Static322.anInt6388 : 1;
			if (Static238.aBoolean425) {
				Static385.method6060(-Static404.anInt4286 & 0x3FFF, -Static535.anInt9282 & 0x3FFF, -Static349.anInt6848 & 0x3FFF);
				Static293.method5026(Static149.anInt3489, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 + 1, Static538.aByteArrayArrayArray18, Static32.anInt849, Static184.anInt4048, Static84.anIntArray85, Static87.aClass6_Sub33_6.aClass14_Sub13_1.method4443() == 0, Static372.anIntArray335, local595, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 >> 9, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 >> 9, Static502.anIntArray343, Static384.anInt7234, Static515.anIntArray467, Static259.anInt6990, Static574.anIntArray522);
			} else {
				Static118.method2555(Static384.anInt7234, Static184.anInt4048, Static149.anInt3489, Static259.anInt6990, Static538.aByteArrayArrayArray18, Static372.anIntArray335, Static574.anIntArray522, Static502.anIntArray343, Static515.anIntArray467, Static84.anIntArray85, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 + 1, local595, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 >> 9, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 >> 9, Static87.aClass6_Sub33_6.aClass14_Sub13_1.method4443() == 0, Static423.aBoolean622 ? Static32.anInt849 : -1, 0, false);
			}
			Static245.method4396();
			if (Static333.anInt6626 == 10) {
				Static505.method7273(local120, local126, local118, local124);
				Static426.method6610(local124, local118, local120, local126);
				Static514.method7366(local124, local118, local120, local126);
				Static174.method3298(local126, local120, local118, local124);
			}
			Static212.method3801();
			Static349.anInt6848 = local285;
			Static184.anInt4048 = local132;
			Static259.anInt6990 = local281;
			Static404.anInt4286 = local283;
			Static149.anInt3489 = local169;
			if (Static195.aBoolean341 && Static633.aClass152_3.method4610() == 0) {
				Static195.aBoolean341 = false;
			}
			if (Static195.aBoolean341) {
				Static467.aClass5_13.method6123(local124, local118, local126, -16777216, local120);
				Static52.method1637(Static184.aClass213_5, Static359.aClass34_7, false, Static467.aClass5_13, Static536.aClass316_14.method7577(Static638.anInt10709));
			}
			Static369.method5892(false);
		} else {
			Static467.aClass5_13.method6123(arg4, arg2, arg1, -16777216, arg0);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)Z")
	public static boolean method3161() {
		@Pc(10) Class6_Sub26 local10 = (Class6_Sub26) Static349.aClass163_39.method4966();
		if (local10 == null) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < local10.anInt5097; local24++) {
			if (local10.aClass159Array2[local24] != null && local10.aClass159Array2[local24].anInt5910 == 0) {
				return false;
			}
			if (local10.aClass159Array1[local24] != null && local10.aClass159Array1[local24].anInt5910 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z[[BLclient!ms;)V")
	public static void method3166(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class210_Sub1 arg1) {
		@Pc(18) int local18 = Static75.aByteArrayArray1.length;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) byte[] local26 = arg0[local20];
			if (local26 != null) {
				@Pc(38) int local38 = (Static228.anIntArray215[local20] >> 8) * 64 - Static477.anInt8412;
				@Pc(49) int local49 = (Static228.anIntArray215[local20] & 0xFF) * 64 - Static227.anInt5049;
				Static245.method4396();
				arg1.method5815(Static313.aClass258Array1, local49, local26, Static467.aClass5_13, local38);
			}
		}
	}
}
