import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_32 = new Class180(87, 8);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1510() {
		@Pc(1) int local1 = Static393.anInt6147;
		@Pc(3) int[] local3 = Static430.anIntArray612;
		@Pc(8) int local8 = Static24.aClass3_Sub22_4.aClass6_Sub23_1.method7637();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class28_Sub1_Sub1_Sub1_Sub1 local32 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local3[local25]];
			if (!local32.method9108()) {
				local32.anInt10803 = -1;
			} else if (local32.aBoolean791) {
				local32.anInt10803 = -1;
			} else {
				local32.method9299();
				if (local32.aShort125 >= 0 && local32.aShort123 >= 0 && local32.aShort124 < Static158.anInt927 && local32.aShort122 < Static515.anInt8292) {
					local32.aBoolean790 = local32.aBoolean820 ? local23 : false;
					if (local32 == Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2) {
						local32.anInt10803 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean819) {
							local85++;
						}
						if (local32.anInt10793 > Static588.anInt9467) {
							local85 += 2;
						}
						local85 += 5 - local32.method9314() << 2;
						if (local32.aBoolean792 || local32.aBoolean793) {
							local85 += 512;
						} else {
							if (Static403.anInt6412 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt10803 = local85 + 1;
					}
				} else {
					local32.anInt10803 = -1;
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < Static561.anInt9114; local129++) {
			@Pc(140) Class28_Sub1_Sub1_Sub1_Sub2 local140 = ((Class3_Sub3) Static522.aClass83_34.method2368((long) Static131.anIntArray226[local129])).aClass28_Sub1_Sub1_Sub1_Sub2_1;
			if (local140.method9329() && local140.aClass300_1.method7264(Static131.aClass66_1)) {
				local140.method9299();
				if (local140.aShort125 >= 0 && local140.aShort123 >= 0 && local140.aShort124 < Static158.anInt927 && local140.aShort122 < Static515.anInt8292) {
					@Pc(177) int local177 = 0;
					if (!local140.aBoolean819) {
						local177++;
					}
					if (local140.anInt10793 > Static588.anInt9467) {
						local177 += 2;
					}
					local177 += 5 - local140.method9314() << 2;
					if (Static403.anInt6412 == 0) {
						if (local140.aClass300_1.aBoolean628) {
							local177 += 64;
						} else {
							local177 += 128;
						}
					} else if (Static403.anInt6412 == 1) {
						if (local140.aClass300_1.aBoolean628) {
							local177 += 32;
						} else {
							local177 += 64;
						}
					}
					if (local140.aClass300_1.aBoolean630) {
						local177 += 1024;
					} else if (!local140.aClass300_1.aBoolean629) {
						local177 += 256;
					}
					local140.anInt10803 = local177 + 1;
				} else {
					local140.anInt10803 = -1;
				}
			} else {
				local140.anInt10803 = -1;
			}
		}
		for (local85 = 0; local85 < Static292.aClass142Array1.length; local85++) {
			@Pc(243) Class142 local243 = Static292.aClass142Array1[local85];
			if (local243 != null) {
				if (local243.anInt4300 == 1) {
					@Pc(257) Class3_Sub3 local257 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local243.anInt4302);
					if (local257 != null) {
						@Pc(262) Class28_Sub1_Sub1_Sub1_Sub2 local262 = local257.aClass28_Sub1_Sub1_Sub1_Sub2_1;
						if (local262.anInt10803 >= 0) {
							local262.anInt10803 += 2048;
						}
					}
				} else if (local243.anInt4300 == 10) {
					@Pc(281) Class28_Sub1_Sub1_Sub1_Sub1 local281 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local243.anInt4302];
					if (local281 != null && local281 != Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 && local281.anInt10803 >= 0) {
						local281.anInt10803 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!or;)Z")
	public static boolean method1512(@OriginalArg(0) Class260 arg0) {
		if (Static561.aBoolean714) {
			if (method1526(arg0).anInt8078 != 0) {
				return false;
			}
			if (arg0.anInt7003 == 0) {
				return false;
			}
		}
		return arg0.aBoolean497;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1513() {
		for (@Pc(1) int local1 = 0; local1 < Static158.anInt927; local1++) {
			@Pc(6) int[] local6 = Static242.anIntArrayArray47[local1];
			for (@Pc(8) int local8 = 0; local8 < Static515.anInt8292; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1515(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static393.anInt6147;
		@Pc(3) int[] local3 = Static430.anIntArray612;
		@Pc(11) int local11 = Static243.aBoolean689 ? local1 : local1 + Static561.anInt9114;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class28_Sub1_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub3) Static522.aClass83_34.method2368((long) Static131.anIntArray226[local13 - local1])).aClass28_Sub1_Sub1_Sub1_Sub2_1;
			}
			if (local23.aByte174 == arg0) {
				local23.anInt10770 = 0;
				if (local23.anInt10803 < 0) {
					local23.aBoolean819 = false;
				} else {
					@Pc(54) int local54 = local23.method9314();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10729 & 0x1FF) != 0 || (local23.anInt10731 & 0x1FF) != 0) {
							local23.aBoolean819 = false;
							continue;
						}
					} else if ((local23.anInt10729 & 0x1FF) != 256 || (local23.anInt10731 & 0x1FF) != 256) {
						local23.aBoolean819 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10729 >> 9;
						local101 = local23.anInt10731 >> 9;
						if (local23.anInt10803 != Static242.anIntArrayArray47[local96][local101]) {
							local23.aBoolean819 = true;
							continue;
						}
						if (Static224.anIntArrayArray24[local96][local101] > 1) {
							local126 = Static224.anIntArrayArray24[local96][local101]--;
							local23.aBoolean819 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10729 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10731 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10729 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10731 + local96 >> 9;
						if (!Static487.method7040(local169, local101, local155, local23.anInt10803, local162)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt10803 == Static242.anIntArrayArray47[local180][local183]) {
										local126 = Static224.anIntArrayArray24[local180][local183]--;
									}
								}
							}
							local23.aBoolean819 = true;
							continue;
						}
					}
					local23.aBoolean819 = false;
					local23.anInt10722 = Static168.method3058(local23.aByte174, local23.anInt10729, local23.anInt10731);
					Static436.method6231(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)Z")
	public static boolean method1516() {
		@Pc(15) boolean local15 = true;
		if (Static21.aClass97_1 == null) {
			if (Static369.aClass15_97.method526(Static512.anInt8243)) {
				Static21.aClass97_1 = Static682.method2751(Static369.aClass15_97, Static512.anInt8243);
			} else {
				local15 = false;
			}
		}
		if (Static677.aClass97_3 == null) {
			if (Static369.aClass15_97.method526(Static579.anInt9323)) {
				Static677.aClass97_3 = Static682.method2751(Static369.aClass15_97, Static579.anInt9323);
			} else {
				local15 = false;
			}
		}
		if (Static411.aClass97_2 == null) {
			if (Static369.aClass15_97.method526(Static254.anInt4541)) {
				Static411.aClass97_2 = Static682.method2751(Static369.aClass15_97, Static254.anInt4541);
			} else {
				local15 = false;
			}
		}
		if (Static294.aClass88_16 == null) {
			if (Static218.aClass15_62.method526(Static353.anInt5743)) {
				Static294.aClass88_16 = Static629.method8788(Static218.aClass15_62, Static353.anInt5743);
			} else {
				local15 = false;
			}
		}
		if (Static103.aClass97Array1 == null) {
			if (Static369.aClass15_97.method526(Static353.anInt5743)) {
				Static103.aClass97Array1 = Static682.method2747(Static369.aClass15_97, Static353.anInt5743);
			} else {
				local15 = false;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!or;IIIIIIIIIII)V")
	public static void method1519(@OriginalArg(0) Class260[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label812: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class260 local6 = arg0[local1];
			if (local6 != null && local6.anInt6993 == arg1) {
				@Pc(17) int local17 = local6.anInt6942 + arg6;
				@Pc(22) int local22 = local6.anInt6950 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt7003 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt6963;
					local45 = local22 + local6.anInt6971;
					if (local6.anInt7003 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt7003 == 0 || local6.aBoolean501 || method1526(local6).anInt8078 != 0 || local6 == Static416.aClass260_13 || local6.anInt6958 == Static616.anInt9887 || local6.anInt6958 == Static19.anInt469) {
					if (!method1512(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static82.aBoolean134) {
							local40 = Static31.method748();
							local45 = Static147.method2738();
						}
						if (local6 == Static678.aClass260_21 && Static642.method8921(Static678.aClass260_21) != null) {
							Static423.aBoolean482 = true;
							Static567.anInt5923 = local17;
							Static446.anInt5842 = local22;
						}
						if (local6.aBoolean505 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean508 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class3_Sub17 local168 = (Class3_Sub17) Static510.aClass338_126.method8177(); local168 != null; local168 = (Class3_Sub17) Static510.aClass338_126.method8168()) {
									if (local168.aBoolean138) {
										local168.method9380();
										local168.aClass260_6.aBoolean502 = false;
									}
								}
								if (Static621.anInt9954 == 0) {
									Static678.aClass260_21 = null;
									Static416.aClass260_13 = null;
								}
								Static231.anInt4294 = 0;
								Static265.aBoolean350 = false;
								Static158.aBoolean67 = false;
								if (!Static43.aBoolean74) {
									Static449.method6568();
								}
							}
							@Pc(232) boolean local232;
							if (Static22.aClass16_2.method5885() + local40 >= local28 && Static22.aClass16_2.method5887() + local45 >= local30 && Static22.aClass16_2.method5885() + local40 < local32 && Static22.aClass16_2.method5887() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static624.aBoolean698 && local232) {
								if (local6.anInt6998 >= 0) {
									Static21.anInt510 = local6.anInt6998;
								} else if (local6.aBoolean508) {
									Static21.anInt510 = -1;
								}
							}
							if (!Static43.aBoolean74 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static510.method4481(arg10 - local17, local6, arg11 - local22);
							}
							@Pc(276) boolean local276 = false;
							if (Static22.aClass16_2.method5883() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class3_Sub43 local291 = (Class3_Sub43) Static655.aClass338_233.method8177();
							if (local291 != null && local291.method7778() == 0 && local291.method7774() + local40 >= local28 && local291.method7777() + local45 >= local30 && local291.method7774() + local40 < local32 && local291.method7777() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray77 != null && !Static316.method4828()) {
								for (local335 = 0; local335 < local6.aByteArray77.length; local335++) {
									if (Static440.aClass19_1.method2352(local6.aByteArray77[local335])) {
										if (local6.anIntArray626 == null || Static588.anInt9467 >= local6.anIntArray626[local335]) {
											@Pc(367) byte local367 = local6.aByteArray78[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static440.aClass19_1.method2352(86) && !Static440.aClass19_1.method2352(82) && !Static440.aClass19_1.method2352(81)) && ((local367 & 0x2) == 0 || Static440.aClass19_1.method2352(86)) && ((local367 & 0x1) == 0 || Static440.aClass19_1.method2352(82)) && ((local367 & 0x4) == 0 || Static440.aClass19_1.method2352(81))) {
												if (local335 < 10) {
													Static498.method8887(-1, local6.anInt6930, "", local335 + 1);
												} else if (local335 == 10) {
													Static632.method8816();
													@Pc(438) Class3_Sub48 local438 = method1526(local6);
													Static231.method3910(local438.anInt8085, local6, local438.method7067());
													Static90.aString119 = Static301.method4631(local6);
													if (Static90.aString119 == null) {
														Static90.aString119 = "Null";
													}
													Static103.aString17 = local6.aString75 + "<col=ffffff>";
												}
												local469 = local6.anIntArray628[local335];
												if (local6.anIntArray626 == null) {
													local6.anIntArray626 = new int[local6.aByteArray77.length];
												}
												if (local469 == 0) {
													local6.anIntArray626[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray626[local335] = Static588.anInt9467 + local469;
												}
											}
										}
									} else if (local6.anIntArray626 != null) {
										local6.anIntArray626[local335] = 0;
									}
								}
							}
							if (local286) {
								Static62.method1303(local45 + local291.method7777() - local22, local40 + local291.method7774() - local17, local6);
							}
							if (Static678.aClass260_21 != null && Static678.aClass260_21 != local6 && local232 && method1526(local6).method7064()) {
								Static240.aClass260_11 = local6;
							}
							if (local6 == Static416.aClass260_13) {
								Static196.aBoolean288 = true;
								Static468.anInt7689 = local17;
								Static35.anInt811 = local22;
							}
							if (local6.aBoolean501 || local6.anInt6958 != 0) {
								@Pc(558) Class3_Sub17 local558;
								if (local232 && Static71.anInt1338 != 0 && local6.anObjectArray32 != null) {
									local558 = new Class3_Sub17();
									local558.aBoolean138 = true;
									local558.aClass260_6 = local6;
									local558.anInt1766 = Static71.anInt1338;
									local558.anObjectArray2 = local6.anObjectArray32;
									Static510.aClass338_126.method8171(local558);
								}
								if (Static678.aClass260_21 != null || Static43.aBoolean74 || local6.anInt6958 != Static51.anInt1087 && Static231.anInt4294 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt6958 != 0) {
									if (local6.anInt6958 == Static502.anInt4118 || local6.anInt6958 == Static521.anInt7906) {
										Static242.aClass260_16 = local6;
										if (Static536.aClass206_5 != null) {
											Static536.aClass206_5.method5244(Static674.aClass13_22, local6.anInt6971);
										}
										if (local6.anInt6958 == Static502.anInt4118) {
											if (Static43.aBoolean74 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static24.method660(arg8, arg9, Static674.aClass13_22);
											@Pc(641) Class28_Sub10 local641 = (Class28_Sub10) Static124.aClass371_1.method8911();
											while (true) {
												if (local641 == null) {
													continue label812;
												}
												if (arg10 >= local641.anInt10104 && arg10 < local641.anInt10102 && arg11 >= local641.anInt10106 && arg11 < local641.anInt10103) {
													Static449.method6568();
													Static434.method6203(local641.aClass28_Sub1_Sub1_Sub1_1);
												}
												local641 = (Class28_Sub10) Static124.aClass371_1.method8917();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt6958 == Static616.anInt9887) {
										if (local6.method6245(Static674.aClass13_22) == null || Static184.anInt3729 != 0 && Static184.anInt3729 != 3 || Static43.aBoolean74 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray624[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray620[local708]) {
											continue;
										}
										local335 -= local6.anInt6963 / 2;
										local708 -= local6.anInt6971 / 2;
										if (Static428.anInt6834 == 4) {
											local747 = (int) Static618.aFloat207 & 0x3FFF;
										} else {
											local747 = (int) Static618.aFloat207 + Static490.anInt8101 & 0x3FFF;
										}
										@Pc(759) int local759 = Class3_Sub20.anIntArray206[local747];
										@Pc(763) int local763 = Class3_Sub20.anIntArray204[local747];
										if (Static428.anInt6834 != 4) {
											local759 = local759 * (Static663.anInt10571 + 256) >> 8;
											local763 = local763 * (Static663.anInt10571 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static428.anInt6834 == 4) {
											local813 = (Static294.anInt6316 >> 9) + (local792 >> 2);
											local821 = (Static96.anInt1798 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9314() - 1) * 256;
											local813 = (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 - local830 >> 9) + (local792 >> 2);
											local821 = (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 - local830 >> 9) - (local802 >> 2);
										}
										if (Static624.aBoolean698 && (Static173.anInt3449 & 0x40) != 0) {
											@Pc(863) Class260 local863 = Static245.method4101(Static531.anInt8767, Static287.anInt4913);
											if (local863 == null) {
												Static632.method8816();
											} else {
												Static303.method4660(false, Static90.aString119, true, local6.anInt6964, " ->", true, local813, 2, (long) (local6.anInt6985 << 0 | local6.anInt6930), local821, Static463.anInt7620, 1L);
											}
											continue;
										}
										if (Static55.aClass118_2 == Static68.aClass118_3) {
											Static303.method4660(false, Static601.aClass346_29.method8440(Static609.anInt9834), true, -1, "", true, local813, 57, 0L, local821, -1, 1L);
										}
										Static303.method4660(false, Static553.aString107, true, -1, "", true, local813, 51, 0L, local821, Static13.anInt138, 1L);
										continue;
									}
									if (local6.anInt6958 == Static51.anInt1087) {
										Static601.aClass260_20 = local6;
										if (local232) {
											Static265.aBoolean350 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method7774() - local17 - local6.anInt6963 / 2) * 2.0D / (double) Static317.aFloat114);
											local708 = (int) -((double) (local45 + local291.method7777() - local22 - local6.anInt6971 / 2) * 2.0D / (double) Static317.aFloat114);
											local469 = Static361.anInt5827 + local335 + Static317.anInt5409;
											local747 = Static90.anInt10121 + local708 + Static317.anInt5403;
											@Pc(994) Class3_Sub11_Sub21 local994 = Static182.method3241();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method9359(local747, local999, local469);
											if (local999 != null) {
												if (Static440.aClass19_1.method2352(82) && Static24.anInt545 > 0) {
													Static273.method4434(local999[0], local999[2], local999[1]);
													continue;
												}
												Static158.aBoolean67 = true;
												Static39.anInt910 = local999[0];
												Static428.anInt6832 = local999[1];
												Static492.anInt8114 = local999[2];
											}
											Static231.anInt4294 = 1;
											Static669.aBoolean815 = false;
											Static583.anInt9381 = Static22.aClass16_2.method5885();
											Static196.anInt3897 = Static22.aClass16_2.method5887();
											continue;
										}
										if (local276 && Static231.anInt4294 > 0) {
											if (Static231.anInt4294 == 1 && (Static583.anInt9381 != Static22.aClass16_2.method5885() || Static196.anInt3897 != Static22.aClass16_2.method5887())) {
												Static66.anInt1305 = Static361.anInt5827;
												Static413.anInt6607 = Static90.anInt10121;
												Static231.anInt4294 = 2;
											}
											if (Static231.anInt4294 == 2) {
												Static669.aBoolean815 = true;
												Static645.method8968(Static66.anInt1305 + (int) ((double) (Static583.anInt9381 - Static22.aClass16_2.method5885()) * 2.0D / (double) Static317.aFloat113));
												Static647.method8987(Static413.anInt6607 - (int) ((double) (Static196.anInt3897 - Static22.aClass16_2.method5887()) * 2.0D / (double) Static317.aFloat113));
											}
											continue;
										}
										if (Static231.anInt4294 > 0 && !Static669.aBoolean815) {
											if ((Static229.anInt4277 == 1 || Static645.method8970()) && Static450.anInt7444 > 2) {
												Static89.method1665(Static196.anInt3897, Static583.anInt9381);
											} else if (Static257.method4210()) {
												Static89.method1665(Static196.anInt3897, Static583.anInt9381);
											}
										}
										Static231.anInt4294 = 0;
										continue;
									}
									if (local6.anInt6958 == Static204.anInt3995) {
										if (local276) {
											Static313.method4794(local45 + Static22.aClass16_2.method5887() - local22, local6.anInt6971, local6.anInt6963, local40 + Static22.aClass16_2.method5885() - local17);
										}
										continue;
									}
									if (local6.anInt6958 == Static19.anInt469) {
										Static208.method3665(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean511 && local286) {
									local6.aBoolean511 = true;
									if (local6.anObjectArray24 != null) {
										local558 = new Class3_Sub17();
										local558.aBoolean138 = true;
										local558.aClass260_6 = local6;
										local558.anInt1764 = local40 + local291.method7774() - local17;
										local558.anInt1766 = local45 + local291.method7777() - local22;
										local558.anObjectArray2 = local6.anObjectArray24;
										Static510.aClass338_126.method8171(local558);
									}
								}
								if (local6.aBoolean511 && local276 && local6.anObjectArray28 != null) {
									local558 = new Class3_Sub17();
									local558.aBoolean138 = true;
									local558.aClass260_6 = local6;
									local558.anInt1764 = local40 + Static22.aClass16_2.method5885() - local17;
									local558.anInt1766 = local45 + Static22.aClass16_2.method5887() - local22;
									local558.anObjectArray2 = local6.anObjectArray28;
									Static510.aClass338_126.method8171(local558);
								}
								if (local6.aBoolean511 && !local276) {
									local6.aBoolean511 = false;
									if (local6.anObjectArray18 != null) {
										local558 = new Class3_Sub17();
										local558.aBoolean138 = true;
										local558.aClass260_6 = local6;
										local558.anInt1764 = local40 + Static22.aClass16_2.method5885() - local17;
										local558.anInt1766 = local45 + Static22.aClass16_2.method5887() - local22;
										local558.anObjectArray2 = local6.anObjectArray18;
										Static232.aClass338_110.method8171(local558);
									}
								}
								if (local276 && local6.anObjectArray15 != null) {
									local558 = new Class3_Sub17();
									local558.aBoolean138 = true;
									local558.aClass260_6 = local6;
									local558.anInt1764 = local40 + Static22.aClass16_2.method5885() - local17;
									local558.anInt1766 = local45 + Static22.aClass16_2.method5887() - local22;
									local558.anObjectArray2 = local6.anObjectArray15;
									Static510.aClass338_126.method8171(local558);
								}
								if (!local6.aBoolean502 && local232) {
									local6.aBoolean502 = true;
									if (local6.anObjectArray7 != null) {
										local558 = new Class3_Sub17();
										local558.aBoolean138 = true;
										local558.aClass260_6 = local6;
										local558.anInt1764 = local40 + Static22.aClass16_2.method5885() - local17;
										local558.anInt1766 = local45 + Static22.aClass16_2.method5887() - local22;
										local558.anObjectArray2 = local6.anObjectArray7;
										Static510.aClass338_126.method8171(local558);
									}
								}
								if (local6.aBoolean502 && local232 && local6.anObjectArray13 != null) {
									local558 = new Class3_Sub17();
									local558.aBoolean138 = true;
									local558.aClass260_6 = local6;
									local558.anInt1764 = local40 + Static22.aClass16_2.method5885() - local17;
									local558.anInt1766 = local45 + Static22.aClass16_2.method5887() - local22;
									local558.anObjectArray2 = local6.anObjectArray13;
									Static510.aClass338_126.method8171(local558);
								}
								if (local6.aBoolean502 && !local232) {
									local6.aBoolean502 = false;
									if (local6.anObjectArray12 != null) {
										local558 = new Class3_Sub17();
										local558.aBoolean138 = true;
										local558.aClass260_6 = local6;
										local558.anInt1764 = local40 + Static22.aClass16_2.method5885() - local17;
										local558.anInt1766 = local45 + Static22.aClass16_2.method5887() - local22;
										local558.anObjectArray2 = local6.anObjectArray12;
										Static232.aClass338_110.method8171(local558);
									}
								}
								if (local6.anObjectArray27 != null) {
									local558 = new Class3_Sub17();
									local558.aClass260_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray27;
									Static65.aClass338_33.method8171(local558);
								}
								@Pc(1570) Class3_Sub17 local1570;
								if (local6.anObjectArray11 != null && Static471.anInt7772 > local6.anInt7014) {
									if (local6.anIntArray622 == null || Static471.anInt7772 - local6.anInt7014 > 32) {
										local558 = new Class3_Sub17();
										local558.aClass260_6 = local6;
										local558.anObjectArray2 = local6.anObjectArray11;
										Static510.aClass338_126.method8171(local558);
									} else {
										label699: for (local335 = local6.anInt7014; local335 < Static471.anInt7772; local335++) {
											local708 = Static548.anIntArray761[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray622.length; local469++) {
												if (local6.anIntArray622[local469] == local708) {
													local1570 = new Class3_Sub17();
													local1570.aClass260_6 = local6;
													local1570.anObjectArray2 = local6.anObjectArray11;
													Static510.aClass338_126.method8171(local1570);
													break label699;
												}
											}
										}
									}
									local6.anInt7014 = Static471.anInt7772;
								}
								if (local6.anObjectArray30 != null && Static169.anInt3337 > local6.anInt6968) {
									if (local6.anIntArray623 == null || Static169.anInt3337 - local6.anInt6968 > 32) {
										local558 = new Class3_Sub17();
										local558.aClass260_6 = local6;
										local558.anObjectArray2 = local6.anObjectArray30;
										Static510.aClass338_126.method8171(local558);
									} else {
										label675: for (local335 = local6.anInt6968; local335 < Static169.anInt3337; local335++) {
											local708 = Static304.anIntArray454[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray623.length; local469++) {
												if (local6.anIntArray623[local469] == local708) {
													local1570 = new Class3_Sub17();
													local1570.aClass260_6 = local6;
													local1570.anObjectArray2 = local6.anObjectArray30;
													Static510.aClass338_126.method8171(local1570);
													break label675;
												}
											}
										}
									}
									local6.anInt6968 = Static169.anInt3337;
								}
								if (local6.anObjectArray19 != null && Static228.anInt4271 > local6.anInt6934) {
									if (local6.anIntArray621 == null || Static228.anInt4271 - local6.anInt6934 > 32) {
										local558 = new Class3_Sub17();
										local558.aClass260_6 = local6;
										local558.anObjectArray2 = local6.anObjectArray19;
										Static510.aClass338_126.method8171(local558);
									} else {
										label651: for (local335 = local6.anInt6934; local335 < Static228.anInt4271; local335++) {
											local708 = Static196.anIntArray347[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray621.length; local469++) {
												if (local6.anIntArray621[local469] == local708) {
													local1570 = new Class3_Sub17();
													local1570.aClass260_6 = local6;
													local1570.anObjectArray2 = local6.anObjectArray19;
													Static510.aClass338_126.method8171(local1570);
													break label651;
												}
											}
										}
									}
									local6.anInt6934 = Static228.anInt4271;
								}
								if (local6.anObjectArray26 != null && Static63.anInt1267 > local6.anInt6983) {
									if (local6.anIntArray619 == null || Static63.anInt1267 - local6.anInt6983 > 32) {
										local558 = new Class3_Sub17();
										local558.aClass260_6 = local6;
										local558.anObjectArray2 = local6.anObjectArray26;
										Static510.aClass338_126.method8171(local558);
									} else {
										label627: for (local335 = local6.anInt6983; local335 < Static63.anInt1267; local335++) {
											local708 = Static37.anIntArray72[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray619.length; local469++) {
												if (local6.anIntArray619[local469] == local708) {
													local1570 = new Class3_Sub17();
													local1570.aClass260_6 = local6;
													local1570.anObjectArray2 = local6.anObjectArray26;
													Static510.aClass338_126.method8171(local1570);
													break label627;
												}
											}
										}
									}
									local6.anInt6983 = Static63.anInt1267;
								}
								if (local6.anObjectArray21 != null && Static276.anInt4813 > local6.anInt6940) {
									if (local6.anIntArray625 == null || Static276.anInt4813 - local6.anInt6940 > 32) {
										local558 = new Class3_Sub17();
										local558.aClass260_6 = local6;
										local558.anObjectArray2 = local6.anObjectArray21;
										Static510.aClass338_126.method8171(local558);
									} else {
										label603: for (local335 = local6.anInt6940; local335 < Static276.anInt4813; local335++) {
											local708 = Static77.anIntArray126[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray625.length; local469++) {
												if (local6.anIntArray625[local469] == local708) {
													local1570 = new Class3_Sub17();
													local1570.aClass260_6 = local6;
													local1570.anObjectArray2 = local6.anObjectArray21;
													Static510.aClass338_126.method8171(local1570);
													break label603;
												}
											}
										}
									}
									local6.anInt6940 = Static276.anInt4813;
								}
								if (Static627.anInt10019 > local6.anInt7019 && local6.anObjectArray16 != null) {
									local558 = new Class3_Sub17();
									local558.aClass260_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray16;
									Static510.aClass338_126.method8171(local558);
								}
								if (Static68.anInt1315 > local6.anInt7019 && local6.anObjectArray34 != null) {
									local558 = new Class3_Sub17();
									local558.aClass260_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray34;
									Static510.aClass338_126.method8171(local558);
								}
								if (Static413.anInt6608 > local6.anInt7019 && local6.anObjectArray23 != null) {
									local558 = new Class3_Sub17();
									local558.aClass260_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray23;
									Static510.aClass338_126.method8171(local558);
								}
								if (Static216.anInt4122 > local6.anInt7019 && local6.anObjectArray20 != null) {
									local558 = new Class3_Sub17();
									local558.aClass260_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray20;
									Static510.aClass338_126.method8171(local558);
								}
								if (Static621.anInt9951 > local6.anInt7019 && local6.anObjectArray17 != null) {
									local558 = new Class3_Sub17();
									local558.aClass260_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray17;
									Static510.aClass338_126.method8171(local558);
								}
								if (Static164.anInt3235 > local6.anInt7019 && local6.anObjectArray10 != null) {
									local558 = new Class3_Sub17();
									local558.aClass260_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray10;
									Static510.aClass338_126.method8171(local558);
								}
								if (Static126.anInt2583 > local6.anInt7019 && local6.anObjectArray31 != null) {
									local558 = new Class3_Sub17();
									local558.aClass260_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray31;
									Static510.aClass338_126.method8171(local558);
								}
								local6.anInt7019 = Static629.anInt10041;
								if (local6.anObjectArray35 != null) {
									for (local335 = 0; local335 < Static434.anInt6889; local335++) {
										@Pc(2082) Class3_Sub17 local2082 = new Class3_Sub17();
										local2082.aClass260_6 = local6;
										local2082.anInt1772 = Static198.anInterface22Array34[local335].method7005();
										local2082.anInt1770 = Static198.anInterface22Array34[local335].method7006();
										local2082.anObjectArray2 = local6.anObjectArray35;
										Static510.aClass338_126.method8171(local2082);
									}
								}
								if (Static464.aBoolean567 && local6.anObjectArray22 != null) {
									local558 = new Class3_Sub17();
									local558.aClass260_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray22;
									Static510.aClass338_126.method8171(local558);
								}
							}
							if (local6.anInt7003 == 5 && local6.anInt6990 != -1) {
								local6.method6261(Static559.aClass340_1, Static38.aClass75_1).method5244(Static674.aClass13_22, local6.anInt6971);
							}
							Static183.method3390(local6);
							if (local6.anInt7003 == 0) {
								method1519(arg0, local6.anInt6930, local28, local30, local32, local34, local17 - local6.anInt7013, local22 - local6.anInt6946, arg8, arg9, arg10, arg11);
								if (local6.aClass260Array2 != null) {
									method1519(local6.aClass260Array2, local6.anInt6930, local28, local30, local32, local34, local17 - local6.anInt7013, local22 - local6.anInt6946, arg8, arg9, arg10, arg11);
								}
								@Pc(2208) Class3_Sub46 local2208 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local6.anInt6930);
								if (local2208 != null) {
									if (Static55.aClass118_2 == Static438.aClass118_6 && local2208.anInt7850 == 0 && !Static43.aBoolean74 && local232 && !Static561.aBoolean714) {
										Static449.method6568();
									}
									Static568.method8031(local17, arg9, local30, local32, arg8, local28, arg10, local2208.anInt7855, local34, local22, arg11);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static183.method3390(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1520() {
		Static37.anInt840 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static561.anInt9114; local3++) {
			@Pc(14) Class28_Sub1_Sub1_Sub1_Sub2 local14 = ((Class3_Sub3) Static522.aClass83_34.method2368((long) Static131.anIntArray226[local3])).aClass28_Sub1_Sub1_Sub1_Sub2_1;
			if (local14.aBoolean819 && local14.method9318() != -1) {
				@Pc(32) int local32 = (local14.method9314() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10729 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10731 - local32 >> 9;
				@Pc(53) Class28_Sub1_Sub1_Sub1 local53 = Static547.method7835(local39, local46, local14.aByte174);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt10762;
					if (local53 instanceof Class28_Sub1_Sub1_Sub1_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt10770 == 0 && local53.method9318() != -1) {
						Static304.anIntArray453[Static37.anInt840] = local58;
						Static460.anIntArray647[Static37.anInt840] = local58;
						Static37.anInt840++;
						local53.anInt10770++;
					}
					Static304.anIntArray453[Static37.anInt840] = local58;
					Static460.anIntArray647[Static37.anInt840] = local14.anInt10762 + 2048;
					Static37.anInt840++;
					local53.anInt10770++;
				}
			}
		}
		Static199.method3581(Static304.anIntArray453, Static460.anIntArray647, Static37.anInt840 - 1, 0);
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1521(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static393.anInt6147;
		@Pc(3) int[] local3 = Static430.anIntArray612;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static561.anInt9114; local5++) {
			@Pc(15) Class28_Sub1_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class3_Sub3) Static522.aClass83_34.method2368((long) Static131.anIntArray226[local5 - local1])).aClass28_Sub1_Sub1_Sub1_Sub2_1;
			}
			if (local15.aByte174 == arg0 && local15.anInt10803 >= 0) {
				@Pc(39) int local39 = local15.method9314();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10729 & 0x1FF) != 0 || (local15.anInt10731 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10729 & 0x1FF) != 256 || (local15.anInt10731 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10729 >> 9;
					local80 = local15.anInt10731 >> 9;
					if (local15.anInt10803 > Static242.anIntArrayArray47[local75][local80]) {
						Static242.anIntArrayArray47[local75][local80] = local15.anInt10803;
						Static224.anIntArrayArray24[local75][local80] = 1;
					} else if (local15.anInt10803 == Static242.anIntArrayArray47[local75][local80]) {
						local116 = Static224.anIntArrayArray24[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10729 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10731 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10729 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10731 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt10803 > Static242.anIntArrayArray47[local158][local161]) {
								Static242.anIntArrayArray47[local158][local161] = local15.anInt10803;
								Static224.anIntArrayArray24[local158][local161] = 1;
							} else if (local15.anInt10803 == Static242.anIntArrayArray47[local158][local161]) {
								local116 = Static224.anIntArrayArray24[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1524() {
		@Pc(1) int local1 = Static393.anInt6147;
		@Pc(3) int[] local3 = Static430.anIntArray612;
		@Pc(11) int local11 = Static243.aBoolean689 ? local1 : local1 + Static561.anInt9114;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class28_Sub1_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub3) Static522.aClass83_34.method2368((long) Static131.anIntArray226[local13 - local1])).aClass28_Sub1_Sub1_Sub1_Sub2_1;
			}
			if (local23.anInt10803 >= 0) {
				@Pc(43) int local43 = local23.method9314();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10729 & 0x1FF) == 0 && (local23.anInt10731 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10729 & 0x1FF) == 256 && (local23.anInt10731 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10722 = Static168.method3058(local23.aByte174, local23.anInt10729, local23.anInt10731);
				Static436.method6231(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!or;)Lclient!or;")
	public static Class260 method1525(@OriginalArg(0) Class260 arg0) {
		@Pc(4) int local4 = method1526(arg0).method7066();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static383.method5492(arg0.anInt6993);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!or;)Lclient!qha;")
	public static Class3_Sub48 method1526(@OriginalArg(0) Class260 arg0) {
		@Pc(13) Class3_Sub48 local13 = (Class3_Sub48) Static300.aClass83_15.method2368(((long) arg0.anInt6930 << 32) + (long) arg0.anInt6985);
		return local13 == null ? arg0.aClass3_Sub48_1 : local13;
	}
}
