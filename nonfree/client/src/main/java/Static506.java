import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "Lclient!cu;")
	public static Class61 aClass61_7;

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
	public static int anInt8542;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString81 = null;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!dc;I)V")
	public static void method7356(@OriginalArg(0) Class3_Sub9 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static645.anInt10266; local7++) {
			@Pc(13) int local13 = arg0.method5606();
			@Pc(17) int local17 = arg0.method5610();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static230.aClass354_Sub1Array1[local13] != null) {
				Static230.aClass354_Sub1Array1[local13].anInt9770 = local17;
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(B)Z")
	public static boolean method7359() {
		return Static285.anInt7798 > 0;
	}
}
