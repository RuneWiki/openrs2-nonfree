import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString24 = "";

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
	public static int anInt2534 = -1;

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
	public static int anInt2536 = -1;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2277(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static668.aStringArray42.length; local7++) {
			if (Static668.aStringArray42[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
