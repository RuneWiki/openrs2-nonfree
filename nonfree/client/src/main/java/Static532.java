import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!ss", name = "N", descriptor = "Lclient!li;")
	public static Class5_Sub4_Sub14 aClass5_Sub4_Sub14_2;

	@OriginalMember(owner = "client!ss", name = "G", descriptor = "Lclient!ht;")
	public static final Class148 aClass148_31 = new Class148(5, 3);

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(III)I")
	public static int method7604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (local7 + arg0) / arg1 - local7;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!ha;BI)Z")
	public static boolean method7605(@OriginalArg(0) Class126 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static111.anInt1752 - 104) / 2;
		@Pc(17) int local17 = (Static279.anInt4567 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(42) int local42;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static179.method2902(local21, arg1, local25, local29)) {
						local42 = local29;
						if (Static353.method5596(local21, local25)) {
							local42 = local29 - 1;
						}
						if (local42 >= 0) {
							local19 &= Static140.method2096(local42, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(96) int[] local96 = new int[262144];
		for (local29 = 0; local29 < local96.length; local29++) {
			local96[local29] = -16777216;
		}
		Static500.aClass44_22 = arg0.method7017(512, 512, local96, 512);
		Static235.method3631();
		local42 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + 238 - 10 | 0xFF000000;
		@Pc(168) int local168 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(192) int local192 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(202) boolean[][] local202 = new boolean[Static28.anInt534 + 3][Static28.anInt534 + 1 + 2];
		@Pc(208) int local208;
		@Pc(212) int local212;
		@Pc(214) int local214;
		@Pc(216) int local216;
		@Pc(225) int local225;
		@Pc(235) int local235;
		@Pc(243) int local243;
		@Pc(268) int local268;
		@Pc(272) int local272;
		@Pc(321) int local321;
		@Pc(328) int local328;
		@Pc(332) int local332;
		@Pc(355) int local355;
		for (@Pc(204) int local204 = local11; local204 < local11 + 104; local204 += Static28.anInt534) {
			for (local208 = local17; local208 < local17 + 104; local208 += Static28.anInt534) {
				local212 = 0;
				local214 = 0;
				local216 = local204;
				if (local204 > 0) {
					local212 += 4;
					local216 = local204 - 1;
				}
				local225 = local208;
				if (local208 > 0) {
					local225 = local208 - 1;
				}
				local235 = Static28.anInt534 + local204;
				if (local235 < 104) {
					local235++;
				}
				local243 = Static28.anInt534 + local208;
				if (local243 < 104) {
					local214 += 4;
					local243++;
				}
				arg0.KA(0, 0, local212 + Static28.anInt534 * 4, Static28.anInt534 * 4 + local214);
				arg0.GA(-16777216);
				@Pc(276) int local276;
				for (local268 = arg1; local268 <= 3; local268++) {
					for (local272 = 0; local272 <= Static28.anInt534; local272++) {
						for (local276 = 0; local276 <= Static28.anInt534; local276++) {
							local202[local272][local276] = Static179.method2902(local216 + local272, arg1, local276 + local225, local268);
						}
					}
					Static492.aClass40Array3[local268].method8439(local216, local225, local235, local243, local202);
					if (!Static492.aBoolean700) {
						for (local276 = -4; local276 < Static28.anInt534; local276++) {
							for (local321 = -4; local321 < Static28.anInt534; local321++) {
								local328 = local204 + local276;
								local332 = local321 + local208;
								if (local328 >= local11 && local332 >= local17 && Static179.method2902(local328, arg1, local332, local268)) {
									local355 = local268;
									if (Static353.method5596(local328, local332)) {
										local355 = local268 - 1;
									}
									if (local355 >= 0) {
										Static376.method5855(local355, local168, local328, local332, local276 * 4 + local212, local42, local214 + (Static28.anInt534 - local321) * 4 - 4, arg0);
									}
								}
							}
						}
					}
				}
				if (Static492.aBoolean700) {
					@Pc(408) Class182 local408 = Static308.aClass182Array1[arg1];
					for (local276 = 0; local276 < Static28.anInt534; local276++) {
						for (local321 = 0; local321 < Static28.anInt534; local321++) {
							local328 = local276 + local204;
							local332 = local208 + local321;
							local355 = local408.anIntArrayArray21[local328 - local408.anInt4545][local332 - local408.anInt4560];
							if ((local355 & 0x40240000) != 0) {
								arg0.method7045(4, 4, (Static28.anInt534 - local321) * 4 + local214 - 4, local276 * 4 + local212, -1713569622);
							} else if ((local355 & 0x800000) != 0) {
								arg0.method7033(local214 + (Static28.anInt534 - local321) * 4 - 4, 4, local212 + local276 * 4, -1713569622);
							} else if ((local355 & 0x2000000) != 0) {
								arg0.method7059(-1713569622, 4, local214 + (Static28.anInt534 - local321) * 4 - 4, local212 + (local276 * 4 - -3));
							} else if ((local355 & 0x8000000) != 0) {
								arg0.method7033((Static28.anInt534 - local321) * 4 + local214 - 1, 4, local276 * 4 + local212, -1713569622);
							} else if ((local355 & 0x20000000) != 0) {
								arg0.method7059(-1713569622, 4, (Static28.anInt534 - local321) * 4 + local214 - 4, local276 * 4 + local212);
							}
						}
					}
				}
				arg0.aa(local212, local214, Static28.anInt534 * 4, Static28.anInt534 * 4, local192, 2);
				Static500.aClass44_22.method5328((local204 - local11) * 4 + 48, -(Static28.anInt534 * 4) + 464 + -((-local17 + local208) * 4), Static28.anInt534 * 4, Static28.anInt534 * 4, local212, local214);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static101.method1476();
		Static482.anInt9636 = 0;
		Static490.aClass306_54.method7315();
		if (!Static492.aBoolean700) {
			for (local208 = local11; local208 < local11 + 104; local208++) {
				for (local212 = local17; local212 < local17 + 104; local212++) {
					for (local214 = arg1; arg1 + 1 >= local214 && local214 <= 3; local214++) {
						if (Static179.method2902(local208, arg1, local212, local214)) {
							@Pc(704) Interface20 local704 = (Interface20) Static70.method7879(local214, local208, local212);
							if (local704 == null) {
								local704 = (Interface20) Static1.method5727(local214, local208, local212, paa.class);
							}
							if (local704 == null) {
								local704 = (Interface20) Static601.method8388(local214, local208, local212);
							}
							if (local704 == null) {
								local704 = (Interface20) Static237.method3640(local214, local208, local212);
							}
							if (local704 != null) {
								@Pc(745) Class283 local745 = Static525.aClass371_4.method8554(local704.method8009());
								if (!local745.aBoolean640 || Static202.aBoolean294) {
									local235 = local745.anInt7802;
									if (local745.anIntArray623 != null) {
										for (local243 = 0; local243 < local745.anIntArray623.length; local243++) {
											if (local745.anIntArray623[local243] != -1) {
												@Pc(775) Class283 local775 = Static525.aClass371_4.method8554(local745.anIntArray623[local243]);
												if (local775.anInt7802 >= 0) {
													local235 = local775.anInt7802;
												}
											}
										}
									}
									if (local235 >= 0) {
										@Pc(794) boolean local794 = false;
										if (local235 >= 0) {
											@Pc(804) Class72 local804 = Static40.aClass273_3.method6529(local235);
											if (local804 != null && local804.aBoolean119) {
												local794 = true;
											}
										}
										local268 = local208;
										local272 = local212;
										if (local794) {
											@Pc(822) int[][] local822 = Static308.aClass182Array1[local214].anIntArrayArray21;
											local321 = Static308.aClass182Array1[local214].anInt4545;
											local328 = Static308.aClass182Array1[local214].anInt4560;
											for (local332 = 0; local332 < 10; local332++) {
												local355 = (int) (Math.random() * 4.0D);
												if (local355 == 0 && local11 < local268 && local208 - 3 < local268 && (local822[local268 - local321 - 1][local272 - local328] & 0x2C0108) == 0) {
													local268--;
												}
												if (local355 == 1 && local268 < local11 + 104 - 1 && local208 + 3 > local268 && (local822[local268 + 1 - local321][local272 - local328] & 0x2C0180) == 0) {
													local268++;
												}
												if (local355 == 2 && local272 > local17 && local212 - 3 < local272 && (local822[local268 - local321][local272 - local328 - 1] & 0x2C0102) == 0) {
													local272--;
												}
												if (local355 == 3 && local272 < local17 + 104 - 1 && local212 + 3 > local272 && (local822[local268 - local321][local272 + 1 - local328] & 0x2C0120) == 0) {
													local272++;
												}
											}
										}
										Static580.anIntArray818[Static482.anInt9636] = local745.anInt7807;
										Static650.anIntArray845[Static482.anInt9636] = local268;
										Static192.anIntArray688[Static482.anInt9636] = local272;
										Static482.anInt9636++;
									}
								}
							}
						}
					}
				}
			}
			if (Static173.aClass383_3 != null) {
				Static400.aClass384_100.anInt10469 = 1;
				Static40.aClass273_3.method6530(1024, 64);
				for (local212 = 0; local212 < Static173.aClass383_3.anInt10429; local212++) {
					local214 = Static173.aClass383_3.anIntArray839[local212];
					if (local214 >> 28 == Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125) {
						local216 = (local214 >> 14 & 0x3FFF) - Static113.anInt1785;
						local225 = (local214 & 0x3FFF) - Static622.anInt10087;
						if (local216 >= 0 && Static111.anInt1752 > local216 && local225 >= 0 && Static279.anInt4567 > local225) {
							Static490.aClass306_54.method7303(new Class5_Sub41(local212));
						} else {
							@Pc(1089) Class72 local1089 = Static40.aClass273_3.method6529(Static173.aClass383_3.anIntArray840[local212]);
							if (local1089.anIntArray130 != null && local216 + local1089.anInt1535 >= 0 && Static111.anInt1752 > local216 + local1089.anInt1528 && local1089.anInt1504 + local225 >= 0 && Static279.anInt4567 > local1089.anInt1529 + local225) {
								Static490.aClass306_54.method7303(new Class5_Sub41(local212));
							}
						}
					}
				}
				Static40.aClass273_3.method6530(128, 64);
				Static400.aClass384_100.anInt10469 = 2;
				Static400.aClass384_100.method8875();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)V")
	public static void method7606() {
		for (@Pc(7) int local7 = 0; local7 < Static58.anInt926; local7++) {
			@Pc(13) int local13 = Static191.anIntArray287[local7];
			@Pc(20) Class5_Sub13 local20 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local13);
			if (local20 != null) {
				@Pc(25) Class14_Sub1_Sub1_Sub3_Sub2 local25 = local20.aClass14_Sub1_Sub1_Sub3_Sub2_1;
				Static643.method8836(local25, local25.aClass271_1.anInt7335);
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	public static void method7607() {
		if (Static469.anInt7883 == 3) {
			Static214.method3254(4);
		} else if (Static469.anInt7883 == 7) {
			Static214.method3254(8);
		} else if (Static469.anInt7883 == 10) {
			Static214.method3254(11);
		}
	}
}
