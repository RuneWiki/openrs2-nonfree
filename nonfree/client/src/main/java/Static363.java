import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!mea", name = "t", descriptor = "Lclient!jq;")
	public static Class175 aClass175_2;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILclient!ib;)Lclient!kc;")
	public static Class63 method5389(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(7) int local7 = arg0.method8519();
		@Pc(14) Class219 local14 = Static67.method1093()[arg0.method8529()];
		@Pc(21) Class368 local21 = Static290.method4382()[arg0.method8529()];
		@Pc(25) int local25 = arg0.method8516();
		@Pc(37) int local37 = arg0.method8516();
		return new Class63(local7, local14, local21, local25, local37);
	}
}
