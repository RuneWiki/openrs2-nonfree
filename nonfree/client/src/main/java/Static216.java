import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Lclient!ke;")
	public static Class1_Sub2_Sub4 aClass1_Sub2_Sub4_7;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
	public static int anInt4749 = -1;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
	public static int anInt4750 = 0;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
	public static int[] anIntArray379 = new int[500];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBI)I")
	public static int method3548(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return local11 + ((arg0 >>> 31) + arg0) % arg1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
	public static void method3549() {
		Static13.aClass79_1.method2479(5);
		Static150.aClass79_23.method2479(5);
		Static17.aClass79_2.method2479(5);
	}
}
