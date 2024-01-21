import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "Lclient!gd;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!db", name = "O", descriptor = "Lclient!sf;")
	public static Class66 aClass66_9 = new Class66(64);

	@OriginalMember(owner = "client!db", name = "S", descriptor = "[[S")
	public static short[][] aShortArrayArray2 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!db", name = "U", descriptor = "Lclient!he;")
	public static Class26 aClass26_414 = Static6.method100("leuchten3:");

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "Lclient!he;")
	public static Class26 aClass26_415 = Static6.method100("");

	@OriginalMember(owner = "client!db", name = "fb", descriptor = "Lclient!he;")
	public static Class26 aClass26_416 = Static6.method100("Untersuchen");

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "Lclient!sf;")
	public static Class66 aClass66_10 = new Class66(260);

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "Lclient!he;")
	public static Class26 aClass26_417 = aClass26_415;

	@OriginalMember(owner = "client!db", name = "rb", descriptor = "Lclient!he;")
	private static Class26 aClass26_419 = Static6.method100("Loaded fonts");

	@OriginalMember(owner = "client!db", name = "nb", descriptor = "Lclient!he;")
	public static Class26 aClass26_418 = aClass26_419;

	@OriginalMember(owner = "client!db", name = "sb", descriptor = "Lclient!he;")
	public static Class26 aClass26_420 = Static6.method100("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II[Lclient!nc;)V")
	public static void method487(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub14[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class3_Sub14 local13 = arg1[local7];
			if (local13 != null && arg0 == local13.anInt2159 && (!local13.aBoolean113 || !Static88.method1628(local13))) {
				if (local13.anInt2204 == 0) {
					if (!local13.aBoolean113 && Static88.method1628(local13) && local13 != Static53.aClass3_Sub14_4) {
						continue;
					}
					method487(local13.anInt2154, arg1);
					if (local13.aClass3_Sub14Array2 != null) {
						method487(local13.anInt2154, local13.aClass3_Sub14Array2);
					}
					@Pc(64) Class3_Sub17 local64 = (Class3_Sub17) Static52.aClass17_9.method599((long) local13.anInt2154);
					if (local64 != null) {
						Static21.method476(local64.anInt2552);
					}
				}
				if (local13.anInt2204 == 6) {
					@Pc(94) int local94;
					if (local13.anInt2176 != -1 || local13.anInt2155 != -1) {
						@Pc(89) boolean local89 = Static57.method1143(local13);
						if (local89) {
							local94 = local13.anInt2155;
						} else {
							local94 = local13.anInt2176;
						}
						if (local94 != -1) {
							@Pc(107) Class3_Sub1_Sub17 local107 = Static111.method2009(local94);
							local13.anInt2196 += Static42.anInt1304;
							while (local107.anIntArray374[local13.anInt2144] < local13.anInt2196) {
								local13.anInt2196 -= local107.anIntArray374[local13.anInt2144];
								local13.anInt2144++;
								if (local13.anInt2144 >= local107.anIntArray377.length) {
									local13.anInt2144 -= local107.anInt3109;
									if (local13.anInt2144 < 0 || local107.anIntArray377.length <= local13.anInt2144) {
										local13.anInt2144 = 0;
									}
								}
								Static110.method2004(local13);
							}
						}
					}
					if (local13.anInt2198 != 0 && !local13.aBoolean113) {
						@Pc(191) int local191 = local13.anInt2198 >> 16;
						@Pc(195) int local195 = local191 * Static42.anInt1304;
						local13.anInt2179 = local195 + local13.anInt2179 & 0x7FF;
						local94 = local13.anInt2198 << 16 >> 16;
						local94 *= Static42.anInt1304;
						local13.anInt2192 = local94 + local13.anInt2192 & 0x7FF;
						Static110.method2004(local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V")
	public static void method488(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class3_Sub16 local18 = (Class3_Sub16) Static105.aClass17_19.method598(); local18 != null; local18 = (Class3_Sub16) Static105.aClass17_19.method597()) {
			if ((local18.aLong100 >> 48 & 0xFFFFL) == (long) arg0) {
				local18.method2201();
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III[Lclient!nc;IIIII)V")
	public static void method489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub14[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(12) int local12 = 0; local12 < arg3.length; local12++) {
			@Pc(18) Class3_Sub14 local18 = arg3[local12];
			if (local18 != null && (!local18.aBoolean113 || local18.anInt2204 == 0 || local18.aBoolean119 || Static89.method1641(local18) != 0 || local18 == Static96.aClass3_Sub14_14) && local18.anInt2159 == arg7 && (!local18.aBoolean113 || !Static88.method1628(local18))) {
				@Pc(55) int local55 = arg1 + local18.anInt2178;
				@Pc(60) int local60 = local18.anInt2158 + arg0;
				if (Static109.aClass3_Sub14_15 == local18) {
					Static54.anInt1628 = local60;
					Static31.anInt2746 = local55;
					Static93.aBoolean140 = true;
				}
				@Pc(88) int local88;
				@Pc(116) int local116;
				@Pc(105) int local105;
				@Pc(132) int local132;
				@Pc(149) int local149;
				if (local18.anInt2204 == 2) {
					local116 = arg2;
					local132 = arg5;
					local105 = arg4;
					local88 = arg6;
				} else {
					@Pc(94) int local94;
					@Pc(121) int local121;
					if (local18.anInt2204 == 9) {
						local94 = local60;
						@Pc(141) int local141 = local18.anInt2146 + local60;
						local121 = local55;
						local149 = local55 + local18.anInt2161;
						if (local60 > local141) {
							local94 = local141;
							local141 = local60;
						}
						if (local149 < local55) {
							local121 = local149;
							local149 = local55;
						}
						local149++;
						local141++;
						local105 = arg4 <= local141 ? arg4 : local141;
						local116 = arg2 < local121 ? local121 : arg2;
						local132 = arg5 > local149 ? local149 : arg5;
						local88 = local94 <= arg6 ? arg6 : local94;
					} else {
						local88 = local60 > arg6 ? local60 : arg6;
						local94 = local60 + local18.anInt2146;
						local105 = arg4 <= local94 ? arg4 : local94;
						local116 = local55 <= arg2 ? arg2 : local55;
						local121 = local18.anInt2161 + local55;
						local132 = arg5 <= local121 ? arg5 : local121;
					}
				}
				if (!local18.aBoolean113 || local88 < local105 && local132 > local116) {
					if (local18.anInt2186 == 1337) {
						Static110.method2004(local18);
					} else if (local18.anInt2186 == 1338) {
						Static64.method1263(local55, local60);
					} else {
						if (local18.anInt2204 == 0) {
							if (!local18.aBoolean113 && Static88.method1628(local18) && Static53.aClass3_Sub14_4 != local18) {
								continue;
							}
							method489(local60 - local18.anInt2189, local55 - local18.anInt2193, local116, arg3, local105, local132, local88, local18.anInt2154);
							if (local18.aClass3_Sub14Array2 != null) {
								method489(local60 - local18.anInt2189, local55 - local18.anInt2193, local116, local18.aClass3_Sub14Array2, local105, local132, local88, local18.anInt2154);
							}
							@Pc(311) Class3_Sub17 local311 = (Class3_Sub17) Static52.aClass17_9.method599((long) local18.anInt2154);
							if (local311 != null) {
								Static9.method136(local60, local105, local311.anInt2552, local55, local132, local116, local88);
							}
						}
						if (local18.aBoolean113) {
							@Pc(340) boolean local340;
							if (Static59.anInt1807 >= local88 && local116 <= Static7.anInt187 && local105 > Static59.anInt1807 && local132 > Static7.anInt187) {
								local340 = true;
							} else {
								local340 = false;
							}
							@Pc(346) boolean local346 = false;
							if (Static102.anInt2770 == 1 && local88 <= Static59.anInt1803 && local116 <= Static19.anInt514 && local105 > Static59.anInt1803 && Static19.anInt514 < local132) {
								local346 = true;
							}
							@Pc(379) boolean local379 = false;
							if (Static21.anInt826 == 1 && local340) {
								local379 = true;
							}
							if (local346) {
								Static4.method66(Static19.anInt514 - local55, -local60 + Static59.anInt1803, local18);
							}
							if (Static109.aClass3_Sub14_15 != null && Static109.aClass3_Sub14_15 != local18 && local340 && Static11.method171(Static89.method1641(local18))) {
								Static91.aClass3_Sub14_13 = local18;
							}
							if (Static96.aClass3_Sub14_14 == local18) {
								Static3.anInt92 = local60;
								Static43.anInt2683 = local55;
								Static54.aBoolean86 = true;
							}
							if (local18.aBoolean119) {
								@Pc(439) Class3_Sub15 local439;
								if (local340 && Static6.anInt162 != 0 && local18.anObjectArray12 != null) {
									local439 = new Class3_Sub15();
									local439.aClass3_Sub14_11 = local18;
									local439.anInt2357 = Static6.anInt162;
									local439.anObjectArray28 = local18.anObjectArray12;
									Static5.aClass65_81.method1955(local439);
								}
								if (Static109.aClass3_Sub14_15 != null || Static6.aClass3_Sub14_1 != null || Static109.aBoolean162) {
									local340 = false;
									local346 = false;
									local379 = false;
								}
								if (!local18.aBoolean109 && local346) {
									local18.aBoolean109 = true;
									if (local18.anObjectArray11 != null) {
										local439 = new Class3_Sub15();
										local439.anInt2352 = Static59.anInt1803 - local60;
										local439.anInt2357 = Static19.anInt514 - local55;
										local439.aClass3_Sub14_11 = local18;
										local439.anObjectArray28 = local18.anObjectArray11;
										Static5.aClass65_81.method1955(local439);
									}
								}
								if (local18.aBoolean109 && local379 && local18.anObjectArray19 != null) {
									local439 = new Class3_Sub15();
									local439.anObjectArray28 = local18.anObjectArray19;
									local439.aClass3_Sub14_11 = local18;
									local439.anInt2352 = Static59.anInt1807 - local60;
									local439.anInt2357 = Static7.anInt187 - local55;
									Static5.aClass65_81.method1955(local439);
								}
								if (local18.aBoolean109 && !local379) {
									local18.aBoolean109 = false;
									if (local18.anObjectArray24 != null) {
										local439 = new Class3_Sub15();
										local439.anObjectArray28 = local18.anObjectArray24;
										local439.aClass3_Sub14_11 = local18;
										local439.anInt2357 = Static7.anInt187 - local55;
										local439.anInt2352 = Static59.anInt1807 - local60;
										Static29.aClass65_22.method1955(local439);
									}
								}
								if (local379 && local18.anObjectArray18 != null) {
									local439 = new Class3_Sub15();
									local439.anObjectArray28 = local18.anObjectArray18;
									local439.anInt2357 = Static7.anInt187 - local55;
									local439.aClass3_Sub14_11 = local18;
									local439.anInt2352 = Static59.anInt1807 - local60;
									Static5.aClass65_81.method1955(local439);
								}
								if (!local18.aBoolean115 && local340) {
									local18.aBoolean115 = true;
									if (local18.anObjectArray27 != null) {
										local439 = new Class3_Sub15();
										local439.anInt2357 = Static7.anInt187 - local55;
										local439.aClass3_Sub14_11 = local18;
										local439.anInt2352 = Static59.anInt1807 - local60;
										local439.anObjectArray28 = local18.anObjectArray27;
										Static5.aClass65_81.method1955(local439);
									}
								}
								if (local18.aBoolean115 && local340 && local18.anObjectArray20 != null) {
									local439 = new Class3_Sub15();
									local439.aClass3_Sub14_11 = local18;
									local439.anObjectArray28 = local18.anObjectArray20;
									local439.anInt2357 = Static7.anInt187 - local55;
									local439.anInt2352 = Static59.anInt1807 - local60;
									Static5.aClass65_81.method1955(local439);
								}
								if (local18.aBoolean115 && !local340) {
									local18.aBoolean115 = false;
									if (local18.anObjectArray14 != null) {
										local439 = new Class3_Sub15();
										local439.anObjectArray28 = local18.anObjectArray14;
										local439.anInt2352 = Static59.anInt1807 - local60;
										local439.aClass3_Sub14_11 = local18;
										local439.anInt2357 = Static7.anInt187 - local55;
										Static29.aClass65_22.method1955(local439);
									}
								}
								if (local18.anObjectArray16 != null) {
									local439 = new Class3_Sub15();
									local439.aClass3_Sub14_11 = local18;
									local439.anObjectArray28 = local18.anObjectArray16;
									Static23.aClass65_33.method1955(local439);
								}
								@Pc(780) int local780;
								@Pc(782) int local782;
								@Pc(798) Class3_Sub15 local798;
								if (local18.anObjectArray26 != null && Static125.anInt3205 > local18.anInt2137) {
									if (local18.anIntArray220 == null || Static125.anInt3205 - local18.anInt2137 > 32) {
										local439 = new Class3_Sub15();
										local439.anObjectArray28 = local18.anObjectArray26;
										local439.aClass3_Sub14_11 = local18;
										Static5.aClass65_81.method1955(local439);
									} else {
										label367: for (local149 = local18.anInt2137; local149 < Static125.anInt3205; local149++) {
											local780 = Static42.anIntArray141[local149 & 0x1F];
											for (local782 = 0; local782 < local18.anIntArray220.length; local782++) {
												if (local780 == local18.anIntArray220[local782]) {
													local798 = new Class3_Sub15();
													local798.aClass3_Sub14_11 = local18;
													local798.anObjectArray28 = local18.anObjectArray26;
													Static5.aClass65_81.method1955(local798);
													break label367;
												}
											}
										}
									}
									local18.anInt2137 = Static125.anInt3205;
								}
								if (local18.anObjectArray8 != null && Static16.anInt418 > local18.anInt2135) {
									if (local18.anIntArray218 == null || Static16.anInt418 - local18.anInt2135 > 32) {
										local439 = new Class3_Sub15();
										local439.anObjectArray28 = local18.anObjectArray8;
										local439.aClass3_Sub14_11 = local18;
										Static5.aClass65_81.method1955(local439);
									} else {
										label347: for (local149 = local18.anInt2135; local149 < Static16.anInt418; local149++) {
											local780 = Static2.anIntArray2[local149 & 0x1F];
											for (local782 = 0; local782 < local18.anIntArray218.length; local782++) {
												if (local18.anIntArray218[local782] == local780) {
													local798 = new Class3_Sub15();
													local798.aClass3_Sub14_11 = local18;
													local798.anObjectArray28 = local18.anObjectArray8;
													Static5.aClass65_81.method1955(local798);
													break label347;
												}
											}
										}
									}
									local18.anInt2135 = Static16.anInt418;
								}
								if (local18.anObjectArray15 != null && local18.anInt2156 < Static121.anInt3170) {
									if (local18.anIntArray217 == null || Static121.anInt3170 - local18.anInt2156 > 32) {
										local439 = new Class3_Sub15();
										local439.anObjectArray28 = local18.anObjectArray15;
										local439.aClass3_Sub14_11 = local18;
										Static5.aClass65_81.method1955(local439);
									} else {
										label327: for (local149 = local18.anInt2156; local149 < Static121.anInt3170; local149++) {
											local780 = Static66.anIntArray295[local149 & 0x1F];
											for (local782 = 0; local782 < local18.anIntArray217.length; local782++) {
												if (local18.anIntArray217[local782] == local780) {
													local798 = new Class3_Sub15();
													local798.aClass3_Sub14_11 = local18;
													local798.anObjectArray28 = local18.anObjectArray15;
													Static5.aClass65_81.method1955(local798);
													break label327;
												}
											}
										}
									}
									local18.anInt2156 = Static121.anInt3170;
								}
								if (Static110.anInt2935 > local18.anInt2195 && local18.anObjectArray13 != null) {
									local439 = new Class3_Sub15();
									local439.anObjectArray28 = local18.anObjectArray13;
									local439.aClass3_Sub14_11 = local18;
									Static5.aClass65_81.method1955(local439);
								}
								if (local18.anInt2195 < Static3.anInt81 && local18.anObjectArray23 != null) {
									local439 = new Class3_Sub15();
									local439.anObjectArray28 = local18.anObjectArray23;
									local439.aClass3_Sub14_11 = local18;
									Static5.aClass65_81.method1955(local439);
								}
								if (local18.anInt2195 < Static43.anInt2689 && local18.anObjectArray25 != null) {
									local439 = new Class3_Sub15();
									local439.aClass3_Sub14_11 = local18;
									local439.anObjectArray28 = local18.anObjectArray25;
									Static5.aClass65_81.method1955(local439);
								}
								if (local18.anInt2195 < Static67.anInt2791 && local18.anObjectArray17 != null) {
									local439 = new Class3_Sub15();
									local439.anObjectArray28 = local18.anObjectArray17;
									local439.aClass3_Sub14_11 = local18;
									Static5.aClass65_81.method1955(local439);
								}
								local18.anInt2195 = Static71.anInt2023;
								if (local18.anObjectArray3 != null) {
									for (local149 = 0; local149 < Static125.anInt3203; local149++) {
										@Pc(1132) Class3_Sub15 local1132 = new Class3_Sub15();
										local1132.aClass3_Sub14_11 = local18;
										local1132.anInt2354 = Static81.anIntArray227[local149];
										local1132.anInt2358 = Static81.anIntArray225[local149];
										local1132.anObjectArray28 = local18.anObjectArray3;
										Static5.aClass65_81.method1955(local1132);
									}
								}
							}
						}
						if (!local18.aBoolean113) {
							if (Static109.aClass3_Sub14_15 != null || Static6.aClass3_Sub14_1 != null || Static109.aBoolean162) {
								return;
							}
							if ((local18.anInt2133 >= 0 || local18.anInt2168 != 0) && Static59.anInt1807 >= local88 && local116 <= Static7.anInt187 && Static59.anInt1807 < local105 && local132 > Static7.anInt187) {
								if (local18.anInt2133 >= 0) {
									Static53.aClass3_Sub14_4 = arg3[local18.anInt2133];
								} else {
									Static53.aClass3_Sub14_4 = local18;
								}
							}
							if (local18.anInt2204 == 8 && local88 <= Static59.anInt1807 && Static7.anInt187 >= local116 && local105 > Static59.anInt1807 && local132 > Static7.anInt187) {
								Static71.aClass3_Sub14_6 = local18;
							}
							if (local18.anInt2161 < local18.anInt2172) {
								Static5.method2205(Static59.anInt1807, local60 + local18.anInt2146, local18.anInt2172, local18.anInt2161, local18, local55, Static7.anInt187);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
	public static void method490() {
		aClass26_418 = null;
		aClass66_9 = null;
		aShortArrayArray2 = null;
		aClass26_416 = null;
		aClass26_415 = null;
		aClass26_417 = null;
		aClass22_1 = null;
		aClass66_10 = null;
		aClass26_414 = null;
		aClass26_419 = null;
		aClass26_420 = null;
	}
}
