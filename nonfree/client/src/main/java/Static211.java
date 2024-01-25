import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!iaa", name = "x", descriptor = "I")
	public static int anInt8485;

	@OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
	public static int anInt8487;

	@OriginalMember(owner = "client!iaa", name = "t", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_138 = new Class287(62, -1);

	@OriginalMember(owner = "client!iaa", name = "u", descriptor = "I")
	public static int anInt8483 = -1;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILclient!ie;)Lclient!pg;")
	public static Class46 method6660(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(12) int local12 = arg0.method6811();
		@Pc(19) Class154 local19 = Static447.method6195()[arg0.method6814()];
		@Pc(26) Class201 local26 = Static342.method4995()[arg0.method6814()];
		@Pc(30) int local30 = arg0.method6789();
		@Pc(34) int local34 = arg0.method6789();
		return new Class46(local12, local19, local26, local30, local34);
	}
}
