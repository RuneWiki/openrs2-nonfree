import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "[I")
	public static final int[] anIntArray138 = new int[4096];

	@OriginalMember(owner = "client!em", name = "b", descriptor = "J")
	public static long aLong64 = -1L;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public static int anInt1698 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BZIII)Lclient!dp;")
	public static Class1_Sub15 method1642(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub15 local7 = new Class1_Sub15();
		local7.anInt1494 = arg2;
		local7.anInt1496 = arg1;
		Static281.aClass38_30.method1472(local7, (long) arg3);
		Static235.method4357(arg1);
		@Pc(26) Class112 local26 = Static188.method3536(arg3);
		if (local26 != null) {
			Static133.method2725(local26);
		}
		if (Static323.aClass112_13 != null) {
			Static133.method2725(Static323.aClass112_13);
			Static323.aClass112_13 = null;
		}
		Static146.method5910();
		if (local26 != null) {
			Static129.method2662(!arg0, local26);
		}
		if (!arg0) {
			Static302.method5245(arg1);
		}
		if (!arg0 && Static336.anInt6389 != -1) {
			Static127.method2641(1, Static336.anInt6389);
		}
		return local7;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)I")
	public static int method1643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static258.method1048(arg1 - 1, arg0 + -1) + Static258.method1048(arg1 + 1, arg0 - 1) + Static258.method1048(arg1 + -1, arg0 - -1) + Static258.method1048(arg1 - -1, arg0 + 1);
		@Pc(78) int local78 = Static258.method1048(arg1 - 1, arg0) + Static258.method1048(arg1 + 1, arg0) + Static258.method1048(arg1, arg0 - 1) + Static258.method1048(arg1, arg0 - -1);
		@Pc(83) int local83 = Static258.method1048(arg1, arg0);
		return local78 / 8 + local40 / 16 + local83 / 4;
	}
}
