import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "[I")
	public static int[] anIntArray114;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IBLclient!sca;I)V")
	public static void method1425(@OriginalArg(0) int arg0, @OriginalArg(2) Class302 arg1, @OriginalArg(3) int arg2) {
		if (Static280.aBoolean380) {
			@Pc(17) Class223 local17 = Static541.anInt8105 == -1 ? null : Static26.aClass179_1.method5148(Static541.anInt8105);
			if (Static78.method1364(arg1).method8149() && (Static543.anInt9347 & 0x20) != 0 && (local17 == null || arg1.method7557(local17.anInt6887, Static541.anInt8105) != local17.anInt6887)) {
				Static542.method7932(Static173.aString38, arg1.anInt8834, false, 0L, Static1.anInt8260, false, arg1.anInt8877, 16, arg1.anInt8838, true, (long) (arg1.anInt8834 << 0 | arg1.anInt8838), Static391.aString87 + " -> " + arg1.aString103);
			}
		}
		@Pc(91) String local91;
		for (@Pc(82) int local82 = 9; local82 >= 5; local82--) {
			local91 = Static469.method7111(arg1, local82);
			if (local91 != null) {
				Static542.method7932(local91, arg1.anInt8834, false, (long) (local82 + 1), Static78.method1379(arg1, local82), false, arg1.anInt8877, 1003, arg1.anInt8838, true, (long) (arg1.anInt8838 | arg1.anInt8834 << 0), arg1.aString103);
			}
		}
		local91 = Static255.method4577(arg1);
		if (local91 != null) {
			Static542.method7932(local91, arg1.anInt8834, false, 0L, arg1.anInt8809, false, arg1.anInt8877, 47, arg1.anInt8838, true, (long) (arg1.anInt8834 << 0 | arg1.anInt8838), arg1.aString103);
		}
		for (@Pc(172) int local172 = 4; local172 >= 0; local172--) {
			@Pc(181) String local181 = Static469.method7111(arg1, local172);
			if (local181 != null) {
				Static542.method7932(local181, arg1.anInt8834, false, (long) (local172 + 1), Static78.method1379(arg1, local172), false, arg1.anInt8877, 44, arg1.anInt8838, true, (long) (arg1.anInt8834 << 0 | arg1.anInt8838), arg1.aString103);
			}
		}
		if (!Static78.method1364(arg1).method8145()) {
			return;
		}
		if (arg1.aString104 == null) {
			Static542.method7932(Static317.aClass192_9.method5299(Static307.anInt5931), arg1.anInt8834, false, 0L, -1, false, arg1.anInt8877, 15, arg1.anInt8838, true, (long) (arg1.anInt8838 | arg1.anInt8834 << 0), "");
		} else {
			Static542.method7932(arg1.aString104, arg1.anInt8834, false, 0L, -1, false, arg1.anInt8877, 15, arg1.anInt8838, true, (long) (arg1.anInt8838 | arg1.anInt8834 << 0), "");
		}
	}
}
