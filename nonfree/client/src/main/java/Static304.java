import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
	public static int anInt5409;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
	public static int anInt5410;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "[I")
	public static final int[] anIntArray300 = new int[1];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ha;IBI)V")
	public static void method4920(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static530.anInt9102 == 0 || Static135.anInt2134 == 0) {
			return;
		}
		@Pc(42) Class263 local42;
		@Pc(57) int local57;
		@Pc(53) int local53;
		@Pc(61) int local61;
		@Pc(49) int local49;
		@Pc(67) int local67;
		@Pc(73) int local73;
		if (Static656.aBoolean741) {
			Static222.method3816(false);
			local42 = arg0.method6943();
			@Pc(45) int[] local45 = arg0.Y();
			local49 = local45[3];
			local53 = local45[1];
			local57 = local45[0];
			local61 = local45[2];
			local67 = arg2 + Static510.method7638(false);
			local73 = Static552.method7983(false) + arg1;
		} else {
			arg0.DA(Static271.anInt5025, Static525.anInt9013, Static530.anInt9102, Static135.anInt2134);
			local61 = Static530.anInt9102;
			local49 = Static135.anInt2134;
			local57 = Static271.anInt5025;
			local53 = Static525.anInt9013;
			arg0.KA(Static566.anInt9417, Static16.anInt234, Static530.anInt9102, Static135.anInt2134);
			local42 = arg0.method6914();
			local42.method8446(Static613.anInt10112, Static609.anInt10031, Static32.anInt11014, Static18.anInt244, Static189.anInt3209, Static685.anInt4668);
			local73 = arg1;
			local67 = arg2;
			arg0.method6896(local42);
		}
		if (local49 == 0) {
			local49 = 1;
		}
		if (local61 == 0) {
			local61 = 1;
		}
		Static512.method9100(true);
		@Pc(152) int local152;
		@Pc(165) int local165;
		@Pc(175) int local175;
		@Pc(290) int local290;
		@Pc(299) int local299;
		@Pc(310) int local310;
		@Pc(321) int local321;
		@Pc(144) int local144;
		@Pc(368) int local368;
		if (Static445.aClass159Array3 != null && (!Static546.aBoolean727 || (Static655.anInt10731 & 0x40) != 0)) {
			local144 = -1;
			@Pc(146) int local146 = -1;
			@Pc(149) int local149 = arg0.i();
			local152 = arg0.XA();
			@Pc(176) int local176;
			@Pc(164) int local164;
			if (Static6.aBoolean9) {
				local165 = local164 = Static481.anInt10749 * (local67 - local57) / local61;
				local176 = local175 = (local73 - local53) * Static481.anInt10749 / local49;
			} else {
				local164 = local152 * (local67 - local57) / local61;
				local175 = local152 * (local73 - local53) / local49;
				local176 = local149 * (local73 - local53) / local49;
				local165 = local149 * (local67 - local57) / local61;
			}
			@Pc(228) int[] local228 = new int[] { local165, local176, local149 };
			local42.method8443(local228);
			@Pc(246) int[] local246 = new int[] { local164, local175, local152 };
			local42.method8443(local246);
			@Pc(277) float local277 = Static201.method3014(4, (float) local246[2], (float) local228[0], (float) local228[2], (float) local246[0], (float) local228[1], (float) local246[1]);
			if (local277 > 0.0F) {
				local290 = local246[0] - local228[0];
				local299 = local246[2] - local228[2];
				local310 = (int) ((float) local228[0] + (float) local290 * local277);
				local321 = (int) ((float) local228[2] + (float) local299 * local277);
				local144 = (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2870(0) - 1 << 8) + local310 >> 9;
				local146 = local321 + (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2870(0) - 1 << 8) >> 9;
				@Pc(348) byte local348 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146;
				if (local348 < 3 && (Static446.aByteArrayArrayArray12[1][local310 >> 9][local321 >> 9] & 0x2) != 0) {
					local368 = local348 + 1;
				}
			}
			if (local144 != -1 && local146 != -1) {
				if (Static546.aBoolean727 && (Static655.anInt10731 & 0x40) != 0) {
					@Pc(395) Class299 local395 = Static384.method5875(Static613.anInt10111, Static254.anInt4789);
					if (local395 == null) {
						Static214.method3269();
					} else {
						Static258.method4326(" ->", Static529.aString102, false, Static217.anInt4240, 0L, local144, true, true, 23, -1, local146, (long) (local146 | local144 << 0));
					}
				} else {
					if (Static19.aBoolean22) {
						Static258.method4326("", Static21.aClass21_26.method324(Static26.anInt352), false, -1, 0L, local144, true, true, 44, -1, local146, (long) (local144 << 0 | local146));
					}
					Static258.method4326("", Static163.aString33, false, Static41.anInt656, 0L, local144, true, true, 16, -1, local146, (long) (local144 << 0 | local146));
				}
			}
		}
		if (Static656.aBoolean741) {
			Static561.method8082();
		}
		for (local144 = 0; (Static656.aBoolean741 ? 2 : 1) > local144; local144++) {
			@Pc(501) boolean local501 = local144 == 0;
			@Pc(508) Class307 local508 = local501 ? Static603.aClass307_3 : Static89.aClass307_5;
			local152 = arg2;
			local165 = arg1;
			if (Static656.aBoolean741) {
				Static222.method3816(local501);
				local152 = arg2 + Static510.method7638(local501);
				local165 = arg1 + Static552.method7983(local501);
			}
			@Pc(532) Class283 local532 = local508.aClass283_13;
			for (@Pc(537) Class4_Sub9 local537 = (Class4_Sub9) local532.method6791(); local537 != null; local537 = (Class4_Sub9) local532.method6792()) {
				if ((Static465.aBoolean546 || local537.aClass4_Sub3_24.aByte146 == Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146) && local537.method9217(local152, arg0, local165)) {
					@Pc(578) int local578;
					if (local537.aClass4_Sub3_24 instanceof Class4_Sub3_Sub3) {
						local175 = ((Class4_Sub3_Sub3) local537.aClass4_Sub3_24).aShort108;
						local578 = ((Class4_Sub3_Sub3) local537.aClass4_Sub3_24).aShort109;
					} else {
						local578 = local537.aClass4_Sub3_24.anInt11178 >> 9;
						local175 = local537.aClass4_Sub3_24.anInt11184 >> 9;
					}
					@Pc(721) int local721;
					@Pc(733) int local733;
					@Pc(852) int local852;
					@Pc(604) int local604;
					if (local537.aClass4_Sub3_24 instanceof Class4_Sub3_Sub3_Sub3_Sub2) {
						@Pc(600) Class4_Sub3_Sub3_Sub3_Sub2 local600 = (Class4_Sub3_Sub3_Sub3_Sub2) local537.aClass4_Sub3_24;
						local604 = local600.method2870(0);
						if ((local604 & 0x1) == 0 && (local600.anInt11184 & 0x1FF) == 0 && (local600.anInt11178 & 0x1FF) == 0 || (local604 & 0x1) == 1 && (local600.anInt11184 & 0x1FF) == 256 && (local600.anInt11178 & 0x1FF) == 256) {
							local290 = local600.anInt11184 - (local600.method2870(0) - 1 << 8);
							local299 = local600.anInt11178 - (local600.method2870(0) - 1 << 8);
							for (local310 = 0; local310 < Static662.anInt10795; local310++) {
								@Pc(691) Class14_Sub44 local691 = (Class14_Sub44) Static100.aClass125_9.method2630((long) Static253.anIntArray241[local310]);
								if (local691 != null) {
									@Pc(696) Class4_Sub3_Sub3_Sub3_Sub1 local696 = local691.aClass4_Sub3_Sub3_Sub3_Sub1_2;
									if (Static530.anInt9105 != local696.anInt3282 && local696.aBoolean238) {
										local721 = local696.anInt11184 - (local696.aClass362_1.anInt10069 - 1 << 8);
										local733 = local696.anInt11178 - (local696.aClass362_1.anInt10069 - 1 << 8);
										if (local290 <= local721 && local696.aClass362_1.anInt10069 <= local600.method2870(0) - (local721 - local290 >> 9) && local733 >= local299 && local696.aClass362_1.anInt10069 <= local600.method2870(0) - (local733 - local299 >> 9)) {
											Static582.method8309(local696, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 != local537.aClass4_Sub3_24.aByte146);
											local696.anInt3282 = Static530.anInt9105;
										}
									}
								}
							}
							local321 = Static258.anInt4846;
							@Pc(808) int[] local808 = Static43.anIntArray35;
							for (local721 = 0; local721 < local321; local721++) {
								@Pc(818) Class4_Sub3_Sub3_Sub3_Sub2 local818 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local808[local721]];
								if (local818 != null && Static530.anInt9105 != local818.anInt3282 && local818 != local600 && local818.aBoolean238) {
									local852 = local818.anInt11184 - (local818.method2870(0) - 1 << 8);
									@Pc(863) int local863 = local818.anInt11178 - (local818.method2870(0) - 1 << 8);
									if (local290 <= local852 && local818.method2870(0) <= local600.method2870(0) - (local852 - local290 >> 9) && local863 >= local299 && local818.method2870(0) <= local600.method2870(0) - (local863 - local299 >> 9)) {
										Static3.method79(local537.aClass4_Sub3_24.aByte146 != Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146, local818);
										local818.anInt3282 = Static530.anInt9105;
									}
								}
							}
						}
						if (local600.anInt3282 == Static530.anInt9105) {
							continue;
						}
						Static3.method79(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 != local537.aClass4_Sub3_24.aByte146, local600);
						local600.anInt3282 = Static530.anInt9105;
					}
					if (local537.aClass4_Sub3_24 instanceof Class4_Sub3_Sub3_Sub3_Sub1) {
						@Pc(978) Class4_Sub3_Sub3_Sub3_Sub1 local978 = (Class4_Sub3_Sub3_Sub3_Sub1) local537.aClass4_Sub3_24;
						if (local978.aClass362_1 != null) {
							if ((local978.aClass362_1.anInt10069 & 0x1) == 0 && (local978.anInt11184 & 0x1FF) == 0 && (local978.anInt11178 & 0x1FF) == 0 || (local978.aClass362_1.anInt10069 & 0x1) == 1 && (local978.anInt11184 & 0x1FF) == 256 && (local978.anInt11178 & 0x1FF) == 256) {
								local604 = local978.anInt11184 - (local978.aClass362_1.anInt10069 - 1 << 8);
								local290 = local978.anInt11178 - (local978.aClass362_1.anInt10069 - 1 << 8);
								for (local299 = 0; local299 < Static662.anInt10795; local299++) {
									@Pc(1077) Class14_Sub44 local1077 = (Class14_Sub44) Static100.aClass125_9.method2630((long) Static253.anIntArray241[local299]);
									if (local1077 != null) {
										@Pc(1082) Class4_Sub3_Sub3_Sub3_Sub1 local1082 = local1077.aClass4_Sub3_Sub3_Sub3_Sub1_2;
										if (local1082.anInt3282 != Static530.anInt9105 && local978 != local1082 && local1082.aBoolean238) {
											local368 = local1082.anInt11184 - (local1082.aClass362_1.anInt10069 - 1 << 8);
											local721 = local1082.anInt11178 - (local1082.aClass362_1.anInt10069 - 1 << 8);
											if (local368 >= local604 && local1082.aClass362_1.anInt10069 <= local978.aClass362_1.anInt10069 - (local368 - local604 >> 9) && local721 >= local290 && local978.aClass362_1.anInt10069 - (local721 - local290 >> 9) >= local1082.aClass362_1.anInt10069) {
												Static582.method8309(local1082, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 != local537.aClass4_Sub3_24.aByte146);
												local1082.anInt3282 = Static530.anInt9105;
											}
										}
									}
								}
								local310 = Static258.anInt4846;
								@Pc(1201) int[] local1201 = Static43.anIntArray35;
								for (local368 = 0; local368 < local310; local368++) {
									@Pc(1211) Class4_Sub3_Sub3_Sub3_Sub2 local1211 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local1201[local368]];
									if (local1211 != null && Static530.anInt9105 != local1211.anInt3282 && local1211.aBoolean238) {
										local733 = local1211.anInt11184 - (local1211.method2870(0) - 1 << 8);
										local852 = local1211.anInt11178 - (local1211.method2870(0) - 1 << 8);
										if (local604 <= local733 && local1211.method2870(0) <= local978.aClass362_1.anInt10069 - (local733 - local604 >> 9) && local852 >= local290 && local1211.method2870(0) <= local978.aClass362_1.anInt10069 - (local852 - local290 >> 9)) {
											Static3.method79(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 != local537.aClass4_Sub3_24.aByte146, local1211);
											local1211.anInt3282 = Static530.anInt9105;
										}
									}
								}
							}
							if (local978.anInt3282 == Static530.anInt9105) {
								continue;
							}
							Static582.method8309(local978, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 != local537.aClass4_Sub3_24.aByte146);
							local978.anInt3282 = Static530.anInt9105;
						}
					}
					if (local537.aClass4_Sub3_24 instanceof Class4_Sub3_Sub4_Sub1) {
						@Pc(1372) int local1372 = Static36.anInt617 + local175;
						local604 = local578 + Static550.anInt9242;
						@Pc(1394) Class14_Sub25 local1394 = (Class14_Sub25) Static282.aClass125_17.method2630((long) (local604 << 14 | local537.aClass4_Sub3_24.aByte146 << 28 | local1372));
						if (local1394 != null) {
							local299 = 0;
							for (@Pc(1404) Class14_Sub43 local1404 = (Class14_Sub43) local1394.aClass32_27.method578(); local1404 != null; local1404 = (Class14_Sub43) local1394.aClass32_27.method580()) {
								@Pc(1412) Class284 local1412 = Static252.aClass56_1.method1052(local1404.anInt9586);
								if (Static546.aBoolean727 && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 == local537.aClass4_Sub3_24.aByte146) {
									@Pc(1439) Class108 local1439 = Static365.anInt6221 == -1 ? null : Static653.aClass104_2.method2173(Static365.anInt6221);
									if ((Static655.anInt10731 & 0x1) != 0 && (local1439 == null || local1412.method6828(local1439.anInt2348, Static365.anInt6221) != local1439.anInt2348)) {
										Static258.method4326(Static621.aString117 + " -> <col=ff9040>" + local1412.aString89, Static529.aString102, false, Static217.anInt4240, (long) local1404.anInt9586, local175, false, true, 4, -1, local578, (long) local299);
									}
								}
								if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146 == local537.aClass4_Sub3_24.aByte146) {
									@Pc(1510) String[] local1510 = local1412.aStringArray33;
									for (local721 = local1510.length - 1; local721 >= 0; local721--) {
										if (local1510[local721] != null) {
											@Pc(1525) short local1525 = 0;
											if (local721 == 0) {
												local1525 = 48;
											}
											local852 = Static179.anInt2917;
											if (local721 == 1) {
												local1525 = 11;
											}
											if (local721 == 2) {
												local1525 = 17;
											}
											if (local721 == 3) {
												local1525 = 2;
											}
											if (local721 == 4) {
												local1525 = 5;
											}
											if (local721 == local1412.anInt7775) {
												local852 = local1412.anInt7767;
											}
											if (local721 == 5) {
												local1525 = 1010;
											}
											if (local1412.anInt7746 == local721) {
												local852 = local1412.anInt7741;
											}
											Static258.method4326("<col=ff9040>" + local1412.aString89, local1510[local721], false, local852, (long) local1404.anInt9586, local175, false, true, local1525, -1, local578, (long) local299);
										}
									}
								}
								local299++;
							}
						}
					}
					if (local537.aClass4_Sub3_24 instanceof Interface16) {
						@Pc(1642) Interface16 local1642 = (Interface16) local537.aClass4_Sub3_24;
						@Pc(1649) Class128 local1649 = Static212.aClass249_4.method6119(local1642.method9501());
						if (local1649.anIntArray179 != null) {
							local1649 = local1649.method2685(Static188.aClass238_1);
						}
						if (local1649 != null) {
							if (Static546.aBoolean727 && local537.aClass4_Sub3_24.aByte146 == Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146) {
								@Pc(1688) Class108 local1688 = Static365.anInt6221 == -1 ? null : Static653.aClass104_2.method2173(Static365.anInt6221);
								if ((Static655.anInt10731 & 0x4) != 0 && (local1688 == null || local1649.method2677(local1688.anInt2348, Static365.anInt6221) != local1688.anInt2348)) {
									Static258.method4326(Static621.aString117 + " -> <col=00ffff>" + local1649.aString35, Static529.aString102, false, Static217.anInt4240, Static494.method7448(local578, local175, local1642), local175, false, true, 12, -1, local578, (long) local1642.hashCode());
								}
							}
							if (local537.aClass4_Sub3_24.aByte146 == Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146) {
								@Pc(1757) String[] local1757 = local1649.aStringArray18;
								if (local1757 != null) {
									for (local299 = local1757.length - 1; local299 >= 0; local299--) {
										if (local1757[local299] != null) {
											@Pc(1774) short local1774 = 0;
											if (local299 == 0) {
												local1774 = 46;
											}
											local321 = Static179.anInt2917;
											if (local299 == 1) {
												local1774 = 20;
											}
											if (local299 == 2) {
												local1774 = 10;
											}
											if (local299 == 3) {
												local1774 = 9;
											}
											if (local299 == 4) {
												local1774 = 1008;
											}
											if (local1649.anInt2972 == local299) {
												local321 = local1649.anInt2989;
											}
											if (local299 == 5) {
												local1774 = 1012;
											}
											if (local299 == local1649.anInt2946) {
												local321 = local1649.anInt2956;
											}
											Static258.method4326("<col=00ffff>" + local1649.aString35, local1757[local299], false, local321, Static494.method7448(local578, local175, local1642), local175, false, true, local1774, -1, local578, (long) local1642.hashCode());
										}
									}
								}
							}
						}
					}
				}
			}
			if (Static656.aBoolean741) {
				Static561.method8082();
			}
		}
		Static512.method9100(false);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg7 && arg2 == arg3 && arg4 == arg6 && arg5 == arg0) {
			Static133.method2024(arg7, arg8, arg4, arg3, arg0);
			return;
		}
		@Pc(40) int local40 = arg7;
		@Pc(42) int local42 = arg3;
		@Pc(46) int local46 = arg7 * 3;
		@Pc(50) int local50 = arg3 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg2 * 3;
		@Pc(62) int local62 = arg6 * 3;
		@Pc(66) int local66 = arg5 * 3;
		@Pc(77) int local77 = arg4 + local54 - arg7 - local62;
		@Pc(87) int local87 = arg0 + local58 - local66 - arg3;
		@Pc(97) int local97 = local46 + local62 - local54 - local54;
		@Pc(107) int local107 = local66 + local50 - local58 - local58;
		@Pc(112) int local112 = local54 - local46;
		@Pc(117) int local117 = local58 - local50;
		for (@Pc(119) int local119 = 128; local119 <= 4096; local119 += 128) {
			@Pc(127) int local127 = local119 * local119 >> 12;
			@Pc(133) int local133 = local127 * local119 >> 12;
			@Pc(137) int local137 = local133 * local77;
			@Pc(141) int local141 = local87 * local133;
			@Pc(145) int local145 = local97 * local127;
			@Pc(149) int local149 = local127 * local107;
			@Pc(153) int local153 = local119 * local112;
			@Pc(157) int local157 = local119 * local117;
			@Pc(169) int local169 = arg7 + (local137 + local145 + local153 >> 12);
			@Pc(180) int local180 = (local157 + local141 + local149 >> 12) + arg3;
			Static133.method2024(local40, arg8, local169, local42, local180);
			local40 = local169;
			local42 = local180;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method4923(@OriginalArg(1) String arg0) {
		if (!Static639.aClass173_6.aBoolean358) {
			return -1;
		} else if (Static356.aHashtable4.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(22) String local22 = Static269.method8957(arg0);
			if (local22 == null) {
				return -1;
			}
			@Pc(36) String local36 = Static547.aString50 + local22;
			if (!Static690.aClass310_139.method7786(local36, "")) {
				return -1;
			} else if (Static690.aClass310_139.method7783(local36)) {
				@Pc(62) byte[] local62 = Static690.aClass310_139.method7801("", local36);
				@Pc(68) File local68;
				try {
					local68 = Static25.method379(local22);
				} catch (@Pc(70) RuntimeException local70) {
					return -1;
				}
				if (local62 == null || local68 == null) {
					return -1;
				}
				@Pc(80) boolean local80 = true;
				@Pc(84) byte[] local84 = Static544.method8202(local68);
				if (local84 != null && local62.length == local84.length) {
					for (@Pc(99) int local99 = 0; local99 < local84.length; local99++) {
						if (local62[local99] != local84[local99]) {
							local80 = false;
							break;
						}
					}
				} else {
					local80 = false;
				}
				try {
					if (!local80) {
						Static639.aClass173_6.method4237(local62, local68);
					}
				} catch (@Pc(141) Throwable local141) {
					return -1;
				}
				Static372.method5786(arg0, local68);
				return 100;
			} else {
				return Static690.aClass310_139.method7792(local36);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Z")
	public static boolean method4924(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
