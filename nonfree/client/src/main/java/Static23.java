import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
	public static int anInt757;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "[I")
	public static int[] anIntArray55;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Z")
	public static boolean method428() {
		return Static143.anInt3473 == 0 ? Static13.aClass1_Sub4_Sub2_1.method1241() : true;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIII[Lclient!se;)V")
	public static void method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class122[] arg8) {
		Static189.method3190(arg4, arg1, arg3, arg5);
		Static235.method3902();
		for (@Pc(9) int local9 = 0; local9 < arg8.length; local9++) {
			@Pc(15) Class122 local15 = arg8[local9];
			if (local15 != null && (local15.anInt4703 == arg2 || arg2 == -1412584499 && local15 == Static63.aClass122_7)) {
				@Pc(64) int local64;
				if (arg7 == -1) {
					Static141.anIntArray178[Static255.anInt5426] = arg6 + local15.anInt4711;
					Static165.anIntArray291[Static255.anInt5426] = arg0 + local15.anInt4691;
					Static67.anIntArray143[Static255.anInt5426] = local15.anInt4695;
					Static76.anIntArray156[Static255.anInt5426] = local15.anInt4726;
					local64 = Static255.anInt5426++;
				} else {
					local64 = arg7;
				}
				local15.anInt4697 = Static156.anInt3722;
				local15.anInt4671 = local64;
				if (!local15.aBoolean228 || !Static39.method707(local15)) {
					if (local15.anInt4672 > 0) {
						Static38.method664(local15);
					}
					@Pc(91) int local91 = arg6 + local15.anInt4711;
					@Pc(96) int local96 = arg0 + local15.anInt4691;
					@Pc(99) int local99 = local15.anInt4689;
					if (Static70.aBoolean113 && (Static39.method702(local15).anInt4836 != 0 || local15.anInt4656 == 0) && local99 > 127) {
						local99 = 127;
					}
					@Pc(141) int local141;
					@Pc(143) int local143;
					if (local15 == Static63.aClass122_7) {
						if (arg2 != -1412584499 && !local15.aBoolean232) {
							Static26.anInt709 = arg6;
							Static169.aClass122Array1 = arg8;
							Static123.anInt1278 = arg0;
							continue;
						}
						if (Static255.aBoolean276 && Static66.aBoolean102) {
							local141 = Static71.anInt1930;
							local143 = Static240.anInt5167;
							local143 -= Static181.anInt4153;
							local141 -= Static198.anInt4594;
							if (local141 < Static143.anInt3477) {
								local141 = Static143.anInt3477;
							}
							if (Static143.anInt3477 + Static37.aClass122_2.anInt4695 < local141 - -local15.anInt4695) {
								local141 = Static37.aClass122_2.anInt4695 + Static143.anInt3477 - local15.anInt4695;
							}
							if (Static138.anInt3358 > local143) {
								local143 = Static138.anInt3358;
							}
							if (Static37.aClass122_2.anInt4726 + Static138.anInt3358 < local143 - -local15.anInt4726) {
								local143 = Static138.anInt3358 + Static37.aClass122_2.anInt4726 - local15.anInt4726;
							}
							local91 = local141;
							local96 = local143;
						}
						if (!local15.aBoolean232) {
							local99 = 128;
						}
					}
					@Pc(230) int local230;
					@Pc(228) int local228;
					@Pc(251) int local251;
					@Pc(239) int local239;
					if (local15.anInt4656 == 2) {
						local141 = arg4;
						local228 = arg5;
						local230 = arg3;
						local143 = arg1;
					} else {
						local239 = local15.anInt4726 + local96;
						local143 = local96 > arg1 ? local96 : arg1;
						local251 = local15.anInt4695 + local91;
						local141 = local91 <= arg4 ? arg4 : local91;
						if (local15.anInt4656 == 9) {
							local251++;
							local239++;
						}
						local228 = arg5 <= local239 ? arg5 : local239;
						local230 = arg3 <= local251 ? arg3 : local251;
					}
					if (!local15.aBoolean228 || local141 < local230 && local143 < local228) {
						@Pc(411) int local411;
						@Pc(453) int local453;
						@Pc(499) int local499;
						@Pc(488) int local488;
						@Pc(514) int local514;
						@Pc(531) int local531;
						@Pc(806) int local806;
						@Pc(457) int local457;
						@Pc(461) int local461;
						if (local15.anInt4672 != 0) {
							if (local15.anInt4672 == 1337 || local15.anInt4672 == 1403) {
								Static205.aClass122_15 = local15;
								Static147.anInt3576 = local96;
								Static224.anInt4924 = local91;
								Static128.method2423(local15.anInt4672 == 1403, local96, local15.anInt4726, local15.anInt4695, local91);
								Static198.aBooleanArray19[local64] = true;
								Static189.method3190(arg4, arg1, arg3, arg5);
								continue;
							}
							if (local15.anInt4672 == 1338) {
								if (!local15.method3525()) {
									continue;
								}
								Static151.method2716(local96, local64, local91, local15);
								Static189.method3190(arg4, arg1, arg3, arg5);
								if (Static121.anInt3108 != 0 && Static121.anInt3108 != 3 || Static259.aBoolean280 || local141 > Static221.anInt4838 || local143 > Static242.anInt5237 || Static221.anInt4838 >= local230 || local228 <= Static242.anInt5237) {
									continue;
								}
								local251 = Static221.anInt4838 - local91;
								local239 = Static242.anInt5237 - local96;
								local411 = local15.anIntArray378[local239];
								if (local251 < local411 || local411 + local15.anIntArray372[local239] < local251) {
									continue;
								}
								local239 -= local15.anInt4726 / 2;
								local251 -= local15.anInt4695 / 2;
								local453 = (int) Static230.aFloat51 + Static83.anInt2232 & 0x7FF;
								local457 = Class132.anIntArray439[local453];
								local461 = Class132.anIntArray440[local453];
								local461 = (Static44.anInt1333 + 256) * local461 >> 8;
								local457 = local457 * (Static44.anInt1333 + 256) >> 8;
								local488 = local239 * local457 - local461 * local251 >> 11;
								local499 = local461 * local239 + local251 * local457 >> 11;
								local514 = Static83.aClass9_Sub1_Sub1_1.anInt427 + local499 + 64 - Static83.aClass9_Sub1_Sub1_1.method208() * 64 >> 7;
								local531 = Static83.aClass9_Sub1_Sub1_1.anInt479 + 64 - local488 - Static83.aClass9_Sub1_Sub1_1.method208() * 64 >> 7;
								if (Static88.aBoolean138 && (Static8.anInt152 & 0x40) != 0) {
									@Pc(567) Class122 local567 = Static106.method2192(Static161.anInt3798, Static167.anInt3917);
									if (local567 == null) {
										Static263.method4206();
									} else {
										Static199.method3319(Static167.anInt3914, 1L, local514, Static106.aString183, " ->", (short) 43, local531);
									}
									continue;
								}
								if (Static68.anInt1404 == 1) {
									Static199.method3319(-1, 1L, local514, Static253.aString244, "", (short) 49, local531);
								}
								Static199.method3319(-1, 1L, local514, Static208.aString315, "", (short) 9, local531);
								continue;
							}
							if (local15.anInt4672 == 1339) {
								if (local15.method3525()) {
									Static125.method2398(local15, local64, local96, local91);
									Static189.method3190(arg4, arg1, arg3, arg5);
								}
								continue;
							}
							if (local15.anInt4672 == 1400) {
								Static118.method2344(local91, local96, local15.anInt4695, local15.anInt4726);
								Static198.aBooleanArray19[local64] = true;
								Static186.aBooleanArray17[local64] = true;
								Static189.method3190(arg4, arg1, arg3, arg5);
								continue;
							}
							if (local15.anInt4672 == 1401) {
								Static22.method2180(local15.anInt4726, local91, local96, local15.anInt4695);
								Static198.aBooleanArray19[local64] = true;
								Static186.aBooleanArray17[local64] = true;
								Static189.method3190(arg4, arg1, arg3, arg5);
								continue;
							}
							if (local15.anInt4672 == 1402) {
								Static168.method2916(local91, local96);
								Static198.aBooleanArray19[local64] = true;
								Static186.aBooleanArray17[local64] = true;
								continue;
							}
							if (local15.anInt4672 == 1405) {
								if (!Static266.aBoolean282) {
									continue;
								}
								local251 = local91 + local15.anInt4695;
								local239 = local96 + 15;
								Static63.aClass1_Sub2_Sub7_1.method1927("Fps:" + Static43.anInt1294, local251, local239, 16776960, -1);
								local239 += 15;
								@Pc(720) Runtime local720 = Runtime.getRuntime();
								local457 = 0;
								local461 = 16776960;
								local488 = 0;
								local499 = 0;
								local453 = (int) ((local720.totalMemory() - local720.freeMemory()) / 1024L);
								if (local453 > 65536) {
									local461 = 16711680;
								}
								Static63.aClass1_Sub2_Sub7_1.method1927("Mem:" + local453 + "k", local251, local239, local461, -1);
								local239 += 15;
								for (local514 = 0; local514 < 29; local514++) {
									local457 += Static157.aClass17_Sub1Array1[local514].method2197();
									local499 += Static157.aClass17_Sub1Array1[local514].method2191();
									local488 += Static157.aClass17_Sub1Array1[local514].method2193();
								}
								local531 = local488 * 100 / local457;
								local806 = local499 * 10000 / local457;
								@Pc(826) String local826 = "Cache:" + Static69.method1320(0, true, (long) local806, 2) + "% (" + local531 + "%)";
								Static244.aClass1_Sub2_Sub7_3.method1927(local826, local251, local239, 16776960, -1);
								Static198.aBooleanArray19[local64] = true;
								Static186.aBooleanArray17[local64] = true;
								local239 += 12;
								continue;
							}
							if (local15.anInt4672 == 1406) {
								Static30.anInt922 = local96;
								Static99.anInt2714 = local91;
								Static73.aClass122_8 = local15;
								continue;
							}
						}
						if (!Static259.aBoolean280) {
							if (local15.anInt4656 == 0 && local15.aBoolean243 && local141 <= Static221.anInt4838 && local143 <= Static242.anInt5237 && local230 > Static221.anInt4838 && local228 > Static242.anInt5237 && !Static70.aBoolean113) {
								Static8.aStringArray3[0] = Static47.aString78;
								Static174.aStringArray33[0] = "";
								Static57.aShortArray26[0] = 1007;
								Static170.anIntArray299[0] = Static266.anInt5558;
								Static230.anInt5417 = 1;
							}
							if (local141 <= Static221.anInt4838 && Static242.anInt5237 >= local143 && Static221.anInt4838 < local230 && Static242.anInt5237 < local228) {
								Static66.method1297(local15, Static242.anInt5237 - local96, -local91 + Static221.anInt4838);
							}
						}
						if (local15.anInt4656 == 0) {
							if (!local15.aBoolean228 && Static39.method707(local15) && local15 != Static155.aClass122_11) {
								continue;
							}
							if (!local15.aBoolean228) {
								if (local15.anInt4715 - local15.anInt4726 < local15.anInt4653) {
									local15.anInt4653 = local15.anInt4715 - local15.anInt4726;
								}
								if (local15.anInt4653 < 0) {
									local15.anInt4653 = 0;
								}
							}
							method429(local96 - local15.anInt4653, local143, local15.anInt4686, local230, local141, local228, local91 - local15.anInt4673, local64, arg8);
							if (local15.aClass122Array2 != null) {
								method429(local96 - local15.anInt4653, local143, local15.anInt4686, local230, local141, local228, local91 - local15.anInt4673, local64, local15.aClass122Array2);
							}
							@Pc(1035) Class1_Sub5 local1035 = (Class1_Sub5) Static204.aClass140_13.method4014((long) local15.anInt4686);
							if (local1035 != null) {
								if (local1035.anInt1355 == 0 && !Static259.aBoolean280 && local141 <= Static221.anInt4838 && local143 <= Static242.anInt5237 && Static221.anInt4838 < local230 && local228 > Static242.anInt5237 && !Static70.aBoolean113) {
									Static57.aShortArray26[0] = 1007;
									Static8.aStringArray3[0] = Static47.aString78;
									Static230.anInt5417 = 1;
									Static174.aStringArray33[0] = "";
									Static170.anIntArray299[0] = Static266.anInt5558;
								}
								Static213.method3510(local1035.anInt1358, local96, local64, local228, local91, local143, local141, local230);
							}
							Static189.method3190(arg4, arg1, arg3, arg5);
							Static235.method3902();
						}
						if (Static93.aBooleanArray6[local64] || Static242.anInt5228 > 1) {
							if (local15.anInt4656 == 0 && !local15.aBoolean228 && local15.anInt4726 < local15.anInt4715) {
								Static254.method4104(local15.anInt4695 + local91, local15.anInt4715, local96, local15.anInt4653, local15.anInt4726);
							}
							if (local15.anInt4656 != 1) {
								if (local15.anInt4656 == 2) {
									local251 = 0;
									for (local239 = 0; local239 < local15.anInt4683; local239++) {
										for (local411 = 0; local411 < local15.anInt4650; local411++) {
											local453 = local91 + local411 * (local15.anInt4732 + 32);
											local461 = local96 + local239 * (local15.anInt4722 + 32);
											if (local251 < 20) {
												local461 += local15.anIntArray361[local251];
												local453 += local15.anIntArray377[local251];
											}
											if (local15.anIntArray362[local251] > 0) {
												local488 = local15.anIntArray362[local251] - 1;
												if (arg4 < local453 + 32 && arg3 > local453 && local461 + 32 > arg1 && local461 < arg5 || local15 == Static156.aClass122_12 && local251 == Static241.anInt5183) {
													@Pc(1271) Class1_Sub2_Sub4 local1271;
													if (Static183.anInt5174 == 1 && Static98.anInt2704 == local251 && Static77.anInt2096 == local15.anInt4686) {
														local1271 = Static79.method1584(2, local488, 0, local15.anIntArray360[local251], null, local15.aBoolean237);
													} else {
														local1271 = Static79.method1584(1, local488, 3153952, local15.anIntArray360[local251], null, local15.aBoolean237);
													}
													if (Static235.aBoolean259) {
														Static198.aBooleanArray19[local64] = true;
													}
													if (local1271 == null) {
														Static257.method4146(local15);
													} else if (local15 == Static156.aClass122_12 && Static241.anInt5183 == local251) {
														local457 = Static71.anInt1930 - Static95.anInt2635;
														if (local457 < 5 && local457 > -5) {
															local457 = 0;
														}
														local499 = Static240.anInt5167 - Static2.anInt37;
														if (local499 < 5 && local499 > -5) {
															local499 = 0;
														}
														if (Static96.anInt2666 < 5) {
															local457 = 0;
															local499 = 0;
														}
														local1271.method889(local453 + local457, local461 + local499, 128);
														if (arg2 != -1) {
															@Pc(1388) Class122 local1388 = arg8[arg2 & 0xFFFF];
															local806 = Static189.anInt4231;
															@Pc(1392) int local1392 = Static189.anInt4233;
															@Pc(1410) int local1410;
															if (local806 > local461 + local499 && local1388.anInt4653 > 0) {
																local1410 = Static37.anInt999 * (local806 - local461 - local499) / 3;
																if (Static37.anInt999 * 10 < local1410) {
																	local1410 = Static37.anInt999 * 10;
																}
																if (local1410 > local1388.anInt4653) {
																	local1410 = local1388.anInt4653;
																}
																Static2.anInt37 += local1410;
																local1388.anInt4653 -= local1410;
																Static257.method4146(local1388);
															}
															if (local1392 < local461 + local499 + 32 && local1388.anInt4715 - local1388.anInt4726 > local1388.anInt4653) {
																local1410 = (local461 + local499 + 32 - local1392) * Static37.anInt999 / 3;
																if (local1410 > Static37.anInt999 * 10) {
																	local1410 = Static37.anInt999 * 10;
																}
																if (local1388.anInt4715 - local1388.anInt4653 - local1388.anInt4726 < local1410) {
																	local1410 = local1388.anInt4715 - local1388.anInt4653 - local1388.anInt4726;
																}
																Static2.anInt37 -= local1410;
																local1388.anInt4653 += local1410;
																Static257.method4146(local1388);
															}
														}
													} else if (local15 == Static42.aClass122_3 && local251 == Static86.anInt2434) {
														local1271.method889(local453, local461, 128);
													} else {
														local1271.method892(local453, local461);
													}
												}
											} else if (local15.anIntArray376 != null && local251 < 20) {
												@Pc(1541) Class1_Sub2_Sub4 local1541 = local15.method3528(local251);
												if (local1541 != null) {
													local1541.method892(local453, local461);
												} else if (Static99.aBoolean147) {
													Static257.method4146(local15);
												}
											}
											local251++;
										}
									}
								} else if (local15.anInt4656 == 3) {
									if (Static75.method1472(local15)) {
										local251 = local15.anInt4687;
										if (Static155.aClass122_11 == local15 && local15.anInt4692 != 0) {
											local251 = local15.anInt4692;
										}
									} else {
										local251 = local15.anInt4719;
										if (Static155.aClass122_11 == local15 && local15.anInt4712 != 0) {
											local251 = local15.anInt4712;
										}
									}
									if (local99 == 0) {
										if (local15.aBoolean236) {
											Static189.method3193(local91, local96, local15.anInt4695, local15.anInt4726, local251);
										} else {
											Static189.method3185(local91, local96, local15.anInt4695, local15.anInt4726, local251);
										}
									} else if (local15.aBoolean236) {
										Static189.method3187(local91, local96, local15.anInt4695, local15.anInt4726, local251, 256 - (local99 & 0xFF));
									} else {
										Static189.method3201(local91, local96, local15.anInt4695, local15.anInt4726, local251, 256 - (local99 & 0xFF));
									}
								} else {
									@Pc(1680) Class1_Sub2_Sub7 local1680;
									if (local15.anInt4656 == 4) {
										local1680 = local15.method3517(Static33.aClass7Array5);
										if (local1680 != null) {
											@Pc(1694) String local1694 = local15.aString329;
											if (Static75.method1472(local15)) {
												local239 = local15.anInt4687;
												if (Static155.aClass122_11 == local15 && local15.anInt4692 != 0) {
													local239 = local15.anInt4692;
												}
												if (local15.aString333.length() > 0) {
													local1694 = local15.aString333;
												}
											} else {
												local239 = local15.anInt4719;
												if (local15 == Static155.aClass122_11 && local15.anInt4712 != 0) {
													local239 = local15.anInt4712;
												}
											}
											if (local15.aBoolean228 && local15.anInt4682 != -1) {
												@Pc(1752) Class89 local1752 = Static93.method2006(local15.anInt4682);
												local1694 = local1752.aString235;
												if (local1694 == null) {
													local1694 = "null";
												}
												if ((local1752.anInt3650 == 1 || local15.anInt4707 != 1) && local15.anInt4707 != -1) {
													local1694 = "<col=ff9040>" + local1694 + "</col> x" + Static266.method4217(local15.anInt4707);
												}
											}
											if (Static58.aClass122_6 == local15) {
												local239 = local15.anInt4719;
												local1694 = Static18.aString24;
											}
											if (!local15.aBoolean228) {
												local1694 = Static164.method2858(local1694, local15);
											}
											local1680.method1930(local1694, local91, local96, local15.anInt4695, local15.anInt4726, local239, local15.aBoolean229 ? 0 : -1, local15.anInt4710, local15.anInt4640, local15.anInt4702);
										} else if (Static99.aBoolean147) {
											Static257.method4146(local15);
										}
									} else if (local15.anInt4656 == 5) {
										@Pc(1873) Class1_Sub2_Sub4 local1873;
										if (!local15.aBoolean228) {
											local1873 = local15.method3530(Static75.method1472(local15));
											if (local1873 != null) {
												local1873.method892(local91, local96);
											} else if (Static99.aBoolean147) {
												Static257.method4146(local15);
											}
										} else if (local15.anInt4648 >= 0) {
											@Pc(2138) Class95 local2138 = local15.method3531();
											local2138.method2829(0, local91, local96, local15.anInt4695, local15.anInt4726, local15.anInt4728, local15.anInt4705);
										} else {
											if (local15.anInt4682 == -1) {
												local1873 = local15.method3530(false);
											} else if (local15.aBoolean235 && Static83.aClass9_Sub1_Sub1_1.aClass94_1 != null) {
												local1873 = Static79.method1584(local15.anInt4677, local15.anInt4682, local15.anInt4667, local15.anInt4707, Static83.aClass9_Sub1_Sub1_1.aClass94_1, local15.aBoolean237);
											} else {
												local1873 = Static79.method1584(local15.anInt4677, local15.anInt4682, local15.anInt4667, local15.anInt4707, null, local15.aBoolean237);
											}
											if (local1873 != null) {
												local239 = local1873.anInt1289;
												local411 = local1873.anInt1280;
												if (local15.aBoolean231) {
													local461 = (local411 + local15.anInt4726 - 1) / local411;
													local453 = (local15.anInt4695 + local239 - 1) / local239;
													Static189.method3182(local91, local96, local91 + local15.anInt4695, local96 + local15.anInt4726);
													for (local457 = 0; local457 < local453; local457++) {
														for (local499 = 0; local499 < local461; local499++) {
															if (local15.anInt4642 != 0) {
																local1873.method890(local91 + local239 * local457 + local239 / 2, 4096, local411 / 2 + local96 + local411 * local499, local15.anInt4642);
															} else if (local99 == 0) {
																local1873.method892(local91 + local457 * local239, local96 + local411 * local499);
															} else {
																local1873.method889(local91 + local239 * local457, local96 + local411 * local499, 256 - (local99 & 0xFF));
															}
														}
													}
													Static189.method3190(arg4, arg1, arg3, arg5);
												} else {
													local453 = local15.anInt4695 * 4096 / local239;
													if (local15.anInt4642 != 0) {
														local1873.method890(local15.anInt4695 / 2 + local91, local453, local96 + local15.anInt4726 / 2, local15.anInt4642);
													} else if (local99 != 0) {
														local1873.method894(local91, local96, local15.anInt4695, local15.anInt4726, 256 - (local99 & 0xFF));
													} else if (local15.anInt4695 == local239 && local15.anInt4726 == local411) {
														local1873.method892(local91, local96);
													} else {
														local1873.method887(local91, local96, local15.anInt4695, local15.anInt4726);
													}
												}
											} else if (Static99.aBoolean147) {
												Static257.method4146(local15);
											}
										}
									} else {
										@Pc(2208) Class89 local2208;
										if (local15.anInt4656 == 6) {
											@Pc(2182) Class9_Sub5 local2182 = null;
											local453 = 0;
											@Pc(2188) boolean local2188 = Static75.method1472(local15);
											if (local2188) {
												local239 = local15.anInt4655;
											} else {
												local239 = local15.anInt4680;
											}
											if (local15.anInt4682 != -1) {
												local2208 = Static93.method2006(local15.anInt4682);
												if (local2208 != null) {
													local2208 = local2208.method2741(local15.anInt4707);
													@Pc(2225) Class49 local2225 = local239 == -1 ? null : Static131.method697(local239);
													if (local15.aBoolean235 && Static83.aClass9_Sub1_Sub1_1.aClass94_1 != null) {
														local2182 = local2208.method2740(local2225, local15.anInt4647, local15.anInt4675, 1, Static83.aClass9_Sub1_Sub1_1.aClass94_1, local15.anInt4666);
													} else {
														local2182 = local2208.method2740(local2225, local15.anInt4647, local15.anInt4675, 1, null, local15.anInt4666);
													}
													if (local2182 == null) {
														Static257.method4146(local15);
													} else {
														local453 = -local2182.method3587() / 2;
													}
												}
											} else if (local15.anInt4651 == 5) {
												if (local15.anInt4676 == -1) {
													local2182 = Static76.aClass94_2.method2825(0, -1, -1, null, null, null, 0, -1, -1);
												} else {
													local461 = local15.anInt4676 & 0x7FF;
													if (Static243.anInt5251 == local461) {
														local461 = 2047;
													}
													@Pc(2349) Class9_Sub1_Sub1 local2349 = Static147.aClass9_Sub1_Sub1Array1[local461];
													@Pc(2359) Class49 local2359 = local239 == -1 ? null : Static131.method697(local239);
													if (local2349 != null && (int) Static93.method2008(local2349.aString12) << 11 == (local15.anInt4676 & 0xFFFFF800)) {
														local2182 = local2349.aClass94_1.method2825(0, -1, 0, local2359, null, null, 0, local15.anInt4675, -1);
													}
												}
											} else if (local239 == -1) {
												local2182 = local15.method3520(-1, null, -1, local2188, Static83.aClass9_Sub1_Sub1_1.aClass94_1, 0);
												if (local2182 == null && Static99.aBoolean147) {
													Static257.method4146(local15);
												}
											} else {
												@Pc(2287) Class49 local2287 = Static131.method697(local239);
												local2182 = local15.method3520(local15.anInt4647, local2287, local15.anInt4675, local2188, Static83.aClass9_Sub1_Sub1_1.aClass94_1, local15.anInt4666);
												if (local2182 == null && Static99.aBoolean147) {
													Static257.method4146(local15);
												}
											}
											if (local2182 != null) {
												if (local15.anInt4706 <= 0) {
													local461 = 256;
												} else {
													local461 = (local15.anInt4695 << 8) / local15.anInt4706;
												}
												if (local15.anInt4681 > 0) {
													local457 = (local15.anInt4726 << 8) / local15.anInt4681;
												} else {
													local457 = 256;
												}
												local499 = (local15.anInt4698 * local461 >> 8) + local91 + local15.anInt4695 / 2;
												local488 = local15.anInt4726 / 2 + local96 + (local457 * local15.anInt4645 >> 8);
												Static235.method3900(local499, local488);
												local514 = Class132.anIntArray440[local15.anInt4660] * local15.anInt4644 >> 16;
												local531 = Class132.anIntArray439[local15.anInt4660] * local15.anInt4644 >> 16;
												if (!local15.aBoolean228) {
													local2182.method3604(local15.anInt4661, 0, local15.anInt4660, 0, local514, local531, -1L);
												} else if (local15.aBoolean244) {
													((Class9_Sub5_Sub1) local2182).method3635(local15.anInt4661, local15.anInt4700, local15.anInt4660, local15.anInt4684, local453 + local514 + local15.anInt4657, local15.anInt4657 + local531, local15.anInt4644);
												} else {
													local2182.method3604(local15.anInt4661, local15.anInt4700, local15.anInt4660, local15.anInt4684, local15.anInt4657 + local514 + local453, local531 + local15.anInt4657, -1L);
												}
												Static235.method3893();
											}
										} else {
											if (local15.anInt4656 == 7) {
												local1680 = local15.method3517(Static33.aClass7Array5);
												if (local1680 == null) {
													if (Static99.aBoolean147) {
														Static257.method4146(local15);
													}
													continue;
												}
												local239 = 0;
												for (local411 = 0; local411 < local15.anInt4683; local411++) {
													for (local453 = 0; local453 < local15.anInt4650; local453++) {
														if (local15.anIntArray362[local239] > 0) {
															local2208 = Static93.method2006(local15.anIntArray362[local239] - 1);
															@Pc(2641) String local2641;
															if (local2208.anInt3650 != 1 && local15.anIntArray360[local239] == 1) {
																local2641 = "<col=ff9040>" + local2208.aString235 + "</col>";
															} else {
																local2641 = "<col=ff9040>" + local2208.aString235 + "</col> x" + Static266.method4217(local15.anIntArray360[local239]);
															}
															local499 = local453 * (local15.anInt4732 + 115) + local91;
															local488 = (local15.anInt4722 + 12) * local411 + local96;
															if (local15.anInt4710 == 0) {
																local1680.method1940(local2641, local499, local488, local15.anInt4719, local15.aBoolean229 ? 0 : -1);
															} else if (local15.anInt4710 == 1) {
																local1680.method1923(local2641, local499 + 57, local488, local15.anInt4719, local15.aBoolean229 ? 0 : -1);
															} else {
																local1680.method1927(local2641, local499 + 115 - 1, local488, local15.anInt4719, local15.aBoolean229 ? 0 : -1);
															}
														}
														local239++;
													}
												}
											}
											if (local15.anInt4656 == 8 && Static20.aClass122_1 == local15 && Static53.anInt1470 == Static179.anInt4089) {
												local251 = 0;
												local239 = 0;
												@Pc(2773) Class1_Sub2_Sub7 local2773 = Static63.aClass1_Sub2_Sub7_1;
												@Pc(2776) String local2776 = local15.aString329;
												local2776 = Static164.method2858(local2776, local15);
												@Pc(2796) String local2796;
												while (local2776.length() > 0) {
													local457 = local2776.indexOf("<br>");
													if (local457 == -1) {
														local2796 = local2776;
														local2776 = "";
													} else {
														local2796 = local2776.substring(0, local457);
														local2776 = local2776.substring(local457 + 4);
													}
													local499 = local2773.method1922(local2796);
													if (local251 < local499) {
														local251 = local499;
													}
													local239 += local2773.anInt2509 + 1;
												}
												local251 += 6;
												local239 += 7;
												local457 = local91 + local15.anInt4695 - local251 - 5;
												local499 = local15.anInt4726 + local96 + 5;
												if (local499 + local239 > arg5) {
													local499 = arg5 - local239;
												}
												if (local91 + 5 > local457) {
													local457 = local91 + 5;
												}
												if (arg3 < local251 + local457) {
													local457 = arg3 - local251;
												}
												Static189.method3193(local457, local499, local251, local239, 16777120);
												Static189.method3185(local457, local499, local251, local239, 0);
												local488 = local2773.anInt2509 + local499 + 2;
												local2776 = local15.aString329;
												local2776 = Static164.method2858(local2776, local15);
												while (local2776.length() > 0) {
													local514 = local2776.indexOf("<br>");
													if (local514 == -1) {
														local2796 = local2776;
														local2776 = "";
													} else {
														local2796 = local2776.substring(0, local514);
														local2776 = local2776.substring(local514 + 4);
													}
													local2773.method1940(local2796, local457 + 3, local488, 0, -1);
													local488 += local2773.anInt2509 + 1;
												}
											}
											if (local15.anInt4656 == 9) {
												if (local15.aBoolean242) {
													local411 = local15.anInt4695 + local91;
													local453 = local96;
													local239 = local96 + local15.anInt4726;
												} else {
													local411 = local15.anInt4695 + local91;
													local453 = local96 + local15.anInt4726;
													local239 = local96;
												}
												if (local15.anInt4718 == 1) {
													Static189.method3181(local91, local239, local411, local453, local15.anInt4719);
												} else {
													Static189.method3186(local91, local239, local411, local453, local15.anInt4719, local15.anInt4718);
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

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)Z")
	public static boolean method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static127.method2420(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static252.method4076(local10 + 1, Static38.anIntArrayArrayArray6[arg0][arg1][arg2] + arg3, local14 + 1) && Static252.method4076(local10 + 128 - 1, Static38.anIntArrayArrayArray6[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static252.method4076(local10 + 128 - 1, Static38.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static252.method4076(local10 + 1, Static38.anIntArrayArrayArray6[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
