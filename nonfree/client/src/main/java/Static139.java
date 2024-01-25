import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Z")
	public static boolean aBoolean230;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	public static int anInt3066;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	public static int anInt3067;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public static int anInt3063 = -1;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[I")
	public static final int[] anIntArray144 = new int[1];

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method2486() {
		Static231.method3759(11);
		Static287.method4582();
		System.gc();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIILclient!ufa;IIIIILclient!ufa;)V")
	public static void method2487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class21_Sub1_Sub1_Sub1 arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class21_Sub1_Sub1_Sub1 arg6) {
		@Pc(7) int local7 = arg6.method3327();
		if (local7 == -1) {
			return;
		}
		@Pc(22) Class88 local22 = (Class88) Static499.aClass167_44.method3966((long) local7);
		if (local22 == null) {
			@Pc(29) Class103[] local29 = Static598.method2456(Static159.aClass348_38, local7);
			if (local29 == null) {
				return;
			}
			local22 = Static39.aClass7_2.method7808(local29[0], true);
			Static499.aClass167_44.method3974((long) local7, local22);
		}
		Static526.method7451(arg2.aByte127, arg2.anInt10550, arg2.anInt10551, 0, arg3 >> 1, arg0 >> 1, arg2.method3339() * 256);
		@Pc(78) int local78 = arg1 + Static509.anIntArray540[0] - 18;
		@Pc(88) int local88 = arg5 + Static509.anIntArray540[1] - 16 - 54;
		@Pc(96) int local96 = local78 + arg4 / 4 * 18;
		@Pc(104) int local104 = local88 + arg4 % 4 * 18;
		local22.method8051(local96, local104);
		if (arg2 == arg6) {
			Static39.aClass7_2.method7800(local104 - 1, 18, -256, 18, local96 - 1);
		}
		@Pc(126) Class21_Sub9 local126 = Static89.method1822();
		local126.anInt8156 = local104 + 16;
		local126.anInt8154 = local96;
		local126.aClass21_Sub1_Sub1_Sub1_1 = arg6;
		local126.anInt8155 = local104;
		local126.anInt8153 = local96 + 16;
		Static62.aClass158_19.method3720(local126);
	}
}
