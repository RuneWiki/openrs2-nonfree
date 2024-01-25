import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "[I")
	public static int[] anIntArray555;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	public static int anInt10418 = 0;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!ofa;")
	public static Class265 aClass265_14 = null;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static152.method8491(arg1, arg0) || Static559.method7378(arg0, arg1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ub;ZZ)V")
	public static void method8506(@OriginalArg(0) Class34_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static166.anInt3037 >= 400) {
			return;
		}
		@Pc(14) Class261 local14 = arg0.aClass261_1;
		@Pc(17) String local17 = arg0.aString109;
		if (local14.anIntArray364 != null) {
			local14 = local14.method5772(Static210.aClass262_1);
			if (local14 == null) {
				return;
			}
			local17 = local14.aString85;
		}
		if (!local14.aBoolean478) {
			return;
		}
		if (arg0.anInt9726 != 0) {
			@Pc(54) String local54 = Static227.aClass203_4 == Static499.aClass203_8 ? Static114.aClass84_30.method1729(Static654.anInt10668) : Static114.aClass84_28.method1729(Static654.anInt10668);
			local17 = local17 + Static441.method6017(arg0.anInt9726, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1791) + " (" + local54 + arg0.anInt9726 + ")";
		}
		if (Static47.aBoolean59 && !arg1) {
			@Pc(92) Class281 local92 = Static341.anInt5871 == -1 ? null : Static389.aClass335_2.method7504(Static341.anInt5871);
			if ((Static344.anInt5895 & 0x2) != 0 && (local92 == null || local14.method5769(local92.anInt7362, Static341.anInt5871) != local92.anInt7362)) {
				Static390.method5454(-1, true, Static36.aString12, (long) arg0.anInt9671, 13, 0, Static225.aString51 + " -> <col=ffff00>" + local17, (long) arg0.anInt9671, false, 0, Static213.anInt3686, false);
			}
		}
		if (!arg1) {
			@Pc(143) String[] local143 = local14.aStringArray49;
			if (Static390.aBoolean451) {
				local143 = Static293.method7472(local143);
			}
			@Pc(153) int local153;
			if (local143 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local143[local153] != null && (local14.aByte103 == 0 || !local143[local153].equalsIgnoreCase(Static114.aClass84_23.method1729(Static654.anInt10668)))) {
						@Pc(176) byte local176 = 0;
						@Pc(178) int local178 = Static677.anInt10939;
						if (local153 == 0) {
							local176 = 45;
						}
						if (local153 == 1) {
							local176 = 20;
						}
						if (local153 == 2) {
							local176 = 22;
						}
						if (local153 == 3) {
							local176 = 58;
						}
						if (local153 == local14.anInt6822) {
							local178 = local14.anInt6820;
						}
						if (local153 == 4) {
							local176 = 50;
						}
						if (local153 == local14.anInt6813) {
							local178 = local14.anInt6817;
						}
						Static390.method5454(-1, true, local143[local153], (long) arg0.anInt9671, local176, 0, "<col=ffff00>" + local17, (long) arg0.anInt9671, false, 0, local143[local153].equalsIgnoreCase(Static114.aClass84_23.method1729(Static654.anInt10668)) ? local14.anInt6819 : local178, false);
					}
				}
			}
			if (local14.aByte103 == 1 && local143 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local143[local153] != null && local143[local153].equalsIgnoreCase(Static114.aClass84_23.method1729(Static654.anInt10668))) {
						@Pc(297) short local297 = 0;
						if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1791 < arg0.anInt9726) {
							local297 = 2000;
						}
						@Pc(306) short local306 = 0;
						if (local153 == 0) {
							local306 = 45;
						}
						if (local153 == 1) {
							local306 = 20;
						}
						if (local153 == 2) {
							local306 = 22;
						}
						if (local153 == 3) {
							local306 = 58;
						}
						if (local153 == 4) {
							local306 = 50;
						}
						if (local306 != 0) {
							local306 += local297;
						}
						Static390.method5454(-1, true, local143[local153], (long) arg0.anInt9671, local306, 0, "<col=ffff00>" + local17, (long) arg0.anInt9671, false, 0, local14.anInt6819, false);
					}
				}
			}
		}
		Static390.method5454(-1, true, Static114.aClass84_22.method1729(Static654.anInt10668), (long) arg0.anInt9671, 1009, 0, "<col=ffff00>" + local17, (long) arg0.anInt9671, false, 0, Static271.anInt4679, arg1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V")
	public static void method8507(@OriginalArg(1) boolean arg0) {
		Static124.method1848(Static531.anInt8327, Static187.anInt3418, Static13.anInt306, arg0);
	}
}
