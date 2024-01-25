import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "Z")
	public static final boolean aBoolean76 = false;

	@OriginalMember(owner = "client!bo", name = "K", descriptor = "Lclient!mi;")
	public static final Class232 aClass232_1 = new Class232();

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!es;I)Lclient!ii;")
	public static Class166 method1007(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(7) String local7 = arg0.method8853();
		@Pc(14) Class291 local14 = Static305.method4279()[arg0.method8865()];
		@Pc(21) Class125 local21 = Static640.method8546()[arg0.method8865()];
		@Pc(25) int local25 = arg0.method8834();
		@Pc(29) int local29 = arg0.method8834();
		@Pc(33) int local33 = arg0.method8865();
		@Pc(37) int local37 = arg0.method8865();
		@Pc(41) int local41 = arg0.method8865();
		@Pc(45) int local45 = arg0.method8859();
		@Pc(49) int local49 = arg0.method8859();
		@Pc(53) int local53 = arg0.method8850();
		@Pc(62) int local62 = arg0.method8850();
		@Pc(66) int local66 = arg0.method8850();
		return new Class166(local7, local14, local21, local25, local29, local33, local37, local41, local45, local49, local53, local62, local66);
	}
}
