import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static477 {

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "[I")
	public static final int[] anIntArray633 = new int[8];

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IBI)Z")
	public static boolean method6910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
