import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!pf;")
	public static final Class286 aClass286_1 = new Class286("", 17);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public static void method280() {
		@Pc(10) int local10 = Static650.aClass2_Sub30_29.aClass11_Sub27_1.method8752();
		if (local10 == 0) {
			Static481.aByteArrayArrayArray17 = null;
			Static535.method7513(0);
		} else if (local10 == 1) {
			Static288.method4064((byte) 0);
			Static535.method7513(512);
			if (Static392.aByteArrayArrayArray16 != null) {
				Static530.method7454();
			}
		} else {
			Static288.method4064((byte) (Static68.anInt1174 - 4 & 0xFF));
			Static535.method7513(2);
		}
		Static607.anInt9429 = Static684.anInt10516;
	}
}
