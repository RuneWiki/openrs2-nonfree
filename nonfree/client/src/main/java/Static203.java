import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
	public static int anInt4033 = 0;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "[I")
	public static final int[] anIntArray323 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIB)V")
	public static void method3255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class1_Sub11 local17 = Static276.method3885(Static362.aClass70_40, Static481.aClass276_2);
		local17.aClass1_Sub35_Sub2_1.method5792(arg0);
		local17.aClass1_Sub35_Sub2_1.method5789(arg1);
		Static48.method743(local17);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)Lclient!ff;")
	public static Class101 method3256(@OriginalArg(0) int arg0) {
		@Pc(13) Class101[] local13 = Static130.method2037();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].anInt2586 == arg0) {
				return local13[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V")
	public static void method3258(@OriginalArg(0) int arg0) {
		Static6.anInt67 = arg0;
		Static201.aClass222_24.method4428();
	}
}
