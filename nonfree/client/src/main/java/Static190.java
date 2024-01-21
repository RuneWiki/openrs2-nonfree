import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!sd;")
	public static Class60 aClass60_38;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public static int anInt4160;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2469 = Static118.method2249("Schlie-8en");

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
	public static final int[] anIntArray472 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2470 = Static118.method2249("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	public static int anInt4158 = -1;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "[I")
	public static final int[] anIntArray473 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIII)V")
	public static void method3140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static71.anInt1744 <= arg2 && arg4 <= Static23.anInt685 && Static206.anInt4385 <= arg1 && Static133.anInt3309 >= arg0) {
			Static37.method677(arg1, arg2, arg0, arg4, arg3);
		} else {
			Static125.method2381(arg3, arg0, arg1, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)J")
	public static synchronized long method3141() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static89.aLong68) {
			Static129.aLong102 += Static89.aLong68 - local5;
		}
		Static89.aLong68 = local5;
		return Static129.aLong102 + local5;
	}
}
