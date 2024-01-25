import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
	public static int anInt7810;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "F")
	public static float aFloat168;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method6137(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static202.aStringArray16.length; local12++) {
			if (Static202.aStringArray16[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
