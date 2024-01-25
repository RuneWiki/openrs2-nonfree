import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "Z")
	public static boolean aBoolean631 = false;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_80 = new Class286(43, 11);

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!cq;)V")
	public static void method7066(@OriginalArg(1) Class19_Sub2 arg0) {
		arg0.aClass19_Sub1_Sub3_Sub2_1 = null;
		if (Static55.anInt908 < 20) {
			Static641.aClass66_10.method1375(arg0);
			Static55.anInt908++;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZIBII[IZ[IB[I[IIII[[[BII[I)V")
	public static void method7067(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) byte arg6, @OriginalArg(9) int[] arg7, @OriginalArg(10) int[] arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) byte[][][] arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int[] arg15) {
		if (Static293.anInt5243 == -1) {
			return;
		}
		@Pc(13) int[] local13 = Static622.aClass67_15.Y();
		@Pc(17) int local17 = local13[0];
		@Pc(21) int local21 = local13[1];
		@Pc(25) int local25 = local13[2];
		@Pc(29) int local29 = local13[3];
		@Pc(31) int local31 = local25;
		@Pc(33) int local33 = local29;
		if (Static293.anInt5243 == 1) {
			local31 = (int) ((double) local25 * (double) Static161.anInt2962 / (double) Static648.anInt10431);
			local33 = (int) ((double) Static161.anInt2962 * (double) local29 / (double) Static648.anInt10431);
		}
		if (!Static70.aBoolean89) {
			if (Static293.anInt5243 == 1) {
				Static336.method4990();
			}
			@Pc(76) int local76 = arg11 - Static537.anInt9047;
			@Pc(81) int local81 = arg1 - Static401.anInt7164;
			@Pc(86) int local86 = arg14 - Static137.anInt2539;
			@Pc(108) int local108 = (int) (((double) local76 * Static244.aDouble16 + (double) local81 * Static204.aDouble14 + (double) local86 * Static470.aDouble22) * (double) local31 / (double) arg3);
			@Pc(130) int local130 = (int) ((Static538.aDouble21 * (double) local86 + (double) local81 * Static33.aDouble1 + Static403.aDouble20 * (double) local76) * (double) local33 / (double) arg3);
			@Pc(145) double local145 = (double) local81 * Static318.aDouble18 + (double) local76 * Static493.aDouble23 + (double) local86 * Static193.aDouble13;
			@Pc(152) int local152 = Static351.anInt5981 + local108 - Static285.anInt5167;
			@Pc(159) int local159 = local130 + Static61.anInt946 - Static556.anInt9259;
			@Pc(163) int local163 = Static396.anInt7103 + local152;
			@Pc(167) int local167 = local159 + Static161.anInt2962;
			if (local152 >= 0 && local159 >= 0 && Static306.anInt5501 >= local163 && Static648.anInt10431 >= local167 || Static293.anInt5243 == 2) {
				Static292.anInt5232 = local152;
				if (Static293.anInt5243 == 2) {
					Static150.aDouble4 = -local145;
				}
				Static575.anInt9444 = local159;
			} else if (local163 > 0 && local167 > 0 && local152 < Static306.anInt5501 && Static648.anInt10431 > local159) {
				@Pc(237) int local237 = local152 - Static351.anInt5981;
				@Pc(242) int local242 = local159 - Static61.anInt946;
				@Pc(244) int local244 = 0;
				@Pc(246) int local246 = 0;
				@Pc(248) int local248 = 0;
				@Pc(250) int local250 = 0;
				@Pc(252) double local252 = 0.0D;
				if (Static293.anInt5243 == 0) {
					local252 = Static150.aDouble4 + local145;
					local244 = local237;
					local246 = local242;
				} else if (Static293.anInt5243 == 1) {
					local250 = local242 / Static523.anInt8898;
					local248 = local237 / Static299.anInt6879;
					local246 = Static523.anInt8898 * local250;
					local244 = Static299.anInt6879 * local248;
					local252 = (double) (local242 * local246 + local237 * local244) * (Static150.aDouble4 + local145) / (double) (local237 * local237 + local242 * local242);
				}
				local252 = -local252;
				@Pc(316) int local316 = 0;
				@Pc(318) int local318 = 0;
				@Pc(320) int local320 = 0;
				@Pc(322) int local322 = 0;
				@Pc(324) int local324 = 0;
				@Pc(326) int local326 = 0;
				@Pc(334) int local334;
				@Pc(339) int local339;
				@Pc(341) int local341;
				@Pc(351) int local351;
				if (local244 < 0) {
					local334 = -local244;
					local339 = Static306.anInt5501 + local244;
					local341 = 0;
					if (Static293.anInt5243 == 1) {
						local324 = -local248;
						local320 = 0;
					}
					local351 = local334;
				} else {
					local339 = Static306.anInt5501 - local244;
					local334 = 0;
					local341 = local339;
					local351 = local244;
					if (Static293.anInt5243 == 1) {
						local324 = local248;
						local320 = Static310.anInt5521 - local248;
					}
				}
				@Pc(385) int local385;
				@Pc(380) int local380;
				@Pc(382) int local382;
				@Pc(387) int local387;
				@Pc(406) int local406;
				if (local246 < 0) {
					local380 = Static648.anInt10431 + local246;
					local382 = 0;
					local385 = -local246;
					local387 = local385;
					if (Static293.anInt5243 == 1) {
						local318 = -local250;
						local316 = 0;
						local326 = Static643.anInt10383 + local250;
						local322 = local318;
					}
					local406 = local385;
				} else {
					local385 = 0;
					local380 = Static648.anInt10431 - local246;
					local406 = 0;
					local382 = local380;
					if (Static293.anInt5243 == 1) {
						local322 = 0;
						local316 = Static643.anInt10383 - local250;
						local318 = local250;
						local326 = local316;
					}
					local387 = local246;
				}
				@Pc(439) Class66 local439 = Static648.aClass88_3.aClass66_1;
				@Pc(453) int local453;
				for (@Pc(444) Class19_Sub8 local444 = (Class19_Sub8) local439.method1381(); local444 != null; local444 = (Class19_Sub8) local439.method1380()) {
					@Pc(449) Class19_Sub6[] local449 = local444.aClass19_Sub6Array1;
					@Pc(451) boolean local451 = true;
					for (local453 = 0; local453 < local449.length; local453++) {
						@Pc(459) Class19_Sub6 local459 = local449[local453];
						@Pc(462) int local462 = local459.anInt5947;
						@Pc(465) int local465 = local459.anInt5948;
						@Pc(468) int local468 = local459.anInt5950;
						@Pc(471) int local471 = local459.anInt5946;
						@Pc(474) int local474 = local459.anInt5949;
						@Pc(481) int local481;
						local459.anInt5947 = local481 = local462 - local244;
						@Pc(488) int local488;
						local459.anInt5948 = local488 = local465 - local246;
						@Pc(495) int local495;
						local459.anInt5946 = local495 = local471 - local246;
						@Pc(502) int local502;
						local459.anInt5950 = local502 = local468 - local244;
						if (local451) {
							@Pc(522) int local522 = (local502 <= local481 ? local502 : local481) - local474;
							if (Static306.anInt5501 >= local522) {
								@Pc(542) int local542 = (local495 <= local488 ? local495 : local488) - local474;
								if (local542 <= Static648.anInt10431) {
									@Pc(562) int local562 = (local481 >= local502 ? local481 : local502) + local474;
									if (local562 >= 0) {
										@Pc(576) int local576 = local474 + (local488 >= local495 ? local488 : local495);
										if (local576 >= 0) {
											local451 = false;
										}
									}
								}
							}
						}
					}
					if (local451) {
						local444.method9359();
						Static235.method3665(local444);
					}
				}
				if (Static293.anInt5243 == 0) {
					Static622.aClass67_15.method7633(Static488.anInterface20_1);
				}
				Static622.aClass67_15.F(-local244, -local246);
				Static622.aClass67_15.b(local334, local385, local339, local380, local252);
				Static340.method4997(local252 + Static150.aDouble4);
				Static224.aDouble15 = local252 + Static150.aDouble4;
				if (Static293.anInt5243 == 1) {
					Static657.anInt10509 = local17 - local244 - Static285.anInt5167;
					Static181.anInt3243 = local31;
					Static488.anInt8458 = local33;
					Static18.anInt10687 = local21 - local246 - Static556.anInt9259;
					Static622.aClass67_15.DA(Static657.anInt10509, Static18.anInt10687, Static181.anInt3243, Static488.anInt8458);
				} else {
					Static488.anInt8458 = local33;
					Static181.anInt3243 = local31;
					Static18.anInt10687 = Static61.anInt946 + local21 - Static556.anInt9259 - local246;
					Static657.anInt10509 = local17 + Static351.anInt5981 - local244 - Static285.anInt5167;
					Static622.aClass67_15.DA(Static657.anInt10509, Static18.anInt10687, Static181.anInt3243, Static488.anInt8458);
				}
				Static447.method6613(Static648.aClass88_3);
				if (local387 > 0) {
					Static622.aClass67_15.KA(0, local382, Static306.anInt5501, local382 + local387);
					Static622.aClass67_15.ya();
					Static622.aClass67_15.GA(Static32.anInt513);
					Static531.method7495(arg2, arg11, arg1, arg14, arg12, arg7, arg8, arg4, arg15, arg5, arg9, arg6, arg10, arg13, arg0, arg3, 1, false);
				}
				if (local351 > 0) {
					Static622.aClass67_15.KA(local341, local406, local351 + local341, local406 - -local380);
					Static622.aClass67_15.ya();
					Static622.aClass67_15.GA(Static32.anInt513);
					Static531.method7495(arg2, arg11, arg1, arg14, arg12, arg7, arg8, arg4, arg15, arg5, arg9, arg6, arg10, arg13, arg0, arg3, 1, false);
				}
				Static622.aClass67_15.la();
				Static302.method4637();
				if (Static293.anInt5243 == 0) {
					Static622.aClass67_15.method7645();
				}
				Static285.anInt5167 += local244;
				Static150.aDouble4 += local252;
				Static556.anInt9259 += local246;
				Static292.anInt5232 = local108 + Static351.anInt5981 - Static285.anInt5167;
				Static575.anInt9444 = Static61.anInt946 + local130 - Static556.anInt9259;
				if (Static293.anInt5243 == 1) {
					Static481.anInt8379 += local250;
					Static179.anInt3232 += local248;
					for (@Pc(837) int local837 = 0; local837 < Static643.anInt10383; local837++) {
						@Pc(848) int local848 = Static119.method2060(Static481.anInt8379 + local837, Static643.anInt10383) * Static310.anInt5521;
						for (local453 = 0; local453 < Static310.anInt5521; local453++) {
							@Pc(861) int local861 = Static119.method2060(local453 + Static179.anInt3232, Static310.anInt5521) + local848;
							@Pc(920) boolean local920 = local316 <= local837 && local318 + local316 > local837 || local837 >= local322 && local837 < local326 + local322 && local453 >= local320 && local320 + local324 > local453;
							Static76.anInterface20Array1[local861].method9153(local453 * Static299.anInt6879, local837 * Static523.anInt8898, Static299.anInt6879, Static523.anInt8898, local920);
						}
					}
				}
			} else {
				Static70.aBoolean89 = true;
			}
		}
		if (Static70.aBoolean89) {
			Static285.anInt5167 = 0;
			Static401.anInt7164 = arg1;
			Static150.aDouble4 = 0.0D;
			Static137.anInt2539 = arg14;
			Static292.anInt5232 = Static351.anInt5981;
			Static556.anInt9259 = 0;
			Static537.anInt9047 = arg11;
			Static575.anInt9444 = Static61.anInt946;
			if (Static293.anInt5243 == 0) {
				Static622.aClass67_15.method7633(Static488.anInterface20_1);
			}
			Static622.aClass67_15.la();
			Static622.aClass67_15.ya();
			Static622.aClass67_15.GA(Static32.anInt513);
			Static640.aClass181_14.method6352(Static537.anInt9047, Static401.anInt7164, Static137.anInt2539, Static587.anInt9597, Static553.anInt9241, Static175.anInt10578);
			Static622.aClass67_15.method7642(Static640.aClass181_14);
			if (Static293.anInt5243 == 1) {
				Static18.anInt10687 = local21;
				Static488.anInt8458 = local33;
				Static657.anInt10509 = local17;
				Static181.anInt3243 = local31;
				Static622.aClass67_15.DA(Static657.anInt10509, Static18.anInt10687, Static181.anInt3243, Static488.anInt8458);
			} else {
				Static488.anInt8458 = local33;
				Static181.anInt3243 = local31;
				Static18.anInt10687 = local21 + Static61.anInt946;
				Static657.anInt10509 = Static351.anInt5981 + local17;
				Static622.aClass67_15.DA(Static657.anInt10509, Static18.anInt10687, Static181.anInt3243, Static488.anInt8458);
			}
			Static224.aDouble15 = 0.0D;
			Static648.aClass88_3.method2241();
			Static447.method6613(Static648.aClass88_3);
			Static531.method7495(arg2, arg11, arg1, arg14, arg12, arg7, arg8, arg4, arg15, arg5, arg9, arg6, arg10, arg13, arg0, arg3, 1, false);
			Static302.method4637();
			Static70.aBoolean89 = false;
			if (Static293.anInt5243 == 0) {
				Static622.aClass67_15.method7645();
			}
			if (Static293.anInt5243 == 1) {
				Static45.method612();
			}
		}
		if (Static293.anInt5243 == 0) {
			Static488.anInterface20_1.method9154(Static292.anInt5232, Static575.anInt9444, Static396.anInt7103, Static161.anInt2962, 0, 0);
		}
		Static686.anInt7557++;
		Static340.method4997(Static150.aDouble4);
		Static679.aDouble26 = Static150.aDouble4;
		if (Static293.anInt5243 == 0 || Static293.anInt5243 == 2) {
			if (Static293.anInt5243 == 2) {
				Static622.aClass67_15.GA(Static32.anInt513);
				Static622.aClass67_15.ya();
			}
			Static629.anInt10191 = local31;
			Static636.anInt10299 = local17 + Static351.anInt5981 - Static285.anInt5167 - Static292.anInt5232;
			Static707.anInt11052 = local33;
			Static407.anInt7262 = Static61.anInt946 + local21 - Static575.anInt9444 - Static556.anInt9259;
			Static622.aClass67_15.DA(Static636.anInt10299, Static407.anInt7262, Static629.anInt10191, Static707.anInt11052);
		} else if (Static293.anInt5243 == 1) {
			Static629.anInt10191 = local31;
			Static636.anInt10299 = local17 - Static285.anInt5167;
			Static407.anInt7262 = local21 - Static556.anInt9259;
			Static707.anInt11052 = local33;
			Static622.aClass67_15.DA(Static636.anInt10299, Static407.anInt7262, Static629.anInt10191, Static707.anInt11052);
			Static622.aClass67_15.KA(Static292.anInt5232, Static575.anInt9444, Static292.anInt5232 + Static396.anInt7103, Static161.anInt2962 + Static575.anInt9444);
		}
		Static531.method7495(arg2, arg11, arg1, arg14, arg12, arg7, arg8, arg4, arg15, arg5, arg9, arg6, arg10, arg13, arg0, arg3, Static293.anInt5243 == 2 ? 0 : 2, Static293.anInt5243 == 1);
		Static622.aClass67_15.la();
		Static622.aClass67_15.DA(local17, local21, local25, local29);
	}
}
