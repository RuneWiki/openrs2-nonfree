import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public static int anInt6244;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	public static int anInt6245 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Z")
	public static boolean method5672(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5673(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static330.anInt6194; local9++) {
			if (arg0.equalsIgnoreCase(Static163.aStringArray18[local9])) {
				return local9;
			}
		}
		return -1;
	}
}
