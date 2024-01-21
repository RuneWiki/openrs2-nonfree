import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!va", name = "M", descriptor = "I")
	public static int anInt2638;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "Lclient!na;")
	public static Class53 aClass53_1330 = Static109.method1737(" ");

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1331 = Static109.method1737("Hidden)2");

	@OriginalMember(owner = "client!va", name = "S", descriptor = "Lclient!na;")
	public static Class53 aClass53_1332 = Static109.method1737("mn");

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
	public static void method1832() {
		for (@Pc(6) Class3_Sub19 local6 = (Class3_Sub19) Static94.aClass11_10.method189(); local6 != null; local6 = (Class3_Sub19) Static94.aClass11_10.method187()) {
			if (local6.aClass3_Sub1_Sub2_1 != null) {
				local6.method1968();
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(Z)V")
	public static void method1834() {
		aClass53_1331 = null;
		aClass53_1332 = null;
		aClass53_1330 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZZ)I")
	public static int method1837() {
		return Static2.anInt63 + Static111.anInt2561;
	}
}
