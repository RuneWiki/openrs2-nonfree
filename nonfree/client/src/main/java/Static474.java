import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
	public static int anInt7663;

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "[I")
	public static final int[] anIntArray553 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
	public static int anInt7662 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method6701(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(14) int local14 = 0; local14 < Static289.anInt5236; local14++) {
			if (arg0.equalsIgnoreCase(Static514.aStringArray44[local14])) {
				return local14;
			}
		}
		return -1;
	}
}
