import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!be", name = "g", descriptor = "I")
	public static int anInt308;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public static int anInt312;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!oa;")
	public static Class7 aClass7_15;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!qa;")
	public static Class54 aClass54_5;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "I")
	public static int anInt304 = 0;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!vc;")
	public static Class71 aClass71_222 = null;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!vc;")
	private static Class71 aClass71_223 = Static38.method736("Continue");

	@OriginalMember(owner = "client!be", name = "j", descriptor = "I")
	public static int anInt311 = 0;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_224 = aClass71_223;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "I")
	public static int anInt317 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)Z")
	public static boolean method203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
		@Pc(14) int local14 = Static7.aClass43_1.method1059(Static23.anInt728, arg0, arg2, arg1);
		if (local14 == -1) {
			return false;
		}
		@Pc(33) int local33 = local14 & 0x1F;
		@Pc(39) int local39 = local14 >> 6 & 0x3;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(82) Class5_Sub1_Sub15 local82 = Static97.method1606(local7);
			@Pc(85) int local85 = local82.anInt2541;
			if (local39 != 0) {
				local85 = (local85 >> 4 - local39) + (local85 << local39 & 0xF);
			}
			@Pc(116) int local116;
			@Pc(113) int local113;
			if (local39 == 0 || local39 == 2) {
				local113 = local82.anInt2572;
				local116 = local82.anInt2559;
			} else {
				local116 = local82.anInt2572;
				local113 = local82.anInt2559;
			}
			Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], arg0, 0, 2, local116, true, local85, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], arg2, local113, 0);
		} else {
			Static74.method663(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray261[0], arg0, local39, 2, 0, true, 0, Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anIntArray264[0], arg2, 0, local33 + 1);
		}
		Static9.anInt298 = 2;
		Static66.anInt1650 = Static32.anInt847;
		Static115.anInt2742 = Static30.anInt800;
		Static46.anInt1117 = 0;
		return true;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)V")
	public static synchronized void method204() {
		if (Static111.method709()) {
			Static20.method505();
			Static87.aBoolean98 = false;
			Static112.aClass24_24 = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method205() {
		aClass71_223 = null;
		aClass7_15 = null;
		aClass71_224 = null;
		aClass54_5 = null;
		aClass71_222 = null;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public static synchronized void method206() {
		Static25.method559();
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public static synchronized void method207() {
		if (Static111.method709()) {
			Static103.method1653();
			Static112.aClass24_24 = null;
			Static87.aBoolean98 = false;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLclient!nb;IIILclient!vc;Lclient!vc;I)V")
	public static synchronized void method208(@OriginalArg(1) Class24 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class71 arg2, @OriginalArg(6) Class71 arg3) {
		if (Static111.method709()) {
			@Pc(12) int local12 = arg0.method650(arg2);
			@Pc(18) int local18 = arg0.method664(arg3, local12);
			method209(arg0, arg1, local12, local18);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLclient!nb;IIIIII)V")
	public static synchronized void method209(@OriginalArg(1) Class24 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		if (!Static111.method709()) {
			return;
		}
		Static49.aBoolean52 = false;
		Static97.anInt2321 = -1;
		Static112.aClass24_24 = arg0;
		Static28.anInt770 = arg2;
		Static8.anInt279 = 10;
		Static33.anInt927 = 0;
		Static64.anInt2486 = arg1;
		Static87.aBoolean98 = true;
		Static85.anInt2038 = arg3;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
	public static void method210() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZLclient!nb;III)V")
	public static synchronized void method211(@OriginalArg(0) int arg0, @OriginalArg(3) Class24 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		if (!Static111.method709()) {
			return;
		}
		Static33.anInt927 = arg3;
		Static49.aBoolean52 = false;
		Static64.anInt2486 = arg0;
		Static97.anInt2321 = -1;
		Static85.anInt2038 = 0;
		Static8.anInt279 = -1;
		Static28.anInt770 = arg2;
		Static87.aBoolean98 = true;
		Static112.aClass24_24 = arg1;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	public static synchronized void method212() {
		if (!Static111.method709()) {
			return;
		}
		if (Static87.aBoolean98) {
			@Pc(26) byte[] local26 = Static54.method981(Static112.aClass24_24, Static33.anInt927, Static28.anInt770, Static85.anInt2038);
			if (local26 != null) {
				if (Static8.anInt279 >= 0) {
					Static103.method1649(Static64.anInt2486, Static8.anInt279, Static49.aBoolean52, local26);
				} else if (Static97.anInt2321 >= 0) {
					Static9.method197(Static64.anInt2486, Static49.aBoolean52, Static97.anInt2321, local26);
				} else {
					Static90.method2005(local26, Static49.aBoolean52, Static64.anInt2486);
				}
				Static87.aBoolean98 = false;
				Static112.aClass24_24 = null;
			}
		}
		Static23.method547();
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(BI)Z")
	public static boolean method213(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}
}
