import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	public static int anInt772;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!vh;")
	public static Class187 aClass187_23 = new Class187(16);

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Ljava/lang/String;")
	public static String aString41 = "shake:";

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/lang/String;")
	public static String aString42 = null;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	public static int anInt771 = 0;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
	public static int anInt773 = 0;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Ljava/lang/String;")
	public static String aString43 = null;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	public static void method677() {
		if (Static278.aFloat154 < 128.0F) {
			Static278.aFloat154 = 128.0F;
		}
		@Pc(16) int local16 = Static31.anInt551 >> 7;
		if (Static278.aFloat154 > 383.0F) {
			Static278.aFloat154 = 383.0F;
		}
		while (Static49.aFloat32 >= 2048.0F) {
			Static49.aFloat32 -= 2048.0F;
		}
		@Pc(43) int local43 = Static183.anInt3495 >> 7;
		while (Static49.aFloat32 < 0.0F) {
			Static49.aFloat32 += 2048.0F;
		}
		@Pc(59) int local59 = Static69.method4275(Static183.anInt3495, Static65.anInt1300, Static31.anInt551);
		@Pc(61) int local61 = 0;
		@Pc(80) int local80;
		if (local16 > 3 && local43 > 3 && local16 < 100 && local43 < 100) {
			for (local80 = local16 - 4; local80 <= local16 + 4; local80++) {
				for (@Pc(93) int local93 = local43 - 4; local93 <= local43 + 4; local93++) {
					@Pc(100) int local100 = Static65.anInt1300;
					if (local100 < 3 && (Static104.aByteArrayArrayArray3[1][local80][local93] & 0x2) == 2) {
						local100++;
					}
					@Pc(141) int local141 = local59 + (Static43.aByteArrayArrayArray1[local100][local80][local93] & 0xFF) * 8 - Static24.anIntArrayArrayArray2[local100][local80][local93];
					if (local61 < local141) {
						local61 = local141;
					}
				}
			}
		}
		local80 = local61 * 192;
		if (local80 > 98048) {
			local80 = 98048;
		}
		if (local80 < 32768) {
			local80 = 32768;
		}
		if (local80 > Static277.anInt4986) {
			Static277.anInt4986 += (local80 - Static277.anInt4986) / 24;
		} else if (local80 < Static277.anInt4986) {
			Static277.anInt4986 += (local80 - Static277.anInt4986) / 80;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hi;)Lclient!nf;")
	public static Class1_Sub22 method679(@OriginalArg(0) Class66 arg0) {
		@Pc(13) Class1_Sub22 local13 = (Class1_Sub22) Static154.aClass142_13.method3543(((long) arg0.anInt2157 << 32) + (long) arg0.anInt2178);
		return local13 == null ? arg0.aClass1_Sub22_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!hi;)Z")
	public static boolean method681(@OriginalArg(0) Class66 arg0) {
		if (Static95.aBoolean103) {
			if (method679(arg0).anInt3570 != 0) {
				return false;
			}
			if (arg0.anInt2176 == 0) {
				return false;
			}
		}
		return arg0.aBoolean129;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!hi;)Lclient!hi;")
	public static Class66 method682(@OriginalArg(0) Class66 arg0) {
		@Pc(4) int local4 = method679(arg0).method3058();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static53.method968(arg0.anInt2221);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!hi;IIIIIII)V")
	public static void method684(@OriginalArg(0) Class66[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class66 local9 = arg0[local1];
			if (local9 != null && local9.anInt2221 == arg1 && (!local9.aBoolean132 || local9.anInt2176 == 0 || local9.aBoolean120 || method679(local9).anInt3570 != 0 || local9 == Static309.aClass66_50 || local9.anInt2210 == 1338) && (!local9.aBoolean132 || !method681(local9))) {
				@Pc(50) int local50 = local9.anInt2135 + arg6;
				@Pc(55) int local55 = local9.anInt2174 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt2176 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt2204;
					@Pc(78) int local78 = local55 + local9.anInt2207;
					if (local9.anInt2176 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static5.aClass66_1) {
					Static232.aBoolean291 = true;
					Static200.anInt3846 = local50;
					Static33.anInt566 = local55;
				}
				if (!local9.aBoolean132 || local61 < local65 && local63 < local67) {
					if (local9.anInt2176 == 0) {
						if (!local9.aBoolean132 && method681(local9) && Static7.aClass66_6 != local9) {
							continue;
						}
						if (local9.aBoolean127 && Static247.anInt4467 >= local61 && Static222.anInt4105 >= local63 && Static247.anInt4467 < local65 && Static222.anInt4105 < local67) {
							for (@Pc(164) Class1_Sub10 local164 = (Class1_Sub10) Static13.aClass59_8.method1704(); local164 != null; local164 = (Class1_Sub10) Static13.aClass59_8.method1701()) {
								if (local164.aBoolean54) {
									local164.method4779();
									local164.aClass66_10.aBoolean123 = false;
								}
							}
							if (Static130.anInt2593 == 0) {
								Static5.aClass66_1 = null;
								Static309.aClass66_50 = null;
							}
							Static303.anInt5384 = 0;
							Static266.aBoolean337 = false;
						}
					}
					if (local9.aBoolean132) {
						@Pc(209) boolean local209;
						if (Static247.anInt4467 >= local61 && Static222.anInt4105 >= local63 && Static247.anInt4467 < local65 && Static222.anInt4105 < local67) {
							local209 = true;
						} else {
							local209 = false;
						}
						@Pc(214) boolean local214 = false;
						if (Static281.anInt5089 == 1 && local209) {
							local214 = true;
						}
						@Pc(223) boolean local223 = false;
						if (Static83.anInt1652 == 1 && Static238.anInt4321 >= local61 && Static282.anInt5092 >= local63 && Static238.anInt4321 < local65 && Static282.anInt5092 < local67) {
							local223 = true;
						}
						@Pc(245) int local245;
						@Pc(341) int local341;
						if (local9.aByteArray23 != null) {
							for (local245 = 0; local245 < local9.aByteArray23.length; local245++) {
								if (Static32.aBooleanArray9[local9.aByteArray23[local245]]) {
									if (local9.anIntArray185 == null || Static313.anInt2966 >= local9.anIntArray185[local245]) {
										@Pc(281) byte local281 = local9.aByteArray24[local245];
										if (local281 == 0 || ((local281 & 0x8) == 0 || !Static32.aBooleanArray9[86] && !Static32.aBooleanArray9[82] && !Static32.aBooleanArray9[81]) && ((local281 & 0x2) == 0 || Static32.aBooleanArray9[86]) && ((local281 & 0x1) == 0 || Static32.aBooleanArray9[82]) && ((local281 & 0x4) == 0 || Static32.aBooleanArray9[81])) {
											Static8.method118(local245 + 1, local9.anInt2157, "", -1);
											local341 = local9.anIntArray181[local245];
											if (local9.anIntArray185 == null) {
												local9.anIntArray185 = new int[local9.aByteArray23.length];
											}
											if (local341 == 0) {
												local9.anIntArray185[local245] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray185[local245] = Static313.anInt2966 + local341;
											}
										}
									}
								} else if (local9.anIntArray185 != null) {
									local9.anIntArray185[local245] = 0;
								}
							}
						}
						if (local223) {
							Static6.method39(Static282.anInt5092 - local55, Static238.anInt4321 - local50, local9);
						}
						if (Static5.aClass66_1 != null && Static5.aClass66_1 != local9 && local209 && method679(local9).method3062()) {
							Static227.aClass66_35 = local9;
						}
						if (local9 == Static309.aClass66_50) {
							Static221.aBoolean283 = true;
							Static51.anInt1016 = local50;
							Static108.anInt2254 = local55;
						}
						if (local9.aBoolean120 || local9.anInt2210 != 0) {
							@Pc(418) Class1_Sub10 local418;
							if (local209 && Static20.anInt382 != 0 && local9.anObjectArray31 != null) {
								local418 = new Class1_Sub10();
								local418.aBoolean54 = true;
								local418.aClass66_10 = local9;
								local418.anInt947 = Static20.anInt382;
								local418.anObjectArray1 = local9.anObjectArray31;
								Static13.aClass59_8.method1706(local418);
							}
							if (Static5.aClass66_1 != null || Static168.aClass66_28 != null || Static249.aBoolean307 || local9.anInt2210 != 1400 && Static303.anInt5384 > 0) {
								local223 = false;
								local214 = false;
								local209 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt2210 != 0) {
								if (local9.anInt2210 == 1337) {
									Static7.aClass66_5 = local9;
									continue;
								}
								if (local9.anInt2210 == 1338) {
									if (local223) {
										Static76.anInt1574 = Static238.anInt4321 - local50;
										Static205.anInt3912 = Static282.anInt5092 - local55;
									}
									continue;
								}
								if (local9.anInt2210 == 1400) {
									Static74.aClass66_16 = local9;
									if (local209) {
										Static266.aBoolean337 = true;
									}
									if (local223) {
										local245 = (int) ((double) (Static238.anInt4321 - local50 - local9.anInt2204 / 2) * 2.0D / (double) Static109.aFloat132);
										local522 = (int) ((double) (Static282.anInt5092 - local55 - local9.anInt2207 / 2) * 2.0D / (double) Static109.aFloat132);
										local341 = Static125.anInt2557 + local245;
										@Pc(530) int local530 = Static293.anInt5263 + local522;
										@Pc(534) int local534 = local341 + Static109.anInt4229;
										@Pc(542) int local542 = Static109.anInt4231 + Static109.anInt4232 - local530 - 1;
										@Pc(545) Class1_Sub2_Sub21 local545 = Static204.method3265();
										@Pc(548) int[] local548 = new int[3];
										local545.method4335(local548, local534, local542);
										if (local548 != null) {
											if (Static32.aBooleanArray9[82] && Static137.anInt2751 > 0) {
												Static255.method4050(local548[0], local548[2], local548[1]);
												Static173.method2914();
												continue;
											}
											Static127.aClass1_Sub14_Sub1_3.method1408(221);
											Static127.aClass1_Sub14_Sub1_3.method1387(local548[0] << 28 | local548[1] << 14 | local548[2]);
										}
										Static303.anInt5384 = 1;
										Static2.aBoolean1 = false;
										Static240.anInt4354 = Static247.anInt4467;
										Static145.anInt2885 = Static222.anInt4105;
										continue;
									}
									if (local214 && Static303.anInt5384 > 0) {
										if (Static303.anInt5384 == 1 && (Static240.anInt4354 != Static247.anInt4467 || Static145.anInt2885 != Static222.anInt4105)) {
											Static94.anInt3437 = Static125.anInt2557;
											Static189.anInt3604 = Static293.anInt5263;
											Static303.anInt5384 = 2;
										}
										if (Static303.anInt5384 == 2) {
											Static2.aBoolean1 = true;
											Static57.method1002(Static94.anInt3437 + (int) ((double) (Static240.anInt4354 - Static247.anInt4467) * 2.0D / (double) Static109.aFloat131));
											Static85.method1594(Static189.anInt3604 + (int) ((double) (Static145.anInt2885 - Static222.anInt4105) * 2.0D / (double) Static109.aFloat131));
										}
										continue;
									}
									if (Static303.anInt5384 > 0 && !Static2.aBoolean1) {
										if ((Static287.anInt5144 == 1 || Static214.method3358(Static110.anInt2281 - 1)) && Static110.anInt2281 > 2) {
											Static301.method4557();
										} else if (Static110.anInt2281 > 0) {
											Static258.method4086();
										}
									}
									Static303.anInt5384 = 0;
									continue;
								}
								if (local9.anInt2210 == 1401) {
									if (local214) {
										Static286.method4392(Static222.anInt4105 - local55, local9.anInt2204, local9.anInt2207, Static247.anInt4467 - local50);
									}
									continue;
								}
								if (local9.anInt2210 == 1402) {
									if (!Static156.aBoolean211) {
										Static103.method1865(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean131 && local223) {
								local9.aBoolean131 = true;
								if (local9.anObjectArray15 != null) {
									local418 = new Class1_Sub10();
									local418.aBoolean54 = true;
									local418.aClass66_10 = local9;
									local418.anInt950 = Static238.anInt4321 - local50;
									local418.anInt947 = Static282.anInt5092 - local55;
									local418.anObjectArray1 = local9.anObjectArray15;
									Static13.aClass59_8.method1706(local418);
								}
							}
							if (local9.aBoolean131 && local214 && local9.anObjectArray11 != null) {
								local418 = new Class1_Sub10();
								local418.aBoolean54 = true;
								local418.aClass66_10 = local9;
								local418.anInt950 = Static247.anInt4467 - local50;
								local418.anInt947 = Static222.anInt4105 - local55;
								local418.anObjectArray1 = local9.anObjectArray11;
								Static13.aClass59_8.method1706(local418);
							}
							if (local9.aBoolean131 && !local214) {
								local9.aBoolean131 = false;
								if (local9.anObjectArray30 != null) {
									local418 = new Class1_Sub10();
									local418.aBoolean54 = true;
									local418.aClass66_10 = local9;
									local418.anInt950 = Static247.anInt4467 - local50;
									local418.anInt947 = Static222.anInt4105 - local55;
									local418.anObjectArray1 = local9.anObjectArray30;
									Static173.aClass59_27.method1706(local418);
								}
							}
							if (local214 && local9.anObjectArray27 != null) {
								local418 = new Class1_Sub10();
								local418.aBoolean54 = true;
								local418.aClass66_10 = local9;
								local418.anInt950 = Static247.anInt4467 - local50;
								local418.anInt947 = Static222.anInt4105 - local55;
								local418.anObjectArray1 = local9.anObjectArray27;
								Static13.aClass59_8.method1706(local418);
							}
							if (!local9.aBoolean123 && local209) {
								local9.aBoolean123 = true;
								if (local9.anObjectArray14 != null) {
									local418 = new Class1_Sub10();
									local418.aBoolean54 = true;
									local418.aClass66_10 = local9;
									local418.anInt950 = Static247.anInt4467 - local50;
									local418.anInt947 = Static222.anInt4105 - local55;
									local418.anObjectArray1 = local9.anObjectArray14;
									Static13.aClass59_8.method1706(local418);
								}
							}
							if (local9.aBoolean123 && local209 && local9.anObjectArray26 != null) {
								local418 = new Class1_Sub10();
								local418.aBoolean54 = true;
								local418.aClass66_10 = local9;
								local418.anInt950 = Static247.anInt4467 - local50;
								local418.anInt947 = Static222.anInt4105 - local55;
								local418.anObjectArray1 = local9.anObjectArray26;
								Static13.aClass59_8.method1706(local418);
							}
							if (local9.aBoolean123 && !local209) {
								local9.aBoolean123 = false;
								if (local9.anObjectArray5 != null) {
									local418 = new Class1_Sub10();
									local418.aBoolean54 = true;
									local418.aClass66_10 = local9;
									local418.anInt950 = Static247.anInt4467 - local50;
									local418.anInt947 = Static222.anInt4105 - local55;
									local418.anObjectArray1 = local9.anObjectArray5;
									Static173.aClass59_27.method1706(local418);
								}
							}
							if (local9.anObjectArray7 != null) {
								local418 = new Class1_Sub10();
								local418.aClass66_10 = local9;
								local418.anObjectArray1 = local9.anObjectArray7;
								Static257.aClass59_35.method1706(local418);
							}
							@Pc(1060) Class1_Sub10 local1060;
							if (local9.anObjectArray18 != null && Static224.anInt4117 > local9.anInt2200) {
								if (local9.anIntArray187 == null || Static224.anInt4117 - local9.anInt2200 > 32) {
									local418 = new Class1_Sub10();
									local418.aClass66_10 = local9;
									local418.anObjectArray1 = local9.anObjectArray18;
									Static13.aClass59_8.method1706(local418);
								} else {
									label595: for (local245 = local9.anInt2200; local245 < Static224.anInt4117; local245++) {
										local522 = Static288.anIntArray458[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray187.length; local341++) {
											if (local9.anIntArray187[local341] == local522) {
												local1060 = new Class1_Sub10();
												local1060.aClass66_10 = local9;
												local1060.anObjectArray1 = local9.anObjectArray18;
												Static13.aClass59_8.method1706(local1060);
												break label595;
											}
										}
									}
								}
								local9.anInt2200 = Static224.anInt4117;
							}
							if (local9.anObjectArray10 != null && Static203.anInt3903 > local9.anInt2208) {
								if (local9.anIntArray188 == null || Static203.anInt3903 - local9.anInt2208 > 32) {
									local418 = new Class1_Sub10();
									local418.aClass66_10 = local9;
									local418.anObjectArray1 = local9.anObjectArray10;
									Static13.aClass59_8.method1706(local418);
								} else {
									label571: for (local245 = local9.anInt2208; local245 < Static203.anInt3903; local245++) {
										local522 = Static182.anIntArray294[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray188.length; local341++) {
											if (local9.anIntArray188[local341] == local522) {
												local1060 = new Class1_Sub10();
												local1060.aClass66_10 = local9;
												local1060.anObjectArray1 = local9.anObjectArray10;
												Static13.aClass59_8.method1706(local1060);
												break label571;
											}
										}
									}
								}
								local9.anInt2208 = Static203.anInt3903;
							}
							if (local9.anObjectArray19 != null && Static197.anInt3803 > local9.anInt2194) {
								if (local9.anIntArray199 == null || Static197.anInt3803 - local9.anInt2194 > 32) {
									local418 = new Class1_Sub10();
									local418.aClass66_10 = local9;
									local418.anObjectArray1 = local9.anObjectArray19;
									Static13.aClass59_8.method1706(local418);
								} else {
									label547: for (local245 = local9.anInt2194; local245 < Static197.anInt3803; local245++) {
										local522 = Static106.anIntArray179[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray199.length; local341++) {
											if (local9.anIntArray199[local341] == local522) {
												local1060 = new Class1_Sub10();
												local1060.aClass66_10 = local9;
												local1060.anObjectArray1 = local9.anObjectArray19;
												Static13.aClass59_8.method1706(local1060);
												break label547;
											}
										}
									}
								}
								local9.anInt2194 = Static197.anInt3803;
							}
							if (local9.anObjectArray9 != null && Static159.anInt3143 > local9.anInt2219) {
								if (local9.anIntArray196 == null || Static159.anInt3143 - local9.anInt2219 > 32) {
									local418 = new Class1_Sub10();
									local418.aClass66_10 = local9;
									local418.anObjectArray1 = local9.anObjectArray9;
									Static13.aClass59_8.method1706(local418);
								} else {
									label523: for (local245 = local9.anInt2219; local245 < Static159.anInt3143; local245++) {
										local522 = Static219.anIntArray343[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray196.length; local341++) {
											if (local9.anIntArray196[local341] == local522) {
												local1060 = new Class1_Sub10();
												local1060.aClass66_10 = local9;
												local1060.anObjectArray1 = local9.anObjectArray9;
												Static13.aClass59_8.method1706(local1060);
												break label523;
											}
										}
									}
								}
								local9.anInt2219 = Static159.anInt3143;
							}
							if (local9.anObjectArray16 != null && Static40.anInt5327 > local9.anInt2172) {
								if (local9.anIntArray189 == null || Static40.anInt5327 - local9.anInt2172 > 32) {
									local418 = new Class1_Sub10();
									local418.aClass66_10 = local9;
									local418.anObjectArray1 = local9.anObjectArray16;
									Static13.aClass59_8.method1706(local418);
								} else {
									label499: for (local245 = local9.anInt2172; local245 < Static40.anInt5327; local245++) {
										local522 = Static157.anIntArray118[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray189.length; local341++) {
											if (local9.anIntArray189[local341] == local522) {
												local1060 = new Class1_Sub10();
												local1060.aClass66_10 = local9;
												local1060.anObjectArray1 = local9.anObjectArray16;
												Static13.aClass59_8.method1706(local1060);
												break label499;
											}
										}
									}
								}
								local9.anInt2172 = Static40.anInt5327;
							}
							if (Static135.anInt2712 > local9.anInt2154 && local9.anObjectArray28 != null) {
								local418 = new Class1_Sub10();
								local418.aClass66_10 = local9;
								local418.anObjectArray1 = local9.anObjectArray28;
								Static13.aClass59_8.method1706(local418);
							}
							if (Static70.anInt1491 > local9.anInt2154 && local9.anObjectArray6 != null) {
								local418 = new Class1_Sub10();
								local418.aClass66_10 = local9;
								local418.anObjectArray1 = local9.anObjectArray6;
								Static13.aClass59_8.method1706(local418);
							}
							if (Static274.anInt4956 > local9.anInt2154 && local9.anObjectArray21 != null) {
								local418 = new Class1_Sub10();
								local418.aClass66_10 = local9;
								local418.anObjectArray1 = local9.anObjectArray21;
								Static13.aClass59_8.method1706(local418);
							}
							if (Static49.anInt970 > local9.anInt2154 && local9.anObjectArray29 != null) {
								local418 = new Class1_Sub10();
								local418.aClass66_10 = local9;
								local418.anObjectArray1 = local9.anObjectArray29;
								Static13.aClass59_8.method1706(local418);
							}
							if (Static310.anInt5667 > local9.anInt2154 && local9.anObjectArray3 != null) {
								local418 = new Class1_Sub10();
								local418.aClass66_10 = local9;
								local418.anObjectArray1 = local9.anObjectArray3;
								Static13.aClass59_8.method1706(local418);
							}
							local9.anInt2154 = Static86.anInt1698;
							if (local9.anObjectArray17 != null) {
								for (local245 = 0; local245 < Static112.anInt2331; local245++) {
									@Pc(1524) Class1_Sub10 local1524 = new Class1_Sub10();
									local1524.aClass66_10 = local9;
									local1524.anInt954 = Static162.anIntArray274[local245];
									local1524.anInt955 = Static152.anIntArray43[local245];
									local1524.anObjectArray1 = local9.anObjectArray17;
									Static13.aClass59_8.method1706(local1524);
								}
							}
							if (Static141.aBoolean179 && local9.anObjectArray13 != null) {
								local418 = new Class1_Sub10();
								local418.aClass66_10 = local9;
								local418.anObjectArray1 = local9.anObjectArray13;
								Static13.aClass59_8.method1706(local418);
							}
						}
					}
					if (!local9.aBoolean132 && Static5.aClass66_1 == null && Static168.aClass66_28 == null && !Static249.aBoolean307) {
						if ((local9.anInt2143 >= 0 || local9.anInt2158 != 0) && Static247.anInt4467 >= local61 && Static222.anInt4105 >= local63 && Static247.anInt4467 < local65 && Static222.anInt4105 < local67) {
							if (local9.anInt2143 >= 0) {
								Static7.aClass66_6 = arg0[local9.anInt2143];
							} else {
								Static7.aClass66_6 = local9;
							}
						}
						if (local9.anInt2176 == 8 && Static247.anInt4467 >= local61 && Static222.anInt4105 >= local63 && Static247.anInt4467 < local65 && Static222.anInt4105 < local67) {
							Static188.aClass66_31 = local9;
						}
						if (local9.anInt2215 > local9.anInt2207) {
							Static30.method497(local55, local50 + local9.anInt2204, Static222.anInt4105, local9.anInt2207, Static247.anInt4467, local9.anInt2215, local9);
						}
					}
					if (local9.anInt2176 == 0) {
						method684(arg0, local9.anInt2157, local61, local63, local65, local67, local50 - local9.anInt2191, local55 - local9.anInt2216);
						if (local9.aClass66Array3 != null) {
							method684(local9.aClass66Array3, local9.anInt2157, local61, local63, local65, local67, local50 - local9.anInt2191, local55 - local9.anInt2216);
						}
						@Pc(1689) Class1_Sub25 local1689 = (Class1_Sub25) Static302.aClass142_26.method3543((long) local9.anInt2157);
						if (local1689 != null) {
							Static162.method2785(local1689.anInt4289, local63, local65, local50, local67, local61, local55);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method685() {
		for (@Pc(7) int local7 = 0; local7 < Static295.anInt5297; local7++) {
			@Pc(18) int local18 = Static69.anIntArray452[local7]--;
			if (Static69.anIntArray452[local7] >= -10) {
				@Pc(97) Class169 local97 = Static240.aClass169Array1[local7];
				if (local97 == null) {
					local97 = Static326.method4205(Static15.aClass121_12, Static179.anIntArray290[local7], 0);
					if (local97 == null) {
						continue;
					}
					Static69.anIntArray452[local7] += local97.method4204();
					Static240.aClass169Array1[local7] = local97;
				}
				if (Static69.anIntArray452[local7] < 0) {
					@Pc(143) int local143;
					if (Static142.anIntArray240[local7] == 0) {
						local143 = Static64.anInt1228 * Static152.anIntArray42[local7] >> 8;
					} else {
						@Pc(153) int local153 = (Static142.anIntArray240[local7] & 0xFF) * 128;
						@Pc(161) int local161 = Static142.anIntArray240[local7] >> 16 & 0xFF;
						@Pc(170) int local170 = local161 * 128 + 64 - Static90.aClass15_Sub5_Sub2_2.anInt5559;
						if (local170 < 0) {
							local170 = -local170;
						}
						@Pc(184) int local184 = Static142.anIntArray240[local7] >> 8 & 0xFF;
						@Pc(194) int local194 = local184 * 128 + 64 - Static90.aClass15_Sub5_Sub2_2.anInt5557;
						if (local194 < 0) {
							local194 = -local194;
						}
						@Pc(209) int local209 = local170 + local194 - 128;
						if (local153 < local209) {
							Static69.anIntArray452[local7] = -100;
							continue;
						}
						if (local209 < 0) {
							local209 = 0;
						}
						local143 = Static294.anInt5275 * (local153 - local209) * Static152.anIntArray42[local7] / local153 >> 8;
					}
					if (local143 > 0) {
						@Pc(248) Class1_Sub5_Sub1 local248 = local97.method4206().method1592(Static84.aClass117_1);
						@Pc(253) Class1_Sub24_Sub2 local253 = Static323.method3729(local248, local143);
						local253.method3722(Static302.anIntArray470[local7] - 1);
						Static205.aClass1_Sub24_Sub3_1.method4514(local253);
					}
					Static69.anIntArray452[local7] = -100;
				}
			} else {
				Static295.anInt5297--;
				for (@Pc(32) int local32 = local7; local32 < Static295.anInt5297; local32++) {
					Static179.anIntArray290[local32] = Static179.anIntArray290[local32 + 1];
					Static240.aClass169Array1[local32] = Static240.aClass169Array1[local32 + 1];
					Static302.anIntArray470[local32] = Static302.anIntArray470[local32 + 1];
					Static69.anIntArray452[local32] = Static69.anIntArray452[local32 + 1];
					Static142.anIntArray240[local32] = Static142.anIntArray240[local32 + 1];
					Static152.anIntArray42[local32] = Static152.anIntArray42[local32 + 1];
				}
				local7--;
			}
		}
		if (Static152.aBoolean36 && !Static69.method4276()) {
			if (Static182.anInt3491 != 0 && Static273.anInt4944 != -1) {
				Static189.method3084(Static182.anInt3491, Static273.anInt4944, Static308.aClass121_135);
			}
			Static152.aBoolean36 = false;
		} else if (Static182.anInt3491 != 0 && Static273.anInt4944 != -1 && !Static69.method4276()) {
			Static127.aClass1_Sub14_Sub1_3.method1408(247);
			Static127.aClass1_Sub14_Sub1_3.method1387(Static273.anInt4944);
			Static273.anInt4944 = -1;
		}
	}
}
