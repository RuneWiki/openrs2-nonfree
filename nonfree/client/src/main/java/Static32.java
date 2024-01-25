import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
	public static int anInt624;

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "[S")
	public static short[] aShortArray5;

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "Lclient!vh;")
	public static Class250 aClass250_7;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_11 = new Class84("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "Lclient!qo;")
	public static final Class190 aClass190_2 = new Class190("", 12);

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[100];

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "J")
	public static long aLong21 = -1L;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!kj;Ljava/awt/Frame;)V")
	public static void method552(@OriginalArg(1) Class138 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(11) Class100 local11 = arg0.method3206(arg1);
			while (local11.anInt2365 == 0) {
				Static67.method1189(10L);
			}
			if (local11.anInt2365 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static67.method1189(100L);
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
	public static void method556() {
		if (Static398.anInt6924 > 0) {
			Static234.method3459();
		} else {
			Static190.aClass161_2 = Static372.aClass161_6;
			Static372.aClass161_6 = null;
			Static455.method4431(40);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!qa;III)V")
	public static void method557(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static74.anInt1469 == 0 || Static397.anInt6903 == 0) {
			return;
		}
		arg0.GA(Static120.anInt2113, Static171.anInt3155, Static74.anInt1469, Static397.anInt6903);
		arg0.pa(Static294.anInt5923, Static408.anInt7059, Static74.anInt1469, Static397.anInt6903);
		@Pc(29) Class18 local29 = arg0.method4715();
		local29.Q(Static45.anInt842, Static309.anInt2245, Static404.anInt6988, Static237.anInt4246, Static167.anInt3121, Static204.anInt3742);
		arg0.m(local29);
		@Pc(57) int local57;
		@Pc(66) int local66;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(87) int local87;
		@Pc(102) int[] local102;
		@Pc(134) int local134;
		@Pc(142) int local142;
		if (Static328.aClass136Array3 != null) {
			@Pc(44) int local44 = -1;
			@Pc(46) int local46 = -1;
			@Pc(49) int local49 = arg0.d();
			local57 = (arg1 - Static120.anInt2113) * local49 / Static74.anInt1469;
			local66 = local49 * (arg2 - Static171.anInt3155) / Static397.anInt6903;
			local69 = arg0.W();
			local78 = local69 * (arg1 - Static120.anInt2113) / Static74.anInt1469;
			local87 = (arg2 - Static171.anInt3155) * local69 / Static397.anInt6903;
			local102 = new int[] { local57, local66, local49 };
			local29.X(local102);
			@Pc(120) int[] local120 = new int[] { local78, local87, local69 };
			local29.X(local120);
			@Pc(125) float local125 = 0.0F;
			local134 = local120[0] - local102[0];
			local142 = local120[1] - local102[1];
			@Pc(151) int local151 = local120[2] - local102[2];
			while (local125 < 1.0F) {
				@Pc(164) int local164 = (int) (local125 * (float) local134 + (float) local102[0]);
				@Pc(168) int local168 = local164 >> 7;
				@Pc(179) int local179 = (int) ((float) local102[2] + local125 * (float) local151);
				@Pc(183) int local183 = local179 >> 7;
				if (local168 > 0 && local183 > 0 && local168 < Static135.anInt2314 && local183 < Static352.anInt6022) {
					@Pc(196) int local196 = Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95;
					if (local196 < 3 && (Static184.aByteArrayArrayArray3[1][local168][local183] & 0x2) != 0) {
						local196++;
					}
					if ((float) Static328.aClass136Array3[local196].va(local164, local179) < (float) local102[1] + local125 * (float) local142) {
						local44 = local164 + (Static196.aClass26_Sub2_Sub2_Sub1_1.method5535() - 1 << 6) >> 7;
						local46 = local179 + (Static196.aClass26_Sub2_Sub2_Sub1_1.method5535() - 1 << 6) >> 7;
						break;
					}
				}
				local125 = (float) ((double) local125 + 0.01D);
			}
			if (local44 != -1 && local46 != -1) {
				if (Static138.aBoolean128 && (Static333.anInt5795 & 0x40) != 0) {
					@Pc(289) Class219 local289 = Static78.method1356(Static107.anInt1974, Static304.anInt5407);
					if (local289 == null) {
						Static82.method1412();
					} else {
						Static423.method5681(local44, local46, 0L, 19, Static370.anInt6307, -1, false, " ->", Static233.aString33, true);
					}
				} else {
					if (Static248.aClass145_2 == Static96.aClass145_1) {
						Static423.method5681(local44, local46, 0L, 49, -1, -1, false, "", Static443.aClass84_102.method1678(Static167.anInt3118), true);
					}
					Static423.method5681(local44, local46, 0L, 8, Static188.anInt3449, -1, false, "", Static273.aString37, true);
				}
			}
		}
		@Pc(345) Class188 local345 = Static146.aClass188_4;
		for (@Pc(355) Class39_Sub4 local355 = (Class39_Sub4) local345.method4534(); local355 != null; local355 = (Class39_Sub4) local345.method4530()) {
			if (Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 == local355.anInt3248 && local355.method2777(arg2, arg1, arg0)) {
				@Pc(491) int local491;
				if (local355.aClass26_1 instanceof Class26_Sub2_Sub2_Sub1) {
					@Pc(381) Class26_Sub2_Sub2_Sub1 local381 = (Class26_Sub2_Sub2_Sub1) local355.aClass26_1;
					local57 = local381.method5535();
					if ((local57 & 0x1) == 0 && (local381.anInt7068 & 0x7F) == 0 && (local381.anInt7065 & 0x7F) == 0 || (local57 & 0x1) == 1 && (local381.anInt7068 & 0x7F) == 64 && (local381.anInt7065 & 0x7F) == 64) {
						local66 = local381.anInt7068 - (local381.method5535() - 1 << 6);
						local69 = local381.anInt7065 - (local381.method5535() - 1 << 6);
						@Pc(503) int local503;
						for (local78 = 0; local78 < Static288.anInt5039; local78++) {
							@Pc(468) Class26_Sub2_Sub2_Sub2 local468 = Static410.aClass26_Sub2_Sub2_Sub2Array1[Static212.anIntArray28[local78]];
							if (local468 != null && local468.anInt7146 != Static403.anInt6978 && local468.aBoolean459) {
								local491 = local468.anInt7068 - (local468.aClass66_1.anInt1717 - 1 << 6);
								local503 = local468.anInt7065 - (local468.aClass66_1.anInt1717 - 1 << 6);
								if (local491 >= local66 && local468.aClass66_1.anInt1717 <= local381.method5535() - (local491 - local66 >> 7) && local69 <= local503 && local468.aClass66_1.anInt1717 <= local381.method5535() - (local503 - local69 >> 7)) {
									Static350.method4847(Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 != local355.anInt3248, local468);
									local468.anInt7146 = Static403.anInt6978;
								}
							}
						}
						local87 = Static187.anInt4913;
						local102 = Static256.anIntArray370;
						for (local503 = 0; local503 < local87; local503++) {
							@Pc(579) Class26_Sub2_Sub2_Sub1 local579 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local102[local503]];
							if (local579 != null && local579.anInt7146 != Static403.anInt6978 && local381 != local579 && local579.aBoolean459) {
								local134 = local579.anInt7068 - (local579.method5535() - 1 << 6);
								local142 = local579.anInt7065 - (local579.method5535() - 1 << 6);
								if (local134 >= local66 && local579.method5535() <= local381.method5535() - (local134 - local66 >> 7) && local69 <= local142 && local579.method5535() <= local381.method5535() - (local142 - local69 >> 7)) {
									Static114.method1702(local355.anInt3248 != Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95, local579);
									local579.anInt7146 = Static403.anInt6978;
								}
							}
						}
					}
					if (local381.anInt7146 == Static403.anInt6978) {
						continue;
					}
					Static114.method1702(Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 != local355.anInt3248, local381);
					local381.anInt7146 = Static403.anInt6978;
				}
				if (local355.aClass26_1 instanceof Class26_Sub2_Sub2_Sub2) {
					@Pc(717) Class26_Sub2_Sub2_Sub2 local717 = (Class26_Sub2_Sub2_Sub2) local355.aClass26_1;
					if (local717.aClass66_1 != null) {
						if ((local717.aClass66_1.anInt1717 & 0x1) == 0 && (local717.anInt7068 & 0x7F) == 0 && (local717.anInt7065 & 0x7F) == 0 || (local717.aClass66_1.anInt1717 & 0x1) == 1 && (local717.anInt7068 & 0x7F) == 64 && (local717.anInt7065 & 0x7F) == 64) {
							local57 = local717.anInt7068 - (local717.aClass66_1.anInt1717 - 1 << 6);
							local66 = local717.anInt7065 - (local717.aClass66_1.anInt1717 - 1 << 6);
							for (local69 = 0; local69 < Static288.anInt5039; local69++) {
								@Pc(791) Class26_Sub2_Sub2_Sub2 local791 = Static410.aClass26_Sub2_Sub2_Sub2Array1[Static212.anIntArray28[local69]];
								if (local791 != null && Static403.anInt6978 != local791.anInt7146 && local717 != local791 && local791.aBoolean459) {
									local87 = local791.anInt7068 - (local791.aClass66_1.anInt1717 - 1 << 6);
									local491 = local791.anInt7065 - (local791.aClass66_1.anInt1717 - 1 << 6);
									if (local57 <= local87 && local791.aClass66_1.anInt1717 <= local717.aClass66_1.anInt1717 - (local87 - local57 >> 7) && local66 <= local491 && local791.aClass66_1.anInt1717 <= local717.aClass66_1.anInt1717 - (local491 - local66 >> 7)) {
										Static350.method4847(Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 != local355.anInt3248, local791);
										local791.anInt7146 = Static403.anInt6978;
									}
								}
							}
							local78 = Static187.anInt4913;
							@Pc(889) int[] local889 = Static256.anIntArray370;
							for (local491 = 0; local491 < local78; local491++) {
								@Pc(899) Class26_Sub2_Sub2_Sub1 local899 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local889[local491]];
								if (local899 != null && Static403.anInt6978 != local899.anInt7146 && local899.aBoolean459) {
									@Pc(925) int local925 = local899.anInt7068 - (local899.method5535() - 1 << 6);
									local134 = local899.anInt7065 - (local899.method5535() - 1 << 6);
									if (local57 <= local925 && local899.method5535() <= local717.aClass66_1.anInt1717 - (local925 - local57 >> 7) && local66 <= local134 && local899.method5535() <= local717.aClass66_1.anInt1717 - (local134 - local66 >> 7)) {
										Static114.method1702(Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 != local355.anInt3248, local899);
										local899.anInt7146 = Static403.anInt6978;
									}
								}
							}
						}
						if (local717.anInt7146 == Static403.anInt6978) {
							continue;
						}
						Static350.method4847(Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 != local355.anInt3248, local717);
						local717.anInt7146 = Static403.anInt6978;
					}
				}
				if (local355.aClass26_1 instanceof Class26_Sub5_Sub1) {
					@Pc(1046) Class1_Sub20 local1046 = (Class1_Sub20) Static184.aClass27_23.method553((long) (local355.anInt3249 | local355.anInt3248 << 28 | local355.anInt3247 << 14));
					if (local1046 != null) {
						for (@Pc(1054) Class1_Sub18 local1054 = (Class1_Sub18) local1046.aClass266_29.method6005(); local1054 != null; local1054 = (Class1_Sub18) local1046.aClass266_29.method6003()) {
							@Pc(1062) Class268 local1062 = Static196.aClass139_1.method3228(local1054.anInt3167);
							if (!Static138.aBoolean128) {
								if (Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 == local355.anInt3248) {
									@Pc(1072) String[] local1072 = local1062.aStringArray55;
									for (local78 = 4; local78 >= 0; local78--) {
										if (local1072 != null && local1072[local78] != null) {
											@Pc(1084) byte local1084 = 0;
											local491 = Static449.anInt7703;
											if (local78 == 0) {
												local1084 = 3;
											}
											if (local78 == 1) {
												local1084 = 45;
											}
											if (local78 == 2) {
												local1084 = 48;
											}
											if (local78 == 3) {
												local1084 = 13;
											}
											if (local78 == 4) {
												local1084 = 59;
											}
											if (local78 == local1062.anInt7756) {
												local491 = local1062.lb;
											}
											if (local1062.anInt7774 == local78) {
												local491 = local1062.anInt7740;
											}
											Static423.method5681(local355.anInt3249, local355.anInt3247, (long) local1054.anInt3167, local1084, local491, -1, false, "<col=ff9040>" + local1062.aString66, local1072[local78], true);
										}
									}
								}
								Static423.method5681(local355.anInt3249, local355.anInt3247, (long) local1054.anInt3167, 1011, Static425.anInt7378, -1, Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 != local355.anInt3248, "<col=ff9040>" + local1062.aString66, Static292.aClass84_63.method1678(Static167.anInt3118), true);
							} else if (Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 == local355.anInt3248) {
								@Pc(1221) Class256 local1221 = Static323.anInt5670 == -1 ? null : Static228.aClass243_2.method5551(Static323.anInt5670);
								if ((Static333.anInt5795 & 0x1) != 0 && (local1221 == null || local1062.method6032(Static323.anInt5670, local1221.anInt7437) != local1221.anInt7437)) {
									Static423.method5681(local355.anInt3249, local355.anInt3247, (long) local1054.anInt3167, 50, Static370.anInt6307, -1, false, Static254.aString36 + " -> <col=ff9040>" + local1062.aString66, Static233.aString33, true);
								}
							}
						}
					}
				}
				if (local355.aClass26_1 instanceof Interface6) {
					@Pc(1282) Interface6 local1282 = (Interface6) local355.aClass26_1;
					@Pc(1289) Class182 local1289 = Static71.aClass105_6.method2336(local1282.method4665());
					if (local1289.anIntArray425 != null) {
						local1289 = local1289.method4388(Static51.aClass79_1);
					}
					if (local1289 != null) {
						if (!Static138.aBoolean128) {
							if (Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 == local355.anInt3248) {
								@Pc(1313) String[] local1313 = local1289.aStringArray42;
								if (local1313 != null) {
									for (local69 = 4; local69 >= 0; local69--) {
										if (local1313[local69] != null) {
											@Pc(1325) short local1325 = 0;
											if (local69 == 0) {
												local1325 = 60;
											}
											local87 = Static449.anInt7703;
											if (local69 == 1) {
												local1325 = 11;
											}
											if (local69 == 2) {
												local1325 = 47;
											}
											if (local69 == 3) {
												local1325 = 58;
											}
											if (local69 == local1289.anInt5472) {
												local87 = local1289.anInt5494;
											}
											if (local69 == 4) {
												local1325 = 1009;
											}
											if (local69 == local1289.anInt5465) {
												local87 = local1289.anInt5488;
											}
											Static423.method5681(local355.anInt3249, local355.anInt3247, Static366.method4338(local1282, local355.anInt3249, local355.anInt3247), local1325, local87, -1, false, "<col=00ffff>" + local1289.aString40, local1313[local69], true);
										}
									}
								}
							}
							Static423.method5681(local355.anInt3249, local355.anInt3247, (long) local1289.anInt5478, 1003, Static425.anInt7378, -1, local355.anInt3248 != Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95, "<col=00ffff>" + local1289.aString40, Static292.aClass84_63.method1678(Static167.anInt3118), true);
						} else if (Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 == local355.anInt3248) {
							@Pc(1468) Class256 local1468 = Static323.anInt5670 == -1 ? null : Static228.aClass243_2.method5551(Static323.anInt5670);
							if ((Static333.anInt5795 & 0x4) != 0 && (local1468 == null || local1289.method4382(Static323.anInt5670, local1468.anInt7437) != local1468.anInt7437)) {
								Static423.method5681(local355.anInt3249, local355.anInt3247, Static366.method4338(local1282, local355.anInt3249, local355.anInt3247), 9, Static370.anInt6307, -1, false, Static254.aString36 + " -> <col=00ffff>" + local1289.aString40, Static233.aString33, true);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = (Static2.aShort1 - Static283.aShort54) * local7 / 100 + Static283.aShort54;
		@Pc(40) int local40 = arg1 * local34 >> 8;
		@Pc(47) int local47 = 16384 - arg5 & 0x3FFF;
		@Pc(53) int local53 = 16384 - arg6 & 0x3FFF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = local40;
		if (local47 != 0) {
			local57 = -local40 * Class4.anIntArray7[local47] >> 15;
			local59 = Class4.anIntArray6[local47] * local40 >> 15;
		}
		if (local53 != 0) {
			local55 = local59 * Class4.anIntArray7[local53] >> 15;
			local59 = local59 * Class4.anIntArray6[local53] >> 15;
		}
		Static254.anInt4567 = arg0 - local57;
		Static454.anInt7852 = 0;
		Static94.anInt1775 = arg6;
		Static402.anInt6941 = arg2 - local59;
		Static306.anInt5497 = arg3 - local55;
		Static239.anInt4284 = arg5;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZIII)V")
	public static void method560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg1, 8);
		local8.method202();
		local8.anInt214 = arg0;
		local8.anInt218 = arg3;
		local8.anInt211 = arg2;
	}
}
