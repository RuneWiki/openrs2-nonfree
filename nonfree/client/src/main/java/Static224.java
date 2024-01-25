import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZIILjava/lang/String;)V")
	public static void method3733(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		Static41.method1346();
		if (arg1 == 0) {
			Static323.aClass5_9 = Static109.method2235(Static262.aClass3_Sub27_12.aClass21_Sub26_2.method8162() * 2, 0, Static56.aClass196_17, Static364.aCanvas13, Static473.anInterface7_14);
			if (arg2 != null) {
				Static323.aClass5_9.GA(0);
				@Pc(168) Class282 local168 = Static218.method3657(Static429.aClass196_84, Static641.anInt10199);
				@Pc(177) Class62 local177 = Static323.aClass5_9.method7515(local168, Static645.method2767(Static474.aClass196_98, Static641.anInt10199));
				Static428.method4107();
				Static301.method4799(local168, Static323.aClass5_9, local177, true, arg2);
			}
		} else {
			@Pc(12) Class5 local12 = null;
			@Pc(31) Class282 local31;
			@Pc(40) Class62 local40;
			if (arg2 != null) {
				local12 = Static109.method2235(0, 0, Static56.aClass196_17, Static364.aCanvas13, Static473.anInterface7_14);
				local12.GA(0);
				local31 = Static218.method3657(Static429.aClass196_84, Static641.anInt10199);
				local40 = local12.method7515(local31, Static645.method2767(Static474.aClass196_98, Static641.anInt10199));
				Static428.method4107();
				Static301.method4799(local31, local12, local40, true, arg2);
			}
			try {
				Static323.aClass5_9 = Static109.method2235(Static262.aClass3_Sub27_12.aClass21_Sub26_2.method8162() * 2, arg1, Static56.aClass196_17, Static364.aCanvas13, Static473.anInterface7_14);
				if (arg2 != null) {
					local12.GA(0);
					local31 = Static218.method3657(Static429.aClass196_84, Static641.anInt10199);
					local40 = local12.method7515(local31, Static645.method2767(Static474.aClass196_98, Static641.anInt10199));
					Static428.method4107();
					Static301.method4799(local31, local12, local40, true, arg2);
				}
				if (Static323.aClass5_9.method7529()) {
					@Pc(96) boolean local96 = true;
					try {
						local96 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(108) Throwable local108) {
					}
					@Pc(114) Class3_Sub5 local114;
					if (local96) {
						local114 = Static323.aClass5_9.method7495(146800640);
					} else {
						local114 = Static323.aClass5_9.method7495(104857600);
					}
					Static323.aClass5_9.method7523(local114);
				}
			} catch (@Pc(125) Throwable local125) {
				arg1 = 0;
				Static323.aClass5_9 = Static109.method2235(0, 0, Static56.aClass196_17, Static364.aCanvas13, Static473.anInterface7_14);
			}
			if (local12 != null) {
				try {
					local12.method7548();
				} catch (@Pc(142) Throwable local142) {
				}
			}
		}
		Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1022(!arg0);
		Static262.aClass3_Sub27_12.method3234(arg1, Static262.aClass3_Sub27_12.aClass21_Sub1_1);
		Static192.method3267();
		Static323.aClass5_9.method7526();
		Static323.aClass5_9.X(32);
		Static250.aClass39_4 = Static323.aClass5_9.method7552();
		Static1.aClass39_12 = Static323.aClass5_9.method7552();
		Static630.method8654();
		Static323.aClass5_9.method7491(Static262.aClass3_Sub27_12.aClass21_Sub13_1.method5229() == 1);
		if (Static323.aClass5_9.method7543()) {
			Static163.method2899(Static262.aClass3_Sub27_12.aClass21_Sub29_1.method8645() == 1);
		}
		Static341.method7765(Static323.aClass5_9, Static638.anInt10172 >> 3, Static634.anInt10129 >> 3);
		Static175.method3056();
		Static49.aClass347Array1 = null;
		Static314.aBoolean418 = true;
		Static168.aBoolean272 = false;
		Static58.method1595();
	}
}
