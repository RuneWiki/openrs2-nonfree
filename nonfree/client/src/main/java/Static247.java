import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static247 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "[I")
	public static int[] anIntArray278;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	public static int anInt5090;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "Z")
	public static boolean aBoolean363;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_35 = new Class344(8, 0);

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_79 = new Class90(83, -2);

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Lclient!au;")
	public static final Class22 aClass22_27 = new Class22();

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
	public static void method3955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static214.anInt4500 == 1) {
			Static360.method5445(arg1, arg0, Static474.aClass4_Sub36_3);
		} else if (Static214.anInt4500 == 2) {
			Static355.method5359(arg1, arg0);
		}
		Static214.anInt4500 = 0;
		Static474.aClass4_Sub36_3 = null;
	}
}
