import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "Z")
	public static boolean aBoolean130;

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_16 = new Class71(102, 0);

	@OriginalMember(owner = "client!caa", name = "v", descriptor = "I")
	public static int anInt1902 = -1;

	@OriginalMember(owner = "client!caa", name = "y", descriptor = "I")
	public static int anInt1905 = 0;

	@OriginalMember(owner = "client!caa", name = "z", descriptor = "I")
	public static int anInt1906 = 0;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BII)I")
	public static int method1635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static144.anIntArray188[arg1 & 0x3] : Static487.anIntArray479[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(III)I")
	public static int method1642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(30) int local30 = Integer.MAX_VALUE & local16 * (local16 * 15731 * local16 + 789221) + 1376312589;
		return local30 >> 19 & 0xFF;
	}
}
