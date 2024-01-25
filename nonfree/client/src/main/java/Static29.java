import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_11 = new Class177(77, -1);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ec;III)V")
	public static void method567(@OriginalArg(0) Class68 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static293.aBoolean300) {
			@Pc(188) Class13 local188 = Static181.anInt3937 == -1 ? null : Static53.aClass32_1.method724(Static181.anInt3937);
			if (!Static55.method1059(arg0).method4032() || (Static439.anInt7742 & 0x20) == 0) {
				return;
			}
			if (local188 == null || arg0.method1582(local188.anInt200, Static181.anInt3937) != local188.anInt200) {
				Static453.method6150(51, true, false, Static263.anInt5067, arg0.anInt2136, arg0.anInt2135, 0L, arg0.anInt2188, Static1.aString1, Static90.aString17 + " -> " + arg0.aString18);
			}
			return;
		}
		@Pc(24) String local24;
		for (@Pc(17) int local17 = 9; local17 >= 5; local17--) {
			local24 = Static376.method5222(local17, arg0);
			if (local24 != null) {
				Static453.method6150(1009, true, false, Static275.method4080(arg0, local17), arg0.anInt2136, arg0.anInt2135, (long) (local17 + 1), arg0.anInt2188, local24, arg0.aString18);
			}
		}
		local24 = Static153.method3991(arg0);
		if (local24 != null) {
			Static453.method6150(2, true, false, arg0.anInt2147, arg0.anInt2136, arg0.anInt2135, 0L, arg0.anInt2188, local24, arg0.aString18);
		}
		for (@Pc(87) int local87 = 4; local87 >= 0; local87--) {
			@Pc(94) String local94 = Static376.method5222(local87, arg0);
			if (local94 != null) {
				Static453.method6150(18, true, false, Static275.method4080(arg0, local87), arg0.anInt2136, arg0.anInt2135, (long) (local87 + 1), arg0.anInt2188, local94, arg0.aString18);
			}
		}
		if (!Static55.method1059(arg0).method4030()) {
			return;
		}
		if (arg0.aString20 == null) {
			Static453.method6150(47, true, false, -1, arg0.anInt2136, arg0.anInt2135, 0L, arg0.anInt2188, Static443.aClass158_211.method3594(Static365.anInt6682), "");
			return;
		}
		Static453.method6150(47, true, false, -1, arg0.anInt2136, arg0.anInt2135, 0L, arg0.anInt2188, arg0.aString20, "");
		return;
	}
}
