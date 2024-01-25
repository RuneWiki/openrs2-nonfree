import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
	public static final int[] anIntArray67 = new int[6];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!gi;)Lclient!vp;")
	public static Class2_Sub45 method860(@OriginalArg(0) Class93 arg0) {
		@Pc(13) Class2_Sub45 local13 = (Class2_Sub45) Static439.aClass220_43.method5099(((long) arg0.anInt2508 << 32) + (long) arg0.anInt2424);
		return local13 == null ? arg0.aClass2_Sub45_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method862() {
		Static183.anInt3212 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static458.anInt7721; local3++) {
			@Pc(14) Class11_Sub5_Sub2_Sub2 local14 = ((Class2_Sub34) Static400.aClass220_41.method5099((long) Static164.anIntArray253[local3])).aClass11_Sub5_Sub2_Sub2_2;
			if (local14.aBoolean513 && local14.method6217() != -1) {
				@Pc(32) int local32 = (local14.method6215() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt7626 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt7622 - local32 >> 7;
				@Pc(53) Class11_Sub5_Sub2 local53 = Static310.method4451(local39, local14.aByte101, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt7670;
					if (local53 instanceof Class11_Sub5_Sub2_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt7642 == 0 && local53.method6217() != -1) {
						Static268.anIntArray403[Static183.anInt3212] = local58;
						Static83.anIntArray99[Static183.anInt3212] = local58;
						Static183.anInt3212++;
						local53.anInt7642++;
					}
					Static268.anIntArray403[Static183.anInt3212] = local58;
					Static83.anIntArray99[Static183.anInt3212] = local14.anInt7670 + 2048;
					Static183.anInt3212++;
					local53.anInt7642++;
				}
			}
		}
		Static30.method510(Static83.anIntArray99, Static268.anIntArray403, Static183.anInt3212 - 1, 0);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method863(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static121.anInt2062;
		@Pc(3) int[] local3 = Static311.anIntArray474;
		@Pc(11) int local11 = Static162.aBoolean185 ? local1 : local1 + Static458.anInt7721;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub5_Sub2 local23;
			if (local13 < local1) {
				local23 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub34) Static400.aClass220_41.method5099((long) Static164.anIntArray253[local13 - local1])).aClass11_Sub5_Sub2_Sub2_2;
			}
			if (local23.aByte101 == arg0) {
				local23.anInt7642 = 0;
				if (local23.anInt7699 < 0) {
					local23.aBoolean513 = false;
				} else {
					@Pc(54) int local54 = local23.method6215();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt7626 & 0x7F) != 0 || (local23.anInt7622 & 0x7F) != 0) {
							local23.aBoolean513 = false;
							continue;
						}
					} else if ((local23.anInt7626 & 0x7F) != 64 || (local23.anInt7622 & 0x7F) != 64) {
						local23.aBoolean513 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt7626 >> 7;
						local101 = local23.anInt7622 >> 7;
						if (local23.anInt7699 != Static404.anIntArrayArray61[local96][local101]) {
							local23.aBoolean513 = true;
							continue;
						}
						if (Static51.anIntArrayArray26[local96][local101] > 1) {
							local126 = Static51.anIntArrayArray26[local96][local101]--;
							local23.aBoolean513 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt7626 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt7622 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt7626 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt7622 + local96 >> 7;
						if (!Static346.method4874(local23.anInt7699, local162, local169, local101, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt7699 == Static404.anIntArrayArray61[local180][local183]) {
										local126 = Static51.anIntArrayArray26[local180][local183]--;
									}
								}
							}
							local23.aBoolean513 = true;
							continue;
						}
					}
					if (local23 instanceof Class11_Sub5_Sub2_Sub1 && local23.aClass2_Sub28_3 != null && Static277.anInt5022 >= local23.aClass2_Sub28_3.anInt5052 && Static277.anInt5022 < local23.aClass2_Sub28_3.anInt5050) {
						((Class11_Sub5_Sub2_Sub1) local23).aBoolean145 = false;
					}
					local23.aBoolean513 = false;
					local23.anInt7624 = Static365.method3535(local23.aByte101, local23.anInt7626, local23.anInt7622);
					Static252.method3490(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!gi;)Lclient!gi;")
	public static Class93 method866(@OriginalArg(0) Class93 arg0) {
		@Pc(4) int local4 = method860(arg0).method5903();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static160.method2380(arg0.anInt2426);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method867(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static121.anInt2062;
		@Pc(3) int[] local3 = Static311.anIntArray474;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static458.anInt7721; local5++) {
			@Pc(15) Class11_Sub5_Sub2 local15;
			if (local5 < local1) {
				local15 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class2_Sub34) Static400.aClass220_41.method5099((long) Static164.anIntArray253[local5 - local1])).aClass11_Sub5_Sub2_Sub2_2;
			}
			if (local15.aByte101 == arg0 && local15.anInt7699 >= 0) {
				@Pc(39) int local39 = local15.method6215();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt7626 & 0x7F) != 0 || (local15.anInt7622 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7626 & 0x7F) != 64 || (local15.anInt7622 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt7626 >> 7;
					local80 = local15.anInt7622 >> 7;
					if (local15.anInt7699 > Static404.anIntArrayArray61[local75][local80]) {
						Static404.anIntArrayArray61[local75][local80] = local15.anInt7699;
						Static51.anIntArrayArray26[local75][local80] = 1;
					} else if (local15.anInt7699 == Static404.anIntArrayArray61[local75][local80]) {
						local116 = Static51.anIntArrayArray26[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt7626 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt7622 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt7626 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt7622 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt7699 > Static404.anIntArrayArray61[local158][local161]) {
								Static404.anIntArrayArray61[local158][local161] = local15.anInt7699;
								Static51.anIntArrayArray26[local158][local161] = 1;
							} else if (local15.anInt7699 == Static404.anIntArrayArray61[local158][local161]) {
								local116 = Static51.anIntArrayArray26[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method869() {
		@Pc(1) int local1 = Static121.anInt2062;
		@Pc(3) int[] local3 = Static311.anIntArray474;
		@Pc(20) boolean local20 = Static434.aClass165_Sub1_1.anInt4215 == 1 && local1 > 200 || Static434.aClass165_Sub1_1.anInt4215 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class11_Sub5_Sub2_Sub1 local29 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local3[local22]];
			if (local29.method2104()) {
				local29.method6214();
				if (local29.aShort108 >= 0 && local29.aShort109 >= 0 && local29.aShort107 < Static234.anInt3949 && local29.aShort106 < Static371.anInt6492) {
					local29.aBoolean145 = local29.aBoolean514 ? local20 : false;
					if (local29 == Static127.aClass11_Sub5_Sub2_Sub1_2) {
						local29.anInt7699 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean513) {
							local75++;
						}
						if (local29.anInt7690 > Static277.anInt5022) {
							local75 += 2;
						}
						local75 += 5 - local29.method6215() << 2;
						if (local29.aBoolean144) {
							local75 += 512;
						} else {
							if (Static264.anInt4626 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt7699 = local75 + 1;
					}
				} else {
					local29.anInt7699 = -1;
				}
			} else {
				local29.anInt7699 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static458.anInt7721; local116++) {
			@Pc(127) Class11_Sub5_Sub2_Sub2 local127 = ((Class2_Sub34) Static400.aClass220_41.method5099((long) Static164.anIntArray253[local116])).aClass11_Sub5_Sub2_Sub2_2;
			if (local127.method6236() && local127.aClass82_1.method1887(Static63.aClass120_2)) {
				local127.method6214();
				if (local127.aShort108 >= 0 && local127.aShort109 >= 0 && local127.aShort107 < Static234.anInt3949 && local127.aShort106 < Static371.anInt6492) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean513) {
						local164++;
					}
					if (local127.anInt7690 > Static277.anInt5022) {
						local164 += 2;
					}
					local164 += 5 - local127.method6215() << 2;
					if (Static264.anInt4626 == 0) {
						if (local127.aClass82_1.aBoolean118) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static264.anInt4626 == 1) {
						if (local127.aClass82_1.aBoolean118) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass82_1.aBoolean116) {
						local164 += 1024;
					} else if (!local127.aClass82_1.aBoolean113) {
						local164 += 256;
					}
					local127.anInt7699 = local164 + 1;
				} else {
					local127.anInt7699 = -1;
				}
			} else {
				local127.anInt7699 = -1;
			}
		}
		for (local75 = 0; local75 < Static223.aClass166Array1.length; local75++) {
			@Pc(230) Class166 local230 = Static223.aClass166Array1[local75];
			if (local230 != null) {
				if (local230.anInt4251 == 1) {
					@Pc(244) Class2_Sub34 local244 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local230.anInt4246);
					if (local244 != null) {
						@Pc(249) Class11_Sub5_Sub2_Sub2 local249 = local244.aClass11_Sub5_Sub2_Sub2_2;
						if (local249.anInt7699 >= 0) {
							local249.anInt7699 += 2048;
						}
					}
				} else if (local230.anInt4251 == 10) {
					@Pc(268) Class11_Sub5_Sub2_Sub1 local268 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local230.anInt4246];
					if (local268 != null && local268 != Static127.aClass11_Sub5_Sub2_Sub1_2 && local268.anInt7699 >= 0) {
						local268.anInt7699 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!gi;IIIIIIIII)V")
	public static void method870(@OriginalArg(0) Class93[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class93 local6 = arg0[local1];
			if (local6 != null && local6.anInt2426 == arg1) {
				@Pc(17) int local17 = local6.anInt2460 + arg6;
				@Pc(22) int local22 = local6.anInt2448 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2494 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2436;
					@Pc(45) int local45 = local22 + local6.anInt2495;
					if (local6.anInt2494 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2494 == 0 || local6.aBoolean158 || method860(local6).anInt7337 != 0 || local6 == Static148.aClass93_8 || local6.anInt2469 == Static64.anInt1149) {
					if (!method876(local6)) {
						if (local6 == Static125.aClass93_11) {
							Static144.aBoolean168 = true;
							Static48.anInt784 = local17;
							Static108.anInt1832 = local22;
						}
						if (local6.aBoolean149 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean150 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class2_Sub18 local148 = (Class2_Sub18) Static406.aClass181_46.method3972(); local148 != null; local148 = (Class2_Sub18) Static406.aClass181_46.method3975()) {
									if (local148.aBoolean193) {
										local148.method6260();
										local148.aClass93_10.aBoolean155 = false;
									}
								}
								if (Static383.anInt6622 == 0) {
									Static125.aClass93_11 = null;
									Static148.aClass93_8 = null;
								}
								Static102.anInt1595 = 0;
								Static86.aBoolean87 = false;
								Static191.aBoolean215 = false;
								if (!Static45.aBoolean34) {
									Static461.method6252();
								}
							}
							@Pc(204) boolean local204;
							if (Static196.aClass126_1.method5366() >= local28 && Static196.aClass126_1.method5364() >= local30 && Static196.aClass126_1.method5366() < local32 && Static196.aClass126_1.method5364() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static11.aBoolean7 && local204) {
								if (local6.anInt2422 >= 0) {
									Static236.anInt3995 = local6.anInt2422;
								} else if (local6.aBoolean150) {
									Static236.anInt3995 = -1;
								}
							}
							if (!Static45.aBoolean34 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static175.method2563(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(248) boolean local248 = false;
							if (Static196.aClass126_1.method5358() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class2_Sub11 local263 = (Class2_Sub11) Static292.aClass181_26.method3972();
							if (local263 != null && local263.method4364() == 0 && local263.method4365() >= local28 && local263.method4368() >= local30 && local263.method4365() < local32 && local263.method4368() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray29 != null) {
								for (local296 = 0; local296 < local6.aByteArray29.length; local296++) {
									if (Static161.aClass115_1.method2374(local6.aByteArray29[local296])) {
										if (local6.anIntArray204 == null || Static277.anInt5022 >= local6.anIntArray204[local296]) {
											@Pc(328) byte local328 = local6.aByteArray28[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static161.aClass115_1.method2374(86) && !Static161.aClass115_1.method2374(82) && !Static161.aClass115_1.method2374(81)) && ((local328 & 0x2) == 0 || Static161.aClass115_1.method2374(86)) && ((local328 & 0x1) == 0 || Static161.aClass115_1.method2374(82)) && ((local328 & 0x4) == 0 || Static161.aClass115_1.method2374(81))) {
												if (local296 < 10) {
													Static254.method3555(-1, local296 + 1, local6.anInt2508, "");
												} else if (local296 == 10) {
													Static465.method5985();
													@Pc(399) Class2_Sub45 local399 = method860(local6);
													Static181.method2418(local399.anInt7334, local399.method5901(), local6);
													Static88.aString38 = Static332.method4735(local6);
													if (Static88.aString38 == null) {
														Static88.aString38 = "Null";
													}
													Static359.aString66 = local6.aString21 + "<col=ffffff>";
												}
												local430 = local6.anIntArray200[local296];
												if (local6.anIntArray204 == null) {
													local6.anIntArray204 = new int[local6.aByteArray29.length];
												}
												if (local430 == 0) {
													local6.anIntArray204[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray204[local296] = Static277.anInt5022 + local430;
												}
											}
										}
									} else if (local6.anIntArray204 != null) {
										local6.anIntArray204[local296] = 0;
									}
								}
							}
							if (local258) {
								Static306.method4379(local263.method4368() - local22, local6, local263.method4365() - local17);
							}
							if (Static125.aClass93_11 != null && Static125.aClass93_11 != local6 && local204 && method860(local6).method5897()) {
								Static240.aClass93_14 = local6;
							}
							if (local6 == Static148.aClass93_8) {
								Static227.aBoolean255 = true;
								Static146.anInt2670 = local17;
								Static20.anInt410 = local22;
							}
							if (local6.aBoolean158 || local6.anInt2469 != 0) {
								@Pc(515) Class2_Sub18 local515;
								if (local204 && Static72.anInt1221 != 0 && local6.anObjectArray11 != null) {
									local515 = new Class2_Sub18();
									local515.aBoolean193 = true;
									local515.aClass93_10 = local6;
									local515.anInt3061 = Static72.anInt1221;
									local515.anObjectArray33 = local6.anObjectArray11;
									Static406.aClass181_46.method3973(local515);
								}
								if (Static125.aClass93_11 != null || Static45.aBoolean34 || local6.anInt2469 != Static417.anInt7159 && Static102.anInt1595 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt2469 != 0) {
									if (local6.anInt2469 == Static414.anInt7109 || local6.anInt2469 == Static141.anInt7047) {
										Static35.aClass93_3 = local6;
										if (Static454.aClass247_1 != null) {
											Static454.aClass247_1.method5666(Static257.aClass75_8, local6.anInt2495);
										}
										if (local6.anInt2469 == Static414.anInt7109) {
											if (!Static45.aBoolean34 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static238.method3235(Static257.aClass75_8, arg8, arg9);
												for (@Pc(598) Class28_Sub3 local598 = (Class28_Sub3) Static155.aClass97_3.method2145(); local598 != null; local598 = (Class28_Sub3) Static155.aClass97_3.method2148()) {
													if (arg8 >= local598.anInt1847 && arg8 < local598.anInt1844 && arg9 >= local598.anInt1843 && arg9 < local598.anInt1845) {
														Static461.method6252();
														Static107.method1777(local598.aClass11_Sub5_Sub2_1);
													}
												}
											}
											Static74.method1136(local6, local22, local17);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt2469 == Static64.anInt1149) {
										if (local6.method2124(Static257.aClass75_8) == null || Static433.anInt7312 != 0 && Static433.anInt7312 != 3 || Static45.aBoolean34 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray207[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray202[local670]) {
											continue;
										}
										local296 -= local6.anInt2436 / 2;
										local670 -= local6.anInt2495 / 2;
										if (Static25.anInt7273 == 4) {
											local709 = (int) Static37.aFloat9 & 0x3FFF;
										} else {
											local709 = (int) Static37.aFloat9 + Static149.anInt7397 & 0x3FFF;
										}
										@Pc(721) int local721 = Class229.anIntArray537[local709];
										@Pc(725) int local725 = Class229.anIntArray536[local709];
										if (Static25.anInt7273 != 4) {
											local721 = local721 * (Static148.anInt2711 + 256) >> 8;
											local725 = local725 * (Static148.anInt2711 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static25.anInt7273 == 4) {
											local775 = (Static188.anInt6693 >> 7) + (local754 >> 2);
											local783 = (Static235.anInt3979 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static127.aClass11_Sub5_Sub2_Sub1_2.method6215() - 1) * 64;
											local775 = (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 - local792 >> 7) + (local754 >> 2);
											local783 = (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 - local792 >> 7) - (local764 >> 2);
										}
										if (Static11.aBoolean7 && (Static331.anInt5940 & 0x40) != 0) {
											@Pc(825) Class93 local825 = Static34.method566(Static238.anInt4001, Static329.anInt5889);
											if (local825 == null) {
												Static465.method5985();
											} else {
												Static202.method2833(1L, local783, true, false, " ->", local6.anInt2488, local775, Static88.aString38, 25, Static252.anInt4355);
											}
											continue;
										}
										if (Static10.aClass200_1 == Static201.aClass200_4) {
											Static202.method2833(1L, local783, true, false, "", -1, local775, Static431.aClass231_121.method5261(Static80.anInt6195), 60, -1);
										}
										Static202.method2833(1L, local783, true, false, "", -1, local775, Static20.aString3, 47, Static448.anInt7474);
										continue;
									}
									if (local6.anInt2469 == Static417.anInt7159) {
										Static415.aClass93_18 = local6;
										if (local204) {
											Static86.aBoolean87 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method4365() - local17 - local6.anInt2436 / 2) * 2.0D / (double) Static5.aFloat88);
											local670 = (int) -((double) (local263.method4368() - local22 - local6.anInt2495 / 2) * 2.0D / (double) Static5.aFloat88);
											local430 = Static204.anInt3501 + local296 + Static5.anInt6721;
											local709 = Static180.anInt3183 + local670 + Static5.anInt6729;
											@Pc(939) Class2_Sub1_Sub14 local939 = Static308.method4421();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method4554(local944, local430, local709);
											if (local944 != null) {
												if (Static161.aClass115_1.method2374(82) && Static81.anInt1300 > 0) {
													Static35.method575(local944[1], local944[0], local944[2]);
													continue;
												}
												Static191.aBoolean215 = true;
												Static195.anInt3387 = local944[0];
												Static394.anInt7627 = local944[1];
												Static410.anInt7045 = local944[2];
											}
											Static102.anInt1595 = 1;
											Static333.aBoolean421 = false;
											Static86.anInt1457 = Static196.aClass126_1.method5366();
											Static321.anInt5761 = Static196.aClass126_1.method5364();
											continue;
										}
										if (local248 && Static102.anInt1595 > 0) {
											if (Static102.anInt1595 == 1 && (Static86.anInt1457 != Static196.aClass126_1.method5366() || Static321.anInt5761 != Static196.aClass126_1.method5364())) {
												Static14.anInt331 = Static204.anInt3501;
												Static7.anInt111 = Static180.anInt3183;
												Static102.anInt1595 = 2;
											}
											if (Static102.anInt1595 == 2) {
												Static333.aBoolean421 = true;
												Static292.method4125(Static14.anInt331 + (int) ((double) (Static86.anInt1457 - Static196.aClass126_1.method5366()) * 2.0D / (double) Static5.aFloat87));
												Static384.method5270(Static7.anInt111 - (int) ((double) (Static321.anInt5761 - Static196.aClass126_1.method5364()) * 2.0D / (double) Static5.aFloat87));
											}
											continue;
										}
										if (Static102.anInt1595 > 0 && !Static333.aBoolean421) {
											if ((Static157.anInt2846 == 1 || Static195.method2783()) && Static377.anInt6585 > 2) {
												Static203.method2866(Static321.anInt5761, Static86.anInt1457);
											} else if (Static207.method2917()) {
												Static203.method2866(Static321.anInt5761, Static86.anInt1457);
											}
										}
										Static102.anInt1595 = 0;
										continue;
									}
									if (local6.anInt2469 == Static45.anInt720) {
										if (local248) {
											Static189.method2743(local6.anInt2495, local6.anInt2436, Static196.aClass126_1.method5364() - local22, Static196.aClass126_1.method5366() - local17);
										}
										continue;
									}
									if (local6.anInt2469 == Static331.anInt5941) {
										Static437.method5904(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean156 && local258) {
									local6.aBoolean156 = true;
									if (local6.anObjectArray31 != null) {
										local515 = new Class2_Sub18();
										local515.aBoolean193 = true;
										local515.aClass93_10 = local6;
										local515.anInt3059 = local263.method4365() - local17;
										local515.anInt3061 = local263.method4368() - local22;
										local515.anObjectArray33 = local6.anObjectArray31;
										Static406.aClass181_46.method3973(local515);
									}
								}
								if (local6.aBoolean156 && local248 && local6.anObjectArray20 != null) {
									local515 = new Class2_Sub18();
									local515.aBoolean193 = true;
									local515.aClass93_10 = local6;
									local515.anInt3059 = Static196.aClass126_1.method5366() - local17;
									local515.anInt3061 = Static196.aClass126_1.method5364() - local22;
									local515.anObjectArray33 = local6.anObjectArray20;
									Static406.aClass181_46.method3973(local515);
								}
								if (local6.aBoolean156 && !local248) {
									local6.aBoolean156 = false;
									if (local6.anObjectArray13 != null) {
										local515 = new Class2_Sub18();
										local515.aBoolean193 = true;
										local515.aClass93_10 = local6;
										local515.anInt3059 = Static196.aClass126_1.method5366() - local17;
										local515.anInt3061 = Static196.aClass126_1.method5364() - local22;
										local515.anObjectArray33 = local6.anObjectArray13;
										Static426.aClass181_48.method3973(local515);
									}
								}
								if (local248 && local6.anObjectArray32 != null) {
									local515 = new Class2_Sub18();
									local515.aBoolean193 = true;
									local515.aClass93_10 = local6;
									local515.anInt3059 = Static196.aClass126_1.method5366() - local17;
									local515.anInt3061 = Static196.aClass126_1.method5364() - local22;
									local515.anObjectArray33 = local6.anObjectArray32;
									Static406.aClass181_46.method3973(local515);
								}
								if (!local6.aBoolean155 && local204) {
									local6.aBoolean155 = true;
									if (local6.anObjectArray6 != null) {
										local515 = new Class2_Sub18();
										local515.aBoolean193 = true;
										local515.aClass93_10 = local6;
										local515.anInt3059 = Static196.aClass126_1.method5366() - local17;
										local515.anInt3061 = Static196.aClass126_1.method5364() - local22;
										local515.anObjectArray33 = local6.anObjectArray6;
										Static406.aClass181_46.method3973(local515);
									}
								}
								if (local6.aBoolean155 && local204 && local6.anObjectArray27 != null) {
									local515 = new Class2_Sub18();
									local515.aBoolean193 = true;
									local515.aClass93_10 = local6;
									local515.anInt3059 = Static196.aClass126_1.method5366() - local17;
									local515.anInt3061 = Static196.aClass126_1.method5364() - local22;
									local515.anObjectArray33 = local6.anObjectArray27;
									Static406.aClass181_46.method3973(local515);
								}
								if (local6.aBoolean155 && !local204) {
									local6.aBoolean155 = false;
									if (local6.anObjectArray7 != null) {
										local515 = new Class2_Sub18();
										local515.aBoolean193 = true;
										local515.aClass93_10 = local6;
										local515.anInt3059 = Static196.aClass126_1.method5366() - local17;
										local515.anInt3061 = Static196.aClass126_1.method5364() - local22;
										local515.anObjectArray33 = local6.anObjectArray7;
										Static426.aClass181_48.method3973(local515);
									}
								}
								if (local6.anObjectArray24 != null) {
									local515 = new Class2_Sub18();
									local515.aClass93_10 = local6;
									local515.anObjectArray33 = local6.anObjectArray24;
									Static300.aClass181_29.method3973(local515);
								}
								@Pc(1483) Class2_Sub18 local1483;
								if (local6.anObjectArray5 != null && Static252.anInt4351 > local6.anInt2420) {
									if (local6.anIntArray199 == null || Static252.anInt4351 - local6.anInt2420 > 32) {
										local515 = new Class2_Sub18();
										local515.aClass93_10 = local6;
										local515.anObjectArray33 = local6.anObjectArray5;
										Static406.aClass181_46.method3973(local515);
									} else {
										label678: for (local296 = local6.anInt2420; local296 < Static252.anInt4351; local296++) {
											local670 = Static242.anIntArray379[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray199.length; local430++) {
												if (local6.anIntArray199[local430] == local670) {
													local1483 = new Class2_Sub18();
													local1483.aClass93_10 = local6;
													local1483.anObjectArray33 = local6.anObjectArray5;
													Static406.aClass181_46.method3973(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt2420 = Static252.anInt4351;
								}
								if (local6.anObjectArray4 != null && Static461.anInt7748 > local6.anInt2421) {
									if (local6.anIntArray203 == null || Static461.anInt7748 - local6.anInt2421 > 32) {
										local515 = new Class2_Sub18();
										local515.aClass93_10 = local6;
										local515.anObjectArray33 = local6.anObjectArray4;
										Static406.aClass181_46.method3973(local515);
									} else {
										label654: for (local296 = local6.anInt2421; local296 < Static461.anInt7748; local296++) {
											local670 = Static10.anIntArray17[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray203.length; local430++) {
												if (local6.anIntArray203[local430] == local670) {
													local1483 = new Class2_Sub18();
													local1483.aClass93_10 = local6;
													local1483.anObjectArray33 = local6.anObjectArray4;
													Static406.aClass181_46.method3973(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt2421 = Static461.anInt7748;
								}
								if (local6.anObjectArray12 != null && Static46.anInt759 > local6.anInt2480) {
									if (local6.lb == null || Static46.anInt759 - local6.anInt2480 > 32) {
										local515 = new Class2_Sub18();
										local515.aClass93_10 = local6;
										local515.anObjectArray33 = local6.anObjectArray12;
										Static406.aClass181_46.method3973(local515);
									} else {
										label630: for (local296 = local6.anInt2480; local296 < Static46.anInt759; local296++) {
											local670 = Static282.anIntArray422[local296 & 0x1F];
											for (local430 = 0; local430 < local6.lb.length; local430++) {
												if (local6.lb[local430] == local670) {
													local1483 = new Class2_Sub18();
													local1483.aClass93_10 = local6;
													local1483.anObjectArray33 = local6.anObjectArray12;
													Static406.aClass181_46.method3973(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt2480 = Static46.anInt759;
								}
								if (local6.anObjectArray9 != null && Static80.anInt6196 > local6.anInt2464) {
									if (local6.anIntArray206 == null || Static80.anInt6196 - local6.anInt2464 > 32) {
										local515 = new Class2_Sub18();
										local515.aClass93_10 = local6;
										local515.anObjectArray33 = local6.anObjectArray9;
										Static406.aClass181_46.method3973(local515);
									} else {
										label606: for (local296 = local6.anInt2464; local296 < Static80.anInt6196; local296++) {
											local670 = Static213.anIntArray337[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray206.length; local430++) {
												if (local6.anIntArray206[local430] == local670) {
													local1483 = new Class2_Sub18();
													local1483.aClass93_10 = local6;
													local1483.anObjectArray33 = local6.anObjectArray9;
													Static406.aClass181_46.method3973(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt2464 = Static80.anInt6196;
								}
								if (local6.anObjectArray16 != null && Static160.anInt2888 > local6.anInt2440) {
									if (local6.anIntArray201 == null || Static160.anInt2888 - local6.anInt2440 > 32) {
										local515 = new Class2_Sub18();
										local515.aClass93_10 = local6;
										local515.anObjectArray33 = local6.anObjectArray16;
										Static406.aClass181_46.method3973(local515);
									} else {
										label582: for (local296 = local6.anInt2440; local296 < Static160.anInt2888; local296++) {
											local670 = Static141.anIntArray575[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray201.length; local430++) {
												if (local6.anIntArray201[local430] == local670) {
													local1483 = new Class2_Sub18();
													local1483.aClass93_10 = local6;
													local1483.anObjectArray33 = local6.anObjectArray16;
													Static406.aClass181_46.method3973(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt2440 = Static160.anInt2888;
								}
								if (Static171.anInt5503 > local6.anInt2442 && local6.anObjectArray28 != null) {
									local515 = new Class2_Sub18();
									local515.aClass93_10 = local6;
									local515.anObjectArray33 = local6.anObjectArray28;
									Static406.aClass181_46.method3973(local515);
								}
								if (Static115.anInt1936 > local6.anInt2442 && local6.anObjectArray19 != null) {
									local515 = new Class2_Sub18();
									local515.aClass93_10 = local6;
									local515.anObjectArray33 = local6.anObjectArray19;
									Static406.aClass181_46.method3973(local515);
								}
								if (Static72.anInt1223 > local6.anInt2442 && local6.anObjectArray30 != null) {
									local515 = new Class2_Sub18();
									local515.aClass93_10 = local6;
									local515.anObjectArray33 = local6.anObjectArray30;
									Static406.aClass181_46.method3973(local515);
								}
								if (Static89.anInt1080 > local6.anInt2442 && local6.anObjectArray2 != null) {
									local515 = new Class2_Sub18();
									local515.aClass93_10 = local6;
									local515.anObjectArray33 = local6.anObjectArray2;
									Static406.aClass181_46.method3973(local515);
								}
								if (Static29.anInt504 > local6.anInt2442 && local6.anObjectArray25 != null) {
									local515 = new Class2_Sub18();
									local515.aClass93_10 = local6;
									local515.anObjectArray33 = local6.anObjectArray25;
									Static406.aClass181_46.method3973(local515);
								}
								local6.anInt2442 = Static144.anInt2663;
								if (local6.anObjectArray21 != null) {
									for (local296 = 0; local296 < Static210.anInt3599; local296++) {
										@Pc(1951) Class2_Sub18 local1951 = new Class2_Sub18();
										local1951.aClass93_10 = local6;
										local1951.anInt3066 = Static127.anInterface2Array1[local296].method2885();
										local1951.anInt3064 = Static127.anInterface2Array1[local296].method2883();
										local1951.anObjectArray33 = local6.anObjectArray21;
										Static406.aClass181_46.method3973(local1951);
									}
								}
								if (Static135.aBoolean92 && local6.anObjectArray23 != null) {
									local515 = new Class2_Sub18();
									local515.aClass93_10 = local6;
									local515.anObjectArray33 = local6.anObjectArray23;
									Static406.aClass181_46.method3973(local515);
								}
							}
							if (local6.anInt2494 == 5 && local6.anInt2454 != -1) {
								local6.method2119(Static388.aClass35_1, Static174.aClass147_1).method5666(Static257.aClass75_8, local6.anInt2495);
							}
							Static163.method2393(local6);
							if (local6.anInt2494 == 0) {
								method870(arg0, local6.anInt2508, local28, local30, local32, local34, local17 - local6.anInt2451, local22 - local6.anInt2435, arg8, arg9);
								if (local6.aClass93Array1 != null) {
									method870(local6.aClass93Array1, local6.anInt2508, local28, local30, local32, local34, local17 - local6.anInt2451, local22 - local6.anInt2435, arg8, arg9);
								}
								@Pc(2073) Class2_Sub9 local2073 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local6.anInt2508);
								if (local2073 != null) {
									if (Static10.aClass200_1 == Static183.aClass200_3 && local2073.anInt1142 == 0 && !Static45.aBoolean34 && local204 && !Static464.aBoolean176) {
										Static461.method6252();
									}
									Static51.method803(arg9, arg8, local2073.anInt1143, local28, local30, local17, local34, local22, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static163.method2393(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method873() {
		@Pc(1) int local1 = Static121.anInt2062;
		@Pc(3) int[] local3 = Static311.anIntArray474;
		@Pc(11) int local11 = Static162.aBoolean185 ? local1 : local1 + Static458.anInt7721;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub5_Sub2 local23;
			if (local13 < local1) {
				local23 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub34) Static400.aClass220_41.method5099((long) Static164.anIntArray253[local13 - local1])).aClass11_Sub5_Sub2_Sub2_2;
			}
			if (local23.anInt7699 >= 0) {
				@Pc(43) int local43 = local23.method6215();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt7626 & 0x7F) == 0 && (local23.anInt7622 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7626 & 0x7F) == 64 && (local23.anInt7622 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class11_Sub5_Sub2_Sub1 && local23.aClass2_Sub28_3 != null && Static277.anInt5022 >= local23.aClass2_Sub28_3.anInt5052 && Static277.anInt5022 < local23.aClass2_Sub28_3.anInt5050) {
					((Class11_Sub5_Sub2_Sub1) local23).aBoolean145 = false;
				}
				local23.anInt7624 = Static365.method3535(local23.aByte101, local23.anInt7626, local23.anInt7622);
				Static252.method3490(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!gi;)V")
	public static void method875(@OriginalArg(1) Class93 arg0) {
		if (!Static11.aBoolean7) {
			return;
		}
		if (arg0.anObjectArray26 != null) {
			@Pc(14) Class93 local14 = Static34.method566(Static238.anInt4001, Static329.anInt5889);
			if (local14 != null) {
				@Pc(20) Class2_Sub18 local20 = new Class2_Sub18();
				local20.anObjectArray33 = arg0.anObjectArray26;
				local20.aClass93_9 = local14;
				local20.aClass93_10 = arg0;
				Static76.method1143(local20);
			}
		}
		Static164.method2403(Static64.aClass208_15);
		Static389.aClass2_Sub17_Sub1_2.method6170(arg0.anInt2508);
		Static389.aClass2_Sub17_Sub1_2.method6130(arg0.anInt2488);
		Static389.aClass2_Sub17_Sub1_2.method6136(Static329.anInt5889);
		Static389.aClass2_Sub17_Sub1_2.method6112(Static238.anInt4001);
		Static389.aClass2_Sub17_Sub1_2.method6135(arg0.anInt2424);
		Static389.aClass2_Sub17_Sub1_2.method6112(Static435.anInt7328);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!gi;)Z")
	public static boolean method876(@OriginalArg(0) Class93 arg0) {
		if (Static464.aBoolean176) {
			if (method860(arg0).anInt7337 != 0) {
				return false;
			}
			if (arg0.anInt2494 == 0) {
				return false;
			}
		}
		return arg0.aBoolean160;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method878() {
		for (@Pc(1) int local1 = 0; local1 < Static234.anInt3949; local1++) {
			@Pc(6) int[] local6 = Static404.anIntArrayArray61[local1];
			for (@Pc(8) int local8 = 0; local8 < Static371.anInt6492; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
