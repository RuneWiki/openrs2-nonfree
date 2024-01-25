import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Lclient!ra;")
	public static Class170 aClass170_26;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_29 = new Class66(64);

	@OriginalMember(owner = "client!em", name = "j", descriptor = "[I")
	public static int[] anIntArray97 = new int[2];

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	public static int anInt1822 = -1;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "I")
	public static int anInt1825 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZILclient!vn;Lclient!en;I)V")
	public static void method1602(@OriginalArg(2) Class211 arg0, @OriginalArg(3) Class59 arg1) {
		Static99.aClass211_8.method5600();
		if (Static99.aBoolean140) {
			return;
		}
		for (@Pc(25) Class5_Sub18 local25 = (Class5_Sub18) arg0.method5608(); local25 != null; local25 = (Class5_Sub18) arg0.method5603()) {
			@Pc(32) Class121 local32 = Static299.method5085(local25.anInt2293);
			if (Static333.method4065(local32)) {
				@Pc(44) boolean local44 = Static307.method5241(arg1, local32, local25);
				if (local44) {
					Static338.method3590(local32, local25, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!jf;)V")
	public static void method1606(@OriginalArg(1) Class96 arg0) {
		@Pc(9) Class96 local9 = Static88.method1380(arg0);
		@Pc(15) int local15;
		@Pc(13) int local13;
		if (local9 == null) {
			local13 = Static246.anInt4801;
			local15 = Static17.anInt5991;
		} else {
			local13 = local9.anInt2916;
			local15 = local9.anInt2943;
		}
		Static147.method2743(arg0, local13, false, local15);
		Static352.method5797(arg0, local13, local15);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIB)V")
	public static void method1607(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0 && arg0) {
				Static15.aClass59_1 = Static129.method2469(0, Static112.anInterface1_2, 0, Static243.aCanvas3, Static202.aClass10_3);
				Static15.aClass59_1.method4823(0);
				@Pc(24) Class138 local24 = Static61.method1256(Static202.aClass170_75, Static132.anInt2861);
				@Pc(33) Class91 local33 = Static15.aClass59_1.method4813(local24, Static360.method918(Static317.aClass170_114, Static132.anInt2861));
				Static240.method4079(Static334.aString363, local33, true);
				Static15.aClass59_1.method4848();
				Static110.method2187();
			}
			Static15.aClass59_1 = Static129.method2469(Static275.anInt5386 * 2, Static112.anInterface1_2, arg1, Static243.aCanvas3, Static202.aClass10_3);
			if (Static15.aClass59_1.method4799()) {
				@Pc(66) Class5_Sub14 local66 = Static15.aClass59_1.method4861();
				Static15.aClass59_1.method4846(local66);
			}
		} catch (@Pc(71) Throwable local71) {
			if (arg1 != 0) {
				Static15.aClass59_1 = Static129.method2469(0, Static112.anInterface1_2, 0, Static243.aCanvas3, Static202.aClass10_3);
				arg1 = 0;
			}
		}
		Static134.anInt2746 = arg1;
		Static251.method4407();
		if (!Static15.aClass59_1.method4841()) {
			Static255.anInt4975 = 1;
		}
		Static15.aClass59_1.method4816(Static255.anInt4975);
		Static15.aClass59_1.method4847(0);
		Static110.aClass112_2 = Static15.aClass59_1.method4789();
		Static353.aClass112_5 = Static15.aClass59_1.method4789();
		@Pc(113) int local113 = (int) ((double) Static266.anInt5101 * 34.46D);
		if (Static15.aClass59_1.method4864()) {
			local113 += 128;
		}
		Static15.aClass59_1.method4886(50, local113);
		Static15.aClass59_1.method4812(!Static262.aBoolean384);
		if (Static15.aClass59_1.method4824()) {
			Static169.method3179(Static91.aBoolean135);
		}
		Static154.aBoolean222 = !Static26.method628();
		Static161.method2991(Static15.aClass59_1, Static339.anInt6352 >> 3, Static266.anInt5101 >> 3);
		Static310.method5282();
		Static76.aBoolean414 = false;
	}
}
