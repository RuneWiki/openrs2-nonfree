import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "Lclient!rn;")
	public static Class18 aClass18_29;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!jd;")
	public static final Class117 aClass117_15 = new Class117("WTWIP", 3);

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "[I")
	public static final int[] anIntArray1319 = new int[32];

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "(I)V")
	public static void method5539() {
		@Pc(8) int local8 = Static84.method1290();
		if (local8 == 0) {
			Static68.aByteArrayArrayArray1 = null;
			Static359.method5247(0);
		} else if (local8 == 1) {
			Static164.method2915((byte) 0);
			Static359.method5247(512);
			if (Static96.aByteArrayArrayArray8 != null) {
				Static317.method4707();
			}
		} else {
			Static164.method2915((byte) (Static196.anInt4050 - 4 & 0xFF));
			Static359.method5247(2);
		}
		Static183.anInt3441 = Static382.anInt6523;
	}
}
