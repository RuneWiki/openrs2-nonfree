import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!sq", name = "x", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "Lclient!ge;")
	public static Class112 aClass112_6;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V")
	public static void method7848() {
		if (!Static71.aBoolean94) {
			Static165.aBoolean249 = Static339.anInt9927 != -1 && Static462.anInt8179 >= Static339.anInt9927 || Static356.anInt6630 < Static462.anInt8179 * 16 + (Static270.aBoolean364 ? 26 : 22);
		}
		Static182.aClass8_18.method154();
		Static603.aClass8_65.method154();
		@Pc(52) int local52;
		for (@Pc(47) Class6_Sub2_Sub4 local47 = (Class6_Sub2_Sub4) Static298.aClass8_34.method149(); local47 != null; local47 = (Class6_Sub2_Sub4) Static298.aClass8_34.method155()) {
			local52 = local47.anInt1738;
			if (local52 < 1000) {
				local47.method9043();
				if (local52 == 6 || local52 == 4 || local52 == 22 || local52 == 2 || local52 == 11 || local52 == 46 || local52 == 16) {
					Static603.aClass8_65.method157(local47);
				} else {
					Static182.aClass8_18.method157(local47);
				}
			}
		}
		Static182.aClass8_18.method156(Static298.aClass8_34);
		Static603.aClass8_65.method156(Static298.aClass8_34);
		if (Static462.anInt8179 <= 1) {
			Static215.aClass6_Sub2_Sub4_2 = null;
			Static482.aClass6_Sub2_Sub4_4 = null;
		} else {
			if (Static576.aBoolean330 && Static647.aClass251_1.method6712(81) && Static462.anInt8179 > 2) {
				Static482.aClass6_Sub2_Sub4_4 = (Class6_Sub2_Sub4) Static298.aClass8_34.aClass6_7.aClass6_300.aClass6_300;
			} else {
				Static482.aClass6_Sub2_Sub4_4 = (Class6_Sub2_Sub4) Static298.aClass8_34.aClass6_7.aClass6_300;
			}
			Static215.aClass6_Sub2_Sub4_2 = (Class6_Sub2_Sub4) Static298.aClass8_34.aClass6_7.aClass6_300;
		}
		local52 = -1;
		@Pc(161) Class6_Sub15 local161 = (Class6_Sub15) Static334.aClass8_33.method149();
		if (local161 != null) {
			local52 = local161.method8390();
		}
		if (!Static71.aBoolean94) {
			if (local52 == 0 && (Static414.anInt7552 == 1 && Static462.anInt8179 > 2 || Static77.method1324())) {
				local52 = 2;
			}
			if (local52 == 2 && Static462.anInt8179 > 0 && local161 != null) {
				if (Static478.aClass302_56 == null && Static614.anInt10101 == 0) {
					Static293.method5060(local161.method8383(), local161.method8387());
				} else {
					Static194.anInt3940 = 2;
				}
			}
			if (local52 == 0) {
				if (Static482.aClass6_Sub2_Sub4_4 != null) {
					Static579.method8182();
				} else if (Static280.aBoolean380) {
					Static633.method8924();
				}
			}
			if (Static478.aClass302_56 != null || Static614.anInt10101 != 0) {
				return;
			}
			Static120.aClass6_Sub2_Sub4_1 = null;
			Static194.anInt3940 = 0;
			return;
		}
		@Pc(177) int local177;
		@Pc(181) int local181;
		@Pc(265) int local265;
		@Pc(267) int local267;
		if (local52 == -1) {
			local177 = Static429.aClass71_1.method7701();
			local181 = Static429.aClass71_1.method7702();
			@Pc(183) boolean local183 = false;
			if (Static72.aClass6_Sub2_Sub12_1 != null) {
				if (local177 >= Static195.anInt3962 - 10 && Static282.anInt5632 + Static195.anInt3962 + 10 >= local177 && local181 >= Static617.anInt10189 - 10 && local181 <= Static617.anInt10189 + Static457.anInt8136 + 10) {
					local183 = true;
				} else {
					Static452.method6948();
				}
			}
			if (!local183) {
				if (local177 < Static29.anInt622 - 10 || local177 > Static400.anInt7476 + Static29.anInt622 + 10 || Static94.anInt1854 - 10 > local181 || Static483.anInt8373 + Static94.anInt1854 + 10 < local181) {
					Static547.method7963();
				} else if (Static165.aBoolean249) {
					local265 = -1;
					local267 = -1;
					@Pc(282) int local282;
					for (@Pc(269) int local269 = 0; local269 < Static608.anInt10066; local269++) {
						if (Static270.aBoolean364) {
							local282 = Static94.anInt1854 + local269 * 16 + 33;
							if (local282 - 13 < local181 && local282 + 4 > local181) {
								local267 = local282 - 13;
								local265 = local269;
								break;
							}
						} else {
							local282 = Static94.anInt1854 + local269 * 16 + 31;
							if (local181 > local282 - 13 && local282 + 3 > local181) {
								local267 = local282 - 13;
								local265 = local269;
								break;
							}
						}
					}
					if (local265 != -1) {
						local282 = 0;
						@Pc(345) Class134 local345 = new Class134(Static603.aClass286_12);
						for (@Pc(350) Class6_Sub2_Sub12 local350 = (Class6_Sub2_Sub12) local345.method3651(); local350 != null; local350 = (Class6_Sub2_Sub12) local345.method3649()) {
							if (local282 == local265) {
								if (local350.anInt5417 > 1) {
									Static483.method7220(local181, local350, local267);
								}
								break;
							}
							local282++;
						}
					}
				}
			}
		}
		if (local52 != 0) {
			return;
		}
		local177 = local161.method8383();
		local181 = local161.method8387();
		@Pc(453) int local453;
		@Pc(640) Class134 local640;
		@Pc(542) Class6_Sub2_Sub4 local542;
		if (Static72.aClass6_Sub2_Sub12_1 != null && Static195.anInt3962 <= local177 && local177 <= Static282.anInt5632 + Static195.anInt3962 && local181 >= Static617.anInt10189 && local181 <= Static617.anInt10189 + Static457.anInt8136) {
			local453 = -1;
			for (local265 = 0; local265 < Static72.aClass6_Sub2_Sub12_1.anInt5417; local265++) {
				if (Static270.aBoolean364) {
					local267 = local265 * 16 + Static617.anInt10189 + 33;
					if (local181 > local267 - 13 && local181 < local267 + 4) {
						local453 = local265;
					}
				} else {
					local267 = local265 * 16 + Static617.anInt10189 + 31;
					if (local181 > local267 - 13 && local267 + 3 > local181) {
						local453 = local265;
					}
				}
			}
			if (local453 != -1) {
				local267 = 0;
				local640 = new Class134(Static72.aClass6_Sub2_Sub12_1.aClass286_6);
				for (local542 = (Class6_Sub2_Sub4) local640.method3651(); local542 != null; local542 = (Class6_Sub2_Sub4) local640.method3649()) {
					if (local267 == local453) {
						Static20.method337(local181, local542, local177);
						break;
					}
					local267++;
				}
			}
			Static547.method7963();
			return;
		}
		if (local177 < Static29.anInt622 || local177 > Static400.anInt7476 + Static29.anInt622 || local181 < Static94.anInt1854 || local181 > Static483.anInt8373 + Static94.anInt1854) {
			return;
		}
		if (!Static165.aBoolean249) {
			local453 = -1;
			for (local265 = 0; local265 < Static462.anInt8179; local265++) {
				if (Static270.aBoolean364) {
					local267 = (Static462.anInt8179 - local265 - 1) * 16 + Static94.anInt1854 + 33;
					if (local267 - 13 < local181 && local181 < local267 + 4) {
						local453 = local265;
					}
				} else {
					local267 = (Static462.anInt8179 - local265 - 1) * 16 + Static94.anInt1854 + 31;
					if (local267 - 13 < local181 && local181 < local267 + 3) {
						local453 = local265;
					}
				}
			}
			if (local453 != -1) {
				local267 = 0;
				@Pc(537) Class91 local537 = new Class91(Static298.aClass8_34);
				for (local542 = (Class6_Sub2_Sub4) local537.method2338(); local542 != null; local542 = (Class6_Sub2_Sub4) local537.method2335()) {
					if (local453 == local267) {
						Static20.method337(local181, local542, local177);
						break;
					}
					local267++;
				}
			}
			Static547.method7963();
			return;
		}
		local453 = -1;
		for (local265 = 0; local265 < Static608.anInt10066; local265++) {
			if (Static270.aBoolean364) {
				local267 = Static94.anInt1854 + local265 * 16 + 33;
				if (local267 - 13 < local181 && local181 < local267 + 4) {
					local453 = local265;
					break;
				}
			} else {
				local267 = Static94.anInt1854 + local265 * 16 + 31;
				if (local181 > local267 - 13 && local267 + 3 > local181) {
					local453 = local265;
					break;
				}
			}
		}
		if (local453 == -1) {
			return;
		}
		local267 = 0;
		local640 = new Class134(Static603.aClass286_12);
		for (@Pc(645) Class6_Sub2_Sub12 local645 = (Class6_Sub2_Sub12) local640.method3651(); local645 != null; local645 = (Class6_Sub2_Sub12) local640.method3649()) {
			if (local267 == local453) {
				Static20.method337(local181, (Class6_Sub2_Sub4) local645.aClass286_6.aClass6_Sub2_56.aClass6_Sub2_66, local177);
				Static547.method7963();
				return;
			}
			local267++;
		}
		return;
	}
}
