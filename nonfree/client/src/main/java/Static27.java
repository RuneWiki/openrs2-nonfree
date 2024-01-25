import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static27 {

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!lm;")
	public static Class134 aClass134_96;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
	public static int anInt4213 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
	public static void method3641() {
		Static58.aClass1_Sub31_Sub3_1.method4731();
		Static49.anInt5279 = 1;
		Static9.aClass134_3 = null;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IC)C")
	public static char method3643(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}
}
