import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "[I")
	public static final int[] anIntArray59 = new int[50];

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "[I")
	public static final int[] anIntArray60 = new int[3];

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method724(@OriginalArg(0) Class100 arg0) {
		Static45.aClass29_3 = Static18.method320(true, Static377.anInt6694, arg0);
		Static450.aClass294_11 = Static362.method5086(arg0, Static377.anInt6694);
		Static412.aClass29_2 = Static18.method320(true, Static230.anInt4311, arg0);
		Static355.aClass294_8 = Static362.method5086(arg0, Static230.anInt4311);
		Static419.aClass29_13 = Static18.method320(true, Static295.anInt8551, arg0);
		Static83.aClass294_6 = Static362.method5086(arg0, Static295.anInt8551);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIII)V")
	public static void method726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static376.anInt6647;
		@Pc(9) int[] local9 = Static557.anIntArray665;
		Static538.anInt8795 = 0;
		@Pc(184) int local184;
		@Pc(209) int local209;
		@Pc(255) int local255;
		@Pc(334) int local334;
		@Pc(427) int local427;
		@Pc(881) int local881;
		@Pc(533) int local533;
		for (@Pc(19) int local19 = 0; local19 < Static416.anInt7186 + local7; local19++) {
			@Pc(23) Class86 local23 = null;
			@Pc(32) Class6_Sub1_Sub1_Sub1 local32;
			if (local7 > local19) {
				local32 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local9[local19]];
			} else {
				local32 = ((Class2_Sub32) Static544.aClass162_40.method3519((long) Static169.anIntArray198[local19 - local7])).aClass6_Sub1_Sub1_Sub1_Sub1_1;
				local23 = ((Class6_Sub1_Sub1_Sub1_Sub1) local32).aClass86_1;
				if (local23.anIntArray136 != null) {
					local23 = local23.method1567(Static70.aClass78_1);
					if (local23 == null) {
						continue;
					}
				}
			}
			if (local32.anInt7381 >= 0 && (local32.anInt7389 == Static485.anInt8225 || local32.aByte112 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112)) {
				Static35.method632(local32.method6167(), local32, arg2 >> 1, arg3 >> 1);
				if (Static318.anIntArray418[0] >= 0) {
					if (local32.aString65 != null && (local19 >= local7 || Static138.anInt2874 == 0 || Static138.anInt2874 == 3 || Static138.anInt2874 == 1 && Static579.method7832(((Class6_Sub1_Sub1_Sub1_Sub2) local32).aString67)) && Static538.anInt8795 < Static66.anInt8593) {
						Static66.anIntArray625[Static538.anInt8795] = Static83.aClass294_6.method6718(local32.aString65) / 2;
						Static66.anIntArray621[Static538.anInt8795] = Static318.anIntArray418[0];
						Static66.anIntArray624[Static538.anInt8795] = Static318.anIntArray418[1];
						Static66.anIntArray622[Static538.anInt8795] = local32.anInt7359;
						Static66.anIntArray623[Static538.anInt8795] = local32.anInt7413;
						Static66.anIntArray626[Static538.anInt8795] = local32.anInt7344;
						Static66.aStringArray160[Static538.anInt8795] = local32.aString65;
						Static538.anInt8795++;
					}
					local184 = arg0 + Static318.anIntArray418[1];
					@Pc(240) Class39[] local240;
					@Pc(247) Class13[] local247;
					@Pc(305) Class39 local305;
					if (local32.aBoolean570 || Static412.anInt575 >= local32.anInt7410) {
						local184 -= Math.max(Static83.aClass294_6.anInt8114, Static209.aClass39Array7[0].u());
					} else {
						@Pc(195) byte local195 = 1;
						if (local7 > local19) {
							@Pc(204) Class6_Sub1_Sub1_Sub1_Sub2 local204 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local9[local19]];
							local209 = local32.method6168().anInt1385;
							if (local204.aBoolean575) {
								local195 = 2;
							}
						} else {
							local209 = local23.anInt2169;
							if (local209 == -1) {
								local209 = local32.method6168().anInt1385;
							}
						}
						@Pc(230) Class39[] local230 = Static209.aClass39Array7;
						if (local209 != -1) {
							local240 = (Class39[]) Static333.aClass313_36.method6989((long) local209);
							if (local240 == null) {
								local247 = Static596.method254(Static490.aClass259_153, local209);
								if (local247 != null) {
									local240 = new Class39[local247.length];
									for (local255 = 0; local255 < local247.length; local255++) {
										local240[local255] = Static307.aClass100_6.method6256(local247[local255], true);
									}
									Static333.aClass313_36.method6980((long) local209, local240);
								}
							}
							if (local240 != null && local240.length >= 2) {
								local230 = local240;
							}
						}
						if (local230.length <= local195) {
							local195 = 1;
						}
						@Pc(301) Class39 local301 = local230[0];
						local305 = local230[local195];
						local184 -= Math.max(Static83.aClass294_6.anInt8114, local301.u());
						local255 = arg1 + Static318.anIntArray418[0] - (local301.E() >> 1);
						local334 = local301.E() * local32.anInt7375 / 255;
						if (local32.anInt7375 > 0 && local334 < 2) {
							local334 = 2;
						}
						local301.method7851(local255, local184);
						Static307.aClass100_6.V(local255, local184, local334 + local255, local184 - -local301.u());
						local305.method7851(local255, local184);
						Static307.aClass100_6.da(arg1, arg0, arg3 + arg1, arg2 + arg0);
					}
					local184 -= 2;
					if (!local32.aBoolean570) {
						@Pc(408) Class39 local408;
						if (Static412.anInt575 < local32.anInt7351) {
							local408 = Static151.aClass39Array5[local32.aBoolean571 ? 2 : 0];
							@Pc(417) Class39 local417 = Static151.aClass39Array5[local32.aBoolean571 ? 3 : 1];
							if (local32 instanceof Class6_Sub1_Sub1_Sub1_Sub1) {
								local427 = local23.anInt2146;
								if (local427 == -1) {
									local427 = local32.method6168().anInt1416;
								}
							} else {
								local427 = local32.method6168().anInt1416;
							}
							if (local427 != -1) {
								local240 = (Class39[]) Static162.aClass313_20.method6989((long) local427);
								if (local240 == null) {
									local247 = Static596.method254(Static490.aClass259_153, local427);
									if (local247 != null) {
										local240 = new Class39[local247.length];
										for (local255 = 0; local255 < local247.length; local255++) {
											local240[local255] = Static307.aClass100_6.method6256(local247[local255], true);
										}
										Static162.aClass313_20.method6980((long) local427, local240);
									}
								}
								if (local240 != null && local240.length == 4) {
									local408 = local240[local32.aBoolean571 ? 2 : 0];
									local417 = local240[local32.aBoolean571 ? 3 : 1];
								}
							}
							@Pc(522) int local522 = local32.anInt7351 - Static412.anInt575;
							if (local522 <= local32.anInt7395) {
								local533 = local408.E();
							} else {
								local522 -= local32.anInt7395;
								local255 = local32.anInt7357 == 0 ? 0 : (local32.anInt7392 - local522) / local32.anInt7357 * local32.anInt7357;
								local533 = local255 * local408.E() / local32.anInt7392;
							}
							local255 = local408.u();
							local184 -= local255;
							local334 = arg1 + Static318.anIntArray418[0] - (local408.E() >> 1);
							local408.method7851(local334, local184);
							Static307.aClass100_6.V(local334, local184, local334 + local533, local255 + local184);
							local417.method7851(local334, local184);
							Static307.aClass100_6.da(arg1, arg0, arg1 + arg3, arg0 - -arg2);
							local184 -= 2;
						}
						if (local19 < local7) {
							@Pc(624) Class6_Sub1_Sub1_Sub1_Sub2 local624 = (Class6_Sub1_Sub1_Sub1_Sub2) local32;
							if (local624.anInt7459 != -1) {
								local184 -= 25;
								Static377.aClass39Array15[local624.anInt7459].method7851(Static318.anIntArray418[0] + arg1 - 12, local184);
								local184 -= 2;
							}
							if (local624.anInt7448 != -1) {
								local184 -= 25;
								Static15.aClass39Array1[local624.anInt7448].method7851(Static318.anIntArray418[0] + arg1 - 12, local184);
								local184 -= 2;
							}
						} else if (local23.anInt2160 >= 0 && local23.anInt2160 < Static15.aClass39Array1.length) {
							local408 = Static15.aClass39Array1[local23.anInt2160];
							local184 -= 25;
							local408.method7851(arg1 + Static318.anIntArray418[0] - (local408.E() >> 1), local184);
							local184 -= 2;
						}
					}
					@Pc(704) Class246[] local704;
					@Pc(712) Class246 local712;
					if (!(local32 instanceof Class6_Sub1_Sub1_Sub1_Sub2)) {
						local209 = 0;
						local704 = Static134.aClass246Array1;
						for (local427 = 0; local427 < local704.length; local427++) {
							local712 = local704[local427];
							if (local712 != null && local712.anInt6838 == 1 && local712.anInt6841 == Static169.anIntArray198[local19 - local7]) {
								local305 = Static568.aClass39Array19[local712.anInt6839];
								if (local209 < local305.u()) {
									local209 = local305.u();
								}
								if (Static412.anInt575 % 20 < 10) {
									local305.method7851(arg1 + Static318.anIntArray418[0] - 12, -local305.u() + local184);
								}
							}
						}
						if (local209 > 0) {
						}
					} else if (local19 >= 0) {
						local209 = 0;
						local704 = Static134.aClass246Array1;
						for (local427 = 0; local427 < local704.length; local427++) {
							local712 = local704[local427];
							if (local712 != null && local712.anInt6838 == 10 && local9[local19] == local712.anInt6841) {
								local305 = Static568.aClass39Array19[local712.anInt6839];
								if (local305.u() > local209) {
									local209 = local305.u();
								}
								local305.method7851(Static318.anIntArray418[0] + arg1 - 12, local184 + -local305.u());
							}
						}
						if (local209 > 0) {
						}
					}
					for (local209 = 0; local209 < 4; local209++) {
						if (Static412.anInt575 < local32.anIntArray508[local209]) {
							local881 = local32.method6167() / 2;
							Static35.method632(local881, local32, arg2 >> 1, arg3 >> 1);
							if (Static318.anIntArray418[0] > -1) {
								local427 = Static228.aClass39Array8[local32.anIntArray505[local209]].E();
								if (local209 == 1) {
									Static318.anIntArray418[1] -= 20;
								}
								if (local209 == 2) {
									Static318.anIntArray418[0] -= local427 - 9;
									Static318.anIntArray418[1] -= 10;
								}
								if (local209 == 3) {
									Static318.anIntArray418[0] += local427 - 9;
									Static318.anIntArray418[1] -= 10;
								}
								Static228.aClass39Array8[local32.anIntArray505[local209]].method7851(arg1 + Static318.anIntArray418[0] - (local427 >> 1), Static318.anIntArray418[1] + (arg0 - 12));
								Static45.aClass29_3.method7118(-1, arg1 + Static318.anIntArray418[0] - 1, 0, Static318.anIntArray418[1] + arg0 + 3, Integer.toString(local32.anIntArray506[local209]));
							}
						}
					}
				}
			}
		}
		@Pc(1032) int local1032;
		for (@Pc(1026) int local1026 = 0; local1026 < Static436.anInt7464; local1026++) {
			local1032 = Static430.anIntArray498[local1026];
			@Pc(1039) Class6_Sub1_Sub1_Sub1 local1039;
			if (local1032 < 2048) {
				local1039 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local1032];
			} else {
				local1039 = ((Class2_Sub32) Static544.aClass162_40.method3519((long) (local1032 - 2048))).aClass6_Sub1_Sub1_Sub1_Sub1_1;
			}
			local209 = Static339.anIntArray175[local1026];
			@Pc(1064) Class6_Sub1_Sub1_Sub1 local1064;
			if (local209 < 2048) {
				local1064 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local209];
			} else {
				local1064 = ((Class2_Sub32) Static544.aClass162_40.method3519((long) (local209 - 2048))).aClass6_Sub1_Sub1_Sub1_Sub1_1;
			}
			Static145.method2412(local1039, --local1039.anInt7401, local1064, arg0, arg1, arg3, arg2);
		}
		local1032 = Static83.aClass294_6.anInt8124 + Static83.aClass294_6.anInt8114 + 2;
		for (local184 = 0; local184 < Static538.anInt8795; local184++) {
			local209 = Static66.anIntArray621[local184];
			local881 = Static66.anIntArray624[local184];
			local427 = Static66.anIntArray625[local184];
			@Pc(1127) boolean local1127 = true;
			while (local1127) {
				local1127 = false;
				for (local533 = 0; local533 < local184; local533++) {
					if (local881 + 2 > -local1032 + Static66.anIntArray624[local533] && Static66.anIntArray624[local533] + 2 > local881 - local1032 && local209 - local427 < Static66.anIntArray621[local533] - -Static66.anIntArray625[local533] && local209 + local427 > -Static66.anIntArray625[local533] + Static66.anIntArray621[local533] && Static66.anIntArray624[local533] - local1032 < local881) {
						local1127 = true;
						local881 = Static66.anIntArray624[local533] - local1032;
					}
				}
			}
			Static66.anIntArray624[local184] = local881;
			@Pc(1223) String local1223 = Static66.aStringArray160[local184];
			if (Static240.anInt1911 == 0) {
				local255 = 16776960;
				if (Static66.anIntArray622[local184] < 6) {
					local255 = Static279.anIntArray343[Static66.anIntArray622[local184]];
				}
				if (Static66.anIntArray622[local184] == 6) {
					local255 = Static485.anInt8225 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static66.anIntArray622[local184] == 7) {
					local255 = Static485.anInt8225 % 20 >= 10 ? 65535 : 255;
				}
				if (Static66.anIntArray622[local184] == 8) {
					local255 = Static485.anInt8225 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static66.anIntArray622[local184] == 9) {
					local334 = 150 - Static66.anIntArray626[local184];
					if (local334 < 50) {
						local255 = local334 * 1280 + 16711680;
					} else if (local334 < 100) {
						local255 = 33160960 - local334 * 327680;
					} else if (local334 < 150) {
						local255 = (local334 - 100) * 5 + 65280;
					}
				}
				if (Static66.anIntArray622[local184] == 10) {
					local334 = 150 - Static66.anIntArray626[local184];
					if (local334 < 50) {
						local255 = local334 * 5 + 16711680;
					} else if (local334 < 100) {
						local255 = 16711935 - (local334 - 50) * 327680;
					} else if (local334 < 150) {
						local255 = (local334 - 100) * 327680 + 255 - (local334 - 100) * 5;
					}
				}
				if (Static66.anIntArray622[local184] == 11) {
					local334 = 150 - Static66.anIntArray626[local184];
					if (local334 < 50) {
						local255 = 16777215 - local334 * 327685;
					} else if (local334 < 100) {
						local255 = (local334 - 50) * 327685 + 65280;
					} else if (local334 < 150) {
						local255 = 16777215 - (local334 - 100) * 327680;
					}
				}
				local334 = local255 | 0xFF000000;
				if (Static66.anIntArray623[local184] == 0) {
					Static419.aClass29_13.method7118(local334, arg1 + local209, -16777216, local881 + arg0, local1223);
				}
				if (Static66.anIntArray623[local184] == 1) {
					Static419.aClass29_13.method7124(local209 + arg1, arg0 - -local881, Static485.anInt8225, local334, local1223);
				}
				if (Static66.anIntArray623[local184] == 2) {
					Static419.aClass29_13.method7110(local881 + arg0, local334, local1223, arg1 + local209, Static485.anInt8225);
				}
				if (Static66.anIntArray623[local184] == 3) {
					Static419.aClass29_13.method7114(Static485.anInt8225, local1223, arg0 + local881, local334, 150 - Static66.anIntArray626[local184], local209 + arg1);
				}
				@Pc(1573) int local1573;
				if (Static66.anIntArray623[local184] == 4) {
					local1573 = (150 - Static66.anIntArray626[local184]) * (Static83.aClass294_6.method6718(local1223) + 100) / 150;
					Static307.aClass100_6.V(arg1 + local209 - 50, arg0, local209 + arg1 + 50, arg2 + arg0);
					Static419.aClass29_13.method7111(local334, local209 + arg1 + 50 - local1573, local1223, -16777216, local881 + arg0);
					Static307.aClass100_6.da(arg1, arg0, arg1 + arg3, arg2 + arg0);
				}
				if (Static66.anIntArray623[local184] == 5) {
					local1573 = 150 - Static66.anIntArray626[local184];
					@Pc(1628) int local1628 = 0;
					if (local1573 < 25) {
						local1628 = local1573 - 25;
					} else if (local1573 > 125) {
						local1628 = local1573 - 125;
					}
					@Pc(1652) int local1652 = Static83.aClass294_6.anInt8114 + Static83.aClass294_6.anInt8124;
					Static307.aClass100_6.V(arg1, arg0 + local881 - local1652 - 1, arg3 + arg1, local881 + arg0 + 5);
					Static419.aClass29_13.method7118(local334, local209 + arg1, -16777216, local881 + arg0 + local1628, local1223);
					Static307.aClass100_6.da(arg1, arg0, arg3 + arg1, arg2 + arg0);
				}
			} else {
				Static419.aClass29_13.method7118(-256, local209 + arg1, -16777216, local881 + arg0, local1223);
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	public static void method727() {
		@Pc(5) Class313 local5 = Static210.aClass313_25;
		synchronized (Static210.aClass313_25) {
			Static210.aClass313_25.method6977();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIBII[Lclient!kp;II)V")
	public static void method728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class196[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static307.aClass100_6.da(arg2, arg0, arg4, arg1);
		for (@Pc(24) int local24 = 0; local24 < arg6.length; local24++) {
			@Pc(30) Class196 local30 = arg6[local24];
			if (local30 != null && (local30.anInt5089 == arg8 || arg8 == -1412584499 && local30 == Static288.aClass196_3)) {
				@Pc(70) int local70;
				if (arg5 == -1) {
					Class230.aRectangleArray1[Static451.anInt488].setBounds(arg3 + local30.anInt5095, local30.anInt5093 - -arg7, local30.anInt5130, local30.anInt5078);
					local70 = Static451.anInt488++;
				} else {
					local70 = arg5;
				}
				local30.anInt5134 = local70;
				local30.anInt5151 = Static412.anInt575;
				if (!Static67.method1092(local30)) {
					if (local30.anInt5090 != 0) {
						Static394.method4079(local30);
					}
					@Pc(97) int local97 = local30.anInt5095 + arg3;
					@Pc(102) int local102 = local30.anInt5093 + arg7;
					@Pc(105) int local105 = local30.anInt5111;
					if (Static298.aBoolean425 && (Static67.method1102(local30).anInt6464 != 0 || local30.anInt5098 == 0) && local105 > 127) {
						local105 = 127;
					}
					@Pc(160) int local160;
					@Pc(164) int local164;
					if (local30 == Static288.aClass196_3) {
						if (arg8 != -1412584499 && (local30.anInt5168 == Static363.anInt6453 || local30.anInt5168 == Static18.anInt506)) {
							Static249.anInt4666 = arg3;
							Static236.aClass196Array1 = arg6;
							Static431.anInt7306 = arg7;
							continue;
						}
						if (Static146.aBoolean241 && Static578.aBoolean720) {
							local160 = Static326.aClass149_1.method5879();
							local164 = Static326.aClass149_1.method5875();
							local160 -= Static403.anInt7032;
							local164 -= Static339.anInt2916;
							if (Static419.anInt6521 > local160) {
								local160 = Static419.anInt6521;
							}
							if (Static547.anInt6998 > local164) {
								local164 = Static547.anInt6998;
							}
							if (local160 + local30.anInt5130 > Static453.aClass196_8.anInt5130 + Static419.anInt6521) {
								local160 = Static419.anInt6521 + Static453.aClass196_8.anInt5130 - local30.anInt5130;
							}
							local97 = local160;
							if (Static453.aClass196_8.anInt5078 + Static547.anInt6998 < local164 + local30.anInt5078) {
								local164 = Static453.aClass196_8.anInt5078 + Static547.anInt6998 - local30.anInt5078;
							}
							local102 = local164;
						}
						if (Static18.anInt506 == local30.anInt5168) {
							local105 = 128;
						}
					}
					@Pc(294) int local294;
					@Pc(301) int local301;
					@Pc(254) int local254;
					@Pc(259) int local259;
					if (local30.anInt5098 == 2) {
						local164 = arg0;
						local301 = arg1;
						local294 = arg4;
						local160 = arg2;
					} else {
						local254 = local97 + local30.anInt5130;
						local259 = local30.anInt5078 + local102;
						if (local30.anInt5098 == 9) {
							local259++;
							local254++;
						}
						local160 = local97 > arg2 ? local97 : arg2;
						local164 = local102 > arg0 ? local102 : arg0;
						local294 = arg4 <= local254 ? arg4 : local254;
						local301 = arg1 > local259 ? local259 : arg1;
					}
					if (local294 > local160 && local301 > local164) {
						@Pc(545) int local545;
						@Pc(558) int local558;
						@Pc(653) int local653;
						@Pc(509) int local509;
						@Pc(543) int local543;
						if (local30.anInt5090 != 0) {
							if (local30.anInt5090 == Static315.anInt8437 || Static490.anInt8277 == local30.anInt5090) {
								Static463.method6529(Static490.anInt8277 == local30.anInt5090, local102, local30.anInt5130, local97, local30.anInt5078);
								Static295.aBooleanArray36[local70] = true;
								Static307.aClass100_6.da(arg2, arg0, arg4, arg1);
								continue;
							}
							if (local30.anInt5090 == Static514.anInt401) {
								if (local30.method4250(Static307.aClass100_6) != null) {
									Static352.method5248();
									Static79.method1251(local30, Static307.aClass100_6, local97, local102);
									Static64.aBooleanArray5[local70] = true;
									Static307.aClass100_6.da(arg2, arg0, arg4, arg1);
								}
								continue;
							}
							if (Static166.anInt3524 == local30.anInt5090) {
								if (local30.method4250(Static307.aClass100_6) != null) {
									Static62.method979(local30, local97, local102);
									Static64.aBooleanArray5[local70] = true;
									Static307.aClass100_6.da(arg2, arg0, arg4, arg1);
								}
								continue;
							}
							if (local30.anInt5090 == Static248.anInt4653) {
								Static490.method6861(local102, Static307.aClass100_6, local97, local30.anInt5078, local30.anInt5130, Static391.anInterface5_8);
								Static295.aBooleanArray36[local70] = true;
								Static307.aClass100_6.da(arg2, arg0, arg4, arg1);
								continue;
							}
							if (Static483.anInt8217 == local30.anInt5090) {
								Static299.method4539(local97, local30.anInt5078, local30.anInt5130, local102, Static307.aClass100_6);
								Static295.aBooleanArray36[local70] = true;
								Static307.aClass100_6.da(arg2, arg0, arg4, arg1);
								continue;
							}
							if (local30.anInt5090 == Static60.anInt1377) {
								if (!Static489.aBoolean647 && !Static208.aBoolean326) {
									continue;
								}
								local254 = local30.anInt5130 + local97;
								local259 = local102 + 15;
								if (Static489.aBoolean647) {
									local509 = -256;
									if (Static156.anInt8495 < 20) {
										local509 = -65536;
									}
									Static412.aClass29_2.method7117(local254, local259, "Fps:" + Static156.anInt8495, local509, -1);
									local259 += 15;
									@Pc(533) Runtime local533 = Runtime.getRuntime();
									local543 = (int) ((local533.totalMemory() - local533.freeMemory()) / 1024L);
									local545 = -256;
									if (local543 > 98304) {
										local545 = -65536;
										if (Static57.aBoolean99) {
											Static141.method2402();
											for (local558 = 0; local558 < 10; local558++) {
												System.gc();
											}
											local543 = (int) ((local533.totalMemory() - local533.freeMemory()) / 1024L);
											if (local543 > 65536) {
												Static52.method905("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static412.aClass29_2.method7117(local254, local259, "Mem:" + local543 + "k", local545, -1);
									local259 += 15;
									Static412.aClass29_2.method7117(local254, local259, "In:" + Static263.anInt4843 + "B/s Out:" + Static435.anInt878 + "B/s", -256, -1);
									local259 += 15;
									local558 = Static307.aClass100_6.b() / 1024;
									Static412.aClass29_2.method7117(local254, local259, "Offheap:" + local558 + "k", local558 > 65536 ? -65536 : -256, -1);
									local259 += 15;
									local653 = 0;
									@Pc(655) int local655 = 0;
									@Pc(657) int local657 = 0;
									for (@Pc(659) int local659 = 0; local659 < 35; local659++) {
										if (Static443.aClass251_Sub1Array2[local659] != null) {
											local653 += Static443.aClass251_Sub1Array2[local659].method5871();
											local655 += Static443.aClass251_Sub1Array2[local659].method5867();
											local657 += Static443.aClass251_Sub1Array2[local659].method5870();
										}
									}
									@Pc(701) int local701 = local657 * 100 / local653;
									@Pc(707) int local707 = local655 * 10000 / local653;
									@Pc(727) String local727 = "Cache:" + Static35.method634(0, (long) local707, true, 2) + "% (" + local701 + "%)";
									Static45.aClass29_3.method7117(local254, local259, local727, -256, -1);
									local259 += 12;
								}
								if (Static79.anInt1726 > 0) {
									Static45.aClass29_3.method7117(local254, local259, "Particles: " + Static318.anInt5929 + " / " + Static79.anInt1726, -256, -1);
								}
								local259 += 12;
								if (Static208.aBoolean326) {
									Static45.aClass29_3.method7117(local254, local259, "Polys: " + Static307.aClass100_6.DA() + " Models: " + Static307.aClass100_6.T(), -256, -1);
									local259 += 12;
									Static45.aClass29_3.method7117(local254, local259, "Ls: " + Static517.anInt8582 + " La: " + Static35.anInt905 + " NPC: " + Static164.anInt3484 + " Pl: " + Static338.anInt6210, -256, -1);
									Static84.method1348();
									local259 += 12;
								}
								Static295.aBooleanArray36[local70] = true;
								continue;
							}
						}
						if (local30.anInt5098 == 0) {
							if (Static126.anInt5706 == local30.anInt5090 && Static307.aClass100_6.method6248()) {
								Static307.aClass100_6.method6233(local97, local102, local30.anInt5130, local30.anInt5078);
							}
							method728(local164, local301, local160, local97 - local30.anInt5125, local294, local70, arg6, local102 - local30.anInt5115, local30.anInt5112);
							if (local30.aClass196Array2 != null) {
								method728(local164, local301, local160, local97 - local30.anInt5125, local294, local70, local30.aClass196Array2, local102 - local30.anInt5115, local30.anInt5112);
							}
							@Pc(897) Class2_Sub44 local897 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local30.anInt5112);
							if (local897 != null) {
								Static393.method5766(local102, local301, local70, local294, local897.anInt8608, local160, local164, local97);
							}
							if (Static126.anInt5706 == local30.anInt5090 && Static307.aClass100_6.method6248()) {
								Static307.aClass100_6.method6198();
							}
							Static307.aClass100_6.da(arg2, arg0, arg4, arg1);
						}
						if (Static493.aBooleanArray35[local70] || Static318.anInt5934 > 1) {
							if (local30.anInt5098 == 3) {
								if (local105 == 0) {
									if (local30.aBoolean401) {
										Static307.aClass100_6.J(local97, local102, local30.anInt5130, local30.anInt5078, local30.anInt5083, 0);
									} else {
										Static307.aClass100_6.method6212(local97, local102, local30.anInt5130, local30.anInt5078, local30.anInt5083, 0);
									}
								} else if (local30.aBoolean401) {
									Static307.aClass100_6.J(local97, local102, local30.anInt5130, local30.anInt5078, 255 - (local105 & 0xFF) << 24 | local30.anInt5083 & 0xFFFFFF, 1);
								} else {
									Static307.aClass100_6.method6212(local97, local102, local30.anInt5130, local30.anInt5078, 255 - (local105 & 0xFF) << 24 | local30.anInt5083 & 0xFFFFFF, 1);
								}
							} else if (local30.anInt5098 == 4) {
								@Pc(1041) Class29 local1041 = local30.method4251(Static307.aClass100_6);
								if (local1041 != null) {
									local259 = local30.anInt5083;
									@Pc(1056) String local1056 = local30.aString42;
									if (local30.anInt5152 != -1) {
										@Pc(1067) Class339 local1067 = Static296.aClass218_1.method5067(local30.anInt5152);
										local1056 = local1067.aString97;
										if (local1056 == null) {
											local1056 = "null";
										}
										if ((local1067.anInt8988 == 1 || local30.anInt5165 != 1) && local30.anInt5165 != -1) {
											local1056 = "<col=ff9040>" + local1056 + "</col> x" + Static333.method5104(local30.anInt5165);
										}
									}
									if (Static454.aClass196_9 == local30) {
										local1056 = Static290.aClass198_33.method4365(Static52.anInt1264);
										local259 = local30.anInt5083;
									}
									if (Static250.aBoolean380) {
										Static307.aClass100_6.V(local97, local102, local97 + local30.anInt5130, local30.anInt5078 + local102);
									}
									local1041.method7116(local30.aBoolean413 ? 255 - (local105 & 0xFF) << 24 : -1, null, local1056, local102, 255 - (local105 & 0xFF) << 24 | local259, null, 0, local30.anInt5121, local97, local30.anInt5130, Static491.aClass39Array13, 0, local30.anInt5086, local30.anInt5107, local30.anInt5078, local30.anInt5123);
									if (Static250.aBoolean380) {
										Static307.aClass100_6.da(arg2, arg0, arg4, arg1);
									}
								} else if (Static150.aBoolean243) {
									Static515.method7134(local30);
								}
							} else {
								@Pc(1268) int local1268;
								if (local30.anInt5098 == 5) {
									if (local30.anInt5150 < 0) {
										@Pc(1204) Class39 local1204;
										if (local30.anInt5152 == -1) {
											local1204 = local30.method4245(Static307.aClass100_6);
										} else {
											@Pc(1214) Class194 local1214 = local30.aBoolean405 ? Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1 : null;
											local1204 = Static296.aClass218_1.method5060(local30.anInt5157 | 0xFF000000, local30.anInt5152, local1214, Static307.aClass100_6, local30.anInt5165, local30.anInt5143, local30.anInt5158);
										}
										if (local1204 != null) {
											local259 = local1204.A();
											local509 = local1204.ca();
											local1268 = 255 - (local105 & 0xFF) << 24 | (local30.anInt5083 == 0 ? 16777215 : local30.anInt5083 & 0xFFFFFF);
											if (local30.aBoolean417) {
												Static307.aClass100_6.V(local97, local102, local30.anInt5130 + local97, local30.anInt5078 + local102);
												if (local30.anInt5109 != 0) {
													local543 = (local259 + local30.anInt5130 - 1) / local259;
													local545 = (local30.anInt5078 + local509 - 1) / local509;
													for (local558 = 0; local558 < local543; local558++) {
														for (local653 = 0; local653 < local545; local653++) {
															if (local30.anInt5083 == 0) {
																local1204.method7857((float) local259 / 2.0F + (float) (local558 * local259 + local97), (float) local509 / 2.0F + (float) (local102 - -(local653 * local509)), 4096, local30.anInt5109);
															} else {
																local1204.method7849((float) (local97 + local558 * local259) + (float) local259 / 2.0F, (float) (local102 + local509 * local653) + (float) local509 / 2.0F, 4096, local30.anInt5109, local1268);
															}
														}
													}
												} else if (local30.anInt5083 == 0 && local105 == 0) {
													local1204.method7860(local97, local102, local30.anInt5130, local30.anInt5078);
												} else {
													local1204.DA(local97, local102, local30.anInt5130, local30.anInt5078, 0, local1268, 1);
												}
												Static307.aClass100_6.da(arg2, arg0, arg4, arg1);
											} else if (local30.anInt5083 == 0 && local105 == 0) {
												if (local30.anInt5109 != 0) {
													local1204.method7857((float) local97 + (float) local30.anInt5130 / 2.0F, (float) local30.anInt5078 / 2.0F + (float) local102, local30.anInt5130 * 4096 / local259, local30.anInt5109);
												} else if (local259 == local30.anInt5130 && local30.anInt5078 == local509) {
													local1204.method7851(local97, local102);
												} else {
													local1204.method7848(local97, local102, local30.anInt5130, local30.anInt5078);
												}
											} else if (local30.anInt5109 != 0) {
												local1204.method7849((float) local97 + (float) local30.anInt5130 / 2.0F, (float) local102 + (float) local30.anInt5078 / 2.0F, local30.anInt5130 * 4096 / local259, local30.anInt5109, local1268);
											} else if (local259 == local30.anInt5130 && local30.anInt5078 == local509) {
												local1204.V(local97, local102, 0, local1268, 1);
											} else {
												local1204.method7850(local97, local102, local30.anInt5130, local30.anInt5078, 0, local1268, 1);
											}
										} else if (Static150.aBoolean243) {
											Static515.method7134(local30);
										}
									} else {
										local30.method4241(Static197.aClass147_1, Static416.aClass232_1).method7198(0, local97, local102, local30.anInt5078, local30.anInt5135 << 3, local30.anInt5130, 0, local30.anInt5141 << 3, Static307.aClass100_6);
									}
								} else if (local30.anInt5098 == 6) {
									Static238.method3693();
									@Pc(1598) Class66 local1598 = null;
									local259 = 0;
									@Pc(1632) Class84 local1632;
									@Pc(1640) Class194 local1640;
									if (local30.anInt5152 != -1) {
										@Pc(1611) Class339 local1611 = Static296.aClass218_1.method5067(local30.anInt5152);
										if (local1611 != null) {
											local1611 = local1611.method7477(local30.anInt5165);
											local1632 = local30.anInt5103 == -1 ? null : Static116.aClass140_2.method3287(local30.anInt5103);
											local1640 = local30.aBoolean405 ? Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1 : null;
											local1598 = local1611.method7484(local30.anInt5101, Static307.aClass100_6, 2048, local1632, local30.anInt5087, local1640, 1, local30.anInt5147);
											if (local1598 == null) {
												Static515.method7134(local30);
											} else {
												local259 = -local1598.J() >> 1;
											}
										}
									} else if (local30.anInt5085 == 5) {
										local509 = local30.anInt5132;
										if (local509 >= 0 && local509 < 2048) {
											@Pc(1692) Class6_Sub1_Sub1_Sub1_Sub2 local1692 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local509];
											@Pc(1704) Class84 local1704 = local30.anInt5103 == -1 ? null : Static116.aClass140_2.method3287(local30.anInt5103);
											if (local1692 != null && (Static222.anInt4184 == local509 || Static200.method3285(local1692.aString67) == local30.anInt5102)) {
												local1598 = local1692.aClass194_1.method4220(Static8.aClass57_1, Static116.aClass140_2, 2048, Static296.aClass218_1, local1704, Static254.aClass202_2, null, Static70.aClass78_1, local30.anInt5101, -1, null, local30.anInt5087, local30.anInt5147, 0, Static207.aClass354_1, Static307.aClass100_6, 0);
											}
										}
									} else if (local30.anInt5085 == 8 || local30.anInt5085 == 9) {
										@Pc(1830) Class2_Sub23 local1830 = Static124.method1801(false, local30.anInt5132);
										local1632 = local30.anInt5103 == -1 ? null : Static116.aClass140_2.method3287(local30.anInt5103);
										if (local1830 != null) {
											local1640 = local30.aBoolean405 ? Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1 : null;
											local1598 = local1830.method3244(local30.anInt5147, local30.anInt5101, local30.anInt5085 == 9, Static307.aClass100_6, local1640, local30.anInt5087, local30.anInt5102, local1632);
										}
									} else if (local30.anInt5103 == -1) {
										local1598 = local30.method4235(Static307.aClass100_6, Static70.aClass78_1, 0, Static207.aClass354_1, Static296.aClass218_1, Static8.aClass57_1, null, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1, -1, 2048, Static254.aClass202_2, -1, Static116.aClass140_2);
										if (local1598 == null && Static150.aBoolean243) {
											Static515.method7134(local30);
										}
									} else {
										@Pc(1763) Class84 local1763 = Static116.aClass140_2.method3287(local30.anInt5103);
										local1598 = local30.method4235(Static307.aClass100_6, Static70.aClass78_1, local30.anInt5101, Static207.aClass354_1, Static296.aClass218_1, Static8.aClass57_1, local1763, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1, local30.anInt5147, 2048, Static254.aClass202_2, local30.anInt5087, Static116.aClass140_2);
										if (local1598 == null && Static150.aBoolean243) {
											Static515.method7134(local30);
										}
									}
									if (local1598 != null) {
										if (local30.anInt5084 > 0) {
											local509 = (local30.anInt5130 << 9) / local30.anInt5084;
										} else {
											local509 = 512;
										}
										if (local30.anInt5139 > 0) {
											local1268 = (local30.anInt5078 << 9) / local30.anInt5139;
										} else {
											local1268 = 512;
										}
										local543 = local97 + local30.anInt5130 / 2;
										local545 = local30.anInt5078 / 2 + local102;
										if (!local30.aBoolean403) {
											local543 += local509 * local30.anInt5117 >> 9;
											local545 += local1268 * local30.anInt5097 >> 9;
										}
										Static509.aClass68_7.Y();
										Static307.aClass100_6.method6217(Static509.aClass68_7);
										Static307.aClass100_6.la(local543, local545, local509, local1268);
										Static307.aClass100_6.ya();
										if (local30.aBoolean415) {
											Static307.aClass100_6.ZA(false);
										}
										if (local30.aBoolean403) {
											Static46.aClass68_1.oa(local30.anInt5144);
											Static46.aClass68_1.ZA(local30.anInt5133);
											Static46.aClass68_1.AA(local30.anInt5167);
											Static46.aClass68_1.U(local30.anInt5117, local30.anInt5097, local30.anInt5100);
										} else {
											local558 = (local30.anInt5162 << 2) * Class363.anIntArray697[local30.anInt5144 << 3] >> 14;
											local653 = Class363.anIntArray698[local30.anInt5144 << 3] * (local30.anInt5162 << 2) >> 14;
											Static46.aClass68_1.J(-local30.anInt5167 << 3);
											Static46.aClass68_1.ZA(local30.anInt5133 << 3);
											Static46.aClass68_1.U(local30.anInt5153 << 2, local259 + local558 + (local30.anInt5149 << 2), local653 - -(local30.anInt5149 << 2));
											Static46.aClass68_1.w(local30.anInt5144 << 3);
										}
										local30.method4240(local1598, Static46.aClass68_1, Static307.aClass100_6, Static412.anInt575);
										if (Static250.aBoolean380) {
											Static307.aClass100_6.V(local97, local102, local30.anInt5130 + local97, local102 - -local30.anInt5078);
										}
										if (local30.aBoolean403) {
											if (local30.aBoolean402) {
												local1598.method7556(Static46.aClass68_1, null, local30.anInt5162, 1);
											} else {
												local1598.method7558(Static46.aClass68_1, null, 1);
												if (local30.aClass6_Sub8_5 != null) {
													Static307.aClass100_6.method6193(local30.aClass6_Sub8_5.method7151());
												}
											}
										} else if (local30.aBoolean402) {
											local1598.method7556(Static46.aClass68_1, null, local30.anInt5162 << 2, 1);
										} else {
											local1598.method7558(Static46.aClass68_1, null, 1);
											if (local30.aClass6_Sub8_5 != null) {
												Static307.aClass100_6.method6193(local30.aClass6_Sub8_5.method7151());
											}
										}
										if (Static250.aBoolean380) {
											Static307.aClass100_6.da(arg2, arg0, arg4, arg1);
										}
										if (local30.aBoolean415) {
											Static307.aClass100_6.ZA(true);
										}
									}
								} else if (local30.anInt5098 == 9) {
									if (local30.aBoolean411) {
										local1268 = local102;
										local509 = local30.anInt5130 + local97;
										local259 = local102 + local30.anInt5078;
									} else {
										local1268 = local30.anInt5078 + local102;
										local259 = local102;
										local509 = local30.anInt5130 + local97;
									}
									if (local30.anInt5105 == 1) {
										Static307.aClass100_6.method6190(local97, local259, local509, local1268, local30.anInt5083, 0);
									} else {
										Static307.aClass100_6.method6241(local97, local259, local509, local1268, local30.anInt5083, local30.anInt5105);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!fn;IIII)V")
	public static void method729(@OriginalArg(0) Class2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg2 << 14 | arg1 << 28 | arg3);
		@Pc(22) Class2_Sub40 local22 = (Class2_Sub40) Static261.aClass162_35.method3519(local16);
		if (local22 == null) {
			local22 = new Class2_Sub40();
			Static261.aClass162_35.method3522(local22, local16);
			local22.aClass8_57.method212(arg0);
			return;
		}
		@Pc(49) Class339 local49 = Static296.aClass218_1.method5067(arg0.anInt3007);
		@Pc(52) int local52 = local49.anInt8997;
		if (local49.anInt8988 == 1) {
			local52 *= arg0.anInt3006 + 1;
		}
		for (@Pc(71) Class2_Sub18 local71 = (Class2_Sub18) local22.aClass8_57.method210(); local71 != null; local71 = (Class2_Sub18) local22.aClass8_57.method218()) {
			local49 = Static296.aClass218_1.method5067(local71.anInt3007);
			@Pc(82) int local82 = local49.anInt8997;
			if (local49.anInt8988 == 1) {
				local82 *= local71.anInt3006 + 1;
			}
			if (local82 < local52) {
				Static398.method7273(arg0, local71);
				return;
			}
		}
		local22.aClass8_57.method212(arg0);
	}
}
