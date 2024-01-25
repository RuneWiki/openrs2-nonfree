import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!os", name = "T", descriptor = "Lclient!oh;")
	public static Class237 aClass237_108;

	@OriginalMember(owner = "client!os", name = "V", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_101 = new Class71(79, -1);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIILclient!ha;)V")
	public static void method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class16 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static368.anInt6984 == 0 || Static43.anInt1550 == 0) {
			return;
		}
		@Pc(48) Class54 local48;
		@Pc(37) int local37;
		@Pc(35) int local35;
		@Pc(33) int local33;
		@Pc(39) int local39;
		@Pc(58) int local58;
		@Pc(63) int local63;
		if (Static513.aBoolean642) {
			Static604.method8286(false);
			local48 = arg2.method6118();
			@Pc(74) int[] local74 = arg2.Y();
			local33 = local74[2];
			local37 = local74[0];
			local35 = local74[1];
			local39 = local74[3];
			local58 = arg0 + Static415.method6518(false);
			local63 = arg1 + Static114.method2594(false);
		} else {
			arg2.DA(Static325.anInt6514, Static627.anInt10492, Static368.anInt6984, Static43.anInt1550);
			local33 = Static368.anInt6984;
			local35 = Static627.anInt10492;
			local37 = Static325.anInt6514;
			local39 = Static43.anInt1550;
			arg2.KA(Static105.anInt2771, Static526.anInt9111, Static368.anInt6984, Static43.anInt1550);
			local48 = arg2.method6076();
			local48.method5127(Static56.anInt1868, Static132.anInt3517, Static174.anInt4169, Static182.anInt4250, Static101.anInt2723, Static191.anInt4496);
			local58 = arg0;
			arg2.method6066(local48);
			local63 = arg1;
		}
		if (local39 == 0) {
			local39 = 1;
		}
		if (local33 == 0) {
			local33 = 1;
		}
		Static427.method6639(true);
		@Pc(136) int local136;
		@Pc(174) int local174;
		@Pc(147) int local147;
		@Pc(275) int local275;
		@Pc(284) int local284;
		@Pc(295) int local295;
		@Pc(306) int local306;
		@Pc(128) int local128;
		@Pc(351) int local351;
		if (Static86.aClass86Array2 != null && (!Static147.aBoolean270 || (Static328.anInt9771 & 0x40) != 0)) {
			local128 = -1;
			@Pc(130) int local130 = -1;
			@Pc(133) int local133 = arg2.i();
			local136 = arg2.XA();
			@Pc(165) int local165;
			@Pc(156) int local156;
			if (Static183.aBoolean308) {
				local174 = local156 = Static115.anInt3009 * (local58 - local37) / local33;
				local165 = local147 = (local63 - local35) * Static115.anInt3009 / local39;
			} else {
				local147 = (local63 - local35) * local136 / local39;
				local156 = (local58 - local37) * local136 / local33;
				local165 = (local63 - local35) * local133 / local39;
				local174 = local133 * (local58 - local37) / local33;
			}
			@Pc(213) int[] local213 = new int[] { local174, local165, local133 };
			local48.method5136(local213);
			@Pc(231) int[] local231 = new int[] { local156, local147, local136 };
			local48.method5136(local231);
			@Pc(262) float local262 = Static236.method4341(4, (float) local231[1], (float) local231[2], (float) local213[2], (float) local213[1], (float) local231[0], (float) local213[0]);
			if (local262 > 0.0F) {
				local275 = local231[0] - local213[0];
				local284 = local231[2] - local213[2];
				local295 = (int) ((float) local213[0] + (float) local275 * local262);
				local306 = (int) (local262 * (float) local284 + (float) local213[2]);
				local128 = (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method6692() - 1 << 8) + local295 >> 9;
				local130 = (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method6692() - 1 << 8) + local306 >> 9;
				@Pc(333) byte local333 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124;
				if (local333 < 3 && (Static118.aByteArrayArrayArray20[1][local295 >> 9][local306 >> 9] & 0x2) != 0) {
					local351 = local333 + 1;
				}
			}
			if (local128 != -1 && local130 != -1) {
				if (Static147.aBoolean270 && (Static328.anInt9771 & 0x40) != 0) {
					@Pc(422) Class331 local422 = Static201.method3722(Static401.anInt7697, Static391.anInt7576);
					if (local422 == null) {
						Static8.method91();
					} else {
						Static192.method3629((long) (local130 | local128 << 0), true, -1, false, 0L, 6, Static598.aString17, local130, local128, true, Static500.anInt8805, " ->");
					}
				} else {
					if (Static22.aBoolean88) {
						Static192.method3629((long) (local130 | local128 << 0), true, -1, false, 0L, 22, Static121.aClass84_27.method2710(Static372.anInt7083), local130, local128, true, -1, "");
					}
					Static192.method3629((long) (local130 | local128 << 0), true, -1, false, 0L, 15, Static289.aString69, local130, local128, true, Static140.anInt3588, "");
				}
			}
		}
		if (Static513.aBoolean642) {
			Static272.method4682();
		}
		for (local128 = 0; local128 < (Static513.aBoolean642 ? 2 : 1); local128++) {
			@Pc(461) boolean local461 = local128 == 0;
			@Pc(467) Class194 local467 = local461 ? Static40.aClass194_2 : Static644.aClass194_6;
			local136 = arg0;
			local174 = arg1;
			if (Static513.aBoolean642) {
				Static604.method8286(local461);
				local136 = arg0 + Static415.method6518(local461);
				local174 = arg1 + Static114.method2594(local461);
			}
			@Pc(495) Class123 local495 = local467.aClass123_8;
			for (@Pc(500) Class15_Sub7 local500 = (Class15_Sub7) local495.method3537(); local500 != null; local500 = (Class15_Sub7) local495.method3541()) {
				if ((Static345.aBoolean465 || Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 == local500.aClass15_Sub1_14.aByte124) && local500.method4914(local174, local136, arg2)) {
					@Pc(531) int local531;
					if (local500.aClass15_Sub1_14 instanceof Class15_Sub1_Sub2) {
						local531 = ((Class15_Sub1_Sub2) local500.aClass15_Sub1_14).aShort103;
						local147 = ((Class15_Sub1_Sub2) local500.aClass15_Sub1_14).aShort105;
					} else {
						local531 = local500.aClass15_Sub1_14.anInt10298 >> 9;
						local147 = local500.aClass15_Sub1_14.anInt10301 >> 9;
					}
					@Pc(662) int local662;
					@Pc(674) int local674;
					@Pc(789) int local789;
					@Pc(561) int local561;
					if (local500.aClass15_Sub1_14 instanceof Class15_Sub1_Sub2_Sub2_Sub1) {
						@Pc(557) Class15_Sub1_Sub2_Sub2_Sub1 local557 = (Class15_Sub1_Sub2_Sub2_Sub1) local500.aClass15_Sub1_14;
						local561 = local557.method6692();
						if ((local561 & 0x1) == 0 && (local557.anInt10301 & 0x1FF) == 0 && (local557.anInt10298 & 0x1FF) == 0 || (local561 & 0x1) == 1 && (local557.anInt10301 & 0x1FF) == 256 && (local557.anInt10298 & 0x1FF) == 256) {
							local275 = local557.anInt10301 - (local557.method6692() - 1 << 8);
							local284 = local557.anInt10298 - (local557.method6692() - 1 << 8);
							for (local295 = 0; local295 < Static59.anInt1906; local295++) {
								@Pc(637) Class8_Sub50 local637 = (Class8_Sub50) Static278.aClass253_20.method6594((long) Static620.anIntArray609[local295]);
								if (local637 != null) {
									@Pc(642) Class15_Sub1_Sub2_Sub2_Sub2 local642 = local637.aClass15_Sub1_Sub2_Sub2_Sub2_2;
									if (local642.anInt8077 != Static435.anInt8192 && local642.aBoolean583) {
										local662 = local642.anInt10301 - (local642.aClass300_1.anInt8912 - 1 << 8);
										local674 = local642.anInt10298 - (local642.aClass300_1.anInt8912 - 1 << 8);
										if (local275 <= local662 && local642.aClass300_1.anInt8912 <= local557.method6692() - (local662 - local275 >> 9) && local284 <= local674 && local642.aClass300_1.anInt8912 <= local557.method6692() - (local674 - local284 >> 9)) {
											Static98.method2231(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 != local500.aClass15_Sub1_14.aByte124, local642);
											local642.anInt8077 = Static435.anInt8192;
										}
									}
								}
							}
							local306 = Static315.anInt9128;
							@Pc(750) int[] local750 = Static533.anIntArray506;
							for (local662 = 0; local662 < local306; local662++) {
								@Pc(760) Class15_Sub1_Sub2_Sub2_Sub1 local760 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local750[local662]];
								if (local760 != null && Static435.anInt8192 != local760.anInt8077 && local557 != local760 && local760.aBoolean583) {
									local789 = local760.anInt10301 - (local760.method6692() - 1 << 8);
									@Pc(801) int local801 = local760.anInt10298 - (local760.method6692() - 1 << 8);
									if (local789 >= local275 && local760.method6692() <= local557.method6692() - (local789 - local275 >> 9) && local801 >= local284 && local760.method6692() <= local557.method6692() - (local801 - local284 >> 9)) {
										Static393.method6283(local500.aClass15_Sub1_14.aByte124 != Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124, local760);
										local760.anInt8077 = Static435.anInt8192;
									}
								}
							}
						}
						if (local557.anInt8077 == Static435.anInt8192) {
							continue;
						}
						Static393.method6283(local500.aClass15_Sub1_14.aByte124 != Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124, local557);
						local557.anInt8077 = Static435.anInt8192;
					}
					if (local500.aClass15_Sub1_14 instanceof Class15_Sub1_Sub2_Sub2_Sub2) {
						@Pc(894) Class15_Sub1_Sub2_Sub2_Sub2 local894 = (Class15_Sub1_Sub2_Sub2_Sub2) local500.aClass15_Sub1_14;
						if (local894.aClass300_1 != null) {
							if ((local894.aClass300_1.anInt8912 & 0x1) == 0 && (local894.anInt10301 & 0x1FF) == 0 && (local894.anInt10298 & 0x1FF) == 0 || (local894.aClass300_1.anInt8912 & 0x1) == 1 && (local894.anInt10301 & 0x1FF) == 256 && (local894.anInt10298 & 0x1FF) == 256) {
								local561 = local894.anInt10301 - (local894.aClass300_1.anInt8912 - 1 << 8);
								local275 = local894.anInt10298 - (local894.aClass300_1.anInt8912 - 1 << 8);
								for (local284 = 0; local284 < Static59.anInt1906; local284++) {
									@Pc(972) Class8_Sub50 local972 = (Class8_Sub50) Static278.aClass253_20.method6594((long) Static620.anIntArray609[local284]);
									if (local972 != null) {
										@Pc(977) Class15_Sub1_Sub2_Sub2_Sub2 local977 = local972.aClass15_Sub1_Sub2_Sub2_Sub2_2;
										if (local977.anInt8077 != Static435.anInt8192 && local894 != local977 && local977.aBoolean583) {
											local351 = local977.anInt10301 - (local977.aClass300_1.anInt8912 - 1 << 8);
											local662 = local977.anInt10298 - (local977.aClass300_1.anInt8912 - 1 << 8);
											if (local561 <= local351 && local894.aClass300_1.anInt8912 - (local351 - local561 >> 9) >= local977.aClass300_1.anInt8912 && local662 >= local275 && local977.aClass300_1.anInt8912 <= local894.aClass300_1.anInt8912 - (local662 - local275 >> 9)) {
												Static98.method2231(local500.aClass15_Sub1_14.aByte124 != Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124, local977);
												local977.anInt8077 = Static435.anInt8192;
											}
										}
									}
								}
								local295 = Static315.anInt9128;
								@Pc(1070) int[] local1070 = Static533.anIntArray506;
								for (local351 = 0; local351 < local295; local351++) {
									@Pc(1080) Class15_Sub1_Sub2_Sub2_Sub1 local1080 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local1070[local351]];
									if (local1080 != null && local1080.anInt8077 != Static435.anInt8192 && local1080.aBoolean583) {
										local674 = local1080.anInt10301 - (local1080.method6692() - 1 << 8);
										local789 = local1080.anInt10298 - (local1080.method6692() - 1 << 8);
										if (local561 <= local674 && local1080.method6692() <= local894.aClass300_1.anInt8912 - (local674 - local561 >> 9) && local789 >= local275 && local1080.method6692() <= local894.aClass300_1.anInt8912 - (local789 - local275 >> 9)) {
											Static393.method6283(local500.aClass15_Sub1_14.aByte124 != Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124, local1080);
											local1080.anInt8077 = Static435.anInt8192;
										}
									}
								}
							}
							if (local894.anInt8077 == Static435.anInt8192) {
								continue;
							}
							Static98.method2231(local500.aClass15_Sub1_14.aByte124 != Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124, local894);
							local894.anInt8077 = Static435.anInt8192;
						}
					}
					if (local500.aClass15_Sub1_14 instanceof Class15_Sub1_Sub1_Sub1) {
						@Pc(1211) int local1211 = Static628.anInt10493 + local147;
						local561 = local531 + Static594.anInt10160;
						@Pc(1233) Class8_Sub26 local1233 = (Class8_Sub26) Static567.aClass253_38.method6594((long) (local561 << 14 | local500.aClass15_Sub1_14.aByte124 << 28 | local1211));
						if (local1233 != null) {
							local284 = 0;
							@Pc(1243) Class8_Sub11 local1243 = (Class8_Sub11) local1233.aClass43_25.method1421();
							while (local1243 != null) {
								@Pc(1251) Class284 local1251 = Static497.aClass258_21.method6652(local1243.anInt2018);
								if (Static147.aBoolean270 && local500.aClass15_Sub1_14.aByte124 == Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124) {
									@Pc(1269) Class82 local1269 = Static330.anInt4199 == -1 ? null : Static144.aClass274_1.method6933(Static330.anInt4199);
									if ((Static328.anInt9771 & 0x1) != 0 && (local1269 == null || local1251.method7058(Static330.anInt4199, local1269.anInt3023) != local1269.anInt3023)) {
										Static192.method3629((long) local284, false, -1, false, (long) local1243.anInt2018, 45, Static598.aString17, local531, local147, true, Static500.anInt8805, Static4.aString2 + " -> <col=ff9040>" + local1251.aString88);
									}
								}
								if (local500.aClass15_Sub1_14.aByte124 == Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124) {
									@Pc(1324) String[] local1324 = local1251.aStringArray26;
									for (local662 = 4; local662 >= 0; local662--) {
										if (local1324 != null && local1324[local662] != null) {
											@Pc(1336) byte local1336 = 0;
											local789 = Static394.anInt7610;
											if (local662 == 0) {
												local1336 = 44;
											}
											if (local662 == 1) {
												local1336 = 51;
											}
											if (local662 == 2) {
												local1336 = 25;
											}
											if (local662 == 3) {
												local1336 = 48;
											}
											if (local662 == local1251.anInt8529) {
												local789 = local1251.anInt8565;
											}
											if (local662 == 4) {
												local1336 = 2;
											}
											if (local1251.anInt8572 == local662) {
												local789 = local1251.anInt8540;
											}
											Static192.method3629((long) local284, false, -1, false, (long) local1243.anInt2018, local1336, local1324[local662], local531, local147, true, local789, "<col=ff9040>" + local1251.aString88);
										}
									}
								}
								Static192.method3629((long) local284, false, -1, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 != local500.aClass15_Sub1_14.aByte124, (long) local1243.anInt2018, 1010, Static121.aClass84_22.method2710(Static372.anInt7083), local531, local147, true, Static468.anInt10558, "<col=ff9040>" + local1251.aString88);
								local1243 = (Class8_Sub11) local1233.aClass43_25.method1433();
								local284++;
							}
						}
					}
					if (local500.aClass15_Sub1_14 instanceof Interface27) {
						@Pc(1477) Interface27 local1477 = (Interface27) local500.aClass15_Sub1_14;
						@Pc(1484) Class352 local1484 = Static437.aClass199_3.method5342(local1477.method8342());
						if (local1484.anIntArray591 != null) {
							local1484 = local1484.method8164(Static420.aClass77_1);
						}
						if (local1484 != null) {
							if (Static147.aBoolean270 && Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 == local500.aClass15_Sub1_14.aByte124) {
								@Pc(1512) Class82 local1512 = Static330.anInt4199 == -1 ? null : Static144.aClass274_1.method6933(Static330.anInt4199);
								if ((Static328.anInt9771 & 0x4) != 0 && (local1512 == null || local1484.method8177(local1512.anInt3023, Static330.anInt4199) != local1512.anInt3023)) {
									Static192.method3629((long) local1477.hashCode(), false, -1, false, Static384.method6162(local531, local147, local1477), 50, Static598.aString17, local531, local147, true, Static500.anInt8805, Static4.aString2 + " -> <col=00ffff>" + local1484.aString107);
								}
							}
							if (local500.aClass15_Sub1_14.aByte124 == Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124) {
								@Pc(1576) String[] local1576 = local1484.aStringArray37;
								if (local1576 != null) {
									for (local284 = 4; local284 >= 0; local284--) {
										if (local1576[local284] != null) {
											@Pc(1588) short local1588 = 0;
											if (local284 == 0) {
												local1588 = 20;
											}
											local306 = Static394.anInt7610;
											if (local284 == 1) {
												local1588 = 46;
											}
											if (local284 == 2) {
												local1588 = 10;
											}
											if (local284 == 3) {
												local1588 = 19;
											}
											if (local1484.anInt10109 == local284) {
												local306 = local1484.anInt10095;
											}
											if (local284 == 4) {
												local1588 = 1009;
											}
											if (local1484.anInt10127 == local284) {
												local306 = local1484.anInt10126;
											}
											Static192.method3629((long) local1477.hashCode(), false, -1, false, Static384.method6162(local531, local147, local1477), local1588, local1576[local284], local531, local147, true, local306, "<col=00ffff>" + local1484.aString107);
										}
									}
								}
								Static192.method3629((long) local1477.hashCode(), false, -1, local500.aClass15_Sub1_14.aByte124 != Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124, (long) local1484.anInt10077, 1003, Static121.aClass84_22.method2710(Static372.anInt7083), local531, local147, true, Static468.anInt10558, "<col=00ffff>" + local1484.aString107);
							}
						}
					}
				}
			}
			if (Static513.aBoolean642) {
				Static272.method4682();
			}
		}
		Static427.method6639(false);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	public static void method6449() {
		@Pc(15) Class236 local15 = Static438.aClass236_75;
		synchronized (Static438.aClass236_75) {
			Static438.aClass236_75.method6245();
		}
		local15 = Static120.aClass236_20;
		synchronized (Static120.aClass236_20) {
			Static120.aClass236_20.method6245();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg8 && arg3 == arg7 && arg1 == arg4 && arg2 == arg6) {
			Static284.method4806(arg5, arg0, arg2, arg4, arg7);
			return;
		}
		@Pc(44) int local44 = arg5;
		@Pc(46) int local46 = arg7;
		@Pc(50) int local50 = arg5 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg8 * 3;
		@Pc(62) int local62 = arg3 * 3;
		@Pc(66) int local66 = arg1 * 3;
		@Pc(70) int local70 = arg6 * 3;
		@Pc(80) int local80 = local58 + arg4 - arg5 - local66;
		@Pc(91) int local91 = arg2 + local62 - arg7 - local70;
		@Pc(100) int local100 = local66 + local50 - local58 - local58;
		@Pc(110) int local110 = local70 + local54 - local62 - local62;
		@Pc(115) int local115 = local58 - local50;
		@Pc(120) int local120 = local62 - local54;
		for (@Pc(122) int local122 = 128; local122 <= 4096; local122 += 128) {
			@Pc(130) int local130 = local122 * local122 >> 12;
			@Pc(136) int local136 = local122 * local130 >> 12;
			@Pc(140) int local140 = local80 * local136;
			@Pc(144) int local144 = local136 * local91;
			@Pc(148) int local148 = local100 * local130;
			@Pc(152) int local152 = local110 * local130;
			@Pc(156) int local156 = local122 * local115;
			@Pc(160) int local160 = local122 * local120;
			@Pc(172) int local172 = arg5 + (local140 + local148 + local156 >> 12);
			@Pc(183) int local183 = (local144 + local152 + local160 >> 12) + arg7;
			Static284.method4806(local44, arg0, local183, local172, local46);
			local44 = local172;
			local46 = local183;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZLclient!wg;Z)V")
	public static void method6452(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class8_Sub51 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt10454;
		@Pc(12) int local12 = (int) arg1.aLong285;
		arg1.method8640();
		if (arg0) {
			Static297.method4905(local8);
		}
		Static94.method5143(local8);
		@Pc(27) Class331 local27 = Static178.method3435(local12);
		if (local27 != null) {
			Static86.method2113(local27);
		}
		Static271.method4666();
		if (!arg2 && Static212.anInt4965 != -1) {
			Static279.method4733(Static212.anInt4965, 1);
		}
		@Pc(49) Class154 local49 = new Class154(Static218.aClass253_14);
		for (@Pc(56) Class8_Sub51 local56 = (Class8_Sub51) local49.method4529(); local56 != null; local56 = (Class8_Sub51) local49.method4531()) {
			if (!local56.method8639()) {
				local56 = (Class8_Sub51) local49.method4529();
				if (local56 == null) {
					return;
				}
			}
			if (local56.anInt10453 == 3) {
				@Pc(78) int local78 = (int) local56.aLong285;
				if (local8 == local78 >>> 16) {
					method6452(true, local56, arg2);
				}
			}
		}
	}
}
