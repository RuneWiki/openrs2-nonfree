import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aca", name = "H", descriptor = "[Lclient!uaa;")
	public static Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "([III[I[[[BII[IIZZII[IB[III)V")
	public static void method108(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(13) int[] arg11, @OriginalArg(14) byte arg12, @OriginalArg(15) int[] arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int arg15) {
		if (Static244.anInt4841 == -1) {
			return;
		}
		@Pc(11) int[] local11 = Static167.aClass87_3.Y();
		@Pc(15) int local15 = local11[0];
		@Pc(19) int local19 = local11[1];
		@Pc(23) int local23 = local11[2];
		@Pc(27) int local27 = local11[3];
		@Pc(29) int local29 = local23;
		@Pc(31) int local31 = local27;
		if (Static244.anInt4841 == 1) {
			local29 = (int) ((double) Static400.anInt7142 * (double) local23 / (double) Static326.anInt5898);
			local31 = (int) ((double) Static400.anInt7142 * (double) local27 / (double) Static326.anInt5898);
		}
		if (!Static445.aBoolean594) {
			if (Static244.anInt4841 == 1) {
				Static452.method7676();
			}
			@Pc(69) int local69 = arg15 - Static287.anInt5392;
			@Pc(74) int local74 = arg5 - Static339.anInt6235;
			@Pc(79) int local79 = arg2 - Static458.anInt7977;
			@Pc(101) int local101 = (int) ((double) local29 * (Static562.aDouble22 * (double) local79 + (double) local69 * Static233.aDouble10 + (double) local74 * Static162.aDouble5) / (double) arg6);
			@Pc(123) int local123 = (int) ((double) local31 * (Static361.aDouble12 * (double) local74 + Static565.aDouble23 * (double) local69 + (double) local79 * Static41.aDouble1) / (double) arg6);
			@Pc(138) double local138 = Static184.aDouble7 * (double) local79 + Static163.aDouble6 * (double) local74 + (double) local69 * Static226.aDouble9;
			@Pc(146) int local146 = Static617.anInt10026 + local101 - Static240.anInt4766;
			@Pc(153) int local153 = local123 + Static53.anInt1152 - Static329.anInt9815;
			@Pc(158) int local158 = local146 + Static312.anInt5689;
			@Pc(162) int local162 = Static400.anInt7142 + local153;
			if (local146 >= 0 && local153 >= 0 && local158 <= Static250.anInt8280 && Static326.anInt5898 >= local162 || Static244.anInt4841 == 2) {
				Static183.anInt4032 = local153;
				Static134.anInt3047 = local146;
				if (Static244.anInt4841 == 2) {
					Static143.aDouble3 = -local138;
				}
			} else if (local158 > 0 && local162 > 0 && local146 < Static250.anInt8280 && Static326.anInt5898 > local153) {
				@Pc(223) int local223 = local146 - Static617.anInt10026;
				@Pc(227) int local227 = local153 - Static53.anInt1152;
				@Pc(229) int local229 = 0;
				@Pc(231) int local231 = 0;
				@Pc(233) int local233 = 0;
				@Pc(235) int local235 = 0;
				@Pc(237) double local237 = 0.0D;
				if (Static244.anInt4841 == 0) {
					local237 = local138 + Static143.aDouble3;
					local229 = local223;
					local231 = local227;
				} else if (Static244.anInt4841 == 1) {
					local235 = local227 / Static155.anInt3544;
					local233 = local223 / Static531.anInt8888;
					local231 = local235 * Static155.anInt3544;
					local229 = local233 * Static531.anInt8888;
					local237 = (local138 + Static143.aDouble3) * (double) (local229 * local223 + local227 * local231) / (double) (local223 * local223 + local227 * local227);
				}
				local237 = -local237;
				@Pc(297) int local297 = 0;
				@Pc(299) int local299 = 0;
				@Pc(301) int local301 = 0;
				@Pc(303) int local303 = 0;
				@Pc(305) int local305 = 0;
				@Pc(307) int local307 = 0;
				@Pc(314) int local314;
				@Pc(318) int local318;
				@Pc(320) int local320;
				@Pc(322) int local322;
				if (local229 >= 0) {
					local314 = 0;
					local318 = Static250.anInt8280 - local229;
					local320 = local318;
					local322 = local229;
					if (Static244.anInt4841 == 1) {
						local301 = Static466.anInt4483 - local233;
						local305 = local233;
					}
				} else {
					local318 = local229 + Static250.anInt8280;
					local320 = 0;
					local314 = -local229;
					if (Static244.anInt4841 == 1) {
						local301 = 0;
						local305 = -local233;
					}
					local322 = local314;
				}
				@Pc(366) int local366;
				@Pc(363) int local363;
				@Pc(368) int local368;
				@Pc(370) int local370;
				@Pc(390) int local390;
				if (local231 < 0) {
					local363 = Static326.anInt5898 + local231;
					local366 = -local231;
					local368 = 0;
					local370 = local366;
					if (Static244.anInt4841 == 1) {
						local299 = -local235;
						local297 = 0;
						local303 = local299;
						local307 = Static207.anInt4335 + local235;
					}
					local390 = local366;
				} else {
					local366 = 0;
					local363 = Static326.anInt5898 - local231;
					if (Static244.anInt4841 == 1) {
						local299 = local235;
						local303 = 0;
						local297 = Static207.anInt4335 - local235;
						local307 = local297;
					}
					local370 = local231;
					local390 = 0;
					local368 = local363;
				}
				@Pc(423) Class143 local423 = Static275.aClass329_3.aClass143_8;
				@Pc(436) int local436;
				for (@Pc(428) Class11_Sub10 local428 = (Class11_Sub10) local423.method3536(); local428 != null; local428 = (Class11_Sub10) local423.method3528()) {
					@Pc(432) Class11_Sub7[] local432 = local428.aClass11_Sub7Array1;
					@Pc(434) boolean local434 = true;
					for (local436 = 0; local436 < local432.length; local436++) {
						@Pc(441) Class11_Sub7 local441 = local432[local436];
						@Pc(444) int local444 = local441.anInt4698;
						@Pc(447) int local447 = local441.anInt4696;
						@Pc(450) int local450 = local441.anInt4699;
						@Pc(453) int local453 = local441.anInt4697;
						@Pc(459) int local459;
						local441.anInt4696 = local459 = local447 - local231;
						@Pc(467) int local467;
						local441.anInt4697 = local467 = local453 - local231;
						@Pc(471) int local471 = local441.anInt4700;
						@Pc(478) int local478;
						local441.anInt4698 = local478 = local444 - local229;
						@Pc(485) int local485;
						local441.anInt4699 = local485 = local450 - local229;
						if (local434) {
							@Pc(501) int local501 = (local478 >= local485 ? local485 : local478) - local471;
							if (local501 <= Static250.anInt8280) {
								@Pc(513) int local513 = (local467 > local459 ? local459 : local467) - local471;
								if (local513 <= Static326.anInt5898) {
									@Pc(529) int local529 = local471 + (local478 < local485 ? local485 : local478);
									if (local529 >= 0) {
										@Pc(541) int local541 = (local467 <= local459 ? local459 : local467) + local471;
										if (local541 >= 0) {
											local434 = false;
										}
									}
								}
							}
						}
					}
					if (local434) {
						local428.method8372();
						Static186.method3340(local428);
					}
				}
				if (Static244.anInt4841 == 0) {
					Static167.aClass87_3.method7949(Static401.anInterface24_1);
				}
				Static167.aClass87_3.F(-local229, -local231);
				Static167.aClass87_3.b(local314, local366, local318, local363, local237);
				Static627.method8471(local237 + Static143.aDouble3);
				Static617.aDouble24 = Static143.aDouble3 + local237;
				if (Static244.anInt4841 == 1) {
					Static475.anInt8806 = local29;
					Static569.anInt9376 = local19 - Static329.anInt9815 - local231;
					Static195.anInt9462 = local31;
					Static98.anInt1918 = local15 - local229 - Static240.anInt4766;
					Static167.aClass87_3.DA(Static98.anInt1918, Static569.anInt9376, Static475.anInt8806, Static195.anInt9462);
				} else {
					Static569.anInt9376 = local19 + Static53.anInt1152 - local231 - Static329.anInt9815;
					Static475.anInt8806 = local29;
					Static98.anInt1918 = local15 + Static617.anInt10026 - Static240.anInt4766 - local229;
					Static195.anInt9462 = local31;
					Static167.aClass87_3.DA(Static98.anInt1918, Static569.anInt9376, Static475.anInt8806, Static195.anInt9462);
				}
				Static550.method7654(Static275.aClass329_3);
				if (local370 > 0) {
					Static167.aClass87_3.KA(0, local368, Static250.anInt8280, local368 + local370);
					Static167.aClass87_3.ya();
					Static167.aClass87_3.GA(Static107.anInt2141);
					Static80.method1497(arg14, arg15, arg5, arg2, arg4, arg0, arg11, arg3, arg13, arg7, arg10, arg12, arg8, arg1, arg9, arg6, 1, false);
				}
				if (local322 > 0) {
					Static167.aClass87_3.KA(local320, local390, local320 + local322, local390 - -local363);
					Static167.aClass87_3.ya();
					Static167.aClass87_3.GA(Static107.anInt2141);
					Static80.method1497(arg14, arg15, arg5, arg2, arg4, arg0, arg11, arg3, arg13, arg7, arg10, arg12, arg8, arg1, arg9, arg6, 1, false);
				}
				Static167.aClass87_3.la();
				Static476.method6813();
				if (Static244.anInt4841 == 0) {
					Static167.aClass87_3.method7895();
				}
				Static329.anInt9815 += local231;
				Static240.anInt4766 += local229;
				Static143.aDouble3 += local237;
				Static183.anInt4032 = local123 + Static53.anInt1152 - Static329.anInt9815;
				Static134.anInt3047 = local101 + Static617.anInt10026 - Static240.anInt4766;
				if (Static244.anInt4841 == 1) {
					Static78.anInt1695 += local233;
					Static260.anInt5098 += local235;
					for (@Pc(769) int local769 = 0; local769 < Static207.anInt4335; local769++) {
						@Pc(779) int local779 = Static438.method6516(Static260.anInt5098 + local769, Static207.anInt4335) * Static466.anInt4483;
						for (local436 = 0; local436 < Static466.anInt4483; local436++) {
							@Pc(792) int local792 = local779 + Static438.method6516(local436 + Static78.anInt1695, Static466.anInt4483);
							@Pc(833) boolean local833 = local769 >= local297 && local297 + local299 > local769 || local303 <= local769 && local769 < local307 + local303 && local436 >= local301 && local436 < local301 + local305;
							anInterface24Array1[local792].method8381(local436 * Static531.anInt8888, local769 * Static155.anInt3544, Static531.anInt8888, Static155.anInt3544, local833);
						}
					}
				}
			} else {
				Static445.aBoolean594 = true;
			}
		}
		if (Static445.aBoolean594) {
			Static183.anInt4032 = Static53.anInt1152;
			Static287.anInt5392 = arg15;
			Static134.anInt3047 = Static617.anInt10026;
			Static339.anInt6235 = arg5;
			Static240.anInt4766 = 0;
			Static329.anInt9815 = 0;
			Static143.aDouble3 = 0.0D;
			Static458.anInt7977 = arg2;
			if (Static244.anInt4841 == 0) {
				Static167.aClass87_3.method7949(Static401.anInterface24_1);
			}
			Static167.aClass87_3.la();
			Static167.aClass87_3.ya();
			Static167.aClass87_3.GA(Static107.anInt2141);
			Static581.aClass6_36.method6698(Static287.anInt5392, Static339.anInt6235, Static458.anInt7977, Static318.anInt5776, Static594.anInt9790, Static491.anInt8363);
			Static167.aClass87_3.method7896(Static581.aClass6_36);
			if (Static244.anInt4841 == 1) {
				Static98.anInt1918 = local15;
				Static195.anInt9462 = local31;
				Static569.anInt9376 = local19;
				Static475.anInt8806 = local29;
				Static167.aClass87_3.DA(Static98.anInt1918, Static569.anInt9376, Static475.anInt8806, Static195.anInt9462);
			} else {
				Static475.anInt8806 = local29;
				Static98.anInt1918 = Static617.anInt10026 + local15;
				Static569.anInt9376 = local19 + Static53.anInt1152;
				Static195.anInt9462 = local31;
				Static167.aClass87_3.DA(Static98.anInt1918, Static569.anInt9376, Static475.anInt8806, Static195.anInt9462);
			}
			Static617.aDouble24 = 0.0D;
			Static275.aClass329_3.method7691();
			Static550.method7654(Static275.aClass329_3);
			Static80.method1497(arg14, arg15, arg5, arg2, arg4, arg0, arg11, arg3, arg13, arg7, arg10, arg12, arg8, arg1, arg9, arg6, 1, false);
			Static476.method6813();
			Static445.aBoolean594 = false;
			if (Static244.anInt4841 == 0) {
				Static167.aClass87_3.method7895();
			}
			if (Static244.anInt4841 == 1) {
				Static616.method8377();
			}
		}
		if (Static244.anInt4841 == 0) {
			Static401.anInterface24_1.method8382(Static134.anInt3047, Static183.anInt4032, Static312.anInt5689, Static400.anInt7142, 0, 0);
		}
		Static250.anInt8281++;
		Static627.method8471(Static143.aDouble3);
		Static463.aDouble21 = Static143.aDouble3;
		if (Static244.anInt4841 == 0 || Static244.anInt4841 == 2) {
			if (Static244.anInt4841 == 2) {
				Static167.aClass87_3.GA(Static107.anInt2141);
				Static167.aClass87_3.ya();
			}
			Static399.anInt7127 = local31;
			Static456.anInt7968 = Static53.anInt1152 + local19 - Static183.anInt4032 - Static329.anInt9815;
			Static323.anInt5853 = local29;
			Static283.anInt5362 = local15 + Static617.anInt10026 - Static134.anInt3047 - Static240.anInt4766;
			Static167.aClass87_3.DA(Static283.anInt5362, Static456.anInt7968, Static323.anInt5853, Static399.anInt7127);
		} else if (Static244.anInt4841 == 1) {
			Static283.anInt5362 = local15 - Static240.anInt4766;
			Static399.anInt7127 = local31;
			Static323.anInt5853 = local29;
			Static456.anInt7968 = local19 - Static329.anInt9815;
			Static167.aClass87_3.DA(Static283.anInt5362, Static456.anInt7968, Static323.anInt5853, Static399.anInt7127);
			Static167.aClass87_3.KA(Static134.anInt3047, Static183.anInt4032, Static134.anInt3047 + Static312.anInt5689, Static400.anInt7142 + Static183.anInt4032);
		}
		Static80.method1497(arg14, arg15, arg5, arg2, arg4, arg0, arg11, arg3, arg13, arg7, arg10, arg12, arg8, arg1, arg9, arg6, Static244.anInt4841 == 2 ? 0 : 2, Static244.anInt4841 == 1);
		Static167.aClass87_3.la();
		Static167.aClass87_3.DA(local15, local19, local23, local27);
	}
}
