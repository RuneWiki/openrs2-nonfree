import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
	public static int anInt4040;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	public static volatile int anInt4036 = 0;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2427 = Static107.method1838("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "[I")
	public static int[] anIntArray370 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2429 = Static107.method1838("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2428 = aClass28_2429;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	public static int anInt4042 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method2876() {
		if (Static173.aClass44_1 != null) {
			@Pc(7) Class44 local7 = Static173.aClass44_1;
			synchronized (Static173.aClass44_1) {
				Static173.aClass44_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!mc;I)V")
	public static void method2879(@OriginalArg(1) Class40_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static46.aClass2_Sub2_3 == null) {
			Static6.method229(true, 255, null, (byte) 0, 0, 255);
			Static83.aClass40_Sub1Array1[arg1] = arg0;
		} else {
			Static46.aClass2_Sub2_3.anInt2385 = arg1 * 8 + 5;
			@Pc(18) int local18 = Static46.aClass2_Sub2_3.method1690();
			@Pc(22) int local22 = Static46.aClass2_Sub2_3.method1690();
			arg0.method1796(local22, local18);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method2880() {
		for (@Pc(8) Class2_Sub19 local8 = (Class2_Sub19) Static29.aClass65_2.method2115(); local8 != null; local8 = (Class2_Sub19) Static29.aClass65_2.method2117()) {
			if (local8.anInt2722 > 0) {
				local8.anInt2722--;
			}
			if (local8.anInt2722 != 0) {
				if (local8.anInt2714 > 0) {
					local8.anInt2714--;
				}
				if (local8.anInt2714 == 0 && local8.anInt2708 >= 1 && local8.anInt2723 >= 1 && local8.anInt2708 <= 102 && local8.anInt2723 <= 102 && (local8.anInt2711 < 0 || Static38.method705(local8.anInt2712, local8.anInt2711))) {
					Static3.method1692(local8.anInt2708, local8.anInt2721, local8.anInt2711, local8.anInt2720, local8.anInt2712, local8.anInt2723, local8.anInt2707);
					local8.anInt2714 = -1;
					if (local8.anInt2711 == local8.anInt2710 && local8.anInt2710 == -1) {
						local8.method2888();
					} else if (local8.anInt2710 == local8.anInt2711 && local8.anInt2707 == local8.anInt2719 && local8.anInt2715 == local8.anInt2712) {
						local8.method2888();
					}
				}
			} else if (local8.anInt2710 < 0 || Static38.method705(local8.anInt2715, local8.anInt2710)) {
				Static3.method1692(local8.anInt2708, local8.anInt2721, local8.anInt2710, local8.anInt2720, local8.anInt2715, local8.anInt2723, local8.anInt2719);
				local8.method2888();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
	public static void method2882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static6.anInt366 == 1) {
			Static47.aClass2_Sub4_Sub3_Sub4Array6[Static164.anInt3646 / 100].method2829(Static33.anInt945 - 8, Static49.anInt1287 + -8);
		}
		if (Static6.anInt366 == 2) {
			Static47.aClass2_Sub4_Sub3_Sub4Array6[Static164.anInt3646 / 100 + 4].method2829(Static33.anInt945 - 8, Static49.anInt1287 + -8);
		}
		Static54.method987();
		if (!Static171.aBoolean166) {
			return;
		}
		@Pc(48) int local48 = arg0 + 507;
		@Pc(52) int local52 = arg2 + 20;
		Static61.aClass2_Sub4_Sub3_Sub2_Sub1_3.method2472(Static83.method1481(new Class28[] { Static101.aClass28_313, Static158.method2411(Static80.anInt2059) }), local48, local52, 16776960, -1);
		@Pc(73) int local73 = local52 + 15;
		@Pc(75) Runtime local75 = Runtime.getRuntime();
		@Pc(84) int local84 = (int) ((local75.totalMemory() - local75.freeMemory()) / 1024L);
		@Pc(86) int local86 = 16776960;
		if (local84 > 32768 && Static177.aBoolean170) {
			local86 = 16711680;
		}
		if (local84 > 65536 && !Static177.aBoolean170) {
			local86 = 16711680;
		}
		Static61.aClass2_Sub4_Sub3_Sub2_Sub1_3.method2472(Static83.method1481(new Class28[] { Static59.aClass28_883, Static158.method2411(local84), Static178.aClass28_2357 }), local48, local73, local86, -1);
		local52 = local73 + 15;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public static void method2883() {
		aClass28_2428 = null;
		aClass28_2429 = null;
		aClass28_2427 = null;
		anIntArray370 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!jc;Lclient!jc;ZB)V")
	public static void method2884(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) boolean arg2) {
		Static87.aClass40_25 = arg1;
		Static180.aClass40_41 = arg0;
		Static72.aBoolean92 = arg2;
	}
}
