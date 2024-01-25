import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!r;IBII)V")
	public static void method3550(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.da(arg3, arg4, arg3 + arg0, arg2 + arg4);
		arg1.method6929(arg0, arg4, arg3, -16777216, arg2);
		if (Static271.anInt4778 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static226.anInt6315 / (float) Static226.anInt6314;
		@Pc(38) int local38 = arg0;
		@Pc(40) int local40 = arg2;
		if (local36 < 1.0F) {
			local40 = (int) ((float) arg0 * local36);
		} else {
			local38 = (int) ((float) arg2 / local36);
		}
		@Pc(67) int local67 = arg4 + (arg2 - local40) / 2;
		@Pc(76) int local76 = arg3 + (arg0 - local38) / 2;
		if (Static564.aClass22_35 == null || arg0 != Static564.aClass22_35.E() || arg2 != Static564.aClass22_35.u()) {
			Static226.method5083(Static226.anInt6317, Static226.anInt6315 + Static226.anInt6318, Static226.anInt6317 - -Static226.anInt6314, Static226.anInt6318, local76, local67, local76 + local38, local67 - -local40);
			Static226.method5088(arg1);
			Static564.aClass22_35 = arg1.method6918(local76, local67, local38, local40, false);
		}
		Static564.aClass22_35.method7662(local76, local67);
		@Pc(129) int local129 = local38 * Static408.anInt7103 / Static226.anInt6314;
		@Pc(135) int local135 = local40 * Static9.anInt128 / Static226.anInt6315;
		@Pc(143) int local143 = local76 + local38 * Static471.anInt8015 / Static226.anInt6314;
		@Pc(156) int local156 = local40 + local67 - Static71.anInt1416 * local40 / Static226.anInt6315 - local135;
		@Pc(168) int local168 = -1996554240;
		if (Static586.aClass195_4 == Static246.aClass195_2) {
			local168 = -1996488705;
		}
		arg1.J(local143, local156, local129, local135, local168, 1);
		arg1.method6958(local143, local156, local129, local135, local168, 0);
		if (Static95.anInt2005 <= 0) {
			return;
		}
		@Pc(203) int local203;
		if (Static520.anInt8816 > 50) {
			local203 = (100 - Static520.anInt8816) * 5;
		} else {
			local203 = Static520.anInt8816 * 5;
		}
		for (@Pc(214) Class1_Sub32 local214 = (Class1_Sub32) Static226.aClass353_46.method7677(); local214 != null; local214 = (Class1_Sub32) Static226.aClass353_46.method7687()) {
			@Pc(222) Class310 local222 = Static226.aClass273_2.method5840(local214.anInt5300);
			if (Static245.method3670(local222)) {
				@Pc(239) int local239;
				@Pc(252) int local252;
				if (local214.anInt5300 == Static355.anInt5919) {
					local239 = local38 * local214.anInt5301 / Static226.anInt6314 + local76;
					local252 = local67 + (Static226.anInt6315 - local214.anInt5298) * local40 / Static226.anInt6315;
					arg1.method6929(4, local252 - 2, local239 + -2, local203 << 24 | 0xFFFF00, 4);
				} else if (Static58.anInt1101 != -1 && Static58.anInt1101 == local222.anInt8130) {
					local239 = local76 + local38 * local214.anInt5301 / Static226.anInt6314;
					local252 = local67 + local40 * (Static226.anInt6315 - local214.anInt5298) / Static226.anInt6315;
					arg1.method6929(4, local252 - 2, local239 + -2, local203 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}
}
