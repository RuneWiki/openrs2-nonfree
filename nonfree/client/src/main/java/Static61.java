import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
	public static int anInt1456;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "[Lclient!ab;")
	public static final Class2[] aClass2Array1 = new Class2[6];

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method1288(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
	public static void method1293() {
		if (!Static355.aBoolean412) {
			return;
		}
		@Pc(11) Class251 local11 = Static201.method3261(Static135.anInt2708, Static314.anInt5418);
		if (local11 != null && local11.anObjectArray26 != null) {
			@Pc(20) Class1_Sub24 local20 = new Class1_Sub24();
			local20.aClass251_5 = local11;
			local20.anObjectArray3 = local11.anObjectArray26;
			Static13.method366(local20);
		}
		Static355.aBoolean412 = false;
		Static221.anInt2659 = -1;
		Static92.anInt1948 = -1;
		if (local11 != null) {
			Static408.method5469(local11);
		}
	}
}
