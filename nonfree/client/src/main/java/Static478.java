import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qw", name = "G", descriptor = "D")
	public static double aDouble29;

	@OriginalMember(owner = "client!qw", name = "D", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_113 = new Class130(19, 8);

	@OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
	public static int anInt8361 = 2;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ZILclient!gt;)V")
	public static void method7169(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub1_Sub2_Sub1_Sub1 arg1) {
		if (Static160.anInt3142 >= 400) {
			return;
		}
		@Pc(12) Class109 local12 = arg1.aClass109_1;
		if (local12.anIntArray147 != null) {
			local12 = local12.method2813(Static373.aClass150_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean200) {
			return;
		}
		@Pc(30) String local30 = local12.aString25;
		if (local12.anInt3046 != 0) {
			@Pc(46) String local46 = Static542.aClass222_7 == Static212.aClass222_2 ? Static59.aClass43_30.method1598(Static325.anInt6083) : Static59.aClass43_28.method1598(Static325.anInt6083);
			local30 = local30 + Static372.method3460(local12.anInt3046, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5812) + " (" + local46 + local12.anInt3046 + ")";
		}
		if (Static190.aBoolean232 && !arg0) {
			@Pc(85) Class300 local85 = Static540.anInt9171 == -1 ? null : Static449.aClass55_2.method1843(Static540.anInt9171);
			if ((Static37.anInt1189 & 0x2) != 0 && (local85 == null || local12.method2810(local85.anInt8686, Static540.anInt9171) != local85.anInt8686)) {
				Static582.method8234(Static136.aString18, true, 0, false, Static11.aString107 + " -> <col=ffff00>" + local30, 0, (long) arg1.anInt5759, Static262.anInt4805, (long) arg1.anInt5759, 13, -1, false);
			}
		}
		if (!arg0) {
			@Pc(143) String[] local143 = local12.aStringArray10;
			if (Static595.aBoolean729) {
				local143 = Static622.method8622(local143);
			}
			@Pc(153) int local153;
			if (local143 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local143[local153] != null && (local12.aByte40 == 0 || !local143[local153].equalsIgnoreCase(Static59.aClass43_23.method1598(Static325.anInt6083)))) {
						@Pc(176) byte local176 = 0;
						@Pc(178) int local178 = Static523.anInt8986;
						if (local153 == 0) {
							local176 = 19;
						}
						if (local153 == 1) {
							local176 = 20;
						}
						if (local153 == 2) {
							local176 = 12;
						}
						if (local153 == 3) {
							local176 = 49;
						}
						if (local12.anInt3034 == local153) {
							local178 = local12.anInt3065;
						}
						if (local153 == 4) {
							local176 = 59;
						}
						if (local12.anInt3033 == local153) {
							local178 = local12.anInt3071;
						}
						Static582.method8234(local143[local153], true, 0, false, "<col=ffff00>" + local30, 0, (long) arg1.anInt5759, local143[local153].equalsIgnoreCase(Static59.aClass43_23.method1598(Static325.anInt6083)) ? local12.anInt3056 : local178, (long) arg1.anInt5759, local176, -1, false);
					}
				}
			}
			if (local12.aByte40 == 1 && local143 != null) {
				for (local153 = 4; local153 >= 0; local153--) {
					if (local143[local153] != null && local143[local153].equalsIgnoreCase(Static59.aClass43_23.method1598(Static325.anInt6083))) {
						@Pc(299) short local299 = 0;
						if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5812 < local12.anInt3046) {
							local299 = 2000;
						}
						@Pc(312) short local312 = 0;
						if (local153 == 0) {
							local312 = 19;
						}
						if (local153 == 1) {
							local312 = 20;
						}
						if (local153 == 2) {
							local312 = 12;
						}
						if (local153 == 3) {
							local312 = 49;
						}
						if (local153 == 4) {
							local312 = 59;
						}
						if (local312 != 0) {
							local312 += local299;
						}
						Static582.method8234(local143[local153], true, 0, false, "<col=ffff00>" + local30, 0, (long) arg1.anInt5759, local12.anInt3056, (long) arg1.anInt5759, local312, -1, false);
					}
				}
			}
		}
		Static582.method8234(Static59.aClass43_22.method1598(Static325.anInt6083), true, 0, false, "<col=ffff00>" + local30, 0, (long) arg1.anInt5759, Static98.anInt2238, (long) arg1.anInt5759, 1004, -1, arg0);
	}
}
