import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	public static int anInt2169 = 0;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "[I")
	public static final int[] anIntArray128 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "[I")
	public static final int[] anIntArray129 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
	public static void method1694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class101 local7 = Static409.aClass101ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class101 local28 = Static409.aClass101ArrayArrayArray3[local9][arg0][arg1] = Static409.aClass101ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte40--;
				for (@Pc(40) Class145 local40 = local28.aClass145_1; local40 != null; local40 = local40.aClass145_2) {
					@Pc(44) Class3_Sub2 local44 = local40.aClass3_Sub2_2;
					if (local44.aShort101 == arg0 && local44.aShort102 == arg1) {
						local44.aByte103--;
					}
				}
			}
		}
		if (Static409.aClass101ArrayArrayArray3[0][arg0][arg1] == null) {
			Static409.aClass101ArrayArrayArray3[0][arg0][arg1] = new Class101(0, arg0, arg1);
			Static409.aClass101ArrayArrayArray3[0][arg0][arg1].aByte43 = 1;
		}
		Static409.aClass101ArrayArrayArray3[0][arg0][arg1].aClass101_1 = local7;
		Static409.aClass101ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!uo;[[BZ)V")
	public static void method1695(@OriginalArg(0) Class115_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(15) int local15 = Static39.aByteArrayArray6.length;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(35) int local35 = (Static411.anIntArray508[local17] >> 8) * 64 - Static2.anInt6396;
				@Pc(46) int local46 = (Static411.anIntArray508[local17] & 0xFF) * 64 - Static348.anInt6273;
				Static280.method4210();
				arg0.method5998(Static126.aClass66_5, local35, Static209.aClass210Array2, local46, local23);
			}
		}
	}
}
