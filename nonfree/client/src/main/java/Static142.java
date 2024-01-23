import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!og", name = "bb", descriptor = "I")
	public static int anInt3197 = 0;

	@OriginalMember(owner = "client!og", name = "eb", descriptor = "I")
	public static int anInt3199 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
	public static void method2443() {
		if (Static4.anInt99 > 0) {
			Static4.anInt99--;
		}
		if (Static9.anInt4431 > 1) {
			Static46.anInt1054 = Static171.anInt3707;
			Static9.anInt4431--;
		}
		if (Static207.aBoolean246) {
			Static207.aBoolean246 = false;
			Static126.method2128();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static10.method223(); local29++) {
		}
		if (Static134.anInt2902 != 30) {
			return;
		}
		Static7.method143(Static96.aClass1_Sub9_Sub1_3);
		@Pc(53) Object local53 = Static180.aClass17_1.anObject1;
		@Pc(85) int local85;
		@Pc(87) int local87;
		@Pc(89) int local89;
		@Pc(110) int local110;
		@Pc(105) int local105;
		synchronized (Static180.aClass17_1.anObject1) {
			if (!Static56.aBoolean75) {
				Static180.aClass17_1.anInt815 = 0;
			} else if (Static192.anInt4115 != 0 || Static180.aClass17_1.anInt815 >= 40) {
				Static96.aClass1_Sub9_Sub1_3.method953(111);
				Static96.aClass1_Sub9_Sub1_3.method899(0);
				local85 = Static96.aClass1_Sub9_Sub1_3.anInt1192;
				local87 = 0;
				for (local89 = 0; Static180.aClass17_1.anInt815 > local89 && Static96.aClass1_Sub9_Sub1_3.anInt1192 - local85 < 240; local89++) {
					local105 = Static180.aClass17_1.anIntArray114[local89];
					local110 = Static180.aClass17_1.anIntArray111[local89];
					local87++;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > 502) {
						local110 = 502;
					}
					if (local105 < 0) {
						local105 = 0;
					} else if (local105 > 764) {
						local105 = 764;
					}
					@Pc(139) int local139 = local110 * 765 + local105;
					if (Static180.aClass17_1.anIntArray111[local89] == -1 && Static180.aClass17_1.anIntArray114[local89] == -1) {
						local105 = -1;
						local110 = -1;
						local139 = 524287;
					}
					if (local105 != Static85.anInt1994 || Static23.anInt2654 != local110) {
						@Pc(184) int local184 = local105 - Static85.anInt1994;
						Static85.anInt1994 = local105;
						@Pc(191) int local191 = local110 - Static23.anInt2654;
						Static23.anInt2654 = local110;
						if (Static84.anInt1463 < 8 && local184 >= -32 && local184 <= 31 && local191 >= -32 && local191 <= 31) {
							local184 += 32;
							local191 += 32;
							Static96.aClass1_Sub9_Sub1_3.method890((local184 << 6) + (Static84.anInt1463 << 12) + local191);
							Static84.anInt1463 = 0;
						} else if (Static84.anInt1463 < 8) {
							Static96.aClass1_Sub9_Sub1_3.method929((Static84.anInt1463 << 19) + (local139 + 8388608));
							Static84.anInt1463 = 0;
						} else {
							Static96.aClass1_Sub9_Sub1_3.method921(local139 + (Static84.anInt1463 << 19) - 1073741824);
							Static84.anInt1463 = 0;
						}
					} else if (Static84.anInt1463 < 2047) {
						Static84.anInt1463++;
					}
				}
				Static96.aClass1_Sub9_Sub1_3.method904(Static96.aClass1_Sub9_Sub1_3.anInt1192 - local85);
				if (Static180.aClass17_1.anInt815 <= local87) {
					Static180.aClass17_1.anInt815 = 0;
				} else {
					Static180.aClass17_1.anInt815 -= local87;
					for (local110 = 0; local110 < Static180.aClass17_1.anInt815; local110++) {
						Static180.aClass17_1.anIntArray114[local110] = Static180.aClass17_1.anIntArray114[local110 + local87];
						Static180.aClass17_1.anIntArray111[local110] = Static180.aClass17_1.anIntArray111[local110 + local87];
					}
				}
			}
		}
		if (Static192.anInt4115 != 0) {
			@Pc(348) long local348 = (Static151.aLong115 - Static140.aLong106) / 50L;
			if (local348 > 4095L) {
				local348 = 4095L;
			}
			Static140.aLong106 = Static151.aLong115;
			local85 = Static39.anInt882;
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 502) {
				local85 = 502;
			}
			local87 = Static166.anInt3603;
			if (local87 < 0) {
				local87 = 0;
			} else if (local87 > 764) {
				local87 = 764;
			}
			@Pc(395) byte local395 = 0;
			if (Static192.anInt4115 == 2) {
				local395 = 1;
			}
			local105 = (int) local348;
			local89 = local87 + local85 * 765;
			Static96.aClass1_Sub9_Sub1_3.method953(63);
			Static96.aClass1_Sub9_Sub1_3.method911((local105 << 20) + ((local395 << 19) + local89));
		}
		if (Static197.anInt4201 > 0) {
			Static197.anInt4201--;
		}
		if (Static49.aBooleanArray5[96] || Static49.aBooleanArray5[97] || Static49.aBooleanArray5[98] || Static49.aBooleanArray5[99]) {
			Static147.aBoolean181 = true;
		}
		if (Static147.aBoolean181 && Static197.anInt4201 <= 0) {
			Static147.aBoolean181 = false;
			Static197.anInt4201 = 20;
			Static96.aClass1_Sub9_Sub1_3.method953(173);
			Static96.aClass1_Sub9_Sub1_3.method943(Static31.anInt799);
			Static96.aClass1_Sub9_Sub1_3.method890(Static124.anInt2765);
		}
		if (Static204.aBoolean242 && !Static150.aBoolean185) {
			Static150.aBoolean185 = true;
			Static96.aClass1_Sub9_Sub1_3.method953(130);
			Static96.aClass1_Sub9_Sub1_3.method899(1);
		}
		if (!Static204.aBoolean242 && Static150.aBoolean185) {
			Static150.aBoolean185 = false;
			Static96.aClass1_Sub9_Sub1_3.method953(130);
			Static96.aClass1_Sub9_Sub1_3.method899(0);
		}
		Static41.method737();
		if (Static134.anInt2902 != 30) {
			return;
		}
		Static210.method2905();
		Static28.method2157();
		Static42.anInt909++;
		if (Static42.anInt909 > 750) {
			Static126.method2128();
			return;
		}
		Static16.method309();
		Static173.method2792();
		Static75.method1348();
		if (Static147.aClass6_13 != null) {
			Static87.method1513();
		}
		if (Static147.anInt3278 != 0) {
			Static154.anInt3436 += 20;
			if (Static154.anInt3436 >= 400) {
				Static147.anInt3278 = 0;
			}
		}
		Static26.anInt594++;
		if (Static105.aClass6_11 != null) {
			Static155.anInt3460++;
			if (Static155.anInt3460 >= 15) {
				Static57.method1068(Static105.aClass6_11);
				Static105.aClass6_11 = null;
			}
		}
		@Pc(653) Class6 local653;
		if (Static17.aClass6_2 != null) {
			Static57.method1068(Static17.aClass6_2);
			Static67.anInt1655++;
			if (Static122.anInt2732 > Static38.anInt870 + 5 || Static38.anInt870 - 5 > Static122.anInt2732 || Static116.anInt2635 + 5 < Static176.anInt768 || Static176.anInt768 < Static116.anInt2635 - 5) {
				Static170.aBoolean204 = true;
			}
			if (Static27.anInt641 == 0) {
				if (Static170.aBoolean204 && Static67.anInt1655 >= 5) {
					if (Static214.aClass6_16 == Static17.aClass6_2 && Static27.anInt637 != Static100.anInt2332) {
						local653 = Static17.aClass6_2;
						@Pc(655) byte local655 = 0;
						if (Static159.anInt3551 == 1 && local653.anInt245 == 206) {
							local655 = 1;
						}
						if (local653.anIntArray31[Static100.anInt2332] <= 0) {
							local655 = 0;
						}
						if (Static190.method2982(Static166.method2717(local653))) {
							local87 = Static100.anInt2332;
							local85 = Static27.anInt637;
							local653.anIntArray31[local87] = local653.anIntArray31[local85];
							local653.anIntArray26[local87] = local653.anIntArray26[local85];
							local653.anIntArray31[local85] = -1;
							local653.anIntArray26[local85] = 0;
						} else if (local655 == 1) {
							local87 = Static100.anInt2332;
							local85 = Static27.anInt637;
							while (local87 != local85) {
								if (local87 < local85) {
									local653.method162(local85, local85 - 1);
									local85--;
								} else if (local85 < local87) {
									local653.method162(local85, local85 + 1);
									local85++;
								}
							}
						} else {
							local653.method162(Static27.anInt637, Static100.anInt2332);
						}
						Static96.aClass1_Sub9_Sub1_3.method953(207);
						Static96.aClass1_Sub9_Sub1_3.method937(Static17.aClass6_2.anInt229);
						Static96.aClass1_Sub9_Sub1_3.method914(Static27.anInt637);
						Static96.aClass1_Sub9_Sub1_3.method908(local655);
						Static96.aClass1_Sub9_Sub1_3.method902(Static100.anInt2332);
					}
				} else if ((Static173.anInt3720 == 1 || Static151.method2590(Static91.anInt2134 - 1)) && Static91.anInt2134 > 2) {
					Static163.method2706();
				} else if (Static91.anInt2134 > 0) {
					Static65.method1172(Static91.anInt2134 - 1);
				}
				Static155.anInt3460 = 10;
				Static17.aClass6_2 = null;
				Static192.anInt4115 = 0;
			}
		}
		Static107.anInt2466 = 0;
		Static128.aBoolean157 = false;
		Static47.aClass6_4 = null;
		Static118.aBoolean146 = false;
		@Pc(838) Class6 local838 = Static26.aClass6_3;
		local653 = Static173.aClass6_15;
		Static26.aClass6_3 = null;
		Static173.aClass6_15 = null;
		while (Static107.method1854() && Static107.anInt2466 < 128) {
			Static59.anIntArray172[Static107.anInt2466] = Static199.anInt4262;
			Static213.anIntArray609[Static107.anInt2466] = Static128.anInt2812;
			Static107.anInt2466++;
		}
		Static147.aClass6_13 = null;
		if (Static83.anInt1958 != -1) {
			Static79.method1402(0, 0, 0, Static88.anInt2058, Static83.anInt1958, 0, Static112.anInt2563);
		}
		Static171.anInt3707++;
		while (true) {
			@Pc(887) Class1_Sub8 local887;
			@Pc(903) Class6 local903;
			@Pc(892) Class6 local892;
			do {
				local887 = (Class1_Sub8) Static37.aClass19_4.method621();
				if (local887 == null) {
					while (true) {
						do {
							local887 = (Class1_Sub8) Static173.aClass19_15.method621();
							if (local887 == null) {
								while (true) {
									do {
										local887 = (Class1_Sub8) Static208.aClass19_18.method621();
										if (local887 == null) {
											if (Static100.aBoolean129 && Static147.aClass6_13 == null) {
												Static100.aBoolean129 = false;
											}
											if (Static60.aClass6_9 != null) {
												Static190.method2980();
											}
											if (Static2.anInt67 != -1) {
												local85 = Static2.anInt67;
												local87 = Static194.anInt4139;
												@Pc(1066) boolean local1066 = Static149.method2551(local87, 0, 0, true, 0, Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0], 0, local85, 0, 0);
												if (local1066) {
													Static147.anInt3278 = 1;
													Static122.anInt2728 = Static39.anInt882;
													Static154.anInt3436 = 0;
													Static129.anInt1190 = Static166.anInt3603;
												}
												Static2.anInt67 = -1;
											}
											Static202.method3126();
											if (local653 != Static173.aClass6_15) {
												if (local653 != null) {
													Static57.method1068(local653);
												}
												if (Static173.aClass6_15 != null) {
													Static57.method1068(Static173.aClass6_15);
												}
											}
											if (Static26.aClass6_3 != local838 && Static146.anInt3258 == Static7.anInt185) {
												if (local838 != null) {
													Static57.method1068(local838);
												}
												if (Static26.aClass6_3 != null) {
													Static57.method1068(Static26.aClass6_3);
												}
											}
											if (Static26.aClass6_3 == null) {
												if (Static146.anInt3258 > 0) {
													Static146.anInt3258--;
												}
											} else if (Static7.anInt185 > Static146.anInt3258) {
												Static146.anInt3258++;
												if (Static7.anInt185 == Static146.anInt3258) {
													Static57.method1068(Static26.aClass6_3);
												}
											}
											Static147.method2516();
											if (Static144.aBoolean179) {
												Static144.method2482();
											}
											for (local85 = 0; local85 < 5; local85++) {
												@Pc(1146) int local1146 = Static68.anIntArray198[local85]++;
											}
											local87 = Static26.method431();
											local89 = Static22.method376();
											if (local87 > 4500 && local89 > 4500) {
												Static4.anInt99 = 250;
												Static139.method2381(4000);
												Static96.aClass1_Sub9_Sub1_3.method953(226);
											}
											Static88.anInt2050++;
											Static154.anInt3435++;
											Static111.anInt2541++;
											if (Static154.anInt3435 > 500) {
												Static154.anInt3435 = 0;
												local110 = (int) (Math.random() * 8.0D);
												if ((local110 & 0x2) == 2) {
													Static192.anInt4108 += Static86.anInt1998;
												}
												if ((local110 & 0x4) == 4) {
													Static73.anInt1793 += Static210.anInt3915;
												}
												if ((local110 & 0x1) == 1) {
													Static83.anInt1954 += Static168.anInt3650;
												}
											}
											if (Static192.anInt4108 < -55) {
												Static86.anInt1998 = 2;
											}
											if (Static73.anInt1793 < -40) {
												Static210.anInt3915 = 1;
											}
											if (Static73.anInt1793 > 40) {
												Static210.anInt3915 = -1;
											}
											if (Static192.anInt4108 > 55) {
												Static86.anInt1998 = -2;
											}
											if (Static83.anInt1954 < -50) {
												Static168.anInt3650 = 2;
											}
											if (Static88.anInt2050 > 500) {
												Static88.anInt2050 = 0;
												local110 = (int) (Math.random() * 8.0D);
												if ((local110 & 0x2) == 2) {
													Static154.anInt3449 += Static105.anInt2389;
												}
												if ((local110 & 0x1) == 1) {
													Static12.anInt352 += Static177.anInt3796;
												}
											}
											if (Static12.anInt352 < -60) {
												Static177.anInt3796 = 2;
											}
											if (Static154.anInt3449 < -20) {
												Static105.anInt2389 = 1;
											}
											if (Static12.anInt352 > 60) {
												Static177.anInt3796 = -2;
											}
											if (Static83.anInt1954 > 50) {
												Static168.anInt3650 = -2;
											}
											if (Static154.anInt3449 > 10) {
												Static105.anInt2389 = -1;
											}
											if (Static111.anInt2541 > 50) {
												Static96.aClass1_Sub9_Sub1_3.method953(19);
											}
											try {
												if (Static184.aClass55_3 != null && Static96.aClass1_Sub9_Sub1_3.anInt1192 > 0) {
													Static184.aClass55_3.method1756(Static96.aClass1_Sub9_Sub1_3.aByteArray20, Static96.aClass1_Sub9_Sub1_3.anInt1192);
													Static96.aClass1_Sub9_Sub1_3.anInt1192 = 0;
													Static111.anInt2541 = 0;
													return;
												}
												return;
											} catch (@Pc(1367) IOException local1367) {
												Static126.method2128();
												return;
											}
										}
										local892 = local887.aClass6_5;
										if (local892.anInt242 < 0) {
											break;
										}
										local903 = Static107.method1857(local892.anInt204);
									} while (local903 == null || local903.aClass6Array1 == null || local903.aClass6Array1.length <= local892.anInt242 || local903.aClass6Array1[local892.anInt242] != local892);
									Static93.method1622(local887);
								}
							}
							local892 = local887.aClass6_5;
							if (local892.anInt242 < 0) {
								break;
							}
							local903 = Static107.method1857(local892.anInt204);
						} while (local903 == null || local903.aClass6Array1 == null || local892.anInt242 >= local903.aClass6Array1.length || local892 != local903.aClass6Array1[local892.anInt242]);
						Static93.method1622(local887);
					}
				}
				local892 = local887.aClass6_5;
				if (local892.anInt242 < 0) {
					break;
				}
				local903 = Static107.method1857(local892.anInt204);
			} while (local903 == null || local903.aClass6Array1 == null || local903.aClass6Array1.length <= local892.anInt242 || local892 != local903.aClass6Array1[local892.anInt242]);
			Static93.method1622(local887);
		}
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(I)V")
	public static void method2445(@OriginalArg(0) int arg0) {
		Static200.anInt4271 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static83.anInt1959; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static150.anInt3350; local6++) {
				if (Static100.aClass1_Sub22ArrayArrayArray3[arg0][local3][local6] == null) {
					Static100.aClass1_Sub22ArrayArrayArray3[arg0][local3][local6] = new Class1_Sub22(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)I")
	public static int method2447(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
