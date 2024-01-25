import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!si", name = "U", descriptor = "Z")
	public static boolean aBoolean613 = false;

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(III)B")
	public static byte method7300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7301(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static85.aStringArray9.length; local7++) {
			if (Static85.aStringArray9[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
