import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "[I")
	public static int[] anIntArray211;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "S")
	public static short aShort33 = 320;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)I")
	public static int method2136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return (arg0 + (arg0 >>> 31)) % arg1 + local11;
	}
}
