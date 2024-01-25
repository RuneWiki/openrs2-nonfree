import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!o;")
	public static Class49 aClass49_4;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	public static int anInt1042;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
	public static final int[] anIntArray45 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_13 = new Class194(65, 2);

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_30 = new Class220(15, 0, 1, 0);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method880() {
		Static138.anInt2467 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static424.anInt7114; local3++) {
			@Pc(14) Class2_Sub1_Sub3_Sub1 local14 = ((Class5_Sub7) Static380.aClass252_36.method5659((long) Static218.anIntArray351[local3])).aClass2_Sub1_Sub3_Sub1_1;
			if (local14.aBoolean409 && local14.method4914() != -1) {
				@Pc(32) int local32 = (local14.method4913() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt7500 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt7502 - local32 >> 7;
				@Pc(53) Class2_Sub1_Sub3 local53 = Static371.method4861(local39, local46, local14.aByte105);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt6126;
					if (local53 instanceof Class2_Sub1_Sub3_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt6174 == 0 && local53.method4914() != -1) {
						Static11.anIntArray13[Static138.anInt2467] = local58;
						Static3.anIntArray2[Static138.anInt2467] = local58;
						Static138.anInt2467++;
						local53.anInt6174++;
					}
					Static11.anIntArray13[Static138.anInt2467] = local58;
					Static3.anIntArray2[Static138.anInt2467] = local14.anInt6126 + 2048;
					Static138.anInt2467++;
					local53.anInt6174++;
				}
			}
		}
		Static365.method4723(0, Static11.anIntArray13, Static138.anInt2467 - 1, Static3.anIntArray2);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method883() {
		@Pc(1) int local1 = Static31.anInt622;
		@Pc(3) int[] local3 = Static334.anIntArray387;
		@Pc(11) int local11 = Static130.aBoolean158 ? local1 : local1 + Static424.anInt7114;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class2_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class5_Sub7) Static380.aClass252_36.method5659((long) Static218.anIntArray351[local13 - local1])).aClass2_Sub1_Sub3_Sub1_1;
			}
			if (local23.anInt6150 >= 0) {
				@Pc(43) int local43 = local23.method4913();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt7500 & 0x7F) == 0 && (local23.anInt7502 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7500 & 0x7F) == 64 && (local23.anInt7502 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class2_Sub1_Sub3_Sub2 && local23.aClass5_Sub11_3 != null && Static85.anInt1536 >= local23.aClass5_Sub11_3.anInt1522 && Static85.anInt1536 < local23.aClass5_Sub11_3.anInt1512) {
					((Class2_Sub1_Sub3_Sub2) local23).aBoolean413 = false;
				}
				local23.anInt7501 = Static192.method2572(local23.anInt7502, local23.anInt7500, local23.aByte105);
				Static462.method6056(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)I")
	public static int method884() {
		return 16;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!fi;)Lclient!ud;")
	public static Class5_Sub40 method885(@OriginalArg(0) Class76 arg0) {
		@Pc(13) Class5_Sub40 local13 = (Class5_Sub40) Static66.aClass252_8.method5659(((long) arg0.anInt2100 << 32) + (long) arg0.anInt2115);
		return local13 == null ? arg0.aClass5_Sub40_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method886(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static31.anInt622;
		@Pc(3) int[] local3 = Static334.anIntArray387;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static424.anInt7114; local5++) {
			@Pc(15) Class2_Sub1_Sub3 local15;
			if (local5 < local1) {
				local15 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class5_Sub7) Static380.aClass252_36.method5659((long) Static218.anIntArray351[local5 - local1])).aClass2_Sub1_Sub3_Sub1_1;
			}
			if (local15.aByte105 == arg0 && local15.anInt6150 >= 0) {
				@Pc(39) int local39 = local15.method4913();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt7500 & 0x7F) != 0 || (local15.anInt7502 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7500 & 0x7F) != 64 || (local15.anInt7502 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt7500 >> 7;
					local80 = local15.anInt7502 >> 7;
					if (local15.anInt6150 > Static49.anIntArrayArray5[local75][local80]) {
						Static49.anIntArrayArray5[local75][local80] = local15.anInt6150;
						Static179.anIntArrayArray19[local75][local80] = 1;
					} else if (local15.anInt6150 == Static49.anIntArrayArray5[local75][local80]) {
						local116 = Static179.anIntArrayArray19[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt7500 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt7502 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt7500 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt7502 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt6150 > Static49.anIntArrayArray5[local158][local161]) {
								Static49.anIntArrayArray5[local158][local161] = local15.anInt6150;
								Static179.anIntArrayArray19[local158][local161] = 1;
							} else if (local15.anInt6150 == Static49.anIntArrayArray5[local158][local161]) {
								local116 = Static179.anIntArrayArray19[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!fi;)Z")
	public static boolean method890(@OriginalArg(0) Class76 arg0) {
		if (Static97.aBoolean113) {
			if (method885(arg0).anInt6805 != 0) {
				return false;
			}
			if (arg0.anInt2060 == 0) {
				return false;
			}
		}
		return arg0.aBoolean143;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!fi;)Lclient!fi;")
	public static Class76 method891(@OriginalArg(0) Class76 arg0) {
		@Pc(4) int local4 = method885(arg0).method5383();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static213.method2817(arg0.anInt2112);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method893() {
		for (@Pc(1) int local1 = 0; local1 < Static433.anInt7210; local1++) {
			@Pc(6) int[] local6 = Static49.anIntArrayArray5[local1];
			for (@Pc(8) int local8 = 0; local8 < Static418.anInt6969; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method894() {
		@Pc(1) int local1 = Static31.anInt622;
		@Pc(3) int[] local3 = Static334.anIntArray387;
		@Pc(20) boolean local20 = Static216.aClass1_Sub1_1.anInt4501 == 1 && local1 > 200 || Static216.aClass1_Sub1_1.anInt4501 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class2_Sub1_Sub3_Sub2 local29 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local3[local22]];
			if (local29.method4929()) {
				local29.method6032();
				if (local29.aShort107 >= 0 && local29.aShort106 >= 0 && local29.aShort104 < Static433.anInt7210 && local29.aShort105 < Static418.anInt6969) {
					local29.aBoolean413 = local29.aBoolean410 ? local20 : false;
					if (local29 == Static220.aClass2_Sub1_Sub3_Sub2_1) {
						local29.anInt6150 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean409) {
							local75++;
						}
						if (local29.anInt6186 > Static85.anInt1536) {
							local75 += 2;
						}
						local75 += 5 - local29.method4913() << 2;
						if (local29.aBoolean412) {
							local75 += 512;
						} else {
							if (Static158.anInt2751 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6150 = local75 + 1;
					}
				} else {
					local29.anInt6150 = -1;
				}
			} else {
				local29.anInt6150 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static424.anInt7114; local116++) {
			@Pc(127) Class2_Sub1_Sub3_Sub1 local127 = ((Class5_Sub7) Static380.aClass252_36.method5659((long) Static218.anIntArray351[local116])).aClass2_Sub1_Sub3_Sub1_1;
			if (local127.method4088() && local127.aClass131_1.method2776(Static408.aClass39_1)) {
				local127.method6032();
				if (local127.aShort107 >= 0 && local127.aShort106 >= 0 && local127.aShort104 < Static433.anInt7210 && local127.aShort105 < Static418.anInt6969) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean409) {
						local164++;
					}
					if (local127.anInt6186 > Static85.anInt1536) {
						local164 += 2;
					}
					local164 += 5 - local127.method4913() << 2;
					if (Static158.anInt2751 == 0) {
						if (local127.aClass131_1.aBoolean226) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static158.anInt2751 == 1) {
						if (local127.aClass131_1.aBoolean226) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass131_1.aBoolean227) {
						local164 += 1024;
					} else if (!local127.aClass131_1.aBoolean228) {
						local164 += 256;
					}
					local127.anInt6150 = local164 + 1;
				} else {
					local127.anInt6150 = -1;
				}
			} else {
				local127.anInt6150 = -1;
			}
		}
		for (local75 = 0; local75 < Static186.aClass266Array1.length; local75++) {
			@Pc(230) Class266 local230 = Static186.aClass266Array1[local75];
			if (local230 != null) {
				if (local230.anInt7406 == 1) {
					@Pc(244) Class5_Sub7 local244 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local230.anInt7405);
					if (local244 != null) {
						@Pc(249) Class2_Sub1_Sub3_Sub1 local249 = local244.aClass2_Sub1_Sub3_Sub1_1;
						if (local249.anInt6150 >= 0) {
							local249.anInt6150 += 2048;
						}
					}
				} else if (local230.anInt7406 == 10) {
					@Pc(268) Class2_Sub1_Sub3_Sub2 local268 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local230.anInt7405];
					if (local268 != null && local268 != Static220.aClass2_Sub1_Sub3_Sub2_1 && local268.anInt6150 >= 0) {
						local268.anInt6150 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	public static void method895(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static31.anInt622;
		@Pc(3) int[] local3 = Static334.anIntArray387;
		@Pc(11) int local11 = Static130.aBoolean158 ? local1 : local1 + Static424.anInt7114;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class2_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class5_Sub7) Static380.aClass252_36.method5659((long) Static218.anIntArray351[local13 - local1])).aClass2_Sub1_Sub3_Sub1_1;
			}
			if (local23.aByte105 == arg0) {
				local23.anInt6174 = 0;
				if (local23.anInt6150 < 0) {
					local23.aBoolean409 = false;
				} else {
					@Pc(54) int local54 = local23.method4913();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt7500 & 0x7F) != 0 || (local23.anInt7502 & 0x7F) != 0) {
							local23.aBoolean409 = false;
							continue;
						}
					} else if ((local23.anInt7500 & 0x7F) != 64 || (local23.anInt7502 & 0x7F) != 64) {
						local23.aBoolean409 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt7500 >> 7;
						local101 = local23.anInt7502 >> 7;
						if (local23.anInt6150 != Static49.anIntArrayArray5[local96][local101]) {
							local23.aBoolean409 = true;
							continue;
						}
						if (Static179.anIntArrayArray19[local96][local101] > 1) {
							local126 = Static179.anIntArrayArray19[local96][local101]--;
							local23.aBoolean409 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt7500 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt7502 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt7500 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt7502 + local96 >> 7;
						if (!Static360.method4655(local162, local101, local155, local23.anInt6150, local169)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt6150 == Static49.anIntArrayArray5[local180][local183]) {
										local126 = Static179.anIntArrayArray19[local180][local183]--;
									}
								}
							}
							local23.aBoolean409 = true;
							continue;
						}
					}
					if (local23 instanceof Class2_Sub1_Sub3_Sub2 && local23.aClass5_Sub11_3 != null && Static85.anInt1536 >= local23.aClass5_Sub11_3.anInt1522 && Static85.anInt1536 < local23.aClass5_Sub11_3.anInt1512) {
						((Class2_Sub1_Sub3_Sub2) local23).aBoolean413 = false;
					}
					local23.aBoolean409 = false;
					local23.anInt7501 = Static192.method2572(local23.anInt7502, local23.anInt7500, local23.aByte105);
					Static462.method6056(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!fi;IIIIIIIII)V")
	public static void method899(@OriginalArg(0) Class76[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class76 local6 = arg0[local1];
			if (local6 != null && local6.anInt2112 == arg1) {
				@Pc(17) int local17 = local6.anInt2126 + arg6;
				@Pc(22) int local22 = local6.anInt2079 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2060 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2127;
					@Pc(45) int local45 = local22 + local6.anInt2106;
					if (local6.anInt2060 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2060 == 0 || local6.aBoolean145 || method885(local6).anInt6805 != 0 || local6 == Static359.aClass76_13 || local6.anInt2107 == Static200.anInt3340) {
					if (!method890(local6)) {
						if (local6 == Static387.aClass76_14) {
							Static240.aBoolean469 = true;
							Static383.anInt6297 = local17;
							Static146.anInt2650 = local22;
						}
						if (local6.aBoolean141 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean139 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class5_Sub33 local148 = (Class5_Sub33) Static250.aClass177_26.method3618(); local148 != null; local148 = (Class5_Sub33) Static250.aClass177_26.method3619()) {
									if (local148.aBoolean384) {
										local148.method6003();
										local148.aClass76_12.aBoolean142 = false;
									}
								}
								if (Static287.anInt4467 == 0) {
									Static387.aClass76_14 = null;
									Static359.aClass76_13 = null;
								}
								Static151.anInt7436 = 0;
								Static309.aBoolean334 = false;
								Static199.aBoolean211 = false;
								if (!Static272.aBoolean283) {
									Static2.method6028();
								}
							}
							@Pc(204) boolean local204;
							if (Static290.aClass66_1.method5965() >= local28 && Static290.aClass66_1.method5974() >= local30 && Static290.aClass66_1.method5965() < local32 && Static290.aClass66_1.method5974() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static423.aBoolean478 && local204) {
								if (local6.anInt2090 >= 0) {
									Static333.anInt5333 = local6.anInt2090;
								} else if (local6.aBoolean139) {
									Static333.anInt5333 = -1;
								}
							}
							if (!Static272.aBoolean283 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static222.method2928(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(248) boolean local248 = false;
							if (Static290.aClass66_1.method5970() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class5_Sub4 local263 = (Class5_Sub4) Static362.aClass177_33.method3618();
							if (local263 != null && local263.method3834() == 0 && local263.method3837() >= local28 && local263.method3833() >= local30 && local263.method3837() < local32 && local263.method3833() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray28 != null) {
								for (local296 = 0; local296 < local6.aByteArray28.length; local296++) {
									if (Static188.aClass80_1.method1723(local6.aByteArray28[local296])) {
										if (local6.anIntArray110 == null || Static85.anInt1536 >= local6.anIntArray110[local296]) {
											@Pc(328) byte local328 = local6.aByteArray29[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static188.aClass80_1.method1723(86) && !Static188.aClass80_1.method1723(82) && !Static188.aClass80_1.method1723(81)) && ((local328 & 0x2) == 0 || Static188.aClass80_1.method1723(86)) && ((local328 & 0x1) == 0 || Static188.aClass80_1.method1723(82)) && ((local328 & 0x4) == 0 || Static188.aClass80_1.method1723(81))) {
												if (local296 < 10) {
													Static356.method4613("", -1, local6.anInt2100, local296 + 1);
												} else if (local296 == 10) {
													Static289.method3586();
													@Pc(399) Class5_Sub40 local399 = method885(local6);
													Static205.method2745(local399.method5384(), local6, local399.anInt6801);
													Static240.aString73 = Static184.method2504(local6);
													if (Static240.aString73 == null) {
														Static240.aString73 = "Null";
													}
													Static21.aString3 = local6.aString17 + "<col=ffffff>";
												}
												local430 = local6.anIntArray105[local296];
												if (local6.anIntArray110 == null) {
													local6.anIntArray110 = new int[local6.aByteArray28.length];
												}
												if (local430 == 0) {
													local6.anIntArray110[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray110[local296] = Static85.anInt1536 + local430;
												}
											}
										}
									} else if (local6.anIntArray110 != null) {
										local6.anIntArray110[local296] = 0;
									}
								}
							}
							if (local258) {
								Static264.method3357(local263.method3837() - local17, local263.method3833() - local22, local6);
							}
							if (Static387.aClass76_14 != null && Static387.aClass76_14 != local6 && local204 && method885(local6).method5381()) {
								Static161.aClass76_6 = local6;
							}
							if (local6 == Static359.aClass76_13) {
								Static320.aBoolean344 = true;
								Static454.anInt7429 = local17;
								Static147.anInt2654 = local22;
							}
							if (local6.aBoolean145 || local6.anInt2107 != 0) {
								@Pc(515) Class5_Sub33 local515;
								if (local204 && Static104.anInt1776 != 0 && local6.anObjectArray15 != null) {
									local515 = new Class5_Sub33();
									local515.aBoolean384 = true;
									local515.aClass76_12 = local6;
									local515.anInt5630 = Static104.anInt1776;
									local515.anObjectArray35 = local6.anObjectArray15;
									Static250.aClass177_26.method3615(local515);
								}
								if (Static387.aClass76_14 != null || Static272.aBoolean283 || local6.anInt2107 != Static247.anInt3978 && Static151.anInt7436 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt2107 != 0) {
									if (local6.anInt2107 == Static49.anInt898 || local6.anInt2107 == Static261.anInt4198) {
										Static54.aClass76_3 = local6;
										if (Static51.aClass207_1 != null) {
											Static51.aClass207_1.method4572(Static407.aClass200_9, local6.anInt2106);
										}
										if (local6.anInt2107 == Static49.anInt898) {
											if (!Static272.aBoolean283 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static258.method3328(arg8, Static407.aClass200_9, arg9);
												for (@Pc(598) Class88_Sub5 local598 = (Class88_Sub5) Static381.aClass107_8.method2326(); local598 != null; local598 = (Class88_Sub5) Static381.aClass107_8.method2327()) {
													if (arg8 >= local598.anInt6071 && arg8 < local598.anInt6081 && arg9 >= local598.anInt6074 && arg9 < local598.anInt6072) {
														Static2.method6028();
														Static142.method2034(local598.aClass2_Sub1_Sub3_1);
													}
												}
											}
											Static348.method4520(local22, local17, local6);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt2107 == Static200.anInt3340) {
										if (local6.method1688(Static407.aClass200_9) == null || Static221.anInt3661 != 0 && Static221.anInt3661 != 3 || Static272.aBoolean283 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray116[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray107[local670]) {
											continue;
										}
										local296 -= local6.anInt2127 / 2;
										local670 -= local6.anInt2106 / 2;
										if (Static449.anInt7379 == 4) {
											local709 = (int) Static99.aFloat33 & 0x3FFF;
										} else {
											local709 = (int) Static99.aFloat33 + Static65.anInt5018 & 0x3FFF;
										}
										@Pc(721) int local721 = Class30.anIntArray38[local709];
										@Pc(725) int local725 = Class30.anIntArray37[local709];
										if (Static449.anInt7379 != 4) {
											local721 = local721 * (Static430.anInt7181 + 256) >> 8;
											local725 = local725 * (Static430.anInt7181 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static449.anInt7379 == 4) {
											local775 = (Static423.anInt7090 >> 7) + (local754 >> 2);
											local783 = (Static21.anInt449 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static220.aClass2_Sub1_Sub3_Sub2_1.method4913() - 1) * 64;
											local775 = (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 - local792 >> 7) + (local754 >> 2);
											local783 = (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 - local792 >> 7) - (local764 >> 2);
										}
										if (Static423.aBoolean478 && (Static277.anInt4336 & 0x40) != 0) {
											@Pc(825) Class76 local825 = Static371.method4859(Static143.anInt2595, Static127.anInt2221);
											if (local825 == null) {
												Static289.method3586();
											} else {
												Static450.method5939(1L, local6.anInt2057, local775, true, 21, Static240.aString73, Static360.anInt5869, false, local783, " ->");
											}
											continue;
										}
										if (Static217.aClass197_2 == Static369.aClass197_4) {
											Static450.method5939(1L, -1, local775, true, 45, Static129.aClass198_33.method4012(Static38.anInt4834), -1, false, local783, "");
										}
										Static450.method5939(1L, -1, local775, true, 6, Static259.aString48, Static193.anInt3220, false, local783, "");
										continue;
									}
									if (local6.anInt2107 == Static247.anInt3978) {
										Static22.aClass76_2 = local6;
										if (local204) {
											Static309.aBoolean334 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method3837() - local17 - local6.anInt2127 / 2) * 2.0D / (double) Static98.aFloat84);
											local670 = (int) -((double) (local263.method3833() - local22 - local6.anInt2106 / 2) * 2.0D / (double) Static98.aFloat84);
											local430 = Static282.anInt4369 + local296 + Static98.anInt3332;
											local709 = Static110.anInt1841 + local670 + Static98.anInt3328;
											@Pc(939) Class5_Sub2_Sub18 local939 = Static226.method2983();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method6014(local430, local944, local709);
											if (local944 != null) {
												if (Static188.aClass80_1.method1723(82) && Static189.anInt3178 > 0) {
													Static16.method275(local944[2], local944[1], local944[0]);
													continue;
												}
												Static199.aBoolean211 = true;
												Static353.anInt5761 = local944[0];
												Static164.anInt2787 = local944[1];
												Static34.anInt672 = local944[2];
											}
											Static151.anInt7436 = 1;
											Static66.aBoolean95 = false;
											Static464.anInt7343 = Static290.aClass66_1.method5965();
											Static372.anInt6084 = Static290.aClass66_1.method5974();
											continue;
										}
										if (local248 && Static151.anInt7436 > 0) {
											if (Static151.anInt7436 == 1 && (Static464.anInt7343 != Static290.aClass66_1.method5965() || Static372.anInt6084 != Static290.aClass66_1.method5974())) {
												Static76.anInt1388 = Static282.anInt4369;
												Static336.anInt5455 = Static110.anInt1841;
												Static151.anInt7436 = 2;
											}
											if (Static151.anInt7436 == 2) {
												Static66.aBoolean95 = true;
												Static283.method3501(Static76.anInt1388 + (int) ((double) (Static464.anInt7343 - Static290.aClass66_1.method5965()) * 2.0D / (double) Static98.aFloat83));
												Static425.method5638(Static336.anInt5455 - (int) ((double) (Static372.anInt6084 - Static290.aClass66_1.method5974()) * 2.0D / (double) Static98.aFloat83));
											}
											continue;
										}
										if (Static151.anInt7436 > 0 && !Static66.aBoolean95) {
											if ((Static456.anInt7452 == 1 || Static20.method336()) && Static18.anInt395 > 2) {
												Static323.method3980(Static464.anInt7343, Static372.anInt6084);
											} else if (Static337.method4361()) {
												Static323.method3980(Static464.anInt7343, Static372.anInt6084);
											}
										}
										Static151.anInt7436 = 0;
										continue;
									}
									if (local6.anInt2107 == Static430.anInt7165) {
										if (local248) {
											Static89.method1303(local6.anInt2106, local6.anInt2127, Static290.aClass66_1.method5965() - local17, Static290.aClass66_1.method5974() - local22);
										}
										continue;
									}
									if (local6.anInt2107 == Static396.anInt6463) {
										Static277.method3449(local17, local22, local6);
										continue;
									}
								}
								if (!local6.aBoolean151 && local258) {
									local6.aBoolean151 = true;
									if (local6.anObjectArray27 != null) {
										local515 = new Class5_Sub33();
										local515.aBoolean384 = true;
										local515.aClass76_12 = local6;
										local515.anInt5627 = local263.method3837() - local17;
										local515.anInt5630 = local263.method3833() - local22;
										local515.anObjectArray35 = local6.anObjectArray27;
										Static250.aClass177_26.method3615(local515);
									}
								}
								if (local6.aBoolean151 && local248 && local6.anObjectArray28 != null) {
									local515 = new Class5_Sub33();
									local515.aBoolean384 = true;
									local515.aClass76_12 = local6;
									local515.anInt5627 = Static290.aClass66_1.method5965() - local17;
									local515.anInt5630 = Static290.aClass66_1.method5974() - local22;
									local515.anObjectArray35 = local6.anObjectArray28;
									Static250.aClass177_26.method3615(local515);
								}
								if (local6.aBoolean151 && !local248) {
									local6.aBoolean151 = false;
									if (local6.anObjectArray25 != null) {
										local515 = new Class5_Sub33();
										local515.aBoolean384 = true;
										local515.aClass76_12 = local6;
										local515.anInt5627 = Static290.aClass66_1.method5965() - local17;
										local515.anInt5630 = Static290.aClass66_1.method5974() - local22;
										local515.anObjectArray35 = local6.anObjectArray25;
										Static293.aClass177_29.method3615(local515);
									}
								}
								if (local248 && local6.anObjectArray11 != null) {
									local515 = new Class5_Sub33();
									local515.aBoolean384 = true;
									local515.aClass76_12 = local6;
									local515.anInt5627 = Static290.aClass66_1.method5965() - local17;
									local515.anInt5630 = Static290.aClass66_1.method5974() - local22;
									local515.anObjectArray35 = local6.anObjectArray11;
									Static250.aClass177_26.method3615(local515);
								}
								if (!local6.aBoolean142 && local204) {
									local6.aBoolean142 = true;
									if (local6.anObjectArray24 != null) {
										local515 = new Class5_Sub33();
										local515.aBoolean384 = true;
										local515.aClass76_12 = local6;
										local515.anInt5627 = Static290.aClass66_1.method5965() - local17;
										local515.anInt5630 = Static290.aClass66_1.method5974() - local22;
										local515.anObjectArray35 = local6.anObjectArray24;
										Static250.aClass177_26.method3615(local515);
									}
								}
								if (local6.aBoolean142 && local204 && local6.anObjectArray14 != null) {
									local515 = new Class5_Sub33();
									local515.aBoolean384 = true;
									local515.aClass76_12 = local6;
									local515.anInt5627 = Static290.aClass66_1.method5965() - local17;
									local515.anInt5630 = Static290.aClass66_1.method5974() - local22;
									local515.anObjectArray35 = local6.anObjectArray14;
									Static250.aClass177_26.method3615(local515);
								}
								if (local6.aBoolean142 && !local204) {
									local6.aBoolean142 = false;
									if (local6.anObjectArray10 != null) {
										local515 = new Class5_Sub33();
										local515.aBoolean384 = true;
										local515.aClass76_12 = local6;
										local515.anInt5627 = Static290.aClass66_1.method5965() - local17;
										local515.anInt5630 = Static290.aClass66_1.method5974() - local22;
										local515.anObjectArray35 = local6.anObjectArray10;
										Static293.aClass177_29.method3615(local515);
									}
								}
								if (local6.anObjectArray12 != null) {
									local515 = new Class5_Sub33();
									local515.aClass76_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray12;
									Static374.aClass177_34.method3615(local515);
								}
								@Pc(1483) Class5_Sub33 local1483;
								if (local6.anObjectArray29 != null && Static209.anInt3500 > local6.anInt2049) {
									if (local6.anIntArray114 == null || Static209.anInt3500 - local6.anInt2049 > 32) {
										local515 = new Class5_Sub33();
										local515.aClass76_12 = local6;
										local515.anObjectArray35 = local6.anObjectArray29;
										Static250.aClass177_26.method3615(local515);
									} else {
										label678: for (local296 = local6.anInt2049; local296 < Static209.anInt3500; local296++) {
											local670 = Static117.anIntArray478[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray114.length; local430++) {
												if (local6.anIntArray114[local430] == local670) {
													local1483 = new Class5_Sub33();
													local1483.aClass76_12 = local6;
													local1483.anObjectArray35 = local6.anObjectArray29;
													Static250.aClass177_26.method3615(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt2049 = Static209.anInt3500;
								}
								if (local6.anObjectArray4 != null && Static202.anInt3344 > local6.anInt2062) {
									if (local6.anIntArray111 == null || Static202.anInt3344 - local6.anInt2062 > 32) {
										local515 = new Class5_Sub33();
										local515.aClass76_12 = local6;
										local515.anObjectArray35 = local6.anObjectArray4;
										Static250.aClass177_26.method3615(local515);
									} else {
										label654: for (local296 = local6.anInt2062; local296 < Static202.anInt3344; local296++) {
											local670 = Static263.anIntArray331[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray111.length; local430++) {
												if (local6.anIntArray111[local430] == local670) {
													local1483 = new Class5_Sub33();
													local1483.aClass76_12 = local6;
													local1483.anObjectArray35 = local6.anObjectArray4;
													Static250.aClass177_26.method3615(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt2062 = Static202.anInt3344;
								}
								if (local6.anObjectArray8 != null && Static27.anInt552 > local6.anInt2118) {
									if (local6.anIntArray109 == null || Static27.anInt552 - local6.anInt2118 > 32) {
										local515 = new Class5_Sub33();
										local515.aClass76_12 = local6;
										local515.anObjectArray35 = local6.anObjectArray8;
										Static250.aClass177_26.method3615(local515);
									} else {
										label630: for (local296 = local6.anInt2118; local296 < Static27.anInt552; local296++) {
											local670 = Static68.anIntArray61[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray109.length; local430++) {
												if (local6.anIntArray109[local430] == local670) {
													local1483 = new Class5_Sub33();
													local1483.aClass76_12 = local6;
													local1483.anObjectArray35 = local6.anObjectArray8;
													Static250.aClass177_26.method3615(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt2118 = Static27.anInt552;
								}
								if (local6.anObjectArray9 != null && Static327.anInt1023 > local6.anInt2058) {
									if (local6.anIntArray115 == null || Static327.anInt1023 - local6.anInt2058 > 32) {
										local515 = new Class5_Sub33();
										local515.aClass76_12 = local6;
										local515.anObjectArray35 = local6.anObjectArray9;
										Static250.aClass177_26.method3615(local515);
									} else {
										label606: for (local296 = local6.anInt2058; local296 < Static327.anInt1023; local296++) {
											local670 = Static369.anIntArray428[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray115.length; local430++) {
												if (local6.anIntArray115[local430] == local670) {
													local1483 = new Class5_Sub33();
													local1483.aClass76_12 = local6;
													local1483.anObjectArray35 = local6.anObjectArray9;
													Static250.aClass177_26.method3615(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt2058 = Static327.anInt1023;
								}
								if (local6.anObjectArray7 != null && Static93.anInt1613 > local6.anInt2067) {
									if (local6.anIntArray106 == null || Static93.anInt1613 - local6.anInt2067 > 32) {
										local515 = new Class5_Sub33();
										local515.aClass76_12 = local6;
										local515.anObjectArray35 = local6.anObjectArray7;
										Static250.aClass177_26.method3615(local515);
									} else {
										label582: for (local296 = local6.anInt2067; local296 < Static93.anInt1613; local296++) {
											local670 = Static392.anIntArray453[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray106.length; local430++) {
												if (local6.anIntArray106[local430] == local670) {
													local1483 = new Class5_Sub33();
													local1483.aClass76_12 = local6;
													local1483.anObjectArray35 = local6.anObjectArray7;
													Static250.aClass177_26.method3615(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt2067 = Static93.anInt1613;
								}
								if (Static186.anInt3149 > local6.anInt2105 && local6.anObjectArray2 != null) {
									local515 = new Class5_Sub33();
									local515.aClass76_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray2;
									Static250.aClass177_26.method3615(local515);
								}
								if (Static62.anInt1134 > local6.anInt2105 && local6.anObjectArray31 != null) {
									local515 = new Class5_Sub33();
									local515.aClass76_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray31;
									Static250.aClass177_26.method3615(local515);
								}
								if (Static215.anInt3591 > local6.anInt2105 && local6.anObjectArray19 != null) {
									local515 = new Class5_Sub33();
									local515.aClass76_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray19;
									Static250.aClass177_26.method3615(local515);
								}
								if (Static297.anInt4647 > local6.anInt2105 && local6.anObjectArray26 != null) {
									local515 = new Class5_Sub33();
									local515.aClass76_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray26;
									Static250.aClass177_26.method3615(local515);
								}
								if (Static460.anInt7523 > local6.anInt2105 && local6.anObjectArray22 != null) {
									local515 = new Class5_Sub33();
									local515.aClass76_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray22;
									Static250.aClass177_26.method3615(local515);
								}
								local6.anInt2105 = Static319.anInt4969;
								if (local6.anObjectArray21 != null) {
									for (local296 = 0; local296 < Static323.anInt5038; local296++) {
										@Pc(1951) Class5_Sub33 local1951 = new Class5_Sub33();
										local1951.aClass76_12 = local6;
										local1951.anInt5635 = Static162.anInterface10Array2[local296].method1255();
										local1951.anInt5634 = Static162.anInterface10Array2[local296].method1253();
										local1951.anObjectArray35 = local6.anObjectArray21;
										Static250.aClass177_26.method3615(local1951);
									}
								}
								if (Static311.aBoolean336 && local6.anObjectArray18 != null) {
									local515 = new Class5_Sub33();
									local515.aClass76_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray18;
									Static250.aClass177_26.method3615(local515);
								}
							}
							if (local6.anInt2060 == 5 && local6.anInt2103 != -1) {
								local6.method1691(Static420.aClass175_2, Static42.aClass235_1).method4572(Static407.aClass200_9, local6.anInt2106);
							}
							Static119.method2862(local6);
							if (local6.anInt2060 == 0) {
								method899(arg0, local6.anInt2100, local28, local30, local32, local34, local17 - local6.anInt2052, local22 - local6.anInt2061, arg8, arg9);
								if (local6.aClass76Array2 != null) {
									method899(local6.aClass76Array2, local6.anInt2100, local28, local30, local32, local34, local17 - local6.anInt2052, local22 - local6.anInt2061, arg8, arg9);
								}
								@Pc(2073) Class5_Sub44 local2073 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local6.anInt2100);
								if (local2073 != null) {
									if (Static217.aClass197_2 == Static60.aClass197_1 && local2073.anInt6979 == 0 && !Static272.aBoolean283 && local204 && !Static97.aBoolean113) {
										Static2.method6028();
									}
									Static127.method1773(arg9, local32, local34, local2073.anInt6981, local30, local17, local28, arg8, local22);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static119.method2862(local6);
				}
			}
		}
	}
}
