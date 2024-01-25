import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!ab;")
	public static Class3 aClass3_9 = null;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	public static void method3434() {
		for (@Pc(10) Class7_Sub2 local10 = (Class7_Sub2) Static346.aClass199_6.method4900(); local10 != null; local10 = (Class7_Sub2) Static346.aClass199_6.method4900()) {
			Static146.method2642(local10);
		}
		@Pc(29) int local29;
		@Pc(28) int local28;
		if (Static40.method575()) {
			local29 = 0;
			local28 = 3;
		} else {
			local28 = Static73.anInt1627;
			local29 = Static73.anInt1627;
		}
		Static51.method794();
		for (@Pc(43) int local43 = local29; local43 <= local28; local43++) {
			Static51.method776();
			Static51.method782(local43);
			Static51.method781(local43);
		}
		Static51.method792();
		Static51.method786();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V")
	public static void method3436(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub7_Sub11 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class149 local8 = Static210.aClass149Array5[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static285.anInt5263; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static176.anInt3742; local15++) {
						local1 = local8.method5834(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static162.anInt3362;
							@Pc(32) int local32 = local12 << Static162.anInt3362;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class149 local41 = Static210.aClass149Array5[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method5837(local15, local12) - local41.method5837(local15, local12);
									@Pc(67) int local67 = local8.method5837(local15 + 1, local12) - local41.method5837(local15 + 1, local12);
									@Pc(85) int local85 = local8.method5837(local15 + 1, local12 + 1) - local41.method5837(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method5837(local15, local12 + 1) - local41.method5837(local15, local12 + 1);
									local41.method5832(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!oj;BLclient!g;Lclient!g;)V")
	public static void method3440(@OriginalArg(0) Class48 arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) Class83 arg2) {
		Static35.aClass24_1 = Static346.method5534(Static47.anInt762, arg2);
		Static135.aClass44_3 = arg0.method2526(Static35.aClass24_1, Static399.method3369(arg1, Static47.anInt762));
		Static209.aClass24_6 = Static346.method5534(Static107.anInt2387, arg2);
		Static31.aClass44_1 = arg0.method2526(Static209.aClass24_6, Static399.method3369(arg1, Static107.anInt2387));
		Static121.aClass24_10 = Static346.method5534(Static291.anInt5451, arg2);
		Static180.aClass44_4 = arg0.method2526(Static121.aClass24_10, Static399.method3369(arg1, Static291.anInt5451));
	}
}
