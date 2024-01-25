import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lh", name = "P", descriptor = "Lclient!hu;")
	public static Class21 aClass21_11;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ig;I)Lclient!k;")
	public static Class168 method5126(@OriginalArg(0) Class8_Sub8 arg0) {
		@Pc(7) String local7 = arg0.method8570();
		@Pc(14) Class173 local14 = Static148.method5412()[arg0.method8525()];
		@Pc(21) Class60 local21 = Static593.method8190()[arg0.method8525()];
		@Pc(25) int local25 = arg0.method8568();
		@Pc(29) int local29 = arg0.method8568();
		@Pc(33) int local33 = arg0.method8525();
		@Pc(37) int local37 = arg0.method8525();
		@Pc(41) int local41 = arg0.method8525();
		@Pc(45) int local45 = arg0.method8578();
		@Pc(56) int local56 = arg0.method8578();
		@Pc(62) int local62 = arg0.method8540();
		@Pc(68) int local68 = arg0.method8540();
		@Pc(72) int local72 = arg0.method8540();
		return new Class168(local7, local14, local21, local25, local29, local33, local37, local41, local45, local56, local62, local68, local72);
	}
}
