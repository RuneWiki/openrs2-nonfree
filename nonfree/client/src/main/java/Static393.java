import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "[Lclient!hh;")
	public static Class6[] aClass6Array10;

	@OriginalMember(owner = "client!nda", name = "o", descriptor = "I")
	public static int anInt6534;

	@OriginalMember(owner = "client!nda", name = "s", descriptor = "I")
	public static int anInt6537;

	@OriginalMember(owner = "client!nda", name = "m", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_43 = new Class295(64);

	@OriginalMember(owner = "client!nda", name = "n", descriptor = "Lclient!qw;")
	public static final Class302 aClass302_44 = new Class302();

	@OriginalMember(owner = "client!nda", name = "p", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_64 = new Class240(11, 0);

	@OriginalMember(owner = "client!nda", name = "r", descriptor = "I")
	public static int anInt6536 = 0;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!dt;I)Lclient!dk;")
	public static Class82 method5488(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(7) int local7 = arg0.method7954();
		@Pc(14) Class266 local14 = Static404.method5594()[arg0.method7954()];
		@Pc(21) Class131 local21 = Static296.method4347()[arg0.method7954()];
		@Pc(25) int local25 = arg0.method7918();
		@Pc(34) int local34 = arg0.method7918();
		@Pc(38) int local38 = arg0.method7951();
		@Pc(42) int local42 = arg0.method7951();
		@Pc(46) int local46 = arg0.method7895();
		@Pc(50) int local50 = arg0.method7895();
		@Pc(54) int local54 = arg0.method7895();
		@Pc(63) boolean local63 = arg0.method7954() == 1;
		return new Class82(local7, local14, local21, local25, local34, local38, local42, local46, local50, local54, local63);
	}
}
