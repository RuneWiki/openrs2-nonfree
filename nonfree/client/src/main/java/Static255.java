import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!kg;")
	public static Class114 aClass114_4;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!tj;")
	public static Class193 aClass193_90;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	public static int anInt5171;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
	public static int anInt5172;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public static int anInt5164 = -1;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
	public static int anInt5167 = 0;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Z")
	public static boolean aBoolean382 = false;

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
	public static int anInt5169 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!tj;Lclient!tj;)V")
	public static void method4464(@OriginalArg(1) Class193 arg0, @OriginalArg(2) Class193 arg1) {
		Static193.aClass193_75 = arg1;
		Static29.aClass193_8 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(DZ)V")
	public static void method4465(@OriginalArg(0) double arg0) {
		if (Static281.aDouble1 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static186.anIntArray330[local7] = local19 > 255 ? 255 : local19;
		}
		Static281.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!vq;)V")
	public static void method4467(@OriginalArg(1) Class47 arg0) {
		if (Static272.aBoolean393) {
			Static267.method4612(arg0);
		} else {
			Static297.method4926(arg0);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
	public static int method4469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
