import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
	public static int anInt3792;

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
	public static int anInt3795;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "Lclient!jd;")
	public static final Class158 aClass158_4 = new Class158();

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "(B)V")
	public static void method3387() {
		@Pc(9) int local9 = (int) ((double) Static54.anInt1038 * 34.46D);
		local9 <<= 0x2;
		if (Static505.aClass45_11.method7435()) {
			local9 += 512;
		}
		Static505.aClass45_11.GA(200, local9);
	}
}
