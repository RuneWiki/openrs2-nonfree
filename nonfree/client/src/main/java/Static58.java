import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "Lclient!ida;")
	public static final Class148 aClass148_1 = new Class148();

	@OriginalMember(owner = "client!cca", name = "p", descriptor = "Lclient!qo;")
	public static final Class267 aClass267_2 = new Class267();

	@OriginalMember(owner = "client!cca", name = "q", descriptor = "I")
	public static int anInt1473 = 0;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIIII)V")
	public static void method1303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) Class332[] local7 = Static83.aClass332Array2;
		for (@Pc(14) int local14 = 0; local14 < local7.length; local14++) {
			@Pc(20) Class332 local20 = local7[local14];
			if (local20 != null && local20.anInt9341 == 2) {
				Static186.method3601(local20.anInt9338, arg3 >> 1, local20.anInt9339, local20.anInt9340 * 2, arg2 >> 1, local20.anInt9343);
				if (Static350.anIntArray431[0] > -1 && Static508.anInt8998 % 20 < 10) {
					Static447.aClass66Array10[local20.anInt9335].method8066(arg1 + Static350.anIntArray431[0] - 12, arg0 + -28 - -Static350.anIntArray431[1]);
				}
			}
		}
	}
}
