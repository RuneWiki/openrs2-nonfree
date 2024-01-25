import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "Lclient!fo;")
	public static Class129 aClass129_4;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
	public static int anInt2272;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "F")
	public static float aFloat74 = 0.0F;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "[I")
	public static int[] anIntArray151 = new int[2];

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2101(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static102.method2010(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static121.anInt2381; local29++) {
			@Pc(35) String local35 = Static260.aStringArray36[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static102.method2010(local35);
			if (local35 != null && local35.equals(local20)) {
				Static121.anInt2381--;
				for (@Pc(59) int local59 = local29; local59 < Static121.anInt2381; local59++) {
					Static260.aStringArray36[local59] = Static260.aStringArray36[local59 + 1];
					Static217.aStringArray32[local59] = Static217.aStringArray32[local59 + 1];
					Static544.anIntArray579[local59] = Static544.anIntArray579[local59 + 1];
					Static641.aStringArray73[local59] = Static641.aStringArray73[local59 + 1];
					Static28.anIntArray21[local59] = Static28.anIntArray21[local59 + 1];
					Static64.aBooleanArray7[local59] = Static64.aBooleanArray7[local59 + 1];
				}
				Static221.anInt4055 = Static373.anInt6615;
				@Pc(128) Class3_Sub44 local128 = Static275.method5689(Static624.aClass376_139, Static540.aClass282_4);
				local128.aClass3_Sub17_Sub2_3.method4849(Static153.method2617(arg0));
				local128.aClass3_Sub17_Sub2_3.method4878(arg0);
				Static616.method8089(local128);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILclient!ha;)Z")
	public static boolean method2104(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(11) int local11 = (Static251.anInt4680 - 104) / 2;
		@Pc(17) int local17 = (Static406.anInt6924 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(34) int local34;
		@Pc(45) int local45;
		for (@Pc(26) int local26 = local11; local26 < local11 + 104; local26++) {
			for (@Pc(30) int local30 = local17; local30 < local17 + 104; local30++) {
				for (local34 = arg0; local34 <= 3; local34++) {
					if (Static339.method5151(local26, local30, local34, arg0)) {
						local45 = local34;
						if (Static190.method3051(local30, local26)) {
							local45 = local34 - 1;
						}
						if (local45 >= 0) {
							local19 &= Static170.method2795(local26, local30, local45);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(90) int[] local90 = new int[262144];
		for (local34 = 0; local34 < local90.length; local34++) {
			local90[local34] = -16777216;
		}
		Static103.aClass102_10 = arg1.method8131(512, local90, 512, 512);
		Static481.method6841();
		local45 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 228 | 0xFF000000;
		@Pc(160) int local160 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x59CCFF00) << 16;
		@Pc(179) int local179 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(191) boolean[][] local191 = new boolean[Static141.anInt2667 + 2 + 1][Static141.anInt2667 + 2 + 1];
		@Pc(197) int local197;
		@Pc(201) int local201;
		@Pc(203) int local203;
		@Pc(205) int local205;
		@Pc(211) int local211;
		@Pc(221) int local221;
		@Pc(232) int local232;
		@Pc(257) int local257;
		@Pc(261) int local261;
		@Pc(314) int local314;
		@Pc(320) int local320;
		@Pc(324) int local324;
		@Pc(347) int local347;
		for (@Pc(193) int local193 = local11; local193 < local11 + 104; local193 += Static141.anInt2667) {
			for (local197 = local17; local197 < local17 + 104; local197 += Static141.anInt2667) {
				local201 = 0;
				local203 = 0;
				local205 = local193;
				if (local193 > 0) {
					local201 += 4;
					local205 = local193 - 1;
				}
				local211 = local197;
				if (local197 > 0) {
					local211 = local197 - 1;
				}
				local221 = Static141.anInt2667 + local193;
				if (local221 < 104) {
					local221++;
				}
				local232 = local197 + Static141.anInt2667;
				if (local232 < 104) {
					local203 += 4;
					local232++;
				}
				arg1.KA(0, 0, local201 + Static141.anInt2667 * 4, Static141.anInt2667 * 4 + local203);
				arg1.GA(-16777216);
				@Pc(265) int local265;
				for (local257 = arg0; local257 <= 3; local257++) {
					for (local261 = 0; local261 <= Static141.anInt2667; local261++) {
						for (local265 = 0; local265 <= Static141.anInt2667; local265++) {
							local191[local261][local265] = Static339.method5151(local261 + local205, local211 + local265, local257, arg0);
						}
					}
					Static239.aClass104Array1[local257].method8281(local205, local211, local221, local232, local191);
					if (!Static251.aBoolean372) {
						for (local265 = -4; local265 < Static141.anInt2667; local265++) {
							for (local314 = -4; local314 < Static141.anInt2667; local314++) {
								local320 = local265 + local193;
								local324 = local197 + local314;
								if (local11 <= local320 && local17 <= local324 && Static339.method5151(local320, local324, local257, arg0)) {
									local347 = local257;
									if (Static190.method3051(local324, local320)) {
										local347 = local257 - 1;
									}
									if (local347 >= 0) {
										Static175.method2927(local347, local324, (Static141.anInt2667 - local314) * 4 + local203 - 4, arg1, local45, local320, local201 + local265 * 4, local160);
									}
								}
							}
						}
					}
				}
				if (Static251.aBoolean372) {
					@Pc(404) Class198 local404 = Static27.aClass198Array1[arg0];
					for (local265 = 0; local265 < Static141.anInt2667; local265++) {
						for (local314 = 0; local314 < Static141.anInt2667; local314++) {
							local320 = local193 + local265;
							local324 = local197 + local314;
							local347 = local404.anIntArrayArray57[local320 - local404.anInt5352][local324 - local404.anInt5350];
							if ((local347 & 0x40240000) != 0) {
								arg1.method8113(4, local265 * 4 + local201, 4, -1713569622, (Static141.anInt2667 - local314) * 4 + local203 - 4);
							} else if ((local347 & 0x800000) != 0) {
								arg1.method8153(4, -1713569622, local203 + (Static141.anInt2667 - local314) * 4 - 4, local265 * 4 + local201);
							} else if ((local347 & 0x2000000) != 0) {
								arg1.method8151(local201 + local265 * 4 + 3, 4, -1713569622, local203 + (Static141.anInt2667 - local314) * 4 - 4);
							} else if ((local347 & 0x8000000) != 0) {
								arg1.method8153(4, -1713569622, local203 + (Static141.anInt2667 - local314) * 4 - 1, local265 * 4 + local201);
							} else if ((local347 & 0x20000000) != 0) {
								arg1.method8151(local201 + local265 * 4, 4, -1713569622, local203 + (Static141.anInt2667 - local314) * 4 - 4);
							}
						}
					}
				}
				arg1.aa(local201, local203, Static141.anInt2667 * 4, Static141.anInt2667 * 4, local179, 2);
				Static103.aClass102_10.method6954((local193 - local11) * 4 + 48, -(Static141.anInt2667 * 4) + (464 - (local197 - local17) * 4), Static141.anInt2667 * 4, Static141.anInt2667 * 4, local201, local203);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static517.method7334();
		Static389.anInt6027 = 0;
		Static401.aClass193_34.method4458();
		if (!Static251.aBoolean372) {
			for (local197 = local11; local197 < local11 + 104; local197++) {
				for (local201 = local17; local201 < local17 + 104; local201++) {
					for (local203 = arg0; arg0 + 1 >= local203 && local203 <= 3; local203++) {
						if (Static339.method5151(local197, local201, local203, arg0)) {
							@Pc(682) Interface2 local682 = (Interface2) Static306.method4709(local203, local197, local201);
							if (local682 == null) {
								local682 = (Interface2) Static344.method5203(local203, local197, local201, bea.class);
							}
							if (local682 == null) {
								local682 = (Interface2) Static363.method5416(local203, local197, local201);
							}
							if (local682 == null) {
								local682 = (Interface2) Static244.method3912(local203, local197, local201);
							}
							if (local682 != null) {
								@Pc(723) Class178 local723 = Static349.aClass374_2.method8357(local682.method7823());
								if (!local723.aBoolean378 || Static375.aBoolean505) {
									local221 = local723.anInt4787;
									if (local723.anIntArray313 != null) {
										for (local232 = 0; local232 < local723.anIntArray313.length; local232++) {
											if (local723.anIntArray313[local232] != -1) {
												@Pc(752) Class178 local752 = Static349.aClass374_2.method8357(local723.anIntArray313[local232]);
												if (local752.anInt4787 >= 0) {
													local221 = local752.anInt4787;
												}
											}
										}
									}
									if (local221 >= 0) {
										@Pc(771) boolean local771 = false;
										if (local221 >= 0) {
											@Pc(778) Class145 local778 = Static661.aClass321_4.method7485(local221);
											if (local778 != null && local778.aBoolean287) {
												local771 = true;
											}
										}
										local257 = local197;
										local261 = local201;
										if (local771) {
											@Pc(796) int[][] local796 = Static27.aClass198Array1[local203].anIntArrayArray57;
											local314 = Static27.aClass198Array1[local203].anInt5352;
											local320 = Static27.aClass198Array1[local203].anInt5350;
											for (local324 = 0; local324 < 10; local324++) {
												local347 = (int) (Math.random() * 4.0D);
												if (local347 == 0 && local11 < local257 && local197 - 3 < local257 && (local796[local257 - local314 - 1][local261 - local320] & 0x2C0108) == 0) {
													local257--;
												}
												if (local347 == 1 && local257 < local11 + 103 && local257 < local197 + 3 && (local796[local257 + 1 - local314][local261 - local320] & 0x2C0180) == 0) {
													local257++;
												}
												if (local347 == 2 && local17 < local261 && local201 - 3 < local261 && (local796[local257 - local314][local261 - local320 - 1] & 0x2C0102) == 0) {
													local261--;
												}
												if (local347 == 3 && local261 < local17 + 104 - 1 && local261 < local201 + 3 && (local796[local257 - local314][local261 + 1 - local320] & 0x2C0120) == 0) {
													local261++;
												}
											}
										}
										Static17.anIntArray13[Static389.anInt6027] = local723.anInt4778;
										Static328.anIntArray389[Static389.anInt6027] = local257;
										Static290.anIntArray346[Static389.anInt6027] = local261;
										Static389.anInt6027++;
									}
								}
							}
						}
					}
				}
			}
			if (Static17.aClass121_1 != null) {
				Static346.aClass143_87.anInt3570 = 1;
				Static661.aClass321_4.method7482(1024, 64);
				for (local201 = 0; local201 < Static17.aClass121_1.anInt3011; local201++) {
					local203 = Static17.aClass121_1.anIntArray197[local201];
					if (local203 >> 28 == Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142) {
						local205 = (local203 >> 14 & 0x3FFF) - Static417.anInt7047;
						local211 = (local203 & 0x3FFF) - Static347.anInt7851;
						if (local205 >= 0 && local205 < Static251.anInt4680 && local211 >= 0 && Static406.anInt6924 > local211) {
							Static401.aClass193_34.method4462(new Class3_Sub53(local201));
						} else {
							@Pc(1080) Class145 local1080 = Static661.aClass321_4.method7485(Static17.aClass121_1.anIntArray198[local201]);
							if (local1080.anIntArray249 != null && local1080.anInt3637 + local205 >= 0 && local1080.anInt3599 + local205 < Static251.anInt4680 && local211 + local1080.anInt3629 >= 0 && local211 + local1080.anInt3627 < Static406.anInt6924) {
								Static401.aClass193_34.method4462(new Class3_Sub53(local201));
							}
						}
					}
				}
				Static661.aClass321_4.method7482(128, 64);
				Static346.aClass143_87.anInt3570 = 2;
				Static346.aClass143_87.method3141();
			}
		}
		return true;
	}
}
