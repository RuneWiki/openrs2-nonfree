import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "[I")
	public static final int[] anIntArray413 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_74 = new Class98(50, -1);

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "Lclient!maa;")
	public static final Class195 aClass195_9 = new Class195("", 13);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method4342(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static18.anInt5702 = 1;
		Static526.anInt9112 = -1;
		Static278.method4182(arg1, false, arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIII)V")
	public static void method4343(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		Static532.aFloat185 = local15;
		Static562.aFloat14 = local11;
		if (Static60.anInt1008 == 2) {
			Static463.anInt8184 = 0;
			Static232.anInt9865 = local11;
			Static38.anInt742 = local15;
		}
		Static48.method7038();
		Static380.aBoolean478 = true;
	}
}
