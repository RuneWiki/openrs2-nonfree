import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!nka", name = "z", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Z)V")
	public static void method6329() {
		Static565.method7869(Static488.aClass67_12, (long) Static269.anInt4883);
		if (Static633.anInt3426 != -1) {
			Static601.method8272(Static633.anInt3426);
		}
		for (@Pc(21) int local21 = 0; local21 < Static583.anInt9536; local21++) {
			if (Static195.aBooleanArray17[local21]) {
				Static565.aBooleanArray24[local21] = true;
			}
			Static589.aBooleanArray26[local21] = Static195.aBooleanArray17[local21];
			Static195.aBooleanArray17[local21] = false;
		}
		Static524.anInt8917 = Static269.anInt4883;
		if (Static633.anInt3426 != -1) {
			Static583.anInt9536 = 0;
			Static51.method674();
		}
		Static488.aClass67_12.la();
		Static699.method9149(Static488.aClass67_12);
		@Pc(77) int local77 = Static349.method5056();
		if (local77 == -1) {
			local77 = Static355.anInt6021;
		}
		if (local77 == -1) {
			local77 = Static396.anInt7100;
		}
		Static470.method6953(local77);
		Static387.anInt6950 = 0;
	}
}
