import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!jd;")
	public static Class36 aClass36_54;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array8;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!pa;")
	public static Class51 aClass51_45;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_17;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!ke;")
	public static Class39 aClass39_992 = Static2.method66("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!qd;")
	public static Class54 aClass54_22 = new Class54(64);

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!ke;")
	private static Class39 aClass39_993 = Static2.method66("Enter name of player to delete from list");

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public static int anInt2196 = -1;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!ke;")
	public static Class39 aClass39_994 = aClass39_993;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_995 = Static2.method66("(X100(U(Y");

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
	public static int anInt2197 = 0;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_996 = Static2.method66("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
	public static boolean method1567(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method1568() {
		try {
			@Pc(2) Graphics local2 = Static7.aCanvas1.getGraphics();
			Static51.aClass51_50.method1967(4, 4, local2);
		} catch (@Pc(12) Exception local12) {
			Static7.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIIIZI)V")
	public static void method1569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (!Static23.method442(arg3) || (arg9 > arg7 || arg6 < arg0 || arg5 <= arg7 || arg2 <= arg6)) {
			return;
		}
		@Pc(39) Class2_Sub1_Sub6[] local39 = Static76.aClass2_Sub1_Sub6ArrayArray1[arg3];
		for (@Pc(41) int local41 = 0; local41 < local39.length; local41++) {
			@Pc(47) Class2_Sub1_Sub6 local47 = local39[local41];
			if (local47 != null && arg8 == local47.anInt730) {
				@Pc(64) int local64 = arg9 + local47.anInt732;
				@Pc(72) int local72 = arg0 + local47.anInt703 - arg1;
				if (local47.anInt700 == 8 && arg7 >= local64 && local72 <= arg6 && local64 + local47.anInt740 > arg7 && local72 + local47.anInt725 > arg6) {
					Static77.anInt2113 = local41;
				}
				if ((local47.anInt715 >= 0 || local47.anInt717 != 0) && arg7 >= local64 && local72 <= arg6 && arg7 < local47.anInt740 + local64 && local72 + local47.anInt725 > arg6) {
					if (local47.anInt715 < 0) {
						Static72.anInt2052 = local41;
					} else {
						Static72.anInt2052 = local47.anInt715;
					}
				}
				if (local47.anInt700 != 0) {
					if (local47.anInt698 == 1 && arg7 >= local64 && arg6 >= local72 && local47.anInt740 + local64 > arg7 && local72 + local47.anInt725 > arg6) {
						@Pc(244) boolean local244 = false;
						if (local47.anInt722 != 0) {
							local244 = Static53.method1007(local47);
						}
						if (!local244) {
							Static84.method2048(0, local47.aClass39_342, Static86.aClass39_1048, 48, 0, (arg3 << 16) + local41);
						}
					}
					if (local47.anInt698 == 2 && Static87.anInt2324 == 0 && arg7 >= local64 && local72 <= arg6 && local47.anInt740 + local64 > arg7 && local72 + local47.anInt725 > arg6) {
						Static84.method2048(0, local47.aClass39_340, Static20.method431(new Class39[] { Static42.aClass39_536, local47.aClass39_339 }), 19, 0, local41 + (arg3 << 16));
					}
					if (local47.anInt698 == 3 && arg7 >= local64 && arg6 >= local72 && arg7 < local47.anInt740 + local64 && arg6 < local72 + local47.anInt725) {
						@Pc(381) byte local381;
						if (arg4 == 3) {
							local381 = 12;
						} else {
							local381 = 15;
						}
						Static84.method2048(0, Static44.aClass39_550, Static86.aClass39_1048, local381, 0, local41 + (arg3 << 16));
					}
					if (local47.anInt698 == 4 && local64 <= arg7 && local72 <= arg6 && arg7 < local47.anInt740 + local64 && arg6 < local72 + local47.anInt725) {
						Static84.method2048(0, local47.aClass39_342, Static86.aClass39_1048, 24, 0, local41 + (arg3 << 16));
					}
					if (local47.anInt698 == 5 && local64 <= arg7 && arg6 >= local72 && arg7 < local64 + local47.anInt740 && local47.anInt725 + local72 > arg6) {
						Static84.method2048(0, local47.aClass39_342, Static86.aClass39_1048, 55, 0, (arg3 << 16) + local41);
					}
					if (local47.anInt698 == 6 && !Static12.aBoolean14 && arg7 >= local64 && local72 <= arg6 && local47.anInt740 + local64 > arg7 && local72 + local47.anInt725 > arg6) {
						Static84.method2048(0, local47.aClass39_342, Static86.aClass39_1048, 3, 0, (arg3 << 16) + local41);
					}
					if (local47.anInt700 == 2) {
						@Pc(553) int local553 = 0;
						for (@Pc(555) int local555 = 0; local555 < local47.anInt725; local555++) {
							for (@Pc(559) int local559 = 0; local559 < local47.anInt740; local559++) {
								@Pc(571) int local571 = (local47.anInt720 + 32) * local559 + local64;
								@Pc(582) int local582 = local72 + (local47.anInt714 + 32) * local555;
								if (local553 < 20) {
									local582 += local47.anIntArray79[local553];
									local571 += local47.anIntArray77[local553];
								}
								if (arg7 >= local571 && local582 <= arg6 && local571 + 32 > arg7 && arg6 < local582 + 32) {
									Static93.anInt2428 = local553;
									Static104.anInt2783 = (arg3 << 16) + local41;
									if (local47.anIntArray75[local553] > 0) {
										@Pc(638) Class2_Sub1_Sub7 local638 = Static66.method1384(local47.anIntArray75[local553] - 1);
										if (Static16.anInt461 == 1 && local47.aBoolean45) {
											if (Static92.anInt2391 != local41 + (arg3 << 16) || Static61.anInt1741 != local553) {
												Static84.method2048(local553, Static76.aClass39_936, Static20.method431(new Class39[] { Static87.aClass39_1062, Static96.aClass39_1185, local638.aClass39_588 }), 23, local638.anInt1294, (arg3 << 16) + local41);
											}
										} else if (Static87.anInt2324 != 1 || !local47.aBoolean45) {
											@Pc(700) Class39[] local700 = local638.aClass39Array10;
											if (Static29.aBoolean51) {
												local700 = Static12.method253(local700);
											}
											@Pc(715) int local715;
											@Pc(728) byte local728;
											if (local47.aBoolean45) {
												for (local715 = 4; local715 >= 3; local715--) {
													if (local700 != null && local700[local715] != null) {
														if (local715 == 3) {
															local728 = 25;
														} else {
															local728 = 27;
														}
														Static84.method2048(local553, local700[local715], Static20.method431(new Class39[] { Static51.aClass39_1126, local638.aClass39_588 }), local728, local638.anInt1294, (arg3 << 16) + local41);
													} else if (local715 == 4) {
														Static84.method2048(local553, Static18.aClass39_278, Static20.method431(new Class39[] { Static51.aClass39_1126, local638.aClass39_588 }), 27, local638.anInt1294, (arg3 << 16) + local41);
													}
												}
											}
											if (local47.aBoolean44) {
												Static84.method2048(local553, Static76.aClass39_936, Static20.method431(new Class39[] { Static51.aClass39_1126, local638.aClass39_588 }), 53, local638.anInt1294, local41 + (arg3 << 16));
											}
											if (local47.aBoolean45 && local700 != null) {
												for (local715 = 2; local715 >= 0; local715--) {
													if (local700[local715] != null) {
														local728 = 0;
														if (local715 == 0) {
															local728 = 29;
														}
														if (local715 == 1) {
															local728 = 49;
														}
														if (local715 == 2) {
															local728 = 21;
														}
														Static84.method2048(local553, local700[local715], Static20.method431(new Class39[] { Static51.aClass39_1126, local638.aClass39_588 }), local728, local638.anInt1294, (arg3 << 16) + local41);
													}
												}
											}
											local700 = local47.aClass39Array6;
											if (Static29.aBoolean51) {
												local700 = Static12.method253(local700);
											}
											if (local700 != null) {
												for (local715 = 4; local715 >= 0; local715--) {
													if (local700[local715] != null) {
														local728 = 0;
														if (local715 == 0) {
															local728 = 36;
														}
														if (local715 == 1) {
															local728 = 38;
														}
														if (local715 == 2) {
															local728 = 6;
														}
														if (local715 == 3) {
															local728 = 46;
														}
														if (local715 == 4) {
															local728 = 8;
														}
														Static84.method2048(local553, local700[local715], Static20.method431(new Class39[] { Static51.aClass39_1126, local638.aClass39_588 }), local728, local638.anInt1294, (arg3 << 16) + local41);
													}
												}
											}
											Static84.method2048(local553, Static107.aClass39_1192, Static20.method431(new Class39[] { Static51.aClass39_1126, local638.aClass39_588 }), 1001, local638.anInt1294, (arg3 << 16) + local41);
										} else if ((Static39.anInt1170 & 0x10) == 16) {
											Static84.method2048(local553, Static23.aClass39_304, Static20.method431(new Class39[] { Static41.aClass39_516, Static96.aClass39_1185, local638.aClass39_588 }), 22, local638.anInt1294, (arg3 << 16) + local41);
										}
									}
								}
								local553++;
							}
						}
					}
				} else if (!local47.aBoolean41 || Static51.method1771(local41, arg4) || Static6.aBoolean134) {
					method1569(local72, local47.anInt727, local72 + local47.anInt725, arg3, arg4, local47.anInt740 + local64, arg6, arg7, local41, local64);
					if (local47.anInt701 > local47.anInt725) {
						Static47.method906(local72, arg7, local47.anInt725, arg4, arg6, local47, local47.anInt701, local64 + local47.anInt740);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!ec;)Z")
	public static boolean method1570(@OriginalArg(1) Class2_Sub1_Sub6 arg0) {
		if (arg0.anIntArray82 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray82.length; local12++) {
			@Pc(24) int local24 = Static66.method1377(arg0, local12);
			@Pc(29) int local29 = arg0.anIntArray76[local12];
			if (arg0.anIntArray82[local12] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray82[local12] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray82[local12] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	public static void method1571() {
		aClass51_45 = null;
		aClass39_995 = null;
		aClass39_993 = null;
		aClass2_Sub1_Sub4_Sub2Array8 = null;
		aClass36_54 = null;
		aClass39_996 = null;
		aClass54_22 = null;
		aClass39_992 = null;
		aClass2_Sub1_Sub4_Sub3_17 = null;
		aClass39_994 = null;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
	public static void method1572() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static71.anIntArray254[local9 + 32512] = 255;
			}
		}
		@Pc(51) int local51;
		@Pc(44) int local44;
		@Pc(57) int local57;
		for (local16 = 0; local16 < 100; local16++) {
			local44 = (int) (Math.random() * 128.0D) + 128;
			local51 = (int) (Math.random() * 124.0D) + 2;
			local57 = (local44 << 7) + local51;
			Static71.anIntArray254[local57] = 192;
		}
		for (local51 = 1; local51 < 255; local51++) {
			for (local44 = 1; local44 < 127; local44++) {
				local57 = local44 + (local51 << 7);
				Static107.anIntArray324[local57] = (Static71.anIntArray254[local57 + 128] + Static71.anIntArray254[local57 - 1] + Static71.anIntArray254[local57 + 1] + Static71.anIntArray254[local57 + -128]) / 4;
			}
		}
		Static64.anInt1893 += 128;
		if (Static63.anIntArray238.length < Static64.anInt1893) {
			local44 = (int) (Math.random() * 12.0D);
			Static64.anInt1893 -= Static63.anIntArray238.length;
			Static87.method1645(Static27.aClass2_Sub1_Sub4_Sub3Array1[local44]);
		}
		@Pc(164) int local164;
		@Pc(184) int local184;
		for (local44 = 1; local44 < 255; local44++) {
			for (local57 = 1; local57 < 127; local57++) {
				local164 = local57 + (local44 << 7);
				local184 = Static107.anIntArray324[local164 + 128] - Static63.anIntArray238[Static64.anInt1893 + local164 & Static63.anIntArray238.length + -1] / 5;
				if (local184 < 0) {
					local184 = 0;
				}
				Static71.anIntArray254[local164] = local184;
			}
		}
		for (local164 = 0; local164 < 255; local164++) {
			Static75.anIntArray53[local164] = Static75.anIntArray53[local164 + 1];
		}
		Static75.anIntArray53[255] = (int) (Math.sin((double) Static64.anInt1889 / 14.0D) * 16.0D + Math.sin((double) Static64.anInt1889 / 15.0D) * 14.0D + Math.sin((double) Static64.anInt1889 / 16.0D) * 12.0D);
		if (Static72.anInt2062 > 0) {
			Static72.anInt2062 -= 4;
		}
		if (Static94.anInt2478 > 0) {
			Static94.anInt2478 -= 4;
		}
		if (Static72.anInt2062 != 0 || Static94.anInt2478 != 0) {
			return;
		}
		local184 = (int) (Math.random() * 2000.0D);
		if (local184 == 1) {
			Static94.anInt2478 = 1024;
		}
		if (local184 == 0) {
			Static72.anInt2062 = 1024;
			return;
		}
	}
}
