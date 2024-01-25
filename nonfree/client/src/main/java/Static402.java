import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Lclient!r;")
	public static Class134 aClass134_11;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
	public static int anInt7038;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_211 = new Class235(26, -2);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public static void method5596() {
		@Pc(9) int local9 = (int) ((double) Static71.anInt1410 * 34.46D);
		local9 <<= 0x2;
		if (Static16.aClass134_1.method6936()) {
			local9 += 512;
		}
		Static16.aClass134_1.GA(200, local9);
	}
}
