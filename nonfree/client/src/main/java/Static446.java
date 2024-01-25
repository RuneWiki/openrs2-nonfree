import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!qv", name = "G", descriptor = "Lclient!bp;")
	public static Class39 aClass39_5;

	@OriginalMember(owner = "client!qv", name = "I", descriptor = "I")
	public static int anInt7473;

	@OriginalMember(owner = "client!qv", name = "F", descriptor = "I")
	public static int anInt7471 = -1;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!np;I)Lclient!ur;")
	public static Class342 method6233(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method5175();
		@Pc(19) Class63 local19 = Static407.method5865()[arg0.method5175()];
		@Pc(28) Class249 local28 = Static448.method7373()[arg0.method5175()];
		@Pc(32) int local32 = arg0.method5231();
		@Pc(36) int local36 = arg0.method5231();
		@Pc(40) int local40 = arg0.method5198();
		@Pc(44) int local44 = arg0.method5198();
		@Pc(48) int local48 = arg0.method5186();
		@Pc(52) int local52 = arg0.method5186();
		@Pc(56) int local56 = arg0.method5186();
		@Pc(67) boolean local67 = arg0.method5175() == 1;
		return new Class342(local7, local19, local28, local32, local36, local40, local44, local48, local52, local56, local67);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BII)I")
	public static int method6237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
