import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_239 = new Class359(123, 2);

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!mc;B)Lclient!ci;")
	public static Class62 method8436(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(7) int local7 = arg0.method7816();
		@Pc(14) Class275 local14 = Static393.method5771()[arg0.method7816()];
		@Pc(26) Class81 local26 = Static584.method8024()[arg0.method7816()];
		@Pc(30) int local30 = arg0.method7849();
		@Pc(34) int local34 = arg0.method7849();
		@Pc(38) int local38 = arg0.method7860();
		@Pc(42) int local42 = arg0.method7860();
		@Pc(46) int local46 = arg0.method7804();
		@Pc(50) int local50 = arg0.method7804();
		@Pc(54) int local54 = arg0.method7804();
		@Pc(65) boolean local65 = arg0.method7816() == 1;
		return new Class62(local7, local14, local26, local30, local34, local38, local42, local46, local50, local54, local65);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(CB)Z")
	public static boolean method8438(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
