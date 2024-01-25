import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "[Lclient!f;")
	public static Class73[] aClass73Array12;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
	public static int anInt8015;

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
	public static int anInt8016;

	@OriginalMember(owner = "client!rga", name = "g", descriptor = "Lclient!gh;")
	public static Class3_Sub22 aClass3_Sub22_2;

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "[I")
	public static final int[] anIntArray476 = new int[8];

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(II)Z")
	public static boolean method6311(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)V")
	public static void method6313() {
		if (Static123.aFloat75 < 1024.0F) {
			Static123.aFloat75 = 1024.0F;
		}
		if (Static123.aFloat75 > 3072.0F) {
			Static123.aFloat75 = 3072.0F;
		}
		while (Static209.aFloat229 >= 16384.0F) {
			Static209.aFloat229 -= 16384.0F;
		}
		while (Static209.aFloat229 < 0.0F) {
			Static209.aFloat229 += 16384.0F;
		}
		@Pc(41) int local41 = Static377.anInt6530 >> 9;
		@Pc(45) int local45 = Static262.anInt5037 >> 9;
		@Pc(55) int local55 = Static78.method3298(Static377.anInt6530, Static594.anInt10310, Static262.anInt5037);
		@Pc(57) int local57 = 0;
		@Pc(85) int local85;
		if (local41 > 3 && local45 > 3 && local41 < Static345.anInt6228 - 4 && local45 < Static535.anInt9341 - 4) {
			for (local85 = local41 - 4; local85 <= local41 + 4; local85++) {
				for (@Pc(91) int local91 = local45 - 4; local91 <= local45 + 4; local91++) {
					@Pc(95) int local95 = Static594.anInt10310;
					if (local95 < 3 && Static269.method4098(local85, local91)) {
						local95++;
					}
					@Pc(106) int local106 = 0;
					if (Static591.aClass268_Sub1_2.aByteArrayArrayArray17 != null && Static591.aClass268_Sub1_2.aByteArrayArrayArray17[local95] != null) {
						local106 = (Static591.aClass268_Sub1_2.aByteArrayArrayArray17[local95][local85][local91] & 0xFF) * 8;
					}
					if (Static256.aClass127Array3 != null && Static256.aClass127Array3[local95] != null) {
						@Pc(147) int local147 = local55 + local106 - Static256.aClass127Array3[local95].method7862(local91, local85);
						if (local57 < local147) {
							local57 = local147;
						}
					}
				}
			}
		}
		local85 = (local57 >> 2) * 1536;
		if (local85 > 786432) {
			local85 = 786432;
		}
		if (local85 < 262144) {
			local85 = 262144;
		}
		if (local85 > Static6.anInt46) {
			Static6.anInt46 += (local85 - Static6.anInt46) / 24;
		} else if (Static6.anInt46 > local85) {
			Static6.anInt46 += (local85 - Static6.anInt46) / 80;
			return;
		}
	}
}
