import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_170 = new Class268(105, 4);

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
	public static int anInt9491 = 0;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public static void method8055() {
		if (Static205.anInt4092 != -1) {
			Static438.method6809(-1, Static205.anInt4092, false, -1);
			Static205.anInt4092 = -1;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZIII)I")
	public static int method8056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(16) int local16 = local7 >= 8 ? arg0 : arg1;
		@Pc(35) int local35 = local7 < 4 ? arg0 : local7 == 12 || local7 == 14 ? arg1 : arg3;
		return ((local7 & 0x1) == 0 ? local16 : -local16) + ((local7 & 0x2) == 0 ? local35 : -local35);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIZI)V")
	public static void method8058(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static227.aClass128_12.method3560((long) arg2) != null) {
			return;
		}
		if (Static290.aBoolean386) {
			@Pc(24) Class6_Sub35 local24 = new Class6_Sub35(arg2, new Class62_Sub1(4096, Static114.aClass353_21, arg2), arg0, arg1);
			local24.aClass62_Sub1_1.method8474(Static62.aStringArray16[Static307.anInt5931]);
			Static227.aClass128_12.method3551((long) arg2, local24);
		} else {
			Static133.method2180(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Lclient!qq;")
	public static Class276 method8059(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static487.aFloat144 == 3.0D) {
				return Static574.aClass276_8;
			}
			if ((double) Static487.aFloat144 == 4.0D) {
				return Static525.aClass276_7;
			}
			if ((double) Static487.aFloat144 == 6.0D) {
				return Static408.aClass276_5;
			}
			if ((double) Static487.aFloat144 >= 8.0D) {
				return Static112.aClass276_1;
			}
		} else if (arg0 == 1) {
			if ((double) Static487.aFloat144 == 3.0D) {
				return Static408.aClass276_5;
			}
			if ((double) Static487.aFloat144 == 4.0D) {
				return Static112.aClass276_1;
			}
			if ((double) Static487.aFloat144 == 6.0D) {
				return Static384.aClass276_4;
			}
			if ((double) Static487.aFloat144 >= 8.0D) {
				return Static160.aClass276_2;
			}
		} else if (arg0 == 2) {
			if ((double) Static487.aFloat144 == 3.0D) {
				return Static384.aClass276_4;
			}
			if ((double) Static487.aFloat144 == 4.0D) {
				return Static160.aClass276_2;
			}
			if ((double) Static487.aFloat144 == 6.0D) {
				return Static501.aClass276_6;
			}
			if ((double) Static487.aFloat144 >= 8.0D) {
				return Static293.aClass276_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	public static void method8060() {
		if (Static308.aClass228_2 != null) {
			Static645.aClass121_1 = new Class121();
			Static645.aClass121_1.method3460(Static321.aLong163, Static308.aClass228_2.aClass192_63.method5299(Static307.anInt5931), Static308.aClass228_2.anInt7289, Static308.aClass228_2);
			Static493.aThread6 = new Thread(Static645.aClass121_1, "");
			Static493.aThread6.start();
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!ha;BII)V")
	public static void method8061(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static615.anInt8025 == 0 || Static304.anInt5896 == 0) {
			return;
		}
		@Pc(30) Class154 local30;
		@Pc(37) int local37;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(41) int local41;
		@Pc(55) int local55;
		@Pc(62) int local62;
		if (Static389.aBoolean497) {
			Static353.method5676(false);
			local30 = arg0.method8830();
			@Pc(33) int[] local33 = arg0.Y();
			local37 = local33[0];
			local41 = local33[3];
			local45 = local33[1];
			local49 = local33[2];
			local55 = Static91.method1163(false) + arg1;
			local62 = arg2 + Static252.method4531(false);
		} else {
			arg0.DA(Static182.anInt3742, Static213.anInt4189, Static615.anInt8025, Static304.anInt5896);
			local41 = Static304.anInt5896;
			local37 = Static182.anInt3742;
			local49 = Static615.anInt8025;
			local45 = Static213.anInt4189;
			arg0.KA(Static321.anInt6136, Static500.anInt8417, Static615.anInt8025, Static304.anInt5896);
			local30 = arg0.method8838();
			local30.method6569(Static2.anInt6, Static68.anInt1419, Static570.anInt9584, Static237.anInt4766, Static23.anInt4149, Static621.anInt10238);
			local62 = arg2;
			local55 = arg1;
			arg0.method8850(local30);
		}
		if (local41 == 0) {
			local41 = 1;
		}
		if (local49 == 0) {
			local49 = 1;
		}
		Static263.method4676(true);
		@Pc(137) int local137;
		@Pc(148) int local148;
		@Pc(165) int local165;
		@Pc(274) int local274;
		@Pc(283) int local283;
		@Pc(294) int local294;
		@Pc(305) int local305;
		@Pc(129) int local129;
		@Pc(352) int local352;
		if (Static228.aClass199Array2 != null && (!Static280.aBoolean380 || (Static543.anInt9347 & 0x40) != 0)) {
			local129 = -1;
			@Pc(131) int local131 = -1;
			@Pc(134) int local134 = arg0.i();
			local137 = arg0.XA();
			@Pc(174) int local174;
			@Pc(157) int local157;
			if (Static591.aBoolean675) {
				local148 = local157 = (local55 - local37) * Static419.anInt7660 / local49;
				local174 = local165 = (local62 - local45) * Static419.anInt7660 / local41;
			} else {
				local148 = (local55 - local37) * local134 / local49;
				local157 = (local55 - local37) * local137 / local49;
				local165 = (local62 - local45) * local137 / local41;
				local174 = (local62 - local45) * local134 / local41;
			}
			@Pc(212) int[] local212 = new int[] { local148, local174, local134 };
			local30.method6560(local212);
			@Pc(230) int[] local230 = new int[] { local157, local165, local137 };
			local30.method6560(local230);
			@Pc(261) float local261 = Static504.method8534((float) local212[2], (float) local230[1], (float) local230[0], (float) local212[0], (float) local230[2], 4, (float) local212[1]);
			if (local261 > 0.0F) {
				local274 = local230[0] - local212[0];
				local283 = local230[2] - local212[2];
				local294 = (int) (local261 * (float) local274 + (float) local212[0]);
				local305 = (int) ((float) local283 * local261 + (float) local212[2]);
				local129 = local294 + (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method4913() - 1 << 8) >> 9;
				local131 = (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method4913() - 1 << 8) + local305 >> 9;
				@Pc(332) byte local332 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131;
				if (local332 < 3 && (Static197.aByteArrayArrayArray24[1][local294 >> 9][local305 >> 9] & 0x2) != 0) {
					local352 = local332 + 1;
				}
			}
			if (local129 != -1 && local131 != -1) {
				if (Static280.aBoolean380 && (Static543.anInt9347 & 0x40) != 0) {
					@Pc(373) Class302 local373 = Static110.method1816(Static30.anInt4466, Static453.anInt8081);
					if (local373 == null) {
						Static633.method8924();
					} else {
						Static542.method7932(Static173.aString38, local129, false, 0L, Static1.anInt8260, true, -1, 6, local131, true, (long) (local131 | local129 << 0), " ->");
					}
				} else {
					if (Static135.aBoolean184) {
						Static542.method7932(Static317.aClass192_27.method5299(Static307.anInt5931), local129, false, 0L, -1, true, -1, 50, local131, true, (long) (local131 | local129 << 0), "");
					}
					Static542.method7932(Static412.aString55, local129, false, 0L, Static36.anInt716, true, -1, 58, local131, true, (long) (local129 << 0 | local131), "");
				}
			}
		}
		if (Static389.aBoolean497) {
			Static633.method8933();
		}
		for (local129 = 0; local129 < (Static389.aBoolean497 ? 2 : 1); local129++) {
			@Pc(464) boolean local464 = local129 == 0;
			@Pc(470) Class65 local470 = local464 ? Static94.aClass65_1 : Static287.aClass65_4;
			local137 = arg1;
			local148 = arg2;
			if (Static389.aBoolean497) {
				Static353.method5676(local464);
				local137 = arg1 + Static91.method1163(local464);
				local148 = arg2 + Static252.method4531(local464);
			}
			@Pc(494) Class81 local494 = local470.aClass81_2;
			for (@Pc(499) Class20_Sub3 local499 = (Class20_Sub3) local494.method2118(); local499 != null; local499 = (Class20_Sub3) local494.method2128()) {
				if ((Static191.aBoolean280 || local499.aClass20_Sub2_7.aByte131 == Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131) && local499.method1087(arg0, local137, local148)) {
					@Pc(538) int local538;
					if (local499.aClass20_Sub2_7 instanceof Class20_Sub2_Sub2) {
						local165 = ((Class20_Sub2_Sub2) local499.aClass20_Sub2_7).aShort124;
						local538 = ((Class20_Sub2_Sub2) local499.aClass20_Sub2_7).aShort123;
					} else {
						local165 = local499.aClass20_Sub2_7.anInt10725 >> 9;
						local538 = local499.aClass20_Sub2_7.anInt10729 >> 9;
					}
					@Pc(670) int local670;
					@Pc(682) int local682;
					@Pc(787) int local787;
					@Pc(564) int local564;
					if (local499.aClass20_Sub2_7 instanceof Class20_Sub2_Sub2_Sub1_Sub1) {
						@Pc(560) Class20_Sub2_Sub2_Sub1_Sub1 local560 = (Class20_Sub2_Sub2_Sub1_Sub1) local499.aClass20_Sub2_7;
						local564 = local560.method4913();
						if ((local564 & 0x1) == 0 && (local560.anInt10725 & 0x1FF) == 0 && (local560.anInt10729 & 0x1FF) == 0 || (local564 & 0x1) == 1 && (local560.anInt10725 & 0x1FF) == 256 && (local560.anInt10729 & 0x1FF) == 256) {
							local274 = local560.anInt10725 - (local560.method4913() - 1 << 8);
							local283 = local560.anInt10729 - (local560.method4913() - 1 << 8);
							for (local294 = 0; local294 < Static252.anInt5066; local294++) {
								@Pc(645) Class6_Sub46 local645 = (Class6_Sub46) Static347.aClass128_23.method3560((long) Static483.anIntArray525[local294]);
								if (local645 != null) {
									@Pc(650) Class20_Sub2_Sub2_Sub1_Sub2 local650 = local645.aClass20_Sub2_Sub2_Sub1_Sub2_1;
									if (local650.anInt5556 != Static113.anInt2243 && local650.aBoolean377) {
										local670 = local650.anInt10725 - (local650.aClass247_1.anInt7681 - 1 << 8);
										local682 = local650.anInt10729 - (local650.aClass247_1.anInt7681 - 1 << 8);
										if (local670 >= local274 && local650.aClass247_1.anInt7681 <= local560.method4913() - (local670 - local274 >> 9) && local283 <= local682 && local650.aClass247_1.anInt7681 <= local560.method4913() - (local682 - local283 >> 9)) {
											Static304.method5160(local650, local499.aClass20_Sub2_7.aByte131 != Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131);
											local650.anInt5556 = Static113.anInt2243;
										}
									}
								}
							}
							local305 = Static530.anInt8592;
							@Pc(748) int[] local748 = Static551.anIntArray576;
							for (local670 = 0; local670 < local305; local670++) {
								@Pc(758) Class20_Sub2_Sub2_Sub1_Sub1 local758 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local748[local670]];
								if (local758 != null && local758.anInt5556 != Static113.anInt2243 && local560 != local758 && local758.aBoolean377) {
									local787 = local758.anInt10725 - (local758.method4913() - 1 << 8);
									@Pc(799) int local799 = local758.anInt10729 - (local758.method4913() - 1 << 8);
									if (local274 <= local787 && local758.method4913() <= local560.method4913() - (local787 - local274 >> 9) && local283 <= local799 && local758.method4913() <= local560.method4913() - (local799 - local283 >> 9)) {
										Static125.method9041(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 != local499.aClass20_Sub2_7.aByte131, local758);
										local758.anInt5556 = Static113.anInt2243;
									}
								}
							}
						}
						if (local560.anInt5556 == Static113.anInt2243) {
							continue;
						}
						Static125.method9041(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 != local499.aClass20_Sub2_7.aByte131, local560);
						local560.anInt5556 = Static113.anInt2243;
					}
					if (local499.aClass20_Sub2_7 instanceof Class20_Sub2_Sub2_Sub1_Sub2) {
						@Pc(879) Class20_Sub2_Sub2_Sub1_Sub2 local879 = (Class20_Sub2_Sub2_Sub1_Sub2) local499.aClass20_Sub2_7;
						if (local879.aClass247_1 != null) {
							if ((local879.aClass247_1.anInt7681 & 0x1) == 0 && (local879.anInt10725 & 0x1FF) == 0 && (local879.anInt10729 & 0x1FF) == 0 || (local879.aClass247_1.anInt7681 & 0x1) == 1 && (local879.anInt10725 & 0x1FF) == 256 && (local879.anInt10729 & 0x1FF) == 256) {
								local564 = local879.anInt10725 - (local879.aClass247_1.anInt7681 - 1 << 8);
								local274 = local879.anInt10729 - (local879.aClass247_1.anInt7681 - 1 << 8);
								for (local283 = 0; local283 < Static252.anInt5066; local283++) {
									@Pc(957) Class6_Sub46 local957 = (Class6_Sub46) Static347.aClass128_23.method3560((long) Static483.anIntArray525[local283]);
									if (local957 != null) {
										@Pc(962) Class20_Sub2_Sub2_Sub1_Sub2 local962 = local957.aClass20_Sub2_Sub2_Sub1_Sub2_1;
										if (local962.anInt5556 != Static113.anInt2243 && local962 != local879 && local962.aBoolean377) {
											local352 = local962.anInt10725 - (local962.aClass247_1.anInt7681 - 1 << 8);
											local670 = local962.anInt10729 - (local962.aClass247_1.anInt7681 - 1 << 8);
											if (local352 >= local564 && local962.aClass247_1.anInt7681 <= local879.aClass247_1.anInt7681 - (local352 - local564 >> 9) && local670 >= local274 && local962.aClass247_1.anInt7681 <= local879.aClass247_1.anInt7681 - (local670 - local274 >> 9)) {
												Static304.method5160(local962, local499.aClass20_Sub2_7.aByte131 != Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131);
												local962.anInt5556 = Static113.anInt2243;
											}
										}
									}
								}
								local294 = Static530.anInt8592;
								@Pc(1072) int[] local1072 = Static551.anIntArray576;
								for (local352 = 0; local352 < local294; local352++) {
									@Pc(1082) Class20_Sub2_Sub2_Sub1_Sub1 local1082 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local1072[local352]];
									if (local1082 != null && Static113.anInt2243 != local1082.anInt5556 && local1082.aBoolean377) {
										local682 = local1082.anInt10725 - (local1082.method4913() - 1 << 8);
										local787 = local1082.anInt10729 - (local1082.method4913() - 1 << 8);
										if (local564 <= local682 && local1082.method4913() <= local879.aClass247_1.anInt7681 - (local682 - local564 >> 9) && local787 >= local274 && local1082.method4913() <= local879.aClass247_1.anInt7681 - (local787 - local274 >> 9)) {
											Static125.method9041(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 != local499.aClass20_Sub2_7.aByte131, local1082);
											local1082.anInt5556 = Static113.anInt2243;
										}
									}
								}
							}
							if (Static113.anInt2243 == local879.anInt5556) {
								continue;
							}
							Static304.method5160(local879, local499.aClass20_Sub2_7.aByte131 != Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131);
							local879.anInt5556 = Static113.anInt2243;
						}
					}
					if (local499.aClass20_Sub2_7 instanceof Class20_Sub2_Sub4_Sub1) {
						@Pc(1210) int local1210 = Static606.anInt8651 + local165;
						local564 = Static195.anInt3961 + local538;
						@Pc(1231) Class6_Sub41 local1231 = (Class6_Sub41) Static333.aClass128_46.method3560((long) (local1210 | local564 << 14 | local499.aClass20_Sub2_7.aByte131 << 28));
						if (local1231 != null) {
							local283 = 0;
							@Pc(1241) Class6_Sub14 local1241 = (Class6_Sub14) local1231.aClass8_57.method159();
							while (local1241 != null) {
								@Pc(1249) Class347 local1249 = Static266.aClass138_1.method3730(local1241.anInt2255);
								if (Static280.aBoolean380 && local499.aClass20_Sub2_7.aByte131 == Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131) {
									@Pc(1267) Class223 local1267 = Static541.anInt8105 == -1 ? null : Static26.aClass179_1.method5148(Static541.anInt8105);
									if ((Static543.anInt9347 & 0x1) != 0 && (local1267 == null || local1249.method8245(local1267.anInt6887, Static541.anInt8105) != local1267.anInt6887)) {
										Static542.method7932(Static173.aString38, local165, false, (long) local1241.anInt2255, Static1.anInt8260, false, -1, 2, local538, true, (long) local283, Static391.aString87 + " -> <col=ff9040>" + local1249.aString109);
									}
								}
								if (local499.aClass20_Sub2_7.aByte131 == Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131) {
									@Pc(1322) String[] local1322 = local1249.aStringArray70;
									for (local670 = 4; local670 >= 0; local670--) {
										if (local1322 != null && local1322[local670] != null) {
											@Pc(1334) byte local1334 = 0;
											if (local670 == 0) {
												local1334 = 51;
											}
											local787 = Static8.anInt150;
											if (local670 == 1) {
												local1334 = 23;
											}
											if (local670 == 2) {
												local1334 = 45;
											}
											if (local670 == 3) {
												local1334 = 49;
											}
											if (local670 == 4) {
												local1334 = 57;
											}
											if (local670 == local1249.anInt9748) {
												local787 = local1249.anInt9716;
											}
											if (local670 == local1249.anInt9744) {
												local787 = local1249.anInt9751;
											}
											Static542.method7932(local1322[local670], local165, false, (long) local1241.anInt2255, local787, false, -1, local1334, local538, true, (long) local283, "<col=ff9040>" + local1249.aString109);
										}
									}
								}
								Static542.method7932(Static317.aClass192_22.method5299(Static307.anInt5931), local165, local499.aClass20_Sub2_7.aByte131 != Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131, (long) local1241.anInt2255, Static140.anInt2652, false, -1, 1001, local538, true, (long) local283, "<col=ff9040>" + local1249.aString109);
								local1241 = (Class6_Sub14) local1231.aClass8_57.method148();
								local283++;
							}
						}
					}
					if (local499.aClass20_Sub2_7 instanceof Interface12) {
						@Pc(1475) Interface12 local1475 = (Interface12) local499.aClass20_Sub2_7;
						@Pc(1482) Class312 local1482 = Static283.aClass210_2.method5629(local1475.method9026());
						if (local1482.anIntArray565 != null) {
							local1482 = local1482.method7866(Static279.aClass294_1);
						}
						if (local1482 != null) {
							if (Static280.aBoolean380 && local499.aClass20_Sub2_7.aByte131 == Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131) {
								@Pc(1514) Class223 local1514 = Static541.anInt8105 == -1 ? null : Static26.aClass179_1.method5148(Static541.anInt8105);
								if ((Static543.anInt9347 & 0x4) != 0 && (local1514 == null || local1482.method7858(local1514.anInt6887, Static541.anInt8105) != local1514.anInt6887)) {
									Static542.method7932(Static173.aString38, local165, false, Static311.method5224(local165, local538, local1475), Static1.anInt8260, false, -1, 4, local538, true, (long) local1475.hashCode(), Static391.aString87 + " -> <col=00ffff>" + local1482.aString108);
								}
							}
							if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 == local499.aClass20_Sub2_7.aByte131) {
								@Pc(1579) String[] local1579 = local1482.aStringArray65;
								if (local1579 != null) {
									for (local283 = 4; local283 >= 0; local283--) {
										if (local1579[local283] != null) {
											@Pc(1591) short local1591 = 0;
											if (local283 == 0) {
												local1591 = 10;
											}
											local305 = Static8.anInt150;
											if (local283 == 1) {
												local1591 = 8;
											}
											if (local283 == 2) {
												local1591 = 18;
											}
											if (local283 == 3) {
												local1591 = 3;
											}
											if (local1482.anInt9224 == local283) {
												local305 = local1482.anInt9221;
											}
											if (local283 == 4) {
												local1591 = 1011;
											}
											if (local1482.anInt9236 == local283) {
												local305 = local1482.anInt9230;
											}
											Static542.method7932(local1579[local283], local165, false, Static311.method5224(local165, local538, local1475), local305, false, -1, local1591, local538, true, (long) local1475.hashCode(), "<col=00ffff>" + local1482.aString108);
										}
									}
								}
								Static542.method7932(Static317.aClass192_22.method5299(Static307.anInt5931), local165, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 != local499.aClass20_Sub2_7.aByte131, (long) local1482.anInt9241, Static140.anInt2652, false, -1, 1008, local538, true, (long) local1475.hashCode(), "<col=00ffff>" + local1482.aString108);
							}
						}
					}
				}
			}
			if (Static389.aBoolean497) {
				Static633.method8933();
			}
		}
		Static263.method4676(false);
	}
}
