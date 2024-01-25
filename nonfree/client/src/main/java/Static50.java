import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
	public static int anInt1218;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
	public static int anInt1226;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
	public static int anInt1224 = 10;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLclient!ec;)Lclient!ec;")
	public static Class68 method926(@OriginalArg(1) Class68 arg0) {
		@Pc(11) Class68 local11 = Static55.method1063(arg0);
		if (local11 == null) {
			local11 = arg0.aClass68_4;
		}
		return local11;
	}
}
