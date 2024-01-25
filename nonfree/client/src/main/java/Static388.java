import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
	public static int anInt7524 = 0;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
	public static void method6211() {
		Static315.anInt9128 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static524.aClass8_Sub8Array1[local14] = null;
			Static607.aByteArray60[local14] = 1;
			Static408.aClass272Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V")
	public static void method6212() {
		if (!Static78.aBoolean179) {
			Static78.aBoolean179 = true;
			Static462.aFloat183 += (24.0F - Static462.aFloat183) / 2.0F;
			Static69.aBoolean558 = true;
		}
	}
}
