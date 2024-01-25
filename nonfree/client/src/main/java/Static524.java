import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
	public static int anInt8883;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public static void method7619() {
		if (Static269.anInt5252 > 1) {
			Static269.anInt5252--;
			Static500.anInt8429 = Static303.anInt8405;
		}
		if (Static303.aBoolean610) {
			Static303.aBoolean610 = false;
			Static114.method2111();
			return;
		}
		if (!Static253.aBoolean362) {
			Static638.method8582();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static136.method2359(); local29++) {
		}
		if (Static82.anInt1653 != 10) {
			return;
		}
		@Pc(51) Class3_Sub27 local51;
		@Pc(60) int local60;
		while (Static544.method7828()) {
			local51 = Static59.method1040(Static325.aClass20_2, Static505.aClass314_125);
			local51.aClass3_Sub9_Sub2_2.method5572(0);
			local60 = local51.aClass3_Sub9_Sub2_2.anInt6453;
			Static201.method3194(local51.aClass3_Sub9_Sub2_2);
			local51.aClass3_Sub9_Sub2_2.method5615(local51.aClass3_Sub9_Sub2_2.anInt6453 - local60);
			Static148.method2572(local51);
		}
		if (Static576.aClass3_Sub42_2 == null) {
			if (Static532.aLong244 <= Static191.method3071()) {
				Static576.aClass3_Sub42_2 = Static602.aClass227_1.method5782(Static28.aClass157_1.aString34);
			}
		} else if (Static576.aClass3_Sub42_2.anInt7888 != -1) {
			local51 = Static59.method1040(Static325.aClass20_2, Static339.aClass314_19);
			local51.aClass3_Sub9_Sub2_2.method5620(Static576.aClass3_Sub42_2.anInt7888);
			Static148.method2572(local51);
			Static576.aClass3_Sub42_2 = null;
			Static532.aLong244 = Static191.method3071() + 30000L;
		}
		@Pc(130) Class3_Sub21 local130 = (Class3_Sub21) Static172.aClass216_29.method5457();
		@Pc(143) int local143;
		@Pc(166) int local166;
		@Pc(185) int local185;
		@Pc(232) int local232;
		@Pc(239) int local239;
		@Pc(250) int local250;
		@Pc(141) Class3_Sub27 local141;
		if (local130 != null || Static437.aLong200 < Static191.method3071() - 2000L) {
			local141 = null;
			local143 = 0;
			for (@Pc(148) Class3_Sub21 local148 = (Class3_Sub21) Static34.aClass216_4.method5457(); local148 != null && (local141 == null || local141.aClass3_Sub9_Sub2_2.anInt6453 - local143 < 240); local148 = (Class3_Sub21) Static34.aClass216_4.method5458()) {
				local148.method8682();
				local166 = local148.method5060();
				if (local166 < -1) {
					local166 = -1;
				} else if (local166 > 65534) {
					local166 = 65534;
				}
				local185 = local148.method5064();
				if (local185 < -1) {
					local185 = -1;
				} else if (local185 > 65534) {
					local185 = 65534;
				}
				if (local185 != Static100.anInt2902 || local166 != Static276.anInt5323) {
					if (local141 == null) {
						local141 = Static59.method1040(Static325.aClass20_2, Static96.aClass314_35);
						local141.aClass3_Sub9_Sub2_2.method5572(0);
						local143 = local141.aClass3_Sub9_Sub2_2.anInt6453;
					}
					local232 = local185 - Static100.anInt2902;
					Static100.anInt2902 = local185;
					local239 = local166 - Static276.anInt5323;
					Static276.anInt5323 = local166;
					local250 = (int) ((local148.method5061() - Static437.aLong200) / 20L);
					if (local250 < 8 && local232 >= -32 && local232 <= 31 && local239 >= -32 && local239 <= 31) {
						local232 += 32;
						local239 += 32;
						local141.aClass3_Sub9_Sub2_2.method5620((local250 << 12) + (local232 << 6) + local239);
					} else if (local250 < 32 && local232 >= -128 && local232 <= 127 && local239 >= -128 && local239 <= 127) {
						local232 += 128;
						local239 += 128;
						local141.aClass3_Sub9_Sub2_2.method5572(local250 + 128);
						local141.aClass3_Sub9_Sub2_2.method5620(local239 + (local232 << 8));
					} else if (local250 < 32) {
						local141.aClass3_Sub9_Sub2_2.method5572(local250 + 192);
						if (local185 == 1 || local166 == -1) {
							local141.aClass3_Sub9_Sub2_2.method5601(Integer.MIN_VALUE);
						} else {
							local141.aClass3_Sub9_Sub2_2.method5601(local166 << 16 | local185);
						}
					} else {
						local141.aClass3_Sub9_Sub2_2.method5620(local250 + 57344);
						if (local185 == 1 || local166 == -1) {
							local141.aClass3_Sub9_Sub2_2.method5601(Integer.MIN_VALUE);
						} else {
							local141.aClass3_Sub9_Sub2_2.method5601(local166 << 16 | local185);
						}
					}
					Static437.aLong200 = local148.method5061();
				}
			}
			if (local141 != null) {
				local141.aClass3_Sub9_Sub2_2.method5615(local141.aClass3_Sub9_Sub2_2.anInt6453 - local143);
				Static148.method2572(local141);
			}
		}
		@Pc(450) int local450;
		if (local130 != null) {
			@Pc(436) long local436 = (local130.method5061() - Static480.aLong214) / 50L;
			Static480.aLong214 = local130.method5061();
			if (local436 > 32767L) {
				local436 = 32767L;
			}
			local450 = local130.method5060();
			if (local450 < 0) {
				local450 = 0;
			} else if (local450 > 65535) {
				local450 = 65535;
			}
			local166 = local130.method5064();
			if (local166 < 0) {
				local166 = 0;
			} else if (local166 > 65535) {
				local166 = 65535;
			}
			@Pc(478) byte local478 = 0;
			if (local130.method5059() == 2) {
				local478 = 1;
			}
			local232 = (int) local436;
			@Pc(497) Class3_Sub27 local497 = Static59.method1040(Static325.aClass20_2, Static176.aClass314_56);
			local497.aClass3_Sub9_Sub2_2.method5590(local166 | local450 << 16);
			local497.aClass3_Sub9_Sub2_2.method5616(local478 << 15 | local232);
			Static148.method2572(local497);
		}
		if (Static435.anInt7561 > 0) {
			local141 = Static59.method1040(Static325.aClass20_2, Static254.aClass314_29);
			local141.aClass3_Sub9_Sub2_2.method5572(Static435.anInt7561 * 3);
			for (local143 = 0; local143 < Static435.anInt7561; local143++) {
				@Pc(544) Interface26 local544 = Static525.anInterface26Array2[local143];
				@Pc(553) long local553 = (local544.method212() - Static113.aLong64) / 50L;
				if (local553 > 65535L) {
					local553 = 65535L;
				}
				Static113.aLong64 = local544.method212();
				local141.aClass3_Sub9_Sub2_2.method5572(local544.method214());
				local141.aClass3_Sub9_Sub2_2.method5620((int) local553);
			}
			Static148.method2572(local141);
		}
		if (Static269.anInt5254 > 0) {
			Static269.anInt5254--;
		}
		if (Static66.aBoolean84 && Static269.anInt5254 <= 0) {
			Static269.anInt5254 = 20;
			Static66.aBoolean84 = false;
			local141 = Static59.method1040(Static325.aClass20_2, Static365.aClass314_103);
			local141.aClass3_Sub9_Sub2_2.method5595((int) Static509.aFloat152 >> 3);
			local141.aClass3_Sub9_Sub2_2.method5620((int) Static170.aFloat71 >> 3);
			Static148.method2572(local141);
		}
		if (Static521.aBoolean654 != Static489.aBoolean602) {
			Static521.aBoolean654 = Static489.aBoolean602;
			local141 = Static59.method1040(Static325.aClass20_2, Static276.aClass314_82);
			local141.aClass3_Sub9_Sub2_2.method5572(Static489.aBoolean602 ? 1 : 0);
			Static148.method2572(local141);
		}
		if (!Static576.aBoolean708) {
			local141 = Static59.method1040(Static325.aClass20_2, Static304.aClass314_124);
			local141.aClass3_Sub9_Sub2_2.method5572(0);
			local143 = local141.aClass3_Sub9_Sub2_2.anInt6453;
			@Pc(691) Class3_Sub9 local691 = Static32.aClass3_Sub41_3.method6770();
			local141.aClass3_Sub9_Sub2_2.method5625(local691.aByteArray51, local691.anInt6453, 0);
			local141.aClass3_Sub9_Sub2_2.method5615(local141.aClass3_Sub9_Sub2_2.anInt6453 - local143);
			Static148.method2572(local141);
			Static576.aBoolean708 = true;
		}
		if (Static567.aClass351ArrayArrayArray4 != null) {
			if (Static471.anInt8064 == 2) {
				Static550.method7855();
			} else if (Static471.anInt8064 == 3) {
				Static637.method8309();
			}
		}
		if (Static487.aBoolean596) {
			Static487.aBoolean596 = false;
		} else {
			Static642.aFloat200 /= 2.0F;
		}
		if (Static573.aBoolean489) {
			Static573.aBoolean489 = false;
		} else {
			Static202.aFloat79 /= 2.0F;
		}
		Static605.method8319();
		if (Static82.anInt1653 != 10) {
			return;
		}
		Static248.method4182();
		Static504.method7328();
		Static300.method8276();
		Static381.anInt6903++;
		if (Static381.anInt6903 > 750) {
			Static114.method2111();
			return;
		}
		Static143.method2419();
		Static552.method7863();
		Static491.method7205();
		for (local60 = Static183.aClass285_1.method6948(true); local60 != -1; local60 = Static183.aClass285_1.method6948(false)) {
			Static567.method8022(local60);
			Static428.anIntArray449[Static64.anInt1101++ & 0x1F] = local60;
		}
		@Pc(883) Class344 local883;
		for (@Pc(815) Class3_Sub7_Sub5 local815 = Static25.method343(); local815 != null; local815 = Static25.method343()) {
			local450 = local815.method1477();
			local166 = local815.method1472();
			if (local450 == 1) {
				Static584.anIntArray595[local166] = local815.anInt1728;
				Static644.aBoolean777 |= Static586.aBooleanArray29[local166];
				Static325.anIntArray122[Static71.anInt1423++ & 0x1F] = local166;
			} else if (local450 == 2) {
				Static10.aStringArray4[local166] = local815.aString9;
				Static105.anIntArray138[Static128.anInt1669++ & 0x1F] = local166;
			} else if (local450 == 3) {
				local883 = Static324.method5363(local166);
				if (!local815.aString9.equals(local883.aString95)) {
					local883.aString95 = local815.aString9;
					Static605.method8323(local883);
				}
			} else if (local450 == 4) {
				local883 = Static324.method5363(local166);
				local232 = local815.anInt1728;
				local239 = local815.anInt1720;
				local250 = local815.anInt1723;
				if (local232 != local883.anInt9611 || local239 != local883.anInt9549 || local883.anInt9603 != local250) {
					local883.anInt9611 = local232;
					local883.anInt9603 = local250;
					local883.anInt9549 = local239;
					Static605.method8323(local883);
				}
			} else if (local450 == 5) {
				local883 = Static324.method5363(local166);
				if (local883.anInt9601 != local815.anInt1728 || local815.anInt1728 == -1) {
					local883.anInt9556 = 0;
					local883.anInt9582 = 0;
					local883.anInt9630 = 1;
					local883.anInt9601 = local815.anInt1728;
					@Pc(1292) Class267 local1292 = local883.anInt9601 == -1 ? null : Static474.aClass264_2.method6574(local883.anInt9601);
					if (local1292 != null) {
						Static491.method7210(local1292, local883.anInt9582);
					}
					Static605.method8323(local883);
				}
			} else if (local450 == 6) {
				local185 = local815.anInt1728;
				local232 = local185 >> 10 & 0x1F;
				local239 = local185 >> 5 & 0x1F;
				local250 = local185 & 0x1F;
				@Pc(1234) int local1234 = (local239 << 11) + (local232 << 19) + (local250 << 3);
				@Pc(1238) Class344 local1238 = Static324.method5363(local166);
				if (local1234 != local1238.anInt9543) {
					local1238.anInt9543 = local1234;
					Static605.method8323(local1238);
				}
			} else if (local450 == 7) {
				local883 = Static324.method5363(local166);
				@Pc(891) boolean local891 = local815.anInt1728 == 1;
				if (local883.aBoolean730 != local891) {
					local883.aBoolean730 = local891;
					Static605.method8323(local883);
				}
			} else if (local450 == 8) {
				local883 = Static324.method5363(local166);
				if (local815.anInt1728 != local883.anInt9609 || local883.anInt9614 != local815.anInt1720 || local815.anInt1723 != local883.anInt9626) {
					local883.anInt9626 = local815.anInt1723;
					local883.anInt9614 = local815.anInt1720;
					local883.anInt9609 = local815.anInt1728;
					if (local883.anInt9567 != -1) {
						if (local883.anInt9585 > 0) {
							local883.anInt9626 = local883.anInt9626 * 32 / local883.anInt9585;
						} else if (local883.anInt9616 > 0) {
							local883.anInt9626 = local883.anInt9626 * 32 / local883.anInt9616;
						}
					}
					Static605.method8323(local883);
				}
			} else if (local450 == 9) {
				local883 = Static324.method5363(local166);
				if (local883.anInt9567 != local815.anInt1728 || local883.anInt9565 != local815.anInt1720) {
					local883.anInt9565 = local815.anInt1720;
					local883.anInt9567 = local815.anInt1728;
					Static605.method8323(local883);
				}
			} else if (local450 == 10) {
				local883 = Static324.method5363(local166);
				if (local815.anInt1728 != local883.anInt9572 || local883.anInt9593 != local815.anInt1720 || local815.anInt1723 != local883.anInt9613) {
					local883.anInt9613 = local815.anInt1723;
					local883.anInt9572 = local815.anInt1728;
					local883.anInt9593 = local815.anInt1720;
					Static605.method8323(local883);
				}
			} else if (local450 == 11) {
				local883 = Static324.method5363(local166);
				local883.aByte114 = 0;
				local883.anInt9573 = local883.anInt9596 = local815.anInt1720;
				local883.anInt9569 = local883.anInt9559 = local815.anInt1728;
				local883.aByte117 = 0;
				Static605.method8323(local883);
			} else if (local450 == 12) {
				local883 = Static324.method5363(local166);
				local232 = local815.anInt1728;
				if (local883 != null && local883.anInt9554 == 0) {
					if (local883.anInt9591 - local883.anInt9602 < local232) {
						local232 = local883.anInt9591 - local883.anInt9602;
					}
					if (local232 < 0) {
						local232 = 0;
					}
					if (local232 != local883.anInt9618) {
						local883.anInt9618 = local232;
						Static605.method8323(local883);
					}
				}
			} else if (local450 == 14) {
				local883 = Static324.method5363(local166);
				local883.anInt9597 = local815.anInt1728;
			} else if (local450 == 15) {
				Static162.anInt3235 = local815.anInt1728;
				Static258.anInt5032 = local815.anInt1720;
				Static309.aBoolean441 = true;
			} else if (local450 == 16) {
				local883 = Static324.method5363(local166);
				local883.anInt9548 = local815.anInt1728;
			} else if (local450 == 17) {
				local883 = Static324.method5363(local166);
				local883.anInt9545 = local815.anInt1728;
			}
		}
		Static487.anInt8277++;
		if (Static64.anInt1105 != 0) {
			Static351.anInt6517 += 20;
			if (Static351.anInt6517 >= 400) {
				Static64.anInt1105 = 0;
			}
		}
		if (Static490.aClass344_10 != null) {
			Static561.anInt9315++;
			if (Static561.anInt9315 >= 15) {
				Static605.method8323(Static490.aClass344_10);
				Static490.aClass344_10 = null;
			}
		}
		Static554.aClass344_13 = null;
		Static165.aClass344_4 = null;
		Static28.aBoolean21 = false;
		Static377.aBoolean497 = false;
		Static286.method4620(-1, (Class344) null, -1);
		Static558.method7940((Class344) null, -1, -1);
		if (!Static425.aBoolean536) {
			Static80.anInt1600 = -1;
		}
		Static556.method7888();
		Static303.anInt8405++;
		if (Static227.aBoolean337) {
			@Pc(1457) Class3_Sub27 local1457 = Static59.method1040(Static325.aClass20_2, Static566.aClass314_137);
			local1457.aClass3_Sub9_Sub2_2.method5601(Static516.anInt8715 << 28 | Static537.anInt9060 << 14 | Static282.anInt5417);
			Static148.method2572(local1457);
			Static227.aBoolean337 = false;
		}
		while (true) {
			@Pc(1485) Class3_Sub36 local1485;
			@Pc(1490) Class344 local1490;
			do {
				local1485 = (Class3_Sub36) Static140.aClass216_22.method5462();
				if (local1485 == null) {
					while (true) {
						do {
							local1485 = (Class3_Sub36) Static459.aClass216_56.method5462();
							if (local1485 == null) {
								while (true) {
									do {
										local1485 = (Class3_Sub36) Static361.aClass216_48.method5462();
										if (local1485 == null) {
											if (Static165.aClass344_4 == null) {
												Static348.anInt6494 = 0;
											}
											if (Static429.aClass344_9 != null) {
												Static99.method7010();
											}
											if (Static544.anInt9130 > 0 && Static476.aClass62_2.method1421(82) && Static476.aClass62_2.method1421(81) && Static548.anInt9874 != 0) {
												local450 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127 - Static548.anInt9874;
												if (local450 < 0) {
													local450 = 0;
												} else if (local450 > 3) {
													local450 = 3;
												}
												Static99.method7008(local450, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray676[0] + Static22.anInt329, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray675[0] + Static427.anInt7462);
											}
											Static571.method8266();
											for (local450 = 0; local450 < 5; local450++) {
												@Pc(1673) int local1673 = Static649.anIntArray680[local450]++;
											}
											if (Static644.aBoolean777 && Static191.method3071() - 60000L > Static648.aLong276) {
												Static173.method2878();
											}
											for (@Pc(1700) Class9_Sub3_Sub1 local1700 = (Class9_Sub3_Sub1) Static132.aClass139_3.method3198(); local1700 != null; local1700 = (Class9_Sub3_Sub1) Static132.aClass139_3.method3205()) {
												if ((long) local1700.anInt3132 < Static191.method3071() / 1000L - 5L) {
													if (local1700.aShort41 > 0) {
														Static329.method5394(local1700.aString21 + Static369.aClass235_22.method5893(Static455.anInt7738), "", "", "", 5, 0);
													}
													if (local1700.aShort41 == 0) {
														Static329.method5394(local1700.aString21 + Static369.aClass235_23.method5893(Static455.anInt7738), "", "", "", 5, 0);
													}
													local1700.method8593();
												}
											}
											Static383.anInt10301++;
											if (Static383.anInt10301 > 500) {
												Static383.anInt10301 = 0;
												local185 = (int) (Math.random() * 8.0D);
												if ((local185 & 0x2) == 2) {
													Static465.anInt7960 += Static573.anInt6753;
												}
												if ((local185 & 0x1) == 1) {
													Static255.anInt4976 += Static135.anInt2827;
												}
												if ((local185 & 0x4) == 4) {
													Static138.anInt2852 += Static546.anInt9139;
												}
											}
											if (Static255.anInt4976 < -50) {
												Static135.anInt2827 = 2;
											}
											if (Static465.anInt7960 < -55) {
												Static573.anInt6753 = 2;
											}
											if (Static255.anInt4976 > 50) {
												Static135.anInt2827 = -2;
											}
											if (Static138.anInt2852 < -40) {
												Static546.anInt9139 = 1;
											}
											if (Static465.anInt7960 > 55) {
												Static573.anInt6753 = -2;
											}
											if (Static138.anInt2852 > 40) {
												Static546.anInt9139 = -1;
											}
											Static478.anInt8165++;
											if (Static478.anInt8165 > 500) {
												Static478.anInt8165 = 0;
												local185 = (int) (Math.random() * 8.0D);
												if ((local185 & 0x2) == 2) {
													Static296.anInt5883 += Static281.anInt5394;
												}
												if ((local185 & 0x1) == 1) {
													Static579.anInt9458 += Static308.anInt2212;
												}
											}
											if (Static579.anInt9458 < -60) {
												Static308.anInt2212 = 2;
											}
											if (Static579.anInt9458 > 60) {
												Static308.anInt2212 = -2;
											}
											if (Static296.anInt5883 < -20) {
												Static281.anInt5394 = 1;
											}
											if (Static296.anInt5883 > 10) {
												Static281.anInt5394 = -1;
											}
											Static189.anInt3567++;
											if (Static189.anInt3567 > 50) {
												@Pc(1931) Class3_Sub27 local1931 = Static59.method1040(Static325.aClass20_2, Static60.aClass314_48);
												Static148.method2572(local1931);
											}
											if (Static479.aBoolean538) {
												Static466.method6906();
												Static479.aBoolean538 = false;
											}
											try {
												Static263.method4385();
												return;
											} catch (@Pc(1944) IOException local1944) {
												Static114.method2111();
												return;
											}
										}
										local1490 = local1485.aClass344_6;
										if (local1490.anInt9586 < 0) {
											break;
										}
										local883 = Static324.method5363(local1490.anInt9632);
									} while (local883 == null || local883.aClass344Array2 == null || local883.aClass344Array2.length <= local1490.anInt9586 || local1490 != local883.aClass344Array2[local1490.anInt9586]);
									Static400.method6288(local1485);
								}
							}
							local1490 = local1485.aClass344_6;
							if (local1490.anInt9586 < 0) {
								break;
							}
							local883 = Static324.method5363(local1490.anInt9632);
						} while (local883 == null || local883.aClass344Array2 == null || local883.aClass344Array2.length <= local1490.anInt9586 || local1490 != local883.aClass344Array2[local1490.anInt9586]);
						Static400.method6288(local1485);
					}
				}
				local1490 = local1485.aClass344_6;
				if (local1490.anInt9586 < 0) {
					break;
				}
				local883 = Static324.method5363(local1490.anInt9632);
			} while (local883 == null || local883.aClass344Array2 == null || local883.aClass344Array2.length <= local1490.anInt9586 || local883.aClass344Array2[local1490.anInt9586] != local1490);
			Static400.method6288(local1485);
		}
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)Lclient!to;")
	public static Class3_Sub47 method7620() {
		if (Static598.aClass216_26 == null || Static297.aClass383_3 == null) {
			return null;
		}
		Static297.aClass383_3.method8656(Static598.aClass216_26);
		@Pc(25) Class3_Sub47 local25 = (Class3_Sub47) Static297.aClass383_3.method8654();
		if (local25 == null) {
			return null;
		} else {
			@Pc(35) Class179 local35 = Static598.aClass154_2.method3947(local25.anInt9169);
			return local35 != null && local35.aBoolean390 && local35.method4532(Static598.anInterface16_2) ? local25 : Static122.method2218();
		}
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)Lclient!vi;")
	public static Class354_Sub1 method7623() {
		Static377.anInt6828 = 0;
		return Static231.method3978();
	}
}
