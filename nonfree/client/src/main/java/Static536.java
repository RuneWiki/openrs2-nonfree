import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!uo", name = "F", descriptor = "[I")
	public static int[] anIntArray681;

	@OriginalMember(owner = "client!uo", name = "P", descriptor = "Lclient!mn;")
	public static Class227 aClass227_4;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!mo;B)Lclient!tfa;")
	public static Class54 method7335(@OriginalArg(0) Class1_Sub35 arg0) {
		@Pc(10) Class335 local10 = Static119.method1872()[arg0.method5750()];
		@Pc(17) Class122 local17 = Static20.method239()[arg0.method5750()];
		@Pc(21) int local21 = arg0.method5738();
		@Pc(25) int local25 = arg0.method5738();
		@Pc(37) int local37 = arg0.method5771();
		@Pc(41) int local41 = arg0.method5771();
		@Pc(45) int local45 = arg0.method5738();
		@Pc(49) int local49 = arg0.method5804();
		@Pc(53) int local53 = arg0.method5804();
		return new Class54(local10, local17, local21, local25, local37, local41, local45, local49, local53);
	}
}
