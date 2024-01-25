import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ci", name = "D", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_25 = new Class397(12, 3);

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
	public static int anInt1842 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IC)Z")
	public static boolean method1726(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZII)I")
	public static int method1728(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class3_Sub38 local18 = Static14.method503(arg1, arg0);
		if (local18 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < local18.anIntArray411.length; local33++) {
				if (local18.anIntArray410[local33] == arg2) {
					local31 += local18.anIntArray411[local33];
				}
			}
			return local31;
		}
	}
}
