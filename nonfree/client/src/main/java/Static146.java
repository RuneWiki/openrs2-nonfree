import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!od", name = "G", descriptor = "J")
	public static long aLong125;

	@OriginalMember(owner = "client!od", name = "O", descriptor = "[Lclient!d;")
	public static Class2_Sub10[] aClass2_Sub10Array1;

	@OriginalMember(owner = "client!od", name = "v", descriptor = "[S")
	public static short[] aShortArray107 = new short[] { 26, 30, 4, 34, 36, 14, 44, 12 };

	@OriginalMember(owner = "client!od", name = "y", descriptor = "I")
	public static int anInt3306 = 0;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "I")
	public static int anInt3311 = 0;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public static void method2587() {
		if (Static166.anInt1143 != -1) {
			Static95.method1664(Static166.anInt1143);
		}
		for (@Pc(13) int local13 = 0; local13 < Static109.anInt2416; local13++) {
			if (Static165.aBooleanArray111[local13]) {
				Static84.aBooleanArray57[local13] = true;
			}
			Static162.aBooleanArray108[local13] = Static165.aBooleanArray111[local13];
			Static165.aBooleanArray111[local13] = false;
		}
		Static68.aClass64_6 = null;
		Static93.anInt2055 = -1;
		Static28.anInt499 = -1;
		Static16.anInt4869 = Static123.anInt2808;
		if (Static166.anInt1143 != -1) {
			Static109.anInt2416 = 0;
			Static185.method3423(0, 0, Static134.anInt3131, Static166.anInt1143, Static30.anInt546, 0, 0, -1);
		}
		Static217.method3756();
		Static44.anInt797 = 0;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public static void method2588() {
		Static35.aClass44_8 = new Class44();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)I")
	public static int method2591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static65.method1052(arg1 - 1, arg0 + -1) + Static65.method1052(arg1 + 1, arg0 - 1) + Static65.method1052(arg1 + -1, arg0 + 1) + Static65.method1052(arg1 + 1, arg0 + 1);
		@Pc(70) int local70 = Static65.method1052(arg1 - 1, arg0) + Static65.method1052(arg1 + 1, arg0) + Static65.method1052(arg1, arg0 + -1) + Static65.method1052(arg1, arg0 - -1);
		@Pc(75) int local75 = Static65.method1052(arg1, arg0);
		return local70 / 8 + local41 / 16 + local75 / 4;
	}
}
