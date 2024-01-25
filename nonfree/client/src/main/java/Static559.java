import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "Lclient!ga;")
	public static Class111 aClass111_121;

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "Lclient!wv;")
	public static Class365 aClass365_16;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "Lclient!ve;")
	public static final Class1_Sub50 aClass1_Sub50_1 = new Class1_Sub50(0, 0);

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString92 = null;

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "[I")
	public static final int[] anIntArray612 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static484.method6766(arg2, 0, arg5, arg0, arg3, arg4, arg1);
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
	public static void method7539() {
		@Pc(9) int local9 = Static480.aClass1_Sub20_Sub1_1.method4426();
		@Pc(20) boolean local20 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
		@Pc(24) int local24 = Static480.aClass1_Sub20_Sub1_1.method4417();
		@Pc(28) int local28 = Static480.aClass1_Sub20_Sub1_1.method4408();
		Static102.anInt2115 = Static480.aClass1_Sub20_Sub1_1.method4393();
		Static64.method1429();
		Static317.method4814(local28);
		Static480.aClass1_Sub20_Sub1_1.method3927();
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(66) int local66;
		for (@Pc(51) int local51 = 0; local51 < 4; local51++) {
			for (local55 = 0; local55 < Static500.anInt6888 >> 3; local55++) {
				for (local59 = 0; local59 < Static573.anInt9325 >> 3; local59++) {
					local66 = Static480.aClass1_Sub20_Sub1_1.method3924(1);
					if (local66 == 1) {
						Static414.anIntArrayArrayArray16[local51][local55][local59] = Static480.aClass1_Sub20_Sub1_1.method3924(26);
					} else {
						Static414.anIntArrayArrayArray16[local51][local55][local59] = -1;
					}
				}
			}
		}
		Static480.aClass1_Sub20_Sub1_1.method3932();
		local55 = (Static494.anInt8294 - Static480.aClass1_Sub20_Sub1_1.anInt5238) / 16;
		Static357.anIntArrayArray43 = new int[local55][4];
		for (local59 = 0; local59 < local55; local59++) {
			for (local66 = 0; local66 < 4; local66++) {
				Static357.anIntArrayArray43[local59][local66] = Static480.aClass1_Sub20_Sub1_1.method4371();
			}
		}
		Static549.anIntArray609 = new int[local55];
		Static331.aByteArrayArray20 = new byte[local55][];
		Static515.anIntArray586 = new int[local55];
		Static349.aByteArrayArray21 = new byte[local55][];
		Static201.anIntArray451 = new int[local55];
		Static298.anIntArray348 = new int[local55];
		Static585.anIntArray630 = new int[local55];
		Static466.aByteArrayArray10 = new byte[local55][];
		Static429.aByteArrayArray24 = null;
		Static328.anIntArray378 = null;
		Static457.aByteArrayArray25 = new byte[local55][];
		local55 = 0;
		for (local66 = 0; local66 < 4; local66++) {
			for (@Pc(189) int local189 = 0; local189 < Static500.anInt6888 >> 3; local189++) {
				for (@Pc(193) int local193 = 0; local193 < Static573.anInt9325 >> 3; local193++) {
					@Pc(203) int local203 = Static414.anIntArrayArrayArray16[local66][local189][local193];
					if (local203 != -1) {
						@Pc(212) int local212 = local203 >> 14 & 0x3FF;
						@Pc(218) int local218 = local203 >> 3 & 0x7FF;
						@Pc(228) int local228 = local218 / 8 + (local212 / 8 << 8);
						for (@Pc(230) int local230 = 0; local230 < local55; local230++) {
							if (Static298.anIntArray348[local230] == local228) {
								local228 = -1;
								break;
							}
						}
						if (local228 != -1) {
							Static298.anIntArray348[local55] = local228;
							@Pc(263) int local263 = local228 >> 8 & 0xFF;
							@Pc(267) int local267 = local228 & 0xFF;
							Static549.anIntArray609[local55] = Static373.aClass111_90.method2462("m" + local263 + "_" + local267);
							Static515.anIntArray586[local55] = Static373.aClass111_90.method2462("l" + local263 + "_" + local267);
							Static201.anIntArray451[local55] = Static373.aClass111_90.method2462("um" + local263 + "_" + local267);
							Static585.anIntArray630[local55] = Static373.aClass111_90.method2462("ul" + local263 + "_" + local267);
							local55++;
						}
					}
				}
			}
		}
		Static304.method4713(11, local24, local9, local20);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V")
	public static void method7540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub3_Sub1 local13 = Static374.method5445(8, arg0);
		local13.method491();
		local13.anInt548 = arg2;
		local13.anInt545 = arg1;
		local13.anInt549 = arg3;
	}
}
