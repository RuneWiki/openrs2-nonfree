import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!pb;")
	public static Class71 aClass71_26;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "Lclient!s;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
	public static final int[] anIntArray254 = new int[128];

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1011 = Static151.method2243("_");

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public static int anInt2873 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ID)V")
	public static void method2038(@OriginalArg(1) double arg0) {
		if (Static3.aDouble4 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static30.anIntArray62[local7] = local19 > 255 ? 255 : local19;
		}
		Static3.aDouble4 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLclient!ii;I)Lclient!mb;")
	public static Class62 method2039(@OriginalArg(1) Class47 arg0, @OriginalArg(2) int arg1) {
		if (!Static35.method607(arg1, Static155.method2304(arg0)) && arg0.anObjectArray17 == null) {
			return null;
		} else if (arg0.aClass62Array55 == null || arg1 >= arg0.aClass62Array55.length || arg0.aClass62Array55[arg1] == null || arg0.aClass62Array55[arg1].method1846().method1878() == 0) {
			return Static172.aBoolean27 ? Static169.method2460(new Class62[] { Static68.aClass62_481, Static119.method1865(arg1) }) : null;
		} else {
			return arg0.aClass62Array55[arg1];
		}
	}
}
