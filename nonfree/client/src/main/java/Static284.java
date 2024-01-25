import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!se", name = "n", descriptor = "I")
	public static int anInt5609;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "I")
	public static int anInt5615;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "Lclient!nq;")
	public static Class144 aClass144_91;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "[I")
	public static int[] anIntArray437;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "[I")
	public static int[] anIntArray438;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_43 = new Class16();

	@OriginalMember(owner = "client!se", name = "r", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "[B")
	public static final byte[] aByteArray90 = new byte[520];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!kr;")
	public static Class67_Sub3 method4725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class106 local7 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class64 local14 = local7.aClass64_4; local14 != null; local14 = local14.aClass64_2) {
			@Pc(18) Class67_Sub3 local18 = local14.aClass67_Sub3_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort91 == arg1 && local18.aShort90 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method4729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static280.anInt212 <= arg4 && Static346.anInt6607 >= arg4 && Static280.anInt212 <= arg1 && arg1 <= Static346.anInt6607 && Static280.anInt212 <= arg7 && Static346.anInt6607 >= arg7 && arg6 >= Static280.anInt212 && arg6 <= Static346.anInt6607 && Static240.anInt4829 <= arg2 && Static166.anInt3315 >= arg2 && Static240.anInt4829 <= arg0 && Static166.anInt3315 >= arg0 && Static240.anInt4829 <= arg5 && arg5 <= Static166.anInt3315 && Static240.anInt4829 <= arg8 && arg8 <= Static166.anInt3315) {
			Static86.method1244(arg2, arg3, arg4, arg8, arg7, arg6, arg1, arg0, arg5);
		} else {
			Static101.method1503(arg2, arg3, arg6, arg5, arg8, arg0, arg4, arg7, arg1);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V")
	public static void method4731(@OriginalArg(0) int arg0) {
		if (arg0 == Static245.anInt6561) {
			return;
		}
		if (Static245.anInt6561 == 0) {
			Static163.method2604();
		}
		if (arg0 == 40) {
			Static1.method3();
		}
		if (arg0 != 40 && Static255.aClass156_90 != null) {
			Static255.aClass156_90.method4190();
			Static255.aClass156_90 = null;
		}
		if (Static245.anInt6561 == 25 || Static245.anInt6561 == 28) {
			Static68.aClass144_25.anInt4430 = 2;
			Static237.aClass144_81.anInt4430 = 2;
			Static182.aClass144_50.anInt4430 = 2;
			Static221.aClass144_70.anInt4430 = 2;
			Static221.aClass144_72.anInt4430 = 2;
			Static238.aClass144_82.anInt4430 = 2;
			Static236.aClass144_80.anInt4430 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static242.anInt5710 = 1;
			Static9.anInt154 = 0;
			Static106.anInt1980 = 0;
			Static252.anInt5975 = 0;
			Static204.anInt4168 = 1;
			Static204.method3650(true);
			Static68.aClass144_25.anInt4430 = 1;
			Static237.aClass144_81.anInt4430 = 1;
			Static182.aClass144_50.anInt4430 = 1;
			Static221.aClass144_70.anInt4430 = 1;
			Static221.aClass144_72.anInt4430 = 1;
			Static238.aClass144_82.anInt4430 = 1;
			Static236.aClass144_80.anInt4430 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static227.method4035();
		}
		if (arg0 == 5) {
			Static287.method4785(Static182.aClass144_49, Static107.aClass129_4);
		} else {
			Static248.method4336();
		}
		@Pc(142) boolean local142 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(160) boolean local160 = Static245.anInt6561 == 5 || Static245.anInt6561 == 10 || Static245.anInt6561 == 28;
		if (local142 != local160) {
			if (local142) {
				Static43.anInt850 = Static244.anInt4938;
				if (Static249.anInt4975 == 0) {
					Static144.method2185();
				} else {
					Static89.method1300(Static244.anInt4938, Static135.aClass144_38, 255);
				}
				Static285.aClass172_3.method4581(false);
			} else {
				Static144.method2185();
				Static285.aClass172_3.method4581(true);
				if (Static232.aClass133_1 != null) {
					Static232.aClass133_1.method3561();
					Static232.aClass133_1 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static107.aClass129_4.method5003();
		}
		Static245.anInt6561 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IC)Z")
	public static boolean method4732(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
