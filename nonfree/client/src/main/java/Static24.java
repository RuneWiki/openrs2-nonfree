import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "Lclient!hh;")
	public static Class69 aClass69_3 = new Class69();

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!bh", name = "hb", descriptor = "I")
	public static int anInt554 = 0;

	@OriginalMember(owner = "client!bh", name = "jb", descriptor = "I")
	public static int anInt556 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!jj;Ljava/lang/String;)I")
	public static int method422(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt3911;
		@Pc(10) byte[] local10 = Static30.method497(arg1);
		arg0.method3061(local10.length);
		arg0.anInt3911 += Static235.aClass99_1.method2276(arg0.aByteArray71, 0, local10.length, arg0.anInt3911, local10);
		return arg0.anInt3911 - local6;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(BI)Lclient!bo;")
	public static Class19 method424(@OriginalArg(1) int arg0) {
		@Pc(10) Class19 local10 = (Class19) Static14.aClass31_3.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static275.aClass7_221.method253(Static219.method3487(arg0), Static160.method2479(arg0));
		local10 = new Class19();
		local10.anInt659 = arg0;
		if (local24 != null) {
			local10.method496(new Class1_Sub18(local24));
		}
		local10.method503();
		Static14.aClass31_3.method851(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!og;II)V")
	public static void method425(@OriginalArg(1) Class127 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static108.aClass127_7 != null || Static192.aBoolean414 || (arg0 == null || Static71.method1175(arg0) == null)) {
			return;
		}
		Static108.aClass127_7 = arg0;
		Static270.aClass127_15 = Static71.method1175(arg0);
		Static108.anInt2042 = arg1;
		Static39.anInt853 = arg2;
		Static118.aBoolean166 = false;
		Static61.anInt1268 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII[Lclient!og;I)V")
	public static void method426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class127[] arg8) {
		if (Static240.aBoolean369) {
			Static50.method867(arg5, arg7, arg3, arg4);
		} else {
			Static213.method3369(arg5, arg7, arg3, arg4);
			Static208.method3241();
		}
		for (@Pc(18) int local18 = 0; local18 < arg8.length; local18++) {
			@Pc(35) Class127 local35 = arg8[local18];
			if (local35 != null && (local35.anInt3563 == arg6 || arg6 == -1412584499 && Static108.aClass127_7 == local35)) {
				@Pc(88) int local88;
				if (arg1 == -1) {
					Static174.anIntArray383[Static166.anInt3059] = local35.anInt3594 + arg2;
					Static217.anIntArray514[Static166.anInt3059] = arg0 + local35.anInt3593;
					Static171.anIntArray380[Static166.anInt3059] = local35.anInt3567;
					Static38.anIntArray118[Static166.anInt3059] = local35.anInt3595;
					local88 = Static166.anInt3059++;
				} else {
					local88 = arg1;
				}
				local35.anInt3588 = local88;
				local35.anInt3557 = Static261.anInt5259;
				if (!local35.aBoolean261 || !Static43.method805(local35)) {
					if (local35.anInt3566 > 0) {
						Static128.method1972(local35);
					}
					@Pc(118) int local118 = local35.anInt3618;
					@Pc(123) int local123 = local35.anInt3594 + arg2;
					@Pc(128) int local128 = arg0 + local35.anInt3593;
					if (Static26.aBoolean49 && (Static43.method794(local35).anInt5647 != 0 || local35.anInt3570 == 0) && local118 > 127) {
						local118 = 127;
					}
					@Pc(181) int local181;
					@Pc(179) int local179;
					if (Static108.aClass127_7 == local35) {
						if (arg6 != -1412584499 && !local35.aBoolean275) {
							Static227.aClass127Array2 = arg8;
							Static170.anInt3121 = arg0;
							Static131.anInt2511 = arg2;
							continue;
						}
						if (!local35.aBoolean275) {
							local118 = 128;
						}
						if (Static118.aBoolean166 && Static109.aBoolean150) {
							local179 = Static293.anInt5833;
							local181 = Static224.anInt4700;
							local181 -= Static39.anInt853;
							local179 -= Static108.anInt2042;
							if (Static14.anInt362 > local181) {
								local181 = Static14.anInt362;
							}
							if (local181 + local35.anInt3567 > Static14.anInt362 - -Static270.aClass127_15.anInt3567) {
								local181 = Static14.anInt362 + Static270.aClass127_15.anInt3567 - local35.anInt3567;
							}
							if (local179 < Static117.anInt2232) {
								local179 = Static117.anInt2232;
							}
							if (local179 + local35.anInt3595 > Static117.anInt2232 - -Static270.aClass127_15.anInt3595) {
								local179 = Static117.anInt2232 + Static270.aClass127_15.anInt3595 - local35.anInt3595;
							}
							local123 = local181;
							local128 = local179;
						}
					}
					@Pc(300) int local300;
					@Pc(289) int local289;
					@Pc(273) int local273;
					@Pc(261) int local261;
					if (local35.anInt3570 == 2) {
						local181 = arg5;
						local289 = arg4;
						local300 = arg3;
						local179 = arg7;
					} else {
						local261 = local128 + local35.anInt3595;
						local181 = arg5 < local123 ? local123 : arg5;
						local273 = local123 + local35.anInt3567;
						if (local35.anInt3570 == 9) {
							local273++;
							local261++;
						}
						local289 = local261 < arg4 ? local261 : arg4;
						local300 = arg3 <= local273 ? arg3 : local273;
						local179 = arg7 >= local128 ? arg7 : local128;
					}
					if (!local35.aBoolean261 || local300 > local181 && local179 < local289) {
						@Pc(468) int local468;
						@Pc(501) int local501;
						@Pc(517) int local517;
						@Pc(505) int local505;
						@Pc(535) int local535;
						@Pc(546) int local546;
						@Pc(563) int local563;
						@Pc(579) int local579;
						if (local35.anInt3566 != 0) {
							if (local35.anInt3566 == 1337 || local35.anInt3566 == 1403) {
								Static298.aClass127_17 = local35;
								Static162.anInt2990 = local123;
								Static93.anInt1770 = local128;
								Static57.method938(local128, local35.anInt3566 == 1403, local35.anInt3567, local35.anInt3595, local123);
								Static267.aBooleanArray25[local88] = true;
								if (Static240.aBoolean369) {
									Static50.method867(arg5, arg7, arg3, arg4);
								} else {
									Static213.method3369(arg5, arg7, arg3, arg4);
								}
								continue;
							}
							if (local35.anInt3566 == 1338) {
								if (!local35.method2846()) {
									continue;
								}
								Static13.method2698(local88, local128, local123, local35);
								if (Static240.aBoolean369) {
									Static50.method867(arg5, arg7, arg3, arg4);
								} else {
									Static213.method3369(arg5, arg7, arg3, arg4);
								}
								if (Static43.anInt967 != 0 && Static43.anInt967 != 3 || Static192.aBoolean414 || local181 > Static54.anInt1146 || local179 > Static223.anInt4678 || local300 <= Static54.anInt1146 || Static223.anInt4678 >= local289) {
									continue;
								}
								local273 = Static54.anInt1146 - local123;
								local261 = Static223.anInt4678 - local128;
								local468 = local35.anIntArray417[local261];
								if (local273 < local468 || local273 > local468 + local35.anIntArray425[local261]) {
									continue;
								}
								local273 -= local35.anInt3567 / 2;
								local261 -= local35.anInt3595 / 2;
								local501 = Static35.anInt746 + (int) Static177.aFloat97 & 0x7FF;
								local505 = Class135.anIntArray474[local501];
								local505 = (Static155.anInt2868 + 256) * local505 >> 8;
								local517 = Class135.anIntArray472[local501];
								local517 = local517 * (Static155.anInt2868 + 256) >> 8;
								local535 = local517 * local261 + local505 * local273 >> 11;
								local546 = local505 * local261 - local273 * local517 >> 11;
								local563 = Static28.aClass6_Sub6_Sub2_1.anInt4562 + local535 + 64 - Static28.aClass6_Sub6_Sub2_1.method3509() * 64 >> 7;
								local579 = Static28.aClass6_Sub6_Sub2_1.anInt4569 + 64 - local546 - Static28.aClass6_Sub6_Sub2_1.method3509() * 64 >> 7;
								if (Static75.aBoolean115 && (Static14.anInt367 & 0x40) != 0) {
									@Pc(593) Class127 local593 = Static241.method3829(Static278.anInt5569, Static197.anInt3818);
									if (local593 == null) {
										Static247.method3873();
									} else {
										Static166.method2533(Static222.aString150, local579, local563, " ->", (short) 40, Static162.anInt2993, 1L);
									}
									continue;
								}
								if (Static107.anInt1994 == 1) {
									Static166.method2533(Static38.aString23, local579, local563, "", (short) 32, -1, 1L);
								}
								Static166.method2533(Static118.aString71, local579, local563, "", (short) 14, -1, 1L);
								continue;
							}
							if (local35.anInt3566 == 1339) {
								if (local35.method2846()) {
									Static57.method936(local128, local123, local88, local35);
									if (Static240.aBoolean369) {
										Static50.method867(arg5, arg7, arg3, arg4);
									} else {
										Static213.method3369(arg5, arg7, arg3, arg4);
									}
								}
								continue;
							}
							if (local35.anInt3566 == 1400) {
								Static219.method3486(local128, local123, local35.anInt3595, local35.anInt3567);
								Static267.aBooleanArray25[local88] = true;
								Static260.aBooleanArray24[local88] = true;
								if (Static240.aBoolean369) {
									Static50.method867(arg5, arg7, arg3, arg4);
								} else {
									Static213.method3369(arg5, arg7, arg3, arg4);
								}
								continue;
							}
							if (local35.anInt3566 == 1401) {
								Static121.method1900(local123, local35.anInt3567, local35.anInt3595, local128);
								Static267.aBooleanArray25[local88] = true;
								Static260.aBooleanArray24[local88] = true;
								if (Static240.aBoolean369) {
									Static50.method867(arg5, arg7, arg3, arg4);
								} else {
									Static213.method3369(arg5, arg7, arg3, arg4);
								}
								continue;
							}
							if (local35.anInt3566 == 1402) {
								if (!Static240.aBoolean369) {
									Static26.method444(local128, local123);
									Static267.aBooleanArray25[local88] = true;
									Static260.aBooleanArray24[local88] = true;
								}
								continue;
							}
							if (local35.anInt3566 == 1405) {
								if (!Static63.aBoolean101) {
									continue;
								}
								local273 = local35.anInt3567 + local123;
								local261 = local128 + 15;
								Static84.aClass1_Sub2_Sub12_2.method4399("Fps:" + Static249.anInt5049, local273, local261, 16776960, -1);
								local261 += 15;
								@Pc(802) Runtime local802 = Runtime.getRuntime();
								local501 = (int) ((local802.totalMemory() - local802.freeMemory()) / 1024L);
								local517 = 16776960;
								if (local501 > 65536) {
									local517 = 16711680;
								}
								Static84.aClass1_Sub2_Sub12_2.method4399("Mem:" + local501 + "k", local273, local261, local517, -1);
								local261 += 15;
								if (Static240.aBoolean369) {
									local505 = (Static154.anInt2854 + Static154.anInt2853 + Static154.anInt2855) / 1024;
									local517 = 16776960;
									if (local505 > 65536) {
										local517 = 16711680;
									}
									Static84.aClass1_Sub2_Sub12_2.method4399("Card:" + local505 + "k", local273, local261, local517, -1);
									local261 += 15;
								}
								local505 = 0;
								local535 = 0;
								local546 = 0;
								for (local563 = 0; local563 < 29; local563++) {
									local505 += Static61.aClass143_Sub1Array2[local563].method3827();
									local535 += Static61.aClass143_Sub1Array2[local563].method3824();
									local546 += Static61.aClass143_Sub1Array2[local563].method3823();
								}
								local579 = local535 * 10000 / local505;
								local563 = local546 * 100 / local505;
								@Pc(945) String local945 = "Cache:" + Static270.method4147(0, (long) local579, true, 2) + "% (" + local563 + "%)";
								Static169.aClass1_Sub2_Sub12_3.method4399(local945, local273, local261, 16776960, -1);
								local261 += 12;
								Static267.aBooleanArray25[local88] = true;
								Static260.aBooleanArray24[local88] = true;
								continue;
							}
							if (local35.anInt3566 == 1406) {
								Static158.anInt2964 = local123;
								Static147.anInt2706 = local128;
								Static267.aClass127_14 = local35;
								continue;
							}
						}
						if (!Static192.aBoolean414) {
							if (local35.anInt3570 == 0 && local35.aBoolean262 && local181 <= Static54.anInt1146 && Static223.anInt4678 >= local179 && local300 > Static54.anInt1146 && Static223.anInt4678 < local289 && !Static26.aBoolean49) {
								Static277.aStringArray35[0] = Static174.aString110;
								Static29.anInt626 = 1;
								Static276.aShortArray92[0] = 1003;
								Static64.anIntArray148[0] = Static223.anInt4684;
								Static190.aStringArray19[0] = "";
							}
							if (Static54.anInt1146 >= local181 && local179 <= Static223.anInt4678 && Static54.anInt1146 < local300 && Static223.anInt4678 < local289) {
								Static283.method4317(Static223.anInt4678 - local128, local35, Static54.anInt1146 - local123);
							}
						}
						if (local35.anInt3570 == 0) {
							if (!local35.aBoolean261 && Static43.method805(local35) && local35 != Static30.aClass127_1) {
								continue;
							}
							if (!local35.aBoolean261) {
								if (local35.anInt3600 - local35.anInt3595 < local35.anInt3628) {
									local35.anInt3628 = local35.anInt3600 - local35.anInt3595;
								}
								if (local35.anInt3628 < 0) {
									local35.anInt3628 = 0;
								}
							}
							if (Static240.aBoolean369 && local35.anInt3566 == 1407) {
								Static111.method1741(local123, local128, local35.anInt3567, local35.anInt3595);
							}
							method426(local128 - local35.anInt3628, local88, local123 - local35.anInt3583, local300, local289, local181, local35.anInt3574, local179, arg8);
							if (local35.aClass127Array1 != null) {
								method426(local128 - local35.anInt3628, local88, local123 - local35.anInt3583, local300, local289, local181, local35.anInt3574, local179, local35.aClass127Array1);
							}
							@Pc(1174) Class1_Sub32 local1174 = (Class1_Sub32) Static67.aClass22_7.method633((long) local35.anInt3574);
							if (local1174 != null) {
								if (local1174.anInt5663 == 0 && !Static192.aBoolean414 && Static54.anInt1146 >= local181 && local179 <= Static223.anInt4678 && local300 > Static54.anInt1146 && local289 > Static223.anInt4678 && !Static26.aBoolean49) {
									Static277.aStringArray35[0] = Static174.aString110;
									Static29.anInt626 = 1;
									Static64.anIntArray148[0] = Static223.anInt4684;
									Static190.aStringArray19[0] = "";
									Static276.aShortArray92[0] = 1003;
								}
								Static57.method934(local181, local289, local128, local88, local1174.anInt5665, local123, local300, local179);
							}
							if (Static240.aBoolean369 && local35.anInt3566 == 1407) {
								Static111.method1733();
							}
							if (Static240.aBoolean369) {
								Static50.method867(arg5, arg7, arg3, arg4);
							} else {
								Static213.method3369(arg5, arg7, arg3, arg4);
								Static208.method3241();
							}
						}
						if (Static44.aBooleanArray5[local88] || Static58.anInt1223 > 1) {
							if (local35.anInt3570 == 0 && !local35.aBoolean261 && local35.anInt3600 > local35.anInt3595) {
								Static5.method122(local35.anInt3595, local35.anInt3628, local128, local35.anInt3567 + local123, local35.anInt3600);
							}
							if (local35.anInt3570 != 1) {
								if (local35.anInt3570 == 2) {
									local273 = 0;
									for (local261 = 0; local261 < local35.anInt3544; local261++) {
										for (local468 = 0; local468 < local35.anInt3546; local468++) {
											local501 = (local35.anInt3627 + 32) * local468 + local123;
											local517 = local128 + local261 * (local35.anInt3559 + 32);
											if (local273 < 20) {
												local517 += local35.anIntArray409[local273];
												local501 += local35.anIntArray410[local273];
											}
											if (local35.anIntArray415[local273] > 0) {
												local546 = local35.anIntArray415[local273] - 1;
												if (arg5 < local501 + 32 && local501 < arg3 && local517 + 32 > arg7 && local517 < arg4 || Static284.aClass127_16 == local35 && local273 == Static187.anInt3509) {
													@Pc(1454) Class1_Sub2_Sub2 local1454;
													if (Static282.anInt5856 == 1 && local273 == Static273.anInt5456 && Static180.anInt3326 == local35.anInt3574) {
														local1454 = Static254.method4537(local35.aBoolean272, local35.anIntArray422[local273], null, local546, 0, 2);
													} else {
														local1454 = Static254.method4537(local35.aBoolean272, local35.anIntArray422[local273], null, local546, 3153952, 1);
													}
													if (Static208.aBoolean311) {
														Static267.aBooleanArray25[local88] = true;
													}
													if (local1454 == null) {
														Static155.method2392(local35);
													} else if (local35 == Static284.aClass127_16 && Static187.anInt3509 == local273) {
														local505 = Static224.anInt4700 - Static173.anInt3177;
														local535 = Static293.anInt5833 - Static276.anInt5532;
														if (local535 < 5 && local535 > -5) {
															local535 = 0;
														}
														if (local505 < 5 && local505 > -5) {
															local505 = 0;
														}
														if (Static236.anInt4923 < 5) {
															local535 = 0;
															local505 = 0;
														}
														local1454.method3914(local505 + local501, local517 + local535, 128);
														if (arg6 != -1) {
															@Pc(1566) Class127 local1566 = arg8[arg6 & 0xFFFF];
															@Pc(1572) int local1572;
															@Pc(1570) int local1570;
															if (Static240.aBoolean369) {
																local1570 = Static50.anInt1066;
																local1572 = Static50.anInt1065;
															} else {
																local1570 = Static213.anInt4238;
																local1572 = Static213.anInt4242;
															}
															@Pc(1606) int local1606;
															if (local517 + local535 < local1572 && local1566.anInt3628 > 0) {
																local1606 = Static47.anInt5866 * (local1572 - local517 - local535) / 3;
																if (local1606 > Static47.anInt5866 * 10) {
																	local1606 = Static47.anInt5866 * 10;
																}
																if (local1566.anInt3628 < local1606) {
																	local1606 = local1566.anInt3628;
																}
																local1566.anInt3628 -= local1606;
																Static276.anInt5532 += local1606;
																Static155.method2392(local1566);
															}
															if (local1570 < local517 + local535 + 32 && local1566.anInt3628 < local1566.anInt3600 - local1566.anInt3595) {
																local1606 = Static47.anInt5866 * (local517 + local535 + 32 - local1570) / 3;
																if (local1606 > Static47.anInt5866 * 10) {
																	local1606 = Static47.anInt5866 * 10;
																}
																if (local1566.anInt3600 - local1566.anInt3628 - local1566.anInt3595 < local1606) {
																	local1606 = local1566.anInt3600 - local1566.anInt3628 - local1566.anInt3595;
																}
																local1566.anInt3628 += local1606;
																Static276.anInt5532 -= local1606;
																Static155.method2392(local1566);
															}
														}
													} else if (local35 == Static103.aClass127_6 && local273 == Static209.anInt4192) {
														local1454.method3914(local501, local517, 128);
													} else {
														local1454.method3921(local501, local517);
													}
												}
											} else if (local35.anIntArray424 != null && local273 < 20) {
												@Pc(1743) Class1_Sub2_Sub2 local1743 = local35.method2854(local273);
												if (local1743 != null) {
													local1743.method3921(local501, local517);
												} else if (Static209.aBoolean318) {
													Static155.method2392(local35);
												}
											}
											local273++;
										}
									}
								} else if (local35.anInt3570 == 3) {
									if (Static103.method1652(local35)) {
										local273 = local35.anInt3551;
										if (Static30.aClass127_1 == local35 && local35.anInt3555 != 0) {
											local273 = local35.anInt3555;
										}
									} else {
										local273 = local35.anInt3550;
										if (local35 == Static30.aClass127_1 && local35.anInt3598 != 0) {
											local273 = local35.anInt3598;
										}
									}
									if (local118 == 0) {
										if (local35.aBoolean270) {
											if (Static240.aBoolean369) {
												Static50.method866(local123, local128, local35.anInt3567, local35.anInt3595, local273);
											} else {
												Static213.method3362(local123, local128, local35.anInt3567, local35.anInt3595, local273);
											}
										} else if (Static240.aBoolean369) {
											Static50.method868(local123, local128, local35.anInt3567, local35.anInt3595, local273);
										} else {
											Static213.method3370(local123, local128, local35.anInt3567, local35.anInt3595, local273);
										}
									} else if (local35.aBoolean270) {
										if (Static240.aBoolean369) {
											Static50.method871(local123, local128, local35.anInt3567, local35.anInt3595, local273, 256 - (local118 & 0xFF));
										} else {
											Static213.method3374(local123, local128, local35.anInt3567, local35.anInt3595, local273, 256 - (local118 & 0xFF));
										}
									} else if (Static240.aBoolean369) {
										Static50.method862(local123, local128, local35.anInt3567, local35.anInt3595, local273, 256 - (local118 & 0xFF));
									} else {
										Static213.method3378(local123, local128, local35.anInt3567, local35.anInt3595, local273, 256 - (local118 & 0xFF));
									}
								} else {
									@Pc(1936) Class1_Sub2_Sub12 local1936;
									if (local35.anInt3570 == 4) {
										local1936 = local35.method2856(Static211.aClass48Array2);
										if (local1936 != null) {
											@Pc(1950) String local1950 = local35.aString125;
											if (Static103.method1652(local35)) {
												local261 = local35.anInt3551;
												if (Static30.aClass127_1 == local35 && local35.anInt3555 != 0) {
													local261 = local35.anInt3555;
												}
												if (local35.aString127.length() > 0) {
													local1950 = local35.aString127;
												}
											} else {
												local261 = local35.anInt3550;
												if (Static30.aClass127_1 == local35 && local35.anInt3598 != 0) {
													local261 = local35.anInt3598;
												}
											}
											if (local35.aBoolean261 && local35.anInt3575 != -1) {
												@Pc(2006) Class120 local2006 = Static183.method4458(local35.anInt3575);
												local1950 = local2006.aString113;
												if (local1950 == null) {
													local1950 = "null";
												}
												if ((local2006.anInt3266 == 1 || local35.anInt3629 != 1) && local35.anInt3629 != -1) {
													local1950 = "<col=ff9040>" + local1950 + "</col> x" + Static128.method1973(local35.anInt3629);
												}
											}
											if (local35 == Static91.aClass127_4) {
												local261 = local35.anInt3550;
												local1950 = Static211.aString25;
											}
											if (!local35.aBoolean261) {
												local1950 = Static201.method3131(local35, local1950);
											}
											local1936.method4388(local1950, local123, local128, local35.anInt3567, local35.anInt3595, local261, local35.aBoolean276 ? 0 : -1, local35.anInt3633, local35.anInt3610, local35.anInt3582);
										} else if (Static209.aBoolean318) {
											Static155.method2392(local35);
										}
									} else if (local35.anInt3570 == 5) {
										@Pc(2107) Class1_Sub2_Sub2 local2107;
										if (!local35.aBoolean261) {
											local2107 = local35.method2850(Static103.method1652(local35));
											if (local2107 != null) {
												local2107.method3921(local123, local128);
											} else if (Static209.aBoolean318) {
												Static155.method2392(local35);
											}
										} else if (local35.anInt3553 >= 0) {
											@Pc(2625) Class116 local2625 = local35.method2855();
											if (Static240.aBoolean369) {
												local2625.method2611(0, local123, local128, local35.anInt3567, local35.anInt3595, local35.anInt3576, local35.anInt3572, 0);
											} else {
												local2625.method2610(0, local123, local128, local35.anInt3567, local35.anInt3595, local35.anInt3576, local35.anInt3572);
											}
										} else {
											if (local35.anInt3575 == -1) {
												local2107 = local35.method2850(false);
											} else if (local35.aBoolean274 && Static28.aClass6_Sub6_Sub2_1.aClass149_2 != null) {
												local2107 = Static254.method4537(local35.aBoolean272, local35.anInt3629, Static28.aClass6_Sub6_Sub2_1.aClass149_2, local35.anInt3575, local35.anInt3580, local35.anInt3584);
											} else {
												local2107 = Static254.method4537(local35.aBoolean272, local35.anInt3629, null, local35.anInt3575, local35.anInt3580, local35.anInt3584);
											}
											if (local2107 != null) {
												local261 = local2107.anInt5109;
												local468 = local2107.anInt5113;
												if (local35.aBoolean263) {
													local501 = (local261 + local35.anInt3567 - 1) / local261;
													local517 = (local468 + local35.anInt3595 - 1) / local468;
													if (Static240.aBoolean369) {
														Static50.method858(local123, local128, local35.anInt3567 + local123, local128 - -local35.anInt3595);
														@Pc(2236) boolean local2236 = Static244.method3857(local2107.anInt5119);
														@Pc(2239) Class1_Sub2_Sub2_Sub2 local2239 = (Class1_Sub2_Sub2_Sub2) local2107;
														@Pc(2244) boolean local2244 = Static244.method3857(local2107.anInt5112);
														if (local2236 && local2244) {
															if (local118 == 0) {
																local2239.method3191(local123, local128, local501, local517);
															} else {
																local2239.method3194(local123, local128, 256 - (local118 & 0xFF), local501, local517);
															}
														} else if (local2236) {
															for (local563 = 0; local563 < local517; local563++) {
																if (local118 == 0) {
																	local2239.method3191(local123, local128 + local468 * local563, local501, 1);
																} else {
																	local2239.method3194(local123, local563 * local468 + local128, -(local118 & 0xFF) + 256, local501, 1);
																}
															}
														} else if (local2244) {
															for (local563 = 0; local563 < local501; local563++) {
																if (local118 == 0) {
																	local2239.method3191(local563 * local261 + local123, local128, 1, local517);
																} else {
																	local2239.method3194(local123 + local261 * local563, local128, 256 - (local118 & 0xFF), 1, local517);
																}
															}
														} else {
															for (local563 = 0; local563 < local501; local563++) {
																for (local579 = 0; local579 < local517; local579++) {
																	if (local118 == 0) {
																		local2107.method3921(local563 * local261 + local123, local468 * local579 + local128);
																	} else {
																		local2107.method3914(local123 + local563 * local261, local128 + local468 * local579, 256 - (local118 & 0xFF));
																	}
																}
															}
														}
														Static50.method867(arg5, arg7, arg3, arg4);
													} else {
														Static213.method3366(local123, local128, local123 + local35.anInt3567, local35.anInt3595 + local128);
														for (local505 = 0; local505 < local501; local505++) {
															for (local535 = 0; local535 < local517; local535++) {
																if (local35.anInt3603 != 0) {
																	local2107.method3917(4096, local468 * local535 + local128 + local468 / 2, local261 / 2 + local123 + local261 * local505, local35.anInt3603);
																} else if (local118 == 0) {
																	local2107.method3921(local505 * local261 + local123, local128 - -(local468 * local535));
																} else {
																	local2107.method3914(local123 + local505 * local261, local128 + local535 * local468, 256 - (local118 & 0xFF));
																}
															}
														}
														Static213.method3369(arg5, arg7, arg3, arg4);
													}
												} else {
													local501 = local35.anInt3567 * 4096 / local261;
													if (local35.anInt3603 != 0) {
														local2107.method3917(local501, local128 + local35.anInt3595 / 2, local123 + local35.anInt3567 / 2, local35.anInt3603);
													} else if (local118 != 0) {
														local2107.method3926(local123, local128, local35.anInt3567, local35.anInt3595, 256 - (local118 & 0xFF));
													} else if (local35.anInt3567 == local261 && local35.anInt3595 == local468) {
														local2107.method3921(local123, local128);
													} else {
														local2107.method3922(local123, local128, local35.anInt3567, local35.anInt3595);
													}
												}
											} else if (Static209.aBoolean318) {
												Static155.method2392(local35);
											}
										}
									} else {
										@Pc(2835) Class120 local2835;
										if (local35.anInt3570 == 6) {
											@Pc(2670) boolean local2670 = Static103.method1652(local35);
											if (local2670) {
												local261 = local35.anInt3606;
											} else {
												local261 = local35.anInt3623;
											}
											@Pc(2682) Class6_Sub2 local2682 = null;
											local501 = 0;
											if (local35.anInt3575 != -1) {
												local2835 = Static183.method4458(local35.anInt3575);
												if (local2835 != null) {
													local2835 = local2835.method2668(local35.anInt3629);
													@Pc(2853) Class133 local2853 = local261 == -1 ? null : Static262.method4031(local261);
													if (local35.aBoolean274 && Static28.aClass6_Sub6_Sub2_1.aClass149_2 != null) {
														local2682 = local2835.method2682(Static28.aClass6_Sub6_Sub2_1.aClass149_2, local35.anInt3581, local2853, local35.anInt3569, 1, local35.anInt3624);
													} else {
														local2682 = local2835.method2682(null, local35.anInt3581, local2853, local35.anInt3569, 1, local35.anInt3624);
													}
													if (local2682 == null) {
														Static155.method2392(local35);
													} else {
														local501 = -local2682.method3833() / 2;
													}
												}
											} else if (local35.anInt3592 == 5) {
												if (local35.anInt3560 == -1) {
													local2682 = Static10.aClass149_1.method3865(null, null, -1, -1, -1, -1, null, 0, 0);
												} else {
													local517 = local35.anInt3560 & 0x7FF;
													if (Static216.anInt4446 == local517) {
														local517 = 2047;
													}
													@Pc(2784) Class6_Sub6_Sub2 local2784 = Static77.aClass6_Sub6_Sub2Array1[local517];
													@Pc(2796) Class133 local2796 = local261 == -1 ? null : Static262.method4031(local261);
													if (local2784 != null && (int) Static136.method2158(local2784.aString147) << 11 == (local35.anInt3560 & 0xFFFFF800)) {
														local2682 = local2784.aClass149_2.method3865(local2796, null, -1, local35.anInt3581, -1, 0, null, 0, 0);
													}
												}
											} else if (local261 == -1) {
												local2682 = local35.method2852(0, -1, local2670, null, Static28.aClass6_Sub6_Sub2_1.aClass149_2, -1);
												if (local2682 == null && Static209.aBoolean318) {
													Static155.method2392(local35);
												}
											} else {
												@Pc(2728) Class133 local2728 = Static262.method4031(local261);
												local2682 = local35.method2852(local35.anInt3569, local35.anInt3624, local2670, local2728, Static28.aClass6_Sub6_Sub2_1.aClass149_2, local35.anInt3581);
												if (local2682 == null && Static209.aBoolean318) {
													Static155.method2392(local35);
												}
											}
											if (local2682 != null) {
												if (local35.anInt3564 > 0) {
													local517 = (local35.anInt3567 << 8) / local35.anInt3564;
												} else {
													local517 = 256;
												}
												if (local35.anInt3608 > 0) {
													local505 = (local35.anInt3595 << 8) / local35.anInt3608;
												} else {
													local505 = 256;
												}
												local546 = (local35.anInt3635 * local505 >> 8) + local35.anInt3595 / 2 + local128;
												local535 = (local35.anInt3604 * local517 >> 8) + (local123 + (local35.anInt3567 / 2));
												if (Static240.aBoolean369) {
													if (local35.aBoolean271) {
														Static240.method3792(local535, local546, local35.anInt3556, local35.aShort34, local517, local505);
													} else {
														Static240.method3784(local535, local546, local517, local505);
														Static240.method3807((float) local35.aShort33, (float) local35.aShort34 * 1.5F);
													}
													Static240.method3775();
													Static240.method3801(true);
													Static240.method3774(false);
													Static153.method2367(Static176.anInt3254);
													if (Static29.aBoolean56) {
														Static50.method869();
														Static240.method3797();
														Static50.method867(arg5, arg7, arg3, arg4);
														Static29.aBoolean56 = false;
													}
													if (local35.aBoolean273) {
														Static240.method3800();
													}
													local563 = Class135.anIntArray472[local35.anInt3577] * local35.anInt3556 >> 16;
													local579 = local35.anInt3556 * Class135.anIntArray474[local35.anInt3577] >> 16;
													if (local35.aBoolean261) {
														local2682.method2084(local35.anInt3620, local35.anInt3634, local35.anInt3577, local35.anInt3622, local501 + local563 + local35.anInt3549, local579 + local35.anInt3549, -1L);
													} else {
														local2682.method2084(local35.anInt3620, 0, local35.anInt3577, 0, local563, local579, -1L);
													}
													if (local35.aBoolean273) {
														Static240.method3808();
													}
												} else {
													Static208.method3238(local535, local546);
													local563 = local35.anInt3556 * Class135.anIntArray472[local35.anInt3577] >> 16;
													local579 = Class135.anIntArray474[local35.anInt3577] * local35.anInt3556 >> 16;
													if (!local35.aBoolean261) {
														local2682.method2084(local35.anInt3620, 0, local35.anInt3577, 0, local563, local579, -1L);
													} else if (local35.aBoolean271) {
														((Class6_Sub2_Sub1) local2682).method588(local35.anInt3620, local35.anInt3634, local35.anInt3577, local35.anInt3622, local501 + local563 + local35.anInt3549, local35.anInt3549 + local579, local35.anInt3556);
													} else {
														local2682.method2084(local35.anInt3620, local35.anInt3634, local35.anInt3577, local35.anInt3622, local501 + local563 + local35.anInt3549, local579 - -local35.anInt3549, -1L);
													}
													Static208.method3253();
												}
											}
										} else {
											if (local35.anInt3570 == 7) {
												local1936 = local35.method2856(Static211.aClass48Array2);
												if (local1936 == null) {
													if (Static209.aBoolean318) {
														Static155.method2392(local35);
													}
													continue;
												}
												local261 = 0;
												for (local468 = 0; local468 < local35.anInt3544; local468++) {
													for (local501 = 0; local501 < local35.anInt3546; local501++) {
														if (local35.anIntArray415[local261] > 0) {
															local2835 = Static183.method4458(local35.anIntArray415[local261] - 1);
															@Pc(3269) String local3269;
															if (local2835.anInt3266 != 1 && local35.anIntArray422[local261] == 1) {
																local3269 = "<col=ff9040>" + local2835.aString113 + "</col>";
															} else {
																local3269 = "<col=ff9040>" + local2835.aString113 + "</col> x" + Static128.method1973(local35.anIntArray422[local261]);
															}
															local535 = (local35.anInt3627 + 115) * local501 + local123;
															local546 = local468 * (local35.anInt3559 + 12) + local128;
															if (local35.anInt3633 == 0) {
																local1936.method4394(local3269, local535, local546, local35.anInt3550, local35.aBoolean276 ? 0 : -1);
															} else if (local35.anInt3633 == 1) {
																local1936.method4382(local3269, local535 + 57, local546, local35.anInt3550, local35.aBoolean276 ? 0 : -1);
															} else {
																local1936.method4399(local3269, local535 + 115 - 1, local546, local35.anInt3550, local35.aBoolean276 ? 0 : -1);
															}
														}
														local261++;
													}
												}
											}
											if (local35.anInt3570 == 8 && local35 == Static91.aClass127_5 && Static119.anInt4994 == Static238.anInt4934) {
												local273 = 0;
												local261 = 0;
												@Pc(3387) String local3387 = local35.aString125;
												@Pc(3389) Class1_Sub2_Sub12 local3389 = Static84.aClass1_Sub2_Sub12_2;
												local3387 = Static201.method3131(local35, local3387);
												@Pc(3412) String local3412;
												while (local3387.length() > 0) {
													local505 = local3387.indexOf("<br>");
													if (local505 == -1) {
														local3412 = local3387;
														local3387 = "";
													} else {
														local3412 = local3387.substring(0, local505);
														local3387 = local3387.substring(local505 + 4);
													}
													local535 = local3389.method4390(local3412);
													if (local535 > local273) {
														local273 = local535;
													}
													local261 += local3389.anInt5693 + 1;
												}
												local261 += 7;
												local273 += 6;
												local505 = local123 + local35.anInt3567 - local273 - 5;
												if (local505 < local123 + 5) {
													local505 = local123 + 5;
												}
												local535 = local35.anInt3595 + local128 + 5;
												if (local273 + local505 > arg3) {
													local505 = arg3 - local273;
												}
												if (arg4 < local261 + local535) {
													local535 = arg4 - local261;
												}
												if (Static240.aBoolean369) {
													Static50.method866(local505, local535, local273, local261, 16777120);
													Static50.method868(local505, local535, local273, local261, 0);
												} else {
													Static213.method3362(local505, local535, local273, local261, 16777120);
													Static213.method3370(local505, local535, local273, local261, 0);
												}
												local3387 = local35.aString125;
												local546 = local535 + local3389.anInt5693 + 2;
												local3387 = Static201.method3131(local35, local3387);
												while (local3387.length() > 0) {
													local563 = local3387.indexOf("<br>");
													if (local563 == -1) {
														local3412 = local3387;
														local3387 = "";
													} else {
														local3412 = local3387.substring(0, local563);
														local3387 = local3387.substring(local563 + 4);
													}
													local3389.method4394(local3412, local505 + 3, local546, 0, -1);
													local546 += local3389.anInt5693 + 1;
												}
											}
											if (local35.anInt3570 == 9) {
												if (local35.aBoolean278) {
													local501 = local128;
													local468 = local123 + local35.anInt3567;
													local261 = local35.anInt3595 + local128;
												} else {
													local468 = local35.anInt3567 + local123;
													local501 = local35.anInt3595 + local128;
													local261 = local128;
												}
												if (local35.anInt3558 == 1) {
													if (Static240.aBoolean369) {
														Static50.method870(local123, local261, local468, local501, local35.anInt3550);
													} else {
														Static213.method3383(local123, local261, local468, local501, local35.anInt3550);
													}
												} else if (Static240.aBoolean369) {
													Static50.method859(local123, local261, local468, local501, local35.anInt3550, local35.anInt3558);
												} else {
													Static213.method3377(local123, local261, local468, local501, local35.anInt3550, local35.anInt3558);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLclient!ak;)V")
	public static void method427(@OriginalArg(1) Class7 arg0) {
		Static270.aClass7_215 = arg0;
	}
}
