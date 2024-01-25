import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!gaa;)Z")
	public static boolean method1825(@OriginalArg(0) Class108 arg0) {
		if (Static401.aBoolean650) {
			if (method1836(arg0).anInt1134 != 0) {
				return false;
			}
			if (arg0.anInt4018 == 0) {
				return false;
			}
		}
		return arg0.aBoolean352;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1828() {
		@Pc(1) int local1 = Static385.anInt10557;
		@Pc(3) int[] local3 = Static493.anIntArray555;
		@Pc(11) int local11 = Static94.aBoolean204 ? local1 : local1 + Static377.anInt7132;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class2_Sub3_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local3[local13]];
			} else {
				local23 = ((Class3_Sub49) Static60.aClass307_6.method7424((long) Static176.anIntArray229[local13 - local1])).aClass2_Sub3_Sub1_Sub2_Sub1_2;
			}
			if (local23.anInt6342 >= 0) {
				@Pc(43) int local43 = local23.method5308();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10428 & 0x1FF) == 0 && (local23.anInt10424 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10428 & 0x1FF) == 256 && (local23.anInt10424 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10429 = Static202.method3958(local23.anInt10424, local23.aByte128, local23.anInt10428);
				Static286.method4985(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1829(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static385.anInt10557;
		@Pc(3) int[] local3 = Static493.anIntArray555;
		@Pc(11) int local11 = Static94.aBoolean204 ? local1 : local1 + Static377.anInt7132;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class2_Sub3_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local3[local13]];
			} else {
				local23 = ((Class3_Sub49) Static60.aClass307_6.method7424((long) Static176.anIntArray229[local13 - local1])).aClass2_Sub3_Sub1_Sub2_Sub1_2;
			}
			if (local23.aByte128 == arg0) {
				local23.anInt6269 = 0;
				if (local23.anInt6342 < 0) {
					local23.aBoolean533 = false;
				} else {
					@Pc(54) int local54 = local23.method5308();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10428 & 0x1FF) != 0 || (local23.anInt10424 & 0x1FF) != 0) {
							local23.aBoolean533 = false;
							continue;
						}
					} else if ((local23.anInt10428 & 0x1FF) != 256 || (local23.anInt10424 & 0x1FF) != 256) {
						local23.aBoolean533 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10428 >> 9;
						local101 = local23.anInt10424 >> 9;
						if (local23.anInt6342 != Static188.anIntArrayArray40[local96][local101]) {
							local23.aBoolean533 = true;
							continue;
						}
						if (Static396.anIntArrayArray74[local96][local101] > 1) {
							local126 = Static396.anIntArrayArray74[local96][local101]--;
							local23.aBoolean533 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10428 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10424 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10428 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10424 + local96 >> 9;
						if (!Static2.method31(local101, local23.anInt6342, local169, local162, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt6342 == Static188.anIntArrayArray40[local180][local183]) {
										local126 = Static396.anIntArrayArray74[local180][local183]--;
									}
								}
							}
							local23.aBoolean533 = true;
							continue;
						}
					}
					local23.aBoolean533 = false;
					local23.anInt10429 = Static202.method3958(local23.anInt10424, local23.aByte128, local23.anInt10428);
					Static286.method4985(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1830() {
		Static383.anInt7281 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static377.anInt7132; local3++) {
			@Pc(14) Class2_Sub3_Sub1_Sub2_Sub1 local14 = ((Class3_Sub49) Static60.aClass307_6.method7424((long) Static176.anIntArray229[local3])).aClass2_Sub3_Sub1_Sub2_Sub1_2;
			if (local14.aBoolean533 && local14.method5305() != -1) {
				@Pc(32) int local32 = (local14.method5308() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10428 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10424 - local32 >> 9;
				@Pc(53) Class2_Sub3_Sub1_Sub2 local53 = Static13.method198(local46, local14.aByte128, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt6289;
					if (local53 instanceof Class2_Sub3_Sub1_Sub2_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt6269 == 0 && local53.method5305() != -1) {
						Static351.anIntArray398[Static383.anInt7281] = local58;
						Static442.anIntArray500[Static383.anInt7281] = local58;
						Static383.anInt7281++;
						local53.anInt6269++;
					}
					Static351.anIntArray398[Static383.anInt7281] = local58;
					Static442.anIntArray500[Static383.anInt7281] = local14.anInt6289 + 2048;
					Static383.anInt7281++;
					local53.anInt6269++;
				}
			}
		}
		Static350.method5750(Static442.anIntArray500, Static383.anInt7281 - 1, Static351.anIntArray398, 0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1831() {
		@Pc(1) int local1 = Static385.anInt10557;
		@Pc(3) int[] local3 = Static493.anIntArray555;
		@Pc(8) int local8 = Static552.aClass3_Sub48_30.aClass23_Sub22_1.method6092();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class2_Sub3_Sub1_Sub2_Sub2 local32 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local3[local25]];
			if (!local32.method5328()) {
				local32.anInt6342 = -1;
			} else if (local32.aBoolean537) {
				local32.anInt6342 = -1;
			} else {
				local32.method8581();
				if (local32.aShort121 >= 0 && local32.aShort124 >= 0 && local32.aShort122 < Static394.anInt7540 && local32.aShort123 < Static462.anInt8391) {
					local32.aBoolean538 = local32.aBoolean531 ? local23 : false;
					if (local32 == Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2) {
						local32.anInt6342 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean533) {
							local85++;
						}
						if (local32.anInt6305 > Static251.anInt5580) {
							local85 += 2;
						}
						local85 += 5 - local32.method5308() << 2;
						if (local32.aBoolean540) {
							local85 += 512;
						} else {
							if (Static169.anInt4081 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt6342 = local85 + 1;
					}
				} else {
					local32.anInt6342 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static377.anInt7132; local126++) {
			@Pc(137) Class2_Sub3_Sub1_Sub2_Sub1 local137 = ((Class3_Sub49) Static60.aClass307_6.method7424((long) Static176.anIntArray229[local126])).aClass2_Sub3_Sub1_Sub2_Sub1_2;
			if (local137.method2686() && local137.aClass22_1.method431(Static514.aClass166_1)) {
				local137.method8581();
				if (local137.aShort121 >= 0 && local137.aShort124 >= 0 && local137.aShort122 < Static394.anInt7540 && local137.aShort123 < Static462.anInt8391) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean533) {
						local174++;
					}
					if (local137.anInt6305 > Static251.anInt5580) {
						local174 += 2;
					}
					local174 += 5 - local137.method5308() << 2;
					if (Static169.anInt4081 == 0) {
						if (local137.aClass22_1.aBoolean37) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static169.anInt4081 == 1) {
						if (local137.aClass22_1.aBoolean37) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass22_1.aBoolean35) {
						local174 += 1024;
					} else if (!local137.aClass22_1.aBoolean34) {
						local174 += 256;
					}
					local137.anInt6342 = local174 + 1;
				} else {
					local137.anInt6342 = -1;
				}
			} else {
				local137.anInt6342 = -1;
			}
		}
		for (local85 = 0; local85 < Static253.aClass369Array1.length; local85++) {
			@Pc(240) Class369 local240 = Static253.aClass369Array1[local85];
			if (local240 != null) {
				if (local240.anInt10333 == 1) {
					@Pc(254) Class3_Sub49 local254 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local240.anInt10340);
					if (local254 != null) {
						@Pc(259) Class2_Sub3_Sub1_Sub2_Sub1 local259 = local254.aClass2_Sub3_Sub1_Sub2_Sub1_2;
						if (local259.anInt6342 >= 0) {
							local259.anInt6342 += 2048;
						}
					}
				} else if (local240.anInt10333 == 10) {
					@Pc(278) Class2_Sub3_Sub1_Sub2_Sub2 local278 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local240.anInt10340];
					if (local278 != null && local278 != Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 && local278.anInt6342 >= 0) {
						local278.anInt6342 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!gaa;IIIIIIIIIII)V")
	public static void method1833(@OriginalArg(0) Class108[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class108 local6 = arg0[local1];
			if (local6 != null && local6.anInt4046 == arg1) {
				@Pc(17) int local17 = local6.anInt4070 + arg6;
				@Pc(22) int local22 = local6.anInt4053 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt4018 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt4067;
					local45 = local22 + local6.anInt4037;
					if (local6.anInt4018 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt4018 == 0 || local6.aBoolean349 || method1836(local6).anInt1134 != 0 || local6 == Static326.aClass108_8 || local6.anInt4031 == Static113.anInt10084 || local6.anInt4031 == Static34.anInt627) {
					if (!method1825(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static349.aBoolean590) {
							local40 = Static477.method7033();
							local45 = Static10.method114();
						}
						if (local6 == Static233.aClass108_7 && Static536.method7620(Static233.aClass108_7) != null) {
							Static353.aBoolean597 = true;
							Static612.anInt10135 = local17;
							Static134.anInt3481 = local22;
						}
						if (local6.aBoolean339 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean346 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class3_Sub51 local168 = (Class3_Sub51) Static306.aClass276_42.method6907(); local168 != null; local168 = (Class3_Sub51) Static306.aClass276_42.method6912()) {
									if (local168.aBoolean865) {
										local168.method8671();
										local168.aClass108_13.aBoolean351 = false;
									}
								}
								if (Static196.anInt4619 == 0) {
									Static233.aClass108_7 = null;
									Static326.aClass108_8 = null;
								}
								Static604.anInt10035 = 0;
								Static126.aBoolean247 = false;
								Static369.aBoolean609 = false;
								if (!Static433.aBoolean672) {
									Static137.method3124();
								}
							}
							@Pc(232) boolean local232;
							if (Static501.aClass59_5.method4107() + local40 >= local28 && Static501.aClass59_5.method4106() + local45 >= local30 && Static501.aClass59_5.method4107() + local40 < local32 && Static501.aClass59_5.method4106() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static82.aBoolean192 && local232) {
								if (local6.anInt4098 >= 0) {
									Static548.anInt9367 = local6.anInt4098;
								} else if (local6.aBoolean346) {
									Static548.anInt9367 = -1;
								}
							}
							if (!Static433.aBoolean672 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static233.method4485(arg10 - local17, arg11 - local22, local6);
							}
							@Pc(276) boolean local276 = false;
							if (Static501.aClass59_5.method4110() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class3_Sub30 local291 = (Class3_Sub30) Static264.aClass276_37.method6907();
							if (local291 != null && local291.method6362() == 0 && local291.method6363() + local40 >= local28 && local291.method6367() + local45 >= local30 && local291.method6363() + local40 < local32 && local291.method6367() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray36 != null && !Static405.method6401()) {
								for (local335 = 0; local335 < local6.aByteArray36.length; local335++) {
									if (Static326.aClass238_1.method6948(local6.aByteArray36[local335])) {
										if (local6.anIntArray221 == null || Static251.anInt5580 >= local6.anIntArray221[local335]) {
											@Pc(367) byte local367 = local6.aByteArray37[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static326.aClass238_1.method6948(86) && !Static326.aClass238_1.method6948(82) && !Static326.aClass238_1.method6948(81)) && ((local367 & 0x2) == 0 || Static326.aClass238_1.method6948(86)) && ((local367 & 0x1) == 0 || Static326.aClass238_1.method6948(82)) && ((local367 & 0x4) == 0 || Static326.aClass238_1.method6948(81))) {
												if (local335 < 10) {
													Static349.method5731(local6.anInt4043, local335 + 1, "", -1);
												} else if (local335 == 10) {
													Static32.method596();
													@Pc(438) Class3_Sub11 local438 = method1836(local6);
													Static386.method6952(local438.anInt1135, local6, local438.method1191());
													Static330.aString71 = Static351.method5755(local6);
													if (Static330.aString71 == null) {
														Static330.aString71 = "Null";
													}
													Static275.aString60 = local6.aString37 + "<col=ffffff>";
												}
												local469 = local6.anIntArray219[local335];
												if (local6.anIntArray221 == null) {
													local6.anIntArray221 = new int[local6.aByteArray36.length];
												}
												if (local469 == 0) {
													local6.anIntArray221[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray221[local335] = Static251.anInt5580 + local469;
												}
											}
										}
									} else if (local6.anIntArray221 != null) {
										local6.anIntArray221[local335] = 0;
									}
								}
							}
							if (local286) {
								Static232.method4481(local40 + local291.method6363() - local17, local45 + local291.method6367() - local22, local6);
							}
							if (Static233.aClass108_7 != null && Static233.aClass108_7 != local6 && local232 && method1836(local6).method1190()) {
								Static46.aClass108_1 = local6;
							}
							if (local6 == Static326.aClass108_8) {
								Static638.aBoolean885 = true;
								Static413.anInt7711 = local17;
								Static408.anInt7678 = local22;
							}
							if (local6.aBoolean349 || local6.anInt4031 != 0) {
								@Pc(558) Class3_Sub51 local558;
								if (local232 && Static305.anInt6116 != 0 && local6.anObjectArray10 != null) {
									local558 = new Class3_Sub51();
									local558.aBoolean865 = true;
									local558.aClass108_13 = local6;
									local558.anInt10307 = Static305.anInt6116;
									local558.anObjectArray33 = local6.anObjectArray10;
									Static306.aClass276_42.method6906(local558);
								}
								if (Static233.aClass108_7 != null || Static433.aBoolean672 || local6.anInt4031 != Static251.anInt5587 && Static604.anInt10035 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt4031 != 0) {
									if (local6.anInt4031 == Static527.anInt9098 || local6.anInt4031 == Static463.anInt8397) {
										Static397.aClass108_9 = local6;
										if (Static278.aClass147_5 != null) {
											Static278.aClass147_5.method4615(Static47.aClass33_3, local6.anInt4037);
										}
										if (local6.anInt4031 == Static527.anInt9098) {
											if (Static433.aBoolean672 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static197.method3931(arg9, arg8, Static47.aClass33_3);
											@Pc(641) Class2_Sub7 local641 = (Class2_Sub7) Static479.aClass375_8.method8638();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt6017 && arg10 < local641.anInt6019 && arg11 >= local641.anInt6018 && arg11 < local641.anInt6015) {
													Static137.method3124();
													Static475.method7031(local641.aClass2_Sub3_Sub1_Sub2_1);
												}
												local641 = (Class2_Sub7) Static479.aClass375_8.method8635();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt4031 == Static113.anInt10084) {
										if (local6.method3526(Static47.aClass33_3) == null || Static381.anInt7250 != 0 && Static381.anInt7250 != 3 || Static433.aBoolean672 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray217[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray224[local708]) {
											continue;
										}
										local335 -= local6.anInt4067 / 2;
										local708 -= local6.anInt4037 / 2;
										if (Static516.anInt9019 == 4) {
											local747 = (int) Static502.aFloat230 & 0x3FFF;
										} else {
											local747 = (int) Static502.aFloat230 + Static30.anInt575 & 0x3FFF;
										}
										@Pc(759) int local759 = Class3_Sub1_Sub2.anIntArray84[local747];
										@Pc(763) int local763 = Class3_Sub1_Sub2.anIntArray85[local747];
										if (Static516.anInt9019 != 4) {
											local759 = local759 * (Static127.anInt3186 + 256) >> 8;
											local763 = local763 * (Static127.anInt3186 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static516.anInt9019 == 4) {
											local813 = (Static89.anInt2312 >> 9) + (local792 >> 2);
											local821 = (Static149.anInt3681 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5308() - 1) * 256;
											local813 = (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428 - local830 >> 9) + (local792 >> 2);
											local821 = (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424 - local830 >> 9) - (local802 >> 2);
										}
										if (Static82.aBoolean192 && (Static607.anInt10027 & 0x40) != 0) {
											@Pc(863) Class108 local863 = Static526.method6818(Static33.anInt612, Static461.anInt8388);
											if (local863 == null) {
												Static32.method596();
											} else {
												Static512.method7408(10, " ->", local6.anInt4059, true, (long) (local6.anInt4083 << 0 | local6.anInt4043), Static330.aString71, 1L, false, local813, local821, true, Static287.anInt5894);
											}
											continue;
										}
										if (Static648.aClass62_16 == Static518.aClass62_15) {
											Static512.method7408(49, "", -1, true, 0L, Static287.aClass176_27.method4986(Static380.anInt7247), 1L, false, local813, local821, true, -1);
										}
										Static512.method7408(48, "", -1, true, 0L, Static536.aString103, 1L, false, local813, local821, true, Static639.anInt10498);
										continue;
									}
									if (local6.anInt4031 == Static251.anInt5587) {
										Static505.aClass108_10 = local6;
										if (local232) {
											Static126.aBoolean247 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method6363() - local17 - local6.anInt4067 / 2) * 2.0D / (double) Static361.aFloat88);
											local708 = (int) -((double) (local45 + local291.method6367() - local22 - local6.anInt4037 / 2) * 2.0D / (double) Static361.aFloat88);
											local469 = Static353.anInt6903 + local335 + Static361.anInt2229;
											local747 = Static386.anInt8408 + local708 + Static361.anInt2230;
											@Pc(994) Class3_Sub1_Sub16 local994 = Static472.method5188();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method5923(local469, local747, local999);
											if (local999 != null) {
												if (Static326.aClass238_1.method6948(82) && Static106.anInt2660 > 0) {
													Static481.method2825(local999[1], local999[0], local999[2]);
													continue;
												}
												Static369.aBoolean609 = true;
												Static612.anInt10138 = local999[0];
												Static230.anInt5187 = local999[1];
												Static390.anInt7400 = local999[2];
											}
											Static604.anInt10035 = 1;
											Static81.aBoolean190 = false;
											Static77.anInt3994 = Static501.aClass59_5.method4107();
											Static28.anInt483 = Static501.aClass59_5.method4106();
											continue;
										}
										if (local276 && Static604.anInt10035 > 0) {
											if (Static604.anInt10035 == 1 && (Static77.anInt3994 != Static501.aClass59_5.method4107() || Static28.anInt483 != Static501.aClass59_5.method4106())) {
												Static152.anInt3752 = Static353.anInt6903;
												Static544.anInt9351 = Static386.anInt8408;
												Static604.anInt10035 = 2;
											}
											if (Static604.anInt10035 == 2) {
												Static81.aBoolean190 = true;
												Static464.method6945(Static152.anInt3752 + (int) ((double) (Static77.anInt3994 - Static501.aClass59_5.method4107()) * 2.0D / (double) Static361.aFloat89));
												Static166.method3504(Static544.anInt9351 - (int) ((double) (Static28.anInt483 - Static501.aClass59_5.method4106()) * 2.0D / (double) Static361.aFloat89));
											}
											continue;
										}
										if (Static604.anInt10035 > 0 && !Static81.aBoolean190) {
											if ((Static639.anInt10496 == 1 || Static76.method1868()) && Static443.anInt8026 > 2) {
												Static17.method259(Static77.anInt3994, Static28.anInt483);
											} else if (Static328.method5502()) {
												Static17.method259(Static77.anInt3994, Static28.anInt483);
											}
										}
										Static604.anInt10035 = 0;
										continue;
									}
									if (local6.anInt4031 == Static487.anInt8648) {
										if (local276) {
											Static105.method2574(local6.anInt4067, local40 + Static501.aClass59_5.method4107() - local17, local6.anInt4037, local45 + Static501.aClass59_5.method4106() - local22);
										}
										continue;
									}
									if (local6.anInt4031 == Static34.anInt627) {
										Static169.method3524(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean338 && local286) {
									local6.aBoolean338 = true;
									if (local6.anObjectArray27 != null) {
										local558 = new Class3_Sub51();
										local558.aBoolean865 = true;
										local558.aClass108_13 = local6;
										local558.anInt10306 = local40 + local291.method6363() - local17;
										local558.anInt10307 = local45 + local291.method6367() - local22;
										local558.anObjectArray33 = local6.anObjectArray27;
										Static306.aClass276_42.method6906(local558);
									}
								}
								if (local6.aBoolean338 && local276 && local6.anObjectArray23 != null) {
									local558 = new Class3_Sub51();
									local558.aBoolean865 = true;
									local558.aClass108_13 = local6;
									local558.anInt10306 = local40 + Static501.aClass59_5.method4107() - local17;
									local558.anInt10307 = local45 + Static501.aClass59_5.method4106() - local22;
									local558.anObjectArray33 = local6.anObjectArray23;
									Static306.aClass276_42.method6906(local558);
								}
								if (local6.aBoolean338 && !local276) {
									local6.aBoolean338 = false;
									if (local6.anObjectArray28 != null) {
										local558 = new Class3_Sub51();
										local558.aBoolean865 = true;
										local558.aClass108_13 = local6;
										local558.anInt10306 = local40 + Static501.aClass59_5.method4107() - local17;
										local558.anInt10307 = local45 + Static501.aClass59_5.method4106() - local22;
										local558.anObjectArray33 = local6.anObjectArray28;
										Static447.aClass276_48.method6906(local558);
									}
								}
								if (local276 && local6.anObjectArray5 != null) {
									local558 = new Class3_Sub51();
									local558.aBoolean865 = true;
									local558.aClass108_13 = local6;
									local558.anInt10306 = local40 + Static501.aClass59_5.method4107() - local17;
									local558.anInt10307 = local45 + Static501.aClass59_5.method4106() - local22;
									local558.anObjectArray33 = local6.anObjectArray5;
									Static306.aClass276_42.method6906(local558);
								}
								if (!local6.aBoolean351 && local232) {
									local6.aBoolean351 = true;
									if (local6.anObjectArray2 != null) {
										local558 = new Class3_Sub51();
										local558.aBoolean865 = true;
										local558.aClass108_13 = local6;
										local558.anInt10306 = local40 + Static501.aClass59_5.method4107() - local17;
										local558.anInt10307 = local45 + Static501.aClass59_5.method4106() - local22;
										local558.anObjectArray33 = local6.anObjectArray2;
										Static306.aClass276_42.method6906(local558);
									}
								}
								if (local6.aBoolean351 && local232 && local6.anObjectArray12 != null) {
									local558 = new Class3_Sub51();
									local558.aBoolean865 = true;
									local558.aClass108_13 = local6;
									local558.anInt10306 = local40 + Static501.aClass59_5.method4107() - local17;
									local558.anInt10307 = local45 + Static501.aClass59_5.method4106() - local22;
									local558.anObjectArray33 = local6.anObjectArray12;
									Static306.aClass276_42.method6906(local558);
								}
								if (local6.aBoolean351 && !local232) {
									local6.aBoolean351 = false;
									if (local6.anObjectArray7 != null) {
										local558 = new Class3_Sub51();
										local558.aBoolean865 = true;
										local558.aClass108_13 = local6;
										local558.anInt10306 = local40 + Static501.aClass59_5.method4107() - local17;
										local558.anInt10307 = local45 + Static501.aClass59_5.method4106() - local22;
										local558.anObjectArray33 = local6.anObjectArray7;
										Static447.aClass276_48.method6906(local558);
									}
								}
								if (local6.anObjectArray31 != null) {
									local558 = new Class3_Sub51();
									local558.aClass108_13 = local6;
									local558.anObjectArray33 = local6.anObjectArray31;
									Static406.aClass276_47.method6906(local558);
								}
								@Pc(1570) Class3_Sub51 local1570;
								if (local6.anObjectArray24 != null && Static91.anInt2464 > local6.anInt4033) {
									if (local6.anIntArray223 == null || Static91.anInt2464 - local6.anInt4033 > 32) {
										local558 = new Class3_Sub51();
										local558.aClass108_13 = local6;
										local558.anObjectArray33 = local6.anObjectArray24;
										Static306.aClass276_42.method6906(local558);
									} else {
										label687: for (local335 = local6.anInt4033; local335 < Static91.anInt2464; local335++) {
											local708 = Static338.anIntArray392[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray223.length; local469++) {
												if (local6.anIntArray223[local469] == local708) {
													local1570 = new Class3_Sub51();
													local1570.aClass108_13 = local6;
													local1570.anObjectArray33 = local6.anObjectArray24;
													Static306.aClass276_42.method6906(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt4033 = Static91.anInt2464;
								}
								if (local6.anObjectArray1 != null && Static128.anInt3196 > local6.anInt4074) {
									if (local6.anIntArray220 == null || Static128.anInt3196 - local6.anInt4074 > 32) {
										local558 = new Class3_Sub51();
										local558.aClass108_13 = local6;
										local558.anObjectArray33 = local6.anObjectArray1;
										Static306.aClass276_42.method6906(local558);
									} else {
										label663: for (local335 = local6.anInt4074; local335 < Static128.anInt3196; local335++) {
											local708 = Static166.anIntArray212[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray220.length; local469++) {
												if (local6.anIntArray220[local469] == local708) {
													local1570 = new Class3_Sub51();
													local1570.aClass108_13 = local6;
													local1570.anObjectArray33 = local6.anObjectArray1;
													Static306.aClass276_42.method6906(local1570);
													break label663;
												}
											}
										}
									}
									local6.anInt4074 = Static128.anInt3196;
								}
								if (local6.anObjectArray4 != null && Static224.anInt5124 > local6.anInt4017) {
									if (local6.anIntArray222 == null || Static224.anInt5124 - local6.anInt4017 > 32) {
										local558 = new Class3_Sub51();
										local558.aClass108_13 = local6;
										local558.anObjectArray33 = local6.anObjectArray4;
										Static306.aClass276_42.method6906(local558);
									} else {
										label639: for (local335 = local6.anInt4017; local335 < Static224.anInt5124; local335++) {
											local708 = Static587.anIntArray595[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray222.length; local469++) {
												if (local6.anIntArray222[local469] == local708) {
													local1570 = new Class3_Sub51();
													local1570.aClass108_13 = local6;
													local1570.anObjectArray33 = local6.anObjectArray4;
													Static306.aClass276_42.method6906(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt4017 = Static224.anInt5124;
								}
								if (local6.anObjectArray29 != null && Static380.anInt7242 > local6.anInt4039) {
									if (local6.anIntArray216 == null || Static380.anInt7242 - local6.anInt4039 > 32) {
										local558 = new Class3_Sub51();
										local558.aClass108_13 = local6;
										local558.anObjectArray33 = local6.anObjectArray29;
										Static306.aClass276_42.method6906(local558);
									} else {
										label615: for (local335 = local6.anInt4039; local335 < Static380.anInt7242; local335++) {
											local708 = Static205.anIntArray274[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray216.length; local469++) {
												if (local6.anIntArray216[local469] == local708) {
													local1570 = new Class3_Sub51();
													local1570.aClass108_13 = local6;
													local1570.anObjectArray33 = local6.anObjectArray29;
													Static306.aClass276_42.method6906(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt4039 = Static380.anInt7242;
								}
								if (local6.anObjectArray16 != null && Static211.anInt4899 > local6.anInt4076) {
									if (local6.anIntArray215 == null || Static211.anInt4899 - local6.anInt4076 > 32) {
										local558 = new Class3_Sub51();
										local558.aClass108_13 = local6;
										local558.anObjectArray33 = local6.anObjectArray16;
										Static306.aClass276_42.method6906(local558);
									} else {
										label591: for (local335 = local6.anInt4076; local335 < Static211.anInt4899; local335++) {
											local708 = Static525.anIntArray568[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray215.length; local469++) {
												if (local6.anIntArray215[local469] == local708) {
													local1570 = new Class3_Sub51();
													local1570.aClass108_13 = local6;
													local1570.anObjectArray33 = local6.anObjectArray16;
													Static306.aClass276_42.method6906(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt4076 = Static211.anInt4899;
								}
								if (Static234.anInt5310 > local6.anInt4038 && local6.anObjectArray15 != null) {
									local558 = new Class3_Sub51();
									local558.aClass108_13 = local6;
									local558.anObjectArray33 = local6.anObjectArray15;
									Static306.aClass276_42.method6906(local558);
								}
								if (Static246.anInt5500 > local6.anInt4038 && local6.anObjectArray30 != null) {
									local558 = new Class3_Sub51();
									local558.aClass108_13 = local6;
									local558.anObjectArray33 = local6.anObjectArray30;
									Static306.aClass276_42.method6906(local558);
								}
								if (Static344.anInt6772 > local6.anInt4038 && local6.anObjectArray9 != null) {
									local558 = new Class3_Sub51();
									local558.aClass108_13 = local6;
									local558.anObjectArray33 = local6.anObjectArray9;
									Static306.aClass276_42.method6906(local558);
								}
								if (Static591.anInt9853 > local6.anInt4038 && local6.anObjectArray22 != null) {
									local558 = new Class3_Sub51();
									local558.aClass108_13 = local6;
									local558.anObjectArray33 = local6.anObjectArray22;
									Static306.aClass276_42.method6906(local558);
								}
								if (Static488.anInt8666 > local6.anInt4038 && local6.anObjectArray20 != null) {
									local558 = new Class3_Sub51();
									local558.aClass108_13 = local6;
									local558.anObjectArray33 = local6.anObjectArray20;
									Static306.aClass276_42.method6906(local558);
								}
								local6.anInt4038 = Static244.anInt5487;
								if (local6.anObjectArray17 != null) {
									for (local335 = 0; local335 < Static343.anInt6755; local335++) {
										@Pc(2038) Class3_Sub51 local2038 = new Class3_Sub51();
										local2038.aClass108_13 = local6;
										local2038.anInt10309 = Static124.anInterface13Array1[local335].method749();
										local2038.anInt10310 = Static124.anInterface13Array1[local335].method745();
										local2038.anObjectArray33 = local6.anObjectArray17;
										Static306.aClass276_42.method6906(local2038);
									}
								}
								if (Static445.aBoolean687 && local6.anObjectArray3 != null) {
									local558 = new Class3_Sub51();
									local558.aClass108_13 = local6;
									local558.anObjectArray33 = local6.anObjectArray3;
									Static306.aClass276_42.method6906(local558);
								}
							}
							if (local6.anInt4018 == 5 && local6.anInt4062 != -1) {
								local6.method3520(Static20.aClass202_1, Static57.aClass265_33).method4615(Static47.aClass33_3, local6.anInt4037);
							}
							Static472.method5186(local6);
							if (local6.anInt4018 == 0) {
								method1833(arg0, local6.anInt4043, local28, local30, local32, local34, local17 - local6.anInt4056, local22 - local6.anInt4009, arg8, arg9, arg10, arg11);
								if (local6.aClass108Array1 != null) {
									method1833(local6.aClass108Array1, local6.anInt4043, local28, local30, local32, local34, local17 - local6.anInt4056, local22 - local6.anInt4009, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class3_Sub50 local2164 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local6.anInt4043);
								if (local2164 != null) {
									if (Static648.aClass62_16 == Static592.aClass62_13 && local2164.anInt9574 == 0 && !Static433.aBoolean672 && local232 && !Static401.aBoolean650) {
										Static137.method3124();
									}
									Static223.method4293(local2164.anInt9575, local28, arg10, local30, arg9, arg8, local34, arg11, local22, local17, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static472.method5186(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!gaa;)Lclient!gaa;")
	public static Class108 method1834(@OriginalArg(0) Class108 arg0) {
		@Pc(4) int local4 = method1836(arg0).method1185();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static113.method8285(arg0.anInt4046);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1835() {
		for (@Pc(1) int local1 = 0; local1 < Static394.anInt7540; local1++) {
			@Pc(6) int[] local6 = Static188.anIntArrayArray40[local1];
			for (@Pc(8) int local8 = 0; local8 < Static462.anInt8391; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!gaa;)Lclient!bw;")
	public static Class3_Sub11 method1836(@OriginalArg(0) Class108 arg0) {
		@Pc(13) Class3_Sub11 local13 = (Class3_Sub11) Static149.aClass307_22.method7424(((long) arg0.anInt4043 << 32) + (long) arg0.anInt4083);
		return local13 == null ? arg0.aClass3_Sub11_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)Z")
	public static boolean method1837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static469.method6991(arg0, arg1) | (arg1 & 0x10000) != 0 || Static126.method2895(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static289.method4998(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1838(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static385.anInt10557;
		@Pc(3) int[] local3 = Static493.anIntArray555;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static377.anInt7132; local5++) {
			@Pc(15) Class2_Sub3_Sub1_Sub2 local15;
			if (local5 < local1) {
				local15 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local3[local5]];
			} else {
				local15 = ((Class3_Sub49) Static60.aClass307_6.method7424((long) Static176.anIntArray229[local5 - local1])).aClass2_Sub3_Sub1_Sub2_Sub1_2;
			}
			if (local15.aByte128 == arg0 && local15.anInt6342 >= 0) {
				@Pc(39) int local39 = local15.method5308();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10428 & 0x1FF) != 0 || (local15.anInt10424 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10428 & 0x1FF) != 256 || (local15.anInt10424 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10428 >> 9;
					local80 = local15.anInt10424 >> 9;
					if (local15.anInt6342 > Static188.anIntArrayArray40[local75][local80]) {
						Static188.anIntArrayArray40[local75][local80] = local15.anInt6342;
						Static396.anIntArrayArray74[local75][local80] = 1;
					} else if (local15.anInt6342 == Static188.anIntArrayArray40[local75][local80]) {
						local116 = Static396.anIntArrayArray74[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10428 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10424 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10428 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10424 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt6342 > Static188.anIntArrayArray40[local158][local161]) {
								Static188.anIntArrayArray40[local158][local161] = local15.anInt6342;
								Static396.anIntArrayArray74[local158][local161] = 1;
							} else if (local15.anInt6342 == Static188.anIntArrayArray40[local158][local161]) {
								local116 = Static396.anIntArrayArray74[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}
}
