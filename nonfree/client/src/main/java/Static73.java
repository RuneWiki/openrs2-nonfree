import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	public static int anInt2036;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	public static int anInt2038;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[200];

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "Z")
	public static boolean aBoolean138 = true;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "J")
	public static long aLong56 = 0L;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22 = null;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
	public static int anInt2041 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public static void method1854() {
		if (Static81.aClass47_3 != null) {
			Static81.aClass47_3.method2673();
			Static81.aClass47_3 = null;
			Static296.aClass51_7 = null;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(JB)V")
	public static void method1856(@OriginalArg(0) long arg0) {
		@Pc(15) int local15 = Static64.anInt1662;
		@Pc(17) int local17 = Static207.anInt4327;
		@Pc(29) int local29;
		@Pc(37) int local37;
		if (Static193.anInt4286 != local15) {
			local29 = local15 - Static193.anInt4286;
			local37 = (int) (arg0 * (long) local29 / 320L);
			if (local29 <= 0) {
				if (local37 == 0) {
					local37 = -1;
				} else if (local37 < local29) {
					local37 = local29;
				}
			} else if (local37 == 0) {
				local37 = 1;
			} else if (local37 > local29) {
				local37 = local29;
			}
			Static193.anInt4286 += local37;
		}
		if (Static354.anInt6740 != local17) {
			local29 = local17 - Static354.anInt6740;
			local37 = (int) (arg0 * (long) local29 / 320L);
			if (local29 <= 0) {
				if (local37 == 0) {
					local37 = -1;
				} else if (local29 > local37) {
					local37 = local29;
				}
			} else if (local37 == 0) {
				local37 = 1;
			} else if (local29 < local37) {
				local37 = local29;
			}
			Static354.anInt6740 += local37;
		}
		if (!Static24.aBoolean37) {
			Static77.aFloat23 += (float) arg0 * Static168.aFloat98 / 40.0F * 8.0F;
			Static106.aFloat31 += Static172.aFloat67 * (float) arg0 / 40.0F * 8.0F;
		}
		Static212.method2560();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)V")
	public static void method1860(@OriginalArg(0) int arg0) {
		Static226.anIntArray388 = new int[arg0];
		Static151.anIntArray271 = new int[arg0];
		Static274.anIntArray443 = new int[arg0];
		Static103.anIntArray229 = new int[arg0];
		Static7.anIntArray6 = new int[arg0];
	}
}
