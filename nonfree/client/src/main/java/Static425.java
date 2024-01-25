import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
	public static int anInt6494;

	@OriginalMember(owner = "client!mw", name = "j", descriptor = "Lclient!ik;")
	public static Class182 aClass182_88;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "Lclient!sla;")
	public static final Class344 aClass344_9 = new Class344(1, 19);

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)V")
	public static void method5642() {
		if (!Static530.aBoolean556) {
			Static228.aBoolean744 = Static7.anInt227 != -1 && Static716.anInt11158 >= Static7.anInt227 || (Static477.aBoolean508 ? 26 : 22) + Static716.anInt11158 * 16 > Static76.anInt1720;
		}
		Static29.aClass342_15.method7655();
		Static32.aClass342_16.method7655();
		@Pc(58) int local58;
		for (@Pc(51) Class3_Sub7_Sub10 local51 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7644(); local51 != null; local51 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7650()) {
			local58 = local51.anInt3913;
			if (local58 < 1000) {
				local51.method9596();
				if (local58 == 19 || local58 == 44 || local58 == 21 || local58 == 30 || local58 == 15 || local58 == 45 || local58 == 48) {
					Static32.aClass342_16.method7654(local51);
				} else {
					Static29.aClass342_15.method7654(local51);
				}
			}
		}
		Static29.aClass342_15.method7657(Static419.aClass342_81);
		Static32.aClass342_16.method7657(Static419.aClass342_81);
		if (Static716.anInt11158 <= 1) {
			Static585.aClass3_Sub7_Sub10_3 = null;
			Static682.aClass3_Sub7_Sub10_4 = null;
		} else {
			if (Static182.aBoolean199 && Static43.aClass50_1.method7394(81) && Static716.anInt11158 > 2) {
				Static585.aClass3_Sub7_Sub10_3 = (Class3_Sub7_Sub10) Static419.aClass342_81.aClass3_291.aClass3_345.aClass3_345;
			} else {
				Static585.aClass3_Sub7_Sub10_3 = (Class3_Sub7_Sub10) Static419.aClass342_81.aClass3_291.aClass3_345;
			}
			Static682.aClass3_Sub7_Sub10_4 = (Class3_Sub7_Sub10) Static419.aClass342_81.aClass3_291.aClass3_345;
		}
		local58 = -1;
		@Pc(202) Class3_Sub23 local202 = (Class3_Sub23) Static114.aClass342_21.method7644();
		if (local202 != null) {
			local58 = local202.method3194();
		}
		if (!Static530.aBoolean556) {
			if (local58 == 0 && (Static639.anInt9892 == 1 && Static716.anInt11158 > 2 || Static535.method9060())) {
				local58 = 2;
			}
			if (local58 == 2 && Static716.anInt11158 > 0 && local202 != null) {
				if (Static334.aClass270_10 == null && Static116.anInt2383 == 0) {
					Static569.method7380(local202.method3196(), local202.method3197());
				} else {
					Static68.anInt1625 = 2;
				}
			}
			if (local58 == 0) {
				if (Static585.aClass3_Sub7_Sub10_3 != null) {
					Static636.method8387();
				} else if (Static474.aBoolean505) {
					Static443.method5872();
				}
			}
			if (Static334.aClass270_10 == null && Static116.anInt2383 == 0) {
				Static68.anInt1625 = 0;
				Static524.aClass3_Sub7_Sub10_2 = null;
			}
			return;
		}
		@Pc(319) int local319;
		@Pc(323) int local323;
		@Pc(428) int local428;
		@Pc(430) int local430;
		if (local58 == -1) {
			local319 = Static334.aClass18_1.method4192();
			local323 = Static334.aClass18_1.method4196();
			@Pc(325) boolean local325 = false;
			if (Static15.aClass3_Sub7_Sub5_1 != null) {
				if (local319 >= Static440.anInt6770 - 10 && local319 <= Static440.anInt6770 + Static331.anInt5337 + 10 && local323 >= Static225.anInt3682 - 10 && Static225.anInt3682 + Static558.anInt8545 + 10 >= local323) {
					local325 = true;
				} else {
					Static231.method3379();
				}
			}
			if (!local325) {
				if (Static123.anInt2492 - 10 > local319 || Static123.anInt2492 + Static332.anInt5338 + 10 < local319 || local323 < Static177.anInt3132 - 10 || local323 > Static284.anInt4357 + Static177.anInt3132 + 10) {
					Static54.method1303();
				} else if (Static228.aBoolean744) {
					local428 = -1;
					local430 = -1;
					@Pc(447) int local447;
					for (@Pc(432) int local432 = 0; local432 < Static239.anInt3802; local432++) {
						if (Static477.aBoolean508) {
							local447 = local432 * 16 + Static177.anInt3132 + 33;
							if (local323 > local447 - 13 && local323 < local447 + 4) {
								local428 = local432;
								local430 = local447 - 13;
								break;
							}
						} else {
							local447 = Static177.anInt3132 + local432 * 16 + 31;
							if (local323 > local447 - 13 && local323 < local447 + 3) {
								local430 = local447 - 13;
								local428 = local432;
								break;
							}
						}
					}
					if (local428 != -1) {
						local447 = 0;
						@Pc(524) Class355 local524 = new Class355(Static242.aClass147_2);
						for (@Pc(529) Class3_Sub7_Sub5 local529 = (Class3_Sub7_Sub5) local524.method7923(); local529 != null; local529 = (Class3_Sub7_Sub5) local524.method7921()) {
							if (local428 == local447) {
								if (local529.anInt2315 > 1) {
									Static131.method2340(local323, local430, local529);
								}
								break;
							}
							local447++;
						}
					}
				}
			}
		}
		if (local58 != 0) {
			return;
		}
		local319 = local202.method3197();
		local323 = local202.method3196();
		@Pc(624) int local624;
		@Pc(704) Class355 local704;
		@Pc(709) Class3_Sub7_Sub10 local709;
		if (Static15.aClass3_Sub7_Sub5_1 != null && local319 >= Static440.anInt6770 && Static331.anInt5337 + Static440.anInt6770 >= local319 && local323 >= Static225.anInt3682 && Static225.anInt3682 + Static558.anInt8545 >= local323) {
			local624 = -1;
			for (local428 = 0; local428 < Static15.aClass3_Sub7_Sub5_1.anInt2315; local428++) {
				if (Static477.aBoolean508) {
					local430 = local428 * 16 + Static225.anInt3682 + 33;
					if (local323 > local430 - 13 && local323 < local430 + 4) {
						local624 = local428;
					}
				} else {
					local430 = local428 * 16 + Static225.anInt3682 + 31;
					if (local430 - 13 < local323 && local323 < local430 + 3) {
						local624 = local428;
					}
				}
			}
			if (local624 != -1) {
				local430 = 0;
				local704 = new Class355(Static15.aClass3_Sub7_Sub5_1.aClass147_1);
				for (local709 = (Class3_Sub7_Sub10) local704.method7923(); local709 != null; local709 = (Class3_Sub7_Sub10) local704.method7921()) {
					if (local624 == local430) {
						Static172.method2785(local319, local323, local709);
						break;
					}
					local430++;
				}
			}
			Static54.method1303();
			return;
		}
		if (Static123.anInt2492 > local319 || local319 > Static123.anInt2492 + Static332.anInt5338 || local323 < Static177.anInt3132 || local323 > Static177.anInt3132 + Static284.anInt4357) {
			return;
		}
		if (!Static228.aBoolean744) {
			local624 = -1;
			for (local428 = 0; local428 < Static716.anInt11158; local428++) {
				if (Static477.aBoolean508) {
					local430 = Static177.anInt3132 + (-local428 + Static716.anInt11158 - 1) * 16 + 33;
					if (local430 - 13 < local323 && local430 + 4 > local323) {
						local624 = local428;
					}
				} else {
					local430 = (Static716.anInt11158 - local428 - 1) * 16 + Static177.anInt3132 + 31;
					if (local430 - 13 < local323 && local323 < local430 + 3) {
						local624 = local428;
					}
				}
			}
			if (local624 != -1) {
				local430 = 0;
				@Pc(864) Class304 local864 = new Class304(Static419.aClass342_81);
				for (local709 = (Class3_Sub7_Sub10) local864.method6983(); local709 != null; local709 = (Class3_Sub7_Sub10) local864.method6984()) {
					if (local624 == local430) {
						Static172.method2785(local319, local323, local709);
						break;
					}
					local430++;
				}
			}
			Static54.method1303();
			return;
		}
		local624 = -1;
		for (local428 = 0; local428 < Static239.anInt3802; local428++) {
			if (Static477.aBoolean508) {
				local430 = Static177.anInt3132 + local428 * 16 + 33;
				if (local323 > local430 - 13 && local430 + 4 > local323) {
					local624 = local428;
					break;
				}
			} else {
				local430 = local428 * 16 + Static177.anInt3132 + 31;
				if (local323 > local430 - 13 && local430 + 3 > local323) {
					local624 = local428;
					break;
				}
			}
		}
		if (local624 == -1) {
			return;
		}
		local430 = 0;
		local704 = new Class355(Static242.aClass147_2);
		for (@Pc(990) Class3_Sub7_Sub5 local990 = (Class3_Sub7_Sub5) local704.method7923(); local990 != null; local990 = (Class3_Sub7_Sub5) local704.method7921()) {
			if (local624 == local430) {
				Static172.method2785(local319, local323, (Class3_Sub7_Sub10) local990.aClass147_1.aClass3_Sub7_28.aClass3_Sub7_67);
				Static54.method1303();
				return;
			}
			local430++;
		}
		return;
	}
}
