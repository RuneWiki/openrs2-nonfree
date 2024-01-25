import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
	public static int anInt2452 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	public static void method2060() {
		Static113.anInt2187 = -1;
		Static249.aBoolean503 = false;
		Static48.aClass20_16 = null;
		Static175.anInt3065 = 1;
		Static317.anInt4554 = -1;
		Static120.anInt2268 = 2;
		Static83.anInt1721 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)V")
	public static void method2061(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static247.anInt4442 == 1) {
			Static96.method1617(Static293.aClass3_Sub4_2, arg0, arg1);
		} else if (Static247.anInt4442 == 2) {
			Static282.method4477(arg0, arg1);
		}
		Static247.anInt4442 = 0;
		Static293.aClass3_Sub4_2 = null;
	}
}
