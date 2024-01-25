import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_27 = new Class77(3, 28);

	@OriginalMember(owner = "client!dj", name = "I", descriptor = "[I")
	public static final int[] anIntArray158 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!vd;IIII)V")
	public static void method1128(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static386.method1337(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static166.anInt2967) {
			Static386.method1337(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static386.method1337(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static244.anInt1024) {
			Static386.method1337(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static244.anInt1024) {
			Static386.method1337(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static166.anInt2967 && arg4 <= Static244.anInt1024) {
			Static386.method1337(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static386.method1337(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static166.anInt2967 && arg4 > 0) {
			Static386.method1337(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
