import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
	public static int anInt6875 = -1;

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "Z")
	public static boolean aBoolean457 = false;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	public static void method5907() {
		if (Static328.anInt6241 > 1) {
			Static30.anInt4467 = Static320.anInt6118;
			Static328.anInt6241--;
		}
		if (Static243.aBoolean343) {
			Static243.aBoolean343 = false;
			Static534.method7893();
			return;
		}
		if (!Static71.aBoolean94) {
			Static370.method5839();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static355.method5681(); local27++) {
		}
		if (Static554.anInt1821 != 10) {
			return;
		}
		@Pc(51) Class6_Sub9 local51;
		@Pc(60) int local60;
		while (Static115.method1890()) {
			local51 = Static560.method8089(Static391.aClass126_1, Static211.aClass208_36);
			local51.aClass6_Sub40_Sub2_1.method8589(0);
			local60 = local51.aClass6_Sub40_Sub2_1.anInt10169;
			Static212.method3636(local51.aClass6_Sub40_Sub2_1);
			local51.aClass6_Sub40_Sub2_1.method8605(local51.aClass6_Sub40_Sub2_1.anInt10169 - local60);
			Static263.method4681(local51);
		}
		if (Static32.aClass6_Sub17_1 == null) {
			if (Static32.method595() >= Static317.aLong161) {
				Static32.aClass6_Sub17_1 = Static115.aClass380_1.method8969(Static315.aClass56_4.aString17);
			}
		} else if (Static32.aClass6_Sub17_1.anInt2807 != -1) {
			local51 = Static560.method8089(Static391.aClass126_1, Static420.aClass208_67);
			local51.aClass6_Sub40_Sub2_1.method8561(Static32.aClass6_Sub17_1.anInt2807);
			Static263.method4681(local51);
			Static32.aClass6_Sub17_1 = null;
			Static317.aLong161 = Static32.method595() + 30000L;
		}
		@Pc(129) Class6_Sub15 local129 = (Class6_Sub15) Static334.aClass8_33.method149();
		@Pc(146) int local146;
		@Pc(169) int local169;
		@Pc(187) int local187;
		@Pc(238) int local238;
		@Pc(245) int local245;
		@Pc(256) int local256;
		@Pc(144) Class6_Sub9 local144;
		if (local129 != null || Static32.method595() - 2000L > Static344.aLong169) {
			local144 = null;
			local146 = 0;
			for (@Pc(151) Class6_Sub15 local151 = (Class6_Sub15) Static230.aClass8_20.method149(); local151 != null && (local144 == null || local144.aClass6_Sub40_Sub2_1.anInt10169 - local146 < 240); local151 = (Class6_Sub15) Static230.aClass8_20.method155()) {
				local151.method9043();
				local169 = local151.method8387();
				if (local169 < -1) {
					local169 = -1;
				} else if (local169 > 65534) {
					local169 = 65534;
				}
				local187 = local151.method8383();
				if (local187 < -1) {
					local187 = -1;
				} else if (local187 > 65534) {
					local187 = 65534;
				}
				if (Static222.anInt4351 != local187 || Static245.anInt6443 != local169) {
					if (local144 == null) {
						local144 = Static560.method8089(Static391.aClass126_1, Static147.aClass208_28);
						local144.aClass6_Sub40_Sub2_1.method8589(0);
						local146 = local144.aClass6_Sub40_Sub2_1.anInt10169;
					}
					local238 = local187 - Static222.anInt4351;
					Static222.anInt4351 = local187;
					local245 = local169 - Static245.anInt6443;
					Static245.anInt6443 = local169;
					local256 = (int) ((local151.method8382() - Static344.aLong169) / 20L);
					if (local256 < 8 && local238 >= -32 && local238 <= 31 && local245 >= -32 && local245 <= 31) {
						local238 += 32;
						local245 += 32;
						local144.aClass6_Sub40_Sub2_1.method8561((local256 << 12) + (local238 << 6) + local245);
					} else if (local256 < 32 && local238 >= -128 && local238 <= 127 && local245 >= -128 && local245 <= 127) {
						local144.aClass6_Sub40_Sub2_1.method8589(local256 + 128);
						local245 += 128;
						local238 += 128;
						local144.aClass6_Sub40_Sub2_1.method8561((local238 << 8) + local245);
					} else if (local256 < 32) {
						local144.aClass6_Sub40_Sub2_1.method8589(local256 + 192);
						if (local187 == 1 || local169 == -1) {
							local144.aClass6_Sub40_Sub2_1.method8554(Integer.MIN_VALUE);
						} else {
							local144.aClass6_Sub40_Sub2_1.method8554(local169 << 16 | local187);
						}
					} else {
						local144.aClass6_Sub40_Sub2_1.method8561(local256 + 57344);
						if (local187 == 1 || local169 == -1) {
							local144.aClass6_Sub40_Sub2_1.method8554(Integer.MIN_VALUE);
						} else {
							local144.aClass6_Sub40_Sub2_1.method8554(local169 << 16 | local187);
						}
					}
					Static344.aLong169 = local151.method8382();
				}
			}
			if (local144 != null) {
				local144.aClass6_Sub40_Sub2_1.method8605(local144.aClass6_Sub40_Sub2_1.anInt10169 - local146);
				Static263.method4681(local144);
			}
		}
		@Pc(450) int local450;
		if (local129 != null) {
			@Pc(436) long local436 = (local129.method8382() - Static376.aLong177) / 50L;
			if (local436 > 32767L) {
				local436 = 32767L;
			}
			Static376.aLong177 = local129.method8382();
			local450 = local129.method8387();
			if (local450 < 0) {
				local450 = 0;
			} else if (local450 > 65535) {
				local450 = 65535;
			}
			local169 = local129.method8383();
			if (local169 < 0) {
				local169 = 0;
			} else if (local169 > 65535) {
				local169 = 65535;
			}
			@Pc(478) byte local478 = 0;
			if (local129.method8390() == 2) {
				local478 = 1;
			}
			local238 = (int) local436;
			@Pc(499) Class6_Sub9 local499 = Static560.method8089(Static391.aClass126_1, Static506.aClass208_78);
			local499.aClass6_Sub40_Sub2_1.method8564(local450 << 16 | local169);
			local499.aClass6_Sub40_Sub2_1.method8593(local478 << 15 | local238);
			Static263.method4681(local499);
		}
		if (Static298.anInt6415 > 0) {
			local144 = Static560.method8089(Static391.aClass126_1, Static47.aClass208_9);
			local144.aClass6_Sub40_Sub2_1.method8589(Static298.anInt6415 * 3);
			for (local146 = 0; local146 < Static298.anInt6415; local146++) {
				@Pc(546) Interface18 local546 = Static342.anInterface18Array2[local146];
				@Pc(555) long local555 = (local546.method4139() - Static51.aLong29) / 50L;
				if (local555 > 65535L) {
					local555 = 65535L;
				}
				Static51.aLong29 = local546.method4139();
				local144.aClass6_Sub40_Sub2_1.method8589(local546.method4141());
				local144.aClass6_Sub40_Sub2_1.method8561((int) local555);
			}
			Static263.method4681(local144);
		}
		if (Static614.anInt10100 > 0) {
			Static614.anInt10100--;
		}
		if (Static246.aBoolean346 && Static614.anInt10100 <= 0) {
			Static614.anInt10100 = 20;
			Static246.aBoolean346 = false;
			local144 = Static560.method8089(Static391.aClass126_1, Static10.aClass208_3);
			local144.aClass6_Sub40_Sub2_1.method8565((int) Static591.aFloat197 >> 3);
			local144.aClass6_Sub40_Sub2_1.method8565((int) Static284.aFloat164 >> 3);
			Static263.method4681(local144);
		}
		if (Static368.aBoolean450 != Static399.aBoolean503) {
			Static368.aBoolean450 = Static399.aBoolean503;
			local144 = Static560.method8089(Static391.aClass126_1, Static161.aClass208_30);
			local144.aClass6_Sub40_Sub2_1.method8589(Static399.aBoolean503 ? 1 : 0);
			Static263.method4681(local144);
		}
		if (!Static509.aBoolean584) {
			local144 = Static560.method8089(Static391.aClass126_1, Static54.aClass208_10);
			local144.aClass6_Sub40_Sub2_1.method8589(0);
			local146 = local144.aClass6_Sub40_Sub2_1.anInt10169;
			@Pc(690) Class6_Sub40 local690 = Static348.aClass6_Sub22_19.method3529();
			local144.aClass6_Sub40_Sub2_1.method8562(0, local690.aByteArray113, local690.anInt10169);
			local144.aClass6_Sub40_Sub2_1.method8605(local144.aClass6_Sub40_Sub2_1.anInt10169 - local146);
			Static263.method4681(local144);
			Static509.aBoolean584 = true;
		}
		if (Static272.aClass97ArrayArrayArray3 != null) {
			if (Static334.anInt6354 == 2) {
				Static372.method7364();
			} else if (Static334.anInt6354 == 3) {
				Static572.method8144();
			}
		}
		if (aBoolean457) {
			aBoolean457 = false;
		} else {
			Static48.aFloat15 /= 2.0F;
		}
		if (Static223.aBoolean310) {
			Static223.aBoolean310 = false;
		} else {
			Static495.aFloat180 /= 2.0F;
		}
		Static112.method1853();
		if (Static554.anInt1821 != 10) {
			return;
		}
		Static347.method5616();
		Static536.method7900();
		Static271.method4798();
		Static376.anInt6901++;
		if (Static376.anInt6901 > 750) {
			Static534.method7893();
			return;
		}
		Static175.method3221();
		Static441.method6827();
		Static430.method6726();
		for (local60 = Static279.aClass294_1.method7415(true); local60 != -1; local60 = Static279.aClass294_1.method7415(false)) {
			Static480.method7200(local60);
			Static618.anIntArray614[Static267.anInt5319++ & 0x1F] = local60;
		}
		@Pc(858) Class302 local858;
		for (@Pc(809) Class6_Sub2_Sub9 local809 = Static604.method8485(); local809 != null; local809 = Static604.method8485()) {
			local450 = local809.method3721();
			local169 = local809.method3725();
			if (local450 == 1) {
				Static522.anIntArray557[local169] = local809.anInt4294;
				Static318.aBoolean410 |= Static211.aBooleanArray25[local169];
				Static610.anIntArray612[Static188.anInt5447++ & 0x1F] = local169;
			} else if (local450 == 2) {
				Static101.aStringArray20[local169] = local809.aString49;
				Static27.anIntArray32[Static188.anInt5450++ & 0x1F] = local169;
			} else if (local450 == 3) {
				local858 = Static386.method4914(local169);
				if (!local809.aString49.equals(local858.aString105)) {
					local858.aString105 = local809.aString49;
					Static603.method8464(local858);
				}
			} else if (local450 == 4) {
				local858 = Static386.method4914(local169);
				local238 = local809.anInt4294;
				local245 = local809.anInt4291;
				local256 = local809.anInt4293;
				if (local238 != local858.anInt8823 || local858.anInt8871 != local245 || local858.anInt8789 != local256) {
					local858.anInt8823 = local238;
					local858.anInt8871 = local245;
					local858.anInt8789 = local256;
					Static603.method8464(local858);
				}
			} else if (local450 == 5) {
				local858 = Static386.method4914(local169);
				if (local858.anInt8798 != local809.anInt4294 || local809.anInt4294 == -1) {
					local858.anInt8785 = 1;
					local858.anInt8798 = local809.anInt4294;
					local858.anInt8836 = 0;
					local858.anInt8841 = 0;
					@Pc(1331) Class21 local1331 = local858.anInt8798 == -1 ? null : Static294.aClass373_2.method8738(local858.anInt8798);
					if (local1331 != null) {
						Static215.method3663(local1331, local858.anInt8841);
					}
					Static603.method8464(local858);
				}
			} else if (local450 == 6) {
				local187 = local809.anInt4294;
				local238 = local187 >> 10 & 0x1F;
				local245 = local187 >> 5 & 0x1F;
				local256 = local187 & 0x1F;
				@Pc(941) int local941 = (local238 << 19) + ((local245 << 11) + (local256 << 3));
				@Pc(945) Class302 local945 = Static386.method4914(local169);
				if (local945.anInt8827 != local941) {
					local945.anInt8827 = local941;
					Static603.method8464(local945);
				}
			} else if (local450 == 7) {
				local858 = Static386.method4914(local169);
				@Pc(974) boolean local974 = local809.anInt4294 == 1;
				if (local858.aBoolean601 != local974) {
					local858.aBoolean601 = local974;
					Static603.method8464(local858);
				}
			} else if (local450 == 8) {
				local858 = Static386.method4914(local169);
				if (local858.anInt8845 != local809.anInt4294 || local858.anInt8786 != local809.anInt4291 || local858.anInt8876 != local809.anInt4293) {
					local858.anInt8845 = local809.anInt4294;
					local858.anInt8786 = local809.anInt4291;
					local858.anInt8876 = local809.anInt4293;
					if (local858.anInt8877 != -1) {
						if (local858.anInt8863 > 0) {
							local858.anInt8876 = local858.anInt8876 * 32 / local858.anInt8863;
						} else if (local858.anInt8864 > 0) {
							local858.anInt8876 = local858.anInt8876 * 32 / local858.anInt8864;
						}
					}
					Static603.method8464(local858);
				}
			} else if (local450 == 9) {
				local858 = Static386.method4914(local169);
				if (local858.anInt8877 != local809.anInt4294 || local809.anInt4291 != local858.anInt8808) {
					local858.anInt8877 = local809.anInt4294;
					local858.anInt8808 = local809.anInt4291;
					Static603.method8464(local858);
				}
			} else if (local450 == 10) {
				local858 = Static386.method4914(local169);
				if (local809.anInt4294 != local858.anInt8872 || local858.anInt8842 != local809.anInt4291 || local858.anInt8788 != local809.anInt4293) {
					local858.anInt8842 = local809.anInt4291;
					local858.anInt8872 = local809.anInt4294;
					local858.anInt8788 = local809.anInt4293;
					Static603.method8464(local858);
				}
			} else if (local450 == 11) {
				local858 = Static386.method4914(local169);
				local858.anInt8854 = local858.anInt8853 = local809.anInt4291;
				local858.aByte104 = 0;
				local858.aByte105 = 0;
				local858.anInt8866 = local858.anInt8873 = local809.anInt4294;
				Static603.method8464(local858);
			} else if (local450 == 12) {
				local858 = Static386.method4914(local169);
				local238 = local809.anInt4294;
				if (local858 != null && local858.anInt8816 == 0) {
					if (local858.anInt8813 - local858.anInt8814 < local238) {
						local238 = local858.anInt8813 - local858.anInt8814;
					}
					if (local238 < 0) {
						local238 = 0;
					}
					if (local238 != local858.anInt8804) {
						local858.anInt8804 = local238;
						Static603.method8464(local858);
					}
				}
			} else if (local450 == 14) {
				local858 = Static386.method4914(local169);
				local858.anInt8848 = local809.anInt4294;
			} else if (local450 == 15) {
				Static106.anInt2100 = local809.anInt4294;
				Static51.anInt935 = local809.anInt4291;
				Static362.aBoolean439 = true;
			} else if (local450 == 16) {
				local858 = Static386.method4914(local169);
				local858.anInt8867 = local809.anInt4294;
			} else if (local450 == 17) {
				local858 = Static386.method4914(local169);
				local858.anInt8783 = local809.anInt4294;
			}
		}
		Static333.anInt9456++;
		if (Static630.anInt10329 != 0) {
			Static94.anInt1856 += 20;
			if (Static94.anInt1856 >= 400) {
				Static630.anInt10329 = 0;
			}
		}
		if (Static283.aClass302_41 != null) {
			Static606.anInt8656++;
			if (Static606.anInt8656 >= 15) {
				Static603.method8464(Static283.aClass302_41);
				Static283.aClass302_41 = null;
			}
		}
		Static176.aClass302_57 = null;
		Static66.aBoolean91 = false;
		Static94.aClass302_16 = null;
		Static479.aBoolean562 = false;
		Static165.method3050(-1, (Class302) null, -1);
		Static275.method4852(-1, (Class302) null, -1);
		if (!Static280.aBoolean380) {
			Static351.anInt6586 = -1;
		}
		Static624.method8686();
		Static320.anInt6118++;
		if (Static343.aBoolean427) {
			@Pc(1458) Class6_Sub9 local1458 = Static560.method8089(Static391.aClass126_1, Static110.aClass208_19);
			local1458.aClass6_Sub40_Sub2_1.method8557(Static497.anInt8609 << 14 | Static154.anInt2809 << 28 | Static175.anInt3639);
			Static263.method4681(local1458);
			Static343.aBoolean427 = false;
		}
		while (true) {
			@Pc(1481) Class6_Sub10 local1481;
			@Pc(1486) Class302 local1486;
			do {
				local1481 = (Class6_Sub10) Static97.aClass8_10.method152();
				if (local1481 == null) {
					while (true) {
						do {
							local1481 = (Class6_Sub10) Static369.aClass8_40.method152();
							if (local1481 == null) {
								while (true) {
									do {
										local1481 = (Class6_Sub10) Static218.aClass8_26.method152();
										if (local1481 == null) {
											if (Static176.aClass302_57 == null) {
												Static614.anInt10101 = 0;
											}
											if (Static478.aClass302_56 != null) {
												Static562.method8099();
											}
											if (Static578.anInt6641 > 0 && Static647.aClass251_1.method6712(82) && Static647.aClass251_1.method6712(81) && Static3.anInt51 != 0) {
												local450 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 - Static3.anInt51;
												if (local450 < 0) {
													local450 = 0;
												} else if (local450 > 3) {
													local450 = 3;
												}
												Static372.method7366(local450, Static195.anInt3961 + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray336[0], Static606.anInt8651 - -Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray335[0]);
											}
											Static529.method7848();
											for (local450 = 0; local450 < 5; local450++) {
												@Pc(1678) int local1678 = Static186.anIntArray229[local450]++;
											}
											if (Static318.aBoolean410 && Static32.method595() - 60000L > Static603.aLong264) {
												Static238.method4143();
											}
											for (@Pc(1707) Class20_Sub6_Sub2 local1707 = (Class20_Sub6_Sub2) Static131.aClass81_3.method2118(); local1707 != null; local1707 = (Class20_Sub6_Sub2) Static131.aClass81_3.method2128()) {
												if (Static32.method595() / 1000L - 5L > (long) local1707.anInt6133) {
													if (local1707.aShort69 > 0) {
														Static145.method2337(0, "", local1707.aString79 + Static317.aClass192_19.method5299(Static307.anInt5931), 5, "", "");
													}
													if (local1707.aShort69 == 0) {
														Static145.method2337(0, "", local1707.aString79 + Static317.aClass192_20.method5299(Static307.anInt5931), 5, "", "");
													}
													local1707.method9004();
												}
											}
											Static172.anInt3564++;
											if (Static172.anInt3564 > 500) {
												Static172.anInt3564 = 0;
												local187 = (int) (Math.random() * 8.0D);
												if ((local187 & 0x4) == 4) {
													Static27.anInt551 += Static347.anInt6540;
												}
												if ((local187 & 0x1) == 1) {
													Static107.anInt2107 += Static7.anInt138;
												}
												if ((local187 & 0x2) == 2) {
													Static526.anInt9147 += Static171.anInt3561;
												}
											}
											if (Static107.anInt2107 < -50) {
												Static7.anInt138 = 2;
											}
											if (Static526.anInt9147 < -55) {
												Static171.anInt3561 = 2;
											}
											if (Static107.anInt2107 > 50) {
												Static7.anInt138 = -2;
											}
											if (Static27.anInt551 < -40) {
												Static347.anInt6540 = 1;
											}
											if (Static526.anInt9147 > 55) {
												Static171.anInt3561 = -2;
											}
											Static137.anInt2609++;
											if (Static27.anInt551 > 40) {
												Static347.anInt6540 = -1;
											}
											if (Static137.anInt2609 > 500) {
												Static137.anInt2609 = 0;
												local187 = (int) (Math.random() * 8.0D);
												if ((local187 & 0x1) == 1) {
													Static298.anInt6417 += Static240.anInt4802;
												}
												if ((local187 & 0x2) == 2) {
													Static620.anInt10702 += Static413.anInt7544;
												}
											}
											if (Static298.anInt6417 < -60) {
												Static240.anInt4802 = 2;
											}
											if (Static298.anInt6417 > 60) {
												Static240.anInt4802 = -2;
											}
											if (Static620.anInt10702 < -20) {
												Static413.anInt7544 = 1;
											}
											if (Static620.anInt10702 > 10) {
												Static413.anInt7544 = -1;
											}
											Static475.anInt8297++;
											if (Static475.anInt8297 > 50) {
												@Pc(1931) Class6_Sub9 local1931 = Static560.method8089(Static391.aClass126_1, Static538.aClass208_81);
												Static263.method4681(local1931);
											}
											if (Static433.aBoolean525) {
												Static525.method7810();
												Static433.aBoolean525 = false;
											}
											try {
												Static265.method3201();
												return;
											} catch (@Pc(1944) IOException local1944) {
												Static534.method7893();
												return;
											}
										}
										local1486 = local1481.aClass302_14;
										if (local1486.anInt8834 < 0) {
											break;
										}
										local858 = Static386.method4914(local1486.anInt8806);
									} while (local858 == null || local858.aClass302Array2 == null || local1486.anInt8834 >= local858.aClass302Array2.length || local858.aClass302Array2[local1486.anInt8834] != local1486);
									Static244.method4193(local1481);
								}
							}
							local1486 = local1481.aClass302_14;
							if (local1486.anInt8834 < 0) {
								break;
							}
							local858 = Static386.method4914(local1486.anInt8806);
						} while (local858 == null || local858.aClass302Array2 == null || local1486.anInt8834 >= local858.aClass302Array2.length || local858.aClass302Array2[local1486.anInt8834] != local1486);
						Static244.method4193(local1481);
					}
				}
				local1486 = local1481.aClass302_14;
				if (local1486.anInt8834 < 0) {
					break;
				}
				local858 = Static386.method4914(local1486.anInt8806);
			} while (local858 == null || local858.aClass302Array2 == null || local858.aClass302Array2.length <= local1486.anInt8834 || local858.aClass302Array2[local1486.anInt8834] != local1486);
			Static244.method4193(local1481);
		}
	}
}
