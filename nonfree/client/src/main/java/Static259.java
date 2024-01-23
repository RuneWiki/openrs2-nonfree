import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public static int anInt5400;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Lclient!ii;")
	public static Class79 aClass79_21 = new Class79(16);

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "Lclient!ec;")
	public static Class46 aClass46_34 = new Class46(64);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Lclient!jn;")
	public static Class71 method4332() {
		@Pc(27) Class71 local27;
		if (Static60.aBoolean106) {
			local27 = new Class71_Sub2(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[0], Static40.anIntArray59[0], Static30.anIntArray46[0], Static19.anIntArray30[0], Static273.aByteArrayArray115[0], Static187.anIntArray314);
		} else {
			local27 = new Class71_Sub1(Static148.anInt3175, Static260.anInt5414, Static262.anIntArray528[0], Static40.anIntArray59[0], Static30.anIntArray46[0], Static19.anIntArray30[0], Static273.aByteArrayArray115[0], Static187.anIntArray314);
		}
		Static171.method2953();
		return local27;
	}
}
