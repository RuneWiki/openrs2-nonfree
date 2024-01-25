import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ofa", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!ofa", name = "r", descriptor = "[I")
	public static final int[] anIntArray478 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIB)I")
	public static int method5432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)Z")
	public static boolean method5433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static169.method7350(arg0, arg1)) {
			return Static564.method7800(arg0, arg1) | (arg1 & 0xB000) != 0 | Static23.method346(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (Static391.method5695(arg1, arg0) | Static208.method3404(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(JJ)J")
	public static long method5434(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
