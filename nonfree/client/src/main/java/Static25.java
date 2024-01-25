import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)I")
	public static int method8256(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static66.anInt10075;
		if (local10 == 0) {
			return arg0 ? 0 : Static272.anInt5779;
		} else if (local10 == 1) {
			return Static272.anInt5779;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/String;IZI)V")
	public static void method8261(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Static457.method7121();
		if (arg1 == 0) {
			Static186.aClass20_4 = Static348.method5945(0, Static216.anInterface4_10, Static74.aClass2_Sub13_5.aClass14_Sub27_2.method8731() * 2, Static639.aCanvas10, Static384.aClass157_195);
			if (arg0 != null) {
				Static186.aClass20_4.GA(0);
				@Pc(36) Class239 local36 = Static48.method1704(Static208.anInt4697, Static348.aClass157_177);
				@Pc(45) Class68 local45 = Static186.aClass20_4.method7289(local36, Static652.method7581(Static214.aClass157_106, Static208.anInt4697));
				Static390.method6424();
				Static151.method3426(true, local45, local36, arg0, Static186.aClass20_4);
			}
		} else {
			@Pc(58) Class20 local58 = null;
			@Pc(86) Class68 local86;
			if (arg0 != null) {
				local58 = Static348.method5945(0, Static216.anInterface4_10, 0, Static639.aCanvas10, Static384.aClass157_195);
				local58.GA(0);
				@Pc(77) Class239 local77 = Static48.method1704(Static208.anInt4697, Static348.aClass157_177);
				local86 = local58.method7289(local77, Static652.method7581(Static214.aClass157_106, Static208.anInt4697));
				Static390.method6424();
				Static151.method3426(true, local86, local77, arg0, local58);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static186.aClass20_4 = Static348.method5945(arg1, Static216.anInterface4_10, Static74.aClass2_Sub13_5.aClass14_Sub27_2.method8731() * 2, Static639.aCanvas10, Static384.aClass157_195);
					if (arg0 != null) {
						local58.GA(0);
						@Pc(123) Class239 local123 = Static48.method1704(Static208.anInt4697, Static348.aClass157_177);
						@Pc(132) Class68 local132 = local58.method7289(local123, Static652.method7581(Static214.aClass157_106, Static208.anInt4697));
						Static390.method6424();
						Static151.method3426(true, local132, local123, arg0, local58);
					}
					if (Static186.aClass20_4.method7296()) {
						@Pc(148) boolean local148 = true;
						try {
							local148 = Static494.aClass2_Sub16_1.anInt3436 > 256;
						} catch (@Pc(158) Throwable local158) {
						}
						@Pc(164) Class2_Sub2 local164;
						if (local148) {
							local164 = Static186.aClass20_4.method7305(146800640);
						} else {
							local164 = Static186.aClass20_4.method7305(104857600);
						}
						Static186.aClass20_4.method7254(local164);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(175) Throwable local175) {
					@Pc(180) int local180 = Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945();
					if (local180 == 2) {
						Static389.aBoolean544 = true;
					}
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_2, 0);
					method8261(arg0, local180, arg2);
					@Pc(199) Object local199 = null;
					var14 = false;
				} finally {
					if (var14) {
						local86 = null;
						if (local58 != null) {
							try {
								local58.method7238();
							} catch (@Pc(345) Throwable local345) {
							}
						}
					}
				}
				if (local58 != null) {
					try {
						local58.method7238();
					} catch (@Pc(325) Throwable local325) {
					}
				}
				return;
			}
			local86 = null;
			if (local58 != null) {
				try {
					local58.method7238();
				} catch (@Pc(335) Throwable local335) {
				}
			}
		}
		Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2942(!arg2);
		Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_2, arg1);
		Static66.method8350();
		Static186.aClass20_4.method7253();
		Static186.aClass20_4.X(32);
		Static45.aClass30_3 = Static186.aClass20_4.method7257();
		Static172.aClass30_6 = Static186.aClass20_4.method7257();
		Static63.method1964();
		Static186.aClass20_4.method7233(Static74.aClass2_Sub13_5.aClass14_Sub10_1.method3783() == 1);
		if (Static186.aClass20_4.method7230()) {
			Static631.method9158(Static74.aClass2_Sub13_5.aClass14_Sub2_1.method655() == 1);
		}
		Static339.method5849(Static47.anInt1794 >> 3, Static186.aClass20_4, Static209.anInt4742 >> 3);
		Static305.method5400();
		Static475.aBoolean694 = false;
		Static516.aClass25Array1 = null;
		Static291.aBoolean463 = true;
		Static328.method5643();
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIZ)V")
	public static void method8262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg0, 14);
		local8.method3088();
		local8.anInt3368 = arg1;
	}
}
