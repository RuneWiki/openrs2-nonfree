import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dn", name = "J", descriptor = "Lclient!ph;")
	public static Class187 aClass187_32;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BZLclient!la;Ljava/lang/String;)V")
	public static void method1475(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class57 arg1, @OriginalArg(3) String arg2) {
		@Pc(26) int local26 = Static320.aClass79_5.method1982(null, 250, arg2);
		@Pc(35) int local35 = Static320.aClass79_5.method1984(arg2, null, 250) * 13;
		Static412.aClass50_8.P(6, 6, local26 + 4 + 4, 4 + 4 + local35, -16777216, 0);
		Static412.aClass50_8.method5811(6, 6, local26 + 4 + 4, local35 + 4 - -4, -1, 0);
		arg1.method5955(0, 10, 0, 10, arg2, local35, 1, -1, null, local26, -1, null, null);
		Static457.method6059(local26 + 4 + 4, 6, local35 + 8, 6);
		if (arg0) {
			Static412.aClass50_8.method5821();
		}
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
	public static void method1476() {
		@Pc(1) Class267 local1 = Static416.aClass267_78;
		synchronized (Static416.aClass267_78) {
			Static416.aClass267_78.method6011();
		}
		local1 = Static284.aClass267_51;
		synchronized (Static284.aClass267_51) {
			Static284.aClass267_51.method6011();
		}
	}
}
