import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!st", name = "a", descriptor = "I")
	public static int anInt9325 = -1;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "[I")
	public static final int[] anIntArray526 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	public static void method8002() {
		@Pc(14) Class286 local14 = null;
		try {
			local14 = Static359.method5354("2");
			@Pc(27) Class5_Sub23 local27 = new Class5_Sub23(Static674.anInt10792 * 6 + 3);
			local27.method8502(1);
			local27.method8480(Static674.anInt10792);
			for (@Pc(37) int local37 = 0; local37 < Static21.anIntArray24.length; local37++) {
				if (Static433.aBooleanArray17[local37]) {
					local27.method8480(local37);
					local27.method8486(Static21.anIntArray24[local37]);
				}
			}
			local14.method6821(0, local27.aByteArray102, local27.anInt9869);
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local14 != null) {
				local14.method6820();
			}
		} catch (@Pc(87) Exception local87) {
		}
		Static489.aLong249 = Static515.method7499(76);
		Static593.aBoolean754 = false;
	}
}
