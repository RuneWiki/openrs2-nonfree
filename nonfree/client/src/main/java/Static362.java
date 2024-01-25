import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!sk", name = "xc", descriptor = "I")
	public static int anInt6210 = -1;

	@OriginalMember(owner = "client!sk", name = "zc", descriptor = "[I")
	public static final int[] anIntArray526 = new int[200];

	@OriginalMember(owner = "client!sk", name = "bd", descriptor = "Lclient!ar;")
	public static Class14 aClass14_42 = new Class14();

	@OriginalMember(owner = "client!sk", name = "rd", descriptor = "Z")
	public static boolean aBoolean434 = false;

	@OriginalMember(owner = "client!sk", name = "sd", descriptor = "Z")
	public static boolean aBoolean435 = false;

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
	public static void method4939() {
		Static66.anInt133 = 0;
		Static62.aClass218Array1 = new Class218[50];
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIII)I")
	public static int method4940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)I")
	public static int method4946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(III)Z")
	public static boolean method4949(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
