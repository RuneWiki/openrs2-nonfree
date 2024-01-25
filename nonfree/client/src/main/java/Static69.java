import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Ljava/lang/String;")
	public static String aString17 = null;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1324() {
		Static588.anInt9702 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static228.anInt4647; local3++) {
			@Pc(14) Class11_Sub1_Sub1_Sub2_Sub2 local14 = ((Class2_Sub51) Static357.aClass222_23.method5468((long) Static160.anIntArray256[local3])).aClass11_Sub1_Sub1_Sub2_Sub2_2;
			if (local14.aBoolean276 && local14.method2775() != -1) {
				@Pc(32) int local32 = (local14.method2778() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt9925 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt9929 - local32 >> 9;
				@Pc(53) Class11_Sub1_Sub1_Sub2 local53 = Static452.method7679(local14.aByte124, local46, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt3246;
					if (local53 instanceof Class11_Sub1_Sub1_Sub2_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt3265 == 0 && local53.method2775() != -1) {
						Static458.anIntArray544[Static588.anInt9702] = local58;
						Static345.anIntArray417[Static588.anInt9702] = local58;
						Static588.anInt9702++;
						local53.anInt3265++;
					}
					Static458.anIntArray544[Static588.anInt9702] = local58;
					Static345.anIntArray417[Static588.anInt9702] = local14.anInt3246 + 2048;
					Static588.anInt9702++;
					local53.anInt3265++;
				}
			}
		}
		Static634.method8501(Static458.anIntArray544, 0, Static588.anInt9702 - 1, Static345.anIntArray417);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!dm;)Lclient!dm;")
	public static Class78 method1325(@OriginalArg(0) Class78 arg0) {
		@Pc(4) int local4 = method1332(arg0).method6403();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static180.method3291(arg0.anInt1967);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1328(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static571.anInt9395;
		@Pc(3) int[] local3 = Static131.anIntArray213;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static228.anInt4647; local5++) {
			@Pc(15) Class11_Sub1_Sub1_Sub2 local15;
			if (local5 < local1) {
				local15 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class2_Sub51) Static357.aClass222_23.method5468((long) Static160.anIntArray256[local5 - local1])).aClass11_Sub1_Sub1_Sub2_Sub2_2;
			}
			if (local15.aByte124 == arg0 && local15.anInt3245 >= 0) {
				@Pc(39) int local39 = local15.method2778();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9925 & 0x1FF) != 0 || (local15.anInt9929 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9925 & 0x1FF) != 256 || (local15.anInt9929 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9925 >> 9;
					local80 = local15.anInt9929 >> 9;
					if (local15.anInt3245 > Static39.anIntArrayArray93[local75][local80]) {
						Static39.anIntArrayArray93[local75][local80] = local15.anInt3245;
						Static277.anIntArrayArray47[local75][local80] = 1;
					} else if (local15.anInt3245 == Static39.anIntArrayArray93[local75][local80]) {
						local116 = Static277.anIntArrayArray47[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt9925 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt9929 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt9925 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt9929 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt3245 > Static39.anIntArrayArray93[local158][local161]) {
								Static39.anIntArrayArray93[local158][local161] = local15.anInt3245;
								Static277.anIntArrayArray47[local158][local161] = 1;
							} else if (local15.anInt3245 == Static39.anIntArrayArray93[local158][local161]) {
								local116 = Static277.anIntArrayArray47[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1329() {
		@Pc(1) int local1 = Static571.anInt9395;
		@Pc(3) int[] local3 = Static131.anIntArray213;
		@Pc(11) int local11 = Static399.aBoolean530 ? local1 : local1 + Static228.anInt4647;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub1_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub51) Static357.aClass222_23.method5468((long) Static160.anIntArray256[local13 - local1])).aClass11_Sub1_Sub1_Sub2_Sub2_2;
			}
			if (local23.anInt3245 >= 0) {
				@Pc(43) int local43 = local23.method2778();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9925 & 0x1FF) == 0 && (local23.anInt9929 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt9925 & 0x1FF) == 256 && (local23.anInt9929 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt9930 = Static582.method8038(local23.aByte124, local23.anInt9925, local23.anInt9929);
				Static381.method5741(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1330(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static571.anInt9395;
		@Pc(3) int[] local3 = Static131.anIntArray213;
		@Pc(11) int local11 = Static399.aBoolean530 ? local1 : local1 + Static228.anInt4647;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub1_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub51) Static357.aClass222_23.method5468((long) Static160.anIntArray256[local13 - local1])).aClass11_Sub1_Sub1_Sub2_Sub2_2;
			}
			if (local23.aByte124 == arg0) {
				local23.anInt3265 = 0;
				if (local23.anInt3245 < 0) {
					local23.aBoolean276 = false;
				} else {
					@Pc(54) int local54 = local23.method2778();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9925 & 0x1FF) != 0 || (local23.anInt9929 & 0x1FF) != 0) {
							local23.aBoolean276 = false;
							continue;
						}
					} else if ((local23.anInt9925 & 0x1FF) != 256 || (local23.anInt9929 & 0x1FF) != 256) {
						local23.aBoolean276 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9925 >> 9;
						local101 = local23.anInt9929 >> 9;
						if (local23.anInt3245 != Static39.anIntArrayArray93[local96][local101]) {
							local23.aBoolean276 = true;
							continue;
						}
						if (Static277.anIntArrayArray47[local96][local101] > 1) {
							local126 = Static277.anIntArrayArray47[local96][local101]--;
							local23.aBoolean276 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt9925 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt9929 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt9925 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt9929 + local96 >> 9;
						if (!Static299.method4659(local155, local101, local162, local169, local23.anInt3245)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt3245 == Static39.anIntArrayArray93[local180][local183]) {
										local126 = Static277.anIntArrayArray47[local180][local183]--;
									}
								}
							}
							local23.aBoolean276 = true;
							continue;
						}
					}
					local23.aBoolean276 = false;
					local23.anInt9930 = Static582.method8038(local23.aByte124, local23.anInt9925, local23.anInt9929);
					Static381.method5741(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1331() {
		@Pc(1) int local1 = Static571.anInt9395;
		@Pc(3) int[] local3 = Static131.anIntArray213;
		@Pc(8) int local8 = Static404.aClass2_Sub13_2.aClass33_Sub14_1.method4721();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class11_Sub1_Sub1_Sub2_Sub1 local32 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local3[local25]];
			if (!local32.method420()) {
				local32.anInt3245 = -1;
			} else if (local32.aBoolean48) {
				local32.anInt3245 = -1;
			} else {
				local32.method5637();
				if (local32.aShort95 >= 0 && local32.aShort97 >= 0 && local32.aShort96 < Static3.anInt46 && local32.aShort94 < Static270.anInt5194) {
					local32.aBoolean46 = local32.aBoolean275 ? local23 : false;
					if (local32 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2) {
						local32.anInt3245 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean276) {
							local85++;
						}
						if (local32.anInt3267 > Static325.anInt5888) {
							local85 += 2;
						}
						local85 += 5 - local32.method2778() << 2;
						if (local32.aBoolean47) {
							local85 += 512;
						} else {
							if (Static323.anInt5856 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt3245 = local85 + 1;
					}
				} else {
					local32.anInt3245 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static228.anInt4647; local126++) {
			@Pc(137) Class11_Sub1_Sub1_Sub2_Sub2 local137 = ((Class2_Sub51) Static357.aClass222_23.method5468((long) Static160.anIntArray256[local126])).aClass11_Sub1_Sub1_Sub2_Sub2_2;
			if (local137.method2780() && local137.aClass236_1.method5792(Static438.aClass198_1)) {
				local137.method5637();
				if (local137.aShort95 >= 0 && local137.aShort97 >= 0 && local137.aShort96 < Static3.anInt46 && local137.aShort94 < Static270.anInt5194) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean276) {
						local174++;
					}
					if (local137.anInt3267 > Static325.anInt5888) {
						local174 += 2;
					}
					local174 += 5 - local137.method2778() << 2;
					if (Static323.anInt5856 == 0) {
						if (local137.aClass236_1.aBoolean516) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static323.anInt5856 == 1) {
						if (local137.aClass236_1.aBoolean516) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass236_1.aBoolean518) {
						local174 += 1024;
					} else if (!local137.aClass236_1.aBoolean520) {
						local174 += 256;
					}
					local137.anInt3245 = local174 + 1;
				} else {
					local137.anInt3245 = -1;
				}
			} else {
				local137.anInt3245 = -1;
			}
		}
		for (local85 = 0; local85 < Static388.aClass60Array1.length; local85++) {
			@Pc(240) Class60 local240 = Static388.aClass60Array1[local85];
			if (local240 != null) {
				if (local240.anInt1599 == 1) {
					@Pc(254) Class2_Sub51 local254 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local240.anInt1606);
					if (local254 != null) {
						@Pc(259) Class11_Sub1_Sub1_Sub2_Sub2 local259 = local254.aClass11_Sub1_Sub1_Sub2_Sub2_2;
						if (local259.anInt3245 >= 0) {
							local259.anInt3245 += 2048;
						}
					}
				} else if (local240.anInt1599 == 10) {
					@Pc(278) Class11_Sub1_Sub1_Sub2_Sub1 local278 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local240.anInt1606];
					if (local278 != null && local278 != Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 && local278.anInt3245 >= 0) {
						local278.anInt3245 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!dm;)Lclient!pba;")
	public static Class2_Sub40 method1332(@OriginalArg(0) Class78 arg0) {
		@Pc(13) Class2_Sub40 local13 = (Class2_Sub40) Static297.aClass222_20.method5468(((long) arg0.anInt1968 << 32) + (long) arg0.anInt1978);
		return local13 == null ? arg0.aClass2_Sub40_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1333() {
		for (@Pc(1) int local1 = 0; local1 < Static3.anInt46; local1++) {
			@Pc(6) int[] local6 = Static39.anIntArrayArray93[local1];
			for (@Pc(8) int local8 = 0; local8 < Static270.anInt5194; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I")
	public static int method1334(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!dm;IIIIIIIIIII)V")
	public static void method1335(@OriginalArg(0) Class78[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class78 local6 = arg0[local1];
			if (local6 != null && local6.anInt1967 == arg1) {
				@Pc(17) int local17 = local6.anInt1928 + arg6;
				@Pc(22) int local22 = local6.anInt2005 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt1955 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt1964;
					local45 = local22 + local6.anInt1991;
					if (local6.anInt1955 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt1955 == 0 || local6.aBoolean165 || method1332(local6).anInt7661 != 0 || local6 == Static217.aClass78_7 || local6.anInt1940 == Static17.anInt566 || local6.anInt1940 == Static402.anInt6427) {
					if (!method1336(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static558.aBoolean680) {
							local40 = Static257.method4233();
							local45 = Static290.method4545();
						}
						if (local6 == Static112.aClass78_4 && Static40.method838(Static112.aClass78_4) != null) {
							Static360.aBoolean486 = true;
							Static245.anInt4849 = local17;
							Static636.anInt10184 = local22;
						}
						if (local6.aBoolean172 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean174 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class2_Sub42 local168 = (Class2_Sub42) Static564.aClass238_54.method5833(); local168 != null; local168 = (Class2_Sub42) Static564.aClass238_54.method5838()) {
									if (local168.aBoolean612) {
										local168.method8599();
										local168.aClass78_9.aBoolean178 = false;
									}
								}
								if (Static543.anInt9040 == 0) {
									Static112.aClass78_4 = null;
									Static217.aClass78_7 = null;
								}
								Static100.anInt2017 = 0;
								Static597.aBoolean720 = false;
								Static247.aBoolean410 = false;
								if (!Static642.aBoolean757) {
									Static248.method4051();
								}
							}
							@Pc(232) boolean local232;
							if (Static6.aClass40_1.method4504() + local40 >= local28 && Static6.aClass40_1.method4499() + local45 >= local30 && Static6.aClass40_1.method4504() + local40 < local32 && Static6.aClass40_1.method4499() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static301.aBoolean423 && local232) {
								if (local6.anInt1998 >= 0) {
									Static385.anInt6934 = local6.anInt1998;
								} else if (local6.aBoolean174) {
									Static385.anInt6934 = -1;
								}
							}
							if (!Static642.aBoolean757 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static405.method6251(arg11 - local22, arg10 - local17, local6);
							}
							@Pc(276) boolean local276 = false;
							if (Static6.aClass40_1.method4496() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class2_Sub32 local291 = (Class2_Sub32) Static72.aClass238_9.method5833();
							if (local291 != null && local291.method8561() == 0 && local291.method8558() + local40 >= local28 && local291.method8563() + local45 >= local30 && local291.method8558() + local40 < local32 && local291.method8563() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray26 != null && !Static491.method7024()) {
								for (local335 = 0; local335 < local6.aByteArray26.length; local335++) {
									if (Static63.aClass32_1.method789(local6.aByteArray26[local335])) {
										if (local6.anIntArray173 == null || Static325.anInt5888 >= local6.anIntArray173[local335]) {
											@Pc(367) byte local367 = local6.aByteArray25[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static63.aClass32_1.method789(86) && !Static63.aClass32_1.method789(82) && !Static63.aClass32_1.method789(81)) && ((local367 & 0x2) == 0 || Static63.aClass32_1.method789(86)) && ((local367 & 0x1) == 0 || Static63.aClass32_1.method789(82)) && ((local367 & 0x4) == 0 || Static63.aClass32_1.method789(81))) {
												if (local335 < 10) {
													Static20.method475(-1, local335 + 1, "", local6.anInt1968);
												} else if (local335 == 10) {
													Static171.method3178();
													@Pc(438) Class2_Sub40 local438 = method1332(local6);
													Static545.method7612(local438.method6409(), local438.anInt7657, local6);
													Static81.aString20 = Static371.method5590(local6);
													if (Static81.aString20 == null) {
														Static81.aString20 = "Null";
													}
													Static109.aString27 = local6.aString23 + "<col=ffffff>";
												}
												local469 = local6.anIntArray176[local335];
												if (local6.anIntArray173 == null) {
													local6.anIntArray173 = new int[local6.aByteArray26.length];
												}
												if (local469 == 0) {
													local6.anIntArray173[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray173[local335] = Static325.anInt5888 + local469;
												}
											}
										}
									} else if (local6.anIntArray173 != null) {
										local6.anIntArray173[local335] = 0;
									}
								}
							}
							if (local286) {
								Static98.method1685(local6, local40 + local291.method8558() - local17, local45 + local291.method8563() - local22);
							}
							if (Static112.aClass78_4 != null && Static112.aClass78_4 != local6 && local232 && method1332(local6).method6406()) {
								Static112.aClass78_5 = local6;
							}
							if (local6 == Static217.aClass78_7) {
								Static642.aBoolean759 = true;
								Static30.anInt6666 = local17;
								Static580.anInt9544 = local22;
							}
							if (local6.aBoolean165 || local6.anInt1940 != 0) {
								@Pc(558) Class2_Sub42 local558;
								if (local232 && Static597.anInt9839 != 0 && local6.anObjectArray29 != null) {
									local558 = new Class2_Sub42();
									local558.aBoolean612 = true;
									local558.aClass78_9 = local6;
									local558.anInt8131 = Static597.anInt9839;
									local558.anObjectArray33 = local6.anObjectArray29;
									Static564.aClass238_54.method5837(local558);
								}
								if (Static112.aClass78_4 != null || Static642.aBoolean757 || local6.anInt1940 != Static87.anInt1791 && Static100.anInt2017 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt1940 != 0) {
									if (local6.anInt1940 == Static227.anInt4636 || local6.anInt1940 == Static493.anInt8410) {
										Static555.aClass78_10 = local6;
										if (Static587.aClass17_1 != null) {
											Static587.aClass17_1.method328(local6.anInt1991, Static600.aClass87_15);
										}
										if (local6.anInt1940 == Static227.anInt4636) {
											if (Static642.aBoolean757 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static75.method1452(arg9, arg8, Static600.aClass87_15);
											@Pc(641) Class11_Sub3 local641 = (Class11_Sub3) Static49.aClass143_2.method3536();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt2992 && arg10 < local641.anInt2991 && arg11 >= local641.anInt2993 && arg11 < local641.anInt2990) {
													Static248.method4051();
													Static140.method2668(local641.aClass11_Sub1_Sub1_Sub2_1);
												}
												local641 = (Class11_Sub3) Static49.aClass143_2.method3528();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt1940 == Static17.anInt566) {
										if (local6.method1693(Static600.aClass87_15) == null || Static511.anInt7699 != 0 && Static511.anInt7699 != 3 || Static642.aBoolean757 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray181[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray178[local708]) {
											continue;
										}
										local335 -= local6.anInt1964 / 2;
										local708 -= local6.anInt1991 / 2;
										if (Static2.anInt31 == 4) {
											local747 = (int) Static378.aFloat160 & 0x3FFF;
										} else {
											local747 = (int) Static378.aFloat160 + Static415.anInt7576 & 0x3FFF;
										}
										@Pc(759) int local759 = Class353.anIntArray681[local747];
										@Pc(763) int local763 = Class353.anIntArray682[local747];
										if (Static2.anInt31 != 4) {
											local759 = local759 * (Static30.anInt6668 + 256) >> 8;
											local763 = local763 * (Static30.anInt6668 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static2.anInt31 == 4) {
											local813 = (Static215.anInt4487 >> 9) + (local792 >> 2);
											local821 = (Static61.anInt1274 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method2778() - 1) * 256;
											local813 = (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 - local830 >> 9) + (local792 >> 2);
											local821 = (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 - local830 >> 9) - (local802 >> 2);
										}
										if (Static301.aBoolean423 && (Static73.anInt1590 & 0x40) != 0) {
											@Pc(863) Class78 local863 = Static496.method7080(Static342.anInt6258, Static590.anInt9763);
											if (local863 == null) {
												Static171.method3178();
											} else {
												Static115.method1856((long) (local6.anInt1978 << 0 | local6.anInt1968), " ->", local813, 1L, true, Static81.aString20, 21, true, local821, false, Static20.anInt623, local6.anInt2006);
											}
											continue;
										}
										if (Static499.aClass63_15 == Static230.aClass63_16) {
											Static115.method1856(0L, "", local813, 1L, true, Static628.aClass369_27.method8475(Static377.anInt6756), 19, true, local821, false, -1, -1);
										}
										Static115.method1856(0L, "", local813, 1L, true, Static256.aString51, 16, true, local821, false, Static350.anInt6442, -1);
										continue;
									}
									if (local6.anInt1940 == Static87.anInt1791) {
										Static71.aClass78_1 = local6;
										if (local232) {
											Static597.aBoolean720 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method8558() - local17 - local6.anInt1964 / 2) * 2.0D / (double) Static292.aFloat211);
											local708 = (int) -((double) (local45 + local291.method8563() - local22 - local6.anInt1991 / 2) * 2.0D / (double) Static292.aFloat211);
											local469 = Static416.anInt7592 + local335 + Static292.anInt8373;
											local747 = Static304.anInt5622 + local708 + Static292.anInt8380;
											@Pc(994) Class2_Sub5_Sub19 local994 = Static278.method4445();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method7275(local747, local999, local469);
											if (local999 != null) {
												if (Static63.aClass32_1.method789(82) && Static278.anInt5322 > 0) {
													Static185.method3333(local999[1], local999[0], local999[2]);
													continue;
												}
												Static247.aBoolean410 = true;
												Static38.anInt932 = local999[0];
												Static635.anInt10177 = local999[1];
												Static382.anInt6844 = local999[2];
											}
											Static100.anInt2017 = 1;
											Static251.aBoolean397 = false;
											Static622.anInt10098 = Static6.aClass40_1.method4504();
											Static150.anInt3484 = Static6.aClass40_1.method4499();
											continue;
										}
										if (local276 && Static100.anInt2017 > 0) {
											if (Static100.anInt2017 == 1 && (Static622.anInt10098 != Static6.aClass40_1.method4504() || Static150.anInt3484 != Static6.aClass40_1.method4499())) {
												Static597.anInt9847 = Static416.anInt7592;
												Static353.anInt6490 = Static304.anInt5622;
												Static100.anInt2017 = 2;
											}
											if (Static100.anInt2017 == 2) {
												Static251.aBoolean397 = true;
												Static317.method4796(Static597.anInt9847 + (int) ((double) (Static622.anInt10098 - Static6.aClass40_1.method4504()) * 2.0D / (double) Static292.aFloat212));
												Static372.method5609(Static353.anInt6490 - (int) ((double) (Static150.anInt3484 - Static6.aClass40_1.method4499()) * 2.0D / (double) Static292.aFloat212));
											}
											continue;
										}
										if (Static100.anInt2017 > 0 && !Static251.aBoolean397) {
											if ((Static163.anInt3666 == 1 || Static457.method6671()) && Static90.anInt1824 > 2) {
												Static425.method4453(Static150.anInt3484, Static622.anInt10098);
											} else if (Static56.method1027()) {
												Static425.method4453(Static150.anInt3484, Static622.anInt10098);
											}
										}
										Static100.anInt2017 = 0;
										continue;
									}
									if (local6.anInt1940 == Static78.anInt1694) {
										if (local276) {
											Static48.method947(local40 + Static6.aClass40_1.method4504() - local17, local6.anInt1964, local45 + Static6.aClass40_1.method4499() - local22, local6.anInt1991);
										}
										continue;
									}
									if (local6.anInt1940 == Static402.anInt6427) {
										Static475.method7387(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean171 && local286) {
									local6.aBoolean171 = true;
									if (local6.anObjectArray24 != null) {
										local558 = new Class2_Sub42();
										local558.aBoolean612 = true;
										local558.aClass78_9 = local6;
										local558.anInt8127 = local40 + local291.method8558() - local17;
										local558.anInt8131 = local45 + local291.method8563() - local22;
										local558.anObjectArray33 = local6.anObjectArray24;
										Static564.aClass238_54.method5837(local558);
									}
								}
								if (local6.aBoolean171 && local276 && local6.anObjectArray2 != null) {
									local558 = new Class2_Sub42();
									local558.aBoolean612 = true;
									local558.aClass78_9 = local6;
									local558.anInt8127 = local40 + Static6.aClass40_1.method4504() - local17;
									local558.anInt8131 = local45 + Static6.aClass40_1.method4499() - local22;
									local558.anObjectArray33 = local6.anObjectArray2;
									Static564.aClass238_54.method5837(local558);
								}
								if (local6.aBoolean171 && !local276) {
									local6.aBoolean171 = false;
									if (local6.anObjectArray21 != null) {
										local558 = new Class2_Sub42();
										local558.aBoolean612 = true;
										local558.aClass78_9 = local6;
										local558.anInt8127 = local40 + Static6.aClass40_1.method4504() - local17;
										local558.anInt8131 = local45 + Static6.aClass40_1.method4499() - local22;
										local558.anObjectArray33 = local6.anObjectArray21;
										Static98.aClass238_11.method5837(local558);
									}
								}
								if (local276 && local6.anObjectArray6 != null) {
									local558 = new Class2_Sub42();
									local558.aBoolean612 = true;
									local558.aClass78_9 = local6;
									local558.anInt8127 = local40 + Static6.aClass40_1.method4504() - local17;
									local558.anInt8131 = local45 + Static6.aClass40_1.method4499() - local22;
									local558.anObjectArray33 = local6.anObjectArray6;
									Static564.aClass238_54.method5837(local558);
								}
								if (!local6.aBoolean178 && local232) {
									local6.aBoolean178 = true;
									if (local6.anObjectArray3 != null) {
										local558 = new Class2_Sub42();
										local558.aBoolean612 = true;
										local558.aClass78_9 = local6;
										local558.anInt8127 = local40 + Static6.aClass40_1.method4504() - local17;
										local558.anInt8131 = local45 + Static6.aClass40_1.method4499() - local22;
										local558.anObjectArray33 = local6.anObjectArray3;
										Static564.aClass238_54.method5837(local558);
									}
								}
								if (local6.aBoolean178 && local232 && local6.anObjectArray26 != null) {
									local558 = new Class2_Sub42();
									local558.aBoolean612 = true;
									local558.aClass78_9 = local6;
									local558.anInt8127 = local40 + Static6.aClass40_1.method4504() - local17;
									local558.anInt8131 = local45 + Static6.aClass40_1.method4499() - local22;
									local558.anObjectArray33 = local6.anObjectArray26;
									Static564.aClass238_54.method5837(local558);
								}
								if (local6.aBoolean178 && !local232) {
									local6.aBoolean178 = false;
									if (local6.anObjectArray25 != null) {
										local558 = new Class2_Sub42();
										local558.aBoolean612 = true;
										local558.aClass78_9 = local6;
										local558.anInt8127 = local40 + Static6.aClass40_1.method4504() - local17;
										local558.anInt8131 = local45 + Static6.aClass40_1.method4499() - local22;
										local558.anObjectArray33 = local6.anObjectArray25;
										Static98.aClass238_11.method5837(local558);
									}
								}
								if (local6.anObjectArray12 != null) {
									local558 = new Class2_Sub42();
									local558.aClass78_9 = local6;
									local558.anObjectArray33 = local6.anObjectArray12;
									Static378.aClass238_41.method5837(local558);
								}
								@Pc(1570) Class2_Sub42 local1570;
								if (local6.anObjectArray18 != null && Static571.anInt9391 > local6.anInt1921) {
									if (local6.anIntArray182 == null || Static571.anInt9391 - local6.anInt1921 > 32) {
										local558 = new Class2_Sub42();
										local558.aClass78_9 = local6;
										local558.anObjectArray33 = local6.anObjectArray18;
										Static564.aClass238_54.method5837(local558);
									} else {
										label687: for (local335 = local6.anInt1921; local335 < Static571.anInt9391; local335++) {
											local708 = Static239.anIntArray567[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray182.length; local469++) {
												if (local6.anIntArray182[local469] == local708) {
													local1570 = new Class2_Sub42();
													local1570.aClass78_9 = local6;
													local1570.anObjectArray33 = local6.anObjectArray18;
													Static564.aClass238_54.method5837(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt1921 = Static571.anInt9391;
								}
								if (local6.anObjectArray28 != null && Static325.anInt5891 > local6.anInt1939) {
									if (local6.anIntArray179 == null || Static325.anInt5891 - local6.anInt1939 > 32) {
										local558 = new Class2_Sub42();
										local558.aClass78_9 = local6;
										local558.anObjectArray33 = local6.anObjectArray28;
										Static564.aClass238_54.method5837(local558);
									} else {
										label663: for (local335 = local6.anInt1939; local335 < Static325.anInt5891; local335++) {
											local708 = Static448.anIntArray542[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray179.length; local469++) {
												if (local6.anIntArray179[local469] == local708) {
													local1570 = new Class2_Sub42();
													local1570.aClass78_9 = local6;
													local1570.anObjectArray33 = local6.anObjectArray28;
													Static564.aClass238_54.method5837(local1570);
													break label663;
												}
											}
										}
									}
									local6.anInt1939 = Static325.anInt5891;
								}
								if (local6.anObjectArray11 != null && Static372.anInt6644 > local6.anInt1922) {
									if (local6.anIntArray177 == null || Static372.anInt6644 - local6.anInt1922 > 32) {
										local558 = new Class2_Sub42();
										local558.aClass78_9 = local6;
										local558.anObjectArray33 = local6.anObjectArray11;
										Static564.aClass238_54.method5837(local558);
									} else {
										label639: for (local335 = local6.anInt1922; local335 < Static372.anInt6644; local335++) {
											local708 = Static262.anIntArray350[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray177.length; local469++) {
												if (local6.anIntArray177[local469] == local708) {
													local1570 = new Class2_Sub42();
													local1570.aClass78_9 = local6;
													local1570.anObjectArray33 = local6.anObjectArray11;
													Static564.aClass238_54.method5837(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt1922 = Static372.anInt6644;
								}
								if (local6.anObjectArray10 != null && Static440.anInt7805 > local6.anInt1980) {
									if (local6.anIntArray174 == null || Static440.anInt7805 - local6.anInt1980 > 32) {
										local558 = new Class2_Sub42();
										local558.aClass78_9 = local6;
										local558.anObjectArray33 = local6.anObjectArray10;
										Static564.aClass238_54.method5837(local558);
									} else {
										label615: for (local335 = local6.anInt1980; local335 < Static440.anInt7805; local335++) {
											local708 = Static18.anIntArray46[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray174.length; local469++) {
												if (local6.anIntArray174[local469] == local708) {
													local1570 = new Class2_Sub42();
													local1570.aClass78_9 = local6;
													local1570.anObjectArray33 = local6.anObjectArray10;
													Static564.aClass238_54.method5837(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt1980 = Static440.anInt7805;
								}
								if (local6.anObjectArray1 != null && Static596.anInt9835 > local6.anInt2011) {
									if (local6.anIntArray175 == null || Static596.anInt9835 - local6.anInt2011 > 32) {
										local558 = new Class2_Sub42();
										local558.aClass78_9 = local6;
										local558.anObjectArray33 = local6.anObjectArray1;
										Static564.aClass238_54.method5837(local558);
									} else {
										label591: for (local335 = local6.anInt2011; local335 < Static596.anInt9835; local335++) {
											local708 = Static89.anIntArray164[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray175.length; local469++) {
												if (local6.anIntArray175[local469] == local708) {
													local1570 = new Class2_Sub42();
													local1570.aClass78_9 = local6;
													local1570.anObjectArray33 = local6.anObjectArray1;
													Static564.aClass238_54.method5837(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt2011 = Static596.anInt9835;
								}
								if (Static284.anInt9999 > local6.anInt1933 && local6.anObjectArray9 != null) {
									local558 = new Class2_Sub42();
									local558.aClass78_9 = local6;
									local558.anObjectArray33 = local6.anObjectArray9;
									Static564.aClass238_54.method5837(local558);
								}
								if (Static207.anInt4343 > local6.anInt1933 && local6.anObjectArray5 != null) {
									local558 = new Class2_Sub42();
									local558.aClass78_9 = local6;
									local558.anObjectArray33 = local6.anObjectArray5;
									Static564.aClass238_54.method5837(local558);
								}
								if (Static229.anInt4654 > local6.anInt1933 && local6.anObjectArray4 != null) {
									local558 = new Class2_Sub42();
									local558.aClass78_9 = local6;
									local558.anObjectArray33 = local6.anObjectArray4;
									Static564.aClass238_54.method5837(local558);
								}
								if (Static181.anInt4008 > local6.anInt1933 && local6.anObjectArray13 != null) {
									local558 = new Class2_Sub42();
									local558.aClass78_9 = local6;
									local558.anObjectArray33 = local6.anObjectArray13;
									Static564.aClass238_54.method5837(local558);
								}
								if (Static366.anInt6576 > local6.anInt1933 && local6.anObjectArray20 != null) {
									local558 = new Class2_Sub42();
									local558.aClass78_9 = local6;
									local558.anObjectArray33 = local6.anObjectArray20;
									Static564.aClass238_54.method5837(local558);
								}
								local6.anInt1933 = Static44.anInt975;
								if (local6.anObjectArray30 != null) {
									for (local335 = 0; local335 < Static470.anInt8064; local335++) {
										@Pc(2038) Class2_Sub42 local2038 = new Class2_Sub42();
										local2038.aClass78_9 = local6;
										local2038.anInt8133 = Static15.anInterface16Array1[local335].method4735();
										local2038.anInt8128 = Static15.anInterface16Array1[local335].method4737();
										local2038.anObjectArray33 = local6.anObjectArray30;
										Static564.aClass238_54.method5837(local2038);
									}
								}
								if (Static405.aBoolean562 && local6.anObjectArray23 != null) {
									local558 = new Class2_Sub42();
									local558.aClass78_9 = local6;
									local558.anObjectArray33 = local6.anObjectArray23;
									Static564.aClass238_54.method5837(local558);
								}
							}
							if (local6.anInt1955 == 5 && local6.anInt1945 != -1) {
								local6.method1702(Static571.aClass169_1, Static576.aClass343_1).method328(local6.anInt1991, Static600.aClass87_15);
							}
							Static272.method4391(local6);
							if (local6.anInt1955 == 0) {
								method1335(arg0, local6.anInt1968, local28, local30, local32, local34, local17 - local6.anInt1966, local22 - local6.anInt2009, arg8, arg9, arg10, arg11);
								if (local6.aClass78Array9 != null) {
									method1335(local6.aClass78Array9, local6.anInt1968, local28, local30, local32, local34, local17 - local6.anInt1966, local22 - local6.anInt2009, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class2_Sub37 local2164 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local6.anInt1968);
								if (local2164 != null) {
									if (Static499.aClass63_15 == Static239.aClass63_14 && local2164.anInt6849 == 0 && !Static642.aBoolean757 && local232 && !Static612.aBoolean735) {
										Static248.method4051();
									}
									Static609.method8335(arg8, local22, arg10, local34, local30, local28, local2164.anInt6848, arg9, local17, arg11, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static272.method4391(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!dm;)Z")
	public static boolean method1336(@OriginalArg(0) Class78 arg0) {
		if (Static612.aBoolean735) {
			if (method1332(arg0).anInt7661 != 0) {
				return false;
			}
			if (arg0.anInt1955 == 0) {
				return false;
			}
		}
		return arg0.aBoolean167;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ud;IB)V")
	public static void method1342(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(1) int arg1) {
		if (Static215.aClass31_4 == null) {
			return;
		}
		try {
			Static215.aClass31_4.method755(0L);
			Static215.aClass31_4.method759(arg1, 24, arg0.aByteArray77);
		} catch (@Pc(19) Exception local19) {
		}
	}
}
