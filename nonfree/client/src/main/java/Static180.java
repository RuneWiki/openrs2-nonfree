import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gs", name = "U", descriptor = "I")
	public static int anInt3952;

	@OriginalMember(owner = "client!gs", name = "L", descriptor = "[I")
	public static final int[] anIntArray161 = new int[1000];

	@OriginalMember(owner = "client!gs", name = "W", descriptor = "I")
	public static int anInt3953 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!ie;)Lclient!eaa;")
	public static Class79 method3205(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(7) int local7 = arg0.method6814();
		@Pc(19) Class154 local19 = Static447.method6195()[arg0.method6814()];
		@Pc(26) Class201 local26 = Static342.method4995()[arg0.method6814()];
		@Pc(30) int local30 = arg0.method6789();
		@Pc(36) int local36 = arg0.method6789();
		@Pc(40) int local40 = arg0.method6811();
		@Pc(44) int local44 = arg0.method6811();
		@Pc(48) int local48 = arg0.method6816();
		@Pc(52) int local52 = arg0.method6816();
		@Pc(58) int local58 = arg0.method6816();
		@Pc(69) boolean local69 = arg0.method6814() == 1;
		return new Class79(local7, local19, local26, local30, local36, local40, local44, local48, local52, local58, local69);
	}
}
