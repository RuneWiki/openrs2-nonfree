import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!tm;")
	public static final Class197 aClass197_21 = new Class197(8);

	@OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
	public static final int[] anIntArray413 = new int[50];

	@OriginalMember(owner = "client!of", name = "d", descriptor = "I")
	public static int anInt4605 = 2;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method4139() {
		if (Static36.aFloat5 < 1024.0F) {
			Static36.aFloat5 = 1024.0F;
		}
		if (Static36.aFloat5 > 3072.0F) {
			Static36.aFloat5 = 3072.0F;
		}
		while (Static75.aFloat13 >= 16384.0F) {
			Static75.aFloat13 -= 16384.0F;
		}
		while (Static75.aFloat13 < 0.0F) {
			Static75.aFloat13 += 16384.0F;
		}
		@Pc(41) int local41 = Static107.anInt2547 >> 7;
		@Pc(45) int local45 = Static87.anInt2179 >> 7;
		@Pc(51) int local51 = Static94.method2022(Static87.anInt2179, Static107.anInt2547, Static242.anInt6745);
		@Pc(53) int local53 = 0;
		@Pc(73) int local73;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local73 = local41 - 4; local73 <= local41 + 4; local73++) {
				for (@Pc(79) int local79 = local45 - 4; local79 <= local45 + 4; local79++) {
					@Pc(83) int local83 = Static242.anInt6745;
					if (local83 < 3 && Static187.method3663(local73, local79)) {
						local83++;
					}
					@Pc(94) int local94 = 0;
					if (Static37.aByteArrayArrayArray1 != null && Static37.aByteArrayArrayArray1[local83] != null) {
						local94 = (Static37.aByteArrayArrayArray1[local83][local73][local79] & 0xFF) * 8;
					}
					@Pc(125) int local125 = local94 + local51 - Static298.aClass53Array3[local83].method2785(local73, local79);
					if (local53 < local125) {
						local53 = local125;
					}
				}
			}
		}
		local73 = local53 * 1536;
		if (local73 > 786432) {
			local73 = 786432;
		}
		if (local73 < 262144) {
			local73 = 262144;
		}
		if (local73 > Static241.anInt4974) {
			Static241.anInt4974 += (local73 - Static241.anInt4974) / 24;
		} else if (local73 < Static241.anInt4974) {
			Static241.anInt4974 += (local73 - Static241.anInt4974) / 80;
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public static void method4140() {
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			Static72.aBooleanArray9[local15] = false;
		}
		Static309.anInt6065 = Static95.anInt2319;
		Static291.anInt5765 = Static18.anInt555;
		Static224.anInt4662 = -1;
		Static150.anInt3342 = Static320.anInt5326;
		Static44.anInt1404 = 0;
		Static264.anInt6560 = Static179.anInt3884;
		Static227.anInt4727 = -1;
		Static154.anInt3395 = Static5.anInt208;
		Static330.anInt6322 = 0;
		Static147.anInt3204 = 5;
		Static276.anInt5649 = Static64.anInt1797;
	}
}
