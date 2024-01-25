import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "Lclient!an;")
	public static Class16 aClass16_97;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_213 = new Class88("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
	public static int anInt7493 = 0;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
	public static int anInt7494 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
	public static void method6239(@OriginalArg(0) byte arg0) {
		if (Static245.aByteArrayArrayArray19 == null) {
			Static245.aByteArrayArrayArray19 = new byte[4][Static37.anInt7512][Static329.anInt6247];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(24) int local24 = 0; local24 < Static37.anInt7512; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static329.anInt6247; local28++) {
					Static245.aByteArrayArrayArray19[local20][local24][local28] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
	public static void method6241() {
		Static421.aClass73_66 = new Class73();
	}
}
