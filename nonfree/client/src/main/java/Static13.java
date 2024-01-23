import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public static int anInt321;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!jb;")
	public static Class28 aClass28_4;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "Z")
	public static boolean aBoolean29;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public static int anInt317 = 0;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
	public static int anInt322 = -1;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!sc;")
	private static Class107 aClass107_122 = Static231.method3737("Use");

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!vb;")
	public static Class120 aClass120_2 = new Class120();

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "Lclient!sc;")
	public static Class107 aClass107_123 = Static231.method3737("sch-Utteln:");

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "Lclient!sc;")
	public static Class107 aClass107_124 = aClass107_122;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	public static int anInt332 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIB)V")
	public static void method328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17;
		if (Static11.anInt294 != arg0) {
			Static36.anIntArray81 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static36.anIntArray81[local17] = (local17 << 12) / arg0;
			}
			Static64.anInt1531 = arg0 == 64 ? 2048 : 4096;
			Static11.anInt294 = arg0;
			Static147.anInt3169 = arg0 - 1;
		}
		if (arg1 == Static116.anInt2571) {
			return;
		}
		if (Static11.anInt294 == arg1) {
			Static187.anIntArray345 = Static36.anIntArray81;
		} else {
			Static187.anIntArray345 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static187.anIntArray345[local17] = (local17 << 12) / arg1;
			}
		}
		Static116.anInt2571 = arg1;
		Static30.anInt589 = arg1 - 1;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method330() {
		Static169.aClass50_20 = new Class50(32);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)Lclient!o;")
	public static Class86 method333(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static6.aClass86ArrayArray11[local12] == null || Static6.aClass86ArrayArray11[local12][local16] == null) {
			@Pc(30) boolean local30 = Static224.method3669(local12);
			if (!local30) {
				return null;
			}
		}
		return Static6.aClass86ArrayArray11[local12][local16];
	}
}
