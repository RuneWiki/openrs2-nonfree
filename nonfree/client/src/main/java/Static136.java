import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!j", name = "p", descriptor = "I")
	public static int anInt3094 = 0;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString105 = "Loading world list data";

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZIIILclient!vm;)V")
	public static void method2720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class92 arg4) {
		arg4.method4459(arg0, arg2, arg0 + arg3, arg2 + arg1);
		arg4.method4502(arg2, arg3, arg0, arg1, -16777216);
		if (Static38.anInt833 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static42.anInt2439 / (float) Static42.anInt2443;
		@Pc(37) int local37 = arg3;
		@Pc(39) int local39 = arg1;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg3 * local35);
		} else {
			local37 = (int) ((float) arg1 / local35);
		}
		@Pc(65) int local65 = arg2 + (arg1 - local39) / 2;
		@Pc(74) int local74 = arg0 + (arg3 - local37) / 2;
		if (Static314.aClass60_12 == null || Static314.aClass60_12.method5679() != arg3 || arg1 != Static314.aClass60_12.method5687()) {
			Static42.method2045(Static42.anInt2446, Static42.anInt2439 + Static42.anInt2441, Static42.anInt2446 + Static42.anInt2443, Static42.anInt2441, local74, local65, local74 + local37, local39 + local65);
			Static42.method2060(arg4);
			Static314.aClass60_12 = arg4.method4438(local74, local65, local37, local39, false);
		}
		Static314.aClass60_12.method5675(local74, local65);
		@Pc(129) int local129 = Static310.anInt6221 * local37 / Static42.anInt2443;
		@Pc(135) int local135 = local39 * Static266.anInt5447 / Static42.anInt2439;
		@Pc(143) int local143 = local37 * Static307.anInt3768 / Static42.anInt2443 + local74;
		@Pc(156) int local156 = local39 + local65 - local135 - local39 * Static328.anInt6445 / Static42.anInt2439;
		@Pc(158) int local158 = -1996554240;
		if (Static269.anInt5508 == 1) {
			local158 = -1996488705;
		}
		arg4.method4436(local143, local156, local129, local135, local158, 1);
		arg4.method4495(local143, local156, local129, local135, local158, 0);
		if (Static153.anInt3426 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static290.anInt5894 > 50) {
			local193 = 500 - Static290.anInt5894 * 5;
		} else {
			local193 = Static290.anInt5894 * 5;
		}
		for (@Pc(204) Class4_Sub20 local204 = (Class4_Sub20) Static42.aClass130_46.method3499(); local204 != null; local204 = (Class4_Sub20) Static42.aClass130_46.method3512()) {
			@Pc(211) Class139 local211 = Static20.method377(local204.anInt3082);
			if (Static248.method4313(local211)) {
				@Pc(228) int local228;
				@Pc(240) int local240;
				if (Static213.anInt4432 == local204.anInt3082) {
					local228 = local74 + local37 * local204.anInt3085 / Static42.anInt2443;
					local240 = (Static42.anInt2439 - local204.anInt3079) * local39 / Static42.anInt2439 + local65;
					arg4.method4502(local240 - 2, 4, local228 - 2, 4, local193 << 24 | 0xFFFF00);
				} else if (Static214.anInt4451 != -1 && Static214.anInt4451 == local211.anInt4370) {
					local228 = local204.anInt3085 * local37 / Static42.anInt2443 + local74;
					local240 = local65 + (Static42.anInt2439 - local204.anInt3079) * local39 / Static42.anInt2439;
					arg4.method4502(local240 - 2, 4, local228 - 2, 4, local193 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
	public static void method2721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(17) int local17 = -arg3;
		@Pc(19) int local19 = -1;
		Static182.method3394(arg0 - arg3, Static30.anIntArrayArray10[arg2], arg1, arg0 + arg3);
		while (local7 < local9) {
			local19 += 2;
			local17 += local19;
			local7++;
			if (local17 >= 0) {
				local9--;
				local17 -= local9 << 1;
				@Pc(56) int[] local56 = Static30.anIntArrayArray10[arg2 + local9];
				@Pc(63) int[] local63 = Static30.anIntArrayArray10[arg2 - local9];
				@Pc(67) int local67 = arg0 + local7;
				@Pc(72) int local72 = arg0 - local7;
				Static182.method3394(local72, local56, arg1, local67);
				Static182.method3394(local72, local63, arg1, local67);
			}
			@Pc(89) int local89 = arg0 + local9;
			@Pc(94) int local94 = arg0 - local9;
			@Pc(101) int[] local101 = Static30.anIntArrayArray10[arg2 + local7];
			@Pc(107) int[] local107 = Static30.anIntArrayArray10[arg2 - local7];
			Static182.method3394(local94, local101, arg1, local89);
			Static182.method3394(local94, local107, arg1, local89);
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
	public static void method2722() {
		if (Static131.aClass171_3 != null) {
			Static131.aClass171_3.method4637();
			Static131.aClass171_3 = null;
		}
		Static207.method3647();
		Static285.method4876();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static345.aClass174Array1[local17].method4654();
		}
		Static169.method3178(false);
		System.gc();
		Static21.method390();
		Static100.anInt2272 = -1;
		Static174.aBoolean320 = false;
		Static81.method1446(true);
		Static83.aBoolean137 = false;
		Static182.anInt4006 = 0;
		Static81.anInt1732 = 0;
		Static252.anInt5225 = 0;
		Static10.anInt231 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static190.aClass121Array1.length; local56++) {
			Static190.aClass121Array1[local56] = null;
		}
		Static282.anInt5712 = 0;
		Static156.anInt3506 = 0;
		for (@Pc(73) int local73 = 0; local73 < 2048; local73++) {
			Static253.aClass2_Sub2_Sub1_Sub1Array1[local73] = null;
			Static349.aClass4_Sub7Array1[local73] = null;
		}
		for (@Pc(89) int local89 = 0; local89 < 32768; local89++) {
			Static101.aClass2_Sub2_Sub1_Sub2Array6[local89] = null;
		}
		Static178.aClass198_35.method5260();
		Static354.method4058();
		Static191.anInt4118 = 0;
		Static35.method658();
		Static155.method2995();
		Static285.method4893();
		Static156.method3020(true);
		try {
			Static369.method5674(Static212.aClass120_3.anApplet1, "loggedout");
		} catch (@Pc(129) Throwable local129) {
		}
	}
}
