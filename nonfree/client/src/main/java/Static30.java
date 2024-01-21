import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!sd;")
	public static Class73 aClass73_444 = Static122.method531("Registrierter Benutzer");

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!mc;")
	public static Class52 aClass52_1 = new Class52();

	@OriginalMember(owner = "client!dd", name = "R", descriptor = "Lclient!sd;")
	public static Class73 aClass73_445 = Static122.method531("(U2");

	@OriginalMember(owner = "client!dd", name = "W", descriptor = "Lclient!sd;")
	public static Class73 aClass73_446 = Static122.method531("(U");

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "Lclient!sd;")
	public static Class73 aClass73_447 = Static122.method531("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public static void method577() {
		aClass73_446 = null;
		aClass73_444 = null;
		aClass73_447 = null;
		aClass73_445 = null;
		aClass52_1 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ff;I)Lclient!sd;")
	public static Class73 method578(@OriginalArg(0) Class3_Sub12 arg0) {
		return Static76.method1297(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIBI)V")
	public static void method579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class83 local9 = Static109.method1959(arg2, arg0);
		if (local9 != null && local9.anObjectArray11 != null) {
			@Pc(22) Class3_Sub17 local22 = new Class3_Sub17();
			local22.anObjectArray3 = local9.anObjectArray11;
			local22.aClass83_13 = local9;
			Static148.method2418(local22);
		}
		Static44.anInt1025 = arg1;
		Static159.aBoolean233 = true;
		Static115.anInt2750 = arg2;
		Static113.anInt2744 = arg0;
		Static60.method1104(local9);
	}
}
