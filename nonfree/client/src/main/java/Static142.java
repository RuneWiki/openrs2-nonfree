import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
	public static int anInt5305;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)I")
	public static int method4584(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(29) int local29 = (local18 & 0x33333333) + (local18 >>> 2 & 0x33333333);
		@Pc(37) int local37 = (local29 >>> 4) + local29 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
