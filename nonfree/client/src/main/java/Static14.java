import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public static int anInt436;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "[Lclient!pc;")
	public static Class64[] aClass64Array1 = new Class64[500];

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1 = new Class4();

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "[I")
	public static int[] anIntArray29 = new int[5];

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Lclient!rf;")
	public static Class70 aClass70_151 = Static49.method1293("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method365() {
		Static16.aClass25_2.method1300();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIBIIII)I")
	public static int method366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(6) int local6 = arg0;
			arg0 = arg4;
			arg4 = local6;
		}
		@Pc(18) int local18 = arg2 & 0x3;
		if (local18 == 0) {
			return arg5;
		} else if (local18 == 1) {
			return arg1;
		} else if (local18 == 2) {
			return 8 - arg0 - arg5;
		} else {
			return 1 + 7 - arg1 - arg4;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!ig;BII)V")
	public static void method367(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt2384 == 1) {
			Static58.method1422((short) 7, 0L, 0, arg0.anInt2355, arg0.aClass70_773, Static35.aClass70_632);
		}
		if (arg0.anInt2384 == 2 && !Static167.aBoolean170) {
			@Pc(33) Class70 local33 = Static83.method3496(arg0);
			if (local33 != null) {
				Static58.method1422((short) 2, 0L, -1, arg0.anInt2355, local33, Static160.method3210(new Class70[] { Static181.aClass70_1568, arg0.aClass70_776 }));
			}
		}
		if (arg0.anInt2384 == 3) {
			Static58.method1422((short) 18, 0L, 0, arg0.anInt2355, Static132.aClass70_1166, Static35.aClass70_632);
		}
		if (arg0.anInt2384 == 4) {
			Static58.method1422((short) 8, 0L, 0, arg0.anInt2355, arg0.aClass70_773, Static35.aClass70_632);
		}
		if (arg0.anInt2384 == 5) {
			Static58.method1422((short) 12, 0L, 0, arg0.anInt2355, arg0.aClass70_773, Static35.aClass70_632);
		}
		if (arg0.anInt2384 == 6 && Static81.aClass39_25 == null) {
			Static58.method1422((short) 11, 0L, -1, arg0.anInt2355, arg0.aClass70_773, Static35.aClass70_632);
		}
		@Pc(157) int local157;
		@Pc(163) int local163;
		if (arg0.anInt2342 == 2) {
			local157 = 0;
			for (@Pc(159) int local159 = 0; local159 < arg0.anInt2369; local159++) {
				for (local163 = 0; local163 < arg0.anInt2340; local163++) {
					@Pc(173) int local173 = (arg0.anInt2361 + 32) * local163;
					@Pc(180) int local180 = (arg0.anInt2366 + 32) * local159;
					if (local157 < 20) {
						local180 += arg0.anIntArray229[local157];
						local173 += arg0.anIntArray233[local157];
					}
					if (local173 <= arg1 && arg2 >= local180 && local173 + 32 > arg1 && local180 + 32 > arg2) {
						Static53.aClass39_16 = arg0;
						Static109.anInt3062 = local157;
						if (arg0.anIntArray228[local157] > 0) {
							@Pc(250) Class1_Sub1_Sub2 local250 = Static90.method1963(arg0.anIntArray228[local157] - 1);
							if (Static58.anInt1876 == 1 && Static64.method771(Static20.method439(arg0))) {
								if (arg0.anInt2355 != Static168.anInt2253 || local157 != Static8.anInt286) {
									Static58.method1422((short) 25, (long) local250.anInt155, local157, arg0.anInt2355, Static170.aClass70_1480, Static160.method3210(new Class70[] { Static111.aClass70_1012, Static28.aClass70_290, local250.aClass70_49 }));
								}
							} else if (!Static167.aBoolean170 || !Static64.method771(Static20.method439(arg0))) {
								@Pc(276) Class70[] local276 = local250.aClass70Array1;
								if (Static18.aBoolean18) {
									local276 = Static174.method3425(local276);
								}
								@Pc(290) int local290;
								@Pc(341) byte local341;
								if (Static64.method771(Static20.method439(arg0))) {
									for (local290 = 4; local290 >= 3; local290--) {
										if (local276 != null && local276[local290] != null) {
											if (local290 == 3) {
												local341 = 21;
											} else {
												local341 = 44;
											}
											Static58.method1422(local341, (long) local250.anInt155, local157, arg0.anInt2355, local276[local290], Static160.method3210(new Class70[] { Static169.aClass70_1465, local250.aClass70_49 }));
										} else if (local290 == 4) {
											Static58.method1422((short) 44, (long) local250.anInt155, local157, arg0.anInt2355, Static73.aClass70_719, Static160.method3210(new Class70[] { Static169.aClass70_1465, local250.aClass70_49 }));
										}
									}
								}
								if (Static101.method2121(Static20.method439(arg0))) {
									Static58.method1422((short) 32, (long) local250.anInt155, local157, arg0.anInt2355, Static170.aClass70_1480, Static160.method3210(new Class70[] { Static169.aClass70_1465, local250.aClass70_49 }));
								}
								if (Static64.method771(Static20.method439(arg0)) && local276 != null) {
									for (local290 = 2; local290 >= 0; local290--) {
										if (local276[local290] != null) {
											local341 = 0;
											if (local290 == 0) {
												local341 = 42;
											}
											if (local290 == 1) {
												local341 = 22;
											}
											if (local290 == 2) {
												local341 = 31;
											}
											Static58.method1422(local341, (long) local250.anInt155, local157, arg0.anInt2355, local276[local290], Static160.method3210(new Class70[] { Static169.aClass70_1465, local250.aClass70_49 }));
										}
									}
								}
								local276 = arg0.aClass70Array12;
								if (Static18.aBoolean18) {
									local276 = Static174.method3425(local276);
								}
								if (local276 != null) {
									for (local290 = 4; local290 >= 0; local290--) {
										if (local276[local290] != null) {
											local341 = 0;
											if (local290 == 0) {
												local341 = 10;
											}
											if (local290 == 1) {
												local341 = 13;
											}
											if (local290 == 2) {
												local341 = 39;
											}
											if (local290 == 3) {
												local341 = 30;
											}
											if (local290 == 4) {
												local341 = 51;
											}
											Static58.method1422(local341, (long) local250.anInt155, local157, arg0.anInt2355, local276[local290], Static160.method3210(new Class70[] { Static169.aClass70_1465, local250.aClass70_49 }));
										}
									}
								}
								Static58.method1422((short) 1001, (long) local250.anInt155, local157, arg0.anInt2355, Static150.aClass70_1348, Static160.method3210(new Class70[] { Static169.aClass70_1465, local250.aClass70_49 }));
							} else if ((Static104.anInt2954 & 0x10) == 16) {
								Static58.method1422((short) 37, (long) local250.anInt155, local157, arg0.anInt2355, Static161.aClass70_1436, Static160.method3210(new Class70[] { Static5.aClass70_59, Static28.aClass70_290, local250.aClass70_49 }));
							}
						}
					}
					local157++;
				}
			}
		}
		if (!arg0.aBoolean89) {
			return;
		}
		if (Static167.aBoolean170) {
			if (Static96.method2076(Static20.method439(arg0)) && (Static104.anInt2954 & 0x20) == 32) {
				Static58.method1422((short) 1, 0L, arg0.anInt2344, arg0.anInt2355, Static161.aClass70_1436, Static160.method3210(new Class70[] { Static5.aClass70_59, Static77.aClass70_769, arg0.aClass70_774 }));
				return;
			}
			return;
		}
		@Pc(737) Class70 local737;
		for (local157 = 9; local157 >= 5; local157--) {
			local737 = Static113.method2296(local157, arg0);
			if (local737 != null) {
				Static58.method1422((short) 1003, (long) (local157 + 1), arg0.anInt2344, arg0.anInt2355, local737, arg0.aClass70_774);
			}
		}
		local737 = Static83.method3496(arg0);
		if (local737 != null) {
			Static58.method1422((short) 2, 0L, arg0.anInt2344, arg0.anInt2355, local737, arg0.aClass70_774);
		}
		for (local163 = 4; local163 >= 0; local163--) {
			@Pc(793) Class70 local793 = Static113.method2296(local163, arg0);
			if (local793 != null) {
				Static58.method1422((short) 47, (long) (local163 + 1), arg0.anInt2344, arg0.anInt2355, local793, arg0.aClass70_774);
			}
		}
		if (Static149.method3062(Static20.method439(arg0))) {
			Static58.method1422((short) 11, 0L, arg0.anInt2344, arg0.anInt2355, Static20.aClass70_190, Static35.aClass70_632);
			return;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method368() {
		Static142.aClass25_21.method1300();
		Static49.aClass25_8.method1300();
		Static7.aClass25_1.method1300();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method369() {
		aClass4_1 = null;
		aClass70_151 = null;
		anIntArray29 = null;
		aClass64Array1 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILclient!u;)Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3 method370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class76 arg2) {
		return Static95.method2048(arg0, arg2, arg1) ? Static18.method408() : null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
	public static boolean method371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = 0; local15 < 104; local15++) {
			for (local19 = 0; local19 < 104; local19++) {
				Static82.anIntArrayArray22[local15][local19] = 0;
				Static126.anIntArrayArray3[local15][local19] = 99999999;
			}
		}
		Static82.anIntArrayArray22[arg0][arg6] = 99;
		Static126.anIntArrayArray3[arg0][arg6] = 0;
		local19 = arg0;
		@Pc(61) byte local61 = 0;
		Static168.anIntArray215[0] = arg0;
		@Pc(68) int local68 = local61 + 1;
		Static26.anIntArray47[0] = arg6;
		@Pc(72) int local72 = arg6;
		@Pc(74) int local74 = 0;
		@Pc(79) int[][] local79 = Static96.aClass59Array1[Static56.anInt1784].anIntArrayArray27;
		@Pc(82) int local82 = Static168.anIntArray215.length;
		@Pc(84) boolean local84 = false;
		@Pc(196) int local196;
		while (local68 != local74) {
			local19 = Static168.anIntArray215[local74];
			local72 = Static26.anIntArray47[local74];
			local74 = (local74 + 1) % local82;
			if (arg1 == local19 && arg7 == local72) {
				local84 = true;
				break;
			}
			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && Static96.aClass59Array1[Static56.anInt1784].method2474(arg8, arg4 - 1, local72, local19, arg7, arg1)) {
					local84 = true;
					break;
				}
				if (arg4 < 10 && Static96.aClass59Array1[Static56.anInt1784].method2478(local19, arg8, arg1, arg7, local72, arg4 - 1)) {
					local84 = true;
					break;
				}
			}
			if (arg5 != 0 && arg9 != 0 && Static96.aClass59Array1[Static56.anInt1784].method2470(arg7, local72, arg1, arg9, arg5, arg2, local19)) {
				local84 = true;
				break;
			}
			local196 = Static126.anIntArrayArray3[local19][local72] + 1;
			if (local19 > 0 && Static82.anIntArrayArray22[local19 - 1][local72] == 0 && (local79[local19 - 1][local72] & 0x12C0108) == 0) {
				Static168.anIntArray215[local68] = local19 - 1;
				Static26.anIntArray47[local68] = local72;
				Static82.anIntArrayArray22[local19 - 1][local72] = 2;
				local68 = (local68 + 1) % local82;
				Static126.anIntArrayArray3[local19 - 1][local72] = local196;
			}
			if (local19 < 103 && Static82.anIntArrayArray22[local19 + 1][local72] == 0 && (local79[local19 + 1][local72] & 0x12C0180) == 0) {
				Static168.anIntArray215[local68] = local19 + 1;
				Static26.anIntArray47[local68] = local72;
				local68 = (local68 + 1) % local82;
				Static82.anIntArrayArray22[local19 + 1][local72] = 8;
				Static126.anIntArrayArray3[local19 + 1][local72] = local196;
			}
			if (local72 > 0 && Static82.anIntArrayArray22[local19][local72 - 1] == 0 && (local79[local19][local72 - 1] & 0x12C0102) == 0) {
				Static168.anIntArray215[local68] = local19;
				Static26.anIntArray47[local68] = local72 - 1;
				Static82.anIntArrayArray22[local19][local72 - 1] = 1;
				local68 = (local68 + 1) % local82;
				Static126.anIntArrayArray3[local19][local72 - 1] = local196;
			}
			if (local72 < 103 && Static82.anIntArrayArray22[local19][local72 + 1] == 0 && (local79[local19][local72 + 1] & 0x12C0120) == 0) {
				Static168.anIntArray215[local68] = local19;
				Static26.anIntArray47[local68] = local72 + 1;
				local68 = (local68 + 1) % local82;
				Static82.anIntArrayArray22[local19][local72 + 1] = 4;
				Static126.anIntArrayArray3[local19][local72 + 1] = local196;
			}
			if (local19 > 0 && local72 > 0 && Static82.anIntArrayArray22[local19 - 1][local72 - 1] == 0 && (local79[local19 - 1][local72 - 1] & 0x12C010E) == 0 && (local79[local19 - 1][local72] & 0x12C0108) == 0 && (local79[local19][local72 - 1] & 0x12C0102) == 0) {
				Static168.anIntArray215[local68] = local19 - 1;
				Static26.anIntArray47[local68] = local72 - 1;
				local68 = (local68 + 1) % local82;
				Static82.anIntArrayArray22[local19 - 1][local72 - 1] = 3;
				Static126.anIntArrayArray3[local19 - 1][local72 - 1] = local196;
			}
			if (local19 < 103 && local72 > 0 && Static82.anIntArrayArray22[local19 + 1][local72 - 1] == 0 && (local79[local19 + 1][local72 - 1] & 0x12C0183) == 0 && (local79[local19 + 1][local72] & 0x12C0180) == 0 && (local79[local19][local72 - 1] & 0x12C0102) == 0) {
				Static168.anIntArray215[local68] = local19 + 1;
				Static26.anIntArray47[local68] = local72 - 1;
				Static82.anIntArrayArray22[local19 + 1][local72 - 1] = 9;
				Static126.anIntArrayArray3[local19 + 1][local72 - 1] = local196;
				local68 = (local68 + 1) % local82;
			}
			if (local19 > 0 && local72 < 103 && Static82.anIntArrayArray22[local19 - 1][local72 + 1] == 0 && (local79[local19 - 1][local72 + 1] & 0x12C0138) == 0 && (local79[local19 - 1][local72] & 0x12C0108) == 0 && (local79[local19][local72 + 1] & 0x12C0120) == 0) {
				Static168.anIntArray215[local68] = local19 - 1;
				Static26.anIntArray47[local68] = local72 + 1;
				Static82.anIntArrayArray22[local19 - 1][local72 + 1] = 6;
				Static126.anIntArrayArray3[local19 - 1][local72 + 1] = local196;
				local68 = (local68 + 1) % local82;
			}
			if (local19 < 103 && local72 < 103 && Static82.anIntArrayArray22[local19 + 1][local72 + 1] == 0 && (local79[local19 + 1][local72 + 1] & 0x12C01E0) == 0 && (local79[local19 + 1][local72] & 0x12C0180) == 0 && (local79[local19][local72 + 1] & 0x12C0120) == 0) {
				Static168.anIntArray215[local68] = local19 + 1;
				Static26.anIntArray47[local68] = local72 + 1;
				Static82.anIntArrayArray22[local19 + 1][local72 + 1] = 12;
				local68 = (local68 + 1) % local82;
				Static126.anIntArrayArray3[local19 + 1][local72 + 1] = local196;
			}
		}
		Static61.anInt1956 = 0;
		@Pc(806) int local806;
		@Pc(815) int local815;
		@Pc(822) int local822;
		if (!local84) {
			if (!arg10) {
				return false;
			}
			local806 = 100;
			local196 = 1000;
			for (local815 = arg1 - 10; local815 <= arg1 + 10; local815++) {
				for (local822 = arg7 - 10; local822 <= arg7 + 10; local822++) {
					if (local815 >= 0 && local822 >= 0 && local815 < 104 && local822 < 104 && Static126.anIntArrayArray3[local815][local822] < 100) {
						@Pc(850) int local850 = 0;
						if (local815 < arg1) {
							local850 = arg1 - local815;
						} else if (local815 > arg5 + arg1 - 1) {
							local850 = local815 + 1 - arg1 - arg5;
						}
						@Pc(877) int local877 = 0;
						if (local822 < arg7) {
							local877 = arg7 - local822;
						} else if (local822 > arg9 + arg7 - 1) {
							local877 = local822 + 1 - arg7 - arg9;
						}
						@Pc(915) int local915 = local850 * local850 + local877 * local877;
						if (local196 > local915 || local915 == local196 && local806 > Static126.anIntArrayArray3[local815][local822]) {
							local806 = Static126.anIntArrayArray3[local815][local822];
							local72 = local822;
							local196 = local915;
							local19 = local815;
						}
					}
				}
			}
			if (local196 == 1000) {
				return false;
			}
			if (arg0 == local19 && local72 == arg6) {
				return false;
			}
			Static61.anInt1956 = 1;
		}
		@Pc(990) byte local990 = 0;
		Static168.anIntArray215[0] = local19;
		local74 = local990 + 1;
		Static26.anIntArray47[0] = local72;
		local196 = local806 = Static82.anIntArrayArray22[local19][local72];
		while (arg0 != local19 || arg6 != local72) {
			if (local806 != local196) {
				local806 = local196;
				Static168.anIntArray215[local74] = local19;
				Static26.anIntArray47[local74++] = local72;
			}
			if ((local196 & 0x2) != 0) {
				local19++;
			} else if ((local196 & 0x8) != 0) {
				local19--;
			}
			if ((local196 & 0x1) != 0) {
				local72++;
			} else if ((local196 & 0x4) != 0) {
				local72--;
			}
			local196 = Static82.anIntArrayArray22[local19][local72];
		}
		if (local74 > 0) {
			local82 = local74;
			if (local74 > 25) {
				local82 = 25;
			}
			local74--;
			@Pc(1082) int local1082 = Static168.anIntArray215[local74];
			local815 = Static26.anIntArray47[local74];
			if (arg3 == 0) {
				Static131.aClass1_Sub9_Sub1_3.method1283(55);
				Static131.aClass1_Sub9_Sub1_3.method1260(local82 + local82 + 3);
			}
			if (arg3 == 1) {
				Static131.aClass1_Sub9_Sub1_3.method1283(130);
				Static131.aClass1_Sub9_Sub1_3.method1260(local82 + local82 + 17);
			}
			if (arg3 == 2) {
				Static131.aClass1_Sub9_Sub1_3.method1283(137);
				Static131.aClass1_Sub9_Sub1_3.method1260(local82 + local82 + 3);
			}
			Static131.aClass1_Sub9_Sub1_3.method1245(local1082 + Static154.anInt4068);
			Static131.aClass1_Sub9_Sub1_3.method1236(local815 + Static64.anInt987);
			Static144.anInt3806 = Static26.anIntArray47[0];
			Static105.anInt2980 = Static168.anIntArray215[0];
			for (local822 = 1; local822 < local82; local822++) {
				local74--;
				Static131.aClass1_Sub9_Sub1_3.method1260(Static168.anIntArray215[local74] - local1082);
				Static131.aClass1_Sub9_Sub1_3.method1281(Static26.anIntArray47[local74] - local815);
			}
			Static131.aClass1_Sub9_Sub1_3.method1262(Static111.aBooleanArray14[82] ? 1 : 0);
			return true;
		} else if (arg3 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!u;Lclient!rf;ILclient!rf;)Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3 method372(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(3) Class70 arg2) {
		@Pc(11) int local11 = arg0.method3309(arg2);
		@Pc(17) int local17 = arg0.method3312(arg1, local11);
		return method370(local11, local17, arg0);
	}
}
