import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "I")
	public static int anInt3781;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1339 = Static151.method2243("<col=ff7000>");

	@OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
	public static final int[] anIntArray332 = new int[100];

	@OriginalMember(owner = "client!si", name = "d", descriptor = "[I")
	public static final int[] anIntArray333 = new int[1000];

	@OriginalMember(owner = "client!si", name = "h", descriptor = "I")
	public static int anInt3784 = 127;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1340 = Static151.method2243("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!si", name = "p", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1341 = Static151.method2243(":trade:");

	@OriginalMember(owner = "client!si", name = "t", descriptor = "[Lclient!fc;")
	public static final Class32[] aClass32Array1 = new Class32[4];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIBI)V")
	public static void method2619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		Static19.method345(arg3, Static55.anIntArrayArray8[arg0], arg2 - arg1, arg2 - -arg1);
		@Pc(27) int local27 = arg1;
		@Pc(30) int local30 = -arg1;
		@Pc(32) int local32 = -1;
		while (local7 < local27) {
			local32 += 2;
			local30 += local32;
			local7++;
			if (local30 >= 0) {
				local27--;
				@Pc(52) int[] local52 = Static55.anIntArrayArray8[arg0 + local27];
				local30 -= local27 << 1;
				@Pc(62) int local62 = local7 + arg2;
				@Pc(69) int[] local69 = Static55.anIntArrayArray8[arg0 - local27];
				@Pc(74) int local74 = arg2 - local7;
				Static19.method345(arg3, local52, local74, local62);
				Static19.method345(arg3, local69, local74, local62);
			}
			@Pc(91) int local91 = arg2 + local27;
			@Pc(98) int[] local98 = Static55.anIntArrayArray8[arg0 + local7];
			@Pc(105) int[] local105 = Static55.anIntArrayArray8[arg0 - local7];
			@Pc(110) int local110 = arg2 - local27;
			Static19.method345(arg3, local98, local110, local91);
			Static19.method345(arg3, local105, local110, local91);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!mb;")
	public static Class62 method2621(@OriginalArg(0) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = arg0.getBytes();
		}
		@Pc(18) Class62 local18 = new Class62();
		local18.anInt2653 = 0;
		local18.aByteArray28 = local9;
		for (@Pc(26) int local26 = 0; local26 < local9.length; local26++) {
			if (local9[local26] != 0) {
				local9[local18.anInt2653++] = local9[local26];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)I")
	public static int method2622() {
		@Pc(9) int local9 = Static175.method2548(Static29.anInt721, Static126.anInt2806, Static42.anInt4286);
		return local9 - Static127.anInt2813 >= 800 || (Static133.aByteArrayArrayArray11[Static126.anInt2806][Static42.anInt4286 >> 7][Static29.anInt721 >> 7] & 0x4) == 0 ? 3 : Static126.anInt2806;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IBIIIIIII[Lclient!ii;)V")
	public static void method2624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class47[] arg8) {
		Static212.method3095(arg0, arg6, arg1, arg5);
		Static45.method700();
		for (@Pc(22) int local22 = 0; local22 < arg8.length; local22++) {
			@Pc(28) Class47 local28 = arg8[local22];
			if (local28 != null && (arg7 == local28.anInt1877 || arg7 == -1412584499 && local28 == Static13.aClass47_2)) {
				@Pc(52) int local52;
				if (arg4 == -1) {
					anIntArray332[Static29.anInt713] = arg3 + local28.anInt1865;
					Static209.anIntArray391[Static29.anInt713] = arg2 + local28.anInt1912;
					Static11.anIntArray26[Static29.anInt713] = local28.anInt1910;
					Static115.anIntArray237[Static29.anInt713] = local28.anInt1858;
					local52 = Static29.anInt713++;
				} else {
					local52 = arg4;
				}
				local28.anInt1900 = Static25.anInt581;
				local28.anInt1897 = local52;
				if (!local28.aBoolean95 || !Static85.method1204(local28)) {
					if (local28.anInt1893 > 0) {
						Static26.method2654(local28);
					}
					@Pc(108) int local108 = local28.anInt1912 + arg2;
					@Pc(113) int local113 = arg3 + local28.anInt1865;
					@Pc(116) int local116 = local28.anInt1916;
					if (Static172.aBoolean27 && (Static155.method2304(local28) != 0 || local28.anInt1870 == 0) && local116 > 127) {
						local116 = 127;
					}
					@Pc(161) int local161;
					@Pc(197) int local197;
					if (Static13.aClass47_2 == local28) {
						if (arg7 != -1412584499 && !local28.aBoolean94) {
							Static186.anInt3890 = arg3;
							Static114.aClass47Array2 = arg8;
							Static214.anInt4475 = arg2;
							continue;
						}
						if (!local28.aBoolean94) {
							local116 = 128;
						}
						if (Static169.aBoolean155 && Static90.aBoolean5) {
							local161 = Static163.anInt3446;
							local161 -= Static56.anInt1141;
							if (local161 < Static121.anInt2679) {
								local161 = Static121.anInt2679;
							}
							if (local28.anInt1910 + local161 > Static35.aClass47_4.anInt1910 + Static121.anInt2679) {
								local161 = Static121.anInt2679 + Static35.aClass47_4.anInt1910 - local28.anInt1910;
							}
							local197 = Static32.anInt773;
							local113 = local161;
							local197 -= Static203.anInt4218;
							if (Static23.anInt557 > local197) {
								local197 = Static23.anInt557;
							}
							if (Static35.aClass47_4.anInt1858 + Static23.anInt557 < local197 - -local28.anInt1858) {
								local197 = Static35.aClass47_4.anInt1858 + Static23.anInt557 - local28.anInt1858;
							}
							local108 = local197;
						}
					}
					@Pc(238) int local238;
					@Pc(236) int local236;
					@Pc(260) int local260;
					@Pc(272) int local272;
					if (local28.anInt1870 == 2) {
						local236 = arg5;
						local238 = arg1;
						local197 = arg6;
						local161 = arg0;
					} else {
						local161 = arg0 >= local113 ? arg0 : local113;
						local260 = local28.anInt1910 + local113;
						local197 = arg6 >= local108 ? arg6 : local108;
						local272 = local108 + local28.anInt1858;
						if (local28.anInt1870 == 9) {
							local260++;
							local272++;
						}
						local236 = local272 >= arg5 ? arg5 : local272;
						local238 = local260 >= arg1 ? arg1 : local260;
					}
					if (!local28.aBoolean95 || local161 < local238 && local197 < local236) {
						if (local28.anInt1893 != 0) {
							if (local28.anInt1893 == 1337) {
								Static26.anInt3841 = local113;
								Static197.anInt4092 = local108;
								Static180.method2615(local28.anInt1910, local28.anInt1858, local108, local113);
								Static212.method3095(arg0, arg6, arg1, arg5);
								continue;
							}
							if (local28.anInt1893 == 1338) {
								if (local28.method1254()) {
									Static35.method609(local113, local52, local28, local108);
									Static212.method3095(arg0, arg6, arg1, arg5);
								}
								continue;
							}
							if (local28.anInt1893 == 1339) {
								if (local28.method1254()) {
									Static31.method535(local28, local108, local52, local113);
									Static212.method3095(arg0, arg6, arg1, arg5);
								}
								continue;
							}
							if (local28.anInt1893 == 1400) {
								Static41.method3187(local113, local28.anInt1858, local108, local28.anInt1910);
								Static176.aBooleanArray19[local52] = true;
								Static32.aBooleanArray3[local52] = true;
								Static212.method3095(arg0, arg6, arg1, arg5);
								continue;
							}
							if (local28.anInt1893 == 1401) {
								Static72.method995(local108, local113, local28.anInt1858, local28.anInt1910);
								Static176.aBooleanArray19[local52] = true;
								Static32.aBooleanArray3[local52] = true;
								Static212.method3095(arg0, arg6, arg1, arg5);
								continue;
							}
						}
						local260 = Static163.anInt3446;
						if (local28.anInt1870 == 0 && local28.aBoolean98 && local161 <= Static163.anInt3446 && Static32.anInt773 >= local197 && Static163.anInt3446 < local238 && Static32.anInt773 < local236 && !Static180.aBoolean167 && !Static172.aBoolean27) {
							Static26.aShortArray134[0] = 1007;
							Static51.anInt1111 = 1;
							Static6.aClass62Array5[0] = Static169.aClass62_1265;
							Static87.aClass62Array53[0] = Static69.aClass62_484;
						}
						local272 = Static32.anInt773;
						if (!Static180.aBoolean167 && local260 >= local161 && local197 <= local272 && local260 < local238 && local272 < local236) {
							Static71.method989(local272 - local108, local28, local260 - local113);
						}
						if (local28.anInt1870 == 0) {
							if (!local28.aBoolean95 && Static85.method1204(local28) && local28 != Static6.aClass47_1) {
								continue;
							}
							if (!local28.aBoolean95) {
								if (local28.anInt1836 > local28.anInt1911 - local28.anInt1858) {
									local28.anInt1836 = local28.anInt1911 - local28.anInt1858;
								}
								if (local28.anInt1836 < 0) {
									local28.anInt1836 = 0;
								}
							}
							method2624(local161, local238, local108 - local28.anInt1836, local113 + -local28.anInt1891, local52, local236, local197, local28.anInt1886, arg8);
							if (local28.aClass47Array1 != null) {
								method2624(local161, local238, local108 - local28.anInt1836, -local28.anInt1891 + local113, local52, local236, local197, local28.anInt1886, local28.aClass47Array1);
							}
							@Pc(635) Class2_Sub7 local635 = (Class2_Sub7) Static49.aClass58_7.method1704((long) local28.anInt1886);
							if (local635 != null) {
								if (local635.anInt1409 == 0 && Static163.anInt3446 >= local161 && Static32.anInt773 >= local197 && local238 > Static163.anInt3446 && local236 > Static32.anInt773 && !Static180.aBoolean167 && !Static172.aBoolean27) {
									Static51.anInt1111 = 1;
									Static26.aShortArray134[0] = 1007;
									Static6.aClass62Array5[0] = Static169.aClass62_1265;
									Static87.aClass62Array53[0] = Static69.aClass62_484;
								}
								Static148.method2212(local108, local635.anInt1410, local236, local161, local52, local113, local238, local197);
							}
							Static212.method3095(arg0, arg6, arg1, arg5);
							Static45.method700();
						}
						if (Static21.aBooleanArray2[local52] || Static182.anInt3831 > 1) {
							if (local28.anInt1870 == 0 && !local28.aBoolean95 && local28.anInt1858 < local28.anInt1911) {
								Static26.method2659(local28.anInt1858, local113 + local28.anInt1910, local108, local28.anInt1911, local28.anInt1836);
							}
							if (local28.anInt1870 != 1) {
								@Pc(760) int local760;
								@Pc(764) int local764;
								@Pc(776) int local776;
								@Pc(926) int local926;
								@Pc(821) int local821;
								@Pc(758) int local758;
								@Pc(911) int local911;
								@Pc(785) int local785;
								if (local28.anInt1870 == 2) {
									local758 = 0;
									for (local760 = 0; local760 < local28.anInt1837; local760++) {
										for (local764 = 0; local764 < local28.anInt1845; local764++) {
											local776 = local113 + local764 * (local28.anInt1843 + 32);
											local785 = local108 + (local28.anInt1903 + 32) * local760;
											if (local758 < 20) {
												local785 += local28.anIntArray165[local758];
												local776 += local28.anIntArray163[local758];
											}
											if (local28.anIntArray169[local758] > 0) {
												local821 = local28.anIntArray169[local758] - 1;
												if (local776 + 32 > arg0 && arg1 > local776 && local785 + 32 > arg6 && arg5 > local785 || Static13.aClass47_3 == local28 && Static139.anInt2941 == local758) {
													@Pc(873) Class2_Sub1_Sub2 local873;
													if (Static97.anInt2284 == 1 && Static61.anInt1288 == local758 && local28.anInt1886 == Static103.anInt2276) {
														local873 = Static23.method423(0, 2, local821, local28.aBoolean89, local28.anIntArray166[local758]);
													} else {
														local873 = Static23.method423(3153952, 1, local821, local28.aBoolean89, local28.anIntArray166[local758]);
													}
													if (local873 == null) {
														Static165.method2410(local28);
													} else if (Static13.aClass47_3 == local28 && Static139.anInt2941 == local758) {
														local911 = Static163.anInt3446 - Static112.anInt2449;
														if (local911 < 5 && local911 > -5) {
															local911 = 0;
														}
														local926 = Static32.anInt773 - Static3.anInt136;
														if (local926 < 5 && local926 > -5) {
															local926 = 0;
														}
														if (Static157.anInt3330 < 5) {
															local911 = 0;
															local926 = 0;
														}
														local873.method274(local776 + local911, local926 + local785, 128);
														if (arg7 != -1) {
															@Pc(960) Class47 local960 = arg8[arg7 & 0xFFFF];
															@Pc(962) int local962 = Static212.anInt4426;
															@Pc(964) int local964 = Static212.anInt4428;
															@Pc(986) int local986;
															if (local785 + local926 < local962 && local960.anInt1836 > 0) {
																local986 = (local962 - local785 - local926) * Static103.anInt2221 / 3;
																if (local986 > Static103.anInt2221 * 10) {
																	local986 = Static103.anInt2221 * 10;
																}
																if (local960.anInt1836 < local986) {
																	local986 = local960.anInt1836;
																}
																local960.anInt1836 -= local986;
																Static3.anInt136 += local986;
																Static165.method2410(local960);
															}
															if (local785 + local926 + 32 > local964 && local960.anInt1836 < local960.anInt1911 - local960.anInt1858) {
																local986 = Static103.anInt2221 * (local926 + local785 + 32 - local964) / 3;
																if (Static103.anInt2221 * 10 < local986) {
																	local986 = Static103.anInt2221 * 10;
																}
																if (local986 > local960.anInt1911 - local960.anInt1836 - local960.anInt1858) {
																	local986 = local960.anInt1911 - local960.anInt1836 - local960.anInt1858;
																}
																Static3.anInt136 -= local986;
																local960.anInt1836 += local986;
																Static165.method2410(local960);
															}
														}
													} else if (Static83.aClass47_7 == local28 && Static14.anInt339 == local758) {
														local873.method274(local776, local785, 128);
													} else {
														local873.method280(local776, local785);
													}
												}
											} else if (local28.anIntArray164 != null && local758 < 20) {
												@Pc(1136) Class2_Sub1_Sub2 local1136 = local28.method1245(local758);
												if (local1136 != null) {
													local1136.method280(local776, local785);
												} else if (Static106.aBoolean112) {
													Static165.method2410(local28);
												}
											}
											local758++;
										}
									}
								} else if (local28.anInt1870 == 3) {
									if (Static96.method1460(local28)) {
										local758 = local28.anInt1833;
										if (Static6.aClass47_1 == local28 && local28.anInt1862 != 0) {
											local758 = local28.anInt1862;
										}
									} else {
										local758 = local28.anInt1857;
										if (local28 == Static6.aClass47_1 && local28.anInt1839 != 0) {
											local758 = local28.anInt1839;
										}
									}
									if (local116 == 0) {
										if (local28.aBoolean96) {
											Static212.method3103(local113, local108, local28.anInt1910, local28.anInt1858, local758);
										} else {
											Static212.method3106(local113, local108, local28.anInt1910, local28.anInt1858, local758);
										}
									} else if (local28.aBoolean96) {
										Static212.method3109(local113, local108, local28.anInt1910, local28.anInt1858, local758, 256 - (local116 & 0xFF));
									} else {
										Static212.method3092(local113, local108, local28.anInt1910, local28.anInt1858, local758, 256 - (local116 & 0xFF));
									}
								} else {
									@Pc(1273) Class2_Sub1_Sub12 local1273;
									if (local28.anInt1870 == 4) {
										local1273 = local28.method1246(Static78.aClass42Array5);
										if (local1273 != null) {
											@Pc(1285) Class62 local1285 = local28.aClass62_615;
											if (Static96.method1460(local28)) {
												local760 = local28.anInt1833;
												if (local28 == Static6.aClass47_1 && local28.anInt1862 != 0) {
													local760 = local28.anInt1862;
												}
												if (local28.aClass62_616.method1878() > 0) {
													local1285 = local28.aClass62_616;
												}
											} else {
												local760 = local28.anInt1857;
												if (Static6.aClass47_1 == local28 && local28.anInt1839 != 0) {
													local760 = local28.anInt1839;
												}
											}
											if (local28.aBoolean95 && local28.anInt1904 != -1) {
												@Pc(1341) Class2_Sub1_Sub26 local1341 = Static52.method774(local28.anInt1904);
												local1285 = local1341.aClass62_1540;
												if (local1285 == null) {
													local1285 = Static91.aClass62_722;
												}
												if ((local1341.anInt4541 == 1 || local28.anInt1876 != 1) && local28.anInt1876 != -1) {
													local1285 = Static169.method2460(new Class62[] { Static209.aClass62_1504, local1285, Static74.aClass62_530, Static22.method395(local28.anInt1876) });
												}
											}
											if (local28 == Static154.aClass47_14) {
												local1285 = Static25.aClass62_171;
												local760 = local28.anInt1857;
											}
											if (!local28.aBoolean95) {
												local1285 = Static27.method464(local28, local1285);
											}
											local1273.method1382(local1285, local113, local108, local28.anInt1910, local28.anInt1858, local760, local28.aBoolean101 ? 0 : -1, local28.anInt1889, local28.anInt1901, local28.anInt1840);
										} else if (Static106.aBoolean112) {
											Static165.method2410(local28);
										}
									} else if (local28.anInt1870 == 5) {
										@Pc(1451) Class2_Sub1_Sub2 local1451;
										if (local28.aBoolean95) {
											if (local28.anInt1904 == -1) {
												local1451 = local28.method1240(false);
											} else {
												local1451 = Static23.method423(local28.anInt1832, local28.anInt1896, local28.anInt1904, local28.aBoolean89, local28.anInt1876);
											}
											if (local1451 != null) {
												local760 = local1451.anInt405;
												local764 = local1451.anInt402;
												if (local28.aBoolean99) {
													local785 = (local764 + local28.anInt1858 - 1) / local764;
													local776 = (local760 + local28.anInt1910 - 1) / local760;
													Static212.method3110(local113, local108, local113 + local28.anInt1910, local28.anInt1858 + local108);
													for (local911 = 0; local911 < local776; local911++) {
														for (local926 = 0; local926 < local785; local926++) {
															if (local28.anInt1913 != 0) {
																local1451.method272(local764 / 2 + local926 * local764 + local108, local28.anInt1913, 4096, local760 / 2 + local113 + local911 * local760);
															} else if (local116 == 0) {
																local1451.method280(local113 + local760 * local911, local108 - -(local764 * local926));
															} else {
																local1451.method274(local113 + local911 * local760, local764 * local926 + local108, 256 - (local116 & 0xFF));
															}
														}
													}
													Static212.method3095(arg0, arg6, arg1, arg5);
												} else {
													local776 = local28.anInt1910 * 4096 / local760;
													if (local28.anInt1913 != 0) {
														local1451.method272(local28.anInt1858 / 2 + local108, local28.anInt1913, local776, local113 + local28.anInt1910 / 2);
													} else if (local116 != 0) {
														local1451.method270(local113, local108, local28.anInt1910, local28.anInt1858, 256 - (local116 & 0xFF));
													} else if (local760 == local28.anInt1910 && local764 == local28.anInt1858) {
														local1451.method280(local113, local108);
													} else {
														local1451.method276(local113, local108, local28.anInt1910, local28.anInt1858);
													}
												}
											} else if (Static106.aBoolean112) {
												Static165.method2410(local28);
											}
										} else {
											local1451 = local28.method1240(Static96.method1460(local28));
											if (local1451 != null) {
												local1451.method280(local113, local108);
											} else if (Static106.aBoolean112) {
												Static165.method2410(local28);
											}
										}
									} else {
										@Pc(1750) Class2_Sub1_Sub26 local1750;
										@Pc(1975) int local1975;
										if (local28.anInt1870 == 6) {
											@Pc(1726) boolean local1726 = Static96.method1460(local28);
											@Pc(1728) Class7_Sub7 local1728 = null;
											if (local1726) {
												local760 = local28.anInt1883;
											} else {
												local760 = local28.anInt1842;
											}
											local776 = 0;
											if (local28.anInt1904 != -1) {
												local1750 = Static52.method774(local28.anInt1904);
												if (local1750 != null) {
													local1750 = local1750.method3194(local28.anInt1876);
													local1728 = local1750.method3201(1, null, 0);
													if (local1728 == null) {
														Static165.method2410(local28);
													} else {
														local776 = -local1728.method3148() / 2;
													}
												}
											} else if (local28.anInt1855 == 5) {
												if (local28.anInt1881 == -1) {
													local1728 = Static27.aClass28_1.method718(-1, -1, null, null);
												} else {
													local785 = local28.anInt1881 & 0x7FF;
													if (Static59.anInt1225 == local785) {
														local785 = 2047;
													}
													@Pc(1854) Class7_Sub2_Sub2 local1854 = Static62.aClass7_Sub2_Sub2Array1[local785];
													@Pc(1864) Class2_Sub1_Sub25 local1864 = local760 == -1 ? null : Static90.method27(local760);
													if (local1854 != null && (int) local1854.aClass62_1072.method1843() << 11 == (local28.anInt1881 & 0xFFFFF800)) {
														local1728 = local1854.aClass28_2.method718(local28.anInt1869, 0, local1864, null);
													}
												}
											} else if (local760 == -1) {
												local1728 = local28.method1244(local1726, -1, null, Static186.aClass7_Sub2_Sub2_1.aClass28_2);
												if (local1728 == null && Static106.aBoolean112) {
													Static165.method2410(local28);
												}
											} else {
												@Pc(1811) Class2_Sub1_Sub25 local1811 = Static90.method27(local760);
												local1728 = local28.method1244(local1726, local28.anInt1869, local1811, Static186.aClass7_Sub2_Sub2_1.aClass28_2);
												if (local1728 == null && Static106.aBoolean112) {
													Static165.method2410(local28);
												}
											}
											if (local1728 != null) {
												if (local28.anInt1909 > 0) {
													local785 = (local28.anInt1910 << 8) / local28.anInt1909;
												} else {
													local785 = 256;
												}
												if (local28.anInt1846 > 0) {
													local911 = (local28.anInt1858 << 8) / local28.anInt1846;
												} else {
													local911 = 256;
												}
												local821 = local108 + local28.anInt1858 / 2 + (local28.anInt1878 * local911 >> 8);
												local926 = local28.anInt1910 / 2 + local113 + (local785 * local28.anInt1914 >> 8);
												Static45.method696(local926, local821);
												local1975 = local28.anInt1875 * Class26.anIntArray77[local28.anInt1863] >> 16;
												@Pc(1985) int local1985 = local28.anInt1875 * Class26.anIntArray76[local28.anInt1863] >> 16;
												if (!local28.aBoolean95) {
													local1728.method3166(local28.anInt1859, 0, local28.anInt1863, 0, local1975, local1985);
												} else if (local28.aBoolean88) {
													((Class7_Sub7_Sub1) local1728).method3180(local28.anInt1859, local28.anInt1854, local28.anInt1863, local28.anInt1873, local1975 + local776 + local28.anInt1902, local28.anInt1902 + local1985, local28.anInt1875);
												} else {
													local1728.method3166(local28.anInt1859, local28.anInt1854, local28.anInt1863, local28.anInt1873, local28.anInt1902 + local776 + local1975, local1985 + local28.anInt1902);
												}
												Static45.method697();
											}
										} else {
											if (local28.anInt1870 == 7) {
												local1273 = local28.method1246(Static78.aClass42Array5);
												if (local1273 == null) {
													if (Static106.aBoolean112) {
														Static165.method2410(local28);
													}
													continue;
												}
												local760 = 0;
												for (local764 = 0; local764 < local28.anInt1837; local764++) {
													for (local776 = 0; local776 < local28.anInt1845; local776++) {
														if (local28.anIntArray169[local760] > 0) {
															local1750 = Static52.method774(local28.anIntArray169[local760] - 1);
															@Pc(2137) Class62 local2137;
															if (local1750.anInt4541 != 1 && local28.anIntArray166[local760] == 1) {
																local2137 = Static169.method2460(new Class62[] { Static209.aClass62_1504, local1750.aClass62_1540, Static54.aClass62_385 });
															} else {
																local2137 = Static169.method2460(new Class62[] { Static209.aClass62_1504, local1750.aClass62_1540, Static74.aClass62_530, Static22.method395(local28.anIntArray166[local760]) });
															}
															local926 = local113 + (local28.anInt1843 + 115) * local776;
															local821 = local764 * (local28.anInt1903 + 12) + local108;
															if (local28.anInt1889 == 0) {
																local1273.method1366(local2137, local926, local821, local28.anInt1857, local28.aBoolean101 ? 0 : -1);
															} else if (local28.anInt1889 == 1) {
																local1273.method1370(local2137, local926 + 57, local821, local28.anInt1857, local28.aBoolean101 ? 0 : -1);
															} else {
																local1273.method1374(local2137, local926 + 114, local821, local28.anInt1857, local28.aBoolean101 ? 0 : -1);
															}
														}
														local760++;
													}
												}
											}
											if (local28.anInt1870 == 8 && Static151.aClass47_13 == local28 && Static186.anInt3867 == Static58.anInt1149) {
												local758 = 0;
												@Pc(2259) Class2_Sub1_Sub12 local2259 = Static13.aClass2_Sub1_Sub12_2;
												local760 = 0;
												@Pc(2264) Class62 local2264 = local28.aClass62_615;
												local2264 = Static27.method464(local28, local2264);
												@Pc(2287) Class62 local2287;
												while (local2264.method1878() > 0) {
													local911 = local2264.method1869(Static28.aClass62_203);
													if (local911 == -1) {
														local2287 = local2264;
														local2264 = Static69.aClass62_484;
													} else {
														local2287 = local2264.method1862(0, local911);
														local2264 = local2264.method1849(local911 + 4);
													}
													local926 = local2259.method1384(local2287);
													if (local926 > local758) {
														local758 = local926;
													}
													local760 += local2259.anInt2021 + 1;
												}
												local758 += 6;
												local911 = local28.anInt1910 + local113 - local758 - 5;
												if (local911 < local113 + 5) {
													local911 = local113 + 5;
												}
												local760 += 7;
												if (arg1 < local758 + local911) {
													local911 = arg1 - local758;
												}
												local926 = local28.anInt1858 + local108 + 5;
												if (local926 + local760 > arg5) {
													local926 = arg5 - local760;
												}
												Static212.method3103(local911, local926, local758, local760, 16777120);
												Static212.method3106(local911, local926, local758, local760, 0);
												local2264 = local28.aClass62_615;
												local821 = local2259.anInt2021 + local926 + 2;
												local2264 = Static27.method464(local28, local2264);
												while (local2264.method1878() > 0) {
													local1975 = local2264.method1869(Static28.aClass62_203);
													if (local1975 == -1) {
														local2287 = local2264;
														local2264 = Static69.aClass62_484;
													} else {
														local2287 = local2264.method1862(0, local1975);
														local2264 = local2264.method1849(local1975 + 4);
													}
													local2259.method1366(local2287, local911 + 3, local821, 0, -1);
													local821 += local2259.anInt2021 + 1;
												}
											}
											if (local28.anInt1870 == 9) {
												if (local28.aBoolean90) {
													local764 = local113 + local28.anInt1910;
													local760 = local28.anInt1858 + local108;
													local776 = local108;
												} else {
													local760 = local108;
													local776 = local28.anInt1858 + local108;
													local764 = local113 + local28.anInt1910;
												}
												if (local28.anInt1867 == 1) {
													Static212.method3096(local113, local760, local764, local776, local28.anInt1857);
												} else {
													Static212.method3104(local113, local760, local764, local776, local28.anInt1857, local28.anInt1867);
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
	}
}
