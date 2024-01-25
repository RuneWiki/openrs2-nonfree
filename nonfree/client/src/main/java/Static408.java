import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!no", name = "e", descriptor = "I")
	public static int anInt6690 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)Z")
	public static boolean method5609(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III)Z")
	public static boolean method5610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
