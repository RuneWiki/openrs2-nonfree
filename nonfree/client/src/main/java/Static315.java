import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V", line = 3)
	public static void method6142() {
		if (Class28.aFloat27 < 1024.0F) {
			Class28.aFloat27 = 1024.0F;
		}
		while (Class187.aFloat66 >= 16384.0F) {
			Class187.aFloat66 -= 16384.0F;
		}
		if (Class28.aFloat27 > 3072.0F) {
			Class28.aFloat27 = 3072.0F;
		}
		while (Class187.aFloat66 < 0.0F) {
			Class187.aFloat66 += 16384.0F;
		}
		@Pc(46) int local46 = Static265.anInt5451 >> 7;
		@Pc(50) int local50 = Static58.anInt2392 >> 7;
		@Pc(56) int local56 = Static360.method6033(Static265.anInt5451, Static58.anInt2392, Static330.anInt6573);
		@Pc(58) int local58 = 0;
		@Pc(76) int local76;
		if (local46 > 3 && local50 > 3 && local46 < 100 && local50 < 100) {
			for (local76 = local46 - 4; local76 <= local46 + 4; local76++) {
				for (@Pc(82) int local82 = local50 - 4; local82 <= local50 + 4; local82++) {
					@Pc(86) int local86 = Static330.anInt6573;
					if (local86 < 3 && Static302.method5546(local82, local76)) {
						local86++;
					}
					@Pc(99) int local99 = 0;
					if (Static177.aClass29_Sub1_63.aByteArrayArrayArray11 != null && Static177.aClass29_Sub1_63.aByteArrayArrayArray11[local86] != null) {
						local99 = (Static177.aClass29_Sub1_63.aByteArrayArrayArray11[local86][local76][local82] & 0xFF) * 8;
					}
					@Pc(132) int local132 = local99 + local56 - Static340.aClass6Array4[local86].method5720(local76, local82);
					if (local132 > local58) {
						local58 = local132;
					}
				}
			}
		}
		local76 = local58 * 1536;
		if (local76 > 786432) {
			local76 = 786432;
		}
		if (local76 < 262144) {
			local76 = 262144;
		}
		if (Class66.anInt1883 < local76) {
			Class66.anInt1883 += (local76 - Class66.anInt1883) / 24;
		} else if (Class66.anInt1883 > local76) {
			Class66.anInt1883 += (local76 - Class66.anInt1883) / 80;
			return;
		}
	}
}
