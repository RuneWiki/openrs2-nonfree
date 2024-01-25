import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "[[[Lclient!ak;")
	public static Class11[][][] aClass11ArrayArrayArray2;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "Z")
	public static boolean aBoolean356 = false;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
	public static int anInt5346 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIILclient!za;)V")
	public static void method4271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class50 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static426.anInt7179 == 0 || Static28.anInt450 == 0) {
			return;
		}
		arg2.GA(Static73.anInt1515, Static203.anInt4008, Static426.anInt7179, Static28.anInt450);
		arg2.ba(Static20.anInt355, Static107.anInt2163, Static426.anInt7179, Static28.anInt450);
		@Pc(43) Class34 local43 = arg2.method5829();
		local43.YA(Static397.anInt6732, Static232.anInt4730, Static217.anInt4137, Static382.anInt7086, Static80.anInt1680, Static337.anInt5680);
		arg2.SA(local43);
		@Pc(63) int local63;
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(102) int local102;
		@Pc(117) int[] local117;
		@Pc(149) int local149;
		@Pc(158) int local158;
		if (Static256.aClass154Array2 != null) {
			@Pc(58) int local58 = -1;
			@Pc(60) int local60 = -1;
			local63 = arg2.AA();
			local72 = local63 * (arg1 - Static73.anInt1515) / Static426.anInt7179;
			local81 = (arg0 - Static203.anInt4008) * local63 / Static28.anInt450;
			local84 = arg2.r();
			local93 = local84 * (arg1 - Static73.anInt1515) / Static426.anInt7179;
			local102 = (arg0 - Static203.anInt4008) * local84 / Static28.anInt450;
			local117 = new int[] { local72, local81, local63 };
			local43.wa(local117);
			@Pc(135) int[] local135 = new int[] { local93, local102, local84 };
			local43.wa(local135);
			@Pc(140) float local140 = 0.0F;
			local149 = local135[0] - local117[0];
			local158 = local135[1] - local117[1];
			@Pc(166) int local166 = local135[2] - local117[2];
			while (local140 < 1.0F) {
				@Pc(179) int local179 = (int) ((float) local149 * local140 + (float) local117[0]);
				@Pc(183) int local183 = local179 >> 7;
				@Pc(194) int local194 = (int) ((float) local166 * local140 + (float) local117[2]);
				@Pc(198) int local198 = local194 >> 7;
				if (local183 > 0 && local198 > 0 && Static2.anInt7 > local183 && Static17.anInt315 > local198) {
					@Pc(211) int local211 = Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98;
					if (local211 < 3 && (Static181.aByteArrayArrayArray15[1][local183][local198] & 0x2) != 0) {
						local211++;
					}
					if ((float) Static256.aClass154Array2[local211].ca(local179, local194) < (float) local117[1] + local140 * (float) local158) {
						local58 = (Static263.aClass24_Sub3_Sub2_Sub2_4.method4919() - 1 << 6) + local179 >> 7;
						local60 = (Static263.aClass24_Sub3_Sub2_Sub2_4.method4919() - 1 << 6) + local194 >> 7;
						break;
					}
				}
				local140 = (float) ((double) local140 + 0.01D);
			}
			if (local58 != -1 && local60 != -1) {
				if (Static401.aBoolean489 && (Static46.anInt880 & 0x40) != 0) {
					@Pc(333) Class89 local333 = Static397.method5275(Static219.anInt4156, Static273.anInt4773);
					if (local333 == null) {
						Static456.method6051();
					} else {
						Static260.method3744(Static312.aString52, 49, 0L, local58, false, Static24.anInt394, " ->", true, -1, local60);
					}
				} else {
					if (Static424.aClass147_4 == Static102.aClass147_3) {
						Static260.method3744(Static121.aClass182_94.method4155(Static191.anInt3842), 48, 0L, local58, false, -1, "", true, -1, local60);
					}
					Static260.method3744(Static175.aString13, 5, 0L, local58, false, Static286.anInt5020, "", true, -1, local60);
				}
			}
		}
		@Pc(353) Class240 local353 = Static191.aClass240_2;
		for (@Pc(358) Class40_Sub5 local358 = (Class40_Sub5) local353.method5227(); local358 != null; local358 = (Class40_Sub5) local353.method5230()) {
			if ((Static74.aBoolean106 || local358.anInt4726 == Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98) && local358.method3812(arg0, arg2, arg1)) {
				@Pc(487) int local487;
				@Pc(498) int local498;
				if (local358.aClass24_1 instanceof Class24_Sub3_Sub2_Sub2) {
					@Pc(382) Class24_Sub3_Sub2_Sub2 local382 = (Class24_Sub3_Sub2_Sub2) local358.aClass24_1;
					local72 = local382.method4919();
					if ((local72 & 0x1) == 0 && (local382.anInt7092 & 0x7F) == 0 && (local382.anInt7094 & 0x7F) == 0 || (local72 & 0x1) == 1 && (local382.anInt7092 & 0x7F) == 64 && (local382.anInt7094 & 0x7F) == 64) {
						local81 = local382.anInt7092 - (local382.method4919() - 1 << 6);
						local84 = local382.anInt7094 - (local382.method4919() - 1 << 6);
						for (local93 = 0; local93 < Static219.anInt4155; local93++) {
							@Pc(462) Class10_Sub26 local462 = (Class10_Sub26) Static424.aClass167_33.method3709((long) Static57.anIntArray91[local93]);
							if (local462 != null) {
								@Pc(467) Class24_Sub3_Sub2_Sub1 local467 = local462.aClass24_Sub3_Sub2_Sub1_2;
								if (Static400.anInt6752 != local467.anInt6249 && local467.aBoolean404) {
									local487 = local467.anInt7092 - (local467.aClass222_1.anInt6351 - 1 << 6);
									local498 = local467.anInt7094 - (local467.aClass222_1.anInt6351 - 1 << 6);
									if (local81 <= local487 && local467.aClass222_1.anInt6351 <= local382.method4919() - (local487 - local81 >> 7) && local498 >= local84 && local467.aClass222_1.anInt6351 <= local382.method4919() - (local498 - local84 >> 7)) {
										Static311.method4314(local358.anInt4726 != Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98, local467);
										local467.anInt6249 = Static400.anInt6752;
									}
								}
							}
						}
						local102 = Static270.anInt4754;
						local117 = Static53.anIntArray79;
						for (local487 = 0; local487 < local102; local487++) {
							@Pc(582) Class24_Sub3_Sub2_Sub2 local582 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local117[local487]];
							if (local582 != null && Static400.anInt6752 != local582.anInt6249 && local582 != local382 && local582.aBoolean404) {
								local149 = local582.anInt7092 - (local582.method4919() - 1 << 6);
								local158 = local582.anInt7094 - (local582.method4919() - 1 << 6);
								if (local81 <= local149 && local582.method4919() <= local382.method4919() - (local149 - local81 >> 7) && local158 >= local84 && local582.method4919() <= local382.method4919() - (local158 - local84 >> 7)) {
									Static281.method5147(local358.anInt4726 != Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98, local582);
									local582.anInt6249 = Static400.anInt6752;
								}
							}
						}
					}
					if (Static400.anInt6752 == local382.anInt6249) {
						continue;
					}
					Static281.method5147(Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 != local358.anInt4726, local382);
					local382.anInt6249 = Static400.anInt6752;
				}
				@Pc(832) int local832;
				if (local358.aClass24_1 instanceof Class24_Sub3_Sub2_Sub1) {
					@Pc(721) Class24_Sub3_Sub2_Sub1 local721 = (Class24_Sub3_Sub2_Sub1) local358.aClass24_1;
					if (local721.aClass222_1 != null) {
						if ((local721.aClass222_1.anInt6351 & 0x1) == 0 && (local721.anInt7092 & 0x7F) == 0 && (local721.anInt7094 & 0x7F) == 0 || (local721.aClass222_1.anInt6351 & 0x1) == 1 && (local721.anInt7092 & 0x7F) == 64 && (local721.anInt7094 & 0x7F) == 64) {
							local72 = local721.anInt7092 - (local721.aClass222_1.anInt6351 - 1 << 6);
							local81 = local721.anInt7094 - (local721.aClass222_1.anInt6351 - 1 << 6);
							for (local84 = 0; local84 < Static219.anInt4155; local84++) {
								@Pc(803) Class10_Sub26 local803 = (Class10_Sub26) Static424.aClass167_33.method3709((long) Static57.anIntArray91[local84]);
								if (local803 != null) {
									@Pc(808) Class24_Sub3_Sub2_Sub1 local808 = local803.aClass24_Sub3_Sub2_Sub1_2;
									if (Static400.anInt6752 != local808.anInt6249 && local721 != local808 && local808.aBoolean404) {
										local832 = local808.anInt7092 - (local808.aClass222_1.anInt6351 - 1 << 6);
										local487 = local808.anInt7094 - (local808.aClass222_1.anInt6351 - 1 << 6);
										if (local72 <= local832 && local808.aClass222_1.anInt6351 <= local721.aClass222_1.anInt6351 - (local832 - local72 >> 7) && local487 >= local81 && local808.aClass222_1.anInt6351 <= local721.aClass222_1.anInt6351 - (local487 - local81 >> 7)) {
											Static311.method4314(Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 != local358.anInt4726, local808);
											local808.anInt6249 = Static400.anInt6752;
										}
									}
								}
							}
							local93 = Static270.anInt4754;
							@Pc(912) int[] local912 = Static53.anIntArray79;
							for (local832 = 0; local832 < local93; local832++) {
								@Pc(922) Class24_Sub3_Sub2_Sub2 local922 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local912[local832]];
								if (local922 != null && Static400.anInt6752 != local922.anInt6249 && local922.aBoolean404) {
									local498 = local922.anInt7092 - (local922.method4919() - 1 << 6);
									local149 = local922.anInt7094 - (local922.method4919() - 1 << 6);
									if (local498 >= local72 && local922.method4919() <= local721.aClass222_1.anInt6351 - (local498 - local72 >> 7) && local81 <= local149 && local922.method4919() <= local721.aClass222_1.anInt6351 - (local149 - local81 >> 7)) {
										Static281.method5147(local358.anInt4726 != Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98, local922);
										local922.anInt6249 = Static400.anInt6752;
									}
								}
							}
						}
						if (local721.anInt6249 == Static400.anInt6752) {
							continue;
						}
						Static311.method4314(local358.anInt4726 != Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98, local721);
						local721.anInt6249 = Static400.anInt6752;
					}
				}
				if (local358.aClass24_1 instanceof Class24_Sub2_Sub1) {
					local63 = local358.anInt4724 + Static168.anInt3353;
					local72 = local358.anInt4725 + Static72.anInt1488;
					@Pc(1082) Class10_Sub14 local1082 = (Class10_Sub14) Static293.aClass167_21.method3709((long) (local63 | local72 << 14 | local358.anInt4726 << 28));
					if (local1082 != null) {
						for (@Pc(1090) Class10_Sub31 local1090 = (Class10_Sub31) local1082.aClass163_17.method3612(); local1090 != null; local1090 = (Class10_Sub31) local1082.aClass163_17.method3624()) {
							@Pc(1098) Class60 local1098 = Static313.aClass272_2.method6068(local1090.anInt4768);
							if (!Static401.aBoolean489) {
								if (Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 == local358.anInt4726) {
									@Pc(1112) String[] local1112 = local1098.aStringArray14;
									for (local832 = 4; local832 >= 0; local832--) {
										if (local1112 != null && local1112[local832] != null) {
											@Pc(1124) byte local1124 = 0;
											if (local832 == 0) {
												local1124 = 57;
											}
											local498 = Static244.anInt4706;
											if (local832 == 1) {
												local1124 = 10;
											}
											if (local832 == 2) {
												local1124 = 16;
											}
											if (local832 == 3) {
												local1124 = 59;
											}
											if (local832 == local1098.anInt1688) {
												local498 = local1098.anInt1746;
											}
											if (local832 == 4) {
												local1124 = 15;
											}
											if (local1098.anInt1736 == local832) {
												local498 = local1098.anInt1684;
											}
											Static260.method3744(local1112[local832], local1124, (long) local1090.anInt4768, local358.anInt4724, false, local498, "<col=ff9040>" + local1098.aString11, true, -1, local358.anInt4725);
										}
									}
								}
								Static260.method3744(Static67.aClass182_55.method4155(Static191.anInt3842), 1008, (long) local1090.anInt4768, local358.anInt4724, Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 != local358.anInt4726, Static405.anInt6817, "<col=ff9040>" + local1098.aString11, true, -1, local358.anInt4725);
							} else if (local358.anInt4726 == Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98) {
								@Pc(1268) Class155 local1268 = Static218.anInt4149 == -1 ? null : Static376.aClass204_1.method4526(Static218.anInt4149);
								if ((Static46.anInt880 & 0x1) != 0 && (local1268 == null || local1098.method1538(local1268.anInt4302, Static218.anInt4149) != local1268.anInt4302)) {
									Static260.method3744(Static312.aString52, 47, (long) local1090.anInt4768, local358.anInt4724, false, Static24.anInt394, Static70.aString10 + " -> <col=ff9040>" + local1098.aString11, true, -1, local358.anInt4725);
								}
							}
						}
					}
				}
				if (local358.aClass24_1 instanceof Interface10) {
					@Pc(1333) Interface10 local1333 = (Interface10) local358.aClass24_1;
					@Pc(1340) Class126 local1340 = Static342.aClass237_4.method5212(local1333.method5706());
					if (local1340.anIntArray380 != null) {
						local1340 = local1340.method3009(Static329.aClass201_9);
					}
					if (local1340 != null) {
						if (!Static401.aBoolean489) {
							if (local358.anInt4726 == Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98) {
								@Pc(1364) String[] local1364 = local1340.aStringArray27;
								if (local1364 != null) {
									for (local84 = 4; local84 >= 0; local84--) {
										if (local1364[local84] != null) {
											@Pc(1376) short local1376 = 0;
											local102 = Static244.anInt4706;
											if (local84 == 0) {
												local1376 = 60;
											}
											if (local84 == 1) {
												local1376 = 13;
											}
											if (local84 == 2) {
												local1376 = 17;
											}
											if (local84 == 3) {
												local1376 = 4;
											}
											if (local84 == 4) {
												local1376 = 1004;
											}
											if (local1340.anInt3781 == local84) {
												local102 = local1340.anInt3765;
											}
											if (local84 == local1340.anInt3790) {
												local102 = local1340.anInt3808;
											}
											Static260.method3744(local1364[local84], local1376, Static160.method2693(local358.anInt4724, local358.anInt4725, local1333), local358.anInt4724, false, local102, "<col=00ffff>" + local1340.aString29, true, -1, local358.anInt4725);
										}
									}
								}
							}
							Static260.method3744(Static67.aClass182_55.method4155(Static191.anInt3842), 1003, (long) local1340.anInt3798, local358.anInt4724, Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 != local358.anInt4726, Static405.anInt6817, "<col=00ffff>" + local1340.aString29, true, -1, local358.anInt4725);
						} else if (Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 == local358.anInt4726) {
							@Pc(1514) Class155 local1514 = Static218.anInt4149 == -1 ? null : Static376.aClass204_1.method4526(Static218.anInt4149);
							if ((Static46.anInt880 & 0x4) != 0 && (local1514 == null || local1340.method3012(local1514.anInt4302, Static218.anInt4149) != local1514.anInt4302)) {
								Static260.method3744(Static312.aString52, 58, Static160.method2693(local358.anInt4724, local358.anInt4725, local1333), local358.anInt4724, false, Static24.anInt394, Static70.aString10 + " -> <col=00ffff>" + local1340.aString29, true, -1, local358.anInt4725);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method4273(@OriginalArg(1) Class10_Sub8_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method2532();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static270.anInt4754; local12++) {
			local18 = Static53.anIntArray79[local12];
			if ((Static456.aByteArray95[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static456.aByteArray95[local18] = (byte) (Static456.aByteArray95[local18] | 0x2);
				} else {
					local46 = arg0.method2525(1);
					if (local46 == 0) {
						local7 = Static413.method5437(arg0);
						Static456.aByteArray95[local18] = (byte) (Static456.aByteArray95[local18] | 0x2);
					} else {
						Static377.method160(arg0, local18);
					}
				}
			}
		}
		arg0.method2528();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method2532();
		@Pc(133) int local133;
		for (local18 = 0; local18 < Static270.anInt4754; local18++) {
			local46 = Static53.anIntArray79[local18];
			if ((Static456.aByteArray95[local46] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static456.aByteArray95[local46] = (byte) (Static456.aByteArray95[local46] | 0x2);
				} else {
					local133 = arg0.method2525(1);
					if (local133 == 0) {
						local7 = Static413.method5437(arg0);
						Static456.aByteArray95[local46] = (byte) (Static456.aByteArray95[local46] | 0x2);
					} else {
						Static377.method160(arg0, local46);
					}
				}
			}
		}
		arg0.method2528();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method2532();
		@Pc(221) int local221;
		for (local46 = 0; local46 < Static348.anInt5937; local46++) {
			local133 = Static147.anIntArray294[local46];
			if ((Static456.aByteArray95[local133] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static456.aByteArray95[local133] = (byte) (Static456.aByteArray95[local133] | 0x2);
				} else {
					local221 = arg0.method2525(1);
					if (local221 == 0) {
						local7 = Static413.method5437(arg0);
						Static456.aByteArray95[local133] = (byte) (Static456.aByteArray95[local133] | 0x2);
					} else if (Static218.method3308(arg0, local133)) {
						Static456.aByteArray95[local133] = (byte) (Static456.aByteArray95[local133] | 0x2);
					}
				}
			}
		}
		arg0.method2528();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method2532();
		for (local133 = 0; local133 < Static348.anInt5937; local133++) {
			local221 = Static147.anIntArray294[local133];
			if ((Static456.aByteArray95[local221] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static456.aByteArray95[local221] = (byte) (Static456.aByteArray95[local221] | 0x2);
				} else {
					@Pc(310) int local310 = arg0.method2525(1);
					if (local310 == 0) {
						local7 = Static413.method5437(arg0);
						Static456.aByteArray95[local221] = (byte) (Static456.aByteArray95[local221] | 0x2);
					} else if (Static218.method3308(arg0, local221)) {
						Static456.aByteArray95[local221] = (byte) (Static456.aByteArray95[local221] | 0x2);
					}
				}
			}
		}
		arg0.method2528();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static270.anInt4754 = 0;
		Static348.anInt5937 = 0;
		for (local221 = 1; local221 < 2048; local221++) {
			Static456.aByteArray95[local221] = (byte) (Static456.aByteArray95[local221] >> 1);
			@Pc(384) Class24_Sub3_Sub2_Sub2 local384 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local221];
			if (local384 == null) {
				Static147.anIntArray294[Static348.anInt5937++] = local221;
			} else {
				Static53.anIntArray79[Static270.anInt4754++] = local221;
			}
		}
	}
}
