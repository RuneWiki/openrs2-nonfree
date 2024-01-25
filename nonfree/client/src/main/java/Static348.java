import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "[Lclient!f;")
	public static Class14[] aClass14Array12;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[I")
	public static final int[] anIntArray333 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!np;Z)Lclient!kh;")
	public static Class180 method5131(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method5198();
		return new Class180(local7);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BIIIIIII)V")
	public static void method5133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg4 < 0 || Static54.anInt1038 - 1 <= arg6 || Static140.anInt3026 - 1 <= arg4) {
			return;
		}
		if (Static309.aClass299ArrayArrayArray3 == null) {
			return;
		}
		@Pc(48) Interface4 local48;
		if (arg1 == 0) {
			local48 = (Interface4) Static184.method3149(arg5, arg6, arg4);
			@Pc(250) Interface4 local250 = (Interface4) Static552.method7304(arg5, arg6, arg4);
			if (local48 != null && arg0 != 2) {
				if (local48 instanceof Class41_Sub2_Sub3_Sub1) {
					((Class41_Sub2_Sub3_Sub1) local48).aClass300_4.method6513(arg3);
				} else {
					Static328.method4723(arg1, arg0, arg4, arg5, arg3, local48.method7561(), arg6, arg2);
				}
			}
			if (local250 != null) {
				if (local250 instanceof Class41_Sub2_Sub3_Sub1) {
					((Class41_Sub2_Sub3_Sub1) local250).aClass300_4.method6513(arg3);
				} else {
					Static328.method4723(arg1, arg0, arg4, arg5, arg3, local250.method7561(), arg6, arg2);
				}
			}
		} else if (arg1 == 1) {
			local48 = (Interface4) Static418.method5942(arg5, arg6, arg4);
			if (local48 != null) {
				if (local48 instanceof Class41_Sub2_Sub2_Sub1) {
					((Class41_Sub2_Sub2_Sub1) local48).aClass300_1.method6513(arg3);
				} else {
					@Pc(147) int local147 = local48.method7561();
					if (arg0 == 4 || arg0 == 5) {
						Static328.method4723(arg1, 4, arg4, arg5, arg3, local147, arg6, arg2);
					} else if (arg0 == 6) {
						Static328.method4723(arg1, 4, arg4, arg5, arg3, local147, arg6, arg2 + 4);
					} else if (arg0 == 7) {
						Static328.method4723(arg1, 4, arg4, arg5, arg3, local147, arg6, (arg2 + 2 & 0x3) + 4);
					} else if (arg0 == 8) {
						Static328.method4723(arg1, 4, arg4, arg5, arg3, local147, arg6, arg2 + 4);
						Static328.method4723(arg1, 4, arg4, arg5, arg3, local147, arg6, (arg2 + 2 & 0x3) + 4);
					}
				}
			}
		} else if (arg1 == 2) {
			local48 = (Interface4) Static480.method6569(arg5, arg6, arg4, gda.class);
			if (local48 != null) {
				if (arg0 == 11) {
					arg0 = 10;
				}
				if (local48 instanceof Class41_Sub2_Sub1_Sub3) {
					((Class41_Sub2_Sub1_Sub3) local48).aClass300_3.method6513(arg3);
				} else {
					Static328.method4723(arg1, arg0, arg4, arg5, arg3, local48.method7561(), arg6, arg2);
				}
			}
		} else if (arg1 == 3) {
			local48 = (Interface4) Static508.method6867(arg5, arg6, arg4);
			if (local48 != null) {
				if (local48 instanceof Class41_Sub2_Sub5_Sub1) {
					((Class41_Sub2_Sub5_Sub1) local48).aClass300_2.method6513(arg3);
				} else {
					Static328.method4723(arg1, arg0, arg4, arg5, arg3, local48.method7561(), arg6, arg2);
				}
			}
		}
	}
}
