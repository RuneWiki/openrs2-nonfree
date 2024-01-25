import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ni", name = "O", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_63 = new Class208(29, 3);

	@OriginalMember(owner = "client!ni", name = "V", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!ni", name = "W", descriptor = "I")
	public static int anInt5022 = 0;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)B")
	public static byte method3957(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IFILclient!bl;[BBIFIFIFF)V")
	public static void method3960(@OriginalArg(1) float arg0, @OriginalArg(3) Class27 arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(7) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) int arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
			Static181.method2417(arg3, arg6, arg1, arg0, arg4, arg5, local11, arg7, arg2);
			arg5 += 16384;
		}
	}

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V")
	public static void method3961() {
		if (Static257.aClass75_8.method5991()) {
			Static257.aClass75_8.method5988(Static291.aCanvas6);
			Static177.method2583();
			Static257.aClass75_8.method6020(Static291.aCanvas6);
			Static257.aClass75_8.method5964(Static291.aCanvas6);
		} else {
			Static357.method5001(Static404.anInt2752);
		}
		Static323.method4576();
	}
}
