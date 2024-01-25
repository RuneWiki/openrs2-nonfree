import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!ph;")
	public static Class187 aClass187_1;

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method965(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static285.anInt5015;
		@Pc(3) int[] local3 = Static103.anIntArray135;
		@Pc(11) int local11 = Static189.aBoolean377 ? local1 : local1 + Static328.anInt5608;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class25_Sub5_Sub1 local23;
			if (local13 < local1) {
				local23 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = Static87.aClass25_Sub5_Sub1_Sub1Array6[Static31.anIntArray30[local13 - local1]];
			}
			if (local23.aByte94 == arg0) {
				local23.anInt4262 = 0;
				if (local23.anInt4303 < 0) {
					local23.aBoolean484 = false;
				} else {
					@Pc(50) int local50 = local23.method3427();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt5518 & 0x7F) != 0 || (local23.anInt5514 & 0x7F) != 0) {
							local23.aBoolean484 = false;
							continue;
						}
					} else if ((local23.anInt5518 & 0x7F) != 64 || (local23.anInt5514 & 0x7F) != 64) {
						local23.aBoolean484 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt5518 >> 7;
						local97 = local23.anInt5514 >> 7;
						if (local23.anInt4303 != Static200.anIntArrayArray32[local92][local97]) {
							local23.aBoolean484 = true;
							continue;
						}
						if (Static97.anIntArrayArray25[local92][local97] > 1) {
							local122 = Static97.anIntArrayArray25[local92][local97]--;
							local23.aBoolean484 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt5518 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt5514 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt5518 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt5514 + local92 >> 7;
						if (!Static104.method1588(local23.anInt4303, local165, local97, local158, local151)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt4303 == Static200.anIntArrayArray32[local176][local179]) {
										local122 = Static97.anIntArrayArray25[local176][local179]--;
									}
								}
							}
							local23.aBoolean484 = true;
							continue;
						}
					}
					if (local23 instanceof Class25_Sub5_Sub1_Sub2 && local23.aClass1_Sub17_3 != null && Static236.anInt4213 >= local23.aClass1_Sub17_3.anInt1716 && Static236.anInt4213 < local23.aClass1_Sub17_3.anInt1711) {
						((Class25_Sub5_Sub1_Sub2) local23).aBoolean488 = false;
					}
					local23.aBoolean484 = false;
					local23.anInt5517 = Static335.method4499(local23.aByte94, local23.anInt5518, local23.anInt5514);
					Static277.method4344(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jk;)Z")
	public static boolean method966(@OriginalArg(0) Class124 arg0) {
		if (Static239.aBoolean665) {
			if (method970(arg0).anInt3464 != 0) {
				return false;
			}
			if (arg0.anInt3417 == 0) {
				return false;
			}
		}
		return arg0.aBoolean399;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method967() {
		Static73.anInt1355 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static328.anInt5608; local3++) {
			@Pc(10) Class25_Sub5_Sub1_Sub1 local10 = Static87.aClass25_Sub5_Sub1_Sub1Array6[Static31.anIntArray30[local3]];
			if (local10.aBoolean484 && local10.method3423() != -1) {
				@Pc(28) int local28 = (local10.method3427() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt5518 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt5514 - local28 >> 7;
				@Pc(49) Class25_Sub5_Sub1 local49 = Static143.method2020(local10.aByte94, local42, local35);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt4284;
					if (local49 instanceof Class25_Sub5_Sub1_Sub1) {
						local54 += 2048;
					}
					if (local49.anInt4262 == 0 && local49.method3423() != -1) {
						Static242.anIntArray291[Static73.anInt1355] = local54;
						Static53.anIntArray51[Static73.anInt1355] = local54;
						Static73.anInt1355++;
						local49.anInt4262++;
					}
					Static242.anIntArray291[Static73.anInt1355] = local54;
					Static53.anIntArray51[Static73.anInt1355] = local10.anInt4284 + 2048;
					Static73.anInt1355++;
					local49.anInt4262++;
				}
			}
		}
		Static38.method572(0, Static73.anInt1355 - 1, Static242.anIntArray291, Static53.anIntArray51);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method968() {
		for (@Pc(1) int local1 = 0; local1 < Static296.anInt5187; local1++) {
			@Pc(6) int[] local6 = Static200.anIntArrayArray32[local1];
			for (@Pc(8) int local8 = 0; local8 < Static206.anInt3607; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!jk;)Lclient!jo;")
	public static Class1_Sub27 method970(@OriginalArg(0) Class124 arg0) {
		@Pc(13) Class1_Sub27 local13 = (Class1_Sub27) Static194.aClass199_186.method4387(((long) arg0.anInt3348 << 32) + (long) arg0.anInt3430);
		return local13 == null ? arg0.aClass1_Sub27_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method971(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static285.anInt5015;
		@Pc(3) int[] local3 = Static103.anIntArray135;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static328.anInt5608; local5++) {
			@Pc(15) Class25_Sub5_Sub1 local15;
			if (local5 < local1) {
				local15 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = Static87.aClass25_Sub5_Sub1_Sub1Array6[Static31.anIntArray30[local5 - local1]];
			}
			if (local15.aByte94 == arg0 && local15.anInt4303 >= 0) {
				@Pc(35) int local35 = local15.method3427();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt5518 & 0x7F) != 0 || (local15.anInt5514 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt5518 & 0x7F) != 64 || (local15.anInt5514 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt5518 >> 7;
					local76 = local15.anInt5514 >> 7;
					if (local15.anInt4303 > Static200.anIntArrayArray32[local71][local76]) {
						Static200.anIntArrayArray32[local71][local76] = local15.anInt4303;
						Static97.anIntArrayArray25[local71][local76] = 1;
					} else if (local15.anInt4303 == Static200.anIntArrayArray32[local71][local76]) {
						local112 = Static97.anIntArrayArray25[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt5518 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt5514 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt5518 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt5514 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt4303 > Static200.anIntArrayArray32[local154][local157]) {
								Static200.anIntArrayArray32[local154][local157] = local15.anInt4303;
								Static97.anIntArrayArray25[local154][local157] = 1;
							} else if (local15.anInt4303 == Static200.anIntArrayArray32[local154][local157]) {
								local112 = Static97.anIntArrayArray25[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method972(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static49.method820(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static279.method3884(local7);
			local7 = Static232.method3338("%3a", ":", local7);
			local7 = Static232.method3338("%40", "@", local7);
			local7 = Static232.method3338("%26", "&", local7);
			local7 = Static232.method3338("%23", "#", local7);
			if (Static440.aClass83_5.anApplet1 == null) {
				return;
			}
			@Pc(101) Class232 local101 = Static440.aClass83_5.method1859(new URL(Static440.aClass83_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static259.anInt4686 + "&u=" + Static7.aLong5 + "&v1=" + Static117.aString29 + "&v2=" + Static117.aString28 + "&e=" + local7));
			while (local101.anInt6402 == 0) {
				Static223.method4582(1L);
			}
			if (local101.anInt6402 == 1) {
				@Pc(119) DataInputStream local119 = (DataInputStream) local101.anObject8;
				local119.read();
				local119.close();
			}
		} catch (@Pc(126) Exception local126) {
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!jk;IIIIIIIII)V")
	public static void method973(@OriginalArg(0) Class124[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class124 local6 = arg0[local1];
			if (local6 != null && local6.anInt3344 == arg1) {
				@Pc(17) int local17 = local6.anInt3370 + arg6;
				@Pc(22) int local22 = local6.anInt3414 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt3417 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt3376;
					@Pc(45) int local45 = local22 + local6.anInt3356;
					if (local6.anInt3417 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt3417 == 0 || local6.aBoolean393 || method970(local6).anInt3464 != 0 || local6 == Static401.aClass124_12 || local6.anInt3413 == Static177.anInt2894) {
					if (!method966(local6)) {
						if (local6 == Static371.aClass124_10) {
							Static145.aBoolean232 = true;
							Static16.anInt317 = local17;
							Static57.anInt1094 = local22;
						}
						if (local6.aBoolean397 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean385 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class1_Sub40 local148 = (Class1_Sub40) Static254.aClass227_28.method4967(); local148 != null; local148 = (Class1_Sub40) Static254.aClass227_28.method4973()) {
									if (local148.aBoolean747) {
										local148.method5915();
										local148.aClass124_14.aBoolean400 = false;
									}
								}
								if (Static230.anInt4043 == 0) {
									Static371.aClass124_10 = null;
									Static401.aClass124_12 = null;
								}
								Static339.anInt5788 = 0;
								Static451.aBoolean814 = false;
								Static338.aBoolean660 = false;
								if (!Static17.aBoolean39) {
									Static108.method1714();
								}
							}
							@Pc(204) boolean local204;
							if (Static62.aClass96_1.method3872() >= local28 && Static62.aClass96_1.method3870() >= local30 && Static62.aClass96_1.method3872() < local32 && Static62.aClass96_1.method3870() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static433.aBoolean798 && local204) {
								if (local6.anInt3393 >= 0) {
									Static33.anInt530 = local6.anInt3393;
								} else if (local6.aBoolean385) {
									Static33.anInt530 = -1;
								}
							}
							if (!Static17.aBoolean39 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static102.method1563(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(248) boolean local248 = false;
							if (Static62.aClass96_1.method3875() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class1_Sub24 local263 = (Class1_Sub24) Static130.aClass227_19.method4967();
							if (local263 != null && local263.method2417() == 0 && local263.method2418() >= local28 && local263.method2421() >= local30 && local263.method2418() < local32 && local263.method2421() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray38 != null) {
								for (local296 = 0; local296 < local6.aByteArray38.length; local296++) {
									if (Static160.aClass123_1.method2750(local6.aByteArray38[local296])) {
										if (local6.anIntArray218 == null || Static236.anInt4213 >= local6.anIntArray218[local296]) {
											@Pc(328) byte local328 = local6.aByteArray39[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static160.aClass123_1.method2750(86) && !Static160.aClass123_1.method2750(82) && !Static160.aClass123_1.method2750(81)) && ((local328 & 0x2) == 0 || Static160.aClass123_1.method2750(86)) && ((local328 & 0x1) == 0 || Static160.aClass123_1.method2750(82)) && ((local328 & 0x4) == 0 || Static160.aClass123_1.method2750(81))) {
												if (local296 < 10) {
													Static238.method3436("", local296 + 1, local6.anInt3348, -1);
												} else if (local296 == 10) {
													Static124.method5684();
													@Pc(399) Class1_Sub27 local399 = method970(local6);
													Static190.method2737(local6, local399.method2820(), local399.anInt3465);
													Static337.aString67 = Static77.method1272(local6);
													if (Static337.aString67 == null) {
														Static337.aString67 = "Null";
													}
													Static15.aString1 = local6.aString43 + "<col=ffffff>";
												}
												local430 = local6.anIntArray211[local296];
												if (local6.anIntArray218 == null) {
													local6.anIntArray218 = new int[local6.aByteArray38.length];
												}
												if (local430 == 0) {
													local6.anIntArray218[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray218[local296] = Static236.anInt4213 + local430;
												}
											}
										}
									} else if (local6.anIntArray218 != null) {
										local6.anIntArray218[local296] = 0;
									}
								}
							}
							if (local258) {
								Static427.method5661(local263.method2421() - local22, local6, local263.method2418() - local17);
							}
							if (Static371.aClass124_10 != null && Static371.aClass124_10 != local6 && local204 && method970(local6).method2815()) {
								Static219.aClass124_5 = local6;
							}
							if (local6 == Static401.aClass124_12) {
								Static310.aBoolean608 = true;
								Static209.anInt3757 = local17;
								Static159.anInt2655 = local22;
							}
							if (local6.aBoolean393 || local6.anInt3413 != 0) {
								@Pc(515) Class1_Sub40 local515;
								if (local204 && Static208.anInt3611 != 0 && local6.anObjectArray21 != null) {
									local515 = new Class1_Sub40();
									local515.aBoolean747 = true;
									local515.aClass124_14 = local6;
									local515.anInt6793 = Static208.anInt3611;
									local515.anObjectArray36 = local6.anObjectArray21;
									Static254.aClass227_28.method4972(local515);
								}
								if (Static371.aClass124_10 != null || Static17.aBoolean39 || local6.anInt3413 != Static347.anInt5947 && Static339.anInt5788 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt3413 != 0) {
									if (local6.anInt3413 == Static4.anInt67 || local6.anInt3413 == Static431.anInt7287) {
										Static210.aClass124_4 = local6;
										if (Static187.aClass5_1 != null) {
											Static187.aClass5_1.method55(local6.anInt3356, Static185.aClass34_7);
										}
										if (local6.anInt3413 == Static4.anInt67) {
											if (!Static17.aBoolean39 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static29.method389(arg9, arg8, Static185.aClass34_7);
												for (@Pc(598) Class4_Sub6 local598 = (Class4_Sub6) Static384.aClass262_12.method5819(); local598 != null; local598 = (Class4_Sub6) Static384.aClass262_12.method5813()) {
													if (arg8 >= local598.anInt6525 && arg8 < local598.anInt6520 && arg9 >= local598.anInt6519 && arg9 < local598.anInt6522) {
														Static108.method1714();
														Static5.method64(local598.aClass25_Sub5_Sub1_1);
													}
												}
											}
											Static437.method5726(local6, local22, local17);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt3413 == Static177.anInt2894) {
										if (local6.method2782(Static185.aClass34_7) == null || Static191.anInt3304 != 0 && Static191.anInt3304 != 3 || Static17.aBoolean39 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray210[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray219[local670]) {
											continue;
										}
										local296 -= local6.anInt3376 / 2;
										local670 -= local6.anInt3356 / 2;
										if (Static333.anInt5693 == 4) {
											local709 = (int) Static98.aFloat20 & 0x3FFF;
										} else {
											local709 = (int) Static98.aFloat20 + Static378.anInt2798 & 0x3FFF;
										}
										@Pc(721) int local721 = Class1_Sub4_Sub8_Sub1.anIntArray50[local709];
										@Pc(725) int local725 = Class1_Sub4_Sub8_Sub1.anIntArray49[local709];
										if (Static333.anInt5693 != 4) {
											local721 = local721 * (Static435.anInt7311 + 256) >> 8;
											local725 = local725 * (Static435.anInt7311 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static333.anInt5693 == 4) {
											local775 = (Static436.anInt7317 >> 7) + (local754 >> 2);
											local783 = (Static378.anInt2804 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static447.aClass25_Sub5_Sub1_Sub2_4.method3427() - 1) * 64;
											local775 = (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 - local792 >> 7) + (local754 >> 2);
											local783 = (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 - local792 >> 7) - (local764 >> 2);
										}
										if (Static433.aBoolean798 && (Static122.anInt2253 & 0x40) != 0) {
											@Pc(825) Class124 local825 = Static334.method4492(Static331.anInt5639, Static353.anInt6050);
											if (local825 == null) {
												Static124.method5684();
											} else {
												Static382.method5588(local6.anInt3405, local775, 23, Static337.aString67, " ->", local783, Static10.anInt181, 1L, true, false);
											}
											continue;
										}
										if (Static183.aClass48_3 == Static82.aClass48_7) {
											Static382.method5588(-1, local775, 15, Static423.aClass119_160.method2673(Static394.anInt6582), "", local783, -1, 1L, true, false);
										}
										Static382.method5588(-1, local775, 5, Static355.aString69, "", local783, Static299.anInt7360, 1L, true, false);
										continue;
									}
									if (local6.anInt3413 == Static347.anInt5947) {
										Static253.aClass124_7 = local6;
										if (local204) {
											Static451.aBoolean814 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method2418() - local17 - local6.anInt3376 / 2) * 2.0D / (double) Static167.aFloat24);
											local670 = (int) -((double) (local263.method2421() - local22 - local6.anInt3356 / 2) * 2.0D / (double) Static167.aFloat24);
											local430 = Static441.anInt7355 + local296 + Static167.anInt2089;
											local709 = Static169.anInt2773 + local670 + Static167.anInt2099;
											@Pc(939) Class1_Sub5_Sub18 local939 = Static172.method2426();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method5200(local709, local944, local430);
											if (local944 != null) {
												if (Static160.aClass123_1.method2750(82) && Static154.anInt2601 > 0) {
													Static263.method3719(local944[1], local944[2], local944[0]);
													continue;
												}
												Static338.aBoolean660 = true;
												Static20.anInt4876 = local944[0];
												Static412.anInt6773 = local944[1];
												Static130.anInt2371 = local944[2];
											}
											Static339.anInt5788 = 1;
											Static362.aBoolean171 = false;
											Static148.anInt2545 = Static62.aClass96_1.method3872();
											Static237.anInt4218 = Static62.aClass96_1.method3870();
											continue;
										}
										if (local248 && Static339.anInt5788 > 0) {
											if (Static339.anInt5788 == 1 && (Static148.anInt2545 != Static62.aClass96_1.method3872() || Static237.anInt4218 != Static62.aClass96_1.method3870())) {
												Static297.anInt5869 = Static441.anInt7355;
												Static68.anInt1274 = Static169.anInt2773;
												Static339.anInt5788 = 2;
											}
											if (Static339.anInt5788 == 2) {
												Static362.aBoolean171 = true;
												Static80.method1318(Static297.anInt5869 + (int) ((double) (Static148.anInt2545 - Static62.aClass96_1.method3872()) * 2.0D / (double) Static167.aFloat23));
												Static334.method4495(Static68.anInt1274 - (int) ((double) (Static237.anInt4218 - Static62.aClass96_1.method3870()) * 2.0D / (double) Static167.aFloat23));
											}
											continue;
										}
										if (Static339.anInt5788 > 0 && !Static362.aBoolean171) {
											if ((Static40.anInt703 == 1 || Static218.method3184()) && Static118.anInt2201 > 2) {
												Static382.method5592(Static148.anInt2545, Static237.anInt4218);
											} else if (Static235.method3391()) {
												Static382.method5592(Static148.anInt2545, Static237.anInt4218);
											}
										}
										Static339.anInt5788 = 0;
										continue;
									}
									if (local6.anInt3413 == Static169.anInt2769) {
										if (local248) {
											Static29.method390(Static62.aClass96_1.method3872() - local17, local6.anInt3376, Static62.aClass96_1.method3870() - local22, local6.anInt3356);
										}
										continue;
									}
									if (local6.anInt3413 == Static35.anInt619) {
										Static361.method4848(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean394 && local258) {
									local6.aBoolean394 = true;
									if (local6.anObjectArray34 != null) {
										local515 = new Class1_Sub40();
										local515.aBoolean747 = true;
										local515.aClass124_14 = local6;
										local515.anInt6789 = local263.method2418() - local17;
										local515.anInt6793 = local263.method2421() - local22;
										local515.anObjectArray36 = local6.anObjectArray34;
										Static254.aClass227_28.method4972(local515);
									}
								}
								if (local6.aBoolean394 && local248 && local6.anObjectArray12 != null) {
									local515 = new Class1_Sub40();
									local515.aBoolean747 = true;
									local515.aClass124_14 = local6;
									local515.anInt6789 = Static62.aClass96_1.method3872() - local17;
									local515.anInt6793 = Static62.aClass96_1.method3870() - local22;
									local515.anObjectArray36 = local6.anObjectArray12;
									Static254.aClass227_28.method4972(local515);
								}
								if (local6.aBoolean394 && !local248) {
									local6.aBoolean394 = false;
									if (local6.anObjectArray26 != null) {
										local515 = new Class1_Sub40();
										local515.aBoolean747 = true;
										local515.aClass124_14 = local6;
										local515.anInt6789 = Static62.aClass96_1.method3872() - local17;
										local515.anInt6793 = Static62.aClass96_1.method3870() - local22;
										local515.anObjectArray36 = local6.anObjectArray26;
										Static104.aClass227_9.method4972(local515);
									}
								}
								if (local248 && local6.anObjectArray31 != null) {
									local515 = new Class1_Sub40();
									local515.aBoolean747 = true;
									local515.aClass124_14 = local6;
									local515.anInt6789 = Static62.aClass96_1.method3872() - local17;
									local515.anInt6793 = Static62.aClass96_1.method3870() - local22;
									local515.anObjectArray36 = local6.anObjectArray31;
									Static254.aClass227_28.method4972(local515);
								}
								if (!local6.aBoolean400 && local204) {
									local6.aBoolean400 = true;
									if (local6.anObjectArray22 != null) {
										local515 = new Class1_Sub40();
										local515.aBoolean747 = true;
										local515.aClass124_14 = local6;
										local515.anInt6789 = Static62.aClass96_1.method3872() - local17;
										local515.anInt6793 = Static62.aClass96_1.method3870() - local22;
										local515.anObjectArray36 = local6.anObjectArray22;
										Static254.aClass227_28.method4972(local515);
									}
								}
								if (local6.aBoolean400 && local204 && local6.anObjectArray23 != null) {
									local515 = new Class1_Sub40();
									local515.aBoolean747 = true;
									local515.aClass124_14 = local6;
									local515.anInt6789 = Static62.aClass96_1.method3872() - local17;
									local515.anInt6793 = Static62.aClass96_1.method3870() - local22;
									local515.anObjectArray36 = local6.anObjectArray23;
									Static254.aClass227_28.method4972(local515);
								}
								if (local6.aBoolean400 && !local204) {
									local6.aBoolean400 = false;
									if (local6.anObjectArray8 != null) {
										local515 = new Class1_Sub40();
										local515.aBoolean747 = true;
										local515.aClass124_14 = local6;
										local515.anInt6789 = Static62.aClass96_1.method3872() - local17;
										local515.anInt6793 = Static62.aClass96_1.method3870() - local22;
										local515.anObjectArray36 = local6.anObjectArray8;
										Static104.aClass227_9.method4972(local515);
									}
								}
								if (local6.anObjectArray20 != null) {
									local515 = new Class1_Sub40();
									local515.aClass124_14 = local6;
									local515.anObjectArray36 = local6.anObjectArray20;
									Static3.aClass227_36.method4972(local515);
								}
								@Pc(1483) Class1_Sub40 local1483;
								if (local6.anObjectArray33 != null && Static427.anInt7221 > local6.anInt3392) {
									if (local6.anIntArray213 == null || Static427.anInt7221 - local6.anInt3392 > 32) {
										local515 = new Class1_Sub40();
										local515.aClass124_14 = local6;
										local515.anObjectArray36 = local6.anObjectArray33;
										Static254.aClass227_28.method4972(local515);
									} else {
										label678: for (local296 = local6.anInt3392; local296 < Static427.anInt7221; local296++) {
											local670 = Static453.anIntArray514[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray213.length; local430++) {
												if (local6.anIntArray213[local430] == local670) {
													local1483 = new Class1_Sub40();
													local1483.aClass124_14 = local6;
													local1483.anObjectArray36 = local6.anObjectArray33;
													Static254.aClass227_28.method4972(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt3392 = Static427.anInt7221;
								}
								if (local6.anObjectArray19 != null && Static391.anInt6532 > local6.anInt3395) {
									if (local6.anIntArray209 == null || Static391.anInt6532 - local6.anInt3395 > 32) {
										local515 = new Class1_Sub40();
										local515.aClass124_14 = local6;
										local515.anObjectArray36 = local6.anObjectArray19;
										Static254.aClass227_28.method4972(local515);
									} else {
										label654: for (local296 = local6.anInt3395; local296 < Static391.anInt6532; local296++) {
											local670 = Static416.anIntArray464[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray209.length; local430++) {
												if (local6.anIntArray209[local430] == local670) {
													local1483 = new Class1_Sub40();
													local1483.aClass124_14 = local6;
													local1483.anObjectArray36 = local6.anObjectArray19;
													Static254.aClass227_28.method4972(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt3395 = Static391.anInt6532;
								}
								if (local6.anObjectArray25 != null && Static396.anInt6617 > local6.anInt3374) {
									if (local6.anIntArray217 == null || Static396.anInt6617 - local6.anInt3374 > 32) {
										local515 = new Class1_Sub40();
										local515.aClass124_14 = local6;
										local515.anObjectArray36 = local6.anObjectArray25;
										Static254.aClass227_28.method4972(local515);
									} else {
										label630: for (local296 = local6.anInt3374; local296 < Static396.anInt6617; local296++) {
											local670 = Static17.anIntArray17[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray217.length; local430++) {
												if (local6.anIntArray217[local430] == local670) {
													local1483 = new Class1_Sub40();
													local1483.aClass124_14 = local6;
													local1483.anObjectArray36 = local6.anObjectArray25;
													Static254.aClass227_28.method4972(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt3374 = Static396.anInt6617;
								}
								if (local6.anObjectArray4 != null && Static360.anInt6141 > local6.anInt3349) {
									if (local6.anIntArray212 == null || Static360.anInt6141 - local6.anInt3349 > 32) {
										local515 = new Class1_Sub40();
										local515.aClass124_14 = local6;
										local515.anObjectArray36 = local6.anObjectArray4;
										Static254.aClass227_28.method4972(local515);
									} else {
										label606: for (local296 = local6.anInt3349; local296 < Static360.anInt6141; local296++) {
											local670 = Static313.anIntArray356[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray212.length; local430++) {
												if (local6.anIntArray212[local430] == local670) {
													local1483 = new Class1_Sub40();
													local1483.aClass124_14 = local6;
													local1483.anObjectArray36 = local6.anObjectArray4;
													Static254.aClass227_28.method4972(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt3349 = Static360.anInt6141;
								}
								if (local6.anObjectArray6 != null && Static36.anInt6548 > local6.anInt3407) {
									if (local6.anIntArray214 == null || Static36.anInt6548 - local6.anInt3407 > 32) {
										local515 = new Class1_Sub40();
										local515.aClass124_14 = local6;
										local515.anObjectArray36 = local6.anObjectArray6;
										Static254.aClass227_28.method4972(local515);
									} else {
										label582: for (local296 = local6.anInt3407; local296 < Static36.anInt6548; local296++) {
											local670 = Static414.anIntArray462[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray214.length; local430++) {
												if (local6.anIntArray214[local430] == local670) {
													local1483 = new Class1_Sub40();
													local1483.aClass124_14 = local6;
													local1483.anObjectArray36 = local6.anObjectArray6;
													Static254.aClass227_28.method4972(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt3407 = Static36.anInt6548;
								}
								if (Static146.anInt2528 > local6.anInt3425 && local6.anObjectArray24 != null) {
									local515 = new Class1_Sub40();
									local515.aClass124_14 = local6;
									local515.anObjectArray36 = local6.anObjectArray24;
									Static254.aClass227_28.method4972(local515);
								}
								if (Static183.anInt3199 > local6.anInt3425 && local6.anObjectArray18 != null) {
									local515 = new Class1_Sub40();
									local515.aClass124_14 = local6;
									local515.anObjectArray36 = local6.anObjectArray18;
									Static254.aClass227_28.method4972(local515);
								}
								if (Static109.anInt4879 > local6.anInt3425 && local6.anObjectArray27 != null) {
									local515 = new Class1_Sub40();
									local515.aClass124_14 = local6;
									local515.anObjectArray36 = local6.anObjectArray27;
									Static254.aClass227_28.method4972(local515);
								}
								if (Static193.anInt3424 > local6.anInt3425 && local6.anObjectArray29 != null) {
									local515 = new Class1_Sub40();
									local515.aClass124_14 = local6;
									local515.anObjectArray36 = local6.anObjectArray29;
									Static254.aClass227_28.method4972(local515);
								}
								if (Static15.anInt300 > local6.anInt3425 && local6.anObjectArray9 != null) {
									local515 = new Class1_Sub40();
									local515.aClass124_14 = local6;
									local515.anObjectArray36 = local6.anObjectArray9;
									Static254.aClass227_28.method4972(local515);
								}
								local6.anInt3425 = Static18.anInt379;
								if (local6.anObjectArray7 != null) {
									for (local296 = 0; local296 < Static324.anInt5556; local296++) {
										@Pc(1951) Class1_Sub40 local1951 = new Class1_Sub40();
										local1951.aClass124_14 = local6;
										local1951.anInt6790 = Static94.aClass128Array1[local296].method4778();
										local1951.anInt6791 = Static94.aClass128Array1[local296].method4780();
										local1951.anObjectArray36 = local6.anObjectArray7;
										Static254.aClass227_28.method4972(local1951);
									}
								}
								if (Static288.aBoolean575 && local6.anObjectArray15 != null) {
									local515 = new Class1_Sub40();
									local515.aClass124_14 = local6;
									local515.anObjectArray36 = local6.anObjectArray15;
									Static254.aClass227_28.method4972(local515);
								}
							}
							if (local6.anInt3417 == 5 && local6.anInt3361 != -1) {
								local6.method2772(aClass187_1, Static130.aClass164_1).method55(local6.anInt3356, Static185.aClass34_7);
							}
							Static281.method2014(local6);
							if (local6.anInt3417 == 0) {
								method973(arg0, local6.anInt3348, local28, local30, local32, local34, local17 - local6.anInt3390, local22 - local6.anInt3418, arg8, arg9);
								if (local6.aClass124Array1 != null) {
									method973(local6.aClass124Array1, local6.anInt3348, local28, local30, local32, local34, local17 - local6.anInt3390, local22 - local6.anInt3418, arg8, arg9);
								}
								@Pc(2073) Class1_Sub14 local2073 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local6.anInt3348);
								if (local2073 != null) {
									if (Static183.aClass48_3 == Static191.aClass48_4 && local2073.anInt1427 == 0 && !Static17.aBoolean39 && local204 && !Static239.aBoolean665) {
										Static108.method1714();
									}
									Static352.method4765(local32, local34, arg9, local28, local22, local17, local2073.anInt1425, arg8, local30);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static281.method2014(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method974() {
		@Pc(1) int local1 = Static285.anInt5015;
		@Pc(3) int[] local3 = Static103.anIntArray135;
		@Pc(20) boolean local20 = Static453.aClass136_Sub1_1.anInt4450 == 1 && local1 > 200 || Static453.aClass136_Sub1_1.anInt4450 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class25_Sub5_Sub1_Sub2 local29 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local3[local22]];
			if (local29.method3442()) {
				local29.method4343();
				if (local29.aShort97 >= 0 && local29.aShort94 >= 0 && local29.aShort96 < Static296.anInt5187 && local29.aShort95 < Static206.anInt3607) {
					local29.aBoolean488 = local29.aBoolean483 ? local20 : false;
					if (local29 == Static447.aClass25_Sub5_Sub1_Sub2_4) {
						local29.anInt4303 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean484) {
							local75++;
						}
						if (local29.anInt4312 > Static236.anInt4213) {
							local75 += 2;
						}
						local75 += 5 - local29.method3427() << 2;
						if (local29.aBoolean487) {
							local75 += 512;
						} else {
							if (Static332.anInt5660 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt4303 = local75 + 1;
					}
				} else {
					local29.anInt4303 = -1;
				}
			} else {
				local29.anInt4303 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static328.anInt5608; local116++) {
			@Pc(123) Class25_Sub5_Sub1_Sub1 local123 = Static87.aClass25_Sub5_Sub1_Sub1Array6[Static31.anIntArray30[local116]];
			if (local123.method2594() && local123.aClass54_1.method1159(Static320.aClass249_2)) {
				local123.method4343();
				if (local123.aShort97 >= 0 && local123.aShort94 >= 0 && local123.aShort96 < Static296.anInt5187 && local123.aShort95 < Static206.anInt3607) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean484) {
						local160++;
					}
					if (local123.anInt4312 > Static236.anInt4213) {
						local160 += 2;
					}
					local160 += 5 - local123.method3427() << 2;
					if (Static332.anInt5660 == 0) {
						if (local123.aClass54_1.aBoolean149) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static332.anInt5660 == 1) {
						if (local123.aClass54_1.aBoolean149) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass54_1.aBoolean154) {
						local160 += 1024;
					} else if (!local123.aClass54_1.aBoolean155) {
						local160 += 256;
					}
					local123.anInt4303 = local160 + 1;
				} else {
					local123.anInt4303 = -1;
				}
			} else {
				local123.anInt4303 = -1;
			}
		}
		for (local75 = 0; local75 < Static133.aClass135Array1.length; local75++) {
			@Pc(226) Class135 local226 = Static133.aClass135Array1[local75];
			if (local226 != null) {
				if (local226.anInt3824 == 1) {
					@Pc(237) Class25_Sub5_Sub1_Sub1 local237 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local226.anInt3817];
					if (local237 != null && local237.anInt4303 >= 0) {
						local237.anInt4303 += 2048;
					}
				} else if (local226.anInt3824 == 10) {
					@Pc(258) Class25_Sub5_Sub1_Sub2 local258 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local226.anInt3817];
					if (local258 != null && local258 != Static447.aClass25_Sub5_Sub1_Sub2_4 && local258.anInt4303 >= 0) {
						local258.anInt4303 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Object;Lclient!fq;I)V")
	public static void method975(@OriginalArg(0) Object arg0, @OriginalArg(1) Class83 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static223.method4582(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!jk;)Lclient!jk;")
	public static Class124 method977(@OriginalArg(0) Class124 arg0) {
		@Pc(4) int local4 = method970(arg0).method2816();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static412.method5315(arg0.anInt3344);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method979() {
		@Pc(1) int local1 = Static285.anInt5015;
		@Pc(3) int[] local3 = Static103.anIntArray135;
		@Pc(11) int local11 = Static189.aBoolean377 ? local1 : local1 + Static328.anInt5608;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class25_Sub5_Sub1 local23;
			if (local13 < local1) {
				local23 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = Static87.aClass25_Sub5_Sub1_Sub1Array6[Static31.anIntArray30[local13 - local1]];
			}
			if (local23.anInt4303 >= 0) {
				@Pc(39) int local39 = local23.method3427();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt5518 & 0x7F) == 0 && (local23.anInt5514 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt5518 & 0x7F) == 64 && (local23.anInt5514 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class25_Sub5_Sub1_Sub2 && local23.aClass1_Sub17_3 != null && Static236.anInt4213 >= local23.aClass1_Sub17_3.anInt1716 && Static236.anInt4213 < local23.aClass1_Sub17_3.anInt1711) {
					((Class25_Sub5_Sub1_Sub2) local23).aBoolean488 = false;
				}
				local23.anInt5517 = Static335.method4499(local23.aByte94, local23.anInt5518, local23.anInt5514);
				Static277.method4344(local23, true);
			}
		}
	}
}
