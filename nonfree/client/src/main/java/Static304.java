import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!la", name = "s", descriptor = "I")
	public static int anInt5896;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!kd;ZB)V")
	public static void method5160(@OriginalArg(0) Class20_Sub2_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static462.anInt8179 >= 400) {
			return;
		}
		@Pc(12) Class247 local12 = arg0.aClass247_1;
		@Pc(15) String local15 = arg0.aString62;
		if (local12.anIntArray467 != null) {
			local12 = local12.method6613(Static279.aClass294_1);
			if (local12 == null) {
				return;
			}
			local15 = local12.aString89;
		}
		if (!local12.aBoolean512) {
			return;
		}
		if (arg0.anInt5598 != 0) {
			@Pc(52) String local52 = Static646.aClass271_15 == Static630.aClass271_17 ? Static317.aClass192_30.method5299(Static307.anInt5931) : Static317.aClass192_28.method5299(Static307.anInt5931);
			local15 = local15 + Static625.method8701(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1210, arg0.anInt5598) + " (" + local52 + arg0.anInt5598 + ")";
		}
		if (Static280.aBoolean380 && !arg1) {
			@Pc(99) Class223 local99 = Static541.anInt8105 == -1 ? null : Static26.aClass179_1.method5148(Static541.anInt8105);
			if ((Static543.anInt9347 & 0x2) != 0 && (local99 == null || local12.method6600(Static541.anInt8105, local99.anInt6887) != local99.anInt6887)) {
				Static542.method7932(Static173.aString38, 0, false, (long) arg0.anInt5567, Static1.anInt8260, false, -1, 22, 0, true, (long) arg0.anInt5567, Static391.aString87 + " -> <col=ffff00>" + local15);
			}
		}
		if (!arg1) {
			@Pc(153) String[] local153 = local12.aStringArray52;
			if (Static50.aBoolean49) {
				local153 = Static225.method3785(local153);
			}
			@Pc(163) int local163;
			if (local153 != null) {
				for (local163 = 4; local163 >= 0; local163--) {
					if (local153[local163] != null && (local12.aByte85 == 0 || !local153[local163].equalsIgnoreCase(Static317.aClass192_23.method5299(Static307.anInt5931)))) {
						@Pc(183) byte local183 = 0;
						if (local163 == 0) {
							local183 = 59;
						}
						@Pc(189) int local189 = Static8.anInt150;
						if (local163 == 1) {
							local183 = 19;
						}
						if (local163 == 2) {
							local183 = 13;
						}
						if (local163 == 3) {
							local183 = 25;
						}
						if (local163 == 4) {
							local183 = 20;
						}
						if (local163 == local12.anInt7675) {
							local189 = local12.anInt7667;
						}
						if (local163 == local12.anInt7684) {
							local189 = local12.lb;
						}
						Static542.method7932(local153[local163], 0, false, (long) arg0.anInt5567, local153[local163].equalsIgnoreCase(Static317.aClass192_23.method5299(Static307.anInt5931)) ? local12.anInt7689 : local189, false, -1, local183, 0, true, (long) arg0.anInt5567, "<col=ffff00>" + local15);
					}
				}
			}
			if (local12.aByte85 == 1 && local153 != null) {
				for (local163 = 4; local163 >= 0; local163--) {
					if (local153[local163] != null && local153[local163].equalsIgnoreCase(Static317.aClass192_23.method5299(Static307.anInt5931))) {
						@Pc(304) short local304 = 0;
						if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1210 < arg0.anInt5598) {
							local304 = 2000;
						}
						@Pc(313) short local313 = 0;
						if (local163 == 0) {
							local313 = 59;
						}
						if (local163 == 1) {
							local313 = 19;
						}
						if (local163 == 2) {
							local313 = 13;
						}
						if (local163 == 3) {
							local313 = 25;
						}
						if (local163 == 4) {
							local313 = 20;
						}
						if (local313 != 0) {
							local313 += local304;
						}
						Static542.method7932(local153[local163], 0, false, (long) arg0.anInt5567, local12.anInt7689, false, -1, local313, 0, true, (long) arg0.anInt5567, "<col=ffff00>" + local15);
					}
				}
			}
		}
		Static542.method7932(Static317.aClass192_22.method5299(Static307.anInt5931), 0, arg1, (long) arg0.anInt5567, Static140.anInt2652, false, -1, 1004, 0, true, (long) arg0.anInt5567, "<col=ffff00>" + local15);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIIII)V")
	public static void method5161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg2 >= Static347.anInt6542 && arg2 + arg4 <= Static553.anInt9425 && arg0 - arg2 >= Static100.anInt10042 && Static567.anInt9578 >= arg0 + arg2) {
			Static390.method6595(arg0, arg3, arg2, arg4, arg1, arg5);
		} else {
			Static545.method7956(arg5, arg3, arg0, arg1, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
	public static int method5162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static300.method5125(arg1 - 1, arg0 + -1) + Static300.method5125(arg1 - 1, arg0 + 1) + Static300.method5125(arg1 + 1, arg0 + -1) + Static300.method5125(arg1 + 1, arg0 + 1);
		@Pc(79) int local79 = Static300.method5125(arg1, arg0 - 1) + Static300.method5125(arg1, arg0 + 1) + Static300.method5125(arg1 + -1, arg0) + Static300.method5125(arg1 - -1, arg0);
		@Pc(84) int local84 = Static300.method5125(arg1, arg0);
		return local48 / 16 + local79 / 8 + local84 / 4;
	}
}
