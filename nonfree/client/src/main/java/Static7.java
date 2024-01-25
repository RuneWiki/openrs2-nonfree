import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "Lclient!mo;")
	public static Class143 aClass143_7;

	@OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
	public static int anInt190;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
	public static int anInt180 = 0;

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString5 = "Continue";

	@OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
	public static int anInt191 = 0;

	@OriginalMember(owner = "client!ak", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray5 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I")
	public static int method205() {
		return Static270.anInt5147;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
	public static void method206() {
		for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
			Static338.aBooleanArray29[local15] = true;
		}
	}
}
