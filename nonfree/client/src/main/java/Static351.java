import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
	public static int anInt6023;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	public static int anInt6020 = 0;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "F")
	public static float aFloat72 = 0.0F;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!sc;")
	public static final Class60 aClass60_1 = Static296.method4065();

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_216 = new Class103(11, 15);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIBII)I")
	public static int method4744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(11) int local11 = arg3;
			arg3 = arg5;
			arg5 = local11;
		}
		@Pc(23) int local23 = arg2 & 0x3;
		if (local23 == 0) {
			return arg0;
		} else if (local23 == 1) {
			return arg4;
		} else if (local23 == 2) {
			return 1 + 7 - arg3 - arg0;
		} else {
			return 1 + 7 - arg5 - arg4;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([[BLclient!sv;B)V")
	public static void method4745(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class195_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local15; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class1_Sub28 local35 = new Class1_Sub28(local28);
				local41 = Static248.anIntArray298[local22] >> 8;
				@Pc(47) int local47 = Static248.anIntArray298[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - Static199.anInt3480;
				@Pc(61) int local61 = local47 * 64 - Static164.anInt2731;
				Static111.method1777();
				arg1.method4994(local54, local35, local61, Static447.aClass14Array3, Static199.anInt3480, Static164.anInt2731);
				arg1.method5014(Static185.aClass34_7, local35, local54, local61, local12);
				if (!arg1.aBoolean703 && local41 == Static432.anInt7295 / 8 && local47 == Static414.anInt6796 / 8 && local12[0] != -1) {
					Static187.aClass5_1 = Static55.aClass187_1.method4188(Static130.aClass164_1, local12[0], local12[2], local12[3], local12[1]);
					Static360.anInt6139 = local12[4];
				}
			}
		}
		for (@Pc(131) int local131 = 0; local131 < local15; local131++) {
			@Pc(144) int local144 = (Static248.anIntArray298[local131] >> 8) * 64 - Static199.anInt3480;
			local41 = (Static248.anIntArray298[local131] & 0xFF) * 64 - Static164.anInt2731;
			@Pc(159) byte[] local159 = arg0[local131];
			if (local159 == null && Static414.anInt6796 < 800) {
				Static111.method1777();
				arg1.method5001(local144, local41);
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4747(@OriginalArg(0) String arg0) {
		if (Static400.aClass16Array1 != null) {
			Static52.method867(Static284.aClass103_180);
			Static18.aClass1_Sub28_Sub1_1.method5398(Static349.method4734(arg0));
			Static18.aClass1_Sub28_Sub1_1.method5364(arg0);
		}
	}
}
