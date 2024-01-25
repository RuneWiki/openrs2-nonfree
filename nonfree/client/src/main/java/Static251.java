import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_58 = new Class146(36, -1);

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "[I")
	public static final int[] anIntArray346 = new int[5];

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "Lclient!ub;")
	public static final Class244 aClass244_19 = new Class244();

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
	public static int anInt4167 = -1;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIB)Z")
	public static boolean method3312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static396.method5234(arg0, arg1) | (arg0 & 0x800) != 0 || Static107.method1597(arg1, arg0);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)V")
	public static void method3313() {
		Static86.aClass61_1.method4571();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static333.aLongArray8[local10] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static29.aLongArray2[local27] = 0L;
		}
		Static126.anInt2200 = 0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
	public static void method3315(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static265.anInt4371 - Static264.anInt4366;
		if (local8 >= 100) {
			Static97.anInt1791 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static439.aFloat99;
		if (Static345.anInt5731 >> 8 > local19) {
			local19 = Static345.anInt5731 >> 8;
		}
		if (Static72.aBooleanArray6[4] && Static302.anIntArray394[4] + 128 > local19) {
			local19 = Static302.anIntArray394[4] + 128;
		}
		@Pc(56) int local56 = (int) Static109.aFloat75 + Static206.anInt4096 & 0x3FFF;
		Static36.method497(Static371.anInt5975, local56, arg0, Static94.method4425(Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343, Static68.anInt1387, Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339) - 50, local19, (local19 >> 3) * 3 + 600 << 0, Static196.anInt3536);
		@Pc(102) float local102 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static133.anInt2435 = (int) ((float) Static285.anInt4686 + local102 * (float) (Static133.anInt2435 - Static285.anInt4686));
		Static393.anInt7135 = (int) ((float) Static134.anInt2447 + (float) (Static393.anInt7135 - Static134.anInt2447) * local102);
		Static235.anInt4004 = (int) ((float) (Static235.anInt4004 - Static16.anInt244) * local102 + (float) Static16.anInt244);
		Static222.anInt3814 = (int) ((float) Static317.anInt5141 + (float) (Static222.anInt3814 - Static317.anInt5141) * local102);
		@Pc(154) int local154 = Static411.anInt6947 - Static259.anInt4334;
		if (local154 > 8192) {
			local154 -= 16384;
		} else if (local154 < -8192) {
			local154 += 16384;
		}
		Static411.anInt6947 = (int) ((float) Static259.anInt4334 + (float) local154 * local102);
		Static411.anInt6947 &= 0x3FFF;
	}
}
