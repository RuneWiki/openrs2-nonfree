import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!j", name = "K", descriptor = "I")
	public static int anInt2448;

	@OriginalMember(owner = "client!j", name = "F", descriptor = "J")
	public static volatile long aLong70 = 0L;

	@OriginalMember(owner = "client!j", name = "I", descriptor = "Z")
	public static boolean aBoolean91 = false;

	@OriginalMember(owner = "client!j", name = "J", descriptor = "Lclient!rf;")
	public static Class70 aClass70_803 = Static49.method1293("(U1");

	@OriginalMember(owner = "client!j", name = "P", descriptor = "[J")
	public static long[] aLongArray4 = new long[200];

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "Lclient!rf;")
	public static Class70 aClass70_804 = Static49.method1293(")1p");

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)I")
	public static int method1803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIBIIII)I")
	public static int method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg3 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(16) int local16 = arg0;
			arg0 = arg1;
			arg1 = local16;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return 1 + 7 - arg0 - arg4;
		} else if (local7 == 2) {
			return 7 + 1 - arg5 - arg1;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!ig;II)V")
	public static void method1806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) int arg3) {
		Static30.method785();
		Static155.method2998(arg3, arg1, arg3 + arg2.anInt2340, arg2.anInt2369 + arg1);
		if (Static18.anInt491 == 2 || Static18.anInt491 == 5) {
			Static155.method3009(arg3, arg1, arg2.anIntArray230, arg2.anIntArray234);
		} else {
			@Pc(39) int local39 = Static50.anInt1667 + Static71.anInt2223 & 0x7FF;
			@Pc(46) int local46 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 / 32 + 48;
			@Pc(54) int local54 = 464 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 / 32;
			Static60.aClass1_Sub1_Sub1_Sub4_7.method3017(arg3, arg1, arg2.anInt2340, arg2.anInt2369, local46, local54, local39, Static25.anInt692 + 256, arg2.anIntArray230, arg2.anIntArray234);
			@Pc(90) int local90;
			@Pc(104) int local104;
			for (@Pc(74) int local74 = 0; local74 < Static110.anInt3089; local74++) {
				local90 = Static41.anIntArray131[local74] * 4 + 2 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 / 32;
				local104 = Static28.anIntArray54[local74] * 4 + 2 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 / 32;
				Static57.method1408(arg1, arg2, local104, local90, Static114.aClass1_Sub1_Sub1_Sub4Array7[local74], arg3);
			}
			@Pc(152) int local152;
			@Pc(164) int local164;
			for (local90 = 0; local90 < 104; local90++) {
				for (local104 = 0; local104 < 104; local104++) {
					@Pc(138) Class4 local138 = Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local90][local104];
					if (local138 != null) {
						local152 = local90 * 4 + 2 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 / 32;
						local164 = local104 * 4 + 2 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 / 32;
						Static57.method1408(arg1, arg2, local164, local152, Static71.aClass1_Sub1_Sub1_Sub4Array3[0], arg3);
					}
				}
			}
			@Pc(234) int local234;
			for (local104 = 0; local104 < Static86.anInt2582; local104++) {
				@Pc(194) Class1_Sub1_Sub4_Sub2_Sub2 local194 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[Static152.anIntArray208[local104]];
				if (local194 != null && local194.method1517()) {
					@Pc(205) Class1_Sub1_Sub13 local205 = local194.aClass1_Sub1_Sub13_1;
					if (local205 != null && local205.anIntArray318 != null) {
						local205 = local205.method2427();
					}
					if (local205 != null && local205.aBoolean129 && local205.aBoolean128) {
						local234 = local194.anInt2001 / 32 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 / 32;
						local164 = local194.anInt2030 / 32 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 / 32;
						Static57.method1408(arg1, arg2, local234, local164, Static71.aClass1_Sub1_Sub1_Sub4Array3[1], arg3);
					}
				}
			}
			@Pc(269) Class1_Sub1_Sub4_Sub2_Sub1 local269;
			for (@Pc(261) int local261 = 0; local261 < Static104.anInt2960; local261++) {
				local269 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[Static26.anIntArray46[local261]];
				if (local269 != null && local269.method1517()) {
					local164 = local269.anInt2030 / 32 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 / 32;
					@Pc(287) boolean local287 = false;
					local234 = local269.anInt2001 / 32 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 / 32;
					@Pc(305) long local305 = local269.aClass70_408.method2925();
					for (@Pc(307) int local307 = 0; local307 < Static164.anInt4267; local307++) {
						if (aLongArray4[local307] == local305 && Static107.anIntArray296[local307] != 0) {
							local287 = true;
							break;
						}
					}
					@Pc(333) boolean local333 = false;
					if (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt1304 != 0 && local269.anInt1304 != 0 && Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt1304 == local269.anInt1304) {
						local333 = true;
					}
					if (local287) {
						Static57.method1408(arg1, arg2, local234, local164, Static71.aClass1_Sub1_Sub1_Sub4Array3[3], arg3);
					} else if (local333) {
						Static57.method1408(arg1, arg2, local234, local164, Static71.aClass1_Sub1_Sub1_Sub4Array3[4], arg3);
					} else {
						Static57.method1408(arg1, arg2, local234, local164, Static71.aClass1_Sub1_Sub1_Sub4Array3[2], arg3);
					}
				}
			}
			if (Static4.anInt199 != 0 && Static47.anInt1654 % 20 < 10) {
				if (Static4.anInt199 == 1 && Static20.anInt552 >= 0 && Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1.length > Static20.anInt552) {
					@Pc(423) Class1_Sub1_Sub4_Sub2_Sub2 local423 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[Static20.anInt552];
					if (local423 != null) {
						local164 = local423.anInt2030 / 32 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 / 32;
						local234 = local423.anInt2001 / 32 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 / 32;
						Static42.method1038(arg1, Static184.aClass1_Sub1_Sub1_Sub4Array10[1], local164, local234, arg2, arg3);
					}
				}
				if (Static4.anInt199 == 2) {
					local152 = (Static101.anInt2869 - Static154.anInt4068) * 4 + 2 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 / 32;
					local164 = (Static182.anInt4528 - Static64.anInt987) * 4 + 2 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 / 32;
					Static42.method1038(arg1, Static184.aClass1_Sub1_Sub1_Sub4Array10[1], local152, local164, arg2, arg3);
				}
				if (Static4.anInt199 == 10 && Static123.anInt3341 >= 0 && Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1.length > Static123.anInt3341) {
					local269 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[Static123.anInt3341];
					if (local269 != null) {
						local164 = local269.anInt2030 / 32 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 / 32;
						local234 = local269.anInt2001 / 32 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 / 32;
						Static42.method1038(arg1, Static184.aClass1_Sub1_Sub1_Sub4Array10[1], local164, local234, arg2, arg3);
					}
				}
			}
			if (Static105.anInt2980 != 0) {
				local164 = Static144.anInt3806 * 4 + 2 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001 / 32;
				local152 = Static105.anInt2980 * 4 + 2 - Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030 / 32;
				Static57.method1408(arg1, arg2, local164, local152, Static184.aClass1_Sub1_Sub1_Sub4Array10[0], arg3);
			}
			Static155.method3012(arg3 + arg2.anInt2340 / 2 - 1, arg1 - -(arg2.anInt2369 / 2) + -1, 3, 3, 16777215);
		}
		Static26.aBooleanArray3[arg0] = true;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(B)V")
	public static void method1807() {
		aClass70_803 = null;
		aLongArray4 = null;
		aClass70_804 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLclient!dg;II)V")
	public static void method1808(@OriginalArg(1) Class1_Sub1_Sub4_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((arg2 & 0x200) != 0) {
			arg0.anInt2028 = Static98.aClass1_Sub9_Sub1_2.method1240();
			arg0.anInt1998 = Static98.aClass1_Sub9_Sub1_2.method1228();
			arg0.anInt2006 = Static98.aClass1_Sub9_Sub1_2.method1268();
			arg0.anInt2014 = Static98.aClass1_Sub9_Sub1_2.method1228();
			arg0.anInt1996 = Static98.aClass1_Sub9_Sub1_2.method1257() + Static47.anInt1654;
			arg0.anInt2048 = Static98.aClass1_Sub9_Sub1_2.method1277() + Static47.anInt1654;
			arg0.anInt2005 = Static98.aClass1_Sub9_Sub1_2.method1240();
			arg0.anInt2037 = 0;
			arg0.anInt2021 = 1;
		}
		@Pc(60) int local60;
		@Pc(64) int local64;
		if ((arg2 & 0x100) != 0) {
			local60 = Static98.aClass1_Sub9_Sub1_2.method1228();
			local64 = Static98.aClass1_Sub9_Sub1_2.method1228();
			arg0.method1520(Static47.anInt1654, local64, local60);
		}
		if ((arg2 & 0x2) != 0) {
			local60 = Static98.aClass1_Sub9_Sub1_2.method1240();
			@Pc(83) byte[] local83 = new byte[local60];
			@Pc(88) Class1_Sub9 local88 = new Class1_Sub9(local83);
			Static98.aClass1_Sub9_Sub1_2.method1235(local60, local83);
			Static42.aClass1_Sub9Array1[arg1] = local88;
			arg0.method959(local88);
		}
		if ((arg2 & 0x40) != 0) {
			local60 = Static98.aClass1_Sub9_Sub1_2.method1240();
			local64 = Static98.aClass1_Sub9_Sub1_2.method1228();
			arg0.method1520(Static47.anInt1654, local64, local60);
			arg0.anInt2039 = Static47.anInt1654 + 300;
			arg0.anInt2002 = Static98.aClass1_Sub9_Sub1_2.method1234();
		}
		if ((arg2 & 0x400) != 0) {
			arg0.anInt2051 = Static98.aClass1_Sub9_Sub1_2.method1257();
			local60 = Static98.aClass1_Sub9_Sub1_2.method1266();
			if (arg0.anInt2051 == 65535) {
				arg0.anInt2051 = -1;
			}
			arg0.anInt2036 = Static47.anInt1654 + (local60 & 0xFFFF);
			arg0.anInt2035 = local60 >> 16;
			arg0.anInt2033 = 0;
			arg0.anInt2018 = 0;
			if (Static47.anInt1654 < arg0.anInt2036) {
				arg0.anInt2018 = -1;
			}
		}
		if ((arg2 & 0x20) != 0) {
			arg0.aClass70_631 = Static98.aClass1_Sub9_Sub1_2.method1253();
			if (arg0.aClass70_631.method2899(0) == 126) {
				arg0.aClass70_631 = arg0.aClass70_631.method2906(1);
				Static41.method1036(arg0.aClass70_631, arg0.aClass70_408, 2);
			} else if (arg0 == Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1) {
				Static41.method1036(arg0.aClass70_631, arg0.aClass70_408, 2);
			}
			arg0.anInt2046 = 0;
			arg0.anInt2019 = 0;
			arg0.anInt1995 = 150;
		}
		if ((arg2 & 0x80) != 0) {
			local60 = Static98.aClass1_Sub9_Sub1_2.method1239();
			if (local60 == 65535) {
				local60 = -1;
			}
			local64 = Static98.aClass1_Sub9_Sub1_2.method1268();
			Static37.method958(local60, local64, arg0);
		}
		if ((arg2 & 0x1) != 0) {
			arg0.anInt2050 = Static98.aClass1_Sub9_Sub1_2.method1277();
			if (arg0.anInt2050 == 65535) {
				arg0.anInt2050 = -1;
			}
		}
		if ((arg2 & 0x4) != 0) {
			arg0.anInt1997 = Static98.aClass1_Sub9_Sub1_2.method1280();
			arg0.anInt2023 = Static98.aClass1_Sub9_Sub1_2.method1277();
		}
		if ((arg2 & 0x8) == 0) {
			return;
		}
		local60 = Static98.aClass1_Sub9_Sub1_2.method1239();
		local64 = Static98.aClass1_Sub9_Sub1_2.method1240();
		@Pc(328) int local328 = Static98.aClass1_Sub9_Sub1_2.method1240();
		@Pc(331) int local331 = Static98.aClass1_Sub9_Sub1_2.anInt1592;
		if (arg0.aClass70_408 != null && arg0.aClass49_1 != null) {
			@Pc(339) boolean local339 = false;
			@Pc(344) long local344 = arg0.aClass70_408.method2925();
			if (local64 <= 1) {
				for (@Pc(351) int local351 = 0; local351 < Static25.anInt695; local351++) {
					if (Static120.aLongArray7[local351] == local344) {
						local339 = true;
						break;
					}
				}
			}
			if (!local339 && Static90.anInt2638 == 0) {
				Static176.aClass1_Sub9_4.anInt1592 = 0;
				Static98.aClass1_Sub9_Sub1_2.method1270(Static176.aClass1_Sub9_4.aByteArray25, local328);
				Static176.aClass1_Sub9_4.anInt1592 = 0;
				@Pc(399) Class70 local399 = Static76.method2394(Static31.method794(Static176.aClass1_Sub9_4).method2904());
				arg0.aClass70_631 = local399.method2919();
				arg0.anInt2019 = local60 >> 8;
				arg0.anInt1995 = 150;
				arg0.anInt2046 = local60 & 0xFF;
				if (local64 == 2 || local64 == 3) {
					Static41.method1036(local399, Static160.method3210(new Class70[] { Static37.aClass70_417, arg0.aClass70_408 }), 1);
				} else if (local64 == 1) {
					Static41.method1036(local399, Static160.method3210(new Class70[] { Static26.aClass70_248, arg0.aClass70_408 }), 1);
				} else {
					Static41.method1036(local399, arg0.aClass70_408, 2);
				}
			}
		}
		Static98.aClass1_Sub9_Sub1_2.anInt1592 = local331 + local328;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(II)I")
	public static int method1809(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub1_Sub12 local9 = Static121.method2473(arg0);
		@Pc(12) int local12 = local9.anInt2708;
		@Pc(15) int local15 = local9.anInt2714;
		@Pc(26) int local26 = local9.anInt2713;
		@Pc(33) int local33 = Class1_Sub21.anIntArray359[local26 - local15];
		return Static133.anIntArray330[local12] >> local15 & local33;
	}
}
