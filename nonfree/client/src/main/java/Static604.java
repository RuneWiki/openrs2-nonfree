import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!vg", name = "F", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_179 = new Class268(113, 5);

	@OriginalMember(owner = "client!vg", name = "R", descriptor = "Z")
	public static boolean aBoolean684 = false;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)V")
	public static void method8483() {
		Static224.aClass6_Sub3_Sub4_1.method4738();
		Static498.aClass6_Sub3_Sub4_3 = null;
		Static479.aClass353_88 = null;
		Static602.anInt10026 = 1;
	}

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "(I)V")
	public static void method8484() {
		if (Static4.aClass190_6 != null) {
			Static4.aClass190_6.method7507();
		}
		if (Static586.aClass190_7 != null) {
			Static586.aClass190_7.method7507();
		}
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(B)Lclient!ho;")
	public static Class6_Sub2_Sub9 method8485() {
		@Pc(16) Class6_Sub2_Sub9 local16 = (Class6_Sub2_Sub9) Static223.aClass286_4.method7242();
		if (local16 != null) {
			local16.method9043();
			local16.method8754();
			return local16;
		}
		do {
			local16 = (Class6_Sub2_Sub9) Static223.aClass286_3.method7242();
			if (local16 == null) {
				return null;
			}
			if (local16.method3724() > Static32.method595()) {
				return null;
			}
			local16.method9043();
			local16.method8754();
		} while ((local16.aLong272 & Long.MIN_VALUE) == 0L);
		return local16;
	}
}
