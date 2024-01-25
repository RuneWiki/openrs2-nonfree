import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
	public static final int anInt6634 = 12;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
	public static int anInt6637 = 104;

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "[I")
	public static final int[] anIntArray506 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLclient!sp;)V")
	public static void method5564(@OriginalArg(1) Class4_Sub39 arg0) {
		if (arg0 == null || arg0 == Static58.aClass116_7.aClass4_121) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt5722;
		@Pc(18) int local18 = arg0.anInt5718;
		@Pc(21) int local21 = arg0.anInt5716;
		@Pc(25) int local25 = (int) arg0.aLong184;
		@Pc(28) long local28 = arg0.aLong184;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(38) int local38;
		@Pc(36) int local36;
		if (Static138.aClass4_Sub28_2 == null) {
			local36 = Static320.anInt6202;
			local38 = Static196.anInt6632;
		} else {
			local38 = Static138.aClass4_Sub28_2.method5555();
			local36 = Static138.aClass4_Sub28_2.method5559();
		}
		if (local21 == 12) {
			Static107.anInt6417 = local36;
			Static247.anInt5050 = 0;
			Static116.anInt2759 = local38;
			Static215.anInt4410 = 2;
			Static15.aClass4_Sub11_Sub1_2.method706(82);
			Static15.aClass4_Sub11_Sub1_2.method3459(Static136.anInt3193 + local18);
			Static15.aClass4_Sub11_Sub1_2.method3438(local15 + Static286.anInt6699);
			Static15.aClass4_Sub11_Sub1_2.method3402(local25);
			Static15.aClass4_Sub11_Sub1_2.method3441(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static265.method4583(local18, local15);
		}
		@Pc(115) Class8_Sub1_Sub2_Sub2 local115;
		if (local21 == 9) {
			local115 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local25];
			if (local115 != null) {
				Static247.anInt5050 = 0;
				Static215.anInt4410 = 2;
				Static116.anInt2759 = local38;
				Static107.anInt6417 = local36;
				Static15.aClass4_Sub11_Sub1_2.method706(129);
				Static15.aClass4_Sub11_Sub1_2.method3438(local25);
				Static15.aClass4_Sub11_Sub1_2.method3449(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local115.anIntArray415[0], local115.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local115.method4349(), 0, true, -2, 0, local115.anIntArray416[0]);
			}
		}
		if (local21 == 45) {
			if (Static23.anInt452 > 0 && Static264.aClass92_3.method2620(82) && Static264.aClass92_3.method2620(81)) {
				Static296.method4922(local15 + Static286.anInt6699, Static136.anInt3193 - -local18, Static12.anInt267);
			} else {
				Static116.anInt2759 = local38;
				Static215.anInt4410 = 1;
				Static247.anInt5050 = 0;
				Static107.anInt6417 = local36;
				Static15.aClass4_Sub11_Sub1_2.method706(133);
				Static15.aClass4_Sub11_Sub1_2.method3459(local18 + Static136.anInt3193);
				Static15.aClass4_Sub11_Sub1_2.method3402(Static286.anInt6699 + local15);
			}
		}
		if (local21 == 59) {
			Static107.anInt6417 = local36;
			Static116.anInt2759 = local38;
			Static215.anInt4410 = 2;
			Static247.anInt5050 = 0;
			Static15.aClass4_Sub11_Sub1_2.method706(231);
			Static15.aClass4_Sub11_Sub1_2.method3459(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static15.aClass4_Sub11_Sub1_2.method3459(Static136.anInt3193 + local18);
			Static15.aClass4_Sub11_Sub1_2.method3443(local15 + Static286.anInt6699);
			Static15.aClass4_Sub11_Sub1_2.method3443(Static255.anInt5164);
			Static15.aClass4_Sub11_Sub1_2.method3452(Static82.anInt2376);
			Static15.aClass4_Sub11_Sub1_2.method3441(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static156.method4517(local28, local18, local15);
		}
		@Pc(316) Class8_Sub1_Sub2_Sub1 local316;
		if (local21 == 3) {
			local316 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local25];
			if (local316 != null) {
				Static247.anInt5050 = 0;
				Static107.anInt6417 = local36;
				Static116.anInt2759 = local38;
				Static215.anInt4410 = 2;
				Static15.aClass4_Sub11_Sub1_2.method706(40);
				Static15.aClass4_Sub11_Sub1_2.method3441(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static15.aClass4_Sub11_Sub1_2.method3438(local25);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local316.anIntArray415[0], local316.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local316.method4349(), 0, true, -2, 0, local316.anIntArray416[0]);
			}
		}
		if (local21 == 1004) {
			Static116.anInt2759 = local38;
			Static215.anInt4410 = 2;
			Static247.anInt5050 = 0;
			Static107.anInt6417 = local36;
			Static15.aClass4_Sub11_Sub1_2.method706(74);
			Static15.aClass4_Sub11_Sub1_2.method3402(local25);
		}
		if (local21 == 47) {
			local115 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local25];
			if (local115 != null) {
				Static107.anInt6417 = local36;
				Static247.anInt5050 = 0;
				Static215.anInt4410 = 2;
				Static116.anInt2759 = local38;
				Static15.aClass4_Sub11_Sub1_2.method706(88);
				Static15.aClass4_Sub11_Sub1_2.method3459(Static255.anInt5164);
				Static15.aClass4_Sub11_Sub1_2.method3402(local25);
				Static15.aClass4_Sub11_Sub1_2.method3445(Static82.anInt2376);
				Static15.aClass4_Sub11_Sub1_2.method3441(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local115.anIntArray415[0], local115.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local115.method4349(), 0, true, -2, 0, local115.anIntArray416[0]);
			}
		}
		if (local21 == 11 && Static16.aClass21_1 == null) {
			Static202.method3815(local18, local15);
			Static16.aClass21_1 = Static156.method4515(local15, local18);
			Static349.method5536(Static16.aClass21_1);
		}
		if (local21 == 10) {
			local115 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local25];
			if (local115 != null) {
				Static107.anInt6417 = local36;
				Static247.anInt5050 = 0;
				Static215.anInt4410 = 2;
				Static116.anInt2759 = local38;
				Static15.aClass4_Sub11_Sub1_2.method706(27);
				Static15.aClass4_Sub11_Sub1_2.method3438(local25);
				Static15.aClass4_Sub11_Sub1_2.method3449(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local115.anIntArray415[0], local115.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local115.method4349(), 0, true, -2, 0, local115.anIntArray416[0]);
			}
		}
		if (local21 == 2) {
			Static247.anInt5050 = 0;
			Static215.anInt4410 = 2;
			Static107.anInt6417 = local36;
			Static116.anInt2759 = local38;
			Static15.aClass4_Sub11_Sub1_2.method706(221);
			Static15.aClass4_Sub11_Sub1_2.method3402(local18 + Static136.anInt3193);
			Static15.aClass4_Sub11_Sub1_2.method3449(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static15.aClass4_Sub11_Sub1_2.method3443(local25);
			Static15.aClass4_Sub11_Sub1_2.method3402(local15 + Static286.anInt6699);
			Static265.method4583(local18, local15);
		}
		if (local21 == 50) {
			Static215.anInt4410 = 2;
			Static107.anInt6417 = local36;
			Static247.anInt5050 = 0;
			Static116.anInt2759 = local38;
			Static15.aClass4_Sub11_Sub1_2.method706(29);
			Static15.aClass4_Sub11_Sub1_2.method3443(Static136.anInt3193 + local18);
			Static15.aClass4_Sub11_Sub1_2.method3419(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static15.aClass4_Sub11_Sub1_2.method3443(local15 + Static286.anInt6699);
			Static15.aClass4_Sub11_Sub1_2.method3438(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static156.method4517(local28, local18, local15);
		}
		@Pc(706) Class21 local706;
		if (local21 == 23) {
			local706 = Static156.method4515(local15, local18);
			if (local706 != null) {
				Static170.method3301(local706);
			}
		}
		if (local21 == 1003 || local21 == 1010 || local21 == 1006 || local21 == 1012 || local21 == 1009) {
			Static250.method4423(local15, local25, local21);
		}
		if (local21 == 19) {
			local316 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local25];
			if (local316 != null) {
				Static247.anInt5050 = 0;
				Static116.anInt2759 = local38;
				Static215.anInt4410 = 2;
				Static107.anInt6417 = local36;
				Static15.aClass4_Sub11_Sub1_2.method706(120);
				Static15.aClass4_Sub11_Sub1_2.method3449(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static15.aClass4_Sub11_Sub1_2.method3459(local25);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local316.anIntArray415[0], local316.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local316.method4349(), 0, true, -2, 0, local316.anIntArray416[0]);
			}
		}
		if (local21 == 1001) {
			Static247.anInt5050 = 0;
			Static107.anInt6417 = local36;
			Static215.anInt4410 = 2;
			Static116.anInt2759 = local38;
			local115 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local25];
			if (local115 != null) {
				@Pc(830) Class141 local830 = local115.aClass141_1;
				if (local830.anIntArray380 != null) {
					local830 = local830.method3908();
				}
				if (local830 != null) {
					Static15.aClass4_Sub11_Sub1_2.method706(57);
					Static15.aClass4_Sub11_Sub1_2.method3438(local830.anInt4391);
				}
			}
		}
		if (local21 == 46) {
			Static116.anInt2759 = local38;
			Static107.anInt6417 = local36;
			Static247.anInt5050 = 0;
			Static215.anInt4410 = 2;
			Static15.aClass4_Sub11_Sub1_2.method706(32);
			Static15.aClass4_Sub11_Sub1_2.method3434(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static15.aClass4_Sub11_Sub1_2.method3438(local18 + Static136.anInt3193);
			Static15.aClass4_Sub11_Sub1_2.method3402(local25);
			Static15.aClass4_Sub11_Sub1_2.method3438(Static286.anInt6699 + local15);
			Static265.method4583(local18, local15);
		}
		if (local21 == 49) {
			local115 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local25];
			if (local115 != null) {
				Static215.anInt4410 = 2;
				Static247.anInt5050 = 0;
				Static116.anInt2759 = local38;
				Static107.anInt6417 = local36;
				Static15.aClass4_Sub11_Sub1_2.method706(195);
				Static15.aClass4_Sub11_Sub1_2.method3438(local25);
				Static15.aClass4_Sub11_Sub1_2.method3449(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local115.anIntArray415[0], local115.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local115.method4349(), 0, true, -2, 0, local115.anIntArray416[0]);
			}
		}
		if (local21 == 8) {
			local316 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local25];
			if (local316 != null) {
				Static215.anInt4410 = 2;
				Static107.anInt6417 = local36;
				Static116.anInt2759 = local38;
				Static247.anInt5050 = 0;
				Static15.aClass4_Sub11_Sub1_2.method706(46);
				Static15.aClass4_Sub11_Sub1_2.method3441(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static15.aClass4_Sub11_Sub1_2.method3438(local25);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local316.anIntArray415[0], local316.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local316.method4349(), 0, true, -2, 0, local316.anIntArray416[0]);
			}
		}
		if (local21 == 60) {
			Static247.anInt5050 = 0;
			Static116.anInt2759 = local38;
			Static215.anInt4410 = 2;
			Static107.anInt6417 = local36;
			Static15.aClass4_Sub11_Sub1_2.method706(196);
			Static15.aClass4_Sub11_Sub1_2.method3443(Static286.anInt6699 + local15);
			Static15.aClass4_Sub11_Sub1_2.method3443(local25);
			Static15.aClass4_Sub11_Sub1_2.method3441(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static15.aClass4_Sub11_Sub1_2.method3459(Static136.anInt3193 + local18);
			Static265.method4583(local18, local15);
		}
		if (local21 == 15) {
			Static116.anInt2759 = local38;
			Static247.anInt5050 = 0;
			Static107.anInt6417 = local36;
			Static215.anInt4410 = 2;
			Static15.aClass4_Sub11_Sub1_2.method706(237);
			Static15.aClass4_Sub11_Sub1_2.method3402(local25);
			Static15.aClass4_Sub11_Sub1_2.method3449(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static15.aClass4_Sub11_Sub1_2.method3443(local15 + Static286.anInt6699);
			Static15.aClass4_Sub11_Sub1_2.method3459(Static136.anInt3193 + local18);
			Static265.method4583(local18, local15);
		}
		if (local21 == 48) {
			Static107.anInt6417 = local36;
			Static116.anInt2759 = local38;
			Static215.anInt4410 = 1;
			Static247.anInt5050 = 0;
			Static15.aClass4_Sub11_Sub1_2.method706(67);
			Static15.aClass4_Sub11_Sub1_2.method3411(Static82.anInt2376);
			Static15.aClass4_Sub11_Sub1_2.method3402(local15 + Static286.anInt6699);
			Static15.aClass4_Sub11_Sub1_2.method3443(Static255.anInt5164);
			Static15.aClass4_Sub11_Sub1_2.method3443(local18 + Static136.anInt3193);
			Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local15, 1, Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], 1, 0, true, -4, 0, local18);
		}
		if (local21 == 1007) {
			Static247.anInt5050 = 0;
			Static116.anInt2759 = local38;
			Static107.anInt6417 = local36;
			Static215.anInt4410 = 2;
			Static15.aClass4_Sub11_Sub1_2.method706(198);
			Static15.aClass4_Sub11_Sub1_2.method3443(local25);
		}
		if (local21 == 57) {
			if (Static23.anInt452 > 0 && Static264.aClass92_3.method2620(82) && Static264.aClass92_3.method2620(81)) {
				Static296.method4922(local15 + Static286.anInt6699, local18 + Static136.anInt3193, Static12.anInt267);
			} else {
				Static337.method5435(local18, local25, local15);
				if (local25 == 1) {
					Static15.aClass4_Sub11_Sub1_2.method3434(-1);
					Static15.aClass4_Sub11_Sub1_2.method3434(-1);
					Static15.aClass4_Sub11_Sub1_2.method3402((int) Static106.aFloat31);
					Static15.aClass4_Sub11_Sub1_2.method3434(57);
					Static15.aClass4_Sub11_Sub1_2.method3434(Static75.anInt1928);
					Static15.aClass4_Sub11_Sub1_2.method3434(Static255.anInt5169);
					Static15.aClass4_Sub11_Sub1_2.method3434(89);
					Static15.aClass4_Sub11_Sub1_2.method3402(Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701);
					Static15.aClass4_Sub11_Sub1_2.method3402(Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702);
					Static15.aClass4_Sub11_Sub1_2.method3434(63);
				} else {
					Static116.anInt2759 = local38;
					Static107.anInt6417 = local36;
					Static247.anInt5050 = 0;
					Static215.anInt4410 = 1;
				}
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local15, 1, Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], 1, 0, true, -4, 0, local18);
			}
		}
		if (local21 == 21) {
			local316 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local25];
			if (local316 != null) {
				Static116.anInt2759 = local38;
				Static247.anInt5050 = 0;
				Static107.anInt6417 = local36;
				Static215.anInt4410 = 2;
				Static15.aClass4_Sub11_Sub1_2.method706(145);
				Static15.aClass4_Sub11_Sub1_2.method3419(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static15.aClass4_Sub11_Sub1_2.method3402(local25);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local316.anIntArray415[0], local316.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local316.method4349(), 0, true, -2, 0, local316.anIntArray416[0]);
			}
		}
		if (local21 == 1002) {
			Static116.anInt2759 = local38;
			Static215.anInt4410 = 2;
			Static107.anInt6417 = local36;
			Static247.anInt5050 = 0;
			Static15.aClass4_Sub11_Sub1_2.method706(61);
			Static15.aClass4_Sub11_Sub1_2.method3402((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static15.aClass4_Sub11_Sub1_2.method3402(local18 + Static136.anInt3193);
			Static15.aClass4_Sub11_Sub1_2.method3459(Static286.anInt6699 + local15);
			Static15.aClass4_Sub11_Sub1_2.method3434(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static156.method4517(local28, local18, local15);
		}
		if (local21 == 17) {
			Static107.anInt6417 = local36;
			Static215.anInt4410 = 2;
			Static247.anInt5050 = 0;
			Static116.anInt2759 = local38;
			Static15.aClass4_Sub11_Sub1_2.method706(140);
			Static15.aClass4_Sub11_Sub1_2.method3443(Static286.anInt6699 + local15);
			Static15.aClass4_Sub11_Sub1_2.method3443(local18 + Static136.anInt3193);
			Static15.aClass4_Sub11_Sub1_2.method3443(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static15.aClass4_Sub11_Sub1_2.method3449(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static156.method4517(local28, local18, local15);
		}
		if (local21 == 6) {
			local115 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local25];
			if (local115 != null) {
				Static247.anInt5050 = 0;
				Static116.anInt2759 = local38;
				Static215.anInt4410 = 2;
				Static107.anInt6417 = local36;
				Static15.aClass4_Sub11_Sub1_2.method706(62);
				Static15.aClass4_Sub11_Sub1_2.method3459(local25);
				Static15.aClass4_Sub11_Sub1_2.method3449(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local115.anIntArray415[0], local115.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local115.method4349(), 0, true, -2, 0, local115.anIntArray416[0]);
			}
		}
		if (local21 == 51) {
			Static215.anInt4410 = 2;
			Static247.anInt5050 = 0;
			Static107.anInt6417 = local36;
			Static116.anInt2759 = local38;
			Static15.aClass4_Sub11_Sub1_2.method706(187);
			Static15.aClass4_Sub11_Sub1_2.method3449(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static15.aClass4_Sub11_Sub1_2.method3438(local15 + Static286.anInt6699);
			Static15.aClass4_Sub11_Sub1_2.method3459(local18 + Static136.anInt3193);
			Static15.aClass4_Sub11_Sub1_2.method3438(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static156.method4517(local28, local18, local15);
		}
		if (local21 == 30) {
			Static247.anInt5050 = 0;
			Static107.anInt6417 = local36;
			Static116.anInt2759 = local38;
			Static215.anInt4410 = 2;
			Static15.aClass4_Sub11_Sub1_2.method706(128);
			Static15.aClass4_Sub11_Sub1_2.method3452(Static82.anInt2376);
			Static15.aClass4_Sub11_Sub1_2.method3438(local18 + Static136.anInt3193);
			Static15.aClass4_Sub11_Sub1_2.method3434(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static15.aClass4_Sub11_Sub1_2.method3438(Static286.anInt6699 + local15);
			Static15.aClass4_Sub11_Sub1_2.method3402(local25);
			Static15.aClass4_Sub11_Sub1_2.method3459(Static255.anInt5164);
			Static265.method4583(local18, local15);
		}
		if (local21 == 5) {
			local316 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local25];
			if (local316 != null) {
				Static116.anInt2759 = local38;
				Static107.anInt6417 = local36;
				Static247.anInt5050 = 0;
				Static215.anInt4410 = 2;
				Static15.aClass4_Sub11_Sub1_2.method706(93);
				Static15.aClass4_Sub11_Sub1_2.method3443(local25);
				Static15.aClass4_Sub11_Sub1_2.method3434(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local316.anIntArray415[0], local316.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local316.method4349(), 0, true, -2, 0, local316.anIntArray416[0]);
			}
		}
		if (local21 == 25) {
			local115 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local25];
			if (local115 != null) {
				Static107.anInt6417 = local36;
				Static215.anInt4410 = 2;
				Static247.anInt5050 = 0;
				Static116.anInt2759 = local38;
				Static15.aClass4_Sub11_Sub1_2.method706(13);
				Static15.aClass4_Sub11_Sub1_2.method3438(local25);
				Static15.aClass4_Sub11_Sub1_2.method3449(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local115.anIntArray415[0], local115.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local115.method4349(), 0, true, -2, 0, local115.anIntArray416[0]);
			}
		}
		if (local21 == 58) {
			local316 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local25];
			if (local316 != null) {
				Static247.anInt5050 = 0;
				Static215.anInt4410 = 2;
				Static107.anInt6417 = local36;
				Static116.anInt2759 = local38;
				Static15.aClass4_Sub11_Sub1_2.method706(59);
				Static15.aClass4_Sub11_Sub1_2.method3419(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static15.aClass4_Sub11_Sub1_2.method3402(local25);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local316.anIntArray415[0], local316.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local316.method4349(), 0, true, -2, 0, local316.anIntArray416[0]);
			}
		}
		if (local21 == 4) {
			local316 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local25];
			if (local316 != null) {
				Static215.anInt4410 = 2;
				Static247.anInt5050 = 0;
				Static107.anInt6417 = local36;
				Static116.anInt2759 = local38;
				Static15.aClass4_Sub11_Sub1_2.method706(199);
				Static15.aClass4_Sub11_Sub1_2.method3441(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static15.aClass4_Sub11_Sub1_2.method3459(local25);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local316.anIntArray415[0], local316.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local316.method4349(), 0, true, -2, 0, local316.anIntArray416[0]);
			}
		}
		if (local21 == 13) {
			Static215.anInt4410 = 2;
			Static116.anInt2759 = local38;
			Static107.anInt6417 = local36;
			Static247.anInt5050 = 0;
			Static15.aClass4_Sub11_Sub1_2.method706(126);
			Static15.aClass4_Sub11_Sub1_2.method3459(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static15.aClass4_Sub11_Sub1_2.method3459(Static136.anInt3193 + local18);
			Static15.aClass4_Sub11_Sub1_2.method3438(local15 + Static286.anInt6699);
			Static15.aClass4_Sub11_Sub1_2.method3419(Static264.aClass92_3.method2620(82) ? 1 : 0);
			Static156.method4517(local28, local18, local15);
		}
		if (local21 == 44 || local21 == 1008) {
			Static295.method4917(local15, local25, arg0.aString59, local18);
		}
		if (local21 == 22) {
			local316 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local25];
			if (local316 != null) {
				Static116.anInt2759 = local38;
				Static215.anInt4410 = 2;
				Static247.anInt5050 = 0;
				Static107.anInt6417 = local36;
				Static15.aClass4_Sub11_Sub1_2.method706(112);
				Static15.aClass4_Sub11_Sub1_2.method3452(Static82.anInt2376);
				Static15.aClass4_Sub11_Sub1_2.method3459(local25);
				Static15.aClass4_Sub11_Sub1_2.method3441(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static15.aClass4_Sub11_Sub1_2.method3443(Static255.anInt5164);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local316.anIntArray415[0], local316.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local316.method4349(), 0, true, -2, 0, local316.anIntArray416[0]);
			}
		}
		if (local21 == 18) {
			local706 = Static156.method4515(local15, local18);
			if (local706 != null) {
				Static75.method1745();
				@Pc(2221) Class4_Sub12 local2221 = Static44.method877(local706);
				Static39.method759(local18, local15, local2221.anInt1384, local706.anInt733, local2221.method1031(), local706.anInt768);
				Static171.aString34 = Static8.method192(local706);
				Static194.aString36 = local706.aString9 + "<col=ffffff>";
				if (Static171.aString34 == null) {
					Static171.aString34 = "Null";
				}
			}
			return;
		}
		if (local21 == 20) {
			local316 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local25];
			if (local316 != null) {
				Static215.anInt4410 = 2;
				Static247.anInt5050 = 0;
				Static107.anInt6417 = local36;
				Static116.anInt2759 = local38;
				Static15.aClass4_Sub11_Sub1_2.method706(144);
				Static15.aClass4_Sub11_Sub1_2.method3438(local25);
				Static15.aClass4_Sub11_Sub1_2.method3434(Static264.aClass92_3.method2620(82) ? 1 : 0);
				Static81.method2005(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0], local316.anIntArray415[0], local316.method4349(), Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0], local316.method4349(), 0, true, -2, 0, local316.anIntArray416[0]);
			}
		}
		if (Static344.aBoolean219) {
			Static75.method1745();
		}
		if (Static302.aClass21_15 != null && Static332.anInt6353 == 0) {
			Static349.method5536(Static302.aClass21_15);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg4);
		@Pc(17) int local17 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg5);
		@Pc(23) int local23 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg1);
		@Pc(29) int local29 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg3);
		@Pc(37) int local37 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg4 + arg0);
		@Pc(46) int local46 = Static116.method2426(Static195.anInt4097, Static349.anInt6619, arg5 - arg0);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static135.method2878(Static223.anIntArrayArray124[local48], local29, arg6, local23);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static135.method2878(Static223.anIntArrayArray124[local64], local29, arg6, local23);
		}
		@Pc(92) int local92 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg1 + arg0);
		@Pc(104) int local104 = Static116.method2426(Static220.anInt6565, Static5.anInt2965, arg3 - arg0);
		for (@Pc(106) int local106 = local37; local106 <= local46; local106++) {
			@Pc(112) int[] local112 = Static223.anIntArrayArray124[local106];
			Static135.method2878(local112, local92, arg6, local23);
			Static135.method2878(local112, local104, arg2, local92);
			Static135.method2878(local112, local29, arg6, local104);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLclient!vo;)V")
	public static void method5566(@OriginalArg(1) Class211 arg0) {
		Static292.aClass211_1 = arg0;
	}
}
