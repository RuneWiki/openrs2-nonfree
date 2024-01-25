import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public static int anInt6812 = 0;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "Z")
	public static boolean aBoolean466 = true;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ji;I)Lclient!mea;")
	public static Class205 method5722(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(9) String local9 = arg0.method6044();
		@Pc(16) Class319 local16 = Static4.method161()[arg0.method6069()];
		@Pc(23) Class247 local23 = Static179.method6311()[arg0.method6069()];
		@Pc(29) int local29 = arg0.method6058();
		@Pc(33) int local33 = arg0.method6058();
		@Pc(37) int local37 = arg0.method6069();
		@Pc(41) int local41 = arg0.method6069();
		@Pc(52) int local52 = arg0.method6069();
		@Pc(56) int local56 = arg0.method6003();
		@Pc(60) int local60 = arg0.method6003();
		@Pc(64) int local64 = arg0.method6036();
		@Pc(68) int local68 = arg0.method6036();
		@Pc(72) int local72 = arg0.method6036();
		return new Class205(local9, local16, local23, local29, local33, local37, local41, local52, local56, local60, local64, local68, local72);
	}
}
