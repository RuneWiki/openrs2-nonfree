import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!le;")
	public static Class3_Sub3_Sub2 aClass3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "Lclient!gd;")
	public static Class31 aClass31_3;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!ad;")
	public static Class4 aClass4_670 = Static75.method1216("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_671 = Static75.method1216("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "Lclient!ad;")
	private static Class4 aClass4_674 = Static75.method1216("button near the top of that page)3");

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_672 = aClass4_674;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!dd;")
	public static Class20 aClass20_5 = new Class20();

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "[I")
	public static int[] anIntArray176 = new int[500];

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!ad;")
	public static Class4 aClass4_673 = Static75.method1216("mod_icons");

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "Lclient!ad;")
	public static Class4 aClass4_675 = Static75.method1216(" )2> @lre@");

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "Lclient!bb;")
	public static Class8 aClass8_17 = new Class8(100);

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "Lclient!ad;")
	private static Class4 aClass4_677 = Static75.method1216("Take");

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "Lclient!ad;")
	public static Class4 aClass4_676 = aClass4_677;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII[Lclient!rc;IIIII)Z")
	public static boolean method878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub1_Sub14[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static50.method1851(arg5, arg1, arg9, arg6);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < arg4.length; local14++) {
			@Pc(20) Class3_Sub1_Sub14 local20 = arg4[local14];
			if (local20 != null && local20.anInt2097 == arg0) {
				if (local20.anInt2087 > 0) {
					Static78.method267(local20);
				}
				@Pc(40) int local40 = local20.anInt2132 + arg5;
				@Pc(45) int local45 = arg1 + local20.anInt2077;
				if (!local20.aBoolean174) {
					local45 -= arg7;
				}
				if (!local20.aBoolean174) {
					local40 -= arg2;
				}
				@Pc(62) int local62 = local20.anInt2104;
				@Pc(94) int local94;
				@Pc(140) int local140;
				if (Static77.aClass3_Sub1_Sub14_1 == local20) {
					local62 = 128;
					@Pc(71) Class3_Sub1_Sub14 local71 = Static15.method226(local20);
					@Pc(75) int[] local75 = Static4.method115(local71);
					@Pc(79) int[] local79 = Static4.method115(local20);
					local94 = Static22.anInt496 + local79[0] - Static86.anInt2001 - local75[0];
					if (local94 < 0) {
						local94 = 0;
					}
					if (local94 + local20.anInt2130 > local71.anInt2130) {
						local94 = local71.anInt2130 - local20.anInt2130;
					}
					local40 = local94 + local75[0];
					local140 = local79[1] + Static78.anInt420 - local75[1] - Static23.anInt516;
					if (local140 < 0) {
						local140 = 0;
					}
					if (local20.anInt2117 + local140 > local71.anInt2117) {
						local140 = local71.anInt2117 - local20.anInt2117;
					}
					local45 = local140 + local75[1];
				}
				if (local20.anInt2128 == 0) {
					if (local20.aBoolean163 && !Static4.method114(arg8, local14)) {
						continue;
					}
					if (!local20.aBoolean172) {
						if (local20.anInt2082 > local20.anInt2078 - local20.anInt2117) {
							local20.anInt2082 = local20.anInt2078 - local20.anInt2117;
						}
						if (local20.anInt2082 < 0) {
							local20.anInt2082 = 0;
						}
					}
					local12 &= method878(local14, local45, local20.anInt2113, arg3, arg4, local40, local45 + local20.anInt2117, local20.anInt2082, arg8, local40 + local20.anInt2130);
					if (local20.aClass3_Sub1_Sub14Array1 != null) {
						local12 &= method878(local20.anInt2092, local45, local20.anInt2113, arg3, local20.aClass3_Sub1_Sub14Array1, local40, local45 + local20.anInt2117, local20.anInt2082, arg8, local20.anInt2130 + local40);
					}
					Static50.method1851(arg5, arg1, arg9, arg6);
					if (local20.anInt2078 > local20.anInt2117) {
						Static96.method1163(local20.anInt2117, local40 + local20.anInt2130, local20.anInt2078, local45, local20.anInt2082);
					}
				}
				if (local20.anInt2128 != 1) {
					@Pc(362) int local362;
					@Pc(360) int local360;
					@Pc(393) int local393;
					@Pc(300) int local300;
					@Pc(302) int local302;
					@Pc(306) int local306;
					@Pc(353) int local353;
					if (local20.anInt2128 == 2) {
						local300 = 0;
						for (local302 = 0; local302 < local20.anInt2117; local302++) {
							for (local306 = 0; local306 < local20.anInt2130; local306++) {
								local94 = local306 * (local20.anInt2098 + 32) + local40;
								local140 = local302 * (local20.anInt2085 + 32) + local45;
								if (local300 < 20) {
									local140 += local20.anIntArray271[local300];
									local94 += local20.anIntArray269[local300];
								}
								if (local20.anIntArray274[local300] > 0) {
									local353 = 0;
									local360 = local20.anIntArray274[local300] - 1;
									local362 = 0;
									if (Static50.anInt2727 - 32 < local94 && Static50.anInt2729 > local94 && local140 > Static50.anInt2725 - 32 && local140 < Static50.anInt2728 || Static12.anInt343 != 0 && local300 == Static53.anInt2474) {
										local393 = 0;
										if (Static98.anInt2368 == 1 && local300 == Static22.anInt498 && local14 + (arg3 << 16) == Static78.anInt434) {
											local393 = 16777215;
										}
										@Pc(427) Class3_Sub1_Sub4_Sub2 local427 = Static112.method1924(local360, local393, local20.anIntArray272[local300]);
										if (local427 == null) {
											local12 = false;
										} else {
											if (Static12.anInt343 != 0 && local300 == Static53.anInt2474 && Static76.anInt1818 == local14 + (arg3 << 16)) {
												local353 = Static22.anInt496 - Static7.anInt278;
												if (local353 < 5 && local353 > -5) {
													local353 = 0;
												}
												local362 = Static78.anInt420 - Static78.anInt441;
												if (local362 < 5 && local362 > -5) {
													local362 = 0;
												}
												if (Static39.anInt1065 < 5) {
													local353 = 0;
													local362 = 0;
												}
												local427.method1737(local353 + local94, local140 + local362);
												if (arg0 != -1) {
													@Pc(530) Class3_Sub1_Sub14 local530 = arg4[arg0];
													@Pc(552) int local552;
													if (Static50.anInt2725 > local362 + local140 && local530.anInt2082 > 0) {
														local552 = Static85.anInt1995 * (Static50.anInt2725 - local140 - local362) / 3;
														if (Static85.anInt1995 * 10 < local552) {
															local552 = Static85.anInt1995 * 10;
														}
														if (local552 > local530.anInt2082) {
															local552 = local530.anInt2082;
														}
														local530.anInt2082 -= local552;
														Static78.anInt441 += local552;
													}
													if (local362 + local140 + 32 > Static50.anInt2728 && local530.anInt2078 - local530.anInt2117 > local530.anInt2082) {
														local552 = Static85.anInt1995 * (local140 + local362 + 32 - Static50.anInt2728) / 3;
														if (local552 > Static85.anInt1995 * 10) {
															local552 = Static85.anInt1995 * 10;
														}
														if (local552 > local530.anInt2078 - local530.anInt2117 - local530.anInt2082) {
															local552 = local530.anInt2078 - local530.anInt2117 - local530.anInt2082;
														}
														local530.anInt2082 += local552;
														Static78.anInt441 -= local552;
													}
												}
											} else if (Static22.anInt500 != 0 && Static106.anInt2669 == local300 && Static11.anInt2846 == (arg3 << 16) + local14) {
												local427.method1737(local94, local140);
											} else {
												local427.method1733(local94, local140);
											}
											if (local427.anInt2574 == 33 || local20.anIntArray272[local300] != 1) {
												@Pc(684) int local684 = local20.anIntArray272[local300];
												Static45.aClass3_Sub1_Sub4_Sub4_1.method1866(Static71.method1153(local684), local94 + local353 + 1, local140 + 10 + local362, 0);
												Static45.aClass3_Sub1_Sub4_Sub4_1.method1866(Static71.method1153(local684), local94 + local353, local362 + 9 + local140, 16776960);
											}
										}
									}
								} else if (local20.anIntArray273 != null && local300 < 20) {
									@Pc(734) Class3_Sub1_Sub4_Sub2 local734 = local20.method1425(local300);
									if (local734 != null) {
										local734.method1733(local94, local140);
									} else if (Static89.aBoolean158) {
										local12 = false;
									}
								}
								local300++;
							}
						}
					} else if (local20.anInt2128 == 3) {
						if (Static5.method154(local20)) {
							local300 = local20.anInt2089;
							if (Static4.method114(arg8, local14) && local20.anInt2076 != 0) {
								local300 = local20.anInt2076;
							}
						} else {
							local300 = local20.anInt2131;
							if (Static4.method114(arg8, local14) && local20.anInt2114 != 0) {
								local300 = local20.anInt2114;
							}
						}
						if (local62 == 0) {
							if (local20.aBoolean173) {
								Static50.method1840(local40, local45, local20.anInt2130, local20.anInt2117, local300);
							} else {
								Static50.method1849(local40, local45, local20.anInt2130, local20.anInt2117, local300);
							}
						} else if (local20.aBoolean173) {
							Static50.method1845(local40, local45, local20.anInt2130, local20.anInt2117, local300, 256 - (local62 & 0xFF));
						} else {
							Static50.method1850(local40, local45, local20.anInt2130, local20.anInt2117, local300, 256 - (local62 & 0xFF));
						}
					} else {
						@Pc(873) Class3_Sub1_Sub4_Sub4 local873;
						if (local20.anInt2128 == 4) {
							local873 = local20.method1422();
							if (local873 != null) {
								@Pc(884) Class4 local884 = local20.aClass4_1186;
								if (Static5.method154(local20)) {
									local302 = local20.anInt2089;
									if (Static4.method114(arg8, local14) && local20.anInt2076 != 0) {
										local302 = local20.anInt2076;
									}
									if (local20.aClass4_1183.method118() > 0) {
										local884 = local20.aClass4_1183;
									}
								} else {
									local302 = local20.anInt2131;
									if (Static4.method114(arg8, local14) && local20.anInt2114 != 0) {
										local302 = local20.anInt2114;
									}
								}
								if (local20.anInt2112 == 6 && Static69.anInt2250 == (arg3 << 16) + local14) {
									local884 = Static69.aClass4_1268;
									local302 = local20.anInt2131;
								}
								if (Static50.anInt2730 == 479) {
									if (local302 == 16776960) {
										local302 = 255;
									}
									if (local302 == 49152) {
										local302 = 16777215;
									}
								}
								local884 = Static15.method222(local20, local884);
								local873.method1857(local884, local40, local45, local20.anInt2130, local20.anInt2117, local302, local20.aBoolean171, local20.anInt2094, local20.anInt2109, local20.anInt2101);
							} else if (Static89.aBoolean158) {
								local12 = false;
							}
						} else if (local20.anInt2128 == 5) {
							@Pc(1008) Class3_Sub1_Sub4_Sub2 local1008 = local20.method1427(Static5.method154(local20));
							if (local1008 != null) {
								local1008.method1733(local40, local45);
							} else if (Static89.aBoolean158) {
								local12 = false;
							}
						} else if (local20.anInt2128 == 6) {
							Static99.method1594(local40 + local20.anInt2130 / 2, local20.anInt2117 / 2 + local45);
							local300 = local20.anInt2108 * Class3_Sub1_Sub4_Sub1.anIntArray295[local20.anInt2123] >> 16;
							local302 = Class3_Sub1_Sub4_Sub1.anIntArray298[local20.anInt2123] * local20.anInt2108 >> 16;
							@Pc(1064) boolean local1064 = Static5.method154(local20);
							if (local1064) {
								local94 = local20.anInt2086;
							} else {
								local94 = local20.anInt2126;
							}
							@Pc(1093) Class3_Sub1_Sub1_Sub4 local1093;
							if (local20.anInt2102 == 5) {
								if (local20.anInt2110 == 0) {
									local1093 = Static30.aClass41_1.method907(-1, null, null, -1);
								} else {
									local1093 = Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.method1920();
								}
							} else if (local94 == -1) {
								local1093 = local20.method1428(-1, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass41_2, local1064, null);
								if (local1093 == null && Static89.aBoolean158) {
									local12 = false;
								}
							} else {
								@Pc(1104) Class3_Sub1_Sub6 local1104 = Static67.method1107(local94);
								local1093 = local20.method1428(local20.anInt2088, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass41_2, local1064, local1104);
								if (local1093 == null && Static89.aBoolean158) {
									local12 = false;
								}
							}
							if (local1093 != null) {
								local1093.method783(local20.anInt2124, 0, local20.anInt2123, 0, local300, local302);
							}
							Static99.method1595();
						} else {
							if (local20.anInt2128 == 7) {
								local873 = local20.method1422();
								if (local873 == null) {
									if (Static89.aBoolean158) {
										local12 = false;
									}
									continue;
								}
								local302 = 0;
								for (local306 = 0; local306 < local20.anInt2117; local306++) {
									for (local94 = 0; local94 < local20.anInt2130; local94++) {
										if (local20.anIntArray274[local302] > 0) {
											@Pc(1200) Class3_Sub1_Sub2 local1200 = Static3.method1550(local20.anIntArray274[local302] - 1);
											@Pc(1203) Class4 local1203 = local1200.aClass4_347;
											if (local1203 == null) {
												local1203 = Static79.aClass4_1053;
											}
											if (local1200.anInt748 == 1 || local20.anIntArray272[local302] != 1) {
												local1203 = Static60.method1012(new Class4[] { local1203, Static15.aClass4_192, Static75.method1208(local20.anIntArray272[local302]) });
											}
											local362 = local40 + local94 * (local20.anInt2098 + 115);
											local360 = (local20.anInt2085 + 12) * local306 + local45;
											if (local20.anInt2094 == 0) {
												local873.method1868(local1203, local362, local360, local20.anInt2131, local20.aBoolean171);
											} else if (local20.anInt2094 == 1) {
												local873.method1852(local1203, local362 + local20.anInt2130 / 2, local360, local20.anInt2131, local20.aBoolean171);
											} else {
												local873.method1861(local1203, local20.anInt2130 + local362 - 1, local360, local20.anInt2131, local20.aBoolean171);
											}
										}
										local302++;
									}
								}
							}
							if (local20.anInt2128 == 8 && Static76.method1225(arg8, local14) && Static95.anInt2235 == Static82.anInt1919) {
								local300 = 0;
								local302 = 0;
								@Pc(1346) Class4 local1346 = local20.aClass4_1186;
								@Pc(1348) Class3_Sub1_Sub4_Sub4 local1348 = Static71.aClass3_Sub1_Sub4_Sub4_2;
								local1346 = Static15.method222(local20, local1346);
								@Pc(1372) Class4 local1372;
								while (local1346.method118() > 0) {
									local353 = local1346.method117(Static93.aClass4_1337);
									if (local353 == -1) {
										local1372 = local1346;
										local1346 = Static113.aClass4_1604;
									} else {
										local1372 = local1346.method136(0, local353);
										local1346 = local1346.method137(local353 + 2);
									}
									local362 = local1348.method1858(local1372);
									if (local362 > local300) {
										local300 = local362;
									}
									local302 += local1348.anInt2731 + 1;
								}
								local302 += 7;
								local300 += 6;
								local362 = local45 + local20.anInt2117 + 5;
								if (arg6 < local362 + local302) {
									local362 = arg6 - local302;
								}
								local353 = local40 + local20.anInt2130 - local300 - 5;
								if (local40 + 5 > local353) {
									local353 = local40 + 5;
								}
								if (local353 + local300 > arg9) {
									local353 = arg9 - local300;
								}
								Static50.method1840(local353, local362, local300, local302, 16777120);
								Static50.method1849(local353, local362, local300, local302, 0);
								local360 = local1348.anInt2731 + local362 + 2;
								local1346 = local20.aClass4_1186;
								local1346 = Static15.method222(local20, local1346);
								while (local1346.method118() > 0) {
									local393 = local1346.method117(Static93.aClass4_1337);
									if (local393 == -1) {
										local1372 = local1346;
										local1346 = Static113.aClass4_1604;
									} else {
										local1372 = local1346.method136(0, local393);
										local1346 = local1346.method137(local393 + 2);
									}
									local1348.method1868(local1372, local353 + 3, local360, 0, false);
									local360 += local1348.anInt2731 + 1;
								}
							}
						}
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public static void method884() {
		try {
			@Pc(6) Graphics local6 = Static9.aCanvas1.getGraphics();
			Static18.aClass25_24.method1161(4, local6, 4);
		} catch (@Pc(14) Exception local14) {
			Static9.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method887() {
		aClass31_3 = null;
		aClass4_676 = null;
		aClass4_673 = null;
		anIntArrayArray15 = null;
		anIntArray176 = null;
		aClass4_671 = null;
		aClass4_674 = null;
		aClass3_Sub3_Sub2_1 = null;
		aClass4_670 = null;
		aClass20_5 = null;
		aClass8_17 = null;
		aClass4_672 = null;
		aClass4_677 = null;
		aClass4_675 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([BI)[B")
	public static byte[] method888(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class3_Sub4 local12 = new Class3_Sub4(arg0);
		@Pc(16) int local16 = local12.method446();
		@Pc(24) int local24 = local12.method438();
		if (local24 < 0 || Static104.anInt2549 != 0 && local24 > Static104.anInt2549) {
			throw new RuntimeException();
		} else if (local16 == 0) {
			@Pc(99) byte[] local99 = new byte[local24];
			local12.method429(local24, local99);
			return local99;
		} else {
			@Pc(41) int local41 = local12.method438();
			if (local41 < 0 || Static104.anInt2549 != 0 && Static104.anInt2549 < local41) {
				throw new RuntimeException();
			}
			@Pc(59) byte[] local59 = new byte[local41];
			if (local16 == 1) {
				Static80.method1265(local59, local41, arg0, local24);
			} else {
				try {
					@Pc(86) DataInputStream local86 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, local24)));
					local86.readFully(local59);
					local86.close();
				} catch (@Pc(93) IOException local93) {
				}
			}
			return local59;
		}
	}
}
