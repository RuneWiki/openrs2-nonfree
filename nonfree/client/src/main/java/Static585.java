import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_220 = new Class362(50, 5);

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "Lclient!waa;")
	public static final Class350 aClass350_41 = new Class350(64);

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
	public static int anInt9800 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!un;I)Lclient!eg;")
	public static Class85 method7996(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(13) int local13 = arg0.method4905();
		@Pc(20) Class258 local20 = Static240.method7436()[arg0.method4905()];
		@Pc(27) Class250 local27 = Static215.method3573()[arg0.method4905()];
		@Pc(31) int local31 = arg0.method4946();
		@Pc(35) int local35 = arg0.method4946();
		@Pc(39) int local39 = arg0.method4936();
		@Pc(45) int local45 = arg0.method4936();
		@Pc(49) int local49 = arg0.method4931();
		@Pc(53) int local53 = arg0.method4931();
		@Pc(57) int local57 = arg0.method4931();
		@Pc(66) boolean local66 = arg0.method4905() == 1;
		return new Class85(local13, local20, local27, local31, local35, local39, local45, local49, local53, local57, local66);
	}
}
