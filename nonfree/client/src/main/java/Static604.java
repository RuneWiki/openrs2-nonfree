import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	public static int anInt9535;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!qa;")
	public static Class109 aClass109_11;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "[I")
	public static final int[] anIntArray620 = new int[2048];

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
	public static int anInt9539 = -1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)I")
	public static int method8321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 + arg0 * 57;
		@Pc(23) int local23 = local17 << 13 ^ local17;
		@Pc(37) int local37 = local23 * (local23 * 15731 * local23 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local37 >> 19 & 0xFF;
	}
}
