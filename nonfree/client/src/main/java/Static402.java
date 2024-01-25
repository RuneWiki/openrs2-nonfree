import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Lclient!cba;")
	public static Class45 aClass45_117;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_116 = new Class45(99, 2);

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
	public static int anInt7565 = 0;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "Z")
	public static boolean aBoolean542 = false;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!bea;IILclient!hh;IIILclient!ss;)V")
	public static void method6312(@OriginalArg(0) Class30_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30_Sub1_Sub1_Sub2 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class279 arg6) {
		@Pc(7) Class12_Sub22 local7 = new Class12_Sub22();
		local7.anInt4479 = arg1 << 7;
		local7.anInt4475 = arg5 << 7;
		local7.anInt4477 = arg4;
		if (arg6 != null) {
			local7.aClass279_1 = arg6;
			@Pc(141) int local141 = arg6.anInt8293;
			@Pc(144) int local144 = arg6.anInt8303;
			if (arg2 == 1 || arg2 == 3) {
				local141 = arg6.anInt8303;
				local144 = arg6.anInt8293;
			}
			local7.anInt4480 = arg6.anInt8285;
			local7.anInt4478 = arg1 + local141 << 7;
			local7.anInt4484 = arg6.anInt8307;
			local7.anIntArray332 = arg6.anIntArray619;
			local7.anInt4481 = arg6.anInt8320 << 7;
			local7.anInt4485 = arg5 + local144 << 7;
			local7.anInt4476 = arg6.anInt8312;
			local7.anInt4487 = arg6.anInt8316;
			if (arg6.anIntArray620 != null) {
				local7.aBoolean352 = true;
				local7.method3775();
			}
			if (local7.anIntArray332 != null) {
				local7.anInt4486 = (int) (Math.random() * (double) (local7.anInt4487 - local7.anInt4484)) + local7.anInt4484;
			}
			Static316.aClass73_49.method2012(local7);
		} else if (arg3 != null) {
			local7.aClass30_Sub1_Sub1_Sub2_1 = arg3;
			@Pc(83) Class130 local83 = arg3.aClass130_1;
			if (local83.anIntArray308 != null) {
				local7.aBoolean352 = true;
				local83 = local83.method3570(Static393.aClass31_1);
			}
			if (local83 != null) {
				local7.anInt4485 = local83.anInt4113 + arg5 << 7;
				local7.anInt4478 = arg1 + local83.anInt4113 << 7;
				local7.anInt4480 = Static418.method6471(arg3);
				local7.anInt4476 = local83.anInt4081;
				local7.anInt4481 = local83.anInt4076 << 7;
			}
			Static325.aClass73_50.method2012(local7);
		} else if (arg0 != null) {
			local7.aClass30_Sub1_Sub1_Sub1_1 = arg0;
			local7.anInt4478 = arg0.method3591() + arg1 << 7;
			local7.anInt4485 = arg0.method3591() + arg5 << 7;
			local7.anInt4480 = Static53.method1408(arg0);
			local7.anInt4481 = arg0.anInt754 << 7;
			local7.anInt4476 = arg0.anInt733;
			Static451.aClass68_35.method1916(local7, (long) arg0.anInt4197);
			return;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method6313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static291.method4732(arg0)) {
			if (Static473.aClass198ArrayArray2[arg0] == null) {
				Static198.method3762(arg4, -1, arg2, Static71.aClass198ArrayArray1[arg0], arg3, arg5, arg1, arg7, arg6);
			} else {
				Static198.method3762(arg4, -1, arg2, Static473.aClass198ArrayArray2[arg0], arg3, arg5, arg1, arg7, arg6);
			}
		} else if (arg3 == -1) {
			for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
				Static154.aBooleanArray31[local17] = true;
			}
		} else {
			Static154.aBooleanArray31[arg3] = true;
		}
	}
}
