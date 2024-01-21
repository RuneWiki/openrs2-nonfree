import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	public static int anInt517;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Z")
	public static boolean aBoolean15;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
	public static int[] anIntArray43;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!ra;")
	public static Class72 aClass72_3;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_122 = Static158.method3034("logo");

	@OriginalMember(owner = "client!be", name = "f", descriptor = "[I")
	public static final int[] anIntArray42 = new int[100];

	@OriginalMember(owner = "client!be", name = "i", descriptor = "[I")
	public static final int[] anIntArray44 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	public static int anInt522 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static62.method1443(arg4)) {
			Static196.aClass72Array2 = null;
			Static82.method1923(arg3, arg5, arg0, arg1, -1, Static197.aClass72ArrayArray1[arg4], arg7, arg2, arg6);
			if (Static196.aClass72Array2 != null) {
				Static82.method1923(arg3, arg5, arg0, arg1, -1412584499, Static196.aClass72Array2, Static101.anInt2913, Static102.anInt2945, arg6);
				Static196.aClass72Array2 = null;
			}
		} else if (arg1 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static127.aBooleanArray14[local19] = true;
			}
		} else {
			Static127.aBooleanArray14[arg1] = true;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I[Lclient!ob;I[SI)V")
	public static void method402(@OriginalArg(0) int arg0, @OriginalArg(1) Class60[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg2) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) Class60 local25 = arg1[local19];
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local25;
		@Pc(39) short local39 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local39;
		for (@Pc(51) int local51 = arg0; local51 < arg2; local51++) {
			if (local25 == null || arg1[local51] != null && (local51 & 0x1) > arg1[local51].method2678(local25)) {
				@Pc(73) Class60 local73 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21] = local73;
				@Pc(87) short local87 = arg3[local51];
				arg3[local51] = arg3[local21];
				arg3[local21++] = local87;
			}
		}
		arg1[arg2] = arg1[local21];
		arg1[local21] = local25;
		arg3[arg2] = arg3[local21];
		arg3[local21] = local39;
		method402(arg0, arg1, local21 - 1, arg3);
		method402(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)V")
	public static void method403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg0);
		@Pc(24) Class2_Sub1_Sub20 local24 = (Class2_Sub1_Sub20) Static179.aClass51_14.method2458(local10);
		if (local24 != null) {
			Static114.aClass55_1.method2524(local24);
		}
	}
}
