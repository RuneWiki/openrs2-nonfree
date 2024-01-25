import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
	public static int anInt1040;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	public static int anInt1038 = 0;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
	public static int anInt1039 = 0;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "J")
	public static long aLong49 = 0L;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIBI)V")
	public static void method1017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(14) int local14 = arg0 << 3;
		Static409.aFloat135 = (float) local14;
		if (Static526.anInt8626 == 2) {
			Static21.anInt279 = local14;
			Static337.anInt5759 = local3;
			Static200.anInt4059 = 0;
		}
		Static135.aFloat51 = (float) local3;
		Static23.method264();
		Static114.aBoolean195 = true;
	}
}
