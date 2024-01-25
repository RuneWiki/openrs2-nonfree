import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	public static int anInt1454 = 0;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_23 = new Class217(8, 0);

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt1459 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1108() {
		@Pc(1) int local1 = Static160.anInt3271;
		@Pc(3) int[] local3 = Static162.anIntArray212;
		@Pc(11) int local11 = Static310.aBoolean475 ? local1 : local1 + Static54.anInt1472;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class7_Sub2_Sub3 local23;
			if (local13 < local1) {
				local23 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = Static139.aClass7_Sub2_Sub3_Sub1Array11[Static319.anIntArray114[local13 - local1]];
			}
			if (local23.lb >= 0) {
				@Pc(39) int local39 = local23.method3499();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt4318 & 0x7F) == 0 && (local23.anInt4321 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt4318 & 0x7F) == 64 && (local23.anInt4321 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class7_Sub2_Sub3_Sub2 && local23.aClass3_Sub15_3 != null && Static253.anInt4787 >= local23.aClass3_Sub15_3.anInt2333 && Static253.anInt4787 < local23.aClass3_Sub15_3.anInt2340) {
					((Class7_Sub2_Sub3_Sub2) local23).aBoolean382 = false;
				}
				local23.anInt4320 = Static231.method3482(local23.aByte77, local23.anInt4318, local23.anInt4321);
				Static149.method2419(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mq;)Z")
	public static boolean method1110(@OriginalArg(0) Class156 arg0) {
		if (Static63.aBoolean138) {
			if (method1118(arg0).anInt7660 != 0) {
				return false;
			}
			if (arg0.anInt4792 == 0) {
				return false;
			}
		}
		return arg0.aBoolean427;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1112() {
		for (@Pc(1) int local1 = 0; local1 < Static40.anInt1089; local1++) {
			@Pc(6) int[] local6 = Static36.anIntArrayArray7[local1];
			for (@Pc(8) int local8 = 0; local8 < Static44.anInt7276; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1114() {
		@Pc(1) int local1 = Static160.anInt3271;
		@Pc(3) int[] local3 = Static162.anIntArray212;
		@Pc(20) boolean local20 = Static374.aClass20_Sub1_1.anInt2342 == 1 && local1 > 200 || Static374.aClass20_Sub1_1.anInt2342 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class7_Sub2_Sub3_Sub2 local29 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local3[local22]];
			if (local29.method3524()) {
				local29.method3493();
				if (local29.aShort71 >= 0 && local29.aShort73 >= 0 && local29.aShort72 < Static40.anInt1089 && local29.aShort70 < Static44.anInt7276) {
					local29.aBoolean382 = local29.aBoolean378 ? local20 : false;
					if (local29 == Static379.aClass7_Sub2_Sub3_Sub2_2) {
						local29.lb = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean375) {
							local75++;
						}
						if (local29.anInt4344 > Static253.anInt4787) {
							local75 += 2;
						}
						local75 += 5 - local29.method3499() << 2;
						if (local29.aBoolean380) {
							local75 += 512;
						} else {
							if (Static32.anInt941 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.lb = local75 + 1;
					}
				} else {
					local29.lb = -1;
				}
			} else {
				local29.lb = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static54.anInt1472; local116++) {
			@Pc(123) Class7_Sub2_Sub3_Sub1 local123 = Static139.aClass7_Sub2_Sub3_Sub1Array11[Static319.anIntArray114[local116]];
			if (local123.method456() && local123.aClass47_1.method1252(Static85.aClass49_1)) {
				local123.method3493();
				if (local123.aShort71 >= 0 && local123.aShort73 >= 0 && local123.aShort72 < Static40.anInt1089 && local123.aShort70 < Static44.anInt7276) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean375) {
						local160++;
					}
					if (local123.anInt4344 > Static253.anInt4787) {
						local160 += 2;
					}
					local160 += 5 - local123.method3499() << 2;
					if (Static32.anInt941 == 0) {
						if (local123.aClass47_1.aBoolean132) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static32.anInt941 == 1) {
						if (local123.aClass47_1.aBoolean132) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass47_1.aBoolean130) {
						local160 += 1024;
					} else if (!local123.aClass47_1.aBoolean133) {
						local160 += 256;
					}
					local123.lb = local160 + 1;
				} else {
					local123.lb = -1;
				}
			} else {
				local123.lb = -1;
			}
		}
		for (local75 = 0; local75 < Static331.aClass196Array41.length; local75++) {
			@Pc(226) Class196 local226 = Static331.aClass196Array41[local75];
			if (local226 != null) {
				if (local226.anInt5507 == 1) {
					@Pc(237) Class7_Sub2_Sub3_Sub1 local237 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local226.anInt5501];
					if (local237 != null && local237.lb >= 0) {
						local237.lb += 2048;
					}
				} else if (local226.anInt5507 == 10) {
					@Pc(258) Class7_Sub2_Sub3_Sub2 local258 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local226.anInt5501];
					if (local258 != null && local258 != Static379.aClass7_Sub2_Sub3_Sub2_2 && local258.lb >= 0) {
						local258.lb += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mq;)Lclient!wu;")
	public static Class3_Sub45 method1118(@OriginalArg(0) Class156 arg0) {
		@Pc(13) Class3_Sub45 local13 = (Class3_Sub45) Static72.aClass11_11.method324(((long) arg0.anInt4850 << 32) + (long) arg0.anInt4868);
		return local13 == null ? arg0.aClass3_Sub45_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!mq;)Lclient!mq;")
	public static Class156 method1119(@OriginalArg(0) Class156 arg0) {
		@Pc(4) int local4 = method1118(arg0).method5984();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static435.method5705(arg0.anInt4839);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BZLjava/lang/String;Lclient!oa;)V")
	public static void method1120(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(21) int local21 = Static391.aClass70_32.method1752(null, 250, arg1);
		@Pc(38) int local38 = Static391.aClass70_32.method1755(250, null, arg1) * 13;
		Static121.aClass172_3.NA(6, 6, local21 + 4 + 4, local38 + 4 - -4, -16777216, 0);
		Static121.aClass172_3.method5484(6, 6, local21 + 4 + 4, local38 - -4 + 4, -1, 0);
		arg2.method5783(1, 0, null, null, local21, -1, arg1, -1, local38, 0, 10, null, 10);
		Static313.method4344(local21 + 4 + 4, local38 + 4 + 4, 6, 6);
		if (arg0) {
			Static121.aClass172_3.method5515();
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1122(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static160.anInt3271;
		@Pc(3) int[] local3 = Static162.anIntArray212;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static54.anInt1472; local5++) {
			@Pc(15) Class7_Sub2_Sub3 local15;
			if (local5 < local1) {
				local15 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local3[local5]];
			} else {
				local15 = Static139.aClass7_Sub2_Sub3_Sub1Array11[Static319.anIntArray114[local5 - local1]];
			}
			if (local15.aByte77 == arg0 && local15.lb >= 0) {
				@Pc(35) int local35 = local15.method3499();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt4318 & 0x7F) != 0 || (local15.anInt4321 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt4318 & 0x7F) != 64 || (local15.anInt4321 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt4318 >> 7;
					local76 = local15.anInt4321 >> 7;
					if (local15.lb > Static36.anIntArrayArray7[local71][local76]) {
						Static36.anIntArrayArray7[local71][local76] = local15.lb;
						Static210.anIntArrayArray28[local71][local76] = 1;
					} else if (local15.lb == Static36.anIntArrayArray7[local71][local76]) {
						local112 = Static210.anIntArrayArray28[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt4318 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt4321 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt4318 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt4321 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.lb > Static36.anIntArrayArray7[local154][local157]) {
								Static36.anIntArrayArray7[local154][local157] = local15.lb;
								Static210.anIntArrayArray28[local154][local157] = 1;
							} else if (local15.lb == Static36.anIntArrayArray7[local154][local157]) {
								local112 = Static210.anIntArrayArray28[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1123() {
		Static235.anInt4541 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static54.anInt1472; local3++) {
			@Pc(10) Class7_Sub2_Sub3_Sub1 local10 = Static139.aClass7_Sub2_Sub3_Sub1Array11[Static319.anIntArray114[local3]];
			if (local10.aBoolean375 && local10.method3510() != -1) {
				@Pc(28) int local28 = (local10.method3499() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt4318 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt4321 - local28 >> 7;
				@Pc(49) Class7_Sub2_Sub3 local49 = Static321.method4377(local10.aByte77, local35, local42);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt4391;
					if (local49 instanceof Class7_Sub2_Sub3_Sub1) {
						local54 += 2048;
					}
					if (local49.anInt4373 == 0 && local49.method3510() != -1) {
						Static255.anIntArray319[Static235.anInt4541] = local54;
						Static153.anIntArray195[Static235.anInt4541] = local54;
						Static235.anInt4541++;
						local49.anInt4373++;
					}
					Static255.anIntArray319[Static235.anInt4541] = local54;
					Static153.anIntArray195[Static235.anInt4541] = local10.anInt4391 + 2048;
					Static235.anInt4541++;
					local49.anInt4373++;
				}
			}
		}
		Static184.method2936(Static255.anIntArray319, Static153.anIntArray195, Static235.anInt4541 - 1, 0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!mq;IIIIIIIII)V")
	public static void method1124(@OriginalArg(0) Class156[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class156 local6 = arg0[local1];
			if (local6 != null && local6.anInt4839 == arg1) {
				@Pc(17) int local17 = local6.anInt4800 + arg6;
				@Pc(22) int local22 = local6.anInt4806 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt4792 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt4853;
					@Pc(45) int local45 = local22 + local6.anInt4823;
					if (local6.anInt4792 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt4792 == 0 || local6.aBoolean423 || method1118(local6).anInt7660 != 0 || local6 == Static89.aClass156_3 || local6.anInt4794 == Static99.anInt2267) {
					if (!method1110(local6)) {
						if (local6 == Static238.aClass156_9) {
							Static352.aBoolean518 = true;
							Static331.anInt7555 = local17;
							Static261.anInt948 = local22;
						}
						if (local6.aBoolean422 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean418 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class3_Sub31 local148 = (Class3_Sub31) Static221.aClass243_26.method5208(); local148 != null; local148 = (Class3_Sub31) Static221.aClass243_26.method5203()) {
									if (local148.aBoolean441) {
										local148.method5977();
										local148.aClass156_11.aBoolean426 = false;
									}
								}
								if (Static428.anInt7012 == 0) {
									Static238.aClass156_9 = null;
									Static89.aClass156_3 = null;
								}
								Static31.anInt6062 = 0;
								Static133.aBoolean243 = false;
								Static67.aBoolean143 = false;
								if (!Static438.aBoolean636) {
									Static80.method1554();
								}
							}
							@Pc(204) boolean local204;
							if (Static290.aClass100_1.method3218() >= local28 && Static290.aClass100_1.method3213() >= local30 && Static290.aClass100_1.method3218() < local32 && Static290.aClass100_1.method3213() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static446.aBoolean648 && local204) {
								if (local6.anInt4854 >= 0) {
									Static25.anInt849 = local6.anInt4854;
								} else if (local6.aBoolean418) {
									Static25.anInt849 = -1;
								}
							}
							if (!Static438.aBoolean636 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static365.method4813(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(248) boolean local248 = false;
							if (Static290.aClass100_1.method3219() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class3_Sub23 local263 = (Class3_Sub23) Static79.aClass243_34.method5208();
							if (local263 != null && local263.method3478() == 0 && local263.method3475() >= local28 && local263.method3474() >= local30 && local263.method3475() < local32 && local263.method3474() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray58 != null) {
								for (local296 = 0; local296 < local6.aByteArray58.length; local296++) {
									if (Static263.aClass10_1.method301(local6.aByteArray58[local296])) {
										if (local6.anIntArray316 == null || Static253.anInt4787 >= local6.anIntArray316[local296]) {
											@Pc(328) byte local328 = local6.aByteArray57[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static263.aClass10_1.method301(86) && !Static263.aClass10_1.method301(82) && !Static263.aClass10_1.method301(81)) && ((local328 & 0x2) == 0 || Static263.aClass10_1.method301(86)) && ((local328 & 0x1) == 0 || Static263.aClass10_1.method301(82)) && ((local328 & 0x4) == 0 || Static263.aClass10_1.method301(81))) {
												if (local296 < 10) {
													Static132.method2052(local296 + 1, -1, local6.anInt4850, "");
												} else if (local296 == 10) {
													Static70.method1396();
													@Pc(399) Class3_Sub45 local399 = method1118(local6);
													Static104.method1812(local399.method5980(), local399.anInt7653, local6);
													Static189.aString34 = Static337.method4505(local6);
													if (Static189.aString34 == null) {
														Static189.aString34 = "Null";
													}
													Static415.aString62 = local6.aString42 + "<col=ffffff>";
												}
												local430 = local6.anIntArray318[local296];
												if (local6.anIntArray316 == null) {
													local6.anIntArray316 = new int[local6.aByteArray58.length];
												}
												if (local430 == 0) {
													local6.anIntArray316[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray316[local296] = Static253.anInt4787 + local430;
												}
											}
										}
									} else if (local6.anIntArray316 != null) {
										local6.anIntArray316[local296] = 0;
									}
								}
							}
							if (local258) {
								Static213.method3264(local6, local263.method3475() - local17, local263.method3474() - local22);
							}
							if (Static238.aClass156_9 != null && Static238.aClass156_9 != local6 && local204 && method1118(local6).method5987()) {
								Static74.aClass156_2 = local6;
							}
							if (local6 == Static89.aClass156_3) {
								Static337.aBoolean491 = true;
								Static431.anInt6735 = local17;
								Static351.anInt5971 = local22;
							}
							if (local6.aBoolean423 || local6.anInt4794 != 0) {
								@Pc(515) Class3_Sub31 local515;
								if (local204 && Static316.anInt5563 != 0 && local6.anObjectArray18 != null) {
									local515 = new Class3_Sub31();
									local515.aBoolean441 = true;
									local515.aClass156_11 = local6;
									local515.anInt4999 = Static316.anInt5563;
									local515.anObjectArray36 = local6.anObjectArray18;
									Static221.aClass243_26.method5198(local515);
								}
								if (Static238.aClass156_9 != null || Static438.aBoolean636 || local6.anInt4794 != Static143.anInt1880 && Static31.anInt6062 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt4794 != 0) {
									if (local6.anInt4794 == Static311.anInt5509 || local6.anInt4794 == Static46.anInt1170) {
										Static30.aClass156_1 = local6;
										if (Static81.aClass108_4 != null) {
											Static81.aClass108_4.method2716(Static121.aClass172_3, local6.anInt4823);
										}
										if (local6.anInt4794 == Static311.anInt5509) {
											if (!Static438.aBoolean636 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static309.method4309(Static121.aClass172_3, arg9, arg8);
												for (@Pc(598) Class6_Sub6 local598 = (Class6_Sub6) Static399.aClass138_6.method3311(); local598 != null; local598 = (Class6_Sub6) Static399.aClass138_6.method3312()) {
													if (arg8 >= local598.anInt4898 && arg8 < local598.anInt4897 && arg9 >= local598.anInt4895 && arg9 < local598.anInt4896) {
														Static80.method1554();
														Static399.method5156(local598.aClass7_Sub2_Sub3_1);
													}
												}
											}
											Static51.method1056(local17, local6, local22);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt4794 == Static99.anInt2267) {
										if (local6.method3762(Static121.aClass172_3) == null || Static311.anInt5499 != 0 && Static311.anInt5499 != 3 || Static438.aBoolean636 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray315[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray314[local670]) {
											continue;
										}
										local296 -= local6.anInt4853 / 2;
										local670 -= local6.anInt4823 / 2;
										if (Static161.anInt3316 == 4) {
											local709 = (int) Static252.aFloat47 & 0x3FFF;
										} else {
											local709 = (int) Static252.aFloat47 + Static20.anInt696 & 0x3FFF;
										}
										@Pc(721) int local721 = Class3_Sub2_Sub17.anIntArray289[local709];
										@Pc(725) int local725 = Class3_Sub2_Sub17.anIntArray290[local709];
										if (Static161.anInt3316 != 4) {
											local721 = local721 * (Static341.anInt5790 + 256) >> 8;
											local725 = local725 * (Static341.anInt5790 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static161.anInt3316 == 4) {
											local775 = (Static382.anInt1874 >> 7) + (local754 >> 2);
											local783 = (Static422.anInt6891 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static379.aClass7_Sub2_Sub3_Sub2_2.method3499() - 1) * 64;
											local775 = (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 - local792 >> 7) + (local754 >> 2);
											local783 = (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 - local792 >> 7) - (local764 >> 2);
										}
										if (Static446.aBoolean648 && (Static279.anInt4322 & 0x40) != 0) {
											@Pc(825) Class156 local825 = Static109.method1853(Static129.anInt2687, Static213.anInt4082);
											if (local825 == null) {
												Static70.method1396();
											} else {
												Static102.method1792(" ->", 1L, Static141.anInt2928, local783, true, Static189.aString34, false, local775, local6.anInt4826, 46);
											}
											continue;
										}
										if (Static57.aClass183_3 == Static297.aClass183_4) {
											Static102.method1792("", 1L, -1, local783, true, Static126.aClass189_85.method4262(anInt1454), false, local775, -1, 59);
										}
										Static102.method1792("", 1L, Static437.anInt7362, local783, true, Static204.aString23, false, local775, -1, 16);
										continue;
									}
									if (local6.anInt4794 == Static143.anInt1880) {
										Static443.aClass156_8 = local6;
										if (local204) {
											Static133.aBoolean243 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method3475() - local17 - local6.anInt4853 / 2) * 2.0D / (double) Static144.aFloat59);
											local670 = (int) -((double) (local263.method3474() - local22 - local6.anInt4823 / 2) * 2.0D / (double) Static144.aFloat59);
											local430 = Static411.anInt6760 + local296 + Static144.anInt5410;
											local709 = Static76.anInt1937 + local670 + Static144.anInt5420;
											@Pc(939) Class3_Sub4_Sub8 local939 = Static51.method1058();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method1742(local944, local709, local430);
											if (local944 != null) {
												if (Static263.aClass10_1.method301(82) && Static190.anInt3803 > 0) {
													Static399.method5127(local944[1], local944[2], local944[0]);
													continue;
												}
												Static67.aBoolean143 = true;
												Static416.anInt6831 = local944[0];
												Static195.anInt3897 = local944[1];
												Static214.anInt4101 = local944[2];
											}
											Static31.anInt6062 = 1;
											Static130.aBoolean368 = false;
											Static123.anInt2620 = Static290.aClass100_1.method3218();
											Static371.anInt6244 = Static290.aClass100_1.method3213();
											continue;
										}
										if (local248 && Static31.anInt6062 > 0) {
											if (Static31.anInt6062 == 1 && (Static123.anInt2620 != Static290.aClass100_1.method3218() || Static371.anInt6244 != Static290.aClass100_1.method3213())) {
												Static302.anInt5405 = Static411.anInt6760;
												Static235.anInt4540 = Static76.anInt1937;
												Static31.anInt6062 = 2;
											}
											if (Static31.anInt6062 == 2) {
												Static130.aBoolean368 = true;
												Static110.method1878(Static302.anInt5405 + (int) ((double) (Static123.anInt2620 - Static290.aClass100_1.method3218()) * 2.0D / (double) Static144.aFloat58));
												Static160.method2647(Static235.anInt4540 - (int) ((double) (Static371.anInt6244 - Static290.aClass100_1.method3213()) * 2.0D / (double) Static144.aFloat58));
											}
											continue;
										}
										if (Static31.anInt6062 > 0 && !Static130.aBoolean368) {
											if ((Static216.anInt4119 == 1 || Static21.method469()) && Static158.anInt3162 > 2) {
												Static235.method3585(Static123.anInt2620, Static371.anInt6244);
											} else if (Static324.method5976()) {
												Static235.method3585(Static123.anInt2620, Static371.anInt6244);
											}
										}
										Static31.anInt6062 = 0;
										continue;
									}
									if (local6.anInt4794 == Static423.anInt6893) {
										if (local248) {
											Static187.method2990(local6.anInt4823, Static290.aClass100_1.method3213() - local22, Static290.aClass100_1.method3218() - local17, local6.anInt4853);
										}
										continue;
									}
									if (local6.anInt4794 == Static377.anInt6352) {
										Static261.method660(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean414 && local258) {
									local6.aBoolean414 = true;
									if (local6.anObjectArray34 != null) {
										local515 = new Class3_Sub31();
										local515.aBoolean441 = true;
										local515.aClass156_11 = local6;
										local515.anInt5003 = local263.method3475() - local17;
										local515.anInt4999 = local263.method3474() - local22;
										local515.anObjectArray36 = local6.anObjectArray34;
										Static221.aClass243_26.method5198(local515);
									}
								}
								if (local6.aBoolean414 && local248 && local6.anObjectArray24 != null) {
									local515 = new Class3_Sub31();
									local515.aBoolean441 = true;
									local515.aClass156_11 = local6;
									local515.anInt5003 = Static290.aClass100_1.method3218() - local17;
									local515.anInt4999 = Static290.aClass100_1.method3213() - local22;
									local515.anObjectArray36 = local6.anObjectArray24;
									Static221.aClass243_26.method5198(local515);
								}
								if (local6.aBoolean414 && !local248) {
									local6.aBoolean414 = false;
									if (local6.anObjectArray22 != null) {
										local515 = new Class3_Sub31();
										local515.aBoolean441 = true;
										local515.aClass156_11 = local6;
										local515.anInt5003 = Static290.aClass100_1.method3218() - local17;
										local515.anInt4999 = Static290.aClass100_1.method3213() - local22;
										local515.anObjectArray36 = local6.anObjectArray22;
										Static165.aClass243_20.method5198(local515);
									}
								}
								if (local248 && local6.anObjectArray14 != null) {
									local515 = new Class3_Sub31();
									local515.aBoolean441 = true;
									local515.aClass156_11 = local6;
									local515.anInt5003 = Static290.aClass100_1.method3218() - local17;
									local515.anInt4999 = Static290.aClass100_1.method3213() - local22;
									local515.anObjectArray36 = local6.anObjectArray14;
									Static221.aClass243_26.method5198(local515);
								}
								if (!local6.aBoolean426 && local204) {
									local6.aBoolean426 = true;
									if (local6.anObjectArray16 != null) {
										local515 = new Class3_Sub31();
										local515.aBoolean441 = true;
										local515.aClass156_11 = local6;
										local515.anInt5003 = Static290.aClass100_1.method3218() - local17;
										local515.anInt4999 = Static290.aClass100_1.method3213() - local22;
										local515.anObjectArray36 = local6.anObjectArray16;
										Static221.aClass243_26.method5198(local515);
									}
								}
								if (local6.aBoolean426 && local204 && local6.anObjectArray28 != null) {
									local515 = new Class3_Sub31();
									local515.aBoolean441 = true;
									local515.aClass156_11 = local6;
									local515.anInt5003 = Static290.aClass100_1.method3218() - local17;
									local515.anInt4999 = Static290.aClass100_1.method3213() - local22;
									local515.anObjectArray36 = local6.anObjectArray28;
									Static221.aClass243_26.method5198(local515);
								}
								if (local6.aBoolean426 && !local204) {
									local6.aBoolean426 = false;
									if (local6.anObjectArray19 != null) {
										local515 = new Class3_Sub31();
										local515.aBoolean441 = true;
										local515.aClass156_11 = local6;
										local515.anInt5003 = Static290.aClass100_1.method3218() - local17;
										local515.anInt4999 = Static290.aClass100_1.method3213() - local22;
										local515.anObjectArray36 = local6.anObjectArray19;
										Static165.aClass243_20.method5198(local515);
									}
								}
								if (local6.anObjectArray30 != null) {
									local515 = new Class3_Sub31();
									local515.aClass156_11 = local6;
									local515.anObjectArray36 = local6.anObjectArray30;
									Static196.aClass243_22.method5198(local515);
								}
								@Pc(1483) Class3_Sub31 local1483;
								if (local6.anObjectArray23 != null && Static401.anInt6641 > local6.anInt4808) {
									if (local6.anIntArray317 == null || Static401.anInt6641 - local6.anInt4808 > 32) {
										local515 = new Class3_Sub31();
										local515.aClass156_11 = local6;
										local515.anObjectArray36 = local6.anObjectArray23;
										Static221.aClass243_26.method5198(local515);
									} else {
										label678: for (local296 = local6.anInt4808; local296 < Static401.anInt6641; local296++) {
											local670 = Static42.anIntArray78[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray317.length; local430++) {
												if (local6.anIntArray317[local430] == local670) {
													local1483 = new Class3_Sub31();
													local1483.aClass156_11 = local6;
													local1483.anObjectArray36 = local6.anObjectArray23;
													Static221.aClass243_26.method5198(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt4808 = Static401.anInt6641;
								}
								if (local6.anObjectArray7 != null && Static195.anInt3896 > local6.anInt4820) {
									if (local6.anIntArray309 == null || Static195.anInt3896 - local6.anInt4820 > 32) {
										local515 = new Class3_Sub31();
										local515.aClass156_11 = local6;
										local515.anObjectArray36 = local6.anObjectArray7;
										Static221.aClass243_26.method5198(local515);
									} else {
										label654: for (local296 = local6.anInt4820; local296 < Static195.anInt3896; local296++) {
											local670 = Static65.anIntArray97[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray309.length; local430++) {
												if (local6.anIntArray309[local430] == local670) {
													local1483 = new Class3_Sub31();
													local1483.aClass156_11 = local6;
													local1483.anObjectArray36 = local6.anObjectArray7;
													Static221.aClass243_26.method5198(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt4820 = Static195.anInt3896;
								}
								if (local6.anObjectArray5 != null && Static104.anInt2366 > local6.anInt4856) {
									if (local6.anIntArray312 == null || Static104.anInt2366 - local6.anInt4856 > 32) {
										local515 = new Class3_Sub31();
										local515.aClass156_11 = local6;
										local515.anObjectArray36 = local6.anObjectArray5;
										Static221.aClass243_26.method5198(local515);
									} else {
										label630: for (local296 = local6.anInt4856; local296 < Static104.anInt2366; local296++) {
											local670 = Static253.anIntArray308[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray312.length; local430++) {
												if (local6.anIntArray312[local430] == local670) {
													local1483 = new Class3_Sub31();
													local1483.aClass156_11 = local6;
													local1483.anObjectArray36 = local6.anObjectArray5;
													Static221.aClass243_26.method5198(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt4856 = Static104.anInt2366;
								}
								if (local6.anObjectArray21 != null && Static70.anInt1787 > local6.anInt4848) {
									if (local6.anIntArray310 == null || Static70.anInt1787 - local6.anInt4848 > 32) {
										local515 = new Class3_Sub31();
										local515.aClass156_11 = local6;
										local515.anObjectArray36 = local6.anObjectArray21;
										Static221.aClass243_26.method5198(local515);
									} else {
										label606: for (local296 = local6.anInt4848; local296 < Static70.anInt1787; local296++) {
											local670 = Static27.anIntArray139[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray310.length; local430++) {
												if (local6.anIntArray310[local430] == local670) {
													local1483 = new Class3_Sub31();
													local1483.aClass156_11 = local6;
													local1483.anObjectArray36 = local6.anObjectArray21;
													Static221.aClass243_26.method5198(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt4848 = Static70.anInt1787;
								}
								if (local6.anObjectArray27 != null && Static432.anInt7225 > local6.anInt4879) {
									if (local6.anIntArray311 == null || Static432.anInt7225 - local6.anInt4879 > 32) {
										local515 = new Class3_Sub31();
										local515.aClass156_11 = local6;
										local515.anObjectArray36 = local6.anObjectArray27;
										Static221.aClass243_26.method5198(local515);
									} else {
										label582: for (local296 = local6.anInt4879; local296 < Static432.anInt7225; local296++) {
											local670 = Static235.anIntArray295[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray311.length; local430++) {
												if (local6.anIntArray311[local430] == local670) {
													local1483 = new Class3_Sub31();
													local1483.aClass156_11 = local6;
													local1483.anObjectArray36 = local6.anObjectArray27;
													Static221.aClass243_26.method5198(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt4879 = Static432.anInt7225;
								}
								if (Static66.anInt1703 > local6.anInt4814 && local6.anObjectArray8 != null) {
									local515 = new Class3_Sub31();
									local515.aClass156_11 = local6;
									local515.anObjectArray36 = local6.anObjectArray8;
									Static221.aClass243_26.method5198(local515);
								}
								if (Static161.anInt3318 > local6.anInt4814 && local6.anObjectArray17 != null) {
									local515 = new Class3_Sub31();
									local515.aClass156_11 = local6;
									local515.anObjectArray36 = local6.anObjectArray17;
									Static221.aClass243_26.method5198(local515);
								}
								if (Static160.anInt3269 > local6.anInt4814 && local6.anObjectArray20 != null) {
									local515 = new Class3_Sub31();
									local515.aClass156_11 = local6;
									local515.anObjectArray36 = local6.anObjectArray20;
									Static221.aClass243_26.method5198(local515);
								}
								if (Static308.anInt5473 > local6.anInt4814 && local6.anObjectArray26 != null) {
									local515 = new Class3_Sub31();
									local515.aClass156_11 = local6;
									local515.anObjectArray36 = local6.anObjectArray26;
									Static221.aClass243_26.method5198(local515);
								}
								if (Static355.anInt6052 > local6.anInt4814 && local6.anObjectArray33 != null) {
									local515 = new Class3_Sub31();
									local515.aClass156_11 = local6;
									local515.anObjectArray36 = local6.anObjectArray33;
									Static221.aClass243_26.method5198(local515);
								}
								local6.anInt4814 = Static301.anInt2459;
								if (local6.anObjectArray29 != null) {
									for (local296 = 0; local296 < Static43.anInt1138; local296++) {
										@Pc(1951) Class3_Sub31 local1951 = new Class3_Sub31();
										local1951.aClass156_11 = local6;
										local1951.anInt5001 = Static188.aClass60Array1[local296].method3174();
										local1951.anInt5000 = Static188.aClass60Array1[local296].method3179();
										local1951.anObjectArray36 = local6.anObjectArray29;
										Static221.aClass243_26.method5198(local1951);
									}
								}
								if (Static454.aBoolean658 && local6.anObjectArray15 != null) {
									local515 = new Class3_Sub31();
									local515.aClass156_11 = local6;
									local515.anObjectArray36 = local6.anObjectArray15;
									Static221.aClass243_26.method5198(local515);
								}
							}
							if (local6.anInt4792 == 5 && local6.anInt4805 != -1) {
								local6.method3767(Static353.aClass212_1, Static212.aClass184_1).method2716(Static121.aClass172_3, local6.anInt4823);
							}
							Static421.method5380(local6);
							if (local6.anInt4792 == 0) {
								method1124(arg0, local6.anInt4850, local28, local30, local32, local34, local17 - local6.anInt4821, local22 - local6.anInt4801, arg8, arg9);
								if (local6.aClass156Array2 != null) {
									method1124(local6.aClass156Array2, local6.anInt4850, local28, local30, local32, local34, local17 - local6.anInt4821, local22 - local6.anInt4801, arg8, arg9);
								}
								@Pc(2073) Class3_Sub9 local2073 = (Class3_Sub9) Static318.aClass11_42.method324((long) local6.anInt4850);
								if (local2073 != null) {
									if (Static57.aClass183_3 == Static300.aClass183_5 && local2073.anInt1803 == 0 && !Static438.aBoolean636 && local204 && !Static63.aBoolean138) {
										Static80.method1554();
									}
									Static325.method4386(local30, local17, local22, arg8, local34, local2073.anInt1804, local28, local32, arg9);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static421.method5380(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1125(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static160.anInt3271;
		@Pc(3) int[] local3 = Static162.anIntArray212;
		@Pc(11) int local11 = Static310.aBoolean475 ? local1 : local1 + Static54.anInt1472;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class7_Sub2_Sub3 local23;
			if (local13 < local1) {
				local23 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = Static139.aClass7_Sub2_Sub3_Sub1Array11[Static319.anIntArray114[local13 - local1]];
			}
			if (local23.aByte77 == arg0) {
				local23.anInt4373 = 0;
				if (local23.lb < 0) {
					local23.aBoolean375 = false;
				} else {
					@Pc(50) int local50 = local23.method3499();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt4318 & 0x7F) != 0 || (local23.anInt4321 & 0x7F) != 0) {
							local23.aBoolean375 = false;
							continue;
						}
					} else if ((local23.anInt4318 & 0x7F) != 64 || (local23.anInt4321 & 0x7F) != 64) {
						local23.aBoolean375 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt4318 >> 7;
						local97 = local23.anInt4321 >> 7;
						if (local23.lb != Static36.anIntArrayArray7[local92][local97]) {
							local23.aBoolean375 = true;
							continue;
						}
						if (Static210.anIntArrayArray28[local92][local97] > 1) {
							local122 = Static210.anIntArrayArray28[local92][local97]--;
							local23.aBoolean375 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt4318 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt4321 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt4318 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt4321 + local92 >> 7;
						if (!Static128.method2016(local97, local23.lb, local158, local151, local165)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.lb == Static36.anIntArrayArray7[local176][local179]) {
										local122 = Static210.anIntArrayArray28[local176][local179]--;
									}
								}
							}
							local23.aBoolean375 = true;
							continue;
						}
					}
					if (local23 instanceof Class7_Sub2_Sub3_Sub2 && local23.aClass3_Sub15_3 != null && Static253.anInt4787 >= local23.aClass3_Sub15_3.anInt2333 && Static253.anInt4787 < local23.aClass3_Sub15_3.anInt2340) {
						((Class7_Sub2_Sub3_Sub2) local23).aBoolean382 = false;
					}
					local23.aBoolean375 = false;
					local23.anInt4320 = Static231.method3482(local23.aByte77, local23.anInt4318, local23.anInt4321);
					Static149.method2419(local23, true);
				}
			}
		}
	}
}
