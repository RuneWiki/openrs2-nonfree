import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_7 = new Class132(5);

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[Lclient!av;")
	public static final Class7[] aClass7Array1 = new Class7[128];

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	public static int anInt1028 = 0;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	public static final int[] anIntArray96 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method798() {
		Static456.anInt7293 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static351.anInt5969; local3++) {
			@Pc(14) Class3_Sub4_Sub1_Sub1 local14 = ((Class2_Sub28) Static49.aClass72_11.method1659((long) Static40.anIntArray84[local3])).aClass3_Sub4_Sub1_Sub1_1;
			if (local14.aBoolean351 && local14.method3998() != -1) {
				@Pc(32) int local32 = (local14.method4009() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt6833 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt6835 - local32 >> 7;
				@Pc(53) Class3_Sub4_Sub1 local53 = Static297.method3931(local39, local46, local14.aByte91);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt4915;
					if (local53 instanceof Class3_Sub4_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt4952 == 0 && local53.method3998() != -1) {
						Static197.anIntArray284[Static456.anInt7293] = local58;
						Static163.anIntArray222[Static456.anInt7293] = local58;
						Static456.anInt7293++;
						local53.anInt4952++;
					}
					Static197.anIntArray284[Static456.anInt7293] = local58;
					Static163.anIntArray222[Static456.anInt7293] = local14.anInt4915 + 2048;
					Static456.anInt7293++;
					local53.anInt4952++;
				}
			}
		}
		Static199.method2679(0, Static163.anIntArray222, Static456.anInt7293 - 1, Static197.anIntArray284);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method799() {
		@Pc(1) int local1 = Static119.anInt2204;
		@Pc(3) int[] local3 = Static200.anIntArray295;
		@Pc(20) boolean local20 = Static2.aClass148_Sub1_1.anInt3783 == 1 && local1 > 200 || Static2.aClass148_Sub1_1.anInt3783 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class3_Sub4_Sub1_Sub2 local29 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local3[local22]];
			if (local29.method4016()) {
				local29.method5288();
				if (local29.aShort92 >= 0 && local29.aShort89 >= 0 && local29.aShort91 < Static166.anInt2852 && local29.aShort90 < Static426.anInt6923) {
					local29.aBoolean356 = local29.aBoolean353 ? local20 : false;
					if (local29 == Static60.aClass3_Sub4_Sub1_Sub2_1) {
						local29.anInt4972 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean351) {
							local75++;
						}
						if (local29.anInt4965 > Static266.anInt4392) {
							local75 += 2;
						}
						local75 += 5 - local29.method4009() << 2;
						if (local29.aBoolean358) {
							local75 += 512;
						} else {
							if (Static10.anInt152 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt4972 = local75 + 1;
					}
				} else {
					local29.anInt4972 = -1;
				}
			} else {
				local29.anInt4972 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static351.anInt5969; local116++) {
			@Pc(127) Class3_Sub4_Sub1_Sub1 local127 = ((Class2_Sub28) Static49.aClass72_11.method1659((long) Static40.anIntArray84[local116])).aClass3_Sub4_Sub1_Sub1_1;
			if (local127.method2633() && local127.aClass245_1.method5199(Static138.aClass268_1)) {
				local127.method5288();
				if (local127.aShort92 >= 0 && local127.aShort89 >= 0 && local127.aShort91 < Static166.anInt2852 && local127.aShort90 < Static426.anInt6923) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean351) {
						local164++;
					}
					if (local127.anInt4965 > Static266.anInt4392) {
						local164 += 2;
					}
					local164 += 5 - local127.method4009() << 2;
					if (Static10.anInt152 == 0) {
						if (local127.aClass245_1.aBoolean474) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static10.anInt152 == 1) {
						if (local127.aClass245_1.aBoolean474) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass245_1.aBoolean477) {
						local164 += 1024;
					} else if (!local127.aClass245_1.aBoolean473) {
						local164 += 256;
					}
					local127.anInt4972 = local164 + 1;
				} else {
					local127.anInt4972 = -1;
				}
			} else {
				local127.anInt4972 = -1;
			}
		}
		for (local75 = 0; local75 < Static186.aClass185Array5.length; local75++) {
			@Pc(230) Class185 local230 = Static186.aClass185Array5[local75];
			if (local230 != null) {
				if (local230.anInt4814 == 1) {
					@Pc(244) Class2_Sub28 local244 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local230.anInt4822);
					if (local244 != null) {
						@Pc(249) Class3_Sub4_Sub1_Sub1 local249 = local244.aClass3_Sub4_Sub1_Sub1_1;
						if (local249.anInt4972 >= 0) {
							local249.anInt4972 += 2048;
						}
					}
				} else if (local230.anInt4814 == 10) {
					@Pc(268) Class3_Sub4_Sub1_Sub2 local268 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local230.anInt4822];
					if (local268 != null && local268 != Static60.aClass3_Sub4_Sub1_Sub2_1 && local268.anInt4972 >= 0) {
						local268.anInt4972 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method800() {
		for (@Pc(1) int local1 = 0; local1 < Static166.anInt2852; local1++) {
			@Pc(6) int[] local6 = Static353.anIntArrayArray49[local1];
			for (@Pc(8) int local8 = 0; local8 < Static426.anInt6923; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!at;)Z")
	public static boolean method802(@OriginalArg(0) Class16 arg0) {
		if (Static95.aBoolean158) {
			if (method815(arg0).anInt1904 != 0) {
				return false;
			}
			if (arg0.anInt298 == 0) {
				return false;
			}
		}
		return arg0.aBoolean27;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method803(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static119.anInt2204;
		@Pc(3) int[] local3 = Static200.anIntArray295;
		@Pc(11) int local11 = Static104.aBoolean135 ? local1 : local1 + Static351.anInt5969;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub4_Sub1 local23;
			if (local13 < local1) {
				local23 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub28) Static49.aClass72_11.method1659((long) Static40.anIntArray84[local13 - local1])).aClass3_Sub4_Sub1_Sub1_1;
			}
			if (local23.aByte91 == arg0) {
				local23.anInt4952 = 0;
				if (local23.anInt4972 < 0) {
					local23.aBoolean351 = false;
				} else {
					@Pc(54) int local54 = local23.method4009();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt6833 & 0x7F) != 0 || (local23.anInt6835 & 0x7F) != 0) {
							local23.aBoolean351 = false;
							continue;
						}
					} else if ((local23.anInt6833 & 0x7F) != 64 || (local23.anInt6835 & 0x7F) != 64) {
						local23.aBoolean351 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt6833 >> 7;
						local101 = local23.anInt6835 >> 7;
						if (local23.anInt4972 != Static353.anIntArrayArray49[local96][local101]) {
							local23.aBoolean351 = true;
							continue;
						}
						if (Static202.anIntArrayArray18[local96][local101] > 1) {
							local126 = Static202.anIntArrayArray18[local96][local101]--;
							local23.aBoolean351 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt6833 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt6835 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt6833 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt6835 + local96 >> 7;
						if (!Static71.method1075(local101, local155, local162, local169, local23.anInt4972)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt4972 == Static353.anIntArrayArray49[local180][local183]) {
										local126 = Static202.anIntArrayArray18[local180][local183]--;
									}
								}
							}
							local23.aBoolean351 = true;
							continue;
						}
					}
					if (local23 instanceof Class3_Sub4_Sub1_Sub2 && local23.aClass2_Sub41_3 != null && Static266.anInt4392 >= local23.aClass2_Sub41_3.anInt6970 && Static266.anInt4392 < local23.aClass2_Sub41_3.anInt6956) {
						((Class3_Sub4_Sub1_Sub2) local23).aBoolean356 = false;
					}
					local23.aBoolean351 = false;
					local23.anInt6832 = Static302.method3973(local23.anInt6835, local23.anInt6833, local23.aByte91);
					Static249.method3169(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method807(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static119.anInt2204;
		@Pc(3) int[] local3 = Static200.anIntArray295;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static351.anInt5969; local5++) {
			@Pc(15) Class3_Sub4_Sub1 local15;
			if (local5 < local1) {
				local15 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class2_Sub28) Static49.aClass72_11.method1659((long) Static40.anIntArray84[local5 - local1])).aClass3_Sub4_Sub1_Sub1_1;
			}
			if (local15.aByte91 == arg0 && local15.anInt4972 >= 0) {
				@Pc(39) int local39 = local15.method4009();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt6833 & 0x7F) != 0 || (local15.anInt6835 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6833 & 0x7F) != 64 || (local15.anInt6835 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt6833 >> 7;
					local80 = local15.anInt6835 >> 7;
					if (local15.anInt4972 > Static353.anIntArrayArray49[local75][local80]) {
						Static353.anIntArrayArray49[local75][local80] = local15.anInt4972;
						Static202.anIntArrayArray18[local75][local80] = 1;
					} else if (local15.anInt4972 == Static353.anIntArrayArray49[local75][local80]) {
						local116 = Static202.anIntArrayArray18[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt6833 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt6835 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt6833 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt6835 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt4972 > Static353.anIntArrayArray49[local158][local161]) {
								Static353.anIntArrayArray49[local158][local161] = local15.anInt4972;
								Static202.anIntArrayArray18[local158][local161] = 1;
							} else if (local15.anInt4972 == Static353.anIntArrayArray49[local158][local161]) {
								local116 = Static202.anIntArrayArray18[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!at;)Lclient!at;")
	public static Class16 method809(@OriginalArg(0) Class16 arg0) {
		@Pc(4) int local4 = method815(arg0).method1535();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static338.method4534(arg0.anInt324);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method810() {
		@Pc(1) int local1 = Static119.anInt2204;
		@Pc(3) int[] local3 = Static200.anIntArray295;
		@Pc(11) int local11 = Static104.aBoolean135 ? local1 : local1 + Static351.anInt5969;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub4_Sub1 local23;
			if (local13 < local1) {
				local23 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub28) Static49.aClass72_11.method1659((long) Static40.anIntArray84[local13 - local1])).aClass3_Sub4_Sub1_Sub1_1;
			}
			if (local23.anInt4972 >= 0) {
				@Pc(43) int local43 = local23.method4009();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt6833 & 0x7F) == 0 && (local23.anInt6835 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6833 & 0x7F) == 64 && (local23.anInt6835 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class3_Sub4_Sub1_Sub2 && local23.aClass2_Sub41_3 != null && Static266.anInt4392 >= local23.aClass2_Sub41_3.anInt6970 && Static266.anInt4392 < local23.aClass2_Sub41_3.anInt6956) {
					((Class3_Sub4_Sub1_Sub2) local23).aBoolean356 = false;
				}
				local23.anInt6832 = Static302.method3973(local23.anInt6835, local23.anInt6833, local23.aByte91);
				Static249.method3169(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!at;IIIIIIIII)V")
	public static void method813(@OriginalArg(0) Class16[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class16 local6 = arg0[local1];
			if (local6 != null && local6.anInt324 == arg1) {
				@Pc(17) int local17 = local6.anInt316 + arg6;
				@Pc(22) int local22 = local6.anInt269 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt298 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt294;
					@Pc(45) int local45 = local22 + local6.anInt285;
					if (local6.anInt298 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt298 == 0 || local6.aBoolean22 || method815(local6).anInt1904 != 0 || local6 == Static190.aClass16_9 || local6.anInt252 == Static336.anInt5713) {
					if (!method802(local6)) {
						if (local6 == Static336.aClass16_18) {
							Static32.aBoolean60 = true;
							Static272.anInt4438 = local17;
							Static391.anInt6436 = local22;
						}
						if (local6.aBoolean32 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean26 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class2_Sub44 local148 = (Class2_Sub44) Static37.aClass156_54.method3155(); local148 != null; local148 = (Class2_Sub44) Static37.aClass156_54.method3150()) {
									if (local148.aBoolean519) {
										local148.method5703();
										local148.aClass16_20.aBoolean23 = false;
									}
								}
								if (Static366.anInt6161 == 0) {
									Static336.aClass16_18 = null;
									Static190.aClass16_9 = null;
								}
								Static302.anInt4877 = 0;
								Static77.aBoolean116 = false;
								Static415.aBoolean485 = false;
								if (!Static126.aBoolean52) {
									Static337.method4522();
								}
							}
							@Pc(204) boolean local204;
							if (Static376.aClass203_1.method4918() >= local28 && Static376.aClass203_1.method4925() >= local30 && Static376.aClass203_1.method4918() < local32 && Static376.aClass203_1.method4925() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static215.aBoolean217 && local204) {
								if (local6.anInt277 >= 0) {
									Static96.anInt1855 = local6.anInt277;
								} else if (local6.aBoolean26) {
									Static96.anInt1855 = -1;
								}
							}
							if (!Static126.aBoolean52 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static217.method2871(local6, arg9 - local22, arg8 - local17);
							}
							@Pc(248) boolean local248 = false;
							if (Static376.aClass203_1.method4915() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class2_Sub14 local263 = (Class2_Sub14) Static57.aClass156_8.method3155();
							if (local263 != null && local263.method5381() == 0 && local263.method5382() >= local28 && local263.method5383() >= local30 && local263.method5382() < local32 && local263.method5383() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray2 != null) {
								for (local296 = 0; local296 < local6.aByteArray2.length; local296++) {
									if (Static218.aClass181_1.method3865(local6.aByteArray2[local296])) {
										if (local6.anIntArray24 == null || Static266.anInt4392 >= local6.anIntArray24[local296]) {
											@Pc(328) byte local328 = local6.aByteArray1[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static218.aClass181_1.method3865(86) && !Static218.aClass181_1.method3865(82) && !Static218.aClass181_1.method3865(81)) && ((local328 & 0x2) == 0 || Static218.aClass181_1.method3865(86)) && ((local328 & 0x1) == 0 || Static218.aClass181_1.method3865(82)) && ((local328 & 0x4) == 0 || Static218.aClass181_1.method3865(81))) {
												if (local296 < 10) {
													Static386.method4944(-1, "", local6.anInt293, local296 + 1);
												} else if (local296 == 10) {
													Static377.method3604();
													@Pc(399) Class2_Sub15 local399 = method815(local6);
													Static352.method4679(local399.method1538(), local6, local399.anInt1899);
													Static76.aString45 = Static460.method5500(local6);
													if (Static76.aString45 == null) {
														Static76.aString45 = "Null";
													}
													Static408.aString205 = local6.aString13 + "<col=ffffff>";
												}
												local430 = local6.anIntArray31[local296];
												if (local6.anIntArray24 == null) {
													local6.anIntArray24 = new int[local6.aByteArray2.length];
												}
												if (local430 == 0) {
													local6.anIntArray24[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray24[local296] = Static266.anInt4392 + local430;
												}
											}
										}
									} else if (local6.anIntArray24 != null) {
										local6.anIntArray24[local296] = 0;
									}
								}
							}
							if (local258) {
								Static80.method3758(local263.method5383() - local22, local6, local263.method5382() - local17);
							}
							if (Static336.aClass16_18 != null && Static336.aClass16_18 != local6 && local204 && method815(local6).method1539()) {
								Static176.aClass16_2 = local6;
							}
							if (local6 == Static190.aClass16_9) {
								Static392.aBoolean460 = true;
								Static379.anInt6862 = local17;
								Static25.anInt451 = local22;
							}
							if (local6.aBoolean22 || local6.anInt252 != 0) {
								@Pc(515) Class2_Sub44 local515;
								if (local204 && Static95.anInt2403 != 0 && local6.anObjectArray9 != null) {
									local515 = new Class2_Sub44();
									local515.aBoolean519 = true;
									local515.aClass16_20 = local6;
									local515.anInt7161 = Static95.anInt2403;
									local515.anObjectArray36 = local6.anObjectArray9;
									Static37.aClass156_54.method3157(local515);
								}
								if (Static336.aClass16_18 != null || Static126.aBoolean52 || local6.anInt252 != Static390.anInt6838 && Static302.anInt4877 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt252 != 0) {
									if (local6.anInt252 == Static129.anInt2329 || local6.anInt252 == Static453.anInt7272) {
										Static388.aClass16_15 = local6;
										if (Static405.aClass157_1 != null) {
											Static405.aClass157_1.method3168(local6.anInt285, Static82.aClass163_1);
										}
										if (local6.anInt252 == Static129.anInt2329) {
											if (!Static126.aBoolean52 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static334.method4465(Static82.aClass163_1, arg9, arg8);
												for (@Pc(598) Class21_Sub4 local598 = (Class21_Sub4) Static313.aClass93_5.method2080(); local598 != null; local598 = (Class21_Sub4) Static313.aClass93_5.method2081()) {
													if (arg8 >= local598.anInt3116 && arg8 < local598.anInt3117 && arg9 >= local598.anInt3115 && arg9 < local598.anInt3119) {
														Static337.method4522();
														Static96.method1499(local598.aClass3_Sub4_Sub1_1);
													}
												}
											}
											Static423.method5346(local17, local6, local22);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt252 == Static336.anInt5713) {
										if (local6.method239(Static82.aClass163_1) == null || Static288.anInt4731 != 0 && Static288.anInt4731 != 3 || Static126.aBoolean52 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray30[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray22[local670]) {
											continue;
										}
										local296 -= local6.anInt294 / 2;
										local670 -= local6.anInt285 / 2;
										if (Static414.anInt6776 == 4) {
											local709 = (int) Static113.aFloat19 & 0x3FFF;
										} else {
											local709 = (int) Static113.aFloat19 + Static363.anInt6120 & 0x3FFF;
										}
										@Pc(721) int local721 = Class155.anIntArray342[local709];
										@Pc(725) int local725 = Class155.anIntArray341[local709];
										if (Static414.anInt6776 != 4) {
											local721 = local721 * (Static454.anInt7274 + 256) >> 8;
											local725 = local725 * (Static454.anInt7274 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static414.anInt6776 == 4) {
											local775 = (Static294.anInt1008 >> 7) + (local754 >> 2);
											local783 = (Static136.anInt2424 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static60.aClass3_Sub4_Sub1_Sub2_1.method4009() - 1) * 64;
											local775 = (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 - local792 >> 7) + (local754 >> 2);
											local783 = (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 - local792 >> 7) - (local764 >> 2);
										}
										if (Static215.aBoolean217 && (Static256.anInt2800 & 0x40) != 0) {
											@Pc(825) Class16 local825 = Static4.method73(Static368.anInt6200, Static368.anInt6201);
											if (local825 == null) {
												Static377.method3604();
											} else {
												Static153.method2190(local775, Static76.aString45, true, Static201.anInt3379, " ->", local6.anInt301, local783, 59, false, 1L);
											}
											continue;
										}
										if (Static118.aClass4_1 == Static270.aClass4_3) {
											Static153.method2190(local775, Static419.aClass134_100.method2720(Static331.anInt5597), true, -1, "", -1, local783, 50, false, 1L);
										}
										Static153.method2190(local775, Static2.aString2, true, Static46.anInt817, "", -1, local783, 10, false, 1L);
										continue;
									}
									if (local6.anInt252 == Static390.anInt6838) {
										Static294.aClass16_5 = local6;
										if (local204) {
											Static77.aBoolean116 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method5382() - local17 - local6.anInt294 / 2) * 2.0D / (double) Static282.aFloat35);
											local670 = (int) -((double) (local263.method5383() - local22 - local6.anInt285 / 2) * 2.0D / (double) Static282.aFloat35);
											local430 = Static379.anInt6865 + local296 + Static282.anInt3479;
											local709 = Static301.anInt3360 + local670 + Static282.anInt3477;
											@Pc(939) Class2_Sub5_Sub15 local939 = Static266.method3609();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method4571(local709, local944, local430);
											if (local944 != null) {
												if (Static218.aClass181_1.method3865(82) && Static440.anInt7085 > 0) {
													Static184.method2530(local944[1], local944[0], local944[2]);
													continue;
												}
												Static415.aBoolean485 = true;
												Static72.anInt1388 = local944[0];
												Static77.anInt1468 = local944[1];
												Static185.anInt3131 = local944[2];
											}
											Static302.anInt4877 = 1;
											Static279.aBoolean458 = false;
											Static143.anInt2549 = Static376.aClass203_1.method4918();
											Static209.anInt3498 = Static376.aClass203_1.method4925();
											continue;
										}
										if (local248 && Static302.anInt4877 > 0) {
											if (Static302.anInt4877 == 1 && (Static143.anInt2549 != Static376.aClass203_1.method4918() || Static209.anInt3498 != Static376.aClass203_1.method4925())) {
												Static184.anInt3124 = Static379.anInt6865;
												Static233.anInt6981 = Static301.anInt3360;
												Static302.anInt4877 = 2;
											}
											if (Static302.anInt4877 == 2) {
												Static279.aBoolean458 = true;
												Static135.method1999(Static184.anInt3124 + (int) ((double) (Static143.anInt2549 - Static376.aClass203_1.method4918()) * 2.0D / (double) Static282.aFloat34));
												Static264.method3522(Static233.anInt6981 - (int) ((double) (Static209.anInt3498 - Static376.aClass203_1.method4925()) * 2.0D / (double) Static282.aFloat34));
											}
											continue;
										}
										if (Static302.anInt4877 > 0 && !Static279.aBoolean458) {
											if ((Static30.anInt587 == 1 || Static242.method3086()) && Static137.anInt6647 > 2) {
												Static283.method3763(Static209.anInt3498, Static143.anInt2549);
											} else if (Static449.method5645()) {
												Static283.method3763(Static209.anInt3498, Static143.anInt2549);
											}
										}
										Static302.anInt4877 = 0;
										continue;
									}
									if (local6.anInt252 == Static219.anInt6121) {
										if (local248) {
											Static242.method3085(local6.anInt294, Static376.aClass203_1.method4925() - local22, local6.anInt285, Static376.aClass203_1.method4918() - local17);
										}
										continue;
									}
									if (local6.anInt252 == Static189.anInt3140) {
										Static339.method4552(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean29 && local258) {
									local6.aBoolean29 = true;
									if (local6.anObjectArray27 != null) {
										local515 = new Class2_Sub44();
										local515.aBoolean519 = true;
										local515.aClass16_20 = local6;
										local515.anInt7160 = local263.method5382() - local17;
										local515.anInt7161 = local263.method5383() - local22;
										local515.anObjectArray36 = local6.anObjectArray27;
										Static37.aClass156_54.method3157(local515);
									}
								}
								if (local6.aBoolean29 && local248 && local6.anObjectArray19 != null) {
									local515 = new Class2_Sub44();
									local515.aBoolean519 = true;
									local515.aClass16_20 = local6;
									local515.anInt7160 = Static376.aClass203_1.method4918() - local17;
									local515.anInt7161 = Static376.aClass203_1.method4925() - local22;
									local515.anObjectArray36 = local6.anObjectArray19;
									Static37.aClass156_54.method3157(local515);
								}
								if (local6.aBoolean29 && !local248) {
									local6.aBoolean29 = false;
									if (local6.anObjectArray15 != null) {
										local515 = new Class2_Sub44();
										local515.aBoolean519 = true;
										local515.aClass16_20 = local6;
										local515.anInt7160 = Static376.aClass203_1.method4918() - local17;
										local515.anInt7161 = Static376.aClass203_1.method4925() - local22;
										local515.anObjectArray36 = local6.anObjectArray15;
										Static154.aClass156_16.method3157(local515);
									}
								}
								if (local248 && local6.anObjectArray30 != null) {
									local515 = new Class2_Sub44();
									local515.aBoolean519 = true;
									local515.aClass16_20 = local6;
									local515.anInt7160 = Static376.aClass203_1.method4918() - local17;
									local515.anInt7161 = Static376.aClass203_1.method4925() - local22;
									local515.anObjectArray36 = local6.anObjectArray30;
									Static37.aClass156_54.method3157(local515);
								}
								if (!local6.aBoolean23 && local204) {
									local6.aBoolean23 = true;
									if (local6.anObjectArray28 != null) {
										local515 = new Class2_Sub44();
										local515.aBoolean519 = true;
										local515.aClass16_20 = local6;
										local515.anInt7160 = Static376.aClass203_1.method4918() - local17;
										local515.anInt7161 = Static376.aClass203_1.method4925() - local22;
										local515.anObjectArray36 = local6.anObjectArray28;
										Static37.aClass156_54.method3157(local515);
									}
								}
								if (local6.aBoolean23 && local204 && local6.anObjectArray25 != null) {
									local515 = new Class2_Sub44();
									local515.aBoolean519 = true;
									local515.aClass16_20 = local6;
									local515.anInt7160 = Static376.aClass203_1.method4918() - local17;
									local515.anInt7161 = Static376.aClass203_1.method4925() - local22;
									local515.anObjectArray36 = local6.anObjectArray25;
									Static37.aClass156_54.method3157(local515);
								}
								if (local6.aBoolean23 && !local204) {
									local6.aBoolean23 = false;
									if (local6.anObjectArray16 != null) {
										local515 = new Class2_Sub44();
										local515.aBoolean519 = true;
										local515.aClass16_20 = local6;
										local515.anInt7160 = Static376.aClass203_1.method4918() - local17;
										local515.anInt7161 = Static376.aClass203_1.method4925() - local22;
										local515.anObjectArray36 = local6.anObjectArray16;
										Static154.aClass156_16.method3157(local515);
									}
								}
								if (local6.anObjectArray3 != null) {
									local515 = new Class2_Sub44();
									local515.aClass16_20 = local6;
									local515.anObjectArray36 = local6.anObjectArray3;
									Static334.aClass156_49.method3157(local515);
								}
								@Pc(1483) Class2_Sub44 local1483;
								if (local6.anObjectArray21 != null && Static327.anInt5554 > local6.anInt272) {
									if (local6.anIntArray27 == null || Static327.anInt5554 - local6.anInt272 > 32) {
										local515 = new Class2_Sub44();
										local515.aClass16_20 = local6;
										local515.anObjectArray36 = local6.anObjectArray21;
										Static37.aClass156_54.method3157(local515);
									} else {
										label678: for (local296 = local6.anInt272; local296 < Static327.anInt5554; local296++) {
											local670 = Static390.anIntArray571[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray27.length; local430++) {
												if (local6.anIntArray27[local430] == local670) {
													local1483 = new Class2_Sub44();
													local1483.aClass16_20 = local6;
													local1483.anObjectArray36 = local6.anObjectArray21;
													Static37.aClass156_54.method3157(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt272 = Static327.anInt5554;
								}
								if (local6.anObjectArray17 != null && Static411.anInt6738 > local6.anInt323) {
									if (local6.anIntArray25 == null || Static411.anInt6738 - local6.anInt323 > 32) {
										local515 = new Class2_Sub44();
										local515.aClass16_20 = local6;
										local515.anObjectArray36 = local6.anObjectArray17;
										Static37.aClass156_54.method3157(local515);
									} else {
										label654: for (local296 = local6.anInt323; local296 < Static411.anInt6738; local296++) {
											local670 = Static307.anIntArray433[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray25.length; local430++) {
												if (local6.anIntArray25[local430] == local670) {
													local1483 = new Class2_Sub44();
													local1483.aClass16_20 = local6;
													local1483.anObjectArray36 = local6.anObjectArray17;
													Static37.aClass156_54.method3157(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt323 = Static411.anInt6738;
								}
								if (local6.anObjectArray24 != null && Static259.anInt4264 > local6.anInt339) {
									if (local6.anIntArray28 == null || Static259.anInt4264 - local6.anInt339 > 32) {
										local515 = new Class2_Sub44();
										local515.aClass16_20 = local6;
										local515.anObjectArray36 = local6.anObjectArray24;
										Static37.aClass156_54.method3157(local515);
									} else {
										label630: for (local296 = local6.anInt339; local296 < Static259.anInt4264; local296++) {
											local670 = Static319.anIntArray477[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray28.length; local430++) {
												if (local6.anIntArray28[local430] == local670) {
													local1483 = new Class2_Sub44();
													local1483.aClass16_20 = local6;
													local1483.anObjectArray36 = local6.anObjectArray24;
													Static37.aClass156_54.method3157(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt339 = Static259.anInt4264;
								}
								if (local6.anObjectArray4 != null && Static246.anInt3975 > local6.anInt318) {
									if (local6.anIntArray29 == null || Static246.anInt3975 - local6.anInt318 > 32) {
										local515 = new Class2_Sub44();
										local515.aClass16_20 = local6;
										local515.anObjectArray36 = local6.anObjectArray4;
										Static37.aClass156_54.method3157(local515);
									} else {
										label606: for (local296 = local6.anInt318; local296 < Static246.anInt3975; local296++) {
											local670 = Static360.anIntArray525[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray29.length; local430++) {
												if (local6.anIntArray29[local430] == local670) {
													local1483 = new Class2_Sub44();
													local1483.aClass16_20 = local6;
													local1483.anObjectArray36 = local6.anObjectArray4;
													Static37.aClass156_54.method3157(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt318 = Static246.anInt3975;
								}
								if (local6.anObjectArray8 != null && Static94.anInt7037 > local6.anInt296) {
									if (local6.anIntArray26 == null || Static94.anInt7037 - local6.anInt296 > 32) {
										local515 = new Class2_Sub44();
										local515.aClass16_20 = local6;
										local515.anObjectArray36 = local6.anObjectArray8;
										Static37.aClass156_54.method3157(local515);
									} else {
										label582: for (local296 = local6.anInt296; local296 < Static94.anInt7037; local296++) {
											local670 = Static83.anIntArray129[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray26.length; local430++) {
												if (local6.anIntArray26[local430] == local670) {
													local1483 = new Class2_Sub44();
													local1483.aClass16_20 = local6;
													local1483.anObjectArray36 = local6.anObjectArray8;
													Static37.aClass156_54.method3157(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt296 = Static94.anInt7037;
								}
								if (Static248.anInt3993 > local6.anInt307 && local6.anObjectArray6 != null) {
									local515 = new Class2_Sub44();
									local515.aClass16_20 = local6;
									local515.anObjectArray36 = local6.anObjectArray6;
									Static37.aClass156_54.method3157(local515);
								}
								if (Static336.anInt5710 > local6.anInt307 && local6.anObjectArray18 != null) {
									local515 = new Class2_Sub44();
									local515.aClass16_20 = local6;
									local515.anObjectArray36 = local6.anObjectArray18;
									Static37.aClass156_54.method3157(local515);
								}
								if (Static393.anInt6470 > local6.anInt307 && local6.anObjectArray11 != null) {
									local515 = new Class2_Sub44();
									local515.aClass16_20 = local6;
									local515.anObjectArray36 = local6.anObjectArray11;
									Static37.aClass156_54.method3157(local515);
								}
								if (Static291.anInt4794 > local6.anInt307 && local6.anObjectArray13 != null) {
									local515 = new Class2_Sub44();
									local515.aClass16_20 = local6;
									local515.anObjectArray36 = local6.anObjectArray13;
									Static37.aClass156_54.method3157(local515);
								}
								if (Static345.anInt5891 > local6.anInt307 && local6.anObjectArray2 != null) {
									local515 = new Class2_Sub44();
									local515.aClass16_20 = local6;
									local515.anObjectArray36 = local6.anObjectArray2;
									Static37.aClass156_54.method3157(local515);
								}
								local6.anInt307 = Static234.anInt3754;
								if (local6.anObjectArray10 != null) {
									for (local296 = 0; local296 < Static380.anInt440; local296++) {
										@Pc(1951) Class2_Sub44 local1951 = new Class2_Sub44();
										local1951.aClass16_20 = local6;
										local1951.anInt7158 = aClass7Array1[local296].method138();
										local1951.anInt7166 = aClass7Array1[local296].method136();
										local1951.anObjectArray36 = local6.anObjectArray10;
										Static37.aClass156_54.method3157(local1951);
									}
								}
								if (Static215.aBoolean218 && local6.anObjectArray14 != null) {
									local515 = new Class2_Sub44();
									local515.aClass16_20 = local6;
									local515.anObjectArray36 = local6.anObjectArray14;
									Static37.aClass156_54.method3157(local515);
								}
							}
							if (local6.anInt298 == 5 && local6.anInt336 != -1) {
								local6.method235(Static91.aClass180_1, Static231.aClass129_1).method3168(local6.anInt285, Static82.aClass163_1);
							}
							Static460.method5494(local6);
							if (local6.anInt298 == 0) {
								method813(arg0, local6.anInt293, local28, local30, local32, local34, local17 - local6.anInt279, local22 - local6.anInt284, arg8, arg9);
								if (local6.aClass16Array1 != null) {
									method813(local6.aClass16Array1, local6.anInt293, local28, local30, local32, local34, local17 - local6.anInt279, local22 - local6.anInt284, arg8, arg9);
								}
								@Pc(2073) Class2_Sub21 local2073 = (Class2_Sub21) Static418.aClass72_44.method1659((long) local6.anInt293);
								if (local2073 != null) {
									if (Static118.aClass4_1 == Static193.aClass4_2 && local2073.anInt2586 == 0 && !Static126.aBoolean52 && local204 && !Static95.aBoolean158) {
										Static337.method4522();
									}
									Static146.method2129(local32, local34, local22, arg9, local28, local17, arg8, local30, local2073.anInt2585);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static460.method5494(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!at;)Lclient!eo;")
	public static Class2_Sub15 method815(@OriginalArg(0) Class16 arg0) {
		@Pc(13) Class2_Sub15 local13 = (Class2_Sub15) Static127.aClass72_14.method1659(((long) arg0.anInt293 << 32) + (long) arg0.anInt320);
		return local13 == null ? arg0.aClass2_Sub15_1 : local13;
	}
}
