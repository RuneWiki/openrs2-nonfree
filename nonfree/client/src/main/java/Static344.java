import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
	public static int anInt6764;

	@OriginalMember(owner = "client!mga", name = "l", descriptor = "I")
	public static int anInt6768;

	@OriginalMember(owner = "client!mga", name = "q", descriptor = "I")
	public static int anInt6771;

	@OriginalMember(owner = "client!mga", name = "n", descriptor = "[I")
	public static final int[] anIntArray397 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!mga", name = "r", descriptor = "I")
	public static int anInt6772 = 0;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)V")
	public static void method5654() {
		if (!Static8.method104()) {
			return;
		}
		if (Static457.aStringArray34 == null) {
			Static188.method3756();
		}
		Static149.anInt3689 = 0;
		Static83.aBoolean604 = true;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(III[B)[B")
	public static byte[] method5656(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static655.method6406(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)I")
	public static int method5660() {
		@Pc(10) Class112 local10 = Static107.aClass112_13;
		synchronized (Static107.aClass112_13) {
			return Static107.aClass112_13.method3632();
		}
	}
}
