import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	public static int anInt2618;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "I")
	public static int anInt2620 = 0;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "[I")
	public static final int[] anIntArray176 = new int[32];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZLclient!ta;)Z")
	public static boolean method2180(@OriginalArg(0) int arg0, @OriginalArg(2) Class327 arg1) {
		Static83.aClass177_3.method7866(arg1.anIntArray595[arg0], arg1.anIntArray596[arg0], arg1.anIntArray594[arg0], Static421.anIntArray490);
		@Pc(22) int local22 = Static421.anIntArray490[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray133[arg0] = (short) (Static421.anIntArray490[0] * Static131.anInt10156 / local22 + Static99.anInt7119);
			arg1.aShortArray134[arg0] = (short) (Static79.anInt1416 + Static421.anIntArray490[1] * Static340.anInt5397 / local22);
			arg1.aShortArray135[arg0] = (short) local22;
			return true;
		}
	}
}
