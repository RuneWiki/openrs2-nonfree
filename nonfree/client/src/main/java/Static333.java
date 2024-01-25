import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
	public static int anInt5336;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[1000][];

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	public static int anInt5333 = -1;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Lclient!d;")
	public static final Class44 aClass44_52 = new Class44(8);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method4129(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static150.anInt2695; local11++) {
			if (arg0.equalsIgnoreCase(Static263.aStringArray31[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static417.aStringArray44[local11])) {
				return true;
			}
		}
		return false;
	}
}
