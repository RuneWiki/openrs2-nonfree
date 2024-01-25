import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "[Lclient!ms;")
	public static Class137[] aClass137Array1;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "[Lclient!ph;")
	public static final Class11_Sub4_Sub14[] aClass11_Sub4_Sub14Array1 = new Class11_Sub4_Sub14[14];

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
	public static int anInt245 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method176(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class11_Sub4_Sub12 local16 = Static35.method512(2, arg1);
		local16.method3858();
		local16.aString41 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
	public static void method177() {
		Static186.aClass58_17.method1011();
		Static64.aClass74_4.method1298();
		Static86.aClass74_5.method1298();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLclient!uo;)V")
	public static void method179(@OriginalArg(1) Class129 arg0) {
		@Pc(7) int local7 = Static204.anInt4174;
		@Pc(9) int local9 = Static24.anInt452;
		@Pc(11) int local11 = Static101.anInt1790;
		@Pc(15) int local15 = Static45.anInt880 - 3;
		if (Static67.aClass97_10 == null || Static191.aClass97_21 == null) {
			if (Static182.aClass144_49.method3910(Static87.anInt1556) && Static182.aClass144_49.method3910(Static72.anInt1376)) {
				Static67.aClass97_10 = arg0.method5018(Static368.method2857(Static182.aClass144_49, Static87.anInt1556, 0));
				@Pc(61) Class125 local61 = Static368.method2857(Static182.aClass144_49, Static72.anInt1376, 0);
				Static191.aClass97_21 = arg0.method5018(local61);
				local61.method2870();
				Static35.aClass97_4 = arg0.method5018(local61);
			} else {
				arg0.method4945(local7, local9, local11, 20, 255 - Static248.anInt4968 << 24 | Static240.anInt4836, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static67.aClass97_10 != null && Static191.aClass97_21 != null) {
			local87 = (local11 - Static191.aClass97_21.method5558() * 2) / Static67.aClass97_10.method5558();
			for (local89 = 0; local89 < local87; local89++) {
				Static67.aClass97_10.method5555(Static191.aClass97_21.method5558() + local7 + Static67.aClass97_10.method5558() * local89, local9);
			}
			Static191.aClass97_21.method5555(local7, local9);
			Static35.aClass97_4.method5555(local7 + local11 - Static35.aClass97_4.method5558(), local9);
		}
		Static106.aClass9_2.method3573(-1, local9 + 14, Static349.aClass117_118.method2684(Static230.anInt4634), local7 + 3, Static192.anInt3946 | 0xFF000000);
		arg0.method4945(local7, local9 + 20, local11, local15 - 20, Static240.anInt4836 | -Static248.anInt4968 + 255 << 24, 1);
		local87 = Static214.aClass29_1.method384();
		local89 = Static214.aClass29_1.method381();
		@Pc(190) int local190;
		for (@Pc(171) int local171 = 0; local171 < anInt245; local171++) {
			local190 = local9 + (-local171 + anInt245 + -1) * 16 + 13 + 20;
			if (local7 < local87 && local7 + local11 > local87 && local190 - 13 < local89 && local89 < local190 + 4) {
				arg0.method4945(local7, local190 - 12, local11, 16, 255 - Static276.anInt5527 << 24 | Static166.anInt3314, 1);
			}
		}
		if ((Static259.aClass97_17 == null || Static311.aClass97_3 == null || Static198.aClass97_15 == null) && Static182.aClass144_49.method3910(Static72.anInt1377) && Static182.aClass144_49.method3910(Static210.anInt4269) && Static182.aClass144_49.method3910(Static351.anInt6344)) {
			@Pc(271) Class125 local271 = Static368.method2857(Static182.aClass144_49, Static210.anInt4269, 0);
			Static311.aClass97_3 = arg0.method5018(local271);
			local271.method2870();
			Static305.aClass97_20 = arg0.method5018(local271);
			Static259.aClass97_17 = arg0.method5018(Static368.method2857(Static182.aClass144_49, Static72.anInt1377, 0));
			@Pc(296) Class125 local296 = Static368.method2857(Static182.aClass144_49, Static351.anInt6344, 0);
			Static198.aClass97_15 = arg0.method5018(local296);
			local296.method2870();
			Static341.aClass97_22 = arg0.method5018(local296);
		}
		@Pc(368) int local368;
		@Pc(370) int local370;
		if (Static259.aClass97_17 != null && Static311.aClass97_3 != null && Static198.aClass97_15 != null) {
			local190 = (local11 - Static198.aClass97_15.method5558() * 2) / Static259.aClass97_17.method5558();
			for (@Pc(327) int local327 = 0; local327 < local190; local327++) {
				Static259.aClass97_17.method5555(Static198.aClass97_15.method5558() + local7 + Static259.aClass97_17.method5558() * local327, -Static259.aClass97_17.method5543() + local9 + local15);
			}
			local368 = (local15 - Static198.aClass97_15.method5543() - 20) / Static311.aClass97_3.method5543();
			for (local370 = 0; local370 < local368; local370++) {
				Static311.aClass97_3.method5555(local7, local370 * Static311.aClass97_3.method5543() + local9 + 20);
				Static305.aClass97_20.method5555(local7 + local11 - Static305.aClass97_20.method5558(), local9 - (-20 - local370 * Static311.aClass97_3.method5543()));
			}
			Static198.aClass97_15.method5555(local7, local9 + local15 - Static198.aClass97_15.method5543());
			Static341.aClass97_22.method5555(local11 + local7 - Static198.aClass97_15.method5558(), local15 + local9 - Static198.aClass97_15.method5543());
		}
		local190 = 0;
		for (@Pc(443) Class11_Sub14 local443 = (Class11_Sub14) Static119.aClass16_21.method193(); local443 != null; local443 = (Class11_Sub14) Static119.aClass16_21.method188()) {
			local368 = (anInt245 - local190 - 1) * 16 + local9 + 13 + 20;
			local370 = Static192.anInt3946 | 0xFF000000;
			if (local87 > local7 && local87 < local11 + local7 && local89 > local368 - 13 && local368 + 4 > local89) {
				local370 = Static352.anInt6699 | 0xFF000000;
			}
			@Pc(509) int[] local509 = null;
			if (Static264.method4577(local443.anInt1765)) {
				local509 = Static283.method4717((int) local443.aLong67).anIntArray403;
			} else if (Static59.method900(local443.anInt1765)) {
				@Pc(533) Class67_Sub3_Sub3_Sub1 local533 = Static356.aClass67_Sub3_Sub3_Sub1Array1[(int) local443.aLong67];
				if (local533 != null) {
					local509 = local533.aClass82_1.anIntArray135;
				}
			} else if (Static53.method798(local443.anInt1765)) {
				if (local443.anInt1765 == 1003) {
					local509 = Static108.method1650((int) local443.aLong67).anIntArray145;
				} else {
					local509 = Static108.method1650((int) (local443.aLong67 >>> 32 & 0x7FFFFFFFL)).anIntArray145;
				}
			}
			@Pc(574) String local574 = Static278.method5396(local443);
			if (local509 != null) {
				local574 = local574 + Static174.method2823(local509);
			}
			Static106.aClass9_2.method3585(local370, Static209.aClass97Array16, local7 + 3, Static229.anIntArray350, local368, local574);
			local190++;
		}
		Static100.method1483(Static45.anInt880, Static24.anInt452, Static101.anInt1790, Static204.anInt4174);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZZI)V")
	public static void method184(@OriginalArg(1) boolean arg0) {
		Static233.anInt4717--;
		if (Static233.anInt4717 == 0) {
			Static315.anIntArray506 = null;
		}
		if (arg0) {
			Static191.anInt6249--;
			if (Static191.anInt6249 == 0) {
				Static81.anIntArray100 = null;
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIILclient!jo;)V")
	public static void method185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class67_Sub5 arg4) {
		arg4.anInt5540 = (arg1 << 7) + 64;
		arg4.anInt5537 = arg3;
		arg4.anInt5542 = (arg2 << 7) + 64;
		@Pc(24) Class106 local24 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class64 local31 = local24.aClass64_4; local31 != null; local31 = local31.aClass64_2) {
				if (local31.aClass67_Sub3_1.aBoolean409) {
					@Pc(41) int local41 = local31.aClass67_Sub3_1.method5408();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt5537 += local28;
				arg4.aBoolean358 = true;
			}
		}
		if (Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static112.method1688(arg0, arg1, arg2);
		}
		Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2].aClass67_Sub5_1 = arg4;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!uo;Lclient!ms;IIB)V")
	public static void method189(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class66 local10 = arg1.method3609(arg0);
		if (local10 == null) {
			return;
		}
		arg0.method4952(arg3, arg2, arg3 + arg1.anInt4060, arg2 + arg1.anInt4110);
		if (Static9.anInt153 == 2 || Static9.anInt153 == 5 || Static42.aClass97_6 == null) {
			arg0.method4970(local10, arg3, arg2);
			return;
		}
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(57) int local57;
		@Pc(59) int local59;
		if (Static81.anInt1498 == 4) {
			local57 = (int) -Static246.aFloat51 & 0x3FFF;
			local59 = 4096;
			local61 = Static283.anInt5592;
			local63 = Static352.anInt6703;
		} else {
			local63 = Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310;
			local59 = 4096 - Static231.anInt5050 * 16;
			local57 = (int) -Static246.aFloat51 + Static303.anInt4931 & 0x3FFF;
			local61 = Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308;
		}
		@Pc(99) int local99 = local61 / 32 + 208 + 48 - Static24.anInt454 * 2;
		@Pc(117) int local117 = Static240.anInt4832 * 4 + 48 + 208 - local63 / 32 - Static240.anInt4832 * 2;
		Static42.aClass97_6.method5556((float) arg3 + (float) arg1.anInt4060 / 2.0F, (float) arg2 + (float) arg1.anInt4110 / 2.0F, (float) local99, (float) local117, local59, local57 << 2, local10, arg3, arg2);
		@Pc(168) int local168;
		@Pc(177) int local177;
		@Pc(187) int local187;
		@Pc(198) int local198;
		for (@Pc(151) Class11_Sub33 local151 = (Class11_Sub33) Static129.aClass16_24.method193(); local151 != null; local151 = (Class11_Sub33) Static129.aClass16_24.method188()) {
			@Pc(156) int local156 = local151.anInt5153;
			local168 = (Static22.aClass199_1.anIntArray513[local156] >> 14 & 0x3FFF) - Static182.anInt3662;
			local177 = (Static22.aClass199_1.anIntArray513[local156] & 0x3FFF) - Static169.anInt6312;
			local187 = local168 * 4 + 2 - local61 / 32;
			local198 = local177 * 4 + 2 - local63 / 32;
			Static12.method175(Static22.aClass199_1.anIntArray512[local156], arg0, local187, local198, arg3, arg2, local10, arg1);
		}
		for (local168 = 0; local168 < Static2.anInt14; local168++) {
			local177 = Static200.anIntArray314[local168] * 4 + 2 - local61 / 32;
			local187 = Static166.anIntArray218[local168] * 4 + 2 - local63 / 32;
			@Pc(254) Class84 local254 = Static108.method1650(Static107.anIntArray138[local168]);
			if (local254.anIntArray142 != null) {
				local254 = local254.method1635();
				if (local254 == null || local254.anInt2002 == -1) {
					continue;
				}
			}
			Static12.method175(local254.anInt2002, arg0, local177, local187, arg3, arg2, local10, arg1);
		}
		for (@Pc(289) Class11_Sub40 local289 = (Class11_Sub40) Static301.aClass58_35.method1008(); local289 != null; local289 = (Class11_Sub40) Static301.aClass58_35.method1004()) {
			local187 = (int) (local289.aLong215 >> 28 & 0x3L);
			if (Static91.anInt1786 == local187) {
				local198 = (int) (local289.aLong215 & 0x3FFFL) * 4 + 2 - local61 / 32;
				@Pc(334) int local334 = (int) (local289.aLong215 >> 14 & 0x3FFFL) * 4 + 2 - local63 / 32;
				Static189.method496(arg3, local10, arg1, local198, local334, Static147.aClass97Array11[0], arg2);
			}
		}
		@Pc(398) int local398;
		@Pc(408) int local408;
		for (local187 = 0; local187 < Static141.anInt2601; local187++) {
			@Pc(362) Class67_Sub3_Sub3_Sub1 local362 = Static356.aClass67_Sub3_Sub3_Sub1Array1[Static4.anIntArray4[local187]];
			if (local362 != null && local362.method2674()) {
				@Pc(371) Class82 local371 = local362.aClass82_1;
				if (local371 != null && local371.anIntArray134 != null) {
					local371 = local371.method1569();
				}
				if (local371 != null && local371.aBoolean114 && local371.aBoolean117) {
					local398 = local362.anInt6308 / 32 - local61 / 32;
					local408 = local362.anInt6310 / 32 - local63 / 32;
					if (local371.anInt1885 == -1) {
						Static189.method496(arg3, local10, arg1, local398, local408, Static147.aClass97Array11[1], arg2);
					} else {
						Static12.method175(local371.anInt1885, arg0, local398, local408, arg3, arg2, local10, arg1);
					}
				}
			}
		}
		@Pc(480) int local480;
		for (local198 = 0; local198 < Static331.anInt6366; local198++) {
			@Pc(451) Class67_Sub3_Sub3_Sub2 local451 = Static105.aClass67_Sub3_Sub3_Sub2Array1[Static87.anIntArray104[local198]];
			if (local451 != null && local451.method4383()) {
				local398 = local451.anInt6308 / 32 - local61 / 32;
				local408 = local451.anInt6310 / 32 - local63 / 32;
				@Pc(478) boolean local478 = false;
				for (local480 = 0; local480 < Static20.anInt374; local480++) {
					if (local451.aString50.equals(Static193.aStringArray30[local480]) && Static16.anIntArray18[local480] != 0) {
						local478 = true;
						break;
					}
				}
				@Pc(503) boolean local503 = false;
				for (@Pc(505) int local505 = 0; local505 < Static19.anInt1985; local505++) {
					if (local451.aString50.equals(Static119.aClass19Array1[local505].aString4)) {
						local503 = true;
						break;
					}
				}
				@Pc(525) boolean local525 = false;
				if (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5106 != 0 && local451.anInt5106 != 0 && local451.anInt5106 == Static156.aClass67_Sub3_Sub3_Sub2_2.anInt5106) {
					local525 = true;
				}
				if (local478) {
					Static189.method496(arg3, local10, arg1, local398, local408, Static147.aClass97Array11[3], arg2);
				} else if (local503) {
					Static189.method496(arg3, local10, arg1, local398, local408, Static147.aClass97Array11[5], arg2);
				} else if (local525) {
					Static189.method496(arg3, local10, arg1, local398, local408, Static147.aClass97Array11[4], arg2);
				} else {
					Static189.method496(arg3, local10, arg1, local398, local408, Static147.aClass97Array11[2], arg2);
				}
			}
		}
		@Pc(606) Class119[] local606 = Static23.aClass119Array1;
		@Pc(696) int local696;
		for (local398 = 0; local398 < local606.length; local398++) {
			@Pc(614) Class119 local614 = local606[local398];
			if (local614 != null && local614.anInt3328 != 0 && Static293.anInt5807 % 20 < 10) {
				@Pc(667) int local667;
				if (local614.anInt3328 == 1 && local614.anInt3336 >= 0 && local614.anInt3336 < Static356.aClass67_Sub3_Sub3_Sub1Array1.length) {
					@Pc(645) Class67_Sub3_Sub3_Sub1 local645 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local614.anInt3336];
					if (local645 != null) {
						local480 = local645.anInt6308 / 32 - local61 / 32;
						local667 = local645.anInt6310 / 32 - local63 / 32;
						Static14.method206(local614.anInt3323, arg2, local10, 360000, local480, arg3, local667, arg1);
					}
				}
				if (local614.anInt3328 == 2) {
					local696 = (local614.anInt3330 - Static182.anInt3662) * 4 + 2 - local61 / 32;
					local480 = (local614.anInt3337 - Static169.anInt6312) * 4 + 2 - local63 / 32;
					local667 = local614.anInt3333 * 4;
					local667 *= local667;
					Static14.method206(local614.anInt3323, arg2, local10, local667, local696, arg3, local480, arg1);
				}
				if (local614.anInt3328 == 10 && local614.anInt3336 >= 0 && Static105.aClass67_Sub3_Sub3_Sub2Array1.length > local614.anInt3336) {
					@Pc(757) Class67_Sub3_Sub3_Sub2 local757 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local614.anInt3336];
					if (local757 != null) {
						local480 = local757.anInt6308 / 32 - local61 / 32;
						local667 = local757.anInt6310 / 32 - local63 / 32;
						Static14.method206(local614.anInt3323, arg2, local10, 360000, local480, arg3, local667, arg1);
					}
				}
			}
		}
		if (Static81.anInt1498 == 4) {
			return;
		}
		if (Static132.anInt2474 != 0) {
			local408 = Static132.anInt2474 * 4 + Static156.aClass67_Sub3_Sub3_Sub2_2.method4368() * 2 + 2 - local61 / 32 - 2;
			local696 = Static276.anInt5528 * 4 + Static156.aClass67_Sub3_Sub3_Sub2_2.method4368() * 2 + 2 - local63 / 32 - 2;
			Static189.method496(arg3, local10, arg1, local408, local696, Static145.aClass97Array10[Static310.aBoolean406 ? 1 : 0], arg2);
		}
		arg0.method4941(arg1.anInt4060 / 2 + arg3 - 1, arg1.anInt4110 / 2 + -1 + arg2, 3, -1, 3);
	}
}
