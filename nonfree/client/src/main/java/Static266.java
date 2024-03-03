import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Lclient!r;")
	public static Class197 aClass197_71;

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "Lclient!r;")
	public static Class197 aClass197_73;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)I", line = 3)
	public static int method5020(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)I", line = 32)
	public static int method5021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg2;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(31) int local31 = (arg1 & 0x7F) * arg0 + local17 * (arg2 & 0x7F) >> 7;
		@Pc(46) int local46 = (arg2 & 0x380) * local17 + arg0 * (arg1 & 0x380) >> 7;
		@Pc(65) int local65 = local17 * (arg2 & 0xFC00) + (arg1 & 0xFC00) * arg0 >> 7;
		return local65 & 0xFC00 | local46 & 0x380 | local31 & 0x7F;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!bh;IB)V", line = 61)
	public static void method5022(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) int arg2) {
		Static309.aClass21ArrayArray3[arg2][arg0] = arg1;
	}
}
