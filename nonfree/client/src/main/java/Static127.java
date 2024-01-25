import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "[Lclient!nm;")
	public static Class247[] aClass247Array1;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
	public static int anInt2188;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
	public static final int[] anIntArray114 = new int[13];

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	public static int anInt2189 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZJ)V")
	public static void method1985(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static195.method2766(arg0 - 1L);
			Static195.method2766(1L);
		} else {
			Static195.method2766(arg0);
		}
	}
}
