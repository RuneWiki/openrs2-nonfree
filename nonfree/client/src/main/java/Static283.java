import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!od", name = "u", descriptor = "I")
	public static int anInt4984 = -1;

	@OriginalMember(owner = "client!od", name = "v", descriptor = "I")
	public static int anInt4985 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)I")
	public static int method3904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xF;
		@Pc(21) int local21 = local7 < 8 ? arg3 : arg0;
		@Pc(40) int local40 = local7 < 4 ? arg0 : local7 == 12 || local7 == 14 ? arg3 : arg2;
		return ((local7 & 0x1) == 0 ? local21 : -local21) + ((local7 & 0x2) == 0 ? local40 : -local40);
	}
}
