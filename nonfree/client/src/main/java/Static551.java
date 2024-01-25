import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "Z")
	public static boolean aBoolean688;

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_106 = new Class208(73, 1);

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!ac;I)Lclient!bf;")
	public static Class23 method7500(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(10) Class259 local10 = Static179.method2831()[arg0.method7974()];
		@Pc(17) Class216 local17 = Static570.method7672()[arg0.method7974()];
		@Pc(21) int local21 = arg0.method7975();
		@Pc(25) int local25 = arg0.method7975();
		@Pc(29) int local29 = arg0.method7945();
		@Pc(33) int local33 = arg0.method7945();
		@Pc(37) int local37 = arg0.method7975();
		@Pc(49) int local49 = arg0.method7940();
		@Pc(53) int local53 = arg0.method7940();
		return new Class23(local10, local17, local21, local25, local29, local33, local37, local49, local53);
	}
}
