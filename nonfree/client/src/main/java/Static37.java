import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	public static int anInt1354;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public static int anInt1355;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!wa;")
	public static Class23 aClass23_26;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public static int anInt1357;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Lclient!wa;")
	public static Class23 aClass23_27;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_468 = Static161.method2452("sl_button");

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt1356 = 0;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_469 = Static161.method2452("settings=");

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_472 = Static161.method2452("Take");

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!dc;")
	public static Class20 aClass20_470 = aClass20_472;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "[I")
	public static final int[] anIntArray127 = new int[128];

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!vh;")
	public static final Class104 aClass104_3 = new Class104();

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_471 = Static161.method2452("mapdots");

	@OriginalMember(owner = "client!de", name = "p", descriptor = "[S")
	public static short[] aShortArray21 = new short[256];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Z")
	public static boolean method1027(@OriginalArg(1) int arg0) {
		if (Static105.aBooleanArray25[arg0]) {
			return true;
		} else if (Static198.aClass23_77.method748(arg0)) {
			@Pc(23) int local23 = Static198.aClass23_77.method752(arg0);
			if (local23 == 0) {
				Static105.aBooleanArray25[arg0] = true;
				return true;
			}
			if (Static155.aClass69ArrayArray1[arg0] == null) {
				Static155.aClass69ArrayArray1[arg0] = new Class69[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static155.aClass69ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static198.aClass23_77.method738(local47, arg0);
					if (local61 != null) {
						Static155.aClass69ArrayArray1[arg0][local47] = new Class69();
						Static155.aClass69ArrayArray1[arg0][local47].anInt2523 = (arg0 << 16) + local47;
						if (local61[0] == -1) {
							Static155.aClass69ArrayArray1[arg0][local47].method1894(new Class5_Sub6(local61));
						} else {
							Static155.aClass69ArrayArray1[arg0][local47].method1888(new Class5_Sub6(local61));
						}
					}
				}
			}
			Static105.aBooleanArray25[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([BI)V")
	public static void method1028(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class5_Sub6 local10 = new Class5_Sub6(arg0);
		@Pc(14) int local14 = local10.method3077();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(22) Class5_Sub21 local22 = new Class5_Sub21();
			@Pc(26) Class20 local26 = local10.method3027();
			local22.anInt2620 = local10.method3077();
			local22.anInt2623 = local10.method3077();
			local22.anInt2616 = local10.method3062();
			local22.aClass20_953 = local26.method588();
			local22.aClass20Array22 = local26.method579(47);
			Static35.aClass91_5.method2686(local22);
		}
	}
}
