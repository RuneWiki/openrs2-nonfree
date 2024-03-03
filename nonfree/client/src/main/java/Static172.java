import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!km", name = "k", descriptor = "I")
	public static int anInt3431;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I", line = 20)
	public static int method3392() {
		return Class108.anInt2791;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLclient!nh;I)V", line = 145)
	public static void method3398(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg1) {
		if (Class2_Sub3_Sub24.anInt4949 >= 400 || Static17.aClass11_Sub5_Sub2_Sub1_3 == arg1) {
			return;
		}
		@Pc(146) String local146;
		@Pc(72) int local72;
		if (arg1.anInt4167 == 0) {
			@Pc(23) boolean local23 = true;
			if (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4185 != -1 && arg1.anInt4185 != -1) {
				@Pc(47) int local47 = arg1.anInt4173 >= Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4173 ? arg1.anInt4173 : Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4173;
				@Pc(62) int local62 = arg1.anInt4185 > Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4185 ? Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4185 : arg1.anInt4185;
				local72 = local62 + local47 * 10 / 100 + 5;
				@Pc(79) int local79 = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4173 - arg1.anInt4173;
				if (local79 < 0) {
					local79 = -local79;
				}
				if (local79 > local72) {
					local23 = false;
				}
			}
			@Pc(109) String local109 = Class2_Sub3_Sub12.aClass50_1 == Class226.aClass50_4 ? Class2_Sub2_Sub17.aClass79_142.method2269(Class197.anInt5569) : Class12_Sub1.aClass79_96.method2269(Class197.anInt5569);
			if (arg1.anInt4165 <= arg1.anInt4173) {
				local146 = arg1.method4073() + (local23 ? Static166.method2345(Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4173, arg1.anInt4173) : "<col=ffffff>") + " (" + local109 + arg1.anInt4173 + ")";
			} else {
				local146 = arg1.method4073() + (local23 ? Static166.method2345(Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4173, arg1.anInt4173) : "<col=ffffff>") + " (" + local109 + arg1.anInt4173 + "+" + (arg1.anInt4165 - arg1.anInt4173) + ")";
			}
		} else {
			local146 = arg1.method4073() + " (" + Class4.aClass79_2.method2269(Class197.anInt5569) + arg1.anInt4167 + ")";
		}
		if (Class2_Sub2_Sub10_Sub2.aBoolean419) {
			if (!arg0 && (Static108.anInt3833 & 0x8) != 0) {
				Static1.method3(-1, true, 0, false, Class67.aString18, 0, 60, Class173_Sub4.aString68 + " -> <col=ffffff>" + local146, Static38.anInt1043, (long) arg1.anInt4610);
			}
		} else if (arg0) {
			Static1.method3(0, false, 0, true, "<col=cccccc>" + local146, 0, -1, "", -1, 0L);
		} else {
			for (@Pc(272) int local272 = 7; local272 >= 0; local272--) {
				if (Class2_Sub2_Sub13.aStringArray44[local272] != null) {
					@Pc(280) short local280 = 0;
					if (Class226.aClass50_4 == Class2_Sub26.aClass50_3 && Class2_Sub2_Sub13.aStringArray44[local272].equalsIgnoreCase(Class245.aClass79_146.method2269(Class197.anInt5569))) {
						if (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4173 < arg1.anInt4173) {
							local280 = 2000;
						}
						if (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4187 != 0 && arg1.anInt4187 != 0) {
							if (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4187 == arg1.anInt4187) {
								local280 = 2000;
							} else {
								local280 = 0;
							}
						}
					} else if (Class2_Sub6.aBooleanArray11[local272]) {
						local280 = 2000;
					}
					@Pc(334) short local334 = (short) (Class49_Sub3.aShortArray114[local272] + local280);
					local72 = Class145.anIntArray225[local272] == -1 ? Class67.anInt1908 : Class145.anIntArray225[local272];
					Static1.method3(-1, true, 0, false, Class2_Sub2_Sub13.aStringArray44[local272], 0, local334, "<col=ffffff>" + local146, local72, (long) arg1.anInt4610);
				}
			}
		}
		if (arg0) {
			return;
		}
		for (@Pc(385) Class2_Sub5 local385 = (Class2_Sub5) Class92.aClass135_19.method3552(); local385 != null; local385 = (Class2_Sub5) Class92.aClass135_19.method3553()) {
			if (local385.anInt1004 == 22) {
				local385.aString11 = "<col=ffffff>" + local146;
				return;
			}
		}
	}
}
