import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!e", name = "U", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_305 = Static120.method1824("Members only world");

	@OriginalMember(owner = "client!e", name = "M", descriptor = "Lclient!rd;")
	public static Class80 aClass80_301 = aClass80_305;

	@OriginalMember(owner = "client!e", name = "O", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_302 = Static120.method1824("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!e", name = "P", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_303 = Static120.method1824("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!e", name = "R", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_304 = Static120.method1824("event_opbase");

	@OriginalMember(owner = "client!e", name = "T", descriptor = "I")
	public static int anInt855 = 0;

	@OriginalMember(owner = "client!e", name = "V", descriptor = "I")
	public static int anInt856 = 0;

	@OriginalMember(owner = "client!e", name = "W", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_306 = Static120.method1824("Lade Texturen )2 ");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)Lclient!tg;")
	public static Class3_Sub1_Sub16 method590(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub16 local10 = (Class3_Sub1_Sub16) Static161.aClass5_49.method139((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static34.aClass1_5.method60(3, arg0);
		local10 = new Class3_Sub1_Sub16();
		if (local25 != null) {
			local10.method2806(new Class3_Sub17(local25));
		}
		Static161.aClass5_49.method145(local10, (long) arg0);
		return local10;
	}
}
