import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!sia", name = "A", descriptor = "I")
	public static int anInt9035;

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!jc;B)Lclient!sq;")
	public static Class58 method7902(@OriginalArg(0) Class6_Sub15 arg0) {
		@Pc(10) Class318 local10 = Static70.method932()[arg0.method3030()];
		@Pc(17) Class238 local17 = Static632.method8588()[arg0.method3030()];
		@Pc(21) int local21 = arg0.method2989();
		@Pc(25) int local25 = arg0.method2989();
		@Pc(29) int local29 = arg0.method3018();
		@Pc(33) int local33 = arg0.method3018();
		@Pc(37) int local37 = arg0.method2989();
		@Pc(41) int local41 = arg0.method3015();
		@Pc(45) int local45 = arg0.method3015();
		return new Class58(local10, local17, local21, local25, local29, local33, local37, local41, local45);
	}
}
