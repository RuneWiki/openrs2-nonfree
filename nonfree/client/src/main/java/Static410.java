import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	public static int anInt7373;

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array10;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Lclient!jo;")
	public static final Class161 aClass161_8 = new Class161("", 16);

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!or;")
	public static final Class244 aClass244_55 = new Class244();

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "[Lclient!pba;")
	public static final Class25_Sub2_Sub2_Sub5_Sub1[] aClass25_Sub2_Sub2_Sub5_Sub1Array1 = new Class25_Sub2_Sub2_Sub5_Sub1[2048];

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "Lclient!iea;")
	public static Class139 aClass139_1 = new Class139(8);

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_121 = new Class287(45, 8);

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[8];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(FIIFF)F")
	public static float method5760(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static176.aFloatArrayArray2[arg1];
		return arg2 * local7[2] + local7[0] * arg3 + arg0 * local7[1];
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZB)V")
	public static void method5761(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static262.anInt5047++;
			Static515.method6936();
		}
		if (arg0) {
			Static168.anInt3738++;
			Static104.method2175();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public static void method5762() {
		if (Static507.anInt8783 > 1) {
			Static194.anInt4230 = Static523.anInt9188;
			Static507.anInt8783--;
		}
		if (Static116.aBoolean190) {
			Static116.aBoolean190 = false;
			Static318.method4716();
			return;
		}
		if (!Static289.aBoolean370) {
			Static97.method2033();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static256.method3985(); local27++) {
		}
		if (Static409.anInt1461 != 10) {
			return;
		}
		@Pc(51) Class3_Sub10 local51;
		@Pc(60) int local60;
		while (Static112.method2262()) {
			local51 = Static129.method2403(Static452.aClass353_2, Static567.aClass287_90);
			local51.aClass3_Sub26_Sub1_1.method6809(0);
			local60 = local51.aClass3_Sub26_Sub1_1.anInt8703;
			Static67.method1643(local51.aClass3_Sub26_Sub1_1);
			local51.aClass3_Sub26_Sub1_1.method6768(local51.aClass3_Sub26_Sub1_1.anInt8703 - local60);
			Static193.method3398(local51);
		}
		if (Static321.aClass3_Sub28_3 == null) {
			if (Static96.method2000() >= Static207.aLong102) {
				Static321.aClass3_Sub28_3 = Static306.aClass325_1.method7259(Static104.aClass212_1.aString157);
			}
		} else if (Static321.aClass3_Sub28_3.anInt4967 != -1) {
			local51 = Static129.method2403(Static452.aClass353_2, Static127.aClass287_45);
			local51.aClass3_Sub26_Sub1_1.method6769(Static321.aClass3_Sub28_3.anInt4967);
			Static193.method3398(local51);
			Static321.aClass3_Sub28_3 = null;
			Static207.aLong102 = Static96.method2000() + 30000L;
		}
		@Pc(128) Class3_Sub27 local128 = (Class3_Sub27) Static114.aClass244_23.method5572();
		@Pc(145) int local145;
		@Pc(169) int local169;
		@Pc(188) int local188;
		@Pc(238) int local238;
		@Pc(244) int local244;
		@Pc(255) int local255;
		@Pc(143) Class3_Sub10 local143;
		if (local128 != null || Static401.aLong191 < Static96.method2000() - 2000L) {
			local143 = null;
			local145 = 0;
			for (@Pc(150) Class3_Sub27 local150 = (Class3_Sub27) Static389.aClass244_61.method5572(); local150 != null && (local143 == null || local143.aClass3_Sub26_Sub1_1.anInt8703 - local145 < 240); local150 = (Class3_Sub27) Static389.aClass244_61.method5576()) {
				local150.method8128();
				local169 = local150.method5337();
				if (local169 < -1) {
					local169 = -1;
				} else if (local169 > 65534) {
					local169 = 65534;
				}
				local188 = local150.method5338();
				if (local188 < -1) {
					local188 = -1;
				} else if (local188 > 65534) {
					local188 = 65534;
				}
				if (Static293.anInt5490 != local188 || Static339.anInt6118 != local169) {
					if (local143 == null) {
						local143 = Static129.method2403(Static452.aClass353_2, Static34.aClass287_47);
						local143.aClass3_Sub26_Sub1_1.method6809(0);
						local145 = local143.aClass3_Sub26_Sub1_1.anInt8703;
					}
					local238 = local188 - Static293.anInt5490;
					Static293.anInt5490 = local188;
					local244 = local169 - Static339.anInt6118;
					Static339.anInt6118 = local169;
					local255 = (int) ((local150.method5339() - Static401.aLong191) / 20L);
					if (local255 < 8 && local238 >= -32 && local238 <= 31 && local244 >= -32 && local244 <= 31) {
						local244 += 32;
						local238 += 32;
						local143.aClass3_Sub26_Sub1_1.method6769((local238 << 6) + ((local255 << 12) + local244));
					} else if (local255 < 32 && local238 >= -128 && local238 <= 127 && local244 >= -128 && local244 <= 127) {
						local238 += 128;
						local244 += 128;
						local143.aClass3_Sub26_Sub1_1.method6809(local255 + 128);
						local143.aClass3_Sub26_Sub1_1.method6769(local244 + (local238 << 8));
					} else if (local255 >= 32) {
						local143.aClass3_Sub26_Sub1_1.method6769(local255 + 57344);
						if (local188 == 1 || local169 == -1) {
							local143.aClass3_Sub26_Sub1_1.method6826(Integer.MIN_VALUE);
						} else {
							local143.aClass3_Sub26_Sub1_1.method6826(local188 | local169 << 16);
						}
					} else {
						local143.aClass3_Sub26_Sub1_1.method6809(local255 + 192);
						if (local188 == 1 || local169 == -1) {
							local143.aClass3_Sub26_Sub1_1.method6826(Integer.MIN_VALUE);
						} else {
							local143.aClass3_Sub26_Sub1_1.method6826(local188 | local169 << 16);
						}
					}
					Static401.aLong191 = local150.method5339();
				}
			}
			if (local143 != null) {
				local143.aClass3_Sub26_Sub1_1.method6768(local143.aClass3_Sub26_Sub1_1.anInt8703 - local145);
				Static193.method3398(local143);
			}
		}
		@Pc(448) int local448;
		if (local128 != null) {
			@Pc(432) long local432 = (local128.method5339() - Static515.aLong233) / 50L;
			Static515.aLong233 = local128.method5339();
			if (local432 > 32767L) {
				local432 = 32767L;
			}
			local448 = local128.method5337();
			if (local448 < 0) {
				local448 = 0;
			} else if (local448 > 65535) {
				local448 = 65535;
			}
			local169 = local128.method5338();
			if (local169 < 0) {
				local169 = 0;
			} else if (local169 > 65535) {
				local169 = 65535;
			}
			@Pc(478) byte local478 = 0;
			if (local128.method5341() == 2) {
				local478 = 1;
			}
			local238 = (int) local432;
			@Pc(497) Class3_Sub10 local497 = Static129.method2403(Static452.aClass353_2, Static494.aClass287_135);
			local497.aClass3_Sub26_Sub1_1.method6800(local238 | local478 << 15);
			local497.aClass3_Sub26_Sub1_1.method6803(local448 << 16 | local169);
			Static193.method3398(local497);
		}
		if (Static522.anInt9178 > 0) {
			local143 = Static129.method2403(Static452.aClass353_2, Static233.aClass287_70);
			local143.aClass3_Sub26_Sub1_1.method6809(Static522.anInt9178 * 3);
			for (local145 = 0; local145 < Static522.anInt9178; local145++) {
				@Pc(547) Interface21 local547 = Static260.anInterface21Array1[local145];
				@Pc(555) long local555 = (local547.method5128() - Static543.aLong243) / 50L;
				if (local555 > 65535L) {
					local555 = 65535L;
				}
				Static543.aLong243 = local547.method5128();
				local143.aClass3_Sub26_Sub1_1.method6809(local547.method5127());
				local143.aClass3_Sub26_Sub1_1.method6769((int) local555);
			}
			Static193.method3398(local143);
		}
		if (Static21.anInt214 > 0) {
			Static21.anInt214--;
		}
		if (Static595.aBoolean725 && Static21.anInt214 <= 0) {
			Static21.anInt214 = 20;
			Static595.aBoolean725 = false;
			local143 = Static129.method2403(Static452.aClass353_2, Static23.aClass287_3);
			local143.aClass3_Sub26_Sub1_1.method6795((int) Static209.aFloat229 >> 3);
			local143.aClass3_Sub26_Sub1_1.method6800((int) Static123.aFloat75 >> 3);
			Static193.method3398(local143);
		}
		if (Static22.aBoolean15 != Static269.aBoolean336) {
			Static22.aBoolean15 = Static269.aBoolean336;
			local143 = Static129.method2403(Static452.aClass353_2, Static427.aClass287_124);
			local143.aClass3_Sub26_Sub1_1.method6809(Static269.aBoolean336 ? 1 : 0);
			Static193.method3398(local143);
		}
		if (!Static67.aBoolean133) {
			local143 = Static129.method2403(Static452.aClass353_2, Static202.aClass287_67);
			local143.aClass3_Sub26_Sub1_1.method6809(0);
			local145 = local143.aClass3_Sub26_Sub1_1.anInt8703;
			@Pc(686) Class3_Sub26 local686 = new Class3_Sub26(Static271.method4112());
			Static348.aClass3_Sub51_Sub1_5.method7827(local686);
			local143.aClass3_Sub26_Sub1_1.method6824(local686.aByteArray213, local686.anInt8703);
			local143.aClass3_Sub26_Sub1_1.method6768(local143.aClass3_Sub26_Sub1_1.anInt8703 - local145);
			Static193.method3398(local143);
			Static67.aBoolean133 = true;
		}
		if (Static189.aClass333ArrayArrayArray1 != null) {
			if (Static188.anInt4080 == 2) {
				Static460.method6317();
			} else if (Static188.anInt4080 == 3) {
				Static121.method2334();
			}
		}
		if (Static563.aBoolean468) {
			Static563.aBoolean468 = false;
		} else {
			Static240.aFloat116 /= 2.0F;
		}
		if (Static37.aBoolean93) {
			Static37.aBoolean93 = false;
		} else {
			Static1.aFloat1 /= 2.0F;
		}
		Static30.method426();
		if (Static409.anInt1461 != 10) {
			return;
		}
		Static489.method7314();
		Static338.method4927();
		Static105.method2181();
		Static402.anInt7199++;
		if (Static402.anInt7199 > 750) {
			Static318.method4716();
			return;
		}
		Static143.method2748();
		Static241.method3338();
		Static576.method7813();
		for (local60 = Static206.aClass143_3.method3696(true); local60 != -1; local60 = Static206.aClass143_3.method3696(false)) {
			Static160.method2919(local60);
			Static423.anIntArray429[Static230.anInt4679++ & 0x1F] = local60;
		}
		@Pc(832) Class251 local832;
		for (@Pc(809) Class3_Sub7_Sub19 local809 = Static285.method4298(); local809 != null; local809 = Static285.method4298()) {
			local448 = local809.method7359();
			local169 = local809.method7367();
			if (local448 == 1) {
				Static161.anIntArray147[local169] = local809.anInt9381;
				Static50.aBoolean109 |= Static592.aBooleanArray21[local169];
				Static53.anIntArray41[Static305.anInt5661++ & 0x1F] = local169;
			} else if (local448 == 2) {
				Static257.aStringArray22[local169] = local809.aString244;
				Static173.anIntArray157[Static45.anInt1213++ & 0x1F] = local169;
			} else if (local448 == 3) {
				local832 = Static105.method2180(local169);
				if (!local809.aString244.equals(local832.aString189)) {
					local832.aString189 = local809.aString244;
					Static588.method8016(local832);
				}
			} else if (local448 == 4) {
				local832 = Static105.method2180(local169);
				local238 = local809.anInt9381;
				local244 = local809.anInt9377;
				local255 = local809.anInt9383;
				if (local832.anInt7288 != local238 || local244 != local832.anInt7229 || local255 != local832.anInt7219) {
					local832.anInt7229 = local244;
					local832.anInt7219 = local255;
					local832.anInt7288 = local238;
					Static588.method8016(local832);
				}
			} else if (local448 == 5) {
				local832 = Static105.method2180(local169);
				if (local832.anInt7266 != local809.anInt9381 || local809.anInt9381 == -1) {
					local832.anInt7266 = local809.anInt9381;
					local832.anInt7271 = 0;
					local832.anInt7222 = 0;
					local832.anInt7270 = 1;
					@Pc(900) Class270 local900 = local832.anInt7266 == -1 ? null : Static245.aClass155_1.method3820(local832.anInt7266);
					if (local900 != null) {
						Static372.method5237(local832.anInt7271, local900);
					}
					Static588.method8016(local832);
				}
			} else if (local448 == 6) {
				local188 = local809.anInt9381;
				local238 = local188 >> 10 & 0x1F;
				local244 = local188 >> 5 & 0x1F;
				local255 = local188 & 0x1F;
				@Pc(1266) int local1266 = (local255 << 3) + (local238 << 19) + (local244 << 11);
				@Pc(1270) Class251 local1270 = Static105.method2180(local169);
				if (local1266 != local1270.anInt7278) {
					local1270.anInt7278 = local1266;
					Static588.method8016(local1270);
				}
			} else if (local448 == 7) {
				local832 = Static105.method2180(local169);
				@Pc(934) boolean local934 = local809.anInt9381 == 1;
				if (local832.aBoolean507 != local934) {
					local832.aBoolean507 = local934;
					Static588.method8016(local832);
				}
			} else if (local448 == 8) {
				local832 = Static105.method2180(local169);
				if (local832.anInt7252 != local809.anInt9381 || local832.anInt7269 != local809.anInt9377 || local809.anInt9383 != local832.anInt7210) {
					local832.anInt7269 = local809.anInt9377;
					local832.anInt7252 = local809.anInt9381;
					local832.anInt7210 = local809.anInt9383;
					if (local832.anInt7254 != -1) {
						if (local832.anInt7220 > 0) {
							local832.anInt7210 = local832.anInt7210 * 32 / local832.anInt7220;
						} else if (local832.anInt7204 > 0) {
							local832.anInt7210 = local832.anInt7210 * 32 / local832.anInt7204;
						}
					}
					Static588.method8016(local832);
				}
			} else if (local448 == 9) {
				local832 = Static105.method2180(local169);
				if (local809.anInt9381 != local832.anInt7254 || local832.anInt7248 != local809.anInt9377) {
					local832.anInt7248 = local809.anInt9377;
					local832.anInt7254 = local809.anInt9381;
					Static588.method8016(local832);
				}
			} else if (local448 == 10) {
				local832 = Static105.method2180(local169);
				if (local832.anInt7237 != local809.anInt9381 || local832.anInt7260 != local809.anInt9377 || local832.anInt7262 != local809.anInt9383) {
					local832.anInt7262 = local809.anInt9383;
					local832.anInt7260 = local809.anInt9377;
					local832.anInt7237 = local809.anInt9381;
					Static588.method8016(local832);
				}
			} else if (local448 == 11) {
				local832 = Static105.method2180(local169);
				local832.anInt7281 = local832.anInt7289 = local809.anInt9377;
				local832.aByte111 = 0;
				local832.anInt7224 = local832.anInt7217 = local809.anInt9381;
				local832.aByte112 = 0;
				Static588.method8016(local832);
			} else if (local448 == 12) {
				local832 = Static105.method2180(local169);
				local238 = local809.anInt9381;
				if (local832 != null && local832.anInt7231 == 0) {
					if (local238 > local832.anInt7202 - local832.anInt7215) {
						local238 = local832.anInt7202 - local832.anInt7215;
					}
					if (local238 < 0) {
						local238 = 0;
					}
					if (local832.anInt7275 != local238) {
						local832.anInt7275 = local238;
						Static588.method8016(local832);
					}
				}
			} else if (local448 == 14) {
				local832 = Static105.method2180(local169);
				local832.anInt7213 = local809.anInt9381;
			} else if (local448 == 15) {
				Static349.anInt6239 = local809.anInt9381;
				Static46.aBoolean102 = true;
				Static262.anInt5041 = local809.anInt9377;
			} else if (local448 == 16) {
				local832 = Static105.method2180(local169);
				local832.anInt7226 = local809.anInt9381;
			}
		}
		Static208.anInt4448++;
		if (Static491.anInt8433 != 0) {
			Static80.anInt2132 += 20;
			if (Static80.anInt2132 >= 400) {
				Static491.anInt8433 = 0;
			}
		}
		if (Static266.aClass251_6 != null) {
			Static230.anInt4670++;
			if (Static230.anInt4670 >= 15) {
				Static588.method8016(Static266.aClass251_6);
				Static266.aClass251_6 = null;
			}
		}
		Static463.aBoolean557 = false;
		Static389.aClass251_13 = null;
		Static43.aClass251_2 = null;
		Static70.aBoolean157 = false;
		Static313.method4669(-1, null, -1);
		Static183.method3258(null, -1, -1);
		if (!Static253.aBoolean325) {
			Static580.anInt10049 = -1;
		}
		Static567.method4398();
		Static523.anInt9188++;
		if (Static558.aBoolean642) {
			@Pc(1454) Class3_Sub10 local1454 = Static129.method2403(Static452.aClass353_2, Static286.aClass287_87);
			local1454.aClass3_Sub26_Sub1_1.method6803(Static445.anInt7882 << 28 | Static249.anInt8900 << 14 | Static373.anInt6496);
			Static193.method3398(local1454);
			Static558.aBoolean642 = false;
		}
		while (true) {
			@Pc(1477) Class3_Sub36 local1477;
			@Pc(1482) Class251 local1482;
			do {
				local1477 = (Class3_Sub36) Static106.aClass244_19.method5578();
				if (local1477 == null) {
					while (true) {
						do {
							local1477 = (Class3_Sub36) Static461.aClass244_58.method5578();
							if (local1477 == null) {
								while (true) {
									do {
										local1477 = (Class3_Sub36) Static206.aClass244_38.method5578();
										if (local1477 == null) {
											if (Static389.aClass251_13 == null) {
												Static202.anInt4324 = 0;
											}
											if (Static2.aClass251_1 != null) {
												Static20.method213();
											}
											if (Static212.anInt5852 > 0 && Static446.aClass237_1.method5292(82) && Static446.aClass237_1.method5292(81) && Static492.anInt8441 != 0) {
												local448 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 - Static492.anInt8441;
												if (local448 < 0) {
													local448 = 0;
												} else if (local448 > 3) {
													local448 = 3;
												}
												Static74.method1792(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray512[0] + Static321.anInt5874, Static137.anInt3293 - -Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray513[0], local448);
											}
											Static575.method7822();
											for (local448 = 0; local448 < 5; local448++) {
												@Pc(1680) int local1680 = Static461.anIntArray477[local448]++;
											}
											if (Static50.aBoolean109 && Static96.method2000() - 60000L > Static141.aLong67) {
												Static176.method3157();
											}
											for (@Pc(1705) Class25_Sub5_Sub2 local1705 = (Class25_Sub5_Sub2) Static498.aClass269_7.method5974(); local1705 != null; local1705 = (Class25_Sub5_Sub2) Static498.aClass269_7.method5979()) {
												if (Static96.method2000() / 1000L - 5L > (long) local1705.anInt4079) {
													if (local1705.aShort47 > 0) {
														Static295.method4425("", "", local1705.aString103 + Static573.aClass350_23.method7730(Static201.anInt4321), 0, 5, "");
													}
													if (local1705.aShort47 == 0) {
														Static295.method4425("", "", local1705.aString103 + Static573.aClass350_24.method7730(Static201.anInt4321), 0, 5, "");
													}
													local1705.method6959();
												}
											}
											Static332.anInt1525++;
											if (Static332.anInt1525 > 500) {
												Static332.anInt1525 = 0;
												local188 = (int) (Math.random() * 8.0D);
												if ((local188 & 0x2) == 2) {
													Static196.anInt4253 += Static456.anInt7967;
												}
												if ((local188 & 0x1) == 1) {
													Static411.anInt7378 += Static536.anInt9350;
												}
												if ((local188 & 0x4) == 4) {
													Static427.anInt7545 += Static490.anInt8426;
												}
											}
											if (Static411.anInt7378 < -50) {
												Static536.anInt9350 = 2;
											}
											if (Static196.anInt4253 < -55) {
												Static456.anInt7967 = 2;
											}
											if (Static411.anInt7378 > 50) {
												Static536.anInt9350 = -2;
											}
											if (Static427.anInt7545 < -40) {
												Static490.anInt8426 = 1;
											}
											if (Static196.anInt4253 > 55) {
												Static456.anInt7967 = -2;
											}
											if (Static427.anInt7545 > 40) {
												Static490.anInt8426 = -1;
											}
											Static178.anInt3914++;
											if (Static178.anInt3914 > 500) {
												Static178.anInt3914 = 0;
												local188 = (int) (Math.random() * 8.0D);
												if ((local188 & 0x1) == 1) {
													Static270.anInt5118 += Static336.anInt6064;
												}
												if ((local188 & 0x2) == 2) {
													Static350.anInt6241 += Static17.anInt8860;
												}
											}
											if (Static270.anInt5118 < -60) {
												Static336.anInt6064 = 2;
											}
											if (Static270.anInt5118 > 60) {
												Static336.anInt6064 = -2;
											}
											if (Static350.anInt6241 < -20) {
												Static17.anInt8860 = 1;
											}
											Static171.anInt3775++;
											if (Static350.anInt6241 > 10) {
												Static17.anInt8860 = -1;
											}
											if (Static171.anInt3775 > 50) {
												@Pc(1936) Class3_Sub10 local1936 = Static129.method2403(Static452.aClass353_2, Static341.aClass287_100);
												Static193.method3398(local1936);
											}
											if (Static231.aBoolean303) {
												Static148.method2818();
												Static231.aBoolean303 = false;
											}
											try {
												Static411.method5773();
												return;
											} catch (@Pc(1949) IOException local1949) {
												Static318.method4716();
												return;
											}
										}
										local1482 = local1477.aClass251_8;
										if (local1482.anInt7268 < 0) {
											break;
										}
										local832 = Static105.method2180(local1482.anInt7280);
									} while (local832 == null || local832.aClass251Array3 == null || local832.aClass251Array3.length <= local1482.anInt7268 || local1482 != local832.aClass251Array3[local1482.anInt7268]);
									Static583.method7919(local1477);
								}
							}
							local1482 = local1477.aClass251_8;
							if (local1482.anInt7268 < 0) {
								break;
							}
							local832 = Static105.method2180(local1482.anInt7280);
						} while (local832 == null || local832.aClass251Array3 == null || local832.aClass251Array3.length <= local1482.anInt7268 || local832.aClass251Array3[local1482.anInt7268] != local1482);
						Static583.method7919(local1477);
					}
				}
				local1482 = local1477.aClass251_8;
				if (local1482.anInt7268 < 0) {
					break;
				}
				local832 = Static105.method2180(local1482.anInt7280);
			} while (local832 == null || local832.aClass251Array3 == null || local1482.anInt7268 >= local832.aClass251Array3.length || local1482 != local832.aClass251Array3[local1482.anInt7268]);
			Static583.method7919(local1477);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILclient!ri;)Lclient!ufa;")
	public static Class328 method5763(@OriginalArg(1) int arg0, @OriginalArg(2) Class284 arg1) {
		@Pc(13) byte[] local13 = arg1.method6357(arg0);
		return local13 == null ? null : new Class328(local13);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII)V")
	public static void method5765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		if (local10 == 0) {
			if (local15 != 0) {
				Static158.method2897(arg3, arg1, arg0, arg2);
			}
		} else if (local15 == 0) {
			Static55.method6553(arg3, arg0, arg4, arg1);
		} else {
			@Pc(46) int local46 = (local15 << 12) / local10;
			@Pc(55) int local55 = arg0 - (arg3 * local46 >> 12);
			@Pc(73) int local73;
			@Pc(71) int local71;
			if (arg3 < Static384.anInt6641) {
				local71 = local55 + (Static384.anInt6641 * local46 >> 12);
				local73 = Static384.anInt6641;
			} else if (arg3 <= Static191.anInt4134) {
				local73 = arg3;
				local71 = arg0;
			} else {
				local71 = local55 + (local46 * Static191.anInt4134 >> 12);
				local73 = Static191.anInt4134;
			}
			@Pc(110) int local110;
			@Pc(118) int local118;
			if (Static384.anInt6641 > arg4) {
				local110 = Static384.anInt6641;
				local118 = local55 + (Static384.anInt6641 * local46 >> 12);
			} else if (arg4 > Static191.anInt4134) {
				local110 = Static191.anInt4134;
				local118 = (Static191.anInt4134 * local46 >> 12) + local55;
			} else {
				local110 = arg4;
				local118 = arg2;
			}
			if (local118 < Static112.anInt2687) {
				local110 = (Static112.anInt2687 - local55 << 12) / local46;
				local118 = Static112.anInt2687;
			} else if (local118 > Static333.anInt6022) {
				local118 = Static333.anInt6022;
				local110 = (Static333.anInt6022 - local55 << 12) / local46;
			}
			if (Static112.anInt2687 > local71) {
				local73 = (Static112.anInt2687 - local55 << 12) / local46;
				local71 = Static112.anInt2687;
			} else if (local71 > Static333.anInt6022) {
				local71 = Static333.anInt6022;
				local73 = (Static333.anInt6022 - local55 << 12) / local46;
			}
			Static80.method1850(local118, local71, local110, local73, arg1);
		}
	}
}
