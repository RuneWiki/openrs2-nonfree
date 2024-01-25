import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!me", name = "j", descriptor = "I")
	public static int anInt4258;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "[I")
	public static final int[] anIntArray333 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!qa;I)V")
	public static void method3541(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static449.anInt7763 == 0 || Static256.anInt4392 == 0) {
			return;
		}
		arg1.GA(Static138.anInt7421, Static237.anInt4171, Static449.anInt7763, Static256.anInt4392);
		arg1.pa(Static357.anInt6540, Static392.anInt7049, Static449.anInt7763, Static256.anInt4392);
		@Pc(32) Class43 local32 = arg1.method4592();
		local32.Q(Static417.anInt7327, Static183.anInt3440, Static57.anInt868, Static295.anInt4939, Static84.anInt6176, Static309.anInt5229);
		arg1.m(local32);
		@Pc(60) int local60;
		@Pc(68) int local68;
		@Pc(71) int local71;
		@Pc(79) int local79;
		@Pc(88) int local88;
		@Pc(103) int[] local103;
		@Pc(135) int local135;
		@Pc(144) int local144;
		if (Static60.aClass70Array1 != null) {
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			@Pc(52) int local52 = arg1.d();
			local60 = local52 * (arg2 - Static138.anInt7421) / Static449.anInt7763;
			local68 = (arg0 - Static237.anInt4171) * local52 / Static256.anInt4392;
			local71 = arg1.W();
			local79 = local71 * (arg2 - Static138.anInt7421) / Static449.anInt7763;
			local88 = local71 * (arg0 - Static237.anInt4171) / Static256.anInt4392;
			local103 = new int[] { local60, local68, local52 };
			local32.X(local103);
			@Pc(121) int[] local121 = new int[] { local79, local88, local71 };
			local32.X(local121);
			@Pc(126) float local126 = 0.0F;
			local135 = local121[0] - local103[0];
			local144 = local121[1] - local103[1];
			@Pc(153) int local153 = local121[2] - local103[2];
			while (local126 < 1.0F) {
				@Pc(166) int local166 = (int) ((float) local135 * local126 + (float) local103[0]);
				@Pc(170) int local170 = local166 >> 7;
				@Pc(181) int local181 = (int) ((float) local103[2] + (float) local153 * local126);
				@Pc(185) int local185 = local181 >> 7;
				if (local170 > 0 && local185 > 0 && local170 < Static80.anInt6558 && Static104.anInt2048 > local185) {
					@Pc(201) int local201 = Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97;
					if (local201 < 3 && (Static228.aByteArrayArrayArray8[1][local170][local185] & 0x2) != 0) {
						local201++;
					}
					if ((float) Static60.aClass70Array1[local201].va(local166, local181) < (float) local144 * local126 + (float) local103[1]) {
						local47 = (Static255.aClass47_Sub1_Sub5_Sub2_2.method4317() - 1 << 6) + local166 >> 7;
						local49 = local181 + (Static255.aClass47_Sub1_Sub5_Sub2_2.method4317() - 1 << 6) >> 7;
						break;
					}
				}
				local126 = (float) ((double) local126 + 0.01D);
			}
			if (local47 != -1 && local49 != -1) {
				if (Static217.aBoolean311 && (Static93.anInt1804 & 0x40) != 0) {
					@Pc(327) Class229 local327 = Static99.method1611(Static380.anInt6831, Static224.anInt3903);
					if (local327 == null) {
						Static161.method2531();
					} else {
						Static379.method5349(-1, Static36.anInt7708, " ->", Static225.aString52, local47, false, 0L, 58, true, local49);
					}
				} else {
					if (Static325.aClass169_2 == Static92.aClass169_1) {
						Static379.method5349(-1, -1, "", Static19.aClass96_3.method1935(Static389.anInt7061), local47, false, 0L, 16, true, local49);
					}
					Static379.method5349(-1, Static348.anInt6362, "", Static399.aString85, local47, false, 0L, 48, true, local49);
				}
			}
		}
		@Pc(347) Class242 local347 = Static249.aClass242_3;
		for (@Pc(360) Class36_Sub1 local360 = (Class36_Sub1) local347.method5503(); local360 != null; local360 = (Class36_Sub1) local347.method5506()) {
			if (Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 == local360.anInt658 && local360.method545(arg1, arg2, arg0)) {
				@Pc(477) int local477;
				if (local360.aClass47_1 instanceof Class47_Sub1_Sub5_Sub2) {
					@Pc(382) Class47_Sub1_Sub5_Sub2 local382 = (Class47_Sub1_Sub5_Sub2) local360.aClass47_1;
					local60 = local382.method4317();
					if ((local60 & 0x1) == 0 && (local382.anInt7060 & 0x7F) == 0 && (local382.anInt7066 & 0x7F) == 0 || (local60 & 0x1) == 1 && (local382.anInt7060 & 0x7F) == 64 && (local382.anInt7066 & 0x7F) == 64) {
						local68 = local382.anInt7060 - (local382.method4317() - 1 << 6);
						local71 = local382.anInt7066 - (local382.method4317() - 1 << 6);
						@Pc(489) int local489;
						for (local79 = 0; local79 < Static47.anInt760; local79++) {
							@Pc(454) Class47_Sub1_Sub5_Sub1 local454 = Static307.aClass47_Sub1_Sub5_Sub1Array1[Static151.anIntArray211[local79]];
							if (local454 != null && local454.anInt5375 != Static123.anInt2333 && local454.aBoolean430) {
								local477 = local454.anInt7060 - (local454.aClass196_1.anInt5550 - 1 << 6);
								local489 = local454.anInt7066 - (local454.aClass196_1.anInt5550 - 1 << 6);
								if (local68 <= local477 && local454.aClass196_1.anInt5550 <= local382.method4317() - (local477 - local68 >> 7) && local489 >= local71 && local454.aClass196_1.anInt5550 <= local382.method4317() - (local489 - local71 >> 7)) {
									Static37.method3518(local360.anInt658 != Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97, local454);
									local454.anInt5375 = Static123.anInt2333;
								}
							}
						}
						local88 = Static97.anInt1902;
						local103 = Static105.anIntArray107;
						for (local489 = 0; local489 < local88; local489++) {
							@Pc(577) Class47_Sub1_Sub5_Sub2 local577 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local103[local489]];
							if (local577 != null && Static123.anInt2333 != local577.anInt5375 && local577 != local382 && local577.aBoolean430) {
								local135 = local577.anInt7060 - (local577.method4317() - 1 << 6);
								local144 = local577.anInt7066 - (local577.method4317() - 1 << 6);
								if (local68 <= local135 && local577.method4317() <= local382.method4317() - (local135 - local68 >> 7) && local71 <= local144 && local577.method4317() <= local382.method4317() - (local144 - local71 >> 7)) {
									Static64.method970(Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 != local360.anInt658, local577);
									local577.anInt5375 = Static123.anInt2333;
								}
							}
						}
					}
					if (Static123.anInt2333 == local382.anInt5375) {
						continue;
					}
					Static64.method970(Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 != local360.anInt658, local382);
					local382.anInt5375 = Static123.anInt2333;
				}
				if (local360.aClass47_1 instanceof Class47_Sub1_Sub5_Sub1) {
					@Pc(717) Class47_Sub1_Sub5_Sub1 local717 = (Class47_Sub1_Sub5_Sub1) local360.aClass47_1;
					if (local717.aClass196_1 != null) {
						if ((local717.aClass196_1.anInt5550 & 0x1) == 0 && (local717.anInt7060 & 0x7F) == 0 && (local717.anInt7066 & 0x7F) == 0 || (local717.aClass196_1.anInt5550 & 0x1) == 1 && (local717.anInt7060 & 0x7F) == 64 && (local717.anInt7066 & 0x7F) == 64) {
							local60 = local717.anInt7060 - (local717.aClass196_1.anInt5550 - 1 << 6);
							local68 = local717.anInt7066 - (local717.aClass196_1.anInt5550 - 1 << 6);
							for (local71 = 0; local71 < Static47.anInt760; local71++) {
								@Pc(798) Class47_Sub1_Sub5_Sub1 local798 = Static307.aClass47_Sub1_Sub5_Sub1Array1[Static151.anIntArray211[local71]];
								if (local798 != null && Static123.anInt2333 != local798.anInt5375 && local798 != local717 && local798.aBoolean430) {
									local88 = local798.anInt7060 - (local798.aClass196_1.anInt5550 - 1 << 6);
									local477 = local798.anInt7066 - (local798.aClass196_1.anInt5550 - 1 << 6);
									if (local88 >= local60 && local798.aClass196_1.anInt5550 <= local717.aClass196_1.anInt5550 - (local88 - local60 >> 7) && local477 >= local68 && local717.aClass196_1.anInt5550 - (local477 - local68 >> 7) >= local798.aClass196_1.anInt5550) {
										Static37.method3518(local360.anInt658 != Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97, local798);
										local798.anInt5375 = Static123.anInt2333;
									}
								}
							}
							local79 = Static97.anInt1902;
							@Pc(917) int[] local917 = Static105.anIntArray107;
							for (local477 = 0; local477 < local79; local477++) {
								@Pc(927) Class47_Sub1_Sub5_Sub2 local927 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local917[local477]];
								if (local927 != null && local927.anInt5375 != Static123.anInt2333 && local927.aBoolean430) {
									@Pc(952) int local952 = local927.anInt7060 - (local927.method4317() - 1 << 6);
									local135 = local927.anInt7066 - (local927.method4317() - 1 << 6);
									if (local60 <= local952 && local927.method4317() <= local717.aClass196_1.anInt5550 - (local952 - local60 >> 7) && local68 <= local135 && local927.method4317() <= local717.aClass196_1.anInt5550 - (local135 - local68 >> 7)) {
										Static64.method970(local360.anInt658 != Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97, local927);
										local927.anInt5375 = Static123.anInt2333;
									}
								}
							}
						}
						if (Static123.anInt2333 == local717.anInt5375) {
							continue;
						}
						Static37.method3518(local360.anInt658 != Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97, local717);
						local717.anInt5375 = Static123.anInt2333;
					}
				}
				if (local360.aClass47_1 instanceof Class47_Sub3_Sub1) {
					@Pc(1078) Class1_Sub34 local1078 = (Class1_Sub34) Static346.aClass51_22.method930((long) (local360.anInt657 << 14 | local360.anInt658 << 28 | local360.anInt656));
					if (local1078 != null) {
						for (@Pc(1088) Class1_Sub44 local1088 = (Class1_Sub44) local1078.aClass142_43.method3202(); local1088 != null; local1088 = (Class1_Sub44) local1078.aClass142_43.method3211()) {
							@Pc(1096) Class206 local1096 = Static388.aClass193_3.method4249(local1088.anInt7736);
							if (!Static217.aBoolean311) {
								if (Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 == local360.anInt658) {
									@Pc(1179) String[] local1179 = local1096.aStringArray31;
									for (local79 = 4; local79 >= 0; local79--) {
										if (local1179 != null && local1179[local79] != null) {
											@Pc(1191) byte local1191 = 0;
											if (local79 == 0) {
												local1191 = 4;
											}
											local477 = Static356.anInt6525;
											if (local79 == 1) {
												local1191 = 44;
											}
											if (local79 == 2) {
												local1191 = 10;
											}
											if (local79 == 3) {
												local1191 = 49;
											}
											if (local79 == 4) {
												local1191 = 22;
											}
											if (local79 == local1096.anInt6286) {
												local477 = local1096.anInt6327;
											}
											if (local79 == local1096.anInt6312) {
												local477 = local1096.anInt6324;
											}
											Static379.method5349(-1, local477, "<col=ff9040>" + local1096.aString72, local1179[local79], local360.anInt656, false, (long) local1088.anInt7736, local1191, true, local360.anInt657);
										}
									}
								}
								Static379.method5349(-1, Static273.anInt4616, "<col=ff9040>" + local1096.aString72, Static332.aClass96_93.method1935(Static389.anInt7061), local360.anInt656, Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 != local360.anInt658, (long) local1088.anInt7736, 1006, true, local360.anInt657);
							} else if (local360.anInt658 == Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97) {
								@Pc(1117) Class108 local1117 = Static308.anInt7729 == -1 ? null : Static192.aClass75_1.method1517(Static308.anInt7729);
								if ((Static93.anInt1804 & 0x1) != 0 && (local1117 == null || local1096.method4971(Static308.anInt7729, local1117.anInt2527) != local1117.anInt2527)) {
									Static379.method5349(-1, Static36.anInt7708, Static363.aString75 + " -> <col=ff9040>" + local1096.aString72, Static225.aString52, local360.anInt656, false, (long) local1088.anInt7736, 8, true, local360.anInt657);
								}
							}
						}
					}
				}
				if (local360.aClass47_1 instanceof Interface11) {
					@Pc(1327) Interface11 local1327 = (Interface11) local360.aClass47_1;
					@Pc(1334) Class29 local1334 = Static251.aClass207_2.method4977(local1327.method5744());
					if (local1334.anIntArray36 != null) {
						local1334 = local1334.method475(Static237.aClass80_1);
					}
					if (local1334 != null) {
						if (!Static217.aBoolean311) {
							if (Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97 == local360.anInt658) {
								@Pc(1434) String[] local1434 = local1334.aStringArray4;
								if (local1434 != null) {
									for (local71 = 4; local71 >= 0; local71--) {
										if (local1434[local71] != null) {
											@Pc(1446) short local1446 = 0;
											local88 = Static356.anInt6525;
											if (local71 == 0) {
												local1446 = 25;
											}
											if (local71 == 1) {
												local1446 = 9;
											}
											if (local71 == 2) {
												local1446 = 11;
											}
											if (local71 == 3) {
												local1446 = 19;
											}
											if (local71 == local1334.anInt558) {
												local88 = local1334.anInt543;
											}
											if (local71 == 4) {
												local1446 = 1010;
											}
											if (local71 == local1334.anInt575) {
												local88 = local1334.anInt555;
											}
											Static379.method5349(-1, local88, "<col=00ffff>" + local1334.aString7, local1434[local71], local360.anInt656, false, Static330.method4759(local360.anInt657, local1327, local360.anInt656), local1446, true, local360.anInt657);
										}
									}
								}
							}
							Static379.method5349(-1, Static273.anInt4616, "<col=00ffff>" + local1334.aString7, Static332.aClass96_93.method1935(Static389.anInt7061), local360.anInt656, local360.anInt658 != Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97, (long) local1334.anInt545, 1001, true, local360.anInt657);
						} else if (local360.anInt658 == Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97) {
							@Pc(1368) Class108 local1368 = Static308.anInt7729 == -1 ? null : Static192.aClass75_1.method1517(Static308.anInt7729);
							if ((Static93.anInt1804 & 0x4) != 0 && (local1368 == null || local1334.method461(Static308.anInt7729, local1368.anInt2527) != local1368.anInt2527)) {
								Static379.method5349(-1, Static36.anInt7708, Static363.aString75 + " -> <col=00ffff>" + local1334.aString7, Static225.aString52, local360.anInt656, false, Static330.method4759(local360.anInt657, local1327, local360.anInt656), 5, true, local360.anInt657);
							}
						}
					}
				}
			}
		}
	}
}
