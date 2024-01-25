import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!ll", name = "O", descriptor = "Lclient!nq;")
	public static Class144 aClass144_76;

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "[I")
	public static final int[] anIntArray367 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
	public static int anInt4653 = 0;

	@OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
	public static int anInt4666 = 0;

	@OriginalMember(owner = "client!ll", name = "N", descriptor = "S")
	public static short aShort67 = 32767;

	@OriginalMember(owner = "client!ll", name = "P", descriptor = "Z")
	public static boolean aBoolean311 = false;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IBLclient!kh;)Ljava/lang/String;")
	public static String method4111(@OriginalArg(2) Class11_Sub25 arg0) {
		try {
			@Pc(15) int local15 = arg0.method5188();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(27) byte[] local27 = new byte[local15];
			arg0.anInt6076 += Static164.aClass150_1.method4033(0, arg0.anInt6076, local27, local15, arg0.aByteArray93);
			return Static216.method4853(local15, 0, local27);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg2; local7++) {
			for (@Pc(14) int local14 = arg3; local14 <= arg4; local14++) {
				if (Static182.anIntArrayArray44[local7][local14] == arg0 && Static62.anIntArrayArray4[local7][local14] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(BI)Z")
	public static boolean method4114(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4115(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static20.anInt374 >= 100 && !Static244.aBoolean325 || Static20.anInt374 >= 200) {
			Static17.method228(Static352.aClass117_120.method2684(Static230.anInt4634));
			return;
		}
		@Pc(29) String local29 = Static151.method2277(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(80) String local80;
		for (@Pc(42) int local42 = 0; local42 < Static20.anInt374; local42++) {
			@Pc(50) String local50 = Static151.method2277(Static193.aStringArray30[local42]);
			if (local50 != null && local50.equals(local29)) {
				Static17.method228(arg0 + Static111.aClass117_42.method2684(Static230.anInt4634));
				return;
			}
			if (Static272.aStringArray40[local42] != null) {
				local80 = Static151.method2277(Static272.aStringArray40[local42]);
				if (local80 != null && local80.equals(local29)) {
					Static17.method228(arg0 + Static111.aClass117_42.method2684(Static230.anInt4634));
					return;
				}
			}
		}
		for (@Pc(110) int local110 = 0; local110 < Static264.anInt5400; local110++) {
			local80 = Static151.method2277(Static110.aStringArray34[local110]);
			if (local80 != null && local80.equals(local29)) {
				Static17.method228(Static63.aClass117_22.method2684(Static230.anInt4634) + arg0 + Static323.aClass117_108.method2684(Static230.anInt4634));
				return;
			}
			if (Static348.aStringArray52[local110] != null) {
				@Pc(153) String local153 = Static151.method2277(Static348.aStringArray52[local110]);
				if (local153 != null && local153.equals(local29)) {
					Static17.method228(Static63.aClass117_22.method2684(Static230.anInt4634) + arg0 + Static323.aClass117_108.method2684(Static230.anInt4634));
					return;
				}
			}
		}
		if (Static151.method2277(Static156.aClass67_Sub3_Sub3_Sub2_2.aString50).equals(local29)) {
			Static17.method228(Static194.aClass117_64.method2684(Static230.anInt4634));
		} else {
			Static313.aClass11_Sub25_Sub1_5.method2454(245);
			Static313.aClass11_Sub25_Sub1_5.method5186(Static350.method5658(arg0));
			Static313.aClass11_Sub25_Sub1_5.method5173(arg0);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIB)Lclient!oo;")
	public static Class67_Sub3_Sub3 method4116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class106 local11 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class67_Sub3_Sub3 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class64 local22 = local11.aClass64_4; local22 != null; local22 = local22.aClass64_2) {
			@Pc(26) Class67_Sub3 local26 = local22.aClass67_Sub3_1;
			if (local26 instanceof Class67_Sub3_Sub3) {
				@Pc(32) Class67_Sub3_Sub3 local32 = (Class67_Sub3_Sub3) local26;
				@Pc(42) int local42 = local32.method4368() * 64 + 60 - 64;
				@Pc(49) int local49 = local32.anInt6308 - local42 >> 7;
				@Pc(57) int local57 = local32.anInt6310 - local42 >> 7;
				@Pc(64) int local64 = local42 + local32.anInt6308 >> 7;
				@Pc(71) int local71 = local42 + local32.anInt6310 >> 7;
				if (arg1 >= local49 && arg2 >= local57 && local64 >= arg1 && local71 >= arg2) {
					@Pc(105) int local105 = (local71 + 1 - arg2) * (-arg1 + local64 + 1);
					if (local105 > local19) {
						local17 = local32;
						local19 = local105;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method4117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg6 + arg0 && arg5 + arg3 > arg6) {
			return arg2 < arg1 + arg7 && arg7 < arg2 + arg4;
		} else {
			return false;
		}
	}
}
