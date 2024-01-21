import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	public static int anInt772;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
	public static boolean aBoolean27;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	public static int anInt771 = 0;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!a;")
	public static Class1 aClass1_672 = Static94.method1596("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!a;")
	private static Class1 aClass1_680 = Static94.method1596("Welcome to RuneScape");

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!a;")
	public static Class1 aClass1_673 = aClass1_680;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!a;")
	public static Class1 aClass1_674 = Static94.method1596("logo");

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!a;")
	private static Class1 aClass1_676 = Static94.method1596("Use");

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!a;")
	public static Class1 aClass1_675 = aClass1_676;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	public static int anInt775 = 0;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	public static int anInt777 = 1;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	public static int anInt779 = -1;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	public static int anInt783 = 0;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Lclient!a;")
	private static Class1 aClass1_677 = Static94.method1596("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!a;")
	public static Class1 aClass1_678 = Static94.method1596("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array8 = new Class1[5];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!a;")
	public static Class1 aClass1_679 = aClass1_677;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!a;")
	public static Class1 aClass1_681 = Static94.method1596("backtop1");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII[Lclient!qd;Z)Z")
	public static boolean method496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1_Sub14[] arg8) {
		Static92.method1119(arg2, arg1, arg6, arg5);
		@Pc(8) boolean local8 = true;
		for (@Pc(10) int local10 = 0; local10 < arg8.length; local10++) {
			@Pc(16) Class2_Sub1_Sub14 local16 = arg8[local10];
			if (local16 != null && local16.anInt2174 == arg4) {
				if (local16.anInt2169 > 0) {
					Static94.method1594(local16);
				}
				@Pc(35) int local35 = arg2 + local16.anInt2180;
				if (!local16.aBoolean128) {
					local35 -= arg3;
				}
				@Pc(47) int local47 = arg1 + local16.anInt2197;
				if (!local16.aBoolean128) {
					local47 -= arg7;
				}
				@Pc(57) int local57 = local16.anInt2227;
				@Pc(126) int local126;
				@Pc(87) int local87;
				if (local16 == Static15.aClass2_Sub1_Sub14_1) {
					local57 = 128;
					@Pc(66) Class2_Sub1_Sub14 local66 = Static106.method1754(local16);
					@Pc(70) int[] local70 = Static22.method607(local66);
					@Pc(74) int[] local74 = Static22.method607(local16);
					local87 = Static84.anInt2248 + local74[1] - Static80.anInt2126 - local70[1];
					if (local87 < 0) {
						local87 = 0;
					}
					if (local87 + local16.anInt2171 > local66.anInt2171) {
						local87 = local66.anInt2171 - local16.anInt2171;
					}
					local47 = local87 + local70[1];
					local126 = Static22.anInt930 + local74[0] - Static11.anInt608 - local70[0];
					if (local126 < 0) {
						local126 = 0;
					}
					if (local126 + local16.anInt2196 > local66.anInt2196) {
						local126 = local66.anInt2196 - local16.anInt2196;
					}
					local35 = local70[0] + local126;
				}
				if (!local16.aBoolean121 || Static92.anInt1667 >= local35 && Static92.anInt1665 >= local47 && Static92.anInt1666 <= local35 + local16.anInt2196 && local47 + local16.anInt2171 >= Static92.anInt1662) {
					if (local16.anInt2192 == 0) {
						if (local16.aBoolean134 && !Static56.method1237(arg0, local10)) {
							continue;
						}
						if (!local16.aBoolean121) {
							if (local16.anInt2208 - local16.anInt2171 < local16.anInt2215) {
								local16.anInt2215 = local16.anInt2208 - local16.anInt2171;
							}
							if (local16.anInt2215 < 0) {
								local16.anInt2215 = 0;
							}
						}
						local8 &= method496(arg0, local47, local35, local16.anInt2228, local10, local16.anInt2171 + local47, local16.anInt2196 + local35, local16.anInt2215, arg8);
						if (local16.aClass2_Sub1_Sub14Array1 != null) {
							local8 &= method496(arg0, local47, local35, local16.anInt2228, local16.anInt2194, local47 + local16.anInt2171, local16.anInt2196 + local35, local16.anInt2215, local16.aClass2_Sub1_Sub14Array1);
						}
						Static92.method1119(arg2, arg1, arg6, arg5);
						if (local16.anInt2171 < local16.anInt2208) {
							Static54.method1221(local16.anInt2215, local16.anInt2208, local35 + local16.anInt2196, local16.anInt2171, local47);
						}
					}
					if (local16.anInt2192 != 1) {
						@Pc(408) int local408;
						@Pc(406) int local406;
						@Pc(439) int local439;
						@Pc(715) int local715;
						@Pc(563) int local563;
						@Pc(316) int local316;
						@Pc(318) int local318;
						@Pc(322) int local322;
						@Pc(399) int local399;
						if (local16.anInt2192 == 2) {
							local316 = 0;
							for (local318 = 0; local318 < local16.anInt2171; local318++) {
								for (local322 = 0; local322 < local16.anInt2196; local322++) {
									local126 = (local16.anInt2229 + 32) * local322 + local35;
									local87 = (local16.anInt2187 + 32) * local318 + local47;
									if (local316 < 20) {
										local126 += local16.anIntArray278[local316];
										local87 += local16.anIntArray280[local316];
									}
									if (local16.anIntArray276[local316] > 0) {
										local399 = 0;
										local406 = local16.anIntArray276[local316] - 1;
										local408 = 0;
										if (Static92.anInt1666 - 32 < local126 && local126 < Static92.anInt1667 && Static92.anInt1662 - 32 < local87 && Static92.anInt1665 > local87 || Static28.anInt1052 != 0 && Static94.anInt2364 == local316) {
											local439 = 0;
											if (Static12.anInt2645 == 1 && Static76.anInt2053 == local316 && local16.anInt2194 == Static34.anInt1276) {
												local439 = 16777215;
											}
											@Pc(464) Class2_Sub1_Sub2_Sub4 local464 = Static106.method1752(local16.anIntArray281[local316], local406, local439);
											if (local464 == null) {
												local8 = false;
											} else {
												if (Static28.anInt1052 != 0 && local316 == Static94.anInt2364 && local16.anInt2194 == Static81.anInt2133) {
													local408 = Static84.anInt2248 - Static96.anInt2421;
													local399 = Static22.anInt930 - Static107.anInt2703;
													if (local399 < 5 && local399 > -5) {
														local399 = 0;
													}
													if (local408 < 5 && local408 > -5) {
														local408 = 0;
													}
													if (Static7.anInt1196 < 5) {
														local408 = 0;
														local399 = 0;
													}
													local464.method1147(local399 + local126, local87 + local408, 128);
													if (arg4 != -1) {
														@Pc(540) Class2_Sub1_Sub14 local540 = arg8[arg4];
														if (local408 + local87 < Static92.anInt1662 && local540.anInt2215 > 0) {
															local563 = Static8.anInt509 * (Static92.anInt1662 - local87 - local408) / 3;
															if (Static8.anInt509 * 10 < local563) {
																local563 = Static8.anInt509 * 10;
															}
															if (local563 > local540.anInt2215) {
																local563 = local540.anInt2215;
															}
															local540.anInt2215 -= local563;
															Static96.anInt2421 += local563;
														}
														if (Static92.anInt1665 < local87 + local408 + 32 && local540.anInt2215 < local540.anInt2208 - local540.anInt2171) {
															local563 = Static8.anInt509 * (local87 + local408 + 32 - Static92.anInt1665) / 3;
															if (Static8.anInt509 * 10 < local563) {
																local563 = Static8.anInt509 * 10;
															}
															if (local540.anInt2208 - local540.anInt2215 - local540.anInt2171 < local563) {
																local563 = local540.anInt2208 - local540.anInt2171 - local540.anInt2215;
															}
															Static96.anInt2421 -= local563;
															local540.anInt2215 += local563;
														}
													}
												} else if (Static18.anInt841 != 0 && Static87.anInt2299 == local316 && Static57.anInt1792 == local16.anInt2194) {
													local464.method1147(local126, local87, 128);
												} else {
													local464.method1140(local126, local87);
												}
												if (local464.anInt1673 == 33 || local16.anIntArray281[local316] != 1) {
													local715 = local16.anIntArray281[local316];
													Static97.aClass2_Sub1_Sub2_Sub1_2.method375(Static83.method1520(local715), local399 + local126 + 1, local87 + 10 - -local408, 0);
													Static97.aClass2_Sub1_Sub2_Sub1_2.method375(Static83.method1520(local715), local126 + local399, local408 + (local87 - -9), 16776960);
												}
											}
										}
									} else if (local16.anIntArray279 != null && local316 < 20) {
										@Pc(383) Class2_Sub1_Sub2_Sub4 local383 = local16.method1510(local316);
										if (local383 != null) {
											local383.method1140(local126, local87);
										} else if (Static106.aBoolean154) {
											local8 = false;
										}
									}
									local316++;
								}
							}
						} else if (local16.anInt2192 == 3) {
							if (Static96.method1632(local16)) {
								local316 = local16.anInt2213;
								if (Static56.method1237(arg0, local10) && local16.anInt2185 != 0) {
									local316 = local16.anInt2185;
								}
							} else {
								local316 = local16.anInt2173;
								if (Static56.method1237(arg0, local10) && local16.anInt2207 != 0) {
									local316 = local16.anInt2207;
								}
							}
							if (local57 == 0) {
								if (local16.aBoolean123) {
									Static92.method1120(local35, local47, local16.anInt2196, local16.anInt2171, local316);
								} else {
									Static92.method1129(local35, local47, local16.anInt2196, local16.anInt2171, local316);
								}
							} else if (local16.aBoolean123) {
								Static92.method1128(local35, local47, local16.anInt2196, local16.anInt2171, local316, 256 - (local57 & 0xFF));
							} else {
								Static92.method1118(local35, local47, local16.anInt2196, local16.anInt2171, local316, 256 - (local57 & 0xFF));
							}
						} else {
							@Pc(873) Class2_Sub1_Sub2_Sub1 local873;
							if (local16.anInt2192 == 4) {
								local873 = local16.method1519();
								if (local873 != null) {
									@Pc(884) Class1 local884 = local16.aClass1_2333;
									if (Static96.method1632(local16)) {
										local318 = local16.anInt2213;
										if (Static56.method1237(arg0, local10) && local16.anInt2185 != 0) {
											local318 = local16.anInt2185;
										}
										if (local16.aClass1_2331.method10() > 0) {
											local884 = local16.aClass1_2331;
										}
									} else {
										local318 = local16.anInt2173;
										if (Static56.method1237(arg0, local10) && local16.anInt2207 != 0) {
											local318 = local16.anInt2207;
										}
									}
									if (local16.aBoolean121 && local16.anInt2206 != -1) {
										@Pc(941) Class2_Sub1_Sub17 local941 = Static73.method1374(local16.anInt2206);
										local884 = local941.aClass1_2571;
										if (local884 == null) {
											local884 = Static55.aClass1_670;
										}
										if (local941.anInt2419 == 1 || local16.anInt2218 != 1) {
											local884 = Static97.method1655(new Class1[] { local884, Static56.aClass1_1839, Static76.method1436(local16.anInt2218) });
										}
									}
									if (local16.anInt2203 == 6 && local16.anInt2194 == Static101.anInt2594) {
										local318 = local16.anInt2173;
										local884 = Static31.aClass1_1205;
									}
									if (Static92.anInt1663 == 479) {
										if (local318 == 16776960) {
											local318 = 255;
										}
										if (local318 == 49152) {
											local318 = 16777215;
										}
									}
									local884 = Static28.method736(local16, local884);
									local873.method357(local884, local35, local47, local16.anInt2196, local16.anInt2171, local318, local16.aBoolean125, local16.anInt2217, local16.anInt2204, local16.anInt2216);
								} else if (Static106.aBoolean154) {
									local8 = false;
								}
							} else {
								@Pc(1245) int local1245;
								if (local16.anInt2192 == 5) {
									@Pc(1049) Class2_Sub1_Sub2_Sub4 local1049;
									if (local16.aBoolean121) {
										local318 = 0;
										local322 = 0;
										if (local16.anInt2206 == -1) {
											local1049 = local16.method1515(false);
										} else {
											local1049 = Static106.method1752(local16.anInt2218, local16.anInt2206, 0);
											local318 = local1049.anInt1673;
											local322 = local1049.anInt1671;
											local1049.anInt1671 = 32;
											local1049.anInt1673 = 32;
										}
										if (local1049 != null) {
											local87 = local1049.anInt1669;
											local126 = local1049.anInt1670;
											if (local16.aBoolean122) {
												@Pc(1190) int[] local1190 = new int[4];
												Static92.method1125(local1190);
												local408 = local35;
												if (local1190[0] > local35) {
													local408 = local1190[0];
												}
												local406 = local47;
												if (local1190[1] > local47) {
													local406 = local1190[1];
												}
												local439 = local16.anInt2196 + local35;
												if (local1190[2] < local439) {
													local439 = local1190[2];
												}
												local1245 = local16.anInt2171 + local47;
												if (local1245 > local1190[3]) {
													local1245 = local1190[3];
												}
												Static92.method1119(local408, local406, local439, local1245);
												local715 = (local16.anInt2196 + local126 - 1) / local126;
												local563 = (local16.anInt2171 + local87 - 1) / local87;
												for (@Pc(1281) int local1281 = 0; local1281 < local715; local1281++) {
													for (@Pc(1285) int local1285 = 0; local1285 < local563; local1285++) {
														if (local16.anInt2230 != 0) {
															local1049.method1139(local126 / 2 + local1281 * local126 + local35, local87 / 2 + (local47 - -(local87 * local1285)), local16.anInt2230, 4096);
														} else if (local57 == 0) {
															local1049.method1140(local1281 * local126 + local35, local1285 * local87 + local47);
														} else {
															local1049.method1147(local35 + local1281 * local126, local47 - -(local87 * local1285), 256 - (local57 & 0xFF));
														}
													}
												}
												Static92.method1121(local1190);
											} else {
												local399 = local16.anInt2196 * 4096 / local126;
												if (local16.anInt2230 != 0) {
													local1049.method1139(local16.anInt2196 / 2 + local35, local16.anInt2171 / 2 + local47, local16.anInt2230, local399);
												} else if (local57 != 0) {
													local1049.method1135(local35, local47, local16.anInt2196, local16.anInt2171, 256 - (local57 & 0xFF));
												} else if (local126 == local16.anInt2196 && local16.anInt2171 == local87) {
													local1049.method1140(local35, local47);
												} else {
													local1049.method1151(local35, local47, local16.anInt2196, local16.anInt2171);
												}
											}
										} else if (Static106.aBoolean154) {
											local8 = false;
										}
										if (local16.anInt2206 != -1) {
											if (local16.anInt2218 != 1 || local318 == 33) {
												Static97.aClass2_Sub1_Sub2_Sub1_2.method375(Static43.method994(local16.anInt2218), local35 + 1, local47 + 10, 0);
												Static97.aClass2_Sub1_Sub2_Sub1_2.method375(Static43.method994(local16.anInt2218), local35, local47 + 9, 16776960);
											}
											local1049.anInt1673 = local318;
											local1049.anInt1671 = local322;
										}
									} else {
										local1049 = local16.method1515(Static96.method1632(local16));
										if (local1049 != null) {
											local1049.method1140(local35, local47);
										} else if (Static106.aBoolean154) {
											local8 = false;
										}
									}
								} else if (local16.anInt2192 == 6) {
									@Pc(1436) boolean local1436 = Static96.method1632(local16);
									if (local1436) {
										local318 = local16.anInt2178;
									} else {
										local318 = local16.anInt2182;
									}
									@Pc(1466) Class2_Sub1_Sub1_Sub5 local1466;
									if (local16.anInt2193 == 5) {
										if (local16.anInt2189 == 0) {
											local1466 = Static76.aClass33_2.method1243(null, null, -1, -1);
										} else {
											local1466 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.method1778();
										}
									} else if (local318 == -1) {
										local1466 = local16.method1518(null, -1, local1436, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass33_1);
										if (local1466 == null && Static106.aBoolean154) {
											local8 = false;
										}
									} else {
										@Pc(1477) Class2_Sub1_Sub9 local1477 = Static4.method192(local318);
										local1466 = local16.method1518(local1477, local16.anInt2179, local1436, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass33_1);
										if (local1466 == null && Static106.aBoolean154) {
											local8 = false;
										}
									}
									local126 = local16.anInt2195;
									local399 = local16.anInt2212;
									local406 = local16.anInt2191;
									local87 = local16.anInt2181;
									local408 = local16.anInt2221;
									local439 = local16.anInt2214;
									if (local16.anInt2206 != -1) {
										@Pc(1541) Class2_Sub1_Sub17 local1541 = Static73.method1374(local16.anInt2206);
										if (local1541 != null) {
											local1541 = local1541.method1629(local16.anInt2218);
											local1466 = local1541.method1639(true, 1);
											local399 = local1541.anInt2445;
											local406 = local1541.anInt2430;
											local408 = local1541.anInt2426;
											local126 = local1541.anInt2460;
											local439 = local1541.anInt2435;
											local87 = local1541.anInt2448;
											if (local16.anInt2196 > 0) {
												local439 = local439 * 32 / local16.anInt2196;
											}
										}
									}
									Static24.method698(local35 + local16.anInt2196 / 2, local16.anInt2171 / 2 + local47);
									local1245 = local439 * Class2_Sub1_Sub2_Sub3.anIntArray106[local126] >> 16;
									local715 = local439 * Class2_Sub1_Sub2_Sub3.anIntArray107[local126] >> 16;
									if (local1466 != null) {
										if (local16.aBoolean121) {
											local1466.method1400();
											if (local16.aBoolean129) {
												local1466.method1402(local87, local399, local126, local408, local406 + local1245 + local1466.anInt2698 / 2, local715 - -local406, local439);
											} else {
												local1466.method1413(local87, local399, local126, local408, local406 + local1466.anInt2698 / 2 + local1245, local715 + local406);
											}
										} else {
											local1466.method1413(local87, 0, local126, 0, local1245, local715);
										}
									}
									Static24.method690();
								} else {
									if (local16.anInt2192 == 7) {
										local873 = local16.method1519();
										if (local873 == null) {
											if (Static106.aBoolean154) {
												local8 = false;
											}
											continue;
										}
										local318 = 0;
										for (local322 = 0; local322 < local16.anInt2171; local322++) {
											for (local126 = 0; local126 < local16.anInt2196; local126++) {
												if (local16.anIntArray276[local318] > 0) {
													@Pc(1719) Class2_Sub1_Sub17 local1719 = Static73.method1374(local16.anIntArray276[local318] - 1);
													@Pc(1722) Class1 local1722 = local1719.aClass1_2571;
													if (local1722 == null) {
														local1722 = Static55.aClass1_670;
													}
													if (local1719.anInt2419 == 1 || local16.anIntArray281[local318] != 1) {
														local1722 = Static97.method1655(new Class1[] { local1722, Static56.aClass1_1839, Static76.method1436(local16.anIntArray281[local318]) });
													}
													local408 = local126 * (local16.anInt2229 + 115) + local35;
													local406 = local322 * (local16.anInt2187 + 12) + local47;
													if (local16.anInt2217 == 0) {
														local873.method368(local1722, local408, local406, local16.anInt2173, local16.aBoolean125);
													} else if (local16.anInt2217 == 1) {
														local873.method373(local1722, local408 + local16.anInt2196 / 2, local406, local16.anInt2173, local16.aBoolean125);
													} else {
														local873.method362(local1722, local16.anInt2196 + local408 - 1, local406, local16.anInt2173, local16.aBoolean125);
													}
												}
												local318++;
											}
										}
									}
									if (local16.anInt2192 == 8 && Static65.method1346(arg0, local10) && Static88.anInt2314 == Static1.anInt46) {
										local316 = 0;
										local318 = 0;
										@Pc(1866) Class2_Sub1_Sub2_Sub1 local1866 = Static88.aClass2_Sub1_Sub2_Sub1_1;
										@Pc(1869) Class1 local1869 = local16.aClass1_2333;
										local1869 = Static28.method736(local16, local1869);
										@Pc(1890) Class1 local1890;
										while (local1869.method10() > 0) {
											local399 = local1869.method11(Static57.aClass1_1841);
											if (local399 == -1) {
												local1890 = local1869;
												local1869 = Static111.aClass1_2898;
											} else {
												local1890 = local1869.method19(0, local399);
												local1869 = local1869.method1(local399 + 2);
											}
											local408 = local1866.method366(local1890);
											local318 += local1866.anInt562 + 1;
											if (local316 < local408) {
												local316 = local408;
											}
										}
										local318 += 7;
										local408 = local16.anInt2171 + local47 + 5;
										if (local408 + local318 > arg5) {
											local408 = arg5 - local318;
										}
										local316 += 6;
										local399 = local16.anInt2196 + local35 - local316 - 5;
										if (local399 < local35 + 5) {
											local399 = local35 + 5;
										}
										if (local316 + local399 > arg6) {
											local399 = arg6 - local316;
										}
										Static92.method1120(local399, local408, local316, local318, 16777120);
										Static92.method1129(local399, local408, local316, local318, 0);
										local1869 = local16.aClass1_2333;
										local406 = local408 + local1866.anInt562 + 2;
										local1869 = Static28.method736(local16, local1869);
										while (local1869.method10() > 0) {
											local439 = local1869.method11(Static57.aClass1_1841);
											if (local439 == -1) {
												local1890 = local1869;
												local1869 = Static111.aClass1_2898;
											} else {
												local1890 = local1869.method19(0, local439);
												local1869 = local1869.method1(local439 + 2);
											}
											local1866.method368(local1890, local399 + 3, local406, 0, false);
											local406 += local1866.anInt562 + 1;
										}
									}
									if (local16.anInt2192 == 9) {
										Static92.method1130(local35, local47, local16.anInt2196 + local35, local16.anInt2171 + local47, local16.anInt2173);
									}
								}
							}
						}
					}
				}
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!u;BI)V")
	public static void method497(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static81.aClass2_Sub3_3 == null) {
			Static43.method987(true, null, 255, 255, (byte) 0, 0);
			Static45.aClass8_Sub1Array1[arg1] = arg0;
		} else {
			Static81.aClass2_Sub3_3.anInt1168 = arg1 * 4 + 5;
			@Pc(21) int local21 = Static81.aClass2_Sub3_3.method814();
			arg0.method1712(local21);
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method498() {
		@Pc(14) int local14;
		if (Static41.anInt1403 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static41.anInt1403 > 768) {
					Static71.anIntArray216[local14] = Static64.method1326(Static85.anIntArray286[local14], Static107.anIntArray338[local14], 1024 - Static41.anInt1403);
				} else if (Static41.anInt1403 > 256) {
					Static71.anIntArray216[local14] = Static107.anIntArray338[local14];
				} else {
					Static71.anIntArray216[local14] = Static64.method1326(Static107.anIntArray338[local14], Static85.anIntArray286[local14], 256 - Static41.anInt1403);
				}
			}
		} else if (Static79.anInt2106 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static79.anInt2106 > 768) {
					Static71.anIntArray216[local14] = Static64.method1326(Static85.anIntArray286[local14], Static97.anIntArray307[local14], 1024 - Static79.anInt2106);
				} else if (Static79.anInt2106 > 256) {
					Static71.anIntArray216[local14] = Static97.anIntArray307[local14];
				} else {
					Static71.anIntArray216[local14] = Static64.method1326(Static97.anIntArray307[local14], Static85.anIntArray286[local14], 256 - Static79.anInt2106);
				}
			}
		} else {
			for (local14 = 0; local14 < 256; local14++) {
				Static71.anIntArray216[local14] = Static85.anIntArray286[local14];
			}
		}
		for (local14 = 0; local14 < 33920; local14++) {
			Static12.aClass4_61.anIntArray283[local14] = Static68.aClass2_Sub1_Sub2_Sub4_4.anIntArray170[local14];
		}
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 1152;
		@Pc(185) int local185;
		@Pc(189) int local189;
		@Pc(202) int local202;
		@Pc(209) int local209;
		@Pc(221) int local221;
		@Pc(219) int local219;
		@Pc(230) int local230;
		for (@Pc(172) int local172 = 1; local172 < 255; local172++) {
			local185 = (256 - local172) * Static27.anIntArray114[local172] / 256;
			local189 = local185 + 22;
			if (local189 < 0) {
				local189 = 0;
			}
			local168 += local189;
			for (local202 = local189; local202 < 128; local202++) {
				local209 = Static6.anIntArray42[local168++];
				if (local209 == 0) {
					local170++;
				} else {
					local219 = 256 - local209;
					local221 = local209;
					local209 = Static71.anIntArray216[local209];
					local230 = Static12.aClass4_61.anIntArray283[local170];
					Static12.aClass4_61.anIntArray283[local170++] = ((local209 & 0xFF00FF) * local221 + local219 * (local230 & 0xFF00FF) & 0xFF00FF00) + ((local230 & 0xFF00) * local219 + local221 * (local209 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local170 += local189;
		}
		local170 = 1176;
		local168 = 0;
		for (local185 = 0; local185 < 33920; local185++) {
			Static48.aClass4_33.anIntArray283[local185] = Static28.aClass2_Sub1_Sub2_Sub4_2.anIntArray170[local185];
		}
		for (local189 = 1; local189 < 255; local189++) {
			local202 = (256 - local189) * Static27.anIntArray114[local189] / 256;
			local209 = 103 - local202;
			local170 += local202;
			for (local221 = 0; local221 < local209; local221++) {
				local219 = Static6.anIntArray42[local168++];
				if (local219 == 0) {
					local170++;
				} else {
					local230 = local219;
					@Pc(347) int local347 = Static48.aClass4_33.anIntArray283[local170];
					@Pc(352) int local352 = 256 - local219;
					local219 = Static71.anIntArray216[local219];
					Static48.aClass4_33.anIntArray283[local170++] = (local230 * (local219 & 0xFF00) + local352 * (local347 & 0xFF00) & 0xFF0000) + (local352 * (local347 & 0xFF00FF) + (local219 & 0xFF00FF) * local230 & 0xFF00FF00) >> 8;
				}
			}
			local170 += 128 - local209 - local202;
			local168 += 128 - local209;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	public static void method501() {
		aClass1_674 = null;
		aClass1_679 = null;
		aClass1Array8 = null;
		aClass1_675 = null;
		aClass1_677 = null;
		aClass1_680 = null;
		aClass1_678 = null;
		aClass1_681 = null;
		aClass1_676 = null;
		aClass1_673 = null;
		aClass1_672 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)I")
	public static int method502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(16) int local16 = arg1;
			arg1 = arg3;
			arg3 = local16;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg5;
		} else if (local3 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return 7 + 1 - arg5 - arg3;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!bd;Z)V")
	public static void method503(@OriginalArg(0) Class8 arg0) {
		Static108.aClass8_27 = arg0;
		Static98.anInt2511 = Static108.aClass8_27.method1702(16);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method504() {
		Static85.aLong74 = 0L;
		Static21.aClass41_1.anInt1948 = 0;
		Static104.anInt1620 = 0;
		Static63.aBoolean102 = true;
		Static43.aBoolean73 = true;
		Static39.method1774();
		Static13.anInt654 = -1;
		Static6.aBoolean11 = false;
		Static1.anInt32 = -1;
		Static93.anInt2359 = -1;
		Static95.anInt2397 = 0;
		Static63.anInt1885 = 0;
		Static2.anInt299 = 0;
		Static59.aClass2_Sub3_Sub1_2.anInt1168 = 0;
		Static59.anInt1826 = 0;
		Static82.anInt2147 = -1;
		Static13.aClass2_Sub3_Sub1_1.anInt1168 = 0;
		Static37.anInt1346 = 0;
		Static86.method1551(0);
		for (@Pc(1741) int local1741 = 0; local1741 < 100; local1741++) {
			Static67.aClass1Array29[local1741] = null;
		}
		Static12.anInt2645 = 0;
		Static93.anInt2361 = (int) (Math.random() * 80.0D) - 40;
		Static81.anInt2132 = (int) (Math.random() * 110.0D) - 55;
		Static30.anInt1133 = 0;
		Static72.anInt1975 = (int) (Math.random() * 120.0D) - 60;
		Static7.anInt1201 = -1;
		Static44.anInt1516 = 0;
		Static31.anInt1216 = 0;
		anInt783 = 0;
		Static94.anInt2376 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static85.anInt2254 = (int) (Math.random() * 30.0D) - 20;
		Static54.anInt1771 = 0;
		Static7.anInt1194 = (int) (Math.random() * 100.0D) - 50;
		Static99.anInt2521 = 0;
		Static90.anInt2337 = 0;
		for (@Pc(1822) int local1822 = 0; local1822 < 2048; local1822++) {
			Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local1822] = null;
			Static40.aClass2_Sub3Array5[local1822] = null;
		}
		for (@Pc(1840) int local1840 = 0; local1840 < 32768; local1840++) {
			Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local1840] = null;
		}
		Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[2047] = new Class2_Sub1_Sub1_Sub1_Sub1();
		Static72.aClass46_6.method1439();
		Static93.aClass46_10.method1439();
		@Pc(1872) int local1872;
		for (@Pc(1868) int local1868 = 0; local1868 < 4; local1868++) {
			for (local1872 = 0; local1872 < 104; local1872++) {
				for (@Pc(1876) int local1876 = 0; local1876 < 104; local1876++) {
					Static15.aClass46ArrayArrayArray1[local1868][local1872][local1876] = null;
				}
			}
		}
		Static76.aClass46_7 = new Class46();
		Static51.anInt1703 = 0;
		Static21.anInt915 = 0;
		Static90.method1570(Static81.anInt2140);
		Static81.anInt2140 = -1;
		Static90.method1570(Static72.anInt1978);
		Static72.anInt1978 = -1;
		Static90.method1570(Static111.anInt2784);
		Static111.anInt2784 = -1;
		Static90.method1570(Static37.anInt1369);
		Static37.anInt1369 = -1;
		Static90.method1570(Static64.anInt1914);
		Static64.anInt1914 = -1;
		Static90.method1570(Static56.anInt1778);
		Static56.anInt1778 = -1;
		Static90.method1570(Static94.anInt2377);
		Static95.anInt2396 = 0;
		Static32.aBoolean54 = false;
		Static6.aBoolean11 = false;
		Static94.anInt2377 = -1;
		Static55.aClass1_665 = null;
		Static101.anInt2594 = -1;
		Static85.anInt2264 = -1;
		Static50.anInt1642 = 0;
		Static8.anInt514 = 3;
		Static76.aClass33_2.method1246(null, false, new int[5], -1);
		for (local1872 = 0; local1872 < 5; local1872++) {
			aClass1Array8[local1872] = null;
			Static22.aBooleanArray9[local1872] = false;
		}
		Static34.aBoolean62 = true;
	}
}
