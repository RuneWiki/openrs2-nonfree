import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!je", name = "u", descriptor = "[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array9;

	@OriginalMember(owner = "client!je", name = "I", descriptor = "[I")
	public static int[] anIntArray144;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!je;")
	public static Class40 aClass40_720 = Static69.method1231(" <col=ffff00>");

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_721 = Static69.method1231("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_722 = Static69.method1231(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Lclient!je;")
	private static Class40 aClass40_725 = Static69.method1231("as it was used to break our rules)3");

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Lclient!je;")
	public static Class40 aClass40_723 = aClass40_725;

	@OriginalMember(owner = "client!je", name = "F", descriptor = "Lclient!je;")
	private static Class40 aClass40_728 = Static69.method1231(" from your ignore list first");

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!je;")
	public static Class40 aClass40_724 = aClass40_728;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "Lclient!je;")
	public static Class40 aClass40_726 = Static69.method1231("Wordpack geladen)3");

	@OriginalMember(owner = "client!je", name = "B", descriptor = "Lclient!je;")
	public static Class40 aClass40_727 = Static69.method1231("title)3jpg");

	@OriginalMember(owner = "client!je", name = "gb", descriptor = "Lclient!je;")
	private static Class40 aClass40_730 = Static69.method1231("skill)2");

	@OriginalMember(owner = "client!je", name = "X", descriptor = "Lclient!je;")
	public static Class40 aClass40_729 = aClass40_730;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	public static void method958() {
		aClass40_727 = null;
		aClass40_725 = null;
		aClass40_723 = null;
		aClass40_729 = null;
		aClass40_720 = null;
		aClass40_728 = null;
		aClass40_724 = null;
		aClass2_Sub1_Sub2_Sub4Array9 = null;
		anIntArray144 = null;
		aClass40_730 = null;
		aClass40_726 = null;
		aClass40_722 = null;
		aClass40_721 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Lclient!kc;")
	public static Class2_Sub13 method972(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(12) int local12 = arg0 & 0xFFFF;
		if (Static45.aClass2_Sub13ArrayArray1[local3] == null || Static45.aClass2_Sub13ArrayArray1[local3][local12] == null) {
			@Pc(30) boolean local30 = Static112.method1873(local3);
			if (!local30) {
				return null;
			}
		}
		return Static45.aClass2_Sub13ArrayArray1[local3][local12];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIBIII[Lclient!kc;)V")
	public static void method973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub13[] arg7) {
		for (@Pc(20) int local20 = 0; local20 < arg7.length; local20++) {
			@Pc(26) Class2_Sub13 local26 = arg7[local20];
			if (local26 != null && (!local26.aBoolean112 || local26.anInt1583 == 0 || local26.aBoolean115 || Static116.method1945(local26) != 0 || local26 == Static65.aClass2_Sub13_11) && arg5 == local26.anInt1543 && (!local26.aBoolean112 || !Static49.method883(local26))) {
				@Pc(64) int local64 = arg1 + local26.anInt1591;
				@Pc(70) int local70 = local26.anInt1545 + arg4;
				if (Static38.aClass2_Sub13_5 == local26) {
					Static122.anInt2866 = local70;
					Static73.aBoolean141 = true;
					Static74.anInt958 = local64;
				}
				@Pc(98) int local98;
				@Pc(109) int local109;
				@Pc(131) int local131;
				@Pc(142) int local142;
				@Pc(153) int local153;
				if (local26.anInt1583 == 2) {
					local98 = arg6;
					local109 = arg0;
					local142 = arg2;
					local131 = arg3;
				} else {
					@Pc(115) int local115;
					@Pc(120) int local120;
					if (local26.anInt1583 == 9) {
						local115 = local64;
						local120 = local70;
						local153 = local26.anInt1568 + local70;
						@Pc(158) int local158 = local26.anInt1599 + local64;
						if (local64 > local158) {
							local115 = local158;
							local158 = local64;
						}
						if (local153 < local70) {
							local120 = local153;
							local153 = local70;
						}
						local98 = arg6 >= local115 ? arg6 : local115;
						local158++;
						local109 = local120 <= arg0 ? arg0 : local120;
						local131 = local158 < arg3 ? local158 : arg3;
						local153++;
						local142 = arg2 > local153 ? local153 : arg2;
					} else {
						local98 = arg6 >= local64 ? arg6 : local64;
						local109 = local70 > arg0 ? local70 : arg0;
						local115 = local64 + local26.anInt1599;
						local120 = local26.anInt1568 + local70;
						local131 = arg3 <= local115 ? arg3 : local115;
						local142 = local120 >= arg2 ? arg2 : local120;
					}
				}
				if (!local26.aBoolean112 || local131 > local98 && local142 > local109) {
					if (local26.anInt1586 == 1337) {
						Static17.method316(local26);
					} else if (local26.anInt1586 == 1338) {
						Static7.method175(local64, local70);
					} else {
						if (local26.anInt1583 == 0) {
							if (!local26.aBoolean112 && Static49.method883(local26) && local26 != Static134.aClass2_Sub13_10) {
								continue;
							}
							method973(local109, local64 - local26.anInt1606, local142, local131, local70 - local26.anInt1598, local26.anInt1560, local98, arg7);
							if (local26.aClass2_Sub13Array2 != null) {
								method973(local109, local64 - local26.anInt1606, local142, local131, local70 - local26.anInt1598, local26.anInt1560, local98, local26.aClass2_Sub13Array2);
							}
							@Pc(333) Class2_Sub11 local333 = (Class2_Sub11) Static61.aClass77_6.method2034((long) local26.anInt1560);
							if (local333 != null) {
								Static119.method2010(local70, local142, local64, local131, local109, local98, local333.anInt1313);
							}
						}
						if (local26.aBoolean112) {
							@Pc(370) boolean local370;
							if (local98 <= Static112.anInt2616 && Static85.anInt2261 >= local109 && local131 > Static112.anInt2616 && Static85.anInt2261 < local142) {
								local370 = true;
							} else {
								local370 = false;
							}
							@Pc(376) boolean local376 = false;
							if (Static68.anInt1856 == 1 && local98 <= Static41.anInt1096 && Static103.anInt2511 >= local109 && local131 > Static41.anInt1096 && Static103.anInt2511 < local142) {
								local376 = true;
							}
							@Pc(397) boolean local397 = false;
							if (Static107.anInt2544 == 1 && local370) {
								local397 = true;
							}
							if (local376) {
								Static134.method1095(local26, Static41.anInt1096 - local64, -local70 + Static103.anInt2511);
							}
							if (Static38.aClass2_Sub13_5 != null && local26 != Static38.aClass2_Sub13_5 && local370 && Static118.method2004(Static116.method1945(local26))) {
								Static13.aClass2_Sub13_1 = local26;
							}
							if (local26 == Static65.aClass2_Sub13_11) {
								Static103.anInt2505 = local70;
								Static75.anInt1947 = local64;
								Static25.aBoolean50 = true;
							}
							if (local26.aBoolean115) {
								@Pc(456) Class2_Sub7 local456;
								if (local370 && Static74.anInt923 != 0 && local26.anObjectArray10 != null) {
									local456 = new Class2_Sub7();
									local456.aClass2_Sub13_4 = local26;
									local456.anObjectArray1 = local26.anObjectArray10;
									local456.anInt725 = Static74.anInt923;
									Static62.aClass3_8.method75(local456);
								}
								if (Static38.aClass2_Sub13_5 != null || Static101.aClass2_Sub13_14 != null || Static8.aBoolean21) {
									local370 = false;
									local376 = false;
									local397 = false;
								}
								if (!local26.aBoolean113 && local376) {
									local26.aBoolean113 = true;
									if (local26.anObjectArray22 != null) {
										local456 = new Class2_Sub7();
										local456.aClass2_Sub13_4 = local26;
										local456.anInt725 = Static103.anInt2511 - local70;
										local456.anInt722 = Static41.anInt1096 - local64;
										local456.anObjectArray1 = local26.anObjectArray22;
										Static62.aClass3_8.method75(local456);
									}
								}
								if (local26.aBoolean113 && local397 && local26.anObjectArray24 != null) {
									local456 = new Class2_Sub7();
									local456.anInt725 = Static85.anInt2261 - local70;
									local456.anObjectArray1 = local26.anObjectArray24;
									local456.aClass2_Sub13_4 = local26;
									local456.anInt722 = Static112.anInt2616 - local64;
									Static62.aClass3_8.method75(local456);
								}
								if (local26.aBoolean113 && !local397) {
									local26.aBoolean113 = false;
									if (local26.anObjectArray23 != null) {
										local456 = new Class2_Sub7();
										local456.anInt725 = Static85.anInt2261 - local70;
										local456.anInt722 = Static112.anInt2616 - local64;
										local456.aClass2_Sub13_4 = local26;
										local456.anObjectArray1 = local26.anObjectArray23;
										Static127.aClass3_17.method75(local456);
									}
								}
								if (local397 && local26.anObjectArray5 != null) {
									local456 = new Class2_Sub7();
									local456.anInt725 = Static85.anInt2261 - local70;
									local456.aClass2_Sub13_4 = local26;
									local456.anInt722 = Static112.anInt2616 - local64;
									local456.anObjectArray1 = local26.anObjectArray5;
									Static62.aClass3_8.method75(local456);
								}
								if (!local26.aBoolean109 && local370) {
									local26.aBoolean109 = true;
									if (local26.anObjectArray9 != null) {
										local456 = new Class2_Sub7();
										local456.anObjectArray1 = local26.anObjectArray9;
										local456.aClass2_Sub13_4 = local26;
										local456.anInt722 = Static112.anInt2616 - local64;
										local456.anInt725 = Static85.anInt2261 - local70;
										Static62.aClass3_8.method75(local456);
									}
								}
								if (local26.aBoolean109 && local370 && local26.anObjectArray13 != null) {
									local456 = new Class2_Sub7();
									local456.anObjectArray1 = local26.anObjectArray13;
									local456.aClass2_Sub13_4 = local26;
									local456.anInt725 = Static85.anInt2261 - local70;
									local456.anInt722 = Static112.anInt2616 - local64;
									Static62.aClass3_8.method75(local456);
								}
								if (local26.aBoolean109 && !local370) {
									local26.aBoolean109 = false;
									if (local26.anObjectArray12 != null) {
										local456 = new Class2_Sub7();
										local456.anInt725 = Static85.anInt2261 - local70;
										local456.anInt722 = Static112.anInt2616 - local64;
										local456.anObjectArray1 = local26.anObjectArray12;
										local456.aClass2_Sub13_4 = local26;
										Static127.aClass3_17.method75(local456);
									}
								}
								if (local26.anObjectArray11 != null) {
									local456 = new Class2_Sub7();
									local456.aClass2_Sub13_4 = local26;
									local456.anObjectArray1 = local26.anObjectArray11;
									Static79.aClass3_13.method75(local456);
								}
								@Pc(780) int local780;
								@Pc(782) int local782;
								@Pc(798) Class2_Sub7 local798;
								if (local26.anObjectArray26 != null && local26.anInt1553 < Static74.anInt949) {
									if (local26.anIntArray160 == null || Static74.anInt949 - local26.anInt1553 > 32) {
										local456 = new Class2_Sub7();
										local456.aClass2_Sub13_4 = local26;
										local456.anObjectArray1 = local26.anObjectArray26;
										Static62.aClass3_8.method75(local456);
									} else {
										label368: for (local153 = local26.anInt1553; local153 < Static74.anInt949; local153++) {
											local780 = Static26.anIntArray78[local153 & 0x1F];
											for (local782 = 0; local782 < local26.anIntArray160.length; local782++) {
												if (local26.anIntArray160[local782] == local780) {
													local798 = new Class2_Sub7();
													local798.aClass2_Sub13_4 = local26;
													local798.anObjectArray1 = local26.anObjectArray26;
													Static62.aClass3_8.method75(local798);
													break label368;
												}
											}
										}
									}
									local26.anInt1553 = Static74.anInt949;
								}
								if (local26.anObjectArray3 != null && Static5.anInt159 > local26.anInt1597) {
									if (local26.anIntArray156 == null || Static5.anInt159 - local26.anInt1597 > 32) {
										local456 = new Class2_Sub7();
										local456.aClass2_Sub13_4 = local26;
										local456.anObjectArray1 = local26.anObjectArray3;
										Static62.aClass3_8.method75(local456);
									} else {
										label348: for (local153 = local26.anInt1597; local153 < Static5.anInt159; local153++) {
											local780 = Static106.anIntArray288[local153 & 0x1F];
											for (local782 = 0; local782 < local26.anIntArray156.length; local782++) {
												if (local26.anIntArray156[local782] == local780) {
													local798 = new Class2_Sub7();
													local798.anObjectArray1 = local26.anObjectArray3;
													local798.aClass2_Sub13_4 = local26;
													Static62.aClass3_8.method75(local798);
													break label348;
												}
											}
										}
									}
									local26.anInt1597 = Static5.anInt159;
								}
								if (local26.anObjectArray19 != null && Static34.anInt812 > local26.anInt1536) {
									if (local26.anIntArray157 == null || Static34.anInt812 - local26.anInt1536 > 32) {
										local456 = new Class2_Sub7();
										local456.anObjectArray1 = local26.anObjectArray19;
										local456.aClass2_Sub13_4 = local26;
										Static62.aClass3_8.method75(local456);
									} else {
										label328: for (local153 = local26.anInt1536; local153 < Static34.anInt812; local153++) {
											local780 = Static52.anIntArray142[local153 & 0x1F];
											for (local782 = 0; local782 < local26.anIntArray157.length; local782++) {
												if (local26.anIntArray157[local782] == local780) {
													local798 = new Class2_Sub7();
													local798.aClass2_Sub13_4 = local26;
													local798.anObjectArray1 = local26.anObjectArray19;
													Static62.aClass3_8.method75(local798);
													break label328;
												}
											}
										}
									}
									local26.anInt1536 = Static34.anInt812;
								}
								if (local26.anInt1579 < Static97.anInt2440 && local26.anObjectArray20 != null) {
									local456 = new Class2_Sub7();
									local456.anObjectArray1 = local26.anObjectArray20;
									local456.aClass2_Sub13_4 = local26;
									Static62.aClass3_8.method75(local456);
								}
								if (Static21.anInt643 > local26.anInt1579 && local26.anObjectArray27 != null) {
									local456 = new Class2_Sub7();
									local456.anObjectArray1 = local26.anObjectArray27;
									local456.aClass2_Sub13_4 = local26;
									Static62.aClass3_8.method75(local456);
								}
								if (Static16.anInt409 > local26.anInt1579 && local26.anObjectArray17 != null) {
									local456 = new Class2_Sub7();
									local456.aClass2_Sub13_4 = local26;
									local456.anObjectArray1 = local26.anObjectArray17;
									Static62.aClass3_8.method75(local456);
								}
								if (local26.anInt1579 < Static28.anInt699 && local26.anObjectArray14 != null) {
									local456 = new Class2_Sub7();
									local456.aClass2_Sub13_4 = local26;
									local456.anObjectArray1 = local26.anObjectArray14;
									Static62.aClass3_8.method75(local456);
								}
								local26.anInt1579 = Static70.anInt1886;
								if (local26.anObjectArray7 != null) {
									for (local153 = 0; local153 < Static121.anInt2834; local153++) {
										@Pc(1150) Class2_Sub7 local1150 = new Class2_Sub7();
										local1150.aClass2_Sub13_4 = local26;
										local1150.anInt717 = Static75.anIntArray208[local153];
										local1150.anInt718 = Static84.anIntArray246[local153];
										local1150.anObjectArray1 = local26.anObjectArray7;
										Static62.aClass3_8.method75(local1150);
									}
								}
							}
						}
						if (!local26.aBoolean112) {
							if (Static38.aClass2_Sub13_5 != null || Static101.aClass2_Sub13_14 != null || Static8.aBoolean21) {
								return;
							}
							if ((local26.anInt1541 >= 0 || local26.anInt1600 != 0) && Static112.anInt2616 >= local98 && Static85.anInt2261 >= local109 && local131 > Static112.anInt2616 && Static85.anInt2261 < local142) {
								if (local26.anInt1541 >= 0) {
									Static134.aClass2_Sub13_10 = arg7[local26.anInt1541];
								} else {
									Static134.aClass2_Sub13_10 = local26;
								}
							}
							if (local26.anInt1583 == 8 && local98 <= Static112.anInt2616 && Static85.anInt2261 >= local109 && Static112.anInt2616 < local131 && Static85.anInt2261 < local142) {
								Static54.aClass2_Sub13_6 = local26;
							}
							if (local26.anInt1535 > local26.anInt1568) {
								Static54.method948(local26, Static85.anInt2261, Static112.anInt2616, local70, local64 + local26.anInt1599, local26.anInt1535, local26.anInt1568);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(II)Lclient!je;")
	public static Class40 method979(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static49.method886(arg0) : Static114.aClass40_1428;
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
	public static void method990() {
		if (Static29.aClass34_1 != null) {
			Static29.aClass34_1.method2125();
		}
		if (Static32.aClass34_2 != null) {
			Static32.aClass34_2.method2125();
		}
	}
}
