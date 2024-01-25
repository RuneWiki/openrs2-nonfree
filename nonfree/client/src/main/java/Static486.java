import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Lclient!mq;")
	public static Class71 aClass71_31;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Z")
	public static boolean aBoolean634 = false;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "S")
	public static short aShort94 = 205;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILclient!ha;)Z")
	public static boolean method7716(@OriginalArg(1) int arg0, @OriginalArg(2) Class101 arg1) {
		@Pc(11) int local11 = (Static222.anInt4533 - 104) / 2;
		@Pc(17) int local17 = (Static668.anInt11370 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static586.method8860(local21, arg0, local25, local29)) {
						local40 = local29;
						if (Static45.method947(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static385.method6490(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(91) int[] local91 = new int[262144];
		for (local29 = 0; local29 < local91.length; local29++) {
			local91[local29] = -16777216;
		}
		Static292.aClass71_8 = arg1.method8111(512, local91, 512, 512);
		Static278.method4677();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10 | 0xFF000000;
		@Pc(157) int local157 = ((int) (Math.random() * 20.0D) + 228 | 0x1F1AFF00) << 16;
		@Pc(176) int local176 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(188) boolean[][] local188 = new boolean[Static591.anInt10304 + 2 + 1][Static591.anInt10304 + 1 + 2];
		@Pc(194) int local194;
		@Pc(198) int local198;
		@Pc(200) int local200;
		@Pc(202) int local202;
		@Pc(211) int local211;
		@Pc(222) int local222;
		@Pc(231) int local231;
		@Pc(257) int local257;
		@Pc(261) int local261;
		@Pc(312) int local312;
		@Pc(318) int local318;
		@Pc(322) int local322;
		@Pc(339) int local339;
		for (@Pc(190) int local190 = local11; local190 < local11 + 104; local190 += Static591.anInt10304) {
			for (local194 = local17; local194 < local17 + 104; local194 += Static591.anInt10304) {
				local198 = 0;
				local200 = 0;
				local202 = local190;
				if (local190 > 0) {
					local202 = local190 - 1;
					local198 += 4;
				}
				local211 = local194;
				if (local194 > 0) {
					local211 = local194 - 1;
				}
				local222 = local190 + Static591.anInt10304;
				if (local222 < 104) {
					local222++;
				}
				local231 = local194 + Static591.anInt10304;
				if (local231 < 104) {
					local200 += 4;
					local231++;
				}
				arg1.KA(0, 0, Static591.anInt10304 * 4 + local198, Static591.anInt10304 * 4 + local200);
				arg1.GA(-16777216);
				@Pc(265) int local265;
				for (local257 = arg0; local257 <= 3; local257++) {
					for (local261 = 0; local261 <= Static591.anInt10304; local261++) {
						for (local265 = 0; local265 <= Static591.anInt10304; local265++) {
							local188[local261][local265] = Static586.method8860(local261 + local202, arg0, local265 + local211, local257);
						}
					}
					Static549.aClass18Array30[local257].method8534(local202, local211, local222, local231, local188);
					if (!Static30.aBoolean28) {
						for (local265 = -4; local265 < Static591.anInt10304; local265++) {
							for (local312 = -4; local312 < Static591.anInt10304; local312++) {
								local318 = local265 + local190;
								local322 = local312 + local194;
								if (local11 <= local318 && local17 <= local322 && Static586.method8860(local318, arg0, local322, local257)) {
									local339 = local257;
									if (Static45.method947(local318, local322)) {
										local339 = local257 - 1;
									}
									if (local339 >= 0) {
										Static379.method6427(local157, local322, local318, local40, local265 * 4 + local198, local339, arg1, (Static591.anInt10304 - local312) * 4 + local200 - 4);
									}
								}
							}
						}
					}
				}
				if (Static30.aBoolean28) {
					@Pc(403) Class200 local403 = Static196.aClass200Array1[arg0];
					for (local265 = 0; local265 < Static591.anInt10304; local265++) {
						for (local312 = 0; local312 < Static591.anInt10304; local312++) {
							local318 = local190 + local265;
							local322 = local312 + local194;
							local339 = local403.anIntArrayArray23[local318 - local403.anInt5838][local322 - local403.anInt5851];
							if ((local339 & 0x40240000) != 0) {
								arg1.method8061((Static591.anInt10304 - local312) * 4 + local200 - 4, 4, -1713569622, local265 * 4 + local198, 4);
							} else if ((local339 & 0x800000) != 0) {
								arg1.method8099((Static591.anInt10304 - local312) * 4 + local200 - 4, 4, local265 * 4 + local198, -1713569622);
							} else if ((local339 & 0x2000000) != 0) {
								arg1.method8113(4, local198 + local265 * 4 + 3, -1713569622, local200 + (Static591.anInt10304 - local312) * 4 - 4);
							} else if ((local339 & 0x8000000) != 0) {
								arg1.method8099(local200 + (Static591.anInt10304 - local312) * 4 - 1, 4, local265 * 4 + local198, -1713569622);
							} else if ((local339 & 0x20000000) != 0) {
								arg1.method8113(4, local265 * 4 + local198, -1713569622, (Static591.anInt10304 - local312) * 4 + local200 - 4);
							}
						}
					}
				}
				arg1.aa(local198, local200, Static591.anInt10304 * 4, Static591.anInt10304 * 4, local176, 2);
				Static292.aClass71_8.method7706((local190 - local11) * 4 + 48, -((local194 + -local17) * 4) + 464 + -(Static591.anInt10304 * 4), Static591.anInt10304 * 4, Static591.anInt10304 * 4, local198, local200);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static403.method6620();
		Static660.anInt10682 = 0;
		Static526.aClass271_55.method7181();
		if (!Static30.aBoolean28) {
			for (local194 = local11; local194 < local11 + 104; local194++) {
				for (local198 = local17; local198 < local17 + 104; local198++) {
					for (local200 = arg0; local200 <= arg0 + 1 && local200 <= 3; local200++) {
						if (Static586.method8860(local194, arg0, local198, local200)) {
							@Pc(690) Interface23 local690 = (Interface23) Static428.method7017(local200, local194, local198);
							if (local690 == null) {
								local690 = (Interface23) Static174.method3415(local200, local194, local198, vu.class);
							}
							if (local690 == null) {
								local690 = (Interface23) Static584.method4102(local200, local194, local198);
							}
							if (local690 == null) {
								local690 = (Interface23) Static207.method3925(local200, local194, local198);
							}
							if (local690 != null) {
								@Pc(731) Class331 local731 = Static251.aClass328_1.method8261(local690.method9451());
								if (!local731.aBoolean697 || Static100.aBoolean97) {
									local222 = local731.anInt9426;
									if (local731.anIntArray486 != null) {
										for (local231 = 0; local231 < local731.anIntArray486.length; local231++) {
											if (local731.anIntArray486[local231] != -1) {
												@Pc(761) Class331 local761 = Static251.aClass328_1.method8261(local731.anIntArray486[local231]);
												if (local761.anInt9426 >= 0) {
													local222 = local761.anInt9426;
												}
											}
										}
									}
									if (local222 >= 0) {
										@Pc(784) boolean local784 = false;
										if (local222 >= 0) {
											@Pc(796) Class218 local796 = Static350.aClass5_3.method94(local222);
											if (local796 != null && local796.aBoolean507) {
												local784 = true;
											}
										}
										local257 = local194;
										local261 = local198;
										if (local784) {
											@Pc(814) int[][] local814 = Static196.aClass200Array1[local200].anIntArrayArray23;
											local312 = Static196.aClass200Array1[local200].anInt5838;
											local318 = Static196.aClass200Array1[local200].anInt5851;
											for (local322 = 0; local322 < 10; local322++) {
												local339 = (int) (Math.random() * 4.0D);
												if (local339 == 0 && local257 > local11 && local257 > local194 - 3 && (local814[local257 - local312 - 1][local261 - local318] & 0x2C0108) == 0) {
													local257--;
												}
												if (local339 == 1 && local11 + 104 - 1 > local257 && local194 + 3 > local257 && (local814[local257 + 1 - local312][local261 - local318] & 0x2C0180) == 0) {
													local257++;
												}
												if (local339 == 2 && local17 < local261 && local261 > local198 - 3 && (local814[local257 - local312][local261 - local318 - 1] & 0x2C0102) == 0) {
													local261--;
												}
												if (local339 == 3 && local261 < local17 + 104 - 1 && local261 < local198 + 3 && (local814[local257 - local312][local261 + 1 - local318] & 0x2C0120) == 0) {
													local261++;
												}
											}
										}
										Static419.anIntArray376[Static660.anInt10682] = local731.anInt9434;
										Static174.anIntArray171[Static660.anInt10682] = local257;
										Static629.anIntArray566[Static660.anInt10682] = local261;
										Static660.anInt10682++;
									}
								}
							}
						}
					}
				}
			}
			if (Static638.aClass75_3 != null) {
				Static361.aClass124_78.anInt3918 = 1;
				Static350.aClass5_3.method96(64, 1024);
				for (local198 = 0; local198 < Static638.aClass75_3.anInt1988; local198++) {
					local200 = Static638.aClass75_3.anIntArray102[local198];
					if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 == local200 >> 28) {
						local202 = (local200 >> 14 & 0x3FFF) - Static640.anInt11085;
						local211 = (local200 & 0x3FFF) - Static490.anInt8763;
						if (local202 >= 0 && Static222.anInt4533 > local202 && local211 >= 0 && local211 < Static668.anInt11370) {
							Static526.aClass271_55.method7174(new Class2_Sub14(local198));
						} else {
							@Pc(1104) Class218 local1104 = Static350.aClass5_3.method94(Static638.aClass75_3.anIntArray103[local198]);
							if (local1104.anIntArray319 != null && local202 + local1104.anInt6717 >= 0 && local1104.anInt6691 + local202 < Static222.anInt4533 && local1104.anInt6709 + local211 >= 0 && Static668.anInt11370 > local211 + local1104.anInt6694) {
								Static526.aClass271_55.method7174(new Class2_Sub14(local198));
							}
						}
					}
				}
				Static350.aClass5_3.method96(64, 128);
				Static361.aClass124_78.anInt3918 = 2;
				Static361.aClass124_78.method3614();
			}
		}
		return true;
	}
}
