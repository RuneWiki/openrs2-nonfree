import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!wea", name = "I", descriptor = "I")
	public static final int anInt9395 = 1407;

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(BI)Lclient!lp;")
	public static Class188 method7687(@OriginalArg(1) int arg0) {
		@Pc(8) Class188[] local8 = Static155.method2274();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].anInt4778 == arg0) {
				return local8[local10];
			}
		}
		return null;
	}
}
