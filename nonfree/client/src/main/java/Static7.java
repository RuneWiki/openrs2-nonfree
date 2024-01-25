import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
	public static int anInt96;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIB)Z")
	public static boolean method111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method112(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static495.aStringArray71.length; local12++) {
			if (Static495.aStringArray71[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
