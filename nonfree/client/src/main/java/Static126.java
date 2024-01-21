import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[Lclient!ji;")
	public static Class5_Sub2_Sub10[] aClass5_Sub2_Sub10Array6;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_319 = Static161.method2452(" GMT");

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Lclient!qb;")
	public static final Class84 aClass84_7 = new Class84(50);

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_320 = Static161.method2452(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_321 = Static161.method2452("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
	public static void method793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = arg1 + 1;
		Static27.method409(arg3, arg4, Static9.anIntArrayArray1[arg1], arg0);
		@Pc(20) int local20 = arg2 - 1;
		Static27.method409(arg3, arg4, Static9.anIntArrayArray1[arg2], arg0);
		for (@Pc(25) int local25 = local11; local25 <= local20; local25++) {
			@Pc(31) int[] local31 = Static9.anIntArrayArray1[local25];
			local31[arg0] = local31[arg3] = arg4;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!mf;III)V")
	public static void method797(@OriginalArg(1) Class69 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static211.anInt4102 < 3) {
			((Class5_Sub2_Sub10_Sub1) Static16.aClass5_Sub2_Sub10_1).method2422(arg3, arg2, arg0.anInt2541, arg0.anInt2471, Static16.aClass5_Sub2_Sub10_1.anInt3212 / 2, Static16.aClass5_Sub2_Sub10_1.anInt3209 / 2, Static72.anInt1568, arg0.anIntArray280, arg0.anIntArray282);
		} else {
			Static42.method818(arg3, arg2, arg0.anIntArray280, arg0.anIntArray282);
		}
		Static75.aBooleanArray17[arg1] = true;
	}
}
