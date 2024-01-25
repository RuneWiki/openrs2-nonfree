import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!be", name = "b", descriptor = "[I")
	public static int[] anIntArray504;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
	public static void method7894(@OriginalArg(1) int arg0) {
		Static374.anInt6199 = 100;
		Static555.anInt9372 = arg0;
		Static165.anInt10647 = -1;
		Static248.anInt4508 = 3;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	public static void method7895() {
		@Pc(15) int local15 = Static97.aClass5_Sub25_8.aClass6_Sub12_1.method4024();
		if (local15 == 0) {
			Static105.aByteArrayArrayArray3 = null;
			Static627.method8870(0);
		} else if (local15 == 1) {
			Static536.method7902((byte) 0);
			Static627.method8870(512);
			if (Static305.aByteArrayArrayArray18 != null) {
				Static593.method8541();
			}
		} else {
			Static536.method7902((byte) (Static96.anInt1932 - 4 & 0xFF));
			Static627.method8870(2);
		}
		Static512.anInt8852 = Static636.anInt10567;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!raa;ILclient!aa;Lclient!da;IILjava/lang/String;IILclient!pia;I)V")
	public static void method7896(@OriginalArg(1) Class295 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1 arg2, @OriginalArg(4) Class55 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class272 arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (Static254.anInt4612 == 4) {
			local11 = (int) Static311.aFloat95 & 0x3FFF;
		} else {
			local11 = (int) Static311.aFloat95 + Static2.anInt7 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg0.anInt7957 / 2, arg0.anInt7985 / 2) + 10;
		@Pc(40) int local40 = arg10 * arg10 + arg1 * arg1;
		if (local40 > local32 * local32) {
			return;
		}
		@Pc(54) int local54 = Class377.anIntArray600[local11];
		@Pc(58) int local58 = Class377.anIntArray601[local11];
		if (Static254.anInt4612 != 4) {
			local54 = local54 * 256 / (Static372.anInt6183 + 256);
			local58 = local58 * 256 / (Static372.anInt6183 + 256);
		}
		@Pc(87) int local87 = arg10 * local58 + local54 * arg1 >> 14;
		@Pc(98) int local98 = arg1 * local58 - arg10 * local54 >> 14;
		@Pc(105) int local105 = arg9.method6566(arg6, 100, null);
		@Pc(115) int local115 = arg9.method6572(0, null, arg6, 100);
		@Pc(121) int local121 = local87 - local105 / 2;
		if (local121 >= -arg0.anInt7957 && arg0.anInt7957 >= local121 && local98 >= -arg0.anInt7985 && arg0.anInt7985 >= local98) {
			arg3.method6008(0, arg4, 0, arg7, arg7 + arg0.anInt7985 / 2 - arg5 - local98 - local115, arg0.anInt7957 / 2 + (local121 - -arg4), null, arg6, 0, 50, null, arg2, arg8, 1, local105);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILjava/lang/String;Lclient!ha;IIII)V")
	public static void method7898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class133 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static80.aClass28_5 == null || Static64.aClass28_3 == null) {
			if (Static441.aClass207_89.method4678(Static7.anInt152) && Static441.aClass207_89.method4678(Static128.anInt49)) {
				Static80.aClass28_5 = arg3.method7297(Static649.method2888(Static441.aClass207_89, Static7.anInt152, 0), true);
				@Pc(28) Class131 local28 = Static649.method2888(Static441.aClass207_89, Static128.anInt49, 0);
				Static64.aClass28_3 = arg3.method7297(local28, true);
				local28.method2901();
				Static523.aClass28_30 = arg3.method7297(local28, true);
			} else {
				arg3.aa(arg5, arg0, arg4, 20, Static240.anInt4438 | 255 - Static151.anInt2617 << 24, 1);
			}
		}
		if (Static80.aClass28_5 != null && Static64.aClass28_3 != null) {
			@Pc(75) int local75 = (arg4 - Static64.aClass28_3.method4032() * 2) / Static80.aClass28_5.method4032();
			for (@Pc(77) int local77 = 0; local77 < local75; local77++) {
				Static80.aClass28_5.method4040(Static64.aClass28_3.method4032() + arg5 + Static80.aClass28_5.method4032() * local77, arg0);
			}
			Static64.aClass28_3.method4040(arg5, arg0);
			Static523.aClass28_30.method4040(arg4 + arg5 - Static523.aClass28_30.method4032(), arg0);
		}
		Static16.aClass55_1.method6023(Static387.anInt6410 | 0xFF000000, arg5 + 3, arg2, arg0 + 14, -1);
		arg3.aa(arg5, arg0 + 20, arg4, arg1 - 20, -Static151.anInt2617 + 255 << 24 | Static240.anInt4438, 1);
	}
}
