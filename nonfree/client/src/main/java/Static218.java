import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
	public static int anInt4299;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_83 = new Class298(43, -1);

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
	public static int anInt4297 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
	public static void method3791(@OriginalArg(1) int arg0) {
		Static482.anInt7798 = arg0;
		@Pc(7) Class10 local7 = Static391.aClass10_41;
		synchronized (Static391.aClass10_41) {
			Static391.aClass10_41.method263();
		}
		local7 = Static220.aClass10_20;
		synchronized (Static220.aClass10_20) {
			Static220.aClass10_20.method263();
		}
	}
}
