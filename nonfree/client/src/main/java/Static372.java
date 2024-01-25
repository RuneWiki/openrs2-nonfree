import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z")
	public static boolean method5966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static467.method7079(arg1, arg0) | (arg1 & 0x40000) != 0 || Static363.method5856(arg1, arg0);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!un;I)Lclient!sea;")
	public static Class194 method5972(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method4936();
		@Pc(16) Class258 local16 = Static240.method7436()[arg0.method4905()];
		@Pc(28) Class250 local28 = Static215.method3573()[arg0.method4905()];
		@Pc(32) int local32 = arg0.method4946();
		@Pc(36) int local36 = arg0.method4946();
		return new Class194(local7, local16, local28, local32, local36);
	}
}
