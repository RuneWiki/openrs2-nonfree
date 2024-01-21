import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fa", name = "gb", descriptor = "Lclient!sd;")
	public static Class60 aClass60_12;

	@OriginalMember(owner = "client!fa", name = "jb", descriptor = "Lclient!pf;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!fa", name = "kb", descriptor = "I")
	public static int anInt1437;

	@OriginalMember(owner = "client!fa", name = "ib", descriptor = "I")
	public static int anInt1436 = 127;

	@OriginalMember(owner = "client!fa", name = "lb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_901 = Static118.method2249("sch-Utteln:");

	@OriginalMember(owner = "client!fa", name = "pb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_902 = Static118.method2249("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!fa", name = "qb", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array19 = new Class65[200];

	@OriginalMember(owner = "client!fa", name = "rb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_903 = Static118.method2249("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!fa", name = "sb", descriptor = "I")
	public static int anInt1441 = 0;

	@OriginalMember(owner = "client!fa", name = "xb", descriptor = "[I")
	public static final int[] anIntArray130 = new int[50];

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)Lclient!cj;")
	public static Class1_Sub2_Sub6 method944(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub6 local10 = (Class1_Sub2_Sub6) Static49.aClass87_24.method3062((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static131.aClass60_26.method2340(arg0, 1);
		local10 = new Class1_Sub2_Sub6();
		if (local20 != null) {
			local10.method578(new Class1_Sub14(local20), arg0);
		}
		Static49.aClass87_24.method3068(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)Lclient!pf;")
	public static Class20 method945() {
		try {
			return (Class20) Class.forName("Class20_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class20_Sub1();
		}
	}
}
