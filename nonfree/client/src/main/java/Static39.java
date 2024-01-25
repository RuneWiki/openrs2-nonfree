import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bga", name = "G", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!bga", name = "L", descriptor = "I")
	public static int anInt1147;

	@OriginalMember(owner = "client!bga", name = "H", descriptor = "[I")
	public static final int[] anIntArray29 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!pt;BII)V")
	public static void method1072(@OriginalArg(0) Class263 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static363.aClass263ArrayArray5[arg1][arg2] = arg0;
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(III)V")
	public static void method1073(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(13, arg1);
		local8.method7363();
		local8.anInt9381 = arg0;
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(III)I")
	public static int method1074(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)Z")
	public static boolean method1075(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
