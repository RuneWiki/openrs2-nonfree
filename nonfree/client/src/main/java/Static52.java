import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!hp;")
	public static Class109 aClass109_1;

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_17 = new Class2(2, -1);

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
	public static final int[] anIntArray78 = new int[4];

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	public static int anInt901 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!go;)Z")
	public static boolean method717(@OriginalArg(0) Class95 arg0) {
		if (Static283.aBoolean297) {
			if (method725(arg0).anInt2235 != 0) {
				return false;
			}
			if (arg0.anInt2616 == 0) {
				return false;
			}
		}
		return arg0.aBoolean164;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method718(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static36.anInt647;
		@Pc(3) int[] local3 = Static362.anIntArray533;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static56.anInt943; local5++) {
			@Pc(15) Class26_Sub2_Sub4 local15;
			if (local5 < local1) {
				local15 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local3[local5]];
			} else {
				local15 = Static171.aClass26_Sub2_Sub4_Sub1Array1[Static228.anIntArray347[local5 - local1]];
			}
			if (local15.aByte102 == arg0 && local15.anInt7063 >= 0) {
				@Pc(35) int local35 = local15.method5512();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt7388 & 0x7F) != 0 || (local15.anInt7383 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7388 & 0x7F) != 64 || (local15.anInt7383 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt7388 >> 7;
					local76 = local15.anInt7383 >> 7;
					if (local15.anInt7063 > Static118.anIntArrayArray16[local71][local76]) {
						Static118.anIntArrayArray16[local71][local76] = local15.anInt7063;
						Static150.anIntArrayArray23[local71][local76] = 1;
					} else if (local15.anInt7063 == Static118.anIntArrayArray16[local71][local76]) {
						local112 = Static150.anIntArrayArray23[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt7388 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt7383 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt7388 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt7383 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt7063 > Static118.anIntArrayArray16[local154][local157]) {
								Static118.anIntArrayArray16[local154][local157] = local15.anInt7063;
								Static150.anIntArrayArray23[local154][local157] = 1;
							} else if (local15.anInt7063 == Static118.anIntArrayArray16[local154][local157]) {
								local112 = Static150.anIntArrayArray23[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Z")
	public static boolean method719() {
		try {
			if (Static351.anInt5638 == 2) {
				if (Static123.aClass7_Sub36_1 == null) {
					Static123.aClass7_Sub36_1 = Static466.method4116(Static126.aClass178_41, Static20.anInt2216, Static455.anInt6328);
					if (Static123.aClass7_Sub36_1 == null) {
						return false;
					}
				}
				if (Static367.aClass77_1 == null) {
					Static367.aClass77_1 = new Class77(Static122.aClass178_38, Static195.aClass178_53);
				}
				if (Static108.aClass7_Sub8_Sub3_1.method4487(Static429.aClass178_135, Static123.aClass7_Sub36_1, Static367.aClass77_1)) {
					Static108.aClass7_Sub8_Sub3_1.method4509();
					Static108.aClass7_Sub8_Sub3_1.method4486(Static195.anInt3458);
					Static108.aClass7_Sub8_Sub3_1.method4496(Static123.aClass7_Sub36_1, Static286.aBoolean251);
					Static351.anInt5638 = 0;
					Static367.aClass77_1 = null;
					Static126.aClass178_41 = null;
					Static123.aClass7_Sub36_1 = null;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static108.aClass7_Sub8_Sub3_1.method4501();
			Static367.aClass77_1 = null;
			Static351.anInt5638 = 0;
			Static126.aClass178_41 = null;
			Static123.aClass7_Sub36_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method720(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static36.anInt647;
		@Pc(3) int[] local3 = Static362.anIntArray533;
		@Pc(11) int local11 = Static291.aBoolean304 ? local1 : local1 + Static56.anInt943;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class26_Sub2_Sub4 local23;
			if (local13 < local1) {
				local23 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local3[local13]];
			} else {
				local23 = Static171.aClass26_Sub2_Sub4_Sub1Array1[Static228.anIntArray347[local13 - local1]];
			}
			if (local23.aByte102 == arg0) {
				local23.anInt7108 = 0;
				if (local23.anInt7063 < 0) {
					local23.aBoolean476 = false;
				} else {
					@Pc(50) int local50 = local23.method5512();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt7388 & 0x7F) != 0 || (local23.anInt7383 & 0x7F) != 0) {
							local23.aBoolean476 = false;
							continue;
						}
					} else if ((local23.anInt7388 & 0x7F) != 64 || (local23.anInt7383 & 0x7F) != 64) {
						local23.aBoolean476 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt7388 >> 7;
						local97 = local23.anInt7383 >> 7;
						if (local23.anInt7063 != Static118.anIntArrayArray16[local92][local97]) {
							local23.aBoolean476 = true;
							continue;
						}
						if (Static150.anIntArrayArray23[local92][local97] > 1) {
							local122 = Static150.anIntArrayArray23[local92][local97]--;
							local23.aBoolean476 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt7388 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt7383 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt7388 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt7383 + local92 >> 7;
						if (!Static278.method3705(local151, local23.anInt7063, local97, local158, local165)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt7063 == Static118.anIntArrayArray16[local176][local179]) {
										local122 = Static150.anIntArrayArray23[local176][local179]--;
									}
								}
							}
							local23.aBoolean476 = true;
							continue;
						}
					}
					if (local23 instanceof Class26_Sub2_Sub4_Sub2 && local23.aClass7_Sub42_3 != null && Static274.anInt4617 >= local23.aClass7_Sub42_3.anInt6171 && Static274.anInt4617 < local23.aClass7_Sub42_3.anInt6165) {
						((Class26_Sub2_Sub4_Sub2) local23).aBoolean481 = false;
					}
					local23.aBoolean476 = false;
					local23.anInt7390 = Static333.method2748(local23.aByte102, local23.anInt7383, local23.anInt7388);
					Static37.method529(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method723() {
		Static375.anInt6098 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static56.anInt943; local3++) {
			@Pc(10) Class26_Sub2_Sub4_Sub1 local10 = Static171.aClass26_Sub2_Sub4_Sub1Array1[Static228.anIntArray347[local3]];
			if (local10.aBoolean476 && local10.method5508() != -1) {
				@Pc(28) int local28 = (local10.method5512() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt7388 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt7383 - local28 >> 7;
				@Pc(49) Class26_Sub2_Sub4 local49 = Static154.method2305(local42, local10.aByte102, local35);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt7080;
					if (local49 instanceof Class26_Sub2_Sub4_Sub1) {
						local54 += 2048;
					}
					if (local49.anInt7108 == 0 && local49.method5508() != -1) {
						Static212.anIntArray335[Static375.anInt6098] = local54;
						Static225.anIntArray441[Static375.anInt6098] = local54;
						Static375.anInt6098++;
						local49.anInt7108++;
					}
					Static212.anIntArray335[Static375.anInt6098] = local54;
					Static225.anIntArray441[Static375.anInt6098] = local10.anInt7080 + 2048;
					Static375.anInt6098++;
					local49.anInt7108++;
				}
			}
		}
		Static384.method5653(Static375.anInt6098 - 1, Static225.anIntArray441, Static212.anIntArray335, 0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Lclient!uc;")
	public static Class26_Sub5 method724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class223 local7 = Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class26_Sub5 local14 = local7.aClass26_Sub5_1;
			local7.aClass26_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!go;)Lclient!ff;")
	public static Class7_Sub16 method725(@OriginalArg(0) Class95 arg0) {
		@Pc(13) Class7_Sub16 local13 = (Class7_Sub16) Static26.aClass164_4.method3512(((long) arg0.anInt2583 << 32) + (long) arg0.anInt2602);
		return local13 == null ? arg0.aClass7_Sub16_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method727(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static81.method1414(Static217.aClass2_63);
		Static255.aClass7_Sub14_Sub1_2.method3970(Static268.method3593(arg0) + 1);
		Static255.aClass7_Sub14_Sub1_2.method3970(arg1);
		Static255.aClass7_Sub14_Sub1_2.method3947(arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method728() {
		@Pc(1) int local1 = Static36.anInt647;
		@Pc(3) int[] local3 = Static362.anIntArray533;
		@Pc(11) int local11 = Static291.aBoolean304 ? local1 : local1 + Static56.anInt943;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class26_Sub2_Sub4 local23;
			if (local13 < local1) {
				local23 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local3[local13]];
			} else {
				local23 = Static171.aClass26_Sub2_Sub4_Sub1Array1[Static228.anIntArray347[local13 - local1]];
			}
			if (local23.anInt7063 >= 0) {
				@Pc(39) int local39 = local23.method5512();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt7388 & 0x7F) == 0 && (local23.anInt7383 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7388 & 0x7F) == 64 && (local23.anInt7383 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class26_Sub2_Sub4_Sub2 && local23.aClass7_Sub42_3 != null && Static274.anInt4617 >= local23.aClass7_Sub42_3.anInt6171 && Static274.anInt4617 < local23.aClass7_Sub42_3.anInt6165) {
					((Class26_Sub2_Sub4_Sub2) local23).aBoolean481 = false;
				}
				local23.anInt7390 = Static333.method2748(local23.aByte102, local23.anInt7383, local23.anInt7388);
				Static37.method529(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	public static void method731(@OriginalArg(0) int arg0) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg0, 6);
		local8.method4710();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!go;IIIIIIIII)V")
	public static void method732(@OriginalArg(0) Class95[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class95 local6 = arg0[local1];
			if (local6 != null && local6.anInt2646 == arg1) {
				@Pc(17) int local17 = local6.anInt2601 + arg6;
				@Pc(22) int local22 = local6.anInt2584 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2616 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2595;
					@Pc(45) int local45 = local22 + local6.anInt2638;
					if (local6.anInt2616 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2616 == 0 || local6.aBoolean162 || method725(local6).anInt2235 != 0 || local6 == Static36.aClass95_1 || local6.anInt2607 == Static27.anInt396) {
					if (!method717(local6)) {
						if (local6 == Static191.aClass95_9) {
							Static51.aBoolean46 = true;
							Static119.anInt2393 = local17;
							Static447.anInt7374 = local22;
						}
						if (local6.aBoolean153 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean163 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class7_Sub18 local148 = (Class7_Sub18) Static451.aClass85_48.method2010(); local148 != null; local148 = (Class7_Sub18) Static451.aClass85_48.method2000()) {
									if (local148.aBoolean140) {
										local148.method5802();
										local148.aClass95_5.aBoolean160 = false;
									}
								}
								if (Static66.anInt1242 == 0) {
									Static191.aClass95_9 = null;
									Static36.aClass95_1 = null;
								}
								Static168.anInt3037 = 0;
								Static259.aBoolean279 = false;
								Static17.aBoolean7 = false;
								if (!Static331.aBoolean372) {
									Static27.method307();
								}
							}
							@Pc(204) boolean local204;
							if (Static154.aClass50_1.method1860() >= local28 && Static154.aClass50_1.method1870() >= local30 && Static154.aClass50_1.method1860() < local32 && Static154.aClass50_1.method1870() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static402.aBoolean412 && local204) {
								if (local6.anInt2641 >= 0) {
									Static194.anInt3446 = local6.anInt2641;
								} else if (local6.aBoolean163) {
									Static194.anInt3446 = -1;
								}
							}
							if (!Static331.aBoolean372 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static453.method5754(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(248) boolean local248 = false;
							if (Static154.aClass50_1.method1864() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class7_Sub12 local263 = (Class7_Sub12) Static204.aClass85_37.method2010();
							if (local263 != null && local263.method940() == 0 && local263.method942() >= local28 && local263.method943() >= local30 && local263.method942() < local32 && local263.method943() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray34 != null) {
								for (local296 = 0; local296 < local6.aByteArray34.length; local296++) {
									if (Static310.aClass130_1.method5069(local6.aByteArray34[local296])) {
										if (local6.anIntArray218 == null || Static274.anInt4617 >= local6.anIntArray218[local296]) {
											@Pc(328) byte local328 = local6.aByteArray33[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static310.aClass130_1.method5069(86) && !Static310.aClass130_1.method5069(82) && !Static310.aClass130_1.method5069(81)) && ((local328 & 0x2) == 0 || Static310.aClass130_1.method5069(86)) && ((local328 & 0x1) == 0 || Static310.aClass130_1.method5069(82)) && ((local328 & 0x4) == 0 || Static310.aClass130_1.method5069(81))) {
												if (local296 < 10) {
													Static10.method92(local6.anInt2583, "", -1, local296 + 1);
												} else if (local296 == 10) {
													Static23.method249();
													@Pc(399) Class7_Sub16 local399 = method725(local6);
													Static201.method2883(local399.method1903(), local6, local399.anInt2247);
													Static139.aString32 = Static12.method107(local6);
													if (Static139.aString32 == null) {
														Static139.aString32 = "Null";
													}
													Static73.aString7 = local6.aString30 + "<col=ffffff>";
												}
												local430 = local6.anIntArray215[local296];
												if (local6.anIntArray218 == null) {
													local6.anIntArray218 = new int[local6.aByteArray34.length];
												}
												if (local430 == 0) {
													local6.anIntArray218[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray218[local296] = Static274.anInt4617 + local430;
												}
											}
										}
									} else if (local6.anIntArray218 != null) {
										local6.anIntArray218[local296] = 0;
									}
								}
							}
							if (local258) {
								Static454.method5773(local263.method943() - local22, local6, local263.method942() - local17);
							}
							if (Static191.aClass95_9 != null && Static191.aClass95_9 != local6 && local204 && method725(local6).method1902()) {
								Static342.aClass95_14 = local6;
							}
							if (local6 == Static36.aClass95_1) {
								Static129.aBoolean141 = true;
								Static413.anInt6556 = local17;
								Static100.anInt2032 = local22;
							}
							if (local6.aBoolean162 || local6.anInt2607 != 0) {
								@Pc(515) Class7_Sub18 local515;
								if (local204 && Static217.anInt3861 != 0 && local6.anObjectArray17 != null) {
									local515 = new Class7_Sub18();
									local515.aBoolean140 = true;
									local515.aClass95_5 = local6;
									local515.anInt2474 = Static217.anInt3861;
									local515.anObjectArray1 = local6.anObjectArray17;
									Static451.aClass85_48.method2011(local515);
								}
								if (Static191.aClass95_9 != null || Static331.aBoolean372 || local6.anInt2607 != Static242.anInt4142 && Static168.anInt3037 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt2607 != 0) {
									if (local6.anInt2607 == Static293.anInt4887 || local6.anInt2607 == Static278.anInt4675) {
										Static119.aClass95_3 = local6;
										if (Static37.aClass196_1 != null) {
											Static37.aClass196_1.method4082(Static269.aClass51_9, local6.anInt2638);
										}
										if (local6.anInt2607 == Static293.anInt4887) {
											if (!Static331.aBoolean372 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static392.method4990(arg8, Static269.aClass51_9, arg9);
												for (@Pc(598) Class28_Sub8 local598 = (Class28_Sub8) Static104.aClass169_3.method3598(); local598 != null; local598 = (Class28_Sub8) Static104.aClass169_3.method3597()) {
													if (arg8 >= local598.anInt6314 && arg8 < local598.anInt6308 && arg9 >= local598.anInt6309 && arg9 < local598.anInt6310) {
														Static27.method307();
														Static424.method5463(local598.aClass26_Sub2_Sub4_1);
													}
												}
											}
											Static299.method3998(local22, local6, local17);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt2607 == Static27.anInt396) {
										if (local6.method2163(Static269.aClass51_9) == null || Static57.anInt986 != 0 && Static57.anInt986 != 3 || Static331.aBoolean372 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray213[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray217[local670]) {
											continue;
										}
										local296 -= local6.anInt2595 / 2;
										local670 -= local6.anInt2638 / 2;
										if (Static9.anInt60 == 4) {
											local709 = (int) Static97.aFloat52 & 0x3FFF;
										} else {
											local709 = (int) Static97.aFloat52 + Static436.anInt7298 & 0x3FFF;
										}
										@Pc(721) int local721 = Class22_Sub7.anIntArray411[local709];
										@Pc(725) int local725 = Class22_Sub7.anIntArray410[local709];
										if (Static9.anInt60 != 4) {
											local721 = local721 * (Static3.anInt11 + 256) >> 8;
											local725 = local725 * (Static3.anInt11 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static9.anInt60 == 4) {
											local775 = (Static197.anInt3481 >> 7) + (local754 >> 2);
											local783 = (Static17.anInt264 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static104.aClass26_Sub2_Sub4_Sub2_2.method5512() - 1) * 64;
											local775 = (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 - local792 >> 7) + (local754 >> 2);
											local783 = (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 - local792 >> 7) - (local764 >> 2);
										}
										if (Static402.aBoolean412 && (Static180.anInt3240 & 0x40) != 0) {
											@Pc(825) Class95 local825 = Static407.method5110(Static228.anInt3966, Static68.anInt1325);
											if (local825 == null) {
												Static23.method249();
											} else {
												Static181.method2635(local775, Static139.aString32, Static250.anInt4255, false, local6.anInt2599, " ->", local783, 1L, true, 51);
											}
											continue;
										}
										if (Static191.aClass137_3 == Static55.aClass137_1) {
											Static181.method2635(local775, Static246.aClass55_94.method1205(Static5.anInt20), -1, false, -1, "", local783, 1L, true, 58);
										}
										Static181.method2635(local775, Static261.aString49, Static149.anInt5367, false, -1, "", local783, 1L, true, 4);
										continue;
									}
									if (local6.anInt2607 == Static242.anInt4142) {
										Static282.aClass95_11 = local6;
										if (local204) {
											Static259.aBoolean279 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method942() - local17 - local6.anInt2595 / 2) * 2.0D / (double) Static93.aFloat126);
											local670 = (int) -((double) (local263.method943() - local22 - local6.anInt2638 / 2) * 2.0D / (double) Static93.aFloat126);
											local430 = Static203.anInt3590 + local296 + Static93.anInt4322;
											local709 = Static21.anInt321 + local670 + Static93.anInt4323;
											@Pc(939) Class7_Sub4_Sub9 local939 = Static343.method4440();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method2412(local709, local430, local944);
											if (local944 != null) {
												if (Static310.aClass130_1.method5069(82) && Static157.anInt2920 > 0) {
													Static114.method1941(local944[0], local944[2], local944[1]);
													continue;
												}
												Static17.aBoolean7 = true;
												Static90.anInt1868 = local944[0];
												Static294.anInt4906 = local944[1];
												Static400.anInt5906 = local944[2];
											}
											Static168.anInt3037 = 1;
											Static121.aBoolean134 = false;
											Static44.anInt727 = Static154.aClass50_1.method1860();
											Static98.anInt1995 = Static154.aClass50_1.method1870();
											continue;
										}
										if (local248 && Static168.anInt3037 > 0) {
											if (Static168.anInt3037 == 1 && (Static44.anInt727 != Static154.aClass50_1.method1860() || Static98.anInt1995 != Static154.aClass50_1.method1870())) {
												Static250.anInt4245 = Static203.anInt3590;
												Static131.anInt2508 = Static21.anInt321;
												Static168.anInt3037 = 2;
											}
											if (Static168.anInt3037 == 2) {
												Static121.aBoolean134 = true;
												Static240.method3264(Static250.anInt4245 + (int) ((double) (Static44.anInt727 - Static154.aClass50_1.method1860()) * 2.0D / (double) Static93.aFloat125));
												Static5.method22(Static131.anInt2508 - (int) ((double) (Static98.anInt1995 - Static154.aClass50_1.method1870()) * 2.0D / (double) Static93.aFloat125));
											}
											continue;
										}
										if (Static168.anInt3037 > 0 && !Static121.aBoolean134) {
											if ((Static72.anInt1386 == 1 || Static221.method3101()) && Static102.anInt2085 > 2) {
												Static108.method1877(Static98.anInt1995, Static44.anInt727);
											} else if (Static190.method2758()) {
												Static108.method1877(Static98.anInt1995, Static44.anInt727);
											}
										}
										Static168.anInt3037 = 0;
										continue;
									}
									if (local6.anInt2607 == Static28.anInt403) {
										if (local248) {
											Static48.method617(local6.anInt2595, local6.anInt2638, Static154.aClass50_1.method1870() - local22, Static154.aClass50_1.method1860() - local17);
										}
										continue;
									}
									if (local6.anInt2607 == Static236.anInt4064) {
										Static79.method1388(local17, local22, local6);
										continue;
									}
								}
								if (!local6.aBoolean152 && local258) {
									local6.aBoolean152 = true;
									if (local6.anObjectArray32 != null) {
										local515 = new Class7_Sub18();
										local515.aBoolean140 = true;
										local515.aClass95_5 = local6;
										local515.anInt2469 = local263.method942() - local17;
										local515.anInt2474 = local263.method943() - local22;
										local515.anObjectArray1 = local6.anObjectArray32;
										Static451.aClass85_48.method2011(local515);
									}
								}
								if (local6.aBoolean152 && local248 && local6.anObjectArray13 != null) {
									local515 = new Class7_Sub18();
									local515.aBoolean140 = true;
									local515.aClass95_5 = local6;
									local515.anInt2469 = Static154.aClass50_1.method1860() - local17;
									local515.anInt2474 = Static154.aClass50_1.method1870() - local22;
									local515.anObjectArray1 = local6.anObjectArray13;
									Static451.aClass85_48.method2011(local515);
								}
								if (local6.aBoolean152 && !local248) {
									local6.aBoolean152 = false;
									if (local6.anObjectArray19 != null) {
										local515 = new Class7_Sub18();
										local515.aBoolean140 = true;
										local515.aClass95_5 = local6;
										local515.anInt2469 = Static154.aClass50_1.method1860() - local17;
										local515.anInt2474 = Static154.aClass50_1.method1870() - local22;
										local515.anObjectArray1 = local6.anObjectArray19;
										Static205.aClass85_22.method2011(local515);
									}
								}
								if (local248 && local6.anObjectArray11 != null) {
									local515 = new Class7_Sub18();
									local515.aBoolean140 = true;
									local515.aClass95_5 = local6;
									local515.anInt2469 = Static154.aClass50_1.method1860() - local17;
									local515.anInt2474 = Static154.aClass50_1.method1870() - local22;
									local515.anObjectArray1 = local6.anObjectArray11;
									Static451.aClass85_48.method2011(local515);
								}
								if (!local6.aBoolean160 && local204) {
									local6.aBoolean160 = true;
									if (local6.anObjectArray8 != null) {
										local515 = new Class7_Sub18();
										local515.aBoolean140 = true;
										local515.aClass95_5 = local6;
										local515.anInt2469 = Static154.aClass50_1.method1860() - local17;
										local515.anInt2474 = Static154.aClass50_1.method1870() - local22;
										local515.anObjectArray1 = local6.anObjectArray8;
										Static451.aClass85_48.method2011(local515);
									}
								}
								if (local6.aBoolean160 && local204 && local6.anObjectArray26 != null) {
									local515 = new Class7_Sub18();
									local515.aBoolean140 = true;
									local515.aClass95_5 = local6;
									local515.anInt2469 = Static154.aClass50_1.method1860() - local17;
									local515.anInt2474 = Static154.aClass50_1.method1870() - local22;
									local515.anObjectArray1 = local6.anObjectArray26;
									Static451.aClass85_48.method2011(local515);
								}
								if (local6.aBoolean160 && !local204) {
									local6.aBoolean160 = false;
									if (local6.anObjectArray34 != null) {
										local515 = new Class7_Sub18();
										local515.aBoolean140 = true;
										local515.aClass95_5 = local6;
										local515.anInt2469 = Static154.aClass50_1.method1860() - local17;
										local515.anInt2474 = Static154.aClass50_1.method1870() - local22;
										local515.anObjectArray1 = local6.anObjectArray34;
										Static205.aClass85_22.method2011(local515);
									}
								}
								if (local6.anObjectArray24 != null) {
									local515 = new Class7_Sub18();
									local515.aClass95_5 = local6;
									local515.anObjectArray1 = local6.anObjectArray24;
									Static459.aClass85_38.method2011(local515);
								}
								@Pc(1483) Class7_Sub18 local1483;
								if (local6.anObjectArray31 != null && Static82.anInt1668 > local6.anInt2642) {
									if (local6.anIntArray216 == null || Static82.anInt1668 - local6.anInt2642 > 32) {
										local515 = new Class7_Sub18();
										local515.aClass95_5 = local6;
										local515.anObjectArray1 = local6.anObjectArray31;
										Static451.aClass85_48.method2011(local515);
									} else {
										label678: for (local296 = local6.anInt2642; local296 < Static82.anInt1668; local296++) {
											local670 = Static335.anIntArray495[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray216.length; local430++) {
												if (local6.anIntArray216[local430] == local670) {
													local1483 = new Class7_Sub18();
													local1483.aClass95_5 = local6;
													local1483.anObjectArray1 = local6.anObjectArray31;
													Static451.aClass85_48.method2011(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt2642 = Static82.anInt1668;
								}
								if (local6.anObjectArray20 != null && Static206.anInt3644 > local6.anInt2620) {
									if (local6.anIntArray222 == null || Static206.anInt3644 - local6.anInt2620 > 32) {
										local515 = new Class7_Sub18();
										local515.aClass95_5 = local6;
										local515.anObjectArray1 = local6.anObjectArray20;
										Static451.aClass85_48.method2011(local515);
									} else {
										label654: for (local296 = local6.anInt2620; local296 < Static206.anInt3644; local296++) {
											local670 = Static237.anIntArray357[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray222.length; local430++) {
												if (local6.anIntArray222[local430] == local670) {
													local1483 = new Class7_Sub18();
													local1483.aClass95_5 = local6;
													local1483.anObjectArray1 = local6.anObjectArray20;
													Static451.aClass85_48.method2011(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt2620 = Static206.anInt3644;
								}
								if (local6.anObjectArray5 != null && Static294.anInt4904 > local6.anInt2610) {
									if (local6.anIntArray220 == null || Static294.anInt4904 - local6.anInt2610 > 32) {
										local515 = new Class7_Sub18();
										local515.aClass95_5 = local6;
										local515.anObjectArray1 = local6.anObjectArray5;
										Static451.aClass85_48.method2011(local515);
									} else {
										label630: for (local296 = local6.anInt2610; local296 < Static294.anInt4904; local296++) {
											local670 = Static360.anIntArray529[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray220.length; local430++) {
												if (local6.anIntArray220[local430] == local670) {
													local1483 = new Class7_Sub18();
													local1483.aClass95_5 = local6;
													local1483.anObjectArray1 = local6.anObjectArray5;
													Static451.aClass85_48.method2011(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt2610 = Static294.anInt4904;
								}
								if (local6.anObjectArray27 != null && Static31.anInt524 > local6.anInt2624) {
									if (local6.anIntArray221 == null || Static31.anInt524 - local6.anInt2624 > 32) {
										local515 = new Class7_Sub18();
										local515.aClass95_5 = local6;
										local515.anObjectArray1 = local6.anObjectArray27;
										Static451.aClass85_48.method2011(local515);
									} else {
										label606: for (local296 = local6.anInt2624; local296 < Static31.anInt524; local296++) {
											local670 = Static322.anIntArray482[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray221.length; local430++) {
												if (local6.anIntArray221[local430] == local670) {
													local1483 = new Class7_Sub18();
													local1483.aClass95_5 = local6;
													local1483.anObjectArray1 = local6.anObjectArray27;
													Static451.aClass85_48.method2011(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt2624 = Static31.anInt524;
								}
								if (local6.anObjectArray16 != null && Static111.anInt2255 > local6.anInt2666) {
									if (local6.anIntArray214 == null || Static111.anInt2255 - local6.anInt2666 > 32) {
										local515 = new Class7_Sub18();
										local515.aClass95_5 = local6;
										local515.anObjectArray1 = local6.anObjectArray16;
										Static451.aClass85_48.method2011(local515);
									} else {
										label582: for (local296 = local6.anInt2666; local296 < Static111.anInt2255; local296++) {
											local670 = Static340.anIntArray497[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray214.length; local430++) {
												if (local6.anIntArray214[local430] == local670) {
													local1483 = new Class7_Sub18();
													local1483.aClass95_5 = local6;
													local1483.anObjectArray1 = local6.anObjectArray16;
													Static451.aClass85_48.method2011(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt2666 = Static111.anInt2255;
								}
								if (Static353.anInt5646 > local6.anInt2619 && local6.anObjectArray12 != null) {
									local515 = new Class7_Sub18();
									local515.aClass95_5 = local6;
									local515.anObjectArray1 = local6.anObjectArray12;
									Static451.aClass85_48.method2011(local515);
								}
								if (Static324.anInt5357 > local6.anInt2619 && local6.anObjectArray21 != null) {
									local515 = new Class7_Sub18();
									local515.aClass95_5 = local6;
									local515.anObjectArray1 = local6.anObjectArray21;
									Static451.aClass85_48.method2011(local515);
								}
								if (Static254.anInt4291 > local6.anInt2619 && local6.anObjectArray15 != null) {
									local515 = new Class7_Sub18();
									local515.aClass95_5 = local6;
									local515.anObjectArray1 = local6.anObjectArray15;
									Static451.aClass85_48.method2011(local515);
								}
								if (Static104.anInt2124 > local6.anInt2619 && local6.anObjectArray9 != null) {
									local515 = new Class7_Sub18();
									local515.aClass95_5 = local6;
									local515.anObjectArray1 = local6.anObjectArray9;
									Static451.aClass85_48.method2011(local515);
								}
								if (Static302.anInt5112 > local6.anInt2619 && local6.anObjectArray10 != null) {
									local515 = new Class7_Sub18();
									local515.aClass95_5 = local6;
									local515.anObjectArray1 = local6.anObjectArray10;
									Static451.aClass85_48.method2011(local515);
								}
								local6.anInt2619 = Static90.anInt1865;
								if (local6.anObjectArray7 != null) {
									for (local296 = 0; local296 < Static425.anInt7000; local296++) {
										@Pc(1951) Class7_Sub18 local1951 = new Class7_Sub18();
										local1951.aClass95_5 = local6;
										local1951.anInt2475 = Static42.aClass16Array1[local296].method5108();
										local1951.anInt2473 = Static42.aClass16Array1[local296].method5102();
										local1951.anObjectArray1 = local6.anObjectArray7;
										Static451.aClass85_48.method2011(local1951);
									}
								}
								if (Static56.aBoolean60 && local6.anObjectArray25 != null) {
									local515 = new Class7_Sub18();
									local515.aClass95_5 = local6;
									local515.anObjectArray1 = local6.anObjectArray25;
									Static451.aClass85_48.method2011(local515);
								}
							}
							if (local6.anInt2616 == 5 && local6.anInt2663 != -1) {
								local6.method2167(Static411.aClass217_1, Static439.aClass255_1).method4082(Static269.aClass51_9, local6.anInt2638);
							}
							Static377.method4846(local6);
							if (local6.anInt2616 == 0) {
								method732(arg0, local6.anInt2583, local28, local30, local32, local34, local17 - local6.anInt2627, local22 - local6.anInt2585, arg8, arg9);
								if (local6.aClass95Array1 != null) {
									method732(local6.aClass95Array1, local6.anInt2583, local28, local30, local32, local34, local17 - local6.anInt2627, local22 - local6.anInt2585, arg8, arg9);
								}
								@Pc(2073) Class7_Sub44 local2073 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local6.anInt2583);
								if (local2073 != null) {
									if (Static191.aClass137_3 == Static419.aClass137_4 && local2073.anInt7164 == 0 && !Static331.aBoolean372 && local204 && !Static283.aBoolean297) {
										Static27.method307();
									}
									Static308.method4069(local30, local17, arg9, local2073.anInt7165, local32, local28, local34, local22, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static377.method4846(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method733() {
		@Pc(1) int local1 = Static36.anInt647;
		@Pc(3) int[] local3 = Static362.anIntArray533;
		@Pc(20) boolean local20 = Static130.aClass153_Sub1_1.anInt5238 == 1 && local1 > 200 || Static130.aClass153_Sub1_1.anInt5238 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class26_Sub2_Sub4_Sub2 local29 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local3[local22]];
			if (local29.method5528()) {
				local29.method5694();
				if (local29.aShort105 >= 0 && local29.aShort103 >= 0 && local29.aShort104 < Static333.anInt3375 && local29.aShort102 < Static102.anInt2086) {
					local29.aBoolean481 = local29.aBoolean475 ? local20 : false;
					if (local29 == Static104.aClass26_Sub2_Sub4_Sub2_2) {
						local29.anInt7063 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean476) {
							local75++;
						}
						if (local29.anInt7079 > Static274.anInt4617) {
							local75 += 2;
						}
						local75 += 5 - local29.method5512() << 2;
						if (local29.aBoolean482) {
							local75 += 512;
						} else {
							if (Static35.anInt4769 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt7063 = local75 + 1;
					}
				} else {
					local29.anInt7063 = -1;
				}
			} else {
				local29.anInt7063 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static56.anInt943; local116++) {
			@Pc(123) Class26_Sub2_Sub4_Sub1 local123 = Static171.aClass26_Sub2_Sub4_Sub1Array1[Static228.anIntArray347[local116]];
			if (local123.method4826() && local123.aClass249_1.method5172(Static224.aClass239_7)) {
				local123.method5694();
				if (local123.aShort105 >= 0 && local123.aShort103 >= 0 && local123.aShort104 < Static333.anInt3375 && local123.aShort102 < Static102.anInt2086) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean476) {
						local160++;
					}
					if (local123.anInt7079 > Static274.anInt4617) {
						local160 += 2;
					}
					local160 += 5 - local123.method5512() << 2;
					if (Static35.anInt4769 == 0) {
						if (local123.aClass249_1.aBoolean426) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static35.anInt4769 == 1) {
						if (local123.aClass249_1.aBoolean426) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass249_1.aBoolean422) {
						local160 += 1024;
					} else if (!local123.aClass249_1.aBoolean423) {
						local160 += 256;
					}
					local123.anInt7063 = local160 + 1;
				} else {
					local123.anInt7063 = -1;
				}
			} else {
				local123.anInt7063 = -1;
			}
		}
		for (local75 = 0; local75 < Static325.aClass150Array1.length; local75++) {
			@Pc(226) Class150 local226 = Static325.aClass150Array1[local75];
			if (local226 != null) {
				if (local226.anInt4136 == 1) {
					@Pc(237) Class26_Sub2_Sub4_Sub1 local237 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local226.anInt4139];
					if (local237 != null && local237.anInt7063 >= 0) {
						local237.anInt7063 += 2048;
					}
				} else if (local226.anInt4136 == 10) {
					@Pc(258) Class26_Sub2_Sub4_Sub2 local258 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local226.anInt4139];
					if (local258 != null && local258 != Static104.aClass26_Sub2_Sub4_Sub2_2 && local258.anInt7063 >= 0) {
						local258.anInt7063 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method735() {
		for (@Pc(1) int local1 = 0; local1 < Static333.anInt3375; local1++) {
			@Pc(6) int[] local6 = Static118.anIntArrayArray16[local1];
			for (@Pc(8) int local8 = 0; local8 < Static102.anInt2086; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!go;)Lclient!go;")
	public static Class95 method738(@OriginalArg(0) Class95 arg0) {
		@Pc(4) int local4 = method725(arg0).method1900();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static313.method4088(arg0.anInt2646);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
