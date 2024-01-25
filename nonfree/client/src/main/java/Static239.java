import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
	public static int anInt6165;

	@OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
	public static final int anInt6167 = -13423323;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIII)I")
	public static int method5166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg2;
		}
		@Pc(13) int local13 = 128 - arg0;
		@Pc(32) int local32 = (arg2 & 0x7F) * local13 + arg0 * (arg1 & 0x7F) >> 7;
		@Pc(46) int local46 = (arg1 & 0x380) * arg0 + (arg2 & 0x380) * local13 >> 7;
		@Pc(60) int local60 = local13 * (arg2 & 0xFC00) + (arg1 & 0xFC00) * arg0 >> 7;
		return local32 & 0x7F | local60 & 0xFC00 | local46 & 0x380;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
	public static void method5167() {
		if (Static165.anInt3370 != -1) {
			Static169.method3176(Static165.anInt3370, false, -1, -1);
			Static165.anInt3370 = -1;
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)V")
	public static void method5168(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static158.anInt3553 = arg0;
	}
}
