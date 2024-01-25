import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "F")
	public static float aFloat112;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Lclient!kda;")
	public static Class160 aClass160_66;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
	public static int anInt5875;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "Lclient!ada;")
	public static Class6 aClass6_92 = null;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "()V")
	public static void method5073() {
		Static296.anInt5741 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static64.anInt1870; local3++) {
			@Pc(8) Class138 local8 = Static327.aClass138Array3[local3];
			@Pc(12) int local12;
			if (Static189.anIntArray307 != null) {
				for (local12 = 0; local12 < Static189.anIntArray307.length; local12++) {
					if (Static189.anIntArray307[local12] != -1000000 && (local8.anInt4407 <= Static189.anIntArray307[local12] || local8.anInt4388 <= Static189.anIntArray307[local12]) && (local8.anInt4404 <= Static114.anIntArray539[local12] || local8.anInt4405 <= Static114.anIntArray539[local12]) && (local8.anInt4404 >= Static306.anIntArray417[local12] || local8.anInt4405 >= Static306.anIntArray417[local12]) && (local8.anInt4398 <= Static160.anIntArray275[local12] || local8.anInt4397 <= Static160.anIntArray275[local12]) && (local8.anInt4398 >= Static62.anIntArray161[local12] || local8.anInt4397 >= Static62.anIntArray161[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt4403 == 1) {
				local12 = local8.anInt4402 + Static278.anInt5506 - Static406.anInt7107;
				if (local12 >= 0 && local12 <= Static278.anInt5506 + Static278.anInt5506) {
					local110 = local8.anInt4394 + Static278.anInt5506 - Static265.anInt5150;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static278.anInt5506 + Static278.anInt5506) {
						continue;
					}
					local128 = local8.anInt4389 + Static278.anInt5506 - Static265.anInt5150;
					if (local128 > Static278.anInt5506 + Static278.anInt5506) {
						local128 = Static278.anInt5506 + Static278.anInt5506;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static339.aBooleanArrayArray4[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static267.anInt5170 - local8.anInt4404;
						if (local164 > Static165.anInt3649) {
							local8.anInt4391 = 1;
						} else {
							if (local164 >= -Static165.anInt3649) {
								continue;
							}
							local8.anInt4391 = 2;
							local164 = -local164;
						}
						local8.anInt4395 = (local8.anInt4398 - Static360.anInt9309 << 8) / local164;
						local8.anInt4400 = (local8.anInt4397 - Static360.anInt9309 << 8) / local164;
						local8.anInt4396 = (local8.anInt4407 - Static104.anInt2470 << 8) / local164;
						local8.anInt4399 = (local8.anInt4388 - Static104.anInt2470 << 8) / local164;
						Static50.aClass138Array4[Static296.anInt5741++] = local8;
					}
				}
			} else if (local8.anInt4403 == 2) {
				local12 = local8.anInt4394 + Static278.anInt5506 - Static265.anInt5150;
				if (local12 >= 0 && local12 <= Static278.anInt5506 + Static278.anInt5506) {
					local110 = local8.anInt4402 + Static278.anInt5506 - Static406.anInt7107;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static278.anInt5506 + Static278.anInt5506) {
						continue;
					}
					local128 = local8.anInt4401 + Static278.anInt5506 - Static406.anInt7107;
					if (local128 > Static278.anInt5506 + Static278.anInt5506) {
						local128 = Static278.anInt5506 + Static278.anInt5506;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static339.aBooleanArrayArray4[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static360.anInt9309 - local8.anInt4398;
						if (local164 > Static165.anInt3649) {
							local8.anInt4391 = 3;
						} else {
							if (local164 >= -Static165.anInt3649) {
								continue;
							}
							local8.anInt4391 = 4;
							local164 = -local164;
						}
						local8.anInt4392 = (local8.anInt4404 - Static267.anInt5170 << 8) / local164;
						local8.anInt4393 = (local8.anInt4405 - Static267.anInt5170 << 8) / local164;
						local8.anInt4396 = (local8.anInt4407 - Static104.anInt2470 << 8) / local164;
						local8.anInt4399 = (local8.anInt4388 - Static104.anInt2470 << 8) / local164;
						Static50.aClass138Array4[Static296.anInt5741++] = local8;
					}
				}
			} else if (local8.anInt4403 == 4) {
				local12 = local8.anInt4407 - Static104.anInt2470;
				if (local12 > Static120.anInt2885) {
					local110 = local8.anInt4394 + Static278.anInt5506 - Static265.anInt5150;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static278.anInt5506 + Static278.anInt5506) {
						continue;
					}
					local128 = local8.anInt4389 + Static278.anInt5506 - Static265.anInt5150;
					if (local128 > Static278.anInt5506 + Static278.anInt5506) {
						local128 = Static278.anInt5506 + Static278.anInt5506;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt4402 + Static278.anInt5506 - Static406.anInt7107;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static278.anInt5506 + Static278.anInt5506) {
						continue;
					}
					local164 = local8.anInt4401 + Static278.anInt5506 - Static406.anInt7107;
					if (local164 > Static278.anInt5506 + Static278.anInt5506) {
						local164 = Static278.anInt5506 + Static278.anInt5506;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static339.aBooleanArrayArray4[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt4391 = 5;
						local8.anInt4392 = (local8.anInt4404 - Static267.anInt5170 << 8) / local12;
						local8.anInt4393 = (local8.anInt4405 - Static267.anInt5170 << 8) / local12;
						local8.anInt4395 = (local8.anInt4398 - Static360.anInt9309 << 8) / local12;
						local8.anInt4400 = (local8.anInt4397 - Static360.anInt9309 << 8) / local12;
						Static50.aClass138Array4[Static296.anInt5741++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!faa;I)V")
	public static void method5078(@OriginalArg(1) Class47_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		if (Static416.anInt7252 < arg0.anInt5020) {
			Static307.method5098(arg0);
		} else if (Static416.anInt7252 > arg0.anInt5006) {
			Static195.method3630(false, arg0);
			local5 = Static533.anInt9236;
			local7 = Static118.anInt2859;
		} else {
			Static213.method3844(arg0);
		}
		if (arg0.anInt8189 < 128 || arg0.anInt8191 < 128 || (Static542.anInt9387 - 1) * 128 <= arg0.anInt8189 || arg0.anInt8191 >= Static36.anInt1324 * 128 - 128) {
			arg0.anInt5052 = -1;
			arg0.anInt5006 = 0;
			local5 = -1;
			arg0.anInt5018 = -1;
			local7 = 0;
			arg0.anInt5070 = -1;
			arg0.anInt5020 = 0;
			arg0.anInt8189 = arg0.anIntArray362[0] * 128 + arg0.method4350() * 64;
			arg0.anInt8191 = arg0.anIntArray361[0] * 128 + arg0.method4350() * 64;
			arg0.method4361();
		}
		if (Static16.aClass47_Sub2_Sub3_Sub2_1 == arg0 && (arg0.anInt8189 < 1536 || arg0.anInt8191 < 1536 || arg0.anInt8189 >= Static542.anInt9387 * 128 - 1536 || arg0.anInt8191 >= Static36.anInt1324 * 128 - 1536)) {
			local7 = 0;
			arg0.anInt5020 = 0;
			arg0.anInt5070 = -1;
			local5 = -1;
			arg0.anInt5018 = -1;
			arg0.anInt5006 = 0;
			arg0.anInt5052 = -1;
			arg0.anInt8189 = arg0.anIntArray362[0] * 128 + arg0.method4350() * 64;
			arg0.anInt8191 = arg0.anIntArray361[0] * 128 + arg0.method4350() * 64;
			arg0.method4361();
		}
		@Pc(191) int local191 = Static338.method5480(arg0);
		Static478.method6930(local7, arg0, local5, local191);
		Static231.method6235(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!qa;ILclient!kda;Lclient!kda;)V")
	public static void method5079(@OriginalArg(0) Class9 arg0, @OriginalArg(2) Class160 arg1, @OriginalArg(3) Class160 arg2) {
		Static179.aClass177_4 = Static384.method5813(arg1, Static152.anInt3449);
		Static58.aClass27_2 = arg0.method7603(Static179.aClass177_4, Static559.method5935(arg2, Static152.anInt3449));
		Static449.aClass177_9 = Static384.method5813(arg1, Static517.anInt8717);
		Static268.aClass27_4 = arg0.method7603(Static449.aClass177_9, Static559.method5935(arg2, Static517.anInt8717));
		Static159.aClass177_3 = Static384.method5813(arg1, Static26.anInt1130);
		Static106.aClass27_3 = arg0.method7603(Static159.aClass177_3, Static559.method5935(arg2, Static26.anInt1130));
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method5081() {
		return Static25.aBoolean94 || Static158.aClass1_Sub50_1 == null ? "" : Static158.aClass1_Sub50_1.aString82;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!bc;)Z")
	public static boolean method5085(@OriginalArg(1) Class24 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean99) {
			return false;
		} else if (!arg0.method1184(Static451.anInterface10_2)) {
			return false;
		} else if (Static179.aClass174_11.method4422((long) arg0.anInt1154) == null) {
			return Static61.aClass174_4.method4422((long) arg0.anInt1169) == null;
		} else {
			return false;
		}
	}
}
