import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "Lclient!ew;")
	public static Class99 aClass99_4;

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "Lclient!mv;")
	public static Class229 aClass229_45;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "J")
	public static final long aLong86 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "Lclient!pca;")
	public static final Class263 aClass263_2 = new Class263();

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_38 = new Class154(28, 2);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2415(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static598.method4261(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Lclient!sda;")
	public static Class2_Sub2_Sub18 method2416() {
		@Pc(13) Class2_Sub2_Sub18 local13 = (Class2_Sub2_Sub18) Static544.aClass253_11.method5321();
		if (local13 != null) {
			local13.method7657();
			local13.method7659();
			return local13;
		}
		do {
			local13 = (Class2_Sub2_Sub18) Static11.aClass253_1.method5321();
			if (local13 == null) {
				return null;
			}
			if (local13.method6221() > Static362.method5133()) {
				return null;
			}
			local13.method7657();
			local13.method7659();
		} while ((local13.aLong269 & Long.MIN_VALUE) == 0L);
		return local13;
	}
}
