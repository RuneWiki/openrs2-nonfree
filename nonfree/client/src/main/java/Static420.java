import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!pv", name = "F", descriptor = "Lclient!wba;")
	public static Class356 aClass356_1;

	@OriginalMember(owner = "client!pv", name = "D", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_52 = new Class6(8);

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)Z")
	public static boolean method5989() {
		@Pc(7) boolean local7 = true;
		if (Static70.aClass279_2 == null) {
			if (Static552.aClass322_150.method6797(Static519.anInt8368)) {
				Static70.aClass279_2 = Static604.method6152(Static552.aClass322_150, Static519.anInt8368);
			} else {
				local7 = false;
			}
		}
		if (Static3.aClass279_4 == null) {
			if (Static552.aClass322_150.method6797(Static282.anInt4862)) {
				Static3.aClass279_4 = Static604.method6152(Static552.aClass322_150, Static282.anInt4862);
			} else {
				local7 = false;
			}
		}
		if (Static453.aClass279_5 == null) {
			if (Static552.aClass322_150.method6797(Static350.anInt6082)) {
				Static453.aClass279_5 = Static604.method6152(Static552.aClass322_150, Static350.anInt6082);
			} else {
				local7 = false;
			}
		}
		if (Static11.aClass134_2 == null) {
			if (Static154.aClass322_61.method6797(Static579.anInt9367)) {
				Static11.aClass134_2 = Static149.method2843(Static579.anInt9367, Static154.aClass322_61);
			} else {
				local7 = false;
			}
		}
		if (Static108.aClass279Array4 == null) {
			if (Static552.aClass322_150.method6797(Static579.anInt9367)) {
				Static108.aClass279Array4 = Static604.method6158(Static552.aClass322_150, Static579.anInt9367);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
