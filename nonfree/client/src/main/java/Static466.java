import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)Lclient!mp;")
	public static Class242 method6569(@OriginalArg(1) int arg0) {
		@Pc(8) Class242[] local8 = Static570.method7684();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class242 local16 = local8[local10];
			if (arg0 == local16.anInt6275) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)Lclient!jca;")
	public static Class182 method6570(@OriginalArg(0) int arg0) {
		@Pc(8) Class182[] local8 = Static552.method7506();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			@Pc(24) Class182 local24 = local8[local18];
			if (arg0 == local24.anInt4681) {
				return local24;
			}
		}
		return null;
	}
}
