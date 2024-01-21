import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "[I")
	public static int[] anIntArray282;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_6;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1361 = Static32.method683("Service unavailable)3");

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1362 = Static32.method683("Passwort: ");

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1363 = aClass49_1361;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1364 = Static32.method683("(U0a )2 in: ");

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public static int anInt3015 = 0;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1365 = Static32.method683("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method2344() {
		aClass49_1365 = null;
		aClass49_1363 = null;
		aClass49_1362 = null;
		anIntArray282 = null;
		aClass2_Sub2_Sub2_Sub3_6 = null;
		aClass49_1361 = null;
		aClass49_1364 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!vg;I)Lclient!vg;")
	public static Class85 method2348(@OriginalArg(0) Class85 arg0) {
		@Pc(7) Class85 local7 = Static3.method46(arg0);
		if (local7 == null) {
			local7 = arg0.aClass85_15;
		}
		return local7;
	}
}
