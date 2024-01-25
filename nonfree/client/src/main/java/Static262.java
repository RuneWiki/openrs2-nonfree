import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_181 = new Class62("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_145 = new Class208(97, 8);

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!vf;")
	public static final Class238 aClass238_29 = new Class238();

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
	public static int anInt5009 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BII)V")
	public static void method4488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0 != Static391.anInt7118) {
			Static167.anIntArray267 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static167.anIntArray267[local9] = (local9 << 12) / arg0;
			}
			Static391.anInt7118 = arg0;
			Static87.anInt1877 = arg0 * 32;
			Static235.anInt4676 = arg0 - 1;
		}
		if (arg1 == Static299.anInt5583) {
			return;
		}
		if (arg1 == Static391.anInt7118) {
			Static229.anIntArray382 = Static167.anIntArray267;
		} else {
			Static229.anIntArray382 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static229.anIntArray382[local9] = (local9 << 12) / arg1;
			}
		}
		Static299.anInt5583 = arg1;
		Static67.anInt1510 = arg1 - 1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
	public static int method4492(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static322.method5191(arg1 + 91923, arg0 + 45365, 4) + (Static322.method5191(arg1 + 37821, arg0 + 10294, 2) - 128 >> 1) + (Static322.method5191(arg1, arg0, 1) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}
}
