import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static556 {

	@OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
	public static int anInt9127;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
	public static void method7587() {
		if (Static356.aClass287_5.aBoolean630 && Static267.aClass170_4.anInt4548 != -1) {
			Static114.method1694(Static267.aClass170_4.anInt4548, Static267.aClass170_4.aString35);
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IB)I")
	public static int method7588(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static307.method4576(arg0);
	}
}
