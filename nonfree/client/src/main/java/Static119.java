import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
	public static int anInt2297;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
	public static int anInt2298 = 127;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "J")
	public static long aLong56 = 0L;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	public static void method1930() {
		Static88.method1425();
		Static323.method5830();
		Static326.method4953();
		Static57.method1109();
		Static208.method3737();
		Static246.method4477();
		Static62.method5789();
		Static285.method5000();
		Static295.method5180();
		Static96.method1531();
		Static305.method5286();
		Static241.method4404();
		Static58.method1132();
		Static329.method5539();
		Static340.method5643();
		Static166.method2920();
		Static284.method4998();
		Static28.method484();
		Static253.method4536();
		Static90.method1438();
		Static230.method4177();
		Static334.method5582();
		Static42.method888();
		Static9.aClass37_2.method920(5);
		Static89.aClass37_33.method920(5);
		Static120.aClass37_41.method920(5);
		Static11.aClass37_96.method920(5);
		Static122.aClass37_42.method920(5);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[B[Lclient!ba;IZIILclient!ii;IBII)V")
	public static void method1931(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class17[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class105 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(18) Class1_Sub21 local18 = new Class1_Sub21(arg1);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method5695();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local18.method5699();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local18.method5720();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				if (local58 == arg3 && local54 >= arg9 && local54 < arg9 + 8 && arg6 <= local48 && arg6 + 8 > local48) {
					@Pc(101) Class79 local101 = Static129.method2097(local20);
					@Pc(118) int local118 = Static304.method5273(local70, local101.anInt1897, arg8, local54 & 0x7, local101.anInt1884, local48 & 0x7) + arg10;
					@Pc(135) int local135 = arg0 + Static271.method4882(local54 & 0x7, local48 & 0x7, local101.anInt1884, arg8, local70, local101.anInt1897);
					if (local118 > 0 && local135 > 0 && local118 < Static43.anInt1151 - 1 && Static260.anInt5348 - 1 > local135) {
						@Pc(154) Class17 local154 = null;
						if (!arg4) {
							@Pc(158) int local158 = arg5;
							if ((Static291.aByteArrayArrayArray11[1][local118][local135] & 0x2) == 2) {
								local158 = arg5 - 1;
							}
							if (local158 >= 0) {
								local154 = arg2[local158];
							}
						}
						Static34.method595(local20, arg8 + local70 & 0x3, arg4, local135, true, local118, arg5, local66, -1, local154, arg5, arg7);
					}
				}
			}
		}
	}
}
