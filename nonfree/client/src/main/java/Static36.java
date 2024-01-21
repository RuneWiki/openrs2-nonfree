import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!di", name = "o", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_4;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "Lclient!bc;")
	public static Class1 aClass1_6;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "Lclient!bc;")
	public static Class1 aClass1_7;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	public static volatile int anInt823 = 0;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_284 = Static120.method1824(")3runescape)3com");

	@OriginalMember(owner = "client!di", name = "c", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_285 = Static120.method1824("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
	public static final int[] anIntArray109 = new int[1000];

	@OriginalMember(owner = "client!di", name = "h", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_286 = Static120.method1824("sl_button");

	@OriginalMember(owner = "client!di", name = "v", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_290 = Static120.method1824("Connection timed out)3");

	@OriginalMember(owner = "client!di", name = "m", descriptor = "Lclient!rd;")
	public static Class80 aClass80_287 = aClass80_290;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_288 = Static120.method1824("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIII)I")
	public static int method569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(21) int local21 = arg5;
			arg5 = arg3;
			arg3 = local21;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return 1 + 7 - arg5 - arg0;
		} else if (local3 == 2) {
			return 1 + 7 - arg3 - arg4;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)I")
	public static int method570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I[III)I")
	public static int method571(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		return arg0 * arg1[0] + arg1[1] * arg2;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
	public static void method573() {
		for (@Pc(6) Class3_Sub13 local6 = (Class3_Sub13) Static32.aClass70_26.method1953(); local6 != null; local6 = (Class3_Sub13) Static32.aClass70_26.method1948()) {
			if (local6.aClass3_Sub4_Sub4_2 != null) {
				Static152.aClass3_Sub4_Sub2_2.method1517(local6.aClass3_Sub4_Sub4_2);
				local6.aClass3_Sub4_Sub4_2 = null;
			}
			if (local6.aClass3_Sub4_Sub4_3 != null) {
				Static152.aClass3_Sub4_Sub2_2.method1517(local6.aClass3_Sub4_Sub4_3);
				local6.aClass3_Sub4_Sub4_3 = null;
			}
		}
		Static32.aClass70_26.method1954();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public static void method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass13_1 = null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)V")
	public static void method575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static72.anInt4111 = 0;
		@Pc(144) int local144;
		@Pc(76) int local76;
		@Pc(253) int local253;
		for (@Pc(9) int local9 = -1; local9 < Static59.anInt1317 + Static15.anInt327; local9++) {
			@Pc(30) Class3_Sub1_Sub5_Sub4 local30;
			if (local9 == -1) {
				local30 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1;
			} else if (local9 >= Static15.anInt327) {
				local30 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[Static125.anIntArray359[local9 - Static15.anInt327]];
			} else {
				local30 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[Static168.anIntArray460[local9]];
			}
			if (local30 != null && local30.method3064()) {
				@Pc(57) Class3_Sub1_Sub7 local57;
				if (local30 instanceof Class3_Sub1_Sub5_Sub4_Sub1) {
					local57 = ((Class3_Sub1_Sub5_Sub4_Sub1) local30).aClass3_Sub1_Sub7_1;
					if (local57.anIntArray133 != null) {
						local57 = local57.method623();
					}
					if (local57 == null) {
						continue;
					}
				}
				if (local9 >= Static15.anInt327) {
					local57 = ((Class3_Sub1_Sub5_Sub4_Sub1) local30).aClass3_Sub1_Sub7_1;
					if (local57.anIntArray133 != null) {
						local57 = local57.method623();
					}
					if (local57.anInt897 >= 0 && local57.anInt897 < Static187.aClass3_Sub1_Sub4_Sub4Array16.length) {
						Static130.method1960(local30, local30.method3066() + 15);
						if (Static168.anInt3762 > -1) {
							Static187.aClass3_Sub1_Sub4_Sub4Array16[local57.anInt897].method2595(Static168.anInt3762 + arg3 - 12, arg2 + Static13.anInt316 - 30);
						}
					}
					@Pc(251) Class34[] local251 = Static94.aClass34Array1;
					for (local253 = 0; local253 < local251.length; local253++) {
						@Pc(259) Class34 local259 = local251[local253];
						if (local259 != null && local259.anInt1330 == 1 && local259.anInt1331 == Static125.anIntArray359[local9 - Static15.anInt327] && Static193.anInt4411 % 20 < 10) {
							Static130.method1960(local30, local30.method3066() + 15);
							if (Static168.anInt3762 > -1) {
								Static181.aClass3_Sub1_Sub4_Sub4Array15[local259.anInt1329].method2595(Static168.anInt3762 + arg3 - 12, Static13.anInt316 + -28 + arg2);
							}
						}
					}
				} else {
					@Pc(74) Class3_Sub1_Sub5_Sub4_Sub2 local74 = (Class3_Sub1_Sub5_Sub4_Sub2) local30;
					local76 = 30;
					if (local74.anInt4349 != -1 || local74.anInt4336 != -1) {
						Static130.method1960(local30, local30.method3066() + 15);
						if (Static168.anInt3762 > -1) {
							if (local74.anInt4349 != -1) {
								Static23.aClass3_Sub1_Sub4_Sub4Array6[local74.anInt4349].method2595(arg3 + Static168.anInt3762 - 12, Static13.anInt316 + -30 + arg2);
								local76 += 25;
							}
							if (local74.anInt4336 != -1) {
								Static187.aClass3_Sub1_Sub4_Sub4Array16[local74.anInt4336].method2595(Static168.anInt3762 + arg3 - 12, arg2 - -Static13.anInt316 + -local76);
								local76 += 25;
							}
						}
					}
					if (local9 >= 0) {
						local144 = 0;
						@Pc(146) Class34[] local146 = Static94.aClass34Array1;
						while (local144 < local146.length) {
							@Pc(152) Class34 local152 = local146[local144];
							if (local152 != null && local152.anInt1330 == 10 && local152.anInt1331 == Static168.anIntArray460[local9]) {
								Static130.method1960(local30, local30.method3066() + 15);
								if (Static168.anInt3762 > -1) {
									Static181.aClass3_Sub1_Sub4_Sub4Array15[local152.anInt1329].method2595(arg3 + Static168.anInt3762 - 12, -local76 + Static13.anInt316 + arg2);
								}
							}
							local144++;
						}
					}
				}
				if (local30.aClass80_1687 != null && (local9 >= Static15.anInt327 || Static111.anInt2489 == 0 || Static111.anInt2489 == 3 || Static111.anInt2489 == 1 && Static159.method2538(((Class3_Sub1_Sub5_Sub4_Sub2) local30).aClass80_1689))) {
					Static130.method1960(local30, local30.method3066());
					if (Static168.anInt3762 > -1 && Static25.anInt574 > Static72.anInt4111) {
						Static25.anIntArray82[Static72.anInt4111] = Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2269(local30.aClass80_1687) / 2;
						Static25.anIntArray78[Static72.anInt4111] = Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.anInt3104;
						Static25.anIntArray77[Static72.anInt4111] = Static168.anInt3762;
						Static25.anIntArray80[Static72.anInt4111] = Static13.anInt316;
						Static25.anIntArray81[Static72.anInt4111] = local30.anInt4298;
						Static25.anIntArray79[Static72.anInt4111] = local30.anInt4273;
						Static25.anIntArray83[Static72.anInt4111] = local30.anInt4327;
						Static25.aClass80Array6[Static72.anInt4111] = local30.aClass80_1687;
						Static72.anInt4111++;
					}
				}
				if (local30.anInt4322 > Static193.anInt4411) {
					Static130.method1960(local30, local30.method3066() + 15);
					if (Static168.anInt3762 > -1) {
						Static24.method2576(Static168.anInt3762 + arg3 - 15, arg2 - (-Static13.anInt316 - -3), local30.anInt4300, 5, 65280);
						Static24.method2576(Static168.anInt3762 + arg3 + local30.anInt4300 - 15, arg2 - -Static13.anInt316 + -3, 30 - local30.anInt4300, 5, 16711680);
					}
				}
				for (local76 = 0; local76 < 4; local76++) {
					if (Static193.anInt4411 < local30.anIntArray510[local76]) {
						Static130.method1960(local30, local30.method3066() / 2);
						if (Static168.anInt3762 > -1) {
							if (local76 == 1) {
								Static13.anInt316 -= 20;
							}
							if (local76 == 2) {
								Static13.anInt316 -= 10;
								Static168.anInt3762 -= 15;
							}
							if (local76 == 3) {
								Static13.anInt316 -= 10;
								Static168.anInt3762 += 15;
							}
							Static74.aClass3_Sub1_Sub4_Sub4Array14[local30.anIntArray511[local76]].method2595(arg3 + Static168.anInt3762 - 12, Static13.anInt316 + arg2 - 12);
							Static5.aClass3_Sub1_Sub4_Sub3_Sub1_1.method2273(Static83.method1219(local30.anIntArray512[local76]), Static168.anInt3762 + arg3 - 1, arg2 + (Static13.anInt316 - -3), 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(573) int local573 = 0; local573 < Static72.anInt4111; local573++) {
			@Pc(579) int local579 = Static25.anIntArray80[local573];
			local253 = Static25.anIntArray82[local573];
			local144 = Static25.anIntArray78[local573];
			local76 = Static25.anIntArray77[local573];
			@Pc(593) boolean local593 = true;
			while (local593) {
				local593 = false;
				for (@Pc(599) int local599 = 0; local599 < local573; local599++) {
					if (Static25.anIntArray80[local599] - Static25.anIntArray78[local599] < local579 + 2 && Static25.anIntArray80[local599] + 2 > local579 - local144 && local76 - local253 < Static25.anIntArray82[local599] + Static25.anIntArray77[local599] && Static25.anIntArray77[local599] - Static25.anIntArray82[local599] < local253 + local76 && Static25.anIntArray80[local599] - Static25.anIntArray78[local599] < local579) {
						local579 = Static25.anIntArray80[local599] - Static25.anIntArray78[local599];
						local593 = true;
					}
				}
			}
			Static168.anInt3762 = Static25.anIntArray77[local573];
			Static13.anInt316 = Static25.anIntArray80[local573] = local579;
			@Pc(698) Class80 local698 = Static25.aClass80Array6[local573];
			if (Static70.anInt1548 == 0) {
				@Pc(705) int local705 = 16776960;
				if (Static25.anIntArray81[local573] < 6) {
					local705 = Static60.anIntArray174[Static25.anIntArray81[local573]];
				}
				if (Static25.anIntArray81[local573] == 6) {
					local705 = Static37.anInt856 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static25.anIntArray81[local573] == 7) {
					local705 = Static37.anInt856 % 20 < 10 ? 255 : 65535;
				}
				if (Static25.anIntArray81[local573] == 8) {
					local705 = Static37.anInt856 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(778) int local778;
				if (Static25.anIntArray81[local573] == 9) {
					local778 = 150 - Static25.anIntArray83[local573];
					if (local778 < 50) {
						local705 = local778 * 1280 + 16711680;
					} else if (local778 < 100) {
						local705 = 16776960 - (local778 - 50) * 327680;
					} else if (local778 < 150) {
						local705 = local778 * 5 + 65280 - 500;
					}
				}
				if (Static25.anIntArray81[local573] == 10) {
					local778 = 150 - Static25.anIntArray83[local573];
					if (local778 < 50) {
						local705 = local778 * 5 + 16711680;
					} else if (local778 < 100) {
						local705 = 16384000 + 16711935 - local778 * 327680;
					} else if (local778 < 150) {
						local705 = (local778 - 100) * 327680 + 255 + 500 - local778 * 5;
					}
				}
				if (Static25.anIntArray81[local573] == 11) {
					local778 = 150 - Static25.anIntArray83[local573];
					if (local778 < 50) {
						local705 = 16777215 - local778 * 327685;
					} else if (local778 < 100) {
						local705 = (local778 - 50) * 327685 + 65280;
					} else if (local778 < 150) {
						local705 = 16777215 - (local778 - 100) * 327680;
					}
				}
				if (Static25.anIntArray79[local573] == 0) {
					Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2273(local698, Static168.anInt3762 + arg3, arg2 - -Static13.anInt316, local705, 0);
				}
				if (Static25.anIntArray79[local573] == 1) {
					Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2272(local698, arg3 + Static168.anInt3762, arg2 + Static13.anInt316, local705, Static37.anInt856);
				}
				if (Static25.anIntArray79[local573] == 2) {
					Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2256(local698, arg3 + Static168.anInt3762, Static13.anInt316 + arg2, local705, Static37.anInt856);
				}
				if (Static25.anIntArray79[local573] == 3) {
					Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2260(local698, arg3 + Static168.anInt3762, arg2 + Static13.anInt316, local705, Static37.anInt856, 150 - Static25.anIntArray83[local573]);
				}
				if (Static25.anIntArray79[local573] == 4) {
					local778 = (150 - Static25.anIntArray83[local573]) * (Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2269(local698) + 100) / 150;
					Static24.method2570(Static168.anInt3762 + arg3 - 50, arg2, arg3 + Static168.anInt3762 + 50, arg2 + arg1);
					Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2264(local698, arg3 + Static168.anInt3762 + 50 - local778, Static13.anInt316 + arg2, local705, 0);
					Static24.method2569(arg3, arg2, arg0 + arg3, arg1 + arg2);
				}
				if (Static25.anIntArray79[local573] == 5) {
					local778 = 150 - Static25.anIntArray83[local573];
					Static24.method2570(arg3, Static13.anInt316 + arg2 - Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.anInt3104 - 1, arg3 + arg0, arg2 + Static13.anInt316 + 5);
					@Pc(1108) int local1108 = 0;
					if (local778 < 25) {
						local1108 = local778 - 25;
					} else if (local778 > 125) {
						local1108 = local778 - 125;
					}
					Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2273(local698, Static168.anInt3762 + arg3, arg2 + Static13.anInt316 - -local1108, local705, 0);
					Static24.method2569(arg3, arg2, arg3 + arg0, arg1 + arg2);
				}
			} else {
				Static140.aClass3_Sub1_Sub4_Sub3_Sub1_6.method2273(local698, arg3 + Static168.anInt3762, arg2 + Static13.anInt316, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(IIIIIII)V")
	public static void method576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static168.method2708(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(29) int local29 = local15;
		@Pc(31) int local31 = arg0;
		@Pc(34) int local34 = -arg0;
		@Pc(37) int local37 = -local15;
		@Pc(39) int local39 = -1;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(87) int local87;
		if (Static34.anInt790 <= arg3 && arg3 <= Static17.anInt440) {
			@Pc(53) int[] local53 = Static96.anIntArrayArray27[arg3];
			local62 = Static61.method895(arg1 - arg0, Static172.anInt3861, Static85.anInt1779);
			local70 = Static61.method895(arg0 + arg1, Static172.anInt3861, Static85.anInt1779);
			local79 = Static61.method895(arg1 - local15, Static172.anInt3861, Static85.anInt1779);
			local87 = Static61.method895(local15 + arg1, Static172.anInt3861, Static85.anInt1779);
			Static46.method726(local62, arg5, local53, local79);
			Static46.method726(local79, arg2, local53, local87);
			Static46.method726(local87, arg5, local53, local70);
		}
		@Pc(107) int local107 = -1;
		while (local10 < local31) {
			local39 += 2;
			local34 += local39;
			local107 += 2;
			local37 += local107;
			if (local37 >= 0 && local29 >= 1) {
				local29--;
				Static188.anIntArray514[local29] = local10;
				local37 -= local29 << 1;
			}
			local10++;
			@Pc(250) int local250;
			@Pc(259) int local259;
			@Pc(270) int[] local270;
			@Pc(157) int local157;
			if (local34 >= 0) {
				local31--;
				local62 = local31 + arg3;
				local34 -= local31 << 1;
				local157 = arg3 - local31;
				if (Static34.anInt790 <= local62 && local157 <= Static17.anInt440) {
					if (local31 >= local15) {
						local70 = Static61.method895(arg1 + local10, Static172.anInt3861, Static85.anInt1779);
						local79 = Static61.method895(arg1 - local10, Static172.anInt3861, Static85.anInt1779);
						if (Static17.anInt440 >= local62) {
							Static46.method726(local79, arg5, Static96.anIntArrayArray27[local62], local70);
						}
						if (local157 >= Static34.anInt790) {
							Static46.method726(local79, arg5, Static96.anIntArrayArray27[local157], local70);
						}
					} else {
						local70 = Static188.anIntArray514[local31];
						local79 = Static61.method895(local10 + arg1, Static172.anInt3861, Static85.anInt1779);
						local87 = Static61.method895(arg1 - local10, Static172.anInt3861, Static85.anInt1779);
						local250 = Static61.method895(arg1 + local70, Static172.anInt3861, Static85.anInt1779);
						local259 = Static61.method895(arg1 - local70, Static172.anInt3861, Static85.anInt1779);
						if (Static17.anInt440 >= local62) {
							local270 = Static96.anIntArrayArray27[local62];
							Static46.method726(local87, arg5, local270, local259);
							Static46.method726(local259, arg2, local270, local250);
							Static46.method726(local250, arg5, local270, local79);
						}
						if (local157 >= Static34.anInt790) {
							local270 = Static96.anIntArrayArray27[local157];
							Static46.method726(local87, arg5, local270, local259);
							Static46.method726(local259, arg2, local270, local250);
							Static46.method726(local250, arg5, local270, local79);
						}
					}
				}
			}
			local157 = arg3 - local10;
			local62 = local10 + arg3;
			if (local62 >= Static34.anInt790 && local157 <= Static17.anInt440) {
				local70 = arg1 + local31;
				local79 = arg1 - local31;
				if (Static172.anInt3861 <= local70 && Static85.anInt1779 >= local79) {
					local70 = Static61.method895(local70, Static172.anInt3861, Static85.anInt1779);
					local79 = Static61.method895(local79, Static172.anInt3861, Static85.anInt1779);
					if (local10 < local15) {
						local87 = local29 >= local10 ? local29 : Static188.anIntArray514[local10];
						local250 = Static61.method895(arg1 + local87, Static172.anInt3861, Static85.anInt1779);
						local259 = Static61.method895(arg1 - local87, Static172.anInt3861, Static85.anInt1779);
						if (Static17.anInt440 >= local62) {
							local270 = Static96.anIntArrayArray27[local62];
							Static46.method726(local79, arg5, local270, local259);
							Static46.method726(local259, arg2, local270, local250);
							Static46.method726(local250, arg5, local270, local70);
						}
						if (local157 >= Static34.anInt790) {
							local270 = Static96.anIntArrayArray27[local157];
							Static46.method726(local79, arg5, local270, local259);
							Static46.method726(local259, arg2, local270, local250);
							Static46.method726(local250, arg5, local270, local70);
						}
					} else {
						if (local62 <= Static17.anInt440) {
							Static46.method726(local79, arg5, Static96.anIntArrayArray27[local62], local70);
						}
						if (local157 >= Static34.anInt790) {
							Static46.method726(local79, arg5, Static96.anIntArrayArray27[local157], local70);
						}
					}
				}
			}
		}
	}
}
