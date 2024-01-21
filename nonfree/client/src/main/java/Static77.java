import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!jc", name = "hb", descriptor = "Lclient!ud;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!jc", name = "kb", descriptor = "Lclient!ga;")
	public static Class30 aClass30_31;

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
	public static int anInt2101 = -1;

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_770 = Static169.method2903("Welcome to RuneScape");

	@OriginalMember(owner = "client!jc", name = "eb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_771 = aClass23_770;

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!jc", name = "ib", descriptor = "Lclient!ed;")
	public static Class23 aClass23_772 = null;

	@OriginalMember(owner = "client!jc", name = "nb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_773 = Static169.method2903("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILjava/awt/Component;Lclient!rf;I)Lclient!hh;")
	public static Class40 method1390(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class74 arg2, @OriginalArg(4) int arg3) {
		if (Static35.anInt974 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class40 local33 = (Class40) Class.forName("Class40_Sub1").getDeclaredConstructor().newInstance();
			local33.anInt3671 = arg3;
			local33.anIntArray483 = new int[(Static80.aBoolean110 ? 2 : 1) * 256];
			local33.method2519(arg1);
			local33.anInt3666 = (arg3 & 0xFFFFFC00) + 1024;
			if (local33.anInt3666 > 16384) {
				local33.anInt3666 = 16384;
			}
			local33.method2524(local33.anInt3666);
			if (Static24.anInt726 > 0 && Static115.aClass48_1 == null) {
				Static115.aClass48_1 = new Class48();
				Static115.aClass48_1.aClass74_4 = arg2;
				arg2.method2484(Static115.aClass48_1, Static24.anInt726);
			}
			if (Static115.aClass48_1 != null) {
				if (Static115.aClass48_1.aClass40Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static115.aClass48_1.aClass40Array1[arg0] = local33;
			}
			return local33;
		} catch (@Pc(103) Throwable local103) {
			try {
				@Pc(109) Class40_Sub2 local109 = new Class40_Sub2(arg2, arg0);
				local109.anIntArray483 = new int[(Static80.aBoolean110 ? 2 : 1) * 256];
				local109.anInt3671 = arg3;
				local109.method2519(arg1);
				local109.anInt3666 = 16384;
				local109.method2524(local109.anInt3666);
				if (Static24.anInt726 > 0 && Static115.aClass48_1 == null) {
					Static115.aClass48_1 = new Class48();
					Static115.aClass48_1.aClass74_4 = arg2;
					arg2.method2484(Static115.aClass48_1, Static24.anInt726);
				}
				if (Static115.aClass48_1 != null) {
					if (Static115.aClass48_1.aClass40Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static115.aClass48_1.aClass40Array1[arg0] = local109;
				}
				return local109;
			} catch (@Pc(176) Throwable local176) {
				return new Class40();
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!vc;I)V")
	public static void method1391(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static5.aBoolean218) {
			Static166.method2876(arg0);
			return;
		}
		if (Static163.anInt4012 == 1 && Static38.anInt1049 >= 715 && Static165.anInt4054 >= 453) {
			Static142.aBoolean183 = !Static142.aBoolean183;
			if (Static142.aBoolean183) {
				Static30.method1958();
			} else {
				Static44.method741(Static156.aClass23_1466, Static61.aClass23_605, Static167.aClass30_Sub1_18);
			}
		}
		if (Static156.anInt3821 == 5) {
			return;
		}
		Static182.anInt4381++;
		if (Static156.anInt3821 != 10) {
			return;
		}
		if (Static95.anInt2462 != 2 && Static37.anInt994 == 0) {
			if (Static163.anInt4012 == 1 && Static38.anInt1049 >= 5 && Static38.anInt1049 <= 105 && Static165.anInt4054 >= 463 && Static165.anInt4054 <= 498) {
				Static106.method1843();
				return;
			}
			if (aClass82_1 != null) {
				Static106.method1843();
			}
		}
		@Pc(120) int local120 = Static163.anInt4012;
		@Pc(122) int local122 = Static165.anInt4054;
		@Pc(124) int local124 = Static38.anInt1049;
		if (Static177.anInt4203 == 0) {
			@Pc(517) boolean local517 = false;
			if (local120 == 1 && local124 >= 227 && local124 <= 377 && local122 >= 271 && local122 <= 311) {
				Static109.anInt2819 = 0;
				Static177.anInt4203 = 3;
			}
			if (Static73.anInt2024 != 0) {
				while (Static59.method1105()) {
					if (Static102.anInt2582 == 84) {
						local517 = true;
						break;
					}
				}
			}
			if (local517 || local120 == 1 && local124 >= 387 && local124 <= 537 && local122 >= 271 && local122 <= 311) {
				Static61.aClass23_604 = Static33.aClass23_368;
				Static61.aClass23_602 = Static33.aClass23_337;
				Static61.aClass23_610 = Static126.aClass23_1233;
				Static109.anInt2819 = 0;
				Static177.anInt4203 = 2;
			}
		} else if (Static177.anInt4203 == 2) {
			@Pc(168) short local168 = 231;
			@Pc(169) int local169 = local168 + 30;
			if (local120 == 1 && local122 >= 246 && local122 < 261) {
				Static109.anInt2819 = 0;
			}
			local169 += 15;
			if (local120 == 1 && local122 >= 261 && local122 < 276) {
				Static109.anInt2819 = 1;
			}
			local169 += 15;
			if (local120 == 1 && local124 >= 227 && local124 <= 377 && local122 >= 301 && local122 <= 341) {
				Static61.aClass23_612 = Static61.aClass23_612.method630().method667();
				if (Static61.aClass23_612.method642() == 0) {
					Static76.method1369(Static33.aClass23_359, Static33.aClass23_342, Static74.aClass23_734);
				} else if (Static61.aClass23_608.method642() == 0) {
					Static76.method1369(Static33.aClass23_358, Static33.aClass23_340, Static105.aClass23_1040);
				} else {
					Static76.method1369(Static33.aClass23_353, Static33.aClass23_364, Static7.aClass23_114);
					Static32.method567(20);
				}
			} else {
				if (local120 == 1 && local124 >= 387 && local124 <= 537 && local122 >= 301 && local122 <= 341) {
					Static61.aClass23_612 = Static61.aClass23_605;
					Static177.anInt4203 = 0;
					Static61.aClass23_608 = Static61.aClass23_605;
				}
				while (true) {
					@Pc(341) boolean local341;
					label204: do {
						while (Static59.method1105()) {
							local341 = false;
							for (@Pc(343) int local343 = 0; Static40.aClass23_410.method642() > local343; local343++) {
								if (Static105.anInt2704 == Static40.aClass23_410.method650(local343)) {
									local341 = true;
									break;
								}
							}
							if (Static109.anInt2819 != 0) {
								continue label204;
							}
							if (Static102.anInt2582 == 85 && Static61.aClass23_612.method642() > 0) {
								Static61.aClass23_612 = Static61.aClass23_612.method635(0, Static61.aClass23_612.method642() - 1);
							}
							if (Static102.anInt2582 == 84 || Static102.anInt2582 == 80) {
								Static109.anInt2819 = 1;
							}
							if (local341 && Static61.aClass23_612.method642() < 12) {
								Static61.aClass23_612 = Static61.aClass23_612.method666(Static105.anInt2704);
							}
						}
						return;
					} while (Static109.anInt2819 != 1);
					if (Static102.anInt2582 == 85 && Static61.aClass23_608.method642() > 0) {
						Static61.aClass23_608 = Static61.aClass23_608.method635(0, Static61.aClass23_608.method642() - 1);
					}
					if (Static102.anInt2582 == 84 || Static102.anInt2582 == 80) {
						Static109.anInt2819 = 0;
					}
					if (Static73.anInt2024 != 0 && Static102.anInt2582 == 84) {
						Static61.aClass23_612 = Static61.aClass23_612.method630().method667();
						if (Static61.aClass23_612.method642() == 0) {
							Static76.method1369(Static33.aClass23_359, Static33.aClass23_342, Static74.aClass23_734);
							return;
						}
						if (Static61.aClass23_608.method642() == 0) {
							Static76.method1369(Static33.aClass23_358, Static33.aClass23_340, Static105.aClass23_1040);
							return;
						}
						Static76.method1369(Static33.aClass23_353, Static33.aClass23_364, Static7.aClass23_114);
						Static32.method567(20);
						return;
					}
					if (local341 && Static61.aClass23_608.method642() < 20) {
						Static61.aClass23_608 = Static61.aClass23_608.method666(Static105.anInt2704);
					}
				}
			}
		} else if (Static177.anInt4203 == 3 && local120 == 1 && local124 >= 307 && local124 <= 457 && local122 >= 301 && local122 <= 341) {
			Static177.anInt4203 = 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	public static void method1392() {
		aClass23_771 = null;
		aClass82_1 = null;
		aClass23_773 = null;
		aClass30_31 = null;
		aClass23_772 = null;
		aClass23_770 = null;
	}
}
