import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static459 {

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "Lclient!nm;")
	public static Class164 aClass164_2;

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
	public static int anInt5916;

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "F")
	public static float aFloat93;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "Lclient!pw;")
	public static final Class194 aClass194_8 = new Class194();

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
	public static int anInt5917 = 503;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZF)F")
	public static float method4914(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)V")
	public static void method4919() {
		if (Static345.anInt5823 == 8) {
			Static393.method5432(4);
		} else if (Static345.anInt5823 == 4 || Static345.anInt5823 == 5) {
			Static393.method5432(2);
		} else if (Static345.anInt5823 == 11) {
			Static393.method5432(2);
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)Z")
	public static boolean method4921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[[I)V")
	public static void method4923(@OriginalArg(1) int[][] arg0) {
		Static296.anIntArrayArray42 = arg0;
	}
}
