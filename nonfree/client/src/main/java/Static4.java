import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!kc;")
	public static Class11 aClass11_5;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "[I")
	public static int[] anIntArray20;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "J")
	public static volatile long aLong6 = 0L;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!lc;")
	public static Class31 aClass31_55 = Static56.method1206("Please reload this page)3");

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!lc;")
	public static Class31 aClass31_56 = Static56.method1206("Login limit exceeded)3");

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_57 = Static56.method1206("@whi@");

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lclient!lc;")
	public static Class31 aClass31_58 = Static56.method1206("k");

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!lc;")
	public static Class31 aClass31_59 = Static56.method1206(")2");

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Lclient!lc;")
	public static Class31 aClass31_60 = Static56.method1206("Could not complete login)3");

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "[Lclient!pd;")
	public static Class2_Sub6[] aClass2_Sub6Array1 = new Class2_Sub6[2048];

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "Lclient!lc;")
	public static Class31 aClass31_61 = Static56.method1206("K");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIZIIII)Z")
	public static boolean method91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (!Static40.method1277(arg5)) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		Static81.method1637(arg1, arg4, arg3, arg6);
		@Pc(22) Class2_Sub1_Sub2[] local22 = Static89.aClass2_Sub1_Sub2ArrayArray1[arg5];
		for (@Pc(29) int local29 = 0; local29 < local22.length; local29++) {
			@Pc(35) Class2_Sub1_Sub2 local35 = local22[local29];
			if (local35 != null && arg2 == local35.anInt240) {
				if (local35.anInt278 > 0) {
					Static34.method876(local35);
				}
				@Pc(57) int local57 = arg1 + local35.anInt267;
				@Pc(65) int local65 = arg4 + local35.anInt263 - arg7;
				if (local35.anInt270 == 0) {
					if (local35.aBoolean17 && !Static14.method421(local29, arg0)) {
						continue;
					}
					if (local35.anInt256 > local35.anInt275 - local35.anInt248) {
						local35.anInt256 = local35.anInt275 - local35.anInt248;
					}
					if (local35.anInt256 < 0) {
						local35.anInt256 = 0;
					}
					local13 &= method91(arg0, local57, local29, local35.anInt272 + local57, local65, arg5, local65 + local35.anInt248, local35.anInt256);
					Static81.method1637(arg1, arg4, arg3, arg6);
					if (local35.anInt275 > local35.anInt248) {
						Static11.method360(local35.anInt275, local35.anInt248, local65, local35.anInt272 + local57, local35.anInt256);
					}
				}
				if (local35.anInt270 != 1) {
					@Pc(159) int local159;
					@Pc(163) int local163;
					@Pc(174) int local174;
					@Pc(221) int local221;
					@Pc(219) int local219;
					@Pc(248) int local248;
					@Pc(157) int local157;
					@Pc(212) int local212;
					@Pc(183) int local183;
					if (local35.anInt270 == 2) {
						local157 = 0;
						for (local159 = 0; local159 < local35.anInt248; local159++) {
							for (local163 = 0; local163 < local35.anInt272; local163++) {
								local174 = local57 + (local35.anInt239 + 32) * local163;
								local183 = (local35.anInt251 + 32) * local159 + local65;
								if (local157 < 20) {
									local183 += local35.anIntArray41[local157];
									local174 += local35.anIntArray39[local157];
								}
								if (local35.anIntArray40[local157] > 0) {
									local212 = 0;
									local219 = local35.anIntArray40[local157] - 1;
									local221 = 0;
									if (Static81.anInt2635 - 32 < local174 && Static81.anInt2637 > local174 && local183 > Static81.anInt2632 - 32 && Static81.anInt2633 > local183 || Static46.anInt1615 != 0 && Static59.anInt2040 == local157) {
										local248 = 0;
										if (Static63.anInt2118 == 1 && Static27.anInt1159 == local157 && Static95.anInt2560 == local29 + (arg5 << 16)) {
											local248 = 16777215;
										}
										@Pc(276) Class2_Sub1_Sub3_Sub2 local276 = Static95.method1601(local248, local219, local35.anIntArray43[local157]);
										if (local276 == null) {
											local13 = false;
										} else {
											if (Static46.anInt1615 != 0 && local157 == Static59.anInt2040 && (arg5 << 16) + local29 == Static67.anInt2202) {
												local221 = Static61.anInt2102 - Static79.anInt2291;
												local212 = Static85.anInt2508 - Static21.anInt1000;
												if (local212 < 5 && local212 > -5) {
													local212 = 0;
												}
												if (local221 < 5 && local221 > -5) {
													local221 = 0;
												}
												if (Static11.anInt515 < 5) {
													local221 = 0;
													local212 = 0;
												}
												local276.method467(local174 + local212, local183 - -local221);
												if (arg2 != -1) {
													@Pc(377) Class2_Sub1_Sub2 local377 = local22[arg2];
													@Pc(400) int local400;
													if (Static81.anInt2632 > local183 + local221 && local377.anInt256 > 0) {
														local400 = Static56.anInt1911 * (Static81.anInt2632 - local183 - local221) / 3;
														if (Static56.anInt1911 * 10 < local400) {
															local400 = Static56.anInt1911 * 10;
														}
														if (local377.anInt256 < local400) {
															local400 = local377.anInt256;
														}
														local377.anInt256 -= local400;
														Static79.anInt2291 += local400;
													}
													if (local183 + local221 + 32 > Static81.anInt2633 && local377.anInt275 - local377.anInt248 > local377.anInt256) {
														local400 = (local183 + local221 + 32 - Static81.anInt2633) * Static56.anInt1911 / 3;
														if (local400 > Static56.anInt1911 * 10) {
															local400 = Static56.anInt1911 * 10;
														}
														if (local400 > local377.anInt275 - local377.anInt248 - local377.anInt256) {
															local400 = local377.anInt275 - local377.anInt248 - local377.anInt256;
														}
														Static79.anInt2291 -= local400;
														local377.anInt256 += local400;
													}
												}
											} else if (Static79.anInt2299 != 0 && Static39.anInt1462 == local157 && Static66.anInt2178 == (arg5 << 16) + local29) {
												local276.method467(local174, local183);
											} else {
												local276.method469(local174, local183);
											}
											if (local276.anInt687 == 33 || local35.anIntArray43[local157] != 1) {
												@Pc(529) int local529 = local35.anIntArray43[local157];
												Static28.aClass2_Sub1_Sub3_Sub3_3.method954(Static53.method1156(local529), local174 + local212 + 1, local183 - (-10 - local221), 0);
												Static28.aClass2_Sub1_Sub3_Sub3_3.method954(Static53.method1156(local529), local212 + local174, local221 + 9 + local183, 16776960);
											}
										}
									}
								} else if (local35.anIntArray44 != null && local157 < 20) {
									@Pc(579) Class2_Sub1_Sub3_Sub2 local579 = local35.method182(local157);
									if (local579 != null) {
										local579.method469(local174, local183);
									} else if (Static91.aBoolean127) {
										local13 = false;
									}
								}
								local157++;
							}
						}
					} else if (local35.anInt270 == 3) {
						if (Static40.method1276(local35)) {
							local157 = local35.anInt250;
							if (Static14.method421(local29, arg0) && local35.anInt259 != 0) {
								local157 = local35.anInt259;
							}
						} else {
							local157 = local35.anInt276;
							if (Static14.method421(local29, arg0) && local35.anInt242 != 0) {
								local157 = local35.anInt242;
							}
						}
						if (local35.anInt254 == 0) {
							if (local35.aBoolean19) {
								Static81.method1646(local57, local65, local35.anInt272, local35.anInt248, local157);
							} else {
								Static81.method1635(local57, local65, local35.anInt272, local35.anInt248, local157);
							}
						} else if (local35.aBoolean19) {
							Static81.method1636(local57, local65, local35.anInt272, local35.anInt248, local157, 256 - (local35.anInt254 & 0xFF));
						} else {
							Static81.method1641(local57, local65, local35.anInt272, local35.anInt248, local157, 256 - (local35.anInt254 & 0xFF));
						}
					} else {
						@Pc(726) Class2_Sub1_Sub3_Sub3 local726;
						@Pc(835) Class31 local835;
						if (local35.anInt270 == 4) {
							local726 = Static11.aClass2_Sub1_Sub3_Sub3Array1[local35.anInt245];
							@Pc(729) Class31 local729 = local35.aClass31_94;
							if (Static40.method1276(local35)) {
								local159 = local35.anInt250;
								if (Static14.method421(local29, arg0) && local35.anInt259 != 0) {
									local159 = local35.anInt259;
								}
								if (local35.aClass31_96.method1223() > 0) {
									local729 = local35.aClass31_96;
								}
							} else {
								local159 = local35.anInt276;
								if (Static14.method421(local29, arg0) && local35.anInt242 != 0) {
									local159 = local35.anInt242;
								}
							}
							if (local35.anInt257 == 6 && Static60.aBoolean104) {
								local159 = local35.anInt276;
								local729 = Static54.aClass31_641;
							}
							if (Static81.anInt2634 == 479) {
								if (local159 == 16776960) {
									local159 = 255;
								}
								if (local159 == 49152) {
									local159 = 16777215;
								}
							}
							local729 = Static47.method1108(local35, local729);
							local183 = local726.anInt1392 + local65;
							while (local729.method1223() > 0) {
								local212 = local729.method1209(Static88.aClass31_825);
								if (local212 == -1) {
									local835 = local729;
									local729 = Static39.aClass31_531;
								} else {
									local835 = local729.method1213(local212, 0);
									local729 = local729.method1222(local212 + 2);
								}
								if (local35.aBoolean18) {
									local726.method964(local835, local35.anInt272 / 2 + local57, local183, local159, local35.aBoolean21);
								} else {
									local726.method959(local835, local57, local183, local159, local35.aBoolean21);
								}
								local183 += local726.anInt1392;
							}
						} else if (local35.anInt270 == 5) {
							@Pc(901) Class2_Sub1_Sub3_Sub2 local901 = local35.method185(Static40.method1276(local35));
							if (local901 != null) {
								local901.method469(local57, local65);
							} else if (Static91.aBoolean127) {
								local13 = false;
							}
						} else if (local35.anInt270 == 6) {
							Static97.method1656(local57 + local35.anInt272 / 2, local65 + local35.anInt248 / 2);
							local157 = local35.anInt249 * Class2_Sub1_Sub3_Sub4.anIntArray379[local35.anInt236] >> 16;
							local159 = Class2_Sub1_Sub3_Sub4.anIntArray376[local35.anInt236] * local35.anInt249 >> 16;
							@Pc(956) boolean local956 = Static40.method1276(local35);
							if (local956) {
								local174 = local35.anInt269;
							} else {
								local174 = local35.anInt243;
							}
							@Pc(980) Class2_Sub1_Sub4_Sub5 local980;
							if (local35.anInt252 == 5) {
								local980 = Static80.aClass4_2.method96(-1, null, null, -1);
							} else if (local174 == -1) {
								local980 = local35.method186(-1, null, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.aClass4_3, local956);
								if (local980 == null && Static91.aBoolean127) {
									local13 = false;
								}
							} else {
								@Pc(1007) Class2_Sub1_Sub10 local1007 = Static54.method1158(local174);
								local980 = local35.method186(local35.anInt253, local1007, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.aClass4_3, local956);
								if (local980 == null && Static91.aBoolean127) {
									local13 = false;
								}
							}
							if (local980 != null) {
								local980.method923(local35.anInt273, 0, local35.anInt236, 0, local157, local159);
							}
							Static97.method1663();
						} else {
							if (local35.anInt270 == 7) {
								local726 = Static11.aClass2_Sub1_Sub3_Sub3Array1[local35.anInt245];
								local159 = 0;
								for (local163 = 0; local163 < local35.anInt248; local163++) {
									for (local174 = 0; local174 < local35.anInt272; local174++) {
										if (local35.anIntArray40[local159] > 0) {
											@Pc(1074) Class2_Sub1_Sub13 local1074 = Static7.method178(local35.anIntArray40[local159] - 1);
											@Pc(1077) Class31 local1077 = local1074.aClass31_861;
											if (local1077 == null) {
												local1077 = Static106.aClass31_954;
											}
											if (local1074.aBoolean128 || local35.anIntArray43[local159] != 1) {
												local1077 = Static37.method974(new Class31[] { local1077, Static66.aClass31_763, Static51.method1133(local35.anIntArray43[local159]) });
											}
											local219 = (local35.anInt251 + 12) * local163 + local65;
											local221 = (local35.anInt239 + 115) * local174 + local57;
											if (local35.aBoolean18) {
												local726.method964(local1077, local221 + local35.anInt272 / 2, local219, local35.anInt276, local35.aBoolean21);
											} else {
												local726.method959(local1077, local221, local219, local35.anInt276, local35.aBoolean21);
											}
										}
										local159++;
									}
								}
							}
							if (local35.anInt270 == 8 && Static80.method675(arg0, local29) && Static28.anInt1168 == 100) {
								local157 = 0;
								@Pc(1188) Class2_Sub1_Sub3_Sub3 local1188 = Static98.aClass2_Sub1_Sub3_Sub3_4;
								local159 = 0;
								local835 = local35.aClass31_94;
								local835 = Static47.method1108(local35, local835);
								@Pc(1215) Class31 local1215;
								while (local835.method1223() > 0) {
									local212 = local835.method1209(Static88.aClass31_825);
									if (local212 == -1) {
										local1215 = local835;
										local835 = Static39.aClass31_531;
									} else {
										local1215 = local835.method1213(local212, 0);
										local835 = local835.method1222(local212 + 2);
									}
									local221 = local1188.method967(local1215);
									if (local221 > local157) {
										local157 = local221;
									}
									local159 += local1188.anInt1392 + 1;
								}
								local221 = local65 + local35.anInt248 + 5;
								local157 += 6;
								local212 = local57 + local35.anInt272 - local157 - 5;
								if (local57 + 5 > local212) {
									local212 = local57 + 5;
								}
								local159 += 7;
								if (arg3 < local157 + local212) {
									local212 = arg3 - local157;
								}
								if (arg6 < local159 + local221) {
									local221 = arg6 - local159;
								}
								Static81.method1646(local212, local221, local157, local159, 16777120);
								Static81.method1635(local212, local221, local157, local159, 0);
								local835 = local35.aClass31_94;
								local219 = local1188.anInt1392 + local221 + 2;
								local835 = Static47.method1108(local35, local835);
								while (local835.method1223() > 0) {
									local248 = local835.method1209(Static88.aClass31_825);
									if (local248 == -1) {
										local1215 = local835;
										local835 = Static39.aClass31_531;
									} else {
										local1215 = local835.method1213(local248, 0);
										local835 = local835.method1222(local248 + 2);
									}
									local1188.method959(local1215, local212 + 3, local219, 0, false);
									local219 += local1188.anInt1392 + 1;
								}
							}
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public static void method95() {
		Static91.anIntArray346 = null;
		Static76.anIntArray316 = null;
		Static95.anIntArray366 = null;
		Static67.anIntArray301 = null;
		Static77.aByteArrayArray10 = null;
		Static50.anIntArray74 = null;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	public static void method100() {
		if (Static49.anInt2693 != 1) {
			return;
		}
		if (Static105.anInt2783 >= 6 && Static105.anInt2783 <= 106 && Static15.anInt649 >= 467 && Static15.anInt649 <= 499) {
			Static78.anInt2283 = (Static78.anInt2283 + 1) % 4;
			Static74.aBoolean115 = true;
			Static27.aBoolean65 = true;
			Static20.aClass2_Sub6_Sub1_11.method684(132);
			Static20.aClass2_Sub6_Sub1_11.method637(Static78.anInt2283);
			Static20.aClass2_Sub6_Sub1_11.method637(Static12.anInt527);
			Static20.aClass2_Sub6_Sub1_11.method637(Static92.anInt1560);
		}
		if (Static105.anInt2783 >= 135 && Static105.anInt2783 <= 235 && Static15.anInt649 >= 467 && Static15.anInt649 <= 499) {
			Static12.anInt527 = (Static12.anInt527 + 1) % 3;
			Static27.aBoolean65 = true;
			Static74.aBoolean115 = true;
			Static20.aClass2_Sub6_Sub1_11.method684(132);
			Static20.aClass2_Sub6_Sub1_11.method637(Static78.anInt2283);
			Static20.aClass2_Sub6_Sub1_11.method637(Static12.anInt527);
			Static20.aClass2_Sub6_Sub1_11.method637(Static92.anInt1560);
		}
		if (Static105.anInt2783 >= 273 && Static105.anInt2783 <= 373 && Static15.anInt649 >= 467 && Static15.anInt649 <= 499) {
			Static27.aBoolean65 = true;
			Static92.anInt1560 = (Static92.anInt1560 + 1) % 3;
			Static74.aBoolean115 = true;
			Static20.aClass2_Sub6_Sub1_11.method684(132);
			Static20.aClass2_Sub6_Sub1_11.method637(Static78.anInt2283);
			Static20.aClass2_Sub6_Sub1_11.method637(Static12.anInt527);
			Static20.aClass2_Sub6_Sub1_11.method637(Static92.anInt1560);
		}
		if (Static105.anInt2783 < 412 || Static105.anInt2783 > 512 || Static15.anInt649 < 467 || Static15.anInt649 > 499) {
			return;
		}
		if (Static42.anInt1586 != -1) {
			Static74.method1397(Static85.aClass31_867, 0, Static39.aClass31_531);
			return;
		}
		Static82.method1447();
		if (Static58.anInt1938 != -1) {
			Static98.anInt1189 = Static42.anInt1586 = Static58.anInt1938;
			Static39.aClass31_541 = Static39.aClass31_531;
			Static77.aBoolean118 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	public static void method101() {
		aClass31_58 = null;
		aClass31_56 = null;
		aClass31_57 = null;
		aClass31_59 = null;
		aClass11_5 = null;
		anIntArray20 = null;
		aClass31_61 = null;
		aClass2_Sub6Array1 = null;
		aClass31_55 = null;
		aClass31_60 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!vb;ZIIILclient!wd;II)V")
	public static void method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class64 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = Static16.anIntArrayArrayArray1[arg0][arg1 + 1][arg8];
		@Pc(23) int local23 = Static16.anIntArrayArrayArray1[arg0][arg1][arg8];
		@Pc(35) int local35 = Static16.anIntArrayArrayArray1[arg0][arg1 + 1][arg8 + 1];
		@Pc(49) int local49 = Static16.anIntArrayArrayArray1[arg0][arg1][arg8 + 1];
		@Pc(62) int local62 = arg1 + (arg8 << 7) + (arg3 << 14) + 1073741824;
		@Pc(66) Class2_Sub1_Sub16 local66 = Static92.method1045(arg3);
		if (local66.anInt2722 == 0) {
			local62 += Integer.MIN_VALUE;
		}
		@Pc(82) int local82 = arg7 + (arg5 << 6);
		if (local66.anInt2701 == 1) {
			local82 += 256;
		}
		@Pc(97) int local97 = local49 + local35 + local23 + local15 >> 2;
		@Pc(123) Class2_Sub1_Sub4 local123;
		if (arg7 == 22) {
			if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
				local123 = local66.method1704(local49, 22, local23, local15, local35, arg5);
			} else {
				local123 = new Class2_Sub1_Sub4_Sub3(arg3, 22, arg5, local23, local15, local35, local49, local66.anInt2703, true);
			}
			arg6.method1798(arg4, arg1, arg8, local97, local123, local62, local82);
			if (local66.aBoolean144 && local66.anInt2722 == 1) {
				arg2.method1728(arg1, arg8);
			}
			return;
		}
		@Pc(214) int local214;
		if (arg7 == 10 || arg7 == 11) {
			if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
				local123 = local66.method1704(local49, 10, local23, local15, local35, arg5);
			} else {
				local123 = new Class2_Sub1_Sub4_Sub3(arg3, 10, arg5, local23, local15, local35, local49, local66.anInt2703, true);
			}
			if (local123 != null) {
				@Pc(217) int local217;
				if (arg5 == 1 || arg5 == 3) {
					local214 = local66.anInt2699;
					local217 = local66.anInt2698;
				} else {
					local217 = local66.anInt2699;
					local214 = local66.anInt2698;
				}
				@Pc(227) int local227 = 0;
				if (arg7 == 11) {
					local227 += 256;
				}
				arg6.method1779(arg4, arg1, arg8, local97, local214, local217, local123, local227, local62, local82);
			}
			if (local66.aBoolean144) {
				arg2.method1719(arg1, local66.aBoolean145, local66.anInt2698, local66.anInt2699, arg8, arg5);
			}
		} else if (arg7 >= 12) {
			if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
				local123 = local66.method1704(local49, arg7, local23, local15, local35, arg5);
			} else {
				local123 = new Class2_Sub1_Sub4_Sub3(arg3, arg7, arg5, local23, local15, local35, local49, local66.anInt2703, true);
			}
			arg6.method1779(arg4, arg1, arg8, local97, 1, 1, local123, 0, local62, local82);
			if (local66.aBoolean144) {
				arg2.method1719(arg1, local66.aBoolean145, local66.anInt2698, local66.anInt2699, arg8, arg5);
			}
		} else if (arg7 == 0) {
			if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
				local123 = local66.method1704(local49, 0, local23, local15, local35, arg5);
			} else {
				local123 = new Class2_Sub1_Sub4_Sub3(arg3, 0, arg5, local23, local15, local35, local49, local66.anInt2703, true);
			}
			arg6.method1767(arg4, arg1, arg8, local97, local123, null, Static34.anIntArray171[arg5], 0, local62, local82);
			if (local66.aBoolean144) {
				arg2.method1725(arg8, arg5, arg1, arg7, local66.aBoolean145);
			}
		} else if (arg7 == 1) {
			if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
				local123 = local66.method1704(local49, 1, local23, local15, local35, arg5);
			} else {
				local123 = new Class2_Sub1_Sub4_Sub3(arg3, 1, arg5, local23, local15, local35, local49, local66.anInt2703, true);
			}
			arg6.method1767(arg4, arg1, arg8, local97, local123, null, Static44.anIntArray247[arg5], 0, local62, local82);
			if (local66.aBoolean144) {
				arg2.method1725(arg8, arg5, arg1, arg7, local66.aBoolean145);
			}
		} else {
			@Pc(464) int local464;
			@Pc(501) Class2_Sub1_Sub4 local501;
			if (arg7 == 2) {
				local464 = arg5 + 1 & 0x3;
				@Pc(487) Class2_Sub1_Sub4 local487;
				if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
					local487 = local66.method1704(local49, 2, local23, local15, local35, arg5 + 4);
					local501 = local66.method1704(local49, 2, local23, local15, local35, local464);
				} else {
					local487 = new Class2_Sub1_Sub4_Sub3(arg3, 2, arg5 + 4, local23, local15, local35, local49, local66.anInt2703, true);
					local501 = new Class2_Sub1_Sub4_Sub3(arg3, 2, local464, local23, local15, local35, local49, local66.anInt2703, true);
				}
				arg6.method1767(arg4, arg1, arg8, local97, local487, local501, Static34.anIntArray171[arg5], Static34.anIntArray171[local464], local62, local82);
				if (local66.aBoolean144) {
					arg2.method1725(arg8, arg5, arg1, arg7, local66.aBoolean145);
				}
			} else if (arg7 == 3) {
				if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
					local123 = local66.method1704(local49, 3, local23, local15, local35, arg5);
				} else {
					local123 = new Class2_Sub1_Sub4_Sub3(arg3, 3, arg5, local23, local15, local35, local49, local66.anInt2703, true);
				}
				arg6.method1767(arg4, arg1, arg8, local97, local123, null, Static44.anIntArray247[arg5], 0, local62, local82);
				if (local66.aBoolean144) {
					arg2.method1725(arg8, arg5, arg1, arg7, local66.aBoolean145);
				}
			} else if (arg7 == 9) {
				if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
					local123 = local66.method1704(local49, arg7, local23, local15, local35, arg5);
				} else {
					local123 = new Class2_Sub1_Sub4_Sub3(arg3, arg7, arg5, local23, local15, local35, local49, local66.anInt2703, true);
				}
				arg6.method1779(arg4, arg1, arg8, local97, 1, 1, local123, 0, local62, local82);
				if (local66.aBoolean144) {
					arg2.method1719(arg1, local66.aBoolean145, local66.anInt2698, local66.anInt2699, arg8, arg5);
				}
			} else {
				if (local66.aBoolean149) {
					if (arg5 == 1) {
						local464 = local49;
						local49 = local35;
						local35 = local15;
						local15 = local23;
						local23 = local464;
					} else if (arg5 == 2) {
						local464 = local49;
						local49 = local15;
						local15 = local464;
						local464 = local35;
						local35 = local23;
						local23 = local464;
					} else if (arg5 == 3) {
						local464 = local49;
						local49 = local23;
						local23 = local15;
						local15 = local35;
						local35 = local464;
					}
				}
				if (arg7 == 4) {
					if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
						local123 = local66.method1704(local49, 4, local23, local15, local35, 0);
					} else {
						local123 = new Class2_Sub1_Sub4_Sub3(arg3, 4, 0, local23, local15, local35, local49, local66.anInt2703, true);
					}
					arg6.method1805(arg4, arg1, arg8, local97, local123, Static34.anIntArray171[arg5], arg5 * 512, 0, 0, local62, local82);
				} else if (arg7 == 5) {
					local464 = 16;
					local214 = arg6.method1757(arg4, arg1, arg8);
					if (local214 > 0) {
						local464 = Static92.method1045(local214 >> 14 & 0x7FFF).anInt2721;
					}
					if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
						local501 = local66.method1704(local49, 4, local23, local15, local35, 0);
					} else {
						local501 = new Class2_Sub1_Sub4_Sub3(arg3, 4, 0, local23, local15, local35, local49, local66.anInt2703, true);
					}
					arg6.method1805(arg4, arg1, arg8, local97, local501, Static34.anIntArray171[arg5], arg5 * 512, Static77.anIntArray317[arg5] * local464, local464 * Static40.anIntArray280[arg5], local62, local82);
				} else if (arg7 == 6) {
					if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
						local123 = local66.method1704(local49, 4, local23, local15, local35, 0);
					} else {
						local123 = new Class2_Sub1_Sub4_Sub3(arg3, 4, 0, local23, local15, local35, local49, local66.anInt2703, true);
					}
					arg6.method1805(arg4, arg1, arg8, local97, local123, 256, arg5, 0, 0, local62, local82);
				} else if (arg7 == 7) {
					if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
						local123 = local66.method1704(local49, 4, local23, local15, local35, 0);
					} else {
						local123 = new Class2_Sub1_Sub4_Sub3(arg3, 4, 0, local23, local15, local35, local49, local66.anInt2703, true);
					}
					arg6.method1805(arg4, arg1, arg8, local97, local123, 512, arg5, 0, 0, local62, local82);
				} else if (arg7 == 8) {
					if (local66.anInt2703 == -1 && local66.anIntArray388 == null) {
						local123 = local66.method1704(local49, 4, local23, local15, local35, 0);
					} else {
						local123 = new Class2_Sub1_Sub4_Sub3(arg3, 4, 0, local23, local15, local35, local49, local66.anInt2703, true);
					}
					arg6.method1805(arg4, arg1, arg8, local97, local123, 768, arg5, 0, 0, local62, local82);
				}
			}
		}
	}
}
