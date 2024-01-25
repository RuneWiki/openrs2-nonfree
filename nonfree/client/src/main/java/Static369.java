import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "[[Lclient!vg;")
	public static Class250[][] aClass250ArrayArray5;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "(B)Lclient!id;")
	public static Class114_Sub1 method3949() {
		return Static74.anInt1410 < Static237.aClass114_Sub1Array3.length ? Static237.aClass114_Sub1Array3[Static74.anInt1410++] : null;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZZB)V")
	public static void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3 && Static92.anInt1619 == arg1 && Static64.anInt1135 == arg0 && (Static138.anInt3548 == Static257.anInt6933 || Static336.aClass106_Sub1_1.method4438(Static410.anInt6680))) {
			return;
		}
		Static92.anInt1619 = arg1;
		Static257.anInt6933 = Static138.anInt3548;
		Static64.anInt1135 = arg0;
		if (Static336.aClass106_Sub1_1.method4438(Static410.anInt6680)) {
			Static257.anInt6933 = 0;
		}
		if (arg2) {
			Static430.method5422(28);
		} else {
			Static430.method5422(25);
		}
		Static357.method4619(Static275.aClass16_2, Static81.aClass151_51.method3122(Static188.anInt3028), true);
		@Pc(55) int local55 = Static101.anInt6646;
		Static101.anInt6646 = (Static92.anInt1619 - (Static425.anInt6922 >> 4)) * 8;
		@Pc(65) int local65 = Static278.anInt4392;
		Static278.anInt4392 = (Static64.anInt1135 - (Static251.anInt4072 >> 4)) * 8;
		Static149.aClass1_Sub3_Sub16_4 = Static114.method5215(Static92.anInt1619 * 8, Static64.anInt1135 * 8);
		Static403.aClass22_2 = null;
		@Pc(89) int local89 = Static101.anInt6646 - local55;
		@Pc(94) int local94 = Static278.anInt4392 - local65;
		@Pc(104) int local104;
		@Pc(112) int local112;
		if (arg2) {
			Static411.anInt6695 = 0;
			local104 = Static425.anInt6922 * 128 - 128;
			@Pc(110) int local110 = Static251.anInt4072 * 128 - 128;
			for (local112 = 0; local112 < 32768; local112++) {
				@Pc(118) Class20_Sub3_Sub3_Sub2 local118 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local112];
				if (local118 != null) {
					local118.anInt6616 -= local94 * 128;
					local118.anInt6613 -= local89 * 128;
					if (local118.anInt6613 >= 0 && local104 >= local118.anInt6613 && local118.anInt6616 >= 0 && local110 >= local118.anInt6616) {
						@Pc(170) boolean local170 = true;
						for (@Pc(172) int local172 = 0; local172 < 10; local172++) {
							local118.anIntArray370[local172] -= local89;
							local118.anIntArray369[local172] -= local94;
							if (local118.anIntArray370[local172] < 0 || Static425.anInt6922 <= local118.anIntArray370[local172] || local118.anIntArray369[local172] < 0 || Static251.anInt4072 <= local118.anIntArray369[local172]) {
								local170 = false;
							}
						}
						if (local170) {
							Static220.anIntArray193[Static411.anInt6695++] = local112;
						} else {
							Static98.aClass20_Sub3_Sub3_Sub2Array1[local112].method4695(null);
							Static98.aClass20_Sub3_Sub3_Sub2Array1[local112] = null;
						}
					} else {
						Static98.aClass20_Sub3_Sub3_Sub2Array1[local112].method4695(null);
						Static98.aClass20_Sub3_Sub3_Sub2Array1[local112] = null;
					}
				}
			}
		} else {
			for (local104 = 0; local104 < 32768; local104++) {
				@Pc(260) Class20_Sub3_Sub3_Sub2 local260 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local104];
				if (local260 != null) {
					for (local112 = 0; local112 < 10; local112++) {
						local260.anIntArray370[local112] -= local89;
						local260.anIntArray369[local112] -= local94;
					}
					local260.anInt6616 -= local94 * 128;
					local260.anInt6613 -= local89 * 128;
				}
			}
		}
		for (local104 = 0; local104 < 2048; local104++) {
			@Pc(318) Class20_Sub3_Sub3_Sub1 local318 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local104];
			if (local318 != null) {
				for (local112 = 0; local112 < 10; local112++) {
					local318.anIntArray370[local112] -= local89;
					local318.anIntArray369[local112] -= local94;
				}
				local318.anInt6613 -= local89 * 128;
				local318.anInt6616 -= local94 * 128;
			}
		}
		@Pc(366) Class209[] local366 = Static162.aClass209Array1;
		for (local112 = 0; local112 < local366.length; local112++) {
			@Pc(374) Class209 local374 = local366[local112];
			if (local374 != null) {
				local374.anInt5502 -= local89 * 128;
				local374.anInt5507 -= local94 * 128;
			}
		}
		Static378.method4844(local89, local94);
		for (@Pc(406) Class1_Sub30 local406 = (Class1_Sub30) Static204.aClass254_22.method5437(); local406 != null; local406 = (Class1_Sub30) Static204.aClass254_22.method5433()) {
			local406.anInt4691 -= local94;
			local406.anInt4697 -= local89;
			if (Static108.anInt1918 != 3 && (local406.anInt4697 < 0 || local406.anInt4691 < 0 || local406.anInt4697 >= Static425.anInt6922 || local406.anInt4691 >= Static251.anInt4072)) {
				local406.method5617();
			}
		}
		if (Static174.anInt2859 != 0) {
			Static313.anInt5206 -= local94;
			Static174.anInt2859 -= local89;
		}
		Static22.method413();
		if (arg2) {
			Static253.anInt4091 -= local89;
			Static315.anInt5218 -= local89;
			Static278.anInt4391 -= local89 * 128;
			Static8.anInt7337 -= local94 * 128;
			Static65.anInt1146 -= local94;
			Static427.anInt7043 -= local94;
			if (Math.abs(local89) > Static425.anInt6922 || Math.abs(local94) > Static251.anInt4072) {
				Static421.method5243();
			}
		} else if (Static100.anInt1781 == 4) {
			Static327.anInt5372 -= local89 * 128;
			Static446.anInt7388 -= local89 * 128;
			Static317.anInt5271 -= local94 * 128;
			Static155.anInt2606 -= local94 * 128;
		} else {
			Static100.anInt1781 = 1;
		}
		Static431.method5425();
		Static390.method4942();
		Static245.aClass254_23.method5438();
		Static264.aClass254_25.method5438();
		Static78.aClass227_4.method4835();
		Static102.method1466();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLclient!mv;)V")
	public static void method3952(@OriginalArg(1) Class1_Sub11_Sub1 arg0) {
		arg0.method3352();
		@Pc(10) int local10 = Static348.anInt5668;
		@Pc(20) Class20_Sub3_Sub3_Sub1 local20 = Static239.aClass20_Sub3_Sub3_Sub1_1 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local10] = new Class20_Sub3_Sub3_Sub1();
		local20.anInt6045 = local10;
		@Pc(28) int local28 = arg0.method3347(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray370[0] = local39 - Static101.anInt6646;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt6613 = (local20.anIntArray370[0] << 7) + (local20.method4678() << 6);
		local20.anIntArray369[0] = local51 - Static278.anInt4392;
		local20.anInt6616 = (local20.anIntArray369[0] << 7) + (local20.method4678() << 6);
		Static138.anInt3548 = local20.aByte89 = local33;
		if (Static72.aClass1_Sub11Array1[local10] != null) {
			local20.method3882(Static72.aClass1_Sub11Array1[local10]);
		}
		Static31.anInt624 = 0;
		Static363.anIntArray373[Static31.anInt624++] = local10;
		Static251.aByteArray43[local10] = 0;
		Static272.anInt4302 = 0;
		for (@Pc(121) int local121 = 1; local121 < 2048; local121++) {
			if (local10 != local121) {
				@Pc(131) int local131 = arg0.method3347(18);
				@Pc(135) int local135 = local131 >> 16;
				@Pc(141) int local141 = local131 >> 8 & 0xFF;
				@Pc(145) int local145 = local131 & 0xFF;
				@Pc(153) Class112 local153 = Static230.aClass112Array2[local121] = new Class112();
				local153.anInt2708 = -1;
				local153.aBoolean216 = false;
				local153.anInt2705 = 0;
				local153.anInt2707 = local145 + (local141 << 14) + (local135 << 28);
				Static97.anIntArray78[Static272.anInt4302++] = local121;
				Static251.aByteArray43[local121] = 0;
			}
		}
		arg0.method3348();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBIIII)V")
	public static void method3953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static63.method971(Static74.anInt1413, arg4, Static149.anInt7384);
		@Pc(17) int local17 = Static63.method971(Static74.anInt1413, arg2, Static149.anInt7384);
		@Pc(23) int local23 = Static63.method971(Static271.anInt4271, arg0, Static13.anInt263);
		@Pc(37) int local37 = Static63.method971(Static271.anInt4271, arg1, Static13.anInt263);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static298.method3891(local37, local23, Static106.anIntArrayArray46[local39], arg3);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I")
	public static int method3954(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(35) int local35 = (local19 * arg0 >> 12) + 40960;
		return local35 * local13 >> 12;
	}
}
