import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
	public static int anInt503 = -1;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	public static final int anInt506 = 0;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_18 = new Class363(12, -1);

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZILclient!r;I)Lclient!la;")
	public static Class29 method320(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(9) Class40 local9 = Static589.method7958(arg1, arg2, arg0);
		return local9 == null ? null : local9.aClass29_4;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIB)V")
	public static void method321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = Static72.aClass2_Sub12_Sub1_1.anInt1918 * arg1 >> 8;
		if (arg0 == -1 && !Static242.aBoolean363) {
			Static291.method4373();
		} else if (arg0 != -1 && (arg0 != Static593.anInt9611 || !Static231.method3612()) && local6 != 0 && !Static242.aBoolean363) {
			Static188.method3183(local6, arg0, Static343.aClass259_88, arg2);
		}
		Static593.anInt9611 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	public static void method322() {
		for (@Pc(10) Class2_Sub3_Sub15 local10 = (Class2_Sub3_Sub15) Static230.aClass8_24.method210(); local10 != null; local10 = (Class2_Sub3_Sub15) Static230.aClass8_24.method218()) {
			@Pc(15) Class6_Sub1_Sub1_Sub2 local15 = local10.aClass6_Sub1_Sub1_Sub2_1;
			if (local15.anInt999 < Static412.anInt575) {
				local10.method7966();
				local15.method690();
			} else if (local15.anInt1003 <= Static412.anInt575) {
				if (local15.anInt1004 > 0) {
					@Pc(48) Class2_Sub32 local48 = (Class2_Sub32) Static544.aClass162_40.method3519((long) (local15.anInt1004 - 1));
					if (local48 != null) {
						@Pc(53) Class6_Sub1_Sub1_Sub1_Sub1 local53 = local48.aClass6_Sub1_Sub1_Sub1_Sub1_1;
						if (local53.anInt8761 >= 0 && Static188.anInt3850 * 512 > local53.anInt8761 && local53.anInt8764 >= 0 && Static49.anInt1174 * 512 > local53.anInt8764) {
							local15.method693(local53.anInt8764, local53.anInt8761, Static412.anInt575, Static524.method7217(local53.anInt8761, local15.aByte112, local53.anInt8764) - local15.anInt997);
						}
					}
				}
				if (local15.anInt1004 < 0) {
					@Pc(100) int local100 = -local15.anInt1004 - 1;
					@Pc(105) Class6_Sub1_Sub1_Sub1_Sub2 local105;
					if (local100 == Static222.anInt4184) {
						local105 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2;
					} else {
						local105 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local100];
					}
					if (local105 != null && local105.anInt8761 >= 0 && local105.anInt8761 < Static188.anInt3850 * 512 && local105.anInt8764 >= 0 && local105.anInt8764 < Static49.anInt1174 * 512) {
						local15.method693(local105.anInt8764, local105.anInt8761, Static412.anInt575, Static524.method7217(local105.anInt8761, local15.aByte112, local105.anInt8764) - local15.anInt997);
					}
				}
				local15.method692(Static367.anInt6534);
				Static516.method7139(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BFFF)I")
	public static int method324(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local12 < local26 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local12 < local35 && local35 > local26) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
