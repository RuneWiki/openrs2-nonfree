import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
	public static void method6012() {
		if (Static49.anInt834 > 1) {
			Static49.anInt834--;
			Static372.anInt6365 = Static210.anInt3647;
		}
		if (Static532.aClass400_3.aBoolean795) {
			Static532.aClass400_3.aBoolean795 = false;
			Static648.method8729();
			return;
		}
		if (!Static555.aBoolean678) {
			Static716.method9348();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static71.method908(Static532.aClass400_3); local38++) {
		}
		if (Static178.anInt3225 != 11) {
			return;
		}
		@Pc(71) Class3_Sub48 local71;
		@Pc(80) int local80;
		while (Static720.method9401()) {
			local71 = Static89.method1200(Static47.aClass286_13, Static532.aClass400_3.aClass399_2);
			local71.aClass3_Sub28_Sub2_1.method5329(0);
			local80 = local71.aClass3_Sub28_Sub2_1.anInt6241;
			Static108.method1946(local71.aClass3_Sub28_Sub2_1);
			local71.aClass3_Sub28_Sub2_1.method5291(local71.aClass3_Sub28_Sub2_1.anInt6241 - local80);
			Static532.aClass400_3.method9223(local71);
		}
		if (Static647.aClass3_Sub46_2 == null) {
			if (Static78.aLong62 <= Static626.method8479()) {
				Static647.aClass3_Sub46_2 = Static371.aClass383_1.method8940(Static272.aClass314_7.aString117);
			}
		} else if (Static647.aClass3_Sub46_2.anInt9328 != -1) {
			local71 = Static89.method1200(Static651.aClass286_121, Static532.aClass400_3.aClass399_2);
			local71.aClass3_Sub28_Sub2_1.method5282(Static647.aClass3_Sub46_2.anInt9328);
			Static532.aClass400_3.method9223(local71);
			Static647.aClass3_Sub46_2 = null;
			Static78.aLong62 = Static626.method8479() + 30000L;
		}
		@Pc(163) Class3_Sub14 local163 = (Class3_Sub14) Static641.aClass357_61.method8391();
		@Pc(178) int local178;
		@Pc(203) int local203;
		@Pc(224) int local224;
		@Pc(286) int local286;
		@Pc(293) int local293;
		@Pc(305) int local305;
		@Pc(176) Class3_Sub48 local176;
		if (local163 != null || Static626.method8479() - 2000L > Static147.aLong107) {
			local176 = null;
			local178 = 0;
			for (@Pc(183) Class3_Sub14 local183 = (Class3_Sub14) Static314.aClass357_27.method8391(); local183 != null && (local176 == null || local176.aClass3_Sub28_Sub2_1.anInt6241 - local178 < 240); local183 = (Class3_Sub14) Static314.aClass357_27.method8392()) {
				local183.method9446();
				local203 = local183.method4294();
				if (local203 < -1) {
					local203 = -1;
				} else if (local203 > 65534) {
					local203 = 65534;
				}
				local224 = local183.method4292();
				if (local224 < -1) {
					local224 = -1;
				} else if (local224 > 65534) {
					local224 = 65534;
				}
				if (Static91.anInt1531 != local224 || Static156.anInt2857 != local203) {
					if (local176 == null) {
						local176 = Static89.method1200(Static545.aClass286_67, Static532.aClass400_3.aClass399_2);
						local176.aClass3_Sub28_Sub2_1.method5329(0);
						local178 = local176.aClass3_Sub28_Sub2_1.anInt6241;
					}
					local286 = local224 - Static91.anInt1531;
					Static91.anInt1531 = local224;
					local293 = local203 - Static156.anInt2857;
					Static156.anInt2857 = local203;
					local305 = (int) ((local183.method4297() - Static147.aLong107) / 20L);
					if (local305 < 8 && local286 >= -32 && local286 <= 31 && local293 >= -32 && local293 <= 31) {
						local293 += 32;
						local286 += 32;
						local176.aClass3_Sub28_Sub2_1.method5282(local293 + (local286 << 6) + (local305 << 12));
					} else if (local305 < 32 && local286 >= -128 && local286 <= 127 && local293 >= -128 && local293 <= 127) {
						local293 += 128;
						local286 += 128;
						local176.aClass3_Sub28_Sub2_1.method5329(local305 + 128);
						local176.aClass3_Sub28_Sub2_1.method5282(local293 + (local286 << 8));
					} else if (local305 < 32) {
						local176.aClass3_Sub28_Sub2_1.method5329(local305 + 192);
						if (local224 == 1 || local203 == -1) {
							local176.aClass3_Sub28_Sub2_1.method5311(Integer.MIN_VALUE);
						} else {
							local176.aClass3_Sub28_Sub2_1.method5311(local224 | local203 << 16);
						}
					} else {
						local176.aClass3_Sub28_Sub2_1.method5282(local305 + 57344);
						if (local224 == 1 || local203 == -1) {
							local176.aClass3_Sub28_Sub2_1.method5311(Integer.MIN_VALUE);
						} else {
							local176.aClass3_Sub28_Sub2_1.method5311(local203 << 16 | local224);
						}
					}
					Static147.aLong107 = local183.method4297();
				}
			}
			if (local176 != null) {
				local176.aClass3_Sub28_Sub2_1.method5291(local176.aClass3_Sub28_Sub2_1.anInt6241 - local178);
				Static532.aClass400_3.method9223(local176);
			}
		}
		@Pc(565) int local565;
		if (local163 != null) {
			@Pc(545) long local545 = (local163.method4297() - Static601.aLong338) / 50L;
			if (local545 > 32767L) {
				local545 = 32767L;
			}
			Static601.aLong338 = local163.method4297();
			local565 = local163.method4294();
			if (local565 < 0) {
				local565 = 0;
			} else if (local565 > 65535) {
				local565 = 65535;
			}
			local203 = local163.method4292();
			if (local203 < 0) {
				local203 = 0;
			} else if (local203 > 65535) {
				local203 = 65535;
			}
			@Pc(605) byte local605 = 0;
			if (local163.method4295() == 2) {
				local605 = 1;
			}
			local286 = (int) local545;
			@Pc(627) Class3_Sub48 local627 = Static89.method1200(Static139.aClass286_26, Static532.aClass400_3.aClass399_2);
			local627.aClass3_Sub28_Sub2_1.method5313(local605 << 15 | local286);
			local627.aClass3_Sub28_Sub2_1.method5311(local565 << 16 | local203);
			Static532.aClass400_3.method9223(local627);
		}
		@Pc(691) long local691;
		if (Static401.anInt7165 > 0) {
			local176 = Static89.method1200(Static469.aClass286_21, Static532.aClass400_3.aClass399_2);
			local176.aClass3_Sub28_Sub2_1.method5329(Static401.anInt7165 * 3);
			for (local178 = 0; local178 < Static401.anInt7165; local178++) {
				@Pc(681) Interface3 local681 = Static127.anInterface3Array1[local178];
				local691 = (local681.method667() - Static302.aLong184) / 50L;
				Static302.aLong184 = local681.method667();
				if (local691 > 65535L) {
					local691 = 65535L;
				}
				local176.aClass3_Sub28_Sub2_1.method5329(local681.method666());
				local176.aClass3_Sub28_Sub2_1.method5282((int) local691);
			}
			Static532.aClass400_3.method9223(local176);
		}
		if (Static722.anInt11273 > 0) {
			Static722.anInt11273--;
		}
		if (Static71.aBoolean90 && Static722.anInt11273 <= 0) {
			Static71.aBoolean90 = false;
			Static722.anInt11273 = 20;
			local176 = Static89.method1200(Static632.aClass286_116, Static532.aClass400_3.aClass399_2);
			local176.aClass3_Sub28_Sub2_1.method5270((int) Static27.aFloat4 >> 3);
			local176.aClass3_Sub28_Sub2_1.method5292((int) Static658.aFloat196 >> 3);
			Static532.aClass400_3.method9223(local176);
		}
		if (Static712.aBoolean803 != Static153.aBoolean230) {
			Static712.aBoolean803 = Static153.aBoolean230;
			local176 = Static89.method1200(Static490.aClass286_82, Static532.aClass400_3.aClass399_2);
			local176.aClass3_Sub28_Sub2_1.method5329(Static153.aBoolean230 ? 1 : 0);
			Static532.aClass400_3.method9223(local176);
		}
		if (!Static675.aBoolean771) {
			local176 = Static89.method1200(Static58.aClass286_16, Static532.aClass400_3.aClass399_2);
			local176.aClass3_Sub28_Sub2_1.method5329(0);
			local178 = local176.aClass3_Sub28_Sub2_1.anInt6241;
			@Pc(846) Class3_Sub28 local846 = Static713.aClass3_Sub55_31.method8890();
			local176.aClass3_Sub28_Sub2_1.method5274(local846.anInt6241, local846.aByteArray50, 0);
			local176.aClass3_Sub28_Sub2_1.method5291(local176.aClass3_Sub28_Sub2_1.anInt6241 - local178);
			Static532.aClass400_3.method9223(local176);
			Static675.aBoolean771 = true;
		}
		if (Static584.aClass262ArrayArrayArray2 != null) {
			if (Static175.anInt10579 == 2) {
				Static681.method8986();
			} else if (Static175.anInt10579 == 3) {
				Static460.method6827();
			}
		}
		if (Static175.aBoolean765) {
			Static175.aBoolean765 = false;
		} else {
			Static144.aFloat56 /= 2.0F;
		}
		if (Static272.aBoolean432) {
			Static272.aBoolean432 = false;
		} else {
			Static18.aFloat197 /= 2.0F;
		}
		Static647.method8725();
		if (Static178.anInt3225 != 11) {
			return;
		}
		Static359.method5141();
		Static163.method2628();
		Static93.method1259();
		Static532.aClass400_3.anInt11055++;
		if (Static532.aClass400_3.anInt11055 > 750) {
			Static648.method8729();
			return;
		}
		if (Static334.anInt5845 == 0) {
			Static40.method589();
			Static715.method6593();
		} else {
			if (Static334.anInt5845 == 1 && Static395.method5943(Static587.anInt9587)) {
				Static275.method4207();
				Static334.anInt5845 = 2;
			}
			if (Static334.anInt5845 == 2 && Static178.anInt3225 != 12) {
				Static658.aClass136_48.method3505();
				Static675.anInt10693 = Static269.anInt4883;
				Static334.anInt5845 = 3;
				Static302.anInt5465 = 0;
				Static440.method6398();
			}
			if (Static334.anInt5845 == 3) {
				local80 = Static269.anInt4883 - Static675.anInt10693;
				if (Static302.anInt5465 < Static612.aClass10Array1.length) {
					do {
						@Pc(1020) Class10 local1020 = Static612.aClass10Array1[Static302.anInt5465];
						if (local1020.anInt10956 > local80) {
							break;
						}
						local1020.method9146();
					} while (Static334.anInt5845 == 3 && ++Static302.anInt5465 < Static612.aClass10Array1.length);
				}
				if (Static334.anInt5845 == 3) {
					for (local178 = 0; local178 < Static154.aClass11Array1.length; local178++) {
						@Pc(1055) Class11 local1055 = Static154.aClass11Array1[local178];
						if (local1055.aBoolean10) {
							@Pc(1062) Class19_Sub1_Sub3_Sub2 local1062 = local1055.method295();
							Static480.method7029(local1062, true);
						}
					}
				}
			}
		}
		Static381.method5733();
		Static110.method1961();
		for (local80 = Static577.aClass362_1.method8666(true); local80 != -1; local80 = Static577.aClass362_1.method8666(false)) {
			Static692.method9074(local80);
			Static311.anIntArray312[Static644.anInt10388++ & 0x1F] = local80;
		}
		for (@Pc(1123) Class3_Sub4_Sub2 local1123 = Static600.method8267(); local1123 != null; local1123 = Static600.method8267()) {
			local565 = local1123.method625();
			local691 = local1123.method628();
			if (local565 == 1) {
				Static568.anIntArray608[(int) local691] = local1123.anInt803;
				Static171.aBoolean259 |= Static214.aBooleanArray11[(int) local691];
				Static556.anIntArray509[Static575.anInt9439++ & 0x1F] = (int) local691;
			} else if (local565 == 2) {
				Static283.aStringArray16[(int) local691] = local1123.aString16;
				Static413.anIntArray395[Static189.anInt3336++ & 0x1F] = (int) local691;
			} else {
				@Pc(1157) Class20 local1157;
				if (local565 == 3) {
					local1157 = Static118.method2045((int) local691);
					if (!local1123.aString16.equals(local1157.aString7)) {
						local1157.aString7 = local1123.aString16;
						Static391.method5905(local1157);
					}
				} else {
					@Pc(1193) int local1193;
					if (local565 == 4) {
						local1157 = Static118.method2045((int) local691);
						local293 = local1123.anInt803;
						local305 = local1123.anInt805;
						local1193 = local1123.anInt804;
						if (local293 != local1157.anInt568 || local1157.anInt520 != local305 || local1157.anInt570 != local1193) {
							local1157.anInt520 = local305;
							local1157.anInt568 = local293;
							local1157.anInt570 = local1193;
							Static391.method5905(local1157);
						}
					} else if (local565 == 5) {
						local1157 = Static118.method2045((int) local691);
						if (local1123.anInt803 != local1157.anInt538) {
							if (local1123.anInt803 == -1) {
								local1157.aClass100_1 = null;
							} else {
								if (local1157.aClass100_1 == null) {
									local1157.aClass100_1 = new Class100_Sub2();
								}
								local1157.aClass100_1.method8962(local1123.anInt803);
							}
							local1157.anInt538 = local1123.anInt803;
							Static391.method5905(local1157);
						}
					} else if (local565 == 6) {
						local286 = local1123.anInt803;
						local293 = local286 >> 10 & 0x1F;
						local305 = local286 >> 5 & 0x1F;
						local1193 = local286 & 0x1F;
						@Pc(1768) int local1768 = (local305 << 11) + ((local293 << 19) + (local1193 << 3));
						@Pc(1773) Class20 local1773 = Static118.method2045((int) local691);
						if (local1773.anInt540 != local1768) {
							local1773.anInt540 = local1768;
							Static391.method5905(local1773);
						}
					} else if (local565 == 7) {
						local1157 = Static118.method2045((int) local691);
						@Pc(1264) boolean local1264 = local1123.anInt803 == 1;
						if (local1157.aBoolean42 != local1264) {
							local1157.aBoolean42 = local1264;
							Static391.method5905(local1157);
						}
					} else if (local565 == 8) {
						local1157 = Static118.method2045((int) local691);
						if (local1123.anInt803 != local1157.anInt511 || local1157.anInt573 != local1123.anInt805 || local1123.anInt804 != local1157.anInt508) {
							local1157.anInt508 = local1123.anInt804;
							local1157.anInt511 = local1123.anInt803;
							local1157.anInt573 = local1123.anInt805;
							if (local1157.anInt595 != -1) {
								if (local1157.anInt550 > 0) {
									local1157.anInt508 = local1157.anInt508 * 32 / local1157.anInt550;
								} else if (local1157.anInt592 > 0) {
									local1157.anInt508 = local1157.anInt508 * 32 / local1157.anInt592;
								}
							}
							Static391.method5905(local1157);
						}
					} else if (local565 == 9) {
						local1157 = Static118.method2045((int) local691);
						if (local1123.anInt803 != local1157.anInt595 || local1157.anInt593 != local1123.anInt805) {
							local1157.anInt593 = local1123.anInt805;
							local1157.anInt595 = local1123.anInt803;
							Static391.method5905(local1157);
						}
					} else if (local565 == 10) {
						local1157 = Static118.method2045((int) local691);
						if (local1157.anInt588 != local1123.anInt803 || local1123.anInt805 != local1157.anInt531 || local1123.anInt804 != local1157.anInt523) {
							local1157.anInt588 = local1123.anInt803;
							local1157.anInt523 = local1123.anInt804;
							local1157.anInt531 = local1123.anInt805;
							Static391.method5905(local1157);
						}
					} else if (local565 == 11) {
						local1157 = Static118.method2045((int) local691);
						local1157.aByte16 = 0;
						local1157.anInt524 = local1157.anInt564 = local1123.anInt803;
						local1157.aByte15 = 0;
						local1157.anInt574 = local1157.anInt572 = local1123.anInt805;
						Static391.method5905(local1157);
					} else if (local565 == 12) {
						local1157 = Static118.method2045((int) local691);
						local293 = local1123.anInt803;
						if (local1157 != null && local1157.anInt532 == 0) {
							if (local1157.anInt571 - local1157.anInt569 < local293) {
								local293 = local1157.anInt571 - local1157.anInt569;
							}
							if (local293 < 0) {
								local293 = 0;
							}
							if (local293 != local1157.anInt554) {
								local1157.anInt554 = local293;
								Static391.method5905(local1157);
							}
						}
					} else if (local565 == 14) {
						local1157 = Static118.method2045((int) local691);
						local1157.anInt547 = local1123.anInt803;
					} else if (local565 == 15) {
						Static493.anInt8491 = local1123.anInt805;
						Static482.anInt8391 = local1123.anInt803;
						Static352.aBoolean479 = true;
					} else if (local565 == 16) {
						local1157 = Static118.method2045((int) local691);
						local1157.anInt591 = local1123.anInt803;
					} else if (local565 == 20) {
						local1157 = Static118.method2045((int) local691);
						local1157.aBoolean43 = local1123.anInt803 == 1;
					} else if (local565 == 21) {
						local1157 = Static118.method2045((int) local691);
						local1157.aBoolean46 = local1123.anInt803 == 1;
					} else if (local565 == 17) {
						local1157 = Static118.method2045((int) local691);
						local1157.anInt557 = local1123.anInt803;
					} else if (local565 == 18) {
						local1157 = Static118.method2045((int) local691);
						local293 = (int) (local691 >> 32);
						local1157.method463((short) local1123.anInt805, (short) local1123.anInt803, local293);
					} else if (local565 == 19) {
						local1157 = Static118.method2045((int) local691);
						local293 = (int) (local691 >> 32);
						local1157.method455((short) local1123.anInt803, local293, (short) local1123.anInt805);
					}
				}
			}
		}
		Static387.anInt6950++;
		if (Static290.anInt5227 != 0) {
			Static139.anInt2624 += 20;
			if (Static139.anInt2624 >= 400) {
				Static290.anInt5227 = 0;
			}
		}
		if (Static532.aClass20_17 != null) {
			Static63.anInt991++;
			if (Static63.anInt991 >= 15) {
				Static391.method5905(Static532.aClass20_17);
				Static532.aClass20_17 = null;
			}
		}
		Static89.aBoolean123 = false;
		Static414.aBoolean572 = false;
		Static440.aClass20_13 = null;
		Static704.aClass20_19 = null;
		Static69.method855((Class20) null, -1, -1);
		if (!Static212.aBoolean297) {
			Static355.anInt6021 = -1;
		}
		Static96.method1286();
		Static210.anInt3647++;
		if (Static638.aBoolean748) {
			@Pc(1972) Class3_Sub48 local1972 = Static89.method1200(Static119.aClass286_23, Static532.aClass400_3.aClass399_2);
			local1972.aClass3_Sub28_Sub2_1.method5309(Static251.anInt4689 | Static337.anInt5853 << 28 | Static78.anInt1228 << 14);
			Static532.aClass400_3.method9223(local1972);
			Static638.aBoolean748 = false;
		}
		while (true) {
			@Pc(2003) Class3_Sub7 local2003;
			@Pc(2023) Class20 local2023;
			@Pc(2008) Class20 local2008;
			do {
				local2003 = (Class3_Sub7) Static357.aClass357_32.method8398();
				if (local2003 == null) {
					while (true) {
						do {
							local2003 = (Class3_Sub7) Static439.aClass357_44.method8398();
							if (local2003 == null) {
								while (true) {
									do {
										local2003 = (Class3_Sub7) Static102.aClass357_6.method8398();
										if (local2003 == null) {
											if (Static440.aClass20_13 == null) {
												Static618.anInt6009 = 0;
											}
											if (Static509.aClass20_16 != null) {
												Static191.method2898();
											}
											if (Static651.anInt10450 > 0 && Static419.aClass133_1.method3450(82) && Static419.aClass133_1.method3450(81) && Static217.anInt4222 != 0) {
												local565 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 - Static217.anInt4222;
												if (local565 < 0) {
													local565 = 0;
												} else if (local565 > 3) {
													local565 = 3;
												}
												Static405.method6054(Static339.anInt5859 + Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.lb[0], local565, Static714.anInt11156 + Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anIntArray430[0]);
											}
											Static623.method8439();
											for (local565 = 0; local565 < 5; local565++) {
												@Pc(2230) int local2230 = Static272.anIntArray280[local565]++;
											}
											if (Static171.aBoolean259 && Static626.method8479() - 60000L > Static298.aLong137) {
												Static423.method6246();
											}
											for (@Pc(2265) Class19_Sub4_Sub2 local2265 = (Class19_Sub4_Sub2) Static451.aClass66_7.method1381(); local2265 != null; local2265 = (Class19_Sub4_Sub2) Static451.aClass66_7.method1380()) {
												if (Static626.method8479() / 1000L - 5L > (long) local2265.anInt8654) {
													if (local2265.aShort117 > 0) {
														Static170.method2681("", 5, 0, local2265.aString114 + Static476.aClass279_19.method6992(Static141.anInt2658), "", "");
													}
													if (local2265.aShort117 == 0) {
														Static170.method2681("", 5, 0, local2265.aString114 + Static476.aClass279_20.method6992(Static141.anInt2658), "", "");
													}
													local2265.method9359();
												}
											}
											Static406.anInt7243++;
											if (Static406.anInt7243 > 500) {
												Static406.anInt7243 = 0;
												local224 = (int) (Math.random() * 8.0D);
												if ((local224 & 0x2) == 2) {
													Static53.anInt11213 += Static151.anInt2814;
												}
												if ((local224 & 0x1) == 1) {
													Static702.anInt10990 += Static696.anInt10928;
												}
												if ((local224 & 0x4) == 4) {
													Static344.anInt5903 += Static394.anInt7065;
												}
											}
											if (Static702.anInt10990 < -50) {
												Static696.anInt10928 = 2;
											}
											if (Static702.anInt10990 > 50) {
												Static696.anInt10928 = -2;
											}
											if (Static53.anInt11213 < -55) {
												Static151.anInt2814 = 2;
											}
											if (Static344.anInt5903 < -40) {
												Static394.anInt7065 = 1;
											}
											if (Static53.anInt11213 > 55) {
												Static151.anInt2814 = -2;
											}
											Static532.anInt8975++;
											if (Static344.anInt5903 > 40) {
												Static394.anInt7065 = -1;
											}
											if (Static532.anInt8975 > 500) {
												Static532.anInt8975 = 0;
												local224 = (int) (Math.random() * 8.0D);
												if ((local224 & 0x2) == 2) {
													Static61.anInt953 += Static365.anInt6118;
												}
												if ((local224 & 0x1) == 1) {
													Static543.anInt9108 += Static540.anInt9066;
												}
											}
											if (Static543.anInt9108 < -60) {
												Static540.anInt9066 = 2;
											}
											if (Static61.anInt953 < -20) {
												Static365.anInt6118 = 1;
											}
											if (Static543.anInt9108 > 60) {
												Static540.anInt9066 = -2;
											}
											if (Static61.anInt953 > 10) {
												Static365.anInt6118 = -1;
											}
											Static532.aClass400_3.anInt11060++;
											if (Static532.aClass400_3.anInt11060 > 50) {
												@Pc(2545) Class3_Sub48 local2545 = Static89.method1200(Static262.aClass286_46, Static532.aClass400_3.aClass399_2);
												Static532.aClass400_3.method9223(local2545);
											}
											if (Static418.aBoolean574) {
												Static408.method6079();
												Static418.aBoolean574 = false;
											}
											try {
												Static532.aClass400_3.method9227();
												return;
											} catch (@Pc(2564) IOException local2564) {
												Static648.method8729();
												return;
											}
										}
										local2008 = local2003.aClass20_2;
										if (local2008.anInt583 < 0) {
											break;
										}
										local2023 = Static118.method2045(local2008.anInt556);
									} while (local2023 == null || local2023.aClass20Array1 == null || local2023.aClass20Array1.length <= local2008.anInt583 || local2023.aClass20Array1[local2008.anInt583] != local2008);
									Static185.method2811(local2003);
								}
							}
							local2008 = local2003.aClass20_2;
							if (local2008.anInt583 < 0) {
								break;
							}
							local2023 = Static118.method2045(local2008.anInt556);
						} while (local2023 == null || local2023.aClass20Array1 == null || local2023.aClass20Array1.length <= local2008.anInt583 || local2008 != local2023.aClass20Array1[local2008.anInt583]);
						Static185.method2811(local2003);
					}
				}
				local2008 = local2003.aClass20_2;
				if (local2008.anInt583 < 0) {
					break;
				}
				local2023 = Static118.method2045(local2008.anInt556);
			} while (local2023 == null || local2023.aClass20Array1 == null || local2008.anInt583 >= local2023.aClass20Array1.length || local2008 != local2023.aClass20Array1[local2008.anInt583]);
			Static185.method2811(local2003);
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)V")
	public static void method6013() {
		Static379.anInt6781 = 0;
		Static537.aClass79Array4 = new Class79[500];
		Static522.aBoolean658 = false;
		Static90.anIntArrayArrayArray2 = new int[Static241.anInt4521][Static509.anInt8656 + 1][Static164.anInt3059 + 1];
		Static406.aClass79Array2 = new Class79[500];
		Static505.anInt8623 = 0;
		Static345.aClass79Array1 = new Class79[2000];
		Static629.anInt10181 = 0;
		Static87.anInt1440 = Static495.anInt8508;
		Static84.anInt1285 = Static495.anInt8508;
		Static458.anInt8069 = 0;
		Static483.aClass79Array3 = new Class79[1000];
		if (Static626.aClass67_16 instanceof oa) {
			Static177.aBoolean501 = false;
		} else {
			Static177.aBoolean501 = true;
		}
	}
}
