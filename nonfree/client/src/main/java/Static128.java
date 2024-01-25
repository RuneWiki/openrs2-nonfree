import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "Lclient!tj;")
	public static Class193 aClass193_44;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "[I")
	public static int[] anIntArray264;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "Lclient!cs;")
	public static final Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	public static int anInt3034 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)I")
	public static int method2640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (arg0 + local15) / arg1 - local15;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void method2641() {
		Static242.method5188(Static274.aClass47_9, (long) Static199.anInt4137);
		if (Static357.anInt6821 != -1) {
			Static125.method2597(Static357.anInt6821);
		}
		for (@Pc(19) int local19 = 0; local19 < Static67.anInt1778; local19++) {
			if (Static172.aBooleanArray19[local19]) {
				Static353.aBooleanArray12[local19] = true;
			}
			Static89.aBooleanArray9[local19] = Static172.aBooleanArray19[local19];
			Static172.aBooleanArray19[local19] = false;
		}
		Static226.anInt4584 = Static199.anInt4137;
		if (Static274.aClass47_9.method2712()) {
			Static121.aBoolean372 = true;
		}
		if (Static357.anInt6821 != -1) {
			Static67.anInt1778 = 0;
			Static282.method4194();
		}
		Static274.aClass47_9.method2722();
		Static75.method1747(Static65.anInt1680);
		Static218.anInt4454 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIBII)V")
	public static void method2642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg4; local3 <= arg0; local3++) {
			Static135.method2878(Static223.anIntArrayArray124[local3], arg2, arg3, arg1);
		}
	}
}
