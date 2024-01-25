import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!du", name = "F", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method2290(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static309.anInt5850 = 0;
		Static115.anInt2494 = 0;
		Static489.anInt8492++;
		@Pc(19) int local19;
		if ((arg5 & 0x2) == 0) {
			for (local19 = 0; local19 < Static93.anIntArray83[local5]; local19++) {
				if (!Static136.method2562(Static276.aClass4_Sub1ArrayArray1[local5][local19], arg0, arg1, arg2, arg3)) {
					Static430.method6704(Static276.aClass4_Sub1ArrayArray1[local5][local19]);
					if (Static276.aClass4_Sub1ArrayArray1[local5][local19].anInt8918 != -1) {
						Static68.aClass4_Sub1Array1[Static309.anInt5850++] = Static276.aClass4_Sub1ArrayArray1[local5][local19];
					}
				}
			}
		}
		@Pc(115) int local115;
		@Pc(198) int local198;
		if ((arg5 & 0x1) == 0) {
			for (local19 = 0; local19 < Static62.anIntArray650[local5]; local19++) {
				if (!Static136.method2562(Static368.aClass4_Sub1ArrayArray2[local5][local19], arg0, arg1, arg2, arg3)) {
					Static430.method6704(Static368.aClass4_Sub1ArrayArray2[local5][local19]);
					if (Static368.aClass4_Sub1ArrayArray2[local5][local19].anInt8918 != -1) {
						Static225.aClass4_Sub1Array3[Static115.anInt2494++] = Static368.aClass4_Sub1ArrayArray2[local5][local19];
					}
				}
			}
			for (local115 = 0; local115 < Static582.anIntArray612[local5]; local115++) {
				if (!Static136.method2562(Static491.aClass4_Sub1ArrayArray3[local5][local115], arg0, arg1, arg2, arg3)) {
					if (Static491.aClass4_Sub1ArrayArray3[local5][local115].method7702()) {
						Static430.method6704(Static491.aClass4_Sub1ArrayArray3[local5][local115]);
						if (Static491.aClass4_Sub1ArrayArray3[local5][local115].anInt8918 != -1) {
							Static225.aClass4_Sub1Array3[Static115.anInt2494++] = Static491.aClass4_Sub1ArrayArray3[local5][local115];
						}
					} else {
						Static430.method6704(Static491.aClass4_Sub1ArrayArray3[local5][local115]);
						if (Static491.aClass4_Sub1ArrayArray3[local5][local115].anInt8918 != -1) {
							Static68.aClass4_Sub1Array1[Static309.anInt5850++] = Static491.aClass4_Sub1ArrayArray3[local5][local115];
						}
					}
				}
			}
			if (!arg0) {
				for (local198 = 0; local198 < Static270.anInt4932; local198++) {
					if (!Static136.method2562(Static290.aClass4_Sub1_Sub2Array1[local198], arg0, arg1, arg2, arg3)) {
						Static430.method6704(Static290.aClass4_Sub1_Sub2Array1[local198]);
						if (Static290.aClass4_Sub1_Sub2Array1[local198].anInt8918 != -1) {
							if (Static290.aClass4_Sub1_Sub2Array1[local198].method7702()) {
								Static225.aClass4_Sub1Array3[Static115.anInt2494++] = Static290.aClass4_Sub1_Sub2Array1[local198];
							} else {
								Static68.aClass4_Sub1Array1[Static309.anInt5850++] = Static290.aClass4_Sub1_Sub2Array1[local198];
							}
						}
					}
				}
			}
		}
		if (Static309.anInt5850 > 0) {
			Static285.method4570(Static68.aClass4_Sub1Array1, 0, Static309.anInt5850 - 1);
			for (local19 = 0; local19 < Static309.anInt5850; local19++) {
				Static446.method6926(Static68.aClass4_Sub1Array1[local19], arg6);
			}
		}
		if (Static633.aBoolean721) {
			Static232.aClass5_8.method7521(0, null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local19 = Static611.anInt9885; local19 < Static442.anInt7929; local19++) {
				@Pc(332) boolean[][] local332;
				@Pc(342) int local342;
				@Pc(349) int local349;
				@Pc(351) int local351;
				if (local19 < arg2 || arg1 == null) {
					local115 = Static579.aBooleanArrayArray7.length;
					if (Static573.anInt9445 + Static579.aBooleanArrayArray7.length > Static569.anInt9425) {
						local115 -= Static573.anInt9445 + Static579.aBooleanArrayArray7.length - Static569.anInt9425;
					}
					local198 = Static579.aBooleanArrayArray7[0].length;
					if (Static376.anInt7040 + Static579.aBooleanArrayArray7[0].length > Static293.anInt5181) {
						local198 -= Static376.anInt7040 + Static579.aBooleanArrayArray7[0].length - Static293.anInt5181;
					}
					local332 = Static358.aBooleanArrayArray5;
					if (Static574.aBoolean676) {
						if (Static557.aBoolean669) {
							local332 = Static251.aBooleanArrayArrayArray1[local19];
						}
						for (local342 = Static284.anInt5064; local342 < local115; local342++) {
							local349 = local342 + Static573.anInt9445 - Static284.anInt5064;
							for (local351 = Static184.anInt3541; local351 < local198; local351++) {
								if (Static579.aBooleanArrayArray7[local342][local351] && !Static69.method1704(local349, local351 + Static376.anInt7040 - Static184.anInt3541, local19)) {
									local332[local342][local351] = true;
								} else {
									local332[local342][local351] = false;
								}
							}
						}
					}
					if (Static557.aBoolean669) {
						if (arg4 >= 0) {
							Static364.aClass51Array3[local19].method7837(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static364.aClass51Array3[local19].method7833(0, 0, 0, null, false, arg5);
						}
						for (local342 = 0; local342 < Static502.anInt8651; local342++) {
							Static280.aClass291Array1[local342].method7259(new Class4_Sub3(local19 + 1));
						}
					} else if (arg4 >= 0) {
						Static364.aClass51Array3[local19].method7837(Static626.anInt10075, Static386.anInt7210, Static468.anInt10228, Static358.aBooleanArrayArray5, true, arg4, arg5);
					} else {
						Static364.aClass51Array3[local19].method7833(Static626.anInt10075, Static386.anInt7210, Static468.anInt10228, Static358.aBooleanArrayArray5, true, arg5);
					}
				} else {
					local115 = Static579.aBooleanArrayArray7.length;
					if (Static573.anInt9445 + Static579.aBooleanArrayArray7.length > Static569.anInt9425) {
						local115 -= Static573.anInt9445 + Static579.aBooleanArrayArray7.length - Static569.anInt9425;
					}
					local198 = Static579.aBooleanArrayArray7[0].length;
					if (Static376.anInt7040 + Static579.aBooleanArrayArray7[0].length > Static293.anInt5181) {
						local198 -= Static376.anInt7040 + Static579.aBooleanArrayArray7[0].length - Static293.anInt5181;
					}
					local332 = Static358.aBooleanArrayArray5;
					if (Static574.aBoolean676) {
						if (Static557.aBoolean669) {
							local332 = Static251.aBooleanArrayArrayArray1[local19];
						}
						for (local342 = Static284.anInt5064; local342 < local115; local342++) {
							local349 = local342 + Static573.anInt9445 - Static284.anInt5064;
							for (local351 = Static184.anInt3541; local351 < local198; local351++) {
								local332[local342][local351] = false;
								if (Static579.aBooleanArrayArray7[local342][local351]) {
									@Pc(370) int local370 = local351 + Static376.anInt7040 - Static184.anInt3541;
									for (@Pc(372) int local372 = local19; local372 >= 0; local372--) {
										if (Static330.aClass77ArrayArrayArray2[local372][local349][local370] != null && Static330.aClass77ArrayArrayArray2[local372][local349][local370].aByte23 == local19) {
											if ((local372 < arg2 || arg1[local372][local349][local370] != arg3) && !Static69.method1704(local349, local370, local19)) {
												local332[local342][local351] = true;
												break;
											}
											local332[local342][local351] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static557.aBoolean669) {
						if (arg4 >= 0) {
							Static364.aClass51Array3[local19].method7837(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static364.aClass51Array3[local19].method7833(0, 0, 0, null, false, arg5);
						}
						for (local342 = 0; local342 < Static502.anInt8651; local342++) {
							Static280.aClass291Array1[local342].method7259(new Class4_Sub3(local19 + 1));
						}
					} else if (arg4 >= 0) {
						Static364.aClass51Array3[local19].method7837(Static626.anInt10075, Static386.anInt7210, Static468.anInt10228, Static358.aBooleanArrayArray5, false, arg4, arg5);
					} else {
						Static364.aClass51Array3[local19].method7833(Static626.anInt10075, Static386.anInt7210, Static468.anInt10228, Static358.aBooleanArrayArray5, false, arg5);
					}
				}
			}
		}
		if (Static115.anInt2494 > 0) {
			Static225.method7338(Static225.aClass4_Sub1Array3, 0, Static115.anInt2494 - 1);
			for (local19 = 0; local19 < Static115.anInt2494; local19++) {
				Static446.method6926(Static225.aClass4_Sub1Array3[local19], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([[BILclient!du;)V")
	public static void method2292(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class81_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(44) int local44;
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt2418; local14++) {
			Static1.method8294();
			for (local20 = 0; local20 < Static634.anInt10129 >> 3; local20++) {
				for (local24 = 0; local24 < Static638.anInt10172 >> 3; local24++) {
					local34 = Static193.anIntArrayArrayArray10[local14][local20][local24];
					if (local34 != -1) {
						local44 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean164 || local44 == 0) {
							@Pc(58) int local58 = local34 >> 1 & 0x3;
							@Pc(64) int local64 = local34 >> 14 & 0x3FF;
							@Pc(70) int local70 = local34 >> 3 & 0x7FF;
							@Pc(80) int local80 = (local64 / 8 << 8) + local70 / 8;
							for (@Pc(82) int local82 = 0; local82 < Static351.anIntArray405.length; local82++) {
								if (local80 == Static351.anIntArray405[local82] && arg0[local82] != null) {
									@Pc(104) Class3_Sub3 local104 = new Class3_Sub3(arg0[local82]);
									arg1.method2281(local24 * 8, local64, local58, local20 * 8, local70, local14, local104, local44, Static271.aClass105Array1);
									arg1.method2295(local14, local24 * 8, local44, local20 * 8, local58, local70, Static323.aClass5_9, local12[0] == -1 ? local12 : null, local104, local64);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg1.anInt2418; local20++) {
			Static1.method8294();
			for (local24 = 0; local24 < Static634.anInt10129 >> 3; local24++) {
				for (local34 = 0; local34 < Static638.anInt10172 >> 3; local34++) {
					local44 = Static193.anIntArrayArrayArray10[local20][local24][local34];
					if (local44 == -1) {
						arg1.method2287(local34 * 8, local20, 8, local24 * 8, 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static175.aClass327_1 = Static300.aClass186_1.method4651(local12[2], local12[3], local12[0], local12[1], Static229.aClass306_1);
			Static573.anInt9447 = local12[4];
		}
	}
}
