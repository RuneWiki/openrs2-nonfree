import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_35 = new Class132(32);

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_63 = new Class134("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
	public static void method3276() {
		if (Static290.anInt4777 == 8) {
			Static37.method5022(4);
		} else if (Static290.anInt4777 == 4 || Static290.anInt4777 == 5) {
			Static37.method5022(2);
		} else if (Static290.anInt4777 == 11) {
			Static37.method5022(2);
			return;
		}
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(FFZF)I")
	public static int method3279(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(30) float local30 = arg0 < 0.0F ? -arg0 : arg0;
		if (local21 > local12 && local21 > local30) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local30 > local12 && local30 > local21) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
