import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "Lclient!fc;")
	public static Class21 aClass21_15;

	@OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
	public static int anInt1806;

	@OriginalMember(owner = "client!pb", name = "db", descriptor = "Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2 aClass6_Sub2_Sub2_Sub2_11;

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "Lclient!rc;")
	private static Class55 aClass55_692 = Static34.method846("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!rc;")
	public static Class55 aClass55_690 = aClass55_692;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "[Lclient!rc;")
	public static Class55[] aClass55Array15 = new Class55[5];

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "[Lclient!rc;")
	public static Class55[] aClass55Array16 = new Class55[100];

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_691 = Static34.method846("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "Lclient!be;")
	public static Class8 aClass8_3 = new Class8();

	@OriginalMember(owner = "client!pb", name = "V", descriptor = "Lclient!rc;")
	public static Class55 aClass55_693 = Static34.method846("redstone3");

	@OriginalMember(owner = "client!pb", name = "X", descriptor = "Lclient!rc;")
	private static Class55 aClass55_694 = Static34.method846("button near the top of that page)3");

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_697 = Static34.method846("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "Lclient!rc;")
	public static Class55 aClass55_695 = aClass55_697;

	@OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
	public static int anInt1807 = 127;

	@OriginalMember(owner = "client!pb", name = "ab", descriptor = "Lclient!rc;")
	public static Class55 aClass55_696 = aClass55_694;

	@OriginalMember(owner = "client!pb", name = "eb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_698 = Static34.method846("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!pb", name = "fb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_699 = Static34.method846("(X100(U(Y");

	@OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
	public static int anInt1809 = -1;

	@OriginalMember(owner = "client!pb", name = "hb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_700 = Static34.method846("Einloggen");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public static void method1227() {
		if (Static69.aClass9_1 != null) {
			@Pc(3) Class9 local3 = Static69.aClass9_1;
			synchronized (Static69.aClass9_1) {
				Static69.aClass9_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public static void method1233() {
		aClass55_700 = null;
		aClass55_690 = null;
		aClass55_695 = null;
		aClass55_697 = null;
		aClass55_693 = null;
		aClass55_696 = null;
		aClass55_698 = null;
		aClass55Array16 = null;
		aClass55_692 = null;
		aClass6_Sub2_Sub2_Sub2_11 = null;
		aClass55_691 = null;
		aClass21_15 = null;
		aClass55Array15 = null;
		aClass55_694 = null;
		aClass55_699 = null;
		aClass8_3 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([Lclient!te;IIIIIIIIIII)V")
	public static void method1238(@OriginalArg(0) Class6_Sub2_Sub14[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg9 < arg6 || arg5 > arg2 || arg9 >= arg3 || arg2 >= arg1) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < arg0.length; local24++) {
			@Pc(30) Class6_Sub2_Sub14 local30 = arg0[local24];
			if (local30 != null && local30.anInt2880 == arg10 && (!local30.aBoolean138 || !local30.aBoolean139 || Static10.aBoolean29)) {
				@Pc(59) int local59 = local30.anInt2889 + arg6 - arg4;
				@Pc(66) int local66 = local30.anInt2918 + arg5 - arg7;
				if ((local30.anInt2882 >= 0 || local30.anInt2886 != 0) && local59 <= arg9 && local66 <= arg2 && arg9 < local30.anInt2914 + local59 && arg2 < local66 + local30.anInt2875) {
					if (local30.anInt2882 < 0) {
						Static19.anInt948 = local24;
					} else {
						Static19.anInt948 = local30.anInt2882;
					}
				}
				if (local30.anInt2890 == 8 && local59 <= arg9 && arg2 >= local66 && arg9 < local59 + local30.anInt2914 && local66 + local30.anInt2875 > arg2) {
					Static11.anInt699 = local24;
				}
				if (local30.anInt2890 == 0) {
					if (local30.aBoolean139 && !Static89.method1695(arg8, local24) && !Static10.aBoolean29) {
						continue;
					}
					method1238(arg0, local66 + local30.anInt2875, arg2, local30.anInt2914 + local59, local30.anInt2879, local66, local59, local30.anInt2905, arg8, arg9, local30.anInt2920);
					if (local30.aClass6_Sub2_Sub14Array1 != null) {
						method1238(local30.aClass6_Sub2_Sub14Array1, local66 + local30.anInt2875, arg2, local30.anInt2914 + local59, local30.anInt2879, local66, local59, local30.anInt2905, arg8, arg9, local30.anInt2920);
					}
					if (local30.anInt2875 < local30.anInt2919) {
						Static46.method2062(local30.anInt2919, local30, local30.anInt2875, local30.anInt2914 + local59, arg8, local66, arg9, arg2);
					}
					if (!local30.aBoolean138) {
						continue;
					}
				}
				if (local30.anInt2903 == 1 && local59 <= arg9 && local66 <= arg2 && local59 + local30.anInt2914 > arg9 && local66 + local30.anInt2875 > arg2) {
					@Pc(284) boolean local284 = false;
					if (local30.anInt2909 != 0) {
						local284 = Static109.method2032(local30);
					}
					if (!local284) {
						Static86.method1643(15, local30.anInt2920, 0, Static34.aClass55_502, local30.aClass55_1218, 0);
					}
				}
				if (local30.anInt2903 == 2 && Static102.anInt3029 == 0 && arg9 >= local59 && local66 <= arg2 && arg9 < local30.anInt2914 + local59 && arg2 < local66 + local30.anInt2875) {
					Static86.method1643(14, local30.anInt2920, 0, Static89.method1698(new Class55[] { Static44.aClass55_1153, local30.aClass55_1226 }), local30.aClass55_1222, 0);
				}
				if (local30.anInt2903 == 3 && local59 <= arg9 && arg2 >= local66 && local59 + local30.anInt2914 > arg9 && arg2 < local30.anInt2875 + local66) {
					@Pc(411) byte local411;
					if (arg8 == 3) {
						local411 = 30;
					} else {
						local411 = 36;
					}
					Static86.method1643(local411, local30.anInt2920, 0, Static34.aClass55_502, Static78.aClass55_899, 0);
				}
				if (local30.anInt2903 == 4 && local59 <= arg9 && arg2 >= local66 && arg9 < local30.anInt2914 + local59 && local66 + local30.anInt2875 > arg2) {
					Static86.method1643(16, local30.anInt2920, 0, Static34.aClass55_502, local30.aClass55_1218, 0);
				}
				if (local30.anInt2903 == 5 && local59 <= arg9 && arg2 >= local66 && arg9 < local59 + local30.anInt2914 && arg2 < local66 + local30.anInt2875) {
					Static86.method1643(35, local30.anInt2920, 0, Static34.aClass55_502, local30.aClass55_1218, 0);
				}
				if (local30.anInt2903 == 6 && Static67.anInt1986 == -1 && local59 <= arg9 && arg2 >= local66 && local30.anInt2914 + local59 > arg9 && local30.anInt2875 + local66 > arg2) {
					Static86.method1643(44, local30.anInt2920, 0, Static34.aClass55_502, local30.aClass55_1218, 0);
				}
				@Pc(556) int local556;
				if (local30.anInt2890 == 2) {
					local556 = 0;
					for (@Pc(558) int local558 = 0; local558 < local30.anInt2875; local558++) {
						for (@Pc(562) int local562 = 0; local562 < local30.anInt2914; local562++) {
							@Pc(574) int local574 = local59 + (local30.anInt2924 + 32) * local562;
							@Pc(583) int local583 = local66 + local558 * (local30.anInt2891 + 32);
							if (local556 < 20) {
								local583 += local30.anIntArray271[local556];
								local574 += local30.anIntArray272[local556];
							}
							if (arg9 >= local574 && arg2 >= local583 && local574 + 32 > arg9 && arg2 < local583 + 32) {
								Static114.anInt3279 = local30.anInt2920;
								Static95.anInt2763 = local556;
								if (local30.anIntArray267[local556] > 0) {
									@Pc(647) Class6_Sub2_Sub5 local647 = Static58.method1195(local30.anIntArray267[local556] - 1);
									if (Static43.anInt1463 == 1 && local30.aBoolean134) {
										if (local30.anInt2920 != Static31.anInt1210 || local556 != Static93.anInt2608) {
											Static86.method1643(48, local30.anInt2920, local647.anInt1102, Static89.method1698(new Class55[] { Static22.aClass55_370, Static77.aClass55_893, local647.aClass55_392 }), Static34.aClass55_513, local556);
										}
									} else if (Static102.anInt3029 != 1 || !local30.aBoolean134) {
										@Pc(666) Class55[] local666 = local647.aClass55Array6;
										if (Static107.aBoolean158) {
											local666 = Static77.method1533(local666);
										}
										@Pc(677) int local677;
										@Pc(727) byte local727;
										if (local30.aBoolean134) {
											for (local677 = 4; local677 >= 3; local677--) {
												if (local666 != null && local666[local677] != null) {
													if (local677 == 3) {
														local727 = 56;
													} else {
														local727 = 28;
													}
													Static86.method1643(local727, local30.anInt2920, local647.anInt1102, Static89.method1698(new Class55[] { Static112.aClass55_1353, local647.aClass55_392 }), local666[local677], local556);
												} else if (local677 == 4) {
													Static86.method1643(28, local30.anInt2920, local647.anInt1102, Static89.method1698(new Class55[] { Static112.aClass55_1353, local647.aClass55_392 }), Static112.aClass55_1360, local556);
												}
											}
										}
										if (local30.aBoolean145) {
											Static86.method1643(23, local30.anInt2920, local647.anInt1102, Static89.method1698(new Class55[] { Static112.aClass55_1353, local647.aClass55_392 }), Static34.aClass55_513, local556);
										}
										if (local30.aBoolean134 && local666 != null) {
											for (local677 = 2; local677 >= 0; local677--) {
												if (local666[local677] != null) {
													local727 = 0;
													if (local677 == 0) {
														local727 = 25;
													}
													if (local677 == 1) {
														local727 = 13;
													}
													if (local677 == 2) {
														local727 = 10;
													}
													Static86.method1643(local727, local30.anInt2920, local647.anInt1102, Static89.method1698(new Class55[] { Static112.aClass55_1353, local647.aClass55_392 }), local666[local677], local556);
												}
											}
										}
										local666 = local30.aClass55Array23;
										if (Static107.aBoolean158) {
											local666 = Static77.method1533(local666);
										}
										if (local666 != null) {
											for (local677 = 4; local677 >= 0; local677--) {
												if (local666[local677] != null) {
													local727 = 0;
													if (local677 == 0) {
														local727 = 5;
													}
													if (local677 == 1) {
														local727 = 32;
													}
													if (local677 == 2) {
														local727 = 24;
													}
													if (local677 == 3) {
														local727 = 2;
													}
													if (local677 == 4) {
														local727 = 29;
													}
													Static86.method1643(local727, local30.anInt2920, local647.anInt1102, Static89.method1698(new Class55[] { Static112.aClass55_1353, local647.aClass55_392 }), local666[local677], local556);
												}
											}
										}
										Static86.method1643(1003, local30.anInt2920, local647.anInt1102, Static89.method1698(new Class55[] { Static112.aClass55_1353, local647.aClass55_392 }), Static39.aClass55_660, local556);
									} else if ((Static66.anInt1971 & 0x10) == 16) {
										Static86.method1643(55, local30.anInt2920, local647.anInt1102, Static89.method1698(new Class55[] { Static86.aClass55_1000, Static77.aClass55_893, local647.aClass55_392 }), Static66.aClass55_780, local556);
									}
								}
							}
							local556++;
						}
					}
				}
				if (local30.aBoolean143 && local30.aClass55Array24 != null && local59 <= arg9 && local66 <= arg2 && local30.anInt2914 + local59 > arg9 && local66 + local30.anInt2875 > arg2) {
					for (local556 = local30.aClass55Array24.length - 1; local556 >= 0; local556--) {
						if (local30.aClass55Array24[local556] != null) {
							if (local30.anInt2920 < 0) {
								Static86.method1643(46, local30.anInt2880, local556 + 1, Static34.aClass55_502, local30.aClass55Array24[local556], local30.anInt2920 & 0x7FFF);
							} else {
								Static86.method1643(46, local30.anInt2920, local556 + 1, Static34.aClass55_502, local30.aClass55Array24[local556], 0);
							}
						}
					}
				}
			}
		}
	}
}
