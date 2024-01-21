import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
	public static int anInt2883;

	@OriginalMember(owner = "client!pa", name = "fb", descriptor = "Lclient!ab;")
	public static Class3 aClass3_25;

	@OriginalMember(owner = "client!pa", name = "jb", descriptor = "Lclient!ab;")
	public static Class3 aClass3_26;

	@OriginalMember(owner = "client!pa", name = "kb", descriptor = "I")
	public static int anInt2893;

	@OriginalMember(owner = "client!pa", name = "X", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!pa", name = "cb", descriptor = "I")
	public static int anInt2888 = 0;

	@OriginalMember(owner = "client!pa", name = "gb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1391 = Static187.method3089("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!pa", name = "hb", descriptor = "I")
	public static int anInt2891 = 0;

	@OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
	public static int anInt2892 = 10;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!gg;)V")
	public static void method2131(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static36.aBoolean65) {
			Static72.method1109(arg0);
			return;
		}
		if (Static196.anInt4284 == 1 && Static57.anInt1370 >= 715 && Static140.anInt2804 >= 453) {
			Static27.aBoolean40 = !Static27.aBoolean40;
			if (Static27.aBoolean40) {
				Static39.method720();
			} else {
				Static99.method3061(255, Static32.anInt770, Static166.aClass3_Sub1_23);
			}
		}
		if (Static31.anInt748 == 5) {
			return;
		}
		Static44.anInt2856++;
		if (Static31.anInt748 != 10) {
			return;
		}
		if (Static40.anInt3561 != 2) {
			if (Static196.anInt4284 == 1 && Static57.anInt1370 >= 5 && Static57.anInt1370 <= 105 && Static140.anInt2804 >= 463 && Static140.anInt2804 <= 498) {
				Static124.method1829();
				return;
			}
			if (Static61.aClass34_1 != null) {
				Static124.method1829();
			}
		}
		@Pc(121) int local121 = Static196.anInt4284;
		@Pc(123) int local123 = Static140.anInt2804;
		@Pc(125) int local125 = Static57.anInt1370;
		if (Static106.anInt2304 == 0) {
			if (local121 == 1 && local125 >= 227 && local125 <= 377 && local123 >= 271 && local123 <= 311) {
				Static124.anInt2613 = 0;
				Static106.anInt2304 = 3;
			}
			@Pc(568) boolean local568 = false;
			if (Static86.anInt1862 != 0) {
				while (Static90.method1342()) {
					if (Static190.anInt4139 == 84) {
						local568 = true;
						break;
					}
				}
			}
			if (local568 || local121 == 1 && local125 >= 387 && local125 <= 537 && local123 >= 271 && local123 <= 311) {
				Static124.anInt2613 = 0;
				Static88.aClass92_812 = Static29.aClass92_327;
				Static88.aClass92_805 = Static115.aClass92_1147;
				Static106.anInt2304 = 2;
				Static88.aClass92_803 = Static115.aClass92_1125;
			}
		} else if (Static106.anInt2304 == 2) {
			@Pc(181) short local181 = 231;
			@Pc(182) int local182 = local181 + 30;
			if (local121 == 1 && local123 >= 246 && local123 < 261) {
				Static124.anInt2613 = 0;
			}
			local182 += 15;
			if (local121 == 1 && local123 >= 261 && local123 < 276) {
				Static124.anInt2613 = 1;
			}
			local182 += 15;
			if (local121 == 1 && local125 >= 227 && local125 <= 377 && local123 >= 301 && local123 <= 341) {
				Static88.aClass92_813 = Static88.aClass92_813.method3201().method3198();
				if (Static88.aClass92_813.method3233() == 0) {
					Static1.method45(Static69.aClass92_645, Static115.aClass92_1152, Static115.aClass92_1126);
				} else if (Static88.aClass92_811.method3233() == 0) {
					Static1.method45(Static28.aClass92_292, Static115.aClass92_1121, Static115.aClass92_1136);
				} else {
					Static1.method45(Static200.aClass92_1995, Static115.aClass92_1137, Static115.aClass92_1123);
					Static48.method862(20);
				}
			} else {
				if (local121 == 1 && local125 >= 387 && local125 <= 537 && local123 >= 301 && local123 <= 341) {
					Static88.aClass92_811 = Static88.aClass92_810;
					Static106.anInt2304 = 0;
					Static88.aClass92_813 = Static88.aClass92_810;
				}
				while (true) {
					while (Static90.method1342()) {
						@Pc(350) boolean local350 = false;
						for (@Pc(352) int local352 = 0; local352 < Static57.aClass92_575.method3233(); local352++) {
							if (Static18.anInt493 == Static57.aClass92_575.method3231(local352)) {
								local350 = true;
								break;
							}
						}
						if (Static124.anInt2613 == 0) {
							if (Static190.anInt4139 == 85 && Static88.aClass92_813.method3233() > 0) {
								Static88.aClass92_813 = Static88.aClass92_813.method3208(Static88.aClass92_813.method3233() - 1, 0);
							}
							if (Static190.anInt4139 == 84 || Static190.anInt4139 == 80) {
								Static124.anInt2613 = 1;
							}
							if (local350 && Static88.aClass92_813.method3233() < 12) {
								Static88.aClass92_813 = Static88.aClass92_813.method3242(Static18.anInt493);
							}
						} else if (Static124.anInt2613 == 1) {
							if (Static190.anInt4139 == 85 && Static88.aClass92_811.method3233() > 0) {
								Static88.aClass92_811 = Static88.aClass92_811.method3208(Static88.aClass92_811.method3233() - 1, 0);
							}
							if (Static190.anInt4139 == 84 || Static190.anInt4139 == 80) {
								Static124.anInt2613 = 0;
							}
							if (Static86.anInt1862 != 0 && Static190.anInt4139 == 84) {
								Static88.aClass92_813 = Static88.aClass92_813.method3201().method3198();
								if (Static88.aClass92_813.method3233() == 0) {
									Static1.method45(Static69.aClass92_645, Static115.aClass92_1152, Static115.aClass92_1126);
									return;
								}
								if (Static88.aClass92_811.method3233() == 0) {
									Static1.method45(Static28.aClass92_292, Static115.aClass92_1121, Static115.aClass92_1136);
									return;
								}
								Static1.method45(Static200.aClass92_1995, Static115.aClass92_1137, Static115.aClass92_1123);
								Static48.method862(20);
								return;
							}
							if (local350 && Static88.aClass92_811.method3233() < 20) {
								Static88.aClass92_811 = Static88.aClass92_811.method3242(Static18.anInt493);
							}
						}
					}
					return;
				}
			}
		} else if (Static106.anInt2304 == 3 && local121 == 1 && local125 >= 307 && local125 <= 457 && local123 >= 301 && local123 <= 341) {
			Static106.anInt2304 = 0;
		}
	}
}
