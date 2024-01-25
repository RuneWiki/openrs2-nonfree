import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static686 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!sa;)V")
	public static void method2954(@OriginalArg(0) Class321 arg0) {
		Static605.aClass321_3 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!aba;Z)Z")
	public static boolean method2955(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static177.aClass84Array2 == Static77.aClass84Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7575();
		if (arg0.aShort104 < 0 || arg0.aShort105 < 0 || arg0.aShort103 >= Static672.anInt10829 || arg0.aShort102 >= Static532.anInt8517) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort104; local36 <= arg0.aShort103; local36++) {
			for (local40 = arg0.aShort105; local40 <= arg0.aShort102; local40++) {
				@Pc(47) Class128 local47 = Static362.method8360(arg0.aByte139, local36, local40);
				if (local47 != null) {
					@Pc(53) Class299 local53 = Static82.method1331(arg0);
					@Pc(56) Class299 local56 = local47.aClass299_2;
					if (local56 == null) {
						local47.aClass299_2 = local53;
					} else {
						while (local56.aClass299_3 != null) {
							local56 = local56.aClass299_3;
						}
						local56.aClass299_3 = local53;
					}
					if (local6 && (Static503.anIntArrayArray57[local36][local40] & 0xFF000000) != 0) {
						local8 = Static503.anIntArrayArray57[local36][local40];
						local10 = Static206.aShortArrayArray11[local36][local40];
						local12 = Static220.aByteArrayArray10[local36][local40];
					}
					if (!arg1 && local47.aClass4_Sub1_Sub3_1 != null && local47.aClass4_Sub1_Sub3_1.aShort48 > local33) {
						local33 = local47.aClass4_Sub1_Sub3_1.aShort48;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort104; local40 <= arg0.aShort103; local40++) {
				for (@Pc(136) int local136 = arg0.aShort105; local136 <= arg0.aShort102; local136++) {
					if ((Static503.anIntArrayArray57[local40][local136] & 0xFF000000) == 0) {
						Static503.anIntArrayArray57[local40][local136] = local8;
						Static206.aShortArrayArray11[local40][local136] = local10;
						Static220.aByteArrayArray10[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static414.aClass4_Sub1_Sub1Array1[Static107.anInt1735++] = arg0;
		} else {
			local40 = Static177.aClass84Array2 == Static77.aClass84Array1 ? 1 : 0;
			if (!arg0.method8356()) {
				arg0.aClass4_Sub1_23 = Static321.aClass4_Sub1Array5[local40];
				Static321.aClass4_Sub1Array5[local40] = arg0;
			} else if (arg0.method8344()) {
				arg0.aClass4_Sub1_23 = Static194.aClass4_Sub1Array13[local40];
				Static194.aClass4_Sub1Array13[local40] = arg0;
			} else {
				arg0.aClass4_Sub1_23 = Static623.aClass4_Sub1Array11[local40];
				Static623.aClass4_Sub1Array11[local40] = arg0;
				Static597.aBoolean675 = true;
			}
		}
		if (arg1) {
			arg0.anInt9797 -= local33;
		}
		return true;
	}
}
