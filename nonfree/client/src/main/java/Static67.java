import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jq;)Lclient!jq;")
	public static Class156 method1226(@OriginalArg(0) Class156 arg0) {
		@Pc(4) int local4 = method1228(arg0).method2100();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static182.method2888(arg0.anInt4686);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!jq;)Lclient!f;")
	public static Class1_Sub15 method1228(@OriginalArg(0) Class156 arg0) {
		@Pc(13) Class1_Sub15 local13 = (Class1_Sub15) Static528.aClass17_40.method738(((long) arg0.anInt4677 << 32) + (long) arg0.anInt4723);
		return local13 == null ? arg0.aClass1_Sub15_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	public static void method1229() {
		Static215.anInt4126 = -1;
		Static55.aBoolean70 = false;
		Static38.anInt834 = -1;
		Static351.aClass171_102 = null;
		Static101.anInt7625 = 0;
		Static101.anInt7631 = 2;
		Static302.anInt5579 = 1;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1230() {
		@Pc(1) int local1 = Static190.anInt3385;
		@Pc(3) int[] local3 = Static502.anIntArray771;
		@Pc(20) boolean local20 = Static544.aClass1_Sub22_Sub1_1.anInt5449 == 1 && local1 > 200 || Static544.aClass1_Sub22_Sub1_1.anInt5449 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class49_Sub2_Sub2_Sub1 local29 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local3[local22]];
			if (local29.method1537()) {
				local29.method5992();
				if (local29.aShort117 >= 0 && local29.aShort116 >= 0 && local29.aShort115 < Static459.anInt7799 && local29.aShort118 < Static482.anInt7990) {
					local29.aBoolean110 = local29.aBoolean306 ? local20 : false;
					if (local29 == Static63.aClass49_Sub2_Sub2_Sub1_1) {
						local29.anInt4277 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean304) {
							local75++;
						}
						if (local29.anInt4279 > Static436.anInt6850) {
							local75 += 2;
						}
						local75 += 5 - local29.method3788() << 2;
						if (local29.aBoolean111) {
							local75 += 512;
						} else {
							if (Static16.anInt422 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt4277 = local75 + 1;
					}
				} else {
					local29.anInt4277 = -1;
				}
			} else {
				local29.anInt4277 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static157.anInt4503; local116++) {
			@Pc(127) Class49_Sub2_Sub2_Sub2 local127 = ((Class1_Sub17) Static380.aClass17_29.method738((long) Static427.anIntArray711[local116])).aClass49_Sub2_Sub2_Sub2_2;
			if (local127.method3803() && local127.aClass196_1.method4860(Static251.aClass119_1)) {
				local127.method5992();
				if (local127.aShort117 >= 0 && local127.aShort116 >= 0 && local127.aShort115 < Static459.anInt7799 && local127.aShort118 < Static482.anInt7990) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean304) {
						local164++;
					}
					if (local127.anInt4279 > Static436.anInt6850) {
						local164 += 2;
					}
					local164 += 5 - local127.method3788() << 2;
					if (Static16.anInt422 == 0) {
						if (local127.aClass196_1.aBoolean412) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static16.anInt422 == 1) {
						if (local127.aClass196_1.aBoolean412) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass196_1.aBoolean414) {
						local164 += 1024;
					} else if (!local127.aClass196_1.aBoolean413) {
						local164 += 256;
					}
					local127.anInt4277 = local164 + 1;
				} else {
					local127.anInt4277 = -1;
				}
			} else {
				local127.anInt4277 = -1;
			}
		}
		for (local75 = 0; local75 < Static384.aClass268Array1.length; local75++) {
			@Pc(230) Class268 local230 = Static384.aClass268Array1[local75];
			if (local230 != null) {
				if (local230.anInt7597 == 1) {
					@Pc(244) Class1_Sub17 local244 = (Class1_Sub17) Static380.aClass17_29.method738((long) local230.anInt7595);
					if (local244 != null) {
						@Pc(249) Class49_Sub2_Sub2_Sub2 local249 = local244.aClass49_Sub2_Sub2_Sub2_2;
						if (local249.anInt4277 >= 0) {
							local249.anInt4277 += 2048;
						}
					}
				} else if (local230.anInt7597 == 10) {
					@Pc(268) Class49_Sub2_Sub2_Sub1 local268 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local230.anInt7595];
					if (local268 != null && local268 != Static63.aClass49_Sub2_Sub2_Sub1_1 && local268.anInt4277 >= 0) {
						local268.anInt4277 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1231(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static190.anInt3385;
		@Pc(3) int[] local3 = Static502.anIntArray771;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static157.anInt4503; local5++) {
			@Pc(15) Class49_Sub2_Sub2 local15;
			if (local5 < local1) {
				local15 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class1_Sub17) Static380.aClass17_29.method738((long) Static427.anIntArray711[local5 - local1])).aClass49_Sub2_Sub2_Sub2_2;
			}
			if (local15.aByte98 == arg0 && local15.anInt4277 >= 0) {
				@Pc(39) int local39 = local15.method3788();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt7137 & 0x1FF) != 0 || (local15.anInt7141 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt7137 & 0x1FF) != 256 || (local15.anInt7141 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt7137 >> 9;
					local80 = local15.anInt7141 >> 9;
					if (local15.anInt4277 > Static73.anIntArrayArray18[local75][local80]) {
						Static73.anIntArrayArray18[local75][local80] = local15.anInt4277;
						Static336.anIntArrayArray79[local75][local80] = 1;
					} else if (local15.anInt4277 == Static73.anIntArrayArray18[local75][local80]) {
						local116 = Static336.anIntArrayArray79[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt7137 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt7141 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt7137 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt7141 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt4277 > Static73.anIntArrayArray18[local158][local161]) {
								Static73.anIntArrayArray18[local158][local161] = local15.anInt4277;
								Static336.anIntArrayArray79[local158][local161] = 1;
							} else if (local15.anInt4277 == Static73.anIntArrayArray18[local158][local161]) {
								local116 = Static336.anIntArrayArray79[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!jq;IIIIIIIII)V")
	public static void method1233(@OriginalArg(0) Class156[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class156 local6 = arg0[local1];
			if (local6 != null && local6.anInt4686 == arg1) {
				@Pc(17) int local17 = local6.anInt4734 + arg6;
				@Pc(22) int local22 = local6.anInt4702 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt4735 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt4732;
					@Pc(45) int local45 = local22 + local6.anInt4673;
					if (local6.anInt4735 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt4735 == 0 || local6.aBoolean329 || method1228(local6).anInt2505 != 0 || local6 == Static197.aClass156_16 || local6.anInt4729 == Static108.anInt2197) {
					if (!method1236(local6)) {
						if (local6 == Static86.aClass156_4 && Static110.method1888(Static86.aClass156_4) != null) {
							Static261.aBoolean148 = true;
							Static457.anInt7786 = local17;
							Static193.anInt7225 = local22;
						}
						if (local6.aBoolean330 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean321 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class1_Sub30 local152 = (Class1_Sub30) Static90.aClass37_21.method977(); local152 != null; local152 = (Class1_Sub30) Static90.aClass37_21.method971()) {
									if (local152.aBoolean374) {
										local152.method7525();
										local152.aClass156_11.aBoolean322 = false;
									}
								}
								if (Static412.anInt6618 == 0) {
									Static86.aClass156_4 = null;
									Static197.aClass156_16 = null;
								}
								Static315.anInt5797 = 0;
								Static533.aBoolean629 = false;
								Static501.aBoolean604 = false;
								if (!Static15.aBoolean16) {
									Static324.method5028();
								}
							}
							@Pc(208) boolean local208;
							if (Static498.aClass5_1.method7052() >= local28 && Static498.aClass5_1.method7042() >= local30 && Static498.aClass5_1.method7052() < local32 && Static498.aClass5_1.method7042() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static431.aBoolean542 && local208) {
								if (local6.anInt4646 >= 0) {
									Static108.anInt2198 = local6.anInt4646;
								} else if (local6.aBoolean321) {
									Static108.anInt2198 = -1;
								}
							}
							if (!Static15.aBoolean16 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static73.method1280(local6, arg9 - local22, arg8 - local17);
							}
							@Pc(252) boolean local252 = false;
							if (Static498.aClass5_1.method7044() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class1_Sub13 local267 = (Class1_Sub13) Static22.aClass37_50.method977();
							if (local267 != null && local267.method5739() == 0 && local267.method5737() >= local28 && local267.method5742() >= local30 && local267.method5737() < local32 && local267.method5742() < local34) {
								local262 = true;
							}
							@Pc(300) int local300;
							@Pc(434) int local434;
							if (local6.aByteArray69 != null) {
								for (local300 = 0; local300 < local6.aByteArray69.length; local300++) {
									if (Static149.aClass66_1.method1582(local6.aByteArray69[local300])) {
										if (local6.anIntArray453 == null || Static436.anInt6850 >= local6.anIntArray453[local300]) {
											@Pc(332) byte local332 = local6.aByteArray68[local300];
											if (local332 == 0 || ((local332 & 0x8) == 0 || !Static149.aClass66_1.method1582(86) && !Static149.aClass66_1.method1582(82) && !Static149.aClass66_1.method1582(81)) && ((local332 & 0x2) == 0 || Static149.aClass66_1.method1582(86)) && ((local332 & 0x1) == 0 || Static149.aClass66_1.method1582(82)) && ((local332 & 0x4) == 0 || Static149.aClass66_1.method1582(81))) {
												if (local300 < 10) {
													Static362.method5401(local300 + 1, -1, local6.anInt4677, "");
												} else if (local300 == 10) {
													Static387.method5882();
													@Pc(403) Class1_Sub15 local403 = method1228(local6);
													Static53.method1033(local403.anInt2504, local403.method2103(), local6);
													Static238.aString58 = Static112.method1909(local6);
													if (Static238.aString58 == null) {
														Static238.aString58 = "Null";
													}
													Static170.aString32 = local6.aString44 + "<col=ffffff>";
												}
												local434 = local6.anIntArray449[local300];
												if (local6.anIntArray453 == null) {
													local6.anIntArray453 = new int[local6.aByteArray69.length];
												}
												if (local434 == 0) {
													local6.anIntArray453[local300] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray453[local300] = Static436.anInt6850 + local434;
												}
											}
										}
									} else if (local6.anIntArray453 != null) {
										local6.anIntArray453[local300] = 0;
									}
								}
							}
							if (local262) {
								Static317.method4943(local267.method5742() - local22, local267.method5737() - local17, local6);
							}
							if (Static86.aClass156_4 != null && Static86.aClass156_4 != local6 && local208 && method1228(local6).method2104()) {
								Static59.aClass156_2 = local6;
							}
							if (local6 == Static197.aClass156_16) {
								Static206.aBoolean286 = true;
								Static45.anInt917 = local17;
								Static293.anInt5490 = local22;
							}
							if (local6.aBoolean329 || local6.anInt4729 != 0) {
								@Pc(519) Class1_Sub30 local519;
								if (local208 && Static168.anInt5448 != 0 && local6.anObjectArray30 != null) {
									local519 = new Class1_Sub30();
									local519.aBoolean374 = true;
									local519.aClass156_11 = local6;
									local519.anInt5301 = Static168.anInt5448;
									local519.anObjectArray36 = local6.anObjectArray30;
									Static90.aClass37_21.method970(local519);
								}
								if (Static86.aClass156_4 != null || Static15.aBoolean16 || local6.anInt4729 != Static98.anInt8158 && Static315.anInt5797 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(674) int local674;
								if (local6.anInt4729 != 0) {
									if (local6.anInt4729 == Static480.anInt7980 || local6.anInt4729 == Static477.anInt7963) {
										Static31.aClass156_1 = local6;
										if (Static40.aClass117_1 != null) {
											Static40.aClass117_1.method2620(local6.anInt4673, Static513.aClass122_10);
										}
										if (local6.anInt4729 == Static480.anInt7980) {
											if (!Static15.aBoolean16 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static80.method1376(arg9, arg8, Static513.aClass122_10);
												for (@Pc(602) Class72_Sub3 local602 = (Class72_Sub3) Static272.aClass299_5.method7030(); local602 != null; local602 = (Class72_Sub3) Static272.aClass299_5.method7031()) {
													if (arg8 >= local602.anInt2937 && arg8 < local602.anInt2942 && arg9 >= local602.anInt2943 && arg9 < local602.anInt2940) {
														Static324.method5028();
														Static494.method6738(local602.aClass49_Sub2_Sub2_1);
													}
												}
											}
											Static281.method4559(local22, local17, local6);
											continue;
										}
									}
									@Pc(713) int local713;
									if (local6.anInt4729 == Static108.anInt2197) {
										if (local6.method4057(Static513.aClass122_10) == null || Static329.anInt5977 != 0 && Static329.anInt5977 != 3 || Static15.aBoolean16 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local300 = arg8 - local17;
										local674 = arg9 - local22;
										local434 = local6.anIntArray454[local674];
										if (local300 < local434 || local300 > local434 + local6.anIntArray450[local674]) {
											continue;
										}
										local300 -= local6.anInt4732 / 2;
										local674 -= local6.anInt4673 / 2;
										if (Static448.anInt7701 == 4) {
											local713 = (int) Static404.aFloat156 & 0x3FFF;
										} else {
											local713 = (int) Static404.aFloat156 + Static265.anInt5084 & 0x3FFF;
										}
										@Pc(725) int local725 = Class310.anIntArray827[local713];
										@Pc(729) int local729 = Class310.anIntArray826[local713];
										if (Static448.anInt7701 != 4) {
											local725 = local725 * (Static316.anInt5814 + 256) >> 8;
											local729 = local729 * (Static316.anInt5814 + 256) >> 8;
										}
										@Pc(758) int local758 = local674 * local725 + local300 * local729 >> 14;
										@Pc(768) int local768 = local674 * local729 - local300 * local725 >> 14;
										@Pc(779) int local779;
										@Pc(787) int local787;
										if (Static448.anInt7701 == 4) {
											local779 = (Static308.anInt5706 >> 9) + (local758 >> 2);
											local787 = (Static88.anInt1782 >> 9) - (local768 >> 2);
										} else {
											@Pc(796) int local796 = (Static63.aClass49_Sub2_Sub2_Sub1_1.method3788() - 1) * 256;
											local779 = (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 - local796 >> 9) + (local758 >> 2);
											local787 = (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 - local796 >> 9) - (local768 >> 2);
										}
										if (Static431.aBoolean542 && (Static276.anInt9030 & 0x40) != 0) {
											@Pc(829) Class156 local829 = Static518.method7135(Static379.anInt8819, Static48.anInt942);
											if (local829 == null) {
												Static387.method5882();
											} else {
												Static13.method390(1L, local787, " ->", local779, 30, Static238.aString58, local6.anInt4697, true, false, Static222.anInt4414);
											}
											continue;
										}
										if (Static304.aClass101_1 == Static542.aClass101_4) {
											Static13.method390(1L, local787, "", local779, 47, Static477.aClass306_120.method7165(Static179.anInt3168), -1, true, false, -1);
										}
										Static13.method390(1L, local787, "", local779, 50, Static485.aString75, -1, true, false, Static460.anInt7804);
										continue;
									}
									if (local6.anInt4729 == Static98.anInt8158) {
										Static287.aClass156_13 = local6;
										if (local208) {
											Static533.aBoolean629 = true;
										}
										if (local262) {
											local300 = (int) ((double) (local267.method5737() - local17 - local6.anInt4732 / 2) * 2.0D / (double) Static118.aFloat10);
											local674 = (int) -((double) (local267.method5742() - local22 - local6.anInt4673 / 2) * 2.0D / (double) Static118.aFloat10);
											local434 = Static103.anInt2070 + local300 + Static118.anInt815;
											local713 = Static214.anInt2191 + local674 + Static118.anInt813;
											@Pc(943) Class1_Sub1_Sub5 local943 = Static437.method6313();
											if (local943 == null) {
												continue;
											}
											@Pc(948) int[] local948 = new int[3];
											local943.method2661(local434, local713, local948);
											if (local948 != null) {
												if (Static149.aClass66_1.method1582(82) && Static313.anInt5785 > 0) {
													Static105.method1783(local948[1], local948[2], local948[0]);
													continue;
												}
												Static501.aBoolean604 = true;
												Static282.anInt7767 = local948[0];
												Static58.anInt1129 = local948[1];
												Static87.anInt1622 = local948[2];
											}
											Static315.anInt5797 = 1;
											Static233.aBoolean319 = false;
											Static321.anInt5867 = Static498.aClass5_1.method7052();
											Static127.anInt4394 = Static498.aClass5_1.method7042();
											continue;
										}
										if (local252 && Static315.anInt5797 > 0) {
											if (Static315.anInt5797 == 1 && (Static321.anInt5867 != Static498.aClass5_1.method7052() || Static127.anInt4394 != Static498.aClass5_1.method7042())) {
												Static377.anInt6885 = Static103.anInt2070;
												Static357.anInt6305 = Static214.anInt2191;
												Static315.anInt5797 = 2;
											}
											if (Static315.anInt5797 == 2) {
												Static233.aBoolean319 = true;
												Static431.method6279(Static377.anInt6885 + (int) ((double) (Static321.anInt5867 - Static498.aClass5_1.method7052()) * 2.0D / (double) Static118.aFloat11));
												Static59.method1113(Static357.anInt6305 - (int) ((double) (Static127.anInt4394 - Static498.aClass5_1.method7042()) * 2.0D / (double) Static118.aFloat11));
											}
											continue;
										}
										if (Static315.anInt5797 > 0 && !Static233.aBoolean319) {
											if ((Static329.anInt5978 == 1 || Static177.method2907()) && Static16.anInt415 > 2) {
												Static197.method7009(Static321.anInt5867, Static127.anInt4394);
											} else if (Static376.method5761()) {
												Static197.method7009(Static321.anInt5867, Static127.anInt4394);
											}
										}
										Static315.anInt5797 = 0;
										continue;
									}
									if (local6.anInt4729 == Static70.anInt6260) {
										if (local252) {
											Static177.method2912(local6.anInt4732, Static498.aClass5_1.method7052() - local17, local6.anInt4673, Static498.aClass5_1.method7042() - local22);
										}
										continue;
									}
									if (local6.anInt4729 == Static438.anInt7726) {
										Static20.method503(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean323 && local262) {
									local6.aBoolean323 = true;
									if (local6.anObjectArray24 != null) {
										local519 = new Class1_Sub30();
										local519.aBoolean374 = true;
										local519.aClass156_11 = local6;
										local519.anInt5303 = local267.method5737() - local17;
										local519.anInt5301 = local267.method5742() - local22;
										local519.anObjectArray36 = local6.anObjectArray24;
										Static90.aClass37_21.method970(local519);
									}
								}
								if (local6.aBoolean323 && local252 && local6.anObjectArray8 != null) {
									local519 = new Class1_Sub30();
									local519.aBoolean374 = true;
									local519.aClass156_11 = local6;
									local519.anInt5303 = Static498.aClass5_1.method7052() - local17;
									local519.anInt5301 = Static498.aClass5_1.method7042() - local22;
									local519.anObjectArray36 = local6.anObjectArray8;
									Static90.aClass37_21.method970(local519);
								}
								if (local6.aBoolean323 && !local252) {
									local6.aBoolean323 = false;
									if (local6.anObjectArray4 != null) {
										local519 = new Class1_Sub30();
										local519.aBoolean374 = true;
										local519.aClass156_11 = local6;
										local519.anInt5303 = Static498.aClass5_1.method7052() - local17;
										local519.anInt5301 = Static498.aClass5_1.method7042() - local22;
										local519.anObjectArray36 = local6.anObjectArray4;
										Static420.aClass37_80.method970(local519);
									}
								}
								if (local252 && local6.anObjectArray23 != null) {
									local519 = new Class1_Sub30();
									local519.aBoolean374 = true;
									local519.aClass156_11 = local6;
									local519.anInt5303 = Static498.aClass5_1.method7052() - local17;
									local519.anInt5301 = Static498.aClass5_1.method7042() - local22;
									local519.anObjectArray36 = local6.anObjectArray23;
									Static90.aClass37_21.method970(local519);
								}
								if (!local6.aBoolean322 && local208) {
									local6.aBoolean322 = true;
									if (local6.anObjectArray20 != null) {
										local519 = new Class1_Sub30();
										local519.aBoolean374 = true;
										local519.aClass156_11 = local6;
										local519.anInt5303 = Static498.aClass5_1.method7052() - local17;
										local519.anInt5301 = Static498.aClass5_1.method7042() - local22;
										local519.anObjectArray36 = local6.anObjectArray20;
										Static90.aClass37_21.method970(local519);
									}
								}
								if (local6.aBoolean322 && local208 && local6.anObjectArray11 != null) {
									local519 = new Class1_Sub30();
									local519.aBoolean374 = true;
									local519.aClass156_11 = local6;
									local519.anInt5303 = Static498.aClass5_1.method7052() - local17;
									local519.anInt5301 = Static498.aClass5_1.method7042() - local22;
									local519.anObjectArray36 = local6.anObjectArray11;
									Static90.aClass37_21.method970(local519);
								}
								if (local6.aBoolean322 && !local208) {
									local6.aBoolean322 = false;
									if (local6.anObjectArray22 != null) {
										local519 = new Class1_Sub30();
										local519.aBoolean374 = true;
										local519.aClass156_11 = local6;
										local519.anInt5303 = Static498.aClass5_1.method7052() - local17;
										local519.anInt5301 = Static498.aClass5_1.method7042() - local22;
										local519.anObjectArray36 = local6.anObjectArray22;
										Static420.aClass37_80.method970(local519);
									}
								}
								if (local6.anObjectArray13 != null) {
									local519 = new Class1_Sub30();
									local519.aClass156_11 = local6;
									local519.anObjectArray36 = local6.anObjectArray13;
									Static281.aClass37_55.method970(local519);
								}
								@Pc(1487) Class1_Sub30 local1487;
								if (local6.anObjectArray16 != null && Static74.anInt1365 > local6.anInt4688) {
									if (local6.anIntArray455 == null || Static74.anInt1365 - local6.anInt4688 > 32) {
										local519 = new Class1_Sub30();
										local519.aClass156_11 = local6;
										local519.anObjectArray36 = local6.anObjectArray16;
										Static90.aClass37_21.method970(local519);
									} else {
										label680: for (local300 = local6.anInt4688; local300 < Static74.anInt1365; local300++) {
											local674 = Static84.anIntArray174[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray455.length; local434++) {
												if (local6.anIntArray455[local434] == local674) {
													local1487 = new Class1_Sub30();
													local1487.aClass156_11 = local6;
													local1487.anObjectArray36 = local6.anObjectArray16;
													Static90.aClass37_21.method970(local1487);
													break label680;
												}
											}
										}
									}
									local6.anInt4688 = Static74.anInt1365;
								}
								if (local6.anObjectArray15 != null && Static365.anInt6469 > local6.anInt4685) {
									if (local6.anIntArray451 == null || Static365.anInt6469 - local6.anInt4685 > 32) {
										local519 = new Class1_Sub30();
										local519.aClass156_11 = local6;
										local519.anObjectArray36 = local6.anObjectArray15;
										Static90.aClass37_21.method970(local519);
									} else {
										label656: for (local300 = local6.anInt4685; local300 < Static365.anInt6469; local300++) {
											local674 = Static148.anIntArray689[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray451.length; local434++) {
												if (local6.anIntArray451[local434] == local674) {
													local1487 = new Class1_Sub30();
													local1487.aClass156_11 = local6;
													local1487.anObjectArray36 = local6.anObjectArray15;
													Static90.aClass37_21.method970(local1487);
													break label656;
												}
											}
										}
									}
									local6.anInt4685 = Static365.anInt6469;
								}
								if (local6.anObjectArray31 != null && Static7.anInt161 > local6.anInt4684) {
									if (local6.anIntArray448 == null || Static7.anInt161 - local6.anInt4684 > 32) {
										local519 = new Class1_Sub30();
										local519.aClass156_11 = local6;
										local519.anObjectArray36 = local6.anObjectArray31;
										Static90.aClass37_21.method970(local519);
									} else {
										label632: for (local300 = local6.anInt4684; local300 < Static7.anInt161; local300++) {
											local674 = Static400.anIntArray694[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray448.length; local434++) {
												if (local6.anIntArray448[local434] == local674) {
													local1487 = new Class1_Sub30();
													local1487.aClass156_11 = local6;
													local1487.anObjectArray36 = local6.anObjectArray31;
													Static90.aClass37_21.method970(local1487);
													break label632;
												}
											}
										}
									}
									local6.anInt4684 = Static7.anInt161;
								}
								if (local6.anObjectArray19 != null && Static68.anInt1315 > local6.anInt4666) {
									if (local6.anIntArray452 == null || Static68.anInt1315 - local6.anInt4666 > 32) {
										local519 = new Class1_Sub30();
										local519.aClass156_11 = local6;
										local519.anObjectArray36 = local6.anObjectArray19;
										Static90.aClass37_21.method970(local519);
									} else {
										label608: for (local300 = local6.anInt4666; local300 < Static68.anInt1315; local300++) {
											local674 = Static366.anIntArray657[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray452.length; local434++) {
												if (local6.anIntArray452[local434] == local674) {
													local1487 = new Class1_Sub30();
													local1487.aClass156_11 = local6;
													local1487.anObjectArray36 = local6.anObjectArray19;
													Static90.aClass37_21.method970(local1487);
													break label608;
												}
											}
										}
									}
									local6.anInt4666 = Static68.anInt1315;
								}
								if (local6.anObjectArray25 != null && Static219.anInt7871 > local6.anInt4731) {
									if (local6.anIntArray456 == null || Static219.anInt7871 - local6.anInt4731 > 32) {
										local519 = new Class1_Sub30();
										local519.aClass156_11 = local6;
										local519.anObjectArray36 = local6.anObjectArray25;
										Static90.aClass37_21.method970(local519);
									} else {
										label584: for (local300 = local6.anInt4731; local300 < Static219.anInt7871; local300++) {
											local674 = Static217.anIntArray788[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray456.length; local434++) {
												if (local6.anIntArray456[local434] == local674) {
													local1487 = new Class1_Sub30();
													local1487.aClass156_11 = local6;
													local1487.anObjectArray36 = local6.anObjectArray25;
													Static90.aClass37_21.method970(local1487);
													break label584;
												}
											}
										}
									}
									local6.anInt4731 = Static219.anInt7871;
								}
								if (Static412.anInt6560 > local6.anInt4727 && local6.anObjectArray14 != null) {
									local519 = new Class1_Sub30();
									local519.aClass156_11 = local6;
									local519.anObjectArray36 = local6.anObjectArray14;
									Static90.aClass37_21.method970(local519);
								}
								if (Static223.anInt4462 > local6.anInt4727 && local6.anObjectArray32 != null) {
									local519 = new Class1_Sub30();
									local519.aClass156_11 = local6;
									local519.anObjectArray36 = local6.anObjectArray32;
									Static90.aClass37_21.method970(local519);
								}
								if (Static509.anInt8616 > local6.anInt4727 && local6.anObjectArray28 != null) {
									local519 = new Class1_Sub30();
									local519.aClass156_11 = local6;
									local519.anObjectArray36 = local6.anObjectArray28;
									Static90.aClass37_21.method970(local519);
								}
								if (Static104.anInt2086 > local6.anInt4727 && local6.anObjectArray9 != null) {
									local519 = new Class1_Sub30();
									local519.aClass156_11 = local6;
									local519.anObjectArray36 = local6.anObjectArray9;
									Static90.aClass37_21.method970(local519);
								}
								if (Static51.anInt1019 > local6.anInt4727 && local6.anObjectArray18 != null) {
									local519 = new Class1_Sub30();
									local519.aClass156_11 = local6;
									local519.anObjectArray36 = local6.anObjectArray18;
									Static90.aClass37_21.method970(local519);
								}
								local6.anInt4727 = Static164.anInt2967;
								if (local6.anObjectArray7 != null) {
									for (local300 = 0; local300 < Static240.anInt4803; local300++) {
										@Pc(1955) Class1_Sub30 local1955 = new Class1_Sub30();
										local1955.aClass156_11 = local6;
										local1955.anInt5295 = Static176.anInterface12Array1[local300].method7437();
										local1955.anInt5299 = Static176.anInterface12Array1[local300].method7436();
										local1955.anObjectArray36 = local6.anObjectArray7;
										Static90.aClass37_21.method970(local1955);
									}
								}
								if (Static104.aBoolean128 && local6.anObjectArray17 != null) {
									local519 = new Class1_Sub30();
									local519.aClass156_11 = local6;
									local519.anObjectArray36 = local6.anObjectArray17;
									Static90.aClass37_21.method970(local519);
								}
							}
							if (local6.anInt4735 == 5 && local6.anInt4656 != -1) {
								local6.method4045(Static482.aClass82_1, Static335.aClass41_1).method2620(local6.anInt4673, Static513.aClass122_10);
							}
							Static146.method2333(local6);
							if (local6.anInt4735 == 0) {
								method1233(arg0, local6.anInt4677, local28, local30, local32, local34, local17 - local6.anInt4711, local22 - local6.anInt4707, arg8, arg9);
								if (local6.aClass156Array1 != null) {
									method1233(local6.aClass156Array1, local6.anInt4677, local28, local30, local32, local34, local17 - local6.anInt4711, local22 - local6.anInt4707, arg8, arg9);
								}
								@Pc(2077) Class1_Sub35 local2077 = (Class1_Sub35) Static468.aClass17_36.method738((long) local6.anInt4677);
								if (local2077 != null) {
									if (Static304.aClass101_1 == Static442.aClass101_3 && local2077.anInt6102 == 0 && !Static15.aBoolean16 && local208 && !Static54.aBoolean69) {
										Static324.method5028();
									}
									Static320.method4985(local32, local28, arg9, local22, local34, local17, arg8, local2077.anInt6103, local30);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static146.method2333(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	public static void method1234(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static190.anInt3385;
		@Pc(3) int[] local3 = Static502.anIntArray771;
		@Pc(11) int local11 = Static200.aBoolean280 ? local1 : local1 + Static157.anInt4503;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class49_Sub2_Sub2 local23;
			if (local13 < local1) {
				local23 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub17) Static380.aClass17_29.method738((long) Static427.anIntArray711[local13 - local1])).aClass49_Sub2_Sub2_Sub2_2;
			}
			if (local23.aByte98 == arg0) {
				local23.anInt4329 = 0;
				if (local23.anInt4277 < 0) {
					local23.aBoolean304 = false;
				} else {
					@Pc(54) int local54 = local23.method3788();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt7137 & 0x1FF) != 0 || (local23.anInt7141 & 0x1FF) != 0) {
							local23.aBoolean304 = false;
							continue;
						}
					} else if ((local23.anInt7137 & 0x1FF) != 256 || (local23.anInt7141 & 0x1FF) != 256) {
						local23.aBoolean304 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt7137 >> 9;
						local101 = local23.anInt7141 >> 9;
						if (local23.anInt4277 != Static73.anIntArrayArray18[local96][local101]) {
							local23.aBoolean304 = true;
							continue;
						}
						if (Static336.anIntArrayArray79[local96][local101] > 1) {
							local126 = Static336.anIntArrayArray79[local96][local101]--;
							local23.aBoolean304 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt7137 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt7141 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt7137 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt7141 + local96 >> 9;
						if (!Static494.method6736(local101, local23.anInt4277, local169, local162, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt4277 == Static73.anIntArrayArray18[local180][local183]) {
										local126 = Static336.anIntArrayArray79[local180][local183]--;
									}
								}
							}
							local23.aBoolean304 = true;
							continue;
						}
					}
					if (local23 instanceof Class49_Sub2_Sub2_Sub1 && local23.aClass1_Sub50_3 != null && Static436.anInt6850 >= local23.aClass1_Sub50_3.anInt8760 && Static436.anInt6850 < local23.aClass1_Sub50_3.anInt8765) {
						((Class49_Sub2_Sub2_Sub1) local23).aBoolean110 = false;
					}
					local23.aBoolean304 = false;
					local23.anInt7140 = Static38.method884(local23.aByte98, local23.anInt7137, local23.anInt7141);
					Static468.method6558(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1235() {
		for (@Pc(1) int local1 = 0; local1 < Static459.anInt7799; local1++) {
			@Pc(6) int[] local6 = Static73.anIntArrayArray18[local1];
			for (@Pc(8) int local8 = 0; local8 < Static482.anInt7990; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!jq;)Z")
	public static boolean method1236(@OriginalArg(0) Class156 arg0) {
		if (Static54.aBoolean69) {
			if (method1228(arg0).anInt2505 != 0) {
				return false;
			}
			if (arg0.anInt4735 == 0) {
				return false;
			}
		}
		return arg0.aBoolean327;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1238() {
		@Pc(1) int local1 = Static190.anInt3385;
		@Pc(3) int[] local3 = Static502.anIntArray771;
		@Pc(11) int local11 = Static200.aBoolean280 ? local1 : local1 + Static157.anInt4503;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class49_Sub2_Sub2 local23;
			if (local13 < local1) {
				local23 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub17) Static380.aClass17_29.method738((long) Static427.anIntArray711[local13 - local1])).aClass49_Sub2_Sub2_Sub2_2;
			}
			if (local23.anInt4277 >= 0) {
				@Pc(43) int local43 = local23.method3788();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt7137 & 0x1FF) == 0 && (local23.anInt7141 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt7137 & 0x1FF) == 256 && (local23.anInt7141 & 0x1FF) == 256) {
					continue;
				}
				if (local23 instanceof Class49_Sub2_Sub2_Sub1 && local23.aClass1_Sub50_3 != null && Static436.anInt6850 >= local23.aClass1_Sub50_3.anInt8760 && Static436.anInt6850 < local23.aClass1_Sub50_3.anInt8765) {
					((Class49_Sub2_Sub2_Sub1) local23).aBoolean110 = false;
				}
				local23.anInt7140 = Static38.method884(local23.aByte98, local23.anInt7137, local23.anInt7141);
				Static468.method6558(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1244() {
		Static375.anInt6872 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static157.anInt4503; local3++) {
			@Pc(14) Class49_Sub2_Sub2_Sub2 local14 = ((Class1_Sub17) Static380.aClass17_29.method738((long) Static427.anIntArray711[local3])).aClass49_Sub2_Sub2_Sub2_2;
			if (local14.aBoolean304 && local14.method3785() != -1) {
				@Pc(32) int local32 = (local14.method3788() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt7137 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt7141 - local32 >> 9;
				@Pc(53) Class49_Sub2_Sub2 local53 = Static354.method5321(local39, local14.aByte98, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt4295;
					if (local53 instanceof Class49_Sub2_Sub2_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt4329 == 0 && local53.method3785() != -1) {
						Static504.anIntArray772[Static375.anInt6872] = local58;
						Static460.anIntArray735[Static375.anInt6872] = local58;
						Static375.anInt6872++;
						local53.anInt4329++;
					}
					Static504.anIntArray772[Static375.anInt6872] = local58;
					Static460.anIntArray735[Static375.anInt6872] = local14.anInt4295 + 2048;
					Static375.anInt6872++;
					local53.anInt4329++;
				}
			}
		}
		Static342.method5180(Static504.anIntArray772, Static375.anInt6872 - 1, Static460.anIntArray735, 0);
	}
}
