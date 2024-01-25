import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!re", name = "M", descriptor = "Lclient!p;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!re", name = "E", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_141 = new Class119("M", "M", "M", "M");

	@OriginalMember(owner = "client!re", name = "H", descriptor = "[I")
	public static final int[] anIntArray403 = new int[5];

	@OriginalMember(owner = "client!re", name = "J", descriptor = "I")
	public static final int anInt5931 = 2;

	@OriginalMember(owner = "client!re", name = "L", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_150 = new Class12(112, -2);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(JB)V")
	public static void method4690(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIZII)V")
	public static void method4692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static223.anInt5857 = arg4;
		Static309.anInt5374 = arg3;
		Static145.anInt1966 = arg2;
		Static383.anInt6391 = arg1;
		Static260.anInt2259 = arg0;
		if (Static383.anInt6391 >= 100) {
			@Pc(22) int local22 = Static145.anInt1966 * 128 + 64;
			@Pc(28) int local28 = Static260.anInt2259 * 128 + 64;
			@Pc(36) int local36 = Static335.method4499(Static265.anInt4807, local22, local28) - Static309.anInt5374;
			@Pc(41) int local41 = local22 - Static213.anInt258;
			@Pc(46) int local46 = local36 - Static391.anInt6529;
			@Pc(51) int local51 = local28 - Static360.anInt6145;
			@Pc(62) int local62 = (int) Math.sqrt((double) (local51 * local51 + local41 * local41));
			Static340.anInt5790 = (int) (Math.atan2((double) local46, (double) local62) * 2607.5945876176133D) & 0x3FFF;
			Static106.anInt2033 = (int) (Math.atan2((double) local41, (double) local51) * -2607.5945876176133D) & 0x3FFF;
			if (Static340.anInt5790 < 1024) {
				Static340.anInt5790 = 1024;
			}
			Static73.anInt1361 = 0;
			if (Static340.anInt5790 > 3072) {
				Static340.anInt5790 = 3072;
			}
		}
		Static333.anInt5693 = 2;
	}
}
