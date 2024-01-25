import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
	public static int anInt9637;

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "[I")
	public static final int[] anIntArray630 = new int[250];

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Z")
	public static boolean aBoolean714 = false;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method8412() {
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub6_2);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub6_1);
		Static687.aClass6_Sub44_33.method7080(2, Static687.aClass6_Sub44_33.aClass7_Sub24_1);
		Static687.aClass6_Sub44_33.method7080(2, Static687.aClass6_Sub44_33.aClass7_Sub24_2);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub8_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub20_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub27_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub29_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub14_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub2_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub3_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub4_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub28_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.lb);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub25_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub25_2);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub12_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub7_1);
		Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub17_1);
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub11_1);
		Static363.method5535();
		Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub10_1);
		Static687.aClass6_Sub44_33.method7080(3, Static687.aClass6_Sub44_33.aClass7_Sub1_1);
		Static423.method6439();
		Static433.method6599();
		Static513.aBoolean649 = true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!laa;Z)Z")
	public static boolean method8414(@OriginalArg(0) Class60_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) boolean local7 = Static555.aClass96Array3 == Static216.aClass96Array1;
		@Pc(9) int local9 = 0;
		@Pc(11) short local11 = 0;
		@Pc(13) byte local13 = 0;
		arg0.method7280();
		if (arg0.aShort100 < 0 || arg0.aShort102 < 0 || arg0.aShort101 >= Static230.anInt4470 || arg0.aShort99 >= Static63.anInt777) {
			return false;
		}
		@Pc(41) short local41 = 0;
		@Pc(48) int local48;
		for (@Pc(44) int local44 = arg0.aShort100; local44 <= arg0.aShort101; local44++) {
			for (local48 = arg0.aShort102; local48 <= arg0.aShort99; local48++) {
				@Pc(55) Class243 local55 = Static565.method7969(arg0.aByte135, local44, local48);
				if (local55 != null) {
					@Pc(61) Class123 local61 = Static684.method9000(arg0);
					@Pc(64) Class123 local64 = local55.aClass123_5;
					if (local64 == null) {
						local55.aClass123_5 = local61;
					} else {
						while (local64.aClass123_1 != null) {
							local64 = local64.aClass123_1;
						}
						local64.aClass123_1 = local61;
					}
					if (local7 && (Static130.anIntArrayArray10[local44][local48] & 0xFF000000) != 0) {
						local9 = Static130.anIntArrayArray10[local44][local48];
						local11 = Static473.aShortArrayArray11[local44][local48];
						local13 = Static273.aByteArrayArray84[local44][local48];
					}
					if (!arg1 && local55.aClass60_Sub1_Sub2_1 != null && local55.aClass60_Sub1_Sub2_1.aShort45 > local41) {
						local41 = local55.aClass60_Sub1_Sub2_1.aShort45;
					}
				}
			}
		}
		if (local7 && (local9 & 0xFF000000) != 0) {
			for (local48 = arg0.aShort100; local48 <= arg0.aShort101; local48++) {
				for (@Pc(159) int local159 = arg0.aShort102; local159 <= arg0.aShort99; local159++) {
					if ((Static130.anIntArrayArray10[local48][local159] & 0xFF000000) == 0) {
						Static130.anIntArrayArray10[local48][local159] = local9;
						Static473.aShortArrayArray11[local48][local159] = local11;
						Static273.aByteArrayArray84[local48][local159] = local13;
					}
				}
			}
		}
		if (arg1) {
			Static469.aClass60_Sub1_Sub1Array1[Static243.anInt4671++] = arg0;
		} else {
			local48 = Static555.aClass96Array3 == Static216.aClass96Array1 ? 1 : 0;
			if (!arg0.method7919()) {
				arg0.aClass60_Sub1_23 = Static535.aClass60_Sub1Array3[local48];
				Static535.aClass60_Sub1Array3[local48] = arg0;
			} else if (arg0.method7918()) {
				arg0.aClass60_Sub1_23 = Static265.aClass60_Sub1Array4[local48];
				Static265.aClass60_Sub1Array4[local48] = arg0;
			} else {
				arg0.aClass60_Sub1_23 = Static403.aClass60_Sub1Array5[local48];
				Static403.aClass60_Sub1Array5[local48] = arg0;
				Static429.aBoolean549 = true;
			}
		}
		if (arg1) {
			arg0.anInt9051 -= local41;
		}
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!daa;I)V")
	public static void method8415(@OriginalArg(0) Class68 arg0) {
		Static143.aClass68_2 = arg0;
	}
}
