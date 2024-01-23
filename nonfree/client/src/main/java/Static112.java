import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "Lclient!i;")
	private static Class41 aClass41_777 = Static184.method2923(" seconds)3");

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "Lclient!i;")
	public static Class41 aClass41_776 = aClass41_777;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
	public static int anInt2697 = -1;

	@OriginalMember(owner = "client!lg", name = "P", descriptor = "Lclient!i;")
	public static Class41 aClass41_778 = Static184.method2923("Passwort: ");

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V")
	public static void method1912() {
		for (@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) Static113.aClass70_8.method2203(); local15 != null; local15 = (Class2_Sub21) Static113.aClass70_8.method2204()) {
			@Pc(20) int local20 = local15.anInt3435;
			if (Static187.method2974(local20)) {
				@Pc(26) boolean local26 = true;
				@Pc(30) Class80[] local30 = Static68.aClass80ArrayArray1[local20];
				for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
					if (local30[local32] != null) {
						local26 = local30[local32].aBoolean215;
						break;
					}
				}
				if (!local26) {
					@Pc(56) int local56 = (int) local15.aLong150;
					@Pc(60) Class80 local60 = Static212.method3256(local56);
					if (local60 != null) {
						Static176.method2833(local60);
					}
				}
			}
		}
	}
}
