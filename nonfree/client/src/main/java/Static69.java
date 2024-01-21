import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!m", name = "B", descriptor = "Lclient!qc;")
	private static Class60 aClass60_633 = Static121.method2047("Loaded input handler");

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!qc;")
	public static Class60 aClass60_628 = aClass60_633;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!mf;")
	public static Class48 aClass48_39 = new Class48(64);

	@OriginalMember(owner = "client!m", name = "w", descriptor = "Lclient!qc;")
	private static Class60 aClass60_630 = Static121.method2047("To play on this world move to a free area first");

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!qc;")
	public static Class60 aClass60_629 = aClass60_630;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	public static int anInt1768 = 0;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	public static int anInt1771 = 0;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!m", name = "s", descriptor = "I")
	public static int anInt1774 = 128;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "Lclient!qc;")
	public static Class60 aClass60_631 = Static121.method2047("scape main");

	@OriginalMember(owner = "client!m", name = "A", descriptor = "Lclient!qc;")
	public static Class60 aClass60_632 = Static121.method2047("welle:");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Z")
	public static boolean method1327(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1329() {
		Static9.aClass48_6.method1393();
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public static void method1331() {
		aClass60_632 = null;
		aClass60_630 = null;
		aClass48_39 = null;
		aClass60_633 = null;
		aClass60_631 = null;
		aClass60_629 = null;
		aBooleanArray8 = null;
		aClass60_628 = null;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
	public static void method1338() {
		@Pc(7) int local7 = Static31.anInt849;
		@Pc(9) int local9 = Static55.anInt1407;
		@Pc(11) int local11 = Static33.anInt889;
		@Pc(13) int local13 = Static46.anInt1203;
		Static80.method1712(local11, local9, local7 + local11, local13 + local9);
		Static80.method1705(local11, local9, local7, local13, 6116423);
		Static80.method1705(local11 + 1, local9 + 1, local7 - 2, 16, 0);
		Static80.method1718(local11 + 1, local9 + 18, local7 - 2, local13 + -19, 0);
		Static87.aClass4_Sub4_Sub3_Sub4_5.method1745(Static34.aClass60_375, local11 + 3, local9 + 14, 6116423, -1);
		@Pc(69) int local69 = Static17.anInt452;
		@Pc(71) int local71 = Static82.anInt1962;
		for (@Pc(73) int local73 = 0; local73 < Static25.anInt693; local73++) {
			@Pc(88) int local88 = local9 + (Static25.anInt693 - local73 - 1) * 15 + 31;
			@Pc(90) int local90 = 16777215;
			if (local11 < local71 && local7 + local11 > local71 && local69 > local88 - 13 && local69 < local88 + 3) {
				local90 = 16776960;
			}
			Static87.aClass4_Sub4_Sub3_Sub4_5.method1745(Static43.method726(local73), local11 + 3, local88, local90, 0);
		}
		Static73.method1387(Static55.anInt1407, Static46.anInt1203, Static33.anInt889, Static31.anInt849);
	}
}
