import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!ik;")
	public static Class182 aClass182_117;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "Lclient!kka;")
	public static final Class214 aClass214_4 = new Class214(64);

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_173 = new Class397(98, 10);

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
	public static int anInt9956 = 0;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_38 = new Class320(15);

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "S")
	public static short aShort114 = 256;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZII[I[I[II[[[B[IBIIIIZ[III)V")
	public static void method8476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) byte[][][] arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) byte arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) boolean arg12, @OriginalArg(15) int[] arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int arg15) {
		if (Static488.anInt7680 == -1) {
			return;
		}
		@Pc(21) int[] local21 = Static536.aClass22_11.Y();
		@Pc(25) int local25 = local21[0];
		@Pc(29) int local29 = local21[1];
		@Pc(33) int local33 = local21[2];
		@Pc(37) int local37 = local21[3];
		@Pc(39) int local39 = local33;
		@Pc(41) int local41 = local37;
		if (Static488.anInt7680 == 1) {
			local39 = (int) ((double) Static316.anInt5077 * (double) local33 / (double) Static182.anInt3160);
			local41 = (int) ((double) Static316.anInt5077 * (double) local37 / (double) Static182.anInt3160);
		}
		if (!Static632.aBoolean653) {
			if (Static488.anInt7680 == 1) {
				Static370.method5076();
			}
			@Pc(79) int local79 = arg11 - Static263.anInt4104;
			@Pc(84) int local84 = arg10 - Static402.anInt6237;
			@Pc(89) int local89 = arg9 - Static501.anInt8000;
			@Pc(111) int local111 = (int) ((double) local39 * (Static381.aDouble11 * (double) local89 + Static640.aDouble24 * (double) local84 + Static638.aDouble23 * (double) local79) / (double) arg0);
			@Pc(133) int local133 = (int) ((Static112.aDouble1 * (double) local84 + Static602.aDouble21 * (double) local79 + Static452.aDouble16 * (double) local89) * (double) local41 / (double) arg0);
			@Pc(148) double local148 = (double) local79 * Static504.aDouble18 + (double) local84 * Static442.aDouble15 + Static404.aDouble13 * (double) local89;
			@Pc(154) int local154 = Static436.anInt6642 + local111 - Static338.anInt5430;
			@Pc(161) int local161 = Static245.anInt3871 + local133 - Static548.anInt8965;
			@Pc(165) int local165 = Static637.anInt8890 + local154;
			@Pc(169) int local169 = local161 + Static316.anInt5077;
			if (local154 >= 0 && local161 >= 0 && local165 <= Static438.anInt6734 && Static182.anInt3160 >= local169 || Static488.anInt7680 == 2) {
				if (Static488.anInt7680 == 2) {
					Static633.aDouble22 = -local148;
				}
				Static511.anInt8098 = local161;
				Static245.anInt3872 = local154;
			} else if (local165 > 0 && local169 > 0 && Static438.anInt6734 > local154 && Static182.anInt3160 > local161) {
				@Pc(258) int local258 = local154 - Static436.anInt6642;
				@Pc(263) int local263 = local161 - Static245.anInt3871;
				@Pc(265) int local265 = 0;
				@Pc(267) int local267 = 0;
				@Pc(269) int local269 = 0;
				@Pc(271) int local271 = 0;
				@Pc(273) double local273 = 0.0D;
				if (Static488.anInt7680 == 0) {
					local273 = Static633.aDouble22 + local148;
					local267 = local263;
					local265 = local258;
				} else if (Static488.anInt7680 == 1) {
					local271 = local263 / Static703.anInt10979;
					local269 = local258 / Static91.anInt2080;
					local267 = local271 * Static703.anInt10979;
					local265 = Static91.anInt2080 * local269;
					local273 = (double) (local258 * local265 + local267 * local263) * (Static633.aDouble22 + local148) / (double) (local263 * local263 + local258 * local258);
				}
				local273 = -local273;
				@Pc(335) int local335 = 0;
				@Pc(337) int local337 = 0;
				@Pc(339) int local339 = 0;
				@Pc(341) int local341 = 0;
				@Pc(343) int local343 = 0;
				@Pc(357) int local357;
				@Pc(352) int local352;
				@Pc(354) int local354;
				@Pc(359) int local359;
				if (local265 < 0) {
					local352 = local265 + Static438.anInt6734;
					local354 = 0;
					local357 = -local265;
					local359 = local357;
					if (Static488.anInt7680 == 1) {
						local343 = -local269;
						local339 = 0;
					}
				} else {
					local357 = 0;
					local352 = Static438.anInt6734 - local265;
					local354 = local352;
					if (Static488.anInt7680 == 1) {
						local343 = local269;
						local339 = Static268.anInt4147 - local269;
					}
					local359 = local265;
				}
				@Pc(395) int local395 = 0;
				@Pc(402) int local402;
				@Pc(407) int local407;
				@Pc(427) int local427;
				@Pc(409) int local409;
				@Pc(429) int local429;
				if (local267 >= 0) {
					local402 = 0;
					local407 = Static182.anInt3160 - local267;
					local409 = local267;
					if (Static488.anInt7680 == 1) {
						local337 = local271;
						local341 = 0;
						local335 = Static250.anInt3897 - local271;
						local395 = local335;
					}
					local427 = local407;
					local429 = 0;
				} else {
					local402 = -local267;
					local407 = Static182.anInt3160 + local267;
					local427 = 0;
					local409 = local402;
					local429 = local402;
					if (Static488.anInt7680 == 1) {
						local337 = -local271;
						local335 = 0;
						local341 = local337;
						local395 = Static250.anInt3897 + local271;
					}
				}
				@Pc(465) Class319 local465 = Static248.aClass386_27.aClass319_13;
				@Pc(479) int local479;
				for (@Pc(470) Class9_Sub6 local470 = (Class9_Sub6) local465.method7195(); local470 != null; local470 = (Class9_Sub6) local465.method7188()) {
					@Pc(475) Class9_Sub9[] local475 = local470.aClass9_Sub9Array1;
					@Pc(477) boolean local477 = true;
					for (local479 = 0; local479 < local475.length; local479++) {
						@Pc(485) Class9_Sub9 local485 = local475[local479];
						@Pc(488) int local488 = local485.anInt10619;
						@Pc(491) int local491 = local485.anInt10618;
						@Pc(494) int local494 = local485.anInt10616;
						@Pc(497) int local497 = local485.anInt10617;
						@Pc(500) int local500 = local485.anInt10620;
						@Pc(507) int local507;
						local485.anInt10618 = local507 = local491 - local267;
						@Pc(515) int local515;
						local485.anInt10616 = local515 = local494 - local265;
						@Pc(523) int local523;
						local485.anInt10619 = local523 = local488 - local265;
						@Pc(531) int local531;
						local485.anInt10617 = local531 = local497 - local267;
						if (local477) {
							@Pc(547) int local547 = (local523 >= local515 ? local515 : local523) - local500;
							if (Static438.anInt6734 >= local547) {
								@Pc(571) int local571 = (local507 >= local531 ? local531 : local507) - local500;
								if (Static182.anInt3160 >= local571) {
									@Pc(586) int local586 = (local523 >= local515 ? local523 : local515) + local500;
									if (local586 >= 0) {
										@Pc(608) int local608 = (local507 < local531 ? local531 : local507) + local500;
										if (local608 >= 0) {
											local477 = false;
										}
									}
								}
							}
						}
					}
					if (local477) {
						local470.method9182();
						Static170.method2742(local470);
					}
				}
				if (Static488.anInt7680 == 0) {
					Static536.aClass22_11.method9398(Static538.anInterface25_1);
				}
				Static536.aClass22_11.F(-local265, -local267);
				Static536.aClass22_11.b(local357, local402, local352, local407, local273);
				Static286.method4023(local273 + Static633.aDouble22);
				Static403.aDouble12 = local273 + Static633.aDouble22;
				if (Static488.anInt7680 == 1) {
					Static662.anInt10154 = local41;
					Static417.anInt8530 = local39;
					Static515.anInt8130 = local29 - Static548.anInt8965 - local267;
					Static521.anInt8160 = local25 - local265 - Static338.anInt5430;
					Static536.aClass22_11.DA(Static521.anInt8160, Static515.anInt8130, Static417.anInt8530, Static662.anInt10154);
				} else {
					Static662.anInt10154 = local41;
					Static417.anInt8530 = local39;
					Static515.anInt8130 = local29 + Static245.anInt3871 - Static548.anInt8965 - local267;
					Static521.anInt8160 = local25 + Static436.anInt6642 - local265 - Static338.anInt5430;
					Static536.aClass22_11.DA(Static521.anInt8160, Static515.anInt8130, Static417.anInt8530, Static662.anInt10154);
				}
				Static312.method4623(Static248.aClass386_27);
				if (local409 > 0) {
					Static536.aClass22_11.KA(0, local427, Static438.anInt6734, local427 + local409);
					Static536.aClass22_11.ya();
					Static536.aClass22_11.GA(Static482.anInt7542);
					Static503.method6862(arg1, arg11, arg10, arg9, arg5, arg3, arg2, arg4, arg13, arg6, arg8, arg7, arg14, arg15, arg12, arg0, 1, false);
				}
				if (local359 > 0) {
					Static536.aClass22_11.KA(local354, local429, local354 + local359, local429 - -local407);
					Static536.aClass22_11.ya();
					Static536.aClass22_11.GA(Static482.anInt7542);
					Static503.method6862(arg1, arg11, arg10, arg9, arg5, arg3, arg2, arg4, arg13, arg6, arg8, arg7, arg14, arg15, arg12, arg0, 1, false);
				}
				Static536.aClass22_11.la();
				Static590.method7609();
				if (Static488.anInt7680 == 0) {
					Static536.aClass22_11.method9351();
				}
				Static633.aDouble22 += local273;
				Static548.anInt8965 += local267;
				Static338.anInt5430 += local265;
				Static511.anInt8098 = Static245.anInt3871 + local133 - Static548.anInt8965;
				Static245.anInt3872 = Static436.anInt6642 + local111 - Static338.anInt5430;
				if (Static488.anInt7680 == 1) {
					Static614.anInt9291 += local269;
					Static406.anInt10703 += local271;
					for (@Pc(867) int local867 = 0; local867 < Static250.anInt3897; local867++) {
						@Pc(878) int local878 = Static639.method8418(Static250.anInt3897, Static406.anInt10703 + local867) * Static268.anInt4147;
						for (local479 = 0; local479 < Static268.anInt4147; local479++) {
							@Pc(891) int local891 = local878 + Static639.method8418(Static268.anInt4147, Static614.anInt9291 + local479);
							@Pc(939) boolean local939 = local867 >= local335 && local867 < local337 + local335 || local867 >= local341 && local867 < local341 + local395 && local479 >= local339 && local479 < local343 + local339;
							Static559.anInterface25Array1[local891].method9261(Static91.anInt2080 * local479, Static703.anInt10979 * local867, Static91.anInt2080, Static703.anInt10979, local939);
						}
					}
				}
			} else {
				Static632.aBoolean653 = true;
			}
		}
		if (Static632.aBoolean653) {
			Static245.anInt3872 = Static436.anInt6642;
			Static338.anInt5430 = 0;
			Static633.aDouble22 = 0.0D;
			Static548.anInt8965 = 0;
			Static511.anInt8098 = Static245.anInt3871;
			Static402.anInt6237 = arg10;
			Static263.anInt4104 = arg11;
			Static501.anInt8000 = arg9;
			if (Static488.anInt7680 == 0) {
				Static536.aClass22_11.method9398(Static538.anInterface25_1);
			}
			Static536.aClass22_11.la();
			Static536.aClass22_11.ya();
			Static536.aClass22_11.GA(Static482.anInt7542);
			Static245.aClass58_2.method9514(Static263.anInt4104, Static402.anInt6237, Static501.anInt8000, Static303.anInt4881, Static119.anInt6368, Static424.anInt6490);
			Static536.aClass22_11.method9405(Static245.aClass58_2);
			if (Static488.anInt7680 == 1) {
				Static515.anInt8130 = local29;
				Static521.anInt8160 = local25;
				Static417.anInt8530 = local39;
				Static662.anInt10154 = local41;
				Static536.aClass22_11.DA(Static521.anInt8160, Static515.anInt8130, Static417.anInt8530, Static662.anInt10154);
			} else {
				Static521.anInt8160 = local25 + Static436.anInt6642;
				Static662.anInt10154 = local41;
				Static515.anInt8130 = local29 + Static245.anInt3871;
				Static417.anInt8530 = local39;
				Static536.aClass22_11.DA(Static521.anInt8160, Static515.anInt8130, Static417.anInt8530, Static662.anInt10154);
			}
			Static403.aDouble12 = 0.0D;
			Static248.aClass386_27.method9000();
			Static312.method4623(Static248.aClass386_27);
			Static503.method6862(arg1, arg11, arg10, arg9, arg5, arg3, arg2, arg4, arg13, arg6, arg8, arg7, arg14, arg15, arg12, arg0, 1, false);
			Static590.method7609();
			Static632.aBoolean653 = false;
			if (Static488.anInt7680 == 0) {
				Static536.aClass22_11.method9351();
			}
			if (Static488.anInt7680 == 1) {
				Static456.method6108();
			}
		}
		if (Static488.anInt7680 == 0) {
			Static538.anInterface25_1.method9262(Static245.anInt3872, Static511.anInt8098, Static637.anInt8890, Static316.anInt5077, 0, 0);
		}
		Static683.anInt10656++;
		Static286.method4023(Static633.aDouble22);
		Static553.aDouble20 = Static633.aDouble22;
		if (Static488.anInt7680 == 0 || Static488.anInt7680 == 2) {
			if (Static488.anInt7680 == 2) {
				Static536.aClass22_11.GA(Static482.anInt7542);
				Static536.aClass22_11.ya();
			}
			Static702.anInt10973 = local41;
			Static482.anInt7546 = local39;
			Static670.anInt10497 = Static245.anInt3871 + local29 - Static548.anInt8965 - Static511.anInt8098;
			Static217.anInt3586 = Static436.anInt6642 + local25 - Static245.anInt3872 - Static338.anInt5430;
			Static536.aClass22_11.DA(Static217.anInt3586, Static670.anInt10497, Static482.anInt7546, Static702.anInt10973);
		} else if (Static488.anInt7680 == 1) {
			Static217.anInt3586 = local25 - Static338.anInt5430;
			Static482.anInt7546 = local39;
			Static670.anInt10497 = local29 - Static548.anInt8965;
			Static702.anInt10973 = local41;
			Static536.aClass22_11.DA(Static217.anInt3586, Static670.anInt10497, Static482.anInt7546, Static702.anInt10973);
			Static536.aClass22_11.KA(Static245.anInt3872, Static511.anInt8098, Static637.anInt8890 + Static245.anInt3872, Static511.anInt8098 - -Static316.anInt5077);
		}
		Static503.method6862(arg1, arg11, arg10, arg9, arg5, arg3, arg2, arg4, arg13, arg6, arg8, arg7, arg14, arg15, arg12, arg0, Static488.anInt7680 == 2 ? 0 : 2, Static488.anInt7680 == 1);
		Static536.aClass22_11.la();
		Static536.aClass22_11.DA(local25, local29, local33, local37);
	}
}
