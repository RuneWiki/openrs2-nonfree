import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[Lclient!sa;")
	public static Class215[] aClass215Array2;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_25 = new Class45(43, 3);

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_5 = new Class202(10, 6);

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
	public static int anInt1607 = 1;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mc;)Lclient!pf;")
	public static Class12_Sub42 method1529(@OriginalArg(0) Class198 arg0) {
		@Pc(13) Class12_Sub42 local13 = (Class12_Sub42) Static545.aClass68_82.method1917(((long) arg0.anInt5739 << 32) + (long) arg0.anInt5705);
		return local13 == null ? arg0.aClass12_Sub42_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1532(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static381.anInt7254;
		@Pc(3) int[] local3 = Static496.anIntArray465;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static451.anInt4553; local5++) {
			@Pc(15) Class30_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class12_Sub41) Static29.aClass68_7.method1917((long) Static11.anIntArray16[local5 - local1])).aClass30_Sub1_Sub1_Sub2_2;
			}
			if (local15.aByte99 == arg0 && local15.anInt4182 >= 0) {
				@Pc(39) int local39 = local15.method3591();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9418 & 0x7F) != 0 || (local15.anInt9416 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt9418 & 0x7F) != 64 || (local15.anInt9416 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9418 >> 7;
					local80 = local15.anInt9416 >> 7;
					if (local15.anInt4182 > Static236.anIntArrayArray47[local75][local80]) {
						Static236.anIntArrayArray47[local75][local80] = local15.anInt4182;
						Static507.anIntArrayArray84[local75][local80] = 1;
					} else if (local15.anInt4182 == Static236.anIntArrayArray47[local75][local80]) {
						local116 = Static507.anIntArrayArray84[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt9418 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt9416 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt9418 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt9416 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt4182 > Static236.anIntArrayArray47[local158][local161]) {
								Static236.anIntArrayArray47[local158][local161] = local15.anInt4182;
								Static507.anIntArrayArray84[local158][local161] = 1;
							} else if (local15.anInt4182 == Static236.anIntArrayArray47[local158][local161]) {
								local116 = Static507.anIntArrayArray84[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1533(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static381.anInt7254;
		@Pc(3) int[] local3 = Static496.anIntArray465;
		@Pc(11) int local11 = Static402.aBoolean542 ? local1 : local1 + Static451.anInt4553;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class30_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class12_Sub41) Static29.aClass68_7.method1917((long) Static11.anIntArray16[local13 - local1])).aClass30_Sub1_Sub1_Sub2_2;
			}
			if (local23.aByte99 == arg0) {
				local23.anInt4176 = 0;
				if (local23.anInt4182 < 0) {
					local23.aBoolean334 = false;
				} else {
					@Pc(54) int local54 = local23.method3591();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9418 & 0x7F) != 0 || (local23.anInt9416 & 0x7F) != 0) {
							local23.aBoolean334 = false;
							continue;
						}
					} else if ((local23.anInt9418 & 0x7F) != 64 || (local23.anInt9416 & 0x7F) != 64) {
						local23.aBoolean334 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9418 >> 7;
						local101 = local23.anInt9416 >> 7;
						if (local23.anInt4182 != Static236.anIntArrayArray47[local96][local101]) {
							local23.aBoolean334 = true;
							continue;
						}
						if (Static507.anIntArrayArray84[local96][local101] > 1) {
							local126 = Static507.anIntArrayArray84[local96][local101]--;
							local23.aBoolean334 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt9418 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt9416 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt9418 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt9416 + local96 >> 7;
						if (!Static526.method7803(local169, local162, local23.anInt4182, local101, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt4182 == Static236.anIntArrayArray47[local180][local183]) {
										local126 = Static507.anIntArrayArray84[local180][local183]--;
									}
								}
							}
							local23.aBoolean334 = true;
							continue;
						}
					}
					if (local23 instanceof Class30_Sub1_Sub1_Sub1 && local23.aClass12_Sub26_3 != null && Static409.anInt7683 >= local23.aClass12_Sub26_3.anInt4794 && Static409.anInt7683 < local23.aClass12_Sub26_3.anInt4801) {
						((Class30_Sub1_Sub1_Sub1) local23).aBoolean42 = false;
					}
					local23.aBoolean334 = false;
					local23.anInt9422 = Static443.method6717(local23.anInt9418, local23.anInt9416, local23.aByte99);
					Static135.method2775(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mc;)Lclient!mc;")
	public static Class198 method1534(@OriginalArg(0) Class198 arg0) {
		@Pc(4) int local4 = method1529(arg0).method5782();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static104.method2137(arg0.anInt5787);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1535() {
		Static348.anInt6539 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static451.anInt4553; local3++) {
			@Pc(14) Class30_Sub1_Sub1_Sub2 local14 = ((Class12_Sub41) Static29.aClass68_7.method1917((long) Static11.anIntArray16[local3])).aClass30_Sub1_Sub1_Sub2_2;
			if (local14.aBoolean334 && local14.method3590() != -1) {
				@Pc(32) int local32 = (local14.method3591() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt9418 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt9416 - local32 >> 7;
				@Pc(53) Class30_Sub1_Sub1 local53 = Static471.method7106(local46, local14.aByte99, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt4197;
					if (local53 instanceof Class30_Sub1_Sub1_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt4176 == 0 && local53.method3590() != -1) {
						Static290.anIntArray398[Static348.anInt6539] = local58;
						Static354.anIntArray459[Static348.anInt6539] = local58;
						Static348.anInt6539++;
						local53.anInt4176++;
					}
					Static290.anIntArray398[Static348.anInt6539] = local58;
					Static354.anIntArray459[Static348.anInt6539] = local14.anInt4197 + 2048;
					Static348.anInt6539++;
					local53.anInt4176++;
				}
			}
		}
		Static37.method6282(Static348.anInt6539 - 1, 0, Static354.anIntArray459, Static290.anIntArray398);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1538() {
		for (@Pc(1) int local1 = 0; local1 < Static37.anInt7512; local1++) {
			@Pc(6) int[] local6 = Static236.anIntArrayArray47[local1];
			for (@Pc(8) int local8 = 0; local8 < Static329.anInt6247; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!mc;IIIIIIIII)V")
	public static void method1539(@OriginalArg(0) Class198[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class198 local6 = arg0[local1];
			if (local6 != null && local6.anInt5787 == arg1) {
				@Pc(17) int local17 = local6.anInt5713 + arg6;
				@Pc(22) int local22 = local6.anInt5741 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt5776 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt5762;
					@Pc(45) int local45 = local22 + local6.anInt5715;
					if (local6.anInt5776 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt5776 == 0 || local6.aBoolean446 || method1529(local6).anInt6901 != 0 || local6 == Static309.aClass198_9 || local6.anInt5788 == Static276.anInt5467) {
					if (!method1545(local6)) {
						if (local6 == Static191.aClass198_6 && Static24.method499(Static191.aClass198_6) != null) {
							Static451.aBoolean357 = true;
							Static477.anInt8703 = local17;
							Static100.anInt2302 = local22;
						}
						if (local6.aBoolean443 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean441 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class12_Sub6 local152 = (Class12_Sub6) Static341.aClass73_54.method2005(); local152 != null; local152 = (Class12_Sub6) Static341.aClass73_54.method2009()) {
									if (local152.aBoolean109) {
										local152.method7967();
										local152.aClass198_2.aBoolean433 = false;
									}
								}
								if (Static463.anInt8420 == 0) {
									Static191.aClass198_6 = null;
									Static309.aClass198_9 = null;
								}
								Static351.anInt6572 = 0;
								Static287.aBoolean426 = false;
								Static140.aBoolean251 = false;
								if (!Static389.aBoolean533) {
									Static278.method4633();
								}
							}
							@Pc(208) boolean local208;
							if (Static527.aClass6_1.method3754() >= local28 && Static527.aClass6_1.method3757() >= local30 && Static527.aClass6_1.method3754() < local32 && Static527.aClass6_1.method3757() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static73.aBoolean136 && local208) {
								if (local6.anInt5737 >= 0) {
									Static4.anInt69 = local6.anInt5737;
								} else if (local6.aBoolean441) {
									Static4.anInt69 = -1;
								}
							}
							if (!Static389.aBoolean533 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static458.method6891(arg8 - local17, arg9 - local22, local6);
							}
							@Pc(252) boolean local252 = false;
							if (Static527.aClass6_1.method3752() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class12_Sub3 local267 = (Class12_Sub3) Static55.aClass73_13.method2005();
							if (local267 != null && local267.method6274() == 0 && local267.method6279() >= local28 && local267.method6275() >= local30 && local267.method6279() < local32 && local267.method6275() < local34) {
								local262 = true;
							}
							@Pc(300) int local300;
							@Pc(434) int local434;
							if (local6.aByteArray71 != null) {
								for (local300 = 0; local300 < local6.aByteArray71.length; local300++) {
									if (Static23.aClass5_3.method211(local6.aByteArray71[local300])) {
										if (local6.anIntArray409 == null || Static409.anInt7683 >= local6.anIntArray409[local300]) {
											@Pc(332) byte local332 = local6.aByteArray70[local300];
											if (local332 == 0 || ((local332 & 0x8) == 0 || !Static23.aClass5_3.method211(86) && !Static23.aClass5_3.method211(82) && !Static23.aClass5_3.method211(81)) && ((local332 & 0x2) == 0 || Static23.aClass5_3.method211(86)) && ((local332 & 0x1) == 0 || Static23.aClass5_3.method211(82)) && ((local332 & 0x4) == 0 || Static23.aClass5_3.method211(81))) {
												if (local300 < 10) {
													Static532.method7874(-1, "", local6.anInt5739, local300 + 1);
												} else if (local300 == 10) {
													Static227.method4101();
													@Pc(403) Class12_Sub42 local403 = method1529(local6);
													Static274.method4603(local6, local403.anInt6906, local403.method5780());
													Static274.aString59 = Static14.method356(local6);
													if (Static274.aString59 == null) {
														Static274.aString59 = "Null";
													}
													Static497.aString104 = local6.aString65 + "<col=ffffff>";
												}
												local434 = local6.lb[local300];
												if (local6.anIntArray409 == null) {
													local6.anIntArray409 = new int[local6.aByteArray71.length];
												}
												if (local434 == 0) {
													local6.anIntArray409[local300] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray409[local300] = Static409.anInt7683 + local434;
												}
											}
										}
									} else if (local6.anIntArray409 != null) {
										local6.anIntArray409[local300] = 0;
									}
								}
							}
							if (local262) {
								Static466.method6991(local267.method6275() - local22, local267.method6279() - local17, local6);
							}
							if (Static191.aClass198_6 != null && Static191.aClass198_6 != local6 && local208 && method1529(local6).method5778()) {
								Static353.aClass198_12 = local6;
							}
							if (local6 == Static309.aClass198_9) {
								Static109.aBoolean213 = true;
								Static511.anInt9214 = local17;
								Static75.anInt1788 = local22;
							}
							if (local6.aBoolean446 || local6.anInt5788 != 0) {
								@Pc(519) Class12_Sub6 local519;
								if (local208 && Static157.anInt3415 != 0 && local6.anObjectArray33 != null) {
									local519 = new Class12_Sub6();
									local519.aBoolean109 = true;
									local519.aClass198_2 = local6;
									local519.anInt1513 = Static157.anInt3415;
									local519.anObjectArray2 = local6.anObjectArray33;
									Static341.aClass73_54.method2012(local519);
								}
								if (Static191.aClass198_6 != null || Static389.aBoolean533 || local6.anInt5788 != Static274.anInt5452 && Static351.anInt6572 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(674) int local674;
								if (local6.anInt5788 != 0) {
									if (local6.anInt5788 == Static517.anInt9282 || local6.anInt5788 == Static370.anInt6852) {
										Static522.aClass198_16 = local6;
										if (Static476.aClass186_2 != null) {
											Static476.aClass186_2.method4604(local6.anInt5715, Static243.aClass42_4);
										}
										if (local6.anInt5788 == Static517.anInt9282) {
											if (!Static389.aBoolean533 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static430.method6589(arg8, Static243.aClass42_4, arg9);
												for (@Pc(602) Class7_Sub7 local602 = (Class7_Sub7) Static526.aClass149_8.method3989(); local602 != null; local602 = (Class7_Sub7) Static526.aClass149_8.method3986()) {
													if (arg8 >= local602.anInt9253 && arg8 < local602.anInt9254 && arg9 >= local602.anInt9251 && arg9 < local602.anInt9250) {
														Static278.method4633();
														Static539.method7931(local602.aClass30_Sub1_Sub1_1);
													}
												}
											}
											Static419.method6485(local17, local22, local6);
											continue;
										}
									}
									@Pc(713) int local713;
									if (local6.anInt5788 == Static276.anInt5467) {
										if (local6.method4813(Static243.aClass42_4) == null || Static540.anInt9595 != 0 && Static540.anInt9595 != 3 || Static389.aBoolean533 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local300 = arg8 - local17;
										local674 = arg9 - local22;
										local434 = local6.anIntArray408[local674];
										if (local300 < local434 || local300 > local434 + local6.anIntArray405[local674]) {
											continue;
										}
										local300 -= local6.anInt5762 / 2;
										local674 -= local6.anInt5715 / 2;
										if (Static242.anInt4993 == 4) {
											local713 = (int) Static500.aFloat186 & 0x3FFF;
										} else {
											local713 = (int) Static500.aFloat186 + Static432.anInt7990 & 0x3FFF;
										}
										@Pc(725) int local725 = Class12_Sub1_Sub36.anIntArray667[local713];
										@Pc(729) int local729 = Class12_Sub1_Sub36.anIntArray668[local713];
										if (Static242.anInt4993 != 4) {
											local725 = local725 * (Static339.anInt6470 + 256) >> 8;
											local729 = local729 * (Static339.anInt6470 + 256) >> 8;
										}
										@Pc(758) int local758 = local674 * local725 + local300 * local729 >> 15;
										@Pc(768) int local768 = local674 * local729 - local300 * local725 >> 15;
										@Pc(779) int local779;
										@Pc(787) int local787;
										if (Static242.anInt4993 == 4) {
											local779 = (Static247.anInt5092 >> 7) + (local758 >> 2);
											local787 = (Static357.anInt6674 >> 7) - (local768 >> 2);
										} else {
											@Pc(796) int local796 = (Static440.aClass30_Sub1_Sub1_Sub1_2.method3591() - 1) * 64;
											local779 = (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 - local796 >> 7) + (local758 >> 2);
											local787 = (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 - local796 >> 7) - (local768 >> 2);
										}
										if (Static73.aBoolean136 && (Static266.anInt5318 & 0x40) != 0) {
											@Pc(829) Class198 local829 = Static428.method6579(Static155.anInt3381, Static148.anInt6865);
											if (local829 == null) {
												Static227.method4101();
											} else {
												Static160.method3297(" ->", local787, local779, 45, local6.anInt5726, true, 1L, Static274.aString59, Static156.anInt3411, false);
											}
											continue;
										}
										if (Static293.aClass138_7 == Static518.aClass138_8) {
											Static160.method3297("", local787, local779, 49, -1, true, 1L, Static483.aClass88_261.method2391(Static345.anInt6495), -1, false);
										}
										Static160.method3297("", local787, local779, 5, -1, true, 1L, Static261.aString55, Static455.anInt8710, false);
										continue;
									}
									if (local6.anInt5788 == Static274.anInt5452) {
										Static86.aClass198_3 = local6;
										if (local208) {
											Static287.aBoolean426 = true;
										}
										if (local262) {
											local300 = (int) ((double) (local267.method6279() - local17 - local6.anInt5762 / 2) * 2.0D / (double) Static2.aFloat123);
											local674 = (int) -((double) (local267.method6275() - local22 - local6.anInt5715 / 2) * 2.0D / (double) Static2.aFloat123);
											local434 = Static153.anInt3358 + local300 + Static2.anInt5916;
											local713 = Static404.anInt7598 + local674 + Static2.anInt5914;
											@Pc(943) Class12_Sub4_Sub7 local943 = Static200.method3793();
											if (local943 == null) {
												continue;
											}
											@Pc(948) int[] local948 = new int[3];
											local943.method2808(local434, local713, local948);
											if (local948 != null) {
												if (Static23.aClass5_3.method211(82) && Static59.anInt1442 > 0) {
													Static301.method4835(local948[1], local948[2], local948[0]);
													continue;
												}
												Static140.aBoolean251 = true;
												Static497.anInt8951 = local948[0];
												Static197.anInt4404 = local948[1];
												Static23.anInt9183 = local948[2];
											}
											Static351.anInt6572 = 1;
											Static538.aBoolean680 = false;
											Static43.anInt839 = Static527.aClass6_1.method3754();
											Static427.anInt7899 = Static527.aClass6_1.method3757();
											continue;
										}
										if (local252 && Static351.anInt6572 > 0) {
											if (Static351.anInt6572 == 1 && (Static43.anInt839 != Static527.aClass6_1.method3754() || Static427.anInt7899 != Static527.aClass6_1.method3757())) {
												Static420.anInt7808 = Static153.anInt3358;
												Static194.anInt4314 = Static404.anInt7598;
												Static351.anInt6572 = 2;
											}
											if (Static351.anInt6572 == 2) {
												Static538.aBoolean680 = true;
												Static348.method5475(Static420.anInt7808 + (int) ((double) (Static43.anInt839 - Static527.aClass6_1.method3754()) * 2.0D / (double) Static2.aFloat122));
												Static87.method1915(Static194.anInt4314 - (int) ((double) (Static427.anInt7899 - Static527.aClass6_1.method3757()) * 2.0D / (double) Static2.aFloat122));
											}
											continue;
										}
										if (Static351.anInt6572 > 0 && !Static538.aBoolean680) {
											if ((Static268.anInt5393 == 1 || Static377.method7984()) && Static8.anInt118 > 2) {
												Static488.method7289(Static43.anInt839, Static427.anInt7899);
											} else if (Static438.method6664()) {
												Static488.method7289(Static43.anInt839, Static427.anInt7899);
											}
										}
										Static351.anInt6572 = 0;
										continue;
									}
									if (local6.anInt5788 == Static341.anInt6478) {
										if (local252) {
											Static139.method2818(Static527.aClass6_1.method3757() - local22, local6.anInt5762, Static527.aClass6_1.method3754() - local17, local6.anInt5715);
										}
										continue;
									}
									if (local6.anInt5788 == Static412.anInt7723) {
										Static96.method2048(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean436 && local262) {
									local6.aBoolean436 = true;
									if (local6.anObjectArray15 != null) {
										local519 = new Class12_Sub6();
										local519.aBoolean109 = true;
										local519.aClass198_2 = local6;
										local519.anInt1509 = local267.method6279() - local17;
										local519.anInt1513 = local267.method6275() - local22;
										local519.anObjectArray2 = local6.anObjectArray15;
										Static341.aClass73_54.method2012(local519);
									}
								}
								if (local6.aBoolean436 && local252 && local6.anObjectArray28 != null) {
									local519 = new Class12_Sub6();
									local519.aBoolean109 = true;
									local519.aClass198_2 = local6;
									local519.anInt1509 = Static527.aClass6_1.method3754() - local17;
									local519.anInt1513 = Static527.aClass6_1.method3757() - local22;
									local519.anObjectArray2 = local6.anObjectArray28;
									Static341.aClass73_54.method2012(local519);
								}
								if (local6.aBoolean436 && !local252) {
									local6.aBoolean436 = false;
									if (local6.anObjectArray11 != null) {
										local519 = new Class12_Sub6();
										local519.aBoolean109 = true;
										local519.aClass198_2 = local6;
										local519.anInt1509 = Static527.aClass6_1.method3754() - local17;
										local519.anInt1513 = Static527.aClass6_1.method3757() - local22;
										local519.anObjectArray2 = local6.anObjectArray11;
										Static239.aClass73_41.method2012(local519);
									}
								}
								if (local252 && local6.anObjectArray24 != null) {
									local519 = new Class12_Sub6();
									local519.aBoolean109 = true;
									local519.aClass198_2 = local6;
									local519.anInt1509 = Static527.aClass6_1.method3754() - local17;
									local519.anInt1513 = Static527.aClass6_1.method3757() - local22;
									local519.anObjectArray2 = local6.anObjectArray24;
									Static341.aClass73_54.method2012(local519);
								}
								if (!local6.aBoolean433 && local208) {
									local6.aBoolean433 = true;
									if (local6.anObjectArray5 != null) {
										local519 = new Class12_Sub6();
										local519.aBoolean109 = true;
										local519.aClass198_2 = local6;
										local519.anInt1509 = Static527.aClass6_1.method3754() - local17;
										local519.anInt1513 = Static527.aClass6_1.method3757() - local22;
										local519.anObjectArray2 = local6.anObjectArray5;
										Static341.aClass73_54.method2012(local519);
									}
								}
								if (local6.aBoolean433 && local208 && local6.anObjectArray10 != null) {
									local519 = new Class12_Sub6();
									local519.aBoolean109 = true;
									local519.aClass198_2 = local6;
									local519.anInt1509 = Static527.aClass6_1.method3754() - local17;
									local519.anInt1513 = Static527.aClass6_1.method3757() - local22;
									local519.anObjectArray2 = local6.anObjectArray10;
									Static341.aClass73_54.method2012(local519);
								}
								if (local6.aBoolean433 && !local208) {
									local6.aBoolean433 = false;
									if (local6.anObjectArray21 != null) {
										local519 = new Class12_Sub6();
										local519.aBoolean109 = true;
										local519.aClass198_2 = local6;
										local519.anInt1509 = Static527.aClass6_1.method3754() - local17;
										local519.anInt1513 = Static527.aClass6_1.method3757() - local22;
										local519.anObjectArray2 = local6.anObjectArray21;
										Static239.aClass73_41.method2012(local519);
									}
								}
								if (local6.anObjectArray6 != null) {
									local519 = new Class12_Sub6();
									local519.aClass198_2 = local6;
									local519.anObjectArray2 = local6.anObjectArray6;
									Static330.aClass73_51.method2012(local519);
								}
								@Pc(1487) Class12_Sub6 local1487;
								if (local6.anObjectArray7 != null && Static272.anInt5425 > local6.anInt5780) {
									if (local6.anIntArray403 == null || Static272.anInt5425 - local6.anInt5780 > 32) {
										local519 = new Class12_Sub6();
										local519.aClass198_2 = local6;
										local519.anObjectArray2 = local6.anObjectArray7;
										Static341.aClass73_54.method2012(local519);
									} else {
										label680: for (local300 = local6.anInt5780; local300 < Static272.anInt5425; local300++) {
											local674 = Static530.anIntArray686[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray403.length; local434++) {
												if (local6.anIntArray403[local434] == local674) {
													local1487 = new Class12_Sub6();
													local1487.aClass198_2 = local6;
													local1487.anObjectArray2 = local6.anObjectArray7;
													Static341.aClass73_54.method2012(local1487);
													break label680;
												}
											}
										}
									}
									local6.anInt5780 = Static272.anInt5425;
								}
								if (local6.anObjectArray31 != null && Static78.anInt1823 > local6.anInt5781) {
									if (local6.anIntArray404 == null || Static78.anInt1823 - local6.anInt5781 > 32) {
										local519 = new Class12_Sub6();
										local519.aClass198_2 = local6;
										local519.anObjectArray2 = local6.anObjectArray31;
										Static341.aClass73_54.method2012(local519);
									} else {
										label656: for (local300 = local6.anInt5781; local300 < Static78.anInt1823; local300++) {
											local674 = Static437.anIntArray604[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray404.length; local434++) {
												if (local6.anIntArray404[local434] == local674) {
													local1487 = new Class12_Sub6();
													local1487.aClass198_2 = local6;
													local1487.anObjectArray2 = local6.anObjectArray31;
													Static341.aClass73_54.method2012(local1487);
													break label656;
												}
											}
										}
									}
									local6.anInt5781 = Static78.anInt1823;
								}
								if (local6.anObjectArray25 != null && Static14.anInt234 > local6.anInt5747) {
									if (local6.anIntArray407 == null || Static14.anInt234 - local6.anInt5747 > 32) {
										local519 = new Class12_Sub6();
										local519.aClass198_2 = local6;
										local519.anObjectArray2 = local6.anObjectArray25;
										Static341.aClass73_54.method2012(local519);
									} else {
										label632: for (local300 = local6.anInt5747; local300 < Static14.anInt234; local300++) {
											local674 = Static482.anIntArray652[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray407.length; local434++) {
												if (local6.anIntArray407[local434] == local674) {
													local1487 = new Class12_Sub6();
													local1487.aClass198_2 = local6;
													local1487.anObjectArray2 = local6.anObjectArray25;
													Static341.aClass73_54.method2012(local1487);
													break label632;
												}
											}
										}
									}
									local6.anInt5747 = Static14.anInt234;
								}
								if (local6.anObjectArray20 != null && Static66.anInt1515 > local6.anInt5734) {
									if (local6.anIntArray406 == null || Static66.anInt1515 - local6.anInt5734 > 32) {
										local519 = new Class12_Sub6();
										local519.aClass198_2 = local6;
										local519.anObjectArray2 = local6.anObjectArray20;
										Static341.aClass73_54.method2012(local519);
									} else {
										label608: for (local300 = local6.anInt5734; local300 < Static66.anInt1515; local300++) {
											local674 = Static365.anIntArray469[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray406.length; local434++) {
												if (local6.anIntArray406[local434] == local674) {
													local1487 = new Class12_Sub6();
													local1487.aClass198_2 = local6;
													local1487.anObjectArray2 = local6.anObjectArray20;
													Static341.aClass73_54.method2012(local1487);
													break label608;
												}
											}
										}
									}
									local6.anInt5734 = Static66.anInt1515;
								}
								if (local6.anObjectArray32 != null && Static30.anInt9642 > local6.anInt5785) {
									if (local6.anIntArray402 == null || Static30.anInt9642 - local6.anInt5785 > 32) {
										local519 = new Class12_Sub6();
										local519.aClass198_2 = local6;
										local519.anObjectArray2 = local6.anObjectArray32;
										Static341.aClass73_54.method2012(local519);
									} else {
										label584: for (local300 = local6.anInt5785; local300 < Static30.anInt9642; local300++) {
											local674 = Static423.anIntArray12[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray402.length; local434++) {
												if (local6.anIntArray402[local434] == local674) {
													local1487 = new Class12_Sub6();
													local1487.aClass198_2 = local6;
													local1487.anObjectArray2 = local6.anObjectArray32;
													Static341.aClass73_54.method2012(local1487);
													break label584;
												}
											}
										}
									}
									local6.anInt5785 = Static30.anInt9642;
								}
								if (Static7.anInt9361 > local6.anInt5752 && local6.anObjectArray30 != null) {
									local519 = new Class12_Sub6();
									local519.aClass198_2 = local6;
									local519.anObjectArray2 = local6.anObjectArray30;
									Static341.aClass73_54.method2012(local519);
								}
								if (Static395.anInt7445 > local6.anInt5752 && local6.anObjectArray27 != null) {
									local519 = new Class12_Sub6();
									local519.aClass198_2 = local6;
									local519.anObjectArray2 = local6.anObjectArray27;
									Static341.aClass73_54.method2012(local519);
								}
								if (Static250.anInt5147 > local6.anInt5752 && local6.anObjectArray26 != null) {
									local519 = new Class12_Sub6();
									local519.aClass198_2 = local6;
									local519.anObjectArray2 = local6.anObjectArray26;
									Static341.aClass73_54.method2012(local519);
								}
								if (Static396.anInt7453 > local6.anInt5752 && local6.anObjectArray23 != null) {
									local519 = new Class12_Sub6();
									local519.aClass198_2 = local6;
									local519.anObjectArray2 = local6.anObjectArray23;
									Static341.aClass73_54.method2012(local519);
								}
								if (Static162.anInt3761 > local6.anInt5752 && local6.anObjectArray8 != null) {
									local519 = new Class12_Sub6();
									local519.aClass198_2 = local6;
									local519.anObjectArray2 = local6.anObjectArray8;
									Static341.aClass73_54.method2012(local519);
								}
								local6.anInt5752 = Static413.anInt7729;
								if (local6.anObjectArray12 != null) {
									for (local300 = 0; local300 < Static162.anInt3760; local300++) {
										@Pc(1955) Class12_Sub6 local1955 = new Class12_Sub6();
										local1955.aClass198_2 = local6;
										local1955.anInt1512 = Static259.anInterface1Array2[local300].method6638();
										local1955.anInt1508 = Static259.anInterface1Array2[local300].method6642();
										local1955.anObjectArray2 = local6.anObjectArray12;
										Static341.aClass73_54.method2012(local1955);
									}
								}
								if (Static161.aBoolean373 && local6.anObjectArray16 != null) {
									local519 = new Class12_Sub6();
									local519.aClass198_2 = local6;
									local519.anObjectArray2 = local6.anObjectArray16;
									Static341.aClass73_54.method2012(local519);
								}
							}
							if (local6.anInt5776 == 5 && local6.anInt5746 != -1) {
								local6.method4802(Static114.aClass252_1, Static496.aClass60_3).method4604(local6.anInt5715, Static243.aClass42_4);
							}
							Static62.method1461(local6);
							if (local6.anInt5776 == 0) {
								method1539(arg0, local6.anInt5739, local28, local30, local32, local34, local17 - local6.anInt5732, local22 - local6.anInt5791, arg8, arg9);
								if (local6.aClass198Array1 != null) {
									method1539(local6.aClass198Array1, local6.anInt5739, local28, local30, local32, local34, local17 - local6.anInt5732, local22 - local6.anInt5791, arg8, arg9);
								}
								@Pc(2077) Class12_Sub34 local2077 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local6.anInt5739);
								if (local2077 != null) {
									if (Static293.aClass138_7 == Static468.aClass138_6 && local2077.anInt5829 == 0 && !Static389.aBoolean533 && local208 && !Static470.aBoolean610) {
										Static278.method4633();
									}
									Static110.method2276(local30, local2077.anInt5831, local28, arg9, local34, local22, arg8, local32, local17);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static62.method1461(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLjava/lang/String;Lclient!gi;)Lclient!sca;")
	public static Class272 method1543(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class42_Sub3 arg2) {
		@Pc(10) long local10 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local10, arg1);
		OpenGL.glCompileShaderARB(local10);
		OpenGL.glGetObjectParameterivARB(local10, 35713, Static546.anIntArray701, 0);
		if (Static546.anIntArray701[0] == 0) {
			if (Static546.anIntArray701[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local10, 35716, Static546.anIntArray701, 1);
			if (Static546.anIntArray701[1] > 1) {
				@Pc(49) byte[] local49 = new byte[Static546.anIntArray701[1]];
				OpenGL.glGetInfoLogARB(local10, Static546.anIntArray701[1], Static546.anIntArray701, 0, local49, 0);
				System.out.println(new String(local49));
			}
			if (Static546.anIntArray701[0] == 0) {
				OpenGL.glDeleteObjectARB(local10);
				return null;
			}
		}
		return new Class272(arg2, local10, arg0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1544() {
		@Pc(1) int local1 = Static381.anInt7254;
		@Pc(3) int[] local3 = Static496.anIntArray465;
		@Pc(20) boolean local20 = Static208.aClass12_Sub10_Sub1_1.anInt2218 == 1 && local1 > 200 || Static208.aClass12_Sub10_Sub1_1.anInt2218 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class30_Sub1_Sub1_Sub1 local29 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local3[local22]];
			if (local29.method781()) {
				local29.method7813();
				if (local29.aShort115 >= 0 && local29.aShort112 >= 0 && local29.aShort113 < Static37.anInt7512 && local29.aShort114 < Static329.anInt6247) {
					local29.aBoolean42 = local29.aBoolean335 ? local20 : false;
					if (local29 == Static440.aClass30_Sub1_Sub1_Sub1_2) {
						local29.anInt4182 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean334) {
							local75++;
						}
						if (local29.anInt4144 > Static409.anInt7683) {
							local75 += 2;
						}
						local75 += 5 - local29.method3591() << 2;
						if (local29.aBoolean43) {
							local75 += 512;
						} else {
							if (Static123.anInt2886 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt4182 = local75 + 1;
					}
				} else {
					local29.anInt4182 = -1;
				}
			} else {
				local29.anInt4182 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static451.anInt4553; local116++) {
			@Pc(127) Class30_Sub1_Sub1_Sub2 local127 = ((Class12_Sub41) Static29.aClass68_7.method1917((long) Static11.anIntArray16[local116])).aClass30_Sub1_Sub1_Sub2_2;
			if (local127.method3606() && local127.aClass130_1.method3569(Static393.aClass31_1)) {
				local127.method7813();
				if (local127.aShort115 >= 0 && local127.aShort112 >= 0 && local127.aShort113 < Static37.anInt7512 && local127.aShort114 < Static329.anInt6247) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean334) {
						local164++;
					}
					if (local127.anInt4144 > Static409.anInt7683) {
						local164 += 2;
					}
					local164 += 5 - local127.method3591() << 2;
					if (Static123.anInt2886 == 0) {
						if (local127.aClass130_1.aBoolean329) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static123.anInt2886 == 1) {
						if (local127.aClass130_1.aBoolean329) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass130_1.aBoolean330) {
						local164 += 1024;
					} else if (!local127.aClass130_1.aBoolean328) {
						local164 += 256;
					}
					local127.anInt4182 = local164 + 1;
				} else {
					local127.anInt4182 = -1;
				}
			} else {
				local127.anInt4182 = -1;
			}
		}
		for (local75 = 0; local75 < Static22.aClass76Array28.length; local75++) {
			@Pc(230) Class76 local230 = Static22.aClass76Array28[local75];
			if (local230 != null) {
				if (local230.anInt2310 == 1) {
					@Pc(244) Class12_Sub41 local244 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local230.anInt2309);
					if (local244 != null) {
						@Pc(249) Class30_Sub1_Sub1_Sub2 local249 = local244.aClass30_Sub1_Sub1_Sub2_2;
						if (local249.anInt4182 >= 0) {
							local249.anInt4182 += 2048;
						}
					}
				} else if (local230.anInt2310 == 10) {
					@Pc(268) Class30_Sub1_Sub1_Sub1 local268 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local230.anInt2309];
					if (local268 != null && local268 != Static440.aClass30_Sub1_Sub1_Sub1_2 && local268.anInt4182 >= 0) {
						local268.anInt4182 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!mc;)Z")
	public static boolean method1545(@OriginalArg(0) Class198 arg0) {
		if (Static470.aBoolean610) {
			if (method1529(arg0).anInt6901 != 0) {
				return false;
			}
			if (arg0.anInt5776 == 0) {
				return false;
			}
		}
		return arg0.aBoolean440;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1547() {
		@Pc(1) int local1 = Static381.anInt7254;
		@Pc(3) int[] local3 = Static496.anIntArray465;
		@Pc(11) int local11 = Static402.aBoolean542 ? local1 : local1 + Static451.anInt4553;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class30_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class12_Sub41) Static29.aClass68_7.method1917((long) Static11.anIntArray16[local13 - local1])).aClass30_Sub1_Sub1_Sub2_2;
			}
			if (local23.anInt4182 >= 0) {
				@Pc(43) int local43 = local23.method3591();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9418 & 0x7F) == 0 && (local23.anInt9416 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt9418 & 0x7F) == 64 && (local23.anInt9416 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class30_Sub1_Sub1_Sub1 && local23.aClass12_Sub26_3 != null && Static409.anInt7683 >= local23.aClass12_Sub26_3.anInt4794 && Static409.anInt7683 < local23.aClass12_Sub26_3.anInt4801) {
					((Class30_Sub1_Sub1_Sub1) local23).aBoolean42 = false;
				}
				local23.anInt9422 = Static443.method6717(local23.anInt9418, local23.anInt9416, local23.aByte99);
				Static135.method2775(local23, true);
			}
		}
	}
}
