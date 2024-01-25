import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!gh;IZ)V")
	public static void method3491(@OriginalArg(0) Class15_Sub3_Sub3_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static276.anInt5124 >= 400) {
			return;
		}
		@Pc(14) Class312 local14 = arg0.aClass312_1;
		@Pc(17) String local17 = arg0.aString47;
		if (local14.anIntArray458 != null) {
			local14 = local14.method7953(Static113.aClass282_1);
			if (local14 == null) {
				return;
			}
			local17 = local14.aString108;
		}
		if (!local14.aBoolean656) {
			return;
		}
		if (arg0.anInt4052 != 0) {
			@Pc(54) String local54 = Static551.aClass229_15 == Static534.aClass229_16 ? Static205.aClass134_30.method3906(Static204.anInt8130) : Static205.aClass134_28.method3906(Static204.anInt8130);
			local17 = local17 + Static413.method6773(arg0.anInt4052, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2403) + " (" + local54 + arg0.anInt4052 + ")";
		}
		if (Static537.aBoolean683 && !arg1) {
			@Pc(94) Class204 local94 = Static125.anInt2444 == -1 ? null : Static142.aClass367_1.method9243(Static125.anInt2444);
			if ((Static156.anInt3415 & 0x2) != 0 && (local94 == null || local14.method7957(local94.anInt5933, Static125.anInt2444) != local94.anInt5933)) {
				Static335.method5521(-1, false, (long) arg0.anInt3977, Static13.aString100 + " -> <col=ffff00>" + local17, 0, 0, false, true, Static397.anInt11031, (long) arg0.anInt3977, 17, Static526.aString109);
			}
		}
		if (!arg1) {
			@Pc(147) String[] local147 = local14.aStringArray55;
			if (Static500.aBoolean650) {
				local147 = Static510.method7945(local147);
			}
			@Pc(159) int local159;
			if (local147 != null) {
				for (local159 = 4; local159 >= 0; local159--) {
					if (local147[local159] != null && (local14.aByte121 == 0 || !local147[local159].equalsIgnoreCase(Static205.aClass134_23.method3906(Static204.anInt8130)))) {
						@Pc(182) byte local182 = 0;
						if (local159 == 0) {
							local182 = 9;
						}
						@Pc(188) int local188 = Static373.anInt7103;
						if (local159 == 1) {
							local182 = 20;
						}
						if (local159 == 2) {
							local182 = 58;
						}
						if (local159 == 3) {
							local182 = 30;
						}
						if (local159 == 4) {
							local182 = 21;
						}
						if (local159 == local14.anInt9075) {
							local188 = local14.anInt9069;
						}
						if (local14.anInt9089 == local159) {
							local188 = local14.anInt9088;
						}
						Static335.method5521(-1, false, (long) arg0.anInt3977, "<col=ffff00>" + local17, 0, 0, false, true, local147[local159].equalsIgnoreCase(Static205.aClass134_23.method3906(Static204.anInt8130)) ? local14.anInt9079 : local188, (long) arg0.anInt3977, local182, local147[local159]);
					}
				}
			}
			if (local14.aByte121 == 1 && local147 != null) {
				for (local159 = 4; local159 >= 0; local159--) {
					if (local147[local159] != null && local147[local159].equalsIgnoreCase(Static205.aClass134_23.method3906(Static204.anInt8130))) {
						@Pc(298) short local298 = 0;
						if (arg0.anInt4052 > Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt2403) {
							local298 = 2000;
						}
						@Pc(307) short local307 = 0;
						if (local159 == 0) {
							local307 = 9;
						}
						if (local159 == 1) {
							local307 = 20;
						}
						if (local159 == 2) {
							local307 = 58;
						}
						if (local159 == 3) {
							local307 = 30;
						}
						if (local159 == 4) {
							local307 = 21;
						}
						if (local307 != 0) {
							local307 += local298;
						}
						Static335.method5521(-1, false, (long) arg0.anInt3977, "<col=ffff00>" + local17, 0, 0, false, true, local14.anInt9079, (long) arg0.anInt3977, local307, local147[local159]);
					}
				}
			}
		}
		Static335.method5521(-1, false, (long) arg0.anInt3977, "<col=ffff00>" + local17, 0, 0, arg1, true, Static198.anInt4183, (long) arg0.anInt3977, 1009, Static205.aClass134_22.method3906(Static204.anInt8130));
	}
}
