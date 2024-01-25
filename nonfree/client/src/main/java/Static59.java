import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "Lclient!mq;")
	public static Class134 aClass134_1;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	public static void method1258() {
		if (Static233.aFloat86 < 1024.0F) {
			Static233.aFloat86 = 1024.0F;
		}
		while (Static304.aFloat110 >= 16384.0F) {
			Static304.aFloat110 -= 16384.0F;
		}
		if (Static233.aFloat86 > 3072.0F) {
			Static233.aFloat86 = 3072.0F;
		}
		while (Static304.aFloat110 < 0.0F) {
			Static304.aFloat110 += 16384.0F;
		}
		@Pc(45) int local45 = Static140.anInt2779 >> 7;
		@Pc(49) int local49 = Static81.anInt1607 >> 7;
		@Pc(55) int local55 = Static16.method362(Static140.anInt2779, Static81.anInt1607, Static285.anInt5511);
		@Pc(57) int local57 = 0;
		@Pc(77) int local77;
		if (local45 > 3 && local49 > 3 && local45 < 100 && local49 < 100) {
			for (local77 = local45 - 4; local77 <= local45 + 4; local77++) {
				for (@Pc(83) int local83 = local49 - 4; local83 <= local49 + 4; local83++) {
					@Pc(87) int local87 = Static285.anInt5511;
					if (local87 < 3 && Static153.method2918(local83, local77)) {
						local87++;
					}
					@Pc(100) int local100 = 0;
					if (Static207.aByteArrayArrayArray10 != null && Static207.aByteArrayArrayArray10[local87] != null) {
						local100 = (Static207.aByteArrayArrayArray10[local87][local77][local83] & 0xFF) * 8;
					}
					@Pc(130) int local130 = local55 + local100 - Static7.aClass41Array1[local87].method5434(local77, local83);
					if (local130 > local57) {
						local57 = local130;
					}
				}
			}
		}
		local77 = local57 * 1536;
		if (local77 > 786432) {
			local77 = 786432;
		}
		if (local77 < 262144) {
			local77 = 262144;
		}
		if (Static16.anInt334 < local77) {
			Static16.anInt334 += (local77 - Static16.anInt334) / 24;
		} else if (Static16.anInt334 > local77) {
			Static16.anInt334 += (local77 - Static16.anInt334) / 80;
		}
	}
}
