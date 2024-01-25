import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public static void method3806() {
		if (!Static47.aBoolean59) {
			return;
		}
		@Pc(11) Class265 local11 = Static212.method3145(Static376.anInt5867, Static284.anInt4811);
		if (local11 != null && local11.anObjectArray30 != null) {
			@Pc(20) Class3_Sub53 local20 = new Class3_Sub53();
			local20.anObjectArray35 = local11.anObjectArray30;
			local20.aClass265_16 = local11;
			Static250.method3767(local20);
		}
		Static454.anInt7316 = -1;
		Static47.aBoolean59 = false;
		Static530.anInt8325 = -1;
		if (local11 != null) {
			Static218.method3194(local11);
		}
	}
}
