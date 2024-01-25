import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray9;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "[I")
	public static int[] anIntArray498 = new int[2];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILclient!sl;)Lclient!nc;")
	public static Class237 method6388(@OriginalArg(1) Class2_Sub17 arg0) {
		@Pc(7) String local7 = arg0.method2833();
		@Pc(14) Class97 local14 = Static562.method7867()[arg0.method2859()];
		@Pc(21) Class252 local21 = Static186.method3192()[arg0.method2859()];
		@Pc(25) int local25 = arg0.method2836();
		@Pc(29) int local29 = arg0.method2836();
		@Pc(33) int local33 = arg0.method2859();
		@Pc(37) int local37 = arg0.method2859();
		@Pc(41) int local41 = arg0.method2859();
		@Pc(50) int local50 = arg0.method2825();
		@Pc(54) int local54 = arg0.method2825();
		@Pc(58) int local58 = arg0.method2881();
		@Pc(62) int local62 = arg0.method2881();
		@Pc(66) int local66 = arg0.method2881();
		return new Class237(local7, local14, local21, local25, local29, local33, local37, local41, local50, local54, local58, local62, local66);
	}
}
