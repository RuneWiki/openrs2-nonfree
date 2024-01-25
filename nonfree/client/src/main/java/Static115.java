import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
	public static int anInt2620 = 0;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)Z")
	public static boolean method2049() {
		return Static23.aClass56_1 != Static53.aClass56_2 || Static193.anInt3710 >= 2;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)Lclient!hc;")
	public static Class102 method2050(@OriginalArg(1) int arg0) {
		@Pc(15) Class102 local15 = (Class102) Static435.aClass171_58.method3941((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static359.aClass160_72.method3696(arg0, 0);
		local15 = new Class102();
		if (local25 != null) {
			local15.method2381(new Class2_Sub23(local25));
		}
		local15.method2384();
		Static435.aClass171_58.method3940((long) arg0, local15);
		return local15;
	}
}
