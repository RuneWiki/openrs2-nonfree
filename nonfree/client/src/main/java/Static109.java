import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] aClass4_Sub2_Sub3_Sub1Array11;

	@OriginalMember(owner = "client!sf", name = "G", descriptor = "[[Lclient!he;")
	public static Class4_Sub5[][] aClass4_Sub5ArrayArray1;

	@OriginalMember(owner = "client!sf", name = "D", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1429 = Static28.method504("Null");

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "[Lclient!we;")
	public static Class81[] aClass81Array1 = new Class81[4];

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "Lclient!jf;")
	public static Class42 aClass42_11 = new Class42(512);

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1430 = Static28.method504("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!sf", name = "S", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1431 = aClass39_1430;

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1432 = Static28.method504(" loggt sich ein)3");

	@OriginalMember(owner = "client!sf", name = "ab", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1435 = Static28.method504("flash1:");

	@OriginalMember(owner = "client!sf", name = "W", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1433 = aClass39_1435;

	@OriginalMember(owner = "client!sf", name = "Z", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1434 = aClass39_1435;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	public static void method1926() {
		aClass81Array1 = null;
		aClass39_1431 = null;
		aClass39_1435 = null;
		aClass4_Sub2_Sub3_Sub1Array11 = null;
		aClass4_Sub5ArrayArray1 = null;
		aClass39_1430 = null;
		aClass39_1433 = null;
		aClass42_11 = null;
		aClass39_1432 = null;
		aClass39_1429 = null;
		aClass39_1434 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIILclient!he;I)V")
	public static void method1927(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4_Sub5 arg5, @OriginalArg(7) int arg6) {
		if (Static102.aBoolean125) {
			Static43.anInt1100 = 32;
		} else {
			Static43.anInt1100 = 0;
		}
		Static102.aBoolean125 = false;
		@Pc(121) int local121;
		if (Static62.anInt1639 != 0) {
			if (arg6 >= arg3 && arg3 + 16 > arg6 && arg4 <= arg1 && arg1 < arg4 + 16) {
				arg5.anInt1214 -= 4;
				Static19.method344(arg5);
			} else if (arg3 <= arg6 && arg3 + 16 > arg6 && arg1 >= arg4 + arg2 - 16 && arg1 < arg4 + arg2) {
				arg5.anInt1214 += 4;
				Static19.method344(arg5);
			} else if (arg6 >= arg3 - Static43.anInt1100 && arg3 + Static43.anInt1100 + 16 > arg6 && arg1 >= arg4 + 16 && arg1 < arg4 + arg2 - 16) {
				local121 = (arg2 - 32) * arg2 / arg0;
				if (local121 < 8) {
					local121 = 8;
				}
				@Pc(134) int local134 = arg2 - local121 - 32;
				@Pc(145) int local145 = arg1 - arg4 - local121 / 2 - 16;
				arg5.anInt1214 = local145 * (arg0 - arg2) / local134;
				Static19.method344(arg5);
				Static102.aBoolean125 = true;
			}
		}
		if (Static83.anInt2076 == 0) {
			return;
		}
		local121 = arg5.anInt1244;
		if (arg3 - local121 <= arg6 && arg4 <= arg1 && arg6 < arg3 + 16 && arg1 <= arg2 + arg4) {
			arg5.anInt1214 += Static83.anInt2076 * 45;
			Static19.method344(arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!he;II)V")
	public static void method1928(@OriginalArg(1) Class4_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt1224 == 1) {
			Static110.method1950(Static72.aClass39_423, arg0.aClass39_723, arg0.anInt1230, 0, 0, 33);
		}
		if (arg0.anInt1224 == 2 && !Static78.aBoolean101) {
			@Pc(44) Class39 local44 = Static46.method767(arg0);
			if (local44 != null) {
				Static110.method1950(Static62.method1123(new Class39[] { Static27.aClass39_392, arg0.aClass39_720 }), local44, arg0.anInt1230, 0, -1, 23);
			}
		}
		if (arg0.anInt1224 == 3) {
			Static110.method1950(Static72.aClass39_423, Static94.aClass39_1138, arg0.anInt1230, 0, 0, 57);
		}
		if (arg0.anInt1224 == 4) {
			Static110.method1950(Static72.aClass39_423, arg0.aClass39_723, arg0.anInt1230, 0, 0, 42);
		}
		if (arg0.anInt1224 == 5) {
			Static110.method1950(Static72.aClass39_423, arg0.aClass39_723, arg0.anInt1230, 0, 0, 47);
		}
		if (arg0.anInt1224 == 6 && Static101.aClass4_Sub5_55 == null) {
			Static110.method1950(Static72.aClass39_423, arg0.aClass39_723, arg0.anInt1230, 0, -1, 15);
		}
		@Pc(162) int local162;
		@Pc(156) int local156;
		if (arg0.anInt1225 == 2) {
			local156 = 0;
			for (@Pc(158) int local158 = 0; local158 < arg0.anInt1259; local158++) {
				for (local162 = 0; local162 < arg0.anInt1244; local162++) {
					@Pc(172) int local172 = local162 * (arg0.anInt1203 + 32);
					@Pc(179) int local179 = (arg0.anInt1196 + 32) * local158;
					if (local156 < 20) {
						local172 += arg0.anIntArray133[local156];
						local179 += arg0.anIntArray128[local156];
					}
					if (local172 <= arg1 && arg2 >= local179 && arg1 < local172 + 32 && arg2 < local179 + 32) {
						Static100.aClass4_Sub5_54 = arg0;
						Static72.anInt800 = local156;
						if (arg0.anIntArray130[local156] > 0) {
							@Pc(247) Class4_Sub2_Sub5 local247 = Static119.method2166(arg0.anIntArray130[local156] - 1);
							if (Static59.anInt1555 == 1 && Static80.method1330(Static20.method385(arg0))) {
								if (arg0.anInt1230 != Static31.anInt818 || local156 != Static36.anInt911) {
									Static110.method1950(Static62.method1123(new Class39[] { Static52.aClass39_764, Static33.aClass39_448, local247.aClass39_352 }), Static31.aClass39_428, arg0.anInt1230, local247.anInt628, local156, 44);
								}
							} else if (!Static78.aBoolean101 || !Static80.method1330(Static20.method385(arg0))) {
								@Pc(310) Class39[] local310 = local247.aClass39Array3;
								if (Static98.aBoolean44) {
									local310 = Static30.method526(local310);
								}
								@Pc(328) int local328;
								@Pc(374) byte local374;
								if (Static80.method1330(Static20.method385(arg0))) {
									for (local328 = 4; local328 >= 3; local328--) {
										if (local310 != null && local310[local328] != null) {
											if (local328 == 3) {
												local374 = 37;
											} else {
												local374 = 40;
											}
											Static110.method1950(Static62.method1123(new Class39[] { Static104.aClass39_1337, local247.aClass39_352 }), local310[local328], arg0.anInt1230, local247.anInt628, local156, local374);
										} else if (local328 == 4) {
											Static110.method1950(Static62.method1123(new Class39[] { Static104.aClass39_1337, local247.aClass39_352 }), Static45.aClass39_697, arg0.anInt1230, local247.anInt628, local156, 40);
										}
									}
								}
								if (Static113.method1983(Static20.method385(arg0))) {
									Static110.method1950(Static62.method1123(new Class39[] { Static104.aClass39_1337, local247.aClass39_352 }), Static31.aClass39_428, arg0.anInt1230, local247.anInt628, local156, 1);
								}
								if (Static80.method1330(Static20.method385(arg0)) && local310 != null) {
									for (local328 = 2; local328 >= 0; local328--) {
										if (local310[local328] != null) {
											local374 = 0;
											if (local328 == 0) {
												local374 = 5;
											}
											if (local328 == 1) {
												local374 = 26;
											}
											if (local328 == 2) {
												local374 = 20;
											}
											Static110.method1950(Static62.method1123(new Class39[] { Static104.aClass39_1337, local247.aClass39_352 }), local310[local328], arg0.anInt1230, local247.anInt628, local156, local374);
										}
									}
								}
								local310 = arg0.aClass39Array10;
								if (Static98.aBoolean44) {
									local310 = Static30.method526(local310);
								}
								if (local310 != null) {
									for (local328 = 4; local328 >= 0; local328--) {
										if (local310[local328] != null) {
											local374 = 0;
											if (local328 == 0) {
												local374 = 21;
											}
											if (local328 == 1) {
												local374 = 19;
											}
											if (local328 == 2) {
												local374 = 8;
											}
											if (local328 == 3) {
												local374 = 43;
											}
											if (local328 == 4) {
												local374 = 29;
											}
											Static110.method1950(Static62.method1123(new Class39[] { Static104.aClass39_1337, local247.aClass39_352 }), local310[local328], arg0.anInt1230, local247.anInt628, local156, local374);
										}
									}
								}
								Static110.method1950(Static62.method1123(new Class39[] { Static104.aClass39_1337, local247.aClass39_352 }), Static32.aClass39_436, arg0.anInt1230, local247.anInt628, local156, 1004);
							} else if ((Static44.anInt1130 & 0x10) == 16) {
								Static110.method1950(Static62.method1123(new Class39[] { Static24.aClass39_299, Static33.aClass39_448, local247.aClass39_352 }), Static104.aClass39_1338, arg0.anInt1230, local247.anInt628, local156, 14);
							}
						}
					}
					local156++;
				}
			}
		}
		if (!arg0.aBoolean63) {
			return;
		}
		if (Static78.aBoolean101) {
			if (Static68.method1174(Static20.method385(arg0)) && (Static44.anInt1130 & 0x20) == 32) {
				Static110.method1950(Static62.method1123(new Class39[] { Static24.aClass39_299, Static106.aClass39_1348, arg0.aClass39_721 }), Static104.aClass39_1338, arg0.anInt1230, 0, arg0.anInt1212, 10);
				return;
			}
			return;
		}
		@Pc(730) Class39 local730;
		for (local156 = 9; local156 >= 5; local156--) {
			local730 = Static108.method1918(arg0, local156);
			if (local730 != null) {
				Static110.method1950(arg0.aClass39_721, local730, arg0.anInt1230, local156 + 1, arg0.anInt1212, 1003);
			}
		}
		local730 = Static46.method767(arg0);
		if (local730 != null) {
			Static110.method1950(arg0.aClass39_721, local730, arg0.anInt1230, 0, arg0.anInt1212, 23);
		}
		for (local162 = 4; local162 >= 0; local162--) {
			@Pc(785) Class39 local785 = Static108.method1918(arg0, local162);
			if (local785 != null) {
				Static110.method1950(arg0.aClass39_721, local785, arg0.anInt1230, local162 + 1, arg0.anInt1212, 13);
			}
		}
		if (Static16.method261(Static20.method385(arg0))) {
			Static110.method1950(Static72.aClass39_423, Static8.aClass39_205, arg0.anInt1230, 0, arg0.anInt1212, 15);
			return;
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)Z")
	public static boolean method1929(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!pd;B)V")
	public static void method1930(@OriginalArg(0) Class20 arg0) {
		Static91.aClass20_45 = arg0;
	}
}
