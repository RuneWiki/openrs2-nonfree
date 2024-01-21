import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	public static int anInt2626 = 0;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!ec;")
	private static Class22 aClass22_776 = Static60.method1113("Too many connections from your address)3");

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!ec;")
	public static Class22 aClass22_777 = Static60.method1113("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_778 = Static60.method1113("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!s", name = "f", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_779 = aClass22_776;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	public static int anInt2634 = 0;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "I")
	public static int anInt2636 = 0;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
	public static void method1721() {
		@Pc(12) int local12;
		if (Static55.anInt1115 > 0) {
			for (local12 = 0; local12 < 256; local12++) {
				if (Static55.anInt1115 > 768) {
					Static52.anIntArray148[local12] = Static71.method1178(Static111.anIntArray304[local12], 1024 - Static55.anInt1115, Static78.anIntArray205[local12]);
				} else if (Static55.anInt1115 > 256) {
					Static52.anIntArray148[local12] = Static111.anIntArray304[local12];
				} else {
					Static52.anIntArray148[local12] = Static71.method1178(Static78.anIntArray205[local12], 256 - Static55.anInt1115, Static111.anIntArray304[local12]);
				}
			}
		} else if (Static71.anInt1912 > 0) {
			for (local12 = 0; local12 < 256; local12++) {
				if (Static71.anInt1912 > 768) {
					Static52.anIntArray148[local12] = Static71.method1178(Static103.anIntArray293[local12], 1024 - Static71.anInt1912, Static78.anIntArray205[local12]);
				} else if (Static71.anInt1912 <= 256) {
					Static52.anIntArray148[local12] = Static71.method1178(Static78.anIntArray205[local12], 256 - Static71.anInt1912, Static103.anIntArray293[local12]);
				} else {
					Static52.anIntArray148[local12] = Static103.anIntArray293[local12];
				}
			}
		} else {
			for (local12 = 0; local12 < 256; local12++) {
				Static52.anIntArray148[local12] = Static78.anIntArray205[local12];
			}
		}
		local12 = 0;
		@Pc(154) int local154 = 6885;
		Static118.method1386(0, 9, 128, 263);
		Static82.aClass4_Sub1_Sub2_Sub2_6.method808(0, 0);
		Static118.method1376();
		@Pc(183) int local183;
		@Pc(187) int local187;
		@Pc(200) int local200;
		@Pc(207) int local207;
		@Pc(214) int local214;
		@Pc(224) int local224;
		@Pc(219) int local219;
		for (@Pc(170) int local170 = 1; local170 < 255; local170++) {
			local183 = (256 - local170) * Static67.anIntArray189[local170] / 256;
			local187 = local183 + 22;
			if (local187 < 0) {
				local187 = 0;
			}
			local12 += local187;
			for (local200 = local187; local200 < 128; local200++) {
				local207 = Static37.anIntArray105[local12++];
				if (local207 == 0) {
					local154++;
				} else {
					local214 = local207;
					local219 = Static43.aClass11_1.anIntArray104[local154];
					local224 = 256 - local207;
					local207 = Static52.anIntArray148[local207];
					Static43.aClass11_1.anIntArray104[local154++] = ((local207 & 0xFF00) * local214 + local224 * (local219 & 0xFF00) & 0xFF0000) + (local224 * (local219 & 0xFF00FF) + (local207 & 0xFF00FF) * local214 & 0xFF00FF00) >> 8;
				}
			}
			local154 += local187 + 765 - 128;
		}
		local154 = 7546;
		local12 = 0;
		Static118.method1386(637, 9, 765, 263);
		Static39.aClass4_Sub1_Sub2_Sub2_5.method808(382, 0);
		Static118.method1376();
		for (local183 = 1; local183 < 255; local183++) {
			local187 = Static67.anIntArray189[local183] * (256 - local183) / 256;
			local154 += local187;
			local200 = 103 - local187;
			for (local207 = 0; local207 < local200; local207++) {
				local214 = Static37.anIntArray105[local12++];
				if (local214 == 0) {
					local154++;
				} else {
					local224 = local214;
					local219 = 256 - local214;
					@Pc(357) int local357 = Static43.aClass11_1.anIntArray104[local154];
					local214 = Static52.anIntArray148[local214];
					Static43.aClass11_1.anIntArray104[local154++] = ((local214 & 0xFF00FF) * local224 + local219 * (local357 & 0xFF00FF) & 0xFF00FF00) + ((local214 & 0xFF00) * local224 + local219 * (local357 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local12 += 128 - local200;
			local154 += 765 - local187 - local200;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lclient!ec;")
	private static Class22 method1722(@OriginalArg(0) int arg0) {
		@Pc(7) Class22 local7 = Static134.method2042(arg0);
		for (@Pc(13) int local13 = local7.method449() - 3; local13 > 0; local13 -= 3) {
			local7 = Static44.method856(new Class22[] { local7.method450(0, local13), Static62.aClass22_482, local7.method477(local13) });
		}
		if (local7.method449() > 9) {
			return Static44.method856(new Class22[] { Static113.aClass22_868, local7.method450(0, local7.method449() - 8), Static38.aClass22_269, Static35.aClass22_244, local7, Static88.aClass22_670 });
		} else if (local7.method449() > 6) {
			return Static44.method856(new Class22[] { Static33.aClass22_234, local7.method450(0, local7.method449() - 4), Static74.aClass22_544, Static35.aClass22_244, local7, Static88.aClass22_670 });
		} else {
			return Static44.method856(new Class22[] { Static128.aClass22_940, local7, Static54.aClass22_388 });
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[Lclient!f;IIIIII)V")
	public static void method1723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub7[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static118.method1386(arg1, arg7, arg0, arg8);
		Static6.method120();
		for (@Pc(9) int local9 = 0; local9 < arg2.length; local9++) {
			@Pc(29) Class4_Sub7 local29 = arg2[local9];
			if (local29 != null && (arg3 == local29.anInt802 || arg3 == -1412584499 && Static133.aClass4_Sub7_16 == local29)) {
				@Pc(51) int local51;
				if (arg6 == -1) {
					Static121.anIntArray317[Static111.anInt2765] = arg4 + local29.anInt785;
					Static103.anIntArray294[Static111.anInt2765] = arg5 + local29.anInt796;
					Static24.anIntArray62[Static111.anInt2765] = local29.anInt773;
					Static16.anIntArray42[Static111.anInt2765] = local29.anInt753;
					local51 = Static111.anInt2765++;
				} else {
					local51 = arg6;
				}
				local29.anInt782 = local51;
				local29.anInt789 = Static117.anInt2877;
				if (!local29.aBoolean79 || !Static98.method1667(local29)) {
					if (local29.anInt793 > 0) {
						Static30.method507(local29);
					}
					@Pc(107) int local107 = arg4 + local29.anInt785;
					@Pc(110) int local110 = local29.anInt800;
					@Pc(115) int local115 = local29.anInt796 + arg5;
					@Pc(178) int local178;
					@Pc(145) int local145;
					if (Static133.aClass4_Sub7_16 == local29) {
						if (arg3 != -1412584499 && !local29.aBoolean82) {
							Static70.anInt1900 = arg5;
							Static56.anInt1532 = arg4;
							Static80.aClass4_Sub7Array2 = arg2;
							continue;
						}
						if (!local29.aBoolean82) {
							local110 = 128;
						}
						if (Static64.aBoolean163 && Static23.aBoolean57) {
							local145 = Static117.anInt2876;
							local145 -= Static73.anInt1952;
							if (Static115.anInt2835 > local145) {
								local145 = Static115.anInt2835;
							}
							if (Static97.aClass4_Sub7_13.anInt753 + Static115.anInt2835 < local145 + local29.anInt753) {
								local145 = Static97.aClass4_Sub7_13.anInt753 + Static115.anInt2835 - local29.anInt753;
							}
							local178 = Static72.anInt1914;
							local178 -= Static39.anInt973;
							local115 = local145;
							if (Static92.anInt2522 > local178) {
								local178 = Static92.anInt2522;
							}
							if (Static97.aClass4_Sub7_13.anInt773 + Static92.anInt2522 < local178 + local29.anInt773) {
								local178 = Static92.anInt2522 + Static97.aClass4_Sub7_13.anInt773 - local29.anInt773;
							}
							local107 = local178;
						}
					}
					@Pc(229) int local229;
					@Pc(223) int local223;
					@Pc(262) int local262;
					@Pc(267) int local267;
					@Pc(301) int local301;
					@Pc(296) int local296;
					if (local29.anInt743 == 2) {
						local223 = arg8;
						local178 = arg1;
						local145 = arg7;
						local229 = arg0;
					} else if (local29.anInt743 == 9) {
						local267 = local115;
						local262 = local107;
						local296 = local29.anInt753 + local115;
						local301 = local29.anInt773 + local107;
						if (local107 > local301) {
							local262 = local301;
							local301 = local107;
						}
						local178 = arg1 >= local262 ? arg1 : local262;
						if (local115 > local296) {
							local267 = local296;
							local296 = local115;
						}
						local145 = local267 <= arg7 ? arg7 : local267;
						local296++;
						local223 = local296 < arg8 ? local296 : arg8;
						local301++;
						local229 = arg0 <= local301 ? arg0 : local301;
					} else {
						local145 = arg7 < local115 ? local115 : arg7;
						local178 = local107 > arg1 ? local107 : arg1;
						local262 = local107 + local29.anInt773;
						local267 = local115 + local29.anInt753;
						local229 = local262 < arg0 ? local262 : arg0;
						local223 = local267 >= arg8 ? arg8 : local267;
					}
					if (!local29.aBoolean79 || local229 > local178 && local145 < local223) {
						if (local29.anInt793 != 0) {
							if (local29.anInt793 == 1337) {
								Static130.anInt3086 = local115;
								Static28.anInt671 = local107;
								Static62.method1122(local29.anInt773, local107, local29.anInt753, local115);
								Static118.method1386(arg1, arg7, arg0, arg8);
								continue;
							}
							if (local29.anInt793 == 1338) {
								Static73.method1207(local115, local107, local51);
								Static118.method1386(arg1, arg7, arg0, arg8);
								continue;
							}
						}
						local262 = Static72.anInt1914;
						local267 = Static117.anInt2876;
						if (!Static22.aBoolean250 && local178 <= local262 && local145 <= local267 && local229 > local262 && local223 > local267) {
							Static134.method2043(local267 - local115, local29, local262 - local107);
						}
						if (local29.anInt743 == 0) {
							if (!local29.aBoolean79 && Static98.method1667(local29) && local29 != Static43.aClass4_Sub7_10) {
								continue;
							}
							if (!local29.aBoolean79) {
								if (local29.anInt781 - local29.anInt753 < local29.anInt806) {
									local29.anInt806 = local29.anInt781 - local29.anInt753;
								}
								if (local29.anInt806 < 0) {
									local29.anInt806 = 0;
								}
							}
							method1723(local229, local178, arg2, local29.anInt738, local107 - local29.anInt791, -local29.anInt806 + local115, local51, local145, local223);
							if (local29.aClass4_Sub7Array1 != null) {
								method1723(local229, local178, local29.aClass4_Sub7Array1, local29.anInt738, local107 - local29.anInt791, -local29.anInt806 + local115, local51, local145, local223);
							}
							@Pc(550) Class4_Sub21 local550 = (Class4_Sub21) Static90.aClass81_11.method2010((long) local29.anInt738);
							if (local550 != null) {
								if (local550.anInt2946 == 0 && Static72.anInt1914 >= local178 && Static117.anInt2876 >= local145 && Static72.anInt1914 < local229 && local223 > Static117.anInt2876 && !Static22.aBoolean250 && !Static123.aBoolean278) {
									Static99.anInt2589 = 1;
									Static38.anIntArray111[0] = 1007;
									Static90.aClass22Array18[0] = Static76.aClass22_562;
									Static48.aClass22Array9[0] = Static64.aClass22_485;
								}
								Static70.method1176(local145, local107, local550.anInt2939, local178, local51, local229, local223, local115);
							}
							Static118.method1386(arg1, arg7, arg0, arg8);
							Static6.method120();
						}
						if (Static49.aBooleanArray5[local51] || Static76.anInt2022 > 1) {
							if (local29.anInt743 == 0 && !local29.aBoolean79 && local29.anInt753 < local29.anInt781) {
								Static28.method466(local29.anInt806, local115, local29.anInt773 + local107, local29.anInt781, local29.anInt753);
							}
							if (local29.anInt743 != 1) {
								@Pc(663) int local663;
								@Pc(676) int local676;
								@Pc(828) int local828;
								@Pc(720) int local720;
								@Pc(900) int local900;
								@Pc(685) int local685;
								@Pc(824) int local824;
								if (local29.anInt743 == 2) {
									local301 = 0;
									for (local296 = 0; local296 < local29.anInt753; local296++) {
										for (local663 = 0; local663 < local29.anInt773; local663++) {
											local676 = local107 + (local29.anInt779 + 32) * local663;
											local685 = local115 + local296 * (local29.anInt758 + 32);
											if (local301 < 20) {
												local685 += local29.anIntArray81[local301];
												local676 += local29.anIntArray87[local301];
											}
											if (local29.anIntArray89[local301] > 0) {
												local720 = local29.anIntArray89[local301] - 1;
												if (arg1 < local676 + 32 && local676 < arg0 && arg7 < local685 + 32 && local685 < arg8 || Static30.aClass4_Sub7_6 == local29 && local301 == Static89.anInt2376) {
													@Pc(775) Class4_Sub1_Sub2_Sub2 local775;
													if (anInt2636 == 1 && local301 == Static35.anInt879 && Static38.anInt951 == local29.anInt738) {
														local775 = Static111.method1789(2, local720, false, 0, local29.anIntArray83[local301]);
													} else {
														local775 = Static111.method1789(1, local720, false, 3153952, local29.anIntArray83[local301]);
													}
													if (local775 == null) {
														Static110.method1772(local29);
													} else if (local29 == Static30.aClass4_Sub7_6 && Static89.anInt2376 == local301) {
														local824 = Static72.anInt1914 - Static94.anInt2532;
														local828 = Static117.anInt2876 - Static78.anInt2045;
														if (local824 < 5 && local824 > -5) {
															local824 = 0;
														}
														if (local828 < 5 && local828 > -5) {
															local828 = 0;
														}
														if (Static90.anInt2395 < 5) {
															local828 = 0;
															local824 = 0;
														}
														local775.method805(local676 + local824, local685 - -local828, 128);
														if (arg3 != -1) {
															@Pc(877) Class4_Sub7 local877 = arg2[arg3 & 0xFFFF];
															if (Static118.anInt2111 > local828 + local685 && local877.anInt806 > 0) {
																local900 = (Static118.anInt2111 - local685 - local828) * Static46.anInt1293 / 3;
																if (local900 > Static46.anInt1293 * 10) {
																	local900 = Static46.anInt1293 * 10;
																}
																if (local900 > local877.anInt806) {
																	local900 = local877.anInt806;
																}
																local877.anInt806 -= local900;
																Static78.anInt2045 += local900;
																Static110.method1772(local877);
															}
															if (local828 + local685 + 32 > Static118.anInt2113 && local877.anInt781 - local877.anInt753 > local877.anInt806) {
																local900 = Static46.anInt1293 * (local685 + local828 + 32 - Static118.anInt2113) / 3;
																if (Static46.anInt1293 * 10 < local900) {
																	local900 = Static46.anInt1293 * 10;
																}
																if (local900 > local877.anInt781 - local877.anInt806 - local877.anInt753) {
																	local900 = local877.anInt781 - local877.anInt753 - local877.anInt806;
																}
																local877.anInt806 += local900;
																Static78.anInt2045 -= local900;
																Static110.method1772(local877);
															}
														}
													} else if (local29 == Static5.aClass4_Sub7_1 && Static30.anInt722 == local301) {
														local775.method805(local676, local685, 128);
													} else {
														local775.method790(local676, local685);
													}
												}
											} else if (local29.anIntArray84 != null && local301 < 20) {
												@Pc(1027) Class4_Sub1_Sub2_Sub2 local1027 = local29.method530(local301);
												if (local1027 != null) {
													local1027.method790(local676, local685);
												} else if (aBoolean233) {
													Static110.method1772(local29);
												}
											}
											local301++;
										}
									}
								} else if (local29.anInt743 == 3) {
									if (Static70.method1177(local29)) {
										local301 = local29.anInt804;
										if (local29 == Static43.aClass4_Sub7_10 && local29.anInt757 != 0) {
											local301 = local29.anInt757;
										}
									} else {
										local301 = local29.anInt754;
										if (local29 == Static43.aClass4_Sub7_10 && local29.anInt786 != 0) {
											local301 = local29.anInt786;
										}
									}
									if (local110 == 0) {
										if (local29.aBoolean74) {
											Static118.method1373(local107, local115, local29.anInt773, local29.anInt753, local301);
										} else {
											Static118.method1378(local107, local115, local29.anInt773, local29.anInt753, local301);
										}
									} else if (local29.aBoolean74) {
										Static118.method1377(local107, local115, local29.anInt773, local29.anInt753, local301, 256 - (local110 & 0xFF));
									} else {
										Static118.method1388(local107, local115, local29.anInt773, local29.anInt753, local301, 256 - (local110 & 0xFF));
									}
								} else {
									@Pc(1162) Class4_Sub1_Sub2_Sub4_Sub1 local1162;
									if (local29.anInt743 == 4) {
										local1162 = local29.method525();
										if (local1162 != null) {
											@Pc(1174) Class22 local1174 = local29.aClass22_201;
											if (Static70.method1177(local29)) {
												local296 = local29.anInt804;
												if (Static43.aClass4_Sub7_10 == local29 && local29.anInt757 != 0) {
													local296 = local29.anInt757;
												}
												if (local29.aClass22_203.method449() > 0) {
													local1174 = local29.aClass22_203;
												}
											} else {
												local296 = local29.anInt754;
												if (local29 == Static43.aClass4_Sub7_10 && local29.anInt786 != 0) {
													local296 = local29.anInt786;
												}
											}
											if (local29.aBoolean79 && local29.anInt769 != -1) {
												@Pc(1233) Class4_Sub1_Sub8 local1233 = Static123.method2000(local29.anInt769);
												local1174 = local1233.aClass22_359;
												if (local1174 == null) {
													local1174 = Static75.aClass22_558;
												}
												if ((local1233.anInt1465 == 1 || local29.anInt759 != 1) && local29.anInt759 != -1) {
													local1174 = Static44.method856(new Class22[] { Static33.aClass22_221, local1174, Static96.aClass22_714, method1722(local29.anInt759) });
												}
											}
											if (Static43.aClass4_Sub7_9 == local29) {
												local1174 = Static109.aClass22_73;
												local296 = local29.anInt754;
											}
											if (!local29.aBoolean79) {
												local1174 = Static74.method1210(local29, local1174);
											}
											local1162.method1391(local1174, local107, local115, local29.anInt773, local29.anInt753, local296, local29.aBoolean81 ? 0 : -1, local29.anInt790, local29.anInt767, local29.anInt787);
										} else if (aBoolean233) {
											Static110.method1772(local29);
										}
									} else if (local29.anInt743 == 5) {
										@Pc(1334) Class4_Sub1_Sub2_Sub2 local1334;
										if (local29.aBoolean79) {
											if (local29.anInt769 == -1) {
												local1334 = local29.method522(false);
											} else {
												local1334 = Static111.method1789(local29.anInt764, local29.anInt769, false, local29.anInt778, local29.anInt759);
											}
											if (local1334 != null) {
												local296 = local1334.anInt1157;
												local663 = local1334.anInt1159;
												if (local29.aBoolean72) {
													Static118.method1385(local107, local115, local107 + local29.anInt773, local29.anInt753 + local115);
													local676 = (local296 + local29.anInt773 - 1) / local296;
													local685 = (local663 + local29.anInt753 - 1) / local663;
													for (local824 = 0; local824 < local676; local824++) {
														for (local828 = 0; local828 < local685; local828++) {
															if (local29.anInt755 != 0) {
																local1334.method803(local107 + local296 * local824 + local296 / 2, local663 * local828 + local115 + local663 / 2, local29.anInt755, 4096);
															} else if (local110 == 0) {
																local1334.method790(local107 + local296 * local824, local115 - -(local828 * local663));
															} else {
																local1334.method805(local824 * local296 + local107, local828 * local663 + local115, 256 - (local110 & 0xFF));
															}
														}
													}
													Static118.method1386(arg1, arg7, arg0, arg8);
												} else {
													local676 = local29.anInt773 * 4096 / local296;
													if (local29.anInt755 != 0) {
														local1334.method803(local29.anInt773 / 2 + local107, local115 + local29.anInt753 / 2, local29.anInt755, local676);
													} else if (local110 != 0) {
														local1334.method793(local107, local115, local29.anInt773, local29.anInt753, 256 - (local110 & 0xFF));
													} else if (local29.anInt773 == local296 && local29.anInt753 == local663) {
														local1334.method790(local107, local115);
													} else {
														local1334.method791(local107, local115, local29.anInt773, local29.anInt753);
													}
												}
											} else if (aBoolean233) {
												Static110.method1772(local29);
											}
										} else {
											local1334 = local29.method522(Static70.method1177(local29));
											if (local1334 != null) {
												local1334.method790(local107, local115);
											} else if (aBoolean233) {
												Static110.method1772(local29);
											}
										}
									} else {
										@Pc(1692) Class4_Sub1_Sub8 local1692;
										if (local29.anInt743 == 6) {
											@Pc(1598) boolean local1598 = Static70.method1177(local29);
											if (local1598) {
												local296 = local29.anInt760;
											} else {
												local296 = local29.anInt749;
											}
											@Pc(1610) Class4_Sub1_Sub3_Sub3 local1610 = null;
											local676 = 0;
											if (local29.anInt769 != -1) {
												local1692 = Static123.method2000(local29.anInt769);
												if (local1692 != null) {
													local1692 = local1692.method984(local29.anInt759);
													local1610 = local1692.method983(1);
													if (local1610 == null) {
														Static110.method1772(local29);
													} else {
														local1610.method1474();
														local676 = local1610.anInt2808 / 2;
													}
												}
											} else if (local29.anInt752 == 5) {
												if (local29.anInt794 == 0) {
													local1610 = Static50.aClass21_1.method442(null, -1, null, -1);
												} else {
													local1610 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.method1816();
												}
											} else if (local296 == -1) {
												local1610 = local29.method529(null, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass21_2, -1, local1598);
												if (local1610 == null && aBoolean233) {
													Static110.method1772(local29);
												}
											} else {
												@Pc(1630) Class4_Sub1_Sub17 local1630 = Static79.method1437(local296);
												local1610 = local29.method529(local1630, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass21_2, local29.anInt747, local1598);
												if (local1610 == null && aBoolean233) {
													Static110.method1772(local29);
												}
											}
											Static6.method127(local29.anInt773 / 2 + local107, local29.anInt753 / 2 + local115);
											local685 = Class4_Sub1_Sub2_Sub1.anIntArray9[local29.anInt775] * local29.anInt772 >> 16;
											local824 = local29.anInt772 * Class4_Sub1_Sub2_Sub1.anIntArray12[local29.anInt775] >> 16;
											if (local1610 != null) {
												if (local29.aBoolean79) {
													local1610.method1474();
													if (local29.aBoolean80) {
														local1610.method1479(local29.anInt808, local29.anInt741, local29.anInt775, local29.anInt777, local676 + local685 + local29.anInt795, local29.anInt795 + local824, local29.anInt772);
													} else {
														local1610.method1483(local29.anInt808, local29.anInt741, local29.anInt775, local29.anInt777, local29.anInt795 + local676 + local685, local824 + local29.anInt795);
													}
												} else {
													local1610.method1483(local29.anInt808, 0, local29.anInt775, 0, local685, local824);
												}
											}
											Static6.method116();
										} else {
											if (local29.anInt743 == 7) {
												local1162 = local29.method525();
												if (local1162 == null) {
													if (aBoolean233) {
														Static110.method1772(local29);
													}
													continue;
												}
												local296 = 0;
												for (local663 = 0; local663 < local29.anInt753; local663++) {
													for (local676 = 0; local676 < local29.anInt773; local676++) {
														if (local29.anIntArray89[local296] > 0) {
															local1692 = Static123.method2000(local29.anIntArray89[local296] - 1);
															@Pc(1903) Class22 local1903;
															if (local1692.anInt1465 != 1 && local29.anIntArray83[local296] == 1) {
																local1903 = Static44.method856(new Class22[] { Static33.aClass22_221, local1692.aClass22_359, Static54.aClass22_388 });
															} else {
																local1903 = Static44.method856(new Class22[] { Static33.aClass22_221, local1692.aClass22_359, Static96.aClass22_714, method1722(local29.anIntArray83[local296]) });
															}
															local828 = local107 + local676 * (local29.anInt779 + 115);
															local720 = local663 * (local29.anInt758 + 12) + local115;
															if (local29.anInt790 == 0) {
																local1162.method1415(local1903, local828, local720, local29.anInt754, local29.aBoolean81 ? 0 : -1);
															} else if (local29.anInt790 == 1) {
																local1162.method1417(local1903, local828 + local29.anInt773 / 2, local720, local29.anInt754, local29.aBoolean81 ? 0 : -1);
															} else {
																local1162.method1400(local1903, local29.anInt773 + local828 - 1, local720, local29.anInt754, local29.aBoolean81 ? 0 : -1);
															}
														}
														local296++;
													}
												}
											}
											@Pc(2204) int local2204;
											if (local29.anInt743 == 8 && Static58.aClass4_Sub7_12 == local29 && Static33.anInt843 == Static76.anInt2023) {
												local301 = 0;
												@Pc(2052) Class4_Sub1_Sub2_Sub4_Sub1 local2052 = Static101.aClass4_Sub1_Sub2_Sub4_Sub1_4;
												@Pc(2055) Class22 local2055 = local29.aClass22_201;
												local2055 = Static74.method1210(local29, local2055);
												local296 = 0;
												@Pc(2079) Class22 local2079;
												while (local2055.method449() > 0) {
													local824 = local2055.method476(Static130.aClass22_954);
													if (local824 == -1) {
														local2079 = local2055;
														local2055 = Static64.aClass22_485;
													} else {
														local2079 = local2055.method450(0, local824);
														local2055 = local2055.method477(local824 + 4);
													}
													local828 = local2052.method1392(local2079);
													local296 += local2052.anInt2120 + 1;
													if (local828 > local301) {
														local301 = local828;
													}
												}
												local301 += 6;
												local296 += 7;
												local824 = local29.anInt773 + local107 - local301 - 5;
												if (local107 + 5 > local824) {
													local824 = local107 + 5;
												}
												if (arg0 < local824 + local301) {
													local824 = arg0 - local301;
												}
												local828 = local115 + local29.anInt753 + 5;
												if (arg8 < local296 + local828) {
													local828 = arg8 - local296;
												}
												Static118.method1373(local824, local828, local301, local296, 16777120);
												Static118.method1378(local824, local828, local301, local296, 0);
												local720 = local828 + local2052.anInt2120 + 2;
												local2055 = local29.aClass22_201;
												local2055 = Static74.method1210(local29, local2055);
												while (local2055.method449() > 0) {
													local2204 = local2055.method476(Static130.aClass22_954);
													if (local2204 == -1) {
														local2079 = local2055;
														local2055 = Static64.aClass22_485;
													} else {
														local2079 = local2055.method450(0, local2204);
														local2055 = local2055.method477(local2204 + 4);
													}
													local2052.method1415(local2079, local824 + 3, local720, 0, -1);
													local720 += local2052.anInt2120 + 1;
												}
											}
											if (local29.anInt743 == 9) {
												if (local29.anInt761 == 1) {
													Static118.method1375(local107, local115, local107 + local29.anInt773, local115 - -local29.anInt753, local29.anInt754);
												} else {
													local296 = local29.anInt753 >= 0 ? local29.anInt753 : -local29.anInt753;
													local301 = local29.anInt773 >= 0 ? local29.anInt773 : -local29.anInt773;
													local663 = local301;
													if (local296 > local301) {
														local663 = local296;
													}
													if (local663 != 0) {
														local676 = (local29.anInt773 << 16) / local663;
														local685 = (local29.anInt753 << 16) / local663;
														if (local685 > local676) {
															local685 = -local685;
														} else {
															local676 = -local676;
														}
														local824 = local29.anInt761 * local685 >> 17;
														local828 = local29.anInt761 * local685 + 1 >> 17;
														local2204 = local29.anInt761 * local676 + 1 >> 17;
														local720 = local676 * local29.anInt761 >> 17;
														local900 = local107 - local828;
														@Pc(2370) int local2370 = local107 + local824;
														@Pc(2379) int local2379 = local107 + local29.anInt773 - local828;
														@Pc(2386) int local2386 = local824 + local107 + local29.anInt773;
														@Pc(2390) int local2390 = local720 + local115;
														@Pc(2395) int local2395 = local115 - local2204;
														@Pc(2403) int local2403 = local29.anInt753 + local115 - local2204;
														@Pc(2411) int local2411 = local29.anInt753 + local115 + local720;
														Static6.method110(local2370, local900, local2379);
														Static6.method122(local2390, local2395, local2403, local2370, local900, local2379, local29.anInt754);
														Static6.method110(local2370, local2379, local2386);
														Static6.method122(local2390, local2403, local2411, local2370, local2379, local2386, local29.anInt754);
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

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method1724() {
		if (Static25.aClass15_1 != null) {
			Static25.aClass15_1.method1197();
		}
		if (Static31.aClass15_2 != null) {
			Static31.aClass15_2.method1197();
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
	public static void method1725() {
		for (@Pc(10) Class4_Sub18 local10 = (Class4_Sub18) Static52.aClass82_5.method2025(); local10 != null; local10 = (Class4_Sub18) Static52.aClass82_5.method2023()) {
			if (local10.aClass4_Sub1_Sub5_1 != null) {
				local10.method1449();
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(Z)V")
	public static void method1726() {
		aLongArray6 = null;
		aClass22_776 = null;
		aClass22_777 = null;
		aClass22_779 = null;
		aClass22_778 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)I")
	public static int method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([Lclient!ec;I)[Lclient!ec;")
	public static Class22[] method1728(@OriginalArg(0) Class22[] arg0) {
		@Pc(8) Class22[] local8 = new Class22[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = Static44.method856(new Class22[] { Static134.method2042(local10), Static30.aClass22_196 });
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = Static44.method856(new Class22[] { local8[local10], arg0[local10] });
			}
		}
		return local8;
	}
}
