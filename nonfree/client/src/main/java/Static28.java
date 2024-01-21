import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Lclient!pc;")
	public static Class12 aClass12_22;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "I")
	public static int anInt748;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "I")
	public static int anInt751;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Lclient!td;")
	public static Class54 aClass54_14;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	public static int anInt746 = -1;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "J")
	public static long aLong30 = 0L;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Lclient!fc;")
	public static Class21 aClass21_14 = new Class21(30);

	@OriginalMember(owner = "client!f", name = "g", descriptor = "Lclient!hb;")
	public static Class27 aClass27_373 = Static87.method1648("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!f", name = "l", descriptor = "I")
	public static final int anInt752 = 2301979;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (!Static80.method1535(arg7)) {
			return false;
		}
		Static95.method1325(arg0, arg1, arg3, arg4);
		@Pc(23) boolean local23 = true;
		@Pc(27) Class3_Sub3_Sub6[] local27 = Static96.aClass3_Sub3_Sub6ArrayArray5[arg7];
		for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
			@Pc(35) Class3_Sub3_Sub6 local35 = local27[local29];
			if (local35 != null && arg2 == local35.anInt1612) {
				if (local35.anInt1601 > 0) {
					Static35.method690(local35);
				}
				@Pc(62) int local62 = local35.anInt1596 + arg0;
				@Pc(70) int local70 = local35.anInt1584 + arg1 - arg6;
				if (local35.anInt1608 == 0) {
					if (local35.aBoolean84 && !Static48.method1676(arg5, local29)) {
						continue;
					}
					if (local35.anInt1611 - local35.anInt1579 < local35.anInt1618) {
						local35.anInt1618 = local35.anInt1611 - local35.anInt1579;
					}
					if (local35.anInt1618 < 0) {
						local35.anInt1618 = 0;
					}
					local23 &= method616(local62, local70, local29, local62 + local35.anInt1578, local35.anInt1579 + local70, arg5, local35.anInt1618, arg7);
					Static95.method1325(arg0, arg1, arg3, arg4);
					if (local35.anInt1611 > local35.anInt1579) {
						Static107.method1901(local70, local35.anInt1579, local62 + local35.anInt1578, local35.anInt1618, local35.anInt1611);
					}
				}
				if (local35.anInt1608 != 1) {
					@Pc(179) int local179;
					@Pc(183) int local183;
					@Pc(206) int local206;
					@Pc(232) int local232;
					@Pc(239) int local239;
					@Pc(275) int local275;
					@Pc(177) int local177;
					@Pc(241) int local241;
					if (local35.anInt1608 == 2) {
						local177 = 0;
						for (local179 = 0; local179 < local35.anInt1579; local179++) {
							for (local183 = 0; local183 < local35.anInt1578; local183++) {
								@Pc(195) int local195 = local70 + local179 * (local35.anInt1583 + 32);
								local206 = local62 + local183 * (local35.anInt1597 + 32);
								if (local177 < 20) {
									local195 += local35.anIntArray269[local177];
									local206 += local35.anIntArray273[local177];
								}
								if (local35.anIntArray274[local177] > 0) {
									local232 = 0;
									local239 = local35.anIntArray274[local177] - 1;
									local241 = 0;
									if (local206 > Static95.anInt1896 - 32 && local206 < Static95.anInt1898 && Static95.anInt1899 - 32 < local195 && local195 < Static95.anInt1895 || Static31.anInt805 != 0 && Static4.anInt2757 == local177) {
										local275 = 0;
										if (Static42.anInt1235 == 1 && Static102.anInt2656 == local177 && (arg7 << 16) + local29 == Static82.anInt2210) {
											local275 = 16777215;
										}
										@Pc(299) Class3_Sub3_Sub2_Sub2 local299 = Static25.method488(local239, local35.anIntArray275[local177], local275);
										if (local299 == null) {
											local23 = false;
										} else {
											if (Static31.anInt805 != 0 && local177 == Static4.anInt2757 && Static52.anInt1407 == local29 + (arg7 << 16)) {
												local232 = Static93.anInt2546 - Static76.anInt2143;
												local241 = Static85.anInt2297 - Static90.anInt2497;
												if (local232 < 5 && local232 > -5) {
													local232 = 0;
												}
												if (local241 < 5 && local241 > -5) {
													local241 = 0;
												}
												if (Static16.anInt380 < 5) {
													local232 = 0;
													local241 = 0;
												}
												local299.method797(local241 + local206, local232 + local195);
												if (arg2 != -1) {
													@Pc(400) Class3_Sub3_Sub6 local400 = local27[arg2];
													@Pc(420) int local420;
													if (Static95.anInt1899 > local195 + local232 && local400.anInt1618 > 0) {
														local420 = Static39.anInt989 * (Static95.anInt1899 - local195 - local232) / 3;
														if (local420 > Static39.anInt989 * 10) {
															local420 = Static39.anInt989 * 10;
														}
														if (local400.anInt1618 < local420) {
															local420 = local400.anInt1618;
														}
														Static76.anInt2143 += local420;
														local400.anInt1618 -= local420;
													}
													if (local195 + local232 + 32 > Static95.anInt1895 && local400.anInt1618 < local400.anInt1611 - local400.anInt1579) {
														local420 = (local195 + local232 + 32 - Static95.anInt1895) * Static39.anInt989 / 3;
														if (local420 > Static39.anInt989 * 10) {
															local420 = Static39.anInt989 * 10;
														}
														if (local420 > local400.anInt1611 - local400.anInt1579 - local400.anInt1618) {
															local420 = local400.anInt1611 - local400.anInt1618 - local400.anInt1579;
														}
														local400.anInt1618 += local420;
														Static76.anInt2143 -= local420;
													}
												}
											} else if (Static87.anInt2334 != 0 && local177 == Static67.anInt1735 && Static108.anInt2778 == (arg7 << 16) + local29) {
												local299.method797(local206, local195);
											} else {
												local299.method804(local206, local195);
											}
											if (local299.anInt1019 == 33 || local35.anIntArray275[local177] != 1) {
												@Pc(541) int local541 = local35.anIntArray275[local177];
												Static89.aClass3_Sub3_Sub2_Sub1_3.method610(Static91.method1731(local541), local206 + local241 + 1, local232 + local195 + 10, 0);
												Static89.aClass3_Sub3_Sub2_Sub1_3.method610(Static91.method1731(local541), local206 + local241, local195 - (-local232 + -9), 16776960);
											}
										}
									}
								} else if (local35.anIntArray270 != null && local177 < 20) {
									@Pc(593) Class3_Sub3_Sub2_Sub2 local593 = local35.method1155(local177);
									if (local593 != null) {
										local593.method804(local206, local195);
									} else if (Static41.aBoolean57) {
										local23 = false;
									}
								}
								local177++;
							}
						}
					} else if (local35.anInt1608 == 3) {
						if (Static89.method1691(local35)) {
							local177 = local35.anInt1577;
							if (Static48.method1676(arg5, local29) && local35.anInt1574 != 0) {
								local177 = local35.anInt1574;
							}
						} else {
							local177 = local35.anInt1620;
							if (Static48.method1676(arg5, local29) && local35.anInt1576 != 0) {
								local177 = local35.anInt1576;
							}
						}
						if (local35.anInt1609 == 0) {
							if (local35.aBoolean85) {
								Static95.method1322(local62, local70, local35.anInt1578, local35.anInt1579, local177);
							} else {
								Static95.method1328(local62, local70, local35.anInt1578, local35.anInt1579, local177);
							}
						} else if (local35.aBoolean85) {
							Static95.method1324(local62, local70, local35.anInt1578, local35.anInt1579, local177, 256 - (local35.anInt1609 & 0xFF));
						} else {
							Static95.method1317(local62, local70, local35.anInt1578, local35.anInt1579, local177, 256 - (local35.anInt1609 & 0xFF));
						}
					} else {
						@Pc(745) Class3_Sub3_Sub2_Sub1 local745;
						if (local35.anInt1608 == 4) {
							local745 = local35.method1157();
							if (local745 != null) {
								@Pc(756) Class27 local756 = local35.aClass27_788;
								if (Static89.method1691(local35)) {
									local179 = local35.anInt1577;
									if (Static48.method1676(arg5, local29) && local35.anInt1574 != 0) {
										local179 = local35.anInt1574;
									}
									if (local35.aClass27_789.method765() > 0) {
										local756 = local35.aClass27_789;
									}
								} else {
									local179 = local35.anInt1620;
									if (Static48.method1676(arg5, local29) && local35.anInt1576 != 0) {
										local179 = local35.anInt1576;
									}
								}
								if (local35.anInt1594 == 6 && Static109.anInt2025 == local29 + (arg7 << 16)) {
									local179 = local35.anInt1620;
									local756 = Static24.aClass27_323;
								}
								if (Static95.anInt1897 == 479) {
									if (local179 == 16776960) {
										local179 = 255;
									}
									if (local179 == 49152) {
										local179 = 16777215;
									}
								}
								local756 = Static93.method1752(local756, local35);
								local745.method596(local756, local62, local70, local35.anInt1578, local35.anInt1579, local179, local35.aBoolean82, local35.anInt1585, local35.anInt1595, local35.anInt1588);
							} else if (Static41.aBoolean57) {
								local23 = false;
							}
						} else if (local35.anInt1608 == 5) {
							@Pc(874) Class3_Sub3_Sub2_Sub2 local874 = local35.method1160(Static89.method1691(local35));
							if (local874 != null) {
								local874.method804(local62, local70);
							} else if (Static41.aBoolean57) {
								local23 = false;
							}
						} else if (local35.anInt1608 == 6) {
							Static51.method1022(local62 + local35.anInt1578 / 2, local35.anInt1579 / 2 + local70);
							local179 = local35.anInt1622 * Class3_Sub3_Sub2_Sub3.anIntArray225[local35.anInt1613] >> 16;
							local177 = Class3_Sub3_Sub2_Sub3.anIntArray226[local35.anInt1613] * local35.anInt1622 >> 16;
							@Pc(933) boolean local933 = Static89.method1691(local35);
							if (local933) {
								local206 = local35.anInt1592;
							} else {
								local206 = local35.anInt1575;
							}
							@Pc(964) Class3_Sub3_Sub1_Sub1 local964;
							if (local35.anInt1615 == 5) {
								local964 = Static81.aClass15_1.method343(null, -1, -1, null);
							} else if (local206 == -1) {
								local964 = local35.method1159(null, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.aClass15_2, local933, -1);
								if (local964 == null && Static41.aBoolean57) {
									local23 = false;
								}
							} else {
								@Pc(976) Class3_Sub3_Sub14 local976 = Static16.method298(local206);
								local964 = local35.method1159(local976, Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.aClass15_2, local933, local35.anInt1598);
								if (local964 == null && Static41.aBoolean57) {
									local23 = false;
								}
							}
							if (local964 != null) {
								local964.method393(local35.anInt1606, 0, local35.anInt1613, 0, local177, local179);
							}
							Static51.method1018();
						} else {
							if (local35.anInt1608 == 7) {
								local745 = local35.method1157();
								if (local745 == null) {
									if (Static41.aBoolean57) {
										local23 = false;
									}
									continue;
								}
								local179 = 0;
								for (local183 = 0; local183 < local35.anInt1579; local183++) {
									for (local206 = 0; local206 < local35.anInt1578; local206++) {
										if (local35.anIntArray274[local179] > 0) {
											@Pc(1062) Class3_Sub3_Sub9 local1062 = Static37.method696(local35.anIntArray274[local179] - 1);
											@Pc(1065) Class27 local1065 = local1062.aClass27_869;
											if (local1065 == null) {
												local1065 = Static43.aClass27_604;
											}
											if (local1062.anInt1786 == 1 || local35.anIntArray275[local179] != 1) {
												local1065 = Static98.method1779(new Class27[] { local1065, Static107.aClass27_1340, Static36.method694(local35.anIntArray275[local179]) });
											}
											local239 = local183 * (local35.anInt1583 + 12) + local70;
											local232 = local206 * (local35.anInt1597 + 115) + local62;
											if (local35.anInt1585 == 0) {
												local745.method604(local1065, local232, local239, local35.anInt1620, local35.aBoolean82);
											} else if (local35.anInt1585 == 1) {
												local745.method598(local1065, local35.anInt1578 / 2 + local232, local239, local35.anInt1620, local35.aBoolean82);
											} else {
												local745.method612(local1065, local35.anInt1578 + local232 - 1, local239, local35.anInt1620, local35.aBoolean82);
											}
										}
										local179++;
									}
								}
							}
							if (local35.anInt1608 == 8 && Static86.method1640(arg5, local29) && Static40.anInt1207 == Static10.anInt270) {
								local177 = 0;
								local179 = 0;
								@Pc(1212) Class3_Sub3_Sub2_Sub1 local1212 = Static88.aClass3_Sub3_Sub2_Sub1_2;
								@Pc(1215) Class27 local1215 = local35.aClass27_788;
								local1215 = Static93.method1752(local1215, local35);
								@Pc(1232) Class27 local1232;
								while (local1215.method765() > 0) {
									local241 = local1215.method739(Static62.aClass27_791);
									if (local241 == -1) {
										local1232 = local1215;
										local1215 = Static45.aClass27_182;
									} else {
										local1232 = local1215.method747(0, local241);
										local1215 = local1215.method731(local241 + 2);
									}
									local232 = local1212.method613(local1232);
									local179 += local1212.anInt742 + 1;
									if (local232 > local177) {
										local177 = local232;
									}
								}
								local177 += 6;
								local179 += 7;
								local232 = local70 + local35.anInt1579 + 5;
								local241 = local35.anInt1578 + local62 - local177 - 5;
								if (local62 + 5 > local241) {
									local241 = local62 + 5;
								}
								if (local232 + local179 > arg4) {
									local232 = arg4 - local179;
								}
								if (arg3 < local177 + local241) {
									local241 = arg3 - local177;
								}
								Static95.method1322(local241, local232, local177, local179, 16777120);
								Static95.method1328(local241, local232, local177, local179, 0);
								local239 = local1212.anInt742 + local232 + 2;
								local1215 = local35.aClass27_788;
								local1215 = Static93.method1752(local1215, local35);
								while (local1215.method765() > 0) {
									local275 = local1215.method739(Static62.aClass27_791);
									if (local275 == -1) {
										local1232 = local1215;
										local1215 = Static45.aClass27_182;
									} else {
										local1232 = local1215.method747(0, local275);
										local1215 = local1215.method731(local275 + 2);
									}
									local1212.method604(local1232, local241 + 3, local239, 0, false);
									local239 += local1212.anInt742 + 1;
								}
							}
						}
					}
				}
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void method617() {
		Static11.anInt2733 = 0;
		Static1.anInt13 = -1;
		Static12.aBoolean16 = false;
		Static34.anInt829 = -1;
		Static97.anInt2261 = 0;
		Static19.anInt442 = -1;
		Static61.anInt1553 = 0;
		Static99.anInt2622 = -1;
		Static32.anInt809 = 0;
		Static77.anInt2150 = 0;
		Static42.anInt1232 = 0;
		Static78.aClass3_Sub11_Sub1_3.anInt2060 = 0;
		Static47.aClass3_Sub11_Sub1_1.anInt2060 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1.length; local35++) {
			if (Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local35] != null) {
				Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local35].anInt2403 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2.length; local53++) {
			if (Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local53] != null) {
				Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local53].anInt2403 = -1;
			}
		}
		Static109.method1459(30);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!m;I)Z")
	public static boolean method618(@OriginalArg(0) Class3_Sub3_Sub6 arg0) {
		@Pc(4) int local4 = arg0.anInt1601;
		if (local4 >= 1 && local4 <= 200 || !(local4 < 701 || local4 > 900)) {
			if (local4 >= 801) {
				local4 -= 701;
			} else if (local4 >= 701) {
				local4 -= 601;
			} else if (local4 < 101) {
				local4--;
			} else {
				local4 -= 101;
			}
			Static46.method925(0, 10, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, Static46.aClass27Array5[local4] }), Static78.aClass27_1023);
			Static46.method925(0, 42, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, Static46.aClass27Array5[local4] }), Static70.aClass27_879);
			return true;
		} else if (local4 >= 401 && local4 <= 500) {
			Static46.method925(0, 20, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, arg0.aClass27_788 }), Static78.aClass27_1023);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method619() {
		if (Static87.anInt2332 == 0) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (Static32.anInt809 != 0) {
			local15 = 1;
		}
		for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
			if (Static81.aClass27Array13[local24] != null) {
				@Pc(34) int local34 = Static81.anIntArray333[local24];
				@Pc(38) Class27 local38 = Static55.aClass27Array8[local24];
				if (local38 != null && local38.method751(Static4.aClass27_1330)) {
					local38 = local38.method731(5);
				}
				if (local38 != null && local38.method751(Static42.aClass27_600)) {
					local38 = local38.method731(5);
				}
				if ((local34 == 3 || local34 == 7) && (local34 == 7 || Static34.anInt828 == 0 || Static34.anInt828 == 1 && Static50.method971(local38))) {
					@Pc(98) int local98 = 329 - local15 * 13;
					local15++;
					if (Static85.anInt2297 > 4 && Static93.anInt2546 - 4 > local98 + -10 && Static93.anInt2546 - 4 <= local98 + 3) {
						@Pc(153) int local153 = Static88.aClass3_Sub3_Sub2_Sub1_2.method606(Static98.method1779(new Class27[] { Static40.aClass27_586, Static83.aClass27_1128, local38, Static81.aClass27Array13[local24] })) + 25;
						if (local153 > 450) {
							local153 = 450;
						}
						if (Static85.anInt2297 < local153 + 4) {
							if (Static45.anInt345 >= 1) {
								Static46.method925(0, 2032, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, local38 }), Static47.aClass27_620);
							}
							Static46.method925(0, 2049, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, local38 }), Static72.aClass27_931);
							Static46.method925(0, 2006, 0, 0, Static98.method1779(new Class27[] { Static22.aClass27_296, local38 }), Static56.aClass27_717);
						}
					}
					if (local15 >= 5) {
						return;
					}
				}
				if ((local34 == 5 || local34 == 6) && Static34.anInt828 < 2) {
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
	public static void method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
			anInt746 = -1;
			Static77.anInt2149 = -1;
			return;
		}
		@Pc(35) int local35 = Static48.method1675(arg1, Static68.anInt1747, arg0) - arg2;
		@Pc(39) int local39 = local35 - Static75.anInt2122;
		@Pc(43) int local43 = Static21.anIntArray96[Static86.anInt2328];
		@Pc(47) int local47 = Static21.anIntArray99[Static86.anInt2328];
		@Pc(51) int local51 = arg0 - Static108.anInt2777;
		@Pc(55) int local55 = Static21.anIntArray96[Static81.anInt2195];
		@Pc(59) int local59 = Static21.anIntArray99[Static81.anInt2195];
		@Pc(63) int local63 = arg1 - Static45.anInt371;
		@Pc(73) int local73 = local43 * local51 + local47 * local63 >> 16;
		@Pc(84) int local84 = local63 * local43 - local47 * local51 >> 16;
		@Pc(86) int local86 = local73;
		@Pc(97) int local97 = local55 * local39 - local59 * local84 >> 16;
		@Pc(121) int local121 = local84 * local55 + local39 * local59 >> 16;
		if (local121 >= 50) {
			Static77.anInt2149 = (local97 << 9) / local121 + 167;
			anInt746 = (local86 << 9) / local121 + 256;
		} else {
			anInt746 = -1;
			Static77.anInt2149 = -1;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)I")
	public static int method621(@OriginalArg(1) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
	public static void method622() {
		aClass21_14 = null;
		aClass54_14 = null;
		aClass27_373 = null;
		aClass12_22 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!hb;Lclient!td;Lclient!hb;Z)Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2 method623(@OriginalArg(0) Class27 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class27 arg2) {
		@Pc(8) int local8 = arg1.method1620(arg0);
		@Pc(19) int local19 = arg1.method1613(arg2, local8);
		return Static24.method484(arg1, local19, local8);
	}
}
