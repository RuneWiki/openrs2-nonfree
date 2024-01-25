import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	public static int anInt4625;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[J")
	public static final long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Z")
	public static boolean aBoolean328 = false;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[128][128];

	@OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
	public static final int[] anIntArray397 = new int[1000];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)I")
	public static int method3770(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3771(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static51.method705(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static51.method705(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(51) int local51 = local14 - local11;
		if (local51 < 1 || local51 > 12) {
			return null;
		}
		@Pc(64) StringBuffer local64 = new StringBuffer(local51);
		for (@Pc(66) int local66 = local11; local66 < local14; local66++) {
			@Pc(72) char local72 = arg0.charAt(local66);
			if (Static343.method4584(local72)) {
				@Pc(80) char local80 = Static403.method5081(local72);
				if (local80 != '\u0000') {
					local64.append(local80);
				}
			}
		}
		if (local64.length() == 0) {
			return null;
		} else {
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)I")
	public static int method3772() {
		if (Static300.aFrame4 == null) {
			return Static136.aBoolean159 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
	public static void method3773() {
		for (@Pc(1) int local1 = 0; local1 < Static312.anInt5377; local1++) {
			if (!Static40.aBooleanArray3[local1]) {
				@Pc(10) Class250 local10 = Static210.aClass250Array1[local1];
				@Pc(13) Class2_Sub29 local13 = local10.aClass2_Sub29_2;
				@Pc(16) int local16 = local10.anInt6796;
				@Pc(22) int local22 = local13.method5691() - Static179.anInt3078;
				@Pc(30) int local30 = (local22 * 2 >> Static460.anInt7074) + 1;
				@Pc(32) int local32 = 0;
				@Pc(37) int[] local37 = new int[local30 * local30];
				@Pc(45) int local45 = local13.method5687() - local22 >> Static460.anInt7074;
				@Pc(53) int local53 = local13.method5693() - local22 >> Static460.anInt7074;
				@Pc(61) int local61 = local13.method5693() + local22 >> Static460.anInt7074;
				if (local53 < 0) {
					local32 = -local53;
					local53 = 0;
				}
				if (local61 >= Static316.anInt5459) {
					local61 = Static316.anInt5459 - 1;
				}
				for (@Pc(78) int local78 = local53; local78 <= local61; local78++) {
					@Pc(84) short local84 = local10.aShortArray98[local32];
					@Pc(88) int local88 = local84 >>> 8;
					@Pc(94) int local94 = local32 * local30 + local88;
					@Pc(100) int local100 = local45 + (local84 >>> 8);
					@Pc(108) int local108 = local100 + (local84 & 0xFF) - 1;
					if (local100 < 0) {
						local94 -= local100;
						local100 = 0;
					}
					if (local108 >= Static169.anInt2876) {
						local108 = Static169.anInt2876 - 1;
					}
					for (@Pc(125) int local125 = local100; local125 <= local108; local125++) {
						@Pc(128) byte local128 = 1;
						@Pc(141) Class3_Sub4 local141 = Static144.method2120(local16, local125, local78, tn.class);
						if (local141 != null && local141.aByte92 != 0) {
							@Pc(159) boolean local159;
							@Pc(168) boolean local168;
							@Pc(182) short local182;
							@Pc(188) int local188;
							@Pc(194) int local194;
							if (local141.aByte92 == 1) {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 + 1 <= local61) {
									local182 = local10.aShortArray98[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 - 1 >= local53) {
									local182 = local10.aShortArray98[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 4;
								} else if (local168 && !local159) {
									local128 = 2;
								}
							} else {
								local159 = local125 - 1 >= local100;
								local168 = local125 + 1 <= local108;
								if (!local159 && local78 - 1 >= local53) {
									local182 = local10.aShortArray98[local32 - 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local159 = local125 > local188 && local125 < local194;
								}
								if (!local168 && local78 + 1 <= local61) {
									local182 = local10.aShortArray98[local32 + 1];
									local188 = local45 + (local182 >>> 8);
									local194 = local188 + (local182 & 0xFF);
									local168 = local125 > local188 && local125 < local194;
								}
								if (local159 && !local168) {
									local128 = 3;
								} else if (local168 && !local159) {
									local128 = 5;
								}
							}
						}
						local37[local94++] = local128;
					}
					local32++;
				}
				Static40.aBooleanArray3[local1] = true;
				Static345.aClass162Array3[local16].method3274(local13, local37);
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!za;I)V")
	public static void method3775(@OriginalArg(0) Class163 arg0) {
		@Pc(7) int local7 = Static275.anInt4524;
		@Pc(9) int local9 = Static253.anInt4058;
		@Pc(11) int local11 = Static246.anInt3972;
		@Pc(15) int local15 = Static429.anInt6935 - 3;
		if (Static325.aClass13_21 == null || Static114.aClass13_9 == null) {
			if (Static103.aClass54_28.method1131(Static120.anInt2211) && Static103.aClass54_28.method1131(Static205.anInt3429)) {
				Static325.aClass13_21 = arg0.method5549(Static461.method262(Static103.aClass54_28, Static120.anInt2211, 0));
				@Pc(44) Class17 local44 = Static461.method262(Static103.aClass54_28, Static205.anInt3429, 0);
				Static114.aClass13_9 = arg0.method5549(local44);
				local44.method253();
				Static410.aClass13_23 = arg0.method5549(local44);
			} else {
				arg0.P(local7, local9, local11, 20, Static323.anInt2072 | 255 - Static243.anInt609 << 24, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static325.aClass13_21 != null && Static114.aClass13_9 != null) {
			local87 = (local11 - Static114.aClass13_9.YA() * 2) / Static325.aClass13_21.YA();
			for (local89 = 0; local89 < local87; local89++) {
				Static325.aClass13_21.method5668(Static114.aClass13_9.YA() + local7 + local89 * Static325.aClass13_21.YA(), local9);
			}
			Static114.aClass13_9.method5668(local7, local9);
			Static410.aClass13_23.method5668(local11 + local7 - Static410.aClass13_23.YA(), local9);
		}
		Static143.aClass92_3.method4512(local9 + 14, local7 + 3, Static445.aClass134_104.method2720(Static331.anInt5597), Static8.anInt128 | 0xFF000000, -1);
		arg0.P(local7, local9 + 20, local11, local15 - 20, Static323.anInt2072 | -Static243.anInt609 + 255 << 24, 1);
		local87 = Static376.aClass203_1.method4918();
		local89 = Static376.aClass203_1.method4925();
		@Pc(173) int local173 = 0;
		@Pc(195) int local195;
		for (@Pc(178) Class2_Sub46 local178 = (Class2_Sub46) Static261.aClass156_13.method3155(); local178 != null; local178 = (Class2_Sub46) Static261.aClass156_13.method3150()) {
			local195 = local9 + (-local173 + -1 + Static137.anInt6647) * 16 + 33;
			if (local7 < local87 && local11 + local7 > local87 && local89 > local195 - 13 && local195 + 4 > local89 && local178.aBoolean530) {
				arg0.P(local7, local195 - 12, local11, 16, 255 - Static136.anInt2425 << 24 | Static116.anInt2168, 1);
			}
			local173++;
		}
		if ((Static291.aClass13_18 == null || Static171.aClass13_12 == null || Static237.aClass13_14 == null) && Static103.aClass54_28.method1131(Static75.anInt1422) && Static103.aClass54_28.method1131(Static401.anInt6550) && Static103.aClass54_28.method1131(Static96.anInt1853)) {
			@Pc(274) Class17 local274 = Static461.method262(Static103.aClass54_28, Static401.anInt6550, 0);
			Static171.aClass13_12 = arg0.method5549(local274);
			local274.method253();
			Static86.aClass13_24 = arg0.method5549(local274);
			Static291.aClass13_18 = arg0.method5549(Static461.method262(Static103.aClass54_28, Static75.anInt1422, 0));
			@Pc(299) Class17 local299 = Static461.method262(Static103.aClass54_28, Static96.anInt1853, 0);
			Static237.aClass13_14 = arg0.method5549(local299);
			local299.method253();
			Static303.aClass13_20 = arg0.method5549(local299);
		}
		@Pc(368) int local368;
		@Pc(330) int local330;
		if (Static291.aClass13_18 != null && Static171.aClass13_12 != null && Static237.aClass13_14 != null) {
			local195 = (local11 - Static237.aClass13_14.YA() * 2) / Static291.aClass13_18.YA();
			for (local330 = 0; local330 < local195; local330++) {
				Static291.aClass13_18.method5668(Static237.aClass13_14.YA() + local7 + Static291.aClass13_18.YA() * local330, local9 + (local15 - Static291.aClass13_18.ZA()));
			}
			local368 = (local15 - Static237.aClass13_14.ZA() - 20) / Static171.aClass13_12.ZA();
			for (@Pc(370) int local370 = 0; local370 < local368; local370++) {
				Static171.aClass13_12.method5668(local7, local9 + local370 * Static171.aClass13_12.ZA() + 20);
				Static86.aClass13_24.method5668(local7 + local11 - Static86.aClass13_24.YA(), local9 + 20 - -(Static171.aClass13_12.ZA() * local370));
			}
			Static237.aClass13_14.method5668(local7, local15 + local9 - Static237.aClass13_14.ZA());
			Static303.aClass13_20.method5668(local7 + local11 - Static237.aClass13_14.YA(), local15 + local9 + -Static237.aClass13_14.ZA());
		}
		local173 = 0;
		for (@Pc(441) Class2_Sub46 local441 = (Class2_Sub46) Static261.aClass156_13.method3155(); local441 != null; local441 = (Class2_Sub46) Static261.aClass156_13.method3150()) {
			local330 = local9 + (Static137.anInt6647 + -1 + -local173) * 16 + 13 + 20;
			local368 = Static8.anInt128 | 0xFF000000;
			if (local87 > local7 && local7 + local11 > local87 && local89 > local330 - 13 && local89 < local330 + 4 && local441.aBoolean530) {
				local368 = Static124.anInt1090 | 0xFF000000;
			}
			@Pc(502) int[] local502 = null;
			if (Static388.method3886(local441.anInt7283)) {
				local502 = Static384.aClass164_2.method3458((int) local441.aLong226).anIntArray500;
			} else if (local441.anInt7282 != -1) {
				local502 = Static384.aClass164_2.method3458(local441.anInt7282).anIntArray500;
			} else if (Static346.method4610(local441.anInt7283)) {
				@Pc(534) Class2_Sub28 local534 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local441.aLong226);
				if (local534 != null) {
					@Pc(539) Class3_Sub4_Sub1_Sub1 local539 = local534.aClass3_Sub4_Sub1_Sub1_1;
					@Pc(542) Class245 local542 = local539.aClass245_1;
					if (local542.anIntArray560 != null) {
						local542 = local542.method5205(Static138.aClass268_1);
					}
					if (local542 != null) {
						local502 = local542.anIntArray561;
					}
				}
			} else if (Static181.method2510(local441.anInt7283)) {
				@Pc(578) Class192 local578;
				if (local441.anInt7283 == 1009) {
					local578 = Static50.aClass190_1.method4218((int) local441.aLong226);
				} else {
					local578 = Static50.aClass190_1.method4218((int) (local441.aLong226 >>> 32 & 0x7FFFFFFFL));
				}
				if (local578.anIntArray434 != null) {
					local578 = local578.method4228(Static138.aClass268_1);
				}
				if (local578 != null) {
					local502 = local578.anIntArray436;
				}
			}
			@Pc(611) String local611 = Static359.method4734(local441);
			if (local502 != null) {
				local611 = local611 + Static186.method5106(local502);
			}
			Static143.aClass92_3.method4503(Static181.anIntArray245, local7 + 3, Static271.aClass13Array14, local368, local611, local330);
			local173++;
			if (local441.aBoolean531) {
				Static143.aClass13_11.method5668(local7 + Static241.aClass141_5.method2914(local611) + 5, local330 + -12);
			}
		}
		Static79.method1167(Static246.anInt3972, Static275.anInt4524, Static429.anInt6935, Static253.anInt4058);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	public static void method3776() {
		if (Static290.anInt4777 == 2) {
			Static37.method5022(3);
		} else if (Static290.anInt4777 == 6) {
			Static37.method5022(7);
		} else if (Static290.anInt4777 == 9) {
			Static37.method5022(10);
		}
	}
}
