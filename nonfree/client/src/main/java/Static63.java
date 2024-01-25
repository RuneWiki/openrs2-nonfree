import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!vg;)Z")
	public static boolean method1134(@OriginalArg(0) Class341 arg0) {
		if (Static595.aBoolean755) {
			if (method1137(arg0).anInt9530 != 0) {
				return false;
			}
			if (arg0.anInt9309 == 0) {
				return false;
			}
		}
		return arg0.aBoolean717;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!vg;IIIIIIIII)V")
	public static void method1135(@OriginalArg(0) Class341[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class341 local6 = arg0[local1];
			if (local6 != null && local6.anInt9252 == arg1) {
				@Pc(17) int local17 = local6.anInt9293 + arg6;
				@Pc(22) int local22 = local6.lb + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt9309 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt9300;
					@Pc(45) int local45 = local22 + local6.anInt9248;
					if (local6.anInt9309 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt9309 == 0 || local6.aBoolean719 || method1137(local6).anInt9530 != 0 || local6 == Static303.aClass341_13 || local6.anInt9297 == Static157.anInt2851 || local6.anInt9297 == Static7.anInt122) {
					if (!method1134(local6)) {
						if (local6 == Static93.aClass341_8 && Static540.method7390(Static93.aClass341_8) != null) {
							Static490.aBoolean630 = true;
							Static70.anInt1405 = local17;
							Static574.anInt9480 = local22;
						}
						if (local6.aBoolean721 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean713 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(156) Class1_Sub15 local156 = (Class1_Sub15) Static567.aClass353_64.method7677(); local156 != null; local156 = (Class1_Sub15) Static567.aClass353_64.method7687()) {
									if (local156.aBoolean157) {
										local156.method7859();
										local156.aClass341_10.aBoolean724 = false;
									}
								}
								if (Static525.anInt8857 == 0) {
									Static93.aClass341_8 = null;
									Static303.aClass341_13 = null;
								}
								Static229.anInt4305 = 0;
								Static276.aBoolean361 = false;
								Static139.aBoolean197 = false;
								if (!Static554.aBoolean708) {
									Static434.method6067();
								}
							}
							@Pc(212) boolean local212;
							if (Static166.aClass25_1.method4783() >= local28 && Static166.aClass25_1.method4788() >= local30 && Static166.aClass25_1.method4783() < local32 && Static166.aClass25_1.method4788() < local34) {
								local212 = true;
							} else {
								local212 = false;
							}
							if (!Static573.aBoolean740 && local212) {
								if (local6.anInt9312 >= 0) {
									Static447.anInt7729 = local6.anInt9312;
								} else if (local6.aBoolean713) {
									Static447.anInt7729 = -1;
								}
							}
							if (!Static554.aBoolean708 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static135.method2066(arg8 - local17, arg9 - local22, local6);
							}
							@Pc(256) boolean local256 = false;
							if (Static166.aClass25_1.method4779() && local212) {
								local256 = true;
							}
							@Pc(266) boolean local266 = false;
							@Pc(271) Class1_Sub16 local271 = (Class1_Sub16) Static587.aClass353_67.method7677();
							if (local271 != null && local271.method3646() == 0 && local271.method3652() >= local28 && local271.method3650() >= local30 && local271.method3652() < local32 && local271.method3650() < local34) {
								local266 = true;
							}
							@Pc(307) int local307;
							@Pc(441) int local441;
							if (local6.aByteArray99 != null && !Static394.method5441()) {
								for (local307 = 0; local307 < local6.aByteArray99.length; local307++) {
									if (Static137.aClass295_1.method7719(local6.aByteArray99[local307])) {
										if (local6.anIntArray699 == null || Static301.anInt5197 >= local6.anIntArray699[local307]) {
											@Pc(339) byte local339 = local6.aByteArray98[local307];
											if (local339 == 0 || ((local339 & 0x8) == 0 || !Static137.aClass295_1.method7719(86) && !Static137.aClass295_1.method7719(82) && !Static137.aClass295_1.method7719(81)) && ((local339 & 0x2) == 0 || Static137.aClass295_1.method7719(86)) && ((local339 & 0x1) == 0 || Static137.aClass295_1.method7719(82)) && ((local339 & 0x4) == 0 || Static137.aClass295_1.method7719(81))) {
												if (local307 < 10) {
													Static361.method4892(local307 + 1, local6.anInt9306, -1, "");
												} else if (local307 == 10) {
													Static50.method827();
													@Pc(410) Class1_Sub49 local410 = method1137(local6);
													Static425.method5883(local410.anInt9538, local410.method7774(), local6);
													Static302.aString46 = Static490.method6642(local6);
													if (Static302.aString46 == null) {
														Static302.aString46 = "Null";
													}
													Static593.aString101 = local6.aString94 + "<col=ffffff>";
												}
												local441 = local6.anIntArray696[local307];
												if (local6.anIntArray699 == null) {
													local6.anIntArray699 = new int[local6.aByteArray99.length];
												}
												if (local441 == 0) {
													local6.anIntArray699[local307] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray699[local307] = Static301.anInt5197 + local441;
												}
											}
										}
									} else if (local6.anIntArray699 != null) {
										local6.anIntArray699[local307] = 0;
									}
								}
							}
							if (local266) {
								Static473.method6470(local271.method3650() - local22, local6, local271.method3652() - local17);
							}
							if (Static93.aClass341_8 != null && Static93.aClass341_8 != local6 && local212 && method1137(local6).method7778()) {
								Static519.aClass341_20 = local6;
							}
							if (local6 == Static303.aClass341_13) {
								Static388.aBoolean537 = true;
								Static60.anInt1133 = local17;
								Static72.anInt1425 = local22;
							}
							if (local6.aBoolean719 || local6.anInt9297 != 0) {
								@Pc(526) Class1_Sub15 local526;
								if (local212 && Static587.anInt9589 != 0 && local6.anObjectArray23 != null) {
									local526 = new Class1_Sub15();
									local526.aBoolean157 = true;
									local526.aClass341_10 = local6;
									local526.anInt2002 = Static587.anInt9589;
									local526.anObjectArray1 = local6.anObjectArray23;
									Static567.aClass353_64.method7679(local526);
								}
								if (Static93.aClass341_8 != null || Static554.aBoolean708 || local6.anInt9297 != Static290.anInt5022 && Static229.anInt4305 > 0) {
									local266 = false;
									local256 = false;
									local212 = false;
								}
								@Pc(681) int local681;
								if (local6.anInt9297 != 0) {
									if (local6.anInt9297 == Static371.anInt6169 || local6.anInt9297 == Static432.anInt7575) {
										Static376.aClass341_17 = local6;
										if (Static544.aClass197_1 != null) {
											Static544.aClass197_1.method3942(local6.anInt9248, Static16.aClass134_1);
										}
										if (local6.anInt9297 == Static371.anInt6169) {
											if (!Static554.aBoolean708 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static51.method857(arg8, arg9, Static16.aClass134_1);
												for (@Pc(609) Class8_Sub6 local609 = (Class8_Sub6) Static496.aClass209_6.method4194(); local609 != null; local609 = (Class8_Sub6) Static496.aClass209_6.method4191()) {
													if (arg8 >= local609.anInt5315 && arg8 < local609.anInt5318 && arg9 >= local609.anInt5319 && arg9 < local609.anInt5316) {
														Static434.method6067();
														Static590.method7837(local609.aClass8_Sub3_Sub3_Sub1_1);
													}
												}
											}
											Static195.method2979(local6, local17, local22);
											continue;
										}
									}
									@Pc(720) int local720;
									if (local6.anInt9297 == Static157.anInt2851) {
										if (local6.method7563(Static16.aClass134_1) == null || Static509.anInt5326 != 0 && Static509.anInt5326 != 3 || Static554.aBoolean708 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local307 = arg8 - local17;
										local681 = arg9 - local22;
										local441 = local6.anIntArray694[local681];
										if (local307 < local441 || local307 > local441 + local6.anIntArray700[local681]) {
											continue;
										}
										local307 -= local6.anInt9300 / 2;
										local681 -= local6.anInt9248 / 2;
										if (Static340.anInt5707 == 4) {
											local720 = (int) Static167.aFloat59 & 0x3FFF;
										} else {
											local720 = (int) Static167.aFloat59 + Static548.anInt8574 & 0x3FFF;
										}
										@Pc(732) int local732 = Class1_Sub6_Sub2.anIntArray675[local720];
										@Pc(736) int local736 = Class1_Sub6_Sub2.anIntArray676[local720];
										if (Static340.anInt5707 != 4) {
											local732 = local732 * (Static348.anInt5786 + 256) >> 8;
											local736 = local736 * (Static348.anInt5786 + 256) >> 8;
										}
										@Pc(765) int local765 = local681 * local732 + local307 * local736 >> 14;
										@Pc(775) int local775 = local681 * local736 - local307 * local732 >> 14;
										@Pc(786) int local786;
										@Pc(794) int local794;
										if (Static340.anInt5707 == 4) {
											local786 = (Static177.anInt3135 >> 9) + (local765 >> 2);
											local794 = (Static308.anInt5286 >> 9) - (local775 >> 2);
										} else {
											@Pc(803) int local803 = (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.method5434() - 1) * 256;
											local786 = (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 - local803 >> 9) + (local765 >> 2);
											local794 = (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370 - local803 >> 9) - (local775 >> 2);
										}
										if (Static573.aBoolean740 && (Static258.anInt4645 & 0x40) != 0) {
											@Pc(836) Class341 local836 = Static49.method751(Static48.anInt840, Static84.anInt8888);
											if (local836 == null) {
												Static50.method827();
											} else {
												Static140.method7612(local786, " ->", local794, true, 10, local6.anInt9328, false, Static534.anInt8944, 1L, Static302.aString46);
											}
											continue;
										}
										if (Static246.aClass195_2 == Static586.aClass195_4) {
											Static140.method7612(local786, "", local794, true, 2, -1, false, -1, 1L, Static568.aClass351_31.method7651(Static307.anInt5279));
										}
										Static140.method7612(local786, "", local794, true, 48, -1, false, Static185.anInt3263, 1L, Static498.aString86);
										continue;
									}
									if (local6.anInt9297 == Static290.anInt5022) {
										Static323.aClass341_14 = local6;
										if (local212) {
											Static276.aBoolean361 = true;
										}
										if (local266) {
											local307 = (int) ((double) (local271.method3652() - local17 - local6.anInt9300 / 2) * 2.0D / (double) Static226.aFloat137);
											local681 = (int) -((double) (local271.method3650() - local22 - local6.anInt9248 / 2) * 2.0D / (double) Static226.aFloat137);
											local441 = Static71.anInt1407 + local307 + Static226.anInt6317;
											local720 = Static197.anInt6246 + local681 + Static226.anInt6318;
											@Pc(950) Class1_Sub6_Sub11 local950 = Static420.method5833();
											if (local950 == null) {
												continue;
											}
											@Pc(955) int[] local955 = new int[3];
											local950.method5336(local720, local441, local955);
											if (local955 != null) {
												if (Static137.aClass295_1.method7719(82) && Static267.anInt4711 > 0) {
													Static17.method165(local955[1], local955[0], local955[2]);
													continue;
												}
												Static139.aBoolean197 = true;
												Static579.anInt9073 = local955[0];
												Static232.anInt4336 = local955[1];
												Static235.anInt4389 = local955[2];
											}
											Static229.anInt4305 = 1;
											Static249.aBoolean342 = false;
											Static571.anInt9433 = Static166.aClass25_1.method4783();
											Static467.anInt7995 = Static166.aClass25_1.method4788();
											continue;
										}
										if (local256 && Static229.anInt4305 > 0) {
											if (Static229.anInt4305 == 1 && (Static571.anInt9433 != Static166.aClass25_1.method4783() || Static467.anInt7995 != Static166.aClass25_1.method4788())) {
												Static1.anInt43 = Static71.anInt1407;
												Static175.anInt9134 = Static197.anInt6246;
												Static229.anInt4305 = 2;
											}
											if (Static229.anInt4305 == 2) {
												Static249.aBoolean342 = true;
												Static78.method1335(Static1.anInt43 + (int) ((double) (Static571.anInt9433 - Static166.aClass25_1.method4783()) * 2.0D / (double) Static226.aFloat136));
												Static277.method3926(Static175.anInt9134 - (int) ((double) (Static467.anInt7995 - Static166.aClass25_1.method4788()) * 2.0D / (double) Static226.aFloat136));
											}
											continue;
										}
										if (Static229.anInt4305 > 0 && !Static249.aBoolean342) {
											if ((Static543.anInt9075 == 1 || Static86.method1502()) && Static337.anInt8004 > 2) {
												Static90.method1580(Static571.anInt9433, Static467.anInt7995);
											} else if (Static260.method3768()) {
												Static90.method1580(Static571.anInt9433, Static467.anInt7995);
											}
										}
										Static229.anInt4305 = 0;
										continue;
									}
									if (local6.anInt9297 == Static170.anInt3016) {
										if (local256) {
											Static561.method7605(Static166.aClass25_1.method4783() - local17, Static166.aClass25_1.method4788() - local22, local6.anInt9300, local6.anInt9248);
										}
										continue;
									}
									if (local6.anInt9297 == Static7.anInt122) {
										Static265.method3804(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean712 && local266) {
									local6.aBoolean712 = true;
									if (local6.anObjectArray13 != null) {
										local526 = new Class1_Sub15();
										local526.aBoolean157 = true;
										local526.aClass341_10 = local6;
										local526.anInt2003 = local271.method3652() - local17;
										local526.anInt2002 = local271.method3650() - local22;
										local526.anObjectArray1 = local6.anObjectArray13;
										Static567.aClass353_64.method7679(local526);
									}
								}
								if (local6.aBoolean712 && local256 && local6.anObjectArray15 != null) {
									local526 = new Class1_Sub15();
									local526.aBoolean157 = true;
									local526.aClass341_10 = local6;
									local526.anInt2003 = Static166.aClass25_1.method4783() - local17;
									local526.anInt2002 = Static166.aClass25_1.method4788() - local22;
									local526.anObjectArray1 = local6.anObjectArray15;
									Static567.aClass353_64.method7679(local526);
								}
								if (local6.aBoolean712 && !local256) {
									local6.aBoolean712 = false;
									if (local6.anObjectArray12 != null) {
										local526 = new Class1_Sub15();
										local526.aBoolean157 = true;
										local526.aClass341_10 = local6;
										local526.anInt2003 = Static166.aClass25_1.method4783() - local17;
										local526.anInt2002 = Static166.aClass25_1.method4788() - local22;
										local526.anObjectArray1 = local6.anObjectArray12;
										Static173.aClass353_14.method7679(local526);
									}
								}
								if (local256 && local6.anObjectArray18 != null) {
									local526 = new Class1_Sub15();
									local526.aBoolean157 = true;
									local526.aClass341_10 = local6;
									local526.anInt2003 = Static166.aClass25_1.method4783() - local17;
									local526.anInt2002 = Static166.aClass25_1.method4788() - local22;
									local526.anObjectArray1 = local6.anObjectArray18;
									Static567.aClass353_64.method7679(local526);
								}
								if (!local6.aBoolean724 && local212) {
									local6.aBoolean724 = true;
									if (local6.anObjectArray25 != null) {
										local526 = new Class1_Sub15();
										local526.aBoolean157 = true;
										local526.aClass341_10 = local6;
										local526.anInt2003 = Static166.aClass25_1.method4783() - local17;
										local526.anInt2002 = Static166.aClass25_1.method4788() - local22;
										local526.anObjectArray1 = local6.anObjectArray25;
										Static567.aClass353_64.method7679(local526);
									}
								}
								if (local6.aBoolean724 && local212 && local6.anObjectArray30 != null) {
									local526 = new Class1_Sub15();
									local526.aBoolean157 = true;
									local526.aClass341_10 = local6;
									local526.anInt2003 = Static166.aClass25_1.method4783() - local17;
									local526.anInt2002 = Static166.aClass25_1.method4788() - local22;
									local526.anObjectArray1 = local6.anObjectArray30;
									Static567.aClass353_64.method7679(local526);
								}
								if (local6.aBoolean724 && !local212) {
									local6.aBoolean724 = false;
									if (local6.anObjectArray33 != null) {
										local526 = new Class1_Sub15();
										local526.aBoolean157 = true;
										local526.aClass341_10 = local6;
										local526.anInt2003 = Static166.aClass25_1.method4783() - local17;
										local526.anInt2002 = Static166.aClass25_1.method4788() - local22;
										local526.anObjectArray1 = local6.anObjectArray33;
										Static173.aClass353_14.method7679(local526);
									}
								}
								if (local6.anObjectArray5 != null) {
									local526 = new Class1_Sub15();
									local526.aClass341_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray5;
									Static373.aClass353_45.method7679(local526);
								}
								@Pc(1494) Class1_Sub15 local1494;
								if (local6.anObjectArray22 != null && Static341.anInt3224 > local6.anInt9247) {
									if (local6.anIntArray695 == null || Static341.anInt3224 - local6.anInt9247 > 32) {
										local526 = new Class1_Sub15();
										local526.aClass341_10 = local6;
										local526.anObjectArray1 = local6.anObjectArray22;
										Static567.aClass353_64.method7679(local526);
									} else {
										label683: for (local307 = local6.anInt9247; local307 < Static341.anInt3224; local307++) {
											local681 = Static418.anIntArray560[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray695.length; local441++) {
												if (local6.anIntArray695[local441] == local681) {
													local1494 = new Class1_Sub15();
													local1494.aClass341_10 = local6;
													local1494.anObjectArray1 = local6.anObjectArray22;
													Static567.aClass353_64.method7679(local1494);
													break label683;
												}
											}
										}
									}
									local6.anInt9247 = Static341.anInt3224;
								}
								if (local6.anObjectArray26 != null && Static492.anInt9042 > local6.anInt9281) {
									if (local6.anIntArray701 == null || Static492.anInt9042 - local6.anInt9281 > 32) {
										local526 = new Class1_Sub15();
										local526.aClass341_10 = local6;
										local526.anObjectArray1 = local6.anObjectArray26;
										Static567.aClass353_64.method7679(local526);
									} else {
										label659: for (local307 = local6.anInt9281; local307 < Static492.anInt9042; local307++) {
											local681 = Static240.anIntArray346[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray701.length; local441++) {
												if (local6.anIntArray701[local441] == local681) {
													local1494 = new Class1_Sub15();
													local1494.aClass341_10 = local6;
													local1494.anObjectArray1 = local6.anObjectArray26;
													Static567.aClass353_64.method7679(local1494);
													break label659;
												}
											}
										}
									}
									local6.anInt9281 = Static492.anInt9042;
								}
								if (local6.anObjectArray7 != null && Static66.anInt1328 > local6.anInt9275) {
									if (local6.anIntArray702 == null || Static66.anInt1328 - local6.anInt9275 > 32) {
										local526 = new Class1_Sub15();
										local526.aClass341_10 = local6;
										local526.anObjectArray1 = local6.anObjectArray7;
										Static567.aClass353_64.method7679(local526);
									} else {
										label635: for (local307 = local6.anInt9275; local307 < Static66.anInt1328; local307++) {
											local681 = Static275.anIntArray371[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray702.length; local441++) {
												if (local6.anIntArray702[local441] == local681) {
													local1494 = new Class1_Sub15();
													local1494.aClass341_10 = local6;
													local1494.anObjectArray1 = local6.anObjectArray7;
													Static567.aClass353_64.method7679(local1494);
													break label635;
												}
											}
										}
									}
									local6.anInt9275 = Static66.anInt1328;
								}
								if (local6.anObjectArray8 != null && Static96.anInt2012 > local6.anInt9295) {
									if (local6.anIntArray703 == null || Static96.anInt2012 - local6.anInt9295 > 32) {
										local526 = new Class1_Sub15();
										local526.aClass341_10 = local6;
										local526.anObjectArray1 = local6.anObjectArray8;
										Static567.aClass353_64.method7679(local526);
									} else {
										label611: for (local307 = local6.anInt9295; local307 < Static96.anInt2012; local307++) {
											local681 = Static527.anIntArray672[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray703.length; local441++) {
												if (local6.anIntArray703[local441] == local681) {
													local1494 = new Class1_Sub15();
													local1494.aClass341_10 = local6;
													local1494.anObjectArray1 = local6.anObjectArray8;
													Static567.aClass353_64.method7679(local1494);
													break label611;
												}
											}
										}
									}
									local6.anInt9295 = Static96.anInt2012;
								}
								if (local6.anObjectArray24 != null && Static351.anInt5835 > local6.anInt9251) {
									if (local6.anIntArray698 == null || Static351.anInt5835 - local6.anInt9251 > 32) {
										local526 = new Class1_Sub15();
										local526.aClass341_10 = local6;
										local526.anObjectArray1 = local6.anObjectArray24;
										Static567.aClass353_64.method7679(local526);
									} else {
										label587: for (local307 = local6.anInt9251; local307 < Static351.anInt5835; local307++) {
											local681 = Static514.anIntArray662[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray698.length; local441++) {
												if (local6.anIntArray698[local441] == local681) {
													local1494 = new Class1_Sub15();
													local1494.aClass341_10 = local6;
													local1494.anObjectArray1 = local6.anObjectArray24;
													Static567.aClass353_64.method7679(local1494);
													break label587;
												}
											}
										}
									}
									local6.anInt9251 = Static351.anInt5835;
								}
								if (Static151.anInt2743 > local6.anInt9310 && local6.anObjectArray14 != null) {
									local526 = new Class1_Sub15();
									local526.aClass341_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray14;
									Static567.aClass353_64.method7679(local526);
								}
								if (Static498.anInt8553 > local6.anInt9310 && local6.anObjectArray6 != null) {
									local526 = new Class1_Sub15();
									local526.aClass341_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray6;
									Static567.aClass353_64.method7679(local526);
								}
								if (Static61.anInt1185 > local6.anInt9310 && local6.anObjectArray21 != null) {
									local526 = new Class1_Sub15();
									local526.aClass341_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray21;
									Static567.aClass353_64.method7679(local526);
								}
								if (Static595.anInt9660 > local6.anInt9310 && local6.anObjectArray28 != null) {
									local526 = new Class1_Sub15();
									local526.aClass341_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray28;
									Static567.aClass353_64.method7679(local526);
								}
								if (Static127.anInt2535 > local6.anInt9310 && local6.anObjectArray3 != null) {
									local526 = new Class1_Sub15();
									local526.aClass341_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray3;
									Static567.aClass353_64.method7679(local526);
								}
								local6.anInt9310 = Static233.anInt8002;
								if (local6.anObjectArray20 != null) {
									for (local307 = 0; local307 < Static594.anInt9654; local307++) {
										@Pc(1962) Class1_Sub15 local1962 = new Class1_Sub15();
										local1962.aClass341_10 = local6;
										local1962.anInt2001 = Static398.anInterface22Array1[local307].method4450();
										local1962.anInt1997 = Static398.anInterface22Array1[local307].method4453();
										local1962.anObjectArray1 = local6.anObjectArray20;
										Static567.aClass353_64.method7679(local1962);
									}
								}
								if (Static386.aBoolean534 && local6.anObjectArray4 != null) {
									local526 = new Class1_Sub15();
									local526.aClass341_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray4;
									Static567.aClass353_64.method7679(local526);
								}
							}
							if (local6.anInt9309 == 5 && local6.anInt9308 != -1) {
								local6.method7562(Static321.aClass279_1, Static485.aClass318_1).method3942(local6.anInt9248, Static16.aClass134_1);
							}
							Static314.method4352(local6);
							if (local6.anInt9309 == 0) {
								method1135(arg0, local6.anInt9306, local28, local30, local32, local34, local17 - local6.anInt9267, local22 - local6.anInt9256, arg8, arg9);
								if (local6.aClass341Array2 != null) {
									method1135(local6.aClass341Array2, local6.anInt9306, local28, local30, local32, local34, local17 - local6.anInt9267, local22 - local6.anInt9256, arg8, arg9);
								}
								@Pc(2084) Class1_Sub44 local2084 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local6.anInt9306);
								if (local2084 != null) {
									if (Static246.aClass195_2 == Static184.aClass195_1 && local2084.anInt7686 == 0 && !Static554.aBoolean708 && local212 && !Static595.aBoolean755) {
										Static434.method6067();
									}
									Static272.method3864(local17, local2084.anInt7685, local30, local28, local34, local22, arg9, local32, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static314.method4352(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!vg;)Lclient!wh;")
	public static Class1_Sub49 method1137(@OriginalArg(0) Class341 arg0) {
		@Pc(13) Class1_Sub49 local13 = (Class1_Sub49) Static353.aClass187_25.method3797(((long) arg0.anInt9306 << 32) + (long) arg0.anInt9270);
		return local13 == null ? arg0.aClass1_Sub49_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1138() {
		@Pc(1) int local1 = Static220.anInt4237;
		@Pc(3) int[] local3 = Static572.anIntArray717;
		@Pc(20) boolean local20 = Static348.aClass1_Sub30_Sub1_1.anInt4874 == 1 && local1 > 200 || Static348.aClass1_Sub30_Sub1_1.anInt4874 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class8_Sub3_Sub3_Sub1_Sub1 local29 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local3[local22]];
			if (local29.method1442()) {
				local29.method7633();
				if (local29.aShort132 >= 0 && local29.aShort131 >= 0 && local29.aShort133 < Static71.anInt1410 && local29.aShort130 < Static471.anInt8012) {
					local29.aBoolean134 = local29.aBoolean553 ? local20 : false;
					if (local29 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1) {
						local29.anInt6790 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean551) {
							local75++;
						}
						if (local29.anInt6816 > Static301.anInt5197) {
							local75 += 2;
						}
						local75 += 5 - local29.method5434() << 2;
						if (local29.aBoolean137) {
							local75 += 512;
						} else {
							if (Static30.anInt456 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6790 = local75 + 1;
					}
				} else {
					local29.anInt6790 = -1;
				}
			} else {
				local29.anInt6790 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static39.anInt609; local116++) {
			@Pc(127) Class8_Sub3_Sub3_Sub1_Sub2 local127 = ((Class1_Sub42) Static84.aClass187_40.method3797((long) Static17.anIntArray24[local116])).aClass8_Sub3_Sub3_Sub1_Sub2_2;
			if (local127.method5443() && local127.aClass20_1.method282(Static430.aClass321_1)) {
				local127.method7633();
				if (local127.aShort132 >= 0 && local127.aShort131 >= 0 && local127.aShort133 < Static71.anInt1410 && local127.aShort130 < Static471.anInt8012) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean551) {
						local164++;
					}
					if (local127.anInt6816 > Static301.anInt5197) {
						local164 += 2;
					}
					local164 += 5 - local127.method5434() << 2;
					if (Static30.anInt456 == 0) {
						if (local127.aClass20_1.aBoolean35) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static30.anInt456 == 1) {
						if (local127.aClass20_1.aBoolean35) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass20_1.aBoolean31) {
						local164 += 1024;
					} else if (!local127.aClass20_1.aBoolean38) {
						local164 += 256;
					}
					local127.anInt6790 = local164 + 1;
				} else {
					local127.anInt6790 = -1;
				}
			} else {
				local127.anInt6790 = -1;
			}
		}
		for (local75 = 0; local75 < Static41.aClass154Array1.length; local75++) {
			@Pc(230) Class154 local230 = Static41.aClass154Array1[local75];
			if (local230 != null) {
				if (local230.anInt4116 == 1) {
					@Pc(244) Class1_Sub42 local244 = (Class1_Sub42) Static84.aClass187_40.method3797((long) local230.anInt4115);
					if (local244 != null) {
						@Pc(249) Class8_Sub3_Sub3_Sub1_Sub2 local249 = local244.aClass8_Sub3_Sub3_Sub1_Sub2_2;
						if (local249.anInt6790 >= 0) {
							local249.anInt6790 += 2048;
						}
					}
				} else if (local230.anInt4116 == 10) {
					@Pc(268) Class8_Sub3_Sub3_Sub1_Sub1 local268 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local230.anInt4115];
					if (local268 != null && local268 != Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 && local268.anInt6790 >= 0) {
						local268.anInt6790 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	public static void method1141(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static220.anInt4237;
		@Pc(3) int[] local3 = Static572.anIntArray717;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static39.anInt609; local5++) {
			@Pc(15) Class8_Sub3_Sub3_Sub1 local15;
			if (local5 < local1) {
				local15 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class1_Sub42) Static84.aClass187_40.method3797((long) Static17.anIntArray24[local5 - local1])).aClass8_Sub3_Sub3_Sub1_Sub2_2;
			}
			if (local15.aByte123 == arg0 && local15.anInt6790 >= 0) {
				@Pc(39) int local39 = local15.method5434();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9365 & 0x1FF) != 0 || (local15.anInt9370 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9365 & 0x1FF) != 256 || (local15.anInt9370 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9365 >> 9;
					local80 = local15.anInt9370 >> 9;
					if (local15.anInt6790 > Static197.anIntArrayArray146[local75][local80]) {
						Static197.anIntArrayArray146[local75][local80] = local15.anInt6790;
						Static64.anIntArrayArray33[local75][local80] = 1;
					} else if (local15.anInt6790 == Static197.anIntArrayArray146[local75][local80]) {
						local116 = Static64.anIntArrayArray33[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt9365 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt9370 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt9365 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt9370 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt6790 > Static197.anIntArrayArray146[local158][local161]) {
								Static197.anIntArrayArray146[local158][local161] = local15.anInt6790;
								Static64.anIntArrayArray33[local158][local161] = 1;
							} else if (local15.anInt6790 == Static197.anIntArrayArray146[local158][local161]) {
								local116 = Static64.anIntArrayArray33[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1143() {
		@Pc(1) int local1 = Static220.anInt4237;
		@Pc(3) int[] local3 = Static572.anIntArray717;
		@Pc(11) int local11 = Static366.aBoolean479 ? local1 : local1 + Static39.anInt609;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class8_Sub3_Sub3_Sub1 local23;
			if (local13 < local1) {
				local23 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub42) Static84.aClass187_40.method3797((long) Static17.anIntArray24[local13 - local1])).aClass8_Sub3_Sub3_Sub1_Sub2_2;
			}
			if (local23.anInt6790 >= 0) {
				@Pc(43) int local43 = local23.method5434();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9365 & 0x1FF) == 0 && (local23.anInt9370 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt9365 & 0x1FF) == 256 && (local23.anInt9370 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt9361 = Static66.method1191(local23.anInt9365, local23.aByte123, local23.anInt9370);
				Static227.method3465(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!vg;)Lclient!vg;")
	public static Class341 method1146(@OriginalArg(0) Class341 arg0) {
		@Pc(4) int local4 = method1137(arg0).method7773();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static350.method4758(arg0.anInt9252);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1147() {
		for (@Pc(1) int local1 = 0; local1 < Static71.anInt1410; local1++) {
			@Pc(6) int[] local6 = Static197.anIntArrayArray146[local1];
			for (@Pc(8) int local8 = 0; local8 < Static471.anInt8012; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1148() {
		Static161.anInt2919 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static39.anInt609; local3++) {
			@Pc(14) Class8_Sub3_Sub3_Sub1_Sub2 local14 = ((Class1_Sub42) Static84.aClass187_40.method3797((long) Static17.anIntArray24[local3])).aClass8_Sub3_Sub3_Sub1_Sub2_2;
			if (local14.aBoolean551 && local14.method5440() != -1) {
				@Pc(32) int local32 = (local14.method5434() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt9365 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt9370 - local32 >> 9;
				@Pc(53) Class8_Sub3_Sub3_Sub1 local53 = Static429.method5966(local14.aByte123, local39, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt6821;
					if (local53 instanceof Class8_Sub3_Sub3_Sub1_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt6843 == 0 && local53.method5440() != -1) {
						Static25.anIntArray43[Static161.anInt2919] = local58;
						Static156.anIntArray233[Static161.anInt2919] = local58;
						Static161.anInt2919++;
						local53.anInt6843++;
					}
					Static25.anIntArray43[Static161.anInt2919] = local58;
					Static156.anIntArray233[Static161.anInt2919] = local14.anInt6821 + 2048;
					Static161.anInt2919++;
					local53.anInt6843++;
				}
			}
		}
		Static350.method4762(Static161.anInt2919 - 1, Static156.anIntArray233, Static25.anIntArray43, 0);
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	public static void method1149(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static220.anInt4237;
		@Pc(3) int[] local3 = Static572.anIntArray717;
		@Pc(11) int local11 = Static366.aBoolean479 ? local1 : local1 + Static39.anInt609;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class8_Sub3_Sub3_Sub1 local23;
			if (local13 < local1) {
				local23 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub42) Static84.aClass187_40.method3797((long) Static17.anIntArray24[local13 - local1])).aClass8_Sub3_Sub3_Sub1_Sub2_2;
			}
			if (local23.aByte123 == arg0) {
				local23.anInt6843 = 0;
				if (local23.anInt6790 < 0) {
					local23.aBoolean551 = false;
				} else {
					@Pc(54) int local54 = local23.method5434();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9365 & 0x1FF) != 0 || (local23.anInt9370 & 0x1FF) != 0) {
							local23.aBoolean551 = false;
							continue;
						}
					} else if ((local23.anInt9365 & 0x1FF) != 256 || (local23.anInt9370 & 0x1FF) != 256) {
						local23.aBoolean551 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9365 >> 9;
						local101 = local23.anInt9370 >> 9;
						if (local23.anInt6790 != Static197.anIntArrayArray146[local96][local101]) {
							local23.aBoolean551 = true;
							continue;
						}
						if (Static64.anIntArrayArray33[local96][local101] > 1) {
							local126 = Static64.anIntArrayArray33[local96][local101]--;
							local23.aBoolean551 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt9365 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt9370 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt9365 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt9370 + local96 >> 9;
						if (!Static391.method5399(local101, local162, local23.anInt6790, local155, local169)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt6790 == Static197.anIntArrayArray146[local180][local183]) {
										local126 = Static64.anIntArrayArray33[local180][local183]--;
									}
								}
							}
							local23.aBoolean551 = true;
							continue;
						}
					}
					local23.aBoolean551 = false;
					local23.anInt9361 = Static66.method1191(local23.anInt9365, local23.aByte123, local23.anInt9370);
					Static227.method3465(local23, true);
				}
			}
		}
	}
}
