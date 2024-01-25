import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public static int anInt3018;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "[Lclient!l;")
	public static Class95[] aClass95Array6;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_46 = new Class146(50, 8);

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_47 = new Class15("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
	public static void method2300() {
		if (Static182.anInt3346 == -1) {
			return;
		}
		@Pc(15) int local15 = Static455.aClass48_1.method1138();
		@Pc(19) int local19 = Static455.aClass48_1.method1142();
		@Pc(24) Class4_Sub1 local24 = (Class4_Sub1) Static398.aClass244_36.method5263();
		if (local24 != null) {
			local15 = local24.method65();
			local19 = local24.method64();
		}
		Static172.method2391(local15, Static182.anInt3346, 0, 0, 0, 0, Static120.anInt2134, Static345.anInt5723, local19);
		if (Static123.aClass110_6 != null) {
			Static454.method6026(local19, local15);
		}
	}
}
