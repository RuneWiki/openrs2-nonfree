import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public static int anInt23 = 0;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "J")
	public static long aLong1 = -1L;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	public static int anInt25 = -1;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
	public static final int[] anIntArray1 = new int[4096];

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "[I")
	public static final int[] anIntArray2 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method39() {
		Static515.aBoolean257 = true;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIII)V")
	public static void method42(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = Static502.anInt8530;
		@Pc(12) int local12 = Static270.anInt4267;
		if (Static305.aBoolean315) {
			local10 += Static304.method4150();
			local12 += Static563.method7702();
		}
		@Pc(33) Class59 local33;
		if (Static399.anInt6910 == 1) {
			local33 = Static237.aClass59Array7[Static269.anInt4253 / 100];
			local33.method8057(local10 - 8, local12 - 8);
			Static430.method7439(local12 - 8, local12 + -8 + local33.method8064(), local10 - 8, local10 + -8 + local33.method8053());
		}
		if (Static399.anInt6910 == 2) {
			local33 = Static237.aClass59Array7[Static269.anInt4253 / 100 + 4];
			local33.method8057(local10 - 8, local12 + -8);
			Static430.method7439(local12 - 8, local33.method8064() + local12 + -8, local10 - 8, local33.method8053() + local10 + -8);
		}
		Static242.method8205();
	}
}
