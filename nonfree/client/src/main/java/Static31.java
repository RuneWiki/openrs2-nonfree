import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bda", name = "T", descriptor = "I")
	public static final int anInt8141 = 2;

	@OriginalMember(owner = "client!bda", name = "yb", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_126 = new Class252(66, 3);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BILclient!vi;I)V")
	public static void method7249(@OriginalArg(1) int arg0, @OriginalArg(2) Class20_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt9022 && arg0 != -1) {
			@Pc(11) Class176 local11 = Static35.aClass152_1.method4045(arg0);
			@Pc(14) int local14 = local11.anInt5271;
			if (local14 == 1) {
				arg1.anInt9033 = 0;
				arg1.anInt9009 = arg2;
				arg1.anInt8988 = 0;
				arg1.anInt8961 = 0;
				arg1.anInt8979 = 1;
				Static425.method6639(arg1.aByte108, local11, arg1.anInt8949, arg1.anInt8961, false, arg1.anInt8954);
			}
			if (local14 == 2) {
				arg1.anInt8988 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt9022 == -1 || Static35.aClass152_1.method4045(arg0).anInt5277 >= Static35.aClass152_1.method4045(arg1.anInt9022).anInt5277) {
			arg1.anInt8961 = 0;
			arg1.anInt9033 = 0;
			arg1.anInt8979 = 1;
			arg1.anInt9009 = arg2;
			arg1.anInt9037 = arg1.anInt9035;
			arg1.anInt8988 = 0;
			arg1.anInt9022 = arg0;
			if (arg1.anInt9022 != -1) {
				Static425.method6639(arg1.aByte108, Static35.aClass152_1.method4045(arg1.anInt9022), arg1.anInt8949, arg1.anInt8961, false, arg1.anInt8954);
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!cu;Z)V")
	public static void method7265(@OriginalArg(0) Class54 arg0) {
		@Pc(12) int local12;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(160) int local160;
		@Pc(76) int local76;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(58) int local58;
		@Pc(38) boolean local38;
		@Pc(72) int local72;
		@Pc(66) byte local66;
		if (arg0 == Static115.aClass54_9) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local22 = (local12 >> 4 & 0xF) + Static238.anInt4640 * 2;
			local30 = Static140.anInt2803 * 2 + (local12 & 0xF);
			local38 = Static352.aClass1_Sub17_Sub2_2.method4487() != 0;
			local44 = local22 + Static352.aClass1_Sub17_Sub2_2.method4482();
			local50 = local30 + Static352.aClass1_Sub17_Sub2_2.method4482();
			local54 = Static352.aClass1_Sub17_Sub2_2.method4447();
			local58 = Static352.aClass1_Sub17_Sub2_2.method4447();
			local62 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local66 = Static352.aClass1_Sub17_Sub2_2.method4482();
			local72 = Static352.aClass1_Sub17_Sub2_2.method4487() * 4;
			local76 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local80 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local84 = Static352.aClass1_Sub17_Sub2_2.method4487();
			if (local84 == 255) {
				local84 = -1;
			}
			@Pc(95) int local95 = Static352.aClass1_Sub17_Sub2_2.method4494();
			if (local22 >= 0 && local30 >= 0 && Static237.anInt4563 * 2 > local22 && Static237.anInt4563 * 2 > local30 && local44 >= 0 && local50 >= 0 && local44 < Static373.anInt6694 * 2 && local50 < Static373.anInt6694 * 2 && local62 != 65535) {
				local30 = local30 * 64;
				local50 *= 64;
				local44 *= 64;
				local22 = local22 * 64;
				local95 <<= 0x0;
				local160 = local66 << 0;
				local72 <<= 0x0;
				if (local54 != 0) {
					@Pc(171) Class20_Sub1_Sub1 local171 = null;
					@Pc(188) int local188;
					@Pc(178) int local178;
					@Pc(182) int local182;
					if (local54 < 0) {
						local178 = -local54 - 1;
						local182 = local178 & 0x7FF;
						local188 = local178 >> 11 & 0xF;
						if (Static16.anInt9513 == local182) {
							local171 = Static107.aClass20_Sub1_Sub1_Sub1_1;
						} else {
							local171 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local182];
						}
					} else {
						local178 = local54 - 1;
						local182 = local178 & 0x7FF;
						local188 = local178 >> 11 & 0xF;
						@Pc(224) Class1_Sub41 local224 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local182);
						if (local224 != null) {
							local171 = local224.aClass20_Sub1_Sub1_Sub2_2;
						}
					}
					if (local171 != null) {
						@Pc(235) Class299 local235 = local171.method7819();
						if (local235.anIntArrayArray116 != null && local235.anIntArrayArray116[local188] != null) {
							local182 = local235.anIntArrayArray116[local188][0];
							@Pc(257) int local257 = local235.anIntArrayArray116[local188][2];
							@Pc(262) int local262 = local171.aClass209_7.method5706();
							@Pc(266) int local266 = Class200_Sub1.lb[local262];
							@Pc(270) int local270 = Class200_Sub1.anIntArray576[local262];
							@Pc(281) int local281 = local266 * local257 + local270 * local182 >> 15;
							@Pc(292) int local292 = local270 * local257 - local182 * local266 >> 15;
							local30 += local292;
							local160 -= local235.anIntArrayArray116[local188][1];
							local22 += local281;
						}
					}
				}
				@Pc(331) Class20_Sub1_Sub5 local331 = new Class20_Sub1_Sub5(local62, Static492.anInt8645, local22, local30, local160, Static445.anInt7791 + local76, Static445.anInt7791 + local80, local84, local95, local58, local72, local38);
				local331.method6439(local50, Static508.method7754(local50, local44, Static492.anInt8645) - local72, local44, Static445.anInt7791 + local76);
				Static8.aClass295_3.method7533(new Class1_Sub2_Sub15(local331));
			}
			return;
		}
		@Pc(384) int local384;
		if (arg0 == Static320.aClass54_22) {
			Static352.aClass1_Sub17_Sub2_2.method4487();
			local12 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local22 = (local12 >> 4 & 0x7) + Static238.anInt4640;
			local30 = (local12 & 0x7) + Static140.anInt2803;
			local384 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local44 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local50 = Static352.aClass1_Sub17_Sub2_2.method4486();
			@Pc(396) String local396 = Static352.aClass1_Sub17_Sub2_2.method4491();
			Static387.method6182(local22, local44, local30, local50, Static492.anInt8645, local396, local384);
			return;
		}
		@Pc(594) Class20_Sub1_Sub5 local594;
		if (Static467.aClass54_26 == arg0) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local22 = (local12 >> 4 & 0xF) + Static238.anInt4640 * 2;
			local30 = (local12 & 0xF) + Static140.anInt2803 * 2;
			local38 = Static352.aClass1_Sub17_Sub2_2.method4487() != 0;
			local44 = Static352.aClass1_Sub17_Sub2_2.method4482() + local22;
			local50 = local30 + Static352.aClass1_Sub17_Sub2_2.method4482();
			local54 = Static352.aClass1_Sub17_Sub2_2.method4447();
			local58 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local62 = Static352.aClass1_Sub17_Sub2_2.method4487() * 4;
			local160 = Static352.aClass1_Sub17_Sub2_2.method4487() * 4;
			local72 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local76 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local80 = Static352.aClass1_Sub17_Sub2_2.method4487();
			if (local80 == 255) {
				local80 = -1;
			}
			local84 = Static352.aClass1_Sub17_Sub2_2.method4494();
			if (local22 >= 0 && local30 >= 0 && local22 < Static237.anInt4563 * 2 && Static237.anInt4563 * 2 > local30 && local44 >= 0 && local50 >= 0 && Static373.anInt6694 * 2 > local44 && Static373.anInt6694 * 2 > local50 && local58 != 65535) {
				local50 *= 64;
				local160 <<= 0x0;
				local84 <<= 0x0;
				local30 = local30 * 64;
				local44 = local44 * 64;
				local62 <<= 0x0;
				local22 = local22 * 64;
				local594 = new Class20_Sub1_Sub5(local58, Static492.anInt8645, local22, local30, local62, local72 + Static445.anInt7791, Static445.anInt7791 + local76, local80, local84, local54, local160, local38);
				local594.method6439(local50, Static508.method7754(local50, local44, Static492.anInt8645) - local160, local44, Static445.anInt7791 + local72);
				Static8.aClass295_3.method7533(new Class1_Sub2_Sub15(local594));
			}
		} else if (arg0 == Static211.aClass54_16) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local22 = (local12 & 0x7) + Static140.anInt2803;
			local30 = Static282.anInt5380 + local22;
			local384 = Static238.anInt4640 + (local12 >> 4 & 0x7);
			local44 = Static538.anInt9485 + local384;
			local50 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local54 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local58 = Static352.aClass1_Sub17_Sub2_2.method4494();
			if (Static4.aClass230_2 != null) {
				@Pc(676) Class1_Sub20 local676 = (Class1_Sub20) Static4.aClass230_2.method6144((long) (Static492.anInt8645 << 28 | local30 << 14 | local44));
				if (local676 != null) {
					for (@Pc(684) Class1_Sub12 local684 = (Class1_Sub12) local676.aClass295_16.method7543(); local684 != null; local684 = (Class1_Sub12) local676.aClass295_16.method7540()) {
						if (local684.anInt2502 == (local50 & 0x7FFF) && local54 == local684.anInt2500) {
							local684.method8239();
							local684.anInt2500 = local58;
							Static339.method5713(local44, local30, Static492.anInt8645, local684);
							break;
						}
					}
					if (local384 >= 0 && local22 >= 0 && local384 < Static237.anInt4563 && Static373.anInt6694 > local22) {
						Static388.method6198(local22, local384, Static492.anInt8645);
					}
				}
			}
		} else if (Static105.aClass54_7 == arg0) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local22 = Static352.aClass1_Sub17_Sub2_2.method4487();
			Static398.aClass18_4.method609(local12).method1627(local22);
		} else if (Static108.aClass54_8 == arg0) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4467();
			local22 = Static140.anInt2803 + (local12 & 0x7);
			local30 = local22 + Static282.anInt5380;
			local384 = Static238.anInt4640 + (local12 >> 4 & 0x7);
			local44 = local384 + Static538.anInt9485;
			local50 = Static352.aClass1_Sub17_Sub2_2.method4472();
			@Pc(825) Class1_Sub20 local825 = (Class1_Sub20) Static4.aClass230_2.method6144((long) (local30 << 14 | Static492.anInt8645 << 28 | local44));
			if (local825 != null) {
				for (@Pc(833) Class1_Sub12 local833 = (Class1_Sub12) local825.aClass295_16.method7543(); local833 != null; local833 = (Class1_Sub12) local825.aClass295_16.method7540()) {
					if (local833.anInt2502 == (local50 & 0x7FFF)) {
						local833.method8239();
						break;
					}
				}
				if (local825.aClass295_16.method7536()) {
					local825.method8239();
				}
				if (local384 >= 0 && local22 >= 0 && local384 < Static237.anInt4563 && local22 < Static373.anInt6694) {
					Static388.method6198(local22, local384, Static492.anInt8645);
				}
			}
		} else if (arg0 == Static45.aClass54_2) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4449();
			local22 = local12 >> 2;
			local30 = local12 & 0x3;
			local384 = Static352.aClass1_Sub17_Sub2_2.method4461();
			@Pc(901) byte local901 = Static352.aClass1_Sub17_Sub2_2.method4482();
			local50 = Static352.aClass1_Sub17_Sub2_2.method4461();
			local54 = Static352.aClass1_Sub17_Sub2_2.method4496();
			local58 = Static352.aClass1_Sub17_Sub2_2.method4461();
			@Pc(917) byte local917 = Static352.aClass1_Sub17_Sub2_2.method4501();
			local66 = Static352.aClass1_Sub17_Sub2_2.method4468();
			@Pc(925) byte local925 = Static352.aClass1_Sub17_Sub2_2.method4501();
			local76 = Static352.aClass1_Sub17_Sub2_2.method4442();
			local80 = (local76 >> 4 & 0x7) + Static238.anInt4640;
			local84 = Static140.anInt2803 + (local76 & 0x7);
			if (!Static455.aClass4_11.method7166()) {
				Static513.method7856(local901, local917, local925, local84, Static492.anInt8645, local384, local22, local58, local54, local50, local80, local66, local30);
			}
		} else if (arg0 == Static83.aClass54_28) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4502();
			local22 = Static352.aClass1_Sub17_Sub2_2.method4502();
			local30 = Static352.aClass1_Sub17_Sub2_2.method4472();
			local384 = Static352.aClass1_Sub17_Sub2_2.method4449();
			local44 = (local384 & 0x7) + Static140.anInt2803;
			local50 = Static282.anInt5380 + local44;
			local54 = (local384 >> 4 & 0x7) + Static238.anInt4640;
			local58 = Static538.anInt9485 + local54;
			if (local12 != Static16.anInt9513) {
				@Pc(1034) boolean local1034 = local54 >= 0 && local44 >= 0 && Static237.anInt4563 > local54 && Static373.anInt6694 > local44;
				if (local1034 || Static223.method4038(Static61.anInt1489)) {
					Static339.method5713(local58, local50, Static492.anInt8645, new Class1_Sub12(local22, local30));
					if (local1034) {
						Static388.method6198(local44, local54, Static492.anInt8645);
					}
				}
			}
		} else if (Static480.aClass54_27 == arg0) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4487();
			@Pc(1076) boolean local1076 = (local12 & 0x80) != 0;
			local30 = (local12 >> 3 & 0x7) + Static238.anInt4640;
			local384 = Static140.anInt2803 + (local12 & 0x7);
			local44 = Static352.aClass1_Sub17_Sub2_2.method4482() + local30;
			local50 = Static352.aClass1_Sub17_Sub2_2.method4482() + local384;
			local54 = Static352.aClass1_Sub17_Sub2_2.method4447();
			local58 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local62 = Static352.aClass1_Sub17_Sub2_2.method4487() * 4;
			local160 = Static352.aClass1_Sub17_Sub2_2.method4487() * 4;
			local72 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local76 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local80 = Static352.aClass1_Sub17_Sub2_2.method4487();
			if (local80 == 255) {
				local80 = -1;
			}
			local84 = Static352.aClass1_Sub17_Sub2_2.method4494();
			if (local30 >= 0 && local384 >= 0 && local30 < Static237.anInt4563 && Static373.anInt6694 > local384 && local44 >= 0 && local50 >= 0 && Static237.anInt4563 > local44 && Static373.anInt6694 > local50 && local58 != 65535) {
				local84 <<= 0x0;
				local160 <<= 0x0;
				local30 = local30 * 128 + 64;
				local384 = local384 * 128 + 64;
				local62 <<= 0x0;
				local50 = local50 * 128 + 64;
				local44 = local44 * 128 + 64;
				local594 = new Class20_Sub1_Sub5(local58, Static492.anInt8645, local30, local384, local62, Static445.anInt7791 + local72, Static445.anInt7791 + local76, local80, local84, local54, local160, local1076);
				local594.method6439(local50, Static508.method7754(local50, local44, Static492.anInt8645) - local160, local44, local72 + Static445.anInt7791);
				Static8.aClass295_3.method7533(new Class1_Sub2_Sub15(local594));
			}
		} else if (Static247.aClass54_19 == arg0) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local22 = Static238.anInt4640 + (local12 >> 4 & 0x7);
			local30 = (local12 & 0x7) + Static140.anInt2803;
			local384 = Static352.aClass1_Sub17_Sub2_2.method4494();
			if (local384 == 65535) {
				local384 = -1;
			}
			local44 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local50 = local44 >> 4 & 0xF;
			local54 = local44 & 0x7;
			local58 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local62 = Static352.aClass1_Sub17_Sub2_2.method4487();
			if (local22 >= 0 && local30 >= 0 && Static237.anInt4563 > local22 && Static373.anInt6694 > local30) {
				local160 = local50 + 1;
				if (Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray780[0] >= local22 - local160 && local160 + local22 >= Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray780[0] && Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray781[0] >= local30 - local160 && Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray781[0] <= local160 + local30) {
					Static364.method5911(local62, local58, local54, local50 + (Static492.anInt8645 << 24) + (local22 << 16) + (local30 << 8), local384);
				}
			}
		} else if (Static320.aClass54_21 == arg0) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local22 = (local12 >> 4 & 0x7) + Static238.anInt4640;
			local30 = (local12 & 0x7) + Static140.anInt2803;
			local384 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local44 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local50 = Static352.aClass1_Sub17_Sub2_2.method4494();
			local54 = Static352.aClass1_Sub17_Sub2_2.method4487();
			if (local22 >= 0 && local30 >= 0 && Static237.anInt4563 > local22 && local30 < Static373.anInt6694) {
				local58 = local22 * 128 + 64;
				local62 = local30 * 128 + 64;
				local160 = Static492.anInt8645;
				if (local160 < 3 && Static4.method186(local30, local22)) {
					local160++;
				}
				@Pc(1504) Class20_Sub1_Sub6 local1504 = new Class20_Sub1_Sub6(local384, local50, Static445.anInt7791, Static492.anInt8645, local160, local58, Static508.method7754(local62, local58, Static492.anInt8645) - local44, local62, local22, local22, local30, local30, local54);
				Static330.aClass295_36.method7533(new Class1_Sub2_Sub14(local1504));
			}
		} else if (Static310.aClass54_23 == arg0) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4467();
			local22 = (local12 >> 4 & 0x7) + Static238.anInt4640;
			local30 = (local12 & 0x7) + Static140.anInt2803;
			local384 = Static352.aClass1_Sub17_Sub2_2.method4442();
			local44 = local384 >> 2;
			local50 = local384 & 0x3;
			local54 = Static250.anIntArray400[local44];
			local58 = Static352.aClass1_Sub17_Sub2_2.method4494();
			if (local58 == 65535) {
				local58 = -1;
			}
			Static101.method2059(local50, local30, local22, local54, local44, Static492.anInt8645, local58);
		} else if (Static29.aClass54_1 == arg0) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4461();
			local22 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local30 = local22 >> 2;
			local384 = local22 & 0x3;
			local44 = Static250.anIntArray400[local30];
			local50 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local54 = Static238.anInt4640 + (local50 >> 4 & 0x7);
			local58 = Static140.anInt2803 + (local50 & 0x7);
			if (Static223.method4038(Static61.anInt1489) || local54 >= 0 && local58 >= 0 && Static237.anInt4563 > local54 && Static373.anInt6694 > local58) {
				Static457.method7001(local384, local30, local12, local54, local44, local58, Static492.anInt8645);
			}
		} else if (Static481.aClass54_24 == arg0) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4442();
			local22 = Static238.anInt4640 + (local12 >> 4 & 0x7);
			local30 = (local12 & 0x7) + Static140.anInt2803;
			local384 = Static352.aClass1_Sub17_Sub2_2.method4487();
			local44 = local384 >> 2;
			local50 = local384 & 0x3;
			local54 = Static250.anIntArray400[local44];
			if (Static223.method4038(Static61.anInt1489) || local22 >= 0 && local30 >= 0 && Static237.anInt4563 > local22 && local30 < Static373.anInt6694) {
				Static457.method7001(local50, local44, -1, local22, local54, local30, Static492.anInt8645);
			}
		} else if (Static279.aClass54_14 == arg0) {
			local12 = Static352.aClass1_Sub17_Sub2_2.method4472();
			local22 = Static352.aClass1_Sub17_Sub2_2.method4502();
			local30 = Static352.aClass1_Sub17_Sub2_2.method4442();
			local384 = (local30 & 0x7) + Static140.anInt2803;
			local44 = local384 + Static282.anInt5380;
			local50 = Static238.anInt4640 + (local30 >> 4 & 0x7);
			local54 = local50 + Static538.anInt9485;
			@Pc(1766) boolean local1766 = local50 >= 0 && local384 >= 0 && local50 < Static237.anInt4563 && local384 < Static373.anInt6694;
			if (local1766 || Static223.method4038(Static61.anInt1489)) {
				Static339.method5713(local54, local44, Static492.anInt8645, new Class1_Sub12(local12, local22));
				if (local1766) {
					Static388.method6198(local384, local50, Static492.anInt8645);
				}
			}
		} else {
			Static25.method773(null, "T3 - " + arg0);
			Static406.method6459(false);
		}
	}

	@OriginalMember(owner = "client!bda", name = "i", descriptor = "(Z)V")
	public static void method7280() {
		Static506.method7745(10);
		Static233.method4189();
		System.gc();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!pq;Ljava/lang/Object;I)V")
	public static void method7358(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg0.anEventQueue1.peekEvent() != null; local19++) {
			Static265.method3147(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
