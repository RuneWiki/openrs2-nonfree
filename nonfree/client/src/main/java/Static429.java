import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_156 = new Class275();

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!dga;)Lclient!wu;")
	public static Class349 method6254(@OriginalArg(1) Class6_Sub14 arg0) {
		@Pc(7) String local7 = arg0.method5991();
		@Pc(16) Class277 local16 = Static478.method6658()[arg0.method6041()];
		@Pc(23) Class137 local23 = Static344.method5181()[arg0.method6041()];
		@Pc(36) int local36 = arg0.method6008();
		@Pc(40) int local40 = arg0.method6008();
		@Pc(44) int local44 = arg0.method6027();
		@Pc(48) int local48 = arg0.method6027();
		return new Class349(local7, local16, local23, local36, local40, local44, local48);
	}
}
