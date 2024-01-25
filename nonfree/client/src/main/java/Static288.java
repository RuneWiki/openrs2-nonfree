import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lclient!jc;")
	public static Class117 method3983(@OriginalArg(1) int arg0) {
		@Pc(8) Class117[] local8 = Static268.method3834();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class117 local16 = local8[local10];
			if (local16.anInt3461 == arg0) {
				return local16;
			}
		}
		return null;
	}
}
