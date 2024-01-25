import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public static int anInt3390 = 0;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!mk;")
	public static final Class130 aClass130_72 = new Class130();

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
	public static void method2933(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub1_Sub8 local12 = Static155.method2994(arg0, 9);
		local12.method2034();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V")
	public static void method2934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static18.aClass57ArrayArrayArray1 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg2 << 28 | arg1 << 14 | arg0);
		@Pc(25) Class4_Sub21 local25 = (Class4_Sub21) Static178.aClass198_35.method5261(local19);
		if (local25 == null) {
			Static211.method3682(arg2, arg0, arg1);
			return;
		}
		@Pc(39) Class4_Sub28 local39 = (Class4_Sub28) local25.aClass130_65.method3499();
		if (local39 == null) {
			Static211.method3682(arg2, arg0, arg1);
			return;
		}
		@Pc(53) Class2_Sub3_Sub1 local53 = (Class2_Sub3_Sub1) Static211.method3682(arg2, arg0, arg1);
		if (local53 == null) {
			local53 = new Class2_Sub3_Sub1();
		} else {
			local53.anInt3585 = local53.anInt3578 = -1;
		}
		local53.anInt3582 = local39.anInt4053;
		local53.anInt3588 = local39.anInt4051;
		label44: while (true) {
			@Pc(81) Class4_Sub28 local81 = (Class4_Sub28) local25.aClass130_65.method3512();
			if (local81 == null) {
				break;
			}
			if (local53.anInt3582 != local81.anInt4053) {
				local53.anInt3581 = local81.anInt4051;
				local53.anInt3585 = local81.anInt4053;
				while (true) {
					@Pc(106) Class4_Sub28 local106 = (Class4_Sub28) local25.aClass130_65.method3512();
					if (local106 == null) {
						break label44;
					}
					if (local106.anInt4053 != local53.anInt3582 && local53.anInt3585 != local106.anInt4053) {
						local53.anInt3578 = local106.anInt4053;
						local53.anInt3580 = local106.anInt4051;
					}
				}
			}
		}
		@Pc(150) int local150 = Static119.method2125((arg0 << 7) + 64, (arg1 << 7) - -64, arg2);
		Static242.method4203(arg2, arg0, arg1, local150, local53);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZIIBIII)V")
	public static void method2935(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static335.anInt6655 = arg2;
		Static154.anInt3448 = arg1;
		Static321.anInt6342 = arg3;
		Static203.anInt4295 = arg4;
		Static182.anInt4011 = arg5;
		if (arg0 && Static203.anInt4295 >= 100) {
			Static230.anInt4796 = Static321.anInt6342 * 128 + 64;
			Static133.anInt3056 = Static154.anInt3448 * 128 + 64;
			Static105.anInt6098 = Static119.method2125(Static230.anInt4796, Static133.anInt3056, Static279.anInt5645) - Static182.anInt4011;
		}
		Static303.anInt3065 = 2;
	}
}
