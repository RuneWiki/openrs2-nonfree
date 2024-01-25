import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_57 = new Class181();

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "[J")
	public static final long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILclient!ya;I)V")
	public static void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static86.anInt1853 == 0 || Static366.anInt6017 == 0) {
			return;
		}
		arg2.H(Static203.anInt5096, Static345.anInt5807, Static86.anInt1853, Static366.anInt6017);
		arg2.OA(Static374.anInt6113, Static254.anInt4598, Static86.anInt1853, Static366.anInt6017);
		@Pc(38) Class33 local38 = arg2.method4512();
		local38.s(Static222.anInt4040, Static368.anInt6042, Static251.anInt4561, Static173.anInt3204, Static410.anInt6627, Static351.anInt5839);
		arg2.ea(local38);
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(88) int local88;
		@Pc(97) int local97;
		@Pc(112) int[] local112;
		@Pc(144) int local144;
		@Pc(152) int local152;
		if (Static269.aClass149Array2 != null) {
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			@Pc(58) int local58 = arg2.a();
			local67 = local58 * (arg1 - Static203.anInt5096) / Static86.anInt1853;
			local76 = local58 * (arg0 - Static345.anInt5807) / Static366.anInt6017;
			local79 = arg2.YA();
			local88 = (arg1 - Static203.anInt5096) * local79 / Static86.anInt1853;
			local97 = (arg0 - Static345.anInt5807) * local79 / Static366.anInt6017;
			local112 = new int[] { local67, local76, local58 };
			local38.m(local112);
			@Pc(130) int[] local130 = new int[] { local88, local97, local79 };
			local38.m(local130);
			@Pc(135) float local135 = 0.0F;
			local144 = local130[0] - local112[0];
			local152 = local130[1] - local112[1];
			@Pc(161) int local161 = local130[2] - local112[2];
			while (local135 < 1.0F) {
				@Pc(174) int local174 = (int) ((float) local112[0] + local135 * (float) local144);
				@Pc(178) int local178 = local174 >> 7;
				@Pc(189) int local189 = (int) ((float) local112[2] + (float) local161 * local135);
				@Pc(193) int local193 = local189 >> 7;
				if (local178 > 0 && local193 > 0 && Static195.anInt3537 > local178 && local193 < Static118.anInt2419) {
					@Pc(214) int local214 = Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100;
					if (local214 < 3 && (Static2.aByteArrayArrayArray1[1][local178][local193] & 0x2) != 0) {
						local214++;
					}
					if ((float) Static269.aClass149Array2[local214].a(local174, local189) < (float) local152 * local135 + (float) local112[1]) {
						local53 = local174 + (Static452.aClass31_Sub2_Sub1_Sub1_2.method5989() - 1 << 6) >> 7;
						local55 = (Static452.aClass31_Sub2_Sub1_Sub1_2.method5989() - 1 << 6) + local189 >> 7;
						break;
					}
				}
				local135 = (float) ((double) local135 + 0.01D);
			}
			if (local53 != -1 && local55 != -1) {
				if (Static355.aBoolean412 && (Static410.anInt6626 & 0x40) != 0) {
					@Pc(309) Class251 local309 = Static201.method3261(Static135.anInt2708, Static314.anInt5418);
					if (local309 == null) {
						Static61.method1293();
					} else {
						Static373.method5165(-1, " ->", local53, local55, true, 5, false, Static139.aString22, Static347.anInt5821, 0L);
					}
				} else {
					if (Static147.aClass61_4 == Static337.aClass61_5) {
						Static373.method5165(-1, "", local53, local55, true, 50, false, Static241.aClass7_103.method331(Static341.anInt5770), -1, 0L);
					}
					Static373.method5165(-1, "", local53, local55, true, 8, false, Static420.aString70, Static228.anInt4143, 0L);
				}
			}
		}
		@Pc(369) Class141 local369 = Static36.aClass141_2;
		for (@Pc(379) Class4_Sub1 local379 = (Class4_Sub1) local369.method3357(); local379 != null; local379 = (Class4_Sub1) local369.method3360()) {
			if ((Static297.aBoolean375 || Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 == local379.anInt197) && local379.method165(arg2, arg1, arg0)) {
				@Pc(500) int local500;
				if (local379.aClass31_1 instanceof Class31_Sub2_Sub1_Sub1) {
					@Pc(403) Class31_Sub2_Sub1_Sub1 local403 = (Class31_Sub2_Sub1_Sub1) local379.aClass31_1;
					local67 = local403.method5989();
					if ((local67 & 0x1) == 0 && (local403.anInt7300 & 0x7F) == 0 && (local403.anInt7298 & 0x7F) == 0 || (local67 & 0x1) == 1 && (local403.anInt7300 & 0x7F) == 64 && (local403.anInt7298 & 0x7F) == 64) {
						local76 = local403.anInt7300 - (local403.method5989() - 1 << 6);
						local79 = local403.anInt7298 - (local403.method5989() - 1 << 6);
						@Pc(511) int local511;
						for (local88 = 0; local88 < Static5.anInt163; local88++) {
							@Pc(477) Class31_Sub2_Sub1_Sub2 local477 = Static98.aClass31_Sub2_Sub1_Sub2Array1[Static331.anIntArray648[local88]];
							if (local477 != null && local477.anInt7375 != Static378.anInt4244 && local477.aBoolean506) {
								local500 = local477.anInt7300 - (local477.aClass53_1.anInt1728 - 1 << 6);
								local511 = local477.anInt7298 - (local477.aClass53_1.anInt1728 - 1 << 6);
								if (local76 <= local500 && local477.aClass53_1.anInt1728 <= local403.method5989() - (local500 - local76 >> 7) && local511 >= local79 && local477.aClass53_1.anInt1728 <= local403.method5989() - (local511 - local79 >> 7)) {
									Static30.method603(Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 != local379.anInt197, local477);
									local477.anInt7375 = Static378.anInt4244;
								}
							}
						}
						local97 = Static155.anInt2952;
						local112 = Static381.anIntArray619;
						for (local511 = 0; local511 < local97; local511++) {
							@Pc(585) Class31_Sub2_Sub1_Sub1 local585 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local112[local511]];
							if (local585 != null && local585.anInt7375 != Static378.anInt4244 && local403 != local585 && local585.aBoolean506) {
								local144 = local585.anInt7300 - (local585.method5989() - 1 << 6);
								local152 = local585.anInt7298 - (local585.method5989() - 1 << 6);
								if (local76 <= local144 && local585.method5989() <= local403.method5989() - (local144 - local76 >> 7) && local152 >= local79 && local585.method5989() <= local403.method5989() - (local152 - local79 >> 7)) {
									Static398.method5315(local379.anInt197 != Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100, local585);
									local585.anInt7375 = Static378.anInt4244;
								}
							}
						}
					}
					if (Static378.anInt4244 == local403.anInt7375) {
						continue;
					}
					Static398.method5315(Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 != local379.anInt197, local403);
					local403.anInt7375 = Static378.anInt4244;
				}
				if (local379.aClass31_1 instanceof Class31_Sub2_Sub1_Sub2) {
					@Pc(716) Class31_Sub2_Sub1_Sub2 local716 = (Class31_Sub2_Sub1_Sub2) local379.aClass31_1;
					if (local716.aClass53_1 != null) {
						if ((local716.aClass53_1.anInt1728 & 0x1) == 0 && (local716.anInt7300 & 0x7F) == 0 && (local716.anInt7298 & 0x7F) == 0 || (local716.aClass53_1.anInt1728 & 0x1) == 1 && (local716.anInt7300 & 0x7F) == 64 && (local716.anInt7298 & 0x7F) == 64) {
							local67 = local716.anInt7300 - (local716.aClass53_1.anInt1728 - 1 << 6);
							local76 = local716.anInt7298 - (local716.aClass53_1.anInt1728 - 1 << 6);
							for (local79 = 0; local79 < Static5.anInt163; local79++) {
								@Pc(800) Class31_Sub2_Sub1_Sub2 local800 = Static98.aClass31_Sub2_Sub1_Sub2Array1[Static331.anIntArray648[local79]];
								if (local800 != null && local800.anInt7375 != Static378.anInt4244 && local800 != local716 && local800.aBoolean506) {
									local97 = local800.anInt7300 - (local800.aClass53_1.anInt1728 - 1 << 6);
									local500 = local800.anInt7298 - (local800.aClass53_1.anInt1728 - 1 << 6);
									if (local67 <= local97 && local800.aClass53_1.anInt1728 <= local716.aClass53_1.anInt1728 - (local97 - local67 >> 7) && local76 <= local500 && local716.aClass53_1.anInt1728 - (local500 - local76 >> 7) >= local800.aClass53_1.anInt1728) {
										Static30.method603(Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 != local379.anInt197, local800);
										local800.anInt7375 = Static378.anInt4244;
									}
								}
							}
							local88 = Static155.anInt2952;
							@Pc(913) int[] local913 = Static381.anIntArray619;
							for (local500 = 0; local500 < local88; local500++) {
								@Pc(923) Class31_Sub2_Sub1_Sub1 local923 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local913[local500]];
								if (local923 != null && local923.anInt7375 != Static378.anInt4244 && local923.aBoolean506) {
									@Pc(948) int local948 = local923.anInt7300 - (local923.method5989() - 1 << 6);
									local144 = local923.anInt7298 - (local923.method5989() - 1 << 6);
									if (local67 <= local948 && local923.method5989() <= local716.aClass53_1.anInt1728 - (local948 - local67 >> 7) && local76 <= local144 && local923.method5989() <= local716.aClass53_1.anInt1728 - (local144 - local76 >> 7)) {
										Static398.method5315(Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 != local379.anInt197, local923);
										local923.anInt7375 = Static378.anInt4244;
									}
								}
							}
						}
						if (Static378.anInt4244 == local716.anInt7375) {
							continue;
						}
						Static30.method603(local379.anInt197 != Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100, local716);
						local716.anInt7375 = Static378.anInt4244;
					}
				}
				if (local379.aClass31_1 instanceof Class31_Sub5_Sub1) {
					@Pc(1069) Class1_Sub25 local1069 = (Class1_Sub25) Static129.aClass96_24.method2335((long) (local379.anInt194 << 14 | local379.anInt197 << 28 | local379.anInt195));
					if (local1069 != null) {
						for (@Pc(1077) Class1_Sub22 local1077 = (Class1_Sub22) local1069.aClass181_29.method4110(); local1077 != null; local1077 = (Class1_Sub22) local1069.aClass181_29.method4111()) {
							@Pc(1085) Class152 local1085 = Static165.aClass19_1.method560(local1077.anInt3023);
							if (!Static355.aBoolean412) {
								if (local379.anInt197 == Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100) {
									@Pc(1165) String[] local1165 = local1085.aStringArray27;
									for (local88 = 4; local88 >= 0; local88--) {
										if (local1165 != null && local1165[local88] != null) {
											@Pc(1177) byte local1177 = 0;
											if (local88 == 0) {
												local1177 = 45;
											}
											local500 = Static145.anInt2797;
											if (local88 == 1) {
												local1177 = 20;
											}
											if (local88 == 2) {
												local1177 = 58;
											}
											if (local88 == 3) {
												local1177 = 15;
											}
											if (local88 == 4) {
												local1177 = 4;
											}
											if (local88 == local1085.anInt4181) {
												local500 = local1085.anInt4164;
											}
											if (local88 == local1085.anInt4201) {
												local500 = local1085.anInt4153;
											}
											Static373.method5165(-1, "<col=ff9040>" + local1085.aString34, local379.anInt195, local379.anInt194, true, local1177, false, local1165[local88], local500, (long) local1077.anInt3023);
										}
									}
								}
								Static373.method5165(-1, "<col=ff9040>" + local1085.aString34, local379.anInt195, local379.anInt194, true, 1003, local379.anInt197 != Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100, Static256.aClass7_107.method331(Static341.anInt5770), Static138.anInt6310, (long) local1077.anInt3023);
							} else if (local379.anInt197 == Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100) {
								@Pc(1102) Class184 local1102 = Static161.anInt3018 == -1 ? null : Static400.aClass35_2.method867(Static161.anInt3018);
								if ((Static410.anInt6626 & 0x1) != 0 && (local1102 == null || local1085.method3490(Static161.anInt3018, local1102.anInt5018) != local1102.anInt5018)) {
									Static373.method5165(-1, Static289.aString63 + " -> <col=ff9040>" + local1085.aString34, local379.anInt195, local379.anInt194, true, 10, false, Static139.aString22, Static347.anInt5821, (long) local1077.anInt3023);
								}
							}
						}
					}
				}
				if (local379.aClass31_1 instanceof Interface5) {
					@Pc(1323) Interface5 local1323 = (Interface5) local379.aClass31_1;
					@Pc(1332) Class129 local1332 = Static349.aClass115_4.method2766(local1323.method5176());
					if (local1332.anIntArray310 != null) {
						local1332 = local1332.method3031(Static394.aClass23_1);
					}
					if (local1332 != null) {
						if (!Static355.aBoolean412) {
							if (local379.anInt197 == Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100) {
								@Pc(1429) String[] local1429 = local1332.aStringArray24;
								if (local1429 != null) {
									for (local79 = 4; local79 >= 0; local79--) {
										if (local1429[local79] != null) {
											@Pc(1441) short local1441 = 0;
											local97 = Static145.anInt2797;
											if (local79 == 0) {
												local1441 = 47;
											}
											if (local79 == 1) {
												local1441 = 48;
											}
											if (local79 == 2) {
												local1441 = 49;
											}
											if (local79 == 3) {
												local1441 = 57;
											}
											if (local79 == 4) {
												local1441 = 1010;
											}
											if (local1332.anInt3498 == local79) {
												local97 = local1332.anInt3533;
											}
											if (local79 == local1332.anInt3500) {
												local97 = local1332.anInt3514;
											}
											Static373.method5165(-1, "<col=00ffff>" + local1332.aString25, local379.anInt195, local379.anInt194, true, local1441, false, local1429[local79], local97, Static1.method56(local379.anInt195, local1323, local379.anInt194));
										}
									}
								}
							}
							Static373.method5165(-1, "<col=00ffff>" + local1332.aString25, local379.anInt195, local379.anInt194, true, 1004, Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 != local379.anInt197, Static256.aClass7_107.method331(Static341.anInt5770), Static138.anInt6310, (long) local1332.anInt3530);
						} else if (local379.anInt197 == Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100) {
							@Pc(1363) Class184 local1363 = Static161.anInt3018 == -1 ? null : Static400.aClass35_2.method867(Static161.anInt3018);
							if ((Static410.anInt6626 & 0x4) != 0 && (local1363 == null || local1332.method3030(local1363.anInt5018, Static161.anInt3018) != local1363.anInt5018)) {
								Static373.method5165(-1, Static289.aString63 + " -> <col=00ffff>" + local1332.aString25, local379.anInt195, local379.anInt194, true, 18, false, Static139.aString22, Static347.anInt5821, Static1.method56(local379.anInt195, local1323, local379.anInt194));
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)I")
	public static int method5255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5257(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static253.aStringArray29.length; local12++) {
			if (Static253.aStringArray29[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
