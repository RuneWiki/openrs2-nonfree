import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	public static int anInt3199;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1334 = Static59.method1195("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1336 = Static59.method1195("To play on this world move to a free area first");

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1335 = aClass60_1336;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "[I")
	public static int[] anIntArray339 = new int[500];

	@OriginalMember(owner = "client!te", name = "k", descriptor = "I")
	public static int anInt3204 = 0;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	public static int anInt3205 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIBII[Lclient!mf;I)V")
	public static void method2114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class3_Sub15[] arg8, @OriginalArg(10) int arg9) {
		for (@Pc(3) int local3 = 0; local3 < arg8.length; local3++) {
			@Pc(9) Class3_Sub15 local9 = arg8[local3];
			if (local9 != null && (local9.anInt2296 == 0 || local9.aBoolean77) && local9 != null && arg2 == local9.anInt2306 && !method2119(local9)) {
				@Pc(37) int local37 = arg0 + local9.anInt2291 - arg9;
				@Pc(44) int local44 = arg4 + local9.anInt2243 - arg1;
				@Pc(49) int local49 = local9.anInt2304 + local37;
				@Pc(55) int local55 = local44 + local9.anInt2270;
				@Pc(62) int local62 = local37 <= arg0 ? arg0 : local37;
				@Pc(73) int local73 = arg4 >= local44 ? arg4 : local44;
				@Pc(80) int local80 = arg5 <= local49 ? arg5 : local49;
				@Pc(91) int local91 = local55 < arg3 ? local55 : arg3;
				if (local9.anInt2296 == 0) {
					method2114(local62, local9.anInt2241 + local73 - local44, local9.anInt2286, local91, local73, local80, arg6, arg7, arg8, local9.anInt2273 + local62 - local37);
					if (local9.aClass3_Sub15Array2 != null) {
						method2114(local62, local73 + local9.anInt2241 - local44, local9.anInt2286, local91, local73, local80, arg6, arg7, local9.aClass3_Sub15Array2, local9.anInt2273 + local62 - local37);
					}
				}
				if (local9.aBoolean77) {
					@Pc(166) boolean local166;
					if (Static122.anInt720 >= local62 && Static12.anInt374 >= local73 && local80 > Static122.anInt720 && Static12.anInt374 < local91) {
						local166 = true;
					} else {
						local166 = false;
					}
					@Pc(172) boolean local172 = false;
					if (Static129.anInt3467 == 1 && local166) {
						local172 = true;
					}
					@Pc(181) boolean local181 = false;
					if (Static112.anInt3110 == 1 && Static130.anInt3486 >= local62 && local73 <= Static84.anInt2576 && local80 > Static130.anInt3486 && Static84.anInt2576 < local91) {
						local181 = true;
					}
					if (local181 && Static100.anInt2955 == -1 && (arg7 & 0x200) != 0 && !Static67.aBoolean69 && Static86.method1065(local9) != null) {
						Static54.anInt1751 = Static130.anInt3486 - local62;
						Static53.anInt1742 = Static84.anInt2576 - local73;
						Static22.aBoolean28 = false;
						Static24.anInt931 = local9.anInt2283;
						Static29.anInt1009 = arg6;
						Static100.anInt2955 = local9.anInt2286;
						Static83.anInt2569 = 0;
					}
					if (Static100.anInt2955 != -1 || Static67.aBoolean69) {
						local166 = false;
						local181 = false;
						local172 = false;
					}
					if (!local9.aBoolean74 && local181 && (arg7 & 0x1) != 0) {
						local9.aBoolean74 = true;
						if (local9.anObjectArray20 != null) {
							Static12.method335(local9.anObjectArray20, local9, Static84.anInt2576 - local44, -local37 + Static130.anInt3486, null, 0);
						}
					}
					if (local9.aBoolean74 && local172 && (arg7 & 0x4) != 0 && local9.anObjectArray11 != null) {
						Static12.method335(local9.anObjectArray11, local9, Static12.anInt374 - local44, Static122.anInt720 - local37, null, 0);
					}
					if (local9.aBoolean74 && !local172 && (arg7 & 0x2) != 0) {
						local9.aBoolean74 = false;
						if (local9.anObjectArray3 != null) {
							Static12.method335(local9.anObjectArray3, local9, Static12.anInt374 - local44, Static122.anInt720 + -local37, null, 0);
						}
					}
					if (local172 && (arg7 & 0x8) != 0 && local9.anObjectArray13 != null) {
						Static12.method335(local9.anObjectArray13, local9, Static12.anInt374 - local44, -local37 + Static122.anInt720, null, 0);
					}
					if (!local9.aBoolean79 && local166 && (arg7 & 0x10) != 0) {
						local9.aBoolean79 = true;
						if (local9.anObjectArray7 != null) {
							Static12.method335(local9.anObjectArray7, local9, Static12.anInt374 - local44, -local37 + Static122.anInt720, null, 0);
						}
					}
					if (local9.aBoolean79 && local166 && (arg7 & 0x40) != 0 && local9.anObjectArray5 != null) {
						Static12.method335(local9.anObjectArray5, local9, Static12.anInt374 - local44, -local37 + Static122.anInt720, null, 0);
					}
					if (local9.aBoolean79 && !local166 && (arg7 & 0x20) != 0) {
						local9.aBoolean79 = false;
						if (local9.anObjectArray8 != null) {
							Static12.method335(local9.anObjectArray8, local9, Static12.anInt374 - local44, -local37 + Static122.anInt720, null, 0);
						}
					}
					if (local9.anObjectArray19 != null && (arg7 & 0x80) != 0) {
						Static12.method335(local9.anObjectArray19, local9, 0, 0, null, 0);
					}
					if (local166 && Static105.anInt3025 != 0 && local9.anObjectArray15 != null && (arg7 & 0x400) != 0) {
						Static12.method335(local9.anObjectArray15, local9, Static105.anInt3025, 0, null, 0);
					}
					if ((arg7 & 0x100) != 0) {
						@Pc(530) int local530;
						@Pc(538) int local538;
						@Pc(540) int local540;
						if (local9.anObjectArray9 != null && local9.anInt2258 < Static80.anInt2518) {
							if (local9.anIntArray232 == null || Static80.anInt2518 - local9.anInt2258 > 32) {
								Static12.method335(local9.anObjectArray9, local9, 0, 0, null, 0);
							} else {
								label265: for (local530 = local9.anInt2258; local530 < Static80.anInt2518; local530++) {
									local538 = Static31.anIntArray131[local530 & 0x1F];
									for (local540 = 0; local540 < local9.anIntArray232.length; local540++) {
										if (local538 == local9.anIntArray232[local540]) {
											Static12.method335(local9.anObjectArray9, local9, 0, 0, null, 0);
											break label265;
										}
									}
								}
							}
							local9.anInt2258 = Static80.anInt2518;
						}
						if (local9.anObjectArray21 != null && Static75.anInt2407 > local9.anInt2278) {
							if (local9.anIntArray226 == null || Static75.anInt2407 - local9.anInt2278 > 32) {
								Static12.method335(local9.anObjectArray21, local9, 0, 0, null, 0);
							} else {
								label245: for (local530 = local9.anInt2278; local530 < Static75.anInt2407; local530++) {
									local538 = Static10.anIntArray49[local530 & 0x1F];
									for (local540 = 0; local540 < local9.anIntArray226.length; local540++) {
										if (local9.anIntArray226[local540] == local538) {
											Static12.method335(local9.anObjectArray21, local9, 0, 0, null, 0);
											break label245;
										}
									}
								}
							}
							local9.anInt2278 = Static75.anInt2407;
						}
						if (local9.anObjectArray16 != null && local9.anInt2247 < Static113.anInt3158) {
							if (local9.anIntArray234 == null || Static113.anInt3158 - local9.anInt2247 > 32) {
								Static12.method335(local9.anObjectArray16, local9, 0, 0, null, 0);
							} else {
								label225: for (local530 = local9.anInt2247; local530 < Static113.anInt3158; local530++) {
									local538 = Static85.anIntArray271[local530 & 0x1F];
									for (local540 = 0; local540 < local9.anIntArray234.length; local540++) {
										if (local9.anIntArray234[local540] == local538) {
											Static12.method335(local9.anObjectArray16, local9, 0, 0, null, 0);
											break label225;
										}
									}
								}
							}
							local9.anInt2247 = Static113.anInt3158;
						}
						if (local9.anObjectArray12 != null && Static78.anInt2431 > local9.anInt2237) {
							Static12.method335(local9.anObjectArray12, local9, 0, 0, null, 0);
						}
						local9.anInt2237 = Static34.anInt1183;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method2115() {
		try {
			if (Static30.anInt1040 == 0) {
				if (Static104.aClass47_3 != null) {
					Static104.aClass47_3.method1564();
					Static104.aClass47_3 = null;
				}
				Static119.anInt3238 = 0;
				Static62.aBoolean67 = false;
				Static30.anInt1040 = 1;
				Static53.aClass7_3 = null;
			}
			if (Static30.anInt1040 == 1) {
				if (Static53.aClass7_3 == null) {
					Static53.aClass7_3 = Static35.aClass74_1.method2126(Static102.aString2, Static70.anInt2201);
				}
				if (Static53.aClass7_3.anInt148 == 2) {
					throw new IOException();
				}
				if (Static53.aClass7_3.anInt148 == 1) {
					Static104.aClass47_3 = new Class47((Socket) Static53.aClass7_3.anObject1, Static35.aClass74_1);
					Static30.anInt1040 = 2;
					Static53.aClass7_3 = null;
				}
			}
			if (Static30.anInt1040 == 2) {
				@Pc(71) long local71 = Static68.aLong77 = Static105.aClass60_1281.method1863();
				@Pc(78) int local78 = (int) (local71 >> 16 & 0x1FL);
				Static81.aClass3_Sub12_Sub1_2.anInt2886 = 0;
				Static81.aClass3_Sub12_Sub1_2.method1937(14);
				Static81.aClass3_Sub12_Sub1_2.method1937(local78);
				Static104.aClass47_3.method1562(Static81.aClass3_Sub12_Sub1_2.aByteArray77, 2);
				Static79.aClass3_Sub12_Sub1_1.anInt2886 = 0;
				Static30.anInt1040 = 3;
			}
			@Pc(120) int local120;
			if (Static30.anInt1040 == 3) {
				if (Static99.aClass34_2 != null) {
					Static99.aClass34_2.method1716();
				}
				if (Static73.aClass34_1 != null) {
					Static73.aClass34_1.method1716();
				}
				local120 = Static104.aClass47_3.method1558();
				if (Static99.aClass34_2 != null) {
					Static99.aClass34_2.method1716();
				}
				if (Static73.aClass34_1 != null) {
					Static73.aClass34_1.method1716();
				}
				if (local120 != 0) {
					Static125.method2256(local120);
					return;
				}
				Static30.anInt1040 = 4;
				Static79.aClass3_Sub12_Sub1_1.anInt2886 = 0;
			}
			if (Static30.anInt1040 == 4) {
				if (Static79.aClass3_Sub12_Sub1_1.anInt2886 < 8) {
					local120 = Static104.aClass47_3.method1557();
					if (8 - Static79.aClass3_Sub12_Sub1_1.anInt2886 < local120) {
						local120 = 8 - Static79.aClass3_Sub12_Sub1_1.anInt2886;
					}
					if (local120 > 0) {
						Static104.aClass47_3.method1555(local120, Static79.aClass3_Sub12_Sub1_1.anInt2886, Static79.aClass3_Sub12_Sub1_1.aByteArray77);
						Static79.aClass3_Sub12_Sub1_1.anInt2886 += local120;
					}
				}
				if (Static79.aClass3_Sub12_Sub1_1.anInt2886 == 8) {
					Static79.aClass3_Sub12_Sub1_1.anInt2886 = 0;
					Static105.aLong98 = Static79.aClass3_Sub12_Sub1_1.method1952();
					Static30.anInt1040 = 5;
				}
			}
			if (Static30.anInt1040 == 5) {
				Static81.aClass3_Sub12_Sub1_2.anInt2886 = 0;
				@Pc(222) int[] local222 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static105.aLong98 >> 32), (int) Static105.aLong98 };
				Static81.aClass3_Sub12_Sub1_2.method1937(10);
				Static81.aClass3_Sub12_Sub1_2.method1966(local222[0]);
				Static81.aClass3_Sub12_Sub1_2.method1966(local222[1]);
				Static81.aClass3_Sub12_Sub1_2.method1966(local222[2]);
				Static81.aClass3_Sub12_Sub1_2.method1966(local222[3]);
				Static81.aClass3_Sub12_Sub1_2.method1966(Static35.aClass74_1.anInt3207);
				Static81.aClass3_Sub12_Sub1_2.method1972(Static105.aClass60_1281.method1863());
				Static81.aClass3_Sub12_Sub1_2.method1929(Static105.aClass60_1276);
				Static81.aClass3_Sub12_Sub1_2.method1957(Static104.aBigInteger2, Static27.aBigInteger1);
				Static101.aClass3_Sub12_Sub1_3.anInt2886 = 0;
				if (Static39.anInt1303 == 40) {
					Static101.aClass3_Sub12_Sub1_3.method1937(18);
				} else {
					Static101.aClass3_Sub12_Sub1_3.method1937(16);
				}
				Static101.aClass3_Sub12_Sub1_3.method1937(Static81.aClass3_Sub12_Sub1_2.anInt2886 + 69);
				Static101.aClass3_Sub12_Sub1_3.method1966(459);
				Static101.aClass3_Sub12_Sub1_3.method1937(Static14.aBoolean15 ? 1 : 0);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static68.aClass25_Sub1_11.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static82.aClass25_Sub1_12.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static100.aClass25_Sub1_14.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static51.aClass25_Sub1_6.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static26.aClass25_Sub1_4.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static112.aClass25_Sub1_17.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static41.aClass25_Sub1_7.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static55.aClass25_Sub1_8.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static113.aClass25_Sub1_18.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static24.aClass25_Sub1_3.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static64.aClass25_Sub1_9.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static16.aClass25_Sub1_1.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static117.aClass25_Sub1_19.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static100.aClass25_Sub1_15.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static66.aClass25_Sub1_10.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1966(Static98.aClass25_Sub1_13.anInt1358);
				Static101.aClass3_Sub12_Sub1_3.method1965(Static81.aClass3_Sub12_Sub1_2.aByteArray77, Static81.aClass3_Sub12_Sub1_2.anInt2886);
				Static104.aClass47_3.method1562(Static101.aClass3_Sub12_Sub1_3.aByteArray77, Static101.aClass3_Sub12_Sub1_3.anInt2886);
				Static81.aClass3_Sub12_Sub1_2.method1978(local222);
				for (@Pc(454) int local454 = 0; local454 < 4; local454++) {
					local222[local454] += 50;
				}
				Static79.aClass3_Sub12_Sub1_1.method1978(local222);
				Static30.anInt1040 = 6;
			}
			if (Static30.anInt1040 == 6 && Static104.aClass47_3.method1557() > 0) {
				local120 = Static104.aClass47_3.method1558();
				if (local120 == 21 && Static39.anInt1303 == 20) {
					Static30.anInt1040 = 7;
				} else if (local120 == 2) {
					Static30.anInt1040 = 9;
				} else if (local120 == 15 && Static39.anInt1303 == 40) {
					Static60.method1214();
					return;
				} else if (local120 == 23 && Static34.anInt1182 < 1) {
					Static30.anInt1040 = 0;
					Static34.anInt1182++;
				} else {
					Static125.method2256(local120);
					return;
				}
			}
			if (Static30.anInt1040 == 7 && Static104.aClass47_3.method1557() > 0) {
				Static81.anInt2541 = Static104.aClass47_3.method1558() * 60 + 180;
				Static30.anInt1040 = 8;
			}
			if (Static30.anInt1040 == 8) {
				Static119.anInt3238 = 0;
				Static29.method665(Static33.aClass60_444, Static60.method1211(new Class60[] { Static65.method1341(Static81.anInt2541 / 60), Static98.aClass60_1208 }), Static20.aClass60_308);
				if (--Static81.anInt2541 <= 0) {
					Static30.anInt1040 = 0;
				}
			} else {
				if (Static30.anInt1040 == 9 && Static104.aClass47_3.method1557() >= 8) {
					Static97.anInt2774 = Static104.aClass47_3.method1558();
					Static61.aBoolean63 = Static104.aClass47_3.method1558() == 1;
					Static34.anInt1184 = Static104.aClass47_3.method1558();
					Static34.anInt1184 <<= 0x8;
					Static34.anInt1184 += Static104.aClass47_3.method1558();
					Static11.anInt340 = Static104.aClass47_3.method1558();
					Static104.aClass47_3.method1555(1, 0, Static79.aClass3_Sub12_Sub1_1.aByteArray77);
					Static79.aClass3_Sub12_Sub1_1.anInt2886 = 0;
					Static21.anInt867 = Static79.aClass3_Sub12_Sub1_1.method1981();
					Static104.aClass47_3.method1555(2, 0, Static79.aClass3_Sub12_Sub1_1.aByteArray77);
					Static79.aClass3_Sub12_Sub1_1.anInt2886 = 0;
					Static58.anInt1794 = Static79.aClass3_Sub12_Sub1_1.method1963();
					Static30.anInt1040 = 10;
				}
				if (Static30.anInt1040 != 10) {
					Static119.anInt3238++;
					if (Static119.anInt3238 > 2000) {
						if (Static34.anInt1182 < 1) {
							if (Static70.anInt2201 == Static104.anInt3005) {
								Static70.anInt2201 = Static11.anInt347;
							} else {
								Static70.anInt2201 = Static104.anInt3005;
							}
							Static30.anInt1040 = 0;
							Static34.anInt1182++;
						} else {
							Static125.method2256(-3);
						}
					}
				} else if (Static104.aClass47_3.method1557() >= Static58.anInt1794) {
					Static79.aClass3_Sub12_Sub1_1.anInt2886 = 0;
					Static104.aClass47_3.method1555(Static58.anInt1794, 0, Static79.aClass3_Sub12_Sub1_1.aByteArray77);
					Static60.method1209();
					Static2.anInt118 = -1;
					Static104.method2020(false);
					Static21.anInt867 = -1;
				}
			}
		} catch (@Pc(739) IOException local739) {
			if (Static34.anInt1182 < 1) {
				Static34.anInt1182++;
				if (Static104.anInt3005 == Static70.anInt2201) {
					Static70.anInt2201 = Static11.anInt347;
				} else {
					Static70.anInt2201 = Static104.anInt3005;
				}
				Static30.anInt1040 = 0;
			} else {
				Static125.method2256(-2);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)I")
	public static int method2116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(10) int local10 = arg0;
			arg0 = arg2;
			arg2 = local10;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg0 - arg1;
		} else {
			return 1 + 7 - arg2 - arg3;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public static void method2117() {
		anIntArray339 = null;
		aClass60_1334 = null;
		aClass60_1335 = null;
		aClass60_1336 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
	public static boolean method2118(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!mf;)Z")
	public static boolean method2119(@OriginalArg(1) Class3_Sub15 arg0) {
		if (Static118.aBoolean116) {
			if (Static33.method751(arg0) != 0) {
				return false;
			}
			if (arg0.anInt2296 == 0) {
				return false;
			}
		}
		return arg0.aBoolean84;
	}
}
