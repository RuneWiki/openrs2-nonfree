import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "I")
	public static int anInt2840;

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "Lclient!ai;")
	public static Class7 aClass7_25;

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "Lclient!kh;")
	public static Class60 aClass60_977 = Static200.method3116("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ch", name = "X", descriptor = "Lclient!kh;")
	private static Class60 aClass60_982 = Static200.method3116("Hidden");

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "Lclient!kh;")
	public static Class60 aClass60_978 = aClass60_982;

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "Lclient!kh;")
	public static Class60 aClass60_979 = Static200.method3116("scrollbar");

	@OriginalMember(owner = "client!ch", name = "V", descriptor = "Lclient!kh;")
	private static Class60 aClass60_980 = Static200.method3116("Unable to find ");

	@OriginalMember(owner = "client!ch", name = "W", descriptor = "Lclient!kh;")
	public static Class60 aClass60_981 = aClass60_980;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)I")
	public static int method2156(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(B)V")
	public static void method2157() {
		for (@Pc(7) int local7 = 0; local7 < Static196.anInt4181; local7++) {
			@Pc(13) int local13 = Static32.anIntArray112[local7]--;
			if (Static32.anIntArray112[local7] >= -10) {
				@Pc(84) Class30 local84 = Static73.aClass30Array1[local7];
				if (local84 == null) {
					local84 = Static223.method1057(Static193.aClass7_Sub1_28, Static158.anIntArray456[local7], 0);
					if (local84 == null) {
						continue;
					}
					Static32.anIntArray112[local7] += local84.method1054();
					Static73.aClass30Array1[local7] = local84;
				}
				if (Static32.anIntArray112[local7] < 0) {
					@Pc(208) int local208;
					if (Static154.anIntArray446[local7] == 0) {
						local208 = Static67.anInt1657;
					} else {
						@Pc(130) int local130 = Static154.anIntArray446[local7] >> 16 & 0xFF;
						@Pc(139) int local139 = local130 * 128 + 64 - Static84.aClass9_Sub4_Sub1_2.anInt3925;
						if (local139 < 0) {
							local139 = -local139;
						}
						@Pc(152) int local152 = (Static154.anIntArray446[local7] & 0xFF) * 128;
						@Pc(160) int local160 = Static154.anIntArray446[local7] >> 8 & 0xFF;
						@Pc(170) int local170 = local160 * 128 + 64 - Static84.aClass9_Sub4_Sub1_2.anInt3903;
						if (local170 < 0) {
							local170 = -local170;
						}
						@Pc(182) int local182 = local139 + local170 - 128;
						if (local152 < local182) {
							Static32.anIntArray112[local7] = -100;
							continue;
						}
						if (local182 < 0) {
							local182 = 0;
						}
						local208 = Static79.anInt1900 * (local152 - local182) / local152;
					}
					if (local208 > 0) {
						@Pc(219) Class1_Sub19_Sub1 local219 = local84.method1055().method2523(Static139.aClass53_1);
						@Pc(224) Class1_Sub7_Sub4 local224 = Static229.method3466(local219, local208);
						local224.method3470(Static4.anIntArray12[local7] - 1);
						Static166.aClass1_Sub7_Sub2_2.method3378(local224);
					}
					Static32.anIntArray112[local7] = -100;
				}
			} else {
				Static196.anInt4181--;
				for (@Pc(27) int local27 = local7; local27 < Static196.anInt4181; local27++) {
					Static158.anIntArray456[local27] = Static158.anIntArray456[local27 + 1];
					Static73.aClass30Array1[local27] = Static73.aClass30Array1[local27 + 1];
					Static4.anIntArray12[local27] = Static4.anIntArray12[local27 + 1];
					Static32.anIntArray112[local27] = Static32.anIntArray112[local27 + 1];
					Static154.anIntArray446[local27] = Static154.anIntArray446[local27 + 1];
				}
				local7--;
			}
		}
		if (Static105.aBoolean134 && !Static161.method2694()) {
			if (Static155.anInt3456 != 0 && Static163.anInt3583 != -1) {
				Static84.method1048(Static163.anInt3583, Static155.anInt3456, Static106.aClass7_Sub1_19);
			}
			Static105.aBoolean134 = false;
		} else if (Static155.anInt3456 != 0 && Static163.anInt3583 != -1 && !Static161.method2694()) {
			Static96.aClass1_Sub9_Sub1_3.method953(133);
			Static96.aClass1_Sub9_Sub1_3.method921(Static163.anInt3583);
			Static163.anInt3583 = -1;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIZIII)V")
	public static void method2160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) Class94[] local9 = Static77.aClass94Array1;
		while (local7 < local9.length) {
			@Pc(15) Class94 local15 = local9[local7];
			if (local15 != null && local15.anInt3978 == 2) {
				Static82.method1451(local15.anInt3971 + (local15.anInt3966 - Static128.anInt2813 << 7), arg1 >> 1, local15.anInt3968 + (local15.anInt3969 - Static163.anInt3587 << 7), local15.anInt3967 * 2, arg2 >> 1);
				if (Static52.anInt1422 > -1 && Static42.anInt910 % 20 < 10) {
					Static122.aClass1_Sub1_Sub6Array7[local15.anInt3972].method2164(arg3 + Static52.anInt1422 - 12, Static104.anInt2368 + -28 + arg0);
				}
			}
			local7++;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(28) int local28 = arg5 - arg2;
		@Pc(33) int local33 = arg6 - arg2;
		@Pc(37) int local37 = arg5 * arg5;
		@Pc(41) int local41 = arg6 * arg6;
		@Pc(45) int local45 = local28 * local28;
		@Pc(49) int local49 = local33 * local33;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = local49 << 1;
		@Pc(65) int local65 = arg6 << 1;
		@Pc(69) int local69 = local33 << 1;
		@Pc(78) int local78 = local53 + (1 - local65) * local37;
		@Pc(82) int local82 = local45 << 1;
		@Pc(92) int local92 = (1 - local69) * local45 + local61;
		@Pc(100) int local100 = local41 - (local65 - 1) * local57;
		@Pc(109) int local109 = local49 - local82 * (local69 - 1);
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 << 2;
		@Pc(121) int local121 = local49 << 2;
		@Pc(125) int local125 = local45 << 2;
		@Pc(131) int local131 = (local65 - 3) * local57;
		@Pc(135) int local135 = local53 * 3;
		@Pc(139) int local139 = local61 * 3;
		@Pc(141) int local141 = local117;
		@Pc(147) int local147 = (arg6 - 1) * local113;
		@Pc(153) int local153 = local82 * (local69 - 3);
		@Pc(155) int local155 = local121;
		@Pc(174) int local174;
		@Pc(182) int local182;
		@Pc(191) int local191;
		@Pc(200) int local200;
		if (Static141.anInt3163 <= arg0 && Static200.anInt4273 >= arg0) {
			@Pc(165) int[] local165 = Static148.anIntArrayArray78[arg0];
			local174 = Static107.method1863(Static214.anInt4572, arg3 - arg5, Static130.anInt2847);
			local182 = Static107.method1863(Static214.anInt4572, arg5 + arg3, Static130.anInt2847);
			local191 = Static107.method1863(Static214.anInt4572, arg3 - local28, Static130.anInt2847);
			local200 = Static107.method1863(Static214.anInt4572, arg3 + local28, Static130.anInt2847);
			Static104.method1768(local174, local191, arg4, local165);
			Static104.method1768(local191, local200, arg1, local165);
			Static104.method1768(local200, local182, arg4, local165);
		}
		@Pc(226) int local226 = (local33 - 1) * local125;
		while (local9 > 0) {
			@Pc(235) boolean local235 = local9 <= local33;
			local9--;
			if (local235) {
				if (local92 < 0) {
					while (local92 < 0) {
						local11++;
						local109 += local155;
						local92 += local139;
						local155 += local121;
						local139 += local121;
					}
				}
				if (local109 < 0) {
					local109 += local155;
					local11++;
					local92 += local139;
					local155 += local121;
					local139 += local121;
				}
				local92 += -local226;
				local109 += -local153;
				local226 -= local125;
				local153 -= local125;
			}
			if (local78 < 0) {
				while (local78 < 0) {
					local7++;
					local78 += local135;
					local135 += local117;
					local100 += local141;
					local141 += local117;
				}
			}
			if (local100 < 0) {
				local7++;
				local78 += local135;
				local135 += local117;
				local100 += local141;
				local141 += local117;
			}
			local78 += -local147;
			local174 = arg0 - local9;
			local100 += -local131;
			local131 -= local113;
			local147 -= local113;
			local182 = arg0 + local9;
			if (local182 >= Static141.anInt3163 && Static200.anInt4273 >= local174) {
				local191 = Static107.method1863(Static214.anInt4572, arg3 + local7, Static130.anInt2847);
				local200 = Static107.method1863(Static214.anInt4572, arg3 - local7, Static130.anInt2847);
				if (local235) {
					@Pc(406) int local406 = Static107.method1863(Static214.anInt4572, local11 + arg3, Static130.anInt2847);
					@Pc(415) int local415 = Static107.method1863(Static214.anInt4572, arg3 - local11, Static130.anInt2847);
					@Pc(426) int[] local426;
					if (local174 >= Static141.anInt3163) {
						local426 = Static148.anIntArrayArray78[local174];
						Static104.method1768(local200, local415, arg4, local426);
						Static104.method1768(local415, local406, arg1, local426);
						Static104.method1768(local406, local191, arg4, local426);
					}
					if (Static200.anInt4273 >= local182) {
						local426 = Static148.anIntArrayArray78[local182];
						Static104.method1768(local200, local415, arg4, local426);
						Static104.method1768(local415, local406, arg1, local426);
						Static104.method1768(local406, local191, arg4, local426);
					}
				} else {
					if (Static141.anInt3163 <= local174) {
						Static104.method1768(local200, local191, arg4, Static148.anIntArrayArray78[local174]);
					}
					if (local182 <= Static200.anInt4273) {
						Static104.method1768(local200, local191, arg4, Static148.anIntArrayArray78[local182]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILclient!ah;)I")
	public static int method2168(@OriginalArg(1) int arg0, @OriginalArg(2) Class6 arg1) {
		if (arg1.anIntArrayArray6 == null || arg1.anIntArrayArray6.length <= arg0) {
			return -2;
		}
		try {
			@Pc(25) int[] local25 = arg1.anIntArrayArray6[arg0];
			@Pc(27) int local27 = 0;
			@Pc(29) int local29 = 0;
			@Pc(31) byte local31 = 0;
			while (true) {
				@Pc(36) int local36 = local25[local29++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local27;
				}
				if (local36 == 1) {
					local38 = Static173.anIntArray493[local25[local29++]];
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 2) {
					local38 = Static105.anIntArray305[local25[local29++]];
				}
				if (local36 == 3) {
					local38 = Static157.anIntArray452[local25[local29++]];
				}
				@Pc(100) int local100;
				@Pc(111) Class6 local111;
				@Pc(116) int local116;
				@Pc(128) int local128;
				if (local36 == 4) {
					local100 = local25[local29++] << 16;
					@Pc(107) int local107 = local100 + local25[local29++];
					local111 = Static107.method1857(local107);
					local116 = local25[local29++];
					if (local116 != -1 && (!Static191.method2990(local116).aBoolean164 || Static202.aBoolean238)) {
						for (local128 = 0; local128 < local111.anIntArray31.length; local128++) {
							if (local116 + 1 == local111.anIntArray31[local128]) {
								local38 += local111.anIntArray26[local128];
							}
						}
					}
				}
				if (local36 == 5) {
					local38 = Static126.anIntArray358[local25[local29++]];
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 6) {
					local38 = Class79.anIntArray458[Static105.anIntArray305[local25[local29++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static126.anIntArray358[local25[local29++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static84.aClass9_Sub4_Sub1_2.anInt1412;
				}
				if (local36 == 9) {
					for (local100 = 0; local100 < 25; local100++) {
						if (Static113.aBooleanArray17[local100]) {
							local38 += Static105.anIntArray305[local100];
						}
					}
				}
				if (local36 == 10) {
					local100 = local25[local29++] << 16;
					local100 += local25[local29++];
					local111 = Static107.method1857(local100);
					local116 = local25[local29++];
					if (local116 != -1 && (!Static191.method2990(local116).aBoolean164 || Static202.aBoolean238)) {
						for (local128 = 0; local128 < local111.anIntArray31.length; local128++) {
							if (local116 + 1 == local111.anIntArray31[local128]) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static206.anInt4384;
				}
				if (local36 == 12) {
					local38 = Static56.anInt1486;
				}
				if (local36 == 13) {
					local100 = Static126.anIntArray358[local25[local29++]];
					@Pc(332) int local332 = local25[local29++];
					local38 = (local100 & 0x1 << local332) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local100 = local25[local29++];
					local38 = Static7.method142(local100);
				}
				if (local36 == 18) {
					local38 = Static128.anInt2813 + (Static84.aClass9_Sub4_Sub1_2.anInt3925 >> 7);
				}
				if (local36 == 19) {
					local38 = (Static84.aClass9_Sub4_Sub1_2.anInt3903 >> 7) + Static163.anInt3587;
				}
				if (local36 == 20) {
					local38 = local25[local29++];
				}
				if (local40 == 0) {
					if (local31 == 0) {
						local27 += local38;
					}
					if (local31 == 1) {
						local27 -= local38;
					}
					if (local31 == 2 && local38 != 0) {
						local27 /= local38;
					}
					if (local31 == 3) {
						local27 *= local38;
					}
					local31 = 0;
				} else {
					local31 = local40;
				}
			}
		} catch (@Pc(437) Exception local437) {
			return -1;
		}
	}
}
