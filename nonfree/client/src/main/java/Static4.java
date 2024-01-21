import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "cb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ac", name = "db", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!ac", name = "Z", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ac", name = "mb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_63 = Static193.method3027("Please try again)3");

	@OriginalMember(owner = "client!ac", name = "bb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_60 = aClass70_63;

	@OriginalMember(owner = "client!ac", name = "hb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_61 = Static193.method3027("sl_button");

	@OriginalMember(owner = "client!ac", name = "kb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_62 = Static193.method3027(":assistreq:");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZILclient!kh;)V")
	public static void method61(@OriginalArg(1) int arg0, @OriginalArg(2) Class52_Sub1 arg1) {
		if (Static193.aClass3_Sub4_7 == null) {
			Static163.method2435(null, 0, 255, true, (byte) 0, 255);
			Static51.aClass52_Sub1Array1[arg0] = arg1;
		} else {
			Static193.aClass3_Sub4_7.anInt1758 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static193.aClass3_Sub4_7.method1245();
			@Pc(20) int local20 = Static193.aClass3_Sub4_7.method1245();
			arg1.method1589(local20, local16);
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(BI)I")
	public static int method62(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[Lclient!b;IIBIIII)V")
	public static void method63(@OriginalArg(0) int arg0, @OriginalArg(1) Class6[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(21) Class6 local21 = arg1[local7];
			if (local21 != null && (!local21.aBoolean21 || local21.anInt250 == 0 || local21.aBoolean20 || Static157.method2365(local21) != 0 || Static87.aClass6_119 == local21 || local21.anInt274 == 1338) && arg0 == local21.anInt198 && (!local21.aBoolean21 || !Static103.method1468(local21))) {
				@Pc(71) int local71 = arg2 + local21.anInt236;
				@Pc(77) int local77 = local21.anInt219 + arg7;
				@Pc(92) int local92;
				@Pc(99) int local99;
				@Pc(122) int local122;
				@Pc(133) int local133;
				if (local21.anInt250 == 2) {
					local133 = arg3;
					local122 = arg5;
					local99 = arg4;
					local92 = arg6;
				} else {
					local92 = local71 > arg6 ? local71 : arg6;
					local99 = local77 > arg4 ? local77 : arg4;
					@Pc(104) int local104 = local21.anInt244 + local71;
					@Pc(109) int local109 = local21.anInt217 + local77;
					if (local21.anInt250 == 9) {
						local109++;
						local104++;
					}
					local122 = local104 >= arg5 ? arg5 : local104;
					local133 = arg3 > local109 ? local109 : arg3;
				}
				if (Static154.aClass6_83 == local21) {
					Static82.anInt1628 = local71;
					Static123.anInt2476 = local77;
					Static86.aBoolean94 = true;
				}
				if (!local21.aBoolean21 || local122 > local92 && local133 > local99) {
					if (local21.anInt250 == 0) {
						if (!local21.aBoolean21 && Static103.method1468(local21) && Static85.aClass6_51 != local21) {
							continue;
						}
						if (local21.aBoolean12 && local92 <= Static8.anInt187 && Static167.anInt3403 >= local99 && local122 > Static8.anInt187 && local133 > Static167.anInt3403) {
							for (@Pc(211) Class3_Sub26 local211 = (Class3_Sub26) Static109.aClass10_63.method267(); local211 != null; local211 = (Class3_Sub26) Static109.aClass10_63.method268()) {
								if (local211.aBoolean186) {
									local211.method3320();
								}
							}
							for (@Pc(231) Class3_Sub26 local231 = (Class3_Sub26) Static208.aClass10_70.method267(); local231 != null; local231 = (Class3_Sub26) Static208.aClass10_70.method268()) {
								if (local231.aBoolean186) {
									local231.method3320();
								}
							}
							Static197.aBoolean180 = false;
							if (Static23.anInt464 == 0) {
								Static87.aClass6_119 = null;
								Static154.aClass6_83 = null;
							}
						}
					}
					if (local21.aBoolean21) {
						@Pc(283) boolean local283;
						if (Static8.anInt187 >= local92 && Static167.anInt3403 >= local99 && local122 > Static8.anInt187 && local133 > Static167.anInt3403) {
							local283 = true;
						} else {
							local283 = false;
						}
						@Pc(289) boolean local289 = false;
						if (Static202.anInt4135 == 1 && local283) {
							local289 = true;
						}
						@Pc(300) boolean local300 = false;
						if (Static15.anInt343 == 1 && local92 <= Static124.anInt3874 && local99 <= Static96.anInt2006 && local122 > Static124.anInt3874 && Static96.anInt2006 < local133) {
							local300 = true;
						}
						if (local300) {
							Static107.method2402(Static96.anInt2006 - local77, -local71 + Static124.anInt3874, local21);
						}
						if (Static154.aClass6_83 != null && Static154.aClass6_83 != local21 && local283 && Static5.method93(Static157.method2365(local21))) {
							Static98.aClass6_55 = local21;
						}
						if (Static87.aClass6_119 == local21) {
							Static47.aBoolean55 = true;
							Static79.anInt1587 = local77;
							Static109.anInt2187 = local71;
						}
						if (local21.aBoolean20 || local21.anInt274 != 0) {
							@Pc(381) Class3_Sub26 local381;
							if (local283 && Static136.anInt2779 != 0 && local21.anObjectArray1 != null) {
								local381 = new Class3_Sub26();
								local381.anInt4144 = Static136.anInt2779;
								local381.anObjectArray29 = local21.anObjectArray1;
								local381.aBoolean186 = true;
								local381.aClass6_116 = local21;
								Static109.aClass10_63.method261(local381);
							}
							if (Static154.aClass6_83 != null || Static55.aClass6_32 != null || Static134.aBoolean131 || local21.anInt274 != 1400 && Static197.aBoolean180) {
								local300 = false;
								local283 = false;
								local289 = false;
							}
							if (local21.anInt274 == 1337) {
								Static9.method237(local21);
								continue;
							}
							if (local21.anInt274 == 1338) {
								if (local300) {
									Static61.method940(local21, Static124.anInt3874 - local71, -local77 + Static96.anInt2006);
								}
								continue;
							}
							@Pc(504) int local504;
							@Pc(481) int local481;
							if (local21.anInt274 == 1400) {
								Static58.aClass6_35 = local21;
								if (local300) {
									if (Static81.aBooleanArray4[82] && Static89.anInt652 > 0) {
										local481 = Static156.anInt3196 + (int) ((double) (Static124.anInt3874 - local21.anInt244 / 2 - local71) * 2.0D / Static87.aDouble115) + Static157.anInt3260;
										local504 = Static115.anInt2318 + Static50.anInt1046 - (int) ((double) (Static96.anInt2006 - local77 - local21.anInt217 / 2) * 2.0D / Static87.aDouble115) - Static1.anInt1794;
										@Pc(557) Class70 local557 = Static207.method3296(new Class70[] { Static6.aClass70_83, Static107.method2404(local481 >> 6), Static136.aClass70_1286, Static107.method2404(local504 >> 6), Static136.aClass70_1286, Static107.method2404(local481 & 0x3F), Static136.aClass70_1286, Static107.method2404(local504 & 0x3F) });
										local557.method2052();
										Static124.method2991(local557);
										Static26.method468();
										continue;
									}
									Static208.anInt2643 = Static8.anInt187;
									Static10.anInt282 = Static156.anInt3196;
									Static108.anInt2196 = Static167.anInt3403;
									Static43.anInt906 = Static1.anInt1794;
									Static197.aBoolean180 = true;
									continue;
								}
								if (local289 && Static197.aBoolean180) {
									Static21.method346(Static10.anInt282 + (int) ((double) (Static208.anInt2643 - Static8.anInt187) * 2.0D / Static178.aDouble94));
									Static60.method2386(Static43.anInt906 + (int) ((double) (Static108.anInt2196 - Static167.anInt3403) * 2.0D / Static178.aDouble94));
									continue;
								}
								Static197.aBoolean180 = false;
								continue;
							}
							if (local21.anInt274 == 1401) {
								if (local289) {
									Static39.method667(Static167.anInt3403 - local77, Static8.anInt187 + -local71, local21.anInt217, local21.anInt244);
								}
								continue;
							}
							if (!local21.aBoolean22 && local300) {
								local21.aBoolean22 = true;
								if (local21.anObjectArray16 != null) {
									local381 = new Class3_Sub26();
									local381.aClass6_116 = local21;
									local381.aBoolean186 = true;
									local381.anInt4146 = Static124.anInt3874 - local71;
									local381.anObjectArray29 = local21.anObjectArray16;
									local381.anInt4144 = Static96.anInt2006 - local77;
									Static109.aClass10_63.method261(local381);
								}
							}
							if (local21.aBoolean22 && local289 && local21.anObjectArray17 != null) {
								local381 = new Class3_Sub26();
								local381.anInt4146 = Static8.anInt187 - local71;
								local381.anObjectArray29 = local21.anObjectArray17;
								local381.anInt4144 = Static167.anInt3403 - local77;
								local381.aClass6_116 = local21;
								local381.aBoolean186 = true;
								Static109.aClass10_63.method261(local381);
							}
							if (local21.aBoolean22 && !local289) {
								local21.aBoolean22 = false;
								if (local21.anObjectArray15 != null) {
									local381 = new Class3_Sub26();
									local381.aClass6_116 = local21;
									local381.anInt4144 = Static167.anInt3403 - local77;
									local381.aBoolean186 = true;
									local381.anObjectArray29 = local21.anObjectArray15;
									local381.anInt4146 = Static8.anInt187 - local71;
									Static208.aClass10_70.method261(local381);
								}
							}
							if (local289 && local21.anObjectArray5 != null) {
								local381 = new Class3_Sub26();
								local381.anInt4144 = Static167.anInt3403 - local77;
								local381.aClass6_116 = local21;
								local381.anInt4146 = Static8.anInt187 - local71;
								local381.anObjectArray29 = local21.anObjectArray5;
								local381.aBoolean186 = true;
								Static109.aClass10_63.method261(local381);
							}
							if (!local21.aBoolean17 && local283) {
								local21.aBoolean17 = true;
								if (local21.anObjectArray4 != null) {
									local381 = new Class3_Sub26();
									local381.aClass6_116 = local21;
									local381.anInt4146 = Static8.anInt187 - local71;
									local381.anObjectArray29 = local21.anObjectArray4;
									local381.anInt4144 = Static167.anInt3403 - local77;
									local381.aBoolean186 = true;
									Static109.aClass10_63.method261(local381);
								}
							}
							if (local21.aBoolean17 && local283 && local21.anObjectArray6 != null) {
								local381 = new Class3_Sub26();
								local381.anInt4146 = Static8.anInt187 - local71;
								local381.anObjectArray29 = local21.anObjectArray6;
								local381.aClass6_116 = local21;
								local381.anInt4144 = Static167.anInt3403 - local77;
								local381.aBoolean186 = true;
								Static109.aClass10_63.method261(local381);
							}
							if (local21.aBoolean17 && !local283) {
								local21.aBoolean17 = false;
								if (local21.anObjectArray20 != null) {
									local381 = new Class3_Sub26();
									local381.anObjectArray29 = local21.anObjectArray20;
									local381.aBoolean186 = true;
									local381.aClass6_116 = local21;
									local381.anInt4144 = Static167.anInt3403 - local77;
									local381.anInt4146 = Static8.anInt187 - local71;
									Static208.aClass10_70.method261(local381);
								}
							}
							if (local21.anObjectArray14 != null) {
								local381 = new Class3_Sub26();
								local381.anObjectArray29 = local21.anObjectArray14;
								local381.aClass6_116 = local21;
								Static174.aClass10_97.method261(local381);
							}
							@Pc(982) int local982;
							@Pc(998) Class3_Sub26 local998;
							if (local21.anObjectArray10 != null && local21.anInt275 < Static49.anInt1001) {
								if (local21.anIntArray12 == null || Static49.anInt1001 - local21.anInt275 > 32) {
									local381 = new Class3_Sub26();
									local381.anObjectArray29 = local21.anObjectArray10;
									local381.aClass6_116 = local21;
									Static109.aClass10_63.method261(local381);
								} else {
									label424: for (local481 = local21.anInt275; local481 < Static49.anInt1001; local481++) {
										local504 = Static184.anIntArray324[local481 & 0x1F];
										for (local982 = 0; local982 < local21.anIntArray12.length; local982++) {
											if (local504 == local21.anIntArray12[local982]) {
												local998 = new Class3_Sub26();
												local998.anObjectArray29 = local21.anObjectArray10;
												local998.aClass6_116 = local21;
												Static109.aClass10_63.method261(local998);
												break label424;
											}
										}
									}
								}
								local21.anInt275 = Static49.anInt1001;
							}
							if (local21.anObjectArray23 != null && local21.anInt203 < Static101.anInt2070) {
								if (local21.anIntArray16 == null || Static101.anInt2070 - local21.anInt203 > 32) {
									local381 = new Class3_Sub26();
									local381.anObjectArray29 = local21.anObjectArray23;
									local381.aClass6_116 = local21;
									Static109.aClass10_63.method261(local381);
								} else {
									label400: for (local481 = local21.anInt203; local481 < Static101.anInt2070; local481++) {
										local504 = Static157.anIntArray237[local481 & 0x1F];
										for (local982 = 0; local982 < local21.anIntArray16.length; local982++) {
											if (local21.anIntArray16[local982] == local504) {
												local998 = new Class3_Sub26();
												local998.anObjectArray29 = local21.anObjectArray23;
												local998.aClass6_116 = local21;
												Static109.aClass10_63.method261(local998);
												break label400;
											}
										}
									}
								}
								local21.anInt203 = Static101.anInt2070;
							}
							if (local21.anObjectArray8 != null && Static186.anInt3806 > local21.anInt226) {
								if (local21.anIntArray10 == null || Static186.anInt3806 - local21.anInt226 > 32) {
									local381 = new Class3_Sub26();
									local381.aClass6_116 = local21;
									local381.anObjectArray29 = local21.anObjectArray8;
									Static109.aClass10_63.method261(local381);
								} else {
									label376: for (local481 = local21.anInt226; local481 < Static186.anInt3806; local481++) {
										local504 = Static52.anIntArray59[local481 & 0x1F];
										for (local982 = 0; local982 < local21.anIntArray10.length; local982++) {
											if (local504 == local21.anIntArray10[local982]) {
												local998 = new Class3_Sub26();
												local998.anObjectArray29 = local21.anObjectArray8;
												local998.aClass6_116 = local21;
												Static109.aClass10_63.method261(local998);
												break label376;
											}
										}
									}
								}
								local21.anInt226 = Static186.anInt3806;
							}
							if (Static37.anInt3223 > local21.anInt259 && local21.anObjectArray13 != null) {
								local381 = new Class3_Sub26();
								local381.anObjectArray29 = local21.anObjectArray13;
								local381.aClass6_116 = local21;
								Static109.aClass10_63.method261(local381);
							}
							if (Static33.anInt719 > local21.anInt259 && local21.anObjectArray18 != null) {
								local381 = new Class3_Sub26();
								local381.anObjectArray29 = local21.anObjectArray18;
								local381.aClass6_116 = local21;
								Static109.aClass10_63.method261(local381);
							}
							if (local21.anInt259 < Static36.anInt791 && local21.anObjectArray7 != null) {
								local381 = new Class3_Sub26();
								local381.aClass6_116 = local21;
								local381.anObjectArray29 = local21.anObjectArray7;
								Static109.aClass10_63.method261(local381);
							}
							if (local21.anInt259 < Static176.anInt3588 && local21.anObjectArray22 != null) {
								local381 = new Class3_Sub26();
								local381.aClass6_116 = local21;
								local381.anObjectArray29 = local21.anObjectArray22;
								Static109.aClass10_63.method261(local381);
							}
							if (local21.anInt259 < Static52.anInt1119 && local21.anObjectArray9 != null) {
								local381 = new Class3_Sub26();
								local381.aClass6_116 = local21;
								local381.anObjectArray29 = local21.anObjectArray9;
								Static109.aClass10_63.method261(local381);
							}
							local21.anInt259 = Static86.anInt1703;
							if (local21.anObjectArray2 != null) {
								for (local481 = 0; local481 < Static138.anInt2823; local481++) {
									@Pc(1348) Class3_Sub26 local1348 = new Class3_Sub26();
									local1348.aClass6_116 = local21;
									local1348.anInt4151 = Static23.anIntArray33[local481];
									local1348.anInt4152 = Static5.anIntArray2[local481];
									local1348.anObjectArray29 = local21.anObjectArray2;
									Static109.aClass10_63.method261(local1348);
								}
							}
						}
					}
					if (!local21.aBoolean21 && Static154.aClass6_83 == null && Static55.aClass6_32 == null && !Static134.aBoolean131) {
						if ((local21.anInt211 >= 0 || local21.anInt214 != 0) && local92 <= Static8.anInt187 && Static167.anInt3403 >= local99 && Static8.anInt187 < local122 && local133 > Static167.anInt3403) {
							if (local21.anInt211 < 0) {
								Static85.aClass6_51 = local21;
							} else {
								Static85.aClass6_51 = arg1[local21.anInt211];
							}
						}
						if (local21.anInt250 == 8 && Static8.anInt187 >= local92 && Static167.anInt3403 >= local99 && Static8.anInt187 < local122 && Static167.anInt3403 < local133) {
							Static191.aClass6_105 = local21;
						}
						if (local21.anInt217 < local21.anInt220) {
							Static193.method3024(local21.anInt220, local71 + local21.anInt244, local77, local21, Static167.anInt3403, Static8.anInt187, local21.anInt217);
						}
					}
					if (local21.anInt250 == 0) {
						method63(local21.anInt229, arg1, local71 - local21.anInt271, local133, local99, local122, local92, local77 - local21.anInt270);
						if (local21.aClass6Array1 != null) {
							method63(local21.anInt229, local21.aClass6Array1, local71 - local21.anInt271, local133, local99, local122, local92, local77 - local21.anInt270);
						}
						@Pc(1534) Class3_Sub10 local1534 = (Class3_Sub10) Static144.aClass40_9.method1029((long) local21.anInt229);
						if (local1534 != null) {
							Static108.method1562(local1534.anInt1427, local92, local122, local71, local99, local77, local133);
						}
					}
				}
			}
		}
	}
}
