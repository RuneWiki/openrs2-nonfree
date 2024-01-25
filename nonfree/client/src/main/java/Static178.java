import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static178 {

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Lclient!la;")
	public static Class71 aClass71_5;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	public static int anInt3270 = 0;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "[S")
	public static final short[] aShortArray50 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_42 = new Class179(22, 7);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V")
	public static void method2844(@OriginalArg(1) int arg0) {
		Static442.method5829();
		Static16.method461();
		Static314.method4466(true, arg0);
		Static246.method4278(Static415.aClass39_11, Static319.aClass246_127, Static345.aClass246_187);
		Static121.method2193(Static415.aClass39_11, Static345.aClass246_187);
		Static316.method4484();
		Static432.method5741(Static148.aClass143Array4);
		Static319.method3515();
		if (Static342.anInt5771 == 2) {
			Static193.method2987(3);
		} else if (Static342.anInt5771 == 6) {
			Static193.method2987(7);
		} else if (Static342.anInt5771 == 9) {
			Static193.method2987(10);
		} else if (Static342.anInt5771 == 1) {
			Static7.method163(Static345.aClass246_187, Static415.aClass39_11);
			return;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIB)B")
	public static byte method2845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
