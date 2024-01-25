import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cu", name = "G", descriptor = "I")
	public static int anInt1556;

	@OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
	public static int anInt1557;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "(I)V")
	public static void method1489() {
		if (Static265.aFloat182 < 1024.0F) {
			Static265.aFloat182 = 1024.0F;
		}
		if (Static265.aFloat182 > 3072.0F) {
			Static265.aFloat182 = 3072.0F;
		}
		while (Static161.aFloat56 >= 16384.0F) {
			Static161.aFloat56 -= 16384.0F;
		}
		while (Static161.aFloat56 < 0.0F) {
			Static161.aFloat56 += 16384.0F;
		}
		@Pc(41) int local41 = Static31.anInt5633 >> 7;
		@Pc(50) int local50 = Static169.anInt3089 >> 7;
		@Pc(56) int local56 = Static200.method3233(Static208.anInt3742, Static31.anInt5633, Static169.anInt3089);
		@Pc(58) int local58 = 0;
		@Pc(80) int local80;
		if (local41 > 3 && local50 > 3 && Static363.anInt1158 - 4 > local41 && local50 < Static511.anInt8889 - 4) {
			for (local80 = local41 - 4; local80 <= local41 + 4; local80++) {
				for (@Pc(86) int local86 = local50 - 4; local86 <= local50 + 4; local86++) {
					@Pc(90) int local90 = Static208.anInt3742;
					if (local90 < 3 && Static169.method2839(local80, local86)) {
						local90++;
					}
					@Pc(101) int local101 = 0;
					if (Static290.aClass200_Sub1_2.aByteArrayArrayArray23 != null && Static290.aClass200_Sub1_2.aByteArrayArrayArray23[local90] != null) {
						local101 = (Static290.aClass200_Sub1_2.aByteArrayArrayArray23[local90][local80][local86] & 0xFF) * 8;
					}
					@Pc(134) int local134 = local56 + local101 - Static532.aClass75Array3[local90].ba(local80, local86);
					if (local134 > local58) {
						local58 = local134;
					}
				}
			}
		}
		local80 = (local58 >> 0) * 1536;
		if (local80 > 786432) {
			local80 = 786432;
		}
		if (local80 < 262144) {
			local80 = 262144;
		}
		if (local80 > Static284.anInt9397) {
			Static284.anInt9397 += (local80 - Static284.anInt9397) / 24;
		} else if (local80 < Static284.anInt9397) {
			Static284.anInt9397 += (local80 - Static284.anInt9397) / 80;
			return;
		}
	}
}
