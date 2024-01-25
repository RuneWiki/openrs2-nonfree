import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame25;

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	public static int anInt9538;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
	public static void method7905() {
		if (Static47.anInt889 > 1) {
			Static162.anInt3761 = Static413.anInt7729;
			Static47.anInt889--;
		}
		if (Static491.aBoolean628) {
			Static491.aBoolean628 = false;
			Static83.method1857();
			return;
		}
		if (!Static389.aBoolean533) {
			Static278.method4633();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static494.method7354(); local29++) {
		}
		if (Static96.anInt2243 != 9) {
			return;
		}
		Static413.method6431(Static383.aClass12_Sub8_Sub2_1, Static515.aClass77_90.method2113());
		if (Static479.aClass12_Sub37_2 == null) {
			if (Static234.aLong129 <= Static76.method1679()) {
				Static479.aClass12_Sub37_2 = Static40.aClass59_1.method1598(Static222.aClass247_1.aString85);
			}
		} else if (Static479.aClass12_Sub37_2.anInt6059 != -1) {
			Static332.method5312(Static291.aClass77_54);
			Static383.aClass12_Sub8_Sub2_1.method5190(Static479.aClass12_Sub37_2.anInt6059);
			Static479.aClass12_Sub37_2 = null;
			Static234.aLong129 = Static76.method1679() + 30000L;
		}
		@Pc(90) Class12_Sub3 local90 = (Class12_Sub3) Static55.aClass73_13.method2005();
		@Pc(128) int local128;
		@Pc(146) int local146;
		@Pc(191) int local191;
		@Pc(198) int local198;
		@Pc(209) int local209;
		if (local90 != null || Static403.aLong193 < Static76.method1679() - 2000L) {
			@Pc(105) boolean local105 = false;
			@Pc(108) int local108 = Static383.aClass12_Sub8_Sub2_1.anInt6217;
			for (@Pc(113) Class12_Sub3 local113 = (Class12_Sub3) Static417.aClass73_75.method2005(); local113 != null && Static383.aClass12_Sub8_Sub2_1.anInt6217 - local108 < 240; local113 = (Class12_Sub3) Static417.aClass73_75.method2009()) {
				local113.method7967();
				local128 = local113.method6275();
				if (local128 < -1) {
					local128 = -1;
				} else if (local128 > 65534) {
					local128 = 65534;
				}
				local146 = local113.method6279();
				if (local146 < -1) {
					local146 = -1;
				} else if (local146 > 65534) {
					local146 = 65534;
				}
				if (local146 != Static330.anInt6291 || Static536.anInt9524 != local128) {
					if (!local105) {
						Static332.method5312(Static81.aClass77_18);
						Static383.aClass12_Sub8_Sub2_1.method5214(0);
						local108 = Static383.aClass12_Sub8_Sub2_1.anInt6217;
						local105 = true;
					}
					local191 = local146 - Static330.anInt6291;
					Static330.anInt6291 = local146;
					local198 = local128 - Static536.anInt9524;
					Static536.anInt9524 = local128;
					local209 = (int) ((local113.method6280() - Static403.aLong193) / 20L);
					if (local209 < 8 && local191 >= -32 && local191 <= 31 && local198 >= -32 && local198 <= 31) {
						local198 += 32;
						local191 += 32;
						Static383.aClass12_Sub8_Sub2_1.method5190(local198 + (local191 << 6) + (local209 << 12));
					} else if (local209 < 32 && local191 >= -128 && local191 <= 127 && local198 >= -128 && local198 <= 127) {
						local198 += 128;
						Static383.aClass12_Sub8_Sub2_1.method5214(local209 + 128);
						local191 += 128;
						Static383.aClass12_Sub8_Sub2_1.method5190((local191 << 8) + local198);
					} else if (local209 >= 32) {
						Static383.aClass12_Sub8_Sub2_1.method5190(local209 + 57344);
						if (local146 == 1 || local128 == -1) {
							Static383.aClass12_Sub8_Sub2_1.method5223(Integer.MIN_VALUE);
						} else {
							Static383.aClass12_Sub8_Sub2_1.method5223(local128 << 16 | local146);
						}
					} else {
						Static383.aClass12_Sub8_Sub2_1.method5214(local209 + 192);
						if (local146 == 1 || local128 == -1) {
							Static383.aClass12_Sub8_Sub2_1.method5223(Integer.MIN_VALUE);
						} else {
							Static383.aClass12_Sub8_Sub2_1.method5223(local128 << 16 | local146);
						}
					}
					Static403.aLong193 = local113.method6280();
				}
			}
			if (local105) {
				Static383.aClass12_Sub8_Sub2_1.method5172(Static383.aClass12_Sub8_Sub2_1.anInt6217 - local108);
			}
		}
		@Pc(398) int local398;
		if (local90 != null) {
			@Pc(384) long local384 = (local90.method6280() - Static11.aLong1) / 50L;
			if (local384 > 32767L) {
				local384 = 32767L;
			}
			Static11.aLong1 = local90.method6280();
			local398 = local90.method6275();
			if (local398 < 0) {
				local398 = 0;
			} else if (local398 > 65535) {
				local398 = 65535;
			}
			local128 = local90.method6279();
			if (local128 < 0) {
				local128 = 0;
			} else if (local128 > 65535) {
				local128 = 65535;
			}
			@Pc(434) byte local434 = 0;
			if (local90.method6274() == 2) {
				local434 = 1;
			}
			local191 = (int) local384;
			Static332.method5312(Static323.aClass77_58);
			Static383.aClass12_Sub8_Sub2_1.method5223(local128 | local398 << 16);
			Static383.aClass12_Sub8_Sub2_1.method5190(local191 | local434 << 15);
		}
		@Pc(486) int local486;
		if (Static234.anInt4900 > 0) {
			Static332.method5312(Static421.aClass77_71);
			Static383.aClass12_Sub8_Sub2_1.method5214(Static234.anInt4900 * 3);
			for (local486 = 0; local486 < Static234.anInt4900; local486++) {
				@Pc(492) Interface1 local492 = Static146.anInterface1Array1[local486];
				@Pc(500) long local500 = (local492.method6640() - Static428.aLong198) / 50L;
				Static428.aLong198 = local492.method6640();
				if (local500 > 65535L) {
					local500 = 65535L;
				}
				Static383.aClass12_Sub8_Sub2_1.method5214(local492.method6638());
				Static383.aClass12_Sub8_Sub2_1.method5190((int) local500);
			}
		}
		if (Static211.anInt4656 > 0) {
			Static211.anInt4656--;
		}
		if (Static497.aBoolean640 && Static211.anInt4656 <= 0) {
			Static497.aBoolean640 = false;
			Static211.anInt4656 = 20;
			Static332.method5312(Static530.aClass77_92);
			Static383.aClass12_Sub8_Sub2_1.method5215((int) Static500.aFloat186 >> 3);
			Static383.aClass12_Sub8_Sub2_1.method5197((int) Static49.aFloat10 >> 3);
		}
		if (Static38.aBoolean44 && !Static387.aBoolean531) {
			Static387.aBoolean531 = true;
			Static332.method5312(Static249.aClass77_44);
			Static383.aClass12_Sub8_Sub2_1.method5214(1);
		}
		if (!Static38.aBoolean44 && Static387.aBoolean531) {
			Static387.aBoolean531 = false;
			Static332.method5312(Static249.aClass77_44);
			Static383.aClass12_Sub8_Sub2_1.method5214(0);
		}
		if (!Static14.aBoolean9) {
			Static332.method5312(Static498.aClass77_87);
			Static383.aClass12_Sub8_Sub2_1.method5214(0);
			local486 = Static383.aClass12_Sub8_Sub2_1.anInt6217;
			@Pc(648) Class12_Sub8 local648 = new Class12_Sub8(Static165.method3356());
			Static208.aClass12_Sub10_Sub1_1.method2039(local648);
			Static383.aClass12_Sub8_Sub2_1.method5193(local648.aByteArray82, local648.anInt6217);
			Static383.aClass12_Sub8_Sub2_1.method5172(Static383.aClass12_Sub8_Sub2_1.anInt6217 - local486);
			Static14.aBoolean9 = true;
		}
		if (Static120.aClass37ArrayArrayArray1 != null) {
			if (Static242.anInt4993 == 2) {
				Static156.method3071();
			} else if (Static242.anInt4993 == 3) {
				Static83.method1859();
			}
		}
		if (Static299.aBoolean447) {
			Static299.aBoolean447 = false;
		} else {
			Static516.aFloat188 /= 2.0F;
		}
		if (Static366.aBoolean639) {
			Static366.aBoolean639 = false;
		} else {
			Static360.aFloat146 /= 2.0F;
		}
		Static6.method218();
		if (Static96.anInt2243 != 9) {
			return;
		}
		Static74.method1671();
		Static354.method5527();
		Static407.method6376();
		Static277.method4629();
		Static123.anInt2885++;
		if (Static123.anInt2885 > 750) {
			Static83.method1857();
			return;
		}
		Static314.method5050();
		Static296.method4800();
		Static478.method7172();
		for (local486 = Static393.aClass31_1.method792(true); local486 != -1; local486 = Static393.aClass31_1.method792(false)) {
			Static435.method6628(local486);
			Static482.anIntArray652[Static14.anInt234++ & 0x1F] = local486;
		}
		@Pc(826) Class198 local826;
		for (@Pc(775) Class12_Sub4_Sub1 local775 = Static3.method191(); local775 != null; local775 = Static3.method191()) {
			local398 = local775.method821();
			local128 = local775.method822();
			if (local398 == 1) {
				Static479.anIntArray646[local128] = local775.anInt806;
				Static345.aBoolean479 |= Static425.aBooleanArray44[local128];
				Static530.anIntArray686[Static272.anInt5425++ & 0x1F] = local128;
			} else if (local398 == 2) {
				Static534.aStringArray60[local128] = local775.aString9;
				Static437.anIntArray604[Static78.anInt1823++ & 0x1F] = local128;
			} else if (local398 == 3) {
				local826 = Static104.method2137(local128);
				if (!local775.aString9.equals(local826.aString67)) {
					local826.aString67 = local775.aString9;
					Static331.method5282(local826);
				}
			} else if (local398 == 4) {
				local826 = Static104.method2137(local128);
				local191 = local775.anInt806;
				local198 = local775.anInt808;
				local209 = local775.anInt803;
				if (local826.anInt5722 != local191 || local198 != local826.anInt5744 || local826.anInt5765 != local209) {
					local826.anInt5744 = local198;
					local826.anInt5722 = local191;
					local826.anInt5765 = local209;
					Static331.method5282(local826);
				}
			} else if (local398 == 5) {
				local826 = Static104.method2137(local128);
				if (local826.anInt5708 != local775.anInt806 || local775.anInt806 == -1) {
					local826.anInt5783 = 1;
					local826.anInt5708 = local775.anInt806;
					local826.anInt5735 = 0;
					local826.anInt5753 = 0;
					Static331.method5282(local826);
				}
			} else if (local398 == 6) {
				local146 = local775.anInt806;
				local191 = local146 >> 10 & 0x1F;
				local198 = local146 >> 5 & 0x1F;
				local209 = local146 & 0x1F;
				@Pc(1244) int local1244 = (local191 << 19) + (local198 << 11) + (local209 << 3);
				@Pc(1248) Class198 local1248 = Static104.method2137(local128);
				if (local1248.anInt5709 != local1244) {
					local1248.anInt5709 = local1244;
					Static331.method5282(local1248);
				}
			} else if (local398 == 7) {
				local826 = Static104.method2137(local128);
				@Pc(892) boolean local892 = local775.anInt806 == 1;
				if (local826.aBoolean440 != local892) {
					local826.aBoolean440 = local892;
					Static331.method5282(local826);
				}
			} else if (local398 == 8) {
				local826 = Static104.method2137(local128);
				if (local826.anInt5745 != local775.anInt806 || local826.anInt5730 != local775.anInt808 || local826.anInt5782 != local775.anInt803) {
					local826.anInt5745 = local775.anInt806;
					local826.anInt5730 = local775.anInt808;
					local826.anInt5782 = local775.anInt803;
					if (local826.anInt5726 != -1) {
						if (local826.anInt5721 > 0) {
							local826.anInt5782 = local826.anInt5782 * 32 / local826.anInt5721;
						} else if (local826.anInt5755 > 0) {
							local826.anInt5782 = local826.anInt5782 * 32 / local826.anInt5755;
						}
					}
					Static331.method5282(local826);
				}
			} else if (local398 == 9) {
				local826 = Static104.method2137(local128);
				if (local775.anInt806 != local826.anInt5726 || local826.anInt5768 != local775.anInt808) {
					local826.anInt5768 = local775.anInt808;
					local826.anInt5726 = local775.anInt806;
					Static331.method5282(local826);
				}
			} else if (local398 == 10) {
				local826 = Static104.method2137(local128);
				if (local775.anInt806 != local826.anInt5756 || local775.anInt808 != local826.anInt5725 || local775.anInt803 != local826.anInt5772) {
					local826.anInt5756 = local775.anInt806;
					local826.anInt5772 = local775.anInt803;
					local826.anInt5725 = local775.anInt808;
					Static331.method5282(local826);
				}
			} else if (local398 == 11) {
				local826 = Static104.method2137(local128);
				local826.aByte72 = 0;
				local826.anInt5741 = local826.anInt5757 = local775.anInt808;
				local826.anInt5713 = local826.anInt5731 = local775.anInt806;
				local826.aByte70 = 0;
				Static331.method5282(local826);
			} else if (local398 == 12) {
				local826 = Static104.method2137(local128);
				local191 = local775.anInt806;
				if (local826 != null && local826.anInt5776 == 0) {
					if (local826.anInt5733 - local826.anInt5715 < local191) {
						local191 = local826.anInt5733 - local826.anInt5715;
					}
					if (local191 < 0) {
						local191 = 0;
					}
					if (local826.anInt5791 != local191) {
						local826.anInt5791 = local191;
						Static331.method5282(local826);
					}
				}
			} else if (local398 == 14) {
				local826 = Static104.method2137(local128);
				local826.anInt5790 = local775.anInt806;
			} else if (local398 == 15) {
				Static141.anInt3151 = local775.anInt808;
				Static209.aBoolean364 = true;
				Static273.anInt5444 = local775.anInt806;
			} else if (local398 == 16) {
				local826 = Static104.method2137(local128);
				local826.anInt5794 = local775.anInt806;
			}
		}
		Static481.anInt8697++;
		if (Static336.anInt6435 != 0) {
			Static352.anInt6599 += 20;
			if (Static352.anInt6599 >= 400) {
				Static336.anInt6435 = 0;
			}
		}
		if (Static445.aClass198_14 != null) {
			Static47.anInt890++;
			if (Static47.anInt890 >= 15) {
				Static331.method5282(Static445.aClass198_14);
				Static445.aClass198_14 = null;
			}
		}
		Static451.aBoolean357 = false;
		Static109.aBoolean213 = false;
		Static86.aClass198_3 = null;
		Static353.aClass198_12 = null;
		Static419.method6485(-1, -1, null);
		Static96.method2048(null, -1, -1);
		if (!Static73.aBoolean136) {
			Static4.anInt69 = -1;
		}
		Static270.method6585();
		Static413.anInt7729++;
		if (Static140.aBoolean251) {
			Static332.method5312(Static532.aClass77_93);
			Static383.aClass12_Sub8_Sub2_1.method5224(Static23.anInt9183 | Static497.anInt8951 << 28 | Static197.anInt4404 << 14);
			Static140.aBoolean251 = false;
		}
		while (true) {
			@Pc(1442) Class12_Sub6 local1442;
			@Pc(1447) Class198 local1447;
			do {
				local1442 = (Class12_Sub6) Static330.aClass73_51.method2008();
				if (local1442 == null) {
					while (true) {
						do {
							local1442 = (Class12_Sub6) Static239.aClass73_41.method2008();
							if (local1442 == null) {
								while (true) {
									do {
										local1442 = (Class12_Sub6) Static341.aClass73_54.method2008();
										if (local1442 == null) {
											if (Static86.aClass198_3 == null) {
												Static351.anInt6572 = 0;
											}
											if (Static191.aClass198_6 != null) {
												Static527.method7830();
											}
											if (Static59.anInt1442 > 0 && Static23.aClass5_3.method211(82) && Static23.aClass5_3.method211(81) && Static157.anInt3415 != 0) {
												local398 = Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 - Static157.anInt3415;
												if (local398 < 0) {
													local398 = 0;
												} else if (local398 > 3) {
													local398 = 3;
												}
												Static301.method4835(Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray316[0] + Static61.anInt1459, Static440.aClass30_Sub1_Sub1_Sub1_2.anIntArray317[0] + Static203.anInt4534, local398);
											}
											Static183.method3610();
											for (local398 = 0; local398 < 5; local398++) {
												@Pc(1650) int local1650 = Static146.anIntArray238[local398]++;
											}
											if (Static345.aBoolean479 && Static76.method1679() - 60000L > Static68.aLong28) {
												Static180.method3559();
											}
											for (@Pc(1677) Class7_Sub1_Sub2 local1677 = (Class7_Sub1_Sub2) Static430.aClass149_7.method3989(); local1677 != null; local1677 = (Class7_Sub1_Sub2) Static430.aClass149_7.method3986()) {
												if (Static76.method1679() / 1000L - 5L > (long) local1677.anInt8947) {
													if (local1677.aShort110 > 0) {
														Static406.method6373("", 5, 0, "", local1677.aString102 + Static406.aClass88_219.method2391(Static345.anInt6495));
													}
													if (local1677.aShort110 == 0) {
														Static406.method6373("", 5, 0, "", local1677.aString102 + Static381.aClass88_206.method2391(Static345.anInt6495));
													}
													local1677.method7760();
												}
											}
											Static500.anInt9029++;
											if (Static500.anInt9029 > 500) {
												Static500.anInt9029 = 0;
												local146 = (int) (Math.random() * 8.0D);
												if ((local146 & 0x4) == 4) {
													Static525.anInt9367 += Static255.anInt5226;
												}
												if ((local146 & 0x1) == 1) {
													Static452.anInt8206 += Static235.anInt8916;
												}
												if ((local146 & 0x2) == 2) {
													Static144.anInt5613 += Static370.anInt6856;
												}
											}
											if (Static452.anInt8206 < -50) {
												Static235.anInt8916 = 2;
											}
											if (Static452.anInt8206 > 50) {
												Static235.anInt8916 = -2;
											}
											if (Static144.anInt5613 < -55) {
												Static370.anInt6856 = 2;
											}
											if (Static525.anInt9367 < -40) {
												Static255.anInt5226 = 1;
											}
											if (Static144.anInt5613 > 55) {
												Static370.anInt6856 = -2;
											}
											if (Static525.anInt9367 > 40) {
												Static255.anInt5226 = -1;
											}
											Static281.anInt5520++;
											if (Static281.anInt5520 > 500) {
												Static281.anInt5520 = 0;
												local146 = (int) (Math.random() * 8.0D);
												if ((local146 & 0x2) == 2) {
													Static339.anInt6470 += Static327.anInt6161;
												}
												if ((local146 & 0x1) == 1) {
													Static432.anInt7990 += Static79.anInt1876;
												}
											}
											if (Static432.anInt7990 < -60) {
												Static79.anInt1876 = 2;
											}
											if (Static339.anInt6470 < -20) {
												Static327.anInt6161 = 1;
											}
											if (Static432.anInt7990 > 60) {
												Static79.anInt1876 = -2;
											}
											if (Static339.anInt6470 > 10) {
												Static327.anInt6161 = -1;
											}
											Static471.anInt8639++;
											if (Static471.anInt8639 > 50) {
												Static332.method5312(Static538.aClass77_95);
											}
											if (Static344.aBoolean476) {
												Static484.method7242();
												Static344.aBoolean476 = false;
											}
											try {
												if (Static491.aClass277_2 != null && Static383.aClass12_Sub8_Sub2_1.anInt6217 > 0) {
													Static238.anInt4931 += Static383.aClass12_Sub8_Sub2_1.anInt6217;
													Static491.aClass277_2.method7164(Static383.aClass12_Sub8_Sub2_1.aByteArray82, Static383.aClass12_Sub8_Sub2_1.anInt6217);
													Static383.aClass12_Sub8_Sub2_1.anInt6217 = 0;
													Static471.anInt8639 = 0;
													return;
												}
												return;
											} catch (@Pc(1941) IOException local1941) {
												Static83.method1857();
												return;
											}
										}
										local1447 = local1442.aClass198_2;
										if (local1447.anInt5705 < 0) {
											break;
										}
										local826 = Static104.method2137(local1447.anInt5787);
									} while (local826 == null || local826.aClass198Array1 == null || local826.aClass198Array1.length <= local1447.anInt5705 || local1447 != local826.aClass198Array1[local1447.anInt5705]);
									Static312.method5029(local1442);
								}
							}
							local1447 = local1442.aClass198_2;
							if (local1447.anInt5705 < 0) {
								break;
							}
							local826 = Static104.method2137(local1447.anInt5787);
						} while (local826 == null || local826.aClass198Array1 == null || local1447.anInt5705 >= local826.aClass198Array1.length || local1447 != local826.aClass198Array1[local1447.anInt5705]);
						Static312.method5029(local1442);
					}
				}
				local1447 = local1442.aClass198_2;
				if (local1447.anInt5705 < 0) {
					break;
				}
				local826 = Static104.method2137(local1447.anInt5787);
			} while (local826 == null || local826.aClass198Array1 == null || local826.aClass198Array1.length <= local1447.anInt5705 || local1447 != local826.aClass198Array1[local1447.anInt5705]);
			Static312.method5029(local1442);
		}
	}
}
