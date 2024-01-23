import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString65;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
	public static int anInt1719;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "Lclient!nb;")
	public static Class111 aClass111_1;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "[I")
	public static int[] anIntArray114 = new int[14];

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "[J")
	public static long[] aLongArray4 = new long[1000];

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "[I")
	public static int[] anIntArray117 = new int[14];

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
	public static void method1283() {
		Static144.aClass61_22.method1381(5);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Lclient!bi;")
	public static Class8_Sub1_Sub2 method1289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class8_Sub1_Sub2 local16 = (Class8_Sub1_Sub2) Static89.aClass129_7.method3035(); local16 != null; local16 = (Class8_Sub1_Sub2) Static89.aClass129_7.method3048()) {
			if (local16.aBoolean43 && local16.method421(arg0, arg1)) {
				return local16;
			}
		}
		return null;
	}
}
