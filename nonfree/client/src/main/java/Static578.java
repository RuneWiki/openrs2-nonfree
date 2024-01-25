import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
	public static int anInt9142;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "[Lclient!tf;")
	public static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public static int anInt9140 = 100;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)[Lclient!mi;")
	public static Class242[] method8062() {
		if (Static290.aClass242Array6 == null) {
			@Pc(7) Class242[] local7 = Static310.method4326(Static135.aClass389_2);
			@Pc(11) Class242[] local11 = new Class242[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = Static650.aClass2_Sub30_29.aClass11_Sub14_1.method2893();
			@Pc(110) int local110;
			@Pc(116) Class242 local116;
			label70: for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
				@Pc(28) Class242 local28 = local7[local20];
				if ((local28.anInt6516 <= 0 || local28.anInt6516 >= 24) && local28.anInt6519 >= 800 && local28.anInt6517 >= 600 && (local18 != 2 || local28.anInt6519 <= 800 && local28.anInt6517 <= 600) && (local18 != 1 || local28.anInt6519 <= 1024 && local28.anInt6517 <= 768)) {
					for (local110 = 0; local110 < local13; local110++) {
						local116 = local11[local110];
						if (local116.anInt6519 == local28.anInt6519 && local116.anInt6517 == local28.anInt6517) {
							if (local28.anInt6516 > local116.anInt6516) {
								local11[local110] = local28;
							}
							continue label70;
						}
					}
					local11[local13] = local28;
					local13++;
				}
			}
			Static290.aClass242Array6 = new Class242[local13];
			Static728.method269(local11, 0, Static290.aClass242Array6, 0, local13);
			@Pc(186) int[] local186 = new int[Static290.aClass242Array6.length];
			for (local110 = 0; local110 < Static290.aClass242Array6.length; local110++) {
				local116 = Static290.aClass242Array6[local110];
				local186[local110] = local116.anInt6517 * local116.anInt6519;
			}
			Static564.method7851(local186, Static290.aClass242Array6);
		}
		return Static290.aClass242Array6;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg0;
		@Pc(21) int local21 = arg4 - arg0;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg4 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = (1 - local61) * local33 + local49;
		@Pc(97) int local97 = local37 - (local61 - 1) * local53;
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = local45 * (local57 - 3);
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = local53 * (local61 - 3);
		@Pc(135) int local135 = local105;
		@Pc(141) int local141 = local101 * (arg4 - 1);
		@Pc(143) int local143 = local113;
		@Pc(172) int local172;
		@Pc(180) int local180;
		@Pc(189) int local189;
		@Pc(197) int local197;
		if (arg3 >= Static617.anInt9501 && arg3 <= Static519.anInt8267) {
			@Pc(164) int[] local164 = Static449.anIntArrayArray48[arg3];
			local172 = Static67.method9535(Static8.anInt99, arg1 - arg2, Static14.anInt206);
			local180 = Static67.method9535(Static8.anInt99, arg2 + arg1, Static14.anInt206);
			local189 = Static67.method9535(Static8.anInt99, arg1 - local16, Static14.anInt206);
			local197 = Static67.method9535(Static8.anInt99, local16 + arg1, Static14.anInt206);
			Static494.method7075(local172, arg5, local189, local164, 18601);
			Static494.method7075(local189, arg6, local197, local164, 18601);
			Static494.method7075(local197, arg5, local180, local164, 18601);
		}
		@Pc(221) int local221 = local109 * (local21 - 1);
		while (local9 > 0) {
			@Pc(236) boolean local236 = local21 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local135;
					local70 += local117;
					local7++;
					local117 += local105;
					local135 += local105;
				}
			}
			if (local236) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local127;
						local97 += local143;
						local11++;
						local143 += local113;
						local127 += local113;
					}
				}
				if (local97 < 0) {
					local88 += local127;
					local97 += local143;
					local11++;
					local127 += local113;
					local143 += local113;
				}
				local97 += -local133;
				local88 += -local221;
				local133 -= local109;
				local221 -= local109;
			}
			if (local79 < 0) {
				local79 += local135;
				local70 += local117;
				local117 += local105;
				local7++;
				local135 += local105;
			}
			local79 += -local123;
			local70 += -local141;
			local9--;
			local123 -= local101;
			local141 -= local101;
			local172 = arg3 - local9;
			local180 = arg3 + local9;
			if (Static617.anInt9501 <= local180 && local172 <= Static519.anInt8267) {
				local189 = Static67.method9535(Static8.anInt99, arg1 + local7, Static14.anInt206);
				local197 = Static67.method9535(Static8.anInt99, arg1 - local7, Static14.anInt206);
				if (local236) {
					@Pc(431) int local431 = Static67.method9535(Static8.anInt99, local11 + arg1, Static14.anInt206);
					@Pc(439) int local439 = Static67.method9535(Static8.anInt99, arg1 - local11, Static14.anInt206);
					@Pc(450) int[] local450;
					if (Static617.anInt9501 <= local172) {
						local450 = Static449.anIntArrayArray48[local172];
						Static494.method7075(local197, arg5, local439, local450, 18601);
						Static494.method7075(local439, arg6, local431, local450, 18601);
						Static494.method7075(local431, arg5, local189, local450, 18601);
					}
					if (local180 <= Static519.anInt8267) {
						local450 = Static449.anIntArrayArray48[local180];
						Static494.method7075(local197, arg5, local439, local450, 18601);
						Static494.method7075(local439, arg6, local431, local450, 18601);
						Static494.method7075(local431, arg5, local189, local450, 18601);
					}
				} else {
					if (Static617.anInt9501 <= local172) {
						Static494.method7075(local197, arg5, local189, Static449.anIntArrayArray48[local172], 18601);
					}
					if (local180 <= Static519.anInt8267) {
						Static494.method7075(local197, arg5, local189, Static449.anIntArrayArray48[local180], 18601);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
	public static void method8065() {
		if (Static654.anInt10226 == -1 || Static144.anInt2464 == -1) {
			return;
		}
		@Pc(25) int local25 = (Static165.anInt2831 * (Static220.anInt3520 - Static577.anInt9120) >> 16) + Static577.anInt9120;
		Static165.anInt2831 += local25;
		if (Static165.anInt2831 >= 65535) {
			Static165.anInt2831 = 65535;
			if (Static307.aBoolean407) {
				Static439.aBoolean606 = false;
			} else {
				Static439.aBoolean606 = true;
			}
			Static307.aBoolean407 = true;
		} else {
			Static307.aBoolean407 = false;
			Static439.aBoolean606 = false;
		}
		@Pc(63) float local63 = (float) Static165.anInt2831 / 65535.0F;
		@Pc(66) float[] local66 = new float[3];
		@Pc(70) int local70 = Static599.anInt9313 * 2;
		@Pc(98) int local98;
		@Pc(131) int local131;
		@Pc(139) int local139;
		@Pc(144) int local144;
		@Pc(153) int local153;
		@Pc(170) int local170;
		for (@Pc(72) int local72 = 0; local72 < 3; local72++) {
			@Pc(86) int local86 = Static182.anIntArrayArrayArray27[Static654.anInt10226][local70][local72] * 3;
			local98 = Static182.anIntArrayArrayArray27[Static654.anInt10226][local70 + 1][local72] * 3;
			local131 = (Static182.anIntArrayArrayArray27[Static654.anInt10226][local70 + 2][local72] + Static182.anIntArrayArrayArray27[Static654.anInt10226][local70 + 2][local72] - Static182.anIntArrayArrayArray27[Static654.anInt10226][local70 + 3][local72]) * 3;
			local139 = Static182.anIntArrayArrayArray27[Static654.anInt10226][local70][local72];
			local144 = local98 - local86;
			local153 = local131 + local86 - local98 * 2;
			local170 = local98 + Static182.anIntArrayArrayArray27[Static654.anInt10226][local70 + 2][local72] - local139 - local131;
			local66[local72] = local63 * (((float) local153 + local63 * (float) local170) * local63 + (float) local144) + (float) local139;
		}
		Static430.anInt7002 = (int) local66[0] - Static243.anInt3820 * 512;
		Static218.anInt3475 = (int) local66[2] - Static224.anInt11062 * 512;
		Static411.anInt6731 = (int) local66[1] * -1;
		@Pc(226) float[] local226 = new float[3];
		local98 = Static119.anInt2000 * 2;
		for (local131 = 0; local131 < 3; local131++) {
			local139 = Static182.anIntArrayArrayArray27[Static144.anInt2464][local98][local131] * 3;
			local144 = Static182.anIntArrayArrayArray27[Static144.anInt2464][local98 + 1][local131] * 3;
			local153 = (Static182.anIntArrayArrayArray27[Static144.anInt2464][local98 + 2][local131] + Static182.anIntArrayArrayArray27[Static144.anInt2464][local98 + 2][local131] - Static182.anIntArrayArrayArray27[Static144.anInt2464][local98 + 3][local131]) * 3;
			local170 = Static182.anIntArrayArrayArray27[Static144.anInt2464][local98][local131];
			@Pc(313) int local313 = local144 - local139;
			@Pc(322) int local322 = local139 + local153 - local144 * 2;
			@Pc(340) int local340 = Static182.anIntArrayArrayArray27[Static144.anInt2464][local98 + 2][local131] + local144 - local153 - local170;
			local226[local131] = (float) local170 + (local63 * ((float) local340 * local63 + (float) local322) + (float) local313) * local63;
		}
		@Pc(373) float local373 = local226[0] - local66[0];
		@Pc(383) float local383 = (local226[1] - local66[1]) * -1.0F;
		@Pc(392) float local392 = local226[2] - local66[2];
		@Pc(402) double local402 = Math.sqrt((double) (local392 * local392 + local373 * local373));
		Static583.anInt2354 = (int) (Math.atan2((double) local383, local402) * 2607.5945876176133D) & 0x3FFF;
		Static611.anInt9456 = (int) (-Math.atan2((double) local373, (double) local392) * 2607.5945876176133D) & 0x3FFF;
		Static322.anInt4929 = Static182.anIntArrayArrayArray27[Static654.anInt10226][local70][3] + ((Static182.anIntArrayArrayArray27[Static654.anInt10226][local70 + 2][3] - Static182.anIntArrayArrayArray27[Static654.anInt10226][local70][3]) * Static165.anInt2831 >> 16);
	}
}
