import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ct", name = "Z", descriptor = "I")
	public static int anInt1665;

	@OriginalMember(owner = "client!ct", name = "kb", descriptor = "I")
	public static int anInt1673;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZB)V")
	public static void method1450(@OriginalArg(0) boolean arg0) {
		if (Static439.aClass210_1 != null) {
			Static439.aClass210_1.method8030();
			Static439.aClass210_1 = null;
		}
		Static585.anInt9601 = 0;
		Static320.method4827();
		Static410.method6309();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static19.aClass179Array2[local17].method4349();
		}
		Static328.method4913(false);
		System.gc();
		Static1.method5545();
		Static243.aBoolean394 = false;
		Static125.anInt2929 = -1;
		Static15.method320();
		Static219.method3758(true);
		Static127.anInt2955 = 0;
		Static451.anInt7933 = 0;
		Static415.anInt7580 = 0;
		Static470.anInt8063 = 0;
		Static462.anInt8018 = 0;
		Static164.anInt3693 = 0;
		for (@Pc(61) int local61 = 0; local61 < Static388.aClass60Array1.length; local61++) {
			Static388.aClass60Array1[local61] = null;
		}
		Static372.method5611();
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local77] = null;
		}
		Static228.anInt4647 = 0;
		Static357.aClass222_23.method5469();
		Static225.anInt4616 = 0;
		Static64.aClass222_5.method5469();
		Static386.method5818();
		Static43.anInt967 = 0;
		Static438.aClass198_1.method4753();
		Static146.method2808();
		Static234.method3889();
		Static308.aLong166 = 0L;
		Static442.aClass2_Sub35_1 = null;
		if (arg0) {
			Static51.method997(12);
			return;
		}
		Static51.method997(3);
		try {
			Static648.method3663("loggedout", Static234.anApplet2);
		} catch (@Pc(134) Throwable local134) {
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIILclient!ha;)V")
	public static void method1452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class87 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static544.anInt9049 == 0 || Static73.anInt1585 == 0) {
			return;
		}
		@Pc(28) Class6 local28;
		@Pc(47) int local47;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(53) int local53;
		@Pc(61) int local61;
		if (Static558.aBoolean680) {
			Static439.method6541(false);
			local28 = arg2.method7951();
			@Pc(31) int[] local31 = arg2.Y();
			local35 = local31[1];
			local39 = local31[2];
			local43 = local31[3];
			local47 = local31[0];
			local53 = arg1 + Static295.method4630(false);
			local61 = arg0 + Static229.method3861(false);
		} else {
			arg2.DA(Static512.anInt8594, Static96.anInt1898, Static544.anInt9049, Static73.anInt1585);
			local43 = Static73.anInt1585;
			local47 = Static512.anInt8594;
			local39 = Static544.anInt9049;
			local35 = Static96.anInt1898;
			arg2.KA(Static523.anInt8746, Static436.anInt7766, Static544.anInt9049, Static73.anInt1585);
			local28 = arg2.method7910();
			local28.method6698(Static382.anInt6846, Static416.anInt7584, Static471.anInt8086, Static507.anInt8552, Static519.anInt8687, Static594.anInt9789);
			arg2.method7896(local28);
			local61 = arg0;
			local53 = arg1;
		}
		if (local43 == 0) {
			local43 = 1;
		}
		Static271.method4375(true);
		if (local39 == 0) {
			local39 = 1;
		}
		@Pc(133) int local133;
		@Pc(162) int local162;
		@Pc(171) int local171;
		@Pc(271) int local271;
		@Pc(280) int local280;
		@Pc(291) int local291;
		@Pc(302) int local302;
		@Pc(125) int local125;
		@Pc(350) int local350;
		if (Static178.aClass112Array2 != null && (!Static301.aBoolean423 || (Static73.anInt1590 & 0x40) != 0)) {
			local125 = -1;
			@Pc(127) int local127 = -1;
			@Pc(130) int local130 = arg2.i();
			local133 = arg2.XA();
			@Pc(153) int local153;
			@Pc(144) int local144;
			if (Static172.aBoolean322) {
				local162 = local144 = (local53 - local47) * Static388.anInt6979 / local39;
				local153 = local171 = Static388.anInt6979 * (local61 - local35) / local43;
			} else {
				local144 = (local53 - local47) * local133 / local39;
				local153 = local130 * (local61 - local35) / local43;
				local162 = (local53 - local47) * local130 / local39;
				local171 = local133 * (local61 - local35) / local43;
			}
			@Pc(209) int[] local209 = new int[] { local162, local153, local130 };
			@Pc(224) int[] local224 = new int[] { local144, local171, local133 };
			local28.method6712(local209);
			local28.method6712(local224);
			@Pc(258) float local258 = Static147.method2817((float) local209[2], (float) local224[1], (float) local224[2], (float) local209[0], (float) local224[0], 4, (float) local209[1]);
			if (local258 > 0.0F) {
				local271 = local224[0] - local209[0];
				local280 = local224[2] - local209[2];
				local291 = (int) ((float) local209[0] + (float) local271 * local258);
				local302 = (int) (local258 * (float) local280 + (float) local209[2]);
				local125 = local291 + (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method2778() - 1 << 8) >> 9;
				local127 = local302 + (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method2778() - 1 << 8) >> 9;
				@Pc(330) byte local330 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124;
				if (local330 < 3 && (Static244.aByteArrayArrayArray9[1][local291 >> 9][local302 >> 9] & 0x2) != 0) {
					local350 = local330 + 1;
				}
			}
			if (local125 != -1 && local127 != -1) {
				if (Static301.aBoolean423 && (Static73.anInt1590 & 0x40) != 0) {
					@Pc(417) Class78 local417 = Static496.method7080(Static342.anInt6258, Static590.anInt9763);
					if (local417 == null) {
						Static171.method3178();
					} else {
						Static115.method1856((long) (local125 << 0 | local127), " ->", local125, 0L, true, Static81.aString20, 21, true, local127, false, Static20.anInt623, -1);
					}
				} else {
					if (Static206.aBoolean362) {
						Static115.method1856((long) (local125 << 0 | local127), "", local125, 0L, true, Static628.aClass369_27.method8475(Static377.anInt6756), 19, true, local127, false, -1, -1);
					}
					Static115.method1856((long) (local127 | local125 << 0), "", local125, 0L, true, Static256.aString51, 16, true, local127, false, Static350.anInt6442, -1);
				}
			}
		}
		if (Static558.aBoolean680) {
			Static295.method4627();
		}
		for (local125 = 0; (Static558.aBoolean680 ? 2 : 1) > local125; local125++) {
			@Pc(460) boolean local460 = local125 == 0;
			@Pc(466) Class329 local466 = local460 ? Static98.aClass329_2 : Static275.aClass329_3;
			local133 = arg1;
			local162 = arg0;
			if (Static558.aBoolean680) {
				Static439.method6541(local460);
				local133 = arg1 + Static295.method4630(local460);
				local162 = arg0 + Static229.method3861(local460);
			}
			@Pc(490) Class143 local490 = local466.aClass143_8;
			for (@Pc(497) Class11_Sub10 local497 = (Class11_Sub10) local490.method3536(); local497 != null; local497 = (Class11_Sub10) local490.method3528()) {
				if ((Static230.aBoolean633 || local497.aClass11_Sub1_3.aByte124 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124) && local497.method8373(local162, arg2, local133)) {
					@Pc(532) int local532;
					if (local497.aClass11_Sub1_3 instanceof Class11_Sub1_Sub1) {
						local171 = ((Class11_Sub1_Sub1) local497.aClass11_Sub1_3).aShort95;
						local532 = ((Class11_Sub1_Sub1) local497.aClass11_Sub1_3).aShort97;
					} else {
						local532 = local497.aClass11_Sub1_3.anInt9929 >> 9;
						local171 = local497.aClass11_Sub1_3.anInt9925 >> 9;
					}
					@Pc(665) int local665;
					@Pc(677) int local677;
					@Pc(786) int local786;
					@Pc(562) int local562;
					if (local497.aClass11_Sub1_3 instanceof Class11_Sub1_Sub1_Sub2_Sub1) {
						@Pc(558) Class11_Sub1_Sub1_Sub2_Sub1 local558 = (Class11_Sub1_Sub1_Sub2_Sub1) local497.aClass11_Sub1_3;
						local562 = local558.method2778();
						if ((local562 & 0x1) == 0 && (local558.anInt9925 & 0x1FF) == 0 && (local558.anInt9929 & 0x1FF) == 0 || (local562 & 0x1) == 1 && (local558.anInt9925 & 0x1FF) == 256 && (local558.anInt9929 & 0x1FF) == 256) {
							local271 = local558.anInt9925 - (local558.method2778() - 1 << 8);
							local280 = local558.anInt9929 - (local558.method2778() - 1 << 8);
							for (local291 = 0; local291 < Static228.anInt4647; local291++) {
								@Pc(635) Class2_Sub51 local635 = (Class2_Sub51) Static357.aClass222_23.method5468((long) Static160.anIntArray256[local291]);
								if (local635 != null) {
									@Pc(640) Class11_Sub1_Sub1_Sub2_Sub2 local640 = local635.aClass11_Sub1_Sub1_Sub2_Sub2_2;
									if (local640.anInt3234 != Static325.anInt5888 && local640.aBoolean276) {
										local665 = local640.anInt9925 - (local640.aClass236_1.anInt6892 - 1 << 8);
										local677 = local640.anInt9929 - (local640.aClass236_1.anInt6892 - 1 << 8);
										if (local665 >= local271 && local640.aClass236_1.anInt6892 <= local558.method2778() - (local665 - local271 >> 9) && local677 >= local280 && local640.aClass236_1.anInt6892 <= local558.method2778() - (local677 - local280 >> 9)) {
											Static41.method839(local640, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 != local497.aClass11_Sub1_3.aByte124);
											local640.anInt3234 = Static325.anInt5888;
										}
									}
								}
							}
							local302 = Static571.anInt9395;
							@Pc(751) int[] local751 = Static131.anIntArray213;
							for (local665 = 0; local665 < local302; local665++) {
								@Pc(761) Class11_Sub1_Sub1_Sub2_Sub1 local761 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local751[local665]];
								if (local761 != null && local761.anInt3234 != Static325.anInt5888 && local558 != local761 && local761.aBoolean276) {
									local786 = local761.anInt9925 - (local761.method2778() - 1 << 8);
									@Pc(797) int local797 = local761.anInt9929 - (local761.method2778() - 1 << 8);
									if (local271 <= local786 && local761.method2778() <= local558.method2778() - (local786 - local271 >> 9) && local797 >= local280 && local761.method2778() <= local558.method2778() - (local797 - local280 >> 9)) {
										Static335.method4774(local497.aClass11_Sub1_3.aByte124 != Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124, local761);
										local761.anInt3234 = Static325.anInt5888;
									}
								}
							}
						}
						if (local558.anInt3234 == Static325.anInt5888) {
							continue;
						}
						Static335.method4774(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 != local497.aClass11_Sub1_3.aByte124, local558);
						local558.anInt3234 = Static325.anInt5888;
					}
					if (local497.aClass11_Sub1_3 instanceof Class11_Sub1_Sub1_Sub2_Sub2) {
						@Pc(889) Class11_Sub1_Sub1_Sub2_Sub2 local889 = (Class11_Sub1_Sub1_Sub2_Sub2) local497.aClass11_Sub1_3;
						if (local889.aClass236_1 != null) {
							if ((local889.aClass236_1.anInt6892 & 0x1) == 0 && (local889.anInt9925 & 0x1FF) == 0 && (local889.anInt9929 & 0x1FF) == 0 || (local889.aClass236_1.anInt6892 & 0x1) == 1 && (local889.anInt9925 & 0x1FF) == 256 && (local889.anInt9929 & 0x1FF) == 256) {
								local562 = local889.anInt9925 - (local889.aClass236_1.anInt6892 - 1 << 8);
								local271 = local889.anInt9929 - (local889.aClass236_1.anInt6892 - 1 << 8);
								for (local280 = 0; local280 < Static228.anInt4647; local280++) {
									@Pc(970) Class2_Sub51 local970 = (Class2_Sub51) Static357.aClass222_23.method5468((long) Static160.anIntArray256[local280]);
									if (local970 != null) {
										@Pc(975) Class11_Sub1_Sub1_Sub2_Sub2 local975 = local970.aClass11_Sub1_Sub1_Sub2_Sub2_2;
										if (local975.anInt3234 != Static325.anInt5888 && local889 != local975 && local975.aBoolean276) {
											local350 = local975.anInt9925 - (local975.aClass236_1.anInt6892 - 1 << 8);
											local665 = local975.anInt9929 - (local975.aClass236_1.anInt6892 - 1 << 8);
											if (local562 <= local350 && local975.aClass236_1.anInt6892 <= local889.aClass236_1.anInt6892 - (local350 - local562 >> 9) && local271 <= local665 && local889.aClass236_1.anInt6892 - (local665 - local271 >> 9) >= local975.aClass236_1.anInt6892) {
												Static41.method839(local975, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 != local497.aClass11_Sub1_3.aByte124);
												local975.anInt3234 = Static325.anInt5888;
											}
										}
									}
								}
								local291 = Static571.anInt9395;
								@Pc(1086) int[] local1086 = Static131.anIntArray213;
								for (local350 = 0; local350 < local291; local350++) {
									@Pc(1096) Class11_Sub1_Sub1_Sub2_Sub1 local1096 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local1086[local350]];
									if (local1096 != null && local1096.anInt3234 != Static325.anInt5888 && local1096.aBoolean276) {
										local677 = local1096.anInt9925 - (local1096.method2778() - 1 << 8);
										local786 = local1096.anInt9929 - (local1096.method2778() - 1 << 8);
										if (local562 <= local677 && local1096.method2778() <= local889.aClass236_1.anInt6892 - (local677 - local562 >> 9) && local271 <= local786 && local1096.method2778() <= local889.aClass236_1.anInt6892 - (local786 - local271 >> 9)) {
											Static335.method4774(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 != local497.aClass11_Sub1_3.aByte124, local1096);
											local1096.anInt3234 = Static325.anInt5888;
										}
									}
								}
							}
							if (local889.anInt3234 == Static325.anInt5888) {
								continue;
							}
							Static41.method839(local889, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 != local497.aClass11_Sub1_3.aByte124);
							local889.anInt3234 = Static325.anInt5888;
						}
					}
					if (local497.aClass11_Sub1_3 instanceof Class11_Sub1_Sub5_Sub1) {
						@Pc(1233) int local1233 = Static451.anInt7933 + local171;
						local562 = Static470.anInt8063 + local532;
						@Pc(1254) Class2_Sub44 local1254 = (Class2_Sub44) Static64.aClass222_5.method5468((long) (local562 << 14 | local497.aClass11_Sub1_3.aByte124 << 28 | local1233));
						if (local1254 != null) {
							local280 = 0;
							for (@Pc(1264) Class2_Sub6 local1264 = (Class2_Sub6) local1254.aClass238_59.method5834(); local1264 != null; local1264 = (Class2_Sub6) local1254.aClass238_59.method5843()) {
								@Pc(1272) Class245 local1272 = Static570.aClass267_2.method6597(local1264.anInt842);
								if (Static301.aBoolean423 && local497.aClass11_Sub1_3.aByte124 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124) {
									@Pc(1294) Class79 local1294 = Static608.anInt3500 == -1 ? null : Static584.aClass206_2.method4916(Static608.anInt3500);
									if ((Static73.anInt1590 & 0x1) != 0 && (local1294 == null || local1272.method6277(Static608.anInt3500, local1294.anInt2016) != local1294.anInt2016)) {
										Static115.method1856((long) local280, Static109.aString27 + " -> <col=ff9040>" + local1272.aString72, local171, (long) local1264.anInt842, true, Static81.aString20, 50, false, local532, false, Static20.anInt623, -1);
									}
								}
								if (local497.aClass11_Sub1_3.aByte124 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124) {
									@Pc(1349) String[] local1349 = local1272.aStringArray26;
									for (local665 = 4; local665 >= 0; local665--) {
										if (local1349 != null && local1349[local665] != null) {
											@Pc(1361) byte local1361 = 0;
											if (local665 == 0) {
												local1361 = 45;
											}
											local786 = Static492.anInt8385;
											if (local665 == 1) {
												local1361 = 48;
											}
											if (local665 == 2) {
												local1361 = 9;
											}
											if (local665 == 3) {
												local1361 = 58;
											}
											if (local665 == 4) {
												local1361 = 3;
											}
											if (local665 == local1272.anInt7492) {
												local786 = local1272.anInt7462;
											}
											if (local665 == local1272.anInt7487) {
												local786 = local1272.anInt7447;
											}
											Static115.method1856((long) local280, "<col=ff9040>" + local1272.aString72, local171, (long) local1264.anInt842, true, local1349[local665], local1361, false, local532, false, local786, -1);
										}
									}
								}
								Static115.method1856((long) local280, "<col=ff9040>" + local1272.aString72, local171, (long) local1264.anInt842, true, Static628.aClass369_22.method8475(Static377.anInt6756), 1002, false, local532, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 != local497.aClass11_Sub1_3.aByte124, Static258.anInt10109, -1);
								local280++;
							}
						}
					}
					if (local497.aClass11_Sub1_3 instanceof Interface27) {
						@Pc(1503) Interface27 local1503 = (Interface27) local497.aClass11_Sub1_3;
						@Pc(1512) Class350 local1512 = Static619.aClass281_4.method6734(local1503.method8326());
						if (local1512.anIntArray665 != null) {
							local1512 = local1512.method8080(Static438.aClass198_1);
						}
						if (local1512 != null) {
							if (Static301.aBoolean423 && local497.aClass11_Sub1_3.aByte124 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124) {
								@Pc(1541) Class79 local1541 = Static608.anInt3500 == -1 ? null : Static584.aClass206_2.method4916(Static608.anInt3500);
								if ((Static73.anInt1590 & 0x4) != 0 && (local1541 == null || local1512.method8077(local1541.anInt2016, Static608.anInt3500) != local1541.anInt2016)) {
									Static115.method1856((long) local1503.hashCode(), Static109.aString27 + " -> <col=00ffff>" + local1512.aString90, local171, Static334.method5170(local1503, local171, local532), true, Static81.aString20, 57, false, local532, false, Static20.anInt623, -1);
								}
							}
							if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 == local497.aClass11_Sub1_3.aByte124) {
								@Pc(1603) String[] local1603 = local1512.aStringArray41;
								if (local1603 != null) {
									for (local280 = 4; local280 >= 0; local280--) {
										if (local1603[local280] != null) {
											@Pc(1615) short local1615 = 0;
											local302 = Static492.anInt8385;
											if (local280 == 0) {
												local1615 = 15;
											}
											if (local280 == 1) {
												local1615 = 2;
											}
											if (local280 == 2) {
												local1615 = 59;
											}
											if (local280 == 3) {
												local1615 = 11;
											}
											if (local280 == 4) {
												local1615 = 1011;
											}
											if (local1512.anInt9658 == local280) {
												local302 = local1512.anInt9630;
											}
											if (local1512.anInt9641 == local280) {
												local302 = local1512.anInt9663;
											}
											Static115.method1856((long) local1503.hashCode(), "<col=00ffff>" + local1512.aString90, local171, Static334.method5170(local1503, local171, local532), true, local1603[local280], local1615, false, local532, false, local302, -1);
										}
									}
								}
								Static115.method1856((long) local1503.hashCode(), "<col=00ffff>" + local1512.aString90, local171, (long) local1512.anInt9607, true, Static628.aClass369_22.method8475(Static377.anInt6756), 1012, false, local532, local497.aClass11_Sub1_3.aByte124 != Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124, Static258.anInt10109, -1);
							}
						}
					}
				}
			}
			if (Static558.aBoolean680) {
				Static295.method4627();
			}
		}
		Static271.method4375(false);
	}
}
