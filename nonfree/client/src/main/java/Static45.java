import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "Lclient!ae;")
	private static Class5 aClass5_594 = Static56.method972("Hide");

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "Lclient!ae;")
	private static Class5 aClass5_599 = Static56.method972("System update in: ");

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "Lclient!ae;")
	public static Class5 aClass5_596 = aClass5_599;

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "Lclient!ae;")
	private static Class5 aClass5_597 = Static56.method972("Walk here");

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "Lclient!ae;")
	public static Class5 aClass5_598 = aClass5_594;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
	public static int anInt1269 = 0;

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "[Lclient!fe;")
	public static Class27[] aClass27Array1 = new Class27[50];

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
	public static int anInt1270 = 0;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "Lclient!ae;")
	private static Class5 aClass5_600 = Static56.method972("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "Lclient!ae;")
	public static Class5 aClass5_601 = aClass5_600;

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
	public static int anInt1271 = 0;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
	public static int anInt1275 = 0;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "Lclient!ae;")
	public static Class5 aClass5_602 = Static56.method972("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "Lclient!ae;")
	public static Class5 aClass5_603 = aClass5_597;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "Lclient!ae;")
	public static Class5 aClass5_604 = Static56.method972(")3");

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!ae;")
	public static Class5 aClass5_605 = Static56.method972("backvmid2");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIIIIIIILclient!te;)V")
	public static void method850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub1_Sub17 arg7) {
		if (Static21.aBoolean32) {
			Static50.anInt1359 = 32;
		} else {
			Static50.anInt1359 = 0;
		}
		Static21.aBoolean32 = false;
		@Pc(151) int local151;
		if (arg0 <= arg1 && arg0 + 16 > arg1 && arg5 <= arg2 && arg2 < arg5 + 16) {
			arg7.anInt2583 -= Static50.anInt1351 * 4;
			if (arg3 == 1) {
				Static116.aBoolean157 = true;
			}
			if (arg3 == 2 || arg3 == 3) {
				Static15.aBoolean22 = true;
			}
		} else if (arg0 <= arg1 && arg1 < arg0 + 16 && arg4 + arg5 - 16 <= arg2 && arg2 < arg5 + arg4) {
			if (arg3 == 2 || arg3 == 3) {
				Static15.aBoolean22 = true;
			}
			if (arg3 == 1) {
				Static116.aBoolean157 = true;
			}
			arg7.anInt2583 += Static50.anInt1351 * 4;
		} else if (arg1 >= arg0 - Static50.anInt1359 && arg1 < arg0 + Static50.anInt1359 + 16 && arg5 + 16 <= arg2 && arg2 < arg4 + arg5 - 16 && Static50.anInt1351 > 0) {
			Static21.aBoolean32 = true;
			if (arg3 == 2 || arg3 == 3) {
				Static15.aBoolean22 = true;
			}
			if (arg3 == 1) {
				Static116.aBoolean157 = true;
			}
			local151 = (arg4 - 32) * arg4 / arg6;
			if (local151 < 8) {
				local151 = 8;
			}
			@Pc(165) int local165 = arg4 - local151 - 32;
			@Pc(176) int local176 = arg2 - local151 / 2 - arg5 - 16;
			arg7.anInt2583 = (arg6 - arg4) * local176 / local165;
		}
		if (Static93.anInt2371 == 0) {
			return;
		}
		local151 = arg7.anInt2667;
		if (arg3 == -1) {
			local151 = 479;
		}
		if (arg0 - local151 > arg1 || arg5 > arg2 || arg1 >= arg0 + 16 || arg5 + arg4 < arg2) {
			return;
		}
		arg7.anInt2583 += Static93.anInt2371 * 45;
		if (arg3 == 2 || arg3 == 3) {
			Static15.aBoolean22 = true;
		}
		if (arg3 == 1) {
			Static116.aBoolean157 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
	public static void method851(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static18.method406(arg0)) {
			return;
		}
		@Pc(22) Class3_Sub1_Sub17[] local22 = Static31.aClass3_Sub1_Sub17ArrayArray3[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class3_Sub1_Sub17 local30 = local22[local24];
			if (local30.anObjectArray5 != null) {
				Static68.method997(0, local30.anObjectArray5, null, 0, local30, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	public static void method852() {
		aClass5_596 = null;
		aClass5_594 = null;
		aClass5_600 = null;
		aClass5_597 = null;
		aClass5_605 = null;
		aClass5_602 = null;
		aClass5_603 = null;
		aClass27Array1 = null;
		aClass5_601 = null;
		aClass5_599 = null;
		aClass5_598 = null;
		aClass5_604 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
	public static boolean method853(@OriginalArg(0) int arg0) {
		if (!Static18.method406(arg0)) {
			return false;
		}
		@Pc(13) boolean local13 = false;
		@Pc(17) Class3_Sub1_Sub17[] local17 = Static31.aClass3_Sub1_Sub17ArrayArray3[arg0];
		for (@Pc(24) int local24 = 0; local24 < local17.length; local24++) {
			@Pc(30) Class3_Sub1_Sub17 local30 = local17[local24];
			if (local30 != null && local30.anInt2658 == 6) {
				@Pc(59) int local59;
				if (local30.anInt2666 != -1 || local30.anInt2623 != -1) {
					@Pc(54) boolean local54 = Static61.method1065(local30);
					if (local54) {
						local59 = local30.anInt2623;
					} else {
						local59 = local30.anInt2666;
					}
					if (local59 != -1) {
						@Pc(71) Class3_Sub1_Sub11 local71 = Static31.method778(local59);
						local30.anInt2647 += Static74.anInt1893;
						label52: while (true) {
							do {
								do {
									if (local71.anIntArray219[local30.anInt2588] >= local30.anInt2647) {
										break label52;
									}
									local30.anInt2647 -= local71.anIntArray219[local30.anInt2588];
									local30.anInt2588++;
									local13 = true;
								} while (local30.anInt2588 < local71.anIntArray221.length);
								local30.anInt2588 -= local71.anInt1932;
							} while (local30.anInt2588 >= 0 && local30.anInt2588 < local71.anIntArray221.length);
							local30.anInt2588 = 0;
						}
					}
				}
				if (local30.anInt2638 != 0 && !local30.aBoolean127) {
					local13 = true;
					local59 = local30.anInt2638 << 16 >> 16;
					@Pc(164) int local164 = local30.anInt2638 >> 16;
					@Pc(168) int local168 = local164 * Static74.anInt1893;
					local59 *= Static74.anInt1893;
					local30.anInt2598 = local59 + local30.anInt2598 & 0x7FF;
					local30.anInt2661 = local30.anInt2661 + local168 & 0x7FF;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIII[Lclient!te;II)V")
	public static void method854(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class3_Sub1_Sub17[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg7 > arg9 || arg3 > arg5 || arg9 >= arg1 || arg10 <= arg5) {
			return;
		}
		for (@Pc(37) int local37 = 0; local37 < arg8.length; local37++) {
			@Pc(43) Class3_Sub1_Sub17 local43 = arg8[local37];
			if (local43 != null && arg4 == local43.anInt2621 && (!local43.aBoolean127 || !local43.method1713(Static23.aBoolean33))) {
				@Pc(67) int local67 = local43.anInt2603 + arg3 - arg2;
				@Pc(75) int local75 = local43.anInt2655 + arg7 - arg0;
				if ((local43.anInt2630 >= 0 || local43.anInt2618 != 0) && local75 <= arg9 && arg5 >= local67 && local75 + local43.anInt2667 > arg9 && arg5 < local43.anInt2600 + local67) {
					if (local43.anInt2630 < 0) {
						Static81.anInt2005 = local37;
					} else {
						Static81.anInt2005 = local43.anInt2630;
					}
				}
				if (local43.anInt2658 == 8 && local75 <= arg9 && arg5 >= local67 && local43.anInt2667 + local75 > arg9 && local67 + local43.anInt2600 > arg5) {
					Static34.anInt974 = local37;
				}
				if (local43.anInt2658 == 0) {
					if (!local43.aBoolean127 && local43.method1713(Static23.aBoolean33) && !Static19.method430(arg6, local37)) {
						continue;
					}
					method854(local43.anInt2636, local75 + local43.anInt2667, local43.anInt2583, local67, local43.anInt2651, arg5, arg6, local75, arg8, arg9, local67 + local43.anInt2600);
					if (local43.aClass3_Sub1_Sub17Array1 != null) {
						method854(local43.anInt2636, local43.anInt2667 + local75, local43.anInt2583, local67, local43.anInt2651, arg5, arg6, local75, local43.aClass3_Sub1_Sub17Array1, arg9, local67 + local43.anInt2600);
					}
					if (local43.anInt2600 < local43.anInt2659 && !local43.aBoolean127) {
						method850(local75 + local43.anInt2667, arg9, arg5, arg6, local43.anInt2600, local67, local43.anInt2659, local43);
					}
					if (!local43.aBoolean127) {
						continue;
					}
				}
				if (local43.anInt2653 == 1 && arg9 >= local75 && arg5 >= local67 && arg9 < local43.anInt2667 + local75 && local43.anInt2600 + local67 > arg5) {
					@Pc(304) boolean local304 = false;
					if (local43.anInt2646 != 0) {
						local304 = Static56.method968(local43);
					}
					if (!local304) {
						Static4.method129(0, local43.aClass5_1188, local43.anInt2651, Static110.aClass5_1307, 0, 20);
					}
				}
				if (local43.anInt2653 == 2 && !Static100.aBoolean124 && local75 <= arg9 && local67 <= arg5 && local43.anInt2667 + local75 > arg9 && local43.anInt2600 + local67 > arg5) {
					@Pc(366) Class5 local366 = local43.method1721(Static23.aBoolean33);
					if (local366 != null) {
						Static4.method129(-1, local366, local43.anInt2651, Static75.method1261(new Class5[] { Static62.aClass5_793, local43.aClass5_1187 }), 0, 14);
					}
				}
				if (local43.anInt2653 == 3 && arg9 >= local75 && arg5 >= local67 && local75 + local43.anInt2667 > arg9 && local43.anInt2600 + local67 > arg5) {
					@Pc(431) byte local431;
					if (arg6 == 3) {
						local431 = 24;
					} else {
						local431 = 29;
					}
					Static4.method129(0, Static106.aClass5_1239, local43.anInt2651, Static110.aClass5_1307, 0, local431);
				}
				if (local43.anInt2653 == 4 && arg9 >= local75 && arg5 >= local67 && local75 + local43.anInt2667 > arg9 && local67 + local43.anInt2600 > arg5) {
					Static4.method129(0, local43.aClass5_1188, local43.anInt2651, Static110.aClass5_1307, 0, 36);
				}
				if (local43.anInt2653 == 5 && local75 <= arg9 && local67 <= arg5 && arg9 < local43.anInt2667 + local75 && arg5 < local43.anInt2600 + local67) {
					Static4.method129(0, local43.aClass5_1188, local43.anInt2651, Static110.aClass5_1307, 0, 41);
				}
				if (local43.anInt2653 == 6 && Static85.anInt2100 == -1 && local75 <= arg9 && local67 <= arg5 && local75 + local43.anInt2667 > arg9 && local67 + local43.anInt2600 > arg5) {
					Static4.method129(-1, local43.aClass5_1188, local43.anInt2651, Static110.aClass5_1307, 0, 8);
				}
				@Pc(586) int local586;
				@Pc(580) int local580;
				if (local43.anInt2658 == 2) {
					local580 = 0;
					for (@Pc(582) int local582 = 0; local582 < local43.anInt2600; local582++) {
						for (local586 = 0; local586 < local43.anInt2667; local586++) {
							@Pc(597) int local597 = (local43.anInt2589 + 32) * local586 + local75;
							@Pc(606) int local606 = (local43.anInt2596 + 32) * local582 + local67;
							if (local580 < 20) {
								local606 += local43.anIntArray306[local580];
								local597 += local43.anIntArray305[local580];
							}
							if (local597 <= arg9 && arg5 >= local606 && local597 + 32 > arg9 && local606 + 32 > arg5) {
								Static62.anInt1665 = local43.anInt2651;
								Static15.anInt523 = local580;
								if (local43.anIntArray309[local580] > 0) {
									@Pc(671) Class3_Sub1_Sub3 local671 = Static37.method694(local43.anIntArray309[local580] - 1);
									if (Static14.anInt2886 == 1 && local43.method1728()) {
										if (local43.anInt2651 != Static85.anInt2106 || local580 != Static32.anInt920) {
											Static4.method129(local580, Static68.aClass5_762, local43.anInt2651, Static75.method1261(new Class5[] { Static85.aClass5_967, Static23.aClass5_318, local671.aClass5_300 }), local671.anInt667, 18);
										}
									} else if (!Static100.aBoolean124 || !local43.method1728()) {
										@Pc(730) Class5[] local730 = local671.aClass5Array4;
										if (Static74.aBoolean90) {
											local730 = Static22.method439(local730);
										}
										@Pc(744) int local744;
										@Pc(794) byte local794;
										if (local43.method1728()) {
											for (local744 = 4; local744 >= 3; local744--) {
												if (local730 != null && local730[local744] != null) {
													if (local744 == 3) {
														local794 = 32;
													} else {
														local794 = 19;
													}
													Static4.method129(local580, local730[local744], local43.anInt2651, Static75.method1261(new Class5[] { Static95.aClass5_1120, local671.aClass5_300 }), local671.anInt667, local794);
												} else if (local744 == 4) {
													Static4.method129(local580, Static114.aClass5_1350, local43.anInt2651, Static75.method1261(new Class5[] { Static95.aClass5_1120, local671.aClass5_300 }), local671.anInt667, 19);
												}
											}
										}
										if (local43.method1717()) {
											Static4.method129(local580, Static68.aClass5_762, local43.anInt2651, Static75.method1261(new Class5[] { Static95.aClass5_1120, local671.aClass5_300 }), local671.anInt667, 23);
										}
										if (local43.method1728() && local730 != null) {
											for (local744 = 2; local744 >= 0; local744--) {
												if (local730[local744] != null) {
													local794 = 0;
													if (local744 == 0) {
														local794 = 28;
													}
													if (local744 == 1) {
														local794 = 16;
													}
													if (local744 == 2) {
														local794 = 54;
													}
													Static4.method129(local580, local730[local744], local43.anInt2651, Static75.method1261(new Class5[] { Static95.aClass5_1120, local671.aClass5_300 }), local671.anInt667, local794);
												}
											}
										}
										local730 = local43.aClass5Array18;
										if (Static74.aBoolean90) {
											local730 = Static22.method439(local730);
										}
										if (local730 != null) {
											for (local744 = 4; local744 >= 0; local744--) {
												if (local730[local744] != null) {
													local794 = 0;
													if (local744 == 0) {
														local794 = 35;
													}
													if (local744 == 1) {
														local794 = 30;
													}
													if (local744 == 2) {
														local794 = 26;
													}
													if (local744 == 3) {
														local794 = 25;
													}
													if (local744 == 4) {
														local794 = 49;
													}
													Static4.method129(local580, local730[local744], local43.anInt2651, Static75.method1261(new Class5[] { Static95.aClass5_1120, local671.aClass5_300 }), local671.anInt667, local794);
												}
											}
										}
										Static4.method129(local580, Static21.aClass5_310, local43.anInt2651, Static75.method1261(new Class5[] { Static95.aClass5_1120, local671.aClass5_300 }), local671.anInt667, 1004);
									} else if ((Static62.anInt1672 & 0x10) == 16) {
										Static4.method129(local580, Static16.aClass5_274, local43.anInt2651, Static75.method1261(new Class5[] { Static15.aClass5_210, Static23.aClass5_318, local671.aClass5_300 }), local671.anInt667, 5);
									}
								}
							}
							local580++;
						}
					}
				}
				if (local43.aBoolean127) {
					if (Static100.aBoolean124) {
						if (local43.method1709() && (Static62.anInt1672 & 0x20) == 32 && arg9 >= local75 && arg5 >= local67 && local75 + local43.anInt2667 > arg9 && local43.anInt2600 + local67 > arg5) {
							Static4.method129(local43.anInt2663, Static16.aClass5_274, local43.anInt2651, Static75.method1261(new Class5[] { Static15.aClass5_210, Static13.aClass5_188, local43.aClass5_1186 }), 0, 39);
						}
					} else if (arg9 >= local75 && local67 <= arg5 && local43.anInt2667 + local75 > arg9 && arg5 < local43.anInt2600 + local67) {
						@Pc(1209) Class5 local1209;
						for (local580 = 9; local580 >= 5; local580--) {
							local1209 = local43.method1730(Static23.aBoolean33, local580);
							if (local1209 != null) {
								Static4.method129(local43.anInt2663, local1209, local43.anInt2651, local43.aClass5_1186, local580 + 1, 51);
							}
						}
						local1209 = local43.method1721(Static23.aBoolean33);
						if (local1209 != null) {
							Static4.method129(local43.anInt2663, local1209, local43.anInt2651, local43.aClass5_1186, 0, 14);
						}
						for (local586 = 4; local586 >= 0; local586--) {
							@Pc(1268) Class5 local1268 = local43.method1730(Static23.aBoolean33, local586);
							if (local1268 != null) {
								Static4.method129(local43.anInt2663, local1268, local43.anInt2651, local43.aClass5_1186, local586 + 1, 51);
							}
						}
						if (local43.method1727()) {
							Static4.method129(-1, local43.aClass5_1188, local43.anInt2651, Static110.aClass5_1307, 0, 8);
						}
					}
				}
			}
		}
	}
}
