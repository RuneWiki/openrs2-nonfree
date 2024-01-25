import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "Lclient!pe;")
	public static Class254 aClass254_49;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_33 = new Class230(26, 4);

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_45 = new Class276(15, 19);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!fd;I)Lclient!dq;")
	public static Class68 method2901(@OriginalArg(0) Class3_Sub7 arg0) {
		@Pc(9) int local9 = arg0.method6538();
		@Pc(16) Class100 local16 = Static414.method6700()[arg0.method6538()];
		@Pc(23) Class237 local23 = Static557.method1636()[arg0.method6538()];
		@Pc(27) int local27 = arg0.method6525();
		@Pc(31) int local31 = arg0.method6525();
		@Pc(35) int local35 = arg0.method6535();
		@Pc(41) int local41 = arg0.method6535();
		@Pc(45) int local45 = arg0.method6497();
		@Pc(49) int local49 = arg0.method6497();
		@Pc(58) int local58 = arg0.method6497();
		@Pc(67) boolean local67 = arg0.method6538() == 1;
		return new Class68(local9, local16, local23, local27, local31, local35, local41, local45, local49, local58, local67);
	}
}
