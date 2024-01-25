import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	public static int anInt4311;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
	public static int anInt4316;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_24 = new Class8();

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
	public static int anInt4315 = 0;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
	public static void method3607() {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			Static192.aClass295Array2[local10] = null;
		}
		Static411.anInt7120 = 0;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(CZ)Z")
	public static boolean method3608(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
