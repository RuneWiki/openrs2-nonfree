import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	public static int anInt2456;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
	public static int anInt2459;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
	public static int[] anIntArray211 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
	public static int anInt2458 = 0;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString87 = "Loaded fonts";

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "[[I")
	public static int[][] anIntArrayArray6 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ)Z")
	public static boolean method1821(@OriginalArg(1) boolean arg0) {
		@Pc(10) boolean local10 = Static288.method4475();
		if (arg0 == local10) {
			return true;
		}
		if (!arg0) {
			Static288.method4478();
		} else if (!Static288.method4471() || !Static288.method4473() || !Static288.method4468()) {
			arg0 = false;
		}
		Static60.aBoolean96 = arg0;
		Static108.method1847(Static164.aClass102_2);
		if (arg0 == local10) {
			return false;
		} else {
			((Class104_Sub1) Static1.anInterface3_1).method4156();
			return true;
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	public static void method1822() {
		if (Static9.anInt3023 != Static32.anInt876 && Static49.method913(Static32.anInt876)) {
			Static9.anInt3023 = Static32.anInt876;
		}
	}
}
