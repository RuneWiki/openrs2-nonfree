import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public static int anInt2354;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "J")
	public static long aLong81;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
	public static int anInt2355;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!v;")
	public static Class76 aClass76_1109 = Static134.method2017("scape main");

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public static int anInt2352 = 0;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "Lclient!v;")
	public static Class76 aClass76_1110 = Static134.method2017("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
	public static int anInt2357 = 0;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
	public static int anInt2358 = 1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!lc;III)V")
	public static void method1615(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static10.anInt206 >= 400) {
			return;
		}
		if (arg1.anIntArray231 != null) {
			arg1 = arg1.method1124();
		}
		if (arg1 == null || !arg1.aBoolean105) {
			return;
		}
		@Pc(28) Class76 local28 = arg1.aClass76_716;
		if (arg1.anInt1696 != 0) {
			local28 = Static59.method1017(new Class76[] { local28, Static117.method1785(arg1.anInt1696, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1461), Static25.aClass76_222, Static14.aClass76_121, Static63.method1092(arg1.anInt1696), Static96.aClass76_1015 });
		}
		if (Static39.anInt1125 == 1) {
			Static79.method551(16, arg0, arg2, arg3, Static73.aClass76_814, Static59.method1017(new Class76[] { Static49.aClass76_557, Static88.aClass76_930, local28 }));
		} else if (!Static18.aBoolean21) {
			@Pc(82) Class76[] local82 = arg1.aClass76Array17;
			if (Static55.aBoolean83) {
				local82 = Static63.method1091(local82);
			}
			@Pc(92) int local92;
			if (local82 != null) {
				for (local92 = 4; local92 >= 0; local92--) {
					if (local82[local92] != null && !local82[local92].method1882(Static104.aClass76_1092)) {
						@Pc(111) byte local111 = 0;
						if (local92 == 0) {
							local111 = 40;
						}
						if (local92 == 1) {
							local111 = 21;
						}
						if (local92 == 2) {
							local111 = 37;
						}
						if (local92 == 3) {
							local111 = 5;
						}
						if (local92 == 4) {
							local111 = 35;
						}
						Static79.method551(local111, arg0, arg2, arg3, local82[local92], Static59.method1017(new Class76[] { Static6.aClass76_52, local28 }));
					}
				}
			}
			if (local82 != null) {
				for (local92 = 4; local92 >= 0; local92--) {
					if (local82[local92] != null && local82[local92].method1882(Static104.aClass76_1092)) {
						@Pc(194) short local194 = 0;
						if (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1461 < arg1.anInt1696) {
							local194 = 2000;
						}
						@Pc(207) int local207 = 0;
						if (local92 == 0) {
							local207 = local194 + 40;
						}
						if (local92 == 1) {
							local207 = local194 + 21;
						}
						if (local92 == 2) {
							local207 = local194 + 37;
						}
						if (local92 == 3) {
							local207 = local194 + 5;
						}
						if (local92 == 4) {
							local207 = local194 + 35;
						}
						Static79.method551(local207, arg0, arg2, arg3, local82[local92], Static59.method1017(new Class76[] { Static6.aClass76_52, local28 }));
					}
				}
			}
			Static79.method551(1003, arg0, arg2, arg3, Static130.aClass76_1306, Static59.method1017(new Class76[] { Static6.aClass76_52, local28 }));
		} else if ((Static119.anInt2563 & 0x2) == 2) {
			Static79.method551(1, arg0, arg2, arg3, Static102.aClass76_1086, Static59.method1017(new Class76[] { Static117.aClass76_1203, Static88.aClass76_930, local28 }));
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method1616() {
		anIntArray328 = null;
		aClass76_1109 = null;
		aShortArrayArray5 = null;
		aClass76_1110 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public static void method1617() {
		@Pc(14) int local14;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(55) int local55;
		@Pc(61) int local61;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(22) int local22;
		@Pc(41) int local41;
		@Pc(65) int local65;
		if (Static48.anInt1230 == 70) {
			local14 = Static24.aClass4_Sub10_Sub1_1.method599();
			local22 = Static82.anInt2015 + (local14 >> 4 & 0x7);
			local28 = (local14 & 0x7) + Static41.anInt1147;
			local34 = local22 + Static24.aClass4_Sub10_Sub1_1.method579();
			local41 = local28 + Static24.aClass4_Sub10_Sub1_1.method579();
			local45 = Static24.aClass4_Sub10_Sub1_1.method574();
			local49 = Static24.aClass4_Sub10_Sub1_1.method604();
			local55 = Static24.aClass4_Sub10_Sub1_1.method599() * 4;
			local61 = Static24.aClass4_Sub10_Sub1_1.method599() * 4;
			local65 = Static24.aClass4_Sub10_Sub1_1.method604();
			@Pc(69) int local69 = Static24.aClass4_Sub10_Sub1_1.method604();
			local73 = Static24.aClass4_Sub10_Sub1_1.method599();
			local77 = Static24.aClass4_Sub10_Sub1_1.method599();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local34 >= 0 && local41 >= 0 && local34 < 104 && local41 < 104 && local49 != 65535) {
				local22 = local22 * 128 + 64;
				local41 = local41 * 128 + 64;
				local28 = local28 * 128 + 64;
				local34 = local34 * 128 + 64;
				@Pc(161) Class4_Sub4_Sub3_Sub2 local161 = new Class4_Sub4_Sub3_Sub2(local49, Static124.anInt2712, local22, local28, Static67.method1133(Static124.anInt2712, local22, local28) - local55, local65 + Static78.anInt1981, local69 + Static78.anInt1981, local73, local77, local45, local61);
				local161.method656(local41, local65 + Static78.anInt1981, local34, Static67.method1133(Static124.anInt2712, local34, local41) - local61);
				Static67.aClass78_7.method1914(local161);
			}
		} else if (Static48.anInt1230 == 234) {
			local14 = Static24.aClass4_Sub10_Sub1_1.method599();
			local28 = (local14 & 0x7) + Static41.anInt1147;
			local22 = (local14 >> 4 & 0x7) + Static82.anInt2015;
			local34 = Static24.aClass4_Sub10_Sub1_1.method604();
			local41 = Static24.aClass4_Sub10_Sub1_1.method604();
			local45 = Static24.aClass4_Sub10_Sub1_1.method604();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				@Pc(240) Class78 local240 = Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local22][local28];
				if (local240 != null) {
					for (@Pc(247) Class4_Sub4_Sub3_Sub3 local247 = (Class4_Sub4_Sub3_Sub3) local240.method1916(); local247 != null; local247 = (Class4_Sub4_Sub3_Sub3) local240.method1920()) {
						if ((local34 & 0x7FFF) == local247.anInt1200 && local247.anInt1202 == local41) {
							local247.anInt1202 = local45;
							break;
						}
					}
					Static98.method1570(local22, local28);
				}
			}
		} else if (Static48.anInt1230 == 21) {
			local14 = Static24.aClass4_Sub10_Sub1_1.method599();
			local22 = Static82.anInt2015 + (local14 >> 4 & 0x7);
			local28 = (local14 & 0x7) + Static41.anInt1147;
			local34 = Static24.aClass4_Sub10_Sub1_1.method593();
			local41 = Static24.aClass4_Sub10_Sub1_1.method599();
			local49 = local41 & 0x3;
			local45 = local41 >> 2;
			local55 = Static58.anIntArray193[local45];
			if (local22 >= 0 && local28 >= 0 && local22 < 103 && local28 < 103) {
				if (local55 == 0) {
					@Pc(344) Class70 local344 = Static54.aClass81_10.method2000(Static124.anInt2712, local22, local28);
					if (local344 != null) {
						local65 = local344.anInt2458 >> 14 & 0x7FFF;
						if (local45 == 2) {
							local344.aClass4_Sub4_Sub3_8 = new Class4_Sub4_Sub3_Sub6(local65, 2, local49 + 4, Static124.anInt2712, local22, local28, local34, false, local344.aClass4_Sub4_Sub3_8);
							local344.aClass4_Sub4_Sub3_9 = new Class4_Sub4_Sub3_Sub6(local65, 2, local49 + 1 & 0x3, Static124.anInt2712, local22, local28, local34, false, local344.aClass4_Sub4_Sub3_9);
						} else {
							local344.aClass4_Sub4_Sub3_8 = new Class4_Sub4_Sub3_Sub6(local65, local45, local49, Static124.anInt2712, local22, local28, local34, false, local344.aClass4_Sub4_Sub3_8);
						}
					}
				}
				if (local55 == 1) {
					@Pc(420) Class35 local420 = Static54.aClass81_10.method1960(Static124.anInt2712, local22, local28);
					if (local420 != null) {
						local65 = local420.anInt1343 >> 14 & 0x7FFF;
						if (local45 == 4 || local45 == 5) {
							local420.aClass4_Sub4_Sub3_2 = new Class4_Sub4_Sub3_Sub6(local65, 4, local49, Static124.anInt2712, local22, local28, local34, false, local420.aClass4_Sub4_Sub3_2);
						} else if (local45 == 6) {
							local420.aClass4_Sub4_Sub3_2 = new Class4_Sub4_Sub3_Sub6(local65, 4, local49 + 4, Static124.anInt2712, local22, local28, local34, false, local420.aClass4_Sub4_Sub3_2);
						} else if (local45 == 7) {
							local420.aClass4_Sub4_Sub3_2 = new Class4_Sub4_Sub3_Sub6(local65, 4, (local49 + 2 & 0x3) + 4, Static124.anInt2712, local22, local28, local34, false, local420.aClass4_Sub4_Sub3_2);
						} else if (local45 == 8) {
							local420.aClass4_Sub4_Sub3_2 = new Class4_Sub4_Sub3_Sub6(local65, 4, local49 + 4, Static124.anInt2712, local22, local28, local34, false, local420.aClass4_Sub4_Sub3_2);
							local420.aClass4_Sub4_Sub3_1 = new Class4_Sub4_Sub3_Sub6(local65, 4, (local49 + 2 & 0x3) + 4, Static124.anInt2712, local22, local28, local34, false, local420.aClass4_Sub4_Sub3_1);
						}
					}
				}
				if (local55 == 2) {
					if (local45 == 11) {
						local45 = 10;
					}
					@Pc(565) Class48 local565 = Static54.aClass81_10.method1972(Static124.anInt2712, local22, local28);
					if (local565 != null) {
						local565.aClass4_Sub4_Sub3_4 = new Class4_Sub4_Sub3_Sub6(local565.anInt1906 >> 14 & 0x7FFF, local45, local49, Static124.anInt2712, local22, local28, local34, false, local565.aClass4_Sub4_Sub3_4);
					}
				}
				if (local55 == 3) {
					@Pc(598) Class47 local598 = Static54.aClass81_10.method1992(Static124.anInt2712, local22, local28);
					if (local598 != null) {
						local598.aClass4_Sub4_Sub3_3 = new Class4_Sub4_Sub3_Sub6(local598.anInt1894 >> 14 & 0x7FFF, 22, local49, Static124.anInt2712, local22, local28, local34, false, local598.aClass4_Sub4_Sub3_3);
					}
				}
			}
		} else {
			@Pc(674) Class4_Sub4_Sub3_Sub3 local674;
			if (Static48.anInt1230 == 138) {
				local14 = Static24.aClass4_Sub10_Sub1_1.method604();
				local22 = Static24.aClass4_Sub10_Sub1_1.method599();
				local28 = Static82.anInt2015 + (local22 >> 4 & 0x7);
				local34 = (local22 & 0x7) + Static41.anInt1147;
				local41 = Static24.aClass4_Sub10_Sub1_1.method589();
				if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104) {
					local674 = new Class4_Sub4_Sub3_Sub3();
					local674.anInt1200 = local14;
					local674.anInt1202 = local41;
					if (Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local28][local34] == null) {
						Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local28][local34] = new Class78();
					}
					Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local28][local34].method1914(local674);
					Static98.method1570(local28, local34);
				}
			} else if (Static48.anInt1230 == 46) {
				local14 = Static24.aClass4_Sub10_Sub1_1.method599();
				local28 = Static41.anInt1147 + (local14 & 0x7);
				local22 = (local14 >> 4 & 0x7) + Static82.anInt2015;
				local34 = Static24.aClass4_Sub10_Sub1_1.method596();
				local45 = local34 & 0x3;
				local41 = local34 >> 2;
				local49 = Static58.anIntArray193[local41];
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					Static128.method1931(local45, Static124.anInt2712, local49, local28, -1, 0, -1, local22, local41);
				}
			} else if (Static48.anInt1230 == 107) {
				local14 = Static24.aClass4_Sub10_Sub1_1.method594();
				local28 = Static41.anInt1147 + (local14 & 0x7);
				local22 = Static82.anInt2015 + (local14 >> 4 & 0x7);
				local34 = Static24.aClass4_Sub10_Sub1_1.method589();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					@Pc(826) Class78 local826 = Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local22][local28];
					if (local826 != null) {
						for (local674 = (Class4_Sub4_Sub3_Sub3) local826.method1916(); local674 != null; local674 = (Class4_Sub4_Sub3_Sub3) local826.method1920()) {
							if (local674.anInt1200 == (local34 & 0x7FFF)) {
								local674.method2004();
								break;
							}
						}
						if (local826.method1916() == null) {
							Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local22][local28] = null;
						}
						Static98.method1570(local22, local28);
					}
				}
			} else if (Static48.anInt1230 == 114) {
				local14 = Static24.aClass4_Sub10_Sub1_1.method596();
				local22 = local14 >> 2;
				local28 = local14 & 0x3;
				local34 = Static58.anIntArray193[local22];
				local41 = Static24.aClass4_Sub10_Sub1_1.method563();
				local45 = Static24.aClass4_Sub10_Sub1_1.method594();
				local49 = Static82.anInt2015 + (local45 >> 4 & 0x7);
				local55 = (local45 & 0x7) + Static41.anInt1147;
				if (local49 >= 0 && local55 >= 0 && local49 < 104 && local55 < 104) {
					Static128.method1931(local28, Static124.anInt2712, local34, local55, local41, 0, -1, local49, local22);
				}
			} else {
				if (Static48.anInt1230 == 92) {
					local14 = Static24.aClass4_Sub10_Sub1_1.method589();
					@Pc(955) byte local955 = Static24.aClass4_Sub10_Sub1_1.method576();
					local28 = Static24.aClass4_Sub10_Sub1_1.method589();
					local34 = Static24.aClass4_Sub10_Sub1_1.method563();
					@Pc(967) byte local967 = Static24.aClass4_Sub10_Sub1_1.method553();
					local45 = Static24.aClass4_Sub10_Sub1_1.method599();
					local49 = local45 >> 2;
					local55 = local45 & 0x3;
					local61 = Static58.anIntArray193[local49];
					@Pc(987) byte local987 = Static24.aClass4_Sub10_Sub1_1.method553();
					@Pc(991) byte local991 = Static24.aClass4_Sub10_Sub1_1.method576();
					local73 = Static24.aClass4_Sub10_Sub1_1.method594();
					@Pc(1001) int local1001 = (local73 & 0x7) + Static41.anInt1147;
					local77 = (local73 >> 4 & 0x7) + Static82.anInt2015;
					@Pc(1013) int local1013 = Static24.aClass4_Sub10_Sub1_1.method563();
					@Pc(1024) Class4_Sub4_Sub3_Sub1_Sub2 local1024;
					if (local14 == Static41.anInt1148) {
						local1024 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1;
					} else {
						local1024 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local14];
					}
					if (local1024 != null) {
						@Pc(1034) Class4_Sub4_Sub8 local1034 = Static104.method1600(local34);
						@Pc(1046) int local1046;
						@Pc(1043) int local1043;
						if (local55 == 1 || local55 == 3) {
							local1046 = local1034.anInt1505;
							local1043 = local1034.anInt1498;
						} else {
							local1043 = local1034.anInt1505;
							local1046 = local1034.anInt1498;
						}
						@Pc(1063) int local1063 = local1001 + (local1043 + 1 >> 1);
						@Pc(1070) int local1070 = local1001 + (local1043 >> 1);
						@Pc(1078) int local1078 = (local1046 + 1 >> 1) + local77;
						@Pc(1082) int[][] local1082 = Static66.anIntArrayArrayArray3[Static124.anInt2712];
						@Pc(1090) int local1090 = (local77 << 7) + (local1046 << 6);
						@Pc(1096) int local1096 = (local1046 >> 1) + local77;
						@Pc(1124) int local1124 = local1082[local1078][local1070] + local1082[local1096][local1070] + local1082[local1096][local1063] + local1082[local1078][local1063] >> 2;
						@Pc(1133) int local1133 = (local1001 << 7) + (local1043 << 6);
						@Pc(1143) Class4_Sub4_Sub3_Sub7 local1143 = local1034.method1007(local1090, local1082, local55, local1133, local49, local1124);
						if (local1143 != null) {
							@Pc(1150) byte local1150;
							if (local987 > local955) {
								local1150 = local987;
								local987 = local955;
								local955 = local1150;
							}
							Static128.method1931(0, Static124.anInt2712, local61, local1001, -1, local1013 + 1, local28 + 1, local77, 0);
							local1024.anInt1442 = local987 + local77;
							local1024.anInt1462 = Static78.anInt1981 + local1013;
							if (local967 > local991) {
								local1150 = local967;
								local967 = local991;
								local991 = local1150;
							}
							local1024.anInt1446 = local1124;
							local1024.anInt1443 = local955 + local77;
							local1024.anInt1448 = local77 * 128 + local1046 * 64;
							local1024.aClass4_Sub4_Sub3_Sub7_1 = local1143;
							local1024.anInt1454 = local1001 * 128 + local1043 * 64;
							local1024.anInt1447 = local28 + Static78.anInt1981;
							local1024.anInt1440 = local967 + local1001;
							local1024.anInt1466 = local991 + local1001;
						}
					}
				}
				if (Static48.anInt1230 == 108) {
					local14 = Static24.aClass4_Sub10_Sub1_1.method599();
					local28 = (local14 & 0x7) + Static41.anInt1147;
					local22 = Static82.anInt2015 + (local14 >> 4 & 0x7);
					local34 = Static24.aClass4_Sub10_Sub1_1.method604();
					local41 = Static24.aClass4_Sub10_Sub1_1.method599();
					local49 = local41 & 0x7;
					local45 = local41 >> 4 & 0xF;
					local55 = Static24.aClass4_Sub10_Sub1_1.method599();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
						local61 = local45 + 1;
						if (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0] >= local22 - local61 && local61 + local22 >= Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0] && Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0] >= local28 - local61 && local61 + local28 >= Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0] && Static36.anInt1021 != 0 && local49 > 0 && Static64.anInt1644 < 50) {
							Static68.anIntArray236[Static64.anInt1644] = local34;
							Static82.anIntArray280[Static64.anInt1644] = local49;
							Static65.anIntArray62[Static64.anInt1644] = local55;
							Static68.aClass65Array1[Static64.anInt1644] = null;
							Static50.anIntArray162[Static64.anInt1644] = local45 + (local22 << 16) + (local28 << 8);
							Static64.anInt1644++;
						}
					}
				}
				if (Static48.anInt1230 == 109) {
					local14 = Static24.aClass4_Sub10_Sub1_1.method599();
					local22 = Static82.anInt2015 + (local14 >> 4 & 0x7);
					local28 = Static41.anInt1147 + (local14 & 0x7);
					local34 = Static24.aClass4_Sub10_Sub1_1.method604();
					local41 = Static24.aClass4_Sub10_Sub1_1.method599();
					local45 = Static24.aClass4_Sub10_Sub1_1.method604();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
						local22 = local22 * 128 + 64;
						local28 = local28 * 128 + 64;
						@Pc(1481) Class4_Sub4_Sub3_Sub4 local1481 = new Class4_Sub4_Sub3_Sub4(local34, Static124.anInt2712, local22, local28, Static67.method1133(Static124.anInt2712, local22, local28) - local41, local45, Static78.anInt1981);
						Static91.aClass78_9.method1914(local1481);
					}
				} else if (Static48.anInt1230 == 187) {
					local14 = Static24.aClass4_Sub10_Sub1_1.method596();
					local22 = Static82.anInt2015 + (local14 >> 4 & 0x7);
					local28 = Static41.anInt1147 + (local14 & 0x7);
					local34 = Static24.aClass4_Sub10_Sub1_1.method604();
					local41 = Static24.aClass4_Sub10_Sub1_1.method589();
					local45 = Static24.aClass4_Sub10_Sub1_1.method604();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local34 != Static41.anInt1148) {
						@Pc(1546) Class4_Sub4_Sub3_Sub3 local1546 = new Class4_Sub4_Sub3_Sub3();
						local1546.anInt1200 = local45;
						local1546.anInt1202 = local41;
						if (Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local22][local28] == null) {
							Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local22][local28] = new Class78();
						}
						Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local22][local28].method1914(local1546);
						Static98.method1570(local22, local28);
					}
				}
			}
		}
	}
}
