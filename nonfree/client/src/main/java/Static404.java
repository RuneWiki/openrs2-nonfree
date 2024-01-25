import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Z")
	public static boolean aBoolean461 = false;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5593(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static584.aStringArray63.length; local7++) {
			if (Static584.aStringArray63[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)[Lclient!og;")
	public static Class266[] method5594() {
		return new Class266[] { Static94.aClass266_5, Static67.aClass266_4, Static119.aClass266_7 };
	}
}
