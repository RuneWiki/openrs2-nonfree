import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_104 = new Class341(46, 3);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!uf;I)V")
	public static void method9214(@OriginalArg(0) Class357 arg0) {
		@Pc(7) Class357 local7 = Static73.method1353(arg0);
		@Pc(17) int local17;
		@Pc(20) int local20;
		if (local7 == null) {
			local17 = Static406.anInt7570;
			local20 = Static19.anInt352;
		} else {
			local17 = local7.anInt10395;
			local20 = local7.anInt10465;
		}
		Static233.method4208(local17, local20, false, arg0);
		Static645.method8762(local17, local20, arg0);
	}
}
