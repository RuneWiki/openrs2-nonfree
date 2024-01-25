import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!qp", name = "H", descriptor = "I")
	public static int anInt7736;

	@OriginalMember(owner = "client!qp", name = "I", descriptor = "Lclient!r;")
	public static Class78 aClass78_112;

	@OriginalMember(owner = "client!qp", name = "J", descriptor = "[Lclient!wl;")
	public static Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!qp", name = "M", descriptor = "I")
	public static int anInt7738 = -2;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!tg;")
	public static Class11_Sub1_Sub1 method6172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class21 local14 = local7.aClass21_4; local14 != null; local14 = local14.aClass21_1) {
			@Pc(18) Class11_Sub1_Sub1 local18 = local14.aClass11_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort90 == arg1 && local18.aShort88 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg0 < 0 || arg6 >= Static458.anInt9736 - 1 || Static378.anInt6747 - 1 <= arg0) {
			return;
		}
		if (Static568.aClass360ArrayArrayArray22 == null) {
			return;
		}
		@Pc(47) Interface15 local47;
		if (arg2 == 0) {
			local47 = (Interface15) Static316.method4694(arg4, arg6, arg0);
			@Pc(53) Interface15 local53 = (Interface15) Static582.method7792(arg4, arg6, arg0);
			if (local47 != null && arg1 != 2) {
				if (local47 instanceof Class11_Sub1_Sub3_Sub2) {
					((Class11_Sub1_Sub3_Sub2) local47).aClass349_1.method7538(arg5);
				} else {
					Static594.method7981(arg6, arg5, arg4, arg1, arg3, arg0, arg2, local47.method7232());
				}
			}
			if (local53 != null) {
				if (!(local53 instanceof Class11_Sub1_Sub3_Sub2)) {
					Static594.method7981(arg6, arg5, arg4, arg1, arg3, arg0, arg2, local53.method7232());
					return;
				}
				((Class11_Sub1_Sub3_Sub2) local53).aClass349_1.method7538(arg5);
				return;
			}
			return;
		}
		if (arg2 == 1) {
			local47 = (Interface15) Static175.method2781(arg4, arg6, arg0);
			if (local47 != null) {
				if (!(local47 instanceof Class11_Sub1_Sub5_Sub1)) {
					@Pc(128) int local128 = local47.method7232();
					if (arg1 != 4 && arg1 != 5) {
						if (arg1 != 6) {
							if (arg1 == 7) {
								Static594.method7981(arg6, arg5, arg4, 4, (arg3 + 2 & 0x3) + 4, arg0, arg2, local128);
							} else if (arg1 == 8) {
								Static594.method7981(arg6, arg5, arg4, 4, arg3 + 4, arg0, arg2, local128);
								Static594.method7981(arg6, arg5, arg4, 4, (arg3 + 2 & 0x3) + 4, arg0, arg2, local128);
								return;
							}
							return;
						}
						Static594.method7981(arg6, arg5, arg4, 4, arg3 + 4, arg0, arg2, local128);
						return;
					}
					Static594.method7981(arg6, arg5, arg4, 4, arg3, arg0, arg2, local128);
					return;
				}
				((Class11_Sub1_Sub5_Sub1) local47).aClass349_2.method7538(arg5);
				return;
			}
			return;
		}
		if (arg2 == 2) {
			local47 = (Interface15) method6172(arg4, arg6, arg0, kj.class);
			if (local47 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (local47 instanceof Class11_Sub1_Sub1_Sub5) {
					((Class11_Sub1_Sub1_Sub5) local47).aClass349_3.method7538(arg5);
					return;
				}
				Static594.method7981(arg6, arg5, arg4, arg1, arg3, arg0, arg2, local47.method7232());
				return;
			}
			return;
		}
		if (arg2 != 3) {
			return;
		}
		local47 = (Interface15) Static481.method6668(arg4, arg6, arg0);
		if (local47 == null) {
			return;
		}
		if (local47 instanceof Class11_Sub1_Sub4_Sub2) {
			((Class11_Sub1_Sub4_Sub2) local47).aClass349_4.method7538(arg5);
			return;
		}
		Static594.method7981(arg6, arg5, arg4, arg1, arg3, arg0, arg2, local47.method7232());
		return;
	}
}
