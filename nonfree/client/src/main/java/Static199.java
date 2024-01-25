import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_39 = new Class236(75, 0);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method3282(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static504.method6951(Static525.method7179(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public static void method3284() {
		if (Static9.anInt148 != 3 && Static409.aClass43_3.anInt1149 != -1) {
			Static139.method2597(Static409.aClass43_3.aString27, Static409.aClass43_3.anInt1149);
		}
	}
}
