import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "Lclient!iu;")
	public static Class181 aClass181_12;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Lclient!av;")
	public static Class20 aClass20_18 = null;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!rba;B)Lclient!rq;")
	public static Class327 method7552(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(7) int local7 = arg0.method5322(-67);
		@Pc(14) Class304 local14 = Static24.method9444()[arg0.method5322(-31)];
		@Pc(21) Class216 local21 = Static133.method2912()[arg0.method5322(-115)];
		@Pc(31) int local31 = arg0.method5281();
		@Pc(35) int local35 = arg0.method5281();
		@Pc(39) int local39 = arg0.method5272();
		@Pc(43) int local43 = arg0.method5272();
		@Pc(47) int local47 = arg0.method5312();
		@Pc(51) int local51 = arg0.method5312();
		@Pc(55) int local55 = arg0.method5312();
		@Pc(67) boolean local67 = arg0.method5322(-37) == 1;
		return new Class327(local7, local14, local21, local31, local35, local39, local43, local47, local51, local55, local67);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)Lclient!ei;")
	public static Class92 method7553() {
		return new Class92(1, false);
	}
}
