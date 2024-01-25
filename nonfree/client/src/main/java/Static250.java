import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	public static int anInt5229;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	public static int anInt5230;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_31 = new Class107(64);

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
	public static int anInt5225 = 0;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_157 = new Class157(50, 8);

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!rc;I)Z")
	public static boolean method4416(@OriginalArg(0) Interface8 arg0) {
		@Pc(9) Class74 local9 = Static228.method4210(arg0.method5502());
		if (local9.anInt2070 == -1) {
			return true;
		} else {
			@Pc(20) Class150 local20 = Static12.method176(local9.anInt2070);
			return local20.anInt5043 == -1 ? true : local20.method4289();
		}
	}
}
