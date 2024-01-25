import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "[Lclient!ks;")
	public static final Class36[] aClass36Array1 = new Class36[128];

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_48 = new Class15("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "[Lclient!cm;")
	public static final Class4_Sub2_Sub6[] aClass4_Sub2_Sub6Array2 = new Class4_Sub2_Sub6[14];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public static void method2319() {
		if (Static439.aFloat99 < 1024.0F) {
			Static439.aFloat99 = 1024.0F;
		}
		if (Static439.aFloat99 > 3072.0F) {
			Static439.aFloat99 = 3072.0F;
		}
		while (Static109.aFloat75 >= 16384.0F) {
			Static109.aFloat75 -= 16384.0F;
		}
		while (Static109.aFloat75 < 0.0F) {
			Static109.aFloat75 += 16384.0F;
		}
		@Pc(41) int local41 = Static371.anInt5975 >> 7;
		@Pc(45) int local45 = Static196.anInt3536 >> 7;
		@Pc(51) int local51 = Static94.method4425(Static196.anInt3536, Static68.anInt1387, Static371.anInt5975);
		@Pc(53) int local53 = 0;
		@Pc(78) int local78;
		if (local41 > 3 && local45 > 3 && Static337.anInt5497 - 4 > local41 && Static282.anInt4644 - 4 > local45) {
			for (local78 = local41 - 4; local78 <= local41 + 4; local78++) {
				for (@Pc(84) int local84 = local45 - 4; local84 <= local45 + 4; local84++) {
					@Pc(88) int local88 = Static68.anInt1387;
					if (local88 < 3 && Static215.method4450(local78, local84)) {
						local88++;
					}
					@Pc(101) int local101 = 0;
					if (Static102.aClass26_Sub1_1.aByteArrayArrayArray10 != null && Static102.aClass26_Sub1_1.aByteArrayArrayArray10[local88] != null) {
						local101 = (Static102.aClass26_Sub1_1.aByteArrayArrayArray10[local88][local78][local84] & 0xFF) * 8;
					}
					@Pc(133) int local133 = local101 + local51 - Static278.aClass41Array3[local88].l(local78, local84);
					if (local53 < local133) {
						local53 = local133;
					}
				}
			}
		}
		local78 = (local53 >> 0) * 1536;
		if (local78 > 786432) {
			local78 = 786432;
		}
		if (local78 < 262144) {
			local78 = 262144;
		}
		if (local78 > Static345.anInt5731) {
			Static345.anInt5731 += (local78 - Static345.anInt5731) / 24;
		} else if (local78 < Static345.anInt5731) {
			Static345.anInt5731 += (local78 - Static345.anInt5731) / 80;
		}
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
	public static void method2320(@OriginalArg(0) int arg0) {
		Static322.anInt5236 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static81.anInt1606; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static18.anInt297; local6++) {
				if (Static432.aClass75ArrayArrayArray6[arg0][local3][local6] == null) {
					Static432.aClass75ArrayArrayArray6[arg0][local3][local6] = new Class75(arg0, local3, local6);
				}
			}
		}
	}
}
