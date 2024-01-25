import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BIIILclient!qa;I)V")
	public static void method4802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class128 arg3, @OriginalArg(5) int arg4) {
		arg3.pa(arg1, arg4, arg1 + arg2, arg4 + arg0);
		arg3.method3580(arg4, arg1, arg0, -16777216, arg2);
		if (Static37.anInt732 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static114.anInt6803 / (float) Static114.anInt6796;
		@Pc(38) int local38 = arg2;
		@Pc(40) int local40 = arg0;
		if (local36 < 1.0F) {
			local40 = (int) ((float) arg2 * local36);
		} else {
			local38 = (int) ((float) arg0 / local36);
		}
		@Pc(67) int local67 = arg1 + (arg2 - local38) / 2;
		@Pc(76) int local76 = arg4 + (arg0 - local40) / 2;
		if (Static312.aClass49_18 == null || Static312.aClass49_18.UA() != arg2 || arg0 != Static312.aClass49_18.qa()) {
			Static114.method5217(Static114.anInt6798, Static114.anInt6803 + Static114.anInt6800, Static114.anInt6796 + Static114.anInt6798, Static114.anInt6800, local67, local76, local67 + local38, local76 + local40);
			Static114.method5219(arg3);
			Static312.aClass49_18 = arg3.method3564(local67, local76, local38, local40, false);
		}
		Static312.aClass49_18.method5636(local67, local76);
		@Pc(127) int local127 = local38 * Static249.anInt4070 / Static114.anInt6796;
		@Pc(133) int local133 = local40 * Static197.anInt3151 / Static114.anInt6803;
		@Pc(151) int local151 = local38 * Static164.anInt2704 / Static114.anInt6796 + local67;
		@Pc(166) int local166 = local76 + local40 - local133 - local40 * Static95.anInt1676 / Static114.anInt6803;
		@Pc(168) int local168 = -1996554240;
		if (Static357.aClass6_4 == Static43.aClass6_3) {
			local168 = -1996488705;
		}
		arg3.NA(local151, local166, local127, local133, local168, 1);
		arg3.method3593(local151, local166, local127, local133, local168, 0);
		if (Static409.anInt6639 <= 0) {
			return;
		}
		@Pc(203) int local203;
		if (Static92.anInt1629 > 50) {
			local203 = (100 - Static92.anInt1629) * 5;
		} else {
			local203 = Static92.anInt1629 * 5;
		}
		for (@Pc(214) Class1_Sub7 local214 = (Class1_Sub7) Static114.aClass254_45.method5437(); local214 != null; local214 = (Class1_Sub7) Static114.aClass254_45.method5433()) {
			@Pc(222) Class56 local222 = Static114.aClass101_4.method2104(local214.anInt969);
			if (Static402.method5020(local222)) {
				@Pc(243) int local243;
				@Pc(254) int local254;
				if (local214.anInt969 == Static176.anInt2869) {
					local243 = local67 + local214.anInt973 * local38 / Static114.anInt6796;
					local254 = (Static114.anInt6803 - local214.anInt968) * local40 / Static114.anInt6803 + local76;
					arg3.method3580(local254 - 2, local243 + -2, 4, local203 << 24 | 0xFFFF00, 4);
				} else if (Static157.anInt2629 != -1 && local222.anInt1479 == Static157.anInt2629) {
					local243 = local214.anInt973 * local38 / Static114.anInt6796 + local67;
					local254 = (Static114.anInt6803 - local214.anInt968) * local40 / Static114.anInt6803 + local76;
					arg3.method3580(local254 - 2, local243 + -2, 4, local203 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}
}
