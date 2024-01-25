import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!mu", name = "gb", descriptor = "Lclient!gp;")
	public static Class117 aClass117_142;

	@OriginalMember(owner = "client!mu", name = "nb", descriptor = "I")
	public static int anInt6139 = -1;

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(B)V")
	public static void method5104() {
		if (Static93.anInt2151 == -1 || Static466.anInt7999 == -1) {
			return;
		}
		@Pc(25) int local25 = Static26.anInt529 + (Static10.anInt155 * (Static132.anInt2748 - Static26.anInt529) >> 16);
		Static10.anInt155 += local25;
		if (Static10.anInt155 < 65535) {
			Static528.aBoolean624 = false;
			Static381.aBoolean491 = false;
		} else {
			Static10.anInt155 = 65535;
			if (Static528.aBoolean624) {
				Static381.aBoolean491 = false;
			} else {
				Static381.aBoolean491 = true;
			}
			Static528.aBoolean624 = true;
		}
		@Pc(57) float local57 = (float) Static10.anInt155 / 65535.0F;
		@Pc(60) float[] local60 = new float[3];
		@Pc(64) int local64 = Static195.anInt3784 * 2;
		@Pc(90) int local90;
		@Pc(123) int local123;
		@Pc(131) int local131;
		@Pc(136) int local136;
		@Pc(145) int local145;
		@Pc(163) int local163;
		for (@Pc(66) int local66 = 0; local66 < 3; local66++) {
			@Pc(78) int local78 = Static438.anIntArrayArrayArray11[Static93.anInt2151][local64][local66] * 3;
			local90 = Static438.anIntArrayArrayArray11[Static93.anInt2151][local64 + 1][local66] * 3;
			local123 = (Static438.anIntArrayArrayArray11[Static93.anInt2151][local64 + 2][local66] + Static438.anIntArrayArrayArray11[Static93.anInt2151][local64 + 2][local66] - Static438.anIntArrayArrayArray11[Static93.anInt2151][local64 - -3][local66]) * 3;
			local131 = Static438.anIntArrayArrayArray11[Static93.anInt2151][local64][local66];
			local136 = local90 - local78;
			local145 = local123 + local78 - local90 * 2;
			local163 = local90 + Static438.anIntArrayArrayArray11[Static93.anInt2151][local64 + 2][local66] - local123 - local131;
			local60[local66] = local57 * (((float) local163 * local57 + (float) local145) * local57 + (float) local136) + (float) local131;
		}
		Static182.anInt3520 = (int) local60[1] * -1;
		Static364.anInt6817 = (int) local60[2] - Static338.anInt6353 * 128;
		Static367.anInt6861 = (int) local60[0] - Static515.anInt3214 * 128;
		@Pc(218) float[] local218 = new float[3];
		local90 = Static228.anInt4308 * 2;
		for (local123 = 0; local123 < 3; local123++) {
			local131 = Static438.anIntArrayArrayArray11[Static466.anInt7999][local90][local123] * 3;
			local136 = Static438.anIntArrayArrayArray11[Static466.anInt7999][local90 + 1][local123] * 3;
			local145 = (Static438.anIntArrayArrayArray11[Static466.anInt7999][local90 + 2][local123] + Static438.anIntArrayArrayArray11[Static466.anInt7999][local90 + 2][local123] - Static438.anIntArrayArrayArray11[Static466.anInt7999][local90 + 3][local123]) * 3;
			local163 = Static438.anIntArrayArrayArray11[Static466.anInt7999][local90][local123];
			@Pc(294) int local294 = local136 - local131;
			@Pc(303) int local303 = local145 + local131 - local136 * 2;
			@Pc(320) int local320 = Static438.anIntArrayArrayArray11[Static466.anInt7999][local90 + 2][local123] + local136 - local145 - local163;
			local218[local123] = (float) local163 + (local57 * (local57 * (float) local320 + (float) local303) + (float) local294) * local57;
		}
		@Pc(355) float local355 = local218[0] - local60[0];
		@Pc(365) float local365 = (local218[1] - local60[1]) * -1.0F;
		@Pc(373) float local373 = local218[2] - local60[2];
		@Pc(383) double local383 = Math.sqrt((double) (local355 * local355 + local373 * local373));
		Static180.anInt3500 = (int) (Math.atan2((double) local365, local383) * 2607.5945876176133D) & 0x3FFF;
		Static141.anInt2910 = (int) (-Math.atan2((double) local355, (double) local373) * 2607.5945876176133D) & 0x3FFF;
		Static530.anInt8939 = Static438.anIntArrayArrayArray11[Static93.anInt2151][local64][3] + ((Static438.anIntArrayArrayArray11[Static93.anInt2151][local64 + 2][3] - Static438.anIntArrayArrayArray11[Static93.anInt2151][local64][3]) * Static10.anInt155 >> 16);
	}

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "(B)V")
	public static void method5105() {
		if (Static480.anInt8291 < 0) {
			return;
		}
		@Pc(4) long local4 = Static105.method2132();
		Static480.anInt8291 = (int) ((long) Static480.anInt8291 + Static505.aLong225 - local4);
		if (Static480.anInt8291 <= 0) {
			Static426.anInt7527 = Static442.aClass227_2.anInt6893;
			Static497.aFloat370 = Static442.aClass227_2.aFloat301;
			Static480.anInt8291 = -1;
			Static482.aFloat346 = Static442.aClass227_2.aFloat300;
			Static174.anInt3441 = Static442.aClass227_2.anInt6892;
			Static291.aFloat253 = Static442.aClass227_2.aFloat296;
			Static122.anInt2577 = Static442.aClass227_2.anInt6896;
			Static59.aFloat39 = Static442.aClass227_2.aFloat298;
			Static477.aFloat341 = Static442.aClass227_2.aFloat299;
			Static232.aClass92_2 = Static442.aClass227_2.aClass92_3;
			Static457.aFloat331 = Static442.aClass227_2.aFloat297;
		} else {
			@Pc(58) int local58 = (Static480.anInt8291 << 8) / Static231.anInt4353;
			@Pc(63) int local63 = 255 - local58;
			@Pc(68) float local68 = (float) local58 / 255.0F;
			@Pc(72) float local72 = 1.0F - local68;
			Static426.anInt7527 = ((Static442.aClass227_2.anInt6893 & 0xFF00FF) * local63 + (Static378.anInt6960 & 0xFF00FF) * local58 & 0xFF00FF00) + ((Static378.anInt6960 & 0xFF00) * local58 + local63 * (Static442.aClass227_2.anInt6893 & 0xFF00) & 0xFF0000) >>> 8;
			Static174.anInt3441 = (local63 * (Static442.aClass227_2.anInt6892 & 0xFF00FF) + (Static230.anInt4326 & 0xFF00FF) * local58 & 0xFF00FF00) + ((Static442.aClass227_2.anInt6892 & 0xFF00) * local63 + (Static230.anInt4326 & 0xFF00) * local58 & 0xFF0000) >>> 8;
			Static477.aFloat341 = Static413.aFloat369 + local72 * (Static442.aClass227_2.aFloat299 - Static413.aFloat369);
			Static122.anInt2577 = Static84.anInt1593 * local58 + Static442.aClass227_2.anInt6896 * local63 >> 8;
			Static482.aFloat346 = Static256.aFloat219 + local72 * (Static442.aClass227_2.aFloat300 - Static256.aFloat219);
			Static291.aFloat253 = Static540.aFloat368 + (Static442.aClass227_2.aFloat296 - Static540.aFloat368) * local72;
			Static497.aFloat370 = Static76.aFloat54 + (Static442.aClass227_2.aFloat301 - Static76.aFloat54) * local72;
			Static457.aFloat331 = Static261.aFloat221 + local72 * (Static442.aClass227_2.aFloat297 - Static261.aFloat221);
			Static59.aFloat39 = Static403.aFloat309 + (Static442.aClass227_2.aFloat298 - Static403.aFloat309) * local72;
			if (Static122.aClass92_1 != Static442.aClass227_2.aClass92_3) {
				Static232.aClass92_2 = Static206.aClass62_24.method7052(Static122.aClass92_1, Static442.aClass227_2.aClass92_3, local72, Static232.aClass92_2);
			}
		}
		Static505.aLong225 = local4;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!aj;BI)Z")
	public static boolean method5106(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0.method524(2);
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(109) int local109;
		@Pc(113) int local113;
		@Pc(119) int local119;
		if (local10 == 0) {
			if (arg0.method524(1) != 0) {
				method5106(arg0, arg1);
			}
			local33 = arg0.method524(6);
			local38 = arg0.method524(6);
			@Pc(52) boolean local52 = arg0.method524(1) == 1;
			if (local52) {
				Static400.anIntArray557[Static457.anInt7876++] = arg1;
			}
			if (Static10.aClass15_Sub2_Sub1_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(75) Class205 local75 = Static543.aClass205Array2[arg1];
			@Pc(83) Class15_Sub2_Sub1_Sub1 local83 = Static10.aClass15_Sub2_Sub1_Sub1Array1[arg1] = new Class15_Sub2_Sub1_Sub1();
			local83.anInt4745 = arg1;
			if (Static294.aClass5_Sub3Array2[arg1] != null) {
				local83.method803(Static294.aClass5_Sub3Array2[arg1]);
			}
			local83.method4025(local75.anInt6253, true);
			local83.anInt4720 = local75.anInt6254;
			local109 = local75.anInt6255;
			local113 = local109 >> 28;
			local119 = local109 >> 14 & 0xFF;
			local83.aBoolean33 = local75.aBoolean427;
			@Pc(127) int local127 = local109 & 0xFF;
			local83.aByteArray59[0] = Static444.aByteArray110[arg1];
			local83.aByte91 = (byte) local113;
			local83.method800(local33 + (local119 << 6) - Static515.anInt3214, (local127 << 6) - (-local38 - -Static338.anInt6353));
			local83.aBoolean31 = false;
			Static543.aClass205Array2[arg1] = null;
			return true;
		} else if (local10 == 1) {
			local33 = arg0.method524(2);
			local38 = Static543.aClass205Array2[arg1].anInt6255;
			Static543.aClass205Array2[arg1].anInt6255 = (((local38 >> 28) + local33 & 0x3) << 28) + (local38 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(217) int local217;
			@Pc(222) int local222;
			@Pc(230) int local230;
			if (local10 != 2) {
				local33 = arg0.method524(18);
				local38 = local33 >> 16;
				local217 = local33 >> 8 & 0xFF;
				local222 = local33 & 0xFF;
				local230 = Static543.aClass205Array2[arg1].anInt6255;
				local109 = local38 + (local230 >> 28) & 0x3;
				local113 = local217 + (local230 >> 14) & 0xFF;
				local119 = local230 + local222 & 0xFF;
				Static543.aClass205Array2[arg1].anInt6255 = (local109 << 28) - (-(local113 << 14) - local119);
				return false;
			}
			local33 = arg0.method524(5);
			local38 = local33 >> 3;
			local217 = local33 & 0x7;
			local222 = Static543.aClass205Array2[arg1].anInt6255;
			local230 = local38 + (local222 >> 28) & 0x3;
			local109 = local222 >> 14 & 0xFF;
			local113 = local222 & 0xFF;
			if (local217 == 0) {
				local113--;
				local109--;
			}
			if (local217 == 1) {
				local113--;
			}
			if (local217 == 2) {
				local109++;
				local113--;
			}
			if (local217 == 3) {
				local109--;
			}
			if (local217 == 4) {
				local109++;
			}
			if (local217 == 5) {
				local109--;
				local113++;
			}
			if (local217 == 6) {
				local113++;
			}
			if (local217 == 7) {
				local109++;
				local113++;
			}
			Static543.aClass205Array2[arg1].anInt6255 = local113 + (local230 << 28) + (local109 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method5107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < 1 || arg4 < 1 || Static460.anInt7894 - 2 < arg3 || arg4 > Static235.anInt4493 - 2) {
			return;
		}
		@Pc(27) int local27 = arg2;
		if (arg2 < 3 && Static279.method4553(arg4, arg3)) {
			local27 = arg2 + 1;
		}
		if (!Static300.aClass5_Sub28_Sub1_1.method4118(Static17.anInt459) && !Static189.method4028(arg4, arg3, Static283.anInt5784, local27)) {
			return;
		}
		if (Static152.aClass37ArrayArrayArray1 == null) {
			return;
		}
		Static111.aClass130_Sub1_1.method5432(arg5, Static110.aClass62_15, arg3, Static71.aClass10Array3[arg2], arg2, arg4);
		if (arg6 >= 0) {
			@Pc(73) boolean local73 = Static300.aClass5_Sub28_Sub1_1.aBoolean333;
			Static300.aClass5_Sub28_Sub1_1.aBoolean333 = true;
			Static111.aClass130_Sub1_1.method5433(arg2, Static110.aClass62_15, arg4, arg3, arg0, Static71.aClass10Array3[arg2], arg6, arg1, local27, arg7);
			Static300.aClass5_Sub28_Sub1_1.aBoolean333 = local73;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIIIIB[Lclient!oh;)V")
	public static void method5109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class220[] arg8) {
		Static110.aClass62_15.N(arg3, arg7, arg1, arg5);
		for (@Pc(13) int local13 = 0; local13 < arg8.length; local13++) {
			@Pc(19) Class220 local19 = arg8[local13];
			if (local19 != null && (local19.anInt6605 == arg4 || arg4 == -1412584499 && local19 == Static499.aClass220_17)) {
				@Pc(39) int local39;
				if (arg6 == -1) {
					Class192.aRectangleArray3[Static423.anInt7490].setBounds(local19.anInt6603 + arg0, local19.anInt6631 - -arg2, local19.anInt6627, local19.anInt6681);
					local39 = Static423.anInt7490++;
				} else {
					local39 = arg6;
				}
				local19.anInt6607 = local39;
				local19.anInt6632 = Static481.anInt8318;
				if (!Static68.method1302(local19)) {
					if (local19.anInt6618 != 0) {
						Static371.method5605(local19);
					}
					@Pc(88) int local88 = arg0 + local19.anInt6603;
					@Pc(93) int local93 = local19.anInt6631 + arg2;
					@Pc(96) int local96 = local19.anInt6642;
					if (Static525.aBoolean645 && (Static68.method1303(local19).anInt2112 != 0 || local19.anInt6669 == 0) && local96 > 127) {
						local96 = 127;
					}
					@Pc(142) int local142;
					@Pc(146) int local146;
					if (local19 == Static499.aClass220_17) {
						if (arg4 != -1412584499 && (Static410.anInt7322 == local19.anInt6601 || local19.anInt6601 == Static390.anInt8665)) {
							Static297.anInt7032 = arg0;
							Static26.anInt530 = arg2;
							Static4.aClass220Array7 = arg8;
							continue;
						}
						if (Static377.aBoolean483 && Static527.aBoolean646) {
							local142 = Static280.aClass214_1.method6766();
							local146 = Static280.aClass214_1.method6770();
							local146 -= Static364.anInt6815;
							local142 -= Static543.anInt6390;
							if (local142 < Static277.anInt5400) {
								local142 = Static277.anInt5400;
							}
							if (Static178.aClass220_8.anInt6627 + Static277.anInt5400 < local142 + local19.anInt6627) {
								local142 = Static178.aClass220_8.anInt6627 + Static277.anInt5400 - local19.anInt6627;
							}
							if (Static492.anInt8448 > local146) {
								local146 = Static492.anInt8448;
							}
							if (local146 + local19.anInt6681 > Static492.anInt8448 + Static178.aClass220_8.anInt6681) {
								local146 = Static492.anInt8448 + Static178.aClass220_8.anInt6681 - local19.anInt6681;
							}
							local88 = local142;
							local93 = local146;
						}
						if (local19.anInt6601 == Static390.anInt8665) {
							local96 = 128;
						}
					}
					@Pc(271) int local271;
					@Pc(260) int local260;
					@Pc(226) int local226;
					@Pc(231) int local231;
					if (local19.anInt6669 == 2) {
						local271 = arg1;
						local142 = arg3;
						local146 = arg7;
						local260 = arg5;
					} else {
						local226 = local88 + local19.anInt6627;
						local231 = local19.anInt6681 + local93;
						local146 = arg7 < local93 ? local93 : arg7;
						if (local19.anInt6669 == 9) {
							local231++;
							local226++;
						}
						local142 = arg3 >= local88 ? arg3 : local88;
						local260 = arg5 > local231 ? local231 : arg5;
						local271 = arg1 > local226 ? local226 : arg1;
					}
					if (local271 > local142 && local260 > local146) {
						@Pc(479) int local479;
						@Pc(515) int local515;
						@Pc(526) int local526;
						@Pc(618) int local618;
						@Pc(513) int local513;
						if (local19.anInt6618 != 0) {
							if (local19.anInt6618 == Static256.anInt5129 || local19.anInt6618 == Static216.anInt8990) {
								Static215.method3483(Static216.anInt8990 == local19.anInt6618, local93, local19.anInt6681, local88, local19.anInt6627);
								Static345.aBooleanArray24[local39] = true;
								Static110.aClass62_15.N(arg3, arg7, arg1, arg5);
								continue;
							}
							if (local19.anInt6618 == Static532.anInt8964) {
								if (local19.method5482(Static110.aClass62_15) != null) {
									Static485.method6727();
									Static360.method5526(Static110.aClass62_15, local88, local93, local19);
									Static386.aBooleanArray15[local39] = true;
									Static110.aClass62_15.N(arg3, arg7, arg1, arg5);
								}
								continue;
							}
							if (local19.anInt6618 == Static274.anInt5374) {
								if (local19.method5482(Static110.aClass62_15) != null) {
									Static485.method6722(local88, local19, local93);
									Static386.aBooleanArray15[local39] = true;
									Static110.aClass62_15.N(arg3, arg7, arg1, arg5);
								}
								continue;
							}
							if (local19.anInt6618 == Static306.anInt5961) {
								Static335.method5245(local93, local88, Static36.anInterface8_21, Static110.aClass62_15, local19.anInt6681, local19.anInt6627);
								Static345.aBooleanArray24[local39] = true;
								Static110.aClass62_15.N(arg3, arg7, arg1, arg5);
								continue;
							}
							if (local19.anInt6618 == Static505.anInt8209) {
								Static10.method315(local19.anInt6627, local88, Static110.aClass62_15, local19.anInt6681, local93);
								Static345.aBooleanArray24[local39] = true;
								Static110.aClass62_15.N(arg3, arg7, arg1, arg5);
								continue;
							}
							if (local19.anInt6618 == Static392.anInt7040) {
								if (!Static399.aBoolean506 && !Static424.aBoolean534) {
									continue;
								}
								local226 = local88 + local19.anInt6627;
								local231 = local93 + 15;
								if (Static399.aBoolean506) {
									local479 = -256;
									if (Static115.anInt2500 < 20) {
										local479 = -65536;
									}
									Static492.aClass13_3.method7201(local231, local226, "Fps:" + Static115.anInt2500, local479);
									local231 += 15;
									@Pc(503) Runtime local503 = Runtime.getRuntime();
									local513 = (int) ((local503.totalMemory() - local503.freeMemory()) / 1024L);
									local515 = -256;
									if (local513 > 65536) {
										if (Static499.aBoolean618) {
											Static174.method3033();
											for (local526 = 0; local526 < 10; local526++) {
												System.gc();
											}
											local513 = (int) ((local503.totalMemory() - local503.freeMemory()) / 1024L);
											if (local513 > 65536) {
												Static340.method5291("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local515 = -65536;
									}
									Static492.aClass13_3.method7201(local231, local226, "Mem:" + local513 + "k", local515);
									local231 += 15;
									Static492.aClass13_3.method7201(local231, local226, "In:" + Static123.anInt2590 + "B/s Out:" + Static134.anInt2778 + "B/s", -256);
									local231 += 15;
									local526 = Static110.aClass62_15.U() / 1024;
									Static492.aClass13_3.method7201(local231, local226, "Offheap:" + local526 + "k", local526 <= 65536 ? -256 : -65536);
									local231 += 15;
									local618 = 0;
									@Pc(620) int local620 = 0;
									@Pc(622) int local622 = 0;
									for (@Pc(624) int local624 = 0; local624 < 32; local624++) {
										local618 += Static345.aClass79_Sub1Array2[local624].method2225();
										local620 += Static345.aClass79_Sub1Array2[local624].method2219();
										local622 += Static345.aClass79_Sub1Array2[local624].method2229();
									}
									@Pc(660) int local660 = local622 * 100 / local618;
									@Pc(666) int local666 = local620 * 10000 / local618;
									@Pc(686) String local686 = "Cache:" + Static14.method521(true, (long) local666, 2, 0) + "% (" + local660 + "%)";
									Static121.aClass13_1.method7201(local231, local226, local686, -256);
									local231 += 12;
								}
								if (Static81.anInt1560 > 0) {
									Static121.aClass13_1.method7201(local231, local226, "Particles: " + Static380.anInt6972 + " / " + Static81.anInt1560, -256);
								}
								local231 += 12;
								if (Static424.aBoolean534) {
									Static121.aClass13_1.method7201(local231, local226, "Polys: " + Static110.aClass62_15.YA() + " Models: " + Static110.aClass62_15.ba(), -256);
									local231 += 12;
									Static121.aClass13_1.method7201(local231, local226, "Ls: " + Static162.anInt3280 + " La: " + Static327.anInt6257 + " NPC: " + Static331.anInt6285 + " Pl: " + Static303.anInt5999, -256);
									local231 += 12;
									Static187.method3149();
								}
								Static345.aBooleanArray24[local39] = true;
								continue;
							}
						}
						if (local19.anInt6669 == 0) {
							if (local19.anInt6618 == Static197.anInt3791 && Static110.aClass62_15.method7031()) {
								Static110.aClass62_15.method7018(local88, local93, local19.anInt6627, local19.anInt6681);
							}
							method5109(local88 - local19.anInt6626, local271, local93 - local19.anInt6609, local142, local19.anInt6661, local260, local39, local146, arg8);
							if (local19.aClass220Array6 != null) {
								method5109(local88 - local19.anInt6626, local271, local93 - local19.anInt6609, local142, local19.anInt6661, local260, local39, local146, local19.aClass220Array6);
							}
							@Pc(847) Class5_Sub43 local847 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local19.anInt6661);
							if (local847 != null) {
								Static171.method3012(local39, local271, local146, local93, local260, local847.anInt7801, local142, local88);
							}
							if (local19.anInt6618 == Static197.anInt3791 && Static110.aClass62_15.method7031()) {
								Static110.aClass62_15.method7035();
								Static256.aBoolean357 = true;
							}
							Static110.aClass62_15.N(arg3, arg7, arg1, arg5);
						}
						if (Static106.aBooleanArray13[local39] || Static405.anInt7237 > 1) {
							if (local19.anInt6669 == 3) {
								if (local96 == 0) {
									if (local19.aBoolean458) {
										Static110.aClass62_15.f(local88, local93, local19.anInt6627, local19.anInt6681, local19.anInt6680, 0);
									} else {
										Static110.aClass62_15.method7009(local88, local93, local19.anInt6627, local19.anInt6681, local19.anInt6680, 0);
									}
								} else if (local19.aBoolean458) {
									Static110.aClass62_15.f(local88, local93, local19.anInt6627, local19.anInt6681, local19.anInt6680 & 0xFFFFFF | 255 - (local96 & 0xFF) << 24, 1);
								} else {
									Static110.aClass62_15.method7009(local88, local93, local19.anInt6627, local19.anInt6681, local19.anInt6680 & 0xFFFFFF | 255 - (local96 & 0xFF) << 24, 1);
								}
							} else if (local19.anInt6669 == 4) {
								@Pc(980) Class13 local980 = local19.method5473(Static110.aClass62_15);
								if (local980 != null) {
									local231 = local19.anInt6680;
									@Pc(995) String local995 = local19.aString65;
									if (local19.anInt6641 != -1) {
										@Pc(1006) Class22 local1006 = Static451.aClass67_2.method2006(local19.anInt6641);
										local995 = local1006.aString15;
										if (local995 == null) {
											local995 = "null";
										}
										if ((local1006.anInt589 == 1 || local19.anInt6664 != 1) && local19.anInt6664 != -1) {
											local995 = "<col=ff9040>" + local995 + "</col> x" + Static135.method2552(local19.anInt6664);
										}
									}
									if (local19 == Static381.aClass220_16) {
										local995 = Static243.aClass40_74.method1063(Static194.anInt3737);
										local231 = local19.anInt6680;
									}
									if (Static222.aBoolean623) {
										Static110.aClass62_15.F(local88, local93, local19.anInt6627 + local88, local19.anInt6681 + local93);
									}
									local980.method7215(0, local19.aBoolean465 ? 255 - (local96 & 0xFF) << 24 : -1, local995, local19.anInt6613, null, Static22.aClass25Array1, local19.anInt6628, local19.anInt6681, 0, local93, local88, local19.anInt6614, local19.anInt6610, local231 | 255 - (local96 & 0xFF) << 24, local19.anInt6627, null);
									if (Static222.aBoolean623) {
										Static110.aClass62_15.N(arg3, arg7, arg1, arg5);
									}
								} else if (Static260.aBoolean606) {
									Static377.method5650(local19);
								}
							} else {
								@Pc(1233) int local1233;
								if (local19.anInt6669 == 5) {
									if (local19.anInt6679 >= 0) {
										local19.method5486(Static420.aClass118_10, Static175.aClass49_1).method2239(local93, 0, Static110.aClass62_15, local88, local19.anInt6602 << 3, local19.anInt6627, local19.anInt6681, 0, local19.anInt6677 << 3);
									} else {
										@Pc(1192) Class25 local1192;
										if (local19.anInt6641 == -1) {
											local1192 = local19.method5485(Static110.aClass62_15);
										} else {
											@Pc(1174) Class248 local1174 = local19.aBoolean460 ? Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1 : null;
											local1192 = Static451.aClass67_2.method2011(local19.anInt6664, local19.anInt6638 | 0xFF000000, Static110.aClass62_15, local19.anInt6608, local19.anInt6688, local1174, local19.anInt6641);
										}
										if (local1192 != null) {
											local231 = local1192.EA();
											local479 = local1192.ma();
											local1233 = (local19.anInt6680 == 0 ? 16777215 : local19.anInt6680 & 0xFFFFFF) | 255 - (local96 & 0xFF) << 24;
											if (local19.lb) {
												Static110.aClass62_15.F(local88, local93, local88 + local19.anInt6627, local93 + local19.anInt6681);
												if (local19.anInt6686 != 0) {
													local513 = (local231 + local19.anInt6627 - 1) / local231;
													local515 = (local19.anInt6681 + local479 - 1) / local479;
													for (local526 = 0; local526 < local513; local526++) {
														for (local618 = 0; local618 < local515; local618++) {
															if (local19.anInt6680 == 0) {
																local1192.method6962((float) (local88 + local231 * local526) + (float) local231 / 2.0F, (float) local479 / 2.0F + (float) (local93 + local479 * local618), 4096, local19.anInt6686);
															} else {
																local1192.method6957((float) local231 / 2.0F + (float) (local231 * local526 + local88), (float) (local479 * local618 + local93) + (float) local479 / 2.0F, 4096, local19.anInt6686, local1233);
															}
														}
													}
												} else if (local19.anInt6680 == 0 && local96 == 0) {
													local1192.method6958(local88, local93, local19.anInt6627, local19.anInt6681);
												} else {
													local1192.i(local88, local93, local19.anInt6627, local19.anInt6681, 0, local1233, 1);
												}
												Static110.aClass62_15.N(arg3, arg7, arg1, arg5);
											} else if (local19.anInt6680 == 0 && local96 == 0) {
												if (local19.anInt6686 != 0) {
													local1192.method6962((float) local88 + (float) local19.anInt6627 / 2.0F, (float) local93 + (float) local19.anInt6681 / 2.0F, local19.anInt6627 * 4096 / local231, local19.anInt6686);
												} else if (local19.anInt6627 == local231 && local19.anInt6681 == local479) {
													local1192.method6956(local88, local93);
												} else {
													local1192.method6960(local88, local93, local19.anInt6627, local19.anInt6681);
												}
											} else if (local19.anInt6686 != 0) {
												local1192.method6957((float) local88 + (float) local19.anInt6627 / 2.0F, (float) local93 + (float) local19.anInt6681 / 2.0F, local19.anInt6627 * 4096 / local231, local19.anInt6686, local1233);
											} else if (local231 == local19.anInt6627 && local19.anInt6681 == local479) {
												local1192.DA(local88, local93, 0, local1233, 1);
											} else {
												local1192.ra(local88, local93, local19.anInt6627, local19.anInt6681, 0, local1233, 1);
											}
										} else if (Static260.aBoolean606) {
											Static377.method5650(local19);
										}
									}
								} else if (local19.anInt6669 == 6) {
									Static152.method2795();
									@Pc(1539) Class36 local1539 = null;
									local231 = 0;
									@Pc(1650) Class31 local1650;
									@Pc(1660) Class248 local1660;
									if (local19.anInt6641 != -1) {
										@Pc(1758) Class22 local1758 = Static451.aClass67_2.method2006(local19.anInt6641);
										if (local1758 != null) {
											local1758 = local1758.method688(local19.anInt6664);
											local1650 = local19.anInt6643 == -1 ? null : Static155.aClass76_2.method2152(local19.anInt6643);
											local1660 = local19.aBoolean460 ? Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1 : null;
											local1539 = local1758.method675(local19.anInt6619, local19.anInt6604, 1, Static110.aClass62_15, 2048, local1650, local1660, local19.anInt6649);
											if (local1539 == null) {
												Static377.method5650(local19);
											} else {
												local231 = -local1539.TA() >> 1;
											}
										}
									} else if (local19.anInt6675 == 5) {
										local479 = local19.anInt6612;
										if (local479 >= 0 && local479 < 2048) {
											@Pc(1564) Class15_Sub2_Sub1_Sub1 local1564 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local479];
											@Pc(1576) Class31 local1576 = local19.anInt6643 == -1 ? null : Static155.aClass76_2.method2152(local19.anInt6643);
											if (local1564 != null && (Static510.anInt8653 == local479 || Static449.method6335(local1564.aString18) == local19.anInt6637)) {
												local1539 = local1564.aClass248_1.method5872(Static540.aClass242_1, -1, Static261.aClass211_2, Static451.aClass67_2, 0, Static155.aClass76_2, null, Static201.aClass85_1, Static204.aClass282_1, local1576, local19.anInt6604, null, local19.anInt6649, Static110.aClass62_15, local19.anInt6619, 0, 2048);
											}
										}
									} else if (local19.anInt6675 == 8 || local19.anInt6675 == 9) {
										@Pc(1637) Class5_Sub24 local1637 = Static459.method6391(local19.anInt6612, false);
										local1650 = local19.anInt6643 == -1 ? null : Static155.aClass76_2.method2152(local19.anInt6643);
										if (local1637 != null) {
											local1660 = local19.aBoolean460 ? Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1 : null;
											local1539 = local1637.method3077(local19.anInt6649, local19.anInt6604, local19.anInt6619, local1650, Static110.aClass62_15, local19.anInt6675 == 9, local1660, local19.anInt6637);
										}
									} else if (local19.anInt6643 == -1) {
										local1539 = local19.method5474(Static451.aClass67_2, Static204.aClass282_1, 0, Static261.aClass211_2, Static540.aClass242_1, Static155.aClass76_2, Static201.aClass85_1, -1, Static110.aClass62_15, 2048, -1, Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1, null);
										if (local1539 == null && Static260.aBoolean606) {
											Static377.method5650(local19);
										}
									} else {
										@Pc(1697) Class31 local1697 = Static155.aClass76_2.method2152(local19.anInt6643);
										local1539 = local19.method5474(Static451.aClass67_2, Static204.aClass282_1, local19.anInt6619, Static261.aClass211_2, Static540.aClass242_1, Static155.aClass76_2, Static201.aClass85_1, local19.anInt6649, Static110.aClass62_15, 2048, local19.anInt6604, Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1, local1697);
										if (local1539 == null && Static260.aBoolean606) {
											Static377.method5650(local19);
										}
									}
									if (local1539 != null) {
										if (local19.anInt6621 <= 0) {
											local479 = 512;
										} else {
											local479 = (local19.anInt6627 << 9) / local19.anInt6621;
										}
										if (local19.anInt6615 > 0) {
											local1233 = (local19.anInt6681 << 9) / local19.anInt6615;
										} else {
											local1233 = 512;
										}
										local513 = local88 + local19.anInt6627 / 2 + (local479 * local19.anInt6640 >> 9);
										local515 = local19.anInt6681 / 2 + local93 + (local1233 * local19.anInt6606 >> 9);
										Static267.aClass78_3.ha();
										Static110.aClass62_15.method7068(Static267.aClass78_3);
										Static110.aClass62_15.b(local513, local515, local479, local1233);
										Static110.aClass62_15.la((float) (local19.anInt6648 << 0), local19.aBoolean461 ? (float) (local19.anInt6652 << 0) : (float) (local19.anInt6652 << 0) * 1.5F);
										if (arg4 == -1412584499 || Static256.aBoolean357) {
											Static110.aClass62_15.n();
											Static110.aClass62_15.method6999();
											Static110.aClass62_15.N(arg3, arg7, arg1, arg5);
											Static256.aBoolean357 = false;
										}
										if (local19.aBoolean462) {
											Static110.aClass62_15.method7022(false);
										}
										local526 = (local19.anInt6650 << 0) * Class5_Sub2_Sub16.anIntArray411[local19.anInt6683 << 3] >> 15;
										local618 = (local19.anInt6650 << 0) * Class5_Sub2_Sub16.anIntArray410[local19.anInt6683 << 3] >> 15;
										Static434.aClass78_5.ta(-local19.anInt6666 << 3);
										Static434.aClass78_5.XA(local19.anInt6617 << 3);
										Static434.aClass78_5.TA(local19.anInt6692 << 0, local231 + (local19.anInt6672 << 0) + local526, local618 + (local19.anInt6672 << 0));
										Static434.aClass78_5.k(local19.anInt6683 << 3);
										if (Static222.aBoolean623) {
											Static110.aClass62_15.F(local88, local93, local88 + local19.anInt6627, local19.anInt6681 + local93);
										}
										if (local19.aBoolean461) {
											local1539.method7346(Static434.aClass78_5, null, local19.anInt6650 << 0);
										} else {
											local1539.method7360(Static434.aClass78_5, null, 1);
										}
										if (Static222.aBoolean623) {
											Static110.aClass62_15.N(arg3, arg7, arg1, arg5);
										}
										if (local19.aBoolean462) {
											Static110.aClass62_15.method7022(true);
										}
										Static110.aClass62_15.la(0.0F, 0.0F);
									}
								} else if (local19.anInt6669 == 9) {
									if (local19.aBoolean464) {
										local231 = local93 + local19.anInt6681;
										local1233 = local93;
										local479 = local88 + local19.anInt6627;
									} else {
										local231 = local93;
										local1233 = local19.anInt6681 + local93;
										local479 = local88 + local19.anInt6627;
									}
									if (local19.anInt6654 == 1) {
										Static110.aClass62_15.method7036(local88, local231, local479, local1233, local19.anInt6680, 0);
									} else {
										Static110.aClass62_15.method7045(local88, local231, local479, local1233, local19.anInt6680, local19.anInt6654);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
