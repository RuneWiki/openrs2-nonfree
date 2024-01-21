import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "B")
	public static byte aByte9;

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "Lclient!lg;")
	public static Class2_Sub2_Sub17_Sub1 aClass2_Sub2_Sub17_Sub1_4;

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
	public static int anInt3596;

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "[Lclient!ra;")
	public static final Class2_Sub3[] aClass2_Sub3Array1 = new Class2_Sub3[2048];

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
	public static int anInt3594 = 0;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)V")
	public static void method2690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static69.aClass2_Sub3_Sub1_2.method284(19);
		Static69.aClass2_Sub3_Sub1_2.method263(arg1);
		Static69.aClass2_Sub3_Sub1_2.method250(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
	public static void method2691() {
		Static137.aClass86_41.method2641();
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
	public static void method2692() {
		if (!Static142.aBoolean141) {
			return;
		}
		@Pc(11) Class5 local11 = Static201.method3053(Static146.anInt3041, Static50.anInt1300);
		if (local11 != null && local11.anObjectArray26 != null) {
			@Pc(20) Class2_Sub4 local20 = new Class2_Sub4();
			local20.anObjectArray27 = local11.anObjectArray26;
			local20.aClass5_3 = local11;
			Static89.method3267(local20);
		}
		Static142.aBoolean141 = false;
		Static121.method2085(local11);
	}
}
