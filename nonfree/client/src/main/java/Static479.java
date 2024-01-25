import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	public static void method6645() {
		Static345.anInt9498 = -1;
		Static258.anInt4724 = -1;
		Static71.anInt1363 = 0;
		Static473.anInt8115 = -1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public static void method6646() {
		if (Static110.aClass191_2 == null) {
			return;
		}
		if (Static110.aClass191_2.anInt5014 == 1) {
			Static110.aClass191_2 = null;
			return;
		}
		if (Static110.aClass191_2.anInt5014 == 2) {
			Static388.method5588(Static509.aClass198_5, Static552.aString72, 2);
			Static110.aClass191_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBII)Lclient!ls;")
	public static Class11_Sub1_Sub1_Sub3 method6647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class360 local11 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(22) Class11_Sub1_Sub1_Sub3 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class21 local27 = local11.aClass21_4; local27 != null; local27 = local27.aClass21_1) {
			@Pc(31) Class11_Sub1_Sub1 local31 = local27.aClass11_Sub1_Sub1_1;
			if (local31 instanceof Class11_Sub1_Sub1_Sub3) {
				@Pc(37) Class11_Sub1_Sub1_Sub3 local37 = (Class11_Sub1_Sub1_Sub3) local31;
				@Pc(45) int local45 = local37.method6058() * 256 - 4;
				@Pc(53) int local53 = local37.anInt8902 - local45 >> 9;
				@Pc(61) int local61 = local37.anInt8906 - local45 >> 9;
				@Pc(68) int local68 = local37.anInt8902 + local45 >> 9;
				@Pc(76) int local76 = local37.anInt8906 + local45 >> 9;
				if (local53 <= arg1 && local61 <= arg2 && arg1 <= local68 && local76 >= arg2) {
					@Pc(110) int local110 = (local76 + 1 - arg2) * (local68 + 1 + -arg1);
					if (local110 > local24) {
						local22 = local37;
						local24 = local110;
					}
				}
			}
		}
		return local22;
	}
}
