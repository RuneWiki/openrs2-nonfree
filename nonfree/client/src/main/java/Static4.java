import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Lclient!ya;")
	public static Class19 aClass19_34;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
	public static int anInt5935;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "[I")
	public static final int[] anIntArray415 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_277 = new Class22(81, -2);

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_121 = new Class83("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
	public static void method4663(@OriginalArg(0) int arg0) {
		Static71.anInt6920 = -1;
		Static127.anInt2674 = -1;
		Static314.anInt5471 = arg0;
		Static394.method5160();
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V")
	public static void method4664() {
		@Pc(5) Class68 local5 = Static442.aClass68_58;
		synchronized (Static442.aClass68_58) {
			Static442.aClass68_58.method1791();
		}
		local5 = Static190.aClass68_20;
		synchronized (Static190.aClass68_20) {
			Static190.aClass68_20.method1791();
		}
	}
}
