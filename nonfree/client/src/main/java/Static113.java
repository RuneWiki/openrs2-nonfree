import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!h", name = "y", descriptor = "I")
	public static int anInt2095;

	@OriginalMember(owner = "client!h", name = "q", descriptor = "J")
	public static long aLong74 = 0L;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "[S")
	public static final short[] aShortArray21 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!h", name = "z", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_52 = new Class85("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!h", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!h", name = "E", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	public static void method1983() {
		if (!Static54.aBoolean72) {
			return;
		}
		@Pc(11) Class201 local11 = Static297.method5150(Static166.anInt3318, Static240.anInt4828);
		if (local11 != null && local11.anObjectArray23 != null) {
			@Pc(25) Class5_Sub17 local25 = new Class5_Sub17();
			local25.anObjectArray1 = local11.anObjectArray23;
			local25.aClass201_3 = local11;
			Static108.method1907(local25);
		}
		Static199.anInt3970 = -1;
		Static54.aBoolean72 = false;
		Static137.anInt2629 = -1;
		Static189.method3383(local11);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
	public static void method1984() {
		@Pc(10) Class109 local10 = Static60.aClass109_23;
		synchronized (Static60.aClass109_23) {
			Static60.aClass109_23.method2859(5);
		}
	}
}
