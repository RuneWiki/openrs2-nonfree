import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "[I")
	public static int[] anIntArray291;

	@OriginalMember(owner = "client!iaa", name = "o", descriptor = "Lclient!tba;")
	public static Class315 aClass315_11;

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "Lclient!us;")
	public static final Class344 aClass344_54 = new Class344(76, 7);

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
	public static int anInt5124 = 0;

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "I")
	public static int anInt5125 = 0;

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
	public static int anInt5126 = 0;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IB)V")
	public static void method4337(@OriginalArg(0) int arg0) {
		Static183.anInt4338 = arg0;
		@Pc(7) Class112 local7 = Static254.aClass112_31;
		synchronized (Static254.aClass112_31) {
			Static254.aClass112_31.method3638();
		}
		local7 = Static107.aClass112_13;
		synchronized (Static107.aClass112_13) {
			Static107.aClass112_13.method3638();
		}
	}
}
