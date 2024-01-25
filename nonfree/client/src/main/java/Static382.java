import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
	public static int anInt6447 = 0;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)[Lclient!eh;")
	public static Class60[] method5040() {
		return new Class60[] { Static153.aClass60_1, Static153.aClass60_2, Static153.aClass60_3, Static153.aClass60_4, Static153.aClass60_5, Static153.aClass60_6, Static153.aClass60_7, Static153.aClass60_8, Static153.aClass60_9, Static153.aClass60_10 };
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V")
	public static void method5041() {
		if (Static32.aBoolean63) {
			return;
		}
		Static251.aBoolean429 = true;
		if (Static323.aClass50_Sub1_1.aBoolean303) {
			Static164.aFloat142 = (int) Static164.aFloat142 - 17 & 0xFFFFFFF0;
		} else {
			Static50.aFloat28 += (-12.0F - Static50.aFloat28) / 2.0F;
		}
		Static32.aBoolean63 = true;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!pk;ILclient!ya;II)V")
	public static void method5042(@OriginalArg(0) Class183 arg0, @OriginalArg(2) Class19 arg1) {
		Static378.aClass183_29.method4138();
		if (Static303.aBoolean482) {
			return;
		}
		for (@Pc(21) Class4_Sub3 local21 = (Class4_Sub3) arg0.method4140(); local21 != null; local21 = (Class4_Sub3) arg0.method4144()) {
			@Pc(29) Class157 local29 = Static148.aClass182_3.method4124(local21.anInt234);
			if (Static428.method5473(local29)) {
				@Pc(41) boolean local41 = Static272.method3908(arg1, local21, local29);
				if (local41) {
					Static302.method4102(local29, local21, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZII)V")
	public static void method5043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1004) {
			Static271.method3899(Static258.aClass186_12, arg2, arg1);
		} else if (arg0 == 1012) {
			Static271.method3899(Static53.aClass186_4, arg2, arg1);
		} else if (arg0 == 1008) {
			Static271.method3899(Static96.aClass186_8, arg2, arg1);
		} else if (arg0 == 1001) {
			Static271.method3899(Static210.aClass186_11, arg2, arg1);
		} else if (arg0 == 1006) {
			Static271.method3899(Static276.aClass186_3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
	public static void method5045(@OriginalArg(0) int arg0) {
		@Pc(17) Class4_Sub1_Sub11 local17 = Static405.method5222(arg0, 5);
		local17.method2608();
	}
}
