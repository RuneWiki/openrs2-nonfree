import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static225 {

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	public static int anInt4852;

	@OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
	public static int anInt4875 = 0;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(III)Z")
	public static boolean method4080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
