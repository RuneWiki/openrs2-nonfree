import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString99;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBIII)V")
	public static void method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static414.method5547(arg4, Static257.anInt4068, Static67.anInt1214);
		@Pc(17) int local17 = Static414.method5547(arg0, Static257.anInt4068, Static67.anInt1214);
		@Pc(23) int local23 = Static414.method5547(arg1, Static379.anInt5914, Static624.anInt10032);
		@Pc(29) int local29 = Static414.method5547(arg3, Static379.anInt5914, Static624.anInt10032);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static134.method1841(Static543.anIntArrayArray57[local31], local23, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!nt;IIIIIIIIIB)Z")
	public static boolean method7174(@OriginalArg(0) Class240 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(17) int local17 = arg3;
		@Pc(19) int local19 = arg1;
		@Pc(28) int local28 = arg3 - 64;
		Static283.anIntArrayArray46[64][64] = 99;
		@Pc(39) int local39 = arg1 - 64;
		Static283.anIntArrayArray47[64][64] = 0;
		@Pc(47) byte local47 = 0;
		Static314.anIntArray343[0] = arg3;
		@Pc(53) int local53 = 0;
		@Pc(56) int local56 = local47 + 1;
		Static493.anIntArray569[0] = arg1;
		@Pc(61) int[][] local61 = arg0.anIntArrayArray40;
		while (local53 != local56) {
			local19 = Static493.anIntArray569[local53];
			local17 = Static314.anIntArray343[local53];
			@Pc(76) int local76 = local17 - local28;
			@Pc(81) int local81 = local19 - local39;
			local53 = local53 + 1 & 0xFFF;
			@Pc(93) int local93 = local17 - arg0.anInt6066;
			@Pc(99) int local99 = local19 - arg0.anInt6073;
			if (arg9 == -4) {
				if (arg8 == local17 && arg7 == local19) {
					Static350.anInt5488 = local19;
					Static395.anInt6217 = local17;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static155.method2316(local19, 2, local17, arg7, 2, arg4, arg5, arg8)) {
					Static350.anInt5488 = local19;
					Static395.anInt6217 = local17;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg0.method5177(local19, arg4, arg7, arg5, 2, local17, arg8, arg6, 2)) {
					Static350.anInt5488 = local19;
					Static395.anInt6217 = local17;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg0.method5185(2, local19, arg6, local17, arg8, arg5, arg4, arg7)) {
					Static395.anInt6217 = local17;
					Static350.anInt5488 = local19;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg0.method5175(arg9, 2, local17, local19, arg7, arg2, arg8)) {
					Static395.anInt6217 = local17;
					Static350.anInt5488 = local19;
					return true;
				}
			} else if (arg0.method5189(arg8, arg7, local17, arg9, local19, 2, arg2)) {
				Static350.anInt5488 = local19;
				Static395.anInt6217 = local17;
				return true;
			}
			@Pc(245) int local245 = Static283.anIntArrayArray47[local76][local81] + 1;
			if (local76 > 0 && Static283.anIntArrayArray46[local76 - 1][local81] == 0 && (local61[local93 - 1][local99] & 0x43A40000) == 0 && (local61[local93 - 1][local99 + 1] & 0x4E240000) == 0) {
				Static314.anIntArray343[local56] = local17 - 1;
				Static493.anIntArray569[local56] = local19;
				local56 = local56 + 1 & 0xFFF;
				Static283.anIntArrayArray46[local76 - 1][local81] = 2;
				Static283.anIntArrayArray47[local76 - 1][local81] = local245;
			}
			if (local76 < 126 && Static283.anIntArrayArray46[local76 + 1][local81] == 0 && (local61[local93 + 2][local99] & 0x60E40000) == 0 && (local61[local93 + 2][local99 + 1] & 0x78240000) == 0) {
				Static314.anIntArray343[local56] = local17 + 1;
				Static493.anIntArray569[local56] = local19;
				Static283.anIntArrayArray46[local76 + 1][local81] = 8;
				local56 = local56 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local76 + 1][local81] = local245;
			}
			if (local81 > 0 && Static283.anIntArrayArray46[local76][local81 - 1] == 0 && (local61[local93][local99 - 1] & 0x43A40000) == 0 && (local61[local93 + 1][local99 - 1] & 0x60E40000) == 0) {
				Static314.anIntArray343[local56] = local17;
				Static493.anIntArray569[local56] = local19 - 1;
				Static283.anIntArrayArray46[local76][local81 - 1] = 1;
				local56 = local56 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local76][local81 - 1] = local245;
			}
			if (local81 < 126 && Static283.anIntArrayArray46[local76][local81 + 1] == 0 && (local61[local93][local99 + 2] & 0x4E240000) == 0 && (local61[local93 + 1][local99 + 2] & 0x78240000) == 0) {
				Static314.anIntArray343[local56] = local17;
				Static493.anIntArray569[local56] = local19 + 1;
				Static283.anIntArrayArray46[local76][local81 + 1] = 4;
				local56 = local56 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local76][local81 + 1] = local245;
			}
			if (local76 > 0 && local81 > 0 && Static283.anIntArrayArray46[local76 - 1][local81 - 1] == 0 && (local61[local93 - 1][local99] & 0x4FA40000) == 0 && (local61[local93 - 1][local99 - 1] & 0x43A40000) == 0 && (local61[local93][local99 - 1] & 0x63E40000) == 0) {
				Static314.anIntArray343[local56] = local17 - 1;
				Static493.anIntArray569[local56] = local19 - 1;
				Static283.anIntArrayArray46[local76 - 1][local81 - 1] = 3;
				local56 = local56 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local76 - 1][local81 - 1] = local245;
			}
			if (local76 < 126 && local81 > 0 && Static283.anIntArrayArray46[local76 + 1][local81 - 1] == 0 && (local61[local93 + 1][local99 - 1] & 0x63E40000) == 0 && (local61[local93 + 2][local99 - 1] & 0x60E40000) == 0 && (local61[local93 + 2][local99] & 0x78E40000) == 0) {
				Static314.anIntArray343[local56] = local17 + 1;
				Static493.anIntArray569[local56] = local19 - 1;
				Static283.anIntArrayArray46[local76 + 1][local81 - 1] = 9;
				local56 = local56 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local76 + 1][local81 - 1] = local245;
			}
			if (local76 > 0 && local81 < 126 && Static283.anIntArrayArray46[local76 - 1][local81 + 1] == 0 && (local61[local93 - 1][local99 + 1] & 0x4FA40000) == 0 && (local61[local93 - 1][local99 + 2] & 0x4E240000) == 0 && (local61[local93][local99 + 2] & 0x7E240000) == 0) {
				Static314.anIntArray343[local56] = local17 - 1;
				Static493.anIntArray569[local56] = local19 + 1;
				Static283.anIntArrayArray46[local76 - 1][local81 + 1] = 6;
				local56 = local56 + 1 & 0xFFF;
				Static283.anIntArrayArray47[local76 - 1][local81 + 1] = local245;
			}
			if (local76 < 126 && local81 < 126 && Static283.anIntArrayArray46[local76 + 1][local81 + 1] == 0 && (local61[local93 + 1][local99 + 2] & 0x7E240000) == 0 && (local61[local93 + 2][local99 + 2] & 0x78240000) == 0 && (local61[local93 + 2][local99 + 1] & 0x78E40000) == 0) {
				Static314.anIntArray343[local56] = local17 + 1;
				Static493.anIntArray569[local56] = local19 + 1;
				local56 = local56 + 1 & 0xFFF;
				Static283.anIntArrayArray46[local76 + 1][local81 + 1] = 12;
				Static283.anIntArrayArray47[local76 + 1][local81 + 1] = local245;
			}
		}
		Static395.anInt6217 = local17;
		Static350.anInt5488 = local19;
		return false;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!ha;I)Z")
	public static boolean method7175(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1) {
		@Pc(11) int local11 = (Static228.anInt3704 - 104) / 2;
		@Pc(17) int local17 = (Static162.anInt2911 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static76.method1081(local29, local21, local25, arg0)) {
						local40 = local29;
						if (Static181.method2642(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static412.method5530(local25, local21, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(88) int[] local88 = new int[262144];
		for (local29 = 0; local29 < local88.length; local29++) {
			local88[local29] = -16777216;
		}
		Static533.aClass61_29 = arg1.method6953(local88, 512, 512, 512);
		Static489.method1464();
		local40 = ((int) (Math.random() * 20.0D) + 228 << 8) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(163) int local163 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xC05FF00) << 16;
		@Pc(182) int local182 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(194) boolean[][] local194 = new boolean[Static138.anInt2422 + 1 + 2][Static138.anInt2422 + 1 + 2];
		@Pc(200) int local200;
		@Pc(204) int local204;
		@Pc(206) int local206;
		@Pc(208) int local208;
		@Pc(217) int local217;
		@Pc(227) int local227;
		@Pc(237) int local237;
		@Pc(263) int local263;
		@Pc(267) int local267;
		@Pc(320) int local320;
		@Pc(327) int local327;
		@Pc(331) int local331;
		@Pc(352) int local352;
		for (@Pc(196) int local196 = local11; local196 < local11 + 104; local196 += Static138.anInt2422) {
			for (local200 = local17; local200 < local17 + 104; local200 += Static138.anInt2422) {
				local204 = 0;
				local206 = 0;
				local208 = local196;
				if (local196 > 0) {
					local204 += 4;
					local208 = local196 - 1;
				}
				local217 = local200;
				if (local200 > 0) {
					local217 = local200 - 1;
				}
				local227 = Static138.anInt2422 + local196;
				if (local227 < 104) {
					local227++;
				}
				local237 = Static138.anInt2422 + local200;
				if (local237 < 104) {
					local206 += 4;
					local237++;
				}
				arg1.KA(0, 0, Static138.anInt2422 * 4 + local204, Static138.anInt2422 * 4 + local206);
				arg1.GA(-16777216);
				@Pc(271) int local271;
				for (local263 = arg0; local263 <= 3; local263++) {
					for (local267 = 0; local267 <= Static138.anInt2422; local267++) {
						for (local271 = 0; local271 <= Static138.anInt2422; local271++) {
							local194[local267][local271] = Static76.method1081(local263, local267 + local208, local271 + local217, arg0);
						}
					}
					Static462.aClass76Array3[local263].method7391(local208, local217, local227, local237, local194);
					if (!Static491.aBoolean605) {
						for (local271 = -4; local271 < Static138.anInt2422; local271++) {
							for (local320 = -4; local320 < Static138.anInt2422; local320++) {
								local327 = local196 + local271;
								local331 = local200 + local320;
								if (local327 >= local11 && local331 >= local17 && Static76.method1081(local263, local327, local331, arg0)) {
									local352 = local263;
									if (Static181.method2642(local331, local327)) {
										local352 = local263 - 1;
									}
									if (local352 >= 0) {
										Static518.method7245(local163, local331, local204 + local271 * 4, arg1, local327, local40, local352, (Static138.anInt2422 - local320) * 4 + local206 - 4);
									}
								}
							}
						}
					}
				}
				if (Static491.aBoolean605) {
					@Pc(401) Class240 local401 = Static230.aClass240Array1[arg0];
					for (local271 = 0; local271 < Static138.anInt2422; local271++) {
						for (local320 = 0; local320 < Static138.anInt2422; local320++) {
							local327 = local196 + local271;
							local331 = local200 + local320;
							local352 = local401.anIntArrayArray40[local327 - local401.anInt6066][local331 - local401.anInt6073];
							if ((local352 & 0x40240000) != 0) {
								arg1.method6936(4, 4, local204 + local271 * 4, -1713569622, local206 + (Static138.anInt2422 - local320) * 4 - 4);
							} else if ((local352 & 0x800000) != 0) {
								arg1.method6990((Static138.anInt2422 - local320) * 4 + local206 - 4, -1713569622, local204 + local271 * 4, 4);
							} else if ((local352 & 0x2000000) != 0) {
								arg1.method6965(local204 + local271 * 4 + 3, -1713569622, 4, (Static138.anInt2422 - local320) * 4 + local206 - 4);
							} else if ((local352 & 0x8000000) != 0) {
								arg1.method6990(local206 + (Static138.anInt2422 - local320) * 4 + 3 - 4, -1713569622, local204 + local271 * 4, 4);
							} else if ((local352 & 0x20000000) != 0) {
								arg1.method6965(local271 * 4 + local204, -1713569622, 4, local206 + (Static138.anInt2422 - local320) * 4 - 4);
							}
						}
					}
				}
				arg1.aa(local204, local206, Static138.anInt2422 * 4, Static138.anInt2422 * 4, local182, 2);
				Static533.aClass61_29.method6448((local196 - local11) * 4 + 48, -((local200 - local17) * 4) + 464 - Static138.anInt2422 * 4, Static138.anInt2422 * 4, Static138.anInt2422 * 4, local204, local206);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static32.method574();
		Static633.anInt10151 = 0;
		Static465.aClass109_48.method2329();
		if (!Static491.aBoolean605) {
			for (local200 = local11; local200 < local11 + 104; local200++) {
				for (local204 = local17; local204 < local17 + 104; local204++) {
					for (local206 = arg0; local206 <= arg0 + 1 && local206 <= 3; local206++) {
						if (Static76.method1081(local206, local200, local204, arg0)) {
							@Pc(691) Interface25 local691 = (Interface25) Static629.method8438(local206, local200, local204);
							if (local691 == null) {
								local691 = (Interface25) Static245.method3380(local206, local200, local204, vea.class);
							}
							if (local691 == null) {
								local691 = (Interface25) Static166.method1427(local206, local200, local204);
							}
							if (local691 == null) {
								local691 = (Interface25) Static330.method5563(local206, local200, local204);
							}
							if (local691 != null) {
								@Pc(732) Class191 local732 = Static319.aClass141_4.method2971(local691.method8425());
								if (!local732.aBoolean342 || Static570.aBoolean690) {
									local227 = local732.anInt4777;
									if (local732.anIntArray323 != null) {
										for (local237 = 0; local237 < local732.anIntArray323.length; local237++) {
											if (local732.anIntArray323[local237] != -1) {
												@Pc(761) Class191 local761 = Static319.aClass141_4.method2971(local732.anIntArray323[local237]);
												if (local761.anInt4777 >= 0) {
													local227 = local761.anInt4777;
												}
											}
										}
									}
									if (local227 >= 0) {
										@Pc(787) boolean local787 = false;
										if (local227 >= 0) {
											@Pc(797) Class172 local797 = Static599.aClass197_4.method4161(local227);
											if (local797 != null && local797.aBoolean297) {
												local787 = true;
											}
										}
										local263 = local200;
										local267 = local204;
										if (local787) {
											@Pc(815) int[][] local815 = Static230.aClass240Array1[local206].anIntArrayArray40;
											local320 = Static230.aClass240Array1[local206].anInt6066;
											local327 = Static230.aClass240Array1[local206].anInt6073;
											for (local331 = 0; local331 < 10; local331++) {
												local352 = (int) (Math.random() * 4.0D);
												if (local352 == 0 && local11 < local263 && local263 > local200 - 3 && (local815[local263 - local320 - 1][local267 - local327] & 0x2C0108) == 0) {
													local263--;
												}
												if (local352 == 1 && local263 < local11 + 104 - 1 && local263 < local200 + 3 && (local815[local263 + 1 - local320][local267 - local327] & 0x2C0180) == 0) {
													local263++;
												}
												if (local352 == 2 && local267 > local17 && local267 > local204 - 3 && (local815[local263 - local320][local267 - local327 - 1] & 0x2C0102) == 0) {
													local267--;
												}
												if (local352 == 3 && local17 + 104 - 1 > local267 && local204 + 3 > local267 && (local815[local263 - local320][local267 + 1 - local327] & 0x2C0120) == 0) {
													local267++;
												}
											}
										}
										Static387.anIntArray446[Static633.anInt10151] = local732.anInt4815;
										Static160.anIntArray193[Static633.anInt10151] = local263;
										Static447.anIntArray591[Static633.anInt10151] = local267;
										Static633.anInt10151++;
									}
								}
							}
						}
					}
				}
			}
			if (Static146.aClass84_3 != null) {
				Static576.aClass380_128.anInt10336 = 1;
				Static599.aClass197_4.method4165(1024, 64);
				for (local204 = 0; local204 < Static146.aClass84_3.anInt2183; local204++) {
					local206 = Static146.aClass84_3.anIntArray156[local204];
					if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 == local206 >> 28) {
						local208 = (local206 >> 14 & 0x3FFF) - Static132.anInt2246;
						local217 = (local206 & 0x3FFF) - Static123.anInt2176;
						if (local208 >= 0 && Static228.anInt3704 > local208 && local217 >= 0 && local217 < Static162.anInt2911) {
							Static465.aClass109_48.method2323(new Class2_Sub30(local204));
						} else {
							@Pc(1092) Class172 local1092 = Static599.aClass197_4.method4161(Static146.aClass84_3.anIntArray157[local204]);
							if (local1092.anIntArray286 != null && local208 + local1092.anInt4322 >= 0 && local1092.anInt4349 + local208 < Static228.anInt3704 && local1092.anInt4336 + local217 >= 0 && Static162.anInt2911 > local1092.anInt4341 + local217) {
								Static465.aClass109_48.method2323(new Class2_Sub30(local204));
							}
						}
					}
				}
				Static599.aClass197_4.method4165(128, 64);
				Static576.aClass380_128.anInt10336 = 2;
				Static576.aClass380_128.method8626();
			}
		}
		return true;
	}
}
