import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ma", name = "mb", descriptor = "I")
	public static int anInt1517;

	@OriginalMember(owner = "client!ma", name = "cb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1079 = Static72.method1077("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!ma", name = "gb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1080 = Static72.method1077("Untersuchen");

	@OriginalMember(owner = "client!ma", name = "yb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1083 = Static72.method1077("button near the top of that page)3");

	@OriginalMember(owner = "client!ma", name = "hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1081 = aClass74_1083;

	@OriginalMember(owner = "client!ma", name = "nb", descriptor = "[I")
	public static int[] anIntArray189 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ma", name = "pb", descriptor = "I")
	public static int anInt1519 = 255;

	@OriginalMember(owner = "client!ma", name = "sb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1082 = Static72.method1077("Versteckt");

	@OriginalMember(owner = "client!ma", name = "zb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1084 = Static72.method1077("backright1");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIII[Lclient!ve;II)Z")
	public static boolean method1048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub2_Sub17[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static58.method711(arg8, arg7, arg2, arg1);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < arg6.length; local14++) {
			@Pc(20) Class2_Sub2_Sub17 local20 = arg6[local14];
			if (local20 != null && (arg3 == local20.anInt2803 || arg3 == -1412584499 && Static101.aClass2_Sub2_Sub17_3 == local20)) {
				if (local20.anInt2796 > 0) {
					Static18.method411(local20);
				}
				@Pc(52) int local52 = arg7 + local20.anInt2834 - arg5;
				@Pc(61) int local61 = local20.anInt2780 + arg8 - arg0;
				@Pc(64) int local64 = local20.anInt2831;
				@Pc(101) int local101;
				@Pc(103) int local103;
				@Pc(132) int[] local132;
				@Pc(234) int local234;
				@Pc(250) int local250;
				@Pc(240) int local240;
				@Pc(256) int local256;
				if (Static101.aClass2_Sub2_Sub17_3 == local20) {
					if (arg3 != -1412584499 && !local20.aBoolean130) {
						Static9.anInt294 = arg5 - arg7;
						Static53.aClass2_Sub2_Sub17Array1 = arg6;
						Static31.anInt795 = arg0 - arg8;
						continue;
					}
					@Pc(93) Class2_Sub2_Sub17 local93 = Static15.method354(local20);
					if (local93 == null) {
						Static101.aClass2_Sub2_Sub17_3 = null;
					} else {
						local101 = Static46.anInt1062;
						local103 = Static62.anInt1414;
						if (Static67.anInt1478 == 0) {
							local103 -= 4;
							local101 -= 4;
						}
						if (Static67.anInt1478 == 1) {
							local103 -= 205;
							local101 -= 553;
						}
						if (Static67.anInt1478 == 2) {
							local101 -= 17;
							local103 -= 357;
						}
						local103 -= Static4.anInt56;
						local101 -= Static81.anInt1791;
						local132 = Static40.method665(local93);
						if (local132[0] > local101) {
							local101 = local132[0];
						}
						@Pc(157) Class2_Sub2_Sub17 local157 = Static89.aClass2_Sub2_Sub17ArrayArray1[local20.anInt2794 >> 16][local20.anInt2803 & 0xFFFF];
						if (local101 + local20.anInt2810 > local93.anInt2810 + local132[0]) {
							local101 = local93.anInt2810 + local132[0] - local20.anInt2810;
						}
						if (local132[1] > local103) {
							local103 = local132[1];
						}
						if (local103 + local20.anInt2829 > local132[1] - -local93.anInt2829) {
							local103 = local93.anInt2829 + local132[1] - local20.anInt2829;
						}
						@Pc(219) int[] local219 = Static40.method665(local157);
						if (!local20.aBoolean130) {
							local64 = 128;
						}
						local234 = local157.anInt2832 + local101 - local219[0];
						local240 = local234 - local20.anInt2780;
						local250 = local157.anInt2836 + local103 - local219[1];
						local256 = local250 - local20.anInt2834;
						if (local20.anInt2770 >= local240 && local240 >= -local20.anInt2770 && local20.anInt2770 >= local256 && -local20.anInt2770 <= local256 && !Static38.aBoolean34) {
							local256 = 0;
							local240 = 0;
						} else if (local20.anInt2768 >= Static109.anInt2399 && !Static38.aBoolean34) {
							local240 = 0;
							local256 = 0;
						}
						local52 += local256;
						local61 += local240;
					}
				}
				if ((!local20.aBoolean125 || Static58.anInt1011 >= local61 && Static58.anInt1012 >= local52 && Static58.anInt1009 <= local20.anInt2810 + local61 && Static58.anInt1013 <= local20.anInt2829 + local52) && (!local20.aBoolean125 || !Static63.method1002(local20))) {
					if (local20.anInt2777 == 0) {
						if (!local20.aBoolean125 && Static63.method1002(local20) && !Static17.method402(arg4, local14)) {
							continue;
						}
						if (!local20.aBoolean125) {
							if (local20.anInt2836 > local20.anInt2807 - local20.anInt2829) {
								local20.anInt2836 = local20.anInt2807 - local20.anInt2829;
							}
							if (local20.anInt2836 < 0) {
								local20.anInt2836 = 0;
							}
						}
						local12 &= method1048(local20.anInt2832, local52 + local20.anInt2829, local61 - -local20.anInt2810, local20.anInt2794, arg4, local20.anInt2836, arg6, local52, local61);
						if (local20.aClass2_Sub2_Sub17Array2 != null) {
							local12 &= method1048(local20.anInt2832, local52 + local20.anInt2829, local61 - -local20.anInt2810, local20.anInt2794, arg4, local20.anInt2836, local20.aClass2_Sub2_Sub17Array2, local52, local61);
						}
						Static58.method711(arg8, arg7, arg2, arg1);
						if (local20.anInt2807 > local20.anInt2829 && !local20.aBoolean125) {
							Static19.method422(local20.anInt2810 + local61, local52, local20.anInt2807, local20.anInt2836, local20.anInt2829);
						}
					}
					if (local20.anInt2777 != 1) {
						@Pc(779) int local779;
						@Pc(486) int local486;
						@Pc(503) int local503;
						@Pc(512) int local512;
						@Pc(708) int local708;
						if (local20.anInt2777 == 2) {
							local486 = 0;
							for (local101 = 0; local101 < local20.anInt2829; local101++) {
								for (local103 = 0; local103 < local20.anInt2810; local103++) {
									local503 = local61 + local103 * (local20.anInt2779 + 32);
									local512 = local101 * (local20.anInt2775 + 32) + local52;
									if (local486 < 20) {
										local512 += local20.anIntArray403[local486];
										local503 += local20.anIntArray401[local486];
									}
									if (local20.anIntArray402[local486] > 0) {
										local250 = local20.anIntArray402[local486] - 1;
										if (local503 > Static58.anInt1009 - 32 && Static58.anInt1011 > local503 && Static58.anInt1013 - 32 < local512 && local512 < Static58.anInt1012 || Static27.anInt678 != 0 && local486 == Static9.anInt301) {
											@Pc(638) Class2_Sub2_Sub1_Sub2 local638;
											if (Static40.anInt960 == 1 && local486 == Static47.anInt1083 && local20.anInt2794 == Static78.anInt1699) {
												local638 = Static48.method797(false, local20.anIntArray406[local486], 2, local250, 0);
											} else {
												local638 = Static48.method797(false, local20.anIntArray406[local486], 1, local250, 3153952);
											}
											if (local638 == null) {
												local12 = false;
											} else if (Static27.anInt678 != 0 && local486 == Static9.anInt301 && local20.anInt2794 == Static27.anInt675) {
												local234 = Static62.anInt1414 - Static57.anInt1375;
												local708 = Static46.anInt1062 - Static56.anInt1355;
												if (local708 < 5 && local708 > -5) {
													local708 = 0;
												}
												if (local234 < 5 && local234 > -5) {
													local234 = 0;
												}
												if (Static10.anInt319 < 5) {
													local708 = 0;
													local234 = 0;
												}
												local638.method201(local708 + local503, local234 + local512, 128);
												if (arg3 != -1) {
													@Pc(753) Class2_Sub2_Sub17 local753 = arg6[arg3 & 0xFFFF];
													if (local234 + local512 < Static58.anInt1013 && local753.anInt2836 > 0) {
														local779 = (Static58.anInt1013 - local512 - local234) * Static15.anInt429 / 3;
														if (local779 > Static15.anInt429 * 10) {
															local779 = Static15.anInt429 * 10;
														}
														if (local779 > local753.anInt2836) {
															local779 = local753.anInt2836;
														}
														local753.anInt2836 -= local779;
														Static57.anInt1375 += local779;
													}
													if (Static58.anInt1012 < local512 + local234 + 32 && local753.anInt2807 - local753.anInt2829 > local753.anInt2836) {
														local779 = Static15.anInt429 * (local512 + local234 + 32 - Static58.anInt1012) / 3;
														if (Static15.anInt429 * 10 < local779) {
															local779 = Static15.anInt429 * 10;
														}
														if (local753.anInt2807 - local753.anInt2836 - local753.anInt2829 < local779) {
															local779 = local753.anInt2807 - local753.anInt2836 - local753.anInt2829;
														}
														local753.anInt2836 += local779;
														Static57.anInt1375 -= local779;
													}
												}
											} else if (Static91.anInt1908 != 0 && Static38.anInt936 == local486 && local20.anInt2794 == Static84.anInt1825) {
												local638.method201(local503, local512, 128);
											} else {
												local638.method213(local503, local512);
											}
										}
									} else if (local20.anIntArray404 != null && local486 < 20) {
										@Pc(549) Class2_Sub2_Sub1_Sub2 local549 = local20.method1888(local486);
										if (local549 != null) {
											local549.method213(local503, local512);
										} else if (Static65.aBoolean57) {
											local12 = false;
										}
									}
									local486++;
								}
							}
						} else if (local20.anInt2777 == 3) {
							if (Static55.method389(local20)) {
								local486 = local20.anInt2808;
								if (Static17.method402(arg4, local14) && local20.anInt2786 != 0) {
									local486 = local20.anInt2786;
								}
							} else {
								local486 = local20.anInt2818;
								if (Static17.method402(arg4, local14) && local20.anInt2790 != 0) {
									local486 = local20.anInt2790;
								}
							}
							if (local64 == 0) {
								if (local20.aBoolean127) {
									Static58.method702(local61, local52, local20.anInt2810, local20.anInt2829, local486);
								} else {
									Static58.method712(local61, local52, local20.anInt2810, local20.anInt2829, local486);
								}
							} else if (local20.aBoolean127) {
								Static58.method710(local61, local52, local20.anInt2810, local20.anInt2829, local486, 256 - (local64 & 0xFF));
							} else {
								Static58.method697(local61, local52, local20.anInt2810, local20.anInt2829, local486, 256 - (local64 & 0xFF));
							}
						} else {
							@Pc(1021) Class2_Sub2_Sub1_Sub3 local1021;
							if (local20.anInt2777 == 4) {
								local1021 = local20.method1899();
								if (local1021 != null) {
									@Pc(1032) Class74 local1032 = local20.aClass74_1690;
									if (Static55.method389(local20)) {
										local101 = local20.anInt2808;
										if (Static17.method402(arg4, local14) && local20.anInt2786 != 0) {
											local101 = local20.anInt2786;
										}
										if (local20.aClass74_1696.method1695() > 0) {
											local1032 = local20.aClass74_1696;
										}
									} else {
										local101 = local20.anInt2818;
										if (Static17.method402(arg4, local14) && local20.anInt2790 != 0) {
											local101 = local20.anInt2790;
										}
									}
									if (local20.aBoolean125 && local20.anInt2806 != -1) {
										@Pc(1090) Class2_Sub2_Sub12 local1090 = Static35.method1934(local20.anInt2806);
										local1032 = local1090.aClass74_1184;
										if (local1032 == null) {
											local1032 = Static75.aClass74_1112;
										}
										if ((local1090.anInt1727 == 1 || local20.anInt2784 != 1) && local20.anInt2784 != -1) {
											local1032 = Static91.method1340(new Class74[] { local1032, Static92.aClass74_1316, Static53.method900(local20.anInt2784) });
										}
									}
									if (Static88.anInt1857 == local20.anInt2794 && Static39.anInt952 == local20.anInt2782) {
										local101 = local20.anInt2818;
										local1032 = Static127.aClass74_1715;
									}
									if (Static58.anInt1010 == 479) {
										if (local101 == 16776960) {
											local101 = 255;
										}
										if (local101 == 49152) {
											local101 = 16777215;
										}
									}
									local1032 = Static102.method1568(local20, local1032);
									local1021.method311(local1032, local61, local52, local20.anInt2810, local20.anInt2829, local101, local20.aBoolean119, local20.anInt2823, local20.anInt2833, local20.anInt2791);
								} else if (Static65.aBoolean57) {
									local12 = false;
								}
							} else {
								@Pc(1350) int local1350;
								if (local20.anInt2777 == 5) {
									@Pc(1216) Class2_Sub2_Sub1_Sub2 local1216;
									if (local20.aBoolean125) {
										if (local20.anInt2806 == -1) {
											local1216 = local20.method1887(false);
										} else {
											local1216 = Static48.method797(false, local20.anInt2784, local20.anInt2814, local20.anInt2806, local20.anInt2800);
										}
										if (local1216 != null) {
											local103 = local1216.anInt288;
											local101 = local1216.anInt291;
											if (local20.aBoolean123) {
												local132 = new int[4];
												local512 = local61;
												Static58.method709(local132);
												if (local61 < local132[0]) {
													local512 = local132[0];
												}
												local708 = local52;
												local234 = local61 + local20.anInt2810;
												local250 = local52 + local20.anInt2829;
												if (local52 < local132[1]) {
													local708 = local132[1];
												}
												if (local132[2] < local234) {
													local234 = local132[2];
												}
												if (local250 > local132[3]) {
													local250 = local132[3];
												}
												Static58.method711(local512, local708, local234, local250);
												local240 = (local101 + local20.anInt2810 - 1) / local101;
												local256 = (local103 + local20.anInt2829 - 1) / local103;
												for (local779 = 0; local779 < local240; local779++) {
													for (local1350 = 0; local1350 < local256; local1350++) {
														if (local20.anInt2795 != 0) {
															local1216.method216(local779 * local101 + local61 + local101 / 2, local103 / 2 + local1350 * local103 + local52, local20.anInt2795, 4096);
														} else if (local64 == 0) {
															local1216.method213(local61 + local779 * local101, local1350 * local103 + local52);
														} else {
															local1216.method201(local101 * local779 + local61, local103 * local1350 + local52, 256 - (local64 & 0xFF));
														}
													}
												}
												Static58.method703(local132);
											} else {
												local503 = local20.anInt2810 * 4096 / local101;
												if (local20.anInt2795 != 0) {
													local1216.method216(local61 + local20.anInt2810 / 2, local20.anInt2829 / 2 + local52, local20.anInt2795, local503);
												} else if (local64 != 0) {
													local1216.method208(local61, local52, local20.anInt2810, local20.anInt2829, 256 - (local64 & 0xFF));
												} else if (local101 == local20.anInt2810 && local103 == local20.anInt2829) {
													local1216.method213(local61, local52);
												} else {
													local1216.method219(local61, local52, local20.anInt2810, local20.anInt2829);
												}
											}
										} else if (Static65.aBoolean57) {
											local12 = false;
										}
									} else {
										local1216 = local20.method1887(Static55.method389(local20));
										if (local1216 != null) {
											local1216.method213(local61, local52);
										} else if (Static65.aBoolean57) {
											local12 = false;
										}
									}
								} else {
									@Pc(1628) Class2_Sub2_Sub12 local1628;
									if (local20.anInt2777 == 6) {
										@Pc(1536) boolean local1536 = Static55.method389(local20);
										local503 = 0;
										@Pc(1540) Class2_Sub2_Sub2_Sub5 local1540 = null;
										if (local1536) {
											local101 = local20.anInt2773;
										} else {
											local101 = local20.anInt2811;
										}
										if (local20.anInt2806 != -1) {
											local1628 = Static35.method1934(local20.anInt2806);
											if (local1628 != null) {
												local1628 = local1628.method1224(local20.anInt2784);
												local1540 = local1628.method1231(1);
												if (local1540 == null) {
													local12 = false;
												} else {
													local1540.method1133();
													local503 = local1540.anInt2656 / 2;
												}
											}
										} else if (local20.anInt2767 == 5) {
											if (local20.anInt2812 == 0) {
												local1540 = Static109.aClass14_1.method447(-1, null, null, -1);
											} else {
												local1540 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.method1855();
											}
										} else if (local101 == -1) {
											local1540 = local20.method1896(-1, local1536, null, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass14_2);
											if (local1540 == null && Static65.aBoolean57) {
												local12 = false;
											}
										} else {
											@Pc(1566) Class2_Sub2_Sub11 local1566 = Static12.method270(local101);
											local1540 = local20.method1896(local20.anInt2805, local1536, local1566, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass14_2);
											if (local1540 == null && Static65.aBoolean57) {
												local12 = false;
											}
										}
										Static44.method729(local61 + local20.anInt2810 / 2, local20.anInt2829 / 2 + local52);
										local512 = local20.anInt2825 * Class2_Sub2_Sub1_Sub4.anIntArray122[local20.anInt2824] >> 16;
										local708 = Class2_Sub2_Sub1_Sub4.anIntArray119[local20.anInt2824] * local20.anInt2825 >> 16;
										if (local1540 != null) {
											if (local20.aBoolean125) {
												local1540.method1133();
												if (local20.aBoolean120) {
													local1540.method1134(local20.anInt2793, local20.anInt2783, local20.anInt2824, local20.anInt2789, local20.anInt2801 + local512 + local503, local20.anInt2801 + local708, local20.anInt2825);
												} else {
													local1540.method1130(local20.anInt2793, local20.anInt2783, local20.anInt2824, local20.anInt2789, local20.anInt2801 + local512 + local503, local708 - -local20.anInt2801);
												}
											} else {
												local1540.method1130(local20.anInt2793, 0, local20.anInt2824, 0, local512, local708);
											}
										}
										Static44.method727();
									} else {
										if (local20.anInt2777 == 7) {
											local1021 = local20.method1899();
											if (local1021 == null) {
												if (Static65.aBoolean57) {
													local12 = false;
												}
												continue;
											}
											local101 = 0;
											for (local103 = 0; local103 < local20.anInt2829; local103++) {
												for (local503 = 0; local503 < local20.anInt2810; local503++) {
													if (local20.anIntArray402[local101] > 0) {
														local1628 = Static35.method1934(local20.anIntArray402[local101] - 1);
														@Pc(1809) Class74 local1809 = local1628.aClass74_1184;
														if (local1809 == null) {
															local1809 = Static75.aClass74_1112;
														}
														if (local1628.anInt1727 == 1 || local20.anIntArray406[local101] != 1) {
															local1809 = Static91.method1340(new Class74[] { local1809, Static92.aClass74_1316, Static53.method900(local20.anIntArray406[local101]) });
														}
														local234 = local61 + local503 * (local20.anInt2779 + 115);
														local250 = local52 + (local20.anInt2775 + 12) * local103;
														if (local20.anInt2823 == 0) {
															local1021.method324(local1809, local234, local250, local20.anInt2818, local20.aBoolean119);
														} else if (local20.anInt2823 == 1) {
															local1021.method317(local1809, local20.anInt2810 / 2 + local234, local250, local20.anInt2818, local20.aBoolean119);
														} else {
															local1021.method304(local1809, local20.anInt2810 + local234 - 1, local250, local20.anInt2818, local20.aBoolean119);
														}
													}
													local101++;
												}
											}
										}
										if (local20.anInt2777 == 8 && Static56.method939(local14, arg4) && Static52.anInt1264 == Static45.anInt1027) {
											local486 = 0;
											local101 = 0;
											@Pc(1962) Class74 local1962 = local20.aClass74_1690;
											@Pc(1964) Class2_Sub2_Sub1_Sub3 local1964 = Static77.aClass2_Sub2_Sub1_Sub3_9;
											local1962 = Static102.method1568(local20, local1962);
											@Pc(1988) Class74 local1988;
											while (local1962.method1695() > 0) {
												local708 = local1962.method1722(Static34.aClass74_626);
												if (local708 == -1) {
													local1988 = local1962;
													local1962 = Static97.aClass74_1736;
												} else {
													local1988 = local1962.method1706(0, local708);
													local1962 = local1962.method1697(local708 + 2);
												}
												local234 = local1964.method307(local1988);
												if (local234 > local486) {
													local486 = local234;
												}
												local101 += local1964.anInt382 + 1;
											}
											local486 += 6;
											local708 = local20.anInt2810 + local61 - local486 - 5;
											if (local708 < local61 + 5) {
												local708 = local61 + 5;
											}
											local101 += 7;
											if (local708 + local486 > arg2) {
												local708 = arg2 - local486;
											}
											local234 = local52 + local20.anInt2829 + 5;
											if (local234 + local101 > arg1) {
												local234 = arg1 - local101;
											}
											Static58.method702(local708, local234, local486, local101, 16777120);
											Static58.method712(local708, local234, local486, local101, 0);
											local1962 = local20.aClass74_1690;
											local250 = local234 + local1964.anInt382 + 2;
											local1962 = Static102.method1568(local20, local1962);
											while (local1962.method1695() > 0) {
												local240 = local1962.method1722(Static34.aClass74_626);
												if (local240 == -1) {
													local1988 = local1962;
													local1962 = Static97.aClass74_1736;
												} else {
													local1988 = local1962.method1706(0, local240);
													local1962 = local1962.method1697(local240 + 2);
												}
												local1964.method324(local1988, local708 + 3, local250, 0, false);
												local250 += local1964.anInt382 + 1;
											}
										}
										if (local20.anInt2777 == 9) {
											if (local20.anInt2798 == 1) {
												Static58.method701(local61, local52, local20.anInt2810 + local61, local52 - -local20.anInt2829, local20.anInt2818);
											} else {
												local486 = local20.anInt2810 >= 0 ? local20.anInt2810 : -local20.anInt2810;
												local101 = local20.anInt2829 >= 0 ? local20.anInt2829 : -local20.anInt2829;
												local103 = local486;
												if (local486 < local101) {
													local103 = local101;
												}
												if (local103 != 0) {
													local503 = (local20.anInt2810 << 16) / local103;
													local512 = (local20.anInt2829 << 16) / local103;
													if (local503 >= local512) {
														local503 = -local503;
													} else {
														local512 = -local512;
													}
													local708 = local512 * local20.anInt2798 >> 17;
													local234 = local512 * local20.anInt2798 + 1 >> 17;
													local250 = local503 * local20.anInt2798 >> 17;
													local779 = local61 - local234;
													local256 = local61 + local708;
													@Pc(2293) int local2293 = local61 + local20.anInt2810 + local708;
													@Pc(2297) int local2297 = local250 + local52;
													local1350 = local61 + local20.anInt2810 - local234;
													local240 = local20.anInt2798 * local503 + 1 >> 17;
													@Pc(2321) int local2321 = local250 + local20.anInt2829 + local52;
													@Pc(2330) int local2330 = local52 + local20.anInt2829 - local240;
													Static44.method726(local256, local779, local1350);
													@Pc(2338) int local2338 = local52 - local240;
													Static44.method721(local2297, local2338, local2330, local256, local779, local1350, local20.anInt2818);
													Static44.method726(local256, local1350, local2293);
													Static44.method721(local2297, local2330, local2321, local256, local1350, local2293, local20.anInt2818);
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
		}
		return local12;
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
	public static void method1051() {
		aClass74_1083 = null;
		aClass74_1079 = null;
		aClass74_1082 = null;
		aClass74_1081 = null;
		anIntArray189 = null;
		aClass74_1080 = null;
		aClass74_1084 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)Lclient!u;")
	public static Class74 method1052(@OriginalArg(1) int arg0) {
		return Static91.method1340(new Class74[] { Static56.method940(arg0 >> 24 & 0xFF), Static25.aClass74_518, Static56.method940(arg0 >> 16 & 0xFF), Static25.aClass74_518, Static56.method940(arg0 >> 8 & 0xFF), Static25.aClass74_518, Static56.method940(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!g;I)V")
	public static void method1055(@OriginalArg(0) Class26 arg0) {
		Static11.aClass26_3 = arg0;
	}
}
