import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
	public static final int anInt4189 = -1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)Z")
	public static boolean method3574(@OriginalArg(0) int arg0) {
		if (arg0 == 18 || arg0 == 57 || arg0 == 45 || arg0 == 3 || arg0 == 30) {
			return true;
		} else {
			return arg0 == 9 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(JI)V")
	public static void method3575(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static393.anInt7056 + Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492;
		@Pc(15) int local15 = Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 + Static492.anInt8455;
		if (Static66.anInt1272 - local10 < -500 || Static66.anInt1272 - local10 > 500 || Static387.anInt7017 - local15 < -500 || Static387.anInt7017 - local15 > 500) {
			Static66.anInt1272 = local10;
			Static387.anInt7017 = local15;
		}
		@Pc(60) int local60;
		@Pc(68) int local68;
		if (Static66.anInt1272 != local10) {
			local60 = local10 - Static66.anInt1272;
			local68 = (int) (arg0 * (long) local60 / 320L);
			if (local60 <= 0) {
				if (local68 == 0) {
					local68 = -1;
				} else if (local60 > local68) {
					local68 = local60;
				}
			} else if (local68 == 0) {
				local68 = 1;
			} else if (local68 > local60) {
				local68 = local60;
			}
			Static66.anInt1272 += local68;
		}
		if (local15 != Static387.anInt7017) {
			local60 = local15 - Static387.anInt7017;
			local68 = (int) ((long) local60 * arg0 / 320L);
			if (local60 <= 0) {
				if (local68 == 0) {
					local68 = -1;
				} else if (local60 > local68) {
					local68 = local60;
				}
			} else if (local68 == 0) {
				local68 = 1;
			} else if (local60 < local68) {
				local68 = local60;
			}
			Static387.anInt7017 += local68;
		}
		if (!Static300.aClass5_Sub28_Sub1_1.aBoolean334) {
			Static535.aFloat364 += Static19.aFloat319 * (float) arg0 / 6.0F;
			Static476.aFloat339 += (float) arg0 * Static124.aFloat137 / 6.0F;
		}
		Static128.method2403();
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public static void method3576() {
		if (Static321.aBoolean424) {
			return;
		}
		Static12.method328(Static408.aClass37ArrayArrayArray3);
		if (Static231.aClass37ArrayArrayArray2 != null) {
			Static12.method328(Static231.aClass37ArrayArrayArray2);
		}
		Static321.aBoolean424 = true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method3577(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static150.anInt3101 >= 100) {
			Static340.method5291(Static178.aClass40_56.method1063(Static194.anInt3737));
			return;
		}
		@Pc(24) String local24 = Static86.method1503(arg1);
		if (local24 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(29) int local29 = 0; local29 < Static150.anInt3101; local29++) {
			@Pc(37) String local37 = Static86.method1503(Static3.aStringArray3[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static340.method5291(arg1 + Static290.aClass40_84.method1063(Static194.anInt3737));
				return;
			}
			if (Static207.aStringArray20[local29] != null) {
				local67 = Static86.method1503(Static207.aStringArray20[local29]);
				if (local67 != null && local67.equals(local24)) {
					Static340.method5291(arg1 + Static290.aClass40_84.method1063(Static194.anInt3737));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static59.anInt1208; local97++) {
			local67 = Static86.method1503(Static23.aStringArray7[local97]);
			if (local67 != null && local67.equals(local24)) {
				Static340.method5291(Static157.aClass40_50.method1063(Static194.anInt3737) + arg1 + Static414.aClass40_150.method1063(Static194.anInt3737));
				return;
			}
			if (Static386.aStringArray18[local97] != null) {
				@Pc(140) String local140 = Static86.method1503(Static386.aStringArray18[local97]);
				if (local140 != null && local140.equals(local24)) {
					Static340.method5291(Static157.aClass40_50.method1063(Static194.anInt3737) + arg1 + Static414.aClass40_150.method1063(Static194.anInt3737));
					return;
				}
			}
		}
		if (Static86.method1503(Static35.aClass15_Sub2_Sub1_Sub1_1.aString18).equals(local24)) {
			Static340.method5291(Static345.aClass40_98.method1063(Static194.anInt3737));
		} else {
			Static415.method5995(Static341.aClass236_80);
			Static164.aClass5_Sub3_Sub1_2.method4192(Static52.method1102(arg1) + 1);
			Static164.aClass5_Sub3_Sub1_2.method4208(arg1);
			Static164.aClass5_Sub3_Sub1_2.method4192(arg0 ? 1 : 0);
		}
	}
}
