import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!rda", name = "s", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_153 = new Class239(28, 3);

	@OriginalMember(owner = "client!rda", name = "v", descriptor = "I")
	public static final int anInt7702 = 1405;

	@OriginalMember(owner = "client!rda", name = "y", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_213 = new Class202("Loading SW3D - ", "Lade SW3D - ", "Chargement SW3D - ", "Carregando SW3D - ");

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!qa;IIIII)V")
	public static void method6459(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg0.N(arg1, arg4, arg1 + arg2, arg4 + arg3);
		arg0.method6052(arg4, -16777216, arg1, arg3, arg2);
		if (Static111.anInt2224 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static201.anInt202 / (float) Static201.anInt201;
		@Pc(36) int local36 = arg2;
		@Pc(38) int local38 = arg3;
		if (local34 < 1.0F) {
			local38 = (int) (local34 * (float) arg2);
		} else {
			local36 = (int) ((float) arg3 / local34);
		}
		@Pc(70) int local70 = arg4 + (arg3 - local38) / 2;
		@Pc(79) int local79 = arg1 + (arg2 - local36) / 2;
		if (Static382.aClass35_27 == null || arg2 != Static382.aClass35_27.c() || arg3 != Static382.aClass35_27.la()) {
			Static201.method352(Static201.anInt205, Static201.anInt198 + Static201.anInt202, Static201.anInt205 + Static201.anInt201, Static201.anInt198, local79, local70, local79 + local36, local70 - -local38);
			Static201.method353(arg0);
			Static382.aClass35_27 = arg0.method6072(local79, local70, local36, local38, false);
		}
		Static382.aClass35_27.method7351(local79, local70);
		@Pc(131) int local131 = Static507.anInt2736 * local36 / Static201.anInt201;
		@Pc(137) int local137 = Static33.anInt601 * local38 / Static201.anInt202;
		@Pc(145) int local145 = local79 + Static15.anInt349 * local36 / Static201.anInt201;
		@Pc(158) int local158 = local38 + local70 - local137 - local38 * Static269.anInt4936 / Static201.anInt202;
		@Pc(160) int local160 = -1996554240;
		if (Static533.aClass212_4 == Static185.aClass212_1) {
			local160 = -1996488705;
		}
		arg0.f(local145, local158, local131, local137, local160, 1);
		arg0.method6060(local145, local158, local131, local137, local160, 0);
		if (Static277.anInt5015 <= 0) {
			return;
		}
		@Pc(196) int local196;
		if (Static533.anInt9264 > 50) {
			local196 = 500 - Static533.anInt9264 * 5;
		} else {
			local196 = Static533.anInt9264 * 5;
		}
		for (@Pc(207) Class2_Sub35 local207 = (Class2_Sub35) Static201.aClass249_3.method6527(); local207 != null; local207 = (Class2_Sub35) Static201.aClass249_3.method6525()) {
			@Pc(217) Class182 local217 = Static201.aClass56_2.method1680(local207.anInt6264);
			if (Static169.method2844(local217)) {
				@Pc(250) int local250;
				@Pc(262) int local262;
				if (Static276.anInt5003 == local207.anInt6264) {
					local250 = local79 + local207.anInt6261 * local36 / Static201.anInt201;
					local262 = local38 * (Static201.anInt202 - local207.anInt6260) / Static201.anInt202 + local70;
					arg0.method6052(local262 - 2, local196 << 24 | 0xFFFF00, local250 - 2, 4, 4);
				} else if (Static25.anInt1756 != -1 && Static25.anInt1756 == local217.anInt5322) {
					local250 = local79 + local36 * local207.anInt6261 / Static201.anInt201;
					local262 = (Static201.anInt202 - local207.anInt6260) * local38 / Static201.anInt202 + local70;
					arg0.method6052(local262 - 2, local196 << 24 | 0xFFFF00, local250 - 2, 4, 4);
				}
			}
		}
	}
}
