import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!tba", name = "h", descriptor = "Lclient!ha;")
	public static Class2 aClass2_45;

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_115 = new Class306("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
	public static int anInt7785 = -1;

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
	public static int anInt7786 = -1;

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_332 = new Class296(7, -1);

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[8];

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZB)V")
	public static void method6476(@OriginalArg(0) boolean arg0) {
		for (@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) Static237.aClass37_49.method977(); local10 != null; local10 = (Class1_Sub10) Static237.aClass37_49.method971()) {
			if (local10.aClass1_Sub16_Sub2_2 != null) {
				Static411.aClass1_Sub16_Sub1_2.method2231(local10.aClass1_Sub16_Sub2_2);
				local10.aClass1_Sub16_Sub2_2 = null;
			}
			if (local10.aClass1_Sub16_Sub2_3 != null) {
				Static411.aClass1_Sub16_Sub1_2.method2231(local10.aClass1_Sub16_Sub2_3);
				local10.aClass1_Sub16_Sub2_3 = null;
			}
			local10.method7525();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(51) Class1_Sub10 local51 = (Class1_Sub10) Static487.aClass37_88.method977(); local51 != null; local51 = (Class1_Sub10) Static487.aClass37_88.method971()) {
			if (local51.aClass1_Sub16_Sub2_2 != null) {
				Static411.aClass1_Sub16_Sub1_2.method2231(local51.aClass1_Sub16_Sub2_2);
				local51.aClass1_Sub16_Sub2_2 = null;
			}
			local51.method7525();
		}
		for (@Pc(78) Class1_Sub10 local78 = (Class1_Sub10) Static403.aClass17_31.method735(); local78 != null; local78 = (Class1_Sub10) Static403.aClass17_31.method740()) {
			if (local78.aClass1_Sub16_Sub2_2 != null) {
				Static411.aClass1_Sub16_Sub1_2.method2231(local78.aClass1_Sub16_Sub2_2);
				local78.aClass1_Sub16_Sub2_2 = null;
			}
			local78.method7525();
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
	public static void method6477() {
		@Pc(12) byte[] local12;
		if (Static68.anObject3 == null) {
			@Pc(5) Class6_Sub2_Sub2 local5 = new Class6_Sub2_Sub2();
			local12 = local5.method5198();
			Static68.anObject3 = Static489.method6710(local12);
		}
		if (Static66.anObject2 == null) {
			@Pc(32) Class6_Sub1_Sub2 local32 = new Class6_Sub1_Sub2();
			local12 = local32.method6058();
			Static66.anObject2 = Static489.method6710(local12);
		}
	}
}
