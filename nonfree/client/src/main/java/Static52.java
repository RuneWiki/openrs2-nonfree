import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	public static int anInt928;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "Lclient!vp;")
	public static Class262 aClass262_3;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "Lclient!ph;")
	public static Class187 aClass187_15;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!mf;Lclient!za;I)V")
	public static void method874(@OriginalArg(2) Class163 arg0, @OriginalArg(3) Class50 arg1) {
		Static339.aClass163_38.method3619();
		if (Static353.aBoolean391) {
			return;
		}
		for (@Pc(18) Class10_Sub46 local18 = (Class10_Sub46) arg0.method3620(); local18 != null; local18 = (Class10_Sub46) arg0.method3621()) {
			@Pc(26) Class208 local26 = Static143.aClass88_2.method2268(local18.anInt7522);
			if (Static347.method4711(local26)) {
				@Pc(38) boolean local38 = Static147.method2562(arg1, local26, local18);
				if (local38) {
					Static62.method1045(local18, local26, arg1);
				}
			}
		}
	}
}
