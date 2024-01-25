import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[I")
	public static int[] anIntArray100;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	public static int anInt1238 = 0;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
	public static int anInt1254 = -1;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1215(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static655.method4109(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1217() {
		@Pc(1) int local1 = Static227.anInt3948;
		@Pc(3) int[] local3 = Static467.anIntArray632;
		@Pc(11) int local11 = Static480.aBoolean307 ? local1 : local1 + Static58.anInt926;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class14_Sub1_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class5_Sub13) Static51.aClass81_11.method1599((long) Static191.anIntArray287[local13 - local1])).aClass14_Sub1_Sub1_Sub3_Sub2_1;
			}
			if (local23.anInt2906 >= 0) {
				@Pc(43) int local43 = local23.method2509();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9317 & 0x1FF) == 0 && (local23.anInt9315 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt9317 & 0x1FF) == 256 && (local23.anInt9315 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt9321 = Static600.method8378(local23.anInt9315, local23.anInt9317, local23.aByte125);
				Static509.method7368(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1221(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static227.anInt3948;
		@Pc(3) int[] local3 = Static467.anIntArray632;
		@Pc(11) int local11 = Static480.aBoolean307 ? local1 : local1 + Static58.anInt926;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class14_Sub1_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class5_Sub13) Static51.aClass81_11.method1599((long) Static191.anIntArray287[local13 - local1])).aClass14_Sub1_Sub1_Sub3_Sub2_1;
			}
			if (local23.aByte125 == arg0) {
				local23.anInt2962 = 0;
				if (local23.anInt2906 < 0) {
					local23.aBoolean255 = false;
				} else {
					@Pc(54) int local54 = local23.method2509();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9317 & 0x1FF) != 0 || (local23.anInt9315 & 0x1FF) != 0) {
							local23.aBoolean255 = false;
							continue;
						}
					} else if ((local23.anInt9317 & 0x1FF) != 256 || (local23.anInt9315 & 0x1FF) != 256) {
						local23.aBoolean255 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9317 >> 9;
						local101 = local23.anInt9315 >> 9;
						if (local23.anInt2906 != Static56.anIntArrayArray5[local96][local101]) {
							local23.aBoolean255 = true;
							continue;
						}
						if (Static574.anIntArrayArray58[local96][local101] > 1) {
							local126 = Static574.anIntArrayArray58[local96][local101]--;
							local23.aBoolean255 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt9317 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt9315 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt9317 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt9315 + local96 >> 9;
						if (!Static607.method8455(local162, local155, local169, local101, local23.anInt2906)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt2906 == Static56.anIntArrayArray5[local180][local183]) {
										local126 = Static574.anIntArrayArray58[local180][local183]--;
									}
								}
							}
							local23.aBoolean255 = true;
							continue;
						}
					}
					local23.aBoolean255 = false;
					local23.anInt9321 = Static600.method8378(local23.anInt9315, local23.anInt9317, local23.aByte125);
					Static509.method7368(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1222() {
		Static267.anInt4433 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static58.anInt926; local3++) {
			@Pc(14) Class14_Sub1_Sub1_Sub3_Sub2 local14 = ((Class5_Sub13) Static51.aClass81_11.method1599((long) Static191.anIntArray287[local3])).aClass14_Sub1_Sub1_Sub3_Sub2_1;
			if (local14.aBoolean255 && local14.method2517() != -1) {
				@Pc(32) int local32 = (local14.method2509() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt9317 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt9315 - local32 >> 9;
				@Pc(53) Class14_Sub1_Sub1_Sub3 local53 = Static326.method5062(local14.aByte125, local46, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt2960;
					if (local53 instanceof Class14_Sub1_Sub1_Sub3_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt2962 == 0 && local53.method2517() != -1) {
						Static196.anIntArray290[Static267.anInt4433] = local58;
						Static390.anIntArray532[Static267.anInt4433] = local58;
						Static267.anInt4433++;
						local53.anInt2962++;
					}
					Static196.anIntArray290[Static267.anInt4433] = local58;
					Static390.anIntArray532[Static267.anInt4433] = local14.anInt2960 + 2048;
					Static267.anInt4433++;
					local53.anInt2962++;
				}
			}
		}
		Static643.method8834(Static390.anIntArray532, 0, Static196.anIntArray290, Static267.anInt4433 - 1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!vfa;)Lclient!vfa;")
	public static Class357 method1223(@OriginalArg(0) Class357 arg0) {
		@Pc(4) int local4 = method1225(arg0).method8723();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static472.method6903(arg0.anInt9837);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1224(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static227.anInt3948;
		@Pc(3) int[] local3 = Static467.anIntArray632;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static58.anInt926; local5++) {
			@Pc(15) Class14_Sub1_Sub1_Sub3 local15;
			if (local5 < local1) {
				local15 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class5_Sub13) Static51.aClass81_11.method1599((long) Static191.anIntArray287[local5 - local1])).aClass14_Sub1_Sub1_Sub3_Sub2_1;
			}
			if (local15.aByte125 == arg0 && local15.anInt2906 >= 0) {
				@Pc(39) int local39 = local15.method2509();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9317 & 0x1FF) != 0 || (local15.anInt9315 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9317 & 0x1FF) != 256 || (local15.anInt9315 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9317 >> 9;
					local80 = local15.anInt9315 >> 9;
					if (local15.anInt2906 > Static56.anIntArrayArray5[local75][local80]) {
						Static56.anIntArrayArray5[local75][local80] = local15.anInt2906;
						Static574.anIntArrayArray58[local75][local80] = 1;
					} else if (local15.anInt2906 == Static56.anIntArrayArray5[local75][local80]) {
						local116 = Static574.anIntArrayArray58[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt9317 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt9315 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt9317 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt9315 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt2906 > Static56.anIntArrayArray5[local158][local161]) {
								Static56.anIntArrayArray5[local158][local161] = local15.anInt2906;
								Static574.anIntArrayArray58[local158][local161] = 1;
							} else if (local15.anInt2906 == Static56.anIntArrayArray5[local158][local161]) {
								local116 = Static574.anIntArrayArray58[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!vfa;)Lclient!wfa;")
	public static Class5_Sub49 method1225(@OriginalArg(0) Class357 arg0) {
		@Pc(13) Class5_Sub49 local13 = (Class5_Sub49) Static545.aClass81_62.method1599(((long) arg0.anInt9804 << 32) + (long) arg0.anInt9846);
		return local13 == null ? arg0.aClass5_Sub49_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1227() {
		@Pc(1) int local1 = Static227.anInt3948;
		@Pc(3) int[] local3 = Static467.anIntArray632;
		@Pc(8) int local8 = Static627.aClass5_Sub46_31.aClass11_Sub5_1.method781();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class14_Sub1_Sub1_Sub3_Sub1 local32 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local3[local25]];
			if (!local32.method2368()) {
				local32.anInt2906 = -1;
			} else if (local32.aBoolean241) {
				local32.anInt2906 = -1;
			} else {
				local32.method4226();
				if (local32.aShort74 >= 0 && local32.aShort71 >= 0 && local32.aShort73 < Static111.anInt1752 && local32.aShort72 < Static279.anInt4567) {
					local32.aBoolean237 = local32.aBoolean257 ? local23 : false;
					if (local32 == Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1) {
						local32.anInt2906 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean255) {
							local85++;
						}
						if (local32.anInt2910 > Static235.anInt3998) {
							local85 += 2;
						}
						local85 += 5 - local32.method2509() << 2;
						if (local32.aBoolean238) {
							local85 += 512;
						} else {
							if (Static71.anInt1127 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt2906 = local85 + 1;
					}
				} else {
					local32.anInt2906 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static58.anInt926; local126++) {
			@Pc(137) Class14_Sub1_Sub1_Sub3_Sub2 local137 = ((Class5_Sub13) Static51.aClass81_11.method1599((long) Static191.anIntArray287[local126])).aClass14_Sub1_Sub1_Sub3_Sub2_1;
			if (local137.method2527() && local137.aClass271_1.method6474(Static564.aClass304_1)) {
				local137.method4226();
				if (local137.aShort74 >= 0 && local137.aShort71 >= 0 && local137.aShort73 < Static111.anInt1752 && local137.aShort72 < Static279.anInt4567) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean255) {
						local174++;
					}
					if (local137.anInt2910 > Static235.anInt3998) {
						local174 += 2;
					}
					local174 += 5 - local137.method2509() << 2;
					if (Static71.anInt1127 == 0) {
						if (local137.aClass271_1.aBoolean609) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static71.anInt1127 == 1) {
						if (local137.aClass271_1.aBoolean609) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass271_1.aBoolean611) {
						local174 += 1024;
					} else if (!local137.aClass271_1.aBoolean613) {
						local174 += 256;
					}
					local137.anInt2906 = local174 + 1;
				} else {
					local137.anInt2906 = -1;
				}
			} else {
				local137.anInt2906 = -1;
			}
		}
		for (local85 = 0; local85 < Static568.aClass16Array1.length; local85++) {
			@Pc(240) Class16 local240 = Static568.aClass16Array1[local85];
			if (local240 != null) {
				if (local240.anInt407 == 1) {
					@Pc(254) Class5_Sub13 local254 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local240.anInt403);
					if (local254 != null) {
						@Pc(259) Class14_Sub1_Sub1_Sub3_Sub2 local259 = local254.aClass14_Sub1_Sub1_Sub3_Sub2_1;
						if (local259.anInt2906 >= 0) {
							local259.anInt2906 += 2048;
						}
					}
				} else if (local240.anInt407 == 10) {
					@Pc(278) Class14_Sub1_Sub1_Sub3_Sub1 local278 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local240.anInt403];
					if (local278 != null && local278 != Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 && local278.anInt2906 >= 0) {
						local278.anInt2906 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1228() {
		for (@Pc(1) int local1 = 0; local1 < Static111.anInt1752; local1++) {
			@Pc(6) int[] local6 = Static56.anIntArrayArray5[local1];
			for (@Pc(8) int local8 = 0; local8 < Static279.anInt4567; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!vfa;IIIIIIIIIII)V")
	public static void method1229(@OriginalArg(0) Class357[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class357 local6 = arg0[local1];
			if (local6 != null && local6.anInt9837 == arg1) {
				@Pc(17) int local17 = local6.anInt9813 + arg6;
				@Pc(22) int local22 = local6.anInt9876 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt9828 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt9852;
					local45 = local22 + local6.anInt9797;
					if (local6.anInt9828 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt9828 == 0 || local6.aBoolean798 || method1225(local6).anInt10264 != 0 || local6 == Static536.aClass357_10 || local6.anInt9785 == Static358.anInt8028 || local6.anInt9785 == Static360.anInt6360) {
					if (!method1231(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static144.aBoolean196) {
							local40 = Static577.method8147();
							local45 = Static601.method8395();
						}
						if (local6 == Static629.aClass357_15 && Static599.method8375(Static629.aClass357_15) != null) {
							Static226.aBoolean324 = true;
							Static161.anInt2819 = local17;
							Static599.anInt9774 = local22;
						}
						if (local6.aBoolean799 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean793 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class5_Sub9 local168 = (Class5_Sub9) Static297.aClass306_18.method7313(); local168 != null; local168 = (Class5_Sub9) Static297.aClass306_18.method7301()) {
									if (local168.aBoolean67) {
										local168.method8911();
										local168.aClass357_2.aBoolean795 = false;
									}
								}
								if (Static389.anInt6784 == 0) {
									Static629.aClass357_15 = null;
									Static536.aClass357_10 = null;
								}
								Static239.anInt4038 = 0;
								Static415.aBoolean597 = false;
								Static366.aBoolean538 = false;
								if (!Static251.aBoolean343) {
									Static313.method4948();
								}
							}
							@Pc(232) boolean local232;
							if (Static81.aClass13_1.method6355() + local40 >= local28 && Static81.aClass13_1.method6347() + local45 >= local30 && Static81.aClass13_1.method6355() + local40 < local32 && Static81.aClass13_1.method6347() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static202.aBoolean295 && local232) {
								if (local6.anInt9834 >= 0) {
									Static522.anInt7724 = local6.anInt9834;
								} else if (local6.aBoolean793) {
									Static522.anInt7724 = -1;
								}
							}
							if (!Static251.aBoolean343 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static36.method678(arg11 - local22, local6, arg10 - local17);
							}
							@Pc(276) boolean local276 = false;
							if (Static81.aClass13_1.method6352() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class5_Sub33 local291 = (Class5_Sub33) Static622.aClass306_65.method7313();
							if (local291 != null && local291.method6097() == 0 && local291.method6099() + local40 >= local28 && local291.method6094() + local45 >= local30 && local291.method6099() + local40 < local32 && local291.method6094() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray99 != null && !Static192.method7611()) {
								for (local335 = 0; local335 < local6.aByteArray99.length; local335++) {
									if (Static600.aClass38_1.method799(local6.aByteArray99[local335])) {
										if (local6.anIntArray800 == null || Static235.anInt3998 >= local6.anIntArray800[local335]) {
											@Pc(367) byte local367 = local6.aByteArray100[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static600.aClass38_1.method799(86) && !Static600.aClass38_1.method799(82) && !Static600.aClass38_1.method799(81)) && ((local367 & 0x2) == 0 || Static600.aClass38_1.method799(86)) && ((local367 & 0x1) == 0 || Static600.aClass38_1.method799(82)) && ((local367 & 0x4) == 0 || Static600.aClass38_1.method799(81))) {
												if (local335 < 10) {
													Static9.method174("", -1, local6.anInt9804, local335 + 1);
												} else if (local335 == 10) {
													Static2.method24();
													@Pc(438) Class5_Sub49 local438 = method1225(local6);
													Static184.method2955(local438.anInt10258, local6, local438.method8730());
													Static111.aString29 = Static494.method7286(local6);
													if (Static111.aString29 == null) {
														Static111.aString29 = "Null";
													}
													Static485.aString115 = local6.aString138 + "<col=ffffff>";
												}
												local469 = local6.anIntArray791[local335];
												if (local6.anIntArray800 == null) {
													local6.anIntArray800 = new int[local6.aByteArray99.length];
												}
												if (local469 == 0) {
													local6.anIntArray800[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray800[local335] = Static235.anInt3998 + local469;
												}
											}
										}
									} else if (local6.anIntArray800 != null) {
										local6.anIntArray800[local335] = 0;
									}
								}
							}
							if (local286) {
								Static225.method3518(local6, local40 + local291.method6099() - local17, local45 + local291.method6094() - local22);
							}
							if (Static629.aClass357_15 != null && Static629.aClass357_15 != local6 && local232 && method1225(local6).method8724()) {
								Static501.aClass357_11 = local6;
							}
							if (local6 == Static536.aClass357_10) {
								Static523.aBoolean713 = true;
								Static645.anInt10431 = local17;
								Static511.anInt8568 = local22;
							}
							if (local6.aBoolean798 || local6.anInt9785 != 0) {
								@Pc(558) Class5_Sub9 local558;
								if (local232 && Static565.anInt9287 != 0 && local6.anObjectArray2 != null) {
									local558 = new Class5_Sub9();
									local558.aBoolean67 = true;
									local558.aClass357_2 = local6;
									local558.anInt911 = Static565.anInt9287;
									local558.anObjectArray1 = local6.anObjectArray2;
									Static297.aClass306_18.method7303(local558);
								}
								if (Static629.aClass357_15 != null || Static251.aBoolean343 || local6.anInt9785 != Static44.anInt731 && Static239.anInt4038 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt9785 != 0) {
									if (local6.anInt9785 == Static422.anInt7182 || local6.anInt9785 == Static161.anInt2816) {
										Static583.aClass357_12 = local6;
										if (Static374.aClass218_1 != null) {
											Static374.aClass218_1.method5168(local6.anInt9797, Static485.aClass126_17);
										}
										if (local6.anInt9785 == Static422.anInt7182) {
											if (Static251.aBoolean343 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static603.method8410(Static485.aClass126_17, arg9, arg8);
											@Pc(641) Class14_Sub4 local641 = (Class14_Sub4) Static441.aClass363_8.method8484();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt710 && arg10 < local641.anInt711 && arg11 >= local641.anInt713 && arg11 < local641.anInt709) {
													Static313.method4948();
													Static645.method8848(local641.aClass14_Sub1_Sub1_Sub3_1);
												}
												local641 = (Class14_Sub4) Static441.aClass363_8.method8478();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt9785 == Static358.anInt8028) {
										if (local6.method8393(Static485.aClass126_17) == null || Static70.anInt9227 != 0 && Static70.anInt9227 != 3 || Static251.aBoolean343 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray793[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray799[local708]) {
											continue;
										}
										local335 -= local6.anInt9852 / 2;
										local708 -= local6.anInt9797 / 2;
										if (Static584.anInt9543 == 4) {
											local747 = (int) Static112.aFloat22 & 0x3FFF;
										} else {
											local747 = (int) Static112.aFloat22 + Static402.anInt9327 & 0x3FFF;
										}
										@Pc(759) int local759 = Class5_Sub12_Sub1.anIntArray748[local747];
										@Pc(763) int local763 = Class5_Sub12_Sub1.anIntArray749[local747];
										if (Static584.anInt9543 != 4) {
											local759 = local759 * (Static425.anInt7212 + 256) >> 8;
											local763 = local763 * (Static425.anInt7212 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static584.anInt9543 == 4) {
											local813 = (Static102.anInt1587 >> 9) + (local792 >> 2);
											local821 = (Static377.anInt6619 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2509() - 1) * 256;
											local813 = (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 - local830 >> 9) + (local792 >> 2);
											local821 = (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 - local830 >> 9) - (local802 >> 2);
										}
										if (Static202.aBoolean295 && (Static42.anInt714 & 0x40) != 0) {
											@Pc(863) Class357 local863 = Static318.method4971(Static402.anInt9331, Static343.anInt5922);
											if (local863 == null) {
												Static2.method24();
											} else {
												Static227.method3576(true, (long) (local6.anInt9846 << 0 | local6.anInt9804), 1L, true, local821, 21, false, local6.anInt9871, Static497.anInt8481, Static111.aString29, " ->", local813);
											}
											continue;
										}
										if (Static24.aClass235_1 == Static609.aClass235_7) {
											Static227.method3576(true, 0L, 1L, true, local821, 2, false, -1, -1, Static76.aClass58_28.method1237(Static321.anInt5554), "", local813);
										}
										Static227.method3576(true, 0L, 1L, true, local821, 45, false, -1, Static106.anInt1655, Static490.aString118, "", local813);
										continue;
									}
									if (local6.anInt9785 == Static44.anInt731) {
										Static157.aClass357_6 = local6;
										if (local232) {
											Static415.aBoolean597 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method6099() - local17 - local6.anInt9852 / 2) * 2.0D / (double) Static203.aFloat3);
											local708 = (int) -((double) (local45 + local291.method6094() - local22 - local6.anInt9797 / 2) * 2.0D / (double) Static203.aFloat3);
											local469 = Static504.anInt8544 + local335 + Static203.anInt136;
											local747 = Static449.anInt7564 + local708 + Static203.anInt137;
											@Pc(994) Class5_Sub4_Sub1 local994 = Static268.method4077();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method545(local469, local747, local999);
											if (local999 != null) {
												if (Static600.aClass38_1.method799(82) && Static408.anInt7025 > 0) {
													Static442.method6574(local999[2], local999[1], local999[0]);
													continue;
												}
												Static366.aBoolean538 = true;
												Static370.anInt6539 = local999[0];
												Static401.anInt8426 = local999[1];
												Static578.anInt9490 = local999[2];
											}
											Static239.anInt4038 = 1;
											Static3.aBoolean2 = false;
											Static254.anInt4284 = Static81.aClass13_1.method6355();
											Static466.anInt7864 = Static81.aClass13_1.method6347();
											continue;
										}
										if (local276 && Static239.anInt4038 > 0) {
											if (Static239.anInt4038 == 1 && (Static254.anInt4284 != Static81.aClass13_1.method6355() || Static466.anInt7864 != Static81.aClass13_1.method6347())) {
												Static200.anInt3570 = Static504.anInt8544;
												Static537.anInt8924 = Static449.anInt7564;
												Static239.anInt4038 = 2;
											}
											if (Static239.anInt4038 == 2) {
												Static3.aBoolean2 = true;
												Static235.method3630(Static200.anInt3570 + (int) ((double) (Static254.anInt4284 - Static81.aClass13_1.method6355()) * 2.0D / (double) Static203.aFloat4));
												Static388.method5971(Static537.anInt8924 - (int) ((double) (Static466.anInt7864 - Static81.aClass13_1.method6347()) * 2.0D / (double) Static203.aFloat4));
											}
											continue;
										}
										if (Static239.anInt4038 > 0 && !Static3.aBoolean2) {
											if ((Static559.anInt9207 == 1 || Static357.method5620()) && Static642.anInt10370 > 2) {
												Static145.method6157(Static466.anInt7864, Static254.anInt4284);
											} else if (Static579.method8156()) {
												Static145.method6157(Static466.anInt7864, Static254.anInt4284);
											}
										}
										Static239.anInt4038 = 0;
										continue;
									}
									if (local6.anInt9785 == Static440.anInt7417) {
										if (local276) {
											Static639.method8799(local6.anInt9797, local6.anInt9852, local45 + Static81.aClass13_1.method6347() - local22, local40 + Static81.aClass13_1.method6355() - local17);
										}
										continue;
									}
									if (local6.anInt9785 == Static360.anInt6360) {
										Static94.method8737(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean802 && local286) {
									local6.aBoolean802 = true;
									if (local6.anObjectArray9 != null) {
										local558 = new Class5_Sub9();
										local558.aBoolean67 = true;
										local558.aClass357_2 = local6;
										local558.anInt916 = local40 + local291.method6099() - local17;
										local558.anInt911 = local45 + local291.method6094() - local22;
										local558.anObjectArray1 = local6.anObjectArray9;
										Static297.aClass306_18.method7303(local558);
									}
								}
								if (local6.aBoolean802 && local276 && local6.anObjectArray21 != null) {
									local558 = new Class5_Sub9();
									local558.aBoolean67 = true;
									local558.aClass357_2 = local6;
									local558.anInt916 = local40 + Static81.aClass13_1.method6355() - local17;
									local558.anInt911 = local45 + Static81.aClass13_1.method6347() - local22;
									local558.anObjectArray1 = local6.anObjectArray21;
									Static297.aClass306_18.method7303(local558);
								}
								if (local6.aBoolean802 && !local276) {
									local6.aBoolean802 = false;
									if (local6.anObjectArray14 != null) {
										local558 = new Class5_Sub9();
										local558.aBoolean67 = true;
										local558.aClass357_2 = local6;
										local558.anInt916 = local40 + Static81.aClass13_1.method6355() - local17;
										local558.anInt911 = local45 + Static81.aClass13_1.method6347() - local22;
										local558.anObjectArray1 = local6.anObjectArray14;
										Static118.aClass306_12.method7303(local558);
									}
								}
								if (local276 && local6.anObjectArray6 != null) {
									local558 = new Class5_Sub9();
									local558.aBoolean67 = true;
									local558.aClass357_2 = local6;
									local558.anInt916 = local40 + Static81.aClass13_1.method6355() - local17;
									local558.anInt911 = local45 + Static81.aClass13_1.method6347() - local22;
									local558.anObjectArray1 = local6.anObjectArray6;
									Static297.aClass306_18.method7303(local558);
								}
								if (!local6.aBoolean795 && local232) {
									local6.aBoolean795 = true;
									if (local6.anObjectArray25 != null) {
										local558 = new Class5_Sub9();
										local558.aBoolean67 = true;
										local558.aClass357_2 = local6;
										local558.anInt916 = local40 + Static81.aClass13_1.method6355() - local17;
										local558.anInt911 = local45 + Static81.aClass13_1.method6347() - local22;
										local558.anObjectArray1 = local6.anObjectArray25;
										Static297.aClass306_18.method7303(local558);
									}
								}
								if (local6.aBoolean795 && local232 && local6.anObjectArray3 != null) {
									local558 = new Class5_Sub9();
									local558.aBoolean67 = true;
									local558.aClass357_2 = local6;
									local558.anInt916 = local40 + Static81.aClass13_1.method6355() - local17;
									local558.anInt911 = local45 + Static81.aClass13_1.method6347() - local22;
									local558.anObjectArray1 = local6.anObjectArray3;
									Static297.aClass306_18.method7303(local558);
								}
								if (local6.aBoolean795 && !local232) {
									local6.aBoolean795 = false;
									if (local6.anObjectArray5 != null) {
										local558 = new Class5_Sub9();
										local558.aBoolean67 = true;
										local558.aClass357_2 = local6;
										local558.anInt916 = local40 + Static81.aClass13_1.method6355() - local17;
										local558.anInt911 = local45 + Static81.aClass13_1.method6347() - local22;
										local558.anObjectArray1 = local6.anObjectArray5;
										Static118.aClass306_12.method7303(local558);
									}
								}
								if (local6.anObjectArray26 != null) {
									local558 = new Class5_Sub9();
									local558.aClass357_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray26;
									Static272.aClass306_17.method7303(local558);
								}
								@Pc(1570) Class5_Sub9 local1570;
								if (local6.lb != null && Static457.anInt7737 > local6.anInt9869) {
									if (local6.anIntArray796 == null || Static457.anInt7737 - local6.anInt9869 > 32) {
										local558 = new Class5_Sub9();
										local558.aClass357_2 = local6;
										local558.anObjectArray1 = local6.lb;
										Static297.aClass306_18.method7303(local558);
									} else {
										label687: for (local335 = local6.anInt9869; local335 < Static457.anInt7737; local335++) {
											local708 = Static535.anIntArray690[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray796.length; local469++) {
												if (local6.anIntArray796[local469] == local708) {
													local1570 = new Class5_Sub9();
													local1570.aClass357_2 = local6;
													local1570.anObjectArray1 = local6.lb;
													Static297.aClass306_18.method7303(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt9869 = Static457.anInt7737;
								}
								if (local6.anObjectArray7 != null && Static197.anInt3541 > local6.anInt9807) {
									if (local6.anIntArray794 == null || Static197.anInt3541 - local6.anInt9807 > 32) {
										local558 = new Class5_Sub9();
										local558.aClass357_2 = local6;
										local558.anObjectArray1 = local6.anObjectArray7;
										Static297.aClass306_18.method7303(local558);
									} else {
										label663: for (local335 = local6.anInt9807; local335 < Static197.anInt3541; local335++) {
											local708 = Static584.anIntArray756[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray794.length; local469++) {
												if (local6.anIntArray794[local469] == local708) {
													local1570 = new Class5_Sub9();
													local1570.aClass357_2 = local6;
													local1570.anObjectArray1 = local6.anObjectArray7;
													Static297.aClass306_18.method7303(local1570);
													break label663;
												}
											}
										}
									}
									local6.anInt9807 = Static197.anInt3541;
								}
								if (local6.anObjectArray28 != null && Static202.anInt3586 > local6.anInt9799) {
									if (local6.anIntArray795 == null || Static202.anInt3586 - local6.anInt9799 > 32) {
										local558 = new Class5_Sub9();
										local558.aClass357_2 = local6;
										local558.anObjectArray1 = local6.anObjectArray28;
										Static297.aClass306_18.method7303(local558);
									} else {
										label639: for (local335 = local6.anInt9799; local335 < Static202.anInt3586; local335++) {
											local708 = Static280.anIntArray375[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray795.length; local469++) {
												if (local6.anIntArray795[local469] == local708) {
													local1570 = new Class5_Sub9();
													local1570.aClass357_2 = local6;
													local1570.anObjectArray1 = local6.anObjectArray28;
													Static297.aClass306_18.method7303(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt9799 = Static202.anInt3586;
								}
								if (local6.anObjectArray15 != null && Static356.anInt6350 > local6.anInt9842) {
									if (local6.anIntArray798 == null || Static356.anInt6350 - local6.anInt9842 > 32) {
										local558 = new Class5_Sub9();
										local558.aClass357_2 = local6;
										local558.anObjectArray1 = local6.anObjectArray15;
										Static297.aClass306_18.method7303(local558);
									} else {
										label615: for (local335 = local6.anInt9842; local335 < Static356.anInt6350; local335++) {
											local708 = Static276.anIntArray718[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray798.length; local469++) {
												if (local6.anIntArray798[local469] == local708) {
													local1570 = new Class5_Sub9();
													local1570.aClass357_2 = local6;
													local1570.anObjectArray1 = local6.anObjectArray15;
													Static297.aClass306_18.method7303(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt9842 = Static356.anInt6350;
								}
								if (local6.anObjectArray12 != null && Static458.anInt7755 > local6.anInt9838) {
									if (local6.anIntArray792 == null || Static458.anInt7755 - local6.anInt9838 > 32) {
										local558 = new Class5_Sub9();
										local558.aClass357_2 = local6;
										local558.anObjectArray1 = local6.anObjectArray12;
										Static297.aClass306_18.method7303(local558);
									} else {
										label591: for (local335 = local6.anInt9838; local335 < Static458.anInt7755; local335++) {
											local708 = Static462.anIntArray541[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray792.length; local469++) {
												if (local6.anIntArray792[local469] == local708) {
													local1570 = new Class5_Sub9();
													local1570.aClass357_2 = local6;
													local1570.anObjectArray1 = local6.anObjectArray12;
													Static297.aClass306_18.method7303(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt9838 = Static458.anInt7755;
								}
								if (Static36.anInt660 > local6.anInt9880 && local6.anObjectArray20 != null) {
									local558 = new Class5_Sub9();
									local558.aClass357_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray20;
									Static297.aClass306_18.method7303(local558);
								}
								if (Static543.anInt10432 > local6.anInt9880 && local6.anObjectArray13 != null) {
									local558 = new Class5_Sub9();
									local558.aClass357_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray13;
									Static297.aClass306_18.method7303(local558);
								}
								if (Static324.anInt5595 > local6.anInt9880 && local6.anObjectArray31 != null) {
									local558 = new Class5_Sub9();
									local558.aClass357_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray31;
									Static297.aClass306_18.method7303(local558);
								}
								if (Static637.anInt10328 > local6.anInt9880 && local6.anObjectArray8 != null) {
									local558 = new Class5_Sub9();
									local558.aClass357_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray8;
									Static297.aClass306_18.method7303(local558);
								}
								if (Static20.anInt442 > local6.anInt9880 && local6.anObjectArray4 != null) {
									local558 = new Class5_Sub9();
									local558.aClass357_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray4;
									Static297.aClass306_18.method7303(local558);
								}
								local6.anInt9880 = Static278.anInt4551;
								if (local6.anObjectArray27 != null) {
									for (local335 = 0; local335 < Static451.anInt7590; local335++) {
										@Pc(2038) Class5_Sub9 local2038 = new Class5_Sub9();
										local2038.aClass357_2 = local6;
										local2038.anInt918 = Static451.anInterface24Array4[local335].method5143();
										local2038.anInt919 = Static451.anInterface24Array4[local335].method5144();
										local2038.anObjectArray1 = local6.anObjectArray27;
										Static297.aClass306_18.method7303(local2038);
									}
								}
								if (Class14_Sub1_Sub5_Sub2.lb && local6.anObjectArray30 != null) {
									local558 = new Class5_Sub9();
									local558.aClass357_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray30;
									Static297.aClass306_18.method7303(local558);
								}
							}
							if (local6.anInt9828 == 5 && local6.anInt9832 != -1) {
								local6.method8385(Static499.aClass121_1, Static629.aClass20_1).method5168(local6.anInt9797, Static485.aClass126_17);
							}
							Static549.method7772(local6);
							if (local6.anInt9828 == 0) {
								method1229(arg0, local6.anInt9804, local28, local30, local32, local34, local17 - local6.anInt9814, local22 - local6.anInt9819, arg8, arg9, arg10, arg11);
								if (local6.aClass357Array2 != null) {
									method1229(local6.aClass357Array2, local6.anInt9804, local28, local30, local32, local34, local17 - local6.anInt9814, local22 - local6.anInt9819, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class5_Sub15 local2164 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local6.anInt9804);
								if (local2164 != null) {
									if (Static24.aClass235_1 == Static191.aClass235_2 && local2164.anInt2406 == 0 && !Static251.aBoolean343 && local232 && !Static571.aBoolean764) {
										Static313.method4948();
									}
									Static48.method770(arg8, arg9, local28, local17, local22, local30, arg10, arg11, local32, local34, local2164.anInt2409);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static549.method7772(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!vfa;)Z")
	public static boolean method1231(@OriginalArg(0) Class357 arg0) {
		if (Static571.aBoolean764) {
			if (method1225(arg0).anInt10264 != 0) {
				return false;
			}
			if (arg0.anInt9828 == 0) {
				return false;
			}
		}
		return arg0.aBoolean797;
	}
}
