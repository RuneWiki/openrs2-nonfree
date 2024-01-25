import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_36 = new Class216();

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
	public static int anInt4215 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
	public static void method3868() {
		Static326.aClass216_44.method5991();
		for (@Pc(13) Class2_Sub13 local13 = (Class2_Sub13) Static91.aClass216_22.method5992(); local13 != null; local13 = (Class2_Sub13) Static91.aClass216_22.method6000()) {
			if (local13.anInt1317 < 1000) {
				local13.method5945();
				Static326.aClass216_44.method5995(local13);
			}
		}
		Static326.aClass216_44.method5989(Static91.aClass216_22);
		if (Static285.aClass146_14 != null || Static61.anInt1330 > 0) {
			return;
		}
		@Pc(45) int local45 = -1;
		if (Static187.aClass2_Sub16_1 != null) {
			local45 = Static187.aClass2_Sub16_1.method1562();
		}
		if (!Static29.aBoolean66) {
			if (Static198.anInt3878 >= 0) {
				local45 = Static198.anInt3878;
			}
			Static198.anInt3878 = -1;
			if (local45 == 0 && (Static277.anInt5640 == 1 && Static117.anInt2590 > 2 || Static182.method3299())) {
				local45 = 2;
			}
			if (local45 == 2 && Static117.anInt2590 > 0) {
				if (Static187.aClass2_Sub16_1 == null) {
					Static346.method5943(Static351.anInt5286, Static32.anInt590);
				} else {
					Static346.method5943(Static187.aClass2_Sub16_1.method1564(), Static187.aClass2_Sub16_1.method1557());
				}
			}
			if (local45 == 0 && Static117.anInt2590 > 0) {
				Static252.method4569();
				return;
			}
			return;
		}
		@Pc(115) int local115;
		@Pc(119) int local119;
		if (local45 == -1) {
			local115 = Static284.aClass61_1.method2658();
			local119 = Static284.aClass61_1.method2659();
			if (Static194.anInt3816 - 10 > local115 || Static194.anInt3816 + Static120.anInt2599 + 10 < local115 || Static11.anInt293 - 10 > local119 || Static11.anInt293 + Static60.anInt1316 + 10 < local119) {
				Static29.aBoolean66 = false;
				Static152.method2935(Static60.anInt1316, Static194.anInt3816, Static11.anInt293, Static120.anInt2599);
			}
		}
		if (local45 != 0) {
			return;
		}
		local115 = Static194.anInt3816;
		local119 = Static11.anInt293;
		@Pc(162) int local162 = Static120.anInt2599;
		@Pc(166) int local166 = Static187.aClass2_Sub16_1.method1557();
		@Pc(170) int local170 = Static187.aClass2_Sub16_1.method1564();
		@Pc(172) int local172 = -1;
		@Pc(191) int local191;
		for (@Pc(174) int local174 = 0; local174 < Static117.anInt2590; local174++) {
			if (Static97.aBoolean602) {
				local191 = (Static117.anInt2590 - local174 - 1) * 16 + local119 + 33;
				if (local115 < local166 && local162 + local115 > local166 && local191 - 13 < local170 && local191 + 4 > local170) {
					local172 = local174;
				}
			} else {
				local191 = (Static117.anInt2590 - local174 - 1) * 16 + local119 + 31;
				if (local115 < local166 && local115 + local162 > local166 && local191 - 13 < local170 && local170 < local191 + 3) {
					local172 = local174;
				}
			}
		}
		if (local172 != -1) {
			local191 = 0;
			@Pc(273) Class115 local273 = new Class115(Static91.aClass216_22);
			for (@Pc(278) Class2_Sub13 local278 = (Class2_Sub13) local273.method3270(); local278 != null; local278 = (Class2_Sub13) local273.method3268()) {
				if (local191 == local172) {
					Static78.method1807(local278);
				}
				local191++;
			}
		}
		Static29.aBoolean66 = false;
		Static152.method2935(Static60.anInt1316, Static194.anInt3816, Static11.anInt293, Static120.anInt2599);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Z")
	public static boolean method3869() {
		try {
			if (Static237.anInt4541 == 2) {
				if (Static210.aClass2_Sub21_2 == null) {
					Static210.aClass2_Sub21_2 = Static362.method2643(Static144.aClass191_93, Static300.anInt5860, Static10.anInt231);
					if (Static210.aClass2_Sub21_2 == null) {
						return false;
					}
				}
				if (Static265.aClass90_41 == null) {
					Static265.aClass90_41 = new Class90(Static320.aClass191_199, Static78.aClass191_50);
				}
				if (Static271.aClass2_Sub3_Sub3_3.method1776(Static265.aClass90_41, Static200.aClass191_203, Static210.aClass2_Sub21_2)) {
					Static271.aClass2_Sub3_Sub3_3.method1780();
					Static271.aClass2_Sub3_Sub3_3.method1751(Static122.anInt4369);
					Static271.aClass2_Sub3_Sub3_3.method1772(Static210.aClass2_Sub21_2, Static75.aBoolean146);
					Static237.anInt4541 = 0;
					Static144.aClass191_93 = null;
					Static210.aClass2_Sub21_2 = null;
					Static265.aClass90_41 = null;
					return true;
				}
			}
		} catch (@Pc(68) Exception local68) {
			local68.printStackTrace();
			Static271.aClass2_Sub3_Sub3_3.method1752();
			Static144.aClass191_93 = null;
			Static210.aClass2_Sub21_2 = null;
			Static237.anInt4541 = 0;
			Static265.aClass90_41 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!gh;[Lclient!p;IZLclient!ae;I)V")
	public static void method3870(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class151[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class4 arg4) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(27) int local27;
		if (!arg3) {
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				for (local9 = 0; local9 < Static95.anInt6381; local9++) {
					for (local13 = 0; local13 < Static237.anInt4532; local13++) {
						if ((Static313.aByteArrayArrayArray12[local5][local9][local13] & 0x1) != 0) {
							local27 = local5;
							if ((Static313.aByteArrayArrayArray12[1][local9][local13] & 0x2) != 0) {
								local27 = local5 - 1;
							}
							if (local27 >= 0) {
								arg1[local27].method4102(local13, local9);
							}
						}
					}
				}
			}
		}
		@Pc(69) int[][] local69 = new int[Static95.anInt6381][Static237.anInt4532];
		for (local9 = 0; local9 < arg2; local9++) {
			for (local13 = 0; local13 < Static237.anInt4532; local13++) {
				Static208.anIntArray322[local13] = 0;
				Static29.anIntArray34[local13] = 0;
				Static134.anIntArray239[local13] = 0;
				Static26.anIntArray31[local13] = 0;
				Static28.anIntArray32[local13] = 0;
			}
			for (local27 = -5; local27 < Static95.anInt6381; local27++) {
				@Pc(117) int local117;
				@Pc(134) int local134;
				@Pc(200) int local200;
				for (@Pc(111) int local111 = 0; local111 < Static237.anInt4532; local111++) {
					local117 = local27 + 5;
					@Pc(178) int local178;
					if (Static95.anInt6381 > local117) {
						local134 = Static322.aByteArrayArrayArray13[local9][local117][local111] & 0xFF;
						if (local134 > 0) {
							@Pc(142) Class39 local142 = Static247.method4480(local134 - 1);
							Static208.anIntArray322[local111] += local142.anInt1111;
							Static29.anIntArray34[local111] += local142.anInt1107;
							Static134.anIntArray239[local111] += local142.anInt1108;
							Static26.anIntArray31[local111] += local142.anInt1110;
							local178 = Static28.anIntArray32[local111]++;
						}
					}
					local134 = local27 - 5;
					if (local134 >= 0) {
						local200 = Static322.aByteArrayArrayArray13[local9][local134][local111] & 0xFF;
						if (local200 > 0) {
							@Pc(208) Class39 local208 = Static247.method4480(local200 - 1);
							Static208.anIntArray322[local111] -= local208.anInt1111;
							Static29.anIntArray34[local111] -= local208.anInt1107;
							Static134.anIntArray239[local111] -= local208.anInt1108;
							Static26.anIntArray31[local111] -= local208.anInt1110;
							local178 = Static28.anIntArray32[local111]--;
						}
					}
				}
				if (local27 >= 0) {
					local117 = 0;
					local134 = 0;
					local200 = 0;
					@Pc(264) int local264 = 0;
					@Pc(266) int local266 = 0;
					for (@Pc(268) int local268 = -5; local268 < Static237.anInt4532; local268++) {
						@Pc(274) int local274 = local268 + 5;
						if (local274 < Static237.anInt4532) {
							local264 += Static26.anIntArray31[local274];
							local134 += Static29.anIntArray34[local274];
							local117 += Static208.anIntArray322[local274];
							local266 += Static28.anIntArray32[local274];
							local200 += Static134.anIntArray239[local274];
						}
						@Pc(311) int local311 = local268 - 5;
						if (local311 >= 0) {
							local200 -= Static134.anIntArray239[local311];
							local134 -= Static29.anIntArray34[local311];
							local266 -= Static28.anIntArray32[local311];
							local264 -= Static26.anIntArray31[local311];
							local117 -= Static208.anIntArray322[local311];
						}
						if (local268 >= 0 && local264 > 0 && local266 > 0) {
							local69[local27][local268] = Static138.method2747(local117 * 256 / local264, local134 / local266, local200 / local266);
						}
					}
				}
			}
			Static65.method1489(Static301.aClass73Array31[local9], arg0, local69, Static58.aByteArrayArrayArray2[local9], arg3, arg4, local9, Static95.anInt6381, Static322.aByteArrayArrayArray13[local9], Static237.anInt4532, Static306.aByteArrayArrayArray11[local9], Static53.aByteArrayArrayArray1[local9]);
			Static322.aByteArrayArrayArray13[local9] = null;
			Static58.aByteArrayArrayArray2[local9] = null;
			Static306.aByteArrayArrayArray11[local9] = null;
			Static53.aByteArrayArrayArray1[local9] = null;
		}
		if (!arg3) {
			if (Static348.aBoolean606) {
				Static130.method4522();
			}
			if (Static322.anInt6490 != 0) {
				Static209.method4326();
			}
		}
		for (local13 = 0; local13 < arg2; local13++) {
			Static301.aClass73Array31[local13].method4939();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)V")
	public static void method3871() {
		Static324.aClass119_198.method3315(5);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	public static void method3873() {
		Static327.aClass199_30.method5750();
		Static214.aClass199_21.method5750();
	}
}
