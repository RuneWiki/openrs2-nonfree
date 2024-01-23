import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public static int anInt926;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!nb;")
	public static Class15 aClass15_8;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!i;")
	private static Class41 aClass41_259 = Static184.method2923("Please enter your password)3");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!i;")
	public static Class41 aClass41_257 = aClass41_259;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!i;")
	private static Class41 aClass41_261 = Static184.method2923("flash1:");

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!i;")
	public static Class41 aClass41_258 = aClass41_261;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!i;")
	public static Class41 aClass41_260 = Static184.method2923(":clanreq:");

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_262 = aClass41_261;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIBI)V")
	public static void method682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static186.anInt4273++;
		Static147.method2312(true);
		Static134.method2155(true);
		Static147.method2312(false);
		Static134.method2155(false);
		Static36.method695();
		Static175.method2832();
		@Pc(29) int local29;
		@Pc(35) int local35;
		if (!Static160.aBoolean233) {
			local29 = Static57.anInt1618;
			local35 = Static183.anInt1324 + Static85.anInt2165 & 0x7FF;
			if (Static63.anInt1695 / 256 > local29) {
				local29 = Static63.anInt1695 / 256;
			}
			if (Static207.aBooleanArray24[4] && Static59.anIntArray160[4] + 128 > local29) {
				local29 = Static59.anIntArray160[4] + 128;
			}
			Static43.method901(anInt926, Static212.method3261(Static213.aClass12_Sub3_Sub1_1.anInt3961, Static213.aClass12_Sub3_Sub1_1.anInt3949, Static134.anInt3147) - 50, local35, local29, local29 * 3 + 600, arg2, Static207.anInt4612);
		}
		if (Static160.aBoolean233) {
			local29 = Static137.method2191();
		} else {
			local29 = Static116.method1959();
		}
		@Pc(94) int local94 = Static94.anInt2320;
		@Pc(101) int local101 = Static183.anInt1325;
		local35 = Static69.anInt1817;
		@Pc(105) int local105 = Static163.anInt3822;
		@Pc(107) int local107 = Static152.anInt3512;
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (Static207.aBooleanArray24[local109]) {
				@Pc(150) int local150 = (int) (Math.random() * (double) (Static177.anIntArray430[local109] * 2 + 1) - (double) Static177.anIntArray430[local109] + Math.sin((double) Static168.anIntArray408[local109] * ((double) Static171.anIntArray420[local109] / 100.0D)) * (double) Static59.anIntArray160[local109]);
				if (local109 == 3) {
					Static152.anInt3512 = Static152.anInt3512 + local150 & 0x7FF;
				}
				if (local109 == 4) {
					Static183.anInt1325 += local150;
					if (Static183.anInt1325 < 128) {
						Static183.anInt1325 = 128;
					}
					if (Static183.anInt1325 > 383) {
						Static183.anInt1325 = 383;
					}
				}
				if (local109 == 2) {
					Static163.anInt3822 += local150;
				}
				if (local109 == 1) {
					Static94.anInt2320 += local150;
				}
				if (local109 == 0) {
					Static69.anInt1817 += local150;
				}
			}
		}
		Static64.method1166(arg1, arg3, arg0 + arg1, arg2 + arg3);
		Static155.method2532();
		@Pc(223) int local223 = Static26.anInt663;
		@Pc(225) int local225 = Static212.anInt4711;
		if (local223 >= arg1 && arg1 + arg0 > local223 && arg3 <= local225 && local225 < arg3 + arg2) {
			Static48.aBoolean71 = true;
			Static146.anInt3314 = 0;
			@Pc(266) int local266 = Static132.anInt3021;
			@Pc(268) int local268 = Static136.anInt3159;
			@Pc(270) int local270 = Static53.anInt1533;
			Static126.anInt2959 = local266 + (local268 - local266) * (Static26.anInt663 - arg1) / arg0;
			@Pc(286) int local286 = Static192.anInt4375;
			Static163.anInt3819 = (Static212.anInt4711 - arg3) * (local286 - local270) / arg2 + local270;
		} else {
			Static48.aBoolean71 = false;
			Static146.anInt3314 = 0;
		}
		Static194.method3305();
		Static64.method1164(arg1, arg3, arg0, arg2, 0);
		Static99.method1709(Static69.anInt1817, Static94.anInt2320, Static163.anInt3822, Static183.anInt1325, Static152.anInt3512, local29, null, null, null, null, null, null, Static213.aClass12_Sub3_Sub1_1.anInt3961 >> 7, Static213.aClass12_Sub3_Sub1_1.anInt3949 >> 7);
		Static194.method3305();
		Static96.method1674();
		Static48.method963(arg1, arg3, arg2, arg0);
		Static133.method2115(arg1, arg3, arg2, arg0);
		((Class36) Static155.anInterface1_1).method1142(Static16.anInt432);
		Static10.method278(arg1, arg2, arg3, arg0);
		Static152.anInt3512 = local107;
		Static183.anInt1325 = local101;
		Static69.anInt1817 = local35;
		Static94.anInt2320 = local94;
		Static163.anInt3822 = local105;
		if (Static139.aBoolean184 && Static143.method2233() == 0) {
			Static139.aBoolean184 = false;
		}
		if (Static139.aBoolean184) {
			Static64.method1164(arg1, arg3, arg0, arg2, 0);
			Static31.method606(Static215.aClass41_1270, false);
		}
		if (!Static139.aBoolean184 && !Static94.aBoolean123 && arg1 <= local223 && local223 < arg0 + arg1 && arg3 <= local225 && local225 < arg2 + arg3) {
			Static180.method2873(local225, arg1, arg2, arg0, arg3, local223);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!nb;BI)Lclient!pf;")
	public static Class2_Sub2_Sub16_Sub1 method684(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1) {
		return Static188.method2999(arg1, arg0) ? Static210.method3248() : null;
	}
}
