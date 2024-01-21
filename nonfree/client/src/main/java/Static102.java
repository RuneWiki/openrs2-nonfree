import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!ef;")
	public static Class20 aClass20_9;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
	public static int[] anIntArray269 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_769 = Static8.method128("sl_arrows");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!fa;)V")
	public static void method2135(@OriginalArg(1) Class1_Sub1_Sub8_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static61.anIntArray157.length; local7++) {
			Static61.anIntArray157[local7] = 0;
		}
		@Pc(32) int local32;
		for (@Pc(22) int local22 = 0; local22 < 5000; local22++) {
			local32 = (int) ((double) 256 * Math.random() * 128.0D);
			Static61.anIntArray157[local32] = (int) (Math.random() * 256.0D);
		}
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(61) int local61;
		for (local32 = 0; local32 < 20; local32++) {
			for (local49 = 1; local49 < 255; local49++) {
				for (local53 = 1; local53 < 127; local53++) {
					local61 = (local49 << 7) + local53;
					Static86.anIntArray232[local61] = (Static61.anIntArray157[local61 + 1] + Static61.anIntArray157[local61 - 1] + Static61.anIntArray157[local61 - 128] + Static61.anIntArray157[local61 + 128]) / 4;
				}
			}
			@Pc(107) int[] local107 = Static61.anIntArray157;
			Static61.anIntArray157 = Static86.anIntArray232;
			Static86.anIntArray232 = local107;
		}
		if (arg0 == null) {
			return;
		}
		local49 = 0;
		for (local53 = 0; local53 < arg0.anInt1432; local53++) {
			for (local61 = 0; local61 < arg0.anInt1435; local61++) {
				if (arg0.aByteArray7[local49++] != 0) {
					@Pc(142) int local142 = arg0.anInt1433 + local61 + 16;
					@Pc(150) int local150 = local53 + arg0.anInt1431 + 16;
					@Pc(156) int local156 = (local150 << 7) + local142;
					Static61.anIntArray157[local156] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method2136() {
		anIntArray269 = null;
		aClass18_769 = null;
		aClass20_9 = null;
	}
}
