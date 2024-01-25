import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "[I")
	public static int[] anIntArray546;

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "Lclient!ja;")
	public static final Class158 aClass158_12 = new Class158(8, 0, 4, 1);

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILclient!r;II)V")
	public static void method5872(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static543.anInt8522 == 0 || Static490.anInt7978 == 0) {
			return;
		}
		arg1.la(Static465.anInt7651, Static241.anInt4507, Static543.anInt8522, Static490.anInt7978);
		arg1.da(Static574.anInt9173, Static24.anInt579, Static543.anInt8522, Static490.anInt7978);
		@Pc(29) Class109 local29 = arg1.method7160();
		local29.na(Static54.anInt1312, Static494.anInt7897, Static504.anInt8038, Static280.anInt5116, Static27.anInt668, Static410.anInt6921);
		arg1.method7187(local29);
		@Pc(57) int local57;
		@Pc(65) int local65;
		@Pc(73) int local73;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(127) int[] local127;
		@Pc(140) int local140;
		@Pc(149) int local149;
		@Pc(157) int local157;
		@Pc(170) int local170;
		if (Static374.aClass139Array17 != null) {
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			local57 = arg1.BA();
			local65 = (arg0 - Static465.anInt7651) * local57 / Static543.anInt8522;
			local73 = (arg2 - Static241.anInt4507) * local57 / Static490.anInt7978;
			local76 = arg1.U();
			local85 = local76 * (arg0 - Static465.anInt7651) / Static543.anInt8522;
			local94 = local76 * (arg2 - Static241.anInt4507) / Static490.anInt7978;
			@Pc(109) int[] local109 = new int[] { local65, local73, local57 };
			local29.YA(local109);
			local127 = new int[] { local85, local94, local76 };
			local29.YA(local127);
			@Pc(132) float local132 = 0.0F;
			local140 = local127[0] - local109[0];
			local149 = local127[1] - local109[1];
			local157 = local127[2] - local109[2];
			while (local132 < 1.0F) {
				local170 = (int) (local132 * (float) local140 + (float) local109[0]);
				@Pc(174) int local174 = local170 >> 9;
				@Pc(185) int local185 = (int) ((float) local157 * local132 + (float) local109[2]);
				@Pc(189) int local189 = local185 >> 9;
				if (local174 > 0 && local189 > 0 && Static400.anInt6818 > local174 && Static271.anInt5050 > local189) {
					@Pc(205) int local205 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126;
					if (local205 < 3 && (Static154.aByteArrayArrayArray15[1][local174][local189] & 0x2) != 0) {
						local205++;
					}
					if ((float) Static374.aClass139Array17[local205].method6890(local170, local185) < local132 * (float) local149 + (float) local109[1]) {
						local52 = local170 + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.method5569() - 1 << 8) >> 9;
						local54 = local185 + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.method5569() - 1 << 8) >> 9;
						break;
					}
				}
				local132 = (float) ((double) local132 + 0.01D);
			}
			if (local52 != -1 && local54 != -1) {
				if (Static380.aBoolean537 && (Static301.anInt5410 & 0x40) != 0) {
					@Pc(294) Class203 local294 = Static582.method7699(Static550.anInt7639, Static345.anInt6055);
					if (local294 == null) {
						Static103.method2177();
					} else {
						Static577.method3272(51, local54, -1, 0L, Static484.aString107, local52, true, " ->", Static456.anInt8051, false);
					}
				} else {
					if (Static560.aClass211_4 == Static227.aClass211_1) {
						Static577.method3272(58, local54, -1, 0L, Static48.aClass33_29.method797(Static131.anInt2839), local52, true, "", -1, false);
					}
					Static577.method3272(11, local54, -1, 0L, Static185.aString46, local52, true, "", Static332.anInt5938, false);
				}
			}
		}
		@Pc(350) Class309 local350 = Static120.aClass309_5;
		for (@Pc(355) Class9_Sub2 local355 = (Class9_Sub2) local350.method6590(); local355 != null; local355 = (Class9_Sub2) local350.method6594()) {
			if ((Static302.aBoolean635 || local355.aClass9_Sub1_1.aByte126 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126) && local355.method2655(arg1, arg2, arg0)) {
				if (local355.aClass9_Sub1_1 instanceof Class9_Sub1_Sub1) {
					local57 = ((Class9_Sub1_Sub1) local355.aClass9_Sub1_1).aShort112;
					local65 = ((Class9_Sub1_Sub1) local355.aClass9_Sub1_1).aShort115;
				} else {
					local65 = local355.aClass9_Sub1_1.anInt8980 >> 9;
					local57 = local355.aClass9_Sub1_1.anInt8975 >> 9;
				}
				@Pc(482) int local482;
				@Pc(607) int local607;
				if (local355.aClass9_Sub1_1 instanceof Class9_Sub1_Sub1_Sub2_Sub2) {
					@Pc(416) Class9_Sub1_Sub1_Sub2_Sub2 local416 = (Class9_Sub1_Sub1_Sub2_Sub2) local355.aClass9_Sub1_1;
					local76 = local416.method5569();
					if ((local76 & 0x1) == 0 && (local416.anInt8975 & 0x1FF) == 0 && (local416.anInt8980 & 0x1FF) == 0 || (local76 & 0x1) == 1 && (local416.anInt8975 & 0x1FF) == 256 && (local416.anInt8980 & 0x1FF) == 256) {
						local85 = local416.anInt8975 - (local416.method5569() - 1 << 8);
						local94 = local416.anInt8980 - (local416.method5569() - 1 << 8);
						for (local482 = 0; local482 < Static49.anInt1058; local482++) {
							@Pc(493) Class3_Sub39 local493 = (Class3_Sub39) Static243.aClass310_16.method6601((long) Static480.anIntArray603[local482]);
							if (local493 != null) {
								@Pc(498) Class9_Sub1_Sub1_Sub2_Sub1 local498 = local493.aClass9_Sub1_Sub1_Sub2_Sub1_2;
								if (local498.anInt6394 != Static305.anInt5560 && local498.aBoolean527) {
									local140 = local498.anInt8975 - (local498.aClass294_1.anInt7615 - 1 << 8);
									local149 = local498.anInt8980 - (local498.aClass294_1.anInt7615 - 1 << 8);
									if (local85 <= local140 && local498.aClass294_1.anInt7615 <= local416.method5569() - (local140 - local85 >> 9) && local94 <= local149 && local498.aClass294_1.anInt7615 <= local416.method5569() - (local149 - local94 >> 9)) {
										Static585.method7727(local355.aClass9_Sub1_1.aByte126 != Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126, local498);
										local498.anInt6394 = Static305.anInt5560;
									}
								}
							}
						}
						local607 = Static476.anInt8277;
						@Pc(609) int[] local609 = Static10.anIntArray19;
						for (local140 = 0; local140 < local607; local140++) {
							@Pc(619) Class9_Sub1_Sub1_Sub2_Sub2 local619 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local609[local140]];
							if (local619 != null && Static305.anInt5560 != local619.anInt6394 && local619 != local416 && local619.aBoolean527) {
								local157 = local619.anInt8975 - (local619.method5569() - 1 << 8);
								local170 = local619.anInt8980 - (local619.method5569() - 1 << 8);
								if (local85 <= local157 && local619.method5569() <= local416.method5569() - (local157 - local85 >> 9) && local170 >= local94 && local619.method5569() <= local416.method5569() - (local170 - local94 >> 9)) {
									Static78.method2719(local619, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 != local355.aClass9_Sub1_1.aByte126);
									local619.anInt6394 = Static305.anInt5560;
								}
							}
						}
					}
					if (Static305.anInt5560 == local416.anInt6394) {
						continue;
					}
					Static78.method2719(local416, local355.aClass9_Sub1_1.aByte126 != Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126);
					local416.anInt6394 = Static305.anInt5560;
				}
				@Pc(854) int local854;
				if (local355.aClass9_Sub1_1 instanceof Class9_Sub1_Sub1_Sub2_Sub1) {
					@Pc(741) Class9_Sub1_Sub1_Sub2_Sub1 local741 = (Class9_Sub1_Sub1_Sub2_Sub1) local355.aClass9_Sub1_1;
					if (local741.aClass294_1 != null) {
						if ((local741.aClass294_1.anInt7615 & 0x1) == 0 && (local741.anInt8975 & 0x1FF) == 0 && (local741.anInt8980 & 0x1FF) == 0 || (local741.aClass294_1.anInt7615 & 0x1) == 1 && (local741.anInt8975 & 0x1FF) == 256 && (local741.anInt8980 & 0x1FF) == 256) {
							local76 = local741.anInt8975 - (local741.aClass294_1.anInt7615 - 1 << 8);
							local85 = local741.anInt8980 - (local741.aClass294_1.anInt7615 - 1 << 8);
							for (local94 = 0; local94 < Static49.anInt1058; local94++) {
								@Pc(825) Class3_Sub39 local825 = (Class3_Sub39) Static243.aClass310_16.method6601((long) Static480.anIntArray603[local94]);
								if (local825 != null) {
									@Pc(830) Class9_Sub1_Sub1_Sub2_Sub1 local830 = local825.aClass9_Sub1_Sub1_Sub2_Sub1_2;
									if (local830.anInt6394 != Static305.anInt5560 && local741 != local830 && local830.aBoolean527) {
										local854 = local830.anInt8975 - (local830.aClass294_1.anInt7615 - 1 << 8);
										local140 = local830.anInt8980 - (local830.aClass294_1.anInt7615 - 1 << 8);
										if (local854 >= local76 && local741.aClass294_1.anInt7615 - (local854 - local76 >> 9) >= local830.aClass294_1.anInt7615 && local140 >= local85 && local741.aClass294_1.anInt7615 - (local140 - local85 >> 9) >= local830.aClass294_1.anInt7615) {
											Static585.method7727(local355.aClass9_Sub1_1.aByte126 != Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126, local830);
											local830.anInt6394 = Static305.anInt5560;
										}
									}
								}
							}
							local482 = Static476.anInt8277;
							local127 = Static10.anIntArray19;
							for (local854 = 0; local854 < local482; local854++) {
								@Pc(939) Class9_Sub1_Sub1_Sub2_Sub2 local939 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local127[local854]];
								if (local939 != null && local939.anInt6394 != Static305.anInt5560 && local939.aBoolean527) {
									local149 = local939.anInt8975 - (local939.method5569() - 1 << 8);
									local157 = local939.anInt8980 - (local939.method5569() - 1 << 8);
									if (local76 <= local149 && local939.method5569() <= local741.aClass294_1.anInt7615 - (local149 - local76 >> 9) && local85 <= local157 && local939.method5569() <= local741.aClass294_1.anInt7615 - (local157 - local85 >> 9)) {
										Static78.method2719(local939, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 != local355.aClass9_Sub1_1.aByte126);
										local939.anInt6394 = Static305.anInt5560;
									}
								}
							}
						}
						if (local741.anInt6394 == Static305.anInt5560) {
							continue;
						}
						Static585.method7727(local355.aClass9_Sub1_1.aByte126 != Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126, local741);
						local741.anInt6394 = Static305.anInt5560;
					}
				}
				if (local355.aClass9_Sub1_1 instanceof Class9_Sub1_Sub5_Sub1) {
					local73 = local57 + Static529.anInt8344;
					local76 = local65 + Static463.anInt7588;
					@Pc(1083) Class3_Sub46 local1083 = (Class3_Sub46) Static508.aClass310_33.method6601((long) (local73 | local76 << 14 | local355.aClass9_Sub1_1.aByte126 << 28));
					if (local1083 != null) {
						for (@Pc(1091) Class3_Sub35 local1091 = (Class3_Sub35) local1083.aClass130_64.method3540(); local1091 != null; local1091 = (Class3_Sub35) local1083.aClass130_64.method3550()) {
							@Pc(1099) Class339 local1099 = Static517.aClass145_1.method3798(local1091.anInt6129);
							if (Static380.aBoolean537 && local355.aClass9_Sub1_1.aByte126 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126) {
								@Pc(1118) Class14 local1118 = Static472.anInt7697 == -1 ? null : Static69.aClass118_1.method3019(Static472.anInt7697);
								if ((Static301.anInt5410 & 0x1) != 0 && (local1118 == null || local1099.method7305(local1118.anInt534, Static472.anInt7697) != local1118.anInt534)) {
									Static577.method3272(44, local65, -1, (long) local1091.anInt6129, Static484.aString107, local57, true, Static466.aString125 + " -> <col=ff9040>" + local1099.aString120, Static456.anInt8051, false);
								}
							}
							if (local355.aClass9_Sub1_1.aByte126 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126) {
								@Pc(1173) String[] local1173 = local1099.aStringArray45;
								for (local854 = 4; local854 >= 0; local854--) {
									if (local1173 != null && local1173[local854] != null) {
										@Pc(1185) byte local1185 = 0;
										if (local854 == 0) {
											local1185 = 13;
										}
										local149 = Static245.anInt4537;
										if (local854 == 1) {
											local1185 = 15;
										}
										if (local854 == 2) {
											local1185 = 19;
										}
										if (local854 == 3) {
											local1185 = 18;
										}
										if (local854 == local1099.anInt8840) {
											local149 = local1099.anInt8829;
										}
										if (local854 == 4) {
											local1185 = 47;
										}
										if (local1099.anInt8785 == local854) {
											local149 = local1099.anInt8792;
										}
										Static577.method3272(local1185, local65, -1, (long) local1091.anInt6129, local1173[local854], local57, true, "<col=ff9040>" + local1099.aString120, local149, false);
									}
								}
							}
							Static577.method3272(1012, local65, -1, (long) local1091.anInt6129, Static48.aClass33_24.method797(Static131.anInt2839), local57, true, "<col=ff9040>" + local1099.aString120, Static347.anInt6096, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 != local355.aClass9_Sub1_1.aByte126);
						}
					}
				}
				if (local355.aClass9_Sub1_1 instanceof Interface22) {
					@Pc(1318) Interface22 local1318 = (Interface22) local355.aClass9_Sub1_1;
					@Pc(1325) Class23 local1325 = Static476.aClass69_5.method2181(local1318.method7088());
					if (local1325.anIntArray78 != null) {
						local1325 = local1325.method587(Static427.aClass56_1);
					}
					if (local1325 != null) {
						if (Static380.aBoolean537 && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 == local355.aClass9_Sub1_1.aByte126) {
							@Pc(1353) Class14 local1353 = Static472.anInt7697 == -1 ? null : Static69.aClass118_1.method3019(Static472.anInt7697);
							if ((Static301.anInt5410 & 0x4) != 0 && (local1353 == null || local1325.method588(Static472.anInt7697, local1353.anInt534) != local1353.anInt534)) {
								Static577.method3272(6, local65, -1, Static574.method7619(local65, local1318, local57), Static484.aString107, local57, true, Static466.aString125 + " -> <col=00ffff>" + local1325.aString16, Static456.anInt8051, false);
							}
						}
						if (local355.aClass9_Sub1_1.aByte126 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126) {
							@Pc(1414) String[] local1414 = local1325.aStringArray2;
							if (local1414 != null) {
								for (local94 = 4; local94 >= 0; local94--) {
									if (local1414[local94] != null) {
										@Pc(1426) short local1426 = 0;
										local607 = Static245.anInt4537;
										if (local94 == 0) {
											local1426 = 17;
										}
										if (local94 == 1) {
											local1426 = 49;
										}
										if (local94 == 2) {
											local1426 = 3;
										}
										if (local94 == 3) {
											local1426 = 16;
										}
										if (local94 == local1325.anInt751) {
											local607 = local1325.lb;
										}
										if (local94 == 4) {
											local1426 = 1007;
										}
										if (local94 == local1325.anInt750) {
											local607 = local1325.anInt771;
										}
										Static577.method3272(local1426, local65, -1, Static574.method7619(local65, local1318, local57), local1414[local94], local57, true, "<col=00ffff>" + local1325.aString16, local607, false);
									}
								}
							}
						}
						Static577.method3272(1001, local65, -1, (long) local1325.anInt764, Static48.aClass33_24.method797(Static131.anInt2839), local57, true, "<col=00ffff>" + local1325.aString16, Static347.anInt6096, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 != local355.aClass9_Sub1_1.aByte126);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IBIILclient!fh;IIIIIII)Z")
	public static boolean method5874(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg9;
		@Pc(23) int local23 = arg1 - 64;
		Static227.anIntArrayArray33[64][64] = 99;
		@Pc(34) int local34 = arg9 - 64;
		Static594.anIntArrayArray72[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static425.anIntArray560[0] = arg1;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static554.anIntArray652[0] = arg9;
		@Pc(56) int[][] local56 = arg3.anIntArrayArray22;
		while (true) {
			label282: while (true) {
				@Pc(76) int local76;
				@Pc(71) int local71;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(251) int local251;
				@Pc(293) int local293;
				do {
					do {
						do {
							label259: do {
								if (local51 == local48) {
									Static531.anInt8359 = local9;
									Static526.anInt8326 = local7;
									return false;
								}
								local9 = Static554.anIntArray652[local48];
								local7 = Static425.anIntArray560[local48];
								local71 = local9 - local34;
								local76 = local7 - local23;
								local48 = local48 + 1 & 0xFFF;
								local88 = local7 - arg3.anInt3047;
								local94 = local9 - arg3.anInt3057;
								if (arg2 == -4) {
									if (arg0 == local7 && arg8 == local9) {
										Static531.anInt8359 = local9;
										Static526.anInt8326 = local7;
										return true;
									}
								} else if (arg2 == -3) {
									if (Static461.method6384(arg10, arg8, local7, arg6, arg4, arg6, local9, arg0)) {
										Static526.anInt8326 = local7;
										Static531.anInt8359 = local9;
										return true;
									}
								} else if (arg2 == -2) {
									if (arg3.method2727(arg6, arg10, arg8, local9, arg4, arg5, local7, arg6, arg0)) {
										Static531.anInt8359 = local9;
										Static526.anInt8326 = local7;
										return true;
									}
								} else if (arg2 == -1) {
									if (arg3.method2734(arg0, arg5, arg8, arg10, local9, arg6, arg4, local7)) {
										Static526.anInt8326 = local7;
										Static531.anInt8359 = local9;
										return true;
									}
								} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
									if (arg3.method2737(arg0, arg2, arg6, arg8, arg7, local9, local7)) {
										Static531.anInt8359 = local9;
										Static526.anInt8326 = local7;
										return true;
									}
								} else if (arg3.method2735(arg6, arg0, local9, arg2, arg8, arg7, local7)) {
									Static526.anInt8326 = local7;
									Static531.anInt8359 = local9;
									return true;
								}
								local251 = Static594.anIntArrayArray72[local76][local71] + 1;
								if (local76 > 0 && Static227.anIntArrayArray33[local76 - 1][local71] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][arg6 + local94 - 1] & 0x4E240000) == 0) {
									local293 = 1;
									while (true) {
										if (arg6 - 1 <= local293) {
											Static425.anIntArray560[local51] = local7 - 1;
											Static554.anIntArray652[local51] = local9;
											Static227.anIntArrayArray33[local76 - 1][local71] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static594.anIntArrayArray72[local76 - 1][local71] = local251;
											break;
										}
										if ((local56[local88 - 1][local293 + local94] & 0x4FA40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (128 - arg6 > local76 && Static227.anIntArrayArray33[local76 + 1][local71] == 0 && (local56[local88 + arg6][local94] & 0x60E40000) == 0 && (local56[local88 + arg6][arg6 + local94 - 1] & 0x78240000) == 0) {
									local293 = 1;
									while (true) {
										if (local293 >= arg6 - 1) {
											Static425.anIntArray560[local51] = local7 + 1;
											Static554.anIntArray652[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static227.anIntArrayArray33[local76 + 1][local71] = 8;
											Static594.anIntArrayArray72[local76 + 1][local71] = local251;
											break;
										}
										if ((local56[local88 + arg6][local293 + local94] & 0x78E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local71 > 0 && Static227.anIntArrayArray33[local76][local71 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + arg6 - 1][local94 - 1] & 0x60E40000) == 0) {
									local293 = 1;
									while (true) {
										if (arg6 - 1 <= local293) {
											Static425.anIntArray560[local51] = local7;
											Static554.anIntArray652[local51] = local9 - 1;
											Static227.anIntArrayArray33[local76][local71 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static594.anIntArrayArray72[local76][local71 - 1] = local251;
											break;
										}
										if ((local56[local88 + local293][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (128 - arg6 > local71 && Static227.anIntArrayArray33[local76][local71 + 1] == 0 && (local56[local88][local94 + arg6] & 0x4E240000) == 0 && (local56[arg6 + local88 - 1][arg6 + local94] & 0x78240000) == 0) {
									local293 = 1;
									while (true) {
										if (local293 >= arg6 - 1) {
											Static425.anIntArray560[local51] = local7;
											Static554.anIntArray652[local51] = local9 + 1;
											Static227.anIntArrayArray33[local76][local71 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static594.anIntArrayArray72[local76][local71 + 1] = local251;
											break;
										}
										if ((local56[local88 + local293][arg6 + local94] & 0x7E240000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local76 > 0 && local71 > 0 && Static227.anIntArrayArray33[local76 - 1][local71 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local293 = 1;
									while (true) {
										if (local293 >= arg6) {
											Static425.anIntArray560[local51] = local7 - 1;
											Static554.anIntArray652[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static227.anIntArrayArray33[local76 - 1][local71 - 1] = 3;
											Static594.anIntArrayArray72[local76 - 1][local71 - 1] = local251;
											break;
										}
										if ((local56[local88 - 1][local94 + local293 - 1] & 0x4FA40000) != 0 || (local56[local293 + local88 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (128 - arg6 > local76 && local71 > 0 && Static227.anIntArrayArray33[local76 + 1][local71 - 1] == 0 && (local56[local88 + arg6][local94 - 1] & 0x60E40000) == 0) {
									local293 = 1;
									while (true) {
										if (local293 >= arg6) {
											Static425.anIntArray560[local51] = local7 + 1;
											Static554.anIntArray652[local51] = local9 - 1;
											Static227.anIntArrayArray33[local76 + 1][local71 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static594.anIntArrayArray72[local76 + 1][local71 - 1] = local251;
											break;
										}
										if ((local56[local88 + arg6][local293 + local94 - 1] & 0x78E40000) != 0 || (local56[local293 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local293++;
									}
								}
								if (local76 > 0 && 128 - arg6 > local71 && Static227.anIntArrayArray33[local76 - 1][local71 + 1] == 0 && (local56[local88 - 1][arg6 + local94] & 0x4E240000) == 0) {
									for (local293 = 1; local293 < arg6; local293++) {
										if ((local56[local88 - 1][local293 + local94] & 0x4FA40000) != 0 || (local56[local293 + local88 - 1][arg6 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static425.anIntArray560[local51] = local7 - 1;
									Static554.anIntArray652[local51] = local9 + 1;
									Static227.anIntArrayArray33[local76 - 1][local71 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static594.anIntArrayArray72[local76 - 1][local71 + 1] = local251;
								}
							} while (local76 >= 128 - arg6);
						} while (local71 >= 128 - arg6);
					} while (Static227.anIntArrayArray33[local76 + 1][local71 + 1] != 0);
				} while ((local56[arg6 + local88][arg6 + local94] & 0x78240000) != 0);
				for (local293 = 1; local293 < arg6; local293++) {
					if ((local56[local88 + local293][local94 + arg6] & 0x7E240000) != 0 || (local56[arg6 + local88][local293 + local94] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static425.anIntArray560[local51] = local7 + 1;
				Static554.anIntArray652[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local76 + 1][local71 + 1] = 12;
				Static594.anIntArrayArray72[local76 + 1][local71 + 1] = local251;
			}
		}
	}
}
