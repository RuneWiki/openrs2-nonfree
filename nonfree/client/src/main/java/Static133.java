import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	public static int anInt2849;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_25 = new Class5(4);

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "[I")
	public static final int[] anIntArray235 = new int[6];

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!qt;B)I")
	public static int method2297(@OriginalArg(0) Class1_Sub3_Sub3_Sub2 arg0) {
		@Pc(13) Class47 local13 = arg0.aClass47_1;
		if (local13.anIntArray134 != null) {
			local13 = local13.method1296(Static369.aClass11_1);
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local13.anInt1566;
		@Pc(32) Class137 local32 = arg0.method4837();
		if (arg0.aBoolean429) {
			local28 = local13.anInt1605;
		} else if (local32.anInt4208 == arg0.anInt6080 || local32.anInt4213 == arg0.anInt6080 || local32.anInt4187 == arg0.anInt6080 || arg0.anInt6080 == local32.anInt4207) {
			local28 = local13.anInt1572;
		} else if (arg0.anInt6080 == local32.anInt4216 || local32.anInt4191 == arg0.anInt6080 || local32.anInt4193 == arg0.anInt6080 || arg0.anInt6080 == local32.anInt4188) {
			local28 = local13.anInt1597;
		}
		return local28;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)I")
	public static int method2298() {
		if (Static435.aClass68_14 == null) {
			if (!Static378.aBoolean462 && Static169.anInt3551 > 0) {
				if (Static93.aBoolean163 && Static19.aClass16_1.method580(81) && Static169.anInt3551 > 2) {
					return ((Class3_Sub38) Static374.aClass229_41.aClass3_233.aClass3_262.aClass3_262).anInt6524;
				}
				return ((Class3_Sub38) Static374.aClass229_41.aClass3_233.aClass3_262).anInt6524;
			}
			@Pc(46) int local46 = Static155.aClass74_1.method1870();
			@Pc(50) int local50 = Static155.aClass74_1.method1865();
			@Pc(52) int local52 = Static67.anInt1556;
			@Pc(54) int local54 = Static153.anInt3319;
			@Pc(56) int local56 = Static283.anInt5203;
			if (local46 > local52 && local46 < local56 + local52) {
				@Pc(74) int local74 = -1;
				@Pc(92) int local92;
				for (@Pc(76) int local76 = 0; local76 < Static169.anInt3551; local76++) {
					if (Static126.aBoolean275) {
						local92 = (Static169.anInt3551 - local76 - 1) * 16 + local54 + 33;
						if (local92 - 13 < local50 && local92 + 3 >= local50) {
							local74 = local76;
						}
					} else {
						local92 = (Static169.anInt3551 - local76 - 1) * 16 + local54 + 31;
						if (local92 - 13 < local50 && local50 <= local92 + 3) {
							local74 = local76;
						}
					}
				}
				if (local74 != -1) {
					local92 = 0;
					@Pc(161) Class162 local161 = new Class162(Static374.aClass229_41);
					for (@Pc(166) Class3_Sub38 local166 = (Class3_Sub38) local161.method3884(); local166 != null; local166 = (Class3_Sub38) local161.method3885()) {
						if (local92++ == local74) {
							return local166.anInt6524;
						}
					}
				}
			}
		}
		return -1;
	}
}
