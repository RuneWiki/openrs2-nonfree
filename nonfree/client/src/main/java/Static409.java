import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!np", name = "H", descriptor = "J")
	public static long aLong206;

	@OriginalMember(owner = "client!np", name = "J", descriptor = "Lclient!gga;")
	public static Class124 aClass124_84;

	@OriginalMember(owner = "client!np", name = "Q", descriptor = "I")
	public static int anInt7631;

	@OriginalMember(owner = "client!np", name = "R", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!np", name = "K", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_77 = new Class341(66, -1);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IBIII)V")
	public static void method6744(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static427.anInt7845 <= arg2 && arg2 <= Static631.anInt10922) {
			@Pc(19) int local19 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1);
			@Pc(25) int local25 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg3);
			Static615.method9218(arg0, arg2, local19, local25);
		}
	}
}
