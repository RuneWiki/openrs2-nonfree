import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "Lclient!dn;")
	public static Class56 aClass56_39;

	@OriginalMember(owner = "client!hp", name = "O", descriptor = "I")
	public static int anInt3380;

	@OriginalMember(owner = "client!hp", name = "P", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIBIIIII[[[BLclient!qa;I)V")
	public static void method2753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][][] arg9, @OriginalArg(11) Class75 arg10, @OriginalArg(12) int arg11) {
		if (arg0 == 0 || arg4 == 0) {
			return;
		}
		if (arg0 == 9) {
			arg0 = 1;
			arg3 = arg3 + 1 & 0x3;
		}
		if (arg0 == 10) {
			arg0 = 1;
			arg3 = arg3 + 3 & 0x3;
		}
		if (arg0 == 11) {
			arg3 = arg3 + 3 & 0x3;
			arg0 = 8;
		}
		arg10.aa(arg1, arg6, arg11, arg5, arg7, arg8, arg9[arg0 - 1][arg3], arg4, arg2);
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(B)V")
	public static void method2754() {
		if (Static302.aClass75_8 != null) {
			Static302.aClass75_8.method2608();
			Static391.aClass65_6 = null;
			Static302.aClass75_8 = null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([[BLclient!bi;I)V")
	public static void method2756(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class4_Sub1 arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class3_Sub2 local35 = new Class3_Sub2(local28);
				local41 = Static289.anIntArray407[local22] >> 8;
				@Pc(47) int local47 = Static289.anIntArray407[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - Static108.anInt3458;
				@Pc(61) int local61 = local47 * 64 - Static339.anInt6223;
				Static143.method2556();
				arg1.method746(local35, Static339.anInt6223, Static108.anInt3458, local54, Static389.aClass23Array1, local61);
				arg1.method754(local17, local35, local54, Static266.aClass75_7, local61);
				if (!arg1.aBoolean46 && Static422.anInt7272 / 8 == local41 && Static442.anInt7524 / 8 == local47 && local17[0] != -1) {
					Static5.aClass29_1 = Static290.aClass2_1.method65(Static430.aClass211_1, local17[3], local17[2], local17[0], local17[1]);
					Static374.anInt6606 = local17[4];
				}
			}
		}
		for (@Pc(125) int local125 = 0; local125 < local20; local125++) {
			@Pc(138) int local138 = (Static289.anIntArray407[local125] >> 8) * 64 - Static108.anInt3458;
			local41 = (Static289.anIntArray407[local125] & 0xFF) * 64 - Static339.anInt6223;
			@Pc(153) byte[] local153 = arg0[local125];
			if (local153 == null && Static442.anInt7524 < 800) {
				Static143.method2556();
				arg1.method744(local138, local41);
			}
		}
	}
}
