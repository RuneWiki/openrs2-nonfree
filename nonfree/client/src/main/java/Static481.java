import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_121 = new Class200(35, 7);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)V")
	public static void method7182() {
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub8_1);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub8_2);
		Static262.aClass3_Sub27_12.method3234(2, Static262.aClass3_Sub27_12.aClass21_Sub27_2);
		Static262.aClass3_Sub27_12.method3234(2, Static262.aClass3_Sub27_12.aClass21_Sub27_1);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub22_1);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub3_1);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub21_1);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub7_1);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub19_1);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub5_1);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub9_1);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub12_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub15_1);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub20_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub26_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub26_2);
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub25_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub4_1);
		Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub29_1);
		Static294.method4657();
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub17_1);
		Static262.aClass3_Sub27_12.method3234(3, Static262.aClass3_Sub27_12.aClass21_Sub6_1);
		Static128.method2511();
		Static175.method3056();
		Static314.aBoolean418 = true;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)Z")
	public static boolean method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V")
	public static void method7185() {
		if (Static458.anInt8066 > 1) {
			Static406.anInt7450 = Static371.anInt7006;
			Static458.anInt8066--;
		}
		if (Static137.aBoolean215) {
			Static137.aBoolean215 = false;
			Static567.method8638();
			return;
		}
		if (!Static447.aBoolean555) {
			Static309.method5103();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static550.method6467(); local27++) {
		}
		if (Static485.anInt8420 != 10) {
			return;
		}
		@Pc(51) Class3_Sub14 local51;
		@Pc(60) int local60;
		while (Static509.method7604()) {
			local51 = Static139.method2308(Static438.aClass130_108, Static24.aClass233_1);
			local51.aClass3_Sub3_Sub2_2.method4220(0);
			local60 = local51.aClass3_Sub3_Sub2_2.anInt4736;
			Static305.method4857(local51.aClass3_Sub3_Sub2_2);
			local51.aClass3_Sub3_Sub2_2.method4218(local51.aClass3_Sub3_Sub2_2.anInt4736 - local60);
			Static562.method8096(local51);
		}
		if (Static593.aClass3_Sub42_2 == null) {
			if (Static235.aLong130 <= Static374.method6036()) {
				Static593.aClass3_Sub42_2 = Static465.aClass27_1.method1257(Static4.aClass363_1.aString109);
			}
		} else if (Static593.aClass3_Sub42_2.anInt7574 != -1) {
			local51 = Static139.method2308(Static210.aClass130_61, Static24.aClass233_1);
			local51.aClass3_Sub3_Sub2_2.method4201(Static593.aClass3_Sub42_2.anInt7574);
			Static562.method8096(local51);
			Static593.aClass3_Sub42_2 = null;
			Static235.aLong130 = Static374.method6036() + 30000L;
		}
		@Pc(129) Class3_Sub31 local129 = (Class3_Sub31) Static537.aClass223_58.method5874();
		@Pc(142) int local142;
		@Pc(165) int local165;
		@Pc(184) int local184;
		@Pc(235) int local235;
		@Pc(241) int local241;
		@Pc(252) int local252;
		@Pc(140) Class3_Sub14 local140;
		if (local129 != null || Static374.method6036() - 2000L > Static576.aLong255) {
			local140 = null;
			local142 = 0;
			for (@Pc(147) Class3_Sub31 local147 = (Class3_Sub31) Static489.aClass223_51.method5874(); local147 != null && (local140 == null || local140.aClass3_Sub3_Sub2_2.anInt4736 - local142 < 240); local147 = (Class3_Sub31) Static489.aClass223_51.method5870()) {
				local147.method8769();
				local165 = local147.method6924();
				if (local165 < -1) {
					local165 = -1;
				} else if (local165 > 65534) {
					local165 = 65534;
				}
				local184 = local147.method6921();
				if (local184 < -1) {
					local184 = -1;
				} else if (local184 > 65534) {
					local184 = 65534;
				}
				if (local184 != Static130.anInt2695 || Static603.anInt9844 != local165) {
					if (local140 == null) {
						local140 = Static139.method2308(Static94.aClass130_37, Static24.aClass233_1);
						local140.aClass3_Sub3_Sub2_2.method4220(0);
						local142 = local140.aClass3_Sub3_Sub2_2.anInt4736;
					}
					local235 = local184 - Static130.anInt2695;
					Static130.anInt2695 = local184;
					local241 = local165 - Static603.anInt9844;
					Static603.anInt9844 = local165;
					local252 = (int) ((local147.method6919() - Static576.aLong255) / 20L);
					if (local252 < 8 && local235 >= -32 && local235 <= 31 && local241 >= -32 && local241 <= 31) {
						local241 += 32;
						local235 += 32;
						local140.aClass3_Sub3_Sub2_2.method4201((local252 << 12) + (local235 << 6) + local241);
					} else if (local252 < 32 && local235 >= -128 && local235 <= 127 && local241 >= -128 && local241 <= 127) {
						local235 += 128;
						local140.aClass3_Sub3_Sub2_2.method4220(local252 + 128);
						local241 += 128;
						local140.aClass3_Sub3_Sub2_2.method4201(local241 + (local235 << 8));
					} else if (local252 >= 32) {
						local140.aClass3_Sub3_Sub2_2.method4201(local252 + 57344);
						if (local184 == 1 || local165 == -1) {
							local140.aClass3_Sub3_Sub2_2.method4265(Integer.MIN_VALUE);
						} else {
							local140.aClass3_Sub3_Sub2_2.method4265(local184 | local165 << 16);
						}
					} else {
						local140.aClass3_Sub3_Sub2_2.method4220(local252 + 192);
						if (local184 == 1 || local165 == -1) {
							local140.aClass3_Sub3_Sub2_2.method4265(Integer.MIN_VALUE);
						} else {
							local140.aClass3_Sub3_Sub2_2.method4265(local184 | local165 << 16);
						}
					}
					Static576.aLong255 = local147.method6919();
				}
			}
			if (local140 != null) {
				local140.aClass3_Sub3_Sub2_2.method4218(local140.aClass3_Sub3_Sub2_2.anInt4736 - local142);
				Static562.method8096(local140);
			}
		}
		@Pc(455) int local455;
		if (local129 != null) {
			@Pc(441) long local441 = (local129.method6919() - Static568.aLong251) / 50L;
			if (local441 > 32767L) {
				local441 = 32767L;
			}
			Static568.aLong251 = local129.method6919();
			local455 = local129.method6924();
			if (local455 < 0) {
				local455 = 0;
			} else if (local455 > 65535) {
				local455 = 65535;
			}
			local165 = local129.method6921();
			if (local165 < 0) {
				local165 = 0;
			} else if (local165 > 65535) {
				local165 = 65535;
			}
			@Pc(490) byte local490 = 0;
			if (local129.method6923() == 2) {
				local490 = 1;
			}
			local235 = (int) local441;
			@Pc(509) Class3_Sub14 local509 = Static139.method2308(Static609.aClass130_133, Static24.aClass233_1);
			local509.aClass3_Sub3_Sub2_2.method4244(local165 | local455 << 16);
			local509.aClass3_Sub3_Sub2_2.method4202(local235 | local490 << 15);
			Static562.method8096(local509);
		}
		if (Static447.anInt7968 > 0) {
			local140 = Static139.method2308(Static18.aClass130_8, Static24.aClass233_1);
			local140.aClass3_Sub3_Sub2_2.method4220(Static447.anInt7968 * 3);
			for (local142 = 0; local142 < Static447.anInt7968; local142++) {
				@Pc(559) Interface5 local559 = Static391.anInterface5Array6[local142];
				@Pc(568) long local568 = (local559.method7865() - Static423.aLong204) / 50L;
				Static423.aLong204 = local559.method7865();
				if (local568 > 65535L) {
					local568 = 65535L;
				}
				local140.aClass3_Sub3_Sub2_2.method4220(local559.method7864());
				local140.aClass3_Sub3_Sub2_2.method4201((int) local568);
			}
			Static562.method8096(local140);
		}
		if (Static396.anInt6646 > 0) {
			Static396.anInt6646--;
		}
		if (Static395.aBoolean521 && Static396.anInt6646 <= 0) {
			Static396.anInt6646 = 20;
			Static395.aBoolean521 = false;
			local140 = Static139.method2308(Static18.aClass130_7, Static24.aClass233_1);
			local140.aClass3_Sub3_Sub2_2.method4226((int) Static401.aFloat165 >> 3);
			local140.aClass3_Sub3_Sub2_2.method4202((int) Static620.aFloat209 >> 3);
			Static562.method8096(local140);
		}
		if (Static638.aBoolean726 != Static466.aBoolean579) {
			Static466.aBoolean579 = Static638.aBoolean726;
			local140 = Static139.method2308(Static275.aClass130_80, Static24.aClass233_1);
			local140.aClass3_Sub3_Sub2_2.method4220(Static638.aBoolean726 ? 1 : 0);
			Static562.method8096(local140);
		}
		if (!Static168.aBoolean272) {
			local140 = Static139.method2308(Static591.aClass130_131, Static24.aClass233_1);
			local140.aClass3_Sub3_Sub2_2.method4220(0);
			local142 = local140.aClass3_Sub3_Sub2_2.anInt4736;
			@Pc(701) Class3_Sub3 local701 = Static262.aClass3_Sub27_12.method3238();
			local140.aClass3_Sub3_Sub2_2.method4237(0, local701.aByteArray54, local701.anInt4736);
			local140.aClass3_Sub3_Sub2_2.method4218(local140.aClass3_Sub3_Sub2_2.anInt4736 - local142);
			Static562.method8096(local140);
			Static168.aBoolean272 = true;
		}
		if (Static330.aClass77ArrayArrayArray2 != null) {
			if (Static305.anInt5422 == 2) {
				Static607.method8702();
			} else if (Static305.anInt5422 == 3) {
				Static169.method2961();
			}
		}
		if (Static613.aBoolean716) {
			Static613.aBoolean716 = false;
		} else {
			Static83.aFloat69 /= 2.0F;
		}
		if (Static120.aBoolean172) {
			Static120.aBoolean172 = false;
		} else {
			Static620.aFloat208 /= 2.0F;
		}
		Static204.method3517();
		if (Static485.anInt8420 != 10) {
			return;
		}
		Static144.method2656();
		Static252.method4093();
		Static446.method6927();
		Static343.anInt6699++;
		if (Static343.anInt6699 > 750) {
			Static567.method8638();
			return;
		}
		Static352.method5823();
		Static27.method1049();
		Static46.method1403();
		for (local60 = Static373.aClass150_1.method3827(true); local60 != -1; local60 = Static373.aClass150_1.method3827(false)) {
			Static334.method5457(local60);
			Static332.anIntArray374[Static231.anInt4366++ & 0x1F] = local60;
		}
		@Pc(880) Class279 local880;
		for (@Pc(822) Class3_Sub4_Sub12 local822 = Static357.method5863(); local822 != null; local822 = Static357.method5863()) {
			local455 = local822.method3610();
			local165 = local822.method3612();
			if (local455 == 1) {
				Static396.anIntArray394[local165] = local822.anInt4062;
				Static440.aBoolean552 |= Static515.aBooleanArray24[local165];
				Static379.anIntArray423[Static311.anInt7191++ & 0x1F] = local165;
			} else if (local455 == 2) {
				Static165.aStringArray16[local165] = local822.aString51;
				Static595.anIntArray663[Static199.anInt3911++ & 0x1F] = local165;
			} else if (local455 == 3) {
				local880 = Static433.method6771(local165);
				if (!local822.aString51.equals(local880.aString92)) {
					local880.aString92 = local822.aString51;
					Static482.method7193(local880);
				}
			} else if (local455 == 4) {
				local880 = Static433.method6771(local165);
				local235 = local822.anInt4062;
				local241 = local822.anInt4064;
				local252 = local822.anInt4065;
				if (local235 != local880.anInt8152 || local241 != local880.anInt8214 || local880.anInt8142 != local252) {
					local880.anInt8142 = local252;
					local880.anInt8214 = local241;
					local880.anInt8152 = local235;
					Static482.method7193(local880);
				}
			} else if (local455 == 5) {
				local880 = Static433.method6771(local165);
				if (local880.anInt8175 != local822.anInt4062 || local822.anInt4062 == -1) {
					local880.anInt8179 = 1;
					local880.anInt8145 = 0;
					local880.anInt8135 = 0;
					local880.anInt8175 = local822.anInt4062;
					@Pc(920) Class361 local920 = local880.anInt8175 == -1 ? null : Static115.aClass227_1.method5968(local880.anInt8175);
					if (local920 != null) {
						Static146.method2678(local920, local880.anInt8135);
					}
					Static482.method7193(local880);
				}
			} else if (local455 == 6) {
				local184 = local822.anInt4062;
				local235 = local184 >> 10 & 0x1F;
				local241 = local184 >> 5 & 0x1F;
				local252 = local184 & 0x1F;
				@Pc(1292) int local1292 = (local241 << 11) + (local235 << 19) + (local252 << 3);
				@Pc(1296) Class279 local1296 = Static433.method6771(local165);
				if (local1296.anInt8150 != local1292) {
					local1296.anInt8150 = local1292;
					Static482.method7193(local1296);
				}
			} else if (local455 == 7) {
				local880 = Static433.method6771(local165);
				@Pc(950) boolean local950 = local822.anInt4062 == 1;
				if (local880.aBoolean580 != local950) {
					local880.aBoolean580 = local950;
					Static482.method7193(local880);
				}
			} else if (local455 == 8) {
				local880 = Static433.method6771(local165);
				if (local822.anInt4062 != local880.anInt8218 || local880.anInt8188 != local822.anInt4064 || local880.anInt8201 != local822.anInt4065) {
					local880.anInt8201 = local822.anInt4065;
					local880.anInt8188 = local822.anInt4064;
					local880.anInt8218 = local822.anInt4062;
					if (local880.anInt8217 != -1) {
						if (local880.anInt8149 > 0) {
							local880.anInt8201 = local880.anInt8201 * 32 / local880.anInt8149;
						} else if (local880.anInt8191 > 0) {
							local880.anInt8201 = local880.anInt8201 * 32 / local880.anInt8191;
						}
					}
					Static482.method7193(local880);
				}
			} else if (local455 == 9) {
				local880 = Static433.method6771(local165);
				if (local880.anInt8217 != local822.anInt4062 || local880.anInt8155 != local822.anInt4064) {
					local880.anInt8217 = local822.anInt4062;
					local880.anInt8155 = local822.anInt4064;
					Static482.method7193(local880);
				}
			} else if (local455 == 10) {
				local880 = Static433.method6771(local165);
				if (local880.anInt8140 != local822.anInt4062 || local880.anInt8176 != local822.anInt4064 || local822.anInt4065 != local880.anInt8162) {
					local880.anInt8140 = local822.anInt4062;
					local880.anInt8162 = local822.anInt4065;
					local880.anInt8176 = local822.anInt4064;
					Static482.method7193(local880);
				}
			} else if (local455 == 11) {
				local880 = Static433.method6771(local165);
				local880.anInt8139 = local880.anInt8151 = local822.anInt4064;
				local880.aByte110 = 0;
				local880.anInt8200 = local880.anInt8157 = local822.anInt4062;
				local880.aByte109 = 0;
				Static482.method7193(local880);
			} else if (local455 == 12) {
				local880 = Static433.method6771(local165);
				local235 = local822.anInt4062;
				if (local880 != null && local880.anInt8204 == 0) {
					if (local235 > local880.anInt8131 - local880.anInt8141) {
						local235 = local880.anInt8131 - local880.anInt8141;
					}
					if (local235 < 0) {
						local235 = 0;
					}
					if (local235 != local880.anInt8130) {
						local880.anInt8130 = local235;
						Static482.method7193(local880);
					}
				}
			} else if (local455 == 14) {
				local880 = Static433.method6771(local165);
				local880.anInt8207 = local822.anInt4062;
			} else if (local455 == 15) {
				Static520.anInt9372 = local822.anInt4062;
				Static142.aBoolean634 = true;
				Static300.anInt5337 = local822.anInt4064;
			} else if (local455 == 16) {
				local880 = Static433.method6771(local165);
				local880.anInt8144 = local822.anInt4062;
			} else if (local455 == 17) {
				local880 = Static433.method6771(local165);
				local880.anInt8213 = local822.anInt4062;
			}
		}
		Static354.anInt6785++;
		if (Static501.anInt8621 != 0) {
			Static215.anInt4075 += 20;
			if (Static215.anInt4075 >= 400) {
				Static501.anInt8621 = 0;
			}
		}
		if (Static77.aClass279_2 != null) {
			Static368.anInt6960++;
			if (Static368.anInt6960 >= 15) {
				Static482.method7193(Static77.aClass279_2);
				Static77.aClass279_2 = null;
			}
		}
		Static87.aClass279_3 = null;
		Static465.aBoolean562 = false;
		Static376.aBoolean508 = false;
		Static600.aClass279_15 = null;
		Static556.method8021(-1, null, -1);
		Static464.method7045(null, -1, -1);
		if (!Static190.aBoolean232) {
			Static32.anInt7819 = -1;
		}
		Static163.method2897();
		Static371.anInt7006++;
		if (Static617.aBoolean718) {
			@Pc(1469) Class3_Sub14 local1469 = Static139.method2308(Static262.aClass130_78, Static24.aClass233_1);
			local1469.aClass3_Sub3_Sub2_2.method4266(Static423.anInt7640 << 14 | Static166.anInt3243 << 28 | Static165.anInt3237);
			Static562.method8096(local1469);
			Static617.aBoolean718 = false;
		}
		while (true) {
			@Pc(1492) Class3_Sub21 local1492;
			@Pc(1497) Class279 local1497;
			do {
				local1492 = (Class3_Sub21) Static82.aClass223_11.method5872();
				if (local1492 == null) {
					while (true) {
						do {
							local1492 = (Class3_Sub21) Static483.aClass223_50.method5872();
							if (local1492 == null) {
								while (true) {
									do {
										local1492 = (Class3_Sub21) Static443.aClass223_45.method5872();
										if (local1492 == null) {
											if (Static87.aClass279_3 == null) {
												Static242.anInt4494 = 0;
											}
											if (Static608.aClass279_18 != null) {
												Static179.method3112();
											}
											if (Static302.anInt5364 > 0 && Static339.aClass163_1.method4104(82) && Static339.aClass163_1.method4104(81) && Static472.anInt8271 != 0) {
												local455 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 - Static472.anInt8271;
												if (local455 < 0) {
													local455 = 0;
												} else if (local455 > 3) {
													local455 = 3;
												}
												Static94.method2090(Static171.anInt3340 + Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray309[0], local455, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray310[0] + Static299.anInt5307);
											}
											Static586.method8274();
											for (local455 = 0; local455 < 5; local455++) {
												@Pc(1696) int local1696 = Static293.anIntArray280[local455]++;
											}
											if (Static440.aBoolean552 && Static374.method6036() - 60000L > Static190.aLong102) {
												Static52.method1478();
											}
											for (@Pc(1723) Class4_Sub2_Sub1 local1723 = (Class4_Sub2_Sub1) Static643.aClass120_9.method2966(); local1723 != null; local1723 = (Class4_Sub2_Sub1) Static643.aClass120_9.method2962()) {
												if (Static374.method6036() / 1000L - 5L > (long) local1723.anInt4538) {
													if (local1723.aShort59 > 0) {
														Static582.method8231(local1723.aString53 + Static59.aClass43_19.method1598(Static325.anInt6083), "", 5, 0, "", "");
													}
													if (local1723.aShort59 == 0) {
														Static582.method8231(local1723.aString53 + Static59.aClass43_20.method1598(Static325.anInt6083), "", 5, 0, "", "");
													}
													local1723.method7841();
												}
											}
											Static642.anInt10211++;
											if (Static642.anInt10211 > 500) {
												Static642.anInt10211 = 0;
												local184 = (int) (Math.random() * 8.0D);
												if ((local184 & 0x4) == 4) {
													Static424.anInt7664 += Static149.anInt2954;
												}
												if ((local184 & 0x1) == 1) {
													Static409.anInt7484 += Static547.anInt1288;
												}
												if ((local184 & 0x2) == 2) {
													Static317.anInt5959 += Static478.anInt8361;
												}
											}
											if (Static409.anInt7484 < -50) {
												Static547.anInt1288 = 2;
											}
											if (Static317.anInt5959 < -55) {
												Static478.anInt8361 = 2;
											}
											if (Static409.anInt7484 > 50) {
												Static547.anInt1288 = -2;
											}
											if (Static424.anInt7664 < -40) {
												Static149.anInt2954 = 1;
											}
											if (Static317.anInt5959 > 55) {
												Static478.anInt8361 = -2;
											}
											Static625.anInt10193++;
											if (Static424.anInt7664 > 40) {
												Static149.anInt2954 = -1;
											}
											if (Static625.anInt10193 > 500) {
												Static625.anInt10193 = 0;
												local184 = (int) (Math.random() * 8.0D);
												if ((local184 & 0x1) == 1) {
													Static226.anInt1879 += Static433.anInt7814;
												}
												if ((local184 & 0x2) == 2) {
													Static517.anInt8961 += Static421.anInt7626;
												}
											}
											if (Static226.anInt1879 < -60) {
												Static433.anInt7814 = 2;
											}
											if (Static517.anInt8961 < -20) {
												Static421.anInt7626 = 1;
											}
											if (Static226.anInt1879 > 60) {
												Static433.anInt7814 = -2;
											}
											if (Static517.anInt8961 > 10) {
												Static421.anInt7626 = -1;
											}
											Static556.anInt9294++;
											if (Static556.anInt9294 > 50) {
												@Pc(1955) Class3_Sub14 local1955 = Static139.method2308(Static55.aClass130_24, Static24.aClass233_1);
												Static562.method8096(local1955);
											}
											if (Static146.aBoolean188) {
												Static595.method8719();
												Static146.aBoolean188 = false;
											}
											try {
												Static154.method2812();
												return;
											} catch (@Pc(1976) IOException local1976) {
												Static567.method8638();
												return;
											}
										}
										local1497 = local1492.aClass279_5;
										if (local1497.anInt8147 < 0) {
											break;
										}
										local880 = Static433.method6771(local1497.anInt8203);
									} while (local880 == null || local880.aClass279Array2 == null || local1497.anInt8147 >= local880.aClass279Array2.length || local880.aClass279Array2[local1497.anInt8147] != local1497);
									Static304.method4843(local1492);
								}
							}
							local1497 = local1492.aClass279_5;
							if (local1497.anInt8147 < 0) {
								break;
							}
							local880 = Static433.method6771(local1497.anInt8203);
						} while (local880 == null || local880.aClass279Array2 == null || local1497.anInt8147 >= local880.aClass279Array2.length || local1497 != local880.aClass279Array2[local1497.anInt8147]);
						Static304.method4843(local1492);
					}
				}
				local1497 = local1492.aClass279_5;
				if (local1497.anInt8147 < 0) {
					break;
				}
				local880 = Static433.method6771(local1497.anInt8203);
			} while (local880 == null || local880.aClass279Array2 == null || local880.aClass279Array2.length <= local1497.anInt8147 || local1497 != local880.aClass279Array2[local1497.anInt8147]);
			Static304.method4843(local1492);
		}
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)V")
	public static void method7187() {
		if (Static159.anIntArray159 != null) {
			return;
		}
		Static159.anIntArray159 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(40) double local40 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(51) double local51 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(58) double local58 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(60) double local60 = local58;
			@Pc(62) double local62 = local58;
			@Pc(64) double local64 = local58;
			if (local51 != 0.0D) {
				@Pc(78) double local78;
				if (local58 < 0.5D) {
					local78 = (local51 + 1.0D) * local58;
				} else {
					local78 = local51 + local58 - local58 * local51;
				}
				@Pc(95) double local95 = local58 * 2.0D - local78;
				@Pc(99) double local99 = local40 + 0.3333333333333333D;
				if (local99 > 1.0D) {
					local99--;
				}
				@Pc(113) double local113 = local40 - 0.3333333333333333D;
				if (local113 < 0.0D) {
					local113++;
				}
				if (local99 * 6.0D < 1.0D) {
					local60 = local95 + local99 * (local78 - local95) * 6.0D;
				} else if (local99 * 2.0D < 1.0D) {
					local60 = local78;
				} else if (local99 * 3.0D < 2.0D) {
					local60 = (0.6666666666666666D - local99) * (local78 - local95) * 6.0D + local95;
				} else {
					local60 = local95;
				}
				if (local40 * 6.0D < 1.0D) {
					local62 = local95 + local40 * 6.0D * (local78 - local95);
				} else if (local40 * 2.0D < 1.0D) {
					local62 = local78;
				} else if (local40 * 3.0D < 2.0D) {
					local62 = local95 + (0.6666666666666666D - local40) * (local78 - local95) * 6.0D;
				} else {
					local62 = local95;
				}
				if (local113 * 6.0D < 1.0D) {
					local64 = local113 * (local78 - local95) * 6.0D + local95;
				} else if (local113 * 2.0D < 1.0D) {
					local64 = local78;
				} else if (local113 * 3.0D < 2.0D) {
					local64 = (0.6666666666666666D - local113) * (-local95 + local78) * 6.0D + local95;
				} else {
					local64 = local95;
				}
			}
			local60 = Math.pow(local60, local24);
			local62 = Math.pow(local62, local24);
			local64 = Math.pow(local64, local24);
			@Pc(291) int local291 = (int) (local60 * 256.0D);
			@Pc(296) int local296 = (int) (local62 * 256.0D);
			@Pc(301) int local301 = (int) (local64 * 256.0D);
			@Pc(312) int local312 = (local291 << 16) + ((local296 << 8) + local301);
			Static159.anIntArray159[local26] = local312;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!ip;I)Ljava/lang/String;")
	public static String method7189(@OriginalArg(0) Class3_Sub4_Sub13 arg0) {
		if (arg0.aString56 == null || arg0.aString56.length() == 0) {
			return arg0.aString55 == null || arg0.aString55.length() <= 0 ? arg0.aString54 : arg0.aString54 + Static59.aClass43_32.method1598(Static325.anInt6083) + arg0.aString55;
		} else if (arg0.aString55 == null || arg0.aString55.length() <= 0) {
			return arg0.aString54 + Static59.aClass43_32.method1598(Static325.anInt6083) + arg0.aString56;
		} else {
			return arg0.aString54 + Static59.aClass43_32.method1598(Static325.anInt6083) + arg0.aString55 + Static59.aClass43_32.method1598(Static325.anInt6083) + arg0.aString56;
		}
	}
}
