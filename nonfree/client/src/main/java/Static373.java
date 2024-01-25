import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "Lclient!mh;")
	public static final Class225 aClass225_23 = new Class225(6, 1);

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method5226(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static91.aStringArray12.length; local7++) {
			if (Static91.aStringArray12[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
