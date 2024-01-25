import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "Lclient!an;")
	public static final Class20 aClass20_21 = new Class20(4, 4);

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString96 = null;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V")
	public static void method7200(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static530.anInt9144 != -1) {
				Static136.method3118(Static530.anInt9144);
			}
			for (@Pc(14) Class3_Sub50 local14 = (Class3_Sub50) Static40.aClass307_5.method7421(); local14 != null; local14 = (Class3_Sub50) Static40.aClass307_5.method7428()) {
				if (!local14.method8670()) {
					local14 = (Class3_Sub50) Static40.aClass307_5.method7421();
					if (local14 == null) {
						break;
					}
				}
				Static488.method7168(true, false, local14);
			}
			Static530.anInt9144 = -1;
			Static40.aClass307_5 = new Class307(8);
			Static42.method786();
			Static530.anInt9144 = Static273.anInt5829;
			Static557.method7852(false);
			Static594.method8139();
			Static84.method2225(Static530.anInt9144);
		}
		Static389.aBoolean634 = true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	public static void method7201() {
		if (Static285.anInt5873 > 1) {
			Static285.anInt5873--;
			Static488.anInt8666 = Static244.anInt5487;
		}
		if (Static123.aBoolean245) {
			Static123.aBoolean245 = false;
			Static42.method787();
			return;
		}
		if (!Static433.aBoolean672) {
			Static137.method3124();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static16.method238(); local27++) {
		}
		if (Static581.anInt9720 != 10) {
			return;
		}
		@Pc(47) Class3_Sub26 local47;
		@Pc(56) int local56;
		while (Static563.method7919()) {
			local47 = Static640.method8636(Static283.aClass344_70, Static403.aClass294_3);
			local47.aClass3_Sub15_Sub1_3.method8448(0);
			local56 = local47.aClass3_Sub15_Sub1_3.anInt10282;
			Static339.method5620(local47.aClass3_Sub15_Sub1_3);
			local47.aClass3_Sub15_Sub1_3.method8433(local47.aClass3_Sub15_Sub1_3.anInt10282 - local56);
			Static472.method5189(local47);
		}
		if (Static369.aClass3_Sub14_1 == null) {
			if (Static444.method6719() >= Static189.aLong94) {
				Static369.aClass3_Sub14_1 = Static231.aClass282_1.method6996(Static621.aClass278_5.aString94);
			}
		} else if (Static369.aClass3_Sub14_1.anInt1404 != -1) {
			local47 = Static640.method8636(Static628.aClass344_126, Static403.aClass294_3);
			local47.aClass3_Sub15_Sub1_3.method8464(Static369.aClass3_Sub14_1.anInt1404);
			Static472.method5189(local47);
			Static369.aClass3_Sub14_1 = null;
			Static189.aLong94 = Static444.method6719() + 30000L;
		}
		@Pc(126) Class3_Sub30 local126 = (Class3_Sub30) Static264.aClass276_37.method6907();
		@Pc(139) int local139;
		@Pc(162) int local162;
		@Pc(179) int local179;
		@Pc(222) int local222;
		@Pc(229) int local229;
		@Pc(240) int local240;
		@Pc(137) Class3_Sub26 local137;
		if (local126 != null || Static401.aLong180 < Static444.method6719() - 2000L) {
			local137 = null;
			local139 = 0;
			for (@Pc(144) Class3_Sub30 local144 = (Class3_Sub30) Static271.aClass276_39.method6907(); local144 != null && (local137 == null || local137.aClass3_Sub15_Sub1_3.anInt10282 - local139 < 240); local144 = (Class3_Sub30) Static271.aClass276_39.method6912()) {
				local144.method8671();
				local162 = local144.method6367();
				if (local162 < -1) {
					local162 = -1;
				} else if (local162 > 65534) {
					local162 = 65534;
				}
				local179 = local144.method6363();
				if (local179 < -1) {
					local179 = -1;
				} else if (local179 > 65534) {
					local179 = 65534;
				}
				if (local179 != Static410.anInt7690 || local162 != Static524.anInt9082) {
					if (local137 == null) {
						local137 = Static640.method8636(Static488.aClass344_106, Static403.aClass294_3);
						local137.aClass3_Sub15_Sub1_3.method8448(0);
						local139 = local137.aClass3_Sub15_Sub1_3.anInt10282;
					}
					local222 = local179 - Static410.anInt7690;
					Static410.anInt7690 = local179;
					local229 = local162 - Static524.anInt9082;
					Static524.anInt9082 = local162;
					local240 = (int) ((local144.method6365() - Static401.aLong180) / 20L);
					if (local240 < 8 && local222 >= -32 && local222 <= 31 && local229 >= -32 && local229 <= 31) {
						local222 += 32;
						local229 += 32;
						local137.aClass3_Sub15_Sub1_3.method8464((local222 << 6) + (local240 << 12) + local229);
					} else if (local240 < 32 && local222 >= -128 && local222 <= 127 && local229 >= -128 && local229 <= 127) {
						local137.aClass3_Sub15_Sub1_3.method8448(local240 + 128);
						local222 += 128;
						local229 += 128;
						local137.aClass3_Sub15_Sub1_3.method8464(local229 + (local222 << 8));
					} else if (local240 < 32) {
						local137.aClass3_Sub15_Sub1_3.method8448(local240 + 192);
						if (local179 == 1 || local162 == -1) {
							local137.aClass3_Sub15_Sub1_3.method8419(Integer.MIN_VALUE);
						} else {
							local137.aClass3_Sub15_Sub1_3.method8419(local179 | local162 << 16);
						}
					} else {
						local137.aClass3_Sub15_Sub1_3.method8464(local240 + 57344);
						if (local179 == 1 || local162 == -1) {
							local137.aClass3_Sub15_Sub1_3.method8419(Integer.MIN_VALUE);
						} else {
							local137.aClass3_Sub15_Sub1_3.method8419(local162 << 16 | local179);
						}
					}
					Static401.aLong180 = local144.method6365();
				}
			}
			if (local137 != null) {
				local137.aClass3_Sub15_Sub1_3.method8433(local137.aClass3_Sub15_Sub1_3.anInt10282 - local139);
				Static472.method5189(local137);
			}
		}
		@Pc(439) int local439;
		if (local126 != null) {
			@Pc(425) long local425 = (local126.method6365() - Static240.aLong119) / 50L;
			if (local425 > 32767L) {
				local425 = 32767L;
			}
			Static240.aLong119 = local126.method6365();
			local439 = local126.method6367();
			if (local439 < 0) {
				local439 = 0;
			} else if (local439 > 65535) {
				local439 = 65535;
			}
			local162 = local126.method6363();
			if (local162 < 0) {
				local162 = 0;
			} else if (local162 > 65535) {
				local162 = 65535;
			}
			@Pc(474) byte local474 = 0;
			if (local126.method6362() == 2) {
				local474 = 1;
			}
			local222 = (int) local425;
			@Pc(493) Class3_Sub26 local493 = Static640.method8636(Static621.aClass344_123, Static403.aClass294_3);
			local493.aClass3_Sub15_Sub1_3.method8408(local222 | local474 << 15);
			local493.aClass3_Sub15_Sub1_3.method8409(local162 | local439 << 16);
			Static472.method5189(local493);
		}
		if (Static324.anInt6510 > 0) {
			local137 = Static640.method8636(Static52.aClass344_20, Static403.aClass294_3);
			local137.aClass3_Sub15_Sub1_3.method8448(Static324.anInt6510 * 3);
			for (local139 = 0; local139 < Static324.anInt6510; local139++) {
				@Pc(543) Interface13 local543 = Static608.anInterface13Array4[local139];
				@Pc(551) long local551 = (local543.method748() - Static73.aLong44) / 50L;
				if (local551 > 65535L) {
					local551 = 65535L;
				}
				Static73.aLong44 = local543.method748();
				local137.aClass3_Sub15_Sub1_3.method8448(local543.method749());
				local137.aClass3_Sub15_Sub1_3.method8464((int) local551);
			}
			Static472.method5189(local137);
		}
		if (Static594.anInt9912 > 0) {
			Static594.anInt9912--;
		}
		if (Static168.aBoolean336 && Static594.anInt9912 <= 0) {
			Static168.aBoolean336 = false;
			Static594.anInt9912 = 20;
			local137 = Static640.method8636(Static598.aClass344_119, Static403.aClass294_3);
			local137.aClass3_Sub15_Sub1_3.method8408((int) Static502.aFloat230 >> 3);
			local137.aClass3_Sub15_Sub1_3.method8431((int) Static103.aFloat96 >> 3);
			Static472.method5189(local137);
		}
		if (Static386.aBoolean722 != Static478.aBoolean839) {
			Static478.aBoolean839 = Static386.aBoolean722;
			local137 = Static640.method8636(Static458.aClass344_96, Static403.aClass294_3);
			local137.aClass3_Sub15_Sub1_3.method8448(Static386.aBoolean722 ? 1 : 0);
			Static472.method5189(local137);
		}
		if (!Static355.aBoolean601) {
			local137 = Static640.method8636(Static123.aClass344_30, Static403.aClass294_3);
			local137.aClass3_Sub15_Sub1_3.method8448(0);
			local139 = local137.aClass3_Sub15_Sub1_3.anInt10282;
			@Pc(676) Class3_Sub15 local676 = Static552.aClass3_Sub48_30.method7825();
			local137.aClass3_Sub15_Sub1_3.method8430(local676.anInt10282, 0, local676.aByteArray106);
			local137.aClass3_Sub15_Sub1_3.method8433(local137.aClass3_Sub15_Sub1_3.anInt10282 - local139);
			Static472.method5189(local137);
			Static355.aBoolean601 = true;
		}
		if (Static170.aClass106ArrayArrayArray1 != null) {
			if (Static516.anInt9019 == 2) {
				Static598.method8177();
			} else if (Static516.anInt9019 == 3) {
				Static58.method1281();
			}
		}
		if (Static303.aBoolean521) {
			Static303.aBoolean521 = false;
		} else {
			Static611.aFloat276 /= 2.0F;
		}
		if (Static144.aBoolean300) {
			Static144.aBoolean300 = false;
		} else {
			Static550.aFloat251 /= 2.0F;
		}
		Static30.method573();
		if (Static581.anInt9720 != 10) {
			return;
		}
		Static49.method1148();
		Static207.method4080();
		Static547.method6705();
		Static448.anInt8138++;
		if (Static448.anInt8138 > 750) {
			Static42.method787();
			return;
		}
		Static427.method6577();
		Static607.method8247();
		Static265.method4896();
		for (local56 = Static514.aClass166_1.method4932(true); local56 != -1; local56 = Static514.aClass166_1.method4932(false)) {
			Static172.method3555(local56);
			Static587.anIntArray595[Static224.anInt5124++ & 0x1F] = local56;
		}
		@Pc(867) Class108 local867;
		for (@Pc(812) Class3_Sub1_Sub21 local812 = Static645.method8654(); local812 != null; local812 = Static645.method8654()) {
			local439 = local812.method8630();
			local162 = local812.method8625();
			if (local439 == 1) {
				Static477.anIntArray533[local162] = local812.anInt10489;
				Static555.aBoolean799 |= Static158.aBooleanArray10[local162];
				Static338.anIntArray392[Static91.anInt2464++ & 0x1F] = local162;
			} else if (local439 == 2) {
				Static648.aStringArray42[local162] = local812.aString114;
				Static166.anIntArray212[Static128.anInt3196++ & 0x1F] = local162;
			} else if (local439 == 3) {
				local867 = Static113.method8285(local162);
				if (!local812.aString114.equals(local867.aString39)) {
					local867.aString39 = local812.aString114;
					Static139.method3135(local867);
				}
			} else if (local439 == 4) {
				local867 = Static113.method8285(local162);
				local222 = local812.anInt10489;
				local229 = local812.anInt10490;
				local240 = local812.anInt10491;
				if (local867.anInt4044 != local222 || local867.anInt4097 != local229 || local867.anInt4016 != local240) {
					local867.anInt4016 = local240;
					local867.anInt4097 = local229;
					local867.anInt4044 = local222;
					Static139.method3135(local867);
				}
			} else if (local439 == 5) {
				local867 = Static113.method8285(local162);
				if (local867.anInt4015 != local812.anInt10489 || local812.anInt10489 == -1) {
					local867.anInt4015 = local812.anInt10489;
					local867.anInt4095 = 1;
					local867.anInt4025 = 0;
					local867.anInt4065 = 0;
					@Pc(956) Class290 local956 = local867.anInt4015 == -1 ? null : Static618.aClass222_2.method5867(local867.anInt4015);
					if (local956 != null) {
						Static468.method6973(local867.anInt4025, local956);
					}
					Static139.method3135(local867);
				}
			} else if (local439 == 6) {
				local179 = local812.anInt10489;
				local222 = local179 >> 10 & 0x1F;
				local229 = local179 >> 5 & 0x1F;
				local240 = local179 & 0x1F;
				@Pc(1337) int local1337 = (local229 << 11) + (local222 << 19) + (local240 << 3);
				@Pc(1341) Class108 local1341 = Static113.method8285(local162);
				if (local1337 != local1341.anInt4069) {
					local1341.anInt4069 = local1337;
					Static139.method3135(local1341);
				}
			} else if (local439 == 7) {
				local867 = Static113.method8285(local162);
				@Pc(986) boolean local986 = local812.anInt10489 == 1;
				if (local867.aBoolean352 != local986) {
					local867.aBoolean352 = local986;
					Static139.method3135(local867);
				}
			} else if (local439 == 8) {
				local867 = Static113.method8285(local162);
				if (local867.anInt4063 != local812.anInt10489 || local812.anInt10490 != local867.anInt4085 || local867.anInt4071 != local812.anInt10491) {
					local867.anInt4085 = local812.anInt10490;
					local867.anInt4063 = local812.anInt10489;
					local867.anInt4071 = local812.anInt10491;
					if (local867.anInt4059 != -1) {
						if (local867.anInt4088 > 0) {
							local867.anInt4071 = local867.anInt4071 * 32 / local867.anInt4088;
						} else if (local867.anInt4087 > 0) {
							local867.anInt4071 = local867.anInt4071 * 32 / local867.anInt4087;
						}
					}
					Static139.method3135(local867);
				}
			} else if (local439 == 9) {
				local867 = Static113.method8285(local162);
				if (local812.anInt10489 != local867.anInt4059 || local812.anInt10490 != local867.anInt4012) {
					local867.anInt4059 = local812.anInt10489;
					local867.anInt4012 = local812.anInt10490;
					Static139.method3135(local867);
				}
			} else if (local439 == 10) {
				local867 = Static113.method8285(local162);
				if (local867.anInt4032 != local812.anInt10489 || local867.anInt4011 != local812.anInt10490 || local867.anInt4064 != local812.anInt10491) {
					local867.anInt4011 = local812.anInt10490;
					local867.anInt4032 = local812.anInt10489;
					local867.anInt4064 = local812.anInt10491;
					Static139.method3135(local867);
				}
			} else if (local439 == 11) {
				local867 = Static113.method8285(local162);
				local867.aByte48 = 0;
				local867.anInt4070 = local867.anInt4096 = local812.anInt10489;
				local867.aByte49 = 0;
				local867.anInt4053 = local867.anInt4029 = local812.anInt10490;
				Static139.method3135(local867);
			} else if (local439 == 12) {
				local867 = Static113.method8285(local162);
				local222 = local812.anInt10489;
				if (local867 != null && local867.anInt4018 == 0) {
					if (local867.anInt4035 - local867.anInt4037 < local222) {
						local222 = local867.anInt4035 - local867.anInt4037;
					}
					if (local222 < 0) {
						local222 = 0;
					}
					if (local222 != local867.anInt4009) {
						local867.anInt4009 = local222;
						Static139.method3135(local867);
					}
				}
			} else if (local439 == 14) {
				local867 = Static113.method8285(local162);
				local867.anInt4020 = local812.anInt10489;
			} else if (local439 == 15) {
				Static326.anInt6537 = local812.anInt10489;
				Static160.aBoolean329 = true;
				Static29.anInt565 = local812.anInt10490;
			} else if (local439 == 16) {
				local867 = Static113.method8285(local162);
				local867.anInt4101 = local812.anInt10489;
			} else if (local439 == 17) {
				local867 = Static113.method8285(local162);
				local867.anInt4040 = local812.anInt10489;
			}
		}
		Static550.anInt9371++;
		if (Static412.anInt7699 != 0) {
			Static489.anInt8687 += 20;
			if (Static489.anInt8687 >= 400) {
				Static412.anInt7699 = 0;
			}
		}
		if (Static186.aClass108_6 != null) {
			Static3.anInt10484++;
			if (Static3.anInt10484 >= 15) {
				Static139.method3135(Static186.aClass108_6);
				Static186.aClass108_6 = null;
			}
		}
		Static353.aBoolean597 = false;
		Static46.aClass108_1 = null;
		Static505.aClass108_10 = null;
		Static638.aBoolean885 = false;
		Static484.method7112(null, -1, -1);
		Static169.method3524(null, -1, -1);
		if (!Static82.aBoolean192) {
			Static548.anInt9367 = -1;
		}
		Static555.method7817();
		Static244.anInt5487++;
		if (Static369.aBoolean609) {
			@Pc(1469) Class3_Sub26 local1469 = Static640.method8636(Static397.aClass344_87, Static403.aClass294_3);
			local1469.aClass3_Sub15_Sub1_3.method8409(Static390.anInt7400 | Static612.anInt10138 << 28 | Static230.anInt5187 << 14);
			Static472.method5189(local1469);
			Static369.aBoolean609 = false;
		}
		while (true) {
			@Pc(1492) Class3_Sub51 local1492;
			@Pc(1497) Class108 local1497;
			do {
				local1492 = (Class3_Sub51) Static406.aClass276_47.method6911();
				if (local1492 == null) {
					while (true) {
						do {
							local1492 = (Class3_Sub51) Static447.aClass276_48.method6911();
							if (local1492 == null) {
								while (true) {
									do {
										local1492 = (Class3_Sub51) Static306.aClass276_42.method6911();
										if (local1492 == null) {
											if (Static505.aClass108_10 == null) {
												Static604.anInt10035 = 0;
											}
											if (Static233.aClass108_7 != null) {
												Static480.method7070();
											}
											if (Static106.anInt2660 > 0 && Static326.aClass238_1.method6948(82) && Static326.aClass238_1.method6948(81) && Static305.anInt6116 != 0) {
												local439 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 - Static305.anInt6116;
												if (local439 < 0) {
													local439 = 0;
												} else if (local439 > 3) {
													local439 = 3;
												}
												Static481.method2825(Static446.anInt8090 + Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray378[0], local439, Static124.anInt3150 + Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray377[0]);
											}
											Static49.method1147();
											for (local439 = 0; local439 < 5; local439++) {
												@Pc(1695) int local1695 = Static201.anIntArray245[local439]++;
											}
											if (Static555.aBoolean799 && Static444.method6719() - 60000L > Static424.aLong254) {
												Static176.method3582();
											}
											for (@Pc(1718) Class2_Sub4_Sub2 local1718 = (Class2_Sub4_Sub2) Static327.aClass375_5.method8638(); local1718 != null; local1718 = (Class2_Sub4_Sub2) Static327.aClass375_5.method8635()) {
												if (Static444.method6719() / 1000L - 5L > (long) local1718.anInt8513) {
													if (local1718.aShort106 > 0) {
														Static97.method2492("", "", 5, "", 0, local1718.aString95 + Static287.aClass176_19.method4986(Static380.anInt7247));
													}
													if (local1718.aShort106 == 0) {
														Static97.method2492("", "", 5, "", 0, local1718.aString95 + Static287.aClass176_20.method4986(Static380.anInt7247));
													}
													local1718.method8558();
												}
											}
											Static266.anInt8467++;
											if (Static266.anInt8467 > 500) {
												Static266.anInt8467 = 0;
												local179 = (int) (Math.random() * 8.0D);
												if ((local179 & 0x1) == 1) {
													Static183.anInt4350 += Static147.anInt3676;
												}
												if ((local179 & 0x2) == 2) {
													Static64.anInt9910 += Static278.anInt7461;
												}
												if ((local179 & 0x4) == 4) {
													Static88.anInt2309 += Static266.anInt8464;
												}
											}
											if (Static183.anInt4350 < -50) {
												Static147.anInt3676 = 2;
											}
											if (Static183.anInt4350 > 50) {
												Static147.anInt3676 = -2;
											}
											if (Static64.anInt9910 < -55) {
												Static278.anInt7461 = 2;
											}
											if (Static88.anInt2309 < -40) {
												Static266.anInt8464 = 1;
											}
											if (Static64.anInt9910 > 55) {
												Static278.anInt7461 = -2;
											}
											if (Static88.anInt2309 > 40) {
												Static266.anInt8464 = -1;
											}
											Static39.anInt723++;
											if (Static39.anInt723 > 500) {
												Static39.anInt723 = 0;
												local179 = (int) (Math.random() * 8.0D);
												if ((local179 & 0x2) == 2) {
													Static127.anInt3186 += Static199.anInt4638;
												}
												if ((local179 & 0x1) == 1) {
													Static30.anInt575 += Static157.anInt3828;
												}
											}
											if (Static30.anInt575 < -60) {
												Static157.anInt3828 = 2;
											}
											if (Static30.anInt575 > 60) {
												Static157.anInt3828 = -2;
											}
											if (Static127.anInt3186 < -20) {
												Static199.anInt4638 = 1;
											}
											Static559.anInt9555++;
											if (Static127.anInt3186 > 10) {
												Static199.anInt4638 = -1;
											}
											if (Static559.anInt9555 > 50) {
												@Pc(1945) Class3_Sub26 local1945 = Static640.method8636(Static24.aClass344_4, Static403.aClass294_3);
												Static472.method5189(local1945);
											}
											if (Static226.aBoolean450) {
												Static487.method7150();
												Static226.aBoolean450 = false;
											}
											try {
												Static388.method6125();
												return;
											} catch (@Pc(1958) IOException local1958) {
												Static42.method787();
												return;
											}
										}
										local1497 = local1492.aClass108_13;
										if (local1497.anInt4083 < 0) {
											break;
										}
										local867 = Static113.method8285(local1497.anInt4046);
									} while (local867 == null || local867.aClass108Array1 == null || local867.aClass108Array1.length <= local1497.anInt4083 || local867.aClass108Array1[local1497.anInt4083] != local1497);
									Static84.method2222(local1492);
								}
							}
							local1497 = local1492.aClass108_13;
							if (local1497.anInt4083 < 0) {
								break;
							}
							local867 = Static113.method8285(local1497.anInt4046);
						} while (local867 == null || local867.aClass108Array1 == null || local1497.anInt4083 >= local867.aClass108Array1.length || local1497 != local867.aClass108Array1[local1497.anInt4083]);
						Static84.method2222(local1492);
					}
				}
				local1497 = local1492.aClass108_13;
				if (local1497.anInt4083 < 0) {
					break;
				}
				local867 = Static113.method8285(local1497.anInt4046);
			} while (local867 == null || local867.aClass108Array1 == null || local867.aClass108Array1.length <= local1497.anInt4083 || local1497 != local867.aClass108Array1[local1497.anInt4083]);
			Static84.method2222(local1492);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!aa;IIBILclient!ha;IILclient!gaa;)V")
	public static void method7209(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class33 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class108 arg7) {
		@Pc(10) Class269 local10 = Static34.aClass115_1.method3752(arg6);
		if (local10 == null || !local10.aBoolean693 || !local10.method6796(Static514.aClass166_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local10.anIntArray511 != null) {
			@Pc(33) int[] local33 = new int[local10.anIntArray511.length];
			@Pc(47) int local47;
			@Pc(60) int local60;
			@Pc(64) int local64;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static516.anInt9019 == 4) {
					local47 = (int) Static502.aFloat230 & 0x3FFF;
				} else {
					local47 = Static30.anInt575 + (int) Static502.aFloat230 & 0x3FFF;
				}
				local60 = Class3_Sub1_Sub2.anIntArray84[local47];
				local64 = Class3_Sub1_Sub2.anIntArray85[local47];
				if (Static516.anInt9019 != 4) {
					local64 = local64 * 256 / (Static127.anInt3186 + 256);
					local60 = local60 * 256 / (Static127.anInt3186 + 256);
				}
				local33[local35 * 2] = (local64 * (arg1 + local10.anIntArray511[local35 * 2] * 4) + local60 * (local10.anIntArray511[local35 * 2 + 1] * 4 + arg2) >> 14) + arg7.anInt4067 / 2 + arg3;
				local33[local35 * 2 + 1] = arg5 + arg7.anInt4037 / 2 - ((local10.anIntArray511[local35 * 2 + 1] * 4 + arg2) * local64 - (arg1 + local10.anIntArray511[local35 * 2] * 4) * local60 >> 14);
			}
			Static616.method8373(arg4, local33, local10.anInt8156, arg7.anIntArray217, arg7.anIntArray224);
			if (local10.anInt8150 > 0) {
				@Pc(220) int local220;
				@Pc(230) int local230;
				@Pc(249) int local249;
				@Pc(259) int local259;
				for (local47 = 0; local47 < local33.length / 2 - 1; local47++) {
					local60 = local33[local47 * 2];
					local64 = local33[local47 * 2 + 1];
					local220 = local33[(local47 + 1) * 2];
					local230 = local33[local47 * 2 + 1 + 2];
					if (local60 > local220) {
						local249 = local60;
						local259 = local64;
						local60 = local220;
						local64 = local230;
						local220 = local249;
						local230 = local259;
					} else if (local220 == local60 && local64 > local230) {
						local249 = local64;
						local64 = local230;
						local230 = local249;
					}
					arg4.method6207(local60, local64, local220, local230, local10.anIntArray512[local10.aByteArray87[local47] & 0xFF], arg0, arg3, arg5, local10.anInt8150, local10.anInt8152, local10.anInt8149);
				}
				local60 = local33[local33.length - 2];
				local64 = local33[local33.length - 1];
				local220 = local33[0];
				local230 = local33[1];
				if (local220 < local60) {
					local249 = local60;
					local259 = local64;
					local60 = local220;
					local64 = local230;
					local220 = local249;
					local230 = local259;
				} else if (local60 == local220 && local230 < local64) {
					local249 = local64;
					local64 = local230;
					local230 = local249;
				}
				arg4.method6207(local60, local64, local220, local230, local10.anIntArray512[local10.aByteArray87[local10.aByteArray87.length - 1] & 0xFF], arg0, arg3, arg5, local10.anInt8150, local10.anInt8152, local10.anInt8149);
			} else {
				for (local47 = 0; local47 < local33.length / 2 - 1; local47++) {
					arg4.method6164(local33[local47 * 2], local33[local47 * 2 + 1], local33[local47 * 2 + 2], local33[(local47 + 1) * 2 + 1], local10.anIntArray512[local10.aByteArray87[local47] & 0xFF], arg0, arg3, arg5);
				}
				arg4.method6164(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local10.anIntArray512[local10.aByteArray87[local10.aByteArray87.length - 1] & 0xFF], arg0, arg3, arg5);
			}
		}
		@Pc(494) Class5 local494 = null;
		if (local10.anInt8151 != -1) {
			local494 = local10.method6798(false, arg4);
			if (local494 != null) {
				Static625.method8489(arg3, arg1, arg5, arg7, arg2, arg0, local494);
			}
		}
		if (local10.aString90 == null) {
			return;
		}
		local35 = 0;
		if (local494 != null) {
			local35 = local494.method7580();
		}
		@Pc(528) Class25 local528 = Static641.aClass25_14;
		@Pc(530) Class315 local530 = Static89.aClass315_7;
		if (local10.anInt8148 == 1) {
			local528 = Static528.aClass25_7;
			local530 = Static424.aClass315_16;
		}
		if (local10.anInt8148 == 2) {
			local530 = Static224.aClass315_11;
			local528 = Static16.aClass25_1;
		}
		Static323.method5443(local10.anInt8166, local528, arg1, local35, local10.aString90, arg5, local530, arg0, arg7, arg3, arg2);
		return;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([FII)[F")
	public static float[] method7211(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static655.method6404(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
