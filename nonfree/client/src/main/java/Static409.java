import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static409 {

	@OriginalMember(owner = "client!r", name = "I", descriptor = "Lclient!qda;")
	public static final Class243 aClass243_12 = new Class243();

	@OriginalMember(owner = "client!r", name = "M", descriptor = "[[I")
	public static final int[][] anIntArrayArray73 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)Z")
	public static boolean method6183(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIBLclient!kea;IZ)V")
	public static void method6185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class161 arg2, @OriginalArg(5) int arg3) {
		Static282.anInt5792 = arg0;
		Static339.anInt5660 = 0;
		Static319.anInt6143 = arg1;
		Static346.aBoolean415 = false;
		Static429.anInt7900 = 1;
		Static492.aClass161_108 = arg2;
		Static32.anInt815 = Static345.aClass3_Sub9_Sub1_2.method1186() / arg3;
		if (Static32.anInt815 < 1) {
			Static32.anInt815 = 1;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!cm;)Ljava/lang/String;")
	public static String method6186(@OriginalArg(1) Class3_Sub11 arg0) {
		return arg0.aString16 == null || arg0.aString16.length() <= 0 ? arg0.aString15 : arg0.aString15 + Static142.aClass67_40.method1934(Static193.anInt7803) + arg0.aString16;
	}
}
