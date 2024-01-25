import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
	public static int anInt6574;

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "[Lclient!jm;")
	public static final Class125[] aClass125Array1 = new Class125[8];

	@OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
	public static int anInt6575 = 0;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)Lclient!cc;")
	public static Class3_Sub8 method5162() {
		if (Static210.aClass229_48 == null || Static158.aClass162_1 == null) {
			return null;
		}
		for (@Pc(19) Class3_Sub8 local19 = (Class3_Sub8) Static158.aClass162_1.method3885(); local19 != null; local19 = (Class3_Sub8) Static158.aClass162_1.method3885()) {
			@Pc(26) Class223 local26 = Static210.aClass61_4.method1426(local19.anInt1157);
			if (local26 != null && local26.aBoolean471 && local26.method5283(Static210.anInterface8_2)) {
				return local19;
			}
		}
		return null;
	}
}
