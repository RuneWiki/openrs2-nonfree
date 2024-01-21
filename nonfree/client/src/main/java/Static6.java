import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "Lclient!jd;")
	public static Class36 aClass36_75;

	@OriginalMember(owner = "client!ae", name = "kb", descriptor = "Lclient!ta;")
	public static Class36_Sub1 aClass36_Sub1_23;

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
	public static int anInt2870 = 0;

	@OriginalMember(owner = "client!ae", name = "V", descriptor = "[I")
	public static int[] anIntArray362 = new int[5];

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
	public static final int anInt2873 = 0;

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1303 = Static2.method66(" )2>");

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1304 = Static2.method66("Members object");

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1305 = Static2.method66("titlebutton");

	@OriginalMember(owner = "client!ae", name = "gb", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!ae", name = "lb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1306 = aClass39_1304;

	@OriginalMember(owner = "client!ae", name = "nb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1307 = Static2.method66("::hiddenbuttontest");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)Z")
	private static boolean method2055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0 && Static35.anInt2884 == arg0) {
			return true;
		} else if (arg1 == 1 && Static81.anInt2196 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && Static96.anInt2626 == arg0;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!g;IIIII)V")
	public static void method2056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(21) int local21;
		if (arg5 < 0 || arg5 >= 104 || arg4 < 0 || arg4 >= 104) {
			while (true) {
				local21 = arg2.method1281();
				if (local21 == 0) {
					break;
				}
				if (local21 == 1) {
					arg2.method1281();
					break;
				}
				if (local21 <= 49) {
					arg2.method1281();
				}
			}
			return;
		}
		Static96.aByteArrayArrayArray8[arg3][arg5][arg4] = 0;
		while (true) {
			local21 = arg2.method1281();
			if (local21 == 0) {
				if (arg3 == 0) {
					Static22.anIntArrayArrayArray3[0][arg5][arg4] = -Static7.method111(arg0 + arg4 + 556238, arg5 + 932731 + arg6) * 8;
				} else {
					Static22.anIntArrayArrayArray3[arg3][arg5][arg4] = Static22.anIntArrayArrayArray3[arg3 - 1][arg5][arg4] - 240;
				}
				break;
			}
			if (local21 == 1) {
				@Pc(118) int local118 = arg2.method1281();
				if (local118 == 1) {
					local118 = 0;
				}
				if (arg3 == 0) {
					Static22.anIntArrayArrayArray3[0][arg5][arg4] = -local118 * 8;
				} else {
					Static22.anIntArrayArrayArray3[arg3][arg5][arg4] = Static22.anIntArrayArrayArray3[arg3 - 1][arg5][arg4] - local118 * 8;
				}
				break;
			}
			if (local21 <= 49) {
				Static96.aByteArrayArrayArray9[arg3][arg5][arg4] = arg2.method1254();
				Static69.aByteArrayArrayArray4[arg3][arg5][arg4] = (byte) ((local21 - 2) / 4);
				Static57.aByteArrayArrayArray2[arg3][arg5][arg4] = (byte) (local21 + arg1 - 2 & 0x3);
			} else if (local21 <= 81) {
				Static96.aByteArrayArrayArray8[arg3][arg5][arg4] = (byte) (local21 - 49);
			} else {
				Static96.aByteArrayArrayArray7[arg3][arg5][arg4] = (byte) (local21 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
	public static void method2057() {
		@Pc(24) int local24;
		for (@Pc(7) int local7 = -1; local7 < Static61.anInt1740; local7++) {
			if (local7 == -1) {
				local24 = 2047;
			} else {
				local24 = Static7.anIntArray21[local7];
			}
			@Pc(32) Class2_Sub1_Sub2_Sub3_Sub1 local32 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local24];
			if (local32 != null && local32.anInt2921 > 0) {
				local32.anInt2921--;
				if (local32.anInt2921 == 0) {
					local32.aClass39_1312 = null;
				}
			}
		}
		for (local24 = 0; local24 < Static95.anInt2510; local24++) {
			@Pc(64) int local64 = Static50.anIntArray193[local24];
			@Pc(68) Class2_Sub1_Sub2_Sub3_Sub2 local68 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local64];
			if (local68 != null && local68.anInt2921 > 0) {
				local68.anInt2921--;
				if (local68.anInt2921 == 0) {
					local68.aClass39_1312 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
	public static void method2058() {
		aClass39_1307 = null;
		aClass36_Sub1_23 = null;
		aClass39_1306 = null;
		aClass39_1305 = null;
		aClass39_1303 = null;
		anIntArray362 = null;
		aClass36_75 = null;
		aClass39_1304 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Lclient!ke;")
	private static Class39 method2059(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static31.method1267(arg0);
		} else if (arg0 < 10000000) {
			return Static20.method431(new Class39[] { Static31.method1267(arg0 / 1000), Static48.aClass39_602 });
		} else {
			return Static20.method431(new Class39[] { Static31.method1267(arg0 / 1000000), Static68.aClass39_885 });
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (!Static23.method442(arg3)) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		Static91.method2014(arg2, arg5, arg0, arg7);
		@Pc(22) Class2_Sub1_Sub6[] local22 = Static76.aClass2_Sub1_Sub6ArrayArray1[arg3];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class2_Sub1_Sub6 local30 = local22[local24];
			if (local30 != null && local30.anInt730 == arg4) {
				if (local30.anInt722 > 0) {
					Static77.method1514(local30);
				}
				@Pc(56) int local56 = arg2 + local30.anInt732;
				@Pc(65) int local65 = local30.anInt703 + arg5 - arg1;
				if (local30.anInt700 == 0) {
					if (local30.aBoolean41 && !Static51.method1771(local24, arg6)) {
						continue;
					}
					if (local30.anInt701 - local30.anInt725 < local30.anInt727) {
						local30.anInt727 = local30.anInt701 - local30.anInt725;
					}
					if (local30.anInt727 < 0) {
						local30.anInt727 = 0;
					}
					local13 &= method2060(local30.anInt740 + local56, local30.anInt727, local56, arg3, local24, local65, arg6, local65 + local30.anInt725);
					Static91.method2014(arg2, arg5, arg0, arg7);
					if (local30.anInt701 > local30.anInt725) {
						Static46.method874(local30.anInt727, local30.anInt701, local65, local56 + local30.anInt740, local30.anInt725);
					}
				}
				if (local30.anInt700 != 1) {
					@Pc(162) int local162;
					@Pc(166) int local166;
					@Pc(179) int local179;
					@Pc(242) int local242;
					@Pc(249) int local249;
					@Pc(283) int local283;
					@Pc(160) int local160;
					@Pc(240) int local240;
					if (local30.anInt700 == 2) {
						local160 = 0;
						for (local162 = 0; local162 < local30.anInt725; local162++) {
							for (local166 = 0; local166 < local30.anInt740; local166++) {
								local179 = local56 + local166 * (local30.anInt720 + 32);
								@Pc(189) int local189 = local162 * (local30.anInt714 + 32) + local65;
								if (local160 < 20) {
									local179 += local30.anIntArray77[local160];
									local189 += local30.anIntArray79[local160];
								}
								if (local30.anIntArray75[local160] > 0) {
									local240 = 0;
									local242 = 0;
									local249 = local30.anIntArray75[local160] - 1;
									if (Static91.anInt2835 - 32 < local179 && Static91.anInt2837 > local179 && Static91.anInt2834 - 32 < local189 && Static91.anInt2832 > local189 || Static69.anInt2009 != 0 && Static78.anInt2157 == local160) {
										local283 = 0;
										if (Static16.anInt461 == 1 && local160 == Static61.anInt1741 && local24 + (arg3 << 16) == Static92.anInt2391) {
											local283 = 16777215;
										}
										@Pc(315) Class2_Sub1_Sub4_Sub2 local315 = Static1.method2(local249, local283, local30.anIntArray78[local160]);
										if (local315 == null) {
											local13 = false;
										} else {
											if (Static69.anInt2009 != 0 && local160 == Static78.anInt2157 && Static81.anInt2197 == (arg3 << 16) + local24) {
												local240 = Static80.anInt2188 - Static55.anInt1558;
												if (local240 < 5 && local240 > -5) {
													local240 = 0;
												}
												local242 = Static45.anInt1237 - Static41.anInt1198;
												if (local242 < 5 && local242 > -5) {
													local242 = 0;
												}
												if (Static76.anInt2103 < 5) {
													local242 = 0;
													local240 = 0;
												}
												local315.method1042(local179 + local240, local189 + local242);
												if (arg4 != -1) {
													@Pc(388) Class2_Sub1_Sub6 local388 = local22[arg4];
													@Pc(415) int local415;
													if (Static91.anInt2834 > local189 + local242 && local388.anInt727 > 0) {
														local415 = (Static91.anInt2834 - local242 - local189) * Static17.anInt489 / 3;
														if (Static17.anInt489 * 10 < local415) {
															local415 = Static17.anInt489 * 10;
														}
														if (local415 > local388.anInt727) {
															local415 = local388.anInt727;
														}
														local388.anInt727 -= local415;
														Static41.anInt1198 += local415;
													}
													if (local189 + local242 + 32 > Static91.anInt2832 && local388.anInt701 - local388.anInt725 > local388.anInt727) {
														local415 = Static17.anInt489 * (local189 + local242 + 32 - Static91.anInt2832) / 3;
														if (Static17.anInt489 * 10 < local415) {
															local415 = Static17.anInt489 * 10;
														}
														if (local388.anInt701 - local388.anInt727 - local388.anInt725 < local415) {
															local415 = local388.anInt701 - local388.anInt727 - local388.anInt725;
														}
														Static41.anInt1198 -= local415;
														local388.anInt727 += local415;
													}
												}
											} else if (Static71.anInt2029 != 0 && local160 == Static88.anInt1139 && local24 + (arg3 << 16) == Static38.anInt1151) {
												local315.method1042(local179, local189);
											} else {
												local315.method1040(local179, local189);
											}
											if (local315.anInt1502 == 33 || local30.anIntArray78[local160] != 1) {
												@Pc(559) int local559 = local30.anIntArray78[local160];
												Static97.aClass2_Sub1_Sub4_Sub1_3.method234(method2059(local559), local179 + local240 + 1, local242 + (local189 - -10), 0);
												Static97.aClass2_Sub1_Sub4_Sub1_3.method234(method2059(local559), local240 + local179, local189 + 9 + local242, 16776960);
											}
										}
									}
								} else if (local30.anIntArray80 != null && local160 < 20) {
									@Pc(224) Class2_Sub1_Sub4_Sub2 local224 = local30.method519(local160);
									if (local224 != null) {
										local224.method1040(local179, local189);
									} else if (Static51.aBoolean108) {
										local13 = false;
									}
								}
								local160++;
							}
						}
					} else if (local30.anInt700 == 3) {
						if (Static81.method1570(local30)) {
							local160 = local30.anInt697;
							if (Static51.method1771(local24, arg6) && local30.anInt690 != 0) {
								local160 = local30.anInt690;
							}
						} else {
							local160 = local30.anInt713;
							if (Static51.method1771(local24, arg6) && local30.anInt717 != 0) {
								local160 = local30.anInt717;
							}
						}
						if (local30.anInt719 == 0) {
							if (local30.aBoolean42) {
								Static91.method2013(local56, local65, local30.anInt740, local30.anInt725, local160);
							} else {
								Static91.method2011(local56, local65, local30.anInt740, local30.anInt725, local160);
							}
						} else if (local30.aBoolean42) {
							Static91.method2020(local56, local65, local30.anInt740, local30.anInt725, local160, 256 - (local30.anInt719 & 0xFF));
						} else {
							Static91.method2010(local56, local65, local30.anInt740, local30.anInt725, local160, 256 - (local30.anInt719 & 0xFF));
						}
					} else {
						@Pc(734) Class2_Sub1_Sub4_Sub1 local734;
						if (local30.anInt700 == 4) {
							local734 = local30.method513();
							if (local734 != null) {
								@Pc(745) Class39 local745 = local30.aClass39_341;
								if (Static81.method1570(local30)) {
									local162 = local30.anInt697;
									if (Static51.method1771(local24, arg6) && local30.anInt690 != 0) {
										local162 = local30.anInt690;
									}
									if (local30.aClass39_338.method1088() > 0) {
										local745 = local30.aClass39_338;
									}
								} else {
									local162 = local30.anInt713;
									if (Static51.method1771(local24, arg6) && local30.anInt717 != 0) {
										local162 = local30.anInt717;
									}
								}
								if (local30.anInt698 == 6 && Static12.aBoolean14) {
									local745 = Static38.aClass39_501;
									local162 = local30.anInt713;
								}
								if (Static91.anInt2836 == 479) {
									if (local162 == 16776960) {
										local162 = 255;
									}
									if (local162 == 49152) {
										local162 = 16777215;
									}
								}
								local745 = Static89.method1675(local30, local745);
								local734.method245(local745, local56, local65, local30.anInt740, local30.anInt725, local162, local30.aBoolean46, local30.anInt695, local30.anInt742, local30.anInt728);
							} else if (Static51.aBoolean108) {
								local13 = false;
							}
						} else if (local30.anInt700 == 5) {
							@Pc(849) Class2_Sub1_Sub4_Sub2 local849 = local30.method520(Static81.method1570(local30));
							if (local849 != null) {
								local849.method1040(local56, local65);
							} else if (Static51.aBoolean108) {
								local13 = false;
							}
						} else if (local30.anInt700 == 6) {
							Static106.method2037(local30.anInt740 / 2 + local56, local30.anInt725 / 2 + local65);
							local160 = Class2_Sub1_Sub4_Sub4.anIntArray356[local30.anInt693] * local30.anInt691 >> 16;
							local162 = local30.anInt691 * Class2_Sub1_Sub4_Sub4.anIntArray358[local30.anInt693] >> 16;
							@Pc(904) boolean local904 = Static81.method1570(local30);
							if (local904) {
								local179 = local30.anInt709;
							} else {
								local179 = local30.anInt731;
							}
							@Pc(926) Class2_Sub1_Sub2_Sub2 local926;
							if (local30.anInt711 == 5) {
								local926 = Static28.aClass35_1.method915(null, -1, null, -1);
							} else if (local179 == -1) {
								local926 = local30.method517(null, local904, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.aClass35_2, -1);
								if (local926 == null && Static51.aBoolean108) {
									local13 = false;
								}
							} else {
								@Pc(953) Class2_Sub1_Sub1 local953 = Static69.method1439(local179);
								local926 = local30.method517(local953, local904, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.aClass35_2, local30.anInt689);
								if (local926 == null && Static51.aBoolean108) {
									local13 = false;
								}
							}
							if (local926 != null) {
								local926.method699(local30.anInt724, 0, local30.anInt693, 0, local160, local162);
							}
							Static106.method2032();
						} else {
							if (local30.anInt700 == 7) {
								local734 = local30.method513();
								if (local734 == null) {
									if (Static51.aBoolean108) {
										local13 = false;
									}
									continue;
								}
								local162 = 0;
								for (local166 = 0; local166 < local30.anInt725; local166++) {
									for (local179 = 0; local179 < local30.anInt740; local179++) {
										if (local30.anIntArray75[local162] > 0) {
											@Pc(1027) Class2_Sub1_Sub7 local1027 = Static66.method1384(local30.anIntArray75[local162] - 1);
											@Pc(1030) Class39 local1030 = local1027.aClass39_588;
											if (local1030 == null) {
												local1030 = Static64.aClass39_831;
											}
											if (local1027.aBoolean68 || local30.anIntArray78[local162] != 1) {
												local1030 = Static20.method431(new Class39[] { local1030, Static44.aClass39_556, Static90.method1703(local30.anIntArray78[local162]) });
											}
											local249 = local65 + local166 * (local30.anInt714 + 12);
											local242 = local56 + (local30.anInt720 + 115) * local179;
											if (local30.anInt695 == 0) {
												local734.method235(local1030, local242, local249, local30.anInt713, local30.aBoolean46);
											} else if (local30.anInt695 == 1) {
												local734.method238(local1030, local30.anInt740 / 2 + local242, local249, local30.anInt713, local30.aBoolean46);
											} else {
												local734.method247(local1030, local242 + local30.anInt740 - 1, local249, local30.anInt713, local30.aBoolean46);
											}
										}
										local162++;
									}
								}
							}
							if (local30.anInt700 == 8 && method2055(local24, arg6) && Static55.anInt1568 == Static65.anInt1902) {
								local162 = 0;
								local160 = 0;
								@Pc(1175) Class39 local1175 = local30.aClass39_341;
								@Pc(1177) Class2_Sub1_Sub4_Sub1 local1177 = Static49.aClass2_Sub1_Sub4_Sub1_2;
								local1175 = Static89.method1675(local30, local1175);
								@Pc(1195) Class39 local1195;
								while (local1175.method1088() > 0) {
									local240 = local1175.method1100(Static21.aClass39_1208);
									if (local240 == -1) {
										local1195 = local1175;
										local1175 = Static86.aClass39_1048;
									} else {
										local1195 = local1175.method1115(0, local240);
										local1175 = local1175.method1099(local240 + 2);
									}
									local242 = local1177.method249(local1195);
									local162 += local1177.anInt306 + 1;
									if (local160 < local242) {
										local160 = local242;
									}
								}
								local160 += 6;
								local162 += 7;
								local240 = local56 + local30.anInt740 - local160 - 5;
								local242 = local65 + local30.anInt725 + 5;
								if (local240 < local56 + 5) {
									local240 = local56 + 5;
								}
								if (arg0 < local160 + local240) {
									local240 = arg0 - local160;
								}
								if (arg7 < local242 + local162) {
									local242 = arg7 - local162;
								}
								Static91.method2013(local240, local242, local160, local162, 16777120);
								Static91.method2011(local240, local242, local160, local162, 0);
								local1175 = local30.aClass39_341;
								local249 = local242 + local1177.anInt306 + 2;
								local1175 = Static89.method1675(local30, local1175);
								while (local1175.method1088() > 0) {
									local283 = local1175.method1100(Static21.aClass39_1208);
									if (local283 == -1) {
										local1195 = local1175;
										local1175 = Static86.aClass39_1048;
									} else {
										local1195 = local1175.method1115(0, local283);
										local1175 = local1175.method1099(local283 + 2);
									}
									local1177.method235(local1195, local240 + 3, local249, 0, false);
									local249 += local1177.anInt306 + 1;
								}
							}
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)V")
	public static void method2062() {
		Static60.anInt1626 = 0;
		Static92.anInt2397 = 0;
		Static68.method1435();
		Static92.method1726();
		Static63.method1330();
		Static94.method1790();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static92.anInt2397; local19++) {
			local25 = Static60.anIntArray214[local19];
			if (Static64.anInt1889 != Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local25].anInt2931) {
				Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local25] = null;
			}
		}
		if (Static48.anInt1342 != Static51.aClass2_Sub5_Sub1_4.anInt1772) {
			throw new RuntimeException("gpp1 pos:" + Static51.aClass2_Sub5_Sub1_4.anInt1772 + " psize:" + Static48.anInt1342);
		}
		for (local25 = 0; local25 < Static61.anInt1740; local25++) {
			if (Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[Static7.anIntArray21[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static61.anInt1740);
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!d;)V")
	public static void method2063(@OriginalArg(1) Class2_Sub3 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt502 == 0) {
			local5 = Static77.aClass43_1.method1195(arg0.anInt495, arg0.anInt500, arg0.anInt497);
		}
		@Pc(22) int local22 = 0;
		if (arg0.anInt502 == 1) {
			local5 = Static77.aClass43_1.method1202(arg0.anInt495, arg0.anInt500, arg0.anInt497);
		}
		@Pc(39) int local39 = -1;
		@Pc(46) int local46 = 0;
		if (arg0.anInt502 == 2) {
			local5 = Static77.aClass43_1.method1200(arg0.anInt495, arg0.anInt500, arg0.anInt497);
		}
		if (arg0.anInt502 == 3) {
			local5 = Static77.aClass43_1.method1166(arg0.anInt495, arg0.anInt500, arg0.anInt497);
		}
		if (local5 != 0) {
			local39 = local5 >> 14 & 0x7FFF;
			@Pc(95) int local95 = Static77.aClass43_1.method1189(arg0.anInt495, arg0.anInt500, arg0.anInt497, local5);
			local46 = local95 >> 6 & 0x3;
			local22 = local95 & 0x1F;
		}
		arg0.anInt496 = local39;
		arg0.anInt501 = local22;
		arg0.anInt490 = local46;
	}
}
