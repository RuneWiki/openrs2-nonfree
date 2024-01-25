import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hia", name = "k", descriptor = "I")
	public static int anInt3551;

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_80 = new Class151(56, 6);

	@OriginalMember(owner = "client!hia", name = "m", descriptor = "Lclient!bja;")
	public static final Class27 aClass27_17 = new Class27(13, 0, 1, 0);

	@OriginalMember(owner = "client!hia", name = "n", descriptor = "I")
	public static int anInt3553 = 0;

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3269(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static93.aStringArray11.length; local7++) {
			if (Static93.aStringArray11[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
