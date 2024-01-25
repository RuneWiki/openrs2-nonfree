import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!hd;")
	public static Class4_Sub20 aClass4_Sub20_4;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "Lclient!dj;")
	public static final Class66 aClass66_10 = new Class66(16);

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	public static int anInt2310 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public static void method2204() {
		if (!Static463.aBoolean582) {
			return;
		}
		@Pc(16) Class199 local16 = Static203.method3070(Static292.anInt4612, Static169.anInt3012);
		if (local16 != null && local16.anObjectArray24 != null) {
			@Pc(25) Class4_Sub25 local25 = new Class4_Sub25();
			local25.aClass199_6 = local16;
			local25.anObjectArray2 = local16.anObjectArray24;
			Static237.method3393(local25);
		}
		Static463.aBoolean582 = false;
		Static530.anInt8205 = -1;
		Static270.anInt4357 = -1;
		if (local16 != null) {
			Static331.method4565(local16);
		}
	}
}
