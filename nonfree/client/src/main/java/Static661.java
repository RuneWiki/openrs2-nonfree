import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static661 {

	@OriginalMember(owner = "client!wga", name = "j", descriptor = "[[[Lclient!ug;")
	public static Class351[][][] aClass351ArrayArrayArray3;

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "I")
	public static int anInt10597 = 0;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method8992(@OriginalArg(1) String[] arg0) {
		@Pc(16) String[] local16 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local16[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local16[local18] = local16[local18] + arg0[local18];
			}
		}
		return local16;
	}
}
