import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "Lclient!ib;")
	public static Class4_Sub3_Sub10 aClass4_Sub3_Sub10_4;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
	public static int[] anIntArray223;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	public static int anInt2522 = -2;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString150 = "Loaded interfaces";

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method1975() {
		Static241.aClass26_48.method515();
		Static6.aClass26_1.method515();
		Static25.aClass26_4.method515();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIII)V")
	public static void method1976(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg0) {
			Static99.method1656(Static220.anIntArrayArray36[arg3], arg2, arg0, arg1);
		} else {
			Static99.method1656(Static220.anIntArrayArray36[arg3], arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method1977() {
		for (@Pc(16) Class4_Sub3_Sub2 local16 = (Class4_Sub3_Sub2) Static10.aClass114_1.method2623(); local16 != null; local16 = (Class4_Sub3_Sub2) Static10.aClass114_1.method2629()) {
			@Pc(22) Class53_Sub6 local22 = local16.aClass53_Sub6_1;
			if (local22.anInt3717 != Static281.anInt5335 || Static50.anInt954 > local22.anInt3707) {
				local16.method4854();
			} else if (local22.anInt3719 <= Static50.anInt954) {
				if (local22.anInt3713 > 0) {
					@Pc(61) Class53_Sub1_Sub2 local61 = Static110.aClass53_Sub1_Sub2Array1[local22.anInt3713 - 1];
					if (local61 != null && local61.anInt3974 >= 0 && local61.anInt3974 < 13312 && local61.anInt4002 >= 0 && local61.anInt4002 < 13312) {
						local22.method3118(Static33.method522(local61.anInt4002, local61.anInt3974, local22.anInt3717) - local22.anInt3722, local61.anInt3974, Static50.anInt954, local61.anInt4002);
					}
				}
				if (local22.anInt3713 < 0) {
					@Pc(113) int local113 = -local22.anInt3713 - 1;
					@Pc(118) Class53_Sub1_Sub1 local118;
					if (Static273.anInt2022 == local113) {
						local118 = Static154.aClass53_Sub1_Sub1_2;
					} else {
						local118 = Static182.aClass53_Sub1_Sub1Array1[local113];
					}
					if (local118 != null && local118.anInt3974 >= 0 && local118.anInt3974 < 13312 && local118.anInt4002 >= 0 && local118.anInt4002 < 13312) {
						local22.method3118(Static33.method522(local118.anInt4002, local118.anInt3974, local22.anInt3717) - local22.anInt3722, local118.anInt3974, Static50.anInt954, local118.anInt4002);
					}
				}
				local22.method3116(Static211.anInt4156);
				Static40.method637(Static281.anInt5335, (int) local22.aDouble8, (int) local22.aDouble10, (int) local22.aDouble5, 60, local22, local22.anInt3723, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!oj;)V")
	public static void method1979(@OriginalArg(1) Class131 arg0) {
		Static62.aClass131_1 = arg0;
	}
}
