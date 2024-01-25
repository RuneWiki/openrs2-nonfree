import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!hha", name = "f", descriptor = "Lclient!wm;")
	public static Class390 aClass390_52;

	@OriginalMember(owner = "client!hha", name = "h", descriptor = "Lclient!fl;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "I")
	public static int anInt4198 = -1;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IZIIIIII)V")
	public static void method3562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg4 < 0 || arg0 >= Static201.anInt3834 - 1 || arg4 >= Static626.anInt10238 - 1) {
			return;
		}
		if (Static635.aClass226ArrayArrayArray3 == null) {
			return;
		}
		@Pc(36) Interface1 local36;
		if (arg5 == 0) {
			local36 = (Interface1) Static506.method7239(arg1, arg0, arg4);
			@Pc(42) Interface1 local42 = (Interface1) Static378.method5641(arg1, arg0, arg4);
			if (local36 != null && arg2 != 2) {
				if (local36 instanceof Class28_Sub1_Sub5_Sub1) {
					((Class28_Sub1_Sub5_Sub1) local36).aClass157_3.method3797(arg3);
				} else {
					Static530.method7443(arg5, arg2, local36.method8986(), arg3, arg6, arg0, arg1, arg4);
				}
			}
			if (local42 != null) {
				if (!(local42 instanceof Class28_Sub1_Sub5_Sub1)) {
					Static530.method7443(arg5, arg2, local42.method8986(), arg3, arg6, arg0, arg1, arg4);
					return;
				}
				((Class28_Sub1_Sub5_Sub1) local42).aClass157_3.method3797(arg3);
				return;
			}
			return;
		}
		if (arg5 == 1) {
			local36 = (Interface1) Static9.method8812(arg1, arg0, arg4);
			if (local36 != null) {
				if (!(local36 instanceof Class28_Sub1_Sub3_Sub1)) {
					@Pc(115) int local115 = local36.method8986();
					if (arg2 != 4 && arg2 != 5) {
						if (arg2 == 6) {
							Static530.method7443(arg5, 4, local115, arg3, arg6 + 4, arg0, arg1, arg4);
							return;
						}
						if (arg2 == 7) {
							Static530.method7443(arg5, 4, local115, arg3, (arg6 + 2 & 0x3) + 4, arg0, arg1, arg4);
						} else if (arg2 == 8) {
							Static530.method7443(arg5, 4, local115, arg3, arg6 + 4, arg0, arg1, arg4);
							Static530.method7443(arg5, 4, local115, arg3, (arg6 + 2 & 0x3) + 4, arg0, arg1, arg4);
							return;
						}
						return;
					}
					Static530.method7443(arg5, 4, local115, arg3, arg6, arg0, arg1, arg4);
					return;
				}
				((Class28_Sub1_Sub3_Sub1) local36).aClass157_4.method3797(arg3);
				return;
			}
			return;
		}
		if (arg5 != 2) {
			if (arg5 == 3) {
				local36 = (Interface1) Static570.method7867(arg1, arg0, arg4);
				if (local36 != null) {
					if (!(local36 instanceof Class28_Sub1_Sub2_Sub1)) {
						Static530.method7443(arg5, arg2, local36.method8986(), arg3, arg6, arg0, arg1, arg4);
						return;
					}
					((Class28_Sub1_Sub2_Sub1) local36).aClass157_1.method3797(arg3);
					return;
				}
			}
			return;
		}
		local36 = (Interface1) Static241.method3771(arg1, arg0, arg4, aia.class);
		if (local36 == null) {
			return;
		}
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (local36 instanceof Class28_Sub1_Sub4_Sub1) {
			((Class28_Sub1_Sub4_Sub1) local36).aClass157_2.method3797(arg3);
			return;
		}
		Static530.method7443(arg5, arg2, local36.method8986(), arg3, arg6, arg0, arg1, arg4);
		return;
	}
}
