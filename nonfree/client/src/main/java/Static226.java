import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!jaa", name = "K", descriptor = "Lclient!fca;")
	public static Class97 aClass97_6;

	@OriginalMember(owner = "client!jaa", name = "B", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_45 = new Class160(23, 15);

	@OriginalMember(owner = "client!jaa", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!jaa", name = "H", descriptor = "I")
	public static int anInt3836 = 0;

	@OriginalMember(owner = "client!jaa", name = "J", descriptor = "Lclient!taa;")
	public static final Class300 aClass300_1 = new Class300();

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIZZI)Lclient!pq;")
	public static Class251 method3315(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) Class331 local5 = null;
		if (Static213.aClass320_2 != null) {
			local5 = new Class331(arg0, Static213.aClass320_2, Static220.aClass320Array1[arg0], 1000000);
		}
		Static329.aClass98_Sub1Array2[arg0] = Static372.aClass181_3.method3994(Static545.aClass331_4, local5, arg0);
		if (arg1) {
			Static329.aClass98_Sub1Array2[arg0].method4074();
		}
		return new Class251(Static329.aClass98_Sub1Array2[arg0], arg2, 1);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(CI)Z")
	public static boolean method3317(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(35) char[] local35 = Static486.aCharArray9;
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				@Pc(43) char local43 = local35[local37];
				if (local43 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
