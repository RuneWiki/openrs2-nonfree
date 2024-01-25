import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "Lclient!mv;")
	public static Class219 aClass219_1;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "Lclient!ri;")
	public static Class288 aClass288_1;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method2976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static294.method4661(arg5, arg6, arg0)) {
			return false;
		}
		@Pc(15) int local15 = Static82.anIntArray139[1];
		@Pc(19) int local19 = Static82.anIntArray139[2];
		@Pc(23) int local23 = Static82.anIntArray139[0];
		if (!Static294.method4661(arg8, arg7, arg3)) {
			return false;
		}
		@Pc(35) int local35 = Static82.anIntArray139[0];
		@Pc(48) int local48 = Static82.anIntArray139[2];
		@Pc(52) int local52 = Static82.anIntArray139[1];
		if (Static294.method4661(arg2, arg1, arg4)) {
			@Pc(64) int local64 = Static82.anIntArray139[1];
			@Pc(68) int local68 = Static82.anIntArray139[0];
			@Pc(72) int local72 = Static82.anIntArray139[2];
			return Static21.method439(local68, local72, local64, local19, local48, local52, local35, local23, local15);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIBZ)V")
	public static void method2977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static260.anInt4932 == 0) {
			Static81.method1765(false);
		} else {
			Static278.anInt5103 = Static260.anInt4932;
			Static137.method2648(0);
		}
		Static321.anInt5794 = arg2;
		Static583.anInt9305 = arg0;
		Static489.aBoolean616 = arg3;
		Static284.method6627(arg1);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI[F)[F")
	public static float[] method2979(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static604.method5914(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
