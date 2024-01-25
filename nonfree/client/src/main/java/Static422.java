import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!rd", name = "hb", descriptor = "Lclient!pg;")
	public static final Class241 aClass241_1 = Static270.method6582();

	@OriginalMember(owner = "client!rd", name = "ib", descriptor = "Lclient!it;")
	public static final Class149 aClass149_6 = new Class149();

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)Lclient!we;")
	public static Class30_Sub2 method6540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static120.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass30_Sub2_1;
	}
}
