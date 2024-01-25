import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	public static int anInt821;

	@OriginalMember(owner = "client!co", name = "g", descriptor = "[Lclient!ro;")
	public static Class175[] aClass175Array1;

	@OriginalMember(owner = "client!co", name = "b", descriptor = "I")
	public static int anInt819 = -1;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_15 = new Class140("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!co", name = "i", descriptor = "I")
	public static final int anInt824 = 1400;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(CZ)C")
	public static char method938(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII[Lclient!fh;III)V")
	public static void method940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class68[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static51.aClass37_1.method3677(arg5, arg8, arg2, arg4);
		for (@Pc(13) int local13 = 0; local13 < arg6.length; local13++) {
			@Pc(21) Class68 local21 = arg6[local13];
			if (local21 != null && (arg3 == local21.anInt1830 || arg3 == -1412584499 && local21 == Static18.aClass68_1)) {
				@Pc(46) int local46;
				if (arg0 == -1) {
					Class58.aRectangleArray2[Static236.anInt928].setBounds(local21.anInt1831 + arg1, arg7 + local21.anInt1833, local21.anInt1874, local21.anInt1845);
					local46 = Static236.anInt928++;
				} else {
					local46 = arg0;
				}
				local21.anInt1858 = Static6.anInt91;
				local21.anInt1839 = local46;
				if (!Static46.method877(local21)) {
					if (local21.anInt1829 != 0) {
						Static85.method1711(local21);
					}
					@Pc(94) int local94 = arg1 + local21.anInt1831;
					@Pc(99) int local99 = arg7 + local21.anInt1833;
					@Pc(102) int local102 = local21.anInt1875;
					if (Static334.aBoolean581 && (Static46.method890(local21).anInt6736 != 0 || local21.anInt1871 == 0) && local102 > 127) {
						local102 = 127;
					}
					@Pc(161) int local161;
					@Pc(165) int local165;
					if (local21 == Static18.aClass68_1) {
						if (arg3 != -1412584499 && (local21.anInt1849 == Static99.anInt2034 || Static212.anInt4618 == local21.anInt1849)) {
							Static112.aClass68Array2 = arg6;
							Static90.anInt1766 = arg1;
							Static357.anInt6823 = arg7;
							continue;
						}
						if (Static268.aBoolean489 && Static193.aBoolean354) {
							local161 = Class1_Sub2_Sub5.lb.method2470();
							local165 = Class1_Sub2_Sub5.lb.method2466();
							local165 -= Static214.anInt4719;
							local161 -= Static68.anInt1184;
							if (local161 < Static180.anInt4016) {
								local161 = Static180.anInt4016;
							}
							if (local165 < Static84.anInt1567) {
								local165 = Static84.anInt1567;
							}
							if (Static132.aClass68_20.anInt1874 + Static180.anInt4016 < local21.anInt1874 + local161) {
								local161 = Static132.aClass68_20.anInt1874 + Static180.anInt4016 - local21.anInt1874;
							}
							local94 = local161;
							if (local165 + local21.anInt1845 > Static84.anInt1567 + Static132.aClass68_20.anInt1845) {
								local165 = Static132.aClass68_20.anInt1845 + Static84.anInt1567 - local21.anInt1845;
							}
							local99 = local165;
						}
						if (Static212.anInt4618 == local21.anInt1849) {
							local102 = 128;
						}
					}
					@Pc(253) int local253;
					@Pc(249) int local249;
					@Pc(263) int local263;
					@Pc(268) int local268;
					if (local21.anInt1871 == 2) {
						local249 = arg4;
						local161 = arg5;
						local253 = arg2;
						local165 = arg8;
					} else {
						local263 = local94 + local21.anInt1874;
						local268 = local21.anInt1845 + local99;
						if (local21.anInt1871 == 9) {
							local263++;
							local268++;
						}
						local165 = local99 <= arg8 ? arg8 : local99;
						local161 = arg5 < local94 ? local94 : arg5;
						local249 = local268 >= arg4 ? arg4 : local268;
						local253 = local263 >= arg2 ? arg2 : local263;
					}
					if (local253 > local161 && local165 < local249) {
						@Pc(564) int local564;
						@Pc(592) int local592;
						@Pc(594) int local594;
						@Pc(533) int local533;
						@Pc(535) int local535;
						if (local21.anInt1829 != 0) {
							if (Static126.anInt2714 == local21.anInt1829 || Static150.anInt3451 == local21.anInt1829) {
								Static82.method1679(local21.anInt1874, local94, local21.anInt1829 == Static150.anInt3451, local21.anInt1845, local99);
								Static269.aBooleanArray29[local46] = true;
								Static51.aClass37_1.method3677(arg5, arg8, arg2, arg4);
								continue;
							}
							if (local21.anInt1829 == Static245.anInt5189) {
								if (local21.method1871(Static51.aClass37_1) != null) {
									Static276.method4761();
									Static95.method1863(local94, local99, local21, Static51.aClass37_1);
									Static286.aBooleanArray25[local46] = true;
									Static51.aClass37_1.method3677(arg5, arg8, arg2, arg4);
								}
								continue;
							}
							if (Static135.anInt2911 == local21.anInt1829) {
								if (local21.method1871(Static51.aClass37_1) != null) {
									Static347.method5640(local21, local94, local99);
									Static286.aBooleanArray25[local46] = true;
									Static51.aClass37_1.method3677(arg5, arg8, arg2, arg4);
								}
								continue;
							}
							if (local21.anInt1829 == anInt824) {
								Static283.method4809(local94, Static358.anInterface3_7, Static51.aClass37_1, local21.anInt1874, local21.anInt1845, local99);
								Static269.aBooleanArray29[local46] = true;
								Static51.aClass37_1.method3677(arg5, arg8, arg2, arg4);
								continue;
							}
							if (Static171.anInt3866 == local21.anInt1829) {
								Static211.method5302(local94, Static51.aClass37_1, local21.anInt1845, local99, local21.anInt1874);
								Static269.aBooleanArray29[local46] = true;
								Static51.aClass37_1.method3677(arg5, arg8, arg2, arg4);
								continue;
							}
							if (local21.anInt1829 == Static301.anInt5991) {
								if (!Static311.aBoolean550 && !Static123.aBoolean256) {
									continue;
								}
								local263 = local21.anInt1874 + local94;
								local268 = local99 + 15;
								if (Static311.aBoolean550) {
									Static272.aClass71_4.method5235(-256, "Fps:" + Static212.anInt4619, local268, local263);
									local268 += 15;
									@Pc(523) Runtime local523 = Runtime.getRuntime();
									local533 = (int) ((local523.totalMemory() - local523.freeMemory()) / 1024L);
									local535 = -256;
									if (local533 > 65536) {
										local535 = -65536;
									}
									Static272.aClass71_4.method5235(local535, "Mem:" + local533 + "k", local268, local263);
									local268 += 15;
									local564 = Static51.aClass37_1.method3661() / 1024;
									Static272.aClass71_4.method5235(local564 > 65536 ? -65536 : -256, "Offheap:" + local564 + "k", local268, local263);
									local268 += 15;
									local592 = 0;
									local594 = 0;
									@Pc(596) int local596 = 0;
									for (@Pc(598) int local598 = 0; local598 < 29; local598++) {
										local592 += Static219.aClass138_Sub1Array1[local598].method4075();
										local594 += Static219.aClass138_Sub1Array1[local598].method4070();
										local596 += Static219.aClass138_Sub1Array1[local598].method4071();
									}
									@Pc(636) int local636 = local596 * 100 / local592;
									@Pc(642) int local642 = local594 * 10000 / local592;
									@Pc(662) String local662 = "Cache:" + Static247.method4391((long) local642, 0, 2, true) + "% (" + local636 + "%)";
									Static295.aClass71_5.method5235(-256, local662, local268, local263);
									local268 += 12;
								}
								if (Static212.anInt4627 > 0) {
									Static295.aClass71_5.method5235(-256, "Particles: " + Static331.anInt6405 + " / " + Static212.anInt4627, local268, local263);
								}
								local268 += 12;
								if (Static123.aBoolean256) {
									Static295.aClass71_5.method5235(-256, "Polys: " + Static51.aClass37_1.method3746() + " Models: " + Static51.aClass37_1.method3648(), local268, local263);
									local268 += 12;
									Static295.aClass71_5.method5235(-256, "Ls: " + Static151.anInt3469 + " La: " + Static105.anInt2192 + " NPC: " + Static152.anInt3476 + " Pl: " + Static237.anInt5080, local268, local263);
									local268 += 12;
									Static58.method1235();
								}
								Static269.aBooleanArray29[local46] = true;
								continue;
							}
						}
						if (local21.anInt1871 == 0) {
							if (Static114.anInt2419 == local21.anInt1829 && Static51.aClass37_1.method3719()) {
								Static51.aClass37_1.method3748(local94, local99, local21.anInt1874, local21.anInt1845);
							}
							method940(local46, local94 - local21.anInt1854, local253, local21.anInt1857, local249, local161, arg6, local99 - local21.anInt1872, local165);
							if (local21.aClass68Array1 != null) {
								method940(local46, local94 - local21.anInt1854, local253, local21.anInt1857, local249, local161, local21.aClass68Array1, local99 - local21.anInt1872, local165);
							}
							@Pc(822) Class2_Sub40 local822 = (Class2_Sub40) Static303.aClass41_32.method902((long) local21.anInt1857);
							if (local822 != null) {
								Static31.method431(local46, local249, local94, local822.anInt6092, local165, local161, local253, local99);
							}
							if (local21.anInt1829 == Static114.anInt2419 && Static51.aClass37_1.method3719()) {
								Static51.aClass37_1.method3651();
								Static236.aBoolean94 = true;
							}
							Static51.aClass37_1.method3677(arg5, arg8, arg2, arg4);
						}
						if (Static286.aBooleanArray24[local46] || Static218.anInt4843 > 1) {
							if (local21.anInt1871 == 3) {
								if (local102 == 0) {
									if (local21.aBoolean170) {
										Static51.aClass37_1.method3712(local94, local99, local21.anInt1874, local21.anInt1845, local21.anInt1888, 0);
									} else {
										Static51.aClass37_1.method3697(local94, local99, local21.anInt1874, local21.anInt1845, local21.anInt1888, 0);
									}
								} else if (local21.aBoolean170) {
									Static51.aClass37_1.method3712(local94, local99, local21.anInt1874, local21.anInt1845, 255 - (local102 & 0xFF) << 24 | local21.anInt1888 & 0xFFFFFF, 1);
								} else {
									Static51.aClass37_1.method3697(local94, local99, local21.anInt1874, local21.anInt1845, 255 - (local102 & 0xFF) << 24 | local21.anInt1888 & 0xFFFFFF, 1);
								}
							} else if (local21.anInt1871 == 4) {
								@Pc(960) Class71 local960 = local21.method1870(Static51.aClass37_1);
								if (local960 != null) {
									local268 = local21.anInt1888;
									@Pc(977) String local977 = local21.aString25;
									if (local21.anInt1890 != -1) {
										@Pc(987) Class122 local987 = Static310.aClass184_2.method5040(local21.anInt1890);
										local977 = local987.aString37;
										if (local977 == null) {
											local977 = "null";
										}
										if ((local987.anInt3923 == 1 || local21.anInt1866 != 1) && local21.anInt1866 != -1) {
											local977 = "<col=ff9040>" + local977 + "</col> x" + Static315.method5227(local21.anInt1866);
										}
									}
									if (local21 == Static91.aClass68_12) {
										local977 = Static349.aClass140_159.method4155(Static239.anInt2803);
										local268 = local21.anInt1888;
									}
									if (Static197.aBoolean358) {
										Static51.aClass37_1.method3696(local94, local99, local94 + local21.anInt1874, local99 + local21.anInt1845);
									}
									local960.method5246(local21.anInt1845, local21.aBoolean174 ? 255 - (local102 & 0xFF) << 24 : -1, local268 | 255 - (local102 & 0xFF) << 24, 0, 0, null, local94, Static270.aClass46Array42, local99, local21.anInt1874, null, local977, local21.anInt1870, local21.anInt1865, local21.anInt1834);
									if (Static197.aBoolean358) {
										Static51.aClass37_1.method3677(arg5, arg8, arg2, arg4);
									}
								} else if (Static17.aBoolean20) {
									Static114.method2241(local21);
								}
							} else {
								@Pc(1172) int local1172;
								if (local21.anInt1871 == 5) {
									if (local21.anInt1893 < 0) {
										@Pc(1150) Class46 local1150;
										if (local21.anInt1890 == -1) {
											local1150 = local21.method1868(Static51.aClass37_1);
										} else {
											@Pc(1132) Class217 local1132 = local21.aBoolean165 ? Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1 : null;
											local1150 = Static310.aClass184_2.method5049(local21.anInt1862 | 0xFF000000, local21.anInt1866, local21.anInt1864, local21.anInt1890, Static51.aClass37_1, local21.anInt1891, local1132);
										}
										if (local1150 != null) {
											local268 = local1150.method5031();
											local1172 = local1150.method5022();
											if (local21.aBoolean169) {
												Static51.aClass37_1.method3696(local94, local99, local21.anInt1874 + local94, local99 - -local21.anInt1845);
												if (local21.lb != 0) {
													local533 = (local21.anInt1874 + local268 - 1) / local268;
													local535 = (local1172 + local21.anInt1845 - 1) / local1172;
													for (local564 = 0; local564 < local533; local564++) {
														for (local592 = 0; local592 < local535; local592++) {
															local1150.method5030((float) (local94 + local268 * local564) + (float) local268 / 2.0F, (float) local1172 / 2.0F + (float) (local99 - -(local592 * local1172)), 4096, local21.lb);
														}
													}
												} else if (local102 == 0) {
													local1150.method5017(local94, local99, local21.anInt1874, local21.anInt1845, 0, 0);
												} else {
													local1150.method5017(local94, local99, local21.anInt1874, local21.anInt1845, 1, 255 - (local102 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static51.aClass37_1.method3677(arg5, arg8, arg2, arg4);
											} else if (local102 != 0) {
												local533 = 255 - (local102 & 0xFF) << 24 | 0xFFFFFF;
												if (local21.lb != 0) {
													local1150.method5033((float) local21.anInt1874 / 2.0F + (float) local94, (float) local99 + (float) local21.anInt1845 / 2.0F, local21.anInt1874 * 4096 / local268, local21.lb, local533);
												} else if (local21.anInt1874 == local268 && local1172 == local21.anInt1845) {
													local1150.method5034(local94, local99, 1, local533);
												} else {
													local1150.method5026(local94, local99, local21.anInt1874, local21.anInt1845, 1, local533, 1);
												}
											} else if (local21.lb != 0) {
												local1150.method5030((float) local94 + (float) local21.anInt1874 / 2.0F, (float) local99 + (float) local21.anInt1845 / 2.0F, local21.anInt1874 * 4096 / local268, local21.lb);
											} else if (local268 == local21.anInt1874 && local1172 == local21.anInt1845) {
												local1150.method5016(local94, local99);
											} else {
												local1150.method5021(local94, local99, local21.anInt1874, local21.anInt1845);
											}
										} else if (Static17.aBoolean20) {
											Static114.method2241(local21);
										}
									} else {
										local21.method1869().method4655(local21.anInt1900 << 3, local94, 0, local21.anInt1892 << 3, local99, local21.anInt1845, 0, local21.anInt1874, Static51.aClass37_1);
									}
								} else if (local21.anInt1871 == 6) {
									Static183.method3484();
									@Pc(1479) Class49 local1479 = null;
									local268 = 0;
									@Pc(1512) Class84 local1512;
									@Pc(1520) Class217 local1520;
									if (local21.anInt1890 != -1) {
										@Pc(1492) Class122 local1492 = Static310.aClass184_2.method5040(local21.anInt1890);
										if (local1492 != null) {
											local1492 = local1492.method3397(local21.anInt1866);
											local1512 = local21.anInt1880 == -1 ? null : Static91.method1822(local21.anInt1880);
											local1520 = local21.aBoolean165 ? Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1 : null;
											local1479 = local1492.method3402(1, 1024, local21.anInt1838, Static51.aClass37_1, local21.anInt1899, local21.anInt1906, local1512, local1520);
											if (local1479 == null) {
												Static114.method2241(local21);
											} else {
												local268 = -local1479.method5842() / 2;
											}
										}
									} else if (local21.anInt1897 == 5) {
										local1172 = local21.anInt1903;
										if (local1172 >= 0 && local1172 < 2048) {
											@Pc(1572) Class1_Sub2_Sub3_Sub1 local1572 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local1172];
											@Pc(1583) Class84 local1583 = local21.anInt1880 == -1 ? null : Static91.method1822(local21.anInt1880);
											if (local1572 != null && (Static217.anInt4819 == local1172 || Static232.method4276(local1572.aString34) == local21.anInt1896)) {
												local1479 = local1572.aClass217_1.method5674(null, 0, local1583, Static310.aClass184_2, Static51.aClass37_1, local21.anInt1899, 1024, local21.anInt1838, null, 0, local21.anInt1906, -1);
											}
										}
									} else if (local21.anInt1897 == 8 || local21.anInt1897 == 9) {
										@Pc(1635) Class2_Sub21 local1635 = Static238.method4329(false, local21.anInt1903);
										local1512 = local21.anInt1880 == -1 ? null : Static91.method1822(local21.anInt1880);
										if (local1635 != null) {
											local1520 = local21.aBoolean165 ? Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1 : null;
											local1479 = local1635.method2729(local21.anInt1906, Static51.aClass37_1, local21.anInt1897 == 9, local21.anInt1838, local1520, local1512, local21.anInt1896, local21.anInt1899);
										}
									} else if (local21.anInt1880 == -1) {
										local1479 = local21.method1861(-1, Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1, Static51.aClass37_1, -1, 1024, Static310.aClass184_2, null, 0);
										if (local1479 == null && Static17.aBoolean20) {
											Static114.method2241(local21);
										}
									} else {
										@Pc(1693) Class84 local1693 = Static91.method1822(local21.anInt1880);
										local1479 = local21.method1861(local21.anInt1906, Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1, Static51.aClass37_1, local21.anInt1899, 1024, Static310.aClass184_2, local1693, local21.anInt1838);
										if (local1479 == null && Static17.aBoolean20) {
											Static114.method2241(local21);
										}
									}
									if (local1479 != null) {
										if (local21.anInt1895 <= 0) {
											local1172 = 512;
										} else {
											local1172 = (local21.anInt1874 << 9) / local21.anInt1895;
										}
										if (local21.anInt1844 > 0) {
											local533 = (local21.anInt1845 << 9) / local21.anInt1844;
										} else {
											local533 = 512;
										}
										local535 = local94 + local21.anInt1874 / 2 + (local21.anInt1827 * local1172 >> 9);
										local564 = (local533 * local21.anInt1855 >> 9) + local21.anInt1845 / 2 + local99;
										Static297.aClass38_4.method4476();
										Static51.aClass37_1.method3682(Static297.aClass38_4);
										local592 = local21.anInt1861 * Class101.anIntArray234[local21.anInt1907 << 3] >> 15;
										local594 = Class101.anIntArray235[local21.anInt1907 << 3] * local21.anInt1861 >> 15;
										Static51.aClass37_1.method3716(local535, local564, local1172, local533);
										Static51.aClass37_1.method3662((float) local21.aShort33, local21.aBoolean163 ? (float) local21.aShort32 : (float) local21.aShort32 * 1.5F);
										if (arg3 == -1412584499 || Static236.aBoolean94) {
											Static51.aClass37_1.method3709();
											Static51.aClass37_1.method3665();
											Static51.aClass37_1.method3677(arg5, arg8, arg2, arg4);
											Static236.aBoolean94 = false;
										}
										if (local21.aBoolean168) {
											Static51.aClass37_1.method3675(false);
										}
										Static218.aClass38_3.method4475(-local21.anInt1835 << 3);
										Static218.aClass38_3.method4473(local21.anInt1887 << 3);
										Static218.aClass38_3.method4470(local21.anInt1850, local592 + local268 + local21.anInt1910, local21.anInt1910 + local594);
										Static218.aClass38_3.method4481(local21.anInt1907 << 3);
										if (Static197.aBoolean358) {
											Static51.aClass37_1.method3696(local94, local99, local21.anInt1874 + local94, local21.anInt1845 + local99);
										}
										if (local21.aBoolean163) {
											local1479.method5835(Static218.aClass38_3, null, local21.anInt1861);
										} else {
											local1479.method5825(Static218.aClass38_3, null, 1);
										}
										if (Static197.aBoolean358) {
											Static51.aClass37_1.method3677(arg5, arg8, arg2, arg4);
										}
										if (local21.aBoolean168) {
											Static51.aClass37_1.method3675(true);
										}
									}
								} else if (local21.anInt1871 == 9) {
									if (local21.aBoolean171) {
										local268 = local99 + local21.anInt1845;
										local1172 = local94 + local21.anInt1874;
										local533 = local99;
									} else {
										local268 = local99;
										local1172 = local94 + local21.anInt1874;
										local533 = local99 + local21.anInt1845;
									}
									if (local21.anInt1883 == 1) {
										Static51.aClass37_1.method3680(local94, local268, local1172, local533, local21.anInt1888, 0);
									} else {
										Static51.aClass37_1.method3670(local94, local268, local1172, local533, local21.anInt1888, local21.anInt1883);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
	public static void method941() {
		@Pc(9) int[] local9 = new int[Static310.aClass184_2.anInt5966];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static310.aClass184_2.anInt5966; local13++) {
			@Pc(20) Class122 local20 = Static310.aClass184_2.method5040(local13);
			if (local20.anInt3915 >= 0 || local20.anInt3955 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static298.anIntArray456 = new int[local11];
		for (@Pc(45) int local45 = 0; local45 < local11; local45++) {
			Static298.anIntArray456[local45] = local9[local45];
		}
	}
}
