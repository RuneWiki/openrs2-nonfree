import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Lclient!dd;")
	public static Class16 aClass16_5;

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "Lclient!ea;")
	private static Class18 aClass18_278 = Static8.method128("Loaded config");

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_276 = aClass18_278;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!ea;")
	private static Class18 aClass18_277 = Static8.method128("Connecting to update server");

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "[I")
	public static int[] anIntArray72 = new int[128];

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
	public static int anInt1142 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ea", name = "V", descriptor = "Lclient!ea;")
	public static Class18 aClass18_279 = aClass18_277;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method721() {
		aClass16_5 = null;
		aClass18_279 = null;
		aClass18_278 = null;
		anIntArray72 = null;
		aClass18_277 = null;
		aClass18_276 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)I")
	public static int method728(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(32) int local32 = arg0;
		if (arg0 < 3 && (Static2.aByteArrayArrayArray1[1][local7][local11] & 0x2) == 2) {
			local32 = arg0 + 1;
		}
		@Pc(55) int local55 = arg2 & 0x7F;
		@Pc(83) int local83 = (128 - local55) * Static135.anIntArrayArrayArray5[local32][local7][local11] + Static135.anIntArrayArrayArray5[local32][local7 + 1][local11] * local55 >> 7;
		@Pc(87) int local87 = arg1 & 0x7F;
		@Pc(118) int local118 = (128 - local55) * Static135.anIntArrayArrayArray5[local32][local7][local11 + 1] + Static135.anIntArrayArrayArray5[local32][local7 + 1][local11 + 1] * local55 >> 7;
		return local83 * (128 - local87) + local118 * local87 >> 7;
	}
}
