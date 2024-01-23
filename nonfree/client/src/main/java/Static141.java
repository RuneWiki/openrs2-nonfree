import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
	public static int anInt2764;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "[I")
	public static int[] anIntArray241 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "[I")
	public static int[] anIntArray242 = new int[25];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method2485() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static166.aBooleanArray11[local7] = true;
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lclient!bb;")
	public static Class1_Sub5_Sub1 method2486() {
		if (Static249.aClass189_13 == null) {
			return null;
		} else {
			Static234.aClass98_1.method2471(Static249.aClass189_13);
			@Pc(17) Class1_Sub5_Sub1 local17 = (Class1_Sub5_Sub1) Static234.aClass98_1.method2473();
			@Pc(28) Class136 local28 = Static160.method2739(local17.anInt359);
			return local28 != null && local28.aBoolean368 && local28.method3522() ? local17 : Static292.method4398();
		}
	}
}
