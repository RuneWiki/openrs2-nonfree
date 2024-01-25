import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray3 = new Rectangle[100];

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!cr;")
	public static final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_44 = new Class92(13, 7);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1154() {
		Static398.anInt6893 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static453.anInt7682; local3++) {
			@Pc(10) Class1_Sub3_Sub3_Sub2 local10 = Static451.aClass1_Sub3_Sub3_Sub2Array1[Static29.anIntArray56[local3]];
			if (local10.aBoolean427 && local10.method4835() != -1) {
				@Pc(28) int local28 = (local10.method4831() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6053 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6055 - local28 >> 7;
				@Pc(49) Class1_Sub3_Sub3 local49 = Static117.method2136(local42, local10.aByte77, local35);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt6066;
					if (local49 instanceof Class1_Sub3_Sub3_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt6076 == 0 && local49.method4835() != -1) {
						Static75.anIntArray151[Static398.anInt6893] = local54;
						Static64.anIntArray93[Static398.anInt6893] = local54;
						Static398.anInt6893++;
						local49.anInt6076++;
					}
					Static75.anIntArray151[Static398.anInt6893] = local54;
					Static64.anIntArray93[Static398.anInt6893] = local10.anInt6066 + 2048;
					Static398.anInt6893++;
					local49.anInt6076++;
				}
			}
		}
		Static84.method1460(Static75.anIntArray151, Static64.anIntArray93, 0, Static398.anInt6893 - 1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!eo;)Lclient!eo;")
	public static Class68 method1155(@OriginalArg(0) Class68 arg0) {
		@Pc(4) int local4 = method1160(arg0).method3484();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static321.method4661(arg0.anInt2225);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!eo;)Z")
	public static boolean method1156(@OriginalArg(0) Class68 arg0) {
		if (Static176.aBoolean278) {
			if (method1160(arg0).anInt4282 != 0) {
				return false;
			}
			if (arg0.anInt2182 == 0) {
				return false;
			}
		}
		return arg0.aBoolean167;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1159() {
		@Pc(1) int local1 = Static207.anInt4136;
		@Pc(3) int[] local3 = Static322.anIntArray436;
		@Pc(20) boolean local20 = Static123.aClass21_Sub1_1.anInt877 == 1 && local1 > 200 || Static123.aClass21_Sub1_1.anInt877 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class1_Sub3_Sub3_Sub1 local29 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local3[local22]];
			if (local29.method3928()) {
				local29.method4826();
				if (local29.aShort181 >= 0 && local29.aShort179 >= 0 && local29.aShort180 < Static399.anInt6923 && local29.aShort178 < Static127.anInt2696) {
					local29.aBoolean366 = local29.aBoolean429 ? local20 : false;
					if (local29 == Static113.aClass1_Sub3_Sub3_Sub1_4) {
						local29.anInt6115 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean427) {
							local75++;
						}
						if (local29.anInt6059 > Static290.anInt5325) {
							local75 += 2;
						}
						local75 += 5 - local29.method4831() << 2;
						if (local29.aBoolean364) {
							local75 += 512;
						} else {
							if (Static37.anInt1026 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6115 = local75 + 1;
					}
				} else {
					local29.anInt6115 = -1;
				}
			} else {
				local29.anInt6115 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static453.anInt7682; local116++) {
			@Pc(123) Class1_Sub3_Sub3_Sub2 local123 = Static451.aClass1_Sub3_Sub3_Sub2Array1[Static29.anIntArray56[local116]];
			if (local123.method4850() && local123.aClass47_1.method1295(Static369.aClass11_1)) {
				local123.method4826();
				if (local123.aShort181 >= 0 && local123.aShort179 >= 0 && local123.aShort180 < Static399.anInt6923 && local123.aShort178 < Static127.anInt2696) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean427) {
						local160++;
					}
					if (local123.anInt6059 > Static290.anInt5325) {
						local160 += 2;
					}
					local160 += 5 - local123.method4831() << 2;
					if (Static37.anInt1026 == 0) {
						if (local123.aClass47_1.aBoolean125) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static37.anInt1026 == 1) {
						if (local123.aClass47_1.aBoolean125) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass47_1.aBoolean124) {
						local160 += 1024;
					} else if (!local123.aClass47_1.aBoolean127) {
						local160 += 256;
					}
					local123.anInt6115 = local160 + 1;
				} else {
					local123.anInt6115 = -1;
				}
			} else {
				local123.anInt6115 = -1;
			}
		}
		for (local75 = 0; local75 < Static370.aClass125Array1.length; local75++) {
			@Pc(226) Class125 local226 = Static370.aClass125Array1[local75];
			if (local226 != null) {
				if (local226.anInt3865 == 1) {
					@Pc(237) Class1_Sub3_Sub3_Sub2 local237 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local226.anInt3862];
					if (local237 != null && local237.anInt6115 >= 0) {
						local237.anInt6115 += 2048;
					}
				} else if (local226.anInt3865 == 10) {
					@Pc(258) Class1_Sub3_Sub3_Sub1 local258 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local226.anInt3862];
					if (local258 != null && local258 != Static113.aClass1_Sub3_Sub3_Sub1_4 && local258.anInt6115 >= 0) {
						local258.anInt6115 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!eo;)Lclient!kr;")
	public static Class3_Sub26 method1160(@OriginalArg(0) Class68 arg0) {
		@Pc(13) Class3_Sub26 local13 = (Class3_Sub26) Static101.aClass127_10.method3246(((long) arg0.anInt2177 << 32) + (long) arg0.anInt2187);
		return local13 == null ? arg0.aClass3_Sub26_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1162() {
		@Pc(1) int local1 = Static207.anInt4136;
		@Pc(3) int[] local3 = Static322.anIntArray436;
		@Pc(11) int local11 = Static180.aBoolean288 ? local1 : local1 + Static453.anInt7682;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub3_Sub3 local23;
			if (local13 < local1) {
				local23 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = Static451.aClass1_Sub3_Sub3_Sub2Array1[Static29.anIntArray56[local13 - local1]];
			}
			if (local23.anInt6115 >= 0) {
				@Pc(39) int local39 = local23.method4831();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6053 & 0x7F) == 0 && (local23.anInt6055 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6053 & 0x7F) == 64 && (local23.anInt6055 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class1_Sub3_Sub3_Sub1 && local23.aClass3_Sub11_3 != null && Static290.anInt5325 >= local23.aClass3_Sub11_3.anInt1467 && Static290.anInt5325 < local23.aClass3_Sub11_3.anInt1451) {
					((Class1_Sub3_Sub3_Sub1) local23).aBoolean366 = false;
				}
				local23.anInt6045 = Static124.method2209(local23.aByte77, local23.anInt6053, local23.anInt6055);
				Static199.method3242(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1164(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static207.anInt4136;
		@Pc(3) int[] local3 = Static322.anIntArray436;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static453.anInt7682; local5++) {
			@Pc(15) Class1_Sub3_Sub3 local15;
			if (local5 < local1) {
				local15 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local3[local5]];
			} else {
				local15 = Static451.aClass1_Sub3_Sub3_Sub2Array1[Static29.anIntArray56[local5 - local1]];
			}
			if (local15.aByte77 == arg0 && local15.anInt6115 >= 0) {
				@Pc(35) int local35 = local15.method4831();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6053 & 0x7F) != 0 || (local15.anInt6055 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6053 & 0x7F) != 64 || (local15.anInt6055 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6053 >> 7;
					local76 = local15.anInt6055 >> 7;
					if (local15.anInt6115 > Static417.anIntArrayArray56[local71][local76]) {
						Static417.anIntArrayArray56[local71][local76] = local15.anInt6115;
						Static321.anIntArrayArray46[local71][local76] = 1;
					} else if (local15.anInt6115 == Static417.anIntArrayArray56[local71][local76]) {
						local112 = Static321.anIntArrayArray46[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6053 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6055 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6053 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6055 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt6115 > Static417.anIntArrayArray56[local154][local157]) {
								Static417.anIntArrayArray56[local154][local157] = local15.anInt6115;
								Static321.anIntArrayArray46[local154][local157] = 1;
							} else if (local15.anInt6115 == Static417.anIntArrayArray56[local154][local157]) {
								local112 = Static321.anIntArrayArray46[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!eo;IIIIIIIII)V")
	public static void method1166(@OriginalArg(0) Class68[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class68 local6 = arg0[local1];
			if (local6 != null && local6.anInt2225 == arg1) {
				@Pc(17) int local17 = local6.anInt2217 + arg6;
				@Pc(22) int local22 = local6.anInt2212 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2182 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2178;
					@Pc(45) int local45 = local22 + local6.lb;
					if (local6.anInt2182 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2182 == 0 || local6.aBoolean180 || method1160(local6).anInt4282 != 0 || local6 == Static71.aClass68_1 || local6.anInt2211 == Static219.anInt4286) {
					if (!method1156(local6)) {
						if (local6 == Static435.aClass68_14) {
							Static357.aBoolean447 = true;
							Static89.anInt1907 = local17;
							Static188.anInt3769 = local22;
						}
						if (local6.aBoolean169 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean181 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class3_Sub20 local148 = (Class3_Sub20) Static392.aClass229_44.method5328(); local148 != null; local148 = (Class3_Sub20) Static392.aClass229_44.method5325()) {
									if (local148.aBoolean208) {
										local148.method5987();
										local148.aClass68_4.aBoolean166 = false;
									}
								}
								if (Static51.anInt1242 == 0) {
									Static435.aClass68_14 = null;
									Static71.aClass68_1 = null;
								}
								Static167.anInt6467 = 0;
								Static442.aBoolean518 = false;
								Static187.aBoolean291 = false;
								if (!Static378.aBoolean462) {
									Static45.method996();
								}
							}
							@Pc(204) boolean local204;
							if (Static155.aClass74_1.method1870() >= local28 && Static155.aClass74_1.method1865() >= local30 && Static155.aClass74_1.method1870() < local32 && Static155.aClass74_1.method1865() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static59.aBoolean111 && local204) {
								if (local6.anInt2163 >= 0) {
									Static332.anInt6029 = local6.anInt2163;
								} else if (local6.aBoolean181) {
									Static332.anInt6029 = -1;
								}
							}
							if (!Static378.aBoolean462 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static138.method2516(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(248) boolean local248 = false;
							if (Static155.aClass74_1.method1871() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class3_Sub1 local263 = (Class3_Sub1) Static274.aClass229_31.method5328();
							if (local263 != null && local263.method4772() == 0 && local263.method4777() >= local28 && local263.method4775() >= local30 && local263.method4777() < local32 && local263.method4775() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray29 != null) {
								for (local296 = 0; local296 < local6.aByteArray29.length; local296++) {
									if (Static19.aClass16_1.method580(local6.aByteArray29[local296])) {
										if (local6.anIntArray195 == null || Static290.anInt5325 >= local6.anIntArray195[local296]) {
											@Pc(328) byte local328 = local6.aByteArray28[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static19.aClass16_1.method580(86) && !Static19.aClass16_1.method580(82) && !Static19.aClass16_1.method580(81)) && ((local328 & 0x2) == 0 || Static19.aClass16_1.method580(86)) && ((local328 & 0x1) == 0 || Static19.aClass16_1.method580(82)) && ((local328 & 0x4) == 0 || Static19.aClass16_1.method580(81))) {
												if (local296 < 10) {
													Static129.method2233("", local6.anInt2177, -1, local296 + 1);
												} else if (local296 == 10) {
													Static31.method766();
													@Pc(399) Class3_Sub26 local399 = method1160(local6);
													Static169.method2916(local399.method3487(), local399.anInt4280, local6);
													Static276.aString52 = Static267.method4013(local6);
													if (Static276.aString52 == null) {
														Static276.aString52 = "Null";
													}
													Static128.aString25 = local6.aString21 + "<col=ffffff>";
												}
												local430 = local6.anIntArray186[local296];
												if (local6.anIntArray195 == null) {
													local6.anIntArray195 = new int[local6.aByteArray29.length];
												}
												if (local430 == 0) {
													local6.anIntArray195[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray195[local296] = Static290.anInt5325 + local430;
												}
											}
										}
									} else if (local6.anIntArray195 != null) {
										local6.anIntArray195[local296] = 0;
									}
								}
							}
							if (local258) {
								Static384.method5258(local6, local263.method4777() - local17, local263.method4775() - local22);
							}
							if (Static435.aClass68_14 != null && Static435.aClass68_14 != local6 && local204 && method1160(local6).method3486()) {
								Static364.aClass68_12 = local6;
							}
							if (local6 == Static71.aClass68_1) {
								Static439.aBoolean517 = true;
								Static273.anInt5050 = local17;
								Static13.anInt424 = local22;
							}
							if (local6.aBoolean180 || local6.anInt2211 != 0) {
								@Pc(515) Class3_Sub20 local515;
								if (local204 && Static226.anInt4383 != 0 && local6.anObjectArray19 != null) {
									local515 = new Class3_Sub20();
									local515.aBoolean208 = true;
									local515.aClass68_4 = local6;
									local515.anInt2713 = Static226.anInt4383;
									local515.anObjectArray35 = local6.anObjectArray19;
									Static392.aClass229_44.method5321(local515);
								}
								if (Static435.aClass68_14 != null || Static378.aBoolean462 || local6.anInt2211 != Static400.anInt6965 && Static167.anInt6467 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt2211 != 0) {
									if (local6.anInt2211 == Static27.anInt769 || local6.anInt2211 == Static259.anInt4913) {
										Static294.aClass68_10 = local6;
										if (Static5.aClass29_1 != null) {
											Static5.aClass29_1.method925(local6.lb, Static266.aClass75_7);
										}
										if (local6.anInt2211 == Static27.anInt769) {
											if (!Static378.aBoolean462 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static50.method1060(arg9, arg8, Static266.aClass75_7);
												for (@Pc(598) Class13_Sub5 local598 = (Class13_Sub5) Static92.aClass40_2.method1188(); local598 != null; local598 = (Class13_Sub5) Static92.aClass40_2.method1195()) {
													if (arg8 >= local598.anInt5704 && arg8 < local598.anInt5709 && arg9 >= local598.anInt5705 && arg9 < local598.anInt5706) {
														Static45.method996();
														Static50.method1061(local598.aClass1_Sub3_Sub3_1);
													}
												}
											}
											Static144.method2565(local6, local17, local22);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt2211 == Static219.anInt4286) {
										if (local6.method1726(Static266.aClass75_7) == null || Static103.anInt2292 != 0 && Static103.anInt2292 != 3 || Static378.aBoolean462 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray191[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray194[local670]) {
											continue;
										}
										local296 -= local6.anInt2178 / 2;
										local670 -= local6.lb / 2;
										if (Static107.anInt2382 == 4) {
											local709 = (int) Static235.aFloat60 & 0x3FFF;
										} else {
											local709 = (int) Static235.aFloat60 + Static397.anInt6876 & 0x3FFF;
										}
										@Pc(721) int local721 = Applet_Sub1.anIntArray85[local709];
										@Pc(725) int local725 = Applet_Sub1.anIntArray87[local709];
										if (Static107.anInt2382 != 4) {
											local721 = local721 * (Static317.anInt5759 + 256) >> 8;
											local725 = local725 * (Static317.anInt5759 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static107.anInt2382 == 4) {
											local775 = (Static222.anInt4311 >> 7) + (local754 >> 2);
											local783 = (Static358.anInt5918 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static113.aClass1_Sub3_Sub3_Sub1_4.method4831() - 1) * 64;
											local775 = (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 - local792 >> 7) + (local754 >> 2);
											local783 = (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 - local792 >> 7) - (local764 >> 2);
										}
										if (Static59.aBoolean111 && (Static421.anInt4507 & 0x40) != 0) {
											@Pc(825) Class68 local825 = Static347.method4975(Static295.anInt5382, Static207.anInt4138);
											if (local825 == null) {
												Static31.method766();
											} else {
												Static112.method4934(local783, 20, 1L, local6.anInt2192, local775, false, " ->", true, Static276.aString52, Static108.anInt3456);
											}
											continue;
										}
										if (Static114.aClass89_2 == Static69.aClass89_1) {
											Static112.method4934(local783, 12, 1L, -1, local775, false, "", true, Static180.aClass175_119.method4201(Static216.anInt4257), -1);
										}
										Static112.method4934(local783, 21, 1L, -1, local775, false, "", true, Static149.aString31, Static30.anInt826);
										continue;
									}
									if (local6.anInt2211 == Static400.anInt6965) {
										Static118.aClass68_3 = local6;
										if (local204) {
											Static442.aBoolean518 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method4777() - local17 - local6.anInt2178 / 2) * 2.0D / (double) Static210.aFloat97);
											local670 = (int) -((double) (local263.method4775() - local22 - local6.lb / 2) * 2.0D / (double) Static210.aFloat97);
											local430 = Static189.anInt3807 + local296 + Static210.anInt7505;
											local709 = Static372.anInt1537 + local670 + Static210.anInt7496;
											@Pc(939) Class3_Sub3_Sub5 local939 = Static325.method4726();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method1024(local709, local944, local430);
											if (local944 != null) {
												if (Static19.aClass16_1.method580(82) && Static199.anInt3933 > 0) {
													Static128.method2229(local944[0], local944[2], local944[1]);
													continue;
												}
												Static187.aBoolean291 = true;
												Static351.anInt6324 = local944[0];
												Static40.anInt7640 = local944[1];
												Static94.anInt2029 = local944[2];
											}
											Static167.anInt6467 = 1;
											Static375.aBoolean456 = false;
											Static273.anInt5049 = Static155.aClass74_1.method1870();
											Static418.anInt7210 = Static155.aClass74_1.method1865();
											continue;
										}
										if (local248 && Static167.anInt6467 > 0) {
											if (Static167.anInt6467 == 1 && (Static273.anInt5049 != Static155.aClass74_1.method1870() || Static418.anInt7210 != Static155.aClass74_1.method1865())) {
												Static262.anInt4967 = Static189.anInt3807;
												Static234.anInt4521 = Static372.anInt1537;
												Static167.anInt6467 = 2;
											}
											if (Static167.anInt6467 == 2) {
												Static375.aBoolean456 = true;
												Static378.method5235(Static262.anInt4967 + (int) ((double) (Static273.anInt5049 - Static155.aClass74_1.method1870()) * 2.0D / (double) Static210.aFloat98));
												Static219.method3494(Static234.anInt4521 - (int) ((double) (Static418.anInt7210 - Static155.aClass74_1.method1865()) * 2.0D / (double) Static210.aFloat98));
											}
											continue;
										}
										if (Static167.anInt6467 > 0 && !Static375.aBoolean456) {
											if ((Static62.anInt1469 == 1 || Static336.method4873()) && Static169.anInt3551 > 2) {
												Static36.method847(Static273.anInt5049, Static418.anInt7210);
											} else if (Static402.method5435()) {
												Static36.method847(Static273.anInt5049, Static418.anInt7210);
											}
										}
										Static167.anInt6467 = 0;
										continue;
									}
									if (local6.anInt2211 == Static312.anInt5694) {
										if (local248) {
											Static359.method5095(Static155.aClass74_1.method1865() - local22, Static155.aClass74_1.method1870() - local17, local6.anInt2178, local6.lb);
										}
										continue;
									}
									if (local6.anInt2211 == Static114.anInt2537) {
										Static394.method5316(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean179 && local258) {
									local6.aBoolean179 = true;
									if (local6.anObjectArray5 != null) {
										local515 = new Class3_Sub20();
										local515.aBoolean208 = true;
										local515.aClass68_4 = local6;
										local515.anInt2706 = local263.method4777() - local17;
										local515.anInt2713 = local263.method4775() - local22;
										local515.anObjectArray35 = local6.anObjectArray5;
										Static392.aClass229_44.method5321(local515);
									}
								}
								if (local6.aBoolean179 && local248 && local6.anObjectArray34 != null) {
									local515 = new Class3_Sub20();
									local515.aBoolean208 = true;
									local515.aClass68_4 = local6;
									local515.anInt2706 = Static155.aClass74_1.method1870() - local17;
									local515.anInt2713 = Static155.aClass74_1.method1865() - local22;
									local515.anObjectArray35 = local6.anObjectArray34;
									Static392.aClass229_44.method5321(local515);
								}
								if (local6.aBoolean179 && !local248) {
									local6.aBoolean179 = false;
									if (local6.anObjectArray31 != null) {
										local515 = new Class3_Sub20();
										local515.aBoolean208 = true;
										local515.aClass68_4 = local6;
										local515.anInt2706 = Static155.aClass74_1.method1870() - local17;
										local515.anInt2713 = Static155.aClass74_1.method1865() - local22;
										local515.anObjectArray35 = local6.anObjectArray31;
										Class45.lb.method5321(local515);
									}
								}
								if (local248 && local6.anObjectArray6 != null) {
									local515 = new Class3_Sub20();
									local515.aBoolean208 = true;
									local515.aClass68_4 = local6;
									local515.anInt2706 = Static155.aClass74_1.method1870() - local17;
									local515.anInt2713 = Static155.aClass74_1.method1865() - local22;
									local515.anObjectArray35 = local6.anObjectArray6;
									Static392.aClass229_44.method5321(local515);
								}
								if (!local6.aBoolean166 && local204) {
									local6.aBoolean166 = true;
									if (local6.anObjectArray14 != null) {
										local515 = new Class3_Sub20();
										local515.aBoolean208 = true;
										local515.aClass68_4 = local6;
										local515.anInt2706 = Static155.aClass74_1.method1870() - local17;
										local515.anInt2713 = Static155.aClass74_1.method1865() - local22;
										local515.anObjectArray35 = local6.anObjectArray14;
										Static392.aClass229_44.method5321(local515);
									}
								}
								if (local6.aBoolean166 && local204 && local6.anObjectArray21 != null) {
									local515 = new Class3_Sub20();
									local515.aBoolean208 = true;
									local515.aClass68_4 = local6;
									local515.anInt2706 = Static155.aClass74_1.method1870() - local17;
									local515.anInt2713 = Static155.aClass74_1.method1865() - local22;
									local515.anObjectArray35 = local6.anObjectArray21;
									Static392.aClass229_44.method5321(local515);
								}
								if (local6.aBoolean166 && !local204) {
									local6.aBoolean166 = false;
									if (local6.anObjectArray10 != null) {
										local515 = new Class3_Sub20();
										local515.aBoolean208 = true;
										local515.aClass68_4 = local6;
										local515.anInt2706 = Static155.aClass74_1.method1870() - local17;
										local515.anInt2713 = Static155.aClass74_1.method1865() - local22;
										local515.anObjectArray35 = local6.anObjectArray10;
										Class45.lb.method5321(local515);
									}
								}
								if (local6.anObjectArray9 != null) {
									local515 = new Class3_Sub20();
									local515.aClass68_4 = local6;
									local515.anObjectArray35 = local6.anObjectArray9;
									Static58.aClass229_8.method5321(local515);
								}
								@Pc(1483) Class3_Sub20 local1483;
								if (local6.anObjectArray17 != null && Static406.anInt7057 > local6.anInt2162) {
									if (local6.anIntArray189 == null || Static406.anInt7057 - local6.anInt2162 > 32) {
										local515 = new Class3_Sub20();
										local515.aClass68_4 = local6;
										local515.anObjectArray35 = local6.anObjectArray17;
										Static392.aClass229_44.method5321(local515);
									} else {
										label678: for (local296 = local6.anInt2162; local296 < Static406.anInt7057; local296++) {
											local670 = Static292.anIntArray409[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray189.length; local430++) {
												if (local6.anIntArray189[local430] == local670) {
													local1483 = new Class3_Sub20();
													local1483.aClass68_4 = local6;
													local1483.anObjectArray35 = local6.anObjectArray17;
													Static392.aClass229_44.method5321(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt2162 = Static406.anInt7057;
								}
								if (local6.anObjectArray4 != null && Static244.anInt4637 > local6.anInt2148) {
									if (local6.anIntArray190 == null || Static244.anInt4637 - local6.anInt2148 > 32) {
										local515 = new Class3_Sub20();
										local515.aClass68_4 = local6;
										local515.anObjectArray35 = local6.anObjectArray4;
										Static392.aClass229_44.method5321(local515);
									} else {
										label654: for (local296 = local6.anInt2148; local296 < Static244.anInt4637; local296++) {
											local670 = Static401.anIntArray495[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray190.length; local430++) {
												if (local6.anIntArray190[local430] == local670) {
													local1483 = new Class3_Sub20();
													local1483.aClass68_4 = local6;
													local1483.anObjectArray35 = local6.anObjectArray4;
													Static392.aClass229_44.method5321(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt2148 = Static244.anInt4637;
								}
								if (local6.anObjectArray7 != null && Static118.anInt2603 > local6.anInt2172) {
									if (local6.anIntArray188 == null || Static118.anInt2603 - local6.anInt2172 > 32) {
										local515 = new Class3_Sub20();
										local515.aClass68_4 = local6;
										local515.anObjectArray35 = local6.anObjectArray7;
										Static392.aClass229_44.method5321(local515);
									} else {
										label630: for (local296 = local6.anInt2172; local296 < Static118.anInt2603; local296++) {
											local670 = Static402.anIntArray496[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray188.length; local430++) {
												if (local6.anIntArray188[local430] == local670) {
													local1483 = new Class3_Sub20();
													local1483.aClass68_4 = local6;
													local1483.anObjectArray35 = local6.anObjectArray7;
													Static392.aClass229_44.method5321(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt2172 = Static118.anInt2603;
								}
								if (local6.anObjectArray32 != null && Static374.anInt6599 > local6.anInt2156) {
									if (local6.anIntArray187 == null || Static374.anInt6599 - local6.anInt2156 > 32) {
										local515 = new Class3_Sub20();
										local515.aClass68_4 = local6;
										local515.anObjectArray35 = local6.anObjectArray32;
										Static392.aClass229_44.method5321(local515);
									} else {
										label606: for (local296 = local6.anInt2156; local296 < Static374.anInt6599; local296++) {
											local670 = Static427.anIntArray514[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray187.length; local430++) {
												if (local6.anIntArray187[local430] == local670) {
													local1483 = new Class3_Sub20();
													local1483.aClass68_4 = local6;
													local1483.anObjectArray35 = local6.anObjectArray32;
													Static392.aClass229_44.method5321(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt2156 = Static374.anInt6599;
								}
								if (local6.anObjectArray26 != null && Static436.anInt7406 > local6.anInt2161) {
									if (local6.anIntArray193 == null || Static436.anInt7406 - local6.anInt2161 > 32) {
										local515 = new Class3_Sub20();
										local515.aClass68_4 = local6;
										local515.anObjectArray35 = local6.anObjectArray26;
										Static392.aClass229_44.method5321(local515);
									} else {
										label582: for (local296 = local6.anInt2161; local296 < Static436.anInt7406; local296++) {
											local670 = Static94.anIntArray174[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray193.length; local430++) {
												if (local6.anIntArray193[local430] == local670) {
													local1483 = new Class3_Sub20();
													local1483.aClass68_4 = local6;
													local1483.anObjectArray35 = local6.anObjectArray26;
													Static392.aClass229_44.method5321(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt2161 = Static436.anInt7406;
								}
								if (Static15.anInt486 > local6.anInt2140 && local6.anObjectArray12 != null) {
									local515 = new Class3_Sub20();
									local515.aClass68_4 = local6;
									local515.anObjectArray35 = local6.anObjectArray12;
									Static392.aClass229_44.method5321(local515);
								}
								if (Static255.anInt4768 > local6.anInt2140 && local6.anObjectArray11 != null) {
									local515 = new Class3_Sub20();
									local515.aClass68_4 = local6;
									local515.anObjectArray35 = local6.anObjectArray11;
									Static392.aClass229_44.method5321(local515);
								}
								if (Static101.anInt2261 > local6.anInt2140 && local6.anObjectArray27 != null) {
									local515 = new Class3_Sub20();
									local515.aClass68_4 = local6;
									local515.anObjectArray35 = local6.anObjectArray27;
									Static392.aClass229_44.method5321(local515);
								}
								if (Static363.anInt6517 > local6.anInt2140 && local6.anObjectArray22 != null) {
									local515 = new Class3_Sub20();
									local515.aClass68_4 = local6;
									local515.anObjectArray35 = local6.anObjectArray22;
									Static392.aClass229_44.method5321(local515);
								}
								if (Static1.anInt48 > local6.anInt2140 && local6.anObjectArray33 != null) {
									local515 = new Class3_Sub20();
									local515.aClass68_4 = local6;
									local515.anObjectArray35 = local6.anObjectArray33;
									Static392.aClass229_44.method5321(local515);
								}
								local6.anInt2140 = Static296.anInt5417;
								if (local6.anObjectArray18 != null) {
									for (local296 = 0; local296 < Static269.anInt5026; local296++) {
										@Pc(1951) Class3_Sub20 local1951 = new Class3_Sub20();
										local1951.aClass68_4 = local6;
										local1951.anInt2703 = Static389.aClass19Array1[local296].method735();
										local1951.anInt2707 = Static389.aClass19Array1[local296].method732();
										local1951.anObjectArray35 = local6.anObjectArray18;
										Static392.aClass229_44.method5321(local1951);
									}
								}
								if (Static453.aBoolean526 && local6.anObjectArray15 != null) {
									local515 = new Class3_Sub20();
									local515.aClass68_4 = local6;
									local515.anObjectArray35 = local6.anObjectArray15;
									Static392.aClass229_44.method5321(local515);
								}
							}
							if (local6.anInt2182 == 5 && local6.anInt2154 != -1) {
								local6.method1734(Static290.aClass2_1, Static430.aClass211_1).method925(local6.lb, Static266.aClass75_7);
							}
							Static124.method2210(local6);
							if (local6.anInt2182 == 0) {
								method1166(arg0, local6.anInt2177, local28, local30, local32, local34, local17 - local6.anInt2147, local22 - local6.anInt2151, arg8, arg9);
								if (local6.aClass68Array2 != null) {
									method1166(local6.aClass68Array2, local6.anInt2177, local28, local30, local32, local34, local17 - local6.anInt2147, local22 - local6.anInt2151, arg8, arg9);
								}
								@Pc(2073) Class3_Sub40 local2073 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local6.anInt2177);
								if (local2073 != null) {
									if (Static114.aClass89_2 == Static436.aClass89_3 && local2073.anInt6670 == 0 && !Static378.aBoolean462 && local204 && !Static176.aBoolean278) {
										Static45.method996();
									}
									Static85.method5967(local22, local28, local30, arg8, local2073.anInt6668, arg9, local32, local34, local17);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static124.method2210(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1167(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static207.anInt4136;
		@Pc(3) int[] local3 = Static322.anIntArray436;
		@Pc(11) int local11 = Static180.aBoolean288 ? local1 : local1 + Static453.anInt7682;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub3_Sub3 local23;
			if (local13 < local1) {
				local23 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = Static451.aClass1_Sub3_Sub3_Sub2Array1[Static29.anIntArray56[local13 - local1]];
			}
			if (local23.aByte77 == arg0) {
				local23.anInt6076 = 0;
				if (local23.anInt6115 < 0) {
					local23.aBoolean427 = false;
				} else {
					@Pc(50) int local50 = local23.method4831();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6053 & 0x7F) != 0 || (local23.anInt6055 & 0x7F) != 0) {
							local23.aBoolean427 = false;
							continue;
						}
					} else if ((local23.anInt6053 & 0x7F) != 64 || (local23.anInt6055 & 0x7F) != 64) {
						local23.aBoolean427 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6053 >> 7;
						local97 = local23.anInt6055 >> 7;
						if (local23.anInt6115 != Static417.anIntArrayArray56[local92][local97]) {
							local23.aBoolean427 = true;
							continue;
						}
						if (Static321.anIntArrayArray46[local92][local97] > 1) {
							local122 = Static321.anIntArrayArray46[local92][local97]--;
							local23.aBoolean427 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6053 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6055 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6053 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6055 + local92 >> 7;
						if (!Static153.method2710(local23.anInt6115, local165, local158, local97, local151)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt6115 == Static417.anIntArrayArray56[local176][local179]) {
										local122 = Static321.anIntArrayArray46[local176][local179]--;
									}
								}
							}
							local23.aBoolean427 = true;
							continue;
						}
					}
					if (local23 instanceof Class1_Sub3_Sub3_Sub1 && local23.aClass3_Sub11_3 != null && Static290.anInt5325 >= local23.aClass3_Sub11_3.anInt1467 && Static290.anInt5325 < local23.aClass3_Sub11_3.anInt1451) {
						((Class1_Sub3_Sub3_Sub1) local23).aBoolean366 = false;
					}
					local23.aBoolean427 = false;
					local23.anInt6045 = Static124.method2209(local23.aByte77, local23.anInt6053, local23.anInt6055);
					Static199.method3242(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1170() {
		for (@Pc(1) int local1 = 0; local1 < Static399.anInt6923; local1++) {
			@Pc(6) int[] local6 = Static417.anIntArrayArray56[local1];
			for (@Pc(8) int local8 = 0; local8 < Static127.anInt2696; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
