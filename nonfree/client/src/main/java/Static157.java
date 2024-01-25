import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static157 {

	@OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
	public static int anInt3080;

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "Lclient!mp;")
	public static final Class242 aClass242_3 = new Class242("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZ)Z")
	public static boolean method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)V")
	public static void method2870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static536.method7364()) {
			return;
		}
		if (Static564.anInt8912 != arg1) {
			Static446.aString85 = "";
		}
		Static623.anInt9970 = arg0;
		Static564.anInt8912 = arg1;
		Static411.method6060(6, -3);
	}
}
