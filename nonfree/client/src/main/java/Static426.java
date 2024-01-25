import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
	public static int anInt7111;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
	public static int anInt7112;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Z")
	public static boolean aBoolean475 = false;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BB)Z")
	public static boolean method6182(@OriginalArg(1) byte arg0) {
		@Pc(16) int local16 = arg0 & 0xFF;
		if (local16 == 0) {
			return false;
		} else {
			return local16 < 128 || local16 >= 160 || Static85.aCharArray15[local16 - 128] != '\u0000';
		}
	}
}
