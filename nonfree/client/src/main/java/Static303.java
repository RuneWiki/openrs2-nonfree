import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!mba", name = "h", descriptor = "[Lclient!efa;")
	public static Class8_Sub1[] aClass8_Sub1Array1;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
	public static int anInt4926 = 0;

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_126 = new Class332(50);

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "Lclient!lp;")
	public static final Class188 aClass188_9 = new Class188(12, 0, 1, 0);

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "Lclient!nj;")
	public static final Class212 aClass212_22 = new Class212(64);

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4233(@OriginalArg(0) String arg0) {
		Static164.method2396("", 0, "", arg0, 0, "");
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BILclient!fca;I)V")
	public static void method4235(@OriginalArg(1) int arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) int arg2) {
		if (Static492.aBoolean560) {
			@Pc(13) Class343 local13 = Static217.anInt3703 == -1 ? null : Static112.aClass307_1.method6811(Static217.anInt3703);
			if (Static65.method862(arg1).method6472() && (Static217.anInt3710 & 0x20) != 0 && (local13 == null || arg1.method1970(Static217.anInt3703, local13.anInt9461) != local13.anInt9461)) {
				Static246.method3528(arg1.anInt2311, 0L, arg1.lb, Static516.aString112, Static324.anInt5830, 48, Static474.aString98 + " -> " + arg1.aString36, arg1.anInt2277, true, false);
			}
		}
		@Pc(86) String local86;
		for (@Pc(71) int local71 = 9; local71 >= 5; local71--) {
			local86 = Static392.method5805(arg1, local71);
			if (local86 != null) {
				Static246.method3528(arg1.anInt2311, (long) (local71 + 1), arg1.lb, local86, Static490.method6771(local71, arg1), 1009, arg1.aString36, arg1.anInt2277, true, false);
			}
		}
		local86 = Static463.method7851(arg1);
		if (local86 != null) {
			Static246.method3528(arg1.anInt2311, 0L, arg1.lb, local86, arg1.anInt2283, 4, arg1.aString36, arg1.anInt2277, true, false);
		}
		for (@Pc(147) int local147 = 4; local147 >= 0; local147--) {
			@Pc(154) String local154 = Static392.method5805(arg1, local147);
			if (local154 != null) {
				Static246.method3528(arg1.anInt2311, (long) (local147 + 1), arg1.lb, local154, Static490.method6771(local147, arg1), 22, arg1.aString36, arg1.anInt2277, true, false);
			}
		}
		if (!Static65.method862(arg1).method6474()) {
			return;
		}
		if (arg1.aString37 == null) {
			Static246.method3528(arg1.anInt2311, 0L, arg1.lb, Static141.aClass104_8.method2145(Static470.anInt7957), -1, 5, "", arg1.anInt2277, true, false);
		} else {
			Static246.method3528(arg1.anInt2311, 0L, arg1.lb, arg1.aString37, -1, 5, "", arg1.anInt2277, true, false);
		}
	}
}
