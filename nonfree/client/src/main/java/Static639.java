import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
	public static int anInt10303;

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
	public static int anInt10305;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_357 = new Class288(85, 5);

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_358 = new Class288(120, 7);

	@OriginalMember(owner = "client!wq", name = "p", descriptor = "[F")
	public static final float[] aFloatArray84 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_359 = new Class288(73, 4);

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
	public static int anInt10304 = 0;

	@OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
	public static int anInt10306 = 0;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method8584(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static508.anInt8493 = 0;
		Static478.anInt9923 = 0;
		Static153.anInt2750++;
		@Pc(19) int local19;
		if ((arg5 & 0x2) == 0) {
			for (local19 = 0; local19 < Static369.anIntArray426[local5]; local19++) {
				if (!Static154.method2285(Static597.aClass13_Sub1ArrayArray3[local5][local19], arg0, arg1, arg2, arg3)) {
					Static620.method8304(Static597.aClass13_Sub1ArrayArray3[local5][local19]);
					if (Static597.aClass13_Sub1ArrayArray3[local5][local19].anInt10091 != -1) {
						Static466.aClass13_Sub1Array3[Static508.anInt8493++] = Static597.aClass13_Sub1ArrayArray3[local5][local19];
					}
				}
			}
		}
		@Pc(115) int local115;
		@Pc(198) int local198;
		if ((arg5 & 0x1) == 0) {
			for (local19 = 0; local19 < Static28.anIntArray63[local5]; local19++) {
				if (!Static154.method2285(Static417.aClass13_Sub1ArrayArray2[local5][local19], arg0, arg1, arg2, arg3)) {
					Static620.method8304(Static417.aClass13_Sub1ArrayArray2[local5][local19]);
					if (Static417.aClass13_Sub1ArrayArray2[local5][local19].anInt10091 != -1) {
						Static495.aClass13_Sub1Array2[Static478.anInt9923++] = Static417.aClass13_Sub1ArrayArray2[local5][local19];
					}
				}
			}
			for (local115 = 0; local115 < Static497.anIntArray571[local5]; local115++) {
				if (!Static154.method2285(Static139.aClass13_Sub1ArrayArray1[local5][local115], arg0, arg1, arg2, arg3)) {
					if (Static139.aClass13_Sub1ArrayArray1[local5][local115].method8413()) {
						Static620.method8304(Static139.aClass13_Sub1ArrayArray1[local5][local115]);
						if (Static139.aClass13_Sub1ArrayArray1[local5][local115].anInt10091 != -1) {
							Static495.aClass13_Sub1Array2[Static478.anInt9923++] = Static139.aClass13_Sub1ArrayArray1[local5][local115];
						}
					} else {
						Static620.method8304(Static139.aClass13_Sub1ArrayArray1[local5][local115]);
						if (Static139.aClass13_Sub1ArrayArray1[local5][local115].anInt10091 != -1) {
							Static466.aClass13_Sub1Array3[Static508.anInt8493++] = Static139.aClass13_Sub1ArrayArray1[local5][local115];
						}
					}
				}
			}
			if (!arg0) {
				for (local198 = 0; local198 < Static332.anInt5259; local198++) {
					if (!Static154.method2285(Static335.aClass13_Sub1_Sub1Array1[local198], arg0, arg1, arg2, arg3)) {
						Static620.method8304(Static335.aClass13_Sub1_Sub1Array1[local198]);
						if (Static335.aClass13_Sub1_Sub1Array1[local198].anInt10091 != -1) {
							if (Static335.aClass13_Sub1_Sub1Array1[local198].method8413()) {
								Static495.aClass13_Sub1Array2[Static478.anInt9923++] = Static335.aClass13_Sub1_Sub1Array1[local198];
							} else {
								Static466.aClass13_Sub1Array3[Static508.anInt8493++] = Static335.aClass13_Sub1_Sub1Array1[local198];
							}
						}
					}
				}
			}
		}
		if (Static508.anInt8493 > 0) {
			Static176.method2603(Static466.aClass13_Sub1Array3, 0, Static508.anInt8493 - 1);
			for (local19 = 0; local19 < Static508.anInt8493; local19++) {
				Static456.method6239(Static466.aClass13_Sub1Array3[local19], arg6);
			}
		}
		if (Static218.aBoolean734) {
			Static207.aClass95_6.method7004(0, null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local19 = Static458.anInt7383; local19 < Static10.anInt139; local19++) {
				@Pc(332) boolean[][] local332;
				@Pc(342) int local342;
				@Pc(349) int local349;
				@Pc(351) int local351;
				if (local19 < arg2 || arg1 == null) {
					local115 = Static494.aBooleanArrayArray8.length;
					if (Static65.anInt1178 + Static494.aBooleanArrayArray8.length > Static322.anInt5120) {
						local115 -= Static65.anInt1178 + Static494.aBooleanArrayArray8.length - Static322.anInt5120;
					}
					local198 = Static494.aBooleanArrayArray8[0].length;
					if (Static264.anInt4263 + Static494.aBooleanArrayArray8[0].length > Class13_Sub1_Sub4_Sub1.lb) {
						local198 -= Static264.anInt4263 + Static494.aBooleanArrayArray8[0].length - Class13_Sub1_Sub4_Sub1.lb;
					}
					local332 = Static186.aBooleanArrayArray5;
					if (Static63.aBoolean731) {
						if (Static268.aBoolean293) {
							local332 = Static215.aBooleanArrayArrayArray1[local19];
						}
						for (local342 = Static114.anInt2087; local342 < local115; local342++) {
							local349 = local342 + Static65.anInt1178 - Static114.anInt2087;
							for (local351 = Static446.anInt9077; local351 < local198; local351++) {
								if (Static494.aBooleanArrayArray8[local342][local351] && !Static223.method3048(local351 + Static264.anInt4263 - Static446.anInt9077, local349, local19)) {
									local332[local342][local351] = true;
								} else {
									local332[local342][local351] = false;
								}
							}
						}
					}
					if (Static268.aBoolean293) {
						if (arg4 >= 0) {
							Static314.aClass76Array2[local19].method7395(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static314.aClass76Array2[local19].method7393(0, 0, 0, null, false, arg5);
						}
						for (local342 = 0; local342 < Static600.anInt9701; local342++) {
							Static602.aClass358Array1[local342].method8052(new Class13_Sub8(local19 + 1));
						}
					} else if (arg4 >= 0) {
						Static314.aClass76Array2[local19].method7395(Static566.anInt9234, Static370.anInt5837, Static335.anInt5343, Static186.aBooleanArrayArray5, true, arg4, arg5);
					} else {
						Static314.aClass76Array2[local19].method7393(Static566.anInt9234, Static370.anInt5837, Static335.anInt5343, Static186.aBooleanArrayArray5, true, arg5);
					}
				} else {
					local115 = Static494.aBooleanArrayArray8.length;
					if (Static65.anInt1178 + Static494.aBooleanArrayArray8.length > Static322.anInt5120) {
						local115 -= Static65.anInt1178 + Static494.aBooleanArrayArray8.length - Static322.anInt5120;
					}
					local198 = Static494.aBooleanArrayArray8[0].length;
					if (Static264.anInt4263 + Static494.aBooleanArrayArray8[0].length > Class13_Sub1_Sub4_Sub1.lb) {
						local198 -= Static264.anInt4263 + Static494.aBooleanArrayArray8[0].length - Class13_Sub1_Sub4_Sub1.lb;
					}
					local332 = Static186.aBooleanArrayArray5;
					if (Static63.aBoolean731) {
						if (Static268.aBoolean293) {
							local332 = Static215.aBooleanArrayArrayArray1[local19];
						}
						for (local342 = Static114.anInt2087; local342 < local115; local342++) {
							local349 = local342 + Static65.anInt1178 - Static114.anInt2087;
							for (local351 = Static446.anInt9077; local351 < local198; local351++) {
								local332[local342][local351] = false;
								if (Static494.aBooleanArrayArray8[local342][local351]) {
									@Pc(370) int local370 = local351 + Static264.anInt4263 - Static446.anInt9077;
									for (@Pc(372) int local372 = local19; local372 >= 0; local372--) {
										if (Static28.aClass53ArrayArrayArray1[local372][local349][local370] != null && Static28.aClass53ArrayArrayArray1[local372][local349][local370].aByte28 == local19) {
											if ((local372 < arg2 || arg1[local372][local349][local370] != arg3) && !Static223.method3048(local370, local349, local19)) {
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
					if (Static268.aBoolean293) {
						if (arg4 >= 0) {
							Static314.aClass76Array2[local19].method7395(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static314.aClass76Array2[local19].method7393(0, 0, 0, null, false, arg5);
						}
						for (local342 = 0; local342 < Static600.anInt9701; local342++) {
							Static602.aClass358Array1[local342].method8052(new Class13_Sub8(local19 + 1));
						}
					} else if (arg4 >= 0) {
						Static314.aClass76Array2[local19].method7395(Static566.anInt9234, Static370.anInt5837, Static335.anInt5343, Static186.aBooleanArrayArray5, false, arg4, arg5);
					} else {
						Static314.aClass76Array2[local19].method7393(Static566.anInt9234, Static370.anInt5837, Static335.anInt5343, Static186.aBooleanArrayArray5, false, arg5);
					}
				}
			}
		}
		if (Static478.anInt9923 > 0) {
			Static326.method4393(Static495.aClass13_Sub1Array2, 0, Static478.anInt9923 - 1);
			for (local19 = 0; local19 < Static478.anInt9923; local19++) {
				Static456.method6239(Static495.aClass13_Sub1Array2[local19], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)Z")
	public static boolean method8588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static515.method7209(arg0, arg1) & Static389.method5231(arg1, arg0);
	}
}
