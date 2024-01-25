import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "J")
	public static long aLong31;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_15 = new Class160(52, 6);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "[Lclient!pka;")
	public static final Class289[] aClass289Array1 = new Class289[4];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!o;I)I")
	public static int method669(@OriginalArg(0) Class260 arg0) {
		if (arg0 == Static466.aClass260_10) {
			return 6407;
		} else if (arg0 == Static641.aClass260_12) {
			return 6408;
		} else if (Static60.aClass260_3 == arg0) {
			return 6406;
		} else if (Static393.aClass260_8 == arg0) {
			return 6409;
		} else if (arg0 == Static608.aClass260_11) {
			return 6410;
		} else if (arg0 == Static646.aClass260_13) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	public static void method670() {
		if (Static625.method9474(Static387.anInt9114)) {
			if (Static277.aClass347_1.aClass278_2 == null) {
				Static160.method2323(5);
			} else {
				Static160.method2323(7);
			}
		} else if (Static387.anInt9114 == 5 || Static387.anInt9114 == 6) {
			Static160.method2323(3);
		} else if (Static387.anInt9114 == 13) {
			Static160.method2323(3);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 >= Static468.anInt7895 && Static382.anInt6719 >= arg0 && Static468.anInt7895 <= arg4 && arg4 <= Static382.anInt6719 && Static468.anInt7895 <= arg8 && arg8 <= Static382.anInt6719 && arg2 >= Static468.anInt7895 && arg2 <= Static382.anInt6719 && arg5 >= Static410.anInt7068 && arg5 <= Static281.anInt5188 && Static410.anInt7068 <= arg6 && Static281.anInt5188 >= arg6 && arg7 >= Static410.anInt7068 && Static281.anInt5188 >= arg7 && Static410.anInt7068 <= arg1 && arg1 <= Static281.anInt5188) {
			Static574.method8196(arg6, arg8, arg5, arg1, arg3, arg4, arg2, arg7, arg0);
		} else {
			Static304.method4922(arg1, arg4, arg6, arg5, arg2, arg7, arg8, arg0, arg3);
		}
	}
}
