import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!go", name = "i", descriptor = "Lclient!sh;")
	public static final Class313 aClass313_2 = new Class313(2);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIII)V")
	public static void method3915(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg3;
		@Pc(17) int local17 = -arg3;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static317.method5515(Static38.anInt823, arg3 + arg0, Static161.anInt7734);
		@Pc(36) int local36 = Static317.method5515(Static38.anInt823, arg0 - arg3, Static161.anInt7734);
		Static280.method5108(local27, Static208.anIntArrayArray20[arg2], local36, arg1);
		while (local14 > local7) {
			local19 += 2;
			local17 += local19;
			@Pc(68) int local68;
			@Pc(72) int local72;
			@Pc(94) int local94;
			@Pc(103) int local103;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local68 = arg2 - local14;
				local72 = local14 + arg2;
				if (Static380.anInt7421 <= local72 && local68 <= Static237.anInt5159) {
					local94 = Static317.method5515(Static38.anInt823, local7 + arg0, Static161.anInt7734);
					local103 = Static317.method5515(Static38.anInt823, arg0 - local7, Static161.anInt7734);
					if (local72 <= Static237.anInt5159) {
						Static280.method5108(local94, Static208.anIntArrayArray20[local72], local103, arg1);
					}
					if (local68 >= Static380.anInt7421) {
						Static280.method5108(local94, Static208.anIntArrayArray20[local68], local103, arg1);
					}
				}
			}
			local7++;
			local68 = arg2 - local7;
			local72 = arg2 + local7;
			if (local72 >= Static380.anInt7421 && Static237.anInt5159 >= local68) {
				local94 = Static317.method5515(Static38.anInt823, arg0 + local14, Static161.anInt7734);
				local103 = Static317.method5515(Static38.anInt823, arg0 - local14, Static161.anInt7734);
				if (Static237.anInt5159 >= local72) {
					Static280.method5108(local94, Static208.anIntArrayArray20[local72], local103, arg1);
				}
				if (Static380.anInt7421 <= local68) {
					Static280.method5108(local94, Static208.anIntArrayArray20[local68], local103, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
	public static void method3916() {
		while (true) {
			if (Static627.aClass2_Sub11_Sub2_6.method8405(Static541.anInt9723) >= 15) {
				@Pc(16) int local16 = Static627.aClass2_Sub11_Sub2_6.method8400(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					@Pc(30) Class2_Sub33 local30 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local16);
					@Pc(36) Class3_Sub1_Sub3_Sub3_Sub1 local36;
					if (local30 == null) {
						local36 = new Class3_Sub1_Sub3_Sub3_Sub1();
						local36.anInt6083 = local16;
						local30 = new Class2_Sub33(local36);
						Static600.aClass99_79.method3059((long) local16, local30);
						local23 = true;
						Static62.aClass2_Sub33Array1[Static474.anInt8881++] = local30;
					}
					local36 = local30.aClass3_Sub1_Sub3_Sub3_Sub1_2;
					Static301.anIntArray367[Static398.anInt7589++] = local16;
					local36.anInt6095 = Static431.anInt8060;
					if (local36.aClass27_1 != null && local36.aClass27_1.method726()) {
						Static189.method9237(local36);
					}
					@Pc(90) int local90 = Static627.aClass2_Sub11_Sub2_6.method8400(2);
					@Pc(95) int local95 = Static627.aClass2_Sub11_Sub2_6.method8400(1);
					@Pc(100) int local100 = Static627.aClass2_Sub11_Sub2_6.method8400(5);
					if (local100 > 15) {
						local100 -= 32;
					}
					@Pc(111) int local111 = Static627.aClass2_Sub11_Sub2_6.method8400(5);
					if (local111 > 15) {
						local111 -= 32;
					}
					@Pc(128) int local128 = Static627.aClass2_Sub11_Sub2_6.method8400(3) + 4 << 11 & 0x3D01;
					@Pc(133) int local133 = Static627.aClass2_Sub11_Sub2_6.method8400(1);
					if (local133 == 1) {
						Static18.anIntArray18[Static33.anInt5425++] = local16;
					}
					local36.method3406(Static462.aClass355_2.method8744(Static627.aClass2_Sub11_Sub2_6.method8400(14)));
					local36.method5212(local36.aClass27_1.anInt666);
					local36.anInt6097 = local36.aClass27_1.anInt627 << 3;
					if (local23) {
						local36.method5213(local128, true);
					}
					local36.method3402(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray357[0] + local100, local95 == 1, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anIntArray358[0] + local111, local36.method5214(), local90);
					if (local36.aClass27_1.method726()) {
						Static5.method117(local36, local36.aByte132, local36.anIntArray357[0], local36.anIntArray358[0], null, null, 0);
					}
					continue;
				}
			}
			Static627.aClass2_Sub11_Sub2_6.method8402();
			return;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILjava/lang/String;IIII)V")
	public static void method3917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class3_Sub5 local7 = new Class3_Sub5();
		local7.anInt6201 = arg1;
		local7.anInt6200 = arg6;
		local7.anInt6204 = arg5;
		local7.anInt6203 = arg0 + Static407.anInt7704;
		local7.aString66 = arg3;
		local7.anInt6198 = arg2;
		local7.anInt6202 = arg4;
		Static513.aClass325_8.method8013(local7);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(III)I")
	public static int method3918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(12) int local12 = 255 - local7;
		@Pc(30) int local30 = ((arg1 & 0xFF00) * local7 & 0xFF0000 | (arg1 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		return local30 + (((arg0 & 0xFF00) * local12 & 0xFF0000 | (arg0 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method3919(@OriginalArg(0) Class20 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static487.aBoolean676) {
			local7 = Static465.method7210();
			local9 = Static207.method4090();
		}
		arg0.KA(local7, local9, Static81.anInt2497 + local7, local9 + 350);
		arg0.aa(local7, local9, Static81.anInt2497, 350, Static50.anInt1859 << 24 | 0x332277, 1);
		Static113.method2842(local7, Static81.anInt2497 + local7, local9, local9 + 350);
		@Pc(58) int local58 = 350 / Static29.anInt624;
		@Pc(68) int local68;
		if (Static410.anInt7746 > 0) {
			local68 = 342 - Static29.anInt624;
			@Pc(79) int local79 = local58 * local68 / (local58 + Static410.anInt7746 - 1);
			@Pc(81) int local81 = 4;
			if (Static410.anInt7746 > 1) {
				local81 = (Static410.anInt7746 - Static602.anInt10571 - 1) * (local68 - local79) / (Static410.anInt7746 - 1) + 4;
			}
			arg0.aa(Static81.anInt2497 + local7 - 16, local9 + local81, 12, local79, Static50.anInt1859 << 24 | 0x332277, 2);
			for (@Pc(121) int local121 = Static602.anInt10571; local58 + Static602.anInt10571 > local121 && local121 < Static410.anInt7746; local121++) {
				@Pc(130) String[] local130 = Static62.method1946('\b', Static19.aStringArray1[local121]);
				@Pc(139) int local139 = (Static81.anInt2497 - 16 - 8) / local130.length;
				for (@Pc(141) int local141 = 0; local141 < local130.length; local141++) {
					@Pc(149) int local149 = local139 * local141 + 8;
					arg0.KA(local7 + local149, local9, local139 + local7 + local149 - 8, local9 + 350);
					Static300.aClass68_4.method8107(Static548.method8180(local130[local141]), -1, local9 + 350 - (local121 - Static602.anInt10571) * Static29.anInt624 - Static283.anInt5969 - Static58.aClass239_18.anInt7564 - 2, local7 + local149, -16777216);
				}
			}
		}
		Static529.aClass68_10.method8100("Build: 634", local9 + 350 - 20, -1, Static81.anInt2497 + local7 + -25, -16777216);
		arg0.KA(local7, local9, local7 + Static81.anInt2497, local9 - -350);
		arg0.method7252(Static81.anInt2497, local9 + 350 - Static283.anInt5969, -1, local7);
		Static571.aClass68_12.method8107("--> " + Static548.method8180(Static152.aString36), -1, local9 + 350 - Static161.aClass239_14.anInt7564 - 1, local7 + 10, -16777216);
		if (!Static437.aBoolean575) {
			return;
		}
		local68 = -1;
		if (Static407.anInt7704 % 30 > 15) {
			local68 = 16777215;
		}
		arg0.method7263(local7 + Static161.aClass239_14.method6482("--> " + Static548.method8180(Static152.aString36).substring(0, Static511.anInt9363)) + 10, local68, 12, local9 + 350 - Static161.aClass239_14.anInt7564 - 11);
	}
}
