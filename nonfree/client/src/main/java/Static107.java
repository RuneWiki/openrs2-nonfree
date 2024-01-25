import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
	public static int anInt2618;

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
	public static int anInt2620 = 0;

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "[Lclient!qu;")
	public static final Class275[] aClass275Array1 = new Class275[6];

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
	public static final int anInt2623 = 2;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Z")
	public static boolean method2198(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([J[IB)V")
	public static void method2199(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static125.method2372(arg0, arg0.length - 1, 0, arg1);
	}
}
