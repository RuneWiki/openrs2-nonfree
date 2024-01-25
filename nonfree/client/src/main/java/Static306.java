import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
	public static int anInt5453;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "Lclient!jv;")
	public static final Class126 aClass126_43 = new Class126(20);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!gf;ZLclient!qa;)I")
	public static int method4280(@OriginalArg(0) Class87 arg0, @OriginalArg(2) Class172 arg1) {
		if (arg0.anInt2662 != -1) {
			return arg0.anInt2662;
		}
		if (arg0.anInt2669 != -1) {
			@Pc(26) Class76 local26 = arg1.anInterface5_8.method3918(arg1.method5483() ? arg0.anInt2669 : arg0.anInt2668);
			if (!local26.aBoolean207) {
				return local26.aShort47;
			}
		}
		return arg0.anInt2663;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B[ILclient!at;[I[I)V")
	public static void method4282(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class7_Sub2_Sub3_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg3.length; local1++) {
			@Pc(9) int local9 = arg3[local1];
			@Pc(13) int local13 = arg2[local1];
			@Pc(17) int local17 = arg0[local1];
			for (@Pc(19) int local19 = 0; local13 != 0 && arg1.aClass17Array3.length > local19; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg1.aClass17Array3[local19] = null;
					} else {
						@Pc(35) Class128 local35 = Static301.aClass170_3.method3936(local9);
						@Pc(38) int local38 = local35.anInt3973;
						@Pc(43) Class17 local43 = arg1.aClass17Array3[local19];
						if (local43 != null) {
							if (local9 == local43.anInt770) {
								if (local38 == 0) {
									local43 = arg1.aClass17Array3[local19] = null;
								} else if (local38 == 1) {
									local43.anInt771 = 0;
									local43.anInt767 = local17;
									local43.anInt766 = 0;
									local43.anInt769 = 1;
									local43.anInt768 = 0;
									Static135.method2140(0, local35, arg1.anInt4321, false, arg1.anInt4318, arg1.aByte77);
								} else if (local38 == 2) {
									local43.anInt766 = 0;
								}
							} else if (local35.anInt3977 >= Static301.aClass170_3.method3936(local43.anInt770).anInt3977) {
								local43 = arg1.aClass17Array3[local19] = null;
							}
						}
						if (local43 == null) {
							local43 = arg1.aClass17Array3[local19] = new Class17();
							local43.anInt771 = 0;
							local43.anInt770 = local9;
							local43.anInt769 = 1;
							local43.anInt767 = local17;
							local43.anInt768 = 0;
							local43.anInt766 = 0;
							Static135.method2140(0, local35, arg1.anInt4321, false, arg1.anInt4318, arg1.aByte77);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)I")
	public static int method4283() {
		try {
			if (Static301.anInt2466 == 0) {
				if (Static364.aLong185 > Static118.method1934() - 5000L) {
					return 0;
				}
				Static155.aClass43_5 = Static66.aClass143_2.method3390(Static192.anInt3847, Static241.aString38);
				Static271.aLong151 = Static118.method1934();
				Static301.anInt2466 = 1;
			}
			if (Static271.aLong151 + 30000L < Static118.method1934()) {
				return Static410.method5284(1000);
			}
			@Pc(75) int local75;
			@Pc(105) int local105;
			if (Static301.anInt2466 == 1) {
				if (Static155.aClass43_5.anInt1521 == 2) {
					return Static410.method5284(1001);
				}
				if (Static155.aClass43_5.anInt1521 != 1) {
					return -1;
				}
				Static88.aClass251_2 = new Class251((Socket) Static155.aClass43_5.anObject3, Static66.aClass143_2);
				Static155.aClass43_5 = null;
				local75 = 0;
				Static302.aClass3_Sub7_Sub1_2.anInt3235 = 0;
				if (Static422.aBoolean593) {
					local75 = Static244.anInt4662;
				}
				Static302.aClass3_Sub7_Sub1_2.method2628(Static184.aClass187_9.anInt5402);
				Static302.aClass3_Sub7_Sub1_2.method2636(local75);
				Static88.aClass251_2.method5344(Static302.aClass3_Sub7_Sub1_2.aByteArray46, Static302.aClass3_Sub7_Sub1_2.anInt3235);
				Static349.method4648();
				local105 = Static88.aClass251_2.method5349();
				Static349.method4648();
				if (local105 != 0) {
					return Static410.method5284(local105);
				}
				Static301.anInt2466 = 2;
			}
			if (Static301.anInt2466 == 2) {
				if (Static88.aClass251_2.method5348() < 2) {
					return -1;
				}
				Static28.anInt893 = Static88.aClass251_2.method5349();
				Static28.anInt893 <<= 0x8;
				Static28.anInt893 += Static88.aClass251_2.method5349();
				Static268.aByteArray66 = new byte[Static28.anInt893];
				Static301.anInt2466 = 3;
				Static317.anInt5577 = 0;
			}
			if (Static301.anInt2466 != 3) {
				return -1;
			}
			local75 = Static88.aClass251_2.method5348();
			if (local75 < 1) {
				return -1;
			}
			if (local75 > Static28.anInt893 - Static317.anInt5577) {
				local75 = Static28.anInt893 - Static317.anInt5577;
			}
			Static88.aClass251_2.method5346(Static317.anInt5577, Static268.aByteArray66, local75);
			Static317.anInt5577 += local75;
			if (Static28.anInt893 > Static317.anInt5577) {
				return -1;
			} else if (Static326.method4406(Static268.aByteArray66)) {
				Static57.aClass117_Sub1Array3 = new Class117_Sub1[Static181.anInt3617];
				local105 = 0;
				for (@Pc(208) int local208 = Static73.anInt1827; local208 <= Static398.anInt6550; local208++) {
					@Pc(213) Class117_Sub1 local213 = Static132.method2050(local208);
					if (local213 != null) {
						Static57.aClass117_Sub1Array3[local105++] = local213;
					}
				}
				Static37.aClass3_Sub1_2 = null;
				Static35.anInt997 = 0;
				Static88.aClass251_2.method5345();
				Static301.anInt2466 = 0;
				Static268.aByteArray66 = null;
				Static88.aClass251_2 = null;
				Static186.anInt3732 = 0;
				Static364.aLong185 = Static118.method1934();
				return 0;
			} else {
				return Static410.method5284(1002);
			}
		} catch (@Pc(249) IOException local249) {
			return Static410.method5284(1003);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method4284(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static361.anInt6112++;
		Static97.anInt2207 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static430.anInt3308; local7 < Static362.anInt6122; local7++) {
			@Pc(12) Class118[][] local12 = Static263.aClass118ArrayArrayArray2[local7];
			for (local14 = Static295.anInt5287; local14 < Static415.anInt6801; local14++) {
				for (@Pc(17) int local17 = Static158.anInt3163; local17 < Static259.anInt4915; local17++) {
					@Pc(24) Class118 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static313.aBooleanArrayArray6[local14 + Static80.anInt2001 - Static310.anInt5498][local17 + Static80.anInt2001 - Static111.anInt2450] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean300 = true;
							local24.aBoolean301 = true;
							if (local24.aClass179_2 == null) {
								local24.aBoolean302 = false;
							} else {
								local24.aBoolean302 = true;
							}
							Static97.anInt2207++;
						} else {
							local24.aBoolean300 = false;
							local24.aBoolean301 = false;
							local24.aByte64 = 0;
							if (local14 >= Static310.anInt5498 - 16 && local14 <= Static310.anInt5498 + 16 && local17 >= Static111.anInt2450 - 16 && local17 <= Static111.anInt2450 + 16 && (local24.aClass7_Sub4_2 != null || local24.aClass7_Sub4_1 != null || local24.aClass7_Sub3_3 != null || local24.aClass7_Sub3_2 != null || local24.aClass7_Sub1_1 != null || local24.aClass179_2 != null)) {
								Static275.aClass22_1.method1898(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static85.aClass159Array2 == Static444.aClass159Array3;
		for (local14 = Static430.anInt3308; local14 < Static362.anInt6122; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static255.aClass172_9.method5483() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static313.aBooleanArrayArray6.length;
				if (Static295.anInt5287 + Static313.aBooleanArrayArray6.length > Static405.anInt6684) {
					local172 -= Static295.anInt5287 + Static313.aBooleanArrayArray6.length - Static405.anInt6684;
				}
				@Pc(192) int local192 = Static313.aBooleanArrayArray6[0].length;
				if (Static158.anInt3163 + Static313.aBooleanArrayArray6[0].length > Static37.anInt1025) {
					local192 -= Static158.anInt3163 + Static313.aBooleanArrayArray6[0].length - Static37.anInt1025;
				}
				@Pc(213) int local213 = Static179.anInt5784;
				while (true) {
					if (local213 >= local172) {
						Static275.aClass22_1.method1891(local161, true, local14, Static444.aClass159Array3[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static295.anInt5287 - Static179.anInt5784;
					for (@Pc(222) int local222 = Static445.anInt7533; local222 < local192; local222++) {
						Static14.aBooleanArrayArray1[local213][local222] = false;
						if (Static313.aBooleanArrayArray6[local213][local222]) {
							@Pc(241) int local241 = local222 + Static158.anInt3163 - Static445.anInt7533;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static263.aClass118ArrayArrayArray2[local243][local220][local241] != null && Static263.aClass118ArrayArrayArray2[local243][local220][local241].aByte63 == local14) {
									Static14.aBooleanArrayArray1[local213][local222] = Static263.aClass118ArrayArrayArray2[local243][local220][local241].aBoolean300;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static275.aClass22_1.method1891(local161, false, local14, Static444.aClass159Array3[local14]);
			}
			Static275.aClass22_1.method1889();
		}
		if (!Static333.method4468(true)) {
			Static333.method4468(false);
		}
	}
}
