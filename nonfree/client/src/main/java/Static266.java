import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static266 {

	@OriginalMember(owner = "client!jc", name = "Hb", descriptor = "I")
	public static final int anInt4667 = -1;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(BII)Z")
	public static boolean method3896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
