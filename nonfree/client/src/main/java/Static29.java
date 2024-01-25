import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method573(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static49.anInt2346; local16++) {
			if (arg0.equalsIgnoreCase(Static194.aStringArray14[local16])) {
				return local16;
			}
		}
		return -1;
	}
}
