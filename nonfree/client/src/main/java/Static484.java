import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "[I")
	public static final int[] anIntArray630 = new int[1000];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method6710() {
		Static390.method5794(Static382.aClass97_10);
		Static334.anInt5970++;
		if (Static143.aBoolean537 && Static332.aBoolean393) {
			@Pc(26) int local26 = Static427.aClass134_1.method6093();
			@Pc(30) int local30 = Static427.aClass134_1.method6092();
			local30 -= Static339.anInt6017;
			local26 -= Static575.anInt9609;
			if (local26 < Static465.anInt7892) {
				local26 = Static465.anInt7892;
			}
			if (Static465.anInt7892 + Static340.aClass97_9.anInt2340 < local26 - -Static382.aClass97_10.anInt2340) {
				local26 = Static340.aClass97_9.anInt2340 + Static465.anInt7892 - Static382.aClass97_10.anInt2340;
			}
			if (Static319.anInt5782 > local30) {
				local30 = Static319.anInt5782;
			}
			if (Static382.aClass97_10.anInt2305 + local30 > Static340.aClass97_9.anInt2305 + Static319.anInt5782) {
				local30 = Static319.anInt5782 + Static340.aClass97_9.anInt2305 - Static382.aClass97_10.anInt2305;
			}
			@Pc(101) int local101 = local26 + Static340.aClass97_9.anInt2271 - Static465.anInt7892;
			@Pc(110) int local110 = local30 + Static340.aClass97_9.anInt2334 - Static319.anInt5782;
			@Pc(163) Class6_Sub36 local163;
			if (Static427.aClass134_1.method6097()) {
				if (Static382.aClass97_10.anInt2268 < Static334.anInt5970) {
					@Pc(205) int local205 = local26 - Static450.anInt7765;
					@Pc(209) int local209 = local30 - Static381.anInt6580;
					if (local205 > Static382.aClass97_10.anInt2297 || local205 < -Static382.aClass97_10.anInt2297 || Static382.aClass97_10.anInt2297 < local209 || local209 < -Static382.aClass97_10.anInt2297) {
						Static576.aBoolean669 = true;
					}
				}
				if (Static382.aClass97_10.anObjectArray25 != null && Static576.aBoolean669) {
					local163 = new Class6_Sub36();
					local163.anObjectArray34 = Static382.aClass97_10.anObjectArray25;
					local163.anInt5754 = local110;
					local163.anInt5755 = local101;
					local163.aClass97_7 = Static382.aClass97_10;
					Static100.method1639(local163);
				}
			} else {
				if (Static576.aBoolean669) {
					Static465.method6520();
					if (Static382.aClass97_10.anObjectArray6 != null) {
						local163 = new Class6_Sub36();
						local163.anInt5754 = local110;
						local163.aClass97_8 = Static551.aClass97_14;
						local163.anInt5755 = local101;
						local163.aClass97_7 = Static382.aClass97_10;
						local163.anObjectArray34 = Static382.aClass97_10.anObjectArray6;
						Static100.method1639(local163);
					}
					if (Static551.aClass97_14 != null && Static65.method858(Static382.aClass97_10) != null) {
						Static265.method3773(Static382.aClass97_10, Static551.aClass97_14);
					}
				} else if ((Static129.anInt2230 == 1 || Static346.method5212()) && Static374.anInt6451 > 2) {
					Static135.method2003(Static339.anInt6017 + Static381.anInt6580, Static575.anInt9609 - -Static450.anInt7765);
				} else if (Static6.method1743()) {
					Static135.method2003(Static381.anInt6580 + Static339.anInt6017, Static575.anInt9609 - -Static450.anInt7765);
				}
				Static382.aClass97_10 = null;
			}
		} else if (Static334.anInt5970 > 1) {
			Static382.aClass97_10 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILclient!rq;Z)V")
	public static void method6712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class29_Sub2_Sub1 arg3) {
		@Pc(9) Class120 local9 = arg3.method7009();
		@Pc(19) int local19 = arg3.anInt8560 - arg3.aClass293_7.anInt7901 & 0x3FFF;
		if (arg1 == -1) {
			if (local19 != 0 || arg3.anInt8569 > 25) {
				if (arg0 < 0 && local9.anInt2873 != -1) {
					arg3.anInt8535 = local9.anInt2873;
				} else if (arg0 <= 0 || local9.anInt2884 == -1) {
					arg3.anInt8535 = local9.anInt2903;
				} else {
					arg3.anInt8535 = local9.anInt2884;
				}
				arg3.aBoolean597 = false;
			} else if (!arg3.aBoolean597 || !local9.method2395(arg3.anInt8535)) {
				arg3.anInt8535 = local9.method2397();
				arg3.aBoolean597 = arg3.anInt8535 != -1;
			}
		} else if (arg3.anInt8513 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(290) int local290 = Static413.anIntArray577[arg2] - arg3.aClass293_7.anInt7901 & 0x3FFF;
			if (arg1 == 2 && local9.anInt2874 != -1) {
				if (local290 > 2048 && local290 <= 6144 && local9.anInt2904 != -1) {
					arg3.anInt8535 = local9.anInt2904;
				} else if (local290 >= 10240 && local290 < 14336 && local9.anInt2882 != -1) {
					arg3.anInt8535 = local9.anInt2882;
				} else if (local290 <= 6144 || local290 >= 10240 || local9.anInt2905 == -1) {
					arg3.anInt8535 = local9.anInt2874;
				} else {
					arg3.anInt8535 = local9.anInt2905;
				}
			} else if (arg1 == 0 && local9.anInt2909 != -1) {
				if (local290 > 2048 && local290 <= 6144 && local9.anInt2870 != -1) {
					arg3.anInt8535 = local9.anInt2870;
				} else if (local290 >= 10240 && local290 < 14336 && local9.anInt2902 != -1) {
					arg3.anInt8535 = local9.anInt2902;
				} else if (local290 <= 6144 || local290 >= 10240 || local9.anInt2867 == -1) {
					arg3.anInt8535 = local9.anInt2909;
				} else {
					arg3.anInt8535 = local9.anInt2867;
				}
			} else if (local290 > 2048 && local290 <= 6144 && local9.anInt2885 != -1) {
				arg3.anInt8535 = local9.anInt2885;
			} else if (local290 >= 10240 && local290 < 14336 && local9.anInt2868 != -1) {
				arg3.anInt8535 = local9.anInt2868;
			} else if (local290 <= 6144 || local290 >= 10240 || local9.anInt2893 == -1) {
				arg3.anInt8535 = local9.anInt2903;
			} else {
				arg3.anInt8535 = local9.anInt2893;
			}
			arg3.aBoolean597 = false;
		} else if (local19 == 0 && arg3.anInt8569 <= 25) {
			arg3.aBoolean597 = false;
			if (arg1 == 2 && local9.anInt2874 != -1) {
				arg3.anInt8535 = local9.anInt2874;
			} else if (arg1 == 0 && local9.anInt2909 != -1) {
				arg3.anInt8535 = local9.anInt2909;
			} else {
				arg3.anInt8535 = local9.anInt2903;
			}
		} else {
			if (arg1 == 2 && local9.anInt2874 != -1) {
				if (arg0 < 0 && local9.anInt2887 != -1) {
					arg3.anInt8535 = local9.anInt2887;
				} else if (arg0 <= 0 || local9.anInt2895 == -1) {
					arg3.anInt8535 = local9.anInt2874;
				} else {
					arg3.anInt8535 = local9.anInt2895;
				}
			} else if (arg1 == 0 && local9.anInt2909 != -1) {
				if (arg0 < 0 && local9.anInt2871 != -1) {
					arg3.anInt8535 = local9.anInt2871;
				} else if (arg0 <= 0 || local9.anInt2891 == -1) {
					arg3.anInt8535 = local9.anInt2909;
				} else {
					arg3.anInt8535 = local9.anInt2891;
				}
			} else if (arg0 < 0 && local9.anInt2906 != -1) {
				arg3.anInt8535 = local9.anInt2906;
			} else if (arg0 <= 0 || local9.anInt2907 == -1) {
				arg3.anInt8535 = local9.anInt2903;
			} else {
				arg3.anInt8535 = local9.anInt2907;
			}
			arg3.aBoolean597 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IBIZLjava/lang/String;)V")
	public static void method6713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		Static524.method7354(arg1, arg2, arg3, arg0, null, false);
	}
}
