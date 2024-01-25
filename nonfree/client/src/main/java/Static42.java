import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static42 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "[I")
	public static final int[] anIntArray492 = new int[2];

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Z")
	public static boolean aBoolean410 = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)Z")
	public static boolean method4657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
