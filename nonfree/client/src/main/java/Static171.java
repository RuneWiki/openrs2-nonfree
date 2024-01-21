import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	public static int anInt4101;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
	public static int anInt4104;

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
	public static int anInt4109;

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1439 = Static170.method3101("Loading )2 please wait)3");

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1433 = aClass28_1439;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
	public static int[] anIntArray684 = new int[2048];

	@OriginalMember(owner = "client!vg", name = "q", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1437 = Static170.method3101("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1434 = aClass28_1437;

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1440 = Static170.method3101("Choose Option");

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1435 = aClass28_1440;

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1441 = Static170.method3101("Walk here");

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1436 = aClass28_1441;

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1438 = Static170.method3101("Versteckt");

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
	public static int anInt4108 = 0;

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "J")
	public static long aLong140 = 0L;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)Z")
	public static boolean method3106(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLclient!eh;)I")
	public static int method3107(@OriginalArg(1) Class28 arg0) {
		if (Static114.anInt2922 == 1) {
			return 7;
		} else if (arg0.method918(Static106.aClass28_887)) {
			return 1;
		} else if (arg0.method918(Static94.aClass28_818)) {
			return 1;
		} else if (arg0.method918(Static101.aClass28_844)) {
			return 2;
		} else if (arg0.method918(Static61.aClass28_555)) {
			return 2;
		} else if (arg0.method918(Static41.aClass28_360)) {
			return 3;
		} else if (arg0.method918(Static163.aClass28_1378)) {
			return 4;
		} else if (arg0.method918(Static73.aClass28_655)) {
			return 4;
		} else if (arg0.method918(Static172.aClass28_1450)) {
			return 5;
		} else if (arg0.method918(Static145.aClass28_1218)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
	public static void method3108() {
		aClass28_1434 = null;
		aClass28_1441 = null;
		aClass28_1433 = null;
		aClass28_1440 = null;
		anIntArray684 = null;
		aClass28_1438 = null;
		aClass28_1437 = null;
		aClass28_1435 = null;
		aClass28_1439 = null;
		aClass28_1436 = null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
	public static void method3109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static147.method1773(arg3, arg0, arg3 + arg1, arg0 + arg2);
		Static13.method509();
		Static44.anInt3939++;
		Static42.method1008(true);
		Static76.method1732(true);
		Static42.method1008(false);
		Static76.method1732(false);
		Static142.method2769();
		Static9.method287();
		@Pc(40) int local40;
		@Pc(46) int local46;
		if (!Static132.aBoolean160) {
			local40 = Static126.anInt3242;
			local46 = Static139.anInt3673 + anInt4108 & 0x7FF;
			if (local40 < Static77.anInt2284 / 256) {
				local40 = Static77.anInt2284 / 256;
			}
			if (Static175.aBooleanArray21[4] && Static64.anIntArray333[4] + 128 > local40) {
				local40 = Static64.anIntArray333[4] + 128;
			}
			Static174.method3158(Static33.method848(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800, anInt4109, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792) - 50, local40, Static81.anInt2373, Static87.anInt2537, local46, local40 * 3 + 600);
		}
		if (Static132.aBoolean160) {
			local40 = Static167.method3091();
		} else {
			local40 = Static41.method928();
		}
		local46 = Static28.anInt900;
		@Pc(107) int local107 = Static163.anInt3970;
		@Pc(109) int local109 = Static169.anInt683;
		@Pc(111) int local111 = Static85.anInt2512;
		@Pc(113) int local113 = Static44.anInt3941;
		@Pc(161) int local161;
		for (@Pc(120) int local120 = 0; local120 < 5; local120++) {
			if (Static175.aBooleanArray21[local120]) {
				local161 = (int) ((double) -Static7.anIntArray84[local120] + (double) (Static7.anIntArray84[local120] * 2 + 1) * Math.random() + Math.sin((double) Static83.anIntArray410[local120] / 100.0D * (double) Static173.anIntArray689[local120]) * (double) Static64.anIntArray333[local120]);
				if (local120 == 2) {
					Static85.anInt2512 += local161;
				}
				if (local120 == 3) {
					Static44.anInt3941 = Static44.anInt3941 + local161 & 0x7FF;
				}
				if (local120 == 1) {
					Static163.anInt3970 += local161;
				}
				if (local120 == 0) {
					Static28.anInt900 += local161;
				}
				if (local120 == 4) {
					Static169.anInt683 += local161;
					if (Static169.anInt683 < 128) {
						Static169.anInt683 = 128;
					}
					if (Static169.anInt683 > 383) {
						Static169.anInt683 = 383;
					}
				}
			}
		}
		local161 = Static73.anInt2181;
		@Pc(224) int local224 = Static35.anInt1049;
		if (arg3 <= local161 && arg3 + arg1 > local161 && arg0 <= local224 && arg0 + arg2 > local224) {
			Static25.aBoolean14 = true;
			Static25.anInt217 = Static35.anInt1049 - arg0;
			Static25.anInt218 = 0;
			Static25.anInt214 = Static73.anInt2181 - arg3;
		} else {
			Static25.aBoolean14 = false;
			Static25.anInt218 = 0;
		}
		Static110.method2233();
		Static147.method1775(arg3, arg0, arg1, arg2, 0);
		Static110.method2233();
		Static41.method913(Static28.anInt900, Static163.anInt3970, Static85.anInt2512, Static169.anInt683, Static44.anInt3941, local40);
		Static110.method2233();
		Static106.method2175();
		Static14.method530(arg1, arg0, arg2, arg3);
		Static64.method1562(arg3, arg0);
		((Class44) Static13.anInterface2_1).method1835(Static165.anInt3991);
		Static98.method2677(arg0, arg1, arg3, arg2);
		Static169.anInt683 = local109;
		Static85.anInt2512 = local111;
		Static163.anInt3970 = local107;
		Static28.anInt900 = local46;
		Static44.anInt3941 = local113;
		if (Static157.aBoolean182 && Static113.method2277() == 0) {
			Static157.aBoolean182 = false;
		}
		if (Static157.aBoolean182) {
			Static147.method1775(arg3, arg0, arg1, arg2, 0);
			Static128.method2519(false, aClass28_1433);
		}
		if (!Static157.aBoolean182 && !Static69.aBoolean112 && arg3 <= local161 && local161 < arg1 + arg3 && local224 >= arg0 && local224 < arg2 + arg0) {
			Static16.method537(local224, local161, arg3, arg0);
		}
	}
}
