import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1484 = Static187.method3089(")4slr2)3ws?order=LPWM");

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1485 = Static187.method3089("l");

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	public static int anInt3129 = 0;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!ba;")
	public static Class11 aClass11_13 = null;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1486 = Static187.method3089("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	public static int anInt3133 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
	public static void method2313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg3 + 1;
		Static74.method1123(arg2, arg1, Static142.anIntArrayArray25[arg3], arg0);
		@Pc(15) int local15 = arg4 - 1;
		Static74.method1123(arg2, arg1, Static142.anIntArrayArray25[arg4], arg0);
		for (@Pc(25) int local25 = local6; local25 <= local15; local25++) {
			@Pc(31) int[] local31 = Static142.anIntArrayArray25[local25];
			local31[arg2] = local31[arg0] = arg1;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method2315() {
		if (Static159.aClass89_1 != null) {
			@Pc(11) Class89 local11 = Static159.aClass89_1;
			synchronized (Static159.aClass89_1) {
				Static159.aClass89_1 = null;
			}
		}
	}
}
