import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
	public static int anInt6823;

	@OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
	public static int anInt6820 = 1;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
	public static int anInt6821 = 0;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(Z)I")
	public static int method5679() {
		if (Static240.aClass239_8 == null) {
			if (!Static250.aBoolean294 && Static151.anInt3129 > 0) {
				if (Static395.aBoolean453 && Static54.aClass187_1.method4602(81) && Static151.anInt3129 > 2) {
					return ((Class6_Sub40) Static292.aClass244_25.aClass6_220.aClass6_251.aClass6_251).anInt6723;
				}
				return ((Class6_Sub40) Static292.aClass244_25.aClass6_220.aClass6_251).anInt6723;
			}
			@Pc(46) int local46 = Static186.aClass50_1.method1436();
			@Pc(50) int local50 = Static186.aClass50_1.method1446();
			@Pc(52) int local52 = Static187.anInt3647;
			@Pc(54) int local54 = Static200.anInt3772;
			@Pc(56) int local56 = Static382.anInt4224;
			if (local46 > local52 && local52 + local56 > local46) {
				@Pc(71) int local71 = -1;
				@Pc(90) int local90;
				for (@Pc(73) int local73 = 0; local73 < Static151.anInt3129; local73++) {
					if (Static215.aBoolean261) {
						local90 = local54 + (Static151.anInt3129 - local73 - 1) * 16 + 33;
						if (local50 > local90 - 13 && local90 + 3 >= local50) {
							local71 = local73;
						}
					} else {
						local90 = (Static151.anInt3129 - local73 - 1) * 16 + local54 + 31;
						if (local50 > local90 - 13 && local50 <= local90 + 3) {
							local71 = local73;
						}
					}
				}
				if (local71 != -1) {
					local90 = 0;
					@Pc(153) Class256 local153 = new Class256(Static292.aClass244_25);
					for (@Pc(158) Class6_Sub40 local158 = (Class6_Sub40) local153.method6288(); local158 != null; local158 = (Class6_Sub40) local153.method6292()) {
						if (local90++ == local71) {
							return local158.anInt6723;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(III)V")
	public static void method5680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg1, 13);
		local8.method3088();
		local8.anInt3749 = arg0;
	}
}
