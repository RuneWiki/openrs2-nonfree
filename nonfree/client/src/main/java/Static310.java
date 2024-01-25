import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!kf", name = "R", descriptor = "Lclient!fia;")
	public static Class45 aClass45_18;

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "[I")
	public static final int[] anIntArray306 = new int[50];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBII)I")
	public static int method4974(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(14) int local14 = 128 - arg2;
		@Pc(29) int local29 = local14 * (arg0 & 0x7F) + (arg1 & 0x7F) * arg2 >> 7;
		@Pc(44) int local44 = (arg0 & 0x380) * local14 + (arg1 & 0x380) * arg2 >> 7;
		@Pc(59) int local59 = (arg0 & 0xFC00) * local14 + arg2 * (arg1 & 0xFC00) >> 7;
		return local29 & 0x7F | local44 & 0x380 | local59 & 0xFC00;
	}
}
