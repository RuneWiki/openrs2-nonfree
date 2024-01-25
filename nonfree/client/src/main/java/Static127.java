import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
	public static int anInt2527 = -1;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "[I")
	public static final int[] anIntArray153 = new int[6];

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "[I")
	public static int[] anIntArray154 = new int[4];

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZB)V")
	public static void method2310(@OriginalArg(1) byte arg0) {
		if (Static153.aByteArrayArrayArray3 == null) {
			Static153.aByteArrayArrayArray3 = new byte[4][Static497.anInt7926][Static646.anInt9979];
		}
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (@Pc(27) int local27 = 0; local27 < Static497.anInt7926; local27++) {
				for (@Pc(31) int local31 = 0; local31 < Static646.anInt9979; local31++) {
					Static153.aByteArrayArrayArray3[local23][local27][local31] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IB)V")
	public static void method2311() {
		Static692.aClass307_92.method6995(50);
	}
}
