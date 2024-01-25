import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!po", name = "i", descriptor = "Lclient!eu;")
	public static Class70 aClass70_28;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "I")
	public static int anInt5495 = 100;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I")
	public static int method4305() {
		return Static319.anInt1935;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIII)Lclient!bi;")
	public static Class23 method4306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg1 * 32147369L ^ (long) arg5 * 475427L ^ (long) arg4 * 97549L ^ (long) arg3 * 67481L ^ (long) arg2 * 986053L ^ (long) arg0 * 76724863L;
		@Pc(44) Class23 local44 = (Class23) Static176.aClass126_21.method3141(local38);
		if (local44 == null) {
			local44 = Static166.aClass172_6.method5536(arg3, arg4, arg5, arg2, arg1, arg0);
			Static176.aClass126_21.method3132(local38, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)Z")
	public static boolean method4307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static9.aByteArrayArrayArray1[1][arg0][arg1] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(IIIIIII)V")
	public static void method4308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static428.anInt6973 = arg0;
		Static351.anInt5972 = arg3;
		Static245.anInt4733 = arg4;
		Static159.anInt3177 = arg2;
		Static295.anInt5290 = arg1;
		Static104.anInt2371 = arg5;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!qa;III)V")
	public static void method4309(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static356.anInt6078 == 0 || Static237.anInt4547 == 0) {
			return;
		}
		arg0.GA(Static1.anInt42, Static178.anInt3545, Static356.anInt6078, Static237.anInt4547);
		arg0.pa(Static39.anInt1065, Static455.anInt7678, Static356.anInt6078, Static237.anInt4547);
		@Pc(32) Class107 local32 = arg0.method5524();
		local32.Q(Static245.anInt4733, Static295.anInt5290, Static104.anInt2371, Static428.anInt6973, Static159.anInt3177, Static351.anInt5972);
		arg0.m(local32);
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(73) int local73;
		@Pc(82) int local82;
		@Pc(91) int local91;
		@Pc(106) int[] local106;
		@Pc(138) int local138;
		@Pc(147) int local147;
		if (Static26.aClass159Array1 != null) {
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			@Pc(52) int local52 = arg0.d();
			local61 = local52 * (arg2 - Static1.anInt42) / Static356.anInt6078;
			local70 = local52 * (arg1 - Static178.anInt3545) / Static237.anInt4547;
			local73 = arg0.W();
			local82 = local73 * (arg2 - Static1.anInt42) / Static356.anInt6078;
			local91 = (arg1 - Static178.anInt3545) * local73 / Static237.anInt4547;
			local106 = new int[] { local61, local70, local52 };
			local32.X(local106);
			@Pc(124) int[] local124 = new int[] { local82, local91, local73 };
			local32.X(local124);
			@Pc(129) float local129 = 0.0F;
			local138 = local124[0] - local106[0];
			local147 = local124[1] - local106[1];
			@Pc(156) int local156 = local124[2] - local106[2];
			while (local129 < 1.0F) {
				@Pc(169) int local169 = (int) ((float) local106[0] + (float) local138 * local129);
				@Pc(173) int local173 = local169 >> 7;
				@Pc(184) int local184 = (int) ((float) local106[2] + (float) local156 * local129);
				@Pc(188) int local188 = local184 >> 7;
				if (local173 > 0 && local188 > 0 && Static40.anInt1089 > local173 && Static44.anInt7276 > local188) {
					@Pc(204) int local204 = Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77;
					if (local204 < 3 && (Static9.aByteArrayArrayArray1[1][local173][local188] & 0x2) != 0) {
						local204++;
					}
					if ((float) Static26.aClass159Array1[local204].va(local169, local184) < local129 * (float) local147 + (float) local106[1]) {
						local47 = (Static379.aClass7_Sub2_Sub3_Sub2_2.method3499() - 1 << 6) + local169 >> 7;
						local49 = (Static379.aClass7_Sub2_Sub3_Sub2_2.method3499() - 1 << 6) + local184 >> 7;
						break;
					}
				}
				local129 = (float) ((double) local129 + 0.01D);
			}
			if (local47 != -1 && local49 != -1) {
				if (Static446.aBoolean648 && (Static279.anInt4322 & 0x40) != 0) {
					@Pc(298) Class156 local298 = Static109.method1853(Static129.anInt2687, Static213.anInt4082);
					if (local298 == null) {
						Static70.method1396();
					} else {
						Static102.method1792(" ->", 0L, Static141.anInt2928, local49, true, Static189.aString34, false, local47, -1, 46);
					}
				} else {
					if (Static57.aClass183_3 == Static297.aClass183_4) {
						Static102.method1792("", 0L, -1, local49, true, Static126.aClass189_85.method4262(Static53.anInt1454), false, local47, -1, 59);
					}
					Static102.method1792("", 0L, Static437.anInt7362, local49, true, Static204.aString23, false, local47, -1, 16);
				}
			}
		}
		@Pc(354) Class138 local354 = Static344.aClass138_5;
		for (@Pc(367) Class6_Sub1 local367 = (Class6_Sub1) local354.method3311(); local367 != null; local367 = (Class6_Sub1) local354.method3312()) {
			if (local367.anInt87 == Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 && local367.method40(arg0, arg1, arg2)) {
				@Pc(488) int local488;
				if (local367.aClass7_1 instanceof Class7_Sub2_Sub3_Sub2) {
					@Pc(389) Class7_Sub2_Sub3_Sub2 local389 = (Class7_Sub2_Sub3_Sub2) local367.aClass7_1;
					local61 = local389.method3499();
					if ((local61 & 0x1) == 0 && (local389.anInt4318 & 0x7F) == 0 && (local389.anInt4321 & 0x7F) == 0 || (local61 & 0x1) == 1 && (local389.anInt4318 & 0x7F) == 64 && (local389.anInt4321 & 0x7F) == 64) {
						local70 = local389.anInt4318 - (local389.method3499() - 1 << 6);
						local73 = local389.anInt4321 - (local389.method3499() - 1 << 6);
						@Pc(500) int local500;
						for (local82 = 0; local82 < Static54.anInt1472; local82++) {
							@Pc(461) Class7_Sub2_Sub3_Sub1 local461 = Static139.aClass7_Sub2_Sub3_Sub1Array11[Static319.anIntArray114[local82]];
							if (local461 != null && Static253.anInt4787 != local461.anInt4338 && local461.aBoolean375) {
								local488 = local461.anInt4318 - (local461.aClass47_1.anInt1616 - 1 << 6);
								local500 = local461.anInt4321 - (local461.aClass47_1.anInt1616 - 1 << 6);
								if (local488 >= local70 && local461.aClass47_1.anInt1616 <= local389.method3499() - (local488 - local70 >> 7) && local73 <= local500 && local461.aClass47_1.anInt1616 <= local389.method3499() - (local500 - local73 >> 7)) {
									Static336.method4490(local367.anInt87 != Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77, local461);
									local461.anInt4338 = Static253.anInt4787;
								}
							}
						}
						local91 = Static160.anInt3271;
						local106 = Static162.anIntArray212;
						for (local500 = 0; local500 < local91; local500++) {
							@Pc(576) Class7_Sub2_Sub3_Sub2 local576 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local106[local500]];
							if (local576 != null && Static253.anInt4787 != local576.anInt4338 && local576 != local389 && local576.aBoolean375) {
								local138 = local576.anInt4318 - (local576.method3499() - 1 << 6);
								local147 = local576.anInt4321 - (local576.method3499() - 1 << 6);
								if (local70 <= local138 && local576.method3499() <= local389.method3499() - (local138 - local70 >> 7) && local73 <= local147 && local576.method3499() <= local389.method3499() - (local147 - local73 >> 7)) {
									Static249.method3738(local576, Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 != local367.anInt87);
									local576.anInt4338 = Static253.anInt4787;
								}
							}
						}
					}
					if (local389.anInt4338 == Static253.anInt4787) {
						continue;
					}
					Static249.method3738(local389, local367.anInt87 != Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77);
					local389.anInt4338 = Static253.anInt4787;
				}
				if (local367.aClass7_1 instanceof Class7_Sub2_Sub3_Sub1) {
					@Pc(717) Class7_Sub2_Sub3_Sub1 local717 = (Class7_Sub2_Sub3_Sub1) local367.aClass7_1;
					if (local717.aClass47_1 != null) {
						if ((local717.aClass47_1.anInt1616 & 0x1) == 0 && (local717.anInt4318 & 0x7F) == 0 && (local717.anInt4321 & 0x7F) == 0 || (local717.aClass47_1.anInt1616 & 0x1) == 1 && (local717.anInt4318 & 0x7F) == 64 && (local717.anInt4321 & 0x7F) == 64) {
							local61 = local717.anInt4318 - (local717.aClass47_1.anInt1616 - 1 << 6);
							local70 = local717.anInt4321 - (local717.aClass47_1.anInt1616 - 1 << 6);
							for (local73 = 0; local73 < Static54.anInt1472; local73++) {
								@Pc(792) Class7_Sub2_Sub3_Sub1 local792 = Static139.aClass7_Sub2_Sub3_Sub1Array11[Static319.anIntArray114[local73]];
								if (local792 != null && Static253.anInt4787 != local792.anInt4338 && local717 != local792 && local792.aBoolean375) {
									local91 = local792.anInt4318 - (local792.aClass47_1.anInt1616 - 1 << 6);
									local488 = local792.anInt4321 - (local792.aClass47_1.anInt1616 - 1 << 6);
									if (local91 >= local61 && local717.aClass47_1.anInt1616 - (local91 - local61 >> 7) >= local792.aClass47_1.anInt1616 && local488 >= local70 && local717.aClass47_1.anInt1616 - (local488 - local70 >> 7) >= local792.aClass47_1.anInt1616) {
										Static336.method4490(local367.anInt87 != Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77, local792);
										local792.anInt4338 = Static253.anInt4787;
									}
								}
							}
							local82 = Static160.anInt3271;
							@Pc(907) int[] local907 = Static162.anIntArray212;
							for (local488 = 0; local488 < local82; local488++) {
								@Pc(917) Class7_Sub2_Sub3_Sub2 local917 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local907[local488]];
								if (local917 != null && local917.anInt4338 != Static253.anInt4787 && local917.aBoolean375) {
									@Pc(942) int local942 = local917.anInt4318 - (local917.method3499() - 1 << 6);
									local138 = local917.anInt4321 - (local917.method3499() - 1 << 6);
									if (local942 >= local61 && local917.method3499() <= local717.aClass47_1.anInt1616 - (local942 - local61 >> 7) && local138 >= local70 && local917.method3499() <= local717.aClass47_1.anInt1616 - (local138 - local70 >> 7)) {
										Static249.method3738(local917, local367.anInt87 != Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77);
										local917.anInt4338 = Static253.anInt4787;
									}
								}
							}
						}
						if (Static253.anInt4787 == local717.anInt4338) {
							continue;
						}
						Static336.method4490(local367.anInt87 != Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77, local717);
						local717.anInt4338 = Static253.anInt4787;
					}
				}
				if (local367.aClass7_1 instanceof Class7_Sub5_Sub1) {
					@Pc(1066) Class3_Sub39 local1066 = (Class3_Sub39) Static441.aClass11_43.method324((long) (local367.anInt90 | local367.anInt92 << 14 | local367.anInt87 << 28));
					if (local1066 != null) {
						for (@Pc(1074) Class3_Sub22 local1074 = (Class3_Sub22) local1066.aClass243_40.method5207(); local1074 != null; local1074 = (Class3_Sub22) local1066.aClass243_40.method5214()) {
							@Pc(1082) Class81 local1082 = Static314.aClass12_2.method327(local1074.anInt3744);
							if (!Static446.aBoolean648) {
								if (Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 == local367.anInt87) {
									@Pc(1096) String[] local1096 = local1082.aStringArray23;
									for (local82 = 4; local82 >= 0; local82--) {
										if (local1096 != null && local1096[local82] != null) {
											@Pc(1108) byte local1108 = 0;
											local488 = Static366.anInt6171;
											if (local82 == 0) {
												local1108 = 48;
											}
											if (local82 == 1) {
												local1108 = 44;
											}
											if (local82 == 2) {
												local1108 = 3;
											}
											if (local82 == 3) {
												local1108 = 23;
											}
											if (local82 == local1082.anInt2530) {
												local488 = local1082.anInt2575;
											}
											if (local82 == 4) {
												local1108 = 2;
											}
											if (local82 == local1082.anInt2517) {
												local488 = local1082.anInt2560;
											}
											Static102.method1792("<col=ff9040>" + local1082.aString17, (long) local1074.anInt3744, local488, local367.anInt92, true, local1096[local82], false, local367.anInt90, -1, local1108);
										}
									}
								}
								Static102.method1792("<col=ff9040>" + local1082.aString17, (long) local1074.anInt3744, Static103.anInt2338, local367.anInt92, true, Static267.aClass189_158.method4262(Static53.anInt1454), Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 != local367.anInt87, local367.anInt90, -1, 1010);
							} else if (local367.anInt87 == Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77) {
								@Pc(1244) Class224 local1244 = Static96.anInt2198 == -1 ? null : Static318.aClass26_5.method691(Static96.anInt2198);
								if ((Static279.anInt4322 & 0x1) != 0 && (local1244 == null || local1082.method1951(local1244.anInt6133, Static96.anInt2198) != local1244.anInt6133)) {
									Static102.method1792(Static415.aString62 + " -> <col=ff9040>" + local1082.aString17, (long) local1074.anInt3744, Static141.anInt2928, local367.anInt92, true, Static189.aString34, false, local367.anInt90, -1, 13);
								}
							}
						}
					}
				}
				if (local367.aClass7_1 instanceof Interface8) {
					@Pc(1312) Interface8 local1312 = (Interface8) local367.aClass7_1;
					@Pc(1319) Class93 local1319 = Static435.aClass30_4.method769(local1312.method4808());
					if (local1319.anIntArray171 != null) {
						local1319 = local1319.method2066(Static85.aClass49_1);
					}
					if (local1319 != null) {
						if (!Static446.aBoolean648) {
							if (local367.anInt87 == Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77) {
								@Pc(1343) String[] local1343 = local1319.aStringArray28;
								if (local1343 != null) {
									for (local73 = 4; local73 >= 0; local73--) {
										if (local1343[local73] != null) {
											@Pc(1355) short local1355 = 0;
											local91 = Static366.anInt6171;
											if (local73 == 0) {
												local1355 = 5;
											}
											if (local73 == 1) {
												local1355 = 45;
											}
											if (local73 == 2) {
												local1355 = 21;
											}
											if (local73 == 3) {
												local1355 = 47;
											}
											if (local73 == 4) {
												local1355 = 1006;
											}
											if (local73 == local1319.anInt2769) {
												local91 = local1319.anInt2775;
											}
											if (local1319.anInt2750 == local73) {
												local91 = local1319.anInt2758;
											}
											Static102.method1792("<col=00ffff>" + local1319.aString20, Static12.method289(local1312, local367.anInt92, local367.anInt90), local91, local367.anInt92, true, local1343[local73], false, local367.anInt90, -1, local1355);
										}
									}
								}
							}
							Static102.method1792("<col=00ffff>" + local1319.aString20, (long) local1319.anInt2747, Static103.anInt2338, local367.anInt92, true, Static267.aClass189_158.method4262(Static53.anInt1454), Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 != local367.anInt87, local367.anInt90, -1, 1011);
						} else if (Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 == local367.anInt87) {
							@Pc(1506) Class224 local1506 = Static96.anInt2198 == -1 ? null : Static318.aClass26_5.method691(Static96.anInt2198);
							if ((Static279.anInt4322 & 0x4) != 0 && (local1506 == null || local1319.method2067(Static96.anInt2198, local1506.anInt6133) != local1506.anInt6133)) {
								Static102.method1792(Static415.aString62 + " -> <col=00ffff>" + local1319.aString20, Static12.method289(local1312, local367.anInt92, local367.anInt90), Static141.anInt2928, local367.anInt92, true, Static189.aString34, false, local367.anInt90, -1, 60);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!vr;Lclient!vr;IZ)I")
	public static int method4310(@OriginalArg(0) int arg0, @OriginalArg(1) Class117_Sub1 arg1, @OriginalArg(2) Class117_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(17) int local17;
		@Pc(20) int local20;
		if (arg0 == 1) {
			local17 = arg2.anInt7353;
			local20 = arg1.anInt7353;
			if (!arg3) {
				if (local20 == -1) {
					local20 = 2001;
				}
				if (local17 == -1) {
					local17 = 2001;
				}
			}
			return local17 - local20;
		} else if (arg0 == 2) {
			return Static37.method732(arg1.method5725().aString52, Static53.anInt1454, arg2.method5725().aString52);
		} else if (arg0 == 3) {
			if (arg2.aString66.equals("-")) {
				if (arg1.aString66.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString66.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static37.method732(arg1.aString66, Static53.anInt1454, arg2.aString66);
			}
		} else if (arg0 == 4) {
			if (arg2.method5719()) {
				return arg1.method5719() ? 0 : 1;
			} else if (arg1.method5719()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg2.method5717()) {
				return arg1.method5717() ? 0 : 1;
			} else if (arg1.method5717()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg2.method5718()) {
				return arg1.method5718() ? 0 : 1;
			} else if (arg1.method5718()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg2.method5721()) {
				return arg1.method5721() ? 0 : 1;
			} else if (arg1.method5721()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local17 = arg2.anInt7360;
			local20 = arg1.anInt7360;
			if (arg3) {
				if (local20 == 1000) {
					local20 = -1;
				}
				if (local17 == 1000) {
					local17 = -1;
				}
			} else {
				if (local20 == -1) {
					local20 = 1000;
				}
				if (local17 == -1) {
					local17 = 1000;
				}
			}
			return local17 - local20;
		} else {
			return arg2.anInt7359 - arg1.anInt7359;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4311(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static30.method641(Static110.aClass217_44);
		Static302.aClass3_Sub7_Sub1_2.method2628(Static24.method582(arg1) + 1);
		Static302.aClass3_Sub7_Sub1_2.method2601(arg0);
		Static302.aClass3_Sub7_Sub1_2.method2608(arg1);
	}
}
