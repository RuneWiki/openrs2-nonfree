import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "Lclient!sea;")
	public static Class306 aClass306_1;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Lclient!mr;")
	public static Class223 aClass223_18 = new Class223();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
	public static boolean method3809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static311.method6191(arg1, arg0) | (arg0 & 0x40000) != 0 || Static200.method3474(arg1, arg0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)V")
	public static void method3810(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class3 local9 = Static559.aClass280_44.method7110(); local9 != null; local9 = Static559.aClass280_44.method7108()) {
			if ((long) arg0 == (local9.aLong276 >> 48 & 0xFFFFL)) {
				local9.method8769();
			}
		}
	}
}
