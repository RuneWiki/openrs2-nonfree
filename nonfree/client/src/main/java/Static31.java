import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ef", name = "Vb", descriptor = "Lclient!lf;")
	public static Class7 aClass7_5;

	@OriginalMember(owner = "client!ef", name = "U", descriptor = "Lclient!je;")
	public static Class42 aClass42_1 = new Class42();

	@OriginalMember(owner = "client!ef", name = "Bb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_360 = Static78.method1313("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!ef", name = "Cb", descriptor = "[I")
	public static int[] anIntArray170 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ef", name = "Rb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_361 = Static78.method1313("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!ef", name = "Tb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_362 = aClass25_361;

	@OriginalMember(owner = "client!ef", name = "Ub", descriptor = "Lclient!fc;")
	public static Class25 aClass25_363 = Static78.method1313("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!ef", name = "Xb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_365 = Static78.method1313("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ef", name = "Wb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_364 = aClass25_365;

	@OriginalMember(owner = "client!ef", name = "Zb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_366 = Static78.method1313("Weiter");

	@OriginalMember(owner = "client!ef", name = "ac", descriptor = "Lclient!fc;")
	public static Class25 aClass25_367 = Static78.method1313("Lade)3)3)3");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!fc;I)Z")
	public static boolean method704(@OriginalArg(0) Class25 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static80.anInt1786; local16++) {
			if (arg0.method786(Static118.aClass25Array22[local16])) {
				return true;
			}
		}
		return arg0.method786(Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass25_1384);
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)V")
	public static void method708() {
		Static37.aClass7_7.method1096();
		Static36.method841();
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
	public static void method711() {
		anIntArray170 = null;
		aClass25_364 = null;
		aClass25_365 = null;
		aClass25_363 = null;
		aClass25_360 = null;
		aClass7_5 = null;
		aClass25_367 = null;
		aClass25_362 = null;
		aClass25_361 = null;
		aClass25_366 = null;
		aClass42_1 = null;
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)I")
	public static int method713() {
		@Pc(7) int local7 = 3;
		if (Static35.anInt1003 < 310) {
			@Pc(14) int local14 = Static75.anInt1566 >> 7;
			@Pc(18) int local18 = Static67.anInt1471 >> 7;
			@Pc(23) int local23 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 >> 7;
			if ((Static116.aByteArrayArrayArray7[Static21.anInt596][local14][local18] & 0x4) != 0) {
				local7 = Static21.anInt596;
			}
			@Pc(43) int local43 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 >> 7;
			@Pc(55) int local55;
			if (local18 < local43) {
				local55 = local43 - local18;
			} else {
				local55 = local18 - local43;
			}
			@Pc(70) int local70;
			if (local23 > local14) {
				local70 = local23 - local14;
			} else {
				local70 = local14 - local23;
			}
			@Pc(89) int local89;
			@Pc(91) int local91;
			if (local55 < local70) {
				local89 = local55 * 65536 / local70;
				local91 = 32768;
				while (local14 != local23) {
					if (local14 < local23) {
						local14++;
					} else if (local14 > local23) {
						local14--;
					}
					local91 += local89;
					if ((Static116.aByteArrayArrayArray7[Static21.anInt596][local14][local18] & 0x4) != 0) {
						local7 = Static21.anInt596;
					}
					if (local91 >= 65536) {
						local91 -= 65536;
						if (local18 < local43) {
							local18++;
						} else if (local18 > local43) {
							local18--;
						}
						if ((Static116.aByteArrayArrayArray7[Static21.anInt596][local14][local18] & 0x4) != 0) {
							local7 = Static21.anInt596;
						}
					}
				}
			} else {
				local89 = local70 * 65536 / local55;
				local91 = 32768;
				while (local43 != local18) {
					local91 += local89;
					if (local18 < local43) {
						local18++;
					} else if (local43 < local18) {
						local18--;
					}
					if ((Static116.aByteArrayArrayArray7[Static21.anInt596][local14][local18] & 0x4) != 0) {
						local7 = Static21.anInt596;
					}
					if (local91 >= 65536) {
						if (local14 < local23) {
							local14++;
						} else if (local14 > local23) {
							local14--;
						}
						if ((Static116.aByteArrayArrayArray7[Static21.anInt596][local14][local18] & 0x4) != 0) {
							local7 = Static21.anInt596;
						}
						local91 -= 65536;
					}
				}
			}
		}
		if ((Static116.aByteArrayArrayArray7[Static21.anInt596][Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 >> 7][Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 >> 7] & 0x4) != 0) {
			local7 = Static21.anInt596;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([Lclient!ob;IIIIIIIII)Z")
	public static boolean method715(@OriginalArg(0) Class1_Sub2_Sub14[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static128.method1942(arg3, arg8, arg1, arg4);
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < arg0.length; local19++) {
			@Pc(25) Class1_Sub2_Sub14 local25 = arg0[local19];
			if (local25 != null && (arg2 == local25.anInt1905 || arg2 == -1412584499 && local25 == Static87.aClass1_Sub2_Sub14_3)) {
				if (local25.anInt1934 > 0) {
					Static87.method1286(local25);
				}
				@Pc(60) int local60 = arg3 + local25.anInt1959 - arg6;
				@Pc(63) int local63 = local25.anInt1909;
				@Pc(71) int local71 = arg8 + local25.anInt1917 - arg5;
				@Pc(106) int local106;
				@Pc(108) int local108;
				@Pc(137) int[] local137;
				@Pc(249) int local249;
				@Pc(235) int local235;
				@Pc(260) int local260;
				@Pc(255) int local255;
				if (Static87.aClass1_Sub2_Sub14_3 == local25) {
					if (arg2 != -1412584499 && !local25.aBoolean84) {
						Static105.anInt2391 = arg6 - arg3;
						Static14.anInt408 = arg5 - arg8;
						Static66.aClass1_Sub2_Sub14Array1 = arg0;
						continue;
					}
					@Pc(98) Class1_Sub2_Sub14 local98 = Static109.method1752(local25);
					if (local98 == null) {
						Static87.aClass1_Sub2_Sub14_3 = null;
					} else {
						local106 = Static10.anInt264;
						local108 = Static111.anInt2597;
						if (Static33.anInt921 == 0) {
							local106 -= 4;
							local108 -= 4;
						}
						if (Static33.anInt921 == 1) {
							local108 -= 205;
							local106 -= 553;
						}
						if (Static33.anInt921 == 2) {
							local108 -= 357;
							local106 -= 17;
						}
						local108 -= Static87.anInt1638;
						local106 -= Static64.anInt1446;
						local137 = Static2.method35(local98);
						if (local108 < local137[1]) {
							local108 = local137[1];
						}
						if (local137[1] + local98.anInt1923 < local25.anInt1923 + local108) {
							local108 = local137[1] + local98.anInt1923 - local25.anInt1923;
						}
						if (local106 < local137[0]) {
							local106 = local137[0];
						}
						@Pc(199) Class1_Sub2_Sub14 local199 = Static56.aClass1_Sub2_Sub14ArrayArray1[local25.anInt1937 >> 16][local25.anInt1905 & 0xFFFF];
						if (local106 + local25.anInt1911 > local98.anInt1911 + local137[0]) {
							local106 = local98.anInt1911 + local137[0] - local25.anInt1911;
						}
						@Pc(224) int[] local224 = Static2.method35(local199);
						local235 = local108 + local199.anInt1957 - local224[1];
						if (!local25.aBoolean84) {
							local63 = 128;
						}
						local249 = local199.anInt1949 + local106 - local224[0];
						local255 = local235 - local25.anInt1917;
						local260 = local249 - local25.anInt1959;
						if (local25.anInt1927 >= local260 && -local25.anInt1927 <= local260 && local25.anInt1927 >= local255 && local255 >= -local25.anInt1927 && !Static27.aBoolean25) {
							local255 = 0;
							local260 = 0;
						} else if (Static95.anInt2166 <= local25.anInt1908 && !Static27.aBoolean25) {
							local255 = 0;
							local260 = 0;
						}
						local60 += local260;
						local71 += local255;
					}
				}
				if ((!local25.aBoolean90 || local60 <= Static128.anInt2753 && local71 <= Static128.anInt2752 && Static128.anInt2751 <= local25.anInt1911 + local60 && Static128.anInt2750 <= local71 + local25.anInt1923) && (!local25.aBoolean90 || !Static39.method890(local25))) {
					if (local25.anInt1960 == 0) {
						if (!local25.aBoolean90 && Static39.method890(local25) && !Static94.method1578(local19, arg7)) {
							continue;
						}
						if (!local25.aBoolean90) {
							if (local25.anInt1957 > local25.anInt1912 - local25.anInt1923) {
								local25.anInt1957 = local25.anInt1912 - local25.anInt1923;
							}
							if (local25.anInt1957 < 0) {
								local25.anInt1957 = 0;
							}
						}
						local12 &= method715(arg0, local60 + local25.anInt1911, local25.anInt1937, local60, local25.anInt1923 + local71, local25.anInt1957, local25.anInt1949, arg7, local71);
						if (local25.aClass1_Sub2_Sub14Array2 != null) {
							local12 &= method715(local25.aClass1_Sub2_Sub14Array2, local60 + local25.anInt1911, local25.anInt1937, local60, local25.anInt1923 + local71, local25.anInt1957, local25.anInt1949, arg7, local71);
						}
						Static128.method1942(arg3, arg8, arg1, arg4);
						if (local25.anInt1923 < local25.anInt1912 && !local25.aBoolean90) {
							Static98.method1970(local25.anInt1957, local60 + local25.anInt1911, local25.anInt1912, local71, local25.anInt1923);
						}
					}
					if (local25.anInt1960 != 1) {
						@Pc(711) int local711;
						@Pc(488) int local488;
						@Pc(506) int local506;
						@Pc(515) int local515;
						@Pc(644) int local644;
						if (local25.anInt1960 == 2) {
							local488 = 0;
							for (local106 = 0; local106 < local25.anInt1923; local106++) {
								for (local108 = 0; local108 < local25.anInt1911; local108++) {
									local506 = local60 + (local25.anInt1945 + 32) * local108;
									local515 = local71 + local106 * (local25.anInt1944 + 32);
									if (local488 < 20) {
										local506 += local25.anIntArray343[local488];
										local515 += local25.anIntArray348[local488];
									}
									if (local25.anIntArray341[local488] > 0) {
										local235 = local25.anIntArray341[local488] - 1;
										if (local506 > Static128.anInt2751 - 32 && Static128.anInt2753 > local506 && local515 > Static128.anInt2750 - 32 && local515 < Static128.anInt2752 || Static52.anInt1267 != 0 && Static115.anInt2667 == local488) {
											@Pc(606) Class1_Sub2_Sub2_Sub1 local606;
											if (Static80.anInt1774 == 1 && Static76.anInt1587 == local488 && Static92.anInt2081 == local25.anInt1937) {
												local606 = Static124.method2010(false, 0, local235, local25.anIntArray344[local488], 2);
											} else {
												local606 = Static124.method2010(false, 3153952, local235, local25.anIntArray344[local488], 1);
											}
											if (local606 == null) {
												local12 = false;
											} else if (Static52.anInt1267 != 0 && local488 == Static115.anInt2667 && local25.anInt1937 == Static92.anInt2072) {
												local249 = Static111.anInt2597 - Static103.anInt2773;
												local644 = Static10.anInt264 - Static10.anInt269;
												if (local249 < 5 && local249 > -5) {
													local249 = 0;
												}
												if (local644 < 5 && local644 > -5) {
													local644 = 0;
												}
												if (Static3.anInt52 < 5) {
													local249 = 0;
													local644 = 0;
												}
												local606.method203(local506 + local644, local249 + local515, 128);
												if (arg2 != -1) {
													@Pc(690) Class1_Sub2_Sub14 local690 = arg0[arg2 & 0xFFFF];
													if (local515 + local249 < Static128.anInt2750 && local690.anInt1957 > 0) {
														local711 = (Static128.anInt2750 - local249 - local515) * Static18.anInt522 / 3;
														if (local711 > Static18.anInt522 * 10) {
															local711 = Static18.anInt522 * 10;
														}
														if (local690.anInt1957 < local711) {
															local711 = local690.anInt1957;
														}
														Static103.anInt2773 += local711;
														local690.anInt1957 -= local711;
													}
													if (local515 + local249 + 32 > Static128.anInt2752 && local690.anInt1957 < local690.anInt1912 - local690.anInt1923) {
														local711 = Static18.anInt522 * (local515 + local249 + 32 - Static128.anInt2752) / 3;
														if (Static18.anInt522 * 10 < local711) {
															local711 = Static18.anInt522 * 10;
														}
														if (local711 > local690.anInt1912 - local690.anInt1923 - local690.anInt1957) {
															local711 = local690.anInt1912 - local690.anInt1957 - local690.anInt1923;
														}
														Static103.anInt2773 -= local711;
														local690.anInt1957 += local711;
													}
												}
											} else if (Static25.anInt723 != 0 && local488 == Static94.anInt2163 && Static54.anInt1295 == local25.anInt1937) {
												local606.method203(local506, local515, 128);
											} else {
												local606.method204(local506, local515);
											}
										}
									} else if (local25.anIntArray345 != null && local488 < 20) {
										@Pc(870) Class1_Sub2_Sub2_Sub1 local870 = local25.method1433(local488);
										if (local870 != null) {
											local870.method204(local506, local515);
										} else if (Static78.aBoolean69) {
											local12 = false;
										}
									}
									local488++;
								}
							}
						} else if (local25.anInt1960 == 3) {
							if (Static45.method964(local25)) {
								local488 = local25.anInt1950;
								if (Static94.method1578(local19, arg7) && local25.anInt1899 != 0) {
									local488 = local25.anInt1899;
								}
							} else {
								local488 = local25.anInt1956;
								if (Static94.method1578(local19, arg7) && local25.anInt1920 != 0) {
									local488 = local25.anInt1920;
								}
							}
							if (local63 == 0) {
								if (local25.aBoolean91) {
									Static128.method1935(local60, local71, local25.anInt1911, local25.anInt1923, local488);
								} else {
									Static128.method1938(local60, local71, local25.anInt1911, local25.anInt1923, local488);
								}
							} else if (local25.aBoolean91) {
								Static128.method1945(local60, local71, local25.anInt1911, local25.anInt1923, local488, 256 - (local63 & 0xFF));
							} else {
								Static128.method1941(local60, local71, local25.anInt1911, local25.anInt1923, local488, 256 - (local63 & 0xFF));
							}
						} else {
							@Pc(1011) Class1_Sub2_Sub2_Sub3 local1011;
							if (local25.anInt1960 == 4) {
								local1011 = local25.method1436();
								if (local1011 != null) {
									@Pc(1022) Class25 local1022 = local25.aClass25_941;
									if (Static45.method964(local25)) {
										local106 = local25.anInt1950;
										if (Static94.method1578(local19, arg7) && local25.anInt1899 != 0) {
											local106 = local25.anInt1899;
										}
										if (local25.aClass25_943.method762() > 0) {
											local1022 = local25.aClass25_943;
										}
									} else {
										local106 = local25.anInt1956;
										if (Static94.method1578(local19, arg7) && local25.anInt1920 != 0) {
											local106 = local25.anInt1920;
										}
									}
									if (local25.aBoolean90 && local25.anInt1904 != -1) {
										@Pc(1080) Class1_Sub2_Sub16 local1080 = Static33.method736(local25.anInt1904);
										local1022 = local1080.aClass25_1018;
										if (local1022 == null) {
											local1022 = Static11.aClass25_147;
										}
										if ((local1080.anInt2152 == 1 || local25.anInt1903 != 1) && local25.anInt1903 != -1) {
											local1022 = Static116.method1859(new Class25[] { local1022, Static86.aClass25_936, Static116.method1858(local25.anInt1903) });
										}
									}
									if (local25.anInt1937 == Static33.anInt917 && local25.anInt1942 == Static5.anInt111) {
										local1022 = Static57.aClass25_1181;
										local106 = local25.anInt1956;
									}
									if (Static128.anInt2749 == 479) {
										if (local106 == 16776960) {
											local106 = 255;
										}
										if (local106 == 49152) {
											local106 = 16777215;
										}
									}
									local1022 = Static10.method249(local25, local1022);
									local1011.method1179(local1022, local60, local71, local25.anInt1911, local25.anInt1923, local106, local25.aBoolean86 ? 0 : -1, local25.anInt1952, local25.anInt1932, local25.anInt1954);
								} else if (Static78.aBoolean69) {
									local12 = false;
								}
							} else {
								@Pc(1404) int local1404;
								if (local25.anInt1960 == 5) {
									@Pc(1207) Class1_Sub2_Sub2_Sub1 local1207;
									if (local25.aBoolean90) {
										if (local25.anInt1904 == -1) {
											local1207 = local25.method1431(false);
										} else {
											local1207 = Static124.method2010(false, local25.anInt1916, local25.anInt1904, local25.anInt1903, local25.anInt1915);
										}
										if (local1207 != null) {
											local106 = local1207.anInt213;
											local108 = local1207.anInt211;
											if (local25.aBoolean88) {
												local137 = new int[4];
												Static128.method1933(local137);
												local515 = local60;
												if (local137[0] > local60) {
													local515 = local137[0];
												}
												local644 = local71;
												local235 = local71 + local25.anInt1923;
												if (local71 < local137[1]) {
													local644 = local137[1];
												}
												local249 = local25.anInt1911 + local60;
												if (local249 > local137[2]) {
													local249 = local137[2];
												}
												if (local137[3] < local235) {
													local235 = local137[3];
												}
												Static128.method1942(local515, local644, local249, local235);
												local260 = (local25.anInt1911 + local106 - 1) / local106;
												local255 = (local108 + local25.anInt1923 - 1) / local108;
												for (local711 = 0; local711 < local260; local711++) {
													for (local1404 = 0; local1404 < local255; local1404++) {
														if (local25.anInt1897 != 0) {
															local1207.method194(local711 * local106 + local60 + local106 / 2, local108 / 2 + local108 * local1404 + local71, local25.anInt1897, 4096);
														} else if (local63 == 0) {
															local1207.method204(local60 + local106 * local711, local71 - -(local1404 * local108));
														} else {
															local1207.method203(local60 + local106 * local711, local108 * local1404 + local71, 256 - (local63 & 0xFF));
														}
													}
												}
												Static128.method1936(local137);
											} else {
												local506 = local25.anInt1911 * 4096 / local106;
												if (local25.anInt1897 != 0) {
													local1207.method194(local60 + local25.anInt1911 / 2, local71 + local25.anInt1923 / 2, local25.anInt1897, local506);
												} else if (local63 != 0) {
													local1207.method206(local60, local71, local25.anInt1911, local25.anInt1923, 256 - (local63 & 0xFF));
												} else if (local25.anInt1911 == local106 && local108 == local25.anInt1923) {
													local1207.method204(local60, local71);
												} else {
													local1207.method190(local60, local71, local25.anInt1911, local25.anInt1923);
												}
											}
										} else if (Static78.aBoolean69) {
											local12 = false;
										}
									} else {
										local1207 = local25.method1431(Static45.method964(local25));
										if (local1207 != null) {
											local1207.method204(local60, local71);
										} else if (Static78.aBoolean69) {
											local12 = false;
										}
									}
								} else {
									@Pc(1544) Class1_Sub2_Sub16 local1544;
									if (local25.anInt1960 == 6) {
										@Pc(1521) boolean local1521 = Static45.method964(local25);
										if (local1521) {
											local106 = local25.anInt1925;
										} else {
											local106 = local25.anInt1946;
										}
										@Pc(1533) Class1_Sub2_Sub3_Sub2 local1533 = null;
										local506 = 0;
										if (local25.anInt1904 != -1) {
											local1544 = Static33.method736(local25.anInt1904);
											if (local1544 != null) {
												local1544 = local1544.method1589(local25.anInt1903);
												local1533 = local1544.method1594(1);
												if (local1533 == null) {
													local12 = false;
												} else {
													local1533.method465();
													local506 = local1533.anInt2778 / 2;
												}
											}
										} else if (local25.anInt1930 == 5) {
											if (local25.anInt1951 == 0) {
												local1533 = Static48.aClass75_1.method1848(null, -1, null, -1);
											} else {
												local1533 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.method1969();
											}
										} else if (local106 == -1) {
											local1533 = local25.method1432(Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass75_2, local1521, -1, null);
											if (local1533 == null && Static78.aBoolean69) {
												local12 = false;
											}
										} else {
											@Pc(1584) Class1_Sub2_Sub17 local1584 = Static34.method755(local106);
											local1533 = local25.method1432(Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass75_2, local1521, local25.anInt1940, local1584);
											if (local1533 == null && Static78.aBoolean69) {
												local12 = false;
											}
										}
										Static36.method832(local25.anInt1911 / 2 + local60, local71 - -(local25.anInt1923 / 2));
										local644 = Class1_Sub2_Sub2_Sub2.anIntArray185[local25.anInt1902] * local25.anInt1962 >> 16;
										local515 = local25.anInt1962 * Class1_Sub2_Sub2_Sub2.anIntArray189[local25.anInt1902] >> 16;
										if (local1533 != null) {
											if (local25.aBoolean90) {
												local1533.method465();
												if (local25.aBoolean94) {
													local1533.method468(local25.anInt1924, local25.anInt1935, local25.anInt1902, local25.anInt1963, local25.anInt1943 + local506 + local515, local25.anInt1943 + local644, local25.anInt1962);
												} else {
													local1533.method474(local25.anInt1924, local25.anInt1935, local25.anInt1902, local25.anInt1963, local25.anInt1943 + local515 + local506, local644 - -local25.anInt1943);
												}
											} else {
												local1533.method474(local25.anInt1924, 0, local25.anInt1902, 0, local515, local644);
											}
										}
										Static36.method830();
									} else {
										if (local25.anInt1960 == 7) {
											local1011 = local25.method1436();
											if (local1011 == null) {
												if (Static78.aBoolean69) {
													local12 = false;
												}
												continue;
											}
											local106 = 0;
											for (local108 = 0; local108 < local25.anInt1923; local108++) {
												for (local506 = 0; local506 < local25.anInt1911; local506++) {
													if (local25.anIntArray341[local106] > 0) {
														local1544 = Static33.method736(local25.anIntArray341[local106] - 1);
														@Pc(1793) Class25 local1793 = local1544.aClass25_1018;
														if (local1793 == null) {
															local1793 = Static11.aClass25_147;
														}
														if (local1544.anInt2152 == 1 || local25.anIntArray344[local106] != 1) {
															local1793 = Static116.method1859(new Class25[] { local1793, Static86.aClass25_936, Static116.method1858(local25.anIntArray344[local106]) });
														}
														local249 = (local25.anInt1945 + 115) * local506 + local60;
														local235 = local71 + local108 * (local25.anInt1944 + 12);
														if (local25.anInt1952 == 0) {
															local1011.method1180(local1793, local249, local235, local25.anInt1956, local25.aBoolean86 ? 0 : -1);
														} else if (local25.anInt1952 == 1) {
															local1011.method1200(local1793, local25.anInt1911 / 2 + local249, local235, local25.anInt1956, local25.aBoolean86 ? 0 : -1);
														} else {
															local1011.method1184(local1793, local249 + local25.anInt1911 - 1, local235, local25.anInt1956, local25.aBoolean86 ? 0 : -1);
														}
													}
													local106++;
												}
											}
										}
										if (local25.anInt1960 == 8 && Static59.method1061(local19, arg7) && Static78.anInt1706 == Static24.anInt701) {
											local488 = 0;
											local106 = 0;
											@Pc(1946) Class1_Sub2_Sub2_Sub3 local1946 = Static42.aClass1_Sub2_Sub2_Sub3_1;
											@Pc(1949) Class25 local1949 = local25.aClass25_941;
											local1949 = Static10.method249(local25, local1949);
											@Pc(1969) Class25 local1969;
											while (local1949.method762() > 0) {
												local644 = local1949.method796(Static104.aClass25_1129);
												if (local644 == -1) {
													local1969 = local1949;
													local1949 = Static92.aClass25_985;
												} else {
													local1969 = local1949.method781(0, local644);
													local1949 = local1949.method794(local644 + 4);
												}
												local249 = local1946.method1187(local1969);
												if (local488 < local249) {
													local488 = local249;
												}
												local106 += local1946.anInt1519 + 1;
											}
											local106 += 7;
											local249 = local71 + local25.anInt1923 + 5;
											if (arg4 < local249 + local106) {
												local249 = arg4 - local106;
											}
											local488 += 6;
											local644 = local60 + local25.anInt1911 - local488 - 5;
											if (local60 + 5 > local644) {
												local644 = local60 + 5;
											}
											if (arg1 < local488 + local644) {
												local644 = arg1 - local488;
											}
											Static128.method1935(local644, local249, local488, local106, 16777120);
											Static128.method1938(local644, local249, local488, local106, 0);
											local235 = local1946.anInt1519 + local249 + 2;
											local1949 = local25.aClass25_941;
											local1949 = Static10.method249(local25, local1949);
											while (local1949.method762() > 0) {
												local260 = local1949.method796(Static104.aClass25_1129);
												if (local260 == -1) {
													local1969 = local1949;
													local1949 = Static92.aClass25_985;
												} else {
													local1969 = local1949.method781(0, local260);
													local1949 = local1949.method794(local260 + 4);
												}
												local1946.method1180(local1969, local644 + 3, local235, 0, -1);
												local235 += local1946.anInt1519 + 1;
											}
										}
										if (local25.anInt1960 == 9) {
											if (local25.anInt1958 == 1) {
												Static128.method1940(local60, local71, local60 + local25.anInt1911, local25.anInt1923 + local71, local25.anInt1956);
											} else {
												local488 = local25.anInt1911 >= 0 ? local25.anInt1911 : -local25.anInt1911;
												local106 = local25.anInt1923 >= 0 ? local25.anInt1923 : -local25.anInt1923;
												local108 = local488;
												if (local106 > local488) {
													local108 = local106;
												}
												if (local108 != 0) {
													local506 = (local25.anInt1911 << 16) / local108;
													local515 = (local25.anInt1923 << 16) / local108;
													if (local515 <= local506) {
														local506 = -local506;
													} else {
														local515 = -local515;
													}
													local644 = local515 * local25.anInt1958 >> 17;
													local249 = local515 * local25.anInt1958 + 1 >> 17;
													local235 = local506 * local25.anInt1958 >> 17;
													local255 = local644 + local60;
													local260 = local25.anInt1958 * local506 + 1 >> 17;
													local711 = local60 - local249;
													local1404 = local60 + local25.anInt1911 - local249;
													@Pc(2265) int local2265 = local644 + local25.anInt1911 + local60;
													@Pc(2270) int local2270 = local71 + local235;
													@Pc(2274) int local2274 = local71 - local260;
													@Pc(2282) int local2282 = local71 + local25.anInt1923 - local260;
													@Pc(2289) int local2289 = local235 + local25.anInt1923 + local71;
													Static36.method834(local255, local711, local1404);
													Static36.method843(local2270, local2274, local2282, local255, local711, local1404, local25.anInt1956);
													Static36.method834(local255, local1404, local2265);
													Static36.method843(local2270, local2282, local2289, local255, local1404, local2265, local25.anInt1956);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return local12;
	}
}
