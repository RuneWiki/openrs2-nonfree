import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "Lclient!uu;")
	public static Class63 aClass63_3;

	@OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
	public static int anInt7975;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(II)Lclient!mfa;")
	public static Class227 method6941() {
		return new Class227(1, false);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	public static void method6942() {
		Static565.method7926(Static627.aClass5_Sub46_31.aClass11_Sub20_1.method6520());
		@Pc(20) int local20 = (Static70.anInt9231 >> 12) + (Static113.anInt1785 >> 3);
		@Pc(28) int local28 = (Static646.anInt10445 >> 12) + (Static622.anInt10087 >> 3);
		Static299.anInt4751 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 = 0;
		Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2371(8, 8);
		Static503.aByteArrayArray8 = new byte[18][];
		Static343.aByteArrayArray10 = new byte[18][];
		Static610.aByteArrayArray26 = new byte[18][];
		Static310.aByteArrayArray9 = new byte[18][];
		Static112.aByteArrayArray4 = new byte[18][];
		Static462.anIntArray542 = new int[18];
		Static594.anIntArray784 = new int[18];
		Static379.anIntArray680 = new int[18];
		Static28.anIntArray43 = new int[18];
		Static587.anIntArray777 = new int[18];
		Static322.anIntArray403 = new int[18];
		Static141.anIntArrayArray12 = new int[18][4];
		@Pc(79) int local79 = 0;
		@Pc(99) int local99;
		for (@Pc(88) int local88 = (local20 - (Static111.anInt1752 >> 4)) / 8; local88 <= ((Static111.anInt1752 >> 4) + local20) / 8; local88++) {
			for (local99 = (local28 - (Static279.anInt4567 >> 4)) / 8; local99 <= ((Static279.anInt4567 >> 4) + local28) / 8; local99++) {
				@Pc(108) int local108 = (local88 << 8) + local99;
				Static594.anIntArray784[local79] = local108;
				Static462.anIntArray542[local79] = Static342.aClass384_86.method8890("m" + local88 + "_" + local99);
				Static379.anIntArray680[local79] = Static342.aClass384_86.method8890("l" + local88 + "_" + local99);
				Static587.anIntArray777[local79] = Static342.aClass384_86.method8890("n" + local88 + "_" + local99);
				Static28.anIntArray43[local79] = Static342.aClass384_86.method8890("um" + local88 + "_" + local99);
				Static322.anIntArray403[local79] = Static342.aClass384_86.method8890("ul" + local88 + "_" + local99);
				if (Static587.anIntArray777[local79] == -1) {
					Static462.anIntArray542[local79] = -1;
					Static379.anIntArray680[local79] = -1;
					Static28.anIntArray43[local79] = -1;
					Static322.anIntArray403[local79] = -1;
				}
				local79++;
			}
		}
		for (local99 = local79; local99 < Static587.anIntArray777.length; local99++) {
			Static587.anIntArray777[local99] = -1;
			Static462.anIntArray542[local99] = -1;
			Static379.anIntArray680[local99] = -1;
			Static28.anIntArray43[local99] = -1;
			Static322.anIntArray403[local99] = -1;
		}
		@Pc(284) byte local284;
		if (Static469.anInt7883 == 3) {
			local284 = 4;
		} else {
			local284 = 8;
		}
		Static349.method5303(local20, false, local284, local28);
	}
}
