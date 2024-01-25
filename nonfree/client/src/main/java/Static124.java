import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ft", name = "Q", descriptor = "I")
	public static int anInt2564;

	@OriginalMember(owner = "client!ft", name = "R", descriptor = "I")
	public static int anInt2565;

	@OriginalMember(owner = "client!ft", name = "P", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_9 = new Class168(8, 7);

	@OriginalMember(owner = "client!ft", name = "S", descriptor = "Lclient!tn;")
	public static final Class240 aClass240_1 = new Class240();

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)V")
	public static void method2183() {
		@Pc(10) int local10 = Static361.aClass85_Sub1_1.method2111(Static423.anInt7114);
		if (local10 == 0) {
			Static255.aByteArrayArrayArray16 = null;
			Static101.method6030(0);
		} else if (local10 == 1) {
			Static420.method5524((byte) 0);
			Static101.method6030(512);
			if (Static181.aByteArrayArrayArray15 != null) {
				Static235.method3458();
			}
		} else {
			Static420.method5524((byte) (Static186.anInt3747 - 4 & 0xFF));
			Static101.method6030(2);
		}
		Static374.anInt6426 = Static96.anInt1983;
	}
}
