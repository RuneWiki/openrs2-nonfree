import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "Lclient!wm;")
	public static Class390 aClass390_129;

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
	public static int anInt10854;

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "Lclient!tn;")
	public static final Class339 aClass339_17 = new Class339(2);

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
	public static int anInt10853 = 0;

	@OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
	public static int anInt10855 = 0;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIILclient!d;Lclient!ha;II)V")
	public static void method9027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static500.anInt8324 < 100) {
			Static551.method7648(arg3, arg2);
		}
		arg3.KA(arg0, arg4, arg0 + arg1, arg4 - -arg5);
		@Pc(36) int local36;
		@Pc(54) int local54;
		if (Static500.anInt8324 < 100) {
			local36 = arg1 / 2 + arg0;
			arg3.aa(arg0, arg4, arg1, arg5, -16777216, 0);
			local54 = arg5 / 2 + arg4 - 20 - 18;
			arg3.method6895(local36 - 152, local54, 304, 34, Static544.aColorArray5[Static362.anInt4830].getRGB(), 0);
			arg3.aa(local36 - 150, local54 + 2, Static500.anInt8324 * 3, 30, Static220.aColorArray4[Static362.anInt4830].getRGB(), 0);
			Static231.aClass73_8.method5781(Static64.aClass52_18.method907(Static544.anInt8937), local54 + 20, local36, -1, Static169.aColorArray1[Static362.anInt4830].getRGB());
			return;
		}
		@Pc(112) int local112 = Static193.anInt3730 - (int) ((float) arg1 / Static330.aFloat8);
		local36 = (int) ((float) arg5 / Static330.aFloat8) + Static241.anInt4462;
		local54 = (int) ((float) arg1 / Static330.aFloat8) + Static193.anInt3730;
		Static509.anInt8531 = (int) ((float) (arg5 * 2) / Static330.aFloat8);
		Static377.anInt6755 = Static241.anInt4462 - (int) ((float) arg5 / Static330.aFloat8);
		Static391.anInt6944 = Static193.anInt3730 - (int) ((float) arg1 / Static330.aFloat8);
		Static61.anInt944 = (int) ((float) (arg1 * 2) / Static330.aFloat8);
		@Pc(170) int local170 = Static241.anInt4462 - (int) ((float) arg5 / Static330.aFloat8);
		Static330.method691(Static330.anInt764 + local112, local36 - -Static330.anInt759, local54 + Static330.anInt764, Static330.anInt759 + local170, arg0, arg4, arg0 + arg1, arg5 + 1 + arg4);
		Static330.method693(arg3);
		@Pc(201) Class114 local201 = Static330.method672(arg3);
		Static642.method8660(arg3, local201);
		if (Static416.anInt7349 > 0) {
			Static150.anInt3080--;
			if (Static150.anInt3080 == 0) {
				Static150.anInt3080 = 20;
				Static416.anInt7349--;
			}
		}
		if (!Static198.aBoolean709) {
			return;
		}
		@Pc(238) int local238 = arg1 + arg0 - 5;
		@Pc(244) int local244 = arg5 + arg4 - 8;
		Static604.aClass73_15.method5776(-1, local244, local238, "Fps:" + Static457.anInt7750, 16776960);
		@Pc(259) int local259 = local244 - 15;
		@Pc(261) Runtime local261 = Runtime.getRuntime();
		@Pc(270) int local270 = (int) ((local261.totalMemory() - local261.freeMemory()) / 1024L);
		@Pc(272) int local272 = 16776960;
		if (local270 > 65536) {
			local272 = 16711680;
		}
		Static604.aClass73_15.method5776(-1, local259, local238, "Mem:" + local270 + "k", local272);
		local244 = local259 - 15;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
	public static void method9029() {
		if (!Static493.aBoolean702) {
			Static364.aBoolean585 = Static657.anInt10590 != -1 && Static483.anInt8099 >= Static657.anInt10590 || Static79.anInt1140 < (Static375.aBoolean592 ? 26 : 22) + Static483.anInt8099 * 16;
		}
		Static67.aClass114_8.method2808();
		Static234.aClass114_25.method2808();
		@Pc(49) int local49;
		for (@Pc(44) Class5_Sub3_Sub20 local44 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2805(); local44 != null; local44 = (Class5_Sub3_Sub20) Static231.aClass114_24.method2814()) {
			local49 = local44.anInt10178;
			if (local49 < 1000) {
				local44.method9052();
				if (local49 == 5 || local49 == 53 || local49 == 44 || local49 == 21 || local49 == 12 || local49 == 49 || local49 == 9) {
					Static234.aClass114_25.method2807(local44);
				} else {
					Static67.aClass114_8.method2807(local44);
				}
			}
		}
		Static67.aClass114_8.method2816(Static231.aClass114_24);
		Static234.aClass114_25.method2816(Static231.aClass114_24);
		if (Static483.anInt8099 <= 1) {
			Static666.aClass5_Sub3_Sub20_5 = null;
			Static355.aClass5_Sub3_Sub20_3 = null;
		} else {
			if (Static157.aBoolean262 && Static17.aClass252_1.method8818(81) && Static483.anInt8099 > 2) {
				Static355.aClass5_Sub3_Sub20_3 = (Class5_Sub3_Sub20) Static231.aClass114_24.aClass5_84.aClass5_337.aClass5_337;
			} else {
				Static355.aClass5_Sub3_Sub20_3 = (Class5_Sub3_Sub20) Static231.aClass114_24.aClass5_84.aClass5_337;
			}
			Static666.aClass5_Sub3_Sub20_5 = (Class5_Sub3_Sub20) Static231.aClass114_24.aClass5_84.aClass5_337;
		}
		local49 = -1;
		@Pc(162) Class5_Sub7 local162 = (Class5_Sub7) Static223.aClass114_23.method2805();
		if (local162 != null) {
			local49 = local162.method8705();
		}
		if (!Static493.aBoolean702) {
			if (local49 == 0 && (Static51.anInt734 == 1 && Static483.anInt8099 > 2 || Static565.method7758())) {
				local49 = 2;
			}
			if (local49 == 2 && Static483.anInt8099 > 0 && local162 != null) {
				if (Static383.aClass345_10 == null && Static101.anInt2198 == 0) {
					Static596.method2936(local162.method8703(), local162.method8702());
				} else {
					Static51.anInt735 = 2;
				}
			}
			if (local49 == 0) {
				if (Static355.aClass5_Sub3_Sub20_3 != null) {
					Static324.method8037();
				} else if (Static55.aBoolean60) {
					Static424.method6285();
				}
			}
			if (Static383.aClass345_10 != null || Static101.anInt2198 != 0) {
				return;
			}
			Static315.aClass5_Sub3_Sub20_2 = null;
			Static51.anInt735 = 0;
			return;
		}
		@Pc(180) int local180;
		@Pc(184) int local184;
		@Pc(261) int local261;
		@Pc(263) int local263;
		if (local49 == -1) {
			local180 = Static359.aClass11_1.method6141();
			local184 = Static359.aClass11_1.method6144();
			@Pc(186) boolean local186 = false;
			if (Static345.aClass5_Sub3_Sub15_1 != null) {
				if (local180 >= Static556.anInt9088 - 10 && local180 <= Static556.anInt9088 + Static260.anInt4826 + 10 && Static220.anInt4457 - 10 <= local184 && local184 <= Static220.anInt4457 + Static469.anInt7914 + 10) {
					local186 = true;
				} else {
					Static651.method8724();
				}
			}
			if (!local186) {
				if (local180 < Static477.anInt8042 - 10 || local180 > Static477.anInt8042 + Static633.anInt10304 + 10 || Static542.anInt6468 - 10 > local184 || local184 > Static54.anInt805 + Static542.anInt6468 + 10) {
					Static531.method7463();
				} else if (Static364.aBoolean585) {
					local261 = -1;
					local263 = -1;
					@Pc(278) int local278;
					for (@Pc(265) int local265 = 0; local265 < Static248.anInt4552; local265++) {
						if (Static375.aBoolean592) {
							local278 = Static542.anInt6468 + local265 * 16 + 33;
							if (local184 > local278 - 13 && local184 < local278 + 4) {
								local263 = local278 - 13;
								local261 = local265;
								break;
							}
						} else {
							local278 = local265 * 16 + Static542.anInt6468 + 31;
							if (local278 - 13 < local184 && local184 < local278 + 3) {
								local263 = local278 - 13;
								local261 = local265;
								break;
							}
						}
					}
					if (local261 != -1) {
						local278 = 0;
						@Pc(340) Class90 local340 = new Class90(Static609.aClass358_13);
						for (@Pc(345) Class5_Sub3_Sub15 local345 = (Class5_Sub3_Sub15) local340.method2234(); local345 != null; local345 = (Class5_Sub3_Sub15) local340.method2235()) {
							if (local278 == local261) {
								if (local345.anInt8017 > 1) {
									Static491.method7051(local345, local263, local184);
								}
								break;
							}
							local278++;
						}
					}
				}
			}
		}
		if (local49 != 0) {
			return;
		}
		local180 = local162.method8703();
		local184 = local162.method8702();
		@Pc(425) int local425;
		@Pc(503) Class90 local503;
		@Pc(508) Class5_Sub3_Sub20 local508;
		if (Static345.aClass5_Sub3_Sub15_1 != null && Static556.anInt9088 <= local180 && Static556.anInt9088 + Static260.anInt4826 >= local180 && local184 >= Static220.anInt4457 && local184 <= Static469.anInt7914 + Static220.anInt4457) {
			local425 = -1;
			for (local261 = 0; local261 < Static345.aClass5_Sub3_Sub15_1.anInt8017; local261++) {
				if (Static375.aBoolean592) {
					local263 = Static220.anInt4457 + local261 * 16 + 33;
					if (local263 - 13 < local184 && local184 < local263 + 4) {
						local425 = local261;
					}
				} else {
					local263 = local261 * 16 + Static220.anInt4457 + 31;
					if (local263 - 13 < local184 && local184 < local263 + 3) {
						local425 = local261;
					}
				}
			}
			if (local425 != -1) {
				local263 = 0;
				local503 = new Class90(Static345.aClass5_Sub3_Sub15_1.aClass358_7);
				for (local508 = (Class5_Sub3_Sub20) local503.method2234(); local508 != null; local508 = (Class5_Sub3_Sub20) local503.method2235()) {
					if (local425 == local263) {
						Static208.method3305(local184, local180, local508);
						break;
					}
					local263++;
				}
			}
			Static531.method7463();
			return;
		}
		if (Static477.anInt8042 > local180 || local180 > Static477.anInt8042 + Static633.anInt10304 || local184 < Static542.anInt6468 || local184 > Static54.anInt805 + Static542.anInt6468) {
			return;
		}
		if (Static364.aBoolean585) {
			local425 = -1;
			for (local261 = 0; local261 < Static248.anInt4552; local261++) {
				if (Static375.aBoolean592) {
					local263 = local261 * 16 + Static542.anInt6468 + 33;
					if (local184 > local263 - 13 && local184 < local263 + 4) {
						local425 = local261;
						break;
					}
				} else {
					local263 = Static542.anInt6468 + local261 * 16 + 31;
					if (local263 - 13 < local184 && local184 < local263 + 3) {
						local425 = local261;
						break;
					}
				}
			}
			if (local425 != -1) {
				local263 = 0;
				local503 = new Class90(Static609.aClass358_13);
				for (@Pc(645) Class5_Sub3_Sub15 local645 = (Class5_Sub3_Sub15) local503.method2234(); local645 != null; local645 = (Class5_Sub3_Sub15) local503.method2235()) {
					if (local263 == local425) {
						Static208.method3305(local184, local180, (Class5_Sub3_Sub20) local645.aClass358_7.aClass5_Sub3_60.aClass5_Sub3_66);
						Static531.method7463();
						return;
					}
					local263++;
				}
				return;
			}
		} else {
			local425 = -1;
			for (local261 = 0; local261 < Static483.anInt8099; local261++) {
				if (Static375.aBoolean592) {
					local263 = (Static483.anInt8099 - local261 - 1) * 16 + Static542.anInt6468 + 33;
					if (local184 > local263 - 13 && local184 < local263 + 4) {
						local425 = local261;
					}
				} else {
					local263 = Static542.anInt6468 + (Static483.anInt8099 - local261 - 1) * 16 + 31;
					if (local263 - 13 < local184 && local184 < local263 + 3) {
						local425 = local261;
					}
				}
			}
			if (local425 != -1) {
				local263 = 0;
				@Pc(761) Class47 local761 = new Class47(Static231.aClass114_24);
				for (local508 = (Class5_Sub3_Sub20) local761.method749(); local508 != null; local508 = (Class5_Sub3_Sub20) local761.method746()) {
					if (local425 == local263) {
						Static208.method3305(local184, local180, local508);
						break;
					}
					local263++;
				}
			}
			Static531.method7463();
		}
		return;
	}
}
