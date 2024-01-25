import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
	public static int anInt5554;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!qm;")
	public static Class195 aClass195_4;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_81 = new Class57(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method5013() {
		@Pc(10) int local10 = Static164.aClass154_Sub1_1.method5402(Static2.anInt68);
		if (local10 == 0) {
			Static330.aByteArrayArrayArray18 = null;
			Static227.method3731(0);
		} else if (local10 == 1) {
			Static267.method5161((byte) 0);
			Static227.method3731(512);
			if (Static13.aByteArrayArrayArray17 != null) {
				Static115.method1864();
			}
		} else {
			Static267.method5161((byte) (Static226.anInt3990 - 4 & 0xFF));
			Static227.method3731(2);
		}
		Static115.anInt2221 = Static363.anInt6170;
	}
}
