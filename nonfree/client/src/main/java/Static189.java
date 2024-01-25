import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "[I")
	public static int[] anIntArray231;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "[F")
	public static final float[] aFloatArray8 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!eq;I)V")
	public static void method3017(@OriginalArg(0) Class66 arg0) {
		if (Static151.anInt3129 < 2 && !Static174.aBoolean224 || Static240.aClass239_8 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static174.aBoolean224 && Static151.anInt3129 < 2) {
			local41 = Static104.aString16 + Static407.aClass267_99.method6581(Static161.anInt3239) + Static289.aString36 + " ->";
		} else if (Static395.aBoolean453 && Static54.aClass187_1.method4602(81) && Static151.anInt3129 > 2) {
			local41 = Static105.method1871((Class6_Sub40) Static292.aClass244_25.aClass6_220.aClass6_251.aClass6_251);
		} else {
			@Pc(70) Class6_Sub40 local70 = (Class6_Sub40) Static292.aClass244_25.aClass6_220.aClass6_251;
			local41 = Static105.method1871(local70);
			@Pc(76) int[] local76 = null;
			if (Static49.method1093(local70.anInt6722)) {
				local76 = Static380.aClass231_2.method5648((int) local70.aLong192).anIntArray8;
			} else if (local70.anInt6721 != -1) {
				local76 = Static380.aClass231_2.method5648(local70.anInt6721).anIntArray8;
			} else if (Static428.method6233(local70.anInt6722)) {
				@Pc(105) Class3_Sub2_Sub1_Sub1 local105 = Static308.aClass3_Sub2_Sub1_Sub1Array1[(int) local70.aLong192];
				if (local105 != null) {
					@Pc(110) Class48 local110 = local105.aClass48_1;
					if (local110.anIntArray103 != null) {
						local110 = local110.method1378(Static393.aClass207_1);
					}
					if (local110 != null) {
						local76 = local110.anIntArray104;
					}
				}
			} else if (Static86.method822(local70.anInt6722)) {
				@Pc(144) Class106 local144;
				if (local70.anInt6722 == 1002) {
					local144 = Static448.aClass104_4.method2616((int) local70.aLong192);
				} else {
					local144 = Static448.aClass104_4.method2616((int) (local70.aLong192 >>> 32 & 0x7FFFFFFFL));
				}
				if (local144.anIntArray188 != null) {
					local144 = local144.method2625(Static393.aClass207_1);
				}
				if (local144 != null) {
					local76 = local144.anIntArray191;
				}
			}
			if (local76 != null) {
				local41 = local41 + Static221.method3327(local76);
			}
		}
		if (Static151.anInt3129 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static151.anInt3129 - 2) + Static397.aClass267_95.method6581(Static161.anInt3239);
		}
		if (Static373.aClass239_11 != null) {
			@Pc(221) Class29 local221 = Static373.aClass239_11.method5725(arg0);
			if (local221 == null) {
				local221 = Static236.aClass29_2;
			}
			local221.method4799(local41, Static356.anInt6347, Static96.aRandom3, Static373.aClass239_11.anInt6898, Static108.anIntArray138, Static147.anInt2995, Static373.aClass239_11.anInt6883, Static399.anIntArray493, Static373.aClass239_11.lb, Static373.aClass239_11.anInt6882, Static373.aClass239_11.anInt6899, Static181.anInt3576, Static373.aClass239_11.anInt6952, Static58.aClass87Array8);
			Static401.method5934(Static399.anIntArray493[2], Static399.anIntArray493[0], Static399.anIntArray493[1], Static399.anIntArray493[3]);
		} else if (Static85.aClass239_2 != null && Static87.aClass36_3 == Static4.aClass36_5) {
			@Pc(290) int local290 = Static236.aClass29_2.method4796(Static96.aRandom3, Static108.anIntArray138, Static61.anInt1696 + 16, Static58.aClass87Array8, local41, Static356.anInt6347, Static233.anInt4271 + 4);
			Static401.method5934(Static237.aClass166_8.method3892(local41) + local290, Static233.anInt4271 + 4, Static61.anInt1696, 16);
		}
	}
}
