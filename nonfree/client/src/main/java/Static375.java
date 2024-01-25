import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "F")
	public static float aFloat130;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "Z")
	public static boolean aBoolean434 = false;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
	public static int anInt6600 = 0;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[B)Z")
	public static boolean method5714(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class1_Sub13 local13 = new Class1_Sub13(arg0);
		@Pc(17) int local17 = local13.method3043();
		if (local17 != 2) {
			return false;
		}
		@Pc(35) boolean local35 = local13.method3043() == 1;
		if (local35) {
			Static428.method2377(local13);
		}
		Static200.method3718(local13);
		return true;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBLclient!qa;I)V")
	public static void method5715(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static434.anInt7455 == 0 || Static15.anInt834 == 0) {
			return;
		}
		arg1.b(Static337.anInt6309, Static367.anInt6543, Static434.anInt7455, Static15.anInt834);
		arg1.N(Static145.anInt3324, Static313.anInt5978, Static434.anInt7455, Static15.anInt834);
		@Pc(37) Class22 local37 = arg1.method7644();
		local37.B(Static470.anInt6523, Static536.anInt9311, Static163.anInt3580, Static423.anInt8967, Static208.anInt4353, Static59.anInt1655);
		arg1.method7597(local37);
		@Pc(57) int local57;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(78) int local78;
		@Pc(87) int local87;
		@Pc(96) int local96;
		@Pc(111) int[] local111;
		@Pc(143) int local143;
		@Pc(152) int local152;
		if (Static53.aClass10Array3 != null) {
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			local57 = arg1.c();
			local66 = local57 * (arg0 - Static337.anInt6309) / Static434.anInt7455;
			local75 = local57 * (arg2 - Static367.anInt6543) / Static15.anInt834;
			local78 = arg1.CA();
			local87 = (arg0 - Static337.anInt6309) * local78 / Static434.anInt7455;
			local96 = local78 * (arg2 - Static367.anInt6543) / Static15.anInt834;
			local111 = new int[] { local66, local75, local57 };
			local37.va(local111);
			@Pc(129) int[] local129 = new int[] { local87, local96, local78 };
			local37.va(local129);
			@Pc(134) float local134 = 0.0F;
			local143 = local129[0] - local111[0];
			local152 = local129[1] - local111[1];
			@Pc(161) int local161 = local129[2] - local111[2];
			while (local134 < 1.0F) {
				@Pc(173) int local173 = (int) ((float) local111[0] + local134 * (float) local143);
				@Pc(177) int local177 = local173 >> 7;
				@Pc(188) int local188 = (int) ((float) local161 * local134 + (float) local111[2]);
				@Pc(192) int local192 = local188 >> 7;
				if (local177 > 0 && local192 > 0 && local177 < Static542.anInt9387 && local192 < Static36.anInt1324) {
					@Pc(205) int local205 = Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94;
					if (local205 < 3 && (Static542.aByteArrayArrayArray17[1][local177][local192] & 0x2) != 0) {
						local205++;
					}
					if ((float) Static53.aClass10Array3[local205].aa(local173, local188) < local134 * (float) local152 + (float) local111[1]) {
						local52 = (Static16.aClass47_Sub2_Sub3_Sub2_1.method4350() - 1 << 6) + local173 >> 7;
						local54 = (Static16.aClass47_Sub2_Sub3_Sub2_1.method4350() - 1 << 6) + local188 >> 7;
						break;
					}
				}
				local134 = (float) ((double) local134 + 0.01D);
			}
			if (local52 != -1 && local54 != -1) {
				if (Static382.aBoolean440 && (Static276.anInt5433 & 0x40) != 0) {
					@Pc(331) Class309 local331 = Static210.method3818(Static323.anInt6116, Static423.anInt8970);
					if (local331 == null) {
						Static214.method3846();
					} else {
						Static179.method3455(local54, Static444.anInt7508, 0L, true, 4, Static433.aString72, false, -1, local52, " ->");
					}
				} else {
					if (Static538.aClass37_4 == Static452.aClass37_3) {
						Static179.method3455(local54, -1, 0L, true, 25, Static472.aClass114_153.method3330(Static315.anInt5993), false, -1, local52, "");
					}
					Static179.method3455(local54, Static325.anInt6335, 0L, true, 18, Static538.aString84, false, -1, local52, "");
				}
			}
		}
		@Pc(350) Class145 local350 = Static314.aClass145_5;
		for (@Pc(355) Class2_Sub6 local355 = (Class2_Sub6) local350.method3919(); local355 != null; local355 = (Class2_Sub6) local350.method3926()) {
			if ((Static273.aBoolean371 || local355.anInt4360 == Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94) && local355.method3803(arg1, arg0, arg2)) {
				@Pc(483) int local483;
				@Pc(495) int local495;
				if (local355.aClass47_1 instanceof Class47_Sub2_Sub3_Sub2) {
					@Pc(380) Class47_Sub2_Sub3_Sub2 local380 = (Class47_Sub2_Sub3_Sub2) local355.aClass47_1;
					local66 = local380.method4350();
					if ((local66 & 0x1) == 0 && (local380.anInt8189 & 0x7F) == 0 && (local380.anInt8191 & 0x7F) == 0 || (local66 & 0x1) == 1 && (local380.anInt8189 & 0x7F) == 64 && (local380.anInt8191 & 0x7F) == 64) {
						local75 = local380.anInt8189 - (local380.method4350() - 1 << 6);
						local78 = local380.anInt8191 - (local380.method4350() - 1 << 6);
						for (local87 = 0; local87 < Static457.anInt7857; local87++) {
							@Pc(458) Class1_Sub10 local458 = (Class1_Sub10) Static258.aClass174_15.method4422((long) Static386.anIntArray503[local87]);
							if (local458 != null) {
								@Pc(463) Class47_Sub2_Sub3_Sub1 local463 = local458.aClass47_Sub2_Sub3_Sub1_2;
								if (local463.anInt5048 != Static416.anInt7252 && local463.aBoolean342) {
									local483 = local463.anInt8189 - (local463.aClass238_1.anInt6754 - 1 << 6);
									local495 = local463.anInt8191 - (local463.aClass238_1.anInt6754 - 1 << 6);
									if (local483 >= local75 && local463.aClass238_1.anInt6754 <= local380.method4350() - (local483 - local75 >> 7) && local495 >= local78 && local463.aClass238_1.anInt6754 <= local380.method4350() - (local495 - local78 >> 7)) {
										Static155.method3124(local463, local355.anInt4360 != Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94);
										local463.anInt5048 = Static416.anInt7252;
									}
								}
							}
						}
						local96 = Static412.anInt7191;
						local111 = Static349.anIntArray479;
						for (local483 = 0; local483 < local96; local483++) {
							@Pc(570) Class47_Sub2_Sub3_Sub2 local570 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local111[local483]];
							if (local570 != null && local570.anInt5048 != Static416.anInt7252 && local380 != local570 && local570.aBoolean342) {
								local143 = local570.anInt8189 - (local570.method4350() - 1 << 6);
								local152 = local570.anInt8191 - (local570.method4350() - 1 << 6);
								if (local75 <= local143 && local570.method4350() <= local380.method4350() - (local143 - local75 >> 7) && local152 >= local78 && local570.method4350() <= local380.method4350() - (local152 - local78 >> 7)) {
									Static350.method5566(local570, Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 != local355.anInt4360);
									local570.anInt5048 = Static416.anInt7252;
								}
							}
						}
					}
					if (local380.anInt5048 == Static416.anInt7252) {
						continue;
					}
					Static350.method5566(local380, local355.anInt4360 != Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94);
					local380.anInt5048 = Static416.anInt7252;
				}
				@Pc(820) int local820;
				if (local355.aClass47_1 instanceof Class47_Sub2_Sub3_Sub1) {
					@Pc(704) Class47_Sub2_Sub3_Sub1 local704 = (Class47_Sub2_Sub3_Sub1) local355.aClass47_1;
					if (local704.aClass238_1 != null) {
						if ((local704.aClass238_1.anInt6754 & 0x1) == 0 && (local704.anInt8189 & 0x7F) == 0 && (local704.anInt8191 & 0x7F) == 0 || (local704.aClass238_1.anInt6754 & 0x1) == 1 && (local704.anInt8189 & 0x7F) == 64 && (local704.anInt8191 & 0x7F) == 64) {
							local66 = local704.anInt8189 - (local704.aClass238_1.anInt6754 - 1 << 6);
							local75 = local704.anInt8191 - (local704.aClass238_1.anInt6754 - 1 << 6);
							for (local78 = 0; local78 < Static457.anInt7857; local78++) {
								@Pc(788) Class1_Sub10 local788 = (Class1_Sub10) Static258.aClass174_15.method4422((long) Static386.anIntArray503[local78]);
								if (local788 != null) {
									@Pc(793) Class47_Sub2_Sub3_Sub1 local793 = local788.aClass47_Sub2_Sub3_Sub1_2;
									if (local793.anInt5048 != Static416.anInt7252 && local793 != local704 && local793.aBoolean342) {
										local820 = local793.anInt8189 - (local793.aClass238_1.anInt6754 - 1 << 6);
										local483 = local793.anInt8191 - (local793.aClass238_1.anInt6754 - 1 << 6);
										if (local66 <= local820 && local793.aClass238_1.anInt6754 <= local704.aClass238_1.anInt6754 - (local820 - local66 >> 7) && local75 <= local483 && local793.aClass238_1.anInt6754 <= local704.aClass238_1.anInt6754 - (local483 - local75 >> 7)) {
											Static155.method3124(local793, local355.anInt4360 != Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94);
											local793.anInt5048 = Static416.anInt7252;
										}
									}
								}
							}
							local87 = Static412.anInt7191;
							@Pc(897) int[] local897 = Static349.anIntArray479;
							for (local820 = 0; local820 < local87; local820++) {
								@Pc(906) Class47_Sub2_Sub3_Sub2 local906 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local897[local820]];
								if (local906 != null && Static416.anInt7252 != local906.anInt5048 && local906.aBoolean342) {
									local495 = local906.anInt8189 - (local906.method4350() - 1 << 6);
									local143 = local906.anInt8191 - (local906.method4350() - 1 << 6);
									if (local66 <= local495 && local906.method4350() <= local704.aClass238_1.anInt6754 - (local495 - local66 >> 7) && local75 <= local143 && local906.method4350() <= local704.aClass238_1.anInt6754 - (local143 - local75 >> 7)) {
										Static350.method5566(local906, local355.anInt4360 != Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94);
										local906.anInt5048 = Static416.anInt7252;
									}
								}
							}
						}
						if (Static416.anInt7252 == local704.anInt5048) {
							continue;
						}
						Static155.method3124(local704, Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 != local355.anInt4360);
						local704.anInt5048 = Static416.anInt7252;
					}
				}
				if (local355.aClass47_1 instanceof Class47_Sub1_Sub1) {
					local57 = local355.anInt4365 + Static324.anInt6132;
					local66 = local355.anInt4361 + Static517.anInt8716;
					@Pc(1064) Class1_Sub11 local1064 = (Class1_Sub11) Static528.aClass174_40.method4422((long) (local66 << 14 | local355.anInt4360 << 28 | local57));
					if (local1064 != null) {
						for (@Pc(1072) Class1_Sub2 local1072 = (Class1_Sub2) local1064.aClass38_21.method1420(); local1072 != null; local1072 = (Class1_Sub2) local1064.aClass38_21.method1421()) {
							@Pc(1079) Class192 local1079 = Static454.aClass153_2.method4007(local1072.anInt719);
							if (!Static382.aBoolean440) {
								if (Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 == local355.anInt4360) {
									@Pc(1162) String[] local1162 = local1079.aStringArray25;
									for (local820 = 4; local820 >= 0; local820--) {
										if (local1162 != null && local1162[local820] != null) {
											@Pc(1173) byte local1173 = 0;
											local495 = Static272.anInt5298;
											if (local820 == 0) {
												local1173 = 13;
											}
											if (local820 == 1) {
												local1173 = 6;
											}
											if (local820 == 2) {
												local1173 = 21;
											}
											if (local820 == 3) {
												local1173 = 60;
											}
											if (local820 == 4) {
												local1173 = 59;
											}
											if (local820 == local1079.anInt5775) {
												local495 = local1079.anInt5800;
											}
											if (local1079.anInt5809 == local820) {
												local495 = local1079.anInt5767;
											}
											Static179.method3455(local355.anInt4361, local495, (long) local1072.anInt719, true, local1173, local1162[local820], false, -1, local355.anInt4365, "<col=ff9040>" + local1079.aString55);
										}
									}
								}
								Static179.method3455(local355.anInt4361, Static169.anInt3695, (long) local1072.anInt719, true, 1009, Static225.aClass114_92.method3330(Static315.anInt5993), Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 != local355.anInt4360, -1, local355.anInt4365, "<col=ff9040>" + local1079.aString55);
							} else if (local355.anInt4360 == Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94) {
								@Pc(1097) Class134 local1097 = Static113.anInt2794 == -1 ? null : Static162.aClass98_11.method3006(Static113.anInt2794);
								if ((Static276.anInt5433 & 0x1) != 0 && (local1097 == null || local1079.method5020(local1097.anInt4335, Static113.anInt2794) != local1097.anInt4335)) {
									Static179.method3455(local355.anInt4361, Static444.anInt7508, (long) local1072.anInt719, true, 20, Static433.aString72, false, -1, local355.anInt4365, Static469.aString69 + " -> <col=ff9040>" + local1079.aString55);
								}
							}
						}
					}
				}
				if (local355.aClass47_1 instanceof Interface17) {
					@Pc(1315) Interface17 local1315 = (Interface17) local355.aClass47_1;
					@Pc(1322) Class288 local1322 = Static365.aClass194_6.method5084(local1315.method7172());
					if (local1322.anIntArray650 != null) {
						local1322 = local1322.method7065(Static343.aClass286_1);
					}
					if (local1322 != null) {
						if (!Static382.aBoolean440) {
							if (Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 == local355.anInt4360) {
								@Pc(1417) String[] local1417 = local1322.aStringArray45;
								if (local1417 != null) {
									for (local78 = 4; local78 >= 0; local78--) {
										if (local1417[local78] != null) {
											@Pc(1428) short local1428 = 0;
											local96 = Static272.anInt5298;
											if (local78 == 0) {
												local1428 = 49;
											}
											if (local78 == 1) {
												local1428 = 12;
											}
											if (local78 == 2) {
												local1428 = 22;
											}
											if (local78 == 3) {
												local1428 = 9;
											}
											if (local78 == local1322.anInt8314) {
												local96 = local1322.anInt8345;
											}
											if (local78 == 4) {
												local1428 = 1011;
											}
											if (local78 == local1322.anInt8313) {
												local96 = local1322.anInt8319;
											}
											Static179.method3455(local355.anInt4361, local96, Static328.method5370(local1315, local355.anInt4365, local355.anInt4361), true, local1428, local1417[local78], false, -1, local355.anInt4365, "<col=00ffff>" + local1322.aString74);
										}
									}
								}
							}
							Static179.method3455(local355.anInt4361, Static169.anInt3695, (long) local1322.anInt8333, true, 1012, Static225.aClass114_92.method3330(Static315.anInt5993), local355.anInt4360 != Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94, -1, local355.anInt4365, "<col=00ffff>" + local1322.aString74);
						} else if (Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 == local355.anInt4360) {
							@Pc(1355) Class134 local1355 = Static113.anInt2794 == -1 ? null : Static162.aClass98_11.method3006(Static113.anInt2794);
							if ((Static276.anInt5433 & 0x4) != 0 && (local1355 == null || local1322.method7062(Static113.anInt2794, local1355.anInt4335) != local1355.anInt4335)) {
								Static179.method3455(local355.anInt4361, Static444.anInt7508, Static328.method5370(local1315, local355.anInt4365, local355.anInt4361), true, 15, Static433.aString72, false, -1, local355.anInt4365, Static469.aString69 + " -> <col=00ffff>" + local1322.aString74);
							}
						}
					}
				}
			}
		}
	}
}
