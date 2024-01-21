import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!dj", name = "lb", descriptor = "I")
	public static int anInt927 = 0;

	@OriginalMember(owner = "client!dj", name = "nb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_302 = Static161.method2452(")1j");

	@OriginalMember(owner = "client!dj", name = "Eb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_306 = Static161.method2452("Started 3d library");

	@OriginalMember(owner = "client!dj", name = "tb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_303 = aClass20_306;

	@OriginalMember(owner = "client!dj", name = "yb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_304 = Static161.method2452("(U");

	@OriginalMember(owner = "client!dj", name = "Ab", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_305 = Static161.method2452("null");

	@OriginalMember(owner = "client!dj", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray89 = new int[25];

	@OriginalMember(owner = "client!dj", name = "Ib", descriptor = "Lclient!dc;")
	public static Class20 aClass20_307 = null;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
	public static void method762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static203.anInt3983++;
		Static139.method2159(true);
		Static197.method2917(true);
		Static139.method2159(false);
		Static197.method2917(false);
		Static121.method1912();
		Static100.method1692();
		@Pc(29) int local29;
		@Pc(35) int local35;
		if (!Static26.aBoolean182) {
			local29 = Static214.anInt4154;
			local35 = Static72.anInt1568 + Static6.anInt153 & 0x7FF;
			if (local29 < Static49.anInt1070 / 256) {
				local29 = Static49.anInt1070 / 256;
			}
			if (Static205.aBooleanArray48[4] && Static153.anIntArray340[4] + 128 > local29) {
				local29 = Static153.anIntArray340[4] + 128;
			}
			Static113.method1823(Static2.anInt22, local29, Static128.method1999(Static111.anInt2327, Static210.aClass1_Sub2_Sub2_2.anInt2241, Static210.aClass1_Sub2_Sub2_2.anInt2234) - 50, local35, local29 * 3 + 600, Static139.anInt2898, arg2);
		}
		if (Static26.aBoolean182) {
			local29 = Static14.method255();
		} else {
			local29 = Static84.method1442();
		}
		local35 = Static4.anInt109;
		@Pc(96) int local96 = Static146.anInt3026;
		@Pc(98) int local98 = Static104.anInt2182;
		@Pc(100) int local100 = Static23.anInt398;
		@Pc(102) int local102 = Static80.anInt1806;
		@Pc(145) int local145;
		for (@Pc(104) int local104 = 0; local104 < 5; local104++) {
			if (Static205.aBooleanArray48[local104]) {
				local145 = (int) ((double) (Static151.anIntArray333[local104] * 2 + 1) * Math.random() - (double) Static151.anIntArray333[local104] + Math.sin((double) Static70.anIntArray140[local104] * ((double) Static150.anIntArray330[local104] / 100.0D)) * (double) Static153.anIntArray340[local104]);
				if (local104 == 2) {
					Static104.anInt2182 += local145;
				}
				if (local104 == 3) {
					Static23.anInt398 = local145 + Static23.anInt398 & 0x7FF;
				}
				if (local104 == 0) {
					Static4.anInt109 += local145;
				}
				if (local104 == 4) {
					Static80.anInt1806 += local145;
					if (Static80.anInt1806 < 128) {
						Static80.anInt1806 = 128;
					}
					if (Static80.anInt1806 > 383) {
						Static80.anInt1806 = 383;
					}
				}
				if (local104 == 1) {
					Static146.anInt3026 += local145;
				}
			}
		}
		Static42.method812(arg1, arg3, arg1 + arg0, arg3 - -arg2);
		Static149.method2267();
		@Pc(213) int local213 = Static207.anInt4069;
		local145 = Static70.anInt1549;
		if (arg1 <= local145 && local145 < arg1 + arg0 && local213 >= arg3 && local213 < arg2 + arg3) {
			@Pc(248) int local248 = Static92.anInt1966;
			Static134.anInt2785 = 0;
			Static194.aBoolean173 = true;
			@Pc(254) int local254 = Static38.anInt828;
			@Pc(256) int local256 = Static200.anInt3942;
			Static31.anInt670 = (Static207.anInt4069 - arg3) * (local254 - local256) / arg2 + local256;
			@Pc(273) int local273 = Static46.anInt1033;
			Static93.anInt3215 = (local273 - local248) * (Static70.anInt1549 - arg1) / arg0 + local248;
		} else {
			Static194.aBoolean173 = false;
			Static134.anInt2785 = 0;
		}
		Static95.method1546();
		Static42.method824(arg1, arg3, arg0, arg2, 0);
		Static86.method1465(Static4.anInt109, Static146.anInt3026, Static104.anInt2182, Static80.anInt1806, Static23.anInt398, local29, null, null, null, null, null, null);
		Static95.method1546();
		Static202.method3006();
		Static209.method3114(arg2, arg3, arg1, arg0);
		Static53.method915(arg3, arg1, arg0, arg2);
		((Class89) Static149.anInterface1_10).method2494(Static176.anInt3529);
		Static10.method211(arg0, arg3, arg2, arg1);
		Static4.anInt109 = local35;
		Static80.anInt1806 = local102;
		Static23.anInt398 = local100;
		Static146.anInt3026 = local96;
		Static104.anInt2182 = local98;
		if (Static171.aBoolean154 && Static192.method2855() == 0) {
			Static171.aBoolean154 = false;
		}
		if (Static171.aBoolean154) {
			Static42.method824(arg1, arg3, arg0, arg2, 0);
			Static167.method2533(Static119.aClass20_924, false);
		}
		if (!Static171.aBoolean154 && !Static104.aBoolean95 && local145 >= arg1 && local145 < arg1 + arg0 && local213 >= arg3 && local213 < arg3 + arg2) {
			Static6.method152(arg3, arg2, local145, arg1, arg0, local213);
		}
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)Z")
	public static boolean method766() {
		@Pc(5) Class37 local5 = Static82.aClass37_1;
		synchronized (Static82.aClass37_1) {
			if (Static208.anInt4081 == Static38.anInt823) {
				return false;
			} else {
				Static173.anInt3466 = Static77.anIntArray352[Static208.anInt4081];
				Static104.anInt2178 = Static15.anIntArray21[Static208.anInt4081];
				Static208.anInt4081 = Static208.anInt4081 + 1 & 0x7F;
				return true;
			}
		}
	}
}
