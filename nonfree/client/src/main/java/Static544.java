import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
	public static int anInt2285 = 1;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
	public static int anInt2286 = 999999;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(JI)V")
	public static void method2106(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static409.anInt7303;
		@Pc(9) int local9 = Static433.anInt7633;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (Static66.anInt1272 != local7) {
			local21 = local7 - Static66.anInt1272;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local29 < local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local21 < local29) {
				local29 = local21;
			}
			Static66.anInt1272 += local29;
		}
		if (!Static300.aClass5_Sub28_Sub1_1.aBoolean334) {
			Static476.aFloat339 += (float) arg0 * Static124.aFloat137 / 40.0F * 8.0F;
			Static535.aFloat364 += (float) arg0 * Static19.aFloat319 / 40.0F * 8.0F;
		}
		if (Static387.anInt7017 != local9) {
			local21 = local9 - Static387.anInt7017;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 > 0) {
				if (local29 == 0) {
					local29 = 1;
				} else if (local21 < local29) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = -1;
			} else if (local29 < local21) {
				local29 = local21;
			}
			Static387.anInt7017 += local29;
		}
		Static128.method2403();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIILclient!vj;)V")
	public static void method2107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15_Sub4 arg4) {
		@Pc(4) Class37 local4 = Static464.method6477(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt3209 = (arg1 << Static270.anInt5288) + Static261.anInt5167;
		arg4.anInt3212 = arg3;
		arg4.anInt3207 = (arg2 << Static270.anInt5288) + Static261.anInt5167;
		for (@Pc(28) Class108 local28 = local4.aClass108_1; local28 != null; local28 = local28.aClass108_3) {
			if (local28.aClass15_Sub2_1.aBoolean613) {
				@Pc(38) int local38 = local28.aClass15_Sub2_1.method6864();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt3212 += local8;
			arg4.aBoolean210 = true;
		} else if (local4.aClass15_Sub5_1 != null) {
			arg4.anInt3212 -= local4.aClass15_Sub5_1.aShort107;
		}
		local4.aClass15_Sub4_1 = arg4;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	public static void method2108() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static345.aBooleanArray24[local3] = true;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!fea;Lclient!qa;III)V")
	public static void method2109(@OriginalArg(0) Class99 arg0, @OriginalArg(1) Class62 arg1) {
		Static357.aClass99_56.method2524();
		if (Static325.aBoolean426) {
			return;
		}
		for (@Pc(21) Class5_Sub18 local21 = (Class5_Sub18) arg0.method2526(); local21 != null; local21 = (Class5_Sub18) arg0.method2519()) {
			@Pc(29) Class101 local29 = Static245.aClass246_4.method5847(local21.anInt3138);
			if (Static517.method7111(local29)) {
				@Pc(41) boolean local41 = Static83.method1446(arg1, local21, local29);
				if (local41) {
					Static178.method3064(local21, local29, arg1);
				}
			}
		}
	}
}
