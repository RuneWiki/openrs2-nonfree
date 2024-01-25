import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_16 = new Class45("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray7 = new int[2][][];

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	public static int anInt752 = 0;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method784() {
		if (Static396.anInt6970 > 1) {
			Static448.anInt7840 = Static209.anInt4108;
			Static396.anInt6970--;
		}
		if (Static107.aBoolean189) {
			Static107.aBoolean189 = false;
			Static365.method5914();
			return;
		}
		if (!Static238.aBoolean354) {
			Static130.method7388();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static467.method7127(); local27++) {
		}
		if (Static186.anInt3863 != 9) {
			return;
		}
		Static307.method5377(Static67.aClass252_33.method6571(), Static259.aClass1_Sub17_Sub2_1);
		if (Static125.aClass1_Sub16_1 == null) {
			if (Static434.aLong207 <= Static110.method2222()) {
				Static125.aClass1_Sub16_1 = Static288.aClass168_1.method4636(Class216.lb.aString150);
			}
		} else if (Static125.aClass1_Sub16_1.anInt2994 != -1) {
			Static216.method3997(Static388.aClass252_99);
			Static259.aClass1_Sub17_Sub2_1.method4473(Static125.aClass1_Sub16_1.anInt2994);
			Static125.aClass1_Sub16_1 = null;
			Static434.aLong207 = Static110.method2222() + 30000L;
		}
		@Pc(92) Class1_Sub32 local92 = (Class1_Sub32) Static77.aClass295_9.method7543();
		@Pc(133) int local133;
		@Pc(153) int local153;
		@Pc(204) int local204;
		@Pc(211) int local211;
		@Pc(223) int local223;
		if (local92 != null || Static175.aLong86 < Static110.method2222() - 2000L) {
			@Pc(107) boolean local107 = false;
			@Pc(110) int local110 = Static259.aClass1_Sub17_Sub2_1.anInt4872;
			for (@Pc(115) Class1_Sub32 local115 = (Class1_Sub32) Static479.aClass295_59.method7543(); local115 != null && Static259.aClass1_Sub17_Sub2_1.anInt4872 - local110 < 240; local115 = (Class1_Sub32) Static479.aClass295_59.method7540()) {
				local115.method8239();
				local133 = local115.method5774();
				if (local133 < -1) {
					local133 = -1;
				} else if (local133 > 65534) {
					local133 = 65534;
				}
				local153 = local115.method5772();
				if (local153 < -1) {
					local153 = -1;
				} else if (local153 > 65534) {
					local153 = 65534;
				}
				if (Static460.anInt7967 != local153 || local133 != Static249.anInt4795) {
					if (!local107) {
						Static216.method3997(Static6.aClass252_2);
						Static259.aClass1_Sub17_Sub2_1.method4451(0);
						local110 = Static259.aClass1_Sub17_Sub2_1.anInt4872;
						local107 = true;
					}
					local204 = local153 - Static460.anInt7967;
					Static460.anInt7967 = local153;
					local211 = local133 - Static249.anInt4795;
					Static249.anInt4795 = local133;
					local223 = (int) ((local115.method5778() - Static175.aLong86) / 20L);
					if (local223 < 8 && local204 >= -32 && local204 <= 31 && local211 >= -32 && local211 <= 31) {
						local211 += 32;
						local204 += 32;
						Static259.aClass1_Sub17_Sub2_1.method4473(local211 + (local223 << 12) + (local204 << 6));
					} else if (local223 < 32 && local204 >= -128 && local204 <= 127 && local211 >= -128 && local211 <= 127) {
						local204 += 128;
						local211 += 128;
						Static259.aClass1_Sub17_Sub2_1.method4451(local223 + 128);
						Static259.aClass1_Sub17_Sub2_1.method4473((local204 << 8) + local211);
					} else if (local223 >= 32) {
						Static259.aClass1_Sub17_Sub2_1.method4473(local223 + 57344);
						if (local153 == 1 || local133 == -1) {
							Static259.aClass1_Sub17_Sub2_1.method4489(Integer.MIN_VALUE);
						} else {
							Static259.aClass1_Sub17_Sub2_1.method4489(local153 | local133 << 16);
						}
					} else {
						Static259.aClass1_Sub17_Sub2_1.method4451(local223 + 192);
						if (local153 == 1 || local133 == -1) {
							Static259.aClass1_Sub17_Sub2_1.method4489(Integer.MIN_VALUE);
						} else {
							Static259.aClass1_Sub17_Sub2_1.method4489(local133 << 16 | local153);
						}
					}
					Static175.aLong86 = local115.method5778();
				}
			}
			if (local107) {
				Static259.aClass1_Sub17_Sub2_1.method4441(Static259.aClass1_Sub17_Sub2_1.anInt4872 - local110);
			}
		}
		@Pc(413) int local413;
		if (local92 != null) {
			@Pc(397) long local397 = (local92.method5778() - Static519.aLong53) / 50L;
			if (local397 > 32767L) {
				local397 = 32767L;
			}
			Static519.aLong53 = local92.method5778();
			local413 = local92.method5774();
			if (local413 < 0) {
				local413 = 0;
			} else if (local413 > 65535) {
				local413 = 65535;
			}
			local133 = local92.method5772();
			if (local133 < 0) {
				local133 = 0;
			} else if (local133 > 65535) {
				local133 = 65535;
			}
			@Pc(448) byte local448 = 0;
			if (local92.method5776() == 2) {
				local448 = 1;
			}
			local204 = (int) local397;
			Static216.method3997(Static232.aClass252_65);
			Static259.aClass1_Sub17_Sub2_1.method4506(local448 << 15 | local204);
			Static259.aClass1_Sub17_Sub2_1.method4488(local133 | local413 << 16);
		}
		@Pc(502) int local502;
		if (Static543.anInt9602 > 0) {
			Static216.method3997(Static66.aClass252_30);
			Static259.aClass1_Sub17_Sub2_1.method4451(Static543.anInt9602 * 3);
			for (local502 = 0; local502 < Static543.anInt9602; local502++) {
				@Pc(508) Interface18 local508 = Static111.anInterface18Array1[local502];
				@Pc(516) long local516 = (local508.method3595() - Static190.aLong99) / 50L;
				if (local516 > 65535L) {
					local516 = 65535L;
				}
				Static190.aLong99 = local508.method3595();
				Static259.aClass1_Sub17_Sub2_1.method4451(local508.method3596());
				Static259.aClass1_Sub17_Sub2_1.method4473((int) local516);
			}
		}
		if (Static230.anInt4469 > 0) {
			Static230.anInt4469--;
		}
		if (Static506.aBoolean670 && Static230.anInt4469 <= 0) {
			Static230.anInt4469 = 20;
			Static506.aBoolean670 = false;
			Static216.method3997(Static263.aClass252_76);
			Static259.aClass1_Sub17_Sub2_1.method4459((int) Static49.aFloat29 >> 3);
			Static259.aClass1_Sub17_Sub2_1.method4473((int) Static135.aFloat193 >> 3);
		}
		if (Static87.aBoolean160 && !Static148.aBoolean252) {
			Static148.aBoolean252 = true;
			Static216.method3997(Static256.aClass252_74);
			Static259.aClass1_Sub17_Sub2_1.method4451(1);
		}
		if (!Static87.aBoolean160 && Static148.aBoolean252) {
			Static148.aBoolean252 = false;
			Static216.method3997(Static256.aClass252_74);
			Static259.aClass1_Sub17_Sub2_1.method4451(0);
		}
		if (!Static473.aBoolean625) {
			Static216.method3997(Static48.aClass252_21);
			Static259.aClass1_Sub17_Sub2_1.method4451(0);
			local502 = Static259.aClass1_Sub17_Sub2_1.anInt4872;
			@Pc(664) Class1_Sub17 local664 = new Class1_Sub17(Static61.method1525());
			Static286.aClass1_Sub15_Sub1_1.method6359(local664);
			Static259.aClass1_Sub17_Sub2_1.method4454(local664.anInt4872, local664.aByteArray58);
			Static259.aClass1_Sub17_Sub2_1.method4441(Static259.aClass1_Sub17_Sub2_1.anInt4872 - local502);
			Static473.aBoolean625 = true;
		}
		if (Static263.aClass64ArrayArrayArray3 != null) {
			if (Static170.anInt3418 == 2) {
				Static81.method1809();
			} else if (Static170.anInt3418 == 3) {
				Static180.method3529();
			}
		}
		if (Static458.aBoolean588) {
			Static458.aBoolean588 = false;
		} else {
			Static349.aFloat136 /= 2.0F;
		}
		if (Static87.aBoolean161) {
			Static87.aBoolean161 = false;
		} else {
			Static360.aFloat140 /= 2.0F;
		}
		Static158.method2882();
		if (Static186.anInt3863 != 9) {
			return;
		}
		Static435.method6758();
		Static244.method4330();
		Static425.method6635();
		Static329.method5607();
		Static508.anInt8899++;
		if (Static508.anInt8899 > 750) {
			Static365.method5914();
			return;
		}
		Static388.method6201();
		Static241.method4290();
		Static175.method3242();
		for (local502 = Static417.aClass10_1.method528(true); local502 != -1; local502 = Static417.aClass10_1.method528(false)) {
			Static492.method7559(local502);
			Static321.anIntArray479[Static460.anInt7964++ & 0x1F] = local502;
		}
		@Pc(835) Class91 local835;
		for (@Pc(785) Class1_Sub2_Sub16 local785 = Static82.method1817(); local785 != null; local785 = Static82.method1817()) {
			local413 = local785.method6699();
			local133 = local785.method6698();
			if (local413 == 1) {
				Static540.anIntArray837[local133] = local785.anInt7487;
				Static502.aBoolean668 |= Static137.aBooleanArray4[local133];
				Static389.anIntArray672[Static421.anInt7329++ & 0x1F] = local133;
			} else if (local413 == 2) {
				Static83.aStringArray36[local133] = local785.aString185;
				Static117.anIntArray182[Static232.anInt4496++ & 0x1F] = local133;
			} else if (local413 == 3) {
				local835 = Static384.method6156(local133);
				if (!local785.aString185.equals(local835.aString51)) {
					local835.aString51 = local785.aString185;
					Static243.method4316(local835);
				}
			} else if (local413 == 4) {
				local835 = Static384.method6156(local133);
				local204 = local785.anInt7487;
				local211 = local785.anInt7482;
				local223 = local785.anInt7491;
				if (local835.anInt2405 != local204 || local835.anInt2401 != local211 || local835.anInt2455 != local223) {
					local835.anInt2405 = local204;
					local835.anInt2455 = local223;
					local835.anInt2401 = local211;
					Static243.method4316(local835);
				}
			} else if (local413 == 5) {
				local835 = Static384.method6156(local133);
				if (local785.anInt7487 != local835.anInt2424 || local785.anInt7487 == -1) {
					local835.anInt2369 = 0;
					local835.anInt2393 = 0;
					local835.anInt2424 = local785.anInt7487;
					local835.anInt2381 = 1;
					Static243.method4316(local835);
				}
			} else if (local413 == 6) {
				local153 = local785.anInt7487;
				local204 = local153 >> 10 & 0x1F;
				local211 = local153 >> 5 & 0x1F;
				local223 = local153 & 0x1F;
				@Pc(1284) int local1284 = (local223 << 3) + (local211 << 11) + (local204 << 19);
				@Pc(1288) Class91 local1288 = Static384.method6156(local133);
				if (local1284 != local1288.anInt2394) {
					local1288.anInt2394 = local1284;
					Static243.method4316(local1288);
				}
			} else if (local413 == 7) {
				local835 = Static384.method6156(local133);
				@Pc(954) boolean local954 = local785.anInt7487 == 1;
				if (local954 != local835.aBoolean201) {
					local835.aBoolean201 = local954;
					Static243.method4316(local835);
				}
			} else if (local413 == 8) {
				local835 = Static384.method6156(local133);
				if (local835.anInt2448 != local785.anInt7487 || local785.anInt7482 != local835.anInt2366 || local835.anInt2426 != local785.anInt7491) {
					local835.anInt2426 = local785.anInt7491;
					local835.anInt2366 = local785.anInt7482;
					local835.anInt2448 = local785.anInt7487;
					if (local835.anInt2391 != -1) {
						if (local835.anInt2416 > 0) {
							local835.anInt2426 = local835.anInt2426 * 32 / local835.anInt2416;
						} else if (local835.anInt2400 > 0) {
							local835.anInt2426 = local835.anInt2426 * 32 / local835.anInt2400;
						}
					}
					Static243.method4316(local835);
				}
			} else if (local413 == 9) {
				local835 = Static384.method6156(local133);
				if (local835.anInt2391 != local785.anInt7487 || local835.anInt2434 != local785.anInt7482) {
					local835.anInt2434 = local785.anInt7482;
					local835.anInt2391 = local785.anInt7487;
					Static243.method4316(local835);
				}
			} else if (local413 == 10) {
				local835 = Static384.method6156(local133);
				if (local785.anInt7487 != local835.anInt2412 || local835.anInt2380 != local785.anInt7482 || local835.anInt2430 != local785.anInt7491) {
					local835.anInt2412 = local785.anInt7487;
					local835.anInt2430 = local785.anInt7491;
					local835.anInt2380 = local785.anInt7482;
					Static243.method4316(local835);
				}
			} else if (local413 == 11) {
				local835 = Static384.method6156(local133);
				local835.aByte41 = 0;
				local835.anInt2423 = local835.anInt2386 = local785.anInt7487;
				local835.aByte38 = 0;
				local835.anInt2409 = local835.anInt2372 = local785.anInt7482;
				Static243.method4316(local835);
			} else if (local413 == 12) {
				local835 = Static384.method6156(local133);
				local204 = local785.anInt7487;
				if (local835 != null && local835.anInt2452 == 0) {
					if (local204 > local835.anInt2444 - local835.anInt2378) {
						local204 = local835.anInt2444 - local835.anInt2378;
					}
					if (local204 < 0) {
						local204 = 0;
					}
					if (local204 != local835.anInt2406) {
						local835.anInt2406 = local204;
						Static243.method4316(local835);
					}
				}
			} else if (local413 == 14) {
				local835 = Static384.method6156(local133);
				local835.anInt2382 = local785.anInt7487;
			} else if (local413 == 15) {
				Static259.anInt5037 = local785.anInt7482;
				Static52.anInt4659 = local785.anInt7487;
				Static50.aBoolean106 = true;
			} else if (local413 == 16) {
				local835 = Static384.method6156(local133);
				local835.anInt2443 = local785.anInt7487;
			}
		}
		if (Static296.anInt7159 != 0) {
			Static417.anInt7303 += 20;
			if (Static417.anInt7303 >= 400) {
				Static296.anInt7159 = 0;
			}
		}
		Static242.anInt4651++;
		if (Static237.aClass91_8 != null) {
			Static36.anInt1096++;
			if (Static36.anInt1096 >= 15) {
				Static243.method4316(Static237.aClass91_8);
				Static237.aClass91_8 = null;
			}
		}
		Static518.aBoolean686 = false;
		Static276.aBoolean647 = false;
		Static467.aClass91_15 = null;
		Static267.aClass91_9 = null;
		Static290.method5099(-1, -1, null);
		Static329.method5611(null, -1, -1);
		if (!Static181.aBoolean310) {
			Static245.anInt4711 = -1;
		}
		Static285.method5034();
		Static209.anInt4108++;
		if (Static418.aBoolean499) {
			Static216.method3997(Static455.aClass252_121);
			Static259.aClass1_Sub17_Sub2_1.method4489(Static375.anInt8461 << 28 | Static338.anInt3837 << 14 | Static76.anInt1814);
			Static418.aBoolean499 = false;
		}
		while (true) {
			@Pc(1416) Class1_Sub10 local1416;
			@Pc(1421) Class91 local1421;
			do {
				local1416 = (Class1_Sub10) Static434.aClass295_47.method7547();
				if (local1416 == null) {
					while (true) {
						do {
							local1416 = (Class1_Sub10) Static500.aClass295_60.method7547();
							if (local1416 == null) {
								while (true) {
									do {
										local1416 = (Class1_Sub10) Static282.aClass295_21.method7547();
										if (local1416 == null) {
											if (Static267.aClass91_9 == null) {
												Static462.anInt7983 = 0;
											}
											if (Static360.aClass91_10 != null) {
												Static137.method2606();
											}
											if (Static378.anInt6739 > 0 && Static25.aClass241_1.method6303(82) && Static25.aClass241_1.method6303(81) && Static372.anInt6690 != 0) {
												local413 = Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 - Static372.anInt6690;
												if (local413 < 0) {
													local413 = 0;
												} else if (local413 > 3) {
													local413 = 3;
												}
												Static89.method1899(Static538.anInt9485 + Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray780[0], local413, Static282.anInt5380 + Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray781[0]);
											}
											Static179.method3510();
											for (local413 = 0; local413 < 5; local413++) {
												@Pc(1616) int local1616 = Static62.anIntArray100[local413]++;
											}
											if (Static502.aBoolean668 && Static110.method2222() - 60000L > Static257.aLong129) {
												Static141.method2640();
											}
											for (@Pc(1645) Class46_Sub3_Sub2 local1645 = (Class46_Sub3_Sub2) Static162.aClass184_10.method5138(); local1645 != null; local1645 = (Class46_Sub3_Sub2) Static162.aClass184_10.method5145()) {
												if (Static110.method2222() / 1000L - 5L > (long) local1645.anInt9560) {
													if (local1645.aShort128 > 0) {
														Static229.method4129(local1645.aString216 + Static313.aClass45_91.method1474(Static544.anInt7853), 5, "", 0, "");
													}
													if (local1645.aShort128 == 0) {
														Static229.method4129(local1645.aString216 + Static482.aClass45_125.method1474(Static544.anInt7853), 5, "", 0, "");
													}
													local1645.method8227();
												}
											}
											Static348.anInt6352++;
											if (Static348.anInt6352 > 500) {
												Static348.anInt6352 = 0;
												local153 = (int) (Math.random() * 8.0D);
												if ((local153 & 0x2) == 2) {
													Static109.anInt2299 += Static48.anInt1270;
												}
												if ((local153 & 0x1) == 1) {
													Static513.anInt9088 += Static286.anInt5501;
												}
												if ((local153 & 0x4) == 4) {
													Static379.anInt7382 += Static293.anInt8972;
												}
											}
											if (Static513.anInt9088 < -50) {
												Static286.anInt5501 = 2;
											}
											if (Static513.anInt9088 > 50) {
												Static286.anInt5501 = -2;
											}
											if (Static109.anInt2299 < -55) {
												Static48.anInt1270 = 2;
											}
											if (Static379.anInt7382 < -40) {
												Static293.anInt8972 = 1;
											}
											if (Static109.anInt2299 > 55) {
												Static48.anInt1270 = -2;
											}
											Static456.anInt7940++;
											if (Static379.anInt7382 > 40) {
												Static293.anInt8972 = -1;
											}
											if (Static456.anInt7940 > 500) {
												Static456.anInt7940 = 0;
												local153 = (int) (Math.random() * 8.0D);
												if ((local153 & 0x2) == 2) {
													Static220.anInt4325 += Static3.anInt46;
												}
												if ((local153 & 0x1) == 1) {
													Static445.anInt7798 += Static490.anInt8618;
												}
											}
											if (Static445.anInt7798 < -60) {
												Static490.anInt8618 = 2;
											}
											if (Static445.anInt7798 > 60) {
												Static490.anInt8618 = -2;
											}
											if (Static220.anInt4325 < -20) {
												Static3.anInt46 = 1;
											}
											if (Static220.anInt4325 > 10) {
												Static3.anInt46 = -1;
											}
											Static201.anInt4048++;
											if (Static201.anInt4048 > 50) {
												Static216.method3997(Static384.aClass252_97);
											}
											if (Static523.aBoolean690) {
												Static5.method368();
												Static523.aBoolean690 = false;
											}
											try {
												if (Static200.aClass134_2 != null && Static259.aClass1_Sub17_Sub2_1.anInt4872 > 0) {
													Static427.anInt7428 += Static259.aClass1_Sub17_Sub2_1.anInt4872;
													Static200.aClass134_2.method8117(Static259.aClass1_Sub17_Sub2_1.aByteArray58, Static259.aClass1_Sub17_Sub2_1.anInt4872);
													Static201.anInt4048 = 0;
													Static259.aClass1_Sub17_Sub2_1.anInt4872 = 0;
													return;
												}
												return;
											} catch (@Pc(1905) IOException local1905) {
												Static365.method5914();
												return;
											}
										}
										local1421 = local1416.aClass91_2;
										if (local1421.anInt2395 < 0) {
											break;
										}
										local835 = Static384.method6156(local1421.anInt2375);
									} while (local835 == null || local835.lb == null || local835.lb.length <= local1421.anInt2395 || local835.lb[local1421.anInt2395] != local1421);
									Static173.method3207(local1416);
								}
							}
							local1421 = local1416.aClass91_2;
							if (local1421.anInt2395 < 0) {
								break;
							}
							local835 = Static384.method6156(local1421.anInt2375);
						} while (local835 == null || local835.lb == null || local1421.anInt2395 >= local835.lb.length || local1421 != local835.lb[local1421.anInt2395]);
						Static173.method3207(local1416);
					}
				}
				local1421 = local1416.aClass91_2;
				if (local1421.anInt2395 < 0) {
					break;
				}
				local835 = Static384.method6156(local1421.anInt2375);
			} while (local835 == null || local835.lb == null || local835.lb.length <= local1421.anInt2395 || local835.lb[local1421.anInt2395] != local1421);
			Static173.method3207(local1416);
		}
	}
}
