import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "I")
	public static int anInt6580 = -1;

	@OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
	public static int anInt6587 = 503;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!rq;I)V")
	public static void method5556(@OriginalArg(0) Class29_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class29_Sub2_Sub1_Sub1) {
			@Pc(13) Class29_Sub2_Sub1_Sub1 local13 = (Class29_Sub2_Sub1_Sub1) arg0;
			if (local13.aClass257_1 != null) {
				Static191.method2796(local13, Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 != local13.aByte103);
				return;
			}
		} else if (arg0 instanceof Class29_Sub2_Sub1_Sub2) {
			@Pc(34) Class29_Sub2_Sub1_Sub2 local34 = (Class29_Sub2_Sub1_Sub2) arg0;
			Static165.method2596(local34.aByte103 != Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103, local34);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method5557(@OriginalArg(1) Class121 arg0) {
		if (Static374.anInt6451 < 2 && !Static492.aBoolean560 || Static382.aClass97_10 != null) {
			return;
		}
		@Pc(49) String local49;
		if (Static492.aBoolean560 && Static374.anInt6451 < 2) {
			local49 = Static516.aString112 + Static141.aClass104_77.method2145(Static470.anInt7957) + Static474.aString98 + " ->";
		} else if (Static330.aBoolean414 && Static539.aClass88_1.method6348(81) && Static374.anInt6451 > 2) {
			local49 = Static568.method7783((Class6_Sub48) Static445.aClass275_162.aClass6_229.aClass6_283.aClass6_283);
		} else {
			@Pc(45) Class6_Sub48 local45 = (Class6_Sub48) Static445.aClass275_162.aClass6_229.aClass6_283;
			local49 = Static568.method7783(local45);
			@Pc(51) int[] local51 = null;
			if (Static557.method7618(local45.anInt8333)) {
				local51 = Static295.aClass256_2.method5924((int) local45.aLong215).anIntArray315;
			} else if (local45.anInt8334 != -1) {
				local51 = Static295.aClass256_2.method5924(local45.anInt8334).anIntArray315;
			} else if (Static197.method2979(local45.anInt8333)) {
				@Pc(121) Class6_Sub28 local121 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local45.aLong215);
				if (local121 != null) {
					@Pc(126) Class29_Sub2_Sub1_Sub1 local126 = local121.aClass29_Sub2_Sub1_Sub1_2;
					@Pc(129) Class257 local129 = local126.aClass257_1;
					if (local129.anIntArray571 != null) {
						local129 = local129.method5935(Static505.aClass30_1);
					}
					if (local129 != null) {
						local51 = local129.anIntArray572;
					}
				}
			} else if (Static90.method1435(local45.anInt8333)) {
				@Pc(90) Class313 local90;
				if (local45.anInt8333 == 1006) {
					local90 = Static260.aClass100_1.method2008((int) local45.aLong215);
				} else {
					local90 = Static260.aClass100_1.method2008((int) (local45.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local90.anIntArray650 != null) {
					local90 = local90.method6967(Static505.aClass30_1);
				}
				if (local90 != null) {
					local51 = local90.anIntArray654;
				}
			}
			if (local51 != null) {
				local49 = local49 + Static334.method5111(local51);
			}
		}
		if (Static374.anInt6451 > 2) {
			local49 = local49 + "<col=ffffff> / " + (Static374.anInt6451 - 2) + Static141.aClass104_70.method2145(Static470.anInt7957);
		}
		if (Static444.aClass97_12 != null) {
			@Pc(265) Class56 local265 = Static444.aClass97_12.method1977(arg0);
			if (local265 == null) {
				local265 = Static408.aClass56_4;
			}
			local265.method7884(Static444.aClass97_12.anInt2292, Static444.aClass97_12.anInt2352, Static367.anInt6360, Static444.aClass97_12.anInt2305, Static434.anIntArray595, Static579.anInt9630, Static444.aClass97_12.anInt2294, local49, Static186.anInt3245, Static379.anIntArray553, Static444.aClass97_12.anInt2300, Static195.aRandom1, Static444.aClass97_12.anInt2340, Static156.aClass4Array5);
			Static41.method573(Static434.anIntArray595[3], Static434.anIntArray595[1], Static434.anIntArray595[0], Static434.anIntArray595[2]);
		} else if (Static126.aClass97_3 != null && Static140.aClass314_2 == Static57.aClass314_1) {
			@Pc(245) int local245 = Static408.aClass56_4.method7875(Static31.anInt552 + 4, Static579.anInt9630, local49, Static156.aClass4Array5, Static379.anIntArray553, Static195.aRandom1, Static249.anInt4106 + 16);
			Static41.method573(16, Static249.anInt4106, Static31.anInt552 + 4, Static338.aClass146_7.method3173(local49) - -local245);
			return;
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IBIIZ)Lclient!l;")
	public static Class6_Sub31 method5558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class6_Sub31 local7 = new Class6_Sub31();
		local7.anInt4563 = arg2;
		local7.anInt4562 = arg0;
		Static564.aClass212_39.method5104((long) arg1, local7);
		Static274.method2853(arg2);
		@Pc(31) Class97 local31 = Static133.method4068(arg1);
		if (local31 != null) {
			Static390.method5794(local31);
		}
		if (Static473.aClass97_13 != null) {
			Static390.method5794(Static473.aClass97_13);
			Static473.aClass97_13 = null;
		}
		Static83.method1317();
		if (local31 != null) {
			Static443.method6362(!arg3, local31);
		}
		if (!arg3) {
			Static100.method1629(arg2);
		}
		if (!arg3 && Static487.anInt8139 != -1) {
			Static529.method7376(1, Static487.anInt8139);
		}
		return local7;
	}
}
