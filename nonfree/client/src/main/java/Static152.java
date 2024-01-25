import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_51 = new Class2(69, 7);

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
	public static int anInt2843 = 0;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ya;IIILclient!fr;)V")
	public static void method2292(@OriginalArg(0) Class51 arg0, @OriginalArg(4) Class85 arg1) {
		Static238.aClass85_27.method2008();
		if (Static314.aBoolean330) {
			return;
		}
		for (@Pc(23) Class7_Sub11 local23 = (Class7_Sub11) arg1.method2010(); local23 != null; local23 = (Class7_Sub11) arg1.method2000()) {
			@Pc(31) Class20 local31 = Static93.aClass62_4.method1481(local23.anInt1062);
			if (Static273.method3652(local31)) {
				@Pc(43) boolean local43 = Static316.method4107(local31, arg0, local23);
				if (local43) {
					Static206.method2971(local23, local31, arg0);
				}
			}
		}
	}
}
