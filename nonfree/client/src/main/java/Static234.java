import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[100];

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V")
	public static void method4072() {
		if (Static180.anInt3707 <= 0) {
			Static489.aString98 = "";
			return;
		}
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < Static85.aStringArray17.length; local10++) {
			if (Static85.aStringArray17[local10].indexOf("--> ") != -1) {
				@Pc(22) int local22 = ~Static180.anInt3707;
				local8++;
				if (local22 == ~local8) {
					Static489.aString98 = Static85.aStringArray17[local10].substring(Static85.aStringArray17[local10].indexOf(">") + 2);
					break;
				}
			}
		}
	}
}
