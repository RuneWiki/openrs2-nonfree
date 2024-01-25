import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gga", name = "u", descriptor = "[Lclient!mi;")
	public static Class46[] aClass46Array7;

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "(I)V")
	public static void method3782() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static639.aBoolean753) {
			local9 = 4096;
			if (Static183.aBoolean325) {
				local7 = 2048;
			}
		}
		if (Static305.aFloat154 < (float) local7) {
			Static305.aFloat154 = local7;
		}
		if (Static305.aFloat154 > (float) local9) {
			Static305.aFloat154 = local9;
		}
		while (Static72.aFloat68 >= 16384.0F) {
			Static72.aFloat68 -= 16384.0F;
		}
		while (Static72.aFloat68 < 0.0F) {
			Static72.aFloat68 += 16384.0F;
		}
		@Pc(57) int local57 = Static21.anInt398 >> 9;
		@Pc(61) int local61 = Static468.anInt8821 >> 9;
		@Pc(67) int local67 = Static590.method8716(Static21.anInt398, Static12.anInt172, Static468.anInt8821);
		@Pc(69) int local69 = 0;
		@Pc(91) int local91;
		if (local57 > 3 && local61 > 3 && Static47.anInt1794 - 4 > local57 && Static209.anInt4742 - 4 > local61) {
			for (local91 = local57 - 4; local91 <= local57 + 4; local91++) {
				for (@Pc(97) int local97 = local61 - 4; local97 <= local61 + 4; local97++) {
					@Pc(101) int local101 = Static12.anInt172;
					if (local101 < 3 && Static30.method735(local97, local91)) {
						local101++;
					}
					@Pc(114) int local114 = 0;
					if (Static113.aClass322_Sub1_1.aByteArrayArrayArray12 != null && Static113.aClass322_Sub1_1.aByteArrayArrayArray12[local101] != null) {
						local114 = (Static113.aClass322_Sub1_1.aByteArrayArrayArray12[local101][local91][local97] & 0xFF) * 8 << 2;
					}
					if (Static9.aClass65Array1 != null && Static9.aClass65Array1[local101] != null) {
						@Pc(156) int local156 = local67 + local114 - Static9.aClass65Array1[local101].method7995(local97, local91);
						if (local69 < local156) {
							local69 = local156;
						}
					}
				}
			}
		}
		local91 = (local69 >> 2) * 1536;
		if (local91 > 786432) {
			local91 = 786432;
		}
		if (local91 < 262144) {
			local91 = 262144;
		}
		if (local91 > Static489.anInt9047) {
			Static489.anInt9047 += (local91 - Static489.anInt9047) / 24;
		} else if (Static489.anInt9047 > local91) {
			Static489.anInt9047 += (local91 - Static489.anInt9047) / 80;
		}
	}
}
