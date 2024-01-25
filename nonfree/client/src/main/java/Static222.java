import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!o", name = "r", descriptor = "[I")
	public static final int[] anIntArray337 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!o", name = "s", descriptor = "[I")
	public static final int[] anIntArray338 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
	public static void method3910(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static249.method4526(arg0, arg1, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Z")
	public static boolean method3911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static313.aByteArrayArrayArray12[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
	public static void method3912() {
		@Pc(1) Class119 local1 = Static335.aClass119_205;
		synchronized (Static335.aClass119_205) {
			Static335.aClass119_205.method3312();
		}
		local1 = Static102.aClass119_67;
		synchronized (Static102.aClass119_67) {
			Static102.aClass119_67.method3312();
		}
		local1 = Static214.aClass119_127;
		synchronized (Static214.aClass119_127) {
			Static214.aClass119_127.method3312();
		}
		local1 = Static101.aClass119_64;
		synchronized (Static101.aClass119_64) {
			Static101.aClass119_64.method3312();
		}
	}
}
