import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "Lclient!ja;")
	public static final Class158 aClass158_14 = new Class158(14, 0, 4, 1);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!qh;I)Lclient!tp;")
	public static Class94_Sub1 method6252(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) Class94 local7 = Static574.method7617(arg0);
		@Pc(11) int local11 = arg0.method3109();
		@Pc(20) int local20 = arg0.method3109();
		@Pc(24) int local24 = arg0.method3109();
		@Pc(28) int local28 = arg0.method3109();
		@Pc(32) int local32 = arg0.method3109();
		@Pc(36) int local36 = arg0.method3109();
		return new Class94_Sub1(local7.aClass300_13, local7.aClass140_15, local7.anInt8266, local7.anInt8265, local7.anInt8263, local7.anInt8262, local7.anInt8268, local7.anInt8269, local7.anInt8267, local11, local20, local24, local28, local32, local36);
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
	public static void method6253() {
		@Pc(9) int[] local9 = new int[Static517.aClass145_1.anInt4294];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static517.aClass145_1.anInt4294; local13++) {
			@Pc(20) Class339 local20 = Static517.aClass145_1.method3798(local13);
			if (local20.anInt8832 >= 0 || local20.lb >= 0) {
				local9[local11++] = local13;
			}
		}
		Static404.anIntArray546 = new int[local11];
		for (@Pc(45) int local45 = 0; local45 < local11; local45++) {
			Static404.anIntArray546[local45] = local9[local45];
		}
	}
}
