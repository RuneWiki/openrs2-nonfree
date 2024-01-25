import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "[I")
	public static final int[] anIntArray284 = new int[64];

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZI)I")
	public static int method3245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 >> 31 & arg1 - 1;
		return local16 + (arg0 + (arg0 >>> 31)) % arg1;
	}
}
