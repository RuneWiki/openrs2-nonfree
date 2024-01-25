import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	public static int anInt8586;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)Z")
	public static boolean method7055(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7056(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static167.anInt3850; local9++) {
			if (arg0.equalsIgnoreCase(Static205.aStringArray24[local9])) {
				return local9;
			}
		}
		return -1;
	}
}
