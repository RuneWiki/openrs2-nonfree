import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "[I")
	public static int[] anIntArray633;

	@OriginalMember(owner = "client!wv", name = "zb", descriptor = "Lclient!tfa;")
	public static Class311 aClass311_2;

	@OriginalMember(owner = "client!wv", name = "dd", descriptor = "I")
	public static int anInt9653 = -1;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!io;I)Lclient!mga;")
	public static Class175 method7908(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(14) Class314 local14 = Static303.method7887()[arg0.method4393()];
		@Pc(21) Class103 local21 = Static208.method7270()[arg0.method4393()];
		@Pc(25) int local25 = arg0.method4391();
		@Pc(34) int local34 = arg0.method4391();
		@Pc(38) int local38 = arg0.method4426();
		@Pc(44) int local44 = arg0.method4426();
		@Pc(48) int local48 = arg0.method4391();
		@Pc(52) int local52 = arg0.method4371();
		@Pc(56) int local56 = arg0.method4371();
		return new Class175(local14, local21, local25, local34, local38, local44, local48, local52, local56);
	}
}
