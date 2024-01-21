import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
	public static int anInt2888;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array10;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	public static int anInt2884 = 0;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "[I")
	public static int[] anIntArray492 = new int[4000];

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1394 = Static78.method1313("scroll:");

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1395 = Static78.method1313("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1396 = Static78.method1313("Texturen geladen)3");

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1397 = Static78.method1313(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1398 = Static78.method1313("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
	public static int anInt2891 = 0;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1399 = aClass25_1394;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1400 = aClass25_1394;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1401 = Static78.method1313("An:");

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III[Lclient!ob;BIIIIIII)V")
	public static void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub2_Sub14[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg10 < arg1 || arg0 > arg8 || arg6 <= arg10 || arg5 <= arg8) {
			return;
		}
		for (@Pc(36) int local36 = 0; local36 < arg3.length; local36++) {
			@Pc(47) Class1_Sub2_Sub14 local47 = arg3[local36];
			if (local47 != null && local47.anInt1905 == arg2 && (!local47.aBoolean90 || !Static39.method890(local47))) {
				@Pc(70) int local70 = local47.anInt1959 + arg1 - arg4;
				@Pc(78) int local78 = arg0 + local47.anInt1917 - arg7;
				if ((local47.anInt1939 >= 0 || local47.anInt1920 != 0) && arg10 >= local70 && local78 <= arg8 && arg10 < local70 + local47.anInt1911 && arg8 < local78 + local47.anInt1923) {
					if (local47.anInt1939 >= 0) {
						Static87.anInt1631 = local47.anInt1939;
					} else {
						Static87.anInt1631 = local36;
					}
				}
				if (local47.anInt1960 == 8 && arg10 >= local70 && arg8 >= local78 && local70 + local47.anInt1911 > arg10 && local78 + local47.anInt1923 > arg8) {
					Static1.anInt21 = local36;
				}
				if (local47.anInt1960 == 0) {
					if (!local47.aBoolean90 && Static39.method890(local47) && !Static94.method1578(local36, arg9)) {
						continue;
					}
					method1994(local78, local70, local47.anInt1937, arg3, local47.anInt1949, local78 + local47.anInt1923, local47.anInt1911 + local70, local47.anInt1957, arg8, arg9, arg10);
					if (local47.aClass1_Sub2_Sub14Array2 != null) {
						method1994(local78, local70, local47.anInt1937, local47.aClass1_Sub2_Sub14Array2, local47.anInt1949, local47.anInt1923 + local78, local70 - -local47.anInt1911, local47.anInt1957, arg8, arg9, arg10);
					}
					if (local47.anInt1923 < local47.anInt1912 && !local47.aBoolean90) {
						Static38.method880(arg8, local47.anInt1911 + local70, local47, arg10, local78, local47.anInt1912, local47.anInt1923, arg9);
					}
					if (!local47.aBoolean90) {
						continue;
					}
				}
				if (local47.anInt1896 == 1 && arg10 >= local70 && arg8 >= local78 && arg10 < local70 + local47.anInt1911 && local78 + local47.anInt1923 > arg8) {
					@Pc(283) boolean local283 = false;
					if (local47.anInt1934 != 0) {
						local283 = Static106.method1724(local47);
					}
					if (!local283) {
						Static80.method1365(0, 58, 0, local47.anInt1937, Static92.aClass25_985, local47.aClass25_942);
					}
				}
				if (local47.anInt1896 == 2 && !Static84.aBoolean83 && local70 <= arg10 && local78 <= arg8 && local47.anInt1911 + local70 > arg10 && arg8 < local47.anInt1923 + local78) {
					@Pc(345) Class25 local345 = Static110.method1774(local47);
					if (local345 != null) {
						Static80.method1365(-1, 45, 0, local47.anInt1937, Static116.method1859(new Class25[] { Static103.aClass25_1362, local47.aClass25_940 }), local345);
					}
				}
				if (local47.anInt1896 == 3 && arg10 >= local70 && arg8 >= local78 && local47.anInt1911 + local70 > arg10 && arg8 < local47.anInt1923 + local78) {
					@Pc(413) byte local413;
					if (arg9 == 3) {
						local413 = 28;
					} else {
						local413 = 46;
					}
					Static80.method1365(0, local413, 0, local47.anInt1937, Static92.aClass25_985, Static1.aClass25_12);
				}
				if (local47.anInt1896 == 4 && arg10 >= local70 && arg8 >= local78 && local47.anInt1911 + local70 > arg10 && arg8 < local47.anInt1923 + local78) {
					Static80.method1365(0, 12, 0, local47.anInt1937, Static92.aClass25_985, local47.aClass25_942);
				}
				if (local47.anInt1896 == 5 && local70 <= arg10 && local78 <= arg8 && arg10 < local47.anInt1911 + local70 && local47.anInt1923 + local78 > arg8) {
					Static80.method1365(0, 7, 0, local47.anInt1937, Static92.aClass25_985, local47.aClass25_942);
				}
				if (local47.anInt1896 == 6 && Static33.anInt917 == -1 && local70 <= arg10 && arg8 >= local78 && local70 + local47.anInt1911 > arg10 && local78 + local47.anInt1923 > arg8) {
					Static80.method1365(-1, 15, 0, local47.anInt1937, Static92.aClass25_985, local47.aClass25_942);
				}
				@Pc(572) int local572;
				@Pc(566) int local566;
				if (local47.anInt1960 == 2) {
					local566 = 0;
					for (@Pc(568) int local568 = 0; local568 < local47.anInt1923; local568++) {
						for (local572 = 0; local572 < local47.anInt1911; local572++) {
							@Pc(583) int local583 = local70 + local572 * (local47.anInt1945 + 32);
							@Pc(592) int local592 = (local47.anInt1944 + 32) * local568 + local78;
							if (local566 < 20) {
								local583 += local47.anIntArray343[local566];
								local592 += local47.anIntArray348[local566];
							}
							if (arg10 >= local583 && arg8 >= local592 && local583 + 32 > arg10 && arg8 < local592 + 32) {
								Static35.anInt962 = local566;
								Static64.anInt1437 = local47.anInt1937;
								if (local47.anIntArray341[local566] > 0) {
									@Pc(657) Class1_Sub2_Sub16 local657 = Static33.method736(local47.anIntArray341[local566] - 1);
									if (Static80.anInt1774 == 1 && Static90.method1514(Static77.method1300(local47))) {
										if (local47.anInt1937 != Static92.anInt2081 || local566 != Static76.anInt1587) {
											Static80.method1365(local566, 9, local657.anInt2155, local47.anInt1937, Static116.method1859(new Class25[] { Static65.aClass25_670, Static48.aClass25_507, local657.aClass25_1018 }), Static42.aClass25_475);
										}
									} else if (!Static84.aBoolean83 || !Static90.method1514(Static77.method1300(local47))) {
										@Pc(716) Class25[] local716 = local657.aClass25Array19;
										if (Static107.aBoolean112) {
											local716 = Static86.method1430(local716);
										}
										@Pc(730) int local730;
										@Pc(780) byte local780;
										if (Static90.method1514(Static77.method1300(local47))) {
											for (local730 = 4; local730 >= 3; local730--) {
												if (local716 != null && local716[local730] != null) {
													if (local730 == 3) {
														local780 = 25;
													} else {
														local780 = 42;
													}
													Static80.method1365(local566, local780, local657.anInt2155, local47.anInt1937, Static116.method1859(new Class25[] { Static86.aClass25_937, local657.aClass25_1018 }), local716[local730]);
												} else if (local730 == 4) {
													Static80.method1365(local566, 42, local657.anInt2155, local47.anInt1937, Static116.method1859(new Class25[] { Static86.aClass25_937, local657.aClass25_1018 }), Static23.aClass25_284);
												}
											}
										}
										if (Static10.method247(Static77.method1300(local47))) {
											Static80.method1365(local566, 32, local657.anInt2155, local47.anInt1937, Static116.method1859(new Class25[] { Static86.aClass25_937, local657.aClass25_1018 }), Static42.aClass25_475);
										}
										if (Static90.method1514(Static77.method1300(local47)) && local716 != null) {
											for (local730 = 2; local730 >= 0; local730--) {
												if (local716[local730] != null) {
													local780 = 0;
													if (local730 == 0) {
														local780 = 51;
													}
													if (local730 == 1) {
														local780 = 41;
													}
													if (local730 == 2) {
														local780 = 22;
													}
													Static80.method1365(local566, local780, local657.anInt2155, local47.anInt1937, Static116.method1859(new Class25[] { Static86.aClass25_937, local657.aClass25_1018 }), local716[local730]);
												}
											}
										}
										local716 = local47.aClass25Array16;
										if (Static107.aBoolean112) {
											local716 = Static86.method1430(local716);
										}
										if (local716 != null) {
											for (local730 = 4; local730 >= 0; local730--) {
												if (local716[local730] != null) {
													local780 = 0;
													if (local730 == 0) {
														local780 = 18;
													}
													if (local730 == 1) {
														local780 = 47;
													}
													if (local730 == 2) {
														local780 = 38;
													}
													if (local730 == 3) {
														local780 = 40;
													}
													if (local730 == 4) {
														local780 = 44;
													}
													Static80.method1365(local566, local780, local657.anInt2155, local47.anInt1937, Static116.method1859(new Class25[] { Static86.aClass25_937, local657.aClass25_1018 }), local716[local730]);
												}
											}
										}
										Static80.method1365(local566, 1006, local657.anInt2155, local47.anInt1937, Static116.method1859(new Class25[] { Static86.aClass25_937, local657.aClass25_1018 }), Static37.aClass25_433);
									} else if ((Static94.anInt2162 & 0x10) == 16) {
										Static80.method1365(local566, 14, local657.anInt2155, local47.anInt1937, Static116.method1859(new Class25[] { Static89.aClass25_236, Static48.aClass25_507, local657.aClass25_1018 }), Static83.aClass25_888);
									}
								}
							}
							local566++;
						}
					}
				}
				if (local47.aBoolean90) {
					if (Static84.aBoolean83) {
						if (Static85.method1412(Static77.method1300(local47)) && (Static94.anInt2162 & 0x20) == 32 && local70 <= arg10 && local78 <= arg8 && arg10 < local70 + local47.anInt1911 && local78 + local47.anInt1923 > arg8) {
							Static80.method1365(local47.anInt1942, 50, 0, local47.anInt1937, Static116.method1859(new Class25[] { Static89.aClass25_236, Static55.aClass25_561, local47.aClass25_939 }), Static83.aClass25_888);
						}
					} else if (arg10 >= local70 && local78 <= arg8 && arg10 < local70 + local47.anInt1911 && arg8 < local47.anInt1923 + local78) {
						@Pc(1194) Class25 local1194;
						for (local566 = 9; local566 >= 5; local566--) {
							local1194 = Static55.method1033(local47, local566);
							if (local1194 != null) {
								Static80.method1365(local47.anInt1942, 35, local566 + 1, local47.anInt1937, local47.aClass25_939, local1194);
							}
						}
						local1194 = Static110.method1774(local47);
						if (local1194 != null) {
							Static80.method1365(local47.anInt1942, 45, 0, local47.anInt1937, local47.aClass25_939, local1194);
						}
						for (local572 = 4; local572 >= 0; local572--) {
							@Pc(1249) Class25 local1249 = Static55.method1033(local47, local572);
							if (local1249 != null) {
								Static80.method1365(local47.anInt1942, 35, local572 + 1, local47.anInt1937, local47.aClass25_939, local1249);
							}
						}
						if (Static18.method430(Static77.method1300(local47))) {
							Static80.method1365(local47.anInt1942, 15, 0, local47.anInt1937, Static92.aClass25_985, local47.aClass25_942);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Z")
	public static boolean method1995() {
		try {
			if (Static88.anInt1984 == 2) {
				if (Static100.aClass1_Sub10_1 == null) {
					Static100.aClass1_Sub10_1 = Static133.method1044(Static53.aClass56_78, Static120.anInt2848, Static64.anInt1442);
					if (Static100.aClass1_Sub10_1 == null) {
						return false;
					}
				}
				if (Static120.aClass18_1 == null) {
					Static120.aClass18_1 = new Class18(Static27.aClass56_26, Static39.aClass56_37);
				}
				if (Static89.aClass1_Sub3_Sub1_2.method326(Static53.aClass56_79, Static120.aClass18_1, Static100.aClass1_Sub10_1)) {
					Static89.aClass1_Sub3_Sub1_2.method319();
					Static89.aClass1_Sub3_Sub1_2.method340(Static126.anInt2930);
					Static89.aClass1_Sub3_Sub1_2.method345(Static100.aClass1_Sub10_1, Static118.aBoolean123);
					Static120.aClass18_1 = null;
					Static100.aClass1_Sub10_1 = null;
					Static53.aClass56_78 = null;
					Static88.anInt1984 = 0;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static89.aClass1_Sub3_Sub1_2.method317();
			Static120.aClass18_1 = null;
			Static53.aClass56_78 = null;
			Static100.aClass1_Sub10_1 = null;
			Static88.anInt1984 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public static void method1996() {
		if (Static11.anInt277 != 1) {
			return;
		}
		if (Static30.anInt815 >= 539 && Static30.anInt815 <= 573 && Static23.anInt675 >= 169 && Static23.anInt675 < 205 && Static22.anIntArray162[0] != -1) {
			Static120.aBoolean126 = true;
			Static90.aBoolean98 = true;
			Static90.anInt2027 = 0;
		}
		if (Static30.anInt815 >= 569 && Static30.anInt815 <= 599 && Static23.anInt675 >= 168 && Static23.anInt675 < 205 && Static22.anIntArray162[1] != -1) {
			Static90.aBoolean98 = true;
			Static120.aBoolean126 = true;
			Static90.anInt2027 = 1;
		}
		if (Static30.anInt815 >= 597 && Static30.anInt815 <= 627 && Static23.anInt675 >= 168 && Static23.anInt675 < 205 && Static22.anIntArray162[2] != -1) {
			Static90.aBoolean98 = true;
			Static90.anInt2027 = 2;
			Static120.aBoolean126 = true;
		}
		if (Static30.anInt815 >= 625 && Static30.anInt815 <= 669 && Static23.anInt675 >= 168 && Static23.anInt675 < 203 && Static22.anIntArray162[3] != -1) {
			Static90.aBoolean98 = true;
			Static90.anInt2027 = 3;
			Static120.aBoolean126 = true;
		}
		if (Static30.anInt815 >= 666 && Static30.anInt815 <= 696 && Static23.anInt675 >= 168 && Static23.anInt675 < 205 && Static22.anIntArray162[4] != -1) {
			Static120.aBoolean126 = true;
			Static90.anInt2027 = 4;
			Static90.aBoolean98 = true;
		}
		if (Static30.anInt815 >= 694 && Static30.anInt815 <= 724 && Static23.anInt675 >= 168 && Static23.anInt675 < 205 && Static22.anIntArray162[5] != -1) {
			Static90.aBoolean98 = true;
			Static90.anInt2027 = 5;
			Static120.aBoolean126 = true;
		}
		if (Static30.anInt815 >= 722 && Static30.anInt815 <= 756 && Static23.anInt675 >= 169 && Static23.anInt675 < 205 && Static22.anIntArray162[6] != -1) {
			Static90.anInt2027 = 6;
			Static120.aBoolean126 = true;
			Static90.aBoolean98 = true;
		}
		if (Static30.anInt815 >= 540 && Static30.anInt815 <= 574 && Static23.anInt675 >= 466 && Static23.anInt675 < 502 && Static22.anIntArray162[7] != -1) {
			Static120.aBoolean126 = true;
			Static90.anInt2027 = 7;
			Static90.aBoolean98 = true;
		}
		if (Static30.anInt815 >= 572 && Static30.anInt815 <= 602 && Static23.anInt675 >= 466 && Static23.anInt675 < 503 && Static22.anIntArray162[8] != -1) {
			Static90.anInt2027 = 8;
			Static90.aBoolean98 = true;
			Static120.aBoolean126 = true;
		}
		if (Static30.anInt815 >= 599 && Static30.anInt815 <= 629 && Static23.anInt675 >= 466 && Static23.anInt675 < 503 && Static22.anIntArray162[9] != -1) {
			Static120.aBoolean126 = true;
			Static90.aBoolean98 = true;
			Static90.anInt2027 = 9;
		}
		if (Static30.anInt815 >= 627 && Static30.anInt815 <= 671 && Static23.anInt675 >= 467 && Static23.anInt675 < 502 && Static22.anIntArray162[10] != -1) {
			Static90.anInt2027 = 10;
			Static120.aBoolean126 = true;
			Static90.aBoolean98 = true;
		}
		if (Static30.anInt815 >= 669 && Static30.anInt815 <= 699 && Static23.anInt675 >= 466 && Static23.anInt675 < 503 && Static22.anIntArray162[11] != -1) {
			Static120.aBoolean126 = true;
			Static90.aBoolean98 = true;
			Static90.anInt2027 = 11;
		}
		if (Static30.anInt815 >= 696 && Static30.anInt815 <= 726 && Static23.anInt675 >= 466 && Static23.anInt675 < 503 && Static22.anIntArray162[12] != -1) {
			Static90.aBoolean98 = true;
			Static120.aBoolean126 = true;
			Static90.anInt2027 = 12;
		}
		if (Static30.anInt815 >= 724 && Static30.anInt815 <= 758 && Static23.anInt675 >= 466 && Static23.anInt675 < 502 && Static22.anIntArray162[13] != -1) {
			Static120.aBoolean126 = true;
			Static90.aBoolean98 = true;
			Static90.anInt2027 = 13;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	public static void method1997() {
		aClass25_1399 = null;
		aClass25_1398 = null;
		aByteArrayArray9 = null;
		aClass25_1400 = null;
		aClass25_1395 = null;
		anIntArray492 = null;
		aClass1_Sub2_Sub2_Sub1Array10 = null;
		aClass25_1396 = null;
		aClass25_1401 = null;
		aClass25_1397 = null;
		aClass25_1394 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!fc;ZLclient!fc;BILclient!oc;)V")
	public static void method1998(@OriginalArg(0) Class25 arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(5) Class56 arg2) {
		@Pc(13) int local13 = arg2.method1278(arg1);
		@Pc(19) int local19 = arg2.method1264(arg0, local13);
		Static64.method1129(local13, local19, arg2, 255);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!b;BII)V")
	public static void method1999(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 * arg2 + arg1 * arg1;
		if (local15 <= 4225 || local15 >= 90000) {
			Static106.method1721(arg2, arg0, arg1);
			return;
		}
		@Pc(35) int local35 = Static23.anInt673 + Static54.anInt1298 & 0x7FF;
		@Pc(39) int local39 = Class1_Sub2_Sub2_Sub2.anIntArray189[local35];
		@Pc(43) int local43 = Class1_Sub2_Sub2_Sub2.anIntArray185[local35];
		@Pc(51) int local51 = local39 * 256 / (Static129.anInt2953 + 256);
		@Pc(59) int local59 = local43 * 256 / (Static129.anInt2953 + 256);
		@Pc(69) int local69 = local59 * arg2 - arg1 * local51 >> 16;
		@Pc(79) int local79 = local51 * arg2 + arg1 * local59 >> 16;
		@Pc(85) double local85 = Math.atan2((double) local79, (double) local69);
		@Pc(91) int local91 = (int) (Math.sin(local85) * 63.0D);
		@Pc(97) int local97 = (int) (Math.cos(local85) * 57.0D);
		Static47.aClass1_Sub2_Sub2_Sub1_4.method191(local91 + 94 - 6, -local97 + 83 + -20, local85);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)I")
	public static int method2000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static118.method1908(4, arg1 + 45365, arg0 - -91923) + (Static118.method1908(2, arg1 + 10294, arg0 + 37821) - 128 >> 1) + (Static118.method1908(1, arg1, arg0) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}
}
