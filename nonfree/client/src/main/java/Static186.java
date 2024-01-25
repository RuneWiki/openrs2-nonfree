import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "J")
	public static long aLong109;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3336(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 0 || arg3 < 0 || Static3.anInt46 - 1 <= arg2 || arg3 >= Static270.anInt5194 - 1) {
			return;
		}
		if (Static440.aClass217ArrayArrayArray3 == null) {
			return;
		}
		@Pc(47) Interface27 local47;
		if (arg6 == 0) {
			local47 = (Interface27) Static468.method6746(arg5, arg2, arg3);
			@Pc(53) Interface27 local53 = (Interface27) Static282.method4466(arg5, arg2, arg3);
			if (local47 != null && arg4 != 2) {
				if (local47 instanceof Class11_Sub1_Sub2_Sub2) {
					((Class11_Sub1_Sub2_Sub2) local47).aClass104_2.method2725(arg0);
				} else {
					Static566.method1788(arg1, arg5, arg3, arg0, arg6, arg2, local47.method8326(), arg4);
				}
			}
			if (local53 != null) {
				if (local53 instanceof Class11_Sub1_Sub2_Sub2) {
					((Class11_Sub1_Sub2_Sub2) local53).aClass104_2.method2725(arg0);
					return;
				}
				Static566.method1788(arg1, arg5, arg3, arg0, arg6, arg2, local53.method8326(), arg4);
				return;
			}
			return;
		}
		if (arg6 != 1) {
			if (arg6 == 2) {
				local47 = (Interface27) Static383.method5768(arg5, arg2, arg3, wk.class);
				if (local47 == null) {
					return;
				}
				if (arg4 == 11) {
					arg4 = 10;
				}
				if (local47 instanceof Class11_Sub1_Sub1_Sub1) {
					((Class11_Sub1_Sub1_Sub1) local47).aClass104_1.method2725(arg0);
					return;
				}
				Static566.method1788(arg1, arg5, arg3, arg0, arg6, arg2, local47.method8326(), arg4);
			} else if (arg6 == 3) {
				local47 = (Interface27) Static263.method4286(arg5, arg2, arg3);
				if (local47 != null) {
					if (local47 instanceof Class11_Sub1_Sub4_Sub2) {
						((Class11_Sub1_Sub4_Sub2) local47).aClass104_3.method2725(arg0);
						return;
					}
					Static566.method1788(arg1, arg5, arg3, arg0, arg6, arg2, local47.method8326(), arg4);
					return;
				}
			}
			return;
		}
		local47 = (Interface27) Static148.method2840(arg5, arg2, arg3);
		if (local47 == null) {
			return;
		}
		if (!(local47 instanceof Class11_Sub1_Sub3_Sub2)) {
			@Pc(212) int local212 = local47.method8326();
			if (arg4 != 4 && arg4 != 5) {
				if (arg4 == 6) {
					Static566.method1788(arg1 + 4, arg5, arg3, arg0, arg6, arg2, local212, 4);
					return;
				}
				if (arg4 == 7) {
					Static566.method1788((arg1 + 2 & 0x3) + 4, arg5, arg3, arg0, arg6, arg2, local212, 4);
				} else if (arg4 == 8) {
					Static566.method1788(arg1 + 4, arg5, arg3, arg0, arg6, arg2, local212, 4);
					Static566.method1788((arg1 + 2 & 0x3) + 4, arg5, arg3, arg0, arg6, arg2, local212, 4);
					return;
				}
				return;
			}
			Static566.method1788(arg1, arg5, arg3, arg0, arg6, arg2, local212, 4);
			return;
		}
		((Class11_Sub1_Sub3_Sub2) local47).aClass104_4.method2725(arg0);
		return;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!vw;I)V")
	public static void method3340(@OriginalArg(0) Class11_Sub10 arg0) {
		arg0.aClass11_Sub1_3 = null;
		@Pc(22) int local22 = arg0.aClass11_Sub7Array1.length;
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			arg0.aClass11_Sub7Array1[local24].aBoolean391 = false;
		}
		@Pc(37) Class143[] local37 = Class44.aClass143Array1;
		synchronized (Class44.aClass143Array1) {
			if (local22 < Class44.aClass143Array1.length && Static308.anIntArray383[local22] < 200) {
				Class44.aClass143Array1[local22].method3529(arg0);
				@Pc(60) int local60 = Static308.anIntArray383[local22]++;
			}
		}
	}
}
