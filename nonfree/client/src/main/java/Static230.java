import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Lclient!o;")
	public static Class80 aClass80_2;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
	public static int anInt3197;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Lclient!gj;")
	public static Class20_Sub3_Sub1 aClass20_Sub3_Sub1_3;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
	public static int anInt3198;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Lclient!mf;")
	public static Interface4 anInterface4_2;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
	public static int anInt3194 = 0;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "[I")
	public static int[] anIntArray331 = new int[2];

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "[Lclient!ab;")
	public static Class2[] aClass2Array2 = new Class2[50];

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1068 = Static186.method3527("Nehmen");

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!kg;")
	public static RuntimeException_Sub1 method2569(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString3 = local12.aString3 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public static void method2570(@OriginalArg(0) int arg0) {
		Static171.anIntArray375 = new int[arg0];
		anIntArray331 = new int[arg0];
		Static232.anIntArray509 = new int[arg0];
		Static172.anIntArray376 = new int[arg0];
		Static85.anIntArray138 = new int[arg0];
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZIII)V")
	public static void method2572(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static1.method31(arg0)) {
			Static175.method2902(arg3, Static54.aClass93ArrayArray1[arg0], arg1, -1, arg2);
		}
	}
}
