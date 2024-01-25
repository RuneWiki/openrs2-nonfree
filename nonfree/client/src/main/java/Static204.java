import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!m", name = "K", descriptor = "I")
	public static int anInt3783;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_83 = new Class205(20, -2);

	@OriginalMember(owner = "client!m", name = "J", descriptor = "I")
	public static int anInt3782 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZIIIIIII[Lclient!ae;)V")
	public static void method3470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class4[] arg8) {
		Static111.aClass63_3.method1958(arg6, arg4, arg0, arg2);
		for (@Pc(18) int local18 = 0; local18 < arg8.length; local18++) {
			@Pc(24) Class4 local24 = arg8[local18];
			if (local24 != null && (arg1 == local24.anInt88 || arg1 == -1412584499 && Static242.aClass4_22 == local24)) {
				@Pc(47) int local47;
				if (arg5 == -1) {
					Class148.aRectangleArray2[Static86.anInt1651].setBounds(local24.anInt71 + arg7, local24.anInt48 - -arg3, local24.anInt101, local24.anInt113);
					local47 = Static86.anInt1651++;
				} else {
					local47 = arg5;
				}
				local24.anInt122 = Static253.anInt4469;
				local24.anInt90 = local47;
				if (!Static45.method788(local24)) {
					if (local24.anInt133 != 0) {
						Static360.method5256(local24);
					}
					@Pc(94) int local94 = local24.anInt71 + arg7;
					@Pc(99) int local99 = arg3 + local24.anInt48;
					@Pc(102) int local102 = local24.anInt87;
					if (Static226.aBoolean445 && (Static45.method784(local24).anInt750 != 0 || local24.anInt125 == 0) && local102 > 127) {
						local102 = 127;
					}
					@Pc(159) int local159;
					@Pc(163) int local163;
					if (Static242.aClass4_22 == local24) {
						if (arg1 != -1412584499 && (Static110.anInt2330 == local24.anInt118 || local24.anInt118 == Static283.anInt4899)) {
							Static83.aClass4Array2 = arg8;
							Static74.anInt1437 = arg3;
							Static10.anInt5866 = arg7;
							continue;
						}
						if (Static115.aBoolean190 && Static41.aBoolean62) {
							local159 = Static311.aClass129_1.method2997();
							local163 = Static311.aClass129_1.method2989();
							local159 -= Static371.anInt6283;
							local163 -= Static224.anInt3999;
							if (local159 < Static350.anInt3739) {
								local159 = Static350.anInt3739;
							}
							if (local163 < Static108.anInt5289) {
								local163 = Static108.anInt5289;
							}
							if (Static350.anInt3739 + Static102.aClass4_11.anInt101 < local24.anInt101 + local159) {
								local159 = Static102.aClass4_11.anInt101 + Static350.anInt3739 - local24.anInt101;
							}
							local94 = local159;
							if (Static108.anInt5289 + Static102.aClass4_11.anInt113 < local24.anInt113 + local163) {
								local163 = Static102.aClass4_11.anInt113 + Static108.anInt5289 - local24.anInt113;
							}
							local99 = local163;
						}
						if (local24.anInt118 == Static283.anInt4899) {
							local102 = 128;
						}
					}
					@Pc(288) int local288;
					@Pc(277) int local277;
					@Pc(245) int local245;
					@Pc(250) int local250;
					if (local24.anInt125 == 2) {
						local159 = arg6;
						local288 = arg0;
						local163 = arg4;
						local277 = arg2;
					} else {
						local245 = local24.anInt101 + local94;
						local250 = local24.anInt113 + local99;
						local159 = arg6 >= local94 ? arg6 : local94;
						if (local24.anInt125 == 9) {
							local250++;
							local245++;
						}
						local163 = local99 <= arg4 ? arg4 : local99;
						local277 = arg2 > local250 ? local250 : arg2;
						local288 = local245 < arg0 ? local245 : arg0;
					}
					if (local159 < local288 && local163 < local277) {
						@Pc(551) int local551;
						@Pc(575) int local575;
						@Pc(577) int local577;
						@Pc(499) int local499;
						@Pc(501) int local501;
						if (local24.anInt133 != 0) {
							if (local24.anInt133 == Static150.anInt2971 || local24.anInt133 == Static280.anInt4824) {
								Static28.method502(local24.anInt101, local24.anInt113, Static280.anInt4824 == local24.anInt133, local94, local99);
								Static331.aBooleanArray30[local47] = true;
								Static111.aClass63_3.method1958(arg6, arg4, arg0, arg2);
								continue;
							}
							if (Static24.anInt537 == local24.anInt133) {
								if (local24.method83(Static111.aClass63_3) != null) {
									Static271.method4164();
									Static288.method4374(local24, local94, local99, Static111.aClass63_3);
									Static51.aBooleanArray7[local47] = true;
									Static111.aClass63_3.method1958(arg6, arg4, arg0, arg2);
								}
								continue;
							}
							if (local24.anInt133 == Static86.anInt1653) {
								if (local24.method83(Static111.aClass63_3) != null) {
									Static109.method2266(local94, local99, local24);
									Static51.aBooleanArray7[local47] = true;
									Static111.aClass63_3.method1958(arg6, arg4, arg0, arg2);
								}
								continue;
							}
							if (Static193.anInt3623 == local24.anInt133) {
								Static367.method5422(local99, local24.anInt113, local94, local24.anInt101, Static329.anInterface9_6, Static111.aClass63_3);
								Static331.aBooleanArray30[local47] = true;
								Static111.aClass63_3.method1958(arg6, arg4, arg0, arg2);
								continue;
							}
							if (Static228.anInt4043 == local24.anInt133) {
								Static275.method4179(Static111.aClass63_3, local24.anInt101, local99, local94, local24.anInt113);
								Static331.aBooleanArray30[local47] = true;
								Static111.aClass63_3.method1958(arg6, arg4, arg0, arg2);
								continue;
							}
							if (local24.anInt133 == Static334.anInt5725) {
								if (!Static379.aBoolean456 && !Static57.aBoolean271) {
									continue;
								}
								local245 = local24.anInt101 + local94;
								local250 = local99 + 15;
								if (Static379.aBoolean456) {
									Static319.aClass9_3.method5049(local245, local250, "Fps:" + Static70.anInt1250, -256);
									local250 += 15;
									@Pc(490) Runtime local490 = Runtime.getRuntime();
									local499 = (int) ((local490.totalMemory() - local490.freeMemory()) / 1024L);
									local501 = -256;
									if (local499 > 65536) {
										local501 = -65536;
									}
									Static319.aClass9_3.method5049(local245, local250, "Mem:" + local499 + "k", local501);
									local250 += 15;
									Static319.aClass9_3.method5049(local245, local250, "In:" + Static173.anInt3328 + "B/s Out:" + Static18.anInt429 + "B/s", -256);
									local250 += 15;
									local551 = Static111.aClass63_3.method2018() / 1024;
									Static319.aClass9_3.method5049(local245, local250, "Offheap:" + local551 + "k", local551 > 65536 ? -65536 : -256);
									local250 += 15;
									local575 = 0;
									local577 = 0;
									@Pc(579) int local579 = 0;
									for (@Pc(581) int local581 = 0; local581 < 29; local581++) {
										local575 += Static105.aClass16_Sub1Array1[local581].method4720();
										local577 += Static105.aClass16_Sub1Array1[local581].method4724();
										local579 += Static105.aClass16_Sub1Array1[local581].method4723();
									}
									@Pc(623) int local623 = local579 * 100 / local575;
									@Pc(629) int local629 = local577 * 10000 / local575;
									@Pc(649) String local649 = "Cache:" + Static131.method2583(0, 2, (long) local629, true) + "% (" + local623 + "%)";
									Static156.aClass9_1.method5049(local245, local250, local649, -256);
									local250 += 12;
								}
								if (Static92.anInt1738 > 0) {
									Static156.aClass9_1.method5049(local245, local250, "Particles: " + Static47.anInt960 + " / " + Static92.anInt1738, -256);
								}
								local250 += 12;
								if (Static57.aBoolean271) {
									Static156.aClass9_1.method5049(local245, local250, "Polys: " + Static111.aClass63_3.method1987() + " Models: " + Static111.aClass63_3.method2043(), -256);
									local250 += 12;
									Static156.aClass9_1.method5049(local245, local250, "Ls: " + Static326.anInt5621 + " La: " + Static103.anInt2138 + " NPC: " + Static323.anInt5535 + " Pl: " + Static373.anInt6290, -256);
									Static271.method4163();
									local250 += 12;
								}
								Static331.aBooleanArray30[local47] = true;
								continue;
							}
						}
						if (local24.anInt125 == 0) {
							if (Static208.anInt3819 == local24.anInt133 && Static111.aClass63_3.method1974()) {
								Static111.aClass63_3.method2054(local94, local99, local24.anInt101, local24.anInt113);
							}
							method3470(local288, local24.anInt94, local277, local99 - local24.anInt78, local163, local47, local159, local94 - local24.anInt53, arg8);
							if (local24.aClass4Array1 != null) {
								method3470(local288, local24.anInt94, local277, local99 - local24.anInt78, local163, local47, local159, local94 - local24.anInt53, local24.aClass4Array1);
							}
							@Pc(813) Class2_Sub38 local813 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local24.anInt94);
							if (local813 != null) {
								Static349.method4158(local159, local47, local288, local94, local99, local813.anInt4976, local163, local277);
							}
							if (local24.anInt133 == Static208.anInt3819 && Static111.aClass63_3.method1974()) {
								Static111.aClass63_3.method1968();
								Static140.aBoolean211 = true;
							}
							Static111.aClass63_3.method1958(arg6, arg4, arg0, arg2);
						}
						if (Static135.aBooleanArray19[local47] || Static301.anInt5345 > 1) {
							if (local24.anInt125 == 3) {
								if (local102 == 0) {
									if (local24.aBoolean12) {
										Static111.aClass63_3.method1982(local94, local99, local24.anInt101, local24.anInt113, local24.anInt57, 0);
									} else {
										Static111.aClass63_3.method1955(local94, local99, local24.anInt101, local24.anInt113, local24.anInt57, 0);
									}
								} else if (local24.aBoolean12) {
									Static111.aClass63_3.method1982(local94, local99, local24.anInt101, local24.anInt113, local24.anInt57 & 0xFFFFFF | 255 - (local102 & 0xFF) << 24, 1);
								} else {
									Static111.aClass63_3.method1955(local94, local99, local24.anInt101, local24.anInt113, 255 - (local102 & 0xFF) << 24 | local24.anInt57 & 0xFFFFFF, 1);
								}
							} else if (local24.anInt125 == 4) {
								@Pc(953) Class9 local953 = local24.method75(Static111.aClass63_3);
								if (local953 != null) {
									local250 = local24.anInt57;
									@Pc(968) String local968 = local24.aString1;
									if (local24.anInt58 != -1) {
										@Pc(979) Class179 local979 = Static15.aClass81_1.method2175(local24.anInt58);
										local968 = local979.aString51;
										if (local968 == null) {
											local968 = "null";
										}
										if ((local979.anInt4421 == 1 || local24.anInt127 != 1) && local24.anInt127 != -1) {
											local968 = "<col=ff9040>" + local968 + "</col> x" + Static12.method255(local24.anInt127);
										}
									}
									if (local24 == Static108.aClass4_26) {
										local968 = Static359.aClass32_95.method701(Static107.anInt2498);
										local250 = local24.anInt57;
									}
									if (Static21.aBoolean35) {
										Static111.aClass63_3.method2008(local94, local99, local94 + local24.anInt101, local99 - -local24.anInt113);
									}
									local953.method5047(local24.anInt113, null, local250 | 255 - (local102 & 0xFF) << 24, 0, local99, local24.anInt95, local968, null, local24.anInt49, local24.anInt101, Static63.aClass18Array3, local24.anInt86, local24.aBoolean3 ? 255 - (local102 & 0xFF) << 24 : -1, local94, 0);
									if (Static21.aBoolean35) {
										Static111.aClass63_3.method1958(arg6, arg4, arg0, arg2);
									}
								} else if (Static145.aBoolean396) {
									Static51.method872(local24);
								}
							} else {
								@Pc(1186) int local1186;
								if (local24.anInt125 == 5) {
									if (local24.anInt130 >= 0) {
										local24.method76(Static341.aClass225_1, Static106.aClass98_1).method706(local24.anInt104 << 3, Static111.aClass63_3, local24.anInt113, 0, local99, 0, local24.anInt74 << 3, local94, local24.anInt101);
									} else {
										@Pc(1143) Class18 local1143;
										if (local24.anInt58 == -1) {
											local1143 = local24.method82(Static111.aClass63_3);
										} else {
											@Pc(1153) Class224 local1153 = local24.aBoolean14 ? Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1 : null;
											local1143 = Static15.aClass81_1.method2182(local24.anInt127, Static111.aClass63_3, local24.anInt58, local1153, local24.anInt134 | 0xFF000000, local24.anInt93, local24.anInt116);
										}
										if (local1143 != null) {
											local250 = local1143.method4564();
											local1186 = local1143.method4560();
											if (local24.aBoolean11) {
												Static111.aClass63_3.method2008(local94, local99, local24.anInt101 + local94, local99 - -local24.anInt113);
												if (local24.anInt120 != 0) {
													local499 = (local250 + local24.anInt101 - 1) / local250;
													local501 = (local1186 + local24.anInt113 - 1) / local1186;
													for (local551 = 0; local551 < local499; local551++) {
														for (local575 = 0; local575 < local501; local575++) {
															local1143.method4556((float) local250 / 2.0F + (float) (local250 * local551 + local94), (float) local1186 / 2.0F + (float) (local99 - -(local1186 * local575)), 4096, local24.anInt120);
														}
													}
												} else if (local102 == 0) {
													local1143.method4566(local94, local99, local24.anInt101, local24.anInt113, 0, 0);
												} else {
													local1143.method4566(local94, local99, local24.anInt101, local24.anInt113, 1, 255 - (local102 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static111.aClass63_3.method1958(arg6, arg4, arg0, arg2);
											} else if (local102 != 0) {
												local499 = 255 - (local102 & 0xFF) << 24 | 0xFFFFFF;
												if (local24.anInt120 != 0) {
													local1143.method4562((float) local24.anInt101 / 2.0F + (float) local94, (float) local99 + (float) local24.anInt113 / 2.0F, local24.anInt101 * 4096 / local250, local24.anInt120, local499);
												} else if (local24.anInt101 == local250 && local24.anInt113 == local1186) {
													local1143.method4557(local94, local99, 1, local499);
												} else {
													local1143.method4569(local94, local99, local24.anInt101, local24.anInt113, 1, local499, 1);
												}
											} else if (local24.anInt120 != 0) {
												local1143.method4556((float) local24.anInt101 / 2.0F + (float) local94, (float) local99 + (float) local24.anInt113 / 2.0F, local24.anInt101 * 4096 / local250, local24.anInt120);
											} else if (local24.anInt101 == local250 && local1186 == local24.anInt113) {
												local1143.method4558(local94, local99);
											} else {
												local1143.method4570(local94, local99, local24.anInt101, local24.anInt113);
											}
										} else if (Static145.aBoolean396) {
											Static51.method872(local24);
										}
									}
								} else if (local24.anInt125 == 6) {
									Static281.method4295();
									@Pc(1458) Class66 local1458 = null;
									local250 = 0;
									@Pc(1565) Class202 local1565;
									@Pc(1575) Class224 local1575;
									if (local24.anInt58 != -1) {
										@Pc(1673) Class179 local1673 = Static15.aClass81_1.method2175(local24.anInt58);
										if (local1673 != null) {
											local1673 = local1673.method3952(local24.anInt127);
											local1565 = local24.anInt124 == -1 ? null : Static36.aClass236_1.method5396(local24.anInt124);
											local1575 = local24.aBoolean14 ? Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1 : null;
											local1458 = local1673.method3953(1, local24.anInt117, 1024, Static111.aClass63_3, local24.anInt105, local24.anInt85, local1565, local1575);
											if (local1458 == null) {
												Static51.method872(local24);
											} else {
												local250 = -local1458.method5140() / 2;
											}
										}
									} else if (local24.anInt60 == 5) {
										local1186 = local24.anInt99;
										if (local1186 >= 0 && local1186 < 2048) {
											@Pc(1615) Class1_Sub5_Sub1_Sub1 local1615 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local1186];
											@Pc(1628) Class202 local1628 = local24.anInt124 == -1 ? null : Static36.aClass236_1.method5396(local24.anInt124);
											if (local1615 != null && (Static176.anInt3381 == local1186 || Static225.method3687(local1615.aString24) == local24.anInt62)) {
												local1458 = local1615.aClass224_1.method4881(Static321.aClass211_1, local1628, 0, null, local24.anInt117, Static111.aClass63_3, Static15.aClass81_1, 0, -1, 1024, local24.anInt85, Static36.aClass236_1, Static192.aClass196_1, local24.anInt105, null, Static46.aClass139_1, Static356.aClass48_2);
											}
										}
									} else if (local24.anInt60 == 8 || local24.anInt60 == 9) {
										@Pc(1552) Class2_Sub1 local1552 = Static72.method4067(local24.anInt99, false);
										local1565 = local24.anInt124 == -1 ? null : Static36.aClass236_1.method5396(local24.anInt124);
										if (local1552 != null) {
											local1575 = local24.aBoolean14 ? Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1 : null;
											local1458 = local1552.method32(local24.anInt105, local24.anInt117, local1565, local24.anInt85, local24.anInt62, local1575, local24.anInt60 == 9, Static111.aClass63_3);
										}
									} else if (local24.anInt124 == -1) {
										local1458 = local24.method69(Static46.aClass139_1, -1, Static356.aClass48_2, null, -1, Static192.aClass196_1, 0, Static111.aClass63_3, Static15.aClass81_1, Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1, 1024, Static36.aClass236_1, Static321.aClass211_1);
										if (local1458 == null && Static145.aBoolean396) {
											Static51.method872(local24);
										}
									} else {
										@Pc(1517) Class202 local1517 = Static36.aClass236_1.method5396(local24.anInt124);
										local1458 = local24.method69(Static46.aClass139_1, local24.anInt105, Static356.aClass48_2, local1517, local24.anInt85, Static192.aClass196_1, local24.anInt117, Static111.aClass63_3, Static15.aClass81_1, Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1, 1024, Static36.aClass236_1, Static321.aClass211_1);
										if (local1458 == null && Static145.aBoolean396) {
											Static51.method872(local24);
										}
									}
									if (local1458 != null) {
										if (local24.anInt81 <= 0) {
											local1186 = 512;
										} else {
											local1186 = (local24.anInt101 << 9) / local24.anInt81;
										}
										if (local24.anInt75 > 0) {
											local499 = (local24.anInt113 << 9) / local24.anInt75;
										} else {
											local499 = 512;
										}
										local501 = local24.anInt101 / 2 + local94 + (local1186 * local24.anInt55 >> 9);
										local551 = (local499 * local24.anInt126 >> 9) + local99 + local24.anInt113 / 2;
										Static18.aClass44_1.method3538();
										Static111.aClass63_3.method1961(Static18.aClass44_1);
										local575 = Class177.anIntArray843[local24.anInt112 << 3] * local24.anInt79 >> 15;
										local577 = Class177.anIntArray844[local24.anInt112 << 3] * local24.anInt79 >> 15;
										Static111.aClass63_3.method2006(local501, local551, local1186, local499);
										Static111.aClass63_3.method2030((float) local24.aShort2, local24.aBoolean18 ? (float) local24.aShort3 : (float) local24.aShort3 * 1.5F);
										if (arg1 == -1412584499 || Static140.aBoolean211) {
											Static111.aClass63_3.method1967();
											Static111.aClass63_3.method2041();
											Static111.aClass63_3.method1958(arg6, arg4, arg0, arg2);
											Static140.aBoolean211 = false;
										}
										if (local24.aBoolean13) {
											Static111.aClass63_3.method2053(false);
										}
										Static348.aClass44_5.method3539(-local24.anInt61 << 3);
										Static348.aClass44_5.method3531(local24.anInt103 << 3);
										Static348.aClass44_5.method3527(local24.anInt123, local250 + local575 + local24.anInt115, local24.anInt115 + local577);
										Static348.aClass44_5.method3533(local24.anInt112 << 3);
										if (Static21.aBoolean35) {
											Static111.aClass63_3.method2008(local94, local99, local94 + local24.anInt101, local24.anInt113 + local99);
										}
										if (local24.aBoolean18) {
											local1458.method5162(Static348.aClass44_5, null, local24.anInt79);
										} else {
											local1458.method5126(Static348.aClass44_5, null, 1);
										}
										if (Static21.aBoolean35) {
											Static111.aClass63_3.method1958(arg6, arg4, arg0, arg2);
										}
										if (local24.aBoolean13) {
											Static111.aClass63_3.method2053(true);
										}
									}
								} else if (local24.anInt125 == 9) {
									if (local24.aBoolean7) {
										local250 = local99 + local24.anInt113;
										local1186 = local94 + local24.anInt101;
										local499 = local99;
									} else {
										local1186 = local94 + local24.anInt101;
										local499 = local99 + local24.anInt113;
										local250 = local99;
									}
									if (local24.anInt84 == 1) {
										Static111.aClass63_3.method1976(local94, local250, local1186, local499, local24.anInt57, 0);
									} else {
										Static111.aClass63_3.method1963(local94, local250, local1186, local499, local24.anInt57, local24.anInt84);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3471(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([BIIB)I")
	public static int method3472(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(15) int local15 = arg2; local15 < arg1; local15++) {
			local5 = Class87.anIntArray463[(local5 ^ arg0[local15]) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}
}
