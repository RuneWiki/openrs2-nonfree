import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
	public static int anInt3545;

	@OriginalMember(owner = "client!kk", name = "tb", descriptor = "I")
	public static int anInt3564;

	@OriginalMember(owner = "client!kk", name = "Ib", descriptor = "I")
	public static int anInt3574;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "[I")
	public static final int[] anIntArray477 = new int[6];

	@OriginalMember(owner = "client!kk", name = "X", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_28 = new Class103(8);

	@OriginalMember(owner = "client!kk", name = "Hb", descriptor = "I")
	public static int anInt3573 = 1;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	public static void method3233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass22_Sub5_2 != null) {
			local7.aClass22_Sub5_2 = null;
		}
		if (local7.aClass22_Sub5_1 != null) {
			local7.aClass22_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg2 < 0 || Static15.anInt287 - 1 <= arg5 || Static325.anInt6173 - 1 <= arg2) {
			return;
		}
		if (Static229.aClass49ArrayArrayArray6 == null) {
			return;
		}
		@Pc(42) Interface1 local42;
		if (arg0 == 0) {
			local42 = (Interface1) Static48.method4691(arg6, arg5, arg2);
			@Pc(48) Interface1 local48 = (Interface1) Static213.method3780(arg6, arg5, arg2);
			if (local42 != null && arg1 != 2) {
				if (local42 instanceof Class22_Sub4_Sub2) {
					((Class22_Sub4_Sub2) local42).aClass164_3.method4222(arg3);
				} else {
					Static69.method1370(arg5, arg2, local42.method5362(), arg1, arg3, arg0, arg4, arg6);
				}
			}
			if (local48 != null) {
				if (local48 instanceof Class22_Sub4_Sub2) {
					((Class22_Sub4_Sub2) local48).aClass164_3.method4222(arg3);
					return;
				}
				Static69.method1370(arg5, arg2, local48.method5362(), arg1, arg3, arg0, arg4, arg6);
				return;
			}
			return;
		}
		if (arg0 == 1) {
			local42 = (Interface1) Static96.method1983(arg6, arg5, arg2);
			if (local42 != null) {
				if (!(local42 instanceof Class22_Sub5_Sub2)) {
					@Pc(120) int local120 = local42.method5362();
					if (arg1 != 4 && arg1 != 5) {
						if (arg1 == 6) {
							Static69.method1370(arg5, arg2, local120, 4, arg3, arg0, arg4 + 4, arg6);
						} else if (arg1 == 7) {
							Static69.method1370(arg5, arg2, local120, 4, arg3, arg0, (arg4 + 2 & 0x3) + 4, arg6);
							return;
						} else if (arg1 == 8) {
							Static69.method1370(arg5, arg2, local120, 4, arg3, arg0, arg4 + 4, arg6);
							Static69.method1370(arg5, arg2, local120, 4, arg3, arg0, (arg4 + 2 & 0x3) + 4, arg6);
							return;
						}
						return;
					}
					Static69.method1370(arg5, arg2, local120, 4, arg3, arg0, arg4, arg6);
					return;
				}
				((Class22_Sub5_Sub2) local42).aClass164_4.method4222(arg3);
				return;
			}
			return;
		}
		if (arg0 == 2) {
			local42 = (Interface1) Static252.method5177(arg6, arg5, arg2, gd.class);
			if (local42 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (!(local42 instanceof Class22_Sub2_Sub3)) {
					Static69.method1370(arg5, arg2, local42.method5362(), arg1, arg3, arg0, arg4, arg6);
					return;
				}
				((Class22_Sub2_Sub3) local42).aClass164_1.method4222(arg3);
				return;
			}
			return;
		}
		if (arg0 != 3) {
			return;
		}
		local42 = (Interface1) Static44.method981(arg6, arg5, arg2);
		if (local42 == null) {
			return;
		}
		if (local42 instanceof Class22_Sub1_Sub2) {
			((Class22_Sub1_Sub2) local42).aClass164_2.method4222(arg3);
			return;
		}
		Static69.method1370(arg5, arg2, local42.method5362(), arg1, arg3, arg0, arg4, arg6);
		return;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Lclient!gh;")
	public static Class83 method3241(@OriginalArg(0) int arg0) {
		@Pc(12) Class83 local12 = (Class83) Static305.aClass103_62.method2682((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static264.aClass180_71.method4560(arg0, 34);
		local12 = new Class83();
		if (local22 != null) {
			local12.method2036(arg0, new Class7_Sub3(local22));
		}
		Static305.aClass103_62.method2687(local12, (long) arg0);
		return local12;
	}
}
