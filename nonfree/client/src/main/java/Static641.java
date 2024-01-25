import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
	public static int anInt10380;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_61 = new Class357();

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "Lclient!dda;")
	public static final Class66 aClass66_10 = new Class66();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)I")
	public static int method8687() {
		@Pc(14) int local14 = Static481.aClass344_2.method8153();
		if (local14 < Static142.aClass344Array1.length - 1) {
			Static481.aClass344_2 = Static142.aClass344Array1[local14 + 1];
		}
		return 100;
	}
}
