import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
	public static int anInt4268;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "Z")
	public static boolean aBoolean342 = false;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Z")
	public static boolean method3727(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3728(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = (local17 << 5) + arg0.charAt(local19) - local17;
		}
		return local17;
	}
}
