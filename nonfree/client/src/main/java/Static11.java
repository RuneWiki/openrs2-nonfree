import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "Lclient!ac;")
	public static Class3 aClass3_2;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "Lclient!df;")
	public static Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "Z")
	public static boolean aBoolean4;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "Lclient!df;")
	public static Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Lclient!kc;")
	private static Class36 aClass36_157 = Static14.method2017("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!kc;")
	private static Class36 aClass36_158 = Static14.method2017("Loading sprites )2 ");

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "[Lclient!ad;")
	public static Class4[] aClass4Array1 = new Class4[4];

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public static int anInt264 = 0;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "Lclient!kc;")
	public static Class36 aClass36_159 = aClass36_158;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_160 = aClass36_157;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "Lclient!kc;")
	public static Class36 aClass36_161 = Static14.method2017("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_162 = Static14.method2017("Sprites geladen)3");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method220() {
		Static42.aClass2_Sub12_Sub1_1.method1422(243);
		if (Static94.anInt2471 != -1) {
			Static71.method1275(Static94.anInt2471);
			Static80.anInt2060 = -1;
			Static94.anInt2471 = -1;
			Static78.aBoolean85 = true;
			Static100.aBoolean118 = true;
		}
		if (Static49.anInt1312 != -1) {
			Static71.method1275(Static49.anInt1312);
			Static115.aBoolean77 = true;
			Static49.anInt1312 = -1;
			Static80.anInt2060 = -1;
		}
		if (Static46.anInt1229 != -1) {
			Static71.method1275(Static46.anInt1229);
			Static46.anInt1229 = -1;
			Static104.method1914(30);
		}
		if (Static9.anInt237 != -1) {
			Static71.method1275(Static9.anInt237);
			Static9.anInt237 = -1;
		}
		if (Static78.anInt2037 != -1) {
			Static71.method1275(Static78.anInt2037);
			Static80.anInt2060 = -1;
			Static78.anInt2037 = -1;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(JB)V")
	public static void method221(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static106.anInt2724; local12++) {
			if (arg0 == Static4.aLongArray1[local12]) {
				Static106.anInt2724--;
				Static100.aBoolean118 = true;
				for (@Pc(36) int local36 = local12; local36 < Static106.anInt2724; local36++) {
					Static4.aLongArray1[local36] = Static4.aLongArray1[local36 + 1];
				}
				Static42.aClass2_Sub12_Sub1_1.method1422(106);
				Static42.aClass2_Sub12_Sub1_1.method1377(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILclient!qc;)V")
	public static void method222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub4_Sub2_Sub2 arg2) {
		if (arg2.anInt2168 == arg1 && arg1 != -1) {
			@Pc(12) int local12 = Static56.method1045(arg1).anInt2406;
			if (local12 == 1) {
				arg2.anInt2162 = arg0;
				arg2.anInt2147 = 0;
				arg2.anInt2198 = 0;
				arg2.anInt2196 = 0;
			}
			if (local12 == 2) {
				arg2.anInt2198 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt2168 == -1 || Static56.method1045(arg1).anInt2395 >= Static56.method1045(arg2.anInt2168).anInt2395) {
			arg2.anInt2192 = arg2.anInt2158;
			arg2.anInt2196 = 0;
			arg2.anInt2162 = arg0;
			arg2.anInt2168 = arg1;
			arg2.anInt2198 = 0;
			arg2.anInt2147 = 0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([BI)V")
	public static void method223(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub12 local10 = new Class2_Sub12(arg0);
		local10.anInt1939 = arg0.length - 2;
		Static79.anInt2057 = local10.method1366();
		Static92.anIntArray293 = new int[Static79.anInt2057];
		Static64.anIntArray204 = new int[Static79.anInt2057];
		Static42.aByteArrayArray19 = new byte[Static79.anInt2057][];
		Static36.anIntArray132 = new int[Static79.anInt2057];
		Static27.anIntArray60 = new int[Static79.anInt2057];
		local10.anInt1939 = arg0.length - Static79.anInt2057 * 8 - 7;
		Static96.anInt2558 = local10.method1366();
		Static10.anInt247 = local10.method1366();
		@Pc(63) int local63 = (local10.method1399() & 0xFF) + 1;
		for (@Pc(65) int local65 = 0; local65 < Static79.anInt2057; local65++) {
			Static27.anIntArray60[local65] = local10.method1366();
		}
		for (@Pc(88) int local88 = 0; local88 < Static79.anInt2057; local88++) {
			Static64.anIntArray204[local88] = local10.method1366();
		}
		for (@Pc(108) int local108 = 0; local108 < Static79.anInt2057; local108++) {
			Static92.anIntArray293[local108] = local10.method1366();
		}
		for (@Pc(122) int local122 = 0; local122 < Static79.anInt2057; local122++) {
			Static36.anIntArray132[local122] = local10.method1366();
		}
		local10.anInt1939 = arg0.length - Static79.anInt2057 * 8 - (local63 - 1) * 3 - 7;
		Static43.anIntArray161 = new int[local63];
		for (@Pc(156) int local156 = 1; local156 < local63; local156++) {
			Static43.anIntArray161[local156] = local10.method1408();
			if (Static43.anIntArray161[local156] == 0) {
				Static43.anIntArray161[local156] = 1;
			}
		}
		local10.anInt1939 = 0;
		for (@Pc(185) int local185 = 0; local185 < Static79.anInt2057; local185++) {
			@Pc(191) int local191 = Static92.anIntArray293[local185];
			@Pc(195) int local195 = Static36.anIntArray132[local185];
			@Pc(199) int local199 = local195 * local191;
			@Pc(202) byte[] local202 = new byte[local199];
			Static42.aByteArrayArray19[local185] = local202;
			@Pc(212) int local212 = local10.method1399();
			@Pc(219) int local219;
			if (local212 == 0) {
				for (local219 = 0; local219 < local199; local219++) {
					local202[local219] = local10.method1406();
				}
			} else if (local212 == 1) {
				for (local219 = 0; local219 < local191; local219++) {
					for (@Pc(223) int local223 = 0; local223 < local195; local223++) {
						local202[local191 * local223 + local219] = local10.method1406();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method225() {
		aClass36_159 = null;
		aClass36_157 = null;
		aClass3_2 = null;
		aClass2_Sub1_Sub1_Sub2_2 = null;
		aClass2_Sub1_Sub1_Sub2_1 = null;
		aClass36_162 = null;
		aClass36_160 = null;
		aClass4Array1 = null;
		aClass36_161 = null;
		aClass36_158 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([Lclient!ed;IIIIIIIII)Z")
	public static boolean method227(@OriginalArg(0) Class2_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static54.method1577(arg5, arg2, arg6, arg4);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
			@Pc(20) Class2_Sub1_Sub6 local20 = arg0[local14];
			if (local20 != null && local20.anInt669 == arg3) {
				if (local20.anInt694 > 0) {
					Static26.method544(local20);
				}
				@Pc(49) int local49 = local20.anInt722 + arg5 - arg7;
				@Pc(57) int local57 = arg2 + local20.anInt685 - arg1;
				@Pc(60) int local60 = local20.anInt705;
				@Pc(87) int local87;
				@Pc(92) int local92;
				@Pc(170) int local170;
				@Pc(152) int local152;
				if (local20 == Static24.aClass2_Sub1_Sub6_1) {
					@Pc(67) Class2_Sub1_Sub6 local67 = Static9.method205(local20);
					if (local67 == null) {
						Static24.aClass2_Sub1_Sub6_1 = null;
					} else {
						@Pc(73) int[] local73 = Static29.method625(local67);
						@Pc(77) int[] local77 = Static29.method625(local20);
						if (!local20.aBoolean35) {
							local60 = 128;
						}
						local87 = Static115.anInt1789 - Static107.anInt2749;
						local92 = Static64.anInt1640 - Static60.anInt1600;
						if (local20.anInt709 >= local87 && -local20.anInt709 <= local87 && local20.anInt709 >= local92 && -local20.anInt709 <= local92 && !Static71.aBoolean79) {
							local87 = 0;
							local92 = 0;
						} else if (local20.anInt707 < Static49.anInt1311 || Static71.aBoolean79) {
							Static71.aBoolean79 = true;
						} else {
							local87 = 0;
							local92 = 0;
						}
						local152 = local77[1] + local92 - local73[1];
						if (local152 < 0) {
							local152 = 0;
						}
						local170 = local87 + local77[0] - local73[0];
						if (local67.anInt660 < local152 + local20.anInt660) {
							local152 = local67.anInt660 - local20.anInt660;
						}
						if (local170 < 0) {
							local170 = 0;
						}
						if (local67.anInt677 < local170 + local20.anInt677) {
							local170 = local67.anInt677 - local20.anInt677;
						}
						local49 = local73[0] + local170;
						local57 = local73[1] + local152;
					}
				}
				if ((!local20.aBoolean27 || Static54.anInt2256 >= local49 && local57 <= Static54.anInt2254 && Static54.anInt2257 <= local20.anInt677 + local49 && Static54.anInt2259 <= local20.anInt660 + local57) && (!local20.aBoolean27 || !Static81.method1492(local20))) {
					if (local20.anInt676 == 0) {
						if (!local20.aBoolean27 && Static81.method1492(local20) && !Static45.method902(local14, arg8)) {
							continue;
						}
						if (!local20.aBoolean27) {
							if (local20.anInt716 > local20.anInt686 - local20.anInt660) {
								local20.anInt716 = local20.anInt686 - local20.anInt660;
							}
							if (local20.anInt716 < 0) {
								local20.anInt716 = 0;
							}
						}
						local12 &= method227(arg0, local20.anInt716, local57, local20.anInt680, local20.anInt660 + local57, local49, local20.anInt677 + local49, local20.anInt675, arg8);
						if (local20.aClass2_Sub1_Sub6Array1 != null) {
							local12 &= method227(local20.aClass2_Sub1_Sub6Array1, local20.anInt716, local57, local20.anInt680, local20.anInt660 + local57, local49, local20.anInt677 + local49, local20.anInt675, arg8);
						}
						Static54.method1577(arg5, arg2, arg6, arg4);
						if (local20.anInt660 < local20.anInt686 && !local20.aBoolean27) {
							Static92.method1683(local20.anInt716, local57, local20.anInt686, local20.anInt660, local20.anInt677 + local49);
						}
					}
					if (local20.anInt676 != 1) {
						@Pc(453) int local453;
						@Pc(634) int local634;
						@Pc(393) int local393;
						@Pc(395) int local395;
						@Pc(399) int local399;
						if (local20.anInt676 == 2) {
							local393 = 0;
							for (local395 = 0; local395 < local20.anInt660; local395++) {
								for (local399 = 0; local399 < local20.anInt677; local399++) {
									local87 = local49 + local399 * (local20.anInt690 + 32);
									local92 = local57 + local395 * (local20.anInt708 + 32);
									if (local393 < 20) {
										local87 += local20.anIntArray51[local393];
										local92 += local20.anIntArray53[local393];
									}
									if (local20.anIntArray57[local393] > 0) {
										local453 = local20.anIntArray57[local393] - 1;
										if (Static54.anInt2257 - 32 < local87 && Static54.anInt2256 > local87 && local92 > Static54.anInt2259 - 32 && local92 < Static54.anInt2254 || Static60.anInt1597 != 0 && local393 == Static77.anInt2024) {
											@Pc(514) Class2_Sub1_Sub1_Sub3 local514;
											if (Static20.anInt500 == 1 && local393 == Static112.anInt2923 && Static81.anInt2064 == local20.anInt680) {
												local514 = Static112.method2037(0, local453, local20.anIntArray54[local393], false, 2);
											} else {
												local514 = Static112.method2037(3153952, local453, local20.anIntArray54[local393], false, 1);
											}
											if (local514 == null) {
												local12 = false;
											} else if (Static60.anInt1597 != 0 && Static77.anInt2024 == local393 && local20.anInt680 == Static101.anInt2658) {
												local152 = Static64.anInt1640 - Static13.anInt308;
												if (local152 < 5 && local152 > -5) {
													local152 = 0;
												}
												local170 = Static115.anInt1789 - Static99.anInt2035;
												if (local170 < 5 && local170 > -5) {
													local170 = 0;
												}
												if (Static65.anInt1685 < 5) {
													local170 = 0;
													local152 = 0;
												}
												local514.method1236(local87 + local170, local92 - -local152, 128);
												if (arg3 != -1) {
													@Pc(607) Class2_Sub1_Sub6 local607 = arg0[arg3 & 0xFFFF];
													if (local152 + local92 < Static54.anInt2259 && local607.anInt716 > 0) {
														local634 = (Static54.anInt2259 - local92 - local152) * Static100.anInt2609 / 3;
														if (Static100.anInt2609 * 10 < local634) {
															local634 = Static100.anInt2609 * 10;
														}
														if (local607.anInt716 < local634) {
															local634 = local607.anInt716;
														}
														local607.anInt716 -= local634;
														Static13.anInt308 += local634;
													}
													if (local152 + local92 + 32 > Static54.anInt2254 && local607.anInt686 - local607.anInt660 > local607.anInt716) {
														local634 = (local152 + local92 + 32 - Static54.anInt2254) * Static100.anInt2609 / 3;
														if (local634 > Static100.anInt2609 * 10) {
															local634 = Static100.anInt2609 * 10;
														}
														if (local607.anInt686 - local607.anInt660 - local607.anInt716 < local634) {
															local634 = local607.anInt686 - local607.anInt716 - local607.anInt660;
														}
														local607.anInt716 += local634;
														Static13.anInt308 -= local634;
													}
												}
											} else if (Static20.anInt498 != 0 && Static104.anInt2700 == local393 && Static69.anInt1750 == local20.anInt680) {
												local514.method1236(local87, local92, 128);
											} else {
												local514.method1234(local87, local92);
											}
										}
									} else if (local20.anIntArray52 != null && local393 < 20) {
										@Pc(788) Class2_Sub1_Sub1_Sub3 local788 = local20.method545(local393);
										if (local788 != null) {
											local788.method1234(local87, local92);
										} else if (Static66.aBoolean74) {
											local12 = false;
										}
									}
									local393++;
								}
							}
						} else if (local20.anInt676 == 3) {
							if (Static38.method750(local20)) {
								local393 = local20.anInt678;
								if (Static45.method902(local14, arg8) && local20.anInt715 != 0) {
									local393 = local20.anInt715;
								}
							} else {
								local393 = local20.anInt687;
								if (Static45.method902(local14, arg8) && local20.anInt693 != 0) {
									local393 = local20.anInt693;
								}
							}
							if (local60 == 0) {
								if (local20.aBoolean31) {
									Static54.method1591(local49, local57, local20.anInt677, local20.anInt660, local393);
								} else {
									Static54.method1583(local49, local57, local20.anInt677, local20.anInt660, local393);
								}
							} else if (local20.aBoolean31) {
								Static54.method1592(local49, local57, local20.anInt677, local20.anInt660, local393, 256 - (local60 & 0xFF));
							} else {
								Static54.method1590(local49, local57, local20.anInt677, local20.anInt660, local393, 256 - (local60 & 0xFF));
							}
						} else {
							@Pc(932) Class2_Sub1_Sub1_Sub2 local932;
							if (local20.anInt676 == 4) {
								local932 = local20.method541();
								if (local932 != null) {
									@Pc(943) Class36 local943 = local20.aClass36_369;
									if (Static38.method750(local20)) {
										local395 = local20.anInt678;
										if (Static45.method902(local14, arg8) && local20.anInt715 != 0) {
											local395 = local20.anInt715;
										}
										if (local20.aClass36_366.method1028() > 0) {
											local943 = local20.aClass36_366;
										}
									} else {
										local395 = local20.anInt687;
										if (Static45.method902(local14, arg8) && local20.anInt693 != 0) {
											local395 = local20.anInt693;
										}
									}
									if (local20.aBoolean27 && local20.anInt703 != -1) {
										@Pc(1006) Class2_Sub1_Sub18 local1006 = Static43.method832(local20.anInt703);
										local943 = local1006.aClass36_1397;
										if (local943 == null) {
											local943 = Static118.aClass36_1465;
										}
										if ((local1006.anInt2837 == 1 || local20.anInt692 != 1) && local20.anInt692 != -1) {
											local943 = Static49.method949(new Class36[] { local943, Static104.aClass36_1321, Static50.method965(local20.anInt692) });
										}
									}
									if (local20.anInt680 == Static80.anInt2060 && local20.anInt710 == Static105.anInt2731) {
										local395 = local20.anInt687;
										local943 = Static111.aClass36_1408;
									}
									if (Static54.anInt2258 == 479) {
										if (local395 == 16776960) {
											local395 = 255;
										}
										if (local395 == 49152) {
											local395 = 16777215;
										}
									}
									local943 = Static48.method920(local943, local20);
									local932.method465(local943, local49, local57, local20.anInt677, local20.anInt660, local395, local20.aBoolean26, local20.anInt666, local20.anInt717, local20.anInt688);
								} else if (Static66.aBoolean74) {
									local12 = false;
								}
							} else {
								@Pc(1312) int local1312;
								@Pc(1303) int local1303;
								@Pc(1318) int local1318;
								if (local20.anInt676 == 5) {
									@Pc(1122) Class2_Sub1_Sub1_Sub3 local1122;
									if (local20.aBoolean27) {
										if (local20.anInt703 == -1) {
											local1122 = local20.method543(false);
										} else {
											local1122 = Static112.method2037(local20.anInt704, local20.anInt703, local20.anInt692, false, local20.anInt689);
										}
										if (local1122 != null) {
											local395 = local1122.anInt1784;
											local399 = local1122.anInt1785;
											if (local20.aBoolean25) {
												local92 = local49;
												local170 = local57;
												@Pc(1236) int[] local1236 = new int[4];
												Static54.method1582(local1236);
												local453 = local20.anInt660 + local57;
												if (local1236[0] > local49) {
													local92 = local1236[0];
												}
												if (local453 > local1236[3]) {
													local453 = local1236[3];
												}
												if (local1236[1] > local57) {
													local170 = local1236[1];
												}
												local152 = local49 + local20.anInt677;
												if (local1236[2] < local152) {
													local152 = local1236[2];
												}
												Static54.method1577(local92, local170, local152, local453);
												local1303 = (local20.anInt660 + local399 - 1) / local399;
												local1312 = (local20.anInt677 + local395 - 1) / local395;
												for (local634 = 0; local634 < local1312; local634++) {
													for (local1318 = 0; local1318 < local1303; local1318++) {
														if (local20.anInt657 != 0) {
															local1122.method1237(local395 / 2 + local49 + local395 * local634, local399 / 2 + local57 + local399 * local1318, local20.anInt657, 4096);
														} else if (local60 == 0) {
															local1122.method1234(local634 * local395 + local49, local57 - -(local399 * local1318));
														} else {
															local1122.method1236(local49 + local395 * local634, local399 * local1318 + local57, 256 - (local60 & 0xFF));
														}
													}
												}
												Static54.method1586(local1236);
											} else {
												local87 = local20.anInt677 * 4096 / local395;
												if (local20.anInt657 != 0) {
													local1122.method1237(local20.anInt677 / 2 + local49, local57 - -(local20.anInt660 / 2), local20.anInt657, local87);
												} else if (local60 != 0) {
													local1122.method1254(local49, local57, local20.anInt677, local20.anInt660, 256 - (local60 & 0xFF));
												} else if (local395 == local20.anInt677 && local20.anInt660 == local399) {
													local1122.method1234(local49, local57);
												} else {
													local1122.method1240(local49, local57, local20.anInt677, local20.anInt660);
												}
											}
										} else if (Static66.aBoolean74) {
											local12 = false;
										}
									} else {
										local1122 = local20.method543(Static38.method750(local20));
										if (local1122 != null) {
											local1122.method1234(local49, local57);
										} else if (Static66.aBoolean74) {
											local12 = false;
										}
									}
								} else {
									@Pc(1525) Class2_Sub1_Sub18 local1525;
									if (local20.anInt676 == 6) {
										@Pc(1435) boolean local1435 = Static38.method750(local20);
										if (local1435) {
											local395 = local20.anInt668;
										} else {
											local395 = local20.anInt667;
										}
										@Pc(1465) Class2_Sub1_Sub4_Sub1 local1465;
										if (local20.anInt700 == 5) {
											if (local20.anInt655 == 0) {
												local1465 = Static47.aClass67_1.method1997(null, null, -1, -1);
											} else {
												local1465 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.method2031();
											}
										} else if (local395 == -1) {
											local1465 = local20.method548(Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.aClass67_2, -1, local1435, null);
											if (local1465 == null && Static66.aBoolean74) {
												local12 = false;
											}
										} else {
											@Pc(1478) Class2_Sub1_Sub14 local1478 = Static56.method1045(local395);
											local1465 = local20.method548(Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.aClass67_2, local20.anInt684, local1435, local1478);
											if (local1465 == null && Static66.aBoolean74) {
												local12 = false;
											}
										}
										local87 = 0;
										if (local20.anInt703 != -1) {
											local1525 = Static43.method832(local20.anInt703);
											if (local1525 != null) {
												local1525 = local1525.method1989(local20.anInt692);
												local1465 = local1525.method1985(true, 1);
												if (local1465 != null) {
													local87 = local1465.anInt2916 / 2;
												}
											}
										}
										Static87.method1603(local20.anInt677 / 2 + local49, local57 - -(local20.anInt660 / 2));
										local170 = Class2_Sub1_Sub1_Sub4.anIntArray261[local20.anInt672] * local20.anInt691 >> 16;
										local92 = Class2_Sub1_Sub1_Sub4.anIntArray265[local20.anInt672] * local20.anInt691 >> 16;
										if (local1465 != null) {
											if (local20.aBoolean27) {
												local1465.method662();
												if (local20.aBoolean33) {
													local1465.method653(local20.anInt681, local20.anInt721, local20.anInt672, local20.anInt696, local87 + local92 + local20.anInt679, local170 + local20.anInt679, local20.anInt691);
												} else {
													local1465.method667(local20.anInt681, local20.anInt721, local20.anInt672, local20.anInt696, local20.anInt679 + local87 + local92, local170 + local20.anInt679);
												}
											} else {
												local1465.method667(local20.anInt681, 0, local20.anInt672, 0, local92, local170);
											}
										}
										Static87.method1607();
									} else {
										if (local20.anInt676 == 7) {
											local932 = local20.method541();
											if (local932 == null) {
												if (Static66.aBoolean74) {
													local12 = false;
												}
												continue;
											}
											local395 = 0;
											for (local399 = 0; local399 < local20.anInt660; local399++) {
												for (local87 = 0; local87 < local20.anInt677; local87++) {
													if (local20.anIntArray57[local395] > 0) {
														local1525 = Static43.method832(local20.anIntArray57[local395] - 1);
														@Pc(1698) Class36 local1698 = local1525.aClass36_1397;
														if (local1698 == null) {
															local1698 = Static118.aClass36_1465;
														}
														if (local1525.anInt2837 == 1 || local20.anIntArray54[local395] != 1) {
															local1698 = Static49.method949(new Class36[] { local1698, Static104.aClass36_1321, Static50.method965(local20.anIntArray54[local395]) });
														}
														local453 = (local20.anInt708 + 12) * local399 + local57;
														local152 = (local20.anInt690 + 115) * local87 + local49;
														if (local20.anInt666 == 0) {
															local932.method475(local1698, local152, local453, local20.anInt687, local20.aBoolean26);
														} else if (local20.anInt666 == 1) {
															local932.method457(local1698, local152 + local20.anInt677 / 2, local453, local20.anInt687, local20.aBoolean26);
														} else {
															local932.method472(local1698, local152 + local20.anInt677 - 1, local453, local20.anInt687, local20.aBoolean26);
														}
													}
													local395++;
												}
											}
										}
										if (local20.anInt676 == 8 && Static77.method1463(local14, arg8) && Static16.anInt349 == Static33.anInt408) {
											local395 = 0;
											local393 = 0;
											@Pc(1839) Class36 local1839 = local20.aClass36_369;
											@Pc(1841) Class2_Sub1_Sub1_Sub2 local1841 = aClass2_Sub1_Sub1_Sub2_1;
											local1839 = Static48.method920(local1839, local20);
											@Pc(1862) Class36 local1862;
											while (local1839.method1028() > 0) {
												local170 = local1839.method1009(Static83.aClass36_983);
												if (local170 == -1) {
													local1862 = local1839;
													local1839 = Static105.aClass36_1352;
												} else {
													local1862 = local1839.method1018(0, local170);
													local1839 = local1839.method1020(local170 + 2);
												}
												local152 = local1841.method462(local1862);
												if (local393 < local152) {
													local393 = local152;
												}
												local395 += local1841.anInt561 + 1;
											}
											local395 += 7;
											local393 += 6;
											local170 = local20.anInt677 + local49 - local393 - 5;
											if (local170 < local49 + 5) {
												local170 = local49 + 5;
											}
											local152 = local20.anInt660 + local57 + 5;
											if (arg4 < local152 + local395) {
												local152 = arg4 - local395;
											}
											if (local170 + local393 > arg6) {
												local170 = arg6 - local393;
											}
											Static54.method1591(local170, local152, local393, local395, 16777120);
											Static54.method1583(local170, local152, local393, local395, 0);
											local453 = local152 + local1841.anInt561 + 2;
											local1839 = local20.aClass36_369;
											local1839 = Static48.method920(local1839, local20);
											while (local1839.method1028() > 0) {
												local1312 = local1839.method1009(Static83.aClass36_983);
												if (local1312 == -1) {
													local1862 = local1839;
													local1839 = Static105.aClass36_1352;
												} else {
													local1862 = local1839.method1018(0, local1312);
													local1839 = local1839.method1020(local1312 + 2);
												}
												local1841.method475(local1862, local170 + 3, local453, 0, false);
												local453 += local1841.anInt561 + 1;
											}
										}
										if (local20.anInt676 == 9) {
											if (local20.anInt706 == 1) {
												Static54.method1588(local49, local57, local20.anInt677 + local49, local20.anInt660 + local57, local20.anInt687);
											} else {
												local393 = local20.anInt677 >= 0 ? local20.anInt677 : -local20.anInt677;
												local395 = local20.anInt660 < 0 ? -local20.anInt660 : local20.anInt660;
												local399 = local393;
												if (local395 > local393) {
													local399 = local395;
												}
												if (local399 != 0) {
													local87 = (local20.anInt677 << 16) / local399;
													local92 = (local20.anInt660 << 16) / local399;
													if (local92 > local87) {
														local92 = -local92;
													} else {
														local87 = -local87;
													}
													local170 = local92 * local20.anInt706 >> 17;
													local1303 = local49 + local170;
													local453 = local87 * local20.anInt706 >> 17;
													local1312 = local87 * local20.anInt706 + 1 >> 17;
													local152 = local20.anInt706 * local92 + 1 >> 17;
													local634 = local49 - local152;
													@Pc(2159) int local2159 = local453 + local57;
													@Pc(2166) int local2166 = local20.anInt660 + local57 + local453;
													@Pc(2174) int local2174 = local170 + local49 + local20.anInt677;
													local1318 = local20.anInt677 + local49 - local152;
													@Pc(2190) int local2190 = local20.anInt660 + local57 - local1312;
													@Pc(2194) int local2194 = local57 - local1312;
													Static87.method1595(local1303, local634, local1318);
													Static87.method1593(local2159, local2194, local2190, local1303, local634, local1318, local20.anInt687);
													Static87.method1595(local1303, local1318, local2174);
													Static87.method1593(local2159, local2190, local2166, local1303, local1318, local2174, local20.anInt687);
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

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
	public static void method229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 0;
		@Pc(12) int local12 = 2048 - arg1 & 0x7FF;
		@Pc(14) int local14 = 0;
		@Pc(21) int local21 = 2048 - arg2 & 0x7FF;
		@Pc(28) int local28 = arg3;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(52) int local52;
		if (local21 != 0) {
			local37 = Static30.anIntArray105[local21];
			local41 = Static30.anIntArray96[local21];
			local52 = local41 * 0 - arg3 * local37 >> 16;
			local28 = local37 * 0 + local41 * arg3 >> 16;
			local14 = local52;
		}
		if (local12 != 0) {
			local37 = Static30.anIntArray105[local12];
			local41 = Static30.anIntArray96[local12];
			local52 = local41 * 0 + local28 * local37 >> 16;
			local28 = local28 * local41 - local37 * 0 >> 16;
			local5 = local52;
		}
		Static96.anInt2559 = arg2;
		Static59.anInt1588 = arg0 - local28;
		Static51.anInt2603 = arg1;
		Static111.anInt2875 = arg5 - local14;
		Static105.anInt2735 = arg4 - local5;
	}
}
