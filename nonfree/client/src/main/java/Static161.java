import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray51;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)Z")
	public static boolean method2121(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static193.anInt3335; local1 < Static112.anInt1710; local1++) {
			@Pc(6) Class216[][] local6 = Static259.aClass216ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static99.anInt1331; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static166.anInt2722 + local9;
				@Pc(18) int local18 = Static166.anInt2722 - local9;
				if (local14 >= Static61.anInt7290 || local18 < Static9.anInt163) {
					for (@Pc(27) int local27 = -Static99.anInt1331; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static44.anInt638 + local27;
						@Pc(36) int local36 = Static44.anInt638 - local27;
						@Pc(48) Class216 local48;
						if (local14 >= Static61.anInt7290) {
							if (local32 >= Static260.anInt4567) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean508) {
									Static284.aBoolean432 = arg0;
									Static352.aClass12_1.method4091(local48);
									Static352.aClass12_1.method4085();
								}
							}
							if (local36 < Static267.anInt4664) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean508) {
									Static284.aBoolean432 = arg0;
									Static352.aClass12_1.method4091(local48);
									Static352.aClass12_1.method4085();
								}
							}
						}
						if (local18 < Static9.anInt163) {
							if (local32 >= Static260.anInt4567) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean508) {
									Static284.aBoolean432 = arg0;
									Static352.aClass12_1.method4091(local48);
									Static352.aClass12_1.method4085();
								}
							}
							if (local36 < Static267.anInt4664) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean508) {
									Static284.aBoolean432 = arg0;
									Static352.aClass12_1.method4091(local48);
									Static352.aClass12_1.method4085();
								}
							}
						}
						if (Static97.anInt1300 == 0) {
							if (Static358.aBoolean574) {
								Static352.aClass12_1.method4090(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Lclient!rb;")
	public static Class216 method2122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static259.aClass216ArrayArrayArray3[0][arg1][arg2] != null && Static259.aClass216ArrayArrayArray3[0][arg1][arg2].aClass216_1 != null;
			if (local28 && arg0 >= Static112.anInt1710 - 1) {
				return null;
			}
			Static74.method3130(arg0, arg1, arg2);
		}
		return Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
	}
}
