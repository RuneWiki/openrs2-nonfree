import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "[J")
	public static long[] aLongArray15;

	@OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
	public static int anInt9925 = 0;

	@OriginalMember(owner = "client!vaa", name = "i", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_172 = new Class145(80, -1);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIII)I")
	public static int method8435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg2;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZI)I")
	public static int method8437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}
}
