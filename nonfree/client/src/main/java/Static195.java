import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1429 = Static161.method2452("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1431 = Static161.method2452("Username: ");

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1430 = aClass20_1431;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
	public static volatile int anInt3810 = -1;

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
	public static int anInt3812 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method2892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static37.method1027(arg6)) {
			Static61.aClass69Array1 = null;
			Static192.method2858(arg1, arg0, Static155.aClass69ArrayArray1[arg6], arg7, arg2, -1, arg5, arg3, arg4);
			if (Static61.aClass69Array1 != null) {
				Static192.method2858(arg1, arg0, Static61.aClass69Array1, Static110.anInt2298, arg2, -1412584499, arg5, arg3, Static30.anInt578);
				Static61.aClass69Array1 = null;
			}
		} else if (arg3 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static185.aBooleanArray43[local19] = true;
			}
		} else {
			Static185.aBooleanArray43[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	public static void method2893() {
		Static205.aClass84_22.method2335();
	}
}
