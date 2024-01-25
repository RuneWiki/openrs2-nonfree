import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "I")
	public static int anInt955 = -1;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLclient!fr;)V")
	public static void method995(@OriginalArg(1) Class4_Sub3_Sub3_Sub3_Sub1 arg0) {
		for (@Pc(22) Class14_Sub42 local22 = (Class14_Sub42) Static489.aClass32_57.method584(); local22 != null; local22 = (Class14_Sub42) Static489.aClass32_57.method577()) {
			if (arg0 == local22.aClass4_Sub3_Sub3_Sub3_Sub1_1) {
				if (local22.aClass14_Sub1_Sub1_4 != null) {
					Static196.aClass14_Sub1_Sub2_1.method1810(local22.aClass14_Sub1_Sub1_4);
					local22.aClass14_Sub1_Sub1_4 = null;
				}
				local22.method9513();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!ha;IIBIII)Lclient!ka;")
	public static Class129 method997(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(12) Class129 local12 = (Class129) Static605.aClass317_37.method7882(local6);
		if (local12 == null) {
			@Pc(22) Class72 local22 = Static227.method3839(Static640.aClass310_127, arg2);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt1744 < 13) {
				local22.method1689();
			}
			local12 = arg0.method6908(local22, 2055, Static674.anInt11000, 64, 768);
			Static605.aClass317_37.method7875(local6, local12);
		}
		local12 = local12.method5288((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.a(arg4);
		}
		if (arg5 != 0) {
			local12.FA(arg5);
		}
		if (arg3 != 0) {
			local12.VA(arg3);
		}
		if (arg1 != 0) {
			local12.H(0, arg1, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIB)V")
	public static void method998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static351.method9355()) {
			return;
		}
		if (arg0 != Static325.anInt5631) {
			Static423.aString83 = "";
		}
		Static426.anInt7228 = arg1;
		Static325.anInt5631 = arg0;
		Static160.method2323(6);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIII)V")
	public static void method999(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static468.anInt7895 <= arg3 - arg1 && arg1 + arg3 <= Static382.anInt6719 && Static410.anInt7068 <= arg0 - arg1 && Static281.anInt5188 >= arg1 + arg0) {
			Static393.method5979(arg0, arg2, arg1, arg3);
		} else {
			Static302.method4908(arg0, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(14) Class58 local14 = local7.aClass58_2; local14 != null; local14 = local14.aClass58_1) {
			@Pc(18) Class4_Sub3_Sub3 local18 = local14.aClass4_Sub3_Sub3_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort108 == arg1 && local18.aShort109 == arg2) {
				Static356.method5411(local18, false);
				return;
			}
		}
	}
}
