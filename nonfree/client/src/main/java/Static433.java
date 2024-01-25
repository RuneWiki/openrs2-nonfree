import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!no", name = "n", descriptor = "Lclient!lp;")
	public static Class231 aClass231_36;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "D")
	public static double aDouble59;

	// $FF: synthetic field
	@OriginalMember(owner = "client!no", name = "r", descriptor = "Ljava/lang/Class;")
	private static Class aClass53;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ha;II)Z")
	public static boolean method8697(@OriginalArg(0) Class145 arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = (Static426.anInt6942 - 104) / 2;
		@Pc(25) int local25 = (Static280.anInt6752 - 104) / 2;
		@Pc(27) boolean local27 = true;
		@Pc(39) int local39;
		@Pc(52) int local52;
		for (@Pc(29) int local29 = local19; local29 < local19 + 104; local29++) {
			for (@Pc(35) int local35 = local25; local35 < local25 + 104; local35++) {
				for (local39 = arg1; local39 <= 3; local39++) {
					if (Static208.method4773(local35, local29, local39, arg1)) {
						local52 = local39;
						if (Static83.method1237(local29, local35)) {
							local52 = local39 - 1;
						}
						if (local52 >= 0) {
							local27 &= Static307.method4282(local29, local52, local35);
						}
					}
				}
			}
		}
		if (!local27) {
			return false;
		}
		@Pc(108) int[] local108 = new int[262144];
		for (local39 = 0; local39 < local108.length; local39++) {
			local108[local39] = -16777216;
		}
		Static73.aClass43_2 = arg0.method9711(512, 512, 512, local108);
		Static64.method960();
		local52 = ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(182) int local182 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(201) int local201 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(213) boolean[][] local213 = new boolean[Static113.anInt1908 + 2 + 1][Static113.anInt1908 + 2 + 1];
		@Pc(223) int local223;
		@Pc(229) int local229;
		@Pc(231) int local231;
		@Pc(233) int local233;
		@Pc(241) int local241;
		@Pc(253) int local253;
		@Pc(265) int local265;
		@Pc(294) int local294;
		@Pc(300) int local300;
		@Pc(366) int local366;
		@Pc(372) int local372;
		@Pc(377) int local377;
		@Pc(404) int local404;
		for (@Pc(215) int local215 = local19; local215 < local19 + 104; local215 += Static113.anInt1908) {
			for (local223 = local25; local223 < local25 + 104; local223 += Static113.anInt1908) {
				local229 = 0;
				local231 = 0;
				local233 = local215;
				if (local215 > 0) {
					local233 = local215 - 1;
					local229 += 4;
				}
				local241 = local223;
				if (local223 > 0) {
					local241 = local223 - 1;
				}
				local253 = local215 + Static113.anInt1908;
				if (local253 < 104) {
					local253++;
				}
				local265 = Static113.anInt1908 + local223;
				if (local265 < 104) {
					local231 += 4;
					local265++;
				}
				arg0.KA(0, 0, local229 + Static113.anInt1908 * 4, Static113.anInt1908 * 4 + local231);
				arg0.GA(-16777216);
				@Pc(306) int local306;
				for (local294 = arg1; local294 <= 3; local294++) {
					for (local300 = 0; local300 <= Static113.anInt1908; local300++) {
						for (local306 = 0; local306 <= Static113.anInt1908; local306++) {
							local213[local300][local306] = Static208.method4773(local306 + local241, local233 - -local300, local294, arg1);
						}
					}
					Static126.aClass133Array1[local294].method8219(local233, local241, local253, local265, local213);
					if (!Static496.aBoolean689) {
						for (local306 = -4; local306 < Static113.anInt1908; local306++) {
							for (local366 = -4; local366 < Static113.anInt1908; local366++) {
								local372 = local306 + local215;
								local377 = local223 + local366;
								if (local19 <= local372 && local377 >= local25 && Static208.method4773(local377, local372, local294, arg1)) {
									local404 = local294;
									if (Static83.method1237(local372, local377)) {
										local404 = local294 - 1;
									}
									if (local404 >= 0) {
										Static566.method7860(local182, local306 * 4 + local229, local372, local231 + (Static113.anInt1908 - local366) * 4 - 4, local52, local377, local404, arg0);
									}
								}
							}
						}
					}
				}
				if (Static496.aBoolean689) {
					@Pc(476) Class226 local476 = Static626.aClass226Array1[arg1];
					for (local306 = 0; local306 < Static113.anInt1908; local306++) {
						for (local366 = 0; local366 < Static113.anInt1908; local366++) {
							local372 = local306 + local215;
							local377 = local366 + local223;
							local404 = local476.anIntArrayArray41[local372 - local476.anInt5905][local377 - local476.anInt5886];
							if ((local404 & 0x40240000) != 0) {
								arg0.method9637(4, 4, local231 + (Static113.anInt1908 - local366) * 4 - 4, -1713569622, local229 + local306 * 4);
							} else if ((local404 & 0x800000) != 0) {
								arg0.method9641(local231 + (Static113.anInt1908 - local366) * 4 - 4, -1713569622, 4, local229 + local306 * 4);
							} else if ((local404 & 0x2000000) != 0) {
								arg0.method9634(local306 * 4 + local229 + 3, 4, (Static113.anInt1908 - local366) * 4 + local231 - 4, -1713569622);
							} else if ((local404 & 0x8000000) != 0) {
								arg0.method9641((Static113.anInt1908 - local366) * 4 + local231 + 3 - 4, -1713569622, 4, local306 * 4 + local229);
							} else if ((local404 & 0x20000000) != 0) {
								arg0.method9634(local306 * 4 + local229, 4, local231 + (Static113.anInt1908 - local366) * 4 - 4, -1713569622);
							}
						}
					}
				}
				arg0.aa(local229, local231, Static113.anInt1908 * 4, Static113.anInt1908 * 4, local201, 2);
				Static73.aClass43_2.method9597((local215 - local19) * 4 + 48, -(Static113.anInt1908 * 4) + -((-local25 + local223) * 4) + 464, Static113.anInt1908 * 4, Static113.anInt1908 * 4, local229, local231);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static668.method9110(-121);
		Static416.anInt6806 = 0;
		Static39.aClass60_15.method1223();
		if (!Static496.aBoolean689) {
			for (local223 = local19; local223 < local19 + 104; local223++) {
				for (local229 = local25; local229 < local25 + 104; local229++) {
					for (local231 = arg1; local231 <= arg1 + 1 && local231 <= 3; local231++) {
						if (Static208.method4773(local229, local223, local231, arg1)) {
							@Pc(803) Interface25 local803 = (Interface25) Static441.method6382(local231, local223, local229);
							if (local803 == null) {
								local803 = (Interface25) Static140.method2072(local231, local223, local229, aClass53 == null ? (aClass53 = Class2_Sub6.a("vi")) : aClass53);
							}
							if (local803 == null) {
								local803 = (Interface25) Static91.method1414(local231, local223, local229);
							}
							if (local803 == null) {
								local803 = (Interface25) Static366.method5263(local231, local223, local229);
							}
							if (local803 != null) {
								@Pc(849) Class81 local849 = Static148.aClass153_3.method3342(local803.method8986());
								if (!local849.lb || Static102.aBoolean202) {
									local253 = local849.anInt1853;
									if (local849.anIntArray143 != null) {
										for (local265 = 0; local265 < local849.anIntArray143.length; local265++) {
											if (local849.anIntArray143[local265] != -1) {
												@Pc(883) Class81 local883 = Static148.aClass153_3.method3342(local849.anIntArray143[local265]);
												if (local883.anInt1853 >= 0) {
													local253 = local883.anInt1853;
												}
											}
										}
									}
									if (local253 >= 0) {
										@Pc(907) boolean local907 = false;
										if (local253 >= 0) {
											@Pc(914) Class259 local914 = Static117.aClass196_2.method4194(local253);
											if (local914 != null && local914.aBoolean583) {
												local907 = true;
											}
										}
										local294 = local223;
										local300 = local229;
										if (local907) {
											@Pc(934) int[][] local934 = Static626.aClass226Array1[local231].anIntArrayArray41;
											local366 = Static626.aClass226Array1[local231].anInt5905;
											local372 = Static626.aClass226Array1[local231].anInt5886;
											for (local377 = 0; local377 < 10; local377++) {
												local404 = (int) (Math.random() * 4.0D);
												if (local404 == 0 && local19 < local294 && local223 - 3 < local294 && (local934[local294 - local366 - 1][local300 - local372] & 0x2C0108) == 0) {
													local294--;
												}
												if (local404 == 1 && local294 < local19 + 104 - 1 && local223 + 3 > local294 && (local934[local294 + 1 - local366][local300 - local372] & 0x2C0180) == 0) {
													local294++;
												}
												if (local404 == 2 && local300 > local25 && local300 > local229 - 3 && (local934[local294 - local366][local300 - local372 - 1] & 0x2C0102) == 0) {
													local300--;
												}
												if (local404 == 3 && local300 < local25 + 104 - 1 && local300 < local229 + 3 && (local934[local294 - local366][local300 + 1 - local372] & 0x2C0120) == 0) {
													local300++;
												}
											}
										}
										Static408.anIntArray470[Static416.anInt6806] = local849.anInt1860;
										Static336.anIntArray367[Static416.anInt6806] = local294;
										Static403.anIntArray465[Static416.anInt6806] = local300;
										Static416.anInt6806++;
									}
								}
							}
						}
					}
				}
			}
			if (Static8.aClass372_1 != null) {
				Static1.aClass254_144.anInt6802 = 1;
				Static117.aClass196_2.method4191(1024, 64);
				for (local229 = 0; local229 < Static8.aClass372_1.anInt10220; local229++) {
					local231 = Static8.aClass372_1.anIntArray722[local229];
					if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 == local231 >> 28) {
						local233 = (local231 >> 14 & 0x3FFF) - Static243.anInt3820;
						local241 = (local231 & 0x3FFF) - Static224.anInt11062;
						if (local233 >= 0 && Static426.anInt6942 > local233 && local241 >= 0 && Static280.anInt6752 > local241) {
							Static39.aClass60_15.method1233(new Class2_Sub2(local229));
						} else {
							@Pc(1267) Class259 local1267 = Static117.aClass196_2.method4194(Static8.aClass372_1.anIntArray723[local229]);
							if (local1267.anIntArray497 != null && local1267.anInt6969 + local233 >= 0 && local1267.anInt6973 + local233 < Static426.anInt6942 && local1267.anInt6957 + local241 >= 0 && Static280.anInt6752 > local1267.anInt6982 + local241) {
								Static39.aClass60_15.method1233(new Class2_Sub2(local229));
							}
						}
					}
				}
				Static117.aClass196_2.method4191(128, 64);
				Static1.aClass254_144.anInt6802 = 2;
				Static1.aClass254_144.method6096();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!aa;IILclient!oh;ILclient!ug;IB)V")
	public static void method8699(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class273 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class43 arg5, @OriginalArg(6) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(15) int local15;
		if (Static60.anInt1040 == 4) {
			local15 = (int) Static213.aFloat46 & 0x3FFF;
		} else {
			local15 = Static91.anInt1623 + (int) Static213.aFloat46 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg3.anInt7402 / 2, arg3.anInt7385 / 2) + 10;
		@Pc(44) int local44 = arg4 * arg4 + arg6 * arg6;
		if (local44 > local36 * local36) {
			return;
		}
		@Pc(67) int local67 = Class145_Sub1.anIntArray761[local15];
		@Pc(71) int local71 = Class145_Sub1.anIntArray760[local15];
		if (Static60.anInt1040 != 4) {
			local71 = local71 * 256 / (Static505.anInt8017 + 256);
			local67 = local67 * 256 / (Static505.anInt8017 + 256);
		}
		@Pc(100) int local100 = local71 * arg4 + local67 * arg6 >> 14;
		@Pc(110) int local110 = local71 * arg6 - local67 * arg4 >> 14;
		arg5.method9593(local100 + arg1 + arg3.anInt7402 / 2 - arg5.method9587() / 2, -local110 + arg3.anInt7385 / 2 + (arg2 - arg5.method9600() / 2), arg0, arg1, arg2);
	}
}
