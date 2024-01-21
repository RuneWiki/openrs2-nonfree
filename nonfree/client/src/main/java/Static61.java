import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Lclient!ub;")
	public static Class61 aClass61_4;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Z")
	public static boolean aBoolean88;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "I")
	public static int anInt1875;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	public static int anInt1876;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "Lclient!rc;")
	public static Class55 aClass55_736 = Static34.method846("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!n", name = "e", descriptor = "[Lclient!b;")
	public static Class6_Sub1[] aClass6_Sub1Array1 = new Class6_Sub1[2048];

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!rc;")
	private static Class55 aClass55_737 = Static34.method846("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!rc;")
	private static Class55 aClass55_738 = Static34.method846("Loaded update list");

	@OriginalMember(owner = "client!n", name = "r", descriptor = "Lclient!rc;")
	private static Class55 aClass55_741 = Static34.method846("Unexpected server response");

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!rc;")
	public static Class55 aClass55_739 = aClass55_741;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!rc;")
	public static Class55 aClass55_740 = Static34.method846("null");

	@OriginalMember(owner = "client!n", name = "t", descriptor = "Lclient!rc;")
	public static Class55 aClass55_742 = Static34.method846("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!n", name = "u", descriptor = "I")
	public static int anInt1879 = 0;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "Lclient!rc;")
	public static Class55 aClass55_743 = Static34.method846("(U2");

	@OriginalMember(owner = "client!n", name = "z", descriptor = "Lclient!rc;")
	public static Class55 aClass55_744 = Static34.method846("");

	@OriginalMember(owner = "client!n", name = "A", descriptor = "Lclient!rc;")
	public static Class55 aClass55_745 = aClass55_737;

	@OriginalMember(owner = "client!n", name = "D", descriptor = "Lclient!rc;")
	public static Class55 aClass55_746 = aClass55_738;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public static void method1313() {
		try {
			@Pc(10) Graphics local10 = Static32.aCanvas1.getGraphics();
			Static107.aClass21_24.method1442(550, local10, 4);
		} catch (@Pc(18) Exception local18) {
			Static32.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIZIIII[Lclient!te;I)Z")
	public static boolean method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class6_Sub2_Sub14[] arg7, @OriginalArg(9) int arg8) {
		Static53.method1277(arg8, arg4, arg6, arg3);
		@Pc(12) boolean local12 = true;
		for (@Pc(29) int local29 = 0; local29 < arg7.length; local29++) {
			@Pc(35) Class6_Sub2_Sub14 local35 = arg7[local29];
			if (local35 != null && local35.anInt2880 == arg2) {
				if (local35.anInt2909 > 0) {
					Static91.method1738(local35);
				}
				@Pc(55) int local55 = local35.anInt2889 + arg8;
				if (!local35.aBoolean140) {
					local55 -= arg5;
				}
				@Pc(67) int local67 = arg4 + local35.anInt2918;
				if (!local35.aBoolean140) {
					local67 -= arg1;
				}
				@Pc(77) int local77 = local35.anInt2913;
				@Pc(98) int local98;
				@Pc(103) int local103;
				@Pc(162) int local162;
				@Pc(179) int local179;
				if (Static77.aClass6_Sub2_Sub14_37 == local35) {
					@Pc(84) Class6_Sub2_Sub14 local84 = Static56.method1177(local35);
					@Pc(88) int[] local88 = Static1.method2(local84);
					local77 = 128;
					@Pc(94) int[] local94 = Static1.method2(local35);
					local98 = Static58.anInt1741 - Static63.anInt1890;
					local103 = Static27.anInt1358 - Static65.anInt1952;
					if (local98 <= local35.anInt2893 && local98 >= -local35.anInt2893 && local35.anInt2893 >= local103 && -local35.anInt2893 <= local103 && !Static11.aBoolean30) {
						local98 = 0;
						local103 = 0;
					} else if (local35.anInt2872 < Static38.anInt1386 || Static11.aBoolean30) {
						Static11.aBoolean30 = true;
					} else {
						local103 = 0;
						local98 = 0;
					}
					local162 = local98 + local94[0] - local88[0];
					if (local162 < 0) {
						local162 = 0;
					}
					local179 = local94[1] + local103 - local88[1];
					if (local84.anInt2914 < local35.anInt2914 + local162) {
						local162 = local84.anInt2914 - local35.anInt2914;
					}
					if (local179 < 0) {
						local179 = 0;
					}
					if (local84.anInt2875 < local179 + local35.anInt2875) {
						local179 = local84.anInt2875 - local35.anInt2875;
					}
					local55 = local88[0] + local162;
					local67 = local179 + local88[1];
				}
				if ((!local35.aBoolean138 || local55 <= Static53.anInt1864 && Static53.anInt1861 >= local67 && local55 + local35.anInt2914 >= Static53.anInt1860 && Static53.anInt1862 <= local67 + local35.anInt2875) && (!local35.aBoolean138 || !local35.aBoolean139)) {
					if (local35.anInt2890 == 0) {
						if (local35.aBoolean139 && !Static89.method1695(arg0, local29)) {
							continue;
						}
						if (!local35.aBoolean138) {
							if (local35.anInt2905 > local35.anInt2919 - local35.anInt2875) {
								local35.anInt2905 = local35.anInt2919 - local35.anInt2875;
							}
							if (local35.anInt2905 < 0) {
								local35.anInt2905 = 0;
							}
						}
						local12 &= method1314(arg0, local35.anInt2905, local35.anInt2920, local67 + local35.anInt2875, local67, local35.anInt2879, local55 + local35.anInt2914, arg7, local55);
						if (local35.aClass6_Sub2_Sub14Array1 != null) {
							local12 &= method1314(arg0, local35.anInt2905, local35.anInt2920, local35.anInt2875 + local67, local67, local35.anInt2879, local55 + local35.anInt2914, local35.aClass6_Sub2_Sub14Array1, local55);
						}
						Static53.method1277(arg8, arg4, arg6, arg3);
						if (local35.anInt2875 < local35.anInt2919) {
							Static43.method982(local67, local35.anInt2875, local35.anInt2905, local55 + local35.anInt2914, local35.anInt2919);
						}
					}
					if (local35.anInt2890 != 1) {
						@Pc(489) int local489;
						@Pc(670) int local670;
						@Pc(404) int local404;
						@Pc(406) int local406;
						@Pc(410) int local410;
						if (local35.anInt2890 == 2) {
							local404 = 0;
							for (local406 = 0; local406 < local35.anInt2875; local406++) {
								for (local410 = 0; local410 < local35.anInt2914; local410++) {
									local98 = local55 + (local35.anInt2924 + 32) * local410;
									local103 = local406 * (local35.anInt2891 + 32) + local67;
									if (local404 < 20) {
										local98 += local35.anIntArray272[local404];
										local103 += local35.anIntArray271[local404];
									}
									if (local35.anIntArray267[local404] > 0) {
										local489 = local35.anIntArray267[local404] - 1;
										if (local98 > Static53.anInt1860 - 32 && Static53.anInt1864 > local98 && Static53.anInt1862 - 32 < local103 && Static53.anInt1861 > local103 || Static58.anInt1746 != 0 && Static65.anInt1931 == local404) {
											@Pc(552) Class6_Sub2_Sub2_Sub2 local552;
											if (Static43.anInt1463 == 1 && Static93.anInt2608 == local404 && local35.anInt2920 == Static31.anInt1210) {
												local552 = Static102.method1950(false, local35.anIntArray268[local404], 0, local489, 2);
											} else {
												local552 = Static102.method1950(false, local35.anIntArray268[local404], 3153952, local489, 1);
											}
											if (local552 == null) {
												local12 = false;
											} else if (Static58.anInt1746 != 0 && Static65.anInt1931 == local404 && local35.anInt2920 == Static11.anInt702) {
												local162 = Static58.anInt1741 - Static57.anInt1733;
												if (local162 < 5 && local162 > -5) {
													local162 = 0;
												}
												local179 = Static27.anInt1358 - Static56.anInt1716;
												if (local179 < 5 && local179 > -5) {
													local179 = 0;
												}
												if (Static54.anInt1680 < 5) {
													local162 = 0;
													local179 = 0;
												}
												local552.method626(local162 + local98, local179 + local103, 128);
												if (arg2 != -1) {
													@Pc(643) Class6_Sub2_Sub14 local643 = arg7[arg2 & 0xFFFF];
													if (Static53.anInt1862 > local179 + local103 && local643.anInt2905 > 0) {
														local670 = (Static53.anInt1862 - local103 - local179) * Static45.anInt1477 / 3;
														if (Static45.anInt1477 * 10 < local670) {
															local670 = Static45.anInt1477 * 10;
														}
														if (local670 > local643.anInt2905) {
															local670 = local643.anInt2905;
														}
														Static56.anInt1716 += local670;
														local643.anInt2905 -= local670;
													}
													if (local179 + local103 + 32 > Static53.anInt1861 && local643.anInt2905 < local643.anInt2919 - local643.anInt2875) {
														local670 = Static45.anInt1477 * (local179 + local103 + 32 - Static53.anInt1861) / 3;
														if (local670 > Static45.anInt1477 * 10) {
															local670 = Static45.anInt1477 * 10;
														}
														if (local670 > local643.anInt2919 - local643.anInt2875 - local643.anInt2905) {
															local670 = local643.anInt2919 - local643.anInt2905 - local643.anInt2875;
														}
														local643.anInt2905 += local670;
														Static56.anInt1716 -= local670;
													}
												}
											} else if (Static97.anInt2829 != 0 && Static47.anInt1512 == local404 && Static94.anInt2644 == local35.anInt2920) {
												local552.method626(local98, local103, 128);
											} else {
												local552.method646(local98, local103);
											}
										}
									} else if (local35.anIntArray273 != null && local404 < 20) {
										@Pc(466) Class6_Sub2_Sub2_Sub2 local466 = local35.method1895(local404);
										if (local466 != null) {
											local466.method646(local98, local103);
										} else if (Static27.aBoolean59) {
											local12 = false;
										}
									}
									local404++;
								}
							}
						} else if (local35.anInt2890 == 3) {
							if (Static97.method1869(local35)) {
								local404 = local35.anInt2881;
								if (Static89.method1695(arg0, local29) && local35.anInt2901 != 0) {
									local404 = local35.anInt2901;
								}
							} else {
								local404 = local35.anInt2894;
								if (Static89.method1695(arg0, local29) && local35.anInt2886 != 0) {
									local404 = local35.anInt2886;
								}
							}
							if (local77 == 0) {
								if (local35.aBoolean144) {
									Static53.method1276(local55, local67, local35.anInt2914, local35.anInt2875, local404);
								} else {
									Static53.method1284(local55, local67, local35.anInt2914, local35.anInt2875, local404);
								}
							} else if (local35.aBoolean144) {
								Static53.method1286(local55, local67, local35.anInt2914, local35.anInt2875, local404, 256 - (local77 & 0xFF));
							} else {
								Static53.method1291(local55, local67, local35.anInt2914, local35.anInt2875, local404, 256 - (local77 & 0xFF));
							}
						} else {
							@Pc(941) Class6_Sub2_Sub2_Sub4 local941;
							if (local35.anInt2890 == 4) {
								local941 = local35.method1894();
								if (local941 != null) {
									@Pc(952) Class55 local952 = local35.aClass55_1223;
									if (Static97.method1869(local35)) {
										local406 = local35.anInt2881;
										if (Static89.method1695(arg0, local29) && local35.anInt2901 != 0) {
											local406 = local35.anInt2901;
										}
										if (local35.aClass55_1220.method1674() > 0) {
											local952 = local35.aClass55_1220;
										}
									} else {
										local406 = local35.anInt2894;
										if (Static89.method1695(arg0, local29) && local35.anInt2886 != 0) {
											local406 = local35.anInt2886;
										}
									}
									if (local35.aBoolean138 && local35.anInt2871 != -1) {
										@Pc(1007) Class6_Sub2_Sub5 local1007 = Static58.method1195(local35.anInt2871);
										local952 = local1007.aClass55_392;
										if (local952 == null) {
											local952 = Static67.aClass55_789;
										}
										if (local1007.anInt1084 == 1 || local35.anInt2929 != 1) {
											local952 = Static89.method1698(new Class55[] { local952, Static13.aClass55_264, Static71.method1424(local35.anInt2929) });
										}
									}
									if (local35.anInt2903 == 6 && local35.anInt2920 == Static67.anInt1986) {
										local952 = Static67.aClass55_788;
										local406 = local35.anInt2894;
									}
									if (Static53.anInt1865 == 479) {
										if (local406 == 16776960) {
											local406 = 255;
										}
										if (local406 == 49152) {
											local406 = 16777215;
										}
									}
									local952 = Static19.method589(local952, local35);
									local941.method1308(local952, local55, local67, local35.anInt2914, local35.anInt2875, local406, local35.aBoolean141, local35.anInt2869, local35.anInt2874, local35.anInt2912);
								} else if (Static27.aBoolean59) {
									local12 = false;
								}
							} else {
								@Pc(1338) int local1338;
								@Pc(1329) int local1329;
								@Pc(1344) int local1344;
								if (local35.anInt2890 == 5) {
									@Pc(1119) Class6_Sub2_Sub2_Sub2 local1119;
									if (local35.aBoolean138) {
										if (local35.anInt2871 == -1) {
											local1119 = local35.method1898(false);
										} else {
											local1119 = Static102.method1950(false, local35.anInt2929, local35.anInt2895, local35.anInt2871, local35.anInt2885);
										}
										if (local1119 != null) {
											local406 = local1119.anInt994;
											local410 = local1119.anInt991;
											if (local35.aBoolean131) {
												@Pc(1249) int[] local1249 = new int[4];
												Static53.method1288(local1249);
												local162 = local67;
												if (local1249[1] > local67) {
													local162 = local1249[1];
												}
												local103 = local55;
												if (local1249[0] > local55) {
													local103 = local1249[0];
												}
												local179 = local55 + local35.anInt2914;
												local489 = local35.anInt2875 + local67;
												if (local1249[3] < local489) {
													local489 = local1249[3];
												}
												if (local179 > local1249[2]) {
													local179 = local1249[2];
												}
												Static53.method1277(local103, local162, local179, local489);
												local1329 = (local35.anInt2875 + local410 - 1) / local410;
												local1338 = (local35.anInt2914 + local406 - 1) / local406;
												for (local670 = 0; local670 < local1338; local670++) {
													for (local1344 = 0; local1344 < local1329; local1344++) {
														if (local35.anInt2877 != 0) {
															local1119.method632(local55 + local670 * local406 + local406 / 2, local410 / 2 + local67 + local410 * local1344, local35.anInt2877, 4096);
														} else if (local77 == 0) {
															local1119.method646(local406 * local670 + local55, local67 - -(local1344 * local410));
														} else {
															local1119.method626(local406 * local670 + local55, local1344 * local410 + local67, 256 - (local77 & 0xFF));
														}
													}
												}
												Static53.method1281(local1249);
											} else {
												local98 = local35.anInt2914 * 4096 / local406;
												if (local35.anInt2877 != 0) {
													local1119.method632(local55 + local35.anInt2914 / 2, local35.anInt2875 / 2 + local67, local35.anInt2877, local98);
												} else if (local77 != 0) {
													local1119.method639(local55, local67, local35.anInt2914, local35.anInt2875, 256 - (local77 & 0xFF));
												} else if (local35.anInt2914 == local406 && local410 == local35.anInt2875) {
													local1119.method646(local55, local67);
												} else {
													local1119.method642(local55, local67, local35.anInt2914, local35.anInt2875);
												}
											}
										} else if (Static27.aBoolean59) {
											local12 = false;
										}
									} else {
										local1119 = local35.method1898(Static97.method1869(local35));
										if (local1119 != null) {
											local1119.method646(local55, local67);
										} else if (Static27.aBoolean59) {
											local12 = false;
										}
									}
								} else if (local35.anInt2890 == 6) {
									@Pc(1446) boolean local1446 = Static97.method1869(local35);
									if (local1446) {
										local406 = local35.anInt2917;
									} else {
										local406 = local35.anInt2908;
									}
									@Pc(1478) Class6_Sub2_Sub3_Sub3 local1478;
									if (local35.anInt2910 == 5) {
										if (local35.anInt2930 == 0) {
											local1478 = Static74.aClass8_3.method331(-1, -1, null, null);
										} else {
											local1478 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.method2063();
										}
									} else if (local406 == -1) {
										local1478 = local35.method1893(-1, local1446, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.aClass8_1, null);
										if (local1478 == null && Static27.aBoolean59) {
											local12 = false;
										}
									} else {
										@Pc(1507) Class6_Sub2_Sub13 local1507 = Static4.method1608(local406);
										local1478 = local35.method1893(local35.anInt2927, local1446, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.aClass8_1, local1507);
										if (local1478 == null && Static27.aBoolean59) {
											local12 = false;
										}
									}
									local103 = local35.anInt2888;
									local98 = local35.anInt2896;
									local162 = local35.anInt2884;
									local179 = local35.anInt2915;
									local489 = local35.anInt2923;
									local1338 = local35.anInt2921;
									if (local35.anInt2871 != -1) {
										@Pc(1550) Class6_Sub2_Sub5 local1550 = Static58.method1195(local35.anInt2871);
										if (local1550 != null) {
											local1550 = local1550.method693(local35.anInt2929);
											local1478 = local1550.method692(1, true);
											local489 = local1550.anInt1067;
											local162 = local1550.anInt1068;
											local103 = local1550.anInt1106;
											local1338 = local1550.anInt1105;
											local179 = local1550.anInt1072;
											local98 = local1550.anInt1108;
											if (local35.anInt2914 > 0) {
												local1338 = local1338 * 32 / local35.anInt2914;
											}
										}
									}
									Static30.method782(local55 + local35.anInt2914 / 2, local67 - -(local35.anInt2875 / 2));
									local1329 = local1338 * Class6_Sub2_Sub2_Sub3.anIntArray77[local98] >> 16;
									local670 = Class6_Sub2_Sub2_Sub3.anIntArray73[local98] * local1338 >> 16;
									if (local1478 != null) {
										if (local35.aBoolean138) {
											local1478.method970();
											if (local35.aBoolean137) {
												local1478.method963(local103, local162, local98, local179, local1478.anInt3206 / 2 + local1329 + local489, local670 - -local489, local1338);
											} else {
												local1478.method952(local103, local162, local98, local179, local1478.anInt3206 / 2 + local1329 + local489, local670 + local489);
											}
										} else {
											local1478.method952(local103, 0, local98, 0, local1329, local670);
										}
									}
									Static30.method788();
								} else {
									if (local35.anInt2890 == 7) {
										local941 = local35.method1894();
										if (local941 == null) {
											if (Static27.aBoolean59) {
												local12 = false;
											}
											continue;
										}
										local406 = 0;
										for (local410 = 0; local410 < local35.anInt2875; local410++) {
											for (local98 = 0; local98 < local35.anInt2914; local98++) {
												if (local35.anIntArray267[local406] > 0) {
													@Pc(1731) Class6_Sub2_Sub5 local1731 = Static58.method1195(local35.anIntArray267[local406] - 1);
													@Pc(1734) Class55 local1734 = local1731.aClass55_392;
													if (local1734 == null) {
														local1734 = Static67.aClass55_789;
													}
													if (local1731.anInt1084 == 1 || local35.anIntArray268[local406] != 1) {
														local1734 = Static89.method1698(new Class55[] { local1734, Static13.aClass55_264, Static71.method1424(local35.anIntArray268[local406]) });
													}
													local179 = local55 + local98 * (local35.anInt2924 + 115);
													local489 = (local35.anInt2891 + 12) * local410 + local67;
													if (local35.anInt2869 == 0) {
														local941.method1297(local1734, local179, local489, local35.anInt2894, local35.aBoolean141);
													} else if (local35.anInt2869 == 1) {
														local941.method1312(local1734, local179 + local35.anInt2914 / 2, local489, local35.anInt2894, local35.aBoolean141);
													} else {
														local941.method1300(local1734, local179 + local35.anInt2914 - 1, local489, local35.anInt2894, local35.aBoolean141);
													}
												}
												local406++;
											}
										}
									}
									if (local35.anInt2890 == 8 && Static52.method1118(arg0, local29) && Static88.anInt3275 == Static44.anInt2748) {
										local404 = 0;
										local406 = 0;
										@Pc(1871) Class6_Sub2_Sub2_Sub4 local1871 = Static4.aClass6_Sub2_Sub2_Sub4_6;
										@Pc(1874) Class55 local1874 = local35.aClass55_1223;
										local1874 = Static19.method589(local1874, local35);
										@Pc(1892) Class55 local1892;
										while (local1874.method1674() > 0) {
											local162 = local1874.method1645(Static95.aClass55_1168);
											if (local162 == -1) {
												local1892 = local1874;
												local1874 = Static34.aClass55_502;
											} else {
												local1892 = local1874.method1671(0, local162);
												local1874 = local1874.method1673(local162 + 2);
											}
											local179 = local1871.method1311(local1892);
											if (local404 < local179) {
												local404 = local179;
											}
											local406 += local1871.anInt1866 + 1;
										}
										local179 = local67 + local35.anInt2875 + 5;
										local404 += 6;
										local406 += 7;
										if (local179 + local406 > arg3) {
											local179 = arg3 - local406;
										}
										local162 = local55 + local35.anInt2914 - local404 - 5;
										if (local162 < local55 + 5) {
											local162 = local55 + 5;
										}
										if (arg6 < local162 + local404) {
											local162 = arg6 - local404;
										}
										Static53.method1276(local162, local179, local404, local406, 16777120);
										Static53.method1284(local162, local179, local404, local406, 0);
										local489 = local179 + local1871.anInt1866 + 2;
										local1874 = local35.aClass55_1223;
										local1874 = Static19.method589(local1874, local35);
										while (local1874.method1674() > 0) {
											local1338 = local1874.method1645(Static95.aClass55_1168);
											if (local1338 == -1) {
												local1892 = local1874;
												local1874 = Static34.aClass55_502;
											} else {
												local1892 = local1874.method1671(0, local1338);
												local1874 = local1874.method1673(local1338 + 2);
											}
											local1871.method1297(local1892, local162 + 3, local489, 0, false);
											local489 += local1871.anInt1866 + 1;
										}
									}
									if (local35.anInt2890 == 9) {
										if (local35.anInt2898 == 1) {
											Static53.method1282(local55, local67, local55 + local35.anInt2914, local67 - -local35.anInt2875, local35.anInt2894);
										} else {
											local404 = local35.anInt2914 >= 0 ? local35.anInt2914 : -local35.anInt2914;
											local406 = local35.anInt2875 < 0 ? -local35.anInt2875 : local35.anInt2875;
											local410 = local404;
											if (local404 < local406) {
												local410 = local406;
											}
											if (local410 != 0) {
												local98 = (local35.anInt2914 << 16) / local410;
												local103 = (local35.anInt2875 << 16) / local410;
												if (local98 < local103) {
													local103 = -local103;
												} else {
													local98 = -local98;
												}
												local162 = local35.anInt2898 * local103 >> 17;
												local1338 = local35.anInt2898 * local98 + 1 >> 17;
												@Pc(2156) int local2156 = local162 + local35.anInt2914 + local55;
												local489 = local98 * local35.anInt2898 >> 17;
												@Pc(2168) int local2168 = local67 - local1338;
												local179 = local103 * local35.anInt2898 + 1 >> 17;
												local1329 = local162 + local55;
												local670 = local55 - local179;
												@Pc(2190) int local2190 = local67 + local489;
												local1344 = local35.anInt2914 + local55 - local179;
												@Pc(2206) int local2206 = local67 + local35.anInt2875 - local1338;
												@Pc(2214) int local2214 = local489 + local67 + local35.anInt2875;
												Static30.method780(local1329, local670, local1344);
												Static30.method795(local2190, local2168, local2206, local1329, local670, local1344, local35.anInt2894);
												Static30.method780(local1329, local1344, local2156);
												Static30.method795(local2190, local2206, local2214, local1329, local1344, local2156, local35.anInt2894);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B[B)V")
	public static void method1315(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class6_Sub1 local10 = new Class6_Sub1(arg0);
		local10.anInt2209 = arg0.length - 2;
		Static68.anInt2016 = local10.method1500();
		Static38.anIntArray95 = new int[Static68.anInt2016];
		Static67.aByteArrayArray6 = new byte[Static68.anInt2016][];
		Static34.anIntArray80 = new int[Static68.anInt2016];
		Static94.anIntArray248 = new int[Static68.anInt2016];
		Static72.anIntArray195 = new int[Static68.anInt2016];
		local10.anInt2209 = arg0.length - Static68.anInt2016 * 8 - 7;
		Static94.anInt2642 = local10.method1500();
		Static88.anInt3274 = local10.method1500();
		@Pc(62) int local62 = (local10.method1495() & 0xFF) + 1;
		for (@Pc(69) int local69 = 0; local69 < Static68.anInt2016; local69++) {
			Static34.anIntArray80[local69] = local10.method1500();
		}
		for (@Pc(87) int local87 = 0; local87 < Static68.anInt2016; local87++) {
			Static94.anIntArray248[local87] = local10.method1500();
		}
		for (@Pc(101) int local101 = 0; local101 < Static68.anInt2016; local101++) {
			Static72.anIntArray195[local101] = local10.method1500();
		}
		for (@Pc(119) int local119 = 0; local119 < Static68.anInt2016; local119++) {
			Static38.anIntArray95[local119] = local10.method1500();
		}
		local10.anInt2209 = arg0.length + 3 - local62 * 3 - Static68.anInt2016 * 8 - 7;
		Static44.anIntArray257 = new int[local62];
		for (@Pc(153) int local153 = 1; local153 < local62; local153++) {
			Static44.anIntArray257[local153] = local10.method1483();
			if (Static44.anIntArray257[local153] == 0) {
				Static44.anIntArray257[local153] = 1;
			}
		}
		local10.anInt2209 = 0;
		for (@Pc(182) int local182 = 0; local182 < Static68.anInt2016; local182++) {
			@Pc(188) int local188 = Static72.anIntArray195[local182];
			@Pc(192) int local192 = Static38.anIntArray95[local182];
			@Pc(196) int local196 = local192 * local188;
			@Pc(199) byte[] local199 = new byte[local196];
			Static67.aByteArrayArray6[local182] = local199;
			@Pc(207) int local207 = local10.method1495();
			@Pc(211) int local211;
			if (local207 == 0) {
				for (local211 = 0; local211 < local196; local211++) {
					local199[local211] = local10.method1484();
				}
			} else if (local207 == 1) {
				for (local211 = 0; local211 < local188; local211++) {
					for (@Pc(240) int local240 = 0; local240 < local192; local240++) {
						local199[local188 * local240 + local211] = local10.method1484();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!rc;Lclient!b;)I")
	public static int method1316(@OriginalArg(1) Class55 arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		@Pc(11) int local11 = arg1.anInt2209;
		arg1.method1474(arg0.anInt2411);
		arg1.anInt2209 += Static26.aClass39_3.method1189(arg0.anInt2411, arg0.aByteArray12, 0, arg1.aByteArray11, arg1.anInt2209);
		return arg1.anInt2209 - local11;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method1317() {
		aClass55_743 = null;
		aClass55_736 = null;
		aClass55_737 = null;
		aClass55_746 = null;
		aClass55_744 = null;
		aClass55_740 = null;
		aClass55_742 = null;
		aClass6_Sub1Array1 = null;
		aClass55_739 = null;
		aClass55_738 = null;
		aClass61_4 = null;
		aClass55_741 = null;
		aClass55_745 = null;
	}
}
