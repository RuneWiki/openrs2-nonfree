import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_219 = new Class296(49, 4);

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Z")
	public static boolean aBoolean359 = false;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V")
	public static void method4394() {
		if (Static531.anInt8934 > 1) {
			Static51.anInt1019 = Static164.anInt2967;
			Static531.anInt8934--;
		}
		if (Static229.aBoolean316) {
			Static229.aBoolean316 = false;
			Static214.method1853();
			return;
		}
		if (!Static15.aBoolean16) {
			Static324.method5028();
		}
		for (@Pc(34) int local34 = 0; local34 < 100 && Static283.method4573(); local34++) {
		}
		if (Static268.anInt5100 != 9) {
			return;
		}
		Static514.method7109(Static169.aClass296_154.method6960(), Static455.aClass1_Sub6_Sub2_2);
		if (Static38.aClass1_Sub44_1 == null) {
			if (Static60.method1119() >= Static211.aLong173) {
				Static38.aClass1_Sub44_1 = Static523.aClass7_1.method371(Static52.aClass4_1.aString2);
			}
		} else if (Static38.aClass1_Sub44_1.anInt7961 != -1) {
			Static144.method2331(Static42.aClass296_48);
			Static455.aClass1_Sub6_Sub2_2.method3919(Static38.aClass1_Sub44_1.anInt7961);
			Static38.aClass1_Sub44_1 = null;
			Static211.aLong173 = Static60.method1119() + 30000L;
		}
		@Pc(96) Class1_Sub13 local96 = (Class1_Sub13) Static22.aClass37_50.method977();
		@Pc(130) int local130;
		@Pc(146) int local146;
		@Pc(194) int local194;
		@Pc(200) int local200;
		@Pc(211) int local211;
		if (local96 != null || Static60.method1119() - 2000L > Static175.aLong144) {
			@Pc(107) boolean local107 = false;
			@Pc(110) int local110 = Static455.aClass1_Sub6_Sub2_2.anInt4555;
			for (@Pc(115) Class1_Sub13 local115 = (Class1_Sub13) Static210.aClass37_44.method977(); local115 != null && Static455.aClass1_Sub6_Sub2_2.anInt4555 - local110 < 240; local115 = (Class1_Sub13) Static210.aClass37_44.method971()) {
				local115.method7525();
				local130 = local115.method5742();
				if (local130 < -1) {
					local130 = -1;
				} else if (local130 > 65534) {
					local130 = 65534;
				}
				local146 = local115.method5737();
				if (local146 < -1) {
					local146 = -1;
				} else if (local146 > 65534) {
					local146 = 65534;
				}
				if (Static340.anInt6094 != local146 || Static403.anInt7244 != local130) {
					if (!local107) {
						Static144.method2331(Static282.aClass296_331);
						Static455.aClass1_Sub6_Sub2_2.method3937(0);
						local110 = Static455.aClass1_Sub6_Sub2_2.anInt4555;
						local107 = true;
					}
					local194 = local146 - Static340.anInt6094;
					Static340.anInt6094 = local146;
					local200 = local130 - Static403.anInt7244;
					Static403.anInt7244 = local130;
					local211 = (int) ((local115.method5741() - Static175.aLong144) / 20L);
					if (local211 < 8 && local194 >= -32 && local194 <= 31 && local200 >= -32 && local200 <= 31) {
						local194 += 32;
						local200 += 32;
						Static455.aClass1_Sub6_Sub2_2.method3919((local211 << 12) + (local194 << 6) + local200);
					} else if (local211 < 32 && local194 >= -128 && local194 <= 127 && local200 >= -128 && local200 <= 127) {
						local194 += 128;
						local200 += 128;
						Static455.aClass1_Sub6_Sub2_2.method3937(local211 + 128);
						Static455.aClass1_Sub6_Sub2_2.method3919((local194 << 8) + local200);
					} else if (local211 < 32) {
						Static455.aClass1_Sub6_Sub2_2.method3937(local211 + 192);
						if (local146 == 1 || local130 == -1) {
							Static455.aClass1_Sub6_Sub2_2.method3948(Integer.MIN_VALUE);
						} else {
							Static455.aClass1_Sub6_Sub2_2.method3948(local130 << 16 | local146);
						}
					} else {
						Static455.aClass1_Sub6_Sub2_2.method3919(local211 + 57344);
						if (local146 == 1 || local130 == -1) {
							Static455.aClass1_Sub6_Sub2_2.method3948(Integer.MIN_VALUE);
						} else {
							Static455.aClass1_Sub6_Sub2_2.method3948(local130 << 16 | local146);
						}
					}
					Static175.aLong144 = local115.method5741();
				}
			}
			if (local107) {
				Static455.aClass1_Sub6_Sub2_2.method3961(Static455.aClass1_Sub6_Sub2_2.anInt4555 - local110);
			}
		}
		@Pc(396) int local396;
		if (local96 != null) {
			@Pc(380) long local380 = (local96.method5741() - Static13.aLong20) / 50L;
			Static13.aLong20 = local96.method5741();
			if (local380 > 32767L) {
				local380 = 32767L;
			}
			local396 = local96.method5742();
			if (local396 < 0) {
				local396 = 0;
			} else if (local396 > 65535) {
				local396 = 65535;
			}
			local130 = local96.method5737();
			if (local130 < 0) {
				local130 = 0;
			} else if (local130 > 65535) {
				local130 = 65535;
			}
			@Pc(427) byte local427 = 0;
			if (local96.method5739() == 2) {
				local427 = 1;
			}
			Static144.method2331(Static537.aClass296_384);
			local194 = (int) local380;
			Static455.aClass1_Sub6_Sub2_2.method3919(local194 | local427 << 15);
			Static455.aClass1_Sub6_Sub2_2.method3948(local396 << 16 | local130);
		}
		@Pc(482) int local482;
		if (Static473.anInt7951 > 0) {
			Static144.method2331(Static505.aClass296_363);
			Static455.aClass1_Sub6_Sub2_2.method3937(Static473.anInt7951 * 3);
			for (local482 = 0; local482 < Static473.anInt7951; local482++) {
				@Pc(488) Interface12 local488 = Static211.anInterface12Array2[local482];
				@Pc(497) long local497 = (local488.method7434() - Static495.aLong393) / 50L;
				if (local497 > 65535L) {
					local497 = 65535L;
				}
				Static495.aLong393 = local488.method7434();
				Static455.aClass1_Sub6_Sub2_2.method3937(local488.method7437());
				Static455.aClass1_Sub6_Sub2_2.method3919((int) local497);
			}
		}
		if (Static536.anInt9052 > 0) {
			Static536.anInt9052--;
		}
		if (Static282.aBoolean555 && Static536.anInt9052 <= 0) {
			Static536.anInt9052 = 20;
			Static282.aBoolean555 = false;
			Static144.method2331(Static277.aClass296_224);
			Static455.aClass1_Sub6_Sub2_2.method3959((int) Static404.aFloat156 >> 3);
			Static455.aClass1_Sub6_Sub2_2.method3959((int) Static50.aFloat13 >> 3);
		}
		if (Static297.aBoolean404 && !Static390.aBoolean422) {
			Static390.aBoolean422 = true;
			Static144.method2331(Static260.aClass296_216);
			Static455.aClass1_Sub6_Sub2_2.method3937(1);
		}
		if (!Static297.aBoolean404 && Static390.aBoolean422) {
			Static390.aBoolean422 = false;
			Static144.method2331(Static260.aClass296_216);
			Static455.aClass1_Sub6_Sub2_2.method3937(0);
		}
		if (!Static375.aBoolean499) {
			Static144.method2331(Static448.aClass296_330);
			Static455.aClass1_Sub6_Sub2_2.method3937(0);
			local482 = Static455.aClass1_Sub6_Sub2_2.anInt4555;
			@Pc(628) Class1_Sub6 local628 = new Class1_Sub6(Static23.method7118());
			Static544.aClass1_Sub22_Sub1_1.method4653(local628);
			Static455.aClass1_Sub6_Sub2_2.method3940(local628.aByteArray66, local628.anInt4555);
			Static455.aClass1_Sub6_Sub2_2.method3961(Static455.aClass1_Sub6_Sub2_2.anInt4555 - local482);
			Static375.aBoolean499 = true;
		}
		if (Static242.aClass255ArrayArrayArray2 != null) {
			if (Static448.anInt7701 == 2) {
				Static322.method4997();
			} else if (Static448.anInt7701 == 3) {
				Static408.method6071();
			}
		}
		if (Static254.aBoolean350) {
			Static254.aBoolean350 = false;
		} else {
			Static71.aFloat15 /= 2.0F;
		}
		if (aBoolean359) {
			aBoolean359 = false;
		} else {
			Static285.aFloat109 /= 2.0F;
		}
		Static287.method4638();
		if (Static268.anInt5100 != 9) {
			return;
		}
		Static532.method7369();
		Static537.method7446();
		Static115.method1967();
		Static529.method7334();
		Static36.anInt791++;
		if (Static36.anInt791 > 750) {
			Static214.method1853();
			return;
		}
		Static536.method7439();
		Static39.method887();
		Static526.method7299();
		for (local482 = Static251.aClass119_1.method2648(true); local482 != -1; local482 = Static251.aClass119_1.method2648(false)) {
			Static230.method1104(local482);
			Static400.anIntArray694[Static7.anInt161++ & 0x1F] = local482;
		}
		@Pc(778) Class156 local778;
		for (@Pc(751) Class1_Sub1_Sub11 local751 = Static285.method4615(); local751 != null; local751 = Static285.method4615()) {
			local396 = local751.method4940();
			local130 = local751.method4941();
			if (local396 == 1) {
				Static42.anIntArray119[local130] = local751.anInt5822;
				Static47.aBoolean51 |= Static303.aBooleanArray39[local130];
				Static84.anIntArray174[Static74.anInt1365++ & 0x1F] = local130;
			} else if (local396 == 2) {
				Static221.aStringArray23[local130] = local751.aString54;
				Static148.anIntArray689[Static365.anInt6469++ & 0x1F] = local130;
			} else if (local396 == 3) {
				local778 = Static182.method2888(local130);
				if (!local751.aString54.equals(local778.aString42)) {
					local778.aString42 = local751.aString54;
					Static473.method6593(local778);
				}
			} else if (local396 == 4) {
				local778 = Static182.method2888(local130);
				local194 = local751.anInt5822;
				local200 = local751.anInt5821;
				local211 = local751.anInt5827;
				if (local778.anInt4718 != local194 || local200 != local778.anInt4657 || local211 != local778.anInt4660) {
					local778.anInt4660 = local211;
					local778.anInt4718 = local194;
					local778.anInt4657 = local200;
					Static473.method6593(local778);
				}
			} else if (local396 == 5) {
				local778 = Static182.method2888(local130);
				if (local751.anInt5822 != local778.anInt4693 || local751.anInt5822 == -1) {
					local778.anInt4670 = 0;
					local778.anInt4693 = local751.anInt5822;
					local778.anInt4652 = 0;
					local778.anInt4680 = 1;
					Static473.method6593(local778);
				}
			} else if (local396 == 6) {
				local146 = local751.anInt5822;
				local194 = local146 >> 10 & 0x1F;
				local200 = local146 >> 5 & 0x1F;
				local211 = local146 & 0x1F;
				@Pc(838) int local838 = (local211 << 3) + (local194 << 19) + (local200 << 11);
				@Pc(842) Class156 local842 = Static182.method2888(local130);
				if (local838 != local842.anInt4662) {
					local842.anInt4662 = local838;
					Static473.method6593(local842);
				}
			} else if (local396 == 7) {
				local778 = Static182.method2888(local130);
				@Pc(1165) boolean local1165 = local751.anInt5822 == 1;
				if (local778.aBoolean327 != local1165) {
					local778.aBoolean327 = local1165;
					Static473.method6593(local778);
				}
			} else if (local396 == 8) {
				local778 = Static182.method2888(local130);
				if (local778.anInt4733 != local751.anInt5822 || local778.anInt4716 != local751.anInt5821 || local751.anInt5827 != local778.anInt4647) {
					local778.anInt4647 = local751.anInt5827;
					local778.anInt4733 = local751.anInt5822;
					local778.anInt4716 = local751.anInt5821;
					if (local778.anInt4697 != -1) {
						if (local778.anInt4713 > 0) {
							local778.anInt4647 = local778.anInt4647 * 32 / local778.anInt4713;
						} else if (local778.anInt4671 > 0) {
							local778.anInt4647 = local778.anInt4647 * 32 / local778.anInt4671;
						}
					}
					Static473.method6593(local778);
				}
			} else if (local396 == 9) {
				local778 = Static182.method2888(local130);
				if (local778.anInt4697 != local751.anInt5822 || local751.anInt5821 != local778.anInt4728) {
					local778.anInt4697 = local751.anInt5822;
					local778.anInt4728 = local751.anInt5821;
					Static473.method6593(local778);
				}
			} else if (local396 == 10) {
				local778 = Static182.method2888(local130);
				if (local751.anInt5822 != local778.anInt4658 || local778.anInt4736 != local751.anInt5821 || local751.anInt5827 != local778.anInt4726) {
					local778.anInt4658 = local751.anInt5822;
					local778.anInt4736 = local751.anInt5821;
					local778.anInt4726 = local751.anInt5827;
					Static473.method6593(local778);
				}
			} else if (local396 == 11) {
				local778 = Static182.method2888(local130);
				local778.anInt4702 = local778.anInt4706 = local751.anInt5821;
				local778.anInt4734 = local778.anInt4681 = local751.anInt5822;
				local778.aByte62 = 0;
				local778.aByte60 = 0;
				Static473.method6593(local778);
			} else if (local396 == 12) {
				local778 = Static182.method2888(local130);
				local194 = local751.anInt5822;
				if (local778 != null && local778.anInt4735 == 0) {
					if (local778.anInt4719 - local778.anInt4673 < local194) {
						local194 = local778.anInt4719 - local778.anInt4673;
					}
					if (local194 < 0) {
						local194 = 0;
					}
					if (local194 != local778.anInt4707) {
						local778.anInt4707 = local194;
						Static473.method6593(local778);
					}
				}
			} else if (local396 == 14) {
				local778 = Static182.method2888(local130);
				local778.anInt4699 = local751.anInt5822;
			} else if (local396 == 15) {
				Static426.aBoolean535 = true;
				Static377.anInt6886 = local751.anInt5821;
				Static364.anInt6445 = local751.anInt5822;
			} else if (local396 == 16) {
				local778 = Static182.method2888(local130);
				local778.anInt4650 = local751.anInt5822;
			}
		}
		if (Static267.anInt5095 != 0) {
			Static456.anInt7775 += 20;
			if (Static456.anInt7775 >= 400) {
				Static267.anInt5095 = 0;
			}
		}
		Static152.anInt2791++;
		if (Static159.aClass156_5 != null) {
			Static76.anInt1378++;
			if (Static76.anInt1378 >= 15) {
				Static473.method6593(Static159.aClass156_5);
				Static159.aClass156_5 = null;
			}
		}
		Static206.aBoolean286 = false;
		Static59.aClass156_2 = null;
		Static287.aClass156_13 = null;
		Static261.aBoolean148 = false;
		Static281.method4559(-1, -1, null);
		Static20.method503(-1, -1, null);
		if (!Static431.aBoolean542) {
			Static108.anInt2198 = -1;
		}
		Static148.method5995();
		Static164.anInt2967++;
		if (Static501.aBoolean604) {
			Static144.method2331(Static78.aClass296_79);
			Static455.aClass1_Sub6_Sub2_2.method3969(Static87.anInt1622 | Static282.anInt7767 << 28 | Static58.anInt1129 << 14);
			Static501.aBoolean604 = false;
		}
		while (true) {
			@Pc(1388) Class1_Sub30 local1388;
			@Pc(1393) Class156 local1393;
			do {
				local1388 = (Class1_Sub30) Static281.aClass37_55.method973();
				if (local1388 == null) {
					while (true) {
						do {
							local1388 = (Class1_Sub30) Static420.aClass37_80.method973();
							if (local1388 == null) {
								while (true) {
									do {
										local1388 = (Class1_Sub30) Static90.aClass37_21.method973();
										if (local1388 == null) {
											if (Static287.aClass156_13 == null) {
												Static315.anInt5797 = 0;
											}
											if (Static86.aClass156_4 != null) {
												Static312.method4875();
											}
											if (Static313.anInt5785 > 0 && Static149.aClass66_1.method1582(82) && Static149.aClass66_1.method1582(81) && Static168.anInt5448 != 0) {
												local396 = Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 - Static168.anInt5448;
												if (local396 < 0) {
													local396 = 0;
												} else if (local396 > 3) {
													local396 = 3;
												}
												Static105.method1783(Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray428[0] + Static470.anInt7897, Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray427[0] + Static534.anInt9007, local396);
											}
											Static467.method6553();
											for (local396 = 0; local396 < 5; local396++) {
												@Pc(1595) int local1595 = Static541.anIntArray841[local396]++;
											}
											if (Static47.aBoolean51 && Static60.method1119() - 60000L > Static226.aLong178) {
												Static82.method3794();
											}
											for (@Pc(1618) Class72_Sub1_Sub2 local1618 = (Class72_Sub1_Sub2) Static516.aClass299_9.method7030(); local1618 != null; local1618 = (Class72_Sub1_Sub2) Static516.aClass299_9.method7031()) {
												if (Static60.method1119() / 1000L - 5L > (long) local1618.anInt8156) {
													if (local1618.aShort130 > 0) {
														Static363.method5419(local1618.aString76 + Static362.aClass306_79.method7165(Static179.anInt3168), 0, "", 5, "");
													}
													if (local1618.aShort130 == 0) {
														Static363.method5419(local1618.aString76 + Static163.aClass306_37.method7165(Static179.anInt3168), 0, "", 5, "");
													}
													local1618.method6719();
												}
											}
											Static280.anInt5243++;
											if (Static280.anInt5243 > 500) {
												Static280.anInt5243 = 0;
												local146 = (int) (Math.random() * 8.0D);
												if ((local146 & 0x2) == 2) {
													Static220.anInt4348 += Static121.anInt2448;
												}
												if ((local146 & 0x4) == 4) {
													Static232.anInt4618 += Static363.anInt6442;
												}
												if ((local146 & 0x1) == 1) {
													Static330.anInt6001 += Static343.anInt6143;
												}
											}
											if (Static330.anInt6001 < -50) {
												Static343.anInt6143 = 2;
											}
											if (Static220.anInt4348 < -55) {
												Static121.anInt2448 = 2;
											}
											if (Static330.anInt6001 > 50) {
												Static343.anInt6143 = -2;
											}
											if (Static220.anInt4348 > 55) {
												Static121.anInt2448 = -2;
											}
											if (Static232.anInt4618 < -40) {
												Static363.anInt6442 = 1;
											}
											if (Static232.anInt4618 > 40) {
												Static363.anInt6442 = -1;
											}
											Static396.anInt7115++;
											if (Static396.anInt7115 > 500) {
												Static396.anInt7115 = 0;
												local146 = (int) (Math.random() * 8.0D);
												if ((local146 & 0x2) == 2) {
													Static316.anInt5814 += Static358.anInt8906;
												}
												if ((local146 & 0x1) == 1) {
													Static265.anInt5084 += Static240.anInt4802;
												}
											}
											if (Static265.anInt5084 < -60) {
												Static240.anInt4802 = 2;
											}
											if (Static265.anInt5084 > 60) {
												Static240.anInt4802 = -2;
											}
											if (Static316.anInt5814 < -20) {
												Static358.anInt8906 = 1;
											}
											if (Static316.anInt5814 > 10) {
												Static358.anInt8906 = -1;
											}
											Static94.anInt1936++;
											if (Static94.anInt1936 > 50) {
												Static144.method2331(Static221.aClass296_188);
											}
											if (Static149.aBoolean179) {
												Static138.method2262();
												Static149.aBoolean179 = false;
											}
											try {
												if (Static402.aClass56_2 != null && Static455.aClass1_Sub6_Sub2_2.anInt4555 > 0) {
													Static232.anInt4616 += Static455.aClass1_Sub6_Sub2_2.anInt4555;
													Static402.aClass56_2.method1315(Static455.aClass1_Sub6_Sub2_2.anInt4555, Static455.aClass1_Sub6_Sub2_2.aByteArray66);
													Static455.aClass1_Sub6_Sub2_2.anInt4555 = 0;
													Static94.anInt1936 = 0;
													return;
												}
												return;
											} catch (@Pc(1878) IOException local1878) {
												Static214.method1853();
												return;
											}
										}
										local1393 = local1388.aClass156_11;
										if (local1393.anInt4723 < 0) {
											break;
										}
										local778 = Static182.method2888(local1393.anInt4686);
									} while (local778 == null || local778.aClass156Array1 == null || local778.aClass156Array1.length <= local1393.anInt4723 || local778.aClass156Array1[local1393.anInt4723] != local1393);
									Static180.method2683(local1388);
								}
							}
							local1393 = local1388.aClass156_11;
							if (local1393.anInt4723 < 0) {
								break;
							}
							local778 = Static182.method2888(local1393.anInt4686);
						} while (local778 == null || local778.aClass156Array1 == null || local778.aClass156Array1.length <= local1393.anInt4723 || local1393 != local778.aClass156Array1[local1393.anInt4723]);
						Static180.method2683(local1388);
					}
				}
				local1393 = local1388.aClass156_11;
				if (local1393.anInt4723 < 0) {
					break;
				}
				local778 = Static182.method2888(local1393.anInt4686);
			} while (local778 == null || local778.aClass156Array1 == null || local778.aClass156Array1.length <= local1393.anInt4723 || local778.aClass156Array1[local1393.anInt4723] != local1393);
			Static180.method2683(local1388);
		}
	}
}
