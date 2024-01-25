import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ[S)[S")
	public static short[] method5060(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static597.method3728(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)I")
	public static int method5061() {
		return Static137.anInt2944;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZII[Lclient!n;)V")
	public static void method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class225[] arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg4.length; local7++) {
			@Pc(13) Class225 local13 = arg4[local7];
			if (local13 != null && arg1 == local13.anInt6559) {
				Static310.method5264(arg3, arg0, arg2, local13);
				Static116.method2477(arg0, arg3, local13);
				if (local13.anInt6506 - local13.anInt6529 < local13.anInt6485) {
					local13.anInt6485 = local13.anInt6506 - local13.anInt6529;
				}
				if (local13.anInt6485 < 0) {
					local13.anInt6485 = 0;
				}
				if (local13.anInt6563 > local13.anInt6489 - local13.anInt6521) {
					local13.anInt6563 = local13.anInt6489 - local13.anInt6521;
				}
				if (local13.anInt6563 < 0) {
					local13.anInt6563 = 0;
				}
				if (local13.anInt6508 == 0) {
					Static38.method489(arg2, local13);
				}
			}
		}
	}
}
