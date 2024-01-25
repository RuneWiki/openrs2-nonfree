import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
	public static void method8289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static48.aClass158_1.method3601(Static514.aClass303_26.method7473(Static232.anInt4258));
		@Pc(61) int local61;
		@Pc(28) int local28;
		if (Static436.aBoolean534) {
			for (@Pc(70) Class14_Sub3_Sub21 local70 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1826(); local70 != null; local70 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1827()) {
				if (local70.anInt11129 == 1) {
					local28 = Static549.method7757((Class14_Sub3_Sub11) local70.aClass73_13.aClass14_Sub3_20.aClass14_Sub3_67);
				} else {
					local28 = Static364.method5498(local70);
				}
				if (local28 > local13) {
					local13 = local28;
				}
			}
			local13 += 8;
			Static624.anInt10515 = (Static575.aBoolean699 ? 26 : 22) + Static569.anInt9810 * 16;
			local61 = Static569.anInt9810 * 16 + 21;
		} else {
			for (@Pc(20) Class14_Sub3_Sub11 local20 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6318(); local20 != null; local20 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6311()) {
				local28 = Static549.method7757(local20);
				if (local28 > local13) {
					local13 = local28;
				}
			}
			local13 += 8;
			Static624.anInt10515 = (Static575.aBoolean699 ? 26 : 22) + Static313.anInt9044 * 16;
			local61 = Static313.anInt9044 * 16 + 21;
		}
		@Pc(130) int local130 = arg1 - local13 / 2;
		if (local130 + local13 > Static561.anInt9759) {
			local130 = Static561.anInt9759 - local13;
		}
		if (local130 < 0) {
			local130 = 0;
		}
		local28 = arg0;
		if (Static639.anInt10685 < local61 + arg0) {
			local28 = Static639.anInt10685 - local61;
		}
		if (local28 < 0) {
			local28 = 0;
		}
		Static222.anInt4164 = local130;
		Static189.anInt3555 = local13;
		Static370.anInt10482 = local28;
		Static505.aBoolean629 = true;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)Lclient!wja;")
	public static Class96 method8290() {
		try {
			return new Class96_Sub1();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class96) Class.forName("Class96_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(18) Throwable local18) {
				return new Class96_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZIII[IILclient!qfa;)Lclient!cw;")
	public static Class66_Sub1_Sub1 method8292(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class137_Sub3 arg5) {
		if (arg5.aBoolean595 || Static178.method2845(arg4) && Static178.method2845(arg1)) {
			return new Class66_Sub1_Sub1(arg5, 3553, arg4, arg1, false, arg3, arg0, 0);
		} else if (arg5.aBoolean596) {
			return new Class66_Sub1_Sub1(arg5, 34037, arg4, arg1, false, arg3, arg0, 0);
		} else {
			return new Class66_Sub1_Sub1(arg5, arg4, arg1, Static330.method5181(arg4), Static330.method5181(arg1), arg3);
		}
	}
}
