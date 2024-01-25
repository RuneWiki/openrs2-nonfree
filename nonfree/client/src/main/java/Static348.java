import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static348 {

	@OriginalMember(owner = "client!rs", name = "J", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!rs", name = "P", descriptor = "Lclient!f;")
	public static Class76 aClass76_16;

	@OriginalMember(owner = "client!rs", name = "T", descriptor = "Lclient!pc;")
	public static Class188 aClass188_95;

	@OriginalMember(owner = "client!rs", name = "K", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
	public static int anInt6137 = 0;

	@OriginalMember(owner = "client!rs", name = "O", descriptor = "[I")
	public static final int[] anIntArray412 = new int[2048];

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBI)Z")
	public static boolean method4892(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static336.method4750(arg1, arg0) | Static314.method4489(arg1, arg0)) & Static224.method3459(arg0, arg1);
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(B)Z")
	public static boolean method4894() {
		return Static171.aBoolean281;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)I")
	public static int method4895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static72.anIntArrayArray29 == null ? 0 : Static72.anIntArrayArray29[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)V")
	public static void method4896() {
		Static184.aClass26_4.ua(Static107.aFloat79 * ((float) Static399.aClass167_Sub1_1.anInt5554 * 0.1F + 0.7F));
		Static184.aClass26_4.XA(Static335.anInt1518, Static27.aFloat200, Static314.aFloat170, (float) (Static212.anInt4076 << 0), (float) (Static249.anInt4741 << 0), (float) (Static257.anInt4827 << 0));
		Static184.aClass26_4.method2283(Static61.aClass21_1);
	}
}
