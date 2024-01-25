import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bha", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "client!bha", name = "g", descriptor = "Lclient!gga;")
	public static Class124 aClass124_12;

	@OriginalMember(owner = "client!bha", name = "m", descriptor = "B")
	public static byte aByte12;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZBI)Lclient!ng;")
	public static Class2_Sub42 method979(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class2_Sub42) Static37.aClass335_5.method8357(local17);
	}

	@OriginalMember(owner = "client!bha", name = "b", descriptor = "(Z)V")
	public static void method981() {
		for (@Pc(3) int local3 = 0; local3 < Static356.anInt6821; local3++) {
			@Pc(9) Class150 local9 = Static307.aClass150Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(146) int local146;
			if (local9.aClass2_Sub26_Sub5_3 == null) {
				local9.anInt4618--;
				if (local9.anInt4618 >= (local9.method4174() ? -1500 : -10)) {
					if (local9.aByte74 == 1 && local9.aClass116_1 == null) {
						local9.aClass116_1 = Static678.method3543(Static437.aClass124_88, local9.anInt4619, 0);
						if (local9.aClass116_1 == null) {
							continue;
						}
						local9.anInt4618 += local9.aClass116_1.method3544();
					} else if (local9.method4174() && (local9.aClass2_Sub46_3 == null || local9.aClass2_Sub44_Sub1_3 == null)) {
						if (local9.aClass2_Sub46_3 == null) {
							local9.aClass2_Sub46_3 = Static529.method8217(Static40.aClass124_9, local9.anInt4619);
						}
						if (local9.aClass2_Sub46_3 == null) {
							continue;
						}
						if (local9.aClass2_Sub44_Sub1_3 == null) {
							local9.aClass2_Sub44_Sub1_3 = local9.aClass2_Sub46_3.method8218(new int[] { 22050 });
							if (local9.aClass2_Sub44_Sub1_3 == null) {
								continue;
							}
						}
					}
					if (local9.anInt4618 < 0) {
						@Pc(119) int local119 = 8192;
						if (local9.anInt4620 == 0) {
							local146 = local9.anInt4617 * (local9.aByte74 == 3 ? Static230.aClass2_Sub54_15.aClass4_Sub22_2.method7520() : Static230.aClass2_Sub54_15.aClass4_Sub22_1.method7520()) >> 2;
						} else {
							@Pc(155) int local155 = local9.anInt4620 >> 24 & 0x3;
							if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 == local155) {
								@Pc(170) int local170 = (local9.anInt4620 & 0xFF) << 9;
								@Pc(176) int local176 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method3690() << 8;
								@Pc(183) int local183 = local9.anInt4620 >> 16 & 0xFF;
								@Pc(195) int local195 = (local183 << 9) + local176 + 256 - Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022;
								@Pc(202) int local202 = local9.anInt4620 >> 8 & 0xFF;
								@Pc(214) int local214 = local176 + (local202 << 9) + 256 - Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024;
								@Pc(222) int local222 = Math.abs(local195) + Math.abs(local214) - 512;
								if (local170 < local222) {
									local9.anInt4618 = -99999;
									continue;
								}
								if (local222 < 0) {
									local222 = 0;
								}
								local146 = (local170 - local222) * Static230.aClass2_Sub54_15.aClass4_Sub22_4.method7520() * local9.anInt4617 / local170 >> 2;
								if (local9.aClass15_Sub3_13 != null && local9.aClass15_Sub3_13 instanceof Class15_Sub3_Sub3) {
									@Pc(266) Class15_Sub3_Sub3 local266 = (Class15_Sub3_Sub3) local9.aClass15_Sub3_13;
									@Pc(269) short local269 = local266.aShort64;
									@Pc(272) short local272 = local266.aShort62;
								}
								if (local195 != 0 || local214 != 0) {
									@Pc(293) int local293 = -Static152.anInt3290 - (int) (Math.atan2((double) local195, (double) local214) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local293 > 8192) {
										local293 = 16384 - local293;
									}
									@Pc(305) int local305;
									if (local222 <= 0) {
										local305 = 8192;
									} else if (local222 >= 4096) {
										local305 = 16384;
									} else {
										local305 = (8192 - local222) / 4096 + 8192;
									}
									local119 = local305 * local293 / 8192 + (16384 - local305 >> 1);
								}
							} else {
								local146 = 0;
							}
						}
						if (local146 > 0) {
							@Pc(344) Class2_Sub44_Sub1 local344 = null;
							if (local9.aByte74 == 1) {
								local344 = local9.aClass116_1.method3542().method8940(Static471.aClass269_2);
							} else if (local9.method4174()) {
								local344 = local9.aClass2_Sub44_Sub1_3;
							}
							@Pc(372) Class2_Sub26_Sub5 local372 = local9.aClass2_Sub26_Sub5_3 = Static686.method9797(local344, local9.anInt4622, local146, local119);
							local372.method9763(local9.anInt4624 - 1);
							Static270.aClass2_Sub26_Sub4_2.method7391(local372);
						}
					}
				} else {
					local11 = true;
				}
			} else if (!local9.aClass2_Sub26_Sub5_3.method9823()) {
				local11 = true;
			}
			if (local11) {
				Static356.anInt6821--;
				for (local146 = local3; local146 < Static356.anInt6821; local146++) {
					Static307.aClass150Array1[local146] = Static307.aClass150Array1[local146 + 1];
				}
				local3--;
			}
		}
		if (Static239.aBoolean367 && !Static604.method9048()) {
			if (Static230.aClass2_Sub54_15.lb.method7520() != 0 && Static143.anInt2682 != -1) {
				if (Static134.aClass2_Sub26_Sub3_3 == null) {
					Static494.method7792(Static143.anInt2682, Static230.aClass2_Sub54_15.lb.method7520(), Static502.aClass124_105);
				} else {
					Static204.method7272(Static143.anInt2682, Static230.aClass2_Sub54_15.lb.method7520(), Static502.aClass124_105, Static134.aClass2_Sub26_Sub3_3);
				}
			}
			Static239.aBoolean367 = false;
			Static134.aClass2_Sub26_Sub3_3 = null;
		} else if (Static230.aClass2_Sub54_15.lb.method7520() != 0 && Static143.anInt2682 != -1 && !Static604.method9048()) {
			@Pc(494) Class2_Sub52 local494 = Static311.method5098(Static74.aClass341_87, Static125.aClass179_1);
			local494.aClass2_Sub8_Sub2_2.method5194(Static143.anInt2682);
			Static38.method791(local494);
			Static143.anInt2682 = -1;
		}
	}
}
