import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "Lclient!h;")
	public static final Class114 aClass114_151 = new Class114("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_108 = new Class186(35, -1);

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
	public static int anInt7959 = 1;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Z")
	public static boolean method6765(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)Z")
	public static boolean method6767(@OriginalArg(1) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V")
	public static void method6768() {
		@Pc(9) int local9 = (int) ((double) Static542.anInt9387 * 34.46D);
		local9 <<= 0x0;
		if (Static478.aClass9_10.method7579()) {
			local9 += 128;
		}
		Static478.aClass9_10.ta(50, local9);
	}
}
