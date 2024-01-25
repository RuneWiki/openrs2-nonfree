import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!co", name = "n", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "Lclient!wq;")
	public static Class5_Sub36 aClass5_Sub36_1;

	@OriginalMember(owner = "client!co", name = "m", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_25 = new Class156(22, -1);

	@OriginalMember(owner = "client!co", name = "v", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_37 = new Class381(30, 2);

	@OriginalMember(owner = "client!co", name = "w", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ns;ZB)V")
	public static void method1267(@OriginalArg(0) Class4_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static651.anInt10662 >= 400) {
			return;
		}
		@Pc(15) Class105 local15 = arg0.aClass105_1;
		@Pc(25) String local25 = arg0.aString80;
		if (local15.anIntArray134 != null) {
			local15 = local15.method2622(Static23.aClass247_1);
			if (local15 == null) {
				return;
			}
			local25 = local15.aString19;
		}
		if (!local15.aBoolean206) {
			return;
		}
		if (arg0.anInt6901 != 0) {
			@Pc(64) String local64 = Static536.aClass290_6 == Static532.aClass290_5 ? Static184.aClass131_31.method3168(Static375.anInt7800) : Static184.aClass131_29.method3168(Static375.anInt7800);
			local25 = local25 + Static594.method8180(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4565, arg0.anInt6901) + " (" + local64 + arg0.anInt6901 + ")";
		}
		if (Static421.aBoolean472 && !arg1) {
			@Pc(109) Class22 local109 = Static110.anInt9539 == -1 ? null : Static612.aClass380_2.method8839(Static110.anInt9539);
			if ((Static326.anInt4132 & 0x2) != 0 && (local109 == null || local15.method2618(local109.anInt336, Static110.anInt9539) != local109.anInt336)) {
				Static467.method6573(0, 59, -1, Static462.anInt7482, Static47.aString9 + " -> <col=ffff00>" + local25, Static570.aString102, (long) arg0.anInt6843, (long) arg0.anInt6843, 0, false, false, true);
			}
		}
		if (!arg1) {
			@Pc(168) String[] local168 = local15.aStringArray10;
			if (Static378.aBoolean420) {
				local168 = Static108.method1617(local168);
			}
			@Pc(178) int local178;
			if (local168 != null) {
				for (local178 = 4; local178 >= 0; local178--) {
					if (local168[local178] != null && (local15.aByte29 == 0 || !local168[local178].equalsIgnoreCase(Static184.aClass131_24.method3168(Static375.anInt7800)))) {
						@Pc(204) byte local204 = 0;
						if (local178 == 0) {
							local204 = 4;
						}
						@Pc(213) int local213 = Static61.anInt1040;
						if (local178 == 1) {
							local204 = 12;
						}
						if (local178 == 2) {
							local204 = 47;
						}
						if (local178 == 3) {
							local204 = 58;
						}
						if (local178 == local15.lb) {
							local213 = local15.anInt2830;
						}
						if (local178 == 4) {
							local204 = 3;
						}
						if (local15.anInt2798 == local178) {
							local213 = local15.anInt2820;
						}
						Static467.method6573(0, local204, -1, local168[local178].equalsIgnoreCase(Static184.aClass131_24.method3168(Static375.anInt7800)) ? local15.anInt2809 : local213, "<col=ffff00>" + local25, local168[local178], (long) arg0.anInt6843, (long) arg0.anInt6843, 0, false, false, true);
					}
				}
			}
			if (local15.aByte29 == 1 && local168 != null) {
				for (local178 = 4; local178 >= 0; local178--) {
					if (local168[local178] != null && local168[local178].equalsIgnoreCase(Static184.aClass131_24.method3168(Static375.anInt7800))) {
						@Pc(343) short local343 = 0;
						if (arg0.anInt6901 > Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4565) {
							local343 = 2000;
						}
						@Pc(352) short local352 = 0;
						if (local178 == 0) {
							local352 = 4;
						}
						if (local178 == 1) {
							local352 = 12;
						}
						if (local178 == 2) {
							local352 = 47;
						}
						if (local178 == 3) {
							local352 = 58;
						}
						if (local178 == 4) {
							local352 = 3;
						}
						if (local352 != 0) {
							local352 += local343;
						}
						Static467.method6573(0, local352, -1, local15.anInt2809, "<col=ffff00>" + local25, local168[local178], (long) arg0.anInt6843, (long) arg0.anInt6843, 0, false, false, true);
					}
				}
			}
		}
		Static467.method6573(0, 1002, -1, Static1.anInt8120, "<col=ffff00>" + local25, Static184.aClass131_23.method3168(Static375.anInt7800), (long) arg0.anInt6843, (long) arg0.anInt6843, 0, false, arg1, true);
	}
}
