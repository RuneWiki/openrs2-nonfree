import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
	public static void method6230() {
		Static585.aClass345Array1 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Lclient!fn;")
	public static Class2_Sub3_Sub2 method6231() {
		return Static84.aClass2_Sub3_Sub2_7;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6232(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 == 0) {
			Static417.aClass162_17 = Static451.method6877(Static49.aClass229_31, Static45.anInterface9_1, Static9.aCanvas1, 0, Static257.aClass2_Sub35_Sub1_1.anInt7498 * 2);
			if (arg1 != null) {
				Static417.aClass162_17.ja(0);
				@Pc(25) Class112 local25 = Static226.method2755(Static9.anInt230, Static191.aClass229_45);
				@Pc(34) Class37 local34 = Static417.aClass162_17.method6864(local25, Static603.method7121(Static241.aClass229_54, Static9.anInt230));
				Static539.method7062();
				Static96.method1453(local34, arg1, Static417.aClass162_17, true, local25);
			}
		} else {
			@Pc(47) Class162 local47 = null;
			@Pc(75) Class37 local75;
			@Pc(66) Class112 local66;
			if (arg1 != null) {
				local47 = Static451.method6877(Static49.aClass229_31, Static45.anInterface9_1, Static9.aCanvas1, 0, 0);
				local47.ja(0);
				local66 = Static226.method2755(Static9.anInt230, Static191.aClass229_45);
				local75 = local47.method6864(local66, Static603.method7121(Static241.aClass229_54, Static9.anInt230));
				Static539.method7062();
				Static96.method1453(local75, arg1, local47, true, local66);
			}
			try {
				Static417.aClass162_17 = Static451.method6877(Static49.aClass229_31, Static45.anInterface9_1, Static9.aCanvas1, arg0, Static257.aClass2_Sub35_Sub1_1.anInt7498 * 2);
				if (arg1 != null) {
					local47.ja(0);
					local66 = Static226.method2755(Static9.anInt230, Static191.aClass229_45);
					local75 = local47.method6864(local66, Static603.method7121(Static241.aClass229_54, Static9.anInt230));
					Static539.method7062();
					Static96.method1453(local75, arg1, local47, true, local66);
				}
				if (Static417.aClass162_17.method6866()) {
					@Pc(129) boolean local129 = true;
					try {
						local129 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(139) Throwable local139) {
					}
					@Pc(145) Class2_Sub12 local145;
					if (local129) {
						local145 = Static417.aClass162_17.method6820(146800640);
					} else {
						local145 = Static417.aClass162_17.method6820(104857600);
					}
					Static417.aClass162_17.method6836(local145);
				}
			} catch (@Pc(156) Throwable local156) {
				arg0 = 0;
				Static417.aClass162_17 = Static451.method6877(Static49.aClass229_31, Static45.anInterface9_1, Static9.aCanvas1, 0, 0);
			}
			if (local47 != null) {
				try {
					local47.method6821();
				} catch (@Pc(173) Throwable local173) {
				}
			}
		}
		Static226.anInt3318 = arg0;
		Static256.method3648();
		Static417.aClass162_17.va(32);
		Static468.aClass25_6 = Static417.aClass162_17.method6889();
		Static300.aClass25_4 = Static417.aClass162_17.method6889();
		Static221.method2688();
		Static417.aClass162_17.method6813(!Static257.aClass2_Sub35_Sub1_1.aBoolean632);
		if (Static417.aClass162_17.method6856()) {
			Static183.method2351(Static257.aClass2_Sub35_Sub1_1.aBoolean628);
		}
		Static301.method4357(Static281.anInt4822 >> 3, Static29.anInt491 >> 3, Static417.aClass162_17);
		Static113.method1669();
		Static237.aBoolean297 = false;
		Static329.aClass311Array1 = null;
		Static6.aBoolean15 = true;
	}
}
