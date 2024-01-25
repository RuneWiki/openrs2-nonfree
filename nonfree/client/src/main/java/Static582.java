import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg4 < 0 || arg6 >= Static38.anInt740 - 1 || arg4 >= Static38.anInt741 - 1) {
			return;
		}
		if (Static309.aClass100ArrayArrayArray2 == null) {
			return;
		}
		@Pc(42) Interface17 local42;
		if (arg1 == 0) {
			local42 = (Interface17) Static216.method3734(arg5, arg6, arg4);
			@Pc(48) Interface17 local48 = (Interface17) Static256.method4272(arg5, arg6, arg4);
			if (local42 != null && arg0 != 2) {
				if (local42 instanceof Class10_Sub2_Sub3) {
					((Class10_Sub2_Sub3) local42).aClass353_2.method7867(arg2);
				} else {
					Static387.method7905(arg1, arg2, arg0, arg4, arg5, arg3, local42.method7743(), arg6);
				}
			}
			if (local48 != null) {
				if (!(local48 instanceof Class10_Sub2_Sub3)) {
					Static387.method7905(arg1, arg2, arg0, arg4, arg5, arg3, local48.method7743(), arg6);
					return;
				}
				((Class10_Sub2_Sub3) local48).aClass353_2.method7867(arg2);
				return;
			}
			return;
		}
		if (arg1 == 1) {
			local42 = (Interface17) Static183.method3413(arg5, arg6, arg4);
			if (local42 != null) {
				if (!(local42 instanceof Class10_Sub4_Sub3)) {
					@Pc(123) int local123 = local42.method7743();
					if (arg0 != 4 && arg0 != 5) {
						if (arg0 == 6) {
							Static387.method7905(arg1, arg2, 4, arg4, arg5, arg3 + 4, local123, arg6);
						} else if (arg0 == 7) {
							Static387.method7905(arg1, arg2, 4, arg4, arg5, (arg3 + 2 & 0x3) + 4, local123, arg6);
							return;
						} else if (arg0 == 8) {
							Static387.method7905(arg1, arg2, 4, arg4, arg5, arg3 + 4, local123, arg6);
							Static387.method7905(arg1, arg2, 4, arg4, arg5, (arg3 + 2 & 0x3) + 4, local123, arg6);
							return;
						}
						return;
					}
					Static387.method7905(arg1, arg2, 4, arg4, arg5, arg3, local123, arg6);
					return;
				}
				((Class10_Sub4_Sub3) local42).aClass353_3.method7867(arg2);
				return;
			}
			return;
		}
		if (arg1 == 2) {
			local42 = (Interface17) Static541.method7510(arg5, arg6, arg4, qi.class);
			if (local42 != null) {
				if (arg0 == 11) {
					arg0 = 10;
				}
				if (!(local42 instanceof Class10_Sub1_Sub6)) {
					Static387.method7905(arg1, arg2, arg0, arg4, arg5, arg3, local42.method7743(), arg6);
					return;
				}
				((Class10_Sub1_Sub6) local42).aClass353_4.method7867(arg2);
				return;
			}
			return;
		}
		if (arg1 != 3) {
			return;
		}
		local42 = (Interface17) Static38.method651(arg5, arg6, arg4);
		if (local42 == null) {
			return;
		}
		if (local42 instanceof Class10_Sub5_Sub1) {
			((Class10_Sub5_Sub1) local42).aClass353_1.method7867(arg2);
			return;
		}
		Static387.method7905(arg1, arg2, arg0, arg4, arg5, arg3, local42.method7743(), arg6);
		return;
	}
}
