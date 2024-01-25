import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "[I")
	public static final int[] anIntArray622 = new int[13];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public static void method6784() {
		try {
			if (Static491.anInt8374 == 1) {
				@Pc(12) int local12 = Static535.aClass1_Sub12_Sub4_3.method6545();
				if (local12 > 0 && Static535.aClass1_Sub12_Sub4_3.method6529()) {
					local12 -= Static178.anInt3810;
					if (local12 < 0) {
						local12 = 0;
					}
					Static535.aClass1_Sub12_Sub4_3.method6554(local12);
					return;
				}
				Static535.aClass1_Sub12_Sub4_3.method6549();
				Static535.aClass1_Sub12_Sub4_3.method6532();
				if (Static249.aClass160_53 == null) {
					Static491.anInt8374 = 0;
				} else {
					Static491.anInt8374 = 2;
				}
				Static35.aClass1_Sub38_1 = null;
				Static398.aClass131_1 = null;
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static535.aClass1_Sub12_Sub4_3.method6549();
			Static491.anInt8374 = 0;
			Static35.aClass1_Sub38_1 = null;
			Static249.aClass160_53 = null;
			Static398.aClass131_1 = null;
		}
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
	public static void method6786() {
		@Pc(7) int[] local7 = new int[Static454.aClass153_2.anInt4594];
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static454.aClass153_2.anInt4594; local11++) {
			@Pc(17) Class192 local17 = Static454.aClass153_2.method4007(local11);
			if (local17.anInt5773 >= 0 || local17.anInt5812 >= 0) {
				local7[local9++] = local11;
			}
		}
		Static487.anIntArray647 = new int[local9];
		for (@Pc(53) int local53 = 0; local53 < local9; local53++) {
			Static487.anIntArray647[local53] = local7[local53];
		}
	}
}
