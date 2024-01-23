import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1 aClass4_Sub3_Sub14_Sub1_4;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!kk;")
	public static Class108 aClass108_3;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	public static int anInt2741;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)I")
	public static int method2189(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method2190() {
		Static189.aClass4_Sub10_Sub1_2.method4679();
		@Pc(7) int local7 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
		if (local7 == 0) {
			return;
		}
		@Pc(19) int local19 = Static189.aClass4_Sub10_Sub1_2.method4689(2);
		if (local19 == 0) {
			Static275.anIntArray587[Static250.anInt4761++] = 2047;
			return;
		}
		@Pc(42) int local42;
		@Pc(54) int local54;
		if (local19 == 1) {
			local42 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
			Static154.aClass53_Sub1_Sub1_2.method3321(local42, 1);
			local54 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
			if (local54 == 1) {
				Static275.anIntArray587[Static250.anInt4761++] = 2047;
			}
		} else if (local19 == 2) {
			if (Static189.aClass4_Sub10_Sub1_2.method4689(1) == 1) {
				local42 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
				Static154.aClass53_Sub1_Sub1_2.method3321(local42, 2);
				local54 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
				Static154.aClass53_Sub1_Sub1_2.method3321(local54, 2);
			} else {
				local42 = Static189.aClass4_Sub10_Sub1_2.method4689(3);
				Static154.aClass53_Sub1_Sub1_2.method3321(local42, 0);
			}
			local42 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
			if (local42 == 1) {
				Static275.anIntArray587[Static250.anInt4761++] = 2047;
			}
		} else if (local19 == 3) {
			local42 = Static189.aClass4_Sub10_Sub1_2.method4689(7);
			local54 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
			@Pc(147) int local147 = Static189.aClass4_Sub10_Sub1_2.method4689(1);
			if (local147 == 1) {
				Static275.anIntArray587[Static250.anInt4761++] = 2047;
			}
			Static281.anInt5335 = Static189.aClass4_Sub10_Sub1_2.method4689(2);
			@Pc(171) int local171 = Static189.aClass4_Sub10_Sub1_2.method4689(7);
			Static154.aClass53_Sub1_Sub1_2.method1174(local42, local54 == 1, local171);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIBII)V")
	public static void method2191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static3.method9(Static156.anInt3086, arg6, Static218.anInt4231);
		@Pc(22) int local22 = Static3.method9(Static156.anInt3086, arg0, Static218.anInt4231);
		@Pc(28) int local28 = Static3.method9(Static48.anInt902, arg4, Static131.anInt2553);
		@Pc(34) int local34 = Static3.method9(Static48.anInt902, arg5, Static131.anInt2553);
		@Pc(43) int local43 = Static3.method9(Static156.anInt3086, arg6 + arg1, Static218.anInt4231);
		@Pc(52) int local52 = Static3.method9(Static156.anInt3086, arg0 - arg1, Static218.anInt4231);
		@Pc(54) int local54;
		for (local54 = local11; local54 < local43; local54++) {
			Static99.method1656(Static220.anIntArrayArray36[local54], arg3, local28, local34);
		}
		for (local54 = local22; local54 > local52; local54--) {
			Static99.method1656(Static220.anIntArrayArray36[local54], arg3, local28, local34);
		}
		@Pc(97) int local97 = Static3.method9(Static48.anInt902, arg4 + arg1, Static131.anInt2553);
		@Pc(106) int local106 = Static3.method9(Static48.anInt902, arg5 - arg1, Static131.anInt2553);
		for (local54 = local43; local54 <= local52; local54++) {
			@Pc(119) int[] local119 = Static220.anIntArrayArray36[local54];
			Static99.method1656(local119, arg3, local28, local97);
			Static99.method1656(local119, arg2, local97, local106);
			Static99.method1656(local119, arg3, local106, local34);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)Lclient!ho;")
	public static Class83 method2192(@OriginalArg(1) int arg0) {
		@Pc(10) Class83 local10 = (Class83) Static149.aClass26_28.method518((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static47.aClass58_23.method1372(36, arg0);
		local10 = new Class83();
		local10.anInt2292 = arg0;
		if (local26 != null) {
			local10.method1807(new Class4_Sub10(local26));
		}
		Static149.aClass26_28.method510(local10, (long) arg0);
		return local10;
	}
}
