import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "Lclient!kea;")
	public static Class161 aClass161_84;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Lclient!cq;")
	public static Class53 aClass53_15;

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
	public static int anInt6895;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "[[[Lclient!uaa;")
	public static Class290[][][] aClass290ArrayArrayArray9;

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_120 = new Class133(20, 3);

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_121 = new Class133(31, 14);

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_111 = new Class67("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!oa;II)V")
	public static void method5779(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static72.anInt1604 == 0 || Static149.anInt2991 == 0) {
			return;
		}
		arg1.m(Static200.anInt9267, Static83.anInt1817, Static72.anInt1604, Static149.anInt2991);
		arg1.ca(Static489.anInt8713, Static216.anInt2086, Static72.anInt1604, Static149.anInt2991);
		@Pc(38) Class205 local38 = arg1.method7409();
		local38.pa(Static104.anInt2328, Static166.anInt6799, Static174.anInt3992, Static544.anInt9409, Static289.anInt5875, Static237.anInt4966);
		arg1.method7469(local38);
		@Pc(58) int local58;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(88) int local88;
		@Pc(96) int local96;
		@Pc(111) int[] local111;
		@Pc(143) int local143;
		@Pc(152) int local152;
		if (Static163.aClass52Array4 != null) {
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			local58 = arg1.U();
			local67 = local58 * (arg2 - Static200.anInt9267) / Static72.anInt1604;
			local76 = local58 * (arg0 - Static83.anInt1817) / Static149.anInt2991;
			local79 = arg1.IA();
			local88 = (arg2 - Static200.anInt9267) * local79 / Static72.anInt1604;
			local96 = (arg0 - Static83.anInt1817) * local79 / Static149.anInt2991;
			local111 = new int[] { local67, local76, local58 };
			local38.O(local111);
			@Pc(129) int[] local129 = new int[] { local88, local96, local79 };
			local38.O(local129);
			@Pc(134) float local134 = 0.0F;
			local143 = local129[0] - local111[0];
			local152 = local129[1] - local111[1];
			@Pc(161) int local161 = local129[2] - local111[2];
			while (local134 < 1.0F) {
				@Pc(174) int local174 = (int) ((float) local111[0] + (float) local143 * local134);
				@Pc(178) int local178 = local174 >> 9;
				@Pc(189) int local189 = (int) ((float) local111[2] + (float) local161 * local134);
				@Pc(193) int local193 = local189 >> 9;
				if (local178 > 0 && local193 > 0 && Static118.anInt2527 > local178 && local193 < Static549.anInt9482) {
					@Pc(217) int local217 = Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100;
					if (local217 < 3 && (Static232.aByteArrayArrayArray18[1][local178][local193] & 0x2) != 0) {
						local217++;
					}
					if ((float) Static163.aClass52Array4[local217].sa(local174, local189) < local134 * (float) local152 + (float) local111[1]) {
						local53 = local174 + (Static111.aClass6_Sub1_Sub2_Sub1_3.method7083() - 1 << 8) >> 9;
						local55 = local189 + (Static111.aClass6_Sub1_Sub2_Sub1_3.method7083() - 1 << 8) >> 9;
						break;
					}
				}
				local134 = (float) ((double) local134 + 0.01D);
			}
			if (local53 != -1 && local55 != -1) {
				if (Static506.aBoolean659 && (Static170.anInt3907 & 0x40) != 0) {
					@Pc(309) Class245 local309 = Static80.method1631(Static508.anInt8865, Static448.anInt8198);
					if (local309 == null) {
						Static320.method5152();
					} else {
						Static507.method7642(true, " ->", -1, Static88.aString19, Static46.anInt1080, local55, local53, false, 44, 0L);
					}
				} else {
					if (Static222.aClass44_2 == Static332.aClass44_4) {
						Static507.method7642(true, "", -1, Static116.aClass67_32.method1934(Static193.anInt7803), -1, local55, local53, false, 23, 0L);
					}
					Static507.method7642(true, "", -1, Static441.aString63, Static54.anInt1188, local55, local53, false, 21, 0L);
				}
			}
		}
		@Pc(367) Class90 local367 = Static210.aClass90_9;
		for (@Pc(372) Class4_Sub1 local372 = (Class4_Sub1) local367.method2326(); local372 != null; local372 = (Class4_Sub1) local367.method2325()) {
			if ((Static9.aBoolean522 || local372.anInt163 == Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100) && local372.method222(arg1, arg0, arg2)) {
				@Pc(508) int local508;
				@Pc(520) int local520;
				if (local372.aClass6_1 instanceof Class6_Sub1_Sub2_Sub1) {
					@Pc(401) Class6_Sub1_Sub2_Sub1 local401 = (Class6_Sub1_Sub2_Sub1) local372.aClass6_1;
					local67 = local401.method7083();
					if ((local67 & 0x1) == 0 && (local401.anInt8811 & 0x1FF) == 0 && (local401.anInt8813 & 0x1FF) == 0 || (local67 & 0x1) == 1 && (local401.anInt8811 & 0x1FF) == 256 && (local401.anInt8813 & 0x1FF) == 256) {
						local76 = local401.anInt8811 - (local401.method7083() - 1 << 8);
						local79 = local401.anInt8813 - (local401.method7083() - 1 << 8);
						for (local88 = 0; local88 < Static221.anInt4798; local88++) {
							@Pc(482) Class3_Sub3 local482 = (Class3_Sub3) Static240.aClass267_20.method6644((long) Static3.anIntArray80[local88]);
							if (local482 != null) {
								@Pc(487) Class6_Sub1_Sub2_Sub2 local487 = local482.aClass6_Sub1_Sub2_Sub2_1;
								if (Static223.anInt4829 != local487.anInt8535 && local487.aBoolean631) {
									local508 = local487.anInt8811 - (local487.aClass230_1.anInt7040 - 1 << 8);
									local520 = local487.anInt8813 - (local487.aClass230_1.anInt7040 - 1 << 8);
									if (local76 <= local508 && local487.aClass230_1.anInt7040 <= local401.method7083() - (local508 - local76 >> 9) && local520 >= local79 && local487.aClass230_1.anInt7040 <= local401.method7083() - (local520 - local79 >> 9)) {
										Static327.method5232(local487, Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 != local372.anInt163);
										local487.anInt8535 = Static223.anInt4829;
									}
								}
							}
						}
						local96 = Static235.anInt2721;
						local111 = Static130.anIntArray267;
						for (local508 = 0; local508 < local96; local508++) {
							@Pc(603) Class6_Sub1_Sub2_Sub1 local603 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local111[local508]];
							if (local603 != null && Static223.anInt4829 != local603.anInt8535 && local401 != local603 && local603.aBoolean631) {
								local143 = local603.anInt8811 - (local603.method7083() - 1 << 8);
								local152 = local603.anInt8813 - (local603.method7083() - 1 << 8);
								if (local76 <= local143 && local603.method7083() <= local401.method7083() - (local143 - local76 >> 9) && local152 >= local79 && local603.method7083() <= local401.method7083() - (local152 - local79 >> 9)) {
									Static320.method5155(local372.anInt163 != Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100, local603);
									local603.anInt8535 = Static223.anInt4829;
								}
							}
						}
					}
					if (local401.anInt8535 == Static223.anInt4829) {
						continue;
					}
					Static320.method5155(Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 != local372.anInt163, local401);
					local401.anInt8535 = Static223.anInt4829;
				}
				@Pc(844) int local844;
				if (local372.aClass6_1 instanceof Class6_Sub1_Sub2_Sub2) {
					@Pc(733) Class6_Sub1_Sub2_Sub2 local733 = (Class6_Sub1_Sub2_Sub2) local372.aClass6_1;
					if (local733.aClass230_1 != null) {
						if ((local733.aClass230_1.anInt7040 & 0x1) == 0 && (local733.anInt8811 & 0x1FF) == 0 && (local733.anInt8813 & 0x1FF) == 0 || (local733.aClass230_1.anInt7040 & 0x1) == 1 && (local733.anInt8811 & 0x1FF) == 256 && (local733.anInt8813 & 0x1FF) == 256) {
							local67 = local733.anInt8811 - (local733.aClass230_1.anInt7040 - 1 << 8);
							local76 = local733.anInt8813 - (local733.aClass230_1.anInt7040 - 1 << 8);
							for (local79 = 0; local79 < Static221.anInt4798; local79++) {
								@Pc(811) Class3_Sub3 local811 = (Class3_Sub3) Static240.aClass267_20.method6644((long) Static3.anIntArray80[local79]);
								if (local811 != null) {
									@Pc(816) Class6_Sub1_Sub2_Sub2 local816 = local811.aClass6_Sub1_Sub2_Sub2_1;
									if (local816.anInt8535 != Static223.anInt4829 && local816 != local733 && local816.aBoolean631) {
										local844 = local816.anInt8811 - (local816.aClass230_1.anInt7040 - 1 << 8);
										local508 = local816.anInt8813 - (local816.aClass230_1.anInt7040 - 1 << 8);
										if (local67 <= local844 && local733.aClass230_1.anInt7040 - (local844 - local67 >> 9) >= local816.aClass230_1.anInt7040 && local508 >= local76 && local733.aClass230_1.anInt7040 - (local508 - local76 >> 9) >= local816.aClass230_1.anInt7040) {
											Static327.method5232(local816, Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 != local372.anInt163);
											local816.anInt8535 = Static223.anInt4829;
										}
									}
								}
							}
							local88 = Static235.anInt2721;
							@Pc(922) int[] local922 = Static130.anIntArray267;
							for (local844 = 0; local844 < local88; local844++) {
								@Pc(932) Class6_Sub1_Sub2_Sub1 local932 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local922[local844]];
								if (local932 != null && Static223.anInt4829 != local932.anInt8535 && local932.aBoolean631) {
									local520 = local932.anInt8811 - (local932.method7083() - 1 << 8);
									local143 = local932.anInt8813 - (local932.method7083() - 1 << 8);
									if (local520 >= local67 && local932.method7083() <= local733.aClass230_1.anInt7040 - (local520 - local67 >> 9) && local143 >= local76 && local932.method7083() <= local733.aClass230_1.anInt7040 - (local143 - local76 >> 9)) {
										Static320.method5155(Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 != local372.anInt163, local932);
										local932.anInt8535 = Static223.anInt4829;
									}
								}
							}
						}
						if (local733.anInt8535 == Static223.anInt4829) {
							continue;
						}
						Static327.method5232(local733, local372.anInt163 != Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100);
						local733.anInt8535 = Static223.anInt4829;
					}
				}
				if (local372.aClass6_1 instanceof Class6_Sub5_Sub1) {
					local58 = local372.anInt165 + Static223.anInt4827;
					local67 = Static150.anInt3027 + local372.anInt164;
					@Pc(1086) Class3_Sub12 local1086 = (Class3_Sub12) Static476.aClass267_37.method6644((long) (local58 | local372.anInt163 << 28 | local67 << 14));
					if (local1086 != null) {
						for (@Pc(1096) Class3_Sub32 local1096 = (Class3_Sub32) local1086.aClass71_13.method2081(); local1096 != null; local1096 = (Class3_Sub32) local1086.aClass71_13.method2082()) {
							@Pc(1106) Class27 local1106 = Static99.aClass96_7.method2508(local1096.anInt5999);
							if (Static506.aBoolean659 && Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 == local372.anInt163) {
								@Pc(1127) Class244 local1127 = Static262.anInt5489 == -1 ? null : Static37.aClass121_1.method3431(Static262.anInt5489);
								if ((Static170.anInt3907 & 0x1) != 0 && (local1127 == null || local1106.method830(local1127.anInt7213, Static262.anInt5489) != local1127.anInt7213)) {
									Static507.method7642(true, Static117.aString29 + " -> <col=ff9040>" + local1106.aString8, -1, Static88.aString19, Static46.anInt1080, local372.anInt164, local372.anInt165, false, 15, (long) local1096.anInt5999);
								}
							}
							if (Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 == local372.anInt163) {
								@Pc(1193) String[] local1193 = local1106.aStringArray6;
								for (local844 = 4; local844 >= 0; local844--) {
									if (local1193 != null && local1193[local844] != null) {
										@Pc(1205) byte local1205 = 0;
										local520 = Static182.anInt4203;
										if (local844 == 0) {
											local1205 = 12;
										}
										if (local844 == 1) {
											local1205 = 59;
										}
										if (local844 == 2) {
											local1205 = 51;
										}
										if (local844 == 3) {
											local1205 = 11;
										}
										if (local844 == 4) {
											local1205 = 30;
										}
										if (local1106.anInt849 == local844) {
											local520 = local1106.anInt867;
										}
										if (local1106.lb == local844) {
											local520 = local1106.anInt825;
										}
										Static507.method7642(true, "<col=ff9040>" + local1106.aString8, -1, local1193[local844], local520, local372.anInt164, local372.anInt165, false, local1205, (long) local1096.anInt5999);
									}
								}
							}
							Static507.method7642(true, "<col=ff9040>" + local1106.aString8, -1, Static64.aClass67_19.method1934(Static193.anInt7803), Static325.anInt6214, local372.anInt164, local372.anInt165, Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 != local372.anInt163, 1010, (long) local1096.anInt5999);
						}
					}
				}
				if (local372.aClass6_1 instanceof Interface15) {
					@Pc(1342) Interface15 local1342 = (Interface15) local372.aClass6_1;
					@Pc(1349) Class242 local1349 = Static454.aClass298_3.method7185(local1342.method7758());
					if (local1349.anIntArray632 != null) {
						local1349 = local1349.method5975(Static127.aClass215_1);
					}
					if (local1349 != null) {
						if (Static506.aBoolean659 && local372.anInt163 == Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100) {
							@Pc(1382) Class244 local1382 = Static262.anInt5489 == -1 ? null : Static37.aClass121_1.method3431(Static262.anInt5489);
							if ((Static170.anInt3907 & 0x4) != 0 && (local1382 == null || local1349.method5983(local1382.anInt7213, Static262.anInt5489) != local1382.anInt7213)) {
								Static507.method7642(true, Static117.aString29 + " -> <col=00ffff>" + local1349.aString52, -1, Static88.aString19, Static46.anInt1080, local372.anInt164, local372.anInt165, false, 9, Static85.method1755(local372.anInt165, local372.anInt164, local1342));
							}
						}
						if (Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 == local372.anInt163) {
							@Pc(1439) String[] local1439 = local1349.aStringArray43;
							if (local1439 != null) {
								for (local79 = 4; local79 >= 0; local79--) {
									if (local1439[local79] != null) {
										@Pc(1451) short local1451 = 0;
										local96 = Static182.anInt4203;
										if (local79 == 0) {
											local1451 = 22;
										}
										if (local79 == 1) {
											local1451 = 5;
										}
										if (local79 == 2) {
											local1451 = 6;
										}
										if (local79 == 3) {
											local1451 = 10;
										}
										if (local79 == 4) {
											local1451 = 1012;
										}
										if (local79 == local1349.anInt7159) {
											local96 = local1349.anInt7196;
										}
										if (local1349.anInt7169 == local79) {
											local96 = local1349.anInt7185;
										}
										Static507.method7642(true, "<col=00ffff>" + local1349.aString52, -1, local1439[local79], local96, local372.anInt164, local372.anInt165, false, local1451, Static85.method1755(local372.anInt165, local372.anInt164, local1342));
									}
								}
							}
						}
						Static507.method7642(true, "<col=00ffff>" + local1349.aString52, -1, Static64.aClass67_19.method1934(Static193.anInt7803), Static325.anInt6214, local372.anInt164, local372.anInt165, local372.anInt163 != Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100, 1008, (long) local1349.anInt7168);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Z")
	public static boolean method5780(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIB)V")
	public static void method5783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < arg2) {
			Static257.method4540(Static68.anIntArrayArray24[arg0], arg3, arg1, arg2);
		} else {
			Static257.method4540(Static68.anIntArrayArray24[arg0], arg3, arg2, arg1);
		}
	}
}
