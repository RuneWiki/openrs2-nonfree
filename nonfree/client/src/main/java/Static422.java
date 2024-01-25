import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
	public static int[] anIntArray705;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!nf;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	public static void method6584() {
		if (Static486.aClass15_2 != null) {
			Static486.aClass15_2.method3560();
		}
		if (Static51.aClass15_1 != null) {
			Static51.aClass15_1.method3560();
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)V")
	public static void method6585(@OriginalArg(0) int arg0) {
		Static304.anInt5904 = arg0;
		Static227.aClass277_35.method7019();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)Lclient!rs;")
	public static Class1_Sub2_Sub16 method6588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class1_Sub2_Sub16 local20 = (Class1_Sub2_Sub16) Static388.aClass230_40.method6144((long) arg0 << 32 | (long) arg1);
		if (local20 == null) {
			local20 = new Class1_Sub2_Sub16(arg0, arg1);
			Static388.aClass230_40.method6139(local20.aLong251, local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)Z")
	public static boolean method6590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static216.method3996(arg1, arg0) || Static514.method7861(arg0, arg1);
	}
}
