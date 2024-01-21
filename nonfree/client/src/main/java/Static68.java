import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Lclient!rd;")
	public static Class3_Sub4 aClass3_Sub4_2;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public static int anInt1768 = 255;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public static int anInt1772 = 2;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIBLclient!dd;)V")
	public static void method1185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3_Sub2_Sub1_Sub1_Sub1 arg3) {
		if (arg3 == Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1 || Static87.anInt2129 >= 400) {
			return;
		}
		@Pc(52) Class46 local52;
		if (arg3.anInt907 == 0) {
			local52 = Static178.method2860(new Class46[] { arg3.aClass46_233, Static182.method2922(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt889, arg3.anInt889), Static157.aClass46_1271, Static65.aClass46_598, Static57.method1068(arg3.anInt889), Static16.aClass46_117 });
		} else {
			local52 = Static178.method2860(new Class46[] { arg3.aClass46_233, Static157.aClass46_1271, Static12.aClass46_1424, Static57.method1068(arg3.anInt907), Static16.aClass46_117 });
		}
		@Pc(135) int local135;
		if (Static127.anInt3014 == 1) {
			Static120.method2041(Static136.aClass46_1096, 49, arg2, Static178.method2860(new Class46[] { Static94.aClass46_772, Static18.aClass46_121, local52 }), arg1, arg0);
		} else if (!Static90.aBoolean94) {
			for (local135 = 7; local135 >= 0; local135--) {
				if (Static130.aClass46Array18[local135] != null) {
					@Pc(147) short local147 = 0;
					if (Static130.aClass46Array18[local135].method1389(Static134.aClass46_1087)) {
						if (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt889 < arg3.anInt889) {
							local147 = 2000;
						}
						if (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt892 != 0 && arg3.anInt892 != 0) {
							if (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt892 == arg3.anInt892) {
								local147 = 2000;
							} else {
								local147 = 0;
							}
						}
					} else if (Static179.aBooleanArray21[local135]) {
						local147 = 2000;
					}
					@Pc(201) int local201 = local147 + Static87.anIntArray220[local135];
					Static120.method2041(Static130.aClass46Array18[local135], local201, arg2, Static178.method2860(new Class46[] { Static92.aClass46_763, local52 }), arg1, arg0);
				}
			}
		} else if ((Static64.anInt1664 & 0x8) == 8) {
			Static120.method2041(Static182.aClass46_1452, 31, arg2, Static178.method2860(new Class46[] { Static106.aClass46_837, Static18.aClass46_121, local52 }), arg1, arg0);
		}
		for (local135 = 0; local135 < Static87.anInt2129; local135++) {
			if (Static134.anIntArray352[local135] == 17) {
				Static32.aClass46Array5[local135] = Static178.method2860(new Class46[] { Static92.aClass46_763, local52 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method1186() {
		aClass3_Sub4_2 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!jg;Z)V")
	public static void method1187(@OriginalArg(0) Class44 arg0) {
		Static175.aClass44_32 = arg0;
	}
}
