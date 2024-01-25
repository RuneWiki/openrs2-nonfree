import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static250 {

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
	public static int anInt4755 = 0;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IBI)Z")
	public static boolean method4363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
