import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kk", name = "E", descriptor = "[I")
	public static int[] anIntArray253;

	@OriginalMember(owner = "client!kk", name = "I", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lclient!uf;")
	public static Class3_Sub7_Sub19 method4298() {
		@Pc(13) Class3_Sub7_Sub19 local13 = (Class3_Sub7_Sub19) Static477.aClass49_9.method1448();
		if (local13 != null) {
			local13.method8128();
			local13.method8136();
			return local13;
		}
		do {
			local13 = (Class3_Sub7_Sub19) Static4.aClass49_1.method1448();
			if (local13 == null) {
				return null;
			}
			if (local13.method7365() > Static96.method2000()) {
				return null;
			}
			local13.method8128();
			local13.method8136();
		} while ((Long.MIN_VALUE & local13.aLong263) == 0L);
		return local13;
	}
}
