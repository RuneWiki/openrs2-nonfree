import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "Z")
	public static boolean aBoolean193 = true;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static void method2297() {
		Static202.method3230();
		Static109.method1798();
		Static18.method419();
		Static124.method2038();
		Static120.method4727();
		Static131.method2254();
		Static184.method2981();
		Static173.method2816();
		Static257.method3962();
		Static293.method4479();
		Static232.method3683();
		Static185.method3008();
		Static261.method3994();
		Static232.method3679();
		Static63.method1119();
		Static208.method3290();
		Static171.method2785();
		Static106.method1763();
		Static238.method3761();
		if (Static159.anInt3534 != 0) {
			for (@Pc(52) int local52 = 0; local52 < Static271.aByteArrayArray17.length; local52++) {
				Static271.aByteArrayArray17[local52] = null;
			}
			Static194.anInt4265 = 0;
		}
		Static94.method1607();
		Static102.method732();
		Static193.method3112();
		Static104.method1733();
		Static138.aClass89_18.method2265();
		if (!Static294.aBoolean367) {
			((Class63_Sub1) Static237.anInterface1_1).method4606();
		}
		Static157.aClass162_6.method4006();
		Static149.aClass168_112.method4052();
		Static31.aClass168_25.method4052();
		Static57.aClass168_212.method4052();
		Static281.aClass168_98.method4052();
		Static124.aClass168_93.method4052();
		Static310.aClass168_209.method4052();
		Static112.aClass168_84.method4052();
		Static277.aClass168_188.method4052();
		Static122.aClass168_91.method4052();
		Static27.aClass168_148.method4052();
		Static208.aClass168_154.method4052();
		Static46.aClass89_7.method2265();
		Static203.aClass89_45.method2265();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIII)V")
	public static void method2299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static294.aBoolean367) {
			Static156.method2546(arg3, arg2, arg3 + arg0, arg1 + arg2);
			Static156.method2537(arg3, arg2, arg0, arg1, 0);
		} else {
			Static231.method3634(arg3, arg2, arg3 + arg0, arg1 + arg2);
			Static231.method3630(arg3, arg2, arg0, arg1, 0);
		}
		if (Static147.anInt3288 < 100) {
			return;
		}
		@Pc(52) float local52 = (float) Static268.anInt2659 / (float) Static268.anInt2657;
		@Pc(54) int local54 = arg1;
		@Pc(56) int local56 = arg0;
		if (local52 < 1.0F) {
			local54 = (int) ((float) arg0 * local52);
		} else {
			local56 = (int) ((float) arg1 / local52);
		}
		@Pc(82) int local82 = arg3 + (arg0 - local56) / 2;
		@Pc(91) int local91 = arg2 + (arg1 - local54) / 2;
		if (Static100.aClass1_Sub3_Sub13_5 == null || Static100.aClass1_Sub3_Sub13_5.anInt5571 != arg0 || arg1 != Static100.aClass1_Sub3_Sub13_5.anInt5573) {
			@Pc(115) Class1_Sub3_Sub13_Sub2 local115 = new Class1_Sub3_Sub13_Sub2(arg0, arg1);
			Static231.method3639(local115.anIntArray504, arg0, arg1);
			if (Static268.aClass1_Sub3_Sub15_2.anInt3977 != -1) {
				Static231.method3630(0, 0, arg0, arg1, Static268.aClass1_Sub3_Sub15_2.anInt3977);
			}
			Static268.method2000(0, 0, Static268.anInt2657, Static268.anInt2659, 0, 0, local56, local54);
			Static268.method2008();
			if (Static294.aBoolean367) {
				Static100.aClass1_Sub3_Sub13_5 = new Class1_Sub3_Sub13_Sub1(local115);
			} else {
				Static100.aClass1_Sub3_Sub13_5 = local115;
			}
			if (Static294.aBoolean367) {
				Static231.anIntArray448 = null;
			} else {
				Static293.aClass3_1.method2413();
			}
		}
		Static100.aClass1_Sub3_Sub13_5.method4210(local82, local91);
		@Pc(174) int local174 = local82 + local56 * Static17.anInt474 / Static268.anInt2657;
		@Pc(183) int local183 = local91 + local54 * Static119.anInt2580 / Static268.anInt2659;
		@Pc(185) int local185 = 16711680;
		@Pc(191) int local191 = Static5.anInt3330 * local56 / Static268.anInt2657;
		if (Static208.anInt4489 == 1) {
			local185 = 16777215;
		}
		@Pc(205) int local205 = local54 * Static155.anInt3473 / Static268.anInt2659;
		if (Static294.aBoolean367) {
			Static156.method2547(local174, local183, local191, local205, local185, 128);
			Static156.method2540(local174, local183, local191, local205, local185);
		} else {
			Static231.method3650(local174, local183, local191, local205, local185, 128);
			Static231.method3626(local174, local183, local191, local205, local185);
		}
		if (Static11.anInt308 <= 0) {
			return;
		}
		@Pc(253) int local253;
		if (Static48.anInt1149 <= 50) {
			local253 = Static48.anInt1149 * 5;
		} else {
			local253 = 500 - Static48.anInt1149 * 5;
		}
		for (@Pc(266) Class1_Sub3_Sub11 local266 = (Class1_Sub3_Sub11) Static268.aClass108_11.method2754(); local266 != null; local266 = (Class1_Sub3_Sub11) Static268.aClass108_11.method2751()) {
			@Pc(273) Class107 local273 = Static173.method2819(local266.anInt3104);
			if (Static302.method4609(local273)) {
				@Pc(304) int local304;
				@Pc(313) int local313;
				if (local266.anInt3104 == Static186.anInt4091) {
					local304 = local56 * local266.anInt3107 / Static268.anInt2657 + local82;
					local313 = local266.anInt3102 * local54 / Static268.anInt2659 + local91;
					if (Static294.aBoolean367) {
						Static156.method2547(local304 - 2, local313 + -2, 4, 4, 16776960, local253);
					} else {
						Static231.method3650(local304 - 2, local313 - 2, 4, 4, 16776960, local253);
					}
				} else if (Static170.anInt3807 != -1 && Static170.anInt3807 == local273.anInt3787) {
					local304 = local82 + local56 * local266.anInt3107 / Static268.anInt2657;
					local313 = local54 * local266.anInt3102 / Static268.anInt2659 + local91;
					if (Static294.aBoolean367) {
						Static156.method2547(local304 - 2, local313 + -2, 4, 4, 16776960, local253);
					} else {
						Static231.method3650(local304 - 2, local313 + -2, 4, 4, 16776960, local253);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public static void method2301() {
		@Pc(16) int[] local16 = new int[Static58.anInt1268];
		@Pc(18) int local18 = 0;
		@Pc(20) int local20;
		for (local20 = 0; local20 < Static58.anInt1268; local20++) {
			@Pc(27) Class57 local27 = Static56.method1050(local20);
			if (local27.anInt1773 >= 0 || local27.anInt1792 >= 0) {
				local16[local18++] = local20;
			}
		}
		Static194.anIntArray369 = new int[local18];
		for (local20 = 0; local20 < local18; local20++) {
			Static194.anIntArray369[local20] = local16[local20];
		}
	}
}
