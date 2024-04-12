import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!pc;")
	public static Class2_Sub10 aClass2_Sub10_1;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!p;")
	public static Class45 aClass45_11;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 16)
	public static void method398() {
		aFont1 = null;
		Class19.aClass40_138 = null;
		Class19.aClass40_136 = null;
		aClass2_Sub10_1 = null;
		Class19.aClass40_139 = null;
		aClass45_11 = null;
		Class19.aClass40_140 = null;
		Class19.aLongArray2 = null;
		Class19.aClass40_141 = null;
		Class19.aClass40_137 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 84)
	public static void method399() {
		Class11.anInt304 = 0;
		Class2_Sub9.anInt1190 = 0;
		Static93.method1593();
		Static43.method1636();
		Static90.method1567();
		Static14.method1255();
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Class11.anInt304; local23++) {
			local29 = Class30.anIntArray258[local23];
			if (Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local29].anInt2274 != Class24.anInt2511) {
				Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local29] = null;
			}
		}
		if (Class2_Sub2_Sub7.anInt785 != Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546) {
			throw new RuntimeException("gpp1 pos:" + Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 + " psize:" + Class2_Sub2_Sub7.anInt785);
		}
		for (local29 = 0; local29 < Class54.anInt2067; local29++) {
			if (Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[Class41.anIntArray408[local29]] == null) {
				throw new RuntimeException("gpp2 pos:" + local29 + " size:" + Class54.anInt2067);
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII[Lclient!fb;BIILclient!sd;I[B)V", line = 134)
	public static void method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class55 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg9);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method1698();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local10.method1698();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local10.method1708();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (local55 == arg1 && local51 >= arg2 && local51 < arg2 + 8 && arg6 <= local45 && arg6 + 8 > local45) {
					@Pc(94) Class2_Sub2_Sub10 local94 = Static83.method1470(local17);
					@Pc(111) int local111 = Static95.method1650(local51 & 0x7, local94.anInt1040, local45 & 0x7, arg0, local94.anInt1036, local67) + arg3;
					@Pc(128) int local128 = Static14.method1261(local51 & 0x7, local94.anInt1036, local67, arg0, local94.anInt1040, local45 & 0x7) + arg5;
					if (local111 > 0 && local128 > 0 && local111 < 103 && local128 < 103) {
						@Pc(144) Class20 local144 = null;
						@Pc(146) int local146 = arg8;
						if ((Class34.aByteArrayArrayArray7[1][local111][local128] & 0x2) == 2) {
							local146 = arg8 - 1;
						}
						if (local146 >= 0) {
							local144 = arg4[local146];
						}
						Static75.method1353(arg8, local17, local111, local144, arg0 + local67 & 0x3, local63, arg7, local128);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!o;IIIZI)V", line = 240)
	public static void method402(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Class2_Sub6.anInt797 >= 500) {
			return;
		}
		Class15.aClass40Array8[Class2_Sub6.anInt797] = arg0;
		Class2_Sub2_Sub12_Sub1_Sub1.anIntArray287[Class2_Sub6.anInt797] = arg1;
		Class54.anIntArray454[Class2_Sub6.anInt797] = arg4;
		Class2_Sub7.anIntArray161[Class2_Sub6.anInt797] = arg3;
		Class23.anIntArray165[Class2_Sub6.anInt797] = arg2;
		Class2_Sub6.anInt797++;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIII)Z", line = 284)
	public static boolean method403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!Static99.method1665(arg2)) {
			return false;
		}
		Static25.method1613(arg6, arg0, arg7, arg5);
		@Pc(18) boolean local18 = true;
		@Pc(27) Class2_Sub2_Sub13[] local27 = Static46.aClass2_Sub2_Sub13ArrayArray1[arg2];
		for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
			@Pc(35) Class2_Sub2_Sub13 local35 = local27[local29];
			if (local35 != null && local35.anInt1611 == arg1) {
				if (local35.anInt1610 > 0) {
					Static9.method227(local35);
				}
				@Pc(60) int local60 = arg0 + local35.anInt1588 - arg4;
				@Pc(65) int local65 = arg6 + local35.anInt1582;
				if (local35.anInt1613 == 0) {
					if (local35.aBoolean125 && !Static31.method614(arg3, local29)) {
						continue;
					}
					if (local35.anInt1601 - local35.anInt1609 < local35.anInt1587) {
						local35.anInt1587 = local35.anInt1601 - local35.anInt1609;
					}
					if (local35.anInt1587 < 0) {
						local35.anInt1587 = 0;
					}
					local18 &= method403(local60, local29, arg2, arg3, local35.anInt1587, local60 + local35.anInt1609, local65, local65 + local35.anInt1605);
					Static25.method1613(arg6, arg0, arg7, arg5);
					if (local35.anInt1609 < local35.anInt1601) {
						Static35.method711(local35.anInt1609, local65 + local35.anInt1605, local35.anInt1587, local60, local35.anInt1601);
					}
				}
				if (local35.anInt1613 != 1) {
					@Pc(162) int local162;
					@Pc(166) int local166;
					@Pc(177) int local177;
					@Pc(213) int local213;
					@Pc(222) int local222;
					@Pc(257) int local257;
					@Pc(160) int local160;
					@Pc(215) int local215;
					@Pc(186) int local186;
					if (local35.anInt1613 == 2) {
						local160 = 0;
						for (local162 = 0; local162 < local35.anInt1609; local162++) {
							for (local166 = 0; local166 < local35.anInt1605; local166++) {
								local177 = local166 * (local35.anInt1572 + 32) + local65;
								local186 = (local35.anInt1580 + 32) * local162 + local60;
								if (local160 < 20) {
									local186 += local35.anIntArray330[local160];
									local177 += local35.anIntArray328[local160];
								}
								if (local35.anIntArray331[local160] > 0) {
									local213 = 0;
									local215 = 0;
									local222 = local35.anIntArray331[local160] - 1;
									if (local177 > Class2_Sub2_Sub2.anInt2437 - 32 && local177 < Class2_Sub2_Sub2.anInt2436 && Class2_Sub2_Sub2.anInt2439 - 32 < local186 && Class2_Sub2_Sub2.anInt2438 > local186 || Class54.anInt2077 != 0 && local160 == Class2_Sub2_Sub12_Sub6.anInt2239) {
										local257 = 0;
										if (Class18.anInt1874 == 1 && local160 == Static28.anInt724 && Static97.anInt2526 == (arg2 << 16) + local29) {
											local257 = 16777215;
										}
										@Pc(282) Class2_Sub2_Sub2_Sub4 local282 = Static55.method1000(local257, local35.anIntArray327[local160], local222);
										if (local282 == null) {
											local18 = false;
										} else {
											if (Class54.anInt2077 != 0 && Class2_Sub2_Sub12_Sub6.anInt2239 == local160 && local29 + (arg2 << 16) == Class47.anInt1911) {
												local213 = Class2_Sub2_Sub15.anInt2394 - Class2_Sub2_Sub13.anInt1571;
												if (local213 < 5 && local213 > -5) {
													local213 = 0;
												}
												local215 = Class2_Sub5.anInt742 - Class11.anInt309;
												if (local215 < 5 && local215 > -5) {
													local215 = 0;
												}
												if (Class1.anInt14 < 5) {
													local213 = 0;
													local215 = 0;
												}
												local282.method1618(local177 + local215, local213 + local186);
												if (arg1 != -1) {
													@Pc(395) Class2_Sub2_Sub13 local395 = local27[arg1];
													@Pc(415) int local415;
													if (Class2_Sub2_Sub2.anInt2439 > local186 + local213 && local395.anInt1587 > 0) {
														local415 = Class27.anInt1095 * (Class2_Sub2_Sub2.anInt2439 - local186 - local213) / 3;
														if (local415 > Class27.anInt1095 * 10) {
															local415 = Class27.anInt1095 * 10;
														}
														if (local415 > local395.anInt1587) {
															local415 = local395.anInt1587;
														}
														Class2_Sub2_Sub13.anInt1571 += local415;
														local395.anInt1587 -= local415;
													}
													if (local186 + local213 + 32 > Class2_Sub2_Sub2.anInt2438 && local395.anInt1601 - local395.anInt1609 > local395.anInt1587) {
														local415 = Class27.anInt1095 * (local213 + local186 + 32 - Class2_Sub2_Sub2.anInt2438) / 3;
														if (local415 > Class27.anInt1095 * 10) {
															local415 = Class27.anInt1095 * 10;
														}
														if (local415 > local395.anInt1601 - local395.anInt1587 - local395.anInt1609) {
															local415 = local395.anInt1601 - local395.anInt1609 - local395.anInt1587;
														}
														local395.anInt1587 += local415;
														Class2_Sub2_Sub13.anInt1571 -= local415;
													}
												}
											} else if (Class19.anInt481 != 0 && local160 == Class50.anInt1947 && Class30.anInt1171 == local29 + (arg2 << 16)) {
												local282.method1618(local177, local186);
											} else {
												local282.method1624(local177, local186);
											}
											if (local282.anInt2445 == 33 || local35.anIntArray327[local160] != 1) {
												@Pc(543) int local543 = local35.anIntArray327[local160];
												Static70.aClass2_Sub2_Sub2_Sub2_4.method575(Static66.method1172(local543), local177 + local215 + 1, local213 + local186 + 10, 0);
												Static70.aClass2_Sub2_Sub2_Sub2_4.method575(Static66.method1172(local543), local177 + local215, local186 + (9 - -local213), 16776960);
											}
										}
									}
								} else if (local35.anIntArray329 != null && local160 < 20) {
									@Pc(595) Class2_Sub2_Sub2_Sub4 local595 = local35.method1063(local160);
									if (local595 != null) {
										local595.method1624(local177, local186);
									} else if (Class2_Sub2_Sub12_Sub1_Sub1.aBoolean102) {
										local18 = false;
									}
								}
								local160++;
							}
						}
					} else if (local35.anInt1613 == 3) {
						if (Static75.method1354(local35)) {
							local160 = local35.anInt1589;
							if (Static31.method614(arg3, local29) && local35.anInt1583 != 0) {
								local160 = local35.anInt1583;
							}
						} else {
							local160 = local35.anInt1584;
							if (Static31.method614(arg3, local29) && local35.anInt1615 != 0) {
								local160 = local35.anInt1615;
							}
						}
						if (local35.anInt1604 == 0) {
							if (local35.aBoolean131) {
								Static25.method1612(local65, local60, local35.anInt1605, local35.anInt1609, local160);
							} else {
								Static25.method1607(local65, local60, local35.anInt1605, local35.anInt1609, local160);
							}
						} else if (local35.aBoolean131) {
							Static25.method1615(local65, local60, local35.anInt1605, local35.anInt1609, local160, 256 - (local35.anInt1604 & 0xFF));
						} else {
							Static25.method1609(local65, local60, local35.anInt1605, local35.anInt1609, local160, 256 - (local35.anInt1604 & 0xFF));
						}
					} else {
						@Pc(739) Class2_Sub2_Sub2_Sub2 local739;
						@Pc(843) Class40 local843;
						if (local35.anInt1613 == 4) {
							local739 = Static45.aClass2_Sub2_Sub2_Sub2Array9[local35.anInt1568];
							@Pc(742) Class40 local742 = local35.aClass40_466;
							if (Static75.method1354(local35)) {
								local162 = local35.anInt1589;
								if (Static31.method614(arg3, local29) && local35.anInt1583 != 0) {
									local162 = local35.anInt1583;
								}
								if (local35.aClass40_468.method1169() > 0) {
									local742 = local35.aClass40_468;
								}
							} else {
								local162 = local35.anInt1584;
								if (Static31.method614(arg3, local29) && local35.anInt1615 != 0) {
									local162 = local35.anInt1615;
								}
							}
							if (local35.anInt1577 == 6 && Class18_Sub1.aBoolean40) {
								local742 = Class30.aClass40_361;
								local162 = local35.anInt1584;
							}
							if (Static25.anInt2440 == 479) {
								if (local162 == 16776960) {
									local162 = 255;
								}
								if (local162 == 49152) {
									local162 = 16777215;
								}
							}
							local742 = Static4.method94(local35, local742);
							local186 = local739.anInt715 + local60;
							while (local742.method1169() > 0) {
								local215 = local742.method1200(Class2_Sub2_Sub16.aClass40_710);
								if (local215 == -1) {
									local843 = local742;
									local742 = Class34.aClass40_445;
								} else {
									local843 = local742.method1180(local215, 0);
									local742 = local742.method1185(local215 + 2);
								}
								if (local35.aBoolean124) {
									local739.method578(local843, local35.anInt1605 / 2 + local65, local186, local162, local35.aBoolean127);
								} else {
									local739.method574(local843, local65, local186, local162, local35.aBoolean127);
								}
								local186 += local739.anInt715;
							}
						} else if (local35.anInt1613 == 5) {
							@Pc(913) Class2_Sub2_Sub2_Sub4 local913 = local35.method1061(Static75.method1354(local35));
							if (local913 != null) {
								local913.method1624(local65, local60);
							} else if (Class2_Sub2_Sub12_Sub1_Sub1.aBoolean102) {
								local18 = false;
							}
						} else if (local35.anInt1613 == 6) {
							Static6.method177(local35.anInt1605 / 2 + local65, local60 + local35.anInt1609 / 2);
							local160 = local35.anInt1586 * Class2_Sub2_Sub2_Sub1.anIntArray59[local35.anInt1579] >> 16;
							local162 = Class2_Sub2_Sub2_Sub1.anIntArray58[local35.anInt1579] * local35.anInt1586 >> 16;
							@Pc(970) boolean local970 = Static75.method1354(local35);
							if (local970) {
								local177 = local35.anInt1592;
							} else {
								local177 = local35.anInt1574;
							}
							@Pc(992) Class2_Sub2_Sub12_Sub4 local992;
							if (local35.anInt1607 == 5) {
								local992 = Class25.aClass33_1.method1005(-1, -1, null, null);
							} else if (local177 == -1) {
								local992 = local35.method1057(null, local970, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass33_2, -1);
								if (local992 == null && Class2_Sub2_Sub12_Sub1_Sub1.aBoolean102) {
									local18 = false;
								}
							} else {
								@Pc(1002) Class2_Sub2_Sub6 local1002 = Static57.method1042(local177);
								local992 = local35.method1057(local1002, local970, Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass33_2, local35.anInt1569);
								if (local992 == null && Class2_Sub2_Sub12_Sub1_Sub1.aBoolean102) {
									local18 = false;
								}
							}
							if (local992 != null) {
								local992.method1151(local35.anInt1614, 0, local35.anInt1579, 0, local160, local162);
							}
							Static6.method178();
						} else {
							if (local35.anInt1613 == 7) {
								local739 = Static45.aClass2_Sub2_Sub2_Sub2Array9[local35.anInt1568];
								local162 = 0;
								for (local166 = 0; local166 < local35.anInt1609; local166++) {
									for (local177 = 0; local177 < local35.anInt1605; local177++) {
										if (local35.anIntArray331[local162] > 0) {
											@Pc(1088) Class2_Sub2_Sub8 local1088 = Static97.method1669(local35.anIntArray331[local162] - 1);
											@Pc(1091) Class40 local1091 = local1088.aClass40_290;
											if (local1091 == null) {
												local1091 = Class30.aClass40_359;
											}
											if (local1088.aBoolean67 || local35.anIntArray327[local162] != 1) {
												local1091 = Static72.method1334(new Class40[] { local1091, Class35.aClass40_454, Static51.method1542(local35.anIntArray327[local162]) });
											}
											local213 = local65 + (local35.anInt1572 + 115) * local177;
											local222 = local60 + local166 * (local35.anInt1580 + 12);
											if (local35.aBoolean124) {
												local739.method578(local1091, local213 + local35.anInt1605 / 2, local222, local35.anInt1584, local35.aBoolean127);
											} else {
												local739.method574(local1091, local213, local222, local35.anInt1584, local35.aBoolean127);
											}
										}
										local162++;
									}
								}
							}
							if (local35.anInt1613 == 8 && Static89.method1564(arg3, local29) && Class37.anInt1645 == 100) {
								local160 = 0;
								local162 = 0;
								@Pc(1210) Class2_Sub2_Sub2_Sub2 local1210 = Static95.aClass2_Sub2_Sub2_Sub2_5;
								local843 = local35.aClass40_466;
								local843 = Static4.method94(local35, local843);
								@Pc(1231) Class40 local1231;
								while (local843.method1169() > 0) {
									local215 = local843.method1200(Class2_Sub2_Sub16.aClass40_710);
									if (local215 == -1) {
										local1231 = local843;
										local843 = Class34.aClass40_445;
									} else {
										local1231 = local843.method1180(local215, 0);
										local843 = local843.method1185(local215 + 2);
									}
									local213 = local1210.method576(local1231);
									local162 += local1210.anInt715 + 1;
									if (local213 > local160) {
										local160 = local213;
									}
								}
								local162 += 7;
								local160 += 6;
								local213 = local35.anInt1609 + local60 + 5;
								if (arg5 < local213 + local162) {
									local213 = arg5 - local162;
								}
								local215 = local65 + local35.anInt1605 - local160 - 5;
								if (local215 < local65 + 5) {
									local215 = local65 + 5;
								}
								if (local215 + local160 > arg7) {
									local215 = arg7 - local160;
								}
								Static25.method1612(local215, local213, local160, local162, 16777120);
								Static25.method1607(local215, local213, local160, local162, 0);
								local222 = local1210.anInt715 + local213 + 2;
								local843 = local35.aClass40_466;
								local843 = Static4.method94(local35, local843);
								while (local843.method1169() > 0) {
									local257 = local843.method1200(Class2_Sub2_Sub16.aClass40_710);
									if (local257 == -1) {
										local1231 = local843;
										local843 = Class34.aClass40_445;
									} else {
										local1231 = local843.method1180(local257, 0);
										local843 = local843.method1185(local257 + 2);
									}
									local1210.method574(local1231, local215 + 3, local222, 0, false);
									local222 += local1210.anInt715 + 1;
								}
							}
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Lclient!fc;", line = 856)
	public static Class2_Sub2_Sub2_Sub2 method406() {
		@Pc(20) Class2_Sub2_Sub2_Sub2 local20 = new Class2_Sub2_Sub2_Sub2(Static89.anIntArray503, Static61.anIntArray338, Static18.anIntArray86, Static19.anIntArray92, Static83.aByteArrayArray10);
		Static85.method1485();
		return local20;
	}
}
