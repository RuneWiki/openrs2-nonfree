import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "[I")
	public static int[] anIntArray411;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Lclient!bc;")
	public static Class10 aClass10_4;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "Lclient!bc;")
	public static Class10 aClass10_5;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
	public static int anInt4653;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1317 = Static81.method1507("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1318 = Static81.method1507("");

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	public static int anInt4650 = 0;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "[I")
	public static final int[] anIntArray412 = new int[500];

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1319 = Static81.method1507("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)Lclient!bg;")
	public static Class1_Sub2_Sub4 method3539(@OriginalArg(1) int arg0) {
		@Pc(19) Class1_Sub2_Sub4 local19 = (Class1_Sub2_Sub4) Static82.aClass86_29.method2816((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(29) byte[] local29 = Static67.aClass69_20.method2208(5, arg0);
		local19 = new Class1_Sub2_Sub4();
		if (local29 != null) {
			local19.method368(new Class1_Sub7(local29));
		}
		Static82.aClass86_29.method2821(local19, (long) arg0);
		return local19;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!fj;)Lclient!hd;")
	public static Class22_Sub3 method3541(@OriginalArg(1) Class1_Sub7 arg0) {
		return new Class22_Sub3(arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2779(), arg0.method2745(), arg0.method2771());
	}
}
