import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!eb", name = "sb", descriptor = "I")
	public static int anInt629;

	@OriginalMember(owner = "client!eb", name = "yb", descriptor = "[I")
	public static int[] anIntArray121;

	@OriginalMember(owner = "client!eb", name = "Kb", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_30;

	@OriginalMember(owner = "client!eb", name = "ob", descriptor = "I")
	public static int anInt626 = 0;

	@OriginalMember(owner = "client!eb", name = "qb", descriptor = "J")
	public static long aLong26 = 0L;

	@OriginalMember(owner = "client!eb", name = "xb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_319 = Static87.method1648("Please wait)3)3)3");

	@OriginalMember(owner = "client!eb", name = "zb", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!eb", name = "Ab", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[5];

	@OriginalMember(owner = "client!eb", name = "Eb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_320 = Static87.method1648("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!eb", name = "Gb", descriptor = "[I")
	public static int[] anIntArray122 = new int[5];

	@OriginalMember(owner = "client!eb", name = "Rb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_321 = Static87.method1648(" )2>");

	@OriginalMember(owner = "client!eb", name = "Tb", descriptor = "I")
	public static int anInt644 = 0;

	@OriginalMember(owner = "client!eb", name = "ac", descriptor = "Lclient!hb;")
	public static Class27 aClass27_322 = Static87.method1648("@yel@*V");

	@OriginalMember(owner = "client!eb", name = "fc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_323 = aClass27_319;

	@OriginalMember(owner = "client!eb", name = "hc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_324 = Static87.method1648("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!ee;II)V")
	public static void method480(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static109.aClass12_62.method674();
		Static30.aClass3_Sub3_Sub2_Sub4_36.method1332(0, 0);
		arg1.method598(Static19.aClass27_237, 55, 28, 16777215, true);
		if (arg2 == 0) {
			arg1.method598(Static41.aClass27_595, 55, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg1.method598(Static8.aClass27_113, 55, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg1.method598(Static3.aClass27_39, 55, 41, 16711680, true);
		}
		if (arg2 == 3) {
			arg1.method598(Static103.aClass27_1297, 55, 41, 65535, true);
		}
		arg1.method598(Static7.aClass27_85, 184, 28, 16777215, true);
		if (arg3 == 0) {
			arg1.method598(Static41.aClass27_595, 184, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg1.method598(Static8.aClass27_113, 184, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg1.method598(Static3.aClass27_39, 184, 41, 16711680, true);
		}
		arg1.method598(Static62.aClass27_784, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg1.method598(Static41.aClass27_595, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg1.method598(Static8.aClass27_113, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg1.method598(Static3.aClass27_39, 324, 41, 16711680, true);
		}
		arg1.method596(Static47.aClass27_620, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(153) Graphics local153 = Static19.aCanvas1.getGraphics();
			Static109.aClass12_62.method671(0, local153, 453);
		} catch (@Pc(161) Exception local161) {
			Static19.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIIII)V")
	public static void method482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static80.method1535(arg5) || (arg2 > arg4 || arg3 < arg6 || arg4 >= arg0 || arg3 >= arg1)) {
			return;
		}
		@Pc(47) Class3_Sub3_Sub6[] local47 = Static96.aClass3_Sub3_Sub6ArrayArray5[arg5];
		for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
			@Pc(55) Class3_Sub3_Sub6 local55 = local47[local49];
			if (local55 != null && local55.anInt1612 == arg8) {
				@Pc(72) int local72 = arg2 + local55.anInt1596;
				@Pc(80) int local80 = arg6 + local55.anInt1584 - arg9;
				if ((local55.anInt1617 >= 0 || local55.anInt1576 != 0) && local72 <= arg4 && arg3 >= local80 && local72 + local55.anInt1578 > arg4 && local80 + local55.anInt1579 > arg3) {
					if (local55.anInt1617 < 0) {
						Static70.anInt1815 = local49;
					} else {
						Static70.anInt1815 = local55.anInt1617;
					}
				}
				if (local55.anInt1608 == 8 && arg4 >= local72 && local80 <= arg3 && arg4 < local72 + local55.anInt1578 && arg3 < local80 + local55.anInt1579) {
					Static81.anInt2192 = local49;
				}
				if (local55.anInt1608 != 0) {
					if (local55.anInt1594 == 1 && local72 <= arg4 && local80 <= arg3 && arg4 < local55.anInt1578 + local72 && arg3 < local55.anInt1579 + local80) {
						@Pc(245) boolean local245 = false;
						if (local55.anInt1601 != 0) {
							local245 = Static28.method618(local55);
						}
						if (!local245) {
							Static46.method925(0, 46, (arg5 << 16) + local49, 0, Static45.aClass27_182, local55.aClass27_787);
						}
					}
					if (local55.anInt1594 == 2 && Static39.anInt964 == 0 && local72 <= arg4 && local80 <= arg3 && arg4 < local55.anInt1578 + local72 && local55.anInt1579 + local80 > arg3) {
						Static46.method925(0, 34, local49 + (arg5 << 16), 0, Static98.method1779(new Class27[] { Static92.aClass27_1211, local55.aClass27_786 }), local55.aClass27_781);
					}
					if (local55.anInt1594 == 3 && arg4 >= local72 && arg3 >= local80 && local72 + local55.anInt1578 > arg4 && arg3 < local55.anInt1579 + local80) {
						@Pc(391) byte local391;
						if (arg7 == 3) {
							local391 = 18;
						} else {
							local391 = 17;
						}
						Static46.method925(0, local391, (arg5 << 16) + local49, 0, Static45.aClass27_182, Static17.aClass27_217);
					}
					if (local55.anInt1594 == 4 && local72 <= arg4 && local80 <= arg3 && arg4 < local55.anInt1578 + local72 && arg3 < local80 + local55.anInt1579) {
						Static46.method925(0, 29, local49 + (arg5 << 16), 0, Static45.aClass27_182, local55.aClass27_787);
					}
					if (local55.anInt1594 == 5 && arg4 >= local72 && local80 <= arg3 && arg4 < local55.anInt1578 + local72 && local80 + local55.anInt1579 > arg3) {
						Static46.method925(0, 43, local49 + (arg5 << 16), 0, Static45.aClass27_182, local55.aClass27_787);
					}
					if (local55.anInt1594 == 6 && Static109.anInt2025 == -1 && local72 <= arg4 && local80 <= arg3 && local72 + local55.anInt1578 > arg4 && local55.anInt1579 + local80 > arg3) {
						Static46.method925(0, 28, (arg5 << 16) + local49, 0, Static45.aClass27_182, local55.aClass27_787);
					}
					if (local55.anInt1608 == 2) {
						@Pc(564) int local564 = 0;
						for (@Pc(566) int local566 = 0; local566 < local55.anInt1579; local566++) {
							for (@Pc(570) int local570 = 0; local570 < local55.anInt1578; local570++) {
								@Pc(581) int local581 = local72 + local570 * (local55.anInt1597 + 32);
								@Pc(590) int local590 = (local55.anInt1583 + 32) * local566 + local80;
								if (local564 < 20) {
									local581 += local55.anIntArray273[local564];
									local590 += local55.anIntArray269[local564];
								}
								if (arg4 >= local581 && arg3 >= local590 && arg4 < local581 + 32 && arg3 < local590 + 32) {
									Static54.anInt1429 = local49 + (arg5 << 16);
									Static91.anInt2518 = local564;
									if (local55.anIntArray274[local564] > 0) {
										@Pc(661) Class3_Sub3_Sub9 local661 = Static37.method696(local55.anIntArray274[local564] - 1);
										if (Static42.anInt1235 == 1 && local55.aBoolean81) {
											if (Static82.anInt2210 != (arg5 << 16) + local49 || local564 != Static102.anInt2656) {
												Static46.method925(local564, 9, local49 + (arg5 << 16), local661.anInt1778, Static98.method1779(new Class27[] { Static81.aClass27_1046, Static11.aClass27_1323, local661.aClass27_869 }), Static8.aClass27_115);
											}
										} else if (Static39.anInt964 != 1 || !local55.aBoolean81) {
											@Pc(735) Class27[] local735 = local661.aClass27Array11;
											if (Static92.aBoolean122) {
												local735 = Static8.method179(local735);
											}
											@Pc(746) int local746;
											@Pc(799) byte local799;
											if (local55.aBoolean81) {
												for (local746 = 4; local746 >= 3; local746--) {
													if (local735 != null && local735[local746] != null) {
														if (local746 == 3) {
															local799 = 5;
														} else {
															local799 = 2;
														}
														Static46.method925(local564, local799, (arg5 << 16) + local49, local661.anInt1778, Static98.method1779(new Class27[] { Static101.aClass27_1272, local661.aClass27_869 }), local735[local746]);
													} else if (local746 == 4) {
														Static46.method925(local564, 2, (arg5 << 16) + local49, local661.anInt1778, Static98.method1779(new Class27[] { Static101.aClass27_1272, local661.aClass27_869 }), Static66.aClass27_835);
													}
												}
											}
											if (local55.aBoolean83) {
												Static46.method925(local564, 16, local49 + (arg5 << 16), local661.anInt1778, Static98.method1779(new Class27[] { Static101.aClass27_1272, local661.aClass27_869 }), Static8.aClass27_115);
											}
											if (local55.aBoolean81 && local735 != null) {
												for (local746 = 2; local746 >= 0; local746--) {
													if (local735[local746] != null) {
														local799 = 0;
														if (local746 == 0) {
															local799 = 12;
														}
														if (local746 == 1) {
															local799 = 36;
														}
														if (local746 == 2) {
															local799 = 31;
														}
														Static46.method925(local564, local799, local49 + (arg5 << 16), local661.anInt1778, Static98.method1779(new Class27[] { Static101.aClass27_1272, local661.aClass27_869 }), local735[local746]);
													}
												}
											}
											local735 = local55.aClass27Array10;
											if (Static92.aBoolean122) {
												local735 = Static8.method179(local735);
											}
											if (local735 != null) {
												for (local746 = 4; local746 >= 0; local746--) {
													if (local735[local746] != null) {
														local799 = 0;
														if (local746 == 0) {
															local799 = 24;
														}
														if (local746 == 1) {
															local799 = 41;
														}
														if (local746 == 2) {
															local799 = 35;
														}
														if (local746 == 3) {
															local799 = 53;
														}
														if (local746 == 4) {
															local799 = 50;
														}
														Static46.method925(local564, local799, local49 + (arg5 << 16), local661.anInt1778, Static98.method1779(new Class27[] { Static101.aClass27_1272, local661.aClass27_869 }), local735[local746]);
													}
												}
											}
											Static46.method925(local564, 1004, local49 + (arg5 << 16), local661.anInt1778, Static98.method1779(new Class27[] { Static101.aClass27_1272, local661.aClass27_869 }), Static36.aClass27_435);
										} else if ((Static68.anInt1748 & 0x10) == 16) {
											Static46.method925(local564, 55, local49 + (arg5 << 16), local661.anInt1778, Static98.method1779(new Class27[] { Static16.aClass27_189, Static11.aClass27_1323, local661.aClass27_869 }), Static10.aClass27_130);
										}
									}
								}
								local564++;
							}
						}
					}
				} else if (!local55.aBoolean84 || Static48.method1676(arg7, local49) || Static10.aBoolean15) {
					method482(local55.anInt1578 + local72, local80 + local55.anInt1579, local72, arg3, arg4, arg5, local80, arg7, local49, local55.anInt1618);
					if (local55.anInt1611 > local55.anInt1579) {
						Static97.method1622(arg4, arg3, local72 + local55.anInt1578, local80, local55.anInt1579, arg7, local55.anInt1611, local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!td;III)Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2 method484(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static64.method1189(arg2, arg0, arg1) ? Static68.method1243() : null;
	}

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "(I)V")
	public static void method485() {
		anIntArray122 = null;
		aClass27_321 = null;
		aClass3_Sub3_Sub2_Sub4_30 = null;
		anIntArray121 = null;
		aClass27_320 = null;
		aClass27_322 = null;
		aClass27_319 = null;
		aClass27_323 = null;
		aBooleanArray6 = null;
		aClass27_324 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZZ)I")
	public static int method486() {
		return Static33.anInt812 + Static48.anInt2393;
	}
}
