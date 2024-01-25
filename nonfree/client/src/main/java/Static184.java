import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gp", name = "z", descriptor = "Lclient!ur;")
	public static Class345 aClass345_9;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "[I")
	public static final int[] anIntArray236 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "Z")
	public static boolean aBoolean309 = false;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILclient!wi;)Z")
	public static boolean method3506(@OriginalArg(1) int arg0, @OriginalArg(2) Class372 arg1) {
		Static224.aClass54_4.method5139(arg1.anIntArray618[arg0], arg1.anIntArray617[arg0], arg1.anIntArray619[arg0], Static513.anIntArray501);
		@Pc(27) int local27 = Static513.anIntArray501[2];
		if (local27 < 50) {
			return false;
		} else {
			arg1.aShortArray151[arg0] = (short) (Static613.anInt10345 + Static130.anInt3468 * Static513.anIntArray501[0] / local27);
			arg1.aShortArray149[arg0] = (short) (Static193.anInt4515 + Static513.anIntArray501[1] * Static623.anInt6559 / local27);
			arg1.aShortArray150[arg0] = (short) local27;
			return true;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZIBIZ)V")
	public static void method3508(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static350.method5551(0, arg1, arg2, arg3, Static313.aClass98_Sub1Array1.length - 1, arg0);
		Static570.anInt9810 = 0;
		Static104.aClass8_Sub48_1 = null;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIBILclient!ha;I)V")
	public static void method3510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) Class16 arg4) {
		arg4.method6114(-10660793, arg3, arg2, arg0, arg1);
		arg4.method6114(-16777216, arg3 + 1, 16, arg0 + 1, arg1 + -2);
		arg4.method6086(arg3 + 1, arg0 - -18, -16777216, arg2 - 19, arg1 - 2);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBI)Z")
	public static boolean method3511(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static639.method8603(arg0, arg1) || Static287.method4823(arg0, arg1);
	}
}
