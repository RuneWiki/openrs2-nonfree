import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!od", name = "n", descriptor = "I")
	public static int anInt6695;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "[Lclient!wo;")
	public static final Class4_Sub7_Sub19[] aClass4_Sub7_Sub19Array3 = new Class4_Sub7_Sub19[14];

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_46 = new Class223(64);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	public static void method5587() {
		Static272.anInt5182 = 0;
		for (@Pc(13) int local13 = 0; local13 < 2048; local13++) {
			Static590.aClass4_Sub9Array1[local13] = null;
			Static178.aByteArray43[local13] = 1;
			Static230.aClass319Array1[local13] = null;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIBI)V")
	public static void method5588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg2 > arg0) {
			for (local10 = arg0; local10 < arg2; local10++) {
				Static383.anIntArrayArray62[local10][arg1] = arg3;
			}
		} else {
			for (local10 = arg2; local10 < arg0; local10++) {
				Static383.anIntArrayArray62[local10][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public static void method5590() {
		if (Static72.anInt1537 > 1) {
			Static204.anInt4280 = Static191.anInt5895;
			Static72.anInt1537--;
		}
		if (Static2.aBoolean2) {
			Static2.aBoolean2 = false;
			Static25.method449();
			return;
		}
		if (!Static325.aBoolean431) {
			Static161.method3169();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static244.method4131(); local29++) {
		}
		if (Static598.anInt9831 != 10) {
			return;
		}
		@Pc(51) Class4_Sub41 local51;
		@Pc(60) int local60;
		while (Static271.method4383()) {
			local51 = Static128.method2707(Static568.aClass61_130, Class16_Sub3.lb);
			local51.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
			local60 = local51.aClass4_Sub9_Sub1_3.anInt7219;
			Static49.method782(local51.aClass4_Sub9_Sub1_3);
			local51.aClass4_Sub9_Sub1_3.method6028(local51.aClass4_Sub9_Sub1_3.anInt7219 - local60);
			Static551.method7603(local51);
		}
		if (Static325.aClass4_Sub39_1 == null) {
			if (Static184.method3422() >= Static173.aLong90) {
				Static325.aClass4_Sub39_1 = Static528.aClass348_1.method7772(Static238.aClass300_10.aString89);
			}
		} else if (Static325.aClass4_Sub39_1.anInt7503 != -1) {
			local51 = Static128.method2707(Static137.aClass61_33, Class16_Sub3.lb);
			local51.aClass4_Sub9_Sub1_3.method6012(Static325.aClass4_Sub39_1.anInt7503);
			Static551.method7603(local51);
			Static325.aClass4_Sub39_1 = null;
			Static173.aLong90 = Static184.method3422() + 30000L;
		}
		@Pc(126) Class4_Sub22 local126 = (Class4_Sub22) Static324.aClass124_28.method3267();
		@Pc(139) int local139;
		@Pc(162) int local162;
		@Pc(178) int local178;
		@Pc(221) int local221;
		@Pc(228) int local228;
		@Pc(239) int local239;
		@Pc(137) Class4_Sub41 local137;
		if (local126 != null || Static184.method3422() - 2000L > Static523.aLong269) {
			local137 = null;
			local139 = 0;
			for (@Pc(144) Class4_Sub22 local144 = (Class4_Sub22) Static251.aClass124_24.method3267(); local144 != null && (local137 == null || local137.aClass4_Sub9_Sub1_3.anInt7219 - local139 < 240); local144 = (Class4_Sub22) Static251.aClass124_24.method3273()) {
				local144.method8013();
				local162 = local144.method7270();
				if (local162 < -1) {
					local162 = -1;
				} else if (local162 > 65534) {
					local162 = 65534;
				}
				local178 = local144.method7271();
				if (local178 < -1) {
					local178 = -1;
				} else if (local178 > 65534) {
					local178 = 65534;
				}
				if (Static566.anInt9470 != local178 || Static233.anInt4744 != local162) {
					if (local137 == null) {
						local137 = Static128.method2707(Static286.aClass61_116, Class16_Sub3.lb);
						local137.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
						local139 = local137.aClass4_Sub9_Sub1_3.anInt7219;
					}
					local221 = local178 - Static566.anInt9470;
					Static566.anInt9470 = local178;
					local228 = local162 - Static233.anInt4744;
					Static233.anInt4744 = local162;
					local239 = (int) ((local144.method7273() - Static523.aLong269) / 20L);
					if (local239 < 8 && local221 >= -32 && local221 <= 31 && local228 >= -32 && local228 <= 31) {
						local221 += 32;
						local228 += 32;
						local137.aClass4_Sub9_Sub1_3.method6012(local228 + (local221 << 6) + (local239 << 12));
					} else if (local239 < 32 && local221 >= -128 && local221 <= 127 && local228 >= -128 && local228 <= 127) {
						local221 += 128;
						local228 += 128;
						local137.aClass4_Sub9_Sub1_3.method5961(-345277664, local239 + 128);
						local137.aClass4_Sub9_Sub1_3.method6012(local228 + (local221 << 8));
					} else if (local239 < 32) {
						local137.aClass4_Sub9_Sub1_3.method5961(-345277664, local239 + 192);
						if (local178 == 1 || local162 == -1) {
							local137.aClass4_Sub9_Sub1_3.method5963(Integer.MIN_VALUE);
						} else {
							local137.aClass4_Sub9_Sub1_3.method5963(local162 << 16 | local178);
						}
					} else {
						local137.aClass4_Sub9_Sub1_3.method6012(local239 + 57344);
						if (local178 == 1 || local162 == -1) {
							local137.aClass4_Sub9_Sub1_3.method5963(Integer.MIN_VALUE);
						} else {
							local137.aClass4_Sub9_Sub1_3.method5963(local162 << 16 | local178);
						}
					}
					Static523.aLong269 = local144.method7273();
				}
			}
			if (local137 != null) {
				local137.aClass4_Sub9_Sub1_3.method6028(local137.aClass4_Sub9_Sub1_3.anInt7219 - local139);
				Static551.method7603(local137);
			}
		}
		@Pc(435) int local435;
		if (local126 != null) {
			@Pc(421) long local421 = (local126.method7273() - Static136.aLong67) / 50L;
			Static136.aLong67 = local126.method7273();
			if (local421 > 32767L) {
				local421 = 32767L;
			}
			local435 = local126.method7270();
			if (local435 < 0) {
				local435 = 0;
			} else if (local435 > 65535) {
				local435 = 65535;
			}
			local162 = local126.method7271();
			if (local162 < 0) {
				local162 = 0;
			} else if (local162 > 65535) {
				local162 = 65535;
			}
			@Pc(469) byte local469 = 0;
			if (local126.method7272() == 2) {
				local469 = 1;
			}
			local221 = (int) local421;
			@Pc(490) Class4_Sub41 local490 = Static128.method2707(Static93.aClass61_21, Class16_Sub3.lb);
			local490.aClass4_Sub9_Sub1_3.method5984(local221 | local469 << 15);
			local490.aClass4_Sub9_Sub1_3.method5963(local435 << 16 | local162);
			Static551.method7603(local490);
		}
		if (Static545.anInt9177 > 0) {
			local137 = Static128.method2707(Static181.aClass61_44, Class16_Sub3.lb);
			local137.aClass4_Sub9_Sub1_3.method5961(-345277664, Static545.anInt9177 * 3);
			for (local139 = 0; local139 < Static545.anInt9177; local139++) {
				@Pc(537) Interface24 local537 = Static365.anInterface24Array2[local139];
				@Pc(546) long local546 = (local537.method6738() - Static138.aLong275) / 50L;
				Static138.aLong275 = local537.method6738();
				if (local546 > 65535L) {
					local546 = 65535L;
				}
				local137.aClass4_Sub9_Sub1_3.method5961(-345277664, local537.method6739());
				local137.aClass4_Sub9_Sub1_3.method6012((int) local546);
			}
			Static551.method7603(local137);
		}
		if (Static462.anInt7835 > 0) {
			Static462.anInt7835--;
		}
		if (Static279.aBoolean393 && Static462.anInt7835 <= 0) {
			Static279.aBoolean393 = false;
			Static462.anInt7835 = 20;
			local137 = Static128.method2707(Static311.aClass61_72, Class16_Sub3.lb);
			local137.aClass4_Sub9_Sub1_3.method6011((int) Static330.aFloat102 >> 3);
			local137.aClass4_Sub9_Sub1_3.method5984((int) Static477.aFloat164 >> 3);
			Static551.method7603(local137);
		}
		if (Static449.aBoolean540 != Static340.aBoolean446) {
			Static449.aBoolean540 = Static340.aBoolean446;
			local137 = Static128.method2707(Static589.aClass61_134, Class16_Sub3.lb);
			local137.aClass4_Sub9_Sub1_3.method5961(-345277664, Static340.aBoolean446 ? 1 : 0);
			Static551.method7603(local137);
		}
		if (!Static47.aBoolean78) {
			local137 = Static128.method2707(Static134.aClass61_84, Class16_Sub3.lb);
			local137.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
			local139 = local137.aClass4_Sub9_Sub1_3.anInt7219;
			@Pc(680) Class4_Sub9 local680 = new Class4_Sub9(Static12.method272());
			Static189.aClass4_Sub2_Sub1_1.method7639(local680);
			local137.aClass4_Sub9_Sub1_3.method5985(local680.aByteArray97, local680.anInt7219);
			local137.aClass4_Sub9_Sub1_3.method6028(local137.aClass4_Sub9_Sub1_3.anInt7219 - local139);
			Static551.method7603(local137);
			Static47.aBoolean78 = true;
		}
		if (Static309.aClass100ArrayArrayArray2 != null) {
			if (Static555.anInt9335 == 2) {
				Static236.method4045();
			} else if (Static555.anInt9335 == 3) {
				Static548.method7572();
			}
		}
		if (Static233.aBoolean354) {
			Static233.aBoolean354 = false;
		} else {
			Static432.aFloat144 /= 2.0F;
		}
		if (Static580.aBoolean214) {
			Static580.aBoolean214 = false;
		} else {
			Static189.aFloat90 /= 2.0F;
		}
		Static332.method4995();
		if (Static598.anInt9831 != 10) {
			return;
		}
		Static2.method50();
		Static286.method7185();
		Static402.method5815();
		Static20.method400();
		Static218.anInt4452++;
		if (Static218.anInt4452 > 750) {
			Static25.method449();
			return;
		}
		Static95.method7584();
		Static345.method5138();
		Static473.method6595();
		for (local60 = Static511.aClass335_2.method7425(true); local60 != -1; local60 = Static511.aClass335_2.method7425(false)) {
			Static124.method2651(local60);
			Static456.anIntArray625[Static501.anInt8685++ & 0x1F] = local60;
		}
		@Pc(863) Class115 local863;
		for (@Pc(812) Class4_Sub7_Sub5 local812 = Static476.method6629(); local812 != null; local812 = Static476.method6629()) {
			local435 = local812.method3063();
			local162 = local812.method3067();
			if (local435 == 1) {
				Static435.anIntArray612[local162] = local812.anInt3348;
				Static195.aBoolean312 |= Static23.aBooleanArray6[local162];
				Static333.anIntArray484[Static104.anInt2561++ & 0x1F] = local162;
			} else if (local435 == 2) {
				Static200.aStringArray15[local162] = local812.aString29;
				Static386.anIntArray546[Static174.anInt3756++ & 0x1F] = local162;
			} else if (local435 == 3) {
				local863 = Static92.method2118(local162);
				if (!local812.aString29.equals(local863.aString32)) {
					local863.aString32 = local812.aString29;
					Static330.method4950(local863);
				}
			} else if (local435 == 4) {
				local863 = Static92.method2118(local162);
				local221 = local812.anInt3348;
				local228 = local812.anInt3353;
				local239 = local812.anInt3351;
				if (local221 != local863.anInt3445 || local228 != local863.anInt3508 || local863.anInt3454 != local239) {
					local863.anInt3454 = local239;
					local863.anInt3508 = local228;
					local863.anInt3445 = local221;
					Static330.method4950(local863);
				}
			} else if (local435 == 5) {
				local863 = Static92.method2118(local162);
				if (local863.anInt3494 != local812.anInt3348 || local812.anInt3348 == -1) {
					local863.anInt3494 = local812.anInt3348;
					local863.anInt3524 = 0;
					local863.anInt3460 = 0;
					local863.anInt3491 = 1;
					@Pc(1336) Class77 local1336 = local863.anInt3494 == -1 ? null : Static168.aClass327_2.method7326(local863.anInt3494);
					if (local1336 != null) {
						Static443.method6270(local863.anInt3460, local1336);
					}
					Static330.method4950(local863);
				}
			} else if (local435 == 6) {
				local178 = local812.anInt3348;
				local221 = local178 >> 10 & 0x1F;
				local228 = local178 >> 5 & 0x1F;
				local239 = local178 & 0x1F;
				@Pc(1280) int local1280 = (local228 << 11) + (local221 << 19) + (local239 << 3);
				@Pc(1284) Class115 local1284 = Static92.method2118(local162);
				if (local1280 != local1284.anInt3502) {
					local1284.anInt3502 = local1280;
					Static330.method4950(local1284);
				}
			} else if (local435 == 7) {
				local863 = Static92.method2118(local162);
				@Pc(933) boolean local933 = local812.anInt3348 == 1;
				if (local863.aBoolean283 != local933) {
					local863.aBoolean283 = local933;
					Static330.method4950(local863);
				}
			} else if (local435 == 8) {
				local863 = Static92.method2118(local162);
				if (local812.anInt3348 != local863.anInt3444 || local812.anInt3353 != local863.anInt3492 || local863.anInt3467 != local812.anInt3351) {
					local863.anInt3467 = local812.anInt3351;
					local863.anInt3492 = local812.anInt3353;
					local863.anInt3444 = local812.anInt3348;
					if (local863.anInt3510 != -1) {
						if (local863.anInt3514 > 0) {
							local863.anInt3467 = local863.anInt3467 * 32 / local863.anInt3514;
						} else if (local863.anInt3528 > 0) {
							local863.anInt3467 = local863.anInt3467 * 32 / local863.anInt3528;
						}
					}
					Static330.method4950(local863);
				}
			} else if (local435 == 9) {
				local863 = Static92.method2118(local162);
				if (local812.anInt3348 != local863.anInt3510 || local812.anInt3353 != local863.anInt3487) {
					local863.anInt3487 = local812.anInt3353;
					local863.anInt3510 = local812.anInt3348;
					Static330.method4950(local863);
				}
			} else if (local435 == 10) {
				local863 = Static92.method2118(local162);
				if (local812.anInt3348 != local863.anInt3476 || local863.anInt3477 != local812.anInt3353 || local863.anInt3472 != local812.anInt3351) {
					local863.anInt3476 = local812.anInt3348;
					local863.anInt3477 = local812.anInt3353;
					local863.anInt3472 = local812.anInt3351;
					Static330.method4950(local863);
				}
			} else if (local435 == 11) {
				local863 = Static92.method2118(local162);
				local863.aByte40 = 0;
				local863.aByte41 = 0;
				local863.anInt3458 = local863.anInt3473 = local812.anInt3353;
				local863.anInt3456 = local863.anInt3447 = local812.anInt3348;
				Static330.method4950(local863);
			} else if (local435 == 12) {
				local863 = Static92.method2118(local162);
				local221 = local812.anInt3348;
				if (local863 != null && local863.anInt3519 == 0) {
					if (local221 > local863.anInt3484 - local863.anInt3481) {
						local221 = local863.anInt3484 - local863.anInt3481;
					}
					if (local221 < 0) {
						local221 = 0;
					}
					if (local863.anInt3526 != local221) {
						local863.anInt3526 = local221;
						Static330.method4950(local863);
					}
				}
			} else if (local435 == 14) {
				local863 = Static92.method2118(local162);
				local863.anInt3442 = local812.anInt3348;
			} else if (local435 == 15) {
				Static357.aBoolean462 = true;
				Static435.anInt7462 = local812.anInt3353;
				Static319.anInt5739 = local812.anInt3348;
			} else if (local435 == 16) {
				local863 = Static92.method2118(local162);
				local863.anInt3478 = local812.anInt3348;
			}
		}
		if (Static594.anInt9770 != 0) {
			Static95.anInt9215 += 20;
			if (Static95.anInt9215 >= 400) {
				Static594.anInt9770 = 0;
			}
		}
		Static426.anInt7338++;
		if (Static198.aClass115_9 != null) {
			Static187.anInt8847++;
			if (Static187.anInt8847 >= 15) {
				Static330.method4950(Static198.aClass115_9);
				Static198.aClass115_9 = null;
			}
		}
		Static593.aClass115_15 = null;
		Static6.aBoolean5 = false;
		Static149.aClass115_7 = null;
		Static347.aBoolean454 = false;
		Static501.method7139(null, -1, -1);
		Static387.method7906(null, -1, -1);
		if (!Static524.aBoolean617) {
			Static485.anInt8162 = -1;
		}
		Static429.method6117();
		Static191.anInt5895++;
		if (Static384.aBoolean506) {
			@Pc(1458) Class4_Sub41 local1458 = Static128.method2707(Static310.aClass61_71, Class16_Sub3.lb);
			local1458.aClass4_Sub9_Sub1_3.method5983(Static23.anInt445 | Static249.anInt4943 << 28 | Static219.anInt4468 << 14);
			Static551.method7603(local1458);
			Static384.aBoolean506 = false;
		}
		while (true) {
			@Pc(1481) Class4_Sub12 local1481;
			@Pc(1486) Class115 local1486;
			do {
				local1481 = (Class4_Sub12) Static413.aClass124_45.method3272();
				if (local1481 == null) {
					while (true) {
						do {
							local1481 = (Class4_Sub12) Static436.aClass124_46.method3272();
							if (local1481 == null) {
								while (true) {
									do {
										local1481 = (Class4_Sub12) Static577.aClass124_67.method3272();
										if (local1481 == null) {
											if (Static593.aClass115_15 == null) {
												Static171.anInt3692 = 0;
											}
											if (Static287.aClass115_12 != null) {
												Static160.method3165();
											}
											if (Static540.anInt9129 > 0 && Static12.aClass173_1.method6259(82) && Static12.aClass173_1.method6259(81) && Static551.anInt9250 != 0) {
												local435 = Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101 - Static551.anInt9250;
												if (local435 < 0) {
													local435 = 0;
												} else if (local435 > 3) {
													local435 = 3;
												}
												Static460.method6469(Static6.anInt97 + Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray654[0], local435, Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray653[0] + anInt6695);
											}
											Static221.method3809();
											for (local435 = 0; local435 < 5; local435++) {
												@Pc(1691) int local1691 = Static133.anIntArray297[local435]++;
											}
											if (Static195.aBoolean312 && Static439.aLong296 < Static184.method3422() - 60000L) {
												Static388.method5705();
											}
											for (@Pc(1720) Class26_Sub1_Sub2 local1720 = (Class26_Sub1_Sub2) Static259.aClass8_3.method110(); local1720 != null; local1720 = (Class26_Sub1_Sub2) Static259.aClass8_3.method113()) {
												if (Static184.method3422() / 1000L - 5L > (long) local1720.anInt6645) {
													if (local1720.aShort89 > 0) {
														Static410.method5899("", "", local1720.aString78 + Static275.aClass198_18.method4407(Static56.anInt953), 5, "", 0);
													}
													if (local1720.aShort89 == 0) {
														Static410.method5899("", "", local1720.aString78 + Static275.aClass198_19.method4407(Static56.anInt953), 5, "", 0);
													}
													local1720.method7575();
												}
											}
											Static25.anInt465++;
											if (Static25.anInt465 > 500) {
												Static25.anInt465 = 0;
												local178 = (int) (Math.random() * 8.0D);
												if ((local178 & 0x4) == 4) {
													Static164.anInt3575 += Static537.anInt9072;
												}
												if ((local178 & 0x1) == 1) {
													Static50.anInt9380 += Static589.anInt9683;
												}
												if ((local178 & 0x2) == 2) {
													Static592.anInt9725 += Static550.anInt9239;
												}
											}
											if (Static50.anInt9380 < -50) {
												Static589.anInt9683 = 2;
											}
											if (Static592.anInt9725 < -55) {
												Static550.anInt9239 = 2;
											}
											if (Static50.anInt9380 > 50) {
												Static589.anInt9683 = -2;
											}
											if (Static164.anInt3575 < -40) {
												Static537.anInt9072 = 1;
											}
											if (Static592.anInt9725 > 55) {
												Static550.anInt9239 = -2;
											}
											if (Static164.anInt3575 > 40) {
												Static537.anInt9072 = -1;
											}
											Static519.anInt8872++;
											if (Static519.anInt8872 > 500) {
												Static519.anInt8872 = 0;
												local178 = (int) (Math.random() * 8.0D);
												if ((local178 & 0x1) == 1) {
													Static402.anInt6978 += Static422.anInt7309;
												}
												if ((local178 & 0x2) == 2) {
													Static380.anInt6751 += Static267.anInt5144;
												}
											}
											if (Static402.anInt6978 < -60) {
												Static422.anInt7309 = 2;
											}
											if (Static380.anInt6751 < -20) {
												Static267.anInt5144 = 1;
											}
											if (Static402.anInt6978 > 60) {
												Static422.anInt7309 = -2;
											}
											Static248.anInt4940++;
											if (Static380.anInt6751 > 10) {
												Static267.anInt5144 = -1;
											}
											if (Static248.anInt4940 > 50) {
												@Pc(1956) Class4_Sub41 local1956 = Static128.method2707(Static174.aClass61_42, Class16_Sub3.lb);
												Static551.method7603(local1956);
											}
											if (Static532.aBoolean629) {
												Static355.method5247();
												Static532.aBoolean629 = false;
											}
											try {
												Static315.method4803();
												return;
											} catch (@Pc(1969) IOException local1969) {
												Static25.method449();
												return;
											}
										}
										local1486 = local1481.aClass115_5;
										if (local1486.anInt3517 < 0) {
											break;
										}
										local863 = Static92.method2118(local1486.anInt3441);
									} while (local863 == null || local863.aClass115Array1 == null || local1486.anInt3517 >= local863.aClass115Array1.length || local863.aClass115Array1[local1486.anInt3517] != local1486);
									Static205.method3636(local1481);
								}
							}
							local1486 = local1481.aClass115_5;
							if (local1486.anInt3517 < 0) {
								break;
							}
							local863 = Static92.method2118(local1486.anInt3441);
						} while (local863 == null || local863.aClass115Array1 == null || local863.aClass115Array1.length <= local1486.anInt3517 || local863.aClass115Array1[local1486.anInt3517] != local1486);
						Static205.method3636(local1481);
					}
				}
				local1486 = local1481.aClass115_5;
				if (local1486.anInt3517 < 0) {
					break;
				}
				local863 = Static92.method2118(local1486.anInt3441);
			} while (local863 == null || local863.aClass115Array1 == null || local1486.anInt3517 >= local863.aClass115Array1.length || local863.aClass115Array1[local1486.anInt3517] != local1486);
			Static205.method3636(local1481);
		}
	}
}
