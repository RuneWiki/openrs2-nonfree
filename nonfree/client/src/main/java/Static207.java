import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZIILclient!ft;Lclient!wu;I)V")
	public static void method3195(@OriginalArg(3) int arg0, @OriginalArg(4) Class5_Sub16_Sub1 arg1, @OriginalArg(5) Class384 arg2, @OriginalArg(6) int arg3) {
		Static228.method3581(arg3, arg0, arg2);
		Static583.aClass5_Sub16_Sub1_6 = arg1;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method3197() {
		while (true) {
			if (Static167.aClass5_Sub12_Sub2_1.method8661(Static60.anInt3115) >= 15) {
				@Pc(18) int local18 = Static167.aClass5_Sub12_Sub2_1.method8670(15);
				if (local18 != 32767) {
					@Pc(25) boolean local25 = false;
					@Pc(32) Class5_Sub13 local32 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local18);
					@Pc(38) Class14_Sub1_Sub1_Sub3_Sub2 local38;
					if (local32 == null) {
						local38 = new Class14_Sub1_Sub1_Sub3_Sub2();
						local38.anInt2960 = local18;
						local32 = new Class5_Sub13(local38);
						Static51.aClass81_11.method1607(local32, (long) local18);
						local25 = true;
						Static367.aClass5_Sub13Array1[Static108.anInt1716++] = local32;
					}
					local38 = local32.aClass14_Sub1_Sub1_Sub3_Sub2_1;
					Static191.anIntArray287[Static58.anInt926++] = local18;
					local38.anInt2935 = Static47.anInt748;
					if (local38.aClass271_1 != null && local38.aClass271_1.method6479()) {
						Static341.method5232(local38);
					}
					@Pc(92) int local92 = Static167.aClass5_Sub12_Sub2_1.method8670(1);
					if (local92 == 1) {
						Static15.anIntArray29[Static18.anInt423++] = local18;
					}
					@Pc(114) int local114 = (Static167.aClass5_Sub12_Sub2_1.method8670(3) + 4 & 0xCE000007) << 11;
					@Pc(119) int local119 = Static167.aClass5_Sub12_Sub2_1.method8670(2);
					local38.method2534(Static258.aClass138_1.method3202(Static167.aClass5_Sub12_Sub2_1.method8670(14)));
					@Pc(134) int local134 = Static167.aClass5_Sub12_Sub2_1.method8670(1);
					@Pc(139) int local139 = Static167.aClass5_Sub12_Sub2_1.method8670(5);
					if (local139 > 15) {
						local139 -= 32;
					}
					@Pc(150) int local150 = Static167.aClass5_Sub12_Sub2_1.method8670(5);
					if (local150 > 15) {
						local150 -= 32;
					}
					local38.method2525(local38.aClass271_1.anInt7335);
					local38.anInt2956 = local38.aClass271_1.anInt7342 << 3;
					if (local25) {
						local38.method2521(local114, true);
					}
					local38.method2530(local134 == 1, local150 + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray253[0], local139 + Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray252[0], local38.method2509(), local119);
					if (local38.aClass271_1.method6479()) {
						Static600.method8380(local38, 0, local38.anIntArray253[0], (Class283) null, local38.aByte125, local38.anIntArray252[0], (Class14_Sub1_Sub1_Sub3_Sub1) null);
					}
					continue;
				}
			}
			Static167.aClass5_Sub12_Sub2_1.method8666();
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3199(@OriginalArg(0) String arg0) {
		Static365.method5696(0, arg0, "", "", "", 0);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static void method3200() {
		for (@Pc(15) Class5_Sub4_Sub9 local15 = (Class5_Sub4_Sub9) Static334.aClass306_29.method7313(); local15 != null; local15 = (Class5_Sub4_Sub9) Static334.aClass306_29.method7301()) {
			@Pc(20) Class14_Sub1_Sub1_Sub4 local20 = local15.aClass14_Sub1_Sub1_Sub4_1;
			if (local20.lb) {
				local15.method8911();
				local20.method3038();
			} else if (Static235.anInt3998 >= local20.anInt3423) {
				local20.method3037(Static128.anInt2091);
				if (local20.lb) {
					local15.method8911();
				} else {
					Static509.method7368(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	public static void method3203() {
		if (Static229.aClass330_2 == null) {
			return;
		}
		if (Static229.aClass330_2.anInt9132 == 1) {
			Static229.aClass330_2 = null;
			return;
		}
		if (Static229.aClass330_2.anInt9132 == 2) {
			Static598.method8369(2, Static627.aClass192_6, Static378.aString107);
			Static229.aClass330_2 = null;
			return;
		}
	}
}
