import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
	public static int anInt5640;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "Lclient!ec;")
	public static Class62 aClass62_2;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_49 = new Class156();

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "[I")
	public static final int[] anIntArray497 = new int[1000];

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "Lclient!vv;")
	public static final Class261 aClass261_10 = new Class261();

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_117 = new Class211(35, -2);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!za;IIZ)V")
	public static void method4465(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static359.anInt6064 == 0 || Static180.anInt3090 == 0) {
			return;
		}
		arg0.GA(Static318.anInt5478, Static393.anInt6471, Static359.anInt6064, Static180.anInt3090);
		arg0.ba(Static447.anInt7168, Static396.anInt7304, Static359.anInt6064, Static180.anInt3090);
		@Pc(35) Class31 local35 = arg0.method5566();
		local35.YA(Static303.anInt5016, Static31.anInt593, Static255.anInt4112, Static26.anInt460, Static56.anInt1029, Static85.anInt1705);
		arg0.SA(local35);
		@Pc(55) int local55;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(109) int[] local109;
		@Pc(141) int local141;
		@Pc(150) int local150;
		if (Static314.aClass162Array2 != null) {
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			local55 = arg0.AA();
			local64 = (arg2 - Static318.anInt5478) * local55 / Static359.anInt6064;
			local73 = (arg1 - Static393.anInt6471) * local55 / Static180.anInt3090;
			local76 = arg0.r();
			local85 = (arg2 - Static318.anInt5478) * local76 / Static359.anInt6064;
			local94 = (arg1 - Static393.anInt6471) * local76 / Static180.anInt3090;
			local109 = new int[] { local64, local73, local55 };
			local35.wa(local109);
			@Pc(127) int[] local127 = new int[] { local85, local94, local76 };
			local35.wa(local127);
			@Pc(132) float local132 = 0.0F;
			local141 = local127[0] - local109[0];
			local150 = local127[1] - local109[1];
			@Pc(159) int local159 = local127[2] - local109[2];
			while (local132 < 1.0F) {
				@Pc(172) int local172 = (int) (local132 * (float) local141 + (float) local109[0]);
				@Pc(176) int local176 = local172 >> 7;
				@Pc(187) int local187 = (int) ((float) local109[2] + (float) local159 * local132);
				@Pc(191) int local191 = local187 >> 7;
				if (local176 > 0 && local191 > 0 && local176 < Static166.anInt2852 && local191 < Static426.anInt6923) {
					@Pc(215) int local215 = Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91;
					if (local215 < 3 && (Static253.aByteArrayArrayArray11[1][local176][local191] & 0x2) != 0) {
						local215++;
					}
					if ((float) Static314.aClass162Array2[local215].ca(local172, local187) < (float) local109[1] + (float) local150 * local132) {
						local50 = local172 + (Static60.aClass3_Sub4_Sub1_Sub2_1.method4009() - 1 << 6) >> 7;
						local52 = local187 + (Static60.aClass3_Sub4_Sub1_Sub2_1.method4009() - 1 << 6) >> 7;
						break;
					}
				}
				local132 = (float) ((double) local132 + 0.01D);
			}
			if (local50 != -1 && local52 != -1) {
				if (Static215.aBoolean217 && (Static256.anInt2800 & 0x40) != 0) {
					@Pc(308) Class16 local308 = Static4.method73(Static368.anInt6200, Static368.anInt6201);
					if (local308 == null) {
						Static377.method3604();
					} else {
						Static153.method2190(local50, Static76.aString45, true, Static201.anInt3379, " ->", -1, local52, 59, false, 0L);
					}
				} else {
					if (Static118.aClass4_1 == Static270.aClass4_3) {
						Static153.method2190(local50, Static419.aClass134_100.method2720(Static331.anInt5597), true, -1, "", -1, local52, 50, false, 0L);
					}
					Static153.method2190(local50, Static2.aString2, true, Static46.anInt817, "", -1, local52, 10, false, 0L);
				}
			}
		}
		@Pc(364) Class93 local364 = Static212.aClass93_3;
		for (@Pc(373) Class21_Sub6 local373 = (Class21_Sub6) local364.method2080(); local373 != null; local373 = (Class21_Sub6) local364.method2081()) {
			if ((Static131.aBoolean155 || local373.anInt5552 == Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91) && local373.method4408(arg1, arg2, arg0)) {
				@Pc(497) int local497;
				@Pc(509) int local509;
				if (local373.aClass3_1 instanceof Class3_Sub4_Sub1_Sub2) {
					@Pc(397) Class3_Sub4_Sub1_Sub2 local397 = (Class3_Sub4_Sub1_Sub2) local373.aClass3_1;
					local64 = local397.method4009();
					if ((local64 & 0x1) == 0 && (local397.anInt6833 & 0x7F) == 0 && (local397.anInt6835 & 0x7F) == 0 || (local64 & 0x1) == 1 && (local397.anInt6833 & 0x7F) == 64 && (local397.anInt6835 & 0x7F) == 64) {
						local73 = local397.anInt6833 - (local397.method4009() - 1 << 6);
						local76 = local397.anInt6835 - (local397.method4009() - 1 << 6);
						for (local85 = 0; local85 < Static351.anInt5969; local85++) {
							@Pc(471) Class2_Sub28 local471 = (Class2_Sub28) Static49.aClass72_11.method1659((long) Static40.anIntArray84[local85]);
							if (local471 != null) {
								@Pc(476) Class3_Sub4_Sub1_Sub1 local476 = local471.aClass3_Sub4_Sub1_Sub1_1;
								if (local476.anInt4970 != Static266.anInt4392 && local476.aBoolean351) {
									local497 = local476.anInt6833 - (local476.aClass245_1.anInt6704 - 1 << 6);
									local509 = local476.anInt6835 - (local476.aClass245_1.anInt6704 - 1 << 6);
									if (local73 <= local497 && local476.aClass245_1.anInt6704 <= local397.method4009() - (local497 - local73 >> 7) && local76 <= local509 && local476.aClass245_1.anInt6704 <= local397.method4009() - (local509 - local76 >> 7)) {
										Static383.method4930(local476, Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 != local373.anInt5552);
										local476.anInt4970 = Static266.anInt4392;
									}
								}
							}
						}
						local94 = Static119.anInt2204;
						local109 = Static200.anIntArray295;
						for (local497 = 0; local497 < local94; local497++) {
							@Pc(592) Class3_Sub4_Sub1_Sub2 local592 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local109[local497]];
							if (local592 != null && local592.anInt4970 != Static266.anInt4392 && local397 != local592 && local592.aBoolean351) {
								local141 = local592.anInt6833 - (local592.method4009() - 1 << 6);
								local150 = local592.anInt6835 - (local592.method4009() - 1 << 6);
								if (local73 <= local141 && local592.method4009() <= local397.method4009() - (local141 - local73 >> 7) && local76 <= local150 && local592.method4009() <= local397.method4009() - (local150 - local76 >> 7)) {
									Static81.method1179(local592, Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 != local373.anInt5552);
									local592.anInt4970 = Static266.anInt4392;
								}
							}
						}
					}
					if (Static266.anInt4392 == local397.anInt4970) {
						continue;
					}
					Static81.method1179(local397, local373.anInt5552 != Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91);
					local397.anInt4970 = Static266.anInt4392;
				}
				@Pc(840) int local840;
				if (local373.aClass3_1 instanceof Class3_Sub4_Sub1_Sub1) {
					@Pc(729) Class3_Sub4_Sub1_Sub1 local729 = (Class3_Sub4_Sub1_Sub1) local373.aClass3_1;
					if (local729.aClass245_1 != null) {
						if ((local729.aClass245_1.anInt6704 & 0x1) == 0 && (local729.anInt6833 & 0x7F) == 0 && (local729.anInt6835 & 0x7F) == 0 || (local729.aClass245_1.anInt6704 & 0x1) == 1 && (local729.anInt6833 & 0x7F) == 64 && (local729.anInt6835 & 0x7F) == 64) {
							local64 = local729.anInt6833 - (local729.aClass245_1.anInt6704 - 1 << 6);
							local73 = local729.anInt6835 - (local729.aClass245_1.anInt6704 - 1 << 6);
							for (local76 = 0; local76 < Static351.anInt5969; local76++) {
								@Pc(811) Class2_Sub28 local811 = (Class2_Sub28) Static49.aClass72_11.method1659((long) Static40.anIntArray84[local76]);
								if (local811 != null) {
									@Pc(816) Class3_Sub4_Sub1_Sub1 local816 = local811.aClass3_Sub4_Sub1_Sub1_1;
									if (Static266.anInt4392 != local816.anInt4970 && local816 != local729 && local816.aBoolean351) {
										local840 = local816.anInt6833 - (local816.aClass245_1.anInt6704 - 1 << 6);
										local497 = local816.anInt6835 - (local816.aClass245_1.anInt6704 - 1 << 6);
										if (local840 >= local64 && local816.aClass245_1.anInt6704 <= local729.aClass245_1.anInt6704 - (local840 - local64 >> 7) && local73 <= local497 && local816.aClass245_1.anInt6704 <= local729.aClass245_1.anInt6704 - (local497 - local73 >> 7)) {
											Static383.method4930(local816, local373.anInt5552 != Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91);
											local816.anInt4970 = Static266.anInt4392;
										}
									}
								}
							}
							local85 = Static119.anInt2204;
							@Pc(926) int[] local926 = Static200.anIntArray295;
							for (local840 = 0; local840 < local85; local840++) {
								@Pc(936) Class3_Sub4_Sub1_Sub2 local936 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local926[local840]];
								if (local936 != null && Static266.anInt4392 != local936.anInt4970 && local936.aBoolean351) {
									local509 = local936.anInt6833 - (local936.method4009() - 1 << 6);
									local141 = local936.anInt6835 - (local936.method4009() - 1 << 6);
									if (local509 >= local64 && local936.method4009() <= local729.aClass245_1.anInt6704 - (local509 - local64 >> 7) && local141 >= local73 && local936.method4009() <= local729.aClass245_1.anInt6704 - (local141 - local73 >> 7)) {
										Static81.method1179(local936, local373.anInt5552 != Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91);
										local936.anInt4970 = Static266.anInt4392;
									}
								}
							}
						}
						if (Static266.anInt4392 == local729.anInt4970) {
							continue;
						}
						Static383.method4930(local729, local373.anInt5552 != Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91);
						local729.anInt4970 = Static266.anInt4392;
					}
				}
				if (local373.aClass3_1 instanceof Class3_Sub1_Sub1) {
					local55 = local373.anInt5556 + Static275.anInt4506;
					local64 = Static209.anInt3497 + local373.anInt5558;
					@Pc(1098) Class2_Sub12 local1098 = (Class2_Sub12) Static201.aClass72_21.method1659((long) (local64 << 14 | local373.anInt5552 << 28 | local55));
					if (local1098 != null) {
						for (@Pc(1106) Class2_Sub37 local1106 = (Class2_Sub37) local1098.aClass156_9.method3163(); local1106 != null; local1106 = (Class2_Sub37) local1098.aClass156_9.method3160()) {
							@Pc(1114) Class208 local1114 = Static384.aClass164_2.method3458(local1106.anInt4632);
							if (!Static215.aBoolean217) {
								if (Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 == local373.anInt5552) {
									@Pc(1124) String[] local1124 = local1114.aStringArray33;
									for (local840 = 4; local840 >= 0; local840--) {
										if (local1124 != null && local1124[local840] != null) {
											@Pc(1136) byte local1136 = 0;
											if (local840 == 0) {
												local1136 = 20;
											}
											local509 = Static235.anInt3807;
											if (local840 == 1) {
												local1136 = 30;
											}
											if (local840 == 2) {
												local1136 = 47;
											}
											if (local840 == 3) {
												local1136 = 44;
											}
											if (local840 == 4) {
												local1136 = 48;
											}
											if (local840 == local1114.anInt5697) {
												local509 = local1114.anInt5665;
											}
											if (local1114.anInt5676 == local840) {
												local509 = local1114.anInt5674;
											}
											Static153.method2190(local373.anInt5556, local1124[local840], true, local509, "<col=ff9040>" + local1114.lb, -1, local373.anInt5558, local1136, false, (long) local1106.anInt4632);
										}
									}
								}
								Static153.method2190(local373.anInt5556, Static138.aClass134_49.method2720(Static331.anInt5597), true, Static63.anInt1184, "<col=ff9040>" + local1114.lb, -1, local373.anInt5558, 1006, Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 != local373.anInt5552, (long) local1106.anInt4632);
							} else if (local373.anInt5552 == Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91) {
								@Pc(1277) Class200 local1277 = Static405.anInt6628 == -1 ? null : Static234.aClass135_1.method2749(Static405.anInt6628);
								if ((Static256.anInt2800 & 0x1) != 0 && (local1277 == null || local1114.method4477(local1277.anInt5511, Static405.anInt6628) != local1277.anInt5511)) {
									Static153.method2190(local373.anInt5556, Static76.aString45, true, Static201.anInt3379, Static408.aString205 + " -> <col=ff9040>" + local1114.lb, -1, local373.anInt5558, 51, false, (long) local1106.anInt4632);
								}
							}
						}
					}
				}
				if (local373.aClass3_1 instanceof Interface2) {
					@Pc(1345) Interface2 local1345 = (Interface2) local373.aClass3_1;
					@Pc(1352) Class192 local1352 = Static50.aClass190_1.method4218(local1345.method5292());
					if (local1352.anIntArray434 != null) {
						local1352 = local1352.method4228(Static138.aClass268_1);
					}
					if (local1352 != null) {
						if (!Static215.aBoolean217) {
							if (Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 == local373.anInt5552) {
								@Pc(1453) String[] local1453 = local1352.aStringArray30;
								if (local1453 != null) {
									for (local76 = 4; local76 >= 0; local76--) {
										if (local1453[local76] != null) {
											@Pc(1465) short local1465 = 0;
											if (local76 == 0) {
												local1465 = 15;
											}
											local94 = Static235.anInt3807;
											if (local76 == 1) {
												local1465 = 17;
											}
											if (local76 == 2) {
												local1465 = 46;
											}
											if (local76 == 3) {
												local1465 = 5;
											}
											if (local76 == local1352.lb) {
												local94 = local1352.anInt5349;
											}
											if (local76 == 4) {
												local1465 = 1007;
											}
											if (local1352.anInt5317 == local76) {
												local94 = local1352.anInt5358;
											}
											Static153.method2190(local373.anInt5556, local1453[local76], true, local94, "<col=00ffff>" + local1352.aString152, -1, local373.anInt5558, local1465, false, Static422.method5328(local373.anInt5556, local1345, local373.anInt5558));
										}
									}
								}
							}
							Static153.method2190(local373.anInt5556, Static138.aClass134_49.method2720(Static331.anInt5597), true, Static63.anInt1184, "<col=00ffff>" + local1352.aString152, -1, local373.anInt5558, 1009, Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91 != local373.anInt5552, (long) local1352.anInt5325);
						} else if (local373.anInt5552 == Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91) {
							@Pc(1379) Class200 local1379 = Static405.anInt6628 == -1 ? null : Static234.aClass135_1.method2749(Static405.anInt6628);
							if ((Static256.anInt2800 & 0x4) != 0 && (local1379 == null || local1352.method4237(Static405.anInt6628, local1379.anInt5511) != local1379.anInt5511)) {
								Static153.method2190(local373.anInt5556, Static76.aString45, true, Static201.anInt3379, Static408.aString205 + " -> <col=00ffff>" + local1352.aString152, -1, local373.anInt5558, 2, false, Static422.method5328(local373.anInt5556, local1345, local373.anInt5558));
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V")
	public static void method4466() {
		Static84.aClass2_Sub1_Sub2_3.method572();
		Static412.aClass54_111 = null;
		Static76.anInt1460 = 1;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IB)I")
	public static int method4468(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
