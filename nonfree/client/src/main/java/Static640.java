import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "S")
	public static short aShort126 = 256;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
	public static final int[] anIntArray707 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
	public static int anInt9835 = -1;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	public static void method8677() {
		Static541.method7566();
		Static189.aBoolean301 = false;
		Static642.method8685(Static442.anInt7174, Static216.anInt3440, Static215.anInt3422, Static699.anInt10734);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Lclient!jea;")
	public static Class192 method8678() {
		try {
			return (Class192) Class.forName("lv").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}
}
