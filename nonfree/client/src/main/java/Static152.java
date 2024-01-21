import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ta", name = "R", descriptor = "Lclient!ge;")
	public static Class30 aClass30_4;

	@OriginalMember(owner = "client!ta", name = "V", descriptor = "[I")
	public static int[] anIntArray395;

	@OriginalMember(owner = "client!ta", name = "O", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1198 = Static65.method1172("Wordpack geladen)3");

	@OriginalMember(owner = "client!ta", name = "P", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1199 = Static65.method1172("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ta", name = "T", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1200 = Static65.method1172("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ta", name = "X", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1201 = Static65.method1172("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ta", name = "Y", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1202 = Static65.method1172("hitmarks");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!ve;III)V")
	public static void method2512(@OriginalArg(1) Class3_Sub2_Sub16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static87.anInt2129 >= 400) {
			return;
		}
		if (arg0.anIntArray428 != null) {
			arg0 = arg0.method2747();
		}
		if (arg0 == null || !arg0.aBoolean164) {
			return;
		}
		@Pc(36) Class46 local36 = arg0.aClass46_1370;
		if (arg0.anInt3824 != 0) {
			local36 = Static178.method2860(new Class46[] { local36, Static182.method2922(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt889, arg0.anInt3824), Static157.aClass46_1271, Static65.aClass46_598, Static57.method1068(arg0.anInt3824), Static16.aClass46_117 });
		}
		if (Static127.anInt3014 == 1) {
			Static120.method2041(Static136.aClass46_1096, 44, arg2, Static178.method2860(new Class46[] { Static94.aClass46_772, Static99.aClass46_800, local36 }), arg1, arg3);
		} else if (!Static90.aBoolean94) {
			@Pc(87) Class46[] local87 = arg0.aClass46Array24;
			if (Static128.aBoolean125) {
				local87 = Static40.method841(local87);
			}
			@Pc(101) int local101;
			if (local87 != null) {
				for (local101 = 4; local101 >= 0; local101--) {
					if (local87[local101] != null && !local87[local101].method1389(Static134.aClass46_1087)) {
						@Pc(120) byte local120 = 0;
						if (local101 == 0) {
							local120 = 14;
						}
						if (local101 == 1) {
							local120 = 23;
						}
						if (local101 == 2) {
							local120 = 10;
						}
						if (local101 == 3) {
							local120 = 35;
						}
						if (local101 == 4) {
							local120 = 16;
						}
						Static120.method2041(local87[local101], local120, arg2, Static178.method2860(new Class46[] { Static153.aClass46_1204, local36 }), arg1, arg3);
					}
				}
			}
			if (local87 != null) {
				for (local101 = 4; local101 >= 0; local101--) {
					if (local87[local101] != null && local87[local101].method1389(Static134.aClass46_1087)) {
						@Pc(191) short local191 = 0;
						if (arg0.anInt3824 > Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt889) {
							local191 = 2000;
						}
						@Pc(200) int local200 = 0;
						if (local101 == 0) {
							local200 = local191 + 14;
						}
						if (local101 == 1) {
							local200 = local191 + 23;
						}
						if (local101 == 2) {
							local200 = local191 + 10;
						}
						if (local101 == 3) {
							local200 = local191 + 35;
						}
						if (local101 == 4) {
							local200 = local191 + 16;
						}
						Static120.method2041(local87[local101], local200, arg2, Static178.method2860(new Class46[] { Static153.aClass46_1204, local36 }), arg1, arg3);
					}
				}
			}
			Static120.method2041(Static60.aClass46_549, 1001, arg2, Static178.method2860(new Class46[] { Static153.aClass46_1204, local36 }), arg1, arg3);
			return;
		} else if ((Static64.anInt1664 & 0x2) == 2) {
			Static120.method2041(Static182.aClass46_1452, 47, arg2, Static178.method2860(new Class46[] { Static106.aClass46_837, Static99.aClass46_800, local36 }), arg1, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)V")
	public static void method2513() {
		anIntArray395 = null;
		aClass46_1200 = null;
		aClass30_4 = null;
		aClass46_1199 = null;
		aClass46_1198 = null;
		aClass46_1202 = null;
		aClass46_1201 = null;
	}
}
