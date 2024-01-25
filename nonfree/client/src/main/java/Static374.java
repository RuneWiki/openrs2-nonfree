import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	public static int anInt6425 = 0;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
	public static int anInt6426 = -1;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public static void method4988() {
		if (!Static128.method5644()) {
			return;
		}
		if (Static80.aStringArray13 == null) {
			Static165.method5195();
		}
		Static14.aBoolean18 = true;
		Static187.anInt3754 = 0;
		try {
			Static83.aClipboard1 = Static232.aClient5.getToolkit().getSystemClipboard();
		} catch (@Pc(16) Exception local16) {
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)Z")
	public static boolean method4990(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
