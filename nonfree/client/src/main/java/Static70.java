import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_12 = new Class154(63, -1);

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_13 = new Class154(32, 7);

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!ps;")
	public static Class273 aClass273_2 = null;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!rg;BZ)V")
	public static void method1161(@OriginalArg(0) Class12_Sub2_Sub1_Sub4 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) Class61 local14 = arg0.method6767();
		if (arg0.anInt8431 == 0) {
			arg0.anInt8428 = 0;
			Static142.anInt5305 = 0;
			Static138.anInt2256 = -1;
			return;
		}
		if (arg0.anInt8394 != -1 && arg0.anInt8397 == 0) {
			@Pc(39) Class148 local39 = Static117.aClass18_1.method296(arg0.anInt8394);
			if (arg0.anInt8430 > 0 && local39.anInt3046 == 0) {
				arg0.anInt8428++;
				Static138.anInt2256 = -1;
				Static142.anInt5305 = 0;
				return;
			}
			if (arg0.anInt8430 <= 0 && local39.anInt3052 == 0) {
				arg0.anInt8428++;
				Static138.anInt2256 = -1;
				Static142.anInt5305 = 0;
				return;
			}
		}
		@Pc(110) Class148 local110;
		@Pc(96) Class82 local96;
		if (arg0.anInt8370 != -1 && arg0.anInt8404 <= Static532.anInt8757) {
			local96 = Static62.aClass49_1.method1021(arg0.anInt8370);
			if (local96.aBoolean116 && local96.anInt1827 != -1) {
				local110 = Static117.aClass18_1.method296(local96.anInt1827);
				if (arg0.anInt8430 > 0 && local110.anInt3046 == 0) {
					Static142.anInt5305 = 0;
					arg0.anInt8428++;
					Static138.anInt2256 = -1;
					return;
				}
				if (arg0.anInt8430 <= 0 && local110.anInt3052 == 0) {
					Static138.anInt2256 = -1;
					Static142.anInt5305 = 0;
					arg0.anInt8428++;
					return;
				}
			}
		}
		if (arg0.anInt8370 != -1 && Static532.anInt8757 >= arg0.anInt8404) {
			local96 = Static62.aClass49_1.method1021(arg0.anInt8370);
			if (local96.aBoolean116 && local96.anInt1827 != -1) {
				local110 = Static117.aClass18_1.method296(local96.anInt1827);
				if (arg0.anInt8430 > 0 && local110.anInt3046 == 0) {
					Static142.anInt5305 = 0;
					Static138.anInt2256 = -1;
					arg0.anInt8428++;
					return;
				}
				if (arg0.anInt8430 <= 0 && local110.anInt3052 == 0) {
					arg0.anInt8428++;
					Static142.anInt5305 = 0;
					Static138.anInt2256 = -1;
					return;
				}
			}
		}
		@Pc(227) int local227 = arg0.anInt9374;
		@Pc(230) int local230 = arg0.anInt9375;
		@Pc(246) int local246 = arg0.anIntArray566[arg0.anInt8431 - 1] * 512 + arg0.method6777() * 256;
		@Pc(263) int local263 = arg0.anIntArray565[arg0.anInt8431 - 1] * 512 + arg0.method6777() * 256;
		if (local227 >= local246) {
			if (local246 < local227) {
				if (local230 < local263) {
					arg0.method6763(6144);
				} else if (local263 >= local230) {
					arg0.method6763(4096);
				} else {
					arg0.method6763(2048);
				}
			} else if (local263 > local230) {
				arg0.method6763(8192);
			} else if (local230 > local263) {
				arg0.method6763(0);
			}
		} else if (local263 > local230) {
			arg0.method6763(10240);
		} else if (local263 < local230) {
			arg0.method6763(14336);
		} else {
			arg0.method6763(12288);
		}
		@Pc(365) byte local365 = arg0.aByteArray92[arg0.anInt8431 - 1];
		if (!arg1 && (local246 - local227 > 1024 || local246 - local227 < -1024 || local263 - local230 > 1024 || local263 - local230 < -1024)) {
			arg0.anInt9375 = local263;
			arg0.anInt9374 = local246;
			arg0.method6766(arg0.anInt8350, false);
			Static142.anInt5305 = 0;
			if (arg0.anInt8430 > 0) {
				arg0.anInt8430--;
			}
			arg0.anInt8431--;
			Static138.anInt2256 = -1;
			return;
		}
		@Pc(423) int local423 = 16;
		@Pc(425) boolean local425 = true;
		if (arg0 instanceof Class12_Sub2_Sub1_Sub4_Sub2) {
			local425 = ((Class12_Sub2_Sub1_Sub4_Sub2) arg0).aClass295_1.aBoolean611;
		}
		@Pc(461) int local461;
		if (local425) {
			local461 = arg0.anInt8350 - arg0.aClass352_7.anInt9275;
			if (local461 != 0 && arg0.anInt8424 == -1 && arg0.anInt8395 != 0) {
				local423 = 8;
			}
			if (!arg1 && arg0.anInt8431 > 2) {
				local423 = 24;
			}
			if (!arg1 && arg0.anInt8431 > 3) {
				local423 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt8431 > 1) {
				local423 = 24;
			}
			if (!arg1 && arg0.anInt8431 > 2) {
				local423 = 32;
			}
		}
		if (arg0.anInt8428 > 0 && arg0.anInt8431 > 1) {
			arg0.anInt8428--;
			local423 = 32;
		}
		if (local365 == 2) {
			local423 <<= 0x1;
		} else if (local365 == 0) {
			local423 >>= 0x1;
		}
		if (local14.anInt1294 != -1) {
			local423 <<= 0x9;
			if (arg0.anInt8431 == 1) {
				local461 = arg0.anInt8429 * arg0.anInt8429;
				@Pc(605) int local605 = (arg0.anInt9374 > local246 ? arg0.anInt9374 - local246 : -arg0.anInt9374 + local246) << 9;
				@Pc(627) int local627 = (local263 >= arg0.anInt9375 ? local263 - arg0.anInt9375 : -local263 + arg0.anInt9375) << 9;
				@Pc(638) int local638 = local627 < local605 ? local605 : local627;
				@Pc(645) int local645 = local14.anInt1294 * 2 * local638;
				if (local461 > local645) {
					arg0.anInt8429 /= 2;
				} else if (local638 < local461 / 2) {
					arg0.anInt8429 -= local14.anInt1294;
					if (arg0.anInt8429 < 0) {
						arg0.anInt8429 = 0;
					}
				} else if (arg0.anInt8429 < local423) {
					arg0.anInt8429 += local14.anInt1294;
					if (arg0.anInt8429 > local423) {
						arg0.anInt8429 = local423;
					}
				}
			} else if (arg0.anInt8429 < local423) {
				arg0.anInt8429 += local14.anInt1294;
				if (local423 < arg0.anInt8429) {
					arg0.anInt8429 = local423;
				}
			} else if (arg0.anInt8429 > 0) {
				arg0.anInt8429 -= local14.anInt1294;
				if (arg0.anInt8429 < 0) {
					arg0.anInt8429 = 0;
				}
			}
			local423 = arg0.anInt8429 >> 9;
			if (local423 < 1) {
				local423 = 1;
			}
		}
		Static142.anInt5305 = 0;
		if (local227 == local246 && local230 == local263) {
			Static138.anInt2256 = -1;
		} else {
			if (local227 < local246) {
				Static142.anInt5305 |= 0x4;
				arg0.anInt9374 += local423;
				if (local246 < arg0.anInt9374) {
					arg0.anInt9374 = local246;
				}
			} else if (local227 > local246) {
				Static142.anInt5305 |= 0x8;
				arg0.anInt9374 -= local423;
				if (arg0.anInt9374 < local246) {
					arg0.anInt9374 = local246;
				}
			}
			if (local423 < 32) {
				Static138.anInt2256 = local365;
			} else {
				Static138.anInt2256 = 2;
			}
			if (local230 < local263) {
				Static142.anInt5305 |= 0x1;
				arg0.anInt9375 += local423;
				if (local263 < arg0.anInt9375) {
					arg0.anInt9375 = local263;
				}
			} else if (local230 > local263) {
				arg0.anInt9375 -= local423;
				Static142.anInt5305 |= 0x2;
				if (local263 > arg0.anInt9375) {
					arg0.anInt9375 = local263;
				}
			}
		}
		if (arg0.anInt9374 != local246 || arg0.anInt9375 != local263) {
			return;
		}
		arg0.anInt8431--;
		if (arg0.anInt8430 > 0) {
			arg0.anInt8430--;
			return;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1162() {
		@Pc(1) int local1 = Static84.anInt9548;
		@Pc(3) int[] local3 = Static520.anIntArray555;
		@Pc(11) int local11 = Static481.aBoolean654 ? local1 : local1 + Static365.anInt6148;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class12_Sub2_Sub1_Sub4 local23;
			if (local13 < local1) {
				local23 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub5) Static436.aClass90_26.method1685((long) Static461.anIntArray562[local13 - local1])).aClass12_Sub2_Sub1_Sub4_Sub2_1;
			}
			if (local23.anInt8399 >= 0) {
				@Pc(43) int local43 = local23.method6777();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9374 & 0x1FF) == 0 && (local23.anInt9375 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt9374 & 0x1FF) == 256 && (local23.anInt9375 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt9373 = Static24.method347(local23.anInt9375, local23.anInt9374, local23.aByte128);
				Static526.method7745(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1163(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static84.anInt9548;
		@Pc(3) int[] local3 = Static520.anIntArray555;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static365.anInt6148; local5++) {
			@Pc(15) Class12_Sub2_Sub1_Sub4 local15;
			if (local5 < local1) {
				local15 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class2_Sub5) Static436.aClass90_26.method1685((long) Static461.anIntArray562[local5 - local1])).aClass12_Sub2_Sub1_Sub4_Sub2_1;
			}
			if (local15.aByte128 == arg0 && local15.anInt8399 >= 0) {
				@Pc(39) int local39 = local15.method6777();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9374 & 0x1FF) != 0 || (local15.anInt9375 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9374 & 0x1FF) != 256 || (local15.anInt9375 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9374 >> 9;
					local80 = local15.anInt9375 >> 9;
					if (local15.anInt8399 > Static471.anIntArrayArray50[local75][local80]) {
						Static471.anIntArrayArray50[local75][local80] = local15.anInt8399;
						Static29.anIntArrayArray4[local75][local80] = 1;
					} else if (local15.anInt8399 == Static471.anIntArrayArray50[local75][local80]) {
						local116 = Static29.anIntArrayArray4[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt9374 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt9375 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt9374 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt9375 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt8399 > Static471.anIntArrayArray50[local158][local161]) {
								Static471.anIntArrayArray50[local158][local161] = local15.anInt8399;
								Static29.anIntArrayArray4[local158][local161] = 1;
							} else if (local15.anInt8399 == Static471.anIntArrayArray50[local158][local161]) {
								local116 = Static29.anIntArrayArray4[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ps;)Lclient!iga;")
	public static Class2_Sub23 method1164(@OriginalArg(0) Class273 arg0) {
		@Pc(13) Class2_Sub23 local13 = (Class2_Sub23) Static323.aClass90_16.method1685(((long) arg0.anInt6810 << 32) + (long) arg0.anInt6800);
		return local13 == null ? arg0.aClass2_Sub23_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ps;IIIIIIIII)V")
	public static void method1165(@OriginalArg(0) Class273[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class273 local6 = arg0[local1];
			if (local6 != null && local6.anInt6820 == arg1) {
				@Pc(17) int local17 = local6.anInt6817 + arg6;
				@Pc(22) int local22 = local6.anInt6855 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt6868 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt6883;
					@Pc(45) int local45 = local22 + local6.anInt6814;
					if (local6.anInt6868 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6868 == 0 || local6.aBoolean545 || method1164(local6).anInt3330 != 0 || local6 == Static344.aClass273_8 || local6.anInt6825 == Static433.anInt6961 || local6.anInt6825 == Static81.anInt9019) {
					if (!method1167(local6)) {
						if (local6 == Class12_Sub2_Sub1_Sub3.lb && Static521.method6725(Class12_Sub2_Sub1_Sub3.lb) != null) {
							Static258.aBoolean319 = true;
							Static371.anInt6214 = local17;
							Static472.anInt7587 = local22;
						}
						if (local6.aBoolean544 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean548 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(156) Class2_Sub10 local156 = (Class2_Sub10) Static213.aClass70_15.method1264(); local156 != null; local156 = (Class2_Sub10) Static213.aClass70_15.method1261()) {
									if (local156.aBoolean101) {
										local156.method7657();
										local156.aClass273_4.aBoolean554 = false;
									}
								}
								if (Static275.anInt4755 == 0) {
									Class12_Sub2_Sub1_Sub3.lb = null;
									Static344.aClass273_8 = null;
								}
								Static294.anInt9620 = 0;
								Static79.aBoolean662 = false;
								Static213.aBoolean225 = false;
								if (!Static572.aBoolean774) {
									Static519.method1522();
								}
							}
							@Pc(212) boolean local212;
							if (Static205.aClass131_1.method6544() >= local28 && Static205.aClass131_1.method6542() >= local30 && Static205.aClass131_1.method6544() < local32 && Static205.aClass131_1.method6542() < local34) {
								local212 = true;
							} else {
								local212 = false;
							}
							if (!Static355.aBoolean473 && local212) {
								if (local6.anInt6881 >= 0) {
									Static409.anInt6677 = local6.anInt6881;
								} else if (local6.aBoolean548) {
									Static409.anInt6677 = -1;
								}
							}
							if (!Static572.aBoolean774 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static405.method5516(arg8 - local17, arg9 - local22, local6);
							}
							@Pc(256) boolean local256 = false;
							if (Static205.aClass131_1.method6539() && local212) {
								local256 = true;
							}
							@Pc(266) boolean local266 = false;
							@Pc(271) Class2_Sub29 local271 = (Class2_Sub29) Static359.aClass70_17.method1264();
							if (local271 != null && local271.method6295() == 0 && local271.method6294() >= local28 && local271.method6293() >= local30 && local271.method6294() < local32 && local271.method6293() < local34) {
								local266 = true;
							}
							@Pc(307) int local307;
							@Pc(441) int local441;
							if (local6.aByteArray65 != null && !Static312.method4451()) {
								for (local307 = 0; local307 < local6.aByteArray65.length; local307++) {
									if (Static106.aClass150_3.method2632(local6.aByteArray65[local307])) {
										if (local6.anIntArray439 == null || Static532.anInt8757 >= local6.anIntArray439[local307]) {
											@Pc(339) byte local339 = local6.lb[local307];
											if (local339 == 0 || ((local339 & 0x8) == 0 || !Static106.aClass150_3.method2632(86) && !Static106.aClass150_3.method2632(82) && !Static106.aClass150_3.method2632(81)) && ((local339 & 0x2) == 0 || Static106.aClass150_3.method2632(86)) && ((local339 & 0x1) == 0 || Static106.aClass150_3.method2632(82)) && ((local339 & 0x4) == 0 || Static106.aClass150_3.method2632(81))) {
												if (local307 < 10) {
													Static513.method6625(local6.anInt6810, "", local307 + 1, -1);
												} else if (local307 == 10) {
													Static5.method84();
													@Pc(410) Class2_Sub23 local410 = method1164(local6);
													Static125.method1728(local410.method2767(), local6, local410.anInt3327);
													Static434.aString105 = Static522.method6727(local6);
													if (Static434.aString105 == null) {
														Static434.aString105 = "Null";
													}
													Static196.aString39 = local6.aString103 + "<col=ffffff>";
												}
												local441 = local6.anIntArray442[local307];
												if (local6.anIntArray439 == null) {
													local6.anIntArray439 = new int[local6.aByteArray65.length];
												}
												if (local441 == 0) {
													local6.anIntArray439[local307] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray439[local307] = Static532.anInt8757 + local441;
												}
											}
										}
									} else if (local6.anIntArray439 != null) {
										local6.anIntArray439[local307] = 0;
									}
								}
							}
							if (local266) {
								Static404.method5507(local6, local271.method6294() - local17, local271.method6293() - local22);
							}
							if (Class12_Sub2_Sub1_Sub3.lb != null && Class12_Sub2_Sub1_Sub3.lb != local6 && local212 && method1164(local6).method2764()) {
								Static310.aClass273_7 = local6;
							}
							if (local6 == Static344.aClass273_8) {
								Static469.aBoolean646 = true;
								Static490.anInt7768 = local17;
								Static434.anInt6970 = local22;
							}
							if (local6.aBoolean545 || local6.anInt6825 != 0) {
								@Pc(526) Class2_Sub10 local526;
								if (local212 && Static157.anInt2491 != 0 && local6.anObjectArray23 != null) {
									local526 = new Class2_Sub10();
									local526.aBoolean101 = true;
									local526.aClass273_4 = local6;
									local526.anInt1606 = Static157.anInt2491;
									local526.anObjectArray1 = local6.anObjectArray23;
									Static213.aClass70_15.method1269(local526);
								}
								if (Class12_Sub2_Sub1_Sub3.lb != null || Static572.aBoolean774 || local6.anInt6825 != Static63.anInt1136 && Static294.anInt9620 > 0) {
									local266 = false;
									local256 = false;
									local212 = false;
								}
								@Pc(681) int local681;
								if (local6.anInt6825 != 0) {
									if (local6.anInt6825 == Static318.anInt5356 || local6.anInt6825 == Static246.anInt4067) {
										Static61.aClass273_1 = local6;
										if (Static320.aClass358_1 != null) {
											Static320.aClass358_1.method7472(local6.anInt6814, Static417.aClass162_17);
										}
										if (local6.anInt6825 == Static318.anInt5356) {
											if (!Static572.aBoolean774 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static276.method4018(arg9, Static417.aClass162_17, arg8);
												for (@Pc(609) Class12_Sub10 local609 = (Class12_Sub10) Static357.aClass220_9.method4661(); local609 != null; local609 = (Class12_Sub10) Static357.aClass220_9.method4660()) {
													if (arg8 >= local609.anInt9535 && arg8 < local609.anInt9533 && arg9 >= local609.anInt9532 && arg9 < local609.anInt9534) {
														Static519.method1522();
														Static17.method4059(local609.aClass12_Sub2_Sub1_Sub4_1);
													}
												}
											}
											Static306.method4399(local17, local6, local22);
											continue;
										}
									}
									@Pc(720) int local720;
									if (local6.anInt6825 == Static433.anInt6961) {
										if (local6.method5632(Static417.aClass162_17) == null || Static449.anInt7189 != 0 && Static449.anInt7189 != 3 || Static572.aBoolean774 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local307 = arg8 - local17;
										local681 = arg9 - local22;
										local441 = local6.anIntArray447[local681];
										if (local307 < local441 || local307 > local441 + local6.anIntArray445[local681]) {
											continue;
										}
										local307 -= local6.anInt6883 / 2;
										local681 -= local6.anInt6814 / 2;
										if (Static489.anInt7763 == 4) {
											local720 = (int) Static313.aFloat157 & 0x3FFF;
										} else {
											local720 = (int) Static313.aFloat157 + Static525.anInt8446 & 0x3FFF;
										}
										@Pc(732) int local732 = Class285.anIntArray476[local720];
										@Pc(736) int local736 = Class285.anIntArray475[local720];
										if (Static489.anInt7763 != 4) {
											local732 = local732 * (Static434.anInt6973 + 256) >> 8;
											local736 = local736 * (Static434.anInt6973 + 256) >> 8;
										}
										@Pc(765) int local765 = local681 * local732 + local307 * local736 >> 14;
										@Pc(775) int local775 = local681 * local736 - local307 * local732 >> 14;
										@Pc(786) int local786;
										@Pc(794) int local794;
										if (Static489.anInt7763 == 4) {
											local786 = (Static504.anInt8012 >> 9) + (local765 >> 2);
											local794 = (Static520.anInt8309 >> 9) - (local775 >> 2);
										} else {
											@Pc(803) int local803 = (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method6777() - 1) * 256;
											local786 = (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374 - local803 >> 9) + (local765 >> 2);
											local794 = (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 - local803 >> 9) - (local775 >> 2);
										}
										if (Static355.aBoolean473 && (Static277.anInt4787 & 0x40) != 0) {
											@Pc(836) Class273 local836 = Static494.method6329(Static464.anInt7423, Static460.anInt7404);
											if (local836 == null) {
												Static5.method84();
											} else {
												Static438.method5750(Static434.aString105, local794, 57, 1L, local786, " ->", false, local6.anInt6805, Static251.anInt4193, true);
											}
											continue;
										}
										if (Static18.aClass308_7 == Static283.aClass308_10) {
											Static438.method5750(Static229.aClass159_29.method2776(Static261.anInt4297), local794, 17, 1L, local786, "", false, -1, -1, true);
										}
										Static438.method5750(Static88.aString20, local794, 10, 1L, local786, "", false, -1, Static283.anInt9028, true);
										continue;
									}
									if (local6.anInt6825 == Static63.anInt1136) {
										Static176.aClass273_5 = local6;
										if (local212) {
											Static79.aBoolean662 = true;
										}
										if (local266) {
											local307 = (int) ((double) (local271.method6294() - local17 - local6.anInt6883 / 2) * 2.0D / (double) Static476.aFloat197);
											local681 = (int) -((double) (local271.method6293() - local22 - local6.anInt6814 / 2) * 2.0D / (double) Static476.aFloat197);
											local441 = Static26.anInt449 + local307 + Static476.anInt7583;
											local720 = Static366.anInt6166 + local681 + Static476.anInt7584;
											@Pc(950) Class2_Sub2_Sub9 local950 = Static255.method3642();
											if (local950 == null) {
												continue;
											}
											@Pc(955) int[] local955 = new int[3];
											local950.method2731(local955, local720, local441);
											if (local955 != null) {
												if (Static106.aClass150_3.method2632(82) && Static11.anInt294 > 0) {
													Static63.method1090(local955[1], local955[0], local955[2]);
													continue;
												}
												Static213.aBoolean225 = true;
												Static269.anInt4395 = local955[0];
												Static1.anInt1 = local955[1];
												Static279.anInt4790 = local955[2];
											}
											Static294.anInt9620 = 1;
											Static447.aBoolean588 = false;
											Static529.anInt8481 = Static205.aClass131_1.method6544();
											Static385.anInt6376 = Static205.aClass131_1.method6542();
											continue;
										}
										if (local256 && Static294.anInt9620 > 0) {
											if (Static294.anInt9620 == 1 && (Static529.anInt8481 != Static205.aClass131_1.method6544() || Static385.anInt6376 != Static205.aClass131_1.method6542())) {
												Static43.anInt784 = Static26.anInt449;
												Static85.anInt1455 = Static366.anInt6166;
												Static294.anInt9620 = 2;
											}
											if (Static294.anInt9620 == 2) {
												Static447.aBoolean588 = true;
												Static542.method5361(Static43.anInt784 + (int) ((double) (Static529.anInt8481 - Static205.aClass131_1.method6544()) * 2.0D / (double) Static476.aFloat196));
												Static203.method2532(Static85.anInt1455 - (int) ((double) (Static385.anInt6376 - Static205.aClass131_1.method6542()) * 2.0D / (double) Static476.aFloat196));
											}
											continue;
										}
										if (Static294.anInt9620 > 0 && !Static447.aBoolean588) {
											if ((Static304.anInt5055 == 1 || Static327.method4752()) && Static484.anInt7715 > 2) {
												Static9.method177(Static385.anInt6376, Static529.anInt8481);
											} else if (Static216.method7672()) {
												Static9.method177(Static385.anInt6376, Static529.anInt8481);
											}
										}
										Static294.anInt9620 = 0;
										continue;
									}
									if (local6.anInt6825 == Static452.anInt7230) {
										if (local256) {
											Static69.method4391(local6.anInt6883, Static205.aClass131_1.method6544() - local17, local6.anInt6814, Static205.aClass131_1.method6542() - local22);
										}
										continue;
									}
									if (local6.anInt6825 == Static81.anInt9019) {
										Static560.method7327(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean549 && local266) {
									local6.aBoolean549 = true;
									if (local6.anObjectArray8 != null) {
										local526 = new Class2_Sub10();
										local526.aBoolean101 = true;
										local526.aClass273_4 = local6;
										local526.anInt1609 = local271.method6294() - local17;
										local526.anInt1606 = local271.method6293() - local22;
										local526.anObjectArray1 = local6.anObjectArray8;
										Static213.aClass70_15.method1269(local526);
									}
								}
								if (local6.aBoolean549 && local256 && local6.anObjectArray13 != null) {
									local526 = new Class2_Sub10();
									local526.aBoolean101 = true;
									local526.aClass273_4 = local6;
									local526.anInt1609 = Static205.aClass131_1.method6544() - local17;
									local526.anInt1606 = Static205.aClass131_1.method6542() - local22;
									local526.anObjectArray1 = local6.anObjectArray13;
									Static213.aClass70_15.method1269(local526);
								}
								if (local6.aBoolean549 && !local256) {
									local6.aBoolean549 = false;
									if (local6.anObjectArray20 != null) {
										local526 = new Class2_Sub10();
										local526.aBoolean101 = true;
										local526.aClass273_4 = local6;
										local526.anInt1609 = Static205.aClass131_1.method6544() - local17;
										local526.anInt1606 = Static205.aClass131_1.method6542() - local22;
										local526.anObjectArray1 = local6.anObjectArray20;
										Static361.aClass70_40.method1269(local526);
									}
								}
								if (local256 && local6.anObjectArray18 != null) {
									local526 = new Class2_Sub10();
									local526.aBoolean101 = true;
									local526.aClass273_4 = local6;
									local526.anInt1609 = Static205.aClass131_1.method6544() - local17;
									local526.anInt1606 = Static205.aClass131_1.method6542() - local22;
									local526.anObjectArray1 = local6.anObjectArray18;
									Static213.aClass70_15.method1269(local526);
								}
								if (!local6.aBoolean554 && local212) {
									local6.aBoolean554 = true;
									if (local6.anObjectArray21 != null) {
										local526 = new Class2_Sub10();
										local526.aBoolean101 = true;
										local526.aClass273_4 = local6;
										local526.anInt1609 = Static205.aClass131_1.method6544() - local17;
										local526.anInt1606 = Static205.aClass131_1.method6542() - local22;
										local526.anObjectArray1 = local6.anObjectArray21;
										Static213.aClass70_15.method1269(local526);
									}
								}
								if (local6.aBoolean554 && local212 && local6.anObjectArray29 != null) {
									local526 = new Class2_Sub10();
									local526.aBoolean101 = true;
									local526.aClass273_4 = local6;
									local526.anInt1609 = Static205.aClass131_1.method6544() - local17;
									local526.anInt1606 = Static205.aClass131_1.method6542() - local22;
									local526.anObjectArray1 = local6.anObjectArray29;
									Static213.aClass70_15.method1269(local526);
								}
								if (local6.aBoolean554 && !local212) {
									local6.aBoolean554 = false;
									if (local6.anObjectArray7 != null) {
										local526 = new Class2_Sub10();
										local526.aBoolean101 = true;
										local526.aClass273_4 = local6;
										local526.anInt1609 = Static205.aClass131_1.method6544() - local17;
										local526.anInt1606 = Static205.aClass131_1.method6542() - local22;
										local526.anObjectArray1 = local6.anObjectArray7;
										Static361.aClass70_40.method1269(local526);
									}
								}
								if (local6.anObjectArray19 != null) {
									local526 = new Class2_Sub10();
									local526.aClass273_4 = local6;
									local526.anObjectArray1 = local6.anObjectArray19;
									Static153.aClass70_7.method1269(local526);
								}
								@Pc(1494) Class2_Sub10 local1494;
								if (local6.anObjectArray9 != null && Static138.anInt2259 > local6.anInt6879) {
									if (local6.anIntArray446 == null || Static138.anInt2259 - local6.anInt6879 > 32) {
										local526 = new Class2_Sub10();
										local526.aClass273_4 = local6;
										local526.anObjectArray1 = local6.anObjectArray9;
										Static213.aClass70_15.method1269(local526);
									} else {
										label683: for (local307 = local6.anInt6879; local307 < Static138.anInt2259; local307++) {
											local681 = Static330.anIntArray10[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray446.length; local441++) {
												if (local6.anIntArray446[local441] == local681) {
													local1494 = new Class2_Sub10();
													local1494.aClass273_4 = local6;
													local1494.anObjectArray1 = local6.anObjectArray9;
													Static213.aClass70_15.method1269(local1494);
													break label683;
												}
											}
										}
									}
									local6.anInt6879 = Static138.anInt2259;
								}
								if (local6.anObjectArray12 != null && Static458.anInt7367 > local6.anInt6808) {
									if (local6.anIntArray448 == null || Static458.anInt7367 - local6.anInt6808 > 32) {
										local526 = new Class2_Sub10();
										local526.aClass273_4 = local6;
										local526.anObjectArray1 = local6.anObjectArray12;
										Static213.aClass70_15.method1269(local526);
									} else {
										label659: for (local307 = local6.anInt6808; local307 < Static458.anInt7367; local307++) {
											local681 = Static172.anIntArray217[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray448.length; local441++) {
												if (local6.anIntArray448[local441] == local681) {
													local1494 = new Class2_Sub10();
													local1494.aClass273_4 = local6;
													local1494.anObjectArray1 = local6.anObjectArray12;
													Static213.aClass70_15.method1269(local1494);
													break label659;
												}
											}
										}
									}
									local6.anInt6808 = Static458.anInt7367;
								}
								if (local6.anObjectArray25 != null && Static134.anInt2158 > local6.anInt6859) {
									if (local6.anIntArray443 == null || Static134.anInt2158 - local6.anInt6859 > 32) {
										local526 = new Class2_Sub10();
										local526.aClass273_4 = local6;
										local526.anObjectArray1 = local6.anObjectArray25;
										Static213.aClass70_15.method1269(local526);
									} else {
										label635: for (local307 = local6.anInt6859; local307 < Static134.anInt2158; local307++) {
											local681 = Static113.anIntArray170[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray443.length; local441++) {
												if (local6.anIntArray443[local441] == local681) {
													local1494 = new Class2_Sub10();
													local1494.aClass273_4 = local6;
													local1494.anObjectArray1 = local6.anObjectArray25;
													Static213.aClass70_15.method1269(local1494);
													break label635;
												}
											}
										}
									}
									local6.anInt6859 = Static134.anInt2158;
								}
								if (local6.anObjectArray33 != null && Static375.anInt6283 > local6.anInt6844) {
									if (local6.anIntArray444 == null || Static375.anInt6283 - local6.anInt6844 > 32) {
										local526 = new Class2_Sub10();
										local526.aClass273_4 = local6;
										local526.anObjectArray1 = local6.anObjectArray33;
										Static213.aClass70_15.method1269(local526);
									} else {
										label611: for (local307 = local6.anInt6844; local307 < Static375.anInt6283; local307++) {
											local681 = Static409.anIntArray428[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray444.length; local441++) {
												if (local6.anIntArray444[local441] == local681) {
													local1494 = new Class2_Sub10();
													local1494.aClass273_4 = local6;
													local1494.anObjectArray1 = local6.anObjectArray33;
													Static213.aClass70_15.method1269(local1494);
													break label611;
												}
											}
										}
									}
									local6.anInt6844 = Static375.anInt6283;
								}
								if (local6.anObjectArray22 != null && Static539.anInt8860 > local6.anInt6872) {
									if (local6.anIntArray441 == null || Static539.anInt8860 - local6.anInt6872 > 32) {
										local526 = new Class2_Sub10();
										local526.aClass273_4 = local6;
										local526.anObjectArray1 = local6.anObjectArray22;
										Static213.aClass70_15.method1269(local526);
									} else {
										label587: for (local307 = local6.anInt6872; local307 < Static539.anInt8860; local307++) {
											local681 = Static422.anIntArray450[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray441.length; local441++) {
												if (local6.anIntArray441[local441] == local681) {
													local1494 = new Class2_Sub10();
													local1494.aClass273_4 = local6;
													local1494.anObjectArray1 = local6.anObjectArray22;
													Static213.aClass70_15.method1269(local1494);
													break label587;
												}
											}
										}
									}
									local6.anInt6872 = Static539.anInt8860;
								}
								if (Static487.anInt7732 > local6.anInt6843 && local6.anObjectArray5 != null) {
									local526 = new Class2_Sub10();
									local526.aClass273_4 = local6;
									local526.anObjectArray1 = local6.anObjectArray5;
									Static213.aClass70_15.method1269(local526);
								}
								if (Static586.anInt9519 > local6.anInt6843 && local6.anObjectArray31 != null) {
									local526 = new Class2_Sub10();
									local526.aClass273_4 = local6;
									local526.anObjectArray1 = local6.anObjectArray31;
									Static213.aClass70_15.method1269(local526);
								}
								if (Static248.anInt4116 > local6.anInt6843 && local6.anObjectArray26 != null) {
									local526 = new Class2_Sub10();
									local526.aClass273_4 = local6;
									local526.anObjectArray1 = local6.anObjectArray26;
									Static213.aClass70_15.method1269(local526);
								}
								if (Static290.anInt4888 > local6.anInt6843 && local6.anObjectArray16 != null) {
									local526 = new Class2_Sub10();
									local526.aClass273_4 = local6;
									local526.anObjectArray1 = local6.anObjectArray16;
									Static213.aClass70_15.method1269(local526);
								}
								if (Static181.anInt2687 > local6.anInt6843 && local6.anObjectArray32 != null) {
									local526 = new Class2_Sub10();
									local526.aClass273_4 = local6;
									local526.anObjectArray1 = local6.anObjectArray32;
									Static213.aClass70_15.method1269(local526);
								}
								local6.anInt6843 = Static390.anInt6454;
								if (local6.anObjectArray27 != null) {
									for (local307 = 0; local307 < Static69.anInt5062; local307++) {
										@Pc(1962) Class2_Sub10 local1962 = new Class2_Sub10();
										local1962.aClass273_4 = local6;
										local1962.anInt1605 = Static344.anInterface24Array2[local307].method7253();
										local1962.anInt1604 = Static344.anInterface24Array2[local307].method7251();
										local1962.anObjectArray1 = local6.anObjectArray27;
										Static213.aClass70_15.method1269(local1962);
									}
								}
								if (Static570.aBoolean771 && local6.anObjectArray15 != null) {
									local526 = new Class2_Sub10();
									local526.aClass273_4 = local6;
									local526.anObjectArray1 = local6.anObjectArray15;
									Static213.aClass70_15.method1269(local526);
								}
							}
							if (local6.anInt6868 == 5 && local6.anInt6790 != -1) {
								local6.method5643(Static496.aClass39_1, Static403.aClass123_2).method7472(local6.anInt6814, Static417.aClass162_17);
							}
							Static175.method4474(local6);
							if (local6.anInt6868 == 0) {
								method1165(arg0, local6.anInt6810, local28, local30, local32, local34, local17 - local6.anInt6812, local22 - local6.anInt6880, arg8, arg9);
								if (local6.aClass273Array2 != null) {
									method1165(local6.aClass273Array2, local6.anInt6810, local28, local30, local32, local34, local17 - local6.anInt6812, local22 - local6.anInt6880, arg8, arg9);
								}
								@Pc(2084) Class2_Sub33 local2084 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local6.anInt6810);
								if (local2084 != null) {
									if (Static18.aClass308_7 == Static278.aClass308_6 && local2084.anInt5985 == 0 && !Static572.aBoolean774 && local212 && !Static440.aBoolean582) {
										Static519.method1522();
									}
									Static135.method6627(local17, local30, local2084.anInt5981, local34, arg8, local22, local28, arg9, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static175.method4474(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ps;)Z")
	public static boolean method1167(@OriginalArg(0) Class273 arg0) {
		if (Static440.aBoolean582) {
			if (method1164(arg0).anInt3330 != 0) {
				return false;
			}
			if (arg0.anInt6868 == 0) {
				return false;
			}
		}
		return arg0.aBoolean553;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ps;)Lclient!ps;")
	public static Class273 method1169(@OriginalArg(0) Class273 arg0) {
		@Pc(4) int local4 = method1164(arg0).method2772();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static594.method7731(arg0.anInt6820);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(FIIIIIFF)[F")
	public static float[] method1170(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[2] = local25;
		local6[6] = -local25;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[3] = 0.0F;
		local6[8] = local17;
		local6[5] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(78) float local78 = (float) arg1 / 32767.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) ((float) 1 - local78 * local78)));
		@Pc(93) float local93 = 1.0F - local78;
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg2 * arg2 + arg4 * arg4));
		if (local104 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local73 = (float) arg4 / local104;
				local71 = (float) -arg2 / local104;
			}
			local69[7] = -local71 * local89;
			local69[5] = local89 * local71;
			local69[8] = local78 + local93 * local73 * local73;
			local69[2] = local93 * local73 * local71;
			local69[4] = local78;
			local69[3] = local89 * -local73;
			local69[6] = local73 * local71 * local93;
			local69[1] = local89 * local73;
			local69[0] = local93 * local71 * local71 + local78;
			local9[0] = local6[2] * local69[6] + local6[0] * local69[0] + local69[3] * local6[1];
			local9[1] = local69[7] * local6[2] + local6[1] * local69[4] + local69[1] * local6[0];
			local9[2] = local6[2] * local69[8] + local6[1] * local69[5] + local69[2] * local6[0];
			local9[3] = local69[0] * local6[3] + local69[3] * local6[4] + local69[6] * local6[5];
			local9[4] = local69[7] * local6[5] + local69[4] * local6[4] + local6[3] * local69[1];
			local9[6] = local69[6] * local6[8] + local69[3] * local6[7] + local69[0] * local6[6];
			local9[5] = local6[5] * local69[8] + local6[3] * local69[2] + local6[4] * local69[5];
			local9[7] = local6[7] * local69[4] + local6[6] * local69[1] + local6[8] * local69[7];
			local9[8] = local6[6] * local69[2] + local6[7] * local69[5] + local69[8] * local6[8];
		}
		local9[6] *= arg6;
		local9[4] *= arg0;
		local9[1] *= arg5;
		local9[5] *= arg0;
		local9[7] *= arg6;
		local9[0] *= arg5;
		local9[8] *= arg6;
		local9[2] *= arg5;
		local9[3] *= arg0;
		return local9;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1172() {
		@Pc(1) int local1 = Static84.anInt9548;
		@Pc(3) int[] local3 = Static520.anIntArray555;
		@Pc(20) boolean local20 = Static257.aClass2_Sub35_Sub1_1.anInt7510 == 1 && local1 > 200 || Static257.aClass2_Sub35_Sub1_1.anInt7510 == 0 && local1 > 50;
		@Pc(82) int local82;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class12_Sub2_Sub1_Sub4_Sub1 local29 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local3[local22]];
			if (!local29.method4905()) {
				local29.anInt8399 = -1;
			} else if (local29.aBoolean461) {
				local29.anInt8399 = -1;
			} else {
				local29.method7514();
				if (local29.aShort120 >= 0 && local29.aShort121 >= 0 && local29.aShort119 < Static281.anInt4822 && local29.aShort122 < Static29.anInt491) {
					local29.aBoolean460 = local29.aBoolean710 ? local20 : false;
					if (local29 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30) {
						local29.anInt8399 = Integer.MAX_VALUE;
					} else {
						local82 = 0;
						if (!local29.aBoolean709) {
							local82++;
						}
						if (local29.anInt8354 > Static532.anInt8757) {
							local82 += 2;
						}
						local82 += 5 - local29.method6777() << 2;
						if (local29.aBoolean462) {
							local82 += 512;
						} else {
							if (Static392.anInt6492 == 0) {
								local82 += 32;
							} else {
								local82 += 128;
							}
							local82 += 256;
						}
						local29.anInt8399 = local82 + 1;
					}
				} else {
					local29.anInt8399 = -1;
				}
			}
		}
		for (@Pc(123) int local123 = 0; local123 < Static365.anInt6148; local123++) {
			@Pc(134) Class12_Sub2_Sub1_Sub4_Sub2 local134 = ((Class2_Sub5) Static436.aClass90_26.method1685((long) Static461.anIntArray562[local123])).aClass12_Sub2_Sub1_Sub4_Sub2_1;
			if (local134.method6789() && local134.aClass295_1.method5938(Static426.aClass160_1)) {
				local134.method7514();
				if (local134.aShort120 >= 0 && local134.aShort121 >= 0 && local134.aShort119 < Static281.anInt4822 && local134.aShort122 < Static29.anInt491) {
					@Pc(171) int local171 = 0;
					if (!local134.aBoolean709) {
						local171++;
					}
					if (local134.anInt8354 > Static532.anInt8757) {
						local171 += 2;
					}
					local171 += 5 - local134.method6777() << 2;
					if (Static392.anInt6492 == 0) {
						if (local134.aClass295_1.aBoolean615) {
							local171 += 64;
						} else {
							local171 += 128;
						}
					} else if (Static392.anInt6492 == 1) {
						if (local134.aClass295_1.aBoolean615) {
							local171 += 32;
						} else {
							local171 += 64;
						}
					}
					if (local134.aClass295_1.aBoolean614) {
						local171 += 1024;
					} else if (!local134.aClass295_1.aBoolean613) {
						local171 += 256;
					}
					local134.anInt8399 = local171 + 1;
				} else {
					local134.anInt8399 = -1;
				}
			} else {
				local134.anInt8399 = -1;
			}
		}
		for (local82 = 0; local82 < Static271.aClass80Array1.length; local82++) {
			@Pc(237) Class80 local237 = Static271.aClass80Array1[local82];
			if (local237 != null) {
				if (local237.anInt1806 == 1) {
					@Pc(251) Class2_Sub5 local251 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local237.anInt1798);
					if (local251 != null) {
						@Pc(256) Class12_Sub2_Sub1_Sub4_Sub2 local256 = local251.aClass12_Sub2_Sub1_Sub4_Sub2_1;
						if (local256.anInt8399 >= 0) {
							local256.anInt8399 += 2048;
						}
					}
				} else if (local237.anInt1806 == 10) {
					@Pc(275) Class12_Sub2_Sub1_Sub4_Sub1 local275 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local237.anInt1798];
					if (local275 != null && local275 != Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 && local275.anInt8399 >= 0) {
						local275.anInt8399 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1173() {
		for (@Pc(1) int local1 = 0; local1 < Static281.anInt4822; local1++) {
			@Pc(6) int[] local6 = Static471.anIntArrayArray50[local1];
			for (@Pc(8) int local8 = 0; local8 < Static29.anInt491; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1176() {
		Static79.anInt7818 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static365.anInt6148; local3++) {
			@Pc(14) Class12_Sub2_Sub1_Sub4_Sub2 local14 = ((Class2_Sub5) Static436.aClass90_26.method1685((long) Static461.anIntArray562[local3])).aClass12_Sub2_Sub1_Sub4_Sub2_1;
			if (local14.aBoolean709 && local14.method6775() != -1) {
				@Pc(32) int local32 = (local14.method6777() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt9374 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt9375 - local32 >> 9;
				@Pc(53) Class12_Sub2_Sub1_Sub4 local53 = Static580.method7353(local14.aByte128, local39, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt8406;
					if (local53 instanceof Class12_Sub2_Sub1_Sub4_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt8377 == 0 && local53.method6775() != -1) {
						Static136.anIntArray183[Static79.anInt7818] = local58;
						Static128.anIntArray178[Static79.anInt7818] = local58;
						Static79.anInt7818++;
						local53.anInt8377++;
					}
					Static136.anIntArray183[Static79.anInt7818] = local58;
					Static128.anIntArray178[Static79.anInt7818] = local14.anInt8406 + 2048;
					Static79.anInt7818++;
					local53.anInt8377++;
				}
			}
		}
		Static319.method4644(Static136.anIntArray183, Static128.anIntArray178, 0, Static79.anInt7818 - 1);
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1177(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static84.anInt9548;
		@Pc(3) int[] local3 = Static520.anIntArray555;
		@Pc(11) int local11 = Static481.aBoolean654 ? local1 : local1 + Static365.anInt6148;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class12_Sub2_Sub1_Sub4 local23;
			if (local13 < local1) {
				local23 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub5) Static436.aClass90_26.method1685((long) Static461.anIntArray562[local13 - local1])).aClass12_Sub2_Sub1_Sub4_Sub2_1;
			}
			if (local23.aByte128 == arg0) {
				local23.anInt8377 = 0;
				if (local23.anInt8399 < 0) {
					local23.aBoolean709 = false;
				} else {
					@Pc(54) int local54 = local23.method6777();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9374 & 0x1FF) != 0 || (local23.anInt9375 & 0x1FF) != 0) {
							local23.aBoolean709 = false;
							continue;
						}
					} else if ((local23.anInt9374 & 0x1FF) != 256 || (local23.anInt9375 & 0x1FF) != 256) {
						local23.aBoolean709 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9374 >> 9;
						local101 = local23.anInt9375 >> 9;
						if (local23.anInt8399 != Static471.anIntArrayArray50[local96][local101]) {
							local23.aBoolean709 = true;
							continue;
						}
						if (Static29.anIntArrayArray4[local96][local101] > 1) {
							local126 = Static29.anIntArrayArray4[local96][local101]--;
							local23.aBoolean709 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt9374 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt9375 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt9374 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt9375 + local96 >> 9;
						if (!Static206.method2568(local101, local155, local23.anInt8399, local169, local162)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt8399 == Static471.anIntArrayArray50[local180][local183]) {
										local126 = Static29.anIntArrayArray4[local180][local183]--;
									}
								}
							}
							local23.aBoolean709 = true;
							continue;
						}
					}
					local23.aBoolean709 = false;
					local23.anInt9373 = Static24.method347(local23.anInt9375, local23.anInt9374, local23.aByte128);
					Static526.method7745(local23, true);
				}
			}
		}
	}
}
