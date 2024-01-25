import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
	public static int anInt2420;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	public static int anInt2412 = 0;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
	public static final int anInt2419 = 1407;

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "Lclient!fh;")
	public static Class68 aClass68_17 = null;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
	public static int anInt2421 = 0;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method2241(@OriginalArg(0) Class68 arg0) {
		if (Static328.anInt6687 == arg0.anInt1858) {
			Static269.aBooleanArray29[arg0.anInt1839] = true;
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
	public static void method2244() {
		if (Static98.aClass37_5 != null) {
			Static98.aClass37_5.method3699();
			Static98.aClass37_5 = null;
			Static135.aClass71_2 = null;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)I")
	public static int method2245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg1;
		}
		@Pc(13) int local13 = 128 - arg0;
		@Pc(27) int local27 = arg0 * (arg2 & 0x7F) + (arg1 & 0x7F) * local13 >> 7;
		@Pc(41) int local41 = (arg1 & 0x380) * local13 + arg0 * (arg2 & 0x380) >> 7;
		@Pc(55) int local55 = (arg2 & 0xFC00) * arg0 + local13 * (arg1 & 0xFC00) >> 7;
		return local41 & 0x380 | local55 & 0xFC00 | local27 & 0x7F;
	}
}
