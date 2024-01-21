import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static70 {

	@OriginalMember(owner = "client!m", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!m", name = "L", descriptor = "I")
	public static int anInt1783 = 0;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
	public static void method1168() {
		aBooleanArray9 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)Z")
	public static boolean method1169(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
	public static void method1171() {
		Static29.aClass72_11.method1786();
	}
}
