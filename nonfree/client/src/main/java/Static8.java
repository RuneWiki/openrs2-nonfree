import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public static int anInt3154;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
	public static final int[] anIntArray377 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)I")
	public static int method3297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(20) int local20 = 255 - local7;
		@Pc(38) int local38 = ((arg0 & 0xFF00FF) * local7 & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		return (((arg1 & 0xFF00FF) * local20 & 0xFF00FF00 | (arg1 & 0xFF00) * local20 & 0xFF0000) >>> 8) + local38;
	}
}
