import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "J")
	public static long aLong234;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
	public static int anInt8506;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_142 = new Class274(78, 6);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)Z")
	public static boolean method7152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Interface27 local20 = (Interface27) Static468.method6746(arg2, arg0, arg1);
		@Pc(22) boolean local22 = true;
		if (local20 != null) {
			local22 = Static372.method5610(local20) & true;
		}
		local20 = (Interface27) Static383.method5768(arg2, arg0, arg1, wk.class);
		if (local20 != null) {
			local22 &= Static372.method5610(local20);
		}
		local20 = (Interface27) Static263.method4286(arg2, arg0, arg1);
		if (local20 != null) {
			local22 &= Static372.method5610(local20);
		}
		return local22;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!dm;)Lclient!dm;")
	public static Class78 method7154(@OriginalArg(1) Class78 arg0) {
		if (arg0.anInt1967 != -1) {
			return Static180.method3291(arg0.anInt1967);
		}
		@Pc(18) int local18 = arg0.anInt1968 >>> 16;
		@Pc(28) Class145 local28 = new Class145(Static206.aClass222_14);
		for (@Pc(33) Class2_Sub37 local33 = (Class2_Sub37) local28.method3600(); local33 != null; local33 = (Class2_Sub37) local28.method3599()) {
			if (local33.anInt6848 == local18) {
				return Static180.method3291((int) local33.aLong287);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!vo;Lclient!eq;Lclient!eq;BLclient!eq;Lclient!ae;)Z")
	public static boolean method7155(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(4) Class97 arg3, @OriginalArg(5) Class2_Sub2_Sub1 arg4) {
		Static236.anIntArray320 = new int[16];
		Static489.aClass2_Sub2_Sub1_4 = arg4;
		Static90.aClass97_20 = arg2;
		Static120.aClass39_3 = arg0;
		Static109.aClass97_28 = arg1;
		Static533.aClass97_132 = arg3;
		for (@Pc(26) int local26 = 0; local26 < 16; local26++) {
			Static236.anIntArray320[local26] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method7156() {
		if (!Static642.aBoolean757) {
			Static155.aBoolean303 = Static333.anInt6166 != -1 && Static333.anInt6166 <= Static90.anInt1824 || (Static507.aBoolean636 ? 26 : 22) + Static90.anInt1824 * 16 > Static585.anInt9606;
		}
		if (!Static155.aBoolean303) {
			Static409.aClass238_50.method5841();
			Static415.aClass238_51.method5841();
			for (@Pc(45) Class2_Sub5_Sub20 local45 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5833(); local45 != null; local45 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5838()) {
				@Pc(50) int local50 = local45.anInt10077;
				if (local50 < 1000) {
					local45.method8599();
					if (local50 == 21 || local50 == 57 || local50 == 10 || local50 == 50 || local50 == 25 || local50 == 46 || local50 == 51) {
						Static415.aClass238_51.method5837(local45);
					} else {
						Static409.aClass238_50.method5837(local45);
					}
				}
			}
			Static409.aClass238_50.method5840(Static261.aClass238_28);
			Static415.aClass238_51.method5840(Static261.aClass238_28);
			if (Static90.anInt1824 <= 1) {
				Static220.aClass2_Sub5_Sub20_17 = null;
				Static190.aClass2_Sub5_Sub20_23 = null;
			} else {
				if (Static19.aBoolean355 && Static63.aClass32_1.method789(81) && Static90.anInt1824 > 2) {
					Static220.aClass2_Sub5_Sub20_17 = (Class2_Sub5_Sub20) Static261.aClass238_28.aClass2_201.aClass2_299.aClass2_299;
				} else {
					Static220.aClass2_Sub5_Sub20_17 = (Class2_Sub5_Sub20) Static261.aClass238_28.aClass2_201.aClass2_299;
				}
				Static190.aClass2_Sub5_Sub20_23 = (Class2_Sub5_Sub20) Static261.aClass238_28.aClass2_201.aClass2_299;
			}
		} else if (Static90.anInt1824 > 1) {
			Static220.aClass2_Sub5_Sub20_17 = null;
			@Pc(159) Class2_Sub5_Sub2 local159 = (Class2_Sub5_Sub2) Static61.aClass175_2.aClass2_Sub5_34.aClass2_Sub5_66;
			if (Static19.aBoolean355 && Static63.aClass32_1.method789(81) && Static178.anInt3981 > 1) {
				@Pc(175) Class2_Sub5_Sub2 local175 = (Class2_Sub5_Sub2) Static61.aClass175_2.aClass2_Sub5_34.aClass2_Sub5_66.aClass2_Sub5_66;
				if (local159.anInt964 > 1 && ((Class2_Sub5_Sub20) local159.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66.aClass2_Sub5_66).anInt10077 < local175.method861()) {
					Static220.aClass2_Sub5_Sub20_17 = (Class2_Sub5_Sub20) local159.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66.aClass2_Sub5_66;
				} else {
					Static220.aClass2_Sub5_Sub20_17 = (Class2_Sub5_Sub20) local175.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66;
				}
			}
			if (Static220.aClass2_Sub5_Sub20_17 == null) {
				Static220.aClass2_Sub5_Sub20_17 = (Class2_Sub5_Sub20) local159.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66;
			}
			Static190.aClass2_Sub5_Sub20_23 = (Class2_Sub5_Sub20) local159.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66;
		}
		@Pc(228) int local228 = -1;
		@Pc(233) Class2_Sub32 local233 = (Class2_Sub32) Static72.aClass238_9.method5833();
		if (local233 != null) {
			local228 = local233.method8561();
		}
		if (!Static642.aBoolean757) {
			if (local228 == 0 && (Static163.anInt3666 == 1 && Static90.anInt1824 > 2 || Static457.method6671())) {
				local228 = 2;
			}
			if (local228 == 2 && Static90.anInt1824 > 0 && local233 != null) {
				if (Static112.aClass78_4 == null && Static100.anInt2017 == 0) {
					Static240.method3964(local233.method8563(), local233.method8558());
				} else {
					Static228.anInt4643 = 2;
				}
			}
			if (local228 == 0) {
				if (Static220.aClass2_Sub5_Sub20_17 != null) {
					Static127.method2521();
				} else if (Static301.aBoolean423) {
					Static171.method3178();
				}
			}
			if (Static112.aClass78_4 != null || Static100.anInt2017 != 0) {
				return;
			}
			Static401.aClass2_Sub5_Sub20_19 = null;
			Static228.anInt4643 = 0;
			return;
		}
		@Pc(249) int local249;
		@Pc(253) int local253;
		@Pc(338) int local338;
		@Pc(340) int local340;
		@Pc(342) int local342;
		if (local228 == -1) {
			local249 = Static6.aClass40_1.method4504();
			local253 = Static6.aClass40_1.method4499();
			@Pc(255) boolean local255 = false;
			if (Static591.aClass2_Sub5_Sub2_1 != null) {
				if (local249 >= Static331.anInt5908 - 10 && local249 <= Static63.anInt1369 + Static331.anInt5908 + 10 && Static320.anInt5800 - 10 <= local253 && Static67.anInt1403 + Static320.anInt5800 + 10 >= local253) {
					local255 = true;
				} else {
					Static643.method8596();
				}
			}
			if (!local255) {
				if (Static254.anInt5025 - 10 > local249 || local249 > Static254.anInt5025 + Static133.anInt3038 + 10 || Static378.anInt6772 - 10 > local253 || local253 > Static378.anInt6772 + Static256.anInt5056 + 10) {
					Static498.method7094();
				} else if (Static155.aBoolean303) {
					local338 = -1;
					local340 = -1;
					@Pc(354) int local354;
					for (local342 = 0; local342 < Static178.anInt3981; local342++) {
						if (Static507.aBoolean636) {
							local354 = Static378.anInt6772 + local342 * 16 + 33;
							if (local354 - 13 < local253 && local253 < local354 + 4) {
								local340 = local354 - 13;
								local338 = local342;
								break;
							}
						} else {
							local354 = local342 * 16 + Static378.anInt6772 + 31;
							if (local354 - 13 < local253 && local354 + 3 > local253) {
								local338 = local342;
								local340 = local354 - 13;
								break;
							}
						}
					}
					if (local338 != -1) {
						local354 = 0;
						@Pc(421) Class309 local421 = new Class309(Static61.aClass175_2);
						for (@Pc(426) Class2_Sub5_Sub2 local426 = (Class2_Sub5_Sub2) local421.method7334(); local426 != null; local426 = (Class2_Sub5_Sub2) local421.method7335()) {
							if (local338 == local354) {
								if (local426.anInt964 > 1) {
									Static50.method958(local340, local253, local426);
								}
								break;
							}
							local354++;
						}
					}
				}
			}
		}
		if (local228 != 0) {
			return;
		}
		local249 = local233.method8558();
		local253 = local233.method8563();
		@Pc(528) int local528;
		@Pc(758) Class2_Sub5_Sub20 local758;
		if (Static591.aClass2_Sub5_Sub2_1 != null && local249 >= Static331.anInt5908 && Static331.anInt5908 + Static63.anInt1369 >= local249 && local253 >= Static320.anInt5800 && local253 <= Static320.anInt5800 + Static67.anInt1403) {
			local528 = -1;
			for (local338 = 0; local338 < Static591.aClass2_Sub5_Sub2_1.anInt964; local338++) {
				if (Static507.aBoolean636) {
					local340 = Static320.anInt5800 + local338 * 16 + 33;
					if (local253 > local340 - 13 && local340 + 4 > local253) {
						local528 = local338;
					}
				} else {
					local340 = local338 * 16 + Static320.anInt5800 + 31;
					if (local340 - 13 < local253 && local340 + 3 > local253) {
						local528 = local338;
					}
				}
			}
			if (local528 != -1) {
				local340 = 0;
				@Pc(863) Class309 local863 = new Class309(Static591.aClass2_Sub5_Sub2_1.aClass175_1);
				for (local758 = (Class2_Sub5_Sub20) local863.method7334(); local758 != null; local758 = (Class2_Sub5_Sub20) local863.method7335()) {
					if (local528 == local340) {
						Static92.method1620(local249, local758, local253);
						break;
					}
					local340++;
				}
			}
			Static498.method7094();
			return;
		}
		if (Static254.anInt5025 > local249 || local249 > Static133.anInt3038 + Static254.anInt5025 || Static378.anInt6772 > local253 || local253 > Static378.anInt6772 + Static256.anInt5056) {
			return;
		}
		if (Static155.aBoolean303) {
			local528 = -1;
			local338 = -1;
			for (local340 = 0; local340 < Static178.anInt3981; local340++) {
				if (Static507.aBoolean636) {
					local342 = local340 * 16 + Static378.anInt6772 + 33;
					if (local342 - 13 < local253 && local253 < local342 + 4) {
						local338 = local342 - 13;
						local528 = local340;
						break;
					}
				} else {
					local342 = local340 * 16 + Static378.anInt6772 + 31;
					if (local253 > local342 - 13 && local342 + 3 > local253) {
						local338 = local342 - 13;
						local528 = local340;
						break;
					}
				}
			}
			if (local528 != -1) {
				local342 = 0;
				@Pc(615) Class309 local615 = new Class309(Static61.aClass175_2);
				for (@Pc(620) Class2_Sub5_Sub2 local620 = (Class2_Sub5_Sub2) local615.method7334(); local620 != null; local620 = (Class2_Sub5_Sub2) local615.method7335()) {
					if (local342 == local528) {
						if (local620.anInt964 == 1) {
							Static92.method1620(local249, (Class2_Sub5_Sub20) local620.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66, local253);
							Static498.method7094();
							return;
						}
						Static50.method958(local338, local253, local620);
						return;
					}
					local342++;
				}
				return;
			}
		} else {
			local528 = -1;
			for (local338 = 0; local338 < Static90.anInt1824; local338++) {
				if (Static507.aBoolean636) {
					local340 = Static378.anInt6772 + (Static90.anInt1824 - local338 - 1) * 16 + 33;
					if (local340 - 13 < local253 && local340 + 4 > local253) {
						local528 = local338;
					}
				} else {
					local340 = Static378.anInt6772 + (Static90.anInt1824 + -1 + -local338) * 16 + 31;
					if (local340 - 13 < local253 && local340 + 3 > local253) {
						local528 = local338;
					}
				}
			}
			if (local528 != -1) {
				local340 = 0;
				@Pc(753) Class211 local753 = new Class211(Static261.aClass238_28);
				for (local758 = (Class2_Sub5_Sub20) local753.method5217(); local758 != null; local758 = (Class2_Sub5_Sub20) local753.method5216()) {
					if (local340 == local528) {
						Static92.method1620(local249, local758, local253);
						break;
					}
					local340++;
				}
			}
			Static498.method7094();
		}
		return;
	}
}
