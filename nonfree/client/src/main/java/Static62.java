import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!kda;")
	public static Class160 aClass160_16;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!gw;")
	public static Class1_Sub13 aClass1_Sub13_1;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!hn;")
	public static final Class123 aClass123_3 = new Class123();

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	public static int anInt1821 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!vp;)Lclient!ww;")
	public static Class1_Sub51 method1740(@OriginalArg(0) Class309 arg0) {
		@Pc(13) Class1_Sub51 local13 = (Class1_Sub51) Static494.aClass174_36.method4422(((long) arg0.anInt8750 << 32) + (long) arg0.anInt8726);
		return local13 == null ? arg0.aClass1_Sub51_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	public static void method1741(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static412.anInt7191;
		@Pc(3) int[] local3 = Static349.anIntArray479;
		@Pc(11) int local11 = Static17.aBoolean59 ? local1 : local1 + Static457.anInt7857;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class47_Sub2_Sub3 local23;
			if (local13 < local1) {
				local23 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub10) Static258.aClass174_15.method4422((long) Static386.anIntArray503[local13 - local1])).aClass47_Sub2_Sub3_Sub1_2;
			}
			if (local23.aByte94 == arg0) {
				local23.anInt5002 = 0;
				if (local23.anInt5023 < 0) {
					local23.aBoolean342 = false;
				} else {
					@Pc(54) int local54 = local23.method4350();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8189 & 0x7F) != 0 || (local23.anInt8191 & 0x7F) != 0) {
							local23.aBoolean342 = false;
							continue;
						}
					} else if ((local23.anInt8189 & 0x7F) != 64 || (local23.anInt8191 & 0x7F) != 64) {
						local23.aBoolean342 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8189 >> 7;
						local101 = local23.anInt8191 >> 7;
						if (local23.anInt5023 != Static520.anIntArrayArray94[local96][local101]) {
							local23.aBoolean342 = true;
							continue;
						}
						if (Static443.anIntArrayArray74[local96][local101] > 1) {
							local126 = Static443.anIntArrayArray74[local96][local101]--;
							local23.aBoolean342 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt8189 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt8191 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt8189 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt8191 + local96 >> 7;
						if (!Static164.method3257(local101, local169, local155, local162, local23.anInt5023)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt5023 == Static520.anIntArrayArray94[local180][local183]) {
										local126 = Static443.anIntArrayArray74[local180][local183]--;
									}
								}
							}
							local23.aBoolean342 = true;
							continue;
						}
					}
					if (local23 instanceof Class47_Sub2_Sub3_Sub2 && local23.aClass1_Sub47_3 != null && Static416.anInt7252 >= local23.aClass1_Sub47_3.anInt8052 && Static416.anInt7252 < local23.aClass1_Sub47_3.anInt8051) {
						((Class47_Sub2_Sub3_Sub2) local23).aBoolean347 = false;
					}
					local23.aBoolean342 = false;
					local23.anInt8192 = Static74.method1954(local23.aByte94, local23.anInt8191, local23.anInt8189);
					Static346.method5547(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1746() {
		@Pc(1) int local1 = Static412.anInt7191;
		@Pc(3) int[] local3 = Static349.anIntArray479;
		@Pc(20) boolean local20 = Static89.aClass1_Sub28_Sub1_1.anInt4892 == 1 && local1 > 200 || Static89.aClass1_Sub28_Sub1_1.anInt4892 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class47_Sub2_Sub3_Sub2 local29 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local3[local22]];
			if (local29.method4370()) {
				local29.method6952();
				if (local29.aShort115 >= 0 && local29.aShort117 >= 0 && local29.aShort116 < Static542.anInt9387 && local29.aShort114 < Static36.anInt1324) {
					local29.aBoolean347 = local29.aBoolean343 ? local20 : false;
					if (local29 == Static16.aClass47_Sub2_Sub3_Sub2_1) {
						local29.anInt5023 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean342) {
							local75++;
						}
						if (local29.anInt5046 > Static416.anInt7252) {
							local75 += 2;
						}
						local75 += 5 - local29.method4350() << 2;
						if (local29.aBoolean346) {
							local75 += 512;
						} else {
							if (Static124.anInt5008 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt5023 = local75 + 1;
					}
				} else {
					local29.anInt5023 = -1;
				}
			} else {
				local29.anInt5023 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static457.anInt7857; local116++) {
			@Pc(127) Class47_Sub2_Sub3_Sub1 local127 = ((Class1_Sub10) Static258.aClass174_15.method4422((long) Static386.anIntArray503[local116])).aClass47_Sub2_Sub3_Sub1_2;
			if (local127.method3706() && local127.aClass238_1.method5860(Static343.aClass286_1)) {
				local127.method6952();
				if (local127.aShort115 >= 0 && local127.aShort117 >= 0 && local127.aShort116 < Static542.anInt9387 && local127.aShort114 < Static36.anInt1324) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean342) {
						local164++;
					}
					if (local127.anInt5046 > Static416.anInt7252) {
						local164 += 2;
					}
					local164 += 5 - local127.method4350() << 2;
					if (Static124.anInt5008 == 0) {
						if (local127.aClass238_1.aBoolean451) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static124.anInt5008 == 1) {
						if (local127.aClass238_1.aBoolean451) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass238_1.aBoolean454) {
						local164 += 1024;
					} else if (!local127.aClass238_1.aBoolean450) {
						local164 += 256;
					}
					local127.anInt5023 = local164 + 1;
				} else {
					local127.anInt5023 = -1;
				}
			} else {
				local127.anInt5023 = -1;
			}
		}
		for (local75 = 0; local75 < Static484.aClass28Array1.length; local75++) {
			@Pc(230) Class28 local230 = Static484.aClass28Array1[local75];
			if (local230 != null) {
				if (local230.anInt1262 == 1) {
					@Pc(244) Class1_Sub10 local244 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local230.anInt1265);
					if (local244 != null) {
						@Pc(249) Class47_Sub2_Sub3_Sub1 local249 = local244.aClass47_Sub2_Sub3_Sub1_2;
						if (local249.anInt5023 >= 0) {
							local249.anInt5023 += 2048;
						}
					}
				} else if (local230.anInt1262 == 10) {
					@Pc(268) Class47_Sub2_Sub3_Sub2 local268 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local230.anInt1265];
					if (local268 != null && local268 != Static16.aClass47_Sub2_Sub3_Sub2_1 && local268.anInt5023 >= 0) {
						local268.anInt5023 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method1748(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static412.anInt7191;
		@Pc(3) int[] local3 = Static349.anIntArray479;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static457.anInt7857; local5++) {
			@Pc(15) Class47_Sub2_Sub3 local15;
			if (local5 < local1) {
				local15 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class1_Sub10) Static258.aClass174_15.method4422((long) Static386.anIntArray503[local5 - local1])).aClass47_Sub2_Sub3_Sub1_2;
			}
			if (local15.aByte94 == arg0 && local15.anInt5023 >= 0) {
				@Pc(39) int local39 = local15.method4350();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8189 & 0x7F) != 0 || (local15.anInt8191 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt8189 & 0x7F) != 64 || (local15.anInt8191 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8189 >> 7;
					local80 = local15.anInt8191 >> 7;
					if (local15.anInt5023 > Static520.anIntArrayArray94[local75][local80]) {
						Static520.anIntArrayArray94[local75][local80] = local15.anInt5023;
						Static443.anIntArrayArray74[local75][local80] = 1;
					} else if (local15.anInt5023 == Static520.anIntArrayArray94[local75][local80]) {
						local116 = Static443.anIntArrayArray74[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt8189 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt8191 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt8189 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt8191 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt5023 > Static520.anIntArrayArray94[local158][local161]) {
								Static520.anIntArrayArray94[local158][local161] = local15.anInt5023;
								Static443.anIntArrayArray74[local158][local161] = 1;
							} else if (local15.anInt5023 == Static520.anIntArrayArray94[local158][local161]) {
								local116 = Static443.anIntArrayArray74[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1750() {
		Static289.anInt5651 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static457.anInt7857; local3++) {
			@Pc(14) Class47_Sub2_Sub3_Sub1 local14 = ((Class1_Sub10) Static258.aClass174_15.method4422((long) Static386.anIntArray503[local3])).aClass47_Sub2_Sub3_Sub1_2;
			if (local14.aBoolean342 && local14.method4354() != -1) {
				@Pc(32) int local32 = (local14.method4350() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt8189 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt8191 - local32 >> 7;
				@Pc(53) Class47_Sub2_Sub3 local53 = Static51.method6739(local46, local39, local14.aByte94);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt5045;
					if (local53 instanceof Class47_Sub2_Sub3_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt5002 == 0 && local53.method4354() != -1) {
						Static397.anIntArray522[Static289.anInt5651] = local58;
						Static523.anIntArray763[Static289.anInt5651] = local58;
						Static289.anInt5651++;
						local53.anInt5002++;
					}
					Static397.anIntArray522[Static289.anInt5651] = local58;
					Static523.anIntArray763[Static289.anInt5651] = local14.anInt5045 + 2048;
					Static289.anInt5651++;
					local53.anInt5002++;
				}
			}
		}
		Static526.method7502(Static523.anIntArray763, 0, Static397.anIntArray522, Static289.anInt5651 - 1);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!vp;)Z")
	public static boolean method1751(@OriginalArg(0) Class309 arg0) {
		if (Static192.aBoolean246) {
			if (method1740(arg0).anInt9474 != 0) {
				return false;
			}
			if (arg0.anInt8802 == 0) {
				return false;
			}
		}
		return arg0.aBoolean608;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!vp;IIIIIIIII)V")
	public static void method1755(@OriginalArg(0) Class309[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class309 local6 = arg0[local1];
			if (local6 != null && local6.anInt8764 == arg1) {
				@Pc(17) int local17 = local6.anInt8744 + arg6;
				@Pc(22) int local22 = local6.anInt8777 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt8802 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt8790;
					@Pc(45) int local45 = local22 + local6.anInt8752;
					if (local6.anInt8802 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt8802 == 0 || local6.aBoolean602 || method1740(local6).anInt9474 != 0 || local6 == Static395.aClass309_9 || local6.anInt8761 == Static53.anInt1520) {
					if (!method1751(local6)) {
						if (local6 == Static279.aClass309_6 && Static226.method3961(Static279.aClass309_6) != null) {
							Static201.aBoolean257 = true;
							Static489.anInt8373 = local17;
							Static47.anInt1424 = local22;
						}
						if (local6.aBoolean601 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean607 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class1_Sub40 local152 = (Class1_Sub40) Static524.aClass38_75.method1419(); local152 != null; local152 = (Class1_Sub40) Static524.aClass38_75.method1415()) {
									if (local152.aBoolean462) {
										local152.method7983();
										local152.aClass309_10.aBoolean595 = false;
									}
								}
								if (Static184.anInt3931 == 0) {
									Static279.aClass309_6 = null;
									Static395.aClass309_9 = null;
								}
								Static372.anInt6577 = 0;
								Static171.aBoolean235 = false;
								Static194.aBoolean247 = false;
								if (!Static25.aBoolean94) {
									Static515.method7351();
								}
							}
							@Pc(208) boolean local208;
							if (Static42.aClass191_1.method5138() >= local28 && Static42.aClass191_1.method5141() >= local30 && Static42.aClass191_1.method5138() < local32 && Static42.aClass191_1.method5141() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static382.aBoolean440 && local208) {
								if (local6.anInt8779 >= 0) {
									Static151.anInt3437 = local6.anInt8779;
								} else if (local6.aBoolean607) {
									Static151.anInt3437 = -1;
								}
							}
							if (!Static25.aBoolean94 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static489.method7074(arg9 - local22, local6, arg8 - local17);
							}
							@Pc(252) boolean local252 = false;
							if (Static42.aClass191_1.method5149() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class1_Sub41 local267 = (Class1_Sub41) Static407.aClass38_54.method1419();
							if (local267 != null && local267.method7875() == 0 && local267.method7870() >= local28 && local267.method7866() >= local30 && local267.method7870() < local32 && local267.method7866() < local34) {
								local262 = true;
							}
							@Pc(300) int local300;
							@Pc(434) int local434;
							if (local6.aByteArray115 != null) {
								for (local300 = 0; local300 < local6.aByteArray115.length; local300++) {
									if (Static126.aClass60_1.method5384(local6.aByteArray115[local300])) {
										if (local6.anIntArray755 == null || Static416.anInt7252 >= local6.anIntArray755[local300]) {
											@Pc(332) byte local332 = local6.aByteArray116[local300];
											if (local332 == 0 || ((local332 & 0x8) == 0 || !Static126.aClass60_1.method5384(86) && !Static126.aClass60_1.method5384(82) && !Static126.aClass60_1.method5384(81)) && ((local332 & 0x2) == 0 || Static126.aClass60_1.method5384(86)) && ((local332 & 0x1) == 0 || Static126.aClass60_1.method5384(82)) && ((local332 & 0x4) == 0 || Static126.aClass60_1.method5384(81))) {
												if (local300 < 10) {
													Static51.method6738(local6.anInt8750, "", -1, local300 + 1);
												} else if (local300 == 10) {
													Static214.method3846();
													@Pc(403) Class1_Sub51 local403 = method1740(local6);
													Static139.method2954(local403.anInt9473, local403.method7990(), local6);
													Static433.aString72 = Static288.method4856(local6);
													if (Static433.aString72 == null) {
														Static433.aString72 = "Null";
													}
													Static469.aString69 = local6.aString81 + "<col=ffffff>";
												}
												local434 = local6.anIntArray753[local300];
												if (local6.anIntArray755 == null) {
													local6.anIntArray755 = new int[local6.aByteArray115.length];
												}
												if (local434 == 0) {
													local6.anIntArray755[local300] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray755[local300] = Static416.anInt7252 + local434;
												}
											}
										}
									} else if (local6.anIntArray755 != null) {
										local6.anIntArray755[local300] = 0;
									}
								}
							}
							if (local262) {
								Static119.method2669(local6, local267.method7870() - local17, local267.method7866() - local22);
							}
							if (Static279.aClass309_6 != null && Static279.aClass309_6 != local6 && local208 && method1740(local6).method7988()) {
								Static29.aClass309_2 = local6;
							}
							if (local6 == Static395.aClass309_9) {
								Static519.aBoolean611 = true;
								Static115.anInt2806 = local17;
								Static388.anInt6744 = local22;
							}
							if (local6.aBoolean602 || local6.anInt8761 != 0) {
								@Pc(519) Class1_Sub40 local519;
								if (local208 && Static430.anInt7441 != 0 && local6.anObjectArray18 != null) {
									local519 = new Class1_Sub40();
									local519.aBoolean462 = true;
									local519.aClass309_10 = local6;
									local519.anInt6961 = Static430.anInt7441;
									local519.anObjectArray5 = local6.anObjectArray18;
									Static524.aClass38_75.method1426(local519);
								}
								if (Static279.aClass309_6 != null || Static25.aBoolean94 || local6.anInt8761 != Static459.anInt7942 && Static372.anInt6577 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(674) int local674;
								if (local6.anInt8761 != 0) {
									if (local6.anInt8761 == Static287.anInt5617 || local6.anInt8761 == Static61.anInt1714) {
										Static13.aClass309_1 = local6;
										if (Static446.aClass89_1 != null) {
											Static446.aClass89_1.method2909(Static478.aClass9_10, local6.anInt8752);
										}
										if (local6.anInt8761 == Static287.anInt5617) {
											if (!Static25.aBoolean94 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static375.method5715(arg8, Static478.aClass9_10, arg9);
												for (@Pc(602) Class2_Sub8 local602 = (Class2_Sub8) Static326.aClass145_6.method3919(); local602 != null; local602 = (Class2_Sub8) Static326.aClass145_6.method3926()) {
													if (arg8 >= local602.anInt9353 && arg8 < local602.anInt9354 && arg9 >= local602.anInt9351 && arg9 < local602.anInt9355) {
														Static515.method7351();
														Static214.method3848(local602.aClass47_Sub2_Sub3_1);
													}
												}
											}
											Static21.method868(local6, local22, local17);
											continue;
										}
									}
									@Pc(713) int local713;
									if (local6.anInt8761 == Static53.anInt1520) {
										if (local6.method7389(Static478.aClass9_10) == null || Static222.anInt4501 != 0 && Static222.anInt4501 != 3 || Static25.aBoolean94 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local300 = arg8 - local17;
										local674 = arg9 - local22;
										local434 = local6.anIntArray748[local674];
										if (local300 < local434 || local300 > local434 + local6.anIntArray757[local674]) {
											continue;
										}
										local300 -= local6.anInt8790 / 2;
										local674 -= local6.anInt8752 / 2;
										if (Static464.anInt8003 == 4) {
											local713 = (int) Static443.aFloat151 & 0x3FFF;
										} else {
											local713 = (int) Static443.aFloat151 + Static96.anInt2375 & 0x3FFF;
										}
										@Pc(725) int local725 = Class307.anIntArray744[local713];
										@Pc(729) int local729 = Class307.anIntArray743[local713];
										if (Static464.anInt8003 != 4) {
											local725 = local725 * (Static189.anInt4000 + 256) >> 8;
											local729 = local729 * (Static189.anInt4000 + 256) >> 8;
										}
										@Pc(758) int local758 = local674 * local725 + local300 * local729 >> 15;
										@Pc(768) int local768 = local674 * local729 - local300 * local725 >> 15;
										@Pc(779) int local779;
										@Pc(787) int local787;
										if (Static464.anInt8003 == 4) {
											local779 = (Static347.anInt6403 >> 7) + (local758 >> 2);
											local787 = (Static67.anInt1925 >> 7) - (local768 >> 2);
										} else {
											@Pc(796) int local796 = (Static16.aClass47_Sub2_Sub3_Sub2_1.method4350() - 1) * 64;
											local779 = (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 - local796 >> 7) + (local758 >> 2);
											local787 = (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 - local796 >> 7) - (local768 >> 2);
										}
										if (Static382.aBoolean440 && (Static276.anInt5433 & 0x40) != 0) {
											@Pc(829) Class309 local829 = Static210.method3818(Static323.anInt6116, Static423.anInt8970);
											if (local829 == null) {
												Static214.method3846();
											} else {
												Static179.method3455(local787, Static444.anInt7508, 1L, true, 4, Static433.aString72, false, local6.anInt8735, local779, " ->");
											}
											continue;
										}
										if (Static538.aClass37_4 == Static452.aClass37_3) {
											Static179.method3455(local787, -1, 1L, true, 25, Static472.aClass114_153.method3330(Static315.anInt5993), false, -1, local779, "");
										}
										Static179.method3455(local787, Static325.anInt6335, 1L, true, 18, Static538.aString84, false, -1, local779, "");
										continue;
									}
									if (local6.anInt8761 == Static459.anInt7942) {
										Static88.aClass309_4 = local6;
										if (local208) {
											Static171.aBoolean235 = true;
										}
										if (local262) {
											local300 = (int) ((double) (local267.method7870() - local17 - local6.anInt8790 / 2) * 2.0D / (double) Static451.aFloat84);
											local674 = (int) -((double) (local267.method7866() - local22 - local6.anInt8752 / 2) * 2.0D / (double) Static451.aFloat84);
											local434 = Static211.anInt4386 + local300 + Static451.anInt3553;
											local713 = Static181.anInt3889 + local674 + Static451.anInt3558;
											@Pc(943) Class1_Sub1_Sub12 local943 = Static417.method5263();
											if (local943 == null) {
												continue;
											}
											@Pc(948) int[] local948 = new int[3];
											local943.method4788(local713, local948, local434);
											if (local948 != null) {
												if (Static126.aClass60_1.method5384(82) && Static351.anInt6430 > 0) {
													Static86.method2085(local948[0], local948[2], local948[1]);
													continue;
												}
												Static194.aBoolean247 = true;
												Static373.anInt6582 = local948[0];
												Static230.anInt4565 = local948[1];
												Static372.anInt6575 = local948[2];
											}
											Static372.anInt6577 = 1;
											Static434.aBoolean494 = false;
											Static106.anInt2480 = Static42.aClass191_1.method5138();
											Static120.anInt2882 = Static42.aClass191_1.method5141();
											continue;
										}
										if (local252 && Static372.anInt6577 > 0) {
											if (Static372.anInt6577 == 1 && (Static106.anInt2480 != Static42.aClass191_1.method5138() || Static120.anInt2882 != Static42.aClass191_1.method5141())) {
												Static45.anInt1405 = Static211.anInt4386;
												Static91.anInt727 = Static181.anInt3889;
												Static372.anInt6577 = 2;
											}
											if (Static372.anInt6577 == 2) {
												Static434.aBoolean494 = true;
												Static494.method7105(Static45.anInt1405 + (int) ((double) (Static106.anInt2480 - Static42.aClass191_1.method5138()) * 2.0D / (double) Static451.aFloat85));
												Static494.method7103(Static91.anInt727 - (int) ((double) (Static120.anInt2882 - Static42.aClass191_1.method5141()) * 2.0D / (double) Static451.aFloat85));
											}
											continue;
										}
										if (Static372.anInt6577 > 0 && !Static434.aBoolean494) {
											if ((Static235.anInt4604 == 1 || Static425.method6302()) && Static267.anInt5167 > 2) {
												Static65.method7167(Static120.anInt2882, Static106.anInt2480);
											} else if (Static30.method1222()) {
												Static65.method7167(Static120.anInt2882, Static106.anInt2480);
											}
										}
										Static372.anInt6577 = 0;
										continue;
									}
									if (local6.anInt8761 == Static407.anInt7143) {
										if (local252) {
											Static221.method3921(local6.anInt8790, Static42.aClass191_1.method5141() - local22, Static42.aClass191_1.method5138() - local17, local6.anInt8752);
										}
										continue;
									}
									if (local6.anInt8761 == Static107.anInt2483) {
										Static55.method1546(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean606 && local262) {
									local6.aBoolean606 = true;
									if (local6.anObjectArray13 != null) {
										local519 = new Class1_Sub40();
										local519.aBoolean462 = true;
										local519.aClass309_10 = local6;
										local519.anInt6957 = local267.method7870() - local17;
										local519.anInt6961 = local267.method7866() - local22;
										local519.anObjectArray5 = local6.anObjectArray13;
										Static524.aClass38_75.method1426(local519);
									}
								}
								if (local6.aBoolean606 && local252 && local6.anObjectArray27 != null) {
									local519 = new Class1_Sub40();
									local519.aBoolean462 = true;
									local519.aClass309_10 = local6;
									local519.anInt6957 = Static42.aClass191_1.method5138() - local17;
									local519.anInt6961 = Static42.aClass191_1.method5141() - local22;
									local519.anObjectArray5 = local6.anObjectArray27;
									Static524.aClass38_75.method1426(local519);
								}
								if (local6.aBoolean606 && !local252) {
									local6.aBoolean606 = false;
									if (local6.anObjectArray26 != null) {
										local519 = new Class1_Sub40();
										local519.aBoolean462 = true;
										local519.aClass309_10 = local6;
										local519.anInt6957 = Static42.aClass191_1.method5138() - local17;
										local519.anInt6961 = Static42.aClass191_1.method5141() - local22;
										local519.anObjectArray5 = local6.anObjectArray26;
										Static111.aClass38_22.method1426(local519);
									}
								}
								if (local252 && local6.anObjectArray32 != null) {
									local519 = new Class1_Sub40();
									local519.aBoolean462 = true;
									local519.aClass309_10 = local6;
									local519.anInt6957 = Static42.aClass191_1.method5138() - local17;
									local519.anInt6961 = Static42.aClass191_1.method5141() - local22;
									local519.anObjectArray5 = local6.anObjectArray32;
									Static524.aClass38_75.method1426(local519);
								}
								if (!local6.aBoolean595 && local208) {
									local6.aBoolean595 = true;
									if (local6.anObjectArray29 != null) {
										local519 = new Class1_Sub40();
										local519.aBoolean462 = true;
										local519.aClass309_10 = local6;
										local519.anInt6957 = Static42.aClass191_1.method5138() - local17;
										local519.anInt6961 = Static42.aClass191_1.method5141() - local22;
										local519.anObjectArray5 = local6.anObjectArray29;
										Static524.aClass38_75.method1426(local519);
									}
								}
								if (local6.aBoolean595 && local208 && local6.anObjectArray33 != null) {
									local519 = new Class1_Sub40();
									local519.aBoolean462 = true;
									local519.aClass309_10 = local6;
									local519.anInt6957 = Static42.aClass191_1.method5138() - local17;
									local519.anInt6961 = Static42.aClass191_1.method5141() - local22;
									local519.anObjectArray5 = local6.anObjectArray33;
									Static524.aClass38_75.method1426(local519);
								}
								if (local6.aBoolean595 && !local208) {
									local6.aBoolean595 = false;
									if (local6.anObjectArray8 != null) {
										local519 = new Class1_Sub40();
										local519.aBoolean462 = true;
										local519.aClass309_10 = local6;
										local519.anInt6957 = Static42.aClass191_1.method5138() - local17;
										local519.anInt6961 = Static42.aClass191_1.method5141() - local22;
										local519.anObjectArray5 = local6.anObjectArray8;
										Static111.aClass38_22.method1426(local519);
									}
								}
								if (local6.anObjectArray25 != null) {
									local519 = new Class1_Sub40();
									local519.aClass309_10 = local6;
									local519.anObjectArray5 = local6.anObjectArray25;
									Static237.aClass38_35.method1426(local519);
								}
								@Pc(1487) Class1_Sub40 local1487;
								if (local6.anObjectArray23 != null && Static380.anInt6676 > local6.anInt8788) {
									if (local6.anIntArray751 == null || Static380.anInt6676 - local6.anInt8788 > 32) {
										local519 = new Class1_Sub40();
										local519.aClass309_10 = local6;
										local519.anObjectArray5 = local6.anObjectArray23;
										Static524.aClass38_75.method1426(local519);
									} else {
										label680: for (local300 = local6.anInt8788; local300 < Static380.anInt6676; local300++) {
											local674 = Static66.anIntArray163[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray751.length; local434++) {
												if (local6.anIntArray751[local434] == local674) {
													local1487 = new Class1_Sub40();
													local1487.aClass309_10 = local6;
													local1487.anObjectArray5 = local6.anObjectArray23;
													Static524.aClass38_75.method1426(local1487);
													break label680;
												}
											}
										}
									}
									local6.anInt8788 = Static380.anInt6676;
								}
								if (local6.anObjectArray17 != null && Static194.anInt4069 > local6.anInt8760) {
									if (local6.anIntArray752 == null || Static194.anInt4069 - local6.anInt8760 > 32) {
										local519 = new Class1_Sub40();
										local519.aClass309_10 = local6;
										local519.anObjectArray5 = local6.anObjectArray17;
										Static524.aClass38_75.method1426(local519);
									} else {
										label656: for (local300 = local6.anInt8760; local300 < Static194.anInt4069; local300++) {
											local674 = Static2.anIntArray400[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray752.length; local434++) {
												if (local6.anIntArray752[local434] == local674) {
													local1487 = new Class1_Sub40();
													local1487.aClass309_10 = local6;
													local1487.anObjectArray5 = local6.anObjectArray17;
													Static524.aClass38_75.method1426(local1487);
													break label656;
												}
											}
										}
									}
									local6.anInt8760 = Static194.anInt4069;
								}
								if (local6.anObjectArray31 != null && Static267.anInt5165 > local6.anInt8749) {
									if (local6.anIntArray756 == null || Static267.anInt5165 - local6.anInt8749 > 32) {
										local519 = new Class1_Sub40();
										local519.aClass309_10 = local6;
										local519.anObjectArray5 = local6.anObjectArray31;
										Static524.aClass38_75.method1426(local519);
									} else {
										label632: for (local300 = local6.anInt8749; local300 < Static267.anInt5165; local300++) {
											local674 = Static7.anIntArray14[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray756.length; local434++) {
												if (local6.anIntArray756[local434] == local674) {
													local1487 = new Class1_Sub40();
													local1487.aClass309_10 = local6;
													local1487.anObjectArray5 = local6.anObjectArray31;
													Static524.aClass38_75.method1426(local1487);
													break label632;
												}
											}
										}
									}
									local6.anInt8749 = Static267.anInt5165;
								}
								if (local6.anObjectArray12 != null && Static365.anInt8921 > local6.anInt8803) {
									if (local6.anIntArray754 == null || Static365.anInt8921 - local6.anInt8803 > 32) {
										local519 = new Class1_Sub40();
										local519.aClass309_10 = local6;
										local519.anObjectArray5 = local6.anObjectArray12;
										Static524.aClass38_75.method1426(local519);
									} else {
										label608: for (local300 = local6.anInt8803; local300 < Static365.anInt8921; local300++) {
											local674 = Static350.anIntArray480[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray754.length; local434++) {
												if (local6.anIntArray754[local434] == local674) {
													local1487 = new Class1_Sub40();
													local1487.aClass309_10 = local6;
													local1487.anObjectArray5 = local6.anObjectArray12;
													Static524.aClass38_75.method1426(local1487);
													break label608;
												}
											}
										}
									}
									local6.anInt8803 = Static365.anInt8921;
								}
								if (local6.anObjectArray22 != null && Static499.anInt8464 > local6.anInt8734) {
									if (local6.anIntArray750 == null || Static499.anInt8464 - local6.anInt8734 > 32) {
										local519 = new Class1_Sub40();
										local519.aClass309_10 = local6;
										local519.anObjectArray5 = local6.anObjectArray22;
										Static524.aClass38_75.method1426(local519);
									} else {
										label584: for (local300 = local6.anInt8734; local300 < Static499.anInt8464; local300++) {
											local674 = Static161.anIntArray281[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray750.length; local434++) {
												if (local6.anIntArray750[local434] == local674) {
													local1487 = new Class1_Sub40();
													local1487.aClass309_10 = local6;
													local1487.anObjectArray5 = local6.anObjectArray22;
													Static524.aClass38_75.method1426(local1487);
													break label584;
												}
											}
										}
									}
									local6.anInt8734 = Static499.anInt8464;
								}
								if (Static54.anInt4080 > local6.anInt8728 && local6.anObjectArray10 != null) {
									local519 = new Class1_Sub40();
									local519.aClass309_10 = local6;
									local519.anObjectArray5 = local6.anObjectArray10;
									Static524.aClass38_75.method1426(local519);
								}
								if (Static340.anInt6357 > local6.anInt8728 && local6.anObjectArray20 != null) {
									local519 = new Class1_Sub40();
									local519.aClass309_10 = local6;
									local519.anObjectArray5 = local6.anObjectArray20;
									Static524.aClass38_75.method1426(local519);
								}
								if (Static184.anInt3933 > local6.anInt8728 && local6.anObjectArray36 != null) {
									local519 = new Class1_Sub40();
									local519.aClass309_10 = local6;
									local519.anObjectArray5 = local6.anObjectArray36;
									Static524.aClass38_75.method1426(local519);
								}
								if (Static296.anInt5734 > local6.anInt8728 && local6.anObjectArray24 != null) {
									local519 = new Class1_Sub40();
									local519.aClass309_10 = local6;
									local519.anObjectArray5 = local6.anObjectArray24;
									Static524.aClass38_75.method1426(local519);
								}
								if (Static136.anInt3211 > local6.anInt8728 && local6.anObjectArray28 != null) {
									local519 = new Class1_Sub40();
									local519.aClass309_10 = local6;
									local519.anObjectArray5 = local6.anObjectArray28;
									Static524.aClass38_75.method1426(local519);
								}
								local6.anInt8728 = Static418.anInt7279;
								if (local6.anObjectArray14 != null) {
									for (local300 = 0; local300 < Static11.anInt130; local300++) {
										@Pc(1955) Class1_Sub40 local1955 = new Class1_Sub40();
										local1955.aClass309_10 = local6;
										local1955.anInt6960 = Static193.anInterface2Array2[local300].method7099();
										local1955.anInt6959 = Static193.anInterface2Array2[local300].method7096();
										local1955.anObjectArray5 = local6.anObjectArray14;
										Static524.aClass38_75.method1426(local1955);
									}
								}
								if (Static134.aBoolean202 && local6.anObjectArray7 != null) {
									local519 = new Class1_Sub40();
									local519.aClass309_10 = local6;
									local519.anObjectArray5 = local6.anObjectArray7;
									Static524.aClass38_75.method1426(local519);
								}
							}
							if (local6.anInt8802 == 5 && local6.anInt8731 != -1) {
								local6.method7382(Static86.aClass254_1, Static27.aClass310_1).method2909(Static478.aClass9_10, local6.anInt8752);
							}
							Static245.method4147(local6);
							if (local6.anInt8802 == 0) {
								method1755(arg0, local6.anInt8750, local28, local30, local32, local34, local17 - local6.anInt8786, local22 - local6.anInt8721, arg8, arg9);
								if (local6.lb != null) {
									method1755(local6.lb, local6.anInt8750, local28, local30, local32, local34, local17 - local6.anInt8786, local22 - local6.anInt8721, arg8, arg9);
								}
								@Pc(2077) Class1_Sub5 local2077 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local6.anInt8750);
								if (local2077 != null) {
									if (Static538.aClass37_4 == Static152.aClass37_1 && local2077.anInt1387 == 0 && !Static25.aBoolean94 && local208 && !Static192.aBoolean246) {
										Static515.method7351();
									}
									Static131.method2855(local28, local34, local32, local2077.anInt1389, local30, arg8, local17, local22, arg9);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static245.method4147(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!vp;)Lclient!vp;")
	public static Class309 method1756(@OriginalArg(0) Class309 arg0) {
		@Pc(4) int local4 = method1740(arg0).method7987();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static80.method2005(arg0.anInt8764);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1757() {
		@Pc(1) int local1 = Static412.anInt7191;
		@Pc(3) int[] local3 = Static349.anIntArray479;
		@Pc(11) int local11 = Static17.aBoolean59 ? local1 : local1 + Static457.anInt7857;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class47_Sub2_Sub3 local23;
			if (local13 < local1) {
				local23 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub10) Static258.aClass174_15.method4422((long) Static386.anIntArray503[local13 - local1])).aClass47_Sub2_Sub3_Sub1_2;
			}
			if (local23.anInt5023 >= 0) {
				@Pc(43) int local43 = local23.method4350();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8189 & 0x7F) == 0 && (local23.anInt8191 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt8189 & 0x7F) == 64 && (local23.anInt8191 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class47_Sub2_Sub3_Sub2 && local23.aClass1_Sub47_3 != null && Static416.anInt7252 >= local23.aClass1_Sub47_3.anInt8052 && Static416.anInt7252 < local23.aClass1_Sub47_3.anInt8051) {
					((Class47_Sub2_Sub3_Sub2) local23).aBoolean347 = false;
				}
				local23.anInt8192 = Static74.method1954(local23.aByte94, local23.anInt8191, local23.anInt8189);
				Static346.method5547(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1759() {
		for (@Pc(1) int local1 = 0; local1 < Static542.anInt9387; local1++) {
			@Pc(6) int[] local6 = Static520.anIntArrayArray94[local1];
			for (@Pc(8) int local8 = 0; local8 < Static36.anInt1324; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
