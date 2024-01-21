import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "[Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3[] aClass6_Sub3_Sub3_Sub3Array1;

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "[I")
	public static int[] anIntArray15;

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "Lclient!ga;")
	public static Class29 aClass29_2;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "Lclient!rd;")
	public static Class63 aClass63_54 = Static80.method1463("headicons_prayer");

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "Lclient!rd;")
	public static Class63 aClass63_55 = Static80.method1463("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "Lclient!rd;")
	public static Class63 aClass63_56 = Static80.method1463("overlay_multiway");

	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_57 = Static80.method1463("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "Lclient!rd;")
	public static Class63 aClass63_58 = Static80.method1463("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "Lclient!rd;")
	public static Class63 aClass63_59 = Static80.method1463("Hidden)2use");

	@OriginalMember(owner = "client!ae", name = "V", descriptor = "Lclient!rd;")
	public static Class63 aClass63_61 = Static80.method1463("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "Lclient!rd;")
	public static Class63 aClass63_62 = Static80.method1463("::fpson");

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
	public static void method61() {
		aClass63_62 = null;
		aClass63_56 = null;
		aClass63_55 = null;
		aClass29_2 = null;
		aClass63_58 = null;
		aClass63_57 = null;
		aClass63_59 = null;
		aClass63_54 = null;
		aClass63_61 = null;
		aClass6_Sub3_Sub3_Sub3Array1 = null;
		anIntArray15 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[Lclient!wa;IIIIIIIIBI)V")
	public static void method62(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub3_Sub17[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		if (arg5 > arg7 || arg4 > arg3 || arg0 <= arg7 || arg3 >= arg10) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < arg1.length; local24++) {
			@Pc(30) Class6_Sub3_Sub17 local30 = arg1[local24];
			if (local30 != null && arg9 == local30.anInt3274 && (!local30.aBoolean179 || !Static54.method1095(local30))) {
				@Pc(53) int local53 = local30.anInt3287 + arg5 - arg2;
				@Pc(62) int local62 = local30.anInt3221 + arg4 - arg8;
				if (local30.anInt3284 == 8 && local53 <= arg7 && local62 <= arg3 && local30.anInt3230 + local53 > arg7 && local30.anInt3264 + local62 > arg3) {
					Static85.anInt2835 = local24;
				}
				if ((local30.anInt3222 >= 0 || local30.anInt3229 != 0) && local53 <= arg7 && arg3 >= local62 && arg7 < local53 + local30.anInt3230 && arg3 < local62 + local30.anInt3264) {
					if (local30.anInt3222 >= 0) {
						Static96.anInt2708 = local30.anInt3222;
					} else {
						Static96.anInt2708 = local24;
					}
				}
				if (local30.anInt3284 == 0) {
					if (!local30.aBoolean179 && Static54.method1095(local30) && !Static40.method1427(arg6, local24)) {
						continue;
					}
					method62(local53 + local30.anInt3230, arg1, local30.anInt3243, arg3, local62, local53, arg6, arg7, local30.anInt3291, local30.anInt3233, local62 + local30.anInt3264);
					if (local30.aClass6_Sub3_Sub17Array2 != null) {
						method62(local53 + local30.anInt3230, local30.aClass6_Sub3_Sub17Array2, local30.anInt3243, arg3, local62, local53, arg6, arg7, local30.anInt3291, local30.anInt3233, local62 + local30.anInt3264);
					}
					if (local30.anInt3264 < local30.anInt3219 && !local30.aBoolean179) {
						Static80.method1466(local30, local30.anInt3219, arg6, arg3, local62, local53 + local30.anInt3230, local30.anInt3264, arg7);
					}
					if (!local30.aBoolean179) {
						continue;
					}
				}
				if (local30.anInt3276 == 1 && arg7 >= local53 && arg3 >= local62 && arg7 < local30.anInt3230 + local53 && arg3 < local30.anInt3264 + local62) {
					@Pc(275) boolean local275 = false;
					if (local30.anInt3248 != 0) {
						local275 = Static59.method1158(local30);
					}
					if (!local275) {
						Static19.method501(local30.anInt3233, Static111.aClass63_1661, 0, 0, 43, local30.aClass63_1775);
					}
				}
				if (local30.anInt3276 == 2 && !Static42.aBoolean63 && arg7 >= local53 && arg3 >= local62 && local53 + local30.anInt3230 > arg7 && arg3 < local62 + local30.anInt3264) {
					@Pc(331) Class63 local331 = Static97.method1791(local30);
					if (local331 != null) {
						Static19.method501(local30.anInt3233, Static15.method374(new Class63[] { Static111.aClass63_1658, local30.aClass63_1770 }), 0, -1, 42, local331);
					}
				}
				if (local30.anInt3276 == 3 && arg7 >= local53 && arg3 >= local62 && local30.anInt3230 + local53 > arg7 && arg3 < local62 + local30.anInt3264) {
					@Pc(410) byte local410;
					if (arg6 == 3) {
						local410 = 46;
					} else {
						local410 = 5;
					}
					Static19.method501(local30.anInt3233, Static111.aClass63_1661, 0, 0, local410, Static56.aClass63_897);
				}
				if (local30.anInt3276 == 4 && local53 <= arg7 && arg3 >= local62 && local53 + local30.anInt3230 > arg7 && local30.anInt3264 + local62 > arg3) {
					Static19.method501(local30.anInt3233, Static111.aClass63_1661, 0, 0, 6, local30.aClass63_1775);
				}
				if (local30.anInt3276 == 5 && arg7 >= local53 && arg3 >= local62 && arg7 < local53 + local30.anInt3230 && arg3 < local30.anInt3264 + local62) {
					Static19.method501(local30.anInt3233, Static111.aClass63_1661, 0, 0, 15, local30.aClass63_1775);
				}
				if (local30.anInt3276 == 6 && Static73.anInt2061 == -1 && arg7 >= local53 && local62 <= arg3 && local30.anInt3230 + local53 > arg7 && local62 + local30.anInt3264 > arg3) {
					Static19.method501(local30.anInt3233, Static111.aClass63_1661, 0, -1, 49, local30.aClass63_1775);
				}
				@Pc(580) int local580;
				@Pc(574) int local574;
				if (local30.anInt3284 == 2) {
					local574 = 0;
					for (@Pc(576) int local576 = 0; local576 < local30.anInt3264; local576++) {
						for (local580 = 0; local580 < local30.anInt3230; local580++) {
							@Pc(591) int local591 = local53 + local580 * (local30.anInt3245 + 32);
							@Pc(600) int local600 = (local30.anInt3250 + 32) * local576 + local62;
							if (local574 < 20) {
								local591 += local30.anIntArray364[local574];
								local600 += local30.anIntArray365[local574];
							}
							if (arg7 >= local591 && local600 <= arg3 && local591 + 32 > arg7 && local600 + 32 > arg3) {
								Static111.anInt3050 = local574;
								Static50.anInt1518 = local30.anInt3233;
								if (local30.anIntArray362[local574] > 0) {
									@Pc(663) Class6_Sub3_Sub8 local663 = Static91.method1664(local30.anIntArray362[local574] - 1);
									if (Static29.anInt939 == 1 && Static41.method905(Static82.method1498(local30))) {
										if (local30.anInt3233 != Static64.anInt1831 || local574 != Static13.anInt432) {
											Static19.method501(local30.anInt3233, Static15.method374(new Class63[] { Static1.aClass63_8, Static110.aClass63_1647, local663.aClass63_742 }), local663.anInt1400, local574, 41, Static18.aClass63_385);
										}
									} else if (!Static42.aBoolean63 || !Static41.method905(Static82.method1498(local30))) {
										@Pc(730) Class63[] local730 = local663.aClass63Array12;
										if (Static72.aBoolean109) {
											local730 = Static79.method1453(local730);
										}
										@Pc(744) int local744;
										@Pc(761) byte local761;
										if (Static41.method905(Static82.method1498(local30))) {
											for (local744 = 4; local744 >= 3; local744--) {
												if (local730 != null && local730[local744] != null) {
													if (local744 == 3) {
														local761 = 4;
													} else {
														local761 = 33;
													}
													Static19.method501(local30.anInt3233, Static15.method374(new Class63[] { Static36.aClass63_646, local663.aClass63_742 }), local663.anInt1400, local574, local761, local730[local744]);
												} else if (local744 == 4) {
													Static19.method501(local30.anInt3233, Static15.method374(new Class63[] { Static36.aClass63_646, local663.aClass63_742 }), local663.anInt1400, local574, 33, Static75.aClass63_1100);
												}
											}
										}
										if (Static2.method24(Static82.method1498(local30))) {
											Static19.method501(local30.anInt3233, Static15.method374(new Class63[] { Static36.aClass63_646, local663.aClass63_742 }), local663.anInt1400, local574, 55, Static18.aClass63_385);
										}
										if (Static41.method905(Static82.method1498(local30)) && local730 != null) {
											for (local744 = 2; local744 >= 0; local744--) {
												if (local730[local744] != null) {
													local761 = 0;
													if (local744 == 0) {
														local761 = 45;
													}
													if (local744 == 1) {
														local761 = 37;
													}
													if (local744 == 2) {
														local761 = 20;
													}
													Static19.method501(local30.anInt3233, Static15.method374(new Class63[] { Static36.aClass63_646, local663.aClass63_742 }), local663.anInt1400, local574, local761, local730[local744]);
												}
											}
										}
										local730 = local30.aClass63Array23;
										if (Static72.aBoolean109) {
											local730 = Static79.method1453(local730);
										}
										if (local730 != null) {
											for (local744 = 4; local744 >= 0; local744--) {
												if (local730[local744] != null) {
													local761 = 0;
													if (local744 == 0) {
														local761 = 28;
													}
													if (local744 == 1) {
														local761 = 13;
													}
													if (local744 == 2) {
														local761 = 9;
													}
													if (local744 == 3) {
														local761 = 54;
													}
													if (local744 == 4) {
														local761 = 25;
													}
													Static19.method501(local30.anInt3233, Static15.method374(new Class63[] { Static36.aClass63_646, local663.aClass63_742 }), local663.anInt1400, local574, local761, local730[local744]);
												}
											}
										}
										Static19.method501(local30.anInt3233, Static15.method374(new Class63[] { Static36.aClass63_646, local663.aClass63_742 }), local663.anInt1400, local574, 1005, Static117.aClass63_1621);
									} else if ((Static72.anInt2049 & 0x10) == 16) {
										Static19.method501(local30.anInt3233, Static15.method374(new Class63[] { Static50.aClass63_807, Static110.aClass63_1647, local663.aClass63_742 }), local663.anInt1400, local574, 14, Static33.aClass63_613);
									}
								}
							}
							local574++;
						}
					}
				}
				if (local30.aBoolean179) {
					if (Static42.aBoolean63) {
						if (Static54.method1091(Static82.method1498(local30)) && (Static72.anInt2049 & 0x20) == 32 && arg7 >= local53 && local62 <= arg3 && arg7 < local30.anInt3230 + local53 && arg3 < local62 + local30.anInt3264) {
							Static19.method501(local30.anInt3233, Static15.method374(new Class63[] { Static50.aClass63_807, Static80.aClass63_1157, local30.aClass63_1772 }), 0, local30.anInt3283, 36, Static33.aClass63_613);
						}
					} else if (arg7 >= local53 && arg3 >= local62 && arg7 < local53 + local30.anInt3230 && arg3 < local62 + local30.anInt3264) {
						@Pc(1133) Class63 local1133;
						for (local574 = 9; local574 >= 5; local574--) {
							local1133 = Static30.method720(local30, local574);
							if (local1133 != null) {
								Static19.method501(local30.anInt3233, local30.aClass63_1772, local574 + 1, local30.anInt3283, 56, local1133);
							}
						}
						local1133 = Static97.method1791(local30);
						if (local1133 != null) {
							Static19.method501(local30.anInt3233, local30.aClass63_1772, 0, local30.anInt3283, 42, local1133);
						}
						for (local580 = 4; local580 >= 0; local580--) {
							@Pc(1186) Class63 local1186 = Static30.method720(local30, local580);
							if (local1186 != null) {
								Static19.method501(local30.anInt3233, local30.aClass63_1772, local580 + 1, local30.anInt3283, 56, local1186);
							}
						}
						if (Static111.method2042(Static82.method1498(local30))) {
							Static19.method501(local30.anInt3233, Static111.aClass63_1661, 0, -1, 49, local30.aClass63_1775);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
	public static void method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static65.anInt1846 == 0 || arg1 == 0 || Static25.anInt845 >= 50) {
			return;
		}
		Static11.anIntArray222[Static25.anInt845] = arg0;
		Static96.anIntArray292[Static25.anInt845] = arg1;
		Static68.anIntArray223[Static25.anInt845] = arg2;
		Static15.aClass62Array1[Static25.anInt845] = null;
		Static85.anIntArray306[Static25.anInt845] = 0;
		Static25.anInt845++;
	}
}
