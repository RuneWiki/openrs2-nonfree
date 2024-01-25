import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static424 {

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "[I")
	public static int[] anIntArray466;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)I")
	public static int method6488(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
