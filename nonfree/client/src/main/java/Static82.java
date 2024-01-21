import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	public static int anInt1905;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!ua;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
	public static int anInt1909;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_14;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1177 = Static69.method1153("No response from server)3");

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1174 = aClass64_1177;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	public static int anInt1904 = 0;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1175 = Static69.method1153(" )2>");

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1176 = Static69.method1153("Fps:");

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1178 = Static69.method1153(":");

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1179 = Static69.method1153("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[112];

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1180 = Static69.method1153("Benutzen");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!uc;I)V")
	public static void method1374(@OriginalArg(1) Class1_Sub6_Sub1 arg0) {
		while (true) {
			@Pc(17) Class1_Sub11 local17 = (Class1_Sub11) Static49.aClass50_6.method1151();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt2196; local24++) {
				if (local17.aClass48Array2[local24] != null) {
					if (local17.aClass48Array2[local24].anInt1534 == 2) {
						local17.anIntArray326[local24] = -5;
					}
					if (local17.aClass48Array2[local24].anInt1534 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass48Array1[local24] != null) {
					if (local17.aClass48Array1[local24].anInt1534 == 2) {
						local17.anIntArray326[local24] = -6;
					}
					if (local17.aClass48Array1[local24].anInt1534 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method1877(22);
			arg0.method1853(0);
			@Pc(106) int local106 = arg0.anInt2574;
			arg0.method1851(local17.anInt2195);
			for (@Pc(113) int local113 = 0; local113 < local17.anInt2196; local113++) {
				if (local17.anIntArray326[local113] == 0) {
					try {
						@Pc(137) int local137 = local17.anIntArray325[local113];
						@Pc(146) Field local146;
						@Pc(150) int local150;
						if (local137 == 0) {
							local146 = (Field) local17.aClass48Array2[local113].anObject5;
							local150 = local146.getInt(null);
							arg0.method1853(0);
							arg0.method1851(local150);
						} else if (local137 == 1) {
							local146 = (Field) local17.aClass48Array2[local113].anObject5;
							local146.setInt(null, local17.anIntArray324[local113]);
							arg0.method1853(0);
						} else if (local137 == 2) {
							local146 = (Field) local17.aClass48Array2[local113].anObject5;
							local150 = local146.getModifiers();
							arg0.method1853(0);
							arg0.method1851(local150);
						}
						@Pc(223) Method local223;
						if (local137 == 3) {
							local223 = (Method) local17.aClass48Array1[local113].anObject5;
							@Pc(248) byte[][] local248 = local17.aByteArrayArrayArray4[local113];
							@Pc(252) Object[] local252 = new Object[local248.length];
							for (@Pc(254) int local254 = 0; local254 < local248.length; local254++) {
								@Pc(266) ObjectInputStream local266 = new ObjectInputStream(new ByteArrayInputStream(local248[local254]));
								local252[local254] = local266.readObject();
							}
							@Pc(285) Object local285 = local223.invoke(null, local252);
							if (local285 == null) {
								arg0.method1853(0);
							} else if (local285 instanceof Number) {
								arg0.method1853(1);
								arg0.method1830(((Number) local285).longValue());
							} else if (local285 instanceof Class64) {
								arg0.method1853(2);
								arg0.method1827((Class64) local285);
							} else {
								arg0.method1853(4);
							}
						} else if (local137 == 4) {
							local223 = (Method) local17.aClass48Array1[local113].anObject5;
							local150 = local223.getModifiers();
							arg0.method1853(0);
							arg0.method1851(local150);
						}
					} catch (@Pc(328) ClassNotFoundException local328) {
						arg0.method1853(-10);
					} catch (@Pc(334) InvalidClassException local334) {
						arg0.method1853(-11);
					} catch (@Pc(340) StreamCorruptedException local340) {
						arg0.method1853(-12);
					} catch (@Pc(346) OptionalDataException local346) {
						arg0.method1853(-13);
					} catch (@Pc(352) IllegalAccessException local352) {
						arg0.method1853(-14);
					} catch (@Pc(358) IllegalArgumentException local358) {
						arg0.method1853(-15);
					} catch (@Pc(364) InvocationTargetException local364) {
						arg0.method1853(-16);
					} catch (@Pc(370) SecurityException local370) {
						arg0.method1853(-17);
					} catch (@Pc(376) IOException local376) {
						arg0.method1853(-18);
					} catch (@Pc(382) NullPointerException local382) {
						arg0.method1853(-19);
					} catch (@Pc(388) Exception local388) {
						arg0.method1853(-20);
					} catch (@Pc(394) Throwable local394) {
						arg0.method1853(-21);
					}
				} else {
					arg0.method1853(local17.anIntArray326[local113]);
				}
			}
			arg0.method1870(local106);
			arg0.method1866(arg0.anInt2574 - local106);
			local17.method2076();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!f;)V")
	public static void method1375(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		if (Static15.anInt471 == arg0.anInt2370 || arg0.anInt2407 == -1 || arg0.anInt2368 != 0 || arg0.anInt2411 + 1 > Static10.method254(arg0.anInt2407).anIntArray96[arg0.anInt2357]) {
			@Pc(42) int local42 = arg0.anInt2370 - arg0.anInt2403;
			@Pc(52) int local52 = arg0.anInt2366 * 128 + arg0.anInt2395 * 64;
			@Pc(62) int local62 = arg0.anInt2394 * 128 + arg0.anInt2395 * 64;
			@Pc(72) int local72 = arg0.anInt2395 * 64 + arg0.anInt2356 * 128;
			@Pc(78) int local78 = Static15.anInt471 - arg0.anInt2403;
			arg0.anInt2412 = (local72 * local78 + local52 * (local42 - local78)) / local42;
			@Pc(101) int local101 = arg0.anInt2385 * 128 + arg0.anInt2395 * 64;
			arg0.anInt2375 = (local78 * local62 + (local42 - local78) * local101) / local42;
		}
		if (arg0.anInt2388 == 0) {
			arg0.anInt2386 = 1024;
		}
		arg0.anInt2371 = 0;
		if (arg0.anInt2388 == 1) {
			arg0.anInt2386 = 1536;
		}
		if (arg0.anInt2388 == 2) {
			arg0.anInt2386 = 0;
		}
		if (arg0.anInt2388 == 3) {
			arg0.anInt2386 = 512;
		}
		arg0.anInt2363 = arg0.anInt2386;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	public static void method1376() {
		aClass1_Sub1_Sub5_Sub3_14 = null;
		aClass64_1177 = null;
		aClass64_1176 = null;
		aClass68_1 = null;
		aClass64_1178 = null;
		aBooleanArray9 = null;
		aClass64_1179 = null;
		aClass64_1180 = null;
		aClass64_1175 = null;
		aClass64_1174 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([Lclient!nd;IIIIIBIII)Z")
	public static boolean method1377(@OriginalArg(0) Class1_Sub1_Sub11[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static47.method1951(arg7, arg5, arg6, arg2);
		@Pc(12) boolean local12 = true;
		for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
			@Pc(26) Class1_Sub1_Sub11 local26 = arg0[local20];
			if (local26 != null && (arg3 == local26.anInt1739 || arg3 == -1412584499 && Static11.aClass1_Sub1_Sub11_1 == local26)) {
				if (local26.anInt1709 > 0) {
					Static57.method967(local26);
				}
				@Pc(61) int local61 = arg5 + local26.anInt1702 - arg8;
				@Pc(69) int local69 = local26.anInt1690 + arg7 - arg1;
				@Pc(72) int local72 = local26.anInt1726;
				@Pc(120) int local120;
				@Pc(110) int local110;
				@Pc(194) int local194;
				@Pc(183) int local183;
				if (local26 == Static11.aClass1_Sub1_Sub11_1) {
					if (arg3 != -1412584499 && !local26.aBoolean101) {
						Static60.anInt1351 = arg1;
						Static12.aClass1_Sub1_Sub11Array3 = arg0;
						Static6.anInt316 = arg8;
						continue;
					}
					@Pc(95) Class1_Sub1_Sub11 local95 = Static100.method1609(local26);
					if (local95 == null) {
						Static11.aClass1_Sub1_Sub11_1 = null;
					} else {
						@Pc(101) int[] local101 = Static81.method1069(local95);
						@Pc(105) int[] local105 = Static81.method1069(local26);
						local110 = Static63.anInt1474 - Static63.anInt1475;
						if (!local26.aBoolean101) {
							local72 = 128;
						}
						local120 = Static81.anInt1404 - Static51.anInt1205;
						if (local120 <= local26.anInt1731 && -local26.anInt1731 <= local120 && local110 <= local26.anInt1731 && local110 >= -local26.anInt1731 && !Static13.aBoolean33) {
							local110 = 0;
							local120 = 0;
						} else if (Static108.anInt2550 > local26.anInt1708 || Static13.aBoolean33) {
							Static13.aBoolean33 = true;
						} else {
							local110 = 0;
							local120 = 0;
						}
						local183 = local110 + local105[1] - local101[1];
						local194 = local105[0] + local120 - local101[0];
						if (local194 < 0) {
							local194 = 0;
						}
						if (local194 + local26.anInt1700 > local95.anInt1700) {
							local194 = local95.anInt1700 - local26.anInt1700;
						}
						if (local183 < 0) {
							local183 = 0;
						}
						if (local26.anInt1707 + local183 > local95.anInt1707) {
							local183 = local95.anInt1707 - local26.anInt1707;
						}
						local61 = local101[1] + local183;
						local69 = local194 + local101[0];
					}
				}
				if ((!local26.aBoolean95 || local69 <= Static47.anInt2708 && local61 <= Static47.anInt2711 && local26.anInt1700 + local69 >= Static47.anInt2709 && local26.anInt1707 + local61 >= Static47.anInt2710) && (!local26.aBoolean95 || !Static99.method1605(local26))) {
					if (local26.anInt1697 == 0) {
						if (!local26.aBoolean95 && Static99.method1605(local26) && !Static99.method1600(arg4, local20)) {
							continue;
						}
						if (!local26.aBoolean95) {
							if (local26.anInt1689 > local26.anInt1692 - local26.anInt1707) {
								local26.anInt1689 = local26.anInt1692 - local26.anInt1707;
							}
							if (local26.anInt1689 < 0) {
								local26.anInt1689 = 0;
							}
						}
						local12 &= method1377(arg0, local26.anInt1706, local26.anInt1707 + local61, local26.anInt1717, arg4, local61, local26.anInt1700 + local69, local69, local26.anInt1689);
						if (local26.aClass1_Sub1_Sub11Array2 != null) {
							local12 &= method1377(local26.aClass1_Sub1_Sub11Array2, local26.anInt1706, local61 + local26.anInt1707, local26.anInt1717, arg4, local61, local26.anInt1700 + local69, local69, local26.anInt1689);
						}
						Static47.method1951(arg7, arg5, arg6, arg2);
						if (local26.anInt1707 < local26.anInt1692 && !local26.aBoolean95) {
							Static110.method1890(local26.anInt1689, local69 + local26.anInt1700, local26.anInt1692, local26.anInt1707, local61);
						}
					}
					if (local26.anInt1697 != 1) {
						@Pc(500) int local500;
						@Pc(717) int local717;
						@Pc(437) int local437;
						@Pc(439) int local439;
						@Pc(443) int local443;
						if (local26.anInt1697 == 2) {
							local437 = 0;
							for (local439 = 0; local439 < local26.anInt1707; local439++) {
								for (local443 = 0; local443 < local26.anInt1700; local443++) {
									local120 = local69 + local443 * (local26.anInt1688 + 32);
									local110 = local439 * (local26.anInt1740 + 32) + local61;
									if (local437 < 20) {
										local110 += local26.anIntArray250[local437];
										local120 += local26.anIntArray246[local437];
									}
									if (local26.anIntArray245[local437] > 0) {
										local500 = local26.anIntArray245[local437] - 1;
										if (Static47.anInt2709 - 32 < local120 && local120 < Static47.anInt2708 && Static47.anInt2710 - 32 < local110 && Static47.anInt2711 > local110 || Static12.anInt1941 != 0 && Static1.anInt46 == local437) {
											@Pc(572) Class1_Sub1_Sub5_Sub2 local572;
											if (Static121.anInt2872 == 1 && local437 == Static43.anInt969 && local26.anInt1717 == Static67.anInt1531) {
												local572 = Static52.method2081(local500, local26.anIntArray248[local437], 2, 0, false);
											} else {
												local572 = Static52.method2081(local500, local26.anIntArray248[local437], 1, 3153952, false);
											}
											if (local572 == null) {
												local12 = false;
											} else if (Static12.anInt1941 != 0 && local437 == Static1.anInt46 && Static62.anInt1456 == local26.anInt1717) {
												local183 = Static63.anInt1474 - Static41.anInt2677;
												local194 = Static81.anInt1404 - Static12.anInt1939;
												if (local183 < 5 && local183 > -5) {
													local183 = 0;
												}
												if (local194 < 5 && local194 > -5) {
													local194 = 0;
												}
												if (Static71.anInt1618 < 5) {
													local183 = 0;
													local194 = 0;
												}
												local572.method779(local194 + local120, local183 + local110, 128);
												if (arg3 != -1) {
													@Pc(690) Class1_Sub1_Sub11 local690 = arg0[arg3 & 0xFFFF];
													if (Static47.anInt2710 > local110 + local183 && local690.anInt1689 > 0) {
														local717 = (Static47.anInt2710 - local110 - local183) * Static113.anInt1815 / 3;
														if (local717 > Static113.anInt1815 * 10) {
															local717 = Static113.anInt1815 * 10;
														}
														if (local717 > local690.anInt1689) {
															local717 = local690.anInt1689;
														}
														local690.anInt1689 -= local717;
														Static41.anInt2677 += local717;
													}
													if (Static47.anInt2711 < local110 + local183 + 32 && local690.anInt1692 - local690.anInt1707 > local690.anInt1689) {
														local717 = Static113.anInt1815 * (local110 + local183 + 32 - Static47.anInt2711) / 3;
														if (Static113.anInt1815 * 10 < local717) {
															local717 = Static113.anInt1815 * 10;
														}
														if (local690.anInt1692 - local690.anInt1707 - local690.anInt1689 < local717) {
															local717 = local690.anInt1692 - local690.anInt1707 - local690.anInt1689;
														}
														Static41.anInt2677 -= local717;
														local690.anInt1689 += local717;
													}
												}
											} else if (Static117.anInt2816 != 0 && local437 == Static51.anInt1207 && Static101.anInt2269 == local26.anInt1717) {
												local572.method779(local120, local110, 128);
											} else {
												local572.method778(local120, local110);
											}
										}
									} else if (local26.anIntArray251 != null && local437 < 20) {
										@Pc(838) Class1_Sub1_Sub5_Sub2 local838 = local26.method1229(local437);
										if (local838 != null) {
											local838.method778(local120, local110);
										} else if (Static73.aBoolean93) {
											local12 = false;
										}
									}
									local437++;
								}
							}
						} else if (local26.anInt1697 == 3) {
							if (Static79.method1362(local26)) {
								local437 = local26.anInt1741;
								if (Static99.method1600(arg4, local20) && local26.anInt1733 != 0) {
									local437 = local26.anInt1733;
								}
							} else {
								local437 = local26.anInt1682;
								if (Static99.method1600(arg4, local20) && local26.anInt1712 != 0) {
									local437 = local26.anInt1712;
								}
							}
							if (local72 == 0) {
								if (local26.aBoolean106) {
									Static47.method1957(local69, local61, local26.anInt1700, local26.anInt1707, local437);
								} else {
									Static47.method1950(local69, local61, local26.anInt1700, local26.anInt1707, local437);
								}
							} else if (local26.aBoolean106) {
								Static47.method1953(local69, local61, local26.anInt1700, local26.anInt1707, local437, 256 - (local72 & 0xFF));
							} else {
								Static47.method1956(local69, local61, local26.anInt1700, local26.anInt1707, local437, 256 - (local72 & 0xFF));
							}
						} else {
							@Pc(977) Class1_Sub1_Sub5_Sub1 local977;
							if (local26.anInt1697 == 4) {
								local977 = local26.method1222();
								if (local977 != null) {
									@Pc(988) Class64 local988 = local26.aClass64_1064;
									if (Static79.method1362(local26)) {
										local439 = local26.anInt1741;
										if (Static99.method1600(arg4, local20) && local26.anInt1733 != 0) {
											local439 = local26.anInt1733;
										}
										if (local26.aClass64_1067.method1469() > 0) {
											local988 = local26.aClass64_1067;
										}
									} else {
										local439 = local26.anInt1682;
										if (Static99.method1600(arg4, local20) && local26.anInt1712 != 0) {
											local439 = local26.anInt1712;
										}
									}
									if (local26.aBoolean95 && local26.anInt1736 != -1) {
										@Pc(1048) Class1_Sub1_Sub6 local1048 = Static106.method1739(local26.anInt1736);
										local988 = local1048.aClass64_646;
										if (local988 == null) {
											local988 = Static121.aClass64_1850;
										}
										if ((local1048.anInt957 == 1 || local26.anInt1719 != 1) && local26.anInt1719 != -1) {
											local988 = method1383(new Class64[] { local988, Static96.aClass64_1753, Static50.method910(local26.anInt1719) });
										}
									}
									if (local26.anInt1717 == Static15.anInt468 && Static71.anInt1617 == local26.anInt1742) {
										local439 = local26.anInt1682;
										local988 = Static55.aClass64_1811;
									}
									if (Static47.anInt2713 == 479) {
										if (local439 == 16776960) {
											local439 = 255;
										}
										if (local439 == 49152) {
											local439 = 16777215;
										}
									}
									local988 = Static120.method2099(local988, local26);
									local977.method658(local988, local69, local61, local26.anInt1700, local26.anInt1707, local439, local26.aBoolean105, local26.anInt1737, local26.anInt1727, local26.anInt1684);
								} else if (Static73.aBoolean93) {
									local12 = false;
								}
							} else {
								@Pc(1287) int local1287;
								@Pc(1278) int local1278;
								@Pc(1293) int local1293;
								if (local26.anInt1697 == 5) {
									@Pc(1174) Class1_Sub1_Sub5_Sub2 local1174;
									if (local26.aBoolean95) {
										if (local26.anInt1736 == -1) {
											local1174 = local26.method1230(false);
										} else {
											local1174 = Static52.method2081(local26.anInt1736, local26.anInt1719, local26.anInt1738, local26.anInt1751, false);
										}
										if (local1174 != null) {
											local439 = local1174.anInt1022;
											local443 = local1174.anInt1021;
											if (local26.aBoolean98) {
												local110 = local69;
												@Pc(1210) int[] local1210 = new int[4];
												Static47.method1962(local1210);
												if (local69 < local1210[0]) {
													local110 = local1210[0];
												}
												local194 = local61;
												if (local61 < local1210[1]) {
													local194 = local1210[1];
												}
												local183 = local69 + local26.anInt1700;
												if (local183 > local1210[2]) {
													local183 = local1210[2];
												}
												local500 = local26.anInt1707 + local61;
												if (local500 > local1210[3]) {
													local500 = local1210[3];
												}
												Static47.method1951(local110, local194, local183, local500);
												local1278 = (local26.anInt1707 + local443 - 1) / local443;
												local1287 = (local439 + local26.anInt1700 - 1) / local439;
												for (local717 = 0; local717 < local1287; local717++) {
													for (local1293 = 0; local1293 < local1278; local1293++) {
														if (local26.anInt1744 != 0) {
															local1174.method761(local69 + local717 * local439 + local439 / 2, local443 / 2 + local61 + local1293 * local443, local26.anInt1744, 4096);
														} else if (local72 == 0) {
															local1174.method778(local717 * local439 + local69, local1293 * local443 + local61);
														} else {
															local1174.method779(local69 + local439 * local717, local1293 * local443 + local61, 256 - (local72 & 0xFF));
														}
													}
												}
												Static47.method1952(local1210);
											} else {
												local120 = local26.anInt1700 * 4096 / local439;
												if (local26.anInt1744 != 0) {
													local1174.method761(local69 + local26.anInt1700 / 2, local61 - -(local26.anInt1707 / 2), local26.anInt1744, local120);
												} else if (local72 != 0) {
													local1174.method763(local69, local61, local26.anInt1700, local26.anInt1707, 256 - (local72 & 0xFF));
												} else if (local26.anInt1700 == local439 && local443 == local26.anInt1707) {
													local1174.method778(local69, local61);
												} else {
													local1174.method772(local69, local61, local26.anInt1700, local26.anInt1707);
												}
											}
										} else if (Static73.aBoolean93) {
											local12 = false;
										}
									} else {
										local1174 = local26.method1230(Static79.method1362(local26));
										if (local1174 != null) {
											local1174.method778(local69, local61);
										} else if (Static73.aBoolean93) {
											local12 = false;
										}
									}
								} else {
									@Pc(1573) Class1_Sub1_Sub6 local1573;
									if (local26.anInt1697 == 6) {
										@Pc(1488) boolean local1488 = Static79.method1362(local26);
										if (local1488) {
											local439 = local26.anInt1710;
										} else {
											local439 = local26.anInt1695;
										}
										@Pc(1500) Class1_Sub1_Sub2_Sub7 local1500 = null;
										local120 = 0;
										if (local26.anInt1736 != -1) {
											local1573 = Static106.method1739(local26.anInt1736);
											if (local1573 != null) {
												local1573 = local1573.method718(local26.anInt1719);
												local1500 = local1573.method724(1);
												if (local1500 == null) {
													local12 = false;
												} else {
													local1500.method1919();
													local120 = local1500.anInt2678 / 2;
												}
											}
										} else if (local26.anInt1749 == 5) {
											if (local26.anInt1721 == 0) {
												local1500 = Static94.aClass54_1.method1256(-1, null, -1, null);
											} else {
												local1500 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1910();
											}
										} else if (local439 == -1) {
											local1500 = local26.method1224(Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass54_2, local1488, -1, null);
											if (local1500 == null && Static73.aBoolean93) {
												local12 = false;
											}
										} else {
											@Pc(1518) Class1_Sub1_Sub4 local1518 = Static10.method254(local439);
											local1500 = local26.method1224(Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass54_2, local1488, local26.anInt1705, local1518);
											if (local1500 == null && Static73.aBoolean93) {
												local12 = false;
											}
										}
										Static112.method1969(local69 + local26.anInt1700 / 2, local26.anInt1707 / 2 + local61);
										local110 = Class1_Sub1_Sub5_Sub4.anIntArray427[local26.anInt1747] * local26.anInt1686 >> 16;
										local194 = Class1_Sub1_Sub5_Sub4.anIntArray429[local26.anInt1747] * local26.anInt1686 >> 16;
										if (local1500 != null) {
											if (local26.aBoolean95) {
												local1500.method1919();
												if (local26.aBoolean100) {
													local1500.method1928(local26.anInt1752, local26.anInt1696, local26.anInt1747, local26.anInt1745, local110 + local120 + local26.anInt1715, local194 - -local26.anInt1715, local26.anInt1686);
												} else {
													local1500.method1932(local26.anInt1752, local26.anInt1696, local26.anInt1747, local26.anInt1745, local110 + local120 + local26.anInt1715, local194 - -local26.anInt1715);
												}
											} else {
												local1500.method1932(local26.anInt1752, 0, local26.anInt1747, 0, local110, local194);
											}
										}
										Static112.method1970();
									} else {
										if (local26.anInt1697 == 7) {
											local977 = local26.method1222();
											if (local977 == null) {
												if (Static73.aBoolean93) {
													local12 = false;
												}
												continue;
											}
											local439 = 0;
											for (local443 = 0; local443 < local26.anInt1707; local443++) {
												for (local120 = 0; local120 < local26.anInt1700; local120++) {
													if (local26.anIntArray245[local439] > 0) {
														local1573 = Static106.method1739(local26.anIntArray245[local439] - 1);
														@Pc(1755) Class64 local1755 = local1573.aClass64_646;
														if (local1755 == null) {
															local1755 = Static121.aClass64_1850;
														}
														if (local1573.anInt957 == 1 || local26.anIntArray248[local439] != 1) {
															local1755 = method1383(new Class64[] { local1755, Static96.aClass64_1753, Static50.method910(local26.anIntArray248[local439]) });
														}
														local183 = (local26.anInt1688 + 115) * local120 + local69;
														local500 = (local26.anInt1740 + 12) * local443 + local61;
														if (local26.anInt1737 == 0) {
															local977.method666(local1755, local183, local500, local26.anInt1682, local26.aBoolean105);
														} else if (local26.anInt1737 == 1) {
															local977.method663(local1755, local183 + local26.anInt1700 / 2, local500, local26.anInt1682, local26.aBoolean105);
														} else {
															local977.method648(local1755, local183 + local26.anInt1700 - 1, local500, local26.anInt1682, local26.aBoolean105);
														}
													}
													local439++;
												}
											}
										}
										if (local26.anInt1697 == 8 && Static37.method668(local20, arg4) && Static25.anInt2760 == Static95.anInt2166) {
											local437 = 0;
											@Pc(1900) Class1_Sub1_Sub5_Sub1 local1900 = Static3.aClass1_Sub1_Sub5_Sub1_1;
											@Pc(1903) Class64 local1903 = local26.aClass64_1064;
											local1903 = Static120.method2099(local1903, local26);
											local439 = 0;
											@Pc(1928) Class64 local1928;
											while (local1903.method1469() > 0) {
												local194 = local1903.method1473(Static54.aClass64_1317);
												if (local194 == -1) {
													local1928 = local1903;
													local1903 = Static60.aClass64_862;
												} else {
													local1928 = local1903.method1475(local194, 0);
													local1903 = local1903.method1481(local194 + 2);
												}
												local183 = local1900.method653(local1928);
												local439 += local1900.anInt873 + 1;
												if (local437 < local183) {
													local437 = local183;
												}
											}
											local437 += 6;
											local194 = local69 + local26.anInt1700 - local437 - 5;
											local183 = local26.anInt1707 + local61 + 5;
											if (local69 + 5 > local194) {
												local194 = local69 + 5;
											}
											if (local194 + local437 > arg6) {
												local194 = arg6 - local437;
											}
											local439 += 7;
											if (local439 + local183 > arg2) {
												local183 = arg2 - local439;
											}
											Static47.method1957(local194, local183, local437, local439, 16777120);
											Static47.method1950(local194, local183, local437, local439, 0);
											local1903 = local26.aClass64_1064;
											local500 = local183 + local1900.anInt873 + 2;
											local1903 = Static120.method2099(local1903, local26);
											while (local1903.method1469() > 0) {
												local1287 = local1903.method1473(Static54.aClass64_1317);
												if (local1287 == -1) {
													local1928 = local1903;
													local1903 = Static60.aClass64_862;
												} else {
													local1928 = local1903.method1475(local1287, 0);
													local1903 = local1903.method1481(local1287 + 2);
												}
												local1900.method666(local1928, local194 + 3, local500, 0, false);
												local500 += local1900.anInt873 + 1;
											}
										}
										if (local26.anInt1697 == 9) {
											if (local26.anInt1728 == 1) {
												Static47.method1954(local69, local61, local26.anInt1700 + local69, local61 - -local26.anInt1707, local26.anInt1682);
											} else {
												local437 = local26.anInt1700 >= 0 ? local26.anInt1700 : -local26.anInt1700;
												local439 = local26.anInt1707 < 0 ? -local26.anInt1707 : local26.anInt1707;
												local443 = local437;
												if (local439 > local437) {
													local443 = local439;
												}
												if (local443 != 0) {
													local120 = (local26.anInt1700 << 16) / local443;
													local110 = (local26.anInt1707 << 16) / local443;
													if (local110 <= local120) {
														local120 = -local120;
													} else {
														local110 = -local110;
													}
													local194 = local26.anInt1728 * local110 >> 17;
													local183 = local26.anInt1728 * local110 + 1 >> 17;
													local500 = local26.anInt1728 * local120 >> 17;
													local1287 = local120 * local26.anInt1728 + 1 >> 17;
													local1293 = local69 + local26.anInt1700 - local183;
													local1278 = local69 + local194;
													local717 = local69 - local183;
													@Pc(2239) int local2239 = local69 + local26.anInt1700 + local194;
													@Pc(2244) int local2244 = local61 + local500;
													@Pc(2249) int local2249 = local61 - local1287;
													@Pc(2257) int local2257 = local26.anInt1707 + local61 - local1287;
													@Pc(2264) int local2264 = local26.anInt1707 + local61 + local500;
													Static112.method1968(local1278, local717, local1293);
													Static112.method1975(local2244, local2249, local2257, local1278, local717, local1293, local26.anInt1682);
													Static112.method1968(local1278, local1293, local2239);
													Static112.method1975(local2244, local2257, local2264, local1278, local1293, local2239, local26.anInt1682);
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

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B)V")
	public static void method1382(@OriginalArg(1) byte[] arg0) {
		@Pc(6) Class1_Sub6 local6 = new Class1_Sub6(arg0);
		local6.anInt2574 = arg0.length - 2;
		Static98.anInt2198 = local6.method1842();
		Static91.anIntArray303 = new int[Static98.anInt2198];
		Static116.aByteArrayArray8 = new byte[Static98.anInt2198][];
		Static98.anIntArray327 = new int[Static98.anInt2198];
		Static23.anIntArray95 = new int[Static98.anInt2198];
		Static116.anIntArray441 = new int[Static98.anInt2198];
		local6.anInt2574 = arg0.length - Static98.anInt2198 * 8 - 7;
		Static65.anInt1495 = local6.method1842();
		Static1.anInt47 = local6.method1842();
		@Pc(62) int local62 = (local6.method1837() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static98.anInt2198; local64++) {
			Static23.anIntArray95[local64] = local6.method1842();
		}
		for (@Pc(78) int local78 = 0; local78 < Static98.anInt2198; local78++) {
			Static98.anIntArray327[local78] = local6.method1842();
		}
		for (@Pc(99) int local99 = 0; local99 < Static98.anInt2198; local99++) {
			Static91.anIntArray303[local99] = local6.method1842();
		}
		for (@Pc(113) int local113 = 0; local113 < Static98.anInt2198; local113++) {
			Static116.anIntArray441[local113] = local6.method1842();
		}
		local6.anInt2574 = arg0.length - (local62 - 1) * 3 - Static98.anInt2198 * 8 - 7;
		Static25.anIntArray437 = new int[local62];
		for (@Pc(151) int local151 = 1; local151 < local62; local151++) {
			Static25.anIntArray437[local151] = local6.method1868();
			if (Static25.anIntArray437[local151] == 0) {
				Static25.anIntArray437[local151] = 1;
			}
		}
		local6.anInt2574 = 0;
		for (@Pc(183) int local183 = 0; local183 < Static98.anInt2198; local183++) {
			@Pc(189) int local189 = Static91.anIntArray303[local183];
			@Pc(193) int local193 = Static116.anIntArray441[local183];
			@Pc(197) int local197 = local193 * local189;
			@Pc(200) byte[] local200 = new byte[local197];
			Static116.aByteArrayArray8[local183] = local200;
			@Pc(208) int local208 = local6.method1837();
			@Pc(220) int local220;
			if (local208 == 0) {
				for (local220 = 0; local220 < local197; local220++) {
					local200[local220] = local6.method1824();
				}
			} else if (local208 == 1) {
				for (local220 = 0; local220 < local189; local220++) {
					for (@Pc(224) int local224 = 0; local224 < local193; local224++) {
						local200[local189 * local224 + local220] = local6.method1824();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B[Lclient!rd;)Lclient!rd;")
	public static Class64 method1383(@OriginalArg(1) Class64[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static49.method892(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	public static void method1384() {
		Static95.anInt2173 = 0;
		@Pc(74) int local74;
		for (@Pc(9) int local9 = -1; local9 < Static6.anInt319 + Static64.anInt1488; local9++) {
			@Pc(24) Class1_Sub1_Sub2_Sub1 local24;
			if (local9 == -1) {
				local24 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1;
			} else if (Static6.anInt319 > local9) {
				local24 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[Static90.anIntArray69[local9]];
			} else {
				local24 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static13.anIntArray65[local9 - Static6.anInt319]];
			}
			if (local24 != null && local24.method1685()) {
				@Pc(54) Class1_Sub1_Sub15 local54;
				if (local24 instanceof Class1_Sub1_Sub2_Sub1_Sub1) {
					local54 = ((Class1_Sub1_Sub2_Sub1_Sub1) local24).aClass1_Sub1_Sub15_1;
					if (local54.anIntArray339 != null) {
						local54 = local54.method1648();
					}
					if (local54 == null) {
						continue;
					}
				}
				if (Static6.anInt319 <= local9) {
					local54 = ((Class1_Sub1_Sub2_Sub1_Sub1) local24).aClass1_Sub1_Sub15_1;
					if (local54.anIntArray339 != null) {
						local54 = local54.method1648();
					}
					if (local54.anInt2309 >= 0 && local54.anInt2309 < Static54.aClass1_Sub1_Sub5_Sub2Array10.length) {
						Static15.method300(local24, local24.anInt2404 + 15);
						if (Static16.anInt477 > -1) {
							Static54.aClass1_Sub1_Sub5_Sub2Array10[local54.anInt2309].method778(Static16.anInt477 - 12, Static30.anInt788 - 30);
						}
					}
					if (Static96.anInt2744 == 1 && Static13.anIntArray65[local9 - Static6.anInt319] == Static42.anInt936 && Static15.anInt471 % 20 < 10) {
						Static15.method300(local24, local24.anInt2404 + 15);
						if (Static16.anInt477 > -1) {
							Static18.aClass1_Sub1_Sub5_Sub2Array2[0].method778(Static16.anInt477 - 12, Static30.anInt788 + -28);
						}
					}
				} else {
					local74 = 30;
					@Pc(77) Class1_Sub1_Sub2_Sub1_Sub2 local77 = (Class1_Sub1_Sub2_Sub1_Sub2) local24;
					if (local77.anInt2420 != -1 || local77.anInt2432 != -1) {
						Static15.method300(local24, local24.anInt2404 + 15);
						if (Static16.anInt477 > -1) {
							if (local77.anInt2420 != -1) {
								Static14.aClass1_Sub1_Sub5_Sub2Array1[local77.anInt2420].method778(Static16.anInt477 - 12, Static30.anInt788 + -30);
								local74 += 25;
							}
							if (local77.anInt2432 != -1) {
								Static54.aClass1_Sub1_Sub5_Sub2Array10[local77.anInt2432].method778(Static16.anInt477 - 12, -local74 + Static30.anInt788);
								local74 += 25;
							}
						}
					}
					if (local9 >= 0 && Static96.anInt2744 == 10 && Static90.anIntArray69[local9] == Static89.anInt2028) {
						Static15.method300(local24, local24.anInt2404 + 15);
						if (Static16.anInt477 > -1) {
							Static18.aClass1_Sub1_Sub5_Sub2Array2[1].method778(Static16.anInt477 - 12, Static30.anInt788 + -local74);
						}
					}
				}
				if (local24.aClass64_1528 != null && (local9 >= Static6.anInt319 || Static10.anInt406 == 0 || Static10.anInt406 == 3 || Static10.anInt406 == 1 && Static19.method394(((Class1_Sub1_Sub2_Sub1_Sub2) local24).aClass64_1543))) {
					Static15.method300(local24, local24.anInt2404);
					if (Static16.anInt477 > -1 && Static95.anInt2173 < Static9.anInt346) {
						Static9.anIntArray55[Static95.anInt2173] = Static17.aClass1_Sub1_Sub5_Sub1_2.method654(local24.aClass64_1528) / 2;
						Static9.anIntArray50[Static95.anInt2173] = Static17.aClass1_Sub1_Sub5_Sub1_2.anInt873;
						Static9.anIntArray53[Static95.anInt2173] = Static16.anInt477;
						Static9.anIntArray56[Static95.anInt2173] = Static30.anInt788;
						Static9.anIntArray54[Static95.anInt2173] = local24.anInt2365;
						Static9.anIntArray51[Static95.anInt2173] = local24.anInt2374;
						Static9.anIntArray52[Static95.anInt2173] = local24.anInt2405;
						Static9.aClass64Array4[Static95.anInt2173] = local24.aClass64_1528;
						Static95.anInt2173++;
					}
				}
				if (local24.anInt2399 > Static15.anInt471) {
					Static15.method300(local24, local24.anInt2404 + 15);
					if (Static16.anInt477 > -1) {
						local74 = local24.anInt2392 * 30 / local24.anInt2376;
						if (local74 > 30) {
							local74 = 30;
						}
						Static47.method1957(Static16.anInt477 - 15, Static30.anInt788 - 3, local74, 5, 65280);
						Static47.method1957(local74 + Static16.anInt477 - 15, Static30.anInt788 - 3, 30 - local74, 5, 16711680);
					}
				}
				for (local74 = 0; local74 < 4; local74++) {
					if (local24.anIntArray353[local74] > Static15.anInt471) {
						Static15.method300(local24, local24.anInt2404 / 2);
						if (Static16.anInt477 > -1) {
							if (local74 == 1) {
								Static30.anInt788 -= 20;
							}
							if (local74 == 2) {
								Static16.anInt477 -= 15;
								Static30.anInt788 -= 10;
							}
							if (local74 == 3) {
								Static16.anInt477 += 15;
								Static30.anInt788 -= 10;
							}
							Static113.aClass1_Sub1_Sub5_Sub2Array6[local24.anIntArray352[local74]].method778(Static16.anInt477 - 12, Static30.anInt788 - 12);
							Static23.aClass1_Sub1_Sub5_Sub1_3.method665(Static12.method1395(local24.anIntArray351[local74]), Static16.anInt477, Static30.anInt788 + 4, 0);
							Static23.aClass1_Sub1_Sub5_Sub1_3.method665(Static12.method1395(local24.anIntArray351[local74]), Static16.anInt477 - 1, Static30.anInt788 - -3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(502) int local502 = 0; local502 < Static95.anInt2173; local502++) {
			local74 = Static9.anIntArray53[local502];
			@Pc(512) int local512 = Static9.anIntArray56[local502];
			@Pc(516) int local516 = Static9.anIntArray55[local502];
			@Pc(520) int local520 = Static9.anIntArray50[local502];
			@Pc(522) boolean local522 = true;
			while (local522) {
				local522 = false;
				for (@Pc(528) int local528 = 0; local528 < local502; local528++) {
					if (local512 + 2 > -Static9.anIntArray50[local528] + Static9.anIntArray56[local528] && local512 - local520 < Static9.anIntArray56[local528] + 2 && Static9.anIntArray53[local528] + Static9.anIntArray55[local528] > local74 - local516 && Static9.anIntArray53[local528] - Static9.anIntArray55[local528] < local516 + local74 && Static9.anIntArray56[local528] - Static9.anIntArray50[local528] < local512) {
						local512 = Static9.anIntArray56[local528] - Static9.anIntArray50[local528];
						local522 = true;
					}
				}
			}
			Static16.anInt477 = Static9.anIntArray53[local502];
			Static30.anInt788 = Static9.anIntArray56[local502] = local512;
			@Pc(623) Class64 local623 = Static9.aClass64Array4[local502];
			if (Static81.anInt1408 == 0) {
				@Pc(646) int local646 = 16776960;
				if (Static9.anIntArray54[local502] < 6) {
					local646 = Static1.anIntArray9[Static9.anIntArray54[local502]];
				}
				if (Static9.anIntArray54[local502] == 6) {
					local646 = Static89.anInt2034 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static9.anIntArray54[local502] == 7) {
					local646 = Static89.anInt2034 % 20 < 10 ? 255 : 65535;
				}
				if (Static9.anIntArray54[local502] == 8) {
					local646 = Static89.anInt2034 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(719) int local719;
				if (Static9.anIntArray54[local502] == 9) {
					local719 = 150 - Static9.anIntArray52[local502];
					if (local719 < 50) {
						local646 = local719 * 1280 + 16711680;
					} else if (local719 < 100) {
						local646 = 16384000 + 16776960 - local719 * 327680;
					} else if (local719 < 150) {
						local646 = local719 * 5 + 64780;
					}
				}
				if (Static9.anIntArray54[local502] == 10) {
					local719 = 150 - Static9.anIntArray52[local502];
					if (local719 < 50) {
						local646 = local719 * 5 + 16711680;
					} else if (local719 < 100) {
						local646 = 16711935 - (local719 - 50) * 327680;
					} else if (local719 < 150) {
						local646 = local719 * 327680 + 255 + 500 - local719 * 5 - 32768000;
					}
				}
				if (Static9.anIntArray54[local502] == 11) {
					local719 = 150 - Static9.anIntArray52[local502];
					if (local719 < 50) {
						local646 = 16777215 - local719 * 327685;
					} else if (local719 < 100) {
						local646 = (local719 - 50) * 327685 + 65280;
					} else if (local719 < 150) {
						local646 = 49545215 - local719 * 327680;
					}
				}
				if (Static9.anIntArray51[local502] == 0) {
					Static17.aClass1_Sub1_Sub5_Sub1_2.method665(local623, Static16.anInt477, Static30.anInt788 + 1, 0);
					Static17.aClass1_Sub1_Sub5_Sub1_2.method665(local623, Static16.anInt477, Static30.anInt788, local646);
				}
				if (Static9.anIntArray51[local502] == 1) {
					Static17.aClass1_Sub1_Sub5_Sub1_2.method647(local623, Static16.anInt477, Static30.anInt788 + 1, 0, Static89.anInt2034);
					Static17.aClass1_Sub1_Sub5_Sub1_2.method647(local623, Static16.anInt477, Static30.anInt788, local646, Static89.anInt2034);
				}
				if (Static9.anIntArray51[local502] == 2) {
					Static17.aClass1_Sub1_Sub5_Sub1_2.method652(local623, Static16.anInt477, Static30.anInt788 + 1, 0, Static89.anInt2034);
					Static17.aClass1_Sub1_Sub5_Sub1_2.method652(local623, Static16.anInt477, Static30.anInt788, local646, Static89.anInt2034);
				}
				if (Static9.anIntArray51[local502] == 3) {
					Static17.aClass1_Sub1_Sub5_Sub1_2.method659(local623, Static16.anInt477, Static30.anInt788 + 1, 0, Static89.anInt2034, 150 - Static9.anIntArray52[local502]);
					Static17.aClass1_Sub1_Sub5_Sub1_2.method659(local623, Static16.anInt477, Static30.anInt788, local646, Static89.anInt2034, 150 - Static9.anIntArray52[local502]);
				}
				@Pc(990) int local990;
				if (Static9.anIntArray51[local502] == 4) {
					local719 = Static17.aClass1_Sub1_Sub5_Sub1_2.method654(local623);
					local990 = (local719 + 100) * (150 - Static9.anIntArray52[local502]) / 150;
					Static47.method1951(Static16.anInt477 - 50, 0, Static16.anInt477 + 50, 334);
					Static17.aClass1_Sub1_Sub5_Sub1_2.method661(local623, Static16.anInt477 + 50 - local990, Static30.anInt788 - -1, 0);
					Static17.aClass1_Sub1_Sub5_Sub1_2.method661(local623, Static16.anInt477 + 50 - local990, Static30.anInt788, local646);
					Static47.method1949();
				}
				if (Static9.anIntArray51[local502] == 5) {
					local719 = 150 - Static9.anIntArray52[local502];
					Static47.method1951(0, Static30.anInt788 - Static17.aClass1_Sub1_Sub5_Sub1_2.anInt873 - 1, 512, Static30.anInt788 + 5);
					local990 = 0;
					if (local719 < 25) {
						local990 = local719 - 25;
					} else if (local719 > 125) {
						local990 = local719 - 125;
					}
					Static17.aClass1_Sub1_Sub5_Sub1_2.method665(local623, Static16.anInt477, local990 + Static30.anInt788 + 1, 0);
					Static17.aClass1_Sub1_Sub5_Sub1_2.method665(local623, Static16.anInt477, Static30.anInt788 + local990, local646);
					Static47.method1949();
				}
			} else {
				Static17.aClass1_Sub1_Sub5_Sub1_2.method665(local623, Static16.anInt477, Static30.anInt788 + 1, 0);
				Static17.aClass1_Sub1_Sub5_Sub1_2.method665(local623, Static16.anInt477, Static30.anInt788, 16776960);
			}
		}
	}
}
