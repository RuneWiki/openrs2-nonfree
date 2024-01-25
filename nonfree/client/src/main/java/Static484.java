import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "[I")
	public static final int[] anIntArray503 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method6594(@OriginalArg(0) Class45 arg0) {
		@Pc(7) int local7 = Static211.anInt3825;
		@Pc(9) int local9 = Static538.anInt8629;
		@Pc(11) int local11 = Static520.anInt9775;
		@Pc(13) int local13 = Static122.anInt2800;
		arg0.method7425(local13, local7, local9, -10660793, local11);
		arg0.method7425(16, local7 + 1, local9 - -1, -16777216, local11 - 2);
		arg0.method7379(-16777216, local11 - 2, local13 + -19, local9 + 18, local7 + 1);
		Static460.aClass54_10.method7796(Static544.aClass343_28.method7222(Static256.anInt4535), -1, local7 + 3, -10660793, local9 + 14);
		@Pc(72) int local72 = Static465.aClass86_1.method7267();
		@Pc(76) int local76 = Static465.aClass86_1.method7265();
		@Pc(78) int local78 = 0;
		for (@Pc(83) Class3_Sub43 local83 = (Class3_Sub43) Static133.aClass112_20.method3088(); local83 != null; local83 = (Class3_Sub43) Static133.aClass112_20.method3084()) {
			@Pc(99) int local99 = local9 + (-local78 + -1 + Static571.anInt9281) * 16 + 31;
			@Pc(101) short local101 = -1;
			if (local7 < local72 && local11 + local7 > local72 && local99 - 13 < local76 && local76 < local99 + 3 && local83.aBoolean608) {
				local101 = -256;
			}
			@Pc(130) int[] local130 = null;
			if (Static354.method5255(local83.anInt7753)) {
				local130 = Static6.aClass92_1.method2673((int) local83.aLong221).anIntArray291;
			} else if (local83.anInt7751 != -1) {
				local130 = Static6.aClass92_1.method2673(local83.anInt7751).anIntArray291;
			} else if (Static246.method3794(local83.anInt7753)) {
				@Pc(213) Class3_Sub34 local213 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local83.aLong221);
				if (local213 != null) {
					@Pc(218) Class41_Sub2_Sub1_Sub4_Sub1 local218 = local213.aClass41_Sub2_Sub1_Sub4_Sub1_2;
					@Pc(221) Class264 local221 = local218.aClass264_1;
					if (local221.anIntArray443 != null) {
						local221 = local221.method5994(Static491.aClass318_1);
					}
					if (local221 != null) {
						local130 = local221.anIntArray444;
					}
				}
			} else if (Static440.method6182(local83.anInt7753)) {
				@Pc(176) Class280 local176;
				if (local83.anInt7753 == 1011) {
					local176 = Static478.aClass212_3.method4793((int) local83.aLong221);
				} else {
					local176 = Static478.aClass212_3.method4793((int) (local83.aLong221 >>> 32 & 0x7FFFFFFFL));
				}
				if (local176.anIntArray457 != null) {
					local176 = local176.method6181(Static491.aClass318_1);
				}
				if (local176 != null) {
					local130 = local176.anIntArray459;
				}
			}
			@Pc(247) String local247 = Static143.method2767(local83);
			if (local130 != null) {
				local247 = local247 + Static94.method1753(local130);
			}
			Static460.aClass54_10.method7788(Static348.aClass14Array12, Static129.anIntArray133, local247, local101, local99, local7 + 3);
			if (local83.aBoolean607) {
				Static362.aClass14_18.method7680(local7 + Static75.aClass134_7.method3348(local247) + 5, local99 + -12);
			}
			local78++;
		}
		Static129.method2607(Static211.anInt3825, Static538.anInt8629, Static122.anInt2800, Static520.anInt9775);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
	public static void method6595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if (arg1 > arg2) {
			for (local15 = arg2; local15 < arg1; local15++) {
				Static158.anIntArrayArray66[local15][arg0] = arg3;
			}
		} else {
			for (local15 = arg1; local15 < arg2; local15++) {
				Static158.anIntArrayArray66[local15][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	public static void method6596(@OriginalArg(1) int arg0) {
		Static493.anInt9521 = arg0;
		Static357.aClass6_44.method102();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZIIII)V")
	public static void method6598(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(19) long local19 = (long) (arg4 | (arg1 ? Integer.MIN_VALUE : 0));
		@Pc(25) Class3_Sub45 local25 = (Class3_Sub45) Static444.aClass354_35.method7689(local19);
		if (local25 == null) {
			local25 = new Class3_Sub45();
			Static444.aClass354_35.method7691(local25, local19);
		}
		if (local25.anIntArray511.length <= arg3) {
			@Pc(46) int[] local46 = new int[arg3 + 1];
			@Pc(51) int[] local51 = new int[arg3 + 1];
			for (@Pc(53) int local53 = 0; local53 < local25.anIntArray511.length; local53++) {
				local46[local53] = local25.anIntArray511[local53];
				local51[local53] = local25.anIntArray510[local53];
			}
			for (@Pc(79) int local79 = local25.anIntArray511.length; local79 < arg3; local79++) {
				local46[local79] = -1;
				local51[local79] = 0;
			}
			local25.anIntArray511 = local46;
			local25.anIntArray510 = local51;
		}
		local25.anIntArray511[arg3] = arg2;
		local25.anIntArray510[arg3] = arg0;
	}
}
