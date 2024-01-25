import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static573 {

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	public static int anInt10002;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "D")
	public static double aDouble23;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	public static int anInt10004 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Z")
	public static boolean method8708(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100100) != 0;
	}
}
