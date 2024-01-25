import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
	public static int anInt6943;

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "Lclient!cw;")
	public static final Class68 aClass68_4 = new Class68(2);

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "Lclient!vf;")
	public static final Class348 aClass348_7 = new Class348();

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)Lclient!cw;")
	public static Class68 method5681(@OriginalArg(1) int arg0) {
		@Pc(15) Class68[] local15 = Static479.method6199();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class68 local23 = local15[local17];
			if (arg0 == local23.anInt1398) {
				return local23;
			}
		}
		return null;
	}
}
