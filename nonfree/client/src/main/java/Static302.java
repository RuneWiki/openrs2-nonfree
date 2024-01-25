import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!am;")
	public static Class11 aClass11_134;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
	public static int anInt6099 = 0;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
	public static int anInt6100 = 0;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public static final int anInt6103 = -1;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)V")
	public static void method5118(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub1_Sub8 local12 = Static155.method2994(arg0, 12);
		local12.method2034();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!am;I)V")
	public static void method5120(@OriginalArg(0) Class11 arg0) {
		Static298.aClass11_132 = arg0;
	}
}
