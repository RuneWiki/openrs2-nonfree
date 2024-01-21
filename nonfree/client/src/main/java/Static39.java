import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
	public static int anInt1240;

	@OriginalMember(owner = "client!ec", name = "Z", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_19;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "[I")
	public static int[] anIntArray133 = new int[200];

	@OriginalMember(owner = "client!ec", name = "V", descriptor = "Lclient!ld;")
	public static Class47 aClass47_9 = new Class47(64);

	@OriginalMember(owner = "client!ec", name = "ab", descriptor = "B")
	public static byte aByte3 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIILclient!ce;III)V")
	public static void method1023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub8 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(29) int local29;
		if (arg3 < 0 || arg3 >= 104 || arg0 < 0 || arg0 >= 104) {
			while (true) {
				local29 = arg4.method1607();
				if (local29 == 0) {
					break;
				}
				if (local29 == 1) {
					arg4.method1607();
					break;
				}
				if (local29 <= 49) {
					arg4.method1607();
				}
			}
			return;
		}
		Static35.aByteArrayArrayArray20[arg5][arg3][arg0] = 0;
		while (true) {
			local29 = arg4.method1607();
			if (local29 == 0) {
				if (arg5 == 0) {
					Static183.anIntArrayArrayArray8[0][arg3][arg0] = -Static160.method2753(arg2 + arg0 + 556238, arg3 + (932731 - -arg6)) * 8;
				} else {
					Static183.anIntArrayArrayArray8[arg5][arg3][arg0] = Static183.anIntArrayArrayArray8[arg5 - 1][arg3][arg0] - 240;
				}
				break;
			}
			if (local29 == 1) {
				@Pc(127) int local127 = arg4.method1607();
				if (local127 == 1) {
					local127 = 0;
				}
				if (arg5 == 0) {
					Static183.anIntArrayArrayArray8[0][arg3][arg0] = -local127 * 8;
				} else {
					Static183.anIntArrayArrayArray8[arg5][arg3][arg0] = Static183.anIntArrayArrayArray8[arg5 - 1][arg3][arg0] - local127 * 8;
				}
				break;
			}
			if (local29 <= 49) {
				Static131.aByteArrayArrayArray36[arg5][arg3][arg0] = arg4.method1611();
				Static170.aByteArrayArrayArray43[arg5][arg3][arg0] = (byte) ((local29 - 2) / 4);
				Static19.aByteArrayArrayArray15[arg5][arg3][arg0] = (byte) (arg1 + local29 - 2 & 0x3);
			} else if (local29 <= 81) {
				Static35.aByteArrayArrayArray20[arg5][arg3][arg0] = (byte) (local29 - 49);
			} else {
				Static62.aByteArrayArrayArray30[arg5][arg3][arg0] = (byte) (local29 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V")
	public static void method1024() {
		anIntArray133 = null;
		anIntArrayArrayArray1 = null;
		aClass4_Sub1_19 = null;
		aClass47_9 = null;
	}
}
