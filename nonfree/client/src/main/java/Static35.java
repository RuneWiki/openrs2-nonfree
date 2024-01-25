import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!jh;")
	public static Class152 aClass152_1;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "[Lclient!np;")
	public static final Class1_Sub41[] aClass1_Sub41Array1 = new Class1_Sub41[1024];

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
	public static final int[] anIntArray72 = new int[1];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(CB)Z")
	public static boolean method1103(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(30) char[] local30 = Static115.aCharArray5;
			for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
				@Pc(38) char local38 = local30[local32];
				if (local38 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIILclient!qa;)V")
	public static void method1104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static103.anInt2207 == 0 || Static339.anInt6286 == 0) {
			return;
		}
		arg2.b(Static442.anInt7729, Static416.anInt7274, Static103.anInt2207, Static339.anInt6286);
		arg2.N(Static91.anInt9225, Static184.anInt3831, Static103.anInt2207, Static339.anInt6286);
		@Pc(35) Class128 local35 = arg2.method7189();
		local35.B(Static202.anInt4054, Static174.anInt3466, Static176.anInt3514, Static238.anInt4639, Static74.anInt1791, Static339.anInt6277);
		arg2.method7198(local35);
		@Pc(55) int local55;
		@Pc(64) int local64;
		@Pc(72) int local72;
		@Pc(75) int local75;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(108) int[] local108;
		@Pc(140) int local140;
		@Pc(149) int local149;
		if (Static411.aClass7Array12 != null) {
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			local55 = arg2.c();
			local64 = (arg0 - Static442.anInt7729) * local55 / Static103.anInt2207;
			local72 = (arg1 - Static416.anInt7274) * local55 / Static339.anInt6286;
			local75 = arg2.CA();
			local84 = local75 * (arg0 - Static442.anInt7729) / Static103.anInt2207;
			local93 = local75 * (arg1 - Static416.anInt7274) / Static339.anInt6286;
			local108 = new int[] { local64, local72, local55 };
			local35.va(local108);
			@Pc(126) int[] local126 = new int[] { local84, local93, local75 };
			local35.va(local126);
			@Pc(131) float local131 = 0.0F;
			local140 = local126[0] - local108[0];
			local149 = local126[1] - local108[1];
			@Pc(158) int local158 = local126[2] - local108[2];
			while (local131 < 1.0F) {
				@Pc(171) int local171 = (int) ((float) local108[0] + (float) local140 * local131);
				@Pc(175) int local175 = local171 >> 7;
				@Pc(186) int local186 = (int) ((float) local108[2] + (float) local158 * local131);
				@Pc(190) int local190 = local186 >> 7;
				if (local175 > 0 && local190 > 0 && Static237.anInt4563 > local175 && Static373.anInt6694 > local190) {
					@Pc(206) int local206 = Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108;
					if (local206 < 3 && (Static379.aByteArrayArrayArray13[1][local175][local190] & 0x2) != 0) {
						local206++;
					}
					if ((float) Static411.aClass7Array12[local206].aa(local171, local186) < (float) local108[1] + local131 * (float) local149) {
						local50 = local171 + (Static107.aClass20_Sub1_Sub1_Sub1_1.method7808() - 1 << 6) >> 7;
						local52 = (Static107.aClass20_Sub1_Sub1_Sub1_1.method7808() - 1 << 6) + local186 >> 7;
						break;
					}
				}
				local131 = (float) ((double) local131 + 0.01D);
			}
			if (local50 != -1 && local52 != -1) {
				if (Static181.aBoolean310 && (Static59.anInt1479 & 0x40) != 0) {
					@Pc(301) Class91 local301 = Static429.method6657(Static49.anInt1304, Static119.anInt2478);
					if (local301 == null) {
						Static417.method6564();
					} else {
						Static18.method539(15, true, local52, Static266.anInt5103, local50, " ->", Static151.aString116, 0L, false, -1);
					}
				} else {
					if (Static116.aClass250_2 == Static332.aClass250_4) {
						Static18.method539(51, true, local52, -1, local50, "", Static467.aClass45_122.method1474(Static544.anInt7853), 0L, false, -1);
					}
					Static18.method539(11, true, local52, Static514.anInt9106, local50, "", Static252.aString108, 0L, false, -1);
				}
			}
		}
		@Pc(359) Class184 local359 = Static191.aClass184_49;
		for (@Pc(364) Class46_Sub6 local364 = (Class46_Sub6) local359.method5138(); local364 != null; local364 = (Class46_Sub6) local359.method5145()) {
			if ((Static450.aBoolean584 || local364.anInt6351 == Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108) && local364.method5762(arg0, arg1, arg2)) {
				@Pc(502) int local502;
				@Pc(514) int local514;
				if (local364.aClass20_1 instanceof Class20_Sub1_Sub1_Sub1) {
					@Pc(392) Class20_Sub1_Sub1_Sub1 local392 = (Class20_Sub1_Sub1_Sub1) local364.aClass20_1;
					local64 = local392.method7808();
					if ((local64 & 0x1) == 0 && (local392.anInt8954 & 0x7F) == 0 && (local392.anInt8949 & 0x7F) == 0 || (local64 & 0x1) == 1 && (local392.anInt8954 & 0x7F) == 64 && (local392.anInt8949 & 0x7F) == 64) {
						local72 = local392.anInt8954 - (local392.method7808() - 1 << 6);
						local75 = local392.anInt8949 - (local392.method7808() - 1 << 6);
						for (local84 = 0; local84 < Static141.anInt2822; local84++) {
							@Pc(472) Class1_Sub41 local472 = (Class1_Sub41) Static362.aClass230_46.method6144((long) Static220.anIntArray339[local84]);
							if (local472 != null) {
								@Pc(477) Class20_Sub1_Sub1_Sub2 local477 = local472.aClass20_Sub1_Sub1_Sub2_2;
								if (Static445.anInt7791 != local477.anInt9028 && local477.aBoolean678) {
									local502 = local477.anInt8954 - (local477.aClass283_1.anInt8439 - 1 << 6);
									local514 = local477.anInt8949 - (local477.aClass283_1.anInt8439 - 1 << 6);
									if (local502 >= local72 && local477.aClass283_1.anInt8439 <= local392.method7808() - (local502 - local72 >> 7) && local75 <= local514 && local477.aClass283_1.anInt8439 <= local392.method7808() - (local514 - local75 >> 7)) {
										Static427.method6644(local477, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 != local364.anInt6351);
										local477.anInt9028 = Static445.anInt7791;
									}
								}
							}
						}
						local93 = Static207.anInt4085;
						local108 = Static209.anIntArray327;
						for (local502 = 0; local502 < local93; local502++) {
							@Pc(581) Class20_Sub1_Sub1_Sub1 local581 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local108[local502]];
							if (local581 != null && local581.anInt9028 != Static445.anInt7791 && local581 != local392 && local581.aBoolean678) {
								local140 = local581.anInt8954 - (local581.method7808() - 1 << 6);
								local149 = local581.anInt8949 - (local581.method7808() - 1 << 6);
								if (local72 <= local140 && local581.method7808() <= local392.method7808() - (local140 - local72 >> 7) && local149 >= local75 && local581.method7808() <= local392.method7808() - (local149 - local75 >> 7)) {
									Static375.method7393(local581, local364.anInt6351 != Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108);
									local581.anInt9028 = Static445.anInt7791;
								}
							}
						}
					}
					if (local392.anInt9028 == Static445.anInt7791) {
						continue;
					}
					Static375.method7393(local392, local364.anInt6351 != Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108);
					local392.anInt9028 = Static445.anInt7791;
				}
				@Pc(832) int local832;
				if (local364.aClass20_1 instanceof Class20_Sub1_Sub1_Sub2) {
					@Pc(717) Class20_Sub1_Sub1_Sub2 local717 = (Class20_Sub1_Sub1_Sub2) local364.aClass20_1;
					if (local717.aClass283_1 != null) {
						if ((local717.aClass283_1.anInt8439 & 0x1) == 0 && (local717.anInt8954 & 0x7F) == 0 && (local717.anInt8949 & 0x7F) == 0 || (local717.aClass283_1.anInt8439 & 0x1) == 1 && (local717.anInt8954 & 0x7F) == 64 && (local717.anInt8949 & 0x7F) == 64) {
							local64 = local717.anInt8954 - (local717.aClass283_1.anInt8439 - 1 << 6);
							local72 = local717.anInt8949 - (local717.aClass283_1.anInt8439 - 1 << 6);
							for (local75 = 0; local75 < Static141.anInt2822; local75++) {
								@Pc(799) Class1_Sub41 local799 = (Class1_Sub41) Static362.aClass230_46.method6144((long) Static220.anIntArray339[local75]);
								if (local799 != null) {
									@Pc(804) Class20_Sub1_Sub1_Sub2 local804 = local799.aClass20_Sub1_Sub1_Sub2_2;
									if (Static445.anInt7791 != local804.anInt9028 && local804 != local717 && local804.aBoolean678) {
										local832 = local804.anInt8954 - (local804.aClass283_1.anInt8439 - 1 << 6);
										local502 = local804.anInt8949 - (local804.aClass283_1.anInt8439 - 1 << 6);
										if (local832 >= local64 && local717.aClass283_1.anInt8439 - (local832 - local64 >> 7) >= local804.aClass283_1.anInt8439 && local502 >= local72 && local804.aClass283_1.anInt8439 <= local717.aClass283_1.anInt8439 - (local502 - local72 >> 7)) {
											Static427.method6644(local804, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 != local364.anInt6351);
											local804.anInt9028 = Static445.anInt7791;
										}
									}
								}
							}
							local84 = Static207.anInt4085;
							@Pc(914) int[] local914 = Static209.anIntArray327;
							for (local832 = 0; local832 < local84; local832++) {
								@Pc(924) Class20_Sub1_Sub1_Sub1 local924 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local914[local832]];
								if (local924 != null && Static445.anInt7791 != local924.anInt9028 && local924.aBoolean678) {
									local514 = local924.anInt8954 - (local924.method7808() - 1 << 6);
									local140 = local924.anInt8949 - (local924.method7808() - 1 << 6);
									if (local514 >= local64 && local924.method7808() <= local717.aClass283_1.anInt8439 - (local514 - local64 >> 7) && local72 <= local140 && local924.method7808() <= local717.aClass283_1.anInt8439 - (local140 - local72 >> 7)) {
										Static375.method7393(local924, local364.anInt6351 != Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108);
										local924.anInt9028 = Static445.anInt7791;
									}
								}
							}
						}
						if (Static445.anInt7791 == local717.anInt9028) {
							continue;
						}
						Static427.method6644(local717, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 != local364.anInt6351);
						local717.anInt9028 = Static445.anInt7791;
					}
				}
				if (local364.aClass20_1 instanceof Class20_Sub3_Sub1) {
					local55 = Static538.anInt9485 + local364.anInt6354;
					local64 = Static282.anInt5380 + local364.anInt6349;
					@Pc(1083) Class1_Sub20 local1083 = (Class1_Sub20) Static4.aClass230_2.method6144((long) (local364.anInt6351 << 28 | local64 << 14 | local55));
					if (local1083 != null) {
						for (@Pc(1091) Class1_Sub12 local1091 = (Class1_Sub12) local1083.aClass295_16.method7535(); local1091 != null; local1091 = (Class1_Sub12) local1083.aClass295_16.method7544()) {
							@Pc(1099) Class180 local1099 = Static181.aClass316_1.method8107(local1091.anInt2502);
							if (!Static181.aBoolean310) {
								if (Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 == local364.anInt6351) {
									@Pc(1174) String[] local1174 = local1099.aStringArray26;
									for (local832 = 4; local832 >= 0; local832--) {
										if (local1174 != null && local1174[local832] != null) {
											@Pc(1186) byte local1186 = 0;
											local514 = Static92.anInt2926;
											if (local832 == 0) {
												local1186 = 46;
											}
											if (local832 == 1) {
												local1186 = 6;
											}
											if (local832 == 2) {
												local1186 = 12;
											}
											if (local832 == 3) {
												local1186 = 5;
											}
											if (local832 == 4) {
												local1186 = 22;
											}
											if (local1099.lb == local832) {
												local514 = local1099.anInt5415;
											}
											if (local832 == local1099.anInt5451) {
												local514 = local1099.anInt5441;
											}
											Static18.method539(local1186, true, local364.anInt6349, local514, local364.anInt6354, "<col=ff9040>" + local1099.aString121, local1174[local832], (long) local1091.anInt2502, false, -1);
										}
									}
								}
								Static18.method539(1011, true, local364.anInt6349, Class1_Sub2_Sub1.anInt228, local364.anInt6354, "<col=ff9040>" + local1099.aString121, Static319.aClass45_92.method1474(Static544.anInt7853), (long) local1091.anInt2502, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 != local364.anInt6351, -1);
							} else if (local364.anInt6351 == Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108) {
								@Pc(1116) Class53 local1116 = Static395.anInt6942 == -1 ? null : Static440.aClass266_1.method6930(Static395.anInt6942);
								if ((Static59.anInt1479 & 0x1) != 0 && (local1116 == null || local1099.method4971(local1116.anInt1685, Static395.anInt6942) != local1116.anInt1685)) {
									Static18.method539(16, true, local364.anInt6349, Static266.anInt5103, local364.anInt6354, Static201.aString84 + " -> <col=ff9040>" + local1099.aString121, Static151.aString116, (long) local1091.anInt2502, false, -1);
								}
							}
						}
					}
				}
				if (local364.aClass20_1 instanceof Interface7) {
					@Pc(1330) Interface7 local1330 = (Interface7) local364.aClass20_1;
					@Pc(1337) Class51 local1337 = Static398.aClass18_4.method609(local1330.method8046());
					if (local1337.anIntArray108 != null) {
						local1337 = local1337.method1625(Static417.aClass10_1);
					}
					if (local1337 != null) {
						if (!Static181.aBoolean310) {
							if (Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 == local364.anInt6351) {
								@Pc(1431) String[] local1431 = local1337.aStringArray5;
								if (local1431 != null) {
									for (local75 = 4; local75 >= 0; local75--) {
										if (local1431[local75] != null) {
											@Pc(1443) short local1443 = 0;
											local93 = Static92.anInt2926;
											if (local75 == 0) {
												local1443 = 19;
											}
											if (local75 == 1) {
												local1443 = 8;
											}
											if (local75 == 2) {
												local1443 = 2;
											}
											if (local75 == 3) {
												local1443 = 57;
											}
											if (local75 == 4) {
												local1443 = 1002;
											}
											if (local75 == local1337.anInt1664) {
												local93 = local1337.anInt1651;
											}
											if (local75 == local1337.anInt1612) {
												local93 = local1337.anInt1657;
											}
											Static18.method539(local1443, true, local364.anInt6349, local93, local364.anInt6354, "<col=00ffff>" + local1337.aString30, local1431[local75], Static464.method7061(local1330, local364.anInt6354, local364.anInt6349), false, -1);
										}
									}
								}
							}
							Static18.method539(1010, true, local364.anInt6349, Class1_Sub2_Sub1.anInt228, local364.anInt6354, "<col=00ffff>" + local1337.aString30, Static319.aClass45_92.method1474(Static544.anInt7853), (long) local1337.anInt1646, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 != local364.anInt6351, -1);
						} else if (local364.anInt6351 == Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108) {
							@Pc(1368) Class53 local1368 = Static395.anInt6942 == -1 ? null : Static440.aClass266_1.method6930(Static395.anInt6942);
							if ((Static59.anInt1479 & 0x4) != 0 && (local1368 == null || local1337.method1628(Static395.anInt6942, local1368.anInt1685) != local1368.anInt1685)) {
								Static18.method539(44, true, local364.anInt6349, Static266.anInt5103, local364.anInt6354, Static201.aString84 + " -> <col=00ffff>" + local1337.aString30, Static151.aString116, Static464.method7061(local1330, local364.anInt6354, local364.anInt6349), false, -1);
							}
						}
					}
				}
			}
		}
	}
}
