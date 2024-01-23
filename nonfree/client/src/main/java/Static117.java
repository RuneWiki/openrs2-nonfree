import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
	public static volatile int anInt2178 = 0;

	@OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
	public static volatile int anInt2181 = -1;

	@OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
	public static int anInt2182 = 0;

	@OriginalMember(owner = "client!ig", name = "eb", descriptor = "Ljava/lang/String;")
	public static String aString88 = "Loaded wordpack";

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)V")
	public static void method1916() {
		Static215.aClass3_Sub26_Sub1_2.method3958(204);
		for (@Pc(24) Class3_Sub3 local24 = (Class3_Sub3) Static205.aClass30_23.method664(); local24 != null; local24 = (Class3_Sub3) Static205.aClass30_23.method671()) {
			if (local24.anInt186 == 0) {
				Static49.method779(true, local24);
			}
		}
		if (Static259.aClass151_18 != null) {
			Static134.method3639(Static259.aClass151_18);
			Static259.aClass151_18 = null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)J")
	public static long method1917() {
		return Static152.aClass34_1.method5033();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BC)Z")
	public static boolean method1919(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
