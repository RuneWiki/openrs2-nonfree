import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	public static int anInt4545;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
	public static int anInt4547;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "[I")
	public static final int[] anIntArray208 = new int[25];

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Lclient!nea;")
	public static final Class244 aClass244_9 = new Class244(4);

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public static int anInt4542 = -1;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "[I")
	public static final int[] anIntArray209 = new int[32];

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "F")
	public static float aFloat89 = 0.0F;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	public static void method4097() {
		if (!Static183.aBoolean305) {
			Static672.aBoolean808 = Static157.anInt3422 != -1 && Static157.anInt3422 <= Static276.anInt5124 || Static276.anInt5124 * 16 + (Static300.aBoolean723 ? 26 : 22) > Static19.anInt352;
		}
		Static168.aClass271_25.method7181();
		Static167.aClass271_23.method7181();
		@Pc(50) int local50;
		for (@Pc(45) Class2_Sub1_Sub13 local45 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7177(); local45 != null; local45 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7175()) {
			local50 = local45.anInt6866;
			if (local50 < 1000) {
				local45.method9825();
				if (local50 == 48 || local50 == 44 || local50 == 17 || local50 == 13 || local50 == 16 || local50 == 18 || local50 == 12) {
					Static167.aClass271_23.method7174(local45);
				} else {
					Static168.aClass271_25.method7174(local45);
				}
			}
		}
		Static168.aClass271_25.method7180(Static61.aClass271_6);
		Static167.aClass271_23.method7180(Static61.aClass271_6);
		if (Static276.anInt5124 <= 1) {
			Static577.aClass2_Sub1_Sub13_4 = null;
			Static319.aClass2_Sub1_Sub13_2 = null;
		} else {
			if (Static400.aBoolean557 && Static202.aClass191_1.method8963(81) && Static276.anInt5124 > 2) {
				Static577.aClass2_Sub1_Sub13_4 = (Class2_Sub1_Sub13) Static61.aClass271_6.aClass2_230.aClass2_337.aClass2_337;
			} else {
				Static577.aClass2_Sub1_Sub13_4 = (Class2_Sub1_Sub13) Static61.aClass271_6.aClass2_230.aClass2_337;
			}
			Static319.aClass2_Sub1_Sub13_2 = (Class2_Sub1_Sub13) Static61.aClass271_6.aClass2_230.aClass2_337;
		}
		local50 = -1;
		@Pc(158) Class2_Sub35 local158 = (Class2_Sub35) Static489.aClass271_50.method7177();
		if (local158 != null) {
			local50 = local158.method9190();
		}
		if (!Static183.aBoolean305) {
			if (local50 == 0 && (Static83.anInt1469 == 1 && Static276.anInt5124 > 2 || Static307.method5029())) {
				local50 = 2;
			}
			if (local50 == 2 && Static276.anInt5124 > 0 && local158 != null) {
				if (Static267.aClass357_180 == null && Static429.anInt7877 == 0) {
					Static19.method378(local158.method9185(), local158.method9186());
				} else {
					Static576.anInt10034 = 2;
				}
			}
			if (local50 == 0) {
				if (Static577.aClass2_Sub1_Sub13_4 != null) {
					Static286.method4775();
				} else if (Static537.aBoolean683) {
					Static417.method6895();
				}
			}
			if (Static267.aClass357_180 != null || Static429.anInt7877 != 0) {
				return;
			}
			Static477.aClass2_Sub1_Sub13_3 = null;
			Static576.anInt10034 = 0;
			return;
		}
		@Pc(174) int local174;
		@Pc(178) int local178;
		@Pc(258) int local258;
		@Pc(260) int local260;
		if (local50 == -1) {
			local174 = Static7.aClass6_1.method7048();
			local178 = Static7.aClass6_1.method7049();
			@Pc(180) boolean local180 = false;
			if (Static214.aClass2_Sub1_Sub19_1 != null) {
				if (local174 >= Static429.anInt7876 - 10 && local174 <= Static100.anInt1550 + Static429.anInt7876 + 10 && Static659.anInt11274 - 10 <= local178 && Static659.anInt11274 + Static31.anInt534 + 10 >= local178) {
					local180 = true;
				} else {
					Static543.method8321();
				}
			}
			if (!local180) {
				if (local174 < Static537.anInt9380 - 10 || Static22.anInt384 + Static537.anInt9380 + 10 < local174 || local178 < Static297.anInt5412 - 10 || Static297.anInt5412 + Static304.anInt10368 + 10 < local178) {
					Static482.method7662();
				} else if (Static672.aBoolean808) {
					local258 = -1;
					local260 = -1;
					@Pc(274) int local274;
					for (@Pc(262) int local262 = 0; local262 < Static488.anInt8750; local262++) {
						if (Static300.aBoolean723) {
							local274 = local262 * 16 + Static297.anInt5412 + 33;
							if (local274 - 13 < local178 && local178 < local274 + 4) {
								local260 = local274 - 13;
								local258 = local262;
								break;
							}
						} else {
							local274 = Static297.anInt5412 + local262 * 16 + 31;
							if (local178 > local274 - 13 && local178 < local274 + 3) {
								local260 = local274 - 13;
								local258 = local262;
								break;
							}
						}
					}
					if (local258 != -1) {
						local274 = 0;
						@Pc(340) Class126 local340 = new Class126(Static112.aClass279_6);
						for (@Pc(345) Class2_Sub1_Sub19 local345 = (Class2_Sub1_Sub19) local340.method3766(); local345 != null; local345 = (Class2_Sub1_Sub19) local340.method3767()) {
							if (local258 == local274) {
								if (local345.anInt9806 > 1) {
									Static245.method4362(local178, local260, local345);
								}
								break;
							}
							local274++;
						}
					}
				}
			}
		}
		if (local50 != 0) {
			return;
		}
		local174 = local158.method9186();
		local178 = local158.method9185();
		@Pc(410) int local410;
		@Pc(479) Class126 local479;
		@Pc(484) Class2_Sub1_Sub13 local484;
		if (Static214.aClass2_Sub1_Sub19_1 != null && local174 >= Static429.anInt7876 && local174 <= Static100.anInt1550 + Static429.anInt7876 && Static659.anInt11274 <= local178 && Static659.anInt11274 + Static31.anInt534 >= local178) {
			local410 = -1;
			for (local258 = 0; local258 < Static214.aClass2_Sub1_Sub19_1.anInt9806; local258++) {
				if (Static300.aBoolean723) {
					local260 = Static659.anInt11274 + local258 * 16 + 33;
					if (local178 > local260 - 13 && local178 < local260 + 4) {
						local410 = local258;
					}
				} else {
					local260 = local258 * 16 + Static659.anInt11274 + 31;
					if (local178 > local260 - 13 && local178 < local260 + 3) {
						local410 = local258;
					}
				}
			}
			if (local410 != -1) {
				local260 = 0;
				local479 = new Class126(Static214.aClass2_Sub1_Sub19_1.aClass279_13);
				for (local484 = (Class2_Sub1_Sub13) local479.method3766(); local484 != null; local484 = (Class2_Sub1_Sub13) local479.method3767()) {
					if (local260 == local410) {
						Static104.method1882(local174, local178, local484);
						break;
					}
					local260++;
				}
			}
			Static482.method7662();
			return;
		}
		if (local174 < Static537.anInt9380 || Static537.anInt9380 + Static22.anInt384 < local174 || local178 < Static297.anInt5412 || local178 > Static304.anInt10368 + Static297.anInt5412) {
			return;
		}
		if (Static672.aBoolean808) {
			local410 = -1;
			for (local258 = 0; local258 < Static488.anInt8750; local258++) {
				if (Static300.aBoolean723) {
					local260 = local258 * 16 + Static297.anInt5412 + 33;
					if (local178 > local260 - 13 && local178 < local260 + 4) {
						local410 = local258;
						break;
					}
				} else {
					local260 = Static297.anInt5412 + local258 * 16 + 31;
					if (local260 - 13 < local178 && local178 < local260 + 3) {
						local410 = local258;
						break;
					}
				}
			}
			if (local410 != -1) {
				local260 = 0;
				local479 = new Class126(Static112.aClass279_6);
				for (@Pc(615) Class2_Sub1_Sub19 local615 = (Class2_Sub1_Sub19) local479.method3766(); local615 != null; local615 = (Class2_Sub1_Sub19) local479.method3767()) {
					if (local260 == local410) {
						Static104.method1882(local174, local178, (Class2_Sub1_Sub13) local615.aClass279_13.aClass2_Sub1_54.aClass2_Sub1_67);
						Static482.method7662();
						return;
					}
					local260++;
				}
				return;
			}
		} else {
			local410 = -1;
			for (local258 = 0; local258 < Static276.anInt5124; local258++) {
				if (Static300.aBoolean723) {
					local260 = Static297.anInt5412 + (-local258 + -1 + Static276.anInt5124) * 16 + 33;
					if (local260 - 13 < local178 && local178 < local260 + 4) {
						local410 = local258;
					}
				} else {
					local260 = (Static276.anInt5124 - local258 - 1) * 16 + Static297.anInt5412 + 31;
					if (local178 > local260 - 13 && local178 < local260 + 3) {
						local410 = local258;
					}
				}
			}
			if (local410 != -1) {
				local260 = 0;
				@Pc(727) Class370 local727 = new Class370(Static61.aClass271_6);
				for (local484 = (Class2_Sub1_Sub13) local727.method9306(); local484 != null; local484 = (Class2_Sub1_Sub13) local727.method9305()) {
					if (local260 == local410) {
						Static104.method1882(local174, local178, local484);
						break;
					}
					local260++;
				}
			}
			Static482.method7662();
		}
		return;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)Z")
	public static boolean method4098() {
		if (Static280.aBoolean388) {
			try {
				Static675.method1325(Static637.anApplet2, "showVideoAd");
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIII)V")
	public static void method4099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(24) int local24 = arg0 * Static230.aClass2_Sub54_15.lb.method7520() >> 8;
		if (local24 == 0 || arg1 == -1) {
			return;
		}
		if (!Static239.aBoolean367 && Static143.anInt2682 != -1 && Static604.method9048() && !Static479.method7627()) {
			Static134.aClass2_Sub26_Sub3_3 = Static380.method6433();
			@Pc(51) Class2_Sub26_Sub3 local51 = Static198.method3806(Static134.aClass2_Sub26_Sub3_3);
			Static640.method9476(local51);
		}
		Static494.method7792(arg1, local24, Static489.aClass124_104);
		Static182.method3547(255, -1);
		Static239.aBoolean367 = true;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIBII)V")
	public static void method4100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg0) {
			Static150.method2590(arg2, arg1, arg3, arg4);
		} else if (arg2 - arg1 >= Static457.anInt8209 && arg2 + arg1 <= Static407.anInt7583 && Static427.anInt7845 <= arg4 - arg0 && Static631.anInt10922 >= arg4 + arg0) {
			Static373.method6360(arg4, arg1, arg2, arg0, arg3);
		} else {
			Static524.method8168(arg4, arg2, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Lclient!ww;")
	public static Class15_Sub3_Sub4 method4102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub3_Sub4_1;
	}
}
