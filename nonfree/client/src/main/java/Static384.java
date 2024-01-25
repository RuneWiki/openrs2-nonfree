import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
	public static int anInt7200;

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "Lclient!la;")
	public static Class196 aClass196_78;

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "[I")
	public static final int[] anIntArray438 = new int[1];

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)Z")
	public static boolean method6205(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
	public static void method6206() {
		for (@Pc(8) int local8 = 0; local8 < Static592.anInt9706; local8++) {
			@Pc(20) int local20 = Static583.method8236(local8 + Static596.anInt9751, Static592.anInt9706) * Static330.anInt6169;
			for (@Pc(22) int local22 = 0; local22 < Static330.anInt6169; local22++) {
				@Pc(33) int local33 = Static583.method8236(Static408.anInt7470 + local22, Static330.anInt6169) + local20;
				if (Static194.anIntArray198[local33] == Static576.anInt9495) {
					Static440.anInterface8Array1[local33].method8529(0, 0, Static153.anInt3029, Static159.anInt3138, local22 * Static153.anInt3029, Static159.anInt3138 * local8);
				}
			}
		}
	}
}
