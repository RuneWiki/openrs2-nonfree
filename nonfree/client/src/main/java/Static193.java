import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jg", name = "G", descriptor = "S")
	public static short aShort57 = 1;

	@OriginalMember(owner = "client!jg", name = "cc", descriptor = "I")
	public static int anInt3335 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Lclient!nh;")
	public static Class170 method2641(@OriginalArg(1) int arg0) {
		@Pc(8) Class170[] local8 = Static81.method992();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class170 local16 = local8[local10];
			if (arg0 == local16.anInt4738) {
				return local16;
			}
		}
		return null;
	}
}
