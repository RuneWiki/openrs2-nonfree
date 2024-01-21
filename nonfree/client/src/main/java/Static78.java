import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!we;")
	public static Class62 aClass62_15;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
	public static int anInt1962;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_16;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "Lclient!na;")
	private static Class53 aClass53_878 = Static109.method1737("Sorry invited players only)3");

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!na;")
	private static Class53 aClass53_880 = Static109.method1737("Continue");

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_879 = aClass53_880;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	public static int anInt1957 = 0;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Lclient!na;")
	private static Class53 aClass53_881 = Static109.method1737("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "Lclient!na;")
	public static Class53 aClass53_882 = aClass53_878;

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
	public static int anInt1959 = -1;

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "Lclient!na;")
	public static Class53 aClass53_883 = aClass53_881;

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
	public static int anInt1963 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BILclient!qe;)V")
	public static void method1364(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub4_Sub1 arg1) {
		Static19.method1698(arg0, arg1.anInt1427, arg1.anInt1424);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)Z")
	public static boolean method1365(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public static void method1366() {
		@Pc(9) int local9 = Static40.anInt1189 * 128 + 64;
		@Pc(15) int local15 = Static96.anInt1468 * 128 + 64;
		@Pc(23) int local23 = Static77.method1355(local15, Static72.anInt1813, local9) - Static97.anInt2308;
		if (local23 > Static95.anInt2273) {
			Static95.anInt2273 += Static4.anInt120 + (local23 - Static95.anInt2273) * Static105.anInt2430 / 1000;
			if (Static95.anInt2273 > local23) {
				Static95.anInt2273 = local23;
			}
		}
		if (local23 < Static95.anInt2273) {
			Static95.anInt2273 -= Static4.anInt120 + (Static95.anInt2273 - local23) * Static105.anInt2430 / 1000;
			if (local23 > Static95.anInt2273) {
				Static95.anInt2273 = local23;
			}
		}
		if (Static39.anInt1177 < local9) {
			Static39.anInt1177 += Static4.anInt120 + (local9 - Static39.anInt1177) * Static105.anInt2430 / 1000;
			if (local9 < Static39.anInt1177) {
				Static39.anInt1177 = local9;
			}
		}
		if (Static115.anInt2618 < local15) {
			Static115.anInt2618 += Static4.anInt120 + Static105.anInt2430 * (local15 - Static115.anInt2618) / 1000;
			if (Static115.anInt2618 > local15) {
				Static115.anInt2618 = local15;
			}
		}
		if (Static115.anInt2618 > local15) {
			Static115.anInt2618 -= Static105.anInt2430 * (Static115.anInt2618 - local15) / 1000 + Static4.anInt120;
			if (local15 > Static115.anInt2618) {
				Static115.anInt2618 = local15;
			}
		}
		local15 = Static90.anInt2126 * 128 + 64;
		if (Static39.anInt1177 > local9) {
			Static39.anInt1177 -= (Static39.anInt1177 - local9) * Static105.anInt2430 / 1000 + Static4.anInt120;
			if (local9 > Static39.anInt1177) {
				Static39.anInt1177 = local9;
			}
		}
		local9 = Static75.anInt1863 * 128 + 64;
		local23 = Static77.method1355(local15, Static72.anInt1813, local9) - Static48.anInt1296;
		@Pc(205) int local205 = local23 - Static95.anInt2273;
		@Pc(210) int local210 = local15 - Static115.anInt2618;
		@Pc(215) int local215 = local9 - Static39.anInt1177;
		@Pc(226) int local226 = (int) Math.sqrt((double) (local210 * local210 + local215 * local215));
		@Pc(237) int local237 = (int) (Math.atan2((double) local205, (double) local226) * 325.949D) & 0x7FF;
		@Pc(248) int local248 = (int) (-325.949D * Math.atan2((double) local215, (double) local210)) & 0x7FF;
		if (local237 < 128) {
			local237 = 128;
		}
		@Pc(260) int local260 = local248 - Static72.anInt1807;
		if (local237 > 383) {
			local237 = 383;
		}
		if (Static48.anInt1302 < local237) {
			Static48.anInt1302 += (local237 - Static48.anInt1302) * Static50.anInt2783 / 1000 + Static16.anInt373;
			if (local237 < Static48.anInt1302) {
				Static48.anInt1302 = local237;
			}
		}
		if (local260 > 1024) {
			local260 -= 2048;
		}
		if (local260 < -1024) {
			local260 += 2048;
		}
		if (local260 > 0) {
			Static72.anInt1807 += Static50.anInt2783 * local260 / 1000 + Static16.anInt373;
			Static72.anInt1807 &= 0x7FF;
		}
		if (local237 < Static48.anInt1302) {
			Static48.anInt1302 -= Static50.anInt2783 * (Static48.anInt1302 - local237) / 1000 + Static16.anInt373;
			if (Static48.anInt1302 < local237) {
				Static48.anInt1302 = local237;
			}
		}
		if (local260 < 0) {
			Static72.anInt1807 -= -local260 * Static50.anInt2783 / 1000 + Static16.anInt373;
			Static72.anInt1807 &= 0x7FF;
		}
		@Pc(369) int local369 = local248 - Static72.anInt1807;
		if (local369 > 1024) {
			local369 -= 2048;
		}
		if (local369 < -1024) {
			local369 += 2048;
		}
		if (local369 < 0 && local260 > 0 || local369 > 0 && local260 < 0) {
			Static72.anInt1807 = local248;
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	public static void method1367() {
		aShortArrayArray1 = null;
		aClass53_883 = null;
		aClass53_879 = null;
		aClass53_878 = null;
		aClass62_15 = null;
		aClass53_880 = null;
		aCalendar1 = null;
		aClass53_882 = null;
		aClass53_881 = null;
		aClass3_Sub1_Sub5_Sub3_16 = null;
	}
}
