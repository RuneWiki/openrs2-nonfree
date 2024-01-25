import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static499 {

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public static int anInt8390 = -1;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIB)V")
	public static void method7330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static349.method5348()) {
			return;
		}
		Static423.anInt7240 = arg1;
		if (arg0 != Static561.anInt9080) {
			Static87.aString114 = "";
		}
		Static561.anInt9080 = arg0;
		Static307.method4889(6);
	}
}
