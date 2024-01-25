import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
	public static int anInt4820;

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "Lclient!da;")
	public static Class25 aClass25_7;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Lclient!hd;")
	public static Class125 method4109(@OriginalArg(1) int arg0) {
		@Pc(12) Class125 local12 = (Class125) Static98.aClass112_12.method3640((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static310.aClass181_58.method5023(0, arg0);
		local12 = new Class125();
		if (local22 != null) {
			local12.method3951(new Class3_Sub15(local22));
		}
		local12.method3949();
		Static98.aClass112_12.method3636((long) arg0, local12);
		return local12;
	}
}
