import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Lclient!dv;")
	public static Class96 method2929(@OriginalArg(0) int arg0) {
		@Pc(8) Class96[] local8 = Static94.method1394();
		for (@Pc(16) int local16 = 0; local16 < local8.length; local16++) {
			if (local8[local16].anInt1928 == arg0) {
				return local8[local16];
			}
		}
		return null;
	}
}
