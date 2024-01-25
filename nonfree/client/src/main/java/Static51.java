import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "[Lclient!caa;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
	public static int anInt1061;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "Lclient!da;")
	public static Class19 aClass19_4;

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "[I")
	public static final int[] anIntArray61 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
	public static void method1002(@OriginalArg(1) int arg0) {
		Static583.method8069();
		@Pc(16) int local16 = Static313.aClass200_1.method4611(arg0).anInt10616;
		if (local16 == 0) {
			return;
		}
		@Pc(24) int local24 = Static659.aClass363_3.anIntArray670[arg0];
		if (local16 == 6) {
			Static232.anInt3954 = local24;
		}
		if (local16 == 5) {
			Static261.anInt4524 = local24;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	public static void method1004() {
		if (!Static277.aBoolean303) {
			Static217.aBoolean218 = Static526.anInt8686 != -1 && Static526.anInt8686 <= Static183.anInt3155 || Static183.anInt3155 * 16 + (Static292.aBoolean317 ? 26 : 22) > Static348.anInt5935;
		}
		Static183.aClass362_14.method8543();
		Static362.aClass362_30.method8543();
		@Pc(49) int local49;
		for (@Pc(44) Class6_Sub4_Sub12 local44 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8538(); local44 != null; local44 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8530()) {
			local49 = local44.anInt7577;
			if (local49 < 1000) {
				local44.method9174();
				if (local49 == 15 || local49 == 12 || local49 == 47 || local49 == 46 || local49 == 8 || local49 == 6 || local49 == 22) {
					Static362.aClass362_30.method8536(local44);
				} else {
					Static183.aClass362_14.method8536(local44);
				}
			}
		}
		Static183.aClass362_14.method8537(Static31.aClass362_3);
		Static362.aClass362_30.method8537(Static31.aClass362_3);
		if (Static183.anInt3155 > 1) {
			if (Static71.aBoolean71 && Static170.aClass4_1.method1024(81) && Static183.anInt3155 > 2) {
				Static593.aClass6_Sub4_Sub12_4 = (Class6_Sub4_Sub12) Static31.aClass362_3.aClass6_312.aClass6_337.aClass6_337;
			} else {
				Static593.aClass6_Sub4_Sub12_4 = (Class6_Sub4_Sub12) Static31.aClass362_3.aClass6_312.aClass6_337;
			}
			Static233.aClass6_Sub4_Sub12_2 = (Class6_Sub4_Sub12) Static31.aClass362_3.aClass6_312.aClass6_337;
		} else {
			Static233.aClass6_Sub4_Sub12_2 = null;
			Static593.aClass6_Sub4_Sub12_4 = null;
		}
		local49 = -1;
		@Pc(158) Class6_Sub27 local158 = (Class6_Sub27) Static60.aClass362_8.method8538();
		if (local158 != null) {
			local49 = local158.method8186();
		}
		if (!Static277.aBoolean303) {
			if (local49 == 0 && (Static261.anInt4524 == 1 && Static183.anInt3155 > 2 || Static100.method1647())) {
				local49 = 2;
			}
			if (local49 == 2 && Static183.anInt3155 > 0 && local158 != null) {
				if (Static489.aClass321_39 == null && Static423.anInt7313 == 0) {
					Static441.method6455(local158.method8188(), local158.method8184());
				} else {
					Static548.anInt9237 = 2;
				}
			}
			if (local49 == 0) {
				if (Static593.aClass6_Sub4_Sub12_4 != null) {
					Static305.method4388();
				} else if (Static291.aBoolean314) {
					Static221.method3209();
				}
			}
			if (Static489.aClass321_39 != null || Static423.anInt7313 != 0) {
				return;
			}
			Static548.anInt9237 = 0;
			Static391.aClass6_Sub4_Sub12_3 = null;
			return;
		}
		@Pc(174) int local174;
		@Pc(178) int local178;
		@Pc(267) int local267;
		@Pc(269) int local269;
		if (local49 == -1) {
			local174 = Static193.aClass128_1.method5191();
			local178 = Static193.aClass128_1.method5188();
			@Pc(180) boolean local180 = false;
			if (Static275.aClass6_Sub4_Sub10_1 != null) {
				if (Static347.anInt10656 - 10 <= local174 && Static314.anInt5338 + Static347.anInt10656 + 10 >= local174 && local178 >= Static166.anInt2811 - 10 && Static494.anInt8391 + Static166.anInt2811 + 10 >= local178) {
					local180 = true;
				} else {
					Static100.method1645();
				}
			}
			if (!local180) {
				if (local174 < Static643.anInt10391 - 10 || local174 > Static643.anInt10391 + Static279.anInt4804 + 10 || Static32.anInt784 - 10 > local178 || Static122.anInt2157 + Static32.anInt784 + 10 < local178) {
					Static406.method5836();
				} else if (Static217.aBoolean218) {
					local267 = -1;
					local269 = -1;
					@Pc(284) int local284;
					for (@Pc(271) int local271 = 0; local271 < Static305.anInt5201; local271++) {
						if (Static292.aBoolean317) {
							local284 = local271 * 16 + Static32.anInt784 + 33;
							if (local284 - 13 < local178 && local178 < local284 + 4) {
								local267 = local271;
								local269 = local284 - 13;
								break;
							}
						} else {
							local284 = Static32.anInt784 + local271 * 16 + 31;
							if (local284 - 13 < local178 && local284 + 3 > local178) {
								local269 = local284 - 13;
								local267 = local271;
								break;
							}
						}
					}
					if (local267 != -1) {
						local284 = 0;
						@Pc(347) Class180 local347 = new Class180(Static258.aClass384_7);
						for (@Pc(352) Class6_Sub4_Sub10 local352 = (Class6_Sub4_Sub10) local347.method4135(); local352 != null; local352 = (Class6_Sub4_Sub10) local347.method4137()) {
							if (local284 == local267) {
								if (local352.anInt5448 > 1) {
									Static514.method7274(local269, local352, local178);
								}
								break;
							}
							local284++;
						}
					}
				}
			}
		}
		if (local49 != 0) {
			return;
		}
		local174 = local158.method8184();
		local178 = local158.method8188();
		@Pc(424) int local424;
		@Pc(501) Class180 local501;
		@Pc(506) Class6_Sub4_Sub12 local506;
		if (Static275.aClass6_Sub4_Sub10_1 != null && Static347.anInt10656 <= local174 && Static347.anInt10656 + Static314.anInt5338 >= local174 && Static166.anInt2811 <= local178 && Static166.anInt2811 + Static494.anInt8391 >= local178) {
			local424 = -1;
			for (local267 = 0; local267 < Static275.aClass6_Sub4_Sub10_1.anInt5448; local267++) {
				if (Static292.aBoolean317) {
					local269 = local267 * 16 + Static166.anInt2811 + 33;
					if (local269 - 13 < local178 && local269 + 4 > local178) {
						local424 = local267;
					}
				} else {
					local269 = local267 * 16 + Static166.anInt2811 + 31;
					if (local178 > local269 - 13 && local269 + 3 > local178) {
						local424 = local267;
					}
				}
			}
			if (local424 != -1) {
				local269 = 0;
				local501 = new Class180(Static275.aClass6_Sub4_Sub10_1.aClass384_11);
				for (local506 = (Class6_Sub4_Sub12) local501.method4135(); local506 != null; local506 = (Class6_Sub4_Sub12) local501.method4137()) {
					if (local424 == local269) {
						Static347.method9040(local178, local506, local174);
						break;
					}
					local269++;
				}
			}
			Static406.method5836();
			return;
		}
		if (local174 < Static643.anInt10391 || Static643.anInt10391 + Static279.anInt4804 < local174 || Static32.anInt784 > local178 || Static32.anInt784 + Static122.anInt2157 < local178) {
			return;
		}
		if (!Static217.aBoolean218) {
			local424 = -1;
			for (local267 = 0; local267 < Static183.anInt3155; local267++) {
				if (Static292.aBoolean317) {
					local269 = (Static183.anInt3155 - local267 - 1) * 16 + Static32.anInt784 + 33;
					if (local178 > local269 - 13 && local269 + 4 > local178) {
						local424 = local267;
					}
				} else {
					local269 = (Static183.anInt3155 - local267 - 1) * 16 + Static32.anInt784 + 31;
					if (local178 > local269 - 13 && local178 < local269 + 3) {
						local424 = local267;
					}
				}
			}
			if (local424 != -1) {
				local269 = 0;
				@Pc(642) Class364 local642 = new Class364(Static31.aClass362_3);
				for (local506 = (Class6_Sub4_Sub12) local642.method8570(); local506 != null; local506 = (Class6_Sub4_Sub12) local642.method8572()) {
					if (local424 == local269) {
						Static347.method9040(local178, local506, local174);
						break;
					}
					local269++;
				}
			}
			Static406.method5836();
			return;
		}
		local424 = -1;
		for (local267 = 0; local267 < Static305.anInt5201; local267++) {
			if (Static292.aBoolean317) {
				local269 = local267 * 16 + Static32.anInt784 + 33;
				if (local269 - 13 < local178 && local178 < local269 + 4) {
					local424 = local267;
					break;
				}
			} else {
				local269 = Static32.anInt784 + local267 * 16 + 31;
				if (local178 > local269 - 13 && local269 + 3 > local178) {
					local424 = local267;
					break;
				}
			}
		}
		if (local424 == -1) {
			return;
		}
		local269 = 0;
		local501 = new Class180(Static258.aClass384_7);
		for (@Pc(751) Class6_Sub4_Sub10 local751 = (Class6_Sub4_Sub10) local501.method4135(); local751 != null; local751 = (Class6_Sub4_Sub10) local501.method4137()) {
			if (local424 == local269) {
				Static347.method9040(local178, (Class6_Sub4_Sub12) local751.aClass384_11.aClass6_Sub4_62.aClass6_Sub4_67, local174);
				Static406.method5836();
				return;
			}
			local269++;
		}
		return;
	}
}
