import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIII)I")
	public static int method1602(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class56.anIntArray120[arg1 * 8192 / arg0] >> 1;
		return (local21 * arg3 >> 16) + (arg2 * (65536 - local21) >> 16);
	}
}
