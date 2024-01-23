import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!mh", name = "R", descriptor = "Z")
	public static boolean aBoolean119;

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "Z")
	public static boolean aBoolean120;

	@OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
	public static int anInt2940 = 0;

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_582 = Static199.method3560("gr-Un:");

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_583 = null;

	@OriginalMember(owner = "client!mh", name = "db", descriptor = "Lclient!qe;")
	public static Class78 aClass78_584 = Static199.method3560("null");

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)Lclient!qe;")
	public static Class78 method2367() {
		@Pc(1) Class78 local1 = Static200.aClass78_794;
		if (Static144.anInt3283 != 0) {
			local1 = Static131.aClass78_585;
		}
		return Static94.method1640(new Class78[] { Static162.aClass78_668, local1, Static91.aClass78_447, Static19.method268(Static211.anInt4647), Static31.aClass78_100, Static19.method268(Static102.anInt2232), Static208.aClass78_815 });
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)I")
	public static int method2368(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BIIILclient!fj;)V")
	public static void method2370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub3_Sub9 arg3) {
		if (Static138.anInt3182 >= 400) {
			return;
		}
		if (arg3.anIntArray230 != null) {
			arg3 = arg3.method1059();
		}
		if (arg3 == null || !arg3.aBoolean44) {
			return;
		}
		@Pc(31) Class78 local31 = arg3.aClass78_311;
		if (arg3.anInt1294 != 0) {
			local31 = Static94.method1640(new Class78[] { local31, Static158.method2848(arg3.anInt1294, Static31.aClass5_Sub2_Sub2_1.anInt1898), Static174.aClass78_699, Static226.aClass78_873, Static19.method268(arg3.anInt1294), Static216.aClass78_846 });
		}
		if (Static121.anInt4906 == 1) {
			Static188.method3487(arg1, (long) arg2, (short) 41, arg0, Static94.method1640(new Class78[] { Static203.aClass78_808, Static124.aClass78_571, local31 }), Static173.aClass78_690);
		} else if (!Static125.aBoolean60) {
			@Pc(151) Class78[] local151 = arg3.aClass78Array12;
			if (Static101.aBoolean85) {
				local151 = Static129.method2339(local151);
			}
			@Pc(161) int local161;
			if (local151 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local151[local161] != null && (Static193.anInt4451 != 0 || !local151[local161].method3038(Static51.aClass78_179))) {
						@Pc(181) byte local181 = 0;
						if (local161 == 0) {
							local181 = 16;
						}
						if (local161 == 1) {
							local181 = 13;
						}
						if (local161 == 2) {
							local181 = 47;
						}
						if (local161 == 3) {
							local181 = 15;
						}
						if (local161 == 4) {
							local181 = 25;
						}
						Static188.method3487(arg1, (long) arg2, local181, arg0, Static94.method1640(new Class78[] { Static153.aClass78_642, local31 }), local151[local161]);
					}
				}
			}
			if (Static193.anInt4451 == 0 && local151 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local151[local161] != null && local151[local161].method3038(Static51.aClass78_179)) {
						@Pc(259) short local259 = 0;
						@Pc(261) short local261 = 0;
						if (local161 == 0) {
							local261 = 16;
						}
						if (local161 == 1) {
							local261 = 13;
						}
						if (local161 == 2) {
							local261 = 47;
						}
						if (local161 == 3) {
							local261 = 15;
						}
						if (arg3.anInt1294 > Static31.aClass5_Sub2_Sub2_1.anInt1898) {
							local259 = 2000;
						}
						if (local161 == 4) {
							local261 = 25;
						}
						if (local261 != 0) {
							local261 += local259;
						}
						Static188.method3487(arg1, (long) arg2, local261, arg0, Static94.method1640(new Class78[] { Static153.aClass78_642, local31 }), local151[local161]);
					}
				}
			}
			Static188.method3487(arg1, (long) arg2, (short) 1001, arg0, Static94.method1640(new Class78[] { Static153.aClass78_642, local31 }), Static2.aClass78_5);
		} else if ((Static29.anInt530 & 0x2) == 2) {
			Static188.method3487(arg1, (long) arg2, (short) 48, arg0, Static94.method1640(new Class78[] { Static19.aClass78_60, Static124.aClass78_571, local31 }), Static69.aClass78_317);
			return;
		}
	}
}
