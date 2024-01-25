import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
	public static void method8384() {
		if (Static592.anInt9602 == 1 || Static592.anInt9602 == 3 || Static443.anInt7083 != Static592.anInt9602 && (Static592.anInt9602 == 0 || Static443.anInt7083 == 0)) {
			Static639.anInt10306 = 0;
			Static645.anInt9916 = 0;
			Static440.aClass118_41.method2599();
		}
		Static443.anInt7083 = Static592.anInt9602;
	}

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "(I)Lclient!bi;")
	public static Class2_Sub2_Sub4 method8385() {
		@Pc(8) Class2_Sub2_Sub4 local8 = (Class2_Sub2_Sub4) Static471.aClass75_11.method1573();
		if (local8 != null) {
			local8.method8653();
			local8.method8271();
			return local8;
		}
		do {
			local8 = (Class2_Sub2_Sub4) Static59.aClass75_2.method1573();
			if (local8 == null) {
				return null;
			}
			if (local8.method668() > Static476.method6413()) {
				return null;
			}
			local8.method8653();
			local8.method8271();
		} while ((local8.aLong269 & Long.MIN_VALUE) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V")
	public static void method8386() {
		try {
			@Pc(12) int local12;
			if (Static317.anInt5047 == 1) {
				local12 = Static267.aClass2_Sub13_Sub3_3.method6121();
				if (local12 > 0 && Static267.aClass2_Sub13_Sub3_3.method6116()) {
					local12 -= Static575.anInt9354;
					if (local12 < 0) {
						local12 = 0;
					}
					Static267.aClass2_Sub13_Sub3_3.method6126(local12);
					return;
				}
				Static267.aClass2_Sub13_Sub3_3.method6136();
				Static267.aClass2_Sub13_Sub3_3.method6129();
				if (Static93.aClass380_31 == null) {
					Static317.anInt5047 = 0;
				} else {
					Static317.anInt5047 = 2;
				}
				Static591.aClass195_1 = null;
				Static388.aClass2_Sub42_1 = null;
			}
			if (Static317.anInt5047 == 3) {
				local12 = Static267.aClass2_Sub13_Sub3_3.method6121();
				if (Static33.anInt738 > local12 && Static267.aClass2_Sub13_Sub3_3.method6116()) {
					local12 += Static350.anInt5487;
					if (local12 > Static33.anInt738) {
						local12 = Static33.anInt738;
					}
					Static267.aClass2_Sub13_Sub3_3.method6126(local12);
				} else {
					Static317.anInt5047 = 0;
					Static350.anInt5487 = 0;
				}
			}
		} catch (@Pc(99) Exception local99) {
			local99.printStackTrace();
			Static267.aClass2_Sub13_Sub3_3.method6136();
			Static93.aClass380_31 = null;
			Static591.aClass195_1 = null;
			Static527.aClass2_Sub13_Sub3_4 = null;
			Static388.aClass2_Sub42_1 = null;
			Static317.anInt5047 = 0;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!cw;BIIILclient!aa;ILclient!paa;)V")
	public static void method8387(@OriginalArg(0) Class61 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class261 arg6) {
		if (arg0 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static445.anInt7122 == 4) {
			local16 = (int) Static440.aFloat144 & 0x3FFF;
		} else {
			local16 = Static99.anInt7118 + (int) Static440.aFloat144 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg6.anInt6595 / 2, arg6.anInt6622 / 2) + 10;
		@Pc(49) int local49 = arg3 * arg3 + arg1 * arg1;
		if (local37 * local37 < local49) {
			return;
		}
		@Pc(59) int local59 = Canvas_Sub1.anIntArray497[local16];
		@Pc(63) int local63 = Canvas_Sub1.anIntArray498[local16];
		if (Static445.anInt7122 != 4) {
			local63 = local63 * 256 / (Static407.anInt9051 + 256);
			local59 = local59 * 256 / (Static407.anInt9051 + 256);
		}
		@Pc(92) int local92 = local63 * arg1 + local59 * arg3 >> 14;
		@Pc(103) int local103 = arg3 * local63 - local59 * arg1 >> 14;
		arg0.method6449(local92 + arg6.anInt6595 / 2 + arg2 - arg0.method6446() / 2, -local103 + arg6.anInt6622 / 2 + arg5 - arg0.method6438() / 2, arg4, arg2, arg5);
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(B)I")
	public static int method8388() {
		if (Static298.aFrame3 == null) {
			return Static507.aBoolean635 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZILclient!am;)V")
	public static void method8391(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class13_Sub1_Sub1_Sub1_Sub1 arg1) {
		if (Static474.anInt7600 >= 400) {
			return;
		}
		@Pc(12) Class150 local12 = arg1.aClass150_1;
		if (local12.anIntArray262 != null) {
			local12 = local12.method3196(Static431.aClass205_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean272) {
			return;
		}
		@Pc(30) String local30 = local12.aString36;
		if (local12.anInt3808 != 0) {
			@Pc(46) String local46 = Static25.aClass375_2 == Static189.aClass375_5 ? Static434.aClass271_30.method5972(Static483.anInt7694) : Static434.aClass271_28.method5972(Static483.anInt7694);
			local30 = local30 + Static631.method8044(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4650, local12.anInt3808) + " (" + local46 + local12.anInt3808 + ")";
		}
		if (Static8.aBoolean11 && !arg0) {
			@Pc(84) Class238 local84 = Static198.anInt8166 == -1 ? null : Static339.aClass66_1.method1439(Static198.anInt8166);
			if ((Static241.anInt3917 & 0x2) != 0 && (local84 == null || local12.method3192(local84.anInt6043, Static198.anInt8166) != local84.anInt6043)) {
				Static564.method7726(false, 0, -1, Static83.anInt1494, false, 0, (long) arg1.anInt4582, Static577.aString105, (long) arg1.anInt4582, 20, true, Static90.aString16 + " -> <col=ffff00>" + local30);
			}
		}
		if (!arg0) {
			@Pc(135) String[] local135 = local12.aStringArray20;
			if (Static597.aBoolean707) {
				local135 = Static189.method2750(local135);
			}
			@Pc(145) int local145;
			if (local135 != null) {
				for (local145 = 4; local145 >= 0; local145--) {
					if (local135[local145] != null && (local12.aByte47 == 0 || !local135[local145].equalsIgnoreCase(Static434.aClass271_23.method5972(Static483.anInt7694)))) {
						@Pc(168) byte local168 = 0;
						if (local145 == 0) {
							local168 = 11;
						}
						@Pc(177) int local177 = Static141.anInt2605;
						if (local145 == 1) {
							local168 = 51;
						}
						if (local145 == 2) {
							local168 = 16;
						}
						if (local145 == 3) {
							local168 = 19;
						}
						if (local12.anInt3812 == local145) {
							local177 = local12.anInt3781;
						}
						if (local145 == 4) {
							local168 = 59;
						}
						if (local12.anInt3773 == local145) {
							local177 = local12.anInt3807;
						}
						Static564.method7726(false, 0, -1, local135[local145].equalsIgnoreCase(Static434.aClass271_23.method5972(Static483.anInt7694)) ? local12.anInt3791 : local177, false, 0, (long) arg1.anInt4582, local135[local145], (long) arg1.anInt4582, local168, true, "<col=ffff00>" + local30);
					}
				}
			}
			if (local12.aByte47 == 1 && local135 != null) {
				for (local145 = 4; local145 >= 0; local145--) {
					if (local135[local145] != null && local135[local145].equalsIgnoreCase(Static434.aClass271_23.method5972(Static483.anInt7694))) {
						@Pc(296) short local296 = 0;
						if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4650 < local12.anInt3808) {
							local296 = 2000;
						}
						@Pc(305) short local305 = 0;
						if (local145 == 0) {
							local305 = 11;
						}
						if (local145 == 1) {
							local305 = 51;
						}
						if (local145 == 2) {
							local305 = 16;
						}
						if (local145 == 3) {
							local305 = 19;
						}
						if (local145 == 4) {
							local305 = 59;
						}
						if (local305 != 0) {
							local305 += local296;
						}
						Static564.method7726(false, 0, -1, local12.anInt3791, false, 0, (long) arg1.anInt4582, local135[local145], (long) arg1.anInt4582, local305, true, "<col=ffff00>" + local30);
					}
				}
			}
		}
		Static564.method7726(false, 0, -1, Static377.anInt5908, arg0, 0, (long) arg1.anInt4582, Static434.aClass271_22.method5972(Static483.anInt7694), (long) arg1.anInt4582, 1011, true, "<col=ffff00>" + local30);
	}

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V")
	public static void method8392() {
		if (Static252.aClass80_3 != Static122.aClass80_1) {
			try {
				Static651.method4296("tbrefresh", Static78.aClient1);
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!kf;I)I")
	public static int method8393(@OriginalArg(0) Class189 arg0) {
		if (Static290.aClass189_8 == arg0) {
			return 5120;
		} else if (arg0 == Static290.aClass189_9) {
			return 5122;
		} else if (arg0 == Static290.aClass189_10) {
			return 5124;
		} else if (Static290.aClass189_11 == arg0) {
			return 5121;
		} else if (arg0 == Static290.aClass189_12) {
			return 5123;
		} else if (arg0 == Static290.aClass189_13) {
			return 5125;
		} else if (Static290.aClass189_14 == arg0) {
			return 5131;
		} else if (arg0 == Static290.aClass189_15) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
