import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!sea;")
	public static Class308 aClass308_111;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Lclient!hm;")
	public static Class139 method4684(@OriginalArg(0) int arg0) {
		@Pc(15) Class139[] local15 = Static382.method7883();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class139 local23 = local15[local17];
			if (arg0 == local23.anInt3798) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method4685() {
		if (Static487.aFloat206 < 1024.0F) {
			Static487.aFloat206 = 1024.0F;
		}
		if (Static487.aFloat206 > 3072.0F) {
			Static487.aFloat206 = 3072.0F;
		}
		while (Static331.aFloat172 >= 16384.0F) {
			Static331.aFloat172 -= 16384.0F;
		}
		while (Static331.aFloat172 < 0.0F) {
			Static331.aFloat172 += 16384.0F;
		}
		@Pc(41) int local41 = Static183.anInt3630 >> 9;
		@Pc(45) int local45 = Static173.anInt3244 >> 9;
		@Pc(51) int local51 = Static538.method6114(Static240.anInt4414, Static173.anInt3244, Static183.anInt3630);
		@Pc(53) int local53 = 0;
		@Pc(85) int local85;
		if (local41 > 3 && local45 > 3 && local41 < Static458.anInt9736 - 4 && local45 < Static378.anInt6747 - 4) {
			for (local85 = local41 - 4; local85 <= local41 + 4; local85++) {
				for (@Pc(91) int local91 = local45 - 4; local91 <= local45 + 4; local91++) {
					@Pc(95) int local95 = Static240.anInt4414;
					if (local95 < 3 && Static34.method641(local85, local91)) {
						local95++;
					}
					@Pc(106) int local106 = 0;
					if (Static211.aClass234_Sub1_1.aByteArrayArrayArray18 != null && Static211.aClass234_Sub1_1.aByteArrayArrayArray18[local95] != null) {
						local106 = (Static211.aClass234_Sub1_1.aByteArrayArrayArray18[local95][local85][local91] & 0xFF) * 8;
					}
					if (Static310.aClass129Array5 != null && Static310.aClass129Array5[local95] != null) {
						@Pc(145) int local145 = local106 + local51 - Static310.aClass129Array5[local95].method6481(local91, local85);
						if (local53 < local145) {
							local53 = local145;
						}
					}
				}
			}
		}
		local85 = (local53 >> 2) * 1536;
		if (local85 > 786432) {
			local85 = 786432;
		}
		if (local85 < 262144) {
			local85 = 262144;
		}
		if (Static140.anInt2732 < local85) {
			Static140.anInt2732 += (local85 - Static140.anInt2732) / 24;
		} else if (Static140.anInt2732 > local85) {
			Static140.anInt2732 += (local85 - Static140.anInt2732) / 80;
			return;
		}
	}
}
