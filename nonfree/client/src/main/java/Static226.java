import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hja", name = "h", descriptor = "Lclient!la;")
	public static Class208 aClass208_56;

	@OriginalMember(owner = "client!hja", name = "l", descriptor = "I")
	public static int anInt3673 = 0;

	@OriginalMember(owner = "client!hja", name = "o", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_44 = new Class387(18, 8);

	@OriginalMember(owner = "client!hja", name = "k", descriptor = "Lclient!el;")
	public static final Class109 aClass109_81 = new Class109(49, 8);

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(IC)Z")
	public static boolean method3219(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(45) char[] local45 = Static135.aCharArray1;
			for (@Pc(47) int local47 = 0; local47 < local45.length; local47++) {
				@Pc(53) char local53 = local45[local47];
				if (local53 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
