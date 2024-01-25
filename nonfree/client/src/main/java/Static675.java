import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static675 {

	@OriginalMember(owner = "client!wha", name = "n", descriptor = "Lclient!mn;")
	public static Class14_Sub28 aClass14_Sub28_2;

	@OriginalMember(owner = "client!wha", name = "d", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_279 = new Class160(51, 6);

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(III)V")
	public static void method9343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg1, 14);
		local9.method4004();
		local9.anInt4595 = arg0;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BLclient!av;)V")
	public static void method9344(@OriginalArg(1) Class27 arg0) {
		@Pc(8) Class14_Sub21_Sub2 local8 = Static277.aClass347_2.aClass14_Sub21_Sub2_1;
		@Pc(15) int local15;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(41) int local41;
		@Pc(45) int local45;
		if (Static108.aClass27_3 == arg0) {
			local15 = local8.method7749(-16669);
			local21 = (local15 & 0x7) + Static193.anInt9745;
			local25 = local21 + Static550.anInt9242;
			local33 = (local15 >> 4 & 0x7) + Static202.anInt3500;
			local37 = local33 + Static36.anInt617;
			local41 = local8.method7712();
			local45 = local8.method7754();
			@Pc(77) boolean local77 = local33 >= 0 && local21 >= 0 && local33 < Static380.anInt6689 && Static542.anInt9214 > local21;
			if (local77 || Static316.method5006(Static627.anInt10289)) {
				Static183.method2668(local25, local37, Static513.anInt8429, new Class14_Sub43(local45, local41));
				if (local77) {
					Static379.method5837(Static513.anInt8429, local33, local21);
				}
			}
			return;
		}
		@Pc(161) int local161;
		@Pc(165) int local165;
		@Pc(192) int local192;
		@Pc(157) int local157;
		if (arg0 == Static373.aClass27_10) {
			local15 = local8.method7695(110);
			local21 = Static202.anInt3500 + (local15 >> 4 & 0x7);
			local25 = Static193.anInt9745 + (local15 & 0x7);
			local33 = local8.method7717(-1978450544);
			if (local33 == 65535) {
				local33 = -1;
			}
			local37 = local8.method7695(127);
			local41 = local37 >> 4 & 0xF;
			local45 = local37 & 0x7;
			local157 = local8.method7695(114);
			local161 = local8.method7695(106);
			local165 = local8.method7717(-1978450544);
			if (local21 >= 0 && local25 >= 0 && local21 < Static380.anInt6689 && Static542.anInt9214 > local25) {
				local192 = local41 + 1;
				if (local21 - local192 <= Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray200[0] && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray200[0] <= local192 + local21 && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray201[0] >= local25 - local192 && local192 + local25 >= Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray201[0]) {
					Static211.method3241(local165, local33, local157, local161, local45, local41 + (local25 << 8) + (Static513.anInt8429 << 24) + (local21 << 16));
				}
			}
			return;
		}
		@Pc(359) int local359;
		@Pc(363) int local363;
		@Pc(380) int local380;
		@Pc(388) int local388;
		@Pc(384) int local384;
		if (arg0 == Static338.aClass27_9) {
			local15 = local8.method7695(116);
			local21 = Static202.anInt3500 * 2 + (local15 >> 4 & 0xF);
			local25 = Static193.anInt9745 * 2 + (local15 & 0xF);
			local33 = local8.method7695(122);
			@Pc(312) boolean local312 = (local33 & 0x1) != 0;
			@Pc(324) boolean local324 = (local33 & 0x2) != 0;
			local45 = local324 ? local33 >> 2 : -1;
			local157 = local21 + local8.method7720();
			local161 = local25 + local8.method7720();
			local165 = local8.method7752();
			local192 = local8.method7752();
			local359 = local8.method7717(-1978450544);
			local363 = local8.method7695(99);
			if (local324) {
				local363 = (byte) local363;
			} else {
				local363 *= 4;
			}
			local380 = local8.method7695(126) * 4;
			local384 = local8.method7717(-1978450544);
			local388 = local8.method7717(-1978450544);
			@Pc(392) int local392 = local8.method7695(127);
			@Pc(396) int local396 = local8.method7717(-1978450544);
			if (local392 == 255) {
				local392 = -1;
			}
			if (local21 >= 0 && local25 >= 0 && local21 < Static380.anInt6689 * 2 && Static380.anInt6689 * 2 > local25 && local157 >= 0 && local161 >= 0 && Static542.anInt9214 * 2 > local157 && local161 < Static542.anInt9214 * 2 && local359 != 65535) {
				local396 <<= 0x2;
				local25 = local25 * 256;
				local21 *= 256;
				local363 <<= 0x2;
				local161 = local161 * 256;
				local157 = local157 * 256;
				local380 <<= 0x2;
				if (local165 != 0 && local45 != -1) {
					@Pc(502) Class4_Sub3_Sub3_Sub3 local502 = null;
					@Pc(512) int local512;
					if (local165 < 0) {
						local512 = -local165 - 1;
						if (local512 == Static597.anInt9858) {
							local502 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1;
						} else {
							local502 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local512];
						}
					} else {
						local512 = local165 - 1;
						@Pc(538) Class14_Sub44 local538 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local512);
						if (local538 != null) {
							local502 = local538.aClass4_Sub3_Sub3_Sub3_Sub1_2;
						}
					}
					if (local502 != null) {
						@Pc(549) Class141 local549 = local502.method2865();
						if (local549.anIntArrayArray24 != null && local549.anIntArrayArray24[local45] != null) {
							local363 -= local549.anIntArrayArray24[local45][1];
						}
						if (local549.anIntArrayArray23 != null && local549.anIntArrayArray23[local45] != null) {
							local363 -= local549.anIntArrayArray23[local45][1];
						}
					}
				}
				@Pc(611) Class4_Sub3_Sub3_Sub4 local611 = new Class4_Sub3_Sub3_Sub4(local359, Static513.anInt8429, Static513.anInt8429, local21, local25, local363, Static530.anInt9105 + local384, local388 - -Static530.anInt9105, local392, local396, local165, local192, local380, local312, local45);
				local611.method3084(local157, Static388.method5919(local161, local157, Static513.anInt8429) - local380, local384 - -Static530.anInt9105, local161);
				Static230.aClass32_24.method582(new Class14_Sub2_Sub12(local611));
			}
		} else if (arg0 == Static293.aClass27_7) {
			local15 = local8.method7738(1275460792);
			local21 = (local15 >> 4 & 0x7) + Static202.anInt3500;
			local25 = (local15 & 0x7) + Static193.anInt9745;
			local33 = local8.method7717(-1978450544);
			local37 = local8.method7695(107);
			local41 = local37 >> 2;
			local45 = local37 & 0x3;
			local157 = Static135.anIntArray136[local41];
			if (Static316.method5006(Static627.anInt10289) || local21 >= 0 && local25 >= 0 && Static380.anInt6689 > local21 && Static542.anInt9214 > local25) {
				Static689.method9506(local25, local157, local33, Static513.anInt8429, local21, local45, local41);
			}
		} else if (Static598.aClass27_17 == arg0) {
			local15 = local8.method7695(101);
			local21 = (local15 & 0x7) + Static193.anInt9745;
			local25 = local21 + Static550.anInt9242;
			local33 = (local15 >> 4 & 0x7) + Static202.anInt3500;
			local37 = Static36.anInt617 + local33;
			local41 = local8.method7717(-1978450544);
			local45 = local8.method7717(-1978450544);
			local157 = local8.method7717(-1978450544);
			if (Static282.aClass125_17 != null) {
				@Pc(774) Class14_Sub25 local774 = (Class14_Sub25) Static282.aClass125_17.method2630((long) (Static513.anInt8429 << 28 | local25 << 14 | local37));
				if (local774 != null) {
					for (@Pc(782) Class14_Sub43 local782 = (Class14_Sub43) local774.aClass32_27.method584(); local782 != null; local782 = (Class14_Sub43) local774.aClass32_27.method577()) {
						if (local782.anInt9586 == (local41 & 0x7FFF) && local782.anInt9585 == local45) {
							local782.method9513();
							local782.anInt9585 = local157;
							Static183.method2668(local25, local37, Static513.anInt8429, local782);
							break;
						}
					}
					if (local33 >= 0 && local21 >= 0 && Static380.anInt6689 > local33 && Static542.anInt9214 > local21) {
						Static379.method5837(Static513.anInt8429, local33, local21);
					}
				}
			}
		} else if (arg0 == Static388.aClass27_11) {
			local15 = local8.method7695(96);
			local21 = (local15 >> 4 & 0x7) + Static202.anInt3500;
			local25 = Static193.anInt9745 + (local15 & 0x7);
			local33 = local8.method7717(-1978450544);
			if (local33 == 65535) {
				local33 = -1;
			}
			local37 = local8.method7695(105);
			local41 = local8.method7717(-1978450544);
			local45 = local8.method7695(98);
			if (local21 >= 0 && local25 >= 0 && Static380.anInt6689 > local21 && Static542.anInt9214 > local25) {
				if (local33 != -1) {
					local157 = local21 * 512 + 256;
					local161 = local25 * 512 + 256;
					local165 = Static513.anInt8429;
					if (local165 < 3 && Static551.method7974(local21, local25)) {
						local165++;
					}
					@Pc(984) Class4_Sub3_Sub3_Sub1 local984 = new Class4_Sub3_Sub3_Sub1(local33, local41, Static513.anInt8429, local165, local157, Static388.method5919(local161, local157, Static513.anInt8429) - local37, local161, local21, local21, local25, local25, local45, false);
					Static598.aClass125_42.method2626(new Class14_Sub2_Sub11(local984), (long) (local21 << 16 | local25));
					return;
				}
				@Pc(1009) Class14_Sub2_Sub11 local1009 = (Class14_Sub2_Sub11) Static598.aClass125_42.method2630((long) (local21 << 16 | local25));
				if (local1009 != null) {
					local1009.aClass4_Sub3_Sub3_Sub1_1.method2322();
					local1009.method9513();
				}
			}
		} else if (Static323.aClass27_8 == arg0) {
			local15 = local8.method7695(119);
			local21 = Static202.anInt3500 + (local15 >> 4 & 0x7);
			local25 = Static193.anInt9745 + (local15 & 0x7);
			local33 = local8.method7695(100);
			local37 = local33 >> 2;
			local41 = local33 & 0x3;
			local45 = Static135.anIntArray136[local37];
			if (Static316.method5006(Static627.anInt10289) || local21 >= 0 && local25 >= 0 && Static380.anInt6689 > local21 && local25 < Static542.anInt9214) {
				Static689.method9506(local25, local45, -1, Static513.anInt8429, local21, local41, local37);
			}
		} else if (arg0 == Static459.aClass27_18) {
			local15 = local8.method7717(-1978450544);
			@Pc(1112) Class128 local1112 = Static212.aClass249_4.method6119(local15);
			local25 = local8.method7738(1275460792);
			local33 = local8.method7695(114);
			local37 = (local33 >> 4 & 0x7) + Static202.anInt3500;
			local41 = Static193.anInt9745 + (local33 & 0x7);
			local45 = local8.method7749(-16669);
			local157 = local45 >> 2;
			local161 = Static135.anIntArray136[local157];
			if (local157 == 11) {
				local157 = 10;
			}
			local165 = 0;
			if (local1112.aByteArray46 != null) {
				local192 = -1;
				for (local359 = 0; local359 < local1112.aByteArray46.length; local359++) {
					if (local1112.aByteArray46[local359] == local157) {
						local192 = local359;
						break;
					}
				}
				local165 = local1112.anIntArrayArray18[local192].length;
			}
			local192 = 0;
			if (local1112.aShortArray36 != null) {
				local192 = local1112.aShortArray36.length;
			}
			local359 = 0;
			if (local1112.aShortArray38 != null) {
				local359 = local1112.aShortArray38.length;
			}
			if ((local25 & 0x1) == 1) {
				Static469.method9387(Static513.anInt8429, local37, local41, (Class328) null, local161);
			} else {
				@Pc(1225) int[] local1225 = null;
				if ((local25 & 0x2) == 2) {
					local1225 = new int[local165];
					for (local380 = 0; local380 < local165; local380++) {
						local1225[local380] = local8.method7717(-1978450544);
					}
				}
				@Pc(1255) short[] local1255 = null;
				if ((local25 & 0x4) == 4) {
					local1255 = new short[local192];
					for (local384 = 0; local384 < local192; local384++) {
						local1255[local384] = (short) local8.method7717(-1978450544);
					}
				}
				@Pc(1282) short[] local1282 = null;
				if ((local25 & 0x8) == 8) {
					local1282 = new short[local359];
					for (local388 = 0; local388 < local359; local388++) {
						local1282[local388] = (short) local8.method7717(-1978450544);
					}
				}
				Static469.method9387(Static513.anInt8429, local37, local41, new Class328((long) Static333.aLong289++, local1225, local1255, local1282), local161);
			}
		} else if (Static203.aClass27_5 == arg0) {
			local15 = local8.method7754();
			local21 = local8.method7695(99);
			local25 = (local21 & 0x7) + Static193.anInt9745;
			local33 = Static550.anInt9242 + local25;
			local37 = Static202.anInt3500 + (local21 >> 4 & 0x7);
			local41 = local37 + Static36.anInt617;
			local45 = local8.method7754();
			local157 = local8.method7717(-1978450544);
			if (Static597.anInt9858 != local45) {
				@Pc(1415) boolean local1415 = local37 >= 0 && local25 >= 0 && Static380.anInt6689 > local37 && Static542.anInt9214 > local25;
				if (local1415 || Static316.method5006(Static627.anInt10289)) {
					Static183.method2668(local33, local41, Static513.anInt8429, new Class14_Sub43(local15, local157));
					if (local1415) {
						Static379.method5837(Static513.anInt8429, local37, local25);
					}
				}
			}
		} else if (arg0 == Static211.aClass27_6) {
			local15 = local8.method7712();
			local21 = local8.method7714();
			local25 = (local21 & 0x7) + Static193.anInt9745;
			local33 = local25 + Static550.anInt9242;
			local37 = (local21 >> 4 & 0x7) + Static202.anInt3500;
			local41 = local37 + Static36.anInt617;
			@Pc(1495) Class14_Sub25 local1495 = (Class14_Sub25) Static282.aClass125_17.method2630((long) (local41 | local33 << 14 | Static513.anInt8429 << 28));
			if (local1495 != null) {
				for (@Pc(1503) Class14_Sub43 local1503 = (Class14_Sub43) local1495.aClass32_27.method584(); local1503 != null; local1503 = (Class14_Sub43) local1495.aClass32_27.method577()) {
					if ((local15 & 0x7FFF) == local1503.anInt9586) {
						local1503.method9513();
						break;
					}
				}
				if (local1495.aClass32_27.method591()) {
					local1495.method9513();
				}
				if (local37 >= 0 && local25 >= 0 && local37 < Static380.anInt6689 && Static542.anInt9214 > local25) {
					Static379.method5837(Static513.anInt8429, local37, local25);
				}
			}
		} else if (arg0 == Static158.aClass27_4) {
			local15 = local8.method7695(110);
			@Pc(1595) boolean local1595 = (local15 & 0x80) != 0;
			local25 = (local15 >> 3 & 0x7) + Static202.anInt3500;
			local33 = (local15 & 0x7) + Static193.anInt9745;
			local37 = local25 + local8.method7720();
			local41 = local33 + local8.method7720();
			local45 = local8.method7752();
			local157 = local8.method7717(-1978450544);
			local161 = local8.method7695(113) * 4;
			local165 = local8.method7695(96) * 4;
			local192 = local8.method7717(-1978450544);
			local359 = local8.method7717(-1978450544);
			local363 = local8.method7695(107);
			if (local363 == 255) {
				local363 = -1;
			}
			local380 = local8.method7717(-1978450544);
			if (local25 >= 0 && local33 >= 0 && Static380.anInt6689 > local25 && local33 < Static542.anInt9214 && local37 >= 0 && local41 >= 0 && Static380.anInt6689 > local37 && Static542.anInt9214 > local41 && local157 != 65535) {
				local380 <<= 0x2;
				local33 = local33 * 512 + 256;
				local161 <<= 0x2;
				local41 = local41 * 512 + 256;
				local165 <<= 0x2;
				local25 = local25 * 512 + 256;
				local37 = local37 * 512 + 256;
				@Pc(1773) Class4_Sub3_Sub3_Sub4 local1773 = new Class4_Sub3_Sub3_Sub4(local157, Static513.anInt8429, Static513.anInt8429, local25, local33, local161, Static530.anInt9105 + local192, Static530.anInt9105 + local359, local363, local380, 0, local45, local165, local1595, -1);
				local1773.method3084(local37, Static388.method5919(local41, local37, Static513.anInt8429) - local165, local192 + Static530.anInt9105, local41);
				Static230.aClass32_24.method582(new Class14_Sub2_Sub12(local1773));
			}
		} else if (arg0 == Static466.aClass27_13) {
			local15 = local8.method7717(-1978450544);
			local21 = local8.method7695(119);
			Static212.aClass249_4.method6119(local15).method2687(local21);
		} else if (Static565.aClass27_16 == arg0) {
			local8.method7695(108);
			local15 = local8.method7695(114);
			local21 = (local15 >> 4 & 0x7) + Static202.anInt3500;
			local25 = Static193.anInt9745 + (local15 & 0x7);
			local33 = local8.method7717(-1978450544);
			local37 = local8.method7695(96);
			local41 = local8.method7719();
			@Pc(1868) String local1868 = local8.method7703(0);
			Static498.method7484(local25, Static513.anInt8429, local21, local37, local33, local1868, local41);
		} else if (arg0 == Static474.aClass27_14) {
			local15 = local8.method7695(111);
			local21 = local15 >> 2;
			local25 = local15 & 0x3;
			local33 = Static135.anIntArray136[local21];
			local37 = local8.method7749(-16669);
			local41 = Static202.anInt3500 + (local37 >> 4 & 0x7);
			local45 = (local37 & 0x7) + Static193.anInt9745;
			local157 = local8.method7708();
			if (local157 == 65535) {
				local157 = -1;
			}
			Static186.method2744(local45, local157, local33, local21, Static513.anInt8429, local41, local25);
		} else if (arg0 == Static411.aClass27_12) {
			local15 = local8.method7695(125);
			local21 = (local15 >> 4 & 0x7) + Static202.anInt3500;
			local25 = (local15 & 0x7) + Static193.anInt9745;
			local33 = local8.method7717(-1978450544);
			if (local33 == 65535) {
				local33 = -1;
			}
			local37 = local8.method7695(117);
			local41 = local37 >> 4 & 0xF;
			local45 = local37 & 0x7;
			local157 = local8.method7695(121);
			local161 = local8.method7695(113);
			local165 = local8.method7717(-1978450544);
			if (local21 >= 0 && local25 >= 0 && local21 < Static380.anInt6689 && local25 < Static542.anInt9214) {
				local192 = local41 + 1;
				if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray200[0] >= local21 - local192 && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray200[0] <= local21 + local192 && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray201[0] >= local25 - local192 && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray201[0] <= local192 + local25) {
					Static269.method8950(local33, local161, local165, local41 + (local21 << 16) + (Static513.anInt8429 << 24) + (local25 << 8), local157, local45);
				}
			}
		} else {
			Static629.method8829("T3 - " + arg0, (Throwable) null);
			Static334.method5151(false);
		}
	}
}
